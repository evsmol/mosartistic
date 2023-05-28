package com.appodeal.ads;

import kotlin.Metadata;

@Metadata(mo38198d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001\u0011J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00002\u0006\u0010\n\u001a\u00020\u000bH&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, mo38199d2 = {"Lcom/appodeal/ads/UserSettings;", "", "age", "", "getAge", "()Ljava/lang/Integer;", "gender", "Lcom/appodeal/ads/UserSettings$Gender;", "getGender", "()Lcom/appodeal/ads/UserSettings$Gender;", "userId", "", "getUserId", "()Ljava/lang/String;", "setAge", "setGender", "setUserId", "Gender", "apd_public"}, mo38200k = 1, mo38201mv = {1, 6, 0}, mo38203xi = 48)
public interface UserSettings {

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, mo38199d2 = {"Lcom/appodeal/ads/UserSettings$Gender;", "", "", "a", "I", "getIntValue", "()I", "intValue", "", "b", "Ljava/lang/String;", "getStringValue", "()Ljava/lang/String;", "stringValue", "Companion", "OTHER", "FEMALE", "MALE", "apd_public"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public enum Gender {
        OTHER(0, "O"),
        FEMALE(1, "F"),
        MALE(2, "M");
        
        public static final C8996a Companion = null;

        /* renamed from: a */
        public final int f22763a;

        /* renamed from: b */
        public final String f22764b;

        /* renamed from: com.appodeal.ads.UserSettings$Gender$a */
        public static final class C8996a {
        }

        /* access modifiers changed from: public */
        Gender(int i, String str) {
            this.f22763a = i;
            this.f22764b = str;
        }

        public static final Gender fromInteger(Integer num) {
            Companion.getClass();
            if (num != null) {
                int intValue = num.intValue();
                if (intValue == 0) {
                    return OTHER;
                }
                if (intValue == 1) {
                    return FEMALE;
                }
                if (intValue == 2) {
                    return MALE;
                }
            }
            return null;
        }

        public final int getIntValue() {
            return this.f22763a;
        }

        public final String getStringValue() {
            return this.f22764b;
        }

        /* access modifiers changed from: public */
        static {
            Companion = new C8996a();
        }
    }

    Integer getAge();

    Gender getGender();

    String getUserId();

    UserSettings setAge(int i);

    UserSettings setGender(Gender gender);

    UserSettings setUserId(String str);
}
