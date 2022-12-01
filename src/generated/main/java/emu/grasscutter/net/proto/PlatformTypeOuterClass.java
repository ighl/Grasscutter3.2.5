// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class PlatformTypeOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private PlatformTypeOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlatformTypeOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0012PlatformType.proto*\u00cb\u0003\n\fPlatformType\u0012\u0018\n\u0014PLATFORM_TYPE_EDITOR\u0010\u0000\u0012\u0015\n\u0011PLATFORM_TYPE_IOS\u0010\u0001\u0012\u0019\n\u0015PLATFORM_TYPE_ANDROID\u0010\u0002\u0012\u0014\n\u0010PLATFORM_TYPE_PC\u0010\u0003\u0012\u0015\n\u0011PLATFORM_TYPE_PS4\u0010\u0004\u0012\u0018\n\u0014PLATFORM_TYPE_SERVER\u0010\u0005\u0012\u001f\n\u001bPLATFORM_TYPE_CLOUD_ANDROID\u0010\u0006\u0012\u001b\n\u0017PLATFORM_TYPE_CLOUD_IOS\u0010\u0007\u0012\u0015\n\u0011PLATFORM_TYPE_PS5\u0010\b\u0012\u001b\n\u0017PLATFORM_TYPE_CLOUD_WEB\u0010\t\u0012\u001a\n\u0016PLATFORM_TYPE_CLOUD_TV\u0010\n\u0012%\n!PLATFORM_TYPE_Unk2700_IBBEKBJLMAJ\u0010\u000b\u0012%\n!PLATFORM_TYPE_Unk2700_BCEICMDNIIG\u0010\f\u0012%\n!PLATFORM_TYPE_Unk2800_EFNGHFNPMKM\u0010\r\u0012%\n!PLATFORM_TYPE_Unk2800_FNFHGPABLFB\u0010\u000eB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlatformTypeOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum PlatformType implements ProtocolMessageEnum
    {
        PLATFORM_TYPE_EDITOR(0), 
        PLATFORM_TYPE_IOS(1), 
        PLATFORM_TYPE_ANDROID(2), 
        PLATFORM_TYPE_PC(3), 
        PLATFORM_TYPE_PS4(4), 
        PLATFORM_TYPE_SERVER(5), 
        PLATFORM_TYPE_CLOUD_ANDROID(6), 
        PLATFORM_TYPE_CLOUD_IOS(7), 
        PLATFORM_TYPE_PS5(8), 
        PLATFORM_TYPE_CLOUD_WEB(9), 
        PLATFORM_TYPE_CLOUD_TV(10), 
        PLATFORM_TYPE_Unk2700_IBBEKBJLMAJ(11), 
        PLATFORM_TYPE_Unk2700_BCEICMDNIIG(12), 
        PLATFORM_TYPE_Unk2800_EFNGHFNPMKM(13), 
        PLATFORM_TYPE_Unk2800_FNFHGPABLFB(14), 
        UNRECOGNIZED(-1);
        
        public static final int PLATFORM_TYPE_EDITOR_VALUE = 0;
        public static final int PLATFORM_TYPE_IOS_VALUE = 1;
        public static final int PLATFORM_TYPE_ANDROID_VALUE = 2;
        public static final int PLATFORM_TYPE_PC_VALUE = 3;
        public static final int PLATFORM_TYPE_PS4_VALUE = 4;
        public static final int PLATFORM_TYPE_SERVER_VALUE = 5;
        public static final int PLATFORM_TYPE_CLOUD_ANDROID_VALUE = 6;
        public static final int PLATFORM_TYPE_CLOUD_IOS_VALUE = 7;
        public static final int PLATFORM_TYPE_PS5_VALUE = 8;
        public static final int PLATFORM_TYPE_CLOUD_WEB_VALUE = 9;
        public static final int PLATFORM_TYPE_CLOUD_TV_VALUE = 10;
        public static final int PLATFORM_TYPE_Unk2700_IBBEKBJLMAJ_VALUE = 11;
        public static final int PLATFORM_TYPE_Unk2700_BCEICMDNIIG_VALUE = 12;
        public static final int PLATFORM_TYPE_Unk2800_EFNGHFNPMKM_VALUE = 13;
        public static final int PLATFORM_TYPE_Unk2800_FNFHGPABLFB_VALUE = 14;
        private static final Internal.EnumLiteMap<PlatformType> internalValueMap;
        private static final PlatformType[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == PlatformType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static PlatformType valueOf(final int value) {
            return forNumber(value);
        }
        
        public static PlatformType forNumber(final int value) {
            switch (value) {
                case 0: {
                    return PlatformType.PLATFORM_TYPE_EDITOR;
                }
                case 1: {
                    return PlatformType.PLATFORM_TYPE_IOS;
                }
                case 2: {
                    return PlatformType.PLATFORM_TYPE_ANDROID;
                }
                case 3: {
                    return PlatformType.PLATFORM_TYPE_PC;
                }
                case 4: {
                    return PlatformType.PLATFORM_TYPE_PS4;
                }
                case 5: {
                    return PlatformType.PLATFORM_TYPE_SERVER;
                }
                case 6: {
                    return PlatformType.PLATFORM_TYPE_CLOUD_ANDROID;
                }
                case 7: {
                    return PlatformType.PLATFORM_TYPE_CLOUD_IOS;
                }
                case 8: {
                    return PlatformType.PLATFORM_TYPE_PS5;
                }
                case 9: {
                    return PlatformType.PLATFORM_TYPE_CLOUD_WEB;
                }
                case 10: {
                    return PlatformType.PLATFORM_TYPE_CLOUD_TV;
                }
                case 11: {
                    return PlatformType.PLATFORM_TYPE_Unk2700_IBBEKBJLMAJ;
                }
                case 12: {
                    return PlatformType.PLATFORM_TYPE_Unk2700_BCEICMDNIIG;
                }
                case 13: {
                    return PlatformType.PLATFORM_TYPE_Unk2800_EFNGHFNPMKM;
                }
                case 14: {
                    return PlatformType.PLATFORM_TYPE_Unk2800_FNFHGPABLFB;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<PlatformType> internalGetValueMap() {
            return PlatformType.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == PlatformType.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return PlatformTypeOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static PlatformType valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return PlatformType.UNRECOGNIZED;
            }
            return PlatformType.VALUES[desc.getIndex()];
        }
        
        private PlatformType(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ PlatformType[] value() {
            return new PlatformType[] { PlatformType.PLATFORM_TYPE_EDITOR, PlatformType.PLATFORM_TYPE_IOS, PlatformType.PLATFORM_TYPE_ANDROID, PlatformType.PLATFORM_TYPE_PC, PlatformType.PLATFORM_TYPE_PS4, PlatformType.PLATFORM_TYPE_SERVER, PlatformType.PLATFORM_TYPE_CLOUD_ANDROID, PlatformType.PLATFORM_TYPE_CLOUD_IOS, PlatformType.PLATFORM_TYPE_PS5, PlatformType.PLATFORM_TYPE_CLOUD_WEB, PlatformType.PLATFORM_TYPE_CLOUD_TV, PlatformType.PLATFORM_TYPE_Unk2700_IBBEKBJLMAJ, PlatformType.PLATFORM_TYPE_Unk2700_BCEICMDNIIG, PlatformType.PLATFORM_TYPE_Unk2800_EFNGHFNPMKM, PlatformType.PLATFORM_TYPE_Unk2800_FNFHGPABLFB, PlatformType.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<PlatformType>() {
                @Override
                public PlatformType findValueByNumber(final int number) {
                    return PlatformType.forNumber(number);
                }
            };

        }
    }
}
