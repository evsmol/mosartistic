package com.yandex.metrica.network;

import com.yandex.metrica.network.impl.C3752c;
import com.yandex.metrica.network.impl.C3753d;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

public class NetworkClient {

    /* renamed from: a */
    private final Integer f9619a;

    /* renamed from: b */
    private final Integer f9620b;

    /* renamed from: c */
    private final SSLSocketFactory f9621c;

    /* renamed from: d */
    private final Boolean f9622d;

    /* renamed from: e */
    private final Boolean f9623e;

    /* renamed from: f */
    private final int f9624f;

    public class Builder {

        /* renamed from: a */
        private Integer f9625a;

        /* renamed from: b */
        private Integer f9626b;

        /* renamed from: c */
        private SSLSocketFactory f9627c;

        /* renamed from: d */
        private Boolean f9628d;

        /* renamed from: e */
        private Boolean f9629e;

        /* renamed from: f */
        private Integer f9630f;

        public NetworkClient build() {
            return new NetworkClient(this.f9625a, this.f9626b, this.f9627c, this.f9628d, this.f9629e, this.f9630f);
        }

        public Builder withConnectTimeout(int i) {
            this.f9625a = Integer.valueOf(i);
            return this;
        }

        public Builder withInstanceFollowRedirects(boolean z) {
            this.f9629e = Boolean.valueOf(z);
            return this;
        }

        public Builder withMaxResponseSize(int i) {
            this.f9630f = Integer.valueOf(i);
            return this;
        }

        public Builder withReadTimeout(int i) {
            this.f9626b = Integer.valueOf(i);
            return this;
        }

        public Builder withSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.f9627c = sSLSocketFactory;
            return this;
        }

        public Builder withUseCaches(boolean z) {
            this.f9628d = Boolean.valueOf(z);
            return this;
        }
    }

    private NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3) {
        this.f9619a = num;
        this.f9620b = num2;
        this.f9621c = sSLSocketFactory;
        this.f9622d = bool;
        this.f9623e = bool2;
        this.f9624f = num3 == null ? Integer.MAX_VALUE : num3.intValue();
    }

    public Integer getConnectTimeout() {
        return this.f9619a;
    }

    public Boolean getInstanceFollowRedirects() {
        return this.f9623e;
    }

    public int getMaxResponseSize() {
        return this.f9624f;
    }

    public Integer getReadTimeout() {
        return this.f9620b;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f9621c;
    }

    public Boolean getUseCaches() {
        return this.f9622d;
    }

    public Call newCall(Request request) {
        Intrinsics.checkNotNullParameter(this, "client");
        Intrinsics.checkNotNullParameter(request, "request");
        return new C3752c(this, request, new C3753d());
    }

    public String toString() {
        return "NetworkClient{connectTimeout=" + this.f9619a + ", readTimeout=" + this.f9620b + ", sslSocketFactory=" + this.f9621c + ", useCaches=" + this.f9622d + ", instanceFollowRedirects=" + this.f9623e + ", maxResponseSize=" + this.f9624f + '}';
    }
}
