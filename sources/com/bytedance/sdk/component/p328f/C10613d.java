package com.bytedance.sdk.component.p328f;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.p328f.p329a.C10610a;
import com.bytedance.sdk.component.utils.C10638l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.sdk.component.f.d */
/* compiled from: PoolTaskStatistics */
public class C10613d {

    /* renamed from: a */
    public static final String[] f26482a = {"com.bytedance.sdk", "com.bykv.vk", "com.ss", "tt_pangle"};

    /* renamed from: b */
    public static final String[] f26483b = {"tt_pangle", "bd_tracker"};

    /* renamed from: c */
    private static AtomicInteger f26484c = new AtomicInteger(0);

    /* renamed from: d */
    private static int f26485d = 0;

    /* renamed from: e */
    private static int f26486e = 0;

    /* renamed from: a */
    public static void m31152a() {
        String str;
        C10612c g = C10615e.m31172g();
        if (g != null) {
            int i = 1;
            int addAndGet = f26484c.addAndGet(1);
            if (C10615e.f26493c >= 0 && addAndGet % C10615e.f26493c == 0 && Looper.getMainLooper() != Looper.myLooper()) {
                Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
                HashMap hashMap = new HashMap();
                if (allStackTraces != null) {
                    boolean a = C10638l.m31232a();
                    int size = allStackTraces.size();
                    if (size > f26486e) {
                        f26486e = size;
                    }
                    Iterator<Map.Entry<Thread, StackTraceElement[]>> it = allStackTraces.entrySet().iterator();
                    int i2 = 0;
                    int i3 = 0;
                    while (it.hasNext()) {
                        Map.Entry next = it.next();
                        i3 += i;
                        Thread thread = (Thread) next.getKey();
                        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) next.getValue();
                        StringBuilder sb = new StringBuilder("\n");
                        if (a) {
                            sb.append("Thread Name is : " + thread.getName());
                            sb.append("\n");
                        }
                        String str2 = null;
                        int length = stackTraceElementArr.length;
                        int i4 = 0;
                        while (i4 < length) {
                            String stackTraceElement = stackTraceElementArr[i4].toString();
                            Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = it;
                            if (a) {
                                sb.append(stackTraceElement + "\n");
                            }
                            if (TextUtils.isEmpty(str2)) {
                                if (!m31153a(stackTraceElement, f26482a)) {
                                    str = stackTraceElement;
                                    if (!m31153a(thread.getName(), f26483b)) {
                                    }
                                } else {
                                    str = stackTraceElement;
                                }
                                i2++;
                                str2 = str;
                            }
                            i4++;
                            it = it2;
                        }
                        Iterator<Map.Entry<Thread, StackTraceElement[]>> it3 = it;
                        if (a) {
                            if (!TextUtils.isEmpty(str2)) {
                                String str3 = str2 + "&" + thread.getName();
                                C10614a aVar = (C10614a) hashMap.get(str3);
                                if (aVar != null) {
                                    aVar.mo64247a(aVar.mo64246a() + 1);
                                } else {
                                    aVar = new C10614a(str3, 1, sb.toString(), thread.getName());
                                }
                                hashMap.put(str3, aVar);
                            }
                            if (!TextUtils.isEmpty(sb.toString())) {
                                Log.e("PoolTaskStatistics", "Thread index = " + i3 + "   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                                Log.w("PoolTaskStatistics", sb.toString());
                            }
                        }
                        it = it3;
                        i = 1;
                    }
                    if (i2 > f26485d) {
                        f26485d = i2;
                    }
                    if (a) {
                        Log.e("PoolTaskStatistics", "SDK current threads=" + i2 + ", SDK Max threads=" + f26485d + ", Application threads = " + size + ", Application max threads = " + f26486e);
                        for (Map.Entry value : hashMap.entrySet()) {
                            Log.i("PoolTaskStatistics", ((C10614a) value.getValue()).toString());
                        }
                    }
                    g.mo2619a(new C10610a(i2, f26485d, size, f26486e));
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m31153a(String str, String[] strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null) {
            for (String contains : strArr) {
                if (str.contains(contains)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: com.bytedance.sdk.component.f.d$a */
    /* compiled from: PoolTaskStatistics */
    public static class C10614a {

        /* renamed from: a */
        public int f26487a = 0;

        /* renamed from: b */
        public String f26488b = null;

        /* renamed from: c */
        public String f26489c = null;

        /* renamed from: d */
        public String f26490d = null;

        public C10614a(String str, int i, String str2, String str3) {
            this.f26489c = str;
            this.f26487a = i;
            this.f26490d = str2;
            this.f26488b = str3;
        }

        /* renamed from: a */
        public void mo64247a(int i) {
            this.f26487a = i;
        }

        /* renamed from: a */
        public int mo64246a() {
            return this.f26487a;
        }

        public String toString() {
            return "ThreadModel{times=" + this.f26487a + ", name='" + this.f26488b + '\'' + ", lastStackStack='" + this.f26489c + '\'' + '}';
        }
    }
}
