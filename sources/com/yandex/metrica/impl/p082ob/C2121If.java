package com.yandex.metrica.impl.p082ob;

import com.appodeal.ads.modules.common.internal.Constants;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.google.protobuf.nano.p091ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.p091ym.InternalNano;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.google.protobuf.nano.p091ym.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;
import p152ms.p153bd.p154o.Pgl.C5643c;

/* renamed from: com.yandex.metrica.impl.ob.If */
public final class C2121If extends MessageNano {

    /* renamed from: A */
    public String f5558A;

    /* renamed from: B */
    public String f5559B;

    /* renamed from: C */
    public long f5560C;

    /* renamed from: D */
    public long f5561D;

    /* renamed from: E */
    public boolean f5562E;

    /* renamed from: F */
    public C2143n f5563F;

    /* renamed from: G */
    public C2133j f5564G;

    /* renamed from: H */
    public int f5565H;

    /* renamed from: I */
    public int f5566I;

    /* renamed from: J */
    public C2153w f5567J;

    /* renamed from: K */
    public C2152v f5568K;

    /* renamed from: L */
    public C2152v f5569L;

    /* renamed from: M */
    public C2152v f5570M;

    /* renamed from: N */
    public C2150t f5571N;

    /* renamed from: O */
    public C2126c f5572O;

    /* renamed from: P */
    public C2129f f5573P;

    /* renamed from: Q */
    public String[] f5574Q;

    /* renamed from: R */
    public C2125b f5575R;

    /* renamed from: S */
    public C2122a f5576S;

    /* renamed from: T */
    public C2131h f5577T;

    /* renamed from: U */
    public C2130g f5578U;

    /* renamed from: V */
    public C2148r f5579V;

    /* renamed from: W */
    public C2141l[] f5580W;

    /* renamed from: a */
    public String f5581a;

    /* renamed from: b */
    public long f5582b;

    /* renamed from: c */
    public String[] f5583c;

    /* renamed from: d */
    public String f5584d;

    /* renamed from: e */
    public String f5585e;

    /* renamed from: f */
    public String[] f5586f;

    /* renamed from: g */
    public String[] f5587g;

    /* renamed from: h */
    public String[] f5588h;

    /* renamed from: i */
    public String[] f5589i;

    /* renamed from: j */
    public C2127d[] f5590j;

    /* renamed from: k */
    public C2132i f5591k;

    /* renamed from: l */
    public C2134k[] f5592l;

    /* renamed from: m */
    public C2147q f5593m;

    /* renamed from: n */
    public C2144o[] f5594n;

    /* renamed from: o */
    public String f5595o;

    /* renamed from: p */
    public String f5596p;

    /* renamed from: q */
    public String f5597q;

    /* renamed from: r */
    public boolean f5598r;

    /* renamed from: s */
    public String f5599s;

    /* renamed from: t */
    public String[] f5600t;

    /* renamed from: u */
    public C2149s f5601u;

    /* renamed from: v */
    public boolean f5602v;

    /* renamed from: w */
    public C2142m[] f5603w;

    /* renamed from: x */
    public C2146p f5604x;

    /* renamed from: y */
    public String f5605y;

    /* renamed from: z */
    public String f5606z;

    /* renamed from: com.yandex.metrica.impl.ob.If$a */
    public static final class C2122a extends MessageNano {

        /* renamed from: a */
        public C2124b[] f5607a;

        /* renamed from: com.yandex.metrica.impl.ob.If$a$a */
        public static final class C2123a extends MessageNano {

            /* renamed from: a */
            public String f5608a;

            public C2123a() {
                mo15900a();
            }

