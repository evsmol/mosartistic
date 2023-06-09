package com.bytedance.sdk.openadsdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;

public abstract class TTDislikeDialogAbstract extends Dialog {

    /* renamed from: a */
    private View f26696a;

    /* renamed from: b */
    private C0477n f26697b;

    public abstract int getLayoutId();

    public abstract ViewGroup.LayoutParams getLayoutParams();

    public abstract int[] getTTDislikeListViewIds();

    public TTDislikeDialogAbstract(Context context) {
        super(context);
    }

    public TTDislikeDialogAbstract(Context context, int i) {
        super(context, i);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(getContext()).inflate(getLayoutId(), (ViewGroup) null);
        this.f26696a = inflate;
        if (inflate != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            View view = this.f26696a;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            }
            setContentView(view, layoutParams);
            m31413a();
            return;
        }
        throw new IllegalArgumentException("getLayoutId,layout id may be abnormal, please check");
    }

    /* renamed from: a */
    private void m31413a() {
        if (this.f26697b != null && this.f26696a != null) {
            int[] tTDislikeListViewIds = getTTDislikeListViewIds();
            if (tTDislikeListViewIds == null || tTDislikeListViewIds.length <= 0) {
                throw new IllegalArgumentException("The options list of dislike is empty, please set TTDislikeListView");
            }
            int length = tTDislikeListViewIds.length;
            int i = 0;
            while (i < length) {
                View findViewById = this.f26696a.findViewById(tTDislikeListViewIds[i]);
                if (findViewById == null) {
                    throw new IllegalArgumentException("getTTDislikeListViewIds can not find view by Id,please check");
                } else if (findViewById instanceof TTDislikeListView) {
                    ((TTDislikeListView) findViewById).setMaterialMeta(this.f26697b);
                    i++;
                } else {
                    throw new IllegalArgumentException("getTTDislikeListViewIds can not find view by Id , please check");
                }
            }
        }
    }

    public void setMaterialMeta(C0477n nVar) {
        this.f26697b = nVar;
        m31413a();
    }
}
