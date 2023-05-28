package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.p081ac.CrashpadHelper;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: com.yandex.metrica.impl.ob.y7 */
public class C3687y7 {

    /* renamed from: m */
    private static final Set<String> f9493m;

    /* renamed from: a */
    private final Context f9494a;

    /* renamed from: b */
    private final ICommonExecutor f9495b;

    /* renamed from: c */
    private final File f9496c;

    /* renamed from: d */
    private final List<String> f9497d;

    /* renamed from: e */
    private final File f9498e;

    /* renamed from: f */
    private final File f9499f;

    /* renamed from: g */
    private final C3293nm<Void, String> f9500g;

    /* renamed from: h */
    private final C2210Jl f9501h;

    /* renamed from: i */
    private final C3646x7 f9502i;

    /* renamed from: j */
    private final Callable<String> f9503j;

    /* renamed from: k */
    private final C3389q7 f9504k;

    /* renamed from: l */
    private final C1877B0 f9505l;

    /* renamed from: com.yandex.metrica.impl.ob.y7$a */
    class C3688a implements C3293nm<Void, String> {
        C3688a() {
        }

        /* renamed from: a */
        public Object mo15448a(Object obj) {
            Void voidR = (Void) obj;
            return CrashpadHelper.getLibraryVersion();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.y7$b */
    class C3689b implements Callable<String> {
        C3689b() {
        }

        public Object call() throws Exception {
            return CrashpadHelper.getLibDirInsideApk();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.y7$c */
    static class C3690c implements C3293nm<File, Boolean> {
        C3690c() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo15448a(Object obj) {
            File file = (File) obj;
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.y7$d */
    static class C3691d implements C3293nm<File, Boolean> {

        /* renamed from: a */
        private final String f9506a;

        public C3691d(String str) {
            this.f9506a = str;
        }

        /* renamed from: a */
        public Object mo15448a(Object obj) {
            return Boolean.valueOf(!((File) obj).getName().endsWith(this.f9506a));
        }
    }

    static {
        HashSet hashSet = new HashSet();
        f9493m = hashSet;
        hashSet.add("armeabi-v7a");
        hashSet.add("arm64-v8a");
        hashSet.add("x86");
        hashSet.add("x86_64");
    }

    public C3687y7(Context context, C1877B0 b0, ICommonExecutor iCommonExecutor) {
        this(context, b0, iCommonExecutor, Arrays.asList(new String[]{"libappmetrica_crashpad_handler.so", "libappmetrica_handler.so"}));
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.yandex.metrica.impl.p082ob.C1916C7 m11059a() {
        /*
            r10 = this;
            java.io.File r0 = r10.f9496c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r0 = 0
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            r3 = 0
            if (r0 == 0) goto L_0x00b1
            android.os.SystemClock.elapsedRealtime()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "-"
            r0.append(r4)
            com.yandex.metrica.impl.ob.nm<java.lang.Void, java.lang.String> r4 = r10.f9500g
            java.lang.Object r4 = r4.mo15448a(r3)
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.yandex.metrica.impl.ob.Jl r4 = r10.f9501h
            java.lang.String r4 = r4.mo16050a()
            if (r4 == 0) goto L_0x00b0
            java.io.File r5 = r10.f9499f
            if (r5 != 0) goto L_0x003c
            goto L_0x005d
        L_0x003c:
            boolean r5 = r5.exists()
            if (r5 != 0) goto L_0x005f
            java.io.File r5 = r10.f9499f
            boolean r5 = r5.mkdirs()
            if (r5 != 0) goto L_0x004b
            goto L_0x005d
        L_0x004b:
            java.io.File r5 = r10.f9498e
            if (r5 == 0) goto L_0x005d
            boolean r5 = r5.setExecutable(r1, r2)
            if (r5 != 0) goto L_0x0056
            goto L_0x005d
        L_0x0056:
            java.io.File r5 = r10.f9499f
            boolean r5 = r5.setExecutable(r1, r2)
            goto L_0x0060
        L_0x005d:
            r5 = 0
            goto L_0x0060
        L_0x005f:
            r5 = 1
        L_0x0060:
            if (r5 == 0) goto L_0x00b0
            com.yandex.metrica.impl.ob.y7$d r5 = new com.yandex.metrica.impl.ob.y7$d
            r5.<init>(r0)
            com.yandex.metrica.core.api.executors.ICommonExecutor r6 = r10.f9495b
            com.yandex.metrica.impl.ob.z7 r7 = new com.yandex.metrica.impl.ob.z7
            r7.<init>(r10, r5)
            r6.execute(r7)
            java.util.List<java.lang.String> r5 = r10.f9497d
            java.util.Iterator r5 = r5.iterator()
        L_0x0077:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00b0
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            com.yandex.metrica.impl.ob.x7 r7 = r10.f9502i
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r2] = r4
            r8[r1] = r6
            java.lang.String r9 = "lib/%s/%s"
            java.lang.String r8 = java.lang.String.format(r9, r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r9.append(r0)
            java.lang.String r6 = r9.toString()
            java.lang.String r6 = r7.mo18392a(r8, r6)
            android.os.SystemClock.elapsedRealtime()
            if (r6 == 0) goto L_0x0077
            com.yandex.metrica.impl.ob.C7 r0 = new com.yandex.metrica.impl.ob.C7
            r0.<init>(r6, r2, r3)
            r3 = r0
        L_0x00b0:
            return r3
        L_0x00b1:
            java.io.File r0 = r10.f9496c
            java.lang.String r0 = r0.getAbsolutePath()
            com.yandex.metrica.impl.ob.C7 r1 = new com.yandex.metrica.impl.ob.C7
            r1.<init>(r0, r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3687y7.m11059a():com.yandex.metrica.impl.ob.C7");
    }

    /* renamed from: c */
    private File m11060c() {
        String str;
        try {
            str = this.f9503j.call();
        } catch (Throwable unused) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.f9505l.getClass();
        return new File(str);
    }

    /* renamed from: b */
    public C1916C7 mo18417b() {
        C3343p7 p7Var;
        C1916C7 c7 = null;
        if (C1848A2.m6808a(29)) {
            File c = m11060c();
            if (c == null) {
                return null;
            }
            for (String file : this.f9497d) {
                this.f9505l.getClass();
                File file2 = new File(c, file);
                if (file2.exists()) {
                    return new C1916C7(file2.getAbsolutePath(), true, (C3343p7) null);
                }
            }
            return null;
        } else if (!C1848A2.m6808a(23)) {
            return m11059a();
        } else {
            C3389q7 q7Var = this.f9504k;
            Context context = this.f9494a;
            String a = this.f9501h.mo16050a();
            q7Var.getClass();
            try {
                String[] a2 = C1948D7.m7014a(context, a);
                p7Var = new C3343p7(a2[0], a2[1], Environment.getDataDirectory().getAbsolutePath());
            } catch (Throwable unused) {
                p7Var = null;
            }
            if (p7Var != null) {
                File c2 = m11060c();
                if (c2 != null) {
                    Iterator<String> it = this.f9497d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        this.f9505l.getClass();
                        File file3 = new File(c2, it.next());
                        if (file3.exists()) {
                            c7 = new C1916C7(file3.getAbsolutePath(), false, p7Var);
                            break;
                        }
                    }
                } else {
                    c7 = new C1916C7("stub", false, p7Var);
                }
            }
            if (c7 == null || c7.f5164d == null) {
                return m11059a();
            }
            this.f9495b.execute(new C3725z7(this, new C3690c()));
            return c7;
        }
    }

    private C3687y7(Context context, C1877B0 b0, ICommonExecutor iCommonExecutor, List<String> list) {
        this(context, iCommonExecutor, list, b0, b0.mo15520a(b0.mo15518a(context), list.get(0)), b0.mo15522b(context.getCacheDir(), "appmetrica_crashpad_handler_extracted"), new C3688a(), new C3689b(), new C2210Jl(f9493m));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C3687y7(android.content.Context r13, com.yandex.metrica.core.api.executors.ICommonExecutor r14, java.util.List<java.lang.String> r15, com.yandex.metrica.impl.p082ob.C1877B0 r16, java.io.File r17, java.io.File r18, com.yandex.metrica.impl.p082ob.C3293nm<java.lang.Void, java.lang.String> r19, java.util.concurrent.Callable<java.lang.String> r20, com.yandex.metrica.impl.p082ob.C2210Jl r21) {
        /*
            r12 = this;
            com.yandex.metrica.impl.ob.x7 r9 = new com.yandex.metrica.impl.ob.x7
            r1 = r13
            r5 = r18
            r9.<init>(r13, r5)
            com.yandex.metrica.impl.ob.q7 r10 = new com.yandex.metrica.impl.ob.q7
            r10.<init>()
            r0 = r12
            r2 = r14
            r3 = r15
            r4 = r17
            r6 = r19
            r7 = r20
            r8 = r21
            r11 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3687y7.<init>(android.content.Context, com.yandex.metrica.core.api.executors.ICommonExecutor, java.util.List, com.yandex.metrica.impl.ob.B0, java.io.File, java.io.File, com.yandex.metrica.impl.ob.nm, java.util.concurrent.Callable, com.yandex.metrica.impl.ob.Jl):void");
    }

    C3687y7(Context context, ICommonExecutor iCommonExecutor, List<String> list, File file, File file2, C3293nm<Void, String> nmVar, Callable<String> callable, C2210Jl jl, C3646x7 x7Var, C3389q7 q7Var, C1877B0 b0) {
        this.f9494a = context;
        this.f9495b = iCommonExecutor;
        this.f9497d = list;
        this.f9496c = file;
        this.f9498e = context.getCacheDir();
        this.f9499f = file2;
        this.f9500g = nmVar;
        this.f9503j = callable;
        this.f9501h = jl;
        this.f9502i = x7Var;
        this.f9504k = q7Var;
        this.f9505l = b0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18416a(C3293nm<File, Boolean> nmVar) {
        File[] listFiles;
        File file = this.f9499f;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (nmVar.mo15448a(file2).booleanValue()) {
                    file2.delete();
                }
            }
        }
    }
}
