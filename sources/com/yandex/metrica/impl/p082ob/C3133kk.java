package com.yandex.metrica.impl.p082ob;

import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.kk */
public class C3133kk {

    /* renamed from: a */
    private final LinkedList<JSONObject> f8197a;

    /* renamed from: b */
    private final C2830b9 f8198b;

    /* renamed from: c */
    private final LinkedList<String> f8199c;

    /* renamed from: d */
    private final C2066Gk f8200d;

    /* renamed from: e */
    private int f8201e;

    C3133kk(int i, C2830b9 b9Var) {
        this(i, b9Var, new C2971fk());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17787a(JSONObject jSONObject) {
        if (this.f8197a.size() == this.f8201e) {
            JSONObject removeLast = this.f8197a.removeLast();
            this.f8199c.removeLast();
        }
        String jSONObject2 = jSONObject.toString();
        this.f8197a.addFirst(jSONObject);
        this.f8199c.addFirst(jSONObject2);
        if (!this.f8199c.isEmpty()) {
            this.f8198b.mo17242a((List<String>) this.f8199c);
        }
    }

    /* renamed from: b */
    public List<JSONObject> mo17788b() {
        return this.f8197a;
    }

    C3133kk(int i, C2830b9 b9Var, C2066Gk gk) {
        this.f8197a = new LinkedList<>();
        this.f8199c = new LinkedList<>();
        this.f8201e = i;
        this.f8198b = b9Var;
        this.f8200d = gk;
        m9912a(b9Var);
    }

    /* renamed from: a */
    private void m9912a(C2830b9 b9Var) {
        List<String> h = b9Var.mo17267h();
        for (int max = Math.max(0, h.size() - this.f8201e); max < h.size(); max++) {
            String str = h.get(max);
            try {
                this.f8197a.addLast(new JSONObject(str));
                this.f8199c.addLast(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo17786a() {
        return this.f8200d.mo15833a(new JSONArray(this.f8197a));
    }
}
