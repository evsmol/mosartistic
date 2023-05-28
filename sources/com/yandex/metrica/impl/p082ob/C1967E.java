package com.yandex.metrica.impl.p082ob;

import android.content.Intent;
import com.applovin.sdk.AppLovinEventTypes;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.E */
public class C1967E {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ICommonExecutor f5256a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile C1969b f5257b;

    /* renamed from: c */
    private final List<C1971c> f5258c = new ArrayList();

    /* renamed from: d */
    private final C3240mm<Intent> f5259d;

    /* renamed from: com.yandex.metrica.impl.ob.E$a */
    class C1968a implements C3240mm<Intent> {
        C1968a() {
        }

        /* renamed from: b */
        public void mo15447b(Object obj) {
            C1969b.C1970a aVar;
            Intent intent = (Intent) obj;
            C1969b a = C1967E.this.f5257b;
            if (a == null) {
                aVar = null;
            } else {
                aVar = a.f5262b;
            }
            C1969b a2 = C1967E.this.m7041a(intent);
            C1969b unused = C1967E.this.f5257b = a2;
            if (aVar != a2.f5262b) {
                C1967E.this.f5256a.execute(new C1935D(this, a2));
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.E$b */
    public static class C1969b {

        /* renamed from: a */
        public final Integer f5261a;

        /* renamed from: b */
        public final C1970a f5262b;

        /* renamed from: com.yandex.metrica.impl.ob.E$b$a */
        public enum C1970a {
            UNKNOWN(-1),
            NONE(0),
            USB(1),
            WIRELESS(2),
            AC(3);
            

            /* renamed from: a */
            private final int f5269a;

            private C1970a(int i) {
                this.f5269a = i;
            }

            /* renamed from: a */
            public int mo15643a() {
                return this.f5269a;
            }

            /* renamed from: a */
            public static C1970a m7051a(Integer num) {
                if (num != null) {
                    C1970a[] values = values();
                    for (int i = 0; i < 5; i++) {
                        C1970a aVar = values[i];
                        if (aVar.f5269a == num.intValue()) {
                            return aVar;
                        }
                    }
                }
                return UNKNOWN;
            }
        }

        public C1969b(Integer num, C1970a aVar) {
            this.f5261a = num;
            this.f5262b = aVar;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.E$c */
    public interface C1971c {
        /* renamed from: a */
        void mo15644a(C1969b.C1970a aVar);
    }

    public C1967E(ICommonExecutor iCommonExecutor, C1906C c) {
        C1968a aVar = new C1968a();
        this.f5259d = aVar;
        this.f5256a = iCommonExecutor;
        this.f5257b = m7041a(c.mo15577c(aVar));
    }

    /* renamed from: b */
    public C1969b.C1970a mo15642b() {
        C1969b bVar = this.f5257b;
        return bVar == null ? C1969b.C1970a.UNKNOWN : bVar.f5262b;
    }

    /* renamed from: a */
    public Integer mo15640a() {
        C1969b bVar = this.f5257b;
        if (bVar == null) {
            return null;
        }
        return bVar.f5261a;
    }

    /* renamed from: a */
    public synchronized void mo15641a(C1971c cVar) {
        this.f5258c.add(cVar);
        ((C3395qc) cVar).mo15644a(mo15642b());
    }

    /* renamed from: a */
    static void m7045a(C1967E e, C1969b.C1970a aVar) {
        synchronized (e) {
            for (C1971c a : e.f5258c) {
                a.mo15644a(aVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C1969b m7041a(Intent intent) {
        C1969b.C1970a aVar = C1969b.C1970a.UNKNOWN;
        Integer num = null;
        if (intent != null) {
            int intExtra = intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra > 0 && intExtra2 > 0) {
                num = Integer.valueOf((intExtra * 100) / intExtra2);
            }
            int intExtra3 = intent.getIntExtra("plugged", -1);
            aVar = C1969b.C1970a.NONE;
            if (intExtra3 == 1) {
                aVar = C1969b.C1970a.AC;
            } else if (intExtra3 == 2) {
                aVar = C1969b.C1970a.USB;
            } else if (intExtra3 == 4) {
                aVar = C1969b.C1970a.WIRELESS;
            }
        }
        return new C1969b(num, aVar);
    }
}
