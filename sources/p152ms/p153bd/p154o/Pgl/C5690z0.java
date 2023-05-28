package p152ms.p153bd.p154o.Pgl;

import com.applovin.exoplayer2.common.base.Ascii;

/* renamed from: ms.bd.o.Pgl.z0 */
public class C5690z0 {
    static {
        String str = (String) pblk.m14617a(16777217, 0, 0, "1772ea", new byte[]{Ascii.ESC, 105, 5, Ascii.CAN, 103});
    }

    /* renamed from: a */
    public static String m14710a(String str) {
        return (str == null || str.length() <= 0) ? "" : str.trim().replace('\'', ' ').replace('\"', ' ').replace(13, ' ').replace(10, ' ');
    }
}
