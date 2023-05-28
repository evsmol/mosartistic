package p152ms.p153bd.p154o.Pgl;

import android.text.TextUtils;
import com.appodeal.ads.adapters.admob.BuildConfig;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ms.bd.o.Pgl.c */
public class C5643c {
    public static final int CLIENT_TYPE_BUSINESS = 1;
    public static final int CLIENT_TYPE_INHOUSE = 0;
    public static final int CLIENT_TYPE_UNKNOWN = -1;
    public static final int COLLECT_MODE_DEFAULT = 99999;
    public static final int COLLECT_MODE_FINANCE = 300;
    public static final int COLLECT_MODE_HELO = 315;
    public static final int COLLECT_MODE_MINIMIZE = 5;
    public static final int COLLECT_MODE_ML_MINIMIZE = 290;
    public static final int COLLECT_MODE_ML_PGL_AL = 810;
    public static final int COLLECT_MODE_ML_TEEN = 280;
    public static final int COLLECT_MODE_OV_MINIMIZE = 5;
    public static final int COLLECT_MODE_RESSO = 315;
    public static final int COLLECT_MODE_TIKTOK = 503;
    public static final int COLLECT_MODE_TIKTOKLITE = 330;
    public static final int COLLECT_MODE_TIKTOK_BASE = 10;
    public static final int COLLECT_MODE_TIKTOK_GUEST = 504;
    public static final int COLLECT_MODE_TIKTOK_INIT = 5;
    public static final int COLLECT_MODE_TIKTOK_NONUSEA = 603;
    public static final int COLLECT_MODE_TIKTOK_U13 = 10;
    public static final int COLLECT_MODE_TIKTOK_USEA = 503;
    public static final int COLLECT_MODE_TIKTOK_USUNREGISTER = 10;
    public static final int OVREGION_TYPE_SG = 0;
    public static final int OVREGION_TYPE_UNKNOWN = -1;
    public static final int OVREGION_TYPE_VA = 1;

    /* renamed from: a */
    protected String f12967a = "";

    /* renamed from: b */
    protected String f12968b = "";

    /* renamed from: c */
    protected String f12969c = "";

    /* renamed from: d */
    protected String f12970d = "";

    /* renamed from: e */
    protected String f12971e = "";

    /* renamed from: f */
    protected String f12972f = "";

    /* renamed from: g */
    protected String f12973g = "";

    /* renamed from: h */
    protected String f12974h = "";

    /* renamed from: i */
    protected String f12975i = "";

    /* renamed from: j */
    protected int f12976j = -1;

    /* renamed from: k */
    protected int f12977k = -1;

    /* renamed from: l */
    protected int f12978l = COLLECT_MODE_DEFAULT;

    /* renamed from: m */
    protected Map<String, String> f12979m = new HashMap();

    /* renamed from: n */
    protected Map<String, String> f12980n = new HashMap();

    /* renamed from: ms.bd.o.Pgl.c$pblb */
    public interface pblb {
    }

    /* renamed from: ms.bd.o.Pgl.c$pgla */
    public static abstract class pgla<T extends pblb> extends C5643c implements pblb {
        public pgla(String str, String str2) {
            this(str, str2, (int) C5643c.COLLECT_MODE_DEFAULT);
        }

        public pgla(String str, String str2, int i) {
            this.f12967a = str;
            this.f12975i = str2;
            this.f12978l = i;
            if (TextUtils.isEmpty(str) || BuildConfig.ADAPTER_VERSION.equals(str) || TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("appID or license must be set.");
            }
        }

        public pgla(String str, String str2, String str3) {
            this(str, str2, str3, C5643c.COLLECT_MODE_DEFAULT);
        }

        public pgla(String str, String str2, String str3, int i) {
            this.f12973g = str;
            this.f12974h = str2;
            this.f12975i = str3;
            this.f12978l = i;
            if (TextUtils.isEmpty(str) || BuildConfig.ADAPTER_VERSION.equals(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                throw new IllegalArgumentException("sdkID or license must be set.");
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C5643c mo42174a() {
            if (this.f12976j != -1) {
                return this;
            }
            throw new IllegalArgumentException("MSConfig init error");
        }

        public T addAdvanceInfo0(String str, String str2) {
            this.f12980n.put(str, str2);
            return this;
        }

        public T setBDDeviceID0(String str) {
            this.f12970d = str;
            return this;
        }

        public T setChannel0(String str) {
            this.f12968b = str;
            return this;
        }

        public T setClientType0(int i) {
            this.f12976j = i;
            return this;
        }

        public T setCustomInfo0(Map<String, String> map) {
            if (map == null) {
                map = new HashMap<>();
            }
            this.f12979m = map;
            return this;
        }

        public T setDeviceID0(String str) {
            this.f12969c = str;
            return this;
        }

        public T setInstallID0(String str) {
            this.f12971e = str;
            return this;
        }

        public T setOVRegionType0(int i) {
            this.f12977k = i;
            return this;
        }

        public T setSecssionID0(String str) {
            this.f12972f = str;
            return this;
        }
    }

    protected C5643c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo42173a(Object obj) {
        return (obj == null || !(obj instanceof String)) ? "" : ((String) obj).trim();
    }
}
