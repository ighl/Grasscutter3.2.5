// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class MarkNewTypeOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private MarkNewTypeOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MarkNewTypeOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0011MarkNewType.proto*0\n\u000bMarkNewType\u0012\t\n\u0005_NONE\u0010\u0000\u0012\u000b\n\u0007COMBINE\u0010\u0001\u0012\t\n\u0005FORGE\u0010\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MarkNewTypeOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum MarkNewType implements ProtocolMessageEnum
    {
        _NONE(0), 
        COMBINE(1), 
        FORGE(2), 
        UNRECOGNIZED(-1);
        
        public static final int _NONE_VALUE = 0;
        public static final int COMBINE_VALUE = 1;
        public static final int FORGE_VALUE = 2;
        private static final Internal.EnumLiteMap<MarkNewType> internalValueMap;
        private static final MarkNewType[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == MarkNewType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static MarkNewType valueOf(final int value) {
            return forNumber(value);
        }
        
        public static MarkNewType forNumber(final int value) {
            switch (value) {
                case 0: {
                    return MarkNewType._NONE;
                }
                case 1: {
                    return MarkNewType.COMBINE;
                }
                case 2: {
                    return MarkNewType.FORGE;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<MarkNewType> internalGetValueMap() {
            return MarkNewType.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == MarkNewType.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return MarkNewTypeOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static MarkNewType valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return MarkNewType.UNRECOGNIZED;
            }
            return MarkNewType.VALUES[desc.getIndex()];
        }
        
        private MarkNewType(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ MarkNewType[] value() {
            return new MarkNewType[] { MarkNewType._NONE, MarkNewType.COMBINE, MarkNewType.FORGE, MarkNewType.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<MarkNewType>() {
                @Override
                public MarkNewType findValueByNumber(final int number) {
                    return MarkNewType.forNumber(number);
                }
            };

        }
    }
}
