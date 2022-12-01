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

public final class BlossomBriefInfoNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_BlossomBriefInfoNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BlossomBriefInfoNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private BlossomBriefInfoNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return BlossomBriefInfoNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cBlossomBriefInfoNotify.proto\u001a\u0016BlossomBriefInfo.proto\"D\n\u0016BlossomBriefInfoNotify\u0012*\n\u000fbrief_info_list\u0018\u0004 \u0003(\u000b2\u0011.BlossomBriefInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        BlossomBriefInfoNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { BlossomBriefInfoOuterClass.getDescriptor() });
        internal_static_BlossomBriefInfoNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_BlossomBriefInfoNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(BlossomBriefInfoNotifyOuterClass.internal_static_BlossomBriefInfoNotify_descriptor, new String[] { "BriefInfoList" });
        BlossomBriefInfoOuterClass.getDescriptor();
    }
    
    public static final class BlossomBriefInfoNotify extends GeneratedMessageV3 implements BlossomBriefInfoNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int BRIEF_INFO_LIST_FIELD_NUMBER = 4;
        private List<BlossomBriefInfoOuterClass.BlossomBriefInfo> briefInfoList_;
        private byte memoizedIsInitialized;
        private static final BlossomBriefInfoNotify DEFAULT_INSTANCE;
        private static final Parser<BlossomBriefInfoNotify> PARSER;
        
        private BlossomBriefInfoNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private BlossomBriefInfoNotify() {
            this.memoizedIsInitialized = -1;
            this.briefInfoList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new BlossomBriefInfoNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private BlossomBriefInfoNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 34: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.briefInfoList_ = new ArrayList<BlossomBriefInfoOuterClass.BlossomBriefInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.briefInfoList_.add(input.readMessage(BlossomBriefInfoOuterClass.BlossomBriefInfo.parser(), extensionRegistry));
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
                    this.briefInfoList_ = Collections.unmodifiableList((List<? extends BlossomBriefInfoOuterClass.BlossomBriefInfo>)this.briefInfoList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return BlossomBriefInfoNotifyOuterClass.internal_static_BlossomBriefInfoNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return BlossomBriefInfoNotifyOuterClass.internal_static_BlossomBriefInfoNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(BlossomBriefInfoNotify.class, Builder.class);
        }
        
        @Override
        public List<BlossomBriefInfoOuterClass.BlossomBriefInfo> getBriefInfoListList() {
            return this.briefInfoList_;
        }
        
        @Override
        public List<? extends BlossomBriefInfoOuterClass.BlossomBriefInfoOrBuilder> getBriefInfoListOrBuilderList() {
            return this.briefInfoList_;
        }
        
        @Override
        public int getBriefInfoListCount() {
            return this.briefInfoList_.size();
        }
        
        @Override
        public BlossomBriefInfoOuterClass.BlossomBriefInfo getBriefInfoList(final int index) {
            return this.briefInfoList_.get(index);
        }
        
        @Override
        public BlossomBriefInfoOuterClass.BlossomBriefInfoOrBuilder getBriefInfoListOrBuilder(final int index) {
            return this.briefInfoList_.get(index);
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
            for (int i = 0; i < this.briefInfoList_.size(); ++i) {
                output.writeMessage(4, this.briefInfoList_.get(i));
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
            for (int i = 0; i < this.briefInfoList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(4, this.briefInfoList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BlossomBriefInfoNotify)) {
                return super.equals(obj);
            }
            final BlossomBriefInfoNotify other = (BlossomBriefInfoNotify)obj;
            return this.getBriefInfoListList().equals(other.getBriefInfoListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getBriefInfoListCount() > 0) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getBriefInfoListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static BlossomBriefInfoNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return BlossomBriefInfoNotify.PARSER.parseFrom(data);
        }
        
        public static BlossomBriefInfoNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BlossomBriefInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BlossomBriefInfoNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return BlossomBriefInfoNotify.PARSER.parseFrom(data);
        }
        
        public static BlossomBriefInfoNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BlossomBriefInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BlossomBriefInfoNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return BlossomBriefInfoNotify.PARSER.parseFrom(data);
        }
        
        public static BlossomBriefInfoNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BlossomBriefInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BlossomBriefInfoNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BlossomBriefInfoNotify.PARSER, input);
        }
        
        public static BlossomBriefInfoNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BlossomBriefInfoNotify.PARSER, input, extensionRegistry);
        }
        
        public static BlossomBriefInfoNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BlossomBriefInfoNotify.PARSER, input);
        }
        
        public static BlossomBriefInfoNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BlossomBriefInfoNotify.PARSER, input, extensionRegistry);
        }
        
        public static BlossomBriefInfoNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BlossomBriefInfoNotify.PARSER, input);
        }
        
        public static BlossomBriefInfoNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BlossomBriefInfoNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return BlossomBriefInfoNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final BlossomBriefInfoNotify prototype) {
            return BlossomBriefInfoNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == BlossomBriefInfoNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static BlossomBriefInfoNotify getDefaultInstance() {
            return BlossomBriefInfoNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<BlossomBriefInfoNotify> parser() {
            return BlossomBriefInfoNotify.PARSER;
        }
        
        @Override
        public Parser<BlossomBriefInfoNotify> getParserForType() {
            return BlossomBriefInfoNotify.PARSER;
        }
        
        @Override
        public BlossomBriefInfoNotify getDefaultInstanceForType() {
            return BlossomBriefInfoNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new BlossomBriefInfoNotify();
            PARSER = new AbstractParser<BlossomBriefInfoNotify>() {
                @Override
                public BlossomBriefInfoNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new BlossomBriefInfoNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BlossomBriefInfoNotifyOrBuilder
        {
            private int bitField0_;
            private List<BlossomBriefInfoOuterClass.BlossomBriefInfo> briefInfoList_;
            private RepeatedFieldBuilderV3<BlossomBriefInfoOuterClass.BlossomBriefInfo, BlossomBriefInfoOuterClass.BlossomBriefInfo.Builder, BlossomBriefInfoOuterClass.BlossomBriefInfoOrBuilder> briefInfoListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return BlossomBriefInfoNotifyOuterClass.internal_static_BlossomBriefInfoNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return BlossomBriefInfoNotifyOuterClass.internal_static_BlossomBriefInfoNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(BlossomBriefInfoNotify.class, Builder.class);
            }
            
            private Builder() {
                this.briefInfoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.briefInfoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (BlossomBriefInfoNotify.alwaysUseFieldBuilders) {
                    this.getBriefInfoListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.briefInfoListBuilder_ == null) {
                    this.briefInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.briefInfoListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return BlossomBriefInfoNotifyOuterClass.internal_static_BlossomBriefInfoNotify_descriptor;
            }
            
            @Override
            public BlossomBriefInfoNotify getDefaultInstanceForType() {
                return BlossomBriefInfoNotify.getDefaultInstance();
            }
            
            @Override
            public BlossomBriefInfoNotify build() {
                final BlossomBriefInfoNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public BlossomBriefInfoNotify buildPartial() {
                final BlossomBriefInfoNotify result = new BlossomBriefInfoNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.briefInfoListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.briefInfoList_ = Collections.unmodifiableList((List<? extends BlossomBriefInfoOuterClass.BlossomBriefInfo>)this.briefInfoList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.briefInfoList_ = this.briefInfoList_;
                }
                else {
                    result.briefInfoList_ = this.briefInfoListBuilder_.build();
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
                if (other instanceof BlossomBriefInfoNotify) {
                    return this.mergeFrom((BlossomBriefInfoNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final BlossomBriefInfoNotify other) {
                if (other == BlossomBriefInfoNotify.getDefaultInstance()) {
                    return this;
                }
                if (this.briefInfoListBuilder_ == null) {
                    if (!other.briefInfoList_.isEmpty()) {
                        if (this.briefInfoList_.isEmpty()) {
                            this.briefInfoList_ = other.briefInfoList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureBriefInfoListIsMutable();
                            this.briefInfoList_.addAll(other.briefInfoList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.briefInfoList_.isEmpty()) {
                    if (this.briefInfoListBuilder_.isEmpty()) {
                        this.briefInfoListBuilder_.dispose();
                        this.briefInfoListBuilder_ = null;
                        this.briefInfoList_ = other.briefInfoList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.briefInfoListBuilder_ = (BlossomBriefInfoNotify.alwaysUseFieldBuilders ? this.getBriefInfoListFieldBuilder() : null);
                    }
                    else {
                        this.briefInfoListBuilder_.addAllMessages(other.briefInfoList_);
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
                BlossomBriefInfoNotify parsedMessage = null;
                try {
                    parsedMessage = BlossomBriefInfoNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (BlossomBriefInfoNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureBriefInfoListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.briefInfoList_ = new ArrayList<BlossomBriefInfoOuterClass.BlossomBriefInfo>(this.briefInfoList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<BlossomBriefInfoOuterClass.BlossomBriefInfo> getBriefInfoListList() {
                if (this.briefInfoListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends BlossomBriefInfoOuterClass.BlossomBriefInfo>)this.briefInfoList_);
                }
                return this.briefInfoListBuilder_.getMessageList();
            }
            
            @Override
            public int getBriefInfoListCount() {
                if (this.briefInfoListBuilder_ == null) {
                    return this.briefInfoList_.size();
                }
                return this.briefInfoListBuilder_.getCount();
            }
            
            @Override
            public BlossomBriefInfoOuterClass.BlossomBriefInfo getBriefInfoList(final int index) {
                if (this.briefInfoListBuilder_ == null) {
                    return this.briefInfoList_.get(index);
                }
                return this.briefInfoListBuilder_.getMessage(index);
            }
            
            public Builder setBriefInfoList(final int index, final BlossomBriefInfoOuterClass.BlossomBriefInfo value) {
                if (this.briefInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureBriefInfoListIsMutable();
                    this.briefInfoList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.briefInfoListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setBriefInfoList(final int index, final BlossomBriefInfoOuterClass.BlossomBriefInfo.Builder builderForValue) {
                if (this.briefInfoListBuilder_ == null) {
                    this.ensureBriefInfoListIsMutable();
                    this.briefInfoList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.briefInfoListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addBriefInfoList(final BlossomBriefInfoOuterClass.BlossomBriefInfo value) {
                if (this.briefInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureBriefInfoListIsMutable();
                    this.briefInfoList_.add(value);
                    this.onChanged();
                }
                else {
                    this.briefInfoListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addBriefInfoList(final int index, final BlossomBriefInfoOuterClass.BlossomBriefInfo value) {
                if (this.briefInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureBriefInfoListIsMutable();
                    this.briefInfoList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.briefInfoListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addBriefInfoList(final BlossomBriefInfoOuterClass.BlossomBriefInfo.Builder builderForValue) {
                if (this.briefInfoListBuilder_ == null) {
                    this.ensureBriefInfoListIsMutable();
                    this.briefInfoList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.briefInfoListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addBriefInfoList(final int index, final BlossomBriefInfoOuterClass.BlossomBriefInfo.Builder builderForValue) {
                if (this.briefInfoListBuilder_ == null) {
                    this.ensureBriefInfoListIsMutable();
                    this.briefInfoList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.briefInfoListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllBriefInfoList(final Iterable<? extends BlossomBriefInfoOuterClass.BlossomBriefInfo> values) {
                if (this.briefInfoListBuilder_ == null) {
                    this.ensureBriefInfoListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.briefInfoList_);
                    this.onChanged();
                }
                else {
                    this.briefInfoListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearBriefInfoList() {
                if (this.briefInfoListBuilder_ == null) {
                    this.briefInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.briefInfoListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeBriefInfoList(final int index) {
                if (this.briefInfoListBuilder_ == null) {
                    this.ensureBriefInfoListIsMutable();
                    this.briefInfoList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.briefInfoListBuilder_.remove(index);
                }
                return this;
            }
            
            public BlossomBriefInfoOuterClass.BlossomBriefInfo.Builder getBriefInfoListBuilder(final int index) {
                return this.getBriefInfoListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public BlossomBriefInfoOuterClass.BlossomBriefInfoOrBuilder getBriefInfoListOrBuilder(final int index) {
                if (this.briefInfoListBuilder_ == null) {
                    return this.briefInfoList_.get(index);
                }
                return this.briefInfoListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends BlossomBriefInfoOuterClass.BlossomBriefInfoOrBuilder> getBriefInfoListOrBuilderList() {
                if (this.briefInfoListBuilder_ != null) {
                    return this.briefInfoListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends BlossomBriefInfoOuterClass.BlossomBriefInfoOrBuilder>)this.briefInfoList_);
            }
            
            public BlossomBriefInfoOuterClass.BlossomBriefInfo.Builder addBriefInfoListBuilder() {
                return this.getBriefInfoListFieldBuilder().addBuilder(BlossomBriefInfoOuterClass.BlossomBriefInfo.getDefaultInstance());
            }
            
            public BlossomBriefInfoOuterClass.BlossomBriefInfo.Builder addBriefInfoListBuilder(final int index) {
                return this.getBriefInfoListFieldBuilder().addBuilder(index, BlossomBriefInfoOuterClass.BlossomBriefInfo.getDefaultInstance());
            }
            
            public List<BlossomBriefInfoOuterClass.BlossomBriefInfo.Builder> getBriefInfoListBuilderList() {
                return this.getBriefInfoListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<BlossomBriefInfoOuterClass.BlossomBriefInfo, BlossomBriefInfoOuterClass.BlossomBriefInfo.Builder, BlossomBriefInfoOuterClass.BlossomBriefInfoOrBuilder> getBriefInfoListFieldBuilder() {
                if (this.briefInfoListBuilder_ == null) {
                    this.briefInfoListBuilder_ = new RepeatedFieldBuilderV3<BlossomBriefInfoOuterClass.BlossomBriefInfo, BlossomBriefInfoOuterClass.BlossomBriefInfo.Builder, BlossomBriefInfoOuterClass.BlossomBriefInfoOrBuilder>(this.briefInfoList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.briefInfoList_ = null;
                }
                return this.briefInfoListBuilder_;
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
    
    public interface BlossomBriefInfoNotifyOrBuilder extends MessageOrBuilder
    {
        List<BlossomBriefInfoOuterClass.BlossomBriefInfo> getBriefInfoListList();
        
        BlossomBriefInfoOuterClass.BlossomBriefInfo getBriefInfoList(final int p0);
        
        int getBriefInfoListCount();
        
        List<? extends BlossomBriefInfoOuterClass.BlossomBriefInfoOrBuilder> getBriefInfoListOrBuilderList();
        
        BlossomBriefInfoOuterClass.BlossomBriefInfoOrBuilder getBriefInfoListOrBuilder(final int p0);
    }
}
