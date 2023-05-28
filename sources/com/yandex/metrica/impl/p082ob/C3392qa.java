package com.yandex.metrica.impl.p082ob;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.yandex.metrica.impl.ob.qa */
public class C3392qa implements Parcelable {
    public static final Parcelable.Creator<C3392qa> CREATOR = new C3393a();

    /* renamed from: a */
    public final long f8722a;

    /* renamed from: b */
    public final int f8723b;

    /* renamed from: com.yandex.metrica.impl.ob.qa$a */
    class C3393a implements Parcelable.Creator<C3392qa> {
        C3393a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new C3392qa(parcel);
        }

        public Object[] newArray(int i) {
            return new C3392qa[i];
        }
    }

    public C3392qa(long j, int i) {
        this.f8722a = j;
        this.f8723b = i;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "DiagnosticsConfig{expirationTimestampSeconds=" + this.f8722a + ", intervalSeconds=" + this.f8723b + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8722a);
        parcel.writeInt(this.f8723b);
    }

    protected C3392qa(Parcel parcel) {
        this.f8722a = parcel.readLong();
        this.f8723b = parcel.readInt();
    }
}
