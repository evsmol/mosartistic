package com.applovin.exoplayer2.p182c;

import java.nio.ByteBuffer;

/* renamed from: com.applovin.exoplayer2.c.g */
public class C6922g extends C6914a {

    /* renamed from: a */
    public final C6916c f15331a;

    /* renamed from: b */
    public ByteBuffer f15332b;

    /* renamed from: c */
    public boolean f15333c;

    /* renamed from: d */
    public long f15334d;

    /* renamed from: e */
    public ByteBuffer f15335e;

    /* renamed from: f */
    private final int f15336f;

    /* renamed from: g */
    private final int f15337g;

    /* renamed from: com.applovin.exoplayer2.c.g$a */
    public static final class C6923a extends IllegalStateException {

        /* renamed from: a */
        public final int f15338a;

        /* renamed from: b */
        public final int f15339b;

        public C6923a(int i, int i2) {
            super("Buffer too small (" + i + " < " + i2 + ")");
            this.f15338a = i;
            this.f15339b = i2;
        }
    }

    public C6922g(int i) {
        this(i, 0);
    }

    public C6922g(int i, int i2) {
        this.f15331a = new C6916c();
        this.f15336f = i;
        this.f15337g = i2;
    }

    /* renamed from: f */
    public static C6922g m18449f() {
        return new C6922g(0);
    }

    /* renamed from: g */
    private ByteBuffer mo54146g(int i) {
        int i2 = this.f15336f;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f15332b;
        throw new C6923a(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    /* renamed from: a */
    public void mo53121a() {
        super.mo53121a();
        ByteBuffer byteBuffer = this.f15332b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f15335e;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f15333c = false;
    }

    /* renamed from: e */
    public void mo53140e(int i) {
        ByteBuffer byteBuffer = this.f15335e;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f15335e = ByteBuffer.allocate(i);
        } else {
            this.f15335e.clear();
        }
    }

    /* renamed from: f */
    public void mo53141f(int i) {
        int i2 = i + this.f15337g;
        ByteBuffer byteBuffer = this.f15332b;
        if (byteBuffer == null) {
            this.f15332b = mo54146g(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.f15332b = byteBuffer;
            return;
        }
        ByteBuffer g = mo54146g(i3);
        g.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            g.put(byteBuffer);
        }
        this.f15332b = g;
    }

    /* renamed from: g */
    public final boolean mo53142g() {
        return mo53128d(1073741824);
    }

    /* renamed from: h */
    public final void mo53143h() {
        ByteBuffer byteBuffer = this.f15332b;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f15335e;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
