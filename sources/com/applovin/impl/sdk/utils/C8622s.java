package com.applovin.impl.sdk.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.utils.s */
public class C8622s {

    /* renamed from: a */
    public static final C8622s f21773a = new C8622s();

    /* renamed from: b */
    protected String f21774b;

    /* renamed from: c */
    protected final List<C8622s> f21775c;

    /* renamed from: d */
    private final C8622s f21776d;

    /* renamed from: e */
    private final String f21777e;

    /* renamed from: f */
    private final Map<String, String> f21778f;

    private C8622s() {
        this.f21776d = null;
        this.f21777e = "";
        this.f21778f = Collections.emptyMap();
        this.f21774b = "";
        this.f21775c = Collections.emptyList();
    }

    public C8622s(String str, Map<String, String> map, C8622s sVar) {
        this.f21776d = sVar;
        this.f21777e = str;
        this.f21778f = Collections.unmodifiableMap(map);
        this.f21775c = new ArrayList();
    }

    /* renamed from: a */
    public String mo57794a() {
        return this.f21777e;
    }

    /* renamed from: a */
    public List<C8622s> mo57795a(String str) {
        if (str != null) {
            ArrayList arrayList = new ArrayList(this.f21775c.size());
            for (C8622s next : this.f21775c) {
                if (str.equalsIgnoreCase(next.mo57794a())) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    /* renamed from: b */
    public C8622s mo57796b(String str) {
        if (str != null) {
            for (C8622s next : this.f21775c) {
                if (str.equalsIgnoreCase(next.mo57794a())) {
                    return next;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    /* renamed from: b */
    public Map<String, String> mo57797b() {
        return this.f21778f;
    }

    /* renamed from: c */
    public C8622s mo57798c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        } else if (this.f21775c.size() <= 0) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this);
            while (!arrayList.isEmpty()) {
                C8622s sVar = (C8622s) arrayList.get(0);
                arrayList.remove(0);
                if (str.equalsIgnoreCase(sVar.mo57794a())) {
                    return sVar;
                }
                arrayList.addAll(sVar.mo57800d());
            }
            return null;
        }
    }

    /* renamed from: c */
    public String mo57799c() {
        return this.f21774b;
    }

    /* renamed from: d */
    public List<C8622s> mo57800d() {
        return Collections.unmodifiableList(this.f21775c);
    }

    public String toString() {
        return "XmlNode{elementName='" + this.f21777e + '\'' + ", text='" + this.f21774b + '\'' + ", attributes=" + this.f21778f + '}';
    }
}
