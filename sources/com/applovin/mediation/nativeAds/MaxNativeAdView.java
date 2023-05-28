package com.applovin.mediation.nativeAds;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.applovin.impl.mediation.ads.C8105a;
import com.applovin.impl.mediation.ads.C8107b;
import com.applovin.impl.mediation.p234a.C8073d;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.C8656R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class MaxNativeAdView extends FrameLayout {
    public static final String MEDIUM_TEMPLATE_1 = "medium_template_1";

    /* renamed from: a */
    private final View f21862a;

    /* renamed from: b */
    private final TextView f21863b;

    /* renamed from: c */
    private final TextView f21864c;

    /* renamed from: d */
    private final TextView f21865d;

    /* renamed from: e */
    private final ImageView f21866e;

    /* renamed from: f */
    private final FrameLayout f21867f;

    /* renamed from: g */
    private final ViewGroup f21868g;

    /* renamed from: h */
    private final FrameLayout f21869h;

    /* renamed from: i */
    private final ViewGroup f21870i;

    /* renamed from: j */
    private final FrameLayout f21871j;

    /* renamed from: k */
    private final Button f21872k;

    /* renamed from: l */
    private C8107b f21873l;

    public MaxNativeAdView(MaxNativeAd maxNativeAd, Activity activity) {
        this(maxNativeAd, (String) null, activity);
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        super(context);
        View inflate;
        boolean z = maxNativeAdViewBinder.templateType != null;
        MaxAdFormat format = maxNativeAd != null ? maxNativeAd.getFormat() : MaxAdFormat.NATIVE;
        if (maxNativeAdViewBinder.mainView != null) {
            inflate = maxNativeAdViewBinder.mainView;
        } else {
            inflate = LayoutInflater.from(context).inflate(z ? m26322a(maxNativeAdViewBinder.templateType, format) : maxNativeAdViewBinder.layoutResourceId, this, false);
        }
        this.f21862a = inflate;
        addView(this.f21862a);
        this.f21863b = (TextView) findViewById(maxNativeAdViewBinder.titleTextViewId);
        this.f21864c = (TextView) findViewById(maxNativeAdViewBinder.advertiserTextViewId);
        this.f21865d = (TextView) findViewById(maxNativeAdViewBinder.bodyTextViewId);
        this.f21866e = (ImageView) findViewById(maxNativeAdViewBinder.iconImageViewId);
        this.f21867f = (FrameLayout) findViewById(maxNativeAdViewBinder.iconContentViewId);
        this.f21868g = (ViewGroup) findViewById(maxNativeAdViewBinder.optionsContentViewGroupId);
        this.f21869h = (FrameLayout) findViewById(maxNativeAdViewBinder.optionsContentFrameLayoutId);
        this.f21870i = (ViewGroup) findViewById(maxNativeAdViewBinder.mediaContentViewGroupId);
        this.f21871j = (FrameLayout) findViewById(maxNativeAdViewBinder.mediaContentFrameLayoutId);
        this.f21872k = (Button) findViewById(maxNativeAdViewBinder.callToActionButtonId);
        if (maxNativeAd != null) {
            m26324a(maxNativeAd);
        }
    }

    @Deprecated
    public MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Activity activity) {
        this(maxNativeAd, str, activity.getApplicationContext());
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Context context) {
        this(maxNativeAd, new MaxNativeAdViewBinder.Builder(-1).setTemplateType(str).setTitleTextViewId(C8656R.C8660id.applovin_native_title_text_view).setAdvertiserTextViewId(C8656R.C8660id.applovin_native_advertiser_text_view).setBodyTextViewId(C8656R.C8660id.applovin_native_body_text_view).setIconImageViewId(C8656R.C8660id.applovin_native_icon_image_view).setIconContentViewId(C8656R.C8660id.applovin_native_icon_view).setOptionsContentViewGroupId(C8656R.C8660id.applovin_native_options_view).setOptionsContentFrameLayoutId(C8656R.C8660id.applovin_native_options_view).setMediaContentViewGroupId(C8656R.C8660id.applovin_native_media_content_view).setMediaContentFrameLayoutId(C8656R.C8660id.applovin_native_media_content_view).setCallToActionButtonId(C8656R.C8660id.applovin_native_cta_button).build(), context);
    }

    public MaxNativeAdView(MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this((MaxNativeAd) null, maxNativeAdViewBinder, context);
    }

    public MaxNativeAdView(String str, Context context) {
        this((MaxNativeAd) null, str, context);
    }

    /* renamed from: a */
    private int m26322a(String str, MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.NATIVE) {
            if ("small_template_1".equalsIgnoreCase(str)) {
                return C8656R.layout.max_native_ad_small_template_1;
            }
            if (MEDIUM_TEMPLATE_1.equalsIgnoreCase(str)) {
                return C8656R.layout.max_native_ad_medium_template_1;
            }
            throw new IllegalArgumentException("Attempting to render MAX native ad with invalid format: " + str);
        } else if (maxAdFormat == MaxAdFormat.BANNER) {
            return "vertical_banner_template".equals(str) ? C8656R.layout.max_native_ad_vertical_banner_view : ("media_banner_template".equals(str) || "no_body_banner_template".equals(str)) ? C8656R.layout.max_native_ad_media_banner_view : "vertical_media_banner_template".equals(str) ? C8656R.layout.max_native_ad_vertical_media_banner_view : C8656R.layout.max_native_ad_banner_view;
        } else {
            if (maxAdFormat == MaxAdFormat.LEADER) {
                return "vertical_leader_template".equals(str) ? C8656R.layout.max_native_ad_vertical_leader_view : C8656R.layout.max_native_ad_leader_view;
            }
            if (maxAdFormat == MaxAdFormat.MREC) {
                return C8656R.layout.max_native_ad_mrec_view;
            }
            throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
        }
    }

    /* renamed from: a */
    private void m26323a() {
        final ViewGroup viewGroup = (ViewGroup) findViewById(C8656R.C8660id.applovin_native_inner_parent_layout);
        if (viewGroup != null) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                final WeakReference weakReference = new WeakReference(viewTreeObserver);
                viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                    public boolean onPreDraw() {
                        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                            C8490n nVar = AppLovinSdk.getInstance(MaxNativeAdView.this.getContext()).coreSdk;
                            nVar.mo57320D();
                            if (C8626v.m26252a()) {
                                nVar.mo57320D().mo57821d("MaxNativeAdView", "Failed to remove onPreDrawListener since the view tree observer is not alive.");
                            }
                        } else {
                            viewTreeObserver.removeOnPreDrawListener(this);
                        }
                        weakReference.clear();
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewGroup.getLayoutParams();
                        layoutParams.height = ((View) viewGroup.getParent()).getWidth();
                        viewGroup.setLayoutParams(layoutParams);
                        return true;
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private void m26324a(MaxNativeAd maxNativeAd) {
        this.f21863b.setText(maxNativeAd.getTitle());
        if (this.f21864c != null) {
            if (StringUtils.isValidString(maxNativeAd.getAdvertiser())) {
                this.f21864c.setText(maxNativeAd.getAdvertiser());
            } else {
                this.f21864c.setVisibility(8);
            }
        }
        if (this.f21865d != null) {
            if (StringUtils.isValidString(maxNativeAd.getBody())) {
                this.f21865d.setText(maxNativeAd.getBody());
            } else {
                this.f21865d.setVisibility(4);
            }
        }
        if (this.f21872k != null) {
            if (StringUtils.isValidString(maxNativeAd.getCallToAction())) {
                this.f21872k.setText(maxNativeAd.getCallToAction());
            } else {
                this.f21872k.setVisibility(4);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        View iconView = maxNativeAd.getIconView();
        if (this.f21867f != null) {
            if (icon == null || this.f21866e == null) {
                if (iconView != null) {
                    iconView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    this.f21867f.removeAllViews();
                    this.f21867f.addView(iconView);
                }
            } else if (icon.getDrawable() != null) {
                this.f21866e.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() != null && StringUtils.isValidString(icon.getUri().toString())) {
                this.f21866e.setImageURI(icon.getUri());
            }
            this.f21867f.setVisibility(8);
        }
        View optionsView = maxNativeAd.getOptionsView();
        if (this.f21869h == null || optionsView == null) {
            FrameLayout frameLayout = this.f21869h;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        } else {
            optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f21869h.addView(optionsView);
            this.f21869h.bringToFront();
        }
        View mediaView = maxNativeAd.getMediaView();
        if (this.f21871j != null) {
            if (mediaView != null) {
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f21871j.addView(mediaView);
            } else if (maxNativeAd.getFormat() == MaxAdFormat.LEADER) {
                this.f21871j.setVisibility(8);
            }
        }
        m26323a();
        postDelayed(new Runnable() {
            public void run() {
                MaxNativeAdView.this.setSelected(true);
            }
        }, 2000);
    }

    public C8107b getAdViewTracker() {
        return this.f21873l;
    }

    public TextView getAdvertiserTextView() {
        return this.f21864c;
    }

    public TextView getBodyTextView() {
        return this.f21865d;
    }

    public Button getCallToActionButton() {
        return this.f21872k;
    }

    public List<View> getClickableViews() {
        ArrayList arrayList = new ArrayList(5);
        TextView textView = this.f21863b;
        if (textView != null) {
            arrayList.add(textView);
        }
        TextView textView2 = this.f21864c;
        if (textView2 != null) {
            arrayList.add(textView2);
        }
        TextView textView3 = this.f21865d;
        if (textView3 != null) {
            arrayList.add(textView3);
        }
        ImageView imageView = this.f21866e;
        if (imageView != null) {
            arrayList.add(imageView);
        }
        Button button = this.f21872k;
        if (button != null) {
            arrayList.add(button);
        }
        return arrayList;
    }

    @Deprecated
    public FrameLayout getIconContentView() {
        return this.f21867f;
    }

    public ImageView getIconImageView() {
        return this.f21866e;
    }

    public View getMainView() {
        return this.f21862a;
    }

    @Deprecated
    public FrameLayout getMediaContentView() {
        return this.f21871j;
    }

    public ViewGroup getMediaContentViewGroup() {
        ViewGroup viewGroup = this.f21870i;
        return viewGroup != null ? viewGroup : this.f21871j;
    }

    @Deprecated
    public FrameLayout getOptionsContentView() {
        return this.f21869h;
    }

    public ViewGroup getOptionsContentViewGroup() {
        ViewGroup viewGroup = this.f21868g;
        return viewGroup != null ? viewGroup : this.f21869h;
    }

    public TextView getTitleTextView() {
        return this.f21863b;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C8107b bVar = this.f21873l;
        if (bVar != null) {
            bVar.mo56259b();
        }
        if (!isHardwareAccelerated()) {
            C8626v.m26257h("MaxNativeAdView", "Attached to non-hardware accelerated window: some native ad views require hardware accelerated Activities to render properly.");
        }
    }

    public void recycle() {
        setOnClickListener((View.OnClickListener) null);
        C8107b bVar = this.f21873l;
        if (bVar != null) {
            bVar.mo56258a();
            this.f21873l = null;
        }
        View view = this.f21862a;
        if (view != null && view.getParent() != this) {
            ViewGroup viewGroup = (ViewGroup) this.f21862a.getParent();
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                removeView(viewGroup);
            }
            addView(this.f21862a);
        }
    }

    public void render(C8073d dVar, C8105a.C8106a aVar, C8490n nVar) {
        recycle();
        if (!dVar.mo56135F().get() || !dVar.mo56134E().get()) {
            this.f21873l = new C8107b(dVar, this, aVar, nVar);
        }
        final MaxNativeAd nativeAd = dVar.getNativeAd();
        if (dVar.mo56131B() && nativeAd.isContainerClickable()) {
            nVar.mo57320D();
            if (C8626v.m26252a()) {
                nVar.mo57320D().mo57818b("MaxNativeAdView", "Enabling container click");
            }
            setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    nativeAd.performClick();
                }
            });
        }
        boolean isValidString = StringUtils.isValidString(dVar.mo56130A());
        nVar.mo57320D();
        if (isValidString) {
            if (C8626v.m26252a()) {
                nVar.mo57320D().mo57818b("MaxNativeAdView", "Rendering template ad view");
            }
            m26324a(nativeAd);
            return;
        }
        if (C8626v.m26252a()) {
            nVar.mo57320D().mo57818b("MaxNativeAdView", "Rendering custom ad view");
        }
        renderCustomNativeAdView(nativeAd);
    }

    public void renderCustomNativeAdView(MaxNativeAd maxNativeAd) {
        if (this.f21863b != null) {
            if (StringUtils.isValidString(maxNativeAd.getTitle())) {
                this.f21863b.setText(maxNativeAd.getTitle());
            } else {
                this.f21863b.setText((CharSequence) null);
            }
        }
        String body = maxNativeAd.getBody();
        if (this.f21865d != null) {
            if (StringUtils.isValidString(body)) {
                this.f21865d.setText(body);
            } else {
                this.f21865d.setText((CharSequence) null);
            }
        }
        String advertiser = maxNativeAd.getAdvertiser();
        if (this.f21864c != null) {
            if (StringUtils.isValidString(advertiser)) {
                this.f21864c.setText(advertiser);
            } else {
                this.f21864c.setText((CharSequence) null);
            }
        }
        String callToAction = maxNativeAd.getCallToAction();
        if (this.f21872k != null) {
            if (StringUtils.isValidString(callToAction)) {
                this.f21872k.setText(callToAction);
            } else {
                this.f21872k.setText((CharSequence) null);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        ImageView imageView = this.f21866e;
        if (imageView != null) {
            if (icon == null) {
                imageView.setImageDrawable((Drawable) null);
            } else if (icon.getDrawable() != null) {
                this.f21866e.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() != null) {
                this.f21866e.setImageURI(icon.getUri());
            } else {
                this.f21866e.setImageDrawable((Drawable) null);
            }
        }
        View mediaView = maxNativeAd.getMediaView();
        ViewGroup viewGroup = this.f21870i;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            if (mediaView != null) {
                ViewParent parent = mediaView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeAllViews();
                }
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f21870i.addView(mediaView);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        ViewGroup viewGroup2 = this.f21868g;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            if (optionsView != null) {
                ViewParent parent2 = optionsView.getParent();
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeAllViews();
                }
                optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f21868g.addView(optionsView);
                this.f21868g.bringToFront();
            }
        }
    }
}
