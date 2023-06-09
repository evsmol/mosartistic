package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

public enum VideoCreativeType implements ProtocolMessageEnum {
    VIDEO_CREATIVE_TYPE_INVALID(0),
    VIDEO_CREATIVE_TYPE_VAST_1_0(1),
    VIDEO_CREATIVE_TYPE_VAST_2_0(2),
    VIDEO_CREATIVE_TYPE_VAST_3_0(3),
    VIDEO_CREATIVE_TYPE_VAST_WRAPPER_1_0(4),
    VIDEO_CREATIVE_TYPE_VAST_WRAPPER_2_0(5),
    VIDEO_CREATIVE_TYPE_VAST_WRAPPER_3_0(6),
    VIDEO_CREATIVE_TYPE_VAST_4_0(7),
    VIDEO_CREATIVE_TYPE_VAST_WRAPPER_4_0(8),
    VIDEO_CREATIVE_TYPE_VAST_4_1(9),
    VIDEO_CREATIVE_TYPE_VAST_WRAPPER_4_1(10),
    UNRECOGNIZED(-1);
    
    private static final VideoCreativeType[] VALUES = null;
    public static final int VIDEO_CREATIVE_TYPE_INVALID_VALUE = 0;
    public static final int VIDEO_CREATIVE_TYPE_VAST_1_0_VALUE = 1;
    public static final int VIDEO_CREATIVE_TYPE_VAST_2_0_VALUE = 2;
    public static final int VIDEO_CREATIVE_TYPE_VAST_3_0_VALUE = 3;
    public static final int VIDEO_CREATIVE_TYPE_VAST_4_0_VALUE = 7;
    public static final int VIDEO_CREATIVE_TYPE_VAST_4_1_VALUE = 9;
    public static final int VIDEO_CREATIVE_TYPE_VAST_WRAPPER_1_0_VALUE = 4;
    public static final int VIDEO_CREATIVE_TYPE_VAST_WRAPPER_2_0_VALUE = 5;
    public static final int VIDEO_CREATIVE_TYPE_VAST_WRAPPER_3_0_VALUE = 6;
    public static final int VIDEO_CREATIVE_TYPE_VAST_WRAPPER_4_0_VALUE = 8;
    public static final int VIDEO_CREATIVE_TYPE_VAST_WRAPPER_4_1_VALUE = 10;
    private static final Internal.EnumLiteMap<VideoCreativeType> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<VideoCreativeType>() {
            public VideoCreativeType findValueByNumber(int i) {
                return VideoCreativeType.forNumber(i);
            }
        };
        VALUES = values();
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static VideoCreativeType valueOf(int i) {
        return forNumber(i);
    }

    public static VideoCreativeType forNumber(int i) {
        switch (i) {
            case 0:
                return VIDEO_CREATIVE_TYPE_INVALID;
            case 1:
                return VIDEO_CREATIVE_TYPE_VAST_1_0;
            case 2:
                return VIDEO_CREATIVE_TYPE_VAST_2_0;
            case 3:
                return VIDEO_CREATIVE_TYPE_VAST_3_0;
            case 4:
                return VIDEO_CREATIVE_TYPE_VAST_WRAPPER_1_0;
            case 5:
                return VIDEO_CREATIVE_TYPE_VAST_WRAPPER_2_0;
            case 6:
                return VIDEO_CREATIVE_TYPE_VAST_WRAPPER_3_0;
            case 7:
                return VIDEO_CREATIVE_TYPE_VAST_4_0;
            case 8:
                return VIDEO_CREATIVE_TYPE_VAST_WRAPPER_4_0;
            case 9:
                return VIDEO_CREATIVE_TYPE_VAST_4_1;
            case 10:
                return VIDEO_CREATIVE_TYPE_VAST_WRAPPER_4_1;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<VideoCreativeType> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this != UNRECOGNIZED) {
            return getDescriptor().getValues().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AdcomProto.getDescriptor().getEnumTypes().get(28);
    }

    public static VideoCreativeType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private VideoCreativeType(int i) {
        this.value = i;
    }
}
