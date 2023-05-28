package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.InternalNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.mf */
public final class C3211mf extends MessageNano {

    /* renamed from: a */
    public int f8325a;

    /* renamed from: b */
    public C3229q f8326b;

    /* renamed from: c */
    public C3227o f8327c;

    /* renamed from: d */
    public C3228p f8328d;

    /* renamed from: e */
    public C3213b f8329e;

    /* renamed from: f */
    public C3219h f8330f;

    /* renamed from: com.yandex.metrica.impl.ob.mf$a */
    public static final class C3212a extends MessageNano {

        /* renamed from: c */
        private static volatile C3212a[] f8331c;

        /* renamed from: a */
        public byte[] f8332a;

        /* renamed from: b */
        public C3216e f8333b;

        public C3212a() {
            mo17844a();
        }

        /* renamed from: b */
        public static C3212a[] m10054b() {
            if (f8331c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f8331c == null) {
                        f8331c = new C3212a[0];
                    }
                }
            }
            return f8331c;
        }

        /* renamed from: a */
        public C3212a mo17844a() {
            this.f8332a = WireFormatNano.EMPTY_BYTES;
            this.f8333b = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!Arrays.equals(this.f8332a, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f8332a);
            }
            C3216e eVar = this.f8333b;
            return eVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, eVar) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f8332a = codedInputByteBufferNano.readBytes();
                } else if (readTag == 18) {
                    if (this.f8333b == null) {
                        this.f8333b = new C3216e();
                    }
                    codedInputByteBufferNano.readMessage(this.f8333b);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!Arrays.equals(this.f8332a, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(1, this.f8332a);
            }
            C3216e eVar = this.f8333b;
            if (eVar != null) {
                codedOutputByteBufferNano.writeMessage(2, eVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$b */
    public static final class C3213b extends MessageNano {

        /* renamed from: a */
        public C3214c f8334a;

        public C3213b() {
            mo17845a();
        }

        /* renamed from: a */
        public C3213b mo17845a() {
            this.f8334a = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            C3214c cVar = this.f8334a;
            return cVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, cVar) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    if (this.f8334a == null) {
                        this.f8334a = new C3214c();
                    }
                    codedInputByteBufferNano.readMessage(this.f8334a);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            C3214c cVar = this.f8334a;
            if (cVar != null) {
                codedOutputByteBufferNano.writeMessage(1, cVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$c */
    public static final class C3214c extends MessageNano {

        /* renamed from: a */
        public C3223k f8335a;

        /* renamed from: b */
        public C3225m f8336b;

        /* renamed from: c */
        public C3216e f8337c;

        /* renamed from: d */
        public C3222j f8338d;

        public C3214c() {
            mo17846a();
        }

        /* renamed from: a */
        public C3214c mo17846a() {
            this.f8335a = null;
            this.f8336b = null;
            this.f8337c = null;
            this.f8338d = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            C3223k kVar = this.f8335a;
            if (kVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, kVar);
            }
            C3225m mVar = this.f8336b;
            if (mVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, mVar);
            }
            C3216e eVar = this.f8337c;
            if (eVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, eVar);
            }
            C3222j jVar = this.f8338d;
            return jVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, jVar) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    if (this.f8335a == null) {
                        this.f8335a = new C3223k();
                    }
                    codedInputByteBufferNano.readMessage(this.f8335a);
                } else if (readTag == 18) {
                    if (this.f8336b == null) {
                        this.f8336b = new C3225m();
                    }
                    codedInputByteBufferNano.readMessage(this.f8336b);
                } else if (readTag == 26) {
                    if (this.f8337c == null) {
                        this.f8337c = new C3216e();
                    }
                    codedInputByteBufferNano.readMessage(this.f8337c);
                } else if (readTag == 34) {
                    if (this.f8338d == null) {
                        this.f8338d = new C3222j();
                    }
                    codedInputByteBufferNano.readMessage(this.f8338d);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            C3223k kVar = this.f8335a;
            if (kVar != null) {
                codedOutputByteBufferNano.writeMessage(1, kVar);
            }
            C3225m mVar = this.f8336b;
            if (mVar != null) {
                codedOutputByteBufferNano.writeMessage(2, mVar);
            }
            C3216e eVar = this.f8337c;
            if (eVar != null) {
                codedOutputByteBufferNano.writeMessage(3, eVar);
            }
            C3222j jVar = this.f8338d;
            if (jVar != null) {
                codedOutputByteBufferNano.writeMessage(4, jVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$d */
    public static final class C3215d extends MessageNano {

        /* renamed from: a */
        public byte[][] f8339a;

        public C3215d() {
            mo17847a();
        }

        /* renamed from: a */
        public C3215d mo17847a() {
            this.f8339a = WireFormatNano.EMPTY_BYTES_ARRAY;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            byte[][] bArr = this.f8339a;
            if (bArr == null || bArr.length <= 0) {
                return computeSerializedSize;
            }
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[][] bArr2 = this.f8339a;
                if (i >= bArr2.length) {
                    return computeSerializedSize + i2 + (i3 * 1);
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3);
                }
                i++;
            }
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                    byte[][] bArr = this.f8339a;
                    int length = bArr == null ? 0 : bArr.length;
                    int i = repeatedFieldArrayLength + length;
                    byte[][] bArr2 = new byte[i][];
                    if (length != 0) {
                        System.arraycopy(bArr, 0, bArr2, 0, length);
                    }
                    while (length < i - 1) {
                        bArr2[length] = codedInputByteBufferNano.readBytes();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    bArr2[length] = codedInputByteBufferNano.readBytes();
                    this.f8339a = bArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            byte[][] bArr = this.f8339a;
            if (bArr != null && bArr.length > 0) {
                int i = 0;
                while (true) {
                    byte[][] bArr2 = this.f8339a;
                    if (i >= bArr2.length) {
                        break;
                    }
                    byte[] bArr3 = bArr2[i];
                    if (bArr3 != null) {
                        codedOutputByteBufferNano.writeBytes(1, bArr3);
                    }
                    i++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$e */
    public static final class C3216e extends MessageNano {

        /* renamed from: a */
        public long f8340a;

        /* renamed from: b */
        public int f8341b;

        public C3216e() {
            mo17848a();
        }

        /* renamed from: a */
        public C3216e mo17848a() {
            this.f8340a = 0;
            this.f8341b = 0;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            long j = this.f8340a;
            if (j != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
            }
            int i = this.f8341b;
            return i != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f8340a = codedInputByteBufferNano.readInt64();
                } else if (readTag == 16) {
                    this.f8341b = codedInputByteBufferNano.readInt32();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long j = this.f8340a;
            if (j != 0) {
                codedOutputByteBufferNano.writeInt64(1, j);
            }
            int i = this.f8341b;
            if (i != 0) {
                codedOutputByteBufferNano.writeInt32(2, i);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$f */
    public static final class C3217f extends MessageNano {

        /* renamed from: a */
        public byte[] f8342a;

        /* renamed from: b */
        public byte[] f8343b;

        /* renamed from: c */
        public C3220i f8344c;

        /* renamed from: d */
        public C3218g[] f8345d;

        /* renamed from: e */
        public int f8346e;

        public C3217f() {
            mo17849a();
        }

        /* renamed from: a */
        public C3217f mo17849a() {
            byte[] bArr = WireFormatNano.EMPTY_BYTES;
            this.f8342a = bArr;
            this.f8343b = bArr;
            this.f8344c = null;
            this.f8345d = C3218g.m10061b();
            this.f8346e = 0;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!Arrays.equals(this.f8342a, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f8342a);
            }
            if (!Arrays.equals(this.f8343b, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f8343b);
            }
            C3220i iVar = this.f8344c;
            if (iVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, iVar);
            }
            C3218g[] gVarArr = this.f8345d;
            if (gVarArr != null && gVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C3218g[] gVarArr2 = this.f8345d;
                    if (i >= gVarArr2.length) {
                        break;
                    }
                    C3218g gVar = gVarArr2[i];
                    if (gVar != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, gVar);
                    }
                    i++;
                }
            }
            int i2 = this.f8346e;
            return i2 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(5, i2) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f8342a = codedInputByteBufferNano.readBytes();
                } else if (readTag == 18) {
                    this.f8343b = codedInputByteBufferNano.readBytes();
                } else if (readTag == 26) {
                    if (this.f8344c == null) {
                        this.f8344c = new C3220i();
                    }
                    codedInputByteBufferNano.readMessage(this.f8344c);
                } else if (readTag == 34) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                    C3218g[] gVarArr = this.f8345d;
                    int length = gVarArr == null ? 0 : gVarArr.length;
                    int i = repeatedFieldArrayLength + length;
                    C3218g[] gVarArr2 = new C3218g[i];
                    if (length != 0) {
                        System.arraycopy(gVarArr, 0, gVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        gVarArr2[length] = new C3218g();
                        codedInputByteBufferNano.readMessage(gVarArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    gVarArr2[length] = new C3218g();
                    codedInputByteBufferNano.readMessage(gVarArr2[length]);
                    this.f8345d = gVarArr2;
                } else if (readTag == 40) {
                    this.f8346e = codedInputByteBufferNano.readUInt32();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!Arrays.equals(this.f8342a, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(1, this.f8342a);
            }
            if (!Arrays.equals(this.f8343b, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(2, this.f8343b);
            }
            C3220i iVar = this.f8344c;
            if (iVar != null) {
                codedOutputByteBufferNano.writeMessage(3, iVar);
            }
            C3218g[] gVarArr = this.f8345d;
            if (gVarArr != null && gVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C3218g[] gVarArr2 = this.f8345d;
                    if (i >= gVarArr2.length) {
                        break;
                    }
                    C3218g gVar = gVarArr2[i];
                    if (gVar != null) {
                        codedOutputByteBufferNano.writeMessage(4, gVar);
                    }
                    i++;
                }
            }
            int i2 = this.f8346e;
            if (i2 != 0) {
                codedOutputByteBufferNano.writeUInt32(5, i2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$g */
    public static final class C3218g extends MessageNano {

        /* renamed from: c */
        private static volatile C3218g[] f8347c;

        /* renamed from: a */
        public int f8348a;

        /* renamed from: b */
        public C3214c f8349b;

        public C3218g() {
            mo17850a();
        }

        /* renamed from: b */
        public static C3218g[] m10061b() {
            if (f8347c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f8347c == null) {
                        f8347c = new C3218g[0];
                    }
                }
            }
            return f8347c;
        }

        /* renamed from: a */
        public C3218g mo17850a() {
            this.f8348a = 0;
            this.f8349b = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            int i = this.f8348a;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
            }
            C3214c cVar = this.f8349b;
            return cVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, cVar) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f8348a = codedInputByteBufferNano.readUInt32();
                } else if (readTag == 18) {
                    if (this.f8349b == null) {
                        this.f8349b = new C3214c();
                    }
                    codedInputByteBufferNano.readMessage(this.f8349b);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int i = this.f8348a;
            if (i != 0) {
                codedOutputByteBufferNano.writeUInt32(1, i);
            }
            C3214c cVar = this.f8349b;
            if (cVar != null) {
                codedOutputByteBufferNano.writeMessage(2, cVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$h */
    public static final class C3219h extends MessageNano {

        /* renamed from: a */
        public C3217f f8350a;

        public C3219h() {
            mo17851a();
        }

        /* renamed from: a */
        public C3219h mo17851a() {
            this.f8350a = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            C3217f fVar = this.f8350a;
            return fVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, fVar) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    if (this.f8350a == null) {
                        this.f8350a = new C3217f();
                    }
                    codedInputByteBufferNano.readMessage(this.f8350a);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            C3217f fVar = this.f8350a;
            if (fVar != null) {
                codedOutputByteBufferNano.writeMessage(1, fVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$i */
    public static final class C3220i extends MessageNano {

        /* renamed from: a */
        public C3221a[] f8351a;

        /* renamed from: b */
        public int f8352b;

        /* renamed from: com.yandex.metrica.impl.ob.mf$i$a */
        public static final class C3221a extends MessageNano {

            /* renamed from: c */
            private static volatile C3221a[] f8353c;

            /* renamed from: a */
            public byte[] f8354a;

            /* renamed from: b */
            public byte[] f8355b;

            public C3221a() {
                mo17853a();
            }

            /* renamed from: b */
            public static C3221a[] m10065b() {
                if (f8353c == null) {
                    synchronized (InternalNano.LAZY_INIT_LOCK) {
                        if (f8353c == null) {
                            f8353c = new C3221a[0];
                        }
                    }
                }
                return f8353c;
            }

            /* renamed from: a */
            public C3221a mo17853a() {
                byte[] bArr = WireFormatNano.EMPTY_BYTES;
                this.f8354a = bArr;
                this.f8355b = bArr;
                this.cachedSize = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            public int computeSerializedSize() {
                int computeSerializedSize = super.computeSerializedSize();
                if (!Arrays.equals(this.f8354a, WireFormatNano.EMPTY_BYTES)) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f8354a);
                }
                return !Arrays.equals(this.f8355b, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f8355b) : computeSerializedSize;
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                while (true) {
                    int readTag = codedInputByteBufferNano.readTag();
                    if (readTag == 0) {
                        break;
                    } else if (readTag == 10) {
                        this.f8354a = codedInputByteBufferNano.readBytes();
                    } else if (readTag == 18) {
                        this.f8355b = codedInputByteBufferNano.readBytes();
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    }
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                if (!Arrays.equals(this.f8354a, WireFormatNano.EMPTY_BYTES)) {
                    codedOutputByteBufferNano.writeBytes(1, this.f8354a);
                }
                if (!Arrays.equals(this.f8355b, WireFormatNano.EMPTY_BYTES)) {
                    codedOutputByteBufferNano.writeBytes(2, this.f8355b);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public C3220i() {
            mo17852a();
        }

        /* renamed from: a */
        public C3220i mo17852a() {
            this.f8351a = C3221a.m10065b();
            this.f8352b = 0;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            C3221a[] aVarArr = this.f8351a;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C3221a[] aVarArr2 = this.f8351a;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    C3221a aVar = aVarArr2[i];
                    if (aVar != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, aVar);
                    }
                    i++;
                }
            }
            int i2 = this.f8352b;
            return i2 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(2, i2) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                    C3221a[] aVarArr = this.f8351a;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    int i = repeatedFieldArrayLength + length;
                    C3221a[] aVarArr2 = new C3221a[i];
                    if (length != 0) {
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        aVarArr2[length] = new C3221a();
                        codedInputByteBufferNano.readMessage(aVarArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    aVarArr2[length] = new C3221a();
                    codedInputByteBufferNano.readMessage(aVarArr2[length]);
                    this.f8351a = aVarArr2;
                } else if (readTag == 16) {
                    this.f8352b = codedInputByteBufferNano.readUInt32();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            C3221a[] aVarArr = this.f8351a;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C3221a[] aVarArr2 = this.f8351a;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    C3221a aVar = aVarArr2[i];
                    if (aVar != null) {
                        codedOutputByteBufferNano.writeMessage(1, aVar);
                    }
                    i++;
                }
            }
            int i2 = this.f8352b;
            if (i2 != 0) {
                codedOutputByteBufferNano.writeUInt32(2, i2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$j */
    public static final class C3222j extends MessageNano {

        /* renamed from: a */
        public C3212a f8356a;

        /* renamed from: b */
        public C3212a[] f8357b;

        public C3222j() {
            mo17854a();
        }

        /* renamed from: a */
        public C3222j mo17854a() {
            this.f8356a = null;
            this.f8357b = C3212a.m10054b();
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            C3212a aVar = this.f8356a;
            if (aVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, aVar);
            }
            C3212a[] aVarArr = this.f8357b;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C3212a[] aVarArr2 = this.f8357b;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    C3212a aVar2 = aVarArr2[i];
                    if (aVar2 != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, aVar2);
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
                    if (this.f8356a == null) {
                        this.f8356a = new C3212a();
                    }
                    codedInputByteBufferNano.readMessage(this.f8356a);
                } else if (readTag == 18) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                    C3212a[] aVarArr = this.f8357b;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    int i = repeatedFieldArrayLength + length;
                    C3212a[] aVarArr2 = new C3212a[i];
                    if (length != 0) {
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        aVarArr2[length] = new C3212a();
                        codedInputByteBufferNano.readMessage(aVarArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    aVarArr2[length] = new C3212a();
                    codedInputByteBufferNano.readMessage(aVarArr2[length]);
                    this.f8357b = aVarArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            C3212a aVar = this.f8356a;
            if (aVar != null) {
                codedOutputByteBufferNano.writeMessage(1, aVar);
            }
            C3212a[] aVarArr = this.f8357b;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C3212a[] aVarArr2 = this.f8357b;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    C3212a aVar2 = aVarArr2[i];
                    if (aVar2 != null) {
                        codedOutputByteBufferNano.writeMessage(2, aVar2);
                    }
                    i++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$k */
    public static final class C3223k extends MessageNano {

        /* renamed from: a */
        public byte[] f8358a;

        /* renamed from: b */
        public byte[] f8359b;

        /* renamed from: c */
        public C3215d f8360c;

        /* renamed from: d */
        public C3220i f8361d;

        /* renamed from: e */
        public C3222j f8362e;

        /* renamed from: f */
        public C3222j f8363f;

        /* renamed from: g */
        public C3224l[] f8364g;

        public C3223k() {
            mo17855a();
        }

        /* renamed from: a */
        public C3223k mo17855a() {
            byte[] bArr = WireFormatNano.EMPTY_BYTES;
            this.f8358a = bArr;
            this.f8359b = bArr;
            this.f8360c = null;
            this.f8361d = null;
            this.f8362e = null;
            this.f8363f = null;
            this.f8364g = C3224l.m10069b();
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!Arrays.equals(this.f8358a, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f8358a);
            }
            if (!Arrays.equals(this.f8359b, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f8359b);
            }
            C3215d dVar = this.f8360c;
            if (dVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, dVar);
            }
            C3220i iVar = this.f8361d;
            if (iVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, iVar);
            }
            C3222j jVar = this.f8362e;
            if (jVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, jVar);
            }
            C3222j jVar2 = this.f8363f;
            if (jVar2 != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, jVar2);
            }
            C3224l[] lVarArr = this.f8364g;
            if (lVarArr != null && lVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C3224l[] lVarArr2 = this.f8364g;
                    if (i >= lVarArr2.length) {
                        break;
                    }
                    C3224l lVar = lVarArr2[i];
                    if (lVar != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, lVar);
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
                    this.f8358a = codedInputByteBufferNano.readBytes();
                } else if (readTag == 18) {
                    this.f8359b = codedInputByteBufferNano.readBytes();
                } else if (readTag == 26) {
                    if (this.f8360c == null) {
                        this.f8360c = new C3215d();
                    }
                    codedInputByteBufferNano.readMessage(this.f8360c);
                } else if (readTag == 34) {
                    if (this.f8361d == null) {
                        this.f8361d = new C3220i();
                    }
                    codedInputByteBufferNano.readMessage(this.f8361d);
                } else if (readTag == 42) {
                    if (this.f8362e == null) {
                        this.f8362e = new C3222j();
                    }
                    codedInputByteBufferNano.readMessage(this.f8362e);
                } else if (readTag == 50) {
                    if (this.f8363f == null) {
                        this.f8363f = new C3222j();
                    }
                    codedInputByteBufferNano.readMessage(this.f8363f);
                } else if (readTag == 58) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    C3224l[] lVarArr = this.f8364g;
                    int length = lVarArr == null ? 0 : lVarArr.length;
                    int i = repeatedFieldArrayLength + length;
                    C3224l[] lVarArr2 = new C3224l[i];
                    if (length != 0) {
                        System.arraycopy(lVarArr, 0, lVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        lVarArr2[length] = new C3224l();
                        codedInputByteBufferNano.readMessage(lVarArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    lVarArr2[length] = new C3224l();
                    codedInputByteBufferNano.readMessage(lVarArr2[length]);
                    this.f8364g = lVarArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!Arrays.equals(this.f8358a, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(1, this.f8358a);
            }
            if (!Arrays.equals(this.f8359b, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(2, this.f8359b);
            }
            C3215d dVar = this.f8360c;
            if (dVar != null) {
                codedOutputByteBufferNano.writeMessage(3, dVar);
            }
            C3220i iVar = this.f8361d;
            if (iVar != null) {
                codedOutputByteBufferNano.writeMessage(4, iVar);
            }
            C3222j jVar = this.f8362e;
            if (jVar != null) {
                codedOutputByteBufferNano.writeMessage(5, jVar);
            }
            C3222j jVar2 = this.f8363f;
            if (jVar2 != null) {
                codedOutputByteBufferNano.writeMessage(6, jVar2);
            }
            C3224l[] lVarArr = this.f8364g;
            if (lVarArr != null && lVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C3224l[] lVarArr2 = this.f8364g;
                    if (i >= lVarArr2.length) {
                        break;
                    }
                    C3224l lVar = lVarArr2[i];
                    if (lVar != null) {
                        codedOutputByteBufferNano.writeMessage(7, lVar);
                    }
                    i++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$l */
    public static final class C3224l extends MessageNano {

        /* renamed from: b */
        private static volatile C3224l[] f8365b;

        /* renamed from: a */
        public byte[] f8366a;

        public C3224l() {
            mo17856a();
        }

        /* renamed from: b */
        public static C3224l[] m10069b() {
            if (f8365b == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f8365b == null) {
                        f8365b = new C3224l[0];
                    }
                }
            }
            return f8365b;
        }

        /* renamed from: a */
        public C3224l mo17856a() {
            this.f8366a = WireFormatNano.EMPTY_BYTES;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            return !Arrays.equals(this.f8366a, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(1, this.f8366a) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f8366a = codedInputByteBufferNano.readBytes();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!Arrays.equals(this.f8366a, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(1, this.f8366a);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$m */
    public static final class C3225m extends MessageNano {

        /* renamed from: a */
        public byte[] f8367a;

        /* renamed from: b */
        public byte[] f8368b;

        /* renamed from: c */
        public C3226n f8369c;

        public C3225m() {
            mo17857a();
        }

        /* renamed from: a */
        public C3225m mo17857a() {
            byte[] bArr = WireFormatNano.EMPTY_BYTES;
            this.f8367a = bArr;
            this.f8368b = bArr;
            this.f8369c = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!Arrays.equals(this.f8367a, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f8367a);
            }
            if (!Arrays.equals(this.f8368b, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f8368b);
            }
            C3226n nVar = this.f8369c;
            return nVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, nVar) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f8367a = codedInputByteBufferNano.readBytes();
                } else if (readTag == 18) {
                    this.f8368b = codedInputByteBufferNano.readBytes();
                } else if (readTag == 26) {
                    if (this.f8369c == null) {
                        this.f8369c = new C3226n();
                    }
                    codedInputByteBufferNano.readMessage(this.f8369c);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!Arrays.equals(this.f8367a, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(1, this.f8367a);
            }
            if (!Arrays.equals(this.f8368b, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(2, this.f8368b);
            }
            C3226n nVar = this.f8369c;
            if (nVar != null) {
                codedOutputByteBufferNano.writeMessage(3, nVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$n */
    public static final class C3226n extends MessageNano {

        /* renamed from: a */
        public byte[] f8370a;

        /* renamed from: b */
        public C3215d f8371b;

        /* renamed from: c */
        public byte[] f8372c;

        /* renamed from: d */
        public C3220i f8373d;

        public C3226n() {
            mo17858a();
        }

        /* renamed from: a */
        public C3226n mo17858a() {
            byte[] bArr = WireFormatNano.EMPTY_BYTES;
            this.f8370a = bArr;
            this.f8371b = null;
            this.f8372c = bArr;
            this.f8373d = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!Arrays.equals(this.f8370a, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f8370a);
            }
            C3215d dVar = this.f8371b;
            if (dVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, dVar);
            }
            if (!Arrays.equals(this.f8372c, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f8372c);
            }
            C3220i iVar = this.f8373d;
            return iVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, iVar) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f8370a = codedInputByteBufferNano.readBytes();
                } else if (readTag == 18) {
                    if (this.f8371b == null) {
                        this.f8371b = new C3215d();
                    }
                    codedInputByteBufferNano.readMessage(this.f8371b);
                } else if (readTag == 26) {
                    this.f8372c = codedInputByteBufferNano.readBytes();
                } else if (readTag == 34) {
                    if (this.f8373d == null) {
                        this.f8373d = new C3220i();
                    }
                    codedInputByteBufferNano.readMessage(this.f8373d);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!Arrays.equals(this.f8370a, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(1, this.f8370a);
            }
            C3215d dVar = this.f8371b;
            if (dVar != null) {
                codedOutputByteBufferNano.writeMessage(2, dVar);
            }
            if (!Arrays.equals(this.f8372c, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(3, this.f8372c);
            }
            C3220i iVar = this.f8373d;
            if (iVar != null) {
                codedOutputByteBufferNano.writeMessage(4, iVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$o */
    public static final class C3227o extends MessageNano {

        /* renamed from: a */
        public C3223k f8374a;

        /* renamed from: b */
        public C3226n f8375b;

        public C3227o() {
            mo17859a();
        }

        /* renamed from: a */
        public C3227o mo17859a() {
            this.f8374a = null;
            this.f8375b = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            C3223k kVar = this.f8374a;
            if (kVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, kVar);
            }
            C3226n nVar = this.f8375b;
            return nVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, nVar) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    if (this.f8374a == null) {
                        this.f8374a = new C3223k();
                    }
                    codedInputByteBufferNano.readMessage(this.f8374a);
                } else if (readTag == 18) {
                    if (this.f8375b == null) {
                        this.f8375b = new C3226n();
                    }
                    codedInputByteBufferNano.readMessage(this.f8375b);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            C3223k kVar = this.f8374a;
            if (kVar != null) {
                codedOutputByteBufferNano.writeMessage(1, kVar);
            }
            C3226n nVar = this.f8375b;
            if (nVar != null) {
                codedOutputByteBufferNano.writeMessage(2, nVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$p */
    public static final class C3228p extends MessageNano {

        /* renamed from: a */
        public C3223k f8376a;

        /* renamed from: b */
        public C3225m f8377b;

        public C3228p() {
            mo17860a();
        }

        /* renamed from: a */
        public C3228p mo17860a() {
            this.f8376a = null;
            this.f8377b = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            C3223k kVar = this.f8376a;
            if (kVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, kVar);
            }
            C3225m mVar = this.f8377b;
            return mVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, mVar) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    if (this.f8376a == null) {
                        this.f8376a = new C3223k();
                    }
                    codedInputByteBufferNano.readMessage(this.f8376a);
                } else if (readTag == 18) {
                    if (this.f8377b == null) {
                        this.f8377b = new C3225m();
                    }
                    codedInputByteBufferNano.readMessage(this.f8377b);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            C3223k kVar = this.f8376a;
            if (kVar != null) {
                codedOutputByteBufferNano.writeMessage(1, kVar);
            }
            C3225m mVar = this.f8377b;
            if (mVar != null) {
                codedOutputByteBufferNano.writeMessage(2, mVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$q */
    public static final class C3229q extends MessageNano {

        /* renamed from: a */
        public C3226n f8378a;

        public C3229q() {
            mo17861a();
        }

        /* renamed from: a */
        public C3229q mo17861a() {
            this.f8378a = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            C3226n nVar = this.f8378a;
            return nVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, nVar) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    if (this.f8378a == null) {
                        this.f8378a = new C3226n();
                    }
                    codedInputByteBufferNano.readMessage(this.f8378a);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            C3226n nVar = this.f8378a;
            if (nVar != null) {
                codedOutputByteBufferNano.writeMessage(1, nVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C3211mf() {
        mo17843a();
    }

    /* renamed from: a */
    public C3211mf mo17843a() {
        this.f8325a = 0;
        this.f8326b = null;
        this.f8327c = null;
        this.f8328d = null;
        this.f8329e = null;
        this.f8330f = null;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f8325a;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        C3229q qVar = this.f8326b;
        if (qVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, qVar);
        }
        C3227o oVar = this.f8327c;
        if (oVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, oVar);
        }
        C3228p pVar = this.f8328d;
        if (pVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, pVar);
        }
        C3213b bVar = this.f8329e;
        if (bVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, bVar);
        }
        C3219h hVar = this.f8330f;
        return hVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(6, hVar) : computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag != 0) {
                if (readTag == 8) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    switch (readInt32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f8325a = readInt32;
                            break;
                    }
                } else if (readTag == 18) {
                    if (this.f8326b == null) {
                        this.f8326b = new C3229q();
                    }
                    codedInputByteBufferNano.readMessage(this.f8326b);
                } else if (readTag == 26) {
                    if (this.f8327c == null) {
                        this.f8327c = new C3227o();
                    }
                    codedInputByteBufferNano.readMessage(this.f8327c);
                } else if (readTag == 34) {
                    if (this.f8328d == null) {
                        this.f8328d = new C3228p();
                    }
                    codedInputByteBufferNano.readMessage(this.f8328d);
                } else if (readTag == 42) {
                    if (this.f8329e == null) {
                        this.f8329e = new C3213b();
                    }
                    codedInputByteBufferNano.readMessage(this.f8329e);
                } else if (readTag == 50) {
                    if (this.f8330f == null) {
                        this.f8330f = new C3219h();
                    }
                    codedInputByteBufferNano.readMessage(this.f8330f);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f8325a;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        C3229q qVar = this.f8326b;
        if (qVar != null) {
            codedOutputByteBufferNano.writeMessage(2, qVar);
        }
        C3227o oVar = this.f8327c;
        if (oVar != null) {
            codedOutputByteBufferNano.writeMessage(3, oVar);
        }
        C3228p pVar = this.f8328d;
        if (pVar != null) {
            codedOutputByteBufferNano.writeMessage(4, pVar);
        }
        C3213b bVar = this.f8329e;
        if (bVar != null) {
            codedOutputByteBufferNano.writeMessage(5, bVar);
        }
        C3219h hVar = this.f8330f;
        if (hVar != null) {
            codedOutputByteBufferNano.writeMessage(6, hVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
