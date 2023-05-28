package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.text.TextUtils;
import com.yandex.metrica.networktasks.api.NetworkTask;
import java.io.Closeable;
import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: com.yandex.metrica.impl.ob.A2 */
public final class C1848A2 {

    /* renamed from: a */
    private static final C3241mn f5023a = new C3241mn();

    /* renamed from: com.yandex.metrica.impl.ob.A2$a */
    class C1849a implements NetworkTask.ShouldTryNextHostCondition {
        C1849a() {
        }

        public boolean shouldTryNextHost(int i) {
            return !C1848A2.m6813b(i);
        }
    }

    /* renamed from: a */
    public static String m6796a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        if (packageInfo == null) {
            return "0.0";
        }
        return packageInfo.versionName;
    }

    /* renamed from: a */
    public static boolean m6809a(Object obj) {
        return obj != null;
    }

    /* renamed from: b */
    public static int m6812b(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        if (packageInfo == null) {
            return 0;
        }
        return packageInfo.versionCode;
    }

    /* renamed from: b */
    public static boolean m6813b(int i) {
        return i == 400;
    }

    /* renamed from: c */
    public static <K, V> Map<K, V> m6817c(Map<K, V> map) {
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }

    /* renamed from: d */
    public static <K, V> Map<K, V> m6818d(Map<K, V> map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    /* renamed from: e */
    public static <K, V> Map<K, V> m6819e(Map<K, V> map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    /* renamed from: c */
    public static <T> List<T> m6816c(Collection<T> collection) {
        return Collections.unmodifiableList(new ArrayList(collection));
    }

    /* renamed from: a */
    public static boolean m6808a(int i) {
        return Build.VERSION.SDK_INT >= i;
    }

    /* renamed from: b */
    public static boolean m6815b(Map map) {
        return map == null || map.size() == 0;
    }

    /* renamed from: a */
    public static void m6807a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m6814b(Collection collection) {
        return collection == null || collection.size() == 0;
    }

    /* renamed from: a */
    public static void m6805a(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /* renamed from: a */
    public static boolean m6810a(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public static void m6806a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.endTransaction();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m6811a(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    /* renamed from: a */
    public static String m6797a(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 36) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.replace(8, str.length() - 4, "-xxxx-xxxx-xxxx-xxxxxxxx");
        return sb.toString();
    }

    /* renamed from: a */
    public static Set<Integer> m6804a(int[] iArr) {
        HashSet hashSet = new HashSet();
        for (int valueOf : iArr) {
            hashSet.add(Integer.valueOf(valueOf));
        }
        return hashSet;
    }

    /* renamed from: a */
    public static String m6798a(String str, int i) {
        if (str == null) {
            return null;
        }
        return str.length() > i ? str.substring(0, i) : str;
    }

    /* renamed from: a */
    public static List<String> m6802a(String... strArr) {
        TreeSet treeSet = new TreeSet();
        Collections.addAll(treeSet, strArr);
        return m6816c(treeSet);
    }

    /* renamed from: a */
    public static <T, S> Object m6795a(C3327om omVar, Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return omVar.mo15530a(obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static <T, S> S m6794a(C3327om<T, S> omVar, Context context, String str, String str2, String str3) {
        try {
            return m6795a((C3327om) omVar, context.getSystemService(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static <K, V> List<Map.Entry<K, V>> m6801a(Map<K, V> map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<K, V> simpleEntry : map.entrySet()) {
            arrayList.add(new AbstractMap.SimpleEntry(simpleEntry));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m6803a(List<Map.Entry<K, V>> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            for (Map.Entry next : list) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static <T> List<T> m6800a(Collection<T> collection) {
        if (collection == null) {
            return null;
        }
        return new ArrayList(collection);
    }

    /* renamed from: a */
    public static BigDecimal m6799a(long j) {
        return new BigDecimal(j).divide(new BigDecimal(1000000), 6, 6);
    }

    /* renamed from: a */
    public static double m6792a(double d, double d2) {
        return (Double.isNaN(d) || Double.isInfinite(d)) ? d2 : d;
    }

    /* renamed from: a */
    public static NetworkTask.ShouldTryNextHostCondition m6793a() {
        return new C1849a();
    }
}
