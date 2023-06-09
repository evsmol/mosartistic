package p152ms.p153bd.p154o.Pgl;

import android.app.Activity;
import android.os.Build;
import android.util.ArrayMap;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ms.bd.o.Pgl.pblz */
public final class pblz {
    /* renamed from: a */
    public static long m14671a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[256];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                outputStream.write(bArr, 0, read);
                j += (long) read;
            } else {
                outputStream.flush();
                return j;
            }
        }
    }

    /* renamed from: a */
    public static Activity m14672a() {
        try {
            Class<?> cls = Class.forName((String) pblk.m14617a(16777217, 0, 0, "3a0ff6", new byte[]{35, 109, 71, 0, 86, 40, 52, Ascii.f15552SO, 96, 38, 50, 45, 98, 17, 77, 40, 38, 73, 117, 47, Ascii.SYN, 107, 81, Ascii.ETB, 88, 37}));
            Object invoke = cls.getMethod((String) pblk.m14617a(16777217, 0, 0, "17f843", new byte[]{35, 32, 7, 94, Ascii.f15552SO, 42, 38, 55, 52, 124, 41, 35, Ascii.f15545FS, 88, Ascii.DC2, Ascii.DLE, 58, 4, 50, 105, 36}), new Class[0]).invoke((Object) null, new Object[0]);
            if (invoke == null) {
                int i = Build.VERSION.SDK_INT;
            }
            Field declaredField = cls.getDeclaredField((String) pblk.m14617a(16777217, 0, 0, "dbdb99", new byte[]{120, 65, Ascii.DC4, 2, Ascii.f15551SI, 56, 110, 87, 60, 55, 102}));
            declaredField.setAccessible(true);
            Map map = Build.VERSION.SDK_INT < 19 ? (HashMap) declaredField.get(invoke) : (ArrayMap) declaredField.get(invoke);
            if (map.size() < 1) {
                return null;
            }
            for (Object next : map.values()) {
                Class<?> cls2 = next.getClass();
                Field declaredField2 = cls2.getDeclaredField((String) pblk.m14617a(16777217, 0, 0, "6ce9d6", new byte[]{55, 96, 3, 94, 94, 37}));
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(next)) {
                    Field declaredField3 = cls2.getDeclaredField((String) pblk.m14617a(16777217, 0, 0, "eb743a", new byte[]{117, 99, 80, 73, Ascii.SUB, Ascii.DEL, 114, 90}));
                    declaredField3.setAccessible(true);
                    return (Activity) declaredField3.get(next);
                }
            }
            return null;
        } catch (Exception unused) {
            String str = (String) pblk.m14617a(16777217, 0, 0, "25c025", new byte[]{34, 62, 47, 67});
            return null;
        }
    }

    /* renamed from: a */
    public static void m14673a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static byte[] m14674a(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }
}
