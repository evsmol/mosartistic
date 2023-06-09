package p150io.bidmachine.nativead.tasks;

import android.net.Uri;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import p150io.bidmachine.core.Logger;
import p150io.bidmachine.nativead.utils.NoSSLv3SocketFactory;

/* renamed from: io.bidmachine.nativead.tasks.ConnectionUtils */
class ConnectionUtils {
    ConnectionUtils() {
    }

    static InputStream getInputStream(String str, int i) throws Exception {
        try {
            URLConnection openConnection = new URL(str).openConnection();
            openConnection.setConnectTimeout(i);
            openConnection.setReadTimeout(i);
            setupNoSSLv3(openConnection);
            openConnection.connect();
            return openConnection.getInputStream();
        } catch (Exception unused) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.scheme("http");
            URLConnection openConnection2 = new URL(buildUpon.build().toString()).openConnection();
            openConnection2.setConnectTimeout(i);
            openConnection2.setReadTimeout(i);
            openConnection2.connect();
            return openConnection2.getInputStream();
        }
    }

    private static void setupNoSSLv3(URLConnection uRLConnection) {
        try {
            if (uRLConnection instanceof HttpsURLConnection) {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
                httpsURLConnection.setSSLSocketFactory(new NoSSLv3SocketFactory(httpsURLConnection.getSSLSocketFactory()));
            }
        } catch (Exception e) {
            Logger.log((Throwable) e);
        }
    }
}
