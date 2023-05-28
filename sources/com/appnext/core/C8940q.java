package com.appnext.core;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.appnext.core.C8906e;
import com.appodeal.ads.adapters.admob.BuildConfig;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: com.appnext.core.q */
public final class C8940q {

    /* renamed from: y */
    private static final String f22663y = "error_no_market";
    /* access modifiers changed from: private */
    public String banner = "";
    /* access modifiers changed from: private */
    public C8906e click;
    /* access modifiers changed from: private */
    public Context context;
    /* access modifiers changed from: private */

    /* renamed from: gj */
    public String f22664gj = "";
    /* access modifiers changed from: private */
    public String guid = "";
    /* access modifiers changed from: private */

    /* renamed from: hH */
    public C8923h f22665hH;
    /* access modifiers changed from: private */

    /* renamed from: hI */
    public C8949a f22666hI;
    /* access modifiers changed from: private */

    /* renamed from: hJ */
    public C8906e.C8915a f22667hJ = new C8906e.C8915a() {
        public final void onMarket(String str) {
            AppnextAd f = C8940q.this.f22666hI.mo58262f();
            C8874Ad e = C8940q.this.f22666hI.mo58261e();
            if (e != null && f != null && C8940q.this.context != null) {
                if (!C8917f.m26946c(C8940q.this.context, f.getAdPackage())) {
                    try {
                        if (!str.startsWith("market://details?id=" + f.getAdPackage()) && !str.startsWith("http")) {
                            C8940q.this.mo59058b(C8917f.m26950m("admin.appnext.com", "applink"), f.getBannerID(), e.getPlacementID(), e.getTID(), str, "SetROpenV1");
                        }
                    } catch (Throwable unused) {
                    }
                    if (C8940q.this.f22665hH == null) {
                        C8923h unused2 = C8940q.this.f22665hH = new C8923h();
                    }
                    C8923h h = C8940q.this.f22665hH;
                    String adPackage = f.getAdPackage();
                    String m = C8917f.m26950m("admin.appnext.com", "applink");
                    String bannerID = f.getBannerID();
                    String placementID = e.getPlacementID();
                    String tid = e.getTID();
                    String vid = e.getVID();
                    String auid = e.getAUID();
                    h.f22626am = adPackage;
                    h.f22627an = str;
                    h.guid = m;
                    h.f22628ao = bannerID;
                    h.f22629ap = placementID;
                    h.f22633at = null;
                    h.f22630aq = tid;
                    h.f22631ar = vid;
                    h.f22632as = auid;
                    C8940q.this.f22665hH.mo59039t(C8940q.this.context.getApplicationContext());
                } else if (str.startsWith("market://")) {
                    try {
                        Intent launchIntentForPackage = C8940q.this.context.getPackageManager().getLaunchIntentForPackage(f.getAdPackage());
                        launchIntentForPackage.addFlags(268435456);
                        C8940q.this.context.startActivity(launchIntentForPackage);
                    } catch (Throwable unused3) {
                        C8940q.this.f22666hI.report("error_no_market");
                    }
                } else {
                    try {
                        C8940q.m27010d(C8940q.this, str);
                    } catch (Throwable unused4) {
                        C8940q.this.f22666hI.report("error_no_market");
                    }
                }
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(5:6|7|8|9|20)(1:(1:11)(5:12|13|14|15|17))) */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0087 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x003a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0074 */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:6:0x0052 A[SYNTHETIC, Splitter:B:6:0x0052] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void error(java.lang.String r8) {
            /*
                r7 = this;
                com.appnext.core.q r0 = com.appnext.core.C8940q.this     // Catch:{ all -> 0x003a }
                java.lang.String r1 = "admin.appnext.com"
                java.lang.String r2 = "applink"
                java.lang.String r1 = com.appnext.core.C8917f.m26950m(r1, r2)     // Catch:{ all -> 0x003a }
                com.appnext.core.q r2 = com.appnext.core.C8940q.this     // Catch:{ all -> 0x003a }
                com.appnext.core.q$a r2 = r2.f22666hI     // Catch:{ all -> 0x003a }
                com.appnext.core.AppnextAd r2 = r2.mo58262f()     // Catch:{ all -> 0x003a }
                java.lang.String r2 = r2.getBannerID()     // Catch:{ all -> 0x003a }
                com.appnext.core.q r3 = com.appnext.core.C8940q.this     // Catch:{ all -> 0x003a }
                com.appnext.core.q$a r3 = r3.f22666hI     // Catch:{ all -> 0x003a }
                com.appnext.core.Ad r3 = r3.mo58261e()     // Catch:{ all -> 0x003a }
                java.lang.String r3 = r3.getPlacementID()     // Catch:{ all -> 0x003a }
                com.appnext.core.q r4 = com.appnext.core.C8940q.this     // Catch:{ all -> 0x003a }
                com.appnext.core.q$a r4 = r4.f22666hI     // Catch:{ all -> 0x003a }
                com.appnext.core.Ad r4 = r4.mo58261e()     // Catch:{ all -> 0x003a }
                java.lang.String r4 = r4.getTID()     // Catch:{ all -> 0x003a }
                java.lang.String r6 = "SetDOpenV1"
                r5 = r8
                r0.mo59058b(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x003a }
            L_0x003a:
                com.appnext.core.q r0 = com.appnext.core.C8940q.this     // Catch:{ all -> 0x0090 }
                com.appnext.core.q$a r0 = r0.f22666hI     // Catch:{ all -> 0x0090 }
                com.appnext.core.p r0 = r0.mo58263g()     // Catch:{ all -> 0x0090 }
                java.lang.String r1 = "urlApp_protection"
                java.lang.String r0 = r0.get(r1)     // Catch:{ all -> 0x0090 }
                boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ all -> 0x0090 }
                java.lang.String r1 = "error_no_market"
                if (r0 == 0) goto L_0x007e
                com.appnext.core.q r8 = com.appnext.core.C8940q.this     // Catch:{ all -> 0x0074 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
                java.lang.String r2 = "market://details?id="
                r0.<init>(r2)     // Catch:{ all -> 0x0074 }
                com.appnext.core.q r2 = com.appnext.core.C8940q.this     // Catch:{ all -> 0x0074 }
                com.appnext.core.q$a r2 = r2.f22666hI     // Catch:{ all -> 0x0074 }
                com.appnext.core.AppnextAd r2 = r2.mo58262f()     // Catch:{ all -> 0x0074 }
                java.lang.String r2 = r2.getAdPackage()     // Catch:{ all -> 0x0074 }
                r0.append(r2)     // Catch:{ all -> 0x0074 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0074 }
                com.appnext.core.C8940q.m27010d(r8, r0)     // Catch:{ all -> 0x0074 }
                goto L_0x0090
            L_0x0074:
                com.appnext.core.q r8 = com.appnext.core.C8940q.this     // Catch:{ all -> 0x0090 }
                com.appnext.core.q$a r8 = r8.f22666hI     // Catch:{ all -> 0x0090 }
                r8.report(r1)     // Catch:{ all -> 0x0090 }
                goto L_0x0090
            L_0x007e:
                if (r8 != 0) goto L_0x0081
                return
            L_0x0081:
                com.appnext.core.q r0 = com.appnext.core.C8940q.this     // Catch:{ all -> 0x0087 }
                com.appnext.core.C8940q.m27010d(r0, r8)     // Catch:{ all -> 0x0087 }
                goto L_0x0090
            L_0x0087:
                com.appnext.core.q r8 = com.appnext.core.C8940q.this     // Catch:{ all -> 0x0090 }
                com.appnext.core.q$a r8 = r8.f22666hI     // Catch:{ all -> 0x0090 }
                r8.report(r1)     // Catch:{ all -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.C8940q.C89483.error(java.lang.String):void");
        }
    };

    /* renamed from: com.appnext.core.q$a */
    public interface C8949a {
        /* renamed from: e */
        C8874Ad mo58261e();

        /* renamed from: f */
        AppnextAd mo58262f();

        /* renamed from: g */
        C8936p mo58263g();

        void report(String str);
    }

    public C8940q(Context context2, C8949a aVar) {
        this.context = context2;
        this.click = C8906e.m26903k(context2);
        this.f22666hI = aVar;
    }

    /* renamed from: b */
    public final void mo59058b(String str, String str2, String str3, String str4, String str5, String str6) {
        C8906e eVar = this.click;
        if (eVar != null) {
            new Thread(new Runnable(str, str2, str3, str4, str5, str6) {
                public final void run(
/*
Method generation error in method: com.appnext.core.e.7.run():void, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appnext.core.e.7.run():void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            }).start();
        }
    }

    /* renamed from: a */
    public final void mo59055a(AppnextAd appnextAd, String str, C8906e.C8915a aVar) {
        C8906e eVar = this.click;
        if (eVar != null) {
            new Thread(new Runnable(appnextAd) {
                public final void run(
/*
Method generation error in method: com.appnext.core.e.6.run():void, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appnext.core.e.6.run():void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            }).start();
        }
    }

    /* renamed from: b */
    public final void mo59057b(final AppnextAd appnextAd, final String str, final C8906e.C8915a aVar) {
        if (this.click != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    try {
                        C8940q.this.click.mo59002a(appnextAd.getAppURL(), appnextAd.getMarketUrl(), str + "&device=" + C8917f.m26938be() + "&ox=0", appnextAd.getBannerID(), new C8906e.C8915a() {
                            public final void onMarket(String str) {
                                StringBuilder sb = new StringBuilder("Vta - success - ");
                                sb.append(appnextAd.getAdTitle());
                                sb.append(" -- ");
                                sb.append(appnextAd.getBannerID());
                                String unused = C8940q.this.f22664gj = str;
                                String unused2 = C8940q.this.guid = C8917f.m26950m("admin.appnext.com", "applink");
                                String unused3 = C8940q.this.banner = appnextAd.getBannerID();
                                if (aVar != null) {
                                    aVar.onMarket(str);
                                }
                            }

                            public final void error(String str) {
                                StringBuilder sb = new StringBuilder("Vta - failed - ");
                                sb.append(appnextAd.getAdTitle());
                                sb.append(" -- ");
                                sb.append(appnextAd.getBannerID());
                                String unused = C8940q.this.f22664gj = "";
                                String unused2 = C8940q.this.guid = "";
                                String unused3 = C8940q.this.banner = "";
                                if (aVar != null) {
                                    aVar.error(str);
                                }
                            }
                        });
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo59056a(AppnextAd appnextAd, String str, String str2, C8906e.C8915a aVar) {
        final String str3 = str;
        final C8906e.C8915a aVar2 = aVar;
        final AppnextAd appnextAd2 = appnextAd;
        final String str4 = str2;
        new Thread(new Runnable() {
            public final void run() {
                if (!C8940q.this.mo59059bo()) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            C8906e.C8915a b = C8940q.this.f22667hJ;
                            b.error(str3 + "&device=" + C8917f.m26938be());
                            if (aVar2 != null) {
                                C8906e.C8915a aVar = aVar2;
                                aVar.error(str3 + "&device=" + C8917f.m26938be());
                            }
                        }
                    });
                } else if (appnextAd2 != null) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            if (C8940q.this.f22664gj.equals("") || !C8940q.this.f22664gj.contains(appnextAd2.getAdPackage())) {
                                new StringBuilder("click url ").append(str3);
                                String str = str3 + "&device=" + C8917f.m26938be();
                                String webview = appnextAd2.getWebview();
                                char c = 65535;
                                switch (webview.hashCode()) {
                                    case 48:
                                        if (webview.equals(BuildConfig.ADAPTER_VERSION)) {
                                            c = 2;
                                            break;
                                        }
                                        break;
                                    case 49:
                                        if (webview.equals("1")) {
                                            c = 1;
                                            break;
                                        }
                                        break;
                                    case 50:
                                        if (webview.equals("2")) {
                                            c = 0;
                                            break;
                                        }
                                        break;
                                }
                                if (c == 0) {
                                    try {
                                        C8940q.this.f22667hJ.onMarket(str);
                                        if (aVar2 != null) {
                                            aVar2.onMarket(str);
                                        }
                                    } catch (Throwable unused) {
                                    }
                                } else if (c == 1) {
                                    Intent intent = new Intent(C8940q.this.context, ResultActivity.class);
                                    intent.putExtra("url", str);
                                    intent.putExtra("title", appnextAd2.getAdTitle());
                                    intent.addFlags(268435456);
                                    C8940q.this.context.startActivity(intent);
                                    if (aVar2 != null) {
                                        aVar2.onMarket(str);
                                    }
                                } else if (C8940q.this.click != null) {
                                    C8940q.this.click.mo59003a(appnextAd2.getAppURL(), appnextAd2.getMarketUrl(), str, appnextAd2.getBannerID(), (C8906e.C8915a) new C8906e.C8915a() {
                                        public final void onMarket(String str) {
                                            C8940q.this.f22667hJ.onMarket(str);
                                            if (aVar2 != null) {
                                                aVar2.onMarket(str);
                                            }
                                        }

                                        public final void error(String str) {
                                            C8940q.this.f22667hJ.error(str);
                                            if (aVar2 != null) {
                                                aVar2.error(str);
                                            }
                                        }
                                    }, 1000 * Long.parseLong(C8940q.this.f22666hI.mo58263g().get("resolve_timeout")));
                                }
                            } else {
                                new Thread(new Runnable() {
                                    public final void run() {
                                        try {
                                            C8917f.m26919a("https://admin.appnext.com/AdminService.asmx/SetRL?guid=" + C8940q.this.guid + "&bid=" + C8940q.this.banner + "&pid=" + str4, (HashMap<String, String>) null);
                                        } catch (Throwable unused) {
                                        }
                                    }
                                }).start();
                                C8940q.this.f22667hJ.onMarket(C8940q.this.f22664gj);
                                if (aVar2 != null) {
                                    aVar2.onMarket(C8940q.this.f22664gj);
                                }
                                String unused2 = C8940q.this.f22664gj = "";
                            }
                        }
                    });
                }
            }
        }).start();
    }

    private void openLink(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        this.context.startActivity(intent);
    }

    /* renamed from: e */
    public final void mo59061e(AppnextAd appnextAd) {
        try {
            if (this.click != null) {
                this.click.mo59006e(appnextAd);
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bo */
    public final boolean mo59059bo() {
        try {
            if (this.context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) != 0) {
                C8917f.m26919a("http://www.appnext.com/myid.html", (HashMap<String, String>) null);
                return true;
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return true;
            }
            throw new IOException();
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void destroy() {
        try {
            if (this.f22665hH != null) {
                this.f22665hH.mo58213a(this.context);
            }
            this.f22665hH = null;
        } catch (Throwable unused) {
        }
        this.context = null;
        if (this.click != null) {
            this.click = null;
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m27010d(C8940q qVar, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        qVar.context.startActivity(intent);
    }
}
