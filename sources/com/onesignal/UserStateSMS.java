package com.onesignal;

class UserStateSMS extends UserState {
    /* access modifiers changed from: protected */
    public void addDependFields() {
    }

    UserStateSMS(String str, boolean z) {
        super("sms" + str, z);
    }

    /* access modifiers changed from: package-private */
    public UserState newInstance(String str) {
        return new UserStateSMS(str, false);
    }
}
