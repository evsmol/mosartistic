package com.iab.omid.library.ironsrc.walking.p115a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.walking.a.b */
public abstract class C4344b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C4345a f10364a;

    /* renamed from: d */
    protected final C4346b f10365d;

    /* renamed from: com.iab.omid.library.ironsrc.walking.a.b$a */
    public interface C4345a {
        /* renamed from: a */
        void mo33035a(C4344b bVar);
    }

    /* renamed from: com.iab.omid.library.ironsrc.walking.a.b$b */
    public interface C4346b {
        /* renamed from: a */
        void mo33036a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo33037b();
    }

    public C4344b(C4346b bVar) {
        this.f10365d = bVar;
    }

    /* renamed from: a */
    public void mo33031a(C4345a aVar) {
        this.f10364a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C4345a aVar = this.f10364a;
        if (aVar != null) {
            aVar.mo33035a(this);
        }
    }

    /* renamed from: a */
    public void mo33033a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
