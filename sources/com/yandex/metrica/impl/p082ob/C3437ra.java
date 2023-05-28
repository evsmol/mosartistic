package com.yandex.metrica.impl.p082ob;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.yandex.metrica.impl.ob.ra */
public class C3437ra implements Parcelable {
    public static final Parcelable.Creator<C3437ra> CREATOR = new C3438a();

    /* renamed from: a */
    public final C3392qa f9003a;

    /* renamed from: b */
    public final C3392qa f9004b;

    /* renamed from: c */
    public final C3392qa f9005c;

    /* renamed from: com.yandex.metrica.impl.ob.ra$a */
    class C3438a implements Parcelable.Creator<C3437ra> {
        C3438a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new C3437ra(parcel);
        }

        public Object[] newArray(int i) {
            return new C3437ra[i];
        }
    }

    public C3437ra() {
        this((C3392qa) null, (C3392qa) null, (C3392qa) null);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "DiagnosticsConfigsHolder{activationConfig=" + this.f9003a + ", clidsInfoConfig=" + this.f9004b + ", preloadInfoConfig=" + this.f9005c + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f9003a, i);
        parcel.writeParcelable(this.f9004b, i);
        parcel.writeParcelable(this.f9005c, i);
    }

    public C3437ra(C3392qa qaVar, C3392qa qaVar2, C3392qa qaVar3) {
        this.f9003a = qaVar;
        this.f9004b = qaVar2;
        this.f9005c = qaVar3;
    }

    protected C3437ra(Parcel parcel) {
        this.f9003a = (C3392qa) parcel.readParcelable(C3392qa.class.getClassLoader());
        this.f9004b = (C3392qa) parcel.readParcelable(C3392qa.class.getClassLoader());
        this.f9005c = (C3392qa) parcel.readParcelable(C3392qa.class.getClassLoader());
    }
}
