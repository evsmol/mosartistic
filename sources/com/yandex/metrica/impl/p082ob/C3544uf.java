package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.uf */
public final class C3544uf extends MessageNano {

    /* renamed from: a */
    public int f9206a;

    /* renamed from: b */
    public double f9207b;

    /* renamed from: c */
    public byte[] f9208c;

    /* renamed from: d */
    public byte[] f9209d;

    /* renamed from: e */
    public byte[] f9210e;

    /* renamed from: f */
    public C3545a f9211f;

    /* renamed from: g */
    public long f9212g;

    /* renamed from: h */
    public boolean f9213h;

    /* renamed from: i */
    public int f9214i;

    /* renamed from: j */
    public int f9215j;

    /* renamed from: k */
    public C3549c f9216k;

    /* renamed from: l */
    public C3546b f9217l;

    /* renamed from: com.yandex.metrica.impl.ob.uf$a */
    public static final class C3545a extends MessageNano {

        /* renamed from: a */
        public byte[] f9218a;

        /* renamed from: b */
        public byte[] f9219b;

        public C3545a() {
            mo18265a();
        }

        /* renamed from: a */
        public C3545a mo18265a() {
            byte[] bArr = WireFormatNano.EMPTY_BYTES;
            this.f9218a = bArr;
            this.f9219b = bArr;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!Arrays.equals(this.f9218a, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f9218a);
            }
            return !Arrays.equals(this.f9219b, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f9219b) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f9218a = codedInputByteBufferNano.readBytes();
                } else if (readTag == 18) {
                    this.f9219b = codedInputByteBufferNano.readBytes();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!Arrays.equals(this.f9218a, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(1, this.f9218a);
            }
            if (!Arrays.equals(this.f9219b, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(2, this.f9219b);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.uf$b */
    public static final class C3546b extends MessageNano {

        /* renamed from: a */
        public boolean f9220a;

        /* renamed from: b */
        public C3548b f9221b;

        /* renamed from: c */
        public C3547a f9222c;

        /* renamed from: com.yandex.metrica.impl.ob.uf$b$a */
        public static final class C3547a extends MessageNano {

            /* renamed from: a */
            public long f9223a;

            /* renamed from: b */
            public C3548b f9224b;

            /* renamed from: c */
            public int f9225c;

            /* renamed from: d */
            public byte[] f9226d;

            public C3547a() {
                mo18267a();
            }

            /* renamed from: a */
            public C3547a mo18267a() {
                this.f9223a = 0;
                this.f9224b = null;
                this.f9225c = 0;
                this.f9226d = WireFormatNano.EMPTY_BYTES;
                this.cachedSize = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            public int computeSerializedSize() {
                int computeSerializedSize = super.computeSerializedSize();
                long j = this.f9223a;
                if (j != 0) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
                }
                C3548b bVar = this.f9224b;
                if (bVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, bVar);
                }
                int i = this.f9225c;
                if (i != 0) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i);
                }
                return !Arrays.equals(this.f9226d, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(4, this.f9226d) : computeSerializedSize;
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                while (true) {
                    int readTag = codedInputByteBufferNano.readTag();
                    if (readTag == 0) {
                        break;
                    } else if (readTag == 8) {
                        this.f9223a = codedInputByteBufferNano.readInt64();
                    } else if (readTag == 18) {
                        if (this.f9224b == null) {
                            this.f9224b = new C3548b();
                        }
                        codedInputByteBufferNano.readMessage(this.f9224b);
                    } else if (readTag == 24) {
                        this.f9225c = codedInputByteBufferNano.readUInt32();
                    } else if (readTag == 34) {
                        this.f9226d = codedInputByteBufferNano.readBytes();
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    }
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                long j = this.f9223a;
                if (j != 0) {
                    codedOutputByteBufferNano.writeInt64(1, j);
                }
                C3548b bVar = this.f9224b;
                if (bVar != null) {
                    codedOutputByteBufferNano.writeMessage(2, bVar);
                }
                int i = this.f9225c;
                if (i != 0) {
                    codedOutputByteBufferNano.writeUInt32(3, i);
                }
                if (!Arrays.equals(this.f9226d, WireFormatNano.EMPTY_BYTES)) {
                    codedOutputByteBufferNano.writeBytes(4, this.f9226d);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.uf$b$b */
        public static final class C3548b extends MessageNano {

            /* renamed from: a */
            public int f9227a;

            /* renamed from: b */
            public int f9228b;

            public C3548b() {
                mo18268a();
            }

            /* renamed from: a */
            public C3548b mo18268a() {
                this.f9227a = 0;
                this.f9228b = 0;
                this.cachedSize = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            public int computeSerializedSize() {
                int computeSerializedSize = super.computeSerializedSize();
                int i = this.f9227a;
                if (i != 0) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
                }
                int i2 = this.f9228b;
                return i2 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i2) : computeSerializedSize;
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                while (true) {
                    int readTag = codedInputByteBufferNano.readTag();
                    if (readTag == 0) {
                        break;
                    } else if (readTag == 8) {
                        this.f9227a = codedInputByteBufferNano.readUInt32();
                    } else if (readTag == 16) {
                        int readInt32 = codedInputByteBufferNano.readInt32();
                        if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 4) {
                            this.f9228b = readInt32;
                        }
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    }
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                int i = this.f9227a;
                if (i != 0) {
                    codedOutputByteBufferNano.writeUInt32(1, i);
                }
                int i2 = this.f9228b;
                if (i2 != 0) {
                    codedOutputByteBufferNano.writeInt32(2, i2);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public C3546b() {
            mo18266a();
        }

        /* renamed from: a */
        public C3546b mo18266a() {
            this.f9220a = false;
            this.f9221b = null;
            this.f9222c = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            boolean z = this.f9220a;
            if (z) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
            }
            C3548b bVar = this.f9221b;
            if (bVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, bVar);
            }
            C3547a aVar = this.f9222c;
            return aVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, aVar) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f9220a = codedInputByteBufferNano.readBool();
                } else if (readTag == 18) {
                    if (this.f9221b == null) {
                        this.f9221b = new C3548b();
                    }
                    codedInputByteBufferNano.readMessage(this.f9221b);
                } else if (readTag == 26) {
                    if (this.f9222c == null) {
                        this.f9222c = new C3547a();
                    }
                    codedInputByteBufferNano.readMessage(this.f9222c);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            boolean z = this.f9220a;
            if (z) {
                codedOutputByteBufferNano.writeBool(1, z);
            }
            C3548b bVar = this.f9221b;
            if (bVar != null) {
                codedOutputByteBufferNano.writeMessage(2, bVar);
            }
            C3547a aVar = this.f9222c;
            if (aVar != null) {
                codedOutputByteBufferNano.writeMessage(3, aVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.uf$c */
    public static final class C3549c extends MessageNano {

        /* renamed from: a */
        public byte[] f9229a;

        /* renamed from: b */
        public long f9230b;

        /* renamed from: c */
        public int f9231c;

        /* renamed from: d */
        public byte[] f9232d;

        /* renamed from: e */
        public long f9233e;

        public C3549c() {
            mo18269a();
        }

        /* renamed from: a */
        public C3549c mo18269a() {
            byte[] bArr = WireFormatNano.EMPTY_BYTES;
            this.f9229a = bArr;
            this.f9230b = 0;
            this.f9231c = 0;
            this.f9232d = bArr;
            this.f9233e = 0;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!Arrays.equals(this.f9229a, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f9229a);
            }
            long j = this.f9230b;
            if (j != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j);
            }
            int i = this.f9231c;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i);
            }
            if (!Arrays.equals(this.f9232d, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f9232d);
            }
            long j2 = this.f9233e;
            return j2 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(5, j2) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f9229a = codedInputByteBufferNano.readBytes();
                } else if (readTag == 16) {
                    this.f9230b = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 24) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                        this.f9231c = readInt32;
                    }
                } else if (readTag == 34) {
                    this.f9232d = codedInputByteBufferNano.readBytes();
                } else if (readTag == 40) {
                    this.f9233e = codedInputByteBufferNano.readUInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!Arrays.equals(this.f9229a, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(1, this.f9229a);
            }
            long j = this.f9230b;
            if (j != 0) {
                codedOutputByteBufferNano.writeUInt64(2, j);
            }
            int i = this.f9231c;
            if (i != 0) {
                codedOutputByteBufferNano.writeInt32(3, i);
            }
            if (!Arrays.equals(this.f9232d, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(4, this.f9232d);
            }
            long j2 = this.f9233e;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(5, j2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C3544uf() {
        mo18264a();
    }

    /* renamed from: a */
    public C3544uf mo18264a() {
        this.f9206a = 1;
        this.f9207b = 0.0d;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f9208c = bArr;
        this.f9209d = bArr;
        this.f9210e = bArr;
        this.f9211f = null;
        this.f9212g = 0;
        this.f9213h = false;
        this.f9214i = 0;
        this.f9215j = 1;
        this.f9216k = null;
        this.f9217l = null;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f9206a;
        if (i != 1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
        }
        if (Double.doubleToLongBits(this.f9207b) != Double.doubleToLongBits(0.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f9207b);
        }
        int computeBytesSize = computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(3, this.f9208c);
        if (!Arrays.equals(this.f9209d, WireFormatNano.EMPTY_BYTES)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f9209d);
        }
        if (!Arrays.equals(this.f9210e, WireFormatNano.EMPTY_BYTES)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f9210e);
        }
        C3545a aVar = this.f9211f;
        if (aVar != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, aVar);
        }
        long j = this.f9212g;
        if (j != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j);
        }
        boolean z = this.f9213h;
        if (z) {
            computeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z);
        }
        int i2 = this.f9214i;
        if (i2 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i2);
        }
        int i3 = this.f9215j;
        if (i3 != 1) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i3);
        }
        C3549c cVar = this.f9216k;
        if (cVar != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, cVar);
        }
        C3546b bVar = this.f9217l;
        return bVar != null ? computeBytesSize + CodedOutputByteBufferNano.computeMessageSize(12, bVar) : computeBytesSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 8:
                    this.f9206a = codedInputByteBufferNano.readUInt32();
                    continue;
                case 17:
                    this.f9207b = codedInputByteBufferNano.readDouble();
                    continue;
                case 26:
                    this.f9208c = codedInputByteBufferNano.readBytes();
                    continue;
                case 34:
                    this.f9209d = codedInputByteBufferNano.readBytes();
                    continue;
                case 42:
                    this.f9210e = codedInputByteBufferNano.readBytes();
                    continue;
                case 50:
                    if (this.f9211f == null) {
                        this.f9211f = new C3545a();
                    }
                    codedInputByteBufferNano.readMessage(this.f9211f);
                    continue;
                case 56:
                    this.f9212g = codedInputByteBufferNano.readInt64();
                    continue;
                case 64:
                    this.f9213h = codedInputByteBufferNano.readBool();
                    continue;
                case 72:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                        this.f9214i = readInt32;
                        break;
                    } else {
                        continue;
                    }
                case 80:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 == 1 || readInt322 == 2) {
                        this.f9215j = readInt322;
                        break;
                    } else {
                        continue;
                    }
                case 90:
                    if (this.f9216k == null) {
                        this.f9216k = new C3549c();
                    }
                    codedInputByteBufferNano.readMessage(this.f9216k);
                    continue;
                case 98:
                    if (this.f9217l == null) {
                        this.f9217l = new C3546b();
                    }
                    codedInputByteBufferNano.readMessage(this.f9217l);
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
        int i = this.f9206a;
        if (i != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        if (Double.doubleToLongBits(this.f9207b) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f9207b);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f9208c);
        if (!Arrays.equals(this.f9209d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f9209d);
        }
        if (!Arrays.equals(this.f9210e, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(5, this.f9210e);
        }
        C3545a aVar = this.f9211f;
        if (aVar != null) {
            codedOutputByteBufferNano.writeMessage(6, aVar);
        }
        long j = this.f9212g;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(7, j);
        }
        boolean z = this.f9213h;
        if (z) {
            codedOutputByteBufferNano.writeBool(8, z);
        }
        int i2 = this.f9214i;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i2);
        }
        int i3 = this.f9215j;
        if (i3 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i3);
        }
        C3549c cVar = this.f9216k;
        if (cVar != null) {
            codedOutputByteBufferNano.writeMessage(11, cVar);
        }
        C3546b bVar = this.f9217l;
        if (bVar != null) {
            codedOutputByteBufferNano.writeMessage(12, bVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
