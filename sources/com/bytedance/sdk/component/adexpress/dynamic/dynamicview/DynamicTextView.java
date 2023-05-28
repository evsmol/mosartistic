package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C10303c;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import com.bytedance.sdk.component.adexpress.widget.AnimationText;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10647t;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

public class DynamicTextView extends DynamicBaseWidgetImp {
    public DynamicTextView(Context context, DynamicRootView dynamicRootView, C10351h hVar) {
        super(context, dynamicRootView, hVar);
        if (this.f25756l.mo63502A()) {
            this.f25759o = new AnimationText(context, this.f25756l.mo63521g(), this.f25756l.mo63519e(), 1, this.f25756l.mo63522h());
            ((AnimationText) this.f25759o).setMaxLines(1);
        } else {
            this.f25759o = new TextView(context);
        }
        this.f25759o.setTag(Integer.valueOf(getClickArea()));
        addView(this.f25759o, getWidgetLayoutParams());
    }

    /* renamed from: h */
    public boolean mo63645h() {
        int i;
        super.mo63645h();
        if (TextUtils.isEmpty(getText())) {
            this.f25759o.setVisibility(4);
            return true;
        } else if (this.f25756l.mo63502A()) {
            m30277k();
            return true;
        } else {
            ((TextView) this.f25759o).setText(this.f25756l.mo63520f());
            if (Build.VERSION.SDK_INT >= 17) {
                this.f25759o.setTextAlignment(this.f25756l.mo63522h());
            }
            ((TextView) this.f25759o).setTextColor(this.f25756l.mo63521g());
            ((TextView) this.f25759o).setTextSize(this.f25756l.mo63519e());
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
            if (!(this.f25757m == null || this.f25757m.mo63563i() == null)) {
                if (!C10303c.m29744b() || !m30274a() || (!TextUtils.equals(this.f25757m.mo63563i().mo63357b(), "text_star") && !TextUtils.equals(this.f25757m.mo63563i().mo63357b(), "score-count") && !TextUtils.equals(this.f25757m.mo63563i().mo63357b(), "score-count-type-1") && !TextUtils.equals(this.f25757m.mo63563i().mo63357b(), "score-count-type-2"))) {
                    if (TextUtils.equals(this.f25757m.mo63563i().mo63357b(), "score-count") || TextUtils.equals(this.f25757m.mo63563i().mo63357b(), "score-count-type-2")) {
                        try {
                            i = Integer.parseInt(getText());
                        } catch (NumberFormatException unused) {
                            i = -1;
                        }
                        if (i < 0) {
                            try {
                                if (C10303c.m29744b()) {
                                    setVisibility(8);
                                    return true;
                                }
                                this.f25759o.setVisibility(0);
                            } catch (Exception unused2) {
                            }
                        }
                        m30275i();
                        if (TextUtils.equals(this.f25757m.mo63563i().mo63357b(), "score-count-type-2")) {
                            ((TextView) this.f25759o).setText(String.format(new DecimalFormat("(###,###,###)").format((long) i), new Object[]{Integer.valueOf(i)}));
                            ((TextView) this.f25759o).setGravity(17);
                            return true;
                        }
                        mo63678a((TextView) this.f25759o, i, getContext(), "tt_comment_num");
                    } else if (TextUtils.equals(this.f25757m.mo63563i().mo63357b(), "text_star")) {
                        double d = -1.0d;
                        try {
                            d = Double.parseDouble(getText());
                        } catch (Exception e) {
                            C10638l.m31242e("DynamicStarView applyNativeStyle", e.toString());
                        }
                        if (d < 0.0d || d > 5.0d) {
                            if (C10303c.m29744b()) {
                                setVisibility(8);
                                return true;
                            }
                            this.f25759o.setVisibility(0);
                        }
                        m30275i();
                        ((TextView) this.f25759o).setIncludeFontPadding(false);
                        ((TextView) this.f25759o).setGravity(17);
                        if (Build.VERSION.SDK_INT >= 17) {
                            this.f25759o.setTextAlignment(4);
                        }
                        ((TextView) this.f25759o).setText(String.format("%.1f", new Object[]{Double.valueOf(d)}));
                    } else if (TextUtils.equals("privacy-detail", this.f25757m.mo63563i().mo63357b())) {
                        ((TextView) this.f25759o).setText("权限列表 | 隐私政策");
                    } else if (TextUtils.equals(this.f25757m.mo63563i().mo63357b(), "development-name")) {
                        ((TextView) this.f25759o).setText("开发者：" + getText());
                    } else if (TextUtils.equals(this.f25757m.mo63563i().mo63357b(), "app-version")) {
                        ((TextView) this.f25759o).setText("版本号：V" + getText());
                    } else {
                        ((TextView) this.f25759o).setText(getText());
                    }
                    if (Build.VERSION.SDK_INT >= 17) {
                        this.f25759o.setTextAlignment(this.f25756l.mo63522h());
                        ((TextView) this.f25759o).setGravity(this.f25756l.mo63523i());
                    }
                    if (C10303c.m29744b()) {
                        m30276j();
                    }
                } else {
                    setVisibility(8);
                    return true;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    private boolean m30274a() {
        return (this.f25758n == null || this.f25758n.getRenderRequest() == null || this.f25758n.getRenderRequest().mo63185k() == 4) ? false : true;
    }

    /* renamed from: i */
    private void m30275i() {
        if ((this.f25756l.mo63513a() != 0 || this.f25756l.mo63516b() <= 0) && C10303c.m29744b()) {
            this.f25759o.setTranslationY((float) (-(((int) ((((float) this.f25752h) - ((TextView) this.f25759o).getTextSize()) - C10305b.m29747a(getContext(), (float) (this.f25756l.mo63516b() + this.f25756l.mo63513a())))) / 2)));
        }
    }

    /* renamed from: j */
    private void m30276j() {
        if ((TextUtils.equals(this.f25757m.mo63563i().mo63357b(), "source") || TextUtils.equals(this.f25757m.mo63563i().mo63357b(), "title")) && Build.VERSION.SDK_INT >= 17) {
            this.f25759o.setTextAlignment(2);
        }
        if ((TextUtils.equals(this.f25757m.mo63563i().mo63357b(), "text_star") || TextUtils.equals(this.f25757m.mo63563i().mo63357b(), "fillButton")) && Build.VERSION.SDK_INT >= 17) {
            this.f25759o.setTextAlignment(2);
            ((TextView) this.f25759o).setGravity(17);
        }
    }

    public String getText() {
        String f = this.f25756l.mo63520f();
        if (TextUtils.isEmpty(f)) {
            if (!C10303c.m29744b() && TextUtils.equals(this.f25757m.mo63563i().mo63357b(), "text_star")) {
                f = "5";
            }
            if (!C10303c.m29744b() && TextUtils.equals(this.f25757m.mo63563i().mo63357b(), "score-count")) {
                f = "6870";
            }
        }
        return (TextUtils.equals(this.f25757m.mo63563i().mo63357b(), "title") || TextUtils.equals(this.f25757m.mo63563i().mo63357b(), "subtitle")) ? f.replace("\n", "") : f;
    }

    /* renamed from: a */
    public void mo63678a(TextView textView, int i, Context context, String str) {
        String format = String.format(C10647t.m31276a(context, str), new Object[]{Integer.valueOf(i)});
        textView.setText("(" + format + ")");
        if (i == -1) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: k */
    private void m30277k() {
        if (this.f25759o instanceof AnimationText) {
            String text = getText();
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(text);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.optString(i));
                }
            } catch (JSONException e) {
                e.printStackTrace();
                arrayList.add(text);
            }
            ((AnimationText) this.f25759o).setMaxLines(1);
            ((AnimationText) this.f25759o).setTextColor(this.f25756l.mo63521g());
            ((AnimationText) this.f25759o).setTextSize(this.f25756l.mo63519e());
            ((AnimationText) this.f25759o).setAnimationText(arrayList);
            ((AnimationText) this.f25759o).setAnimationType(this.f25756l.mo63504C());
            ((AnimationText) this.f25759o).setAnimationDuration(this.f25756l.mo63503B() * 1000);
            ((AnimationText) this.f25759o).mo63710a();
        }
    }
}
