package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h;

public class DynamicPrivacyView extends DynamicBaseWidgetImp {

    /* renamed from: a */
    private TextView f25774a = new TextView(this.f25755k);

    /* renamed from: b */
    private TextView f25775b = new TextView(this.f25755k);

    /* renamed from: s */
    private TextView f25776s = new TextView(this.f25755k);

    /* renamed from: t */
    private LinearLayout f25777t = new LinearLayout(this.f25755k);

    public DynamicPrivacyView(Context context, DynamicRootView dynamicRootView, C10351h hVar) {
        super(context, dynamicRootView, hVar);
        this.f25774a.setTag(9);
        this.f25775b.setTag(10);
        addView(this.f25777t, getWidgetLayoutParams());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo63625d() {
        this.f25774a.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.f25774a.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.f25775b.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.f25775b.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        return true;
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.f25751g, this.f25752h);
    }

    /* renamed from: h */
    public boolean mo63645h() {
        this.f25775b.setText("权限列表");
        this.f25776s.setText(" | ");
        this.f25774a.setText("隐私政策");
        if (this.f25756l != null) {
            this.f25775b.setTextColor(this.f25756l.mo63521g());
            this.f25775b.setTextSize(this.f25756l.mo63519e());
            this.f25776s.setTextColor(this.f25756l.mo63521g());
            this.f25774a.setTextColor(this.f25756l.mo63521g());
            this.f25774a.setTextSize(this.f25756l.mo63519e());
        } else {
            this.f25775b.setTextColor(-1);
            this.f25775b.setTextSize(12.0f);
            this.f25776s.setTextColor(-1);
            this.f25774a.setTextColor(-1);
            this.f25774a.setTextSize(12.0f);
        }
        this.f25777t.addView(this.f25775b);
        this.f25777t.addView(this.f25776s);
        this.f25777t.addView(this.f25774a);
        return false;
    }
}
