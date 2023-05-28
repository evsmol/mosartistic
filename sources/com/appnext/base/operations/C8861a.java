package com.appnext.base.operations;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.appnext.base.C8829a;
import com.appnext.base.p260a.C8831a;
import com.appnext.base.p260a.p262b.C8837b;
import com.appnext.base.p260a.p262b.C8838c;
import com.appnext.base.p260a.p263c.C8841b;
import com.appnext.base.p260a.p263c.C8843d;
import com.appnext.base.p264b.C8848b;
import com.appnext.base.p264b.C8850d;
import com.appnext.base.p264b.C8856i;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.appnext.base.operations.a */
public abstract class C8861a {

    /* renamed from: em */
    private static final String f22458em = "collectedData";

    /* renamed from: en */
    private static final String f22459en = "collectedDataType";

    /* renamed from: eo */
    private static final String f22460eo = "lastCollectedData";

    /* renamed from: el */
    private C8862a f22461el;

    /* renamed from: ep */
    protected C8838c f22462ep;

    /* renamed from: com.appnext.base.operations.a$a */
    public interface C8862a {
        /* renamed from: aH */
        void mo58793aH();

        /* renamed from: b */
        void mo58794b(C8829a aVar);
    }

    /* renamed from: az */
    protected static boolean m26724az() {
        return true;
    }

    /* renamed from: c */
    protected static HashMap<Pair<String, String>, JSONArray> m26725c(HashMap<Pair<String, String>, JSONArray> hashMap) {
        return hashMap;
    }

    public static void cancel() {
    }

    /* renamed from: aC */
    public abstract void mo58780aC();

    /* renamed from: aD */
    public abstract void mo58781aD();

    /* renamed from: aF */
    public boolean mo58783aF() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public List<C8837b> mo58789b(List<C8837b> list) {
        return list;
    }

    /* access modifiers changed from: protected */
    public abstract List<C8837b> getData();

    /* access modifiers changed from: protected */
    public abstract String getKey();

    public C8861a(C8838c cVar, Bundle bundle, Object obj) {
        this.f22462ep = cVar;
    }

