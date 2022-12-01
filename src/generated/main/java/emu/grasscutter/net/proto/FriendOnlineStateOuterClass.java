// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class FriendOnlineStateOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private FriendOnlineStateOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return FriendOnlineStateOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017FriendOnlineState.proto*_\n\u0011FriendOnlineState\u0012*\n&FRIEND_ONLINE_STATE_FREIEND_DISCONNECT\u0010\u0000\u0012\u001e\n\u001aFRIEND_ONLINE_STATE_ONLINE\u0010\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        FriendOnlineStateOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum FriendOnlineState implements ProtocolMessageEnum
    {
        FRIEND_ONLINE_STATE_FREIEND_DISCONNECT(0), 
        FRIEND_ONLINE_STATE_ONLINE(1), 
        UNRECOGNIZED(-1);
        
        public static final int FRIEND_ONLINE_STATE_FREIEND_DISCONNECT_VALUE = 0;
        public static final int FRIEND_ONLINE_STATE_ONLINE_VALUE = 1;
        private static final Internal.EnumLiteMap<FriendOnlineState> internalValueMap;
        private static final FriendOnlineState[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == FriendOnlineState.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static FriendOnlineState valueOf(final int value) {
            return forNumber(value);
        }
        
        public static FriendOnlineState forNumber(final int value) {
            switch (value) {
                case 0: {
                    return FriendOnlineState.FRIEND_ONLINE_STATE_FREIEND_DISCONNECT;
                }
                case 1: {
                    return FriendOnlineState.FRIEND_ONLINE_STATE_ONLINE;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<FriendOnlineState> internalGetValueMap() {
            return FriendOnlineState.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == FriendOnlineState.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return FriendOnlineStateOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static FriendOnlineState valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return FriendOnlineState.UNRECOGNIZED;
            }
            return FriendOnlineState.VALUES[desc.getIndex()];
        }
        
        private FriendOnlineState(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ FriendOnlineState[] value() {
            return new FriendOnlineState[] { FriendOnlineState.FRIEND_ONLINE_STATE_FREIEND_DISCONNECT, FriendOnlineState.FRIEND_ONLINE_STATE_ONLINE, FriendOnlineState.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<FriendOnlineState>() {
                @Override
                public FriendOnlineState findValueByNumber(final int number) {
                    return FriendOnlineState.forNumber(number);
                }
            };

        }
    }
}
