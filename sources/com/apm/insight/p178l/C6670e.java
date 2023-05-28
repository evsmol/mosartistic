package com.apm.insight.p178l;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: com.apm.insight.l.e */
public class C6670e extends PrintWriter {

    /* renamed from: a */
    private MessageDigest f14353a = null;

    /* renamed from: b */
    private Charset f14354b = null;

    /* renamed from: c */
    private C6671a f14355c = null;

    /* renamed from: com.apm.insight.l.e$a */
    public static class C6671a {
        /* renamed from: a */
        public boolean mo52101a(String str) {
            return true;
        }
    }

    public C6670e(OutputStream outputStream, MessageDigest messageDigest, C6671a aVar) {
        super(outputStream);
        this.f14353a = messageDigest;
        this.f14355c = aVar;
        if (messageDigest != null) {
            this.f14354b = Charset.defaultCharset();
        }
    }

    public void write(int i) {
        super.write(i);
        MessageDigest messageDigest = this.f14353a;
        if (messageDigest != null) {
            messageDigest.update((byte) i);
        }
    }

    public void write(String str, int i, int i2) {
        super.write(str, i, i2);
        if (this.f14353a != null) {
            C6671a aVar = this.f14355c;
            if (aVar == null || aVar.mo52101a(str)) {
                this.f14353a.update(this.f14354b.encode(CharBuffer.wrap(str, i, i2 + i)).array());
            }
        }
    }

    public void write(char[] cArr, int i, int i2) {
        super.write(cArr, i, i2);
        MessageDigest messageDigest = this.f14353a;
        if (messageDigest != null) {
            messageDigest.update(this.f14354b.encode(CharBuffer.wrap(cArr)).array());
        }
    }
}
