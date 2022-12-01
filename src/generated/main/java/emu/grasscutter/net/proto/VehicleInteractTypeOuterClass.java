// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class VehicleInteractTypeOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private VehicleInteractTypeOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return VehicleInteractTypeOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019VehicleInteractType.proto*r\n\u0013VehicleInteractType\u0012\u001e\n\u001aVEHICLE_INTERACT_TYPE_NONE\u0010\u0000\u0012\u001c\n\u0018VEHICLE_INTERACT_TYPE_IN\u0010\u0001\u0012\u001d\n\u0019VEHICLE_INTERACT_TYPE_OUT\u0010\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        VehicleInteractTypeOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum VehicleInteractType implements ProtocolMessageEnum
    {
        VEHICLE_INTERACT_TYPE_NONE(0), 
        VEHICLE_INTERACT_TYPE_IN(1), 
        VEHICLE_INTERACT_TYPE_OUT(2), 
        UNRECOGNIZED(-1);
        
        public static final int VEHICLE_INTERACT_TYPE_NONE_VALUE = 0;
        public static final int VEHICLE_INTERACT_TYPE_IN_VALUE = 1;
        public static final int VEHICLE_INTERACT_TYPE_OUT_VALUE = 2;
        private static final Internal.EnumLiteMap<VehicleInteractType> internalValueMap;
        private static final VehicleInteractType[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == VehicleInteractType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static VehicleInteractType valueOf(final int value) {
            return forNumber(value);
        }
        
        public static VehicleInteractType forNumber(final int value) {
            switch (value) {
                case 0: {
                    return VehicleInteractType.VEHICLE_INTERACT_TYPE_NONE;
                }
                case 1: {
                    return VehicleInteractType.VEHICLE_INTERACT_TYPE_IN;
                }
                case 2: {
                    return VehicleInteractType.VEHICLE_INTERACT_TYPE_OUT;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<VehicleInteractType> internalGetValueMap() {
            return VehicleInteractType.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == VehicleInteractType.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return VehicleInteractTypeOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static VehicleInteractType valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return VehicleInteractType.UNRECOGNIZED;
            }
            return VehicleInteractType.VALUES[desc.getIndex()];
        }
        
        private VehicleInteractType(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ VehicleInteractType[] value() {
            return new VehicleInteractType[] { VehicleInteractType.VEHICLE_INTERACT_TYPE_NONE, VehicleInteractType.VEHICLE_INTERACT_TYPE_IN, VehicleInteractType.VEHICLE_INTERACT_TYPE_OUT, VehicleInteractType.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<VehicleInteractType>() {
                @Override
                public VehicleInteractType findValueByNumber(final int number) {
                    return VehicleInteractType.forNumber(number);
                }
            };

        }
    }
}
