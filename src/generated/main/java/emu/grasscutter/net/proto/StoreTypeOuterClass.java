// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class StoreTypeOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private StoreTypeOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return StoreTypeOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u000fStoreType.proto*K\n\tStoreType\u0012\u0013\n\u000fSTORE_TYPE_NONE\u0010\u0000\u0012\u0013\n\u000fSTORE_TYPE_PACK\u0010\u0001\u0012\u0014\n\u0010STORE_TYPE_DEPOT\u0010\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        StoreTypeOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum StoreType implements ProtocolMessageEnum
    {
        STORE_TYPE_NONE(0), 
        STORE_TYPE_PACK(1), 
        STORE_TYPE_DEPOT(2), 
        UNRECOGNIZED(-1);
        
        public static final int STORE_TYPE_NONE_VALUE = 0;
        public static final int STORE_TYPE_PACK_VALUE = 1;
        public static final int STORE_TYPE_DEPOT_VALUE = 2;
        private static final Internal.EnumLiteMap<StoreType> internalValueMap;
        private static final StoreType[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == StoreType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static StoreType valueOf(final int value) {
            return forNumber(value);
        }
        
        public static StoreType forNumber(final int value) {
            switch (value) {
                case 0: {
                    return StoreType.STORE_TYPE_NONE;
                }
                case 1: {
                    return StoreType.STORE_TYPE_PACK;
                }
                case 2: {
                    return StoreType.STORE_TYPE_DEPOT;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<StoreType> internalGetValueMap() {
            return StoreType.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == StoreType.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return StoreTypeOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static StoreType valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return StoreType.UNRECOGNIZED;
            }
            return StoreType.VALUES[desc.getIndex()];
        }
        
        private StoreType(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ StoreType[] value() {
            return new StoreType[] { StoreType.STORE_TYPE_NONE, StoreType.STORE_TYPE_PACK, StoreType.STORE_TYPE_DEPOT, StoreType.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<StoreType>() {
                @Override
                public StoreType findValueByNumber(final int number) {
                    return StoreType.forNumber(number);
                }
            };

        }
    }
}
