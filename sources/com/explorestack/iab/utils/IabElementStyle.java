package com.explorestack.iab.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.Serializable;

public class IabElementStyle implements Serializable {

    /* renamed from: a */
    public Integer f4242a;

    /* renamed from: b */
    public Integer f4243b;

    /* renamed from: c */
    public Boolean f4244c;

    /* renamed from: d */
    public Boolean f4245d;

    /* renamed from: e */
    public Integer f4246e;

    /* renamed from: f */
    public Integer f4247f;

    /* renamed from: g */
    public String f4248g;

    /* renamed from: h */
    public Float f4249h;

    /* renamed from: i */
    public Float f4250i;

    /* renamed from: j */
    public Integer f4251j;

    /* renamed from: k */
    public Integer f4252k;

    /* renamed from: l */
    public Integer f4253l;

    /* renamed from: m */
    public Integer f4254m;

    /* renamed from: n */
    public Integer f4255n;

    /* renamed from: o */
    public Integer f4256o;

    /* renamed from: p */
    public Integer f4257p;

    /* renamed from: q */
    public Integer f4258q;

    /* renamed from: r */
    public String f4259r;

    /* renamed from: s */
    public Float f4260s;

    /* renamed from: t */
    public Float f4261t;

    /* renamed from: u */
    public Float f4262u;

    /* renamed from: v */
    public Integer f4263v;

    /* renamed from: w */
    public Float f4264w;

    public IabElementStyle() {
    }

    public IabElementStyle(IabElementStyle iabElementStyle) {
        merge(iabElementStyle);
    }

    public void applyAlignment(FrameLayout.LayoutParams layoutParams) {
        layoutParams.gravity = positionAsGravity();
    }

    public void applyMargin(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        marginLayoutParams.leftMargin = getMarginLeft(context).intValue();
        marginLayoutParams.topMargin = getMarginTop(context).intValue();
        marginLayoutParams.rightMargin = getMarginRight(context).intValue();
        marginLayoutParams.bottomMargin = getMarginBottom(context).intValue();
    }

