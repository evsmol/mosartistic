package com.appnext.base.services.p265a;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.appnext.base.p260a.p262b.C8838c;
import com.appnext.base.p264b.C8847a;
import com.appnext.base.p264b.C8849c;
import com.appnext.base.services.OperationJobService;
import com.appodeal.ads.modules.common.internal.Constants;
import java.util.List;

/* renamed from: com.appnext.base.services.a.b */
public final class C8870b extends C8871c {

    /* renamed from: eF */
    private static final int f22479eF = 900000;

    /* renamed from: eG */
    private JobScheduler f22480eG;
    private Context mContext;

    public C8870b(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            this.mContext = applicationContext;
            this.f22480eG = (JobScheduler) applicationContext.getSystemService("jobscheduler");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final void mo58807b(C8838c cVar) {
        try {
            this.f22480eG.cancel(cVar.mo58707ap().hashCode());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: g */
    public final void mo58809g(List<C8838c> list) {
        try {
            this.f22480eG.cancelAll();
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58805a(C8838c cVar, long j, long j2) {
        m26779a(cVar, j, j2, (Bundle) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo58808b(C8838c cVar, long j, long j2) {
        m26779a(cVar, j, Constants.MILLIS_IN_DAY, (Bundle) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58806a(C8838c cVar, long j, Bundle bundle) {
        m26779a(cVar, j, 0, bundle);
    }

    /* renamed from: a */
    private void m26779a(C8838c cVar, long j, long j2, Bundle bundle) {
        PersistableBundle a;
        try {
            JobInfo.Builder requiredNetworkType = new JobInfo.Builder(cVar.mo58707ap().hashCode(), new ComponentName(this.mContext, OperationJobService.class)).setPersisted(true).setRequiredNetworkType(1);
            PersistableBundle e = C8849c.m26674e(cVar);
            if (!(bundle == null || (a = C8847a.m26661a(bundle)) == null)) {
                e.putPersistableBundle(C8871c.f22481eH, a);
            }
            if (j2 > 0 && j2 < 900000) {
                j2 = 900000;
            }
            if (j > System.currentTimeMillis()) {
                requiredNetworkType.setMinimumLatency(Math.max(j - System.currentTimeMillis(), 60000));
                e.putString(OperationJobService.SCHEDULE, "true");
            } else if (j2 > 0 && (Build.VERSION.SDK_INT < 24 || j2 >= 900000)) {
                requiredNetworkType.setPeriodic(j2);
            }
            requiredNetworkType.setExtras(e);
            this.f22480eG.schedule(requiredNetworkType.build());
        } catch (Throwable unused) {
        }
    }
}
