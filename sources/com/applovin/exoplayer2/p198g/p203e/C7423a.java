package com.applovin.exoplayer2.p198g.p203e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.C6797ac;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.g.e.a */
public final class C7423a extends C7438h {
    public static final Parcelable.Creator<C7423a> CREATOR = new Parcelable.Creator<C7423a>() {
        /* renamed from: a */
        public C7423a createFromParcel(Parcel parcel) {
            return new C7423a(parcel);
        }

        /* renamed from: a */
        public C7423a[] newArray(int i) {
            return new C7423a[i];
        }
    };

    /* renamed from: a */
    public final String f17015a;

    /* renamed from: b */
    public final String f17016b;

    /* renamed from: c */
    public final int f17017c;

    /* renamed from: d */
    public final byte[] f17018d;

    C7423a(Parcel parcel) {
        super("APIC");
        this.f17015a = (String) C7728ai.m22198a(parcel.readString());
        this.f17016b = parcel.readString();
        this.f17017c = parcel.readInt();
        this.f17018d = (byte[]) C7728ai.m22198a(parcel.createByteArray());
    }

    public C7423a(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f17015a = str;
        this.f17016b = str2;
        this.f17017c = i;
        this.f17018d = bArr;
    }

    /* renamed from: a */
    public void mo54214a(C6797ac.C6799a aVar) {
        aVar.mo52645a(this.f17018d, this.f17017c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7423a aVar = (C7423a) obj;
        return this.f17017c == aVar.f17017c && C7728ai.m22218a((Object) this.f17015a, (Object) aVar.f17015a) && C7728ai.m22218a((Object) this.f17016b, (Object) aVar.f17016b) && Arrays.equals(this.f17018d, aVar.f17018d);
    }

    public int hashCode() {
        int i = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f17017c) * 31;
        String str = this.f17015a;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17016b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f17018d);
    }

    public String toString() {
        return this.f17043f + ": mimeType=" + this.f17015a + ", description=" + this.f17016b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17015a);
        parcel.writeString(this.f17016b);
        parcel.writeInt(this.f17017c);
        parcel.writeByteArray(this.f17018d);
    }
}
