package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.InternalNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.gf */
public final class C3000gf extends MessageNano {

    /* renamed from: k */
    private static byte[] f7906k;

    /* renamed from: l */
    private static volatile boolean f7907l;

    /* renamed from: a */
    public C3158lf f7908a;

    /* renamed from: b */
    public C2894df f7909b;

    /* renamed from: c */
    public String f7910c;

    /* renamed from: d */
    public int f7911d;

    /* renamed from: e */
    public C3099jf[] f7912e;

    /* renamed from: f */
    public int f7913f;

    /* renamed from: g */
    public C3001a f7914g;

    /* renamed from: h */
    public byte[] f7915h;

    /* renamed from: i */
    public byte[] f7916i;

    /* renamed from: j */
    public C2966ff[] f7917j;

    /* renamed from: com.yandex.metrica.impl.ob.gf$a */
    public static final class C3001a extends MessageNano {

        /* renamed from: a */
        public byte[] f7918a;

        /* renamed from: b */
        public C3061if f7919b;

        public C3001a() {
            mo17637a();
        }

        /* renamed from: a */
        public C3001a mo17637a() {
            this.f7918a = WireFormatNano.EMPTY_BYTES;
            this.f7919b = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!Arrays.equals(this.f7918a, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f7918a);
            }
            C3061if ifVar = this.f7919b;
            return ifVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, ifVar) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f7918a = codedInputByteBufferNano.readBytes();
                } else if (readTag == 18) {
                    if (this.f7919b == null) {
                        this.f7919b = new C3061if();
                    }
                    codedInputByteBufferNano.readMessage(this.f7919b);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!Arrays.equals(this.f7918a, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(1, this.f7918a);
            }
            C3061if ifVar = this.f7919b;
            if (ifVar != null) {
                codedOutputByteBufferNano.writeMessage(2, ifVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C3000gf() {
        if (!f7907l) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (!f7907l) {
                    f7906k = InternalNano.bytesDefaultValue("JVM");
                    f7907l = true;
                }
            }
        }
        mo17636a();
    }

    /* renamed from: a */
    public C3000gf mo17636a() {
        this.f7908a = null;
        this.f7909b = null;
        this.f7910c = "";
        this.f7911d = -1;
        this.f7912e = C3099jf.m9840b();
        this.f7913f = 0;
        this.f7914g = null;
        this.f7915h = (byte[]) f7906k.clone();
        this.f7916i = WireFormatNano.EMPTY_BYTES;
        this.f7917j = C2966ff.m9577b();
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3158lf lfVar = this.f7908a;
        if (lfVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, lfVar);
        }
        C2894df dfVar = this.f7909b;
        if (dfVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, dfVar);
        }
        if (!this.f7910c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f7910c);
        }
        int i = this.f7911d;
        if (i != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i);
        }
        C3099jf[] jfVarArr = this.f7912e;
        int i2 = 0;
        if (jfVarArr != null && jfVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                C3099jf[] jfVarArr2 = this.f7912e;
                if (i3 >= jfVarArr2.length) {
                    break;
                }
                C3099jf jfVar = jfVarArr2[i3];
                if (jfVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, jfVar);
                }
                i3++;
            }
        }
        int i4 = this.f7913f;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i4);
        }
        C3001a aVar = this.f7914g;
        if (aVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, aVar);
        }
        if (!Arrays.equals(this.f7915h, f7906k)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f7915h);
        }
        if (!Arrays.equals(this.f7916i, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f7916i);
        }
        C2966ff[] ffVarArr = this.f7917j;
        if (ffVarArr != null && ffVarArr.length > 0) {
            while (true) {
                C2966ff[] ffVarArr2 = this.f7917j;
                if (i2 >= ffVarArr2.length) {
                    break;
                }
                C2966ff ffVar = ffVarArr2[i2];
                if (ffVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(10, ffVar);
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    if (this.f7908a == null) {
                        this.f7908a = new C3158lf();
                    }
                    codedInputByteBufferNano.readMessage(this.f7908a);
                    continue;
                case 18:
                    if (this.f7909b == null) {
                        this.f7909b = new C2894df();
                    }
                    codedInputByteBufferNano.readMessage(this.f7909b);
                    continue;
                case 26:
                    this.f7910c = codedInputByteBufferNano.readString();
                    continue;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                        this.f7911d = readInt32;
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C3099jf[] jfVarArr = this.f7912e;
                    int length = jfVarArr == null ? 0 : jfVarArr.length;
                    int i = repeatedFieldArrayLength + length;
                    C3099jf[] jfVarArr2 = new C3099jf[i];
                    if (length != 0) {
                        System.arraycopy(jfVarArr, 0, jfVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jfVarArr2[length] = new C3099jf();
                        codedInputByteBufferNano.readMessage(jfVarArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    jfVarArr2[length] = new C3099jf();
                    codedInputByteBufferNano.readMessage(jfVarArr2[length]);
                    this.f7912e = jfVarArr2;
                    continue;
                case 48:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 == 0 || readInt322 == 1) {
                        this.f7913f = readInt322;
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (this.f7914g == null) {
                        this.f7914g = new C3001a();
                    }
                    codedInputByteBufferNano.readMessage(this.f7914g);
                    continue;
                case 66:
                    this.f7915h = codedInputByteBufferNano.readBytes();
                    continue;
                case 74:
                    this.f7916i = codedInputByteBufferNano.readBytes();
                    continue;
                case 82:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    C2966ff[] ffVarArr = this.f7917j;
                    int length2 = ffVarArr == null ? 0 : ffVarArr.length;
                    int i2 = repeatedFieldArrayLength2 + length2;
                    C2966ff[] ffVarArr2 = new C2966ff[i2];
                    if (length2 != 0) {
                        System.arraycopy(ffVarArr, 0, ffVarArr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        ffVarArr2[length2] = new C2966ff();
                        codedInputByteBufferNano.readMessage(ffVarArr2[length2]);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    ffVarArr2[length2] = new C2966ff();
                    codedInputByteBufferNano.readMessage(ffVarArr2[length2]);
                    this.f7917j = ffVarArr2;
                    continue;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    } else {
                        continue;
                    }
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3158lf lfVar = this.f7908a;
        if (lfVar != null) {
            codedOutputByteBufferNano.writeMessage(1, lfVar);
        }
        C2894df dfVar = this.f7909b;
        if (dfVar != null) {
            codedOutputByteBufferNano.writeMessage(2, dfVar);
        }
        if (!this.f7910c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f7910c);
        }
        int i = this.f7911d;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        C3099jf[] jfVarArr = this.f7912e;
        int i2 = 0;
        if (jfVarArr != null && jfVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                C3099jf[] jfVarArr2 = this.f7912e;
                if (i3 >= jfVarArr2.length) {
                    break;
                }
                C3099jf jfVar = jfVarArr2[i3];
                if (jfVar != null) {
                    codedOutputByteBufferNano.writeMessage(5, jfVar);
                }
                i3++;
            }
        }
        int i4 = this.f7913f;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(6, i4);
        }
        C3001a aVar = this.f7914g;
        if (aVar != null) {
            codedOutputByteBufferNano.writeMessage(7, aVar);
        }
        if (!Arrays.equals(this.f7915h, f7906k)) {
            codedOutputByteBufferNano.writeBytes(8, this.f7915h);
        }
        if (!Arrays.equals(this.f7916i, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(9, this.f7916i);
        }
        C2966ff[] ffVarArr = this.f7917j;
        if (ffVarArr != null && ffVarArr.length > 0) {
            while (true) {
                C2966ff[] ffVarArr2 = this.f7917j;
                if (i2 >= ffVarArr2.length) {
                    break;
                }
                C2966ff ffVar = ffVarArr2[i2];
                if (ffVar != null) {
                    codedOutputByteBufferNano.writeMessage(10, ffVar);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
