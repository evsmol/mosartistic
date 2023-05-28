package com.bytedance.sdk.component.p307b.p308a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.b.a.k */
/* compiled from: Request */
public abstract class C10479k {

    /* renamed from: a */
    public C10476i f26134a;

    /* renamed from: a */
    public abstract Object mo63973a();

    /* renamed from: b */
    public abstract C10470f mo63975b();

    /* renamed from: c */
    public abstract String mo63976c();

    /* renamed from: d */
    public abstract Map<String, List<String>> mo63977d();

    /* renamed from: e */
    public abstract C10444a mo63978e();

    /* renamed from: f */
    public C10482l mo63979f() {
        return null;
    }

    /* renamed from: a */
    public void mo63974a(C10476i iVar) {
        this.f26134a = iVar;
    }

    /* renamed from: g */
    public C10480a mo63980g() {
        return new C10480a(this);
    }

    /* renamed from: com.bytedance.sdk.component.b.a.k$a */
    /* compiled from: Request */
    public static class C10480a {

        /* renamed from: a */
        C10444a f26135a;

        /* renamed from: b */
        Map<String, List<String>> f26136b;

        /* renamed from: c */
        C10470f f26137c;

        /* renamed from: d */
        String f26138d;

        /* renamed from: e */
        Object f26139e;

        /* renamed from: f */
        C10482l f26140f;

        public C10480a() {
            this.f26136b = new HashMap();
        }

        /* renamed from: a */
        public C10480a mo63982a(C10444a aVar) {
            this.f26135a = aVar;
            return this;
        }

        C10480a(C10479k kVar) {
            this.f26137c = kVar.mo63975b();
            this.f26138d = kVar.mo63976c();
            this.f26136b = kVar.mo63977d();
            this.f26139e = kVar.mo63973a();
            this.f26140f = kVar.mo63979f();
            this.f26135a = kVar.mo63978e();
        }

        /* renamed from: a */
        public C10480a mo63985a(Object obj) {
            this.f26139e = obj;
            return this;
        }

        /* renamed from: a */
        public C10480a mo63986a(String str) {
            return mo63983a(C10470f.m30553c(str));
        }

        /* renamed from: a */
        public C10480a mo63983a(C10470f fVar) {
            this.f26137c = fVar;
            return this;
        }

        /* renamed from: a */
        public C10480a mo63987a(String str, String str2) {
            return mo63988b(str, str2);
        }

        /* renamed from: b */
        public C10480a mo63988b(String str, String str2) {
            if (!this.f26136b.containsKey(str)) {
                this.f26136b.put(str, new ArrayList());
            }
            this.f26136b.get(str).add(str2);
            return this;
        }

        /* renamed from: a */
        public C10480a mo63981a() {
            return m30599a("GET", (C10482l) null);
        }

        /* renamed from: a */
        private C10480a m30599a(String str, C10482l lVar) {
            this.f26138d = str;
            this.f26140f = lVar;
            return this;
        }

        /* renamed from: a */
        public C10480a mo63984a(C10482l lVar) {
            return m30599a("POST", lVar);
        }

        /* renamed from: b */
        public C10479k mo63989b() {
            return new C10479k() {
                public String toString() {
                    return "";
                }

                /* renamed from: a */
                public Object mo63973a() {
                    return C10480a.this.f26139e;
                }

                /* renamed from: b */
                public C10470f mo63975b() {
                    return C10480a.this.f26137c;
                }

                /* renamed from: c */
                public String mo63976c() {
                    return C10480a.this.f26138d;
                }

                /* renamed from: d */
                public Map mo63977d() {
                    return C10480a.this.f26136b;
                }

                /* renamed from: e */
                public C10444a mo63978e() {
                    return C10480a.this.f26135a;
                }

                /* renamed from: f */
                public C10482l mo63979f() {
                    return C10480a.this.f26140f;
                }
            };
        }
    }
}
