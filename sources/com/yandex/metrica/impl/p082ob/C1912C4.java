package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.yandex.metrica.coreutils.services.TimeProvider;
import com.yandex.metrica.impl.p082ob.C1976E4;
import com.yandex.metrica.impl.p082ob.C3398qf;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.C4 */
public class C1912C4 {

    /* renamed from: h */
    public static final Map<Integer, Integer> f5152h = Collections.unmodifiableMap(new C1913a());

    /* renamed from: a */
    private final C2851c0 f5153a;

    /* renamed from: b */
    private final C1943D4 f5154b;

    /* renamed from: c */
    private final C1976E4 f5155c;

    /* renamed from: d */
    private final C2876cn f5156d;

    /* renamed from: e */
    private final C2876cn f5157e;

    /* renamed from: f */
    private final TimeProvider f5158f;

    /* renamed from: g */
    private final C2364O3 f5159g;

    /* renamed from: com.yandex.metrica.impl.ob.C4$a */
    class C1913a extends HashMap<Integer, Integer> {
        C1913a() {
            put(Integer.valueOf(C2788a1.EVENT_TYPE_DIAGNOSTIC.mo17139b()), 22);
            put(Integer.valueOf(C2788a1.EVENT_TYPE_DIAGNOSTIC_STATBOX.mo17139b()), 23);
            put(Integer.valueOf(C2788a1.EVENT_TYPE_DIAGNOSTIC_DISABLE_STAT_SENDING.mo17139b()), 24);
            put(Integer.valueOf(C2788a1.EVENT_TYPE_APPMETRICA_DIAGNOSTICS.mo17139b()), 24);
        }
    }

    public C1912C4(C2851c0 c0Var, C1943D4 d4, C1976E4 e4, C2364O3 o3, C2876cn cnVar, C2876cn cnVar2, TimeProvider timeProvider) {
        this.f5153a = c0Var;
        this.f5154b = d4;
        this.f5155c = e4;
        this.f5159g = o3;
        this.f5157e = cnVar;
        this.f5156d = cnVar2;
        this.f5158f = timeProvider;
    }

    /* renamed from: a */
    public byte[] mo15582a() {
        C3398qf qfVar = new C3398qf();
        C3398qf.C3403d dVar = new C3398qf.C3403d();
        int i = 0;
        qfVar.f8765a = new C3398qf.C3403d[]{dVar};
        C1976E4.C1977a a = this.f5155c.mo15647a();
        dVar.f8799a = a.f5275a;
        C3398qf.C3403d.C3408b bVar = new C3398qf.C3403d.C3408b();
        dVar.f8800b = bVar;
        bVar.f8839c = 2;
        bVar.f8837a = new C3398qf.C3410f();
        C3398qf.C3410f fVar = dVar.f8800b.f8837a;
        long j = a.f5276b;
        fVar.f8845a = j;
        fVar.f8846b = ((GregorianCalendar) GregorianCalendar.getInstance()).getTimeZone().getOffset(j * 1000) / 1000;
        dVar.f8800b.f8838b = this.f5154b.mo15709k();
        C3398qf.C3403d.C3404a aVar = new C3398qf.C3403d.C3404a();
        dVar.f8801c = new C3398qf.C3403d.C3404a[]{aVar};
        aVar.f8803a = (long) a.f5277c;
        aVar.f8818p = (long) this.f5159g.mo16378a(this.f5153a.mo17346o());
        aVar.f8804b = this.f5158f.currentTimeSeconds() - a.f5276b;
        aVar.f8805c = f5152h.get(Integer.valueOf(this.f5153a.mo17346o())).intValue();
        if (!TextUtils.isEmpty(this.f5153a.mo17338g())) {
            aVar.f8806d = this.f5157e.mo16729a(this.f5153a.mo17338g());
        }
        if (!TextUtils.isEmpty(this.f5153a.mo17348q())) {
            String q = this.f5153a.mo17348q();
            String a2 = this.f5156d.mo16729a(q);
            if (!TextUtils.isEmpty(a2)) {
                aVar.f8807e = a2.getBytes();
            }
            int length = q.getBytes().length;
            byte[] bArr = aVar.f8807e;
            if (bArr != null) {
                i = bArr.length;
            }
            aVar.f8812j = length - i;
        }
        return MessageNano.toByteArray(qfVar);
    }
}
