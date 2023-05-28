package com.applovin.exoplayer2.p198g.p204f;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.C6797ac;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.common.p184b.C7055b;
import com.applovin.exoplayer2.p198g.C7399a;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.applovin.exoplayer2.g.f.d */
public final class C7458d implements C7399a.C7401a {
    public static final Parcelable.Creator<C7458d> CREATOR = new Parcelable.Creator<C7458d>() {
        /* renamed from: a */
        public C7458d createFromParcel(Parcel parcel) {
            return new C7458d(parcel);
        }

        /* renamed from: a */
        public C7458d[] newArray(int i) {
            return new C7458d[i];
        }
    };

    /* renamed from: a */
    public final float f17082a;

    /* renamed from: b */
    public final int f17083b;

    public C7458d(float f, int i) {
        this.f17082a = f;
        this.f17083b = i;
    }

    private C7458d(Parcel parcel) {
        this.f17082a = parcel.readFloat();
        this.f17083b = parcel.readInt();
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
        C7458d dVar = (C7458d) obj;
        return this.f17082a == dVar.f17082a && this.f17083b == dVar.f17083b;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + C7055b.m18923a(this.f17082a)) * 31) + this.f17083b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f17082a + ", svcTemporalLayerCount=" + this.f17083b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f17082a);
        parcel.writeInt(this.f17083b);
    }
}
