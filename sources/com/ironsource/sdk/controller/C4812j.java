package com.ironsource.sdk.controller;

import android.text.TextUtils;
import com.ironsource.sdk.p144g.C4935c;
import com.ironsource.sdk.p144g.C4936d;
import com.ironsource.sdk.p147j.C4953a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ironsource.sdk.controller.j */
public final class C4812j {

    /* renamed from: a */
    private final Map<String, C4935c> f12266a = new LinkedHashMap();

    /* renamed from: b */
    private final Map<String, C4935c> f12267b = new LinkedHashMap();

    /* renamed from: c */
    private final Map<String, C4935c> f12268c = new LinkedHashMap();

    /* renamed from: a */
    public final C4935c mo34390a(C4936d.C4941e eVar, String str) {
        Map<String, C4935c> a;
        if (TextUtils.isEmpty(str) || (a = mo34392a(eVar)) == null) {
            return null;
        }
        return a.get(str);
    }

    /* renamed from: a */
    public final C4935c mo34391a(C4936d.C4941e eVar, String str, Map<String, String> map, C4953a aVar) {
        C4935c cVar = new C4935c(str, str, map, aVar);
        mo34393a(eVar, str, cVar);
        return cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Map<String, C4935c> mo34392a(C4936d.C4941e eVar) {
        if (eVar.name().equalsIgnoreCase(C4936d.C4941e.RewardedVideo.name())) {
            return this.f12266a;
        }
        if (eVar.name().equalsIgnoreCase(C4936d.C4941e.Interstitial.name())) {
            return this.f12267b;
        }
        if (eVar.name().equalsIgnoreCase(C4936d.C4941e.Banner.name())) {
            return this.f12268c;
        }
        return null;
    }

    /* renamed from: a */
    public void mo34393a(C4936d.C4941e eVar, String str, C4935c cVar) {
        Map<String, C4935c> a;
        if (!TextUtils.isEmpty(str) && (a = mo34392a(eVar)) != null) {
            a.put(str, cVar);
        }
    }

    /* renamed from: b */
    public final Collection<C4935c> mo34394b(C4936d.C4941e eVar) {
        Map<String, C4935c> a = mo34392a(eVar);
        return a != null ? a.values() : new ArrayList();
    }
}
