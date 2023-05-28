package com.iab.omid.library.applovin.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.applovin.adsession.C4197a;
import com.iab.omid.library.applovin.internal.C4207c;
import com.iab.omid.library.applovin.processor.C4215a;
import com.iab.omid.library.applovin.processor.C4217b;
import com.iab.omid.library.applovin.utils.C4226c;
import com.iab.omid.library.applovin.utils.C4232f;
import com.iab.omid.library.applovin.utils.C4234h;
import com.iab.omid.library.applovin.walking.C4238a;
import com.iab.omid.library.applovin.walking.async.C4244c;
import com.iab.omid.library.applovin.weakreference.C4250a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C4215a.C4216a {

    /* renamed from: i */
    private static TreeWalker f10109i = new TreeWalker();

    /* renamed from: j */
    private static Handler f10110j = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static Handler f10111k = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final Runnable f10112l = new C4236b();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final Runnable f10113m = new C4237c();

    /* renamed from: a */
    private List<TreeWalkerTimeLogger> f10114a = new ArrayList();

    /* renamed from: b */
    private int f10115b;

    /* renamed from: c */
    private boolean f10116c = false;

    /* renamed from: d */
    private final List<C4250a> f10117d = new ArrayList();

    /* renamed from: e */
    private C4217b f10118e = new C4217b();

    /* renamed from: f */
    private C4238a f10119f = new C4238a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C4248b f10120g = new C4248b(new C4244c());

    /* renamed from: h */
    private long f10121h;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    /* renamed from: com.iab.omid.library.applovin.walking.TreeWalker$a */
    class C4235a implements Runnable {
        C4235a() {
        }

        public void run() {
            TreeWalker.this.f10120g.mo32666b();
        }
    }

    /* renamed from: com.iab.omid.library.applovin.walking.TreeWalker$b */
    class C4236b implements Runnable {
        C4236b() {
        }

        public void run() {
            TreeWalker.getInstance().m11912l();
        }
    }

    /* renamed from: com.iab.omid.library.applovin.walking.TreeWalker$c */
    class C4237c implements Runnable {
        C4237c() {
        }

        public void run() {
            if (TreeWalker.f10111k != null) {
                TreeWalker.f10111k.post(TreeWalker.f10112l);
                TreeWalker.f10111k.postDelayed(TreeWalker.f10113m, 200);
            }
        }
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m11900a(long j) {
        if (this.f10114a.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f10114a) {
                next.onTreeProcessed(this.f10115b, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f10115b, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m11901a(View view, C4215a aVar, JSONObject jSONObject, C4249c cVar, boolean z) {
        aVar.mo32592a(view, jSONObject, this, cVar == C4249c.PARENT_VIEW, z);
    }

    /* renamed from: a */
    private void m11902a(String str, View view, JSONObject jSONObject) {
        C4215a b = this.f10118e.mo32595b();
        String b2 = this.f10119f.mo32639b(str);
        if (b2 != null) {
            JSONObject a = b.mo32591a(view);
            C4226c.m11859a(a, str);
            C4226c.m11865b(a, b2);
            C4226c.m11861a(jSONObject, a);
        }
    }

    /* renamed from: a */
    private boolean m11903a(View view, JSONObject jSONObject) {
        C4238a.C4239a c = this.f10119f.mo32641c(view);
        if (c == null) {
            return false;
        }
        C4226c.m11857a(jSONObject, c);
        return true;
    }

    /* renamed from: b */
    private boolean m11906b(View view, JSONObject jSONObject) {
        String d = this.f10119f.mo32643d(view);
        if (d == null) {
            return false;
        }
        C4226c.m11859a(jSONObject, d);
        C4226c.m11858a(jSONObject, Boolean.valueOf(this.f10119f.mo32647f(view)));
        this.f10119f.mo32644d();
        return true;
    }

    /* renamed from: d */
    private void m11908d() {
        m11900a(C4232f.m11878b() - this.f10121h);
    }

    /* renamed from: e */
    private void m11909e() {
        this.f10115b = 0;
        this.f10117d.clear();
        this.f10116c = false;
        Iterator<C4197a> it = C4207c.m11754c().mo32544a().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo32497e()) {
                    this.f10116c = true;
                    break;
                }
            } else {
                break;
            }
        }
        this.f10121h = C4232f.m11878b();
    }

    public static TreeWalker getInstance() {
        return f10109i;
    }

    /* renamed from: i */
    private void m11910i() {
        if (f10111k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f10111k = handler;
            handler.post(f10112l);
            f10111k.postDelayed(f10113m, 200);
        }
    }

    /* renamed from: k */
    private void m11911k() {
        Handler handler = f10111k;
        if (handler != null) {
            handler.removeCallbacks(f10113m);
            f10111k = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m11912l() {
        m11909e();
        mo32627f();
        m11908d();
    }

    /* renamed from: a */
    public void mo32593a(View view, C4215a aVar, JSONObject jSONObject, boolean z) {
        C4249c e;
        if (C4234h.m11896d(view) && (e = this.f10119f.mo32645e(view)) != C4249c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo32591a(view);
            C4226c.m11861a(jSONObject, a);
            if (!m11906b(view, a)) {
                boolean z2 = z || m11903a(view, a);
                if (this.f10116c && e == C4249c.OBSTRUCTION_VIEW && !z2) {
                    this.f10117d.add(new C4250a(view));
                }
                m11901a(view, aVar, a, e, z2);
            }
            this.f10115b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f10114a.contains(treeWalkerTimeLogger)) {
            this.f10114a.add(treeWalkerTimeLogger);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo32627f() {
        this.f10119f.mo32646e();
        long b = C4232f.m11878b();
        C4215a a = this.f10118e.mo32594a();
        if (this.f10119f.mo32640b().size() > 0) {
            Iterator<String> it = this.f10119f.mo32640b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a2 = a.mo32591a((View) null);
                m11902a(next, this.f10119f.mo32637a(next), a2);
                C4226c.m11864b(a2);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f10120g.mo32665a(a2, hashSet, b);
            }
        }
        if (this.f10119f.mo32642c().size() > 0) {
            JSONObject a3 = a.mo32591a((View) null);
            m11901a((View) null, a, a3, C4249c.PARENT_VIEW, false);
            C4226c.m11864b(a3);
            this.f10120g.mo32667b(a3, this.f10119f.mo32642c(), b);
            if (this.f10116c) {
                for (C4197a a4 : C4207c.m11754c().mo32544a()) {
                    a4.mo32493a(this.f10117d);
                }
            }
        } else {
            this.f10120g.mo32666b();
        }
        this.f10119f.mo32638a();
    }

    /* renamed from: g */
    public void mo32628g() {
        m11911k();
    }

    /* renamed from: h */
    public void mo32629h() {
        m11910i();
    }

    /* renamed from: j */
    public void mo32630j() {
        mo32628g();
        this.f10114a.clear();
        f10110j.post(new C4235a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f10114a.contains(treeWalkerTimeLogger)) {
            this.f10114a.remove(treeWalkerTimeLogger);
        }
    }
}
