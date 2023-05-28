package com.applovin.exoplayer2.p198g.p199a;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.C6797ac;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p221l.C7717a;

/* renamed from: com.applovin.exoplayer2.g.a.a */
public final class C7402a implements C7399a.C7401a {
    public static final Parcelable.Creator<C7402a> CREATOR = new Parcelable.Creator<C7402a>() {
        /* renamed from: a */
        public C7402a createFromParcel(Parcel parcel) {
            return new C7402a(parcel.readInt(), (String) C7717a.m22120b(parcel.readString()));
        }

        /* renamed from: a */
        public C7402a[] newArray(int i) {
            return new C7402a[i];
        }
    };

    /* renamed from: a */
    public final int f16979a;

    /* renamed from: b */
    public final String f16980b;

    public C7402a(int i, String str) {
        this.f16979a = i;
        this.f16980b = str;
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

    public String toString() {
        return "Ait(controlCode=" + this.f16979a + ",url=" + this.f16980b + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16980b);
        parcel.writeInt(this.f16979a);
    }
}
