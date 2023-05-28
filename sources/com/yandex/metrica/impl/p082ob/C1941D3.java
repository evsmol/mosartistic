package com.yandex.metrica.impl.p082ob;

import android.location.Location;
import android.os.ResultReceiver;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.p082ob.C2312Mg;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.D3 */
public class C1941D3 {

    /* renamed from: a */
    public final C2312Mg.C2314b f5199a;

    /* renamed from: b */
    public final C1942a f5200b;

    /* renamed from: c */
    public final ResultReceiver f5201c;

    /* renamed from: com.yandex.metrica.impl.ob.D3$a */
    public static class C1942a implements C1959Dg<C1942a, C1942a> {

        /* renamed from: a */
        public final String f5202a;

        /* renamed from: b */
        public final String f5203b;

        /* renamed from: c */
        public final String f5204c;

        /* renamed from: d */
        public final String f5205d;

        /* renamed from: e */
        public final Boolean f5206e;

        /* renamed from: f */
        public final Location f5207f;

        /* renamed from: g */
        public final Boolean f5208g;

        /* renamed from: h */
        public final Integer f5209h;

        /* renamed from: i */
        public final Integer f5210i;

        /* renamed from: j */
        public final Integer f5211j;

        /* renamed from: k */
        public final Boolean f5212k;

        /* renamed from: l */
        public final Boolean f5213l;

        /* renamed from: m */
        public final Map<String, String> f5214m;

        /* renamed from: n */
        public final Integer f5215n;

        /* renamed from: o */
        public final Boolean f5216o;

        /* renamed from: p */
        public final Boolean f5217p;

        /* renamed from: q */
        public final Boolean f5218q;

        C1942a(String str, String str2, String str3, String str4, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map<String, String> map, Integer num4, Boolean bool5, Boolean bool6, Boolean bool7) {
            this.f5202a = str;
            this.f5203b = str2;
            this.f5204c = str3;
            this.f5205d = str4;
            this.f5206e = bool;
            this.f5207f = location;
            this.f5208g = bool2;
            this.f5209h = num;
            this.f5210i = num2;
            this.f5211j = num3;
            this.f5212k = bool3;
            this.f5213l = bool4;
            this.f5214m = map;
            this.f5215n = num4;
            this.f5216o = bool5;
            this.f5217p = bool6;
            this.f5218q = bool7;
        }

