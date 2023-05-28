package com.bytedance.sdk.openadsdk.core.p021e;

import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.p042h.C0793a;
import com.bytedance.sdk.openadsdk.p042h.C0796b;
import com.bytedance.sdk.openadsdk.p042h.p043a.C0794a;
import com.bytedance.sdk.openadsdk.p042h.p043a.C0795b;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.b */
/* compiled from: AdLogInfoModel */
public class C0449b {

    /* renamed from: a */
    public String f1484a;

    /* renamed from: b */
    public int f1485b;

    /* renamed from: c */
    public int f1486c = 1;

    /* renamed from: d */
    public ArrayList<Integer> f1487d;

    /* renamed from: e */
    public AdSlot f1488e;

    /* renamed from: a */
    public static void m1835a(C0449b bVar) {
        if (bVar != null && bVar.mo1211d() != null) {
            C0796b.m3985a().mo2604a((C0793a) new C0793a(bVar) {

                /* renamed from: a */
                final /* synthetic */ C0449b f1489a;

                {
                    this.f1489a = r1;
                }

                /* renamed from: a */
                public C0794a mo322a() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("from", this.f1489a.mo1210c());
                    jSONObject.put("err_code", this.f1489a.mo1208b());
                    jSONObject.put("server_res_str", this.f1489a.mo1203a());
                    if (this.f1489a.mo1212e() != null && this.f1489a.mo1212e().size() > 0) {
                        jSONObject.put("mate_unavailable_code_list", new JSONArray(this.f1489a.mo1212e()).toString());
                    }
                    C10638l.m31231a("AdLogInfoModel", "rd_client_custom_error = ", jSONObject);
                    return C0795b.m3955b().mo2579a("rd_client_custom_error").mo2577a(this.f1489a.mo1211d().getDurationSlotType()).mo2581b(jSONObject.toString());
                }
            });
        }
    }

    /* renamed from: a */
    public String mo1203a() {
        return this.f1484a;
    }

    /* renamed from: a */
    public void mo1204a(int i) {
        this.f1485b = i;
    }

    /* renamed from: a */
    public void mo1205a(AdSlot adSlot) {
        this.f1488e = adSlot;
    }

    /* renamed from: a */
    public void mo1206a(String str) {
        this.f1484a = str;
    }

    /* renamed from: a */
    public void mo1207a(ArrayList<Integer> arrayList) {
        this.f1487d = arrayList;
    }

    /* renamed from: b */
    public int mo1208b() {
        return this.f1485b;
    }

    /* renamed from: b */
    public void mo1209b(int i) {
        this.f1486c = i;
    }

    /* renamed from: c */
    public int mo1210c() {
        return this.f1486c;
    }

    /* renamed from: d */
    public AdSlot mo1211d() {
        return this.f1488e;
    }

    /* renamed from: e */
    public ArrayList<Integer> mo1212e() {
        return this.f1487d;
    }
}
