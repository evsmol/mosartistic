package com.bytedance.sdk.openadsdk.p000b.p002b.p004b;

import com.bykv.p271vk.openvk.component.video.api.p288c.C10188c;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.o */
/* compiled from: VideoLogHelperModel */
public class C0130o {

    /* renamed from: a */
    private long f506a;

    /* renamed from: b */
    private String f507b;

    /* renamed from: c */
    private int f508c;

    /* renamed from: d */
    private C10188c f509d;

    /* renamed from: e */
    private C0477n f510e;

    public C0130o(long j, String str, int i, C10188c cVar, C0477n nVar) {
        this.f506a = j;
        this.f507b = str;
        this.f508c = i;
        this.f509d = cVar;
        this.f510e = nVar;
    }

    /* renamed from: a */
    public long mo365a() {
        return this.f506a;
    }

    /* renamed from: b */
    public String mo366b() {
        return this.f507b;
    }

    /* renamed from: c */
    public int mo367c() {
        return this.f508c;
    }

    /* renamed from: d */
    public C10188c mo368d() {
        return this.f509d;
    }

    /* renamed from: e */
    public C0477n mo369e() {
        return this.f510e;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.b.b.b.o$a */
    /* compiled from: VideoLogHelperModel */
    public static class C0131a {

        /* renamed from: a */
        private long f511a = 0;

        /* renamed from: b */
        private long f512b = 0;

        /* renamed from: c */
        private long f513c = 0;

        /* renamed from: d */
        private boolean f514d = false;

        /* renamed from: e */
        private int f515e = 0;

        /* renamed from: f */
        private int f516f = 0;

        /* renamed from: g */
        private int f517g;

        /* renamed from: h */
        private int f518h;

        /* renamed from: i */
        private int f519i;

        /* renamed from: j */
        private int f520j;

        /* renamed from: k */
        private int f521k;

        /* renamed from: l */
        private boolean f522l = false;

        /* renamed from: a */
        public long mo370a() {
            return this.f511a;
        }

        /* renamed from: a */
        public void mo372a(long j) {
            this.f511a = j;
        }

        /* renamed from: b */
        public long mo374b() {
            return this.f512b;
        }

        /* renamed from: b */
        public void mo376b(long j) {
            this.f512b = j;
        }

        /* renamed from: c */
        public long mo377c() {
            return this.f513c;
        }

        /* renamed from: c */
        public void mo379c(long j) {
            this.f513c = j;
        }

        /* renamed from: d */
        public int mo380d() {
            return this.f515e;
        }

        /* renamed from: a */
        public void mo371a(int i) {
            this.f515e = i;
        }

        /* renamed from: e */
        public int mo382e() {
            return this.f516f;
        }

        /* renamed from: b */
        public void mo375b(int i) {
            this.f516f = i;
        }

        /* renamed from: f */
        public int mo384f() {
            return this.f517g;
        }

        /* renamed from: c */
        public void mo378c(int i) {
            this.f517g = i;
        }

        /* renamed from: g */
        public int mo386g() {
            return this.f518h;
        }

        /* renamed from: d */
        public void mo381d(int i) {
            this.f518h = i;
        }

        /* renamed from: h */
        public int mo387h() {
            long j = this.f513c;
            if (j <= 0) {
                return 0;
            }
            return Math.min((int) ((this.f511a * 100) / j), 100);
        }

        /* renamed from: i */
        public int mo388i() {
            return this.f519i;
        }

        /* renamed from: e */
        public void mo383e(int i) {
            this.f519i = i;
        }

        /* renamed from: j */
        public int mo389j() {
            return this.f520j;
        }

        /* renamed from: k */
        public int mo390k() {
            return this.f521k;
        }

        /* renamed from: f */
        public void mo385f(int i) {
            this.f521k = i;
        }

        /* renamed from: l */
        public boolean mo391l() {
            return this.f522l;
        }

        /* renamed from: m */
        public boolean mo392m() {
            return this.f514d;
        }

        /* renamed from: a */
        public void mo373a(boolean z) {
            this.f514d = z;
        }
    }
}
