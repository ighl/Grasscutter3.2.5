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

public final class StoreItemChangeNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_StoreItemChangeNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_StoreItemChangeNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private StoreItemChangeNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return StoreItemChangeNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bStoreItemChangeNotify.proto\u001a\nItem.proto\u001a\u000fStoreType.proto\"Q\n\u0015StoreItemChangeNotify\u0012\u001e\n\nstore_type\u0018\u000f \u0001(\u000e2\n.StoreType\u0012\u0018\n\titem_list\u0018\n \u0003(\u000b2\u0005.ItemB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        StoreItemChangeNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ItemOuterClass.getDescriptor(), StoreTypeOuterClass.getDescriptor() });
        internal_static_StoreItemChangeNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_StoreItemChangeNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(StoreItemChangeNotifyOuterClass.internal_static_StoreItemChangeNotify_descriptor, new String[] { "StoreType", "ItemList" });
        ItemOuterClass.getDescriptor();
        StoreTypeOuterClass.getDescriptor();
    }
    
    public static final class StoreItemChangeNotify extends GeneratedMessageV3 implements StoreItemChangeNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int STORE_TYPE_FIELD_NUMBER = 15;
        private int storeType_;
        public static final int ITEM_LIST_FIELD_NUMBER = 10;
        private List<ItemOuterClass.Item> itemList_;
        private byte memoizedIsInitialized;
        private static final StoreItemChangeNotify DEFAULT_INSTANCE;
        private static final Parser<StoreItemChangeNotify> PARSER;
        
        private StoreItemChangeNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private StoreItemChangeNotify() {
            this.memoizedIsInitialized = -1;
            this.storeType_ = 0;
            this.itemList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new StoreItemChangeNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private StoreItemChangeNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 82: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.itemList_ = new ArrayList<ItemOuterClass.Item>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.itemList_.add(input.readMessage(ItemOuterClass.Item.parser(), extensionRegistry));
                            continue;
                        }
                        case 120: {
                            final int rawValue = input.readEnum();
                            this.storeType_ = rawValue;
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
                    this.itemList_ = Collections.unmodifiableList((List<? extends ItemOuterClass.Item>)this.itemList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return StoreItemChangeNotifyOuterClass.internal_static_StoreItemChangeNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return StoreItemChangeNotifyOuterClass.internal_static_StoreItemChangeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(StoreItemChangeNotify.class, Builder.class);
        }
        
        @Override
        public int getStoreTypeValue() {
            return this.storeType_;
        }
        
        @Override
        public StoreTypeOuterClass.StoreType getStoreType() {
            final StoreTypeOuterClass.StoreType result = StoreTypeOuterClass.StoreType.valueOf(this.storeType_);
            return (result == null) ? StoreTypeOuterClass.StoreType.UNRECOGNIZED : result;
        }
        
        @Override
        public List<ItemOuterClass.Item> getItemListList() {
            return this.itemList_;
        }
        
        @Override
        public List<? extends ItemOuterClass.ItemOrBuilder> getItemListOrBuilderList() {
            return this.itemList_;
        }
        
        @Override
        public int getItemListCount() {
            return this.itemList_.size();
        }
        
        @Override
        public ItemOuterClass.Item getItemList(final int index) {
            return this.itemList_.get(index);
        }
        
        @Override
        public ItemOuterClass.ItemOrBuilder getItemListOrBuilder(final int index) {
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
            for (int i = 0; i < this.itemList_.size(); ++i) {
                output.writeMessage(10, this.itemList_.get(i));
            }
            if (this.storeType_ != StoreTypeOuterClass.StoreType.STORE_TYPE_NONE.getNumber()) {
                output.writeEnum(15, this.storeType_);
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
            for (int i = 0; i < this.itemList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(10, this.itemList_.get(i));
            }
            if (this.storeType_ != StoreTypeOuterClass.StoreType.STORE_TYPE_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(15, this.storeType_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StoreItemChangeNotify)) {
                return super.equals(obj);
            }
            final StoreItemChangeNotify other = (StoreItemChangeNotify)obj;
            return this.storeType_ == other.storeType_ && this.getItemListList().equals(other.getItemListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.storeType_;
            if (this.getItemListCount() > 0) {
                hash = 37 * hash + 10;
                hash = 53 * hash + this.getItemListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static StoreItemChangeNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return StoreItemChangeNotify.PARSER.parseFrom(data);
        }
        
        public static StoreItemChangeNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return StoreItemChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static StoreItemChangeNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return StoreItemChangeNotify.PARSER.parseFrom(data);
        }
        
        public static StoreItemChangeNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return StoreItemChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static StoreItemChangeNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return StoreItemChangeNotify.PARSER.parseFrom(data);
        }
        
        public static StoreItemChangeNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return StoreItemChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static StoreItemChangeNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(StoreItemChangeNotify.PARSER, input);
        }
        
        public static StoreItemChangeNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(StoreItemChangeNotify.PARSER, input, extensionRegistry);
        }
        
        public static StoreItemChangeNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(StoreItemChangeNotify.PARSER, input);
        }
        
        public static StoreItemChangeNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(StoreItemChangeNotify.PARSER, input, extensionRegistry);
        }
        
        public static StoreItemChangeNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(StoreItemChangeNotify.PARSER, input);
        }
        
        public static StoreItemChangeNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(StoreItemChangeNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return StoreItemChangeNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final StoreItemChangeNotify prototype) {
            return StoreItemChangeNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == StoreItemChangeNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static StoreItemChangeNotify getDefaultInstance() {
            return StoreItemChangeNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<StoreItemChangeNotify> parser() {
            return StoreItemChangeNotify.PARSER;
        }
        
        @Override
        public Parser<StoreItemChangeNotify> getParserForType() {
            return StoreItemChangeNotify.PARSER;
        }
        
        @Override
        public StoreItemChangeNotify getDefaultInstanceForType() {
            return StoreItemChangeNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new StoreItemChangeNotify();
            PARSER = new AbstractParser<StoreItemChangeNotify>() {
                @Override
                public StoreItemChangeNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new StoreItemChangeNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StoreItemChangeNotifyOrBuilder
        {
            private int bitField0_;
            private int storeType_;
            private List<ItemOuterClass.Item> itemList_;
            private RepeatedFieldBuilderV3<ItemOuterClass.Item, ItemOuterClass.Item.Builder, ItemOuterClass.ItemOrBuilder> itemListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return StoreItemChangeNotifyOuterClass.internal_static_StoreItemChangeNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return StoreItemChangeNotifyOuterClass.internal_static_StoreItemChangeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(StoreItemChangeNotify.class, Builder.class);
            }
            
            private Builder() {
                this.storeType_ = 0;
                this.itemList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.storeType_ = 0;
                this.itemList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (StoreItemChangeNotify.alwaysUseFieldBuilders) {
                    this.getItemListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.storeType_ = 0;
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
                return StoreItemChangeNotifyOuterClass.internal_static_StoreItemChangeNotify_descriptor;
            }
            
            @Override
            public StoreItemChangeNotify getDefaultInstanceForType() {
                return StoreItemChangeNotify.getDefaultInstance();
            }
            
            @Override
            public StoreItemChangeNotify build() {
                final StoreItemChangeNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public StoreItemChangeNotify buildPartial() {
                final StoreItemChangeNotify result = new StoreItemChangeNotify(this);
                final int from_bitField0_ = this.bitField0_;
                result.storeType_ = this.storeType_;
                if (this.itemListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.itemList_ = Collections.unmodifiableList((List<? extends ItemOuterClass.Item>)this.itemList_);
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
                if (other instanceof StoreItemChangeNotify) {
                    return this.mergeFrom((StoreItemChangeNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final StoreItemChangeNotify other) {
                if (other == StoreItemChangeNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.storeType_ != 0) {
                    this.setStoreTypeValue(other.getStoreTypeValue());
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
                        this.itemListBuilder_ = (StoreItemChangeNotify.alwaysUseFieldBuilders ? this.getItemListFieldBuilder() : null);
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
                StoreItemChangeNotify parsedMessage = null;
                try {
                    parsedMessage = StoreItemChangeNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (StoreItemChangeNotify)e.getUnfinishedMessage();
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
            public int getStoreTypeValue() {
                return this.storeType_;
            }
            
            public Builder setStoreTypeValue(final int value) {
                this.storeType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public StoreTypeOuterClass.StoreType getStoreType() {
                final StoreTypeOuterClass.StoreType result = StoreTypeOuterClass.StoreType.valueOf(this.storeType_);
                return (result == null) ? StoreTypeOuterClass.StoreType.UNRECOGNIZED : result;
            }
            
            public Builder setStoreType(final StoreTypeOuterClass.StoreType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.storeType_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearStoreType() {
                this.storeType_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureItemListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.itemList_ = new ArrayList<ItemOuterClass.Item>(this.itemList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<ItemOuterClass.Item> getItemListList() {
                if (this.itemListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ItemOuterClass.Item>)this.itemList_);
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
            public ItemOuterClass.Item getItemList(final int index) {
                if (this.itemListBuilder_ == null) {
                    return this.itemList_.get(index);
                }
                return this.itemListBuilder_.getMessage(index);
            }
            
            public Builder setItemList(final int index, final ItemOuterClass.Item value) {
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
            
            public Builder setItemList(final int index, final ItemOuterClass.Item.Builder builderForValue) {
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
            
            public Builder addItemList(final ItemOuterClass.Item value) {
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
            
            public Builder addItemList(final int index, final ItemOuterClass.Item value) {
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
            
            public Builder addItemList(final ItemOuterClass.Item.Builder builderForValue) {
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
            
            public Builder addItemList(final int index, final ItemOuterClass.Item.Builder builderForValue) {
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
            
            public Builder addAllItemList(final Iterable<? extends ItemOuterClass.Item> values) {
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
            
            public ItemOuterClass.Item.Builder getItemListBuilder(final int index) {
                return this.getItemListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ItemOuterClass.ItemOrBuilder getItemListOrBuilder(final int index) {
                if (this.itemListBuilder_ == null) {
                    return this.itemList_.get(index);
                }
                return this.itemListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ItemOuterClass.ItemOrBuilder> getItemListOrBuilderList() {
                if (this.itemListBuilder_ != null) {
                    return this.itemListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ItemOuterClass.ItemOrBuilder>)this.itemList_);
            }
            
            public ItemOuterClass.Item.Builder addItemListBuilder() {
                return this.getItemListFieldBuilder().addBuilder(ItemOuterClass.Item.getDefaultInstance());
            }
            
            public ItemOuterClass.Item.Builder addItemListBuilder(final int index) {
                return this.getItemListFieldBuilder().addBuilder(index, ItemOuterClass.Item.getDefaultInstance());
            }
            
            public List<ItemOuterClass.Item.Builder> getItemListBuilderList() {
                return this.getItemListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ItemOuterClass.Item, ItemOuterClass.Item.Builder, ItemOuterClass.ItemOrBuilder> getItemListFieldBuilder() {
                if (this.itemListBuilder_ == null) {
                    this.itemListBuilder_ = new RepeatedFieldBuilderV3<ItemOuterClass.Item, ItemOuterClass.Item.Builder, ItemOuterClass.ItemOrBuilder>(this.itemList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
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
    
    public interface StoreItemChangeNotifyOrBuilder extends MessageOrBuilder
    {
        int getStoreTypeValue();
        
        StoreTypeOuterClass.StoreType getStoreType();
        
        List<ItemOuterClass.Item> getItemListList();
        
        ItemOuterClass.Item getItemList(final int p0);
        
        int getItemListCount();
        
        List<? extends ItemOuterClass.ItemOrBuilder> getItemListOrBuilderList();
        
        ItemOuterClass.ItemOrBuilder getItemListOrBuilder(final int p0);
    }
}
