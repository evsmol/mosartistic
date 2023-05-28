package com.applovin.exoplayer2.p198g.p201c;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.C6797ac;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.g.c.a */
public final class C7412a implements C7399a.C7401a {
    public static final Parcelable.Creator<C7412a> CREATOR = new Parcelable.Creator<C7412a>() {
        /* renamed from: a */
        public C7412a createFromParcel(Parcel parcel) {
            return new C7412a(parcel);
        }

        /* renamed from: a */
        public C7412a[] newArray(int i) {
            return new C7412a[i];
        }
    };

    /* renamed from: a */
    public final int f16992a;

    /* renamed from: b */
    public final String f16993b;

    /* renamed from: c */
    public final String f16994c;

    /* renamed from: d */
    public final int f16995d;

    /* renamed from: e */
    public final int f16996e;

    /* renamed from: f */
    public final int f16997f;

    /* renamed from: g */
    public final int f16998g;

    /* renamed from: h */
    public final byte[] f16999h;

    public C7412a(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f16992a = i;
        this.f16993b = str;
        this.f16994c = str2;
        this.f16995d = i2;
        this.f16996e = i3;
        this.f16997f = i4;
        this.f16998g = i5;
        this.f16999h = bArr;
    }

    C7412a(Parcel parcel) {
        this.f16992a = parcel.readInt();
        this.f16993b = (String) C7728ai.m22198a(parcel.readString());
        this.f16994c = (String) C7728ai.m22198a(parcel.readString());
        this.f16995d = parcel.readInt();
        this.f16996e = parcel.readInt();
        this.f16997f = parcel.readInt();
        this.f16998g = parcel.readInt();
        this.f16999h = (byte[]) C7728ai.m22198a(parcel.createByteArray());
    }

    /* renamed from: a */
    public /* synthetic */ C7864v mo54213a() {
        return C7399a.C7401a.CC.$default$a(this);
    }

    /* renamed from: a */
    public void mo54214a(C6797ac.C6799a aVar) {
        aVar.mo52645a(this.f16999h, this.f16992a);
    }

    /* renamed from: b */
    public /* synthetic */ byte[] mo54215b() {
        return C7399a.C7401a.CC.$default$b(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7412a aVar = (C7412a) obj;
        return this.f16992a == aVar.f16992a && this.f16993b.equals(aVar.f16993b) && this.f16994c.equals(aVar.f16994c) && this.f16995d == aVar.f16995d && this.f16996e == aVar.f16996e && this.f16997f == aVar.f16997f && this.f16998g == aVar.f16998g && Arrays.equals(this.f16999h, aVar.f16999h);
    }

    public int hashCode() {
        return ((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f16992a) * 31) + this.f16993b.hashCode()) * 31) + this.f16994c.hashCode()) * 31) + this.f16995d) * 31) + this.f16996e) * 31) + this.f16997f) * 31) + this.f16998g) * 31) + Arrays.hashCode(this.f16999h);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f16993b + ", description=" + this.f16994c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f16992a);
        parcel.writeString(this.f16993b);
        parcel.writeString(this.f16994c);
        parcel.writeInt(this.f16995d);
        parcel.writeInt(this.f16996e);
        parcel.writeInt(this.f16997f);
        parcel.writeInt(this.f16998g);
        parcel.writeByteArray(this.f16999h);
    }
}
