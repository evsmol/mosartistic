package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

public enum PlacementPosition implements ProtocolMessageEnum {
    PLACEMENT_POSITION_INVALID(0),
    PLACEMENT_POSITION_ABOVE_THE_FOLD(1),
    PLACEMENT_POSITION_LOCKED(2),
    PLACEMENT_POSITION_BELOW_THE_FOLD(3),
    PLACEMENT_POSITION_HEADER(4),
    PLACEMENT_POSITION_FOOTER(5),
    PLACEMENT_POSITION_SIDEBAR(6),
    PLACEMENT_POSITION_FULLSCREEN(7),
    UNRECOGNIZED(-1);
    
    public static final int PLACEMENT_POSITION_ABOVE_THE_FOLD_VALUE = 1;
    public static final int PLACEMENT_POSITION_BELOW_THE_FOLD_VALUE = 3;
    public static final int PLACEMENT_POSITION_FOOTER_VALUE = 5;
    public static final int PLACEMENT_POSITION_FULLSCREEN_VALUE = 7;
    public static final int PLACEMENT_POSITION_HEADER_VALUE = 4;
    public static final int PLACEMENT_POSITION_INVALID_VALUE = 0;
    public static final int PLACEMENT_POSITION_LOCKED_VALUE = 2;
    public static final int PLACEMENT_POSITION_SIDEBAR_VALUE = 6;
    private static final PlacementPosition[] VALUES = null;
    private static final Internal.EnumLiteMap<PlacementPosition> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<PlacementPosition>() {
            public PlacementPosition findValueByNumber(int i) {
                return PlacementPosition.forNumber(i);
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
    public static PlacementPosition valueOf(int i) {
        return forNumber(i);
    }

    public static PlacementPosition forNumber(int i) {
        switch (i) {
            case 0:
                return PLACEMENT_POSITION_INVALID;
            case 1:
                return PLACEMENT_POSITION_ABOVE_THE_FOLD;
            case 2:
                return PLACEMENT_POSITION_LOCKED;
            case 3:
                return PLACEMENT_POSITION_BELOW_THE_FOLD;
            case 4:
                return PLACEMENT_POSITION_HEADER;
            case 5:
                return PLACEMENT_POSITION_FOOTER;
            case 6:
                return PLACEMENT_POSITION_SIDEBAR;
            case 7:
                return PLACEMENT_POSITION_FULLSCREEN;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<PlacementPosition> internalGetValueMap() {
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
        return AdcomProto.getDescriptor().getEnumTypes().get(25);
    }

    public static PlacementPosition valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private PlacementPosition(int i) {
        this.value = i;
    }
}
