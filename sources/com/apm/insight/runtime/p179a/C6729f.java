package com.apm.insight.runtime.p179a;

import android.content.Context;
import com.apm.insight.C6553b;
import com.apm.insight.C6617h;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C6594a;
import com.apm.insight.entity.Header;
import com.appnext.base.p264b.C8849c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.apm.insight.runtime.a.f */
public class C6729f {

    /* renamed from: a */
    private static volatile C6729f f14466a;

    /* renamed from: b */
    private Context f14467b;

    /* renamed from: c */
    private Map<CrashType, C6723c> f14468c = new HashMap();

    /* renamed from: d */
    private C6720b f14469d;

    /* renamed from: e */
    private C6725d f14470e;

    /* renamed from: com.apm.insight.runtime.a.f$1 */
    static /* synthetic */ class C67301 {

        /* renamed from: a */
        static final /* synthetic */ int[] f14471a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.apm.insight.CrashType[] r0 = com.apm.insight.CrashType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14471a = r0
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.JAVA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14471a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.LAUNCH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14471a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.NATIVE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f14471a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.ANR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f14471a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.DART     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f14471a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.CUSTOM_JAVA     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f14471a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.BLOCK     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f14471a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.ENSURE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.p179a.C6729f.C67301.<clinit>():void");
        }
    }

    private C6729f(Context context) {
        this.f14467b = context;
        try {
            this.f14469d = C6720b.m16835d();
            this.f14470e = new C6725d(this.f14467b);
        } catch (Throwable th) {
            C6553b.m16004a().mo52019a("NPTH_CATCH", th);
        }
    }

    /* renamed from: a */
    private C6723c m16892a(CrashType crashType) {
        C6723c cVar = this.f14468c.get(crashType);
        if (cVar != null) {
            return cVar;
        }
        switch (C67301.f14471a[crashType.ordinal()]) {
            case 1:
                cVar = new C6734j(this.f14467b, this.f14469d, this.f14470e);
                break;
            case 2:
                cVar = new C6735k(this.f14467b, this.f14469d, this.f14470e);
                break;
            case 3:
                cVar = new C6736l(this.f14467b, this.f14469d, this.f14470e);
                break;
            case 4:
                cVar = new C6719a(this.f14467b, this.f14469d, this.f14470e);
                break;
            case 5:
                cVar = new C6732h(this.f14467b, this.f14469d, this.f14470e);
                break;
            case 6:
                cVar = new C6731g(this.f14467b, this.f14469d, this.f14470e);
                break;
            case 7:
                cVar = new C6728e(this.f14467b, this.f14469d, this.f14470e);
                break;
            case 8:
                cVar = new C6733i(this.f14467b, this.f14469d, this.f14470e);
                break;
        }
        if (cVar != null) {
            this.f14468c.put(crashType, cVar);
        }
        return cVar;
    }

    /* renamed from: a */
    public static C6729f m16893a() {
        if (f14466a == null) {
            Context g = C6617h.m16313g();
            if (g != null) {
                f14466a = new C6729f(g);
            } else {
                throw new IllegalArgumentException("NpthBus not init");
            }
        }
        return f14466a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r3 = m16892a(r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.apm.insight.entity.C6594a mo52278a(com.apm.insight.CrashType r3, com.apm.insight.entity.C6594a r4) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return r4
        L_0x0003:
            com.apm.insight.runtime.a.c r3 = r2.m16892a(r3)
            if (r3 == 0) goto L_0x0010
            r0 = 0
            r1 = 0
            com.apm.insight.entity.a r3 = r3.mo52264a(r4, r0, r1)
            return r3
        L_0x0010:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.p179a.C6729f.mo52278a(com.apm.insight.CrashType, com.apm.insight.entity.a):com.apm.insight.entity.a");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = m16892a(r1);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.apm.insight.entity.C6594a mo52279a(com.apm.insight.CrashType r1, com.apm.insight.entity.C6594a r2, com.apm.insight.runtime.p179a.C6723c.C6724a r3, boolean r4) {
        /*
            r0 = this;
            if (r1 != 0) goto L_0x0003
            return r2
        L_0x0003:
            com.apm.insight.runtime.a.c r1 = r0.m16892a(r1)
            if (r1 == 0) goto L_0x000e
            com.apm.insight.entity.a r1 = r1.mo52264a(r2, r3, r4)
            return r1
        L_0x000e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.p179a.C6729f.mo52279a(com.apm.insight.CrashType, com.apm.insight.entity.a, com.apm.insight.runtime.a.c$a, boolean):com.apm.insight.entity.a");
    }

    /* renamed from: a */
    public C6594a mo52280a(List<C6594a> list, JSONArray jSONArray) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        C6594a aVar = new C6594a();
        JSONArray jSONArray2 = new JSONArray();
        for (C6594a h : list) {
            jSONArray2.put(h.mo52066h());
        }
        aVar.mo52052a(C8849c.DATA, (Object) jSONArray2);
        aVar.mo52052a("all_data", (Object) jSONArray);
        Header a = Header.m16138a(this.f14467b);
        Header.m16140a(a);
        a.mo52039c();
        a.mo52040d();
        a.mo52041e();
        Header.m16143b(a);
        aVar.mo52045a(a);
        return aVar;
    }
}
