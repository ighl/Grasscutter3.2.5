// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class ChapterStateOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private ChapterStateOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ChapterStateOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0012ChapterState.proto*|\n\fChapterState\u0012\u0019\n\u0015CHAPTER_STATE_INVALID\u0010\u0000\u0012!\n\u001dCHAPTER_STATE_UNABLE_TO_BEGIN\u0010\u0001\u0012\u0017\n\u0013CHAPTER_STATE_BEGIN\u0010\u0002\u0012\u0015\n\u0011CHAPTER_STATE_END\u0010\u0003B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ChapterStateOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum ChapterState implements ProtocolMessageEnum
    {
        CHAPTER_STATE_INVALID(0), 
        CHAPTER_STATE_UNABLE_TO_BEGIN(1), 
        CHAPTER_STATE_BEGIN(2), 
        CHAPTER_STATE_END(3), 
        UNRECOGNIZED(-1);
        
        public static final int CHAPTER_STATE_INVALID_VALUE = 0;
        public static final int CHAPTER_STATE_UNABLE_TO_BEGIN_VALUE = 1;
        public static final int CHAPTER_STATE_BEGIN_VALUE = 2;
        public static final int CHAPTER_STATE_END_VALUE = 3;
        private static final Internal.EnumLiteMap<ChapterState> internalValueMap;
        private static final ChapterState[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == ChapterState.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static ChapterState valueOf(final int value) {
            return forNumber(value);
        }
        
        public static ChapterState forNumber(final int value) {
            switch (value) {
                case 0: {
                    return ChapterState.CHAPTER_STATE_INVALID;
                }
                case 1: {
                    return ChapterState.CHAPTER_STATE_UNABLE_TO_BEGIN;
                }
                case 2: {
                    return ChapterState.CHAPTER_STATE_BEGIN;
                }
                case 3: {
                    return ChapterState.CHAPTER_STATE_END;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<ChapterState> internalGetValueMap() {
            return ChapterState.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == ChapterState.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return ChapterStateOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static ChapterState valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return ChapterState.UNRECOGNIZED;
            }
            return ChapterState.VALUES[desc.getIndex()];
        }
        
        private ChapterState(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ ChapterState[] value() {
            return new ChapterState[] { ChapterState.CHAPTER_STATE_INVALID, ChapterState.CHAPTER_STATE_UNABLE_TO_BEGIN, ChapterState.CHAPTER_STATE_BEGIN, ChapterState.CHAPTER_STATE_END, ChapterState.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<ChapterState>() {
                @Override
                public ChapterState findValueByNumber(final int number) {
                    return ChapterState.forNumber(number);
                }
            };

        }
    }
}
