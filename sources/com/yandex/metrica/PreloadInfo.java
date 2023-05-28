package com.yandex.metrica;

import com.yandex.metrica.impl.p082ob.C1848A2;
import java.util.HashMap;
import java.util.Map;

public class PreloadInfo {

    /* renamed from: a */
    private String f26737a;

    /* renamed from: b */
    private Map<String, String> f26738b;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f26739a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Map<String, String> f26740b;

        public PreloadInfo build() {
            return new PreloadInfo(this);
        }

        public Builder setAdditionalParams(String str, String str2) {
            if (!(str == null || str2 == null)) {
                this.f26740b.put(str, str2);
            }
            return this;
        }

        private Builder(String str) {
            this.f26739a = str;
            this.f26740b = new HashMap();
        }
    }

    public static Builder newBuilder(String str) {
        return new Builder(str);
    }

    public Map<String, String> getAdditionalParams() {
        return this.f26738b;
    }

    public String getTrackingId() {
        return this.f26737a;
    }

    private PreloadInfo(Builder builder) {
        this.f26737a = builder.f26739a;
        this.f26738b = C1848A2.m6818d(builder.f26740b);
    }
}
