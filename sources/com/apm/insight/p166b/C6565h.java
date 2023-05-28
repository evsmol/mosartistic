package com.apm.insight.p166b;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.runtime.C6744g;
import com.apm.insight.runtime.C6770u;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p152ms.p153bd.p154o.Pgl.C5643c;

/* renamed from: com.apm.insight.b.h */
public class C6565h {

    /* renamed from: b */
    public static boolean f14049b = false;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static int f14050t = 2;

    /* renamed from: a */
    C6571c f14051a;

    /* renamed from: c */
    private int f14052c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile int f14053d;

    /* renamed from: e */
    private int f14054e;

    /* renamed from: f */
    private int f14055f;

    /* renamed from: g */
    private C6574f f14056g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C6570b f14057h;

    /* renamed from: i */
    private long f14058i;

    /* renamed from: j */
    private long f14059j;

    /* renamed from: k */
    private int f14060k;

    /* renamed from: l */
    private long f14061l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public String f14062m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f14063n;

    /* renamed from: o */
    private C6562e f14064o;

    /* renamed from: p */
    private volatile boolean f14065p;

    /* renamed from: q */
    private boolean f14066q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C6770u f14067r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public volatile boolean f14068s;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public Runnable f14069u;

    /* renamed from: com.apm.insight.b.h$a */
    private static class C6569a {

        /* renamed from: a */
        long f14078a;

        /* renamed from: b */
        long f14079b;

        /* renamed from: c */
        long f14080c;

        /* renamed from: d */
        boolean f14081d;

        /* renamed from: e */
        int f14082e;

        /* renamed from: f */
        StackTraceElement[] f14083f;

        private C6569a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52005a() {
            this.f14078a = -1;
            this.f14079b = -1;
            this.f14080c = -1;
            this.f14082e = -1;
            this.f14083f = null;
        }
    }

    /* renamed from: com.apm.insight.b.h$b */
    private static class C6570b {

        /* renamed from: a */
        final int f14084a;

        /* renamed from: b */
        C6569a f14085b;

        /* renamed from: c */
        final List<C6569a> f14086c;

        /* renamed from: d */
        private int f14087d = 0;

