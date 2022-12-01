// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class FriendEnterHomeOptionOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private FriendEnterHomeOptionOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return FriendEnterHomeOptionOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bFriendEnterHomeOption.proto*\u008c\u0001\n\u0015FriendEnterHomeOption\u0012)\n%FRIEND_ENTER_HOME_OPTION_NEED_CONFIRM\u0010\u0000\u0012#\n\u001fFRIEND_ENTER_HOME_OPTION_REFUSE\u0010\u0001\u0012#\n\u001fFRIEND_ENTER_HOME_OPTION_DIRECT\u0010\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        FriendEnterHomeOptionOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum FriendEnterHomeOption implements ProtocolMessageEnum
    {
        FRIEND_ENTER_HOME_OPTION_NEED_CONFIRM(0), 
        FRIEND_ENTER_HOME_OPTION_REFUSE(1), 
        FRIEND_ENTER_HOME_OPTION_DIRECT(2), 
        UNRECOGNIZED(-1);
        
        public static final int FRIEND_ENTER_HOME_OPTION_NEED_CONFIRM_VALUE = 0;
        public static final int FRIEND_ENTER_HOME_OPTION_REFUSE_VALUE = 1;
        public static final int FRIEND_ENTER_HOME_OPTION_DIRECT_VALUE = 2;
        private static final Internal.EnumLiteMap<FriendEnterHomeOption> internalValueMap;
        private static final FriendEnterHomeOption[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == FriendEnterHomeOption.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static FriendEnterHomeOption valueOf(final int value) {
            return forNumber(value);
        }
        
        public static FriendEnterHomeOption forNumber(final int value) {
            switch (value) {
                case 0: {
                    return FriendEnterHomeOption.FRIEND_ENTER_HOME_OPTION_NEED_CONFIRM;
                }
                case 1: {
                    return FriendEnterHomeOption.FRIEND_ENTER_HOME_OPTION_REFUSE;
                }
                case 2: {
                    return FriendEnterHomeOption.FRIEND_ENTER_HOME_OPTION_DIRECT;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<FriendEnterHomeOption> internalGetValueMap() {
            return FriendEnterHomeOption.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == FriendEnterHomeOption.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return FriendEnterHomeOptionOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static FriendEnterHomeOption valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return FriendEnterHomeOption.UNRECOGNIZED;
            }
            return FriendEnterHomeOption.VALUES[desc.getIndex()];
        }
        
        private FriendEnterHomeOption(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ FriendEnterHomeOption[] value() {
            return new FriendEnterHomeOption[] { FriendEnterHomeOption.FRIEND_ENTER_HOME_OPTION_NEED_CONFIRM, FriendEnterHomeOption.FRIEND_ENTER_HOME_OPTION_REFUSE, FriendEnterHomeOption.FRIEND_ENTER_HOME_OPTION_DIRECT, FriendEnterHomeOption.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<FriendEnterHomeOption>() {
                @Override
                public FriendEnterHomeOption findValueByNumber(final int number) {
                    return FriendEnterHomeOption.forNumber(number);
                }
            };

        }
    }
}
