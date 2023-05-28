package p150io.bidmachine.nativead;

import android.graphics.Bitmap;
import android.net.Uri;
import com.explorestack.iab.vast.VastRequest;

/* renamed from: io.bidmachine.nativead.NativeMediaPrivateData */
public interface NativeMediaPrivateData extends NativeMediaPublicData {
    VastRequest getVastRequest();

    void setIconBitmap(Bitmap bitmap);

    void setIconUri(Uri uri);

    void setImageBitmap(Bitmap bitmap);

    void setImageUri(Uri uri);

    void setVastRequest(VastRequest vastRequest);

    void setVideoUri(Uri uri);
}
