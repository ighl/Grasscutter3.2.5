// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class Unk2700CBJEDMGOBPL
{
    private static Descriptors.FileDescriptor descriptor;
    
    private Unk2700CBJEDMGOBPL() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return Unk2700CBJEDMGOBPL.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019Unk2700_CBJEDMGOBPL.proto*\u00c9\u0001\n\u0013Unk2700_CBJEDMGOBPL\u0012+\n'Unk2700_CBJEDMGOBPL_Unk2700_MBLDLJOKLBL\u0010\u0000\u0012+\n'Unk2700_CBJEDMGOBPL_Unk2700_ILOMIKADKGD\u0010\u0001\u0012+\n'Unk2700_CBJEDMGOBPL_Unk2700_HGHOEJGHMDH\u0010\u0002\u0012+\n'Unk2700_CBJEDMGOBPL_Unk2700_PJCONIDJGOD\u0010\u0003B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        Unk2700CBJEDMGOBPL.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum Unk2700_CBJEDMGOBPL implements ProtocolMessageEnum
    {
        Unk2700_CBJEDMGOBPL_Unk2700_MBLDLJOKLBL(0), 
        Unk2700_CBJEDMGOBPL_Unk2700_ILOMIKADKGD(1), 
        Unk2700_CBJEDMGOBPL_Unk2700_HGHOEJGHMDH(2), 
        Unk2700_CBJEDMGOBPL_Unk2700_PJCONIDJGOD(3), 
        UNRECOGNIZED(-1);
        
        public static final int Unk2700_CBJEDMGOBPL_Unk2700_MBLDLJOKLBL_VALUE = 0;
        public static final int Unk2700_CBJEDMGOBPL_Unk2700_ILOMIKADKGD_VALUE = 1;
        public static final int Unk2700_CBJEDMGOBPL_Unk2700_HGHOEJGHMDH_VALUE = 2;
        public static final int Unk2700_CBJEDMGOBPL_Unk2700_PJCONIDJGOD_VALUE = 3;
        private static final Internal.EnumLiteMap<Unk2700_CBJEDMGOBPL> internalValueMap;
        private static final Unk2700_CBJEDMGOBPL[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == Unk2700_CBJEDMGOBPL.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static Unk2700_CBJEDMGOBPL valueOf(final int value) {
            return forNumber(value);
        }
        
        public static Unk2700_CBJEDMGOBPL forNumber(final int value) {
            switch (value) {
                case 0: {
                    return Unk2700_CBJEDMGOBPL.Unk2700_CBJEDMGOBPL_Unk2700_MBLDLJOKLBL;
                }
                case 1: {
                    return Unk2700_CBJEDMGOBPL.Unk2700_CBJEDMGOBPL_Unk2700_ILOMIKADKGD;
                }
                case 2: {
                    return Unk2700_CBJEDMGOBPL.Unk2700_CBJEDMGOBPL_Unk2700_HGHOEJGHMDH;
                }
                case 3: {
                    return Unk2700_CBJEDMGOBPL.Unk2700_CBJEDMGOBPL_Unk2700_PJCONIDJGOD;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<Unk2700_CBJEDMGOBPL> internalGetValueMap() {
            return Unk2700_CBJEDMGOBPL.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == Unk2700_CBJEDMGOBPL.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return Unk2700CBJEDMGOBPL.getDescriptor().getEnumTypes().get(0);
        }
        
        public static Unk2700_CBJEDMGOBPL valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return Unk2700_CBJEDMGOBPL.UNRECOGNIZED;
            }
            return Unk2700_CBJEDMGOBPL.VALUES[desc.getIndex()];
        }
        
        private Unk2700_CBJEDMGOBPL(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ Unk2700_CBJEDMGOBPL[] value() {
            return new Unk2700_CBJEDMGOBPL[] { Unk2700_CBJEDMGOBPL.Unk2700_CBJEDMGOBPL_Unk2700_MBLDLJOKLBL, Unk2700_CBJEDMGOBPL.Unk2700_CBJEDMGOBPL_Unk2700_ILOMIKADKGD, Unk2700_CBJEDMGOBPL.Unk2700_CBJEDMGOBPL_Unk2700_HGHOEJGHMDH, Unk2700_CBJEDMGOBPL.Unk2700_CBJEDMGOBPL_Unk2700_PJCONIDJGOD, Unk2700_CBJEDMGOBPL.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<Unk2700_CBJEDMGOBPL>() {
                @Override
                public Unk2700_CBJEDMGOBPL findValueByNumber(final int number) {
                    return Unk2700_CBJEDMGOBPL.forNumber(number);
                }
            };

        }
    }
}
