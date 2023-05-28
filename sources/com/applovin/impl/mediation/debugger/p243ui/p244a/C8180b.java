package com.applovin.impl.mediation.debugger.p243ui.p244a;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.mediation.debugger.p238b.p239a.C8152a;
import com.applovin.impl.mediation.debugger.p238b.p239a.C8153b;
import com.applovin.impl.mediation.debugger.p238b.p239a.C8156e;
import com.applovin.impl.mediation.debugger.p243ui.p245b.p246a.C8199a;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8214c;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8218d;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8221e;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.debugger.ui.a.b */
class C8180b extends C8218d {

    /* renamed from: a */
    private final C8152a f20000a;

    /* renamed from: b */
    private final C8153b f20001b;

    /* renamed from: d */
    private final List<C8214c> f20002d = m24540b();

    /* renamed from: e */
    private final List<C8214c> f20003e = m24541c();

    /* renamed from: f */
    private final List<C8214c> f20004f = m24542d();

    /* renamed from: com.applovin.impl.mediation.debugger.ui.a.b$a */
    class C8181a extends C8199a {

        /* renamed from: o */
        private final C8153b f20006o;

        C8181a(C8153b bVar, String str, boolean z) {
            super(bVar.mo56331a().mo56342c(), C8180b.this.f20157c);
            this.f20006o = bVar;
            this.f20123d = StringUtils.createSpannedString(bVar.mo56331a().mo56341b(), -16777216, 18, 1);
            this.f20124e = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.f20122c = z;
        }

        /* renamed from: c */
        public boolean mo55479c() {
            return this.f20122c;
        }

        /* renamed from: d */
        public C8153b mo56423d() {
            return this.f20006o;
        }

        /* renamed from: e */
        public int mo56424e() {
            return -12303292;
        }
    }

    /* renamed from: com.applovin.impl.mediation.debugger.ui.a.b$b */
    enum C8182b {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    C8180b(C8152a aVar, C8153b bVar, Context context) {
        super(context);
        this.f20000a = aVar;
        this.f20001b = bVar;
        notifyDataSetChanged();
    }

    /* renamed from: b */
    private List<C8214c> m24540b() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(m24543f());
        arrayList.add(m24544g());
        if (this.f20001b != null) {
            arrayList.add(m24545h());
        }
        return arrayList;
    }

    /* renamed from: c */
    private List<C8214c> m24541c() {
        C8153b bVar = this.f20001b;
        if (bVar != null && !bVar.mo56333c()) {
            return new ArrayList();
        }
        List<C8153b> a = this.f20000a.mo56329e().mo56335a();
        ArrayList arrayList = new ArrayList(a.size());
        for (C8153b next : a) {
            C8153b bVar2 = this.f20001b;
            if (bVar2 == null || bVar2.mo56331a().mo56340a().equals(next.mo56331a().mo56340a())) {
                arrayList.add(new C8181a(next, next.mo56332b() != null ? next.mo56332b().mo56346a() : "", this.f20001b == null));
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    private List<C8214c> m24542d() {
        C8153b bVar = this.f20001b;
        if (bVar != null && bVar.mo56333c()) {
            return new ArrayList();
        }
        List<C8153b> b = this.f20000a.mo56329e().mo56336b();
        ArrayList arrayList = new ArrayList(b.size());
        for (C8153b next : b) {
            C8153b bVar2 = this.f20001b;
            if (bVar2 == null || bVar2.mo56331a().mo56340a().equals(next.mo56331a().mo56340a())) {
                arrayList.add(new C8181a(next, (String) null, this.f20001b == null));
                for (C8156e next2 : next.mo56334d()) {
                    arrayList.add(C8214c.m24667p().mo56486a(next2.mo56346a()).mo56491b(next2.mo56347b()).mo56492b(true).mo56488a());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    private C8214c m24543f() {
        return C8214c.m24667p().mo56486a("ID").mo56491b(this.f20000a.mo56324a()).mo56488a();
    }

    /* renamed from: g */
    private C8214c m24544g() {
        return C8214c.m24667p().mo56486a("Ad Format").mo56491b(this.f20000a.mo56326c()).mo56488a();
    }

    /* renamed from: h */
    private C8214c m24545h() {
        return C8214c.m24667p().mo56486a("Selected Network").mo56491b(this.f20001b.mo56331a().mo56341b()).mo56488a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo55480a(int i) {
        return (i == C8182b.INFO.ordinal() ? this.f20002d : i == C8182b.BIDDERS.ordinal() ? this.f20003e : this.f20004f).size();
    }

    /* renamed from: a */
    public String mo56422a() {
        return this.f20000a.mo56325b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C8214c mo55483b(int i) {
        return i == C8182b.INFO.ordinal() ? new C8221e("INFO") : i == C8182b.BIDDERS.ordinal() ? new C8221e("BIDDERS") : new C8221e("WATERFALL");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public List<C8214c> mo55486c(int i) {
        return i == C8182b.INFO.ordinal() ? this.f20002d : i == C8182b.BIDDERS.ordinal() ? this.f20003e : this.f20004f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo55488e() {
        return C8182b.COUNT.ordinal();
    }
}
