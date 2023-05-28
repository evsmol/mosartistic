package com.appodeal.ads.modules.common.internal.adtype;

import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.LogConstants;
import kotlin.Metadata;

@Metadata(mo38197bv = {}, mo38198d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, mo38199d2 = {"Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "", "", "a", "I", "getCode", "()I", "code", "", "b", "Ljava/lang/String;", "getCodeName", "()Ljava/lang/String;", "codeName", "c", "getServerCodeName", "serverCodeName", "d", "getDisplayName", "displayName", "e", "getNotifyType", "notifyType", "Banner", "Mrec", "Interstitial", "Video", "Rewarded", "Native", "apd_internal"}, mo38200k = 1, mo38201mv = {1, 6, 0})
public enum AdType {
    Banner(4, "banner", Constants.BANNER, "Banner", 4),
    Mrec(256, Constants.PRETTY_MREC_NAME, Constants.MREC, LogConstants.KEY_MREC, 256),
    Interstitial(1, "interstitial", "banner", "Interstitial", 3),
    Video(2, "video", "video", "Video", 3),
    Rewarded(128, "rewarded_video", "rewarded_video", LogConstants.KEY_REWARDED_VIDEO, 128),
    Native(512, "native", "native", LogConstants.KEY_NATIVE, 512);
    

    /* renamed from: a */
    public final int f23346a;

    /* renamed from: b */
    public final String f23347b;

    /* renamed from: c */
    public final String f23348c;

    /* renamed from: d */
    public final String f23349d;

    /* renamed from: e */
    public final int f23350e;

    /* access modifiers changed from: public */
    AdType(int i, String str, String str2, String str3, int i2) {
        this.f23346a = i;
        this.f23347b = str;
        this.f23348c = str2;
        this.f23349d = str3;
        this.f23350e = i2;
    }

    public final int getCode() {
        return this.f23346a;
    }

    public final String getCodeName() {
        return this.f23347b;
    }

    public final String getDisplayName() {
        return this.f23349d;
    }

    public final int getNotifyType() {
        return this.f23350e;
    }

    public final String getServerCodeName() {
        return this.f23348c;
    }
}
