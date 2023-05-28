package com.appodeal.advertising;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.advertising.C9742b;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(mo38197bv = {}, mo38198d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\f\r\u000e\u000f\u0010J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0000XT¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, mo38199d2 = {"Lcom/appodeal/advertising/AdvertisingInfo;", "", "Landroid/content/Context;", "context", "Lcom/appodeal/advertising/AdvertisingInfo$AdvertisingProfile;", "getAdvertisingProfile", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "fetchAdvertisingProfile", "", "defaultAdvertisingId", "Ljava/lang/String;", "AdvertisingProfile", "AmazonAdvertisingProfile", "DefaultAdvertisingProfile", "GoogleAdvertisingProfile", "HuaweiAdvertisingProfile", "apd_advertising"}, mo38200k = 1, mo38201mv = {1, 6, 0})
public final class AdvertisingInfo {
    public static final AdvertisingInfo INSTANCE = new AdvertisingInfo();

    /* renamed from: a */
    public static final List<AdvertisingProfile> f24683a = CollectionsKt.listOf(new GoogleAdvertisingProfile(), new AmazonAdvertisingProfile(), new HuaweiAdvertisingProfile(), DefaultAdvertisingProfile.INSTANCE);

    /* renamed from: b */
    public static final MutableStateFlow<C9742b> f24684b = StateFlowKt.MutableStateFlow(C9742b.C9745c.f24695a);
    public static final String defaultAdvertisingId = "00000000-0000-0000-0000-000000000000";

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\fH\u0016R*\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f8\u0006@DX\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0012\u0010\u0016R*\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00048\u0006@DX\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u0012\u0010\u001cR*\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00048\u0006@DX\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001c¨\u0006\""}, mo38199d2 = {"Lcom/appodeal/advertising/AdvertisingInfo$AdvertisingProfile;", "", "Landroid/content/Context;", "context", "", "isEnabled$apd_advertising", "(Landroid/content/Context;)Z", "isEnabled", "", "extractParams$apd_advertising", "(Landroid/content/Context;)V", "extractParams", "", "getUUID$apd_advertising", "(Landroid/content/Context;)Ljava/lang/String;", "getUUID", "toString", "<set-?>", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "id", "b", "Z", "isLimitAdTrackingEnabled", "()Z", "(Z)V", "c", "isAdvertisingIdWasGenerated", "setAdvertisingIdWasGenerated", "<init>", "()V", "apd_advertising"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public static abstract class AdvertisingProfile {

        /* renamed from: a */
        public String f24685a = AdvertisingInfo.defaultAdvertisingId;

        /* renamed from: b */
        public boolean f24686b;

        /* renamed from: c */
        public boolean f24687c;

        /* renamed from: a */
        public final void mo61254a(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f24685a = str;
        }

        /* renamed from: a */
        public final void mo61255a(boolean z) {
            this.f24686b = z;
        }

        public void extractParams$apd_advertising(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this.f24686b || Intrinsics.areEqual((Object) this.f24685a, (Object) AdvertisingInfo.defaultAdvertisingId) || StringsKt.isBlank(this.f24685a) || !C9741a.m28560a(this.f24685a)) {
                this.f24685a = getUUID$apd_advertising(context);
                this.f24687c = true;
            }
        }

        public final String getId() {
            return this.f24685a;
        }

        public String getUUID$apd_advertising(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("appodeal", 0);
            String string = sharedPreferences.getString(Constants.UUID, (String) null);
            if (string != null) {
                return string;
            }
            String uuid = UUID.randomUUID().toString();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(Constants.UUID, uuid);
            edit.apply();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString().…apply()\n                }");
            return uuid;
        }

        public final boolean isAdvertisingIdWasGenerated() {
            return this.f24687c;
        }

        public boolean isEnabled$apd_advertising(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return true;
        }

        public final boolean isLimitAdTrackingEnabled() {
            return this.f24686b;
        }

        public String toString() {
            return getClass().getSimpleName() + "(id='" + this.f24685a + "', isLimitAdTrackingEnabled=" + this.f24686b + ", isAdvertisingIdWasGenerated=" + this.f24687c + ')';
        }
    }

    @Metadata(mo38198d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0010¢\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0010¢\u0006\u0002\b\n¨\u0006\u000b"}, mo38199d2 = {"Lcom/appodeal/advertising/AdvertisingInfo$AmazonAdvertisingProfile;", "Lcom/appodeal/advertising/AdvertisingInfo$AdvertisingProfile;", "()V", "extractParams", "", "context", "Landroid/content/Context;", "extractParams$apd_advertising", "isEnabled", "", "isEnabled$apd_advertising", "apd_advertising"}, mo38200k = 1, mo38201mv = {1, 6, 0}, mo38203xi = 48)
    public static final class AmazonAdvertisingProfile extends AdvertisingProfile {
        public void extractParams$apd_advertising(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ContentResolver contentResolver = context.getContentResolver();
            String string = Settings.Secure.getString(contentResolver, "advertising_id");
            Intrinsics.checkNotNullExpressionValue(string, "getString(contentResolver, \"advertising_id\")");
            mo61254a(string);
            mo61255a(Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0);
            super.extractParams$apd_advertising(context);
        }

        public boolean isEnabled$apd_advertising(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return Intrinsics.areEqual((Object) "Amazon", (Object) Build.MANUFACTURER);
        }
    }

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo38199d2 = {"Lcom/appodeal/advertising/AdvertisingInfo$DefaultAdvertisingProfile;", "Lcom/appodeal/advertising/AdvertisingInfo$AdvertisingProfile;", "apd_advertising"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public static final class DefaultAdvertisingProfile extends AdvertisingProfile {
        public static final DefaultAdvertisingProfile INSTANCE = new DefaultAdvertisingProfile();
    }

    @Metadata(mo38198d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0010¢\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0010¢\u0006\u0002\b\n¨\u0006\u000b"}, mo38199d2 = {"Lcom/appodeal/advertising/AdvertisingInfo$GoogleAdvertisingProfile;", "Lcom/appodeal/advertising/AdvertisingInfo$AdvertisingProfile;", "()V", "extractParams", "", "context", "Landroid/content/Context;", "extractParams$apd_advertising", "isEnabled", "", "isEnabled$apd_advertising", "apd_advertising"}, mo38200k = 1, mo38201mv = {1, 6, 0}, mo38203xi = 48)
    public static final class GoogleAdvertisingProfile extends AdvertisingProfile {
        public void extractParams$apd_advertising(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Object invoke = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getDeclaredMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
            Class<?> cls = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
            Object invoke2 = cls.getDeclaredMethod("getId", new Class[0]).invoke(invoke, new Object[0]);
            if (invoke2 != null) {
                mo61254a((String) invoke2);
                Object invoke3 = cls.getDeclaredMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(invoke, new Object[0]);
                if (invoke3 != null) {
                    mo61255a(((Boolean) invoke3).booleanValue());
                    super.extractParams$apd_advertising(context);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }

        public boolean isEnabled$apd_advertising(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            return true;
        }
    }

    @Metadata(mo38198d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0010¢\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0010¢\u0006\u0002\b\n¨\u0006\u000b"}, mo38199d2 = {"Lcom/appodeal/advertising/AdvertisingInfo$HuaweiAdvertisingProfile;", "Lcom/appodeal/advertising/AdvertisingInfo$AdvertisingProfile;", "()V", "extractParams", "", "context", "Landroid/content/Context;", "extractParams$apd_advertising", "isEnabled", "", "isEnabled$apd_advertising", "apd_advertising"}, mo38200k = 1, mo38201mv = {1, 6, 0}, mo38203xi = 48)
    public static final class HuaweiAdvertisingProfile extends AdvertisingProfile {
        public void extractParams$apd_advertising(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Object invoke = Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient").getDeclaredMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
            Class<?> cls = Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient$Info");
            Object invoke2 = cls.getDeclaredMethod("getId", new Class[0]).invoke(invoke, new Object[0]);
            if (invoke2 != null) {
                mo61254a((String) invoke2);
                Object invoke3 = cls.getDeclaredMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(invoke, new Object[0]);
                if (invoke3 != null) {
                    mo61255a(((Boolean) invoke3).booleanValue());
                    super.extractParams$apd_advertising(context);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }

        public boolean isEnabled$apd_advertising(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient");
            return true;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.advertising.AdvertisingInfo$fetchAdvertisingProfile$2", mo38569f = "AdvertisingInfo.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.advertising.AdvertisingInfo$a */
    public static final class C9738a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ Context f24688a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9738a(Context context, Continuation<? super C9738a> continuation) {
            super(2, continuation);
            this.f24688a = context;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9738a(this.f24688a, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9738a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            C9742b.C9743a aVar;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            AdvertisingInfo.f24684b.setValue(C9742b.C9744b.f24694a);
            MutableStateFlow access$getState$p = AdvertisingInfo.f24684b;
            List access$getSupportedAdvertisingProfiles$p = AdvertisingInfo.f24683a;
            Context context = this.f24688a;
            Iterator it = access$getSupportedAdvertisingProfiles$p.iterator();
            do {
                aVar = null;
                if (!it.hasNext()) {
                    break;
                }
                AdvertisingProfile advertisingProfile = (AdvertisingProfile) it.next();
                try {
                    if (advertisingProfile.isEnabled$apd_advertising(context)) {
                        advertisingProfile.extractParams$apd_advertising(context);
                        aVar = new C9742b.C9743a(advertisingProfile);
                        continue;
                    } else {
                        continue;
                    }
                } catch (Throwable unused) {
                }
            } while (aVar == null);
            if (aVar == null) {
                aVar = new C9742b.C9743a(AdvertisingInfo.access$getDefaultProfile(AdvertisingInfo.INSTANCE, this.f24688a));
            }
            access$getState$p.setValue(aVar);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.advertising.AdvertisingInfo$getAdvertisingProfile$2", mo38569f = "AdvertisingInfo.kt", mo38570l = {35, 37}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.advertising.AdvertisingInfo$b */
    public static final class C9739b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AdvertisingProfile>, Object> {

        /* renamed from: a */
        public int f24689a;

        /* renamed from: b */
        public final /* synthetic */ Context f24690b;

        @DebugMetadata(mo38568c = "com.appodeal.advertising.AdvertisingInfo$getAdvertisingProfile$2$profile$1", mo38569f = "AdvertisingInfo.kt", mo38570l = {}, mo38571m = "invokeSuspend")
        /* renamed from: com.appodeal.advertising.AdvertisingInfo$b$a */
        public static final class C9740a extends SuspendLambda implements Function2<C9742b, Continuation<? super Boolean>, Object> {

            /* renamed from: a */
            public /* synthetic */ Object f24691a;

            public C9740a(Continuation<? super C9740a> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C9740a aVar = new C9740a(continuation);
                aVar.f24691a = obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C9740a) create((C9742b) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(((C9742b) this.f24691a) instanceof C9742b.C9743a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9739b(Context context, Continuation<? super C9739b> continuation) {
            super(2, continuation);
            this.f24690b = context;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9739b(this.f24690b, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9739b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f24689a
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x001f
                if (r1 == r3) goto L_0x001b
                if (r1 != r2) goto L_0x0013
                kotlin.ResultKt.throwOnFailure(r7)
                goto L_0x004f
            L_0x0013:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001b:
                kotlin.ResultKt.throwOnFailure(r7)
                goto L_0x003d
            L_0x001f:
                kotlin.ResultKt.throwOnFailure(r7)
                kotlinx.coroutines.flow.MutableStateFlow r7 = com.appodeal.advertising.AdvertisingInfo.f24684b
                com.appodeal.advertising.b$c r1 = com.appodeal.advertising.C9742b.C9745c.f24695a
                com.appodeal.advertising.b$b r5 = com.appodeal.advertising.C9742b.C9744b.f24694a
                boolean r7 = r7.compareAndSet(r1, r5)
                if (r7 == 0) goto L_0x003d
                com.appodeal.advertising.AdvertisingInfo r7 = com.appodeal.advertising.AdvertisingInfo.INSTANCE
                android.content.Context r1 = r6.f24690b
                r6.f24689a = r3
                java.lang.Object r7 = r7.fetchAdvertisingProfile(r1, r6)
                if (r7 != r0) goto L_0x003d
                return r0
            L_0x003d:
                kotlinx.coroutines.flow.MutableStateFlow r7 = com.appodeal.advertising.AdvertisingInfo.f24684b
                com.appodeal.advertising.AdvertisingInfo$b$a r1 = new com.appodeal.advertising.AdvertisingInfo$b$a
                r1.<init>(r4)
                r6.f24689a = r2
                java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.first(r7, r1, r6)
                if (r7 != r0) goto L_0x004f
                return r0
            L_0x004f:
                boolean r0 = r7 instanceof com.appodeal.advertising.C9742b.C9743a
                if (r0 == 0) goto L_0x0056
                com.appodeal.advertising.b$a r7 = (com.appodeal.advertising.C9742b.C9743a) r7
                goto L_0x0057
            L_0x0056:
                r7 = r4
            L_0x0057:
                if (r7 != 0) goto L_0x005a
                goto L_0x005e
            L_0x005a:
                com.appodeal.advertising.AdvertisingInfo$AdvertisingProfile r4 = r7.mo61263a()
            L_0x005e:
                if (r4 != 0) goto L_0x0068
                com.appodeal.advertising.AdvertisingInfo r7 = com.appodeal.advertising.AdvertisingInfo.INSTANCE
                android.content.Context r0 = r6.f24690b
                com.appodeal.advertising.AdvertisingInfo$DefaultAdvertisingProfile r4 = com.appodeal.advertising.AdvertisingInfo.access$getDefaultProfile(r7, r0)
            L_0x0068:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.advertising.AdvertisingInfo.C9739b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final DefaultAdvertisingProfile access$getDefaultProfile(AdvertisingInfo advertisingInfo, Context context) {
        advertisingInfo.getClass();
        DefaultAdvertisingProfile defaultAdvertisingProfile = DefaultAdvertisingProfile.INSTANCE;
        defaultAdvertisingProfile.extractParams$apd_advertising(context);
        return defaultAdvertisingProfile;
    }

    public final Object fetchAdvertisingProfile(Context context, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new C9738a(context, (Continuation<? super C9738a>) null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final Object getAdvertisingProfile(Context context, Continuation<? super AdvertisingProfile> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C9739b(context, (Continuation<? super C9739b>) null), continuation);
    }
}
