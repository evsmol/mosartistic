package com.appnext.banners;

import java.util.Random;
import org.json.JSONArray;

/* renamed from: com.appnext.banners.j */
public final class C8827j {
    /* renamed from: a */
    public static String m26567a(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            int nextInt = new Random(System.nanoTime()).nextInt(100);
            int i = 0;
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                i += jSONArray.getJSONObject(i2).getInt("p");
                if (nextInt < i) {
                    return jSONArray.getJSONObject(i2).getString("id");
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }
}
