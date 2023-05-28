package com.appodeal.ads.utils;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.appodeal.ads.utils.f */
public final class C9624f {

    /* renamed from: a */
    public static final ArrayList f24395a = new ArrayList();

    /* renamed from: a */
    public static void m28382a(Context context) {
        ArrayList arrayList = f24395a;
        arrayList.clear();
        arrayList.add(new File(context.getExternalFilesDir((String) null), "/native_cache_image/"));
        arrayList.add(new File(context.getFilesDir(), "adc/media"));
        arrayList.add(new File(context.getFilesDir(), "adc3"));
        arrayList.add(new File(context.getExternalFilesDir((String) null), "al"));
        arrayList.add(new File(context.getCacheDir(), "al"));
        arrayList.add(new File(context.getExternalCacheDir(), "UnityAdsVideoCache"));
        arrayList.add(new File(context.getExternalCacheDir(), "UnityAdsCache"));
        arrayList.add(new File(Environment.getExternalStorageDirectory(), "UnityAdsVideoCache"));
        arrayList.add(new File(context.getFilesDir(), "UnityAdsVideoCache"));
        arrayList.add(new File(context.getFilesDir(), "UnityAdsCache"));
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                try {
                    if (!(m28384b(file) < 5242880)) {
                        m28383a(file);
                    }
                } catch (Exception e) {
                    Log.log(e);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m28383a(File file) {
        if (file.isDirectory()) {
            for (File a : file.listFiles()) {
                m28383a(a);
            }
        } else if (!file.exists()) {
            return;
        }
        file.delete();
    }

    /* renamed from: b */
    public static long m28384b(File file) {
        long j = 0;
        if (!file.exists()) {
            return 0;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return 0;
        }
        for (File b : listFiles) {
            j += m28384b(b);
        }
        return j;
    }
}
