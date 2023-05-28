package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.InternalNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.kf */
public final class C3128kf extends MessageNano {

    /* renamed from: g */
    private static volatile C3128kf[] f8188g;

    /* renamed from: a */
    public String f8189a;

    /* renamed from: b */
    public int f8190b;

    /* renamed from: c */
    public long f8191c;

    /* renamed from: d */
    public String f8192d;

    /* renamed from: e */
    public int f8193e;

    /* renamed from: f */
    public C3099jf[] f8194f;

    public C3128kf() {
        mo17781a();
    }

    /* renamed from: b */
    public static C3128kf[] m9904b() {
        if (f8188g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f8188g == null) {
                    f8188g = new C3128kf[0];
                }
            }
        }
        return f8188g;
    }

    /* renamed from: a */
    public C3128kf mo17781a() {
        this.f8189a = "";
        this.f8190b = 0;
        this.f8191c = 0;
        this.f8192d = "";
        this.f8193e = 0;
        this.f8194f = C3099jf.m9840b();
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f8189a) + CodedOutputByteBufferNano.computeSInt32Size(2, this.f8190b) + CodedOutputByteBufferNano.computeSInt64Size(3, this.f8191c);
        if (!this.f8192d.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f8192d);
        }
        int i = this.f8193e;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, i);
        }
        C3099jf[] jfVarArr = this.f8194f;
        if (jfVarArr != null && jfVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C3099jf[] jfVarArr2 = this.f8194f;
                if (i2 >= jfVarArr2.length) {
                    break;
                }
                C3099jf jfVar = jfVarArr2[i2];
                if (jfVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, jfVar);
                }
                i2++;
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
                this.f8189a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.f8190b = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 24) {
                this.f8191c = codedInputByteBufferNano.readSInt64();
            } else if (readTag == 34) {
                this.f8192d = codedInputByteBufferNano.readString();
            } else if (readTag == 40) {
                this.f8193e = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 50) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                C3099jf[] jfVarArr = this.f8194f;
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
                this.f8194f = jfVarArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f8189a);
        codedOutputByteBufferNano.writeSInt32(2, this.f8190b);
        codedOutputByteBufferNano.writeSInt64(3, this.f8191c);
        if (!this.f8192d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f8192d);
        }
        int i = this.f8193e;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i);
        }
        C3099jf[] jfVarArr = this.f8194f;
        if (jfVarArr != null && jfVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C3099jf[] jfVarArr2 = this.f8194f;
                if (i2 >= jfVarArr2.length) {
                    break;
                }
                C3099jf jfVar = jfVarArr2[i2];
                if (jfVar != null) {
                    codedOutputByteBufferNano.writeMessage(6, jfVar);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
