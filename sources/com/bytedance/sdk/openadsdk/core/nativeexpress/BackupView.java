package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.C10642o;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p016b.C0405a;
import com.bytedance.sdk.openadsdk.core.p016b.C0406b;
import com.bytedance.sdk.openadsdk.core.p021e.C0460j;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.dislike.C0759b;
import com.bytedance.sdk.openadsdk.p000b.C0146j;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.bytedance.sdk.openadsdk.utils.C1002v;

public abstract class BackupView extends FrameLayout {

    /* renamed from: a */
    private C0146j f2091a;
    /* access modifiers changed from: protected */

    /* renamed from: b */
    public Context f2092b;
    /* access modifiers changed from: protected */

    /* renamed from: c */
    public C0477n f2093c;

    /* renamed from: d */
    protected C0759b f2094d;

    /* renamed from: e */
    protected TTDislikeDialogAbstract f2095e;
    /* access modifiers changed from: protected */

    /* renamed from: f */
    public String f2096f = "embeded_ad";

    /* renamed from: g */
    protected int f2097g;

    /* renamed from: h */
    protected int f2098h;

    /* renamed from: i */
    protected int f2099i;

    /* renamed from: j */
    protected boolean f2100j = true;

    /* renamed from: k */
    protected boolean f2101k = true;

    /* renamed from: l */
    protected String f2102l;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo957a(View view, int i, C0460j jVar);

    public Object getTag() {
        return "tt_express_backup_fl_tag_26";
    }

    public BackupView(Context context) {
        super(context);
        setTag("tt_express_backup_fl_tag_26");
    }

    public BackupView(Context context, String str) {
        super(context);
        this.f2102l = str;
        setTag("tt_express_backup_fl_tag_26");
    }

    public void setTag(Object obj) {
        super.setTag("tt_express_backup_fl_tag_26");
    }

    public void setDislikeInner(TTAdDislike tTAdDislike) {
        if (tTAdDislike instanceof C0759b) {
            this.f2094d = (C0759b) tTAdDislike;
        }
    }

    public void setDislikeOuter(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        C0477n nVar;
        if (!(tTDislikeDialogAbstract == null || (nVar = this.f2093c) == null)) {
            tTDislikeDialogAbstract.setMaterialMeta(nVar);
        }
        this.f2095e = tTDislikeDialogAbstract;
    }

    /* renamed from: a */
    public void mo1123a() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.f2095e;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        C0759b bVar = this.f2094d;
        if (bVar != null) {
            bVar.showDislikeDialog();
        } else {
            TTDelegateActivity.m183a(this.f2093c, (String) null);
        }
    }

    /* access modifiers changed from: protected */
    public String getNameOrSource() {
        C0477n nVar = this.f2093c;
        if (nVar == null) {
            return "";
        }
        if (nVar.mo1380aa() != null && !TextUtils.isEmpty(this.f2093c.mo1380aa().mo1217b())) {
            return this.f2093c.mo1380aa().mo1217b();
        }
        if (!TextUtils.isEmpty(this.f2093c.mo1331K())) {
            return this.f2093c.mo1331K();
        }
        return "";
    }

    /* access modifiers changed from: protected */
    public String getTitle() {
        if (this.f2093c.mo1380aa() != null && !TextUtils.isEmpty(this.f2093c.mo1380aa().mo1217b())) {
            return this.f2093c.mo1380aa().mo1217b();
        }
        if (!TextUtils.isEmpty(this.f2093c.mo1331K())) {
            return this.f2093c.mo1331K();
        }
        return !TextUtils.isEmpty(this.f2093c.mo1341U()) ? this.f2093c.mo1341U() : "";
    }

    /* access modifiers changed from: protected */
    public String getDescription() {
        if (!TextUtils.isEmpty(this.f2093c.mo1341U())) {
            return this.f2093c.mo1341U();
        }
        return !TextUtils.isEmpty(this.f2093c.mo1342V()) ? this.f2093c.mo1342V() : "";
    }

    public float getRealWidth() {
        return (float) C1002v.m4745d(this.f2092b, (float) this.f2097g);
    }

    public float getRealHeight() {
        return (float) C1002v.m4745d(this.f2092b, (float) this.f2098h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1848a(View view, boolean z) {
        C0406b bVar;
        if (view != null) {
            if (z) {
                Context context = this.f2092b;
                C0477n nVar = this.f2093c;
                String str = this.f2096f;
                bVar = new C0405a(context, nVar, str, C0996u.m4610a(str));
            } else {
                Context context2 = this.f2092b;
                C0477n nVar2 = this.f2093c;
                String str2 = this.f2096f;
                bVar = new C0406b(context2, nVar2, str2, C0996u.m4610a(str2));
            }
            view.setOnTouchListener(bVar);
            view.setOnClickListener(bVar);
            bVar.mo1105a((C0573a) new C0573a() {
                /* renamed from: a */
                public void mo1859a(View view, int i, C0460j jVar) {
                    BackupView.this.mo957a(view, i, jVar);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public View getVideoView() {
        NativeVideoTsView nativeVideoTsView;
        C0477n nVar = this.f2093c;
        if (!(nVar == null || this.f2092b == null)) {
            if (C0477n.m2012c(nVar)) {
                try {
                    nativeVideoTsView = new NativeVideoTsView(this.f2092b, this.f2093c, this.f2096f, true, false, this.f2091a);
                    nativeVideoTsView.setVideoCacheUrl(this.f2102l);
                    nativeVideoTsView.setControllerStatusCallBack(new NativeVideoTsView.C0674b() {
                        /* renamed from: a */
                        public void mo619a(boolean z, long j, long j2, long j3, boolean z2) {
                        }
                    });
                    nativeVideoTsView.setIsAutoPlay(this.f2100j);
                    nativeVideoTsView.setIsQuiet(this.f2101k);
                } catch (Throwable unused) {
                }
                if (C0477n.m2012c(this.f2093c) || nativeVideoTsView == null || !nativeVideoTsView.mo2201a(0, true, false)) {
                    return null;
                }
                return nativeVideoTsView;
            }
            nativeVideoTsView = null;
            if (C0477n.m2012c(this.f2093c)) {
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1846a(int i) {
        this.f2101k = C0558m.m2673h().mo1676a(this.f2099i);
        int c = C0558m.m2673h().mo1680c(i);
        if (3 == c) {
            this.f2100j = false;
            return;
        }
        int c2 = C10642o.m31260c(C0558m.m2663a());
        if (1 == c && C0996u.m4656e(c2)) {
            this.f2100j = true;
        } else if (2 == c) {
            if (C0996u.m4661f(c2) || C0996u.m4656e(c2) || C0996u.m4666g(c2)) {
                this.f2100j = true;
            }
        } else if (5 != c) {
        } else {
            if (C0996u.m4656e(c2) || C0996u.m4666g(c2)) {
                this.f2100j = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1847a(View view) {
        C0477n nVar = this.f2093c;
        if (nVar != null && nVar.mo1330J() != null && view != null) {
            if (this.f2093c.mo1459p() != 1 || !this.f2100j) {
                mo1848a(view, false);
            } else {
                mo1848a(view, true);
            }
        }
    }
}
