package com.iab.omid.library.adcolony.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.adcolony.adsession.C4102a;
import com.iab.omid.library.adcolony.p093b.C4104a;
import com.iab.omid.library.adcolony.p094c.C4113a;
import com.iab.omid.library.adcolony.p094c.C4115b;
import com.iab.omid.library.adcolony.p095d.C4119b;
import com.iab.omid.library.adcolony.p095d.C4122d;
import com.iab.omid.library.adcolony.p095d.C4124f;
import com.iab.omid.library.adcolony.p096e.C4125a;
import com.iab.omid.library.adcolony.walking.C4134a;
import com.iab.omid.library.adcolony.walking.p097a.C4140c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C4113a.C4114a {

    /* renamed from: a */
    private static TreeWalker f9867a = new TreeWalker();

    /* renamed from: b */
    private static Handler f9868b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f9869c = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final Runnable f9870l = new Runnable() {
        public void run() {
            TreeWalker.getInstance().m11425h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final Runnable f9871m = new Runnable() {
        public void run() {
            if (TreeWalker.f9869c != null) {
                TreeWalker.f9869c.post(TreeWalker.f9870l);
                TreeWalker.f9869c.postDelayed(TreeWalker.f9871m, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f9872d = new ArrayList();

    /* renamed from: e */
    private int f9873e;

    /* renamed from: f */
    private boolean f9874f = false;

    /* renamed from: g */
    private final List<C4125a> f9875g = new ArrayList();

    /* renamed from: h */
    private C4115b f9876h = new C4115b();

    /* renamed from: i */
    private C4134a f9877i = new C4134a();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C4144b f9878j = new C4144b(new C4140c());

    /* renamed from: k */
    private long f9879k;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m11416a(long j) {
        if (this.f9872d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f9872d) {
                next.onTreeProcessed(this.f9873e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f9873e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m11417a(View view, C4113a aVar, JSONObject jSONObject, C4145c cVar, boolean z) {
        aVar.mo32184a(view, jSONObject, this, cVar == C4145c.PARENT_VIEW, z);
    }

    /* renamed from: a */
    private void m11418a(String str, View view, JSONObject jSONObject) {
        C4113a b = this.f9876h.mo32187b();
        String a = this.f9877i.mo32227a(str);
        if (a != null) {
            JSONObject a2 = b.mo32183a(view);
            C4119b.m11354a(a2, str);
            C4119b.m11359b(a2, a);
            C4119b.m11356a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m11419a(View view, JSONObject jSONObject) {
        String a = this.f9877i.mo32226a(view);
        if (a == null) {
            return false;
        }
        C4119b.m11354a(jSONObject, a);
        C4119b.m11353a(jSONObject, Boolean.valueOf(this.f9877i.mo32235d(view)));
        this.f9877i.mo32236e();
        return true;
    }

    /* renamed from: b */
    private boolean m11421b(View view, JSONObject jSONObject) {
        C4134a.C4135a b = this.f9877i.mo32230b(view);
        if (b == null) {
            return false;
        }
        C4119b.m11352a(jSONObject, b);
        return true;
    }

    public static TreeWalker getInstance() {
        return f9867a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m11425h() {
        m11426i();
        mo32219d();
        m11427j();
    }

    /* renamed from: i */
    private void m11426i() {
        this.f9873e = 0;
        this.f9875g.clear();
        this.f9874f = false;
        Iterator<C4102a> it = C4104a.m11278a().mo32140c().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo32103b()) {
                    this.f9874f = true;
                    break;
                }
            } else {
                break;
            }
        }
        this.f9879k = C4122d.m11368a();
    }

    /* renamed from: j */
    private void m11427j() {
        m11416a(C4122d.m11368a() - this.f9879k);
    }

    /* renamed from: k */
    private void m11428k() {
        if (f9869c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f9869c = handler;
            handler.post(f9870l);
            f9869c.postDelayed(f9871m, 200);
        }
    }

    /* renamed from: l */
    private void m11429l() {
        Handler handler = f9869c;
        if (handler != null) {
            handler.removeCallbacks(f9871m);
            f9869c = null;
        }
    }

    /* renamed from: a */
    public void mo32215a() {
        m11428k();
    }

    /* renamed from: a */
    public void mo32185a(View view, C4113a aVar, JSONObject jSONObject, boolean z) {
        C4145c c;
        if (C4124f.m11385d(view) && (c = this.f9877i.mo32232c(view)) != C4145c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo32183a(view);
            C4119b.m11356a(jSONObject, a);
            if (!m11419a(view, a)) {
                boolean z2 = z || m11421b(view, a);
                if (this.f9874f && c == C4145c.OBSTRUCTION_VIEW && !z2) {
                    this.f9875g.add(new C4125a(view));
                }
                m11417a(view, aVar, a, c, z2);
            }
            this.f9873e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f9872d.contains(treeWalkerTimeLogger)) {
            this.f9872d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo32217b() {
        mo32218c();
        this.f9872d.clear();
        f9868b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f9878j.mo32254a();
            }
        });
    }

    /* renamed from: c */
    public void mo32218c() {
        m11429l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo32219d() {
        this.f9877i.mo32233c();
        long a = C4122d.m11368a();
        C4113a a2 = this.f9876h.mo32186a();
        if (this.f9877i.mo32231b().size() > 0) {
            Iterator<String> it = this.f9877i.mo32231b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo32183a((View) null);
                m11418a(next, this.f9877i.mo32229b(next), a3);
                C4119b.m11351a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f9878j.mo32256b(a3, hashSet, a);
            }
        }
        if (this.f9877i.mo32228a().size() > 0) {
            JSONObject a4 = a2.mo32183a((View) null);
            m11417a((View) null, a2, a4, C4145c.PARENT_VIEW, false);
            C4119b.m11351a(a4);
            this.f9878j.mo32255a(a4, this.f9877i.mo32228a(), a);
            if (this.f9874f) {
                for (C4102a a5 : C4104a.m11278a().mo32140c()) {
                    a5.mo32101a(this.f9875g);
                }
            }
        } else {
            this.f9878j.mo32254a();
        }
        this.f9877i.mo32234d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f9872d.contains(treeWalkerTimeLogger)) {
            this.f9872d.remove(treeWalkerTimeLogger);
        }
    }
}
