package com.yandex.metrica.impl.p082ob;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.hl */
public class C3040hl implements Parcelable {
    public static final Parcelable.Creator<C3040hl> CREATOR = new C3041a();

    /* renamed from: a */
    public final boolean f8003a;

    /* renamed from: b */
    public final boolean f8004b;

    /* renamed from: c */
    public final boolean f8005c;

    /* renamed from: d */
    public final boolean f8006d;

    /* renamed from: e */
    public final boolean f8007e;

    /* renamed from: f */
    public final boolean f8008f;

    /* renamed from: g */
    public final boolean f8009g;

    /* renamed from: h */
    public final boolean f8010h;

    /* renamed from: i */
    public final boolean f8011i;

    /* renamed from: j */
    public final boolean f8012j;

    /* renamed from: k */
    public final int f8013k;

    /* renamed from: l */
    public final int f8014l;

    /* renamed from: m */
    public final int f8015m;

    /* renamed from: n */
    public final int f8016n;

    /* renamed from: o */
    public final int f8017o;

    /* renamed from: p */
    public final List<C3740zl> f8018p;

    /* renamed from: com.yandex.metrica.impl.ob.hl$a */
    class C3041a implements Parcelable.Creator<C3040hl> {
        C3041a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new C3040hl(parcel);
        }

        public Object[] newArray(int i) {
            return new C3040hl[i];
        }
    }

    public C3040hl(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i, int i2, int i3, int i4, int i5, List<C3740zl> list) {
        this.f8003a = z;
        this.f8004b = z2;
        this.f8005c = z3;
        this.f8006d = z4;
        this.f8007e = z5;
        this.f8008f = z6;
        this.f8009g = z7;
        this.f8010h = z8;
        this.f8011i = z9;
        this.f8012j = z10;
        this.f8013k = i;
        this.f8014l = i2;
        this.f8015m = i3;
        this.f8016n = i4;
        this.f8017o = i5;
        this.f8018p = list;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3040hl.class != obj.getClass()) {
            return false;
        }
        C3040hl hlVar = (C3040hl) obj;
        if (this.f8003a == hlVar.f8003a && this.f8004b == hlVar.f8004b && this.f8005c == hlVar.f8005c && this.f8006d == hlVar.f8006d && this.f8007e == hlVar.f8007e && this.f8008f == hlVar.f8008f && this.f8009g == hlVar.f8009g && this.f8010h == hlVar.f8010h && this.f8011i == hlVar.f8011i && this.f8012j == hlVar.f8012j && this.f8013k == hlVar.f8013k && this.f8014l == hlVar.f8014l && this.f8015m == hlVar.f8015m && this.f8016n == hlVar.f8016n && this.f8017o == hlVar.f8017o) {
            return this.f8018p.equals(hlVar.f8018p);
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((this.f8003a ? 1 : 0) * true) + (this.f8004b ? 1 : 0)) * 31) + (this.f8005c ? 1 : 0)) * 31) + (this.f8006d ? 1 : 0)) * 31) + (this.f8007e ? 1 : 0)) * 31) + (this.f8008f ? 1 : 0)) * 31) + (this.f8009g ? 1 : 0)) * 31) + (this.f8010h ? 1 : 0)) * 31) + (this.f8011i ? 1 : 0)) * 31) + (this.f8012j ? 1 : 0)) * 31) + this.f8013k) * 31) + this.f8014l) * 31) + this.f8015m) * 31) + this.f8016n) * 31) + this.f8017o) * 31) + this.f8018p.hashCode();
    }

    public String toString() {
        return "UiCollectingConfig{textSizeCollecting=" + this.f8003a + ", relativeTextSizeCollecting=" + this.f8004b + ", textVisibilityCollecting=" + this.f8005c + ", textStyleCollecting=" + this.f8006d + ", infoCollecting=" + this.f8007e + ", nonContentViewCollecting=" + this.f8008f + ", textLengthCollecting=" + this.f8009g + ", viewHierarchical=" + this.f8010h + ", ignoreFiltered=" + this.f8011i + ", webViewUrlsCollecting=" + this.f8012j + ", tooLongTextBound=" + this.f8013k + ", truncatedTextBound=" + this.f8014l + ", maxEntitiesCount=" + this.f8015m + ", maxFullContentLength=" + this.f8016n + ", webViewUrlLimit=" + this.f8017o + ", filters=" + this.f8018p + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f8003a ? (byte) 1 : 0);
        parcel.writeByte(this.f8004b ? (byte) 1 : 0);
        parcel.writeByte(this.f8005c ? (byte) 1 : 0);
        parcel.writeByte(this.f8006d ? (byte) 1 : 0);
        parcel.writeByte(this.f8007e ? (byte) 1 : 0);
        parcel.writeByte(this.f8008f ? (byte) 1 : 0);
        parcel.writeByte(this.f8009g ? (byte) 1 : 0);
        parcel.writeByte(this.f8010h ? (byte) 1 : 0);
        parcel.writeByte(this.f8011i ? (byte) 1 : 0);
        parcel.writeByte(this.f8012j ? (byte) 1 : 0);
        parcel.writeInt(this.f8013k);
        parcel.writeInt(this.f8014l);
        parcel.writeInt(this.f8015m);
        parcel.writeInt(this.f8016n);
        parcel.writeInt(this.f8017o);
        parcel.writeList(this.f8018p);
    }

    protected C3040hl(Parcel parcel) {
        boolean z = true;
        this.f8003a = parcel.readByte() != 0;
        this.f8004b = parcel.readByte() != 0;
        this.f8005c = parcel.readByte() != 0;
        this.f8006d = parcel.readByte() != 0;
        this.f8007e = parcel.readByte() != 0;
        this.f8008f = parcel.readByte() != 0;
        this.f8009g = parcel.readByte() != 0;
        this.f8010h = parcel.readByte() != 0;
        this.f8011i = parcel.readByte() != 0;
        this.f8012j = parcel.readByte() == 0 ? false : z;
        this.f8013k = parcel.readInt();
        this.f8014l = parcel.readInt();
        this.f8015m = parcel.readInt();
        this.f8016n = parcel.readInt();
        this.f8017o = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, C3740zl.class.getClassLoader());
        this.f8018p = arrayList;
    }
}
