package androidx.core.p161os;

import android.content.res.Configuration;
import android.os.Build;

/* renamed from: androidx.core.os.ConfigurationCompat */
public final class ConfigurationCompat {
    public static LocaleListCompat getLocales(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return LocaleListCompat.wrap(configuration.getLocales());
        }
        return LocaleListCompat.create(configuration.locale);
    }
}
