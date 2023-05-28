package com.appodeal.ads;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.appnext.base.p264b.C8856i;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.networking.cache.C9368c;
import com.appodeal.ads.regulator.C9458h;
import com.appodeal.ads.regulator.C9459i;
import com.appodeal.ads.regulator.UserConsent;
import com.appodeal.ads.storage.C9529a;
import com.appodeal.ads.storage.C9562o;
import com.appodeal.advertising.AdvertisingInfo;
import com.appodeal.consent.Consent;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.x2 */
public final class C9700x2 {

    /* renamed from: a */
    public static final C9700x2 f24534a = new C9700x2();

    /* renamed from: b */
    public static final Lazy f24535b = LazyKt.lazy(C9704d.f24548a);

    /* renamed from: c */
    public static final Lazy f24536c = LazyKt.lazy(C9703c.f24547a);

    /* renamed from: d */
    public static final Lazy f24537d = LazyKt.lazy(C9702b.f24546a);

    /* renamed from: e */
    public static JSONObject f24538e;

    /* renamed from: f */
    public static AdvertisingInfo.AdvertisingProfile f24539f = AdvertisingInfo.DefaultAdvertisingProfile.INSTANCE;

    /* renamed from: g */
    public static final Set<String> f24540g;

    /* renamed from: h */
    public static final HashSet f24541h;

    @DebugMetadata(mo38568c = "com.appodeal.ads.PersonalData", mo38569f = "PersonalData.kt", mo38570l = {58}, mo38571m = "init")
    /* renamed from: com.appodeal.ads.x2$a */
    public static final class C9701a extends ContinuationImpl {

        /* renamed from: a */
        public C9700x2 f24542a;

        /* renamed from: b */
        public /* synthetic */ Object f24543b;

        /* renamed from: c */
        public final /* synthetic */ C9700x2 f24544c;

        /* renamed from: d */
        public int f24545d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9701a(C9700x2 x2Var, Continuation<? super C9701a> continuation) {
            super(continuation);
            this.f24544c = x2Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f24543b = obj;
            this.f24545d |= RecyclerView.UNDEFINED_DURATION;
            return this.f24544c.mo61222a((String) null, (Context) null, (AdvertisingInfo.AdvertisingProfile) null, this);
        }
    }

    /* renamed from: com.appodeal.ads.x2$b */
    public static final class C9702b extends Lambda implements Function0<C9368c> {

        /* renamed from: a */
        public static final C9702b f24546a = new C9702b();

        public C9702b() {
            super(0);
        }

        public final Object invoke() {
            C9700x2.f24534a.getClass();
            return new C9368c("init_response", C9700x2.m28506b());
        }
    }

    /* renamed from: com.appodeal.ads.x2$c */
    public static final class C9703c extends Lambda implements Function0<C9562o> {

        /* renamed from: a */
        public static final C9703c f24547a = new C9703c();

        public C9703c() {
            super(0);
        }

        public final Object invoke() {
            return C9562o.f24251b;
        }
    }

    /* renamed from: com.appodeal.ads.x2$d */
    public static final class C9704d extends Lambda implements Function0<C9459i> {

        /* renamed from: a */
        public static final C9704d f24548a = new C9704d();

        public C9704d() {
            super(0);
        }

        public final Object invoke() {
            return new C9459i();
        }
    }

    static {
        Set<String> of = SetsKt.setOf("lt", C8856i.f22445fC, "lon", "ad_stats", "user_settings", Constants.INAPPS);
        f24540g = of;
        f24541h = new HashSet(of);
    }

