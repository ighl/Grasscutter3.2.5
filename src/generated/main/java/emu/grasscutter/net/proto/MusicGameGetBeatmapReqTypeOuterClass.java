// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class MusicGameGetBeatmapReqTypeOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private MusicGameGetBeatmapReqTypeOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MusicGameGetBeatmapReqTypeOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n MusicGameGetBeatmapReqType.proto*\u00cb\u0001\n\u001aMusicGameGetBeatmapReqType\u0012!\n\u001dMusicGameGetBeatmapReqType_u1\u0010\u0000\u0012!\n\u001dMusicGameGetBeatmapReqType_u2\u0010\u0001\u0012!\n\u001dMusicGameGetBeatmapReqType_u3\u0010\u0002\u0012!\n\u001dMusicGameGetBeatmapReqType_u4\u0010\u0003\u0012!\n\u001dMusicGameGetBeatmapReqType_u5\u0010\u0004B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MusicGameGetBeatmapReqTypeOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum MusicGameGetBeatmapReqType implements ProtocolMessageEnum
    {
        MusicGameGetBeatmapReqType_u1(0), 
        MusicGameGetBeatmapReqType_u2(1), 
        MusicGameGetBeatmapReqType_u3(2), 
        MusicGameGetBeatmapReqType_u4(3), 
        MusicGameGetBeatmapReqType_u5(4), 
        UNRECOGNIZED(-1);
        
        public static final int MusicGameGetBeatmapReqType_u1_VALUE = 0;
        public static final int MusicGameGetBeatmapReqType_u2_VALUE = 1;
        public static final int MusicGameGetBeatmapReqType_u3_VALUE = 2;
        public static final int MusicGameGetBeatmapReqType_u4_VALUE = 3;
        public static final int MusicGameGetBeatmapReqType_u5_VALUE = 4;
        private static final Internal.EnumLiteMap<MusicGameGetBeatmapReqType> internalValueMap;
        private static final MusicGameGetBeatmapReqType[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == MusicGameGetBeatmapReqType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static MusicGameGetBeatmapReqType valueOf(final int value) {
            return forNumber(value);
        }
        
        public static MusicGameGetBeatmapReqType forNumber(final int value) {
            switch (value) {
                case 0: {
                    return MusicGameGetBeatmapReqType.MusicGameGetBeatmapReqType_u1;
                }
                case 1: {
                    return MusicGameGetBeatmapReqType.MusicGameGetBeatmapReqType_u2;
                }
                case 2: {
                    return MusicGameGetBeatmapReqType.MusicGameGetBeatmapReqType_u3;
                }
                case 3: {
                    return MusicGameGetBeatmapReqType.MusicGameGetBeatmapReqType_u4;
                }
                case 4: {
                    return MusicGameGetBeatmapReqType.MusicGameGetBeatmapReqType_u5;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<MusicGameGetBeatmapReqType> internalGetValueMap() {
            return MusicGameGetBeatmapReqType.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == MusicGameGetBeatmapReqType.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return MusicGameGetBeatmapReqTypeOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static MusicGameGetBeatmapReqType valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return MusicGameGetBeatmapReqType.UNRECOGNIZED;
            }
            return MusicGameGetBeatmapReqType.VALUES[desc.getIndex()];
        }
        
        private MusicGameGetBeatmapReqType(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ MusicGameGetBeatmapReqType[] value() {
            return new MusicGameGetBeatmapReqType[] { MusicGameGetBeatmapReqType.MusicGameGetBeatmapReqType_u1, MusicGameGetBeatmapReqType.MusicGameGetBeatmapReqType_u2, MusicGameGetBeatmapReqType.MusicGameGetBeatmapReqType_u3, MusicGameGetBeatmapReqType.MusicGameGetBeatmapReqType_u4, MusicGameGetBeatmapReqType.MusicGameGetBeatmapReqType_u5, MusicGameGetBeatmapReqType.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<MusicGameGetBeatmapReqType>() {
                @Override
                public MusicGameGetBeatmapReqType findValueByNumber(final int number) {
                    return MusicGameGetBeatmapReqType.forNumber(number);
                }
            };

        }
    }
}
