package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import android.util.Pair;
import com.appnext.base.p264b.C8850d;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yandex.metrica.impl.p082ob.C2121If;
import com.yandex.metrica.impl.p082ob.C2402Oh;
import com.yandex.metrica.impl.p082ob.C2572Tl;
import com.yandex.metrica.impl.p082ob.C2638Ui;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Ti */
public class C2569Ti {

    /* renamed from: a */
    private final C2158Ii f6802a;

    /* renamed from: b */
    private final C2098Hi f6803b;

    /* renamed from: c */
    private final C2404Oi f6804c;

    /* renamed from: d */
    private final C2496Ri f6805d;

    /* renamed from: e */
    private final C2463Qi f6806e;

    /* renamed from: f */
    private final C2347Ni f6807f;

    /* renamed from: g */
    private final C2534Si f6808g;

    /* renamed from: h */
    private final C2207Ji f6809h;

    /* renamed from: i */
    private final C2692Wi f6810i;

    /* renamed from: j */
    private final C2282Li f6811j;

    /* renamed from: k */
    private final C2436Pi f6812k;

    /* renamed from: l */
    private final C2765Z9 f6813l;

    /* renamed from: m */
    private final C2747Yi f6814m;

    /* renamed from: n */
    private final C2722Xi f6815n;

    /* renamed from: o */
    private final C1929Ci f6816o;

    /* renamed from: p */
    private final C1961Di f6817p;

    /* renamed from: q */
    private final C1998Ei f6818q;

    /* renamed from: r */
    private final C1898Bi f6819r;

    /* renamed from: s */
    private final C2246Ki f6820s;

    /* renamed from: t */
    private final C2030Fi f6821t;

    /* renamed from: u */
    private final C2064Gi f6822u;

    /* renamed from: v */
    private final C2666Vi f6823v;

