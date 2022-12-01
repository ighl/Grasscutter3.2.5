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

public final class TakeCompoundOutputRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_TakeCompoundOutputRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TakeCompoundOutputRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TakeCompoundOutputRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TakeCompoundOutputRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bTakeCompoundOutputRsp.proto\u001a\u000fItemParam.proto\"G\n\u0015TakeCompoundOutputRsp\u0012\u001d\n\titem_list\u0018\u0006 \u0003(\u000b2\n.ItemParam\u0012\u000f\n\u0007retcode\u0018\u0002 \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TakeCompoundOutputRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ItemParamOuterClass.getDescriptor() });
        internal_static_TakeCompoundOutputRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TakeCompoundOutputRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TakeCompoundOutputRspOuterClass.internal_static_TakeCompoundOutputRsp_descriptor, new String[] { "ItemList", "Retcode" });
        ItemParamOuterClass.getDescriptor();
    }
    
    public static final class TakeCompoundOutputRsp extends GeneratedMessageV3 implements TakeCompoundOutputRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ITEM_LIST_FIELD_NUMBER = 6;
        private List<ItemParamOuterClass.ItemParam> itemList_;
        public static final int RETCODE_FIELD_NUMBER = 2;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final TakeCompoundOutputRsp DEFAULT_INSTANCE;
        private static final Parser<TakeCompoundOutputRsp> PARSER;
        
        private TakeCompoundOutputRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private TakeCompoundOutputRsp() {
            this.memoizedIsInitialized = -1;
            this.itemList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TakeCompoundOutputRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TakeCompoundOutputRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 16: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 50: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.itemList_ = new ArrayList<ItemParamOuterClass.ItemParam>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.itemList_.add(input.readMessage(ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
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
            return TakeCompoundOutputRspOuterClass.internal_static_TakeCompoundOutputRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TakeCompoundOutputRspOuterClass.internal_static_TakeCompoundOutputRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(TakeCompoundOutputRsp.class, Builder.class);
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
        public int getRetcode() {
            return this.retcode_;
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
            if (this.retcode_ != 0) {
                output.writeInt32(2, this.retcode_);
            }
            for (int i = 0; i < this.itemList_.size(); ++i) {
                output.writeMessage(6, this.itemList_.get(i));
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
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(2, this.retcode_);
            }
            for (int i = 0; i < this.itemList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(6, this.itemList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TakeCompoundOutputRsp)) {
                return super.equals(obj);
            }
            final TakeCompoundOutputRsp other = (TakeCompoundOutputRsp)obj;
            return this.getItemListList().equals(other.getItemListList()) && this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getItemListCount() > 0) {
                hash = 37 * hash + 6;
                hash = 53 * hash + this.getItemListList().hashCode();
            }
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TakeCompoundOutputRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TakeCompoundOutputRsp.PARSER.parseFrom(data);
        }
        
        public static TakeCompoundOutputRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeCompoundOutputRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeCompoundOutputRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TakeCompoundOutputRsp.PARSER.parseFrom(data);
        }
        
        public static TakeCompoundOutputRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeCompoundOutputRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeCompoundOutputRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TakeCompoundOutputRsp.PARSER.parseFrom(data);
        }
        
        public static TakeCompoundOutputRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeCompoundOutputRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeCompoundOutputRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeCompoundOutputRsp.PARSER, input);
        }
        
        public static TakeCompoundOutputRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeCompoundOutputRsp.PARSER, input, extensionRegistry);
        }
        
        public static TakeCompoundOutputRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TakeCompoundOutputRsp.PARSER, input);
        }
        
        public static TakeCompoundOutputRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TakeCompoundOutputRsp.PARSER, input, extensionRegistry);
        }
        
        public static TakeCompoundOutputRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeCompoundOutputRsp.PARSER, input);
        }
        
        public static TakeCompoundOutputRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeCompoundOutputRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TakeCompoundOutputRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TakeCompoundOutputRsp prototype) {
            return TakeCompoundOutputRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TakeCompoundOutputRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TakeCompoundOutputRsp getDefaultInstance() {
            return TakeCompoundOutputRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<TakeCompoundOutputRsp> parser() {
            return TakeCompoundOutputRsp.PARSER;
        }
        
        @Override
        public Parser<TakeCompoundOutputRsp> getParserForType() {
            return TakeCompoundOutputRsp.PARSER;
        }
        
        @Override
        public TakeCompoundOutputRsp getDefaultInstanceForType() {
            return TakeCompoundOutputRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TakeCompoundOutputRsp();
            PARSER = new AbstractParser<TakeCompoundOutputRsp>() {
                @Override
                public TakeCompoundOutputRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TakeCompoundOutputRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TakeCompoundOutputRspOrBuilder
        {
            private int bitField0_;
            private List<ItemParamOuterClass.ItemParam> itemList_;
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> itemListBuilder_;
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TakeCompoundOutputRspOuterClass.internal_static_TakeCompoundOutputRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TakeCompoundOutputRspOuterClass.internal_static_TakeCompoundOutputRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(TakeCompoundOutputRsp.class, Builder.class);
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
                if (TakeCompoundOutputRsp.alwaysUseFieldBuilders) {
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
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TakeCompoundOutputRspOuterClass.internal_static_TakeCompoundOutputRsp_descriptor;
            }
            
            @Override
            public TakeCompoundOutputRsp getDefaultInstanceForType() {
                return TakeCompoundOutputRsp.getDefaultInstance();
            }
            
            @Override
            public TakeCompoundOutputRsp build() {
                final TakeCompoundOutputRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TakeCompoundOutputRsp buildPartial() {
                final TakeCompoundOutputRsp result = new TakeCompoundOutputRsp(this);
                final int from_bitField0_ = this.bitField0_;
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
                result.retcode_ = this.retcode_;
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
                if (other instanceof TakeCompoundOutputRsp) {
                    return this.mergeFrom((TakeCompoundOutputRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TakeCompoundOutputRsp other) {
                if (other == TakeCompoundOutputRsp.getDefaultInstance()) {
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
                        this.itemListBuilder_ = (TakeCompoundOutputRsp.alwaysUseFieldBuilders ? this.getItemListFieldBuilder() : null);
                    }
                    else {
                        this.itemListBuilder_.addAllMessages(other.itemList_);
                    }
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
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
                TakeCompoundOutputRsp parsedMessage = null;
                try {
                    parsedMessage = TakeCompoundOutputRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TakeCompoundOutputRsp)e.getUnfinishedMessage();
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
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
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
    
    public interface TakeCompoundOutputRspOrBuilder extends MessageOrBuilder
    {
        List<ItemParamOuterClass.ItemParam> getItemListList();
        
        ItemParamOuterClass.ItemParam getItemList(final int p0);
        
        int getItemListCount();
        
        List<? extends ItemParamOuterClass.ItemParamOrBuilder> getItemListOrBuilderList();
        
        ItemParamOuterClass.ItemParamOrBuilder getItemListOrBuilder(final int p0);
        
        int getRetcode();
    }
}
