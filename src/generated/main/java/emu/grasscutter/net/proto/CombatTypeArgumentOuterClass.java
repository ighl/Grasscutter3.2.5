// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class CombatTypeArgumentOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private CombatTypeArgumentOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CombatTypeArgumentOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018CombatTypeArgument.proto*\u00c5\u0006\n\u0012CombatTypeArgument\u0012\u001d\n\u0019COMBAT_TYPE_ARGUMENT_NONE\u0010\u0000\u0012&\n\"COMBAT_TYPE_ARGUMENT_EVT_BEING_HIT\u0010\u0001\u0012/\n+COMBAT_TYPE_ARGUMENT_ANIMATOR_STATE_CHANGED\u0010\u0002\u0012$\n COMBAT_TYPE_ARGUMENT_FACE_TO_DIR\u0010\u0003\u0012*\n&COMBAT_TYPE_ARGUMENT_SET_ATTACK_TARGET\u0010\u0004\u0012\"\n\u001eCOMBAT_TYPE_ARGUMENT_RUSH_MOVE\u0010\u0005\u00123\n/COMBAT_TYPE_ARGUMENT_ANIMATOR_PARAMETER_CHANGED\u0010\u0006\u0012$\n COMBAT_TYPE_ARGUMENT_ENTITY_MOVE\u0010\u0007\u0012-\n)COMBAT_TYPE_ARGUMENT_SYNC_ENTITY_POSITION\u0010\b\u0012*\n&COMBAT_TYPE_ARGUMENT_STEER_MOTION_INFO\u0010\t\u0012+\n'COMBAT_TYPE_ARGUMENT_FORCE_SET_POS_INFO\u0010\n\u0012,\n(COMBAT_TYPE_ARGUMENT_COMPENSATE_POS_DIFF\u0010\u000b\u0012)\n%COMBAT_TYPE_ARGUMENT_MONSTER_DO_BLINK\u0010\f\u0012(\n$COMBAT_TYPE_ARGUMENT_FIXED_RUSH_MOVE\u0010\r\u0012'\n#COMBAT_TYPE_ARGUMENT_SYNC_TRANSFORM\u0010\u000e\u0012(\n$COMBAT_TYPE_ARGUMENT_LIGHT_CORE_MOVE\u0010\u000f\u0012,\n(COMBAT_TYPE_ARGUMENT_Unk2700_KPDNFKCMKPG\u0010\u0010\u0012,\n(COMBAT_TYPE_ARGUMENT_Unk2700_KPLOMOIALGF\u0010\u0011\u0012,\n(COMBAT_TYPE_ARGUMENT_Unk3000_BJEHMPLCFHN\u0010\u0012B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CombatTypeArgumentOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum CombatTypeArgument implements ProtocolMessageEnum
    {
        COMBAT_TYPE_ARGUMENT_NONE(0), 
        COMBAT_TYPE_ARGUMENT_EVT_BEING_HIT(1), 
        COMBAT_TYPE_ARGUMENT_ANIMATOR_STATE_CHANGED(2), 
        COMBAT_TYPE_ARGUMENT_FACE_TO_DIR(3), 
        COMBAT_TYPE_ARGUMENT_SET_ATTACK_TARGET(4), 
        COMBAT_TYPE_ARGUMENT_RUSH_MOVE(5), 
        COMBAT_TYPE_ARGUMENT_ANIMATOR_PARAMETER_CHANGED(6), 
        COMBAT_TYPE_ARGUMENT_ENTITY_MOVE(7), 
        COMBAT_TYPE_ARGUMENT_SYNC_ENTITY_POSITION(8), 
        COMBAT_TYPE_ARGUMENT_STEER_MOTION_INFO(9), 
        COMBAT_TYPE_ARGUMENT_FORCE_SET_POS_INFO(10), 
        COMBAT_TYPE_ARGUMENT_COMPENSATE_POS_DIFF(11), 
        COMBAT_TYPE_ARGUMENT_MONSTER_DO_BLINK(12), 
        COMBAT_TYPE_ARGUMENT_FIXED_RUSH_MOVE(13), 
        COMBAT_TYPE_ARGUMENT_SYNC_TRANSFORM(14), 
        COMBAT_TYPE_ARGUMENT_LIGHT_CORE_MOVE(15), 
        COMBAT_TYPE_ARGUMENT_Unk2700_KPDNFKCMKPG(16), 
        COMBAT_TYPE_ARGUMENT_Unk2700_KPLOMOIALGF(17), 
        COMBAT_TYPE_ARGUMENT_Unk3000_BJEHMPLCFHN(18), 
        UNRECOGNIZED(-1);
        
        public static final int COMBAT_TYPE_ARGUMENT_NONE_VALUE = 0;
        public static final int COMBAT_TYPE_ARGUMENT_EVT_BEING_HIT_VALUE = 1;
        public static final int COMBAT_TYPE_ARGUMENT_ANIMATOR_STATE_CHANGED_VALUE = 2;
        public static final int COMBAT_TYPE_ARGUMENT_FACE_TO_DIR_VALUE = 3;
        public static final int COMBAT_TYPE_ARGUMENT_SET_ATTACK_TARGET_VALUE = 4;
        public static final int COMBAT_TYPE_ARGUMENT_RUSH_MOVE_VALUE = 5;
        public static final int COMBAT_TYPE_ARGUMENT_ANIMATOR_PARAMETER_CHANGED_VALUE = 6;
        public static final int COMBAT_TYPE_ARGUMENT_ENTITY_MOVE_VALUE = 7;
        public static final int COMBAT_TYPE_ARGUMENT_SYNC_ENTITY_POSITION_VALUE = 8;
        public static final int COMBAT_TYPE_ARGUMENT_STEER_MOTION_INFO_VALUE = 9;
        public static final int COMBAT_TYPE_ARGUMENT_FORCE_SET_POS_INFO_VALUE = 10;
        public static final int COMBAT_TYPE_ARGUMENT_COMPENSATE_POS_DIFF_VALUE = 11;
        public static final int COMBAT_TYPE_ARGUMENT_MONSTER_DO_BLINK_VALUE = 12;
        public static final int COMBAT_TYPE_ARGUMENT_FIXED_RUSH_MOVE_VALUE = 13;
        public static final int COMBAT_TYPE_ARGUMENT_SYNC_TRANSFORM_VALUE = 14;
        public static final int COMBAT_TYPE_ARGUMENT_LIGHT_CORE_MOVE_VALUE = 15;
        public static final int COMBAT_TYPE_ARGUMENT_Unk2700_KPDNFKCMKPG_VALUE = 16;
        public static final int COMBAT_TYPE_ARGUMENT_Unk2700_KPLOMOIALGF_VALUE = 17;
        public static final int COMBAT_TYPE_ARGUMENT_Unk3000_BJEHMPLCFHN_VALUE = 18;
        private static final Internal.EnumLiteMap<CombatTypeArgument> internalValueMap;
        private static final CombatTypeArgument[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == CombatTypeArgument.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static CombatTypeArgument valueOf(final int value) {
            return forNumber(value);
        }
        
        public static CombatTypeArgument forNumber(final int value) {
            switch (value) {
                case 0: {
                    return CombatTypeArgument.COMBAT_TYPE_ARGUMENT_NONE;
                }
                case 1: {
                    return CombatTypeArgument.COMBAT_TYPE_ARGUMENT_EVT_BEING_HIT;
                }
                case 2: {
                    return CombatTypeArgument.COMBAT_TYPE_ARGUMENT_ANIMATOR_STATE_CHANGED;
                }
                case 3: {
                    return CombatTypeArgument.COMBAT_TYPE_ARGUMENT_FACE_TO_DIR;
                }
                case 4: {
                    return CombatTypeArgument.COMBAT_TYPE_ARGUMENT_SET_ATTACK_TARGET;
                }
                case 5: {
                    return CombatTypeArgument.COMBAT_TYPE_ARGUMENT_RUSH_MOVE;
                }
                case 6: {
                    return CombatTypeArgument.COMBAT_TYPE_ARGUMENT_ANIMATOR_PARAMETER_CHANGED;
                }
                case 7: {
                    return CombatTypeArgument.COMBAT_TYPE_ARGUMENT_ENTITY_MOVE;
                }
                case 8: {
                    return CombatTypeArgument.COMBAT_TYPE_ARGUMENT_SYNC_ENTITY_POSITION;
                }
                case 9: {
                    return CombatTypeArgument.COMBAT_TYPE_ARGUMENT_STEER_MOTION_INFO;
                }
                case 10: {
                    return CombatTypeArgument.COMBAT_TYPE_ARGUMENT_FORCE_SET_POS_INFO;
                }
                case 11: {
                    return CombatTypeArgument.COMBAT_TYPE_ARGUMENT_COMPENSATE_POS_DIFF;
                }
                case 12: {
                    return CombatTypeArgument.COMBAT_TYPE_ARGUMENT_MONSTER_DO_BLINK;
                }
                case 13: {
                    return CombatTypeArgument.COMBAT_TYPE_ARGUMENT_FIXED_RUSH_MOVE;
                }
                case 14: {
                    return CombatTypeArgument.COMBAT_TYPE_ARGUMENT_SYNC_TRANSFORM;
                }
                case 15: {
                    return CombatTypeArgument.COMBAT_TYPE_ARGUMENT_LIGHT_CORE_MOVE;
                }
                case 16: {
                    return CombatTypeArgument.COMBAT_TYPE_ARGUMENT_Unk2700_KPDNFKCMKPG;
                }
                case 17: {
                    return CombatTypeArgument.COMBAT_TYPE_ARGUMENT_Unk2700_KPLOMOIALGF;
                }
                case 18: {
                    return CombatTypeArgument.COMBAT_TYPE_ARGUMENT_Unk3000_BJEHMPLCFHN;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<CombatTypeArgument> internalGetValueMap() {
            return CombatTypeArgument.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == CombatTypeArgument.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return CombatTypeArgumentOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static CombatTypeArgument valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return CombatTypeArgument.UNRECOGNIZED;
            }
            return CombatTypeArgument.VALUES[desc.getIndex()];
        }
        
        private CombatTypeArgument(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ CombatTypeArgument[] value() {
            return new CombatTypeArgument[] { CombatTypeArgument.COMBAT_TYPE_ARGUMENT_NONE, CombatTypeArgument.COMBAT_TYPE_ARGUMENT_EVT_BEING_HIT, CombatTypeArgument.COMBAT_TYPE_ARGUMENT_ANIMATOR_STATE_CHANGED, CombatTypeArgument.COMBAT_TYPE_ARGUMENT_FACE_TO_DIR, CombatTypeArgument.COMBAT_TYPE_ARGUMENT_SET_ATTACK_TARGET, CombatTypeArgument.COMBAT_TYPE_ARGUMENT_RUSH_MOVE, CombatTypeArgument.COMBAT_TYPE_ARGUMENT_ANIMATOR_PARAMETER_CHANGED, CombatTypeArgument.COMBAT_TYPE_ARGUMENT_ENTITY_MOVE, CombatTypeArgument.COMBAT_TYPE_ARGUMENT_SYNC_ENTITY_POSITION, CombatTypeArgument.COMBAT_TYPE_ARGUMENT_STEER_MOTION_INFO, CombatTypeArgument.COMBAT_TYPE_ARGUMENT_FORCE_SET_POS_INFO, CombatTypeArgument.COMBAT_TYPE_ARGUMENT_COMPENSATE_POS_DIFF, CombatTypeArgument.COMBAT_TYPE_ARGUMENT_MONSTER_DO_BLINK, CombatTypeArgument.COMBAT_TYPE_ARGUMENT_FIXED_RUSH_MOVE, CombatTypeArgument.COMBAT_TYPE_ARGUMENT_SYNC_TRANSFORM, CombatTypeArgument.COMBAT_TYPE_ARGUMENT_LIGHT_CORE_MOVE, CombatTypeArgument.COMBAT_TYPE_ARGUMENT_Unk2700_KPDNFKCMKPG, CombatTypeArgument.COMBAT_TYPE_ARGUMENT_Unk2700_KPLOMOIALGF, CombatTypeArgument.COMBAT_TYPE_ARGUMENT_Unk3000_BJEHMPLCFHN, CombatTypeArgument.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<CombatTypeArgument>() {
                @Override
                public CombatTypeArgument findValueByNumber(final int number) {
                    return CombatTypeArgument.forNumber(number);
                }
            };

        }
    }
}
