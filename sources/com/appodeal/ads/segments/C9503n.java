package com.appodeal.ads.segments;

import android.content.Context;
import com.appodeal.ads.C9422r0;
import com.appodeal.ads.C9577u;
import com.appodeal.ads.context.C9148b;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.segments.C9495j;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.segments.n */
public final class C9503n {

    /* renamed from: a */
    public static final Lazy f24120a = LazyKt.lazy(C9505b.f24126a);

    /* renamed from: b */
    public static final C9499k f24121b;

    /* renamed from: c */
    public static final LinkedHashSet f24122c = new LinkedHashSet();

    /* renamed from: d */
    public static final CopyOnWriteArrayList f24123d = new CopyOnWriteArrayList();

    /* renamed from: e */
    public static C9499k f24124e;

    /* renamed from: f */
    public static C9499k f24125f;

    /* renamed from: com.appodeal.ads.segments.n$a */
    public interface C9504a {
        /* renamed from: a */
        void mo60756a();
    }

    /* renamed from: com.appodeal.ads.segments.n$b */
    public static final class C9505b extends Lambda implements Function0<C9148b> {

        /* renamed from: a */
        public static final C9505b f24126a = new C9505b();

        public C9505b() {
            super(0);
        }

        public final Object invoke() {
            return C9148b.f22956b;
        }
    }

    /* renamed from: com.appodeal.ads.segments.n$c */
    public static final class C9506c extends Lambda implements Function0<Unit> {

        /* renamed from: a */
        public static final C9506c f24127a = new C9506c();

        public C9506c() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return Unit.INSTANCE;
        }
    }

    static {
        C9499k kVar = new C9499k(new JSONObject());
        f24121b = kVar;
        f24124e = kVar;
        C9495j.m28100a((C9495j.C9496a) $$Lambda$bZjIxFBHinEhqo870DEpNnWYRaE.INSTANCE);
        C9509q.m28139a(m28137c());
    }

    /* renamed from: a */
    public static final void m28130a() {
        m28132a(((ContextProvider) f24120a.getValue()).getApplicationContextOrNull(), (Function0<Unit>) C9507o.f24128a);
    }

    /* renamed from: a */
    public static final void m28132a(Context context, Function0<Unit> function0) {
        Object obj;
        Intrinsics.checkNotNullParameter(function0, "onUpdated");
        if (f24125f == null) {
            Iterator it = f24122c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C9499k kVar = (C9499k) obj;
                if (C9495j.m28102a(context, kVar.f24115c, kVar.f24116d)) {
                    break;
                }
            }
            C9499k kVar2 = (C9499k) obj;
            if (kVar2 == null) {
                kVar2 = f24121b;
            }
            if (kVar2.mo60752b() != f24124e.mo60752b()) {
                kVar2.mo60751a();
                f24124e = kVar2;
                C9509q.m28139a(m28137c());
                function0.invoke();
            }
        }
    }

    /* renamed from: a */
    public static final void m28133a(Context context, JSONArray jSONArray) {
        if (context != null && jSONArray != null) {
            f24122c.clear();
            int i = 0;
            int length = jSONArray.length();
            while (i < length) {
                int i2 = i + 1;
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    f24122c.add(new C9499k(optJSONObject));
                }
                i = i2;
            }
            m28132a(context, (Function0<Unit>) C9506c.f24127a);
        }
    }

    /* renamed from: a */
    public static final void m28135a(C9577u.C9579b bVar) {
        Intrinsics.checkNotNullParameter(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        f24123d.add(bVar);
    }

    /* renamed from: b */
    public static final void m28136b() {
        C9422r0.m27936d();
        Iterator it = f24123d.iterator();
        while (it.hasNext()) {
            ((C9504a) it.next()).mo60756a();
        }
    }

    /* renamed from: c */
    public static final C9499k m28137c() {
        C9499k kVar = f24125f;
        return kVar == null ? f24124e : kVar;
    }

    /* renamed from: a */
    public static final void m28131a(Context context) {
        m28132a(context, (Function0<Unit>) C9507o.f24128a);
    }

    /* renamed from: a */
    public static void m28134a(Context context, JSONObject jSONObject) {
        C9508p pVar = C9508p.f24129a;
        Intrinsics.checkNotNullParameter(pVar, "onUpdated");
        if (context != null && jSONObject != null) {
            f24122c.clear();
            C9499k kVar = new C9499k(jSONObject);
            long b = kVar.mo60752b();
            C9499k kVar2 = f24125f;
            if (!(kVar2 != null && b == kVar2.mo60752b())) {
                kVar.mo60751a();
                f24125f = kVar;
                C9509q.m28139a(m28137c());
                pVar.invoke();
            }
        }
    }
}
