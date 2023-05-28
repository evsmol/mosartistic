package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C2638Ui;
import com.yandex.metrica.networktasks.api.NetworkResponseHandler;
import com.yandex.metrica.networktasks.api.ResponseDataHolder;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.p2 */
public class C3335p2 implements NetworkResponseHandler<C2638Ui> {

    /* renamed from: a */
    private final C2569Ti f8546a;

    /* renamed from: b */
    private final C3576v9 f8547b;

    public C3335p2() {
        this(new C2569Ti(), new C3576v9());
    }

    public Object handle(ResponseDataHolder responseDataHolder) {
        if (200 != responseDataHolder.getResponseCode()) {
            return null;
        }
        byte[] responseData = responseDataHolder.getResponseData();
        Map responseHeaders = responseDataHolder.getResponseHeaders();
        List list = responseHeaders != null ? (List) responseHeaders.get("Content-Encoding") : null;
        if (!C1848A2.m6814b((Collection) list) && "encrypted".equals(list.get(0))) {
            responseData = this.f8547b.mo18325a(responseDataHolder.getResponseData(), "hBnBQbZrmjPXEWVJ");
        }
        if (responseData == null) {
            return null;
        }
        C2638Ui a = this.f8546a.mo16718a(responseData);
        if (C2638Ui.C2639a.OK == a.mo16850A()) {
            return a;
        }
        return null;
    }

    C3335p2(C2569Ti ti, C3576v9 v9Var) {
        this.f8546a = ti;
        this.f8547b = v9Var;
    }
}
