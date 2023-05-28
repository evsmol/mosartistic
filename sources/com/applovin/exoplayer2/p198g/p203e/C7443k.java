package com.applovin.exoplayer2.p198g.p203e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.g.e.k */
public final class C7443k extends C7438h {
    public static final Parcelable.Creator<C7443k> CREATOR = new Parcelable.Creator<C7443k>() {
        /* renamed from: a */
        public C7443k createFromParcel(Parcel parcel) {
            return new C7443k(parcel);
        }

        /* renamed from: a */
        public C7443k[] newArray(int i) {
            return new C7443k[i];
        }
    };

    /* renamed from: a */
    public final String f17052a;

    /* renamed from: b */
    public final byte[] f17053b;

    C7443k(Parcel parcel) {
        super("PRIV");
        this.f17052a = (String) C7728ai.m22198a(parcel.readString());
        this.f17053b = (byte[]) C7728ai.m22198a(parcel.createByteArray());
    }

    public C7443k(String str, byte[] bArr) {
        super("PRIV");
        this.f17052a = str;
        this.f17053b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7443k kVar = (C7443k) obj;
        return C7728ai.m22218a((Object) this.f17052a, (Object) kVar.f17052a) && Arrays.equals(this.f17053b, kVar.f17053b);
    }

    public int hashCode() {
        String str = this.f17052a;
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f17053b);
    }

    public String toString() {
        return this.f17043f + ": owner=" + this.f17052a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17052a);
        parcel.writeByteArray(this.f17053b);
    }
}
