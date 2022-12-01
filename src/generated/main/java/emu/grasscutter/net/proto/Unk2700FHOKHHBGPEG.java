// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class Unk2700FHOKHHBGPEG
{
    private static Descriptors.FileDescriptor descriptor;
    
    private Unk2700FHOKHHBGPEG() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return Unk2700FHOKHHBGPEG.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019Unk2700_FHOKHHBGPEG.proto*\u009c\u0001\n\u0013Unk2700_FHOKHHBGPEG\u0012\u001c\n\u0018Unk2700_FHOKHHBGPEG_NONE\u0010\u0000\u0012\u001c\n\u0018Unk2700_FHOKHHBGPEG_FAIL\u0010\u0001\u0012\u001c\n\u0018Unk2700_FHOKHHBGPEG_SUCC\u0010\u0002\u0012+\n'Unk2700_FHOKHHBGPEG_Unk2700_GGDJFCKGBGE\u0010\u0003B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        Unk2700FHOKHHBGPEG.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum Unk2700_FHOKHHBGPEG implements ProtocolMessageEnum
    {
        Unk2700_FHOKHHBGPEG_NONE(0), 
        Unk2700_FHOKHHBGPEG_FAIL(1), 
        Unk2700_FHOKHHBGPEG_SUCC(2), 
        Unk2700_FHOKHHBGPEG_Unk2700_GGDJFCKGBGE(3), 
        UNRECOGNIZED(-1);
        
        public static final int Unk2700_FHOKHHBGPEG_NONE_VALUE = 0;
        public static final int Unk2700_FHOKHHBGPEG_FAIL_VALUE = 1;
        public static final int Unk2700_FHOKHHBGPEG_SUCC_VALUE = 2;
        public static final int Unk2700_FHOKHHBGPEG_Unk2700_GGDJFCKGBGE_VALUE = 3;
        private static final Internal.EnumLiteMap<Unk2700_FHOKHHBGPEG> internalValueMap;
        private static final Unk2700_FHOKHHBGPEG[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == Unk2700_FHOKHHBGPEG.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static Unk2700_FHOKHHBGPEG valueOf(final int value) {
            return forNumber(value);
        }
        
        public static Unk2700_FHOKHHBGPEG forNumber(final int value) {
            switch (value) {
                case 0: {
                    return Unk2700_FHOKHHBGPEG.Unk2700_FHOKHHBGPEG_NONE;
                }
                case 1: {
                    return Unk2700_FHOKHHBGPEG.Unk2700_FHOKHHBGPEG_FAIL;
                }
                case 2: {
                    return Unk2700_FHOKHHBGPEG.Unk2700_FHOKHHBGPEG_SUCC;
                }
                case 3: {
                    return Unk2700_FHOKHHBGPEG.Unk2700_FHOKHHBGPEG_Unk2700_GGDJFCKGBGE;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<Unk2700_FHOKHHBGPEG> internalGetValueMap() {
            return Unk2700_FHOKHHBGPEG.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == Unk2700_FHOKHHBGPEG.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return Unk2700FHOKHHBGPEG.getDescriptor().getEnumTypes().get(0);
        }
        
        public static Unk2700_FHOKHHBGPEG valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return Unk2700_FHOKHHBGPEG.UNRECOGNIZED;
            }
            return Unk2700_FHOKHHBGPEG.VALUES[desc.getIndex()];
        }
        
        private Unk2700_FHOKHHBGPEG(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ Unk2700_FHOKHHBGPEG[] value() {
            return new Unk2700_FHOKHHBGPEG[] { Unk2700_FHOKHHBGPEG.Unk2700_FHOKHHBGPEG_NONE, Unk2700_FHOKHHBGPEG.Unk2700_FHOKHHBGPEG_FAIL, Unk2700_FHOKHHBGPEG.Unk2700_FHOKHHBGPEG_SUCC, Unk2700_FHOKHHBGPEG.Unk2700_FHOKHHBGPEG_Unk2700_GGDJFCKGBGE, Unk2700_FHOKHHBGPEG.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<Unk2700_FHOKHHBGPEG>() {
                @Override
                public Unk2700_FHOKHHBGPEG findValueByNumber(final int number) {
                    return Unk2700_FHOKHHBGPEG.forNumber(number);
                }
            };

        }
    }
}
