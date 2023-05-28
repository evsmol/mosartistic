package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bykv.p271vk.openvk.component.video.api.p291f.C10201b;
import com.bytedance.sdk.component.utils.C10638l;
import org.json.JSONObject;

public class AdSlot {
    public static final int TYPE_BANNER = 1;
    public static final int TYPE_BANNER_NATIVE = 10;
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_DRAW_FEED = 9;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_OPEN_AD = 3;
    public static final int TYPE_REWARD_VIDEO = 7;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f26572a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f26573b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f26574c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public float f26575d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public float f26576e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f26577f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f26578g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f26579h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f26580i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f26581j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f26582k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f26583l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f26584m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f26585n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f26586o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f26587p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String f26588q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public String f26589r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public String f26590s;

    /* renamed from: t */
    private int f26591t;

    /* renamed from: u */
    private int f26592u;

    /* renamed from: v */
    private int f26593v;

    /* renamed from: w */
    private int f26594w;

    private AdSlot() {
        this.f26584m = true;
        this.f26585n = false;
        this.f26591t = 0;
        this.f26592u = 0;
        this.f26593v = 0;
    }

    public static int getPosition(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return (i == 3 || i == 4 || i == 7 || i == 8) ? 5 : 3;
        }
        return 4;
    }

    public static AdSlot getSlot(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        try {
            int optInt = jSONObject.optInt("mImgAcceptedWidth", 640);
            int optInt2 = jSONObject.optInt("mImgAcceptedHeight", 320);
            double optDouble = jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
            double optDouble2 = jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
            builder.setCodeId(jSONObject.optString("mCodeId", (String) null));
            builder.setAdCount(jSONObject.optInt("mAdCount", 1));
            builder.setIsAutoPlay(jSONObject.optBoolean("mIsAutoPlay"));
            builder.setImageAcceptedSize(optInt, optInt2);
            builder.setExpressViewAcceptedSize(Double.valueOf(optDouble).floatValue(), Double.valueOf(optDouble2).floatValue());
            builder.setSupportDeepLink(jSONObject.optBoolean("mSupportDeepLink", false));
            builder.setRewardName(jSONObject.optString("mRewardName", (String) null));
            builder.setRewardAmount(jSONObject.optInt("mRewardAmount"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra", (String) null));
            builder.setUserID(jSONObject.optString("mUserID", (String) null));
            builder.setNativeAdType(jSONObject.optInt("mNativeAdType"));
            builder.isExpressAd(jSONObject.optBoolean("mIsExpressAd"));
            builder.withBid(jSONObject.optString("mBidAdm"));
        } catch (Exception unused) {
        }
        return builder.build();
    }

    public int getAdCount() {
        return this.f26577f;
    }

    public String getAdId() {
        return this.f26587p;
    }

    public String getBidAdm() {
        return this.f26586o;
    }

    public String getCodeId() {
        return this.f26572a;
    }

    public String getCreativeId() {
        return this.f26588q;
    }

    public int getDurationSlotType() {
        return this.f26594w;
    }

    public float getExpressViewAcceptedHeight() {
        return this.f26576e;
    }

    public float getExpressViewAcceptedWidth() {
        return this.f26575d;
    }

    public String getExt() {
        return this.f26589r;
    }

    public int getImgAcceptedHeight() {
        return this.f26574c;
    }

    public int getImgAcceptedWidth() {
        return this.f26573b;
    }

    public int getIsRotateBanner() {
        return this.f26591t;
    }

    public String getMediaExtra() {
        return this.f26581j;
    }

    public int getNativeAdType() {
        return this.f26583l;
    }

    @Deprecated
    public int getRewardAmount() {
        return this.f26580i;
    }

    @Deprecated
    public String getRewardName() {
        return this.f26579h;
    }

    public int getRotateOrder() {
        return this.f26593v;
    }

    public int getRotateTime() {
        return this.f26592u;
    }

    public String getUserData() {
        return this.f26590s;
    }

    public String getUserID() {
        return this.f26582k;
    }

    public boolean isAutoPlay() {
        return this.f26584m;
    }

    public boolean isExpressAd() {
        return this.f26585n;
    }

    public boolean isSupportDeepLink() {
        return this.f26578g;
    }

    public void setAdCount(int i) {
        this.f26577f = i;
    }

    public void setDurationSlotType(int i) {
        this.f26594w = i;
    }

    public void setIsRotateBanner(int i) {
        this.f26591t = i;
    }

    public void setNativeAdType(int i) {
        this.f26583l = i;
    }

    public void setRotateOrder(int i) {
        this.f26593v = i;
    }

    public void setRotateTime(int i) {
        this.f26592u = i;
    }

    public void setUserData(String str) {
        this.f26590s = str;
    }

    public JSONObject toJsonObj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.f26572a);
            jSONObject.put("mAdCount", this.f26577f);
            jSONObject.put("mIsAutoPlay", this.f26584m);
            jSONObject.put("mImgAcceptedWidth", this.f26573b);
            jSONObject.put("mImgAcceptedHeight", this.f26574c);
            jSONObject.put("mExpressViewAcceptedWidth", (double) this.f26575d);
            jSONObject.put("mExpressViewAcceptedHeight", (double) this.f26576e);
            jSONObject.put("mSupportDeepLink", this.f26578g);
            jSONObject.put("mRewardName", this.f26579h);
            jSONObject.put("mRewardAmount", this.f26580i);
            jSONObject.put("mMediaExtra", this.f26581j);
            jSONObject.put("mUserID", this.f26582k);
            jSONObject.put("mNativeAdType", this.f26583l);
            jSONObject.put("mIsExpressAd", this.f26585n);
            jSONObject.put("mAdId", this.f26587p);
            jSONObject.put("mCreativeId", this.f26588q);
            jSONObject.put("mExt", this.f26589r);
            jSONObject.put("mBidAdm", this.f26586o);
            jSONObject.put("mUserData", this.f26590s);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return "AdSlot{mCodeId='" + this.f26572a + '\'' + ", mImgAcceptedWidth=" + this.f26573b + ", mImgAcceptedHeight=" + this.f26574c + ", mExpressViewAcceptedWidth=" + this.f26575d + ", mExpressViewAcceptedHeight=" + this.f26576e + ", mAdCount=" + this.f26577f + ", mSupportDeepLink=" + this.f26578g + ", mRewardName='" + this.f26579h + '\'' + ", mRewardAmount=" + this.f26580i + ", mMediaExtra='" + this.f26581j + '\'' + ", mUserID='" + this.f26582k + '\'' + ", mNativeAdType=" + this.f26583l + ", mIsAutoPlay=" + this.f26584m + ", mAdId" + this.f26587p + ", mCreativeId" + this.f26588q + ", mExt" + this.f26589r + ", mUserData" + this.f26590s + '}';
    }

    public static class Builder {

        /* renamed from: a */
        private String f26595a;

        /* renamed from: b */
        private int f26596b = 640;

        /* renamed from: c */
        private int f26597c = 320;

        /* renamed from: d */
        private boolean f26598d = true;

        /* renamed from: e */
        private int f26599e = 1;

        /* renamed from: f */
        private String f26600f = "";

        /* renamed from: g */
        private int f26601g = 0;

        /* renamed from: h */
        private String f26602h;

        /* renamed from: i */
        private String f26603i = "defaultUser";

        /* renamed from: j */
        private int f26604j;

        /* renamed from: k */
        private float f26605k;

        /* renamed from: l */
        private float f26606l;

        /* renamed from: m */
        private boolean f26607m;

        /* renamed from: n */
        private String f26608n;

        /* renamed from: o */
        private String f26609o;

        /* renamed from: p */
        private String f26610p;

        /* renamed from: q */
        private String f26611q;

        /* renamed from: r */
        private String f26612r;

        /* renamed from: s */
        private boolean f26613s = true;

        @Deprecated
        public Builder setRewardAmount(int i) {
            return this;
        }

        @Deprecated
        public Builder setRewardName(String str) {
            return this;
        }

        @Deprecated
        public Builder setSupportDeepLink(boolean z) {
            return this;
        }

        public Builder setAdId(String str) {
            this.f26609o = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.f26610p = str;
            return this;
        }

        public Builder setExt(String str) {
            this.f26611q = str;
            return this;
        }

        public Builder setIsAutoPlay(boolean z) {
            this.f26613s = z;
            return this;
        }

        public Builder setCodeId(String str) {
            this.f26595a = str;
            return this;
        }

        public Builder isExpressAd(boolean z) {
            this.f26607m = z;
            return this;
        }

        public Builder setImageAcceptedSize(int i, int i2) {
            this.f26596b = i;
            this.f26597c = i2;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f, float f2) {
            this.f26605k = f;
            this.f26606l = f2;
            return this;
        }

        public Builder setAdCount(int i) {
            if (i <= 0) {
                i = 1;
                C10638l.m31238c(TTAdConstant.TAG, "setAdCount: adCount must greater than 0 ");
            }
            if (i > 20) {
                C10638l.m31238c(TTAdConstant.TAG, "setAdCount: adCount must less than or equal to 20 ");
                i = 20;
            }
            this.f26599e = i;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.f26602h = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.f26603i = str;
            return this;
        }

        public Builder setNativeAdType(int i) {
            this.f26604j = i;
            return this;
        }

        public Builder withBid(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            C10638l.m31238c("bidding", "AdSlot -> bidAdm=" + C10201b.m29279a(str));
            this.f26608n = str;
            return this;
        }

        public Builder setUserData(String str) {
            this.f26612r = str;
            return this;
        }

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            String unused = adSlot.f26572a = this.f26595a;
            int unused2 = adSlot.f26577f = this.f26599e;
            boolean unused3 = adSlot.f26578g = this.f26598d;
            int unused4 = adSlot.f26573b = this.f26596b;
            int unused5 = adSlot.f26574c = this.f26597c;
            float f = this.f26605k;
            if (f <= 0.0f) {
                float unused6 = adSlot.f26575d = (float) this.f26596b;
                float unused7 = adSlot.f26576e = (float) this.f26597c;
            } else {
                float unused8 = adSlot.f26575d = f;
                float unused9 = adSlot.f26576e = this.f26606l;
            }
            String unused10 = adSlot.f26579h = this.f26600f;
            int unused11 = adSlot.f26580i = this.f26601g;
            String unused12 = adSlot.f26581j = this.f26602h;
            String unused13 = adSlot.f26582k = this.f26603i;
            int unused14 = adSlot.f26583l = this.f26604j;
            boolean unused15 = adSlot.f26584m = this.f26613s;
            boolean unused16 = adSlot.f26585n = this.f26607m;
            String unused17 = adSlot.f26586o = this.f26608n;
            String unused18 = adSlot.f26587p = this.f26609o;
            String unused19 = adSlot.f26588q = this.f26610p;
            String unused20 = adSlot.f26589r = this.f26611q;
            String unused21 = adSlot.f26590s = this.f26612r;
            return adSlot;
        }
    }
}
