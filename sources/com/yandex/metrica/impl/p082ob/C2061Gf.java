package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Gf */
public final class C2061Gf extends MessageNano {

    /* renamed from: a */
    public C2094Hf[] f5457a;

    public C2061Gf() {
        mo15823a();
    }

    /* renamed from: a */
    public C2061Gf mo15823a() {
        this.f5457a = C2094Hf.m7325b();
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C2094Hf[] hfArr = this.f5457a;
        if (hfArr != null && hfArr.length > 0) {
            int i = 0;
            while (true) {
                C2094Hf[] hfArr2 = this.f5457a;
                if (i >= hfArr2.length) {
                    break;
                }
                C2094Hf hf = hfArr2[i];
                if (hf != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, hf);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C2094Hf[] hfArr = this.f5457a;
                int length = hfArr == null ? 0 : hfArr.length;
                int i = repeatedFieldArrayLength + length;
                C2094Hf[] hfArr2 = new C2094Hf[i];
                if (length != 0) {
                    System.arraycopy(hfArr, 0, hfArr2, 0, length);
                }
                while (length < i - 1) {
                    hfArr2[length] = new C2094Hf();
                    codedInputByteBufferNano.readMessage(hfArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                hfArr2[length] = new C2094Hf();
                codedInputByteBufferNano.readMessage(hfArr2[length]);
                this.f5457a = hfArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C2094Hf[] hfArr = this.f5457a;
        if (hfArr != null && hfArr.length > 0) {
            int i = 0;
            while (true) {
                C2094Hf[] hfArr2 = this.f5457a;
                if (i >= hfArr2.length) {
                    break;
                }
                C2094Hf hf = hfArr2[i];
                if (hf != null) {
                    codedOutputByteBufferNano.writeMessage(1, hf);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
