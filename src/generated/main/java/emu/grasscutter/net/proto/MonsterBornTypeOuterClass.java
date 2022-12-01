// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class MonsterBornTypeOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private MonsterBornTypeOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MonsterBornTypeOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015MonsterBornType.proto*j\n\u000fMonsterBornType\u0012\u001a\n\u0016MONSTER_BORN_TYPE_NONE\u0010\u0000\u0012\u001d\n\u0019MONSTER_BORN_TYPE_DEFAULT\u0010\u0001\u0012\u001c\n\u0018MONSTER_BORN_TYPE_RANDOM\u0010\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MonsterBornTypeOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum MonsterBornType implements ProtocolMessageEnum
    {
        MONSTER_BORN_TYPE_NONE(0), 
        MONSTER_BORN_TYPE_DEFAULT(1), 
        MONSTER_BORN_TYPE_RANDOM(2), 
        UNRECOGNIZED(-1);
        
        public static final int MONSTER_BORN_TYPE_NONE_VALUE = 0;
        public static final int MONSTER_BORN_TYPE_DEFAULT_VALUE = 1;
        public static final int MONSTER_BORN_TYPE_RANDOM_VALUE = 2;
        private static final Internal.EnumLiteMap<MonsterBornType> internalValueMap;
        private static final MonsterBornType[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == MonsterBornType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static MonsterBornType valueOf(final int value) {
            return forNumber(value);
        }
        
        public static MonsterBornType forNumber(final int value) {
            switch (value) {
                case 0: {
                    return MonsterBornType.MONSTER_BORN_TYPE_NONE;
                }
                case 1: {
                    return MonsterBornType.MONSTER_BORN_TYPE_DEFAULT;
                }
                case 2: {
                    return MonsterBornType.MONSTER_BORN_TYPE_RANDOM;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<MonsterBornType> internalGetValueMap() {
            return MonsterBornType.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == MonsterBornType.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return MonsterBornTypeOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static MonsterBornType valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return MonsterBornType.UNRECOGNIZED;
            }
            return MonsterBornType.VALUES[desc.getIndex()];
        }
        
        private MonsterBornType(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ MonsterBornType[] value() {
            return new MonsterBornType[] { MonsterBornType.MONSTER_BORN_TYPE_NONE, MonsterBornType.MONSTER_BORN_TYPE_DEFAULT, MonsterBornType.MONSTER_BORN_TYPE_RANDOM, MonsterBornType.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<MonsterBornType>() {
                @Override
                public MonsterBornType findValueByNumber(final int number) {
                    return MonsterBornType.forNumber(number);
                }
            };

        }
    }
}
