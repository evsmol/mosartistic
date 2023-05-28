package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;
import com.yandex.metrica.networktasks.api.ConfigProvider;
import com.yandex.metrica.networktasks.api.DefaultResponseParser;
import com.yandex.metrica.networktasks.api.FullUrlFormer;
import com.yandex.metrica.networktasks.api.NetworkResponseHandler;
import com.yandex.metrica.networktasks.api.RequestDataHolder;
import com.yandex.metrica.networktasks.api.ResponseDataHolder;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;
import com.yandex.metrica.networktasks.api.UnderlyingNetworkTask;
import java.util.Collection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.yandex.metrica.impl.ob.B4 */
public class C1881B4 implements UnderlyingNetworkTask {

    /* renamed from: a */
    private final ConfigProvider<C1943D4> f5078a;

    /* renamed from: b */
    private final C2851c0 f5079b;

    /* renamed from: c */
    private final C1976E4 f5080c;

    /* renamed from: d */
    private final TimeProvider f5081d = new SystemTimeProvider();

    /* renamed from: e */
    private final C2466Ql f5082e = new C2466Ql();

    /* renamed from: f */
    private final String f5083f;

    /* renamed from: g */
    private final C2827b8 f5084g;

    /* renamed from: h */
    private final FullUrlFormer<C1943D4> f5085h;

    /* renamed from: i */
    private final RequestDataHolder f5086i;

    /* renamed from: j */
    private final ResponseDataHolder f5087j;

    /* renamed from: k */
    private final NetworkResponseHandler<DefaultResponseParser.Response> f5088k;

    public C1881B4(ConfigProvider<C1943D4> configProvider, C2851c0 c0Var, C1976E4 e4, C2827b8 b8Var, NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, FullUrlFormer<C1943D4> fullUrlFormer) {
        this.f5078a = configProvider;
        this.f5079b = c0Var;
        this.f5080c = e4;
        this.f5084g = b8Var;
        this.f5086i = requestDataHolder;
        this.f5087j = responseDataHolder;
        this.f5088k = networkResponseHandler;
        this.f5085h = fullUrlFormer;
        this.f5083f = C1881B4.class.getName() + "@" + Integer.toHexString(hashCode());
    }

    public String description() {
        return this.f5083f;
    }

    public FullUrlFormer<?> getFullUrlFormer() {
        return this.f5085h;
    }

    public RequestDataHolder getRequestDataHolder() {
        return this.f5086i;
    }

    public ResponseDataHolder getResponseDataHolder() {
        return this.f5087j;
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return null;
    }

    public SSLSocketFactory getSslSocketFactory() {
        C2007F0.m7154g().mo15757t().getClass();
        return null;
    }

    public boolean onCreateTask() {
        C1943D4 d4 = (C1943D4) this.f5078a.getConfig();
        if (!(d4.mo15722x() && !C1848A2.m6814b((Collection) d4.mo15611C()))) {
            return false;
        }
        this.f5085h.setHosts(d4.mo15611C());
        byte[] a = new C1912C4(this.f5079b, d4, this.f5080c, new C2364O3(this.f5084g), new C2876cn(1024, "diagnostic event name"), new C2876cn(204800, "diagnostic event value"), new SystemTimeProvider()).mo15582a();
        byte[] bArr = null;
        try {
            bArr = this.f5082e.compress(a);
        } catch (Throwable unused) {
        }
        if (!C1848A2.m6811a(bArr)) {
            this.f5086i.setHeader("Content-Encoding", "gzip");
            a = bArr;
        }
        this.f5086i.setPostData(a);
        return true;
    }

    public void onPerformRequest() {
        this.f5086i.applySendTime(this.f5081d.currentTimeMillis());
    }

    public void onPostRequestComplete(boolean z) {
    }

    public boolean onRequestComplete() {
        DefaultResponseParser.Response response = (DefaultResponseParser.Response) this.f5088k.handle(this.f5087j);
        return response != null && "accepted".equals(response.mStatus);
    }

    public void onRequestError(Throwable th) {
    }

    public void onShouldNotExecute() {
    }

    public void onSuccessfulTaskFinished() {
    }

    public void onTaskAdded() {
    }

    public void onTaskFinished() {
    }

    public void onTaskRemoved() {
    }

    public void onUnsuccessfulTaskFinished() {
    }
}
