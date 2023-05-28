package com.ironsource.sdk.controller;

import com.ironsource.sdk.p137a.C4743a;
import com.ironsource.sdk.p137a.C4747d;
import com.ironsource.sdk.p137a.C4749f;
import com.ironsource.sdk.p145h.C4948c;
import com.ironsource.sdk.p149k.C4965b;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.f */
final class C4785f {

    /* renamed from: a */
    long f12173a;

    /* renamed from: b */
    int f12174b;

    /* renamed from: c */
    int f12175c;

    /* renamed from: d */
    C4789b f12176d = C4789b.NONE;

    /* renamed from: e */
    private String f12177e;

    /* renamed from: f */
    private String f12178f;

    /* renamed from: g */
    private C4965b f12179g;

    /* renamed from: com.ironsource.sdk.controller.f$2 */
    static /* synthetic */ class C47872 {

        /* renamed from: a */
        static final /* synthetic */ int[] f12181a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|(2:1|2)|3|5|6|7|8|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
        static {
            /*
                int[] r0 = com.ironsource.sdk.controller.C4785f.C4788a.m14025a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12181a = r0
                r1 = 1
                int r2 = com.ironsource.sdk.controller.C4785f.C4788a.f12182a     // Catch:{ NoSuchFieldError -> 0x000f }
                r2 = 0
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                int[] r2 = f12181a     // Catch:{ NoSuchFieldError -> 0x0016 }
                int r3 = com.ironsource.sdk.controller.C4785f.C4788a.f12183b     // Catch:{ NoSuchFieldError -> 0x0016 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                int[] r1 = f12181a     // Catch:{ NoSuchFieldError -> 0x001d }
                int r2 = com.ironsource.sdk.controller.C4785f.C4788a.f12184c     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 3
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C4785f.C47872.<clinit>():void");
        }
    }

    /* renamed from: com.ironsource.sdk.controller.f$a */
    public enum C4788a {
        ;
        

        /* renamed from: a */
        public static final int f12182a = 1;

        /* renamed from: b */
        public static final int f12183b = 2;

        /* renamed from: c */
        public static final int f12184c = 3;

        static {
            f12185d = new int[]{1, 2, 3};
        }

        /* renamed from: a */
        public static int[] m14025a() {
            return (int[]) f12185d.clone();
        }
    }

    /* renamed from: com.ironsource.sdk.controller.f$b */
    public enum C4789b {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);
        

        /* renamed from: g */
        int f12193g;

        private C4789b(int i) {
            this.f12193g = i;
        }
    }

    C4785f(JSONObject jSONObject, String str, String str2, C4965b bVar) {
        int optInt = jSONObject.optInt("controllerSourceStrategy", -1);
        this.f12174b = optInt;
        this.f12175c = optInt != 1 ? optInt != 2 ? C4788a.f12182a : C4788a.f12184c : C4788a.f12183b;
        this.f12177e = str;
        this.f12178f = str2;
        this.f12179g = bVar;
    }

    /* renamed from: a */
    private void m14014a(C4948c cVar) {
        if (!this.f12179g.mo34701b()) {
            this.f12179g.mo34699a(cVar, this.f12178f);
        }
    }

    /* renamed from: g */
    private C4948c m14015g() {
        return new C4948c(this.f12177e, "next_mobileController.html");
    }

    /* renamed from: h */
    private C4948c m14016h() {
        return new C4948c(this.f12177e, "fallback_mobileController.html");
    }

    /* renamed from: i */
    private void m14017i() {
        try {
            C4948c d = mo34338d();
            if (d.exists()) {
                C4948c h = m14016h();
                if (h.exists()) {
                    h.delete();
                }
                IronSourceStorageUtils.renameFile(d.getPath(), h.getPath());
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo34334a(C4789b bVar) {
        C4743a a = new C4743a().mo34234a("generalmessage", Integer.valueOf(this.f12174b)).mo34234a("controllersource", Integer.valueOf(bVar.f12193g));
        if (this.f12173a > 0) {
            a.mo34234a("timingvalue", Long.valueOf(System.currentTimeMillis() - this.f12173a));
        }
        C4747d.m13921a(C4749f.f12055s, (Map<String, Object>) a.f12028a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo34335a() {
        return this.f12176d != C4789b.NONE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo34336b() {
        C4948c cVar;
        int i = C47872.f12181a[this.f12175c - 1];
        if (i == 1) {
            IronSourceStorageUtils.deleteFile(mo34338d());
            cVar = new C4948c(this.f12177e, SDKUtils.getFileName(this.f12178f));
        } else if (i != 2) {
            if (i == 3) {
                try {
                    C4948c d = mo34338d();
                    C4948c g = m14015g();
                    if (!g.exists() && !d.exists()) {
                        m14014a(new C4948c(this.f12177e, SDKUtils.getFileName(this.f12178f)));
                        return false;
                    } else if (g.exists() || !d.exists()) {
                        m14017i();
                        if (IronSourceStorageUtils.renameFile(m14015g().getPath(), mo34338d().getPath())) {
                            C4789b bVar = C4789b.PREPARED_CONTROLLER_LOADED;
                            this.f12176d = bVar;
                            mo34334a(bVar);
                            mo34337c();
                            m14014a(new C4948c(this.f12177e, g.getName()));
                            return true;
                        } else if (mo34339e()) {
                            C4789b bVar2 = C4789b.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                            this.f12176d = bVar2;
                            mo34334a(bVar2);
                            m14014a(new C4948c(this.f12177e, g.getName()));
                            return true;
                        } else {
                            m14014a(new C4948c(this.f12177e, SDKUtils.getFileName(this.f12178f)));
                        }
                    } else {
                        C4789b bVar3 = C4789b.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                        this.f12176d = bVar3;
                        mo34334a(bVar3);
                        m14014a(new C4948c(this.f12177e, g.getName()));
                        return true;
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        } else {
            m14017i();
            cVar = new C4948c(this.f12177e, SDKUtils.getFileName(this.f12178f));
        }
        m14014a(cVar);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo34337c() {
        IronSourceStorageUtils.deleteFile(m14016h());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C4948c mo34338d() {
        return new C4948c(this.f12177e, "mobileController.html");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo34339e() {
        try {
            if (!m14016h().exists()) {
                return false;
            }
            return IronSourceStorageUtils.renameFile(m14016h().getPath(), mo34338d().getPath());
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final JSONObject mo34340f() {
        return new JSONObject() {
            {
                putOpt("controllerSourceStrategy", Integer.valueOf(C4785f.this.f12174b));
                putOpt("controllerSourceCode", Integer.valueOf(C4785f.this.f12176d.f12193g));
            }
        };
    }
}
