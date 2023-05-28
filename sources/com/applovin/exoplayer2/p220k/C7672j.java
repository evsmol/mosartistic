package com.applovin.exoplayer2.p220k;

import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.k.j */
public class C7672j extends IOException {

    /* renamed from: a */
    public final int f18050a;

    public C7672j(int i) {
        this.f18050a = i;
    }

    public C7672j(String str, int i) {
        super(str);
        this.f18050a = i;
    }

    public C7672j(String str, Throwable th, int i) {
        super(str, th);
        this.f18050a = i;
    }

    public C7672j(Throwable th, int i) {
        super(th);
        this.f18050a = i;
    }

    /* renamed from: a */
    public static boolean m21956a(IOException iOException) {
        Throwable th;
        while (th != null) {
            if ((th instanceof C7672j) && ((C7672j) th).f18050a == 2008) {
                return true;
            }
            Throwable cause = th.getCause();
            th = iOException;
            th = cause;
        }
        return false;
    }
}
