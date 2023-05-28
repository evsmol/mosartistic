package com.ironsource.environment;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.mediationsdk.config.VersionInfo;
import java.io.DataOutputStream;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.environment.e */
public final class C4394e {

    /* renamed from: c */
    public static String f10476c = "";

    /* renamed from: a */
    Context f10477a;

    /* renamed from: b */
    String f10478b;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public JSONObject f10479d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f10480e;

    /* renamed from: f */
    private String f10481f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f10482g;

    /* renamed from: h */
    private Thread.UncaughtExceptionHandler f10483h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f10484i;

    /* renamed from: com.ironsource.environment.e$a */
    static class C4398a {

        /* renamed from: a */
        static volatile C4394e f10490a = new C4394e((byte) 0);
    }

    private C4394e() {
        this.f10482g = false;
        this.f10479d = new JSONObject();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.f10483h = defaultUncaughtExceptionHandler;
        this.f10478b = " ";
        this.f10484i = "https://outcome-crash-report.supersonicads.com/reporter";
        Thread.setDefaultUncaughtExceptionHandler(new C4391d(defaultUncaughtExceptionHandler));
    }

    /* synthetic */ C4394e(byte b) {
        this();
    }

    /* renamed from: a */
    public static C4394e m12498a() {
        return C4398a.f10490a;
    }

    /* renamed from: a */
    private static String m12499a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities == null) {
                    return "none";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return "wifi";
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "cellular";
                }
            } else {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("WIFI")) {
                        return "wifi";
                    }
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("MOBILE")) {
                        return "cellular";
                    }
                }
            }
            return "none";
        } catch (Exception e) {
            e.printStackTrace();
            return "none";
        }
    }

    /* renamed from: a */
    public final void mo33202a(final Context context, HashSet<String> hashSet, String str, String str2, boolean z, final String str3, int i, boolean z2) {
        if (context != null) {
            Log.d("automation_log", "init ISCrashReporter");
            this.f10477a = context;
            if (!TextUtils.isEmpty(str2)) {
                this.f10478b = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                this.f10484i = str;
            }
            this.f10481f = str3;
            if (z) {
                C4377a aVar = new C4377a(i);
                aVar.f10446c = z2;
                aVar.f10445b = true;
                aVar.f10444a = new C4383b() {
                    /* renamed from: a */
                    public final void mo33189a() {
                        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
                        StringBuilder sb = new StringBuilder(128);
                        for (Thread next : allStackTraces.keySet()) {
                            StackTraceElement[] stackTrace = next.getStackTrace();
                            if (stackTrace != null && stackTrace.length > 0) {
                                sb.append("*** Thread Name ");
                                sb.append(next.getName());
                                sb.append(" Thread ID ");
                                sb.append(next.getId());
                                sb.append(" (");
                                sb.append(next.getState().toString());
                                sb.append(") ***\n");
                                for (StackTraceElement stackTraceElement : stackTrace) {
                                    sb.append(stackTraceElement.toString());
                                    sb.append(" ");
                                    sb.append(next.getState().toString());
                                    sb.append("\n");
                                }
                            }
                        }
                        C4394e.f10476c = sb.toString();
                    }

                    /* renamed from: b */
                    public final void mo33190b() {
                    }
                };
                aVar.start();
            }
            String a = m12499a(this.f10477a);
            if (!a.equals("none")) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("CRep", 0);
                String string = sharedPreferences.getString("String1", this.f10480e);
                String string2 = sharedPreferences.getString("sId", this.f10481f);
                new StringBuilder();
                for (C4386c next : C4402f.m12522a()) {
                    String b = next.mo33194b();
                    String a2 = next.mo33193a();
                    String c = next.mo33195c();
                    String packageName = context.getPackageName();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("crashDate", b);
                        jSONObject.put("stacktraceCrash", a2);
                        jSONObject.put("crashType", c);
                        jSONObject.put("CrashReporterVersion", "1.0.5");
                        jSONObject.put("SDKVersion", VersionInfo.VERSION);
                        jSONObject.put("deviceLanguage", C4407h.m12541a(context));
                        jSONObject.put("appVersion", C4386c.m12480c(context, packageName));
                        jSONObject.put("deviceOSVersion", C4407h.m12553e());
                        jSONObject.put("network", a);
                        jSONObject.put("deviceApiLevel", C4407h.m12555f());
                        jSONObject.put("deviceModel", C4407h.m12557g());
                        jSONObject.put("deviceOS", C4407h.m12561i());
                        jSONObject.put("advertisingId", string);
                        jSONObject.put("isLimitAdTrackingEnabled", this.f10482g);
                        jSONObject.put("deviceOEM", C4407h.m12559h());
                        jSONObject.put("systemProperties", System.getProperties());
                        jSONObject.put("bundleId", packageName);
                        jSONObject.put("sId", string2);
                        JSONObject jSONObject2 = new JSONObject();
                        if (hashSet != null && !hashSet.isEmpty()) {
                            Iterator<String> it = hashSet.iterator();
                            while (it.hasNext()) {
                                String next2 = it.next();
                                try {
                                    if (jSONObject.has(next2)) {
                                        jSONObject2.put(next2, jSONObject.opt(next2));
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                            jSONObject = jSONObject2;
                        }
                        this.f10479d = jSONObject;
                    } catch (Exception unused) {
                    }
                    if (this.f10479d.length() == 0) {
                        Log.d("ISCrashReport", " Is Empty");
                    } else {
                        new Thread(new Runnable() {
                            public final void run() {
                                try {
                                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(C4394e.m12498a().f10484i).openConnection();
                                    httpURLConnection.setRequestMethod("POST");
                                    httpURLConnection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
                                    httpURLConnection.setRequestProperty("Accept", "application/json");
                                    httpURLConnection.setDoOutput(true);
                                    httpURLConnection.setDoInput(true);
                                    Log.i("JSON", C4394e.this.f10479d.toString());
                                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                                    dataOutputStream.writeBytes(C4394e.this.f10479d.toString());
                                    dataOutputStream.flush();
                                    dataOutputStream.close();
                                    Log.i("STATUS", String.valueOf(httpURLConnection.getResponseCode()));
                                    Log.i("MSG", httpURLConnection.getResponseMessage());
                                    httpURLConnection.disconnect();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }).start();
                        C4402f.m12525c();
                    }
                }
            }
            new Thread(new Runnable() {
                public final void run() {
                    try {
                        String[] C = C4407h.m12535C(context);
                        if (C != null && C.length == 2) {
                            if (!TextUtils.isEmpty(C[0])) {
                                String unused = C4394e.this.f10480e = C[0];
                            }
                            boolean unused2 = C4394e.this.f10482g = Boolean.parseBoolean(C[1]);
                            SharedPreferences.Editor edit = context.getSharedPreferences("CRep", 0).edit();
                            edit.putString("String1", C4394e.this.f10480e);
                            edit.putString("sId", str3);
                            edit.apply();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
