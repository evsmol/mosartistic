package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.InternalNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Df */
public final class C1956Df extends MessageNano {

    /* renamed from: a */
    public C1957a[] f5239a;

    /* renamed from: b */
    public String[] f5240b;

    /* renamed from: com.yandex.metrica.impl.ob.Df$a */
    public static final class C1957a extends MessageNano {

        /* renamed from: g */
        private static volatile C1957a[] f5241g;

        /* renamed from: a */
        public String f5242a;

        /* renamed from: b */
        public String f5243b;

        /* renamed from: c */
        public String f5244c;

        /* renamed from: d */
        public C1958a[] f5245d;

        /* renamed from: e */
        public long f5246e;

        /* renamed from: f */
        public int[] f5247f;

        /* renamed from: com.yandex.metrica.impl.ob.Df$a$a */
        public static final class C1958a extends MessageNano {

            /* renamed from: c */
            private static volatile C1958a[] f5248c;

            /* renamed from: a */
            public String f5249a;

            /* renamed from: b */
            public String f5250b;

            public C1958a() {
                mo15635a();
            }

            /* renamed from: b */
            public static C1958a[] m7028b() {
                if (f5248c == null) {
                    synchronized (InternalNano.LAZY_INIT_LOCK) {
                        if (f5248c == null) {
                            f5248c = new C1958a[0];
                        }
                    }
                }
                return f5248c;
            }

            /* renamed from: a */
            public C1958a mo15635a() {
                this.f5249a = "";
                this.f5250b = "";
                this.cachedSize = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            public int computeSerializedSize() {
                return super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f5249a) + CodedOutputByteBufferNano.computeStringSize(2, this.f5250b);
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                while (true) {
                    int readTag = codedInputByteBufferNano.readTag();
                    if (readTag == 0) {
                        break;
                    } else if (readTag == 10) {
                        this.f5249a = codedInputByteBufferNano.readString();
                    } else if (readTag == 18) {
                        this.f5250b = codedInputByteBufferNano.readString();
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    }
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                codedOutputByteBufferNano.writeString(1, this.f5249a);
                codedOutputByteBufferNano.writeString(2, this.f5250b);
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public C1957a() {
            mo15634a();
        }

        /* renamed from: b */
        public static C1957a[] m7026b() {
            if (f5241g == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f5241g == null) {
                        f5241g = new C1957a[0];
                    }
                }
            }
            return f5241g;
        }

