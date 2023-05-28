package com.applovin.impl.mediation;

import com.applovin.impl.mediation.p234a.C8070a;
import com.applovin.impl.mediation.p234a.C8076f;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.sdk.AppLovinSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.f */
public class C8239f {

    /* renamed from: a */
    private final Map<String, C8241g> f20234a = Collections.synchronizedMap(CollectionUtils.map(16));

    /* renamed from: b */
    private final C8490n f20235b;

    /* renamed from: c */
    private final C8626v f20236c;

    /* renamed from: d */
    private final Object f20237d = new Object();

    /* renamed from: e */
    private final Map<String, Class<? extends MaxAdapter>> f20238e = CollectionUtils.map();

    /* renamed from: f */
    private final Set<String> f20239f = new HashSet();

    /* renamed from: g */
    private final Object f20240g = new Object();

    /* renamed from: h */
    private final Set<C8240a> f20241h = new HashSet();

    /* renamed from: com.applovin.impl.mediation.f$a */
    private static class C8240a {

        /* renamed from: a */
        private final String f20242a;

        /* renamed from: b */
        private final String f20243b;

        /* renamed from: c */
        private final MaxAdFormat f20244c;

        /* renamed from: d */
        private final JSONObject f20245d;

        C8240a(String str, String str2, C8070a aVar, C8490n nVar) {
            this.f20242a = str;
            this.f20243b = str2;
            JSONObject jSONObject = new JSONObject();
            this.f20245d = jSONObject;
            JsonUtils.putString(jSONObject, "class", str);
            JsonUtils.putString(this.f20245d, "operation", str2);
            if (aVar != null) {
                this.f20244c = aVar.getFormat();
                if (aVar.getFormat() != null) {
                    JsonUtils.putString(this.f20245d, "format", aVar.getFormat().getLabel());
                    return;
                }
                return;
            }
            this.f20244c = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public JSONObject mo56548a() {
            return this.f20245d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C8240a aVar = (C8240a) obj;
            if (!this.f20242a.equals(aVar.f20242a) || !this.f20243b.equals(aVar.f20243b)) {
                return false;
            }
            MaxAdFormat maxAdFormat = this.f20244c;
            MaxAdFormat maxAdFormat2 = aVar.f20244c;
            return maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2);
        }

        public int hashCode() {
            int hashCode = ((this.f20242a.hashCode() * 31) + this.f20243b.hashCode()) * 31;
            MaxAdFormat maxAdFormat = this.f20244c;
            return hashCode + (maxAdFormat != null ? maxAdFormat.hashCode() : 0);
        }

        public String toString() {
            return "DisabledAdapterInfo{className='" + this.f20242a + '\'' + ", operationTag='" + this.f20243b + '\'' + ", format=" + this.f20244c + '}';
        }
    }

