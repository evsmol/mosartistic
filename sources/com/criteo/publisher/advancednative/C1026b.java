package com.criteo.publisher.advancednative;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.criteo.publisher.p074n0.C1296c;
import com.criteo.publisher.p074n0.C1300g;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.criteo.publisher.advancednative.b */
/* compiled from: AdChoiceOverlay */
public class C1026b {

    /* renamed from: a */
    private final Map<View, WeakReference<ImageView>> f3407a = new WeakHashMap();

    /* renamed from: b */
    private final C1300g f3408b;

    /* renamed from: c */
    private final C1296c f3409c;

    public C1026b(C1300g gVar, C1296c cVar) {
        this.f3408b = gVar;
        this.f3409c = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ViewGroup mo3042a(View view) {
        Context context = view.getContext();
        ImageView imageView = new ImageView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            frameLayout.setLayoutParams(layoutParams);
        }
        frameLayout.addView(view);
        frameLayout.addView(imageView);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams2.gravity = 5;
        layoutParams2.width = this.f3409c.mo3620a(this.f3408b.mo3630b());
        layoutParams2.height = this.f3409c.mo3620a(this.f3408b.mo3629a());
        imageView.setMinimumWidth(layoutParams2.width);
        imageView.setMinimumHeight(layoutParams2.height);
        if (Build.VERSION.SDK_INT >= 21) {
            imageView.setElevation(1000.0f);
            imageView.setOutlineProvider((ViewOutlineProvider) null);
        }
        this.f3407a.put(frameLayout, new WeakReference(imageView));
        return frameLayout;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ImageView mo3043b(View view) {
        WeakReference weakReference = this.f3407a.get(view);
        if (weakReference == null) {
            return null;
        }
        return (ImageView) weakReference.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public View mo3044c(View view) {
        if (mo3043b(view) == null) {
            return null;
        }
        return ((ViewGroup) view).getChildAt(0);
    }
}
