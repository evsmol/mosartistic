package com.criteo.publisher.p074n0;

import com.criteo.publisher.logging.C1195g;
import com.criteo.publisher.logging.C1197h;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.criteo.publisher.n0.p */
/* compiled from: ReflectionUtil */
public class C1312p {

    /* renamed from: a */
    private static final C1195g f4028a = C1197h.m5407b(C1312p.class);

    /* renamed from: b */
    public static boolean m5784b(Object obj, String str) {
        try {
            return Class.forName(str, false, C1312p.class.getClassLoader()).isAssignableFrom(obj.getClass());
        } catch (ClassNotFoundException | LinkageError e) {
            f4028a.mo3338a("Failed to load class by name to check if instanceof", e);
            return false;
        }
    }

    /* renamed from: a */
    public static Object m5782a(Object obj, String str, Object... objArr) {
        try {
            int length = objArr.length;
            Class[] clsArr = new Class[length];
            for (int i = 0; i < length; i++) {
                clsArr[i] = objArr[i].getClass();
            }
            return obj.getClass().getMethod(str, clsArr).invoke(obj, objArr);
        } catch (IllegalAccessException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            C1195g gVar = f4028a;
            gVar.mo3338a("Failed to call " + str, e);
            return null;
        }
    }

    /* renamed from: a */
    public static Object m5781a(Object obj, String str) {
        try {
            return obj.getClass().getField(str).get(obj);
        } catch (Exception e) {
            C1195g gVar = f4028a;
            gVar.mo3338a("Failed to get field " + str, (Throwable) e);
            return null;
        }
    }

    /* renamed from: a */
    public static void m5783a(Object obj, String str, Object obj2) {
        Field field;
        C1195g gVar;
        StringBuilder sb;
        Field field2 = null;
        try {
            Field field3 = obj.getClass().getField(str);
            try {
                field2 = field3.getClass().getDeclaredField("accessFlags");
                field2.setAccessible(true);
                field2.set(field3, Integer.valueOf(field3.getModifiers() & -17));
                field3.set(obj, obj2);
                if (field3 != null && field2 != null) {
                    try {
                        field2.set(field3, Integer.valueOf(field3.getModifiers() | 16));
                        field2.setAccessible(false);
                        return;
                    } catch (Exception e) {
                        e = e;
                        gVar = f4028a;
                        sb = new StringBuilder();
                    }
                } else {
                    return;
                }
            } catch (Exception e2) {
                e = e2;
                field = field2;
                field2 = field3;
                try {
                    f4028a.mo3338a("Failed to set field " + str, (Throwable) e);
                    if (field2 != null) {
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (!(field2 == null || field == null)) {
                        try {
                            field.set(field2, Integer.valueOf(field2.getModifiers() | 16));
                            field.setAccessible(false);
                        } catch (Exception e3) {
                            f4028a.mo3338a("Failed to reset field to private final " + str, (Throwable) e3);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                field = field2;
                field2 = field3;
                field.set(field2, Integer.valueOf(field2.getModifiers() | 16));
                field.setAccessible(false);
                throw th;
            }
            sb.append("Failed to reset field to private final ");
            sb.append(str);
            gVar.mo3338a(sb.toString(), (Throwable) e);
        } catch (Exception e4) {
            e = e4;
            field = null;
            f4028a.mo3338a("Failed to set field " + str, (Throwable) e);
            if (field2 != null && field != null) {
                try {
                    field.set(field2, Integer.valueOf(field2.getModifiers() | 16));
                    field.setAccessible(false);
                } catch (Exception e5) {
                    e = e5;
                    gVar = f4028a;
                    sb = new StringBuilder();
                }
            }
        } catch (Throwable th3) {
            th = th3;
            field = null;
            field.set(field2, Integer.valueOf(field2.getModifiers() | 16));
            field.setAccessible(false);
            throw th;
        }
    }
}