    /* renamed from: a */
    public static final String m28499a() {
        return f24539f.getId();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m28504a(com.appodeal.advertising.AdvertisingInfo.AdvertisingProfile r4) {
        /*
            java.lang.String r0 = "applyAdvertisingProfile"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            com.appodeal.advertising.AdvertisingInfo$AdvertisingProfile r0 = f24539f
            boolean r0 = r0.isLimitAdTrackingEnabled()
            boolean r1 = r4.isLimitAdTrackingEnabled()
            r2 = 0
            if (r0 != r1) goto L_0x0024
            com.appodeal.advertising.AdvertisingInfo$AdvertisingProfile r0 = f24539f
            java.lang.String r0 = r0.getId()
            java.lang.String r1 = r4.getId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 != 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            return r2
        L_0x0024:
            com.appodeal.ads.x2 r0 = f24534a
            r0.getClass()
            com.appodeal.ads.regulator.h r1 = m28511e()
            boolean r1 = r1.mo60665a()
            r3 = 1
            if (r1 == 0) goto L_0x003c
            boolean r1 = m28513g()
            if (r1 != 0) goto L_0x003c
            r1 = 1
            goto L_0x003d
        L_0x003c:
            r1 = 0
        L_0x003d:
            if (r1 != 0) goto L_0x0057
            com.appodeal.ads.regulator.h r1 = m28511e()
            boolean r1 = r1.mo60675g()
            if (r1 == 0) goto L_0x0051
            boolean r1 = m28513g()
            if (r1 != 0) goto L_0x0051
            r1 = 1
            goto L_0x0052
        L_0x0051:
            r1 = 0
        L_0x0052:
            if (r1 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r1 = 0
            goto L_0x0058
        L_0x0057:
            r1 = 1
        L_0x0058:
            f24539f = r4
            r0.getClass()
            com.appodeal.ads.regulator.h r4 = m28511e()
            boolean r4 = r4.mo60665a()
            if (r4 == 0) goto L_0x006f
            boolean r4 = m28513g()
            if (r4 != 0) goto L_0x006f
            r4 = 1
            goto L_0x0070
        L_0x006f:
            r4 = 0
        L_0x0070:
            if (r4 != 0) goto L_0x008a
            com.appodeal.ads.regulator.h r4 = m28511e()
            boolean r4 = r4.mo60675g()
            if (r4 == 0) goto L_0x0084
            boolean r4 = m28513g()
            if (r4 != 0) goto L_0x0084
            r4 = 1
            goto L_0x0085
        L_0x0084:
            r4 = 0
        L_0x0085:
            if (r4 == 0) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            r4 = 0
            goto L_0x008b
        L_0x008a:
            r4 = 1
        L_0x008b:
            if (r1 == r4) goto L_0x008e
            r2 = 1
        L_0x008e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9700x2.m28504a(com.appodeal.advertising.AdvertisingInfo$AdvertisingProfile):boolean");
    }

    /* renamed from: a */
    public static final boolean m28505a(String str) {
        return CollectionsKt.contains(f24541h, str);
    }

    /* renamed from: b */
    public static C9529a m28506b() {
        return (C9529a) f24536c.getValue();
    }

    /* renamed from: b */
    public static final void m28507b(JSONObject jSONObject) {
        C9234j4 j4Var = C9234j4.f23194a;
        Intrinsics.checkNotNullParameter(j4Var, "restrictedData");
        if (j4Var.isUserProtected() && jSONObject != null) {
            Iterator it = f24541h.iterator();
            while (it.hasNext()) {
                jSONObject.remove((String) it.next());
            }
        }
    }

    /* renamed from: c */
    public static final Boolean m28508c() {
        f24534a.getClass();
        return m28511e().mo60672d();
    }

    /* renamed from: c */
    public static final void m28509c(JSONObject jSONObject) {
        f24538e = jSONObject;
        f24534a.getClass();
        C9529a b = m28506b();
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "it.toString()");
        b.mo60774b(jSONObject2);
    }

    /* renamed from: d */
    public static final Consent m28510d() {
        f24534a.getClass();
        return m28511e().mo60671c();
    }

    /* renamed from: e */
    public static C9458h m28511e() {
        return (C9458h) f24535b.getValue();
    }

    /* renamed from: f */
    public static final JSONObject m28512f() {
        JSONObject jSONObject = f24538e;
        if (jSONObject != null) {
            return jSONObject;
        }
        f24534a.getClass();
        String a = m28506b().mo60769a();
        if (a == null) {
            return null;
        }
        return new JSONObject(a);
    }

    /* renamed from: g */
    public static final boolean m28513g() {
        if (!f24539f.isLimitAdTrackingEnabled()) {
            f24534a.getClass();
            if (m28511e().mo60673e()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static final boolean m28514h() {
        return f24539f.isAdvertisingIdWasGenerated();
    }

    /* renamed from: i */
    public static final boolean m28515i() {
        return f24539f.isLimitAdTrackingEnabled();
    }

    /* renamed from: j */
    public static final boolean m28516j() {
        f24534a.getClass();
        return m28511e().mo60670b();
    }

    /* renamed from: a */
    public static final void m28502a(Boolean bool) {
        C9700x2 x2Var = f24534a;
        x2Var.getClass();
        if (m28511e().mo60668a(bool) && C9409q4.f23841c) {
            x2Var.getClass();
            if (!m28511e().mo60665a()) {
                x2Var.getClass();
                if (!m28511e().mo60675g()) {
                    return;
                }
            }
            C9422r0.m27936d();
        }
    }

    /* renamed from: a */
    public static void m28501a(Consent consent) {
        if (m28511e().mo60667a(consent) && C9409q4.f23841c) {
            C9700x2 x2Var = f24534a;
            x2Var.getClass();
            if (!m28511e().mo60665a()) {
                x2Var.getClass();
                if (!m28511e().mo60675g()) {
                    return;
                }
            }
            C9422r0.m27936d();
        }
    }

    /* renamed from: a */
    public static void m28500a(UserConsent userConsent) {
        Intrinsics.checkNotNullParameter(userConsent, "publisherZoneConsent");
        if (m28511e().mo60666a(userConsent) && C9409q4.f23841c) {
            C9700x2 x2Var = f24534a;
            x2Var.getClass();
            if (!m28511e().mo60665a()) {
                x2Var.getClass();
                if (!m28511e().mo60675g()) {
                    return;
                }
            }
            C9422r0.m27936d();
        }
    }

    /* renamed from: a */
    public static final void m28503a(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "jObject");
        f24534a.getClass();
        m28511e().mo60664a(jSONObject);
        HashSet hashSet = f24541h;
        hashSet.clear();
        int i = 0;
        if (jSONObject.has("gdpr")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("gdpr");
            if (optJSONObject == null || !optJSONObject.has("do_not_collect")) {
                hashSet.addAll(f24540g);
            } else {
                JSONArray optJSONArray = optJSONObject.optJSONArray("do_not_collect");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    int i2 = 0;
                    while (i2 < length) {
                        int i3 = i2 + 1;
                        String optString = optJSONArray.optString(i2, (String) null);
                        if (optString != null) {
                            f24541h.add(optString);
                        }
                        i2 = i3;
                    }
                }
            }
        }
        if (jSONObject.has("ccpa")) {
            JSONObject optJSONObject2 = jSONObject.optJSONObject("ccpa");
            if (optJSONObject2 == null || !optJSONObject2.has("do_not_collect")) {
                f24541h.addAll(f24540g);
                return;
            }
            JSONArray optJSONArray2 = optJSONObject2.optJSONArray("do_not_collect");
            if (optJSONArray2 != null) {
                int length2 = optJSONArray2.length();
                while (i < length2) {
                    int i4 = i + 1;
                    String optString2 = optJSONArray2.optString(i, (String) null);
                    if (optString2 != null) {
                        f24541h.add(optString2);
                    }
                    i = i4;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61222a(java.lang.String r5, android.content.Context r6, com.appodeal.advertising.AdvertisingInfo.AdvertisingProfile r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.appodeal.ads.C9700x2.C9701a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.appodeal.ads.x2$a r0 = (com.appodeal.ads.C9700x2.C9701a) r0
            int r1 = r0.f24545d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f24545d = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.x2$a r0 = new com.appodeal.ads.x2$a
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f24543b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f24545d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            com.appodeal.ads.x2 r5 = r0.f24542a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0049
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r8)
            m28504a((com.appodeal.advertising.AdvertisingInfo.AdvertisingProfile) r7)
            com.appodeal.ads.regulator.h r7 = m28511e()
            r0.f24542a = r4
            r0.f24545d = r3
            java.lang.Object r5 = r7.mo60663a(r6, r5, r0)
            if (r5 != r1) goto L_0x0048
            return r1
        L_0x0048:
            r5 = r4
        L_0x0049:
            r5.getClass()
            kotlin.Lazy r5 = f24537d
            java.lang.Object r5 = r5.getValue()
            com.appodeal.ads.networking.cache.c r5 = (com.appodeal.ads.networking.cache.C9368c) r5
            org.json.JSONObject r5 = r5.mo60574a()
            if (r5 != 0) goto L_0x005b
            goto L_0x005e
        L_0x005b:
            m28503a((org.json.JSONObject) r5)
        L_0x005e:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9700x2.mo61222a(java.lang.String, android.content.Context, com.appodeal.advertising.AdvertisingInfo$AdvertisingProfile, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
