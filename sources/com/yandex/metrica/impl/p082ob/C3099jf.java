package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.InternalNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.jf */
public final class C3099jf extends MessageNano {

    /* renamed from: g */
    private static volatile C3099jf[] f8168g;

    /* renamed from: a */
    public String f8169a;

    /* renamed from: b */
    public String f8170b;

    /* renamed from: c */
    public int f8171c;

    /* renamed from: d */
    public String f8172d;

    /* renamed from: e */
    public boolean f8173e;

    /* renamed from: f */
    public int f8174f;

    public C3099jf() {
        mo17766a();
    }

    /* renamed from: b */
    public static C3099jf[] m9840b() {
        if (f8168g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f8168g == null) {
                    f8168g = new C3099jf[0];
                }
            }
        }
        return f8168g;
    }

    /* renamed from: a */
    public C3099jf mo17766a() {
        this.f8169a = "";
        this.f8170b = "";
        this.f8171c = -1;
        this.f8172d = "";
        this.f8173e = false;
        this.f8174f = -1;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f8169a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f8169a);
        }
        if (!this.f8170b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f8170b);
        }
        int i = this.f8171c;
        if (i != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(3, i);
        }
        if (!this.f8172d.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f8172d);
        }
        boolean z = this.f8173e;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(5, z);
        }
        int i2 = this.f8174f;
        return i2 != -1 ? computeSerializedSize + CodedOutputByteBufferNano.computeSInt32Size(6, i2) : computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 10) {
                this.f8169a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f8170b = codedInputByteBufferNano.readString();
            } else if (readTag == 24) {
                this.f8171c = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 34) {
                this.f8172d = codedInputByteBufferNano.readString();
            } else if (readTag == 40) {
                this.f8173e = codedInputByteBufferNano.readBool();
            } else if (readTag == 48) {
                this.f8174f = codedInputByteBufferNano.readSInt32();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f8169a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f8169a);
        }
        if (!this.f8170b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f8170b);
        }
        int i = this.f8171c;
        if (i != -1) {
            codedOutputByteBufferNano.writeSInt32(3, i);
        }
        if (!this.f8172d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f8172d);
        }
        boolean z = this.f8173e;
        if (z) {
            codedOutputByteBufferNano.writeBool(5, z);
        }
        int i2 = this.f8174f;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeSInt32(6, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
