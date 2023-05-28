package com.appodeal.ads.modules.common.internal.service;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo38197bv = {}, mo38198d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo38199d2 = {"Lcom/appodeal/ads/modules/common/internal/service/InitializationMode;", "", "Companion", "Passive", "Active", "apd_internal"}, mo38200k = 1, mo38201mv = {1, 6, 0})
public enum InitializationMode {
    Passive("passive"),
    Active(AppMeasurementSdk.ConditionalUserProperty.ACTIVE);
    
    public static final Companion Companion = null;

    /* renamed from: a */
    public final String f23368a;

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u0006"}, mo38199d2 = {"Lcom/appodeal/ads/modules/common/internal/service/InitializationMode$Companion;", "", "", "code", "Lcom/appodeal/ads/modules/common/internal/service/InitializationMode;", "get", "apd_internal"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InitializationMode get(String str) {
            InitializationMode initializationMode;
            InitializationMode[] values = InitializationMode.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    initializationMode = null;
                    break;
                }
                initializationMode = values[i];
                i++;
                if (Intrinsics.areEqual((Object) initializationMode.f23368a, (Object) str)) {
                    break;
                }
            }
            return initializationMode == null ? InitializationMode.Active : initializationMode;
        }
    }

    /* access modifiers changed from: public */
    InitializationMode(String str) {
        this.f23368a = str;
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }
}
