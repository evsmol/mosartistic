package com.criteo.publisher.p074n0;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.nio.charset.Charset;

/* renamed from: com.criteo.publisher.n0.l */
/* compiled from: JsonSerializer */
public class C1308l {

    /* renamed from: a */
    private final Gson f4027a;

    public C1308l(Gson gson) {
        this.f4027a = gson;
    }

    /* renamed from: a */
    public void mo3660a(Object obj, OutputStream outputStream) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, Charset.forName("UTF-8"));
        try {
            this.f4027a.toJson(obj, (Appendable) outputStreamWriter);
            outputStreamWriter.flush();
        } catch (JsonIOException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: a */
    public <T> T mo3659a(Class<T> cls, InputStream inputStream) throws IOException {
        try {
            T fromJson = this.f4027a.fromJson((Reader) new InputStreamReader(inputStream, Charset.forName("UTF-8")), cls);
            if (fromJson != null) {
                return fromJson;
            }
            throw new EOFException();
        } catch (JsonParseException e) {
            throw new IOException(e);
        }
    }
}
