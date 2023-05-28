package com.criteo.publisher;

import com.criteo.publisher.logging.C1193e;
import com.criteo.publisher.model.AdUnit;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.criteo.publisher.y */
/* compiled from: SdkInitLogMessage.kt */
public final class C1331y {
    static {
        new C1331y();
    }

    private C1331y() {
    }

    /* renamed from: a */
    public static final C1193e m5931a() {
        return new C1193e(0, "Unsupported Android version, Criteo SDK is deactivated and won't do anything", (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public static final C1193e m5933a(String str, List<? extends AdUnit> list, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "cpId");
        Intrinsics.checkParameterIsNotNull(list, "adUnits");
        Intrinsics.checkParameterIsNotNull(str2, "version");
        return new C1193e(0, "Criteo SDK version " + str2 + " is initialized with Publisher ID " + str + " and " + list.size() + " ad units:\n" + CollectionsKt.joinToString$default(list, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C1332a.f4053a, 30, (Object) null), (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    /* renamed from: com.criteo.publisher.y$a */
    /* compiled from: SdkInitLogMessage.kt */
    static final class C1332a extends Lambda implements Function1<AdUnit, String> {

        /* renamed from: a */
        public static final C1332a f4053a = new C1332a();

        C1332a() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(AdUnit adUnit) {
            Intrinsics.checkParameterIsNotNull(adUnit, "it");
            return "- " + adUnit;
        }
    }

    /* renamed from: b */
    public static final C1193e m5934b() {
        return new C1193e(0, "Criteo SDK initialization method cannot be called more than once. Please ignore this if you are using a mediation adapter.", (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public static final C1193e m5932a(CriteoInitException criteoInitException) {
        Intrinsics.checkParameterIsNotNull(criteoInitException, "criteoInitException");
        return new C1193e(6, (String) null, criteoInitException, "onErrorDuringSdkInitialization");
    }
}
