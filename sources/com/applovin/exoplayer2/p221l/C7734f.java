package com.applovin.exoplayer2.p221l;

import android.graphics.Color;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;

/* renamed from: com.applovin.exoplayer2.l.f */
public final class C7734f {

    /* renamed from: a */
    private static final Pattern f18268a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: b */
    private static final Pattern f18269b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: c */
    private static final Pattern f18270c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* renamed from: d */
    private static final Map<String, Integer> f18271d;

    static {
        HashMap hashMap = new HashMap();
        f18271d = hashMap;
        hashMap.put("aliceblue", -984833);
        f18271d.put("antiquewhite", -332841);
        f18271d.put("aqua", -16711681);
        f18271d.put("aquamarine", -8388652);
        f18271d.put("azure", -983041);
        f18271d.put("beige", -657956);
        f18271d.put("bisque", -6972);
        f18271d.put("black", -16777216);
        f18271d.put("blanchedalmond", -5171);
        f18271d.put("blue", -16776961);
        f18271d.put("blueviolet", -7722014);
        f18271d.put("brown", -5952982);
        f18271d.put("burlywood", -2180985);
        f18271d.put("cadetblue", -10510688);
        f18271d.put("chartreuse", -8388864);
        f18271d.put("chocolate", -2987746);
        f18271d.put("coral", -32944);
        f18271d.put("cornflowerblue", -10185235);
        f18271d.put("cornsilk", -1828);
        f18271d.put("crimson", -2354116);
        f18271d.put("cyan", -16711681);
        f18271d.put("darkblue", -16777077);
        f18271d.put("darkcyan", -16741493);
        f18271d.put("darkgoldenrod", -4684277);
        f18271d.put("darkgray", -5658199);
        f18271d.put("darkgreen", -16751616);
        f18271d.put("darkgrey", -5658199);
        f18271d.put("darkkhaki", -4343957);
        f18271d.put("darkmagenta", -7667573);
        f18271d.put("darkolivegreen", -11179217);
        f18271d.put("darkorange", -29696);
        f18271d.put("darkorchid", -6737204);
        f18271d.put("darkred", -7667712);
        f18271d.put("darksalmon", -1468806);
        f18271d.put("darkseagreen", -7357297);
        f18271d.put("darkslateblue", -12042869);
        f18271d.put("darkslategray", -13676721);
        f18271d.put("darkslategrey", -13676721);
        f18271d.put("darkturquoise", -16724271);
        f18271d.put("darkviolet", -7077677);
        f18271d.put("deeppink", -60269);
        f18271d.put("deepskyblue", -16728065);
        f18271d.put("dimgray", -9868951);
        f18271d.put("dimgrey", -9868951);
        f18271d.put("dodgerblue", -14774017);
        f18271d.put("firebrick", -5103070);
        f18271d.put("floralwhite", -1296);
        f18271d.put("forestgreen", -14513374);
        f18271d.put("fuchsia", -65281);
        f18271d.put("gainsboro", -2302756);
        f18271d.put("ghostwhite", -460545);
        f18271d.put("gold", -10496);
        f18271d.put("goldenrod", -2448096);
        f18271d.put("gray", -8355712);
        f18271d.put("green", -16744448);
        f18271d.put("greenyellow", -5374161);
        f18271d.put("grey", -8355712);
        f18271d.put("honeydew", -983056);
        f18271d.put("hotpink", -38476);
        f18271d.put("indianred", -3318692);
        f18271d.put("indigo", -11861886);
        f18271d.put("ivory", -16);
        f18271d.put("khaki", -989556);
        f18271d.put("lavender", -1644806);
        f18271d.put("lavenderblush", -3851);
        f18271d.put("lawngreen", -8586240);
        f18271d.put("lemonchiffon", -1331);
        f18271d.put("lightblue", -5383962);
        f18271d.put("lightcoral", -1015680);
        f18271d.put("lightcyan", -2031617);
        f18271d.put("lightgoldenrodyellow", -329006);
        f18271d.put("lightgray", -2894893);
        f18271d.put("lightgreen", -7278960);
        f18271d.put("lightgrey", -2894893);
        f18271d.put("lightpink", -18751);
        f18271d.put("lightsalmon", -24454);
        f18271d.put("lightseagreen", -14634326);
        f18271d.put("lightskyblue", -7876870);
        f18271d.put("lightslategray", -8943463);
        f18271d.put("lightslategrey", -8943463);
        f18271d.put("lightsteelblue", -5192482);
        f18271d.put("lightyellow", -32);
        f18271d.put("lime", -16711936);
        f18271d.put("limegreen", -13447886);
        f18271d.put("linen", -331546);
        f18271d.put("magenta", -65281);
        f18271d.put("maroon", -8388608);
        f18271d.put("mediumaquamarine", -10039894);
        f18271d.put("mediumblue", -16777011);
        f18271d.put("mediumorchid", -4565549);
        f18271d.put("mediumpurple", -7114533);
        f18271d.put("mediumseagreen", -12799119);
        f18271d.put("mediumslateblue", -8689426);
        f18271d.put("mediumspringgreen", -16713062);
        f18271d.put("mediumturquoise", -12004916);
        f18271d.put("mediumvioletred", -3730043);
        f18271d.put("midnightblue", -15132304);
        f18271d.put("mintcream", -655366);
        f18271d.put("mistyrose", -6943);
        f18271d.put("moccasin", -6987);
        f18271d.put("navajowhite", -8531);
        f18271d.put("navy", -16777088);
        f18271d.put("oldlace", -133658);
        f18271d.put("olive", -8355840);
        f18271d.put("olivedrab", -9728477);
        f18271d.put("orange", -23296);
        f18271d.put("orangered", -47872);
        f18271d.put("orchid", -2461482);
        f18271d.put("palegoldenrod", -1120086);
        f18271d.put("palegreen", -6751336);
        f18271d.put("paleturquoise", -5247250);
        f18271d.put("palevioletred", -2396013);
        f18271d.put("papayawhip", -4139);
        f18271d.put("peachpuff", -9543);
        f18271d.put("peru", -3308225);
        f18271d.put("pink", -16181);
        f18271d.put("plum", -2252579);
        f18271d.put("powderblue", -5185306);
        f18271d.put("purple", -8388480);
        f18271d.put("rebeccapurple", -10079335);
        f18271d.put("red", -65536);
        f18271d.put("rosybrown", -4419697);
        f18271d.put("royalblue", -12490271);
        f18271d.put("saddlebrown", -7650029);
        f18271d.put("salmon", -360334);
        f18271d.put("sandybrown", -744352);
        f18271d.put("seagreen", -13726889);
        f18271d.put("seashell", -2578);
        f18271d.put("sienna", -6270419);
        f18271d.put("silver", -4144960);
        f18271d.put("skyblue", -7876885);
        f18271d.put("slateblue", -9807155);
        f18271d.put("slategray", -9404272);
        f18271d.put("slategrey", -9404272);
        f18271d.put("snow", -1286);
        f18271d.put("springgreen", -16711809);
        f18271d.put("steelblue", -12156236);
        f18271d.put("tan", -2968436);
        f18271d.put("teal", -16744320);
        f18271d.put("thistle", -2572328);
        f18271d.put("tomato", -40121);
        f18271d.put("transparent", 0);
        f18271d.put("turquoise", -12525360);
        f18271d.put("violet", -1146130);
        f18271d.put("wheat", -663885);
        f18271d.put("white", -1);
        f18271d.put("whitesmoke", -657931);
        f18271d.put("yellow", -256);
        f18271d.put("yellowgreen", -6632142);
    }

