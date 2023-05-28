package com.applovin.exoplayer2.p198g.p205g;

import com.applovin.exoplayer2.C6797ac;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p198g.C7399a;

/* renamed from: com.applovin.exoplayer2.g.g.b */
public abstract class C7463b implements C7399a.C7401a {
    /* renamed from: a */
    public /* synthetic */ C7864v mo54213a() {
        return C7399a.C7401a.CC.$default$a(this);
    }

    /* renamed from: a */
    public /* synthetic */ void mo54214a(C6797ac.C6799a aVar) {
        C7399a.C7401a.CC.$default$a(this, aVar);
    }

    /* renamed from: b */
    public /* synthetic */ byte[] mo54215b() {
        return C7399a.C7401a.CC.$default$b(this);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SCTE-35 splice command: type=" + getClass().getSimpleName();
    }
}
