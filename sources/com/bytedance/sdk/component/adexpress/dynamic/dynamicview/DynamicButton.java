package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C10303c;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.AnimationButton;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h;

public class DynamicButton extends DynamicBaseWidgetImp {
    public DynamicButton(Context context, DynamicRootView dynamicRootView, C10351h hVar) {
        super(context, dynamicRootView, hVar);
        this.f25759o = new AnimationButton(context);
        this.f25759o.setTag(Integer.valueOf(getClickArea()));
        addView(this.f25759o, getWidgetLayoutParams());
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        if (C10303c.m29744b() && "fillButton".equals(this.f25757m.mo63563i().mo63357b())) {
            ((TextView) this.f25759o).setEllipsize(TextUtils.TruncateAt.END);
            ((TextView) this.f25759o).setMaxLines(1);
        }
        return super.getWidgetLayoutParams();
    }

    /* renamed from: h */
    public boolean mo63645h() {
        super.mo63645h();
        if (!TextUtils.equals("download-progress-button", this.f25757m.mo63563i().mo63357b()) || !TextUtils.isEmpty(this.f25756l.mo63524j())) {
            if (Build.VERSION.SDK_INT >= 17) {
                this.f25759o.setTextAlignment(this.f25756l.mo63522h());
            }
            ((TextView) this.f25759o).setText(this.f25756l.mo63524j());
            ((TextView) this.f25759o).setTextColor(this.f25756l.mo63521g());
            ((TextView) this.f25759o).setTextSize(this.f25756l.mo63519e());
            ((TextView) this.f25759o).setGravity(17);
            ((TextView) this.f25759o).setIncludeFontPadding(false);
            if ("fillButton".equals(this.f25757m.mo63563i().mo63357b())) {
                this.f25759o.setPadding(0, 0, 0, 0);
            } else {
                this.f25759o.setPadding(this.f25756l.mo63517c(), this.f25756l.mo63516b(), this.f25756l.mo63518d(), this.f25756l.mo63513a());
            }
            return true;
        }
        this.f25759o.setVisibility(4);
        return true;
    }
}
