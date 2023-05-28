package com.bytedance.sdk.component.p307b.p308a.p309a.p310a;

import com.bytedance.sdk.component.p307b.p308a.C10484n;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* renamed from: com.bytedance.sdk.component.b.a.a.a.g */
/* compiled from: NetResponseBody */
public class C10456g extends C10484n {

    /* renamed from: a */
    HttpURLConnection f26065a;

    /* renamed from: b */
    InputStream f26066b;

    C10456g(HttpURLConnection httpURLConnection) throws IOException {
        this.f26065a = httpURLConnection;
        this.f26066b = new C10454e(httpURLConnection.getInputStream(), httpURLConnection);
    }

    /* renamed from: a */
    public long mo63897a() {
        try {
            return (long) this.f26065a.getContentLength();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public String mo63898b() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f26066b));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    stringBuffer.append(readLine + "\n");
                } else {
                    String stringBuffer2 = stringBuffer.toString();
                    close();
                    return stringBuffer2;
                }
            }
        } catch (Exception unused) {
            return "";
        }
    }

    public void close() {
        try {
            this.f26066b.close();
            this.f26065a.disconnect();
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public InputStream mo63899c() {
        return this.f26066b;
    }

    /* renamed from: d */
    public byte[] mo63901d() {
        try {
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = this.f26066b.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Exception unused) {
            return new byte[0];
        }
    }
}
