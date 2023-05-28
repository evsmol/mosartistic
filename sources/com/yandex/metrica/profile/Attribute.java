package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p082ob.C2458Qe;
import com.yandex.metrica.impl.p082ob.C2485Re;
import com.yandex.metrica.impl.p082ob.C2696Wm;
import com.yandex.metrica.impl.p082ob.C2875cm;
import com.yandex.metrica.impl.p082ob.C2905dn;

public class Attribute {
    public static BirthDateAttribute birthDate() {
        return new BirthDateAttribute();
    }

    public static BooleanAttribute customBoolean(String str) {
        return new BooleanAttribute(str, new C2458Qe(), new C2485Re(new C2696Wm(100)));
    }

    public static CounterAttribute customCounter(String str) {
        return new CounterAttribute(str, new C2458Qe(), new C2485Re(new C2696Wm(100)));
    }

    public static NumberAttribute customNumber(String str) {
        return new NumberAttribute(str, new C2458Qe(), new C2485Re(new C2696Wm(100)));
    }

    public static StringAttribute customString(String str) {
        return new StringAttribute(str, new C2905dn(200, "String attribute \"" + str + "\"", C2875cm.m9327a()), new C2458Qe(), new C2485Re(new C2696Wm(100)));
    }

    public static GenderAttribute gender() {
        return new GenderAttribute();
    }

    public static NameAttribute name() {
        return new NameAttribute();
    }

    public static NotificationsEnabledAttribute notificationsEnabled() {
        return new NotificationsEnabledAttribute();
    }
}
