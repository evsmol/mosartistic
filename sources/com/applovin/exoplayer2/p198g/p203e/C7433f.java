package com.applovin.exoplayer2.p198g.p203e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.g.e.f */
public final class C7433f extends C7438h {
    public static final Parcelable.Creator<C7433f> CREATOR = new Parcelable.Creator<C7433f>() {
        /* renamed from: a */
        public C7433f createFromParcel(Parcel parcel) {
            return new C7433f(parcel);
        }

        /* renamed from: a */
        public C7433f[] newArray(int i) {
            return new C7433f[i];
        }
    };

    /* renamed from: a */
    public final String f17034a;

    /* renamed from: b */
    public final String f17035b;

    /* renamed from: c */
    public final String f17036c;

    /* renamed from: d */
    public final byte[] f17037d;

    C7433f(Parcel parcel) {
        super("GEOB");
        this.f17034a = (String) C7728ai.m22198a(parcel.readString());
        this.f17035b = (String) C7728ai.m22198a(parcel.readString());
        this.f17036c = (String) C7728ai.m22198a(parcel.readString());
        this.f17037d = (byte[]) C7728ai.m22198a(parcel.createByteArray());
    }

    public C7433f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f17034a = str;
        this.f17035b = str2;
        this.f17036c = str3;
        this.f17037d = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7433f fVar = (C7433f) obj;
        return C7728ai.m22218a((Object) this.f17034a, (Object) fVar.f17034a) && C7728ai.m22218a((Object) this.f17035b, (Object) fVar.f17035b) && C7728ai.m22218a((Object) this.f17036c, (Object) fVar.f17036c) && Arrays.equals(this.f17037d, fVar.f17037d);
    }

    public int hashCode() {
        String str = this.f17034a;
        int i = 0;
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17035b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f17036c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + Arrays.hashCode(this.f17037d);
    }

    public String toString() {
        return this.f17043f + ": mimeType=" + this.f17034a + ", filename=" + this.f17035b + ", description=" + this.f17036c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17034a);
        parcel.writeString(this.f17035b);
        parcel.writeString(this.f17036c);
        parcel.writeByteArray(this.f17037d);
    }
}
