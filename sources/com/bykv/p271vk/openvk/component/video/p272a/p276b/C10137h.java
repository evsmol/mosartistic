package com.bykv.p271vk.openvk.component.video.p272a.p276b;

import com.bykv.p271vk.openvk.component.video.p272a.p283c.C10148a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.h */
/* compiled from: RandomAccessFileWrapper */
class C10137h {

    /* renamed from: a */
    private final RandomAccessFile f25048a;

    C10137h(File file, String str) throws C10138a {
        try {
            this.f25048a = new RandomAccessFile(file, str);
        } catch (FileNotFoundException e) {
            throw new C10138a(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo62785a(long j) throws C10138a {
        try {
            this.f25048a.seek(j);
        } catch (IOException e) {
            throw new C10138a(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo62786a(byte[] bArr, int i, int i2) throws C10138a {
        try {
            this.f25048a.write(bArr, i, i2);
        } catch (IOException e) {
            throw new C10138a(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo62783a(byte[] bArr) throws C10138a {
        try {
            return this.f25048a.read(bArr);
        } catch (IOException e) {
            throw new C10138a(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo62784a() {
        C10148a.m28910a(this.f25048a);
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.h$a */
    /* compiled from: RandomAccessFileWrapper */
    static class C10138a extends Exception {
        C10138a(Throwable th) {
            super(th);
        }
    }
}
