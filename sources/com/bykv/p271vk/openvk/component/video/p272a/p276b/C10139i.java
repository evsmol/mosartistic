package com.bykv.p271vk.openvk.component.video.p272a.p276b;

import android.net.Uri;
import android.text.TextUtils;
import com.bykv.p271vk.openvk.component.video.p272a.p283c.C10148a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.i */
/* compiled from: Request */
public class C10139i {

    /* renamed from: a */
    public final C10142c f25049a;

    /* renamed from: b */
    public final List<C10141b> f25050b;

    /* renamed from: c */
    public final C10140a f25051c;

    public C10139i(C10142c cVar, List<C10141b> list, C10140a aVar) {
        this.f25049a = cVar;
        this.f25050b = list;
        this.f25051c = aVar;
    }

    /* renamed from: a */
    public static C10139i m28884a(InputStream inputStream) throws IOException, C10143d {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C10148a.f25078a));
        ArrayList arrayList = new ArrayList();
        C10142c cVar = null;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine)) {
                break;
            }
            String trim = readLine.trim();
            if (cVar == null) {
                cVar = C10142c.m28889a(trim);
            } else {
                arrayList.add(C10141b.m28888a(trim));
            }
        }
        if (cVar != null) {
            return new C10139i(cVar, arrayList, C10140a.m28887a(cVar, arrayList));
        }
        throw new C10143d("request line is null");
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.i$c */
    /* compiled from: Request */
    static final class C10142c {

        /* renamed from: a */
        final String f25061a;

        /* renamed from: b */
        final String f25062b;

        /* renamed from: c */
        final String f25063c;

        private C10142c(String str, String str2, String str3) {
            this.f25061a = str;
            this.f25062b = str2;
            this.f25063c = str3;
        }

        /* renamed from: a */
        static C10142c m28889a(String str) throws C10143d {
            int indexOf = str.indexOf(32);
            if (indexOf != -1) {
                int lastIndexOf = str.lastIndexOf(32);
                if (lastIndexOf > indexOf) {
                    String trim = str.substring(0, indexOf).trim();
                    String trim2 = str.substring(indexOf + 1, lastIndexOf).trim();
                    String trim3 = str.substring(lastIndexOf + 1).trim();
                    if (trim.length() != 0 && trim2.length() != 0 && trim3.length() != 0) {
                        return new C10142c(trim, trim2, trim3);
                    }
                    throw new C10143d("request line format error, line: " + str);
                }
                throw new C10143d("request line format error, line: " + str);
            }
            throw new C10143d("request line format error, line: " + str);
        }

        public String toString() {
            return "RequestLine{method='" + this.f25061a + '\'' + ", path='" + this.f25062b + '\'' + ", version='" + this.f25063c + '\'' + '}';
        }
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.i$b */
    /* compiled from: Request */
    public static final class C10141b {

        /* renamed from: a */
        public final String f25059a;

        /* renamed from: b */
        public final String f25060b;

        public C10141b(String str, String str2) {
            this.f25059a = str;
            this.f25060b = str2;
        }

        /* renamed from: a */
        static C10141b m28888a(String str) throws C10143d {
            int indexOf = str.indexOf(":");
            if (indexOf != -1) {
                String trim = str.substring(0, indexOf).trim();
                String trim2 = str.substring(indexOf + 1).trim();
                if (trim.length() != 0 && trim2.length() != 0) {
                    return new C10141b(trim, trim2);
                }
                throw new C10143d("request header format error, header: " + str);
            }
            throw new C10143d("request header format error, header: " + str);
        }

        public String toString() {
            return "Header{name='" + this.f25059a + '\'' + ", value='" + this.f25060b + '\'' + '}';
        }
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.i$a */
    /* compiled from: Request */
    static final class C10140a {

        /* renamed from: a */
        final int f25052a;

        /* renamed from: b */
        final String f25053b;

        /* renamed from: c */
        final String f25054c;

        /* renamed from: d */
        final int f25055d;

        /* renamed from: e */
        final int f25056e;

        /* renamed from: f */
        final String f25057f;

        /* renamed from: g */
        final List<String> f25058g;

        private C10140a(int i, String str, String str2, int i2, int i3, String str3, List<String> list) {
            this.f25052a = i;
            this.f25053b = str;
            this.f25054c = str2;
            this.f25055d = i2;
            this.f25056e = i3;
            this.f25057f = str3;
            this.f25058g = list;
        }

        /* renamed from: a */
        static C10140a m28887a(C10142c cVar, List<C10141b> list) throws C10143d {
            int i;
            String str;
            int i2;
            int indexOf = cVar.f25062b.indexOf("?");
            if (indexOf != -1) {
                ArrayList arrayList = new ArrayList();
                String str2 = null;
                String str3 = null;
                String str4 = null;
                int i3 = 0;
                for (String split : cVar.f25062b.substring(indexOf + 1).split("&")) {
                    String[] split2 = split.split("=");
                    if (split2.length == 2) {
                        if ("rk".equals(split2[0])) {
                            str3 = Uri.decode(split2[1]);
                        } else if ("k".equals(split2[0])) {
                            str4 = Uri.decode(split2[1]);
                        } else if (split2[0].startsWith("u")) {
                            arrayList.add(Uri.decode(split2[1]));
                        } else if ("f".equals(split2[0]) && C10148a.m28915b(split2[1]) == 1) {
                            i3 = 1;
                        }
                    }
                }
                if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                    throw new C10143d("rawKey or key is empty, path: " + cVar.f25062b);
                }
                if (list != null) {
                    i2 = 0;
                    int i4 = 0;
                    for (C10141b next : list) {
                        if (next != null && "Range".equalsIgnoreCase(next.f25059a)) {
                            int indexOf2 = next.f25060b.indexOf("=");
                            if (indexOf2 == -1) {
                                throw new C10143d("Range format error, Range: " + next.f25060b);
                            } else if ("bytes".equalsIgnoreCase(next.f25060b.substring(0, indexOf2).trim())) {
                                String substring = next.f25060b.substring(indexOf2 + 1);
                                if (!substring.contains(",")) {
                                    int indexOf3 = substring.indexOf("-");
                                    if (indexOf3 != -1) {
                                        String trim = substring.substring(0, indexOf3).trim();
                                        String trim2 = substring.substring(indexOf3 + 1).trim();
                                        try {
                                            if (trim.length() > 0) {
                                                i2 = Integer.parseInt(trim);
                                            }
                                            if (trim2.length() > 0) {
                                                i4 = Integer.parseInt(trim2);
                                                if (i2 > i4) {
                                                    throw new C10143d("Range format error, Range: " + next.f25060b);
                                                }
                                            }
                                            str2 = next.f25060b;
                                        } catch (NumberFormatException unused) {
                                            throw new C10143d("Range format error, Range: " + next.f25060b);
                                        }
                                    } else {
                                        throw new C10143d("Range format error, Range: " + next.f25060b);
                                    }
                                } else {
                                    throw new C10143d("Range format error, Range: " + next.f25060b);
                                }
                            } else {
                                throw new C10143d("Range format error, Range: " + next.f25060b);
                            }
                        }
                    }
                    i = i4;
                    str = str2;
                } else {
                    str = null;
                    i = 0;
                    i2 = 0;
                }
                if (!arrayList.isEmpty()) {
                    return new C10140a(i3, str3, str4, i2, i, str, arrayList);
                }
                throw new C10143d("no url found: path: " + cVar.f25062b);
            }
            throw new C10143d("path format error, path: " + cVar.f25062b);
        }

        public String toString() {
            return "Extra{flag=" + this.f25052a + ", rawKey='" + this.f25053b + '\'' + ", key='" + this.f25054c + '\'' + ", from=" + this.f25055d + ", to=" + this.f25056e + ", urls=" + this.f25058g + '}';
        }
    }

    /* renamed from: a */
    static String m28885a(String str, String str2, List<String> list) {
        StringBuilder sb = new StringBuilder(512);
        String str3 = null;
        do {
            if (str3 != null) {
                if (list.size() == 1) {
                    return null;
                }
                list.remove(list.size() - 1);
            }
            str3 = m28886a(sb, str, str2, list);
        } while (str3.length() > 3072);
        return str3;
    }

    /* renamed from: a */
    private static String m28886a(StringBuilder sb, String str, String str2, List<String> list) {
        sb.delete(0, sb.length());
        sb.append("rk");
        sb.append("=");
        sb.append(Uri.encode(str));
        sb.append("&");
        sb.append("k");
        sb.append("=");
        sb.append(Uri.encode(str2));
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append("&");
            sb.append("u");
            sb.append(i);
            sb.append("=");
            sb.append(Uri.encode(list.get(i)));
        }
        return sb.toString();
    }

    public String toString() {
        return "Request{requestLine=" + this.f25049a + ", headers=" + this.f25050b + ", extra=" + this.f25051c + '}';
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.i$d */
    /* compiled from: Request */
    static final class C10143d extends Exception {
        C10143d(String str) {
            super(str);
        }
    }
}
