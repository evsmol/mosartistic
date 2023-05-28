package com.apm.insight.nativecrash;

import com.apm.insight.C6553b;
import com.apm.insight.p178l.C6677k;
import com.apm.insight.p178l.C6685o;
import com.appnext.base.p264b.C8849c;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.apm.insight.nativecrash.d */
public class C6714d {

    /* renamed from: i */
    private static final Pattern f14407i = Pattern.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");

    /* renamed from: j */
    private static final Pattern f14408j = Pattern.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");

    /* renamed from: k */
    private static final Pattern f14409k = Pattern.compile("^Abort message: (.*)$");

    /* renamed from: l */
    private static final Pattern f14410l = Pattern.compile("^Crash message: (.*)$");

    /* renamed from: m */
    private static final Pattern f14411m = Pattern.compile("^    \\/(\\w*)\\/.*\\/(.*\\.so)\\s\\(BuildId: ([a-f0-9]*)\\)$");

    /* renamed from: a */
    private String f14412a;

    /* renamed from: b */
    private String f14413b;

    /* renamed from: c */
    private String f14414c;

    /* renamed from: d */
    private String f14415d;

    /* renamed from: e */
    private String f14416e;

    /* renamed from: f */
    private String f14417f;

    /* renamed from: g */
    private String f14418g;

    /* renamed from: h */
    private Map<String, String> f14419h = new HashMap();

    public C6714d(File file) {
        m16782b(C6685o.m16591b(file));
    }

    /* renamed from: b */
    private void m16782b(File file) {
        String str;
        if (file.exists() && file.length() != 0) {
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                int i = 0;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null || i >= 64) {
                            break;
                        }
                        if (this.f14412a != null || !readLine.startsWith("pid: ")) {
                            if (this.f14416e == null) {
                                if (readLine.startsWith("signal ")) {
                                    Matcher matcher = f14408j.matcher(readLine);
                                    if (matcher.find() && matcher.groupCount() == 3) {
                                        String replace = matcher.group(1).replace(" ", "");
                                        String replace2 = matcher.group(2).replace(" ", "");
                                        int indexOf = replace2.indexOf("frompid");
                                        if (indexOf > 0) {
                                            replace2 = replace2.substring(0, indexOf) + ")";
                                        }
                                        this.f14416e = "Signal " + replace + ", Code " + replace2 + "\n";
                                    }
                                }
                            }
                            if (this.f14417f == null && readLine.startsWith("Abort ")) {
                                Matcher matcher2 = f14409k.matcher(readLine);
                                if (matcher2.find() && matcher2.groupCount() == 1) {
                                    str = "abort message: " + matcher2.group(1) + "\n";
                                }
                            } else if (this.f14417f == null && readLine.startsWith("Crash ")) {
                                Matcher matcher3 = f14410l.matcher(readLine);
                                if (matcher3.find() && matcher3.groupCount() == 1) {
                                    str = "crash message: " + matcher3.group(1) + "\n";
                                }
                            } else if (this.f14418g == null && readLine.startsWith("backtrace:")) {
                                StringBuilder sb = new StringBuilder();
                                while (true) {
                                    String readLine2 = bufferedReader2.readLine();
                                    if (readLine2 == null || !readLine2.startsWith("    #")) {
                                        i++;
                                        this.f14418g = sb.toString();
                                    } else {
                                        sb.append(readLine2.substring(4));
                                        sb.append(10);
                                    }
                                }
                                i++;
                                this.f14418g = sb.toString();
                            } else if (this.f14419h.isEmpty() && readLine.startsWith("build id:")) {
                                while (true) {
                                    String readLine3 = bufferedReader2.readLine();
                                    if (readLine3 == null) {
                                        break;
                                    } else if (!readLine3.contains("BuildId:")) {
                                        break;
                                    } else {
                                        Matcher matcher4 = f14411m.matcher(readLine3);
                                        if (matcher4.find()) {
                                            String group = matcher4.group(1);
                                            String group2 = matcher4.group(2);
                                            String group3 = matcher4.group(3);
                                            if (group.equals(C8849c.DATA)) {
                                                this.f14419h.put(group2, group3);
                                            }
                                        }
                                    }
                                }
                            }
                            this.f14417f = str;
                        } else {
                            Matcher matcher5 = f14407i.matcher(readLine);
                            if (matcher5.find() && matcher5.groupCount() == 4) {
                                this.f14412a = matcher5.group(1);
                                this.f14413b = matcher5.group(2);
                                this.f14415d = matcher5.group(3);
                                this.f14414c = matcher5.group(4);
                            }
                        }
                        i++;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        try {
                            C6553b.m16004a().mo52019a("NPTH_CATCH", th);
                        } finally {
                            C6677k.m16550a((Closeable) bufferedReader);
                        }
                    }
                }
                C6677k.m16550a((Closeable) bufferedReader2);
            } catch (Throwable th2) {
                th = th2;
                C6553b.m16004a().mo52019a("NPTH_CATCH", th);
            }
        }
    }

    /* renamed from: a */
    public String mo52201a() {
        return this.f14418g;
    }

    /* renamed from: a */
    public void mo52202a(File file) {
        File b = C6685o.m16591b(file);
        if (b.exists()) {
            b.renameTo(new File(b.getAbsoluteFile() + ".old"));
        }
        NativeImpl.m16704a(file);
        m16782b(C6685o.m16591b(file));
    }

    /* renamed from: b */
    public Map<String, String> mo52203b() {
        return this.f14419h;
    }

    /* renamed from: c */
    public String mo52204c() {
        StringBuilder sb = new StringBuilder();
        String str = this.f14416e;
        if (str != null) {
            sb.append(str);
        }
        String str2 = this.f14417f;
        if (str2 != null) {
            sb.append(str2);
        }
        String str3 = this.f14418g;
        if (str3 != null) {
            sb.append(str3);
        }
        return sb.toString();
    }
}
