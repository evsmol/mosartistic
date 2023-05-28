package com.applovin.exoplayer2.p198g.p203e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.g.e.c */
public final class C7427c extends C7438h {
    public static final Parcelable.Creator<C7427c> CREATOR = new Parcelable.Creator<C7427c>() {
        /* renamed from: a */
        public C7427c createFromParcel(Parcel parcel) {
            return new C7427c(parcel);
        }

        /* renamed from: a */
        public C7427c[] newArray(int i) {
            return new C7427c[i];
        }
    };

    /* renamed from: a */
    public final String f17020a;

    /* renamed from: b */
    public final int f17021b;

    /* renamed from: c */
    public final int f17022c;

    /* renamed from: d */
    public final long f17023d;

    /* renamed from: e */
    public final long f17024e;

    /* renamed from: g */
    private final C7438h[] f17025g;

    C7427c(Parcel parcel) {
        super("CHAP");
        this.f17020a = (String) C7728ai.m22198a(parcel.readString());
        this.f17021b = parcel.readInt();
        this.f17022c = parcel.readInt();
        this.f17023d = parcel.readLong();
        this.f17024e = parcel.readLong();
        int readInt = parcel.readInt();
        this.f17025g = new C7438h[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f17025g[i] = (C7438h) parcel.readParcelable(C7438h.class.getClassLoader());
        }
    }

    public C7427c(String str, int i, int i2, long j, long j2, C7438h[] hVarArr) {
        super("CHAP");
        this.f17020a = str;
        this.f17021b = i;
        this.f17022c = i2;
        this.f17023d = j;
        this.f17024e = j2;
        this.f17025g = hVarArr;
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
        C7427c cVar = (C7427c) obj;
        return this.f17021b == cVar.f17021b && this.f17022c == cVar.f17022c && this.f17023d == cVar.f17023d && this.f17024e == cVar.f17024e && C7728ai.m22218a((Object) this.f17020a, (Object) cVar.f17020a) && Arrays.equals(this.f17025g, cVar.f17025g);
    }

    public int hashCode() {
        int i = (((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f17021b) * 31) + this.f17022c) * 31) + ((int) this.f17023d)) * 31) + ((int) this.f17024e)) * 31;
        String str = this.f17020a;
        return i + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17020a);
        parcel.writeInt(this.f17021b);
        parcel.writeInt(this.f17022c);
        parcel.writeLong(this.f17023d);
        parcel.writeLong(this.f17024e);
        parcel.writeInt(this.f17025g.length);
        for (C7438h writeParcelable : this.f17025g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
