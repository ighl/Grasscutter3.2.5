// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class CoopPointStateOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private CoopPointStateOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CoopPointStateOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0014CoopPointState.proto*:\n\u000eCoopPointState\u0012\r\n\tUnstarted\u0010\u0000\u0012\u000b\n\u0007Started\u0010\u0001\u0012\f\n\bFinished\u0010\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CoopPointStateOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum CoopPointState implements ProtocolMessageEnum
    {
        Unstarted(0), 
        Started(1), 
        Finished(2), 
        UNRECOGNIZED(-1);
        
        public static final int Unstarted_VALUE = 0;
        public static final int Started_VALUE = 1;
        public static final int Finished_VALUE = 2;
        private static final Internal.EnumLiteMap<CoopPointState> internalValueMap;
        private static final CoopPointState[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == CoopPointState.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static CoopPointState valueOf(final int value) {
            return forNumber(value);
        }
        
        public static CoopPointState forNumber(final int value) {
            switch (value) {
                case 0: {
                    return CoopPointState.Unstarted;
                }
                case 1: {
                    return CoopPointState.Started;
                }
                case 2: {
                    return CoopPointState.Finished;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<CoopPointState> internalGetValueMap() {
            return CoopPointState.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == CoopPointState.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return CoopPointStateOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static CoopPointState valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return CoopPointState.UNRECOGNIZED;
            }
            return CoopPointState.VALUES[desc.getIndex()];
        }
        
        private CoopPointState(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ CoopPointState[] value() {
            return new CoopPointState[] { CoopPointState.Unstarted, CoopPointState.Started, CoopPointState.Finished, CoopPointState.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<CoopPointState>() {
                @Override
                public CoopPointState findValueByNumber(final int number) {
                    return CoopPointState.forNumber(number);
                }
            };

        }
    }
}
