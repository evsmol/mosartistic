package com.apm.insight.p174h;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.apm.insight.h.a */
public class C6618a {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f14228a;

    /* renamed from: com.apm.insight.h.a$a */
    public static class C6619a<T> {

        /* renamed from: a */
        public final Class<? extends T> f14229a;

        /* renamed from: b */
        public final T f14230b;
    }

    static {
        HashMap hashMap = new HashMap();
        f14228a = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        f14228a.put(Byte.class, Byte.TYPE);
        f14228a.put(Character.class, Character.TYPE);
        f14228a.put(Short.class, Short.TYPE);
        f14228a.put(Integer.class, Integer.TYPE);
        f14228a.put(Float.class, Float.TYPE);
        f14228a.put(Long.class, Long.TYPE);
        f14228a.put(Double.class, Double.TYPE);
        f14228a.put(Boolean.TYPE, Boolean.TYPE);
        f14228a.put(Byte.TYPE, Byte.TYPE);
        f14228a.put(Character.TYPE, Character.TYPE);
        f14228a.put(Short.TYPE, Short.TYPE);
        f14228a.put(Integer.TYPE, Integer.TYPE);
        f14228a.put(Float.TYPE, Float.TYPE);
        f14228a.put(Long.TYPE, Long.TYPE);
        f14228a.put(Double.TYPE, Double.TYPE);
    }

    /* renamed from: a */
    public static <T> T m16324a(Class<?> cls, String str, Object... objArr) {
        return m16326a(cls, str, (Class<?>[]) m16329a(objArr)).invoke((Object) null, m16330b(objArr));
    }

    /* renamed from: a */
    public static <T> T m16325a(String str, String str2, Object... objArr) {
        try {
            return m16324a(Class.forName(str), str2, objArr);
        } catch (Exception e) {
            Log.w("JavaCalls", "Meet exception when call Method '" + str2 + "' in " + str, e);
            return null;
        }
    }

    /* renamed from: a */
    private static Method m16326a(Class<?> cls, String str, Class<?>... clsArr) {
        Method a = m16327a(cls.getDeclaredMethods(), str, clsArr);
        if (a != null) {
            a.setAccessible(true);
            return a;
        } else if (cls.getSuperclass() != null) {
            return m16326a((Class<?>) cls.getSuperclass(), str, clsArr);
        } else {
            throw new NoSuchMethodException();
        }
    }

    /* renamed from: a */
    private static Method m16327a(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str != null) {
            for (Method method : methodArr) {
                if (method.getName().equals(str) && m16328a(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        }
        throw new NullPointerException("Method name must not be null.");
    }

    /* renamed from: a */
    private static boolean m16328a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr == null) {
            return clsArr2 == null || clsArr2.length == 0;
        }
        if (clsArr2 == null) {
            return clsArr.length == 0;
        }
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr.length; i++) {
            if (!clsArr[i].isAssignableFrom(clsArr2[i]) && (!f14228a.containsKey(clsArr[i]) || !f14228a.get(clsArr[i]).equals(f14228a.get(clsArr2[i])))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static Class<?>[] m16329a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            C6619a aVar = objArr[i];
            if (aVar == null || !(aVar instanceof C6619a)) {
                clsArr[i] = aVar == null ? null : aVar.getClass();
            } else {
                clsArr[i] = aVar.f14229a;
            }
        }
        return clsArr;
    }

    /* renamed from: b */
    private static Object[] m16330b(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            C6619a aVar = objArr[i];
            if (aVar == null || !(aVar instanceof C6619a)) {
                objArr2[i] = aVar;
            } else {
                objArr2[i] = aVar.f14230b;
            }
        }
        return objArr2;
    }
}
