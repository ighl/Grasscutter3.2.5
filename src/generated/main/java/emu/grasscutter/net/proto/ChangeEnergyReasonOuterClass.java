// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class ChangeEnergyReasonOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private ChangeEnergyReasonOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ChangeEnergyReasonOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018ChangeEnergyReason.proto*Y\n\u0012ChangeEnergyReason\u0012\u001d\n\u0019CHANGE_ENERGY_REASON_NONE\u0010\u0000\u0012$\n CHANGE_ENERGY_REASON_SKILL_START\u0010\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ChangeEnergyReasonOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum ChangeEnergyReason implements ProtocolMessageEnum
    {
        CHANGE_ENERGY_REASON_NONE(0), 
        CHANGE_ENERGY_REASON_SKILL_START(1), 
        UNRECOGNIZED(-1);
        
        public static final int CHANGE_ENERGY_REASON_NONE_VALUE = 0;
        public static final int CHANGE_ENERGY_REASON_SKILL_START_VALUE = 1;
        private static final Internal.EnumLiteMap<ChangeEnergyReason> internalValueMap;
        private static final ChangeEnergyReason[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == ChangeEnergyReason.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static ChangeEnergyReason valueOf(final int value) {
            return forNumber(value);
        }
        
        public static ChangeEnergyReason forNumber(final int value) {
            switch (value) {
                case 0: {
                    return ChangeEnergyReason.CHANGE_ENERGY_REASON_NONE;
                }
                case 1: {
                    return ChangeEnergyReason.CHANGE_ENERGY_REASON_SKILL_START;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<ChangeEnergyReason> internalGetValueMap() {
            return ChangeEnergyReason.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == ChangeEnergyReason.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return ChangeEnergyReasonOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static ChangeEnergyReason valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return ChangeEnergyReason.UNRECOGNIZED;
            }
            return ChangeEnergyReason.VALUES[desc.getIndex()];
        }
        
        private ChangeEnergyReason(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ ChangeEnergyReason[] value() {
            return new ChangeEnergyReason[] { ChangeEnergyReason.CHANGE_ENERGY_REASON_NONE, ChangeEnergyReason.CHANGE_ENERGY_REASON_SKILL_START, ChangeEnergyReason.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<ChangeEnergyReason>() {
                @Override
                public ChangeEnergyReason findValueByNumber(final int number) {
                    return ChangeEnergyReason.forNumber(number);
                }
            };

        }
    }
}
