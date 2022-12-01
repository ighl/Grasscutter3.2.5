// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class CoopChapterStateOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private CoopChapterStateOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CoopChapterStateOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016CoopChapterState.proto*H\n\u0010CoopChapterState\u0012\t\n\u0005Close\u0010\u0000\u0012\u000f\n\u000bCondNotMeet\u0010\u0001\u0012\f\n\bCondMeet\u0010\u0002\u0012\n\n\u0006Accept\u0010\u0003B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CoopChapterStateOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum CoopChapterState implements ProtocolMessageEnum
    {
        Close(0), 
        CondNotMeet(1), 
        CondMeet(2), 
        Accept(3), 
        UNRECOGNIZED(-1);
        
        public static final int Close_VALUE = 0;
        public static final int CondNotMeet_VALUE = 1;
        public static final int CondMeet_VALUE = 2;
        public static final int Accept_VALUE = 3;
        private static final Internal.EnumLiteMap<CoopChapterState> internalValueMap;
        private static final CoopChapterState[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == CoopChapterState.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static CoopChapterState valueOf(final int value) {
            return forNumber(value);
        }
        
        public static CoopChapterState forNumber(final int value) {
            switch (value) {
                case 0: {
                    return CoopChapterState.Close;
                }
                case 1: {
                    return CoopChapterState.CondNotMeet;
                }
                case 2: {
                    return CoopChapterState.CondMeet;
                }
                case 3: {
                    return CoopChapterState.Accept;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<CoopChapterState> internalGetValueMap() {
            return CoopChapterState.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == CoopChapterState.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return CoopChapterStateOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static CoopChapterState valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return CoopChapterState.UNRECOGNIZED;
            }
            return CoopChapterState.VALUES[desc.getIndex()];
        }
        
        private CoopChapterState(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ CoopChapterState[] value() {
            return new CoopChapterState[] { CoopChapterState.Close, CoopChapterState.CondNotMeet, CoopChapterState.CondMeet, CoopChapterState.Accept, CoopChapterState.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<CoopChapterState>() {
                @Override
                public CoopChapterState findValueByNumber(final int number) {
                    return CoopChapterState.forNumber(number);
                }
            };

        }
    }
}
