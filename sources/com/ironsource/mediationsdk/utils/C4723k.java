package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.model.C4651f;
import com.ironsource.mediationsdk.model.C4656k;
import com.ironsource.mediationsdk.model.C4658l;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.mediationsdk.utils.k */
public class C4723k {

    /* renamed from: a */
    private static C4723k f11841a;

    /* renamed from: b */
    private final HashSet<ImpressionDataListener> f11842b = new HashSet<>();

    /* renamed from: c */
    private ConcurrentHashMap<String, List<String>> f11843c = new ConcurrentHashMap<>();

    /* renamed from: com.ironsource.mediationsdk.utils.k$1 */
    static /* synthetic */ class C47241 {

        /* renamed from: a */
        static final /* synthetic */ int[] f11844a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ironsource.mediationsdk.model.l[] r0 = com.ironsource.mediationsdk.model.C4658l.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11844a = r0
                com.ironsource.mediationsdk.model.l r1 = com.ironsource.mediationsdk.model.C4658l.PER_DAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11844a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ironsource.mediationsdk.model.l r1 = com.ironsource.mediationsdk.model.C4658l.PER_HOUR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C4723k.C47241.<clinit>():void");
        }
    }

    /* renamed from: com.ironsource.mediationsdk.utils.k$a */
    public enum C4725a {
        ;
        

        /* renamed from: a */
        public static final int f11845a = 1;

        /* renamed from: b */
        public static final int f11846b = 2;

        /* renamed from: c */
        public static final int f11847c = 3;

        /* renamed from: d */
        public static final int f11848d = 4;

        static {
            f11849e = new int[]{1, 2, 3, 4};
        }

        /* renamed from: a */
        public static int[] m13850a() {
            return (int[]) f11849e.clone();
        }
    }

    C4723k() {
    }

    /* renamed from: a */
    private static int m13822a(Context context, String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!IronSourceUtils.getBooleanFromSharedPrefs(context, m13826a(str, "CappingManager.IS_DELIVERY_ENABLED", str2), true)) {
            return C4725a.f11845a;
        }
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, m13826a(str, "CappingManager.IS_PACING_ENABLED", str2), false)) {
            if (currentTimeMillis - IronSourceUtils.getLongFromSharedPrefs(context, m13826a(str, "CappingManager.TIME_OF_THE_PREVIOUS_SHOW", str2), 0) < ((long) (IronSourceUtils.getIntFromSharedPrefs(context, m13826a(str, "CappingManager.SECONDS_BETWEEN_SHOWS", str2), 0) * 1000))) {
                return C4725a.f11847c;
            }
        }
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, m13826a(str, "CappingManager.IS_CAPPING_ENABLED", str2), false)) {
            int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(context, m13826a(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2), 0);
            String a = m13826a(str, "CappingManager.CURRENT_NUMBER_OF_SHOWS", str2);
            int intFromSharedPrefs2 = IronSourceUtils.getIntFromSharedPrefs(context, a, 0);
            String a2 = m13826a(str, "CappingManager.CAPPING_TIME_THRESHOLD", str2);
            if (currentTimeMillis >= IronSourceUtils.getLongFromSharedPrefs(context, a2, 0)) {
                IronSourceUtils.saveIntToSharedPrefs(context, a, 0);
                IronSourceUtils.saveLongToSharedPrefs(context, a2, 0);
            } else if (intFromSharedPrefs2 >= intFromSharedPrefs) {
                return C4725a.f11846b;
            }
        }
        return C4725a.f11848d;
    }

    /* renamed from: a */
    private static long m13823a(C4658l lVar) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        int i = C47241.f11844a[lVar.ordinal()];
        if (i == 1) {
            instance.set(14, 0);
            instance.set(13, 0);
            instance.set(12, 0);
            instance.set(11, 0);
            instance.add(6, 1);
        } else if (i == 2) {
            instance.set(14, 0);
            instance.set(13, 0);
            instance.set(12, 0);
            instance.add(11, 1);
        }
        return instance.getTimeInMillis();
    }

    /* renamed from: a */
    public static synchronized C4723k m13824a() {
        C4723k kVar;
        synchronized (C4723k.class) {
            if (f11841a == null) {
                f11841a = new C4723k();
            }
            kVar = f11841a;
        }
        return kVar;
    }

    /* renamed from: a */
    private static String m13825a(IronSource.AD_UNIT ad_unit) {
        return ad_unit == IronSource.AD_UNIT.INTERSTITIAL ? "Interstitial" : ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO ? IronSourceConstants.REWARDED_VIDEO_AD_UNIT : ad_unit == IronSource.AD_UNIT.BANNER ? "Banner" : ad_unit.toString();
    }

    /* renamed from: a */
    private static String m13826a(String str, String str2, String str3) {
        return str + "_" + str2 + "_" + str3;
    }

    /* renamed from: a */
    public static synchronized void m13827a(Context context, InterstitialPlacement interstitialPlacement) {
        synchronized (C4723k.class) {
            if (context != null) {
                C4656k placementAvailabilitySettings = interstitialPlacement.getPlacementAvailabilitySettings();
                if (placementAvailabilitySettings != null) {
                    m13830a(context, "Interstitial", interstitialPlacement.getPlacementName(), placementAvailabilitySettings);
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m13828a(Context context, Placement placement) {
        synchronized (C4723k.class) {
            if (context != null) {
                C4656k placementAvailabilitySettings = placement.getPlacementAvailabilitySettings();
                if (placementAvailabilitySettings != null) {
                    m13830a(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName(), placementAvailabilitySettings);
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m13829a(Context context, C4651f fVar) {
        synchronized (C4723k.class) {
            if (context != null) {
                C4656k placementAvailabilitySettings = fVar.getPlacementAvailabilitySettings();
                if (placementAvailabilitySettings != null) {
                    m13830a(context, "Banner", fVar.getPlacementName(), placementAvailabilitySettings);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m13830a(Context context, String str, String str2, C4656k kVar) {
        boolean z = kVar.f11632a;
        IronSourceUtils.saveBooleanToSharedPrefs(context, m13826a(str, "CappingManager.IS_DELIVERY_ENABLED", str2), z);
        if (z) {
            boolean z2 = kVar.f11633b;
            IronSourceUtils.saveBooleanToSharedPrefs(context, m13826a(str, "CappingManager.IS_CAPPING_ENABLED", str2), z2);
            if (z2) {
                IronSourceUtils.saveIntToSharedPrefs(context, m13826a(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2), kVar.f11636e);
                IronSourceUtils.saveStringToSharedPrefs(context, m13826a(str, "CappingManager.CAPPING_TYPE", str2), kVar.f11635d.toString());
            }
            boolean z3 = kVar.f11634c;
            IronSourceUtils.saveBooleanToSharedPrefs(context, m13826a(str, "CappingManager.IS_PACING_ENABLED", str2), z3);
            if (z3) {
                IronSourceUtils.saveIntToSharedPrefs(context, m13826a(str, "CappingManager.SECONDS_BETWEEN_SHOWS", str2), kVar.f11637f);
            }
        }
    }

    /* renamed from: a */
    public static synchronized boolean m13831a(Context context, String str) {
        boolean z;
        synchronized (C4723k.class) {
            z = m13822a(context, "Interstitial", str) != C4725a.f11848d;
        }
        return z;
    }

    /* renamed from: a */
    public static synchronized boolean m13832a(Context context, String str, IronSource.AD_UNIT ad_unit) {
        boolean z;
        synchronized (C4723k.class) {
            z = m13822a(context, m13825a(ad_unit), str) != C4725a.f11848d;
        }
        return z;
    }

    /* renamed from: b */
    public static synchronized int m13833b(Context context, InterstitialPlacement interstitialPlacement) {
        synchronized (C4723k.class) {
            if (!(context == null || interstitialPlacement == null)) {
                if (interstitialPlacement.getPlacementAvailabilitySettings() != null) {
                    int a = m13822a(context, "Interstitial", interstitialPlacement.getPlacementName());
                    return a;
                }
            }
            int i = C4725a.f11848d;
            return i;
        }
    }

    /* renamed from: b */
    public static synchronized int m13834b(Context context, Placement placement) {
        synchronized (C4723k.class) {
            if (!(context == null || placement == null)) {
                if (placement.getPlacementAvailabilitySettings() != null) {
                    int a = m13822a(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName());
                    return a;
                }
            }
            int i = C4725a.f11848d;
            return i;
        }
    }

    /* renamed from: b */
    public static synchronized void m13835b(Context context, String str, IronSource.AD_UNIT ad_unit) {
        synchronized (C4723k.class) {
            m13836b(context, m13825a(ad_unit), str);
        }
    }

    /* renamed from: b */
    private static void m13836b(Context context, String str, String str2) {
        int i = 0;
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, m13826a(str, "CappingManager.IS_PACING_ENABLED", str2), false)) {
            IronSourceUtils.saveLongToSharedPrefs(context, m13826a(str, "CappingManager.TIME_OF_THE_PREVIOUS_SHOW", str2), System.currentTimeMillis());
        }
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, m13826a(str, "CappingManager.IS_CAPPING_ENABLED", str2), false)) {
            IronSourceUtils.getIntFromSharedPrefs(context, m13826a(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2), 0);
            String a = m13826a(str, "CappingManager.CURRENT_NUMBER_OF_SHOWS", str2);
            int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(context, a, 0);
            if (intFromSharedPrefs == 0) {
                String stringFromSharedPrefs = IronSourceUtils.getStringFromSharedPrefs(context, m13826a(str, "CappingManager.CAPPING_TYPE", str2), C4658l.PER_DAY.toString());
                C4658l lVar = null;
                C4658l[] values = C4658l.values();
                int length = values.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    C4658l lVar2 = values[i];
                    if (lVar2.f11647c.equals(stringFromSharedPrefs)) {
                        lVar = lVar2;
                        break;
                    }
                    i++;
                }
                IronSourceUtils.saveLongToSharedPrefs(context, m13826a(str, "CappingManager.CAPPING_TIME_THRESHOLD", str2), m13823a(lVar));
            }
            IronSourceUtils.saveIntToSharedPrefs(context, a, intFromSharedPrefs + 1);
        }
    }

    /* renamed from: b */
    public static synchronized boolean m13837b(Context context, String str) {
        boolean z;
        synchronized (C4723k.class) {
            z = m13822a(context, "Banner", str) != C4725a.f11848d;
        }
        return z;
    }

    /* renamed from: c */
    public static synchronized void m13838c(Context context, InterstitialPlacement interstitialPlacement) {
        synchronized (C4723k.class) {
            if (interstitialPlacement != null) {
                m13836b(context, "Interstitial", interstitialPlacement.getPlacementName());
            }
        }
    }

    /* renamed from: c */
    public static synchronized void m13839c(Context context, Placement placement) {
        synchronized (C4723k.class) {
            if (placement != null) {
                m13836b(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName());
            }
        }
    }

    /* renamed from: c */
    public static synchronized boolean m13840c(Context context, String str) {
        boolean z;
        synchronized (C4723k.class) {
            z = m13822a(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str) != C4725a.f11848d;
        }
        return z;
    }

    /* renamed from: d */
    public static synchronized void m13841d(Context context, String str) {
        synchronized (C4723k.class) {
            m13836b(context, "Interstitial", str);
        }
    }

    /* renamed from: e */
    public static synchronized void m13842e(Context context, String str) {
        synchronized (C4723k.class) {
            m13836b(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str);
        }
    }

    /* renamed from: f */
    public static synchronized void m13843f(Context context, String str) {
        synchronized (C4723k.class) {
            if (!TextUtils.isEmpty(str)) {
                m13836b(context, "Banner", str);
            }
        }
    }

    /* renamed from: a */
    public void mo34190a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f11842b.add(impressionDataListener);
        }
    }

    /* renamed from: a */
    public void mo34191a(String str, List<String> list) {
        this.f11843c.put(str, list);
    }

    /* renamed from: b */
    public HashSet<ImpressionDataListener> mo34192b() {
        return this.f11842b;
    }

    /* renamed from: b */
    public void mo34193b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f11842b.remove(impressionDataListener);
        }
    }

    /* renamed from: c */
    public void mo34194c() {
        synchronized (this) {
            this.f11842b.clear();
        }
    }

    /* renamed from: d */
    public ConcurrentHashMap<String, List<String>> mo34195d() {
        return this.f11843c;
    }
}
