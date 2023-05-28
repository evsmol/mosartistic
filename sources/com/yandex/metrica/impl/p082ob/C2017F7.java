package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p081ac.CrashpadServiceHelper;

/* renamed from: com.yandex.metrica.impl.ob.F7 */
public class C2017F7 implements Runnable {
    public void run() {
        CrashpadServiceHelper.deleteCompletedReports();
    }
}
