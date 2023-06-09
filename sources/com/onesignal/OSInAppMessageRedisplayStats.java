package com.onesignal;

import com.onesignal.OneSignal;
import org.json.JSONException;
import org.json.JSONObject;

class OSInAppMessageRedisplayStats {
    private long displayDelay;
    private int displayLimit;
    private int displayQuantity;
    private long lastDisplayTime;
    private boolean redisplayEnabled;

    OSInAppMessageRedisplayStats() {
        this.lastDisplayTime = -1;
        this.displayQuantity = 0;
        this.displayLimit = 1;
        this.displayDelay = 0;
        this.redisplayEnabled = false;
    }

    OSInAppMessageRedisplayStats(int i, long j) {
        this.lastDisplayTime = -1;
        this.displayQuantity = 0;
        this.displayLimit = 1;
        this.displayDelay = 0;
        this.redisplayEnabled = false;
        this.displayQuantity = i;
        this.lastDisplayTime = j;
    }

    OSInAppMessageRedisplayStats(JSONObject jSONObject) throws JSONException {
        this.lastDisplayTime = -1;
        this.displayQuantity = 0;
        this.displayLimit = 1;
        this.displayDelay = 0;
        this.redisplayEnabled = false;
        this.redisplayEnabled = true;
        Object obj = jSONObject.get("limit");
        Object obj2 = jSONObject.get("delay");
        if (obj instanceof Integer) {
            this.displayLimit = ((Integer) obj).intValue();
        }
        if (obj2 instanceof Long) {
            this.displayDelay = ((Long) obj2).longValue();
        } else if (obj2 instanceof Integer) {
            this.displayDelay = (long) ((Integer) obj2).intValue();
        }
    }

    /* access modifiers changed from: package-private */
    public void setDisplayStats(OSInAppMessageRedisplayStats oSInAppMessageRedisplayStats) {
        setLastDisplayTime(oSInAppMessageRedisplayStats.getLastDisplayTime());
        setDisplayQuantity(oSInAppMessageRedisplayStats.getDisplayQuantity());
    }

    /* access modifiers changed from: package-private */
    public long getLastDisplayTime() {
        return this.lastDisplayTime;
    }

    /* access modifiers changed from: package-private */
    public void setLastDisplayTime(long j) {
        this.lastDisplayTime = j;
    }

    /* access modifiers changed from: package-private */
    public void incrementDisplayQuantity() {
        this.displayQuantity++;
    }

    /* access modifiers changed from: package-private */
    public int getDisplayQuantity() {
        return this.displayQuantity;
    }

    /* access modifiers changed from: package-private */
    public void setDisplayQuantity(int i) {
        this.displayQuantity = i;
    }

    /* access modifiers changed from: package-private */
    public boolean shouldDisplayAgain() {
        boolean z = this.displayQuantity < this.displayLimit;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.Log(log_level, "OSInAppMessage shouldDisplayAgain: " + z);
        return z;
    }

    /* access modifiers changed from: package-private */
    public boolean isDelayTimeSatisfied() {
        if (this.lastDisplayTime < 0) {
            return true;
        }
        long currentTimeMillis = OneSignal.getTime().getCurrentTimeMillis() / 1000;
        long j = currentTimeMillis - this.lastDisplayTime;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.Log(log_level, "OSInAppMessage lastDisplayTime: " + this.lastDisplayTime + " currentTimeInSeconds: " + currentTimeMillis + " diffInSeconds: " + j + " displayDelay: " + this.displayDelay);
        if (j >= this.displayDelay) {
            return true;
        }
        return false;
    }

    public boolean isRedisplayEnabled() {
        return this.redisplayEnabled;
    }

    public String toString() {
        return "OSInAppMessageDisplayStats{lastDisplayTime=" + this.lastDisplayTime + ", displayQuantity=" + this.displayQuantity + ", displayLimit=" + this.displayLimit + ", displayDelay=" + this.displayDelay + '}';
    }
}
