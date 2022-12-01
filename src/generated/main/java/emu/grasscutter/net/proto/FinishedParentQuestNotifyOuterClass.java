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

public final class FinishedParentQuestNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_FinishedParentQuestNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_FinishedParentQuestNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private FinishedParentQuestNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return FinishedParentQuestNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001fFinishedParentQuestNotify.proto\u001a\u0011ParentQuest.proto\"D\n\u0019FinishedParentQuestNotify\u0012'\n\u0011parent_quest_list\u0018\u0002 \u0003(\u000b2\f.ParentQuestB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        FinishedParentQuestNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ParentQuestOuterClass.getDescriptor() });
        internal_static_FinishedParentQuestNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_FinishedParentQuestNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(FinishedParentQuestNotifyOuterClass.internal_static_FinishedParentQuestNotify_descriptor, new String[] { "ParentQuestList" });
        ParentQuestOuterClass.getDescriptor();
    }
    
    public static final class FinishedParentQuestNotify extends GeneratedMessageV3 implements FinishedParentQuestNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int PARENT_QUEST_LIST_FIELD_NUMBER = 2;
        private List<ParentQuestOuterClass.ParentQuest> parentQuestList_;
        private byte memoizedIsInitialized;
        private static final FinishedParentQuestNotify DEFAULT_INSTANCE;
        private static final Parser<FinishedParentQuestNotify> PARSER;
        
        private FinishedParentQuestNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private FinishedParentQuestNotify() {
            this.memoizedIsInitialized = -1;
            this.parentQuestList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new FinishedParentQuestNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private FinishedParentQuestNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 18: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.parentQuestList_ = new ArrayList<ParentQuestOuterClass.ParentQuest>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.parentQuestList_.add(input.readMessage(ParentQuestOuterClass.ParentQuest.parser(), extensionRegistry));
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
                    this.parentQuestList_ = Collections.unmodifiableList((List<? extends ParentQuestOuterClass.ParentQuest>)this.parentQuestList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return FinishedParentQuestNotifyOuterClass.internal_static_FinishedParentQuestNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return FinishedParentQuestNotifyOuterClass.internal_static_FinishedParentQuestNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(FinishedParentQuestNotify.class, Builder.class);
        }
        
        @Override
        public List<ParentQuestOuterClass.ParentQuest> getParentQuestListList() {
            return this.parentQuestList_;
        }
        
        @Override
        public List<? extends ParentQuestOuterClass.ParentQuestOrBuilder> getParentQuestListOrBuilderList() {
            return this.parentQuestList_;
        }
        
        @Override
        public int getParentQuestListCount() {
            return this.parentQuestList_.size();
        }
        
        @Override
        public ParentQuestOuterClass.ParentQuest getParentQuestList(final int index) {
            return this.parentQuestList_.get(index);
        }
        
        @Override
        public ParentQuestOuterClass.ParentQuestOrBuilder getParentQuestListOrBuilder(final int index) {
            return this.parentQuestList_.get(index);
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
            for (int i = 0; i < this.parentQuestList_.size(); ++i) {
                output.writeMessage(2, this.parentQuestList_.get(i));
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
            for (int i = 0; i < this.parentQuestList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(2, this.parentQuestList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FinishedParentQuestNotify)) {
                return super.equals(obj);
            }
            final FinishedParentQuestNotify other = (FinishedParentQuestNotify)obj;
            return this.getParentQuestListList().equals(other.getParentQuestListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getParentQuestListCount() > 0) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getParentQuestListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static FinishedParentQuestNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return FinishedParentQuestNotify.PARSER.parseFrom(data);
        }
        
        public static FinishedParentQuestNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FinishedParentQuestNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FinishedParentQuestNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return FinishedParentQuestNotify.PARSER.parseFrom(data);
        }
        
        public static FinishedParentQuestNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FinishedParentQuestNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FinishedParentQuestNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return FinishedParentQuestNotify.PARSER.parseFrom(data);
        }
        
        public static FinishedParentQuestNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FinishedParentQuestNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FinishedParentQuestNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FinishedParentQuestNotify.PARSER, input);
        }
        
        public static FinishedParentQuestNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FinishedParentQuestNotify.PARSER, input, extensionRegistry);
        }
        
        public static FinishedParentQuestNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FinishedParentQuestNotify.PARSER, input);
        }
        
        public static FinishedParentQuestNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FinishedParentQuestNotify.PARSER, input, extensionRegistry);
        }
        
        public static FinishedParentQuestNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FinishedParentQuestNotify.PARSER, input);
        }
        
        public static FinishedParentQuestNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FinishedParentQuestNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return FinishedParentQuestNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final FinishedParentQuestNotify prototype) {
            return FinishedParentQuestNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == FinishedParentQuestNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static FinishedParentQuestNotify getDefaultInstance() {
            return FinishedParentQuestNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<FinishedParentQuestNotify> parser() {
            return FinishedParentQuestNotify.PARSER;
        }
        
        @Override
        public Parser<FinishedParentQuestNotify> getParserForType() {
            return FinishedParentQuestNotify.PARSER;
        }
        
        @Override
        public FinishedParentQuestNotify getDefaultInstanceForType() {
            return FinishedParentQuestNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new FinishedParentQuestNotify();
            PARSER = new AbstractParser<FinishedParentQuestNotify>() {
                @Override
                public FinishedParentQuestNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new FinishedParentQuestNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FinishedParentQuestNotifyOrBuilder
        {
            private int bitField0_;
            private List<ParentQuestOuterClass.ParentQuest> parentQuestList_;
            private RepeatedFieldBuilderV3<ParentQuestOuterClass.ParentQuest, ParentQuestOuterClass.ParentQuest.Builder, ParentQuestOuterClass.ParentQuestOrBuilder> parentQuestListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return FinishedParentQuestNotifyOuterClass.internal_static_FinishedParentQuestNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return FinishedParentQuestNotifyOuterClass.internal_static_FinishedParentQuestNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(FinishedParentQuestNotify.class, Builder.class);
            }
            
            private Builder() {
                this.parentQuestList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.parentQuestList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (FinishedParentQuestNotify.alwaysUseFieldBuilders) {
                    this.getParentQuestListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.parentQuestListBuilder_ == null) {
                    this.parentQuestList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.parentQuestListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return FinishedParentQuestNotifyOuterClass.internal_static_FinishedParentQuestNotify_descriptor;
            }
            
            @Override
            public FinishedParentQuestNotify getDefaultInstanceForType() {
                return FinishedParentQuestNotify.getDefaultInstance();
            }
            
            @Override
            public FinishedParentQuestNotify build() {
                final FinishedParentQuestNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public FinishedParentQuestNotify buildPartial() {
                final FinishedParentQuestNotify result = new FinishedParentQuestNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.parentQuestListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.parentQuestList_ = Collections.unmodifiableList((List<? extends ParentQuestOuterClass.ParentQuest>)this.parentQuestList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.parentQuestList_ = this.parentQuestList_;
                }
                else {
                    result.parentQuestList_ = this.parentQuestListBuilder_.build();
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
                if (other instanceof FinishedParentQuestNotify) {
                    return this.mergeFrom((FinishedParentQuestNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final FinishedParentQuestNotify other) {
                if (other == FinishedParentQuestNotify.getDefaultInstance()) {
                    return this;
                }
                if (this.parentQuestListBuilder_ == null) {
                    if (!other.parentQuestList_.isEmpty()) {
                        if (this.parentQuestList_.isEmpty()) {
                            this.parentQuestList_ = other.parentQuestList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureParentQuestListIsMutable();
                            this.parentQuestList_.addAll(other.parentQuestList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.parentQuestList_.isEmpty()) {
                    if (this.parentQuestListBuilder_.isEmpty()) {
                        this.parentQuestListBuilder_.dispose();
                        this.parentQuestListBuilder_ = null;
                        this.parentQuestList_ = other.parentQuestList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.parentQuestListBuilder_ = (FinishedParentQuestNotify.alwaysUseFieldBuilders ? this.getParentQuestListFieldBuilder() : null);
                    }
                    else {
                        this.parentQuestListBuilder_.addAllMessages(other.parentQuestList_);
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
                FinishedParentQuestNotify parsedMessage = null;
                try {
                    parsedMessage = FinishedParentQuestNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (FinishedParentQuestNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureParentQuestListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.parentQuestList_ = new ArrayList<ParentQuestOuterClass.ParentQuest>(this.parentQuestList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<ParentQuestOuterClass.ParentQuest> getParentQuestListList() {
                if (this.parentQuestListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ParentQuestOuterClass.ParentQuest>)this.parentQuestList_);
                }
                return this.parentQuestListBuilder_.getMessageList();
            }
            
            @Override
            public int getParentQuestListCount() {
                if (this.parentQuestListBuilder_ == null) {
                    return this.parentQuestList_.size();
                }
                return this.parentQuestListBuilder_.getCount();
            }
            
            @Override
            public ParentQuestOuterClass.ParentQuest getParentQuestList(final int index) {
                if (this.parentQuestListBuilder_ == null) {
                    return this.parentQuestList_.get(index);
                }
                return this.parentQuestListBuilder_.getMessage(index);
            }
            
            public Builder setParentQuestList(final int index, final ParentQuestOuterClass.ParentQuest value) {
                if (this.parentQuestListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureParentQuestListIsMutable();
                    this.parentQuestList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.parentQuestListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setParentQuestList(final int index, final ParentQuestOuterClass.ParentQuest.Builder builderForValue) {
                if (this.parentQuestListBuilder_ == null) {
                    this.ensureParentQuestListIsMutable();
                    this.parentQuestList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.parentQuestListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addParentQuestList(final ParentQuestOuterClass.ParentQuest value) {
                if (this.parentQuestListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureParentQuestListIsMutable();
                    this.parentQuestList_.add(value);
                    this.onChanged();
                }
                else {
                    this.parentQuestListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addParentQuestList(final int index, final ParentQuestOuterClass.ParentQuest value) {
                if (this.parentQuestListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureParentQuestListIsMutable();
                    this.parentQuestList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.parentQuestListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addParentQuestList(final ParentQuestOuterClass.ParentQuest.Builder builderForValue) {
                if (this.parentQuestListBuilder_ == null) {
                    this.ensureParentQuestListIsMutable();
                    this.parentQuestList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.parentQuestListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addParentQuestList(final int index, final ParentQuestOuterClass.ParentQuest.Builder builderForValue) {
                if (this.parentQuestListBuilder_ == null) {
                    this.ensureParentQuestListIsMutable();
                    this.parentQuestList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.parentQuestListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllParentQuestList(final Iterable<? extends ParentQuestOuterClass.ParentQuest> values) {
                if (this.parentQuestListBuilder_ == null) {
                    this.ensureParentQuestListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.parentQuestList_);
                    this.onChanged();
                }
                else {
                    this.parentQuestListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearParentQuestList() {
                if (this.parentQuestListBuilder_ == null) {
                    this.parentQuestList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.parentQuestListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeParentQuestList(final int index) {
                if (this.parentQuestListBuilder_ == null) {
                    this.ensureParentQuestListIsMutable();
                    this.parentQuestList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.parentQuestListBuilder_.remove(index);
                }
                return this;
            }
            
            public ParentQuestOuterClass.ParentQuest.Builder getParentQuestListBuilder(final int index) {
                return this.getParentQuestListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ParentQuestOuterClass.ParentQuestOrBuilder getParentQuestListOrBuilder(final int index) {
                if (this.parentQuestListBuilder_ == null) {
                    return this.parentQuestList_.get(index);
                }
                return this.parentQuestListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ParentQuestOuterClass.ParentQuestOrBuilder> getParentQuestListOrBuilderList() {
                if (this.parentQuestListBuilder_ != null) {
                    return this.parentQuestListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ParentQuestOuterClass.ParentQuestOrBuilder>)this.parentQuestList_);
            }
            
            public ParentQuestOuterClass.ParentQuest.Builder addParentQuestListBuilder() {
                return this.getParentQuestListFieldBuilder().addBuilder(ParentQuestOuterClass.ParentQuest.getDefaultInstance());
            }
            
            public ParentQuestOuterClass.ParentQuest.Builder addParentQuestListBuilder(final int index) {
                return this.getParentQuestListFieldBuilder().addBuilder(index, ParentQuestOuterClass.ParentQuest.getDefaultInstance());
            }
            
            public List<ParentQuestOuterClass.ParentQuest.Builder> getParentQuestListBuilderList() {
                return this.getParentQuestListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ParentQuestOuterClass.ParentQuest, ParentQuestOuterClass.ParentQuest.Builder, ParentQuestOuterClass.ParentQuestOrBuilder> getParentQuestListFieldBuilder() {
                if (this.parentQuestListBuilder_ == null) {
                    this.parentQuestListBuilder_ = new RepeatedFieldBuilderV3<ParentQuestOuterClass.ParentQuest, ParentQuestOuterClass.ParentQuest.Builder, ParentQuestOuterClass.ParentQuestOrBuilder>(this.parentQuestList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.parentQuestList_ = null;
                }
                return this.parentQuestListBuilder_;
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
    
    public interface FinishedParentQuestNotifyOrBuilder extends MessageOrBuilder
    {
        List<ParentQuestOuterClass.ParentQuest> getParentQuestListList();
        
        ParentQuestOuterClass.ParentQuest getParentQuestList(final int p0);
        
        int getParentQuestListCount();
        
        List<? extends ParentQuestOuterClass.ParentQuestOrBuilder> getParentQuestListOrBuilderList();
        
        ParentQuestOuterClass.ParentQuestOrBuilder getParentQuestListOrBuilder(final int p0);
    }
}
