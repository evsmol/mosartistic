package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.ef */
public final class C2924ef extends MessageNano {

    /* renamed from: a */
    public C2894df f7756a;

    /* renamed from: b */
    public String f7757b;

    /* renamed from: c */
    public int f7758c;

    public C2924ef() {
        mo17552a();
    }

    /* renamed from: a */
    public C2924ef mo17552a() {
        this.f7756a = null;
        this.f7757b = "";
        this.f7758c = -1;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C2894df dfVar = this.f7756a;
        if (dfVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, dfVar);
        }
        if (!this.f7757b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f7757b);
        }
        int i = this.f7758c;
        return i != -1 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(3, i) : computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 10) {
                if (this.f7756a == null) {
                    this.f7756a = new C2894df();
                }
                codedInputByteBufferNano.readMessage(this.f7756a);
            } else if (readTag == 18) {
                this.f7757b = codedInputByteBufferNano.readString();
            } else if (readTag == 24) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f7758c = readInt32;
                }
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C2894df dfVar = this.f7756a;
        if (dfVar != null) {
            codedOutputByteBufferNano.writeMessage(1, dfVar);
        }
        if (!this.f7757b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f7757b);
        }
        int i = this.f7758c;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(3, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
