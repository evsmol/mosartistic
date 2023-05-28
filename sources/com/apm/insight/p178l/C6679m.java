package com.apm.insight.p178l;

import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.l.m */
public class C6679m {

    /* renamed from: a */
    final Writer f14357a;

    /* renamed from: b */
    private final List<C6680a> f14358b = new ArrayList();

    /* renamed from: com.apm.insight.l.m$a */
    enum C6680a {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    public C6679m(Writer writer) {
        this.f14357a = writer;
    }

    /* renamed from: a */
    private void m16564a(C6680a aVar) {
        List<C6680a> list = this.f14358b;
        list.set(list.size() - 1, aVar);
    }

    /* renamed from: a */
    private void m16565a(JSONArray jSONArray) {
        mo52165a();
        for (int i = 0; i < jSONArray.length(); i++) {
            mo52168a(jSONArray.get(i));
        }
        mo52170b();
    }

    /* renamed from: a */
    public static void m16566a(JSONArray jSONArray, Writer writer) {
        new C6679m(writer).m16565a(jSONArray);
        writer.flush();
    }

    /* renamed from: a */
    private void m16567a(JSONObject jSONObject) {
        mo52171c();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            mo52169a(next).mo52168a(jSONObject.get(next));
        }
        mo52172d();
    }

    /* renamed from: a */
    public static void m16568a(JSONObject jSONObject, Writer writer) {
        new C6679m(writer).m16567a(jSONObject);
        writer.flush();
    }

    /* renamed from: b */
    private void m16569b(String str) {
        Writer writer;
        String str2;
        this.f14357a.write("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 12) {
                writer = this.f14357a;
                str2 = "\\f";
            } else if (charAt != 13) {
                if (charAt != '\"' && charAt != '/' && charAt != '\\') {
                    switch (charAt) {
                        case 8:
                            writer = this.f14357a;
                            str2 = "\\b";
                            break;
                        case 9:
                            writer = this.f14357a;
                            str2 = "\\t";
                            break;
                        case 10:
                            writer = this.f14357a;
                            str2 = "\\n";
                            break;
                        default:
                            if (charAt <= 31) {
                                this.f14357a.write(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                                break;
                            }
                            break;
                    }
                } else {
                    this.f14357a.write(92);
                }
                this.f14357a.write(charAt);
            } else {
                writer = this.f14357a;
                str2 = "\\r";
            }
            writer.write(str2);
        }
        this.f14357a.write("\"");
    }

    /* renamed from: e */
    private C6680a m16570e() {
        List<C6680a> list = this.f14358b;
        return list.get(list.size() - 1);
    }

    /* renamed from: f */
    private void m16571f() {
        C6680a e = m16570e();
        if (e == C6680a.NONEMPTY_OBJECT) {
            this.f14357a.write(44);
        } else if (e != C6680a.EMPTY_OBJECT) {
            throw new JSONException("Nesting problem");
        }
        m16564a(C6680a.DANGLING_KEY);
    }

    /* renamed from: g */
    private void m16572g() {
        C6680a aVar;
        if (!this.f14358b.isEmpty()) {
            C6680a e = m16570e();
            if (e == C6680a.EMPTY_ARRAY) {
                aVar = C6680a.NONEMPTY_ARRAY;
            } else if (e == C6680a.NONEMPTY_ARRAY) {
                this.f14357a.write(44);
                return;
            } else if (e == C6680a.DANGLING_KEY) {
                this.f14357a.write(":");
                aVar = C6680a.NONEMPTY_OBJECT;
            } else if (e != C6680a.NULL) {
                throw new JSONException("Nesting problem");
            } else {
                return;
            }
            m16564a(aVar);
        }
    }

    /* renamed from: a */
    public C6679m mo52165a() {
        return mo52167a(C6680a.EMPTY_ARRAY, "[");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6679m mo52166a(C6680a aVar, C6680a aVar2, String str) {
        m16570e();
        List<C6680a> list = this.f14358b;
        list.remove(list.size() - 1);
        this.f14357a.write(str);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6679m mo52167a(C6680a aVar, String str) {
        m16572g();
        this.f14358b.add(aVar);
        this.f14357a.write(str);
        return this;
    }

    /* renamed from: a */
    public C6679m mo52168a(Object obj) {
        Writer writer;
        String numberToString;
        if (obj instanceof JSONArray) {
            m16565a((JSONArray) obj);
            return this;
        } else if (obj instanceof JSONObject) {
            m16567a((JSONObject) obj);
            return this;
        } else {
            m16572g();
            if (obj == null || obj == JSONObject.NULL) {
                this.f14357a.write("null");
            } else {
                if (obj instanceof Boolean) {
                    writer = this.f14357a;
                    numberToString = String.valueOf(obj);
                } else if (obj instanceof Number) {
                    writer = this.f14357a;
                    numberToString = JSONObject.numberToString((Number) obj);
                } else {
                    m16569b(obj.toString());
                }
                writer.write(numberToString);
            }
            return this;
        }
    }

    /* renamed from: a */
    public C6679m mo52169a(String str) {
        m16571f();
        m16569b(str);
        return this;
    }

    /* renamed from: b */
    public C6679m mo52170b() {
        return mo52166a(C6680a.EMPTY_ARRAY, C6680a.NONEMPTY_ARRAY, "]");
    }

    /* renamed from: c */
    public C6679m mo52171c() {
        return mo52167a(C6680a.EMPTY_OBJECT, "{");
    }

    /* renamed from: d */
    public C6679m mo52172d() {
        return mo52166a(C6680a.EMPTY_OBJECT, C6680a.NONEMPTY_OBJECT, "}");
    }

    public String toString() {
        return "";
    }
}