        public C6570b(int i) {
            this.f14084a = i;
            this.f14086c = new ArrayList(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C6569a mo52006a() {
            C6569a aVar = this.f14085b;
            if (aVar == null) {
                return new C6569a();
            }
            this.f14085b = null;
            return aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52007a(C6569a aVar) {
            int i;
            int size = this.f14086c.size();
            int i2 = this.f14084a;
            if (size < i2) {
                this.f14086c.add(aVar);
                i = this.f14086c.size();
            } else {
                int i3 = this.f14087d % i2;
                this.f14087d = i3;
                C6569a aVar2 = this.f14086c.set(i3, aVar);
                aVar2.mo52005a();
                this.f14085b = aVar2;
                i = this.f14087d + 1;
            }
            this.f14087d = i;
        }
    }

    /* renamed from: com.apm.insight.b.h$c */
    public interface C6571c {
    }

    /* renamed from: com.apm.insight.b.h$d */
    public static class C6572d {

        /* renamed from: a */
        long f14088a;

        /* renamed from: b */
        long f14089b;

        /* renamed from: c */
        long f14090c;

        /* renamed from: d */
        long f14091d;

        /* renamed from: e */
        long f14092e;
    }

    /* renamed from: com.apm.insight.b.h$e */
    public static class C6573e {

        /* renamed from: a */
        public long f14093a;

        /* renamed from: b */
        long f14094b;

        /* renamed from: c */
        long f14095c;

        /* renamed from: d */
        int f14096d;

        /* renamed from: e */
        int f14097e;

        /* renamed from: f */
        long f14098f;

        /* renamed from: g */
        long f14099g;

        /* renamed from: h */
        String f14100h;

        /* renamed from: i */
        public String f14101i;

        /* renamed from: j */
        String f14102j;

        /* renamed from: k */
        C6572d f14103k;

        /* renamed from: a */
        private void m16087a(JSONObject jSONObject) {
            jSONObject.put("block_uuid", this.f14102j);
            jSONObject.put("sblock_uuid", this.f14102j);
            jSONObject.put("belong_frame", this.f14103k != null);
            C6572d dVar = this.f14103k;
            if (dVar != null) {
                jSONObject.put("vsyncDelayTime", this.f14095c - (dVar.f14088a / 1000000));
                jSONObject.put("doFrameTime", (this.f14103k.f14089b / 1000000) - this.f14095c);
                jSONObject.put("inputHandlingTime", (this.f14103k.f14090c / 1000000) - (this.f14103k.f14089b / 1000000));
                jSONObject.put("animationsTime", (this.f14103k.f14091d / 1000000) - (this.f14103k.f14090c / 1000000));
                jSONObject.put("performTraversalsTime", (this.f14103k.f14092e / 1000000) - (this.f14103k.f14091d / 1000000));
                jSONObject.put("drawTime", this.f14094b - (this.f14103k.f14092e / 1000000));
            }
        }

        /* renamed from: a */
        public JSONObject mo52008a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("msg", C6565h.m16062a(this.f14100h));
                jSONObject.put("cpuDuration", this.f14099g);
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, this.f14098f);
                jSONObject.put("type", this.f14096d);
                jSONObject.put("count", this.f14097e);
                jSONObject.put("messageCount", this.f14097e);
                jSONObject.put("lastDuration", this.f14094b - this.f14095c);
                jSONObject.put("start", this.f14093a);
                jSONObject.put("end", this.f14094b);
                m16087a(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo52009b() {
            this.f14096d = -1;
            this.f14097e = -1;
            this.f14098f = -1;
            this.f14100h = null;
            this.f14102j = null;
            this.f14103k = null;
            this.f14101i = null;
        }
    }

    /* renamed from: com.apm.insight.b.h$f */
    private static class C6574f {

        /* renamed from: a */
        int f14104a;

        /* renamed from: b */
        int f14105b;

        /* renamed from: c */
        C6573e f14106c;

        /* renamed from: d */
        List<C6573e> f14107d = new ArrayList();

        C6574f(int i) {
            this.f14104a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C6573e mo52010a(int i) {
            C6573e eVar = this.f14106c;
            if (eVar != null) {
                eVar.f14096d = i;
                C6573e eVar2 = this.f14106c;
                this.f14106c = null;
                return eVar2;
            }
            C6573e eVar3 = new C6573e();
            eVar3.f14096d = i;
            return eVar3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public List<C6573e> mo52011a() {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            if (this.f14107d.size() == this.f14104a) {
                for (int i2 = this.f14105b; i2 < this.f14107d.size(); i2++) {
                    arrayList.add(this.f14107d.get(i2));
                }
                while (i < this.f14105b - 1) {
                    arrayList.add(this.f14107d.get(i));
                    i++;
                }
            } else {
                while (i < this.f14107d.size()) {
                    arrayList.add(this.f14107d.get(i));
                    i++;
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52012a(C6573e eVar) {
            int i;
            int size = this.f14107d.size();
            int i2 = this.f14104a;
            if (size < i2) {
                this.f14107d.add(eVar);
                i = this.f14107d.size();
            } else {
                int i3 = this.f14105b % i2;
                this.f14105b = i3;
                C6573e eVar2 = this.f14107d.set(i3, eVar);
                eVar2.mo52009b();
                this.f14106c = eVar2;
                i = this.f14105b + 1;
            }
            this.f14105b = i;
        }
    }

    public C6565h(int i) {
        this(i, false);
    }

    public C6565h(int i, boolean z) {
        this.f14052c = 0;
        this.f14053d = 0;
        this.f14054e = 100;
        this.f14055f = 200;
        this.f14058i = -1;
        this.f14059j = -1;
        this.f14060k = -1;
        this.f14061l = -1;
        this.f14065p = false;
        this.f14066q = false;
        this.f14068s = false;
        this.f14069u = new Runnable() {

            /* renamed from: b */
            private long f14072b = 0;

            /* renamed from: c */
            private long f14073c;

            /* renamed from: d */
            private int f14074d = -1;

            /* renamed from: e */
            private int f14075e = 0;

            /* renamed from: f */
            private int f14076f = 0;

            public void run() {
                long uptimeMillis = SystemClock.uptimeMillis();
                C6569a a = C6565h.this.f14057h.mo52006a();
                if (this.f14074d == C6565h.this.f14053d) {
                    this.f14075e++;
                } else {
                    this.f14075e = 0;
                    this.f14076f = 0;
                    this.f14073c = uptimeMillis;
                }
                this.f14074d = C6565h.this.f14053d;
                int i = this.f14075e;
                if (i > 0 && i - this.f14076f >= C6565h.f14050t && this.f14072b != 0 && uptimeMillis - this.f14073c > 700 && C6565h.this.f14068s) {
                    a.f14083f = Looper.getMainLooper().getThread().getStackTrace();
                    this.f14076f = this.f14075e;
                }
                a.f14081d = C6565h.this.f14068s;
                a.f14080c = (uptimeMillis - this.f14072b) - 300;
                a.f14078a = uptimeMillis;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                this.f14072b = uptimeMillis2;
                a.f14079b = uptimeMillis2 - uptimeMillis;
                a.f14082e = C6565h.this.f14053d;
                C6565h.this.f14067r.mo52328a(C6565h.this.f14069u, 300);
                C6565h.this.f14057h.mo52007a(a);
            }
        };
        this.f14051a = new C6571c() {
        };
        if (z || f14049b) {
            C6770u uVar = new C6770u("looper_monitor");
            this.f14067r = uVar;
            uVar.mo52329b();
            this.f14057h = new C6570b(C5643c.COLLECT_MODE_FINANCE);
            this.f14067r.mo52328a(this.f14069u, 300);
            return;
        }
        this.f14067r = null;
    }

    /* renamed from: a */
    private static long m16059a(int i) {
        if (i < 0) {
            return 0;
        }
        try {
            return C6744g.m16948a(i);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static String m16062a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "unknown message";
        }
        try {
            String[] split = str.split(":");
            String str2 = split.length == 2 ? split[1] : "";
            if (!str.contains("{") || !str.contains("}")) {
                String str3 = str;
            } else {
                String str4 = str.split("\\{")[0];
                try {
                    str = str4 + str.split("\\}")[1];
                } catch (Throwable unused) {
                    return str4;
                }
            }
            if (str.contains("@")) {
                String[] split2 = str.split("@");
                if (split2.length > 1) {
                    str = split2[0];
                }
            }
            if (str.contains("(") && str.contains(")") && !str.endsWith(" null")) {
                String[] split3 = str.split("\\(");
                if (split3.length > 1) {
                    str = split3[1];
                }
                str = str.replace(")", "");
            }
            if (str.startsWith(" ")) {
                str = str.replace(" ", "");
            }
            return str + str2;
        } catch (Throwable unused2) {
            return str;
        }
    }

    /* renamed from: a */
    private void m16063a(int i, long j, String str) {
        m16064a(i, j, str, true);
    }

    /* renamed from: a */
    private void m16064a(int i, long j, String str, boolean z) {
        this.f14066q = true;
        C6573e a = this.f14056g.mo52010a(i);
        a.f14098f = j - this.f14058i;
        if (z) {
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            a.f14099g = currentThreadTimeMillis - this.f14061l;
            this.f14061l = currentThreadTimeMillis;
        } else {
            a.f14099g = -1;
        }
        a.f14097e = this.f14052c;
        a.f14100h = str;
        a.f14101i = this.f14062m;
        a.f14093a = this.f14058i;
        a.f14094b = j;
        a.f14095c = this.f14059j;
        this.f14056g.mo52012a(a);
        this.f14052c = 0;
        this.f14058i = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m16066a(boolean z, long j) {
        boolean z2;
        String str;
        int i;
        C6565h hVar;
        int i2 = this.f14053d + 1;
        this.f14053d = i2;
        this.f14053d = i2 & 65535;
        this.f14066q = false;
        if (this.f14058i < 0) {
            this.f14058i = j;
        }
        if (this.f14059j < 0) {
            this.f14059j = j;
        }
        if (this.f14060k < 0) {
            this.f14060k = Process.myTid();
            this.f14061l = SystemClock.currentThreadTimeMillis();
        }
        int i3 = this.f14055f;
        if (j - this.f14058i > ((long) i3)) {
            long j2 = this.f14059j;
            if (j - j2 > ((long) i3)) {
                if (z) {
                    if (this.f14052c == 0) {
                        m16063a(1, j, "no message running");
                    } else {
                        m16063a(9, j2, this.f14062m);
                        i = 1;
                        z2 = false;
                        str = "no message running";
                    }
                } else if (this.f14052c == 0) {
                    i = 8;
                    str = this.f14063n;
                    z2 = true;
                } else {
                    hVar = this;
                    hVar.m16064a(9, j2, this.f14062m, false);
                    i = 8;
                    str = this.f14063n;
                    z2 = true;
                    hVar.m16064a(i, j, str, z2);
                }
                hVar = this;
                hVar.m16064a(i, j, str, z2);
            } else {
                m16063a(9, j, this.f14063n);
            }
        }
        this.f14059j = j;
    }

    /* renamed from: e */
    private void m16074e() {
        this.f14054e = 100;
        this.f14055f = C5643c.COLLECT_MODE_FINANCE;
    }

    /* renamed from: f */
    static /* synthetic */ int m16075f(C6565h hVar) {
        int i = hVar.f14052c;
        hVar.f14052c = i + 1;
        return i;
    }

    /* renamed from: a */
    public C6573e mo52000a(long j) {
        C6573e eVar = new C6573e();
        eVar.f14100h = this.f14063n;
        eVar.f14101i = this.f14062m;
        eVar.f14098f = j - this.f14059j;
        eVar.f14099g = m16059a(this.f14060k) - this.f14061l;
        eVar.f14097e = this.f14052c;
        return eVar;
    }

    /* renamed from: a */
    public void mo52001a() {
        if (!this.f14065p) {
            this.f14065p = true;
            m16074e();
            this.f14056g = new C6574f(this.f14054e);
            this.f14064o = new C6562e() {
                /* renamed from: a */
                public void mo51994a(String str) {
                    boolean unused = C6565h.this.f14068s = true;
                    String unused2 = C6565h.this.f14063n = str;
                    super.mo51994a(str);
                    C6565h.this.m16066a(true, C6562e.f14040a);
                }

                /* renamed from: a */
                public boolean mo51995a() {
                    return true;
                }

                /* renamed from: b */
                public void mo51996b(String str) {
                    super.mo51996b(str);
                    C6565h.m16075f(C6565h.this);
                    C6565h.this.m16066a(false, C6562e.f14040a);
                    C6565h hVar = C6565h.this;
                    String unused = hVar.f14062m = hVar.f14063n;
                    String unused2 = C6565h.this.f14063n = "no message running";
                    boolean unused3 = C6565h.this.f14068s = false;
                }
            };
            C6575i.m16093a();
            C6575i.m16094a(this.f14064o);
            C6581k.m16104a(C6581k.m16105a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo52002b() {
        mo52001a();
    }

    /* renamed from: c */
    public JSONArray mo52003c() {
        JSONArray jSONArray = new JSONArray();
        try {
            List<C6573e> a = this.f14056g.mo52011a();
            if (a == null) {
                return jSONArray;
            }
            int i = 0;
            for (C6573e next : a) {
                if (next != null) {
                    i++;
                    jSONArray.put(next.mo52008a().put("id", i));
                }
            }
            return jSONArray;
        } catch (Throwable unused) {
        }
    }
}
