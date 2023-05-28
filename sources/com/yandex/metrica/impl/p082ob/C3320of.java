package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.InternalNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.of */
public final class C3320of extends MessageNano {

    /* renamed from: q */
    private static volatile C3320of[] f8520q;

    /* renamed from: a */
    public int f8521a;

    /* renamed from: b */
    public int f8522b;

    /* renamed from: c */
    public int f8523c;

    /* renamed from: d */
    public int f8524d;

    /* renamed from: e */
    public int f8525e;

    /* renamed from: f */
    public String f8526f;

    /* renamed from: g */
    public boolean f8527g;

    /* renamed from: h */
    public int f8528h;

    /* renamed from: i */
    public int f8529i;

    /* renamed from: j */
    public long f8530j;

    /* renamed from: k */
    public int f8531k;

    /* renamed from: l */
    public int f8532l;

    /* renamed from: m */
    public int f8533m;

    /* renamed from: n */
    public int f8534n;

    /* renamed from: o */
    public int f8535o;

    /* renamed from: p */
    public int f8536p;

    public C3320of() {
        mo17920a();
    }

    /* renamed from: b */
    public static C3320of[] m10245b() {
        if (f8520q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f8520q == null) {
                    f8520q = new C3320of[0];
                }
            }
        }
        return f8520q;
    }

    /* renamed from: a */
    public C3320of mo17920a() {
        this.f8521a = -1;
        this.f8522b = 0;
        this.f8523c = -1;
        this.f8524d = -1;
        this.f8525e = -1;
        this.f8526f = "";
        this.f8527g = false;
        this.f8528h = 0;
        this.f8529i = -1;
        this.f8530j = 0;
        this.f8531k = Integer.MAX_VALUE;
        this.f8532l = Integer.MAX_VALUE;
        this.f8533m = Integer.MAX_VALUE;
        this.f8534n = -1;
        this.f8535o = -1;
        this.f8536p = -1;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f8521a;
        if (i != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
        }
        int i2 = this.f8522b;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(2, i2);
        }
        int i3 = this.f8523c;
        if (i3 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i3);
        }
        int i4 = this.f8524d;
        if (i4 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(4, i4);
        }
        int i5 = this.f8525e;
        if (i5 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, i5);
        }
        if (!this.f8526f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f8526f);
        }
        boolean z = this.f8527g;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(7, z);
        }
        int i6 = this.f8528h;
        if (i6 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(8, i6);
        }
        int i7 = this.f8529i;
        if (i7 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(9, i7);
        }
        long j = this.f8530j;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(10, j);
        }
        int i8 = this.f8531k;
        if (i8 != Integer.MAX_VALUE) {
            computeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(11, i8);
        }
        int i9 = this.f8532l;
        if (i9 != Integer.MAX_VALUE) {
            computeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(12, i9);
        }
        int i10 = this.f8533m;
        if (i10 != Integer.MAX_VALUE) {
            computeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(13, i10);
        }
        int i11 = this.f8534n;
        if (i11 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(14, i11);
        }
        int i12 = this.f8535o;
        if (i12 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(15, i12);
        }
        int i13 = this.f8536p;
        return i13 != -1 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(16, i13) : computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 8:
                    this.f8521a = codedInputByteBufferNano.readUInt32();
                    continue;
                case 16:
                    this.f8522b = codedInputByteBufferNano.readSInt32();
                    continue;
                case 24:
                    this.f8523c = codedInputByteBufferNano.readUInt32();
                    continue;
                case 32:
                    this.f8524d = codedInputByteBufferNano.readUInt32();
                    continue;
                case 40:
                    this.f8525e = codedInputByteBufferNano.readUInt32();
                    continue;
                case 50:
                    this.f8526f = codedInputByteBufferNano.readString();
                    continue;
                case 56:
                    this.f8527g = codedInputByteBufferNano.readBool();
                    continue;
                case 64:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 4) {
                        this.f8528h = readInt32;
                        break;
                    } else {
                        continue;
                    }
                case 72:
                    this.f8529i = codedInputByteBufferNano.readUInt32();
                    continue;
                case 80:
                    this.f8530j = codedInputByteBufferNano.readUInt64();
                    continue;
                case 88:
                    this.f8531k = codedInputByteBufferNano.readSInt32();
                    continue;
                case 96:
                    this.f8532l = codedInputByteBufferNano.readSInt32();
                    continue;
                case 104:
                    this.f8533m = codedInputByteBufferNano.readSInt32();
                    continue;
                case 112:
                    this.f8534n = codedInputByteBufferNano.readUInt32();
                    continue;
                case 120:
                    this.f8535o = codedInputByteBufferNano.readUInt32();
                    continue;
                case 128:
                    this.f8536p = codedInputByteBufferNano.readUInt32();
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
        int i = this.f8521a;
        if (i != -1) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        int i2 = this.f8522b;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeSInt32(2, i2);
        }
        int i3 = this.f8523c;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeUInt32(3, i3);
        }
        int i4 = this.f8524d;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeUInt32(4, i4);
        }
        int i5 = this.f8525e;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeUInt32(5, i5);
        }
        if (!this.f8526f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f8526f);
        }
        boolean z = this.f8527g;
        if (z) {
            codedOutputByteBufferNano.writeBool(7, z);
        }
        int i6 = this.f8528h;
        if (i6 != 0) {
            codedOutputByteBufferNano.writeInt32(8, i6);
        }
        int i7 = this.f8529i;
        if (i7 != -1) {
            codedOutputByteBufferNano.writeUInt32(9, i7);
        }
        long j = this.f8530j;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(10, j);
        }
        int i8 = this.f8531k;
        if (i8 != Integer.MAX_VALUE) {
            codedOutputByteBufferNano.writeSInt32(11, i8);
        }
        int i9 = this.f8532l;
        if (i9 != Integer.MAX_VALUE) {
            codedOutputByteBufferNano.writeSInt32(12, i9);
        }
        int i10 = this.f8533m;
        if (i10 != Integer.MAX_VALUE) {
            codedOutputByteBufferNano.writeSInt32(13, i10);
        }
        int i11 = this.f8534n;
        if (i11 != -1) {
            codedOutputByteBufferNano.writeUInt32(14, i11);
        }
        int i12 = this.f8535o;
        if (i12 != -1) {
            codedOutputByteBufferNano.writeUInt32(15, i12);
        }
        int i13 = this.f8536p;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeUInt32(16, i13);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
