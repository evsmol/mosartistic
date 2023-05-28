package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.networktasks.api.ConfigProvider;
import com.yandex.metrica.networktasks.api.FullUrlFormer;
import com.yandex.metrica.networktasks.api.NetworkResponseHandler;
import com.yandex.metrica.networktasks.api.RequestDataHolder;
import com.yandex.metrica.networktasks.api.ResponseDataHolder;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;
import com.yandex.metrica.networktasks.api.UnderlyingNetworkTask;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.yandex.metrica.impl.ob.q2 */
public class C3384q2 implements UnderlyingNetworkTask {

    /* renamed from: a */
    private final C3450ri f8710a;

    /* renamed from: b */
    private C2638Ui f8711b;

    /* renamed from: c */
    private C3004gi f8712c;

    /* renamed from: d */
    private final RequestDataHolder f8713d;

    /* renamed from: e */
    private final ConfigProvider<C2312Mg> f8714e;

    /* renamed from: f */
    private final ResponseDataHolder f8715f;

    /* renamed from: g */
    private final FullUrlFormer<C2312Mg> f8716g;

    /* renamed from: h */
    private final NetworkResponseHandler<C2638Ui> f8717h;

    public C3384q2(C3450ri riVar, FullUrlFormer<C2312Mg> fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider<C2312Mg> configProvider) {
        this(riVar, new C3335p2(), fullUrlFormer, requestDataHolder, responseDataHolder, configProvider);
    }

    public String description() {
        return "Startup task for component: " + this.f8710a.mo18167a().toString();
    }

    public FullUrlFormer<?> getFullUrlFormer() {
        return this.f8716g;
    }

    public RequestDataHolder getRequestDataHolder() {
        return this.f8713d;
    }

    public ResponseDataHolder getResponseDataHolder() {
        return this.f8715f;
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return ((C2312Mg) this.f8714e.getConfig()).mo15715q();
    }

    public SSLSocketFactory getSslSocketFactory() {
        C2007F0.m7154g().mo15757t().getClass();
        return null;
    }

    public boolean onCreateTask() {
        this.f8713d.setHeader("Accept-Encoding", "encrypted");
        return this.f8710a.mo18176e();
    }

    public void onPerformRequest() {
    }

    public void onPostRequestComplete(boolean z) {
        if (!z) {
            this.f8712c = C3004gi.PARSE;
        }
    }

    public boolean onRequestComplete() {
        C2638Ui ui = (C2638Ui) this.f8717h.handle(this.f8715f);
        this.f8711b = ui;
        return ui != null;
    }

    public void onRequestError(Throwable th) {
        this.f8712c = C3004gi.NETWORK;
    }

    public void onShouldNotExecute() {
        this.f8712c = C3004gi.NETWORK;
    }

    public void onSuccessfulTaskFinished() {
        if (this.f8711b != null && this.f8715f.getResponseHeaders() != null) {
            this.f8710a.mo18170a(this.f8711b, (C2312Mg) this.f8714e.getConfig(), (Map<String, List<String>>) this.f8715f.getResponseHeaders());
        }
    }

    public void onTaskAdded() {
    }

    public void onTaskFinished() {
    }

    public void onTaskRemoved() {
    }

    public void onUnsuccessfulTaskFinished() {
        if (this.f8712c == null) {
            this.f8712c = C3004gi.UNKNOWN;
        }
        this.f8710a.mo18171a(this.f8712c);
    }

    C3384q2(C3450ri riVar, C3335p2 p2Var, FullUrlFormer<C2312Mg> fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider<C2312Mg> configProvider) {
        this.f8710a = riVar;
        this.f8717h = p2Var;
        this.f8713d = requestDataHolder;
        this.f8715f = responseDataHolder;
        this.f8714e = configProvider;
        this.f8716g = fullUrlFormer;
        fullUrlFormer.setHosts(((C2312Mg) configProvider.getConfig()).mo16307I());
    }
}
