package com.iab.omid.library.appodeal.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.appodeal.p106c.C4270a;
import com.iab.omid.library.appodeal.p106c.C4272b;
import com.iab.omid.library.appodeal.p107d.C4276b;
import com.iab.omid.library.appodeal.p107d.C4279d;
import com.iab.omid.library.appodeal.p107d.C4281f;
import com.iab.omid.library.appodeal.walking.C4291a;
import com.iab.omid.library.appodeal.walking.p109a.C4297c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C4270a.C4271a {

    /* renamed from: a */
    private static TreeWalker f10225a = new TreeWalker();

    /* renamed from: b */
    private static Handler f10226b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f10227c = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f10228j = new Runnable() {
        public void run() {
            TreeWalker.getInstance().m12134h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f10229k = new Runnable() {
        public void run() {
            if (TreeWalker.f10227c != null) {
                TreeWalker.f10227c.post(TreeWalker.f10228j);
                TreeWalker.f10227c.postDelayed(TreeWalker.f10229k, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f10230d = new ArrayList();

    /* renamed from: e */
    private int f10231e;

    /* renamed from: f */
    private C4272b f10232f = new C4272b();

    /* renamed from: g */
    private C4291a f10233g = new C4291a();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C4301b f10234h = new C4301b(new C4297c());

    /* renamed from: i */
    private long f10235i;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m12125a(long j) {
        if (this.f10230d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f10230d) {
                next.onTreeProcessed(this.f10231e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f10231e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m12126a(View view, C4270a aVar, JSONObject jSONObject, C4302c cVar) {
        aVar.mo32790a(view, jSONObject, this, cVar == C4302c.PARENT_VIEW);
    }

    /* renamed from: a */
    private void m12127a(String str, View view, JSONObject jSONObject) {
        C4270a b = this.f10232f.mo32793b();
        String a = this.f10233g.mo32833a(str);
        if (a != null) {
            JSONObject a2 = b.mo32789a(view);
            C4276b.m12064a(a2, str);
            C4276b.m12069b(a2, a);
            C4276b.m12066a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m12128a(View view, JSONObject jSONObject) {
        String a = this.f10233g.mo32832a(view);
        if (a == null) {
            return false;
        }
        C4276b.m12064a(jSONObject, a);
        this.f10233g.mo32841e();
        return true;
    }

    /* renamed from: b */
    private void m12129b(View view, JSONObject jSONObject) {
        C4291a.C4292a b = this.f10233g.mo32836b(view);
        if (b != null) {
            C4276b.m12063a(jSONObject, b);
        }
    }

    public static TreeWalker getInstance() {
        return f10225a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m12134h() {
        m12135i();
        mo32825d();
        m12136j();
    }

    /* renamed from: i */
    private void m12135i() {
        this.f10231e = 0;
        this.f10235i = C4279d.m12077a();
    }

    /* renamed from: j */
    private void m12136j() {
        m12125a(C4279d.m12077a() - this.f10235i);
    }

    /* renamed from: k */
    private void m12137k() {
        if (f10227c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f10227c = handler;
            handler.post(f10228j);
            f10227c.postDelayed(f10229k, 200);
        }
    }

    /* renamed from: l */
    private void m12138l() {
        Handler handler = f10227c;
        if (handler != null) {
            handler.removeCallbacks(f10229k);
            f10227c = null;
        }
    }

    /* renamed from: a */
    public void mo32821a() {
        m12137k();
    }

    /* renamed from: a */
    public void mo32791a(View view, C4270a aVar, JSONObject jSONObject) {
        C4302c c;
        if (C4281f.m12094d(view) && (c = this.f10233g.mo32838c(view)) != C4302c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo32789a(view);
            C4276b.m12066a(jSONObject, a);
            if (!m12128a(view, a)) {
                m12129b(view, a);
                m12126a(view, aVar, a, c);
            }
            this.f10231e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f10230d.contains(treeWalkerTimeLogger)) {
            this.f10230d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo32823b() {
        mo32824c();
        this.f10230d.clear();
        f10226b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f10234h.mo32859a();
            }
        });
    }

    /* renamed from: c */
    public void mo32824c() {
        m12138l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo32825d() {
        this.f10233g.mo32839c();
        long a = C4279d.m12077a();
        C4270a a2 = this.f10232f.mo32792a();
        if (this.f10233g.mo32837b().size() > 0) {
            Iterator<String> it = this.f10233g.mo32837b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo32789a((View) null);
                m12127a(next, this.f10233g.mo32835b(next), a3);
                C4276b.m12062a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f10234h.mo32861b(a3, hashSet, a);
            }
        }
        if (this.f10233g.mo32834a().size() > 0) {
            JSONObject a4 = a2.mo32789a((View) null);
            m12126a((View) null, a2, a4, C4302c.PARENT_VIEW);
            C4276b.m12062a(a4);
            this.f10234h.mo32860a(a4, this.f10233g.mo32834a(), a);
        } else {
            this.f10234h.mo32859a();
        }
        this.f10233g.mo32840d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f10230d.contains(treeWalkerTimeLogger)) {
            this.f10230d.remove(treeWalkerTimeLogger);
        }
    }
}
