package com.yandex.metrica.impl.p082ob;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.yandex.metrica.impl.p082ob.C1967E;
import com.yandex.metrica.impl.p082ob.C3316oc;
import com.yandex.metrica.impl.p082ob.C3398qf;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.J1 */
public final class C2171J1 {

    /* renamed from: a */
    private static Map<C2943f6, Integer> f5819a;

    /* renamed from: b */
    private static SparseArray<C2943f6> f5820b;

    /* renamed from: c */
    private static final Map<C2788a1, Integer> f5821c;

    /* renamed from: d */
    private static final Map<C2788a1, C3444re> f5822d;

    /* renamed from: e */
    public static final /* synthetic */ int f5823e = 0;

    /* renamed from: com.yandex.metrica.impl.ob.J1$a */
    class C2172a implements C2060Ge {
        C2172a() {
        }

        /* renamed from: a */
        public byte[] mo15563a(C3397qe qeVar, C2275Lg lg) {
            byte[] bArr;
            if (!TextUtils.isEmpty(qeVar.f8740b)) {
                try {
                    C2895dg a = C2895dg.m9369a(Base64.decode(qeVar.f8740b, 0));
                    C3479sf sfVar = new C3479sf();
                    String str = a.f7645a;
                    if (str == null) {
                        bArr = new byte[0];
                    } else {
                        bArr = str.getBytes();
                    }
                    sfVar.f9098a = bArr;
                    sfVar.f9100c = a.f7646b;
                    sfVar.f9099b = a.f7647c;
                    int ordinal = a.f7648d.ordinal();
                    int i = 2;
                    if (ordinal == 1) {
                        i = 1;
                    } else if (ordinal != 2) {
                        i = 0;
                    }
                    sfVar.f9101d = i;
                    return MessageNano.toByteArray(sfVar);
                } catch (Throwable unused) {
                }
            }
            return new byte[0];
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.J1$b */
    class C2173b implements C3478se {
        C2173b() {
        }

        /* renamed from: a */
        public Integer mo15588a(C3397qe qeVar) {
            return qeVar.f8749k;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        C2943f6 f6Var = C2943f6.FOREGROUND;
        hashMap.put(f6Var, 0);
        C2943f6 f6Var2 = C2943f6.BACKGROUND;
        hashMap.put(f6Var2, 1);
        f5819a = Collections.unmodifiableMap(hashMap);
        SparseArray<C2943f6> sparseArray = new SparseArray<>();
        sparseArray.put(0, f6Var);
        sparseArray.put(1, f6Var2);
        f5820b = sparseArray;
        HashMap hashMap2 = new HashMap();
        C2788a1 a1Var = C2788a1.EVENT_TYPE_INIT;
        hashMap2.put(a1Var, 1);
        C2788a1 a1Var2 = C2788a1.EVENT_TYPE_REGULAR;
        hashMap2.put(a1Var2, 4);
        C2788a1 a1Var3 = C2788a1.EVENT_TYPE_SEND_REFERRER;
        hashMap2.put(a1Var3, 5);
        C2788a1 a1Var4 = C2788a1.EVENT_TYPE_ALIVE;
        hashMap2.put(a1Var4, 7);
        C2788a1 a1Var5 = C2788a1.EVENT_TYPE_EXCEPTION_UNHANDLED;
        hashMap2.put(a1Var5, 3);
        C2788a1 a1Var6 = C2788a1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        hashMap2.put(a1Var6, 26);
        C2788a1 a1Var7 = C2788a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT;
        hashMap2.put(a1Var7, 26);
        C2788a1 a1Var8 = C2788a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(a1Var8, 26);
        C2788a1 a1Var9 = C2788a1.EVENT_TYPE_ANR;
        hashMap2.put(a1Var9, 25);
        C2788a1 a1Var10 = C2788a1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH;
        hashMap2.put(a1Var10, 3);
        C2788a1 a1Var11 = C2788a1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(a1Var11, 26);
        C2788a1 a1Var12 = C2788a1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH;
        hashMap2.put(a1Var12, 3);
        C2788a1 a1Var13 = C2788a1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(a1Var13, 26);
        C2788a1 a1Var14 = C2788a1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF;
        hashMap2.put(a1Var14, 26);
        C2788a1 a1Var15 = a1Var;
        C2788a1 a1Var16 = C2788a1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(a1Var16, 26);
        C2788a1 a1Var17 = C2788a1.EVENT_TYPE_EXCEPTION_USER;
        C2788a1 a1Var18 = a1Var9;
        hashMap2.put(a1Var17, 6);
        C2788a1 a1Var19 = C2788a1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        C2788a1 a1Var20 = a1Var8;
        hashMap2.put(a1Var19, 27);
        C2788a1 a1Var21 = a1Var7;
        C2788a1 a1Var22 = C2788a1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        hashMap2.put(a1Var22, 27);
        C2788a1 a1Var23 = C2788a1.EVENT_TYPE_IDENTITY;
        C2788a1 a1Var24 = a1Var6;
        hashMap2.put(a1Var23, 8);
        C2788a1 a1Var25 = a1Var5;
        hashMap2.put(C2788a1.EVENT_TYPE_IDENTITY_LIGHT, 28);
        C2788a1 a1Var26 = C2788a1.EVENT_TYPE_STATBOX;
        hashMap2.put(a1Var26, 11);
        C2788a1 a1Var27 = C2788a1.EVENT_TYPE_SET_USER_INFO;
        C2788a1 a1Var28 = a1Var26;
        hashMap2.put(a1Var27, 12);
        C2788a1 a1Var29 = a1Var27;
        C2788a1 a1Var30 = C2788a1.EVENT_TYPE_REPORT_USER_INFO;
        hashMap2.put(a1Var30, 12);
        C2788a1 a1Var31 = C2788a1.EVENT_TYPE_FIRST_ACTIVATION;
        C2788a1 a1Var32 = a1Var30;
        hashMap2.put(a1Var31, 13);
        C2788a1 a1Var33 = C2788a1.EVENT_TYPE_START;
        C2788a1 a1Var34 = a1Var31;
        hashMap2.put(a1Var33, 2);
        C2788a1 a1Var35 = C2788a1.EVENT_TYPE_APP_OPEN;
        C2788a1 a1Var36 = a1Var33;
        hashMap2.put(a1Var35, 16);
        C2788a1 a1Var37 = C2788a1.EVENT_TYPE_APP_UPDATE;
        C2788a1 a1Var38 = a1Var35;
        hashMap2.put(a1Var37, 17);
        C2788a1 a1Var39 = C2788a1.EVENT_TYPE_PERMISSIONS;
        C2788a1 a1Var40 = a1Var37;
        hashMap2.put(a1Var39, 18);
        C2788a1 a1Var41 = C2788a1.EVENT_TYPE_APP_FEATURES;
        C2788a1 a1Var42 = a1Var39;
        hashMap2.put(a1Var41, 19);
        C2788a1 a1Var43 = C2788a1.EVENT_TYPE_SEND_USER_PROFILE;
        C2788a1 a1Var44 = a1Var41;
        hashMap2.put(a1Var43, 20);
        C2788a1 a1Var45 = C2788a1.EVENT_TYPE_SEND_REVENUE_EVENT;
        C2788a1 a1Var46 = a1Var43;
        hashMap2.put(a1Var45, 21);
        C2788a1 a1Var47 = C2788a1.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        C2788a1 a1Var48 = a1Var45;
        hashMap2.put(a1Var47, 40);
        C2788a1 a1Var49 = C2788a1.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        C2788a1 a1Var50 = a1Var47;
        hashMap2.put(a1Var49, 35);
        C2788a1 a1Var51 = a1Var49;
        hashMap2.put(C2788a1.EVENT_TYPE_CLEANUP, 29);
        C2788a1 a1Var52 = C2788a1.EVENT_TYPE_VIEW_TREE;
        hashMap2.put(a1Var52, 30);
        C2788a1 a1Var53 = C2788a1.EVENT_TYPE_RAW_VIEW_TREE;
        C2788a1 a1Var54 = a1Var52;
        hashMap2.put(a1Var53, 34);
        C2788a1 a1Var55 = C2788a1.EVENT_TYPE_STATBOX_EXP;
        C2788a1 a1Var56 = a1Var53;
        hashMap2.put(a1Var55, 36);
        C2788a1 a1Var57 = C2788a1.EVENT_TYPE_WEBVIEW_SYNC;
        C2788a1 a1Var58 = a1Var55;
        hashMap2.put(a1Var57, 38);
        f5821c = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        C3210me meVar = new C3210me();
        C2788a1 a1Var59 = a1Var57;
        C3350pe peVar = new C3350pe();
        C2788a1 a1Var60 = a1Var23;
        C3260ne neVar = new C3260ne();
        C2788a1 a1Var61 = a1Var22;
        C3098je jeVar = new C3098je();
        C2788a1 a1Var62 = a1Var19;
        C2024Fe fe = new C2024Fe();
        C2788a1 a1Var63 = a1Var17;
        C1893Be be = new C1893Be();
        C2788a1 a1Var64 = a1Var16;
        C3444re a = C3444re.m10619a().mo18158a((C2060Ge) be).mo18159a((C3319oe) be).mo18164a();
        C3444re a2 = C3444re.m10619a().mo18158a((C2060Ge) peVar).mo18164a();
        C3350pe peVar2 = peVar;
        C3444re a3 = C3444re.m10619a().mo18158a((C2060Ge) jeVar).mo18164a();
        C3098je jeVar2 = jeVar;
        C3444re a4 = C3444re.m10619a().mo18158a((C2060Ge) fe).mo18164a();
        C3444re reVar = a4;
        C3444re a5 = C3444re.m10619a().mo18158a((C2060Ge) new C2093He()).mo18164a();
        hashMap3.put(a1Var2, a2);
        hashMap3.put(a1Var3, C3444re.m10619a().mo18158a((C2060Ge) new C2172a()).mo18164a());
        hashMap3.put(a1Var4, C3444re.m10619a().mo18162a((C3698ye) meVar).mo18158a((C2060Ge) neVar).mo18161a((C3663xe) new C3127ke()).mo18163a((C3732ze) new C3157le()).mo18164a());
        hashMap3.put(a1Var10, a);
        hashMap3.put(a1Var12, a);
        hashMap3.put(a1Var11, a);
        hashMap3.put(a1Var13, a);
        hashMap3.put(a1Var14, a);
        hashMap3.put(a1Var64, a);
        hashMap3.put(a1Var63, a2);
        hashMap3.put(a1Var62, a3);
        hashMap3.put(a1Var61, a3);
        hashMap3.put(a1Var60, C3444re.m10619a().mo18158a((C2060Ge) peVar2).mo18159a((C3319oe) new C3619we()).mo18164a());
        hashMap3.put(a1Var28, a2);
        hashMap3.put(a1Var29, a2);
        hashMap3.put(a1Var32, a2);
        hashMap3.put(a1Var25, a2);
        hashMap3.put(a1Var24, a3);
        hashMap3.put(a1Var21, a3);
        hashMap3.put(a1Var20, a3);
        hashMap3.put(a1Var18, a3);
        hashMap3.put(a1Var36, C3444re.m10619a().mo18162a((C3698ye) new C3210me()).mo18158a((C2060Ge) jeVar2).mo18164a());
        hashMap3.put(C2788a1.EVENT_TYPE_CUSTOM_EVENT, C3444re.m10619a().mo18160a((C3478se) new C2173b()).mo18164a());
        hashMap3.put(a1Var38, a2);
        C3444re a6 = C3444re.m10619a().mo18162a((C3698ye) meVar).mo18164a();
        hashMap3.put(a1Var42, a6);
        hashMap3.put(a1Var44, a6);
        hashMap3.put(a1Var46, a3);
        hashMap3.put(a1Var48, a3);
        hashMap3.put(a1Var50, a3);
        hashMap3.put(a1Var51, reVar);
        hashMap3.put(a1Var54, a2);
        hashMap3.put(a1Var56, a2);
        hashMap3.put(a1Var15, a5);
        hashMap3.put(a1Var40, a5);
        hashMap3.put(a1Var34, a2);
        hashMap3.put(a1Var58, a2);
        hashMap3.put(a1Var59, a2);
        f5822d = Collections.unmodifiableMap(hashMap3);
    }

    /* renamed from: a */
    public static C3398qf.C3410f m7476a(ContentValues contentValues) {
        Long asLong = contentValues.getAsLong("start_time");
        Long asLong2 = contentValues.getAsLong("server_time_offset");
        Boolean asBoolean = contentValues.getAsBoolean("obtained_before_first_sync");
        C3398qf.C3410f fVar = new C3398qf.C3410f();
        if (asLong != null) {
            fVar.f8845a = asLong.longValue();
            fVar.f8846b = ((GregorianCalendar) GregorianCalendar.getInstance()).getTimeZone().getOffset(asLong.longValue() * 1000) / 1000;
        }
        if (asLong2 != null) {
            fVar.f8847c = asLong2.longValue();
        }
        if (asBoolean != null) {
            fVar.f8848d = asBoolean.booleanValue();
        }
        return fVar;
    }

    /* renamed from: b */
    public static C3320of[] m7482b(JSONArray jSONArray) {
        try {
            C3320of[] ofVarArr = new C3320of[jSONArray.length()];
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        ofVarArr[i] = m7480b(optJSONObject);
                    }
                    i++;
                } catch (Throwable unused) {
                    return ofVarArr;
                }
            }
            return ofVarArr;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: b */
    public static C3320of m7480b(JSONObject jSONObject) {
        C3320of ofVar = new C3320of();
        int optInt = jSONObject.optInt("signal_strength", ofVar.f8522b);
        if (optInt != -1) {
            ofVar.f8522b = optInt;
        }
        ofVar.f8521a = jSONObject.optInt("cell_id", ofVar.f8521a);
        ofVar.f8523c = jSONObject.optInt("lac", ofVar.f8523c);
        ofVar.f8524d = jSONObject.optInt("country_code", ofVar.f8524d);
        ofVar.f8525e = jSONObject.optInt("operator_id", ofVar.f8525e);
        ofVar.f8526f = jSONObject.optString("operator_name", ofVar.f8526f);
        ofVar.f8527g = jSONObject.optBoolean("is_connected", ofVar.f8527g);
        ofVar.f8528h = jSONObject.optInt("cell_type", 0);
        ofVar.f8529i = jSONObject.optInt("pci", ofVar.f8529i);
        ofVar.f8530j = jSONObject.optLong("last_visible_time_offset", ofVar.f8530j);
        ofVar.f8531k = jSONObject.optInt("lte_rsrq", ofVar.f8531k);
        ofVar.f8532l = jSONObject.optInt("lte_rssnr", ofVar.f8532l);
        ofVar.f8534n = jSONObject.optInt("arfcn", ofVar.f8534n);
        ofVar.f8533m = jSONObject.optInt("lte_rssi", ofVar.f8533m);
        ofVar.f8535o = jSONObject.optInt("lte_bandwidth", ofVar.f8535o);
        ofVar.f8536p = jSONObject.optInt("lte_cqi", ofVar.f8536p);
        return ofVar;
    }

    /* renamed from: a */
    static C2943f6 m7475a(int i) {
        C2943f6 f6Var = f5820b.get(i);
        return f6Var == null ? C2943f6.FOREGROUND : f6Var;
    }

    /* renamed from: a */
    public static C3447rf[] m7479a(JSONArray jSONArray) {
        try {
            C3447rf[] rfVarArr = new C3447rf[jSONArray.length()];
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    rfVarArr[i] = m7478a(jSONArray.getJSONObject(i));
                    i++;
                } catch (Throwable unused) {
                    return rfVarArr;
                }
            }
            return rfVarArr;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: a */
    private static C3447rf m7478a(JSONObject jSONObject) {
        try {
            C3447rf rfVar = new C3447rf();
            rfVar.f9027a = jSONObject.getString("mac");
            rfVar.f9028b = jSONObject.getInt("signal_strength");
            rfVar.f9029c = jSONObject.getString("ssid");
            rfVar.f9030d = jSONObject.optBoolean("is_connected");
            rfVar.f9031e = jSONObject.optLong("last_visible_offset_seconds", 0);
            return rfVar;
        } catch (Throwable unused) {
            C3447rf rfVar2 = new C3447rf();
            rfVar2.f9027a = jSONObject.optString("mac");
            return rfVar2;
        }
    }

    /* renamed from: b */
    public static Integer m7481b(C2788a1 a1Var) {
        if (a1Var == null) {
            return null;
        }
        return f5821c.get(a1Var);
    }

    /* renamed from: a */
    static int m7473a(C2943f6 f6Var) {
        Integer num = f5819a.get(f6Var);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: a */
    public static C3444re m7477a(C2788a1 a1Var) {
        C3444re reVar = a1Var != null ? f5822d.get(a1Var) : null;
        return reVar == null ? C3444re.m10622b() : reVar;
    }

    /* renamed from: a */
    public static int m7472a(C1967E.C1969b.C1970a aVar) {
        int ordinal = aVar.ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public static int m7474a(C3316oc.C3317a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal == 1) {
            return 0;
        }
        if (ordinal != 2) {
            return ordinal != 3 ? 3 : 2;
        }
        return 1;
    }
}
