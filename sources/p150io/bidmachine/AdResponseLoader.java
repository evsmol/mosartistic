package p150io.bidmachine;

import com.explorestack.protobuf.openrtb.Response;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import p150io.bidmachine.ApiRequest;
import p150io.bidmachine.ProtoTransformer;
import p150io.bidmachine.core.Logger;
import p150io.bidmachine.core.NetworkRequest;
import p150io.bidmachine.core.Utils;
import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.AdResponseLoader */
class AdResponseLoader {
    private final String TAG;
    private NetworkCallback callback;

    /* renamed from: id */
    private final String f12775id;
    private Listener listener;

    /* renamed from: io.bidmachine.AdResponseLoader$Listener */
    interface Listener {
        void onCancel();

        void onFail(BMError bMError);

        void onSuccess(AdResponse adResponse);
    }

    public AdResponseLoader() {
        this(UUID.randomUUID().toString());
    }

    public AdResponseLoader(String str) {
        this.TAG = Utils.generateTag("AdResponseLoader", this);
        this.f12775id = str;
    }

    /* access modifiers changed from: package-private */
    public String getId() {
        return this.f12775id;
    }

    public void load(AdRequestParameters adRequestParameters, List<NetworkAdUnit> list, ApiRequest.Builder<?, Response> builder, Listener listener2) {
        Logger.log(this.TAG, "load");
        NetworkCallback networkCallback = this.callback;
        if (networkCallback != null) {
            networkCallback.clear();
        }
        this.listener = listener2;
        NetworkCallback networkCallback2 = new NetworkCallback(this.f12775id, builder.getUrl(), adRequestParameters, list, listener2);
        this.callback = networkCallback2;
        builder.setCallback(networkCallback2);
        builder.setCancelCallback(this.callback);
        NetworkRequestManager.get().add(this.f12775id, builder.request());
    }

    public void cancel() {
        Logger.log(this.TAG, "cancel");
        this.listener = null;
        NetworkCallback networkCallback = this.callback;
        if (networkCallback != null) {
            networkCallback.clear();
            this.callback = null;
        }
    }

    /* renamed from: io.bidmachine.AdResponseLoader$NetworkCallback */
    static class NetworkCallback implements NetworkRequest.Callback<Response, BMError>, NetworkRequest.CancelCallback {
        private final AdRequestParameters adRequestParameters;

        /* renamed from: id */
        private final String f12776id;
        private final AtomicBoolean isCleared = new AtomicBoolean(false);
        private final AtomicBoolean isNetworkAuctionNotified = new AtomicBoolean(false);
        private final AtomicBoolean isSent = new AtomicBoolean(false);
        private final List<NetworkAdUnit> networkAdUnitList;
        private final String url;
        private final WeakReference<Listener> weakListener;

        public NetworkCallback(String str, String str2, AdRequestParameters adRequestParameters2, List<NetworkAdUnit> list, Listener listener) {
            this.f12776id = str;
            this.url = str2;
            this.adRequestParameters = adRequestParameters2;
            this.networkAdUnitList = list;
            this.weakListener = new WeakReference<>(listener);
        }

        public void onSuccess(Response response) {
            NetworkRequestManager.get().remove(this.f12776id);
            UrlProvider.setAuctionUrlFromSuccessRequest(this.url);
            ProtoTransformer.toAdResponse(this.adRequestParameters, this.networkAdUnitList, response, new ProtoTransformer.Listener<AdResponse>() {
                public void onSuccess(AdResponse adResponse) {
                    AdResponseStatus adResponseStatus;
                    if (NetworkCallback.this.cantSend()) {
                        adResponseStatus = AdResponseStatus.Idle;
                    } else {
                        adResponseStatus = AdResponseStatus.Busy;
                    }
                    adResponse.setStatus(adResponseStatus);
                    AdResponseManager.get().store(adResponse);
                    NetworkCallback.this.notifyNetworkAuctionResult(adResponse);
                    NetworkCallback.this.sendSuccess(adResponse);
                }

                public void onFail(BMError bMError) {
                    NetworkCallback.this.notifyNetworkAuctionResult((AdResponse) null);
                    NetworkCallback.this.sendFail(bMError);
                }
            });
        }

        public void onFail(BMError bMError) {
            NetworkRequestManager.get().remove(this.f12776id);
            notifyNetworkAuctionResult((AdResponse) null);
            AdResponse receive = AdResponseManager.get().receive(this.adRequestParameters);
            if (receive != null) {
                sendSuccess(receive);
            } else {
                sendFail(bMError);
            }
        }

        public void onCanceled() {
            NetworkRequestManager.get().remove(this.f12776id);
            notifyNetworkAuctionResult((AdResponse) null);
            sendCancel();
        }

        public void clear() {
            this.isCleared.set(true);
            this.weakListener.clear();
        }

        /* access modifiers changed from: private */
        public boolean cantSend() {
            return this.isCleared.get() || this.isSent.get() || this.weakListener.get() == null;
        }

        private Listener prepareForSend() {
            if (cantSend()) {
                return null;
            }
            this.isSent.set(true);
            return (Listener) this.weakListener.get();
        }

        /* access modifiers changed from: private */
        public void sendSuccess(AdResponse adResponse) {
            Listener prepareForSend = prepareForSend();
            if (prepareForSend != null) {
                prepareForSend.onSuccess(adResponse);
            } else {
                adResponse.setStatus(AdResponseStatus.Idle);
            }
            clear();
        }

        /* access modifiers changed from: private */
        public void sendFail(BMError bMError) {
            Listener prepareForSend = prepareForSend();
            if (prepareForSend != null) {
                prepareForSend.onFail(bMError);
            }
            clear();
        }

        private void sendCancel() {
            Listener prepareForSend = prepareForSend();
            if (prepareForSend != null) {
                prepareForSend.onCancel();
            }
            clear();
        }

        /* access modifiers changed from: private */
        public void notifyNetworkAuctionResult(AdResponse adResponse) {
            if (!this.isNetworkAuctionNotified.get()) {
                this.isNetworkAuctionNotified.set(true);
                NetworkAdUnit winnerNetworkAdUnit = adResponse != null ? adResponse.getWinnerNetworkAdUnit() : null;
                if (winnerNetworkAdUnit == null) {
                    for (NetworkAdUnit next : this.networkAdUnitList) {
                        try {
                            next.getNetworkAdapter().onLossAuction(next);
                        } catch (Throwable unused) {
                        }
                    }
                    return;
                }
                for (NetworkAdUnit next2 : this.networkAdUnitList) {
                    if (next2 == winnerNetworkAdUnit) {
                        try {
                            next2.getNetworkAdapter().onWinAuction(next2);
                        } catch (Throwable unused2) {
                        }
                    } else {
                        next2.getNetworkAdapter().onLossAuction(next2);
                    }
                }
            }
        }
    }
}
