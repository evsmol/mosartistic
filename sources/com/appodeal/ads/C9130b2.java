package com.appodeal.ads;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.appodeal.ads.utils.Log;

/* renamed from: com.appodeal.ads.b2 */
public final class C9130b2 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9195g2 f22931a;

    public C9130b2(C9195g2 g2Var) {
        this.f22931a = g2Var;
    }

    public final void onClick(View view) {
        Uri uri = this.f22931a.f23099a.f23302q;
        if (uri == null) {
            Log.log(C9195g2.f23097x, "Video", "click url is absent");
            return;
        }
        Log.log(C9195g2.f23097x, "Video", "clicked");
        C9195g2 g2Var = this.f22931a;
        C9195g2.f23098y = g2Var;
        g2Var.f23117s = true;
        int i = 0;
        if (g2Var.mo59954c() && this.f22931a.f23105g.isPlaying()) {
            i = this.f22931a.f23105g.getCurrentPosition();
        }
        this.f22931a.mo59955d();
        Context context = this.f22931a.getContext();
        String path = uri.getPath();
        int i2 = VideoPlayerActivity.f22765d;
        Intent intent = new Intent(context, VideoPlayerActivity.class);
        intent.putExtra("com.appodeal.ads.fileUri", path);
        intent.putExtra("com.appodeal.ads.seekTo", i);
        this.f22931a.getContext().startActivity(intent);
    }
}
