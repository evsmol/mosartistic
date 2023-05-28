package com.appodeal.ads.utils;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.appodeal.ads.utils.t */
public final class C9652t extends SSLSocketFactory {

    /* renamed from: a */
    public final SSLSocketFactory f24451a;

    /* renamed from: com.appodeal.ads.utils.t$a */
    public static class C9653a extends SSLSocket {

        /* renamed from: a */
        public final SSLSocket f24452a;

        public C9653a(SSLSocket sSLSocket) {
            this.f24452a = sSLSocket;
        }

        public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
            this.f24452a.addHandshakeCompletedListener(handshakeCompletedListener);
        }

        public final void bind(SocketAddress socketAddress) {
            this.f24452a.bind(socketAddress);
        }

        public final synchronized void close() {
            this.f24452a.close();
        }

        public final void connect(SocketAddress socketAddress) {
            this.f24452a.connect(socketAddress);
        }

        public final void connect(SocketAddress socketAddress, int i) {
            this.f24452a.connect(socketAddress, i);
        }

        public final boolean equals(Object obj) {
            return this.f24452a.equals(obj);
        }

        public final SocketChannel getChannel() {
            return this.f24452a.getChannel();
        }

        public final boolean getEnableSessionCreation() {
            return this.f24452a.getEnableSessionCreation();
        }

        public final String[] getEnabledCipherSuites() {
            return this.f24452a.getEnabledCipherSuites();
        }

        public final String[] getEnabledProtocols() {
            return this.f24452a.getEnabledProtocols();
        }

        public final InetAddress getInetAddress() {
            return this.f24452a.getInetAddress();
        }

        public final InputStream getInputStream() {
            return this.f24452a.getInputStream();
        }

        public final boolean getKeepAlive() {
            return this.f24452a.getKeepAlive();
        }

        public final InetAddress getLocalAddress() {
            return this.f24452a.getLocalAddress();
        }

        public final int getLocalPort() {
            return this.f24452a.getLocalPort();
        }

        public final SocketAddress getLocalSocketAddress() {
            return this.f24452a.getLocalSocketAddress();
        }

        public final boolean getNeedClientAuth() {
            return this.f24452a.getNeedClientAuth();
        }

        public final boolean getOOBInline() {
            return this.f24452a.getOOBInline();
        }

        public final OutputStream getOutputStream() {
            return this.f24452a.getOutputStream();
        }

        public final int getPort() {
            return this.f24452a.getPort();
        }

        public final synchronized int getReceiveBufferSize() {
            return this.f24452a.getReceiveBufferSize();
        }

        public final SocketAddress getRemoteSocketAddress() {
            return this.f24452a.getRemoteSocketAddress();
        }

        public final boolean getReuseAddress() {
            return this.f24452a.getReuseAddress();
        }

        public final synchronized int getSendBufferSize() {
            return this.f24452a.getSendBufferSize();
        }

        public final SSLSession getSession() {
            return this.f24452a.getSession();
        }

        public final int getSoLinger() {
            return this.f24452a.getSoLinger();
        }

        public final synchronized int getSoTimeout() {
            return this.f24452a.getSoTimeout();
        }

        public final String[] getSupportedCipherSuites() {
            return this.f24452a.getSupportedCipherSuites();
        }

        public final String[] getSupportedProtocols() {
            return this.f24452a.getSupportedProtocols();
        }

        public final boolean getTcpNoDelay() {
            return this.f24452a.getTcpNoDelay();
        }

        public final int getTrafficClass() {
            return this.f24452a.getTrafficClass();
        }

        public final boolean getUseClientMode() {
            return this.f24452a.getUseClientMode();
        }

        public final boolean getWantClientAuth() {
            return this.f24452a.getWantClientAuth();
        }

        public final boolean isBound() {
            return this.f24452a.isBound();
        }

        public final boolean isClosed() {
            return this.f24452a.isClosed();
        }

        public final boolean isConnected() {
            return this.f24452a.isConnected();
        }

        public final boolean isInputShutdown() {
            return this.f24452a.isInputShutdown();
        }

        public final boolean isOutputShutdown() {
            return this.f24452a.isOutputShutdown();
        }

