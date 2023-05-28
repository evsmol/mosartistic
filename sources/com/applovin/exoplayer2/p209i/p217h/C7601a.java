package com.applovin.exoplayer2.p209i.p217h;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.p209i.C7540a;
import com.applovin.exoplayer2.p209i.C7572d;
import com.applovin.exoplayer2.p209i.C7585f;
import com.applovin.exoplayer2.p209i.C7600h;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7772y;
import java.util.List;
import kotlin.KotlinVersion;

/* renamed from: com.applovin.exoplayer2.i.h.a */
public final class C7601a extends C7572d {

    /* renamed from: a */
    private final C7772y f17732a = new C7772y();

    /* renamed from: b */
    private final boolean f17733b;

    /* renamed from: c */
    private final int f17734c;

    /* renamed from: d */
    private final int f17735d;

    /* renamed from: e */
    private final String f17736e;

    /* renamed from: f */
    private final float f17737f;

    /* renamed from: g */
    private final int f17738g;

    public C7601a(List<byte[]> list) {
        super("Tx3gDecoder");
        String str = "sans-serif";
        boolean z = true;
        if (list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.f17734c = bArr[24];
            this.f17735d = ((bArr[26] & 255) << Ascii.CAN) | ((bArr[27] & 255) << Ascii.DLE) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f17736e = "Serif".equals(C7728ai.m22204a(bArr, 43, bArr.length - 43)) ? "serif" : str;
            this.f17738g = bArr[25] * Ascii.DC4;
            z = (bArr[0] & 32) == 0 ? false : z;
            this.f17733b = z;
            if (z) {
                this.f17737f = C7728ai.m22178a(((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) this.f17738g), 0.0f, 0.95f);
            } else {
                this.f17737f = 0.85f;
            }
        } else {
            this.f17734c = 0;
            this.f17735d = -1;
            this.f17736e = str;
            this.f17733b = false;
            this.f17737f = 0.85f;
            this.f17738g = -1;
        }
    }

    /* renamed from: a */
    private static String m21581a(C7772y yVar) throws C7600h {
        char g;
        m21585a(yVar.mo55064a() >= 2);
        int i = yVar.mo55085i();
        if (i == 0) {
            return "";
        }
        return yVar.mo55066a(i, (yVar.mo55064a() < 2 || !((g = yVar.mo55082g()) == 65279 || g == 65534)) ? Charsets.UTF_8 : Charsets.UTF_16);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0036  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m21582a(android.text.SpannableStringBuilder r5, int r6, int r7, int r8, int r9, int r10) {
        /*
            if (r6 == r7) goto L_0x004c
            r7 = r10 | 33
            r10 = r6 & 1
            r0 = 0
            r1 = 1
            if (r10 == 0) goto L_0x000c
            r10 = 1
            goto L_0x000d
        L_0x000c:
            r10 = 0
        L_0x000d:
            r2 = r6 & 2
            if (r2 == 0) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            if (r10 == 0) goto L_0x0023
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            if (r2 == 0) goto L_0x001f
            r4 = 3
            r3.<init>(r4)
            goto L_0x002b
        L_0x001f:
            r3.<init>(r1)
            goto L_0x002b
        L_0x0023:
            if (r2 == 0) goto L_0x002e
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r4 = 2
            r3.<init>(r4)
        L_0x002b:
            r5.setSpan(r3, r8, r9, r7)
        L_0x002e:
            r6 = r6 & 4
            if (r6 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r1 = 0
        L_0x0034:
            if (r1 == 0) goto L_0x003e
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r5.setSpan(r6, r8, r9, r7)
        L_0x003e:
            if (r1 != 0) goto L_0x004c
            if (r10 != 0) goto L_0x004c
            if (r2 != 0) goto L_0x004c
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r0)
            r5.setSpan(r6, r8, r9, r7)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p209i.p217h.C7601a.m21582a(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }

    /* renamed from: a */
    private static void m21583a(SpannableStringBuilder spannableStringBuilder, String str, int i, int i2) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, 16711713);
        }
    }

    /* renamed from: a */
    private void m21584a(C7772y yVar, SpannableStringBuilder spannableStringBuilder) throws C7600h {
        int i;
        m21585a(yVar.mo55064a() >= 12);
        int i2 = yVar.mo55085i();
        int i3 = yVar.mo55085i();
        yVar.mo55079e(2);
        int h = yVar.mo55084h();
        yVar.mo55079e(1);
        int q = yVar.mo55093q();
        if (i3 > spannableStringBuilder.length()) {
            C7755q.m22361c("Tx3gDecoder", "Truncating styl end (" + i3 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            i = spannableStringBuilder.length();
        } else {
            i = i3;
        }
        if (i2 >= i) {
            C7755q.m22361c("Tx3gDecoder", "Ignoring styl with start (" + i2 + ") >= end (" + i + ").");
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int i4 = i2;
        int i5 = i;
        m21582a(spannableStringBuilder2, h, this.f17734c, i4, i5, 0);
        m21586b(spannableStringBuilder2, q, this.f17735d, i4, i5, 0);
    }

    /* renamed from: a */
    private static void m21585a(boolean z) throws C7600h {
        if (!z) {
            throw new C7600h("Unexpected subtitle format.");
        }
    }

    /* renamed from: b */
    private static void m21586b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & KotlinVersion.MAX_COMPONENT_VALUE) << 24)), i3, i4, i5 | 33);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7585f mo54699a(byte[] bArr, int i, boolean z) throws C7600h {
        this.f17732a.mo55070a(bArr, i);
        String a = m21581a(this.f17732a);
        if (a.isEmpty()) {
            return C7602b.f17739a;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        m21582a(spannableStringBuilder2, this.f17734c, 0, 0, spannableStringBuilder.length(), 16711680);
        m21586b(spannableStringBuilder2, this.f17735d, -1, 0, spannableStringBuilder.length(), 16711680);
        m21583a(spannableStringBuilder, this.f17736e, 0, spannableStringBuilder.length());
        float f = this.f17737f;
        while (this.f17732a.mo55064a() >= 8) {
            int c = this.f17732a.mo55074c();
            int q = this.f17732a.mo55093q();
            int q2 = this.f17732a.mo55093q();
            boolean z2 = true;
            if (q2 == 1937013100) {
                if (this.f17732a.mo55064a() < 2) {
                    z2 = false;
                }
                m21585a(z2);
                int i2 = this.f17732a.mo55085i();
                for (int i3 = 0; i3 < i2; i3++) {
                    m21584a(this.f17732a, spannableStringBuilder);
                }
            } else if (q2 == 1952608120 && this.f17733b) {
                if (this.f17732a.mo55064a() < 2) {
                    z2 = false;
                }
                m21585a(z2);
                f = C7728ai.m22178a(((float) this.f17732a.mo55085i()) / ((float) this.f17738g), 0.0f, 0.95f);
            }
            this.f17732a.mo55076d(c + q);
        }
        return new C7602b(new C7540a.C7542a().mo54643a((CharSequence) spannableStringBuilder).mo54639a(f, 0).mo54640a(0).mo54656e());
    }
}
