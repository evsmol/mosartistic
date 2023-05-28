package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.InternalNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.cf */
public final class C2867cf extends MessageNano {

    /* renamed from: l */
    private static byte[] f7597l;

    /* renamed from: m */
    private static volatile boolean f7598m;

    /* renamed from: a */
    public byte[] f7599a;

    /* renamed from: b */
    public C2868a f7600b;

    /* renamed from: c */
    public byte[] f7601c;

    /* renamed from: d */
    public int f7602d;

    /* renamed from: e */
    public byte[] f7603e;

    /* renamed from: f */
    public byte[] f7604f;

    /* renamed from: g */
    public byte[] f7605g;

    /* renamed from: h */
    public byte[] f7606h;

    /* renamed from: i */
    public byte[] f7607i;

    /* renamed from: j */
    public byte[] f7608j;

    /* renamed from: k */
    public byte[] f7609k;

    /* renamed from: com.yandex.metrica.impl.ob.cf$a */
    public static final class C2868a extends MessageNano {

        /* renamed from: a */
        public long f7610a;

        /* renamed from: b */
        public int f7611b;

        public C2868a() {
            mo17417a();
        }

        /* renamed from: a */
        public C2868a mo17417a() {
            this.f7610a = 0;
            this.f7611b = 0;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            long j = this.f7610a;
            if (j != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
            }
            int i = this.f7611b;
            return i != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f7610a = codedInputByteBufferNano.readInt64();
                } else if (readTag == 16) {
                    this.f7611b = codedInputByteBufferNano.readInt32();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long j = this.f7610a;
            if (j != 0) {
                codedOutputByteBufferNano.writeInt64(1, j);
            }
            int i = this.f7611b;
            if (i != 0) {
                codedOutputByteBufferNano.writeInt32(2, i);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C2867cf() {
        if (!f7598m) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (!f7598m) {
                    f7597l = InternalNano.bytesDefaultValue("manual");
                    f7598m = true;
                }
            }
        }
        mo17416a();
    }

    /* renamed from: a */
    public C2867cf mo17416a() {
        this.f7599a = (byte[]) f7597l.clone();
        this.f7600b = null;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f7601c = bArr;
        this.f7602d = 0;
        this.f7603e = bArr;
        this.f7604f = bArr;
        this.f7605g = bArr;
        this.f7606h = bArr;
        this.f7607i = bArr;
        this.f7608j = bArr;
        this.f7609k = bArr;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f7599a, f7597l)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f7599a);
        }
        C2868a aVar = this.f7600b;
        if (aVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, aVar);
        }
        if (!Arrays.equals(this.f7601c, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f7601c);
        }
        int i = this.f7602d;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i);
        }
        if (!Arrays.equals(this.f7603e, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f7603e);
        }
        if (!Arrays.equals(this.f7604f, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(6, this.f7604f);
        }
        if (!Arrays.equals(this.f7605g, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(7, this.f7605g);
        }
        if (!Arrays.equals(this.f7606h, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f7606h);
        }
        if (!Arrays.equals(this.f7607i, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f7607i);
        }
        if (!Arrays.equals(this.f7608j, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f7608j);
        }
        return !Arrays.equals(this.f7609k, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(11, this.f7609k) : computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    this.f7599a = codedInputByteBufferNano.readBytes();
                    continue;
                case 18:
                    if (this.f7600b == null) {
                        this.f7600b = new C2868a();
                    }
                    codedInputByteBufferNano.readMessage(this.f7600b);
                    continue;
                case 26:
                    this.f7601c = codedInputByteBufferNano.readBytes();
                    continue;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    switch (readInt32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f7602d = readInt32;
                            break;
                        default:
                            continue;
                    }
                case 42:
                    this.f7603e = codedInputByteBufferNano.readBytes();
                    continue;
                case 50:
                    this.f7604f = codedInputByteBufferNano.readBytes();
                    continue;
                case 58:
                    this.f7605g = codedInputByteBufferNano.readBytes();
                    continue;
                case 66:
                    this.f7606h = codedInputByteBufferNano.readBytes();
                    continue;
                case 74:
                    this.f7607i = codedInputByteBufferNano.readBytes();
                    continue;
                case 82:
                    this.f7608j = codedInputByteBufferNano.readBytes();
                    continue;
                case 90:
                    this.f7609k = codedInputByteBufferNano.readBytes();
                    continue;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    } else {
                        continue;
                    }
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f7599a, f7597l)) {
            codedOutputByteBufferNano.writeBytes(1, this.f7599a);
        }
        C2868a aVar = this.f7600b;
        if (aVar != null) {
            codedOutputByteBufferNano.writeMessage(2, aVar);
        }
        if (!Arrays.equals(this.f7601c, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(3, this.f7601c);
        }
        int i = this.f7602d;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        if (!Arrays.equals(this.f7603e, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(5, this.f7603e);
        }
        if (!Arrays.equals(this.f7604f, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(6, this.f7604f);
        }
        if (!Arrays.equals(this.f7605g, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(7, this.f7605g);
        }
        if (!Arrays.equals(this.f7606h, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(8, this.f7606h);
        }
        if (!Arrays.equals(this.f7607i, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(9, this.f7607i);
        }
        if (!Arrays.equals(this.f7608j, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(10, this.f7608j);
        }
        if (!Arrays.equals(this.f7609k, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(11, this.f7609k);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
