package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.os.Looper;
import android.view.View;
import com.bytedance.sdk.component.adexpress.p298b.C10282a;
import com.bytedance.sdk.component.adexpress.p298b.C10285c;
import com.bytedance.sdk.component.adexpress.p298b.C10289f;
import com.bytedance.sdk.component.adexpress.p298b.C10296l;
import com.bytedance.sdk.component.adexpress.p298b.C10298m;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.core.C0547k;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.l */
/* compiled from: NativeRender */
public class C0599l extends C10282a<BackupView> {

    /* renamed from: a */
    AtomicBoolean f2242a = new AtomicBoolean(false);

    /* renamed from: b */
    private BackupView f2243b;

    /* renamed from: c */
    private View f2244c;

    /* renamed from: d */
    private C10285c f2245d;

    /* renamed from: e */
    private C10289f f2246e;

    /* renamed from: f */
    private C10296l f2247f;

    public C0599l(View view, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, C10296l lVar) {
        this.f2244c = view;
        this.f2247f = lVar;
    }

    /* renamed from: a */
    public void mo1937a(C10289f fVar) {
        this.f2246e = fVar;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m2894b();
        } else {
            C0547k.m2622d().post(new Runnable() {
                public void run() {
                    C0599l.this.m2894b();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m2894b() {
        if (!this.f2242a.get()) {
            C10285c cVar = this.f2245d;
            boolean z = false;
            if (cVar != null && cVar.mo971a((NativeExpressView) this.f2244c, 0)) {
                z = true;
            }
            if (!z) {
                this.f2246e.mo1929a(107);
                return;
            }
            this.f2247f.mo63177c().mo1971e();
            BackupView backupView = (BackupView) this.f2244c.findViewWithTag("tt_express_backup_fl_tag_26");
            this.f2243b = backupView;
            if (backupView != null) {
                C10298m mVar = new C10298m();
                BackupView backupView2 = this.f2243b;
                float f = 0.0f;
                float realWidth = backupView2 == null ? 0.0f : backupView2.getRealWidth();
                BackupView backupView3 = this.f2243b;
                if (backupView3 != null) {
                    f = backupView3.getRealHeight();
                }
                mVar.mo63211a(true);
                mVar.mo63207a((double) realWidth);
                mVar.mo63214b((double) f);
                this.f2246e.mo1930a(this.f2243b, mVar);
                return;
            }
            this.f2246e.mo1929a(107);
        }
    }

    /* renamed from: a */
    public BackupView mo1946e() {
        return this.f2243b;
    }

    /* renamed from: a */
    public void mo1982a(C10285c cVar) {
        this.f2245d = cVar;
    }
}
