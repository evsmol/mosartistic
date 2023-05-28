package com.criteo.publisher.logging;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.criteo.publisher.logging.i */
/* compiled from: PublisherCodeRemover.kt */
public class C1198i {

    /* renamed from: a */
    private final String f3755a = "com.criteo.";

    /* renamed from: b */
    private final List<String> f3756b = CollectionsKt.listOf("java.", "javax.", "sun.", "com.sun.", "com.intellij.", "org.jetbrains.", "kotlin.", "android.", "com.android.", "androidx.", "dalvik.", "libcore.", "com.google", "com.mopub", "org.json", "com.squareup.", "org.junit.");

    /* renamed from: c */
    private final StackTraceElement f3757c = new StackTraceElement("<private class>", "<private method>", (String) null, 0);

    public C1198i() {
    }

    /* renamed from: c */
    public Throwable mo3344c(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        try {
            return mo3343a(th, (Map<Throwable, Throwable>) new LinkedHashMap());
        } catch (Throwable th2) {
            return new C1199a(th2);
        }
    }

    /* renamed from: a */
    public Throwable mo3343a(Throwable th, Map<Throwable, Throwable> map) {
        Throwable th2;
        Intrinsics.checkParameterIsNotNull(th, "original");
        Intrinsics.checkParameterIsNotNull(map, "visited");
        Throwable th3 = map.get(th);
        if (th3 != null) {
            return th3;
        }
        if (m5415b(th)) {
            th2 = m5412a(th) ? new C1201b(th) : new C1201b();
        } else {
            th2 = th;
        }
        map.put(th, th2);
        Throwable cause = th.getCause();
        boolean areEqual = cause != null ? Intrinsics.areEqual((Object) cause.toString(), (Object) th.getMessage()) : false;
        m5410a(th, th2, map);
        m5413b(th, th2, map);
        m5409a(th, th2);
        Throwable cause2 = th2.getCause();
        if (cause2 != null && areEqual) {
            C1202c.f3761d.mo3345a(th2, cause2.toString());
        }
        return th2;
    }

    /* renamed from: a */
    private void m5410a(Throwable th, Throwable th2, Map<Throwable, Throwable> map) {
        Throwable cause = th.getCause();
        if (cause != null) {
            C1202c.f3761d.mo3346a(th2, mo3343a(cause, map));
        }
    }

    /* renamed from: b */
    private void m5413b(Throwable th, Throwable th2, Map<Throwable, Throwable> map) {
        Throwable[] suppressed = th.getSuppressed();
        Intrinsics.checkExpressionValueIsNotNull(suppressed, "originalSuppressed");
        if (!(suppressed.length == 0)) {
            ArrayList arrayList = new ArrayList(suppressed.length);
            for (Throwable th3 : suppressed) {
                Intrinsics.checkExpressionValueIsNotNull(th3, "it");
                arrayList.add(mo3343a(th3, map));
            }
            C1202c.f3761d.mo3347a(th2, (List<? extends Throwable>) arrayList);
        }
    }

