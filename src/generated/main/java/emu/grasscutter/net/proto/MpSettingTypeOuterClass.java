// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class MpSettingTypeOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private MpSettingTypeOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MpSettingTypeOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0013MpSettingType.proto*v\n\rMpSettingType\u0012\u001c\n\u0018MP_SETTING_TYPE_NO_ENTER\u0010\u0000\u0012 \n\u001cMP_SETTING_TYPE_ENTER_FREELY\u0010\u0001\u0012%\n!MP_SETTING_TYPE_ENTER_AFTER_APPLY\u0010\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MpSettingTypeOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum MpSettingType implements ProtocolMessageEnum
    {
        MP_SETTING_TYPE_NO_ENTER(0), 
        MP_SETTING_TYPE_ENTER_FREELY(1), 
        MP_SETTING_TYPE_ENTER_AFTER_APPLY(2), 
        UNRECOGNIZED(-1);
        
        public static final int MP_SETTING_TYPE_NO_ENTER_VALUE = 0;
        public static final int MP_SETTING_TYPE_ENTER_FREELY_VALUE = 1;
        public static final int MP_SETTING_TYPE_ENTER_AFTER_APPLY_VALUE = 2;
        private static final Internal.EnumLiteMap<MpSettingType> internalValueMap;
        private static final MpSettingType[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == MpSettingType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static MpSettingType valueOf(final int value) {
            return forNumber(value);
        }
        
        public static MpSettingType forNumber(final int value) {
            switch (value) {
                case 0: {
                    return MpSettingType.MP_SETTING_TYPE_NO_ENTER;
                }
                case 1: {
                    return MpSettingType.MP_SETTING_TYPE_ENTER_FREELY;
                }
                case 2: {
                    return MpSettingType.MP_SETTING_TYPE_ENTER_AFTER_APPLY;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<MpSettingType> internalGetValueMap() {
            return MpSettingType.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == MpSettingType.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return MpSettingTypeOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static MpSettingType valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return MpSettingType.UNRECOGNIZED;
            }
            return MpSettingType.VALUES[desc.getIndex()];
        }
        
        private MpSettingType(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ MpSettingType[] value() {
            return new MpSettingType[] { MpSettingType.MP_SETTING_TYPE_NO_ENTER, MpSettingType.MP_SETTING_TYPE_ENTER_FREELY, MpSettingType.MP_SETTING_TYPE_ENTER_AFTER_APPLY, MpSettingType.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<MpSettingType>() {
                @Override
                public MpSettingType findValueByNumber(final int number) {
                    return MpSettingType.forNumber(number);
                }
            };
        }
    }
}
