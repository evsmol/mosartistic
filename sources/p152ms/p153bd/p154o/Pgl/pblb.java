package p152ms.p153bd.p154o.Pgl;

import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Ascii;

/* renamed from: ms.bd.o.Pgl.pblb */
public final class pblb {

    /* renamed from: a */
    private static final SparseArray<pgla> f12994a = new SparseArray<>();

    /* renamed from: ms.bd.o.Pgl.pblb$pgla */
    public static abstract class pgla {
        /* renamed from: a */
        public Object mo42204a(int i, int i2, long j, String str, Object obj) throws Throwable {
            return mo42171a(i2, j, str, obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo42171a(int i, long j, String str, Object obj) throws Throwable {
            return null;
        }
    }

    /* renamed from: a */
    public static Object m14599a(int i) {
        return pblk.m14617a(i, 0, 0, (String) null, (Object) null);
    }

    /* renamed from: a */
    public static Object m14600a(int i, int i2, long j, String str, Object obj) {
        return pblk.m14617a(i, i2, j, str, obj);
    }

    /* renamed from: a */
    public static void m14603a(int i, pgla pgla2) {
        pgla pgla3 = f12994a.get(i);
        if (pgla3 == null) {
            f12994a.put(i, pgla2);
        } else {
            throw new RuntimeException(String.format((String) pblk.m14617a(16777217, 0, 0, "4fa152", new byte[]{96, 119, 82, 77, Ascii.f15555VT, 33, 119, 69, 53, 100, 43, 36, 0, 64, Ascii.f15542CR, 44, 36, 83, 53, 115, 107}), new Object[]{pgla3.toString()}));
        }
    }

    /* renamed from: b */
    public static Object m14604b(int i, int i2, long j, String str, Object obj) {
        pgla pgla2 = f12994a.get(i);
        if (pgla2 != null) {
            try {
                return pgla2.mo42204a(i, i2, j, str, obj);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        } else {
            throw new RuntimeException(String.format((String) pblk.m14617a(16777217, 0, 0, "0b8fa0", new byte[]{46, 112, Ascii.f15555VT, 17, 81, 35, 54, 3, 44, 50, 97, 105, 88, 82, 87, 41, 37, 66, 101, 63, 37}), new Object[]{Integer.valueOf(i)}));
        }
    }

    /* renamed from: a */
    public static Object m14601a(int i, long j) {
        return pblk.m14617a(i, 0, j, (String) null, (Object) null);
    }

    /* renamed from: a */
    public static Object m14602a(int i, String str) {
        return pblk.m14617a(i, 0, 0, str, (Object) null);
    }
}
