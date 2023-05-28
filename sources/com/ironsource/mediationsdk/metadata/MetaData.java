package com.ironsource.mediationsdk.metadata;

import java.util.ArrayList;
import java.util.List;

public class MetaData {

    /* renamed from: a */
    private String f11563a;

    /* renamed from: b */
    private List<String> f11564b;

    /* renamed from: c */
    private List<MetaDataValueTypes> f11565c;

    public enum MetaDataValueTypes {
        META_DATA_VALUE_STRING,
        META_DATA_VALUE_BOOLEAN,
        META_DATA_VALUE_INT,
        META_DATA_VALUE_LONG,
        META_DATA_VALUE_DOUBLE,
        META_DATA_VALUE_FLOAT
    }

    public MetaData(String str, List<String> list) {
        this.f11563a = str;
        this.f11564b = list;
        this.f11565c = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            this.f11565c.add(MetaDataValueTypes.META_DATA_VALUE_STRING);
        }
    }

    public MetaData(String str, List<String> list, List<MetaDataValueTypes> list2) {
        this.f11563a = str;
        this.f11564b = list;
        this.f11565c = list2;
    }

    public String getMetaDataKey() {
        return this.f11563a;
    }

    public List<String> getMetaDataValue() {
        return this.f11564b;
    }

    public List<MetaDataValueTypes> getMetaDataValueType() {
        return this.f11565c;
    }
}
