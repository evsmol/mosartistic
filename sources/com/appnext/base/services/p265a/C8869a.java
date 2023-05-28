package com.appnext.base.services.p265a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appnext.base.p260a.p262b.C8838c;
import com.appnext.base.p264b.C8850d;
import com.appnext.base.services.OperationService;
import com.appodeal.ads.modules.common.internal.Constants;
import java.util.List;

/* renamed from: com.appnext.base.services.a.a */
public final class C8869a extends C8871c {

    /* renamed from: eE */
    private AlarmManager f22478eE;
    private Context mContext;

    public C8869a(Context context) {
        try {
            this.mContext = context.getApplicationContext();
            this.f22478eE = (AlarmManager) context.getSystemService("alarm");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final void mo58807b(C8838c cVar) {
        try {
            this.f22478eE.cancel(PendingIntent.getService(this.mContext, cVar.mo58707ap().hashCode(), new Intent(this.mContext, OperationService.class), 268435456));
            this.mContext.stopService(new Intent(this.mContext, OperationService.class));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: g */
    public final void mo58809g(List<C8838c> list) {
        if (list != null) {
            try {
                for (C8838c b : list) {
                    mo58807b(b);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58805a(C8838c cVar, long j, long j2) {
        m26773a(cVar.mo58707ap(), cVar.getKey(), j, j2, (Bundle) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo58808b(C8838c cVar, long j, long j2) {
        m26773a(cVar.mo58707ap(), cVar.getKey(), j, Constants.MILLIS_IN_DAY, (Bundle) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58806a(C8838c cVar, long j, Bundle bundle) {
        m26773a(cVar.mo58707ap(), cVar.getKey(), j, 0, bundle);
    }

    /* renamed from: a */
    private void m26773a(String str, String str2, long j, long j2, Bundle bundle) {
        try {
            Intent intent = new Intent(this.mContext, OperationService.class);
            intent.putExtra(C8850d.f22427fg, str2);
            if (bundle != null) {
                intent.putExtra(C8871c.f22481eH, bundle);
            }
            int hashCode = str.hashCode();
            String.valueOf(str);
            PendingIntent service = PendingIntent.getService(this.mContext, hashCode, intent, 134217728);
            if (j2 > 0) {
                this.f22478eE.setInexactRepeating(1, j, j2, service);
            } else {
                this.f22478eE.set(1, j, service);
            }
        } catch (Throwable unused) {
        }
    }
}
