package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReflectJavaMember.kt */
final class Java8ParameterNamesLoader {
    public static final Java8ParameterNamesLoader INSTANCE = new Java8ParameterNamesLoader();
    private static Cache cache;

    /* compiled from: ReflectJavaMember.kt */
    public static final class Cache {
        private final Method getName;
        private final Method getParameters;

        public Cache(Method method, Method method2) {
            this.getParameters = method;
            this.getName = method2;
        }

        public final Method getGetName() {
            return this.getName;
        }

        public final Method getGetParameters() {
            return this.getParameters;
        }
    }

    private Java8ParameterNamesLoader() {
    }

    public final Cache getCache() {
        return cache;
    }

    public final void setCache(Cache cache2) {
        cache = cache2;
    }

    public final Cache buildCache(Member member) {
        Intrinsics.checkNotNullParameter(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new Cache(cls.getMethod("getParameters", new Class[0]), ReflectClassUtilKt.getSafeClassLoader(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new Cache((Method) null, (Method) null);
        }
    }

    public final List<String> loadParameterNames(Member member) {
        Method getName;
        Intrinsics.checkNotNullParameter(member, "member");
        Cache cache2 = cache;
        if (cache2 == null) {
            synchronized (this) {
                cache2 = INSTANCE.getCache();
                if (cache2 == null) {
                    cache2 = INSTANCE.buildCache(member);
                    INSTANCE.setCache(cache2);
                }
            }
        }
        Method getParameters = cache2.getGetParameters();
        if (getParameters == null || (getName = cache2.getGetName()) == null) {
            return null;
        }
        Object invoke = getParameters.invoke(member, new Object[0]);
        if (invoke != null) {
            Object[] objArr = (Object[]) invoke;
            Collection arrayList = new ArrayList(objArr.length);
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                Object invoke2 = getName.invoke(obj, new Object[0]);
                if (invoke2 != null) {
                    arrayList.add((String) invoke2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            }
            return (List) arrayList;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<*>");
    }
}
