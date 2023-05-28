package com.applovin.exoplayer2.p209i.p213d;

import android.text.Spannable;

/* renamed from: com.applovin.exoplayer2.i.d.d */
public final class C7576d {
    /* renamed from: a */
    public static void m21454a(Spannable spannable, Object obj, int i, int i2, int i3) {
        for (Object obj2 : spannable.getSpans(i, i2, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i && spannable.getSpanEnd(obj2) == i2 && spannable.getSpanFlags(obj2) == i3) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i, i2, i3);
    }
}
