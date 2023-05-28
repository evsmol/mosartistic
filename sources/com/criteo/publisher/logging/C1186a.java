package com.criteo.publisher.logging;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* renamed from: com.criteo.publisher.logging.a */
/* compiled from: CallerInferrer.kt */
public final class C1186a {

    /* renamed from: a */
    public static final C1186a f3742a = new C1186a();

    @Documented
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: com.criteo.publisher.logging.a$a */
    /* compiled from: CallerInferrer.kt */
    public @interface C1187a {
    }

    private C1186a() {
    }

    /* renamed from: com.criteo.publisher.logging.a$b */
    /* compiled from: CallerInferrer.kt */
    static final class C1188b extends Lambda implements Function1<Class<?>, String> {

        /* renamed from: a */
        public static final C1188b f3743a = new C1188b();

        C1188b() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(Class<?> cls) {
            Intrinsics.checkExpressionValueIsNotNull(cls, "it");
            String simpleName = cls.getSimpleName();
            Intrinsics.checkExpressionValueIsNotNull(simpleName, "it.simpleName");
            return simpleName;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final String m5388a(Method method) {
        String str;
        Class[] parameterTypes = method.getParameterTypes();
        Intrinsics.checkExpressionValueIsNotNull(parameterTypes, "callerMethod.parameterTypes");
        String joinToString$default = ArraysKt.joinToString$default((Object[]) parameterTypes, (CharSequence) ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) C1188b.f3743a, 30, (Object) null);
        Class<?> declaringClass = method.getDeclaringClass();
        Intrinsics.checkExpressionValueIsNotNull(declaringClass, "callerMethod.declaringClass");
        Package packageR = declaringClass.getPackage();
        if (packageR == null || (str = packageR.getName()) == null) {
            str = "";
        }
        Class<?> declaringClass2 = method.getDeclaringClass();
        Intrinsics.checkExpressionValueIsNotNull(declaringClass2, "callerMethod.declaringClass");
        String name = declaringClass2.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "callerMethod.declaringClass.name");
        String removePrefix = StringsKt.removePrefix(name, str + '.');
        return removePrefix + '#' + method.getName() + '(' + joinToString$default + ')';
    }
}
