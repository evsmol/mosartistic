package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.InternalNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Ef */
public final class C1989Ef extends MessageNano {

    /* renamed from: a */
    public C1990a f5318a;

    /* renamed from: b */
    public boolean f5319b;

    /* renamed from: com.yandex.metrica.impl.ob.Ef$a */
    public static final class C1990a extends MessageNano {

        /* renamed from: a */
        public C1991a[] f5320a;

        /* renamed from: com.yandex.metrica.impl.ob.Ef$a$a */
        public static final class C1991a extends MessageNano {

            /* renamed from: c */
            private static volatile C1991a[] f5321c;

            /* renamed from: a */
            public String f5322a;

            /* renamed from: b */
            public String f5323b;

            public C1991a() {
                mo15688a();
            }

            /* renamed from: b */
            public static C1991a[] m7100b() {
                if (f5321c == null) {
                    synchronized (InternalNano.LAZY_INIT_LOCK) {
                        if (f5321c == null) {
                            f5321c = new C1991a[0];
                        }
                    }
                }
                return f5321c;
            }

            /* renamed from: a */
            public C1991a mo15688a() {
                this.f5322a = "";
                this.f5323b = "";
                this.cachedSize = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            public int computeSerializedSize() {
                int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f5322a);
                return !this.f5323b.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f5323b) : computeSerializedSize;
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                while (true) {
                    int readTag = codedInputByteBufferNano.readTag();
                    if (readTag == 0) {
                        break;
                    } else if (readTag == 10) {
                        this.f5322a = codedInputByteBufferNano.readString();
                    } else if (readTag == 18) {
                        this.f5323b = codedInputByteBufferNano.readString();
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    }
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                codedOutputByteBufferNano.writeString(1, this.f5322a);
                if (!this.f5323b.equals("")) {
                    codedOutputByteBufferNano.writeString(2, this.f5323b);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public C1990a() {
            mo15687a();
        }

        /* renamed from: a */
        public C1990a mo15687a() {
            this.f5320a = C1991a.m7100b();
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            C1991a[] aVarArr = this.f5320a;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C1991a[] aVarArr2 = this.f5320a;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    C1991a aVar = aVarArr2[i];
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
                    C1991a[] aVarArr = this.f5320a;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    int i = repeatedFieldArrayLength + length;
                    C1991a[] aVarArr2 = new C1991a[i];
                    if (length != 0) {
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        aVarArr2[length] = new C1991a();
                        codedInputByteBufferNano.readMessage(aVarArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    aVarArr2[length] = new C1991a();
                    codedInputByteBufferNano.readMessage(aVarArr2[length]);
                    this.f5320a = aVarArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            C1991a[] aVarArr = this.f5320a;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C1991a[] aVarArr2 = this.f5320a;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    C1991a aVar = aVarArr2[i];
                    if (aVar != null) {
                        codedOutputByteBufferNano.writeMessage(1, aVar);
                    }
                    i++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C1989Ef() {
        mo15686a();
    }

    /* renamed from: a */
    public C1989Ef mo15686a() {
        this.f5318a = null;
        this.f5319b = false;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C1990a aVar = this.f5318a;
        if (aVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, aVar);
        }
        boolean z = this.f5319b;
        return z ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(2, z) : computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 10) {
                if (this.f5318a == null) {
                    this.f5318a = new C1990a();
                }
                codedInputByteBufferNano.readMessage(this.f5318a);
            } else if (readTag == 16) {
                this.f5319b = codedInputByteBufferNano.readBool();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C1990a aVar = this.f5318a;
        if (aVar != null) {
            codedOutputByteBufferNano.writeMessage(1, aVar);
        }
        boolean z = this.f5319b;
        if (z) {
            codedOutputByteBufferNano.writeBool(2, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