    /* renamed from: a */
    private void m5409a(Throwable th, Throwable th2) {
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkExpressionValueIsNotNull(stackTrace, "original.stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            Intrinsics.checkExpressionValueIsNotNull(stackTraceElement, "it");
            if (m5414b(stackTraceElement) || m5411a(stackTraceElement)) {
                arrayList.add(stackTraceElement);
            } else if (arrayList.isEmpty() || (!Intrinsics.areEqual((Object) (StackTraceElement) CollectionsKt.last(arrayList), (Object) this.f3757c))) {
                arrayList.add(this.f3757c);
            }
        }
        Object[] array = arrayList.toArray(new StackTraceElement[0]);
        if (array != null) {
            th2.setStackTrace((StackTraceElement[]) array);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    private boolean m5411a(StackTraceElement stackTraceElement) {
        List<String> list = this.f3756b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (String startsWith$default : list) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkExpressionValueIsNotNull(className, "className");
            if (StringsKt.startsWith$default(className, startsWith$default, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private boolean m5414b(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        Intrinsics.checkExpressionValueIsNotNull(className, "className");
        return StringsKt.startsWith$default(className, this.f3755a, false, 2, (Object) null);
    }

    /* renamed from: b */
    private boolean m5415b(Throwable th) {
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkExpressionValueIsNotNull(stackTrace, "stackTrace");
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                stackTraceElement = null;
                break;
            }
            stackTraceElement = stackTrace[i];
            Intrinsics.checkExpressionValueIsNotNull(stackTraceElement, "it");
            if (!m5411a(stackTraceElement)) {
                break;
            }
            i++;
        }
        if (stackTraceElement != null) {
            return !m5414b(stackTraceElement);
        }
        return false;
    }

    /* renamed from: a */
    private boolean m5412a(Throwable th) {
        List<String> list = this.f3756b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (String startsWith$default : list) {
            String name = th.getClass().getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "javaClass.name");
            if (StringsKt.startsWith$default(name, startsWith$default, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: com.criteo.publisher.logging.i$c */
    /* compiled from: PublisherCodeRemover.kt */
    public static final class C1202c {

        /* renamed from: a */
        private static final Field f3758a;

        /* renamed from: b */
        private static final Field f3759b;

        /* renamed from: c */
        private static final Field f3760c;

        /* renamed from: d */
        public static final C1202c f3761d;

        static {
            C1202c cVar = new C1202c();
            f3761d = cVar;
            f3758a = cVar.m5418a("cause");
            f3759b = cVar.m5418a("suppressedExceptions");
            f3760c = cVar.m5418a("detailMessage");
        }

        private C1202c() {
        }

        /* renamed from: a */
        private final Field m5418a(String str) {
            Field declaredField = Throwable.class.getDeclaredField(str);
            Intrinsics.checkExpressionValueIsNotNull(declaredField, "field");
            declaredField.setAccessible(true);
            return declaredField;
        }

        /* renamed from: a */
        public final void mo3346a(Throwable th, Throwable th2) {
            Intrinsics.checkParameterIsNotNull(th, "$this$internalCause");
            f3758a.set(th, th2);
        }

        /* renamed from: a */
        public final void mo3347a(Throwable th, List<? extends Throwable> list) {
            Intrinsics.checkParameterIsNotNull(th, "$this$internalSuppressedExceptions");
            f3759b.set(th, list);
        }

        /* renamed from: a */
        public final void mo3345a(Throwable th, String str) {
            Intrinsics.checkParameterIsNotNull(th, "$this$internalDetailMessage");
            f3760c.set(th, str);
        }
    }

    /* renamed from: com.criteo.publisher.logging.i$b */
    /* compiled from: PublisherCodeRemover.kt */
    public static final class C1201b extends RuntimeException {
        public C1201b() {
            this("custom");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C1201b(java.lang.Throwable r2) {
            /*
                r1 = this;
                java.lang.String r0 = "throwable"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
                java.lang.Class r2 = r2.getClass()
                java.lang.String r2 = r2.getSimpleName()
                java.lang.String r0 = "throwable.javaClass.simpleName"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r0)
                r1.<init>((java.lang.String) r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.criteo.publisher.logging.C1198i.C1201b.<init>(java.lang.Throwable):void");
        }

        private C1201b(String str) {
            super("A " + str + " exception occurred from publisher's code");
        }
    }

    /* renamed from: com.criteo.publisher.logging.i$a */
    /* compiled from: PublisherCodeRemover.kt */
    private static final class C1199a extends RuntimeException {
        static {
            new C1200a((DefaultConstructorMarker) null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1199a(Throwable th) {
            super("Exception occurred while removing publisher code. " + th.getClass().getSimpleName() + ": " + th.getMessage());
            Intrinsics.checkParameterIsNotNull(th, "cause");
            StackTraceElement[] stackTrace = th.getStackTrace();
            Intrinsics.checkExpressionValueIsNotNull(stackTrace, "cause.stackTrace");
            Object[] copyOf = Arrays.copyOf(stackTrace, Math.min(th.getStackTrace().length, 5));
            Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            setStackTrace((StackTraceElement[]) copyOf);
        }

        /* renamed from: com.criteo.publisher.logging.i$a$a */
        /* compiled from: PublisherCodeRemover.kt */
        private static final class C1200a {
            private C1200a() {
            }

            public /* synthetic */ C1200a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }
}
