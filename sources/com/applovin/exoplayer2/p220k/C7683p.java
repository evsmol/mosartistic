package com.applovin.exoplayer2.p220k;

import android.content.Context;
import com.applovin.exoplayer2.p220k.C7670i;
import com.applovin.exoplayer2.p220k.C7684q;

@Deprecated
/* renamed from: com.applovin.exoplayer2.k.p */
public final class C7683p implements C7670i.C7671a {

    /* renamed from: a */
    private final Context f18128a;

    /* renamed from: b */
    private final C7654aa f18129b;

    /* renamed from: c */
    private final C7670i.C7671a f18130c;

    public C7683p(Context context, C7654aa aaVar, C7670i.C7671a aVar) {
        this.f18128a = context.getApplicationContext();
        this.f18129b = aaVar;
        this.f18130c = aVar;
    }

    public C7683p(Context context, String str) {
        this(context, str, (C7654aa) null);
    }

    public C7683p(Context context, String str, C7654aa aaVar) {
        this(context, aaVar, (C7670i.C7671a) new C7684q.C7686a().mo54926a(str));
    }

    /* renamed from: b */
    public C7681o mo54901a() {
        C7681o oVar = new C7681o(this.f18128a, this.f18130c.mo54901a());
        C7654aa aaVar = this.f18129b;
        if (aaVar != null) {
            oVar.mo54524a(aaVar);
        }
        return oVar;
    }
}
