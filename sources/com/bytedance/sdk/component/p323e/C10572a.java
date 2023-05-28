package com.bytedance.sdk.component.p323e;

import android.content.Context;
import com.bytedance.sdk.component.p307b.p308a.C10473g;
import com.bytedance.sdk.component.p307b.p308a.C10476i;
import com.bytedance.sdk.component.p323e.p325b.C10577a;
import com.bytedance.sdk.component.p323e.p325b.C10579b;
import com.bytedance.sdk.component.p323e.p325b.C10582d;
import com.bytedance.sdk.component.p323e.p326c.C10588b;
import com.bytedance.sdk.component.p323e.p326c.C10593f;
import com.bytedance.sdk.component.p323e.p326c.C10594g;
import com.bytedance.sdk.component.p323e.p327d.C10596b;
import com.bytedance.sdk.component.p323e.p327d.C10604f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.component.e.a */
/* compiled from: NetClient */
public class C10572a {

    /* renamed from: a */
    private C10476i f26352a;

    /* renamed from: b */
    private C10593f f26353b;

    /* renamed from: c */
    private int f26354c;

    private C10572a(C10574a aVar) {
        C10476i.C10477a b = new C10476i.C10477a().mo63967a((long) aVar.f26355a, TimeUnit.MILLISECONDS).mo63971c((long) aVar.f26357c, TimeUnit.MILLISECONDS).mo63970b((long) aVar.f26356b, TimeUnit.MILLISECONDS);
        if (aVar.f26358d) {
            C10593f fVar = new C10593f();
            this.f26353b = fVar;
            b.mo63968a(fVar);
        }
        if (aVar.f26359e != null && aVar.f26359e.size() > 0) {
            for (C10473g a : aVar.f26359e) {
                b.mo63968a(a);
            }
        }
        this.f26352a = b.mo63969a();
    }

    /* renamed from: a */
    public void mo64149a(Context context, boolean z, boolean z2, C10588b bVar) {
        if (context == null) {
            throw new IllegalArgumentException("tryInitAdTTNet context is null");
        } else if (bVar != null) {
            int a = bVar.mo2649a();
            this.f26354c = a;
            C10593f fVar = this.f26353b;
            if (fVar != null) {
                fVar.mo64220a(a);
            }
            C10594g.m31112a().mo64222a(this.f26354c).mo64211a(z2);
            C10594g.m31112a().mo64222a(this.f26354c).mo64210a(bVar);
            C10594g.m31112a().mo64222a(this.f26354c).mo64207a(context, C10604f.m31132b(context));
            if (C10604f.m31131a(context) || (!C10604f.m31132b(context) && z)) {
                C10594g.m31112a().mo64221a(this.f26354c, context).mo64194d();
                C10594g.m31112a().mo64221a(this.f26354c, context).mo64187a();
            }
            if (C10604f.m31132b(context)) {
                C10594g.m31112a().mo64221a(this.f26354c, context).mo64194d();
                C10594g.m31112a().mo64221a(this.f26354c, context).mo64187a();
            }
        } else {
            throw new IllegalArgumentException("tryInitAdTTNet ITTAdNetDepend is null");
        }
    }

    /* renamed from: a */
    public static void m30985a() {
        C10596b.m31117a(C10596b.C10598a.DEBUG);
    }

    /* renamed from: b */
    public C10582d mo64150b() {
        return new C10582d(this.f26352a);
    }

    /* renamed from: c */
    public C10579b mo64151c() {
        return new C10579b(this.f26352a);
    }

    /* renamed from: d */
    public C10577a mo64152d() {
        return new C10577a(this.f26352a);
    }

    /* renamed from: e */
    public C10476i mo64153e() {
        return this.f26352a;
    }

    /* renamed from: com.bytedance.sdk.component.e.a$a */
    /* compiled from: NetClient */
    public static final class C10574a {

        /* renamed from: a */
        int f26355a = 10000;

        /* renamed from: b */
        int f26356b = 10000;

        /* renamed from: c */
        int f26357c = 10000;

        /* renamed from: d */
        boolean f26358d = true;

        /* renamed from: e */
        final List<C10473g> f26359e = new ArrayList();

        /* renamed from: a */
        public C10574a mo64154a(long j, TimeUnit timeUnit) {
            this.f26355a = m30991a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: b */
        public C10574a mo64157b(long j, TimeUnit timeUnit) {
            this.f26356b = m30991a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: c */
        public C10574a mo64158c(long j, TimeUnit timeUnit) {
            this.f26357c = m30991a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: a */
        public C10574a mo64155a(boolean z) {
            this.f26358d = z;
            return this;
        }

        /* renamed from: a */
        private static int m30991a(String str, long j, TimeUnit timeUnit) {
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i < 0) {
                throw new IllegalArgumentException(str + " < 0");
            } else if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis > 2147483647L) {
                    throw new IllegalArgumentException(str + " too large.");
                } else if (millis != 0 || i <= 0) {
                    return (int) millis;
                } else {
                    throw new IllegalArgumentException(str + " too small.");
                }
            } else {
                throw new NullPointerException("unit == null");
            }
        }

        /* renamed from: a */
        public C10572a mo64156a() {
            return new C10572a(this);
        }
    }
}
