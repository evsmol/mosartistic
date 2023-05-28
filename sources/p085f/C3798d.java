package p085f;

import java.net.HttpURLConnection;
import java.net.URLConnection;

/* renamed from: f.d */
public enum C3798d {
    Get("GET"),
    Post("POST");
    

    /* renamed from: a */
    public final String f9775a;

    private C3798d(String str) {
        this.f9775a = str;
    }

    /* renamed from: a */
    public void mo18690a(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) uRLConnection).setRequestMethod(this.f9775a);
        }
    }
}
