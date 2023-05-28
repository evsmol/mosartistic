package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.InternalNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.yf */
public final class C3699yf extends MessageNano {

    /* renamed from: a */
    public C3700a f9515a;

    /* renamed from: b */
    public C3700a[] f9516b;

    /* renamed from: com.yandex.metrica.impl.ob.yf$a */
    public static final class C3700a extends MessageNano {

        /* renamed from: c */
        private static volatile C3700a[] f9517c;

        /* renamed from: a */
        public C3701b f9518a;

        /* renamed from: b */
        public int f9519b;

        public C3700a() {
            mo18428a();
        }

        /* renamed from: b */
        public static C3700a[] m11080b() {
            if (f9517c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f9517c == null) {
                        f9517c = new C3700a[0];
                    }
                }
            }
            return f9517c;
        }

        /* renamed from: a */
        public C3700a mo18428a() {
            this.f9518a = null;
            this.f9519b = 0;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            C3701b bVar = this.f9518a;
            if (bVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, bVar);
            }
            int i = this.f9519b;
            return i != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    if (this.f9518a == null) {
                        this.f9518a = new C3701b();
                    }
                    codedInputByteBufferNano.readMessage(this.f9518a);
                } else if (readTag == 16) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                        this.f9519b = readInt32;
                    }
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            C3701b bVar = this.f9518a;
            if (bVar != null) {
                codedOutputByteBufferNano.writeMessage(1, bVar);
            }
            int i = this.f9519b;
            if (i != 0) {
                codedOutputByteBufferNano.writeInt32(2, i);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.yf$b */
    public static final class C3701b extends MessageNano {

        /* renamed from: a */
        public C3702a[] f9520a;

        /* renamed from: com.yandex.metrica.impl.ob.yf$b$a */
        public static final class C3702a extends MessageNano {

            /* renamed from: c */
            private static volatile C3702a[] f9521c;

            /* renamed from: a */
            public String f9522a;

            /* renamed from: b */
            public String f9523b;

            public C3702a() {
                mo18430a();
            }

            /* renamed from: b */
            public static C3702a[] m11083b() {
                if (f9521c == null) {
                    synchronized (InternalNano.LAZY_INIT_LOCK) {
                        if (f9521c == null) {
                            f9521c = new C3702a[0];
                        }
                    }
                }
                return f9521c;
            }

            /* renamed from: a */
            public C3702a mo18430a() {
                this.f9522a = "";
                this.f9523b = "";
                this.cachedSize = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            public int computeSerializedSize() {
                int computeSerializedSize = super.computeSerializedSize();
                if (!this.f9522a.equals("")) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f9522a);
                }
                return !this.f9523b.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f9523b) : computeSerializedSize;
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                while (true) {
                    int readTag = codedInputByteBufferNano.readTag();
                    if (readTag == 0) {
                        break;
                    } else if (readTag == 10) {
                        this.f9522a = codedInputByteBufferNano.readString();
                    } else if (readTag == 18) {
                        this.f9523b = codedInputByteBufferNano.readString();
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    }
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                if (!this.f9522a.equals("")) {
                    codedOutputByteBufferNano.writeString(1, this.f9522a);
                }
                if (!this.f9523b.equals("")) {
                    codedOutputByteBufferNano.writeString(2, this.f9523b);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public C3701b() {
            mo18429a();
        }

        /* renamed from: a */
        public C3701b mo18429a() {
            this.f9520a = C3702a.m11083b();
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            C3702a[] aVarArr = this.f9520a;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C3702a[] aVarArr2 = this.f9520a;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    C3702a aVar = aVarArr2[i];
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
                    C3702a[] aVarArr = this.f9520a;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    int i = repeatedFieldArrayLength + length;
                    C3702a[] aVarArr2 = new C3702a[i];
                    if (length != 0) {
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        aVarArr2[length] = new C3702a();
                        codedInputByteBufferNano.readMessage(aVarArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    aVarArr2[length] = new C3702a();
                    codedInputByteBufferNano.readMessage(aVarArr2[length]);
                    this.f9520a = aVarArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            C3702a[] aVarArr = this.f9520a;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C3702a[] aVarArr2 = this.f9520a;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    C3702a aVar = aVarArr2[i];
                    if (aVar != null) {
                        codedOutputByteBufferNano.writeMessage(1, aVar);
                    }
                    i++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C3699yf() {
        mo18427a();
    }

    /* renamed from: a */
    public C3699yf mo18427a() {
        this.f9515a = null;
        this.f9516b = C3700a.m11080b();
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3700a aVar = this.f9515a;
        if (aVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, aVar);
        }
        C3700a[] aVarArr = this.f9516b;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                C3700a[] aVarArr2 = this.f9516b;
                if (i >= aVarArr2.length) {
                    break;
                }
                C3700a aVar2 = aVarArr2[i];
                if (aVar2 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, aVar2);
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
                if (this.f9515a == null) {
                    this.f9515a = new C3700a();
                }
                codedInputByteBufferNano.readMessage(this.f9515a);
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C3700a[] aVarArr = this.f9516b;
                int length = aVarArr == null ? 0 : aVarArr.length;
                int i = repeatedFieldArrayLength + length;
                C3700a[] aVarArr2 = new C3700a[i];
                if (length != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                }
                while (length < i - 1) {
                    aVarArr2[length] = new C3700a();
                    codedInputByteBufferNano.readMessage(aVarArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                aVarArr2[length] = new C3700a();
                codedInputByteBufferNano.readMessage(aVarArr2[length]);
                this.f9516b = aVarArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3700a aVar = this.f9515a;
        if (aVar != null) {
            codedOutputByteBufferNano.writeMessage(1, aVar);
        }
        C3700a[] aVarArr = this.f9516b;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                C3700a[] aVarArr2 = this.f9516b;
                if (i >= aVarArr2.length) {
                    break;
                }
                C3700a aVar2 = aVarArr2[i];
                if (aVar2 != null) {
                    codedOutputByteBufferNano.writeMessage(2, aVar2);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
