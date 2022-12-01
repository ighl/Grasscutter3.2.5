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

public final class GetOnlinePlayerListRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_GetOnlinePlayerListRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GetOnlinePlayerListRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GetOnlinePlayerListRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GetOnlinePlayerListRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cGetOnlinePlayerListRsp.proto\u001a\u0016OnlinePlayerInfo.proto\"e\n\u0016GetOnlinePlayerListRsp\u0012\u000f\n\u0007retcode\u0018\u0007 \u0001(\u0005\u0012\r\n\u0005param\u0018\u000b \u0001(\r\u0012+\n\u0010player_info_list\u0018\u0005 \u0003(\u000b2\u0011.OnlinePlayerInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GetOnlinePlayerListRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { OnlinePlayerInfoOuterClass.getDescriptor() });
        internal_static_GetOnlinePlayerListRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetOnlinePlayerListRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GetOnlinePlayerListRspOuterClass.internal_static_GetOnlinePlayerListRsp_descriptor, new String[] { "Retcode", "Param", "PlayerInfoList" });
        OnlinePlayerInfoOuterClass.getDescriptor();
    }
    
    public static final class GetOnlinePlayerListRsp extends GeneratedMessageV3 implements GetOnlinePlayerListRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 7;
        private int retcode_;
        public static final int PARAM_FIELD_NUMBER = 11;
        private int param_;
        public static final int PLAYER_INFO_LIST_FIELD_NUMBER = 5;
        private List<OnlinePlayerInfoOuterClass.OnlinePlayerInfo> playerInfoList_;
        private byte memoizedIsInitialized;
        private static final GetOnlinePlayerListRsp DEFAULT_INSTANCE;
        private static final Parser<GetOnlinePlayerListRsp> PARSER;
        
        private GetOnlinePlayerListRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private GetOnlinePlayerListRsp() {
            this.memoizedIsInitialized = -1;
            this.playerInfoList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GetOnlinePlayerListRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GetOnlinePlayerListRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 42: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.playerInfoList_ = new ArrayList<OnlinePlayerInfoOuterClass.OnlinePlayerInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.playerInfoList_.add(input.readMessage(OnlinePlayerInfoOuterClass.OnlinePlayerInfo.parser(), extensionRegistry));
                            continue;
                        }
                        case 56: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 88: {
                            this.param_ = input.readUInt32();
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
                    this.playerInfoList_ = Collections.unmodifiableList((List<? extends OnlinePlayerInfoOuterClass.OnlinePlayerInfo>)this.playerInfoList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return GetOnlinePlayerListRspOuterClass.internal_static_GetOnlinePlayerListRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GetOnlinePlayerListRspOuterClass.internal_static_GetOnlinePlayerListRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetOnlinePlayerListRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public int getParam() {
            return this.param_;
        }
        
        @Override
        public List<OnlinePlayerInfoOuterClass.OnlinePlayerInfo> getPlayerInfoListList() {
            return this.playerInfoList_;
        }
        
        @Override
        public List<? extends OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> getPlayerInfoListOrBuilderList() {
            return this.playerInfoList_;
        }
        
        @Override
        public int getPlayerInfoListCount() {
            return this.playerInfoList_.size();
        }
        
        @Override
        public OnlinePlayerInfoOuterClass.OnlinePlayerInfo getPlayerInfoList(final int index) {
            return this.playerInfoList_.get(index);
        }
        
        @Override
        public OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getPlayerInfoListOrBuilder(final int index) {
            return this.playerInfoList_.get(index);
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
            for (int i = 0; i < this.playerInfoList_.size(); ++i) {
                output.writeMessage(5, this.playerInfoList_.get(i));
            }
            if (this.retcode_ != 0) {
                output.writeInt32(7, this.retcode_);
            }
            if (this.param_ != 0) {
                output.writeUInt32(11, this.param_);
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
            for (int i = 0; i < this.playerInfoList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(5, this.playerInfoList_.get(i));
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(7, this.retcode_);
            }
            if (this.param_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.param_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetOnlinePlayerListRsp)) {
                return super.equals(obj);
            }
            final GetOnlinePlayerListRsp other = (GetOnlinePlayerListRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.getParam() == other.getParam() && this.getPlayerInfoListList().equals(other.getPlayerInfoListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getParam();
            if (this.getPlayerInfoListCount() > 0) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getPlayerInfoListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GetOnlinePlayerListRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GetOnlinePlayerListRsp.PARSER.parseFrom(data);
        }
        
        public static GetOnlinePlayerListRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetOnlinePlayerListRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetOnlinePlayerListRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GetOnlinePlayerListRsp.PARSER.parseFrom(data);
        }
        
        public static GetOnlinePlayerListRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetOnlinePlayerListRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetOnlinePlayerListRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GetOnlinePlayerListRsp.PARSER.parseFrom(data);
        }
        
        public static GetOnlinePlayerListRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetOnlinePlayerListRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetOnlinePlayerListRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetOnlinePlayerListRsp.PARSER, input);
        }
        
        public static GetOnlinePlayerListRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetOnlinePlayerListRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetOnlinePlayerListRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetOnlinePlayerListRsp.PARSER, input);
        }
        
        public static GetOnlinePlayerListRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetOnlinePlayerListRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetOnlinePlayerListRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetOnlinePlayerListRsp.PARSER, input);
        }
        
        public static GetOnlinePlayerListRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetOnlinePlayerListRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GetOnlinePlayerListRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GetOnlinePlayerListRsp prototype) {
            return GetOnlinePlayerListRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GetOnlinePlayerListRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GetOnlinePlayerListRsp getDefaultInstance() {
            return GetOnlinePlayerListRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<GetOnlinePlayerListRsp> parser() {
            return GetOnlinePlayerListRsp.PARSER;
        }
        
        @Override
        public Parser<GetOnlinePlayerListRsp> getParserForType() {
            return GetOnlinePlayerListRsp.PARSER;
        }
        
        @Override
        public GetOnlinePlayerListRsp getDefaultInstanceForType() {
            return GetOnlinePlayerListRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GetOnlinePlayerListRsp();
            PARSER = new AbstractParser<GetOnlinePlayerListRsp>() {
                @Override
                public GetOnlinePlayerListRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GetOnlinePlayerListRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetOnlinePlayerListRspOrBuilder
        {
            private int bitField0_;
            private int retcode_;
            private int param_;
            private List<OnlinePlayerInfoOuterClass.OnlinePlayerInfo> playerInfoList_;
            private RepeatedFieldBuilderV3<OnlinePlayerInfoOuterClass.OnlinePlayerInfo, OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> playerInfoListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GetOnlinePlayerListRspOuterClass.internal_static_GetOnlinePlayerListRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GetOnlinePlayerListRspOuterClass.internal_static_GetOnlinePlayerListRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetOnlinePlayerListRsp.class, Builder.class);
            }
            
            private Builder() {
                this.playerInfoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.playerInfoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GetOnlinePlayerListRsp.alwaysUseFieldBuilders) {
                    this.getPlayerInfoListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                this.param_ = 0;
                if (this.playerInfoListBuilder_ == null) {
                    this.playerInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.playerInfoListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GetOnlinePlayerListRspOuterClass.internal_static_GetOnlinePlayerListRsp_descriptor;
            }
            
            @Override
            public GetOnlinePlayerListRsp getDefaultInstanceForType() {
                return GetOnlinePlayerListRsp.getDefaultInstance();
            }
            
            @Override
            public GetOnlinePlayerListRsp build() {
                final GetOnlinePlayerListRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GetOnlinePlayerListRsp buildPartial() {
                final GetOnlinePlayerListRsp result = new GetOnlinePlayerListRsp(this);
                final int from_bitField0_ = this.bitField0_;
                result.retcode_ = this.retcode_;
                result.param_ = this.param_;
                if (this.playerInfoListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.playerInfoList_ = Collections.unmodifiableList((List<? extends OnlinePlayerInfoOuterClass.OnlinePlayerInfo>)this.playerInfoList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.playerInfoList_ = this.playerInfoList_;
                }
                else {
                    result.playerInfoList_ = this.playerInfoListBuilder_.build();
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
                if (other instanceof GetOnlinePlayerListRsp) {
                    return this.mergeFrom((GetOnlinePlayerListRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GetOnlinePlayerListRsp other) {
                if (other == GetOnlinePlayerListRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getParam() != 0) {
                    this.setParam(other.getParam());
                }
                if (this.playerInfoListBuilder_ == null) {
                    if (!other.playerInfoList_.isEmpty()) {
                        if (this.playerInfoList_.isEmpty()) {
                            this.playerInfoList_ = other.playerInfoList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensurePlayerInfoListIsMutable();
                            this.playerInfoList_.addAll(other.playerInfoList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.playerInfoList_.isEmpty()) {
                    if (this.playerInfoListBuilder_.isEmpty()) {
                        this.playerInfoListBuilder_.dispose();
                        this.playerInfoListBuilder_ = null;
                        this.playerInfoList_ = other.playerInfoList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.playerInfoListBuilder_ = (GetOnlinePlayerListRsp.alwaysUseFieldBuilders ? this.getPlayerInfoListFieldBuilder() : null);
                    }
                    else {
                        this.playerInfoListBuilder_.addAllMessages(other.playerInfoList_);
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
                GetOnlinePlayerListRsp parsedMessage = null;
                try {
                    parsedMessage = GetOnlinePlayerListRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GetOnlinePlayerListRsp)e.getUnfinishedMessage();
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
            
            @Override
            public int getParam() {
                return this.param_;
            }
            
            public Builder setParam(final int value) {
                this.param_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearParam() {
                this.param_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensurePlayerInfoListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.playerInfoList_ = new ArrayList<OnlinePlayerInfoOuterClass.OnlinePlayerInfo>(this.playerInfoList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<OnlinePlayerInfoOuterClass.OnlinePlayerInfo> getPlayerInfoListList() {
                if (this.playerInfoListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends OnlinePlayerInfoOuterClass.OnlinePlayerInfo>)this.playerInfoList_);
                }
                return this.playerInfoListBuilder_.getMessageList();
            }
            
            @Override
            public int getPlayerInfoListCount() {
                if (this.playerInfoListBuilder_ == null) {
                    return this.playerInfoList_.size();
                }
                return this.playerInfoListBuilder_.getCount();
            }
            
            @Override
            public OnlinePlayerInfoOuterClass.OnlinePlayerInfo getPlayerInfoList(final int index) {
                if (this.playerInfoListBuilder_ == null) {
                    return this.playerInfoList_.get(index);
                }
                return this.playerInfoListBuilder_.getMessage(index);
            }
            
            public Builder setPlayerInfoList(final int index, final OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
                if (this.playerInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePlayerInfoListIsMutable();
                    this.playerInfoList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.playerInfoListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setPlayerInfoList(final int index, final OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder builderForValue) {
                if (this.playerInfoListBuilder_ == null) {
                    this.ensurePlayerInfoListIsMutable();
                    this.playerInfoList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.playerInfoListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addPlayerInfoList(final OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
                if (this.playerInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePlayerInfoListIsMutable();
                    this.playerInfoList_.add(value);
                    this.onChanged();
                }
                else {
                    this.playerInfoListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addPlayerInfoList(final int index, final OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
                if (this.playerInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePlayerInfoListIsMutable();
                    this.playerInfoList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.playerInfoListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addPlayerInfoList(final OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder builderForValue) {
                if (this.playerInfoListBuilder_ == null) {
                    this.ensurePlayerInfoListIsMutable();
                    this.playerInfoList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.playerInfoListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addPlayerInfoList(final int index, final OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder builderForValue) {
                if (this.playerInfoListBuilder_ == null) {
                    this.ensurePlayerInfoListIsMutable();
                    this.playerInfoList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.playerInfoListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllPlayerInfoList(final Iterable<? extends OnlinePlayerInfoOuterClass.OnlinePlayerInfo> values) {
                if (this.playerInfoListBuilder_ == null) {
                    this.ensurePlayerInfoListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.playerInfoList_);
                    this.onChanged();
                }
                else {
                    this.playerInfoListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearPlayerInfoList() {
                if (this.playerInfoListBuilder_ == null) {
                    this.playerInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.playerInfoListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removePlayerInfoList(final int index) {
                if (this.playerInfoListBuilder_ == null) {
                    this.ensurePlayerInfoListIsMutable();
                    this.playerInfoList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.playerInfoListBuilder_.remove(index);
                }
                return this;
            }
            
            public OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder getPlayerInfoListBuilder(final int index) {
                return this.getPlayerInfoListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getPlayerInfoListOrBuilder(final int index) {
                if (this.playerInfoListBuilder_ == null) {
                    return this.playerInfoList_.get(index);
                }
                return this.playerInfoListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> getPlayerInfoListOrBuilderList() {
                if (this.playerInfoListBuilder_ != null) {
                    return this.playerInfoListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder>)this.playerInfoList_);
            }
            
            public OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder addPlayerInfoListBuilder() {
                return this.getPlayerInfoListFieldBuilder().addBuilder(OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance());
            }
            
            public OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder addPlayerInfoListBuilder(final int index) {
                return this.getPlayerInfoListFieldBuilder().addBuilder(index, OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance());
            }
            
            public List<OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder> getPlayerInfoListBuilderList() {
                return this.getPlayerInfoListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<OnlinePlayerInfoOuterClass.OnlinePlayerInfo, OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> getPlayerInfoListFieldBuilder() {
                if (this.playerInfoListBuilder_ == null) {
                    this.playerInfoListBuilder_ = new RepeatedFieldBuilderV3<OnlinePlayerInfoOuterClass.OnlinePlayerInfo, OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder>(this.playerInfoList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.playerInfoList_ = null;
                }
                return this.playerInfoListBuilder_;
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
    
    public interface GetOnlinePlayerListRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        int getParam();
        
        List<OnlinePlayerInfoOuterClass.OnlinePlayerInfo> getPlayerInfoListList();
        
        OnlinePlayerInfoOuterClass.OnlinePlayerInfo getPlayerInfoList(final int p0);
        
        int getPlayerInfoListCount();
        
        List<? extends OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> getPlayerInfoListOrBuilderList();
        
        OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getPlayerInfoListOrBuilder(final int p0);
    }
}
