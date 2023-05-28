package com.appnext.base.services;

import com.appnext.base.operations.C8863b;

/* renamed from: com.appnext.base.services.a */
public final class C8868a {

    /* renamed from: eA */
    private static volatile C8868a f22476eA;

    /* renamed from: dP */
    private String f22477dP;

    private C8868a() {
    }

    /* renamed from: aK */
    public static C8868a m26772aK() {
        if (f22476eA == null) {
            synchronized (C8863b.class) {
                if (f22476eA == null) {
                    f22476eA = new C8868a();
                }
            }
        }
        return f22476eA;
    }

    public final synchronized void setKey(String str) {
        this.f22477dP = str;
    }

    public final synchronized String getKey() {
        return this.f22477dP;
    }
}
