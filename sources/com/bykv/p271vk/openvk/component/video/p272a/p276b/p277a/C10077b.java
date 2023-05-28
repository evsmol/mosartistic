package com.bykv.p271vk.openvk.component.video.p272a.p276b.p277a;

import android.content.Context;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.C10102d;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p278b.C10093c;
import com.bykv.p271vk.openvk.component.video.p272a.p283c.C10148a;
import com.bytedance.sdk.component.p328f.C10618g;
import java.io.File;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.a.b */
/* compiled from: DiskCache */
public class C10077b extends C10076a {

    /* renamed from: a */
    public final File f24893a;

    /* renamed from: a */
    public void mo62678a() {
        C10148a.m28908a((C10618g) new C10618g("clear") {
            public void run() {
                C10077b.this.mo62679b();
            }
        });
    }

    /* renamed from: b */
    public void mo62679b() {
        C10102d.m28766c().mo62732d();
        Context a = C10112e.m28782a();
        if (a != null) {
            C10093c.m28755a(a).mo62713a(1);
        }
        for (File delete : this.f24893a.listFiles()) {
            try {
                delete.delete();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    public File mo62676c(String str) {
        return mo62680e(str);
    }

    /* renamed from: d */
    public File mo62677d(String str) {
        return mo62680e(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public File mo62680e(String str) {
        return new File(this.f24893a, str);
    }
}
