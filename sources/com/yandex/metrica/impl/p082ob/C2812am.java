package com.yandex.metrica.impl.p082ob;

import java.util.HashMap;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.am */
public class C2812am extends HashMap<String, String> {

    /* renamed from: a */
    private int f7404a = 0;

    public C2812am() {
    }

    /* renamed from: a */
    public String put(String str, String str2) {
        if (containsKey(str)) {
            if (str2 == null) {
                return remove(str);
            }
            String str3 = (String) get(str);
            this.f7404a += str2.length() - (str3 == null ? 0 : str3.length());
            return (String) super.put(str, str2);
        } else if (str2 == null) {
            return null;
        } else {
            this.f7404a += str.length() + str2.length();
            return (String) super.put(str, str2);
        }
    }

    public C2812am(String str) throws JSONException {
        super(C2572Tl.m8542e(str));
        for (String str2 : keySet()) {
            String str3 = (String) get(str2);
            this.f7404a += str2.length() + (str3 == null ? 0 : str3.length());
        }
    }

    /* renamed from: a */
    public String remove(Object obj) {
        int i;
        if (containsKey(obj)) {
            String str = (String) get(obj);
            int i2 = this.f7404a;
            int length = ((String) obj).length();
            if (str == null) {
                i = 0;
            } else {
                i = str.length();
            }
            this.f7404a = i2 - (length + i);
        }
        return (String) super.remove(obj);
    }

    /* renamed from: a */
    public int mo17196a() {
        return this.f7404a;
    }
}
