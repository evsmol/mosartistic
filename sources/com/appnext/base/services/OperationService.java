package com.appnext.base.services;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import com.appnext.base.operations.C8861a;
import com.appnext.base.p264b.C8850d;
import com.appnext.base.services.p265a.C8871c;

public class OperationService extends IntentService {
    public OperationService() {
        super(OperationService.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra(C8850d.f22427fg);
            Bundle bundleExtra = intent.getBundleExtra(C8871c.f22481eH);
            new C8872b().mo58813a(getApplicationContext(), stringExtra, (String) null, bundleExtra, (Intent) intent.clone(), (C8861a.C8862a) null);
        } catch (Throwable unused) {
        }
    }
}
