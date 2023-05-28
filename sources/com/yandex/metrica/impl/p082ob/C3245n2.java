package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import com.yandex.metrica.MetricaService;

/* renamed from: com.yandex.metrica.impl.ob.n2 */
public final class C3245n2 {

    /* renamed from: a */
    private static final C3241mn f8411a = new C3241mn();

    /* renamed from: a */
    public static Intent m10121a(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Intent addFlags = new Intent(context, MetricaService.class).setAction("com.yandex.metrica.IMetricaService").setData(new Uri.Builder().scheme("metrica").authority(context.getPackageName()).build()).addFlags(32);
        String str = null;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (Throwable unused) {
            applicationInfo = null;
        }
        try {
            bundle = applicationInfo.metaData;
            if (bundle == null) {
                bundle = new Bundle();
            }
        } catch (Throwable unused2) {
            bundle = new Bundle();
        }
        Intent putExtras = addFlags.putExtras(bundle);
        putExtras.setData(putExtras.getData().buildUpon().path("client").appendQueryParameter("pid", String.valueOf(Process.myPid())).appendQueryParameter("psid", C1850A3.f5024c).build());
        C2854c2 a = C2939f2.m9505a(context).mo17569a();
        if (a != null) {
            str = C2572Tl.m8514a(a);
        }
        putExtras.putExtra("screen_size", str);
        return putExtras.setPackage(context.getApplicationContext().getPackageName());
    }
}
