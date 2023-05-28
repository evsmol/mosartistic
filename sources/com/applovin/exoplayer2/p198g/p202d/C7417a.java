package com.applovin.exoplayer2.p198g.p202d;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p198g.C7416d;
import com.applovin.exoplayer2.p198g.C7460g;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.applovin.exoplayer2.g.d.a */
public final class C7417a extends C7460g {

    /* renamed from: a */
    private static final Pattern f17003a = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: b */
    private final CharsetDecoder f17004b = Charsets.UTF_8.newDecoder();

    /* renamed from: c */
    private final CharsetDecoder f17005c = Charsets.ISO_8859_1.newDecoder();

    /* renamed from: a */
    private String m20655a(ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder;
        try {
            str = this.f17004b.decode(byteBuffer).toString();
            charsetDecoder = this.f17004b;
        } catch (CharacterCodingException unused) {
            this.f17004b.reset();
            byteBuffer.rewind();
            try {
                str = this.f17005c.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                str = null;
            } catch (Throwable th) {
                this.f17005c.reset();
                byteBuffer.rewind();
                throw th;
            }
            charsetDecoder = this.f17005c;
        } catch (Throwable th2) {
            this.f17004b.reset();
            byteBuffer.rewind();
            throw th2;
        }
        charsetDecoder.reset();
        byteBuffer.rewind();
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7399a mo54223a(C7416d dVar, ByteBuffer byteBuffer) {
        String a = m20655a(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (a == null) {
            return new C7399a(new C7420c(bArr, (String) null, (String) null));
        }
        Matcher matcher = f17003a.matcher(a);
        String str2 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String lowerCase = Ascii.toLowerCase(group);
                char c = 65535;
                int hashCode = lowerCase.hashCode();
                if (hashCode != -315603473) {
                    if (hashCode == 1646559960 && lowerCase.equals("streamtitle")) {
                        c = 0;
                    }
                } else if (lowerCase.equals("streamurl")) {
                    c = 1;
                }
                if (c == 0) {
                    str = group2;
                } else if (c == 1) {
                    str2 = group2;
                }
            }
        }
        return new C7399a(new C7420c(bArr, str, str2));
    }
}
