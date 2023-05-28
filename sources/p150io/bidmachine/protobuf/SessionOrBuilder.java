package p150io.bidmachine.protobuf;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageOrBuilder;

/* renamed from: io.bidmachine.protobuf.SessionOrBuilder */
public interface SessionOrBuilder extends MessageOrBuilder {
    String getId();

    ByteString getIdBytes();

    long getUptime();
}
