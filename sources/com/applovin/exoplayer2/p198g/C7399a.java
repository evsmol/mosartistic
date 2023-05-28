package com.applovin.exoplayer2.p198g;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.C6797ac;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.g.a */
public final class C7399a implements Parcelable {
    public static final Parcelable.Creator<C7399a> CREATOR = new Parcelable.Creator<C7399a>() {
        /* renamed from: a */
        public C7399a createFromParcel(Parcel parcel) {
            return new C7399a(parcel);
        }

        /* renamed from: a */
        public C7399a[] newArray(int i) {
            return new C7399a[i];
        }
    };

    /* renamed from: a */
    private final C7401a[] f16978a;

    /* renamed from: com.applovin.exoplayer2.g.a$a */
    public interface C7401a extends Parcelable {

        /* renamed from: com.applovin.exoplayer2.g.a$a$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static C7864v $default$a(C7401a aVar) {
                return null;
            }

            public static void $default$a(C7401a aVar, C6797ac.C6799a aVar2) {
            }

            public static byte[] $default$b(C7401a aVar) {
                return null;
            }
        }

        /* renamed from: a */
        C7864v mo54213a();

        /* renamed from: a */
        void mo54214a(C6797ac.C6799a aVar);

        /* renamed from: b */
        byte[] mo54215b();
    }

    C7399a(Parcel parcel) {
        this.f16978a = new C7401a[parcel.readInt()];
        int i = 0;
        while (true) {
            C7401a[] aVarArr = this.f16978a;
            if (i < aVarArr.length) {
                aVarArr[i] = (C7401a) parcel.readParcelable(C7401a.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    public C7399a(List<? extends C7401a> list) {
        this.f16978a = (C7401a[]) list.toArray(new C7401a[0]);
    }

    public C7399a(C7401a... aVarArr) {
        this.f16978a = aVarArr;
    }

    /* renamed from: a */
    public int mo54200a() {
        return this.f16978a.length;
    }

    /* renamed from: a */
    public C7401a mo54201a(int i) {
        return this.f16978a[i];
    }

    /* renamed from: a */
    public C7399a mo54202a(C7399a aVar) {
        return aVar == null ? this : mo54203a(aVar.f16978a);
    }

    /* renamed from: a */
    public C7399a mo54203a(C7401a... aVarArr) {
        return aVarArr.length == 0 ? this : new C7399a((C7401a[]) C7728ai.m22223a((T[]) this.f16978a, (T[]) aVarArr));
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
        return Arrays.equals(this.f16978a, ((C7399a) obj).f16978a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f16978a);
    }

    public String toString() {
        return "entries=" + Arrays.toString(this.f16978a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f16978a.length);
        for (C7401a writeParcelable : this.f16978a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
