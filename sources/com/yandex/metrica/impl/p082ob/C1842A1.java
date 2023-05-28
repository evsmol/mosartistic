package com.yandex.metrica.impl.p082ob;

import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.A1 */
public class C1842A1 implements C1878B1 {

    /* renamed from: a */
    private final C3458rm<String, Integer> f5017a = new C3458rm<>();

    /* renamed from: b */
    private final Map<C1847e, C1846d> f5018b = new LinkedHashMap();

    /* renamed from: c */
    private final Map<C1847e, C1846d> f5019c = new LinkedHashMap();

    /* renamed from: com.yandex.metrica.impl.ob.A1$a */
    class C1843a implements C1846d {
        C1843a() {
        }

        /* renamed from: a */
        public boolean mo15416a(Intent intent, C1842A1 a1) {
            return C1842A1.m6776a(C1842A1.this, intent);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.A1$b */
    class C1844b implements C1846d {
        C1844b() {
        }

        /* renamed from: a */
        public boolean mo15416a(Intent intent, C1842A1 a1) {
            return C1842A1.this.m6780e(intent);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.A1$c */
    class C1845c implements C1846d {
        C1845c() {
        }

        /* renamed from: a */
        public boolean mo15416a(Intent intent, C1842A1 a1) {
            return C1842A1.this.m6780e(intent) && C1842A1.m6775a(C1842A1.this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.A1$d */
    interface C1846d {
        /* renamed from: a */
        boolean mo15416a(Intent intent, C1842A1 a1);
    }

    /* renamed from: com.yandex.metrica.impl.ob.A1$e */
    interface C1847e {
        /* renamed from: a */
        void mo15417a(Intent intent);
    }

    /* renamed from: d */
    private int m6779d(Intent intent) {
        Uri data = intent.getData();
        if (data != null && data.getPath().equals("/client")) {
            try {
                return Integer.parseInt(data.getQueryParameter("pid"));
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m6780e(Intent intent) {
        boolean z = false;
        if (!"com.yandex.metrica.IMetricaService".equals(intent.getAction())) {
            return false;
        }
        if (m6779d(intent) == Process.myPid()) {
            z = true;
        }
        return !z;
    }

    /* renamed from: a */
    public void mo15410a(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f5017a.mo18181a(action, Integer.valueOf(m6779d(intent)));
            }
            m6774a(intent, this.f5018b);
        }
    }

    /* renamed from: c */
    public void mo15414c(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f5017a.mo18181a(action, Integer.valueOf(m6779d(intent)));
            }
            m6774a(intent, this.f5018b);
        }
    }

    /* renamed from: b */
    public void mo15412b(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f5017a.mo18184b(action, Integer.valueOf(m6779d(intent)));
            }
            m6774a(intent, this.f5019c);
        }
    }

    /* renamed from: a */
    private void m6774a(Intent intent, Map<C1847e, C1846d> map) {
        for (Map.Entry next : map.entrySet()) {
            if (((C1846d) next.getValue()).mo15416a(intent, this)) {
                ((C1847e) next.getKey()).mo15417a(intent);
            }
        }
    }

    /* renamed from: c */
    public void mo15415c(C1847e eVar) {
        this.f5018b.put(eVar, new C1844b());
    }

    /* renamed from: c */
    private int m6778c() {
        Collection<Integer> a = this.f5017a.mo18180a("com.yandex.metrica.IMetricaService");
        if (C1848A2.m6814b((Collection) a)) {
            return 0;
        }
        int i = 0;
        for (Integer intValue : a) {
            if (!(intValue.intValue() == Process.myPid())) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public void mo15413b(C1847e eVar) {
        this.f5018b.put(eVar, new C1843a());
    }

    /* renamed from: a */
    public void mo15411a(C1847e eVar) {
        this.f5019c.put(eVar, new C1845c());
    }

    /* renamed from: a */
    static boolean m6776a(C1842A1 a1, Intent intent) {
        if (!a1.m6780e(intent)) {
            return false;
        }
        if (a1.m6778c() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static boolean m6775a(C1842A1 a1) {
        return a1.m6778c() == 0;
    }
}
