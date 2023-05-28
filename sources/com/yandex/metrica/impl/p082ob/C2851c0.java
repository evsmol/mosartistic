package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.yandex.metrica.coreutils.collection.CollectionUtils;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.impl.p082ob.C3714z;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.c0 */
public class C2851c0 implements Parcelable {
    public static final Parcelable.Creator<C2851c0> CREATOR = new C2852a();

    /* renamed from: a */
    String f7524a;

    /* renamed from: b */
    String f7525b;

    /* renamed from: c */
    private String f7526c;

    /* renamed from: d */
    private String f7527d;

    /* renamed from: e */
    int f7528e;

    /* renamed from: f */
    int f7529f;

    /* renamed from: g */
    private Pair<String, String> f7530g;

    /* renamed from: h */
    int f7531h;

    /* renamed from: i */
    private String f7532i;

    /* renamed from: j */
    private long f7533j;

    /* renamed from: k */
    private long f7534k;

    /* renamed from: l */
    private C1936D0 f7535l;

    /* renamed from: m */
    private C3679y0 f7536m;

    /* renamed from: n */
    private Bundle f7537n;

    /* renamed from: o */
    private Boolean f7538o;

    /* renamed from: p */
    private Integer f7539p;

    /* renamed from: q */
    private Map<String, byte[]> f7540q;

    /* renamed from: com.yandex.metrica.impl.ob.c0$a */
    class C2852a implements Parcelable.Creator<C2851c0> {
        C2852a() {
        }

        public Object createFromParcel(Parcel parcel) {
            Bundle readBundle = parcel.readBundle(C2936f0.class.getClassLoader());
            Integer num = null;
            C3679y0 a = readBundle.containsKey("CounterReport.Source") ? C3679y0.m11052a(readBundle.getInt("CounterReport.Source")) : null;
            C2851c0 c0Var = new C2851c0();
            c0Var.f7528e = readBundle.getInt("CounterReport.Type", C2788a1.EVENT_TYPE_UNDEFINED.mo17139b());
            c0Var.f7529f = readBundle.getInt("CounterReport.CustomType");
            String string = readBundle.getString("CounterReport.Value");
            if (string == null) {
                string = "";
            }
            c0Var.f7525b = string;
            C2851c0 a2 = C2851c0.m9217a(c0Var.mo15970e(readBundle.getString("CounterReport.UserInfo")).mo17332c(readBundle.getString("CounterReport.Environment")).mo15968b(readBundle.getString("CounterReport.Event")), (!readBundle.containsKey("CounterReport.AppEnvironmentDiffKey") || !readBundle.containsKey("CounterReport.AppEnvironmentDiffValue")) ? null : new Pair(readBundle.getString("CounterReport.AppEnvironmentDiffKey"), readBundle.getString("CounterReport.AppEnvironmentDiffValue")));
            a2.f7531h = readBundle.getInt("CounterReport.TRUNCATED");
            C2851c0 a3 = a2.mo15969d(readBundle.getString("CounterReport.ProfileID")).mo17321a(readBundle.getLong("CounterReport.CreationElapsedRealtime")).mo17330b(readBundle.getLong("CounterReport.CreationTimestamp")).mo17322a(C1936D0.m6984a(Integer.valueOf(readBundle.getInt("CounterReport.UniquenessStatus")))).mo17323a(a).mo17331c(readBundle.getBundle("CounterReport.Payload")).mo17324a(readBundle.containsKey("CounterReport.AttributionIdChanged") ? Boolean.valueOf(readBundle.getBoolean("CounterReport.AttributionIdChanged")) : null);
            if (readBundle.containsKey("CounterReport.OpenId")) {
                num = Integer.valueOf(readBundle.getInt("CounterReport.OpenId"));
            }
            return a3.mo17325a(num).mo17327a(CollectionUtils.bundleToMap(readBundle.getBundle("CounterReport.Extras")));
        }

