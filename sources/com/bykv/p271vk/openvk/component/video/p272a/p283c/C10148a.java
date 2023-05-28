package com.bykv.p271vk.openvk.component.video.p272a.p283c;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.C10139i;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p278b.C10091a;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p278b.C10093c;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p281e.C10114a;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p281e.C10119e;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10618g;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.RandomAccessFile;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.bykv.vk.openvk.component.video.a.c.a */
/* compiled from: Util */
public final class C10148a {

    /* renamed from: a */
    public static final Charset f25078a = Charset.forName("UTF-8");

    /* renamed from: b */
    private static final Handler f25079b = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static void m28909a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m28912a(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m28913a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m28910a(RandomAccessFile randomAccessFile) {
        if (randomAccessFile != null) {
            try {
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m28914a(String str) {
        return str != null && (str.startsWith("http://") || str.startsWith("https://"));
    }

    /* renamed from: b */
    public static int m28915b(String str) {
        return m28899a(str, 0);
    }

    /* renamed from: a */
    public static int m28899a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: a */
    public static String m28903a(C10114a aVar, int i) {
        int a;
        if (aVar == null || !aVar.mo62747b()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.mo62750e().toUpperCase());
        sb.append(' ');
        sb.append(aVar.mo62743a());
        sb.append(' ');
        sb.append(aVar.mo62751f());
        sb.append("\r\n");
        if (C10112e.f24979c) {
            Log.i("TAG_PROXY_headers", aVar.mo62750e().toUpperCase() + " " + aVar.mo62743a() + " " + aVar.mo62751f());
        }
        List<C10139i.C10141b> a2 = m28905a(aVar.mo62748c());
        boolean z = true;
        if (a2 != null) {
            int size = a2.size();
            for (int i2 = 0; i2 < size; i2++) {
                C10139i.C10141b bVar = a2.get(i2);
                if (bVar != null) {
                    String str = bVar.f25059a;
                    String str2 = bVar.f25060b;
                    sb.append(str);
                    sb.append(": ");
                    sb.append(str2);
                    sb.append("\r\n");
                    if ("Content-Range".equalsIgnoreCase(str) || ("Accept-Ranges".equalsIgnoreCase(str) && "bytes".equalsIgnoreCase(str2))) {
                        z = false;
                    }
                }
            }
        }
        if (z && (a = m28898a(aVar)) > 0) {
            sb.append("Content-Range: bytes ");
            sb.append(Math.max(i, 0));
            sb.append("-");
            sb.append(a - 1);
            sb.append("/");
            sb.append(a);
            sb.append("\r\n");
        }
        sb.append("Connection: close");
        sb.append("\r\n");
        sb.append("\r\n");
        String sb2 = sb.toString();
        if (C10112e.f24979c) {
            Log.i("TAG_PROXY_WRITE_TO_MP", sb2);
        }
        return sb2;
    }

    /* renamed from: a */
    public static String m28901a(int i, int i2) {
        String b = m28916b(i, i2);
        if (b == null) {
            return null;
        }
        return "bytes=" + b;
    }

    /* renamed from: b */
    public static String m28916b(int i, int i2) {
        if (i >= 0 && i2 > 0) {
            return i + "-" + i2;
        } else if (i > 0) {
            return i + "-";
        } else if (i >= 0 || i2 <= 0) {
            return null;
        } else {
            return "-" + i2;
        }
    }

    /* renamed from: a */
    public static List<String> m28907a(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (m28914a(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m28902a(C10091a aVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (i <= 0) {
            sb.append("HTTP/1.1 200 OK");
            sb.append("\r\n");
        } else {
            sb.append("HTTP/1.1 206 Partial Content");
            sb.append("\r\n");
        }
        sb.append("Accept-Ranges: bytes");
        sb.append("\r\n");
        sb.append("Content-Type: ");
        sb.append(aVar.f24932b);
        sb.append("\r\n");
        if (i <= 0) {
            sb.append("Content-Length: ");
            sb.append(aVar.f24933c);
            sb.append("\r\n");
        } else {
            sb.append("Content-Range: bytes ");
            sb.append(i);
            sb.append("-");
            sb.append(aVar.f24933c - 1);
            sb.append("/");
            sb.append(aVar.f24933c);
            sb.append("\r\n");
            sb.append("Content-Length: ");
            sb.append(aVar.f24933c - i);
            sb.append("\r\n");
        }
        sb.append("Connection: close");
        sb.append("\r\n");
        sb.append("\r\n");
        String sb2 = sb.toString();
        if (C10112e.f24979c) {
            Log.i("TAG_PROXY_WRITE_TO_MP", sb2);
        }
        return sb2;
    }

    /* renamed from: a */
    public static int m28897a() {
        File[] listFiles;
        if (Build.VERSION.SDK_INT >= 17) {
            return Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        try {
            File file = new File("/sys/devices/system/cpu/");
            if (!file.exists() || (listFiles = file.listFiles(new FilenameFilter() {

                /* renamed from: a */
                private Pattern f25080a = Pattern.compile("^cpu[0-9]+$");

                public boolean accept(File file, String str) {
                    return this.f25080a.matcher(str).matches();
                }
            })) == null) {
                return 1;
            }
            return Math.max(listFiles.length, 1);
        } catch (Throwable unused) {
            return 1;
        }
    }

    /* renamed from: a */
    public static int m28898a(C10114a aVar) {
        int lastIndexOf;
        if (aVar == null) {
            return -1;
        }
        if (aVar.mo62743a() == 200) {
            return m28899a(aVar.mo62746a("Content-Length", (String) null), -1);
        }
        if (aVar.mo62743a() == 206) {
            String a = aVar.mo62746a("Content-Range", (String) null);
            if (!TextUtils.isEmpty(a) && (lastIndexOf = a.lastIndexOf("/")) >= 0 && lastIndexOf < a.length() - 1) {
                return m28899a(a.substring(lastIndexOf + 1), -1);
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static String m28904a(C10114a aVar, boolean z, boolean z2) {
        String a;
        if (aVar == null) {
            if (C10112e.f24979c) {
                Log.e("TAG_PROXY_Response", "response null");
            }
            return "response null";
        } else if (!aVar.mo62747b()) {
            if (C10112e.f24979c) {
                Log.e("TAG_PROXY_Response", "response code: " + aVar.mo62743a());
            }
            return "response code: " + aVar.mo62743a();
        } else {
            String a2 = aVar.mo62746a("Content-Type", (String) null);
            if (!m28920c(a2)) {
                if (C10112e.f24979c) {
                    Log.e("TAG_PROXY_Response", "Content-Type: " + a2);
                }
                return "Content-Type: " + a2;
            }
            int a3 = m28898a(aVar);
            if (a3 <= 0) {
                if (C10112e.f24979c) {
                    Log.e("TAG_PROXY_Response", "Content-Length: " + a3);
                }
                return "Content-Length: " + a3;
            } else if (z && ((a = aVar.mo62746a("Accept-Ranges", (String) null)) == null || !a.contains("bytes"))) {
                if (C10112e.f24979c) {
                    Log.e("TAG_PROXY_Response", "Accept-Ranges: " + a);
                }
                return "Accept-Ranges: " + a;
            } else if (!z2 || aVar.mo62749d() != null) {
                return null;
            } else {
                if (C10112e.f24979c) {
                    Log.e("TAG_PROXY_Response", "response body null");
                }
                return "response body null";
            }
        }
    }

    /* renamed from: c */
    public static boolean m28920c(String str) {
        return str != null && (str.startsWith("video/") || "application/octet-stream".equals(str) || "binary/octet-stream".equals(str));
    }

    /* renamed from: b */
    public static boolean m28919b() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    /* renamed from: a */
    public static void m28908a(C10618g gVar) {
        if (gVar == null) {
            return;
        }
        if (m28919b()) {
            C10615e.m31159a(gVar);
            if (C10112e.f24979c) {
                Log.e("TAG_PROXY_UTIL", "invoke in pool thread");
                return;
            }
            return;
        }
        gVar.run();
        if (C10112e.f24979c) {
            Log.e("TAG_PROXY_UTIL", "invoke calling thread");
        }
    }

    /* renamed from: a */
    public static void m28911a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (m28919b()) {
            runnable.run();
        } else {
            f25079b.post(runnable);
        }
    }

    /* renamed from: a */
    public static List<C10139i.C10141b> m28905a(List<C10139i.C10141b> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        if (C10112e.f24979c) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C10139i.C10141b bVar = list.get(i);
                if (bVar != null) {
                    Log.i("TAG_PROXY_PRE_FILTER", bVar.f25059a + ": " + bVar.f25059a);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (C10139i.C10141b next : list) {
            if ("Host".equals(next.f25059a) || "Keep-Alive".equals(next.f25059a) || "Connection".equals(next.f25059a) || "Proxy-Connection".equals(next.f25059a)) {
                arrayList.add(next);
            }
        }
        list.removeAll(arrayList);
        if (C10112e.f24979c) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C10139i.C10141b bVar2 = list.get(i2);
                if (bVar2 != null) {
                    Log.i("TAG_PROXY_POST_FILTER", bVar2.f25059a + ": " + bVar2.f25060b);
                }
            }
        }
        return list;
    }

    /* renamed from: a */
    public static List<C10139i.C10141b> m28906a(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            try {
                Set<Map.Entry<String, String>> entrySet = map.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry next : entrySet) {
                    arrayList.add(new C10139i.C10141b((String) next.getKey(), (String) next.getValue()));
                }
                return arrayList;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C10091a m28900a(C10114a aVar, C10093c cVar, String str, int i) {
        String str2;
        String str3;
        String str4;
        C10091a a = cVar.mo62712a(str, i);
        if (a != null) {
            return a;
        }
        int a2 = m28898a(aVar);
        String a3 = aVar.mo62746a("Content-Type", (String) null);
        if (a2 <= 0 || TextUtils.isEmpty(a3)) {
            return a;
        }
        C10119e g = aVar.mo62752g();
        if (g != null) {
            str2 = g.f24993b;
            str3 = m28918b(g.f24996e);
        } else {
            str3 = "";
            str2 = str3;
        }
        String b = m28917b(aVar.mo62748c());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.REQUEST_URL, str2);
            jSONObject.put("requestHeaders", str3);
            jSONObject.put("responseHeaders", b);
            str4 = jSONObject.toString();
        } catch (Throwable unused) {
            str4 = "";
        }
        C10091a aVar2 = new C10091a(str, a3, a2, i, str4);
        cVar.mo62714a(aVar2);
        return aVar2;
    }

    /* renamed from: b */
    public static String m28917b(List<C10139i.C10141b> list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C10139i.C10141b bVar = list.get(0);
            if (bVar != null) {
                sb.append(bVar.f25059a);
                sb.append(": ");
                sb.append(bVar.f25060b);
                sb.append("\r\n");
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m28918b(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : map.entrySet()) {
            sb.append(next.getKey());
            sb.append(": ");
            sb.append(next.getValue());
            sb.append("\r\n");
        }
        return sb.toString();
    }
}
