// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class ForgeQueueManipulateTypeOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private ForgeQueueManipulateTypeOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ForgeQueueManipulateTypeOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001eForgeQueueManipulateType.proto*v\n\u0018ForgeQueueManipulateType\u0012.\n*FORGE_QUEUE_MANIPULATE_TYPE_RECEIVE_OUTPUT\u0010\u0000\u0012*\n&FORGE_QUEUE_MANIPULATE_TYPE_STOP_FORGE\u0010\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ForgeQueueManipulateTypeOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum ForgeQueueManipulateType implements ProtocolMessageEnum
    {
        FORGE_QUEUE_MANIPULATE_TYPE_RECEIVE_OUTPUT(0), 
        FORGE_QUEUE_MANIPULATE_TYPE_STOP_FORGE(1), 
        UNRECOGNIZED(-1);
        
        public static final int FORGE_QUEUE_MANIPULATE_TYPE_RECEIVE_OUTPUT_VALUE = 0;
        public static final int FORGE_QUEUE_MANIPULATE_TYPE_STOP_FORGE_VALUE = 1;
        private static final Internal.EnumLiteMap<ForgeQueueManipulateType> internalValueMap;
        private static final ForgeQueueManipulateType[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == ForgeQueueManipulateType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static ForgeQueueManipulateType valueOf(final int value) {
            return forNumber(value);
        }
        
        public static ForgeQueueManipulateType forNumber(final int value) {
            switch (value) {
                case 0: {
                    return ForgeQueueManipulateType.FORGE_QUEUE_MANIPULATE_TYPE_RECEIVE_OUTPUT;
                }
                case 1: {
                    return ForgeQueueManipulateType.FORGE_QUEUE_MANIPULATE_TYPE_STOP_FORGE;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<ForgeQueueManipulateType> internalGetValueMap() {
            return ForgeQueueManipulateType.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == ForgeQueueManipulateType.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return ForgeQueueManipulateTypeOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static ForgeQueueManipulateType valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return ForgeQueueManipulateType.UNRECOGNIZED;
            }
            return ForgeQueueManipulateType.VALUES[desc.getIndex()];
        }
        
        private ForgeQueueManipulateType(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ ForgeQueueManipulateType[] value() {
            return new ForgeQueueManipulateType[] { ForgeQueueManipulateType.FORGE_QUEUE_MANIPULATE_TYPE_RECEIVE_OUTPUT, ForgeQueueManipulateType.FORGE_QUEUE_MANIPULATE_TYPE_STOP_FORGE, ForgeQueueManipulateType.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<ForgeQueueManipulateType>() {
                @Override
                public ForgeQueueManipulateType findValueByNumber(final int number) {
                    return ForgeQueueManipulateType.forNumber(number);
                }
            };

        }
    }
}
