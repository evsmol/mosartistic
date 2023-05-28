package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.coreutils.services.ActivationBarrier;
import com.yandex.metrica.impl.p082ob.C2076H1;
import com.yandex.metrica.impl.p082ob.C2841bi;
import com.yandex.metrica.network.NetworkClient;
import com.yandex.metrica.network.Request;
import com.yandex.metrica.network.Response;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.yandex.metrica.impl.ob.Jf */
public class C2188Jf {

    /* renamed from: i */
    private static final Map<C2841bi.C2842a, C2076H1.C2080d> f5852i = Collections.unmodifiableMap(new C2189a());
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f5853a;

    /* renamed from: b */
    private final ProtobufStateStorage<C2193e> f5854b;

    /* renamed from: c */
    private final ICommonExecutor f5855c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C3130kh f5856d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C3464s2 f5857e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C2499Rl f5858f;

    /* renamed from: g */
    private C2193e f5859g;

    /* renamed from: h */
    private boolean f5860h = false;

    /* renamed from: com.yandex.metrica.impl.ob.Jf$a */
    class C2189a extends HashMap<C2841bi.C2842a, C2076H1.C2080d> {
        C2189a() {
            put(C2841bi.C2842a.CELL, C2076H1.C2080d.CELL);
            put(C2841bi.C2842a.WIFI, C2076H1.C2080d.WIFI);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Jf$b */
    class C2190b implements Runnable {
        C2190b() {
        }

        public void run() {
            C2188Jf.m7525a(C2188Jf.this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Jf$c */
    class C2191c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ List f5862a;

        /* renamed from: b */
        final /* synthetic */ C3356pi f5863b;

        C2191c(List list, C3356pi piVar) {
            this.f5862a = list;
            this.f5863b = piVar;
        }

        public void run() {
            C2188Jf.m7527a(C2188Jf.this, this.f5862a, this.f5863b.mo17949C());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Jf$d */
    class C2192d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2193e.C2194a f5865a;

        C2192d(C2193e.C2194a aVar) {
            this.f5865a = aVar;
        }

        public void run() {
            if (!C2188Jf.this.f5857e.mo18199e()) {
                C2188Jf.this.f5856d.mo17785b(this.f5865a);
                C2193e.C2195b bVar = new C2193e.C2195b(this.f5865a);
                C2499Rl e = C2188Jf.this.f5858f;
                Context d = C2188Jf.this.f5853a;
                ((C2321Ml) e).getClass();
                C2076H1.C2080d a = C2076H1.m7289a(d);
                bVar.mo16017a(a);
                if (a == C2076H1.C2080d.OFFLINE) {
                    bVar.mo16018a(C2193e.C2195b.C2196a.OFFLINE);
                } else if (!this.f5865a.f5874f.contains(a)) {
                    bVar.mo16018a(C2193e.C2195b.C2196a.INCOMPATIBLE_NETWORK_TYPE);
                } else {
                    Request.Builder withMethod = new Request.Builder(this.f5865a.f5870b).withMethod(this.f5865a.f5871c);
                    for (Map.Entry entry : this.f5865a.f5872d.mo18182a()) {
                        withMethod.addHeader((String) entry.getKey(), TextUtils.join(",", (Iterable) entry.getValue()));
                    }
                    NetworkClient.Builder builder = new NetworkClient.Builder();
                    C2007F0.m7154g().mo15757t().getClass();
                    NetworkClient.Builder withInstanceFollowRedirects = builder.withSslSocketFactory((SSLSocketFactory) null).withInstanceFollowRedirects(true);
                    int i = C3209md.f8324a;
                    Response execute = withInstanceFollowRedirects.withConnectTimeout(i).withReadTimeout(i).withMaxResponseSize(102400).build().newCall(withMethod.build()).execute();
                    int code = execute.getCode();
                    if (execute.isCompleted()) {
                        bVar.mo16018a(C2193e.C2195b.C2196a.COMPLETE);
                    } else {
                        bVar.mo16018a(C2193e.C2195b.C2196a.ERROR);
                        bVar.mo16020a(execute.getException());
                    }
                    bVar.mo16019a(Integer.valueOf(code));
                    bVar.f5879e = execute.getResponseData();
                    bVar.f5880f = execute.getErrorData();
                    bVar.mo16021a((Map<String, List<String>>) execute.getHeaders());
                }
                C2188Jf.m7526a(C2188Jf.this, bVar);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Jf$e */
    public static class C2193e {

        /* renamed from: a */
        private final List<C2194a> f5867a;

        /* renamed from: b */
        private final LinkedHashMap<String, Object> f5868b = new LinkedHashMap<>();

        /* renamed from: com.yandex.metrica.impl.ob.Jf$e$a */
        public static class C2194a {

            /* renamed from: a */
            public final String f5869a;

            /* renamed from: b */
            public final String f5870b;

            /* renamed from: c */
            public final String f5871c;

            /* renamed from: d */
            public final C3458rm<String, String> f5872d;

            /* renamed from: e */
            public final long f5873e;

            /* renamed from: f */
            public final List<C2076H1.C2080d> f5874f;

            public C2194a(String str, String str2, String str3, C3458rm<String, String> rmVar, long j, List<C2076H1.C2080d> list) {
                this.f5869a = str;
                this.f5870b = str2;
                this.f5871c = str3;
                this.f5873e = j;
                this.f5874f = list;
                this.f5872d = rmVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C2194a.class != obj.getClass()) {
                    return false;
                }
                return this.f5869a.equals(((C2194a) obj).f5869a);
            }

            public int hashCode() {
                return this.f5869a.hashCode();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.Jf$e$b */
        public static class C2195b {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public final C2194a f5875a;

            /* renamed from: b */
            private C2196a f5876b;

            /* renamed from: c */
            private C2076H1.C2080d f5877c;

            /* renamed from: d */
            private Integer f5878d;

            /* renamed from: e */
            byte[] f5879e;

            /* renamed from: f */
            byte[] f5880f;

            /* renamed from: g */
            private Map<String, List<String>> f5881g;

            /* renamed from: h */
            private Throwable f5882h;

            /* renamed from: com.yandex.metrica.impl.ob.Jf$e$b$a */
            public enum C2196a {
                OFFLINE,
                INCOMPATIBLE_NETWORK_TYPE,
                COMPLETE,
                ERROR
            }

            public C2195b(C2194a aVar) {
                this.f5875a = aVar;
            }

            /* renamed from: b */
            public byte[] mo16022b() {
                return this.f5880f;
            }

            /* renamed from: c */
            public Throwable mo16023c() {
                return this.f5882h;
            }

            /* renamed from: d */
            public C2194a mo16024d() {
                return this.f5875a;
            }

            /* renamed from: e */
            public byte[] mo16025e() {
                return this.f5879e;
            }

            /* renamed from: f */
            public Integer mo16026f() {
                return this.f5878d;
            }

            /* renamed from: g */
            public Map<String, List<String>> mo16027g() {
                return this.f5881g;
            }

            /* renamed from: h */
            public C2196a mo16028h() {
                return this.f5876b;
            }

            /* renamed from: a */
            public void mo16018a(C2196a aVar) {
                this.f5876b = aVar;
            }

            /* renamed from: a */
            public C2076H1.C2080d mo16016a() {
                return this.f5877c;
            }

            /* renamed from: a */
            public void mo16017a(C2076H1.C2080d dVar) {
                this.f5877c = dVar;
            }

            /* renamed from: a */
            public void mo16019a(Integer num) {
                this.f5878d = num;
            }

            /* renamed from: a */
            public void mo16021a(Map<String, List<String>> map) {
                this.f5881g = map;
            }

            /* renamed from: a */
            public void mo16020a(Throwable th) {
                this.f5882h = th;
            }
        }

        public C2193e(List<C2194a> list, List<String> list2) {
            this.f5867a = list;
            if (!C1848A2.m6814b((Collection) list2)) {
                for (String put : list2) {
                    this.f5868b.put(put, new Object());
                }
            }
        }

        /* renamed from: a */
        public boolean mo16011a(C2194a aVar) {
            if (this.f5868b.get(aVar.f5869a) != null || this.f5867a.contains(aVar)) {
                return false;
            }
            this.f5867a.add(aVar);
            return true;
        }

        /* renamed from: b */
        public List<C2194a> mo16012b() {
            return this.f5867a;
        }

        /* renamed from: b */
        public void mo16013b(C2194a aVar) {
            this.f5868b.put(aVar.f5869a, new Object());
            this.f5867a.remove(aVar);
        }

        /* renamed from: a */
        public Set<String> mo16010a() {
            HashSet hashSet = new HashSet();
            int i = 0;
            for (String add : this.f5868b.keySet()) {
                hashSet.add(add);
                i++;
                if (i > 1000) {
                    break;
                }
            }
            return hashSet;
        }
    }

    public C2188Jf(Context context, ProtobufStateStorage<C2193e> protobufStateStorage, C3464s2 s2Var, C3130kh khVar, ICommonExecutor iCommonExecutor, C2499Rl rl) {
        this.f5853a = context;
        this.f5854b = protobufStateStorage;
        this.f5857e = s2Var;
        this.f5856d = khVar;
        this.f5859g = (C2193e) protobufStateStorage.read();
        this.f5855c = iCommonExecutor;
        this.f5858f = rl;
    }

    /* renamed from: a */
    static void m7527a(C2188Jf jf, List list, long j) {
        Long l;
        jf.getClass();
        if (!C1848A2.m6814b((Collection) list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C2841bi biVar = (C2841bi) it.next();
                if (!(biVar.f7489a == null || biVar.f7490b == null || biVar.f7491c == null || (l = biVar.f7493e) == null || l.longValue() < 0 || C1848A2.m6814b((Collection) biVar.f7494f))) {
                    String str = biVar.f7489a;
                    String str2 = biVar.f7490b;
                    String str3 = biVar.f7491c;
                    List<Pair<String, String>> list2 = biVar.f7492d;
                    C3458rm rmVar = new C3458rm(false);
                    for (Pair next : list2) {
                        rmVar.mo18181a(next.first, next.second);
                    }
                    long millis = TimeUnit.SECONDS.toMillis(biVar.f7493e.longValue() + j);
                    List<C2841bi.C2842a> list3 = biVar.f7494f;
                    ArrayList arrayList = new ArrayList(list3.size());
                    for (C2841bi.C2842a aVar : list3) {
                        arrayList.add(f5852i.get(aVar));
                    }
                    jf.m7528a(new C2193e.C2194a(str, str2, str3, rmVar, millis, arrayList));
                }
            }
        }
    }

    /* renamed from: b */
    private void m7530b(C2193e.C2194a aVar) {
        this.f5855c.executeDelayed(new C2192d(aVar), Math.max(ActivationBarrier.ACTIVATION_DELAY, Math.max(aVar.f5873e - System.currentTimeMillis(), 0)));
    }

    /* renamed from: a */
    public synchronized void mo16005a() {
        this.f5855c.execute(new C2190b());
    }

    /* renamed from: a */
    static void m7525a(C2188Jf jf) {
        if (!jf.f5860h) {
            C2193e eVar = (C2193e) jf.f5854b.read();
            jf.f5859g = eVar;
            for (C2193e.C2194a b : eVar.mo16012b()) {
                jf.m7530b(b);
            }
            jf.f5860h = true;
        }
    }

    /* renamed from: a */
    public synchronized void mo16006a(C3356pi piVar) {
        this.f5855c.execute(new C2191c(piVar.mo17955I(), piVar));
    }

    /* renamed from: a */
    private boolean m7528a(C2193e.C2194a aVar) {
        boolean a = this.f5859g.mo16011a(aVar);
        if (a) {
            m7530b(aVar);
            this.f5856d.mo17783a(aVar);
        }
        this.f5854b.save(this.f5859g);
        return a;
    }

    /* renamed from: a */
    static void m7526a(C2188Jf jf, C2193e.C2195b bVar) {
        synchronized (jf) {
            jf.f5859g.mo16013b(bVar.f5875a);
            jf.f5854b.save(jf.f5859g);
            jf.f5856d.mo17784a(bVar);
        }
    }
}
