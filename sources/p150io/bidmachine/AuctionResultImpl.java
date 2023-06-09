package p150io.bidmachine;

import android.text.TextUtils;
import com.explorestack.protobuf.adcom.C1611Ad;
import com.explorestack.protobuf.openrtb.Response;
import java.util.HashMap;
import java.util.Map;
import p150io.bidmachine.models.AuctionResult;
import p150io.bidmachine.protobuf.AdExtension;
import p150io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;

/* renamed from: io.bidmachine.AuctionResultImpl */
final class AuctionResultImpl implements AuctionResult {
    private final String[] adDomains;
    private final String cid;
    private final CreativeFormat creativeFormat;
    private final String creativeId;
    private final Map<String, String> customParams;
    private final String deal;
    private final String demandSource;

    /* renamed from: id */
    private final String f12777id;
    private final String networkKey;
    private final Map<String, String> networkParams;
    private final double price;

    AuctionResultImpl(AdsType adsType, Response.Seatbid seatbid, Response.Seatbid.Bid bid, C1611Ad ad, NetworkAdapter networkAdapter, AdExtension adExtension) {
        this.f12777id = bid.getId();
        this.demandSource = seatbid.getSeat();
        this.price = bid.getPrice();
        this.deal = bid.getDeal();
        this.creativeId = ad.getId();
        this.cid = bid.getCid();
        if (ad.getAdomainCount() > 0) {
            this.adDomains = (String[]) ad.getAdomainList().toArray(new String[0]);
        } else {
            this.adDomains = null;
        }
        this.customParams = createCustomParams(adExtension);
        this.networkKey = networkAdapter.getKey();
        this.networkParams = createClientParams(adsType.obtainHeaderBiddingAd(ad));
        this.creativeFormat = identifyCreativeFormat(ad);
    }

    public String getId() {
        return this.f12777id;
    }

    public String getDemandSource() {
        return this.demandSource;
    }

    public double getPrice() {
        return this.price;
    }

    public String getDeal() {
        return this.deal;
    }

    public String getCreativeId() {
        return this.creativeId;
    }

    public String getCid() {
        return this.cid;
    }

    public String[] getAdDomains() {
        return this.adDomains;
    }

    public String getNetworkKey() {
        return this.networkKey;
    }

    public Map<String, String> getNetworkParams() {
        return this.networkParams;
    }

    public CreativeFormat getCreativeFormat() {
        return this.creativeFormat;
    }

    public Map<String, String> getCustomParams() {
        return this.customParams;
    }

    public String toString() {
        return String.format("id=%s, demandSource=%s, price=%s, creativeId=%s, cid=%s", new Object[]{this.f12777id, this.demandSource, Double.valueOf(this.price), this.creativeId, this.cid});
    }

    private Map<String, String> createCustomParams(AdExtension adExtension) {
        HashMap hashMap = new HashMap();
        if (adExtension != null) {
            try {
                hashMap.putAll(adExtension.getCustomParamsMap());
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public Map<String, String> createClientParams(HeaderBiddingAd headerBiddingAd) {
        Map<String, String> clientParamsMap;
        HashMap hashMap = new HashMap();
        if (!(headerBiddingAd == null || (clientParamsMap = headerBiddingAd.getClientParamsMap()) == null)) {
            hashMap.putAll(clientParamsMap);
        }
        return hashMap;
    }

    static CreativeFormat identifyCreativeFormat(C1611Ad ad) {
        if (ad.hasDisplay()) {
            C1611Ad.Display display = ad.getDisplay();
            if (display.hasBanner() || !TextUtils.isEmpty(display.getAdm())) {
                return CreativeFormat.Banner;
            }
            if (display.hasNative()) {
                return CreativeFormat.Native;
            }
            return null;
        } else if (ad.hasVideo()) {
            return CreativeFormat.Video;
        } else {
            return null;
        }
    }
}
