package com.bytedance.sdk.openadsdk.p042h.p045c;

import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.openadsdk.multipro.p054c.C0938a;
import com.bytedance.sdk.openadsdk.p042h.C0793a;
import com.bytedance.sdk.openadsdk.p042h.p045c.C0818c;
import com.bytedance.sdk.openadsdk.utils.C0984l;
import com.bytedance.sdk.openadsdk.utils.C0995t;

/* renamed from: com.bytedance.sdk.openadsdk.h.c.d */
/* compiled from: LogUploaderImpl4MultiProcess */
public class C0822d implements C0816a {
    /* renamed from: b */
    public void mo2624b() {
    }

    /* renamed from: a */
    public void mo2621a() {
        C0938a.m4354e();
    }

    /* renamed from: a */
    public void mo2622a(final C0793a aVar) {
        try {
            C0995t.m4609b(new C10618g("uploadEvent") {
                public void run() {
                    try {
                        C0938a.m4351b(aVar.mo322a().mo2576a().toString());
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public String m4042b(C0793a aVar) throws Exception {
        return new C0818c.C0821a(C0984l.m4553a(), aVar.mo322a().mo2576a()).mo2630a();
    }

    /* renamed from: a */
    public void mo2623a(final C0793a aVar, final boolean z) {
        try {
            C0995t.m4609b(new C10618g("uploadEvent") {
                public void run() {
                    try {
                        C0938a.m4348a(C0822d.this.m4042b(aVar), z);
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }
}
