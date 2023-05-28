package com.yandex.metrica.impl.p082ob;

import com.appodeal.ads.modules.common.internal.LogConstants;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.z0 */
public final class C3716z0 {

    /* renamed from: a */
    private static final Set<Integer> f9555a;

    /* renamed from: b */
    private static final EnumSet<C2788a1> f9556b;

    /* renamed from: c */
    private static final EnumSet<C2788a1> f9557c;

    /* renamed from: d */
    private static final EnumSet<C2788a1> f9558d;

    /* renamed from: e */
    private static final EnumSet<C2788a1> f9559e;

    /* renamed from: f */
    private static final EnumSet<C2788a1> f9560f = EnumSet.of(C2788a1.EVENT_TYPE_DIAGNOSTIC, C2788a1.EVENT_TYPE_DIAGNOSTIC_STATBOX, C2788a1.EVENT_TYPE_DIAGNOSTIC_DISABLE_STAT_SENDING, C2788a1.EVENT_TYPE_APPMETRICA_DIAGNOSTICS);

    /* renamed from: g */
    private static final EnumSet<C2788a1> f9561g;

    /* renamed from: h */
    private static final EnumSet<C2788a1> f9562h;

    /* renamed from: i */
    public static final List<Integer> f9563i;

    /* renamed from: j */
    public static final List<Integer> f9564j = Arrays.asList(new Integer[]{Integer.valueOf(C2788a1.EVENT_TYPE_CLEANUP.mo17139b())});

