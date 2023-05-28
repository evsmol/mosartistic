package com.yandex.metrica.impl.p082ob;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.appnext.base.p264b.C8849c;
import com.appnext.base.p264b.C8850d;
import com.appodeal.ads.modules.common.internal.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.impl.p082ob.C1967E;
import com.yandex.metrica.impl.p082ob.C2707X7;
import com.yandex.metrica.impl.p082ob.C3398qf;
import java.util.List;
import java.util.Locale;

/* renamed from: com.yandex.metrica.impl.ob.j8 */
public final class C3084j8 {

    /* renamed from: a */
    public static final int f8117a = YandexMetrica.getLibraryApiLevel();

    /* renamed from: b */
    private static final C2333N7 f8118b;

    /* renamed from: c */
    private static final C2420P7 f8119c;

    /* renamed from: d */
    private static final C2301M7 f8120d;

    /* renamed from: com.yandex.metrica.impl.ob.j8$a */
    public interface C3085a {

        /* renamed from: a */
        public static final List<String> f8121a = C1848A2.m6802a("incremental_id", "timestamp", C8849c.DATA);

        /* renamed from: com.yandex.metrica.impl.ob.j8$a$a */
        public interface C3086a {

            /* renamed from: a */
            public static final String f8122a;

            /* renamed from: b */
            public static final String f8123b;

            static {
                Locale locale = Locale.US;
                f8122a = String.format(locale, "CREATE TABLE IF NOT EXISTS %s (incremental_id INTEGER NOT NULL,timestamp INTEGER, data TEXT)", new Object[]{"lbs_dat"});
                f8123b = String.format(locale, "DROP TABLE IF EXISTS %s", new Object[]{"lbs_dat"});
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.j8$a$b */
        public interface C3087b {

            /* renamed from: a */
            public static final String f8124a;

            /* renamed from: b */
            public static final String f8125b;

            static {
                Locale locale = Locale.US;
                f8124a = String.format(locale, "CREATE TABLE IF NOT EXISTS %s (incremental_id INTEGER NOT NULL,timestamp INTEGER, data TEXT)", new Object[]{"l_dat"});
                f8125b = String.format(locale, "DROP TABLE IF EXISTS %s", new Object[]{"l_dat"});
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.j8$b */
    public static final class C3088b {

        /* renamed from: a */
        public static final List<String> f8126a = C1848A2.m6802a("data_key", AppMeasurementSdk.ConditionalUserProperty.VALUE);
    }

    /* renamed from: com.yandex.metrica.impl.ob.j8$c */
    public interface C3089c {

        /* renamed from: a */
        public static final List<String> f8127a = C1848A2.m6802a("key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "type");
    }

    /* renamed from: com.yandex.metrica.impl.ob.j8$d */
    public static final class C3090d {

        /* renamed from: a */
        public static final List<String> f8128a = C1848A2.m6802a("id", "number", "global_number", "number_of_type", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "type", C8850d.f22432fl, "session_id", "wifi_network_info", "cell_info", "location_info", "error_environment", "user_info", "session_type", "app_environment", "app_environment_revision", "truncated", "connection_type", "cellular_connection_type", "custom_type", "wifi_access_point", "encrypting_mode", "profile_id", "first_occurrence_status", "battery_charge_type", "collection_mode", "has_omitted_data", "call_state", "source", "attribution_id_changed", "open_id", "extras");

        /* renamed from: b */
        public static final String f8129b = ("CREATE TABLE IF NOT EXISTS reports (id INTEGER PRIMARY KEY,name TEXT,value TEXT,number INTEGER,global_number INTEGER,number_of_type INTEGER,type INTEGER,time INTEGER,session_id TEXT,wifi_network_info TEXT DEFAULT '',cell_info TEXT DEFAULT '',location_info TEXT DEFAULT '',error_environment TEXT,user_info TEXT,session_type INTEGER DEFAULT " + C2943f6.FOREGROUND.mo17574a() + "," + "app_environment" + " TEXT DEFAULT '" + JsonUtils.EMPTY_JSON + "'," + "app_environment_revision" + " INTEGER DEFAULT " + 0 + "," + "truncated" + " INTEGER DEFAULT 0," + "connection_type" + " INTEGER DEFAULT " + 2 + "," + "cellular_connection_type" + " TEXT," + "custom_type" + " INTEGER DEFAULT 0, " + "wifi_access_point" + " TEXT, " + "encrypting_mode" + " INTEGER DEFAULT " + C2004Em.NONE.mo15735a() + ", " + "profile_id" + " TEXT, " + "first_occurrence_status" + " INTEGER DEFAULT " + 0 + ", " + "battery_charge_type" + " INTEGER DEFAULT " + C1967E.C1969b.C1970a.UNKNOWN.mo15643a() + ", " + "collection_mode" + " TEXT, " + "has_omitted_data" + " INTEGER DEFAULT " + -1 + ", " + "call_state" + " INTEGER DEFAULT " + 0 + ", " + "source" + " INTEGER DEFAULT " + 0 + ", " + "attribution_id_changed" + " INTEGER DEFAULT 0, " + "open_id" + " INTEGER DEFAULT " + new C3398qf.C3403d.C3404a().f8825w + ", " + "extras" + " BLOB )");
    }

    /* renamed from: com.yandex.metrica.impl.ob.j8$e */
    public static final class C3091e {

        /* renamed from: a */
        public static final List<String> f8130a = C1848A2.m6802a("id", "start_time", "network_info", "report_request_parameters", "server_time_offset", "type", "obtained_before_first_sync");

        /* renamed from: b */
        public static final String f8131b = ("CREATE TABLE IF NOT EXISTS sessions (id INTEGER,start_time INTEGER,network_info TEXT,report_request_parameters TEXT,server_time_offset INTEGER,type INTEGER DEFAULT " + C2943f6.FOREGROUND.mo17574a() + "," + "obtained_before_first_sync" + " INTEGER DEFAULT 0 )");

        /* renamed from: c */
        public static final String f8132c;

        /* renamed from: d */
        public static final String f8133d;

        static {
            Locale locale = Locale.US;
            f8132c = String.format(locale, "SELECT DISTINCT %s  FROM %s WHERE %s >=0 AND (SELECT count() FROM %5$s WHERE %5$s.%6$s = %2$s.%3$s AND %5$s.%7$s = %2$s.%4$s) > 0 ORDER BY %3$s LIMIT 1", new Object[]{"report_request_parameters", Constants.SESSIONS, "id", "type", "reports", "session_id", "session_type"});
            f8133d = String.format(locale, "(select count(%s.%s) from %s where %s.%s = %s.%s) = 0 and cast(%s as integer) < ?", new Object[]{"reports", "id", "reports", "reports", "session_id", Constants.SESSIONS, "id", "id"});
        }
    }

    static {
        C2333N7 n7 = new C2333N7();
        f8118b = n7;
        C2420P7 p7 = new C2420P7();
        f8119c = p7;
        f8120d = new C2301M7(n7, p7, new C2707X7.C2709b());
    }

    /* renamed from: a */
    public static C2301M7 m9804a() {
        return f8120d;
    }
}
