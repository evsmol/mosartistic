package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.xh */
public class C3669xh {

    /* renamed from: a */
    private final C3641x2 f9475a;

    /* renamed from: b */
    private final C3625wh f9476b;

    public C3669xh(C3625wh whVar) {
        this(whVar, new C3641x2());
    }

    /* renamed from: a */
    public long mo18411a(int i) {
        return m11038a().optLong(String.valueOf(i));
    }

    C3669xh(C3625wh whVar, C3641x2 x2Var) {
        this.f9476b = whVar;
        this.f9475a = x2Var;
    }

    /* renamed from: a */
    public void mo18412a(int i, long j) {
        JSONObject a = m11038a();
        try {
            a.put(String.valueOf(i), j);
        } catch (Throwable unused) {
        }
        this.f9476b.mo18373a(a.toString());
    }

    /* renamed from: a */
    public void mo18413a(long j) {
        ArrayList arrayList = new ArrayList();
        JSONObject a = m11038a();
        Iterator<String> keys = a.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            long optLong = a.optLong(next);
            C3641x2 x2Var = this.f9475a;
            if (x2Var.mo18390b(optLong, j, "last socket open on " + next)) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a.remove((String) it.next());
            }
            this.f9476b.mo18373a(a.toString());
        }
    }

    /* renamed from: a */
    private JSONObject m11038a() {
        JSONObject jSONObject = new JSONObject();
        String a = this.f9476b.mo18372a();
        if (TextUtils.isEmpty(a)) {
            return jSONObject;
        }
        try {
            return new JSONObject(a);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }
}
