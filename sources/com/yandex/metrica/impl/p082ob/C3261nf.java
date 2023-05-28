package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.nf */
public final class C3261nf extends MessageNano {

    /* renamed from: a */
    public byte[] f8429a;

    public C3261nf() {
        mo17886a();
    }

    /* renamed from: a */
    public C3261nf mo17886a() {
        this.f8429a = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return !Arrays.equals(this.f8429a, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(1, this.f8429a) : computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 10) {
                this.f8429a = codedInputByteBufferNano.readBytes();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f8429a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f8429a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
