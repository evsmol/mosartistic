package com.iab.omid.library.ironsrc.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.ironsrc.p112c.C4320a;
import com.iab.omid.library.ironsrc.p112c.C4322b;
import com.iab.omid.library.ironsrc.p113d.C4326b;
import com.iab.omid.library.ironsrc.p113d.C4329d;
import com.iab.omid.library.ironsrc.p113d.C4331f;
import com.iab.omid.library.ironsrc.walking.C4341a;
import com.iab.omid.library.ironsrc.walking.p115a.C4347c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C4320a.C4321a {

    /* renamed from: a */
    private static TreeWalker f10339a = new TreeWalker();

    /* renamed from: b */
    private static Handler f10340b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f10341c = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f10342j = new Runnable() {
        public final void run() {
            TreeWalker.getInstance().m12355h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f10343k = new Runnable() {
        public final void run() {
            if (TreeWalker.f10341c != null) {
                TreeWalker.f10341c.post(TreeWalker.f10342j);
                TreeWalker.f10341c.postDelayed(TreeWalker.f10343k, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f10344d = new ArrayList();

    /* renamed from: e */
    private int f10345e;

    /* renamed from: f */
    private C4322b f10346f = new C4322b();

    /* renamed from: g */
    private C4341a f10347g = new C4341a();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C4351b f10348h = new C4351b(new C4347c());

    /* renamed from: i */
    private long f10349i;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m12346a(long j) {
        if (this.f10344d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f10344d) {
                next.onTreeProcessed(this.f10345e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f10345e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m12347a(View view, C4320a aVar, JSONObject jSONObject, C4352c cVar) {
        aVar.mo32976a(view, jSONObject, this, cVar == C4352c.PARENT_VIEW);
    }

    /* renamed from: a */
    private void m12348a(String str, View view, JSONObject jSONObject) {
        C4320a b = this.f10346f.mo32979b();
        String a = this.f10347g.mo33019a(str);
        if (a != null) {
            JSONObject a2 = b.mo32975a(view);
            C4326b.m12285a(a2, str);
            C4326b.m12290b(a2, a);
            C4326b.m12287a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m12349a(View view, JSONObject jSONObject) {
        String a = this.f10347g.mo33018a(view);
        if (a == null) {
            return false;
        }
        C4326b.m12285a(jSONObject, a);
        this.f10347g.mo33027e();
        return true;
    }

    /* renamed from: b */
    private void m12350b(View view, JSONObject jSONObject) {
        C4341a.C4342a b = this.f10347g.mo33022b(view);
        if (b != null) {
            C4326b.m12284a(jSONObject, b);
        }
    }

    public static TreeWalker getInstance() {
        return f10339a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m12355h() {
        m12356i();
        mo33011d();
        m12357j();
    }

    /* renamed from: i */
    private void m12356i() {
        this.f10345e = 0;
        this.f10349i = C4329d.m12298a();
    }

    /* renamed from: j */
    private void m12357j() {
        m12346a(C4329d.m12298a() - this.f10349i);
    }

    /* renamed from: k */
    private void m12358k() {
        if (f10341c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f10341c = handler;
            handler.post(f10342j);
            f10341c.postDelayed(f10343k, 200);
        }
    }

    /* renamed from: l */
    private void m12359l() {
        Handler handler = f10341c;
        if (handler != null) {
            handler.removeCallbacks(f10343k);
            f10341c = null;
        }
    }

    /* renamed from: a */
    public void mo33007a() {
        m12358k();
    }

    /* renamed from: a */
    public void mo32977a(View view, C4320a aVar, JSONObject jSONObject) {
        C4352c c;
        if (C4331f.m12315d(view) && (c = this.f10347g.mo33024c(view)) != C4352c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo32975a(view);
            C4326b.m12287a(jSONObject, a);
            if (!m12349a(view, a)) {
                m12350b(view, a);
                m12347a(view, aVar, a, c);
            }
            this.f10345e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f10344d.contains(treeWalkerTimeLogger)) {
            this.f10344d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo33009b() {
        mo33010c();
        this.f10344d.clear();
        f10340b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f10348h.mo33045a();
            }
        });
    }

    /* renamed from: c */
    public void mo33010c() {
        m12359l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo33011d() {
        this.f10347g.mo33025c();
        long a = C4329d.m12298a();
        C4320a a2 = this.f10346f.mo32978a();
        if (this.f10347g.mo33023b().size() > 0) {
            Iterator<String> it = this.f10347g.mo33023b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo32975a((View) null);
                m12348a(next, this.f10347g.mo33021b(next), a3);
                C4326b.m12283a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f10348h.mo33047b(a3, hashSet, a);
            }
        }
        if (this.f10347g.mo33020a().size() > 0) {
            JSONObject a4 = a2.mo32975a((View) null);
            m12347a((View) null, a2, a4, C4352c.PARENT_VIEW);
            C4326b.m12283a(a4);
            this.f10348h.mo33046a(a4, this.f10347g.mo33020a(), a);
        } else {
            this.f10348h.mo33045a();
        }
        this.f10347g.mo33026d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f10344d.contains(treeWalkerTimeLogger)) {
            this.f10344d.remove(treeWalkerTimeLogger);
        }
    }
}
