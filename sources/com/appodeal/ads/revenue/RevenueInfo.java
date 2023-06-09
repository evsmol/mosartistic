package com.appodeal.ads.revenue;

import com.appodeal.ads.AppodealNetworks;
import com.google.android.gms.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo38197bv = {}, mo38198d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b;\u0010<J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003JO\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0015\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010\u001cR\u001a\u0010/\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b-\u0010\u001a\u001a\u0004\b.\u0010\u001cR\u0017\u00105\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u00108\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\u001a\u001a\u0004\b7\u0010\u001cR\u0011\u0010:\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b9\u0010\u001c¨\u0006="}, mo38199d2 = {"Lcom/appodeal/ads/revenue/RevenueInfo;", "", "", "component1", "component2", "component3", "component4", "", "component5", "", "component6", "component7", "networkName", "demandSource", "adUnitName", "placement", "revenue", "adType", "adTypeString", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getNetworkName", "()Ljava/lang/String;", "b", "getDemandSource", "c", "getAdUnitName", "d", "getPlacement", "e", "D", "getRevenue", "()D", "f", "I", "getAdType", "()I", "g", "getAdTypeString", "h", "getPlatform", "platform", "Lcom/appodeal/ads/revenue/RevenueCurrency;", "i", "Lcom/appodeal/ads/revenue/RevenueCurrency;", "getRevenueCurrency", "()Lcom/appodeal/ads/revenue/RevenueCurrency;", "revenueCurrency", "j", "getCurrency", "currency", "getRevenuePrecision", "revenuePrecision", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/String;)V", "apd_public"}, mo38200k = 1, mo38201mv = {1, 6, 0})
public final class RevenueInfo {

    /* renamed from: a */
    public final String f24014a;

    /* renamed from: b */
    public final String f24015b;

    /* renamed from: c */
    public final String f24016c;

    /* renamed from: d */
    public final String f24017d;

    /* renamed from: e */
    public final double f24018e;

    /* renamed from: f */
    public final int f24019f;

    /* renamed from: g */
    public final String f24020g;

    /* renamed from: h */
    public final String f24021h = "Appodeal";

    /* renamed from: i */
    public final RevenueCurrency f24022i;

    /* renamed from: j */
    public final String f24023j;

    public RevenueInfo(String str, String str2, String str3, String str4, double d, int i, String str5) {
        Intrinsics.checkNotNullParameter(str, "networkName");
        Intrinsics.checkNotNullParameter(str2, "demandSource");
        Intrinsics.checkNotNullParameter(str3, "adUnitName");
        Intrinsics.checkNotNullParameter(str4, IronSourceConstants.EVENTS_PLACEMENT_NAME);
        Intrinsics.checkNotNullParameter(str5, "adTypeString");
        this.f24014a = str;
        this.f24015b = str2;
        this.f24016c = str3;
        this.f24017d = str4;
        this.f24018e = d;
        this.f24019f = i;
        this.f24020g = str5;
        RevenueCurrency revenueCurrency = RevenueCurrency.USD;
        this.f24022i = revenueCurrency;
        this.f24023j = revenueCurrency.getStringValue();
    }

    public static /* synthetic */ RevenueInfo copy$default(RevenueInfo revenueInfo, String str, String str2, String str3, String str4, double d, int i, String str5, int i2, Object obj) {
        RevenueInfo revenueInfo2 = revenueInfo;
        return revenueInfo.copy((i2 & 1) != 0 ? revenueInfo2.f24014a : str, (i2 & 2) != 0 ? revenueInfo2.f24015b : str2, (i2 & 4) != 0 ? revenueInfo2.f24016c : str3, (i2 & 8) != 0 ? revenueInfo2.f24017d : str4, (i2 & 16) != 0 ? revenueInfo2.f24018e : d, (i2 & 32) != 0 ? revenueInfo2.f24019f : i, (i2 & 64) != 0 ? revenueInfo2.f24020g : str5);
    }

    public final String component1() {
        return this.f24014a;
    }

    public final String component2() {
        return this.f24015b;
    }

    public final String component3() {
        return this.f24016c;
    }

    public final String component4() {
        return this.f24017d;
    }

    public final double component5() {
        return this.f24018e;
    }

    public final int component6() {
        return this.f24019f;
    }

    public final String component7() {
        return this.f24020g;
    }

    public final RevenueInfo copy(String str, String str2, String str3, String str4, double d, int i, String str5) {
        Intrinsics.checkNotNullParameter(str, "networkName");
        Intrinsics.checkNotNullParameter(str2, "demandSource");
        Intrinsics.checkNotNullParameter(str3, "adUnitName");
        Intrinsics.checkNotNullParameter(str4, IronSourceConstants.EVENTS_PLACEMENT_NAME);
        String str6 = str5;
        Intrinsics.checkNotNullParameter(str6, "adTypeString");
        return new RevenueInfo(str, str2, str3, str4, d, i, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RevenueInfo)) {
            return false;
        }
        RevenueInfo revenueInfo = (RevenueInfo) obj;
        return Intrinsics.areEqual((Object) this.f24014a, (Object) revenueInfo.f24014a) && Intrinsics.areEqual((Object) this.f24015b, (Object) revenueInfo.f24015b) && Intrinsics.areEqual((Object) this.f24016c, (Object) revenueInfo.f24016c) && Intrinsics.areEqual((Object) this.f24017d, (Object) revenueInfo.f24017d) && Intrinsics.areEqual((Object) Double.valueOf(this.f24018e), (Object) Double.valueOf(revenueInfo.f24018e)) && this.f24019f == revenueInfo.f24019f && Intrinsics.areEqual((Object) this.f24020g, (Object) revenueInfo.f24020g);
    }

    public final int getAdType() {
        return this.f24019f;
    }

    public final String getAdTypeString() {
        return this.f24020g;
    }

    public final String getAdUnitName() {
        return this.f24016c;
    }

    public final String getCurrency() {
        return this.f24023j;
    }

    public final String getDemandSource() {
        return this.f24015b;
    }

    public final String getNetworkName() {
        return this.f24014a;
    }

    public final String getPlacement() {
        return this.f24017d;
    }

    public final String getPlatform() {
        return this.f24021h;
    }

    public final double getRevenue() {
        return this.f24018e;
    }

    public final RevenueCurrency getRevenueCurrency() {
        return this.f24022i;
    }

    public final String getRevenuePrecision() {
        return Intrinsics.areEqual((Object) this.f24014a, (Object) AppodealNetworks.BIDMACHINE) ? "exact" : (Intrinsics.areEqual((Object) this.f24014a, (Object) "mraid") || Intrinsics.areEqual((Object) this.f24014a, (Object) "vast") || Intrinsics.areEqual((Object) this.f24014a, (Object) "nast") || Intrinsics.areEqual((Object) this.f24014a, (Object) "appodeal")) ? "publisher_defined" : this.f24018e > 0.0d ? "estimated" : AdError.UNDEFINED_DOMAIN;
    }

    public int hashCode() {
        int hashCode = this.f24015b.hashCode();
        int hashCode2 = this.f24016c.hashCode();
        int hashCode3 = this.f24017d.hashCode();
        int hashCode4 = Double.doubleToLongBits(this.f24018e);
        int i = this.f24019f;
        return this.f24020g.hashCode() + ((i + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f24014a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "RevenueInfo(networkName=" + this.f24014a + ", demandSource=" + this.f24015b + ", adUnitName=" + this.f24016c + ", placement=" + this.f24017d + ", revenue=" + this.f24018e + ", adType=" + this.f24019f + ", adTypeString=" + this.f24020g + ')';
    }
}
