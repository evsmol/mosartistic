package com.yandex.metrica.impl.p082ob;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.yandex.metrica.impl.ob.zl */
public class C3740zl implements Parcelable {
    public static final Parcelable.Creator<C3740zl> CREATOR = new C3741a();

    /* renamed from: a */
    public final C3742b f9597a;

    /* renamed from: b */
    public final String f9598b;

    /* renamed from: com.yandex.metrica.impl.ob.zl$a */
    class C3741a implements Parcelable.Creator<C3740zl> {
        C3741a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new C3740zl(parcel);
        }

        public Object[] newArray(int i) {
            return new C3740zl[i];
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.zl$b */
    public enum C3742b {
        EQUALS(0),
        CONTAINS(1),
        MATCHES(2),
        DOES_NOT_MATCH(3);
        

        /* renamed from: a */
        public final int f9604a;

        private C3742b(int i) {
            this.f9604a = i;
        }

        /* renamed from: a */
        public static C3742b m11152a(int i) {
            C3742b[] values = values();
            for (int i2 = 0; i2 < 4; i2++) {
                C3742b bVar = values[i2];
                if (bVar.f9604a == i) {
                    return bVar;
                }
            }
            return EQUALS;
        }
    }

    public C3740zl(C3742b bVar, String str) {
        this.f9597a = bVar;
        this.f9598b = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3740zl.class != obj.getClass()) {
            return false;
        }
        C3740zl zlVar = (C3740zl) obj;
        if (this.f9597a != zlVar.f9597a) {
            return false;
        }
        return this.f9598b.equals(zlVar.f9598b);
    }

    public int hashCode() {
        return (this.f9597a.hashCode() * 31) + this.f9598b.hashCode();
    }

    public String toString() {
        return "UiParsingFilter{type=" + this.f9597a + ", value='" + this.f9598b + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9597a.f9604a);
        parcel.writeString(this.f9598b);
    }

    protected C3740zl(Parcel parcel) {
        this.f9597a = C3742b.m11152a(parcel.readInt());
        this.f9598b = (String) C2572Tl.m8512a(parcel.readString(), "");
    }
}
