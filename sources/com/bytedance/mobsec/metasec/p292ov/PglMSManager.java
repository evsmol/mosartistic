package com.bytedance.mobsec.metasec.p292ov;

import java.util.Map;
import p152ms.p153bd.p154o.Pgl.C5662l0;

/* renamed from: com.bytedance.mobsec.metasec.ov.PglMSManager */
public final class PglMSManager implements C5662l0.pgla {

    /* renamed from: a */
    private final C5662l0.pgla f25227a;

    PglMSManager(C5662l0.pgla pgla) {
        this.f25227a = pgla;
    }

    public Map<String, String> frameSign(String str, int i) {
        return this.f25227a.frameSign(str, i);
    }

    public Map<String, String> getFeatureHash(String str, byte[] bArr) {
        return this.f25227a.getFeatureHash(str, bArr);
    }

    public Map<String, String> getReportRaw(String str, int i, Map<String, String> map) {
        return this.f25227a.getReportRaw(str, i, map);
    }

    public String getToken() {
        return this.f25227a.getToken();
    }

    public void report(String str) {
        this.f25227a.report(str);
    }

    public void setBDDeviceID(String str) {
        this.f25227a.setBDDeviceID(str);
    }

    public void setCollectMode(int i) {
        this.f25227a.setCollectMode(i);
    }

    public void setDeviceID(String str) {
        this.f25227a.setDeviceID(str);
    }

    public void setInstallID(String str) {
        this.f25227a.setInstallID(str);
    }

    public void setSessionID(String str) {
        this.f25227a.setSessionID(str);
    }
}
