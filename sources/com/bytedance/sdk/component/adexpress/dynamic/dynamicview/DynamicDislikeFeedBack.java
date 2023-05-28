package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C10303c;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import com.bytedance.sdk.component.utils.C10647t;

public class DynamicDislikeFeedBack extends DynamicBaseWidgetImp {
    public DynamicDislikeFeedBack(Context context, DynamicRootView dynamicRootView, C10351h hVar) {
        super(context, dynamicRootView, hVar);
        this.f25759o = new TextView(context);
        this.f25759o.setTag(3);
        addView(this.f25759o, getWidgetLayoutParams());
        dynamicRootView.setDislikeView(this.f25759o);
    }

    /* renamed from: h */
    public boolean mo63645h() {
        super.mo63645h();
        ((TextView) this.f25759o).setText(getText());
        if (Build.VERSION.SDK_INT >= 17) {
            this.f25759o.setTextAlignment(this.f25756l.mo63522h());
        }
        ((TextView) this.f25759o).setTextColor(this.f25756l.mo63521g());
        ((TextView) this.f25759o).setTextSize(this.f25756l.mo63519e());
        if (Build.VERSION.SDK_INT >= 16) {
            this.f25759o.setBackground(getBackgroundDrawable());
        }
        if (!this.f25756l.mo63534t()) {
            ((TextView) this.f25759o).setMaxLines(1);
            ((TextView) this.f25759o).setGravity(17);
            ((TextView) this.f25759o).setEllipsize(TextUtils.TruncateAt.END);
        } else {
            int u = this.f25756l.mo63535u();
            if (u > 0) {
                ((TextView) this.f25759o).setLines(u);
                ((TextView) this.f25759o).setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        this.f25759o.setPadding((int) C10305b.m29747a(C10303c.m29743a(), (float) this.f25756l.mo63517c()), (int) C10305b.m29747a(C10303c.m29743a(), (float) this.f25756l.mo63516b()), (int) C10305b.m29747a(C10303c.m29743a(), (float) this.f25756l.mo63518d()), (int) C10305b.m29747a(C10303c.m29743a(), (float) this.f25756l.mo63513a()));
        ((TextView) this.f25759o).setGravity(17);
        return true;
    }

    public String getText() {
        return C10647t.m31276a(C10303c.m29743a(), "tt_reward_feedback");
    }
}
