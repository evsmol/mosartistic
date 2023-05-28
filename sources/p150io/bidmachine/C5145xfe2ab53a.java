package p150io.bidmachine;

/* renamed from: io.bidmachine.-$$Lambda$BidMachineActivityManager$LifecycleCallbacks$1sGPS43_ZgwhmcxfAB8tnnTeWHs */
/* compiled from: lambda */
public final /* synthetic */ class C5145xfe2ab53a implements Runnable {
    public static final /* synthetic */ C5145xfe2ab53a INSTANCE = new C5145xfe2ab53a();

    private /* synthetic */ C5145xfe2ab53a() {
    }

    public final void run() {
        SessionManager.get().pause();
    }
}