        public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
            this.f24452a.removeHandshakeCompletedListener(handshakeCompletedListener);
        }

        public final void sendUrgentData(int i) {
            this.f24452a.sendUrgentData(i);
        }

        public final void setEnableSessionCreation(boolean z) {
            this.f24452a.setEnableSessionCreation(z);
        }

        public final void setEnabledCipherSuites(String[] strArr) {
            this.f24452a.setEnabledCipherSuites(strArr);
        }

        public final void setKeepAlive(boolean z) {
            this.f24452a.setKeepAlive(z);
        }

        public final void setNeedClientAuth(boolean z) {
            this.f24452a.setNeedClientAuth(z);
        }

        public final void setOOBInline(boolean z) {
            this.f24452a.setOOBInline(z);
        }

        public final void setPerformancePreferences(int i, int i2, int i3) {
            this.f24452a.setPerformancePreferences(i, i2, i3);
        }

        public final synchronized void setReceiveBufferSize(int i) {
            this.f24452a.setReceiveBufferSize(i);
        }

        public final void setReuseAddress(boolean z) {
            this.f24452a.setReuseAddress(z);
        }

        public final synchronized void setSendBufferSize(int i) {
            this.f24452a.setSendBufferSize(i);
        }

        public final void setSoLinger(boolean z, int i) {
            this.f24452a.setSoLinger(z, i);
        }

        public final synchronized void setSoTimeout(int i) {
            this.f24452a.setSoTimeout(i);
        }

        public final void setTcpNoDelay(boolean z) {
            this.f24452a.setTcpNoDelay(z);
        }

        public final void setTrafficClass(int i) {
            this.f24452a.setTrafficClass(i);
        }

        public final void setUseClientMode(boolean z) {
            this.f24452a.setUseClientMode(z);
        }

        public final void setWantClientAuth(boolean z) {
            this.f24452a.setWantClientAuth(z);
        }

        public final void shutdownInput() {
            this.f24452a.shutdownInput();
        }

        public final void shutdownOutput() {
            this.f24452a.shutdownOutput();
        }

        public final void startHandshake() {
            this.f24452a.startHandshake();
        }

        public final String toString() {
            return this.f24452a.toString();
        }
    }

    /* renamed from: com.appodeal.ads.utils.t$b */
    public static class C9654b extends C9653a {
        public C9654b(SSLSocket sSLSocket) {
            super(sSLSocket);
        }

        public final void setEnabledProtocols(String[] strArr) {
            String str;
            PrintStream printStream;
            if (strArr != null && strArr.length == 1 && "SSLv3".equals(strArr[0])) {
                ArrayList arrayList = new ArrayList(Arrays.asList(this.f24452a.getEnabledProtocols()));
                if (arrayList.size() > 1) {
                    arrayList.remove("SSLv3");
                    printStream = System.out;
                    str = "Removed SSLv3 from enabled protocols";
                } else {
                    printStream = System.out;
                    str = "SSL stuck with protocol available for " + arrayList;
                }
                printStream.println(str);
                strArr = (String[]) arrayList.toArray(new String[0]);
            }
            this.f24452a.setEnabledProtocols(strArr);
        }
    }

    public C9652t(SSLSocketFactory sSLSocketFactory) {
        this.f24451a = sSLSocketFactory;
    }

    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.f24451a.createSocket(str, i);
        return createSocket instanceof SSLSocket ? new C9654b((SSLSocket) createSocket) : createSocket;
    }

    public final String[] getDefaultCipherSuites() {
        return this.f24451a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f24451a.getSupportedCipherSuites();
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.f24451a.createSocket(str, i, inetAddress, i2);
        return createSocket instanceof SSLSocket ? new C9654b((SSLSocket) createSocket) : createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.f24451a.createSocket(inetAddress, i);
        return createSocket instanceof SSLSocket ? new C9654b((SSLSocket) createSocket) : createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.f24451a.createSocket(inetAddress, i, inetAddress2, i2);
        return createSocket instanceof SSLSocket ? new C9654b((SSLSocket) createSocket) : createSocket;
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.f24451a.createSocket(socket, str, i, z);
        return createSocket instanceof SSLSocket ? new C9654b((SSLSocket) createSocket) : createSocket;
    }
}
