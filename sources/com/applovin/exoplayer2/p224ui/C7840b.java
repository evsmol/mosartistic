package com.applovin.exoplayer2.p224ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.p209i.C7540a;
import com.applovin.exoplayer2.p224ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.ui.b */
final class C7840b extends View implements SubtitleView.C7838a {

    /* renamed from: a */
    private final List<C7857i> f18706a;

    /* renamed from: b */
    private List<C7540a> f18707b;

    /* renamed from: c */
    private int f18708c;

    /* renamed from: d */
    private float f18709d;

    /* renamed from: e */
    private C7841c f18710e;

    /* renamed from: f */
    private float f18711f;

    public C7840b(Context context) {
        this(context, (AttributeSet) null);
    }

    public C7840b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18706a = new ArrayList();
        this.f18707b = Collections.emptyList();
        this.f18708c = 0;
        this.f18709d = 0.0533f;
        this.f18710e = C7841c.f18712a;
        this.f18711f = 0.08f;
    }

    /* renamed from: a */
    private static C7540a m23004a(C7540a aVar) {
        C7540a.C7542a a = aVar.mo54635a().mo54638a(-3.4028235E38f).mo54648b((int) RecyclerView.UNDEFINED_DURATION).mo54642a((Layout.Alignment) null);
        if (aVar.f17406g == 0) {
            a.mo54639a(1.0f - aVar.f17405f, 0);
        } else {
            a.mo54639a((-aVar.f17405f) - 1.0f, 1);
        }
        int i = aVar.f17407h;
        if (i == 0) {
            a.mo54640a(2);
        } else if (i == 2) {
            a.mo54640a(0);
        }
        return a.mo54656e();
    }

    /* renamed from: a */
    public void mo55291a(List<C7540a> list, C7841c cVar, float f, int i, float f2) {
        this.f18707b = list;
        this.f18710e = cVar;
        this.f18709d = f;
        this.f18708c = i;
        this.f18711f = f2;
        while (this.f18706a.size() < list.size()) {
            this.f18706a.add(new C7857i(getContext()));
        }
        invalidate();
    }

    public void dispatchDraw(Canvas canvas) {
        List<C7540a> list = this.f18707b;
        if (!list.isEmpty()) {
            int height = getHeight();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int paddingBottom = height - getPaddingBottom();
            if (paddingBottom > paddingTop && width > paddingLeft) {
                int i = paddingBottom - paddingTop;
                float a = C7858j.m23209a(this.f18708c, this.f18709d, height, i);
                if (a > 0.0f) {
                    int size = list.size();
                    int i2 = 0;
                    while (i2 < size) {
                        C7540a aVar = list.get(i2);
                        if (aVar.f17416q != Integer.MIN_VALUE) {
                            aVar = m23004a(aVar);
                        }
                        C7540a aVar2 = aVar;
                        float f = a;
                        int i3 = paddingBottom;
                        this.f18706a.get(i2).mo55403a(aVar2, this.f18710e, f, C7858j.m23209a(aVar2.f17414o, aVar2.f17415p, height, i), this.f18711f, canvas, paddingLeft, paddingTop, width, i3);
                        i2++;
                        size = size;
                        i = i;
                        paddingBottom = i3;
                        width = width;
                    }
                }
            }
        }
    }
}
