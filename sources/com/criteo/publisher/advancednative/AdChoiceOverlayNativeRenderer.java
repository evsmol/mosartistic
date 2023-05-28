package com.criteo.publisher.advancednative;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.criteo.publisher.C1321s;

class AdChoiceOverlayNativeRenderer implements CriteoNativeRenderer {
    private final C1026b adChoiceOverlay;
    private final CriteoNativeRenderer delegate;

    AdChoiceOverlayNativeRenderer(CriteoNativeRenderer criteoNativeRenderer) {
        this(criteoNativeRenderer, C1321s.m5824c().mo3693b0());
    }

    AdChoiceOverlayNativeRenderer(CriteoNativeRenderer criteoNativeRenderer, C1026b bVar) {
        this.delegate = criteoNativeRenderer;
        this.adChoiceOverlay = bVar;
    }

    public View createNativeView(Context context, ViewGroup viewGroup) {
        return this.adChoiceOverlay.mo3042a(this.delegate.createNativeView(context, viewGroup));
    }

    public void renderNativeView(RendererHelper rendererHelper, View view, CriteoNativeAd criteoNativeAd) {
        View c = this.adChoiceOverlay.mo3044c(view);
        if (c != null) {
            this.delegate.renderNativeView(rendererHelper, c, criteoNativeAd);
        }
    }
}
