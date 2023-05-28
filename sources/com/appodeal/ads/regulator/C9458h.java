package com.appodeal.ads.regulator;

import android.content.Context;
import com.appodeal.consent.Consent;
import kotlin.coroutines.Continuation;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.regulator.h */
public interface C9458h {
    /* renamed from: a */
    Object mo60663a(Context context, String str, Continuation<? super Consent> continuation);

    /* renamed from: a */
    void mo60664a(JSONObject jSONObject);

    /* renamed from: a */
    boolean mo60665a();

    /* renamed from: a */
    boolean mo60666a(UserConsent userConsent);

    /* renamed from: a */
    boolean mo60667a(Consent consent);

    /* renamed from: a */
    boolean mo60668a(Boolean bool);

    /* renamed from: a */
    boolean mo60669a(String str);

    /* renamed from: b */
    boolean mo60670b();

    /* renamed from: c */
    Consent mo60671c();

    /* renamed from: d */
    Boolean mo60672d();

    /* renamed from: e */
    boolean mo60673e();

    /* renamed from: f */
    String mo60674f();

    /* renamed from: g */
    boolean mo60675g();

    String getUSPrivacyString();
}
