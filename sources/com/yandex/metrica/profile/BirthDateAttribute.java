package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p082ob.C1966Dn;
import com.yandex.metrica.impl.p082ob.C2242Ke;
import com.yandex.metrica.impl.p082ob.C2308Me;
import com.yandex.metrica.impl.p082ob.C2430Pe;
import com.yandex.metrica.impl.p082ob.C2662Ve;
import com.yandex.metrica.impl.p082ob.C2688We;
import com.yandex.metrica.impl.p082ob.C2717Xe;
import com.yandex.metrica.impl.p082ob.C2743Ye;
import com.yandex.metrica.impl.p082ob.C2751Ym;
import com.yandex.metrica.impl.p082ob.C2836bf;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class BirthDateAttribute {

    /* renamed from: a */
    private final C2430Pe f9737a = new C2430Pe("appmetrica_birth_date", new C1966Dn(), new C2717Xe());

    BirthDateAttribute() {
    }

    /* renamed from: a */
    private Calendar m11165a(int i) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        return gregorianCalendar;
    }

    public UserProfileUpdate<? extends C2836bf> withAge(int i) {
        return mo18624a(m11165a(Calendar.getInstance(Locale.US).get(1) - i), "yyyy", (C2242Ke) new C2308Me(this.f9737a.mo16471c()));
    }

    public UserProfileUpdate<? extends C2836bf> withAgeIfUndefined(int i) {
        return mo18624a(m11165a(Calendar.getInstance(Locale.US).get(1) - i), "yyyy", (C2242Ke) new C2688We(this.f9737a.mo16471c()));
    }

    public UserProfileUpdate<? extends C2836bf> withBirthDate(int i) {
        return mo18624a(m11165a(i), "yyyy", (C2242Ke) new C2308Me(this.f9737a.mo16471c()));
    }

    public UserProfileUpdate<? extends C2836bf> withBirthDateIfUndefined(int i) {
        return mo18624a(m11165a(i), "yyyy", (C2242Ke) new C2688We(this.f9737a.mo16471c()));
    }

    public UserProfileUpdate<? extends C2836bf> withValueReset() {
        return new UserProfileUpdate<>(new C2662Ve(0, this.f9737a.mo16469a(), new C1966Dn(), new C2717Xe()));
    }

    public UserProfileUpdate<? extends C2836bf> withBirthDate(int i, int i2) {
        return mo18624a(m11166a(i, i2), "yyyy-MM", (C2242Ke) new C2308Me(this.f9737a.mo16471c()));
    }

    /* renamed from: a */
    private Calendar m11166a(int i, int i2) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, 1);
        return gregorianCalendar;
    }

    public UserProfileUpdate<? extends C2836bf> withBirthDateIfUndefined(int i, int i2) {
        return mo18624a(m11166a(i, i2), "yyyy-MM", (C2242Ke) new C2688We(this.f9737a.mo16471c()));
    }

    public UserProfileUpdate<? extends C2836bf> withBirthDate(int i, int i2, int i3) {
        return mo18624a(m11167a(i, i2, i3), "yyyy-MM-dd", (C2242Ke) new C2308Me(this.f9737a.mo16471c()));
    }

    /* renamed from: a */
    private Calendar m11167a(int i, int i2, int i3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, i3);
        return gregorianCalendar;
    }

    public UserProfileUpdate<? extends C2836bf> withBirthDateIfUndefined(int i, int i2, int i3) {
        return mo18624a(m11167a(i, i2, i3), "yyyy-MM-dd", (C2242Ke) new C2688We(this.f9737a.mo16471c()));
    }

    public UserProfileUpdate<? extends C2836bf> withBirthDate(Calendar calendar) {
        return mo18624a(calendar, "yyyy-MM-dd", (C2242Ke) new C2308Me(this.f9737a.mo16471c()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public UserProfileUpdate<? extends C2836bf> mo18624a(Calendar calendar, String str, C2242Ke ke) {
        return new UserProfileUpdate<>(new C2743Ye(this.f9737a.mo16469a(), new SimpleDateFormat(str).format(calendar.getTime()), new C2751Ym(), new C1966Dn(), ke));
    }

    public UserProfileUpdate<? extends C2836bf> withBirthDateIfUndefined(Calendar calendar) {
        return mo18624a(calendar, "yyyy-MM-dd", (C2242Ke) new C2688We(this.f9737a.mo16471c()));
    }
}
