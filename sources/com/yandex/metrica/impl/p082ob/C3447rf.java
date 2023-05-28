package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.InternalNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.rf */
public final class C3447rf extends MessageNano {

    /* renamed from: f */
    private static volatile C3447rf[] f9026f;

    /* renamed from: a */
    public String f9027a;

    /* renamed from: b */
    public int f9028b;

    /* renamed from: c */
    public String f9029c;

    /* renamed from: d */
    public boolean f9030d;

    /* renamed from: e */
    public long f9031e;

    public C3447rf() {
        mo18165a();
    }

    /* renamed from: b */
    public static C3447rf[] m10643b() {
        if (f9026f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f9026f == null) {
                    f9026f = new C3447rf[0];
                }
            }
        }
        return f9026f;
    }

    /* renamed from: a */
    public C3447rf mo18165a() {
        this.f9027a = "";
        this.f9028b = 0;
        this.f9029c = "";
        this.f9030d = false;
        this.f9031e = 0;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f9027a);
        int i = this.f9028b;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(2, i);
        }
        if (!this.f9029c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f9029c);
        }
        boolean z = this.f9030d;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z);
        }
        long j = this.f9031e;
        return j != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(5, j) : computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 10) {
                this.f9027a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.f9028b = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 26) {
                this.f9029c = codedInputByteBufferNano.readString();
            } else if (readTag == 32) {
                this.f9030d = codedInputByteBufferNano.readBool();
            } else if (readTag == 40) {
                this.f9031e = codedInputByteBufferNano.readUInt64();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f9027a);
        int i = this.f9028b;
        if (i != 0) {
            codedOutputByteBufferNano.writeSInt32(2, i);
        }
        if (!this.f9029c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f9029c);
        }
        boolean z = this.f9030d;
        if (z) {
            codedOutputByteBufferNano.writeBool(4, z);
        }
        long j = this.f9031e;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
