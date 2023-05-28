package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p082ob.C1848A2;
import com.yandex.metrica.impl.p082ob.C2836bf;
import java.util.LinkedList;
import java.util.List;

public class UserProfile {

    /* renamed from: a */
    private final List<UserProfileUpdate<? extends C2836bf>> f9744a;

    public static class Builder {

        /* renamed from: a */
        private final LinkedList<UserProfileUpdate<? extends C2836bf>> f9745a = new LinkedList<>();

        Builder() {
        }

        public Builder apply(UserProfileUpdate<? extends C2836bf> userProfileUpdate) {
            this.f9745a.add(userProfileUpdate);
            return this;
        }

        public UserProfile build() {
            return new UserProfile(this.f9745a);
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public List<UserProfileUpdate<? extends C2836bf>> getUserProfileUpdates() {
        return this.f9744a;
    }

    private UserProfile(List<UserProfileUpdate<? extends C2836bf>> list) {
        this.f9744a = C1848A2.m6816c(list);
    }
}
