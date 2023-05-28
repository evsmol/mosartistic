package com.iab.omid.library.adcolony.walking.p097a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.walking.a.b */
public abstract class C4137b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C4138a f9895a;

    /* renamed from: d */
    protected final C4139b f9896d;

    /* renamed from: com.iab.omid.library.adcolony.walking.a.b$a */
    public interface C4138a {
        /* renamed from: a */
        void mo32244a(C4137b bVar);
    }

    /* renamed from: com.iab.omid.library.adcolony.walking.a.b$b */
    public interface C4139b {
        /* renamed from: a */
        void mo32245a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo32246b();
    }

    public C4137b(C4139b bVar) {
        this.f9896d = bVar;
    }

    /* renamed from: a */
    public void mo32240a(C4138a aVar) {
        this.f9895a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C4138a aVar = this.f9895a;
        if (aVar != null) {
            aVar.mo32244a(this);
        }
    }

    /* renamed from: a */
    public void mo32242a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
