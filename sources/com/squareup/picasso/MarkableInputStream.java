package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

final class MarkableInputStream extends InputStream {
    private boolean allowExpire;
    private long defaultMark;

    /* renamed from: in */
    private final InputStream f12771in;
    private long limit;
    private int limitIncrement;
    private long offset;
    private long reset;

    MarkableInputStream(InputStream inputStream) {
        this(inputStream, 4096);
    }

    MarkableInputStream(InputStream inputStream, int i) {
        this(inputStream, i, 1024);
    }

    private MarkableInputStream(InputStream inputStream, int i, int i2) {
        this.defaultMark = -1;
        this.allowExpire = true;
        this.limitIncrement = -1;
        this.f12771in = !inputStream.markSupported() ? new BufferedInputStream(inputStream, i) : inputStream;
        this.limitIncrement = i2;
    }

    public void mark(int i) {
        this.defaultMark = savePosition(i);
    }

    public long savePosition(int i) {
        long j = this.offset + ((long) i);
        if (this.limit < j) {
            setLimit(j);
        }
        return this.offset;
    }

    public void allowMarksToExpire(boolean z) {
        this.allowExpire = z;
    }

    private void setLimit(long j) {
        try {
            if (this.reset >= this.offset || this.offset > this.limit) {
                this.reset = this.offset;
                this.f12771in.mark((int) (j - this.offset));
            } else {
                this.f12771in.reset();
                this.f12771in.mark((int) (j - this.reset));
                skip(this.reset, this.offset);
            }
            this.limit = j;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to mark: " + e);
        }
    }

    public void reset() throws IOException {
        reset(this.defaultMark);
    }

    public void reset(long j) throws IOException {
        if (this.offset > this.limit || j < this.reset) {
            throw new IOException("Cannot reset");
        }
        this.f12771in.reset();
        skip(this.reset, j);
        this.offset = j;
    }

    private void skip(long j, long j2) throws IOException {
        while (j < j2) {
            long skip = this.f12771in.skip(j2 - j);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j += skip;
        }
    }

    public int read() throws IOException {
        if (!this.allowExpire) {
            long j = this.limit;
            if (this.offset + 1 > j) {
                setLimit(j + ((long) this.limitIncrement));
            }
        }
        int read = this.f12771in.read();
        if (read != -1) {
            this.offset++;
        }
        return read;
    }

    public int read(byte[] bArr) throws IOException {
        if (!this.allowExpire) {
            long j = this.offset;
            if (((long) bArr.length) + j > this.limit) {
                setLimit(j + ((long) bArr.length) + ((long) this.limitIncrement));
            }
        }
        int read = this.f12771in.read(bArr);
        if (read != -1) {
            this.offset += (long) read;
        }
        return read;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.allowExpire) {
            long j = this.offset;
            long j2 = (long) i2;
            if (j + j2 > this.limit) {
                setLimit(j + j2 + ((long) this.limitIncrement));
            }
        }
        int read = this.f12771in.read(bArr, i, i2);
        if (read != -1) {
            this.offset += (long) read;
        }
        return read;
    }

    public long skip(long j) throws IOException {
        if (!this.allowExpire) {
            long j2 = this.offset;
            if (j2 + j > this.limit) {
                setLimit(j2 + j + ((long) this.limitIncrement));
            }
        }
        long skip = this.f12771in.skip(j);
        this.offset += skip;
        return skip;
    }

    public int available() throws IOException {
        return this.f12771in.available();
    }

    public void close() throws IOException {
        this.f12771in.close();
    }

    public boolean markSupported() {
        return this.f12771in.markSupported();
    }
}
