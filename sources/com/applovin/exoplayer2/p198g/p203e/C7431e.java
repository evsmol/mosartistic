package com.applovin.exoplayer2.p198g.p203e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.applovin.exoplayer2.g.e.e */
public final class C7431e extends C7438h {
    public static final Parcelable.Creator<C7431e> CREATOR = new Parcelable.Creator<C7431e>() {
        /* renamed from: a */
        public C7431e createFromParcel(Parcel parcel) {
            return new C7431e(parcel);
        }

        /* renamed from: a */
        public C7431e[] newArray(int i) {
            return new C7431e[i];
        }
    };

    /* renamed from: a */
    public final String f17031a;

    /* renamed from: b */
    public final String f17032b;

    /* renamed from: c */
    public final String f17033c;

    C7431e(Parcel parcel) {
        super("COMM");
        this.f17031a = (String) C7728ai.m22198a(parcel.readString());
        this.f17032b = (String) C7728ai.m22198a(parcel.readString());
        this.f17033c = (String) C7728ai.m22198a(parcel.readString());
    }

    public C7431e(String str, String str2, String str3) {
        super("COMM");
        this.f17031a = str;
        this.f17032b = str2;
        this.f17033c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7431e eVar = (C7431e) obj;
        return C7728ai.m22218a((Object) this.f17032b, (Object) eVar.f17032b) && C7728ai.m22218a((Object) this.f17031a, (Object) eVar.f17031a) && C7728ai.m22218a((Object) this.f17033c, (Object) eVar.f17033c);
    }

    public int hashCode() {
        String str = this.f17031a;
        int i = 0;
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17032b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f17033c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return this.f17043f + ": language=" + this.f17031a + ", description=" + this.f17032b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17043f);
        parcel.writeString(this.f17031a);
        parcel.writeString(this.f17033c);
    }
}
