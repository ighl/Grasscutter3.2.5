// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class CBJEDMGOBPLOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private CBJEDMGOBPLOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CBJEDMGOBPLOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0011CBJEDMGOBPL.proto*\u0081\u0001\n\u000bCBJEDMGOBPL\u0012\u001b\n\u0017CBJEDMGOBPL_MBLDLJOKLBL\u0010\u0000\u0012\u001b\n\u0017CBJEDMGOBPL_ILOMIKADKGD\u0010\u0001\u0012\u001b\n\u0017CBJEDMGOBPL_HGHOEJGHMDH\u0010\u0002\u0012\u001b\n\u0017CBJEDMGOBPL_PJCONIDJGOD\u0010\u0003B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CBJEDMGOBPLOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum CBJEDMGOBPL implements ProtocolMessageEnum
    {
        CBJEDMGOBPL_MBLDLJOKLBL(0), 
        CBJEDMGOBPL_ILOMIKADKGD(1), 
        CBJEDMGOBPL_HGHOEJGHMDH(2), 
        CBJEDMGOBPL_PJCONIDJGOD(3), 
        UNRECOGNIZED(-1);
        
        public static final int CBJEDMGOBPL_MBLDLJOKLBL_VALUE = 0;
        public static final int CBJEDMGOBPL_ILOMIKADKGD_VALUE = 1;
        public static final int CBJEDMGOBPL_HGHOEJGHMDH_VALUE = 2;
        public static final int CBJEDMGOBPL_PJCONIDJGOD_VALUE = 3;
        private static final Internal.EnumLiteMap<CBJEDMGOBPL> internalValueMap;
        private static final CBJEDMGOBPL[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == CBJEDMGOBPL.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static CBJEDMGOBPL valueOf(final int value) {
            return forNumber(value);
        }
        
        public static CBJEDMGOBPL forNumber(final int value) {
            switch (value) {
                case 0: {
                    return CBJEDMGOBPL.CBJEDMGOBPL_MBLDLJOKLBL;
                }
                case 1: {
                    return CBJEDMGOBPL.CBJEDMGOBPL_ILOMIKADKGD;
                }
                case 2: {
                    return CBJEDMGOBPL.CBJEDMGOBPL_HGHOEJGHMDH;
                }
                case 3: {
                    return CBJEDMGOBPL.CBJEDMGOBPL_PJCONIDJGOD;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<CBJEDMGOBPL> internalGetValueMap() {
            return CBJEDMGOBPL.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == CBJEDMGOBPL.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return CBJEDMGOBPLOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static CBJEDMGOBPL valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return CBJEDMGOBPL.UNRECOGNIZED;
            }
            return CBJEDMGOBPL.VALUES[desc.getIndex()];
        }
        
        private CBJEDMGOBPL(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ CBJEDMGOBPL[] value() {
            return new CBJEDMGOBPL[] { CBJEDMGOBPL.CBJEDMGOBPL_MBLDLJOKLBL, CBJEDMGOBPL.CBJEDMGOBPL_ILOMIKADKGD, CBJEDMGOBPL.CBJEDMGOBPL_HGHOEJGHMDH, CBJEDMGOBPL.CBJEDMGOBPL_PJCONIDJGOD, CBJEDMGOBPL.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<CBJEDMGOBPL>() {
                @Override
                public CBJEDMGOBPL findValueByNumber(final int number) {
                    return CBJEDMGOBPL.forNumber(number);
                }
            };

        }
    }
}
