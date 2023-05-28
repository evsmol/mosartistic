package com.criteo.publisher.logging;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.logging.e */
/* compiled from: LogMessage.kt */
public final class C1193e {

    /* renamed from: a */
    private final int f3746a;

    /* renamed from: b */
    private final String f3747b;

    /* renamed from: c */
    private final Throwable f3748c;

    /* renamed from: d */
    private final String f3749d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1193e)) {
            return false;
        }
        C1193e eVar = (C1193e) obj;
        return this.f3746a == eVar.f3746a && Intrinsics.areEqual((Object) this.f3747b, (Object) eVar.f3747b) && Intrinsics.areEqual((Object) this.f3748c, (Object) eVar.f3748c) && Intrinsics.areEqual((Object) this.f3749d, (Object) eVar.f3749d);
    }

    public int hashCode() {
        int i = this.f3746a * 31;
        String str = this.f3747b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        Throwable th = this.f3748c;
        int hashCode2 = (hashCode + (th != null ? th.hashCode() : 0)) * 31;
        String str2 = this.f3749d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "LogMessage(level=" + this.f3746a + ", message=" + this.f3747b + ", throwable=" + this.f3748c + ", logId=" + this.f3749d + ")";
    }

    public C1193e(int i, String str, Throwable th, String str2) {
        this.f3746a = i;
        this.f3747b = str;
        this.f3748c = th;
        this.f3749d = str2;
    }

    /* renamed from: a */
    public final int mo3330a() {
        return this.f3746a;
    }

    /* renamed from: c */
    public final String mo3332c() {
        return this.f3747b;
    }

    /* renamed from: d */
    public final Throwable mo3333d() {
        return this.f3748c;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1193e(int i, String str, Throwable th, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 4 : i, str, (i2 & 4) != 0 ? null : th, (i2 & 8) != 0 ? null : str2);
    }

    /* renamed from: b */
    public final String mo3331b() {
        return this.f3749d;
    }
}
