package com.appnext.core;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;

/* renamed from: com.appnext.core.o */
public abstract class C8934o {
    private ServiceConnection mConnection = new ServiceConnection() {
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Messenger unused = C8934o.this.mMessenger = new Messenger(iBinder);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            Messenger unused = C8934o.this.mMessenger = null;
        }
    };
    /* access modifiers changed from: private */
    public Messenger mMessenger;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo58214a(Intent intent);

    /* renamed from: t */
    public final void mo59039t(Context context) {
        Intent intent = new Intent(context, AdsService.class);
        mo58214a(intent);
        try {
            context.getApplicationContext().bindService(intent, this.mConnection, 1);
            Message obtain = Message.obtain((Handler) null, AdsService.ADD_PACK, 0, 0);
            obtain.setData(intent.getExtras());
            this.mMessenger.send(obtain);
        } catch (Throwable unused) {
            context.startService(intent);
        }
    }

    /* renamed from: bm */
    protected static Class<?> m26979bm() {
        return AdsService.class;
    }

    /* renamed from: a */
    public void mo58213a(Context context) {
        try {
            context.unbindService(this.mConnection);
            this.mMessenger = null;
            this.mConnection = null;
        } catch (Throwable unused) {
        }
    }
}
