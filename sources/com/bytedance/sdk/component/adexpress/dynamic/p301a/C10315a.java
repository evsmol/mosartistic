package com.bytedance.sdk.component.adexpress.dynamic.p301a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C10281b;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C10388c;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10349f;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h;
import com.bytedance.sdk.component.adexpress.dynamic.p304c.C10368h;
import com.bytedance.sdk.component.adexpress.dynamic.p304c.C10370i;
import com.bytedance.sdk.component.adexpress.dynamic.p305d.C10375a;
import com.bytedance.sdk.component.adexpress.dynamic.p305d.C10376b;
import com.bytedance.sdk.component.adexpress.p294a.p296b.C10266a;
import com.bytedance.sdk.component.adexpress.p298b.C10286d;
import com.bytedance.sdk.component.adexpress.p298b.C10289f;
import com.bytedance.sdk.component.adexpress.p298b.C10290g;
import com.bytedance.sdk.component.adexpress.p298b.C10294j;
import com.bytedance.sdk.component.adexpress.p298b.C10296l;
import com.bytedance.sdk.component.adexpress.p298b.C10298m;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.utils.C10631h;
import com.bytedance.sdk.component.utils.C10638l;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.a.a */
/* compiled from: DynamicRender */
public class C10315a implements C10286d<DynamicRootView>, C10294j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public DynamicRootView f25513a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C10370i f25514b;

    /* renamed from: c */
    private Context f25515c;

    /* renamed from: d */
    private C10289f f25516d;

    /* renamed from: e */
    private C10290g f25517e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C10296l f25518f;

    /* renamed from: g */
    private ScheduledFuture<?> f25519g;

    /* renamed from: h */
    private AtomicBoolean f25520h = new AtomicBoolean(false);

    public C10315a(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, C10370i iVar, C10296l lVar, C10375a aVar) {
        this.f25515c = context;
        DynamicRootView dynamicRootView = new DynamicRootView(context, themeStatusBroadcastReceiver, z, lVar, aVar);
        this.f25513a = dynamicRootView;
        this.f25514b = iVar;
        this.f25518f = lVar;
        dynamicRootView.setRenderListener(this);
        this.f25518f = lVar;
    }

    /* renamed from: a */
    public void mo1937a(C10289f fVar) {
        this.f25516d = fVar;
        int d = this.f25518f.mo63178d();
        if (d < 0) {
            this.f25513a.mo63654a(this.f25514b instanceof C10368h ? 127 : 117);
            return;
        }
        this.f25519g = C10615e.m31169d().schedule(new C10320a(2), (long) d, TimeUnit.MILLISECONDS);
        C10631h.m31218b().postDelayed(new Runnable() {
            public void run() {
                C10315a.this.m29810f();
            }
        }, this.f25518f.mo63184j());
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m29810f() {
        this.f25518f.mo63177c().mo1968c(mo1943c());
        if (!C10266a.m29494a(this.f25518f.mo63175a())) {
            this.f25513a.mo63654a(this.f25514b instanceof C10368h ? 123 : 113);
            return;
        }
        this.f25514b.mo63597a((C10376b) new C10376b() {
            /* renamed from: a */
            public void mo63277a(final C10351h hVar) {
                C10315a.this.m29812h();
                C10315a.this.f25518f.mo63177c().mo1970d(C10315a.this.mo1943c());
                C10315a.this.m29801a(hVar);
                C10315a.this.m29804b(hVar);
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        C10315a.this.m29807c(hVar);
                    }
                });
                C10315a.this.f25513a.setBgColor(hVar.mo63541a());
            }
        });
        this.f25514b.mo63596a(this.f25518f);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m29801a(C10351h hVar) {
        List<C10351h> j;
        if (hVar != null && (j = hVar.mo63564j()) != null && j.size() > 0) {
            Collections.sort(j, new Comparator<C10351h>() {
                /* renamed from: a */
                public int compare(C10351h hVar, C10351h hVar2) {
                    C10349f e = hVar.mo63563i().mo63363e();
                    C10349f e2 = hVar2.mo63563i().mo63363e();
                    if (e == null || e2 == null) {
                        return 0;
                    }
                    return e.mo63391Z() >= e2.mo63391Z() ? 1 : -1;
                }
            });
            for (C10351h next : j) {
                if (next != null) {
                    m29801a(next);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m29804b(C10351h hVar) {
        if (hVar != null) {
            List<C10351h> j = hVar.mo63564j();
            if (j != null && j.size() > 0) {
                for (C10351h b : j) {
                    m29804b(b);
                }
            }
            C10351h k = hVar.mo63565k();
            if (k != null) {
                hVar.mo63553c(hVar.mo63556e() - k.mo63556e());
                hVar.mo63555d(hVar.mo63558f() - k.mo63558f());
            }
        }
    }

    /* renamed from: a */
    public DynamicRootView mo1946e() {
        return mo63275d();
    }

    /* renamed from: b */
    public void mo63274b() {
        m29798a((View) mo1946e());
    }

    /* renamed from: a */
    private void m29798a(View view) {
        if (view != null) {
            if (view instanceof ViewGroup) {
                int i = 0;
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    m29798a(viewGroup.getChildAt(i));
                    i++;
                }
            }
            if (view instanceof C10388c) {
                ((C10388c) view).mo63284b();
            }
        }
    }

    /* renamed from: c */
    public int mo1943c() {
        return this.f25514b instanceof C10368h ? 3 : 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m29807c(C10351h hVar) {
        if (hVar == null) {
            this.f25513a.mo63654a(this.f25514b instanceof C10368h ? 123 : 113);
            return;
        }
        this.f25518f.mo63177c().mo1972e(mo1943c());
        try {
            this.f25513a.mo63655a(hVar, mo1943c());
        } catch (Exception unused) {
            this.f25513a.mo63654a(this.f25514b instanceof C10368h ? 128 : 118);
        }
    }

    /* renamed from: d */
    public DynamicRootView mo63275d() {
        return this.f25513a;
    }

    /* renamed from: a */
    public void mo63273a(C10290g gVar) {
        this.f25517e = gVar;
    }

    /* renamed from: g */
    private boolean m29811g() {
        DynamicRootView dynamicRootView = this.f25513a;
        if (dynamicRootView == null || dynamicRootView.getChildCount() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo63174a(C10298m mVar) {
        if (!this.f25520h.get()) {
            this.f25520h.set(true);
            if (!mVar.mo63212a() || !m29811g()) {
                this.f25516d.mo1929a(mVar.mo63229h());
                return;
            }
            this.f25513a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f25516d.mo1930a(mo1946e(), mVar);
        }
    }

    /* renamed from: a */
    public void mo63173a(View view, int i, C10281b bVar) {
        C10290g gVar = this.f25517e;
        if (gVar != null) {
            gVar.mo965a(view, i, bVar);
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.a.a$a */
    /* compiled from: DynamicRender */
    private class C10320a implements Runnable {

        /* renamed from: b */
        private int f25527b;

        public C10320a(int i) {
            this.f25527b = i;
        }

        public void run() {
            if (this.f25527b == 2) {
                C10638l.m31235b("DynamicRender", "Dynamic parse time out");
                C10315a.this.f25513a.mo63654a(C10315a.this.f25514b instanceof C10368h ? 127 : 117);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m29812h() {
        try {
            if (this.f25519g != null && !this.f25519g.isCancelled()) {
                this.f25519g.cancel(false);
                this.f25519g = null;
            }
            C10638l.m31235b("DynamicRender", "WebView Render cancel timeout timer");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
