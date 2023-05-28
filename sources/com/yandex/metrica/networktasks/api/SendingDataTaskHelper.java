package com.yandex.metrica.networktasks.api;

import com.yandex.metrica.networktasks.api.DefaultResponseParser;
import com.yandex.metrica.networktasks.impl.C3767h;
import java.io.IOException;

public class SendingDataTaskHelper {

    /* renamed from: a */
    private final RequestBodyEncrypter f9690a;

    /* renamed from: b */
    private final Compressor f9691b;

    /* renamed from: c */
    private final C3767h f9692c;

    /* renamed from: d */
    private final RequestDataHolder f9693d;

    /* renamed from: e */
    private final ResponseDataHolder f9694e;

    /* renamed from: f */
    private final NetworkResponseHandler f9695f;

    public SendingDataTaskHelper(RequestBodyEncrypter requestBodyEncrypter, Compressor compressor, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, NetworkResponseHandler networkResponseHandler) {
        this(requestBodyEncrypter, compressor, new C3767h(), requestDataHolder, responseDataHolder, networkResponseHandler);
    }

    public SendingDataTaskHelper(RequestBodyEncrypter requestBodyEncrypter, Compressor compressor, C3767h hVar, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, NetworkResponseHandler networkResponseHandler) {
        this.f9690a = requestBodyEncrypter;
        this.f9691b = compressor;
        this.f9692c = hVar;
        this.f9693d = requestDataHolder;
        this.f9694e = responseDataHolder;
        this.f9695f = networkResponseHandler;
    }

    public boolean isResponseValid() {
        DefaultResponseParser.Response response = (DefaultResponseParser.Response) this.f9695f.handle(this.f9694e);
        return response != null && "accepted".equals(response.mStatus);
    }

    public void onPerformRequest() {
        RequestDataHolder requestDataHolder = this.f9693d;
        this.f9692c.getClass();
        requestDataHolder.applySendTime(System.currentTimeMillis());
    }

    public boolean prepareAndSetPostData(byte[] bArr) {
        byte[] encrypt;
        try {
            byte[] compress = this.f9691b.compress(bArr);
            if (compress == null || (encrypt = this.f9690a.encrypt(compress)) == null) {
                return false;
            }
            this.f9693d.setPostData(encrypt);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
