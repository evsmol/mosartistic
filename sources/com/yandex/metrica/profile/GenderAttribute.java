package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p082ob.C1966Dn;
import com.yandex.metrica.impl.p082ob.C2308Me;
import com.yandex.metrica.impl.p082ob.C2430Pe;
import com.yandex.metrica.impl.p082ob.C2662Ve;
import com.yandex.metrica.impl.p082ob.C2688We;
import com.yandex.metrica.impl.p082ob.C2717Xe;
import com.yandex.metrica.impl.p082ob.C2743Ye;
import com.yandex.metrica.impl.p082ob.C2751Ym;
import com.yandex.metrica.impl.p082ob.C2836bf;

public class GenderAttribute {

    /* renamed from: a */
    private final C2430Pe f9740a = new C2430Pe("appmetrica_gender", new C1966Dn(), new C2717Xe());

    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");
        
        private final String mStringValue;

        private Gender(String str) {
            this.mStringValue = str;
        }

        public String getStringValue() {
            return this.mStringValue;
        }
    }

    GenderAttribute() {
    }

    public UserProfileUpdate<? extends C2836bf> withValue(Gender gender) {
        return new UserProfileUpdate<>(new C2743Ye(this.f9740a.mo16469a(), gender.getStringValue(), new C2751Ym(), this.f9740a.mo16470b(), new C2308Me(this.f9740a.mo16471c())));
    }

    public UserProfileUpdate<? extends C2836bf> withValueIfUndefined(Gender gender) {
        return new UserProfileUpdate<>(new C2743Ye(this.f9740a.mo16469a(), gender.getStringValue(), new C2751Ym(), this.f9740a.mo16470b(), new C2688We(this.f9740a.mo16471c())));
    }

    public UserProfileUpdate<? extends C2836bf> withValueReset() {
        return new UserProfileUpdate<>(new C2662Ve(0, this.f9740a.mo16469a(), this.f9740a.mo16470b(), this.f9740a.mo16471c()));
    }
}
