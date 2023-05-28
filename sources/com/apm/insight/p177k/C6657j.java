package com.apm.insight.p177k;

import com.apm.insight.C6617h;
import com.apm.insight.p178l.C6675i;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.apm.insight.k.j */
public class C6657j {

    /* renamed from: a */
    private final String f14326a = ("AAA" + System.currentTimeMillis() + "AAA");

    /* renamed from: b */
    private HttpURLConnection f14327b;

    /* renamed from: c */
    private String f14328c;

    /* renamed from: d */
    private boolean f14329d;

    /* renamed from: e */
    private C6650f f14330e;

    /* renamed from: f */
    private C6661m f14331f;

    public C6657j(String str, String str2, boolean z) {
        this.f14328c = str2;
        this.f14329d = z;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f14327b = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        this.f14327b.setDoOutput(true);
        this.f14327b.setDoInput(true);
        this.f14327b.setRequestMethod("POST");
        HttpURLConnection httpURLConnection2 = this.f14327b;
        httpURLConnection2.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + this.f14326a);
        if (z) {
            this.f14327b.setRequestProperty("Content-Encoding", "gzip");
            this.f14331f = new C6661m(this.f14327b.getOutputStream());
            return;
        }
        this.f14330e = new C6650f(this.f14327b.getOutputStream());
    }

    /* renamed from: a */
    public String mo52146a() {
        ArrayList<String> arrayList = new ArrayList<>();
        byte[] bytes = ("\r\n--" + this.f14326a + "--" + "\r\n").getBytes();
        if (this.f14329d) {
            this.f14331f.write(bytes);
            this.f14331f.mo52155b();
            this.f14331f.mo52154a();
        } else {
            this.f14330e.write(bytes);
            this.f14330e.flush();
            this.f14330e.mo52137a();
        }
        int responseCode = this.f14327b.getResponseCode();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f14327b.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                arrayList.add(readLine);
            }
            bufferedReader.close();
            this.f14327b.disconnect();
            StringBuilder sb = new StringBuilder();
            for (String append : arrayList) {
                sb.append(append);
            }
            return sb.toString();
        }
        throw new IOException("Server returned non-OK status: " + responseCode);
    }

    /* renamed from: a */
    public void mo52147a(String str, File file, Map<String, String> map) {
        String name = file.getName();
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f14326a);
        sb.append("\r\n");
        sb.append("Content-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"; filename=\"");
        sb.append(name);
        sb.append("\"");
        for (Map.Entry next : map.entrySet()) {
            sb.append("; ");
            sb.append((String) next.getKey());
            sb.append("=\"");
            sb.append((String) next.getValue());
            sb.append("\"");
        }
        sb.append("\r\n");
        sb.append("Content-Transfer-Encoding: binary");
        sb.append("\r\n");
        sb.append("\r\n");
        if (this.f14329d) {
            this.f14331f.write(sb.toString().getBytes());
        } else {
            this.f14330e.write(sb.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                break;
            } else if (this.f14329d) {
                this.f14331f.write(bArr, 0, read);
            } else {
                this.f14330e.write(bArr, 0, read);
            }
        }
        fileInputStream.close();
        if (this.f14329d) {
            this.f14331f.write("\r\n".getBytes());
            return;
        }
        this.f14330e.write("\r\n".getBytes());
        this.f14330e.flush();
    }

    /* renamed from: a */
    public void mo52148a(String str, String str2) {
        mo52149a(str, str2, false);
    }

    /* renamed from: a */
    public void mo52149a(String str, String str2, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f14326a);
        sb.append("\r\n");
        sb.append("Content-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"");
        sb.append("\r\n");
        sb.append("Content-Type: text/plain; charset=");
        sb.append(this.f14328c);
        sb.append("\r\n");
        sb.append("\r\n");
        try {
            if (this.f14329d) {
                this.f14331f.write(sb.toString().getBytes());
            } else {
                this.f14330e.write(sb.toString().getBytes());
            }
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        if (z) {
            bytes = C6617h.m16315i().getEncryptImpl().mo52022a(bytes);
        }
        try {
            if (this.f14329d) {
                this.f14331f.write(bytes);
                this.f14331f.write("\r\n".getBytes());
                return;
            }
            this.f14330e.write(bytes);
            this.f14330e.write("\r\n".getBytes());
        } catch (IOException unused2) {
        }
    }

    /* renamed from: a */
    public void mo52150a(String str, File... fileArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f14326a);
        sb.append("\r\n");
        sb.append("Content-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"; filename=\"");
        sb.append(str);
        sb.append("\"");
        sb.append("\r\n");
        sb.append("Content-Transfer-Encoding: binary");
        sb.append("\r\n");
        sb.append("\r\n");
        if (this.f14329d) {
            this.f14331f.write(sb.toString().getBytes());
        } else {
            this.f14330e.write(sb.toString().getBytes());
        }
        C6675i.m16528a(this.f14329d ? this.f14331f : this.f14330e, fileArr);
        if (this.f14329d) {
            this.f14331f.write("\r\n".getBytes());
            return;
        }
        this.f14330e.write("\r\n".getBytes());
        this.f14330e.flush();
    }
}
