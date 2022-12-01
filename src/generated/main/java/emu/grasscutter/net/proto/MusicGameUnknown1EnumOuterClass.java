// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class MusicGameUnknown1EnumOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private MusicGameUnknown1EnumOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MusicGameUnknown1EnumOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bMusicGameUnknown1Enum.proto*U\n\u0015MusicGameUnknown1Enum\u0012\u001e\n\u001aMusicGameUnknown1Enum_NONE\u0010\u0000\u0012\u001c\n\u0018MusicGameUnknown1Enum_u2\u0010\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MusicGameUnknown1EnumOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum MusicGameUnknown1Enum implements ProtocolMessageEnum
    {
        MusicGameUnknown1Enum_NONE(0), 
        MusicGameUnknown1Enum_u2(1), 
        UNRECOGNIZED(-1);
        
        public static final int MusicGameUnknown1Enum_NONE_VALUE = 0;
        public static final int MusicGameUnknown1Enum_u2_VALUE = 1;
        private static final Internal.EnumLiteMap<MusicGameUnknown1Enum> internalValueMap;
        private static final MusicGameUnknown1Enum[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == MusicGameUnknown1Enum.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static MusicGameUnknown1Enum valueOf(final int value) {
            return forNumber(value);
        }
        
        public static MusicGameUnknown1Enum forNumber(final int value) {
            switch (value) {
                case 0: {
                    return MusicGameUnknown1Enum.MusicGameUnknown1Enum_NONE;
                }
                case 1: {
                    return MusicGameUnknown1Enum.MusicGameUnknown1Enum_u2;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<MusicGameUnknown1Enum> internalGetValueMap() {
            return MusicGameUnknown1Enum.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == MusicGameUnknown1Enum.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return MusicGameUnknown1EnumOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static MusicGameUnknown1Enum valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return MusicGameUnknown1Enum.UNRECOGNIZED;
            }
            return MusicGameUnknown1Enum.VALUES[desc.getIndex()];
        }
        
        private MusicGameUnknown1Enum(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ MusicGameUnknown1Enum[] value() {
            return new MusicGameUnknown1Enum[] { MusicGameUnknown1Enum.MusicGameUnknown1Enum_NONE, MusicGameUnknown1Enum.MusicGameUnknown1Enum_u2, MusicGameUnknown1Enum.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<MusicGameUnknown1Enum>() {
                @Override
                public MusicGameUnknown1Enum findValueByNumber(final int number) {
                    return MusicGameUnknown1Enum.forNumber(number);
                }
            };

        }
    }
}
