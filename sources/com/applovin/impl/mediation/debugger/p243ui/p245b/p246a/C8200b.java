package com.applovin.impl.mediation.debugger.p243ui.p245b.p246a;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8214c;
import com.applovin.impl.sdk.C8475k;

/* renamed from: com.applovin.impl.mediation.debugger.ui.b.a.b */
public class C8200b extends C8214c {

    /* renamed from: a */
    private final C8475k.C8476a f20049a;

    /* renamed from: o */
    private final Context f20050o;

    /* renamed from: p */
    private final boolean f20051p;

    public C8200b(C8475k.C8476a aVar, boolean z, Context context) {
        super(C8214c.C8217b.RIGHT_DETAIL);
        this.f20049a = aVar;
        this.f20050o = context;
        this.f20123d = new SpannedString(aVar.mo57300a());
        this.f20051p = z;
    }

    /* renamed from: c */
    public boolean mo55479c() {
        return true;
    }

    /* renamed from: i_ */
    public SpannedString mo56445i_() {
        return new SpannedString(this.f20049a.mo57301b(this.f20050o));
    }

    /* renamed from: j_ */
    public boolean mo56446j_() {
        Boolean a = this.f20049a.mo57299a(this.f20050o);
        if (a != null) {
            return a.equals(Boolean.valueOf(this.f20051p));
        }
        return false;
    }
}
