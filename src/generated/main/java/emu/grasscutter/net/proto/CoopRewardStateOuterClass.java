// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class CoopRewardStateOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private CoopRewardStateOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CoopRewardStateOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015CoopRewardState.proto*2\n\u000fCoopRewardState\u0012\n\n\u0006Unlock\u0010\u0000\u0012\b\n\u0004Lock\u0010\u0001\u0012\t\n\u0005Taken\u0010\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CoopRewardStateOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum CoopRewardState implements ProtocolMessageEnum
    {
        Unlock(0), 
        Lock(1), 
        Taken(2), 
        UNRECOGNIZED(-1);
        
        public static final int Unlock_VALUE = 0;
        public static final int Lock_VALUE = 1;
        public static final int Taken_VALUE = 2;
        private static final Internal.EnumLiteMap<CoopRewardState> internalValueMap;
        private static final CoopRewardState[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == CoopRewardState.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static CoopRewardState valueOf(final int value) {
            return forNumber(value);
        }
        
        public static CoopRewardState forNumber(final int value) {
            switch (value) {
                case 0: {
                    return CoopRewardState.Unlock;
                }
                case 1: {
                    return CoopRewardState.Lock;
                }
                case 2: {
                    return CoopRewardState.Taken;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<CoopRewardState> internalGetValueMap() {
            return CoopRewardState.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == CoopRewardState.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return CoopRewardStateOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static CoopRewardState valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return CoopRewardState.UNRECOGNIZED;
            }
            return CoopRewardState.VALUES[desc.getIndex()];
        }
        
        private CoopRewardState(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ CoopRewardState[] value() {
            return new CoopRewardState[] { CoopRewardState.Unlock, CoopRewardState.Lock, CoopRewardState.Taken, CoopRewardState.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<CoopRewardState>() {
                @Override
                public CoopRewardState findValueByNumber(final int number) {
                    return CoopRewardState.forNumber(number);
                }
            };

        }
    }
}