    static {
        Integer[] numArr = {Integer.valueOf(C2788a1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF.mo17139b()), Integer.valueOf(C2788a1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF.mo17139b()), Integer.valueOf(C2788a1.EVENT_TYPE_EXCEPTION_USER.mo17139b()), Integer.valueOf(C2788a1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.mo17139b()), Integer.valueOf(C2788a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE.mo17139b()), Integer.valueOf(C2788a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT.mo17139b()), Integer.valueOf(C2788a1.EVENT_TYPE_ANR.mo17139b())};
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 7; i++) {
            hashSet.add(numArr[i]);
        }
        f9555a = Collections.unmodifiableSet(hashSet);
        C2788a1 a1Var = C2788a1.EVENT_TYPE_UNDEFINED;
        C2788a1 a1Var2 = C2788a1.EVENT_TYPE_SEND_REFERRER;
        C2788a1 a1Var3 = C2788a1.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        C2788a1 a1Var4 = C2788a1.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        C2788a1 a1Var5 = C2788a1.EVENT_TYPE_ACTIVATION;
        C2788a1 a1Var6 = C2788a1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH;
        C2788a1 a1Var7 = C2788a1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        C2788a1 a1Var8 = C2788a1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF;
        f9556b = EnumSet.of(a1Var, new C2788a1[]{C2788a1.EVENT_TYPE_PURGE_BUFFER, a1Var2, a1Var3, a1Var4, a1Var5, a1Var6, a1Var7, a1Var8, C2788a1.EVENT_TYPE_SET_SESSION_EXTRA});
        C2788a1 a1Var9 = C2788a1.EVENT_TYPE_SET_USER_INFO;
        C2788a1 a1Var10 = C2788a1.EVENT_TYPE_REPORT_USER_INFO;
        C2788a1 a1Var11 = C2788a1.EVENT_TYPE_INIT;
        C2788a1 a1Var12 = C2788a1.EVENT_TYPE_APP_UPDATE;
        f9557c = EnumSet.of(a1Var9, new C2788a1[]{a1Var10, C2788a1.EVENT_TYPE_IDENTITY, a1Var, a1Var11, a1Var12, a1Var2, C2788a1.EVENT_TYPE_ALIVE, C2788a1.EVENT_TYPE_STARTUP, a1Var3, a1Var4, a1Var5, a1Var6, a1Var7, a1Var8, C2788a1.EVENT_TYPE_WEBVIEW_SYNC});
        C2788a1 a1Var13 = C2788a1.EVENT_TYPE_UPDATE_FOREGROUND_TIME;
        C2788a1 a1Var14 = C2788a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        f9558d = EnumSet.of(a1Var13, a1Var9, a1Var10, a1Var14);
        C2788a1 a1Var15 = C2788a1.EVENT_TYPE_EXCEPTION_UNHANDLED;
        C2788a1 a1Var16 = C2788a1.EVENT_TYPE_REGULAR;
        f9559e = EnumSet.of(a1Var15, new C2788a1[]{a1Var14, C2788a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT, C2788a1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, C2788a1.EVENT_TYPE_EXCEPTION_USER, C2788a1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, C2788a1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, a1Var6, a1Var7, C2788a1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH, C2788a1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, C2788a1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF, a1Var8, a1Var16});
        f9561g = EnumSet.of(a1Var16);
        f9562h = EnumSet.of(a1Var6, a1Var7, a1Var8);
        f9563i = Arrays.asList(new Integer[]{Integer.valueOf(a1Var11.mo17139b()), Integer.valueOf(C2788a1.EVENT_TYPE_FIRST_ACTIVATION.mo17139b()), Integer.valueOf(a1Var2.mo17139b()), Integer.valueOf(a1Var12.mo17139b())});
    }

    /* renamed from: a */
    public static boolean m11109a(C2788a1 a1Var) {
        return !f9556b.contains(a1Var);
    }

    /* renamed from: b */
    public static boolean m11112b(C2788a1 a1Var) {
        return !f9557c.contains(a1Var);
    }

    /* renamed from: c */
    public static boolean m11114c(int i) {
        return f9559e.contains(C2788a1.m8989a(i));
    }

    /* renamed from: d */
    public static boolean m11115d(int i) {
        return !f9562h.contains(C2788a1.m8989a(i));
    }

    /* renamed from: e */
    public static boolean m11116e(int i) {
        return f9561g.contains(C2788a1.m8989a(i));
    }

    /* renamed from: f */
    public static boolean m11117f(int i) {
        return f9555a.contains(Integer.valueOf(i));
    }

    /* renamed from: a */
    public static boolean m11108a(int i) {
        return f9560f.contains(C2788a1.m8989a(i));
    }

    /* renamed from: b */
    public static boolean m11111b(int i) {
        return f9558d.contains(C2788a1.m8989a(i));
    }

    /* renamed from: c */
    static C2851c0 m11113c(String str, C2875cm cmVar) {
        return m11104a(str, C2788a1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF, cmVar);
    }

    /* renamed from: a */
    public static C2851c0 m11105a(String str, C2875cm cmVar) {
        return m11104a(str, C2788a1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, cmVar);
    }

    /* renamed from: b */
    public static C2851c0 m11110b(String str, C2875cm cmVar) {
        return m11104a(str, C2788a1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, cmVar);
    }

    /* renamed from: a */
    private static C2851c0 m11104a(String str, C2788a1 a1Var, C2875cm cmVar) {
        C2168J j = new C2168J("", "", a1Var.mo17139b(), 0, cmVar);
        if (str != null) {
            j.mo15972i(str);
        }
        return j;
    }

    /* renamed from: a */
    public static C2851c0 m11103a() {
        C2851c0 c0Var = new C2851c0();
        c0Var.f7528e = C2788a1.EVENT_TYPE_DIAGNOSTIC_DISABLE_STAT_SENDING.mo17139b();
        try {
            c0Var.f7525b = new JSONObject().put("stat_sending", new JSONObject().put(LogConstants.MSG_AD_TYPE_DISABLED, true)).toString();
        } catch (Throwable unused) {
        }
        return c0Var;
    }

    /* renamed from: a */
    static C2851c0 m11107a(String str, byte[] bArr, C2875cm cmVar) {
        return new C2168J(bArr, str, C2788a1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF.mo17139b(), cmVar);
    }

    /* renamed from: a */
    static C2851c0 m11106a(String str, String str2, boolean z, C2875cm cmVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", str);
        hashMap.put("link", str2);
        hashMap.put("auto", Boolean.valueOf(z));
        return new C2168J(C2572Tl.m8546g(hashMap), "", C2788a1.EVENT_TYPE_APP_OPEN.mo17139b(), 0, cmVar);
    }
}
