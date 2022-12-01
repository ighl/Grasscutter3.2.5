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

public final class GetPlayerBlacklistRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_GetPlayerBlacklistRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GetPlayerBlacklistRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GetPlayerBlacklistRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GetPlayerBlacklistRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bGetPlayerBlacklistRsp.proto\u001a\u0011FriendBrief.proto\"I\n\u0015GetPlayerBlacklistRsp\u0012\u000f\n\u0007retcode\u0018\u0002 \u0001(\u0005\u0012\u001f\n\tblacklist\u0018\u0003 \u0003(\u000b2\f.FriendBriefB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GetPlayerBlacklistRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { FriendBriefOuterClass.getDescriptor() });
        internal_static_GetPlayerBlacklistRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetPlayerBlacklistRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GetPlayerBlacklistRspOuterClass.internal_static_GetPlayerBlacklistRsp_descriptor, new String[] { "Retcode", "Blacklist" });
        FriendBriefOuterClass.getDescriptor();
    }
    
    public static final class GetPlayerBlacklistRsp extends GeneratedMessageV3 implements GetPlayerBlacklistRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 2;
        private int retcode_;
        public static final int BLACKLIST_FIELD_NUMBER = 3;
        private List<FriendBriefOuterClass.FriendBrief> blacklist_;
        private byte memoizedIsInitialized;
        private static final GetPlayerBlacklistRsp DEFAULT_INSTANCE;
        private static final Parser<GetPlayerBlacklistRsp> PARSER;
        
        private GetPlayerBlacklistRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private GetPlayerBlacklistRsp() {
            this.memoizedIsInitialized = -1;
            this.blacklist_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GetPlayerBlacklistRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GetPlayerBlacklistRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 26: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.blacklist_ = new ArrayList<FriendBriefOuterClass.FriendBrief>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.blacklist_.add(input.readMessage(FriendBriefOuterClass.FriendBrief.parser(), extensionRegistry));
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
                    this.blacklist_ = Collections.unmodifiableList((List<? extends FriendBriefOuterClass.FriendBrief>)this.blacklist_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return GetPlayerBlacklistRspOuterClass.internal_static_GetPlayerBlacklistRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GetPlayerBlacklistRspOuterClass.internal_static_GetPlayerBlacklistRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetPlayerBlacklistRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public List<FriendBriefOuterClass.FriendBrief> getBlacklistList() {
            return this.blacklist_;
        }
        
        @Override
        public List<? extends FriendBriefOuterClass.FriendBriefOrBuilder> getBlacklistOrBuilderList() {
            return this.blacklist_;
        }
        
        @Override
        public int getBlacklistCount() {
            return this.blacklist_.size();
        }
        
        @Override
        public FriendBriefOuterClass.FriendBrief getBlacklist(final int index) {
            return this.blacklist_.get(index);
        }
        
        @Override
        public FriendBriefOuterClass.FriendBriefOrBuilder getBlacklistOrBuilder(final int index) {
            return this.blacklist_.get(index);
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
            for (int i = 0; i < this.blacklist_.size(); ++i) {
                output.writeMessage(3, this.blacklist_.get(i));
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
            for (int i = 0; i < this.blacklist_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(3, this.blacklist_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetPlayerBlacklistRsp)) {
                return super.equals(obj);
            }
            final GetPlayerBlacklistRsp other = (GetPlayerBlacklistRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.getBlacklistList().equals(other.getBlacklistList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getRetcode();
            if (this.getBlacklistCount() > 0) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getBlacklistList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GetPlayerBlacklistRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GetPlayerBlacklistRsp.PARSER.parseFrom(data);
        }
        
        public static GetPlayerBlacklistRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetPlayerBlacklistRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetPlayerBlacklistRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GetPlayerBlacklistRsp.PARSER.parseFrom(data);
        }
        
        public static GetPlayerBlacklistRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetPlayerBlacklistRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetPlayerBlacklistRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GetPlayerBlacklistRsp.PARSER.parseFrom(data);
        }
        
        public static GetPlayerBlacklistRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetPlayerBlacklistRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetPlayerBlacklistRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetPlayerBlacklistRsp.PARSER, input);
        }
        
        public static GetPlayerBlacklistRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetPlayerBlacklistRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetPlayerBlacklistRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetPlayerBlacklistRsp.PARSER, input);
        }
        
        public static GetPlayerBlacklistRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetPlayerBlacklistRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetPlayerBlacklistRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetPlayerBlacklistRsp.PARSER, input);
        }
        
        public static GetPlayerBlacklistRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetPlayerBlacklistRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GetPlayerBlacklistRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GetPlayerBlacklistRsp prototype) {
            return GetPlayerBlacklistRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GetPlayerBlacklistRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GetPlayerBlacklistRsp getDefaultInstance() {
            return GetPlayerBlacklistRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<GetPlayerBlacklistRsp> parser() {
            return GetPlayerBlacklistRsp.PARSER;
        }
        
        @Override
        public Parser<GetPlayerBlacklistRsp> getParserForType() {
            return GetPlayerBlacklistRsp.PARSER;
        }
        
        @Override
        public GetPlayerBlacklistRsp getDefaultInstanceForType() {
            return GetPlayerBlacklistRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GetPlayerBlacklistRsp();
            PARSER = new AbstractParser<GetPlayerBlacklistRsp>() {
                @Override
                public GetPlayerBlacklistRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GetPlayerBlacklistRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetPlayerBlacklistRspOrBuilder
        {
            private int bitField0_;
            private int retcode_;
            private List<FriendBriefOuterClass.FriendBrief> blacklist_;
            private RepeatedFieldBuilderV3<FriendBriefOuterClass.FriendBrief, FriendBriefOuterClass.FriendBrief.Builder, FriendBriefOuterClass.FriendBriefOrBuilder> blacklistBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GetPlayerBlacklistRspOuterClass.internal_static_GetPlayerBlacklistRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GetPlayerBlacklistRspOuterClass.internal_static_GetPlayerBlacklistRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetPlayerBlacklistRsp.class, Builder.class);
            }
            
            private Builder() {
                this.blacklist_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.blacklist_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GetPlayerBlacklistRsp.alwaysUseFieldBuilders) {
                    this.getBlacklistFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                if (this.blacklistBuilder_ == null) {
                    this.blacklist_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.blacklistBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GetPlayerBlacklistRspOuterClass.internal_static_GetPlayerBlacklistRsp_descriptor;
            }
            
            @Override
            public GetPlayerBlacklistRsp getDefaultInstanceForType() {
                return GetPlayerBlacklistRsp.getDefaultInstance();
            }
            
            @Override
            public GetPlayerBlacklistRsp build() {
                final GetPlayerBlacklistRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GetPlayerBlacklistRsp buildPartial() {
                final GetPlayerBlacklistRsp result = new GetPlayerBlacklistRsp(this);
                final int from_bitField0_ = this.bitField0_;
                result.retcode_ = this.retcode_;
                if (this.blacklistBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.blacklist_ = Collections.unmodifiableList((List<? extends FriendBriefOuterClass.FriendBrief>)this.blacklist_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.blacklist_ = this.blacklist_;
                }
                else {
                    result.blacklist_ = this.blacklistBuilder_.build();
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
                if (other instanceof GetPlayerBlacklistRsp) {
                    return this.mergeFrom((GetPlayerBlacklistRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GetPlayerBlacklistRsp other) {
                if (other == GetPlayerBlacklistRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (this.blacklistBuilder_ == null) {
                    if (!other.blacklist_.isEmpty()) {
                        if (this.blacklist_.isEmpty()) {
                            this.blacklist_ = other.blacklist_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureBlacklistIsMutable();
                            this.blacklist_.addAll(other.blacklist_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.blacklist_.isEmpty()) {
                    if (this.blacklistBuilder_.isEmpty()) {
                        this.blacklistBuilder_.dispose();
                        this.blacklistBuilder_ = null;
                        this.blacklist_ = other.blacklist_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.blacklistBuilder_ = (GetPlayerBlacklistRsp.alwaysUseFieldBuilders ? this.getBlacklistFieldBuilder() : null);
                    }
                    else {
                        this.blacklistBuilder_.addAllMessages(other.blacklist_);
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
                GetPlayerBlacklistRsp parsedMessage = null;
                try {
                    parsedMessage = GetPlayerBlacklistRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GetPlayerBlacklistRsp)e.getUnfinishedMessage();
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
            
            private void ensureBlacklistIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.blacklist_ = new ArrayList<FriendBriefOuterClass.FriendBrief>(this.blacklist_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<FriendBriefOuterClass.FriendBrief> getBlacklistList() {
                if (this.blacklistBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends FriendBriefOuterClass.FriendBrief>)this.blacklist_);
                }
                return this.blacklistBuilder_.getMessageList();
            }
            
            @Override
            public int getBlacklistCount() {
                if (this.blacklistBuilder_ == null) {
                    return this.blacklist_.size();
                }
                return this.blacklistBuilder_.getCount();
            }
            
            @Override
            public FriendBriefOuterClass.FriendBrief getBlacklist(final int index) {
                if (this.blacklistBuilder_ == null) {
                    return this.blacklist_.get(index);
                }
                return this.blacklistBuilder_.getMessage(index);
            }
            
            public Builder setBlacklist(final int index, final FriendBriefOuterClass.FriendBrief value) {
                if (this.blacklistBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureBlacklistIsMutable();
                    this.blacklist_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.blacklistBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setBlacklist(final int index, final FriendBriefOuterClass.FriendBrief.Builder builderForValue) {
                if (this.blacklistBuilder_ == null) {
                    this.ensureBlacklistIsMutable();
                    this.blacklist_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.blacklistBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addBlacklist(final FriendBriefOuterClass.FriendBrief value) {
                if (this.blacklistBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureBlacklistIsMutable();
                    this.blacklist_.add(value);
                    this.onChanged();
                }
                else {
                    this.blacklistBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addBlacklist(final int index, final FriendBriefOuterClass.FriendBrief value) {
                if (this.blacklistBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureBlacklistIsMutable();
                    this.blacklist_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.blacklistBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addBlacklist(final FriendBriefOuterClass.FriendBrief.Builder builderForValue) {
                if (this.blacklistBuilder_ == null) {
                    this.ensureBlacklistIsMutable();
                    this.blacklist_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.blacklistBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addBlacklist(final int index, final FriendBriefOuterClass.FriendBrief.Builder builderForValue) {
                if (this.blacklistBuilder_ == null) {
                    this.ensureBlacklistIsMutable();
                    this.blacklist_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.blacklistBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllBlacklist(final Iterable<? extends FriendBriefOuterClass.FriendBrief> values) {
                if (this.blacklistBuilder_ == null) {
                    this.ensureBlacklistIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.blacklist_);
                    this.onChanged();
                }
                else {
                    this.blacklistBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearBlacklist() {
                if (this.blacklistBuilder_ == null) {
                    this.blacklist_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.blacklistBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeBlacklist(final int index) {
                if (this.blacklistBuilder_ == null) {
                    this.ensureBlacklistIsMutable();
                    this.blacklist_.remove(index);
                    this.onChanged();
                }
                else {
                    this.blacklistBuilder_.remove(index);
                }
                return this;
            }
            
            public FriendBriefOuterClass.FriendBrief.Builder getBlacklistBuilder(final int index) {
                return this.getBlacklistFieldBuilder().getBuilder(index);
            }
            
            @Override
            public FriendBriefOuterClass.FriendBriefOrBuilder getBlacklistOrBuilder(final int index) {
                if (this.blacklistBuilder_ == null) {
                    return this.blacklist_.get(index);
                }
                return this.blacklistBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends FriendBriefOuterClass.FriendBriefOrBuilder> getBlacklistOrBuilderList() {
                if (this.blacklistBuilder_ != null) {
                    return this.blacklistBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends FriendBriefOuterClass.FriendBriefOrBuilder>)this.blacklist_);
            }
            
            public FriendBriefOuterClass.FriendBrief.Builder addBlacklistBuilder() {
                return this.getBlacklistFieldBuilder().addBuilder(FriendBriefOuterClass.FriendBrief.getDefaultInstance());
            }
            
            public FriendBriefOuterClass.FriendBrief.Builder addBlacklistBuilder(final int index) {
                return this.getBlacklistFieldBuilder().addBuilder(index, FriendBriefOuterClass.FriendBrief.getDefaultInstance());
            }
            
            public List<FriendBriefOuterClass.FriendBrief.Builder> getBlacklistBuilderList() {
                return this.getBlacklistFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<FriendBriefOuterClass.FriendBrief, FriendBriefOuterClass.FriendBrief.Builder, FriendBriefOuterClass.FriendBriefOrBuilder> getBlacklistFieldBuilder() {
                if (this.blacklistBuilder_ == null) {
                    this.blacklistBuilder_ = new RepeatedFieldBuilderV3<FriendBriefOuterClass.FriendBrief, FriendBriefOuterClass.FriendBrief.Builder, FriendBriefOuterClass.FriendBriefOrBuilder>(this.blacklist_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.blacklist_ = null;
                }
                return this.blacklistBuilder_;
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
    
    public interface GetPlayerBlacklistRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        List<FriendBriefOuterClass.FriendBrief> getBlacklistList();
        
        FriendBriefOuterClass.FriendBrief getBlacklist(final int p0);
        
        int getBlacklistCount();
        
        List<? extends FriendBriefOuterClass.FriendBriefOrBuilder> getBlacklistOrBuilderList();
        
        FriendBriefOuterClass.FriendBriefOrBuilder getBlacklistOrBuilder(final int p0);
    }
}
