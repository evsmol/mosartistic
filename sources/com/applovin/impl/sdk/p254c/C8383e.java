package com.applovin.impl.sdk.p254c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.p256e.C8458z;
import com.applovin.impl.sdk.utils.Utils;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.c.e */
public final class C8383e {

    /* renamed from: a */
    private static C8490n f21021a;

    /* renamed from: b */
    private static SharedPreferences f21022b;

    /* renamed from: c */
    private final SharedPreferences f21023c;

    public C8383e(C8490n nVar) {
        this.f21023c = nVar.mo57332P().getSharedPreferences("com.applovin.sdk.preferences." + nVar.mo57319C(), 0);
        if (!nVar.mo57388e()) {
            f21021a = nVar;
        }
    }

    /* renamed from: a */
    private static SharedPreferences m25214a(Context context) {
        if (f21022b == null) {
            f21022b = context.getSharedPreferences("com.applovin.sdk.shared", 0);
        }
        return f21022b;
    }

    /* renamed from: a */
    public static <T> T m25215a(String str, T t, Class cls, SharedPreferences sharedPreferences) {
        T t2;
        long j;
        int i;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (sharedPreferences.contains(str)) {
                if (Boolean.class.equals(cls)) {
                    t2 = Boolean.valueOf(t != null ? sharedPreferences.getBoolean(str, ((Boolean) t).booleanValue()) : sharedPreferences.getBoolean(str, false));
                } else if (Float.class.equals(cls)) {
                    t2 = Float.valueOf(t != null ? sharedPreferences.getFloat(str, ((Float) t).floatValue()) : sharedPreferences.getFloat(str, 0.0f));
                } else if (Integer.class.equals(cls)) {
                    if (t != null) {
                        i = sharedPreferences.getInt(str, t.getClass().equals(Long.class) ? ((Long) t).intValue() : ((Integer) t).intValue());
                    } else {
                        i = sharedPreferences.getInt(str, 0);
                    }
                    t2 = Integer.valueOf(i);
                } else if (Long.class.equals(cls)) {
                    if (t != null) {
                        j = sharedPreferences.getLong(str, t.getClass().equals(Integer.class) ? ((Integer) t).longValue() : ((Long) t).longValue());
                    } else {
                        j = sharedPreferences.getLong(str, 0);
                    }
                    t2 = Long.valueOf(j);
                } else if (Double.class.equals(cls)) {
                    t2 = Double.valueOf(t != null ? Double.longBitsToDouble(sharedPreferences.getLong(str, Double.doubleToRawLongBits(((Double) t).doubleValue()))) : Double.longBitsToDouble(sharedPreferences.getLong(str, 0)));
                } else {
                    t2 = String.class.equals(cls) ? sharedPreferences.getString(str, (String) t) : Set.class.isAssignableFrom(cls) ? sharedPreferences.getStringSet(str, (Set) t) : t;
                }
                if (t2 != null) {
                    return cls.cast(t2);
                }
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return t;
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return t;
        } catch (Throwable th) {
            if (f21021a != null) {
                f21021a.mo57320D();
                if (C8626v.m26252a()) {
                    C8626v D = f21021a.mo57320D();
                    D.mo57819b("SharedPreferencesManager", "Error getting value for key: " + str, th);
                }
            }
            return t;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: a */
    private static void m25216a(final SharedPreferences.Editor editor) {
        try {
            if (f21021a != null && ((Boolean) f21021a.mo57342a(C8380b.f20928eU)).booleanValue()) {
                if (!Utils.isMainThread()) {
                    editor.commit();
                    return;
                } else if (f21021a.mo57337V() != null) {
                    f21021a.mo57337V().mo57228a((C8401a) new C8458z(f21021a, new Runnable() {
                        public void run() {
                            editor.commit();
                        }
                    }), C8432o.C8434a.BACKGROUND);
                    return;
                }
            }
            editor.apply();
        } catch (Throwable th) {
            C8626v.m26254c("SharedPreferencesManager", "Unable to apply changes", th);
        }
    }

    /* renamed from: a */
    public static <T> void m25217a(C8382d<T> dVar, T t, Context context) {
        m25218a(dVar.mo57098a(), t, m25214a(context), (SharedPreferences.Editor) null);
    }

    /* renamed from: a */
    public static <T> void m25218a(String str, T t, SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        long doubleToRawLongBits;
        boolean z = true;
        boolean z2 = editor != null;
        if (!z2) {
            editor = sharedPreferences.edit();
        }
        if (t == null) {
            editor.remove(str);
        } else if (t instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t).booleanValue());
        } else if (t instanceof Float) {
            editor.putFloat(str, ((Float) t).floatValue());
        } else if (t instanceof Integer) {
            editor.putInt(str, ((Integer) t).intValue());
        } else {
            if (t instanceof Long) {
                doubleToRawLongBits = ((Long) t).longValue();
            } else if (t instanceof Double) {
                doubleToRawLongBits = Double.doubleToRawLongBits(((Double) t).doubleValue());
            } else if (t instanceof String) {
                editor.putString(str, (String) t);
            } else if (t instanceof Set) {
                editor.putStringSet(str, (Set) t);
            } else {
                C8626v.m26258i("SharedPreferencesManager", "Unable to put default value of invalid type: " + t);
                z = false;
            }
            editor.putLong(str, doubleToRawLongBits);
        }
        if (z && !z2) {
            m25216a(editor);
        }
    }

    /* renamed from: b */
    public static <T> T m25219b(C8382d<T> dVar, T t, Context context) {
        return m25215a(dVar.mo57098a(), t, (Class) dVar.mo57099b(), m25214a(context));
    }

    /* renamed from: a */
    public void mo57101a(SharedPreferences sharedPreferences) {
        m25216a(sharedPreferences.edit().clear());
    }

    /* renamed from: a */
    public <T> void mo57102a(C8382d<T> dVar) {
        m25216a(this.f21023c.edit().remove(dVar.mo57098a()));
    }

    /* renamed from: a */
    public <T> void mo57103a(C8382d<T> dVar, T t) {
        mo57104a(dVar, t, this.f21023c);
    }

    /* renamed from: a */
    public <T> void mo57104a(C8382d<T> dVar, T t, SharedPreferences sharedPreferences) {
        mo57106a(dVar.mo57098a(), t, sharedPreferences);
    }

    /* renamed from: a */
    public <T> void mo57105a(String str, T t, SharedPreferences.Editor editor) {
        m25218a(str, t, (SharedPreferences) null, editor);
    }

    /* renamed from: a */
    public <T> void mo57106a(String str, T t, SharedPreferences sharedPreferences) {
        m25218a(str, t, sharedPreferences, (SharedPreferences.Editor) null);
    }

    /* renamed from: b */
    public <T> T mo57107b(C8382d<T> dVar, T t) {
        return mo57108b(dVar, t, this.f21023c);
    }

    /* renamed from: b */
    public <T> T mo57108b(C8382d<T> dVar, T t, SharedPreferences sharedPreferences) {
        return m25215a(dVar.mo57098a(), t, (Class) dVar.mo57099b(), sharedPreferences);
    }
}
