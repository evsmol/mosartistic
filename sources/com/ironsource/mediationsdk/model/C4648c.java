package com.ironsource.mediationsdk.model;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0015\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u001f\u0010\t\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, mo38199d2 = {"Lcom/ironsource/mediationsdk/model/ApplicationExternalSettings;", "", "mediationTypes", "", "", "(Ljava/util/Map;)V", "getMediationTypes", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "mediationsdk_release"}, mo38200k = 1, mo38201mv = {1, 4, 2})
/* renamed from: com.ironsource.mediationsdk.model.c */
public final class C4648c {

    /* renamed from: a */
    public final Map<String, String> f11598a;

    public C4648c() {
        this((Map) null, 1);
    }

    public C4648c(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "mediationTypes");
        this.f11598a = map;
    }

    private /* synthetic */ C4648c(Map map, int i) {
        this(MapsKt.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C4648c) && Intrinsics.areEqual((Object) this.f11598a, (Object) ((C4648c) obj).f11598a);
        }
        return true;
    }

    public final int hashCode() {
        Map<String, String> map = this.f11598a;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ApplicationExternalSettings(mediationTypes=" + this.f11598a + ")";
    }
}
