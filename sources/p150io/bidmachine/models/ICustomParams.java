package p150io.bidmachine.models;

import java.util.Map;

/* renamed from: io.bidmachine.models.ICustomParams */
public interface ICustomParams<SelfType> {
    SelfType addParam(String str, String str2);

    SelfType addParams(Map<String, String> map);
}
