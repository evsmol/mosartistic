package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: com.bytedance.sdk.component.utils.t */
/* compiled from: ResourceHelp */
public final class C10647t {

    /* renamed from: a */
    private static String f26531a;

    /* renamed from: b */
    private static Resources f26532b;

    /* renamed from: c */
    private static Context f26533c;

    /* renamed from: a */
    public static void m31278a(String str) {
        f26531a = str;
    }

    /* renamed from: b */
    private static String m31280b(Context context) {
        if (f26531a == null) {
            f26531a = context.getPackageName();
        }
        return f26531a;
    }

    /* renamed from: a */
    private static int m31275a(Context context, String str, String str2) {
        if (f26532b == null) {
            f26532b = context.getResources();
        }
        return f26532b.getIdentifier(str, str2, m31280b(context));
    }

    /* renamed from: a */
    public static String m31276a(Context context, String str) {
        Context context2 = f26533c;
        if (context2 == null) {
            return context.getResources().getString(m31279b(context, str));
        }
        return context2.getResources().getString(m31279b(f26533c, str));
    }

    /* renamed from: a */
    public static void m31277a(Context context) {
        f26533c = context;
    }

    /* renamed from: b */
    public static int m31279b(Context context, String str) {
        return m31275a(context, str, "string");
    }

    /* renamed from: c */
    public static Drawable m31281c(Context context, String str) {
        return context.getResources().getDrawable(m31282d(context, str));
    }

    /* renamed from: d */
    public static int m31282d(Context context, String str) {
        return m31275a(context, str, "drawable");
    }

    /* renamed from: e */
    public static int m31283e(Context context, String str) {
        return m31275a(context, str, "id");
    }

    /* renamed from: f */
    public static int m31284f(Context context, String str) {
        return m31275a(context, str, "layout");
    }

    /* renamed from: g */
    public static int m31285g(Context context, String str) {
        return m31275a(context, str, "style");
    }

    /* renamed from: h */
    public static int m31286h(Context context, String str) {
        return m31275a(context, str, "attr");
    }

    /* renamed from: i */
    public static int m31287i(Context context, String str) {
        return m31275a(context, str, "dimen");
    }

    /* renamed from: j */
    public static int m31288j(Context context, String str) {
        return context.getResources().getColor(m31289k(context, str));
    }

    /* renamed from: k */
    public static int m31289k(Context context, String str) {
        return m31275a(context, str, "color");
    }

    /* renamed from: l */
    public static int m31290l(Context context, String str) {
        return m31275a(context, str, "anim");
    }

    /* renamed from: m */
    public static int m31291m(Context context, String str) {
        return m31275a(context, str, "integer");
    }

    /* renamed from: n */
    public static int m31292n(Context context, String str) {
        return context.getResources().getInteger(m31291m(context, str));
    }
}
