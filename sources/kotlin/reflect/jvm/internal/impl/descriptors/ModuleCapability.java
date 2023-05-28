package kotlin.reflect.jvm.internal.impl.descriptors;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModuleCapability.kt */
public final class ModuleCapability<T> {
    private final String name;

    public ModuleCapability(String str) {
        Intrinsics.checkNotNullParameter(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.name = str;
    }

    public String toString() {
        return this.name;
    }
}
