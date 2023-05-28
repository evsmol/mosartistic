package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.util.SparseArray;
import com.yandex.metrica.YandexMetrica;

/* renamed from: com.yandex.metrica.impl.ob.D1 */
public abstract class C1937D1 {

    /* renamed from: com.yandex.metrica.impl.ob.D1$a */
    interface C1938a {
        /* renamed from: a */
        void mo15602a(Context context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo15598a(C2339Nd nd);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract SparseArray<C1938a> mo15599a();

    /* renamed from: a */
    public synchronized void mo15600a(Context context) {
        C2339Nd nd = new C2339Nd(context);
        int a = mo15598a(nd);
        int libraryApiLevel = YandexMetrica.getLibraryApiLevel();
        if (a != libraryApiLevel) {
            if (a > 0 && a < libraryApiLevel) {
                SparseArray<C1938a> a2 = mo15599a();
                while (true) {
                    a++;
                    if (a > libraryApiLevel) {
                        break;
                    }
                    C1938a aVar = a2.get(a);
                    if (aVar != null) {
                        aVar.mo15602a(context);
                    }
                }
            }
            mo15601a(nd, libraryApiLevel);
            nd.mo16079b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo15601a(C2339Nd nd, int i);
}
