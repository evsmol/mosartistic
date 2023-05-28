package com.yandex.metrica.impl.p082ob;

import android.app.Activity;
import com.yandex.metrica.uiaccessor.C3784a;
import com.yandex.metrica.uiaccessor.C3786b;

/* renamed from: com.yandex.metrica.impl.ob.Ek */
class C2000Ek {

    /* renamed from: com.yandex.metrica.impl.ob.Ek$a */
    class C2001a implements C3784a.C3785a {

        /* renamed from: a */
        final /* synthetic */ C3240mm f5351a;

        C2001a(C2000Ek ek, C3240mm mmVar) {
            this.f5351a = mmVar;
        }

        public void fragmentAttached(Activity activity) {
            this.f5351a.mo15447b(activity);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Ek$b */
    class C2002b implements C3786b {
        C2002b(C2000Ek ek) {
        }

        public void subscribe(Activity activity) throws Throwable {
        }

        public void unsubscribe(Activity activity) throws Throwable {
        }
    }

    C2000Ek() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3786b mo15729a(C3240mm<Activity> mmVar) {
        C3784a aVar;
        try {
            aVar = new C3784a(new C2001a(this, mmVar));
        } catch (Throwable unused) {
            aVar = null;
        }
        return aVar == null ? new C2002b(this) : aVar;
    }
}
