package com.bykv.p271vk.openvk.component.video.api.p288c;

import android.text.TextUtils;
import com.bykv.p271vk.openvk.component.video.api.p291f.C10201b;
import org.json.JSONObject;

/* renamed from: com.bykv.vk.openvk.component.video.api.c.b */
/* compiled from: VideoInfo */
public class C10187b {

    /* renamed from: a */
    private int f25168a;

    /* renamed from: b */
    private int f25169b;

    /* renamed from: c */
    private long f25170c;

    /* renamed from: d */
    private double f25171d;

    /* renamed from: e */
    private String f25172e;

    /* renamed from: f */
    private String f25173f;

    /* renamed from: g */
    private String f25174g;

    /* renamed from: h */
    private String f25175h;

    /* renamed from: i */
    private String f25176i;

    /* renamed from: j */
    private String f25177j;

    /* renamed from: k */
    private int f25178k;

    /* renamed from: l */
    private int f25179l;

    /* renamed from: m */
    private int f25180m = 0;

    /* renamed from: n */
    private int f25181n = 0;

    /* renamed from: o */
    private int f25182o = 0;

    /* renamed from: p */
    private int f25183p = 0;

    /* renamed from: q */
    private int f25184q = 307200;

    /* renamed from: a */
    public int mo62899a() {
        return this.f25178k;
    }

    /* renamed from: a */
    public void mo62901a(int i) {
        this.f25178k = i;
    }

    /* renamed from: b */
    public int mo62904b() {
        return this.f25168a;
    }

    /* renamed from: b */
    public void mo62905b(int i) {
        this.f25168a = i;
    }

    /* renamed from: c */
    public int mo62907c() {
        return this.f25169b;
    }

    /* renamed from: c */
    public void mo62908c(int i) {
        this.f25169b = i;
    }

    /* renamed from: d */
    public int mo62910d() {
        return this.f25179l;
    }

    /* renamed from: d */
    public void mo62911d(int i) {
        this.f25179l = i;
    }

    /* renamed from: e */
    public long mo62913e() {
        return this.f25170c;
    }

    /* renamed from: a */
    public void mo62902a(long j) {
        this.f25170c = j;
    }

    /* renamed from: f */
    public double mo62916f() {
        return this.f25171d;
    }

    /* renamed from: a */
    public void mo62900a(double d) {
        this.f25171d = d;
    }

    /* renamed from: g */
    public String mo62919g() {
        return this.f25172e;
    }

    /* renamed from: a */
    public void mo62903a(String str) {
        this.f25172e = str;
    }

    /* renamed from: h */
    public String mo62921h() {
        return this.f25173f;
    }

    /* renamed from: b */
    public void mo62906b(String str) {
        this.f25173f = str;
    }

    /* renamed from: i */
    public String mo62923i() {
        return this.f25174g;
    }

    /* renamed from: c */
    public void mo62909c(String str) {
        this.f25174g = str;
    }

    /* renamed from: j */
    public String mo62925j() {
        return this.f25175h;
    }

    /* renamed from: d */
    public void mo62912d(String str) {
        this.f25175h = str;
    }

    /* renamed from: k */
    public String mo62926k() {
        return this.f25176i;
    }

    /* renamed from: e */
    public void mo62915e(String str) {
        this.f25176i = str;
    }

    /* renamed from: l */
    public String mo62927l() {
        if (TextUtils.isEmpty(this.f25177j)) {
            this.f25177j = C10201b.m29279a(this.f25174g);
        }
        return this.f25177j;
    }

    /* renamed from: f */
    public void mo62918f(String str) {
        this.f25177j = str;
    }

    /* renamed from: m */
    public int mo62928m() {
        if (this.f25184q < 0) {
            this.f25184q = 307200;
        }
        long j = this.f25170c;
        if (((long) this.f25184q) > j) {
            this.f25184q = (int) j;
        }
        return this.f25184q;
    }

    /* renamed from: e */
    public void mo62914e(int i) {
        this.f25184q = i;
    }

    /* renamed from: n */
    public int mo62929n() {
        return this.f25182o;
    }

    /* renamed from: f */
    public void mo62917f(int i) {
        this.f25182o = i;
    }

    /* renamed from: o */
    public int mo62930o() {
        return this.f25183p;
    }

    /* renamed from: g */
    public void mo62920g(int i) {
        this.f25183p = i;
    }

    /* renamed from: p */
    public JSONObject mo62931p() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", mo62904b());
            jSONObject.put("cover_url", mo62921h());
            jSONObject.put("cover_width", mo62907c());
            jSONObject.put("endcard", mo62925j());
            jSONObject.put("file_hash", mo62927l());
            jSONObject.put("resolution", mo62919g());
            jSONObject.put("size", mo62913e());
            jSONObject.put("video_duration", mo62916f());
            jSONObject.put("video_url", mo62923i());
            jSONObject.put("playable_download_url", mo62926k());
            jSONObject.put("if_playable_loading_show", mo62932q());
            jSONObject.put("remove_loading_page_type", mo62933r());
            jSONObject.put("fallback_endcard_judge", mo62899a());
            jSONObject.put("video_preload_size", mo62928m());
            jSONObject.put("reward_video_cached_type", mo62929n());
            jSONObject.put("execute_cached_type", mo62930o());
            jSONObject.put("endcard_render", mo62910d());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: q */
    public int mo62932q() {
        return this.f25180m;
    }

    /* renamed from: h */
    public void mo62922h(int i) {
        this.f25180m = i;
    }

    /* renamed from: r */
    public int mo62933r() {
        return this.f25181n;
    }

    /* renamed from: i */
    public void mo62924i(int i) {
        this.f25181n = i;
    }

    /* renamed from: s */
    public boolean mo62934s() {
        return this.f25183p == 1;
    }

    /* renamed from: t */
    public boolean mo62935t() {
        return this.f25182o == 0;
    }
}
