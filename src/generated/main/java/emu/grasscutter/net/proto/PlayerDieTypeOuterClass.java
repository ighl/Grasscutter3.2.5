// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class PlayerDieTypeOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private PlayerDieTypeOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlayerDieTypeOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0013PlayerDieType.proto*\u009e\u0002\n\rPlayerDieType\u0012\u0018\n\u0014PLAYER_DIE_TYPE_NONE\u0010\u0000\u0012#\n\u001fPLAYER_DIE_TYPE_KILL_BY_MONSTER\u0010\u0001\u0012 \n\u001cPLAYER_DIE_TYPE_KILL_BY_GEAR\u0010\u0002\u0012\u0018\n\u0014PLAYER_DIE_TYPE_FALL\u0010\u0003\u0012\u0019\n\u0015PLAYER_DIE_TYPE_DRAWN\u0010\u0004\u0012\u0019\n\u0015PLAYER_DIE_TYPE_ABYSS\u0010\u0005\u0012\u0016\n\u0012PLAYER_DIE_TYPE_GM\u0010\u0006\u0012 \n\u001cPLAYER_DIE_TYPE_CLIMATE_COLD\u0010\u0007\u0012\"\n\u001ePLAYER_DIE_TYPE_STORM_LIGHTING\u0010\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlayerDieTypeOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum PlayerDieType implements ProtocolMessageEnum
    {
        PLAYER_DIE_TYPE_NONE(0), 
        PLAYER_DIE_TYPE_KILL_BY_MONSTER(1), 
        PLAYER_DIE_TYPE_KILL_BY_GEAR(2), 
        PLAYER_DIE_TYPE_FALL(3), 
        PLAYER_DIE_TYPE_DRAWN(4), 
        PLAYER_DIE_TYPE_ABYSS(5), 
        PLAYER_DIE_TYPE_GM(6), 
        PLAYER_DIE_TYPE_CLIMATE_COLD(7), 
        PLAYER_DIE_TYPE_STORM_LIGHTING(8), 
        UNRECOGNIZED(-1);
        
        public static final int PLAYER_DIE_TYPE_NONE_VALUE = 0;
        public static final int PLAYER_DIE_TYPE_KILL_BY_MONSTER_VALUE = 1;
        public static final int PLAYER_DIE_TYPE_KILL_BY_GEAR_VALUE = 2;
        public static final int PLAYER_DIE_TYPE_FALL_VALUE = 3;
        public static final int PLAYER_DIE_TYPE_DRAWN_VALUE = 4;
        public static final int PLAYER_DIE_TYPE_ABYSS_VALUE = 5;
        public static final int PLAYER_DIE_TYPE_GM_VALUE = 6;
        public static final int PLAYER_DIE_TYPE_CLIMATE_COLD_VALUE = 7;
        public static final int PLAYER_DIE_TYPE_STORM_LIGHTING_VALUE = 8;
        private static final Internal.EnumLiteMap<PlayerDieType> internalValueMap;
        private static final PlayerDieType[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == PlayerDieType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static PlayerDieType valueOf(final int value) {
            return forNumber(value);
        }
        
        public static PlayerDieType forNumber(final int value) {
            switch (value) {
                case 0: {
                    return PlayerDieType.PLAYER_DIE_TYPE_NONE;
                }
                case 1: {
                    return PlayerDieType.PLAYER_DIE_TYPE_KILL_BY_MONSTER;
                }
                case 2: {
                    return PlayerDieType.PLAYER_DIE_TYPE_KILL_BY_GEAR;
                }
                case 3: {
                    return PlayerDieType.PLAYER_DIE_TYPE_FALL;
                }
                case 4: {
                    return PlayerDieType.PLAYER_DIE_TYPE_DRAWN;
                }
                case 5: {
                    return PlayerDieType.PLAYER_DIE_TYPE_ABYSS;
                }
                case 6: {
                    return PlayerDieType.PLAYER_DIE_TYPE_GM;
                }
                case 7: {
                    return PlayerDieType.PLAYER_DIE_TYPE_CLIMATE_COLD;
                }
                case 8: {
                    return PlayerDieType.PLAYER_DIE_TYPE_STORM_LIGHTING;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<PlayerDieType> internalGetValueMap() {
            return PlayerDieType.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == PlayerDieType.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return PlayerDieTypeOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static PlayerDieType valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return PlayerDieType.UNRECOGNIZED;
            }
            return PlayerDieType.VALUES[desc.getIndex()];
        }
        
        private PlayerDieType(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ PlayerDieType[] value() {
            return new PlayerDieType[] { PlayerDieType.PLAYER_DIE_TYPE_NONE, PlayerDieType.PLAYER_DIE_TYPE_KILL_BY_MONSTER, PlayerDieType.PLAYER_DIE_TYPE_KILL_BY_GEAR, PlayerDieType.PLAYER_DIE_TYPE_FALL, PlayerDieType.PLAYER_DIE_TYPE_DRAWN, PlayerDieType.PLAYER_DIE_TYPE_ABYSS, PlayerDieType.PLAYER_DIE_TYPE_GM, PlayerDieType.PLAYER_DIE_TYPE_CLIMATE_COLD, PlayerDieType.PLAYER_DIE_TYPE_STORM_LIGHTING, PlayerDieType.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<PlayerDieType>() {
                @Override
                public PlayerDieType findValueByNumber(final int number) {
                    return PlayerDieType.forNumber(number);
                }
            };

        }
    }
}
