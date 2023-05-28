package com.appnext.ads.fullscreen;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appnext.C8663R;
import com.appnext.ads.C8668a;
import com.appnext.base.p264b.C8850d;
import com.appnext.core.AppnextAd;
import com.appnext.core.C8917f;
import com.appnext.core.C8927k;
import java.util.ArrayList;

/* renamed from: com.appnext.ads.fullscreen.e */
public final class C8696e extends Fragment {
    /* access modifiers changed from: private */

    /* renamed from: bc */
    public C8722i f22102bc;
    /* access modifiers changed from: private */

    /* renamed from: bd */
    public TextView f22103bd;
    /* access modifiers changed from: private */

    /* renamed from: be */
    public int f22104be = 0;
    /* access modifiers changed from: private */

    /* renamed from: bf */
    public ArrayList<AppnextAd> f22105bf;
    /* access modifiers changed from: private */
    public Handler handler;
    Runnable tick = new Runnable() {
        public final void run() {
            C8696e.this.handler.removeCallbacks(this);
            if (C8696e.m26414c(C8696e.this) == 0) {
                C8696e.this.f22102bc.videoSelected((AppnextAd) C8696e.this.f22105bf.get(0));
                C8696e.this.report(C8668a.f21980E);
                return;
            }
            if (C8696e.this.f22103bd != null) {
                TextView e = C8696e.this.f22103bd;
                e.setText(C8696e.this.f22104be + " sec");
            }
            C8696e.this.handler.postDelayed(C8696e.this.tick, 1000);
        }
    };

    /* renamed from: c */
    static /* synthetic */ int m26414c(C8696e eVar) {
        int i = eVar.f22104be - 1;
        eVar.f22104be = i;
        return i;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null && getArguments().containsKey(C8850d.f22432fl)) {
            this.f22104be = getArguments().getInt(C8850d.f22432fl);
        }
        if (bundle != null) {
            this.f22104be = bundle.getInt(C8850d.f22432fl);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f22102bc = (C8722i) activity;
        this.handler = new Handler();
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f22102bc = (C8722i) context;
        this.handler = new Handler();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            RelativeLayout relativeLayout = (RelativeLayout) layoutInflater.inflate(this.f22102bc.getTemplate("S1"), viewGroup, false);
            View findViewById = relativeLayout.findViewById(C8663R.C8666id.item1);
            View findViewById2 = relativeLayout.findViewById(C8663R.C8666id.item2);
            ((TextView) relativeLayout.findViewById(C8663R.C8666id.title)).setText(this.f22102bc.getConfigManager().get("pre_title_string1"));
            ((TextView) relativeLayout.findViewById(C8663R.C8666id.secondTile)).setText(this.f22102bc.getConfigManager().get("pre_title_string2"));
            this.f22103bd = (TextView) relativeLayout.findViewById(C8663R.C8666id.timer);
            ArrayList<AppnextAd> preRollAds = this.f22102bc.getPreRollAds();
            this.f22105bf = preRollAds;
            if (preRollAds.size() < 2) {
                this.f22102bc.videoSelected(this.f22105bf.get(0));
                return null;
            }
            m26411a((ViewGroup) findViewById, this.f22105bf.get(0), 0);
            m26411a((ViewGroup) findViewById2, this.f22105bf.get(1), 1);
            relativeLayout.findViewById(C8663R.C8666id.privacy).setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C8696e.this.f22102bc.privacyClicked();
                }
            });
            if (C8927k.m26971a(this.f22105bf.get(0), this.f22102bc.getConfigManager())) {
                C8927k.m26970a((Context) this.f22102bc, (ImageView) relativeLayout.findViewById(C8663R.C8666id.privacy));
            }
            TextView textView = this.f22103bd;
            textView.setText(this.f22104be + " sec");
            report(C8668a.f21977B);
            return relativeLayout;
        } catch (Throwable unused) {
            this.f22102bc.closeClicked();
            return null;
        }
    }

    /* renamed from: a */
    private void m26411a(ViewGroup viewGroup, final AppnextAd appnextAd, final int i) {
        TextView textView = (TextView) viewGroup.findViewById(C8663R.C8666id.title);
        final ImageView imageView = (ImageView) viewGroup.findViewById(C8663R.C8666id.icon);
        final ImageView imageView2 = (ImageView) viewGroup.findViewById(C8663R.C8666id.background_image);
        RatingBar ratingBar = (RatingBar) viewGroup.findViewById(C8663R.C8666id.ratingBar);
        if (viewGroup.findViewById(C8663R.C8666id.playGameTextView) != null) {
            ((TextView) viewGroup.findViewById(C8663R.C8666id.playGameTextView)).setText(this.f22102bc.getConfigManager().get("pre_cta_string"));
        }
        textView.setText(appnextAd.getAdTitle());
        ratingBar.setRating(Float.parseFloat(appnextAd.getStoreRating()));
        viewGroup.findViewById(C8663R.C8666id.click).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                C8696e.this.f22102bc.videoSelected(appnextAd);
                int i = i;
                if (i == 0) {
                    C8696e.this.report(C8668a.f21978C);
                } else if (i == 1) {
                    C8696e.this.report(C8668a.f21979D);
                }
            }
        });
        if (imageView2 != null) {
            new Thread(new Runnable() {
                public final void run() {
                    final Bitmap Y = C8917f.m26913Y(appnextAd.getWideImageURL());
                    final Bitmap Y2 = C8917f.m26913Y(appnextAd.getImageURL());
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            imageView2.setImageBitmap(Y);
                            imageView.setImageBitmap(Y2);
                        }
                    });
                }
            }).start();
        }
        new Thread(new Runnable() {
            public final void run() {
                final Bitmap Y = imageView2 != null ? C8917f.m26913Y(appnextAd.getWideImageURL()) : null;
                final Bitmap Y2 = C8917f.m26913Y(appnextAd.getImageURL());
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public final void run() {
                        if (imageView2 != null) {
                            imageView2.setImageBitmap(Y);
                        }
                        imageView.setImageBitmap(Y2);
                    }
                });
            }
        }).start();
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.handler.removeCallbacksAndMessages((Object) null);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(C8850d.f22432fl, this.f22104be);
        super.onSaveInstanceState(bundle);
    }

    public final void onPause() {
        super.onPause();
        this.handler.removeCallbacks(this.tick);
    }

    public final void onResume() {
        super.onResume();
        this.handler.postDelayed(this.tick, 1000);
    }

    /* access modifiers changed from: private */
    public void report(String str) {
        this.f22102bc.report(str, "S1");
    }
}
