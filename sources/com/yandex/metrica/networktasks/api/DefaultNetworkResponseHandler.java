package com.yandex.metrica.networktasks.api;

import com.yandex.metrica.networktasks.api.DefaultResponseParser;

public class DefaultNetworkResponseHandler implements NetworkResponseHandler {

    /* renamed from: a */
    private final DefaultResponseParser f9653a;

    public DefaultNetworkResponseHandler() {
        this(new DefaultResponseParser());
    }

    DefaultNetworkResponseHandler(DefaultResponseParser defaultResponseParser) {
        this.f9653a = defaultResponseParser;
    }

    public DefaultResponseParser.Response handle(ResponseDataHolder responseDataHolder) {
        if (200 == responseDataHolder.getResponseCode()) {
            return this.f9653a.parse(responseDataHolder.getResponseData());
        }
        return null;
    }
}
