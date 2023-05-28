package com.onesignal;

import android.content.Context;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import com.onesignal.OneSignal;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

class TrackAmazonPurchase {
    private boolean canTrack = false;
    /* access modifiers changed from: private */
    public Context context;
    private Field listenerHandlerField;
    private Object listenerHandlerObject;
    /* access modifiers changed from: private */
    public OSPurchasingListener osPurchasingListener;
    private boolean registerListenerOnMainThread = false;

    TrackAmazonPurchase(Context context2) {
        this.context = context2;
        try {
            Class<?> cls = Class.forName("com.amazon.device.iap.internal.d");
            try {
                this.listenerHandlerObject = cls.getMethod("d", new Class[0]).invoke((Object) null, new Object[0]);
            } catch (NullPointerException unused) {
                this.listenerHandlerObject = cls.getMethod("e", new Class[0]).invoke((Object) null, new Object[0]);
                this.registerListenerOnMainThread = true;
            }
            Field declaredField = cls.getDeclaredField("f");
            this.listenerHandlerField = declaredField;
            declaredField.setAccessible(true);
            OSPurchasingListener oSPurchasingListener = new OSPurchasingListener();
            this.osPurchasingListener = oSPurchasingListener;
            oSPurchasingListener.orgPurchasingListener = (PurchasingListener) this.listenerHandlerField.get(this.listenerHandlerObject);
            this.canTrack = true;
            setListener();
        } catch (ClassNotFoundException e) {
            logAmazonIAPListenerError(e);
        } catch (IllegalAccessException e2) {
            logAmazonIAPListenerError(e2);
        } catch (InvocationTargetException e3) {
            logAmazonIAPListenerError(e3);
        } catch (NoSuchMethodException e4) {
            logAmazonIAPListenerError(e4);
        } catch (NoSuchFieldException e5) {
            logAmazonIAPListenerError(e5);
        } catch (ClassCastException e6) {
            logAmazonIAPListenerError(e6);
        }
    }

    private static void logAmazonIAPListenerError(Exception exc) {
        OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Error adding Amazon IAP listener.", exc);
        exc.printStackTrace();
    }

    private void setListener() {
        if (this.registerListenerOnMainThread) {
            OSUtils.runOnMainUIThread(new Runnable() {
                public void run() {
                    PurchasingService.registerListener(TrackAmazonPurchase.this.context, TrackAmazonPurchase.this.osPurchasingListener);
                }
            });
        } else {
            PurchasingService.registerListener(this.context, this.osPurchasingListener);
        }
    }

    /* access modifiers changed from: package-private */
    public void checkListener() {
        if (this.canTrack) {
            try {
                OSPurchasingListener oSPurchasingListener = (PurchasingListener) this.listenerHandlerField.get(this.listenerHandlerObject);
                if (oSPurchasingListener != this.osPurchasingListener) {
                    this.osPurchasingListener.orgPurchasingListener = oSPurchasingListener;
                    setListener();
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    private class OSPurchasingListener {
        PurchasingListener orgPurchasingListener;

        private OSPurchasingListener() {
        }
    }
}
