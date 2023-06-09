package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty0;

public abstract class PropertyReference0 extends PropertyReference implements KProperty0 {
    public PropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    /* access modifiers changed from: protected */
    public KCallable computeReflected() {
        return Reflection.property0(this);
    }

    public Object invoke() {
        return get();
    }

    public KProperty0.Getter getGetter() {
        return ((KProperty0) getReflected()).getGetter();
    }
}
