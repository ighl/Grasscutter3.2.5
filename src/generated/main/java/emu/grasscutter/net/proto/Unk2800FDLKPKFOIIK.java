// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class Unk2800FDLKPKFOIIK
{
    private static Descriptors.FileDescriptor descriptor;
    
    private Unk2800FDLKPKFOIIK() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return Unk2800FDLKPKFOIIK.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019Unk2800_FDLKPKFOIIK.proto*\u007f\n\u0013Unk2800_FDLKPKFOIIK\u0012\u001c\n\u0018Unk2800_FDLKPKFOIIK_NONE\u0010\u0000\u0012\u001d\n\u0019Unk2800_FDLKPKFOIIK_START\u0010\u0001\u0012+\n'Unk2800_FDLKPKFOIIK_Unk2800_FDPBDHDHAKO\u0010\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        Unk2800FDLKPKFOIIK.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum Unk2800_FDLKPKFOIIK implements ProtocolMessageEnum
    {
        Unk2800_FDLKPKFOIIK_NONE(0), 
        Unk2800_FDLKPKFOIIK_START(1), 
        Unk2800_FDLKPKFOIIK_Unk2800_FDPBDHDHAKO(2), 
        UNRECOGNIZED(-1);
        
        public static final int Unk2800_FDLKPKFOIIK_NONE_VALUE = 0;
        public static final int Unk2800_FDLKPKFOIIK_START_VALUE = 1;
        public static final int Unk2800_FDLKPKFOIIK_Unk2800_FDPBDHDHAKO_VALUE = 2;
        private static final Internal.EnumLiteMap<Unk2800_FDLKPKFOIIK> internalValueMap;
        private static final Unk2800_FDLKPKFOIIK[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == Unk2800_FDLKPKFOIIK.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static Unk2800_FDLKPKFOIIK valueOf(final int value) {
            return forNumber(value);
        }
        
        public static Unk2800_FDLKPKFOIIK forNumber(final int value) {
            switch (value) {
                case 0: {
                    return Unk2800_FDLKPKFOIIK.Unk2800_FDLKPKFOIIK_NONE;
                }
                case 1: {
                    return Unk2800_FDLKPKFOIIK.Unk2800_FDLKPKFOIIK_START;
                }
                case 2: {
                    return Unk2800_FDLKPKFOIIK.Unk2800_FDLKPKFOIIK_Unk2800_FDPBDHDHAKO;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<Unk2800_FDLKPKFOIIK> internalGetValueMap() {
            return Unk2800_FDLKPKFOIIK.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == Unk2800_FDLKPKFOIIK.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return Unk2800FDLKPKFOIIK.getDescriptor().getEnumTypes().get(0);
        }
        
        public static Unk2800_FDLKPKFOIIK valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return Unk2800_FDLKPKFOIIK.UNRECOGNIZED;
            }
            return Unk2800_FDLKPKFOIIK.VALUES[desc.getIndex()];
        }
        
        private Unk2800_FDLKPKFOIIK(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ Unk2800_FDLKPKFOIIK[] value() {
            return new Unk2800_FDLKPKFOIIK[] { Unk2800_FDLKPKFOIIK.Unk2800_FDLKPKFOIIK_NONE, Unk2800_FDLKPKFOIIK.Unk2800_FDLKPKFOIIK_START, Unk2800_FDLKPKFOIIK.Unk2800_FDLKPKFOIIK_Unk2800_FDPBDHDHAKO, Unk2800_FDLKPKFOIIK.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<Unk2800_FDLKPKFOIIK>() {
                @Override
                public Unk2800_FDLKPKFOIIK findValueByNumber(final int number) {
                    return Unk2800_FDLKPKFOIIK.forNumber(number);
                }
            };

        }
    }
}
