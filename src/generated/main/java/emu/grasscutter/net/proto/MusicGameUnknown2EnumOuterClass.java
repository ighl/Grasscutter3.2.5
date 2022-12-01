// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class MusicGameUnknown2EnumOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private MusicGameUnknown2EnumOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MusicGameUnknown2EnumOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bMusicGameUnknown2Enum.proto*s\n\u0015MusicGameUnknown2Enum\u0012\u001c\n\u0018MusicGameUnknown2Enum_u1\u0010\u0000\u0012\u001e\n\u001aMusicGameUnknown2Enum_MINE\u0010\u0001\u0012\u001c\n\u0018MusicGameUnknown2Enum_u3\u0010\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MusicGameUnknown2EnumOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum MusicGameUnknown2Enum implements ProtocolMessageEnum
    {
        MusicGameUnknown2Enum_u1(0), 
        MusicGameUnknown2Enum_MINE(1), 
        MusicGameUnknown2Enum_u3(2), 
        UNRECOGNIZED(-1);
        
        public static final int MusicGameUnknown2Enum_u1_VALUE = 0;
        public static final int MusicGameUnknown2Enum_MINE_VALUE = 1;
        public static final int MusicGameUnknown2Enum_u3_VALUE = 2;
        private static final Internal.EnumLiteMap<MusicGameUnknown2Enum> internalValueMap;
        private static final MusicGameUnknown2Enum[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == MusicGameUnknown2Enum.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static MusicGameUnknown2Enum valueOf(final int value) {
            return forNumber(value);
        }
        
        public static MusicGameUnknown2Enum forNumber(final int value) {
            switch (value) {
                case 0: {
                    return MusicGameUnknown2Enum.MusicGameUnknown2Enum_u1;
                }
                case 1: {
                    return MusicGameUnknown2Enum.MusicGameUnknown2Enum_MINE;
                }
                case 2: {
                    return MusicGameUnknown2Enum.MusicGameUnknown2Enum_u3;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<MusicGameUnknown2Enum> internalGetValueMap() {
            return MusicGameUnknown2Enum.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == MusicGameUnknown2Enum.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return MusicGameUnknown2EnumOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static MusicGameUnknown2Enum valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return MusicGameUnknown2Enum.UNRECOGNIZED;
            }
            return MusicGameUnknown2Enum.VALUES[desc.getIndex()];
        }
        
        private MusicGameUnknown2Enum(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ MusicGameUnknown2Enum[] value() {
            return new MusicGameUnknown2Enum[] { MusicGameUnknown2Enum.MusicGameUnknown2Enum_u1, MusicGameUnknown2Enum.MusicGameUnknown2Enum_MINE, MusicGameUnknown2Enum.MusicGameUnknown2Enum_u3, MusicGameUnknown2Enum.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<MusicGameUnknown2Enum>() {
                @Override
                public MusicGameUnknown2Enum findValueByNumber(final int number) {
                    return MusicGameUnknown2Enum.forNumber(number);
                }
            };

        }
    }
}
