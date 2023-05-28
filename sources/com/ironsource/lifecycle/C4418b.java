package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* renamed from: com.ironsource.lifecycle.b */
public final class C4418b extends Fragment {

    /* renamed from: a */
    C4419a f10519a;

    /* renamed from: com.ironsource.lifecycle.b$a */
    interface C4419a {
        /* renamed from: a */
        void mo33232a(Activity activity);

        /* renamed from: b */
        void mo33233b(Activity activity);
    }

    /* renamed from: a */
    static C4418b m12598a(Activity activity) {
        return (C4418b) activity.getFragmentManager().findFragmentByTag("com.ironsource.lifecycle.IronsourceLifecycleFragment");
    }

    /* renamed from: b */
    static void m12599b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager != null && fragmentManager.findFragmentByTag("com.ironsource.lifecycle.IronsourceLifecycleFragment") == null) {
            fragmentManager.beginTransaction().add(new C4418b(), "com.ironsource.lifecycle.IronsourceLifecycleFragment").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f10519a != null) {
            getActivity();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f10519a = null;
    }

    public final void onPause() {
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        C4419a aVar = this.f10519a;
        if (aVar != null) {
            aVar.mo33233b(getActivity());
        }
    }

    public final void onStart() {
        super.onStart();
        C4419a aVar = this.f10519a;
        if (aVar != null) {
            aVar.mo33232a(getActivity());
        }
    }

    public final void onStop() {
        super.onStop();
    }
}
