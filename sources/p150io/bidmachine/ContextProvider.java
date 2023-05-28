package p150io.bidmachine;

import android.app.Activity;
import android.content.Context;

/* renamed from: io.bidmachine.ContextProvider */
public interface ContextProvider {
    Activity getActivity();

    Context getApplicationContext();

    Context getContext();
}
