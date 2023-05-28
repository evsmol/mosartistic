package com.bytedance.sdk.component.p313d.p316c.p317a.p318a;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.bytedance.sdk.component.d.c.a.a.c */
/* compiled from: StrictLineReader */
class C10509c implements Closeable {

    /* renamed from: a */
    private final InputStream f26206a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Charset f26207b;

    /* renamed from: c */
    private byte[] f26208c;

    /* renamed from: d */
    private int f26209d;

    /* renamed from: e */
    private int f26210e;

    public C10509c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public C10509c(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C10511d.f26212a)) {
            this.f26206a = inputStream;
            this.f26207b = charset;
            this.f26208c = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public void close() throws IOException {
        synchronized (this.f26206a) {
            if (this.f26208c != null) {
                this.f26208c = null;
                this.f26206a.close();
            }
        }
    }

    /* renamed from: a */
    public String mo64044a() throws IOException {
        int i;
        int i2;
        synchronized (this.f26206a) {
            if (this.f26208c != null) {
                if (this.f26209d >= this.f26210e) {
                    m30733c();
                }
                for (int i3 = this.f26209d; i3 != this.f26210e; i3++) {
                    if (this.f26208c[i3] == 10) {
                        if (i3 != this.f26209d) {
                            i2 = i3 - 1;
                            if (this.f26208c[i2] == 13) {
                                String str = new String(this.f26208c, this.f26209d, i2 - this.f26209d, this.f26207b.name());
                                this.f26209d = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.f26208c, this.f26209d, i2 - this.f26209d, this.f26207b.name());
                        this.f26209d = i3 + 1;
                        return str2;
                    }
                }
                C105101 r1 = new ByteArrayOutputStream((this.f26210e - this.f26209d) + 80) {
                    public String toString() {
                        try {
                            return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + -1] != 13) ? this.count : this.count - 1, C10509c.this.f26207b.name());
                        } catch (UnsupportedEncodingException e) {
                            throw new AssertionError(e);
                        }
                    }
                };
                loop1:
                while (true) {
                    r1.write(this.f26208c, this.f26209d, this.f26210e - this.f26209d);
                    this.f26210e = -1;
                    m30733c();
                    i = this.f26209d;
                    while (true) {
                        if (i != this.f26210e) {
                            if (this.f26208c[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.f26209d) {
                    r1.write(this.f26208c, this.f26209d, i - this.f26209d);
                }
                this.f26209d = i + 1;
                String byteArrayOutputStream = r1.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    /* renamed from: b */
    public boolean mo64045b() {
        return this.f26210e == -1;
    }

    /* renamed from: c */
    private void m30733c() throws IOException {
        InputStream inputStream = this.f26206a;
        byte[] bArr = this.f26208c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f26209d = 0;
            this.f26210e = read;
            return;
        }
        throw new EOFException();
    }
}
