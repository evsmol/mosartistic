package com.criteo.publisher.context;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import androidx.core.p161os.ConfigurationCompat;
import androidx.core.p161os.LocaleListCompat;
import com.criteo.publisher.C1333z;
import com.criteo.publisher.context.C1063a;
import com.criteo.publisher.p074n0.C1296c;
import com.criteo.publisher.p074n0.C1309m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.criteo.publisher.context.b */
/* compiled from: ContextProvider.kt */
public class C1065b {

    /* renamed from: a */
    private final Context f3479a;

    /* renamed from: b */
    private final C1063a f3480b;

    /* renamed from: c */
    private final C1296c f3481c;

    /* renamed from: d */
    private final C1333z f3482d;

    static {
        new C1066a((DefaultConstructorMarker) null);
    }

    public C1065b(Context context, C1063a aVar, C1296c cVar, C1333z zVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "connectionTypeFetcher");
        Intrinsics.checkParameterIsNotNull(cVar, "androidUtil");
        Intrinsics.checkParameterIsNotNull(zVar, "session");
        this.f3479a = context;
        this.f3480b = aVar;
        this.f3481c = cVar;
        this.f3482d = zVar;
    }

    /* renamed from: c */
    public String mo3096c() {
        String str = Build.MANUFACTURER;
        if (!Intrinsics.areEqual((Object) str, (Object) DtbDeviceDataRetriever.ORIENTATION_UNKNOWN)) {
            return str;
        }
        return null;
    }

    /* renamed from: d */
    public String mo3097d() {
        String str = Build.MODEL;
        if (!Intrinsics.areEqual((Object) str, (Object) DtbDeviceDataRetriever.ORIENTATION_UNKNOWN)) {
            return str;
        }
        return null;
    }

    /* renamed from: a */
    public Integer mo3094a() {
        C1063a.C1064a b = this.f3480b.mo3090b();
        if (b != null) {
            return Integer.valueOf(b.mo3093a());
        }
        return null;
    }

    /* renamed from: k */
    public String mo3102k() {
        List<Locale> h = m4968h();
        ArrayList arrayList = new ArrayList();
        for (Locale country : h) {
            String country2 = country.getCountry();
            Intrinsics.checkExpressionValueIsNotNull(country2, "it");
            if (!(!StringsKt.isBlank(country2))) {
                country2 = null;
            }
            if (country2 != null) {
                arrayList.add(country2);
            }
        }
        return (String) CollectionsKt.firstOrNull(arrayList);
    }

    /* renamed from: l */
    public List<String> mo3103l() {
        List<Locale> h = m4968h();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = h.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            String language = ((Locale) it.next()).getLanguage();
            Intrinsics.checkExpressionValueIsNotNull(language, "it");
            if (!StringsKt.isBlank(language)) {
                str = language;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        List<String> distinct = CollectionsKt.distinct(arrayList);
        if (!distinct.isEmpty()) {
            return distinct;
        }
        return null;
    }

    /* renamed from: h */
    private List<Locale> m4968h() {
        Resources system = Resources.getSystem();
        Intrinsics.checkExpressionValueIsNotNull(system, "Resources.getSystem()");
        LocaleListCompat locales = ConfigurationCompat.getLocales(system.getConfiguration());
        Intrinsics.checkExpressionValueIsNotNull(locales, "ConfigurationCompat.getL…etSystem().configuration)");
        int size = locales.size();
        Locale[] localeArr = new Locale[size];
        for (int i = 0; i < size; i++) {
            localeArr[i] = locales.get(i);
        }
        return ArraysKt.toList((T[]) localeArr);
    }

    /* renamed from: g */
    public Integer mo3099g() {
        Point f = m4967f();
        if (f != null) {
            return Integer.valueOf(f.x);
        }
        return null;
    }

    /* renamed from: b */
    public Integer mo3095b() {
        Point f = m4967f();
        if (f != null) {
            return Integer.valueOf(f.y);
        }
        return null;
    }

    /* renamed from: f */
    private Point m4967f() {
        if (Build.VERSION.SDK_INT < 17) {
            return null;
        }
        Point point = new Point();
        Object systemService = this.f3479a.getSystemService("window");
        if (systemService != null) {
            ((WindowManager) systemService).getDefaultDisplay().getRealSize(point);
            return point;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
    }

    /* renamed from: e */
    public String mo3098e() {
        int a = this.f3481c.mo3619a();
        if (a == 1) {
            return "Portrait";
        }
        if (a != 2) {
            return null;
        }
        return "Landscape";
    }

    /* renamed from: i */
    public Integer mo3100i() {
        return Integer.valueOf(this.f3482d.mo3734a());
    }

    /* renamed from: j */
    public Map<String, Object> mo3101j() {
        return C1309m.m5777a(MapsKt.mapOf(TuplesKt.m14544to("device.make", mo3096c()), TuplesKt.m14544to("device.model", mo3097d()), TuplesKt.m14544to("device.contype", mo3094a()), TuplesKt.m14544to("device.w", mo3099g()), TuplesKt.m14544to("device.h", mo3095b()), TuplesKt.m14544to("data.orientation", mo3098e()), TuplesKt.m14544to("user.geo.country", mo3102k()), TuplesKt.m14544to("data.inputLanguage", mo3103l()), TuplesKt.m14544to("data.sessionDuration", mo3100i())));
    }

    /* renamed from: com.criteo.publisher.context.b$a */
    /* compiled from: ContextProvider.kt */
    private static final class C1066a {
        private C1066a() {
        }

        public /* synthetic */ C1066a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
