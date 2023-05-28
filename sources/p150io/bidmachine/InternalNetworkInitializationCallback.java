package p150io.bidmachine;

/* renamed from: io.bidmachine.InternalNetworkInitializationCallback */
public interface InternalNetworkInitializationCallback {
    void onFail(NetworkAdapter networkAdapter, String str);

    void onSuccess(NetworkAdapter networkAdapter);
}
