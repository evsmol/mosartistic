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
import com.appodeal.ads.Appodeal;
import com.appodeal.ads.C9182f1;
import com.appodeal.ads.C9270m;

/* renamed from: com.appodeal.ads.utils.b */
public final class C9607b extends ArrayAdapter<String> {
    public C9607b(Context context) {
        super(context, -1);
    }

    public final int getCount() {
        return C9270m.m27456b(6).length;
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
        textView2.setTextSize(16.0f);
        textView2.setTextColor(C9622e.m28381a(Color.parseColor("#212121")));
        textView2.setGravity(16);
        if (Appodeal.isInitialized(C9603a.m28350a(C9270m.m27456b(6)[i]))) {
            textView2.setText(C9603a.m28351b(C9270m.m27456b(6)[i]));
        } else {
            textView2.setText(C9603a.m28351b(C9270m.m27456b(6)[i]) + " (Isn't Initialized)");
            textView.setTextColor(Color.parseColor("#50000000"));
            textView2.setTextColor(Color.parseColor("#50000000"));
        }
        relativeLayout.addView(textView);
        relativeLayout.addView(textView2);
        return relativeLayout;
    }
}
