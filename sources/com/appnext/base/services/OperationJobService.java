package com.appnext.base.services;

import android.app.job.JobParameters;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.appnext.base.C8829a;
import com.appnext.base.operations.AppnextOperationJobService;
import com.appnext.base.operations.C8861a;
import com.appnext.base.p260a.p262b.C8838c;
import com.appnext.base.p264b.C8849c;
import com.appnext.base.p264b.C8852e;
import com.appnext.base.p264b.C8856i;
import com.appnext.base.services.p265a.C8871c;
import com.appnext.base.services.p266b.C8873a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class OperationJobService extends AppnextOperationJobService {
    public static final String SCHEDULE = "schedule";

    public int onRunJob(JobParameters jobParameters) {
        C8838c cVar;
        PersistableBundle persistableBundle;
        try {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            C8852e.init(getApplicationContext());
            C8856i.m26695aR().init(getApplicationContext());
            PersistableBundle extras = jobParameters.getExtras();
            Bundle bundle = null;
            if (extras == null) {
                cVar = null;
            } else {
                String string = extras.getString("key", "");
                cVar = new C8838c(extras.getString("status", ""), extras.getString(C8849c.f22410eQ, ""), extras.getString(C8849c.f22411eR, ""), extras.getString(C8849c.f22408eO, ""), extras.getString(C8849c.f22409eP, ""), string, extras.getString("service_key", ""), extras.getString(C8849c.DATA, (String) null));
            }
            if (cVar == null) {
                m26769b(jobParameters);
                return 0;
            } else if (m26768a(extras)) {
                m26769b(jobParameters);
                C8873a.m26797d(getApplicationContext()).mo58814a(cVar, true);
                return 0;
            } else {
                if (!(extras == null || (persistableBundle = extras.getPersistableBundle(C8871c.f22481eH)) == null)) {
                    bundle = new Bundle();
                    bundle.putAll(persistableBundle);
                }
                final JobParameters jobParameters2 = jobParameters;
                try {
                    new C8872b().mo58813a(getApplicationContext(), cVar.getKey(), (String) null, bundle, (Object) null, new C8861a.C8862a() {
                        /* renamed from: aH */
                        public final void mo58793aH() {
                            OperationJobService.this.m26769b(jobParameters2);
                            countDownLatch.countDown();
                        }

                        /* renamed from: b */
                        public final void mo58794b(C8829a aVar) {
                            OperationJobService.this.m26769b(jobParameters2);
                            countDownLatch.countDown();
                        }
                    });
                    countDownLatch.await(10, TimeUnit.SECONDS);
                } catch (Throwable unused) {
                }
                return 0;
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    private static boolean m26768a(PersistableBundle persistableBundle) {
        if (persistableBundle == null) {
            return false;
        }
        try {
            return Boolean.valueOf(persistableBundle.getString(SCHEDULE, "false")).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m26769b(JobParameters jobParameters) {
        try {
            mo58767a(jobParameters);
        } catch (Throwable unused) {
        }
    }
}
