package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.InternalNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.vf */
public final class C3586vf extends MessageNano {

    /* renamed from: a */
    public C3587a[] f9338a;

    /* renamed from: com.yandex.metrica.impl.ob.vf$a */
    public static final class C3587a extends MessageNano {

        /* renamed from: e */
        private static volatile C3587a[] f9339e;

        /* renamed from: a */
        public byte[] f9340a;

        /* renamed from: b */
        public int f9341b;

        /* renamed from: c */
        public C3588b f9342c;

        /* renamed from: d */
        public C3589c f9343d;

        public C3587a() {
            mo18336a();
        }

        /* renamed from: b */
        public static C3587a[] m10896b() {
            if (f9339e == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f9339e == null) {
                        f9339e = new C3587a[0];
                    }
                }
            }
            return f9339e;
        }

        /* renamed from: a */
        public C3587a mo18336a() {
            this.f9340a = WireFormatNano.EMPTY_BYTES;
            this.f9341b = 0;
            this.f9342c = null;
            this.f9343d = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeBytesSize(1, this.f9340a) + CodedOutputByteBufferNano.computeInt32Size(2, this.f9341b);
            C3588b bVar = this.f9342c;
            if (bVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, bVar);
            }
            C3589c cVar = this.f9343d;
            return cVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, cVar) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f9340a = codedInputByteBufferNano.readBytes();
                } else if (readTag == 16) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                        this.f9341b = readInt32;
                    }
                } else if (readTag == 26) {
                    if (this.f9342c == null) {
                        this.f9342c = new C3588b();
                    }
                    codedInputByteBufferNano.readMessage(this.f9342c);
                } else if (readTag == 34) {
                    if (this.f9343d == null) {
                        this.f9343d = new C3589c();
                    }
                    codedInputByteBufferNano.readMessage(this.f9343d);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeBytes(1, this.f9340a);
            codedOutputByteBufferNano.writeInt32(2, this.f9341b);
            C3588b bVar = this.f9342c;
            if (bVar != null) {
                codedOutputByteBufferNano.writeMessage(3, bVar);
            }
            C3589c cVar = this.f9343d;
            if (cVar != null) {
                codedOutputByteBufferNano.writeMessage(4, cVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vf$b */
    public static final class C3588b extends MessageNano {

        /* renamed from: a */
        public boolean f9344a;

        /* renamed from: b */
        public boolean f9345b;

        public C3588b() {
            mo18337a();
        }

        /* renamed from: a */
        public C3588b mo18337a() {
            this.f9344a = false;
            this.f9345b = false;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            boolean z = this.f9344a;
            if (z) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
            }
            boolean z2 = this.f9345b;
            return z2 ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(2, z2) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f9344a = codedInputByteBufferNano.readBool();
                } else if (readTag == 16) {
                    this.f9345b = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            boolean z = this.f9344a;
            if (z) {
                codedOutputByteBufferNano.writeBool(1, z);
            }
            boolean z2 = this.f9345b;
            if (z2) {
                codedOutputByteBufferNano.writeBool(2, z2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vf$c */
    public static final class C3589c extends MessageNano {

        /* renamed from: a */
        public byte[] f9346a;

        /* renamed from: b */
        public double f9347b;

        /* renamed from: c */
        public double f9348c;

        /* renamed from: d */
        public boolean f9349d;

        public C3589c() {
            mo18338a();
        }

        /* renamed from: a */
        public C3589c mo18338a() {
            this.f9346a = WireFormatNano.EMPTY_BYTES;
            this.f9347b = 0.0d;
            this.f9348c = 0.0d;
            this.f9349d = false;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!Arrays.equals(this.f9346a, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f9346a);
            }
            if (Double.doubleToLongBits(this.f9347b) != Double.doubleToLongBits(0.0d)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f9347b);
            }
            if (Double.doubleToLongBits(this.f9348c) != Double.doubleToLongBits(0.0d)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f9348c);
            }
            boolean z = this.f9349d;
            return z ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, z) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f9346a = codedInputByteBufferNano.readBytes();
                } else if (readTag == 17) {
                    this.f9347b = codedInputByteBufferNano.readDouble();
                } else if (readTag == 25) {
                    this.f9348c = codedInputByteBufferNano.readDouble();
                } else if (readTag == 32) {
                    this.f9349d = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!Arrays.equals(this.f9346a, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(1, this.f9346a);
            }
            if (Double.doubleToLongBits(this.f9347b) != Double.doubleToLongBits(0.0d)) {
                codedOutputByteBufferNano.writeDouble(2, this.f9347b);
            }
            if (Double.doubleToLongBits(this.f9348c) != Double.doubleToLongBits(0.0d)) {
                codedOutputByteBufferNano.writeDouble(3, this.f9348c);
            }
            boolean z = this.f9349d;
            if (z) {
                codedOutputByteBufferNano.writeBool(4, z);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C3586vf() {
        mo18335a();
    }

    /* renamed from: a */
    public C3586vf mo18335a() {
        this.f9338a = C3587a.m10896b();
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3587a[] aVarArr = this.f9338a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                C3587a[] aVarArr2 = this.f9338a;
                if (i >= aVarArr2.length) {
                    break;
                }
                C3587a aVar = aVarArr2[i];
                if (aVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, aVar);
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
                C3587a[] aVarArr = this.f9338a;
                int length = aVarArr == null ? 0 : aVarArr.length;
                int i = repeatedFieldArrayLength + length;
                C3587a[] aVarArr2 = new C3587a[i];
                if (length != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                }
                while (length < i - 1) {
                    aVarArr2[length] = new C3587a();
                    codedInputByteBufferNano.readMessage(aVarArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                aVarArr2[length] = new C3587a();
                codedInputByteBufferNano.readMessage(aVarArr2[length]);
                this.f9338a = aVarArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3587a[] aVarArr = this.f9338a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                C3587a[] aVarArr2 = this.f9338a;
                if (i >= aVarArr2.length) {
                    break;
                }
                C3587a aVar = aVarArr2[i];
                if (aVar != null) {
                    codedOutputByteBufferNano.writeMessage(1, aVar);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
