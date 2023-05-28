package com.criteo.publisher.p060b0;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.criteo.publisher.p059a0.C1018a;

/* renamed from: com.criteo.publisher.b0.b */
/* compiled from: Redirection */
public class C1054b {

    /* renamed from: a */
    private final Context f3458a;

    public C1054b(Context context) {
        this.f3458a = context;
    }

    /* renamed from: a */
    public void mo3069a(String str, ComponentName componentName, C1056c cVar) {
        Intent addFlags = new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456);
        if (this.f3458a.getPackageManager().queryIntentActivities(addFlags, 65536).size() > 0) {
            this.f3458a.startActivity(addFlags);
            cVar.mo2981b();
            if (componentName != null) {
                Application application = (Application) this.f3458a.getApplicationContext();
                application.registerActivityLifecycleCallbacks(new C1055a(application, componentName, cVar));
            }
        }
    }

    /* renamed from: com.criteo.publisher.b0.b$a */
    /* compiled from: Redirection */
    private static class C1055a extends C1018a {

        /* renamed from: a */
        private final Application f3459a;

        /* renamed from: b */
        private final ComponentName f3460b;

        /* renamed from: c */
        private C1056c f3461c;

        public C1055a(Application application, ComponentName componentName, C1056c cVar) {
            this.f3459a = application;
            this.f3460b = componentName;
            this.f3461c = cVar;
        }

        public void onActivityResumed(Activity activity) {
            C1056c cVar;
            if (this.f3460b.equals(activity.getComponentName()) && (cVar = this.f3461c) != null) {
                cVar.mo2980a();
                this.f3459a.unregisterActivityLifecycleCallbacks(this);
                this.f3461c = null;
            }
        }
    }
}
