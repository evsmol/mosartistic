package com.appodeal.ads;

import com.appodeal.ads.C9258l;
import com.appodeal.ads.context.C9148b;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.utils.Log;
import org.json.JSONException;

/* renamed from: com.appodeal.ads.n */
public final class C9313n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9376o f23545a;

    /* renamed from: com.appodeal.ads.n$a */
    public class C9314a implements C9258l.C9259a {
        public C9314a() {
        }

        /* renamed from: a */
        public final void mo60322a(LoadingError loadingError) {
            C9673v vVar = (C9673v) C9313n.this.f23545a;
            vVar.f24498f.f24286d.mo59838a(vVar.f24497e, vVar.f24496d, loadingError);
        }
    }

    public C9313n(C9376o oVar) {
        this.f23545a = oVar;
    }

    public final void run() {
        LoadingError loadingError;
        try {
            C9376o oVar = this.f23545a;
            oVar.f23796b.mo60096a(C9148b.f22956b, oVar.f23795a, oVar.f23797c, new C9314a());
        } catch (Throwable th) {
            C9376o oVar2 = this.f23545a;
            oVar2.getClass();
            Log.log(th);
            if (th instanceof JSONException) {
                loadingError = LoadingError.IncorrectAdunit;
            } else {
                loadingError = LoadingError.InternalError;
            }
            C9673v vVar = (C9673v) oVar2;
            vVar.f24498f.f24286d.mo59838a(vVar.f24497e, vVar.f24496d, loadingError);
        }
    }
}
