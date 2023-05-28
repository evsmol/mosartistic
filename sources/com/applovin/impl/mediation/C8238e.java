package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.mediation.p234a.C8076f;
import com.applovin.impl.mediation.p235b.C8110a;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p254c.C8382d;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.e */
public class C8238e {

    /* renamed from: a */
    private final C8490n f20227a;

    /* renamed from: b */
    private final C8626v f20228b;

    /* renamed from: c */
    private final AtomicBoolean f20229c = new AtomicBoolean();

    /* renamed from: d */
    private final JSONArray f20230d = new JSONArray();

    /* renamed from: e */
    private final LinkedHashMap<String, Integer> f20231e = new LinkedHashMap<>();

    /* renamed from: f */
    private final Object f20232f = new Object();

    /* renamed from: g */
    private List<C8076f> f20233g;

    public C8238e(C8490n nVar) {
        this.f20227a = nVar;
        this.f20228b = nVar.mo57320D();
    }

    /* renamed from: a */
    private List<C8076f> m24761a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new C8076f(Collections.EMPTY_MAP, JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), jSONObject, this.f20227a));
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo56533a(Activity activity) {
        if (this.f20229c.compareAndSet(false, true)) {
            String str = (String) this.f20227a.mo57343a(C8382d.f21017y);
            if (StringUtils.isValidString(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List<C8076f> a = m24761a(JsonUtils.getJSONArray(jSONObject, this.f20227a.mo57330N().mo56529a() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                    this.f20233g = a;
                    this.f20227a.mo57337V().mo57227a((C8401a) new C8110a(a, activity, this.f20227a));
                } catch (JSONException e) {
                    if (C8626v.m26252a()) {
                        this.f20228b.mo57819b("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo56534a(C8076f fVar, long j, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean z;
        if (initializationStatus != null && initializationStatus != MaxAdapter.InitializationStatus.INITIALIZING) {
            synchronized (this.f20232f) {
                z = !mo56539a(fVar);
                if (z) {
                    this.f20231e.put(fVar.mo56151R(), Integer.valueOf(initializationStatus.getCode()));
                    JSONObject jSONObject = new JSONObject();
                    JsonUtils.putString(jSONObject, "class", fVar.mo56151R());
                    JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                    JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                    this.f20230d.put(jSONObject);
                }
            }
            if (z) {
                this.f20227a.mo57348a(fVar);
                this.f20227a.mo57324H().processAdapterInitializationPostback(fVar, j, initializationStatus, str);
                this.f20227a.mo57369aj().mo57290a(initializationStatus, fVar.mo56151R());
            }
        }
    }

    /* renamed from: a */
    public void mo56535a(C8076f fVar, Activity activity) {
        mo56536a(fVar, activity, (Runnable) null);
    }

    /* renamed from: a */
    public void mo56536a(C8076f fVar, Activity activity, Runnable runnable) {
        List<C8076f> list;
        if (this.f20227a.mo57330N().mo56529a() && (list = this.f20233g) != null) {
            Iterator<C8076f> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                C8076f next = it.next();
                if (next.mo56151R().equals(fVar.mo56151R())) {
                    fVar = next;
                    break;
                }
            }
        }
        if (fVar != null) {
            C8241g a = this.f20227a.mo57322F().mo56542a(fVar);
            if (a != null) {
                if (C8626v.m26252a()) {
                    C8626v vVar = this.f20228b;
                    vVar.mo57820c("MediationAdapterInitializationManager", "Initializing adapter " + fVar);
                }
                a.mo56555a((MaxAdapterInitializationParameters) MaxAdapterParametersImpl.m23995a(fVar), activity, runnable);
            } else if (runnable != null) {
                runnable.run();
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public void mo56537a(MaxAdapter.InitializationStatus initializationStatus) {
        synchronized (this.f20232f) {
            this.f20231e.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", Integer.valueOf(initializationStatus.getCode()));
        }
        this.f20227a.mo57369aj().mo57290a(initializationStatus, "com.applovin.mediation.adapters.AppLovinMediationAdapter");
    }

    /* renamed from: a */
    public boolean mo56538a() {
        return this.f20229c.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo56539a(C8076f fVar) {
        boolean containsKey;
        synchronized (this.f20232f) {
            containsKey = this.f20231e.containsKey(fVar.mo56151R());
        }
        return containsKey;
    }

    /* renamed from: b */
    public LinkedHashMap<String, Integer> mo56540b() {
        LinkedHashMap<String, Integer> linkedHashMap;
        synchronized (this.f20232f) {
            linkedHashMap = this.f20231e;
        }
        return linkedHashMap;
    }

    /* renamed from: c */
    public JSONArray mo56541c() {
        JSONArray jSONArray;
        synchronized (this.f20232f) {
            jSONArray = this.f20230d;
        }
        return jSONArray;
    }
}
