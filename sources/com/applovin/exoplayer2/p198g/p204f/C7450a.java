package com.applovin.exoplayer2.p198g.p204f;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.C6797ac;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.g.f.a */
public final class C7450a implements C7399a.C7401a {
    public static final Parcelable.Creator<C7450a> CREATOR = new Parcelable.Creator<C7450a>() {
        /* renamed from: a */
        public C7450a createFromParcel(Parcel parcel) {
            return new C7450a(parcel);
        }

        /* renamed from: a */
        public C7450a[] newArray(int i) {
            return new C7450a[i];
        }
    };

    /* renamed from: a */
    public final String f17068a;

    /* renamed from: b */
    public final byte[] f17069b;

    /* renamed from: c */
    public final int f17070c;

    /* renamed from: d */
    public final int f17071d;

    private C7450a(Parcel parcel) {
        this.f17068a = (String) C7728ai.m22198a(parcel.readString());
        this.f17069b = (byte[]) C7728ai.m22198a(parcel.createByteArray());
        this.f17070c = parcel.readInt();
        this.f17071d = parcel.readInt();
    }

    public C7450a(String str, byte[] bArr, int i, int i2) {
        this.f17068a = str;
        this.f17069b = bArr;
        this.f17070c = i;
        this.f17071d = i2;
    }

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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7450a aVar = (C7450a) obj;
        return this.f17068a.equals(aVar.f17068a) && Arrays.equals(this.f17069b, aVar.f17069b) && this.f17070c == aVar.f17070c && this.f17071d == aVar.f17071d;
    }

    public int hashCode() {
        return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f17068a.hashCode()) * 31) + Arrays.hashCode(this.f17069b)) * 31) + this.f17070c) * 31) + this.f17071d;
    }

    public String toString() {
        return "mdta: key=" + this.f17068a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17068a);
        parcel.writeByteArray(this.f17069b);
        parcel.writeInt(this.f17070c);
        parcel.writeInt(this.f17071d);
    }
}
