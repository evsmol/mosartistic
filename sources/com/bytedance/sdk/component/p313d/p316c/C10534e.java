package com.bytedance.sdk.component.p313d.p316c;

import android.content.Context;
import com.bytedance.sdk.component.p313d.C10492b;
import com.bytedance.sdk.component.p313d.C10498c;
import com.bytedance.sdk.component.p313d.C10540d;
import com.bytedance.sdk.component.p313d.C10562k;
import com.bytedance.sdk.component.p313d.C10563l;
import com.bytedance.sdk.component.p313d.C10566o;
import com.bytedance.sdk.component.p313d.C10567p;
import com.bytedance.sdk.component.p313d.C10568q;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.sdk.component.d.c.e */
/* compiled from: LoadConfig */
public class C10534e implements C10563l {

    /* renamed from: a */
    private C10562k f26304a;

    /* renamed from: b */
    private ExecutorService f26305b;

    /* renamed from: c */
    private C10540d f26306c;

    /* renamed from: d */
    private C10567p f26307d;

    /* renamed from: e */
    private C10568q f26308e;

    /* renamed from: f */
    private C10498c f26309f;

    /* renamed from: g */
    private C10566o f26310g;

    /* renamed from: h */
    private C10492b f26311h;

    private C10534e(C10536a aVar) {
        this.f26304a = aVar.f26312a;
        this.f26305b = aVar.f26313b;
        this.f26306c = aVar.f26314c;
        this.f26307d = aVar.f26315d;
        this.f26308e = aVar.f26316e;
        this.f26309f = aVar.f26317f;
        this.f26311h = aVar.f26319h;
        this.f26310g = aVar.f26318g;
    }

    /* renamed from: a */
    public C10562k mo64121a() {
        return this.f26304a;
    }

    /* renamed from: b */
    public ExecutorService mo64122b() {
        return this.f26305b;
    }

    /* renamed from: c */
    public C10540d mo64123c() {
        return this.f26306c;
    }

    /* renamed from: d */
    public C10567p mo64124d() {
        return this.f26307d;
    }

    /* renamed from: e */
    public C10568q mo64125e() {
        return this.f26308e;
    }

    /* renamed from: f */
    public C10498c mo64126f() {
        return this.f26309f;
    }

    /* renamed from: g */
    public C10566o mo64127g() {
        return this.f26310g;
    }

    /* renamed from: h */
    public C10492b mo64128h() {
        return this.f26311h;
    }

    /* renamed from: a */
    public static C10534e m30864a(Context context) {
        return new C10536a().mo64132a();
    }

    /* renamed from: com.bytedance.sdk.component.d.c.e$a */
    /* compiled from: LoadConfig */
    public static class C10536a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C10562k f26312a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public ExecutorService f26313b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C10540d f26314c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C10567p f26315d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C10568q f26316e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C10498c f26317f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C10566o f26318g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C10492b f26319h;

        /* renamed from: a */
        public C10536a mo64129a(C10492b bVar) {
            this.f26319h = bVar;
            return this;
        }

        /* renamed from: a */
        public C10536a mo64131a(ExecutorService executorService) {
            this.f26313b = executorService;
            return this;
        }

        /* renamed from: a */
        public C10536a mo64130a(C10540d dVar) {
            this.f26314c = dVar;
            return this;
        }

        /* renamed from: a */
        public C10534e mo64132a() {
            return new C10534e(this);
        }
    }
}
