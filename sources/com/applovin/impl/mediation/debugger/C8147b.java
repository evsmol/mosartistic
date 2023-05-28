package com.applovin.impl.mediation.debugger;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.mediation.debugger.p238b.p239a.C8152a;
import com.applovin.impl.mediation.debugger.p238b.p240b.C8158b;
import com.applovin.impl.mediation.debugger.p238b.p241c.C8160b;
import com.applovin.impl.mediation.debugger.p242c.C8171c;
import com.applovin.impl.mediation.debugger.p243ui.p245b.C8201b;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.network.C8511b;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.utils.C8561a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxDebuggerActivity;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.b */
public class C8147b implements C8511b.C8515c<JSONObject> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static WeakReference<MaxDebuggerActivity> f19867a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final AtomicBoolean f19868b = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C8490n f19869c;

    /* renamed from: d */
    private final C8626v f19870d;

    /* renamed from: e */
    private final Context f19871e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C8201b f19872f;

    /* renamed from: g */
    private final Map<String, C8160b> f19873g = CollectionUtils.map();

    /* renamed from: h */
    private final AtomicBoolean f19874h = new AtomicBoolean();

    /* renamed from: i */
    private boolean f19875i;

    /* renamed from: j */
    private int f19876j = 2;

    /* renamed from: k */
    private boolean f19877k;

    /* renamed from: l */
    private Map<String, List<?>> f19878l;

    /* renamed from: m */
    private final C8141a f19879m;

    public C8147b(C8490n nVar) {
        this.f19869c = nVar;
        this.f19870d = nVar.mo57320D();
        this.f19871e = nVar.mo57332P();
        C8201b bVar = new C8201b(this.f19871e);
        this.f19872f = bVar;
        this.f19879m = new C8141a(nVar, bVar);
    }

    /* renamed from: a */
    private C8158b m24401a(JSONObject jSONObject) {
        return new C8158b(JsonUtils.getString(jSONObject, "required_app_ads_txt_entry", ""));
    }

    /* renamed from: a */
    private List<C8152a> m24403a(List<C8152a> list, C8490n nVar) {
        List<String> initializationAdUnitIds = nVar.mo57400q().getInitializationAdUnitIds();
        if (initializationAdUnitIds == null || initializationAdUnitIds.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(initializationAdUnitIds.size());
        for (C8152a next : list) {
            if (initializationAdUnitIds.contains(next.mo56324a())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private List<C8160b> m24404a(JSONObject jSONObject, C8490n nVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "networks", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                C8160b bVar = new C8160b(jSONObject2, nVar);
                arrayList.add(bVar);
                this.f19873g.put(bVar.mo56377m(), bVar);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private List<C8152a> m24405a(JSONObject jSONObject, List<C8160b> list, C8490n nVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ad_units", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new C8152a(jSONObject2, this.f19873g, nVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private void m24406a(List<C8160b> list) {
        boolean z;
        Iterator<C8160b> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            C8160b next = it.next();
            if (next.mo56369e() && next.mo56364a() == C8160b.C8161a.INVALID_INTEGRATION) {
                z = true;
                break;
            }
        }
        if (z) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    Activity ar = C8147b.this.f19869c.mo57377ar();
                    if (ar == null || ar.isFinishing()) {
                        C8626v.m26258i("AppLovinSdk", "MAX Mediation Debugger has flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this log will only be shown in your development builds. Live apps will not be affected.");
                    } else {
                        new AlertDialog.Builder(ar).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                                C8147b.this.mo56318c();
                            }
                        }).setNegativeButton("DISMISS", (DialogInterface.OnClickListener) null).create().show();
                    }
                }
            }, TimeUnit.SECONDS.toMillis(2));
        }
    }

    /* renamed from: f */
    private void m24412f() {
        this.f19869c.mo57368ai().mo56832a(new C8561a() {
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (activity instanceof MaxDebuggerActivity) {
                    C8626v.m26255f("AppLovinSdk", "Started mediation debugger");
                    if (!C8147b.this.m24413g() || C8147b.f19867a.get() != activity) {
                        MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                        WeakReference unused = C8147b.f19867a = new WeakReference(maxDebuggerActivity);
                        maxDebuggerActivity.setListAdapter(C8147b.this.f19872f, C8147b.this.f19869c.mo57368ai());
                    }
                    C8147b.f19868b.set(false);
                }
            }

            public void onActivityDestroyed(Activity activity) {
                if (activity instanceof MaxDebuggerActivity) {
                    C8626v.m26255f("AppLovinSdk", "Mediation debugger destroyed");
                    WeakReference unused = C8147b.f19867a = null;
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m24413g() {
        WeakReference<MaxDebuggerActivity> weakReference = f19867a;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* renamed from: a */
    public List<?> mo56311a(String str) {
        Map<String, List<?>> map = this.f19878l;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return this.f19878l.get(str);
    }

    /* renamed from: a */
    public void mo56312a() {
        if (this.f19874h.compareAndSet(false, true)) {
            this.f19869c.mo57337V().mo57228a((C8401a) new C8171c(this, this.f19869c), C8432o.C8434a.MEDIATION_MAIN);
        }
    }

    /* renamed from: a */
    public void mo56275a(int i, String str, JSONObject jSONObject) {
        if (C8626v.m26252a()) {
            C8626v vVar = this.f19870d;
            vVar.mo57822e("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i);
        }
        C8626v.m26258i("AppLovinSdk", "Unable to show mediation debugger.");
        this.f19872f.mo56447a((List<C8160b>) null, (List<C8152a>) null, (List<C8152a>) null, (C8158b) null, (String) null, (String) null, (String) null, this.f19869c);
        this.f19874h.set(false);
    }

    /* renamed from: a */
    public void mo56314a(Map<String, List<?>> map) {
        this.f19878l = map;
        mo56312a();
        if (m24413g() || !f19868b.compareAndSet(false, true)) {
            C8626v.m26258i("AppLovinSdk", "Mediation debugger is already showing");
            return;
        }
        if (!this.f19877k) {
            m24412f();
            this.f19877k = true;
        }
        Intent intent = new Intent(this.f19871e, MaxDebuggerActivity.class);
        intent.setFlags(268435456);
        C8626v.m26255f("AppLovinSdk", "Starting mediation debugger...");
        this.f19871e.startActivity(intent);
    }

    /* renamed from: a */
    public void mo56277a(JSONObject jSONObject, int i) {
        List<C8160b> a = m24404a(jSONObject, this.f19869c);
        List<C8152a> a2 = m24405a(jSONObject, a, this.f19869c);
        List<C8152a> a3 = m24403a(a2, this.f19869c);
        C8158b a4 = m24401a(jSONObject);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        List<C8160b> list = a;
        C8158b bVar = a4;
        this.f19872f.mo56447a(list, a2, a3, bVar, JsonUtils.getString(jSONObject2, "title", (String) null), JsonUtils.getString(jSONObject2, "message", (String) null), JsonUtils.getString(jSONObject, "account_id", (String) null), this.f19869c);
        if (a4.mo56354e()) {
            this.f19879m.mo56300a();
        }
        if (mo56317b()) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    C8147b.this.mo56318c();
                }
            }, TimeUnit.SECONDS.toMillis((long) this.f19876j));
        } else {
            m24406a(a);
        }
    }

    /* renamed from: a */
    public void mo56316a(boolean z, int i) {
        this.f19875i = z;
        this.f19876j = i;
    }

    /* renamed from: b */
    public boolean mo56317b() {
        return this.f19875i;
    }

    /* renamed from: c */
    public void mo56318c() {
        mo56314a((Map<String, List<?>>) null);
    }

    public String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.f19872f + "}";
    }
}
