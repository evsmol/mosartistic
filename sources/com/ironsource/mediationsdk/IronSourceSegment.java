package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Pair;
import com.adcolony.sdk.AdColonyUserMetadata;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.util.Locale;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;

public class IronSourceSegment {
    public static final String AGE = "age";
    public static final String GENDER = "gen";
    public static final String IAPT = "iapt";
    public static final String LEVEL = "lvl";
    public static final String PAYING = "pay";
    public static final String USER_CREATION_DATE = "ucd";

    /* renamed from: a */
    private String f10731a;

    /* renamed from: b */
    private int f10732b = 999999;

    /* renamed from: c */
    private double f10733c = 999999.99d;

    /* renamed from: d */
    private final String f10734d = "custom";

    /* renamed from: e */
    private final int f10735e = 5;

    /* renamed from: f */
    private int f10736f = -1;

    /* renamed from: g */
    private String f10737g;

    /* renamed from: h */
    private int f10738h = -1;

    /* renamed from: i */
    private AtomicBoolean f10739i = null;

    /* renamed from: j */
    private double f10740j = -1.0d;

    /* renamed from: k */
    private long f10741k = 0;

    /* renamed from: l */
    private Vector<Pair<String, String>> f10742l = new Vector<>();

    /* renamed from: a */
    private static boolean m12822a(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    /* renamed from: a */
    private static boolean m12823a(String str, int i, int i2) {
        return str != null && str.length() > 0 && str.length() <= 32;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Vector<Pair<String, String>> mo33440a() {
        Vector<Pair<String, String>> vector = new Vector<>();
        if (this.f10736f != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f10736f);
            vector.add(new Pair(AGE, sb.toString()));
        }
        if (!TextUtils.isEmpty(this.f10737g)) {
            vector.add(new Pair(GENDER, this.f10737g));
        }
        if (this.f10738h != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f10738h);
            vector.add(new Pair(LEVEL, sb2.toString()));
        }
        if (this.f10739i != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f10739i);
            vector.add(new Pair(PAYING, sb3.toString()));
        }
        if (this.f10740j != -1.0d) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f10740j);
            vector.add(new Pair(IAPT, sb4.toString()));
        }
        if (this.f10741k != 0) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.f10741k);
            vector.add(new Pair(USER_CREATION_DATE, sb5.toString()));
        }
        if (!TextUtils.isEmpty(this.f10731a)) {
            vector.add(new Pair("segName", this.f10731a));
        }
        vector.addAll(this.f10742l);
        return vector;
    }

    public int getAge() {
        return this.f10736f;
    }

    public String getGender() {
        return this.f10737g;
    }

    public double getIapt() {
        return this.f10740j;
    }

    public AtomicBoolean getIsPaying() {
        return this.f10739i;
    }

    public int getLevel() {
        return this.f10738h;
    }

    public String getSegmentName() {
        return this.f10731a;
    }

    public long getUcd() {
        return this.f10741k;
    }

    public void setAge(int i) {
        if (i <= 0 || i > 199) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "setAge( " + i + " ) age must be between 1-199", 2);
            return;
        }
        this.f10736f = i;
    }

    public void setCustom(String str, String str2) {
        try {
            if (!m12822a(str) || !m12822a(str2) || !m12823a(str, 1, 32) || !m12823a(str2, 1, 32)) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setCustom( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length", 2);
                return;
            }
            String str3 = "custom_" + str;
            if (this.f10742l.size() >= 5) {
                this.f10742l.remove(0);
            }
            this.f10742l.add(new Pair(str3, str2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setGender(String str) {
        if (TextUtils.isEmpty(str) || (!str.toLowerCase(Locale.ENGLISH).equals(AdColonyUserMetadata.USER_MALE) && !str.toLowerCase(Locale.ENGLISH).equals(AdColonyUserMetadata.USER_FEMALE))) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "setGender( " + str + " ) is invalid", 2);
            return;
        }
        this.f10737g = str;
    }

    public void setIAPTotal(double d) {
        if (d <= 0.0d || d >= this.f10733c) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "setIAPTotal( " + d + " ) iapt must be between 0-" + this.f10733c, 2);
            return;
        }
        this.f10740j = Math.floor(d * 100.0d) / 100.0d;
    }

    public void setIsPaying(boolean z) {
        if (this.f10739i == null) {
            this.f10739i = new AtomicBoolean();
        }
        this.f10739i.set(z);
    }

    public void setLevel(int i) {
        if (i <= 0 || i >= this.f10732b) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "setLevel( " + i + " ) level must be between 1-" + this.f10732b, 2);
            return;
        }
        this.f10738h = i;
    }

    public void setSegmentName(String str) {
        if (!m12822a(str) || !m12823a(str, 1, 32)) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "setSegmentName( " + str + " ) segment name must be alphanumeric and 1-32 in length", 2);
            return;
        }
        this.f10731a = str;
    }

    public void setUserCreationDate(long j) {
        if (j > 0) {
            this.f10741k = j;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setUserCreationDate( " + j + " ) is an invalid timestamp", 2);
    }
}
