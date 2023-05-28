package kotlin.reflect.jvm.internal.impl.resolve;

import com.appnext.base.p264b.C8850d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* compiled from: OverridingStrategy.kt */
public abstract class NonReportingOverrideStrategy extends OverridingStrategy {
    /* access modifiers changed from: protected */
    public abstract void conflict(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2);

    public void overrideConflict(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "fromSuper");
        Intrinsics.checkNotNullParameter(callableMemberDescriptor2, "fromCurrent");
        conflict(callableMemberDescriptor, callableMemberDescriptor2);
    }

    public void inheritanceConflict(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "first");
        Intrinsics.checkNotNullParameter(callableMemberDescriptor2, C8850d.f22428fh);
        conflict(callableMemberDescriptor, callableMemberDescriptor2);
    }
}
