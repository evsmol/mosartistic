package com.bytedance.sdk.component.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: com.bytedance.sdk.component.utils.b */
/* compiled from: ActivityUtil */
public class C10622b {

    /* renamed from: com.bytedance.sdk.component.utils.b$a */
    /* compiled from: ActivityUtil */
    public interface C10623a {
        /* renamed from: a */
        void mo299a();

        /* renamed from: a */
        void mo300a(Throwable th);
    }

    /* renamed from: a */
    public static boolean m31190a(Context context, Intent intent, C10623a aVar) {
        if (!(context == null || intent == null)) {
            try {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                if (aVar == null) {
                    return true;
                }
                aVar.mo299a();
                return true;
            } catch (Throwable th) {
                if (aVar != null) {
                    aVar.mo300a(th);
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static Activity m31189a(View view) {
        View findViewById;
        Context context;
        if (view == null) {
            return null;
        }
        Context context2 = view.getContext();
        if (context2 instanceof Activity) {
            return (Activity) context2;
        }
        View rootView = view.getRootView();
        if (rootView == null || (findViewById = rootView.findViewById(16908290)) == null || (context = findViewById.getContext()) == null || !(context instanceof Activity)) {
            return null;
        }
        return (Activity) context;
    }
}
