package com.google.protobuf.nano.p091ym;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import kotlin.KotlinVersion;

/* renamed from: com.google.protobuf.nano.ym.CodedOutputByteBufferNano */
public final class CodedOutputByteBufferNano {
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    public static final int LITTLE_ENDIAN_64_SIZE = 8;
    private final byte[] buffer;
    private final int limit;
    private int position;

    /* renamed from: com.google.protobuf.nano.ym.CodedOutputByteBufferNano$OutOfSpaceException */
    public class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException(int i, int i2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i + " limit " + i2 + ").");
        }
    }

    private CodedOutputByteBufferNano(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        this.position = i;
        this.limit = i + i2;
    }

    public static int computeBoolSize(int i, boolean z) {
        return computeTagSize(i) + computeBoolSizeNoTag(z);
    }

    public static int computeBoolSizeNoTag(boolean z) {
        return 1;
    }

    public static int computeBytesSize(int i, byte[] bArr) {
        return computeTagSize(i) + computeBytesSizeNoTag(bArr);
    }

    public static int computeBytesSizeNoTag(byte[] bArr) {
        return computeRawVarint32Size(bArr.length) + bArr.length;
    }

    public static int computeDoubleSize(int i, double d) {
        return computeTagSize(i) + computeDoubleSizeNoTag(d);
    }

    public static int computeDoubleSizeNoTag(double d) {
        return 8;
    }

    public static int computeEnumSize(int i, int i2) {
        return computeTagSize(i) + computeEnumSizeNoTag(i2);
    }

    public static int computeEnumSizeNoTag(int i) {
        return computeRawVarint32Size(i);
    }

    public static int computeFixed32Size(int i, int i2) {
        return computeTagSize(i) + computeFixed32SizeNoTag(i2);
    }

    public static int computeFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeFixed64Size(int i, long j) {
        return computeTagSize(i) + computeFixed64SizeNoTag(j);
    }

    public static int computeFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int computeFloatSize(int i, float f) {
        return computeTagSize(i) + computeFloatSizeNoTag(f);
    }

    public static int computeFloatSizeNoTag(float f) {
        return 4;
    }

    public static int computeGroupSize(int i, MessageNano messageNano) {
        return (computeTagSize(i) * 2) + computeGroupSizeNoTag(messageNano);
    }

    public static int computeGroupSizeNoTag(MessageNano messageNano) {
        return messageNano.getSerializedSize();
    }

    public static int computeInt32Size(int i, int i2) {
        return computeTagSize(i) + computeInt32SizeNoTag(i2);
    }

    public static int computeInt32SizeNoTag(int i) {
        if (i >= 0) {
            return computeRawVarint32Size(i);
        }
        return 10;
    }

    public static int computeInt64Size(int i, long j) {
        return computeTagSize(i) + computeInt64SizeNoTag(j);
    }

    public static int computeInt64SizeNoTag(long j) {
        return computeRawVarint64Size(j);
    }

    public static int computeMessageSize(int i, MessageNano messageNano) {
        return computeTagSize(i) + computeMessageSizeNoTag(messageNano);
    }

    public static int computeMessageSizeNoTag(MessageNano messageNano) {
        int serializedSize = messageNano.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computeRawVarint32Size(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public static int computeRawVarint64Size(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int computeSFixed32Size(int i, int i2) {
        return computeTagSize(i) + computeSFixed32SizeNoTag(i2);
    }

    public static int computeSFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeSFixed64Size(int i, long j) {
        return computeTagSize(i) + computeSFixed64SizeNoTag(j);
    }

    public static int computeSFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int computeSInt32Size(int i, int i2) {
        return computeTagSize(i) + computeSInt32SizeNoTag(i2);
    }

    public static int computeSInt32SizeNoTag(int i) {
        return computeRawVarint32Size(encodeZigZag32(i));
    }

    public static int computeSInt64Size(int i, long j) {
        return computeTagSize(i) + computeSInt64SizeNoTag(j);
    }

    public static int computeSInt64SizeNoTag(long j) {
        return computeRawVarint64Size(encodeZigZag64(j));
    }

    public static int computeStringSize(int i, String str) {
        return computeTagSize(i) + computeStringSizeNoTag(str);
    }

    public static int computeStringSizeNoTag(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return computeRawVarint32Size(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    public static int computeTagSize(int i) {
        return computeRawVarint32Size(WireFormatNano.makeTag(i, 0));
    }

    public static int computeUInt32Size(int i, int i2) {
        return computeTagSize(i) + computeUInt32SizeNoTag(i2);
    }

    public static int computeUInt32SizeNoTag(int i) {
        return computeRawVarint32Size(i);
    }

    public static int computeUInt64Size(int i, long j) {
        return computeTagSize(i) + computeUInt64SizeNoTag(j);
    }

    public static int computeUInt64SizeNoTag(long j) {
        return computeRawVarint64Size(j);
    }

    public static int encodeZigZag32(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long encodeZigZag64(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static CodedOutputByteBufferNano newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static CodedOutputByteBufferNano newInstance(byte[] bArr, int i, int i2) {
        return new CodedOutputByteBufferNano(bArr, i, i2);
    }

    public void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public int spaceLeft() {
        return this.limit - this.position;
    }

    public void writeBool(int i, boolean z) {
        writeTag(i, 0);
        writeBoolNoTag(z);
    }

    public void writeBoolNoTag(boolean z) {
        writeRawByte(z ? 1 : 0);
    }

    public void writeBytes(int i, byte[] bArr) {
        writeTag(i, 2);
        writeBytesNoTag(bArr);
    }

    public void writeBytesNoTag(byte[] bArr) {
        writeRawVarint32(bArr.length);
        writeRawBytes(bArr);
    }

    public void writeDouble(int i, double d) {
        writeTag(i, 1);
        writeDoubleNoTag(d);
    }

    public void writeDoubleNoTag(double d) {
        writeRawLittleEndian64(Double.doubleToLongBits(d));
    }

    public void writeEnum(int i, int i2) {
        writeTag(i, 0);
        writeEnumNoTag(i2);
    }

    public void writeEnumNoTag(int i) {
        writeRawVarint32(i);
    }

    public void writeFixed32(int i, int i2) {
        writeTag(i, 5);
        writeFixed32NoTag(i2);
    }

    public void writeFixed32NoTag(int i) {
        writeRawLittleEndian32(i);
    }

    public void writeFixed64(int i, long j) {
        writeTag(i, 1);
        writeFixed64NoTag(j);
    }

    public void writeFixed64NoTag(long j) {
        writeRawLittleEndian64(j);
    }

    public void writeFloat(int i, float f) {
        writeTag(i, 5);
        writeFloatNoTag(f);
    }

    public void writeFloatNoTag(float f) {
        writeRawLittleEndian32(Float.floatToIntBits(f));
    }

    public void writeGroup(int i, MessageNano messageNano) {
        writeTag(i, 3);
        writeGroupNoTag(messageNano);
        writeTag(i, 4);
    }

    public void writeGroupNoTag(MessageNano messageNano) {
        messageNano.writeTo(this);
    }

    public void writeInt32(int i, int i2) {
        writeTag(i, 0);
        writeInt32NoTag(i2);
    }

    public void writeInt32NoTag(int i) {
        if (i >= 0) {
            writeRawVarint32(i);
        } else {
            writeRawVarint64((long) i);
        }
    }

    public void writeInt64(int i, long j) {
        writeTag(i, 0);
        writeInt64NoTag(j);
    }

    public void writeInt64NoTag(long j) {
        writeRawVarint64(j);
    }

    public void writeMessage(int i, MessageNano messageNano) {
        writeTag(i, 2);
        writeMessageNoTag(messageNano);
    }

    public void writeMessageNoTag(MessageNano messageNano) {
        writeRawVarint32(messageNano.getCachedSize());
        messageNano.writeTo(this);
    }

    public void writeRawByte(byte b) {
        int i = this.position;
        if (i != this.limit) {
            byte[] bArr = this.buffer;
            this.position = i + 1;
            bArr[i] = b;
            return;
        }
        throw new OutOfSpaceException(this.position, this.limit);
    }

    public void writeRawByte(int i) {
        writeRawByte((byte) i);
    }

    public void writeRawBytes(byte[] bArr) {
        writeRawBytes(bArr, 0, bArr.length);
    }

    public void writeRawBytes(byte[] bArr, int i, int i2) {
        int i3 = this.limit;
        int i4 = this.position;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.buffer, i4, i2);
            this.position += i2;
            return;
        }
        throw new OutOfSpaceException(this.position, this.limit);
    }

    public void writeRawLittleEndian32(int i) {
        writeRawByte(i & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public void writeRawLittleEndian64(long j) {
        writeRawByte(((int) j) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte(((int) (j >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte(((int) (j >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte(((int) (j >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte(((int) (j >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte(((int) (j >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte(((int) (j >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte(((int) (j >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public void writeRawVarint32(int i) {
        while ((i & -128) != 0) {
            writeRawByte((i & 127) | 128);
            i >>>= 7;
        }
        writeRawByte(i);
    }

    public void writeRawVarint64(long j) {
        while ((-128 & j) != 0) {
            writeRawByte((((int) j) & 127) | 128);
            j >>>= 7;
        }
        writeRawByte((int) j);
    }

    public void writeSFixed32(int i, int i2) {
        writeTag(i, 5);
        writeSFixed32NoTag(i2);
    }

    public void writeSFixed32NoTag(int i) {
        writeRawLittleEndian32(i);
    }

    public void writeSFixed64(int i, long j) {
        writeTag(i, 1);
        writeSFixed64NoTag(j);
    }

    public void writeSFixed64NoTag(long j) {
        writeRawLittleEndian64(j);
    }

    public void writeSInt32(int i, int i2) {
        writeTag(i, 0);
        writeSInt32NoTag(i2);
    }

    public void writeSInt32NoTag(int i) {
        writeRawVarint32(encodeZigZag32(i));
    }

    public void writeSInt64(int i, long j) {
        writeTag(i, 0);
        writeSInt64NoTag(j);
    }

    public void writeSInt64NoTag(long j) {
        writeRawVarint64(encodeZigZag64(j));
    }

    public void writeString(int i, String str) {
        writeTag(i, 2);
        writeStringNoTag(str);
    }

    public void writeStringNoTag(String str) {
        byte[] bytes = str.getBytes("UTF-8");
        writeRawVarint32(bytes.length);
        writeRawBytes(bytes);
    }

    public void writeTag(int i, int i2) {
        writeRawVarint32(WireFormatNano.makeTag(i, i2));
    }

    public void writeUInt32(int i, int i2) {
        writeTag(i, 0);
        writeUInt32NoTag(i2);
    }

    public void writeUInt32NoTag(int i) {
        writeRawVarint32(i);
    }

    public void writeUInt64(int i, long j) {
        writeTag(i, 0);
        writeUInt64NoTag(j);
    }

    public void writeUInt64NoTag(long j) {
        writeRawVarint64(j);
    }
}