    public void applyPadding(Context context, View view) {
        view.setPadding(getPaddingLeft(context).intValue(), getPaddingTop(context).intValue(), getPaddingRight(context).intValue(), getPaddingBottom(context).intValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r0 != 17) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void applyRelativeAlignment(android.widget.RelativeLayout.LayoutParams r4) {
        /*
            r3 = this;
            java.lang.Integer r0 = r3.getHorizontalPosition()
            int r0 = r0.intValue()
            r1 = 17
            r2 = 1
            if (r0 == r2) goto L_0x001c
            r2 = 3
            if (r0 == r2) goto L_0x0019
            r2 = 5
            if (r0 == r2) goto L_0x0016
            if (r0 == r1) goto L_0x001c
            goto L_0x0021
        L_0x0016:
            r0 = 11
            goto L_0x001e
        L_0x0019:
            r0 = 9
            goto L_0x001e
        L_0x001c:
            r0 = 14
        L_0x001e:
            r4.addRule(r0)
        L_0x0021:
            java.lang.Integer r0 = r3.getVerticalPosition()
            int r0 = r0.intValue()
            r2 = 16
            if (r0 == r2) goto L_0x003e
            if (r0 == r1) goto L_0x003e
            r1 = 48
            if (r0 == r1) goto L_0x003b
            r1 = 80
            if (r0 == r1) goto L_0x0038
            goto L_0x0043
        L_0x0038:
            r0 = 12
            goto L_0x0040
        L_0x003b:
            r0 = 10
            goto L_0x0040
        L_0x003e:
            r0 = 15
        L_0x0040:
            r4.addRule(r0)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.utils.IabElementStyle.applyRelativeAlignment(android.widget.RelativeLayout$LayoutParams):void");
    }

    public IabElementStyle copyWith(IabElementStyle iabElementStyle) {
        IabElementStyle iabElementStyle2 = new IabElementStyle();
        iabElementStyle2.merge(this);
        iabElementStyle2.merge(iabElementStyle);
        return iabElementStyle2;
    }

    public String getContent() {
        return this.f4259r;
    }

    public Integer getFillColor() {
        Integer num = this.f4243b;
        return num != null ? num : Integer.valueOf(Assets.backgroundColor);
    }

    public Float getFontSize(Context context) {
        Float f = this.f4264w;
        return Float.valueOf((float) Utils.dpToPx(context, f != null ? f.floatValue() : 16.0f));
    }

    public Integer getFontStyle() {
        Integer num = this.f4263v;
        if (num != null) {
            return num;
        }
        return 0;
    }

    public Integer getHeight(Context context) {
        Float f = this.f4262u;
        return Integer.valueOf(f != null ? (f.floatValue() == -1.0f || this.f4262u.floatValue() == -2.0f) ? this.f4262u.intValue() : Utils.dpToPx(context, this.f4262u.floatValue()) : -2);
    }

    public Float getHideAfter() {
        return this.f4250i;
    }

    public Integer getHorizontalPosition() {
        Integer num = this.f4246e;
        if (num != null) {
            return num;
        }
        return 3;
    }

    public Integer getMarginBottom(Context context) {
        Integer num = this.f4258q;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, (float) num.intValue()) : 0);
    }

    public Integer getMarginLeft(Context context) {
        Integer num = this.f4255n;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, (float) num.intValue()) : 0);
    }

    public Integer getMarginRight(Context context) {
        Integer num = this.f4257p;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, (float) num.intValue()) : 0);
    }

    public Integer getMarginTop(Context context) {
        Integer num = this.f4256o;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, (float) num.intValue()) : 0);
    }

    public Float getOpacity() {
        Float f = this.f4249h;
        return f != null ? f : Float.valueOf(1.0f);
    }

    public Integer getPaddingBottom(Context context) {
        Integer num = this.f4254m;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, (float) num.intValue()) : 0);
    }

    public Integer getPaddingLeft(Context context) {
        Integer num = this.f4251j;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, (float) num.intValue()) : 0);
    }

    public Integer getPaddingRight(Context context) {
        Integer num = this.f4252k;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, (float) num.intValue()) : 0);
    }

    public Integer getPaddingTop(Context context) {
        Integer num = this.f4253l;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, (float) num.intValue()) : 0);
    }

    public Integer getStrokeColor() {
        Integer num = this.f4242a;
        return num != null ? num : Integer.valueOf(Assets.mainAssetsColor);
    }

    public Float getStrokeWidth(Context context) {
        Float f = this.f4260s;
        return Float.valueOf(f != null ? (float) Utils.dpToPx(context, f.floatValue()) : 0.0f);
    }

    public String getStyle() {
        return this.f4248g;
    }

    public Integer getVerticalPosition() {
        Integer num = this.f4247f;
        if (num != null) {
            return num;
        }
        return 48;
    }

    public Integer getWidth(Context context) {
        Float f = this.f4261t;
        return Integer.valueOf(f != null ? (f.floatValue() == -1.0f || this.f4261t.floatValue() == -2.0f) ? this.f4261t.intValue() : Utils.dpToPx(context, this.f4261t.floatValue()) : -2);
    }

    public boolean hasFillColor() {
        return this.f4243b != null;
    }

    public boolean hasStrokeColor() {
        return this.f4242a != null;
    }

    public Boolean isOutlined() {
        Boolean bool = this.f4244c;
        return bool != null ? bool : Boolean.FALSE;
    }

    public Boolean isVisible() {
        Boolean bool = this.f4245d;
        return bool != null ? bool : Boolean.TRUE;
    }

    public void merge(IabElementStyle iabElementStyle) {
        if (iabElementStyle != null) {
            Integer num = iabElementStyle.f4242a;
            if (num != null) {
                this.f4242a = num;
            }
            Integer num2 = iabElementStyle.f4243b;
            if (num2 != null) {
                this.f4243b = num2;
            }
            Boolean bool = iabElementStyle.f4244c;
            if (bool != null) {
                this.f4244c = bool;
            }
            Boolean bool2 = iabElementStyle.f4245d;
            if (bool2 != null) {
                this.f4245d = bool2;
            }
            Integer num3 = iabElementStyle.f4246e;
            if (num3 != null) {
                this.f4246e = num3;
            }
            Integer num4 = iabElementStyle.f4247f;
            if (num4 != null) {
                this.f4247f = num4;
            }
            String str = iabElementStyle.f4248g;
            if (str != null) {
                this.f4248g = str;
            }
            Float f = iabElementStyle.f4249h;
            if (f != null) {
                this.f4249h = f;
            }
            Float f2 = iabElementStyle.f4250i;
            if (f2 != null) {
                this.f4250i = f2;
            }
            Integer num5 = iabElementStyle.f4251j;
            if (num5 != null) {
                this.f4251j = num5;
            }
            Integer num6 = iabElementStyle.f4252k;
            if (num6 != null) {
                this.f4252k = num6;
            }
            Integer num7 = iabElementStyle.f4253l;
            if (num7 != null) {
                this.f4253l = num7;
            }
            Integer num8 = iabElementStyle.f4254m;
            if (num8 != null) {
                this.f4254m = num8;
            }
            Integer num9 = iabElementStyle.f4255n;
            if (num9 != null) {
                this.f4255n = num9;
            }
            Integer num10 = iabElementStyle.f4257p;
            if (num10 != null) {
                this.f4257p = num10;
            }
            Integer num11 = iabElementStyle.f4256o;
            if (num11 != null) {
                this.f4256o = num11;
            }
            Integer num12 = iabElementStyle.f4258q;
            if (num12 != null) {
                this.f4258q = num12;
            }
            String str2 = iabElementStyle.f4259r;
            if (str2 != null) {
                this.f4259r = str2;
            }
            Float f3 = iabElementStyle.f4260s;
            if (f3 != null) {
                this.f4260s = f3;
            }
            Float f4 = iabElementStyle.f4261t;
            if (f4 != null) {
                this.f4261t = f4;
            }
            Float f5 = iabElementStyle.f4262u;
            if (f5 != null) {
                this.f4262u = f5;
            }
            Integer num13 = iabElementStyle.f4263v;
            if (num13 != null) {
                this.f4263v = num13;
            }
            Float f6 = iabElementStyle.f4264w;
            if (f6 != null) {
                this.f4264w = f6;
            }
        }
    }

    public int positionAsGravity() {
        return getVerticalPosition().intValue() | getHorizontalPosition().intValue();
    }

    public void setContent(String str) {
        this.f4259r = str;
    }

    public void setFillColor(Integer num) {
        this.f4243b = num;
    }

    public void setFontSize(Float f) {
        this.f4264w = f;
    }

    public void setFontStyle(Integer num) {
        this.f4263v = num;
    }

    public void setHeight(Number number) {
        this.f4262u = Float.valueOf(number.floatValue());
    }

    public void setHideAfter(Float f) {
        this.f4250i = f;
    }

    public void setHorizontalPosition(Integer num) {
        this.f4246e = num;
    }

    public void setMargin(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f4255n = num;
        this.f4256o = num2;
        this.f4257p = num3;
        this.f4258q = num4;
    }

    public void setMargin(String str) {
        if (TextUtils.isEmpty(str)) {
            setMargin((Integer) null, (Integer) null, (Integer) null, (Integer) null);
            return;
        }
        String[] split = str.split(" ");
        if (split.length == 1) {
            int intValue = Utils.convertCssSizeToPx(split[0]).intValue();
            setMargin(Integer.valueOf(intValue), Integer.valueOf(intValue), Integer.valueOf(intValue), Integer.valueOf(intValue));
        } else if (split.length == 2) {
            int intValue2 = Utils.convertCssSizeToPx(split[0]).intValue();
            int intValue3 = Utils.convertCssSizeToPx(split[1]).intValue();
            setMargin(Integer.valueOf(intValue3), Integer.valueOf(intValue2), Integer.valueOf(intValue3), Integer.valueOf(intValue2));
        } else if (split.length == 3) {
            int intValue4 = Utils.convertCssSizeToPx(split[0]).intValue();
            int intValue5 = Utils.convertCssSizeToPx(split[1]).intValue();
            setMargin(Integer.valueOf(intValue5), Integer.valueOf(intValue4), Integer.valueOf(intValue5), Integer.valueOf(Utils.convertCssSizeToPx(split[2]).intValue()));
        } else if (split.length == 4) {
            setMargin(Integer.valueOf(Utils.convertCssSizeToPx(split[3]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(split[0]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(split[1]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(split[2]).intValue()));
        }
    }

    public void setOpacity(Float f) {
        this.f4249h = f;
    }

    public void setOutlined(Boolean bool) {
        this.f4244c = bool;
    }

    public void setPadding(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f4251j = num;
        this.f4253l = num2;
        this.f4252k = num3;
        this.f4254m = num4;
    }

    public void setPadding(String str) {
        if (TextUtils.isEmpty(str)) {
            setPadding((Integer) null, (Integer) null, (Integer) null, (Integer) null);
            return;
        }
        String[] split = str.split(" ");
        if (split.length == 1) {
            int intValue = Utils.convertCssSizeToPx(split[0]).intValue();
            setPadding(Integer.valueOf(intValue), Integer.valueOf(intValue), Integer.valueOf(intValue), Integer.valueOf(intValue));
        } else if (split.length == 2) {
            int intValue2 = Utils.convertCssSizeToPx(split[0]).intValue();
            int intValue3 = Utils.convertCssSizeToPx(split[1]).intValue();
            setPadding(Integer.valueOf(intValue3), Integer.valueOf(intValue2), Integer.valueOf(intValue3), Integer.valueOf(intValue2));
        } else if (split.length == 3) {
            int intValue4 = Utils.convertCssSizeToPx(split[0]).intValue();
            int intValue5 = Utils.convertCssSizeToPx(split[1]).intValue();
            setPadding(Integer.valueOf(intValue5), Integer.valueOf(intValue4), Integer.valueOf(intValue5), Integer.valueOf(Utils.convertCssSizeToPx(split[2]).intValue()));
        } else if (split.length == 4) {
            setPadding(Integer.valueOf(Utils.convertCssSizeToPx(split[3]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(split[0]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(split[1]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(split[2]).intValue()));
        }
    }

    public void setStrokeColor(Integer num) {
        this.f4242a = num;
    }

    public void setStrokeWidth(Float f) {
        this.f4260s = f;
    }

    public void setStyle(String str) {
        this.f4248g = str;
    }

    public void setVerticalPosition(Integer num) {
        this.f4247f = num;
    }

    public void setVisible(Boolean bool) {
        this.f4245d = bool;
    }

    public void setWidth(Number number) {
        this.f4261t = Float.valueOf(number.floatValue());
    }
}