    /* renamed from: a */
    public final void mo58778a(C8862a aVar) {
        this.f22461el = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo58776a(List<C8837b> list) {
        try {
            JSONArray a = C8848b.m26668a(list, true);
            if (a == null || a.length() <= 0) {
                return -1;
            }
            return C8831a.m26576X().mo58685aa().mo58727a(a);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: av */
    public final void mo58785av() {
        Map<String, String> ax;
        try {
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            String key = this.f22462ep.getKey();
            C8856i.m26695aR().putLong(key + C8856i.f22449fz, valueOf.longValue());
            List<C8837b> data = getData();
            if (data != null && !data.isEmpty()) {
                mo58776a(data);
            }
            String key2 = getKey();
            if (data != null) {
                JSONArray d = m26727d(data);
                if (d != null) {
                    C8856i.m26695aR().putString(m26720A(key2), d.toString());
                }
            }
        } catch (Throwable unused) {
            return;
        }
        String key3 = this.f22462ep.getKey();
        try {
            C8856i.m26695aR().putLong(key3 + C8856i.f22448fy, System.currentTimeMillis());
            String str = key3 + C8856i.f22443fA;
            C8856i.m26695aR().putInt(str, C8856i.m26695aR().getInt(str, 0) + 1);
        } catch (Throwable unused2) {
        }
        C8829a aVar = null;
        if (mo58779aA() && (ax = mo58787ax()) != null && !ax.isEmpty()) {
            Long valueOf2 = Long.valueOf(System.currentTimeMillis());
            String key4 = this.f22462ep.getKey();
            Long.valueOf(C8856i.m26695aR().getLong(key4 + C8856i.f22449fz, -1));
            C8856i.m26695aR().putLong(key4 + C8856i.f22449fz, valueOf2.longValue());
            if (!C8848b.m26670a(key4, ax)) {
                aVar = new C8829a(C8829a.C8830a.NoInternet$1d8b5b4a);
            }
        }
        mo58777a(aVar);
    }

    /* renamed from: a */
    private boolean m26722a(Map<String, String> map) {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        String key = this.f22462ep.getKey();
        C8856i aR = C8856i.m26695aR();
        Long.valueOf(aR.getLong(key + C8856i.f22449fz, -1));
        C8856i aR2 = C8856i.m26695aR();
        aR2.putLong(key + C8856i.f22449fz, valueOf.longValue());
        return C8848b.m26670a(key, map);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ay */
    public final C8838c mo58788ay() {
        return this.f22462ep;
    }

    /* renamed from: d */
    private static JSONObject m26728d(C8837b bVar) {
        return C8848b.m26669a(bVar.mo58695ai(), bVar.mo58696aj(), C8850d.C8851a.valueOf(bVar.getDataType()));
    }

    /* renamed from: a */
    public final void mo58777a(C8829a aVar) {
        C8863b.m26748aI().mo58795a(this);
        C8862a aVar2 = this.f22461el;
        if (aVar2 == null) {
            return;
        }
        if (aVar != null) {
            aVar2.mo58794b(aVar);
        } else {
            aVar2.mo58793aH();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aA */
    public boolean mo58779aA() {
        return C8848b.m26671d(this.f22462ep);
    }

    /* renamed from: aB */
    protected static C8843d m26723aB() {
        return C8831a.m26576X().mo58685aa();
    }

    /* renamed from: c */
    private void m26726c(List<String> list) {
        if (!list.isEmpty()) {
            C8841b aa = C8831a.m26576X().mo58685aa();
            for (String u : list) {
                aa.mo58733u(u);
            }
        }
    }

    /* renamed from: aE */
    public final boolean mo58782aE() {
        try {
            String key = this.f22462ep.getKey();
            C8856i aR = C8856i.m26695aR();
            if (System.currentTimeMillis() - Long.valueOf(aR.getLong(key + C8856i.f22449fz, -1)).longValue() >= 900000) {
                return mo58783aF();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(key);
            sb.append(" less then interval");
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aG */
    public C8850d.C8851a mo58784aG() {
        return C8850d.C8851a.String;
    }

    protected static Date getDate() {
        return new Date();
    }

    /* renamed from: a */
    private void m26721a(String str, List<C8837b> list) {
        if (list != null) {
            try {
                JSONArray d = m26727d(list);
                if (d != null) {
                    C8856i.m26695aR().putString(m26720A(str), d.toString());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: A */
    private static String m26720A(String str) {
        return f22460eo + "_" + str;
    }

    /* renamed from: d */
    private static JSONArray m26727d(List<C8837b> list) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    for (C8837b next : list) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(f22458em, next.mo58695ai());
                        jSONObject.put(f22459en, next.getType());
                        jSONArray.put(jSONObject);
                    }
                    return jSONArray;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo58790e(List<C8837b> list) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    JSONArray d = m26727d(list);
                    if (d != null) {
                        String jSONArray = d.toString();
                        String string = C8856i.m26695aR().getString(m26720A(getKey()), (String) null);
                        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(jSONArray) || !string.equals(jSONArray)) {
                            return true;
                        }
                        return false;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aw */
    public final List<C8837b> mo58786aw() {
        return C8831a.m26576X().mo58685aa().mo58735w(this.f22462ep.getKey());
    }

    /* access modifiers changed from: protected */
    /* renamed from: ax */
    public final Map<String, String> mo58787ax() {
        List<C8837b> b;
        List<C8837b> w = C8831a.m26576X().mo58685aa().mo58735w(this.f22462ep.getKey());
        if (w == null || w.isEmpty() || (b = mo58789b(w)) == null || b.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (C8837b next : b) {
            Pair pair = new Pair(next.mo58694ah(), next.getType());
            if (hashMap.containsKey(pair)) {
                ((JSONArray) hashMap.get(pair)).put(m26728d(next));
            } else {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(m26728d(next));
                hashMap.put(pair, jSONArray);
            }
        }
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) ((Pair) entry.getKey()).second;
            hashMap2.put(str, ((JSONArray) entry.getValue()).toString());
            arrayList.add(str);
        }
        String key = this.f22462ep.getKey();
        if (key != null) {
            try {
                C8856i.m26695aR().putInt(key + C8856i.f22443fA, 0);
            } catch (Throwable unused) {
            }
        }
        m26726c((List<String>) arrayList);
        C8848b.m26665F(this.f22462ep.getKey());
        return hashMap2;
    }
}
