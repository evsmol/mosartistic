package com.bytedance.sdk.component.p323e.p326c;

import java.util.Map;

/* renamed from: com.bytedance.sdk.component.e.c.c */
/* compiled from: TNCConfig */
public class C10589c {

    /* renamed from: a */
    public boolean f26406a = false;

    /* renamed from: b */
    public boolean f26407b = true;

    /* renamed from: c */
    public Map<String, Integer> f26408c = null;

    /* renamed from: d */
    public Map<String, String> f26409d = null;

    /* renamed from: e */
    public int f26410e = 10;

    /* renamed from: f */
    public int f26411f = 1;

    /* renamed from: g */
    public int f26412g = 1;

    /* renamed from: h */
    public int f26413h = 10;

    /* renamed from: i */
    public int f26414i = 1;

    /* renamed from: j */
    public int f26415j = 1;

    /* renamed from: k */
    public int f26416k = 900;

    /* renamed from: l */
    public int f26417l = 120;

    /* renamed from: m */
    public String f26418m = null;

    /* renamed from: n */
    public int f26419n = 0;

    /* renamed from: o */
    public long f26420o = 0;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" localEnable: ");
        sb.append(this.f26406a);
        sb.append(" probeEnable: ");
        sb.append(this.f26407b);
        sb.append(" hostFilter: ");
        Map<String, Integer> map = this.f26408c;
        int i = 0;
        sb.append(map != null ? map.size() : 0);
        sb.append(" hostMap: ");
        Map<String, String> map2 = this.f26409d;
        if (map2 != null) {
            i = map2.size();
        }
        sb.append(i);
        sb.append(" reqTo: ");
        sb.append(this.f26410e);
        sb.append("#");
        sb.append(this.f26411f);
        sb.append("#");
        sb.append(this.f26412g);
        sb.append(" reqErr: ");
        sb.append(this.f26413h);
        sb.append("#");
        sb.append(this.f26414i);
        sb.append("#");
        sb.append(this.f26415j);
        sb.append(" updateInterval: ");
        sb.append(this.f26416k);
        sb.append(" updateRandom: ");
        sb.append(this.f26417l);
        sb.append(" httpBlack: ");
        sb.append(this.f26418m);
        return sb.toString();
    }
}
