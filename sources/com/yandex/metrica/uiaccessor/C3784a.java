package com.yandex.metrica.uiaccessor;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

/* renamed from: com.yandex.metrica.uiaccessor.a */
public class C3784a implements C3786b {

    /* renamed from: a */
    private final C3785a f9753a;

    /* renamed from: b */
    private FragmentManager.FragmentLifecycleCallbacks f9754b;

    /* renamed from: com.yandex.metrica.uiaccessor.a$a */
    public interface C3785a {
        void fragmentAttached(Activity activity);
    }

    public C3784a(C3785a aVar) throws Throwable {
        this.f9753a = aVar;
    }

    public void subscribe(Activity activity) throws Throwable {
        if (activity instanceof FragmentActivity) {
            if (this.f9754b == null) {
                this.f9754b = new FragmentLifecycleCallback(this.f9753a, activity);
            }
            FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
            supportFragmentManager.unregisterFragmentLifecycleCallbacks(this.f9754b);
            supportFragmentManager.registerFragmentLifecycleCallbacks(this.f9754b, true);
        }
    }

    public void unsubscribe(Activity activity) throws Throwable {
        if ((activity instanceof FragmentActivity) && this.f9754b != null) {
            ((FragmentActivity) activity).getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(this.f9754b);
        }
    }
}
