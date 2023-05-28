package com.yandex.metrica.impl.p082ob;

import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import com.yandex.metrica.impl.p082ob.C3714z;
import kotlin.Metadata;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo38199d2 = {"Lcom/yandex/metrica/impl/ob/y;", "", "Landroid/content/Context;", "context", "Lcom/yandex/metrica/impl/ob/v;", "converter", "Lcom/yandex/metrica/impl/ob/z;", "a", "(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/v;)Lcom/yandex/metrica/impl/ob/z;", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, mo38200k = 1, mo38201mv = {1, 1, 15})
/* renamed from: com.yandex.metrica.impl.ob.y */
public final class C3676y {

    /* renamed from: a */
    public static final C3676y f9481a = new C3676y();

    /* renamed from: com.yandex.metrica.impl.ob.y$a */
    static final class C3677a<T, R> implements C3327om<UsageStatsManager, C3714z.C3715a> {

        /* renamed from: a */
        final /* synthetic */ C3562v f9482a;

        C3677a(C3562v vVar) {
            this.f9482a = vVar;
        }

        /* renamed from: a */
        public Object mo15530a(Object obj) {
            C3562v vVar = this.f9482a;
            int appStandbyBucket = ((UsageStatsManager) obj).getAppStandbyBucket();
            vVar.getClass();
            if (C1848A2.m6808a(28)) {
                if (C1848A2.m6808a(30) && appStandbyBucket == 45) {
                    return C3714z.C3715a.RESTRICTED;
                }
                if (appStandbyBucket == 10) {
                    return C3714z.C3715a.ACTIVE;
                }
                if (appStandbyBucket == 20) {
                    return C3714z.C3715a.WORKING_SET;
                }
                if (appStandbyBucket == 30) {
                    return C3714z.C3715a.FREQUENT;
                }
                if (appStandbyBucket == 40) {
                    return C3714z.C3715a.RARE;
                }
            }
            return null;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.y$b */
    static final class C3678b<T, R> implements C3327om<ActivityManager, Boolean> {

        /* renamed from: a */
        public static final C3678b f9483a = new C3678b();

        C3678b() {
        }

        /* renamed from: a */
        public Object mo15530a(Object obj) {
            return Boolean.valueOf(((ActivityManager) obj).isBackgroundRestricted());
        }
    }

    private C3676y() {
    }

    /* renamed from: a */
    public static final C3714z m11049a(Context context, C3562v vVar) {
        return new C3714z((C3714z.C3715a) C1848A2.m6794a(new C3677a(vVar), context, "usagestats", "getting app standby bucket", "usageStatsManager"), (Boolean) C1848A2.m6794a(C3678b.f9483a, context, "activity", "getting is background restricted", "activityManager"));
    }
}
