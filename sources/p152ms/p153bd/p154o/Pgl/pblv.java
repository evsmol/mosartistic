package p152ms.p153bd.p154o.Pgl;

import android.content.Context;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p152ms.p153bd.p154o.Pgl.pblu;

/* renamed from: ms.bd.o.Pgl.pblv */
public class pblv {

    /* renamed from: a */
    protected final Set<String> f13008a = new HashSet();

    /* renamed from: b */
    protected final pblu.pblb f13009b;

    /* renamed from: c */
    protected final pblu.pgla f13010c;

    /* renamed from: ms.bd.o.Pgl.pblv$pgla */
    class pgla implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f13011a;

        /* renamed from: b */
        final /* synthetic */ String f13012b;

        /* renamed from: c */
        final /* synthetic */ String f13013c;

        /* renamed from: d */
        final /* synthetic */ pblu.pblc f13014d;

        pgla(Context context, String str, String str2, pblu.pblc pblc) {
            this.f13011a = context;
            this.f13012b = str;
            this.f13013c = str2;
            this.f13014d = pblc;
        }

        public void run() {
            try {
                pblv.this.m14658b(this.f13011a, this.f13012b, this.f13013c);
                this.f13014d.mo42224a();
            } catch (UnsatisfiedLinkError | pblt e) {
                this.f13014d.mo42225a(e);
            }
        }
    }

    protected pblv(pblu.pblb pblb, pblu.pgla pgla2) {
        this.f13009b = pblb;
        this.f13010c = pgla2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a8, code lost:
        if (r2.length > 0) goto L_0x00c4;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m14658b(android.content.Context r15, java.lang.String r16, java.lang.String r17) {
        /*
            r14 = this;
            r7 = r14
            r8 = r16
            java.util.Set<java.lang.String> r0 = r7.f13008a
            boolean r0 = r0.contains(r8)
            r9 = 0
            r10 = 1
            if (r0 == 0) goto L_0x0019
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r9] = r8
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "%s already loaded previously!"
            java.lang.String.format(r1, r2, r0)
            return
        L_0x0019:
            r11 = 0
            r12 = 2
            ms.bd.o.Pgl.pblu$pblb r0 = r7.f13009b     // Catch:{ UnsatisfiedLinkError -> 0x0038 }
            ms.bd.o.Pgl.pblx r0 = (p152ms.p153bd.p154o.Pgl.pblx) r0     // Catch:{ UnsatisfiedLinkError -> 0x0038 }
            if (r0 == 0) goto L_0x0037
            java.lang.System.loadLibrary(r16)     // Catch:{ UnsatisfiedLinkError -> 0x0038 }
            java.util.Set<java.lang.String> r0 = r7.f13008a     // Catch:{ UnsatisfiedLinkError -> 0x0038 }
            r0.add(r8)     // Catch:{ UnsatisfiedLinkError -> 0x0038 }
            java.lang.String r0 = "%s (%s) was loaded normally!"
            java.lang.Object[] r1 = new java.lang.Object[r12]     // Catch:{ UnsatisfiedLinkError -> 0x0038 }
            r1[r9] = r8     // Catch:{ UnsatisfiedLinkError -> 0x0038 }
            r1[r10] = r17     // Catch:{ UnsatisfiedLinkError -> 0x0038 }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ UnsatisfiedLinkError -> 0x0038 }
            java.lang.String.format(r2, r0, r1)     // Catch:{ UnsatisfiedLinkError -> 0x0038 }
            return
        L_0x0037:
            throw r11     // Catch:{ UnsatisfiedLinkError -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r1[r9] = r0
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = "Loading the library normally failed: %s"
            java.lang.String.format(r0, r2, r1)
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r9] = r8
            r0[r10] = r17
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "%s (%s) was not loaded normally, re-linking..."
            java.lang.String.format(r1, r2, r0)
            java.io.File r0 = r14.mo42227a(r15, r16, r17)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x0061
            goto L_0x00d5
        L_0x0061:
            java.io.File r1 = r14.mo42226a(r15)
            java.io.File r2 = r14.mo42227a(r15, r16, r17)
            ms.bd.o.Pgl.pblu$pblb r3 = r7.f13009b
            ms.bd.o.Pgl.pblx r3 = (p152ms.p153bd.p154o.Pgl.pblx) r3
            java.lang.String r3 = r3.mo42231a(r8)
            ms.bd.o.Pgl.pblw r4 = new ms.bd.o.Pgl.pblw
            r4.<init>(r14, r3)
            java.io.File[] r1 = r1.listFiles(r4)
            if (r1 != 0) goto L_0x007d
            goto L_0x0097
        L_0x007d:
            int r3 = r1.length
            r4 = 0
        L_0x007f:
            if (r4 >= r3) goto L_0x0097
            r5 = r1[r4]
            java.lang.String r6 = r5.getAbsolutePath()
            java.lang.String r13 = r2.getAbsolutePath()
            boolean r6 = r6.equals(r13)
            if (r6 != 0) goto L_0x0094
            r5.delete()
        L_0x0094:
            int r4 = r4 + 1
            goto L_0x007f
        L_0x0097:
            ms.bd.o.Pgl.pblu$pgla r1 = r7.f13010c
            ms.bd.o.Pgl.pblu$pblb r2 = r7.f13009b
            ms.bd.o.Pgl.pblx r2 = (p152ms.p153bd.p154o.Pgl.pblx) r2
            if (r2 == 0) goto L_0x00f6
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r2 < r3) goto L_0x00ab
            java.lang.String[] r2 = android.os.Build.SUPPORTED_ABIS
            int r3 = r2.length
            if (r3 <= 0) goto L_0x00ab
            goto L_0x00c4
        L_0x00ab:
            java.lang.String r2 = android.os.Build.CPU_ABI2
            boolean r2 = p152ms.p153bd.p154o.Pgl.pblu.m14654a(r2)
            if (r2 != 0) goto L_0x00be
            java.lang.String[] r2 = new java.lang.String[r12]
            java.lang.String r3 = android.os.Build.CPU_ABI
            r2[r9] = r3
            java.lang.String r3 = android.os.Build.CPU_ABI2
            r2[r10] = r3
            goto L_0x00c4
        L_0x00be:
            java.lang.String[] r2 = new java.lang.String[r10]
            java.lang.String r3 = android.os.Build.CPU_ABI
            r2[r9] = r3
        L_0x00c4:
            r3 = r2
            ms.bd.o.Pgl.pblu$pblb r2 = r7.f13009b
            ms.bd.o.Pgl.pblx r2 = (p152ms.p153bd.p154o.Pgl.pblx) r2
            java.lang.String r4 = r2.mo42231a(r8)
            ms.bd.o.Pgl.pbls r1 = (p152ms.p153bd.p154o.Pgl.pbls) r1
            r2 = r15
            r5 = r0
            r6 = r14
            r1.mo42223a(r2, r3, r4, r5, r6)
        L_0x00d5:
            ms.bd.o.Pgl.pblu$pblb r1 = r7.f13009b
            java.lang.String r0 = r0.getAbsolutePath()
            ms.bd.o.Pgl.pblx r1 = (p152ms.p153bd.p154o.Pgl.pblx) r1
            if (r1 == 0) goto L_0x00f5
            java.lang.System.load(r0)
            java.util.Set<java.lang.String> r0 = r7.f13008a
            r0.add(r8)
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r9] = r8
            r0[r10] = r17
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "%s (%s) was re-linked!"
            java.lang.String.format(r1, r2, r0)
            return
        L_0x00f5:
            throw r11
        L_0x00f6:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p152ms.p153bd.p154o.Pgl.pblv.m14658b(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public File mo42226a(Context context) {
        return context.getDir("lib", 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public File mo42227a(Context context, String str, String str2) {
        String a = ((pblx) this.f13009b).mo42231a(str);
        if (pblu.m14654a(str2)) {
            return new File(mo42226a(context), a);
        }
        File a2 = mo42226a(context);
        return new File(a2, a + "." + str2);
    }

    /* renamed from: a */
    public void mo42228a(Context context, String str, String str2, pblu.pblc pblc) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        } else if (!pblu.m14654a(str)) {
            String.format(Locale.US, "Beginning load of %s...", new Object[]{str});
            if (pblc == null) {
                m14658b(context, str, str2);
            } else {
                new Thread(new pgla(context, str, str2, pblc)).start();
            }
        } else {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
    }
}
