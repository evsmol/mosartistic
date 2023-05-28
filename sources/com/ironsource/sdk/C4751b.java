package com.ironsource.sdk;

import com.ironsource.sdk.p147j.C4953a;
import java.util.Map;

/* renamed from: com.ironsource.sdk.b */
public final class C4751b {

    /* renamed from: a */
    public final boolean f12060a;

    /* renamed from: b */
    public String f12061b;

    /* renamed from: c */
    public String f12062c;

    /* renamed from: d */
    public boolean f12063d;

    /* renamed from: e */
    public C4742a f12064e;

    /* renamed from: f */
    public Map<String, String> f12065f;

    /* renamed from: g */
    public C4953a f12066g;

    /* renamed from: h */
    public boolean f12067h = false;

    C4751b(String str, String str2, boolean z, boolean z2, Map<String, String> map, C4953a aVar, C4742a aVar2) {
        this.f12061b = str;
        this.f12062c = str2;
        this.f12060a = z;
        this.f12063d = z2;
        this.f12065f = map;
        this.f12066g = aVar;
        this.f12064e = aVar2;
    }

    /* renamed from: a */
    public final boolean mo34238a() {
        C4742a aVar = this.f12064e;
        if (aVar != null) {
            if (aVar.f12026b > 0 && aVar.f12025a > 0) {
                return true;
            }
        }
        return false;
    }
}
