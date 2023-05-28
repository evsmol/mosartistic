package com.yandex.metrica.impl.p082ob;

import android.net.Uri;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Ah */
public abstract class C1867Ah {

    /* renamed from: a */
    final Socket f5045a;

    /* renamed from: b */
    final C2063Gh f5046b;

    /* renamed from: c */
    final C2900di f5047c;

    /* renamed from: d */
    final Uri f5048d;

    /* renamed from: e */
    final C2097Hh f5049e;

    C1867Ah(Socket socket, Uri uri, C2063Gh gh, C2900di diVar, C2097Hh hh) {
        this.f5045a = socket;
        this.f5048d = uri;
        this.f5046b = gh;
        this.f5047c = diVar;
        this.f5049e = hh;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo15465a();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15466a(String str, Map<String, String> map, byte[] bArr) {
        BufferedOutputStream bufferedOutputStream;
        this.f5049e.mo15871b();
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(this.f5045a.getOutputStream());
            try {
                bufferedOutputStream.write(str.getBytes());
                m6858a(bufferedOutputStream);
                for (Map.Entry next : map.entrySet()) {
                    m6859a((OutputStream) bufferedOutputStream, (String) next.getKey(), (String) next.getValue());
                }
                m6858a(bufferedOutputStream);
                bufferedOutputStream.write(bArr);
                bufferedOutputStream.flush();
                this.f5049e.mo15872c();
                ((C2198Jh) this.f5046b).mo16038b(this.f5045a.getLocalPort(), this.f5049e);
            } catch (IOException e) {
                e = e;
                bufferedOutputStream2 = bufferedOutputStream;
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream2 = bufferedOutputStream;
                C1848A2.m6807a((Closeable) bufferedOutputStream2);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            try {
                ((C2198Jh) this.f5046b).mo16035a("io_exception_during_sync", (Throwable) e);
                bufferedOutputStream = bufferedOutputStream2;
                C1848A2.m6807a((Closeable) bufferedOutputStream);
            } catch (Throwable th2) {
                th = th2;
                C1848A2.m6807a((Closeable) bufferedOutputStream2);
                throw th;
            }
        }
        C1848A2.m6807a((Closeable) bufferedOutputStream);
    }

    /* renamed from: a */
    private void m6859a(OutputStream outputStream, String str, String str2) throws IOException {
        outputStream.write((str + ": " + str2).getBytes());
        m6858a(outputStream);
    }

    /* renamed from: a */
    private void m6858a(OutputStream outputStream) throws IOException {
        outputStream.write("\r\n".getBytes());
    }
}
