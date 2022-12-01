// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class MapMarkFromTypeOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private MapMarkFromTypeOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MapMarkFromTypeOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015MapMarkFromType.proto*l\n\u000fMapMarkFromType\u0012\u001b\n\u0017MAP_MARK_FROM_TYPE_NONE\u0010\u0000\u0012\u001e\n\u001aMAP_MARK_FROM_TYPE_MONSTER\u0010\u0001\u0012\u001c\n\u0018MAP_MARK_FROM_TYPE_QUEST\u0010\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MapMarkFromTypeOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum MapMarkFromType implements ProtocolMessageEnum
    {
        MAP_MARK_FROM_TYPE_NONE(0), 
        MAP_MARK_FROM_TYPE_MONSTER(1), 
        MAP_MARK_FROM_TYPE_QUEST(2), 
        UNRECOGNIZED(-1);
        
        public static final int MAP_MARK_FROM_TYPE_NONE_VALUE = 0;
        public static final int MAP_MARK_FROM_TYPE_MONSTER_VALUE = 1;
        public static final int MAP_MARK_FROM_TYPE_QUEST_VALUE = 2;
        private static final Internal.EnumLiteMap<MapMarkFromType> internalValueMap;
        private static final MapMarkFromType[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == MapMarkFromType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static MapMarkFromType valueOf(final int value) {
            return forNumber(value);
        }
        
        public static MapMarkFromType forNumber(final int value) {
            switch (value) {
                case 0: {
                    return MapMarkFromType.MAP_MARK_FROM_TYPE_NONE;
                }
                case 1: {
                    return MapMarkFromType.MAP_MARK_FROM_TYPE_MONSTER;
                }
                case 2: {
                    return MapMarkFromType.MAP_MARK_FROM_TYPE_QUEST;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<MapMarkFromType> internalGetValueMap() {
            return MapMarkFromType.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == MapMarkFromType.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return MapMarkFromTypeOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static MapMarkFromType valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return MapMarkFromType.UNRECOGNIZED;
            }
            return MapMarkFromType.VALUES[desc.getIndex()];
        }
        
        private MapMarkFromType(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ MapMarkFromType[] value() {
            return new MapMarkFromType[] { MapMarkFromType.MAP_MARK_FROM_TYPE_NONE, MapMarkFromType.MAP_MARK_FROM_TYPE_MONSTER, MapMarkFromType.MAP_MARK_FROM_TYPE_QUEST, MapMarkFromType.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<MapMarkFromType>() {
                @Override
                public MapMarkFromType findValueByNumber(final int number) {
                    return MapMarkFromType.forNumber(number);
                }
            };

        }
    }
}
