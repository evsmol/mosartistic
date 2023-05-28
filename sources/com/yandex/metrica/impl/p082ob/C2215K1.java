package com.yandex.metrica.impl.p082ob;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.K1 */
public class C2215K1 {
    /* renamed from: b */
    private Map<String, String> m7598b(String str) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            int lastIndexOf = str.lastIndexOf(63);
            if (lastIndexOf >= 0) {
                str = str.substring(lastIndexOf + 1);
            }
            if (str.contains("=")) {
                for (String str2 : str.split("&")) {
                    int indexOf = str2.indexOf("=");
                    if (indexOf >= 0) {
                        hashMap.put(str2.substring(0, indexOf), str2.substring(indexOf + 1));
                    } else {
                        hashMap.put(str2, "");
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public C3243n0 mo16061a(String str) {
        HashMap hashMap;
        String decode = Uri.decode((String) ((HashMap) m7598b(str)).get("appmetrica_deep_link"));
        if (!TextUtils.isEmpty(decode)) {
            HashMap hashMap2 = (HashMap) m7598b(decode);
            hashMap = new HashMap(hashMap2.size());
            for (Map.Entry entry : hashMap2.entrySet()) {
                hashMap.put(Uri.decode((String) entry.getKey()), Uri.decode((String) entry.getValue()));
            }
        } else {
            hashMap = null;
        }
        return new C3243n0(decode, hashMap, str);
    }
}
