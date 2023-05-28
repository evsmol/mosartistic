package com.applovin.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: com.applovin.exoplayer2.b */
final class C6844b {

    /* renamed from: a */
    private final Context f14970a;

    /* renamed from: b */
    private final C6845a f14971b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f14972c;

    /* renamed from: com.applovin.exoplayer2.b$a */
    private final class C6845a extends BroadcastReceiver implements Runnable {

        /* renamed from: b */
        private final C6846b f14974b;

        /* renamed from: c */
        private final Handler f14975c;

        public C6845a(Handler handler, C6846b bVar) {
            this.f14975c = handler;
            this.f14974b = bVar;
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f14975c.post(this);
            }
        }

        public void run() {
            if (C6844b.this.f14972c) {
                this.f14974b.mo52871a();
            }
        }
    }

    /* renamed from: com.applovin.exoplayer2.b$b */
    public interface C6846b {
        /* renamed from: a */
        void mo52871a();
    }

    public C6844b(Context context, Handler handler, C6846b bVar) {
        this.f14970a = context.getApplicationContext();
        this.f14971b = new C6845a(handler, bVar);
    }

    /* renamed from: a */
    public void mo52900a(boolean z) {
        boolean z2;
        if (z && !this.f14972c) {
            this.f14970a.registerReceiver(this.f14971b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            z2 = true;
        } else if (!z && this.f14972c) {
            this.f14970a.unregisterReceiver(this.f14971b);
            z2 = false;
        } else {
            return;
        }
        this.f14972c = z2;
    }
}
