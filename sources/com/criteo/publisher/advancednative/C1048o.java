package com.criteo.publisher.advancednative;

import android.graphics.Rect;
import android.view.View;

/* renamed from: com.criteo.publisher.advancednative.o */
/* compiled from: VisibilityChecker */
public class C1048o {
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3063a(View view) {
        if (!view.isShown()) {
            return false;
        }
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            return false;
        }
        return view.getGlobalVisibleRect(new Rect());
    }
}
