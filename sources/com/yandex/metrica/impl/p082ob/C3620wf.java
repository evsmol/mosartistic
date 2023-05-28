package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.InternalNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.wf */
public final class C3620wf extends MessageNano {

    /* renamed from: a */
    public C3622b[] f9392a;

    /* renamed from: b */
    public C3621a f9393b;

    /* renamed from: c */
    public String[] f9394c;

    /* renamed from: com.yandex.metrica.impl.ob.wf$a */
    public static final class C3621a extends MessageNano {

        /* renamed from: a */
        public int f9395a;

        /* renamed from: b */
        public int f9396b;

        public C3621a() {
            mo18369a();
        }

        /* renamed from: a */
        public C3621a mo18369a() {
            this.f9395a = 0;
            this.f9396b = -1;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            return super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt32Size(2, this.f9395a) + CodedOutputByteBufferNano.computeInt32Size(3, this.f9396b);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 16) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 4 || readInt32 == 5) {
                        this.f9395a = readInt32;
                    }
                } else if (readTag == 24) {
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 == -1 || readInt322 == 0 || readInt322 == 1) {
                        this.f9396b = readInt322;
                    }
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt32(2, this.f9395a);
            codedOutputByteBufferNano.writeInt32(3, this.f9396b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.wf$b */
    public static final class C3622b extends MessageNano {

        /* renamed from: c */
        private static volatile C3622b[] f9397c;

        /* renamed from: a */
        public String f9398a;

        /* renamed from: b */
        public boolean f9399b;

        public C3622b() {
            mo18370a();
        }

        /* renamed from: b */
        public static C3622b[] m10961b() {
            if (f9397c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f9397c == null) {
                        f9397c = new C3622b[0];
                    }
                }
            }
            return f9397c;
        }

        /* renamed from: a */
        public C3622b mo18370a() {
            this.f9398a = "";
            this.f9399b = false;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            return super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f9398a) + CodedOutputByteBufferNano.computeBoolSize(2, this.f9399b);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f9398a = codedInputByteBufferNano.readString();
                } else if (readTag == 16) {
                    this.f9399b = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeString(1, this.f9398a);
            codedOutputByteBufferNano.writeBool(2, this.f9399b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C3620wf() {
        mo18368a();
    }

    /* renamed from: a */
    public C3620wf mo18368a() {
        this.f9392a = C3622b.m10961b();
        this.f9393b = null;
        this.f9394c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3622b[] bVarArr = this.f9392a;
        int i = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C3622b[] bVarArr2 = this.f9392a;
                if (i2 >= bVarArr2.length) {
                    break;
                }
                C3622b bVar = bVarArr2[i2];
                if (bVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, bVar);
                }
                i2++;
            }
        }
        C3621a aVar = this.f9393b;
        if (aVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, aVar);
        }
        String[] strArr = this.f9394c;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            String[] strArr2 = this.f9394c;
            if (i >= strArr2.length) {
                return computeSerializedSize + i3 + (i4 * 1);
            }
            String str = strArr2[i];
            if (str != null) {
                i4++;
                i3 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
            }
            i++;
        }
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C3622b[] bVarArr = this.f9392a;
                int length = bVarArr == null ? 0 : bVarArr.length;
                int i = repeatedFieldArrayLength + length;
                C3622b[] bVarArr2 = new C3622b[i];
                if (length != 0) {
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                }
                while (length < i - 1) {
                    bVarArr2[length] = new C3622b();
                    codedInputByteBufferNano.readMessage(bVarArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                bVarArr2[length] = new C3622b();
                codedInputByteBufferNano.readMessage(bVarArr2[length]);
                this.f9392a = bVarArr2;
            } else if (readTag == 18) {
                if (this.f9393b == null) {
                    this.f9393b = new C3621a();
                }
                codedInputByteBufferNano.readMessage(this.f9393b);
            } else if (readTag == 26) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.f9394c;
                int length2 = strArr == null ? 0 : strArr.length;
                int i2 = repeatedFieldArrayLength2 + length2;
                String[] strArr2 = new String[i2];
                if (length2 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    strArr2[length2] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                strArr2[length2] = codedInputByteBufferNano.readString();
                this.f9394c = strArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3622b[] bVarArr = this.f9392a;
        int i = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C3622b[] bVarArr2 = this.f9392a;
                if (i2 >= bVarArr2.length) {
                    break;
                }
                C3622b bVar = bVarArr2[i2];
                if (bVar != null) {
                    codedOutputByteBufferNano.writeMessage(1, bVar);
                }
                i2++;
            }
        }
        C3621a aVar = this.f9393b;
        if (aVar != null) {
            codedOutputByteBufferNano.writeMessage(2, aVar);
        }
        String[] strArr = this.f9394c;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f9394c;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
