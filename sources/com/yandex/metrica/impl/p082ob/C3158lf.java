package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.InternalNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.lf */
public final class C3158lf extends MessageNano {

    /* renamed from: f */
    private static volatile C3158lf[] f8247f;

    /* renamed from: a */
    public String f8248a;

    /* renamed from: b */
    public String f8249b;

    /* renamed from: c */
    public C3099jf[] f8250c;

    /* renamed from: d */
    public C3158lf f8251d;

    /* renamed from: e */
    public C3158lf[] f8252e;

    public C3158lf() {
        mo17824a();
    }

    /* renamed from: a */
    public C3158lf mo17824a() {
        this.f8248a = "";
        this.f8249b = "";
        this.f8250c = C3099jf.m9840b();
        this.f8251d = null;
        if (f8247f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f8247f == null) {
                    f8247f = new C3158lf[0];
                }
            }
        }
        this.f8252e = f8247f;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f8248a);
        if (!this.f8249b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f8249b);
        }
        C3099jf[] jfVarArr = this.f8250c;
        int i = 0;
        if (jfVarArr != null && jfVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C3099jf[] jfVarArr2 = this.f8250c;
                if (i2 >= jfVarArr2.length) {
                    break;
                }
                C3099jf jfVar = jfVarArr2[i2];
                if (jfVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, jfVar);
                }
                i2++;
            }
        }
        C3158lf lfVar = this.f8251d;
        if (lfVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, lfVar);
        }
        C3158lf[] lfVarArr = this.f8252e;
        if (lfVarArr != null && lfVarArr.length > 0) {
            while (true) {
                C3158lf[] lfVarArr2 = this.f8252e;
                if (i >= lfVarArr2.length) {
                    break;
                }
                C3158lf lfVar2 = lfVarArr2[i];
                if (lfVar2 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, lfVar2);
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
                this.f8248a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f8249b = codedInputByteBufferNano.readString();
            } else if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C3099jf[] jfVarArr = this.f8250c;
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
                this.f8250c = jfVarArr2;
            } else if (readTag == 34) {
                if (this.f8251d == null) {
                    this.f8251d = new C3158lf();
                }
                codedInputByteBufferNano.readMessage(this.f8251d);
            } else if (readTag == 42) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                C3158lf[] lfVarArr = this.f8252e;
                int length2 = lfVarArr == null ? 0 : lfVarArr.length;
                int i2 = repeatedFieldArrayLength2 + length2;
                C3158lf[] lfVarArr2 = new C3158lf[i2];
                if (length2 != 0) {
                    System.arraycopy(lfVarArr, 0, lfVarArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    lfVarArr2[length2] = new C3158lf();
                    codedInputByteBufferNano.readMessage(lfVarArr2[length2]);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                lfVarArr2[length2] = new C3158lf();
                codedInputByteBufferNano.readMessage(lfVarArr2[length2]);
                this.f8252e = lfVarArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f8248a);
        if (!this.f8249b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f8249b);
        }
        C3099jf[] jfVarArr = this.f8250c;
        int i = 0;
        if (jfVarArr != null && jfVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C3099jf[] jfVarArr2 = this.f8250c;
                if (i2 >= jfVarArr2.length) {
                    break;
                }
                C3099jf jfVar = jfVarArr2[i2];
                if (jfVar != null) {
                    codedOutputByteBufferNano.writeMessage(3, jfVar);
                }
                i2++;
            }
        }
        C3158lf lfVar = this.f8251d;
        if (lfVar != null) {
            codedOutputByteBufferNano.writeMessage(4, lfVar);
        }
        C3158lf[] lfVarArr = this.f8252e;
        if (lfVarArr != null && lfVarArr.length > 0) {
            while (true) {
                C3158lf[] lfVarArr2 = this.f8252e;
                if (i >= lfVarArr2.length) {
                    break;
                }
                C3158lf lfVar2 = lfVarArr2[i];
                if (lfVar2 != null) {
                    codedOutputByteBufferNano.writeMessage(5, lfVar2);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
