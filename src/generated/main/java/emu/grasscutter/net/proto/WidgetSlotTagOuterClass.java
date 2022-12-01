// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class WidgetSlotTagOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private WidgetSlotTagOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WidgetSlotTagOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0013WidgetSlotTag.proto*Q\n\rWidgetSlotTag\u0012\u001d\n\u0019WIDGET_SLOT_TAG_QUICK_USE\u0010\u0000\u0012!\n\u001dWIDGET_SLOT_TAG_ATTACH_AVATAR\u0010\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WidgetSlotTagOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum WidgetSlotTag implements ProtocolMessageEnum
    {
        WIDGET_SLOT_TAG_QUICK_USE(0), 
        WIDGET_SLOT_TAG_ATTACH_AVATAR(1), 
        UNRECOGNIZED(-1);
        
        public static final int WIDGET_SLOT_TAG_QUICK_USE_VALUE = 0;
        public static final int WIDGET_SLOT_TAG_ATTACH_AVATAR_VALUE = 1;
        private static final Internal.EnumLiteMap<WidgetSlotTag> internalValueMap;
        private static final WidgetSlotTag[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == WidgetSlotTag.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static WidgetSlotTag valueOf(final int value) {
            return forNumber(value);
        }
        
        public static WidgetSlotTag forNumber(final int value) {
            switch (value) {
                case 0: {
                    return WidgetSlotTag.WIDGET_SLOT_TAG_QUICK_USE;
                }
                case 1: {
                    return WidgetSlotTag.WIDGET_SLOT_TAG_ATTACH_AVATAR;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<WidgetSlotTag> internalGetValueMap() {
            return WidgetSlotTag.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == WidgetSlotTag.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return WidgetSlotTagOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static WidgetSlotTag valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return WidgetSlotTag.UNRECOGNIZED;
            }
            return WidgetSlotTag.VALUES[desc.getIndex()];
        }
        
        private WidgetSlotTag(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ WidgetSlotTag[] value() {
            return new WidgetSlotTag[] { WidgetSlotTag.WIDGET_SLOT_TAG_QUICK_USE, WidgetSlotTag.WIDGET_SLOT_TAG_ATTACH_AVATAR, WidgetSlotTag.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<WidgetSlotTag>() {
                @Override
                public WidgetSlotTag findValueByNumber(final int number) {
                    return WidgetSlotTag.forNumber(number);
                }
            };

        }
    }
}