            /* renamed from: a */
            public C2123a mo15900a() {
                this.f5608a = "";
                this.cachedSize = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            public int computeSerializedSize() {
                int computeSerializedSize = super.computeSerializedSize();
                return !this.f5608a.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(1, this.f5608a) : computeSerializedSize;
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                while (true) {
                    int readTag = codedInputByteBufferNano.readTag();
                    if (readTag == 0) {
                        break;
                    } else if (readTag == 10) {
                        this.f5608a = codedInputByteBufferNano.readString();
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    }
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                if (!this.f5608a.equals("")) {
                    codedOutputByteBufferNano.writeString(1, this.f5608a);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.If$a$b */
        public static final class C2124b extends MessageNano {

            /* renamed from: c */
            private static volatile C2124b[] f5609c;

            /* renamed from: a */
            public String f5610a;

            /* renamed from: b */
            public C2123a f5611b;

            public C2124b() {
                mo15901a();
            }

            /* renamed from: b */
            public static C2124b[] m7378b() {
                if (f5609c == null) {
                    synchronized (InternalNano.LAZY_INIT_LOCK) {
                        if (f5609c == null) {
                            f5609c = new C2124b[0];
                        }
                    }
                }
                return f5609c;
            }

            /* renamed from: a */
            public C2124b mo15901a() {
                this.f5610a = "";
                this.f5611b = null;
                this.cachedSize = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            public int computeSerializedSize() {
                int computeSerializedSize = super.computeSerializedSize();
                if (!this.f5610a.equals("")) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f5610a);
                }
                C2123a aVar = this.f5611b;
                return aVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, aVar) : computeSerializedSize;
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                while (true) {
                    int readTag = codedInputByteBufferNano.readTag();
                    if (readTag == 0) {
                        break;
                    } else if (readTag == 10) {
                        this.f5610a = codedInputByteBufferNano.readString();
                    } else if (readTag == 18) {
                        if (this.f5611b == null) {
                            this.f5611b = new C2123a();
                        }
                        codedInputByteBufferNano.readMessage(this.f5611b);
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    }
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                if (!this.f5610a.equals("")) {
                    codedOutputByteBufferNano.writeString(1, this.f5610a);
                }
                C2123a aVar = this.f5611b;
                if (aVar != null) {
                    codedOutputByteBufferNano.writeMessage(2, aVar);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public C2122a() {
            mo15899a();
        }

        /* renamed from: a */
        public C2122a mo15899a() {
            this.f5607a = C2124b.m7378b();
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            C2124b[] bVarArr = this.f5607a;
            if (bVarArr != null && bVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C2124b[] bVarArr2 = this.f5607a;
                    if (i >= bVarArr2.length) {
                        break;
                    }
                    C2124b bVar = bVarArr2[i];
                    if (bVar != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, bVar);
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
                    C2124b[] bVarArr = this.f5607a;
                    int length = bVarArr == null ? 0 : bVarArr.length;
                    int i = repeatedFieldArrayLength + length;
                    C2124b[] bVarArr2 = new C2124b[i];
                    if (length != 0) {
                        System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        bVarArr2[length] = new C2124b();
                        codedInputByteBufferNano.readMessage(bVarArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    bVarArr2[length] = new C2124b();
                    codedInputByteBufferNano.readMessage(bVarArr2[length]);
                    this.f5607a = bVarArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            C2124b[] bVarArr = this.f5607a;
            if (bVarArr != null && bVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C2124b[] bVarArr2 = this.f5607a;
                    if (i >= bVarArr2.length) {
                        break;
                    }
                    C2124b bVar = bVarArr2[i];
                    if (bVar != null) {
                        codedOutputByteBufferNano.writeMessage(1, bVar);
                    }
                    i++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.If$b */
    public static final class C2125b extends MessageNano {

        /* renamed from: a */
        public int f5612a;

        /* renamed from: b */
        public int f5613b;

        public C2125b() {
            mo15902a();
        }

        /* renamed from: a */
        public C2125b mo15902a() {
            this.f5612a = 86400;
            this.f5613b = 86400;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            int i = this.f5612a;
            if (i != 86400) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
            }
            int i2 = this.f5613b;
            return i2 != 86400 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i2) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f5612a = codedInputByteBufferNano.readInt32();
                } else if (readTag == 16) {
                    this.f5613b = codedInputByteBufferNano.readInt32();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int i = this.f5612a;
            if (i != 86400) {
                codedOutputByteBufferNano.writeInt32(1, i);
            }
            int i2 = this.f5613b;
            if (i2 != 86400) {
                codedOutputByteBufferNano.writeInt32(2, i2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.If$c */
    public static final class C2126c extends MessageNano {

        /* renamed from: a */
        public long f5614a;

        /* renamed from: b */
        public long f5615b;

        /* renamed from: c */
        public long f5616c;

        /* renamed from: d */
        public long f5617d;

        public C2126c() {
            mo15903a();
        }

        /* renamed from: a */
        public C2126c mo15903a() {
            this.f5614a = 10000;
            this.f5615b = 10000;
            this.f5616c = 10000;
            this.f5617d = 10000;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            long j = this.f5614a;
            if (j != 10000) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
            }
            long j2 = this.f5615b;
            if (j2 != 10000) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j2);
            }
            long j3 = this.f5616c;
            if (j3 != 10000) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(3, j3);
            }
            long j4 = this.f5617d;
            return j4 != 10000 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(4, j4) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f5614a = codedInputByteBufferNano.readInt64();
                } else if (readTag == 16) {
                    this.f5615b = codedInputByteBufferNano.readInt64();
                } else if (readTag == 24) {
                    this.f5616c = codedInputByteBufferNano.readInt64();
                } else if (readTag == 32) {
                    this.f5617d = codedInputByteBufferNano.readInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long j = this.f5614a;
            if (j != 10000) {
                codedOutputByteBufferNano.writeInt64(1, j);
            }
            long j2 = this.f5615b;
            if (j2 != 10000) {
                codedOutputByteBufferNano.writeInt64(2, j2);
            }
            long j3 = this.f5616c;
            if (j3 != 10000) {
                codedOutputByteBufferNano.writeInt64(3, j3);
            }
            long j4 = this.f5617d;
            if (j4 != 10000) {
                codedOutputByteBufferNano.writeInt64(4, j4);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.If$d */
    public static final class C2127d extends MessageNano {

        /* renamed from: c */
        private static volatile C2127d[] f5618c;

        /* renamed from: a */
        public String f5619a;

        /* renamed from: b */
        public String[] f5620b;

        public C2127d() {
            mo15904a();
        }

        /* renamed from: b */
        public static C2127d[] m7382b() {
            if (f5618c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f5618c == null) {
                        f5618c = new C2127d[0];
                    }
                }
            }
            return f5618c;
        }

        /* renamed from: a */
        public C2127d mo15904a() {
            this.f5619a = "";
            this.f5620b = WireFormatNano.EMPTY_STRING_ARRAY;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.f5619a.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f5619a);
            }
            String[] strArr = this.f5620b;
            if (strArr == null || strArr.length <= 0) {
                return computeSerializedSize;
            }
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.f5620b;
                if (i >= strArr2.length) {
                    return computeSerializedSize + i2 + (i3 * 1);
                }
                String str = strArr2[i];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
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
                    this.f5619a = codedInputByteBufferNano.readString();
                } else if (readTag == 18) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                    String[] strArr = this.f5620b;
                    int length = strArr == null ? 0 : strArr.length;
                    int i = repeatedFieldArrayLength + length;
                    String[] strArr2 = new String[i];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.f5620b = strArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.f5619a.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.f5619a);
            }
            String[] strArr = this.f5620b;
            if (strArr != null && strArr.length > 0) {
                int i = 0;
                while (true) {
                    String[] strArr2 = this.f5620b;
                    if (i >= strArr2.length) {
                        break;
                    }
                    String str = strArr2[i];
                    if (str != null) {
                        codedOutputByteBufferNano.writeString(2, str);
                    }
                    i++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.If$e */
    public static final class C2128e extends MessageNano {

        /* renamed from: a */
        public long f5621a;

        /* renamed from: b */
        public int f5622b;

        public C2128e() {
            mo15905a();
        }

        /* renamed from: a */
        public C2128e mo15905a() {
            this.f5621a = 0;
            this.f5622b = 86400;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt64Size(1, this.f5621a);
            int i = this.f5622b;
            return i != 86400 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f5621a = codedInputByteBufferNano.readInt64();
                } else if (readTag == 16) {
                    this.f5622b = codedInputByteBufferNano.readInt32();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt64(1, this.f5621a);
            int i = this.f5622b;
            if (i != 86400) {
                codedOutputByteBufferNano.writeInt32(2, i);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.If$f */
    public static final class C2129f extends MessageNano {

        /* renamed from: a */
        public C2128e f5623a;

        /* renamed from: b */
        public C2128e f5624b;

        /* renamed from: c */
        public C2128e f5625c;

        public C2129f() {
            mo15906a();
        }

        /* renamed from: a */
        public C2129f mo15906a() {
            this.f5623a = null;
            this.f5624b = null;
            this.f5625c = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            C2128e eVar = this.f5623a;
            if (eVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, eVar);
            }
            C2128e eVar2 = this.f5624b;
            if (eVar2 != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, eVar2);
            }
            C2128e eVar3 = this.f5625c;
            return eVar3 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, eVar3) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    if (this.f5623a == null) {
                        this.f5623a = new C2128e();
                    }
                    codedInputByteBufferNano.readMessage(this.f5623a);
                } else if (readTag == 18) {
                    if (this.f5624b == null) {
                        this.f5624b = new C2128e();
                    }
                    codedInputByteBufferNano.readMessage(this.f5624b);
                } else if (readTag == 26) {
                    if (this.f5625c == null) {
                        this.f5625c = new C2128e();
                    }
                    codedInputByteBufferNano.readMessage(this.f5625c);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            C2128e eVar = this.f5623a;
            if (eVar != null) {
                codedOutputByteBufferNano.writeMessage(1, eVar);
            }
            C2128e eVar2 = this.f5624b;
            if (eVar2 != null) {
                codedOutputByteBufferNano.writeMessage(2, eVar2);
            }
            C2128e eVar3 = this.f5625c;
            if (eVar3 != null) {
                codedOutputByteBufferNano.writeMessage(3, eVar3);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.If$g */
    public static final class C2130g extends MessageNano {

        /* renamed from: a */
        public long f5626a;

        public C2130g() {
            mo15907a();
        }

        /* renamed from: a */
        public C2130g mo15907a() {
            this.f5626a = 1209600;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            long j = this.f5626a;
            return j != 1209600 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(1, j) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f5626a = codedInputByteBufferNano.readUInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long j = this.f5626a;
            if (j != 1209600) {
                codedOutputByteBufferNano.writeUInt64(1, j);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.If$h */
    public static final class C2131h extends MessageNano {

        /* renamed from: a */
        public String f5627a;

        /* renamed from: b */
        public int f5628b;

        /* renamed from: c */
        public int f5629c;

        /* renamed from: d */
        public boolean f5630d;

        /* renamed from: e */
        public boolean f5631e;

        public C2131h() {
            mo15908a();
        }

        /* renamed from: a */
        public C2131h mo15908a() {
            this.f5627a = "";
            this.f5628b = 600;
            this.f5629c = C5643c.COLLECT_MODE_FINANCE;
            this.f5630d = false;
            this.f5631e = true;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.f5627a.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f5627a);
            }
            int i = this.f5628b;
            if (i != 600) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(2, i);
            }
            int i2 = this.f5629c;
            if (i2 != 300) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i2);
            }
            boolean z = this.f5630d;
            if (z) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z);
            }
            boolean z2 = this.f5631e;
            return !z2 ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(5, z2) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f5627a = codedInputByteBufferNano.readString();
                } else if (readTag == 16) {
                    this.f5628b = codedInputByteBufferNano.readUInt32();
                } else if (readTag == 24) {
                    this.f5629c = codedInputByteBufferNano.readUInt32();
                } else if (readTag == 32) {
                    this.f5630d = codedInputByteBufferNano.readBool();
                } else if (readTag == 40) {
                    this.f5631e = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.f5627a.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.f5627a);
            }
            int i = this.f5628b;
            if (i != 600) {
                codedOutputByteBufferNano.writeUInt32(2, i);
            }
            int i2 = this.f5629c;
            if (i2 != 300) {
                codedOutputByteBufferNano.writeUInt32(3, i2);
            }
            boolean z = this.f5630d;
            if (z) {
                codedOutputByteBufferNano.writeBool(4, z);
            }
            boolean z2 = this.f5631e;
            if (!z2) {
                codedOutputByteBufferNano.writeBool(5, z2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.If$i */
    public static final class C2132i extends MessageNano {

        /* renamed from: a */
        public boolean f5632a;

        /* renamed from: b */
        public boolean f5633b;

        /* renamed from: c */
        public boolean f5634c;

        /* renamed from: d */
        public boolean f5635d;

        /* renamed from: e */
        public boolean f5636e;

        /* renamed from: f */
        public boolean f5637f;

        /* renamed from: g */
        public boolean f5638g;

        /* renamed from: h */
        public boolean f5639h;

        /* renamed from: i */
        public boolean f5640i;

        /* renamed from: j */
        public boolean f5641j;

        /* renamed from: k */
        public boolean f5642k;

        /* renamed from: l */
        public boolean f5643l;

        /* renamed from: m */
        public boolean f5644m;

        /* renamed from: n */
        public boolean f5645n;

        /* renamed from: o */
        public boolean f5646o;

        /* renamed from: p */
        public boolean f5647p;

        /* renamed from: q */
        public boolean f5648q;

        /* renamed from: r */
        public boolean f5649r;

        /* renamed from: s */
        public boolean f5650s;

        /* renamed from: t */
        public boolean f5651t;

        /* renamed from: u */
        public boolean f5652u;

        /* renamed from: v */
        public boolean f5653v;

        /* renamed from: w */
        public boolean f5654w;

        /* renamed from: x */
        public int f5655x;

        public C2132i() {
            mo15909a();
        }

        /* renamed from: a */
        public C2132i mo15909a() {
            this.f5632a = false;
            this.f5633b = false;
            this.f5634c = false;
            this.f5635d = false;
            this.f5636e = false;
            this.f5637f = false;
            this.f5638g = false;
            this.f5639h = false;
            this.f5640i = false;
            this.f5641j = false;
            this.f5642k = true;
            this.f5643l = false;
            this.f5644m = false;
            this.f5645n = false;
            this.f5646o = false;
            this.f5647p = false;
            this.f5648q = false;
            this.f5649r = false;
            this.f5650s = false;
            this.f5651t = true;
            this.f5652u = false;
            this.f5653v = false;
            this.f5654w = false;
            this.f5655x = -1;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeBoolSize(1, this.f5632a) + CodedOutputByteBufferNano.computeBoolSize(2, this.f5633b) + CodedOutputByteBufferNano.computeBoolSize(3, this.f5634c) + CodedOutputByteBufferNano.computeBoolSize(4, this.f5635d) + CodedOutputByteBufferNano.computeBoolSize(6, this.f5636e) + CodedOutputByteBufferNano.computeBoolSize(8, this.f5637f) + CodedOutputByteBufferNano.computeBoolSize(9, this.f5638g) + CodedOutputByteBufferNano.computeBoolSize(11, this.f5639h) + CodedOutputByteBufferNano.computeBoolSize(12, this.f5640i) + CodedOutputByteBufferNano.computeBoolSize(15, this.f5641j) + CodedOutputByteBufferNano.computeBoolSize(16, this.f5642k) + CodedOutputByteBufferNano.computeBoolSize(18, this.f5643l) + CodedOutputByteBufferNano.computeBoolSize(19, this.f5644m) + CodedOutputByteBufferNano.computeBoolSize(21, this.f5645n) + CodedOutputByteBufferNano.computeBoolSize(22, this.f5646o) + CodedOutputByteBufferNano.computeBoolSize(23, this.f5647p) + CodedOutputByteBufferNano.computeBoolSize(24, this.f5648q) + CodedOutputByteBufferNano.computeBoolSize(25, this.f5649r) + CodedOutputByteBufferNano.computeBoolSize(26, this.f5650s) + CodedOutputByteBufferNano.computeBoolSize(27, this.f5651t) + CodedOutputByteBufferNano.computeBoolSize(28, this.f5652u);
            boolean z = this.f5653v;
            if (z) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(29, z);
            }
            boolean z2 = this.f5654w;
            if (z2) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(33, z2);
            }
            int i = this.f5655x;
            return i != -1 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(34, i) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                switch (readTag) {
                    case 0:
                        break;
                    case 8:
                        this.f5632a = codedInputByteBufferNano.readBool();
                        continue;
                    case 16:
                        this.f5633b = codedInputByteBufferNano.readBool();
                        continue;
                    case 24:
                        this.f5634c = codedInputByteBufferNano.readBool();
                        continue;
                    case 32:
                        this.f5635d = codedInputByteBufferNano.readBool();
                        continue;
                    case 48:
                        this.f5636e = codedInputByteBufferNano.readBool();
                        continue;
                    case 64:
                        this.f5637f = codedInputByteBufferNano.readBool();
                        continue;
                    case 72:
                        this.f5638g = codedInputByteBufferNano.readBool();
                        continue;
                    case 88:
                        this.f5639h = codedInputByteBufferNano.readBool();
                        continue;
                    case 96:
                        this.f5640i = codedInputByteBufferNano.readBool();
                        continue;
                    case 120:
                        this.f5641j = codedInputByteBufferNano.readBool();
                        continue;
                    case 128:
                        this.f5642k = codedInputByteBufferNano.readBool();
                        continue;
                    case 144:
                        this.f5643l = codedInputByteBufferNano.readBool();
                        continue;
                    case 152:
                        this.f5644m = codedInputByteBufferNano.readBool();
                        continue;
                    case 168:
                        this.f5645n = codedInputByteBufferNano.readBool();
                        continue;
                    case 176:
                        this.f5646o = codedInputByteBufferNano.readBool();
                        continue;
                    case 184:
                        this.f5647p = codedInputByteBufferNano.readBool();
                        continue;
                    case 192:
                        this.f5648q = codedInputByteBufferNano.readBool();
                        continue;
                    case 200:
                        this.f5649r = codedInputByteBufferNano.readBool();
                        continue;
                    case LOSS_REASON_CREATIVE_FILTERED_CATEGORY_EXCLUSIONS_VALUE:
                        this.f5650s = codedInputByteBufferNano.readBool();
                        continue;
                    case 216:
                        this.f5651t = codedInputByteBufferNano.readBool();
                        continue;
                    case 224:
                        this.f5652u = codedInputByteBufferNano.readBool();
                        continue;
                    case 232:
                        this.f5653v = codedInputByteBufferNano.readBool();
                        continue;
                    case 264:
                        this.f5654w = codedInputByteBufferNano.readBool();
                        continue;
                    case 272:
                        int readInt32 = codedInputByteBufferNano.readInt32();
                        if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                            this.f5655x = readInt32;
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
            codedOutputByteBufferNano.writeBool(1, this.f5632a);
            codedOutputByteBufferNano.writeBool(2, this.f5633b);
            codedOutputByteBufferNano.writeBool(3, this.f5634c);
            codedOutputByteBufferNano.writeBool(4, this.f5635d);
            codedOutputByteBufferNano.writeBool(6, this.f5636e);
            codedOutputByteBufferNano.writeBool(8, this.f5637f);
            codedOutputByteBufferNano.writeBool(9, this.f5638g);
            codedOutputByteBufferNano.writeBool(11, this.f5639h);
            codedOutputByteBufferNano.writeBool(12, this.f5640i);
            codedOutputByteBufferNano.writeBool(15, this.f5641j);
            codedOutputByteBufferNano.writeBool(16, this.f5642k);
            codedOutputByteBufferNano.writeBool(18, this.f5643l);
            codedOutputByteBufferNano.writeBool(19, this.f5644m);
            codedOutputByteBufferNano.writeBool(21, this.f5645n);
            codedOutputByteBufferNano.writeBool(22, this.f5646o);
            codedOutputByteBufferNano.writeBool(23, this.f5647p);
            codedOutputByteBufferNano.writeBool(24, this.f5648q);
            codedOutputByteBufferNano.writeBool(25, this.f5649r);
            codedOutputByteBufferNano.writeBool(26, this.f5650s);
            codedOutputByteBufferNano.writeBool(27, this.f5651t);
            codedOutputByteBufferNano.writeBool(28, this.f5652u);
            boolean z = this.f5653v;
            if (z) {
                codedOutputByteBufferNano.writeBool(29, z);
            }
            boolean z2 = this.f5654w;
            if (z2) {
                codedOutputByteBufferNano.writeBool(33, z2);
            }
            int i = this.f5655x;
            if (i != -1) {
                codedOutputByteBufferNano.writeInt32(34, i);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.If$j */
    public static final class C2133j extends MessageNano {

        /* renamed from: a */
        public long f5656a;

        public C2133j() {
            mo15910a();
        }

        /* renamed from: a */
        public C2133j mo15910a() {
            this.f5656a = 900;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            return super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt64Size(1, this.f5656a);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f5656a = codedInputByteBufferNano.readInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt64(1, this.f5656a);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.If$k */
    public static final class C2134k extends MessageNano {

        /* renamed from: c */
        private static volatile C2134k[] f5657c;

        /* renamed from: a */
        public C2135a f5658a;

        /* renamed from: b */
        public C2140b f5659b;

        /* renamed from: com.yandex.metrica.impl.ob.If$k$a */
        public static final class C2135a extends MessageNano {

            /* renamed from: a */
            public long f5660a;

            /* renamed from: b */
            public float f5661b;

            /* renamed from: c */
            public int f5662c;

            /* renamed from: d */
            public int f5663d;

            /* renamed from: e */
            public long f5664e;

            /* renamed from: f */
            public int f5665f;

            /* renamed from: g */
            public boolean f5666g;

            /* renamed from: h */
            public boolean f5667h;

            /* renamed from: i */
            public boolean f5668i;

            /* renamed from: j */
            public long f5669j;

            /* renamed from: k */
            public C2136a f5670k;

            /* renamed from: l */
            public C2136a f5671l;

            /* renamed from: m */
            public C2136a f5672m;

            /* renamed from: n */
            public C2136a f5673n;

            /* renamed from: o */
            public C2138b f5674o;

            /* renamed from: p */
            public boolean f5675p;

            /* renamed from: q */
            public boolean f5676q;

            /* renamed from: com.yandex.metrica.impl.ob.If$k$a$a */
            public static final class C2136a extends MessageNano {

                /* renamed from: a */
                public boolean f5677a;

                /* renamed from: b */
                public boolean f5678b;

                /* renamed from: c */
                public C2137a f5679c;

                /* renamed from: com.yandex.metrica.impl.ob.If$k$a$a$a */
                public static final class C2137a extends MessageNano {

                    /* renamed from: a */
                    public long f5680a;

                    /* renamed from: b */
                    public long f5681b;

                    public C2137a() {
                        mo15914a();
                    }

                    /* renamed from: a */
                    public C2137a mo15914a() {
                        this.f5680a = 0;
                        this.f5681b = 0;
                        this.cachedSize = -1;
                        return this;
                    }

                    /* access modifiers changed from: protected */
                    public int computeSerializedSize() {
                        return super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt64Size(1, this.f5680a) + CodedOutputByteBufferNano.computeInt64Size(2, this.f5681b);
                    }

                    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                        while (true) {
                            int readTag = codedInputByteBufferNano.readTag();
                            if (readTag == 0) {
                                break;
                            } else if (readTag == 8) {
                                this.f5680a = codedInputByteBufferNano.readInt64();
                            } else if (readTag == 16) {
                                this.f5681b = codedInputByteBufferNano.readInt64();
                            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                                break;
                            }
                        }
                        return this;
                    }

                    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                        codedOutputByteBufferNano.writeInt64(1, this.f5680a);
                        codedOutputByteBufferNano.writeInt64(2, this.f5681b);
                        super.writeTo(codedOutputByteBufferNano);
                    }
                }

                public C2136a() {
                    mo15913a();
                }

                /* renamed from: a */
                public C2136a mo15913a() {
                    this.f5677a = true;
                    this.f5678b = false;
                    this.f5679c = null;
                    this.cachedSize = -1;
                    return this;
                }

                /* access modifiers changed from: protected */
                public int computeSerializedSize() {
                    int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeBoolSize(1, this.f5677a) + CodedOutputByteBufferNano.computeBoolSize(2, this.f5678b);
                    C2137a aVar = this.f5679c;
                    return aVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, aVar) : computeSerializedSize;
                }

                public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                    while (true) {
                        int readTag = codedInputByteBufferNano.readTag();
                        if (readTag == 0) {
                            break;
                        } else if (readTag == 8) {
                            this.f5677a = codedInputByteBufferNano.readBool();
                        } else if (readTag == 16) {
                            this.f5678b = codedInputByteBufferNano.readBool();
                        } else if (readTag == 26) {
                            if (this.f5679c == null) {
                                this.f5679c = new C2137a();
                            }
                            codedInputByteBufferNano.readMessage(this.f5679c);
                        } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                            break;
                        }
                    }
                    return this;
                }

                public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                    codedOutputByteBufferNano.writeBool(1, this.f5677a);
                    codedOutputByteBufferNano.writeBool(2, this.f5678b);
                    C2137a aVar = this.f5679c;
                    if (aVar != null) {
                        codedOutputByteBufferNano.writeMessage(3, aVar);
                    }
                    super.writeTo(codedOutputByteBufferNano);
                }
            }

            /* renamed from: com.yandex.metrica.impl.ob.If$k$a$b */
            public static final class C2138b extends MessageNano {

                /* renamed from: a */
                public boolean f5682a;

                /* renamed from: b */
                public boolean f5683b;

                /* renamed from: c */
                public C2139a f5684c;

                /* renamed from: com.yandex.metrica.impl.ob.If$k$a$b$a */
                public static final class C2139a extends MessageNano {

                    /* renamed from: a */
                    public long f5685a;

                    /* renamed from: b */
                    public long f5686b;

                    /* renamed from: c */
                    public int f5687c;

                    public C2139a() {
                        mo15916a();
                    }

                    /* renamed from: a */
                    public C2139a mo15916a() {
                        this.f5685a = 0;
                        this.f5686b = 0;
                        this.f5687c = 0;
                        this.cachedSize = -1;
                        return this;
                    }

                    /* access modifiers changed from: protected */
                    public int computeSerializedSize() {
                        return super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt64Size(1, this.f5685a) + CodedOutputByteBufferNano.computeInt64Size(2, this.f5686b) + CodedOutputByteBufferNano.computeInt32Size(3, this.f5687c);
                    }

                    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                        while (true) {
                            int readTag = codedInputByteBufferNano.readTag();
                            if (readTag == 0) {
                                break;
                            } else if (readTag == 8) {
                                this.f5685a = codedInputByteBufferNano.readInt64();
                            } else if (readTag == 16) {
                                this.f5686b = codedInputByteBufferNano.readInt64();
                            } else if (readTag == 24) {
                                int readInt32 = codedInputByteBufferNano.readInt32();
                                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                                    this.f5687c = readInt32;
                                }
                            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                                break;
                            }
                        }
                        return this;
                    }

                    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                        codedOutputByteBufferNano.writeInt64(1, this.f5685a);
                        codedOutputByteBufferNano.writeInt64(2, this.f5686b);
                        codedOutputByteBufferNano.writeInt32(3, this.f5687c);
                        super.writeTo(codedOutputByteBufferNano);
                    }
                }

                public C2138b() {
                    mo15915a();
                }

                /* renamed from: a */
                public C2138b mo15915a() {
                    this.f5682a = true;
                    this.f5683b = false;
                    this.f5684c = null;
                    this.cachedSize = -1;
                    return this;
                }

                /* access modifiers changed from: protected */
                public int computeSerializedSize() {
                    int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeBoolSize(1, this.f5682a) + CodedOutputByteBufferNano.computeBoolSize(2, this.f5683b);
                    C2139a aVar = this.f5684c;
                    return aVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, aVar) : computeSerializedSize;
                }

                public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                    while (true) {
                        int readTag = codedInputByteBufferNano.readTag();
                        if (readTag == 0) {
                            break;
                        } else if (readTag == 8) {
                            this.f5682a = codedInputByteBufferNano.readBool();
                        } else if (readTag == 16) {
                            this.f5683b = codedInputByteBufferNano.readBool();
                        } else if (readTag == 26) {
                            if (this.f5684c == null) {
                                this.f5684c = new C2139a();
                            }
                            codedInputByteBufferNano.readMessage(this.f5684c);
                        } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                            break;
                        }
                    }
                    return this;
                }

                public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                    codedOutputByteBufferNano.writeBool(1, this.f5682a);
                    codedOutputByteBufferNano.writeBool(2, this.f5683b);
                    C2139a aVar = this.f5684c;
                    if (aVar != null) {
                        codedOutputByteBufferNano.writeMessage(3, aVar);
                    }
                    super.writeTo(codedOutputByteBufferNano);
                }
            }

            public C2135a() {
                mo15912a();
            }

            /* renamed from: a */
            public C2135a mo15912a() {
                this.f5660a = 5000;
                this.f5661b = 10.0f;
                this.f5662c = 20;
                this.f5663d = 200;
                this.f5664e = 60000;
                this.f5665f = 10000;
                this.f5666g = false;
                this.f5667h = false;
                this.f5668i = true;
                this.f5669j = 60000;
                this.f5670k = null;
                this.f5671l = null;
                this.f5672m = null;
                this.f5673n = null;
                this.f5674o = null;
                this.f5675p = false;
                this.f5676q = false;
                this.cachedSize = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            public int computeSerializedSize() {
                int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt64Size(1, this.f5660a) + CodedOutputByteBufferNano.computeFloatSize(2, this.f5661b) + CodedOutputByteBufferNano.computeInt32Size(3, this.f5662c) + CodedOutputByteBufferNano.computeInt32Size(4, this.f5663d) + CodedOutputByteBufferNano.computeInt64Size(5, this.f5664e) + CodedOutputByteBufferNano.computeInt32Size(6, this.f5665f) + CodedOutputByteBufferNano.computeBoolSize(7, this.f5666g) + CodedOutputByteBufferNano.computeBoolSize(8, this.f5667h) + CodedOutputByteBufferNano.computeInt64Size(9, this.f5669j);
                C2136a aVar = this.f5670k;
                if (aVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(10, aVar);
                }
                C2136a aVar2 = this.f5671l;
                if (aVar2 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(11, aVar2);
                }
                C2136a aVar3 = this.f5672m;
                if (aVar3 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(12, aVar3);
                }
                int computeBoolSize = computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(13, this.f5668i);
                C2136a aVar4 = this.f5673n;
                if (aVar4 != null) {
                    computeBoolSize += CodedOutputByteBufferNano.computeMessageSize(14, aVar4);
                }
                C2138b bVar = this.f5674o;
                if (bVar != null) {
                    computeBoolSize += CodedOutputByteBufferNano.computeMessageSize(15, bVar);
                }
                boolean z = this.f5675p;
                if (z) {
                    computeBoolSize += CodedOutputByteBufferNano.computeBoolSize(16, z);
                }
                boolean z2 = this.f5676q;
                return z2 ? computeBoolSize + CodedOutputByteBufferNano.computeBoolSize(17, z2) : computeBoolSize;
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                while (true) {
                    int readTag = codedInputByteBufferNano.readTag();
                    switch (readTag) {
                        case 0:
                            break;
                        case 8:
                            this.f5660a = codedInputByteBufferNano.readInt64();
                            continue;
                        case 21:
                            this.f5661b = codedInputByteBufferNano.readFloat();
                            continue;
                        case 24:
                            this.f5662c = codedInputByteBufferNano.readInt32();
                            continue;
                        case 32:
                            this.f5663d = codedInputByteBufferNano.readInt32();
                            continue;
                        case 40:
                            this.f5664e = codedInputByteBufferNano.readInt64();
                            continue;
                        case 48:
                            this.f5665f = codedInputByteBufferNano.readInt32();
                            continue;
                        case 56:
                            this.f5666g = codedInputByteBufferNano.readBool();
                            continue;
                        case 64:
                            this.f5667h = codedInputByteBufferNano.readBool();
                            continue;
                        case 72:
                            this.f5669j = codedInputByteBufferNano.readInt64();
                            continue;
                        case 82:
                            if (this.f5670k == null) {
                                this.f5670k = new C2136a();
                            }
                            codedInputByteBufferNano.readMessage(this.f5670k);
                            continue;
                        case 90:
                            if (this.f5671l == null) {
                                this.f5671l = new C2136a();
                            }
                            codedInputByteBufferNano.readMessage(this.f5671l);
                            continue;
                        case 98:
                            if (this.f5672m == null) {
                                this.f5672m = new C2136a();
                            }
                            codedInputByteBufferNano.readMessage(this.f5672m);
                            continue;
                        case 104:
                            this.f5668i = codedInputByteBufferNano.readBool();
                            continue;
                        case 114:
                            if (this.f5673n == null) {
                                this.f5673n = new C2136a();
                            }
                            codedInputByteBufferNano.readMessage(this.f5673n);
                            continue;
                        case 122:
                            if (this.f5674o == null) {
                                this.f5674o = new C2138b();
                            }
                            codedInputByteBufferNano.readMessage(this.f5674o);
                            continue;
                        case 128:
                            this.f5675p = codedInputByteBufferNano.readBool();
                            continue;
                        case 136:
                            this.f5676q = codedInputByteBufferNano.readBool();
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
                codedOutputByteBufferNano.writeInt64(1, this.f5660a);
                codedOutputByteBufferNano.writeFloat(2, this.f5661b);
                codedOutputByteBufferNano.writeInt32(3, this.f5662c);
                codedOutputByteBufferNano.writeInt32(4, this.f5663d);
                codedOutputByteBufferNano.writeInt64(5, this.f5664e);
                codedOutputByteBufferNano.writeInt32(6, this.f5665f);
                codedOutputByteBufferNano.writeBool(7, this.f5666g);
                codedOutputByteBufferNano.writeBool(8, this.f5667h);
                codedOutputByteBufferNano.writeInt64(9, this.f5669j);
                C2136a aVar = this.f5670k;
                if (aVar != null) {
                    codedOutputByteBufferNano.writeMessage(10, aVar);
                }
                C2136a aVar2 = this.f5671l;
                if (aVar2 != null) {
                    codedOutputByteBufferNano.writeMessage(11, aVar2);
                }
                C2136a aVar3 = this.f5672m;
                if (aVar3 != null) {
                    codedOutputByteBufferNano.writeMessage(12, aVar3);
                }
                codedOutputByteBufferNano.writeBool(13, this.f5668i);
                C2136a aVar4 = this.f5673n;
                if (aVar4 != null) {
                    codedOutputByteBufferNano.writeMessage(14, aVar4);
                }
                C2138b bVar = this.f5674o;
                if (bVar != null) {
                    codedOutputByteBufferNano.writeMessage(15, bVar);
                }
                boolean z = this.f5675p;
                if (z) {
                    codedOutputByteBufferNano.writeBool(16, z);
                }
                boolean z2 = this.f5676q;
                if (z2) {
                    codedOutputByteBufferNano.writeBool(17, z2);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.If$k$b */
        public static final class C2140b extends MessageNano {

            /* renamed from: a */
            public int[] f5688a;

            /* renamed from: b */
            public int[] f5689b;

            public C2140b() {
                mo15917a();
            }

            /* renamed from: a */
            public C2140b mo15917a() {
                int[] iArr = WireFormatNano.EMPTY_INT_ARRAY;
                this.f5688a = iArr;
                this.f5689b = iArr;
                this.cachedSize = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            public int computeSerializedSize() {
                int[] iArr;
                int computeSerializedSize = super.computeSerializedSize();
                int[] iArr2 = this.f5688a;
                int i = 0;
                if (iArr2 != null && iArr2.length > 0) {
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        iArr = this.f5688a;
                        if (i2 >= iArr.length) {
                            break;
                        }
                        i3 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr[i2]);
                        i2++;
                    }
                    computeSerializedSize = computeSerializedSize + i3 + (iArr.length * 1);
                }
                int[] iArr3 = this.f5689b;
                if (iArr3 == null || iArr3.length <= 0) {
                    return computeSerializedSize;
                }
                int i4 = 0;
                while (true) {
                    int[] iArr4 = this.f5689b;
                    if (i >= iArr4.length) {
                        return computeSerializedSize + i4 + (iArr4.length * 1);
                    }
                    i4 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr4[i]);
                    i++;
                }
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                while (true) {
                    int readTag = codedInputByteBufferNano.readTag();
                    if (readTag == 0) {
                        break;
                    } else if (readTag == 8) {
                        int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 8);
                        int[] iArr = new int[repeatedFieldArrayLength];
                        int i = 0;
                        for (int i2 = 0; i2 < repeatedFieldArrayLength; i2++) {
                            if (i2 != 0) {
                                codedInputByteBufferNano.readTag();
                            }
                            int readInt32 = codedInputByteBufferNano.readInt32();
                            if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 4) {
                                iArr[i] = readInt32;
                                i++;
                            }
                        }
                        if (i != 0) {
                            int[] iArr2 = this.f5688a;
                            int length = iArr2 == null ? 0 : iArr2.length;
                            if (length == 0 && i == repeatedFieldArrayLength) {
                                this.f5688a = iArr;
                            } else {
                                int[] iArr3 = new int[(length + i)];
                                if (length != 0) {
                                    System.arraycopy(iArr2, 0, iArr3, 0, length);
                                }
                                System.arraycopy(iArr, 0, iArr3, length, i);
                                this.f5688a = iArr3;
                            }
                        }
                    } else if (readTag == 10) {
                        int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                        int position = codedInputByteBufferNano.getPosition();
                        int i3 = 0;
                        while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                            int readInt322 = codedInputByteBufferNano.readInt32();
                            if (readInt322 == 0 || readInt322 == 1 || readInt322 == 2 || readInt322 == 3 || readInt322 == 4) {
                                i3++;
                            }
                        }
                        if (i3 != 0) {
                            codedInputByteBufferNano.rewindToPosition(position);
                            int[] iArr4 = this.f5688a;
                            int length2 = iArr4 == null ? 0 : iArr4.length;
                            int[] iArr5 = new int[(i3 + length2)];
                            if (length2 != 0) {
                                System.arraycopy(iArr4, 0, iArr5, 0, length2);
                            }
                            while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                                int readInt323 = codedInputByteBufferNano.readInt32();
                                if (readInt323 == 0 || readInt323 == 1 || readInt323 == 2 || readInt323 == 3 || readInt323 == 4) {
                                    iArr5[length2] = readInt323;
                                    length2++;
                                }
                            }
                            this.f5688a = iArr5;
                        }
                        codedInputByteBufferNano.popLimit(pushLimit);
                    } else if (readTag == 16) {
                        int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 16);
                        int[] iArr6 = new int[repeatedFieldArrayLength2];
                        int i4 = 0;
                        for (int i5 = 0; i5 < repeatedFieldArrayLength2; i5++) {
                            if (i5 != 0) {
                                codedInputByteBufferNano.readTag();
                            }
                            int readInt324 = codedInputByteBufferNano.readInt32();
                            if (readInt324 == 0 || readInt324 == 2 || readInt324 == 3) {
                                iArr6[i4] = readInt324;
                                i4++;
                            }
                        }
                        if (i4 != 0) {
                            int[] iArr7 = this.f5689b;
                            int length3 = iArr7 == null ? 0 : iArr7.length;
                            if (length3 == 0 && i4 == repeatedFieldArrayLength2) {
                                this.f5689b = iArr6;
                            } else {
                                int[] iArr8 = new int[(length3 + i4)];
                                if (length3 != 0) {
                                    System.arraycopy(iArr7, 0, iArr8, 0, length3);
                                }
                                System.arraycopy(iArr6, 0, iArr8, length3, i4);
                                this.f5689b = iArr8;
                            }
                        }
                    } else if (readTag == 18) {
                        int pushLimit2 = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                        int position2 = codedInputByteBufferNano.getPosition();
                        int i6 = 0;
                        while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                            int readInt325 = codedInputByteBufferNano.readInt32();
                            if (readInt325 == 0 || readInt325 == 2 || readInt325 == 3) {
                                i6++;
                            }
                        }
                        if (i6 != 0) {
                            codedInputByteBufferNano.rewindToPosition(position2);
                            int[] iArr9 = this.f5689b;
                            int length4 = iArr9 == null ? 0 : iArr9.length;
                            int[] iArr10 = new int[(i6 + length4)];
                            if (length4 != 0) {
                                System.arraycopy(iArr9, 0, iArr10, 0, length4);
                            }
                            while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                                int readInt326 = codedInputByteBufferNano.readInt32();
                                if (readInt326 == 0 || readInt326 == 2 || readInt326 == 3) {
                                    iArr10[length4] = readInt326;
                                    length4++;
                                }
                            }
                            this.f5689b = iArr10;
                        }
                        codedInputByteBufferNano.popLimit(pushLimit2);
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    }
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                int[] iArr = this.f5688a;
                int i = 0;
                if (iArr != null && iArr.length > 0) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr2 = this.f5688a;
                        if (i2 >= iArr2.length) {
                            break;
                        }
                        codedOutputByteBufferNano.writeInt32(1, iArr2[i2]);
                        i2++;
                    }
                }
                int[] iArr3 = this.f5689b;
                if (iArr3 != null && iArr3.length > 0) {
                    while (true) {
                        int[] iArr4 = this.f5689b;
                        if (i >= iArr4.length) {
                            break;
                        }
                        codedOutputByteBufferNano.writeInt32(2, iArr4[i]);
                        i++;
                    }
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public C2134k() {
            mo15911a();
        }

        /* renamed from: b */
        public static C2134k[] m7390b() {
            if (f5657c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f5657c == null) {
                        f5657c = new C2134k[0];
                    }
                }
            }
            return f5657c;
        }

