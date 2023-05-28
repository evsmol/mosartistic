package com.appodeal.ads.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.appodeal.ads.utils.z */
public final class C9671z {

    /* renamed from: a */
    public static final C9672a f24495a = new C9672a();

    /* renamed from: com.appodeal.ads.utils.z$a */
    public class C9672a extends HashMap<String, String> {
        public C9672a() {
            super(3);
            put("android.permission.SYSTEM_ALERT_WINDOW", "SAW");
            put("android.permission.GET_TASKS", "GT");
            put("android.permission.RECEIVE_BOOT_COMPLETED", "RBC");
        }
    }

    /* renamed from: a */
    public static JSONArray m28447a(Context context) {
        boolean z;
        PackageInfo packageInfo;
        ServiceInfo[] serviceInfoArr;
        PackageInfo packageInfo2;
        String[] strArr;
        JSONArray jSONArray = new JSONArray();
        try {
            String packageName = context.getPackageName();
            PackageManager packageManager = context.getPackageManager();
            if (!(C9609c.f24360d != null || (packageInfo2 = packageManager.getPackageInfo(packageName, 4096)) == null || (strArr = packageInfo2.requestedPermissions) == null)) {
                C9609c.f24360d = Arrays.asList(strArr);
            }
            List<String> list = C9609c.f24360d;
            ArrayList arrayList = new ArrayList();
            if (list != null && !list.isEmpty()) {
                for (String next : list) {
                    C9672a aVar = f24495a;
                    if (aVar.containsKey(next)) {
                        arrayList.add((String) aVar.get(next));
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
            if (!(C9609c.f24361e != null || (packageInfo = packageManager.getPackageInfo(packageName, 4)) == null || (serviceInfoArr = packageInfo.services) == null)) {
                C9609c.f24361e = Arrays.asList(serviceInfoArr);
            }
            List<ServiceInfo> list2 = C9609c.f24361e;
            if (list2 != null && !list2.isEmpty()) {
                Iterator<ServiceInfo> it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!"com.yandex.metrica.MetricaService".equals(it2.next().name)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                jSONArray.put("S");
            }
        } catch (Exception e) {
            Log.log(e);
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return jSONArray;
    }
}
