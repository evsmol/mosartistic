package com.applovin.exoplayer2.p198g.p202d;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.C6797ac;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p221l.C7717a;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.g.d.c */
public final class C7420c implements C7399a.C7401a {
    public static final Parcelable.Creator<C7420c> CREATOR = new Parcelable.Creator<C7420c>() {
        /* renamed from: a */
        public C7420c createFromParcel(Parcel parcel) {
            return new C7420c(parcel);
        }

        /* renamed from: a */
        public C7420c[] newArray(int i) {
            return new C7420c[i];
        }
    };

    /* renamed from: a */
    public final byte[] f17012a;

    /* renamed from: b */
    public final String f17013b;

    /* renamed from: c */
    public final String f17014c;

    C7420c(Parcel parcel) {
        this.f17012a = (byte[]) C7717a.m22120b(parcel.createByteArray());
        this.f17013b = parcel.readString();
        this.f17014c = parcel.readString();
    }

    public C7420c(byte[] bArr, String str, String str2) {
        this.f17012a = bArr;
        this.f17013b = str;
        this.f17014c = str2;
    }

    /* renamed from: a */
    public /* synthetic */ C7864v mo54213a() {
        return C7399a.C7401a.CC.$default$a(this);
    }

    /* renamed from: a */
    public void mo54214a(C6797ac.C6799a aVar) {
        String str = this.f17013b;
        if (str != null) {
            aVar.mo52642a((CharSequence) str);
        }
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
        return Arrays.equals(this.f17012a, ((C7420c) obj).f17012a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f17012a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", new Object[]{this.f17013b, this.f17014c, Integer.valueOf(this.f17012a.length)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f17012a);
        parcel.writeString(this.f17013b);
        parcel.writeString(this.f17014c);
    }
}
