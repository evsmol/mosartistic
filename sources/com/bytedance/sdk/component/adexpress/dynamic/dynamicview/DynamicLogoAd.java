package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C10303c;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h;
import com.bytedance.sdk.component.adexpress.dynamic.p304c.C10373l;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import com.bytedance.sdk.component.utils.C10647t;

public class DynamicLogoAd extends DynamicBaseWidgetImp {
    public DynamicLogoAd(Context context, DynamicRootView dynamicRootView, C10351h hVar) {
        super(context, dynamicRootView, hVar);
        this.f25759o = new TextView(context);
        this.f25759o.setTag(Integer.valueOf(getClickArea()));
        addView(this.f25759o, getWidgetLayoutParams());
    }

    /* renamed from: h */
    public boolean mo63645h() {
        super.mo63645h();
        if (Build.VERSION.SDK_INT >= 17) {
            this.f25759o.setTextAlignment(this.f25756l.mo63522h());
        }
        ((TextView) this.f25759o).setTextColor(this.f25756l.mo63521g());
        ((TextView) this.f25759o).setTextSize(this.f25756l.mo63519e());
        if (C10303c.m29744b()) {
            ((TextView) this.f25759o).setIncludeFontPadding(false);
            ((TextView) this.f25759o).setTextSize(Math.min(((float) ((C10305b.m29751b(C10303c.m29743a(), (float) this.f25752h) - this.f25756l.mo63516b()) - this.f25756l.mo63513a())) - 0.5f, this.f25756l.mo63519e()));
            ((TextView) this.f25759o).setText(C10647t.m31279b(getContext(), "tt_logo_en"));
            return true;
        } else if (!m30243a()) {
            ((TextView) this.f25759o).setText(C10647t.m31279b(getContext(), "tt_logo_cn"));
            return true;
        } else if (C10373l.m30211b()) {
            ((TextView) this.f25759o).setText(C10373l.m30205a());
            return true;
        } else {
            ((TextView) this.f25759o).setText(C10373l.m30206a(this.f25756l.f25670b));
            return true;
        }
    }

    /* renamed from: a */
    private boolean m30243a() {
        if (C10303c.m29744b()) {
            return false;
        }
        if ((TextUtils.isEmpty(this.f25756l.f25670b) || !this.f25756l.f25670b.contains("adx:")) && !C10373l.m30211b()) {
            return false;
        }
        return true;
    }
}
