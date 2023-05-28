package com.yandex.metrica.uiaccessor;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.yandex.metrica.uiaccessor.C3784a;
import java.lang.ref.WeakReference;

public class FragmentLifecycleCallback extends FragmentManager.FragmentLifecycleCallbacks {

    /* renamed from: a */
    private final C3784a.C3785a f9751a;

    /* renamed from: b */
    private final WeakReference<Activity> f9752b;

    public FragmentLifecycleCallback(C3784a.C3785a aVar, Activity activity) {
        this.f9751a = aVar;
        this.f9752b = new WeakReference<>(activity);
    }

    public void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        super.onFragmentAttached(fragmentManager, fragment, context);
        Activity activity = (Activity) this.f9752b.get();
        if (activity != null) {
            this.f9751a.fragmentAttached(activity);
        }
    }
}
