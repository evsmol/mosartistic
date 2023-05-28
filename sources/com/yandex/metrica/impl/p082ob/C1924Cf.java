package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.InternalNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Cf */
public final class C1924Cf extends MessageNano {

    /* renamed from: a */
    public C1925a f5172a;

    /* renamed from: b */
    public C1926b[] f5173b;

    /* renamed from: com.yandex.metrica.impl.ob.Cf$a */
    public static final class C1925a extends MessageNano {

        /* renamed from: a */
        public String f5174a;

        /* renamed from: b */
        public String f5175b;

        /* renamed from: c */
        public boolean f5176c;

        /* renamed from: d */
        public boolean f5177d;

        /* renamed from: e */
        public int f5178e;

        public C1925a() {
            mo15590a();
        }

        /* renamed from: a */
        public C1925a mo15590a() {
            this.f5174a = "";
            this.f5175b = "";
            this.f5176c = false;
            this.f5177d = false;
            this.f5178e = 0;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.f5174a.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f5174a);
            }
            if (!this.f5175b.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f5175b);
            }
            boolean z = this.f5176c;
            if (z) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z);
            }
            boolean z2 = this.f5177d;
            if (z2) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z2);
            }
            return computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(5, this.f5178e);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f5174a = codedInputByteBufferNano.readString();
                } else if (readTag == 18) {
                    this.f5175b = codedInputByteBufferNano.readString();
                } else if (readTag == 24) {
                    this.f5176c = codedInputByteBufferNano.readBool();
                } else if (readTag == 32) {
                    this.f5177d = codedInputByteBufferNano.readBool();
                } else if (readTag == 40) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                        this.f5178e = readInt32;
                    }
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.f5174a.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.f5174a);
            }
            if (!this.f5175b.equals("")) {
                codedOutputByteBufferNano.writeString(2, this.f5175b);
            }
            boolean z = this.f5176c;
            if (z) {
                codedOutputByteBufferNano.writeBool(3, z);
            }
            boolean z2 = this.f5177d;
            if (z2) {
                codedOutputByteBufferNano.writeBool(4, z2);
            }
            codedOutputByteBufferNano.writeInt32(5, this.f5178e);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Cf$b */
    public static final class C1926b extends MessageNano {

        /* renamed from: d */
        private static volatile C1926b[] f5179d;

        /* renamed from: a */
        public String f5180a;

        /* renamed from: b */
        public String f5181b;

        /* renamed from: c */
        public int f5182c;

        public C1926b() {
            mo15591a();
        }

        /* renamed from: b */
        public static C1926b[] m6973b() {
            if (f5179d == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f5179d == null) {
                        f5179d = new C1926b[0];
                    }
                }
            }
            return f5179d;
        }

        /* renamed from: a */
        public C1926b mo15591a() {
            this.f5180a = "";
            this.f5181b = "";
            this.f5182c = 0;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.f5180a.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f5180a);
            }
            if (!this.f5181b.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f5181b);
            }
            return computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(3, this.f5182c);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f5180a = codedInputByteBufferNano.readString();
                } else if (readTag == 18) {
                    this.f5181b = codedInputByteBufferNano.readString();
                } else if (readTag == 24) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                        this.f5182c = readInt32;
                    }
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.f5180a.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.f5180a);
            }
            if (!this.f5181b.equals("")) {
                codedOutputByteBufferNano.writeString(2, this.f5181b);
            }
            codedOutputByteBufferNano.writeInt32(3, this.f5182c);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C1924Cf() {
        mo15589a();
    }

    /* renamed from: a */
    public C1924Cf mo15589a() {
        this.f5172a = null;
        this.f5173b = C1926b.m6973b();
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C1925a aVar = this.f5172a;
        if (aVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, aVar);
        }
        C1926b[] bVarArr = this.f5173b;
        if (bVarArr != null && bVarArr.length > 0) {
            int i = 0;
            while (true) {
                C1926b[] bVarArr2 = this.f5173b;
                if (i >= bVarArr2.length) {
                    break;
                }
                C1926b bVar = bVarArr2[i];
                if (bVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, bVar);
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
                if (this.f5172a == null) {
                    this.f5172a = new C1925a();
                }
                codedInputByteBufferNano.readMessage(this.f5172a);
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C1926b[] bVarArr = this.f5173b;
                int length = bVarArr == null ? 0 : bVarArr.length;
                int i = repeatedFieldArrayLength + length;
                C1926b[] bVarArr2 = new C1926b[i];
                if (length != 0) {
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                }
                while (length < i - 1) {
                    bVarArr2[length] = new C1926b();
                    codedInputByteBufferNano.readMessage(bVarArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                bVarArr2[length] = new C1926b();
                codedInputByteBufferNano.readMessage(bVarArr2[length]);
                this.f5173b = bVarArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C1925a aVar = this.f5172a;
        if (aVar != null) {
            codedOutputByteBufferNano.writeMessage(1, aVar);
        }
        C1926b[] bVarArr = this.f5173b;
        if (bVarArr != null && bVarArr.length > 0) {
            int i = 0;
            while (true) {
                C1926b[] bVarArr2 = this.f5173b;
                if (i >= bVarArr2.length) {
                    break;
                }
                C1926b bVar = bVarArr2[i];
                if (bVar != null) {
                    codedOutputByteBufferNano.writeMessage(2, bVar);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
