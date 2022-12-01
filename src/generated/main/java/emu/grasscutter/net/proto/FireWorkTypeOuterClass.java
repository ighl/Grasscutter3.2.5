// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class FireWorkTypeOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private FireWorkTypeOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return FireWorkTypeOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0012FireWorkType.proto*\u00c2\u0001\n\fFireWorkType\u0012\u001c\n\u0018FireWorkType_ODJKANKMPPJ\u0010\u0000\u0012\u001c\n\u0018FireWorkType_EFGLHEIODFN\u0010\u0001\u0012\u001c\n\u0018FireWorkType_JPBBBCFGHAK\u0010\u0002\u0012\u001c\n\u0018FireWorkType_IDCMGHBHBFH\u0010\u0003\u0012\u001c\n\u0018FireWorkType_ODDBNNDFMBO\u0010\u0004\u0012\u001c\n\u0018FireWorkType_AGIDMOGJOBD\u0010\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        FireWorkTypeOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum FireWorkType implements ProtocolMessageEnum
    {
        FireWorkType_ODJKANKMPPJ(0), 
        FireWorkType_EFGLHEIODFN(1), 
        FireWorkType_JPBBBCFGHAK(2), 
        FireWorkType_IDCMGHBHBFH(3), 
        FireWorkType_ODDBNNDFMBO(4), 
        FireWorkType_AGIDMOGJOBD(5), 
        UNRECOGNIZED(-1);
        
        public static final int FireWorkType_ODJKANKMPPJ_VALUE = 0;
        public static final int FireWorkType_EFGLHEIODFN_VALUE = 1;
        public static final int FireWorkType_JPBBBCFGHAK_VALUE = 2;
        public static final int FireWorkType_IDCMGHBHBFH_VALUE = 3;
        public static final int FireWorkType_ODDBNNDFMBO_VALUE = 4;
        public static final int FireWorkType_AGIDMOGJOBD_VALUE = 5;
        private static final Internal.EnumLiteMap<FireWorkType> internalValueMap;
        private static final FireWorkType[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == FireWorkType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static FireWorkType valueOf(final int value) {
            return forNumber(value);
        }
        
        public static FireWorkType forNumber(final int value) {
            switch (value) {
                case 0: {
                    return FireWorkType.FireWorkType_ODJKANKMPPJ;
                }
                case 1: {
                    return FireWorkType.FireWorkType_EFGLHEIODFN;
                }
                case 2: {
                    return FireWorkType.FireWorkType_JPBBBCFGHAK;
                }
                case 3: {
                    return FireWorkType.FireWorkType_IDCMGHBHBFH;
                }
                case 4: {
                    return FireWorkType.FireWorkType_ODDBNNDFMBO;
                }
                case 5: {
                    return FireWorkType.FireWorkType_AGIDMOGJOBD;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<FireWorkType> internalGetValueMap() {
            return FireWorkType.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == FireWorkType.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return FireWorkTypeOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static FireWorkType valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return FireWorkType.UNRECOGNIZED;
            }
            return FireWorkType.VALUES[desc.getIndex()];
        }
        
        private FireWorkType(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ FireWorkType[] value() {
            return new FireWorkType[] { FireWorkType.FireWorkType_ODJKANKMPPJ, FireWorkType.FireWorkType_EFGLHEIODFN, FireWorkType.FireWorkType_JPBBBCFGHAK, FireWorkType.FireWorkType_IDCMGHBHBFH, FireWorkType.FireWorkType_ODDBNNDFMBO, FireWorkType.FireWorkType_AGIDMOGJOBD, FireWorkType.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<FireWorkType>() {
                @Override
                public FireWorkType findValueByNumber(final int number) {
                    return FireWorkType.forNumber(number);
                }
            };

        }
    }
}
