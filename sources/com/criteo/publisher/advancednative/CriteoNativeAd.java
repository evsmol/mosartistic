package com.criteo.publisher.advancednative;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.criteo.publisher.model.p073b0.C1243n;

public class CriteoNativeAd {
    private final C1026b adChoiceOverlay;
    private final C1243n assets;
    private final C1030e clickDetection;
    private final C1047n clickOnAdChoiceHandler;
    private final C1047n clickOnProductHandler;
    private final C1043j impressionTask;
    private CriteoNativeRenderer renderer;
    private final RendererHelper rendererHelper;
    private final C1050q visibilityTracker;

    public CriteoNativeAd(C1243n nVar, C1050q qVar, C1043j jVar, C1030e eVar, C1047n nVar2, C1047n nVar3, C1026b bVar, CriteoNativeRenderer criteoNativeRenderer, RendererHelper rendererHelper2) {
        this.assets = nVar;
        this.visibilityTracker = qVar;
        this.impressionTask = jVar;
        this.clickDetection = eVar;
        this.clickOnProductHandler = nVar2;
        this.clickOnAdChoiceHandler = nVar3;
        this.adChoiceOverlay = bVar;
        this.renderer = criteoNativeRenderer;
        this.rendererHelper = rendererHelper2;
    }

    public String getTitle() {
        return this.assets.mo3491n().mo3462g();
    }

    public String getDescription() {
        return this.assets.mo3491n().mo3458c();
    }

    public String getPrice() {
        return this.assets.mo3491n().mo3461f();
    }

    public String getCallToAction() {
        return this.assets.mo3491n().mo3456a();
    }

    public CriteoMedia getProductMedia() {
        return CriteoMedia.create(this.assets.mo3491n().mo3493e());
    }

    public String getAdvertiserDomain() {
        return this.assets.mo3484d();
    }

    public String getAdvertiserDescription() {
        return this.assets.mo3483c();
    }

    public CriteoMedia getAdvertiserLogoMedia() {
        return CriteoMedia.create(this.assets.mo3486f());
    }

    public String getLegalText() {
        return this.assets.mo3488k();
    }

    public View createNativeRenderedView(Context context, ViewGroup viewGroup) {
        View createNativeView = this.renderer.createNativeView(context, viewGroup);
        renderNativeView(createNativeView);
        return createNativeView;
    }

    public void renderNativeView(View view) {
        this.renderer.renderNativeView(this.rendererHelper, view, this);
        watchForImpression(view);
        setProductClickableView(view);
        ImageView b = this.adChoiceOverlay.mo3043b(view);
        if (b != null) {
            setAdChoiceClickableView(b);
            this.rendererHelper.setMediaInView(this.assets.mo3490m(), b, (Drawable) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void setRenderer(CriteoNativeRenderer criteoNativeRenderer) {
        this.renderer = criteoNativeRenderer;
    }

    /* access modifiers changed from: package-private */
    public void watchForImpression(View view) {
        this.visibilityTracker.mo3064a(view, this.impressionTask);
    }

    /* access modifiers changed from: package-private */
    public void setProductClickableView(View view) {
        this.clickDetection.mo3048a(view, this.clickOnProductHandler);
    }

    /* access modifiers changed from: package-private */
    public void setAdChoiceClickableView(View view) {
        this.clickDetection.mo3048a(view, this.clickOnAdChoiceHandler);
    }

    /* access modifiers changed from: package-private */
    public ImageView getAdChoiceView(View view) {
        return this.adChoiceOverlay.mo3043b(view);
    }
}
