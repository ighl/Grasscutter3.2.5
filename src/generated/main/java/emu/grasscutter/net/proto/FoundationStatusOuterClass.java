// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class FoundationStatusOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private FoundationStatusOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return FoundationStatusOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016FoundationStatus.proto*\u0087\u0001\n\u0010FoundationStatus\u0012\u001a\n\u0016FOUNDATION_STATUS_NONE\u0010\u0000\u0012\u001a\n\u0016FOUNDATION_STATUS_INIT\u0010\u0001\u0012\u001e\n\u001aFOUNDATION_STATUS_BUILDING\u0010\u0002\u0012\u001b\n\u0017FOUNDATION_STATUS_BUILT\u0010\u0003B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        FoundationStatusOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum FoundationStatus implements ProtocolMessageEnum
    {
        FOUNDATION_STATUS_NONE(0), 
        FOUNDATION_STATUS_INIT(1), 
        FOUNDATION_STATUS_BUILDING(2), 
        FOUNDATION_STATUS_BUILT(3), 
        UNRECOGNIZED(-1);
        
        public static final int FOUNDATION_STATUS_NONE_VALUE = 0;
        public static final int FOUNDATION_STATUS_INIT_VALUE = 1;
        public static final int FOUNDATION_STATUS_BUILDING_VALUE = 2;
        public static final int FOUNDATION_STATUS_BUILT_VALUE = 3;
        private static final Internal.EnumLiteMap<FoundationStatus> internalValueMap;
        private static final FoundationStatus[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == FoundationStatus.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static FoundationStatus valueOf(final int value) {
            return forNumber(value);
        }
        
        public static FoundationStatus forNumber(final int value) {
            switch (value) {
                case 0: {
                    return FoundationStatus.FOUNDATION_STATUS_NONE;
                }
                case 1: {
                    return FoundationStatus.FOUNDATION_STATUS_INIT;
                }
                case 2: {
                    return FoundationStatus.FOUNDATION_STATUS_BUILDING;
                }
                case 3: {
                    return FoundationStatus.FOUNDATION_STATUS_BUILT;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<FoundationStatus> internalGetValueMap() {
            return FoundationStatus.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == FoundationStatus.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return FoundationStatusOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static FoundationStatus valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return FoundationStatus.UNRECOGNIZED;
            }
            return FoundationStatus.VALUES[desc.getIndex()];
        }
        
        private FoundationStatus(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ FoundationStatus[] value() {
            return new FoundationStatus[] { FoundationStatus.FOUNDATION_STATUS_NONE, FoundationStatus.FOUNDATION_STATUS_INIT, FoundationStatus.FOUNDATION_STATUS_BUILDING, FoundationStatus.FOUNDATION_STATUS_BUILT, FoundationStatus.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<FoundationStatus>() {
                @Override
                public FoundationStatus findValueByNumber(final int number) {
                    return FoundationStatus.forNumber(number);
                }
            };

        }
    }
}
