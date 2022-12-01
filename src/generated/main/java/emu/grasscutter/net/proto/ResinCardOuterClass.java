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

public final class ResinCardOuterClass
{
    private static final Descriptors.Descriptor internal_static_ResinCard_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ResinCard_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ResinCardOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ResinCardOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u000fResinCard.proto\u001a\u000fItemParam.proto\"Q\n\tResinCard\u0012 \n\fbaseItemList\u0018\u0001 \u0003(\u000b2\n.ItemParam\u0012\"\n\u000eperDayItemList\u0018\u0002 \u0003(\u000b2\n.ItemParamB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ResinCardOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ItemParamOuterClass.getDescriptor() });
        internal_static_ResinCard_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ResinCard_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ResinCardOuterClass.internal_static_ResinCard_descriptor, new String[] { "BaseItemList", "PerDayItemList" });
        ItemParamOuterClass.getDescriptor();
    }
    
    public static final class ResinCard extends GeneratedMessageV3 implements ResinCardOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int BASEITEMLIST_FIELD_NUMBER = 1;
        private List<ItemParamOuterClass.ItemParam> baseItemList_;
        public static final int PERDAYITEMLIST_FIELD_NUMBER = 2;
        private List<ItemParamOuterClass.ItemParam> perDayItemList_;
        private byte memoizedIsInitialized;
        private static final ResinCard DEFAULT_INSTANCE;
        private static final Parser<ResinCard> PARSER;
        
        private ResinCard(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ResinCard() {
            this.memoizedIsInitialized = -1;
            this.baseItemList_ = Collections.emptyList();
            this.perDayItemList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ResinCard();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ResinCard(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 10: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.baseItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.baseItemList_.add(input.readMessage(ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
                            continue;
                        }
                        case 18: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.perDayItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.perDayItemList_.add(input.readMessage(ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
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
                    this.baseItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.baseItemList_);
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.perDayItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.perDayItemList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ResinCardOuterClass.internal_static_ResinCard_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ResinCardOuterClass.internal_static_ResinCard_fieldAccessorTable.ensureFieldAccessorsInitialized(ResinCard.class, Builder.class);
        }
        
        @Override
        public List<ItemParamOuterClass.ItemParam> getBaseItemListList() {
            return this.baseItemList_;
        }
        
        @Override
        public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getBaseItemListOrBuilderList() {
            return this.baseItemList_;
        }
        
        @Override
        public int getBaseItemListCount() {
            return this.baseItemList_.size();
        }
        
        @Override
        public ItemParamOuterClass.ItemParam getBaseItemList(final int index) {
            return this.baseItemList_.get(index);
        }
        
        @Override
        public ItemParamOuterClass.ItemParamOrBuilder getBaseItemListOrBuilder(final int index) {
            return this.baseItemList_.get(index);
        }
        
        @Override
        public List<ItemParamOuterClass.ItemParam> getPerDayItemListList() {
            return this.perDayItemList_;
        }
        
        @Override
        public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getPerDayItemListOrBuilderList() {
            return this.perDayItemList_;
        }
        
        @Override
        public int getPerDayItemListCount() {
            return this.perDayItemList_.size();
        }
        
        @Override
        public ItemParamOuterClass.ItemParam getPerDayItemList(final int index) {
            return this.perDayItemList_.get(index);
        }
        
        @Override
        public ItemParamOuterClass.ItemParamOrBuilder getPerDayItemListOrBuilder(final int index) {
            return this.perDayItemList_.get(index);
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
            for (int i = 0; i < this.baseItemList_.size(); ++i) {
                output.writeMessage(1, this.baseItemList_.get(i));
            }
            for (int i = 0; i < this.perDayItemList_.size(); ++i) {
                output.writeMessage(2, this.perDayItemList_.get(i));
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
            for (int i = 0; i < this.baseItemList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(1, this.baseItemList_.get(i));
            }
            for (int i = 0; i < this.perDayItemList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(2, this.perDayItemList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ResinCard)) {
                return super.equals(obj);
            }
            final ResinCard other = (ResinCard)obj;
            return this.getBaseItemListList().equals(other.getBaseItemListList()) && this.getPerDayItemListList().equals(other.getPerDayItemListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getBaseItemListCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getBaseItemListList().hashCode();
            }
            if (this.getPerDayItemListCount() > 0) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getPerDayItemListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ResinCard parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ResinCard.PARSER.parseFrom(data);
        }
        
        public static ResinCard parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ResinCard.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ResinCard parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ResinCard.PARSER.parseFrom(data);
        }
        
        public static ResinCard parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ResinCard.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ResinCard parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ResinCard.PARSER.parseFrom(data);
        }
        
        public static ResinCard parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ResinCard.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ResinCard parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ResinCard.PARSER, input);
        }
        
        public static ResinCard parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ResinCard.PARSER, input, extensionRegistry);
        }
        
        public static ResinCard parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ResinCard.PARSER, input);
        }
        
        public static ResinCard parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ResinCard.PARSER, input, extensionRegistry);
        }
        
        public static ResinCard parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ResinCard.PARSER, input);
        }
        
        public static ResinCard parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ResinCard.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ResinCard.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ResinCard prototype) {
            return ResinCard.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ResinCard.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ResinCard getDefaultInstance() {
            return ResinCard.DEFAULT_INSTANCE;
        }
        
        public static Parser<ResinCard> parser() {
            return ResinCard.PARSER;
        }
        
        @Override
        public Parser<ResinCard> getParserForType() {
            return ResinCard.PARSER;
        }
        
        @Override
        public ResinCard getDefaultInstanceForType() {
            return ResinCard.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ResinCard();
            PARSER = new AbstractParser<ResinCard>() {
                @Override
                public ResinCard parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ResinCard(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ResinCardOrBuilder
        {
            private int bitField0_;
            private List<ItemParamOuterClass.ItemParam> baseItemList_;
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> baseItemListBuilder_;
            private List<ItemParamOuterClass.ItemParam> perDayItemList_;
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> perDayItemListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ResinCardOuterClass.internal_static_ResinCard_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ResinCardOuterClass.internal_static_ResinCard_fieldAccessorTable.ensureFieldAccessorsInitialized(ResinCard.class, Builder.class);
            }
            
            private Builder() {
                this.baseItemList_ = Collections.emptyList();
                this.perDayItemList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.baseItemList_ = Collections.emptyList();
                this.perDayItemList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ResinCard.alwaysUseFieldBuilders) {
                    this.getBaseItemListFieldBuilder();
                    this.getPerDayItemListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.baseItemListBuilder_ == null) {
                    this.baseItemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.baseItemListBuilder_.clear();
                }
                if (this.perDayItemListBuilder_ == null) {
                    this.perDayItemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                else {
                    this.perDayItemListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ResinCardOuterClass.internal_static_ResinCard_descriptor;
            }
            
            @Override
            public ResinCard getDefaultInstanceForType() {
                return ResinCard.getDefaultInstance();
            }
            
            @Override
            public ResinCard build() {
                final ResinCard result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ResinCard buildPartial() {
                final ResinCard result = new ResinCard(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.baseItemListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.baseItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.baseItemList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.baseItemList_ = this.baseItemList_;
                }
                else {
                    result.baseItemList_ = this.baseItemListBuilder_.build();
                }
                if (this.perDayItemListBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) != 0x0) {
                        this.perDayItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.perDayItemList_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.perDayItemList_ = this.perDayItemList_;
                }
                else {
                    result.perDayItemList_ = this.perDayItemListBuilder_.build();
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
                if (other instanceof ResinCard) {
                    return this.mergeFrom((ResinCard)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ResinCard other) {
                if (other == ResinCard.getDefaultInstance()) {
                    return this;
                }
                if (this.baseItemListBuilder_ == null) {
                    if (!other.baseItemList_.isEmpty()) {
                        if (this.baseItemList_.isEmpty()) {
                            this.baseItemList_ = other.baseItemList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureBaseItemListIsMutable();
                            this.baseItemList_.addAll(other.baseItemList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.baseItemList_.isEmpty()) {
                    if (this.baseItemListBuilder_.isEmpty()) {
                        this.baseItemListBuilder_.dispose();
                        this.baseItemListBuilder_ = null;
                        this.baseItemList_ = other.baseItemList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.baseItemListBuilder_ = (ResinCard.alwaysUseFieldBuilders ? this.getBaseItemListFieldBuilder() : null);
                    }
                    else {
                        this.baseItemListBuilder_.addAllMessages(other.baseItemList_);
                    }
                }
                if (this.perDayItemListBuilder_ == null) {
                    if (!other.perDayItemList_.isEmpty()) {
                        if (this.perDayItemList_.isEmpty()) {
                            this.perDayItemList_ = other.perDayItemList_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        }
                        else {
                            this.ensurePerDayItemListIsMutable();
                            this.perDayItemList_.addAll(other.perDayItemList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.perDayItemList_.isEmpty()) {
                    if (this.perDayItemListBuilder_.isEmpty()) {
                        this.perDayItemListBuilder_.dispose();
                        this.perDayItemListBuilder_ = null;
                        this.perDayItemList_ = other.perDayItemList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.perDayItemListBuilder_ = (ResinCard.alwaysUseFieldBuilders ? this.getPerDayItemListFieldBuilder() : null);
                    }
                    else {
                        this.perDayItemListBuilder_.addAllMessages(other.perDayItemList_);
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
                ResinCard parsedMessage = null;
                try {
                    parsedMessage = ResinCard.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ResinCard)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureBaseItemListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.baseItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>(this.baseItemList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<ItemParamOuterClass.ItemParam> getBaseItemListList() {
                if (this.baseItemListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.baseItemList_);
                }
                return this.baseItemListBuilder_.getMessageList();
            }
            
            @Override
            public int getBaseItemListCount() {
                if (this.baseItemListBuilder_ == null) {
                    return this.baseItemList_.size();
                }
                return this.baseItemListBuilder_.getCount();
            }
            
            @Override
            public ItemParamOuterClass.ItemParam getBaseItemList(final int index) {
                if (this.baseItemListBuilder_ == null) {
                    return this.baseItemList_.get(index);
                }
                return this.baseItemListBuilder_.getMessage(index);
            }
            
            public Builder setBaseItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.baseItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureBaseItemListIsMutable();
                    this.baseItemList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.baseItemListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setBaseItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.baseItemListBuilder_ == null) {
                    this.ensureBaseItemListIsMutable();
                    this.baseItemList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.baseItemListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addBaseItemList(final ItemParamOuterClass.ItemParam value) {
                if (this.baseItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureBaseItemListIsMutable();
                    this.baseItemList_.add(value);
                    this.onChanged();
                }
                else {
                    this.baseItemListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addBaseItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.baseItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureBaseItemListIsMutable();
                    this.baseItemList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.baseItemListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addBaseItemList(final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.baseItemListBuilder_ == null) {
                    this.ensureBaseItemListIsMutable();
                    this.baseItemList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.baseItemListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addBaseItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.baseItemListBuilder_ == null) {
                    this.ensureBaseItemListIsMutable();
                    this.baseItemList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.baseItemListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllBaseItemList(final Iterable<? extends ItemParamOuterClass.ItemParam> values) {
                if (this.baseItemListBuilder_ == null) {
                    this.ensureBaseItemListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.baseItemList_);
                    this.onChanged();
                }
                else {
                    this.baseItemListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearBaseItemList() {
                if (this.baseItemListBuilder_ == null) {
                    this.baseItemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.baseItemListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeBaseItemList(final int index) {
                if (this.baseItemListBuilder_ == null) {
                    this.ensureBaseItemListIsMutable();
                    this.baseItemList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.baseItemListBuilder_.remove(index);
                }
                return this;
            }
            
            public ItemParamOuterClass.ItemParam.Builder getBaseItemListBuilder(final int index) {
                return this.getBaseItemListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ItemParamOuterClass.ItemParamOrBuilder getBaseItemListOrBuilder(final int index) {
                if (this.baseItemListBuilder_ == null) {
                    return this.baseItemList_.get(index);
                }
                return this.baseItemListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getBaseItemListOrBuilderList() {
                if (this.baseItemListBuilder_ != null) {
                    return this.baseItemListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParamOrBuilder>)this.baseItemList_);
            }
            
            public ItemParamOuterClass.ItemParam.Builder addBaseItemListBuilder() {
                return this.getBaseItemListFieldBuilder().addBuilder(ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public ItemParamOuterClass.ItemParam.Builder addBaseItemListBuilder(final int index) {
                return this.getBaseItemListFieldBuilder().addBuilder(index, ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public List<ItemParamOuterClass.ItemParam.Builder> getBaseItemListBuilderList() {
                return this.getBaseItemListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> getBaseItemListFieldBuilder() {
                if (this.baseItemListBuilder_ == null) {
                    this.baseItemListBuilder_ = new RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder>(this.baseItemList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.baseItemList_ = null;
                }
                return this.baseItemListBuilder_;
            }
            
            private void ensurePerDayItemListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.perDayItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>(this.perDayItemList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<ItemParamOuterClass.ItemParam> getPerDayItemListList() {
                if (this.perDayItemListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.perDayItemList_);
                }
                return this.perDayItemListBuilder_.getMessageList();
            }
            
            @Override
            public int getPerDayItemListCount() {
                if (this.perDayItemListBuilder_ == null) {
                    return this.perDayItemList_.size();
                }
                return this.perDayItemListBuilder_.getCount();
            }
            
            @Override
            public ItemParamOuterClass.ItemParam getPerDayItemList(final int index) {
                if (this.perDayItemListBuilder_ == null) {
                    return this.perDayItemList_.get(index);
                }
                return this.perDayItemListBuilder_.getMessage(index);
            }
            
            public Builder setPerDayItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.perDayItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePerDayItemListIsMutable();
                    this.perDayItemList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.perDayItemListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setPerDayItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.perDayItemListBuilder_ == null) {
                    this.ensurePerDayItemListIsMutable();
                    this.perDayItemList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.perDayItemListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addPerDayItemList(final ItemParamOuterClass.ItemParam value) {
                if (this.perDayItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePerDayItemListIsMutable();
                    this.perDayItemList_.add(value);
                    this.onChanged();
                }
                else {
                    this.perDayItemListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addPerDayItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.perDayItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePerDayItemListIsMutable();
                    this.perDayItemList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.perDayItemListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addPerDayItemList(final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.perDayItemListBuilder_ == null) {
                    this.ensurePerDayItemListIsMutable();
                    this.perDayItemList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.perDayItemListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addPerDayItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.perDayItemListBuilder_ == null) {
                    this.ensurePerDayItemListIsMutable();
                    this.perDayItemList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.perDayItemListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllPerDayItemList(final Iterable<? extends ItemParamOuterClass.ItemParam> values) {
                if (this.perDayItemListBuilder_ == null) {
                    this.ensurePerDayItemListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.perDayItemList_);
                    this.onChanged();
                }
                else {
                    this.perDayItemListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearPerDayItemList() {
                if (this.perDayItemListBuilder_ == null) {
                    this.perDayItemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    this.onChanged();
                }
                else {
                    this.perDayItemListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removePerDayItemList(final int index) {
                if (this.perDayItemListBuilder_ == null) {
                    this.ensurePerDayItemListIsMutable();
                    this.perDayItemList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.perDayItemListBuilder_.remove(index);
                }
                return this;
            }
            
            public ItemParamOuterClass.ItemParam.Builder getPerDayItemListBuilder(final int index) {
                return this.getPerDayItemListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ItemParamOuterClass.ItemParamOrBuilder getPerDayItemListOrBuilder(final int index) {
                if (this.perDayItemListBuilder_ == null) {
                    return this.perDayItemList_.get(index);
                }
                return this.perDayItemListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getPerDayItemListOrBuilderList() {
                if (this.perDayItemListBuilder_ != null) {
                    return this.perDayItemListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParamOrBuilder>)this.perDayItemList_);
            }
            
            public ItemParamOuterClass.ItemParam.Builder addPerDayItemListBuilder() {
                return this.getPerDayItemListFieldBuilder().addBuilder(ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public ItemParamOuterClass.ItemParam.Builder addPerDayItemListBuilder(final int index) {
                return this.getPerDayItemListFieldBuilder().addBuilder(index, ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public List<ItemParamOuterClass.ItemParam.Builder> getPerDayItemListBuilderList() {
                return this.getPerDayItemListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> getPerDayItemListFieldBuilder() {
                if (this.perDayItemListBuilder_ == null) {
                    this.perDayItemListBuilder_ = new RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder>(this.perDayItemList_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
                    this.perDayItemList_ = null;
                }
                return this.perDayItemListBuilder_;
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
    
    public interface ResinCardOrBuilder extends MessageOrBuilder
    {
        List<ItemParamOuterClass.ItemParam> getBaseItemListList();
        
        ItemParamOuterClass.ItemParam getBaseItemList(final int p0);
        
        int getBaseItemListCount();
        
        List<? extends ItemParamOuterClass.ItemParamOrBuilder> getBaseItemListOrBuilderList();
        
        ItemParamOuterClass.ItemParamOrBuilder getBaseItemListOrBuilder(final int p0);
        
        List<ItemParamOuterClass.ItemParam> getPerDayItemListList();
        
        ItemParamOuterClass.ItemParam getPerDayItemList(final int p0);
        
        int getPerDayItemListCount();
        
        List<? extends ItemParamOuterClass.ItemParamOrBuilder> getPerDayItemListOrBuilderList();
        
        ItemParamOuterClass.ItemParamOrBuilder getPerDayItemListOrBuilder(final int p0);
    }
}
