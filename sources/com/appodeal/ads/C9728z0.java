package com.appodeal.ads;

import android.text.Editable;
import android.text.TextWatcher;
import com.appodeal.ads.utils.C9626h;

/* renamed from: com.appodeal.ads.z0 */
public final class C9728z0 implements TextWatcher {

    /* renamed from: a */
    public final /* synthetic */ C9626h f24652a;

    public C9728z0(C9626h hVar) {
        this.f24652a = hVar;
    }

    public final void afterTextChanged(Editable editable) {
        this.f24652a.f24400c.filter(editable.toString());
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
