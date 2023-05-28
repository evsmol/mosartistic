package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.p144g.C4936d;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.model.i */
public final class C4654i {

    /* renamed from: a */
    public ArrayList<C4655j> f11625a = new ArrayList<>();

    /* renamed from: b */
    public C4655j f11626b;

    /* renamed from: c */
    public C4936d f11627c;

    /* renamed from: d */
    public JSONObject f11628d;

    public C4654i(C4936d dVar) {
        this.f11627c = dVar;
    }

    /* renamed from: a */
    public final C4655j mo34031a() {
        Iterator<C4655j> it = this.f11625a.iterator();
        while (it.hasNext()) {
            C4655j next = it.next();
            if (next.f11631c) {
                return next;
            }
        }
        return this.f11626b;
    }

    /* renamed from: a */
    public final C4655j mo34032a(String str) {
        Iterator<C4655j> it = this.f11625a.iterator();
        while (it.hasNext()) {
            C4655j next = it.next();
            if (next.f11630b.equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final String mo34033b() {
        JSONObject jSONObject = this.f11628d;
        return (jSONObject == null || TextUtils.isEmpty(jSONObject.optString("adapterName"))) ? IronSourceConstants.SUPERSONIC_CONFIG_NAME : this.f11628d.optString("adapterName");
    }
}
