package com.criteo.publisher;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.criteo.publisher.context.ContextData;
import com.criteo.publisher.logging.C1195g;
import com.criteo.publisher.logging.C1197h;
import com.criteo.publisher.model.AdSize;
import com.criteo.publisher.model.BannerAdUnit;
import com.criteo.publisher.p067i0.C1147a;
import com.criteo.publisher.p067i0.C1150c;
import com.criteo.publisher.p074n0.C1311o;

public class CriteoBannerView extends WebView {
    private static final int UNSET_DIMENSION_VALUE = -1;
    final BannerAdUnit bannerAdUnit;
    private final Criteo criteo;
    private CriteoBannerAdListener criteoBannerAdListener;
    private C1167l criteoBannerEventController;
    private final C1195g logger;

    /* JADX INFO: finally extract failed */
    public CriteoBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.logger = C1197h.m5407b(getClass());
        this.criteo = null;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1013R.styleable.CriteoBannerView, 0, 0);
        try {
            int integer = obtainStyledAttributes.getInteger(C1013R.styleable.CriteoBannerView_criteoAdUnitWidth, -1);
            int integer2 = obtainStyledAttributes.getInteger(C1013R.styleable.CriteoBannerView_criteoAdUnitHeight, -1);
            String string = obtainStyledAttributes.getString(C1013R.styleable.CriteoBannerView_criteoAdUnitId);
            if (string != null && integer != -1 && integer2 != -1) {
                this.bannerAdUnit = new BannerAdUnit(string, new AdSize(integer, integer2));
            } else if (string == null && integer == -1 && integer2 == -1) {
                this.bannerAdUnit = null;
            } else {
                this.bannerAdUnit = null;
                C1311o.m5779a((Throwable) new IllegalStateException("CriteoBannerView was not properly inflated. For InHouse integration, no attribute must be set. For Standalone integration, all of: criteoAdUnitId, criteoAdUnitWidth and criteoAdUnitHeight must be set."));
            }
            obtainStyledAttributes.recycle();
            this.logger.mo3337a(C1052b.m4925a(this.bannerAdUnit));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public CriteoBannerView(Context context) {
        this(context, (BannerAdUnit) null, (Criteo) null);
    }

    public CriteoBannerView(Context context, BannerAdUnit bannerAdUnit2) {
        this(context, bannerAdUnit2, (Criteo) null);
    }

    CriteoBannerView(Context context, BannerAdUnit bannerAdUnit2, Criteo criteo2) {
        super(context);
        C1195g b = C1197h.m5407b(getClass());
        this.logger = b;
        this.bannerAdUnit = bannerAdUnit2;
        this.criteo = criteo2;
        b.mo3337a(C1052b.m4925a(bannerAdUnit2));
    }

    public void setCriteoBannerAdListener(CriteoBannerAdListener criteoBannerAdListener2) {
        this.criteoBannerAdListener = criteoBannerAdListener2;
    }

    /* access modifiers changed from: package-private */
    public CriteoBannerAdListener getCriteoBannerAdListener() {
        return this.criteoBannerAdListener;
    }

    public void loadAd() {
        loadAd(new ContextData());
    }

    public void loadAd(ContextData contextData) {
        try {
            doLoadAd(contextData);
        } catch (Throwable th) {
            this.logger.mo3337a(C1328v.m5922b(th));
        }
    }

    public void loadAdWithDisplayData(String str) {
        getOrCreateController().mo3273a(C1319p.VALID);
        getOrCreateController().mo3274a(str);
    }

    private void doLoadAd(ContextData contextData) {
        this.logger.mo3337a(C1052b.m4927c(this));
        getIntegrationRegistry().mo3246a(C1147a.STANDALONE);
        getOrCreateController().mo3272a(this.bannerAdUnit, contextData);
    }

    public void loadAd(Bid bid) {
        try {
            doLoadAd(bid);
        } catch (Throwable th) {
            this.logger.mo3337a(C1328v.m5922b(th));
        }
    }

    private void doLoadAd(Bid bid) {
        this.logger.mo3337a(C1052b.m4924a(this, bid));
        getIntegrationRegistry().mo3246a(C1147a.IN_HOUSE);
        getOrCreateController().mo3271a(bid);
    }

    /* access modifiers changed from: package-private */
    public C1167l getOrCreateController() {
        if (this.criteoBannerEventController == null) {
            this.criteoBannerEventController = getCriteo().createBannerController(this);
        }
        return this.criteoBannerEventController;
    }

    private Criteo getCriteo() {
        Criteo criteo2 = this.criteo;
        return criteo2 == null ? Criteo.getInstance() : criteo2;
    }

    private C1150c getIntegrationRegistry() {
        return C1321s.m5824c().mo3668F0();
    }
}
