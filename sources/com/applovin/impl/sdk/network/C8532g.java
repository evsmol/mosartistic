package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8550r;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.g */
public class C8532g extends C8401a {

    /* renamed from: a */
    private static final long f21529a = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: e */
    private final AtomicLong f21530e = new AtomicLong();

    /* renamed from: f */
    private final C8528f f21531f;

    /* renamed from: g */
    private final C8626v f21532g;

    C8532g(C8528f fVar, C8490n nVar) {
        super("PersistentPostbackQueueSaveTask", nVar);
        this.f21532g = nVar.mo57320D();
        this.f21531f = fVar;
    }

    /* renamed from: a */
    private void m25868a(List<C8533h> list) {
        JSONArray jSONArray = new JSONArray();
        for (C8533h n : list) {
            try {
                jSONArray.put(n.mo57593n());
            } catch (Throwable th) {
                if (C8626v.m26252a()) {
                    this.f21532g.mo57819b("PersistentPostbackQueueSaveTask", "Unable to serialize postback request to JSON.", th);
                }
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pb", jSONArray);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jSONObject.toString().getBytes("UTF-8"));
            C8550r ae = this.f21118b.mo57364ae();
            ae.mo57659a((InputStream) byteArrayInputStream, ae.mo57652a("persistent_postback_cache.json", this.f21118b.mo57332P()));
            if (C8626v.m26252a()) {
                this.f21532g.mo57818b("PersistentPostbackQueueSaveTask", "Wrote updated postback queue to disk.");
            }
        } catch (Throwable th2) {
            if (C8626v.m26252a()) {
                this.f21532g.mo57819b("PersistentPostbackQueueSaveTask", "Failed to persist postbacks", th2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<C8533h> mo57575a(int i) {
        ArrayList<C8533h> arrayList = new ArrayList<>();
        try {
            C8550r ae = this.f21118b.mo57364ae();
            if (ae.mo57662b("persistent_postback_cache.json", this.f21118b.mo57332P())) {
                String a = ae.mo57656a(ae.mo57652a("persistent_postback_cache.json", this.f21118b.mo57332P()));
                if (StringUtils.isValidString(a)) {
                    JSONArray jSONArray = new JSONObject(a).getJSONArray("pb");
                    if (C8626v.m26252a()) {
                        C8626v vVar = this.f21532g;
                        vVar.mo57818b("PersistentPostbackQueueSaveTask", "Deserializing " + jSONArray.length() + " postback(s).");
                    }
                    arrayList.ensureCapacity(Math.max(1, jSONArray.length()));
                    int intValue = ((Integer) this.f21118b.mo57342a(C8380b.f20820cQ)).intValue();
                    for (int i2 = 0; i2 < jSONArray.length() && arrayList.size() < i; i2++) {
                        C8533h hVar = new C8533h(jSONArray.getJSONObject(i2), this.f21118b);
                        if (hVar.mo57590k() < intValue) {
                            arrayList.add(hVar);
                        } else if (C8626v.m26252a()) {
                            C8626v vVar2 = this.f21532g;
                            vVar2.mo57818b("PersistentPostbackQueueSaveTask", "Skipping deserialization because maximum attempt count exceeded for postback: " + hVar);
                        }
                    }
                    if (C8626v.m26252a()) {
                        C8626v vVar3 = this.f21532g;
                        vVar3.mo57818b("PersistentPostbackQueueSaveTask", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
                    }
                }
            }
        } catch (Throwable th) {
            if (C8626v.m26252a()) {
                this.f21532g.mo57819b("PersistentPostbackQueueSaveTask", "Failed to deserialize postback queue", th);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo57576a() {
        this.f21530e.set(System.currentTimeMillis());
        this.f21118b.mo57337V().mo57229a((C8401a) this, C8432o.C8434a.POSTBACKS, f21529a);
    }

    public void run() {
        if (this.f21531f.mo57567a() > this.f21530e.get()) {
            m25868a(this.f21531f.mo57571b());
        }
        mo57576a();
    }
}