    /* renamed from: a */
    public static int m22287a(String str) {
        return m22288a(str, false);
    }

    /* renamed from: a */
    private static int m22288a(String str, boolean z) {
        C7717a.m22118a(!TextUtils.isEmpty(str));
        String replace = str.replace(" ", "");
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                return -16777216 | parseLong;
            }
            if (replace.length() == 9) {
                return ((parseLong & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (parseLong >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (replace.startsWith("rgba")) {
            Matcher matcher = (z ? f18270c : f18269b).matcher(replace);
            if (matcher.matches()) {
                return Color.argb(z ? (int) (Float.parseFloat((String) C7717a.m22120b(matcher.group(4))) * 255.0f) : Integer.parseInt((String) C7717a.m22120b(matcher.group(4)), 10), Integer.parseInt((String) C7717a.m22120b(matcher.group(1)), 10), Integer.parseInt((String) C7717a.m22120b(matcher.group(2)), 10), Integer.parseInt((String) C7717a.m22120b(matcher.group(3)), 10));
            }
        } else if (replace.startsWith("rgb")) {
            Matcher matcher2 = f18268a.matcher(replace);
            if (matcher2.matches()) {
                return Color.rgb(Integer.parseInt((String) C7717a.m22120b(matcher2.group(1)), 10), Integer.parseInt((String) C7717a.m22120b(matcher2.group(2)), 10), Integer.parseInt((String) C7717a.m22120b(matcher2.group(3)), 10));
            }
        } else {
            Integer num = f18271d.get(Ascii.toLowerCase(replace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public static int m22289b(String str) {
        return m22288a(str, true);
    }
}
