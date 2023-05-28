package com.appodeal.ads;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import com.appodeal.ads.utils.Log;
import com.explorestack.iab.utils.Assets;
import com.explorestack.iab.vast.view.CircleCountdownView;

public class VideoPlayerActivity extends Activity implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {

    /* renamed from: d */
    public static final /* synthetic */ int f22765d = 0;

    /* renamed from: a */
    public int f22766a;

    /* renamed from: b */
    public VideoView f22767b;

    /* renamed from: c */
    public C8997a f22768c;

    /* renamed from: com.appodeal.ads.VideoPlayerActivity$a */
    public interface C8997a {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m27114b() {
        try {
            getWindow().clearFlags(128);
        } catch (Exception e) {
            Log.log(e);
        }
    }

    /* renamed from: a */
    public final void mo59366a() {
        C9212h5.f23153a.post(new Runnable() {
            public final void run() {
                VideoPlayerActivity.this.m27114b();
            }
        });
        finish();
    }

    public final void onBackPressed() {
        if (this.f22768c != null) {
            ((C9195g2) this.f22768c).mo59952a(this.f22767b.isPlaying() ? this.f22767b.getCurrentPosition() : 0, false);
        }
        mo59366a();
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        C8997a aVar = this.f22768c;
        if (aVar != null) {
            ((C9195g2) aVar).mo59952a(0, true);
        }
        mo59366a();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("com.appodeal.ads.fileUri");
        int intExtra = intent.getIntExtra("com.appodeal.ads.seekTo", 0);
        this.f22766a = intExtra;
        Log.log("VideoPlayerActivity", "Start", String.format("position: %s", new Object[]{Integer.valueOf(intExtra)}));
        if (stringExtra != null) {
            this.f22768c = C9195g2.f23098y;
            RelativeLayout relativeLayout = new RelativeLayout(this);
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.f22767b = new VideoView(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.f22767b.setLayoutParams(layoutParams);
            this.f22767b.setOnCompletionListener(this);
            this.f22767b.setOnPreparedListener(this);
            this.f22767b.setVideoPath(stringExtra);
            relativeLayout.addView(this.f22767b);
            CircleCountdownView circleCountdownView = new CircleCountdownView(this);
            circleCountdownView.setColors(Assets.mainAssetsColor, Assets.backgroundColor);
            int a = C9182f1.m27267a(this, 24.0f);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a, a);
            layoutParams2.addRule(11, -1);
            layoutParams2.addRule(10, -1);
            int a2 = C9182f1.m27267a(this, 8.0f);
            layoutParams2.setMargins(a2, a2, a2, a2);
            circleCountdownView.setImage(Assets.getBitmapFromBase64("iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAYAAADnRuK4AAACY0lEQVR4Ae3aAWRbURTH4YNiKIqggKEYCiiKYQQABQAMARRBAVAADEEBUAAEAADBAMMwBADFADAURXYQoZdoOLie+338PQK4fnmJ5wUAAAAAAAAAAAAAAAAAAAAAAHACrnJ3uWVunpvFuM5zX3Pf99fz4KiL3HNu1+w195A7i3Gc5R5zb81ZvO0/b86CWe6ljafZZpBv4GXu9wdn8UtE761zuxP2sxrRBOLZnngWjznSbXs4g0Z0Sjztz9lFEPe5XT2iIeJp9y2IVW5Xj2iMeJotguYOVIlogHiazYO4ye3qEQ0VT/MfiPUAEZXjafYjDpjl/k41og7x/Ml9inf4MsWIOsSzzV0G40QkHhGJR0Ti6U9E4hGRePoTkXhEJJ7+RCQeEYmnPxGJR0TiqROReOpEJJ46EYmnTkTiqROReMpEJJ4CEYmnQETiKRGReEpEJJ4kIvH0JyLxiEg8/YlIPCIST38iEo+IxEP9ZbA+L6UhHhGJR0T9iUdE4hFRf+IRkXhE1It4RNQQz7bysFFE4rksPLEWkXj2RFQgHhGViUdEZeIRUZl4RFQmHhGViUdEZeIRkXjqRCQeEXUnHhGJR0T9iUdE4hFRf+IRkXhEJJ5uRCQeEYlHROM47x/PpCLa5M7igKf+8Uwuoodc4rp/PJOM6DU3i2DRP57JRjSPYNU/nslGtIxgOXA81YjuIpgPHk8loqtcYjNqPIWInuOAz7l/o8VTiOgldxENER2/Ez0N9vR1llsfOYt1bhZHMc8tc6vcIncd47rJ3edW++ttAAAAAAAAAAAAAAAAAAAAAAAAfOA/5Zwc/aYfb7AAAAAASUVORK5CYII="));
            circleCountdownView.setLayoutParams(layoutParams2);
            circleCountdownView.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    VideoPlayerActivity.this.m27113a(view);
                }
            });
            relativeLayout.addView(circleCountdownView);
            setContentView(relativeLayout);
        }
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        mo59366a();
        return false;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        VideoView videoView = this.f22767b;
        if (videoView != null && videoView.canSeekForward()) {
            this.f22767b.seekTo(this.f22766a);
            this.f22767b.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m27113a(View view) {
        if (this.f22768c != null) {
            ((C9195g2) this.f22768c).mo59952a(this.f22767b.isPlaying() ? this.f22767b.getCurrentPosition() : 0, false);
        }
        mo59366a();
    }
}
