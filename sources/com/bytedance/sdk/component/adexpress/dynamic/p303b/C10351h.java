package com.bytedance.sdk.component.adexpress.dynamic.p303b;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.b.h */
/* compiled from: DynamicLayoutUnit */
public class C10351h {

    /* renamed from: a */
    private String f25674a;

    /* renamed from: b */
    private float f25675b;

    /* renamed from: c */
    private float f25676c;

    /* renamed from: d */
    private float f25677d;

    /* renamed from: e */
    private float f25678e;

    /* renamed from: f */
    private float f25679f;

    /* renamed from: g */
    private float f25680g;

    /* renamed from: h */
    private float f25681h;

    /* renamed from: i */
    private C10348e f25682i;

    /* renamed from: j */
    private List<C10351h> f25683j;

    /* renamed from: k */
    private C10351h f25684k;

    /* renamed from: l */
    private List<List<C10351h>> f25685l;

    /* renamed from: m */
    private String f25686m;

    /* renamed from: a */
    public String mo63541a() {
        return this.f25686m;
    }

    /* renamed from: a */
    public void mo63545a(String str) {
        this.f25686m = str;
    }

    /* renamed from: b */
    public String mo63547b() {
        return this.f25674a;
    }

    /* renamed from: b */
    public void mo63550b(String str) {
        this.f25674a = str;
    }

    /* renamed from: c */
    public float mo63552c() {
        return this.f25677d;
    }

    /* renamed from: a */
    public void mo63542a(float f) {
        this.f25677d = f;
    }

    /* renamed from: d */
    public float mo63554d() {
        return this.f25678e;
    }

    /* renamed from: b */
    public void mo63548b(float f) {
        this.f25678e = f;
    }

    /* renamed from: e */
    public float mo63556e() {
        return this.f25675b;
    }

    /* renamed from: c */
    public void mo63553c(float f) {
        this.f25675b = f;
    }

    /* renamed from: f */
    public float mo63558f() {
        return this.f25676c;
    }

    /* renamed from: d */
    public void mo63555d(float f) {
        this.f25676c = f;
    }

    /* renamed from: g */
    public float mo63560g() {
        return this.f25679f;
    }

    /* renamed from: e */
    public void mo63557e(float f) {
        this.f25679f = f;
    }

    /* renamed from: h */
    public float mo63562h() {
        return this.f25680g;
    }

    /* renamed from: f */
    public void mo63559f(float f) {
        this.f25680g = f;
    }

    /* renamed from: g */
    public void mo63561g(float f) {
        this.f25681h = f;
    }

    /* renamed from: i */
    public C10348e mo63563i() {
        return this.f25682i;
    }

    /* renamed from: a */
    public void mo63543a(C10348e eVar) {
        this.f25682i = eVar;
    }

    /* renamed from: j */
    public List<C10351h> mo63564j() {
        return this.f25683j;
    }

    /* renamed from: a */
    public void mo63546a(List<C10351h> list) {
        this.f25683j = list;
    }

    /* renamed from: a */
    public void mo63544a(C10351h hVar) {
        if (this.f25683j == null) {
            this.f25683j = new ArrayList();
        }
        this.f25683j.add(hVar);
    }

    /* renamed from: b */
    public void mo63549b(C10351h hVar) {
        this.f25684k = hVar;
    }

    /* renamed from: k */
    public C10351h mo63565k() {
        return this.f25684k;
    }

    /* renamed from: l */
    public int mo63566l() {
        C10349f e = this.f25682i.mo63363e();
        return e.mo63368C() + e.mo63369D();
    }

    /* renamed from: m */
    public int mo63567m() {
        C10349f e = this.f25682i.mo63363e();
        return e.mo63366A() + e.mo63367B();
    }

    /* renamed from: n */
    public float mo63568n() {
        C10349f e = this.f25682i.mo63363e();
        return ((float) mo63566l()) + e.mo63441g() + e.mo63446h() + (e.mo63426d() * 2.0f);
    }

    /* renamed from: o */
    public float mo63569o() {
        C10349f e = this.f25682i.mo63363e();
        return ((float) mo63567m()) + e.mo63451i() + e.mo63436f() + (e.mo63426d() * 2.0f);
    }

    /* renamed from: b */
    public void mo63551b(List<List<C10351h>> list) {
        this.f25685l = list;
    }

    /* renamed from: p */
    public List<List<C10351h>> mo63570p() {
        return this.f25685l;
    }

    /* renamed from: q */
    public boolean mo63571q() {
        List<C10351h> list = this.f25683j;
        return list == null || list.size() <= 0;
    }

    /* renamed from: r */
    public void mo63572r() {
        List<List<C10351h>> list = this.f25685l;
        if (list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (List next : this.f25685l) {
                if (next != null && next.size() > 0) {
                    arrayList.add(next);
                }
            }
            this.f25685l = arrayList;
        }
    }

    /* renamed from: s */
    public boolean mo63573s() {
        return TextUtils.equals(this.f25682i.mo63363e().mo63484r(), "flex");
    }

    public String toString() {
        return "DynamicLayoutUnit{id='" + this.f25674a + '\'' + ", x=" + this.f25675b + ", y=" + this.f25676c + ", width=" + this.f25679f + ", height=" + this.f25680g + ", remainWidth=" + this.f25681h + ", rootBrick=" + this.f25682i + ", childrenBrickUnits=" + this.f25683j + '}';
    }

    /* renamed from: a */
    public static void m30083a(JSONObject jSONObject, C10351h hVar, C10351h hVar2) {
        if (jSONObject != null && hVar != null) {
            hVar.mo63550b(jSONObject.optString("id", "root"));
            hVar.mo63553c((float) jSONObject.optDouble("x", 0.0d));
            hVar.mo63555d((float) jSONObject.optDouble("y", 0.0d));
            hVar.mo63557e((float) jSONObject.optDouble(IabUtils.KEY_WIDTH, 0.0d));
            hVar.mo63559f((float) jSONObject.optDouble(IabUtils.KEY_HEIGHT, 0.0d));
            hVar.mo63561g((float) jSONObject.optDouble("remainWidth", 0.0d));
            C10348e eVar = new C10348e();
            C10348e.m29890a(jSONObject.optJSONObject("brick"), eVar);
            hVar.mo63543a(eVar);
            hVar.mo63549b(hVar2);
            JSONArray optJSONArray = jSONObject.optJSONArray("children");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    Object opt = optJSONArray.opt(i);
                    if (opt != null && !"null".equals(opt.toString()) && (opt instanceof JSONArray)) {
                        int i2 = 0;
                        while (true) {
                            JSONArray jSONArray = (JSONArray) opt;
                            if (i2 >= jSONArray.length()) {
                                break;
                            }
                            JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                            C10351h hVar3 = new C10351h();
                            m30083a(optJSONObject, hVar3, hVar);
                            hVar.mo63544a(hVar3);
                            i2++;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: t */
    public boolean mo63574t() {
        return this.f25682i.mo63363e().mo63388W() < 0 || this.f25682i.mo63363e().mo63389X() < 0 || this.f25682i.mo63363e().mo63386U() < 0 || this.f25682i.mo63363e().mo63387V() < 0;
    }
}
