package com.yandex.metrica.networktasks.api;

import java.util.Map;

public class ResponseDataHolder {

    /* renamed from: a */
    private int f9686a;

    /* renamed from: b */
    private byte[] f9687b;

    /* renamed from: c */
    private Map f9688c;

    /* renamed from: d */
    private final ResponseValidityChecker f9689d;

    public ResponseDataHolder(ResponseValidityChecker responseValidityChecker) {
        this.f9689d = responseValidityChecker;
    }

    public int getResponseCode() {
        return this.f9686a;
    }

    public byte[] getResponseData() {
        return this.f9687b;
    }

    public Map getResponseHeaders() {
        return this.f9688c;
    }

    public boolean isValidResponse() {
        return this.f9689d.isResponseValid(this.f9686a);
    }

    public void setResponseCode(int i) {
        this.f9686a = i;
    }

    public void setResponseData(byte[] bArr) {
        this.f9687b = bArr;
    }

    public void setResponseHeaders(Map map) {
        this.f9688c = map;
    }
}
