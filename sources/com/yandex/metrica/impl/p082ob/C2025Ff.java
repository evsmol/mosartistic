package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.InternalNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Ff */
public final class C2025Ff extends MessageNano {

    /* renamed from: a */
    public C2026a[] f5412a;

    /* renamed from: b */
    public String f5413b;

    /* renamed from: c */
    public long f5414c;

    /* renamed from: d */
    public boolean f5415d;

    /* renamed from: e */
    public boolean f5416e;

    /* renamed from: com.yandex.metrica.impl.ob.Ff$a */
    public static final class C2026a extends MessageNano {

        /* renamed from: c */
        private static volatile C2026a[] f5417c;

        /* renamed from: a */
        public String f5418a;

        /* renamed from: b */
        public String[] f5419b;

        public C2026a() {
            mo15788a();
        }

        /* renamed from: b */
        public static C2026a[] m7212b() {
            if (f5417c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f5417c == null) {
                        f5417c = new C2026a[0];
                    }
                }
            }
            return f5417c;
        }

        /* renamed from: a */
        public C2026a mo15788a() {
            this.f5418a = "";
            this.f5419b = WireFormatNano.EMPTY_STRING_ARRAY;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f5418a);
            String[] strArr = this.f5419b;
            if (strArr == null || strArr.length <= 0) {
                return computeSerializedSize;
            }
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.f5419b;
                if (i >= strArr2.length) {
                    return computeSerializedSize + i2 + (i3 * 1);
                }
                String str = strArr2[i];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
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
                    this.f5418a = codedInputByteBufferNano.readString();
                } else if (readTag == 18) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                    String[] strArr = this.f5419b;
                    int length = strArr == null ? 0 : strArr.length;
                    int i = repeatedFieldArrayLength + length;
                    String[] strArr2 = new String[i];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.f5419b = strArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeString(1, this.f5418a);
            String[] strArr = this.f5419b;
            if (strArr != null && strArr.length > 0) {
                int i = 0;
                while (true) {
                    String[] strArr2 = this.f5419b;
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

    public C2025Ff() {
        mo15787a();
    }

    /* renamed from: a */
    public C2025Ff mo15787a() {
        this.f5412a = C2026a.m7212b();
        this.f5413b = "";
        this.f5414c = 0;
        this.f5415d = false;
        this.f5416e = false;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C2026a[] aVarArr = this.f5412a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                C2026a[] aVarArr2 = this.f5412a;
                if (i >= aVarArr2.length) {
                    break;
                }
                C2026a aVar = aVarArr2[i];
                if (aVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, aVar);
                }
                i++;
            }
        }
        return computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f5413b) + CodedOutputByteBufferNano.computeInt64Size(3, this.f5414c) + CodedOutputByteBufferNano.computeBoolSize(4, this.f5415d) + CodedOutputByteBufferNano.computeBoolSize(5, this.f5416e);
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C2026a[] aVarArr = this.f5412a;
                int length = aVarArr == null ? 0 : aVarArr.length;
                int i = repeatedFieldArrayLength + length;
                C2026a[] aVarArr2 = new C2026a[i];
                if (length != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                }
                while (length < i - 1) {
                    aVarArr2[length] = new C2026a();
                    codedInputByteBufferNano.readMessage(aVarArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                aVarArr2[length] = new C2026a();
                codedInputByteBufferNano.readMessage(aVarArr2[length]);
                this.f5412a = aVarArr2;
            } else if (readTag == 18) {
                this.f5413b = codedInputByteBufferNano.readString();
            } else if (readTag == 24) {
                this.f5414c = codedInputByteBufferNano.readInt64();
            } else if (readTag == 32) {
                this.f5415d = codedInputByteBufferNano.readBool();
            } else if (readTag == 40) {
                this.f5416e = codedInputByteBufferNano.readBool();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C2026a[] aVarArr = this.f5412a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                C2026a[] aVarArr2 = this.f5412a;
                if (i >= aVarArr2.length) {
                    break;
                }
                C2026a aVar = aVarArr2[i];
                if (aVar != null) {
                    codedOutputByteBufferNano.writeMessage(1, aVar);
                }
                i++;
            }
        }
        codedOutputByteBufferNano.writeString(2, this.f5413b);
        codedOutputByteBufferNano.writeInt64(3, this.f5414c);
        codedOutputByteBufferNano.writeBool(4, this.f5415d);
        codedOutputByteBufferNano.writeBool(5, this.f5416e);
        super.writeTo(codedOutputByteBufferNano);
    }
}
