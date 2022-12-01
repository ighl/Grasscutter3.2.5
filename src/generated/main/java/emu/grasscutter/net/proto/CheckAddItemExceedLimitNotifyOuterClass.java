// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.util.List;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class CheckAddItemExceedLimitNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_CheckAddItemExceedLimitNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CheckAddItemExceedLimitNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CheckAddItemExceedLimitNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CheckAddItemExceedLimitNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n#CheckAddItemExceedLimitNotify.proto\"\u00f9\u0002\n\u001dCheckAddItemExceedLimitNotify\u0012\u000f\n\u0007is_drop\u0018\u0005 \u0001(\b\u0012\u001f\n\u0017exceeded_item_type_list\u0018\n \u0003(\r\u0012\u001a\n\u0012exceeded_item_list\u0018\f \u0003(\r\u0012G\n\bmsg_type\u0018\u0004 \u0001(\u000e25.CheckAddItemExceedLimitNotify.ItemExceedLimitMsgType\"\u00c0\u0001\n\u0016ItemExceedLimitMsgType\u0012&\n\"ITEM_EXCEED_LIMIT_MSG_TYPE_DEFAULT\u0010\u0000\u0012#\n\u001fITEM_EXCEED_LIMIT_MSG_TYPE_TEXT\u0010\u0001\u0012%\n!ITEM_EXCEED_LIMIT_MSG_TYPE_DIALOG\u0010\u0002\u00122\n.ITEM_EXCEED_LIMIT_MSG_TYPE_Unk2700_BONLGEEEBBF\u0010\u0003B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CheckAddItemExceedLimitNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_CheckAddItemExceedLimitNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CheckAddItemExceedLimitNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CheckAddItemExceedLimitNotifyOuterClass.internal_static_CheckAddItemExceedLimitNotify_descriptor, new String[] { "IsDrop", "ExceededItemTypeList", "ExceededItemList", "MsgType" });
    }
    
    public static final class CheckAddItemExceedLimitNotify extends GeneratedMessageV3 implements CheckAddItemExceedLimitNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int IS_DROP_FIELD_NUMBER = 5;
        private boolean isDrop_;
        public static final int EXCEEDED_ITEM_TYPE_LIST_FIELD_NUMBER = 10;
        private Internal.IntList exceededItemTypeList_;
        private int exceededItemTypeListMemoizedSerializedSize;
        public static final int EXCEEDED_ITEM_LIST_FIELD_NUMBER = 12;
        private Internal.IntList exceededItemList_;
        private int exceededItemListMemoizedSerializedSize;
        public static final int MSG_TYPE_FIELD_NUMBER = 4;
        private int msgType_;
        private byte memoizedIsInitialized;
        private static final CheckAddItemExceedLimitNotify DEFAULT_INSTANCE;
        private static final Parser<CheckAddItemExceedLimitNotify> PARSER;
        
        private CheckAddItemExceedLimitNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.exceededItemTypeListMemoizedSerializedSize = -1;
            this.exceededItemListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private CheckAddItemExceedLimitNotify() {
            this.exceededItemTypeListMemoizedSerializedSize = -1;
            this.exceededItemListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.exceededItemTypeList_ = GeneratedMessageV3.emptyIntList();
            this.exceededItemList_ = GeneratedMessageV3.emptyIntList();
            this.msgType_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CheckAddItemExceedLimitNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CheckAddItemExceedLimitNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 32: {
                            final int rawValue = input.readEnum();
                            this.msgType_ = rawValue;
                            continue;
                        }
                        case 40: {
                            this.isDrop_ = input.readBool();
                            continue;
                        }
                        case 80: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.exceededItemTypeList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.exceededItemTypeList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 82: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.exceededItemTypeList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.exceededItemTypeList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 96: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.exceededItemList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.exceededItemList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 98: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.exceededItemList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.exceededItemList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.exceededItemTypeList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.exceededItemList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return CheckAddItemExceedLimitNotifyOuterClass.internal_static_CheckAddItemExceedLimitNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CheckAddItemExceedLimitNotifyOuterClass.internal_static_CheckAddItemExceedLimitNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CheckAddItemExceedLimitNotify.class, Builder.class);
        }
        
        @Override
        public boolean getIsDrop() {
            return this.isDrop_;
        }
        
        @Override
        public List<Integer> getExceededItemTypeListList() {
            return this.exceededItemTypeList_;
        }
        
        @Override
        public int getExceededItemTypeListCount() {
            return this.exceededItemTypeList_.size();
        }
        
        @Override
        public int getExceededItemTypeList(final int index) {
            return this.exceededItemTypeList_.getInt(index);
        }
        
        @Override
        public List<Integer> getExceededItemListList() {
            return this.exceededItemList_;
        }
        
        @Override
        public int getExceededItemListCount() {
            return this.exceededItemList_.size();
        }
        
        @Override
        public int getExceededItemList(final int index) {
            return this.exceededItemList_.getInt(index);
        }
        
        @Override
        public int getMsgTypeValue() {
            return this.msgType_;
        }
        
        @Override
        public ItemExceedLimitMsgType getMsgType() {
            final ItemExceedLimitMsgType result = ItemExceedLimitMsgType.valueOf(this.msgType_);
            return (result == null) ? ItemExceedLimitMsgType.UNRECOGNIZED : result;
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            this.getSerializedSize();
            if (this.msgType_ != ItemExceedLimitMsgType.ITEM_EXCEED_LIMIT_MSG_TYPE_DEFAULT.getNumber()) {
                output.writeEnum(4, this.msgType_);
            }
            if (this.isDrop_) {
                output.writeBool(5, this.isDrop_);
            }
            if (this.getExceededItemTypeListList().size() > 0) {
                output.writeUInt32NoTag(82);
                output.writeUInt32NoTag(this.exceededItemTypeListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.exceededItemTypeList_.size(); ++i) {
                output.writeUInt32NoTag(this.exceededItemTypeList_.getInt(i));
            }
            if (this.getExceededItemListList().size() > 0) {
                output.writeUInt32NoTag(98);
                output.writeUInt32NoTag(this.exceededItemListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.exceededItemList_.size(); ++i) {
                output.writeUInt32NoTag(this.exceededItemList_.getInt(i));
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.msgType_ != ItemExceedLimitMsgType.ITEM_EXCEED_LIMIT_MSG_TYPE_DEFAULT.getNumber()) {
                size += CodedOutputStream.computeEnumSize(4, this.msgType_);
            }
            if (this.isDrop_) {
                size += CodedOutputStream.computeBoolSize(5, this.isDrop_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.exceededItemTypeList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.exceededItemTypeList_.getInt(i));
            }
            size += dataSize;
            if (!this.getExceededItemTypeListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.exceededItemTypeListMemoizedSerializedSize = dataSize;
            dataSize = 0;
            for (int i = 0; i < this.exceededItemList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.exceededItemList_.getInt(i));
            }
            size += dataSize;
            if (!this.getExceededItemListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.exceededItemListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CheckAddItemExceedLimitNotify)) {
                return super.equals(obj);
            }
            final CheckAddItemExceedLimitNotify other = (CheckAddItemExceedLimitNotify)obj;
            return this.getIsDrop() == other.getIsDrop() && this.getExceededItemTypeListList().equals(other.getExceededItemTypeListList()) && this.getExceededItemListList().equals(other.getExceededItemListList()) && this.msgType_ == other.msgType_ && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 5;
            hash = 53 * hash + Internal.hashBoolean(this.getIsDrop());
            if (this.getExceededItemTypeListCount() > 0) {
                hash = 37 * hash + 10;
                hash = 53 * hash + this.getExceededItemTypeListList().hashCode();
            }
            if (this.getExceededItemListCount() > 0) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getExceededItemListList().hashCode();
            }
            hash = 37 * hash + 4;
            hash = 53 * hash + this.msgType_;
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CheckAddItemExceedLimitNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CheckAddItemExceedLimitNotify.PARSER.parseFrom(data);
        }
        
        public static CheckAddItemExceedLimitNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CheckAddItemExceedLimitNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CheckAddItemExceedLimitNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CheckAddItemExceedLimitNotify.PARSER.parseFrom(data);
        }
        
        public static CheckAddItemExceedLimitNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CheckAddItemExceedLimitNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CheckAddItemExceedLimitNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CheckAddItemExceedLimitNotify.PARSER.parseFrom(data);
        }
        
        public static CheckAddItemExceedLimitNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CheckAddItemExceedLimitNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CheckAddItemExceedLimitNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CheckAddItemExceedLimitNotify.PARSER, input);
        }
        
        public static CheckAddItemExceedLimitNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CheckAddItemExceedLimitNotify.PARSER, input, extensionRegistry);
        }
        
        public static CheckAddItemExceedLimitNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CheckAddItemExceedLimitNotify.PARSER, input);
        }
        
        public static CheckAddItemExceedLimitNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CheckAddItemExceedLimitNotify.PARSER, input, extensionRegistry);
        }
        
        public static CheckAddItemExceedLimitNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CheckAddItemExceedLimitNotify.PARSER, input);
        }
        
        public static CheckAddItemExceedLimitNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CheckAddItemExceedLimitNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CheckAddItemExceedLimitNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CheckAddItemExceedLimitNotify prototype) {
            return CheckAddItemExceedLimitNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CheckAddItemExceedLimitNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CheckAddItemExceedLimitNotify getDefaultInstance() {
            return CheckAddItemExceedLimitNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<CheckAddItemExceedLimitNotify> parser() {
            return CheckAddItemExceedLimitNotify.PARSER;
        }
        
        @Override
        public Parser<CheckAddItemExceedLimitNotify> getParserForType() {
            return CheckAddItemExceedLimitNotify.PARSER;
        }
        
        @Override
        public CheckAddItemExceedLimitNotify getDefaultInstanceForType() {
            return CheckAddItemExceedLimitNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CheckAddItemExceedLimitNotify();
            PARSER = new AbstractParser<CheckAddItemExceedLimitNotify>() {
                @Override
                public CheckAddItemExceedLimitNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CheckAddItemExceedLimitNotify(input, extensionRegistry);
                }
            };
        }
        
        public enum ItemExceedLimitMsgType implements ProtocolMessageEnum
        {
            ITEM_EXCEED_LIMIT_MSG_TYPE_DEFAULT(0), 
            ITEM_EXCEED_LIMIT_MSG_TYPE_TEXT(1), 
            ITEM_EXCEED_LIMIT_MSG_TYPE_DIALOG(2), 
            ITEM_EXCEED_LIMIT_MSG_TYPE_Unk2700_BONLGEEEBBF(3), 
            UNRECOGNIZED(-1);
            
            public static final int ITEM_EXCEED_LIMIT_MSG_TYPE_DEFAULT_VALUE = 0;
            public static final int ITEM_EXCEED_LIMIT_MSG_TYPE_TEXT_VALUE = 1;
            public static final int ITEM_EXCEED_LIMIT_MSG_TYPE_DIALOG_VALUE = 2;
            public static final int ITEM_EXCEED_LIMIT_MSG_TYPE_Unk2700_BONLGEEEBBF_VALUE = 3;
            private static final Internal.EnumLiteMap<ItemExceedLimitMsgType> internalValueMap;
            private static final ItemExceedLimitMsgType[] VALUES;
            private final int value;
            
            @Override
            public final int getNumber() {
                if (this == ItemExceedLimitMsgType.UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }
            
            @Deprecated
            public static ItemExceedLimitMsgType valueOf(final int value) {
                return forNumber(value);
            }
            
            public static ItemExceedLimitMsgType forNumber(final int value) {
                switch (value) {
                    case 0: {
                        return ItemExceedLimitMsgType.ITEM_EXCEED_LIMIT_MSG_TYPE_DEFAULT;
                    }
                    case 1: {
                        return ItemExceedLimitMsgType.ITEM_EXCEED_LIMIT_MSG_TYPE_TEXT;
                    }
                    case 2: {
                        return ItemExceedLimitMsgType.ITEM_EXCEED_LIMIT_MSG_TYPE_DIALOG;
                    }
                    case 3: {
                        return ItemExceedLimitMsgType.ITEM_EXCEED_LIMIT_MSG_TYPE_Unk2700_BONLGEEEBBF;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            public static Internal.EnumLiteMap<ItemExceedLimitMsgType> internalGetValueMap() {
                return ItemExceedLimitMsgType.internalValueMap;
            }
            
            @Override
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                if (this == ItemExceedLimitMsgType.UNRECOGNIZED) {
                    throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
                }
                return getDescriptor().getValues().get(this.ordinal());
            }
            
            @Override
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }
            
            public static final Descriptors.EnumDescriptor getDescriptor() {
                return CheckAddItemExceedLimitNotify.getDescriptor().getEnumTypes().get(0);
            }
            
            public static ItemExceedLimitMsgType valueOf(final Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return ItemExceedLimitMsgType.UNRECOGNIZED;
                }
                return ItemExceedLimitMsgType.VALUES[desc.getIndex()];
            }
            
            private ItemExceedLimitMsgType(final int value) {
                this.value = value;
            }
            
            private static /* synthetic */ ItemExceedLimitMsgType[] value() {
                return new ItemExceedLimitMsgType[] { ItemExceedLimitMsgType.ITEM_EXCEED_LIMIT_MSG_TYPE_DEFAULT, ItemExceedLimitMsgType.ITEM_EXCEED_LIMIT_MSG_TYPE_TEXT, ItemExceedLimitMsgType.ITEM_EXCEED_LIMIT_MSG_TYPE_DIALOG, ItemExceedLimitMsgType.ITEM_EXCEED_LIMIT_MSG_TYPE_Unk2700_BONLGEEEBBF, ItemExceedLimitMsgType.UNRECOGNIZED };
            }
            
            static {
                VALUES = values();
                internalValueMap = new Internal.EnumLiteMap<ItemExceedLimitMsgType>() {
                    @Override
                    public ItemExceedLimitMsgType findValueByNumber(final int number) {
                        return ItemExceedLimitMsgType.forNumber(number);
                    }
                };

        }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CheckAddItemExceedLimitNotifyOrBuilder
        {
            private int bitField0_;
            private boolean isDrop_;
            private Internal.IntList exceededItemTypeList_;
            private Internal.IntList exceededItemList_;
            private int msgType_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CheckAddItemExceedLimitNotifyOuterClass.internal_static_CheckAddItemExceedLimitNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CheckAddItemExceedLimitNotifyOuterClass.internal_static_CheckAddItemExceedLimitNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CheckAddItemExceedLimitNotify.class, Builder.class);
            }
            
            private Builder() {
                this.exceededItemTypeList_ = GeneratedMessageV3.emptyIntList();
                this.exceededItemList_ = GeneratedMessageV3.emptyIntList();
                this.msgType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.exceededItemTypeList_ = GeneratedMessageV3.emptyIntList();
                this.exceededItemList_ = GeneratedMessageV3.emptyIntList();
                this.msgType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (CheckAddItemExceedLimitNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.isDrop_ = false;
                this.exceededItemTypeList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.exceededItemList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.msgType_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CheckAddItemExceedLimitNotifyOuterClass.internal_static_CheckAddItemExceedLimitNotify_descriptor;
            }
            
            @Override
            public CheckAddItemExceedLimitNotify getDefaultInstanceForType() {
                return CheckAddItemExceedLimitNotify.getDefaultInstance();
            }
            
            @Override
            public CheckAddItemExceedLimitNotify build() {
                final CheckAddItemExceedLimitNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CheckAddItemExceedLimitNotify buildPartial() {
                final CheckAddItemExceedLimitNotify result = new CheckAddItemExceedLimitNotify(this);
                final int from_bitField0_ = this.bitField0_;
                result.isDrop_ = this.isDrop_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.exceededItemTypeList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.exceededItemTypeList_ = this.exceededItemTypeList_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.exceededItemList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.exceededItemList_ = this.exceededItemList_;
                result.msgType_ = this.msgType_;
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof CheckAddItemExceedLimitNotify) {
                    return this.mergeFrom((CheckAddItemExceedLimitNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CheckAddItemExceedLimitNotify other) {
                if (other == CheckAddItemExceedLimitNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getIsDrop()) {
                    this.setIsDrop(other.getIsDrop());
                }
                if (!other.exceededItemTypeList_.isEmpty()) {
                    if (this.exceededItemTypeList_.isEmpty()) {
                        this.exceededItemTypeList_ = other.exceededItemTypeList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureExceededItemTypeListIsMutable();
                        this.exceededItemTypeList_.addAll(other.exceededItemTypeList_);
                    }
                    this.onChanged();
                }
                if (!other.exceededItemList_.isEmpty()) {
                    if (this.exceededItemList_.isEmpty()) {
                        this.exceededItemList_ = other.exceededItemList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureExceededItemListIsMutable();
                        this.exceededItemList_.addAll(other.exceededItemList_);
                    }
                    this.onChanged();
                }
                if (other.msgType_ != 0) {
                    this.setMsgTypeValue(other.getMsgTypeValue());
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                CheckAddItemExceedLimitNotify parsedMessage = null;
                try {
                    parsedMessage = CheckAddItemExceedLimitNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CheckAddItemExceedLimitNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public boolean getIsDrop() {
                return this.isDrop_;
            }
            
            public Builder setIsDrop(final boolean value) {
                this.isDrop_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsDrop() {
                this.isDrop_ = false;
                this.onChanged();
                return this;
            }
            
            private void ensureExceededItemTypeListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.exceededItemTypeList_ = GeneratedMessageV3.mutableCopy(this.exceededItemTypeList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getExceededItemTypeListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.exceededItemTypeList_) : this.exceededItemTypeList_;
            }
            
            @Override
            public int getExceededItemTypeListCount() {
                return this.exceededItemTypeList_.size();
            }
            
            @Override
            public int getExceededItemTypeList(final int index) {
                return this.exceededItemTypeList_.getInt(index);
            }
            
            public Builder setExceededItemTypeList(final int index, final int value) {
                this.ensureExceededItemTypeListIsMutable();
                this.exceededItemTypeList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addExceededItemTypeList(final int value) {
                this.ensureExceededItemTypeListIsMutable();
                this.exceededItemTypeList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllExceededItemTypeList(final Iterable<? extends Integer> values) {
                this.ensureExceededItemTypeListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.exceededItemTypeList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearExceededItemTypeList() {
                this.exceededItemTypeList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            private void ensureExceededItemListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.exceededItemList_ = GeneratedMessageV3.mutableCopy(this.exceededItemList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getExceededItemListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.exceededItemList_) : this.exceededItemList_;
            }
            
            @Override
            public int getExceededItemListCount() {
                return this.exceededItemList_.size();
            }
            
            @Override
            public int getExceededItemList(final int index) {
                return this.exceededItemList_.getInt(index);
            }
            
            public Builder setExceededItemList(final int index, final int value) {
                this.ensureExceededItemListIsMutable();
                this.exceededItemList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addExceededItemList(final int value) {
                this.ensureExceededItemListIsMutable();
                this.exceededItemList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllExceededItemList(final Iterable<? extends Integer> values) {
                this.ensureExceededItemListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.exceededItemList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearExceededItemList() {
                this.exceededItemList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMsgTypeValue() {
                return this.msgType_;
            }
            
            public Builder setMsgTypeValue(final int value) {
                this.msgType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public ItemExceedLimitMsgType getMsgType() {
                final ItemExceedLimitMsgType result = ItemExceedLimitMsgType.valueOf(this.msgType_);
                return (result == null) ? ItemExceedLimitMsgType.UNRECOGNIZED : result;
            }
            
            public Builder setMsgType(final ItemExceedLimitMsgType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.msgType_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearMsgType() {
                this.msgType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface CheckAddItemExceedLimitNotifyOrBuilder extends MessageOrBuilder
    {
        boolean getIsDrop();
        
        List<Integer> getExceededItemTypeListList();
        
        int getExceededItemTypeListCount();
        
        int getExceededItemTypeList(final int p0);
        
        List<Integer> getExceededItemListList();
        
        int getExceededItemListCount();
        
        int getExceededItemList(final int p0);
        
        int getMsgTypeValue();
        
        CheckAddItemExceedLimitNotify.ItemExceedLimitMsgType getMsgType();
    }
}
