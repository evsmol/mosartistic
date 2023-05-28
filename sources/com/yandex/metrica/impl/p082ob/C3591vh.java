package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C2028Fh;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.security.KeyStore;
import java.security.SecureRandom;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* renamed from: com.yandex.metrica.impl.ob.vh */
class C3591vh implements C2028Fh {

    /* renamed from: a */
    private final File f9350a;

    C3591vh(File file) {
        this.f9350a = file;
    }

    /* renamed from: a */
    public ServerSocket mo15789a(int i) throws IOException, C2028Fh.C2029a {
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            KeyManagerFactory instance2 = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            KeyStore instance3 = KeyStore.getInstance("PKCS12");
            instance3.load(new FileInputStream(this.f9350a), "`0l}%01ny{jl~;|&".toCharArray());
            instance2.init(instance3, "`0l}%01ny{jl~;|&".toCharArray());
            instance.init(instance2.getKeyManagers(), (TrustManager[]) null, (SecureRandom) null);
            return instance.getServerSocketFactory().createServerSocket(i);
        } catch (Exception e) {
            throw new C2028Fh.C2029a("https_open_error", e);
        }
    }
}
