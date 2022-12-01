// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class ForwardTypeOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private ForwardTypeOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ForwardTypeOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0011ForwardType.proto*\u0098\u0002\n\u000bForwardType\u0012\u0016\n\u0012FORWARD_TYPE_LOCAL\u0010\u0000\u0012\u0017\n\u0013FORWARD_TYPE_TO_ALL\u0010\u0001\u0012\"\n\u001eFORWARD_TYPE_TO_ALL_EXCEPT_CUR\u0010\u0002\u0012\u0018\n\u0014FORWARD_TYPE_TO_HOST\u0010\u0003\u0012\u001d\n\u0019FORWARD_TYPE_TO_ALL_GUEST\u0010\u0004\u0012\u0018\n\u0014FORWARD_TYPE_TO_PEER\u0010\u0005\u0012\u0019\n\u0015FORWARD_TYPE_TO_PEERS\u0010\u0006\u0012\u001c\n\u0018FORWARD_TYPE_ONLY_SERVER\u0010\u0007\u0012(\n$FORWARD_TYPE_TO_ALL_EXIST_EXCEPT_CUR\u0010\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ForwardTypeOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum ForwardType implements ProtocolMessageEnum
    {
        FORWARD_TYPE_LOCAL(0), 
        FORWARD_TYPE_TO_ALL(1), 
        FORWARD_TYPE_TO_ALL_EXCEPT_CUR(2), 
        FORWARD_TYPE_TO_HOST(3), 
        FORWARD_TYPE_TO_ALL_GUEST(4), 
        FORWARD_TYPE_TO_PEER(5), 
        FORWARD_TYPE_TO_PEERS(6), 
        FORWARD_TYPE_ONLY_SERVER(7), 
        FORWARD_TYPE_TO_ALL_EXIST_EXCEPT_CUR(8), 
        UNRECOGNIZED(-1);
        
        public static final int FORWARD_TYPE_LOCAL_VALUE = 0;
        public static final int FORWARD_TYPE_TO_ALL_VALUE = 1;
        public static final int FORWARD_TYPE_TO_ALL_EXCEPT_CUR_VALUE = 2;
        public static final int FORWARD_TYPE_TO_HOST_VALUE = 3;
        public static final int FORWARD_TYPE_TO_ALL_GUEST_VALUE = 4;
        public static final int FORWARD_TYPE_TO_PEER_VALUE = 5;
        public static final int FORWARD_TYPE_TO_PEERS_VALUE = 6;
        public static final int FORWARD_TYPE_ONLY_SERVER_VALUE = 7;
        public static final int FORWARD_TYPE_TO_ALL_EXIST_EXCEPT_CUR_VALUE = 8;
        private static final Internal.EnumLiteMap<ForwardType> internalValueMap;
        private static final ForwardType[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == ForwardType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static ForwardType valueOf(final int value) {
            return forNumber(value);
        }
        
        public static ForwardType forNumber(final int value) {
            switch (value) {
                case 0: {
                    return ForwardType.FORWARD_TYPE_LOCAL;
                }
                case 1: {
                    return ForwardType.FORWARD_TYPE_TO_ALL;
                }
                case 2: {
                    return ForwardType.FORWARD_TYPE_TO_ALL_EXCEPT_CUR;
                }
                case 3: {
                    return ForwardType.FORWARD_TYPE_TO_HOST;
                }
                case 4: {
                    return ForwardType.FORWARD_TYPE_TO_ALL_GUEST;
                }
                case 5: {
                    return ForwardType.FORWARD_TYPE_TO_PEER;
                }
                case 6: {
                    return ForwardType.FORWARD_TYPE_TO_PEERS;
                }
                case 7: {
                    return ForwardType.FORWARD_TYPE_ONLY_SERVER;
                }
                case 8: {
                    return ForwardType.FORWARD_TYPE_TO_ALL_EXIST_EXCEPT_CUR;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<ForwardType> internalGetValueMap() {
            return ForwardType.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == ForwardType.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return ForwardTypeOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static ForwardType valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return ForwardType.UNRECOGNIZED;
            }
            return ForwardType.VALUES[desc.getIndex()];
        }
        
        private ForwardType(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ ForwardType[] value() {
            return new ForwardType[] { ForwardType.FORWARD_TYPE_LOCAL, ForwardType.FORWARD_TYPE_TO_ALL, ForwardType.FORWARD_TYPE_TO_ALL_EXCEPT_CUR, ForwardType.FORWARD_TYPE_TO_HOST, ForwardType.FORWARD_TYPE_TO_ALL_GUEST, ForwardType.FORWARD_TYPE_TO_PEER, ForwardType.FORWARD_TYPE_TO_PEERS, ForwardType.FORWARD_TYPE_ONLY_SERVER, ForwardType.FORWARD_TYPE_TO_ALL_EXIST_EXCEPT_CUR, ForwardType.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<ForwardType>() {
                @Override
                public ForwardType findValueByNumber(final int number) {
                    return ForwardType.forNumber(number);
                }
            };

        }
    }
}