        /* renamed from: b */
        public boolean mo15607b(Object obj) {
            return equals((C1942a) obj);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1942a.class != obj.getClass()) {
                return false;
            }
            C1942a aVar = (C1942a) obj;
            String str = this.f5202a;
            if (str == null ? aVar.f5202a != null : !str.equals(aVar.f5202a)) {
                return false;
            }
            String str2 = this.f5203b;
            if (str2 == null ? aVar.f5203b != null : !str2.equals(aVar.f5203b)) {
                return false;
            }
            String str3 = this.f5204c;
            if (str3 == null ? aVar.f5204c != null : !str3.equals(aVar.f5204c)) {
                return false;
            }
            String str4 = this.f5205d;
            if (str4 == null ? aVar.f5205d != null : !str4.equals(aVar.f5205d)) {
                return false;
            }
            Boolean bool = this.f5206e;
            if (bool == null ? aVar.f5206e != null : !bool.equals(aVar.f5206e)) {
                return false;
            }
            Location location = this.f5207f;
            if (location == null ? aVar.f5207f != null : !location.equals(aVar.f5207f)) {
                return false;
            }
            Boolean bool2 = this.f5208g;
            if (bool2 == null ? aVar.f5208g != null : !bool2.equals(aVar.f5208g)) {
                return false;
            }
            Integer num = this.f5209h;
            if (num == null ? aVar.f5209h != null : !num.equals(aVar.f5209h)) {
                return false;
            }
            Integer num2 = this.f5210i;
            if (num2 == null ? aVar.f5210i != null : !num2.equals(aVar.f5210i)) {
                return false;
            }
            Integer num3 = this.f5211j;
            if (num3 == null ? aVar.f5211j != null : !num3.equals(aVar.f5211j)) {
                return false;
            }
            Boolean bool3 = this.f5212k;
            if (bool3 == null ? aVar.f5212k != null : !bool3.equals(aVar.f5212k)) {
                return false;
            }
            Boolean bool4 = this.f5213l;
            if (bool4 == null ? aVar.f5213l != null : !bool4.equals(aVar.f5213l)) {
                return false;
            }
            Map<String, String> map = this.f5214m;
            if (map == null ? aVar.f5214m != null : !map.equals(aVar.f5214m)) {
                return false;
            }
            Integer num4 = this.f5215n;
            if (num4 == null ? aVar.f5215n != null : !num4.equals(aVar.f5215n)) {
                return false;
            }
            Boolean bool5 = this.f5216o;
            if (bool5 == null ? aVar.f5216o != null : !bool5.equals(aVar.f5216o)) {
                return false;
            }
            Boolean bool6 = this.f5217p;
            if (bool6 == null ? aVar.f5217p != null : !bool6.equals(aVar.f5217p)) {
                return false;
            }
            Boolean bool7 = this.f5218q;
            if (bool7 != null) {
                return bool7.equals(aVar.f5218q);
            }
            if (aVar.f5218q == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f5202a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f5203b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f5204c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f5205d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            Boolean bool = this.f5206e;
            int hashCode5 = (hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
            Location location = this.f5207f;
            int hashCode6 = (hashCode5 + (location != null ? location.hashCode() : 0)) * 31;
            Boolean bool2 = this.f5208g;
            int hashCode7 = (hashCode6 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
            Integer num = this.f5209h;
            int hashCode8 = (hashCode7 + (num != null ? num.hashCode() : 0)) * 31;
            Integer num2 = this.f5210i;
            int hashCode9 = (hashCode8 + (num2 != null ? num2.hashCode() : 0)) * 31;
            Integer num3 = this.f5211j;
            int hashCode10 = (hashCode9 + (num3 != null ? num3.hashCode() : 0)) * 31;
            Boolean bool3 = this.f5212k;
            int hashCode11 = (hashCode10 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
            Boolean bool4 = this.f5213l;
            int hashCode12 = (hashCode11 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
            Map<String, String> map = this.f5214m;
            int hashCode13 = (hashCode12 + (map != null ? map.hashCode() : 0)) * 31;
            Integer num4 = this.f5215n;
            int hashCode14 = (hashCode13 + (num4 != null ? num4.hashCode() : 0)) * 31;
            Boolean bool5 = this.f5216o;
            int hashCode15 = (hashCode14 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
            Boolean bool6 = this.f5217p;
            int hashCode16 = (hashCode15 + (bool6 != null ? bool6.hashCode() : 0)) * 31;
            Boolean bool7 = this.f5218q;
            if (bool7 != null) {
                i = bool7.hashCode();
            }
            return hashCode16 + i;
        }

        /* renamed from: a */
        public C1942a mo15606a(C1942a aVar) {
            C1942a aVar2 = aVar;
            String str = this.f5202a;
            String str2 = aVar2.f5202a;
            if (str == null) {
                str = str2;
            }
            String str3 = this.f5203b;
            String str4 = aVar2.f5203b;
            if (str3 == null) {
                str3 = str4;
            }
            String str5 = this.f5204c;
            String str6 = aVar2.f5204c;
            if (str5 == null) {
                str5 = str6;
            }
            String str7 = this.f5205d;
            String str8 = aVar2.f5205d;
            if (str7 == null) {
                str7 = str8;
            }
            Boolean bool = this.f5206e;
            Boolean bool2 = aVar2.f5206e;
            if (bool == null) {
                bool = bool2;
            }
            Location location = this.f5207f;
            Location location2 = aVar2.f5207f;
            if (location == null) {
                location = location2;
            }
            Boolean bool3 = this.f5208g;
            Boolean bool4 = aVar2.f5208g;
            if (bool3 == null) {
                bool3 = bool4;
            }
            Integer num = this.f5209h;
            Integer num2 = aVar2.f5209h;
            if (num == null) {
                num = num2;
            }
            Integer num3 = this.f5210i;
            Integer num4 = aVar2.f5210i;
            if (num3 == null) {
                num3 = num4;
            }
            Integer num5 = this.f5211j;
            Integer num6 = aVar2.f5211j;
            if (num5 == null) {
                num5 = num6;
            }
            Boolean bool5 = this.f5212k;
            Boolean bool6 = aVar2.f5212k;
            if (bool5 == null) {
                bool5 = bool6;
            }
            Boolean bool7 = this.f5213l;
            Boolean bool8 = aVar2.f5213l;
            if (bool7 == null) {
                bool7 = bool8;
            }
            Map<String, String> map = this.f5214m;
            Map<String, String> map2 = aVar2.f5214m;
            if (map == null) {
                map = map2;
            }
            Integer num7 = this.f5215n;
            Map<String, String> map3 = map;
            Integer num8 = aVar2.f5215n;
            if (num7 == null) {
                num7 = num8;
            }
            Boolean bool9 = this.f5216o;
            Integer num9 = num7;
            Boolean bool10 = bool9 == null ? aVar2.f5216o : bool9;
            Boolean bool11 = this.f5217p;
            Boolean bool12 = bool11 == null ? aVar2.f5217p : bool11;
            Boolean bool13 = this.f5218q;
            return new C1942a(str, str3, str5, str7, bool, location, bool3, num, num3, num5, bool5, bool7, map3, num9, bool10, bool12, bool13 == null ? aVar2.f5218q : bool13);
        }

        public C1942a(CounterConfiguration counterConfiguration, Map<String, String> map) {
            this(counterConfiguration.mo64616d(), counterConfiguration.mo64614c(), counterConfiguration.mo64611b(), counterConfiguration.mo64607a(), counterConfiguration.mo64629o(), counterConfiguration.mo64621g(), counterConfiguration.mo64628n(), counterConfiguration.mo64626l(), counterConfiguration.mo64622h(), counterConfiguration.mo64619e(), counterConfiguration.mo64630p(), counterConfiguration.mo64627m(), map, counterConfiguration.mo64623i(), counterConfiguration.mo64624j(), counterConfiguration.mo64620f(), counterConfiguration.mo64631q());
        }

        public C1942a() {
            this((String) null, (String) null, (String) null, (String) null, (Boolean) null, (Location) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Boolean) null, (Boolean) null, (Map<String, String>) null, (Integer) null, (Boolean) null, (Boolean) null, (Boolean) null);
        }
    }

    public C1941D3(C3719z3 z3Var) {
        this(new C2312Mg.C2314b(z3Var), new C1942a(z3Var.mo18444b(), z3Var.mo18443a().mo15419a()), z3Var.mo18443a().mo15426c());
    }

    public C1941D3(C2312Mg.C2314b bVar, C1942a aVar, ResultReceiver resultReceiver) {
        this.f5199a = bVar;
        this.f5200b = aVar;
        this.f5201c = resultReceiver;
    }
}
