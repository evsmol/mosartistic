package com.ironsource.environment;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ironsource.environment.k */
public class C4412k {

    /* renamed from: a */
    private static final String f10511a = C4412k.class.getSimpleName();

    /* renamed from: b */
    private static final ArrayList<String> f10512b = new ArrayList<String>() {
        {
            add("com.google.market");
            add("com.android.vending");
        }
    };

    /* renamed from: a */
    private static JSONObject m12592a(Context context, ArrayList<String> arrayList) {
        JSONObject jSONObject = new JSONObject();
        try {
            ArrayList<String> b = m12594b(context);
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                final boolean contains = b.contains(next.trim().toLowerCase());
                jSONObject.put(next, new JSONObject() {
                    {
                        put("isInstalled", contains);
                    }
                });
            }
        } catch (Exception unused) {
            Log.d(f10511a, "Error while extracting packages installation data");
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static boolean m12593a(Context context) {
        JSONObject a = m12592a(context, f10512b);
        Iterator<String> keys = a.keys();
        while (keys.hasNext()) {
            JSONObject optJSONObject = a.optJSONObject(keys.next());
            if (optJSONObject != null && optJSONObject.optBoolean("isInstalled")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static ArrayList<String> m12594b(Context context) {
        List<ApplicationInfo> p = C4407h.m12576p(context);
        ArrayList<String> arrayList = new ArrayList<>();
        for (ApplicationInfo next : p) {
            if (next != null) {
                arrayList.add(next.packageName.toLowerCase());
            }
        }
        return arrayList;
    }
}
