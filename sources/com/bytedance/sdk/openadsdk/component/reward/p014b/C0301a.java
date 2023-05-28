package com.bytedance.sdk.openadsdk.component.reward.p014b;

import android.app.Activity;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.p013a.C0269c;
import com.bytedance.sdk.openadsdk.component.reward.view.C0368d;
import com.bytedance.sdk.openadsdk.core.p016b.C0411e;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.b.a */
/* compiled from: RewardFullAdType */
public abstract class C0301a {

    /* renamed from: a */
    protected Activity f996a;

    /* renamed from: b */
    protected C0477n f997b;

    /* renamed from: c */
    protected int f998c;

    /* renamed from: d */
    protected int f999d;

    /* renamed from: e */
    protected int f1000e;

    /* renamed from: f */
    protected float f1001f;

    /* renamed from: g */
    protected String f1002g;

    /* renamed from: h */
    protected C0411e f1003h;

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.b.a$a */
    /* compiled from: RewardFullAdType */
    public interface C0302a {
        /* renamed from: a */
        void mo851a(boolean z);
    }

    /* renamed from: a */
    public C0302a mo842a() {
        return null;
    }

    /* renamed from: a */
    public abstract void mo845a(FrameLayout frameLayout);

    /* renamed from: a */
    public abstract void mo846a(C0269c cVar, C0368d dVar);

    /* renamed from: b */
    public abstract boolean mo849b();

    /* renamed from: c */
    public abstract boolean mo850c();

    public C0301a(Activity activity, C0477n nVar, int i, int i2) {
        this.f996a = activity;
        this.f997b = nVar;
        this.f998c = i;
        this.f999d = i2;
    }

    /* renamed from: a */
    public final void mo844a(int i) {
        this.f1000e = i;
    }

    /* renamed from: a */
    public final void mo843a(float f) {
        this.f1001f = f;
    }

    /* renamed from: a */
    public final void mo848a(String str) {
        this.f1002g = str;
    }

    /* renamed from: a */
    public final void mo847a(C0411e eVar) {
        this.f1003h = eVar;
    }
}
