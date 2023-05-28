package com.adcolony.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Toast;
import androidx.preference.PreferenceManager;
import com.adcolony.sdk.C6288e0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.CRC32;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.z0 */
class C6509z0 {

    /* renamed from: a */
    private static ExecutorService f13972a = m15970h();

    /* renamed from: b */
    static Handler f13973b;

    /* renamed from: com.adcolony.sdk.z0$a */
    class C6510a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f13974a;

        /* renamed from: b */
        final /* synthetic */ String f13975b;

        /* renamed from: c */
        final /* synthetic */ int f13976c;

        C6510a(Context context, String str, int i) {
            this.f13974a = context;
            this.f13975b = str;
            this.f13976c = i;
        }

        public void run() {
            Toast.makeText(this.f13974a, this.f13975b, this.f13976c).show();
        }
    }

    /* renamed from: com.adcolony.sdk.z0$b */
    interface C6511b extends Runnable {
        /* renamed from: a */
        boolean mo50220a();
    }

    /* renamed from: a */
    static boolean m15941a(ExecutorService executorService, Runnable runnable) {
        try {
            executorService.execute(runnable);
            return true;
        } catch (RejectedExecutionException unused) {
            return false;
        }
    }

    /* renamed from: b */
    static String m15947b(Context context, String str) {
        return m15948b(m15954c(context), str);
    }

    /* renamed from: c */
    static SharedPreferences m15954c(Context context) {
        try {
            Class.forName("androidx.preference.PreferenceManager");
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (ClassNotFoundException unused) {
            return context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        }
    }

    @Deprecated
    /* renamed from: d */
    static int m15959d() {
        Context a = C6185a.m14880a();
        if (a == null) {
            return 0;
        }
        try {
            return a.getPackageManager().getPackageInfo(a.getPackageName(), 0).versionCode;
        } catch (Exception unused) {
            new C6288e0.C6289a().mo50644a("Failed to retrieve package info.").mo50645a(C6288e0.f13498i);
            return 0;
        }
    }

    /* renamed from: e */
    private static Handler m15962e() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return null;
        }
        if (f13973b == null) {
            f13973b = new Handler(mainLooper);
        }
        return f13973b;
    }

    /* renamed from: f */
    static int m15966f(String str) {
        try {
            return (int) Long.parseLong(str, 16);
        } catch (NumberFormatException unused) {
            new C6288e0.C6289a().mo50644a("Unable to parse '").mo50644a(str).mo50644a("' as a color.").mo50645a(C6288e0.f13496g);
            return -16777216;
        }
    }

    /* renamed from: g */
    static boolean m15969g() {
        Context a = C6185a.m14880a();
        return a != null && Build.VERSION.SDK_INT >= 24 && (a instanceof Activity) && ((Activity) a).isInMultiWindowMode();
    }

    /* renamed from: h */
    static ExecutorService m15970h() {
        return new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    /* renamed from: com.adcolony.sdk.z0$c */
    static class C6512c {

        /* renamed from: a */
        private long f13977a;

        /* renamed from: b */
        private long f13978b = System.currentTimeMillis();

        C6512c(long j) {
            mo51113a(j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo51113a(long j) {
            this.f13977a = j;
            this.f13978b = System.currentTimeMillis() + this.f13977a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public long mo51115b() {
            return this.f13977a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public long mo51116c() {
            return this.f13978b - this.f13977a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public long mo51117d() {
            long currentTimeMillis = this.f13978b - System.currentTimeMillis();
            if (currentTimeMillis <= 0) {
                return 0;
            }
            return currentTimeMillis;
        }

        public String toString() {
            return String.valueOf(((double) mo51117d()) / 1000.0d);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo51114a() {
            return mo51117d() == 0;
        }
    }

    /* renamed from: a */
    static boolean m15937a(Runnable runnable) {
        return m15941a(f13972a, runnable);
    }

    /* renamed from: b */
    static String m15948b(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, (String) null);
        } catch (ClassCastException unused) {
            C6288e0.C6289a aVar = new C6288e0.C6289a();
            aVar.mo50644a("Key " + str + " in SharedPreferences ").mo50644a("does not have a String value.").mo50645a(C6288e0.f13496g);
            return null;
        }
    }

    /* renamed from: a */
    static int m15922a(Context context, String str) {
        return m15923a(m15954c(context), str);
    }

    /* renamed from: a */
    static int m15923a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            C6288e0.C6289a aVar = new C6288e0.C6289a();
            aVar.mo50644a("Key " + str + " in SharedPreferences ").mo50644a("does not have an int value.").mo50645a(C6288e0.f13496g);
            return -1;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        return new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", r1).parse(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        return new java.text.SimpleDateFormat("yyyy-MM-dd", r1).parse(r5);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x001c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0021 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.Date m15968g(java.lang.String r5) {
        /*
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "yyyy-MM-dd'T'HH:mmZ"
            r0.<init>(r2, r1)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r3 = "yyyy-MM-dd'T'HH:mm:ssZ"
            r2.<init>(r3, r1)
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.lang.String r4 = "yyyy-MM-dd"
            r3.<init>(r4, r1)
            java.util.Date r5 = r0.parse(r5)     // Catch:{ Exception -> 0x001c }
            return r5
        L_0x001c:
            java.util.Date r5 = r2.parse(r5)     // Catch:{ Exception -> 0x0021 }
            return r5
        L_0x0021:
            java.util.Date r5 = r3.parse(r5)     // Catch:{ Exception -> 0x0026 }
            return r5
        L_0x0026:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C6509z0.m15968g(java.lang.String):java.util.Date");
    }

    /* renamed from: c */
    static C6294f1 m15955c(C6294f1 f1Var) {
        f1Var.mo50681a(new String[]{"ads_to_restore"});
        return f1Var;
    }

    /* renamed from: f */
    static int m15965f(Context context) {
        int identifier;
        if (context != null && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: b */
    static C6294f1 m15945b(C6294f1 f1Var) {
        f1Var.mo50709r("launch_metadata");
        return f1Var;
    }

    /* renamed from: e */
    static boolean m15964e(String str) {
        if (str != null && str.length() <= 128) {
            return true;
        }
        new C6288e0.C6289a().mo50644a("String must be non-null and the max length is 128 characters.").mo50645a(C6288e0.f13495f);
        return false;
    }

    /* renamed from: b */
    static String m15946b() {
        Application application;
        Context a = C6185a.m14880a();
        if (a == null) {
            return "";
        }
        if (a instanceof Application) {
            application = (Application) a;
        } else {
            application = ((Activity) a).getApplication();
        }
        PackageManager packageManager = application.getPackageManager();
        try {
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(a.getPackageName(), 0)).toString();
        } catch (Exception unused) {
            new C6288e0.C6289a().mo50644a("Failed to retrieve application label.").mo50645a(C6288e0.f13498i);
            return "";
        }
    }

    /* renamed from: c */
    static boolean m15958c(String str) {
        Application application;
        Context a = C6185a.m14880a();
        if (a == null) {
            return false;
        }
        try {
            if (a instanceof Application) {
                application = (Application) a;
            } else {
                application = ((Activity) a).getApplication();
            }
            application.getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    static C6294f1 m15928a(C6294f1 f1Var) {
        C6294f1 f1Var2 = f1Var;
        f1Var2.mo50681a(new String[]{"data_path", "media_path", "temp_storage_path", "device_api", "display_dpi", "mac_address", "memory_class", "memory_used_mb", "model", "arch", "timezone_ietf", "timezone_gmt_m", "timezone_dst_m", "density", "dark_mode", "launch_metadata"});
        return f1Var2;
    }

    /* renamed from: d */
    static String m15961d(Context context) {
        try {
            return context.getPackageName();
        } catch (Exception unused) {
            return DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
        }
    }

    /* renamed from: f */
    static String m15967f() {
        Context a = C6185a.m14880a();
        return (!(a instanceof Activity) || a.getResources().getConfiguration().orientation != 1) ? "landscape" : "portrait";
    }

    /* renamed from: d */
    static int m15960d(String str) {
        str.hashCode();
        if (!str.equals("portrait")) {
            return !str.equals("landscape") ? -1 : 1;
        }
        return 0;
    }

    /* renamed from: e */
    static C6290e1 m15963e(Context context) {
        C6290e1 a = C6235c0.m15059a();
        if (context != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                if (packageInfo.requestedPermissions != null) {
                    a = C6235c0.m15059a();
                    int i = 0;
                    while (true) {
                        String[] strArr = packageInfo.requestedPermissions;
                        if (i >= strArr.length) {
                            break;
                        }
                        a.mo50652b(strArr[i]);
                        i++;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return a;
    }

    /* renamed from: c */
    static String m15956c() {
        Context a = C6185a.m14880a();
        if (a == null) {
            return "1.0";
        }
        try {
            return a.getPackageManager().getPackageInfo(a.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            new C6288e0.C6289a().mo50644a("Failed to retrieve package info.").mo50645a(C6288e0.f13498i);
            return "1.0";
        }
    }

    /* renamed from: a */
    static int m15925a(String str) {
        CRC32 crc32 = new CRC32();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            crc32.update(str.charAt(i));
        }
        return (int) crc32.getValue();
    }

    /* renamed from: c */
    static boolean m15957c(Runnable runnable) {
        Handler e;
        if (runnable == null || (e = m15962e()) == null) {
            return false;
        }
        e.removeCallbacks(runnable);
        return true;
    }

    /* renamed from: b */
    static String m15950b(String str) {
        try {
            return C6285d1.m15187a(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    static boolean m15953b(Runnable runnable) {
        Handler e;
        if (runnable == null || (e = m15962e()) == null) {
            return false;
        }
        if (e.getLooper() != Looper.myLooper()) {
            return e.post(runnable);
        }
        runnable.run();
        return true;
    }

    /* renamed from: a */
    static String m15929a() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: a */
    static C6290e1 m15927a(int i) {
        C6290e1 a = C6235c0.m15059a();
        for (int i2 = 0; i2 < i; i2++) {
            C6235c0.m15066a(a, m15929a());
        }
        return a;
    }

    /* renamed from: a */
    static boolean m15938a(Runnable runnable, long j) {
        if (runnable == null) {
            return false;
        }
        if (j <= 0) {
            return m15953b(runnable);
        }
        Handler e = m15962e();
        if (e != null) {
            return e.postDelayed(runnable, j);
        }
        return false;
    }

    /* renamed from: b */
    static boolean m15952b(AudioManager audioManager) {
        if (audioManager == null) {
            new C6288e0.C6289a().mo50644a("isAudioEnabled() called with a null AudioManager").mo50645a(C6288e0.f13498i);
            return false;
        }
        try {
            if (audioManager.getStreamVolume(3) > 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            new C6288e0.C6289a().mo50644a("Exception occurred when accessing AudioManager.getStreamVolume: ").mo50644a(e.toString()).mo50645a(C6288e0.f13498i);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m15936a(C6511b bVar) {
        Handler e;
        if (bVar == null || (e = m15962e()) == null) {
            return false;
        }
        e.removeCallbacks(bVar);
        if (bVar.mo50220a()) {
            return true;
        }
        if (e.getLooper() == Looper.myLooper()) {
            bVar.run();
            return true;
        }
        e.post(bVar);
        return true;
    }

    /* renamed from: a */
    static double m15921a(AudioManager audioManager) {
        if (audioManager == null) {
            new C6288e0.C6289a().mo50644a("getAudioVolume() called with a null AudioManager").mo50645a(C6288e0.f13498i);
            return 0.0d;
        }
        try {
            double streamVolume = (double) audioManager.getStreamVolume(3);
            double streamMaxVolume = (double) audioManager.getStreamMaxVolume(3);
            if (streamMaxVolume == 0.0d) {
                return 0.0d;
            }
            return streamVolume / streamMaxVolume;
        } catch (Exception e) {
            new C6288e0.C6289a().mo50644a("Exception occurred when accessing AudioManager: ").mo50644a(e.toString()).mo50645a(C6288e0.f13498i);
            return 0.0d;
        }
    }

    /* renamed from: b */
    static int m15942b(Context context) {
        int i;
        if (context == null) {
            return 0;
        }
        if (context.getResources().getConfiguration().orientation == 1) {
            i = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        } else {
            i = context.getResources().getIdentifier("navigation_bar_height_landscape", "dimen", "android");
        }
        if (i > 0) {
            return context.getResources().getDimensionPixelSize(i);
        }
        return 0;
    }

    /* renamed from: b */
    static String m15949b(C6290e1 e1Var) throws JSONException {
        String str = "";
        for (int i = 0; i < e1Var.mo50650b(); i++) {
            if (i > 0) {
                str = str + ",";
            }
            str = str + e1Var.mo50651b(i);
        }
        return str;
    }

    /* renamed from: b */
    static int m15944b(C6454v0 v0Var) {
        boolean z = false;
        try {
            Context a = C6185a.m14880a();
            if (a == null) {
                return 0;
            }
            int i = (int) (a.getPackageManager().getPackageInfo(a.getPackageName(), 0).lastUpdateTime / 1000);
            C6294f1 g = v0Var.mo51058g();
            int i2 = 1;
            if (!g.mo50682a("last_update")) {
                z = true;
                i2 = 2;
            } else if (C6235c0.m15083d(g, "last_update") != i) {
                z = true;
            } else {
                i2 = 0;
            }
            if (z) {
                try {
                    C6235c0.m15077b(g, "last_update", i);
                    v0Var.mo51052a(g);
                } catch (Exception unused) {
                    return i2;
                }
            }
            return i2;
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: a */
    static AudioManager m15926a(Context context) {
        if (context != null) {
            return (AudioManager) context.getSystemService("audio");
        }
        new C6288e0.C6289a().mo50644a("getAudioManager called with a null Context").mo50645a(C6288e0.f13498i);
        return null;
    }

    /* renamed from: a */
    static boolean m15940a(String str, File file) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[8192];
                while (true) {
                    try {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        instance.update(bArr, 0, read);
                    } catch (IOException e) {
                        throw new RuntimeException("Unable to process file for MD5", e);
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused) {
                            new C6288e0.C6289a().mo50644a("Exception on closing MD5 input stream").mo50645a(C6288e0.f13498i);
                        }
                        throw th;
                    }
                }
                boolean equals = str.equals(String.format("%40s", new Object[]{new BigInteger(1, instance.digest()).toString(16)}).replace(' ', '0'));
                try {
                    fileInputStream.close();
                } catch (IOException unused2) {
                    new C6288e0.C6289a().mo50644a("Exception on closing MD5 input stream").mo50645a(C6288e0.f13498i);
                }
                return equals;
            } catch (FileNotFoundException unused3) {
                new C6288e0.C6289a().mo50644a("Exception while getting FileInputStream").mo50645a(C6288e0.f13498i);
                return false;
            }
        } catch (NoSuchAlgorithmException unused4) {
            new C6288e0.C6289a().mo50644a("Exception while getting Digest").mo50645a(C6288e0.f13498i);
            return false;
        }
    }

    /* renamed from: b */
    static int m15943b(View view) {
        if (view == null) {
            return 0;
        }
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return (int) (((float) iArr[1]) / C6185a.m14887b().mo50803n().mo50956s());
    }

    /* renamed from: b */
    private static void m15951b(Vibrator vibrator, long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            m15932a(vibrator, j);
        } else {
            vibrator.vibrate(j);
        }
    }

    /* renamed from: a */
    static String m15930a(C6290e1 e1Var) throws JSONException {
        String str = "";
        for (int i = 0; i < e1Var.mo50650b(); i++) {
            if (i > 0) {
                str = str + ",";
            }
            switch (e1Var.mo50651b(i)) {
                case 1:
                    str = str + "MO";
                    break;
                case 2:
                    str = str + "TU";
                    break;
                case 3:
                    str = str + "WE";
                    break;
                case 4:
                    str = str + "TH";
                    break;
                case 5:
                    str = str + "FR";
                    break;
                case 6:
                    str = str + "SA";
                    break;
                case 7:
                    str = str + "SU";
                    break;
            }
        }
        return str;
    }

    /* renamed from: a */
    static boolean m15935a(Intent intent, boolean z) {
        try {
            Context a = C6185a.m14880a();
            if (a == null) {
                return false;
            }
            if (!(a instanceof Activity)) {
                intent.addFlags(268435456);
            }
            AdColonyInterstitial j = C6185a.m14887b().mo50799j();
            if (j != null && j.mo50361i()) {
                j.mo50353e().mo50905f();
            }
            if (z) {
                a.startActivity(Intent.createChooser(intent, "Handle this via..."));
                return true;
            }
            a.startActivity(intent);
            return true;
        } catch (Exception e) {
            new C6288e0.C6289a().mo50644a(e.toString()).mo50645a(C6288e0.f13496g);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m15934a(Intent intent) {
        return m15935a(intent, false);
    }

    /* renamed from: a */
    static boolean m15939a(String str, int i) {
        Context a = C6185a.m14880a();
        if (a == null) {
            return false;
        }
        m15953b((Runnable) new C6510a(a, str, i));
        return true;
    }

    /* renamed from: a */
    static String m15931a(C6454v0 v0Var) {
        C6294f1 g = v0Var.mo51058g();
        String h = C6235c0.m15087h(g, "adc_alt_id");
        if (!h.isEmpty()) {
            return h;
        }
        String a = m15929a();
        C6235c0.m15070a(g, "adc_alt_id", a);
        v0Var.mo51052a(g);
        return a;
    }

    /* renamed from: a */
    static int m15924a(View view) {
        if (view == null) {
            return 0;
        }
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return (int) (((float) iArr[0]) / C6185a.m14887b().mo50803n().mo50956s());
    }

    /* renamed from: a */
    static boolean m15933a(Context context, long j) {
        try {
            Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
            if (vibrator == null || !vibrator.hasVibrator()) {
                return false;
            }
            m15951b(vibrator, j);
            return true;
        } catch (Exception unused) {
            new C6288e0.C6289a().mo50644a("Vibrate command failed.").mo50645a(C6288e0.f13495f);
            return false;
        }
    }

    /* renamed from: a */
    private static void m15932a(Vibrator vibrator, long j) {
        vibrator.vibrate(VibrationEffect.createOneShot(j, -1));
    }
}
