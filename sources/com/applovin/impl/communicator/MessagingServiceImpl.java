package com.applovin.impl.communicator;

import android.content.Context;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorMessagingService;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

public class MessagingServiceImpl implements AppLovinCommunicatorMessagingService {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f19511a;

    /* renamed from: b */
    private final ScheduledThreadPoolExecutor f19512b = m23985a();

    public MessagingServiceImpl(Context context) {
        this.f19511a = context;
    }

    /* renamed from: a */
    private ScheduledThreadPoolExecutor m23985a() {
        return new ScheduledThreadPoolExecutor(4, new ThreadFactory() {
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, "AppLovinSdk:com.applovin.communicator");
                thread.setPriority(10);
                thread.setDaemon(true);
                return thread;
            }
        });
    }

    public void publish(final AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f19512b.execute(new Runnable() {
            public void run() {
                AppLovinBroadcastManager.getInstance(MessagingServiceImpl.this.f19511a).sendBroadcastSync(appLovinCommunicatorMessage, (Map<String, Object>) null);
            }
        });
    }

    public String toString() {
        return "MessagingServiceImpl{}";
    }
}
