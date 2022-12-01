// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class ShopGoodsDisableTypeOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private ShopGoodsDisableTypeOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ShopGoodsDisableTypeOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001aShopGoodsDisableType.proto*³\u0001\n\u0014ShopGoodsDisableType\u0012\u001b\n\u0017SHOP_GOODS_DISABLE_NONE\u0010\u0000\u0012\"\n\u001eSHOP_GOODS_DISABLE_TALENT_FULL\u0010\u0001\u00121\n-SHOP_GOODS_DISABLE_FURNITURE_FORMULA_UNLOCKED\u0010\u0002\u0012'\n#SHOP_GOODS_DISABLE_COSTUME_UNLOCKED\u0010\u0003B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ShopGoodsDisableTypeOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum ShopGoodsDisableType implements ProtocolMessageEnum
    {
        SHOP_GOODS_DISABLE_NONE(0), 
        SHOP_GOODS_DISABLE_TALENT_FULL(1), 
        SHOP_GOODS_DISABLE_FURNITURE_FORMULA_UNLOCKED(2), 
        SHOP_GOODS_DISABLE_COSTUME_UNLOCKED(3), 
        UNRECOGNIZED(-1);
        
        public static final int SHOP_GOODS_DISABLE_NONE_VALUE = 0;
        public static final int SHOP_GOODS_DISABLE_TALENT_FULL_VALUE = 1;
        public static final int SHOP_GOODS_DISABLE_FURNITURE_FORMULA_UNLOCKED_VALUE = 2;
        public static final int SHOP_GOODS_DISABLE_COSTUME_UNLOCKED_VALUE = 3;
        private static final Internal.EnumLiteMap<ShopGoodsDisableType> internalValueMap;
        private static final ShopGoodsDisableType[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == ShopGoodsDisableType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static ShopGoodsDisableType valueOf(final int value) {
            return forNumber(value);
        }
        
        public static ShopGoodsDisableType forNumber(final int value) {
            switch (value) {
                case 0: {
                    return ShopGoodsDisableType.SHOP_GOODS_DISABLE_NONE;
                }
                case 1: {
                    return ShopGoodsDisableType.SHOP_GOODS_DISABLE_TALENT_FULL;
                }
                case 2: {
                    return ShopGoodsDisableType.SHOP_GOODS_DISABLE_FURNITURE_FORMULA_UNLOCKED;
                }
                case 3: {
                    return ShopGoodsDisableType.SHOP_GOODS_DISABLE_COSTUME_UNLOCKED;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<ShopGoodsDisableType> internalGetValueMap() {
            return ShopGoodsDisableType.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == ShopGoodsDisableType.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return ShopGoodsDisableTypeOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static ShopGoodsDisableType valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return ShopGoodsDisableType.UNRECOGNIZED;
            }
            return ShopGoodsDisableType.VALUES[desc.getIndex()];
        }
        
        private ShopGoodsDisableType(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ ShopGoodsDisableType[] value() {
            return new ShopGoodsDisableType[] { ShopGoodsDisableType.SHOP_GOODS_DISABLE_NONE, ShopGoodsDisableType.SHOP_GOODS_DISABLE_TALENT_FULL, ShopGoodsDisableType.SHOP_GOODS_DISABLE_FURNITURE_FORMULA_UNLOCKED, ShopGoodsDisableType.SHOP_GOODS_DISABLE_COSTUME_UNLOCKED, ShopGoodsDisableType.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<ShopGoodsDisableType>() {
                @Override
                public ShopGoodsDisableType findValueByNumber(final int number) {
                    return ShopGoodsDisableType.forNumber(number);
                }
            };

        }
    }
}
