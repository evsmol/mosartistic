package com.applovin.exoplayer2.p198g.p203e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.g.e.b */
public final class C7425b extends C7438h {
    public static final Parcelable.Creator<C7425b> CREATOR = new Parcelable.Creator<C7425b>() {
        /* renamed from: a */
        public C7425b createFromParcel(Parcel parcel) {
            return new C7425b(parcel);
        }

        /* renamed from: a */
        public C7425b[] newArray(int i) {
            return new C7425b[i];
        }
    };

    /* renamed from: a */
    public final byte[] f17019a;

    C7425b(Parcel parcel) {
        super((String) C7728ai.m22198a(parcel.readString()));
        this.f17019a = (byte[]) C7728ai.m22198a(parcel.createByteArray());
    }

    public C7425b(String str, byte[] bArr) {
        super(str);
        this.f17019a = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7425b bVar = (C7425b) obj;
        return this.f17043f.equals(bVar.f17043f) && Arrays.equals(this.f17019a, bVar.f17019a);
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f17043f.hashCode()) * 31) + Arrays.hashCode(this.f17019a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17043f);
        parcel.writeByteArray(this.f17019a);
    }
}
