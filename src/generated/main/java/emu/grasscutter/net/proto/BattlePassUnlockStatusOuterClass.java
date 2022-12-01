// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class BattlePassUnlockStatusOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private BattlePassUnlockStatusOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return BattlePassUnlockStatusOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cBattlePassUnlockStatus.proto*\u0087\u0001\n\u0016BattlePassUnlockStatus\u0012%\n!BATTLE_PASS_UNLOCK_STATUS_INVALID\u0010\u0000\u0012\"\n\u001eBATTLE_PASS_UNLOCK_STATUS_FREE\u0010\u0001\u0012\"\n\u001eBATTLE_PASS_UNLOCK_STATUS_PAID\u0010\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        BattlePassUnlockStatusOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum BattlePassUnlockStatus implements ProtocolMessageEnum
    {
        BATTLE_PASS_UNLOCK_STATUS_INVALID(0), 
        BATTLE_PASS_UNLOCK_STATUS_FREE(1), 
        BATTLE_PASS_UNLOCK_STATUS_PAID(2), 
        UNRECOGNIZED(-1);
        
        public static final int BATTLE_PASS_UNLOCK_STATUS_INVALID_VALUE = 0;
        public static final int BATTLE_PASS_UNLOCK_STATUS_FREE_VALUE = 1;
        public static final int BATTLE_PASS_UNLOCK_STATUS_PAID_VALUE = 2;
        private static final Internal.EnumLiteMap<BattlePassUnlockStatus> internalValueMap;
        private static final BattlePassUnlockStatus[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == BattlePassUnlockStatus.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static BattlePassUnlockStatus valueOf(final int value) {
            return forNumber(value);
        }
        
        public static BattlePassUnlockStatus forNumber(final int value) {
            switch (value) {
                case 0: {
                    return BattlePassUnlockStatus.BATTLE_PASS_UNLOCK_STATUS_INVALID;
                }
                case 1: {
                    return BattlePassUnlockStatus.BATTLE_PASS_UNLOCK_STATUS_FREE;
                }
                case 2: {
                    return BattlePassUnlockStatus.BATTLE_PASS_UNLOCK_STATUS_PAID;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<BattlePassUnlockStatus> internalGetValueMap() {
            return BattlePassUnlockStatus.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == BattlePassUnlockStatus.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return BattlePassUnlockStatusOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static BattlePassUnlockStatus valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return BattlePassUnlockStatus.UNRECOGNIZED;
            }
            return BattlePassUnlockStatus.VALUES[desc.getIndex()];
        }
        
        private BattlePassUnlockStatus(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ BattlePassUnlockStatus[] value() {
            return new BattlePassUnlockStatus[] { BattlePassUnlockStatus.BATTLE_PASS_UNLOCK_STATUS_INVALID, BattlePassUnlockStatus.BATTLE_PASS_UNLOCK_STATUS_FREE, BattlePassUnlockStatus.BATTLE_PASS_UNLOCK_STATUS_PAID, BattlePassUnlockStatus.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<BattlePassUnlockStatus>() {
                @Override
                public BattlePassUnlockStatus findValueByNumber(final int number) {
                    return BattlePassUnlockStatus.forNumber(number);
                }
            };

        }
    }
}
