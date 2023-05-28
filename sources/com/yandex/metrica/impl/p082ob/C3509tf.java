package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.tf */
public final class C3509tf extends MessageNano {

    /* renamed from: a */
    public String f9153a;

    /* renamed from: b */
    public long f9154b;

    /* renamed from: c */
    public long f9155c;

    /* renamed from: d */
    public int f9156d;

    public C3509tf() {
        mo18234a();
    }

    /* renamed from: a */
    public C3509tf mo18234a() {
        this.f9153a = "";
        this.f9154b = 0;
        this.f9155c = 0;
        this.f9156d = 0;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f9153a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f9153a);
        }
        long j = this.f9154b;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j);
        }
        long j2 = this.f9155c;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j2);
        }
        int i = this.f9156d;
        return i != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(4, i) : computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 10) {
                this.f9153a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.f9154b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                this.f9155c = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 32) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f9156d = readInt32;
                }
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f9153a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f9153a);
        }
        long j = this.f9154b;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j);
        }
        long j2 = this.f9155c;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j2);
        }
        int i = this.f9156d;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: a */
    public static C3509tf m10734a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3509tf) MessageNano.mergeFrom(new C3509tf(), bArr);
    }
}
