package com.applovin.impl.p233b;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.p252ad.C8346b;
import com.applovin.impl.sdk.utils.C8622s;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.b.e */
public class C8037e {

    /* renamed from: c */
    private static final List<String> f19436c = Arrays.asList(new String[]{"video/mp4", "video/webm", "video/3gpp", "video/x-matroska"});

    /* renamed from: a */
    protected List<C8622s> f19437a = new ArrayList();

    /* renamed from: b */
    private final C8490n f19438b;

    /* renamed from: d */
    private final JSONObject f19439d;

    /* renamed from: e */
    private final JSONObject f19440e;

    /* renamed from: f */
    private final C8346b f19441f;

    /* renamed from: g */
    private final long f19442g = System.currentTimeMillis();

    public C8037e(JSONObject jSONObject, JSONObject jSONObject2, C8346b bVar, C8490n nVar) {
        this.f19438b = nVar;
        this.f19439d = jSONObject;
        this.f19440e = jSONObject2;
        this.f19441f = bVar;
    }

    /* renamed from: a */
    public int mo55894a() {
        return this.f19437a.size();
    }

    /* renamed from: b */
    public List<C8622s> mo55895b() {
        return this.f19437a;
    }

    /* renamed from: c */
    public JSONObject mo55896c() {
        return this.f19439d;
    }

    /* renamed from: d */
    public JSONObject mo55897d() {
        return this.f19440e;
    }

    /* renamed from: e */
    public C8346b mo55898e() {
        return this.f19441f;
    }

    /* renamed from: f */
    public long mo55899f() {
        return this.f19442g;
    }

    /* renamed from: g */
    public List<String> mo55900g() {
        List<String> explode = CollectionUtils.explode(JsonUtils.getString(this.f19439d, "vast_preferred_video_types", (String) null));
        return !explode.isEmpty() ? explode : f19436c;
    }

    /* renamed from: h */
    public int mo55901h() {
        return Utils.getVideoCompletionPercent(this.f19439d);
    }
}
