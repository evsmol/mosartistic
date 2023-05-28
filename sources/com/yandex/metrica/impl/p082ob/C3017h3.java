package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.MessageNano;
import com.yandex.metrica.billing_interface.C1800c;
import com.yandex.metrica.billing_interface.C1802d;
import com.yandex.metrica.billing_interface.C1803e;
import com.yandex.metrica.impl.p082ob.C3544uf;
import java.util.Currency;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.h3 */
public class C3017h3 {

    /* renamed from: a */
    private final C1802d f7946a;

    public C3017h3(C1802d dVar) {
        this.f7946a = dVar;
    }

    /* renamed from: a */
    public byte[] mo17648a() {
        String str;
        C1802d dVar = this.f7946a;
        C3544uf ufVar = new C3544uf();
        ufVar.f9206a = dVar.f4929c;
        ufVar.f9212g = dVar.f4930d;
        try {
            str = Currency.getInstance(dVar.f4931e).getCurrencyCode();
        } catch (Throwable unused) {
            str = "";
        }
        ufVar.f9208c = str.getBytes();
        ufVar.f9209d = dVar.f4928b.getBytes();
        C3544uf.C3545a aVar = new C3544uf.C3545a();
        aVar.f9218a = dVar.f4940n.getBytes();
        aVar.f9219b = dVar.f4936j.getBytes();
        ufVar.f9211f = aVar;
        int i = 1;
        ufVar.f9213h = true;
        ufVar.f9214i = 1;
        if (dVar.f4927a.ordinal() == 1) {
            i = 2;
        }
        ufVar.f9215j = i;
        C3544uf.C3549c cVar = new C3544uf.C3549c();
        cVar.f9229a = dVar.f4937k.getBytes();
        cVar.f9230b = TimeUnit.MILLISECONDS.toSeconds(dVar.f4938l);
        ufVar.f9216k = cVar;
        if (dVar.f4927a == C1803e.SUBS) {
            C3544uf.C3546b bVar = new C3544uf.C3546b();
            bVar.f9220a = dVar.f4939m;
            C1800c cVar2 = dVar.f4935i;
            if (cVar2 != null) {
                bVar.f9221b = m9666a(cVar2);
            }
            C3544uf.C3546b.C3547a aVar2 = new C3544uf.C3546b.C3547a();
            aVar2.f9223a = dVar.f4932f;
            C1800c cVar3 = dVar.f4933g;
            if (cVar3 != null) {
                aVar2.f9224b = m9666a(cVar3);
            }
            aVar2.f9225c = dVar.f4934h;
            bVar.f9222c = aVar2;
            ufVar.f9217l = bVar;
        }
        return MessageNano.toByteArray(ufVar);
    }

    /* renamed from: a */
    private C3544uf.C3546b.C3548b m9666a(C1800c cVar) {
        C3544uf.C3546b.C3548b bVar = new C3544uf.C3546b.C3548b();
        bVar.f9227a = cVar.f4919a;
        int ordinal = cVar.f4920b.ordinal();
        int i = 4;
        if (ordinal == 1) {
            i = 1;
        } else if (ordinal == 2) {
            i = 2;
        } else if (ordinal == 3) {
            i = 3;
        } else if (ordinal != 4) {
            i = 0;
        }
        bVar.f9228b = i;
        return bVar;
    }
}
