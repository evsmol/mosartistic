package com.appodeal.ads.modules.libs.network.httpclients;

import com.appodeal.ads.modules.libs.network.encoders.C9289a;
import com.appodeal.ads.modules.libs.network.encoders.C9290b;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.modules.libs.network.httpclients.b */
public final class C9296b {

    /* renamed from: a */
    public static final Lazy f23524a = LazyKt.lazy(C9297a.f23528a);

    /* renamed from: b */
    public static final Lazy f23525b = LazyKt.lazy(C9300d.f23531a);

    /* renamed from: c */
    public static final Lazy f23526c = LazyKt.lazy(C9299c.f23530a);

    /* renamed from: d */
    public static final Lazy f23527d = LazyKt.lazy(C9298b.f23529a);

    /* renamed from: com.appodeal.ads.modules.libs.network.httpclients.b$a */
    public static final class C9297a extends Lambda implements Function0<C9295a> {

        /* renamed from: a */
        public static final C9297a f23528a = new C9297a();

        public C9297a() {
            super(0);
        }

        public final Object invoke() {
            return new C9295a(MapsKt.mapOf(TuplesKt.m14544to("Content-Type", CollectionsKt.listOf("application/json; charset=UTF-8"))), CollectionsKt.emptyList(), CollectionsKt.emptyList());
        }
    }

    /* renamed from: com.appodeal.ads.modules.libs.network.httpclients.b$b */
    public static final class C9298b extends Lambda implements Function0<C9295a> {

        /* renamed from: a */
        public static final C9298b f23529a = new C9298b();

        public C9298b() {
            super(0);
        }

        public final Object invoke() {
            Map mapOf = MapsKt.mapOf(TuplesKt.m14544to("Content-Type", CollectionsKt.listOf("application/x-protobuf")));
            C9290b bVar = C9290b.f23517a;
            return new C9295a(mapOf, CollectionsKt.listOf(bVar), CollectionsKt.listOf(bVar));
        }
    }

    /* renamed from: com.appodeal.ads.modules.libs.network.httpclients.b$c */
    public static final class C9299c extends Lambda implements Function0<C9295a> {

        /* renamed from: a */
        public static final C9299c f23530a = new C9299c();

        public C9299c() {
            super(0);
        }

        public final Object invoke() {
            Map mapOf = MapsKt.mapOf(TuplesKt.m14544to("Content-Type", CollectionsKt.listOf("text/plain; charset=UTF-8")));
            C9290b bVar = C9290b.f23517a;
            return new C9295a(mapOf, CollectionsKt.listOf(bVar, C9289a.f23516a), CollectionsKt.listOf(bVar));
        }
    }

    /* renamed from: com.appodeal.ads.modules.libs.network.httpclients.b$d */
    public static final class C9300d extends Lambda implements Function0<C9295a> {

        /* renamed from: a */
        public static final C9300d f23531a = new C9300d();

        public C9300d() {
            super(0);
        }

        public final Object invoke() {
            Map mapOf = MapsKt.mapOf(TuplesKt.m14544to("Content-Type", CollectionsKt.listOf("text/plain; charset=UTF-8")));
            C9290b bVar = C9290b.f23517a;
            return new C9295a(mapOf, CollectionsKt.listOf(bVar), CollectionsKt.listOf(bVar));
        }
    }

    /* renamed from: a */
    public static final C9295a m27477a() {
        return (C9295a) f23524a.getValue();
    }

    /* renamed from: b */
    public static final C9295a m27478b() {
        return (C9295a) f23527d.getValue();
    }

    /* renamed from: c */
    public static final C9295a m27479c() {
        return (C9295a) f23526c.getValue();
    }

    /* renamed from: d */
    public static final C9295a m27480d() {
        return (C9295a) f23525b.getValue();
    }
}