        /* renamed from: a */
        public C1957a mo15634a() {
            this.f5242a = "";
            this.f5243b = "";
            this.f5244c = "";
            this.f5245d = C1958a.m7028b();
            this.f5246e = 0;
            this.f5247f = WireFormatNano.EMPTY_INT_ARRAY;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f5242a) + CodedOutputByteBufferNano.computeStringSize(2, this.f5243b) + CodedOutputByteBufferNano.computeStringSize(3, this.f5244c);
            C1958a[] aVarArr = this.f5245d;
            int i = 0;
            if (aVarArr != null && aVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C1958a[] aVarArr2 = this.f5245d;
                    if (i2 >= aVarArr2.length) {
                        break;
                    }
                    C1958a aVar = aVarArr2[i2];
                    if (aVar != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, aVar);
                    }
                    i2++;
                }
            }
            int computeUInt64Size = computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(5, this.f5246e);
            int[] iArr = this.f5247f;
            if (iArr == null || iArr.length <= 0) {
                return computeUInt64Size;
            }
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.f5247f;
                if (i >= iArr2.length) {
                    return computeUInt64Size + i3 + (iArr2.length * 1);
                }
                i3 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr2[i]);
                i++;
            }
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f5242a = codedInputByteBufferNano.readString();
                } else if (readTag == 18) {
                    this.f5243b = codedInputByteBufferNano.readString();
                } else if (readTag == 26) {
                    this.f5244c = codedInputByteBufferNano.readString();
                } else if (readTag == 34) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                    C1958a[] aVarArr = this.f5245d;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    int i = repeatedFieldArrayLength + length;
                    C1958a[] aVarArr2 = new C1958a[i];
                    if (length != 0) {
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        aVarArr2[length] = new C1958a();
                        codedInputByteBufferNano.readMessage(aVarArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    aVarArr2[length] = new C1958a();
                    codedInputByteBufferNano.readMessage(aVarArr2[length]);
                    this.f5245d = aVarArr2;
                } else if (readTag == 40) {
                    this.f5246e = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 48) {
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 48);
                    int[] iArr = new int[repeatedFieldArrayLength2];
                    int i2 = 0;
                    for (int i3 = 0; i3 < repeatedFieldArrayLength2; i3++) {
                        if (i3 != 0) {
                            codedInputByteBufferNano.readTag();
                        }
                        int readInt32 = codedInputByteBufferNano.readInt32();
                        if (readInt32 == 1 || readInt32 == 2) {
                            iArr[i2] = readInt32;
                            i2++;
                        }
                    }
                    if (i2 != 0) {
                        int[] iArr2 = this.f5247f;
                        int length2 = iArr2 == null ? 0 : iArr2.length;
                        if (length2 == 0 && i2 == repeatedFieldArrayLength2) {
                            this.f5247f = iArr;
                        } else {
                            int[] iArr3 = new int[(length2 + i2)];
                            if (length2 != 0) {
                                System.arraycopy(iArr2, 0, iArr3, 0, length2);
                            }
                            System.arraycopy(iArr, 0, iArr3, length2, i2);
                            this.f5247f = iArr3;
                        }
                    }
                } else if (readTag == 50) {
                    int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                    int position = codedInputByteBufferNano.getPosition();
                    int i4 = 0;
                    while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                        int readInt322 = codedInputByteBufferNano.readInt32();
                        if (readInt322 == 1 || readInt322 == 2) {
                            i4++;
                        }
                    }
                    if (i4 != 0) {
                        codedInputByteBufferNano.rewindToPosition(position);
                        int[] iArr4 = this.f5247f;
                        int length3 = iArr4 == null ? 0 : iArr4.length;
                        int[] iArr5 = new int[(i4 + length3)];
                        if (length3 != 0) {
                            System.arraycopy(iArr4, 0, iArr5, 0, length3);
                        }
                        while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                            int readInt323 = codedInputByteBufferNano.readInt32();
                            if (readInt323 == 1 || readInt323 == 2) {
                                iArr5[length3] = readInt323;
                                length3++;
                            }
                        }
                        this.f5247f = iArr5;
                    }
                    codedInputByteBufferNano.popLimit(pushLimit);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeString(1, this.f5242a);
            codedOutputByteBufferNano.writeString(2, this.f5243b);
            codedOutputByteBufferNano.writeString(3, this.f5244c);
            C1958a[] aVarArr = this.f5245d;
            int i = 0;
            if (aVarArr != null && aVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C1958a[] aVarArr2 = this.f5245d;
                    if (i2 >= aVarArr2.length) {
                        break;
                    }
                    C1958a aVar = aVarArr2[i2];
                    if (aVar != null) {
                        codedOutputByteBufferNano.writeMessage(4, aVar);
                    }
                    i2++;
                }
            }
            codedOutputByteBufferNano.writeUInt64(5, this.f5246e);
            int[] iArr = this.f5247f;
            if (iArr != null && iArr.length > 0) {
                while (true) {
                    int[] iArr2 = this.f5247f;
                    if (i >= iArr2.length) {
                        break;
                    }
                    codedOutputByteBufferNano.writeInt32(6, iArr2[i]);
                    i++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C1956Df() {
        mo15633a();
    }

    /* renamed from: a */
    public C1956Df mo15633a() {
        this.f5239a = C1957a.m7026b();
        this.f5240b = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C1957a[] aVarArr = this.f5239a;
        int i = 0;
        if (aVarArr != null && aVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C1957a[] aVarArr2 = this.f5239a;
                if (i2 >= aVarArr2.length) {
                    break;
                }
                C1957a aVar = aVarArr2[i2];
                if (aVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, aVar);
                }
                i2++;
            }
        }
        String[] strArr = this.f5240b;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            String[] strArr2 = this.f5240b;
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
                C1957a[] aVarArr = this.f5239a;
                int length = aVarArr == null ? 0 : aVarArr.length;
                int i = repeatedFieldArrayLength + length;
                C1957a[] aVarArr2 = new C1957a[i];
                if (length != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                }
                while (length < i - 1) {
                    aVarArr2[length] = new C1957a();
                    codedInputByteBufferNano.readMessage(aVarArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                aVarArr2[length] = new C1957a();
                codedInputByteBufferNano.readMessage(aVarArr2[length]);
                this.f5239a = aVarArr2;
            } else if (readTag == 18) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                String[] strArr = this.f5240b;
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
                this.f5240b = strArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C1957a[] aVarArr = this.f5239a;
        int i = 0;
        if (aVarArr != null && aVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C1957a[] aVarArr2 = this.f5239a;
                if (i2 >= aVarArr2.length) {
                    break;
                }
                C1957a aVar = aVarArr2[i2];
                if (aVar != null) {
                    codedOutputByteBufferNano.writeMessage(1, aVar);
                }
                i2++;
            }
        }
        String[] strArr = this.f5240b;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f5240b;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(2, str);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
