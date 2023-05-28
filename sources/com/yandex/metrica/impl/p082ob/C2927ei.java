package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.impl.p082ob.C2312Mg;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.ei */
public class C2927ei {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3458rm<String, C3131ki> f7766a = new C3458rm<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final HashMap<String, C3450ri> f7767b = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3356pi f7768c = null;

    /* renamed from: d */
    private final C3323oi f7769d = new C2928a();

    /* renamed from: com.yandex.metrica.impl.ob.ei$a */
    class C2928a implements C3323oi {
        C2928a() {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ei$b */
    private static final class C2929b {

        /* renamed from: a */
        static final C2927ei f7771a = new C2927ei();
    }

    /* renamed from: a */
    public static final C2927ei m9480a() {
        return C2929b.f7771a;
    }

    /* renamed from: a */
    public C3450ri mo17555a(Context context, C2108I3 i3, C2312Mg.C2314b bVar) {
        C3450ri riVar = this.f7767b.get(i3.mo15879b());
        boolean z = true;
        if (riVar == null) {
            synchronized (this.f7767b) {
                riVar = this.f7767b.get(i3.mo15879b());
                if (riVar == null) {
                    C3450ri riVar2 = new C3450ri(context, i3.mo15879b(), bVar, this.f7769d);
                    this.f7767b.put(i3.mo15879b(), riVar2);
                    riVar = riVar2;
                    z = false;
                }
            }
        }
        if (z) {
            riVar.mo18169a(bVar);
        }
        return riVar;
    }

    /* renamed from: a */
    public void mo17556a(C2108I3 i3, C3131ki kiVar) {
        synchronized (this.f7767b) {
            this.f7766a.mo18181a(i3.mo15879b(), kiVar);
            C3356pi piVar = this.f7768c;
            if (piVar != null) {
                kiVar.mo15772a(piVar);
            }
        }
    }
}
