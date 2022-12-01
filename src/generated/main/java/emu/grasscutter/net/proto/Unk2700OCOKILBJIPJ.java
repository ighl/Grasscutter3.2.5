// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class Unk2700OCOKILBJIPJ
{
    private static Descriptors.FileDescriptor descriptor;
    
    private Unk2700OCOKILBJIPJ() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return Unk2700OCOKILBJIPJ.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019Unk2700_OCOKILBJIPJ.proto*\u00c9\u0001\n\u0013Unk2700_OCOKILBJIPJ\u0012+\n'Unk2700_OCOKILBJIPJ_Unk2700_MPGOEMPNCEH\u0010\u0000\u0012+\n'Unk2700_OCOKILBJIPJ_Unk2700_PDKBOLMIHMA\u0010\u0001\u0012+\n'Unk2700_OCOKILBJIPJ_Unk2700_MCEBEJONJGH\u0010\u0002\u0012+\n'Unk2700_OCOKILBJIPJ_Unk2700_MCNDLHHBBGJ\u0010\u0003B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        Unk2700OCOKILBJIPJ.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum Unk2700_OCOKILBJIPJ implements ProtocolMessageEnum
    {
        Unk2700_OCOKILBJIPJ_Unk2700_MPGOEMPNCEH(0), 
        Unk2700_OCOKILBJIPJ_Unk2700_PDKBOLMIHMA(1), 
        Unk2700_OCOKILBJIPJ_Unk2700_MCEBEJONJGH(2), 
        Unk2700_OCOKILBJIPJ_Unk2700_MCNDLHHBBGJ(3), 
        UNRECOGNIZED(-1);
        
        public static final int Unk2700_OCOKILBJIPJ_Unk2700_MPGOEMPNCEH_VALUE = 0;
        public static final int Unk2700_OCOKILBJIPJ_Unk2700_PDKBOLMIHMA_VALUE = 1;
        public static final int Unk2700_OCOKILBJIPJ_Unk2700_MCEBEJONJGH_VALUE = 2;
        public static final int Unk2700_OCOKILBJIPJ_Unk2700_MCNDLHHBBGJ_VALUE = 3;
        private static final Internal.EnumLiteMap<Unk2700_OCOKILBJIPJ> internalValueMap;
        private static final Unk2700_OCOKILBJIPJ[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == Unk2700_OCOKILBJIPJ.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static Unk2700_OCOKILBJIPJ valueOf(final int value) {
            return forNumber(value);
        }
        
        public static Unk2700_OCOKILBJIPJ forNumber(final int value) {
            switch (value) {
                case 0: {
                    return Unk2700_OCOKILBJIPJ.Unk2700_OCOKILBJIPJ_Unk2700_MPGOEMPNCEH;
                }
                case 1: {
                    return Unk2700_OCOKILBJIPJ.Unk2700_OCOKILBJIPJ_Unk2700_PDKBOLMIHMA;
                }
                case 2: {
                    return Unk2700_OCOKILBJIPJ.Unk2700_OCOKILBJIPJ_Unk2700_MCEBEJONJGH;
                }
                case 3: {
                    return Unk2700_OCOKILBJIPJ.Unk2700_OCOKILBJIPJ_Unk2700_MCNDLHHBBGJ;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<Unk2700_OCOKILBJIPJ> internalGetValueMap() {
            return Unk2700_OCOKILBJIPJ.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == Unk2700_OCOKILBJIPJ.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return Unk2700OCOKILBJIPJ.getDescriptor().getEnumTypes().get(0);
        }
        
        public static Unk2700_OCOKILBJIPJ valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return Unk2700_OCOKILBJIPJ.UNRECOGNIZED;
            }
            return Unk2700_OCOKILBJIPJ.VALUES[desc.getIndex()];
        }
        
        private Unk2700_OCOKILBJIPJ(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ Unk2700_OCOKILBJIPJ[] value() {
            return new Unk2700_OCOKILBJIPJ[] { Unk2700_OCOKILBJIPJ.Unk2700_OCOKILBJIPJ_Unk2700_MPGOEMPNCEH, Unk2700_OCOKILBJIPJ.Unk2700_OCOKILBJIPJ_Unk2700_PDKBOLMIHMA, Unk2700_OCOKILBJIPJ.Unk2700_OCOKILBJIPJ_Unk2700_MCEBEJONJGH, Unk2700_OCOKILBJIPJ.Unk2700_OCOKILBJIPJ_Unk2700_MCNDLHHBBGJ, Unk2700_OCOKILBJIPJ.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<Unk2700_OCOKILBJIPJ>() {
                @Override
                public Unk2700_OCOKILBJIPJ findValueByNumber(final int number) {
                    return Unk2700_OCOKILBJIPJ.forNumber(number);
                }
            };

        }
    }
}
