package com.bytedance.sdk.openadsdk.component.view;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.core.C0503h;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.C1002v;

/* renamed from: com.bytedance.sdk.openadsdk.component.view.a */
/* compiled from: TTAppOpenAdUserInfo */
public class C0376a {

    /* renamed from: a */
    private static boolean f1265a;

    /* renamed from: b */
    private static Drawable f1266b;

    /* renamed from: c */
    private LinearLayout f1267c;

    /* renamed from: d */
    private TTRoundRectImageView f1268d;

    /* renamed from: e */
    private TextView f1269e;

    /* renamed from: a */
    public void mo1046a(Activity activity) {
        this.f1267c = (LinearLayout) activity.findViewById(C10647t.m31283e(activity, "tt_user_info"));
        this.f1268d = (TTRoundRectImageView) activity.findViewById(C10647t.m31283e(activity, "tt_app_icon"));
        this.f1269e = (TextView) activity.findViewById(C10647t.m31283e(activity, "tt_app_name"));
        this.f1267c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            }
        });
    }

    /* renamed from: a */
    public void mo1045a() {
        String g = C0503h.m2281d().mo1606g();
        if (TextUtils.isEmpty(g)) {
            this.f1269e.setVisibility(8);
        } else {
            this.f1269e.setText(g);
        }
        mo1048b();
        try {
            if (f1266b == null) {
                this.f1268d.setVisibility(8);
                return;
            }
            this.f1268d.setImageDrawable(f1266b);
            if (this.f1269e.getVisibility() == 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1268d.getLayoutParams();
                marginLayoutParams.setMargins(0, 0, 0, 0);
                this.f1268d.setLayoutParams(marginLayoutParams);
            }
        } catch (Throwable unused) {
            this.f1268d.setVisibility(8);
        }
    }

    /* renamed from: b */
    public void mo1048b() {
        if (!f1265a) {
            try {
                int h = C0503h.m2281d().mo1607h();
                if (h != 0) {
                    f1266b = C0558m.m2663a().getResources().getDrawable(h);
                }
            } catch (Throwable unused) {
            }
            f1265a = true;
        }
    }

    /* renamed from: c */
    public static Drawable m1606c() {
        return f1266b;
    }

    /* renamed from: a */
    public void mo1047a(C0477n nVar, float f, float f2) {
        int i;
        int i2;
        int d = nVar.mo1420d();
        if (d == 1 || d == 3) {
            if (C0477n.m2012c(nVar)) {
                i2 = nVar.mo1330J().mo62907c();
                i = nVar.mo1330J().mo62904b();
            } else {
                i2 = nVar.mo1336P().get(0).mo1285b();
                i = nVar.mo1336P().get(0).mo1288c();
            }
            if (i2 > 0 && i > 0) {
                float f3 = (float) i;
                float min = f2 - (f3 * Math.min(f / ((float) i2), f2 / f3));
                try {
                    float e = (float) C1002v.m4749e(C0558m.m2663a(), 60.0f);
                    if (min < e) {
                        min = e;
                    }
                    this.f1267c.setLayoutParams(new LinearLayout.LayoutParams(-1, (int) min));
                } catch (Throwable unused) {
                }
            }
        }
    }
}