        public Object[] newArray(int i) {
            return new C2851c0[i];
        }
    }

    public C2851c0() {
        this("", 0);
    }

    /* renamed from: a */
    public C2851c0 mo15967a(byte[] bArr) {
        this.f7525b = new String(Base64.encode(bArr, 0));
        return this;
    }

    /* renamed from: b */
    public C2851c0 mo15968b(String str) {
        this.f7524a = str;
        return this;
    }

    /* renamed from: c */
    public C2851c0 mo17332c(String str) {
        this.f7527d = str;
        return this;
    }

    /* renamed from: d */
    public int mo17334d() {
        return this.f7531h;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public C2851c0 mo15970e(String str) {
        this.f7526c = str;
        return this;
    }

    /* renamed from: f */
    public C2851c0 mo15971f(String str) {
        this.f7525b = str;
        return this;
    }

    /* renamed from: g */
    public String mo17338g() {
        return this.f7524a;
    }

    /* renamed from: h */
    public String mo17339h() {
        return this.f7527d;
    }

    /* renamed from: i */
    public Map<String, byte[]> mo17340i() {
        return this.f7540q;
    }

    /* renamed from: j */
    public C1936D0 mo17341j() {
        return this.f7535l;
    }

    /* renamed from: k */
    public Integer mo17342k() {
        return this.f7539p;
    }

    /* renamed from: l */
    public Bundle mo17343l() {
        return this.f7537n;
    }

    /* renamed from: m */
    public String mo17344m() {
        return this.f7532i;
    }

    /* renamed from: n */
    public C3679y0 mo17345n() {
        return this.f7536m;
    }

    /* renamed from: o */
    public int mo17346o() {
        return this.f7528e;
    }

    /* renamed from: p */
    public String mo17347p() {
        return this.f7526c;
    }

    /* renamed from: q */
    public String mo17348q() {
        return this.f7525b;
    }

    /* renamed from: r */
    public byte[] mo17349r() {
        return Base64.decode(this.f7525b, 0);
    }

    public String toString() {
        return String.format(Locale.US, "[event: %s, type: %s, value: %s]", new Object[]{this.f7524a, C2788a1.m8989a(this.f7528e).mo17138a(), C1848A2.m6798a(this.f7525b, 500)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.f7524a);
        bundle.putString("CounterReport.Value", this.f7525b);
        bundle.putInt("CounterReport.Type", this.f7528e);
        bundle.putInt("CounterReport.CustomType", this.f7529f);
        bundle.putInt("CounterReport.TRUNCATED", this.f7531h);
        bundle.putString("CounterReport.ProfileID", this.f7532i);
        bundle.putInt("CounterReport.UniquenessStatus", this.f7535l.f5195a);
        Bundle bundle2 = this.f7537n;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.f7527d;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        String str2 = this.f7526c;
        if (str2 != null) {
            bundle.putString("CounterReport.UserInfo", str2);
        }
        Pair<String, String> pair = this.f7530g;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.f7533j);
        bundle.putLong("CounterReport.CreationTimestamp", this.f7534k);
        C3679y0 y0Var = this.f7536m;
        if (y0Var != null) {
            bundle.putInt("CounterReport.Source", y0Var.f9487a);
        }
        Boolean bool = this.f7538o;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.f7539p;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        bundle.putBundle("CounterReport.Extras", CollectionUtils.mapToBundle(this.f7540q));
        parcel.writeBundle(bundle);
    }

    public C2851c0(String str, int i) {
        this("", str, i);
    }

    /* renamed from: a */
    public C2851c0 mo17320a(int i) {
        this.f7528e = i;
        return this;
    }

    /* renamed from: b */
    public Pair<String, String> mo17329b() {
        return this.f7530g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C2851c0 mo17331c(Bundle bundle) {
        this.f7537n = bundle;
        return this;
    }

    /* renamed from: d */
    public C2851c0 mo15969d(String str) {
        this.f7532i = str;
        return this;
    }

    /* renamed from: e */
    public long mo17336e() {
        return this.f7533j;
    }

    /* renamed from: f */
    public long mo17337f() {
        return this.f7534k;
    }

    public C2851c0(String str, String str2, int i) {
        this(str, str2, i, new SystemTimeProvider());
    }

    /* renamed from: d */
    private static C2851c0 m9226d(C2851c0 c0Var) {
        C2851c0 c0Var2 = new C2851c0();
        c0Var2.f7534k = c0Var.f7534k;
        c0Var2.f7533j = c0Var.f7533j;
        c0Var2.f7526c = c0Var.f7526c;
        c0Var2.f7530g = c0Var.f7530g;
        c0Var2.f7527d = c0Var.f7527d;
        c0Var2.f7537n = c0Var.f7537n;
        c0Var2.f7540q = c0Var.f7540q;
        c0Var2.f7532i = c0Var.f7532i;
        return c0Var2;
    }

    /* renamed from: e */
    public static C2851c0 m9227e(C2851c0 c0Var) {
        return m9220a(c0Var, C2788a1.EVENT_TYPE_APP_UPDATE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2851c0 mo17326a(String str, String str2) {
        if (this.f7530g == null) {
            this.f7530g = new Pair<>(str, str2);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C2851c0 mo17330b(long j) {
        this.f7534k = j;
        return this;
    }

    /* renamed from: c */
    public Boolean mo17333c() {
        return this.f7538o;
    }

    public C2851c0(String str, String str2, int i, SystemTimeProvider systemTimeProvider) {
        this.f7535l = C1936D0.UNKNOWN;
        this.f7540q = new HashMap();
        this.f7524a = str2;
        this.f7528e = i;
        this.f7525b = str;
        this.f7533j = systemTimeProvider.elapsedRealtime();
        this.f7534k = systemTimeProvider.currentTimeMillis();
    }

    /* renamed from: c */
    public static C2851c0 m9225c(C2851c0 c0Var) {
        return m9220a(c0Var, C2788a1.EVENT_TYPE_INIT);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Bundle mo17328b(Bundle bundle) {
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    /* renamed from: a */
    static C2851c0 m9217a(C2851c0 c0Var, Pair pair) {
        c0Var.f7530g = pair;
        return c0Var;
    }

    /* renamed from: b */
    public static C2851c0 m9224b(C2851c0 c0Var) {
        return m9220a(c0Var, C2788a1.EVENT_TYPE_FIRST_ACTIVATION);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2851c0 mo17321a(long j) {
        this.f7533j = j;
        return this;
    }

    /* renamed from: a */
    public C2851c0 mo17322a(C1936D0 d0) {
        this.f7535l = d0;
        return this;
    }

    /* renamed from: a */
    public C2851c0 mo17323a(C3679y0 y0Var) {
        this.f7536m = y0Var;
        return this;
    }

    /* renamed from: a */
    public C2851c0 mo17324a(Boolean bool) {
        this.f7538o = bool;
        return this;
    }

    /* renamed from: a */
    public C2851c0 mo17325a(Integer num) {
        this.f7539p = num;
        return this;
    }

    /* renamed from: a */
    public C2851c0 mo17327a(Map<String, byte[]> map) {
        this.f7540q = map;
        return this;
    }

    /* renamed from: a */
    public static C2851c0 m9215a(Bundle bundle) {
        if (bundle != null) {
            try {
                C2851c0 c0Var = (C2851c0) bundle.getParcelable("CounterReport.Object");
                if (c0Var != null) {
                    return c0Var;
                }
            } catch (Throwable unused) {
                return new C2851c0();
            }
        }
        return new C2851c0();
    }

    /* renamed from: a */
    private static C2851c0 m9220a(C2851c0 c0Var, C2788a1 a1Var) {
        C2851c0 d = m9226d(c0Var);
        d.f7528e = a1Var.mo17139b();
        return d;
    }

    /* renamed from: a */
    public static C2851c0 m9216a(C2851c0 c0Var) {
        return m9220a(c0Var, C2788a1.EVENT_TYPE_ALIVE);
    }

    /* renamed from: a */
    public static C2851c0 m9218a(C2851c0 c0Var, C1841A0 a0) {
        C2851c0 a = m9220a(c0Var, C2788a1.EVENT_TYPE_START);
        String a2 = a0.mo15408a();
        C3261nf nfVar = new C3261nf();
        if (a2 != null) {
            nfVar.f8429a = a2.getBytes();
        }
        a.mo15967a(MessageNano.toByteArray(nfVar));
        a.f7534k = c0Var.f7534k;
        a.f7533j = c0Var.f7533j;
        return a;
    }

    /* renamed from: a */
    public static C2851c0 m9219a(C2851c0 c0Var, C2259L3 l3) {
        Context g = l3.mo16129g();
        C2729Y0 c = new C2729Y0(g, new C3368q0(g)).mo17073c();
        try {
            c.mo17072b();
        } catch (Throwable unused) {
        }
        C2851c0 d = m9226d(c0Var);
        d.f7528e = C2788a1.EVENT_TYPE_IDENTITY.mo17139b();
        d.f7525b = c.mo17071a();
        return d;
    }

    /* renamed from: a */
    public static C2851c0 m9222a(C2851c0 c0Var, Collection<C1892Bd> collection, C3714z zVar, C3562v vVar, List<String> list) {
        String str;
        String str2;
        C2851c0 d = m9226d(c0Var);
        try {
            JSONArray jSONArray = new JSONArray();
            for (C1892Bd next : collection) {
                jSONArray.put(new JSONObject().put(AppMeasurementSdk.ConditionalUserProperty.NAME, next.f5115a).put("granted", next.f5116b));
            }
            JSONObject jSONObject = new JSONObject();
            if (zVar != null) {
                jSONObject.put("background_restricted", zVar.f9548b);
                C3714z.C3715a aVar = zVar.f9547a;
                vVar.getClass();
                if (aVar != null) {
                    int ordinal = aVar.ordinal();
                    if (ordinal == 0) {
                        str2 = "ACTIVE";
                    } else if (ordinal == 1) {
                        str2 = "WORKING_SET";
                    } else if (ordinal == 2) {
                        str2 = "FREQUENT";
                    } else if (ordinal == 3) {
                        str2 = "RARE";
                    } else if (ordinal == 4) {
                        str2 = "RESTRICTED";
                    }
                    jSONObject.put("app_standby_bucket", str2);
                }
                str2 = null;
                jSONObject.put("app_standby_bucket", str2);
            }
            str = new JSONObject().put("permissions", jSONArray).put("background_restrictions", jSONObject).put("available_providers", new JSONArray(list)).toString();
        } catch (Throwable unused) {
            str = "";
        }
        d.f7528e = C2788a1.EVENT_TYPE_PERMISSIONS.mo17139b();
        d.f7525b = str;
        return d;
    }

    /* renamed from: a */
    public static C2851c0 m9221a(C2851c0 c0Var, String str) {
        C2851c0 d = m9226d(c0Var);
        d.f7528e = C2788a1.EVENT_TYPE_APP_FEATURES.mo17139b();
        d.f7525b = str;
        return d;
    }

    /* renamed from: a */
    public static C2851c0 m9214a() {
        C2851c0 c0Var = new C2851c0();
        c0Var.f7528e = C2788a1.EVENT_TYPE_SEND_REVENUE_EVENT.mo17139b();
        return c0Var;
    }

    /* renamed from: a */
    public static C2851c0 m9223a(String str) {
        C2851c0 c0Var = new C2851c0();
        c0Var.f7528e = C2788a1.EVENT_TYPE_WEBVIEW_SYNC.mo17139b();
        c0Var.f7525b = str;
        c0Var.f7536m = C3679y0.JS;
        return c0Var;
    }
}
