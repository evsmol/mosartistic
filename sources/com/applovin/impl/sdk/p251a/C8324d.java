package com.applovin.impl.sdk.p251a;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* renamed from: com.applovin.impl.sdk.a.d */
public class C8324d {

    /* renamed from: a */
    private final View f20503a;

    /* renamed from: b */
    private final FriendlyObstructionPurpose f20504b;

    /* renamed from: c */
    private final String f20505c;

    public C8324d(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f20503a = view;
        this.f20504b = friendlyObstructionPurpose;
        this.f20505c = str;
    }

    /* renamed from: a */
    public View mo56864a() {
        return this.f20503a;
    }

    /* renamed from: b */
    public FriendlyObstructionPurpose mo56865b() {
        return this.f20504b;
    }

    /* renamed from: c */
    public String mo56866c() {
        return this.f20505c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8324d dVar = (C8324d) obj;
        View view = this.f20503a;
        if (view == null ? dVar.f20503a != null : !view.equals(dVar.f20503a)) {
            return false;
        }
        if (this.f20504b != dVar.f20504b) {
            return false;
        }
        String str = this.f20505c;
        String str2 = dVar.f20505c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        View view = this.f20503a;
        int i = 0;
        int hashCode = (view != null ? view.hashCode() : 0) * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.f20504b;
        int hashCode2 = (hashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        String str = this.f20505c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }
}
