// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class MapMarkPointTypeOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private MapMarkPointTypeOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MapMarkPointTypeOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016MapMarkPointType.proto*\u00f5\u0001\n\u0010MapMarkPointType\u0012\u001b\n\u0017MAP_MARK_POINT_TYPE_NPC\u0010\u0000\u0012\u001d\n\u0019MAP_MARK_POINT_TYPE_QUEST\u0010\u0001\u0012\u001f\n\u001bMAP_MARK_POINT_TYPE_SPECIAL\u0010\u0002\u0012\u001c\n\u0018MAP_MARK_POINT_TYPE_MINE\u0010\u0003\u0012\"\n\u001eMAP_MARK_POINT_TYPE_COLLECTION\u0010\u0004\u0012\u001f\n\u001bMAP_MARK_POINT_TYPE_MONSTER\u0010\u0005\u0012!\n\u001dMAP_MARK_POINT_TYPE_FISH_POOL\u0010\u0006B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MapMarkPointTypeOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum MapMarkPointType implements ProtocolMessageEnum
    {
        MAP_MARK_POINT_TYPE_NPC(0), 
        MAP_MARK_POINT_TYPE_QUEST(1), 
        MAP_MARK_POINT_TYPE_SPECIAL(2), 
        MAP_MARK_POINT_TYPE_MINE(3), 
        MAP_MARK_POINT_TYPE_COLLECTION(4), 
        MAP_MARK_POINT_TYPE_MONSTER(5), 
        MAP_MARK_POINT_TYPE_FISH_POOL(6), 
        UNRECOGNIZED(-1);
        
        public static final int MAP_MARK_POINT_TYPE_NPC_VALUE = 0;
        public static final int MAP_MARK_POINT_TYPE_QUEST_VALUE = 1;
        public static final int MAP_MARK_POINT_TYPE_SPECIAL_VALUE = 2;
        public static final int MAP_MARK_POINT_TYPE_MINE_VALUE = 3;
        public static final int MAP_MARK_POINT_TYPE_COLLECTION_VALUE = 4;
        public static final int MAP_MARK_POINT_TYPE_MONSTER_VALUE = 5;
        public static final int MAP_MARK_POINT_TYPE_FISH_POOL_VALUE = 6;
        private static final Internal.EnumLiteMap<MapMarkPointType> internalValueMap;
        private static final MapMarkPointType[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == MapMarkPointType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static MapMarkPointType valueOf(final int value) {
            return forNumber(value);
        }
        
        public static MapMarkPointType forNumber(final int value) {
            switch (value) {
                case 0: {
                    return MapMarkPointType.MAP_MARK_POINT_TYPE_NPC;
                }
                case 1: {
                    return MapMarkPointType.MAP_MARK_POINT_TYPE_QUEST;
                }
                case 2: {
                    return MapMarkPointType.MAP_MARK_POINT_TYPE_SPECIAL;
                }
                case 3: {
                    return MapMarkPointType.MAP_MARK_POINT_TYPE_MINE;
                }
                case 4: {
                    return MapMarkPointType.MAP_MARK_POINT_TYPE_COLLECTION;
                }
                case 5: {
                    return MapMarkPointType.MAP_MARK_POINT_TYPE_MONSTER;
                }
                case 6: {
                    return MapMarkPointType.MAP_MARK_POINT_TYPE_FISH_POOL;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<MapMarkPointType> internalGetValueMap() {
            return MapMarkPointType.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == MapMarkPointType.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return MapMarkPointTypeOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static MapMarkPointType valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return MapMarkPointType.UNRECOGNIZED;
            }
            return MapMarkPointType.VALUES[desc.getIndex()];
        }
        
        private MapMarkPointType(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ MapMarkPointType[] value() {
            return new MapMarkPointType[] { MapMarkPointType.MAP_MARK_POINT_TYPE_NPC, MapMarkPointType.MAP_MARK_POINT_TYPE_QUEST, MapMarkPointType.MAP_MARK_POINT_TYPE_SPECIAL, MapMarkPointType.MAP_MARK_POINT_TYPE_MINE, MapMarkPointType.MAP_MARK_POINT_TYPE_COLLECTION, MapMarkPointType.MAP_MARK_POINT_TYPE_MONSTER, MapMarkPointType.MAP_MARK_POINT_TYPE_FISH_POOL, MapMarkPointType.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<MapMarkPointType>() {
                @Override
                public MapMarkPointType findValueByNumber(final int number) {
                    return MapMarkPointType.forNumber(number);
                }
            };

        }
    }
}
