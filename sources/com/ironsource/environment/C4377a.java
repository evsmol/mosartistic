package com.ironsource.environment;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.ironsource.mediationsdk.C4601ag;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.environment.a */
public final class C4377a extends Thread {

    /* renamed from: d */
    private static final C4383b f10442d = new C4383b() {
        /* renamed from: a */
        public static String m12450a(int i) {
            String str = "not defined message for " + i;
            if (i != 404) {
                switch (i) {
                    case 1004:
                        return "malformed url exception";
                    case 1005:
                        break;
                    case 1006:
                        return "http empty response";
                    default:
                        switch (i) {
                            case IronSourceError.AUCTION_ERROR_DECOMPRESSION /*1008*/:
                                return "socket timeout exception";
                            case 1009:
                                return "io exception";
                            case 1010:
                                return "uri syntax exception";
                            case IronSourceConstants.NOTIFICATIONS_ERROR_SHOWING_NOT_FOUND /*1011*/:
                                return "http error code";
                            default:
                                switch (i) {
                                    case 1018:
                                        return "file not found exception";
                                    case 1019:
                                        return "out of memory exception";
                                    case IronSourceError.ERROR_IS_EMPTY_DEFAULT_PLACEMENT /*1020*/:
                                        return "failed to create folder for file";
                                    default:
                                        return str;
                                }
                        }
                }
            }
            return "http not found";
        }

        /* renamed from: a */
        public static String m12451a(Context context) {
            ConnectivityManager connectivityManager;
            String str;
            StringBuilder sb = new StringBuilder();
            if (!(context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null)) {
                try {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                        String typeName = activeNetworkInfo.getTypeName();
                        int type = activeNetworkInfo.getType();
                        if (type == 0) {
                            str = "3g";
                        } else if (type == 1) {
                            str = "wifi";
                        } else {
                            sb.append(typeName);
                        }
                        sb.append(str);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return sb.toString();
        }

        /* renamed from: a */
        public static String m12452a(String str) {
            try {
                return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
            } catch (UnsupportedEncodingException unused) {
                return "";
            }
        }

        /* renamed from: a */
        public static String m12453a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            try {
                return Base64.encodeToString(m12458a(str.getBytes("UTF-8"), (PublicKey) (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 0)))), 0).replaceAll(System.getProperty("line.separator"), "");
            } catch (Exception e) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception on string encryption error: " + e.getMessage());
                e.printStackTrace();
                return "";
            }
        }

        /* renamed from: a */
        public static String m12454a(byte[] bArr) {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, "UTF-8"));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    } else {
                        bufferedReader.close();
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                        return sb.toString();
                    }
                }
            } catch (Exception e) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception while decompressing " + e);
                return null;
            }
        }

        /* renamed from: a */
        public static Map<String, Object> m12455a(Object[][] objArr) {
            HashMap hashMap = new HashMap();
            try {
                for (Object[] objArr2 : objArr) {
                    hashMap.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception unused) {
            }
            return hashMap;
        }

        /* renamed from: a */
        public static void m12456a(Context context, String str, String str2) {
            if (!TextUtils.isEmpty(str)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                if (!TextUtils.isEmpty(str2)) {
                    intent.setPackage(str2);
                }
                context.startActivity(intent);
                return;
            }
            throw new Exception("url is null");
        }

        /* renamed from: a */
        public static byte[] m12457a(InputStream inputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr, 0, 8192);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        }

        /* renamed from: a */
        private static byte[] m12458a(byte[] bArr, PublicKey publicKey) {
            try {
                Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                instance.init(1, publicKey);
                return instance.doFinal(bArr);
            } catch (Exception e) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception on encryption error: " + e.getMessage());
                throw new RuntimeException(e);
            }
        }

        /* renamed from: b */
        public static JSONObject m12459b(String str, String str2) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errMsg", str);
                jSONObject.put("adViewId", str2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }

        /* renamed from: b */
        public static boolean m12460b(Context context) {
            ConnectivityManager connectivityManager;
            if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
                return false;
            }
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: b */
        public static byte[] m12461b(String str) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes());
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        }

        /* renamed from: c */
        public static int m12462c(Context context) {
            if (context == null) {
                return -1;
            }
            try {
                return context.getResources().getConfiguration().mcc;
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }

        /* renamed from: c */
        public static String m12463c() {
            try {
                new C4601ag();
                return ",kiag";
            } catch (Throwable unused) {
                return ",kiang";
            }
        }

        /* renamed from: c */
        public static String m12464c(String str) {
            return Base64.encodeToString(str.getBytes(), 10);
        }

        /* renamed from: d */
        public static int m12465d(Context context) {
            if (context == null) {
                return -1;
            }
            try {
                return context.getResources().getConfiguration().mnc;
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }

        /* renamed from: d */
        public static boolean m12466d() {
            try {
                new C4601ag();
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        /* renamed from: e */
        public static String m12467e(Context context) {
            if (context == null) {
                return "";
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                return telephonyManager != null ? telephonyManager.getSimOperator() : "";
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }

        /* renamed from: f */
        public static int m12468f(Context context) {
            if (context != null) {
                try {
                    return ((TelephonyManager) context.getSystemService("phone")).getPhoneType();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return -1;
        }

        /* renamed from: a */
        public final void mo33189a() {
        }

        /* renamed from: b */
        public final void mo33190b() {
            throw new RuntimeException("ANRHandler has given up");
        }
    };

    /* renamed from: e */
    private static final C4410i f10443e = new C4410i() {
        /* renamed from: a */
        public final void mo33191a(InterruptedException interruptedException) {
            Log.w("ANRHandler", "Interrupted: " + interruptedException.getMessage());
        }
    };

    /* renamed from: a */
    C4383b f10444a = f10442d;

    /* renamed from: b */
    boolean f10445b = false;

    /* renamed from: c */
    boolean f10446c = false;

    /* renamed from: f */
    private C4410i f10447f = f10443e;

    /* renamed from: g */
    private final Handler f10448g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    private final int f10449h;

    /* renamed from: i */
    private String f10450i = "";
    /* access modifiers changed from: private */

    /* renamed from: j */
    public volatile int f10451j = 0;

    /* renamed from: k */
    private int f10452k = 1;

    /* renamed from: l */
    private int f10453l = 0;

    /* renamed from: m */
    private final Runnable f10454m = new Runnable() {
        public final void run() {
            C4377a aVar = C4377a.this;
            int unused = aVar.f10451j = (aVar.f10451j + 1) % Integer.MAX_VALUE;
        }
    };

    public C4377a(int i) {
        this.f10449h = i;
    }

    public final void run() {
        setName("|ANR-ANRHandler|");
        int i = -1;
        while (!isInterrupted() && this.f10453l < this.f10452k) {
            int i2 = this.f10451j;
            this.f10448g.post(this.f10454m);
            try {
                Thread.sleep((long) this.f10449h);
                if (this.f10451j != i2) {
                    this.f10453l = 0;
                } else if (this.f10446c || !Debug.isDebuggerConnected()) {
                    this.f10453l++;
                    this.f10444a.mo33189a();
                    if (C4394e.f10476c != null && !C4394e.f10476c.trim().isEmpty()) {
                        new C4386c(C4394e.f10476c, String.valueOf(System.currentTimeMillis()), "ANR").mo33196d();
                    }
                } else {
                    if (this.f10451j != i) {
                        Log.w("ANRHandler", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                    }
                    i = this.f10451j;
                }
            } catch (InterruptedException e) {
                this.f10447f.mo33191a(e);
                return;
            }
        }
        if (this.f10453l >= this.f10452k) {
            this.f10444a.mo33190b();
        }
    }
}
