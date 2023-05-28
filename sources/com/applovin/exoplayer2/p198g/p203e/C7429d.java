package com.applovin.exoplayer2.p198g.p203e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.g.e.d */
public final class C7429d extends C7438h {
    public static final Parcelable.Creator<C7429d> CREATOR = new Parcelable.Creator<C7429d>() {
        /* renamed from: a */
        public C7429d createFromParcel(Parcel parcel) {
            return new C7429d(parcel);
        }

        /* renamed from: a */
        public C7429d[] newArray(int i) {
            return new C7429d[i];
        }
    };

    /* renamed from: a */
    public final String f17026a;

    /* renamed from: b */
    public final boolean f17027b;

    /* renamed from: c */
    public final boolean f17028c;

    /* renamed from: d */
    public final String[] f17029d;

    /* renamed from: e */
    private final C7438h[] f17030e;

    C7429d(Parcel parcel) {
        super("CTOC");
        this.f17026a = (String) C7728ai.m22198a(parcel.readString());
        boolean z = true;
        this.f17027b = parcel.readByte() != 0;
        this.f17028c = parcel.readByte() == 0 ? false : z;
        this.f17029d = (String[]) C7728ai.m22198a(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f17030e = new C7438h[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f17030e[i] = (C7438h) parcel.readParcelable(C7438h.class.getClassLoader());
        }
    }

    public C7429d(String str, boolean z, boolean z2, String[] strArr, C7438h[] hVarArr) {
        super("CTOC");
        this.f17026a = str;
        this.f17027b = z;
        this.f17028c = z2;
        this.f17029d = strArr;
        this.f17030e = hVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7429d dVar = (C7429d) obj;
        return this.f17027b == dVar.f17027b && this.f17028c == dVar.f17028c && C7728ai.m22218a((Object) this.f17026a, (Object) dVar.f17026a) && Arrays.equals(this.f17029d, dVar.f17029d) && Arrays.equals(this.f17030e, dVar.f17030e);
    }

    public int hashCode() {
        int i = (((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (this.f17027b ? 1 : 0)) * 31) + (this.f17028c ? 1 : 0)) * 31;
        String str = this.f17026a;
        return i + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17026a);
        parcel.writeByte(this.f17027b ? (byte) 1 : 0);
        parcel.writeByte(this.f17028c ? (byte) 1 : 0);
        parcel.writeStringArray(this.f17029d);
        parcel.writeInt(this.f17030e.length);
        for (C7438h writeParcelable : this.f17030e) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
