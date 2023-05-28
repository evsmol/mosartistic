package p150io.bidmachine.nativead;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Set;
import p150io.bidmachine.nativead.view.NativeMediaView;

/* renamed from: io.bidmachine.nativead.NativeContainer */
public interface NativeContainer {
    View getProviderView(Context context);

    boolean isViewRegistered();

    void registerView(ViewGroup viewGroup, View view, NativeMediaView nativeMediaView, Set<View> set);

    void unregisterView();
}
