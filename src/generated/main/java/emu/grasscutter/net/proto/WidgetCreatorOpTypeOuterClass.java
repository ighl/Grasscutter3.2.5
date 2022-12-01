// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class WidgetCreatorOpTypeOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private WidgetCreatorOpTypeOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WidgetCreatorOpTypeOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019WidgetCreatorOpType.proto*\u0089\u0001\n\u0013WidgetCreatorOpType\u0012\u001f\n\u001bWIDGET_CREATOR_OP_TYPE_NONE\u0010\u0000\u0012\"\n\u001eWIDGET_CREATOR_OP_TYPE_RETRACT\u0010\u0001\u0012-\n)WIDGET_CREATOR_OP_TYPE_RETRACT_AND_CREATE\u0010\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WidgetCreatorOpTypeOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum WidgetCreatorOpType implements ProtocolMessageEnum
    {
        WIDGET_CREATOR_OP_TYPE_NONE(0), 
        WIDGET_CREATOR_OP_TYPE_RETRACT(1), 
        WIDGET_CREATOR_OP_TYPE_RETRACT_AND_CREATE(2), 
        UNRECOGNIZED(-1);
        
        public static final int WIDGET_CREATOR_OP_TYPE_NONE_VALUE = 0;
        public static final int WIDGET_CREATOR_OP_TYPE_RETRACT_VALUE = 1;
        public static final int WIDGET_CREATOR_OP_TYPE_RETRACT_AND_CREATE_VALUE = 2;
        private static final Internal.EnumLiteMap<WidgetCreatorOpType> internalValueMap;
        private static final WidgetCreatorOpType[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == WidgetCreatorOpType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static WidgetCreatorOpType valueOf(final int value) {
            return forNumber(value);
        }
        
        public static WidgetCreatorOpType forNumber(final int value) {
            switch (value) {
                case 0: {
                    return WidgetCreatorOpType.WIDGET_CREATOR_OP_TYPE_NONE;
                }
                case 1: {
                    return WidgetCreatorOpType.WIDGET_CREATOR_OP_TYPE_RETRACT;
                }
                case 2: {
                    return WidgetCreatorOpType.WIDGET_CREATOR_OP_TYPE_RETRACT_AND_CREATE;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<WidgetCreatorOpType> internalGetValueMap() {
            return WidgetCreatorOpType.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == WidgetCreatorOpType.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return WidgetCreatorOpTypeOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static WidgetCreatorOpType valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return WidgetCreatorOpType.UNRECOGNIZED;
            }
            return WidgetCreatorOpType.VALUES[desc.getIndex()];
        }
        
        private WidgetCreatorOpType(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ WidgetCreatorOpType[] value() {
            return new WidgetCreatorOpType[] { WidgetCreatorOpType.WIDGET_CREATOR_OP_TYPE_NONE, WidgetCreatorOpType.WIDGET_CREATOR_OP_TYPE_RETRACT, WidgetCreatorOpType.WIDGET_CREATOR_OP_TYPE_RETRACT_AND_CREATE, WidgetCreatorOpType.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<WidgetCreatorOpType>() {
                @Override
                public WidgetCreatorOpType findValueByNumber(final int number) {
                    return WidgetCreatorOpType.forNumber(number);
                }
            };

        }
    }
}
