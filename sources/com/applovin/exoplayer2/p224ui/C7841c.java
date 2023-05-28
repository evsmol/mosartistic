package com.applovin.exoplayer2.p224ui;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import com.applovin.exoplayer2.p221l.C7728ai;

/* renamed from: com.applovin.exoplayer2.ui.c */
public final class C7841c {

    /* renamed from: a */
    public static final C7841c f18712a = new C7841c(-1, -16777216, 0, 0, -1, (Typeface) null);

    /* renamed from: b */
    public final int f18713b;

    /* renamed from: c */
    public final int f18714c;

    /* renamed from: d */
    public final int f18715d;

    /* renamed from: e */
    public final int f18716e;

    /* renamed from: f */
    public final int f18717f;

    /* renamed from: g */
    public final Typeface f18718g;

    public C7841c(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.f18713b = i;
        this.f18714c = i2;
        this.f18715d = i3;
        this.f18716e = i4;
        this.f18717f = i5;
        this.f18718g = typeface;
    }

    /* renamed from: a */
    public static C7841c m23006a(CaptioningManager.CaptionStyle captionStyle) {
        return C7728ai.f18249a >= 21 ? m23008c(captionStyle) : m23007b(captionStyle);
    }

    /* renamed from: b */
    private static C7841c m23007b(CaptioningManager.CaptionStyle captionStyle) {
        return new C7841c(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    /* renamed from: c */
    private static C7841c m23008c(CaptioningManager.CaptionStyle captionStyle) {
        return new C7841c(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f18712a.f18713b, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f18712a.f18714c, captionStyle.hasWindowColor() ? captionStyle.windowColor : f18712a.f18715d, captionStyle.hasEdgeType() ? captionStyle.edgeType : f18712a.f18716e, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f18712a.f18717f, captionStyle.getTypeface());
    }
}
