package com.bytedance.sdk.component.p307b.p308a;

import com.bytedance.sdk.component.p307b.p308a.p309a.C10446a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.component.b.a.i */
/* compiled from: OkHttpClient */
public abstract class C10476i implements Cloneable {

    /* renamed from: a */
    public List<C10473g> f26114a;

    /* renamed from: b */
    public long f26115b;

    /* renamed from: c */
    public TimeUnit f26116c;

    /* renamed from: d */
    public long f26117d;

    /* renamed from: e */
    public TimeUnit f26118e;

    /* renamed from: f */
    public long f26119f;

    /* renamed from: g */
    public TimeUnit f26120g;

    /* renamed from: a */
    public abstract C10457b mo63868a(C10479k kVar);

    /* renamed from: a */
    public abstract C10468d mo63869a();

    public C10476i(C10477a aVar) {
        this.f26115b = aVar.f26122b;
        this.f26117d = aVar.f26124d;
        this.f26119f = aVar.f26126f;
        this.f26114a = aVar.f26121a;
        this.f26116c = aVar.f26123c;
        this.f26118e = aVar.f26125e;
        this.f26120g = aVar.f26127g;
        this.f26114a = aVar.f26121a;
    }

    /* renamed from: com.bytedance.sdk.component.b.a.i$a */
    /* compiled from: OkHttpClient */
    public static final class C10477a {

        /* renamed from: a */
        public final List<C10473g> f26121a = new ArrayList();

        /* renamed from: b */
        public long f26122b = 10000;

        /* renamed from: c */
        public TimeUnit f26123c = TimeUnit.MILLISECONDS;

        /* renamed from: d */
        public long f26124d = 10000;

        /* renamed from: e */
        public TimeUnit f26125e = TimeUnit.MILLISECONDS;

        /* renamed from: f */
        public long f26126f = 10000;

        /* renamed from: g */
        public TimeUnit f26127g = TimeUnit.MILLISECONDS;

        public C10477a() {
        }

        public C10477a(C10476i iVar) {
            this.f26122b = iVar.f26115b;
            this.f26123c = iVar.f26116c;
            this.f26124d = iVar.f26117d;
            this.f26125e = iVar.f26118e;
            this.f26126f = iVar.f26119f;
            this.f26127g = iVar.f26120g;
        }

        /* renamed from: a */
        public C10477a mo63967a(long j, TimeUnit timeUnit) {
            this.f26122b = j;
            this.f26123c = timeUnit;
            return this;
        }

        /* renamed from: b */
        public C10477a mo63970b(long j, TimeUnit timeUnit) {
            this.f26124d = j;
            this.f26125e = timeUnit;
            return this;
        }

        /* renamed from: c */
        public C10477a mo63971c(long j, TimeUnit timeUnit) {
            this.f26126f = j;
            this.f26127g = timeUnit;
            return this;
        }

        /* renamed from: a */
        public C10477a mo63968a(C10473g gVar) {
            this.f26121a.add(gVar);
            return this;
        }

        /* renamed from: a */
        public C10476i mo63969a() {
            return C10446a.m30443a(this);
        }
    }

    /* renamed from: b */
    public C10477a mo63966b() {
        return new C10477a(this);
    }
}
