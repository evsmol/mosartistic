package com.appodeal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.appodeal.ads.modules.common.internal.data.ApplicationData;
import com.appodeal.ads.segments.C9503n;
import com.appodeal.ads.storage.C9529a;
import com.appodeal.ads.storage.C9562o;
import com.appodeal.ads.utils.Log;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.j0 */
public final class C9227j0 implements ApplicationData {

    /* renamed from: c */
    public static final C9227j0 f23188c = new C9227j0();

    /* renamed from: a */
    public final Lazy f23189a = LazyKt.lazy(C9228a.f23191a);

    /* renamed from: b */
    public final List<String> f23190b = CollectionsKt.listOf("com.android.vending", "com.google.android.feedback", "com.amazon.venezia");

    /* renamed from: com.appodeal.ads.j0$a */
    public static final class C9228a extends Lambda implements Function0<C9562o> {

        /* renamed from: a */
        public static final C9228a f23191a = new C9228a();

        public C9228a() {
            super(0);
        }

        public final Object invoke() {
            return C9562o.f24251b;
        }
    }

    public final String getAppName() {
        return C9217i0.f23171a;
    }

    public final String getBuildVersion() {
        String str = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(str, "RELEASE");
        return str;
    }

    public final String getFrameworkName() {
        return C9409q4.f23845g;
    }

    public final String getFrameworkVersion() {
        return C9409q4.f23847i;
    }

    public final String getInstaller(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (Throwable th) {
            Log.log(th);
            return null;
        }
    }

    public final String getPackageName(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        return packageName;
    }

    public final String getPluginVersion() {
        return C9409q4.f23846h;
    }

    public final String getSdkKey() {
        return ((C9529a) this.f23189a.getValue()).mo60775c();
    }

    public final String getSdkVersion() {
        return C9409q4.m27878n();
    }

    public final long getSegmentId() {
        return C9503n.m28137c().f24113a;
    }

    public final String getSessionUuid() {
        return C9409q4.m27877m().mo61191j();
    }

    public final String getTargetSdkVersion(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return String.valueOf(context.getApplicationInfo().targetSdkVersion);
    }

    public final long getUptime() {
        return C9409q4.m27877m().mo61189h();
    }

    public final long getUptimeMono() {
        return C9409q4.m27877m().mo61190i();
    }

    public final int getVersionCode(Context context) {
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullParameter(context, "context");
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            packageInfo = packageManager.getPackageInfo(packageName, 0);
        } catch (Throwable th) {
            Log.log(th);
            packageInfo = null;
        }
        if (packageInfo == null) {
            return 0;
        }
        return packageInfo.versionCode;
    }

    public final String getVersionName(Context context) {
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullParameter(context, "context");
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            packageInfo = packageManager.getPackageInfo(packageName, 0);
        } catch (Throwable th) {
            Log.log(th);
            packageInfo = null;
        }
        if (packageInfo == null) {
            return null;
        }
        return packageInfo.versionName;
    }

    public final boolean isAppodealInitialized() {
        return C9409q4.f23841c;
    }

    public final boolean isAppodealInitializing() {
        return C9409q4.f23840b;
    }

    public final boolean isSideLoaded(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String installer = getInstaller(context);
        return installer != null && this.f23190b.contains(installer);
    }

    public final boolean isTestMode() {
        return C9422r0.f23913b;
    }
}
