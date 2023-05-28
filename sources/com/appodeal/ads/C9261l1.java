package com.appodeal.ads;

import android.content.Context;
import com.appodeal.ads.modules.common.internal.data.ApplicationData;
import com.appodeal.ads.modules.common.internal.data.DeviceData;
import com.appodeal.ads.modules.common.internal.data.UserPersonalData;
import com.appodeal.ads.modules.common.internal.service.InitializationMode;
import com.appodeal.ads.modules.common.internal.service.ServiceOptions;
import com.appodeal.ads.modules.common.internal.service.ServiceVariant;
import com.appodeal.ads.networking.C9328b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.appodeal.ads.l1 */
public final class C9261l1 {

    /* renamed from: com.appodeal.ads.l1$a */
    public /* synthetic */ class C9262a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ServiceVariant.values().length];
            iArr[ServiceVariant.Appsflyer.ordinal()] = 1;
            iArr[ServiceVariant.Adjust.ordinal()] = 2;
            iArr[ServiceVariant.FacebookAnalytics.ordinal()] = 3;
            iArr[ServiceVariant.Firebase.ordinal()] = 4;
            iArr[ServiceVariant.StackAnalytics.ordinal()] = 5;
            iArr[ServiceVariant.SentryAnalytics.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static ServiceOptions m27435a(Context context, ServiceVariant serviceVariant, C9328b bVar, boolean z, C9135b5 b5Var, String str, ApplicationData applicationData, DeviceData deviceData, UserPersonalData userPersonalData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(serviceVariant, "variant");
        Intrinsics.checkNotNullParameter(bVar, "loadedConfig");
        Intrinsics.checkNotNullParameter(b5Var, "serviceConnector");
        Intrinsics.checkNotNullParameter(str, "deviceAdvertisingId");
        Intrinsics.checkNotNullParameter(applicationData, "applicationData");
        Intrinsics.checkNotNullParameter(deviceData, "deviceData");
        Intrinsics.checkNotNullParameter(userPersonalData, "userPersonalData");
        switch (C9262a.$EnumSwitchMapping$0[serviceVariant.ordinal()]) {
            case 1:
                C9328b.C9330b b = bVar.mo60365b();
                if (b != null) {
                    return new ServiceOptions.Appsflyer(context, b.mo60383a(), b.mo60385c(), InitializationMode.Companion.get(b.mo60387e()), b.mo60384b(), b.mo60386d(), b.mo60389f(), b.mo60390g(), z, b5Var);
                }
                break;
            case 2:
                C9328b.C9329a a = bVar.mo60364a();
                if (a != null) {
                    return new ServiceOptions.Adjust(context, a.mo60373a(), str, a.mo60375c(), a.mo60374b(), InitializationMode.Companion.get(a.mo60377e()), a.mo60376d(), a.mo60379f(), a.mo60380g(), z, b5Var);
                }
                break;
            case 3:
                C9328b.C9331c c = bVar.mo60366c();
                if (c != null) {
                    return new ServiceOptions.FacebookAnalytics(context, true, c.mo60394b(), c.mo60395c(), z, b5Var);
                }
                break;
            case 4:
                C9328b.C9332d d = bVar.mo60367d();
                if (d != null) {
                    return new ServiceOptions.Firebase(context, d.mo60401c(), d.mo60400b(), d.mo60399a(), InitializationMode.Companion.get(d.mo60403e()), d.mo60402d(), d.mo60405f(), d.mo60406g(), z, b5Var);
                }
                break;
            case 5:
                C9328b.C9334f f = bVar.mo60370f();
                if (f != null) {
                    return new ServiceOptions.StackAnalytics(context, f.mo60425f(), f.mo60423e(), f.mo60422d(), f.mo60421c(), f.mo60419a(), f.mo60427h(), deviceData, applicationData, userPersonalData, z, f.mo60426g(), false, b5Var, 4096, (DefaultConstructorMarker) null);
                }
                break;
            case 6:
                C9328b.C9333e e = bVar.mo60368e();
                if (e != null) {
                    return new ServiceOptions.SentryAnalytics(context, e.mo60412d(), e.mo60413e(), e.mo60411c(), e.mo60416g(), e.mo60410b(), e.mo60415f(), deviceData, applicationData, userPersonalData, z, false, false, b5Var, 6144, (DefaultConstructorMarker) null);
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return null;
    }
}
