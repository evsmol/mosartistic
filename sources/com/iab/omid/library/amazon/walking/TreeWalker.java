package com.iab.omid.library.amazon.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.amazon.adsession.C4152a;
import com.iab.omid.library.amazon.p099b.C4154a;
import com.iab.omid.library.amazon.p100c.C4163a;
import com.iab.omid.library.amazon.p100c.C4165b;
import com.iab.omid.library.amazon.p101d.C4169b;
import com.iab.omid.library.amazon.p101d.C4172d;
import com.iab.omid.library.amazon.p101d.C4174f;
import com.iab.omid.library.amazon.p102e.C4175a;
import com.iab.omid.library.amazon.walking.C4184a;
import com.iab.omid.library.amazon.walking.p103a.C4190c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C4163a.C4164a {

    /* renamed from: a */
    private static TreeWalker f9984a = new TreeWalker();

    /* renamed from: b */
    private static Handler f9985b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f9986c = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final Runnable f9987l = new Runnable() {
        public void run() {
            TreeWalker.getInstance().m11655h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final Runnable f9988m = new Runnable() {
        public void run() {
            if (TreeWalker.f9986c != null) {
                TreeWalker.f9986c.post(TreeWalker.f9987l);
                TreeWalker.f9986c.postDelayed(TreeWalker.f9988m, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f9989d = new ArrayList();

    /* renamed from: e */
    private int f9990e;

    /* renamed from: f */
    private boolean f9991f = false;

    /* renamed from: g */
    private final List<C4175a> f9992g = new ArrayList();

    /* renamed from: h */
    private C4165b f9993h = new C4165b();

    /* renamed from: i */
    private C4184a f9994i = new C4184a();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C4194b f9995j = new C4194b(new C4190c());

    /* renamed from: k */
    private long f9996k;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m11646a(long j) {
        if (this.f9989d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f9989d) {
                next.onTreeProcessed(this.f9990e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f9990e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m11647a(View view, C4163a aVar, JSONObject jSONObject, C4195c cVar, boolean z) {
        aVar.mo32383a(view, jSONObject, this, cVar == C4195c.PARENT_VIEW, z);
    }

    /* renamed from: a */
    private void m11648a(String str, View view, JSONObject jSONObject) {
        C4163a b = this.f9993h.mo32386b();
        String a = this.f9994i.mo32426a(str);
        if (a != null) {
            JSONObject a2 = b.mo32382a(view);
            C4169b.m11584a(a2, str);
            C4169b.m11589b(a2, a);
            C4169b.m11586a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m11649a(View view, JSONObject jSONObject) {
        String a = this.f9994i.mo32425a(view);
        if (a == null) {
            return false;
        }
        C4169b.m11584a(jSONObject, a);
        C4169b.m11583a(jSONObject, Boolean.valueOf(this.f9994i.mo32434d(view)));
        this.f9994i.mo32435e();
        return true;
    }

    /* renamed from: b */
    private boolean m11651b(View view, JSONObject jSONObject) {
        C4184a.C4185a b = this.f9994i.mo32429b(view);
        if (b == null) {
            return false;
        }
        C4169b.m11582a(jSONObject, b);
        return true;
    }

    public static TreeWalker getInstance() {
        return f9984a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m11655h() {
        m11656i();
        mo32418d();
        m11657j();
    }

    /* renamed from: i */
    private void m11656i() {
        this.f9990e = 0;
        this.f9992g.clear();
        this.f9991f = false;
        Iterator<C4152a> it = C4154a.m11508a().mo32339c().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo32302b()) {
                    this.f9991f = true;
                    break;
                }
            } else {
                break;
            }
        }
        this.f9996k = C4172d.m11598a();
    }

    /* renamed from: j */
    private void m11657j() {
        m11646a(C4172d.m11598a() - this.f9996k);
    }

    /* renamed from: k */
    private void m11658k() {
        if (f9986c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f9986c = handler;
            handler.post(f9987l);
            f9986c.postDelayed(f9988m, 200);
        }
    }

    /* renamed from: l */
    private void m11659l() {
        Handler handler = f9986c;
        if (handler != null) {
            handler.removeCallbacks(f9988m);
            f9986c = null;
        }
    }

    /* renamed from: a */
    public void mo32414a() {
        m11658k();
    }

    /* renamed from: a */
    public void mo32384a(View view, C4163a aVar, JSONObject jSONObject, boolean z) {
        C4195c c;
        if (C4174f.m11615d(view) && (c = this.f9994i.mo32431c(view)) != C4195c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo32382a(view);
            C4169b.m11586a(jSONObject, a);
            if (!m11649a(view, a)) {
                boolean z2 = z || m11651b(view, a);
                if (this.f9991f && c == C4195c.OBSTRUCTION_VIEW && !z2) {
                    this.f9992g.add(new C4175a(view));
                }
                m11647a(view, aVar, a, c, z2);
            }
            this.f9990e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f9989d.contains(treeWalkerTimeLogger)) {
            this.f9989d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo32416b() {
        mo32417c();
        this.f9989d.clear();
        f9985b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f9995j.mo32453a();
            }
        });
    }

    /* renamed from: c */
    public void mo32417c() {
        m11659l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo32418d() {
        this.f9994i.mo32432c();
        long a = C4172d.m11598a();
        C4163a a2 = this.f9993h.mo32385a();
        if (this.f9994i.mo32430b().size() > 0) {
            Iterator<String> it = this.f9994i.mo32430b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo32382a((View) null);
                m11648a(next, this.f9994i.mo32428b(next), a3);
                C4169b.m11581a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f9995j.mo32455b(a3, hashSet, a);
            }
        }
        if (this.f9994i.mo32427a().size() > 0) {
            JSONObject a4 = a2.mo32382a((View) null);
            m11647a((View) null, a2, a4, C4195c.PARENT_VIEW, false);
            C4169b.m11581a(a4);
            this.f9995j.mo32454a(a4, this.f9994i.mo32427a(), a);
            if (this.f9991f) {
                for (C4152a a5 : C4154a.m11508a().mo32339c()) {
                    a5.mo32300a(this.f9992g);
                }
            }
        } else {
            this.f9995j.mo32453a();
        }
        this.f9994i.mo32433d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f9989d.contains(treeWalkerTimeLogger)) {
            this.f9989d.remove(treeWalkerTimeLogger);
        }
    }
}
