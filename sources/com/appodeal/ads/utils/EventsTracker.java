package com.appodeal.ads.utils;

import android.text.TextUtils;
import com.appodeal.ads.C9258l;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.storage.C9562o;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

public class EventsTracker {

    /* renamed from: e */
    public static EventsTracker f24337e;

    /* renamed from: a */
    public final EnumMap f24338a = new EnumMap(AdType.class);

    /* renamed from: b */
    public final C9600a f24339b = new C9600a((C9600a) null);

    /* renamed from: c */
    public final HashMap f24340c = new HashMap();

    /* renamed from: d */
    public final C9562o f24341d = C9562o.f24251b;

    public enum EventType {
        Impression,
        Click,
        Finish,
        FailedToLoad,
        InternalError,
        Expired
    }

    public interface EventsListener {
        void onImpressionStored(AdType adType, String str);
    }

    /* renamed from: com.appodeal.ads.utils.EventsTracker$a */
    public static class C9600a {

        /* renamed from: a */
        public final EnumMap<EventType, AtomicInteger> f24342a = new EnumMap<>(EventType.class);

        /* renamed from: b */
        public final EnumMap<EventType, Map<String, AtomicInteger>> f24343b = new EnumMap<>(EventType.class);

        /* renamed from: c */
        public final C9600a f24344c;

        /* renamed from: com.appodeal.ads.utils.EventsTracker$a$a */
        public class C9601a extends HashMap<String, AtomicInteger> {
            public C9601a(String str) {
                put(str, new AtomicInteger(1));
            }
        }

        public C9600a(C9600a aVar) {
            this.f24344c = aVar;
        }

        /* renamed from: a */
        public final int mo61029a(EventType eventType) {
            if (this.f24342a.containsKey(eventType)) {
                return this.f24342a.get(eventType).get();
            }
            return 0;
        }

        /* renamed from: a */
        public final void mo61030a(EventType eventType, String str) {
            C9600a aVar = this.f24344c;
            if (aVar != null) {
                aVar.mo61030a(eventType, str);
            }
            if (this.f24342a.get(eventType) == null) {
                this.f24342a.put(eventType, new AtomicInteger(1));
            } else {
                this.f24342a.get(eventType).incrementAndGet();
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (this.f24343b.get(eventType) == null || !this.f24343b.get(eventType).containsKey(str)) {
                this.f24343b.put(eventType, new C9601a(str));
            } else {
                ((AtomicInteger) this.f24343b.get(eventType).get(str)).incrementAndGet();
            }
        }
    }

    public static EventsTracker get() {
        EventsTracker eventsTracker = f24337e;
        if (eventsTracker != null) {
            return eventsTracker;
        }
        EventsTracker eventsTracker2 = new EventsTracker();
        f24337e = eventsTracker2;
        return eventsTracker2;
    }

    /* renamed from: a */
    public final int mo61019a(AdType adType, EventType... eventTypeArr) {
        int i = 0;
        for (EventType a : eventTypeArr) {
            i += mo61020a(adType).mo61029a(a);
        }
        return i;
    }

    /* renamed from: a */
    public final C9600a mo61020a(AdType adType) {
        if (this.f24338a.containsKey(adType)) {
            return (C9600a) this.f24338a.get(adType);
        }
        C9600a aVar = new C9600a(this.f24339b);
        this.f24338a.put(adType, aVar);
        return aVar;
    }

    /* renamed from: a */
    public final JSONObject mo61021a(EventType eventType) {
        try {
            JSONObject jSONObject = new JSONObject(this.f24341d.mo60824f(eventType.name()));
            for (AdType adType : AdType.values()) {
                if (!jSONObject.has(adType.getCodeName())) {
                    jSONObject.put(adType.getCodeName(), 0);
                }
            }
            return jSONObject;
        } catch (JSONException e) {
            Log.log(e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo61022a(AdType adType, C9258l lVar, EventType eventType) {
        String name = lVar != null ? lVar.f23268b.getName() : null;
        if (adType != null) {
            mo61020a(adType).mo61030a(eventType, name);
            try {
                JSONObject jSONObject = new JSONObject(this.f24341d.mo60824f(eventType.name()));
                jSONObject.put(adType.getCodeName(), jSONObject.optInt(adType.getCodeName(), 0) + 1);
                this.f24341d.mo60816b(eventType.name(), jSONObject.toString());
            } catch (Exception e) {
                Log.log(e);
            }
        }
        if (eventType == EventType.Impression) {
            for (EventsListener onImpressionStored : this.f24340c.values()) {
                onImpressionStored.onImpressionStored(adType, name);
            }
        }
    }

    /* renamed from: b */
    public final int mo61023b(EventType eventType) {
        return this.f24339b.mo61029a(eventType);
    }

    /* renamed from: c */
    public final JSONObject mo61024c(EventType eventType) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (AdType adType : AdType.values()) {
                jSONObject.put(adType.getCodeName(), mo61020a(adType).mo61029a(eventType));
            }
        } catch (JSONException e) {
            Log.log(e);
        }
        return jSONObject;
    }

    public int getEventCount(EventType eventType, AdType... adTypeArr) {
        if (adTypeArr == null) {
            return 0;
        }
        int i = 0;
        for (AdType a : adTypeArr) {
            i += mo61020a(a).mo61029a(eventType);
        }
        return i;
    }

    public void subscribeEventsListener(String str, EventsListener eventsListener) {
        this.f24340c.put(str, eventsListener);
    }

    public void unsubscribeEventsListener(String str) {
        this.f24340c.remove(str);
    }
}
