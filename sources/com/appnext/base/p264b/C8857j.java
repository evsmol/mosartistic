package com.appnext.base.p264b;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.appnext.base.operations.C8861a;
import com.appnext.base.operations.C8863b;
import com.appnext.base.p260a.C8831a;
import com.appnext.base.p260a.p262b.C8837b;
import com.appnext.base.p260a.p262b.C8838c;
import com.appnext.base.p264b.C8850d;
import com.appnext.base.services.p266b.C8873a;
import com.appnext.core.C8917f;
import com.appnext.core.C8924i;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpRetryException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.appnext.base.b.j */
public final class C8857j {
    private static final String TAG = "SdkHelper";

    /* renamed from: eI */
    private static final long f22451eI = 1000;

    /* renamed from: eJ */
    private static final long f22452eJ = 60000;

    /* renamed from: eK */
    private static final long f22453eK = 3600000;

    /* renamed from: eL */
    private static final long f22454eL = 86400000;

    /* renamed from: a */
    public static boolean m26703a(String str, String str2, C8838c cVar) {
        char c = 65535;
        try {
            if (str2.hashCode() == 570418373) {
                if (str2.equals(C8850d.f22434fn)) {
                    c = 0;
                }
            }
            if (c != 0) {
                return false;
            }
            return ((C8861a) Class.forName(C8863b.m26746B(str)).getConstructor(new Class[]{C8838c.class, Bundle.class}).newInstance(new Object[]{cVar, null})).mo58782aE();
        } catch (InvocationTargetException e) {
            e.getCause().printStackTrace();
            e.getCause();
            return false;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m26702a(Class cls) {
        try {
            if (C8852e.getContext().getPackageManager().queryIntentServices(new Intent(C8852e.getContext(), cls), 65536).size() > 0) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static List<String> m26699a(Context context, long j, long j2) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ArrayList arrayList = new ArrayList();
        if (context == null) {
            return arrayList;
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (Build.VERSION.SDK_INT < 21) {
                if (C8853f.m26677a(C8852e.getContext(), "android.permission.GET_TASKS") && (runningTasks = activityManager.getRunningTasks(20)) != null && !runningTasks.isEmpty()) {
                    for (ActivityManager.RunningTaskInfo next : runningTasks) {
                        if (!m26706b(context, next.baseActivity.getPackageName())) {
                            arrayList.add(next.baseActivity.getPackageName());
                        }
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 21 && m26708f(context.getApplicationContext())) {
                UsageStatsManager usageStatsManager = (UsageStatsManager) context.getSystemService("usagestats");
                long currentTimeMillis = System.currentTimeMillis();
                List<UsageStats> queryUsageStats = usageStatsManager.queryUsageStats(4, currentTimeMillis - j, currentTimeMillis);
                if (queryUsageStats == null) {
                    return arrayList;
                }
                ListIterator<UsageStats> listIterator = queryUsageStats.listIterator();
                while (listIterator.hasNext()) {
                    UsageStats next2 = listIterator.next();
                    if (Build.VERSION.SDK_INT >= 23) {
                        if (!usageStatsManager.isAppInactive(next2.getPackageName()) && next2.getTotalTimeInForeground() >= j2) {
                            if (!m26706b(context, next2.getPackageName())) {
                                arrayList.add(next2.getPackageName());
                            }
                        }
                        listIterator.remove();
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    /* renamed from: b */
    private static boolean m26706b(Context context, String str) {
        try {
            if (str.contains("com.android")) {
                return true;
            }
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null) {
                for (ResolveInfo next : queryIntentActivities) {
                    if (next.activityInfo != null && next.activityInfo.packageName.equals(str)) {
                        return true;
                    }
                }
            }
            Intent intent2 = new Intent("android.intent.action.MAIN", (Uri) null);
            intent2.addCategory("android.intent.category.LAUNCHER");
            List<ResolveInfo> queryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent2, 0);
            if (queryIntentActivities2 != null) {
                Iterator<ResolveInfo> it = queryIntentActivities2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ResolveInfo next2 = it.next();
                    if (next2.activityInfo != null && next2.activityInfo.packageName.equals(str)) {
                        if ((next2.activityInfo.flags & 129) != 0) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: f */
    public static boolean m26708f(Context context) {
        return ((AppOpsManager) context.getSystemService("appops")).checkOpNoThrow("android:get_usage_stats", Process.myUid(), context.getPackageName()) == 0;
    }

    /* renamed from: g */
    public static void m26710g(Context context) {
        try {
            List<C8838c> as = C8831a.m26576X().mo58686ab().mo58721as();
            if (as != null && as.size() == 0) {
                C8838c cVar = new C8838c(C8850d.f22425fe, "1", C8850d.f22430fj, "1", C8850d.f22434fn, "cdm", "cdm" + System.currentTimeMillis(), (String) null);
                C8831a.m26576X().mo58686ab().mo58719a(cVar);
                C8873a.m26797d(context).mo58814a(cVar, true);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: h */
    public static boolean m26711h(Context context) throws Exception {
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
        return advertisingIdInfo != null && advertisingIdInfo.isLimitAdTrackingEnabled();
    }

    /* renamed from: i */
    public static boolean m26712i(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo == null || advertisingIdInfo.isLimitAdTrackingEnabled()) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static boolean m26707b(String str, Map<String, String> map) {
        C8838c t = C8831a.m26576X().mo58686ab().mo58725t(str);
        if (t == null || C8850d.f22426ff.equalsIgnoreCase(t.mo58702ak()) || map.isEmpty()) {
            return true;
        }
        String str2 = C8924i.f22640hm + "/data";
        HashMap hashMap = new HashMap();
        String b = C8917f.m26931b(C8852e.getContext(), true);
        if (TextUtils.isEmpty(b)) {
            b = C8856i.m26695aR().getString(C8856i.f22444fB, "");
        }
        if (TextUtils.isEmpty(b)) {
            return false;
        }
        hashMap.put("aid", b);
        hashMap.put("cuid", b + "_" + System.currentTimeMillis());
        hashMap.put("lvid", "4.7.2");
        try {
            hashMap.put("localdate", m26698a(new Date()));
            hashMap.put("timezone", m26704aT());
            hashMap.put("app_package", C8852e.getPackageName());
        } catch (Throwable unused) {
            hashMap.put("app_package", "");
        }
        for (Map.Entry next : map.entrySet()) {
            hashMap.put((String) next.getKey(), (String) next.getValue());
        }
        StringBuilder sb = new StringBuilder("-------Sending to server data for key = ");
        sb.append(str);
        sb.append(" ----------");
        for (Map.Entry entry : hashMap.entrySet()) {
            StringBuilder sb2 = new StringBuilder("---- ");
            sb2.append((String) entry.getKey());
            sb2.append(" : ");
            sb2.append((String) entry.getValue());
            sb2.append(" ----");
        }
        try {
            byte[] a = C8917f.m26929a(str2, (Object) hashMap, false, 15000, C8850d.C8851a.HashMap);
            if (a != null) {
                new StringBuilder("result send data: ").append(new String(a, "UTF-8"));
            }
            return true;
        } catch (HttpRetryException e) {
            int responseCode = e.responseCode();
            String message = e.getMessage();
            StringBuilder sb3 = new StringBuilder("(Type:HttpRetryException)");
            sb3.append(message);
            sb3.append("  ");
            sb3.append(responseCode);
            return false;
        } catch (Throwable th) {
            new StringBuilder("(Type:Throwable) ").append(th.getMessage());
            return false;
        }
    }

    /* renamed from: aT */
    public static String m26704aT() {
        StringBuilder sb = new StringBuilder(9);
        try {
            Calendar instance = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
            int i = (instance.get(15) + instance.get(16)) / 60000;
            char c = '+';
            if (i < 0) {
                c = '-';
                i = -i;
            }
            sb.append("GMT");
            sb.append(c);
            m26701a(sb, 2, i / 60);
            sb.append(':');
            m26701a(sb, 2, i % 60);
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static void m26701a(StringBuilder sb, int i, int i2) {
        try {
            String num = Integer.toString(i2);
            for (int i3 = 0; i3 < 2 - num.length(); i3++) {
                sb.append('0');
            }
            sb.append(num);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static String m26698a(Date date) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(new SimpleDateFormat("EEE MMM dd HH:mm:ss", Locale.US).format(date));
            sb.append(" ");
            sb.append(m26704aT());
            sb.append(" ");
            sb.append(new SimpleDateFormat("yyyy", Locale.US).format(date));
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    /* renamed from: g */
    public static int m26709g(String str, String str2) {
        long j;
        long j2;
        try {
            if (!TextUtils.isEmpty(str) && TextUtils.isDigitsOnly(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    int intValue = Integer.valueOf(str).intValue();
                    if (C8850d.f22428fh.equalsIgnoreCase(str2)) {
                        return intValue;
                    }
                    if (C8850d.f22429fi.equalsIgnoreCase(str2)) {
                        j = (long) intValue;
                        j2 = f22452eJ;
                    } else if (C8850d.f22430fj.equalsIgnoreCase(str2)) {
                        j = (long) intValue;
                        j2 = f22453eK;
                    } else if (C8850d.f22431fk.equalsIgnoreCase(str2)) {
                        j = (long) intValue;
                        j2 = 86400000;
                    }
                    return (int) (j * j2);
                }
            }
        } catch (Throwable unused) {
        }
        return -1;
    }

    /* renamed from: a */
    public static void m26700a(String str, String str2, C8850d.C8851a aVar) {
        C8831a.m26576X().mo58685aa().mo58730b(new C8837b(str, str2, aVar.getType()));
    }

    /* renamed from: a */
    public static Object m26697a(String str, C8850d.C8851a aVar) {
        try {
            List<C8837b> v = C8831a.m26576X().mo58685aa().mo58734v(str);
            if (v == null || v.isEmpty()) {
                return null;
            }
            return m26705b(v.get(0).mo58695ai(), aVar);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: com.appnext.base.b.j$1 */
    static /* synthetic */ class C88581 {

        /* renamed from: fF */
        static final /* synthetic */ int[] f22455fF;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.appnext.base.b.d$a[] r0 = com.appnext.base.p264b.C8850d.C8851a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22455fF = r0
                com.appnext.base.b.d$a r1 = com.appnext.base.p264b.C8850d.C8851a.Integer     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22455fF     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appnext.base.b.d$a r1 = com.appnext.base.p264b.C8850d.C8851a.Double     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f22455fF     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.appnext.base.b.d$a r1 = com.appnext.base.p264b.C8850d.C8851a.Long     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f22455fF     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.appnext.base.b.d$a r1 = com.appnext.base.p264b.C8850d.C8851a.Boolean     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f22455fF     // Catch:{ NoSuchFieldError -> 0x003e }
                com.appnext.base.b.d$a r1 = com.appnext.base.p264b.C8850d.C8851a.Set     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f22455fF     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.appnext.base.b.d$a r1 = com.appnext.base.p264b.C8850d.C8851a.JSONArray     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f22455fF     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.appnext.base.b.d$a r1 = com.appnext.base.p264b.C8850d.C8851a.JSONObject     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appnext.base.p264b.C8857j.C88581.<clinit>():void");
        }
    }

    /* renamed from: b */
    public static Object m26705b(String str, C8850d.C8851a aVar) {
        try {
            switch (C88581.f22455fF[aVar.ordinal()]) {
                case 1:
                    return Integer.valueOf(str);
                case 2:
                    return Double.valueOf(str);
                case 3:
                    return Long.valueOf(str);
                case 4:
                    return Boolean.valueOf(str);
                case 5:
                    return new HashSet(Arrays.asList(str.split(",")));
                case 6:
                    return new JSONArray(str);
                case 7:
                    return new JSONObject(str);
                default:
                    return str;
            }
        } catch (Throwable unused) {
            return null;
        }
    }
}
