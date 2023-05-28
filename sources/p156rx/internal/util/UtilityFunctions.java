package p156rx.internal.util;

import p156rx.functions.Func1;

/* renamed from: rx.internal.util.UtilityFunctions */
public final class UtilityFunctions {
    public static <T> Func1<? super T, Boolean> alwaysTrue() {
        return AlwaysTrue.INSTANCE;
    }

    /* renamed from: rx.internal.util.UtilityFunctions$AlwaysTrue */
    enum AlwaysTrue implements Func1<Object, Boolean> {
        INSTANCE;

        public Boolean call(Object obj) {
            return true;
        }
    }
}
