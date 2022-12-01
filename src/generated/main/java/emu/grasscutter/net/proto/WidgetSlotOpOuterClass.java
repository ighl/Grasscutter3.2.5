// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class WidgetSlotOpOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private WidgetSlotOpOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WidgetSlotOpOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0012WidgetSlotOp.proto*D\n\fWidgetSlotOp\u0012\u0019\n\u0015WIDGET_SLOT_OP_ATTACH\u0010\u0000\u0012\u0019\n\u0015WIDGET_SLOT_OP_DETACH\u0010\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WidgetSlotOpOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum WidgetSlotOp implements ProtocolMessageEnum
    {
        WIDGET_SLOT_OP_ATTACH(0), 
        WIDGET_SLOT_OP_DETACH(1), 
        UNRECOGNIZED(-1);
        
        public static final int WIDGET_SLOT_OP_ATTACH_VALUE = 0;
        public static final int WIDGET_SLOT_OP_DETACH_VALUE = 1;
        private static final Internal.EnumLiteMap<WidgetSlotOp> internalValueMap;
        private static final WidgetSlotOp[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == WidgetSlotOp.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static WidgetSlotOp valueOf(final int value) {
            return forNumber(value);
        }
        
        public static WidgetSlotOp forNumber(final int value) {
            switch (value) {
                case 0: {
                    return WidgetSlotOp.WIDGET_SLOT_OP_ATTACH;
                }
                case 1: {
                    return WidgetSlotOp.WIDGET_SLOT_OP_DETACH;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<WidgetSlotOp> internalGetValueMap() {
            return WidgetSlotOp.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == WidgetSlotOp.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return WidgetSlotOpOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static WidgetSlotOp valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return WidgetSlotOp.UNRECOGNIZED;
            }
            return WidgetSlotOp.VALUES[desc.getIndex()];
        }
        
        private WidgetSlotOp(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ WidgetSlotOp[] value() {
            return new WidgetSlotOp[] { WidgetSlotOp.WIDGET_SLOT_OP_ATTACH, WidgetSlotOp.WIDGET_SLOT_OP_DETACH, WidgetSlotOp.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<WidgetSlotOp>() {
                @Override
                public WidgetSlotOp findValueByNumber(final int number) {
                    return WidgetSlotOp.forNumber(number);
                }
            };

        }
    }
}
