package com.applovin.exoplayer2.p198g.p202d;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.C6797ac;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.applovin.exoplayer2.g.d.b */
public final class C7418b implements C7399a.C7401a {
    public static final Parcelable.Creator<C7418b> CREATOR = new Parcelable.Creator<C7418b>() {
        /* renamed from: a */
        public C7418b createFromParcel(Parcel parcel) {
            return new C7418b(parcel);
        }

        /* renamed from: a */
        public C7418b[] newArray(int i) {
            return new C7418b[i];
        }
    };

    /* renamed from: a */
    public final int f17006a;

    /* renamed from: b */
    public final String f17007b;

    /* renamed from: c */
    public final String f17008c;

    /* renamed from: d */
    public final String f17009d;

    /* renamed from: e */
    public final boolean f17010e;

    /* renamed from: f */
    public final int f17011f;

    public C7418b(int i, String str, String str2, String str3, boolean z, int i2) {
        C7717a.m22118a(i2 == -1 || i2 > 0);
        this.f17006a = i;
        this.f17007b = str;
        this.f17008c = str2;
        this.f17009d = str3;
        this.f17010e = z;
        this.f17011f = i2;
    }

    C7418b(Parcel parcel) {
        this.f17006a = parcel.readInt();
        this.f17007b = parcel.readString();
        this.f17008c = parcel.readString();
        this.f17009d = parcel.readString();
        this.f17010e = C7728ai.m22216a(parcel);
        this.f17011f = parcel.readInt();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.applovin.exoplayer2.p198g.p202d.C7418b m20657a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
        /*
            java.lang.String r0 = "Invalid metadata interval: "
            java.lang.String r1 = "icy-br"
            java.lang.Object r1 = r13.get(r1)
            java.util.List r1 = (java.util.List) r1
            java.lang.String r2 = "IcyHeaders"
            r3 = -1
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0051
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            int r6 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0039 }
            int r6 = r6 * 1000
            if (r6 <= 0) goto L_0x0021
            r1 = 1
            goto L_0x0037
        L_0x0021:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x003a }
            r7.<init>()     // Catch:{ NumberFormatException -> 0x003a }
            java.lang.String r8 = "Invalid bitrate: "
            r7.append(r8)     // Catch:{ NumberFormatException -> 0x003a }
            r7.append(r1)     // Catch:{ NumberFormatException -> 0x003a }
            java.lang.String r7 = r7.toString()     // Catch:{ NumberFormatException -> 0x003a }
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r2, r7)     // Catch:{ NumberFormatException -> 0x003a }
            r1 = 0
            r6 = -1
        L_0x0037:
            r7 = r6
            goto L_0x0053
        L_0x0039:
            r6 = -1
        L_0x003a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Invalid bitrate header: "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r2, r1)
            r7 = r6
            r1 = 0
            goto L_0x0053
        L_0x0051:
            r1 = 0
            r7 = -1
        L_0x0053:
            java.lang.String r6 = "icy-genre"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            r8 = 0
            if (r6 == 0) goto L_0x0067
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r9 = r1
            r1 = 1
            goto L_0x0068
        L_0x0067:
            r9 = r8
        L_0x0068:
            java.lang.String r6 = "icy-name"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x007b
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r10 = r1
            r1 = 1
            goto L_0x007c
        L_0x007b:
            r10 = r8
        L_0x007c:
            java.lang.String r6 = "icy-url"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x008f
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r11 = r1
            r1 = 1
            goto L_0x0090
        L_0x008f:
            r11 = r8
        L_0x0090:
            java.lang.String r6 = "icy-pub"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x00a9
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r6 = "1"
            boolean r1 = r1.equals(r6)
            r12 = r1
            r1 = 1
            goto L_0x00aa
        L_0x00a9:
            r12 = 0
        L_0x00aa:
            java.lang.String r6 = "icy-metaint"
            java.lang.Object r13 = r13.get(r6)
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L_0x00ea
            java.lang.Object r13 = r13.get(r5)
            java.lang.String r13 = (java.lang.String) r13
            int r5 = java.lang.Integer.parseInt(r13)     // Catch:{ NumberFormatException -> 0x00d8 }
            if (r5 <= 0) goto L_0x00c2
            r3 = r5
            goto L_0x00d5
        L_0x00c2:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00d7 }
            r4.<init>()     // Catch:{ NumberFormatException -> 0x00d7 }
            r4.append(r0)     // Catch:{ NumberFormatException -> 0x00d7 }
            r4.append(r13)     // Catch:{ NumberFormatException -> 0x00d7 }
            java.lang.String r4 = r4.toString()     // Catch:{ NumberFormatException -> 0x00d7 }
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r2, r4)     // Catch:{ NumberFormatException -> 0x00d7 }
            r4 = r1
        L_0x00d5:
            r1 = r4
            goto L_0x00ea
        L_0x00d7:
            r3 = r5
        L_0x00d8:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r13)
            java.lang.String r13 = r4.toString()
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r2, r13)
        L_0x00ea:
            if (r1 == 0) goto L_0x00f8
            com.applovin.exoplayer2.g.d.b r13 = new com.applovin.exoplayer2.g.d.b
            r6 = r13
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r8 = r13
        L_0x00f8:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p198g.p202d.C7418b.m20657a(java.util.Map):com.applovin.exoplayer2.g.d.b");
    }

    /* renamed from: a */
    public /* synthetic */ C7864v mo54213a() {
        return C7399a.C7401a.CC.$default$a(this);
    }

    /* renamed from: a */
    public /* synthetic */ void mo54214a(C6797ac.C6799a aVar) {
        C7399a.C7401a.CC.$default$a(this, aVar);
    }

    /* renamed from: b */
    public /* synthetic */ byte[] mo54215b() {
        return C7399a.C7401a.CC.$default$b(this);
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
        C7418b bVar = (C7418b) obj;
        return this.f17006a == bVar.f17006a && C7728ai.m22218a((Object) this.f17007b, (Object) bVar.f17007b) && C7728ai.m22218a((Object) this.f17008c, (Object) bVar.f17008c) && C7728ai.m22218a((Object) this.f17009d, (Object) bVar.f17009d) && this.f17010e == bVar.f17010e && this.f17011f == bVar.f17011f;
    }

    public int hashCode() {
        int i = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f17006a) * 31;
        String str = this.f17007b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17008c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f17009d;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((((hashCode2 + i2) * 31) + (this.f17010e ? 1 : 0)) * 31) + this.f17011f;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f17008c + "\", genre=\"" + this.f17007b + "\", bitrate=" + this.f17006a + ", metadataInterval=" + this.f17011f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f17006a);
        parcel.writeString(this.f17007b);
        parcel.writeString(this.f17008c);
        parcel.writeString(this.f17009d);
        C7728ai.m22207a(parcel, this.f17010e);
        parcel.writeInt(this.f17011f);
    }
}
