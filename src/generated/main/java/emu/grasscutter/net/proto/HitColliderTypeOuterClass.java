// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class HitColliderTypeOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private HitColliderTypeOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HitColliderTypeOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015HitColliderType.proto*\u0092\u0001\n\u000fHitColliderType\u0012\u001d\n\u0019HIT_COLLIDER_TYPE_INVALID\u0010\u0000\u0012\u001d\n\u0019HIT_COLLIDER_TYPE_HIT_BOX\u0010\u0001\u0012!\n\u001dHIT_COLLIDER_TYPE_WET_HIT_BOX\u0010\u0002\u0012\u001e\n\u001aHIT_COLLIDER_TYPE_HEAD_BOX\u0010\u0003B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HitColliderTypeOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum HitColliderType implements ProtocolMessageEnum
    {
        HIT_COLLIDER_TYPE_INVALID(0), 
        HIT_COLLIDER_TYPE_HIT_BOX(1), 
        HIT_COLLIDER_TYPE_WET_HIT_BOX(2), 
        HIT_COLLIDER_TYPE_HEAD_BOX(3), 
        UNRECOGNIZED(-1);
        
        public static final int HIT_COLLIDER_TYPE_INVALID_VALUE = 0;
        public static final int HIT_COLLIDER_TYPE_HIT_BOX_VALUE = 1;
        public static final int HIT_COLLIDER_TYPE_WET_HIT_BOX_VALUE = 2;
        public static final int HIT_COLLIDER_TYPE_HEAD_BOX_VALUE = 3;
        private static final Internal.EnumLiteMap<HitColliderType> internalValueMap;
        private static final HitColliderType[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == HitColliderType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static HitColliderType valueOf(final int value) {
            return forNumber(value);
        }
        
        public static HitColliderType forNumber(final int value) {
            switch (value) {
                case 0: {
                    return HitColliderType.HIT_COLLIDER_TYPE_INVALID;
                }
                case 1: {
                    return HitColliderType.HIT_COLLIDER_TYPE_HIT_BOX;
                }
                case 2: {
                    return HitColliderType.HIT_COLLIDER_TYPE_WET_HIT_BOX;
                }
                case 3: {
                    return HitColliderType.HIT_COLLIDER_TYPE_HEAD_BOX;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<HitColliderType> internalGetValueMap() {
            return HitColliderType.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == HitColliderType.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return HitColliderTypeOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static HitColliderType valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return HitColliderType.UNRECOGNIZED;
            }
            return HitColliderType.VALUES[desc.getIndex()];
        }
        
        private HitColliderType(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ HitColliderType[] value() {
            return new HitColliderType[] { HitColliderType.HIT_COLLIDER_TYPE_INVALID, HitColliderType.HIT_COLLIDER_TYPE_HIT_BOX, HitColliderType.HIT_COLLIDER_TYPE_WET_HIT_BOX, HitColliderType.HIT_COLLIDER_TYPE_HEAD_BOX, HitColliderType.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<HitColliderType>() {
                @Override
                public HitColliderType findValueByNumber(final int number) {
                    return HitColliderType.forNumber(number);
                }
            };

        }
    }
}
