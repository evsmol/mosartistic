package p150io.bidmachine.nativead.tasks;

import android.media.ThumbnailUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import p150io.bidmachine.core.Logger;
import p150io.bidmachine.core.Utils;

/* renamed from: io.bidmachine.nativead.tasks.CacheUtils */
class CacheUtils {
    CacheUtils() {
    }

    static File cacheVideoFile(String str, File file, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            inputStream = ConnectionUtils.getInputStream(str, i);
            try {
                File file2 = new File(file, Utils.generateFileName(str));
                if (!file2.exists() || file2.length() <= 0 || !isVideoFileSupported(file2)) {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    Utils.close(fileOutputStream);
                    if (isVideoFileSupported(file2)) {
                        Utils.close(inputStream);
                        return file2;
                    }
                    Utils.close(inputStream);
                    return null;
                }
                Utils.close(inputStream);
                return file2;
            } catch (Exception e) {
                e = e;
                try {
                    Logger.log((Throwable) e);
                    Utils.close(inputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    Utils.close(inputStream2);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            inputStream = null;
            Logger.log((Throwable) e);
            Utils.close(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            Utils.close(inputStream2);
            throw th;
        }
    }

    private static boolean isVideoFileSupported(File file) {
        return ThumbnailUtils.createVideoThumbnail(file.getPath(), 1) != null;
    }
}
