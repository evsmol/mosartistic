package com.yandex.metrica.impl.p082ob;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.t3 */
public final class C3493t3 implements C2672W<Map<String, ? extends String>> {
    public Object invoke(Object obj) {
        String asString = ((ContentValues) obj).getAsString("clids");
        HashMap<String, String> d = C2572Tl.m8540d(asString);
        if (C2572Tl.m8541d((Map<String, String>) d)) {
            return d;
        }
        C3015h2.m9664b("Passed clids (" + asString + ") are invalid.", new Object[0]);
        return null;
    }
}
