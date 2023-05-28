package com.yandex.metrica.impl.p082ob;

import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.yandex.metrica.impl.ob.U */
public class C2575U {

    /* renamed from: f */
    private static final Object f6829f = new Object();

    /* renamed from: g */
    private static volatile C2575U f6830g;

    /* renamed from: a */
    public final String f6831a = Build.MANUFACTURER;

    /* renamed from: b */
    public final String f6832b = Build.MODEL;

    /* renamed from: c */
    public final String f6833c = Build.VERSION.RELEASE;

    /* renamed from: d */
    public final int f6834d = Build.VERSION.SDK_INT;

    /* renamed from: e */
    public final String f6835e = String.valueOf(C2699X1.m8824a());

    /* renamed from: com.yandex.metrica.impl.ob.U$a */
    class C2576a extends ArrayList<String> {
        C2576a(C2575U u) {
            if (C2699X1.m8825b()) {
                add("Superuser.apk");
            }
            if (C2699X1.m8826c()) {
                add("su.so");
            }
        }
    }

    public C2575U() {
        Collections.unmodifiableList(new C2576a(this));
    }

    /* renamed from: a */
    public static C2575U m8554a() {
        if (f6830g == null) {
            synchronized (f6829f) {
                if (f6830g == null) {
                    f6830g = new C2575U();
                }
            }
        }
        return f6830g;
    }
}
