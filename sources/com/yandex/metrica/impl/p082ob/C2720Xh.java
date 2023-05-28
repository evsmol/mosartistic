package com.yandex.metrica.impl.p082ob;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.Xh */
public final class C2720Xh implements Parcelable {
    public static final C2721a CREATOR = new C2721a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Boolean f7197a;

    /* renamed from: b */
    private final C2577U0 f7198b;

    /* renamed from: c */
    private final String f7199c;

    /* renamed from: com.yandex.metrica.impl.ob.Xh$a */
    public static final class C2721a implements Parcelable.Creator<C2720Xh> {
        private C2721a() {
        }

        public Object createFromParcel(Parcel parcel) {
            Object readValue = parcel.readValue(Boolean.TYPE.getClassLoader());
            if (!(readValue instanceof Boolean)) {
                readValue = null;
            }
            C2577U0 a = C2577U0.m8555a(parcel.readString());
            Intrinsics.checkNotNullExpressionValue(a, "IdentifierStatus.from(parcel.readString())");
            return new C2720Xh((Boolean) readValue, a, parcel.readString());
        }

        public Object[] newArray(int i) {
            return new C2720Xh[i];
        }

        public /* synthetic */ C2721a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C2720Xh(Boolean bool, C2577U0 u0, String str) {
        this.f7197a = bool;
        this.f7198b = u0;
        this.f7199c = str;
    }

    /* renamed from: a */
    public final String mo17056a() {
        return this.f7199c;
    }

    /* renamed from: b */
    public final Boolean mo17057b() {
        return this.f7197a;
    }

    /* renamed from: c */
    public final C2577U0 mo17058c() {
        return this.f7198b;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2720Xh)) {
            return false;
        }
        C2720Xh xh = (C2720Xh) obj;
        return Intrinsics.areEqual((Object) this.f7197a, (Object) xh.f7197a) && Intrinsics.areEqual((Object) this.f7198b, (Object) xh.f7198b) && Intrinsics.areEqual((Object) this.f7199c, (Object) xh.f7199c);
    }

    public int hashCode() {
        Boolean bool = this.f7197a;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        C2577U0 u0 = this.f7198b;
        int hashCode2 = (hashCode + (u0 != null ? u0.hashCode() : 0)) * 31;
        String str = this.f7199c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "FeaturesInternal(sslPinning=" + this.f7197a + ", status=" + this.f7198b + ", errorExplanation=" + this.f7199c + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f7197a);
        parcel.writeString(this.f7198b.mo16730a());
        parcel.writeString(this.f7199c);
    }

    public C2720Xh() {
        this((Boolean) null, C2577U0.UNKNOWN, (String) null);
    }
}
