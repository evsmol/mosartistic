package com.applovin.impl.sdk.utils;

import android.util.Xml;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* renamed from: com.applovin.impl.sdk.utils.t */
public class C8623t {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8626v f21779a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Stack<C8625a> f21780b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public StringBuilder f21781c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f21782d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C8625a f21783e;

    /* renamed from: com.applovin.impl.sdk.utils.t$a */
    private static class C8625a extends C8622s {
        C8625a(String str, Map<String, String> map, C8622s sVar) {
            super(str, map, sVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo57814a(C8622s sVar) {
            if (sVar != null) {
                this.f21775c.add(sVar);
                return;
            }
            throw new IllegalArgumentException("None specified.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo57815d(String str) {
            this.f21774b = str;
        }
    }

    C8623t(C8490n nVar) {
        if (nVar != null) {
            this.f21779a = nVar.mo57320D();
            return;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    /* renamed from: a */
    public static C8622s m26237a(String str, C8490n nVar) throws SAXException {
        return new C8623t(nVar).mo57802a(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Map<String, String> m26241a(Attributes attributes) {
        if (attributes == null) {
            return Collections.emptyMap();
        }
        int length = attributes.getLength();
        Map<String, String> map = CollectionUtils.map(length);
        for (int i = 0; i < length; i++) {
            map.put(attributes.getQName(i), attributes.getValue(i));
        }
        return map;
    }

    /* renamed from: a */
    public C8622s mo57802a(String str) throws SAXException {
        if (str != null) {
            this.f21781c = new StringBuilder();
            this.f21780b = new Stack<>();
            this.f21783e = null;
            Xml.parse(str, new ContentHandler() {
                public void characters(char[] cArr, int i, int i2) {
                    String trim = new String(Arrays.copyOfRange(cArr, i, i2)).trim();
                    if (StringUtils.isValidString(trim)) {
                        C8623t.this.f21781c.append(trim);
                    }
                }

                public void endDocument() {
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - C8623t.this.f21782d;
                    C8626v unused = C8623t.this.f21779a;
                    if (C8626v.m26252a()) {
                        C8626v a = C8623t.this.f21779a;
                        a.mo57818b("XmlParser", "Finished parsing in " + seconds + " seconds");
                    }
                }

                public void endElement(String str, String str2, String str3) {
                    C8623t tVar = C8623t.this;
                    C8625a unused = tVar.f21783e = (C8625a) tVar.f21780b.pop();
                    C8623t.this.f21783e.mo57815d(C8623t.this.f21781c.toString().trim());
                    C8623t.this.f21781c.setLength(0);
                }

                public void endPrefixMapping(String str) {
                }

                public void ignorableWhitespace(char[] cArr, int i, int i2) {
                }

                public void processingInstruction(String str, String str2) {
                }

                public void setDocumentLocator(Locator locator) {
                }

                public void skippedEntity(String str) {
                }

                public void startDocument() {
                    C8626v unused = C8623t.this.f21779a;
                    if (C8626v.m26252a()) {
                        C8623t.this.f21779a.mo57818b("XmlParser", "Begin parsing...");
                    }
                    long unused2 = C8623t.this.f21782d = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                }

                public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
                    C8625a aVar = null;
                    try {
                        if (!C8623t.this.f21780b.isEmpty()) {
                            aVar = (C8625a) C8623t.this.f21780b.peek();
                        }
                        C8625a aVar2 = new C8625a(str2, C8623t.this.m26241a(attributes), aVar);
                        if (aVar != null) {
                            aVar.mo57814a(aVar2);
                        }
                        C8623t.this.f21780b.push(aVar2);
                    } catch (Exception e) {
                        C8626v unused = C8623t.this.f21779a;
                        if (C8626v.m26252a()) {
                            C8626v a = C8623t.this.f21779a;
                            a.mo57819b("XmlParser", "Unable to process element <" + str2 + ">", e);
                        }
                        throw new SAXException("Failed to start element", e);
                    }
                }

                public void startPrefixMapping(String str, String str2) {
                }
            });
            C8625a aVar = this.f21783e;
            if (aVar != null) {
                return aVar;
            }
            throw new SAXException("Unable to parse XML into node");
        }
        throw new IllegalArgumentException("Unable to parse. No XML specified.");
    }
}
