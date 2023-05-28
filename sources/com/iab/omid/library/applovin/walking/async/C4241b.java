package com.iab.omid.library.applovin.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.walking.async.b */
public abstract class C4241b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C4242a f10137a;

    /* renamed from: b */
    protected final C4243b f10138b;

    /* renamed from: com.iab.omid.library.applovin.walking.async.b$a */
    public interface C4242a {
        /* renamed from: a */
        void mo32655a(C4241b bVar);
    }

    /* renamed from: com.iab.omid.library.applovin.walking.async.b$b */
    public interface C4243b {
        /* renamed from: a */
        JSONObject mo32656a();

        /* renamed from: a */
        void mo32657a(JSONObject jSONObject);
    }

    public C4241b(C4243b bVar) {
        this.f10138b = bVar;
    }

    /* renamed from: a */
    public void mo32651a(C4242a aVar) {
        this.f10137a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C4242a aVar = this.f10137a;
        if (aVar != null) {
            aVar.mo32655a(this);
        }
    }

    /* renamed from: a */
    public void mo32653a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
