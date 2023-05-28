package com.bytedance.sdk.component.adexpress.p298b;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.p298b.C10292i;

/* renamed from: com.bytedance.sdk.component.adexpress.b.e */
/* compiled from: NativeRenderInterceptor */
public class C10287e implements C10292i {

    /* renamed from: a */
    private Context f25405a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C10282a f25406b;

    /* renamed from: c */
    private C10296l f25407c;

    /* renamed from: a */
    public void mo63160a() {
    }

    /* renamed from: b */
    public void mo63162b() {
    }

    /* renamed from: c */
    public void mo63163c() {
    }

    public C10287e(Context context, C10296l lVar, C10282a aVar) {
        this.f25405a = context;
        this.f25406b = aVar;
        this.f25407c = lVar;
    }

    /* renamed from: a */
    public boolean mo63161a(final C10292i.C10293a aVar) {
        this.f25407c.mo63177c().mo1969d();
        this.f25406b.mo1937a(new C10289f() {
            /* renamed from: a */
            public void mo1930a(View view, C10298m mVar) {
                if (!aVar.mo63172c()) {
                    C10299n b = aVar.mo63170b();
                    if (b != null) {
                        b.mo966a(C10287e.this.f25406b, mVar);
                    }
                    aVar.mo63169a(true);
                }
            }

            /* renamed from: a */
            public void mo1929a(int i) {
                C10299n b = aVar.mo63170b();
                if (b != null) {
                    b.mo1880a_(i);
                }
            }
        });
        return true;
    }

    /* renamed from: a */
    public void mo63165a(C10285c cVar) {
        this.f25406b.mo1982a(cVar);
    }
}
