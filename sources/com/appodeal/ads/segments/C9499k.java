package com.appodeal.ads.segments;

import com.appnext.core.p267a.C8894b;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.segments.C9499k;
import com.appodeal.ads.utils.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.segments.k */
public final class C9499k {

    /* renamed from: a */
    public final long f24113a;

    /* renamed from: b */
    public final C9500a f24114b;

    /* renamed from: c */
    public final int f24115c;

    /* renamed from: d */
    public final C9494i[] f24116d;

    /* renamed from: e */
    public final JSONArray f24117e;

    public C9499k(JSONObject jSONObject) {
        this.f24113a = (long) jSONObject.optInt("id", -1);
        this.f24114b = new C9500a(jSONObject);
        this.f24116d = C9495j.m28103a(jSONObject);
        this.f24115c = C9484a.m28061a(jSONObject.optString("match_rule", ""));
        this.f24117e = jSONObject.optJSONArray("placements");
    }

    /* renamed from: a */
    public final void mo60751a() {
        TreeMap<String, C9490g> treeMap = C9492h.f24097a;
        if (this.f24117e == null) {
            treeMap.clear();
            return;
        }
        TreeMap treeMap2 = new TreeMap();
        for (int i = 0; i < this.f24117e.length(); i++) {
            C9490g a = C9490g.m28074a(this.f24117e.getJSONObject(i));
            if (a != null) {
                C9490g gVar = C9492h.f24097a.get(a.f24090b);
                a.f24094f = gVar != null ? gVar.f24094f : 0;
                treeMap2.put(a.f24090b, a);
            }
        }
        treeMap.clear();
        treeMap.putAll(treeMap2);
    }

    /* renamed from: b */
    public final long mo60752b() {
        return this.f24113a;
    }

    /* renamed from: c */
    public final C9500a mo60753c() {
        return this.f24114b;
    }

    /* renamed from: com.appodeal.ads.segments.k$a */
    public static class C9500a {

        /* renamed from: a */
        public final JSONObject f24118a;

        public C9500a(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject(C8894b.f22527hW);
            this.f24118a = optJSONObject == null ? new JSONObject() : optJSONObject;
        }

        /* renamed from: a */
        public static /* synthetic */ int m28124a(Set set, JSONObject jSONObject, JSONObject jSONObject2) {
            if (!set.contains(jSONObject.optString("status")) && !set.contains(jSONObject2.optString("status"))) {
                return 0;
            }
            double optDouble = jSONObject2.optDouble("ecpm") - jSONObject.optDouble("ecpm");
            if (optDouble == 0.0d) {
                return 0;
            }
            return optDouble < 0.0d ? -1 : 1;
        }

        /* renamed from: a */
        public static void m28125a(ArrayList arrayList, HashSet hashSet) {
            if (!hashSet.isEmpty()) {
                Collections.sort(arrayList, new Comparator(hashSet) {
                    public final /* synthetic */ Set f$0;

                    {
                        this.f$0 = r1;
                    }

                    public final int compare(Object obj, Object obj2) {
                        return C9499k.C9500a.m28124a(this.f$0, (JSONObject) obj, (JSONObject) obj2);
                    }
                });
            }
        }

        /* renamed from: a */
        public static void m28126a(ArrayList arrayList, HashSet hashSet, JSONObject jSONObject) {
            boolean z;
            if (!hashSet.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject2 = (JSONObject) it.next();
                    String optString = jSONObject2.optString("status", (String) null);
                    String optString2 = jSONObject2.optString(AppMeasurementSdk.ConditionalUserProperty.NAME, (String) null);
                    if (optString2 != null && !optString2.isEmpty()) {
                        optString = optString2;
                    }
                    if (optString != null && !optString.isEmpty() && hashSet.contains(optString)) {
                        if (!jSONObject2.has("cap")) {
                            String optString3 = jSONObject2.optString("id");
                            String optString4 = jSONObject2.optString("status");
                            String optString5 = jSONObject2.optString(AppMeasurementSdk.ConditionalUserProperty.NAME, (String) null);
                            if (optString5 != null && !optString5.isEmpty()) {
                                optString4 = optString5;
                            }
                            Iterator it2 = arrayList.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z = false;
                                    break;
                                }
                                JSONObject jSONObject3 = (JSONObject) it2.next();
                                String optString6 = jSONObject3.optString("id");
                                if (optString6 == null || !optString6.equals(optString3)) {
                                    String optString7 = jSONObject3.optString("status");
                                    String optString8 = jSONObject3.optString(AppMeasurementSdk.ConditionalUserProperty.NAME, (String) null);
                                    if (optString8 != null && !optString8.isEmpty()) {
                                        optString7 = optString8;
                                    }
                                    if (optString7 != null && optString7.equals(optString4)) {
                                        z = true;
                                        break;
                                    }
                                }
                            }
                            if (z) {
                            }
                        } else if (jSONObject2.getBoolean("cap")) {
                            it.remove();
                        }
                        jSONObject2.put("ecpm", jSONObject.getDouble(optString));
                    }
                }
            }
        }

        /* renamed from: a */
        public final boolean mo60755a(AdType adType) {
            JSONArray optJSONArray = this.f24118a.optJSONArray("disable_type");
            if (optJSONArray == null) {
                return false;
            }
            return optJSONArray.toString().contains(String.format("\"%s\"", new Object[]{C9502m.m28129a(adType)}));
        }

        /* renamed from: a */
        public final void mo60754a(ArrayList arrayList, AdType adType) {
            try {
                JSONObject optJSONObject = this.f24118a.optJSONObject("disable_networks");
                JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray(C9502m.m28129a(adType)) : null;
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                if (optJSONArray.length() != 0) {
                    HashSet hashSet = new HashSet(optJSONArray.length());
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        hashSet.add(optJSONArray.getString(i));
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        JSONObject jSONObject = (JSONObject) it.next();
                        String optString = jSONObject.optString("status", (String) null);
                        String optString2 = jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME, (String) null);
                        if ((optString != null && !optString.isEmpty() && hashSet.contains(optString)) || (optString2 != null && !optString2.isEmpty() && hashSet.contains(optString2))) {
                            it.remove();
                        }
                    }
                }
            } catch (Exception e) {
                Log.log(e);
            }
        }
    }
}
