package com.applovin.exoplayer2.p220k;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* renamed from: com.applovin.exoplayer2.k.ab */
public final class C7655ab extends C7664e {

    /* renamed from: a */
    private final int f18017a;

    /* renamed from: b */
    private final byte[] f18018b;

    /* renamed from: c */
    private final DatagramPacket f18019c;

    /* renamed from: d */
    private Uri f18020d;

    /* renamed from: e */
    private DatagramSocket f18021e;

    /* renamed from: f */
    private MulticastSocket f18022f;

    /* renamed from: g */
    private InetAddress f18023g;

    /* renamed from: h */
    private InetSocketAddress f18024h;

    /* renamed from: i */
    private boolean f18025i;

    /* renamed from: j */
    private int f18026j;

    /* renamed from: com.applovin.exoplayer2.k.ab$a */
    public static final class C7656a extends C7672j {
        public C7656a(Throwable th, int i) {
            super(th, i);
        }
    }

    public C7655ab() {
        this(2000);
    }

    public C7655ab(int i) {
        this(i, 8000);
    }

    public C7655ab(int i, int i2) {
        super(true);
        this.f18017a = i2;
        this.f18018b = new byte[i];
        this.f18019c = new DatagramPacket(this.f18018b, 0, i);
    }

    /* renamed from: a */
    public int mo53898a(byte[] bArr, int i, int i2) throws C7656a {
        if (i2 == 0) {
            return 0;
        }
        if (this.f18026j == 0) {
            try {
                this.f18021e.receive(this.f18019c);
                int length = this.f18019c.getLength();
                this.f18026j = length;
                mo54897a(length);
            } catch (SocketTimeoutException e) {
                throw new C7656a(e, 2002);
            } catch (IOException e2) {
                throw new C7656a(e2, 2001);
            }
        }
        int length2 = this.f18019c.getLength();
        int i3 = this.f18026j;
        int min = Math.min(i3, i2);
        System.arraycopy(this.f18018b, length2 - i3, bArr, i, min);
        this.f18026j -= min;
        return min;
    }

    /* renamed from: a */
    public long mo54522a(C7674l lVar) throws C7656a {
        DatagramSocket datagramSocket;
        Uri uri = lVar.f18057a;
        this.f18020d = uri;
        String host = uri.getHost();
        int port = this.f18020d.getPort();
        mo54898b(lVar);
        try {
            this.f18023g = InetAddress.getByName(host);
            this.f18024h = new InetSocketAddress(this.f18023g, port);
            if (this.f18023g.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f18024h);
                this.f18022f = multicastSocket;
                multicastSocket.joinGroup(this.f18023g);
                datagramSocket = this.f18022f;
            } else {
                datagramSocket = new DatagramSocket(this.f18024h);
            }
            this.f18021e = datagramSocket;
            this.f18021e.setSoTimeout(this.f18017a);
            this.f18025i = true;
            mo54899c(lVar);
            return -1;
        } catch (SecurityException e) {
            throw new C7656a(e, 2006);
        } catch (IOException e2) {
            throw new C7656a(e2, 2001);
        }
    }

    /* renamed from: a */
    public Uri mo54523a() {
        return this.f18020d;
    }

    /* renamed from: c */
    public void mo54526c() {
        this.f18020d = null;
        MulticastSocket multicastSocket = this.f18022f;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f18023g);
            } catch (IOException unused) {
            }
            this.f18022f = null;
        }
        DatagramSocket datagramSocket = this.f18021e;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f18021e = null;
        }
        this.f18023g = null;
        this.f18024h = null;
        this.f18026j = 0;
        if (this.f18025i) {
            this.f18025i = false;
            mo54900d();
        }
    }
}
