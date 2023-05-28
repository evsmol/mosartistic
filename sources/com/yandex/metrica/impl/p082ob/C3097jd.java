package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.modules.api.ModuleEntryPoint;
import com.yandex.metrica.modules.api.RemoteConfigExtensionConfiguration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* renamed from: com.yandex.metrica.impl.ob.jd */
public final class C3097jd implements C3126kd, C3131ki {

    /* renamed from: a */
    private final CopyOnWriteArrayList<ModuleEntryPoint> f8166a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public Map<String, Integer> mo17763a() {
        List list;
        Map blocks;
        CopyOnWriteArrayList<ModuleEntryPoint> copyOnWriteArrayList = this.f8166a;
        ArrayList arrayList = new ArrayList();
        for (ModuleEntryPoint remoteConfigExtensionConfiguration : copyOnWriteArrayList) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration2 = remoteConfigExtensionConfiguration.getRemoteConfigExtensionConfiguration();
            if (remoteConfigExtensionConfiguration2 == null || (blocks = remoteConfigExtensionConfiguration2.getBlocks()) == null || (list = MapsKt.toList(blocks)) == null) {
                list = CollectionsKt.emptyList();
            }
            CollectionsKt.addAll(arrayList, list);
        }
        return MapsKt.toMap(arrayList);
    }

    /* renamed from: a */
    public void mo15770a(C3004gi giVar, C3356pi piVar) {
    }

    /* renamed from: b */
    public List<String> mo17764b() {
        List list;
        CopyOnWriteArrayList<ModuleEntryPoint> copyOnWriteArrayList = this.f8166a;
        ArrayList arrayList = new ArrayList();
        for (ModuleEntryPoint remoteConfigExtensionConfiguration : copyOnWriteArrayList) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration2 = remoteConfigExtensionConfiguration.getRemoteConfigExtensionConfiguration();
            if (remoteConfigExtensionConfiguration2 == null || (list = remoteConfigExtensionConfiguration2.getFeatures()) == null) {
                list = CollectionsKt.emptyList();
            }
            CollectionsKt.addAll(arrayList, list);
        }
        return arrayList;
    }

    /* renamed from: c */
    public Map<String, C3029hd> mo17765c() {
        CopyOnWriteArrayList<ModuleEntryPoint> copyOnWriteArrayList = this.f8166a;
        ArrayList arrayList = new ArrayList();
        for (ModuleEntryPoint moduleEntryPoint : copyOnWriteArrayList) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleEntryPoint.getRemoteConfigExtensionConfiguration();
            Pair pair = remoteConfigExtensionConfiguration != null ? TuplesKt.m14544to(moduleEntryPoint.getIdentifier(), new C3029hd(remoteConfigExtensionConfiguration)) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return MapsKt.toMap(arrayList);
    }

    /* renamed from: a */
    public void mo15772a(C3356pi piVar) {
        C3059id idVar = new C3059id(piVar);
        for (ModuleEntryPoint moduleEntryPoint : this.f8166a) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleEntryPoint.getRemoteConfigExtensionConfiguration();
            if (remoteConfigExtensionConfiguration != null) {
                remoteConfigExtensionConfiguration.getRemoteConfigUpdateListener().onRemoteConfigUpdated(idVar.mo17712a(moduleEntryPoint.getIdentifier()));
            }
        }
    }
}
