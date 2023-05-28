package com.bytedance.sdk.component.p307b.p308a.p309a.p310a;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* renamed from: com.bytedance.sdk.component.b.a.a.a.e */
/* compiled from: NetInputStram */
public class C10454e extends InputStream {

    /* renamed from: a */
    InputStream f26061a;

    /* renamed from: b */
    HttpURLConnection f26062b;

    public C10454e(InputStream inputStream, HttpURLConnection httpURLConnection) {
        this.f26061a = inputStream;
        this.f26062b = httpURLConnection;
    }

    public int read() throws IOException {
        InputStream inputStream = this.f26061a;
        if (inputStream != null) {
            return inputStream.read();
        }
        return 0;
    }

    public int read(byte[] bArr) throws IOException {
        InputStream inputStream = this.f26061a;
        if (inputStream != null) {
            return inputStream.read(bArr);
        }
        return 0;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        InputStream inputStream = this.f26061a;
        if (inputStream != null) {
            return inputStream.read(bArr, i, i2);
        }
        return 0;
    }

    public long skip(long j) throws IOException {
        InputStream inputStream = this.f26061a;
        if (inputStream != null) {
            return inputStream.skip(j);
        }
        return 0;
    }

    public int available() throws IOException {
        InputStream inputStream = this.f26061a;
        if (inputStream != null) {
            return inputStream.available();
        }
        return 0;
    }

    public void close() throws IOException {
        InputStream inputStream = this.f26061a;
        if (inputStream != null) {
            inputStream.close();
            this.f26061a = null;
        }
        HttpURLConnection httpURLConnection = this.f26062b;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.f26062b = null;
        }
    }

    public synchronized void mark(int i) {
        if (this.f26061a != null) {
            this.f26061a.mark(i);
        }
    }

    public void reset() throws IOException {
        InputStream inputStream = this.f26061a;
        if (inputStream != null) {
            inputStream.reset();
        }
    }

    public boolean markSupported() {
        InputStream inputStream = this.f26061a;
        if (inputStream != null) {
            return inputStream.markSupported();
        }
        return false;
    }
}
