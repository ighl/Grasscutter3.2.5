// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class ChangeHpReasonOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private ChangeHpReasonOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ChangeHpReasonOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0014ChangeHpReason.proto*¬\b\n\u000eChangeHpReason\u0012\u0019\n\u0015CHANGE_HP_REASON_NONE\u0010\u0000\u0012\u001f\n\u001bCHANGE_HP_REASON_SUB_AVATAR\u0010\u0001\u0012 \n\u001cCHANGE_HP_REASON_SUB_MONSTER\u0010\u0002\u0012\u001d\n\u0019CHANGE_HP_REASON_SUB_GEAR\u0010\u0003\u0012\u001e\n\u001aCHANGE_HP_REASON_SUB_ENVIR\u0010\u0004\u0012\u001d\n\u0019CHANGE_HP_REASON_SUB_FALL\u0010\u0005\u0012\u001e\n\u001aCHANGE_HP_REASON_SUB_DRAWN\u0010\u0006\u0012\u001e\n\u001aCHANGE_HP_REASON_SUB_ABYSS\u0010\u0007\u0012 \n\u001cCHANGE_HP_REASON_SUB_ABILITY\u0010\b\u0012\u001f\n\u001bCHANGE_HP_REASON_SUB_SUMMON\u0010\t\u0012\u001f\n\u001bCHANGE_HP_REASON_SUB_SCRIPT\u0010\n\u0012\u001b\n\u0017CHANGE_HP_REASON_SUB_GM\u0010\u000b\u0012\"\n\u001eCHANGE_HP_REASON_SUB_KILL_SELF\u0010\f\u0012%\n!CHANGE_HP_REASON_SUB_CLIMATE_COLD\u0010\r\u0012(\n$CHANGE_HP_REASON_SUB_STORM_LIGHTNING\u0010\u000e\u0012+\n'CHANGE_HP_REASON_SUB_KILL_SERVER_GADGET\u0010\u000f\u0012 \n\u001cCHANGE_HP_REASON_SUB_REPLACE\u0010\u0010\u0012%\n!CHANGE_HP_REASON_SUB_PLAYER_LEAVE\u0010\u0011\u0012(\n$CHANGE_HP_REASON_Unk2700_CIKCDBOJGDK\u0010\u0012\u0012(\n$CHANGE_HP_REASON_Unk2700_HEKLBLFBJJK\u0010\u0013\u0012\u001b\n\u0017CHANGE_HP_REASON_BY_LUA\u00103\u0012 \n\u001cCHANGE_HP_REASON_ADD_ABILITY\u0010e\u0012\u001d\n\u0019CHANGE_HP_REASON_ADD_ITEM\u0010f\u0012\u001f\n\u001bCHANGE_HP_REASON_ADD_REVIVE\u0010g\u0012 \n\u001cCHANGE_HP_REASON_ADD_UPGRADE\u0010h\u0012\u001f\n\u001bCHANGE_HP_REASON_ADD_STATUE\u0010i\u0012#\n\u001fCHANGE_HP_REASON_ADD_BACKGROUND\u0010j\u0012\u001b\n\u0017CHANGE_HP_REASON_ADD_GM\u0010k\u0012.\n*CHANGE_HP_REASON_ADD_TRIAL_AVATAR_ACTIVITY\u0010l\u0012*\n&CHANGE_HP_REASON_ADD_ROUGUELIKE_SPRING\u0010mB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ChangeHpReasonOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum ChangeHpReason implements ProtocolMessageEnum
    {
        CHANGE_HP_REASON_NONE(0), 
        CHANGE_HP_REASON_SUB_AVATAR(1), 
        CHANGE_HP_REASON_SUB_MONSTER(2), 
        CHANGE_HP_REASON_SUB_GEAR(3), 
        CHANGE_HP_REASON_SUB_ENVIR(4), 
        CHANGE_HP_REASON_SUB_FALL(5), 
        CHANGE_HP_REASON_SUB_DRAWN(6), 
        CHANGE_HP_REASON_SUB_ABYSS(7), 
        CHANGE_HP_REASON_SUB_ABILITY(8), 
        CHANGE_HP_REASON_SUB_SUMMON(9), 
        CHANGE_HP_REASON_SUB_SCRIPT(10), 
        CHANGE_HP_REASON_SUB_GM(11), 
        CHANGE_HP_REASON_SUB_KILL_SELF(12), 
        CHANGE_HP_REASON_SUB_CLIMATE_COLD(13), 
        CHANGE_HP_REASON_SUB_STORM_LIGHTNING(14), 
        CHANGE_HP_REASON_SUB_KILL_SERVER_GADGET(15), 
        CHANGE_HP_REASON_SUB_REPLACE(16), 
        CHANGE_HP_REASON_SUB_PLAYER_LEAVE(17), 
        CHANGE_HP_REASON_Unk2700_CIKCDBOJGDK(18), 
        CHANGE_HP_REASON_Unk2700_HEKLBLFBJJK(19), 
        CHANGE_HP_REASON_BY_LUA(51), 
        CHANGE_HP_REASON_ADD_ABILITY(101), 
        CHANGE_HP_REASON_ADD_ITEM(102), 
        CHANGE_HP_REASON_ADD_REVIVE(103), 
        CHANGE_HP_REASON_ADD_UPGRADE(104), 
        CHANGE_HP_REASON_ADD_STATUE(105), 
        CHANGE_HP_REASON_ADD_BACKGROUND(106), 
        CHANGE_HP_REASON_ADD_GM(107), 
        CHANGE_HP_REASON_ADD_TRIAL_AVATAR_ACTIVITY(108), 
        CHANGE_HP_REASON_ADD_ROUGUELIKE_SPRING(109), 
        UNRECOGNIZED(-1);
        
        public static final int CHANGE_HP_REASON_NONE_VALUE = 0;
        public static final int CHANGE_HP_REASON_SUB_AVATAR_VALUE = 1;
        public static final int CHANGE_HP_REASON_SUB_MONSTER_VALUE = 2;
        public static final int CHANGE_HP_REASON_SUB_GEAR_VALUE = 3;
        public static final int CHANGE_HP_REASON_SUB_ENVIR_VALUE = 4;
        public static final int CHANGE_HP_REASON_SUB_FALL_VALUE = 5;
        public static final int CHANGE_HP_REASON_SUB_DRAWN_VALUE = 6;
        public static final int CHANGE_HP_REASON_SUB_ABYSS_VALUE = 7;
        public static final int CHANGE_HP_REASON_SUB_ABILITY_VALUE = 8;
        public static final int CHANGE_HP_REASON_SUB_SUMMON_VALUE = 9;
        public static final int CHANGE_HP_REASON_SUB_SCRIPT_VALUE = 10;
        public static final int CHANGE_HP_REASON_SUB_GM_VALUE = 11;
        public static final int CHANGE_HP_REASON_SUB_KILL_SELF_VALUE = 12;
        public static final int CHANGE_HP_REASON_SUB_CLIMATE_COLD_VALUE = 13;
        public static final int CHANGE_HP_REASON_SUB_STORM_LIGHTNING_VALUE = 14;
        public static final int CHANGE_HP_REASON_SUB_KILL_SERVER_GADGET_VALUE = 15;
        public static final int CHANGE_HP_REASON_SUB_REPLACE_VALUE = 16;
        public static final int CHANGE_HP_REASON_SUB_PLAYER_LEAVE_VALUE = 17;
        public static final int CHANGE_HP_REASON_Unk2700_CIKCDBOJGDK_VALUE = 18;
        public static final int CHANGE_HP_REASON_Unk2700_HEKLBLFBJJK_VALUE = 19;
        public static final int CHANGE_HP_REASON_BY_LUA_VALUE = 51;
        public static final int CHANGE_HP_REASON_ADD_ABILITY_VALUE = 101;
        public static final int CHANGE_HP_REASON_ADD_ITEM_VALUE = 102;
        public static final int CHANGE_HP_REASON_ADD_REVIVE_VALUE = 103;
        public static final int CHANGE_HP_REASON_ADD_UPGRADE_VALUE = 104;
        public static final int CHANGE_HP_REASON_ADD_STATUE_VALUE = 105;
        public static final int CHANGE_HP_REASON_ADD_BACKGROUND_VALUE = 106;
        public static final int CHANGE_HP_REASON_ADD_GM_VALUE = 107;
        public static final int CHANGE_HP_REASON_ADD_TRIAL_AVATAR_ACTIVITY_VALUE = 108;
        public static final int CHANGE_HP_REASON_ADD_ROUGUELIKE_SPRING_VALUE = 109;
        private static final Internal.EnumLiteMap<ChangeHpReason> internalValueMap;
        private static final ChangeHpReason[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == ChangeHpReason.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static ChangeHpReason valueOf(final int value) {
            return forNumber(value);
        }
        
        public static ChangeHpReason forNumber(final int value) {
            switch (value) {
                case 0: {
                    return ChangeHpReason.CHANGE_HP_REASON_NONE;
                }
                case 1: {
                    return ChangeHpReason.CHANGE_HP_REASON_SUB_AVATAR;
                }
                case 2: {
                    return ChangeHpReason.CHANGE_HP_REASON_SUB_MONSTER;
                }
                case 3: {
                    return ChangeHpReason.CHANGE_HP_REASON_SUB_GEAR;
                }
                case 4: {
                    return ChangeHpReason.CHANGE_HP_REASON_SUB_ENVIR;
                }
                case 5: {
                    return ChangeHpReason.CHANGE_HP_REASON_SUB_FALL;
                }
                case 6: {
                    return ChangeHpReason.CHANGE_HP_REASON_SUB_DRAWN;
                }
                case 7: {
                    return ChangeHpReason.CHANGE_HP_REASON_SUB_ABYSS;
                }
                case 8: {
                    return ChangeHpReason.CHANGE_HP_REASON_SUB_ABILITY;
                }
                case 9: {
                    return ChangeHpReason.CHANGE_HP_REASON_SUB_SUMMON;
                }
                case 10: {
                    return ChangeHpReason.CHANGE_HP_REASON_SUB_SCRIPT;
                }
                case 11: {
                    return ChangeHpReason.CHANGE_HP_REASON_SUB_GM;
                }
                case 12: {
                    return ChangeHpReason.CHANGE_HP_REASON_SUB_KILL_SELF;
                }
                case 13: {
                    return ChangeHpReason.CHANGE_HP_REASON_SUB_CLIMATE_COLD;
                }
                case 14: {
                    return ChangeHpReason.CHANGE_HP_REASON_SUB_STORM_LIGHTNING;
                }
                case 15: {
                    return ChangeHpReason.CHANGE_HP_REASON_SUB_KILL_SERVER_GADGET;
                }
                case 16: {
                    return ChangeHpReason.CHANGE_HP_REASON_SUB_REPLACE;
                }
                case 17: {
                    return ChangeHpReason.CHANGE_HP_REASON_SUB_PLAYER_LEAVE;
                }
                case 18: {
                    return ChangeHpReason.CHANGE_HP_REASON_Unk2700_CIKCDBOJGDK;
                }
                case 19: {
                    return ChangeHpReason.CHANGE_HP_REASON_Unk2700_HEKLBLFBJJK;
                }
                case 51: {
                    return ChangeHpReason.CHANGE_HP_REASON_BY_LUA;
                }
                case 101: {
                    return ChangeHpReason.CHANGE_HP_REASON_ADD_ABILITY;
                }
                case 102: {
                    return ChangeHpReason.CHANGE_HP_REASON_ADD_ITEM;
                }
                case 103: {
                    return ChangeHpReason.CHANGE_HP_REASON_ADD_REVIVE;
                }
                case 104: {
                    return ChangeHpReason.CHANGE_HP_REASON_ADD_UPGRADE;
                }
                case 105: {
                    return ChangeHpReason.CHANGE_HP_REASON_ADD_STATUE;
                }
                case 106: {
                    return ChangeHpReason.CHANGE_HP_REASON_ADD_BACKGROUND;
                }
                case 107: {
                    return ChangeHpReason.CHANGE_HP_REASON_ADD_GM;
                }
                case 108: {
                    return ChangeHpReason.CHANGE_HP_REASON_ADD_TRIAL_AVATAR_ACTIVITY;
                }
                case 109: {
                    return ChangeHpReason.CHANGE_HP_REASON_ADD_ROUGUELIKE_SPRING;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<ChangeHpReason> internalGetValueMap() {
            return ChangeHpReason.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == ChangeHpReason.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return ChangeHpReasonOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static ChangeHpReason valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return ChangeHpReason.UNRECOGNIZED;
            }
            return ChangeHpReason.VALUES[desc.getIndex()];
        }
        
        private ChangeHpReason(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ ChangeHpReason[] value() {
            return new ChangeHpReason[] { ChangeHpReason.CHANGE_HP_REASON_NONE, ChangeHpReason.CHANGE_HP_REASON_SUB_AVATAR, ChangeHpReason.CHANGE_HP_REASON_SUB_MONSTER, ChangeHpReason.CHANGE_HP_REASON_SUB_GEAR, ChangeHpReason.CHANGE_HP_REASON_SUB_ENVIR, ChangeHpReason.CHANGE_HP_REASON_SUB_FALL, ChangeHpReason.CHANGE_HP_REASON_SUB_DRAWN, ChangeHpReason.CHANGE_HP_REASON_SUB_ABYSS, ChangeHpReason.CHANGE_HP_REASON_SUB_ABILITY, ChangeHpReason.CHANGE_HP_REASON_SUB_SUMMON, ChangeHpReason.CHANGE_HP_REASON_SUB_SCRIPT, ChangeHpReason.CHANGE_HP_REASON_SUB_GM, ChangeHpReason.CHANGE_HP_REASON_SUB_KILL_SELF, ChangeHpReason.CHANGE_HP_REASON_SUB_CLIMATE_COLD, ChangeHpReason.CHANGE_HP_REASON_SUB_STORM_LIGHTNING, ChangeHpReason.CHANGE_HP_REASON_SUB_KILL_SERVER_GADGET, ChangeHpReason.CHANGE_HP_REASON_SUB_REPLACE, ChangeHpReason.CHANGE_HP_REASON_SUB_PLAYER_LEAVE, ChangeHpReason.CHANGE_HP_REASON_Unk2700_CIKCDBOJGDK, ChangeHpReason.CHANGE_HP_REASON_Unk2700_HEKLBLFBJJK, ChangeHpReason.CHANGE_HP_REASON_BY_LUA, ChangeHpReason.CHANGE_HP_REASON_ADD_ABILITY, ChangeHpReason.CHANGE_HP_REASON_ADD_ITEM, ChangeHpReason.CHANGE_HP_REASON_ADD_REVIVE, ChangeHpReason.CHANGE_HP_REASON_ADD_UPGRADE, ChangeHpReason.CHANGE_HP_REASON_ADD_STATUE, ChangeHpReason.CHANGE_HP_REASON_ADD_BACKGROUND, ChangeHpReason.CHANGE_HP_REASON_ADD_GM, ChangeHpReason.CHANGE_HP_REASON_ADD_TRIAL_AVATAR_ACTIVITY, ChangeHpReason.CHANGE_HP_REASON_ADD_ROUGUELIKE_SPRING, ChangeHpReason.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<ChangeHpReason>() {
                @Override
                public ChangeHpReason findValueByNumber(final int number) {
                    return ChangeHpReason.forNumber(number);
                }
            };

        }
    }
}
