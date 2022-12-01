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

public final class GadgetAutoPickDropInfoNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_GadgetAutoPickDropInfoNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GadgetAutoPickDropInfoNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GadgetAutoPickDropInfoNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GadgetAutoPickDropInfoNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\"GadgetAutoPickDropInfoNotify.proto\u001a\nItem.proto\"8\n\u001cGadgetAutoPickDropInfoNotify\u0012\u0018\n\titem_list\u0018\u000b \u0003(\u000b2\u0005.ItemB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GadgetAutoPickDropInfoNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ItemOuterClass.getDescriptor() });
        internal_static_GadgetAutoPickDropInfoNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GadgetAutoPickDropInfoNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GadgetAutoPickDropInfoNotifyOuterClass.internal_static_GadgetAutoPickDropInfoNotify_descriptor, new String[] { "ItemList" });
        ItemOuterClass.getDescriptor();
    }
    
    public static final class GadgetAutoPickDropInfoNotify extends GeneratedMessageV3 implements GadgetAutoPickDropInfoNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ITEM_LIST_FIELD_NUMBER = 11;
        private List<ItemOuterClass.Item> itemList_;
        private byte memoizedIsInitialized;
        private static final GadgetAutoPickDropInfoNotify DEFAULT_INSTANCE;
        private static final Parser<GadgetAutoPickDropInfoNotify> PARSER;
        
        private GadgetAutoPickDropInfoNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private GadgetAutoPickDropInfoNotify() {
            this.memoizedIsInitialized = -1;
            this.itemList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GadgetAutoPickDropInfoNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GadgetAutoPickDropInfoNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 90: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.itemList_ = new ArrayList<ItemOuterClass.Item>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.itemList_.add(input.readMessage(ItemOuterClass.Item.parser(), extensionRegistry));
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
            return GadgetAutoPickDropInfoNotifyOuterClass.internal_static_GadgetAutoPickDropInfoNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GadgetAutoPickDropInfoNotifyOuterClass.internal_static_GadgetAutoPickDropInfoNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(GadgetAutoPickDropInfoNotify.class, Builder.class);
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
                output.writeMessage(11, this.itemList_.get(i));
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
                size += CodedOutputStream.computeMessageSize(11, this.itemList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GadgetAutoPickDropInfoNotify)) {
                return super.equals(obj);
            }
            final GadgetAutoPickDropInfoNotify other = (GadgetAutoPickDropInfoNotify)obj;
            return this.getItemListList().equals(other.getItemListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getItemListCount() > 0) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.getItemListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GadgetAutoPickDropInfoNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GadgetAutoPickDropInfoNotify.PARSER.parseFrom(data);
        }
        
        public static GadgetAutoPickDropInfoNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GadgetAutoPickDropInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GadgetAutoPickDropInfoNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GadgetAutoPickDropInfoNotify.PARSER.parseFrom(data);
        }
        
        public static GadgetAutoPickDropInfoNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GadgetAutoPickDropInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GadgetAutoPickDropInfoNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GadgetAutoPickDropInfoNotify.PARSER.parseFrom(data);
        }
        
        public static GadgetAutoPickDropInfoNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GadgetAutoPickDropInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GadgetAutoPickDropInfoNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GadgetAutoPickDropInfoNotify.PARSER, input);
        }
        
        public static GadgetAutoPickDropInfoNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GadgetAutoPickDropInfoNotify.PARSER, input, extensionRegistry);
        }
        
        public static GadgetAutoPickDropInfoNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GadgetAutoPickDropInfoNotify.PARSER, input);
        }
        
        public static GadgetAutoPickDropInfoNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GadgetAutoPickDropInfoNotify.PARSER, input, extensionRegistry);
        }
        
        public static GadgetAutoPickDropInfoNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GadgetAutoPickDropInfoNotify.PARSER, input);
        }
        
        public static GadgetAutoPickDropInfoNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GadgetAutoPickDropInfoNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GadgetAutoPickDropInfoNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GadgetAutoPickDropInfoNotify prototype) {
            return GadgetAutoPickDropInfoNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GadgetAutoPickDropInfoNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GadgetAutoPickDropInfoNotify getDefaultInstance() {
            return GadgetAutoPickDropInfoNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<GadgetAutoPickDropInfoNotify> parser() {
            return GadgetAutoPickDropInfoNotify.PARSER;
        }
        
        @Override
        public Parser<GadgetAutoPickDropInfoNotify> getParserForType() {
            return GadgetAutoPickDropInfoNotify.PARSER;
        }
        
        @Override
        public GadgetAutoPickDropInfoNotify getDefaultInstanceForType() {
            return GadgetAutoPickDropInfoNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GadgetAutoPickDropInfoNotify();
            PARSER = new AbstractParser<GadgetAutoPickDropInfoNotify>() {
                @Override
                public GadgetAutoPickDropInfoNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GadgetAutoPickDropInfoNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GadgetAutoPickDropInfoNotifyOrBuilder
        {
            private int bitField0_;
            private List<ItemOuterClass.Item> itemList_;
            private RepeatedFieldBuilderV3<ItemOuterClass.Item, ItemOuterClass.Item.Builder, ItemOuterClass.ItemOrBuilder> itemListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GadgetAutoPickDropInfoNotifyOuterClass.internal_static_GadgetAutoPickDropInfoNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GadgetAutoPickDropInfoNotifyOuterClass.internal_static_GadgetAutoPickDropInfoNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(GadgetAutoPickDropInfoNotify.class, Builder.class);
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
                if (GadgetAutoPickDropInfoNotify.alwaysUseFieldBuilders) {
                    this.getItemListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
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
                return GadgetAutoPickDropInfoNotifyOuterClass.internal_static_GadgetAutoPickDropInfoNotify_descriptor;
            }
            
            @Override
            public GadgetAutoPickDropInfoNotify getDefaultInstanceForType() {
                return GadgetAutoPickDropInfoNotify.getDefaultInstance();
            }
            
            @Override
            public GadgetAutoPickDropInfoNotify build() {
                final GadgetAutoPickDropInfoNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GadgetAutoPickDropInfoNotify buildPartial() {
                final GadgetAutoPickDropInfoNotify result = new GadgetAutoPickDropInfoNotify(this);
                final int from_bitField0_ = this.bitField0_;
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
                if (other instanceof GadgetAutoPickDropInfoNotify) {
                    return this.mergeFrom((GadgetAutoPickDropInfoNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GadgetAutoPickDropInfoNotify other) {
                if (other == GadgetAutoPickDropInfoNotify.getDefaultInstance()) {
                    return this;
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
                        this.itemListBuilder_ = (GadgetAutoPickDropInfoNotify.alwaysUseFieldBuilders ? this.getItemListFieldBuilder() : null);
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
                GadgetAutoPickDropInfoNotify parsedMessage = null;
                try {
                    parsedMessage = GadgetAutoPickDropInfoNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GadgetAutoPickDropInfoNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
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
    
    public interface GadgetAutoPickDropInfoNotifyOrBuilder extends MessageOrBuilder
    {
        List<ItemOuterClass.Item> getItemListList();
        
        ItemOuterClass.Item getItemList(final int p0);
        
        int getItemListCount();
        
        List<? extends ItemOuterClass.ItemOrBuilder> getItemListOrBuilderList();
        
        ItemOuterClass.ItemOrBuilder getItemListOrBuilder(final int p0);
    }
}
