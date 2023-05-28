package com.bykv.p271vk.openvk.component.video.api.p288c;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.component.video.api.c.c */
/* compiled from: VideoUrlModel */
public class C10188c implements Serializable {

    /* renamed from: a */
    public String f25185a;

    /* renamed from: b */
    public int f25186b;

    /* renamed from: c */
    public final HashMap<String, Object> f25187c = new HashMap<>();

    /* renamed from: d */
    private C10187b f25188d;

    /* renamed from: e */
    private C10187b f25189e;

    /* renamed from: f */
    private String f25190f;

    /* renamed from: g */
    private int f25191g = 204800;

    /* renamed from: h */
    private String f25192h;

    /* renamed from: i */
    private int f25193i;

    /* renamed from: j */
    private int f25194j;

    /* renamed from: k */
    private List<String> f25195k;

    /* renamed from: l */
    private String f25196l;

    /* renamed from: m */
    private long f25197m;

    /* renamed from: n */
    private boolean f25198n;

    /* renamed from: o */
    private int f25199o = 0;

    /* renamed from: p */
    private int f25200p = 0;

    /* renamed from: q */
    private int f25201q = 10000;

    /* renamed from: r */
    private int f25202r = 10000;

    /* renamed from: s */
    private int f25203s = 10000;

    /* renamed from: t */
    private int f25204t = 0;

    public C10188c(String str, C10187b bVar, C10187b bVar2, int i, int i2) {
        this.f25190f = str;
        this.f25188d = bVar;
        this.f25189e = bVar2;
        this.f25199o = i;
        this.f25200p = i2;
    }

    /* renamed from: a */
    public String mo62936a() {
        return this.f25190f;
    }

    /* renamed from: a */
    public void mo62939a(String str) {
        this.f25190f = str;
    }

    /* renamed from: b */
    public int mo62943b() {
        if (mo62960i()) {
            return this.f25189e.mo62928m();
        }
        C10187b bVar = this.f25188d;
        if (bVar != null) {
            return bVar.mo62928m();
        }
        return 0;
    }

    /* renamed from: b */
    public void mo62945b(String str) {
        this.f25192h = str;
    }

    /* renamed from: c */
    public int mo62946c() {
        return this.f25193i;
    }

    /* renamed from: a */
    public void mo62937a(int i) {
        this.f25193i = i;
    }

    /* renamed from: d */
    public int mo62949d() {
        return this.f25194j;
    }

    /* renamed from: b */
    public void mo62944b(int i) {
        this.f25194j = i;
    }

    /* renamed from: a */
    public void mo62941a(List<String> list) {
        this.f25195k = list;
    }

    /* renamed from: c */
    public void mo62948c(String str) {
        this.f25196l = str;
    }

    /* renamed from: e */
    public long mo62952e() {
        return this.f25197m;
    }

    /* renamed from: a */
    public void mo62938a(long j) {
        this.f25197m = j;
    }

    /* renamed from: f */
    public boolean mo62956f() {
        return this.f25198n;
    }

    /* renamed from: a */
    public void mo62942a(boolean z) {
        this.f25198n = z;
    }

    /* renamed from: g */
    public long mo62957g() {
        if (mo62960i()) {
            return this.f25189e.mo62913e();
        }
        C10187b bVar = this.f25188d;
        if (bVar != null) {
            return bVar.mo62913e();
        }
        return 0;
    }

    /* renamed from: h */
    public boolean mo62959h() {
        if (mo62960i()) {
            return this.f25189e.mo62935t();
        }
        C10187b bVar = this.f25188d;
        if (bVar != null) {
            return bVar.mo62935t();
        }
        return true;
    }

    /* renamed from: d */
    public void mo62951d(String str) {
        this.f25185a = str;
    }

    /* renamed from: c */
    public void mo62947c(int i) {
        this.f25186b = i;
    }

    /* renamed from: i */
    public boolean mo62960i() {
        return this.f25199o == 1 && this.f25200p == 1 && this.f25189e != null;
    }

    /* renamed from: j */
    public String mo62961j() {
        if (mo62960i()) {
            return this.f25189e.mo62923i();
        }
        C10187b bVar = this.f25188d;
        if (bVar != null) {
            return bVar.mo62923i();
        }
        return null;
    }

    /* renamed from: k */
    public String mo62962k() {
        if (mo62960i()) {
            return this.f25189e.mo62927l();
        }
        C10187b bVar = this.f25188d;
        if (bVar != null) {
            return bVar.mo62927l();
        }
        return null;
    }

    /* renamed from: l */
    public int mo62963l() {
        return this.f25199o;
    }

    /* renamed from: a */
    public synchronized void mo62940a(String str, Object obj) {
        this.f25187c.put(str, obj);
    }

    /* renamed from: e */
    public synchronized Object mo62953e(String str) {
        return this.f25187c.get(str);
    }

    /* renamed from: m */
    public int mo62964m() {
        return this.f25201q;
    }

    /* renamed from: d */
    public void mo62950d(int i) {
        this.f25201q = i;
    }

    /* renamed from: n */
    public int mo62965n() {
        return this.f25202r;
    }

    /* renamed from: e */
    public void mo62954e(int i) {
        this.f25202r = i;
    }

    /* renamed from: o */
    public int mo62966o() {
        return this.f25203s;
    }

    /* renamed from: f */
    public void mo62955f(int i) {
        this.f25203s = i;
    }

    /* renamed from: p */
    public int mo62967p() {
        return this.f25204t;
    }

    /* renamed from: g */
    public void mo62958g(int i) {
        this.f25204t = i;
    }

    /* renamed from: q */
    public C10187b mo62968q() {
        return this.f25188d;
    }

    /* renamed from: r */
    public C10187b mo62969r() {
        return this.f25189e;
    }
}
