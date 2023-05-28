package com.bytedance.sdk.openadsdk.common;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C10621a;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.common.e */
/* compiled from: TTPrivacyAdReportDialog */
public class C0213e extends Dialog {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String[] f718b = {"SDK version", "App", "App version", "OS", "Device", "Creative info"};

    /* renamed from: a */
    private Handler f719a = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f720c = "";
    /* access modifiers changed from: private */

    /* renamed from: d */
    public TextView f721d;

    public C0213e(Context context) {
        super(context, C10647t.m31285g(context, "tt_privacy_dialog_theme_ad_report"));
    }

    /* renamed from: a */
    public void mo547a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f720c = C10621a.m31186a(new JSONObject(str)).toString();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(getContext()).inflate(C10647t.m31284f(getContext(), "tt_ad_report_info"), (ViewGroup) null), new ViewGroup.LayoutParams(C1002v.m4740c(getContext()), (int) (((double) C1002v.m4744d(getContext())) * 0.9d)));
        m864b();
        if (getWindow() != null) {
            getWindow().setGravity(80);
        }
    }

    /* renamed from: b */
    private void m864b() {
        this.f721d = (TextView) findViewById(C10647t.m31283e(getContext(), "tt_ad_report_creative_info"));
        final String d = C0996u.m4648d();
        final String f = C0996u.m4660f();
        final String str = "Android " + Build.VERSION.RELEASE;
        final String str2 = Build.BRAND + " " + Build.MODEL;
        ((TextView) findViewById(C10647t.m31283e(getContext(), "tt_ad_report_sdk_version"))).setText("4.5.0.6");
        ((TextView) findViewById(C10647t.m31283e(getContext(), "tt_ad_report_app_package_name"))).setText(d);
        ((TextView) findViewById(C10647t.m31283e(getContext(), "tt_ad_report_app_version"))).setText(f);
        ((TextView) findViewById(C10647t.m31283e(getContext(), "tt_ad_report_os"))).setText(str);
        ((TextView) findViewById(C10647t.m31283e(getContext(), "tt_ad_report_device"))).setText(str2);
        this.f721d.setText("loading ...");
        ((Button) findViewById(C10647t.m31283e(getContext(), "tt_ad_report_copy_button"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) C0213e.this.getContext().getSystemService("clipboard");
                if (clipboardManager != null) {
                    StringBuilder sb = new StringBuilder("");
                    String[] strArr = {"4.5.0.6", d, f, str, str2, C0213e.this.f720c};
                    for (int i = 0; i < C0213e.f718b.length; i++) {
                        sb.append(C0213e.f718b[i]);
                        sb.append(": ");
                        sb.append(strArr[i]);
                        sb.append("\n");
                    }
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("pangle sdk build info", sb));
                }
            }
        });
        ((ImageView) findViewById(C10647t.m31283e(getContext(), "tt_ad_report_close_button"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C0213e.this.f721d.setText("loading ...");
                C0213e.this.cancel();
            }
        });
    }

    public void show() {
        super.show();
        this.f719a.postDelayed(new Runnable() {
            public void run() {
                C0213e.this.f721d.setText(C0213e.this.f720c);
            }
        }, 1000);
    }
}
