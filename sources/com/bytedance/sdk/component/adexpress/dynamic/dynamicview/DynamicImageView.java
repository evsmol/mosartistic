package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h;
import com.bytedance.sdk.component.adexpress.p294a.p295a.C10262a;
import com.bytedance.sdk.component.adexpress.p299c.C10304a;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import com.bytedance.sdk.component.adexpress.widget.TTRoundRectImageView;
import com.bytedance.sdk.component.p313d.C10560i;
import com.bytedance.sdk.component.p313d.C10561j;
import com.bytedance.sdk.component.p313d.C10565n;
import com.bytedance.sdk.component.p313d.C10571t;
import com.bytedance.sdk.component.utils.C10647t;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

public class DynamicImageView extends DynamicBaseWidgetImp {

    /* renamed from: a */
    private String f25772a;

    public DynamicImageView(Context context, DynamicRootView dynamicRootView, C10351h hVar) {
        super(context, dynamicRootView, hVar);
        if (this.f25756l.mo63529o() > 0.0f) {
            this.f25759o = new TTRoundRectImageView(context);
            ((TTRoundRectImageView) this.f25759o).setXRound((int) C10305b.m29747a(context, this.f25756l.mo63529o()));
            ((TTRoundRectImageView) this.f25759o).setYRound((int) C10305b.m29747a(context, this.f25756l.mo63529o()));
        } else {
            this.f25759o = new ImageView(context);
        }
        this.f25772a = getImageKey();
        this.f25759o.setTag(Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(hVar.mo63563i().mo63357b())) {
            if (this.f25756l.mo63516b() > 0 || this.f25756l.mo63513a() > 0) {
                this.f25751g = Math.min(this.f25751g, this.f25752h);
                this.f25752h = Math.min(this.f25751g, this.f25752h);
                this.f25753i = (int) (((float) this.f25753i) + C10305b.m29747a(context, ((float) (this.f25756l.mo63516b() + (this.f25756l.mo63513a() / 2))) + 0.5f));
            } else {
                this.f25751g = Math.max(this.f25751g, this.f25752h);
                this.f25752h = Math.max(this.f25751g, this.f25752h);
            }
            this.f25756l.mo63514a((float) (this.f25751g / 2));
        }
        addView(this.f25759o, new FrameLayout.LayoutParams(this.f25751g, this.f25752h));
    }

    /* renamed from: h */
    public boolean mo63645h() {
        super.mo63645h();
        if ("arrowButton".equals(this.f25757m.mo63563i().mo63357b())) {
            ((ImageView) this.f25759o).setImageResource(C10647t.m31282d(this.f25755k, "tt_white_righterbackicon_titlebar"));
            this.f25759o.setPadding(0, 0, 0, 0);
            ((ImageView) this.f25759o).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        this.f25759o.setBackgroundColor(this.f25756l.mo63537w());
        if ("user".equals(this.f25757m.mo63563i().mo63360c())) {
            ((ImageView) this.f25759o).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.f25759o).setColorFilter(this.f25756l.mo63521g());
            ((ImageView) this.f25759o).setImageDrawable(C10647t.m31281c(getContext(), "tt_user"));
            ((ImageView) this.f25759o).setPadding(this.f25751g / 10, this.f25752h / 5, this.f25751g / 10, 0);
        }
        if (!m30239a() || Build.VERSION.SDK_INT < 17) {
            C10560i a = C10262a.m29464a().mo63097e().mo64068a(this.f25756l.mo63525k()).mo64108a(this.f25772a);
            String o = this.f25758n.getRenderRequest().mo63189o();
            if (!TextUtils.isEmpty(o)) {
                a.mo64111b(o);
            }
            a.mo64101a((ImageView) this.f25759o);
            ((ImageView) this.f25759o).setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            ((ImageView) this.f25759o).setScaleType(ImageView.ScaleType.FIT_CENTER);
            C10262a.m29464a().mo63097e().mo64068a(this.f25756l.mo63525k()).mo64107a(C10571t.BITMAP).mo64102a((C10565n) new C10565n<Bitmap>() {
                /* renamed from: a */
                public void mo256a(int i, String str, Throwable th) {
                }

                /* renamed from: a */
                public void mo257a(C10561j<Bitmap> jVar) {
                    Bitmap a = C10304a.m29746a(DynamicImageView.this.f25755k, jVar.mo64116b(), 25);
                    if (a != null) {
                        DynamicImageView.this.f25759o.setBackground(new BitmapDrawable(DynamicImageView.this.getResources(), a));
                    }
                }
            });
        }
        return true;
    }

    /* renamed from: a */
    private boolean m30239a() {
        String l = this.f25756l.mo63526l();
        if (this.f25756l.mo63533s()) {
            return true;
        }
        if (TextUtils.isEmpty(l)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(l);
            if (Math.abs((((float) this.f25751g) / (((float) this.f25752h) * 1.0f)) - (((float) jSONObject.optInt(IabUtils.KEY_WIDTH)) / (((float) jSONObject.optInt(IabUtils.KEY_HEIGHT)) * 1.0f))) <= 0.01f) {
                return false;
            }
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    private String getImageKey() {
        Map<String, String> l = this.f25758n.getRenderRequest().mo63186l();
        if (l == null || l.size() <= 0) {
            return null;
        }
        return l.get(this.f25756l.mo63525k());
    }
}
