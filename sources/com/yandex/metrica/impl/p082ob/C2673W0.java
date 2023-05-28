package com.yandex.metrica.impl.p082ob;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.yandex.metrica.impl.ob.W0 */
public class C2673W0 implements Parcelable {
    public static final Parcelable.Creator<C2673W0> CREATOR = new C2674a();

    /* renamed from: a */
    public final String f7065a;

    /* renamed from: b */
    public final C2577U0 f7066b;

    /* renamed from: c */
    public final String f7067c;

    /* renamed from: com.yandex.metrica.impl.ob.W0$a */
    class C2674a implements Parcelable.Creator<C2673W0> {
        C2674a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new C2673W0(parcel.readString(), C2577U0.m8555a(parcel.readString()), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new C2673W0[i];
        }
    }

    public C2673W0(String str, C2577U0 u0, String str2) {
        this.f7065a = str;
        this.f7066b = u0;
        this.f7067c = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2673W0.class != obj.getClass()) {
            return false;
        }
        C2673W0 w0 = (C2673W0) obj;
        String str = this.f7065a;
        if (str == null ? w0.f7065a != null : !str.equals(w0.f7065a)) {
            return false;
        }
        if (this.f7066b != w0.f7066b) {
            return false;
        }
        String str2 = this.f7067c;
        if (str2 != null) {
            return str2.equals(w0.f7067c);
        }
        if (w0.f7067c == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f7065a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f7066b.hashCode()) * 31;
        String str2 = this.f7067c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "IdentifiersResultInternal{mId='" + this.f7065a + '\'' + ", mStatus=" + this.f7066b + ", mErrorExplanation='" + this.f7067c + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7065a);
        parcel.writeString(this.f7066b.mo16730a());
        parcel.writeString(this.f7067c);
    }
}
