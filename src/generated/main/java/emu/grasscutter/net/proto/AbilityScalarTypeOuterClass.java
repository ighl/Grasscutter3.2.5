// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class AbilityScalarTypeOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private AbilityScalarTypeOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AbilityScalarTypeOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017AbilityScalarType.proto*\u00ec\u0001\n\u0011AbilityScalarType\u0012\u001e\n\u001aABILITY_SCALAR_TYPE_UNKNOW\u0010\u0000\u0012\u001d\n\u0019ABILITY_SCALAR_TYPE_FLOAT\u0010\u0001\u0012\u001b\n\u0017ABILITY_SCALAR_TYPE_INT\u0010\u0002\u0012\u001c\n\u0018ABILITY_SCALAR_TYPE_BOOL\u0010\u0003\u0012\u001f\n\u001bABILITY_SCALAR_TYPE_TRIGGER\u0010\u0004\u0012\u001e\n\u001aABILITY_SCALAR_TYPE_STRING\u0010\u0005\u0012\u001c\n\u0018ABILITY_SCALAR_TYPE_UINT\u0010\u0006B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AbilityScalarTypeOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum AbilityScalarType implements ProtocolMessageEnum
    {
        ABILITY_SCALAR_TYPE_UNKNOW(0), 
        ABILITY_SCALAR_TYPE_FLOAT(1), 
        ABILITY_SCALAR_TYPE_INT(2), 
        ABILITY_SCALAR_TYPE_BOOL(3), 
        ABILITY_SCALAR_TYPE_TRIGGER(4), 
        ABILITY_SCALAR_TYPE_STRING(5), 
        ABILITY_SCALAR_TYPE_UINT(6), 
        UNRECOGNIZED(-1);
        
        public static final int ABILITY_SCALAR_TYPE_UNKNOW_VALUE = 0;
        public static final int ABILITY_SCALAR_TYPE_FLOAT_VALUE = 1;
        public static final int ABILITY_SCALAR_TYPE_INT_VALUE = 2;
        public static final int ABILITY_SCALAR_TYPE_BOOL_VALUE = 3;
        public static final int ABILITY_SCALAR_TYPE_TRIGGER_VALUE = 4;
        public static final int ABILITY_SCALAR_TYPE_STRING_VALUE = 5;
        public static final int ABILITY_SCALAR_TYPE_UINT_VALUE = 6;
        private static final Internal.EnumLiteMap<AbilityScalarType> internalValueMap;
        private static final AbilityScalarType[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == AbilityScalarType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static AbilityScalarType valueOf(final int value) {
            return forNumber(value);
        }
        
        public static AbilityScalarType forNumber(final int value) {
            switch (value) {
                case 0: {
                    return AbilityScalarType.ABILITY_SCALAR_TYPE_UNKNOW;
                }
                case 1: {
                    return AbilityScalarType.ABILITY_SCALAR_TYPE_FLOAT;
                }
                case 2: {
                    return AbilityScalarType.ABILITY_SCALAR_TYPE_INT;
                }
                case 3: {
                    return AbilityScalarType.ABILITY_SCALAR_TYPE_BOOL;
                }
                case 4: {
                    return AbilityScalarType.ABILITY_SCALAR_TYPE_TRIGGER;
                }
                case 5: {
                    return AbilityScalarType.ABILITY_SCALAR_TYPE_STRING;
                }
                case 6: {
                    return AbilityScalarType.ABILITY_SCALAR_TYPE_UINT;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<AbilityScalarType> internalGetValueMap() {
            return AbilityScalarType.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == AbilityScalarType.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return AbilityScalarTypeOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static AbilityScalarType valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return AbilityScalarType.UNRECOGNIZED;
            }
            return AbilityScalarType.VALUES[desc.getIndex()];
        }
        
        private AbilityScalarType(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ AbilityScalarType[] value() {
            return new AbilityScalarType[] { AbilityScalarType.ABILITY_SCALAR_TYPE_UNKNOW, AbilityScalarType.ABILITY_SCALAR_TYPE_FLOAT, AbilityScalarType.ABILITY_SCALAR_TYPE_INT, AbilityScalarType.ABILITY_SCALAR_TYPE_BOOL, AbilityScalarType.ABILITY_SCALAR_TYPE_TRIGGER, AbilityScalarType.ABILITY_SCALAR_TYPE_STRING, AbilityScalarType.ABILITY_SCALAR_TYPE_UINT, AbilityScalarType.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<AbilityScalarType>() {
                @Override
                public AbilityScalarType findValueByNumber(final int number) {
                    return AbilityScalarType.forNumber(number);
                }
            };

        }
    }
}
