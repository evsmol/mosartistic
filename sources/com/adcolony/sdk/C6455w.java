package com.adcolony.sdk;

import com.adcolony.sdk.C6288e0;
import com.appnext.base.p264b.C8849c;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.zip.GZIPInputStream;

/* renamed from: com.adcolony.sdk.w */
class C6455w {

    /* renamed from: a */
    private LinkedList<Runnable> f13891a = new LinkedList<>();

    /* renamed from: b */
    private boolean f13892b;

    /* renamed from: com.adcolony.sdk.w$a */
    class C6456a implements C6327j0 {

        /* renamed from: com.adcolony.sdk.w$a$a */
        class C6457a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C6312h0 f13894a;

            C6457a(C6312h0 h0Var) {
                this.f13894a = h0Var;
            }

            public void run() {
                boolean unused = C6455w.this.m15829g(this.f13894a);
                C6455w.this.m15810a();
            }
        }

        C6456a() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6455w.this.m15813a((Runnable) new C6457a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.w$b */
    class C6458b implements C6327j0 {

        /* renamed from: com.adcolony.sdk.w$b$a */
        class C6459a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C6312h0 f13897a;

            C6459a(C6312h0 h0Var) {
                this.f13897a = h0Var;
            }

            public void run() {
                boolean unused = C6455w.this.m15815a(this.f13897a, new File(C6235c0.m15087h(this.f13897a.mo50732a(), "filepath")));
                C6455w.this.m15810a();
            }
        }

        C6458b() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6455w.this.m15813a((Runnable) new C6459a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.w$c */
    class C6460c implements C6327j0 {

        /* renamed from: com.adcolony.sdk.w$c$a */
        class C6461a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C6312h0 f13900a;

            C6461a(C6312h0 h0Var) {
                this.f13900a = h0Var;
            }

            public void run() {
                boolean unused = C6455w.this.m15824d(this.f13900a);
                C6455w.this.m15810a();
            }
        }

        C6460c() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6455w.this.m15813a((Runnable) new C6461a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.w$d */
    class C6462d implements C6327j0 {

        /* renamed from: com.adcolony.sdk.w$d$a */
        class C6463a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C6312h0 f13903a;

            C6463a(C6312h0 h0Var) {
                this.f13903a = h0Var;
            }

            public void run() {
                String unused = C6455w.this.m15825e(this.f13903a);
                C6455w.this.m15810a();
            }
        }

        C6462d() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6455w.this.m15813a((Runnable) new C6463a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.w$e */
    class C6464e implements C6327j0 {

        /* renamed from: com.adcolony.sdk.w$e$a */
        class C6465a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C6312h0 f13906a;

            C6465a(C6312h0 h0Var) {
                this.f13906a = h0Var;
            }

            public void run() {
                boolean unused = C6455w.this.m15827f(this.f13906a);
                C6455w.this.m15810a();
            }
        }

        C6464e() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6455w.this.m15813a((Runnable) new C6465a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.w$f */
    class C6466f implements C6327j0 {

        /* renamed from: com.adcolony.sdk.w$f$a */
        class C6467a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C6312h0 f13909a;

            C6467a(C6312h0 h0Var) {
                this.f13909a = h0Var;
            }

            public void run() {
                boolean unused = C6455w.this.m15819b(this.f13909a);
                C6455w.this.m15810a();
            }
        }

        C6466f() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6455w.this.m15813a((Runnable) new C6467a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.w$g */
    class C6468g implements C6327j0 {

        /* renamed from: com.adcolony.sdk.w$g$a */
        class C6469a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C6312h0 f13912a;

            C6469a(C6312h0 h0Var) {
                this.f13912a = h0Var;
            }

            public void run() {
                boolean unused = C6455w.this.m15821c(this.f13912a);
                C6455w.this.m15810a();
            }
        }

        C6468g() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6455w.this.m15813a((Runnable) new C6469a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.w$h */
    class C6470h implements C6327j0 {

        /* renamed from: com.adcolony.sdk.w$h$a */
        class C6471a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C6312h0 f13915a;

            C6471a(C6312h0 h0Var) {
                this.f13915a = h0Var;
            }

            public void run() {
                boolean unused = C6455w.this.m15831h(this.f13915a);
                C6455w.this.m15810a();
            }
        }

        C6470h() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6455w.this.m15813a((Runnable) new C6471a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.w$i */
    class C6472i implements C6327j0 {

        /* renamed from: com.adcolony.sdk.w$i$a */
        class C6473a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C6312h0 f13918a;

            C6473a(C6312h0 h0Var) {
                this.f13918a = h0Var;
            }

            public void run() {
                boolean unused = C6455w.this.m15814a(this.f13918a);
                C6455w.this.m15810a();
            }
        }

        C6472i() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6455w.this.m15813a((Runnable) new C6473a(h0Var));
        }
    }

    C6455w() {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m15821c(C6312h0 h0Var) {
        C6294f1 a = h0Var.mo50732a();
        String h = C6235c0.m15087h(a, "filepath");
        C6185a.m14887b().mo50815z().mo51059h();
        C6294f1 b = C6235c0.m15073b();
        try {
            int d = C6235c0.m15083d(a, "offset");
            int d2 = C6235c0.m15083d(a, "size");
            boolean b2 = C6235c0.m15076b(a, "gunzip");
            String h2 = C6235c0.m15087h(a, "output_filepath");
            InputStream w0Var = new C6474w0(new FileInputStream(h), d, d2);
            if (b2) {
                w0Var = new GZIPInputStream(w0Var, 1024);
            }
            if (h2.equals("")) {
                StringBuilder sb = new StringBuilder(w0Var.available());
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = w0Var.read(bArr, 0, 1024);
                    if (read < 0) {
                        break;
                    }
                    sb.append(new String(bArr, 0, read, "ISO-8859-1"));
                }
                C6235c0.m15077b(b, "size", sb.length());
                C6235c0.m15070a(b, C8849c.DATA, sb.toString());
            } else {
                FileOutputStream fileOutputStream = new FileOutputStream(h2);
                byte[] bArr2 = new byte[1024];
                int i = 0;
                while (true) {
                    int read2 = w0Var.read(bArr2, 0, 1024);
                    if (read2 < 0) {
                        break;
                    }
                    fileOutputStream.write(bArr2, 0, read2);
                    i += read2;
                }
                fileOutputStream.close();
                C6235c0.m15077b(b, "size", i);
            }
            w0Var.close();
            C6235c0.m15079b(b, "success", true);
            h0Var.mo50733a(b).mo50736c();
            return true;
        } catch (IOException unused) {
            C6235c0.m15079b(b, "success", false);
            h0Var.mo50733a(b).mo50736c();
            return false;
        } catch (OutOfMemoryError unused2) {
            new C6288e0.C6289a().mo50644a("Out of memory error - disabling AdColony.").mo50645a(C6288e0.f13497h);
            C6185a.m14887b().mo50786b(true);
            C6235c0.m15079b(b, "success", false);
            h0Var.mo50733a(b).mo50736c();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m15824d(C6312h0 h0Var) {
        String h = C6235c0.m15087h(h0Var.mo50732a(), "filepath");
        C6185a.m14887b().mo50815z().mo51059h();
        C6294f1 b = C6235c0.m15073b();
        String[] list = new File(h).list();
        if (list != null) {
            C6290e1 a = C6235c0.m15059a();
            for (String str : list) {
                C6294f1 b2 = C6235c0.m15073b();
                C6235c0.m15070a(b2, "filename", str);
                if (new File(h + str).isDirectory()) {
                    C6235c0.m15079b(b2, "is_folder", true);
                } else {
                    C6235c0.m15079b(b2, "is_folder", false);
                }
                C6235c0.m15065a(a, b2);
            }
            C6235c0.m15079b(b, "success", true);
            C6235c0.m15068a(b, "entries", a);
            h0Var.mo50733a(b).mo50736c();
            return true;
        }
        C6235c0.m15079b(b, "success", false);
        h0Var.mo50733a(b).mo50736c();
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public String m15825e(C6312h0 h0Var) {
        C6294f1 a = h0Var.mo50732a();
        String h = C6235c0.m15087h(a, "filepath");
        String h2 = C6235c0.m15087h(a, "encoding");
        boolean z = h2 != null && h2.equals("utf8");
        C6185a.m14887b().mo50815z().mo51059h();
        C6294f1 b = C6235c0.m15073b();
        try {
            StringBuilder a2 = mo51060a(h, z);
            C6235c0.m15079b(b, "success", true);
            C6235c0.m15070a(b, C8849c.DATA, a2.toString());
            h0Var.mo50733a(b).mo50736c();
            return a2.toString();
        } catch (IOException unused) {
            C6235c0.m15079b(b, "success", false);
            h0Var.mo50733a(b).mo50736c();
            return "";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m15827f(C6312h0 h0Var) {
        C6294f1 a = h0Var.mo50732a();
        String h = C6235c0.m15087h(a, "filepath");
        String h2 = C6235c0.m15087h(a, "new_filepath");
        C6185a.m14887b().mo50815z().mo51059h();
        C6294f1 b = C6235c0.m15073b();
        try {
            if (new File(h).renameTo(new File(h2))) {
                C6235c0.m15079b(b, "success", true);
                h0Var.mo50733a(b).mo50736c();
                return true;
            }
            C6235c0.m15079b(b, "success", false);
            h0Var.mo50733a(b).mo50736c();
            return false;
        } catch (Exception unused) {
            C6235c0.m15079b(b, "success", false);
            h0Var.mo50733a(b).mo50736c();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m15829g(C6312h0 h0Var) {
        C6294f1 a = h0Var.mo50732a();
        String h = C6235c0.m15087h(a, "filepath");
        String h2 = C6235c0.m15087h(a, C8849c.DATA);
        boolean equals = C6235c0.m15087h(a, "encoding").equals("utf8");
        C6185a.m14887b().mo50815z().mo51059h();
        C6294f1 b = C6235c0.m15073b();
        try {
            mo51061a(h, h2, equals);
            C6235c0.m15079b(b, "success", true);
            h0Var.mo50733a(b).mo50736c();
            return true;
        } catch (IOException unused) {
            C6235c0.m15079b(b, "success", false);
            h0Var.mo50733a(b).mo50736c();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00f7, code lost:
        new com.adcolony.sdk.C6288e0.C6289a().mo50644a("Out of memory error - disabling AdColony.").mo50645a(com.adcolony.sdk.C6288e0.f13497h);
        com.adcolony.sdk.C6185a.m14887b().mo50786b(true);
        com.adcolony.sdk.C6235c0.m15079b(r5, "success", false);
        r0.mo50733a(r5).mo50736c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x011a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x011b, code lost:
        r2 = false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ExcHandler: OutOfMemoryError (unused java.lang.OutOfMemoryError), SYNTHETIC, Splitter:B:1:0x0029] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m15831h(com.adcolony.sdk.C6312h0 r20) {
        /*
            r19 = this;
            r0 = r20
            java.lang.String r1 = "success"
            com.adcolony.sdk.f1 r2 = r20.mo50732a()
            java.lang.String r3 = "filepath"
            java.lang.String r3 = com.adcolony.sdk.C6235c0.m15087h(r2, r3)
            java.lang.String r4 = "bundle_path"
            java.lang.String r4 = com.adcolony.sdk.C6235c0.m15087h(r2, r4)
            java.lang.String r5 = "bundle_filenames"
            com.adcolony.sdk.e1 r2 = com.adcolony.sdk.C6235c0.m15060a((com.adcolony.sdk.C6294f1) r2, (java.lang.String) r5)
            com.adcolony.sdk.k r5 = com.adcolony.sdk.C6185a.m14887b()
            com.adcolony.sdk.v0 r5 = r5.mo50815z()
            r5.mo51059h()
            com.adcolony.sdk.f1 r5 = com.adcolony.sdk.C6235c0.m15073b()
            java.io.File r8 = new java.io.File     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r8.<init>(r4)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            java.io.RandomAccessFile r9 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            java.lang.String r10 = "r"
            r9.<init>(r8, r10)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r10 = 32
            byte[] r10 = new byte[r10]     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r9.readInt()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            int r11 = r9.readInt()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            com.adcolony.sdk.e1 r12 = new com.adcolony.sdk.e1     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r12.<init>()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r13 = 1024(0x400, float:1.435E-42)
            byte[] r14 = new byte[r13]     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r15 = 0
        L_0x004a:
            if (r15 >= r11) goto L_0x00dd
            int r16 = r15 * 44
            int r6 = r16 + 8
            r17 = r8
            long r7 = (long) r6     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r9.seek(r7)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r9.read(r10)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r9.readInt()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            int r6 = r9.readInt()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            int r7 = r9.readInt()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r12.mo50658f(r7)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00b3 }
            r8.<init>()     // Catch:{ JSONException -> 0x00b3 }
            r8.append(r3)     // Catch:{ JSONException -> 0x00b3 }
            java.lang.Object r13 = r2.mo50647a((int) r15)     // Catch:{ JSONException -> 0x00b3 }
            r8.append(r13)     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r8 = r8.toString()     // Catch:{ JSONException -> 0x00b3 }
            r18 = r2
            r13 = r3
            long r2 = (long) r6
            r9.seek(r2)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r2.<init>(r8)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            int r3 = r7 / 1024
            int r7 = r7 % 1024
            r6 = 0
        L_0x008b:
            if (r6 >= r3) goto L_0x009d
            r16 = r3
            r3 = 1024(0x400, float:1.435E-42)
            r8 = 0
            r9.read(r14, r8, r3)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r2.write(r14, r8, r3)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            int r6 = r6 + 1
            r3 = r16
            goto L_0x008b
        L_0x009d:
            r3 = 1024(0x400, float:1.435E-42)
            r8 = 0
            r9.read(r14, r8, r7)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r2.write(r14, r8, r7)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r2.close()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            int r15 = r15 + 1
            r3 = r13
            r8 = r17
            r2 = r18
            r13 = 1024(0x400, float:1.435E-42)
            goto L_0x004a
        L_0x00b3:
            com.adcolony.sdk.e0$a r2 = new com.adcolony.sdk.e0$a     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r2.<init>()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            java.lang.String r3 = "Couldn't extract file name at index "
            com.adcolony.sdk.e0$a r2 = r2.mo50644a((java.lang.String) r3)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            com.adcolony.sdk.e0$a r2 = r2.mo50642a((int) r15)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            java.lang.String r3 = " unpacking ad unit bundle at "
            com.adcolony.sdk.e0$a r2 = r2.mo50644a((java.lang.String) r3)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            com.adcolony.sdk.e0$a r2 = r2.mo50644a((java.lang.String) r4)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            com.adcolony.sdk.e0 r3 = com.adcolony.sdk.C6288e0.f13497h     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r2.mo50645a((com.adcolony.sdk.C6288e0) r3)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r2 = 0
            com.adcolony.sdk.C6235c0.m15079b((com.adcolony.sdk.C6294f1) r5, (java.lang.String) r1, (boolean) r2)     // Catch:{ IOException -> 0x011c, OutOfMemoryError -> 0x00f7 }
            com.adcolony.sdk.h0 r3 = r0.mo50733a(r5)     // Catch:{ IOException -> 0x011c, OutOfMemoryError -> 0x00f7 }
            r3.mo50736c()     // Catch:{ IOException -> 0x011c, OutOfMemoryError -> 0x00f7 }
            return r2
        L_0x00dd:
            r17 = r8
            r9.close()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r17.delete()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r2 = 1
            com.adcolony.sdk.C6235c0.m15079b((com.adcolony.sdk.C6294f1) r5, (java.lang.String) r1, (boolean) r2)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            java.lang.String r2 = "file_sizes"
            com.adcolony.sdk.C6235c0.m15068a((com.adcolony.sdk.C6294f1) r5, (java.lang.String) r2, (com.adcolony.sdk.C6290e1) r12)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            com.adcolony.sdk.h0 r2 = r0.mo50733a(r5)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r2.mo50736c()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r0 = 1
            return r0
        L_0x00f7:
            com.adcolony.sdk.e0$a r2 = new com.adcolony.sdk.e0$a
            r2.<init>()
            java.lang.String r3 = "Out of memory error - disabling AdColony."
            com.adcolony.sdk.e0$a r2 = r2.mo50644a((java.lang.String) r3)
            com.adcolony.sdk.e0 r3 = com.adcolony.sdk.C6288e0.f13497h
            r2.mo50645a((com.adcolony.sdk.C6288e0) r3)
            com.adcolony.sdk.k r2 = com.adcolony.sdk.C6185a.m14887b()
            r3 = 1
            r2.mo50786b((boolean) r3)
            r2 = 0
            com.adcolony.sdk.C6235c0.m15079b((com.adcolony.sdk.C6294f1) r5, (java.lang.String) r1, (boolean) r2)
            com.adcolony.sdk.h0 r0 = r0.mo50733a(r5)
            r0.mo50736c()
            return r2
        L_0x011b:
            r2 = 0
        L_0x011c:
            com.adcolony.sdk.e0$a r3 = new com.adcolony.sdk.e0$a
            r3.<init>()
            java.lang.String r6 = "Failed to find or open ad unit bundle at path: "
            com.adcolony.sdk.e0$a r3 = r3.mo50644a((java.lang.String) r6)
            com.adcolony.sdk.e0$a r3 = r3.mo50644a((java.lang.String) r4)
            com.adcolony.sdk.e0 r4 = com.adcolony.sdk.C6288e0.f13498i
            r3.mo50645a((com.adcolony.sdk.C6288e0) r4)
            com.adcolony.sdk.C6235c0.m15079b((com.adcolony.sdk.C6294f1) r5, (java.lang.String) r1, (boolean) r2)
            com.adcolony.sdk.h0 r0 = r0.mo50733a(r5)
            r0.mo50736c()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C6455w.m15831h(com.adcolony.sdk.h0):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo51063b() {
        C6185a.m14886a("FileSystem.save", (C6327j0) new C6456a());
        C6185a.m14886a("FileSystem.delete", (C6327j0) new C6458b());
        C6185a.m14886a("FileSystem.listing", (C6327j0) new C6460c());
        C6185a.m14886a("FileSystem.load", (C6327j0) new C6462d());
        C6185a.m14886a("FileSystem.rename", (C6327j0) new C6464e());
        C6185a.m14886a("FileSystem.exists", (C6327j0) new C6466f());
        C6185a.m14886a("FileSystem.extract", (C6327j0) new C6468g());
        C6185a.m14886a("FileSystem.unpack_bundle", (C6327j0) new C6470h());
        C6185a.m14886a("FileSystem.create_directory", (C6327j0) new C6472i());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo51061a(String str, String str2, boolean z) throws IOException {
        BufferedWriter bufferedWriter;
        if (z) {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str), C6311h.f13542a));
        } else {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str)));
        }
        bufferedWriter.write(str2);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m15815a(C6312h0 h0Var, File file) {
        C6185a.m14887b().mo50815z().mo51059h();
        C6294f1 b = C6235c0.m15073b();
        if (mo51062a(file)) {
            C6235c0.m15079b(b, "success", true);
            h0Var.mo50733a(b).mo50736c();
            return true;
        }
        C6235c0.m15079b(b, "success", false);
        h0Var.mo50733a(b).mo50736c();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo51062a(File file) {
        try {
            if (!file.isDirectory()) {
                return file.delete();
            }
            if (file.list().length == 0) {
                return file.delete();
            }
            String[] list = file.list();
            if (list.length > 0) {
                return mo51062a(new File(file, list[0]));
            }
            if (file.list().length == 0) {
                return file.delete();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public StringBuilder mo51060a(String str, boolean z) throws IOException {
        BufferedReader bufferedReader;
        File file = new File(str);
        StringBuilder sb = new StringBuilder((int) file.length());
        if (z) {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath()), C6311h.f13542a));
        } else {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath())));
        }
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
                sb.append("\n");
            } else {
                bufferedReader.close();
                return sb;
            }
        }
    }

    /* renamed from: a */
    private boolean m15818a(String str) {
        return new File(str).exists();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m15814a(C6312h0 h0Var) {
        String h = C6235c0.m15087h(h0Var.mo50732a(), "filepath");
        C6185a.m14887b().mo50815z().mo51059h();
        C6294f1 b = C6235c0.m15073b();
        try {
            if (new File(h).mkdir()) {
                C6235c0.m15079b(b, "success", true);
                h0Var.mo50733a(b).mo50736c();
                return true;
            }
            C6235c0.m15079b(b, "success", false);
            return false;
        } catch (Exception unused) {
            C6235c0.m15079b(b, "success", false);
            h0Var.mo50733a(b).mo50736c();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15813a(Runnable runnable) {
        if (!this.f13891a.isEmpty() || this.f13892b) {
            this.f13891a.push(runnable);
            return;
        }
        this.f13892b = true;
        runnable.run();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15810a() {
        this.f13892b = false;
        if (!this.f13891a.isEmpty()) {
            this.f13892b = true;
            this.f13891a.removeLast().run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m15819b(C6312h0 h0Var) {
        String h = C6235c0.m15087h(h0Var.mo50732a(), "filepath");
        C6185a.m14887b().mo50815z().mo51059h();
        C6294f1 b = C6235c0.m15073b();
        try {
            boolean a = m15818a(h);
            C6235c0.m15079b(b, IronSourceConstants.EVENTS_RESULT, a);
            C6235c0.m15079b(b, "success", true);
            h0Var.mo50733a(b).mo50736c();
            return a;
        } catch (Exception e) {
            C6235c0.m15079b(b, IronSourceConstants.EVENTS_RESULT, false);
            C6235c0.m15079b(b, "success", false);
            h0Var.mo50733a(b).mo50736c();
            e.printStackTrace();
            return false;
        }
    }
}
