package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.InternalNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.ff */
public final class C2966ff extends MessageNano {

    /* renamed from: c */
    private static volatile C2966ff[] f7860c;

    /* renamed from: a */
    public byte[] f7861a;

    /* renamed from: b */
    public byte[] f7862b;

    public C2966ff() {
        mo17601a();
    }

    /* renamed from: b */
    public static C2966ff[] m9577b() {
        if (f7860c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f7860c == null) {
                    f7860c = new C2966ff[0];
                }
            }
        }
        return f7860c;
    }

    /* renamed from: a */
    public C2966ff mo17601a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f7861a = bArr;
        this.f7862b = bArr;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f7861a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f7861a);
        }
        return !Arrays.equals(this.f7862b, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f7862b) : computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 10) {
                this.f7861a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f7862b = codedInputByteBufferNano.readBytes();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f7861a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f7861a);
        }
        if (!Arrays.equals(this.f7862b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f7862b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
