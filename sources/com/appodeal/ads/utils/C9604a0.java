package com.appodeal.ads.utils;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appodeal.ads.C9182f1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.appodeal.ads.utils.a0 */
public final class C9604a0 extends ArrayAdapter<C9630k> {

    /* renamed from: a */
    public final List<C9630k> f24351a;

    public C9604a0(Context context, ArrayList arrayList) {
        super(context, -1, arrayList);
        this.f24351a = arrayList;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.setLayoutParams(new AbsListView.LayoutParams(-1, Math.round(C9182f1.m27290l(getContext()) * 48.0f)));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.setExitFadeDuration(200);
        stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(-1692651));
        stateListDrawable.addState(new int[0], new ColorDrawable(-1));
        relativeLayout.setBackground(stateListDrawable);
        TextView textView = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Math.round(C9182f1.m27290l(getContext()) * 48.0f), -2);
        layoutParams.addRule(15);
        textView.setLayoutParams(layoutParams);
        textView.setText(String.valueOf(i + 1));
        textView.setTextSize(16.0f);
        textView.setGravity(17);
        textView.setTextColor(C9622e.m28381a(Color.parseColor("#212121")));
        textView.setId(View.generateViewId());
        TextView textView2 = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams2.addRule(15);
        layoutParams2.addRule(1, textView.getId());
        textView2.setLayoutParams(layoutParams2);
        textView2.setText(this.f24351a.get(i).f24404c);
        textView2.setTextSize(16.0f);
        textView2.setTextColor(C9622e.m28381a(Color.parseColor("#212121")));
        textView2.setGravity(16);
        relativeLayout.addView(textView);
        relativeLayout.addView(textView2);
        return relativeLayout;
    }
}
