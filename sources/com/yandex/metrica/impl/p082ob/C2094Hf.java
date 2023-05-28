package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.InternalNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.Hf */
public final class C2094Hf extends MessageNano {

    /* renamed from: c */
    private static volatile C2094Hf[] f5532c;

    /* renamed from: a */
    public byte[] f5533a;

    /* renamed from: b */
    public byte[] f5534b;

    public C2094Hf() {
        mo15864a();
    }

    /* renamed from: b */
    public static C2094Hf[] m7325b() {
        if (f5532c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f5532c == null) {
                    f5532c = new C2094Hf[0];
                }
            }
        }
        return f5532c;
    }

    /* renamed from: a */
    public C2094Hf mo15864a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f5533a = bArr;
        this.f5534b = bArr;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f5533a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f5533a);
        }
        return !Arrays.equals(this.f5534b, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f5534b) : computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 10) {
                this.f5533a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f5534b = codedInputByteBufferNano.readBytes();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f5533a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f5533a);
        }
        if (!Arrays.equals(this.f5534b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f5534b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
