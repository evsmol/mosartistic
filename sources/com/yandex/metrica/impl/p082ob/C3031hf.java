package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.InternalNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.hf */
public final class C3031hf extends MessageNano {

    /* renamed from: l */
    private static byte[] f7974l;

    /* renamed from: m */
    private static volatile boolean f7975m;

    /* renamed from: a */
    public C3158lf f7976a;

    /* renamed from: b */
    public C2894df f7977b;

    /* renamed from: c */
    public String f7978c;

    /* renamed from: d */
    public int f7979d;

    /* renamed from: e */
    public C3099jf[] f7980e;

    /* renamed from: f */
    public String f7981f;

    /* renamed from: g */
    public int f7982g;

    /* renamed from: h */
    public C3032a f7983h;

    /* renamed from: i */
    public byte[] f7984i;

    /* renamed from: j */
    public byte[] f7985j;

    /* renamed from: k */
    public C2966ff[] f7986k;

    /* renamed from: com.yandex.metrica.impl.ob.hf$a */
    public static final class C3032a extends MessageNano {

        /* renamed from: a */
        public String f7987a;

        public C3032a() {
            mo17666a();
        }

        /* renamed from: a */
        public C3032a mo17666a() {
            this.f7987a = "";
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            return super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f7987a);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f7987a = codedInputByteBufferNano.readString();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeString(1, this.f7987a);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C3031hf() {
        if (!f7975m) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (!f7975m) {
                    f7974l = InternalNano.bytesDefaultValue("JVM");
                    f7975m = true;
                }
            }
        }
        mo17665a();
    }

    /* renamed from: a */
    public C3031hf mo17665a() {
        this.f7976a = null;
        this.f7977b = null;
        this.f7978c = "";
        this.f7979d = -1;
        this.f7980e = C3099jf.m9840b();
        this.f7981f = "";
        this.f7982g = 0;
        this.f7983h = null;
        this.f7984i = (byte[]) f7974l.clone();
        this.f7985j = WireFormatNano.EMPTY_BYTES;
        this.f7986k = C2966ff.m9577b();
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3158lf lfVar = this.f7976a;
        if (lfVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, lfVar);
        }
        C2894df dfVar = this.f7977b;
        if (dfVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, dfVar);
        }
        if (!this.f7978c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f7978c);
        }
        int i = this.f7979d;
        if (i != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i);
        }
        C3099jf[] jfVarArr = this.f7980e;
        int i2 = 0;
        if (jfVarArr != null && jfVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                C3099jf[] jfVarArr2 = this.f7980e;
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
        if (!this.f7981f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f7981f);
        }
        int i4 = this.f7982g;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i4);
        }
        C3032a aVar = this.f7983h;
        if (aVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, aVar);
        }
        if (!Arrays.equals(this.f7984i, f7974l)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f7984i);
        }
        if (!Arrays.equals(this.f7985j, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f7985j);
        }
        C2966ff[] ffVarArr = this.f7986k;
        if (ffVarArr != null && ffVarArr.length > 0) {
            while (true) {
                C2966ff[] ffVarArr2 = this.f7986k;
                if (i2 >= ffVarArr2.length) {
                    break;
                }
                C2966ff ffVar = ffVarArr2[i2];
                if (ffVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(11, ffVar);
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
                    if (this.f7976a == null) {
                        this.f7976a = new C3158lf();
                    }
                    codedInputByteBufferNano.readMessage(this.f7976a);
                    continue;
                case 18:
                    if (this.f7977b == null) {
                        this.f7977b = new C2894df();
                    }
                    codedInputByteBufferNano.readMessage(this.f7977b);
                    continue;
                case 26:
                    this.f7978c = codedInputByteBufferNano.readString();
                    continue;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                        this.f7979d = readInt32;
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C3099jf[] jfVarArr = this.f7980e;
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
                    this.f7980e = jfVarArr2;
                    continue;
                case 50:
                    this.f7981f = codedInputByteBufferNano.readString();
                    continue;
                case 56:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 == 0 || readInt322 == 1) {
                        this.f7982g = readInt322;
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (this.f7983h == null) {
                        this.f7983h = new C3032a();
                    }
                    codedInputByteBufferNano.readMessage(this.f7983h);
                    continue;
                case 74:
                    this.f7984i = codedInputByteBufferNano.readBytes();
                    continue;
                case 82:
                    this.f7985j = codedInputByteBufferNano.readBytes();
                    continue;
                case 90:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                    C2966ff[] ffVarArr = this.f7986k;
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
                    this.f7986k = ffVarArr2;
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
        C3158lf lfVar = this.f7976a;
        if (lfVar != null) {
            codedOutputByteBufferNano.writeMessage(1, lfVar);
        }
        C2894df dfVar = this.f7977b;
        if (dfVar != null) {
            codedOutputByteBufferNano.writeMessage(2, dfVar);
        }
        if (!this.f7978c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f7978c);
        }
        int i = this.f7979d;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        C3099jf[] jfVarArr = this.f7980e;
        int i2 = 0;
        if (jfVarArr != null && jfVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                C3099jf[] jfVarArr2 = this.f7980e;
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
        if (!this.f7981f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f7981f);
        }
        int i4 = this.f7982g;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i4);
        }
        C3032a aVar = this.f7983h;
        if (aVar != null) {
            codedOutputByteBufferNano.writeMessage(8, aVar);
        }
        if (!Arrays.equals(this.f7984i, f7974l)) {
            codedOutputByteBufferNano.writeBytes(9, this.f7984i);
        }
        if (!Arrays.equals(this.f7985j, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(10, this.f7985j);
        }
        C2966ff[] ffVarArr = this.f7986k;
        if (ffVarArr != null && ffVarArr.length > 0) {
            while (true) {
                C2966ff[] ffVarArr2 = this.f7986k;
                if (i2 >= ffVarArr2.length) {
                    break;
                }
                C2966ff ffVar = ffVarArr2[i2];
                if (ffVar != null) {
                    codedOutputByteBufferNano.writeMessage(11, ffVar);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
