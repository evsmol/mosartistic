package com.yandex.metrica.impl.p082ob;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.jb */
public final class C3094jb {

    /* renamed from: a */
    private final C2291M0 f8159a;

    /* renamed from: com.yandex.metrica.impl.ob.jb$a */
    public static final class C3095a {

        /* renamed from: a */
        private final boolean f8160a;

        /* renamed from: b */
        private final int f8161b;

        /* renamed from: c */
        private final int f8162c;

        /* renamed from: d */
        private final String f8163d;

        public C3095a() {
            this(false, 0, 0, (String) null, 15);
        }

        public C3095a(boolean z, int i, int i2, String str) {
            this.f8160a = z;
            this.f8161b = i;
            this.f8162c = i2;
            this.f8163d = str;
        }

        /* renamed from: a */
        public final String mo17755a() {
            return this.f8163d;
        }

        /* renamed from: b */
        public final int mo17756b() {
            return this.f8161b;
        }

        /* renamed from: c */
        public final int mo17757c() {
            return this.f8162c;
        }

        /* renamed from: d */
        public final boolean mo17758d() {
            return this.f8160a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3095a)) {
                return false;
            }
            C3095a aVar = (C3095a) obj;
            return this.f8160a == aVar.f8160a && this.f8161b == aVar.f8161b && this.f8162c == aVar.f8162c && Intrinsics.areEqual((Object) this.f8163d, (Object) aVar.f8163d);
        }

        public int hashCode() {
            boolean z = this.f8160a;
            if (z) {
                z = true;
            }
            int i = (((((z ? 1 : 0) * true) + this.f8161b) * 31) + this.f8162c) * 31;
            String str = this.f8163d;
            return i + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "RequestReport(success=" + this.f8160a + ", httpStatus=" + this.f8161b + ", size=" + this.f8162c + ", failureReason=" + this.f8163d + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C3095a(boolean z, int i, int i2, String str, int i3) {
            this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (String) null);
        }
    }

    public C3094jb(C2637Uh uh, C2291M0 m0) {
        this.f8159a = !uh.mo16846e() ? null : m0;
    }

    /* renamed from: a */
    public final void mo17754a(C3095a aVar) {
        C2291M0 m0 = this.f8159a;
        if (m0 != null) {
            Pair[] pairArr = new Pair[3];
            pairArr[0] = TuplesKt.m14544to("status", aVar.mo17758d() ? "OK" : "FAILED");
            pairArr[1] = TuplesKt.m14544to("http_status", Integer.valueOf(aVar.mo17756b()));
            pairArr[2] = TuplesKt.m14544to("size", Integer.valueOf(aVar.mo17757c()));
            Map mutableMapOf = MapsKt.mutableMapOf(pairArr);
            String a = aVar.mo17755a();
            if (a != null) {
                mutableMapOf.put(IronSourceConstants.EVENTS_ERROR_REASON, a);
            }
            m0.reportEvent("egress_status", (Map<String, Object>) MapsKt.toMap(mutableMapOf));
        }
    }
}
