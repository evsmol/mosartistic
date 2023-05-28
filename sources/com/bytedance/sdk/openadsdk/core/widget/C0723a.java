package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.core.C0558m;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.a */
/* compiled from: CustomCommonDialog */
public class C0723a extends Dialog {

    /* renamed from: a */
    public C0726a f2789a;

    /* renamed from: b */
    private ImageView f2790b;

    /* renamed from: c */
    private TextView f2791c;

    /* renamed from: d */
    private TextView f2792d;

    /* renamed from: e */
    private Button f2793e;

    /* renamed from: f */
    private Button f2794f;

    /* renamed from: g */
    private View f2795g;

    /* renamed from: h */
    private Context f2796h;

    /* renamed from: i */
    private String f2797i;

    /* renamed from: j */
    private String f2798j;

    /* renamed from: k */
    private String f2799k;

    /* renamed from: l */
    private String f2800l;

    /* renamed from: m */
    private int f2801m = -1;

    /* renamed from: n */
    private boolean f2802n = false;

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.a$a */
    /* compiled from: CustomCommonDialog */
    public interface C0726a {
        /* renamed from: a */
        void mo225a();

        /* renamed from: b */
        void mo226b();
    }

    public void onBackPressed() {
    }

    public C0723a(Context context) {
        super(context, C10647t.m31285g(context, "tt_custom_dialog"));
        this.f2796h = context;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C10647t.m31284f(this.f2796h, "tt_custom_dailog_layout"));
        setCanceledOnTouchOutside(false);
        m3725c();
        m3724b();
        m3723a();
    }

    /* renamed from: a */
    private void m3723a() {
        this.f2794f.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C0723a.this.f2789a != null) {
                    C0723a.this.f2789a.mo225a();
                }
            }
        });
        this.f2793e.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C0723a.this.f2789a != null) {
                    C0723a.this.f2789a.mo226b();
                }
            }
        });
    }

    /* renamed from: b */
    private void m3724b() {
        if (!TextUtils.isEmpty(this.f2798j)) {
            this.f2791c.setText(this.f2798j);
            this.f2791c.setVisibility(0);
        } else {
            this.f2791c.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f2797i)) {
            this.f2792d.setText(this.f2797i);
        }
        if (!TextUtils.isEmpty(this.f2799k)) {
            this.f2794f.setText(this.f2799k);
        } else {
            this.f2794f.setText(C10647t.m31276a(C0558m.m2663a(), "tt_postive_txt"));
        }
        if (!TextUtils.isEmpty(this.f2800l)) {
            this.f2793e.setText(this.f2800l);
        } else {
            this.f2793e.setText(C10647t.m31276a(C0558m.m2663a(), "tt_negtive_txt"));
        }
        int i = this.f2801m;
        if (i != -1) {
            this.f2790b.setImageResource(i);
            this.f2790b.setVisibility(0);
        } else {
            this.f2790b.setVisibility(8);
        }
        if (this.f2802n) {
            this.f2795g.setVisibility(8);
            this.f2793e.setVisibility(8);
            return;
        }
        this.f2793e.setVisibility(0);
        this.f2795g.setVisibility(0);
    }

    public void show() {
        super.show();
        m3724b();
    }

    /* renamed from: c */
    private void m3725c() {
        this.f2793e = (Button) findViewById(C10647t.m31283e(this.f2796h, "tt_negtive"));
        this.f2794f = (Button) findViewById(C10647t.m31283e(this.f2796h, "tt_positive"));
        this.f2791c = (TextView) findViewById(C10647t.m31283e(this.f2796h, "tt_title"));
        this.f2792d = (TextView) findViewById(C10647t.m31283e(this.f2796h, "tt_message"));
        this.f2790b = (ImageView) findViewById(C10647t.m31283e(this.f2796h, "tt_image"));
        this.f2795g = findViewById(C10647t.m31283e(this.f2796h, "tt_column_line"));
    }

    /* renamed from: a */
    public C0723a mo2460a(C0726a aVar) {
        this.f2789a = aVar;
        return this;
    }

    /* renamed from: a */
    public C0723a mo2461a(String str) {
        this.f2797i = str;
        return this;
    }

    /* renamed from: b */
    public C0723a mo2462b(String str) {
        this.f2799k = str;
        return this;
    }

    /* renamed from: c */
    public C0723a mo2463c(String str) {
        this.f2800l = str;
        return this;
    }
}
