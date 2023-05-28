package com.criteo.publisher.p070l0.p071d;

import android.content.Context;
import android.preference.PreferenceManager;
import com.criteo.publisher.p074n0.C1313q;

/* renamed from: com.criteo.publisher.l0.d.d */
/* compiled from: GdprDataFetcher */
public class C1178d {

    /* renamed from: a */
    private final C1182h f3726a;

    public C1178d(Context context) {
        this(new C1182h(new C1313q(PreferenceManager.getDefaultSharedPreferences(context))));
    }

    C1178d(C1182h hVar) {
        this.f3726a = hVar;
    }

    /* renamed from: a */
    public C1177c mo3296a() {
        C1181g a = this.f3726a.mo3302a();
        Boolean bool = null;
        if (a == null) {
            return null;
        }
        String b = a.mo3298b();
        String c = a.mo3299c();
        if (!b.isEmpty()) {
            bool = Boolean.valueOf("1".equals(b));
        }
        return C1177c.m5357a(c, bool, a.mo3297a());
    }
}
