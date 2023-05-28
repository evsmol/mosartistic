package com.applovin.exoplayer2.p198g.p203e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.applovin.exoplayer2.g.e.i */
public final class C7439i extends C7438h {
    public static final Parcelable.Creator<C7439i> CREATOR = new Parcelable.Creator<C7439i>() {
        /* renamed from: a */
        public C7439i createFromParcel(Parcel parcel) {
            return new C7439i(parcel);
        }

        /* renamed from: a */
        public C7439i[] newArray(int i) {
            return new C7439i[i];
        }
    };

    /* renamed from: a */
    public final String f17044a;

    /* renamed from: b */
    public final String f17045b;

    /* renamed from: c */
    public final String f17046c;

    C7439i(Parcel parcel) {
        super("----");
        this.f17044a = (String) C7728ai.m22198a(parcel.readString());
        this.f17045b = (String) C7728ai.m22198a(parcel.readString());
        this.f17046c = (String) C7728ai.m22198a(parcel.readString());
    }

    public C7439i(String str, String str2, String str3) {
        super("----");
        this.f17044a = str;
        this.f17045b = str2;
        this.f17046c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7439i iVar = (C7439i) obj;
        return C7728ai.m22218a((Object) this.f17045b, (Object) iVar.f17045b) && C7728ai.m22218a((Object) this.f17044a, (Object) iVar.f17044a) && C7728ai.m22218a((Object) this.f17046c, (Object) iVar.f17046c);
    }

    public int hashCode() {
        String str = this.f17044a;
        int i = 0;
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17045b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f17046c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return this.f17043f + ": domain=" + this.f17044a + ", description=" + this.f17045b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17043f);
        parcel.writeString(this.f17044a);
        parcel.writeString(this.f17046c);
    }
}
