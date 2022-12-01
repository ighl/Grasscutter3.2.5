// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class MovingPlatformTypeOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private MovingPlatformTypeOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MovingPlatformTypeOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018MovingPlatformType.proto*\u009a\u0001\n\u0012MovingPlatformType\u0012\u001d\n\u0019MOVING_PLATFORM_TYPE_NONE\u0010\u0000\u0012#\n\u001fMOVING_PLATFORM_TYPE_USE_CONFIG\u0010\u0001\u0012 \n\u001cMOVING_PLATFORM_TYPE_ABILITY\u0010\u0002\u0012\u001e\n\u001aMOVING_PLATFORM_TYPE_ROUTE\u0010\u0003B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MovingPlatformTypeOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum MovingPlatformType implements ProtocolMessageEnum
    {
        MOVING_PLATFORM_TYPE_NONE(0), 
        MOVING_PLATFORM_TYPE_USE_CONFIG(1), 
        MOVING_PLATFORM_TYPE_ABILITY(2), 
        MOVING_PLATFORM_TYPE_ROUTE(3), 
        UNRECOGNIZED(-1);
        
        public static final int MOVING_PLATFORM_TYPE_NONE_VALUE = 0;
        public static final int MOVING_PLATFORM_TYPE_USE_CONFIG_VALUE = 1;
        public static final int MOVING_PLATFORM_TYPE_ABILITY_VALUE = 2;
        public static final int MOVING_PLATFORM_TYPE_ROUTE_VALUE = 3;
        private static final Internal.EnumLiteMap<MovingPlatformType> internalValueMap;
        private static final MovingPlatformType[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == MovingPlatformType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static MovingPlatformType valueOf(final int value) {
            return forNumber(value);
        }
        
        public static MovingPlatformType forNumber(final int value) {
            switch (value) {
                case 0: {
                    return MovingPlatformType.MOVING_PLATFORM_TYPE_NONE;
                }
                case 1: {
                    return MovingPlatformType.MOVING_PLATFORM_TYPE_USE_CONFIG;
                }
                case 2: {
                    return MovingPlatformType.MOVING_PLATFORM_TYPE_ABILITY;
                }
                case 3: {
                    return MovingPlatformType.MOVING_PLATFORM_TYPE_ROUTE;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<MovingPlatformType> internalGetValueMap() {
            return MovingPlatformType.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == MovingPlatformType.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return MovingPlatformTypeOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static MovingPlatformType valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return MovingPlatformType.UNRECOGNIZED;
            }
            return MovingPlatformType.VALUES[desc.getIndex()];
        }
        
        private MovingPlatformType(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ MovingPlatformType[] value() {
            return new MovingPlatformType[] { MovingPlatformType.MOVING_PLATFORM_TYPE_NONE, MovingPlatformType.MOVING_PLATFORM_TYPE_USE_CONFIG, MovingPlatformType.MOVING_PLATFORM_TYPE_ABILITY, MovingPlatformType.MOVING_PLATFORM_TYPE_ROUTE, MovingPlatformType.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<MovingPlatformType>() {
                @Override
                public MovingPlatformType findValueByNumber(final int number) {
                    return MovingPlatformType.forNumber(number);
                }
            };

        }
    }
}
