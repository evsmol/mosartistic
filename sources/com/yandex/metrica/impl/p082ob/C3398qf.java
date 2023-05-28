package com.yandex.metrica.impl.p082ob;

import com.explorestack.protobuf.openrtb.LossReason;
import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.InternalNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.qf */
public final class C3398qf extends MessageNano {

    /* renamed from: a */
    public C3403d[] f8765a;

    /* renamed from: b */
    public C3401c f8766b;

    /* renamed from: c */
    public C3399a[] f8767c;

    /* renamed from: d */
    public C3409e[] f8768d;

    /* renamed from: e */
    public String[] f8769e;

    /* renamed from: com.yandex.metrica.impl.ob.qf$a */
    public static final class C3399a extends MessageNano {

        /* renamed from: c */
        private static volatile C3399a[] f8770c;

        /* renamed from: a */
        public String f8771a;

        /* renamed from: b */
        public String f8772b;

        public C3399a() {
            mo18074a();
        }

        /* renamed from: b */
        public static C3399a[] m10481b() {
            if (f8770c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f8770c == null) {
                        f8770c = new C3399a[0];
                    }
                }
            }
            return f8770c;
        }

        /* renamed from: a */
        public C3399a mo18074a() {
            this.f8771a = "";
            this.f8772b = "";
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            return super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f8771a) + CodedOutputByteBufferNano.computeStringSize(2, this.f8772b);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f8771a = codedInputByteBufferNano.readString();
                } else if (readTag == 18) {
                    this.f8772b = codedInputByteBufferNano.readString();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeString(1, this.f8771a);
            codedOutputByteBufferNano.writeString(2, this.f8772b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.qf$b */
    public static final class C3400b extends MessageNano {

        /* renamed from: a */
        public double f8773a;

        /* renamed from: b */
        public double f8774b;

        /* renamed from: c */
        public long f8775c;

        /* renamed from: d */
        public int f8776d;

        /* renamed from: e */
        public int f8777e;

        /* renamed from: f */
        public int f8778f;

        /* renamed from: g */
        public int f8779g;

        /* renamed from: h */
        public int f8780h;

        /* renamed from: i */
        public String f8781i;

        public C3400b() {
            mo18075a();
        }

        /* renamed from: a */
        public C3400b mo18075a() {
            this.f8773a = 0.0d;
            this.f8774b = 0.0d;
            this.f8775c = 0;
            this.f8776d = 0;
            this.f8777e = 0;
            this.f8778f = 0;
            this.f8779g = 0;
            this.f8780h = 0;
            this.f8781i = "";
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeDoubleSize(1, this.f8773a) + CodedOutputByteBufferNano.computeDoubleSize(2, this.f8774b);
            long j = this.f8775c;
            if (j != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j);
            }
            int i = this.f8776d;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(4, i);
            }
            int i2 = this.f8777e;
            if (i2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, i2);
            }
            int i3 = this.f8778f;
            if (i3 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(6, i3);
            }
            int i4 = this.f8779g;
            if (i4 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i4);
            }
            int i5 = this.f8780h;
            if (i5 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(8, i5);
            }
            return !this.f8781i.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(9, this.f8781i) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 9) {
                    this.f8773a = codedInputByteBufferNano.readDouble();
                } else if (readTag == 17) {
                    this.f8774b = codedInputByteBufferNano.readDouble();
                } else if (readTag == 24) {
                    this.f8775c = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 32) {
                    this.f8776d = codedInputByteBufferNano.readUInt32();
                } else if (readTag == 40) {
                    this.f8777e = codedInputByteBufferNano.readUInt32();
                } else if (readTag == 48) {
                    this.f8778f = codedInputByteBufferNano.readUInt32();
                } else if (readTag == 56) {
                    this.f8779g = codedInputByteBufferNano.readInt32();
                } else if (readTag == 64) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                        this.f8780h = readInt32;
                    }
                } else if (readTag == 74) {
                    this.f8781i = codedInputByteBufferNano.readString();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeDouble(1, this.f8773a);
            codedOutputByteBufferNano.writeDouble(2, this.f8774b);
            long j = this.f8775c;
            if (j != 0) {
                codedOutputByteBufferNano.writeUInt64(3, j);
            }
            int i = this.f8776d;
            if (i != 0) {
                codedOutputByteBufferNano.writeUInt32(4, i);
            }
            int i2 = this.f8777e;
            if (i2 != 0) {
                codedOutputByteBufferNano.writeUInt32(5, i2);
            }
            int i3 = this.f8778f;
            if (i3 != 0) {
                codedOutputByteBufferNano.writeUInt32(6, i3);
            }
            int i4 = this.f8779g;
            if (i4 != 0) {
                codedOutputByteBufferNano.writeInt32(7, i4);
            }
            int i5 = this.f8780h;
            if (i5 != 0) {
                codedOutputByteBufferNano.writeInt32(8, i5);
            }
            if (!this.f8781i.equals("")) {
                codedOutputByteBufferNano.writeString(9, this.f8781i);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.qf$c */
    public static final class C3401c extends MessageNano {

        /* renamed from: a */
        public String f8782a;

        /* renamed from: b */
        public String f8783b;

        /* renamed from: c */
        public String f8784c;

        /* renamed from: d */
        public int f8785d;

        /* renamed from: e */
        public String f8786e;

        /* renamed from: f */
        public String f8787f;

        /* renamed from: g */
        public boolean f8788g;

        /* renamed from: h */
        public int f8789h;

        /* renamed from: i */
        public String f8790i;

        /* renamed from: j */
        public String f8791j;

        /* renamed from: k */
        public int f8792k;

        /* renamed from: l */
        public C3402a[] f8793l;

        /* renamed from: m */
        public String f8794m;

        /* renamed from: com.yandex.metrica.impl.ob.qf$c$a */
        public static final class C3402a extends MessageNano {

            /* renamed from: c */
            private static volatile C3402a[] f8795c;

            /* renamed from: a */
            public String f8796a;

            /* renamed from: b */
            public long f8797b;

            public C3402a() {
                mo18077a();
            }

            /* renamed from: b */
            public static C3402a[] m10485b() {
                if (f8795c == null) {
                    synchronized (InternalNano.LAZY_INIT_LOCK) {
                        if (f8795c == null) {
                            f8795c = new C3402a[0];
                        }
                    }
                }
                return f8795c;
            }

            /* renamed from: a */
            public C3402a mo18077a() {
                this.f8796a = "";
                this.f8797b = 0;
                this.cachedSize = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            public int computeSerializedSize() {
                return super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f8796a) + CodedOutputByteBufferNano.computeUInt64Size(2, this.f8797b);
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                while (true) {
                    int readTag = codedInputByteBufferNano.readTag();
                    if (readTag == 0) {
                        break;
                    } else if (readTag == 10) {
                        this.f8796a = codedInputByteBufferNano.readString();
                    } else if (readTag == 16) {
                        this.f8797b = codedInputByteBufferNano.readUInt64();
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    }
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                codedOutputByteBufferNano.writeString(1, this.f8796a);
                codedOutputByteBufferNano.writeUInt64(2, this.f8797b);
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public C3401c() {
            mo18076a();
        }

        /* renamed from: a */
        public C3401c mo18076a() {
            this.f8782a = "";
            this.f8783b = "";
            this.f8784c = "";
            this.f8785d = 0;
            this.f8786e = "";
            this.f8787f = "";
            this.f8788g = false;
            this.f8789h = 0;
            this.f8790i = "";
            this.f8791j = "";
            this.f8792k = 0;
            this.f8793l = C3402a.m10485b();
            this.f8794m = "";
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.f8782a.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f8782a);
            }
            if (!this.f8783b.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f8783b);
            }
            if (!this.f8784c.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f8784c);
            }
            int i = this.f8785d;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, i);
            }
            if (!this.f8786e.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(10, this.f8786e);
            }
            if (!this.f8787f.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(15, this.f8787f);
            }
            boolean z = this.f8788g;
            if (z) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(17, z);
            }
            int i2 = this.f8789h;
            if (i2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(18, i2);
            }
            if (!this.f8790i.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f8790i);
            }
            if (!this.f8791j.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(21, this.f8791j);
            }
            int i3 = this.f8792k;
            if (i3 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(22, i3);
            }
            C3402a[] aVarArr = this.f8793l;
            if (aVarArr != null && aVarArr.length > 0) {
                int i4 = 0;
                while (true) {
                    C3402a[] aVarArr2 = this.f8793l;
                    if (i4 >= aVarArr2.length) {
                        break;
                    }
                    C3402a aVar = aVarArr2[i4];
                    if (aVar != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(23, aVar);
                    }
                    i4++;
                }
            }
            return !this.f8794m.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(24, this.f8794m) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                switch (readTag) {
                    case 0:
                        break;
                    case 10:
                        this.f8782a = codedInputByteBufferNano.readString();
                        continue;
                    case 18:
                        this.f8783b = codedInputByteBufferNano.readString();
                        continue;
                    case 34:
                        this.f8784c = codedInputByteBufferNano.readString();
                        continue;
                    case 40:
                        this.f8785d = codedInputByteBufferNano.readUInt32();
                        continue;
                    case 82:
                        this.f8786e = codedInputByteBufferNano.readString();
                        continue;
                    case 122:
                        this.f8787f = codedInputByteBufferNano.readString();
                        continue;
                    case 136:
                        this.f8788g = codedInputByteBufferNano.readBool();
                        continue;
                    case 144:
                        this.f8789h = codedInputByteBufferNano.readUInt32();
                        continue;
                    case 154:
                        this.f8790i = codedInputByteBufferNano.readString();
                        continue;
                    case 170:
                        this.f8791j = codedInputByteBufferNano.readString();
                        continue;
                    case 176:
                        this.f8792k = codedInputByteBufferNano.readUInt32();
                        continue;
                    case 186:
                        int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 186);
                        C3402a[] aVarArr = this.f8793l;
                        int length = aVarArr == null ? 0 : aVarArr.length;
                        int i = repeatedFieldArrayLength + length;
                        C3402a[] aVarArr2 = new C3402a[i];
                        if (length != 0) {
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                        }
                        while (length < i - 1) {
                            aVarArr2[length] = new C3402a();
                            codedInputByteBufferNano.readMessage(aVarArr2[length]);
                            codedInputByteBufferNano.readTag();
                            length++;
                        }
                        aVarArr2[length] = new C3402a();
                        codedInputByteBufferNano.readMessage(aVarArr2[length]);
                        this.f8793l = aVarArr2;
                        continue;
                    case 194:
                        this.f8794m = codedInputByteBufferNano.readString();
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
            if (!this.f8782a.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.f8782a);
            }
            if (!this.f8783b.equals("")) {
                codedOutputByteBufferNano.writeString(2, this.f8783b);
            }
            if (!this.f8784c.equals("")) {
                codedOutputByteBufferNano.writeString(4, this.f8784c);
            }
            int i = this.f8785d;
            if (i != 0) {
                codedOutputByteBufferNano.writeUInt32(5, i);
            }
            if (!this.f8786e.equals("")) {
                codedOutputByteBufferNano.writeString(10, this.f8786e);
            }
            if (!this.f8787f.equals("")) {
                codedOutputByteBufferNano.writeString(15, this.f8787f);
            }
            boolean z = this.f8788g;
            if (z) {
                codedOutputByteBufferNano.writeBool(17, z);
            }
            int i2 = this.f8789h;
            if (i2 != 0) {
                codedOutputByteBufferNano.writeUInt32(18, i2);
            }
            if (!this.f8790i.equals("")) {
                codedOutputByteBufferNano.writeString(19, this.f8790i);
            }
            if (!this.f8791j.equals("")) {
                codedOutputByteBufferNano.writeString(21, this.f8791j);
            }
            int i3 = this.f8792k;
            if (i3 != 0) {
                codedOutputByteBufferNano.writeUInt32(22, i3);
            }
            C3402a[] aVarArr = this.f8793l;
            if (aVarArr != null && aVarArr.length > 0) {
                int i4 = 0;
                while (true) {
                    C3402a[] aVarArr2 = this.f8793l;
                    if (i4 >= aVarArr2.length) {
                        break;
                    }
                    C3402a aVar = aVarArr2[i4];
                    if (aVar != null) {
                        codedOutputByteBufferNano.writeMessage(23, aVar);
                    }
                    i4++;
                }
            }
            if (!this.f8794m.equals("")) {
                codedOutputByteBufferNano.writeString(24, this.f8794m);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.qf$d */
    public static final class C3403d extends MessageNano {

        /* renamed from: d */
        private static volatile C3403d[] f8798d;

        /* renamed from: a */
        public long f8799a;

        /* renamed from: b */
        public C3408b f8800b;

        /* renamed from: c */
        public C3404a[] f8801c;

        /* renamed from: com.yandex.metrica.impl.ob.qf$d$a */
        public static final class C3404a extends MessageNano {

            /* renamed from: y */
            private static volatile C3404a[] f8802y;

            /* renamed from: a */
            public long f8803a;

            /* renamed from: b */
            public long f8804b;

            /* renamed from: c */
            public int f8805c;

            /* renamed from: d */
            public String f8806d;

            /* renamed from: e */
            public byte[] f8807e;

            /* renamed from: f */
            public C3400b f8808f;

            /* renamed from: g */
            public C3407c f8809g;

            /* renamed from: h */
            public String f8810h;

            /* renamed from: i */
            public C3405a f8811i;

            /* renamed from: j */
            public int f8812j;

            /* renamed from: k */
            public int f8813k;

            /* renamed from: l */
            public int f8814l;

            /* renamed from: m */
            public byte[] f8815m;

            /* renamed from: n */
            public int f8816n;

            /* renamed from: o */
            public long f8817o;

            /* renamed from: p */
            public long f8818p;

            /* renamed from: q */
            public int f8819q;

            /* renamed from: r */
            public int f8820r;

            /* renamed from: s */
            public int f8821s;

            /* renamed from: t */
            public int f8822t;

            /* renamed from: u */
            public int f8823u;

            /* renamed from: v */
            public boolean f8824v;

            /* renamed from: w */
            public long f8825w;

            /* renamed from: x */
            public C3406b[] f8826x;

            /* renamed from: com.yandex.metrica.impl.ob.qf$d$a$a */
            public static final class C3405a extends MessageNano {

                /* renamed from: a */
                public String f8827a;

                /* renamed from: b */
                public String f8828b;

                /* renamed from: c */
                public String f8829c;

                public C3405a() {
                    mo18080a();
                }

                /* renamed from: a */
                public C3405a mo18080a() {
                    this.f8827a = "";
                    this.f8828b = "";
                    this.f8829c = "";
                    this.cachedSize = -1;
                    return this;
                }

                /* access modifiers changed from: protected */
                public int computeSerializedSize() {
                    int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f8827a);
                    if (!this.f8828b.equals("")) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f8828b);
                    }
                    return !this.f8829c.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(3, this.f8829c) : computeSerializedSize;
                }

                public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                    while (true) {
                        int readTag = codedInputByteBufferNano.readTag();
                        if (readTag == 0) {
                            break;
                        } else if (readTag == 10) {
                            this.f8827a = codedInputByteBufferNano.readString();
                        } else if (readTag == 18) {
                            this.f8828b = codedInputByteBufferNano.readString();
                        } else if (readTag == 26) {
                            this.f8829c = codedInputByteBufferNano.readString();
                        } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                            break;
                        }
                    }
                    return this;
                }

                public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                    codedOutputByteBufferNano.writeString(1, this.f8827a);
                    if (!this.f8828b.equals("")) {
                        codedOutputByteBufferNano.writeString(2, this.f8828b);
                    }
                    if (!this.f8829c.equals("")) {
                        codedOutputByteBufferNano.writeString(3, this.f8829c);
                    }
                    super.writeTo(codedOutputByteBufferNano);
                }
            }

            /* renamed from: com.yandex.metrica.impl.ob.qf$d$a$b */
            public static final class C3406b extends MessageNano {

                /* renamed from: c */
                private static volatile C3406b[] f8830c;

                /* renamed from: a */
                public byte[] f8831a;

                /* renamed from: b */
                public byte[] f8832b;

                public C3406b() {
                    mo18081a();
                }

                /* renamed from: b */
                public static C3406b[] m10492b() {
                    if (f8830c == null) {
                        synchronized (InternalNano.LAZY_INIT_LOCK) {
                            if (f8830c == null) {
                                f8830c = new C3406b[0];
                            }
                        }
                    }
                    return f8830c;
                }

                /* renamed from: a */
                public C3406b mo18081a() {
                    byte[] bArr = WireFormatNano.EMPTY_BYTES;
                    this.f8831a = bArr;
                    this.f8832b = bArr;
                    this.cachedSize = -1;
                    return this;
                }

                /* access modifiers changed from: protected */
                public int computeSerializedSize() {
                    int computeSerializedSize = super.computeSerializedSize();
                    if (!Arrays.equals(this.f8831a, WireFormatNano.EMPTY_BYTES)) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f8831a);
                    }
                    return !Arrays.equals(this.f8832b, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f8832b) : computeSerializedSize;
                }

                public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                    while (true) {
                        int readTag = codedInputByteBufferNano.readTag();
                        if (readTag == 0) {
                            break;
                        } else if (readTag == 10) {
                            this.f8831a = codedInputByteBufferNano.readBytes();
                        } else if (readTag == 18) {
                            this.f8832b = codedInputByteBufferNano.readBytes();
                        } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                            break;
                        }
                    }
                    return this;
                }

                public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                    if (!Arrays.equals(this.f8831a, WireFormatNano.EMPTY_BYTES)) {
                        codedOutputByteBufferNano.writeBytes(1, this.f8831a);
                    }
                    if (!Arrays.equals(this.f8832b, WireFormatNano.EMPTY_BYTES)) {
                        codedOutputByteBufferNano.writeBytes(2, this.f8832b);
                    }
                    super.writeTo(codedOutputByteBufferNano);
                }
            }

            /* renamed from: com.yandex.metrica.impl.ob.qf$d$a$c */
            public static final class C3407c extends MessageNano {

                /* renamed from: a */
                public C3320of[] f8833a;

                /* renamed from: b */
                public C3447rf[] f8834b;

                /* renamed from: c */
                public int f8835c;

                /* renamed from: d */
                public String f8836d;

                public C3407c() {
                    mo18082a();
                }

                /* renamed from: a */
                public C3407c mo18082a() {
                    this.f8833a = C3320of.m10245b();
                    this.f8834b = C3447rf.m10643b();
                    this.f8835c = 2;
                    this.f8836d = "";
                    this.cachedSize = -1;
                    return this;
                }

                /* access modifiers changed from: protected */
                public int computeSerializedSize() {
                    int computeSerializedSize = super.computeSerializedSize();
                    C3320of[] ofVarArr = this.f8833a;
                    int i = 0;
                    if (ofVarArr != null && ofVarArr.length > 0) {
                        int i2 = 0;
                        while (true) {
                            C3320of[] ofVarArr2 = this.f8833a;
                            if (i2 >= ofVarArr2.length) {
                                break;
                            }
                            C3320of ofVar = ofVarArr2[i2];
                            if (ofVar != null) {
                                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, ofVar);
                            }
                            i2++;
                        }
                    }
                    C3447rf[] rfVarArr = this.f8834b;
                    if (rfVarArr != null && rfVarArr.length > 0) {
                        while (true) {
                            C3447rf[] rfVarArr2 = this.f8834b;
                            if (i >= rfVarArr2.length) {
                                break;
                            }
                            C3447rf rfVar = rfVarArr2[i];
                            if (rfVar != null) {
                                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, rfVar);
                            }
                            i++;
                        }
                    }
                    int i3 = this.f8835c;
                    if (i3 != 2) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i3);
                    }
                    return !this.f8836d.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(4, this.f8836d) : computeSerializedSize;
                }

                public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                    while (true) {
                        int readTag = codedInputByteBufferNano.readTag();
                        if (readTag == 0) {
                            break;
                        } else if (readTag == 10) {
                            int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                            C3320of[] ofVarArr = this.f8833a;
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
                            this.f8833a = ofVarArr2;
                        } else if (readTag != 18) {
                            if (readTag == 24) {
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
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                        this.f8835c = readInt32;
                                        break;
                                }
                            } else if (readTag == 34) {
                                this.f8836d = codedInputByteBufferNano.readString();
                            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                                break;
                            }
                        } else {
                            int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                            C3447rf[] rfVarArr = this.f8834b;
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
                            this.f8834b = rfVarArr2;
                        }
                    }
                    return this;
                }

                public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                    C3320of[] ofVarArr = this.f8833a;
                    int i = 0;
                    if (ofVarArr != null && ofVarArr.length > 0) {
                        int i2 = 0;
                        while (true) {
                            C3320of[] ofVarArr2 = this.f8833a;
                            if (i2 >= ofVarArr2.length) {
                                break;
                            }
                            C3320of ofVar = ofVarArr2[i2];
                            if (ofVar != null) {
                                codedOutputByteBufferNano.writeMessage(1, ofVar);
                            }
                            i2++;
                        }
                    }
                    C3447rf[] rfVarArr = this.f8834b;
                    if (rfVarArr != null && rfVarArr.length > 0) {
                        while (true) {
                            C3447rf[] rfVarArr2 = this.f8834b;
                            if (i >= rfVarArr2.length) {
                                break;
                            }
                            C3447rf rfVar = rfVarArr2[i];
                            if (rfVar != null) {
                                codedOutputByteBufferNano.writeMessage(2, rfVar);
                            }
                            i++;
                        }
                    }
                    int i3 = this.f8835c;
                    if (i3 != 2) {
                        codedOutputByteBufferNano.writeInt32(3, i3);
                    }
                    if (!this.f8836d.equals("")) {
                        codedOutputByteBufferNano.writeString(4, this.f8836d);
                    }
                    super.writeTo(codedOutputByteBufferNano);
                }
            }

            public C3404a() {
                mo18079a();
            }

            /* renamed from: b */
            public static C3404a[] m10489b() {
                if (f8802y == null) {
                    synchronized (InternalNano.LAZY_INIT_LOCK) {
                        if (f8802y == null) {
                            f8802y = new C3404a[0];
                        }
                    }
                }
                return f8802y;
            }

            /* renamed from: a */
            public C3404a mo18079a() {
                this.f8803a = 0;
                this.f8804b = 0;
                this.f8805c = 0;
                this.f8806d = "";
                byte[] bArr = WireFormatNano.EMPTY_BYTES;
                this.f8807e = bArr;
                this.f8808f = null;
                this.f8809g = null;
                this.f8810h = "";
                this.f8811i = null;
                this.f8812j = 0;
                this.f8813k = 0;
                this.f8814l = -1;
                this.f8815m = bArr;
                this.f8816n = -1;
                this.f8817o = 0;
                this.f8818p = 0;
                this.f8819q = 0;
                this.f8820r = 0;
                this.f8821s = -1;
                this.f8822t = 0;
                this.f8823u = 0;
                this.f8824v = false;
                this.f8825w = 1;
                this.f8826x = C3406b.m10492b();
                this.cachedSize = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            public int computeSerializedSize() {
                int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeUInt64Size(1, this.f8803a) + CodedOutputByteBufferNano.computeUInt64Size(2, this.f8804b) + CodedOutputByteBufferNano.computeUInt32Size(3, this.f8805c);
                if (!this.f8806d.equals("")) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f8806d);
                }
                if (!Arrays.equals(this.f8807e, WireFormatNano.EMPTY_BYTES)) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f8807e);
                }
                C3400b bVar = this.f8808f;
                if (bVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, bVar);
                }
                C3407c cVar = this.f8809g;
                if (cVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, cVar);
                }
                if (!this.f8810h.equals("")) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(8, this.f8810h);
                }
                C3405a aVar = this.f8811i;
                if (aVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(9, aVar);
                }
                int i = this.f8812j;
                if (i != 0) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(10, i);
                }
                int i2 = this.f8813k;
                if (i2 != 0) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(12, i2);
                }
                int i3 = this.f8814l;
                if (i3 != -1) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(13, i3);
                }
                if (!Arrays.equals(this.f8815m, WireFormatNano.EMPTY_BYTES)) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(14, this.f8815m);
                }
                int i4 = this.f8816n;
                if (i4 != -1) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(15, i4);
                }
                long j = this.f8817o;
                if (j != 0) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(16, j);
                }
                long j2 = this.f8818p;
                if (j2 != 0) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(17, j2);
                }
                int i5 = this.f8819q;
                if (i5 != 0) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(18, i5);
                }
                int i6 = this.f8820r;
                if (i6 != 0) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(19, i6);
                }
                int i7 = this.f8821s;
                if (i7 != -1) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(20, i7);
                }
                int i8 = this.f8822t;
                if (i8 != 0) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(21, i8);
                }
                int i9 = this.f8823u;
                if (i9 != 0) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(22, i9);
                }
                boolean z = this.f8824v;
                if (z) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(23, z);
                }
                long j3 = this.f8825w;
                if (j3 != 1) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(24, j3);
                }
                C3406b[] bVarArr = this.f8826x;
                if (bVarArr != null && bVarArr.length > 0) {
                    int i10 = 0;
                    while (true) {
                        C3406b[] bVarArr2 = this.f8826x;
                        if (i10 >= bVarArr2.length) {
                            break;
                        }
                        C3406b bVar2 = bVarArr2[i10];
                        if (bVar2 != null) {
                            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(25, bVar2);
                        }
                        i10++;
                    }
                }
                return computeSerializedSize;
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                while (true) {
                    int readTag = codedInputByteBufferNano.readTag();
                    switch (readTag) {
                        case 0:
                            break;
                        case 8:
                            this.f8803a = codedInputByteBufferNano.readUInt64();
                            continue;
                        case 16:
                            this.f8804b = codedInputByteBufferNano.readUInt64();
                            continue;
                        case 24:
                            this.f8805c = codedInputByteBufferNano.readUInt32();
                            continue;
                        case 34:
                            this.f8806d = codedInputByteBufferNano.readString();
                            continue;
                        case 42:
                            this.f8807e = codedInputByteBufferNano.readBytes();
                            continue;
                        case 50:
                            if (this.f8808f == null) {
                                this.f8808f = new C3400b();
                            }
                            codedInputByteBufferNano.readMessage(this.f8808f);
                            continue;
                        case 58:
                            if (this.f8809g == null) {
                                this.f8809g = new C3407c();
                            }
                            codedInputByteBufferNano.readMessage(this.f8809g);
                            continue;
                        case 66:
                            this.f8810h = codedInputByteBufferNano.readString();
                            continue;
                        case 74:
                            if (this.f8811i == null) {
                                this.f8811i = new C3405a();
                            }
                            codedInputByteBufferNano.readMessage(this.f8811i);
                            continue;
                        case 80:
                            this.f8812j = codedInputByteBufferNano.readUInt32();
                            continue;
                        case 96:
                            int readInt32 = codedInputByteBufferNano.readInt32();
                            if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                                this.f8813k = readInt32;
                                break;
                            } else {
                                continue;
                            }
                        case 104:
                            int readInt322 = codedInputByteBufferNano.readInt32();
                            if (readInt322 == -1 || readInt322 == 0 || readInt322 == 1) {
                                this.f8814l = readInt322;
                                break;
                            } else {
                                continue;
                            }
                        case 114:
                            this.f8815m = codedInputByteBufferNano.readBytes();
                            continue;
                        case 120:
                            int readInt323 = codedInputByteBufferNano.readInt32();
                            if (readInt323 == -1 || readInt323 == 0 || readInt323 == 1) {
                                this.f8816n = readInt323;
                                break;
                            } else {
                                continue;
                            }
                        case 128:
                            this.f8817o = codedInputByteBufferNano.readUInt64();
                            continue;
                        case 136:
                            this.f8818p = codedInputByteBufferNano.readUInt64();
                            continue;
                        case 144:
                            int readInt324 = codedInputByteBufferNano.readInt32();
                            if (readInt324 == 0 || readInt324 == 1 || readInt324 == 2 || readInt324 == 3 || readInt324 == 4) {
                                this.f8819q = readInt324;
                                break;
                            } else {
                                continue;
                            }
                        case 152:
                            int readInt325 = codedInputByteBufferNano.readInt32();
                            if (readInt325 == 0 || readInt325 == 1 || readInt325 == 2 || readInt325 == 3) {
                                this.f8820r = readInt325;
                                break;
                            } else {
                                continue;
                            }
                        case 160:
                            int readInt326 = codedInputByteBufferNano.readInt32();
                            if (readInt326 == -1 || readInt326 == 0 || readInt326 == 1) {
                                this.f8821s = readInt326;
                                break;
                            } else {
                                continue;
                            }
                        case 168:
                            int readInt327 = codedInputByteBufferNano.readInt32();
                            if (readInt327 == 0 || readInt327 == 1 || readInt327 == 2 || readInt327 == 3) {
                                this.f8822t = readInt327;
                                break;
                            } else {
                                continue;
                            }
                        case 176:
                            int readInt328 = codedInputByteBufferNano.readInt32();
                            if (readInt328 == 0 || readInt328 == 1) {
                                this.f8823u = readInt328;
                                break;
                            } else {
                                continue;
                            }
                        case 184:
                            this.f8824v = codedInputByteBufferNano.readBool();
                            continue;
                        case 192:
                            this.f8825w = codedInputByteBufferNano.readUInt64();
                            continue;
                        case LOSS_REASON_CREATIVE_FILTERED_DISAPPROVED_VALUE:
                            int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, LossReason.LOSS_REASON_CREATIVE_FILTERED_DISAPPROVED_VALUE);
                            C3406b[] bVarArr = this.f8826x;
                            int length = bVarArr == null ? 0 : bVarArr.length;
                            int i = repeatedFieldArrayLength + length;
                            C3406b[] bVarArr2 = new C3406b[i];
                            if (length != 0) {
                                System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                            }
                            while (length < i - 1) {
                                bVarArr2[length] = new C3406b();
                                codedInputByteBufferNano.readMessage(bVarArr2[length]);
                                codedInputByteBufferNano.readTag();
                                length++;
                            }
                            bVarArr2[length] = new C3406b();
                            codedInputByteBufferNano.readMessage(bVarArr2[length]);
                            this.f8826x = bVarArr2;
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
                codedOutputByteBufferNano.writeUInt64(1, this.f8803a);
                codedOutputByteBufferNano.writeUInt64(2, this.f8804b);
                codedOutputByteBufferNano.writeUInt32(3, this.f8805c);
                if (!this.f8806d.equals("")) {
                    codedOutputByteBufferNano.writeString(4, this.f8806d);
                }
                if (!Arrays.equals(this.f8807e, WireFormatNano.EMPTY_BYTES)) {
                    codedOutputByteBufferNano.writeBytes(5, this.f8807e);
                }
                C3400b bVar = this.f8808f;
                if (bVar != null) {
                    codedOutputByteBufferNano.writeMessage(6, bVar);
                }
                C3407c cVar = this.f8809g;
                if (cVar != null) {
                    codedOutputByteBufferNano.writeMessage(7, cVar);
                }
                if (!this.f8810h.equals("")) {
                    codedOutputByteBufferNano.writeString(8, this.f8810h);
                }
                C3405a aVar = this.f8811i;
                if (aVar != null) {
                    codedOutputByteBufferNano.writeMessage(9, aVar);
                }
                int i = this.f8812j;
                if (i != 0) {
                    codedOutputByteBufferNano.writeUInt32(10, i);
                }
                int i2 = this.f8813k;
                if (i2 != 0) {
                    codedOutputByteBufferNano.writeInt32(12, i2);
                }
                int i3 = this.f8814l;
                if (i3 != -1) {
                    codedOutputByteBufferNano.writeInt32(13, i3);
                }
                if (!Arrays.equals(this.f8815m, WireFormatNano.EMPTY_BYTES)) {
                    codedOutputByteBufferNano.writeBytes(14, this.f8815m);
                }
                int i4 = this.f8816n;
                if (i4 != -1) {
                    codedOutputByteBufferNano.writeInt32(15, i4);
                }
                long j = this.f8817o;
                if (j != 0) {
                    codedOutputByteBufferNano.writeUInt64(16, j);
                }
                long j2 = this.f8818p;
                if (j2 != 0) {
                    codedOutputByteBufferNano.writeUInt64(17, j2);
                }
                int i5 = this.f8819q;
                if (i5 != 0) {
                    codedOutputByteBufferNano.writeInt32(18, i5);
                }
                int i6 = this.f8820r;
                if (i6 != 0) {
                    codedOutputByteBufferNano.writeInt32(19, i6);
                }
                int i7 = this.f8821s;
                if (i7 != -1) {
                    codedOutputByteBufferNano.writeInt32(20, i7);
                }
                int i8 = this.f8822t;
                if (i8 != 0) {
                    codedOutputByteBufferNano.writeInt32(21, i8);
                }
                int i9 = this.f8823u;
                if (i9 != 0) {
                    codedOutputByteBufferNano.writeInt32(22, i9);
                }
                boolean z = this.f8824v;
                if (z) {
                    codedOutputByteBufferNano.writeBool(23, z);
                }
                long j3 = this.f8825w;
                if (j3 != 1) {
                    codedOutputByteBufferNano.writeUInt64(24, j3);
                }
                C3406b[] bVarArr = this.f8826x;
                if (bVarArr != null && bVarArr.length > 0) {
                    int i10 = 0;
                    while (true) {
                        C3406b[] bVarArr2 = this.f8826x;
                        if (i10 >= bVarArr2.length) {
                            break;
                        }
                        C3406b bVar2 = bVarArr2[i10];
                        if (bVar2 != null) {
                            codedOutputByteBufferNano.writeMessage(25, bVar2);
                        }
                        i10++;
                    }
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.qf$d$b */
        public static final class C3408b extends MessageNano {

            /* renamed from: a */
            public C3410f f8837a;

            /* renamed from: b */
            public String f8838b;

            /* renamed from: c */
            public int f8839c;

            public C3408b() {
                mo18083a();
            }

            /* renamed from: a */
            public C3408b mo18083a() {
                this.f8837a = null;
                this.f8838b = "";
                this.f8839c = 0;
                this.cachedSize = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            public int computeSerializedSize() {
                int computeSerializedSize = super.computeSerializedSize();
                C3410f fVar = this.f8837a;
                if (fVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, fVar);
                }
                int computeStringSize = computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f8838b);
                int i = this.f8839c;
                return i != 0 ? computeStringSize + CodedOutputByteBufferNano.computeInt32Size(5, i) : computeStringSize;
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                while (true) {
                    int readTag = codedInputByteBufferNano.readTag();
                    if (readTag == 0) {
                        break;
                    } else if (readTag == 10) {
                        if (this.f8837a == null) {
                            this.f8837a = new C3410f();
                        }
                        codedInputByteBufferNano.readMessage(this.f8837a);
                    } else if (readTag == 18) {
                        this.f8838b = codedInputByteBufferNano.readString();
                    } else if (readTag == 40) {
                        int readInt32 = codedInputByteBufferNano.readInt32();
                        if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                            this.f8839c = readInt32;
                        }
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    }
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                C3410f fVar = this.f8837a;
                if (fVar != null) {
                    codedOutputByteBufferNano.writeMessage(1, fVar);
                }
                codedOutputByteBufferNano.writeString(2, this.f8838b);
                int i = this.f8839c;
                if (i != 0) {
                    codedOutputByteBufferNano.writeInt32(5, i);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public C3403d() {
            mo18078a();
        }

        /* renamed from: b */
        public static C3403d[] m10487b() {
            if (f8798d == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f8798d == null) {
                        f8798d = new C3403d[0];
                    }
                }
            }
            return f8798d;
        }

        /* renamed from: a */
        public C3403d mo18078a() {
            this.f8799a = 0;
            this.f8800b = null;
            this.f8801c = C3404a.m10489b();
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeUInt64Size(1, this.f8799a);
            C3408b bVar = this.f8800b;
            if (bVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, bVar);
            }
            C3404a[] aVarArr = this.f8801c;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C3404a[] aVarArr2 = this.f8801c;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    C3404a aVar = aVarArr2[i];
                    if (aVar != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, aVar);
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
                } else if (readTag == 8) {
                    this.f8799a = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 18) {
                    if (this.f8800b == null) {
                        this.f8800b = new C3408b();
                    }
                    codedInputByteBufferNano.readMessage(this.f8800b);
                } else if (readTag == 26) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    C3404a[] aVarArr = this.f8801c;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    int i = repeatedFieldArrayLength + length;
                    C3404a[] aVarArr2 = new C3404a[i];
                    if (length != 0) {
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        aVarArr2[length] = new C3404a();
                        codedInputByteBufferNano.readMessage(aVarArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    aVarArr2[length] = new C3404a();
                    codedInputByteBufferNano.readMessage(aVarArr2[length]);
                    this.f8801c = aVarArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeUInt64(1, this.f8799a);
            C3408b bVar = this.f8800b;
            if (bVar != null) {
                codedOutputByteBufferNano.writeMessage(2, bVar);
            }
            C3404a[] aVarArr = this.f8801c;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C3404a[] aVarArr2 = this.f8801c;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    C3404a aVar = aVarArr2[i];
                    if (aVar != null) {
                        codedOutputByteBufferNano.writeMessage(3, aVar);
                    }
                    i++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.qf$e */
    public static final class C3409e extends MessageNano {

        /* renamed from: e */
        private static volatile C3409e[] f8840e;

        /* renamed from: a */
        public int f8841a;

        /* renamed from: b */
        public int f8842b;

        /* renamed from: c */
        public String f8843c;

        /* renamed from: d */
        public boolean f8844d;

        public C3409e() {
            mo18084a();
        }

        /* renamed from: b */
        public static C3409e[] m10496b() {
            if (f8840e == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f8840e == null) {
                        f8840e = new C3409e[0];
                    }
                }
            }
            return f8840e;
        }

        /* renamed from: a */
        public C3409e mo18084a() {
            this.f8841a = 0;
            this.f8842b = 0;
            this.f8843c = "";
            this.f8844d = false;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            int i = this.f8841a;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
            }
            int i2 = this.f8842b;
            if (i2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(2, i2);
            }
            if (!this.f8843c.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f8843c);
            }
            boolean z = this.f8844d;
            return z ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, z) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f8841a = codedInputByteBufferNano.readUInt32();
                } else if (readTag == 16) {
                    this.f8842b = codedInputByteBufferNano.readUInt32();
                } else if (readTag == 26) {
                    this.f8843c = codedInputByteBufferNano.readString();
                } else if (readTag == 32) {
                    this.f8844d = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int i = this.f8841a;
            if (i != 0) {
                codedOutputByteBufferNano.writeUInt32(1, i);
            }
            int i2 = this.f8842b;
            if (i2 != 0) {
                codedOutputByteBufferNano.writeUInt32(2, i2);
            }
            if (!this.f8843c.equals("")) {
                codedOutputByteBufferNano.writeString(3, this.f8843c);
            }
            boolean z = this.f8844d;
            if (z) {
                codedOutputByteBufferNano.writeBool(4, z);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.qf$f */
    public static final class C3410f extends MessageNano {

        /* renamed from: a */
        public long f8845a;

        /* renamed from: b */
        public int f8846b;

        /* renamed from: c */
        public long f8847c;

        /* renamed from: d */
        public boolean f8848d;

        public C3410f() {
            mo18085a();
        }

        /* renamed from: a */
        public C3410f mo18085a() {
            this.f8845a = 0;
            this.f8846b = 0;
            this.f8847c = 0;
            this.f8848d = false;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeUInt64Size(1, this.f8845a) + CodedOutputByteBufferNano.computeSInt32Size(2, this.f8846b);
            long j = this.f8847c;
            if (j != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(3, j);
            }
            boolean z = this.f8848d;
            return z ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, z) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f8845a = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 16) {
                    this.f8846b = codedInputByteBufferNano.readSInt32();
                } else if (readTag == 24) {
                    this.f8847c = codedInputByteBufferNano.readInt64();
                } else if (readTag == 32) {
                    this.f8848d = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeUInt64(1, this.f8845a);
            codedOutputByteBufferNano.writeSInt32(2, this.f8846b);
            long j = this.f8847c;
            if (j != 0) {
                codedOutputByteBufferNano.writeInt64(3, j);
            }
            boolean z = this.f8848d;
            if (z) {
                codedOutputByteBufferNano.writeBool(4, z);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C3398qf() {
        mo18073a();
    }

    /* renamed from: a */
    public C3398qf mo18073a() {
        this.f8765a = C3403d.m10487b();
        this.f8766b = null;
        this.f8767c = C3399a.m10481b();
        this.f8768d = C3409e.m10496b();
        this.f8769e = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3403d[] dVarArr = this.f8765a;
        int i = 0;
        if (dVarArr != null && dVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C3403d[] dVarArr2 = this.f8765a;
                if (i2 >= dVarArr2.length) {
                    break;
                }
                C3403d dVar = dVarArr2[i2];
                if (dVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, dVar);
                }
                i2++;
            }
        }
        C3401c cVar = this.f8766b;
        if (cVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, cVar);
        }
        C3399a[] aVarArr = this.f8767c;
        if (aVarArr != null && aVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                C3399a[] aVarArr2 = this.f8767c;
                if (i3 >= aVarArr2.length) {
                    break;
                }
                C3399a aVar = aVarArr2[i3];
                if (aVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, aVar);
                }
                i3++;
            }
        }
        C3409e[] eVarArr = this.f8768d;
        if (eVarArr != null && eVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                C3409e[] eVarArr2 = this.f8768d;
                if (i4 >= eVarArr2.length) {
                    break;
                }
                C3409e eVar = eVarArr2[i4];
                if (eVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(10, eVar);
                }
                i4++;
            }
        }
        String[] strArr = this.f8769e;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            String[] strArr2 = this.f8769e;
            if (i >= strArr2.length) {
                return computeSerializedSize + i5 + (i6 * 1);
            }
            String str = strArr2[i];
            if (str != null) {
                i6++;
                i5 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
            }
            i++;
        }
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C3403d[] dVarArr = this.f8765a;
                int length = dVarArr == null ? 0 : dVarArr.length;
                int i = repeatedFieldArrayLength + length;
                C3403d[] dVarArr2 = new C3403d[i];
                if (length != 0) {
                    System.arraycopy(dVarArr, 0, dVarArr2, 0, length);
                }
                while (length < i - 1) {
                    dVarArr2[length] = new C3403d();
                    codedInputByteBufferNano.readMessage(dVarArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                dVarArr2[length] = new C3403d();
                codedInputByteBufferNano.readMessage(dVarArr2[length]);
                this.f8765a = dVarArr2;
            } else if (readTag == 34) {
                if (this.f8766b == null) {
                    this.f8766b = new C3401c();
                }
                codedInputByteBufferNano.readMessage(this.f8766b);
            } else if (readTag == 58) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C3399a[] aVarArr = this.f8767c;
                int length2 = aVarArr == null ? 0 : aVarArr.length;
                int i2 = repeatedFieldArrayLength2 + length2;
                C3399a[] aVarArr2 = new C3399a[i2];
                if (length2 != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    aVarArr2[length2] = new C3399a();
                    codedInputByteBufferNano.readMessage(aVarArr2[length2]);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                aVarArr2[length2] = new C3399a();
                codedInputByteBufferNano.readMessage(aVarArr2[length2]);
                this.f8767c = aVarArr2;
            } else if (readTag == 82) {
                int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                C3409e[] eVarArr = this.f8768d;
                int length3 = eVarArr == null ? 0 : eVarArr.length;
                int i3 = repeatedFieldArrayLength3 + length3;
                C3409e[] eVarArr2 = new C3409e[i3];
                if (length3 != 0) {
                    System.arraycopy(eVarArr, 0, eVarArr2, 0, length3);
                }
                while (length3 < i3 - 1) {
                    eVarArr2[length3] = new C3409e();
                    codedInputByteBufferNano.readMessage(eVarArr2[length3]);
                    codedInputByteBufferNano.readTag();
                    length3++;
                }
                eVarArr2[length3] = new C3409e();
                codedInputByteBufferNano.readMessage(eVarArr2[length3]);
                this.f8768d = eVarArr2;
            } else if (readTag == 90) {
                int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                String[] strArr = this.f8769e;
                int length4 = strArr == null ? 0 : strArr.length;
                int i4 = repeatedFieldArrayLength4 + length4;
                String[] strArr2 = new String[i4];
                if (length4 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length4);
                }
                while (length4 < i4 - 1) {
                    strArr2[length4] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length4++;
                }
                strArr2[length4] = codedInputByteBufferNano.readString();
                this.f8769e = strArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3403d[] dVarArr = this.f8765a;
        int i = 0;
        if (dVarArr != null && dVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C3403d[] dVarArr2 = this.f8765a;
                if (i2 >= dVarArr2.length) {
                    break;
                }
                C3403d dVar = dVarArr2[i2];
                if (dVar != null) {
                    codedOutputByteBufferNano.writeMessage(3, dVar);
                }
                i2++;
            }
        }
        C3401c cVar = this.f8766b;
        if (cVar != null) {
            codedOutputByteBufferNano.writeMessage(4, cVar);
        }
        C3399a[] aVarArr = this.f8767c;
        if (aVarArr != null && aVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                C3399a[] aVarArr2 = this.f8767c;
                if (i3 >= aVarArr2.length) {
                    break;
                }
                C3399a aVar = aVarArr2[i3];
                if (aVar != null) {
                    codedOutputByteBufferNano.writeMessage(7, aVar);
                }
                i3++;
            }
        }
        C3409e[] eVarArr = this.f8768d;
        if (eVarArr != null && eVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                C3409e[] eVarArr2 = this.f8768d;
                if (i4 >= eVarArr2.length) {
                    break;
                }
                C3409e eVar = eVarArr2[i4];
                if (eVar != null) {
                    codedOutputByteBufferNano.writeMessage(10, eVar);
                }
                i4++;
            }
        }
        String[] strArr = this.f8769e;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f8769e;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(11, str);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
