package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.InternalNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.pf */
public final class C3351pf extends MessageNano {

    /* renamed from: a */
    public C3353b[] f8565a;

    /* renamed from: b */
    public C3352a[] f8566b;

    /* renamed from: com.yandex.metrica.impl.ob.pf$a */
    public static final class C3352a extends MessageNano {

        /* renamed from: h */
        private static volatile C3352a[] f8567h;

        /* renamed from: a */
        public long f8568a;

        /* renamed from: b */
        public long f8569b;

        /* renamed from: c */
        public C3320of[] f8570c;

        /* renamed from: d */
        public C3447rf[] f8571d;

        /* renamed from: e */
        public long f8572e;

        /* renamed from: f */
        public int f8573f;

        /* renamed from: g */
        public int f8574g;

        public C3352a() {
            mo17945a();
        }

        /* renamed from: b */
        public static C3352a[] m10303b() {
            if (f8567h == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f8567h == null) {
                        f8567h = new C3352a[0];
                    }
                }
            }
            return f8567h;
        }

        /* renamed from: a */
        public C3352a mo17945a() {
            this.f8568a = 0;
            this.f8569b = 0;
            this.f8570c = C3320of.m10245b();
            this.f8571d = C3447rf.m10643b();
            this.f8572e = 0;
            this.f8573f = 0;
            this.f8574g = 0;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeUInt64Size(1, this.f8568a) + CodedOutputByteBufferNano.computeUInt64Size(2, this.f8569b);
            C3320of[] ofVarArr = this.f8570c;
            int i = 0;
            if (ofVarArr != null && ofVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C3320of[] ofVarArr2 = this.f8570c;
                    if (i2 >= ofVarArr2.length) {
                        break;
                    }
                    C3320of ofVar = ofVarArr2[i2];
                    if (ofVar != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, ofVar);
                    }
                    i2++;
                }
            }
            C3447rf[] rfVarArr = this.f8571d;
            if (rfVarArr != null && rfVarArr.length > 0) {
                while (true) {
                    C3447rf[] rfVarArr2 = this.f8571d;
                    if (i >= rfVarArr2.length) {
                        break;
                    }
                    C3447rf rfVar = rfVarArr2[i];
                    if (rfVar != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, rfVar);
                    }
                    i++;
                }
            }
            long j = this.f8572e;
            if (j != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(5, j);
            }
            int i3 = this.f8573f;
            if (i3 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i3);
            }
            int i4 = this.f8574g;
            return i4 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(7, i4) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f8568a = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 16) {
                    this.f8569b = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 26) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    C3320of[] ofVarArr = this.f8570c;
                    int length = ofVarArr == null ? 0 : ofVarArr.length;
                    int i = repeatedFieldArrayLength + length;
                    C3320of[] ofVarArr2 = new C3320of[i];
                    if (length != 0) {
                        System.arraycopy(ofVarArr, 0, ofVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        ofVarArr2[length] = new C3320of();
                        codedInputByteBufferNano.readMessage(ofVarArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    ofVarArr2[length] = new C3320of();
                    codedInputByteBufferNano.readMessage(ofVarArr2[length]);
                    this.f8570c = ofVarArr2;
                } else if (readTag == 34) {
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                    C3447rf[] rfVarArr = this.f8571d;
                    int length2 = rfVarArr == null ? 0 : rfVarArr.length;
                    int i2 = repeatedFieldArrayLength2 + length2;
                    C3447rf[] rfVarArr2 = new C3447rf[i2];
                    if (length2 != 0) {
                        System.arraycopy(rfVarArr, 0, rfVarArr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        rfVarArr2[length2] = new C3447rf();
                        codedInputByteBufferNano.readMessage(rfVarArr2[length2]);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    rfVarArr2[length2] = new C3447rf();
                    codedInputByteBufferNano.readMessage(rfVarArr2[length2]);
                    this.f8571d = rfVarArr2;
                } else if (readTag == 40) {
                    this.f8572e = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 48) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 4) {
                        this.f8573f = readInt32;
                    }
                } else if (readTag == 56) {
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 == 0 || readInt322 == 1 || readInt322 == 2 || readInt322 == 3) {
                        this.f8574g = readInt322;
                    }
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeUInt64(1, this.f8568a);
            codedOutputByteBufferNano.writeUInt64(2, this.f8569b);
            C3320of[] ofVarArr = this.f8570c;
            int i = 0;
            if (ofVarArr != null && ofVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C3320of[] ofVarArr2 = this.f8570c;
                    if (i2 >= ofVarArr2.length) {
                        break;
                    }
                    C3320of ofVar = ofVarArr2[i2];
                    if (ofVar != null) {
                        codedOutputByteBufferNano.writeMessage(3, ofVar);
                    }
                    i2++;
                }
            }
            C3447rf[] rfVarArr = this.f8571d;
            if (rfVarArr != null && rfVarArr.length > 0) {
                while (true) {
                    C3447rf[] rfVarArr2 = this.f8571d;
                    if (i >= rfVarArr2.length) {
                        break;
                    }
                    C3447rf rfVar = rfVarArr2[i];
                    if (rfVar != null) {
                        codedOutputByteBufferNano.writeMessage(4, rfVar);
                    }
                    i++;
                }
            }
            long j = this.f8572e;
            if (j != 0) {
                codedOutputByteBufferNano.writeUInt64(5, j);
            }
            int i3 = this.f8573f;
            if (i3 != 0) {
                codedOutputByteBufferNano.writeInt32(6, i3);
            }
            int i4 = this.f8574g;
            if (i4 != 0) {
                codedOutputByteBufferNano.writeInt32(7, i4);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pf$b */
    public static final class C3353b extends MessageNano {

        /* renamed from: n */
        private static volatile C3353b[] f8575n;

        /* renamed from: a */
        public long f8576a;

        /* renamed from: b */
        public long f8577b;

        /* renamed from: c */
        public long f8578c;

        /* renamed from: d */
        public double f8579d;

        /* renamed from: e */
        public double f8580e;

        /* renamed from: f */
        public int f8581f;

        /* renamed from: g */
        public int f8582g;

        /* renamed from: h */
        public int f8583h;

        /* renamed from: i */
        public int f8584i;

        /* renamed from: j */
        public int f8585j;

        /* renamed from: k */
        public int f8586k;

        /* renamed from: l */
        public long f8587l;

        /* renamed from: m */
        public int f8588m;

        public C3353b() {
            mo17946a();
        }

        /* renamed from: b */
        public static C3353b[] m10305b() {
            if (f8575n == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f8575n == null) {
                        f8575n = new C3353b[0];
                    }
                }
            }
            return f8575n;
        }

        /* renamed from: a */
        public C3353b mo17946a() {
            this.f8576a = 0;
            this.f8577b = 0;
            this.f8578c = 0;
            this.f8579d = 0.0d;
            this.f8580e = 0.0d;
            this.f8581f = 0;
            this.f8582g = 0;
            this.f8583h = 0;
            this.f8584i = 0;
            this.f8585j = 0;
            this.f8586k = 0;
            this.f8587l = 0;
            this.f8588m = 0;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeUInt64Size(1, this.f8576a) + CodedOutputByteBufferNano.computeUInt64Size(2, this.f8577b);
            long j = this.f8578c;
            if (j != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j);
            }
            int computeDoubleSize = computeSerializedSize + CodedOutputByteBufferNano.computeDoubleSize(4, this.f8579d) + CodedOutputByteBufferNano.computeDoubleSize(5, this.f8580e);
            int i = this.f8581f;
            if (i != 0) {
                computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(6, i);
            }
            int i2 = this.f8582g;
            if (i2 != 0) {
                computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(7, i2);
            }
            int i3 = this.f8583h;
            if (i3 != 0) {
                computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(8, i3);
            }
            int i4 = this.f8584i;
            if (i4 != 0) {
                computeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(9, i4);
            }
            int i5 = this.f8585j;
            if (i5 != 0) {
                computeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(10, i5);
            }
            int i6 = this.f8586k;
            if (i6 != 0) {
                computeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(11, i6);
            }
            long j2 = this.f8587l;
            if (j2 != 0) {
                computeDoubleSize += CodedOutputByteBufferNano.computeUInt64Size(12, j2);
            }
            int i7 = this.f8588m;
            return i7 != 0 ? computeDoubleSize + CodedOutputByteBufferNano.computeInt32Size(13, i7) : computeDoubleSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                switch (readTag) {
                    case 0:
                        break;
                    case 8:
                        this.f8576a = codedInputByteBufferNano.readUInt64();
                        continue;
                    case 16:
                        this.f8577b = codedInputByteBufferNano.readUInt64();
                        continue;
                    case 24:
                        this.f8578c = codedInputByteBufferNano.readUInt64();
                        continue;
                    case 33:
                        this.f8579d = codedInputByteBufferNano.readDouble();
                        continue;
                    case 41:
                        this.f8580e = codedInputByteBufferNano.readDouble();
                        continue;
                    case 48:
                        this.f8581f = codedInputByteBufferNano.readUInt32();
                        continue;
                    case 56:
                        this.f8582g = codedInputByteBufferNano.readUInt32();
                        continue;
                    case 64:
                        this.f8583h = codedInputByteBufferNano.readUInt32();
                        continue;
                    case 72:
                        this.f8584i = codedInputByteBufferNano.readInt32();
                        continue;
                    case 80:
                        int readInt32 = codedInputByteBufferNano.readInt32();
                        if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                            this.f8585j = readInt32;
                            break;
                        } else {
                            continue;
                        }
                    case 88:
                        int readInt322 = codedInputByteBufferNano.readInt32();
                        if (readInt322 == 0 || readInt322 == 1 || readInt322 == 2 || readInt322 == 3) {
                            this.f8586k = readInt322;
                            break;
                        } else {
                            continue;
                        }
                    case 96:
                        this.f8587l = codedInputByteBufferNano.readUInt64();
                        continue;
                    case 104:
                        int readInt323 = codedInputByteBufferNano.readInt32();
                        if (readInt323 == 0 || readInt323 == 1 || readInt323 == 2 || readInt323 == 3 || readInt323 == 4) {
                            this.f8588m = readInt323;
                            break;
                        } else {
                            continue;
                        }
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
            codedOutputByteBufferNano.writeUInt64(1, this.f8576a);
            codedOutputByteBufferNano.writeUInt64(2, this.f8577b);
            long j = this.f8578c;
            if (j != 0) {
                codedOutputByteBufferNano.writeUInt64(3, j);
            }
            codedOutputByteBufferNano.writeDouble(4, this.f8579d);
            codedOutputByteBufferNano.writeDouble(5, this.f8580e);
            int i = this.f8581f;
            if (i != 0) {
                codedOutputByteBufferNano.writeUInt32(6, i);
            }
            int i2 = this.f8582g;
            if (i2 != 0) {
                codedOutputByteBufferNano.writeUInt32(7, i2);
            }
            int i3 = this.f8583h;
            if (i3 != 0) {
                codedOutputByteBufferNano.writeUInt32(8, i3);
            }
            int i4 = this.f8584i;
            if (i4 != 0) {
                codedOutputByteBufferNano.writeInt32(9, i4);
            }
            int i5 = this.f8585j;
            if (i5 != 0) {
                codedOutputByteBufferNano.writeInt32(10, i5);
            }
            int i6 = this.f8586k;
            if (i6 != 0) {
                codedOutputByteBufferNano.writeInt32(11, i6);
            }
            long j2 = this.f8587l;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(12, j2);
            }
            int i7 = this.f8588m;
            if (i7 != 0) {
                codedOutputByteBufferNano.writeInt32(13, i7);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C3351pf() {
        mo17944a();
    }

    /* renamed from: a */
    public C3351pf mo17944a() {
        this.f8565a = C3353b.m10305b();
        this.f8566b = C3352a.m10303b();
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3353b[] bVarArr = this.f8565a;
        int i = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C3353b[] bVarArr2 = this.f8565a;
                if (i2 >= bVarArr2.length) {
                    break;
                }
                C3353b bVar = bVarArr2[i2];
                if (bVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, bVar);
                }
                i2++;
            }
        }
        C3352a[] aVarArr = this.f8566b;
        if (aVarArr != null && aVarArr.length > 0) {
            while (true) {
                C3352a[] aVarArr2 = this.f8566b;
                if (i >= aVarArr2.length) {
                    break;
                }
                C3352a aVar = aVarArr2[i];
                if (aVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, aVar);
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
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C3353b[] bVarArr = this.f8565a;
                int length = bVarArr == null ? 0 : bVarArr.length;
                int i = repeatedFieldArrayLength + length;
                C3353b[] bVarArr2 = new C3353b[i];
                if (length != 0) {
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                }
                while (length < i - 1) {
                    bVarArr2[length] = new C3353b();
                    codedInputByteBufferNano.readMessage(bVarArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                bVarArr2[length] = new C3353b();
                codedInputByteBufferNano.readMessage(bVarArr2[length]);
                this.f8565a = bVarArr2;
            } else if (readTag == 18) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C3352a[] aVarArr = this.f8566b;
                int length2 = aVarArr == null ? 0 : aVarArr.length;
                int i2 = repeatedFieldArrayLength2 + length2;
                C3352a[] aVarArr2 = new C3352a[i2];
                if (length2 != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    aVarArr2[length2] = new C3352a();
                    codedInputByteBufferNano.readMessage(aVarArr2[length2]);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                aVarArr2[length2] = new C3352a();
                codedInputByteBufferNano.readMessage(aVarArr2[length2]);
                this.f8566b = aVarArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3353b[] bVarArr = this.f8565a;
        int i = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C3353b[] bVarArr2 = this.f8565a;
                if (i2 >= bVarArr2.length) {
                    break;
                }
                C3353b bVar = bVarArr2[i2];
                if (bVar != null) {
                    codedOutputByteBufferNano.writeMessage(1, bVar);
                }
                i2++;
            }
        }
        C3352a[] aVarArr = this.f8566b;
        if (aVarArr != null && aVarArr.length > 0) {
            while (true) {
                C3352a[] aVarArr2 = this.f8566b;
                if (i >= aVarArr2.length) {
                    break;
                }
                C3352a aVar = aVarArr2[i];
                if (aVar != null) {
                    codedOutputByteBufferNano.writeMessage(2, aVar);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
