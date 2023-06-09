package com.ironsource.mediationsdk;

import com.appodeal.ads.modules.common.internal.Constants;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo38199d2 = {"Lcom/ironsource/mediationsdk/InitConfig;", "", "appKey", "", "userId", "(Ljava/lang/String;Ljava/lang/String;)V", "getAppKey", "()Ljava/lang/String;", "getUserId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "mediationsdk_release"}, mo38200k = 1, mo38201mv = {1, 4, 2})
/* renamed from: com.ironsource.mediationsdk.C */
public final class C4447C {

    /* renamed from: a */
    final String f10578a;

    /* renamed from: b */
    final String f10579b;

    public C4447C(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, Constants.APP_KEY);
        Intrinsics.checkNotNullParameter(str2, DataKeys.USER_ID);
        this.f10578a = str;
        this.f10579b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4447C)) {
            return false;
        }
        C4447C c = (C4447C) obj;
        return Intrinsics.areEqual((Object) this.f10578a, (Object) c.f10578a) && Intrinsics.areEqual((Object) this.f10579b, (Object) c.f10579b);
    }

    public final int hashCode() {
        String str = this.f10578a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f10579b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "InitConfig(appKey=" + this.f10578a + ", userId=" + this.f10579b + ")";
    }
}
