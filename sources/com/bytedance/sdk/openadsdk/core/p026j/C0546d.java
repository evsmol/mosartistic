package com.bytedance.sdk.openadsdk.core.p026j;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p026j.p027a.C0519a;
import com.bytedance.sdk.openadsdk.core.p026j.p029b.C0527a;
import com.bytedance.sdk.openadsdk.core.p026j.p029b.C0529b;
import com.bytedance.sdk.openadsdk.core.p026j.p029b.C0532c;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.d */
/* compiled from: VideoTrackers */
public class C0546d {

    /* renamed from: a */
    public List<C0532c> f2032a = new ArrayList();

    /* renamed from: b */
    public List<C0532c> f2033b = new ArrayList();

    /* renamed from: c */
    public List<C0532c> f2034c = new ArrayList();

    /* renamed from: d */
    public List<C0532c> f2035d = new ArrayList();

    /* renamed from: e */
    public List<C0532c> f2036e = new ArrayList();

    /* renamed from: f */
    public List<C0532c> f2037f = new ArrayList();

    /* renamed from: g */
    public List<C0532c> f2038g = new ArrayList();

    /* renamed from: h */
    public List<C0532c> f2039h = new ArrayList();

    /* renamed from: i */
    public List<C0532c> f2040i = new ArrayList();

    /* renamed from: j */
    public List<C0532c> f2041j = new ArrayList();

    /* renamed from: k */
    public List<C0529b> f2042k = new ArrayList();

    /* renamed from: l */
    public List<C0527a> f2043l = new ArrayList();

    /* renamed from: m */
    private C0518a f2044m;

    /* renamed from: n */
    private final AtomicBoolean f2045n = new AtomicBoolean(false);

    /* renamed from: o */
    private long f2046o;

    /* renamed from: p */
    private C0477n f2047p;

    /* renamed from: q */
    private boolean f2048q;

    /* renamed from: r */
    private boolean f2049r;

    /* renamed from: s */
    private boolean f2050s;

    /* renamed from: t */
    private String f2051t;

    public C0546d(C0518a aVar) {
        this.f2044m = aVar;
    }

    /* renamed from: a */
    public void mo1788a(C0519a aVar) {
        m2581a(-1, this.f2032a, aVar);
    }

    /* renamed from: a */
    public void mo1785a(long j) {
        if (this.f2045n.compareAndSet(false, true)) {
            m2581a(j, this.f2033b, (C0519a) null);
        }
    }

    /* renamed from: b */
    public void mo1795b(long j) {
        m2581a(j, this.f2034c, (C0519a) null);
    }

    /* renamed from: c */
    public void mo1797c(long j) {
        m2581a(j, this.f2035d, (C0519a) null);
    }

    /* renamed from: d */
    public void mo1799d(long j) {
        m2581a(j, this.f2036e, (C0519a) null);
    }

    /* renamed from: e */
    public void mo1801e(long j) {
        m2581a(j, this.f2037f, (C0519a) null);
    }

    /* renamed from: f */
    public void mo1803f(long j) {
        m2581a(j, this.f2038g, (C0519a) null);
    }

    /* renamed from: g */
    public void mo1805g(long j) {
        m2581a(j, this.f2039h, (C0519a) null);
    }

    /* renamed from: h */
    public void mo1807h(long j) {
        m2581a(j, this.f2040i, (C0519a) null);
    }

    /* renamed from: i */
    public void mo1809i(long j) {
        m2581a(j, this.f2041j, (C0519a) null);
    }

    /* renamed from: a */
    public void mo1786a(long j, long j2) {
        if (System.currentTimeMillis() - this.f2046o >= 1000 && j >= 0 && j2 > 0) {
            this.f2046o = System.currentTimeMillis();
            float f = ((float) j) / ((float) j2);
            m2581a(j, mo1783a(j, f), (C0519a) null);
            if (f >= 0.25f && !this.f2048q) {
                m2583b("firstQuartile");
                this.f2048q = true;
            } else if (f >= 0.5f && !this.f2049r) {
                m2583b("midpoint");
                this.f2049r = true;
            } else if (f >= 0.75f && !this.f2050s) {
                m2583b("thirdQuartile");
                this.f2050s = true;
            }
        }
    }

