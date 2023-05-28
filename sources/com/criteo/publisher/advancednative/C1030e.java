package com.criteo.publisher.advancednative;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayDeque;

/* renamed from: com.criteo.publisher.advancednative.e */
/* compiled from: ClickDetection */
public class C1030e {

    /* renamed from: com.criteo.publisher.advancednative.e$a */
    /* compiled from: ClickDetection */
    class C1031a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C1047n f3415a;

        C1031a(C1030e eVar, C1047n nVar) {
            this.f3415a = nVar;
        }

        public void onClick(View view) {
            this.f3415a.mo3041a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3048a(View view, C1047n nVar) {
        C1031a aVar = new C1031a(this, nVar);
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(view);
        while (!arrayDeque.isEmpty()) {
            View view2 = (View) arrayDeque.remove();
            view2.setOnClickListener(aVar);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    arrayDeque.add(viewGroup.getChildAt(i));
                }
            }
        }
    }
}
