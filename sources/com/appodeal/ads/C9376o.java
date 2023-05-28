package com.appodeal.ads;

import com.appodeal.ads.C9258l;
import com.appodeal.ads.C9420r;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.utils.Log;
import org.json.JSONException;

/* renamed from: com.appodeal.ads.o */
public abstract class C9376o<AdRequestType extends C9420r, AdObjectType extends C9258l> implements Runnable {

    /* renamed from: a */
    public final AdRequestType f23795a;

    /* renamed from: b */
    public final AdObjectType f23796b;

    /* renamed from: c */
    public int f23797c;

    public C9376o(AdRequestType adrequesttype, AdObjectType adobjecttype, int i) {
        this.f23795a = adrequesttype;
        this.f23796b = adobjecttype;
        this.f23797c = i;
    }

    /* renamed from: a */
    public abstract void mo60577a();

    public final void run() {
        LoadingError loadingError;
        try {
            mo60577a();
            C9212h5.f23153a.post(new C9313n(this));
        } catch (Exception e) {
            Log.log(e);
            if (e instanceof JSONException) {
                loadingError = LoadingError.IncorrectAdunit;
            } else {
                loadingError = LoadingError.InternalError;
            }
            C9673v vVar = (C9673v) this;
            vVar.f24498f.f24286d.mo59838a(vVar.f24497e, vVar.f24496d, loadingError);
        }
    }
}
