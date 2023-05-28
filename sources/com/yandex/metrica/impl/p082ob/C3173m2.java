package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.coreutils.p080io.FileUtils;
import com.yandex.metrica.impl.p082ob.C1937D1;
import com.yandex.metrica.impl.p082ob.C2600Ud;
import com.yandex.metrica.impl.p082ob.C2947fa;
import com.yandex.metrica.impl.p082ob.C3356pi;
import com.yandex.metrica.impl.p082ob.C3416qi;
import com.yandex.metrica.impl.p082ob.C3460s;
import com.yandex.metrica.impl.p082ob.C3566v3;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.m2 */
public class C3173m2 extends C1937D1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2917e9 f8265a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f8266b;

    /* renamed from: c */
    private final C2796a8 f8267c;

    /* renamed from: com.yandex.metrica.impl.ob.m2$a */
    class C3174a extends SparseArray<C1937D1.C1938a> {
        C3174a() {
            put(29, new C3183j(C3173m2.this.f8266b));
            put(39, new C3184k());
            put(47, new C3185l(C3173m2.this.f8265a));
            put(60, new C3186m(C3173m2.this.f8265a));
            put(62, new C3187n());
            put(66, new C3188o());
            put(67, new C3180g(C2947fa.C2949b.m9536a(C3416qi.class).mo17593b(C3173m2.this.f8266b), new C2946f9(C3093ja.m9805a(C3173m2.this.f8266b).mo17752q(), C3173m2.this.f8266b.getPackageName())));
            put(68, new C3198u());
            put(72, new C3179f(C2947fa.C2949b.m9537b(C1892Bd.class).mo17593b(C3173m2.this.f8266b), C2947fa.C2949b.m9536a(C3416qi.class).mo17593b(C3173m2.this.f8266b)));
            put(82, new C3181h(C2947fa.C2949b.m9537b(C1892Bd.class).mo17593b(C3173m2.this.f8266b), C2947fa.C2949b.m9536a(C3507td.class).mo17593b(C3173m2.this.f8266b)));
            put(87, new C3182i(C2947fa.C2949b.m9536a(C3416qi.class).mo17593b(C3173m2.this.f8266b)));
            put(92, new C3176c(C2947fa.C2949b.m9536a(C3416qi.class).mo17593b(C3173m2.this.f8266b)));
            put(93, new C3178e(C3173m2.this.f8266b, C2947fa.C2949b.m9536a(C2923ee.class).mo17593b(C3173m2.this.f8266b), C2947fa.C2949b.m9536a(C2600Ud.class).mo17593b(C3173m2.this.f8266b)));
            put(94, new C3193p(C3173m2.this.f8266b, C2947fa.C2949b.m9536a(C3416qi.class).mo17593b(C3173m2.this.f8266b)));
            put(98, new C3197t(C3173m2.this.f8265a));
            put(100, new C3175b(new C2946f9(C3093ja.m9805a(C3173m2.this.f8266b).mo17752q(), C3173m2.this.f8266b.getPackageName())));
            put(101, new C3194q(C3173m2.this.f8265a, C2947fa.C2949b.m9536a(C3416qi.class).mo17593b(C3173m2.this.f8266b)));
            put(102, new C3195r(C2947fa.C2949b.m9536a(C2600Ud.class).mo17593b(C3173m2.this.f8266b)));
            put(103, new C3177d(C2947fa.C2949b.m9536a(C2755Z1.class).mo17593b(C3173m2.this.f8266b), C2947fa.C2949b.m9536a(C3566v3.class).mo17593b(C3173m2.this.f8266b), C3173m2.this.f8265a));
            put(104, new C3196s(C3093ja.m9805a(C3173m2.this.f8266b).mo17750o()));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$b */
    static class C3175b implements C1937D1.C1938a {

        /* renamed from: a */
        private final C2946f9 f8269a;

        public C3175b(C2946f9 f9Var) {
            this.f8269a = f9Var;
        }

        /* renamed from: a */
        public void mo15602a(Context context) {
            this.f8269a.mo17581f();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$c */
    static class C3176c implements C1937D1.C1938a {

        /* renamed from: a */
        private final ProtobufStateStorage<C3416qi> f8270a;

        C3176c(ProtobufStateStorage<C3416qi> protobufStateStorage) {
            this.f8270a = protobufStateStorage;
        }

        /* renamed from: a */
        public void mo15602a(Context context) {
            C3416qi qiVar = (C3416qi) this.f8270a.read();
            this.f8270a.save(qiVar.mo18089a(qiVar.f8896r).mo18130g(qiVar.f8894p).mo18112a());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$d */
    static class C3177d implements C1937D1.C1938a {

        /* renamed from: a */
        private final ProtobufStateStorage<C2755Z1> f8271a;

        /* renamed from: b */
        private final ProtobufStateStorage<C3566v3> f8272b;

        /* renamed from: c */
        private final C2917e9 f8273c;

        public C3177d(ProtobufStateStorage<C2755Z1> protobufStateStorage, ProtobufStateStorage<C3566v3> protobufStateStorage2, C2917e9 e9Var) {
            this.f8271a = protobufStateStorage;
            this.f8272b = protobufStateStorage2;
            this.f8273c = e9Var;
        }

        /* renamed from: a */
        public void mo15602a(Context context) {
            C2755Z1 z1 = (C2755Z1) this.f8271a.read();
            this.f8271a.delete();
            if (z1.f7249b) {
                if (!C1848A2.m6815b((Map) z1.f7248a)) {
                    C3566v3.C3567a aVar = new C3566v3.C3567a(z1.f7248a, C3522u0.SATELLITE);
                    this.f8272b.save(new C3566v3(aVar, Collections.singletonList(aVar)));
                }
                this.f8273c.mo17525h();
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$e */
    static class C3178e implements C1937D1.C1938a {

        /* renamed from: a */
        private final C2803ae f8274a;

        /* renamed from: b */
        private final ProtobufStateStorage<C2923ee> f8275b;

        /* renamed from: c */
        private final ProtobufStateStorage<C2600Ud> f8276c;

        C3178e(Context context, ProtobufStateStorage<C2923ee> protobufStateStorage, ProtobufStateStorage<C2600Ud> protobufStateStorage2) {
            this(protobufStateStorage, protobufStateStorage2, new C2803ae(context));
        }

        /* renamed from: a */
        public void mo15602a(Context context) {
            C2923ee a;
            C2923ee eeVar = (C2923ee) this.f8275b.read();
            ArrayList arrayList = new ArrayList();
            C3522u0 u0Var = eeVar.f7755e;
            if (u0Var != C3522u0.UNDEFINED) {
                arrayList.add(new C2600Ud.C2601a(eeVar.f7751a, eeVar.f7752b, u0Var));
            }
            if (eeVar.f7755e == C3522u0.RETAIL && (a = this.f8274a.invoke()) != null) {
                arrayList.add(new C2600Ud.C2601a(a.f7751a, a.f7752b, a.f7755e));
            }
            this.f8276c.save(new C2600Ud(eeVar, arrayList));
            this.f8275b.delete();
        }

        C3178e(ProtobufStateStorage<C2923ee> protobufStateStorage, ProtobufStateStorage<C2600Ud> protobufStateStorage2, C2803ae aeVar) {
            this.f8275b = protobufStateStorage;
            this.f8276c = protobufStateStorage2;
            this.f8274a = aeVar;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$f */
    static class C3179f implements C1937D1.C1938a {

        /* renamed from: a */
        private final ProtobufStateStorage<Collection<C1892Bd>> f8277a;

        /* renamed from: b */
        private final ProtobufStateStorage<C3416qi> f8278b;

        /* renamed from: c */
        private final C1877B0 f8279c;

        public C3179f(ProtobufStateStorage<Collection<C1892Bd>> protobufStateStorage, ProtobufStateStorage<C3416qi> protobufStateStorage2) {
            this(protobufStateStorage, protobufStateStorage2, new C1877B0());
        }

        /* renamed from: a */
        public void mo15602a(Context context) {
            JSONObject jSONObject;
            String str;
            C2655V7 h = C3093ja.m9805a(context).mo17746h();
            List<C1892Bd> b = h.mo16968b();
            if (b != null) {
                this.f8277a.save(b);
                h.mo16967a();
            }
            C3416qi qiVar = (C3416qi) this.f8278b.read();
            C3416qi.C3418b a = qiVar.mo18089a(qiVar.f8896r);
            String str2 = null;
            try {
                jSONObject = new JSONObject(C2254L0.m7686a(this.f8279c.mo15522b(context.getFilesDir(), "credentials.dat")));
            } catch (Throwable unused) {
                jSONObject = null;
            }
            if (jSONObject == null && FileUtils.needToUseNoBackup()) {
                try {
                    jSONObject = new JSONObject(C2254L0.m7686a(this.f8279c.mo15522b(context.getNoBackupFilesDir(), "credentials.dat")));
                } catch (Throwable unused2) {
                }
            }
            if (jSONObject != null) {
                str2 = jSONObject.optString("device_id", (String) null);
                str = jSONObject.optString("device_id_hash", (String) null);
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                a.mo18121c(str2);
            }
            if (!TextUtils.isEmpty(str)) {
                a.mo18124d(str);
            }
            a.mo18118b(true);
            this.f8278b.save(a.mo18112a());
            context.getSharedPreferences("com.yandex.metrica.configuration", 0).edit().clear().apply();
        }

        C3179f(ProtobufStateStorage<Collection<C1892Bd>> protobufStateStorage, ProtobufStateStorage<C3416qi> protobufStateStorage2, C1877B0 b0) {
            this.f8277a = protobufStateStorage;
            this.f8278b = protobufStateStorage2;
            this.f8279c = b0;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$g */
    static class C3180g implements C1937D1.C1938a {

        /* renamed from: a */
        private ProtobufStateStorage f8280a;

        /* renamed from: b */
        private C2946f9 f8281b;

        public C3180g(ProtobufStateStorage protobufStateStorage, C2946f9 f9Var) {
            this.f8280a = protobufStateStorage;
            this.f8281b = f9Var;
        }

        /* renamed from: a */
        public void mo15602a(Context context) {
            this.f8280a.save(this.f8281b.mo17582g());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$h */
    static class C3181h implements C1937D1.C1938a {

        /* renamed from: a */
        private final ProtobufStateStorage<Collection<C1892Bd>> f8282a;

        /* renamed from: b */
        private final ProtobufStateStorage<C3507td> f8283b;

        C3181h(ProtobufStateStorage<Collection<C1892Bd>> protobufStateStorage, ProtobufStateStorage<C3507td> protobufStateStorage2) {
            this.f8282a = protobufStateStorage;
            this.f8283b = protobufStateStorage2;
        }

        /* renamed from: a */
        public void mo15602a(Context context) {
            this.f8283b.save(new C3507td(new ArrayList((Collection) this.f8282a.read()), (C3714z) null, new ArrayList()));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$i */
    static class C3182i implements C1937D1.C1938a {

        /* renamed from: a */
        private final ProtobufStateStorage<C3416qi> f8284a;

        C3182i(ProtobufStateStorage<C3416qi> protobufStateStorage) {
            this.f8284a = protobufStateStorage;
        }

        /* renamed from: a */
        public void mo15602a(Context context) {
            ProtobufStateStorage<C3416qi> protobufStateStorage = this.f8284a;
            C3416qi qiVar = (C3416qi) protobufStateStorage.read();
            protobufStateStorage.save(qiVar.mo18089a(qiVar.f8896r).mo18118b(true).mo18112a());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$j */
    static class C3183j implements C1937D1.C1938a {

        /* renamed from: a */
        private C2429Pd f8285a;

        /* renamed from: b */
        private C2946f9 f8286b;

        C3183j(Context context) {
            this.f8285a = new C2429Pd(context);
            this.f8286b = new C2946f9(C3093ja.m9805a(context).mo17751p(), context.getPackageName());
        }

        /* renamed from: a */
        public void mo15602a(Context context) {
            String b = this.f8285a.mo16459b((String) null);
            if (!TextUtils.isEmpty(b)) {
                this.f8286b.mo17585i(b).mo17448d();
                C2429Pd.m8126b(context);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$k */
    static class C3184k implements C1937D1.C1938a {
        C3184k() {
        }

        /* renamed from: a */
        public void mo15602a(Context context) {
            C2307Md md = new C2307Md(context, context.getPackageName());
            SharedPreferences a = C2814b.m9059a(context, "_boundentrypreferences");
            C2484Rd rd = C2307Md.f6172H;
            String string = a.getString(rd.mo16560b(), (String) null);
            C2484Rd rd2 = C2307Md.f6173I;
            long j = a.getLong(rd2.mo16560b(), -1);
            if (string != null && j != -1) {
                md.mo16282a(new C3460s.C3461a(string, j)).mo16079b();
                a.edit().remove(rd.mo16560b()).remove(rd2.mo16560b()).apply();
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$l */
    static class C3185l implements C1937D1.C1938a {

        /* renamed from: a */
        private final C2917e9 f8287a;

        C3185l(C2917e9 e9Var) {
            this.f8287a = e9Var;
        }

        /* renamed from: a */
        public void mo15602a(Context context) {
            C2917e9 e9Var = this.f8287a;
            C2457Qd qd = new C2457Qd(context, (String) null);
            if (qd.mo16518f()) {
                e9Var.mo17519d(true);
                qd.mo16519g();
            }
            C2917e9 e9Var2 = this.f8287a;
            C2374Od od = new C2374Od(context, context.getPackageName());
            long a = od.mo16394a(0);
            if (a != 0) {
                e9Var2.mo17533l(a);
            }
            od.mo16395f();
            new C2307Md(context, new C2677W3(context.getPackageName(), (String) null).mo15879b()).mo16296i().mo16079b();
            this.f8287a.mo17448d();
            C2092Hd hd = new C2092Hd(context);
            hd.mo15862a();
            hd.mo15863b();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$m */
    static class C3186m implements C1937D1.C1938a {

        /* renamed from: a */
        private final C2917e9 f8288a;

        C3186m(C2917e9 e9Var) {
            this.f8288a = e9Var;
        }

        /* renamed from: a */
        public void mo15602a(Context context) {
            long j = new C2946f9(C3093ja.m9805a(context).mo17752q(), context.getPackageName()).mo17582g().f8899u;
            boolean z = true;
            boolean z2 = j > 0;
            if (this.f8288a.mo17509b(-1) <= 0) {
                z = false;
            }
            if (z2 || z) {
                this.f8288a.mo17517c(false).mo17448d();
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$n */
    static class C3187n implements C1937D1.C1938a {
        C3187n() {
        }

        /* renamed from: a */
        public void mo15602a(Context context) {
            C2946f9 f9Var = new C2946f9(C3093ja.m9805a(context).mo17752q(), context.getPackageName());
            String h = f9Var.mo17584h((String) null);
            if (h != null) {
                f9Var.mo17580b((List<String>) Collections.singletonList(h));
            }
            String g = f9Var.mo17583g((String) null);
            if (g != null) {
                f9Var.mo17577a((List<String>) Collections.singletonList(g));
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$o */
    static class C3188o implements C1937D1.C1938a {

        /* renamed from: a */
        private final C1877B0 f8289a;

        /* renamed from: com.yandex.metrica.impl.ob.m2$o$a */
        static class C3189a implements FilenameFilter {

            /* renamed from: a */
            final Iterable<FilenameFilter> f8290a;

            C3189a(Iterable<FilenameFilter> iterable) {
                this.f8290a = iterable;
            }

            public boolean accept(File file, String str) {
                for (FilenameFilter accept : this.f8290a) {
                    if (accept.accept(file, str)) {
                        return true;
                    }
                }
                return false;
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.m2$o$b */
        static class C3190b implements FilenameFilter {

            /* renamed from: a */
            private final FilenameFilter f8291a;

            C3190b(FilenameFilter filenameFilter) {
                this.f8291a = filenameFilter;
            }

            public boolean accept(File file, String str) {
                if (!str.startsWith("db_metrica_")) {
                    return false;
                }
                try {
                    FilenameFilter filenameFilter = this.f8291a;
                    if (str.endsWith("-journal")) {
                        str = str.replace("-journal", "");
                    }
                    return filenameFilter.accept(file, str);
                } catch (Throwable unused) {
                    return false;
                }
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.m2$o$c */
        static class C3191c implements FilenameFilter {
            C3191c() {
            }

            public boolean accept(File file, String str) {
                return str.endsWith("null");
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.m2$o$d */
        static class C3192d implements FilenameFilter {

            /* renamed from: a */
            private final String f8292a;

            C3192d(String str) {
                this.f8292a = str;
            }

            public boolean accept(File file, String str) {
                return !str.contains(this.f8292a);
            }
        }

        C3188o() {
            this(new C1877B0());
        }

        /* renamed from: a */
        public void mo15602a(Context context) {
            File[] fileArr;
            if (mo17831b(context) == null) {
                fileArr = new File[0];
            } else {
                fileArr = mo17831b(context).listFiles(new C3189a(Arrays.asList(new FilenameFilter[]{new C3190b(new C3192d(context.getPackageName())), new C3190b(new C3191c())})));
            }
            for (File file : fileArr) {
                try {
                    if (!file.delete()) {
                        ((C3264nh) C3322oh.m10248a()).reportEvent("Can not delete file", new JSONObject().put("fileName", file.getName()).toString());
                    }
                } catch (Throwable th) {
                    ((C3264nh) C3322oh.m10248a()).reportError("Can not delete file", th);
                }
            }
            new C2946f9(C3093ja.m9805a(context).mo17752q(), context.getPackageName()).mo17451f(new C2484Rd("LAST_STARTUP_CLIDS_SAVE_TIME", (String) null).mo16558a()).mo17448d();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public File mo17831b(Context context) {
            if (C1848A2.m6808a(21)) {
                return context.getNoBackupFilesDir();
            }
            File filesDir = context.getFilesDir();
            if (filesDir != null) {
                return this.f8289a.mo15522b(filesDir.getParentFile(), "databases");
            }
            return null;
        }

        C3188o(C1877B0 b0) {
            this.f8289a = b0;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$r */
    static class C3195r implements C1937D1.C1938a {

        /* renamed from: a */
        private final ProtobufStateStorage<C2600Ud> f8303a;

        public C3195r(ProtobufStateStorage<C2600Ud> protobufStateStorage) {
            this.f8303a = protobufStateStorage;
        }

        /* renamed from: a */
        public void mo15602a(Context context) {
            C2600Ud ud = (C2600Ud) this.f8303a.read();
            ArrayList arrayList = new ArrayList();
            C2600Ud.C2601a aVar = null;
            for (C2600Ud.C2601a next : ud.f6882b) {
                if (next.f6885c != C3522u0.APP) {
                    arrayList.add(next);
                } else if (aVar == null) {
                    arrayList.add(next);
                    aVar = next;
                }
            }
            this.f8303a.save(new C2600Ud(ud.f6881a, arrayList));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$s */
    static class C3196s implements C1937D1.C1938a {

        /* renamed from: a */
        private final C2476R7 f8304a;

        public C3196s(C2476R7 r7) {
            this.f8304a = r7;
        }

        /* renamed from: a */
        public void mo15602a(Context context) {
            this.f8304a.mo16554b("notification_cache_state");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$t */
    static class C3197t implements C1937D1.C1938a {

        /* renamed from: a */
        private final C2917e9 f8305a;

        public C3197t(C2917e9 e9Var) {
            this.f8305a = e9Var;
        }

        /* renamed from: a */
        public void mo15602a(Context context) {
            this.f8305a.mo17451f(new C2484Rd("REFERRER", (String) null).mo16558a()).mo17451f(new C2484Rd("REFERRER_HOLDER_STATE", (String) null).mo16558a()).mo17448d();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$u */
    static class C3198u implements C1937D1.C1938a {
        C3198u() {
        }

        /* renamed from: a */
        public void mo15602a(Context context) {
            ProtobufStateStorage<C3416qi> b = C2947fa.C2949b.m9536a(C3416qi.class).mo17593b(context);
            C3416qi qiVar = (C3416qi) b.read();
            b.save(qiVar.mo18089a(qiVar.f8896r).mo18111a(qiVar.f8899u > 0).mo18118b(true).mo18112a());
        }
    }

    C3173m2(Context context, C2917e9 e9Var, C2796a8 a8Var) {
        this.f8266b = context;
        this.f8265a = e9Var;
        this.f8267c = a8Var;
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$q */
    static class C3194q implements C1937D1.C1938a {

        /* renamed from: a */
        private final C2917e9 f8295a;

        /* renamed from: b */
        private final ProtobufStateStorage<C3416qi> f8296b;

        /* renamed from: c */
        private final C2796a8 f8297c;

        /* renamed from: d */
        private final String f8298d;

        /* renamed from: e */
        private final String f8299e;

        /* renamed from: f */
        private final String f8300f;

        /* renamed from: g */
        private final String f8301g;

        /* renamed from: h */
        private final String f8302h;

        public C3194q(C2917e9 e9Var, ProtobufStateStorage<C3416qi> protobufStateStorage) {
            this(e9Var, protobufStateStorage, C2007F0.m7154g().mo15760w().mo17501b());
        }

        /* renamed from: a */
        public void mo15602a(Context context) {
            Integer num;
            C3416qi qiVar = (C3416qi) this.f8296b.read();
            C2339Nd nd = new C2339Nd(context);
            int f = nd.mo16357f();
            if (f == -1) {
                f = this.f8295a.mo17502a(-1);
            }
            C2796a8 a8Var = this.f8297c;
            String str = qiVar.f8880b;
            String str2 = qiVar.f8881c;
            String a = this.f8295a.mo17438a(this.f8298d, (String) null);
            Boolean valueOf = this.f8295a.mo17446c(this.f8299e) ? Boolean.valueOf(this.f8295a.mo17440a(this.f8299e, false)) : null;
            Long valueOf2 = this.f8295a.mo17446c(this.f8300f) ? Long.valueOf(this.f8295a.mo17437a(this.f8300f, -1)) : null;
            Long valueOf3 = this.f8295a.mo17446c(this.f8301g) ? Long.valueOf(this.f8295a.mo17437a(this.f8301g, -1)) : null;
            Long valueOf4 = this.f8295a.mo17446c(this.f8302h) ? Long.valueOf(this.f8295a.mo17437a(this.f8302h, -1)) : null;
            if (f == -1) {
                num = null;
            } else {
                num = Integer.valueOf(f);
            }
            a8Var.mo17159a(str, str2, a, valueOf, valueOf2, valueOf3, valueOf4, num);
            this.f8295a.mo17529j().mo17451f(this.f8298d).mo17451f(this.f8299e).mo17451f(this.f8300f).mo17451f(this.f8301g).mo17451f(this.f8302h).mo17448d();
            nd.mo16359h().mo16079b();
        }

        C3194q(C2917e9 e9Var, ProtobufStateStorage<C3416qi> protobufStateStorage, C2796a8 a8Var) {
            this.f8298d = new C2484Rd("REFERRER_FROM_PLAY_SERVICES").mo16558a();
            this.f8299e = new C2484Rd("REFERRER_CHECKED").mo16558a();
            this.f8300f = new C2484Rd("L_ID").mo16558a();
            this.f8301g = new C2484Rd("LBS_ID").mo16558a();
            this.f8302h = new C2484Rd("L_REQ_NUM").mo16558a();
            this.f8295a = e9Var;
            this.f8296b = protobufStateStorage;
            this.f8297c = a8Var;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public SparseArray<C1937D1.C1938a> mo15599a() {
        return new C3174a();
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$p */
    static class C3193p implements C1937D1.C1938a {

        /* renamed from: a */
        private final ProtobufStateStorage<C3416qi> f8293a;

        /* renamed from: b */
        private final C2901dj f8294b;

        public C3193p(Context context, ProtobufStateStorage<C3416qi> protobufStateStorage) {
            this(protobufStateStorage, C2930ej.m9486a(context).mo17558b(context, new C3065ij(new C3356pi.C3358b(context))));
        }

        /* renamed from: a */
        public void mo15602a(Context context) {
            String str = this.f8294b.mo17469a().f7065a;
            if (!TextUtils.isEmpty(str)) {
                C3416qi qiVar = (C3416qi) this.f8293a.read();
                if (!str.equals(qiVar.f8879a)) {
                    this.f8293a.save(qiVar.mo18089a(qiVar.f8896r).mo18138k(str).mo18112a());
                }
            }
        }

        public C3193p(ProtobufStateStorage<C3416qi> protobufStateStorage, C2901dj djVar) {
            this.f8293a = protobufStateStorage;
            this.f8294b = djVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo15598a(C2339Nd nd) {
        int f = nd.mo16357f();
        if (f == -1) {
            f = this.f8265a.mo17502a(-1);
        }
        return f == -1 ? this.f8267c.mo17164c() : f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15601a(C2339Nd nd, int i) {
        this.f8267c.mo17155a(i);
    }
}
