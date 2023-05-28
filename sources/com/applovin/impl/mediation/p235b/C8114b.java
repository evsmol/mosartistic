package com.applovin.impl.mediation.p235b;

import android.content.Context;
import com.applovin.impl.mediation.p234a.C8077g;
import com.applovin.impl.mediation.p234a.C8079h;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p254c.C8379a;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p254c.C8382d;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.p256e.C8458z;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdkUtils;
import com.appnext.base.p264b.C8849c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.b.b */
public class C8114b extends C8401a {

    /* renamed from: a */
    private static JSONObject f19752a;

    /* renamed from: e */
    private static final Object f19753e = new Object();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final MaxAdFormat f19754f;

    /* renamed from: g */
    private final Map<String, Object> f19755g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Context f19756h;

    /* renamed from: i */
    private final C8116a f19757i;

    /* renamed from: com.applovin.impl.mediation.b.b$a */
    public interface C8116a {
        /* renamed from: a */
        void mo56271a(JSONArray jSONArray);
    }

    /* renamed from: com.applovin.impl.mediation.b.b$b */
    private static class C8117b implements C8077g.C8078a, Runnable {

        /* renamed from: a */
        private final C8116a f19761a;

        /* renamed from: b */
        private final Object f19762b;

        /* renamed from: c */
        private int f19763c;

        /* renamed from: d */
        private final AtomicBoolean f19764d;

        /* renamed from: e */
        private final Collection<C8077g> f19765e;

        /* renamed from: f */
        private final C8490n f19766f;

        /* renamed from: g */
        private final C8626v f19767g;

