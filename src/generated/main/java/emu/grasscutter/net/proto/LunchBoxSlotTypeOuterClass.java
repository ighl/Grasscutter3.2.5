// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class LunchBoxSlotTypeOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private LunchBoxSlotTypeOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return LunchBoxSlotTypeOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016LunchBoxSlotType.proto*_\n\u0010LunchBoxSlotType\u0012\u0017\n\u0013LUNCH_BOX_SLOT_NONE\u0010\u0000\u0012\u0019\n\u0015LUNCH_BOX_SLOT_REVIVE\u0010\u0001\u0012\u0017\n\u0013LUNCH_BOX_SLOT_HEAL\u0010\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        LunchBoxSlotTypeOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum LunchBoxSlotType implements ProtocolMessageEnum
    {
        LUNCH_BOX_SLOT_NONE(0), 
        LUNCH_BOX_SLOT_REVIVE(1), 
        LUNCH_BOX_SLOT_HEAL(2), 
        UNRECOGNIZED(-1);
        
        public static final int LUNCH_BOX_SLOT_NONE_VALUE = 0;
        public static final int LUNCH_BOX_SLOT_REVIVE_VALUE = 1;
        public static final int LUNCH_BOX_SLOT_HEAL_VALUE = 2;
        private static final Internal.EnumLiteMap<LunchBoxSlotType> internalValueMap;
        private static final LunchBoxSlotType[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == LunchBoxSlotType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static LunchBoxSlotType valueOf(final int value) {
            return forNumber(value);
        }
        
        public static LunchBoxSlotType forNumber(final int value) {
            switch (value) {
                case 0: {
                    return LunchBoxSlotType.LUNCH_BOX_SLOT_NONE;
                }
                case 1: {
                    return LunchBoxSlotType.LUNCH_BOX_SLOT_REVIVE;
                }
                case 2: {
                    return LunchBoxSlotType.LUNCH_BOX_SLOT_HEAL;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<LunchBoxSlotType> internalGetValueMap() {
            return LunchBoxSlotType.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == LunchBoxSlotType.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return LunchBoxSlotTypeOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static LunchBoxSlotType valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return LunchBoxSlotType.UNRECOGNIZED;
            }
            return LunchBoxSlotType.VALUES[desc.getIndex()];
        }
        
        private LunchBoxSlotType(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ LunchBoxSlotType[] value() {
            return new LunchBoxSlotType[] { LunchBoxSlotType.LUNCH_BOX_SLOT_NONE, LunchBoxSlotType.LUNCH_BOX_SLOT_REVIVE, LunchBoxSlotType.LUNCH_BOX_SLOT_HEAL, LunchBoxSlotType.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<LunchBoxSlotType>() {
                @Override
                public LunchBoxSlotType findValueByNumber(final int number) {
                    return LunchBoxSlotType.forNumber(number);
                }
            };

        }
    }
}
