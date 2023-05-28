package com.iab.omid.library.amazon.walking.p103a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.walking.a.b */
public abstract class C4187b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C4188a f10012a;

    /* renamed from: d */
    protected final C4189b f10013d;

    /* renamed from: com.iab.omid.library.amazon.walking.a.b$a */
    public interface C4188a {
        /* renamed from: a */
        void mo32443a(C4187b bVar);
    }

    /* renamed from: com.iab.omid.library.amazon.walking.a.b$b */
    public interface C4189b {
        /* renamed from: a */
        void mo32444a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo32445b();
    }

    public C4187b(C4189b bVar) {
        this.f10013d = bVar;
    }

    /* renamed from: a */
    public void mo32439a(C4188a aVar) {
        this.f10012a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C4188a aVar = this.f10012a;
        if (aVar != null) {
            aVar.mo32443a(this);
        }
    }

    /* renamed from: a */
    public void mo32441a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
