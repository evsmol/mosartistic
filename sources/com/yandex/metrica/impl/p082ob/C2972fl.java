package com.yandex.metrica.impl.p082ob;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.yandex.metrica.impl.ob.fl */
public class C2972fl implements Parcelable {
    public static final Parcelable.Creator<C2972fl> CREATOR = new C2973a();

    /* renamed from: a */
    public final boolean f7867a;

    /* renamed from: b */
    public final boolean f7868b;

    /* renamed from: c */
    public final boolean f7869c;

    /* renamed from: d */
    public final boolean f7870d;

    /* renamed from: e */
    public final C3634wl f7871e;

    /* renamed from: f */
    public final C3040hl f7872f;

    /* renamed from: g */
    public final C3040hl f7873g;

    /* renamed from: h */
    public final C3040hl f7874h;

    /* renamed from: com.yandex.metrica.impl.ob.fl$a */
    class C2973a implements Parcelable.Creator<C2972fl> {
        C2973a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new C2972fl(parcel);
        }

        public Object[] newArray(int i) {
            return new C2972fl[i];
        }
    }

    public C2972fl(C3356pi piVar) {
        this(piVar.mo17974f().f6671j, piVar.mo17974f().f6673l, piVar.mo17974f().f6672k, piVar.mo17974f().f6674m, piVar.mo17966T(), piVar.mo17965S(), piVar.mo17964R(), piVar.mo17967U());
    }

    /* renamed from: a */
    public boolean mo17606a() {
        return (this.f7871e == null || this.f7872f == null || this.f7873g == null || this.f7874h == null) ? false : true;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2972fl.class != obj.getClass()) {
            return false;
        }
        C2972fl flVar = (C2972fl) obj;
        if (this.f7867a != flVar.f7867a || this.f7868b != flVar.f7868b || this.f7869c != flVar.f7869c || this.f7870d != flVar.f7870d) {
            return false;
        }
        C3634wl wlVar = this.f7871e;
        if (wlVar == null ? flVar.f7871e != null : !wlVar.equals(flVar.f7871e)) {
            return false;
        }
        C3040hl hlVar = this.f7872f;
        if (hlVar == null ? flVar.f7872f != null : !hlVar.equals(flVar.f7872f)) {
            return false;
        }
        C3040hl hlVar2 = this.f7873g;
        if (hlVar2 == null ? flVar.f7873g != null : !hlVar2.equals(flVar.f7873g)) {
            return false;
        }
        C3040hl hlVar3 = this.f7874h;
        if (hlVar3 != null) {
            return hlVar3.equals(flVar.f7874h);
        }
        if (flVar.f7874h == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = (((((((this.f7867a ? 1 : 0) * true) + (this.f7868b ? 1 : 0)) * 31) + (this.f7869c ? 1 : 0)) * 31) + (this.f7870d ? 1 : 0)) * 31;
        C3634wl wlVar = this.f7871e;
        int i2 = 0;
        int hashCode = (i + (wlVar != null ? wlVar.hashCode() : 0)) * 31;
        C3040hl hlVar = this.f7872f;
        int hashCode2 = (hashCode + (hlVar != null ? hlVar.hashCode() : 0)) * 31;
        C3040hl hlVar2 = this.f7873g;
        int hashCode3 = (hashCode2 + (hlVar2 != null ? hlVar2.hashCode() : 0)) * 31;
        C3040hl hlVar3 = this.f7874h;
        if (hlVar3 != null) {
            i2 = hlVar3.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "UiAccessConfig{uiParsingEnabled=" + this.f7867a + ", uiEventSendingEnabled=" + this.f7868b + ", uiCollectingForBridgeEnabled=" + this.f7869c + ", uiRawEventSendingEnabled=" + this.f7870d + ", uiParsingConfig=" + this.f7871e + ", uiEventSendingConfig=" + this.f7872f + ", uiCollectingForBridgeConfig=" + this.f7873g + ", uiRawEventSendingConfig=" + this.f7874h + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f7867a ? (byte) 1 : 0);
        parcel.writeByte(this.f7868b ? (byte) 1 : 0);
        parcel.writeByte(this.f7869c ? (byte) 1 : 0);
        parcel.writeByte(this.f7870d ? (byte) 1 : 0);
        parcel.writeParcelable(this.f7871e, i);
        parcel.writeParcelable(this.f7872f, i);
        parcel.writeParcelable(this.f7873g, i);
        parcel.writeParcelable(this.f7874h, i);
    }

    public C2972fl(boolean z, boolean z2, boolean z3, boolean z4, C3634wl wlVar, C3040hl hlVar, C3040hl hlVar2, C3040hl hlVar3) {
        this.f7867a = z;
        this.f7868b = z2;
        this.f7869c = z3;
        this.f7870d = z4;
        this.f7871e = wlVar;
        this.f7872f = hlVar;
        this.f7873g = hlVar2;
        this.f7874h = hlVar3;
    }

    protected C2972fl(Parcel parcel) {
        boolean z = true;
        this.f7867a = parcel.readByte() != 0;
        this.f7868b = parcel.readByte() != 0;
        this.f7869c = parcel.readByte() != 0;
        this.f7870d = parcel.readByte() == 0 ? false : z;
        this.f7871e = (C3634wl) parcel.readParcelable(C3634wl.class.getClassLoader());
        this.f7872f = (C3040hl) parcel.readParcelable(C3040hl.class.getClassLoader());
        this.f7873g = (C3040hl) parcel.readParcelable(C3040hl.class.getClassLoader());
        this.f7874h = (C3040hl) parcel.readParcelable(C3040hl.class.getClassLoader());
    }
}
