package com.bytedance.sdk.component.p293a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.component.p293a.C10233k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.a.v */
/* compiled from: PermissionConfig */
class C10250v {

    /* renamed from: a */
    private final Map<String, List<C10253b>> f25315a = new ConcurrentHashMap();

    /* renamed from: b */
    private final LruCache<String, C10254c> f25316b;

    /* renamed from: c */
    private final C10233k.C10234a f25317c;

    /* renamed from: d */
    private final String f25318d;

    /* renamed from: e */
    private volatile boolean f25319e = false;

    /* renamed from: com.bytedance.sdk.component.a.v$c */
    /* compiled from: PermissionConfig */
    static final class C10254c {

        /* renamed from: a */
        C10257x f25326a = C10257x.PUBLIC;

        /* renamed from: b */
        Set<String> f25327b = new HashSet();

        /* renamed from: c */
        Set<String> f25328c = new HashSet();

        C10254c() {
        }
    }

    C10250v(String str, int i, C10233k.C10234a aVar, final Executor executor, JSONObject jSONObject) {
        this.f25318d = str;
        if (i <= 0) {
            this.f25316b = new LruCache<>(16);
        } else {
            this.f25316b = new LruCache<>(i);
        }
        this.f25317c = aVar;
        if (jSONObject == null) {
            aVar.mo63052a(m29442d(str), (C10233k.C10234a.C10235a) new C10233k.C10234a.C10235a() {
            });
        } else {
            mo63083a(jSONObject);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63083a(JSONObject jSONObject) {
        m29439b(jSONObject);
        this.f25317c.mo63053a(m29442d(this.f25318d), jSONObject.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10254c mo63082a(String str, Set<String> set) {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String authority = parse.getAuthority();
        String builder = new Uri.Builder().scheme(scheme).authority(authority).path(parse.getPath()).toString();
        C10254c cVar = new C10254c();
        if (authority == null || authority.isEmpty()) {
            cVar.f25326a = C10257x.PUBLIC;
            return cVar;
        }
        for (String next : set) {
            if (!authority.equals(next)) {
                if (authority.endsWith("." + next)) {
                }
            }
            cVar.f25326a = C10257x.PRIVATE;
            return cVar;
        }
        C10254c cVar2 = this.f25316b.get(builder);
        if (cVar2 != null) {
            return cVar2;
        }
        return m29437a(builder);
    }

    /* renamed from: b */
    private void m29439b(JSONObject jSONObject) {
        this.f25315a.clear();
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(AppLovinEventTypes.USER_VIEWED_CONTENT);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray jSONArray = jSONObject2.getJSONArray(next);
                LinkedList linkedList = new LinkedList();
                this.f25315a.put(next, linkedList);
                for (int i = 0; i < jSONArray.length(); i++) {
                    linkedList.add(m29440c(jSONArray.getJSONObject(i)));
                }
            }
        } catch (JSONException e) {
            C10231i.m29380b("Parse configurations failed, response: " + jSONObject.toString(), e);
        }
        this.f25319e = true;
    }

    /* renamed from: a */
    private C10254c m29437a(String str) throws C10252a {
        C10254c cVar = new C10254c();
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String authority = parse.getAuthority();
        String b = m29438b(authority);
        if (TextUtils.isEmpty(scheme) || TextUtils.isEmpty(authority) || b == null) {
            cVar.f25326a = C10257x.PUBLIC;
            return cVar;
        }
        List<C10253b> c = m29441c(b);
        if (c == null) {
            return cVar;
        }
        for (C10253b next : c) {
            if (next.f25322a.matcher(str).find()) {
                if (next.f25323b.compareTo(cVar.f25326a) >= 0) {
                    cVar.f25326a = next.f25323b;
                }
                cVar.f25327b.addAll(next.f25324c);
                cVar.f25328c.addAll(next.f25325d);
            }
        }
        this.f25316b.put(str, cVar);
        return cVar;
    }

    /* renamed from: com.bytedance.sdk.component.a.v$a */
    /* compiled from: PermissionConfig */
    static class C10252a extends IllegalStateException {
        C10252a(String str) {
            super(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r1 = r4.split("[.]");
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m29438b(java.lang.String r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "[.]"
            java.lang.String[] r1 = r4.split(r1)
            int r2 = r1.length
            r3 = 2
            if (r2 >= r3) goto L_0x000f
            return r0
        L_0x000f:
            if (r2 != r3) goto L_0x0012
            return r4
        L_0x0012:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r0 = r2 + -2
            r0 = r1[r0]
            r4.append(r0)
            java.lang.String r0 = "."
            r4.append(r0)
            int r2 = r2 + -1
            r0 = r1[r2]
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p293a.C10250v.m29438b(java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    private List<C10253b> m29441c(String str) throws C10252a {
        if (this.f25319e) {
            return this.f25315a.get(str);
        }
        throw new C10252a("Permission config is outdated!");
    }

    /* renamed from: c */
    private static C10253b m29440c(JSONObject jSONObject) throws JSONException {
        C10253b bVar = new C10253b();
        bVar.f25322a = Pattern.compile(jSONObject.getString("pattern"));
        bVar.f25323b = C10257x.m29449a(jSONObject.getString("group"));
        bVar.f25324c = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("included_methods");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                bVar.f25324c.add(optJSONArray.getString(i));
            }
        }
        bVar.f25325d = new ArrayList();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("excluded_methods");
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                bVar.f25325d.add(optJSONArray2.getString(i2));
            }
        }
        return bVar;
    }

    /* renamed from: d */
    private static String m29442d(String str) {
        return "com.bytedance.ies.web.jsbridge2.PermissionConfig." + str;
    }

    /* renamed from: com.bytedance.sdk.component.a.v$b */
    /* compiled from: PermissionConfig */
    private static final class C10253b {

        /* renamed from: a */
        Pattern f25322a;

        /* renamed from: b */
        C10257x f25323b;

        /* renamed from: c */
        List<String> f25324c;

        /* renamed from: d */
        List<String> f25325d;

        private C10253b() {
        }
    }
}
