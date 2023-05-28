package com.bytedance.sdk.component.adexpress.dynamic.animation.p302a;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10343a;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.c */
/* compiled from: AnimatorFactory */
public class C10324c {

    /* renamed from: a */
    private static volatile C10324c f25529a;

    private C10324c() {
    }

    /* renamed from: a */
    public static C10324c m29828a() {
        if (f25529a == null) {
            synchronized (C10324c.class) {
                if (f25529a == null) {
                    f25529a = new C10324c();
                }
            }
        }
        return f25529a;
    }

    /* renamed from: a */
    public C10325d mo63285a(View view, C10343a aVar) {
        if (aVar == null) {
            return null;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).setClipChildren(false);
        }
        if (view.getParent().getParent() != null) {
            ((ViewGroup) view.getParent().getParent()).setClipChildren(false);
        }
        if ("scale".equals(aVar.mo63339h())) {
            return new C10335h(view, aVar);
        }
        if ("translate".equals(aVar.mo63339h())) {
            return new C10338k(view, aVar);
        }
        if ("ripple".equals(aVar.mo63339h())) {
            return new C10331f(view, aVar);
        }
        if ("marquee".equals(aVar.mo63339h())) {
            return new C10330e(view, aVar);
        }
        if ("waggle".equals(aVar.mo63339h())) {
            return new C10339l(view, aVar);
        }
        if ("shine".equals(aVar.mo63339h())) {
            return new C10336i(view, aVar);
        }
        if ("swing".equals(aVar.mo63339h())) {
            return new C10337j(view, aVar);
        }
        if ("fade".equals(aVar.mo63339h())) {
            return new C10322a(view, aVar);
        }
        if ("rubIn".equals(aVar.mo63339h())) {
            return new C10332g(view, aVar);
        }
        return null;
    }
}
