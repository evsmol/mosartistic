package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.text.TextUtils;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.yandex.metrica.networktasks.api.ConfigProvider;
import com.yandex.metrica.networktasks.api.DefaultNetworkResponseHandler;
import com.yandex.metrica.networktasks.api.FullUrlFormer;
import com.yandex.metrica.networktasks.api.RequestBodyEncrypter;
import com.yandex.metrica.networktasks.api.RequestDataHolder;
import com.yandex.metrica.networktasks.api.ResponseDataHolder;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;
import com.yandex.metrica.networktasks.api.SendingDataTaskHelper;
import com.yandex.metrica.networktasks.api.UnderlyingNetworkTask;
import java.util.Collection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.yandex.metrica.impl.ob.cd */
public class C2865cd implements UnderlyingNetworkTask {

    /* renamed from: a */
    private final C3464s2 f7583a;

    /* renamed from: b */
    private final C3208mc f7584b;

    /* renamed from: c */
    private final C2796a8 f7585c;

    /* renamed from: d */
    private final C2922ed f7586d;

    /* renamed from: e */
    private final C2022Fc f7587e;

    /* renamed from: f */
    private final C2434Pg f7588f;

    /* renamed from: g */
    private final FullUrlFormer<C2995gd> f7589g;

    /* renamed from: h */
    private final ConfigProvider<C2995gd> f7590h;

    /* renamed from: i */
    private final RequestDataHolder f7591i;

    /* renamed from: j */
    private final ResponseDataHolder f7592j;

    /* renamed from: k */
    private final SendingDataTaskHelper f7593k;

    /* renamed from: l */
    private long f7594l;

    /* renamed from: m */
    private C2892dd f7595m;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C2865cd(Context context, C3464s2 s2Var, C2022Fc fc, C2434Pg pg, ConfigProvider<C2995gd> configProvider, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, FullUrlFormer<C2995gd> fullUrlFormer, RequestBodyEncrypter requestBodyEncrypter) {
        this(s2Var, fc, C2007F0.m7154g().mo15760w().mo17499a(), pg, new C2922ed(context), fullUrlFormer, requestDataHolder, responseDataHolder, configProvider, new SendingDataTaskHelper(requestBodyEncrypter, new C2466Ql(), requestDataHolder, responseDataHolder, new DefaultNetworkResponseHandler()));
        Context context2 = context;
    }

    /* renamed from: a */
    private boolean m9318a() {
        C2892dd a = this.f7586d.mo17548a(this.f7584b.f8310d);
        this.f7595m = a;
        C3351pf pfVar = a.f7641c;
        if (!(pfVar.f8566b.length == 0 && pfVar.f8565a.length == 0)) {
            return this.f7593k.prepareAndSetPostData(MessageNano.toByteArray(pfVar));
        }
        return false;
    }

    /* renamed from: b */
    private void m9319b() {
        long f = this.f7585c.mo17168f() + 1;
        this.f7594l = f;
        this.f7588f.mo16475a(f);
    }

    public String description() {
        return "LocationTask";
    }

    public FullUrlFormer<?> getFullUrlFormer() {
        return this.f7589g;
    }

    public RequestDataHolder getRequestDataHolder() {
        return this.f7591i;
    }

    public ResponseDataHolder getResponseDataHolder() {
        return this.f7592j;
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return ((C2995gd) this.f7590h.getConfig()).mo15715q();
    }

    public SSLSocketFactory getSslSocketFactory() {
        C2007F0.m7154g().mo15757t().getClass();
        return null;
    }

    public boolean onCreateTask() {
        C2995gd gdVar = (C2995gd) this.f7590h.getConfig();
        if (!this.f7583a.mo18198d() && !TextUtils.isEmpty(gdVar.mo15705g()) && !TextUtils.isEmpty(gdVar.mo15721w()) && !C1848A2.m6814b((Collection) this.f7589g.getAllHosts())) {
            return m9318a();
        }
        return false;
    }

    public void onPerformRequest() {
        this.f7593k.onPerformRequest();
    }

    public void onPostRequestComplete(boolean z) {
        if (z || C1848A2.m6813b(this.f7592j.getResponseCode())) {
            this.f7586d.mo17549a(this.f7595m);
        }
        this.f7585c.mo17165c(this.f7594l);
    }

    public boolean onRequestComplete() {
        return this.f7593k.isResponseValid();
    }

    public void onRequestError(Throwable th) {
        this.f7585c.mo17165c(this.f7594l);
    }

    public void onShouldNotExecute() {
    }

    public void onSuccessfulTaskFinished() {
        this.f7587e.mo15784a();
    }

    public void onTaskAdded() {
    }

    public void onTaskFinished() {
    }

    public void onTaskRemoved() {
    }

    public void onUnsuccessfulTaskFinished() {
    }

    C2865cd(C3464s2 s2Var, C2022Fc fc, C2796a8 a8Var, C2434Pg pg, C2922ed edVar, FullUrlFormer<C2995gd> fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider<C2995gd> configProvider, SendingDataTaskHelper sendingDataTaskHelper) {
        this.f7593k = sendingDataTaskHelper;
        this.f7583a = s2Var;
        this.f7587e = fc;
        this.f7590h = configProvider;
        C2995gd gdVar = (C2995gd) configProvider.getConfig();
        this.f7584b = gdVar.mo17634z();
        this.f7585c = a8Var;
        this.f7586d = edVar;
        this.f7588f = pg;
        this.f7591i = requestDataHolder;
        this.f7592j = responseDataHolder;
        this.f7589g = fullUrlFormer;
        m9319b();
        fullUrlFormer.setHosts(gdVar.mo17633A());
    }
}
