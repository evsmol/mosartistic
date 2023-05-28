package p150io.bidmachine.displays;

import com.explorestack.protobuf.adcom.C1611Ad;
import p150io.bidmachine.core.Logger;
import p150io.bidmachine.models.AdObjectParams;
import p150io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;
import p150io.bidmachine.unified.UnifiedMediationParams;

/* renamed from: io.bidmachine.displays.HeaderBiddingAdObjectParams */
class HeaderBiddingAdObjectParams extends AdObjectParams {
    /* access modifiers changed from: private */
    public final HeaderBiddingAd headerBiddingAd;
    private final HeaderBiddingUnifiedMediationParams mediationParams = new HeaderBiddingUnifiedMediationParams();

    public boolean isValid() {
        return true;
    }

    HeaderBiddingAdObjectParams(C1611Ad ad, HeaderBiddingAd headerBiddingAd2) {
        super(ad);
        this.headerBiddingAd = headerBiddingAd2;
    }

    /* access modifiers changed from: private */
    public String getParam(String str) {
        if (str == null) {
            return null;
        }
        String serverParamsOrDefault = this.headerBiddingAd.getServerParamsOrDefault(str, (String) null);
        return serverParamsOrDefault == null ? this.headerBiddingAd.getClientParamsOrDefault(str, (String) null) : serverParamsOrDefault;
    }

    public UnifiedMediationParams toMediationParams() {
        return this.mediationParams;
    }

    /* renamed from: io.bidmachine.displays.HeaderBiddingAdObjectParams$HeaderBiddingUnifiedMediationParams */
    private class HeaderBiddingUnifiedMediationParams extends UnifiedMediationParams {
        private HeaderBiddingUnifiedMediationParams() {
        }

        public String getString(String str, String str2) {
            String access$100 = HeaderBiddingAdObjectParams.this.getParam(str);
            return access$100 != null ? access$100 : str2;
        }

        public int getInt(String str, int i) {
            String access$100 = HeaderBiddingAdObjectParams.this.getParam(str);
            if (access$100 != null) {
                try {
                    return Integer.parseInt(access$100);
                } catch (Exception e) {
                    Logger.log((Throwable) e);
                }
            }
            return i;
        }

        public Integer getInteger(String str, Integer num) {
            String access$100 = HeaderBiddingAdObjectParams.this.getParam(str);
            if (access$100 != null) {
                try {
                    return Integer.valueOf(Integer.parseInt(access$100));
                } catch (Exception e) {
                    Logger.log((Throwable) e);
                }
            }
            return num;
        }

        public boolean getBool(String str, boolean z) {
            String access$100 = HeaderBiddingAdObjectParams.this.getParam(str);
            if (access$100 != null) {
                try {
                    return Boolean.parseBoolean(access$100);
                } catch (Exception e) {
                    Logger.log((Throwable) e);
                }
            }
            return z;
        }

        public double getDouble(String str, double d) {
            String access$100 = HeaderBiddingAdObjectParams.this.getParam(str);
            if (access$100 != null) {
                try {
                    return Double.parseDouble(access$100);
                } catch (Exception e) {
                    Logger.log((Throwable) e);
                }
            }
            return d;
        }

        public float getFloat(String str, float f) {
            String access$100 = HeaderBiddingAdObjectParams.this.getParam(str);
            if (access$100 != null) {
                try {
                    return Float.parseFloat(access$100);
                } catch (Exception e) {
                    Logger.log((Throwable) e);
                }
            }
            return f;
        }

        public boolean contains(String str) {
            return str != null && (HeaderBiddingAdObjectParams.this.headerBiddingAd.containsServerParams(str) || HeaderBiddingAdObjectParams.this.headerBiddingAd.containsClientParams(str));
        }
    }
}
