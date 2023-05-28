package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.InternalNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.zf */
public final class C3733zf extends MessageNano {

    /* renamed from: a */
    public C3734a[] f9585a;

    /* renamed from: com.yandex.metrica.impl.ob.zf$a */
    public static final class C3734a extends MessageNano {

        /* renamed from: c */
        private static volatile C3734a[] f9586c;

        /* renamed from: a */
        public String f9587a;

        /* renamed from: b */
        public byte[] f9588b;

        public C3734a() {
            mo18462a();
        }

        /* renamed from: b */
        public static C3734a[] m11140b() {
            if (f9586c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f9586c == null) {
                        f9586c = new C3734a[0];
                    }
                }
            }
            return f9586c;
        }

        /* renamed from: a */
        public C3734a mo18462a() {
            this.f9587a = "";
            this.f9588b = WireFormatNano.EMPTY_BYTES;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.f9587a.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f9587a);
            }
            return !Arrays.equals(this.f9588b, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f9588b) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f9587a = codedInputByteBufferNano.readString();
                } else if (readTag == 18) {
                    this.f9588b = codedInputByteBufferNano.readBytes();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.f9587a.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.f9587a);
            }
            if (!Arrays.equals(this.f9588b, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(2, this.f9588b);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C3733zf() {
        mo18461a();
    }

    /* renamed from: a */
    public C3733zf mo18461a() {
        this.f9585a = C3734a.m11140b();
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3734a[] aVarArr = this.f9585a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                C3734a[] aVarArr2 = this.f9585a;
                if (i >= aVarArr2.length) {
                    break;
                }
                C3734a aVar = aVarArr2[i];
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
                C3734a[] aVarArr = this.f9585a;
                int length = aVarArr == null ? 0 : aVarArr.length;
                int i = repeatedFieldArrayLength + length;
                C3734a[] aVarArr2 = new C3734a[i];
                if (length != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                }
                while (length < i - 1) {
                    aVarArr2[length] = new C3734a();
                    codedInputByteBufferNano.readMessage(aVarArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                aVarArr2[length] = new C3734a();
                codedInputByteBufferNano.readMessage(aVarArr2[length]);
                this.f9585a = aVarArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3734a[] aVarArr = this.f9585a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                C3734a[] aVarArr2 = this.f9585a;
                if (i >= aVarArr2.length) {
                    break;
                }
                C3734a aVar = aVarArr2[i];
                if (aVar != null) {
                    codedOutputByteBufferNano.writeMessage(1, aVar);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
