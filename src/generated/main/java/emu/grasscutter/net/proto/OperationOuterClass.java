// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class OperationOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private OperationOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return OperationOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u000fOperation.proto*/\n\tOperation\u0012\u0007\n\u0003Add\u0010\u0000\u0012\u0007\n\u0003Mod\u0010\u0001\u0012\u0007\n\u0003Del\u0010\u0002\u0012\u0007\n\u0003Get\u0010\u0003B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        OperationOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum Operation implements ProtocolMessageEnum
    {
        Add(0), 
        Mod(1), 
        Del(2), 
        Get(3), 
        UNRECOGNIZED(-1);
        
        public static final int Add_VALUE = 0;
        public static final int Mod_VALUE = 1;
        public static final int Del_VALUE = 2;
        public static final int Get_VALUE = 3;
        private static final Internal.EnumLiteMap<Operation> internalValueMap;
        private static final Operation[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == Operation.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static Operation valueOf(final int value) {
            return forNumber(value);
        }
        
        public static Operation forNumber(final int value) {
            switch (value) {
                case 0: {
                    return Operation.Add;
                }
                case 1: {
                    return Operation.Mod;
                }
                case 2: {
                    return Operation.Del;
                }
                case 3: {
                    return Operation.Get;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<Operation> internalGetValueMap() {
            return Operation.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == Operation.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return OperationOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static Operation valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return Operation.UNRECOGNIZED;
            }
            return Operation.VALUES[desc.getIndex()];
        }
        
        private Operation(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ Operation[] value() {
            return new Operation[] { Operation.Add, Operation.Mod, Operation.Del, Operation.Get, Operation.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<Operation>() {
                @Override
                public Operation findValueByNumber(final int number) {
                    return Operation.forNumber(number);
                }
            };

        }
    }
}
