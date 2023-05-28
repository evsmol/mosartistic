package com.applovin.impl.sdk.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import com.applovin.impl.sdk.C8313a;

/* renamed from: com.applovin.impl.sdk.utils.b */
public class C8562b {

    /* renamed from: com.applovin.impl.sdk.utils.b$a */
    public interface C8564a<T extends Activity> {
        /* renamed from: a */
        void mo55475a(T t);
    }

    /* renamed from: a */
    public static void m26056a(Context context, final Class cls, final C8313a aVar, final C8564a aVar2) {
        aVar.mo56832a(new C8561a() {
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (cls.isInstance(activity)) {
                    aVar2.mo55475a(activity);
                    aVar.mo56834b(this);
                }
            }
        });
        context.startActivity(new Intent(context, cls));
    }

    /* renamed from: a */
    public static void m26057a(boolean z, Activity activity) {
        WindowInsetsController insetsController;
        if (!z || !C8571h.m26092j() || (insetsController = activity.getWindow().getInsetsController()) == null) {
            activity.getWindow().getDecorView().setSystemUiVisibility(5894);
            return;
        }
        insetsController.setSystemBarsBehavior(2);
        insetsController.hide(WindowInsets.Type.systemBars());
    }

    /* renamed from: a */
    public static boolean m26058a(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isChangingConfigurations() || (C8571h.m26084b() && activity.isDestroyed());
    }
}
