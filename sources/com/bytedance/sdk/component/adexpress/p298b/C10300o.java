package com.bytedance.sdk.component.adexpress.p298b;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.p298b.C10292i;
import com.bytedance.sdk.component.adexpress.p300d.C10308a;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.utils.C10638l;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.component.adexpress.b.o */
/* compiled from: WebViewRenderInterceptor */
public class C10300o implements C10292i {

    /* renamed from: a */
    private Context f25467a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C10308a f25468b;

    /* renamed from: c */
    private C10290g f25469c;

    /* renamed from: d */
    private C10296l f25470d;

    /* renamed from: e */
    private ScheduledFuture<?> f25471e;

    /* renamed from: f */
    private AtomicBoolean f25472f = new AtomicBoolean(false);

    public C10300o(Context context, C10296l lVar, C10308a aVar, C10290g gVar) {
        this.f25467a = context;
        this.f25470d = lVar;
        this.f25469c = gVar;
        this.f25468b = aVar;
        aVar.mo63237a(this.f25469c);
    }

    /* renamed from: a */
    public boolean mo63161a(final C10292i.C10293a aVar) {
        int d = this.f25470d.mo63178d();
        if (d < 0) {
            m29731a(aVar, 107);
        } else {
            this.f25471e = C10615e.m31169d().schedule(new C10302a(1, aVar), (long) d, TimeUnit.MILLISECONDS);
            this.f25468b.mo1937a((C10289f) new C10289f() {
                /* renamed from: a */
                public void mo1930a(View view, C10298m mVar) {
                    C10299n b;
                    C10300o.this.m29735e();
                    if (!aVar.mo63172c() && (b = aVar.mo63170b()) != null) {
                        b.mo966a(C10300o.this.f25468b, mVar);
                        aVar.mo63169a(true);
                    }
                }

                /* renamed from: a */
                public void mo1929a(int i) {
                    C10300o.this.m29731a(aVar, i);
                }
            });
        }
        return true;
    }

    /* renamed from: a */
    public void mo63160a() {
        this.f25468b.mo1996d();
        m29735e();
    }

    /* renamed from: b */
    public void mo63162b() {
        this.f25468b.mo63241h();
    }

    /* renamed from: c */
    public void mo63163c() {
        this.f25468b.mo63242i();
    }

    /* renamed from: d */
    public C10308a mo63234d() {
        return this.f25468b;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m29735e() {
        try {
            if (this.f25471e != null && !this.f25471e.isCancelled()) {
                this.f25471e.cancel(false);
                this.f25471e = null;
            }
            C10638l.m31235b("RenderInterceptor", "WebView Render cancel timeout timer");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.b.o$a */
    /* compiled from: WebViewRenderInterceptor */
    private class C10302a implements Runnable {

        /* renamed from: a */
        C10292i.C10293a f25475a;

        /* renamed from: c */
        private int f25477c;

        public C10302a(int i, C10292i.C10293a aVar) {
            this.f25477c = i;
            this.f25475a = aVar;
        }

        public void run() {
            if (this.f25477c == 1) {
                C10638l.m31235b("RenderInterceptor", "WebView Render timeout");
                C10300o.this.f25468b.mo63239a(true);
                C10300o.this.m29731a(this.f25475a, 107);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m29731a(C10292i.C10293a aVar, int i) {
        if (!aVar.mo63172c() && !this.f25472f.get()) {
            m29735e();
            this.f25470d.mo63177c().mo1962a(i);
            if (aVar.mo63171b(this)) {
                aVar.mo63167a((C10292i) this);
            } else {
                C10299n b = aVar.mo63170b();
                if (b != null) {
                    b.mo1880a_(i);
                } else {
                    return;
                }
            }
            this.f25472f.getAndSet(true);
        }
    }
}
