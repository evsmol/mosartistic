package com.applovin.impl.p225a.p226a.p228b.p229a;

import android.app.Activity;
import android.content.Context;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8214c;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8218d;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8221e;
import com.applovin.impl.p225a.p226a.p227a.C7878a;
import com.applovin.impl.p225a.p226a.p228b.p229a.p230a.C7882a;
import com.applovin.impl.sdk.C8490n;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.a.a.b.a.b */
public class C7883b extends C8218d {

    /* renamed from: a */
    private C8490n f19011a;

    /* renamed from: b */
    private List<C7878a> f19012b;

    /* renamed from: d */
    private final AtomicBoolean f19013d = new AtomicBoolean();

    /* renamed from: e */
    private List<C8214c> f19014e = new ArrayList();

    /* renamed from: com.applovin.impl.a.a.b.a.b$a */
    public enum C7885a {
        RECENT_ADS,
        COUNT
    }

    public C7883b(Context context) {
        super(context);
    }

    /* renamed from: a */
    private List<C8214c> m23348a(List<C7878a> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C7878a aVar : list) {
            arrayList.add(new C7882a(aVar, this.f20157c));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo55480a(int i) {
        return this.f19014e.size();
    }

    /* renamed from: a */
    public void mo55481a() {
        this.f19013d.compareAndSet(true, false);
    }

    /* renamed from: a */
    public void mo55482a(List<C7878a> list, C8490n nVar) {
        Activity ar;
        this.f19011a = nVar;
        this.f19012b = list;
        if (!(this.f20157c instanceof Activity) && (ar = nVar.mo57377ar()) != null) {
            this.f20157c = ar;
        }
        if (list != null && this.f19013d.compareAndSet(false, true)) {
            this.f19014e = m23348a(this.f19012b);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                C7883b.this.notifyDataSetChanged();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C8214c mo55483b(int i) {
        return new C8221e("RECENT ADS");
    }

    /* renamed from: b */
    public boolean mo55484b() {
        return this.f19014e.size() == 0;
    }

    /* renamed from: c */
    public C8490n mo55485c() {
        return this.f19011a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public List<C8214c> mo55486c(int i) {
        return this.f19014e;
    }

    /* renamed from: d */
    public List<C7878a> mo55487d() {
        return this.f19012b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo55488e() {
        return C7885a.COUNT.ordinal();
    }

    public String toString() {
        return "CreativeDebuggerListAdapter{isInitialized=" + this.f19013d.get() + "}";
    }
}
