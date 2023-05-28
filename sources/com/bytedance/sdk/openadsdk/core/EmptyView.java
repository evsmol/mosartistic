package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.C10633j;
import com.bytedance.sdk.component.utils.C10652x;
import com.bytedance.sdk.openadsdk.core.p016b.C0408c;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class EmptyView extends View implements C10652x.C10653a {

    /* renamed from: a */
    private boolean f1271a;

    /* renamed from: b */
    private boolean f1272b;

    /* renamed from: c */
    private C0378a f1273c;

    /* renamed from: d */
    private View f1274d;

    /* renamed from: e */
    private List<View> f1275e;

    /* renamed from: f */
    private List<View> f1276f;

    /* renamed from: g */
    private boolean f1277g;

    /* renamed from: h */
    private int f1278h;

    /* renamed from: i */
    private final Handler f1279i = new C10652x(Looper.getMainLooper(), this);

    /* renamed from: j */
    private final AtomicBoolean f1280j = new AtomicBoolean(true);

    /* renamed from: com.bytedance.sdk.openadsdk.core.EmptyView$a */
    public interface C0378a {
        /* renamed from: a */
        void mo1062a();

        /* renamed from: a */
        void mo1063a(View view);

        /* renamed from: a */
        void mo1064a(boolean z);

        /* renamed from: b */
        void mo1065b();
    }

    public EmptyView(Context context, View view) {
        super(C0558m.m2663a());
        this.f1274d = view;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C0378a aVar = this.f1273c;
        if (aVar != null) {
            aVar.mo1064a(z);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1613d();
        this.f1277g = false;
        m1611b();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        m1611b();
    }

    /* renamed from: b */
    private void m1611b() {
        C0378a aVar;
        if (this.f1280j.getAndSet(false) && (aVar = this.f1273c) != null) {
            aVar.mo1062a();
        }
    }

    /* renamed from: c */
    private void m1612c() {
        C0378a aVar;
        if (!this.f1280j.getAndSet(true) && (aVar = this.f1273c) != null) {
            aVar.mo1065b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1614e();
        this.f1277g = true;
        m1612c();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        m1612c();
    }

    public void setRefClickViews(List<View> list) {
        this.f1275e = list;
    }

    public void setRefCreativeViews(List<View> list) {
        this.f1276f = list;
    }

    /* renamed from: a */
    public void mo1050a() {
        mo1051a(this.f1275e, (C0408c) null);
        mo1051a(this.f1276f, (C0408c) null);
    }

    /* renamed from: a */
    public void mo1051a(List<View> list, C0408c cVar) {
        if (C10633j.m31222b(list)) {
            for (View next : list) {
                if (next != null) {
                    next.setOnClickListener(cVar);
                    next.setOnTouchListener(cVar);
                }
            }
        }
    }

    /* renamed from: d */
    private void m1613d() {
        if (this.f1272b && !this.f1271a) {
            this.f1271a = true;
            this.f1279i.sendEmptyMessage(1);
        }
    }

    /* renamed from: e */
    private void m1614e() {
        if (this.f1271a) {
            this.f1279i.removeCallbacksAndMessages((Object) null);
            this.f1271a = false;
        }
    }

    public void setNeedCheckingShow(boolean z) {
        this.f1272b = z;
        if (!z && this.f1271a) {
            m1614e();
        } else if (z && !this.f1271a) {
            m1613d();
        }
    }

    public void setCallback(C0378a aVar) {
        this.f1273c = aVar;
    }

    public void setAdType(int i) {
        this.f1278h = i;
    }

    /* renamed from: a */
    public void mo5a(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                boolean c = C0996u.m4643c(C0558m.m2663a(), C0558m.m2663a().getPackageName());
                if (C0746x.m3803a(this.f1274d, 20, this.f1278h) || !c) {
                    this.f1279i.sendEmptyMessageDelayed(2, 1000);
                } else if (!this.f1277g) {
                    setNeedCheckingShow(true);
                }
            }
        } else if (!this.f1271a) {
        } else {
            if (C0746x.m3803a(this.f1274d, 20, this.f1278h)) {
                m1614e();
                this.f1279i.sendEmptyMessageDelayed(2, 1000);
                C0378a aVar = this.f1273c;
                if (aVar != null) {
                    aVar.mo1063a(this.f1274d);
                    return;
                }
                return;
            }
            this.f1279i.sendEmptyMessageDelayed(1, 1000);
        }
    }
}
