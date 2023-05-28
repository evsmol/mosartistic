package com.bytedance.sdk.component.adexpress.p298b;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.C10353c;
import com.bytedance.sdk.component.adexpress.dynamic.p301a.C10315a;
import com.bytedance.sdk.component.adexpress.dynamic.p304c.C10368h;
import com.bytedance.sdk.component.adexpress.dynamic.p304c.C10370i;
import com.bytedance.sdk.component.adexpress.dynamic.p305d.C10375a;
import com.bytedance.sdk.component.adexpress.p298b.C10292i;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;

/* renamed from: com.bytedance.sdk.component.adexpress.b.b */
/* compiled from: DynamicRenderInterceptor */
public class C10283b implements C10292i {

    /* renamed from: a */
    private Context f25397a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C10315a f25398b;

    /* renamed from: c */
    private ThemeStatusBroadcastReceiver f25399c;

    /* renamed from: d */
    private C10290g f25400d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C10296l f25401e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f25402f;

    /* renamed from: b */
    public void mo63162b() {
    }

    /* renamed from: c */
    public void mo63163c() {
    }

    public C10283b(Context context, C10296l lVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, C10370i iVar, C10290g gVar, C10375a aVar) {
        this.f25397a = context;
        this.f25401e = lVar;
        this.f25399c = themeStatusBroadcastReceiver;
        this.f25400d = gVar;
        C10315a aVar2 = new C10315a(context, themeStatusBroadcastReceiver, z, iVar, lVar, aVar);
        this.f25398b = aVar2;
        aVar2.mo63273a(this.f25400d);
        if (iVar instanceof C10368h) {
            this.f25402f = 3;
        } else {
            this.f25402f = 2;
        }
    }

    /* renamed from: a */
    public boolean mo63161a(final C10292i.C10293a aVar) {
        this.f25401e.mo63177c().mo1966b(this.f25402f);
        this.f25398b.mo1937a((C10289f) new C10289f() {
            /* renamed from: a */
            public void mo1930a(View view, C10298m mVar) {
                if (!aVar.mo63172c()) {
                    C10283b.this.f25401e.mo63177c().mo1974f(C10283b.this.f25402f);
                    C10283b.this.f25401e.mo63177c().mo1976g(C10283b.this.f25402f);
                    C10283b.this.f25401e.mo63177c().mo1977h();
                    C10299n b = aVar.mo63170b();
                    if (b != null) {
                        b.mo966a(C10283b.this.f25398b, mVar);
                        aVar.mo63169a(true);
                    }
                }
            }

            /* renamed from: a */
            public void mo1929a(int i) {
                C10283b.this.f25401e.mo63177c().mo1963a(C10283b.this.f25402f, i, aVar.mo63171b(C10283b.this));
                if (aVar.mo63171b(C10283b.this)) {
                    aVar.mo63167a((C10292i) C10283b.this);
                    return;
                }
                C10299n b = aVar.mo63170b();
                if (b != null) {
                    b.mo1880a_(i);
                }
            }
        });
        return true;
    }

    /* renamed from: a */
    public void mo63160a() {
        C10315a aVar = this.f25398b;
        if (aVar != null) {
            aVar.mo63274b();
        }
    }

    /* renamed from: d */
    public C10353c mo63164d() {
        C10315a aVar = this.f25398b;
        if (aVar != null) {
            return aVar.mo63275d();
        }
        return null;
    }
}