        /* renamed from: a */
        public C2134k mo15911a() {
            this.f5658a = null;
            this.f5659b = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            C2135a aVar = this.f5658a;
            if (aVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, aVar);
            }
            C2140b bVar = this.f5659b;
            return bVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, bVar) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    if (this.f5658a == null) {
                        this.f5658a = new C2135a();
                    }
                    codedInputByteBufferNano.readMessage(this.f5658a);
                } else if (readTag == 18) {
                    if (this.f5659b == null) {
                        this.f5659b = new C2140b();
                    }
                    codedInputByteBufferNano.readMessage(this.f5659b);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            C2135a aVar = this.f5658a;
            if (aVar != null) {
                codedOutputByteBufferNano.writeMessage(1, aVar);
            }
            C2140b bVar = this.f5659b;
            if (bVar != null) {
                codedOutputByteBufferNano.writeMessage(2, bVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.If$l */
    public static final class C2141l extends MessageNano {

        /* renamed from: c */
        private static volatile C2141l[] f5690c;

        /* renamed from: a */
        public String f5691a;

        /* renamed from: b */
        public byte[] f5692b;

        public C2141l() {
            mo15918a();
        }

        /* renamed from: b */
        public static C2141l[] m7398b() {
            if (f5690c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f5690c == null) {
                        f5690c = new C2141l[0];
                    }
                }
            }
            return f5690c;
        }

        /* renamed from: a */
        public C2141l mo15918a() {
            this.f5691a = "";
            this.f5692b = WireFormatNano.EMPTY_BYTES;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.f5691a.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f5691a);
            }
            return !Arrays.equals(this.f5692b, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f5692b) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f5691a = codedInputByteBufferNano.readString();
                } else if (readTag == 18) {
                    this.f5692b = codedInputByteBufferNano.readBytes();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.f5691a.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.f5691a);
            }
            if (!Arrays.equals(this.f5692b, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(2, this.f5692b);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.If$m */
    public static final class C2142m extends MessageNano {

        /* renamed from: c */
        private static volatile C2142m[] f5693c;

        /* renamed from: a */
        public String f5694a;

        /* renamed from: b */
        public boolean f5695b;

        public C2142m() {
            mo15919a();
        }

        /* renamed from: b */
        public static C2142m[] m7400b() {
            if (f5693c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f5693c == null) {
                        f5693c = new C2142m[0];
                    }
                }
            }
            return f5693c;
        }

        /* renamed from: a */
        public C2142m mo15919a() {
            this.f5694a = "";
            this.f5695b = false;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            return super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f5694a) + CodedOutputByteBufferNano.computeBoolSize(2, this.f5695b);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f5694a = codedInputByteBufferNano.readString();
                } else if (readTag == 16) {
                    this.f5695b = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeString(1, this.f5694a);
            codedOutputByteBufferNano.writeBool(2, this.f5695b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.If$n */
    public static final class C2143n extends MessageNano {

        /* renamed from: a */
        public long f5696a;

        /* renamed from: b */
        public long f5697b;

        public C2143n() {
            mo15920a();
        }

        /* renamed from: a */
        public C2143n mo15920a() {
            this.f5696a = 86400;
            this.f5697b = 432000;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            return super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt64Size(1, this.f5696a) + CodedOutputByteBufferNano.computeInt64Size(2, this.f5697b);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f5696a = codedInputByteBufferNano.readInt64();
                } else if (readTag == 16) {
                    this.f5697b = codedInputByteBufferNano.readInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt64(1, this.f5696a);
            codedOutputByteBufferNano.writeInt64(2, this.f5697b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.If$o */
    public static final class C2144o extends MessageNano {

        /* renamed from: g */
        private static volatile C2144o[] f5698g;

        /* renamed from: a */
        public String f5699a;

        /* renamed from: b */
        public String f5700b;

        /* renamed from: c */
        public String f5701c;

        /* renamed from: d */
        public C2145a[] f5702d;

        /* renamed from: e */
        public long f5703e;

        /* renamed from: f */
        public int[] f5704f;

        /* renamed from: com.yandex.metrica.impl.ob.If$o$a */
        public static final class C2145a extends MessageNano {

            /* renamed from: c */
            private static volatile C2145a[] f5705c;

            /* renamed from: a */
            public String f5706a;

            /* renamed from: b */
            public String f5707b;

            public C2145a() {
                mo15922a();
            }

            /* renamed from: b */
            public static C2145a[] m7405b() {
                if (f5705c == null) {
                    synchronized (InternalNano.LAZY_INIT_LOCK) {
                        if (f5705c == null) {
                            f5705c = new C2145a[0];
                        }
                    }
                }
                return f5705c;
            }

            /* renamed from: a */
            public C2145a mo15922a() {
                this.f5706a = "";
                this.f5707b = "";
                this.cachedSize = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            public int computeSerializedSize() {
                return super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f5706a) + CodedOutputByteBufferNano.computeStringSize(2, this.f5707b);
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                while (true) {
                    int readTag = codedInputByteBufferNano.readTag();
                    if (readTag == 0) {
                        break;
                    } else if (readTag == 10) {
                        this.f5706a = codedInputByteBufferNano.readString();
                    } else if (readTag == 18) {
                        this.f5707b = codedInputByteBufferNano.readString();
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    }
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                codedOutputByteBufferNano.writeString(1, this.f5706a);
                codedOutputByteBufferNano.writeString(2, this.f5707b);
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public C2144o() {
            mo15921a();
        }

        /* renamed from: b */
        public static C2144o[] m7403b() {
            if (f5698g == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f5698g == null) {
                        f5698g = new C2144o[0];
                    }
                }
            }
            return f5698g;
        }

        /* renamed from: a */
        public C2144o mo15921a() {
            this.f5699a = "";
            this.f5700b = "";
            this.f5701c = "";
            this.f5702d = C2145a.m7405b();
            this.f5703e = 0;
            this.f5704f = WireFormatNano.EMPTY_INT_ARRAY;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f5699a) + CodedOutputByteBufferNano.computeStringSize(2, this.f5700b) + CodedOutputByteBufferNano.computeStringSize(3, this.f5701c);
            C2145a[] aVarArr = this.f5702d;
            int i = 0;
            if (aVarArr != null && aVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C2145a[] aVarArr2 = this.f5702d;
                    if (i2 >= aVarArr2.length) {
                        break;
                    }
                    C2145a aVar = aVarArr2[i2];
                    if (aVar != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, aVar);
                    }
                    i2++;
                }
            }
            int computeInt64Size = computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(5, this.f5703e);
            int[] iArr = this.f5704f;
            if (iArr == null || iArr.length <= 0) {
                return computeInt64Size;
            }
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.f5704f;
                if (i >= iArr2.length) {
                    return computeInt64Size + i3 + (iArr2.length * 1);
                }
                i3 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr2[i]);
                i++;
            }
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f5699a = codedInputByteBufferNano.readString();
                } else if (readTag == 18) {
                    this.f5700b = codedInputByteBufferNano.readString();
                } else if (readTag == 26) {
                    this.f5701c = codedInputByteBufferNano.readString();
                } else if (readTag == 34) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                    C2145a[] aVarArr = this.f5702d;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    int i = repeatedFieldArrayLength + length;
                    C2145a[] aVarArr2 = new C2145a[i];
                    if (length != 0) {
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        aVarArr2[length] = new C2145a();
                        codedInputByteBufferNano.readMessage(aVarArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    aVarArr2[length] = new C2145a();
                    codedInputByteBufferNano.readMessage(aVarArr2[length]);
                    this.f5702d = aVarArr2;
                } else if (readTag == 40) {
                    this.f5703e = codedInputByteBufferNano.readInt64();
                } else if (readTag == 48) {
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 48);
                    int[] iArr = new int[repeatedFieldArrayLength2];
                    int i2 = 0;
                    for (int i3 = 0; i3 < repeatedFieldArrayLength2; i3++) {
                        if (i3 != 0) {
                            codedInputByteBufferNano.readTag();
                        }
                        int readInt32 = codedInputByteBufferNano.readInt32();
                        if (readInt32 == 1 || readInt32 == 2) {
                            iArr[i2] = readInt32;
                            i2++;
                        }
                    }
                    if (i2 != 0) {
                        int[] iArr2 = this.f5704f;
                        int length2 = iArr2 == null ? 0 : iArr2.length;
                        if (length2 == 0 && i2 == repeatedFieldArrayLength2) {
                            this.f5704f = iArr;
                        } else {
                            int[] iArr3 = new int[(length2 + i2)];
                            if (length2 != 0) {
                                System.arraycopy(iArr2, 0, iArr3, 0, length2);
                            }
                            System.arraycopy(iArr, 0, iArr3, length2, i2);
                            this.f5704f = iArr3;
                        }
                    }
                } else if (readTag == 50) {
                    int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                    int position = codedInputByteBufferNano.getPosition();
                    int i4 = 0;
                    while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                        int readInt322 = codedInputByteBufferNano.readInt32();
                        if (readInt322 == 1 || readInt322 == 2) {
                            i4++;
                        }
                    }
                    if (i4 != 0) {
                        codedInputByteBufferNano.rewindToPosition(position);
                        int[] iArr4 = this.f5704f;
                        int length3 = iArr4 == null ? 0 : iArr4.length;
                        int[] iArr5 = new int[(i4 + length3)];
                        if (length3 != 0) {
                            System.arraycopy(iArr4, 0, iArr5, 0, length3);
                        }
                        while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                            int readInt323 = codedInputByteBufferNano.readInt32();
                            if (readInt323 == 1 || readInt323 == 2) {
                                iArr5[length3] = readInt323;
                                length3++;
                            }
                        }
                        this.f5704f = iArr5;
                    }
                    codedInputByteBufferNano.popLimit(pushLimit);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeString(1, this.f5699a);
            codedOutputByteBufferNano.writeString(2, this.f5700b);
            codedOutputByteBufferNano.writeString(3, this.f5701c);
            C2145a[] aVarArr = this.f5702d;
            int i = 0;
            if (aVarArr != null && aVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C2145a[] aVarArr2 = this.f5702d;
                    if (i2 >= aVarArr2.length) {
                        break;
                    }
                    C2145a aVar = aVarArr2[i2];
                    if (aVar != null) {
                        codedOutputByteBufferNano.writeMessage(4, aVar);
                    }
                    i2++;
                }
            }
            codedOutputByteBufferNano.writeInt64(5, this.f5703e);
            int[] iArr = this.f5704f;
            if (iArr != null && iArr.length > 0) {
                while (true) {
                    int[] iArr2 = this.f5704f;
                    if (i >= iArr2.length) {
                        break;
                    }
                    codedOutputByteBufferNano.writeInt32(6, iArr2[i]);
                    i++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.If$p */
    public static final class C2146p extends MessageNano {

        /* renamed from: a */
        public long f5708a;

        /* renamed from: b */
        public long f5709b;

        /* renamed from: c */
        public long f5710c;

        /* renamed from: d */
        public long f5711d;

        public C2146p() {
            mo15923a();
        }

        /* renamed from: a */
        public C2146p mo15923a() {
            this.f5708a = 432000000;
            this.f5709b = Constants.MILLIS_IN_DAY;
            this.f5710c = 10000;
            this.f5711d = 3600000;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            long j = this.f5708a;
            if (j != 432000000) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
            }
            long j2 = this.f5709b;
            if (j2 != Constants.MILLIS_IN_DAY) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j2);
            }
            long j3 = this.f5710c;
            if (j3 != 10000) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(3, j3);
            }
            long j4 = this.f5711d;
            return j4 != 3600000 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(4, j4) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f5708a = codedInputByteBufferNano.readInt64();
                } else if (readTag == 16) {
                    this.f5709b = codedInputByteBufferNano.readInt64();
                } else if (readTag == 24) {
                    this.f5710c = codedInputByteBufferNano.readInt64();
                } else if (readTag == 32) {
                    this.f5711d = codedInputByteBufferNano.readInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long j = this.f5708a;
            if (j != 432000000) {
                codedOutputByteBufferNano.writeInt64(1, j);
            }
            long j2 = this.f5709b;
            if (j2 != Constants.MILLIS_IN_DAY) {
                codedOutputByteBufferNano.writeInt64(2, j2);
            }
            long j3 = this.f5710c;
            if (j3 != 10000) {
                codedOutputByteBufferNano.writeInt64(3, j3);
            }
            long j4 = this.f5711d;
            if (j4 != 3600000) {
                codedOutputByteBufferNano.writeInt64(4, j4);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.If$q */
    public static final class C2147q extends MessageNano {

        /* renamed from: a */
        public long f5712a;

        /* renamed from: b */
        public String f5713b;

        /* renamed from: c */
        public int[] f5714c;

        /* renamed from: d */
        public int[] f5715d;

        /* renamed from: e */
        public long f5716e;

        /* renamed from: f */
        public int f5717f;

        /* renamed from: g */
        public long f5718g;

        /* renamed from: h */
        public long f5719h;

        /* renamed from: i */
        public long f5720i;

        /* renamed from: j */
        public long f5721j;

        public C2147q() {
            mo15924a();
        }

        /* renamed from: a */
        public C2147q mo15924a() {
            this.f5712a = 0;
            this.f5713b = "";
            int[] iArr = WireFormatNano.EMPTY_INT_ARRAY;
            this.f5714c = iArr;
            this.f5715d = iArr;
            this.f5716e = 259200;
            this.f5717f = 10;
            this.f5718g = 43200;
            this.f5719h = 3600;
            this.f5720i = 86400;
            this.f5721j = 30;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int[] iArr;
            int[] iArr2;
            int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt64Size(1, this.f5712a) + CodedOutputByteBufferNano.computeStringSize(2, this.f5713b);
            int[] iArr3 = this.f5714c;
            int i = 0;
            if (iArr3 != null && iArr3.length > 0) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    iArr2 = this.f5714c;
                    if (i2 >= iArr2.length) {
                        break;
                    }
                    i3 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr2[i2]);
                    i2++;
                }
                computeSerializedSize = computeSerializedSize + i3 + (iArr2.length * 1);
            }
            int computeInt64Size = computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(4, this.f5716e) + CodedOutputByteBufferNano.computeInt32Size(5, this.f5717f);
            long j = this.f5718g;
            if (j != 43200) {
                computeInt64Size += CodedOutputByteBufferNano.computeInt64Size(6, j);
            }
            long j2 = this.f5719h;
            if (j2 != 3600) {
                computeInt64Size += CodedOutputByteBufferNano.computeInt64Size(7, j2);
            }
            long j3 = this.f5720i;
            if (j3 != 86400) {
                computeInt64Size += CodedOutputByteBufferNano.computeInt64Size(8, j3);
            }
            int[] iArr4 = this.f5715d;
            if (iArr4 != null && iArr4.length > 0) {
                int i4 = 0;
                while (true) {
                    iArr = this.f5715d;
                    if (i >= iArr.length) {
                        break;
                    }
                    i4 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr[i]);
                    i++;
                }
                computeInt64Size = computeInt64Size + i4 + (iArr.length * 1);
            }
            long j4 = this.f5721j;
            return j4 != 30 ? computeInt64Size + CodedOutputByteBufferNano.computeInt64Size(10, j4) : computeInt64Size;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                switch (readTag) {
                    case 0:
                        break;
                    case 8:
                        this.f5712a = codedInputByteBufferNano.readInt64();
                        continue;
                    case 18:
                        this.f5713b = codedInputByteBufferNano.readString();
                        continue;
                    case 24:
                        int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 24);
                        int[] iArr = this.f5714c;
                        int length = iArr == null ? 0 : iArr.length;
                        int i = repeatedFieldArrayLength + length;
                        int[] iArr2 = new int[i];
                        if (length != 0) {
                            System.arraycopy(iArr, 0, iArr2, 0, length);
                        }
                        while (length < i - 1) {
                            iArr2[length] = codedInputByteBufferNano.readInt32();
                            codedInputByteBufferNano.readTag();
                            length++;
                        }
                        iArr2[length] = codedInputByteBufferNano.readInt32();
                        this.f5714c = iArr2;
                        continue;
                    case 26:
                        int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                        int position = codedInputByteBufferNano.getPosition();
                        int i2 = 0;
                        while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                            codedInputByteBufferNano.readInt32();
                            i2++;
                        }
                        codedInputByteBufferNano.rewindToPosition(position);
                        int[] iArr3 = this.f5714c;
                        int length2 = iArr3 == null ? 0 : iArr3.length;
                        int i3 = i2 + length2;
                        int[] iArr4 = new int[i3];
                        if (length2 != 0) {
                            System.arraycopy(iArr3, 0, iArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            iArr4[length2] = codedInputByteBufferNano.readInt32();
                            length2++;
                        }
                        this.f5714c = iArr4;
                        codedInputByteBufferNano.popLimit(pushLimit);
                        continue;
                    case 32:
                        this.f5716e = codedInputByteBufferNano.readInt64();
                        continue;
                    case 40:
                        this.f5717f = codedInputByteBufferNano.readInt32();
                        continue;
                    case 48:
                        this.f5718g = codedInputByteBufferNano.readInt64();
                        continue;
                    case 56:
                        this.f5719h = codedInputByteBufferNano.readInt64();
                        continue;
                    case 64:
                        this.f5720i = codedInputByteBufferNano.readInt64();
                        continue;
                    case 72:
                        int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 72);
                        int[] iArr5 = this.f5715d;
                        int length3 = iArr5 == null ? 0 : iArr5.length;
                        int i4 = repeatedFieldArrayLength2 + length3;
                        int[] iArr6 = new int[i4];
                        if (length3 != 0) {
                            System.arraycopy(iArr5, 0, iArr6, 0, length3);
                        }
                        while (length3 < i4 - 1) {
                            iArr6[length3] = codedInputByteBufferNano.readInt32();
                            codedInputByteBufferNano.readTag();
                            length3++;
                        }
                        iArr6[length3] = codedInputByteBufferNano.readInt32();
                        this.f5715d = iArr6;
                        continue;
                    case 74:
                        int pushLimit2 = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                        int position2 = codedInputByteBufferNano.getPosition();
                        int i5 = 0;
                        while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                            codedInputByteBufferNano.readInt32();
                            i5++;
                        }
                        codedInputByteBufferNano.rewindToPosition(position2);
                        int[] iArr7 = this.f5715d;
                        int length4 = iArr7 == null ? 0 : iArr7.length;
                        int i6 = i5 + length4;
                        int[] iArr8 = new int[i6];
                        if (length4 != 0) {
                            System.arraycopy(iArr7, 0, iArr8, 0, length4);
                        }
                        while (length4 < i6) {
                            iArr8[length4] = codedInputByteBufferNano.readInt32();
                            length4++;
                        }
                        this.f5715d = iArr8;
                        codedInputByteBufferNano.popLimit(pushLimit2);
                        continue;
                    case 80:
                        this.f5721j = codedInputByteBufferNano.readInt64();
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
            codedOutputByteBufferNano.writeInt64(1, this.f5712a);
            codedOutputByteBufferNano.writeString(2, this.f5713b);
            int[] iArr = this.f5714c;
            int i = 0;
            if (iArr != null && iArr.length > 0) {
                int i2 = 0;
                while (true) {
                    int[] iArr2 = this.f5714c;
                    if (i2 >= iArr2.length) {
                        break;
                    }
                    codedOutputByteBufferNano.writeInt32(3, iArr2[i2]);
                    i2++;
                }
            }
            codedOutputByteBufferNano.writeInt64(4, this.f5716e);
            codedOutputByteBufferNano.writeInt32(5, this.f5717f);
            long j = this.f5718g;
            if (j != 43200) {
                codedOutputByteBufferNano.writeInt64(6, j);
            }
            long j2 = this.f5719h;
            if (j2 != 3600) {
                codedOutputByteBufferNano.writeInt64(7, j2);
            }
            long j3 = this.f5720i;
            if (j3 != 86400) {
                codedOutputByteBufferNano.writeInt64(8, j3);
            }
            int[] iArr3 = this.f5715d;
            if (iArr3 != null && iArr3.length > 0) {
                while (true) {
                    int[] iArr4 = this.f5715d;
                    if (i >= iArr4.length) {
                        break;
                    }
                    codedOutputByteBufferNano.writeInt32(9, iArr4[i]);
                    i++;
                }
            }
            long j4 = this.f5721j;
            if (j4 != 30) {
                codedOutputByteBufferNano.writeInt64(10, j4);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.If$r */
    public static final class C2148r extends MessageNano {

        /* renamed from: a */
        public int f5722a;

        public C2148r() {
            mo15925a();
        }

        /* renamed from: a */
        public C2148r mo15925a() {
            this.f5722a = 86400;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            int i = this.f5722a;
            return i != 86400 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(1, i) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f5722a = codedInputByteBufferNano.readUInt32();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int i = this.f5722a;
            if (i != 86400) {
                codedOutputByteBufferNano.writeUInt32(1, i);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.If$s */
    public static final class C2149s extends MessageNano {

        /* renamed from: a */
        public long f5723a;

        public C2149s() {
            mo15926a();
        }

        /* renamed from: a */
        public C2149s mo15926a() {
            this.f5723a = 18000000;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            return super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt64Size(1, this.f5723a);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f5723a = codedInputByteBufferNano.readInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt64(1, this.f5723a);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.If$t */
    public static final class C2150t extends MessageNano {

        /* renamed from: a */
        public C2151u f5724a;

        /* renamed from: b */
        public C2151u f5725b;

        public C2150t() {
            mo15927a();
        }

        /* renamed from: a */
        public C2150t mo15927a() {
            this.f5724a = null;
            this.f5725b = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            C2151u uVar = this.f5724a;
            if (uVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, uVar);
            }
            C2151u uVar2 = this.f5725b;
            return uVar2 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, uVar2) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    if (this.f5724a == null) {
                        this.f5724a = new C2151u();
                    }
                    codedInputByteBufferNano.readMessage(this.f5724a);
                } else if (readTag == 18) {
                    if (this.f5725b == null) {
                        this.f5725b = new C2151u();
                    }
                    codedInputByteBufferNano.readMessage(this.f5725b);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            C2151u uVar = this.f5724a;
            if (uVar != null) {
                codedOutputByteBufferNano.writeMessage(1, uVar);
            }
            C2151u uVar2 = this.f5725b;
            if (uVar2 != null) {
                codedOutputByteBufferNano.writeMessage(2, uVar2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.If$u */
    public static final class C2151u extends MessageNano {

        /* renamed from: a */
        public int f5726a;

        /* renamed from: b */
        public long f5727b;

        public C2151u() {
            mo15928a();
        }

        /* renamed from: a */
        public C2151u mo15928a() {
            this.f5726a = 100;
            this.f5727b = 60;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            int i = this.f5726a;
            if (i != 100) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
            }
            long j = this.f5727b;
            return j != 60 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(2, j) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f5726a = codedInputByteBufferNano.readInt32();
                } else if (readTag == 16) {
                    this.f5727b = codedInputByteBufferNano.readInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int i = this.f5726a;
            if (i != 100) {
                codedOutputByteBufferNano.writeInt32(1, i);
            }
            long j = this.f5727b;
            if (j != 60) {
                codedOutputByteBufferNano.writeInt64(2, j);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.If$v */
    public static final class C2152v extends MessageNano {

        /* renamed from: a */
        public boolean f5728a;

        /* renamed from: b */
        public boolean f5729b;

        /* renamed from: c */
        public boolean f5730c;

        /* renamed from: d */
        public boolean f5731d;

        /* renamed from: e */
        public int f5732e;

        /* renamed from: f */
        public int f5733f;

        /* renamed from: g */
        public int f5734g;

        /* renamed from: h */
        public int f5735h;

        /* renamed from: i */
        public boolean f5736i;

        /* renamed from: j */
        public boolean f5737j;

        /* renamed from: k */
        public boolean f5738k;

        /* renamed from: l */
        public boolean f5739l;

        /* renamed from: m */
        public C2155y[] f5740m;

        /* renamed from: n */
        public boolean f5741n;

        /* renamed from: o */
        public boolean f5742o;

        /* renamed from: p */
        public int f5743p;

        public C2152v() {
            mo15929a();
        }

        /* renamed from: a */
        public C2152v mo15929a() {
            this.f5728a = true;
            this.f5729b = true;
            this.f5730c = true;
            this.f5731d = true;
            this.f5732e = 10000;
            this.f5733f = 1000;
            this.f5734g = 1000;
            this.f5735h = 200000;
            this.f5736i = false;
            this.f5737j = false;
            this.f5738k = false;
            this.f5739l = false;
            this.f5740m = C2155y.m7416b();
            this.f5741n = false;
            this.f5742o = false;
            this.f5743p = TTAdSdk.INIT_LOCAL_FAIL_CODE;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            boolean z = this.f5728a;
            if (!z) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
            }
            boolean z2 = this.f5729b;
            if (!z2) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(2, z2);
            }
            boolean z3 = this.f5730c;
            if (!z3) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z3);
            }
            boolean z4 = this.f5731d;
            if (!z4) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z4);
            }
            int i = this.f5732e;
            if (i != 10000) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(5, i);
            }
            int i2 = this.f5733f;
            if (i2 != 1000) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i2);
            }
            int i3 = this.f5734g;
            if (i3 != 1000) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i3);
            }
            int i4 = this.f5735h;
            if (i4 != 200000) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(8, i4);
            }
            boolean z5 = this.f5736i;
            if (z5) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(9, z5);
            }
            boolean z6 = this.f5737j;
            if (z6) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(10, z6);
            }
            boolean z7 = this.f5738k;
            if (z7) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(11, z7);
            }
            boolean z8 = this.f5739l;
            if (z8) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(12, z8);
            }
            C2155y[] yVarArr = this.f5740m;
            if (yVarArr != null && yVarArr.length > 0) {
                int i5 = 0;
                while (true) {
                    C2155y[] yVarArr2 = this.f5740m;
                    if (i5 >= yVarArr2.length) {
                        break;
                    }
                    C2155y yVar = yVarArr2[i5];
                    if (yVar != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(13, yVar);
                    }
                    i5++;
                }
            }
            boolean z9 = this.f5741n;
            if (z9) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(14, z9);
            }
            boolean z10 = this.f5742o;
            if (z10) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(15, z10);
            }
            int i6 = this.f5743p;
            return i6 != 4000 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(16, i6) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                switch (readTag) {
                    case 0:
                        break;
                    case 8:
                        this.f5728a = codedInputByteBufferNano.readBool();
                        continue;
                    case 16:
                        this.f5729b = codedInputByteBufferNano.readBool();
                        continue;
                    case 24:
                        this.f5730c = codedInputByteBufferNano.readBool();
                        continue;
                    case 32:
                        this.f5731d = codedInputByteBufferNano.readBool();
                        continue;
                    case 40:
                        this.f5732e = codedInputByteBufferNano.readInt32();
                        continue;
                    case 48:
                        this.f5733f = codedInputByteBufferNano.readInt32();
                        continue;
                    case 56:
                        this.f5734g = codedInputByteBufferNano.readInt32();
                        continue;
                    case 64:
                        this.f5735h = codedInputByteBufferNano.readInt32();
                        continue;
                    case 72:
                        this.f5736i = codedInputByteBufferNano.readBool();
                        continue;
                    case 80:
                        this.f5737j = codedInputByteBufferNano.readBool();
                        continue;
                    case 88:
                        this.f5738k = codedInputByteBufferNano.readBool();
                        continue;
                    case 96:
                        this.f5739l = codedInputByteBufferNano.readBool();
                        continue;
                    case 106:
                        int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 106);
                        C2155y[] yVarArr = this.f5740m;
                        int length = yVarArr == null ? 0 : yVarArr.length;
                        int i = repeatedFieldArrayLength + length;
                        C2155y[] yVarArr2 = new C2155y[i];
                        if (length != 0) {
                            System.arraycopy(yVarArr, 0, yVarArr2, 0, length);
                        }
                        while (length < i - 1) {
                            yVarArr2[length] = new C2155y();
                            codedInputByteBufferNano.readMessage(yVarArr2[length]);
                            codedInputByteBufferNano.readTag();
                            length++;
                        }
                        yVarArr2[length] = new C2155y();
                        codedInputByteBufferNano.readMessage(yVarArr2[length]);
                        this.f5740m = yVarArr2;
                        continue;
                    case 112:
                        this.f5741n = codedInputByteBufferNano.readBool();
                        continue;
                    case 120:
                        this.f5742o = codedInputByteBufferNano.readBool();
                        continue;
                    case 128:
                        this.f5743p = codedInputByteBufferNano.readInt32();
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
            boolean z = this.f5728a;
            if (!z) {
                codedOutputByteBufferNano.writeBool(1, z);
            }
            boolean z2 = this.f5729b;
            if (!z2) {
                codedOutputByteBufferNano.writeBool(2, z2);
            }
            boolean z3 = this.f5730c;
            if (!z3) {
                codedOutputByteBufferNano.writeBool(3, z3);
            }
            boolean z4 = this.f5731d;
            if (!z4) {
                codedOutputByteBufferNano.writeBool(4, z4);
            }
            int i = this.f5732e;
            if (i != 10000) {
                codedOutputByteBufferNano.writeInt32(5, i);
            }
            int i2 = this.f5733f;
            if (i2 != 1000) {
                codedOutputByteBufferNano.writeInt32(6, i2);
            }
            int i3 = this.f5734g;
            if (i3 != 1000) {
                codedOutputByteBufferNano.writeInt32(7, i3);
            }
            int i4 = this.f5735h;
            if (i4 != 200000) {
                codedOutputByteBufferNano.writeInt32(8, i4);
            }
            boolean z5 = this.f5736i;
            if (z5) {
                codedOutputByteBufferNano.writeBool(9, z5);
            }
            boolean z6 = this.f5737j;
            if (z6) {
                codedOutputByteBufferNano.writeBool(10, z6);
            }
            boolean z7 = this.f5738k;
            if (z7) {
                codedOutputByteBufferNano.writeBool(11, z7);
            }
            boolean z8 = this.f5739l;
            if (z8) {
                codedOutputByteBufferNano.writeBool(12, z8);
            }
            C2155y[] yVarArr = this.f5740m;
            if (yVarArr != null && yVarArr.length > 0) {
                int i5 = 0;
                while (true) {
                    C2155y[] yVarArr2 = this.f5740m;
                    if (i5 >= yVarArr2.length) {
                        break;
                    }
                    C2155y yVar = yVarArr2[i5];
                    if (yVar != null) {
                        codedOutputByteBufferNano.writeMessage(13, yVar);
                    }
                    i5++;
                }
            }
            boolean z9 = this.f5741n;
            if (z9) {
                codedOutputByteBufferNano.writeBool(14, z9);
            }
            boolean z10 = this.f5742o;
            if (z10) {
                codedOutputByteBufferNano.writeBool(15, z10);
            }
            int i6 = this.f5743p;
            if (i6 != 4000) {
                codedOutputByteBufferNano.writeInt32(16, i6);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.If$w */
    public static final class C2153w extends MessageNano {

        /* renamed from: a */
        public int f5744a;

        /* renamed from: b */
        public int f5745b;

        /* renamed from: c */
        public int f5746c;

        /* renamed from: d */
        public long f5747d;

        /* renamed from: e */
        public boolean f5748e;

        /* renamed from: f */
        public boolean f5749f;

        /* renamed from: g */
        public boolean f5750g;

        /* renamed from: h */
        public C2155y[] f5751h;

        public C2153w() {
            mo15930a();
        }

        /* renamed from: a */
        public C2153w mo15930a() {
            this.f5744a = 10000;
            this.f5745b = 1000;
            this.f5746c = 100;
            this.f5747d = 5000;
            this.f5748e = true;
            this.f5749f = false;
            this.f5750g = true;
            this.f5751h = C2155y.m7416b();
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt32Size(1, this.f5744a) + CodedOutputByteBufferNano.computeInt32Size(2, this.f5745b) + CodedOutputByteBufferNano.computeInt32Size(3, this.f5746c) + CodedOutputByteBufferNano.computeInt64Size(4, this.f5747d) + CodedOutputByteBufferNano.computeBoolSize(5, this.f5748e) + CodedOutputByteBufferNano.computeBoolSize(6, this.f5749f) + CodedOutputByteBufferNano.computeBoolSize(7, this.f5750g);
            C2155y[] yVarArr = this.f5751h;
            if (yVarArr != null && yVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C2155y[] yVarArr2 = this.f5751h;
                    if (i >= yVarArr2.length) {
                        break;
                    }
                    C2155y yVar = yVarArr2[i];
                    if (yVar != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, yVar);
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
                    this.f5744a = codedInputByteBufferNano.readInt32();
                } else if (readTag == 16) {
                    this.f5745b = codedInputByteBufferNano.readInt32();
                } else if (readTag == 24) {
                    this.f5746c = codedInputByteBufferNano.readInt32();
                } else if (readTag == 32) {
                    this.f5747d = codedInputByteBufferNano.readInt64();
                } else if (readTag == 40) {
                    this.f5748e = codedInputByteBufferNano.readBool();
                } else if (readTag == 48) {
                    this.f5749f = codedInputByteBufferNano.readBool();
                } else if (readTag == 56) {
                    this.f5750g = codedInputByteBufferNano.readBool();
                } else if (readTag == 66) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                    C2155y[] yVarArr = this.f5751h;
                    int length = yVarArr == null ? 0 : yVarArr.length;
                    int i = repeatedFieldArrayLength + length;
                    C2155y[] yVarArr2 = new C2155y[i];
                    if (length != 0) {
                        System.arraycopy(yVarArr, 0, yVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        yVarArr2[length] = new C2155y();
                        codedInputByteBufferNano.readMessage(yVarArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    yVarArr2[length] = new C2155y();
                    codedInputByteBufferNano.readMessage(yVarArr2[length]);
                    this.f5751h = yVarArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt32(1, this.f5744a);
            codedOutputByteBufferNano.writeInt32(2, this.f5745b);
            codedOutputByteBufferNano.writeInt32(3, this.f5746c);
            codedOutputByteBufferNano.writeInt64(4, this.f5747d);
            codedOutputByteBufferNano.writeBool(5, this.f5748e);
            codedOutputByteBufferNano.writeBool(6, this.f5749f);
            codedOutputByteBufferNano.writeBool(7, this.f5750g);
            C2155y[] yVarArr = this.f5751h;
            if (yVarArr != null && yVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C2155y[] yVarArr2 = this.f5751h;
                    if (i >= yVarArr2.length) {
                        break;
                    }
                    C2155y yVar = yVarArr2[i];
                    if (yVar != null) {
                        codedOutputByteBufferNano.writeMessage(8, yVar);
                    }
                    i++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.If$x */
    public static final class C2154x extends MessageNano {

        /* renamed from: a */
        public boolean f5752a;

        /* renamed from: b */
        public boolean f5753b;

        public C2154x() {
            mo15931a();
        }

        /* renamed from: a */
        public C2154x mo15931a() {
            this.f5752a = true;
            this.f5753b = false;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            return super.computeSerializedSize() + CodedOutputByteBufferNano.computeBoolSize(1, this.f5752a) + CodedOutputByteBufferNano.computeBoolSize(2, this.f5753b);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f5752a = codedInputByteBufferNano.readBool();
                } else if (readTag == 16) {
                    this.f5753b = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeBool(1, this.f5752a);
            codedOutputByteBufferNano.writeBool(2, this.f5753b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.If$y */
    public static final class C2155y extends MessageNano {

        /* renamed from: c */
        private static volatile C2155y[] f5754c;

        /* renamed from: a */
        public int f5755a;

        /* renamed from: b */
        public String f5756b;

        public C2155y() {
            mo15932a();
        }

        /* renamed from: b */
        public static C2155y[] m7416b() {
            if (f5754c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f5754c == null) {
                        f5754c = new C2155y[0];
                    }
                }
            }
            return f5754c;
        }

        /* renamed from: a */
        public C2155y mo15932a() {
            this.f5755a = 0;
            this.f5756b = "";
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            return super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt32Size(1, this.f5755a) + CodedOutputByteBufferNano.computeStringSize(2, this.f5756b);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                        this.f5755a = readInt32;
                    }
                } else if (readTag == 18) {
                    this.f5756b = codedInputByteBufferNano.readString();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt32(1, this.f5755a);
            codedOutputByteBufferNano.writeString(2, this.f5756b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C2121If() {
        mo15898a();
    }

    /* renamed from: a */
    public C2121If mo15898a() {
        this.f5581a = "";
        this.f5582b = 0;
        String[] strArr = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f5583c = strArr;
        this.f5584d = "";
        this.f5585e = "";
        this.f5586f = strArr;
        this.f5587g = strArr;
        this.f5588h = strArr;
        this.f5589i = strArr;
        this.f5590j = C2127d.m7382b();
        this.f5591k = null;
        this.f5592l = C2134k.m7390b();
        this.f5593m = null;
        this.f5594n = C2144o.m7403b();
        this.f5595o = "";
        this.f5596p = "";
        this.f5597q = "";
        this.f5598r = false;
        this.f5599s = "";
        this.f5600t = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f5601u = null;
        this.f5602v = false;
        this.f5603w = C2142m.m7400b();
        this.f5604x = null;
        this.f5605y = "";
        this.f5606z = "";
        this.f5558A = "";
        this.f5559B = "";
        this.f5560C = 0;
        this.f5561D = 0;
        this.f5562E = false;
        this.f5563F = null;
        this.f5564G = null;
        this.f5565H = 600;
        this.f5566I = 1;
        this.f5567J = null;
        this.f5568K = null;
        this.f5569L = null;
        this.f5570M = null;
        this.f5571N = null;
        this.f5572O = null;
        this.f5573P = null;
        this.f5574Q = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f5575R = null;
        this.f5576S = null;
        this.f5577T = null;
        this.f5578U = null;
        this.f5579V = null;
        this.f5580W = C2141l.m7398b();
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f5581a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f5581a);
        }
        int computeInt64Size = computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(3, this.f5582b);
        String[] strArr = this.f5583c;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.f5583c;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    i4++;
                    i3 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i2++;
            }
            computeInt64Size = computeInt64Size + i3 + (i4 * 1);
        }
        if (!this.f5584d.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(5, this.f5584d);
        }
        if (!this.f5585e.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(6, this.f5585e);
        }
        String[] strArr3 = this.f5586f;
        if (strArr3 != null && strArr3.length > 0) {
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                String[] strArr4 = this.f5586f;
                if (i5 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i5];
                if (str2 != null) {
                    i7++;
                    i6 += CodedOutputByteBufferNano.computeStringSizeNoTag(str2);
                }
                i5++;
            }
            computeInt64Size = computeInt64Size + i6 + (i7 * 1);
        }
        String[] strArr5 = this.f5587g;
        if (strArr5 != null && strArr5.length > 0) {
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                String[] strArr6 = this.f5587g;
                if (i8 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i8];
                if (str3 != null) {
                    i10++;
                    i9 += CodedOutputByteBufferNano.computeStringSizeNoTag(str3);
                }
                i8++;
            }
            computeInt64Size = computeInt64Size + i9 + (i10 * 1);
        }
        String[] strArr7 = this.f5588h;
        if (strArr7 != null && strArr7.length > 0) {
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                String[] strArr8 = this.f5588h;
                if (i11 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i11];
                if (str4 != null) {
                    i13++;
                    i12 += CodedOutputByteBufferNano.computeStringSizeNoTag(str4);
                }
                i11++;
            }
            computeInt64Size = computeInt64Size + i12 + (i13 * 1);
        }
        C2132i iVar = this.f5591k;
        if (iVar != null) {
            computeInt64Size += CodedOutputByteBufferNano.computeMessageSize(10, iVar);
        }
        C2134k[] kVarArr = this.f5592l;
        if (kVarArr != null && kVarArr.length > 0) {
            int i14 = 0;
            while (true) {
                C2134k[] kVarArr2 = this.f5592l;
                if (i14 >= kVarArr2.length) {
                    break;
                }
                C2134k kVar = kVarArr2[i14];
                if (kVar != null) {
                    computeInt64Size += CodedOutputByteBufferNano.computeMessageSize(11, kVar);
                }
                i14++;
            }
        }
        C2147q qVar = this.f5593m;
        if (qVar != null) {
            computeInt64Size += CodedOutputByteBufferNano.computeMessageSize(13, qVar);
        }
        C2144o[] oVarArr = this.f5594n;
        if (oVarArr != null && oVarArr.length > 0) {
            int i15 = 0;
            while (true) {
                C2144o[] oVarArr2 = this.f5594n;
                if (i15 >= oVarArr2.length) {
                    break;
                }
                C2144o oVar = oVarArr2[i15];
                if (oVar != null) {
                    computeInt64Size += CodedOutputByteBufferNano.computeMessageSize(14, oVar);
                }
                i15++;
            }
        }
        if (!this.f5595o.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(15, this.f5595o);
        }
        if (!this.f5596p.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(16, this.f5596p);
        }
        int computeBoolSize = computeInt64Size + CodedOutputByteBufferNano.computeBoolSize(17, this.f5598r);
        if (!this.f5599s.equals("")) {
            computeBoolSize += CodedOutputByteBufferNano.computeStringSize(19, this.f5599s);
        }
        String[] strArr9 = this.f5600t;
        if (strArr9 != null && strArr9.length > 0) {
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            while (true) {
                String[] strArr10 = this.f5600t;
                if (i16 >= strArr10.length) {
                    break;
                }
                String str5 = strArr10[i16];
                if (str5 != null) {
                    i18++;
                    i17 += CodedOutputByteBufferNano.computeStringSizeNoTag(str5);
                }
                i16++;
            }
            computeBoolSize = computeBoolSize + i17 + (i18 * 2);
        }
        C2149s sVar = this.f5601u;
        if (sVar != null) {
            computeBoolSize += CodedOutputByteBufferNano.computeMessageSize(21, sVar);
        }
        boolean z = this.f5602v;
        if (z) {
            computeBoolSize += CodedOutputByteBufferNano.computeBoolSize(22, z);
        }
        C2142m[] mVarArr = this.f5603w;
        if (mVarArr != null && mVarArr.length > 0) {
            int i19 = 0;
            while (true) {
                C2142m[] mVarArr2 = this.f5603w;
                if (i19 >= mVarArr2.length) {
                    break;
                }
                C2142m mVar = mVarArr2[i19];
                if (mVar != null) {
                    computeBoolSize += CodedOutputByteBufferNano.computeMessageSize(23, mVar);
                }
                i19++;
            }
        }
        C2146p pVar = this.f5604x;
        if (pVar != null) {
            computeBoolSize += CodedOutputByteBufferNano.computeMessageSize(24, pVar);
        }
        if (!this.f5605y.equals("")) {
            computeBoolSize += CodedOutputByteBufferNano.computeStringSize(25, this.f5605y);
        }
        if (!this.f5606z.equals("")) {
            computeBoolSize += CodedOutputByteBufferNano.computeStringSize(26, this.f5606z);
        }
        if (!this.f5558A.equals("")) {
            computeBoolSize += CodedOutputByteBufferNano.computeStringSize(27, this.f5558A);
        }
        int computeInt64Size2 = computeBoolSize + CodedOutputByteBufferNano.computeInt64Size(28, this.f5560C) + CodedOutputByteBufferNano.computeInt64Size(29, this.f5561D);
        boolean z2 = this.f5562E;
        if (z2) {
            computeInt64Size2 += CodedOutputByteBufferNano.computeBoolSize(30, z2);
        }
        C2143n nVar = this.f5563F;
        if (nVar != null) {
            computeInt64Size2 += CodedOutputByteBufferNano.computeMessageSize(32, nVar);
        }
        C2133j jVar = this.f5564G;
        if (jVar != null) {
            computeInt64Size2 += CodedOutputByteBufferNano.computeMessageSize(33, jVar);
        }
        int computeInt32Size = computeInt64Size2 + CodedOutputByteBufferNano.computeInt32Size(35, this.f5565H) + CodedOutputByteBufferNano.computeInt32Size(36, this.f5566I);
        C2153w wVar = this.f5567J;
        if (wVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(37, wVar);
        }
        C2152v vVar = this.f5568K;
        if (vVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(38, vVar);
        }
        C2152v vVar2 = this.f5569L;
        if (vVar2 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(39, vVar2);
        }
        C2150t tVar = this.f5571N;
        if (tVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(41, tVar);
        }
        C2126c cVar = this.f5572O;
        if (cVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(42, cVar);
        }
        C2152v vVar3 = this.f5570M;
        if (vVar3 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(43, vVar3);
        }
        if (!this.f5597q.equals("")) {
            computeInt32Size += CodedOutputByteBufferNano.computeStringSize(44, this.f5597q);
        }
        C2129f fVar = this.f5573P;
        if (fVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(45, fVar);
        }
        String[] strArr11 = this.f5589i;
        if (strArr11 != null && strArr11.length > 0) {
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (true) {
                String[] strArr12 = this.f5589i;
                if (i20 >= strArr12.length) {
                    break;
                }
                String str6 = strArr12[i20];
                if (str6 != null) {
                    i22++;
                    i21 += CodedOutputByteBufferNano.computeStringSizeNoTag(str6);
                }
                i20++;
            }
            computeInt32Size = computeInt32Size + i21 + (i22 * 2);
        }
        String[] strArr13 = this.f5574Q;
        if (strArr13 != null && strArr13.length > 0) {
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            while (true) {
                String[] strArr14 = this.f5574Q;
                if (i23 >= strArr14.length) {
                    break;
                }
                String str7 = strArr14[i23];
                if (str7 != null) {
                    i25++;
                    i24 += CodedOutputByteBufferNano.computeStringSizeNoTag(str7);
                }
                i23++;
            }
            computeInt32Size = computeInt32Size + i24 + (i25 * 2);
        }
        C2125b bVar = this.f5575R;
        if (bVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(48, bVar);
        }
        if (!this.f5559B.equals("")) {
            computeInt32Size += CodedOutputByteBufferNano.computeStringSize(49, this.f5559B);
        }
        C2122a aVar = this.f5576S;
        if (aVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(51, aVar);
        }
        C2131h hVar = this.f5577T;
        if (hVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(52, hVar);
        }
        C2130g gVar = this.f5578U;
        if (gVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(53, gVar);
        }
        C2127d[] dVarArr = this.f5590j;
        if (dVarArr != null && dVarArr.length > 0) {
            int i26 = 0;
            while (true) {
                C2127d[] dVarArr2 = this.f5590j;
                if (i26 >= dVarArr2.length) {
                    break;
                }
                C2127d dVar = dVarArr2[i26];
                if (dVar != null) {
                    computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(54, dVar);
                }
                i26++;
            }
        }
        C2148r rVar = this.f5579V;
        if (rVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(55, rVar);
        }
        C2141l[] lVarArr = this.f5580W;
        if (lVarArr != null && lVarArr.length > 0) {
            while (true) {
                C2141l[] lVarArr2 = this.f5580W;
                if (i >= lVarArr2.length) {
                    break;
                }
                C2141l lVar = lVarArr2[i];
                if (lVar != null) {
                    computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(56, lVar);
                }
                i++;
            }
        }
        return computeInt32Size;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    this.f5581a = codedInputByteBufferNano.readString();
                    continue;
                case 24:
                    this.f5582b = codedInputByteBufferNano.readInt64();
                    continue;
                case 34:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                    String[] strArr = this.f5583c;
                    int length = strArr == null ? 0 : strArr.length;
                    int i = repeatedFieldArrayLength + length;
                    String[] strArr2 = new String[i];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.f5583c = strArr2;
                    continue;
                case 42:
                    this.f5584d = codedInputByteBufferNano.readString();
                    continue;
                case 50:
                    this.f5585e = codedInputByteBufferNano.readString();
                    continue;
                case 58:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    String[] strArr3 = this.f5586f;
                    int length2 = strArr3 == null ? 0 : strArr3.length;
                    int i2 = repeatedFieldArrayLength2 + length2;
                    String[] strArr4 = new String[i2];
                    if (length2 != 0) {
                        System.arraycopy(strArr3, 0, strArr4, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        strArr4[length2] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    strArr4[length2] = codedInputByteBufferNano.readString();
                    this.f5586f = strArr4;
                    continue;
                case 66:
                    int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                    String[] strArr5 = this.f5587g;
                    int length3 = strArr5 == null ? 0 : strArr5.length;
                    int i3 = repeatedFieldArrayLength3 + length3;
                    String[] strArr6 = new String[i3];
                    if (length3 != 0) {
                        System.arraycopy(strArr5, 0, strArr6, 0, length3);
                    }
                    while (length3 < i3 - 1) {
                        strArr6[length3] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length3++;
                    }
                    strArr6[length3] = codedInputByteBufferNano.readString();
                    this.f5587g = strArr6;
                    continue;
                case 74:
                    int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 74);
                    String[] strArr7 = this.f5588h;
                    int length4 = strArr7 == null ? 0 : strArr7.length;
                    int i4 = repeatedFieldArrayLength4 + length4;
                    String[] strArr8 = new String[i4];
                    if (length4 != 0) {
                        System.arraycopy(strArr7, 0, strArr8, 0, length4);
                    }
                    while (length4 < i4 - 1) {
                        strArr8[length4] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length4++;
                    }
                    strArr8[length4] = codedInputByteBufferNano.readString();
                    this.f5588h = strArr8;
                    continue;
                case 82:
                    if (this.f5591k == null) {
                        this.f5591k = new C2132i();
                    }
                    codedInputByteBufferNano.readMessage(this.f5591k);
                    continue;
                case 90:
                    int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                    C2134k[] kVarArr = this.f5592l;
                    int length5 = kVarArr == null ? 0 : kVarArr.length;
                    int i5 = repeatedFieldArrayLength5 + length5;
                    C2134k[] kVarArr2 = new C2134k[i5];
                    if (length5 != 0) {
                        System.arraycopy(kVarArr, 0, kVarArr2, 0, length5);
                    }
                    while (length5 < i5 - 1) {
                        kVarArr2[length5] = new C2134k();
                        codedInputByteBufferNano.readMessage(kVarArr2[length5]);
                        codedInputByteBufferNano.readTag();
                        length5++;
                    }
                    kVarArr2[length5] = new C2134k();
                    codedInputByteBufferNano.readMessage(kVarArr2[length5]);
                    this.f5592l = kVarArr2;
                    continue;
                case 106:
                    if (this.f5593m == null) {
                        this.f5593m = new C2147q();
                    }
                    codedInputByteBufferNano.readMessage(this.f5593m);
                    continue;
                case 114:
                    int repeatedFieldArrayLength6 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 114);
                    C2144o[] oVarArr = this.f5594n;
                    int length6 = oVarArr == null ? 0 : oVarArr.length;
                    int i6 = repeatedFieldArrayLength6 + length6;
                    C2144o[] oVarArr2 = new C2144o[i6];
                    if (length6 != 0) {
                        System.arraycopy(oVarArr, 0, oVarArr2, 0, length6);
                    }
                    while (length6 < i6 - 1) {
                        oVarArr2[length6] = new C2144o();
                        codedInputByteBufferNano.readMessage(oVarArr2[length6]);
                        codedInputByteBufferNano.readTag();
                        length6++;
                    }
                    oVarArr2[length6] = new C2144o();
                    codedInputByteBufferNano.readMessage(oVarArr2[length6]);
                    this.f5594n = oVarArr2;
                    continue;
                case 122:
                    this.f5595o = codedInputByteBufferNano.readString();
                    continue;
                case 130:
                    this.f5596p = codedInputByteBufferNano.readString();
                    continue;
                case 136:
                    this.f5598r = codedInputByteBufferNano.readBool();
                    continue;
                case 154:
                    this.f5599s = codedInputByteBufferNano.readString();
                    continue;
                case 162:
                    int repeatedFieldArrayLength7 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 162);
                    String[] strArr9 = this.f5600t;
                    int length7 = strArr9 == null ? 0 : strArr9.length;
                    int i7 = repeatedFieldArrayLength7 + length7;
                    String[] strArr10 = new String[i7];
                    if (length7 != 0) {
                        System.arraycopy(strArr9, 0, strArr10, 0, length7);
                    }
                    while (length7 < i7 - 1) {
                        strArr10[length7] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length7++;
                    }
                    strArr10[length7] = codedInputByteBufferNano.readString();
                    this.f5600t = strArr10;
                    continue;
                case 170:
                    if (this.f5601u == null) {
                        this.f5601u = new C2149s();
                    }
                    codedInputByteBufferNano.readMessage(this.f5601u);
                    continue;
                case 176:
                    this.f5602v = codedInputByteBufferNano.readBool();
                    continue;
                case 186:
                    int repeatedFieldArrayLength8 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 186);
                    C2142m[] mVarArr = this.f5603w;
                    int length8 = mVarArr == null ? 0 : mVarArr.length;
                    int i8 = repeatedFieldArrayLength8 + length8;
                    C2142m[] mVarArr2 = new C2142m[i8];
                    if (length8 != 0) {
                        System.arraycopy(mVarArr, 0, mVarArr2, 0, length8);
                    }
                    while (length8 < i8 - 1) {
                        mVarArr2[length8] = new C2142m();
                        codedInputByteBufferNano.readMessage(mVarArr2[length8]);
                        codedInputByteBufferNano.readTag();
                        length8++;
                    }
                    mVarArr2[length8] = new C2142m();
                    codedInputByteBufferNano.readMessage(mVarArr2[length8]);
                    this.f5603w = mVarArr2;
                    continue;
                case 194:
                    if (this.f5604x == null) {
                        this.f5604x = new C2146p();
                    }
                    codedInputByteBufferNano.readMessage(this.f5604x);
                    continue;
                case LOSS_REASON_CREATIVE_FILTERED_DISAPPROVED_VALUE:
                    this.f5605y = codedInputByteBufferNano.readString();
                    continue;
                case LOSS_REASON_CREATIVE_FILTERED_AD_TYPE_EXCLUSIONS_VALUE:
                    this.f5606z = codedInputByteBufferNano.readString();
                    continue;
                case 218:
                    this.f5558A = codedInputByteBufferNano.readString();
                    continue;
                case 224:
                    this.f5560C = codedInputByteBufferNano.readInt64();
                    continue;
                case 232:
                    this.f5561D = codedInputByteBufferNano.readInt64();
                    continue;
                case 240:
                    this.f5562E = codedInputByteBufferNano.readBool();
                    continue;
                case 258:
                    if (this.f5563F == null) {
                        this.f5563F = new C2143n();
                    }
                    codedInputByteBufferNano.readMessage(this.f5563F);
                    continue;
                case 266:
                    if (this.f5564G == null) {
                        this.f5564G = new C2133j();
                    }
                    codedInputByteBufferNano.readMessage(this.f5564G);
                    continue;
                case C5643c.COLLECT_MODE_ML_TEEN /*280*/:
                    this.f5565H = codedInputByteBufferNano.readInt32();
                    continue;
                case 288:
                    this.f5566I = codedInputByteBufferNano.readInt32();
                    continue;
                case 298:
                    if (this.f5567J == null) {
                        this.f5567J = new C2153w();
                    }
                    codedInputByteBufferNano.readMessage(this.f5567J);
                    continue;
                case 306:
                    if (this.f5568K == null) {
                        this.f5568K = new C2152v();
                    }
                    codedInputByteBufferNano.readMessage(this.f5568K);
                    continue;
                case 314:
                    if (this.f5569L == null) {
                        this.f5569L = new C2152v();
                    }
                    codedInputByteBufferNano.readMessage(this.f5569L);
                    continue;
                case C5643c.COLLECT_MODE_TIKTOKLITE /*330*/:
                    if (this.f5571N == null) {
                        this.f5571N = new C2150t();
                    }
                    codedInputByteBufferNano.readMessage(this.f5571N);
                    continue;
                case 338:
                    if (this.f5572O == null) {
                        this.f5572O = new C2126c();
                    }
                    codedInputByteBufferNano.readMessage(this.f5572O);
                    continue;
                case 346:
                    if (this.f5570M == null) {
                        this.f5570M = new C2152v();
                    }
                    codedInputByteBufferNano.readMessage(this.f5570M);
                    continue;
                case 354:
                    this.f5597q = codedInputByteBufferNano.readString();
                    continue;
                case 362:
                    if (this.f5573P == null) {
                        this.f5573P = new C2129f();
                    }
                    codedInputByteBufferNano.readMessage(this.f5573P);
                    continue;
                case 370:
                    int repeatedFieldArrayLength9 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 370);
                    String[] strArr11 = this.f5589i;
                    int length9 = strArr11 == null ? 0 : strArr11.length;
                    int i9 = repeatedFieldArrayLength9 + length9;
                    String[] strArr12 = new String[i9];
                    if (length9 != 0) {
                        System.arraycopy(strArr11, 0, strArr12, 0, length9);
                    }
                    while (length9 < i9 - 1) {
                        strArr12[length9] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length9++;
                    }
                    strArr12[length9] = codedInputByteBufferNano.readString();
                    this.f5589i = strArr12;
                    continue;
                case 378:
                    int repeatedFieldArrayLength10 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 378);
                    String[] strArr13 = this.f5574Q;
                    int length10 = strArr13 == null ? 0 : strArr13.length;
                    int i10 = repeatedFieldArrayLength10 + length10;
                    String[] strArr14 = new String[i10];
                    if (length10 != 0) {
                        System.arraycopy(strArr13, 0, strArr14, 0, length10);
                    }
                    while (length10 < i10 - 1) {
                        strArr14[length10] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length10++;
                    }
                    strArr14[length10] = codedInputByteBufferNano.readString();
                    this.f5574Q = strArr14;
                    continue;
                case 386:
                    if (this.f5575R == null) {
                        this.f5575R = new C2125b();
                    }
                    codedInputByteBufferNano.readMessage(this.f5575R);
                    continue;
                case 394:
                    this.f5559B = codedInputByteBufferNano.readString();
                    continue;
                case TTAdConstant.IMAGE_LIST_SIZE_CODE /*410*/:
                    if (this.f5576S == null) {
                        this.f5576S = new C2122a();
                    }
                    codedInputByteBufferNano.readMessage(this.f5576S);
                    continue;
                case 418:
                    if (this.f5577T == null) {
                        this.f5577T = new C2131h();
                    }
                    codedInputByteBufferNano.readMessage(this.f5577T);
                    continue;
                case 426:
                    if (this.f5578U == null) {
                        this.f5578U = new C2130g();
                    }
                    codedInputByteBufferNano.readMessage(this.f5578U);
                    continue;
                case 434:
                    int repeatedFieldArrayLength11 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 434);
                    C2127d[] dVarArr = this.f5590j;
                    int length11 = dVarArr == null ? 0 : dVarArr.length;
                    int i11 = repeatedFieldArrayLength11 + length11;
                    C2127d[] dVarArr2 = new C2127d[i11];
                    if (length11 != 0) {
                        System.arraycopy(dVarArr, 0, dVarArr2, 0, length11);
                    }
                    while (length11 < i11 - 1) {
                        dVarArr2[length11] = new C2127d();
                        codedInputByteBufferNano.readMessage(dVarArr2[length11]);
                        codedInputByteBufferNano.readTag();
                        length11++;
                    }
                    dVarArr2[length11] = new C2127d();
                    codedInputByteBufferNano.readMessage(dVarArr2[length11]);
                    this.f5590j = dVarArr2;
                    continue;
                case 442:
                    if (this.f5579V == null) {
                        this.f5579V = new C2148r();
                    }
                    codedInputByteBufferNano.readMessage(this.f5579V);
                    continue;
                case 450:
                    int repeatedFieldArrayLength12 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 450);
                    C2141l[] lVarArr = this.f5580W;
                    int length12 = lVarArr == null ? 0 : lVarArr.length;
                    int i12 = repeatedFieldArrayLength12 + length12;
                    C2141l[] lVarArr2 = new C2141l[i12];
                    if (length12 != 0) {
                        System.arraycopy(lVarArr, 0, lVarArr2, 0, length12);
                    }
                    while (length12 < i12 - 1) {
                        lVarArr2[length12] = new C2141l();
                        codedInputByteBufferNano.readMessage(lVarArr2[length12]);
                        codedInputByteBufferNano.readTag();
                        length12++;
                    }
                    lVarArr2[length12] = new C2141l();
                    codedInputByteBufferNano.readMessage(lVarArr2[length12]);
                    this.f5580W = lVarArr2;
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
        if (!this.f5581a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f5581a);
        }
        codedOutputByteBufferNano.writeInt64(3, this.f5582b);
        String[] strArr = this.f5583c;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.f5583c;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(4, str);
                }
                i2++;
            }
        }
        if (!this.f5584d.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.f5584d);
        }
        if (!this.f5585e.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f5585e);
        }
        String[] strArr3 = this.f5586f;
        if (strArr3 != null && strArr3.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr4 = this.f5586f;
                if (i3 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i3];
                if (str2 != null) {
                    codedOutputByteBufferNano.writeString(7, str2);
                }
                i3++;
            }
        }
        String[] strArr5 = this.f5587g;
        if (strArr5 != null && strArr5.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr6 = this.f5587g;
                if (i4 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i4];
                if (str3 != null) {
                    codedOutputByteBufferNano.writeString(8, str3);
                }
                i4++;
            }
        }
        String[] strArr7 = this.f5588h;
        if (strArr7 != null && strArr7.length > 0) {
            int i5 = 0;
            while (true) {
                String[] strArr8 = this.f5588h;
                if (i5 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i5];
                if (str4 != null) {
                    codedOutputByteBufferNano.writeString(9, str4);
                }
                i5++;
            }
        }
        C2132i iVar = this.f5591k;
        if (iVar != null) {
            codedOutputByteBufferNano.writeMessage(10, iVar);
        }
        C2134k[] kVarArr = this.f5592l;
        if (kVarArr != null && kVarArr.length > 0) {
            int i6 = 0;
            while (true) {
                C2134k[] kVarArr2 = this.f5592l;
                if (i6 >= kVarArr2.length) {
                    break;
                }
                C2134k kVar = kVarArr2[i6];
                if (kVar != null) {
                    codedOutputByteBufferNano.writeMessage(11, kVar);
                }
                i6++;
            }
        }
        C2147q qVar = this.f5593m;
        if (qVar != null) {
            codedOutputByteBufferNano.writeMessage(13, qVar);
        }
        C2144o[] oVarArr = this.f5594n;
        if (oVarArr != null && oVarArr.length > 0) {
            int i7 = 0;
            while (true) {
                C2144o[] oVarArr2 = this.f5594n;
                if (i7 >= oVarArr2.length) {
                    break;
                }
                C2144o oVar = oVarArr2[i7];
                if (oVar != null) {
                    codedOutputByteBufferNano.writeMessage(14, oVar);
                }
                i7++;
            }
        }
        if (!this.f5595o.equals("")) {
            codedOutputByteBufferNano.writeString(15, this.f5595o);
        }
        if (!this.f5596p.equals("")) {
            codedOutputByteBufferNano.writeString(16, this.f5596p);
        }
        codedOutputByteBufferNano.writeBool(17, this.f5598r);
        if (!this.f5599s.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f5599s);
        }
        String[] strArr9 = this.f5600t;
        if (strArr9 != null && strArr9.length > 0) {
            int i8 = 0;
            while (true) {
                String[] strArr10 = this.f5600t;
                if (i8 >= strArr10.length) {
                    break;
                }
                String str5 = strArr10[i8];
                if (str5 != null) {
                    codedOutputByteBufferNano.writeString(20, str5);
                }
                i8++;
            }
        }
        C2149s sVar = this.f5601u;
        if (sVar != null) {
            codedOutputByteBufferNano.writeMessage(21, sVar);
        }
        boolean z = this.f5602v;
        if (z) {
            codedOutputByteBufferNano.writeBool(22, z);
        }
        C2142m[] mVarArr = this.f5603w;
        if (mVarArr != null && mVarArr.length > 0) {
            int i9 = 0;
            while (true) {
                C2142m[] mVarArr2 = this.f5603w;
                if (i9 >= mVarArr2.length) {
                    break;
                }
                C2142m mVar = mVarArr2[i9];
                if (mVar != null) {
                    codedOutputByteBufferNano.writeMessage(23, mVar);
                }
                i9++;
            }
        }
        C2146p pVar = this.f5604x;
        if (pVar != null) {
            codedOutputByteBufferNano.writeMessage(24, pVar);
        }
        if (!this.f5605y.equals("")) {
            codedOutputByteBufferNano.writeString(25, this.f5605y);
        }
        if (!this.f5606z.equals("")) {
            codedOutputByteBufferNano.writeString(26, this.f5606z);
        }
        if (!this.f5558A.equals("")) {
            codedOutputByteBufferNano.writeString(27, this.f5558A);
        }
        codedOutputByteBufferNano.writeInt64(28, this.f5560C);
        codedOutputByteBufferNano.writeInt64(29, this.f5561D);
        boolean z2 = this.f5562E;
        if (z2) {
            codedOutputByteBufferNano.writeBool(30, z2);
        }
        C2143n nVar = this.f5563F;
        if (nVar != null) {
            codedOutputByteBufferNano.writeMessage(32, nVar);
        }
        C2133j jVar = this.f5564G;
        if (jVar != null) {
            codedOutputByteBufferNano.writeMessage(33, jVar);
        }
        codedOutputByteBufferNano.writeInt32(35, this.f5565H);
        codedOutputByteBufferNano.writeInt32(36, this.f5566I);
        C2153w wVar = this.f5567J;
        if (wVar != null) {
            codedOutputByteBufferNano.writeMessage(37, wVar);
        }
        C2152v vVar = this.f5568K;
        if (vVar != null) {
            codedOutputByteBufferNano.writeMessage(38, vVar);
        }
        C2152v vVar2 = this.f5569L;
        if (vVar2 != null) {
            codedOutputByteBufferNano.writeMessage(39, vVar2);
        }
        C2150t tVar = this.f5571N;
        if (tVar != null) {
            codedOutputByteBufferNano.writeMessage(41, tVar);
        }
        C2126c cVar = this.f5572O;
        if (cVar != null) {
            codedOutputByteBufferNano.writeMessage(42, cVar);
        }
        C2152v vVar3 = this.f5570M;
        if (vVar3 != null) {
            codedOutputByteBufferNano.writeMessage(43, vVar3);
        }
        if (!this.f5597q.equals("")) {
            codedOutputByteBufferNano.writeString(44, this.f5597q);
        }
        C2129f fVar = this.f5573P;
        if (fVar != null) {
            codedOutputByteBufferNano.writeMessage(45, fVar);
        }
        String[] strArr11 = this.f5589i;
        if (strArr11 != null && strArr11.length > 0) {
            int i10 = 0;
            while (true) {
                String[] strArr12 = this.f5589i;
                if (i10 >= strArr12.length) {
                    break;
                }
                String str6 = strArr12[i10];
                if (str6 != null) {
                    codedOutputByteBufferNano.writeString(46, str6);
                }
                i10++;
            }
        }
        String[] strArr13 = this.f5574Q;
        if (strArr13 != null && strArr13.length > 0) {
            int i11 = 0;
            while (true) {
                String[] strArr14 = this.f5574Q;
                if (i11 >= strArr14.length) {
                    break;
                }
                String str7 = strArr14[i11];
                if (str7 != null) {
                    codedOutputByteBufferNano.writeString(47, str7);
                }
                i11++;
            }
        }
        C2125b bVar = this.f5575R;
        if (bVar != null) {
            codedOutputByteBufferNano.writeMessage(48, bVar);
        }
        if (!this.f5559B.equals("")) {
            codedOutputByteBufferNano.writeString(49, this.f5559B);
        }
        C2122a aVar = this.f5576S;
        if (aVar != null) {
            codedOutputByteBufferNano.writeMessage(51, aVar);
        }
        C2131h hVar = this.f5577T;
        if (hVar != null) {
            codedOutputByteBufferNano.writeMessage(52, hVar);
        }
        C2130g gVar = this.f5578U;
        if (gVar != null) {
            codedOutputByteBufferNano.writeMessage(53, gVar);
        }
        C2127d[] dVarArr = this.f5590j;
        if (dVarArr != null && dVarArr.length > 0) {
            int i12 = 0;
            while (true) {
                C2127d[] dVarArr2 = this.f5590j;
                if (i12 >= dVarArr2.length) {
                    break;
                }
                C2127d dVar = dVarArr2[i12];
                if (dVar != null) {
                    codedOutputByteBufferNano.writeMessage(54, dVar);
                }
                i12++;
            }
        }
        C2148r rVar = this.f5579V;
        if (rVar != null) {
            codedOutputByteBufferNano.writeMessage(55, rVar);
        }
        C2141l[] lVarArr = this.f5580W;
        if (lVarArr != null && lVarArr.length > 0) {
            while (true) {
                C2141l[] lVarArr2 = this.f5580W;
                if (i >= lVarArr2.length) {
                    break;
                }
                C2141l lVar = lVarArr2[i];
                if (lVar != null) {
                    codedOutputByteBufferNano.writeMessage(56, lVar);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