    public C8239f(C8490n nVar) {
        if (nVar != null) {
            this.f20235b = nVar;
            this.f20236c = nVar.mo57320D();
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    /* renamed from: a */
    private C8241g m24771a(C8076f fVar, Class<? extends MaxAdapter> cls, boolean z) {
        try {
            return new C8241g(fVar, (MediationAdapterBase) cls.getConstructor(new Class[]{AppLovinSdk.class}).newInstance(new Object[]{this.f20235b.mo57361ab()}), z, this.f20235b);
        } catch (Throwable th) {
            C8626v.m26254c("MediationAdapterManager", "Failed to load adapter: " + fVar, th);
            return null;
        }
    }

    /* renamed from: a */
    private Class<? extends MaxAdapter> m24772a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return cls.asSubclass(MaxAdapter.class);
            }
            C8626v.m26258i("MediationAdapterManager", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C8241g mo56542a(C8076f fVar) {
        return mo56543a(fVar, false);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ca, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0114, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.applovin.impl.mediation.C8241g mo56543a(com.applovin.impl.mediation.p234a.C8076f r10, boolean r11) {
        /*
            r9 = this;
            if (r10 == 0) goto L_0x0118
            java.lang.String r0 = r10.mo56152S()
            java.lang.String r1 = r10.mo56151R()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            if (r2 == 0) goto L_0x0035
            boolean r10 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r10 == 0) goto L_0x0034
            com.applovin.impl.sdk.v r10 = r9.f20236c
            java.lang.String r11 = "MediationAdapterManager"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "No adapter name provided for "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", not loading the adapter "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.mo57822e(r11, r0)
        L_0x0034:
            return r3
        L_0x0035:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x005f
            boolean r10 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r10 == 0) goto L_0x005e
            com.applovin.impl.sdk.v r10 = r9.f20236c
            java.lang.String r11 = "MediationAdapterManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to find default className for '"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "'"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r10.mo57822e(r11, r0)
        L_0x005e:
            return r3
        L_0x005f:
            if (r11 == 0) goto L_0x006c
            java.util.Map<java.lang.String, com.applovin.impl.mediation.g> r2 = r9.f20234a
            java.lang.Object r2 = r2.get(r1)
            com.applovin.impl.mediation.g r2 = (com.applovin.impl.mediation.C8241g) r2
            if (r2 == 0) goto L_0x006c
            return r2
        L_0x006c:
            java.lang.Object r2 = r9.f20237d
            monitor-enter(r2)
            java.util.Set<java.lang.String> r4 = r9.f20239f     // Catch:{ all -> 0x0115 }
            boolean r4 = r4.contains(r1)     // Catch:{ all -> 0x0115 }
            if (r4 != 0) goto L_0x00f0
            java.util.Map<java.lang.String, java.lang.Class<? extends com.applovin.mediation.adapter.MaxAdapter>> r4 = r9.f20238e     // Catch:{ all -> 0x0115 }
            boolean r4 = r4.containsKey(r1)     // Catch:{ all -> 0x0115 }
            if (r4 == 0) goto L_0x0088
            java.util.Map<java.lang.String, java.lang.Class<? extends com.applovin.mediation.adapter.MaxAdapter>> r4 = r9.f20238e     // Catch:{ all -> 0x0115 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x0115 }
            java.lang.Class r4 = (java.lang.Class) r4     // Catch:{ all -> 0x0115 }
            goto L_0x0095
        L_0x0088:
            java.lang.Class r4 = r9.m24772a((java.lang.String) r1)     // Catch:{ all -> 0x0115 }
            if (r4 != 0) goto L_0x0095
            java.util.Set<java.lang.String> r10 = r9.f20239f     // Catch:{ all -> 0x0115 }
            r10.add(r1)     // Catch:{ all -> 0x0115 }
            monitor-exit(r2)     // Catch:{ all -> 0x0115 }
            return r3
        L_0x0095:
            com.applovin.impl.mediation.g r5 = r9.m24771a((com.applovin.impl.mediation.p234a.C8076f) r10, (java.lang.Class<? extends com.applovin.mediation.adapter.MaxAdapter>) r4, (boolean) r11)     // Catch:{ all -> 0x0115 }
            if (r5 == 0) goto L_0x00cb
            boolean r3 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x0115 }
            if (r3 == 0) goto L_0x00b9
            com.applovin.impl.sdk.v r3 = r9.f20236c     // Catch:{ all -> 0x0115 }
            java.lang.String r6 = "MediationAdapterManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }
            r7.<init>()     // Catch:{ all -> 0x0115 }
            java.lang.String r8 = "Loaded "
            r7.append(r8)     // Catch:{ all -> 0x0115 }
            r7.append(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0115 }
            r3.mo57818b(r6, r0)     // Catch:{ all -> 0x0115 }
        L_0x00b9:
            java.util.Map<java.lang.String, java.lang.Class<? extends com.applovin.mediation.adapter.MaxAdapter>> r0 = r9.f20238e     // Catch:{ all -> 0x0115 }
            r0.put(r1, r4)     // Catch:{ all -> 0x0115 }
            if (r11 == 0) goto L_0x00c9
            java.util.Map<java.lang.String, com.applovin.impl.mediation.g> r11 = r9.f20234a     // Catch:{ all -> 0x0115 }
            java.lang.String r10 = r10.mo56151R()     // Catch:{ all -> 0x0115 }
            r11.put(r10, r5)     // Catch:{ all -> 0x0115 }
        L_0x00c9:
            monitor-exit(r2)     // Catch:{ all -> 0x0115 }
            return r5
        L_0x00cb:
            boolean r10 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x0115 }
            if (r10 == 0) goto L_0x00e9
            com.applovin.impl.sdk.v r10 = r9.f20236c     // Catch:{ all -> 0x0115 }
            java.lang.String r11 = "MediationAdapterManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }
            r4.<init>()     // Catch:{ all -> 0x0115 }
            java.lang.String r5 = "Failed to load "
            r4.append(r5)     // Catch:{ all -> 0x0115 }
            r4.append(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0115 }
            r10.mo57822e(r11, r0)     // Catch:{ all -> 0x0115 }
        L_0x00e9:
            java.util.Set<java.lang.String> r10 = r9.f20239f     // Catch:{ all -> 0x0115 }
            r10.add(r1)     // Catch:{ all -> 0x0115 }
            monitor-exit(r2)     // Catch:{ all -> 0x0115 }
            return r3
        L_0x00f0:
            boolean r10 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x0115 }
            if (r10 == 0) goto L_0x0113
            com.applovin.impl.sdk.v r10 = r9.f20236c     // Catch:{ all -> 0x0115 }
            java.lang.String r11 = "MediationAdapterManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }
            r1.<init>()     // Catch:{ all -> 0x0115 }
            java.lang.String r4 = "Not attempting to load "
            r1.append(r4)     // Catch:{ all -> 0x0115 }
            r1.append(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = " due to prior errors"
            r1.append(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0115 }
            r10.mo57818b(r11, r0)     // Catch:{ all -> 0x0115 }
        L_0x0113:
            monitor-exit(r2)     // Catch:{ all -> 0x0115 }
            return r3
        L_0x0115:
            r10 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0115 }
            throw r10
        L_0x0118:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "No adapter spec specified"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.C8239f.mo56543a(com.applovin.impl.mediation.a.f, boolean):com.applovin.impl.mediation.g");
    }

    /* renamed from: a */
    public Collection<String> mo56544a() {
        Set unmodifiableSet;
        synchronized (this.f20237d) {
            HashSet hashSet = new HashSet(this.f20238e.size());
            for (Class<? extends MaxAdapter> name : this.f20238e.values()) {
                hashSet.add(name.getName());
            }
            unmodifiableSet = Collections.unmodifiableSet(hashSet);
        }
        return unmodifiableSet;
    }

    /* renamed from: a */
    public void mo56545a(String str, String str2, C8070a aVar) {
        synchronized (this.f20240g) {
            this.f20235b.mo57320D();
            if (C8626v.m26252a()) {
                C8626v D = this.f20235b.mo57320D();
                D.mo57822e("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
            }
            this.f20241h.add(new C8240a(str, str2, aVar, this.f20235b));
        }
    }

    /* renamed from: b */
    public Collection<String> mo56546b() {
        Set<T> unmodifiableSet;
        synchronized (this.f20237d) {
            unmodifiableSet = Collections.unmodifiableSet(this.f20239f);
        }
        return unmodifiableSet;
    }

    /* renamed from: c */
    public Collection<JSONObject> mo56547c() {
        ArrayList arrayList;
        synchronized (this.f20240g) {
            arrayList = new ArrayList(this.f20241h.size());
            for (C8240a a : this.f20241h) {
                arrayList.add(a.mo56548a());
            }
        }
        return arrayList;
    }
}
