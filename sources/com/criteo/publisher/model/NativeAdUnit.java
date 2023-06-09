package com.criteo.publisher.model;

import com.criteo.publisher.p074n0.C1288a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0016\u001a\u00020\u00138V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo38199d2 = {"Lcom/criteo/publisher/model/NativeAdUnit;", "Lcom/criteo/publisher/model/AdUnit;", "", "component1", "()Ljava/lang/String;", "adUnitId", "copy", "(Ljava/lang/String;)Lcom/criteo/publisher/model/NativeAdUnit;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAdUnitId", "Lcom/criteo/publisher/util/AdUnitType;", "getAdUnitType", "()Lcom/criteo/publisher/util/AdUnitType;", "adUnitType", "<init>", "(Ljava/lang/String;)V", "publisher-sdk_release"}, mo38200k = 1, mo38201mv = {1, 1, 15}, mo38202pn = "", mo38203xi = 0, mo38204xs = "")
/* compiled from: NativeAdUnit.kt */
public final class NativeAdUnit implements AdUnit {
    private final String adUnitId;

    public static /* synthetic */ NativeAdUnit copy$default(NativeAdUnit nativeAdUnit, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nativeAdUnit.getAdUnitId();
        }
        return nativeAdUnit.copy(str);
    }

    public final String component1() {
        return getAdUnitId();
    }

    public final NativeAdUnit copy(String str) {
        Intrinsics.checkParameterIsNotNull(str, "adUnitId");
        return new NativeAdUnit(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof NativeAdUnit) && Intrinsics.areEqual((Object) getAdUnitId(), (Object) ((NativeAdUnit) obj).getAdUnitId());
        }
        return true;
    }

    public int hashCode() {
        String adUnitId2 = getAdUnitId();
        if (adUnitId2 != null) {
            return adUnitId2.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "NativeAdUnit(adUnitId=" + getAdUnitId() + ")";
    }

    public NativeAdUnit(String str) {
        Intrinsics.checkParameterIsNotNull(str, "adUnitId");
        this.adUnitId = str;
    }

    public String getAdUnitId() {
        return this.adUnitId;
    }

    public C1288a getAdUnitType() {
        return C1288a.CRITEO_CUSTOM_NATIVE;
    }
}
