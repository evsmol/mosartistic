package com.yandex.metrica.networktasks.api;

import com.yandex.metrica.networktasks.api.NetworkTask;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class RequestDataHolder {

    /* renamed from: a */
    private NetworkTask.Method f9681a = NetworkTask.Method.GET;

    /* renamed from: b */
    private final Map f9682b = new HashMap();

    /* renamed from: c */
    private byte[] f9683c = null;

    /* renamed from: d */
    private Long f9684d;

    /* renamed from: e */
    private Integer f9685e;

    public void applySendTime(long j) {
        this.f9684d = Long.valueOf(j);
        this.f9685e = Integer.valueOf(((GregorianCalendar) GregorianCalendar.getInstance()).getTimeZone().getOffset(TimeUnit.MILLISECONDS.toSeconds(j) * 1000) / 1000);
    }

    public Map getHeaders() {
        return this.f9682b;
    }

    public NetworkTask.Method getMethod() {
        return this.f9681a;
    }

    public byte[] getPostData() {
        return this.f9683c;
    }

    public Long getSendTimestamp() {
        return this.f9684d;
    }

    public Integer getSendTimezoneSec() {
        return this.f9685e;
    }

    public void setHeader(String str, String... strArr) {
        this.f9682b.put(str, Arrays.asList(strArr));
    }

    public void setPostData(byte[] bArr) {
        this.f9681a = NetworkTask.Method.POST;
        this.f9683c = bArr;
    }
}
