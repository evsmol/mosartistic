package com.applovin.impl.sdk.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.sdk.network.d */
public class C8518d extends BroadcastReceiver {

    /* renamed from: a */
    private final List<C8519a> f21480a = Collections.synchronizedList(new ArrayList());

    /* renamed from: com.applovin.impl.sdk.network.d$a */
    public interface C8519a {
        /* renamed from: a */
        void mo57414a();

        /* renamed from: b */
        void mo57415b();
    }

    public C8518d(Context context) {
        context.getApplicationContext().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* renamed from: a */
    private static boolean m25797a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        Object obj = extras.get("networkInfo");
        if (obj instanceof NetworkInfo) {
            return ((NetworkInfo) obj).isConnected();
        }
        return false;
    }

    /* renamed from: a */
    public void mo57541a(C8519a aVar) {
        this.f21480a.add(aVar);
    }

    /* renamed from: b */
    public void mo57542b(C8519a aVar) {
        this.f21480a.remove(aVar);
    }

    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE") && !isInitialStickyBroadcast()) {
            ArrayList arrayList = new ArrayList(this.f21480a);
            boolean a = m25797a(intent);
            Iterator it = arrayList.iterator();
            if (a) {
                while (it.hasNext()) {
                    ((C8519a) it.next()).mo57414a();
                }
                return;
            }
            while (it.hasNext()) {
                ((C8519a) it.next()).mo57415b();
            }
        }
    }
}