    /* renamed from: b */
    private void m2583b(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", str);
            C0136e.m622b(C0558m.m2663a(), this.f2047p, this.f2051t, "vast_play_track", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m2581a(long j, List<C0532c> list, C0519a aVar) {
        C0518a aVar2 = this.f2044m;
        C0532c.m2549b(list, aVar, j, aVar2 != null ? aVar2.mo1742g() : null);
    }

    /* renamed from: a */
    public List<C0532c> mo1783a(long j, float f) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f2042k.size(); i++) {
            C0529b bVar = this.f2042k.get(i);
            if (bVar.mo1762a(f)) {
                arrayList.add(bVar);
            }
        }
        for (int i2 = 0; i2 < this.f2043l.size(); i2++) {
            C0527a aVar = this.f2043l.get(i2);
            if (aVar.mo1758a(j)) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo1793a(List<C0532c> list) {
        this.f2033b.addAll(list);
    }

    /* renamed from: b */
    public void mo1796b(List<C0532c> list) {
        this.f2034c.addAll(list);
    }

    /* renamed from: c */
    public void mo1798c(List<C0532c> list) {
        this.f2035d.addAll(list);
    }

    /* renamed from: d */
    public void mo1800d(List<C0532c> list) {
        this.f2036e.addAll(list);
    }

    /* renamed from: e */
    public void mo1802e(List<C0532c> list) {
        this.f2037f.addAll(list);
    }

    /* renamed from: f */
    public void mo1804f(List<C0532c> list) {
        this.f2038g.addAll(list);
    }

    /* renamed from: g */
    public void mo1806g(List<C0532c> list) {
        this.f2039h.addAll(list);
    }

    /* renamed from: h */
    public void mo1808h(List<C0529b> list) {
        this.f2042k.addAll(list);
        Collections.sort(this.f2042k);
    }

    /* renamed from: i */
    public void mo1810i(List<C0527a> list) {
        this.f2043l.addAll(list);
        Collections.sort(this.f2043l);
    }

    /* renamed from: j */
    public void mo1811j(List<C0532c> list) {
        this.f2032a.addAll(list);
    }

    /* renamed from: k */
    public void mo1812k(List<C0532c> list) {
        this.f2040i.addAll(list);
    }

    /* renamed from: l */
    public void mo1813l(List<C0532c> list) {
        this.f2041j.addAll(list);
    }

    /* renamed from: a */
    public JSONObject mo1784a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorTrackers", C0532c.m2548b(this.f2032a));
        jSONObject.put("impressionTrackers", C0532c.m2548b(this.f2033b));
        jSONObject.put("pauseTrackers", C0532c.m2548b(this.f2034c));
        jSONObject.put("resumeTrackers", C0532c.m2548b(this.f2035d));
        jSONObject.put("completeTrackers", C0532c.m2548b(this.f2036e));
        jSONObject.put("closeTrackers", C0532c.m2548b(this.f2037f));
        jSONObject.put("skipTrackers", C0532c.m2548b(this.f2038g));
        jSONObject.put("clickTrackers", C0532c.m2548b(this.f2039h));
        jSONObject.put("muteTrackers", C0532c.m2548b(this.f2040i));
        jSONObject.put("unMuteTrackers", C0532c.m2548b(this.f2041j));
        jSONObject.put("fractionalTrackers", m2582b());
        jSONObject.put("absoluteTrackers", m2584c());
        return jSONObject;
    }

    /* renamed from: b */
    private JSONArray m2582b() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (C0529b b : this.f2042k) {
            jSONArray.put(b.mo1763b());
        }
        return jSONArray;
    }

    /* renamed from: c */
    private JSONArray m2584c() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (C0527a a : this.f2043l) {
            jSONArray.put(a.mo1757a());
        }
        return jSONArray;
    }

    /* renamed from: a */
    public void mo1794a(JSONObject jSONObject) {
        mo1811j(C0532c.m2544a(jSONObject.optJSONArray("errorTrackers")));
        mo1793a(C0532c.m2544a(jSONObject.optJSONArray("impressionTrackers")));
        mo1796b(C0532c.m2545a(jSONObject.optJSONArray("pauseTrackers"), true));
        mo1798c(C0532c.m2545a(jSONObject.optJSONArray("resumeTrackers"), true));
        mo1800d(C0532c.m2544a(jSONObject.optJSONArray("completeTrackers")));
        mo1802e(C0532c.m2544a(jSONObject.optJSONArray("closeTrackers")));
        mo1804f(C0532c.m2544a(jSONObject.optJSONArray("skipTrackers")));
        mo1806g(C0532c.m2544a(jSONObject.optJSONArray("clickTrackers")));
        mo1812k(C0532c.m2545a(jSONObject.optJSONArray("muteTrackers"), true));
        mo1813l(C0532c.m2545a(jSONObject.optJSONArray("unMuteTrackers"), true));
        mo1808h(C0532c.m2547b(jSONObject.optJSONArray("fractionalTrackers")));
        mo1810i(C0532c.m2550c(jSONObject.optJSONArray("absoluteTrackers")));
    }

    /* renamed from: a */
    public void mo1787a(C0477n nVar) {
        this.f2047p = nVar;
    }

    /* renamed from: a */
    public void mo1790a(String str) {
        this.f2051t = str;
    }

    /* renamed from: a */
    public void mo1792a(String str, long j) {
        if (!TextUtils.isEmpty(str) && j >= 0) {
            mo1810i((List<C0527a>) Collections.singletonList(new C0527a.C0528a(str, j).mo1760a()));
        }
    }

    /* renamed from: a */
    public void mo1791a(String str, float f) {
        if (!TextUtils.isEmpty(str) && f >= 0.0f) {
            mo1808h((List<C0529b>) Collections.singletonList(new C0529b.C0531a(str, f).mo1766a()));
        }
    }

    /* renamed from: a */
    public void mo1789a(C0546d dVar) {
        mo1811j(dVar.f2032a);
        mo1793a(dVar.f2033b);
        mo1796b(dVar.f2034c);
        mo1798c(dVar.f2035d);
        mo1800d(dVar.f2036e);
        mo1802e(dVar.f2037f);
        mo1804f(dVar.f2038g);
        mo1806g(dVar.f2039h);
        mo1812k(dVar.f2040i);
        mo1813l(dVar.f2041j);
        mo1808h(dVar.f2042k);
        mo1810i(dVar.f2043l);
    }
}
