package com.bykv.p271vk.openvk.component.video.p272a.p276b.p281e;

import com.bykv.p271vk.openvk.component.video.p272a.p276b.C10139i;
import com.bytedance.sdk.component.p307b.p308a.C10469e;
import com.bytedance.sdk.component.p307b.p308a.C10483m;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.e.f */
/* compiled from: VolleyResponseWrapper */
public class C10120f extends C10114a {

    /* renamed from: c */
    private C10483m f24997c;

    public C10120f(C10483m mVar, C10119e eVar) {
        C10469e g;
        this.f24997c = mVar;
        this.f24988a = new ArrayList();
        if (!(mVar == null || (g = mVar.mo63894g()) == null)) {
            for (int i = 0; i < g.mo63945a(); i++) {
                this.f24988a.add(new C10139i.C10141b(g.mo63946a(i), g.mo63947b(i)));
            }
        }
        this.f24989b = eVar;
    }

    /* renamed from: a */
    public int mo62743a() {
        return this.f24997c.mo63889c();
    }

    /* renamed from: b */
    public boolean mo62747b() {
        return this.f24997c.mo63889c() >= 200 && this.f24997c.mo63889c() < 300;
    }

    /* renamed from: a */
    public String mo62746a(String str, String str2) {
        return mo62744a(str) != null ? mo62744a(str).f25060b : str2;
    }

    /* renamed from: c */
    public List<C10139i.C10141b> mo62748c() {
        return this.f24988a;
    }

    /* renamed from: d */
    public InputStream mo62749d() {
        return this.f24997c.mo63893f().mo63899c();
    }

    /* renamed from: e */
    public String mo62750e() {
        C10483m mVar = this.f24997c;
        return (mVar == null || mVar.mo63895h() == null) ? "http/1.1" : this.f24997c.mo63895h().toString();
    }

    /* renamed from: f */
    public String mo62751f() {
        return mo62745a(this.f24997c.mo63889c());
    }
}
