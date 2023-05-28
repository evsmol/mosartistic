package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.core.C0402b;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p023g.C0496d;
import com.bytedance.sdk.openadsdk.core.p023g.C0497e;
import com.bytedance.sdk.openadsdk.core.widget.C0731b;
import com.bytedance.sdk.openadsdk.dislike.C0759b;
import com.bytedance.sdk.openadsdk.utils.C0960c;
import com.bytedance.sdk.openadsdk.utils.C0963d;
import org.json.JSONException;
import org.json.JSONObject;

public class TTDelegateActivity extends Activity {

    /* renamed from: a */
    private Intent f133a;

    /* renamed from: b */
    private AlertDialog f134b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C0731b f135c;

    /* renamed from: d */
    private TTAdDislike f136d;

    /* renamed from: a */
    public static void m182a() {
        Intent intent = new Intent(C0558m.m2663a(), TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 5);
        if (C0558m.m2663a() != null) {
            C0558m.m2663a().startActivity(intent);
        }
    }

    /* renamed from: a */
    public static void m183a(C0477n nVar, String str) {
        Intent intent = new Intent(C0558m.m2663a(), TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 6);
        intent.putExtra("materialmeta", nVar.mo1397ar().toString());
        intent.putExtra("closed_listener_key", str);
        if (C0558m.m2663a() != null) {
            C0558m.m2663a().startActivity(intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess()) {
            finish();
        }
        m188b();
        this.f133a = getIntent();
        if (C0558m.m2663a() == null) {
            C0558m.m2665a(this);
        }
    }

    /* renamed from: b */
    private void m188b() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (C0558m.m2663a() == null) {
            C0558m.m2665a(this);
        }
        setIntent(intent);
        this.f133a = intent;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (getIntent() != null) {
            m189c();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        try {
            if (this.f134b != null && this.f134b.isShowing()) {
                this.f134b.dismiss();
            }
            if (this.f135c != null && this.f135c.isShowing()) {
                this.f135c.dismiss();
            }
        } catch (Throwable unused) {
        }
        super.onDestroy();
    }

    /* renamed from: c */
    private void m189c() {
        int intExtra = this.f133a.getIntExtra("type", 0);
        String stringExtra = this.f133a.getStringExtra("app_download_url");
        this.f133a.getStringExtra("app_name");
        if (intExtra == 1) {
            return;
        }
        if (intExtra == 3) {
            m186a(stringExtra, this.f133a.getStringExtra("dialog_title_key"), this.f133a.getStringExtra("dialog_content_key"));
        } else if (intExtra == 4) {
            m187a(this.f133a.getStringExtra("permission_id_key"), this.f133a.getStringArrayExtra("permission_content_key"));
        } else if (intExtra == 5) {
            m190d();
        } else if (intExtra != 6) {
            finish();
        } else {
            m184a(this.f133a.getStringExtra("materialmeta"), this.f133a.getStringExtra("closed_listener_key"));
        }
    }

    /* renamed from: a */
    private void m184a(String str, String str2) {
        if (str != null && this.f136d == null) {
            try {
                C0759b bVar = new C0759b(this, C0402b.m1636a(new JSONObject(str)));
                this.f136d = bVar;
                bVar.mo2520a(str2);
                this.f136d.setDislikeInteractionCallback(new TTAdDislike.DislikeInteractionCallback() {
                    public void onSelected(int i, String str) {
                        C10638l.m31238c("showDislike", "onSelected->position=" + i + ",value=" + str);
                        TTDelegateActivity.this.finish();
                    }

                    public void onCancel() {
                        C10638l.m31238c("showDislike", "onCancel->onCancel....");
                        TTDelegateActivity.this.finish();
                    }

                    public void onRefuse() {
                        C10638l.m31238c("showDislike", "onRefuse->onRefuse....");
                    }
                });
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        TTAdDislike tTAdDislike = this.f136d;
        if (tTAdDislike != null) {
            tTAdDislike.showDislikeDialog();
        }
    }

    /* renamed from: d */
    private void m190d() {
        if (this.f135c == null) {
            C0731b bVar = new C0731b(this);
            this.f135c = bVar;
            bVar.mo2479a(C10647t.m31276a(this, "no_thank_you"), (C0731b.C0735b) new C0731b.C0735b() {
                /* renamed from: a */
                public void mo150a() {
                    TTAdSdk.setGdpr(0);
                    if (TTDelegateActivity.this.f135c.isShowing()) {
                        TTDelegateActivity.this.f135c.dismiss();
                    }
                    TTDelegateActivity.this.finish();
                }
            }).mo2480a(C10647t.m31276a(this, "yes_i_agree"), (C0731b.C0736c) new C0731b.C0736c() {
                /* renamed from: a */
                public void mo149a() {
                    TTAdSdk.setGdpr(1);
                    if (TTDelegateActivity.this.f135c.isShowing()) {
                        TTDelegateActivity.this.f135c.dismiss();
                    }
                    TTDelegateActivity.this.finish();
                }
            });
        }
        if (!this.f135c.isShowing()) {
            this.f135c.show();
        }
    }

    /* renamed from: a */
    private void m187a(final String str, String[] strArr) {
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
            finish();
        } else if (Build.VERSION.SDK_INT >= 23) {
            try {
                C0496d.m2261a().mo1571a((Activity) this, strArr, (C0497e) new C0497e() {
                    /* renamed from: a */
                    public void mo151a() {
                        C0963d.m4477a(str);
                        TTDelegateActivity.this.finish();
                    }

                    /* renamed from: a */
                    public void mo152a(String str) {
                        C0963d.m4478a(str, str);
                        TTDelegateActivity.this.finish();
                    }
                });
            } catch (Exception unused) {
                finish();
            }
        } else {
            C10638l.m31235b(TTAdConstant.TAG, "Already have permission");
            finish();
        }
    }

    /* renamed from: a */
    private void m186a(final String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            str2 = C10647t.m31276a(this, "tt_tip");
        }
        String str4 = str2;
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        m185a(str4, str3, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                C0960c.m4467a(str);
                TTDelegateActivity.this.finish();
            }
        }, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                C0960c.m4470b(str);
                TTDelegateActivity.this.finish();
            }
        }, new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
                C0960c.m4471c(str);
                TTDelegateActivity.this.finish();
            }
        });
    }

    /* renamed from: a */
    private void m185a(String str, String str2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener) {
        String str3;
        try {
            if (this.f134b == null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    str3 = "Theme.Dialog.TTDownload";
                } else {
                    str3 = "Theme.Dialog.TTDownloadOld";
                }
                this.f134b = new AlertDialog.Builder(this, C10647t.m31285g(this, str3)).create();
            }
            this.f134b.setTitle(String.valueOf(str));
            this.f134b.setMessage(String.valueOf(str2));
            this.f134b.setButton(-1, C10647t.m31276a(this, "tt_label_ok"), onClickListener);
            this.f134b.setButton(-2, C10647t.m31276a(this, "tt_label_cancel"), onClickListener2);
            this.f134b.setOnCancelListener(onCancelListener);
            if (!this.f134b.isShowing()) {
                this.f134b.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C0496d.m2261a().mo1572a((Activity) this, strArr, iArr);
        finish();
    }
}
