package com.iab.omid.library.applovin.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.applovin.adsession.C4197a;
import com.iab.omid.library.applovin.internal.C4207c;
import com.iab.omid.library.applovin.utils.C4226c;
import com.iab.omid.library.applovin.walking.async.C4241b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.walking.async.f */
public class C4247f extends C4240a {
    public C4247f(C4241b.C4243b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m11949b(String str) {
        C4207c c = C4207c.m11754c();
        if (c != null) {
            for (C4197a next : c.mo32546b()) {
                if (this.f10134c.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo32613b(str, this.f10136e);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C4226c.m11872h(this.f10135d, this.f10138b.mo32656a())) {
            return null;
        }
        this.f10138b.mo32657a(this.f10135d);
        return this.f10135d.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m11949b(str);
        }
        super.onPostExecute(str);
    }
}
