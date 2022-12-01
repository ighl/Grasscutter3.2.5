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
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class BattlePassBuySuccNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_BattlePassBuySuccNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BattlePassBuySuccNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private BattlePassBuySuccNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return BattlePassBuySuccNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001dBattlePassBuySuccNotify.proto\u001a\u000fItemParam.proto\"{\n\u0017BattlePassBuySuccNotify\u0012\u0013\n\u000bschedule_id\u0018\u0004 \u0001(\r\u0012\u0019\n\u0011product_play_type\u0018\u000b \u0001(\r\u0012\u0011\n\tadd_point\u0018\f \u0001(\r\u0012\u001d\n\titem_list\u0018\t \u0003(\u000b2\n.ItemParamB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        BattlePassBuySuccNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ItemParamOuterClass.getDescriptor() });
        internal_static_BattlePassBuySuccNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_BattlePassBuySuccNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(BattlePassBuySuccNotifyOuterClass.internal_static_BattlePassBuySuccNotify_descriptor, new String[] { "ScheduleId", "ProductPlayType", "AddPoint", "ItemList" });
        ItemParamOuterClass.getDescriptor();
    }
    
    public static final class BattlePassBuySuccNotify extends GeneratedMessageV3 implements BattlePassBuySuccNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SCHEDULE_ID_FIELD_NUMBER = 4;
        private int scheduleId_;
        public static final int PRODUCT_PLAY_TYPE_FIELD_NUMBER = 11;
        private int productPlayType_;
        public static final int ADD_POINT_FIELD_NUMBER = 12;
        private int addPoint_;
        public static final int ITEM_LIST_FIELD_NUMBER = 9;
        private List<ItemParamOuterClass.ItemParam> itemList_;
        private byte memoizedIsInitialized;
        private static final BattlePassBuySuccNotify DEFAULT_INSTANCE;
        private static final Parser<BattlePassBuySuccNotify> PARSER;
        
        private BattlePassBuySuccNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private BattlePassBuySuccNotify() {
            this.memoizedIsInitialized = -1;
            this.itemList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new BattlePassBuySuccNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private BattlePassBuySuccNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.scheduleId_ = input.readUInt32();
                            continue;
                        }
                        case 74: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.itemList_ = new ArrayList<ItemParamOuterClass.ItemParam>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.itemList_.add(input.readMessage(ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
                            continue;
                        }
                        case 88: {
                            this.productPlayType_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
                            this.addPoint_ = input.readUInt32();
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
                    this.itemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.itemList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return BattlePassBuySuccNotifyOuterClass.internal_static_BattlePassBuySuccNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return BattlePassBuySuccNotifyOuterClass.internal_static_BattlePassBuySuccNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(BattlePassBuySuccNotify.class, Builder.class);
        }
        
        @Override
        public int getScheduleId() {
            return this.scheduleId_;
        }
        
        @Override
        public int getProductPlayType() {
            return this.productPlayType_;
        }
        
        @Override
        public int getAddPoint() {
            return this.addPoint_;
        }
        
        @Override
        public List<ItemParamOuterClass.ItemParam> getItemListList() {
            return this.itemList_;
        }
        
        @Override
        public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getItemListOrBuilderList() {
            return this.itemList_;
        }
        
        @Override
        public int getItemListCount() {
            return this.itemList_.size();
        }
        
        @Override
        public ItemParamOuterClass.ItemParam getItemList(final int index) {
            return this.itemList_.get(index);
        }
        
        @Override
        public ItemParamOuterClass.ItemParamOrBuilder getItemListOrBuilder(final int index) {
            return this.itemList_.get(index);
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
            if (this.scheduleId_ != 0) {
                output.writeUInt32(4, this.scheduleId_);
            }
            for (int i = 0; i < this.itemList_.size(); ++i) {
                output.writeMessage(9, this.itemList_.get(i));
            }
            if (this.productPlayType_ != 0) {
                output.writeUInt32(11, this.productPlayType_);
            }
            if (this.addPoint_ != 0) {
                output.writeUInt32(12, this.addPoint_);
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
            if (this.scheduleId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.scheduleId_);
            }
            for (int i = 0; i < this.itemList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(9, this.itemList_.get(i));
            }
            if (this.productPlayType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.productPlayType_);
            }
            if (this.addPoint_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.addPoint_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattlePassBuySuccNotify)) {
                return super.equals(obj);
            }
            final BattlePassBuySuccNotify other = (BattlePassBuySuccNotify)obj;
            return this.getScheduleId() == other.getScheduleId() && this.getProductPlayType() == other.getProductPlayType() && this.getAddPoint() == other.getAddPoint() && this.getItemListList().equals(other.getItemListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getScheduleId();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getProductPlayType();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getAddPoint();
            if (this.getItemListCount() > 0) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getItemListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static BattlePassBuySuccNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return BattlePassBuySuccNotify.PARSER.parseFrom(data);
        }
        
        public static BattlePassBuySuccNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassBuySuccNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassBuySuccNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return BattlePassBuySuccNotify.PARSER.parseFrom(data);
        }
        
        public static BattlePassBuySuccNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassBuySuccNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassBuySuccNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return BattlePassBuySuccNotify.PARSER.parseFrom(data);
        }
        
        public static BattlePassBuySuccNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassBuySuccNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassBuySuccNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassBuySuccNotify.PARSER, input);
        }
        
        public static BattlePassBuySuccNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassBuySuccNotify.PARSER, input, extensionRegistry);
        }
        
        public static BattlePassBuySuccNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BattlePassBuySuccNotify.PARSER, input);
        }
        
        public static BattlePassBuySuccNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BattlePassBuySuccNotify.PARSER, input, extensionRegistry);
        }
        
        public static BattlePassBuySuccNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassBuySuccNotify.PARSER, input);
        }
        
        public static BattlePassBuySuccNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassBuySuccNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return BattlePassBuySuccNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final BattlePassBuySuccNotify prototype) {
            return BattlePassBuySuccNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == BattlePassBuySuccNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static BattlePassBuySuccNotify getDefaultInstance() {
            return BattlePassBuySuccNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<BattlePassBuySuccNotify> parser() {
            return BattlePassBuySuccNotify.PARSER;
        }
        
        @Override
        public Parser<BattlePassBuySuccNotify> getParserForType() {
            return BattlePassBuySuccNotify.PARSER;
        }
        
        @Override
        public BattlePassBuySuccNotify getDefaultInstanceForType() {
            return BattlePassBuySuccNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new BattlePassBuySuccNotify();
            PARSER = new AbstractParser<BattlePassBuySuccNotify>() {
                @Override
                public BattlePassBuySuccNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new BattlePassBuySuccNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BattlePassBuySuccNotifyOrBuilder
        {
            private int bitField0_;
            private int scheduleId_;
            private int productPlayType_;
            private int addPoint_;
            private List<ItemParamOuterClass.ItemParam> itemList_;
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> itemListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return BattlePassBuySuccNotifyOuterClass.internal_static_BattlePassBuySuccNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return BattlePassBuySuccNotifyOuterClass.internal_static_BattlePassBuySuccNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(BattlePassBuySuccNotify.class, Builder.class);
            }
            
            private Builder() {
                this.itemList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.itemList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (BattlePassBuySuccNotify.alwaysUseFieldBuilders) {
                    this.getItemListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.scheduleId_ = 0;
                this.productPlayType_ = 0;
                this.addPoint_ = 0;
                if (this.itemListBuilder_ == null) {
                    this.itemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.itemListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return BattlePassBuySuccNotifyOuterClass.internal_static_BattlePassBuySuccNotify_descriptor;
            }
            
            @Override
            public BattlePassBuySuccNotify getDefaultInstanceForType() {
                return BattlePassBuySuccNotify.getDefaultInstance();
            }
            
            @Override
            public BattlePassBuySuccNotify build() {
                final BattlePassBuySuccNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public BattlePassBuySuccNotify buildPartial() {
                final BattlePassBuySuccNotify result = new BattlePassBuySuccNotify(this);
                final int from_bitField0_ = this.bitField0_;
                result.scheduleId_ = this.scheduleId_;
                result.productPlayType_ = this.productPlayType_;
                result.addPoint_ = this.addPoint_;
                if (this.itemListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.itemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.itemList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.itemList_ = this.itemList_;
                }
                else {
                    result.itemList_ = this.itemListBuilder_.build();
                }
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
                if (other instanceof BattlePassBuySuccNotify) {
                    return this.mergeFrom((BattlePassBuySuccNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final BattlePassBuySuccNotify other) {
                if (other == BattlePassBuySuccNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getScheduleId() != 0) {
                    this.setScheduleId(other.getScheduleId());
                }
                if (other.getProductPlayType() != 0) {
                    this.setProductPlayType(other.getProductPlayType());
                }
                if (other.getAddPoint() != 0) {
                    this.setAddPoint(other.getAddPoint());
                }
                if (this.itemListBuilder_ == null) {
                    if (!other.itemList_.isEmpty()) {
                        if (this.itemList_.isEmpty()) {
                            this.itemList_ = other.itemList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureItemListIsMutable();
                            this.itemList_.addAll(other.itemList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.itemList_.isEmpty()) {
                    if (this.itemListBuilder_.isEmpty()) {
                        this.itemListBuilder_.dispose();
                        this.itemListBuilder_ = null;
                        this.itemList_ = other.itemList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.itemListBuilder_ = (BattlePassBuySuccNotify.alwaysUseFieldBuilders ? this.getItemListFieldBuilder() : null);
                    }
                    else {
                        this.itemListBuilder_.addAllMessages(other.itemList_);
                    }
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
                BattlePassBuySuccNotify parsedMessage = null;
                try {
                    parsedMessage = BattlePassBuySuccNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (BattlePassBuySuccNotify)e.getUnfinishedMessage();
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
            public int getScheduleId() {
                return this.scheduleId_;
            }
            
            public Builder setScheduleId(final int value) {
                this.scheduleId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearScheduleId() {
                this.scheduleId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getProductPlayType() {
                return this.productPlayType_;
            }
            
            public Builder setProductPlayType(final int value) {
                this.productPlayType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearProductPlayType() {
                this.productPlayType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getAddPoint() {
                return this.addPoint_;
            }
            
            public Builder setAddPoint(final int value) {
                this.addPoint_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAddPoint() {
                this.addPoint_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureItemListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.itemList_ = new ArrayList<ItemParamOuterClass.ItemParam>(this.itemList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<ItemParamOuterClass.ItemParam> getItemListList() {
                if (this.itemListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.itemList_);
                }
                return this.itemListBuilder_.getMessageList();
            }
            
            @Override
            public int getItemListCount() {
                if (this.itemListBuilder_ == null) {
                    return this.itemList_.size();
                }
                return this.itemListBuilder_.getCount();
            }
            
            @Override
            public ItemParamOuterClass.ItemParam getItemList(final int index) {
                if (this.itemListBuilder_ == null) {
                    return this.itemList_.get(index);
                }
                return this.itemListBuilder_.getMessage(index);
            }
            
            public Builder setItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.itemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureItemListIsMutable();
                    this.itemList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.itemListBuilder_ == null) {
                    this.ensureItemListIsMutable();
                    this.itemList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addItemList(final ItemParamOuterClass.ItemParam value) {
                if (this.itemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureItemListIsMutable();
                    this.itemList_.add(value);
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.itemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureItemListIsMutable();
                    this.itemList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addItemList(final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.itemListBuilder_ == null) {
                    this.ensureItemListIsMutable();
                    this.itemList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.itemListBuilder_ == null) {
                    this.ensureItemListIsMutable();
                    this.itemList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllItemList(final Iterable<? extends ItemParamOuterClass.ItemParam> values) {
                if (this.itemListBuilder_ == null) {
                    this.ensureItemListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.itemList_);
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearItemList() {
                if (this.itemListBuilder_ == null) {
                    this.itemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeItemList(final int index) {
                if (this.itemListBuilder_ == null) {
                    this.ensureItemListIsMutable();
                    this.itemList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.remove(index);
                }
                return this;
            }
            
            public ItemParamOuterClass.ItemParam.Builder getItemListBuilder(final int index) {
                return this.getItemListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ItemParamOuterClass.ItemParamOrBuilder getItemListOrBuilder(final int index) {
                if (this.itemListBuilder_ == null) {
                    return this.itemList_.get(index);
                }
                return this.itemListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getItemListOrBuilderList() {
                if (this.itemListBuilder_ != null) {
                    return this.itemListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParamOrBuilder>)this.itemList_);
            }
            
            public ItemParamOuterClass.ItemParam.Builder addItemListBuilder() {
                return this.getItemListFieldBuilder().addBuilder(ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public ItemParamOuterClass.ItemParam.Builder addItemListBuilder(final int index) {
                return this.getItemListFieldBuilder().addBuilder(index, ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public List<ItemParamOuterClass.ItemParam.Builder> getItemListBuilderList() {
                return this.getItemListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> getItemListFieldBuilder() {
                if (this.itemListBuilder_ == null) {
                    this.itemListBuilder_ = new RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder>(this.itemList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.itemList_ = null;
                }
                return this.itemListBuilder_;
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
    
    public interface BattlePassBuySuccNotifyOrBuilder extends MessageOrBuilder
    {
        int getScheduleId();
        
        int getProductPlayType();
        
        int getAddPoint();
        
        List<ItemParamOuterClass.ItemParam> getItemListList();
        
        ItemParamOuterClass.ItemParam getItemList(final int p0);
        
        int getItemListCount();
        
        List<? extends ItemParamOuterClass.ItemParamOrBuilder> getItemListOrBuilderList();
        
        ItemParamOuterClass.ItemParamOrBuilder getItemListOrBuilder(final int p0);
    }
}
