package com.appnext.ads.fullscreen;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appnext.C8663R;
import com.appnext.ads.C8668a;
import com.appnext.core.AppnextAd;
import com.appnext.core.C8917f;
import com.appnext.core.C8927k;
import com.appnext.core.p267a.C8894b;
import java.util.ArrayList;

/* renamed from: com.appnext.ads.fullscreen.d */
public final class C8687d extends Fragment {
    /* access modifiers changed from: private */

    /* renamed from: aS */
    public ImageView f22085aS;

    /* renamed from: aT */
    private TextView f22086aT;
    /* access modifiers changed from: private */

    /* renamed from: aU */
    public C8721h f22087aU;
    /* access modifiers changed from: private */
    public ArrayList<AppnextAd> ads;
    /* access modifiers changed from: private */
    public boolean clicked = false;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f22087aU = (C8721h) activity;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f22087aU = (C8721h) context;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            RelativeLayout relativeLayout = (RelativeLayout) layoutInflater.inflate(this.f22087aU.getTemplate("S3"), viewGroup, false);
            this.ads = this.f22087aU.getPostRollAds();
            ImageView imageView = (ImageView) relativeLayout.findViewById(C8663R.C8666id.privacy);
            ImageView imageView2 = (ImageView) relativeLayout.findViewById(C8663R.C8666id.close);
            View findViewById = relativeLayout.findViewById(C8663R.C8666id.click);
            this.f22085aS = (ImageView) relativeLayout.findViewById(C8663R.C8666id.media);
            this.f22086aT = (TextView) relativeLayout.findViewById(C8663R.C8666id.install);
            imageView.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C8687d.this.f22087aU.privacyClicked();
                }
            });
            if (C8927k.m26971a(this.ads.get(0), this.f22087aU.getConfigManager())) {
                C8927k.m26970a((Context) this.f22087aU, imageView);
            }
            imageView2.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C8687d.this.f22087aU.closeClicked();
                }
            });
            findViewById.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C8687d.this.f22087aU.installClicked((AppnextAd) C8687d.this.ads.get(0));
                }
            });
            String ctaText = this.f22087aU.getCtaText();
            int parseInt = Integer.parseInt(C8894b.m26842bp().mo58969b(this.f22087aU.getLanguage(), C8894b.f22527hW, "len"));
            if (!TextUtils.isEmpty(ctaText) && ctaText.length() > parseInt) {
                ctaText = ctaText.substring(0, parseInt);
            }
            this.f22086aT.setText(ctaText);
            this.f22086aT.setTextSize(2, (float) Integer.parseInt(C8894b.m26842bp().mo58969b(this.f22087aU.getLanguage(), C8894b.f22527hW, "font_size_sp")));
            new Thread(new Runnable() {
                public final void run() {
                    final Bitmap Y = C8917f.m26913Y(((AppnextAd) C8687d.this.ads.get(0)).getWideImageURL());
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            C8687d.this.f22085aS.setImageBitmap(Y);
                        }
                    });
                }
            }).start();
            m26405a(relativeLayout, this.ads.get(0), true);
            View findViewById2 = relativeLayout.findViewById(C8663R.C8666id.extra);
            if (findViewById2 != null) {
                if (this.ads.size() > 1) {
                    m26405a((RelativeLayout) findViewById2.findViewById(C8663R.C8666id.item1), this.ads.get(1), false);
                } else {
                    findViewById2.findViewById(C8663R.C8666id.item1).setVisibility(4);
                }
                if (this.ads.size() > 2) {
                    m26405a((RelativeLayout) findViewById2.findViewById(C8663R.C8666id.item2), this.ads.get(2), false);
                } else {
                    findViewById2.findViewById(C8663R.C8666id.item2).setVisibility(4);
                }
                if (findViewById2.findViewById(C8663R.C8666id.item3) != null) {
                    if (this.ads.size() > 3) {
                        m26405a((RelativeLayout) findViewById2.findViewById(C8663R.C8666id.item3), this.ads.get(3), false);
                    } else {
                        findViewById2.findViewById(C8663R.C8666id.item3).setVisibility(4);
                    }
                }
            }
            report(C8668a.f21993R);
            return relativeLayout;
        } catch (Throwable unused) {
            this.f22087aU.closeClicked();
            return null;
        }
    }

    /* renamed from: a */
    private void m26405a(final RelativeLayout relativeLayout, final AppnextAd appnextAd, final boolean z) {
        new Thread(new Runnable() {
            public final void run() {
                final Bitmap Y = C8917f.m26913Y(appnextAd.getImageURL());
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public final void run() {
                        ((ImageView) relativeLayout.findViewById(C8663R.C8666id.icon)).setImageBitmap(Y);
                    }
                });
            }
        }).start();
        ((TextView) relativeLayout.findViewById(C8663R.C8666id.title)).setText(appnextAd.getAdTitle());
        ((RatingBar) relativeLayout.findViewById(C8663R.C8666id.rating)).setRating(Float.parseFloat(appnextAd.getStoreRating()));
        relativeLayout.findViewById(C8663R.C8666id.click).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                FullscreenAd fullscreenAd = new FullscreenAd(appnextAd);
                if (z) {
                    C8687d.this.report(C8668a.f21995T);
                } else {
                    C8687d.this.report(C8668a.f21996U);
                    StringBuilder sb = new StringBuilder();
                    sb.append(fullscreenAd.getAppURL());
                    sb.append("&tem_id=");
                    sb.append(C8687d.this.f22087aU.isRewarded() ? "8" : "7");
                    sb.append("05");
                    fullscreenAd.setAppURL(sb.toString());
                }
                C8687d.this.f22087aU.installClicked(fullscreenAd);
                boolean unused = C8687d.this.clicked = true;
            }
        });
    }

    public final void onDestroyView() {
        report(C8668a.f21994S);
        super.onDestroyView();
    }

    /* access modifiers changed from: private */
    public void report(String str) {
        this.f22087aU.report(str, "S3");
    }
}
