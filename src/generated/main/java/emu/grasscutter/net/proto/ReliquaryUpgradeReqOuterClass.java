// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class ReliquaryUpgradeReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_ReliquaryUpgradeReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ReliquaryUpgradeReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ReliquaryUpgradeReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ReliquaryUpgradeReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019ReliquaryUpgradeReq.proto\u001a\u000fItemParam.proto\"{\n\u0013ReliquaryUpgradeReq\u0012#\n\u000fitem_param_list\u0018\u000b \u0003(\u000b2\n.ItemParam\u0012\u001d\n\u0015target_reliquary_guid\u0018\u0006 \u0001(\u0004\u0012 \n\u0018food_reliquary_guid_list\u0018\f \u0003(\u0004B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ReliquaryUpgradeReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ItemParamOuterClass.getDescriptor() });
        internal_static_ReliquaryUpgradeReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ReliquaryUpgradeReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ReliquaryUpgradeReqOuterClass.internal_static_ReliquaryUpgradeReq_descriptor, new String[] { "ItemParamList", "TargetReliquaryGuid", "FoodReliquaryGuidList" });
        ItemParamOuterClass.getDescriptor();
    }
    
    public static final class ReliquaryUpgradeReq extends GeneratedMessageV3 implements ReliquaryUpgradeReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ITEM_PARAM_LIST_FIELD_NUMBER = 11;
        private List<ItemParamOuterClass.ItemParam> itemParamList_;
        public static final int TARGET_RELIQUARY_GUID_FIELD_NUMBER = 6;
        private long targetReliquaryGuid_;
        public static final int FOOD_RELIQUARY_GUID_LIST_FIELD_NUMBER = 12;
        private Internal.LongList foodReliquaryGuidList_;
        private int foodReliquaryGuidListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final ReliquaryUpgradeReq DEFAULT_INSTANCE;
        private static final Parser<ReliquaryUpgradeReq> PARSER;
        
        private ReliquaryUpgradeReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.foodReliquaryGuidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private ReliquaryUpgradeReq() {
            this.foodReliquaryGuidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.itemParamList_ = Collections.emptyList();
            this.foodReliquaryGuidList_ = GeneratedMessageV3.emptyLongList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ReliquaryUpgradeReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ReliquaryUpgradeReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 48: {
                            this.targetReliquaryGuid_ = input.readUInt64();
                            continue;
                        }
                        case 90: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.itemParamList_ = new ArrayList<ItemParamOuterClass.ItemParam>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.itemParamList_.add(input.readMessage(ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
                            continue;
                        }
                        case 96: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.foodReliquaryGuidList_ = GeneratedMessageV3.newLongList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.foodReliquaryGuidList_.addLong(input.readUInt64());
                            continue;
                        }
                        case 98: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.foodReliquaryGuidList_ = GeneratedMessageV3.newLongList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.foodReliquaryGuidList_.addLong(input.readUInt64());
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
                    this.itemParamList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.itemParamList_);
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.foodReliquaryGuidList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ReliquaryUpgradeReqOuterClass.internal_static_ReliquaryUpgradeReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ReliquaryUpgradeReqOuterClass.internal_static_ReliquaryUpgradeReq_fieldAccessorTable.ensureFieldAccessorsInitialized(ReliquaryUpgradeReq.class, Builder.class);
        }
        
        @Override
        public List<ItemParamOuterClass.ItemParam> getItemParamListList() {
            return this.itemParamList_;
        }
        
        @Override
        public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getItemParamListOrBuilderList() {
            return this.itemParamList_;
        }
        
        @Override
        public int getItemParamListCount() {
            return this.itemParamList_.size();
        }
        
        @Override
        public ItemParamOuterClass.ItemParam getItemParamList(final int index) {
            return this.itemParamList_.get(index);
        }
        
        @Override
        public ItemParamOuterClass.ItemParamOrBuilder getItemParamListOrBuilder(final int index) {
            return this.itemParamList_.get(index);
        }
        
        @Override
        public long getTargetReliquaryGuid() {
            return this.targetReliquaryGuid_;
        }
        
        @Override
        public List<Long> getFoodReliquaryGuidListList() {
            return this.foodReliquaryGuidList_;
        }
        
        @Override
        public int getFoodReliquaryGuidListCount() {
            return this.foodReliquaryGuidList_.size();
        }
        
        @Override
        public long getFoodReliquaryGuidList(final int index) {
            return this.foodReliquaryGuidList_.getLong(index);
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
            if (this.targetReliquaryGuid_ != 0L) {
                output.writeUInt64(6, this.targetReliquaryGuid_);
            }
            for (int i = 0; i < this.itemParamList_.size(); ++i) {
                output.writeMessage(11, this.itemParamList_.get(i));
            }
            if (this.getFoodReliquaryGuidListList().size() > 0) {
                output.writeUInt32NoTag(98);
                output.writeUInt32NoTag(this.foodReliquaryGuidListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.foodReliquaryGuidList_.size(); ++i) {
                output.writeUInt64NoTag(this.foodReliquaryGuidList_.getLong(i));
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
            if (this.targetReliquaryGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(6, this.targetReliquaryGuid_);
            }
            for (int i = 0; i < this.itemParamList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(11, this.itemParamList_.get(i));
            }
            int dataSize = 0;
            for (int j = 0; j < this.foodReliquaryGuidList_.size(); ++j) {
                dataSize += CodedOutputStream.computeUInt64SizeNoTag(this.foodReliquaryGuidList_.getLong(j));
            }
            size += dataSize;
            if (!this.getFoodReliquaryGuidListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.foodReliquaryGuidListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ReliquaryUpgradeReq)) {
                return super.equals(obj);
            }
            final ReliquaryUpgradeReq other = (ReliquaryUpgradeReq)obj;
            return this.getItemParamListList().equals(other.getItemParamListList()) && this.getTargetReliquaryGuid() == other.getTargetReliquaryGuid() && this.getFoodReliquaryGuidListList().equals(other.getFoodReliquaryGuidListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getItemParamListCount() > 0) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.getItemParamListList().hashCode();
            }
            hash = 37 * hash + 6;
            hash = 53 * hash + Internal.hashLong(this.getTargetReliquaryGuid());
            if (this.getFoodReliquaryGuidListCount() > 0) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getFoodReliquaryGuidListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ReliquaryUpgradeReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ReliquaryUpgradeReq.PARSER.parseFrom(data);
        }
        
        public static ReliquaryUpgradeReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ReliquaryUpgradeReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ReliquaryUpgradeReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ReliquaryUpgradeReq.PARSER.parseFrom(data);
        }
        
        public static ReliquaryUpgradeReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ReliquaryUpgradeReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ReliquaryUpgradeReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ReliquaryUpgradeReq.PARSER.parseFrom(data);
        }
        
        public static ReliquaryUpgradeReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ReliquaryUpgradeReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ReliquaryUpgradeReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ReliquaryUpgradeReq.PARSER, input);
        }
        
        public static ReliquaryUpgradeReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ReliquaryUpgradeReq.PARSER, input, extensionRegistry);
        }
        
        public static ReliquaryUpgradeReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ReliquaryUpgradeReq.PARSER, input);
        }
        
        public static ReliquaryUpgradeReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ReliquaryUpgradeReq.PARSER, input, extensionRegistry);
        }
        
        public static ReliquaryUpgradeReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ReliquaryUpgradeReq.PARSER, input);
        }
        
        public static ReliquaryUpgradeReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ReliquaryUpgradeReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ReliquaryUpgradeReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ReliquaryUpgradeReq prototype) {
            return ReliquaryUpgradeReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ReliquaryUpgradeReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ReliquaryUpgradeReq getDefaultInstance() {
            return ReliquaryUpgradeReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<ReliquaryUpgradeReq> parser() {
            return ReliquaryUpgradeReq.PARSER;
        }
        
        @Override
        public Parser<ReliquaryUpgradeReq> getParserForType() {
            return ReliquaryUpgradeReq.PARSER;
        }
        
        @Override
        public ReliquaryUpgradeReq getDefaultInstanceForType() {
            return ReliquaryUpgradeReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ReliquaryUpgradeReq();
            PARSER = new AbstractParser<ReliquaryUpgradeReq>() {
                @Override
                public ReliquaryUpgradeReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ReliquaryUpgradeReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ReliquaryUpgradeReqOrBuilder
        {
            private int bitField0_;
            private List<ItemParamOuterClass.ItemParam> itemParamList_;
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> itemParamListBuilder_;
            private long targetReliquaryGuid_;
            private Internal.LongList foodReliquaryGuidList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ReliquaryUpgradeReqOuterClass.internal_static_ReliquaryUpgradeReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ReliquaryUpgradeReqOuterClass.internal_static_ReliquaryUpgradeReq_fieldAccessorTable.ensureFieldAccessorsInitialized(ReliquaryUpgradeReq.class, Builder.class);
            }
            
            private Builder() {
                this.itemParamList_ = Collections.emptyList();
                this.foodReliquaryGuidList_ = GeneratedMessageV3.emptyLongList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.itemParamList_ = Collections.emptyList();
                this.foodReliquaryGuidList_ = GeneratedMessageV3.emptyLongList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ReliquaryUpgradeReq.alwaysUseFieldBuilders) {
                    this.getItemParamListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.itemParamListBuilder_ == null) {
                    this.itemParamList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.itemParamListBuilder_.clear();
                }
                this.targetReliquaryGuid_ = 0L;
                this.foodReliquaryGuidList_ = GeneratedMessageV3.emptyLongList();
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ReliquaryUpgradeReqOuterClass.internal_static_ReliquaryUpgradeReq_descriptor;
            }
            
            @Override
            public ReliquaryUpgradeReq getDefaultInstanceForType() {
                return ReliquaryUpgradeReq.getDefaultInstance();
            }
            
            @Override
            public ReliquaryUpgradeReq build() {
                final ReliquaryUpgradeReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ReliquaryUpgradeReq buildPartial() {
                final ReliquaryUpgradeReq result = new ReliquaryUpgradeReq(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.itemParamListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.itemParamList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.itemParamList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.itemParamList_ = this.itemParamList_;
                }
                else {
                    result.itemParamList_ = this.itemParamListBuilder_.build();
                }
                result.targetReliquaryGuid_ = this.targetReliquaryGuid_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.foodReliquaryGuidList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.foodReliquaryGuidList_ = this.foodReliquaryGuidList_;
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
                if (other instanceof ReliquaryUpgradeReq) {
                    return this.mergeFrom((ReliquaryUpgradeReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ReliquaryUpgradeReq other) {
                if (other == ReliquaryUpgradeReq.getDefaultInstance()) {
                    return this;
                }
                if (this.itemParamListBuilder_ == null) {
                    if (!other.itemParamList_.isEmpty()) {
                        if (this.itemParamList_.isEmpty()) {
                            this.itemParamList_ = other.itemParamList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureItemParamListIsMutable();
                            this.itemParamList_.addAll(other.itemParamList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.itemParamList_.isEmpty()) {
                    if (this.itemParamListBuilder_.isEmpty()) {
                        this.itemParamListBuilder_.dispose();
                        this.itemParamListBuilder_ = null;
                        this.itemParamList_ = other.itemParamList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.itemParamListBuilder_ = (ReliquaryUpgradeReq.alwaysUseFieldBuilders ? this.getItemParamListFieldBuilder() : null);
                    }
                    else {
                        this.itemParamListBuilder_.addAllMessages(other.itemParamList_);
                    }
                }
                if (other.getTargetReliquaryGuid() != 0L) {
                    this.setTargetReliquaryGuid(other.getTargetReliquaryGuid());
                }
                if (!other.foodReliquaryGuidList_.isEmpty()) {
                    if (this.foodReliquaryGuidList_.isEmpty()) {
                        this.foodReliquaryGuidList_ = other.foodReliquaryGuidList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureFoodReliquaryGuidListIsMutable();
                        this.foodReliquaryGuidList_.addAll(other.foodReliquaryGuidList_);
                    }
                    this.onChanged();
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
                ReliquaryUpgradeReq parsedMessage = null;
                try {
                    parsedMessage = ReliquaryUpgradeReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ReliquaryUpgradeReq)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureItemParamListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.itemParamList_ = new ArrayList<ItemParamOuterClass.ItemParam>(this.itemParamList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<ItemParamOuterClass.ItemParam> getItemParamListList() {
                if (this.itemParamListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.itemParamList_);
                }
                return this.itemParamListBuilder_.getMessageList();
            }
            
            @Override
            public int getItemParamListCount() {
                if (this.itemParamListBuilder_ == null) {
                    return this.itemParamList_.size();
                }
                return this.itemParamListBuilder_.getCount();
            }
            
            @Override
            public ItemParamOuterClass.ItemParam getItemParamList(final int index) {
                if (this.itemParamListBuilder_ == null) {
                    return this.itemParamList_.get(index);
                }
                return this.itemParamListBuilder_.getMessage(index);
            }
            
            public Builder setItemParamList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.itemParamListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureItemParamListIsMutable();
                    this.itemParamList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.itemParamListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setItemParamList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.itemParamListBuilder_ == null) {
                    this.ensureItemParamListIsMutable();
                    this.itemParamList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.itemParamListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addItemParamList(final ItemParamOuterClass.ItemParam value) {
                if (this.itemParamListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureItemParamListIsMutable();
                    this.itemParamList_.add(value);
                    this.onChanged();
                }
                else {
                    this.itemParamListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addItemParamList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.itemParamListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureItemParamListIsMutable();
                    this.itemParamList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.itemParamListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addItemParamList(final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.itemParamListBuilder_ == null) {
                    this.ensureItemParamListIsMutable();
                    this.itemParamList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.itemParamListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addItemParamList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.itemParamListBuilder_ == null) {
                    this.ensureItemParamListIsMutable();
                    this.itemParamList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.itemParamListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllItemParamList(final Iterable<? extends ItemParamOuterClass.ItemParam> values) {
                if (this.itemParamListBuilder_ == null) {
                    this.ensureItemParamListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.itemParamList_);
                    this.onChanged();
                }
                else {
                    this.itemParamListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearItemParamList() {
                if (this.itemParamListBuilder_ == null) {
                    this.itemParamList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.itemParamListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeItemParamList(final int index) {
                if (this.itemParamListBuilder_ == null) {
                    this.ensureItemParamListIsMutable();
                    this.itemParamList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.itemParamListBuilder_.remove(index);
                }
                return this;
            }
            
            public ItemParamOuterClass.ItemParam.Builder getItemParamListBuilder(final int index) {
                return this.getItemParamListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ItemParamOuterClass.ItemParamOrBuilder getItemParamListOrBuilder(final int index) {
                if (this.itemParamListBuilder_ == null) {
                    return this.itemParamList_.get(index);
                }
                return this.itemParamListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getItemParamListOrBuilderList() {
                if (this.itemParamListBuilder_ != null) {
                    return this.itemParamListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParamOrBuilder>)this.itemParamList_);
            }
            
            public ItemParamOuterClass.ItemParam.Builder addItemParamListBuilder() {
                return this.getItemParamListFieldBuilder().addBuilder(ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public ItemParamOuterClass.ItemParam.Builder addItemParamListBuilder(final int index) {
                return this.getItemParamListFieldBuilder().addBuilder(index, ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public List<ItemParamOuterClass.ItemParam.Builder> getItemParamListBuilderList() {
                return this.getItemParamListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> getItemParamListFieldBuilder() {
                if (this.itemParamListBuilder_ == null) {
                    this.itemParamListBuilder_ = new RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder>(this.itemParamList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.itemParamList_ = null;
                }
                return this.itemParamListBuilder_;
            }
            
            @Override
            public long getTargetReliquaryGuid() {
                return this.targetReliquaryGuid_;
            }
            
            public Builder setTargetReliquaryGuid(final long value) {
                this.targetReliquaryGuid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTargetReliquaryGuid() {
                this.targetReliquaryGuid_ = 0L;
                this.onChanged();
                return this;
            }
            
            private void ensureFoodReliquaryGuidListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.foodReliquaryGuidList_ = GeneratedMessageV3.mutableCopy(this.foodReliquaryGuidList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Long> getFoodReliquaryGuidListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Long>)this.foodReliquaryGuidList_) : this.foodReliquaryGuidList_;
            }
            
            @Override
            public int getFoodReliquaryGuidListCount() {
                return this.foodReliquaryGuidList_.size();
            }
            
            @Override
            public long getFoodReliquaryGuidList(final int index) {
                return this.foodReliquaryGuidList_.getLong(index);
            }
            
            public Builder setFoodReliquaryGuidList(final int index, final long value) {
                this.ensureFoodReliquaryGuidListIsMutable();
                this.foodReliquaryGuidList_.setLong(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addFoodReliquaryGuidList(final long value) {
                this.ensureFoodReliquaryGuidListIsMutable();
                this.foodReliquaryGuidList_.addLong(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllFoodReliquaryGuidList(final Iterable<? extends Long> values) {
                this.ensureFoodReliquaryGuidListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.foodReliquaryGuidList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearFoodReliquaryGuidList() {
                this.foodReliquaryGuidList_ = GeneratedMessageV3.emptyLongList();
                this.bitField0_ &= 0xFFFFFFFD;
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
    
    public interface ReliquaryUpgradeReqOrBuilder extends MessageOrBuilder
    {
        List<ItemParamOuterClass.ItemParam> getItemParamListList();
        
        ItemParamOuterClass.ItemParam getItemParamList(final int p0);
        
        int getItemParamListCount();
        
        List<? extends ItemParamOuterClass.ItemParamOrBuilder> getItemParamListOrBuilderList();
        
        ItemParamOuterClass.ItemParamOrBuilder getItemParamListOrBuilder(final int p0);
        
        long getTargetReliquaryGuid();
        
        List<Long> getFoodReliquaryGuidListList();
        
        int getFoodReliquaryGuidListCount();
        
        long getFoodReliquaryGuidList(final int p0);
    }
}
