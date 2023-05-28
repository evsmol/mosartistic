package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.df */
public final class C2894df extends MessageNano {

    /* renamed from: a */
    public C3128kf f7642a;

    /* renamed from: b */
    public C3128kf[] f7643b;

    /* renamed from: c */
    public String f7644c;

    public C2894df() {
        mo17457a();
    }

    /* renamed from: a */
    public C2894df mo17457a() {
        this.f7642a = null;
        this.f7643b = C3128kf.m9904b();
        this.f7644c = "";
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3128kf kfVar = this.f7642a;
        if (kfVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, kfVar);
        }
        C3128kf[] kfVarArr = this.f7643b;
        if (kfVarArr != null && kfVarArr.length > 0) {
            int i = 0;
            while (true) {
                C3128kf[] kfVarArr2 = this.f7643b;
                if (i >= kfVarArr2.length) {
                    break;
                }
                C3128kf kfVar2 = kfVarArr2[i];
                if (kfVar2 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, kfVar2);
                }
                i++;
            }
        }
        return !this.f7644c.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(3, this.f7644c) : computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 10) {
                if (this.f7642a == null) {
                    this.f7642a = new C3128kf();
                }
                codedInputByteBufferNano.readMessage(this.f7642a);
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C3128kf[] kfVarArr = this.f7643b;
                int length = kfVarArr == null ? 0 : kfVarArr.length;
                int i = repeatedFieldArrayLength + length;
                C3128kf[] kfVarArr2 = new C3128kf[i];
                if (length != 0) {
                    System.arraycopy(kfVarArr, 0, kfVarArr2, 0, length);
                }
                while (length < i - 1) {
                    kfVarArr2[length] = new C3128kf();
                    codedInputByteBufferNano.readMessage(kfVarArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                kfVarArr2[length] = new C3128kf();
                codedInputByteBufferNano.readMessage(kfVarArr2[length]);
                this.f7643b = kfVarArr2;
            } else if (readTag == 26) {
                this.f7644c = codedInputByteBufferNano.readString();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3128kf kfVar = this.f7642a;
        if (kfVar != null) {
            codedOutputByteBufferNano.writeMessage(1, kfVar);
        }
        C3128kf[] kfVarArr = this.f7643b;
        if (kfVarArr != null && kfVarArr.length > 0) {
            int i = 0;
            while (true) {
                C3128kf[] kfVarArr2 = this.f7643b;
                if (i >= kfVarArr2.length) {
                    break;
                }
                C3128kf kfVar2 = kfVarArr2[i];
                if (kfVar2 != null) {
                    codedOutputByteBufferNano.writeMessage(2, kfVar2);
                }
                i++;
            }
        }
        if (!this.f7644c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f7644c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
