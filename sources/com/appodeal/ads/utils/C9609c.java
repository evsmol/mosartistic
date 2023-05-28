package com.appodeal.ads.utils;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.appodeal.ads.C9326n5;
import com.appodeal.ads.modules.common.internal.LogConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.appodeal.ads.utils.c */
public final class C9609c {

    /* renamed from: a */
    public static HashSet f24357a = new HashSet();

    /* renamed from: b */
    public static final C9610a f24358b = new C9610a();

    /* renamed from: c */
    public static final C9611b f24359c = new C9611b();

    /* renamed from: d */
    public static List<String> f24360d;

    /* renamed from: e */
    public static List<ServiceInfo> f24361e;

    /* renamed from: com.appodeal.ads.utils.c$a */
    public class C9610a extends ArrayList<String> {
        public C9610a() {
            add("android.permission.ACCESS_NETWORK_STATE");
            add("android.permission.INTERNET");
        }
    }

    /* renamed from: com.appodeal.ads.utils.c$b */
    public class C9611b extends ArrayList<C9613c> {

        /* renamed from: com.appodeal.ads.utils.c$b$a */
        public class C9612a implements C9613c {
            /* renamed from: a */
            public final void mo61064a() {
            }

            /* renamed from: a */
            public final boolean mo61065a(Context context, Bundle bundle) {
                try {
                    context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                    return bundle.containsKey("com.google.android.gms.version");
                } catch (Throwable unused) {
                    return true;
                }
            }
        }

        public C9611b() {
            add(new C9612a());
        }
    }

    /* renamed from: com.appodeal.ads.utils.c$c */
    public interface C9613c {
        /* renamed from: a */
        void mo61064a();

        /* renamed from: a */
        boolean mo61065a(Context context, Bundle bundle);
    }

    /* renamed from: a */
    public static void m28356a(Context context) {
        if (!C9326n5.m27546b(context)) {
            Log.log(LogConstants.KEY_SDK, LogConstants.EVENT_INTEGRATION, "Please add in manifest file: \n<uses-library android:name=\"org.apache.http.legacy\" android:required=\"false\" />");
        }
    }

    /* renamed from: a */
    public static boolean m28357a(Activity activity) {
        return activity != null && f24357a.contains(activity.getLocalClassName());
    }

    /* renamed from: b */
    public static void m28358b(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            String str = "Missing meta-data:";
            Iterator it = f24359c.iterator();
            boolean z = false;
            while (it.hasNext()) {
                C9613c cVar = (C9613c) it.next();
                if (!cVar.mo61065a(context, bundle)) {
                    Object[] objArr = new Object[2];
                    objArr[0] = str;
                    cVar.mo61064a();
                    objArr[1] = "com.google.android.gms.version";
                    str = String.format("%s\n%s", objArr);
                    z = true;
                }
            }
            if (z) {
                Log.log(LogConstants.KEY_SDK, LogConstants.EVENT_INTEGRATION, str);
            }
        } catch (Exception e) {
            Log.log(e);
        }
    }

    /* renamed from: c */
    public static void m28359c(Context context) {
        PackageInfo packageInfo;
        String[] strArr;
        try {
            ArrayList arrayList = new ArrayList(f24358b);
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (!(f24360d != null || (packageInfo = packageManager.getPackageInfo(packageName, 4096)) == null || (strArr = packageInfo.requestedPermissions) == null)) {
                f24360d = Arrays.asList(strArr);
            }
            List<String> list = f24360d;
            if (list != null) {
                arrayList.removeAll(list);
            }
            if (!arrayList.isEmpty()) {
                String str = "Missing permissions:";
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    str = String.format("%s\n%s", new Object[]{str, (String) it.next()});
                }
                Log.log(LogConstants.KEY_SDK, LogConstants.EVENT_INTEGRATION, str);
            }
        } catch (Exception e) {
            Log.log(e);
        }
    }
}
