package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.google.protobuf.nano.p091ym.MessageNano;

/* renamed from: com.yandex.metrica.impl.ob.Q5 */
public class C2449Q5 {

    /* renamed from: a */
    private final C2366O5 f6517a;

    /* renamed from: b */
    private final C2418P5 f6518b;

    /* renamed from: c */
    private final C2476R7 f6519c;

    public C2449Q5(Context context, C2108I3 i3) {
        this(new C2418P5(), new C2366O5(), C3093ja.m9805a(context).mo17737a(i3), "event_hashes");
    }

    /* renamed from: a */
    public C2331N5 mo16510a() {
        try {
            byte[] a = this.f6519c.mo16553a("event_hashes");
            if (C1848A2.m6811a(a)) {
                C2366O5 o5 = this.f6517a;
                this.f6518b.getClass();
                return o5.toModel(new C1865Af());
            }
            C2366O5 o52 = this.f6517a;
            this.f6518b.getClass();
            return o52.toModel((C1865Af) MessageNano.mergeFrom(new C1865Af(), a));
        } catch (Throwable unused) {
            C2366O5 o53 = this.f6517a;
            this.f6518b.getClass();
            return o53.toModel(new C1865Af());
        }
    }

    C2449Q5(C2418P5 p5, C2366O5 o5, C2476R7 r7, String str) {
        this.f6518b = p5;
        this.f6517a = o5;
        this.f6519c = r7;
    }

    /* renamed from: a */
    public void mo16511a(C2331N5 n5) {
        C2476R7 r7 = this.f6519c;
        C2418P5 p5 = this.f6518b;
        C1865Af a = this.f6517a.fromModel(n5);
        p5.getClass();
        r7.mo16552a("event_hashes", MessageNano.toByteArray(a));
    }
}
