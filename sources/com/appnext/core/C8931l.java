package com.appnext.core;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appnext.core.l */
public final class C8931l {

    /* renamed from: hv */
    private static int f22651hv = 2;

    /* renamed from: d */
    public static void m26977d(int i) {
        if (i >= 0 && i <= 2) {
            f22651hv = i;
        }
    }

    /* renamed from: bk */
    public static int m26974bk() {
        return f22651hv;
    }

    /* renamed from: a */
    public static Object m26972a(Class<?> cls, JSONObject jSONObject) {
        Field[] fieldArr;
        Object obj = null;
        try {
            obj = cls.newInstance();
            if (f22651hv == 0) {
                fieldArr = cls.getFields();
            } else {
                fieldArr = cls.getDeclaredFields();
            }
            for (Field field : fieldArr) {
                if (f22651hv == 2 && Modifier.isPrivate(field.getModifiers())) {
                    field.setAccessible(true);
                }
                try {
                    if (jSONObject.has(field.getName())) {
                        String simpleName = field.getType().getSimpleName();
                        if (simpleName.equalsIgnoreCase("boolean")) {
                            field.setBoolean(obj, jSONObject.getBoolean(field.getName()));
                        } else if (simpleName.equalsIgnoreCase("int")) {
                            field.setInt(obj, jSONObject.getInt(field.getName()));
                        } else if (simpleName.equalsIgnoreCase("double")) {
                            field.setDouble(obj, jSONObject.getDouble(field.getName()));
                        } else if (simpleName.equalsIgnoreCase("float")) {
                            field.setFloat(obj, (float) jSONObject.getDouble(field.getName()));
                        } else if (simpleName.equalsIgnoreCase("string")) {
                            field.set(obj, jSONObject.getString(field.getName()));
                        } else if (field.getType().isArray()) {
                            field.set(obj, Array.newInstance(field.getType().getComponentType(), jSONObject.getJSONArray(field.getName()).length()));
                            m26973a(field.get(obj), jSONObject.getJSONArray(field.getName()));
                        } else {
                            field.set(obj, m26972a(field.getType(), jSONObject.getJSONObject(field.getName())));
                        }
                    }
                } catch (IllegalAccessException | IllegalArgumentException unused) {
                }
                if (f22651hv == 2 && Modifier.isPrivate(field.getModifiers())) {
                    field.setAccessible(false);
                }
            }
        } catch (IllegalAccessException | InstantiationException unused2) {
        }
        return obj;
    }

    /* renamed from: a */
    public static void m26973a(Object obj, JSONArray jSONArray) throws IllegalArgumentException, NegativeArraySizeException, IllegalAccessException, JSONException {
        Class<?> cls = obj.getClass();
        String simpleName = cls.getComponentType().getSimpleName();
        for (int i = 0; i < jSONArray.length(); i++) {
            if (cls.getComponentType().isArray()) {
                Array.set(obj, i, Array.newInstance(cls.getComponentType().getComponentType(), jSONArray.getJSONArray(i).length()));
                m26973a(Array.get(obj, i), jSONArray.getJSONArray(i));
            } else if (cls.getComponentType().isPrimitive() || simpleName.equalsIgnoreCase("string")) {
                Array.set(obj, i, jSONArray.get(i));
            } else {
                Array.set(obj, i, m26972a(cls.getComponentType(), jSONArray.getJSONObject(i)));
            }
        }
    }

    /* renamed from: c */
    public static JSONObject m26975c(Object obj) {
        Field[] fieldArr;
        JSONObject jSONObject = new JSONObject();
        Class<?> cls = obj.getClass();
        if (f22651hv == 0) {
            fieldArr = cls.getFields();
        } else {
            fieldArr = cls.getDeclaredFields();
        }
        for (Field field : fieldArr) {
            if (f22651hv == 2 && Modifier.isPrivate(field.getModifiers())) {
                field.setAccessible(true);
            }
            try {
                String name = field.getName();
                String simpleName = field.getType().getSimpleName();
                if (field.get(obj) != null) {
                    if (simpleName.equalsIgnoreCase("boolean")) {
                        jSONObject.put(name, field.getBoolean(obj));
                    } else if (simpleName.equalsIgnoreCase("int")) {
                        jSONObject.put(name, field.getInt(obj));
                    } else if (simpleName.equalsIgnoreCase("double")) {
                        jSONObject.put(name, field.getDouble(obj));
                    } else if (simpleName.equalsIgnoreCase("float")) {
                        jSONObject.put(name, (double) field.getFloat(obj));
                    } else if (simpleName.equalsIgnoreCase("long")) {
                        jSONObject.put(name, field.getLong(obj));
                    } else if (simpleName.equalsIgnoreCase("string")) {
                        jSONObject.put(name, (String) field.get(obj));
                    } else if (simpleName.endsWith("]")) {
                        jSONObject.put(name, m26976d(field.get(obj)));
                    } else {
                        jSONObject.put(name, m26975c(field.get(obj)));
                    }
                }
            } catch (IllegalAccessException | IllegalArgumentException unused) {
            }
            if (f22651hv == 2 && Modifier.isPrivate(field.getModifiers())) {
                field.setAccessible(false);
            }
        }
        return jSONObject;
    }

    /* renamed from: d */
    public static JSONArray m26976d(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, JSONException {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < Array.getLength(obj); i++) {
            if (Array.get(obj, i).getClass().isArray()) {
                jSONArray.put(i, m26976d(Array.get(obj, i)));
            } else {
                jSONArray.put(i, Array.get(obj, i));
            }
        }
        return jSONArray;
    }
}
