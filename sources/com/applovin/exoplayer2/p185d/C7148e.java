package com.applovin.exoplayer2.p185d;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.C7476h;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* renamed from: com.applovin.exoplayer2.d.e */
public final class C7148e implements Parcelable, Comparator<C7150a> {
    public static final Parcelable.Creator<C7148e> CREATOR = new Parcelable.Creator<C7148e>() {
        /* renamed from: a */
        public C7148e createFromParcel(Parcel parcel) {
            return new C7148e(parcel);
        }

        /* renamed from: a */
        public C7148e[] newArray(int i) {
            return new C7148e[i];
        }
    };

    /* renamed from: a */
    public final String f15722a;

    /* renamed from: b */
    public final int f15723b;

    /* renamed from: c */
    private final C7150a[] f15724c;

    /* renamed from: d */
    private int f15725d;

    /* renamed from: com.applovin.exoplayer2.d.e$a */
    public static final class C7150a implements Parcelable {
        public static final Parcelable.Creator<C7150a> CREATOR = new Parcelable.Creator<C7150a>() {
            /* renamed from: a */
            public C7150a createFromParcel(Parcel parcel) {
                return new C7150a(parcel);
            }

            /* renamed from: a */
            public C7150a[] newArray(int i) {
                return new C7150a[i];
            }
        };

        /* renamed from: a */
        public final UUID f15726a;

        /* renamed from: b */
        public final String f15727b;

        /* renamed from: c */
        public final String f15728c;

        /* renamed from: d */
        public final byte[] f15729d;

        /* renamed from: e */
        private int f15730e;

        C7150a(Parcel parcel) {
            this.f15726a = new UUID(parcel.readLong(), parcel.readLong());
            this.f15727b = parcel.readString();
            this.f15728c = (String) C7728ai.m22198a(parcel.readString());
            this.f15729d = parcel.createByteArray();
        }

        public C7150a(UUID uuid, String str, String str2, byte[] bArr) {
            this.f15726a = (UUID) C7717a.m22120b(uuid);
            this.f15727b = str;
            this.f15728c = (String) C7717a.m22120b(str2);
            this.f15729d = bArr;
        }

        public C7150a(UUID uuid, String str, byte[] bArr) {
            this(uuid, (String) null, str, bArr);
        }

        /* renamed from: a */
        public C7150a mo53807a(byte[] bArr) {
            return new C7150a(this.f15726a, this.f15727b, this.f15728c, bArr);
        }

        /* renamed from: a */
        public boolean mo53808a(UUID uuid) {
            return C7476h.f17122a.equals(this.f15726a) || uuid.equals(this.f15726a);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C7150a)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            C7150a aVar = (C7150a) obj;
            return C7728ai.m22218a((Object) this.f15727b, (Object) aVar.f15727b) && C7728ai.m22218a((Object) this.f15728c, (Object) aVar.f15728c) && C7728ai.m22218a((Object) this.f15726a, (Object) aVar.f15726a) && Arrays.equals(this.f15729d, aVar.f15729d);
        }

        public int hashCode() {
            if (this.f15730e == 0) {
                int hashCode = this.f15726a.hashCode() * 31;
                String str = this.f15727b;
                this.f15730e = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f15728c.hashCode()) * 31) + Arrays.hashCode(this.f15729d);
            }
            return this.f15730e;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f15726a.getMostSignificantBits());
            parcel.writeLong(this.f15726a.getLeastSignificantBits());
            parcel.writeString(this.f15727b);
            parcel.writeString(this.f15728c);
            parcel.writeByteArray(this.f15729d);
        }
    }

    C7148e(Parcel parcel) {
        this.f15722a = parcel.readString();
        C7150a[] aVarArr = (C7150a[]) C7728ai.m22198a((C7150a[]) parcel.createTypedArray(C7150a.CREATOR));
        this.f15724c = aVarArr;
        this.f15723b = aVarArr.length;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.applovin.exoplayer2.d.e$a[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C7148e(java.lang.String r1, boolean r2, com.applovin.exoplayer2.p185d.C7148e.C7150a... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.f15722a = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            com.applovin.exoplayer2.d.e$a[] r3 = (com.applovin.exoplayer2.p185d.C7148e.C7150a[]) r3
        L_0x000e:
            r0.f15724c = r3
            int r1 = r3.length
            r0.f15723b = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p185d.C7148e.<init>(java.lang.String, boolean, com.applovin.exoplayer2.d.e$a[]):void");
    }

    public C7148e(String str, C7150a... aVarArr) {
        this(str, true, aVarArr);
    }

    public C7148e(List<C7150a> list) {
        this((String) null, false, (C7150a[]) list.toArray(new C7150a[0]));
    }

    public C7148e(C7150a... aVarArr) {
        this((String) null, aVarArr);
    }

    /* renamed from: a */
    public int compare(C7150a aVar, C7150a aVar2) {
        return C7476h.f17122a.equals(aVar.f15726a) ? C7476h.f17122a.equals(aVar2.f15726a) ? 0 : 1 : aVar.f15726a.compareTo(aVar2.f15726a);
    }

    /* renamed from: a */
    public C7150a mo53796a(int i) {
        return this.f15724c[i];
    }

    /* renamed from: a */
    public C7148e mo53797a(String str) {
        return C7728ai.m22218a((Object) this.f15722a, (Object) str) ? this : new C7148e(str, false, this.f15724c);
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
        C7148e eVar = (C7148e) obj;
        return C7728ai.m22218a((Object) this.f15722a, (Object) eVar.f15722a) && Arrays.equals(this.f15724c, eVar.f15724c);
    }

    public int hashCode() {
        if (this.f15725d == 0) {
            String str = this.f15722a;
            this.f15725d = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f15724c);
        }
        return this.f15725d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f15722a);
        parcel.writeTypedArray(this.f15724c, 0);
    }
}
