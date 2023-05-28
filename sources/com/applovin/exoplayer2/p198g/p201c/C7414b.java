package com.applovin.exoplayer2.p198g.p201c;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.applovin.exoplayer2.g.c.b */
public final class C7414b implements C7399a.C7401a {
    public static final Parcelable.Creator<C7414b> CREATOR = new Parcelable.Creator<C7414b>() {
        /* renamed from: a */
        public C7414b createFromParcel(Parcel parcel) {
            return new C7414b(parcel);
        }

        /* renamed from: a */
        public C7414b[] newArray(int i) {
            return new C7414b[i];
        }
    };

    /* renamed from: a */
    public final String f17000a;

    /* renamed from: b */
    public final String f17001b;

    C7414b(Parcel parcel) {
        this.f17000a = (String) C7728ai.m22198a(parcel.readString());
        this.f17001b = (String) C7728ai.m22198a(parcel.readString());
    }

    public C7414b(String str, String str2) {
        this.f17000a = str;
        this.f17001b = str2;
    }

    /* renamed from: a */
    public /* synthetic */ C7864v mo54213a() {
        return C7399a.C7401a.CC.$default$a(this);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo54214a(com.applovin.exoplayer2.C6797ac.C6799a r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.f17000a
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case 62359119: goto L_0x0036;
                case 79833656: goto L_0x002c;
                case 428414940: goto L_0x0022;
                case 1746739798: goto L_0x0018;
                case 1939198791: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0040
        L_0x000e:
            java.lang.String r1 = "ARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 1
            goto L_0x0041
        L_0x0018:
            java.lang.String r1 = "ALBUMARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 3
            goto L_0x0041
        L_0x0022:
            java.lang.String r1 = "DESCRIPTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 4
            goto L_0x0041
        L_0x002c:
            java.lang.String r1 = "TITLE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 0
            goto L_0x0041
        L_0x0036:
            java.lang.String r1 = "ALBUM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 2
            goto L_0x0041
        L_0x0040:
            r0 = -1
        L_0x0041:
            if (r0 == 0) goto L_0x0064
            if (r0 == r5) goto L_0x005e
            if (r0 == r4) goto L_0x0058
            if (r0 == r3) goto L_0x0052
            if (r0 == r2) goto L_0x004c
            goto L_0x0069
        L_0x004c:
            java.lang.String r0 = r6.f17001b
            r7.mo52660g((java.lang.CharSequence) r0)
            goto L_0x0069
        L_0x0052:
            java.lang.String r0 = r6.f17001b
            r7.mo52654d((java.lang.CharSequence) r0)
            goto L_0x0069
        L_0x0058:
            java.lang.String r0 = r6.f17001b
            r7.mo52652c((java.lang.CharSequence) r0)
            goto L_0x0069
        L_0x005e:
            java.lang.String r0 = r6.f17001b
            r7.mo52650b((java.lang.CharSequence) r0)
            goto L_0x0069
        L_0x0064:
            java.lang.String r0 = r6.f17001b
            r7.mo52642a((java.lang.CharSequence) r0)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p198g.p201c.C7414b.mo54214a(com.applovin.exoplayer2.ac$a):void");
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
        C7414b bVar = (C7414b) obj;
        return this.f17000a.equals(bVar.f17000a) && this.f17001b.equals(bVar.f17001b);
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f17000a.hashCode()) * 31) + this.f17001b.hashCode();
    }

    public String toString() {
        return "VC: " + this.f17000a + "=" + this.f17001b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17000a);
        parcel.writeString(this.f17001b);
    }
}
