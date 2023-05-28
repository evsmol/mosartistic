package com.yandex.metrica.impl.p082ob;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.yandex.metrica.impl.ob.w */
public class C3598w implements C3140l2 {

    /* renamed from: a */
    private final Set<Integer> f9355a = new HashSet();

    /* renamed from: b */
    private final Set<Integer> f9356b = new HashSet();

    /* renamed from: c */
    private volatile C3599a f9357c = C3599a.UNKNOWN;

    /* renamed from: d */
    private final Set<C3600b> f9358d = new CopyOnWriteArraySet();

    /* renamed from: com.yandex.metrica.impl.ob.w$a */
    public enum C3599a {
        UNKNOWN(DtbDeviceDataRetriever.ORIENTATION_UNKNOWN),
        BACKGROUND("background"),
        VISIBLE("visible");

        private C3599a(String str) {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.w$b */
    public interface C3600b {
        /* renamed from: a */
        void mo17481a(C3599a aVar);
    }

    /* renamed from: d */
    private void m10914d() {
        C3599a aVar = C3599a.UNKNOWN;
        if (!this.f9355a.isEmpty()) {
            aVar = C3599a.VISIBLE;
        } else if (!this.f9356b.isEmpty()) {
            aVar = C3599a.BACKGROUND;
        }
        if (this.f9357c != aVar) {
            this.f9357c = aVar;
            for (C3600b a : this.f9358d) {
                a.mo17481a(this.f9357c);
            }
        }
    }

    /* renamed from: a */
    public void mo15575a() {
        m10914d();
    }

    /* renamed from: b */
    public void mo15576b() {
        if (this.f9357c == C3599a.VISIBLE) {
            this.f9357c = C3599a.BACKGROUND;
        }
    }

    /* renamed from: c */
    public C3599a mo18348c() {
        return this.f9357c;
    }

    /* renamed from: a */
    public C3599a mo18345a(C3600b bVar) {
        this.f9358d.add(bVar);
        return this.f9357c;
    }

    /* renamed from: c */
    public void mo18349c(int i) {
        this.f9355a.add(Integer.valueOf(i));
        this.f9356b.remove(Integer.valueOf(i));
        m10914d();
    }

    /* renamed from: b */
    public void mo18347b(int i) {
        this.f9356b.add(Integer.valueOf(i));
        this.f9355a.remove(Integer.valueOf(i));
        m10914d();
    }

    /* renamed from: a */
    public void mo18346a(int i) {
        this.f9355a.remove(Integer.valueOf(i));
        m10914d();
    }
}
