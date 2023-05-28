package com.applovin.impl.mediation.debugger.p243ui.p244a;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C8656R;

/* renamed from: com.applovin.impl.mediation.debugger.ui.a.d */
public class C8187d extends Dialog {

    /* renamed from: a */
    private ViewGroup f20025a;

    /* renamed from: b */
    private AppLovinSdkUtils.Size f20026b;

    /* renamed from: c */
    private Activity f20027c;

    /* renamed from: d */
    private RelativeLayout f20028d;

    public C8187d(ViewGroup viewGroup, AppLovinSdkUtils.Size size, Activity activity) {
        super(activity, 16973840);
        this.f20025a = viewGroup;
        this.f20026b = size;
        this.f20027c = activity;
        requestWindowFeature(1);
    }

    public void dismiss() {
        this.f20028d.removeView(this.f20025a);
        super.dismiss();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this.f20027c, this.f20026b.getWidth()), AppLovinSdkUtils.dpToPx(this.f20027c, this.f20026b.getHeight()));
        layoutParams.addRule(13);
        this.f20025a.setLayoutParams(layoutParams);
        int dpToPx = AppLovinSdkUtils.dpToPx(this.f20027c, 60);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        ImageButton imageButton = new ImageButton(this.f20027c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.f20027c.getResources().getDrawable(C8656R.C8659drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground((Drawable) null);
        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C8187d.this.dismiss();
            }
        });
        RelativeLayout relativeLayout = new RelativeLayout(this.f20027c);
        this.f20028d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f20028d.setBackgroundColor(RecyclerView.UNDEFINED_DURATION);
        this.f20028d.addView(imageButton);
        this.f20028d.addView(this.f20025a);
        this.f20028d.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C8187d.this.dismiss();
            }
        });
        setContentView(this.f20028d);
    }
}
