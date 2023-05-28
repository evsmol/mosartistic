package com.iab.omid.library.appodeal.walking.p109a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.appodeal.walking.a.b */
public abstract class C4294b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C4295a f10250a;

    /* renamed from: d */
    protected final C4296b f10251d;

    /* renamed from: com.iab.omid.library.appodeal.walking.a.b$a */
    public interface C4295a {
        /* renamed from: a */
        void mo32849a(C4294b bVar);
    }

    /* renamed from: com.iab.omid.library.appodeal.walking.a.b$b */
    public interface C4296b {
        /* renamed from: a */
        void mo32850a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo32851b();
    }

    public C4294b(C4296b bVar) {
        this.f10251d = bVar;
    }

    /* renamed from: a */
    public void mo32845a(C4295a aVar) {
        this.f10250a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C4295a aVar = this.f10250a;
        if (aVar != null) {
            aVar.mo32849a(this);
        }
    }

    /* renamed from: a */
    public void mo32847a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