        private C8117b(int i, C8116a aVar, C8490n nVar) {
            this.f19763c = i;
            this.f19761a = aVar;
            this.f19766f = nVar;
            this.f19767g = nVar.mo57320D();
            this.f19762b = new Object();
            this.f19765e = new ArrayList(i);
            this.f19764d = new AtomicBoolean();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m24278a() {
            ArrayList<C8077g> arrayList;
            String str;
            String d;
            synchronized (this.f19762b) {
                arrayList = new ArrayList<>(this.f19765e);
            }
            JSONArray jSONArray = new JSONArray();
            for (C8077g gVar : arrayList) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    C8079h a = gVar.mo56191a();
                    jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, a.mo56152S());
                    jSONObject.put("class", a.mo56151R());
                    jSONObject.put("adapter_version", gVar.mo56193c());
                    jSONObject.put("sdk_version", gVar.mo56192b());
                    JSONObject jSONObject2 = new JSONObject();
                    if (StringUtils.isValidString(gVar.mo56195e())) {
                        str = "error_message";
                        d = gVar.mo56195e();
                    } else {
                        str = "signal";
                        d = gVar.mo56194d();
                    }
                    jSONObject2.put(str, d);
                    jSONObject.put(C8849c.DATA, jSONObject2);
                    jSONArray.put(jSONObject);
                    if (C8626v.m26252a()) {
                        C8626v vVar = this.f19767g;
                        vVar.mo57818b("TaskCollectSignals", "Collected signal from " + a);
                    }
                } catch (JSONException e) {
                    if (C8626v.m26252a()) {
                        this.f19767g.mo57819b("TaskCollectSignals", "Failed to create signal data", e);
                    }
                }
            }
            m24280a(jSONArray);
        }

        /* renamed from: a */
        private void m24280a(JSONArray jSONArray) {
            C8116a aVar = this.f19761a;
            if (aVar != null) {
                aVar.mo56271a(jSONArray);
            }
        }

        /* renamed from: a */
        public void mo56197a(C8077g gVar) {
            boolean z;
            synchronized (this.f19762b) {
                this.f19765e.add(gVar);
                int i = this.f19763c - 1;
                this.f19763c = i;
                z = i < 1;
            }
            if (z && this.f19764d.compareAndSet(false, true)) {
                if (!Utils.isMainThread() || !((Boolean) this.f19766f.mo57342a(C8380b.f20975fp)).booleanValue()) {
                    m24278a();
                } else {
                    this.f19766f.mo57337V().mo57228a((C8401a) new C8458z(this.f19766f, new Runnable() {
                        public void run() {
                            C8117b.this.m24278a();
                        }
                    }), C8432o.C8434a.MEDIATION_MAIN);
                }
            }
        }

        public void run() {
            if (this.f19764d.compareAndSet(false, true)) {
                m24278a();
            }
        }
    }

    public C8114b(MaxAdFormat maxAdFormat, Map<String, Object> map, Context context, C8490n nVar, C8116a aVar) {
        super("TaskCollectSignals", nVar);
        this.f19754f = maxAdFormat;
        this.f19755g = map;
        this.f19756h = context;
        this.f19757i = aVar;
    }

    /* renamed from: a */
    private void m24271a(final C8079h hVar, final C8077g.C8078a aVar) {
        if (hVar.mo56159Z()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    C8114b.this.f21118b.mo57324H().collectSignal(C8114b.this.f19754f, hVar, C8114b.this.f19756h, aVar);
                }
            });
        } else {
            this.f21118b.mo57324H().collectSignal(this.f19754f, hVar, this.f19756h, aVar);
        }
    }

    /* renamed from: a */
    private void m24272a(String str, Throwable th) {
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.f21120d;
            String str2 = this.f21119c;
            vVar2.mo57819b(str2, "No signals collected: " + str, th);
        }
        C8116a aVar = this.f19757i;
        if (aVar != null) {
            aVar.mo56271a(new JSONArray());
        }
    }

    /* renamed from: a */
    private void m24273a(JSONArray jSONArray, JSONObject jSONObject) throws JSONException, InterruptedException {
        C8117b bVar = new C8117b(jSONArray.length(), this.f19757i, this.f21118b);
        for (int i = 0; i < jSONArray.length(); i++) {
            m24271a(new C8079h(this.f19755g, jSONArray.getJSONObject(i), jSONObject, this.f21118b), (C8077g.C8078a) bVar);
        }
        this.f21118b.mo57337V().mo57229a((C8401a) new C8458z(this.f21118b, bVar), C8432o.C8434a.MAIN, ((Long) this.f21118b.mo57342a(C8379a.f20680j)).longValue());
    }

    /* renamed from: a */
    public static void m24274a(JSONObject jSONObject) {
        synchronized (f19753e) {
            f19752a = jSONObject;
        }
    }

    public void run() {
        String str;
        JSONArray jSONArray;
        try {
            if (((Boolean) this.f21118b.mo57342a(C8380b.f20965ff)).booleanValue()) {
                synchronized (f19753e) {
                    jSONArray = JsonUtils.getJSONArray(f19752a, "signal_providers", (JSONArray) null);
                }
                if (jSONArray != null) {
                    if (jSONArray.length() > 0) {
                        m24273a(jSONArray, f19752a);
                        return;
                    }
                }
                C8626v vVar = this.f21120d;
                if (C8626v.m26252a()) {
                    this.f21120d.mo57821d(this.f21119c, "Unable to find cached signal providers, falling back to old logic.");
                }
            }
            JSONObject jSONObject = new JSONObject((String) this.f21118b.mo57378b(C8382d.f21016x, JsonUtils.EMPTY_JSON));
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "signal_providers", (JSONArray) null);
            if (jSONArray2 != null) {
                if (jSONArray2.length() != 0) {
                    m24273a(jSONArray2, jSONObject);
                    return;
                }
            }
            m24272a("No signal providers found", (Throwable) null);
        } catch (JSONException e) {
            th = e;
            str = "Failed to parse signals JSON";
            m24272a(str, th);
        } catch (InterruptedException e2) {
            th = e2;
            str = "Failed to wait for signals";
            m24272a(str, th);
        } catch (Throwable th) {
            th = th;
            str = "Failed to collect signals";
            m24272a(str, th);
        }
    }
}
