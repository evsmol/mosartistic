package com.explorestack.iab.vast.tags;

import android.graphics.Color;
import android.text.TextUtils;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.explorestack.iab.utils.IabElementStyle;
import com.explorestack.iab.utils.Utils;
import com.explorestack.iab.vast.VastLog;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p150io.bidmachine.utils.IabUtils;

public class VastXmlTag implements Serializable {

    /* renamed from: a */
    public String f4625a;

    /* renamed from: b */
    public HashMap<String, String> f4626b;

    public VastXmlTag() {
    }

    public VastXmlTag(XmlPullParser xmlPullParser) {
        parse(xmlPullParser);
    }

    /* renamed from: a */
    public static HashMap<String, String> m6588a(VastXmlTag vastXmlTag, XmlPullParser xmlPullParser) {
        if (xmlPullParser.getAttributeCount() <= 0) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            if (vastXmlTag.mo4526d(xmlPullParser.getAttributeName(i))) {
                hashMap.put(xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m6589a(XmlPullParser xmlPullParser, IabElementStyle iabElementStyle) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            if (!TextUtils.isEmpty(attributeValue)) {
                try {
                    if ("stroke".equals(attributeName)) {
                        iabElementStyle.setStrokeColor(m6592c(attributeValue));
                    } else if ("fill".equals(attributeName)) {
                        iabElementStyle.setFillColor(m6592c(attributeValue));
                    } else if ("outlined".equals(attributeName)) {
                        iabElementStyle.setOutlined(Boolean.valueOf(m6601k(attributeValue)));
                    } else if ("visible".equals(attributeName)) {
                        iabElementStyle.setVisible(Boolean.valueOf(m6601k(attributeValue)));
                    } else if ("x".equals(attributeName)) {
                        iabElementStyle.setHorizontalPosition(m6598h(attributeValue));
                    } else if ("y".equals(attributeName)) {
                        iabElementStyle.setVerticalPosition(m6599i(attributeValue));
                    } else if ("style".equals(attributeName)) {
                        iabElementStyle.setStyle(attributeValue);
                    } else if ("opacity".equals(attributeName)) {
                        iabElementStyle.setOpacity(Float.valueOf(Float.parseFloat(attributeValue)));
                    } else if ("hideafter".equals(attributeName)) {
                        iabElementStyle.setHideAfter(Float.valueOf(Float.parseFloat(attributeValue)));
                    } else if ("padding".equals(attributeName)) {
                        iabElementStyle.setPadding(attributeValue);
                    } else if ("margin".equals(attributeName)) {
                        iabElementStyle.setMargin(attributeValue);
                    } else if ("strokewidth".equals(attributeName)) {
                        iabElementStyle.setStrokeWidth(Utils.convertCssSizeToPx(attributeValue));
                    } else if (IabUtils.KEY_WIDTH.equals(attributeName)) {
                        iabElementStyle.setWidth(Utils.convertCssSizeToPx(attributeValue));
                    } else if (IabUtils.KEY_HEIGHT.equals(attributeName)) {
                        iabElementStyle.setHeight(Utils.convertCssSizeToPx(attributeValue));
                    } else if ("fontstyle".equals(attributeName)) {
                        iabElementStyle.setFontStyle(Integer.valueOf(Integer.parseInt(attributeValue)));
                    } else if ("fontsize".equals(attributeName)) {
                        iabElementStyle.setFontSize(Utils.convertCssSizeToPx(attributeValue));
                    }
                } catch (Throwable th) {
                    VastLog.m6353a("VastXmlTag", th);
                }
            }
        }
        try {
            iabElementStyle.setContent(m6593c(xmlPullParser));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            xmlPullParser.require(3, (String) null, xmlPullParser.getName());
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* renamed from: a */
    public static boolean m6590a(String str, String str2) {
        return str != null && str.equalsIgnoreCase(str2);
    }

    /* renamed from: b */
    public static boolean m6591b(XmlPullParser xmlPullParser) {
        return m6601k(m6593c(xmlPullParser));
    }

    /* renamed from: c */
    public static Integer m6592c(String str) {
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Exception e) {
            VastLog.m6351a("VastXmlTag", e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public static String m6593c(XmlPullParser xmlPullParser) {
        if (xmlPullParser.next() != 4) {
            return null;
        }
        String text = xmlPullParser.getText();
        if (!TextUtils.isEmpty(text)) {
            text = text.trim();
        }
        xmlPullParser.nextTag();
        return text;
    }

    /* renamed from: d */
    public static void m6594d(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    i++;
                } else if (next == 3) {
                    i--;
                }
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public static int m6595e(String str) {
        if (str == null) {
            return -1;
        }
        int indexOf = str.indexOf(".");
        if (indexOf > 0) {
            str = str.substring(0, indexOf);
        }
        String[] split = str.split(":");
        if (split.length <= 2) {
            return -1;
        }
        try {
            return (Integer.parseInt(split[0]) * 60 * 60) + (Integer.parseInt(split[1]) * 60) + Integer.parseInt(split[2]);
        } catch (Exception e) {
            VastLog.m6353a("VastXmlTag", (Throwable) e);
            return -1;
        }
    }

    /* renamed from: f */
    public static int m6596f(String str) {
        if (str == null) {
            return -1;
        }
        String[] split = str.split(":");
        if (split.length <= 1) {
            return -1;
        }
        try {
            return (Integer.parseInt(split[0]) * 60) + Integer.parseInt(split[1]);
        } catch (Exception e) {
            VastLog.m6353a("VastXmlTag", (Throwable) e);
            return -1;
        }
    }

    /* renamed from: g */
    public static Integer m6597g(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        if (lowerCase.equals("portrait")) {
            i = 1;
        } else if (!lowerCase.equals("landscape")) {
            return null;
        } else {
            i = 2;
        }
        return Integer.valueOf(i);
    }

    /* renamed from: h */
    public static Integer m6598h(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        char c = 65535;
        int hashCode = lowerCase.hashCode();
        if (hashCode != -1364013995) {
            if (hashCode != 3317767) {
                if (hashCode == 108511772 && lowerCase.equals("right")) {
                    c = 2;
                }
            } else if (lowerCase.equals("left")) {
                c = 1;
            }
        } else if (lowerCase.equals("center")) {
            c = 0;
        }
        if (c == 0) {
            return 1;
        }
        if (c == 1) {
            i = 3;
        } else if (c != 2) {
            return null;
        } else {
            i = 5;
        }
        return Integer.valueOf(i);
    }

    /* renamed from: i */
    public static Integer m6599i(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        char c = 65535;
        int hashCode = lowerCase.hashCode();
        if (hashCode != -1383228885) {
            if (hashCode != -1364013995) {
                if (hashCode == 115029 && lowerCase.equals("top")) {
                    c = 2;
                }
            } else if (lowerCase.equals("center")) {
                c = 1;
            }
        } else if (lowerCase.equals("bottom")) {
            c = 0;
        }
        if (c == 0) {
            i = 80;
        } else if (c == 1) {
            i = 16;
        } else if (c != 2) {
            return null;
        } else {
            i = 48;
        }
        return Integer.valueOf(i);
    }

    /* renamed from: j */
    public static boolean m6600j(String str) {
        return str != null && (str.equalsIgnoreCase("false") || str.equalsIgnoreCase(BuildConfig.ADAPTER_VERSION));
    }

    /* renamed from: k */
    public static boolean m6601k(String str) {
        return str != null && (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("1"));
    }

    /* renamed from: a */
    public final String mo4522a(String str) {
        if (mo4524a()) {
            return this.f4626b.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo4523a(HashMap<String, String> hashMap) {
        this.f4626b = hashMap;
    }

    /* renamed from: a */
    public void mo4505a(XmlPullParser xmlPullParser) {
    }

    /* renamed from: a */
    public final boolean mo4524a() {
        HashMap<String, String> hashMap = this.f4626b;
        return hashMap != null && !hashMap.isEmpty();
    }

    /* renamed from: b */
    public final int mo4525b(String str) {
        String a = mo4522a(str);
        if (TextUtils.isEmpty(a)) {
            VastLog.m6354d("VastXmlTag", String.format(Locale.ENGLISH, "Error parse attribute value - %s, by name - %s", new Object[]{a, str}));
            return -1;
        }
        try {
            return Integer.parseInt(a);
        } catch (Exception unused) {
            VastLog.m6351a("VastXmlTag", String.format(Locale.ENGLISH, "Error parse attribute value - %s, by name - %s", new Object[]{a, str}));
            return -1;
        }
    }

    /* renamed from: d */
    public final boolean mo4526d(String str) {
        String[] supportedAttributes = getSupportedAttributes();
        if (supportedAttributes != null && supportedAttributes.length > 0) {
            for (String equals : supportedAttributes) {
                if (equals.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean getBooleanAttributeValueByName(String str, boolean z) {
        String a = mo4522a(str);
        if (m6601k(a)) {
            return true;
        }
        if (m6600j(a)) {
            return false;
        }
        return z;
    }

    public String[] getSupportedAttributes() {
        return new String[0];
    }

    public final String getText() {
        return this.f4625a;
    }

    public boolean isTextSupported() {
        return false;
    }

    public boolean isValidTag() {
        return true;
    }

    public void parse(XmlPullParser xmlPullParser) {
        mo4523a(m6588a(this, xmlPullParser));
        if (isTextSupported()) {
            setText(m6593c(xmlPullParser));
        }
        mo4505a(xmlPullParser);
    }

    public final void setText(String str) {
        this.f4625a = str;
    }
}
