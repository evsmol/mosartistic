package p150io.bidmachine.nativead;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* renamed from: io.bidmachine.nativead.NativeMediaPublicData */
public interface NativeMediaPublicData {
    Drawable getIconDrawable();

    Uri getIconUri();

    Drawable getImageDrawable();

    Uri getImageUri();

    Uri getVideoUri();
}
