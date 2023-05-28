package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C10647t;
import java.util.Locale;

public class PlayableLoadingView extends FrameLayout {

    /* renamed from: a */
    private ProgressBar f2719a;

    /* renamed from: b */
    private TextView f2720b;

    /* renamed from: c */
    private TextView f2721c;

    public PlayableLoadingView(Context context) {
        super(context);
        m3701a(context);
    }

    public PlayableLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3701a(context);
    }

    public PlayableLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3701a(context);
    }

    /* renamed from: a */
    private void m3701a(Context context) {
        setBackgroundColor(Color.parseColor("#0D1833"));
        setClickable(true);
        setVisibility(8);
        LayoutInflater.from(context).inflate(C10647t.m31284f(context, "tt_playable_loading_layout"), this, true);
        this.f2719a = (ProgressBar) findViewById(C10647t.m31283e(context, "tt_playable_pb_view"));
        this.f2720b = (TextView) findViewById(C10647t.m31283e(context, "tt_playable_progress_tip"));
        TextView textView = (TextView) findViewById(C10647t.m31283e(context, "tt_playable_play"));
        this.f2721c = textView;
        textView.setText(C10647t.m31276a(context, "tt_try_now"));
    }

    public void setProgress(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i > 100) {
            i = 100;
        }
        ProgressBar progressBar = this.f2719a;
        if (progressBar != null) {
            progressBar.setProgress(i);
        }
        TextView textView = this.f2720b;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", new Object[]{Integer.valueOf(i)}));
        }
    }

    /* renamed from: a */
    public void mo2409a() {
        setVisibility(8);
    }

    /* renamed from: b */
    public void mo2410b() {
        setVisibility(0);
    }

    public TextView getPlayView() {
        return this.f2721c;
    }
}
