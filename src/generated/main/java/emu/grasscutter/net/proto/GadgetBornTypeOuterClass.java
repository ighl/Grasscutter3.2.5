// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class GadgetBornTypeOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private GadgetBornTypeOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GadgetBornTypeOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0014GadgetBornType.proto*\u00e3\u0001\n\u000eGadgetBornType\u0012\u0019\n\u0015GADGET_BORN_TYPE_NONE\u0010\u0000\u0012\u001b\n\u0017GADGET_BORN_TYPE_IN_AIR\u0010\u0001\u0012\u001b\n\u0017GADGET_BORN_TYPE_PLAYER\u0010\u0002\u0012 \n\u001cGADGET_BORN_TYPE_MONSTER_HIT\u0010\u0003\u0012 \n\u001cGADGET_BORN_TYPE_MONSTER_DIE\u0010\u0004\u0012\u001b\n\u0017GADGET_BORN_TYPE_GADGET\u0010\u0005\u0012\u001b\n\u0017GADGET_BORN_TYPE_GROUND\u0010\u0006B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GadgetBornTypeOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum GadgetBornType implements ProtocolMessageEnum
    {
        GADGET_BORN_TYPE_NONE(0), 
        GADGET_BORN_TYPE_IN_AIR(1), 
        GADGET_BORN_TYPE_PLAYER(2), 
        GADGET_BORN_TYPE_MONSTER_HIT(3), 
        GADGET_BORN_TYPE_MONSTER_DIE(4), 
        GADGET_BORN_TYPE_GADGET(5), 
        GADGET_BORN_TYPE_GROUND(6), 
        UNRECOGNIZED(-1);
        
        public static final int GADGET_BORN_TYPE_NONE_VALUE = 0;
        public static final int GADGET_BORN_TYPE_IN_AIR_VALUE = 1;
        public static final int GADGET_BORN_TYPE_PLAYER_VALUE = 2;
        public static final int GADGET_BORN_TYPE_MONSTER_HIT_VALUE = 3;
        public static final int GADGET_BORN_TYPE_MONSTER_DIE_VALUE = 4;
        public static final int GADGET_BORN_TYPE_GADGET_VALUE = 5;
        public static final int GADGET_BORN_TYPE_GROUND_VALUE = 6;
        private static final Internal.EnumLiteMap<GadgetBornType> internalValueMap;
        private static final GadgetBornType[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == GadgetBornType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static GadgetBornType valueOf(final int value) {
            return forNumber(value);
        }
        
        public static GadgetBornType forNumber(final int value) {
            switch (value) {
                case 0: {
                    return GadgetBornType.GADGET_BORN_TYPE_NONE;
                }
                case 1: {
                    return GadgetBornType.GADGET_BORN_TYPE_IN_AIR;
                }
                case 2: {
                    return GadgetBornType.GADGET_BORN_TYPE_PLAYER;
                }
                case 3: {
                    return GadgetBornType.GADGET_BORN_TYPE_MONSTER_HIT;
                }
                case 4: {
                    return GadgetBornType.GADGET_BORN_TYPE_MONSTER_DIE;
                }
                case 5: {
                    return GadgetBornType.GADGET_BORN_TYPE_GADGET;
                }
                case 6: {
                    return GadgetBornType.GADGET_BORN_TYPE_GROUND;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<GadgetBornType> internalGetValueMap() {
            return GadgetBornType.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == GadgetBornType.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GadgetBornTypeOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static GadgetBornType valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return GadgetBornType.UNRECOGNIZED;
            }
            return GadgetBornType.VALUES[desc.getIndex()];
        }
        
        private GadgetBornType(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ GadgetBornType[] value() {
            return new GadgetBornType[] { GadgetBornType.GADGET_BORN_TYPE_NONE, GadgetBornType.GADGET_BORN_TYPE_IN_AIR, GadgetBornType.GADGET_BORN_TYPE_PLAYER, GadgetBornType.GADGET_BORN_TYPE_MONSTER_HIT, GadgetBornType.GADGET_BORN_TYPE_MONSTER_DIE, GadgetBornType.GADGET_BORN_TYPE_GADGET, GadgetBornType.GADGET_BORN_TYPE_GROUND, GadgetBornType.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<GadgetBornType>() {
                @Override
                public GadgetBornType findValueByNumber(final int number) {
                    return GadgetBornType.forNumber(number);
                }
            };

        }
    }
}
