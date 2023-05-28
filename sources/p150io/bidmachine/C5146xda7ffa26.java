package p150io.bidmachine;

/* renamed from: io.bidmachine.-$$Lambda$BidMachineActivityManager$LifecycleCallbacks$37w_B_2g3cgeQIN_KEnstX32qIU */
/* compiled from: lambda */
public final /* synthetic */ class C5146xda7ffa26 implements Runnable {
    public static final /* synthetic */ C5146xda7ffa26 INSTANCE = new C5146xda7ffa26();

    private /* synthetic */ C5146xda7ffa26() {
    }

    public final void run() {
        SessionManager.get().resume();
    }
}
