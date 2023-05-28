package com.yandex.metrica.impl.p082ob;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.yandex.metrica.impl.ob.k3 */
public class C3112k3 {

    /* renamed from: a */
    private final C3115c f8179a;

    /* renamed from: b */
    private final C3167lm<Thread, StackTraceElement[], C1979E6> f8180b;

    /* renamed from: c */
    private final C2848bm f8181c;

    /* renamed from: com.yandex.metrica.impl.ob.k3$a */
    class C3113a implements C3115c {
        C3113a() {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.k3$b */
    class C3114b implements Comparator<Thread> {
        C3114b(C3112k3 k3Var) {
        }

        public int compare(Object obj, Object obj2) {
            Thread thread = (Thread) obj;
            Thread thread2 = (Thread) obj2;
            if (thread != thread2) {
                String name = thread.getName();
                String name2 = thread2.getName();
                if (name == null) {
                    return name2 == null ? 0 : -1;
                }
                if (name2 == null) {
                    return 1;
                }
                return name.compareTo(name2);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.k3$c */
    interface C3115c {
    }

    public C3112k3() {
        this(new C3113a(), new C3078j3(), C2410P.m8089g().mo16436j());
    }

    /* renamed from: a */
    public C3607w6 mo17774a() {
        StackTraceElement[] stackTraceElementArr;
        ((C3113a) this.f8179a).getClass();
        Thread thread = Looper.getMainLooper().getThread();
        try {
            stackTraceElementArr = thread.getStackTrace();
        } catch (SecurityException unused) {
            stackTraceElementArr = null;
        }
        return new C3607w6(this.f8180b.mo15813a(thread, stackTraceElementArr), m9878a(thread, (Thread) null), ((C2726Xl) this.f8181c).mo17070b());
    }

    C3112k3(C3115c cVar, C3167lm<Thread, StackTraceElement[], C1979E6> lmVar, C2848bm bmVar) {
        this.f8179a = cVar;
        this.f8180b = lmVar;
        this.f8181c = bmVar;
    }

    /* renamed from: a */
    public List<C1979E6> mo17775a(Thread thread) {
        ((C3113a) this.f8179a).getClass();
        Thread thread2 = Looper.getMainLooper().getThread();
        List<C1979E6> a = m9878a(thread2, thread);
        if (thread != thread2) {
            StackTraceElement[] stackTraceElementArr = null;
            try {
                stackTraceElementArr = thread2.getStackTrace();
            } catch (SecurityException unused) {
            }
            ((ArrayList) a).add(0, this.f8180b.mo15813a(thread2, stackTraceElementArr));
        }
        return a;
    }

    /* renamed from: a */
    private List<C1979E6> m9878a(Thread thread, Thread thread2) {
        Map<Thread, StackTraceElement[]> map;
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new C3114b(this));
        try {
            ((C3113a) this.f8179a).getClass();
            map = Thread.getAllStackTraces();
        } catch (SecurityException unused) {
            map = null;
        }
        if (map != null) {
            treeMap.putAll(map);
        }
        if (thread2 != null) {
            treeMap.remove(thread2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread3 = (Thread) entry.getKey();
            if (!(thread3 == thread || thread3 == thread2)) {
                arrayList.add(this.f8180b.mo15813a(thread3, (StackTraceElement[]) entry.getValue()));
            }
        }
        return arrayList;
    }
}
