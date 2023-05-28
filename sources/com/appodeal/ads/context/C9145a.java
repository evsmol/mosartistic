package com.appodeal.ads.context;

import android.app.Activity;

/* renamed from: com.appodeal.ads.context.a */
public interface C9145a {

    /* renamed from: com.appodeal.ads.context.a$a */
    public static final class C9146a implements C9145a {

        /* renamed from: a */
        public final Activity f22954a;

        public C9146a(Activity activity) {
            this.f22954a = activity;
        }

        public final Activity getActivity() {
            return this.f22954a;
        }
    }

    /* renamed from: com.appodeal.ads.context.a$b */
    public static final class C9147b implements C9145a {

        /* renamed from: a */
        public final Activity f22955a;

        public C9147b(Activity activity) {
            this.f22955a = activity;
        }

        public final Activity getActivity() {
            return this.f22955a;
        }
    }

    Activity getActivity();
}
