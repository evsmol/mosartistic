package com.applovin.exoplayer2.p209i;

import android.os.Bundle;
import android.os.Parcel;
import com.applovin.exoplayer2.common.p183a.C7033s;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7731c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.i.b */
public final class C7555b {
    /* renamed from: a */
    public C7033s<C7540a> mo54698a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return C7731c.m22273a(C7540a.f17400s, (List<Bundle>) (ArrayList) C7717a.m22120b(readBundle.getParcelableArrayList("c")));
    }
}
