package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.if */
public final class C3061if extends MessageNano {

    /* renamed from: a */
    public int f8058a;

    /* renamed from: b */
    public String f8059b;

    public C3061if() {
        mo17714a();
    }

    /* renamed from: a */
    public C3061if mo17714a() {
        this.f8058a = 0;
        this.f8059b = "";
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f8058a;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        return !this.f8059b.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f8059b) : computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 8) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f8058a = readInt32;
                }
            } else if (readTag == 18) {
                this.f8059b = codedInputByteBufferNano.readString();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f8058a;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        if (!this.f8059b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f8059b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
