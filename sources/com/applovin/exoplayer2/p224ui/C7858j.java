package com.applovin.exoplayer2.p224ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.common.base.Predicate;
import com.applovin.exoplayer2.p209i.C7540a;
import com.applovin.exoplayer2.p209i.p213d.C7574b;
import com.applovin.exoplayer2.p221l.C7717a;

/* renamed from: com.applovin.exoplayer2.ui.j */
final class C7858j {
    /* renamed from: a */
    public static float m23209a(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = (float) i3;
        } else if (i == 1) {
            f2 = (float) i2;
        } else if (i != 2) {
            return -3.4028235E38f;
        } else {
            return f;
        }
        return f * f2;
    }

    /* renamed from: a */
    private static void m23210a(Spannable spannable, Predicate<Object> predicate) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (predicate.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    /* renamed from: a */
    public static void m23211a(C7540a.C7542a aVar) {
        aVar.mo54653d();
        if (aVar.mo54644a() instanceof Spanned) {
            if (!(aVar.mo54644a() instanceof Spannable)) {
                aVar.mo54643a((CharSequence) SpannableString.valueOf(aVar.mo54644a()));
            }
            m23210a((Spannable) C7717a.m22120b(aVar.mo54644a()), $$Lambda$j$Wj07K9zwq_368d5eEbFmnr85nI.INSTANCE);
        }
        m23213b(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m23212a(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    /* renamed from: b */
    public static void m23213b(C7540a.C7542a aVar) {
        aVar.mo54647b(-3.4028235E38f, RecyclerView.UNDEFINED_DURATION);
        if (aVar.mo54644a() instanceof Spanned) {
            if (!(aVar.mo54644a() instanceof Spannable)) {
                aVar.mo54643a((CharSequence) SpannableString.valueOf(aVar.mo54644a()));
            }
            m23210a((Spannable) C7717a.m22120b(aVar.mo54644a()), $$Lambda$j$YbwFiXWaIGPVam87Gsv5lmdzf80.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ boolean m23214b(Object obj) {
        return !(obj instanceof C7574b);
    }
}
