package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C4476M;
import com.ironsource.mediationsdk.C4487P;
import com.ironsource.mediationsdk.C4643m;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.model.C4655j;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p126a.C4533d;
import com.ironsource.mediationsdk.p126a.C4536g;
import com.ironsource.mediationsdk.p126a.C4537h;
import com.ironsource.mediationsdk.p136c.C4614a;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.InitializationListener;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
import com.ironsource.mediationsdk.sdk.OfferwallListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.ironsource.mediationsdk.utils.C4723k;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.p119d.C4370a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public abstract class IronSource {
    public static final String DataSource_MOPUB = "MoPub";

    public enum AD_UNIT {
        REWARDED_VIDEO("rewardedVideo"),
        INTERSTITIAL("interstitial"),
        OFFERWALL("offerwall"),
        BANNER("banner");
        

        /* renamed from: a */
        private String f10712a;

        private AD_UNIT(String str) {
            this.f10712a = str;
        }

        public final String toString() {
            return this.f10712a;
        }
    }

    public static void addImpressionDataListener(ImpressionDataListener impressionDataListener) {
        C4455H a = C4455H.m12683a();
        if (C4614a.m13485a(impressionDataListener, "addImpressionDataListener - listener is null")) {
            C4723k.m13824a().mo34190a(impressionDataListener);
            if (a.f10668z != null) {
                a.f10668z.mo34230a(impressionDataListener);
            }
            if (a.f10602A != null) {
                a.f10602A.mo34046a(impressionDataListener);
            }
            if (a.f10604C != null) {
                a.f10604C.mo33821a(impressionDataListener);
            }
            if (a.f10605D != null) {
                a.f10605D.mo33821a(impressionDataListener);
            }
            if (a.f10603B != null) {
                a.f10603B.mo34046a(impressionDataListener);
            }
            IronLog ironLog = IronLog.API;
            ironLog.info("add impression data listener to " + impressionDataListener.getClass().getSimpleName());
        }
    }

    public static void clearRewardedVideoServerParameters() {
        C4455H.m12683a().f10656n = null;
    }

    public static IronSourceBannerLayout createBanner(Activity activity, ISBannerSize iSBannerSize) {
        C4455H a = C4455H.m12683a();
        a.f10648f.log(IronSourceLogger.IronSourceTag.API, "createBanner()", 1);
        if (activity == null) {
            a.f10648f.log(IronSourceLogger.IronSourceTag.API, "createBanner() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new IronSourceBannerLayout(activity, iSBannerSize);
    }

    public static void destroyBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        C4455H a = C4455H.m12683a();
        a.f10648f.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            if (a.f10612K && a.f10603B != null) {
                C4487P p = a.f10603B;
                IronLog.INTERNAL.verbose("");
                C4487P.C44892 r2 = new C4643m.C4645b(ironSourceBannerLayout) {

                    /* renamed from: a */
                    private /* synthetic */ IronSourceBannerLayout f10864a;

                    /* renamed from: a */
                    public final void mo33537a(
/*
Method generation error in method: com.ironsource.mediationsdk.P.2.a():void, dex: classes3.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.mediationsdk.P.2.a():void, class status: UNLOADED
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
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
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

                    /* renamed from: a */
                    public final void mo33538a(
/*
Method generation error in method: com.ironsource.mediationsdk.P.2.a(java.lang.String):void, dex: classes3.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.mediationsdk.P.2.a(java.lang.String):void, class status: UNLOADED
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
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
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
                };
                if (ironSourceBannerLayout != null) {
                    if (!ironSourceBannerLayout.isDestroyed()) {
                        r2.mo33537a();
                        return;
                    }
                }
                Object[] objArr = new Object[1];
                objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
                r2.mo33538a(String.format("can't destroy banner - %s", objArr));
            } else if (a.f10647e != null) {
                a.f10647e.mo33936a(ironSourceBannerLayout);
            } else if (a.f10615N != null) {
                a.f10615N.mo34059a(ironSourceBannerLayout);
            }
        } catch (Throwable th) {
            a.f10648f.logException(IronSourceLogger.IronSourceTag.API, "destroyBanner()", th);
        }
    }

    public static String getAdvertiserId(Context context) {
        C4455H.m12683a();
        return C4455H.m12685a(context);
    }

    public static synchronized String getISDemandOnlyBiddingData() {
        String l;
        synchronized (IronSource.class) {
            l = C4455H.m12683a().mo33376l();
        }
        return l;
    }

    public static synchronized String getISDemandOnlyBiddingData(Context context) {
        String b;
        synchronized (IronSource.class) {
            b = C4455H.m12683a().mo33353b(context);
        }
        return b;
    }

    public static InterstitialPlacement getInterstitialPlacementInfo(String str) {
        return C4455H.m12683a().mo33373k(str);
    }

    public static void getOfferwallCredits() {
        C4455H a = C4455H.m12683a();
        a.f10648f.log(IronSourceLogger.IronSourceTag.API, "getOfferwallCredits()", 1);
        try {
            C4486O o = a.f10646d;
            if (o.f10830a != null) {
                o.f10830a.getOfferwallCredits();
            }
        } catch (Throwable th) {
            a.f10648f.logException(IronSourceLogger.IronSourceTag.API, "getOfferwallCredits()", th);
        }
    }

    public static Placement getRewardedVideoPlacementInfo(String str) {
        return C4455H.m12683a().mo33375l(str);
    }

    public static void init(Activity activity, String str) {
        init(activity, str, (AD_UNIT[]) null);
    }

    public static void init(Activity activity, String str, InitializationListener initializationListener) {
        init(activity, str, initializationListener, (AD_UNIT[]) null);
    }

    public static void init(Activity activity, String str, InitializationListener initializationListener, AD_UNIT... ad_unitArr) {
        C4455H.m12683a().mo33344a(activity, str, false, initializationListener, ad_unitArr);
    }

    public static void init(Activity activity, String str, AD_UNIT... ad_unitArr) {
        C4455H.m12683a().mo33344a(activity, str, false, (InitializationListener) null, ad_unitArr);
    }

    @Deprecated
    public static void initISDemandOnly(Activity activity, String str, AD_UNIT... ad_unitArr) {
        C4455H.m12683a().mo33343a((Context) activity, str, (InitializationListener) null, ad_unitArr);
    }

    public static void initISDemandOnly(Context context, String str, AD_UNIT... ad_unitArr) {
        C4455H.m12683a().mo33343a(context, str, (InitializationListener) null, ad_unitArr);
    }

    public static boolean isBannerPlacementCapped(String str) {
        return C4455H.m12683a().mo33379n(str);
    }

    public static boolean isISDemandOnlyInterstitialReady(String str) {
        return C4455H.m12683a().mo33370i(str);
    }

    public static boolean isISDemandOnlyRewardedVideoAvailable(String str) {
        return C4455H.m12683a().mo33366g(str);
    }

    public static boolean isInterstitialPlacementCapped(String str) {
        return C4455H.m12683a().mo33378m(str);
    }

    public static boolean isInterstitialReady() {
        return C4455H.m12683a().mo33365g();
    }

    public static boolean isOfferwallAvailable() {
        return C4455H.m12683a().mo33372j();
    }

    public static boolean isRewardedVideoAvailable() {
        return C4455H.m12683a().mo33357c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = com.ironsource.mediationsdk.C4455H.C44561.f10670b[r1 - 1];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isRewardedVideoPlacementCapped(java.lang.String r7) {
        /*
            com.ironsource.mediationsdk.H r0 = com.ironsource.mediationsdk.C4455H.m12683a()
            int r1 = r0.mo33380o(r7)
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x001c
            int[] r5 = com.ironsource.mediationsdk.C4455H.C44561.f10670b
            int r1 = r1 - r4
            r1 = r5[r1]
            if (r1 == r4) goto L_0x001a
            if (r1 == r2) goto L_0x001a
            r5 = 3
            if (r1 == r5) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            if (r1 == 0) goto L_0x003f
            boolean r5 = r0.f10663u
            boolean r6 = r0.f10606E
            int r0 = r0.f10613L
            org.json.JSONObject r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r5, r6, r0)
            if (r7 == 0) goto L_0x003a
            java.lang.Object[][] r5 = new java.lang.Object[r4][]
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r6 = "placement"
            r2[r3] = r6
            r2[r4] = r7
            r5[r3] = r2
            com.ironsource.mediationsdk.C4455H.m12695a((org.json.JSONObject) r0, (java.lang.Object[][]) r5)
        L_0x003a:
            r7 = 1110(0x456, float:1.555E-42)
            com.ironsource.mediationsdk.C4455H.m12687a((int) r7, (org.json.JSONObject) r0)
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.IronSource.isRewardedVideoPlacementCapped(java.lang.String):boolean");
    }

    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        C4455H.m12683a().mo33346a(ironSourceBannerLayout, "");
    }

    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout, String str) {
        C4455H.m12683a().mo33346a(ironSourceBannerLayout, str);
    }

    public static void loadISDemandOnlyBannerWithAdm(Activity activity, IronSourceBannerLayout ironSourceBannerLayout, String str, String str2) {
        C4455H.m12683a().mo33341a(activity, ironSourceBannerLayout, str, str2);
    }

    public static void loadISDemandOnlyInterstitial(Activity activity, String str) {
        C4455H.m12683a().mo33359d(activity, str, (String) null);
    }

    @Deprecated
    public static void loadISDemandOnlyInterstitial(String str) {
        C4455H.m12683a().mo33359d((Activity) null, str, (String) null);
    }

    public static void loadISDemandOnlyInterstitialWithAdm(Activity activity, String str, String str2) {
        C4455H.m12683a().mo33356c(activity, str, str2);
    }

    @Deprecated
    public static void loadISDemandOnlyInterstitialWithAdm(String str, String str2) {
        C4455H.m12683a().mo33356c((Activity) null, str, str2);
    }

    public static void loadISDemandOnlyRewardedVideo(Activity activity, String str) {
        C4455H.m12683a().mo33354b(activity, str, (String) null);
    }

    @Deprecated
    public static void loadISDemandOnlyRewardedVideo(String str) {
        C4455H.m12683a().mo33354b((Activity) null, str, (String) null);
    }

    public static void loadISDemandOnlyRewardedVideoWithAdm(Activity activity, String str, String str2) {
        C4455H.m12683a().mo33342a(activity, str, str2);
    }

    @Deprecated
    public static void loadISDemandOnlyRewardedVideoWithAdm(String str, String str2) {
        C4455H.m12683a().mo33342a((Activity) null, str, str2);
    }

    public static void loadInterstitial() {
        C4455H a = C4455H.m12683a();
        a.f10648f.log(IronSourceLogger.IronSourceTag.API, "loadInterstitial()", 1);
        try {
            if (a.f10664v) {
                a.f10648f.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", 3);
                C4665p.m13650a().mo34055a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", "Interstitial"));
            } else if (!a.f10666x) {
                a.f10648f.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadInterstitial()", 3);
                C4665p.m13650a().mo34055a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() must be called before loadInterstitial()", "Interstitial"));
            } else {
                C4476M.C4481a b = C4476M.m12866a().mo33491b();
                if (b == C4476M.C4481a.INIT_FAILED) {
                    a.f10648f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                    C4665p.m13650a().mo34055a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                } else if (b == C4476M.C4481a.INIT_IN_PROGRESS) {
                    if (C4476M.m12866a().mo33493c()) {
                        a.f10648f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                        C4665p.m13650a().mo34055a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                        return;
                    }
                    a.f10611J = true;
                } else if (!a.mo33368h()) {
                    a.f10648f.log(IronSourceLogger.IronSourceTag.API, "No interstitial configurations found", 3);
                    C4665p.m13650a().mo34055a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
                } else if (!a.f10609H) {
                    a.f10645c.mo33312c();
                } else {
                    if (a.f10610I) {
                        if (a.f10604C != null) {
                            a.f10604C.mo33826e();
                            return;
                        }
                    } else if (a.f10602A != null) {
                        a.f10602A.mo33567d();
                        return;
                    }
                    a.f10611J = true;
                }
            }
        } catch (Throwable th) {
            a.f10648f.logException(IronSourceLogger.IronSourceTag.API, "loadInterstitial()", th);
            C4665p.m13650a().mo34055a(AD_UNIT.INTERSTITIAL, new IronSourceError(510, th.getMessage()));
        }
    }

    public static void loadRewardedVideo() {
        C4455H a = C4455H.m12683a();
        a.f10648f.log(IronSourceLogger.IronSourceTag.API, "loadRewardedVideo()", 1);
        try {
            if (a.f10663u) {
                a.f10648f.log(IronSourceLogger.IronSourceTag.API, "Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", 3);
                C4665p.m13650a().mo34055a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else if (!a.f10607F) {
                a.f10648f.log(IronSourceLogger.IronSourceTag.API, "Rewarded Video is not initiated with manual load", 3);
            } else if (!a.f10665w) {
                a.f10648f.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadRewardedVideo()", 3);
                C4665p.m13650a().mo34055a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() must be called before loadRewardedVideo()", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else {
                C4476M.C4481a b = C4476M.m12866a().mo33491b();
                if (b == C4476M.C4481a.INIT_FAILED) {
                    a.f10648f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                    C4665p.m13650a().mo34055a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                } else if (b == C4476M.C4481a.INIT_IN_PROGRESS) {
                    if (C4476M.m12866a().mo33493c()) {
                        a.f10648f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                        C4665p.m13650a().mo34055a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                        return;
                    }
                    a.f10608G = true;
                } else if (!a.mo33361d()) {
                    a.f10648f.log(IronSourceLogger.IronSourceTag.API, "No rewarded video configurations found", 3);
                    C4665p.m13650a().mo34055a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                } else if (a.f10605D == null) {
                    a.f10608G = true;
                } else {
                    a.f10605D.mo33826e();
                }
            }
        } catch (Throwable th) {
            a.f10648f.logException(IronSourceLogger.IronSourceTag.API, "loadRewardedVideo()", th);
            C4665p.m13650a().mo34055a(AD_UNIT.REWARDED_VIDEO, new IronSourceError(510, th.getMessage()));
        }
    }

    public static void onPause(Activity activity) {
        C4455H a = C4455H.m12683a();
        try {
            a.f10648f.log(IronSourceLogger.IronSourceTag.API, "onPause()", 1);
            ContextProvider.getInstance().onPause(activity);
        } catch (Throwable th) {
            a.f10648f.logException(IronSourceLogger.IronSourceTag.API, "onPause()", th);
        }
    }

    public static void onResume(Activity activity) {
        C4455H a = C4455H.m12683a();
        try {
            a.f10648f.log(IronSourceLogger.IronSourceTag.API, "onResume()", 1);
            ContextProvider.getInstance().onResume(activity);
        } catch (Throwable th) {
            a.f10648f.logException(IronSourceLogger.IronSourceTag.API, "onResume()", th);
        }
    }

    public static void removeImpressionDataListener(ImpressionDataListener impressionDataListener) {
        C4455H a = C4455H.m12683a();
        if (C4614a.m13485a(impressionDataListener, "removeImpressionDataListener - listener is null")) {
            C4723k.m13824a().mo34193b(impressionDataListener);
            if (a.f10668z != null) {
                a.f10668z.mo34232b(impressionDataListener);
            }
            if (a.f10602A != null) {
                a.f10602A.mo34050b(impressionDataListener);
            }
            if (a.f10604C != null) {
                a.f10604C.mo33824b(impressionDataListener);
            }
            if (a.f10605D != null) {
                a.f10605D.mo33824b(impressionDataListener);
            }
            if (a.f10603B != null) {
                a.f10603B.mo34050b(impressionDataListener);
            }
            IronLog ironLog = IronLog.API;
            ironLog.info("remove impression data listener from " + impressionDataListener.getClass().getSimpleName());
        }
    }

    public static void removeInterstitialListener() {
        C4455H a = C4455H.m12683a();
        a.f10648f.log(IronSourceLogger.IronSourceTag.API, "removeInterstitialListener()", 1);
        a.f10649g.f11704b = null;
    }

    public static void removeOfferwallListener() {
        C4455H a = C4455H.m12683a();
        a.f10648f.log(IronSourceLogger.IronSourceTag.API, "removeOfferwallListener()", 1);
        a.f10649g.f11705c = null;
    }

    public static void removeRewardedVideoListener() {
        C4455H a = C4455H.m12683a();
        a.f10648f.log(IronSourceLogger.IronSourceTag.API, "removeRewardedVideoListener()", 1);
        a.f10649g.f11703a = null;
    }

    public static void setAdRevenueData(String str, JSONObject jSONObject) {
        C4455H a = C4455H.m12683a();
        if (C4614a.m13485a(jSONObject, "setAdRevenueData - impressionData is null") && C4614a.m13485a(str, "setAdRevenueData - dataSource is null")) {
            a.f10616O.mo33929a(str, jSONObject);
        }
    }

    public static void setAdaptersDebug(boolean z) {
        C4455H.m12683a();
        C4455H.m12696a(z);
    }

    public static void setConsent(boolean z) {
        C4455H.m12683a().mo33355b(z);
    }

    public static boolean setDynamicUserId(String str) {
        return C4455H.m12683a().mo33358c(str);
    }

    public static void setISDemandOnlyInterstitialListener(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        C4455H.m12683a();
        C4455H.m12690a(iSDemandOnlyInterstitialListener);
    }

    public static void setISDemandOnlyRewardedVideoListener(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        C4455H.m12683a();
        C4455H.m12691a(iSDemandOnlyRewardedVideoListener);
    }

    @Deprecated
    public static void setImpressionDataListener(ImpressionDataListener impressionDataListener) {
        C4455H a = C4455H.m12683a();
        IronLog.API.info("removing all impression data listeners");
        C4723k.m13824a().mo34194c();
        if (a.f10668z != null) {
            a.f10668z.mo34231b();
        }
        if (a.f10602A != null) {
            a.f10602A.mo34049b();
        }
        if (a.f10604C != null) {
            a.f10604C.mo33828g();
        }
        if (a.f10605D != null) {
            a.f10605D.mo33828g();
        }
        if (a.f10603B != null) {
            a.f10603B.mo34049b();
        }
        addImpressionDataListener(impressionDataListener);
    }

    public static void setInterstitialListener(InterstitialListener interstitialListener) {
        C4455H a = C4455H.m12683a();
        a.f10648f.log(IronSourceLogger.IronSourceTag.API, interstitialListener == null ? "setInterstitialListener(ISListener:null)" : "setInterstitialListener(ISListener)", 1);
        a.f10649g.f11704b = interstitialListener;
        C4439B.m12623a().mo33283a(interstitialListener);
        C4665p.m13650a().f11679a = interstitialListener;
    }

    public static void setLogListener(LogListener logListener) {
        C4455H a = C4455H.m12683a();
        if (logListener == null) {
            a.f10648f.log(IronSourceLogger.IronSourceTag.API, "setLogListener(LogListener:null)", 1);
            return;
        }
        a.f10650h.f11558c = logListener;
        IronSourceLoggerManager ironSourceLoggerManager = a.f10648f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "setLogListener(LogListener:" + logListener.getClass().getSimpleName() + ")", 1);
    }

    public static void setManualLoadRewardedVideo(RewardedVideoManualListener rewardedVideoManualListener) {
        C4455H.m12683a().mo33348a(rewardedVideoManualListener);
    }

    public static void setMediationSegment(String str) {
        C4455H a = C4455H.m12683a();
        try {
            a.f10648f.log(IronSourceLogger.IronSourceTag.API, a.f10628a + ":setMediationSegment(segment:" + str + ")", 1);
            C4370a aVar = new C4370a();
            C4455H.m12692a(str, aVar);
            if (aVar.mo33153a()) {
                a.f10654l = str;
            } else {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, aVar.mo33154b().toString(), 2);
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager = a.f10648f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.logException(ironSourceTag, a.f10628a + ":setMediationSegment(segment:" + str + ")", e);
        }
    }

    public static void setMediationType(String str) {
        C4455H.m12683a().mo33360d(str);
    }

    public static void setMetaData(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        C4455H.m12683a().mo33349a(str, (List<String>) arrayList);
    }

    public static void setMetaData(String str, List<String> list) {
        C4455H.m12683a().mo33349a(str, list);
    }

    public static void setNetworkData(String str, JSONObject jSONObject) {
        C4455H.m12683a();
        C4455H.m12693a(str, jSONObject);
    }

    public static void setOfferwallListener(OfferwallListener offerwallListener) {
        C4455H a = C4455H.m12683a();
        a.f10648f.log(IronSourceLogger.IronSourceTag.API, offerwallListener == null ? "setOfferwallListener(OWListener:null)" : "setOfferwallListener(OWListener)", 1);
        a.f10649g.f11705c = offerwallListener;
    }

    public static void setRewardedVideoListener(RewardedVideoListener rewardedVideoListener) {
        C4455H.m12683a().mo33347a(rewardedVideoListener);
    }

    public static void setRewardedVideoServerParameters(Map<String, String> map) {
        C4455H a = C4455H.m12683a();
        if (map != null) {
            try {
                if (map.size() != 0) {
                    a.f10648f.log(IronSourceLogger.IronSourceTag.API, a.f10628a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", 1);
                    a.f10656n = new HashMap(map);
                }
            } catch (Exception e) {
                IronSourceLoggerManager ironSourceLoggerManager = a.f10648f;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.logException(ironSourceTag, a.f10628a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", e);
            }
        }
    }

    public static void setSegment(IronSourceSegment ironSourceSegment) {
        C4455H a = C4455H.m12683a();
        a.f10661s = ironSourceSegment;
        if (a.f10605D != null) {
            a.f10605D.mo33819a(ironSourceSegment);
        }
        if (a.f10668z != null) {
            a.f10668z.mo34229a(ironSourceSegment);
        }
        if (a.f10604C != null) {
            a.f10604C.mo33819a(ironSourceSegment);
        }
        if (a.f10602A != null) {
            a.f10602A.mo34045a(ironSourceSegment);
        }
        if (a.f10603B != null) {
            a.f10603B.mo34045a(ironSourceSegment);
        }
        C4533d.m13173e().f11100v = a.f10661s;
        C4537h.m13193e().f11100v = a.f10661s;
        C4536g.f11131w.f11100v = a.f10661s;
    }

    public static void setSegmentListener(SegmentListener segmentListener) {
        C4455H a = C4455H.m12683a();
        if (a.f10649g != null) {
            a.f10649g.f11706d = segmentListener;
            C4476M.m12866a().f10796p = a.f10649g;
        }
    }

    public static void setUserId(String str) {
        C4455H.m12683a().mo33350a(str, true);
    }

    public static void shouldTrackNetworkState(Context context, boolean z) {
        C4455H a = C4455H.m12683a();
        a.f10659q = context;
        a.f10660r = Boolean.valueOf(z);
        if (a.f10609H) {
            if (a.f10610I) {
                if (a.f10604C != null) {
                    a.f10604C.mo33825b(z);
                }
            } else if (a.f10602A != null) {
                a.f10602A.mo33563a(z);
            }
        } else if (a.f10645c != null) {
            a.f10645c.mo33301a(context, z);
        }
        if (a.f10606E) {
            if (a.f10668z != null) {
                a.f10668z.mo33385a(context, z);
            }
        } else if (a.f10644b != null) {
            a.f10644b.mo33301a(context, z);
        }
    }

    public static void showISDemandOnlyInterstitial(String str) {
        C4455H a = C4455H.m12683a();
        IronSourceLoggerManager ironSourceLoggerManager = a.f10648f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showISDemandOnlyInterstitial() instanceId=" + str, 1);
        try {
            if (!a.f10664v) {
                a.f10648f.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in mediation mode. Use showInterstitial instead", 3);
            } else if (a.f10614M == null) {
                a.f10648f.log(IronSourceLogger.IronSourceTag.API, "Interstitial video was not initiated", 3);
                C4432A.m12618a().mo33252b(str, new IronSourceError(508, "Interstitial video was not initiated"));
            } else {
                C4670s sVar = a.f10614M;
                if (!sVar.f11699a.containsKey(str)) {
                    C4670s.m13675a((int) IronSourceConstants.IS_INSTANCE_NOT_FOUND, str);
                    C4432A.m12618a().mo33252b(str, ErrorBuilder.buildNonExistentInstanceError("Interstitial"));
                    return;
                }
                C4709t tVar = sVar.f11699a.get(str);
                sVar.mo34072a((int) IronSourceConstants.IS_INSTANCE_SHOW, tVar);
                tVar.mo34165a();
            }
        } catch (Exception e) {
            a.f10648f.logException(IronSourceLogger.IronSourceTag.API, "showISDemandOnlyInterstitial", e);
            C4432A.m12618a().mo33252b(str, ErrorBuilder.buildInitFailedError("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"));
        }
    }

    public static void showISDemandOnlyRewardedVideo(String str) {
        C4455H.m12683a().mo33364f(str);
    }

    public static void showInterstitial() {
        C4455H a = C4455H.m12683a();
        a.f10648f.log(IronSourceLogger.IronSourceTag.API, "showInterstitial()", 1);
        try {
            if (a.f10664v) {
                a.f10648f.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                a.f10649g.onInterstitialAdShowFailed(new IronSourceError(510, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"));
            } else if (!a.mo33368h()) {
                a.f10649g.onInterstitialAdShowFailed(ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"));
            } else {
                InterstitialPlacement e = a.mo33362e();
                if (e != null) {
                    a.mo33367h(e.getPlacementName());
                } else {
                    a.f10649g.onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_IS_EMPTY_DEFAULT_PLACEMENT, "showInterstitial error: empty default placement in response"));
                }
            }
        } catch (Exception e2) {
            a.f10648f.logException(IronSourceLogger.IronSourceTag.API, "showInterstitial()", e2);
            a.f10649g.onInterstitialAdShowFailed(new IronSourceError(510, e2.getMessage()));
        }
    }

    public static void showInterstitial(String str) {
        C4455H.m12683a().mo33367h(str);
    }

    public static void showOfferwall() {
        C4455H a = C4455H.m12683a();
        try {
            a.f10648f.log(IronSourceLogger.IronSourceTag.API, "showOfferwall()", 1);
            if (!a.mo33369i()) {
                a.f10649g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            C4655j a2 = a.f10651i.f11953c.f11612c.mo34031a();
            if (a2 != null) {
                a.mo33371j(a2.f11630b);
            }
        } catch (Exception e) {
            a.f10648f.logException(IronSourceLogger.IronSourceTag.API, "showOfferwall()", e);
            a.f10649g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
        }
    }

    public static void showOfferwall(String str) {
        C4455H.m12683a().mo33371j(str);
    }

    public static void showRewardedVideo() {
        C4455H a = C4455H.m12683a();
        if (!a.mo33361d()) {
            a.f10649g.onRewardedVideoAdShowFailed(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            a.f10648f.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", 3);
            return;
        }
        Placement b = a.mo33352b();
        if (b == null) {
            a.f10648f.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo error: empty default placement in response", 3);
            a.f10649g.onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, "showRewardedVideo error: empty default placement in response"));
            return;
        }
        a.mo33363e(b.getPlacementName());
    }

    public static void showRewardedVideo(String str) {
        C4455H.m12683a().mo33363e(str);
    }
}
