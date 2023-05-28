package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.g1 */
public final class C2980g1 {

    /* renamed from: c */
    private static volatile C2980g1 f7881c;

    /* renamed from: d */
    private static final Object f7882d = new Object();

    /* renamed from: a */
    private List<String> f7883a;

    /* renamed from: b */
    private final List<C2981a> f7884b = new ArrayList();

    /* renamed from: com.yandex.metrica.impl.ob.g1$a */
    public interface C2981a {
        /* renamed from: a */
        void mo15824a();
    }

    C2980g1(Context context) {
        synchronized (this) {
            this.f7883a = m9594a(context.getResources().getConfiguration());
        }
    }

    /* renamed from: a */
    public static C2980g1 m9593a(Context context) {
        if (f7881c == null) {
            synchronized (f7882d) {
                if (f7881c == null) {
                    f7881c = new C2980g1(context.getApplicationContext());
                }
            }
        }
        return f7881c;
    }

    /* renamed from: b */
    public void mo17620b(Configuration configuration) {
        ArrayList arrayList;
        synchronized (this) {
            this.f7883a = m9594a(configuration);
            arrayList = new ArrayList(this.f7884b);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C2981a) it.next()).mo15824a();
        }
    }

    /* renamed from: a */
    public List<String> mo17618a() {
        return this.f7883a;
    }

    /* renamed from: a */
    public synchronized void mo17619a(C2981a aVar) {
        this.f7884b.add(aVar);
    }

    /* renamed from: a */
    private List<String> m9594a(Configuration configuration) {
        if (!C1848A2.m6808a(24)) {
            return Collections.singletonList(C2076H1.m7291a(configuration.locale));
        }
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        if (locales != null) {
            Intrinsics.checkNotNullExpressionValue(locales, "configuration.locales ?: return result");
            int size = locales.size();
            for (int i = 0; i < size; i++) {
                Locale locale = locales.get(i);
                if (locale != null) {
                    String a = C2076H1.m7291a(locale);
                    Intrinsics.checkNotNullExpressionValue(a, "PhoneUtils.normalizedLocale(it)");
                    arrayList.add(a);
                }
            }
        }
        return arrayList;
    }
}
