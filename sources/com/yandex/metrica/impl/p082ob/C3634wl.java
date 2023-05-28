package com.yandex.metrica.impl.p082ob;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.wl */
public class C3634wl implements Parcelable {
    public static final Parcelable.Creator<C3634wl> CREATOR = new C3635a();

    /* renamed from: a */
    public final int f9414a;

    /* renamed from: b */
    public final int f9415b;

    /* renamed from: c */
    public final int f9416c;

    /* renamed from: d */
    public final long f9417d;

    /* renamed from: e */
    public final boolean f9418e;

    /* renamed from: f */
    public final boolean f9419f;

    /* renamed from: g */
    public final boolean f9420g;

    /* renamed from: h */
    public final List<C3740zl> f9421h;

    /* renamed from: com.yandex.metrica.impl.ob.wl$a */
    class C3635a implements Parcelable.Creator<C3634wl> {
        C3635a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new C3634wl(parcel);
        }

        public Object[] newArray(int i) {
            return new C3634wl[i];
        }
    }

    public C3634wl(int i, int i2, int i3, long j, boolean z, boolean z2, boolean z3, List<C3740zl> list) {
        this.f9414a = i;
        this.f9415b = i2;
        this.f9416c = i3;
        this.f9417d = j;
        this.f9418e = z;
        this.f9419f = z2;
        this.f9420g = z3;
        this.f9421h = list;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3634wl.class != obj.getClass()) {
            return false;
        }
        C3634wl wlVar = (C3634wl) obj;
        if (this.f9414a == wlVar.f9414a && this.f9415b == wlVar.f9415b && this.f9416c == wlVar.f9416c && this.f9417d == wlVar.f9417d && this.f9418e == wlVar.f9418e && this.f9419f == wlVar.f9419f && this.f9420g == wlVar.f9420g) {
            return this.f9421h.equals(wlVar.f9421h);
        }
        return false;
    }

    public int hashCode() {
        long j = this.f9417d;
        return (((((((((((((this.f9414a * 31) + this.f9415b) * 31) + this.f9416c) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.f9418e ? 1 : 0)) * 31) + (this.f9419f ? 1 : 0)) * 31) + (this.f9420g ? 1 : 0)) * 31) + this.f9421h.hashCode();
    }

    public String toString() {
        return "UiParsingConfig{tooLongTextBound=" + this.f9414a + ", truncatedTextBound=" + this.f9415b + ", maxVisitedChildrenInLevel=" + this.f9416c + ", afterCreateTimeout=" + this.f9417d + ", relativeTextSizeCalculation=" + this.f9418e + ", errorReporting=" + this.f9419f + ", parsingAllowedByDefault=" + this.f9420g + ", filters=" + this.f9421h + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9414a);
        parcel.writeInt(this.f9415b);
        parcel.writeInt(this.f9416c);
        parcel.writeLong(this.f9417d);
        parcel.writeByte(this.f9418e ? (byte) 1 : 0);
        parcel.writeByte(this.f9419f ? (byte) 1 : 0);
        parcel.writeByte(this.f9420g ? (byte) 1 : 0);
        parcel.writeList(this.f9421h);
    }

    protected C3634wl(Parcel parcel) {
        this.f9414a = parcel.readInt();
        this.f9415b = parcel.readInt();
        this.f9416c = parcel.readInt();
        this.f9417d = parcel.readLong();
        boolean z = true;
        this.f9418e = parcel.readByte() != 0;
        this.f9419f = parcel.readByte() != 0;
        this.f9420g = parcel.readByte() == 0 ? false : z;
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, C3740zl.class.getClassLoader());
        this.f9421h = arrayList;
    }
}
