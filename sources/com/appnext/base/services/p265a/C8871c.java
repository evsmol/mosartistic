package com.appnext.base.services.p265a;

import android.os.Bundle;
import android.text.TextUtils;
import com.appnext.base.operations.C8863b;
import com.appnext.base.p260a.p262b.C8838c;
import com.appnext.base.p264b.C8850d;
import com.appnext.base.p264b.C8856i;
import com.appnext.base.p264b.C8857j;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

/* renamed from: com.appnext.base.services.a.c */
public abstract class C8871c {

    /* renamed from: eH */
    public static final String f22481eH = "more_data";

    /* renamed from: eI */
    private static final long f22482eI = 1000;

    /* renamed from: eJ */
    private static final long f22483eJ = 60000;

    /* renamed from: eK */
    private static final long f22484eK = 3600000;

    /* renamed from: eL */
    private static final long f22485eL = 86400000;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo58805a(C8838c cVar, long j, long j2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo58806a(C8838c cVar, long j, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo58807b(C8838c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo58808b(C8838c cVar, long j, long j2);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo58809g(List<C8838c> list);

    /* renamed from: a */
    public final void mo58810a(C8838c cVar, boolean z, Bundle bundle) {
        if (cVar != null) {
            try {
                if (TextUtils.isEmpty(cVar.mo58702ak())) {
                    return;
                }
                if (!cVar.mo58702ak().equals(C8850d.f22426ff)) {
                    long j = 0;
                    if (cVar.mo58703al() != null && cVar.mo58704am().equals(C8850d.f22432fl)) {
                        if (!z) {
                            j = m26785D(cVar.mo58703al());
                        }
                        if (j != -1) {
                            mo58808b(cVar, j + m26786a(-1800000, 1800000), 86400000);
                        }
                    } else if (cVar.mo58706ao() != null && cVar.mo58706ao().equals(C8850d.f22434fn)) {
                        long g = (long) C8857j.m26709g(cVar.mo58703al(), cVar.mo58704am());
                        if (g != -1) {
                            C8856i aR = C8856i.m26695aR();
                            long j2 = aR.getLong(cVar.getKey() + C8856i.f22448fy, 0);
                            if (j2 != 0) {
                                if (!z) {
                                    mo58805a(cVar, g + j2, g);
                                    return;
                                }
                            }
                            mo58805a(cVar, System.currentTimeMillis(), g);
                        }
                    } else if (cVar.mo58706ao() != null && cVar.mo58706ao().equals(C8850d.f22433fm)) {
                        mo58806a(cVar, System.currentTimeMillis(), (Bundle) null);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: D */
    private static long m26785D(String str) {
        try {
            if (str.length() != 4) {
                return -1;
            }
            int parseInt = Integer.parseInt(str.substring(0, 2));
            int parseInt2 = Integer.parseInt(str.substring(2, 4));
            Calendar instance = Calendar.getInstance();
            instance.set(11, parseInt);
            instance.set(12, parseInt2);
            instance.set(13, 0);
            if (new Date().after(instance.getTime())) {
                instance.add(5, 1);
            }
            return instance.getTimeInMillis();
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: a */
    private static long m26786a(long j, long j2) {
        try {
            return 1800000 - ((long) new Random().nextInt((int) (Math.abs(-1800000) + 1800000)));
        } catch (Throwable unused) {
            return -1800000;
        }
    }

    /* renamed from: c */
    public final void mo58811c(C8838c cVar) {
        if (cVar != null) {
            try {
                C8863b.m26748aI().mo58798b(cVar.getKey(), cVar, (Bundle) null, (Object) null);
                mo58807b(cVar);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: h */
    public final void mo58812h(List<C8838c> list) {
        if (list != null) {
            try {
                for (C8838c next : list) {
                    C8863b.m26748aI().mo58798b(next.getKey(), next, (Bundle) null, (Object) null);
                }
                mo58809g(list);
            } catch (Throwable unused) {
            }
        }
    }
}
