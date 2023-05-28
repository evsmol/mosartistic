package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.InternalNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Bf */
public final class C1894Bf extends MessageNano {

    /* renamed from: a */
    public C1895a[] f5117a;

    /* renamed from: com.yandex.metrica.impl.ob.Bf$a */
    public static final class C1895a extends MessageNano {

        /* renamed from: c */
        private static volatile C1895a[] f5118c;

        /* renamed from: a */
        public String f5119a;

        /* renamed from: b */
        public boolean f5120b;

        public C1895a() {
            mo15565a();
        }

        /* renamed from: b */
        public static C1895a[] m6929b() {
            if (f5118c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f5118c == null) {
                        f5118c = new C1895a[0];
                    }
                }
            }
            return f5118c;
        }

        /* renamed from: a */
        public C1895a mo15565a() {
            this.f5119a = "";
            this.f5120b = false;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            return super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f5119a) + CodedOutputByteBufferNano.computeBoolSize(2, this.f5120b);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f5119a = codedInputByteBufferNano.readString();
                } else if (readTag == 16) {
                    this.f5120b = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeString(1, this.f5119a);
            codedOutputByteBufferNano.writeBool(2, this.f5120b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C1894Bf() {
        mo15564a();
    }

    /* renamed from: a */
    public C1894Bf mo15564a() {
        this.f5117a = C1895a.m6929b();
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C1895a[] aVarArr = this.f5117a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                C1895a[] aVarArr2 = this.f5117a;
                if (i >= aVarArr2.length) {
                    break;
                }
                C1895a aVar = aVarArr2[i];
                if (aVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, aVar);
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
                C1895a[] aVarArr = this.f5117a;
                int length = aVarArr == null ? 0 : aVarArr.length;
                int i = repeatedFieldArrayLength + length;
                C1895a[] aVarArr2 = new C1895a[i];
                if (length != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                }
                while (length < i - 1) {
                    aVarArr2[length] = new C1895a();
                    codedInputByteBufferNano.readMessage(aVarArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                aVarArr2[length] = new C1895a();
                codedInputByteBufferNano.readMessage(aVarArr2[length]);
                this.f5117a = aVarArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C1895a[] aVarArr = this.f5117a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                C1895a[] aVarArr2 = this.f5117a;
                if (i >= aVarArr2.length) {
                    break;
                }
                C1895a aVar = aVarArr2[i];
                if (aVar != null) {
                    codedOutputByteBufferNano.writeMessage(1, aVar);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
