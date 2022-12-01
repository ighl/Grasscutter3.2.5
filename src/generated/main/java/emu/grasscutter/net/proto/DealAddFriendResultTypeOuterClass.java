// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class DealAddFriendResultTypeOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private DealAddFriendResultTypeOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return DealAddFriendResultTypeOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001dDealAddFriendResultType.proto*i\n\u0017DealAddFriendResultType\u0012&\n\"DEAL_ADD_FRIEND_RESULT_TYPE_REJECT\u0010\u0000\u0012&\n\"DEAL_ADD_FRIEND_RESULT_TYPE_ACCEPT\u0010\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        DealAddFriendResultTypeOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum DealAddFriendResultType implements ProtocolMessageEnum
    {
        DEAL_ADD_FRIEND_RESULT_TYPE_REJECT(0), 
        DEAL_ADD_FRIEND_RESULT_TYPE_ACCEPT(1), 
        UNRECOGNIZED(-1);
        
        public static final int DEAL_ADD_FRIEND_RESULT_TYPE_REJECT_VALUE = 0;
        public static final int DEAL_ADD_FRIEND_RESULT_TYPE_ACCEPT_VALUE = 1;
        private static final Internal.EnumLiteMap<DealAddFriendResultType> internalValueMap;
        private static final DealAddFriendResultType[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == DealAddFriendResultType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static DealAddFriendResultType valueOf(final int value) {
            return forNumber(value);
        }
        
        public static DealAddFriendResultType forNumber(final int value) {
            switch (value) {
                case 0: {
                    return DealAddFriendResultType.DEAL_ADD_FRIEND_RESULT_TYPE_REJECT;
                }
                case 1: {
                    return DealAddFriendResultType.DEAL_ADD_FRIEND_RESULT_TYPE_ACCEPT;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<DealAddFriendResultType> internalGetValueMap() {
            return DealAddFriendResultType.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == DealAddFriendResultType.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return DealAddFriendResultTypeOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static DealAddFriendResultType valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return DealAddFriendResultType.UNRECOGNIZED;
            }
            return DealAddFriendResultType.VALUES[desc.getIndex()];
        }
        
        private DealAddFriendResultType(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ DealAddFriendResultType[] value() {
            return new DealAddFriendResultType[] { DealAddFriendResultType.DEAL_ADD_FRIEND_RESULT_TYPE_REJECT, DealAddFriendResultType.DEAL_ADD_FRIEND_RESULT_TYPE_ACCEPT, DealAddFriendResultType.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<DealAddFriendResultType>() {
                @Override
                public DealAddFriendResultType findValueByNumber(final int number) {
                    return DealAddFriendResultType.forNumber(number);
                }
            };

        }
    }
}
