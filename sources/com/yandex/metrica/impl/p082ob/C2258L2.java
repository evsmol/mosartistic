package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.C10725i;
import com.yandex.metrica.C10728p;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.coreutils.network.UserAgent;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: com.yandex.metrica.impl.ob.L2 */
public final class C2258L2 {

    /* renamed from: a */
    static C2486Rf f6010a = new C2486Rf(C2410P.m8089g().mo16430c(), new C2522Sf());

    /* renamed from: a */
    public static void m7706a(Context context, IIdentifierCallback iIdentifierCallback, List<String> list) {
        f6010a.mo16563a(context, iIdentifierCallback, list);
    }

    /* renamed from: b */
    public static String m7710b(Context context) {
        return f6010a.mo16567b(context);
    }

    /* renamed from: c */
    public static String m7712c(Context context) {
        return f6010a.mo16569c(context);
    }

    /* renamed from: d */
    public static String m7713d(Context context) {
        return f6010a.mo16570d(context);
    }

    /* renamed from: a */
    public static Future<String> m7705a() {
        return f6010a.mo16562a();
    }

    /* renamed from: b */
    public static Future<Boolean> m7711b() {
        return f6010a.mo16568b();
    }

    /* renamed from: a */
    public static String m7703a(Context context) {
        return f6010a.mo16561a(context);
    }

    /* renamed from: a */
    public static String m7704a(String str) {
        f6010a.getClass();
        return UserAgent.getFor(str, "5.3.0", "45003240");
    }

    /* renamed from: a */
    public static String m7702a(int i) {
        f6010a.getClass();
        return C2753Z0.m8929a(i);
    }

    /* renamed from: a */
    public static YandexMetricaConfig m7700a(YandexMetricaConfig yandexMetricaConfig, String str) {
        f6010a.getClass();
        return C10725i.m31591a(yandexMetricaConfig).mo64756a((List<String>) Collections.singletonList(str)).mo64759a();
    }

    /* renamed from: a */
    public static YandexMetricaConfig m7701a(YandexMetricaConfig yandexMetricaConfig, List<String> list) {
        f6010a.getClass();
        return C10725i.m31591a(yandexMetricaConfig).mo64756a(list).mo64759a();
    }

    /* renamed from: a */
    public static void m7708a(Context context, boolean z) {
        f6010a.mo16565a(context, z);
    }

    /* renamed from: a */
    public static void m7709a(C10728p.Ucc ucc, boolean z) {
        f6010a.mo16566a(ucc, z);
    }

    /* renamed from: a */
    public static void m7707a(Context context, Map<String, Object> map) {
        f6010a.mo16564a(context, map);
    }
}
