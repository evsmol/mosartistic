package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.InternalNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.xf */
public final class C3664xf extends MessageNano {

    /* renamed from: a */
    public C3665a[] f9459a;

    /* renamed from: b */
    public boolean f9460b;

    /* renamed from: com.yandex.metrica.impl.ob.xf$a */
    public static final class C3665a extends MessageNano {

        /* renamed from: f */
        private static volatile C3665a[] f9461f;

        /* renamed from: a */
        public int f9462a;

        /* renamed from: b */
        public String f9463b;

        /* renamed from: c */
        public String f9464c;

        /* renamed from: d */
        public long f9465d;

        /* renamed from: e */
        public long f9466e;

        public C3665a() {
            mo18404a();
        }

        /* renamed from: b */
        public static C3665a[] m11029b() {
            if (f9461f == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f9461f == null) {
                        f9461f = new C3665a[0];
                    }
                }
            }
            return f9461f;
        }

        /* renamed from: a */
        public C3665a mo18404a() {
            this.f9462a = 1;
            this.f9463b = "";
            this.f9464c = "";
            this.f9465d = 0;
            this.f9466e = 0;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            return super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt32Size(1, this.f9462a) + CodedOutputByteBufferNano.computeStringSize(2, this.f9463b) + CodedOutputByteBufferNano.computeStringSize(3, this.f9464c) + CodedOutputByteBufferNano.computeUInt64Size(4, this.f9465d) + CodedOutputByteBufferNano.computeUInt64Size(5, this.f9466e);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                        this.f9462a = readInt32;
                    }
                } else if (readTag == 18) {
                    this.f9463b = codedInputByteBufferNano.readString();
                } else if (readTag == 26) {
                    this.f9464c = codedInputByteBufferNano.readString();
                } else if (readTag == 32) {
                    this.f9465d = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 40) {
                    this.f9466e = codedInputByteBufferNano.readUInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt32(1, this.f9462a);
            codedOutputByteBufferNano.writeString(2, this.f9463b);
            codedOutputByteBufferNano.writeString(3, this.f9464c);
            codedOutputByteBufferNano.writeUInt64(4, this.f9465d);
            codedOutputByteBufferNano.writeUInt64(5, this.f9466e);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C3664xf() {
        mo18403a();
    }

    /* renamed from: a */
    public C3664xf mo18403a() {
        this.f9459a = C3665a.m11029b();
        this.f9460b = false;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3665a[] aVarArr = this.f9459a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                C3665a[] aVarArr2 = this.f9459a;
                if (i >= aVarArr2.length) {
                    break;
                }
                C3665a aVar = aVarArr2[i];
                if (aVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, aVar);
                }
                i++;
            }
        }
        return computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(2, this.f9460b);
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C3665a[] aVarArr = this.f9459a;
                int length = aVarArr == null ? 0 : aVarArr.length;
                int i = repeatedFieldArrayLength + length;
                C3665a[] aVarArr2 = new C3665a[i];
                if (length != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                }
                while (length < i - 1) {
                    aVarArr2[length] = new C3665a();
                    codedInputByteBufferNano.readMessage(aVarArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                aVarArr2[length] = new C3665a();
                codedInputByteBufferNano.readMessage(aVarArr2[length]);
                this.f9459a = aVarArr2;
            } else if (readTag == 16) {
                this.f9460b = codedInputByteBufferNano.readBool();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3665a[] aVarArr = this.f9459a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                C3665a[] aVarArr2 = this.f9459a;
                if (i >= aVarArr2.length) {
                    break;
                }
                C3665a aVar = aVarArr2[i];
                if (aVar != null) {
                    codedOutputByteBufferNano.writeMessage(1, aVar);
                }
                i++;
            }
        }
        codedOutputByteBufferNano.writeBool(2, this.f9460b);
        super.writeTo(codedOutputByteBufferNano);
    }
}
