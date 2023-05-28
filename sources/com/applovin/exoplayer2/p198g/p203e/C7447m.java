package com.applovin.exoplayer2.p198g.p203e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.applovin.exoplayer2.g.e.m */
public final class C7447m extends C7438h {
    public static final Parcelable.Creator<C7447m> CREATOR = new Parcelable.Creator<C7447m>() {
        /* renamed from: a */
        public C7447m createFromParcel(Parcel parcel) {
            return new C7447m(parcel);
        }

        /* renamed from: a */
        public C7447m[] newArray(int i) {
            return new C7447m[i];
        }
    };

    /* renamed from: a */
    public final String f17056a;

    /* renamed from: b */
    public final String f17057b;

    C7447m(Parcel parcel) {
        super((String) C7728ai.m22198a(parcel.readString()));
        this.f17056a = parcel.readString();
        this.f17057b = (String) C7728ai.m22198a(parcel.readString());
    }

    public C7447m(String str, String str2, String str3) {
        super(str);
        this.f17056a = str2;
        this.f17057b = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7447m mVar = (C7447m) obj;
        return this.f17043f.equals(mVar.f17043f) && C7728ai.m22218a((Object) this.f17056a, (Object) mVar.f17056a) && C7728ai.m22218a((Object) this.f17057b, (Object) mVar.f17057b);
    }

    public int hashCode() {
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f17043f.hashCode()) * 31;
        String str = this.f17056a;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17057b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return this.f17043f + ": url=" + this.f17057b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17043f);
        parcel.writeString(this.f17056a);
        parcel.writeString(this.f17057b);
    }
}
