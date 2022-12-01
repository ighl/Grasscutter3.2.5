// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class AvatarExpeditionStateOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private AvatarExpeditionStateOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AvatarExpeditionStateOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bAvatarExpeditionState.proto*\u00e2\u0001\n\u0015AvatarExpeditionState\u0012 \n\u001cAVATAR_EXPEDITION_STATE_NONE\u0010\u0000\u0012!\n\u001dAVATAR_EXPEDITION_STATE_DOING\u0010\u0001\u0012.\n*AVATAR_EXPEDITION_STATE_FINISH_WAIT_REWARD\u0010\u0002\u00120\n,AVATAR_EXPEDITION_STATE_CALLBACK_WAIT_REWARD\u0010\u0003\u0012\"\n\u001eAVATAR_EXPEDITION_STATE_LOCKED\u0010\u0004B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AvatarExpeditionStateOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum AvatarExpeditionState implements ProtocolMessageEnum
    {
        AVATAR_EXPEDITION_STATE_NONE(0), 
        AVATAR_EXPEDITION_STATE_DOING(1), 
        AVATAR_EXPEDITION_STATE_FINISH_WAIT_REWARD(2), 
        AVATAR_EXPEDITION_STATE_CALLBACK_WAIT_REWARD(3), 
        AVATAR_EXPEDITION_STATE_LOCKED(4), 
        UNRECOGNIZED(-1);
        
        public static final int AVATAR_EXPEDITION_STATE_NONE_VALUE = 0;
        public static final int AVATAR_EXPEDITION_STATE_DOING_VALUE = 1;
        public static final int AVATAR_EXPEDITION_STATE_FINISH_WAIT_REWARD_VALUE = 2;
        public static final int AVATAR_EXPEDITION_STATE_CALLBACK_WAIT_REWARD_VALUE = 3;
        public static final int AVATAR_EXPEDITION_STATE_LOCKED_VALUE = 4;
        private static final Internal.EnumLiteMap<AvatarExpeditionState> internalValueMap;
        private static final AvatarExpeditionState[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == AvatarExpeditionState.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static AvatarExpeditionState valueOf(final int value) {
            return forNumber(value);
        }
        
        public static AvatarExpeditionState forNumber(final int value) {
            switch (value) {
                case 0: {
                    return AvatarExpeditionState.AVATAR_EXPEDITION_STATE_NONE;
                }
                case 1: {
                    return AvatarExpeditionState.AVATAR_EXPEDITION_STATE_DOING;
                }
                case 2: {
                    return AvatarExpeditionState.AVATAR_EXPEDITION_STATE_FINISH_WAIT_REWARD;
                }
                case 3: {
                    return AvatarExpeditionState.AVATAR_EXPEDITION_STATE_CALLBACK_WAIT_REWARD;
                }
                case 4: {
                    return AvatarExpeditionState.AVATAR_EXPEDITION_STATE_LOCKED;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<AvatarExpeditionState> internalGetValueMap() {
            return AvatarExpeditionState.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == AvatarExpeditionState.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return AvatarExpeditionStateOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static AvatarExpeditionState valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return AvatarExpeditionState.UNRECOGNIZED;
            }
            return AvatarExpeditionState.VALUES[desc.getIndex()];
        }
        
        private AvatarExpeditionState(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ AvatarExpeditionState[] value() {
            return new AvatarExpeditionState[] { AvatarExpeditionState.AVATAR_EXPEDITION_STATE_NONE, AvatarExpeditionState.AVATAR_EXPEDITION_STATE_DOING, AvatarExpeditionState.AVATAR_EXPEDITION_STATE_FINISH_WAIT_REWARD, AvatarExpeditionState.AVATAR_EXPEDITION_STATE_CALLBACK_WAIT_REWARD, AvatarExpeditionState.AVATAR_EXPEDITION_STATE_LOCKED, AvatarExpeditionState.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<AvatarExpeditionState>() {
                @Override
                public AvatarExpeditionState findValueByNumber(final int number) {
                    return AvatarExpeditionState.forNumber(number);
                }
            };

        }
    }
}
