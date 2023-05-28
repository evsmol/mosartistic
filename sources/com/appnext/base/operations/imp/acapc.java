package com.appnext.base.operations.imp;

import android.os.Bundle;
import android.text.TextUtils;
import com.appnext.base.p260a.C8831a;
import com.appnext.base.p260a.p262b.C8836a;
import com.appnext.base.p260a.p262b.C8837b;
import com.appnext.base.p260a.p262b.C8838c;
import com.appnext.base.p264b.C8850d;
import com.appnext.base.p264b.C8855h;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class acapc extends acap {
    public acapc(C8838c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final List<C8837b> mo58789b(List<C8837b> list) {
        Class<acapc> cls = acapc.class;
        List<C8837b> b = super.mo58789b(list);
        if (b == null || b.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (C8837b ai : b) {
            String L = C8855h.m26688aO().mo58752L(ai.mo58695ai());
            if (TextUtils.isEmpty(L)) {
                return null;
            }
            List<C8836a> r = C8831a.m26576X().mo58684Z().mo58718r(L);
            if (r.size() > 0) {
                Integer ag = r.get(0).mo58692ag();
                if (!hashMap.containsKey(ag)) {
                    hashMap.put(ag, 1);
                } else {
                    hashMap.put(ag, Integer.valueOf(((Integer) hashMap.get(ag)).intValue() + 1));
                }
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : hashMap.entrySet()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("category", entry.getKey());
                jSONObject.put("appcount", entry.getValue());
            } catch (Throwable unused) {
            }
            jSONArray.put(jSONObject);
        }
        String K = C8855h.m26688aO().mo58751K(jSONArray.toString());
        if (TextUtils.isEmpty(K)) {
            return null;
        }
        C8837b bVar = new C8837b(cls.getSimpleName(), cls.getSimpleName(), K, new Date(), C8850d.C8851a.JSONArray.getType());
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aG */
    public final C8850d.C8851a mo58784aG() {
        return C8850d.C8851a.JSONArray;
    }

    /* access modifiers changed from: protected */
    public final String getKey() {
        return acapc.class.getSimpleName();
    }
}
