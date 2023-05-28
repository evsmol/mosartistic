package com.applovin.exoplayer2.p206h;

import android.os.Bundle;
import com.applovin.exoplayer2.C7397g;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.common.p183a.C7033s;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7731c;
import com.applovin.exoplayer2.p221l.C7755q;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.h.ac */
public final class C7482ac implements C7397g {

    /* renamed from: b */
    public static final C7397g.C7398a<C7482ac> f17168b = $$Lambda$ac$L_aEfpqtzq0pMYyjg9Q7hkABVWg.INSTANCE;

    /* renamed from: a */
    public final int f17169a;

    /* renamed from: c */
    private final C7864v[] f17170c;

    /* renamed from: d */
    private int f17171d;

    public C7482ac(C7864v... vVarArr) {
        C7717a.m22118a(vVarArr.length > 0);
        this.f17170c = vVarArr;
        this.f17169a = vVarArr.length;
        m20852a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C7482ac m20850a(Bundle bundle) {
        return new C7482ac((C7864v[]) C7731c.m22275a(C7864v.f18902F, (List<Bundle>) bundle.getParcelableArrayList(m20854b(0)), C7033s.m18803g()).toArray(new C7864v[0]));
    }

    /* renamed from: a */
    private static String m20851a(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    /* renamed from: a */
    private void m20852a() {
        String str;
        String str2;
        String str3;
        String a = m20851a(this.f17170c[0].f18912c);
        int c = m20855c(this.f17170c[0].f18914e);
        int i = 1;
        while (true) {
            C7864v[] vVarArr = this.f17170c;
            if (i >= vVarArr.length) {
                return;
            }
            if (!a.equals(m20851a(vVarArr[i].f18912c))) {
                str = this.f17170c[0].f18912c;
                str2 = this.f17170c[i].f18912c;
                str3 = "languages";
                break;
            } else if (c != m20855c(this.f17170c[i].f18914e)) {
                str = Integer.toBinaryString(this.f17170c[0].f18914e);
                str2 = Integer.toBinaryString(this.f17170c[i].f18914e);
                str3 = "role flags";
                break;
            } else {
                i++;
            }
        }
        m20853a(str3, str, str2, i);
    }

    /* renamed from: a */
    private static void m20853a(String str, String str2, String str3, int i) {
        C7755q.m22362c("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    /* renamed from: b */
    private static String m20854b(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: c */
    private static int m20855c(int i) {
        return i | 16384;
    }

    /* renamed from: a */
    public int mo54478a(C7864v vVar) {
        int i = 0;
        while (true) {
            C7864v[] vVarArr = this.f17170c;
            if (i >= vVarArr.length) {
                return -1;
            }
            if (vVar == vVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: a */
    public C7864v mo54479a(int i) {
        return this.f17170c[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7482ac acVar = (C7482ac) obj;
        return this.f17169a == acVar.f17169a && Arrays.equals(this.f17170c, acVar.f17170c);
    }

    public int hashCode() {
        if (this.f17171d == 0) {
            this.f17171d = IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Arrays.hashCode(this.f17170c);
        }
        return this.f17171d;
    }
}
