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

public final class ServerAnnounceNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_ServerAnnounceNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ServerAnnounceNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ServerAnnounceNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ServerAnnounceNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001aServerAnnounceNotify.proto\u001a\u0012AnnounceData.proto\"A\n\u0014ServerAnnounceNotify\u0012)\n\u0012announce_data_list\u0018\u000b \u0003(\u000b2\r.AnnounceDataB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ServerAnnounceNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AnnounceDataOuterClass.getDescriptor() });
        internal_static_ServerAnnounceNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ServerAnnounceNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ServerAnnounceNotifyOuterClass.internal_static_ServerAnnounceNotify_descriptor, new String[] { "AnnounceDataList" });
        AnnounceDataOuterClass.getDescriptor();
    }
    
    public static final class ServerAnnounceNotify extends GeneratedMessageV3 implements ServerAnnounceNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ANNOUNCE_DATA_LIST_FIELD_NUMBER = 11;
        private List<AnnounceDataOuterClass.AnnounceData> announceDataList_;
        private byte memoizedIsInitialized;
        private static final ServerAnnounceNotify DEFAULT_INSTANCE;
        private static final Parser<ServerAnnounceNotify> PARSER;
        
        private ServerAnnounceNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ServerAnnounceNotify() {
            this.memoizedIsInitialized = -1;
            this.announceDataList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ServerAnnounceNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ServerAnnounceNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.announceDataList_ = new ArrayList<AnnounceDataOuterClass.AnnounceData>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.announceDataList_.add(input.readMessage(AnnounceDataOuterClass.AnnounceData.parser(), extensionRegistry));
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
                    this.announceDataList_ = Collections.unmodifiableList((List<? extends AnnounceDataOuterClass.AnnounceData>)this.announceDataList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ServerAnnounceNotifyOuterClass.internal_static_ServerAnnounceNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ServerAnnounceNotifyOuterClass.internal_static_ServerAnnounceNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerAnnounceNotify.class, Builder.class);
        }
        
        @Override
        public List<AnnounceDataOuterClass.AnnounceData> getAnnounceDataListList() {
            return this.announceDataList_;
        }
        
        @Override
        public List<? extends AnnounceDataOuterClass.AnnounceDataOrBuilder> getAnnounceDataListOrBuilderList() {
            return this.announceDataList_;
        }
        
        @Override
        public int getAnnounceDataListCount() {
            return this.announceDataList_.size();
        }
        
        @Override
        public AnnounceDataOuterClass.AnnounceData getAnnounceDataList(final int index) {
            return this.announceDataList_.get(index);
        }
        
        @Override
        public AnnounceDataOuterClass.AnnounceDataOrBuilder getAnnounceDataListOrBuilder(final int index) {
            return this.announceDataList_.get(index);
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
            for (int i = 0; i < this.announceDataList_.size(); ++i) {
                output.writeMessage(11, this.announceDataList_.get(i));
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
            for (int i = 0; i < this.announceDataList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(11, this.announceDataList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ServerAnnounceNotify)) {
                return super.equals(obj);
            }
            final ServerAnnounceNotify other = (ServerAnnounceNotify)obj;
            return this.getAnnounceDataListList().equals(other.getAnnounceDataListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getAnnounceDataListCount() > 0) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.getAnnounceDataListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ServerAnnounceNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ServerAnnounceNotify.PARSER.parseFrom(data);
        }
        
        public static ServerAnnounceNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ServerAnnounceNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ServerAnnounceNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ServerAnnounceNotify.PARSER.parseFrom(data);
        }
        
        public static ServerAnnounceNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ServerAnnounceNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ServerAnnounceNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ServerAnnounceNotify.PARSER.parseFrom(data);
        }
        
        public static ServerAnnounceNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ServerAnnounceNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ServerAnnounceNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ServerAnnounceNotify.PARSER, input);
        }
        
        public static ServerAnnounceNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ServerAnnounceNotify.PARSER, input, extensionRegistry);
        }
        
        public static ServerAnnounceNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ServerAnnounceNotify.PARSER, input);
        }
        
        public static ServerAnnounceNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ServerAnnounceNotify.PARSER, input, extensionRegistry);
        }
        
        public static ServerAnnounceNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ServerAnnounceNotify.PARSER, input);
        }
        
        public static ServerAnnounceNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ServerAnnounceNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ServerAnnounceNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ServerAnnounceNotify prototype) {
            return ServerAnnounceNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ServerAnnounceNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ServerAnnounceNotify getDefaultInstance() {
            return ServerAnnounceNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<ServerAnnounceNotify> parser() {
            return ServerAnnounceNotify.PARSER;
        }
        
        @Override
        public Parser<ServerAnnounceNotify> getParserForType() {
            return ServerAnnounceNotify.PARSER;
        }
        
        @Override
        public ServerAnnounceNotify getDefaultInstanceForType() {
            return ServerAnnounceNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ServerAnnounceNotify();
            PARSER = new AbstractParser<ServerAnnounceNotify>() {
                @Override
                public ServerAnnounceNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ServerAnnounceNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServerAnnounceNotifyOrBuilder
        {
            private int bitField0_;
            private List<AnnounceDataOuterClass.AnnounceData> announceDataList_;
            private RepeatedFieldBuilderV3<AnnounceDataOuterClass.AnnounceData, AnnounceDataOuterClass.AnnounceData.Builder, AnnounceDataOuterClass.AnnounceDataOrBuilder> announceDataListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ServerAnnounceNotifyOuterClass.internal_static_ServerAnnounceNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ServerAnnounceNotifyOuterClass.internal_static_ServerAnnounceNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerAnnounceNotify.class, Builder.class);
            }
            
            private Builder() {
                this.announceDataList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.announceDataList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ServerAnnounceNotify.alwaysUseFieldBuilders) {
                    this.getAnnounceDataListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.announceDataListBuilder_ == null) {
                    this.announceDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.announceDataListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ServerAnnounceNotifyOuterClass.internal_static_ServerAnnounceNotify_descriptor;
            }
            
            @Override
            public ServerAnnounceNotify getDefaultInstanceForType() {
                return ServerAnnounceNotify.getDefaultInstance();
            }
            
            @Override
            public ServerAnnounceNotify build() {
                final ServerAnnounceNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ServerAnnounceNotify buildPartial() {
                final ServerAnnounceNotify result = new ServerAnnounceNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.announceDataListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.announceDataList_ = Collections.unmodifiableList((List<? extends AnnounceDataOuterClass.AnnounceData>)this.announceDataList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.announceDataList_ = this.announceDataList_;
                }
                else {
                    result.announceDataList_ = this.announceDataListBuilder_.build();
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
                if (other instanceof ServerAnnounceNotify) {
                    return this.mergeFrom((ServerAnnounceNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ServerAnnounceNotify other) {
                if (other == ServerAnnounceNotify.getDefaultInstance()) {
                    return this;
                }
                if (this.announceDataListBuilder_ == null) {
                    if (!other.announceDataList_.isEmpty()) {
                        if (this.announceDataList_.isEmpty()) {
                            this.announceDataList_ = other.announceDataList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureAnnounceDataListIsMutable();
                            this.announceDataList_.addAll(other.announceDataList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.announceDataList_.isEmpty()) {
                    if (this.announceDataListBuilder_.isEmpty()) {
                        this.announceDataListBuilder_.dispose();
                        this.announceDataListBuilder_ = null;
                        this.announceDataList_ = other.announceDataList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.announceDataListBuilder_ = (ServerAnnounceNotify.alwaysUseFieldBuilders ? this.getAnnounceDataListFieldBuilder() : null);
                    }
                    else {
                        this.announceDataListBuilder_.addAllMessages(other.announceDataList_);
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
                ServerAnnounceNotify parsedMessage = null;
                try {
                    parsedMessage = ServerAnnounceNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ServerAnnounceNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureAnnounceDataListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.announceDataList_ = new ArrayList<AnnounceDataOuterClass.AnnounceData>(this.announceDataList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<AnnounceDataOuterClass.AnnounceData> getAnnounceDataListList() {
                if (this.announceDataListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends AnnounceDataOuterClass.AnnounceData>)this.announceDataList_);
                }
                return this.announceDataListBuilder_.getMessageList();
            }
            
            @Override
            public int getAnnounceDataListCount() {
                if (this.announceDataListBuilder_ == null) {
                    return this.announceDataList_.size();
                }
                return this.announceDataListBuilder_.getCount();
            }
            
            @Override
            public AnnounceDataOuterClass.AnnounceData getAnnounceDataList(final int index) {
                if (this.announceDataListBuilder_ == null) {
                    return this.announceDataList_.get(index);
                }
                return this.announceDataListBuilder_.getMessage(index);
            }
            
            public Builder setAnnounceDataList(final int index, final AnnounceDataOuterClass.AnnounceData value) {
                if (this.announceDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureAnnounceDataListIsMutable();
                    this.announceDataList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.announceDataListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setAnnounceDataList(final int index, final AnnounceDataOuterClass.AnnounceData.Builder builderForValue) {
                if (this.announceDataListBuilder_ == null) {
                    this.ensureAnnounceDataListIsMutable();
                    this.announceDataList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.announceDataListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAnnounceDataList(final AnnounceDataOuterClass.AnnounceData value) {
                if (this.announceDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureAnnounceDataListIsMutable();
                    this.announceDataList_.add(value);
                    this.onChanged();
                }
                else {
                    this.announceDataListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addAnnounceDataList(final int index, final AnnounceDataOuterClass.AnnounceData value) {
                if (this.announceDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureAnnounceDataListIsMutable();
                    this.announceDataList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.announceDataListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addAnnounceDataList(final AnnounceDataOuterClass.AnnounceData.Builder builderForValue) {
                if (this.announceDataListBuilder_ == null) {
                    this.ensureAnnounceDataListIsMutable();
                    this.announceDataList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.announceDataListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addAnnounceDataList(final int index, final AnnounceDataOuterClass.AnnounceData.Builder builderForValue) {
                if (this.announceDataListBuilder_ == null) {
                    this.ensureAnnounceDataListIsMutable();
                    this.announceDataList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.announceDataListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllAnnounceDataList(final Iterable<? extends AnnounceDataOuterClass.AnnounceData> values) {
                if (this.announceDataListBuilder_ == null) {
                    this.ensureAnnounceDataListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.announceDataList_);
                    this.onChanged();
                }
                else {
                    this.announceDataListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearAnnounceDataList() {
                if (this.announceDataListBuilder_ == null) {
                    this.announceDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.announceDataListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeAnnounceDataList(final int index) {
                if (this.announceDataListBuilder_ == null) {
                    this.ensureAnnounceDataListIsMutable();
                    this.announceDataList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.announceDataListBuilder_.remove(index);
                }
                return this;
            }
            
            public AnnounceDataOuterClass.AnnounceData.Builder getAnnounceDataListBuilder(final int index) {
                return this.getAnnounceDataListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public AnnounceDataOuterClass.AnnounceDataOrBuilder getAnnounceDataListOrBuilder(final int index) {
                if (this.announceDataListBuilder_ == null) {
                    return this.announceDataList_.get(index);
                }
                return this.announceDataListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends AnnounceDataOuterClass.AnnounceDataOrBuilder> getAnnounceDataListOrBuilderList() {
                if (this.announceDataListBuilder_ != null) {
                    return this.announceDataListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends AnnounceDataOuterClass.AnnounceDataOrBuilder>)this.announceDataList_);
            }
            
            public AnnounceDataOuterClass.AnnounceData.Builder addAnnounceDataListBuilder() {
                return this.getAnnounceDataListFieldBuilder().addBuilder(AnnounceDataOuterClass.AnnounceData.getDefaultInstance());
            }
            
            public AnnounceDataOuterClass.AnnounceData.Builder addAnnounceDataListBuilder(final int index) {
                return this.getAnnounceDataListFieldBuilder().addBuilder(index, AnnounceDataOuterClass.AnnounceData.getDefaultInstance());
            }
            
            public List<AnnounceDataOuterClass.AnnounceData.Builder> getAnnounceDataListBuilderList() {
                return this.getAnnounceDataListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<AnnounceDataOuterClass.AnnounceData, AnnounceDataOuterClass.AnnounceData.Builder, AnnounceDataOuterClass.AnnounceDataOrBuilder> getAnnounceDataListFieldBuilder() {
                if (this.announceDataListBuilder_ == null) {
                    this.announceDataListBuilder_ = new RepeatedFieldBuilderV3<AnnounceDataOuterClass.AnnounceData, AnnounceDataOuterClass.AnnounceData.Builder, AnnounceDataOuterClass.AnnounceDataOrBuilder>(this.announceDataList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.announceDataList_ = null;
                }
                return this.announceDataListBuilder_;
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
    
    public interface ServerAnnounceNotifyOrBuilder extends MessageOrBuilder
    {
        List<AnnounceDataOuterClass.AnnounceData> getAnnounceDataListList();
        
        AnnounceDataOuterClass.AnnounceData getAnnounceDataList(final int p0);
        
        int getAnnounceDataListCount();
        
        List<? extends AnnounceDataOuterClass.AnnounceDataOrBuilder> getAnnounceDataListOrBuilderList();
        
        AnnounceDataOuterClass.AnnounceDataOrBuilder getAnnounceDataListOrBuilder(final int p0);
    }
}
