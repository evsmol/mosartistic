package p150io.bidmachine;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* renamed from: io.bidmachine.ImageData */
public interface ImageData {
    Drawable getImage();

    Uri getLocalUri();

    String getRemoteUrl();
}
