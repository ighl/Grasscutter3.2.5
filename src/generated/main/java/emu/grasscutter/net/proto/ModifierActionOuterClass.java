// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class ModifierActionOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private ModifierActionOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ModifierActionOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0014ModifierAction.proto*(\n\u000eModifierAction\u0012\t\n\u0005ADDED\u0010\u0000\u0012\u000b\n\u0007REMOVED\u0010\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ModifierActionOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum ModifierAction implements ProtocolMessageEnum
    {
        ADDED(0), 
        REMOVED(1), 
        UNRECOGNIZED(-1);
        
        public static final int ADDED_VALUE = 0;
        public static final int REMOVED_VALUE = 1;
        private static final Internal.EnumLiteMap<ModifierAction> internalValueMap;
        private static final ModifierAction[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == ModifierAction.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static ModifierAction valueOf(final int value) {
            return forNumber(value);
        }
        
        public static ModifierAction forNumber(final int value) {
            switch (value) {
                case 0: {
                    return ModifierAction.ADDED;
                }
                case 1: {
                    return ModifierAction.REMOVED;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<ModifierAction> internalGetValueMap() {
            return ModifierAction.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == ModifierAction.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return ModifierActionOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static ModifierAction valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return ModifierAction.UNRECOGNIZED;
            }
            return ModifierAction.VALUES[desc.getIndex()];
        }
        
        private ModifierAction(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ ModifierAction[] value() {
            return new ModifierAction[] { ModifierAction.ADDED, ModifierAction.REMOVED, ModifierAction.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<ModifierAction>() {
                @Override
                public ModifierAction findValueByNumber(final int number) {
                    return ModifierAction.forNumber(number);
                }
            };

        }
    }
}
