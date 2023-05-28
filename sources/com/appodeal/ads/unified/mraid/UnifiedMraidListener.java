package com.appodeal.ads.unified.mraid;

import android.content.Context;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.utils.C9646q;
import com.explorestack.iab.utils.IabClickCallback;

abstract class UnifiedMraidListener<UnifiedCallbackType extends UnifiedAdCallback> {
    public final UnifiedCallbackType callback;
    public C9646q clickHandler = new C9646q();
    public final UnifiedMraidNetworkParams mraidParams;

    public UnifiedMraidListener(UnifiedCallbackType unifiedcallbacktype, UnifiedMraidNetworkParams unifiedMraidNetworkParams) {
        this.callback = unifiedcallbacktype;
        this.mraidParams = unifiedMraidNetworkParams;
    }

    public void handleBrowserOpen(Context context, String str, final IabClickCallback iabClickCallback) {
        C9646q qVar = this.clickHandler;
        UnifiedMraidNetworkParams unifiedMraidNetworkParams = this.mraidParams;
        qVar.mo61099a(context, str, unifiedMraidNetworkParams.packageName, unifiedMraidNetworkParams.expiryTime, new C9646q.C9648b() {
            public void onHandleError() {
                iabClickCallback.clickHandleError();
            }

            public void onHandled() {
                iabClickCallback.clickHandled();
            }

            public void processClick(UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
                UnifiedMraidListener.this.callback.onAdClicked(unifiedAdCallbackClickTrackListener);
            }
        });
    }
}
