package com.criteo.publisher.context;

import com.google.android.gms.common.Scopes;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, mo38199d2 = {"Lcom/criteo/publisher/context/EmailHasher;", "", "email", "hash", "(Ljava/lang/String;)Ljava/lang/String;", "type", "toHash", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "<init>", "()V", "publisher-sdk_release"}, mo38200k = 1, mo38201mv = {1, 1, 15}, mo38202pn = "", mo38203xi = 0, mo38204xs = "")
/* compiled from: EmailHasher.kt */
public final class EmailHasher {

    /* renamed from: a */
    public static final EmailHasher f3466a = new EmailHasher();

    /* renamed from: com.criteo.publisher.context.EmailHasher$a */
    /* compiled from: EmailHasher.kt */
    static final class C1062a extends Lambda implements Function1<Byte, String> {

        /* renamed from: a */
        public static final C1062a f3467a = new C1062a();

        C1062a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo3087a(((Number) obj).byteValue());
        }

        /* renamed from: a */
        public final String mo3087a(byte b) {
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(this, *args)");
            return format;
        }
    }

    private EmailHasher() {
    }

    public static final String hash(String str) {
        Intrinsics.checkParameterIsNotNull(str, Scopes.EMAIL);
        EmailHasher emailHasher = f3466a;
        String obj = StringsKt.trim(str).toString();
        Locale locale = Locale.ROOT;
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ROOT");
        if (obj != null) {
            String lowerCase = obj.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return emailHasher.m4955a(emailHasher.m4955a(lowerCase, "MD5"), "SHA-256");
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    private final String m4955a(String str, String str2) {
        MessageDigest instance = MessageDigest.getInstance(str2);
        Charset charset = Charsets.UTF_8;
        if (str != null) {
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            byte[] digest = instance.digest(bytes);
            Intrinsics.checkExpressionValueIsNotNull(digest, "MessageDigest.getInstanc…   .digest(toByteArray())");
            return ArraysKt.joinToString$default(digest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) C1062a.f3467a, 30, (Object) null);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }
}
