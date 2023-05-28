package com.applovin.exoplayer2.p198g.p200b;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.C6797ac;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.g.b.a */
public final class C7406a implements C7399a.C7401a {
    public static final Parcelable.Creator<C7406a> CREATOR = new Parcelable.Creator<C7406a>() {
        /* renamed from: a */
        public C7406a createFromParcel(Parcel parcel) {
            return new C7406a(parcel);
        }

        /* renamed from: a */
        public C7406a[] newArray(int i) {
            return new C7406a[i];
        }
    };

    /* renamed from: f */
    private static final C7864v f16981f = new C7864v.C7866a().mo55435f("application/id3").mo55424a();

    /* renamed from: g */
    private static final C7864v f16982g = new C7864v.C7866a().mo55435f("application/x-scte35").mo55424a();

    /* renamed from: a */
    public final String f16983a;

    /* renamed from: b */
    public final String f16984b;

    /* renamed from: c */
    public final long f16985c;

    /* renamed from: d */
    public final long f16986d;

    /* renamed from: e */
    public final byte[] f16987e;

    /* renamed from: h */
    private int f16988h;

    C7406a(Parcel parcel) {
        this.f16983a = (String) C7728ai.m22198a(parcel.readString());
        this.f16984b = (String) C7728ai.m22198a(parcel.readString());
        this.f16985c = parcel.readLong();
        this.f16986d = parcel.readLong();
        this.f16987e = (byte[]) C7728ai.m22198a(parcel.createByteArray());
    }

    public C7406a(String str, String str2, long j, long j2, byte[] bArr) {
        this.f16983a = str;
        this.f16984b = str2;
        this.f16985c = j;
        this.f16986d = j2;
        this.f16987e = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.applovin.exoplayer2.C7864v mo54213a() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f16983a
            int r1 = r0.hashCode()
            r2 = -1468477611(0xffffffffa878cf55, float:-1.38117235E-14)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x002c
            r2 = -795945609(0xffffffffd08ed577, float:-1.91708344E10)
            if (r1 == r2) goto L_0x0022
            r2 = 1303648457(0x4db418c9, float:3.776904E8)
            if (r1 == r2) goto L_0x0018
            goto L_0x0036
        L_0x0018:
            java.lang.String r1 = "https://developer.apple.com/streaming/emsg-id3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0022:
            java.lang.String r1 = "https://aomedia.org/emsg/ID3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            goto L_0x0037
        L_0x002c:
            java.lang.String r1 = "urn:scte:scte35:2014:bin"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 2
            goto L_0x0037
        L_0x0036:
            r0 = -1
        L_0x0037:
            if (r0 == 0) goto L_0x0042
            if (r0 == r4) goto L_0x0042
            if (r0 == r3) goto L_0x003f
            r0 = 0
            return r0
        L_0x003f:
            com.applovin.exoplayer2.v r0 = f16982g
            return r0
        L_0x0042:
            com.applovin.exoplayer2.v r0 = f16981f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p198g.p200b.C7406a.mo54213a():com.applovin.exoplayer2.v");
    }

    /* renamed from: a */
    public /* synthetic */ void mo54214a(C6797ac.C6799a aVar) {
        C7399a.C7401a.CC.$default$a(this, aVar);
    }

    /* renamed from: b */
    public byte[] mo54215b() {
        if (mo54213a() != null) {
            return this.f16987e;
        }
        return null;
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
        C7406a aVar = (C7406a) obj;
        return this.f16985c == aVar.f16985c && this.f16986d == aVar.f16986d && C7728ai.m22218a((Object) this.f16983a, (Object) aVar.f16983a) && C7728ai.m22218a((Object) this.f16984b, (Object) aVar.f16984b) && Arrays.equals(this.f16987e, aVar.f16987e);
    }

    public int hashCode() {
        if (this.f16988h == 0) {
            String str = this.f16983a;
            int i = 0;
            int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f16984b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            long j = this.f16985c;
            long j2 = this.f16986d;
            this.f16988h = ((((((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.f16987e);
        }
        return this.f16988h;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f16983a + ", id=" + this.f16986d + ", durationMs=" + this.f16985c + ", value=" + this.f16984b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16983a);
        parcel.writeString(this.f16984b);
        parcel.writeLong(this.f16985c);
        parcel.writeLong(this.f16986d);
        parcel.writeByteArray(this.f16987e);
    }
}