    /* renamed from: w */
    private final C2317Mi f6824w;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2569Ti() {
        /*
            r25 = this;
            r0 = r25
            com.yandex.metrica.impl.ob.Ki r2 = new com.yandex.metrica.impl.ob.Ki
            r1 = r2
            r2.<init>()
            com.yandex.metrica.impl.ob.Ii r3 = new com.yandex.metrica.impl.ob.Ii
            r2 = r3
            r3.<init>()
            com.yandex.metrica.impl.ob.Hi r4 = new com.yandex.metrica.impl.ob.Hi
            r3 = r4
            r4.<init>()
            com.yandex.metrica.impl.ob.Oi r5 = new com.yandex.metrica.impl.ob.Oi
            r4 = r5
            r5.<init>()
            com.yandex.metrica.impl.ob.Ri r6 = new com.yandex.metrica.impl.ob.Ri
            r5 = r6
            r6.<init>()
            com.yandex.metrica.impl.ob.Qi r7 = new com.yandex.metrica.impl.ob.Qi
            r6 = r7
            r7.<init>()
            com.yandex.metrica.impl.ob.Ni r8 = new com.yandex.metrica.impl.ob.Ni
            r7 = r8
            r8.<init>()
            com.yandex.metrica.impl.ob.Si r9 = new com.yandex.metrica.impl.ob.Si
            r8 = r9
            r9.<init>()
            com.yandex.metrica.impl.ob.Ji r10 = new com.yandex.metrica.impl.ob.Ji
            r9 = r10
            r10.<init>()
            com.yandex.metrica.impl.ob.Wi r11 = new com.yandex.metrica.impl.ob.Wi
            r10 = r11
            r11.<init>()
            com.yandex.metrica.impl.ob.Li r12 = new com.yandex.metrica.impl.ob.Li
            r11 = r12
            r12.<init>()
            com.yandex.metrica.impl.ob.Pi r13 = new com.yandex.metrica.impl.ob.Pi
            r12 = r13
            r13.<init>()
            com.yandex.metrica.impl.ob.Z9 r14 = new com.yandex.metrica.impl.ob.Z9
            r13 = r14
            r14.<init>()
            com.yandex.metrica.impl.ob.Yi r15 = new com.yandex.metrica.impl.ob.Yi
            r14 = r15
            r15.<init>()
            com.yandex.metrica.impl.ob.Xi r16 = new com.yandex.metrica.impl.ob.Xi
            r15 = r16
            r16.<init>()
            com.yandex.metrica.impl.ob.Di r17 = new com.yandex.metrica.impl.ob.Di
            r16 = r17
            r17.<init>()
            com.yandex.metrica.impl.ob.Ei r18 = new com.yandex.metrica.impl.ob.Ei
            r17 = r18
            r18.<init>()
            com.yandex.metrica.impl.ob.Ci r19 = new com.yandex.metrica.impl.ob.Ci
            r18 = r19
            r19.<init>()
            com.yandex.metrica.impl.ob.Bi r20 = new com.yandex.metrica.impl.ob.Bi
            r19 = r20
            r20.<init>()
            com.yandex.metrica.impl.ob.Fi r21 = new com.yandex.metrica.impl.ob.Fi
            r20 = r21
            r21.<init>()
            com.yandex.metrica.impl.ob.Gi r22 = new com.yandex.metrica.impl.ob.Gi
            r21 = r22
            r22.<init>()
            com.yandex.metrica.impl.ob.Vi r23 = new com.yandex.metrica.impl.ob.Vi
            r22 = r23
            r23.<init>()
            com.yandex.metrica.impl.ob.Mi r24 = new com.yandex.metrica.impl.ob.Mi
            r23 = r24
            r24.<init>()
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2569Ti.<init>():void");
    }

    /* renamed from: a */
    public C2638Ui mo16718a(byte[] bArr) {
        String str;
        C2638Ui ui = new C2638Ui();
        try {
            this.f6820s.getClass();
            C2572Tl.C2573a aVar = new C2572Tl.C2573a(new String(bArr, "UTF-8"));
            JSONObject optJSONObject = aVar.optJSONObject("device_id");
            String str2 = "";
            if (optJSONObject != null) {
                str2 = optJSONObject.optString("hash");
                str = optJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            } else {
                str = str2;
            }
            ui.mo16900d(str);
            ui.mo16897c(str2);
            m8496a(ui, aVar);
            ui.mo16870a(C2638Ui.C2639a.OK);
            return ui;
        } catch (Throwable unused) {
            C2638Ui ui2 = new C2638Ui();
            ui2.mo16870a(C2638Ui.C2639a.BAD);
            return ui2;
        }
    }

    public C2569Ti(C2246Ki ki, C2158Ii ii, C2098Hi hi, C2404Oi oi, C2496Ri ri, C2463Qi qi, C2347Ni ni, C2534Si si, C2207Ji ji, C2692Wi wi, C2282Li li, C2436Pi pi, C2765Z9 z9, C2747Yi yi, C2722Xi xi, C1961Di di, C1998Ei ei, C1929Ci ci, C1898Bi bi, C2030Fi fi, C2064Gi gi, C2666Vi vi, C2317Mi mi) {
        this.f6802a = ii;
        this.f6803b = hi;
        this.f6804c = oi;
        this.f6805d = ri;
        this.f6806e = qi;
        this.f6807f = ni;
        this.f6808g = si;
        this.f6809h = ji;
        this.f6810i = wi;
        this.f6811j = li;
        this.f6812k = pi;
        this.f6813l = z9;
        this.f6814m = yi;
        this.f6815n = xi;
        this.f6817p = di;
        this.f6818q = ei;
        this.f6816o = ci;
        this.f6819r = bi;
        this.f6820s = ki;
        this.f6821t = fi;
        this.f6822u = gi;
        this.f6823v = vi;
        this.f6824w = mi;
    }

    /* renamed from: a */
    private void m8496a(C2638Ui ui, C2572Tl.C2573a aVar) throws JSONException {
        String str;
        C2402Oh.C2403a aVar2;
        long j;
        long j2;
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3 = aVar.optJSONObject("queries");
        if (!(optJSONObject3 == null || (optJSONObject2 = optJSONObject3.optJSONObject("list")) == null)) {
            JSONObject optJSONObject4 = optJSONObject2.optJSONObject("sdk_list");
            if (optJSONObject4 != null) {
                ui.mo16912h(optJSONObject4.optString("url", (String) null));
            }
            JSONObject optJSONObject5 = optJSONObject2.optJSONObject("host");
            if (optJSONObject5 != null) {
                ui.mo16885a(optJSONObject5.optString("url", (String) null));
            }
        }
        Object jSONObject = new JSONObject();
        try {
            jSONObject = aVar.get("distribution_customization");
        } catch (Throwable unused) {
        }
        JSONObject optJSONObject6 = ((JSONObject) jSONObject).optJSONObject("clids");
        if (optJSONObject6 != null) {
            HashMap hashMap = new HashMap();
            Iterator<String> keys = optJSONObject6.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject7 = optJSONObject6.optJSONObject(next);
                if (optJSONObject7 != null && optJSONObject7.has(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                    hashMap.put(next, optJSONObject7.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                }
            }
            ui.mo16903e(C2572Tl.m8538c((Map<String, String>) hashMap));
        }
        JSONObject optJSONObject8 = aVar.optJSONObject("locale");
        if (optJSONObject8 == null || (optJSONObject = optJSONObject8.optJSONObject("country")) == null || !optJSONObject.optBoolean("reliable", false)) {
            str = "";
        } else {
            str = optJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE, "");
        }
        ui.mo16892b(str);
        JSONObject optJSONObject9 = aVar.optJSONObject(C8850d.f22432fl);
        if (optJSONObject9 != null) {
            try {
                ui.mo16884a(Long.valueOf(optJSONObject9.getLong("max_valid_difference_seconds")));
            } catch (Throwable unused2) {
            }
        }
        C2121If.C2149s sVar = new C2121If.C2149s();
        JSONObject optJSONObject10 = aVar.optJSONObject("stat_sending");
        if (optJSONObject10 != null) {
            sVar.f5723a = C2572Tl.m8504a(C2572Tl.m8510a(optJSONObject10, "disabled_reporting_interval_seconds", (Long) null), TimeUnit.SECONDS, sVar.f5723a);
        }
        ui.mo16879a(this.f6813l.toModel(sVar));
        ArrayList arrayList = new ArrayList();
        JSONObject optJSONObject11 = aVar.optJSONObject("mediascope_api_keys");
        if (!(optJSONObject11 == null || (optJSONArray2 = optJSONObject11.optJSONArray("list")) == null)) {
            for (int i = 0; i < optJSONArray2.length(); i++) {
                try {
                    arrayList.add(optJSONArray2.getString(i));
                } catch (Throwable unused3) {
                }
            }
        }
        ui.mo16901d((List<String>) arrayList);
        this.f6803b.mo15876a(ui, aVar);
        this.f6802a.mo15939a(ui, aVar);
        this.f6804c.getClass();
        JSONObject optJSONObject12 = aVar.optJSONObject("permissions");
        if (!(optJSONObject12 == null || (optJSONArray = optJSONObject12.optJSONArray("list")) == null)) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                JSONObject optJSONObject13 = optJSONArray.optJSONObject(i2);
                if (optJSONObject13 != null) {
                    String optString = optJSONObject13.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    boolean optBoolean = optJSONObject13.optBoolean("enabled");
                    if (TextUtils.isEmpty(optString)) {
                        ui.mo16886a("", false);
                    } else {
                        ui.mo16886a(optString, optBoolean);
                    }
                }
            }
        }
        this.f6805d.mo16575a(ui, aVar);
        this.f6806e.getClass();
        C2121If ifR = new C2121If();
        JSONObject optJSONObject14 = aVar.optJSONObject("retry_policy");
        int i3 = ifR.f5565H;
        int i4 = ifR.f5566I;
        if (optJSONObject14 != null) {
            i3 = optJSONObject14.optInt("max_interval_seconds", i3);
            i4 = optJSONObject14.optInt("exponential_multiplier", ifR.f5566I);
        }
        ui.mo16883a(new RetryPolicyConfig(i3, i4));
        this.f6807f.getClass();
        if (ui.mo16902e().f6664c) {
            JSONObject optJSONObject15 = aVar.optJSONObject("permissions_collecting");
            C2121If.C2143n nVar = new C2121If.C2143n();
            if (optJSONObject15 != null) {
                j = optJSONObject15.optLong("check_interval_seconds", nVar.f5696a);
                j2 = optJSONObject15.optLong("force_send_interval_seconds", nVar.f5697b);
            } else {
                j = nVar.f5696a;
                j2 = nVar.f5697b;
            }
            ui.mo16872a(new C2808ai(j, j2));
        }
        this.f6808g.mo16646a(ui, aVar);
        this.f6809h.mo16047a(ui, aVar);
        this.f6811j.mo16223a(ui, (JSONObject) aVar);
        this.f6812k.mo16479a(ui, aVar);
        this.f6814m.mo17084a(ui, aVar);
        ui.mo16891b(this.f6815n.mo17066a(aVar, "ui_event_sending", C3171m0.m10002b()));
        ui.mo16896c(this.f6815n.mo17066a(aVar, "ui_raw_event_sending", C3171m0.m10002b()));
        ui.mo16875a(this.f6815n.mo17066a(aVar, "ui_collecting_for_bridge", C3171m0.m10001a()));
        this.f6816o.mo15593a(ui, aVar);
        ui.mo16880a(this.f6810i.mo17004a(aVar, "throttling"));
        ui.mo16867a(this.f6817p.mo15636a(aVar));
        this.f6818q.mo15728a(ui, aVar);
        this.f6819r.getClass();
        JSONObject optJSONObject16 = aVar.optJSONObject("attribution");
        if (optJSONObject16 != null) {
            ArrayList arrayList2 = new ArrayList();
            JSONArray optJSONArray3 = optJSONObject16.optJSONArray("deeplink_conditions");
            if (optJSONArray3 != null) {
                for (int i5 = 0; i5 < optJSONArray3.length(); i5++) {
                    JSONObject optJSONObject17 = optJSONArray3.optJSONObject(i5);
                    String optString2 = optJSONObject17.optString("key", (String) null);
                    if (!TextUtils.isEmpty(optString2)) {
                        String optString3 = optJSONObject17.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) null);
                        if (optString3 == null) {
                            aVar2 = null;
                        } else {
                            aVar2 = new C2402Oh.C2403a(optString3);
                        }
                        arrayList2.add(new Pair(optString2, aVar2));
                    }
                }
            }
            ui.mo16866a(new C2402Oh(arrayList2));
        }
        this.f6821t.mo15790a(ui, aVar);
        if (ui.mo16902e().f6684w) {
            this.f6822u.mo15832a(ui, aVar);
        }
        this.f6823v.mo16980a(ui, aVar);
        this.f6824w.mo16322a(ui, aVar);
    }
}
