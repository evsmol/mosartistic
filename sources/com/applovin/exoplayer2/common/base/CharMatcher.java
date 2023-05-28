package com.applovin.exoplayer2.common.base;

import java.util.Arrays;
import java.util.BitSet;

public abstract class CharMatcher implements Predicate<Character> {

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$a */
    private static final class C7059a extends CharMatcher {

        /* renamed from: a */
        final CharMatcher f15556a;

        /* renamed from: b */
        final CharMatcher f15557b;

        C7059a(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f15556a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.f15557b = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c) {
            return this.f15556a.matches(c) && this.f15557b.matches(c);
        }

        /* access modifiers changed from: package-private */
        public void setBits(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f15556a.setBits(bitSet2);
            BitSet bitSet3 = new BitSet();
            this.f15557b.setBits(bitSet3);
            bitSet2.and(bitSet3);
            bitSet.or(bitSet2);
        }

        public String toString() {
            return "CharMatcher.and(" + this.f15556a + ", " + this.f15557b + ")";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$aa */
    static final class C7060aa extends C7079t {

        /* renamed from: a */
        static final int f15558a = Integer.numberOfLeadingZeros(31);

        /* renamed from: b */
        static final C7060aa f15559b = new C7060aa();

        C7060aa() {
            super("CharMatcher.whitespace()");
        }

        public boolean matches(char c) {
            return " 　\r   　 \u000b　   　 \t     \f 　 　　 \n 　".charAt((48906 * c) >>> f15558a) == c;
        }

        /* access modifiers changed from: package-private */
        public void setBits(BitSet bitSet) {
            for (int i = 0; i < 32; i++) {
                bitSet.set(" 　\r   　 \u000b　   　 \t     \f 　 　　 \n 　".charAt(i));
            }
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$b */
    private static final class C7061b extends C7079t {

        /* renamed from: a */
        static final C7061b f15560a = new C7061b();

        private C7061b() {
            super("CharMatcher.any()");
        }

        public CharMatcher and(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        public String collapseFrom(CharSequence charSequence, char c) {
            return charSequence.length() == 0 ? "" : String.valueOf(c);
        }

        public int countIn(CharSequence charSequence) {
            return charSequence.length();
        }

        public int indexIn(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        public int indexIn(CharSequence charSequence, int i) {
            int length = charSequence.length();
            Preconditions.checkPositionIndex(i, length);
            if (i == length) {
                return -1;
            }
            return i;
        }

        public int lastIndexIn(CharSequence charSequence) {
            return charSequence.length() - 1;
        }

        public boolean matches(char c) {
            return true;
        }

        public boolean matchesAllOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        public boolean matchesNoneOf(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        public CharMatcher negate() {
            return none();
        }

        /* renamed from: or */
        public CharMatcher mo53615or(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        public String removeFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        public String replaceFrom(CharSequence charSequence, char c) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, c);
            return new String(cArr);
        }

        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            StringBuilder sb = new StringBuilder(charSequence.length() * charSequence2.length());
            for (int i = 0; i < charSequence.length(); i++) {
                sb.append(charSequence2);
            }
            return sb.toString();
        }

        public String trimFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$c */
    private static final class C7062c extends CharMatcher {

        /* renamed from: a */
        private final char[] f15561a;

        public C7062c(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.f15561a = charArray;
            Arrays.sort(charArray);
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c) {
            return Arrays.binarySearch(this.f15561a, c) >= 0;
        }

        /* access modifiers changed from: package-private */
        public void setBits(BitSet bitSet) {
            for (char c : this.f15561a) {
                bitSet.set(c);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
            for (char access$000 : this.f15561a) {
                sb.append(CharMatcher.showCharacter(access$000));
            }
            sb.append("\")");
            return sb.toString();
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$d */
    private static final class C7063d extends C7079t {

        /* renamed from: a */
        static final C7063d f15562a = new C7063d();

        C7063d() {
            super("CharMatcher.ascii()");
        }

        public boolean matches(char c) {
            return c <= 127;
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$e */
    private static final class C7064e extends CharMatcher {

        /* renamed from: a */
        static final CharMatcher f15563a = new C7064e();

        private C7064e() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c) {
            if (!(c == ' ' || c == 133 || c == 5760)) {
                if (c == 8199) {
                    return false;
                }
                if (!(c == 8287 || c == 12288 || c == 8232 || c == 8233)) {
                    switch (c) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            return c >= 8192 && c <= 8202;
                    }
                }
            }
            return true;
        }

        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$f */
    private static final class C7065f extends C7084y {

        /* renamed from: a */
        static final C7065f f15564a = new C7065f();

        private C7065f() {
            super("CharMatcher.digit()", m18942a(), m18943b());
        }

        /* renamed from: a */
        private static char[] m18942a() {
            return "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".toCharArray();
        }

        /* renamed from: b */
        private static char[] m18943b() {
            char[] cArr = new char[37];
            for (int i = 0; i < 37; i++) {
                cArr[i] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".charAt(i) + 9);
            }
            return cArr;
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$g */
    static abstract class C7066g extends CharMatcher {
        C7066g() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public CharMatcher negate() {
            return new C7081v(this);
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$h */
    private static final class C7067h extends CharMatcher {

        /* renamed from: a */
        private final Predicate<? super Character> f15565a;

        C7067h(Predicate<? super Character> predicate) {
            this.f15565a = (Predicate) Preconditions.checkNotNull(predicate);
        }

        public boolean apply(Character ch) {
            return this.f15565a.apply(Preconditions.checkNotNull(ch));
        }

        public boolean matches(char c) {
            return this.f15565a.apply(Character.valueOf(c));
        }

        public String toString() {
            return "CharMatcher.forPredicate(" + this.f15565a + ")";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$i */
    private static final class C7068i extends C7066g {

        /* renamed from: a */
        private final char f15566a;

        /* renamed from: b */
        private final char f15567b;

        C7068i(char c, char c2) {
            Preconditions.checkArgument(c2 >= c);
            this.f15566a = c;
            this.f15567b = c2;
        }

        public boolean matches(char c) {
            return this.f15566a <= c && c <= this.f15567b;
        }

        /* access modifiers changed from: package-private */
        public void setBits(BitSet bitSet) {
            bitSet.set(this.f15566a, this.f15567b + 1);
        }

        public String toString() {
            return "CharMatcher.inRange('" + CharMatcher.showCharacter(this.f15566a) + "', '" + CharMatcher.showCharacter(this.f15567b) + "')";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$j */
    private static final class C7069j extends C7084y {

        /* renamed from: a */
        static final C7069j f15568a = new C7069j();

        private C7069j() {
            super("CharMatcher.invisible()", "\u0000­؀؜۝܏࣢ ᠎   ⁦　?﻿￹".toCharArray(), "  ­؅؜۝܏࣢ ᠎‏ ⁤⁯　﻿￻".toCharArray());
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$k */
    private static final class C7070k extends C7066g {

        /* renamed from: a */
        private final char f15569a;

        C7070k(char c) {
            this.f15569a = c;
        }

        public CharMatcher and(CharMatcher charMatcher) {
            return charMatcher.matches(this.f15569a) ? this : none();
        }

        public boolean matches(char c) {
            return c == this.f15569a;
        }

        public CharMatcher negate() {
            return isNot(this.f15569a);
        }

        /* renamed from: or */
        public CharMatcher mo53615or(CharMatcher charMatcher) {
            return charMatcher.matches(this.f15569a) ? charMatcher : super.mo53615or(charMatcher);
        }

        public String replaceFrom(CharSequence charSequence, char c) {
            return charSequence.toString().replace(this.f15569a, c);
        }

        /* access modifiers changed from: package-private */
        public void setBits(BitSet bitSet) {
            bitSet.set(this.f15569a);
        }

        public String toString() {
            return "CharMatcher.is('" + CharMatcher.showCharacter(this.f15569a) + "')";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$l */
    private static final class C7071l extends C7066g {

        /* renamed from: a */
        private final char f15570a;

        /* renamed from: b */
        private final char f15571b;

        C7071l(char c, char c2) {
            this.f15570a = c;
            this.f15571b = c2;
        }

        public boolean matches(char c) {
            return c == this.f15570a || c == this.f15571b;
        }

        /* access modifiers changed from: package-private */
        public void setBits(BitSet bitSet) {
            bitSet.set(this.f15570a);
            bitSet.set(this.f15571b);
        }

        public String toString() {
            return "CharMatcher.anyOf(\"" + CharMatcher.showCharacter(this.f15570a) + CharMatcher.showCharacter(this.f15571b) + "\")";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$m */
    private static final class C7072m extends C7066g {

        /* renamed from: a */
        private final char f15572a;

        C7072m(char c) {
            this.f15572a = c;
        }

        public CharMatcher and(CharMatcher charMatcher) {
            return charMatcher.matches(this.f15572a) ? super.and(charMatcher) : charMatcher;
        }

        public boolean matches(char c) {
            return c != this.f15572a;
        }

        public CharMatcher negate() {
            return m18939is(this.f15572a);
        }

        /* renamed from: or */
        public CharMatcher mo53615or(CharMatcher charMatcher) {
            return charMatcher.matches(this.f15572a) ? any() : this;
        }

        /* access modifiers changed from: package-private */
        public void setBits(BitSet bitSet) {
            bitSet.set(0, this.f15572a);
            bitSet.set(this.f15572a + 1, 65536);
        }

        public String toString() {
            return "CharMatcher.isNot('" + CharMatcher.showCharacter(this.f15572a) + "')";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$n */
    private static final class C7073n extends CharMatcher {

        /* renamed from: a */
        static final C7073n f15573a = new C7073n();

        private C7073n() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c) {
            return Character.isDigit(c);
        }

        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$o */
    private static final class C7074o extends C7079t {

        /* renamed from: a */
        static final C7074o f15574a = new C7074o();

        private C7074o() {
            super("CharMatcher.javaIsoControl()");
        }

        public boolean matches(char c) {
            return c <= 31 || (c >= 127 && c <= 159);
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$p */
    private static final class C7075p extends CharMatcher {

        /* renamed from: a */
        static final C7075p f15575a = new C7075p();

        private C7075p() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c) {
            return Character.isLetter(c);
        }

        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$q */
    private static final class C7076q extends CharMatcher {

        /* renamed from: a */
        static final C7076q f15576a = new C7076q();

        private C7076q() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c) {
            return Character.isLetterOrDigit(c);
        }

        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$r */
    private static final class C7077r extends CharMatcher {

        /* renamed from: a */
        static final C7077r f15577a = new C7077r();

        private C7077r() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c) {
            return Character.isLowerCase(c);
        }

        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$s */
    private static final class C7078s extends CharMatcher {

        /* renamed from: a */
        static final C7078s f15578a = new C7078s();

        private C7078s() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c) {
            return Character.isUpperCase(c);
        }

        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$t */
    static abstract class C7079t extends C7066g {

        /* renamed from: a */
        private final String f15579a;

        C7079t(String str) {
            this.f15579a = (String) Preconditions.checkNotNull(str);
        }

        public final String toString() {
            return this.f15579a;
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$u */
    private static class C7080u extends CharMatcher {

        /* renamed from: a */
        final CharMatcher f15580a;

        C7080u(CharMatcher charMatcher) {
            this.f15580a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public int countIn(CharSequence charSequence) {
            return charSequence.length() - this.f15580a.countIn(charSequence);
        }

        public boolean matches(char c) {
            return !this.f15580a.matches(c);
        }

        public boolean matchesAllOf(CharSequence charSequence) {
            return this.f15580a.matchesNoneOf(charSequence);
        }

        public boolean matchesNoneOf(CharSequence charSequence) {
            return this.f15580a.matchesAllOf(charSequence);
        }

        public CharMatcher negate() {
            return this.f15580a;
        }

        /* access modifiers changed from: package-private */
        public void setBits(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f15580a.setBits(bitSet2);
            bitSet2.flip(0, 65536);
            bitSet.or(bitSet2);
        }

        public String toString() {
            return this.f15580a + ".negate()";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$v */
    static class C7081v extends C7080u {
        C7081v(CharMatcher charMatcher) {
            super(charMatcher);
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$w */
    private static final class C7082w extends C7079t {

        /* renamed from: a */
        static final C7082w f15581a = new C7082w();

        private C7082w() {
            super("CharMatcher.none()");
        }

        public CharMatcher and(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        public String collapseFrom(CharSequence charSequence, char c) {
            return charSequence.toString();
        }

        public int countIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return 0;
        }

        public int indexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        public int indexIn(CharSequence charSequence, int i) {
            Preconditions.checkPositionIndex(i, charSequence.length());
            return -1;
        }

        public int lastIndexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        public boolean matches(char c) {
            return false;
        }

        public boolean matchesAllOf(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        public boolean matchesNoneOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        public CharMatcher negate() {
            return any();
        }

        /* renamed from: or */
        public CharMatcher mo53615or(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        public String removeFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        public String replaceFrom(CharSequence charSequence, char c) {
            return charSequence.toString();
        }

        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            Preconditions.checkNotNull(charSequence2);
            return charSequence.toString();
        }

        public String trimFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        public String trimLeadingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        public String trimTrailingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$x */
    private static final class C7083x extends CharMatcher {

        /* renamed from: a */
        final CharMatcher f15582a;

        /* renamed from: b */
        final CharMatcher f15583b;

        C7083x(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f15582a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.f15583b = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c) {
            return this.f15582a.matches(c) || this.f15583b.matches(c);
        }

        /* access modifiers changed from: package-private */
        public void setBits(BitSet bitSet) {
            this.f15582a.setBits(bitSet);
            this.f15583b.setBits(bitSet);
        }

        public String toString() {
            return "CharMatcher.or(" + this.f15582a + ", " + this.f15583b + ")";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$y */
    private static class C7084y extends CharMatcher {

        /* renamed from: a */
        private final String f15584a;

        /* renamed from: b */
        private final char[] f15585b;

        /* renamed from: c */
        private final char[] f15586c;

        C7084y(String str, char[] cArr, char[] cArr2) {
            this.f15584a = str;
            this.f15585b = cArr;
            this.f15586c = cArr2;
            Preconditions.checkArgument(cArr.length == cArr2.length);
            int i = 0;
            while (i < cArr.length) {
                Preconditions.checkArgument(cArr[i] <= cArr2[i]);
                int i2 = i + 1;
                if (i2 < cArr.length) {
                    Preconditions.checkArgument(cArr2[i] < cArr[i2]);
                }
                i = i2;
            }
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c) {
            int binarySearch = Arrays.binarySearch(this.f15585b, c);
            if (binarySearch >= 0) {
                return true;
            }
            int i = (~binarySearch) - 1;
            return i >= 0 && c <= this.f15586c[i];
        }

        public String toString() {
            return this.f15584a;
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$z */
    private static final class C7085z extends C7084y {

        /* renamed from: a */
        static final C7085z f15587a = new C7085z();

        private C7085z() {
            super("CharMatcher.singleWidth()", "\u0000־א׳؀ݐ฀Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ๿₯℺﷿﻿ￜ".toCharArray());
        }
    }

    protected CharMatcher() {
    }

    public static CharMatcher any() {
        return C7061b.f15560a;
    }

    public static CharMatcher anyOf(CharSequence charSequence) {
        int length = charSequence.length();
        return length != 0 ? length != 1 ? length != 2 ? new C7062c(charSequence) : isEither(charSequence.charAt(0), charSequence.charAt(1)) : m18939is(charSequence.charAt(0)) : none();
    }

    public static CharMatcher ascii() {
        return C7063d.f15562a;
    }

    public static CharMatcher breakingWhitespace() {
        return C7064e.f15563a;
    }

    @Deprecated
    public static CharMatcher digit() {
        return C7065f.f15564a;
    }

    private String finishCollapseFrom(CharSequence charSequence, int i, int i2, char c, StringBuilder sb, boolean z) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (!matches(charAt)) {
                sb.append(charAt);
                z = false;
            } else if (!z) {
                sb.append(c);
                z = true;
            }
            i++;
        }
        return sb.toString();
    }

    public static CharMatcher forPredicate(Predicate<? super Character> predicate) {
        return predicate instanceof CharMatcher ? (CharMatcher) predicate : new C7067h(predicate);
    }

    public static CharMatcher inRange(char c, char c2) {
        return new C7068i(c, c2);
    }

    @Deprecated
    public static CharMatcher invisible() {
        return C7069j.f15568a;
    }

    /* renamed from: is */
    public static CharMatcher m18939is(char c) {
        return new C7070k(c);
    }

    private static C7071l isEither(char c, char c2) {
        return new C7071l(c, c2);
    }

    public static CharMatcher isNot(char c) {
        return new C7072m(c);
    }

    @Deprecated
    public static CharMatcher javaDigit() {
        return C7073n.f15573a;
    }

    public static CharMatcher javaIsoControl() {
        return C7074o.f15574a;
    }

    @Deprecated
    public static CharMatcher javaLetter() {
        return C7075p.f15575a;
    }

    @Deprecated
    public static CharMatcher javaLetterOrDigit() {
        return C7076q.f15576a;
    }

    @Deprecated
    public static CharMatcher javaLowerCase() {
        return C7077r.f15577a;
    }

    @Deprecated
    public static CharMatcher javaUpperCase() {
        return C7078s.f15578a;
    }

    public static CharMatcher none() {
        return C7082w.f15581a;
    }

    public static CharMatcher noneOf(CharSequence charSequence) {
        return anyOf(charSequence).negate();
    }

    /* access modifiers changed from: private */
    public static String showCharacter(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public static CharMatcher singleWidth() {
        return C7085z.f15587a;
    }

    public static CharMatcher whitespace() {
        return C7060aa.f15559b;
    }

    public CharMatcher and(CharMatcher charMatcher) {
        return new C7059a(this, charMatcher);
    }

    @Deprecated
    public boolean apply(Character ch) {
        return matches(ch.charValue());
    }

    public String collapseFrom(CharSequence charSequence, char c) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (matches(charAt)) {
                if (charAt != c || (i != length - 1 && matches(charSequence.charAt(i + 1)))) {
                    StringBuilder sb = new StringBuilder(length);
                    sb.append(charSequence, 0, i);
                    sb.append(c);
                    return finishCollapseFrom(charSequence, i + 1, length, c, sb, true);
                }
                i++;
            }
            i++;
        }
        return charSequence.toString();
    }

    public int countIn(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (matches(charSequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    public int indexIn(CharSequence charSequence) {
        return indexIn(charSequence, 0);
    }

    public int indexIn(CharSequence charSequence, int i) {
        int length = charSequence.length();
        Preconditions.checkPositionIndex(i, length);
        while (i < length) {
            if (matches(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int lastIndexIn(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (matches(charSequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public abstract boolean matches(char c);

    public boolean matchesAllOf(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesAnyOf(CharSequence charSequence) {
        return !matchesNoneOf(charSequence);
    }

    public boolean matchesNoneOf(CharSequence charSequence) {
        return indexIn(charSequence) == -1;
    }

    public CharMatcher negate() {
        return new C7080u(this);
    }

    /* renamed from: or */
    public CharMatcher mo53615or(CharMatcher charMatcher) {
        return new C7083x(this, charMatcher);
    }

    public String removeFrom(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        int indexIn = indexIn(charSequence2);
        if (indexIn == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        int i = 1;
        while (true) {
            indexIn++;
            while (indexIn != charArray.length) {
                if (matches(charArray[indexIn])) {
                    i++;
                } else {
                    charArray[indexIn - i] = charArray[indexIn];
                    indexIn++;
                }
            }
            return new String(charArray, 0, indexIn - i);
        }
    }

    public String replaceFrom(CharSequence charSequence, char c) {
        String charSequence2 = charSequence.toString();
        int indexIn = indexIn(charSequence2);
        if (indexIn == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        charArray[indexIn] = c;
        while (true) {
            indexIn++;
            if (indexIn >= charArray.length) {
                return new String(charArray);
            }
            if (matches(charArray[indexIn])) {
                charArray[indexIn] = c;
            }
        }
    }

    public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return removeFrom(charSequence);
        }
        int i = 0;
        if (length == 1) {
            return replaceFrom(charSequence, charSequence2.charAt(0));
        }
        String charSequence3 = charSequence.toString();
        int indexIn = indexIn(charSequence3);
        if (indexIn == -1) {
            return charSequence3;
        }
        int length2 = charSequence3.length();
        StringBuilder sb = new StringBuilder(((length2 * 3) / 2) + 16);
        do {
            sb.append(charSequence3, i, indexIn);
            sb.append(charSequence2);
            i = indexIn + 1;
            indexIn = indexIn(charSequence3, i);
        } while (indexIn != -1);
        sb.append(charSequence3, i, length2);
        return sb.toString();
    }

    public String retainFrom(CharSequence charSequence) {
        return negate().removeFrom(charSequence);
    }

    /* access modifiers changed from: package-private */
    public void setBits(BitSet bitSet) {
        for (int i = 65535; i >= 0; i--) {
            if (matches((char) i)) {
                bitSet.set(i);
            }
        }
    }

    public String toString() {
        return super.toString();
    }

    public String trimAndCollapseFrom(CharSequence charSequence, char c) {
        int length = charSequence.length();
        int i = length - 1;
        int i2 = 0;
        while (i2 < length && matches(charSequence.charAt(i2))) {
            i2++;
        }
        int i3 = i;
        while (i3 > i2 && matches(charSequence.charAt(i3))) {
            i3--;
        }
        if (i2 == 0 && i3 == i) {
            return collapseFrom(charSequence, c);
        }
        int i4 = i3 + 1;
        return finishCollapseFrom(charSequence, i2, i4, c, new StringBuilder(i4 - i2), false);
    }

    public String trimFrom(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && matches(charSequence.charAt(i))) {
            i++;
        }
        int i2 = length - 1;
        while (i2 > i && matches(charSequence.charAt(i2))) {
            i2--;
        }
        return charSequence.subSequence(i, i2 + 1).toString();
    }

    public String trimLeadingFrom(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!matches(charSequence.charAt(i))) {
                return charSequence.subSequence(i, length).toString();
            }
        }
        return "";
    }

    public String trimTrailingFrom(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }
}
