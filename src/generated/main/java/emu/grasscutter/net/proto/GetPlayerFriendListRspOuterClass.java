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

public final class GetPlayerFriendListRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_GetPlayerFriendListRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GetPlayerFriendListRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GetPlayerFriendListRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GetPlayerFriendListRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cGetPlayerFriendListRsp.proto\u001a\u0011FriendBrief.proto\"s\n\u0016GetPlayerFriendListRsp\u0012\u000f\n\u0007retcode\u0018\u0005 \u0001(\u0005\u0012%\n\u000fask_friend_list\u0018\u0001 \u0003(\u000b2\f.FriendBrief\u0012!\n\u000bfriend_list\u0018\t \u0003(\u000b2\f.FriendBriefB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GetPlayerFriendListRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { FriendBriefOuterClass.getDescriptor() });
        internal_static_GetPlayerFriendListRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetPlayerFriendListRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GetPlayerFriendListRspOuterClass.internal_static_GetPlayerFriendListRsp_descriptor, new String[] { "Retcode", "AskFriendList", "FriendList" });
        FriendBriefOuterClass.getDescriptor();
    }
    
    public static final class GetPlayerFriendListRsp extends GeneratedMessageV3 implements GetPlayerFriendListRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 5;
        private int retcode_;
        public static final int ASK_FRIEND_LIST_FIELD_NUMBER = 1;
        private List<FriendBriefOuterClass.FriendBrief> askFriendList_;
        public static final int FRIEND_LIST_FIELD_NUMBER = 9;
        private List<FriendBriefOuterClass.FriendBrief> friendList_;
        private byte memoizedIsInitialized;
        private static final GetPlayerFriendListRsp DEFAULT_INSTANCE;
        private static final Parser<GetPlayerFriendListRsp> PARSER;
        
        private GetPlayerFriendListRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private GetPlayerFriendListRsp() {
            this.memoizedIsInitialized = -1;
            this.askFriendList_ = Collections.emptyList();
            this.friendList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GetPlayerFriendListRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GetPlayerFriendListRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.askFriendList_ = new ArrayList<FriendBriefOuterClass.FriendBrief>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.askFriendList_.add(input.readMessage(FriendBriefOuterClass.FriendBrief.parser(), extensionRegistry));
                            continue;
                        }
                        case 40: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 74: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.friendList_ = new ArrayList<FriendBriefOuterClass.FriendBrief>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.friendList_.add(input.readMessage(FriendBriefOuterClass.FriendBrief.parser(), extensionRegistry));
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
                    this.askFriendList_ = Collections.unmodifiableList((List<? extends FriendBriefOuterClass.FriendBrief>)this.askFriendList_);
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.friendList_ = Collections.unmodifiableList((List<? extends FriendBriefOuterClass.FriendBrief>)this.friendList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return GetPlayerFriendListRspOuterClass.internal_static_GetPlayerFriendListRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GetPlayerFriendListRspOuterClass.internal_static_GetPlayerFriendListRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetPlayerFriendListRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public List<FriendBriefOuterClass.FriendBrief> getAskFriendListList() {
            return this.askFriendList_;
        }
        
        @Override
        public List<? extends FriendBriefOuterClass.FriendBriefOrBuilder> getAskFriendListOrBuilderList() {
            return this.askFriendList_;
        }
        
        @Override
        public int getAskFriendListCount() {
            return this.askFriendList_.size();
        }
        
        @Override
        public FriendBriefOuterClass.FriendBrief getAskFriendList(final int index) {
            return this.askFriendList_.get(index);
        }
        
        @Override
        public FriendBriefOuterClass.FriendBriefOrBuilder getAskFriendListOrBuilder(final int index) {
            return this.askFriendList_.get(index);
        }
        
        @Override
        public List<FriendBriefOuterClass.FriendBrief> getFriendListList() {
            return this.friendList_;
        }
        
        @Override
        public List<? extends FriendBriefOuterClass.FriendBriefOrBuilder> getFriendListOrBuilderList() {
            return this.friendList_;
        }
        
        @Override
        public int getFriendListCount() {
            return this.friendList_.size();
        }
        
        @Override
        public FriendBriefOuterClass.FriendBrief getFriendList(final int index) {
            return this.friendList_.get(index);
        }
        
        @Override
        public FriendBriefOuterClass.FriendBriefOrBuilder getFriendListOrBuilder(final int index) {
            return this.friendList_.get(index);
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
            for (int i = 0; i < this.askFriendList_.size(); ++i) {
                output.writeMessage(1, this.askFriendList_.get(i));
            }
            if (this.retcode_ != 0) {
                output.writeInt32(5, this.retcode_);
            }
            for (int i = 0; i < this.friendList_.size(); ++i) {
                output.writeMessage(9, this.friendList_.get(i));
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
            for (int i = 0; i < this.askFriendList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(1, this.askFriendList_.get(i));
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(5, this.retcode_);
            }
            for (int i = 0; i < this.friendList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(9, this.friendList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetPlayerFriendListRsp)) {
                return super.equals(obj);
            }
            final GetPlayerFriendListRsp other = (GetPlayerFriendListRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.getAskFriendListList().equals(other.getAskFriendListList()) && this.getFriendListList().equals(other.getFriendListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getRetcode();
            if (this.getAskFriendListCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getAskFriendListList().hashCode();
            }
            if (this.getFriendListCount() > 0) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getFriendListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GetPlayerFriendListRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GetPlayerFriendListRsp.PARSER.parseFrom(data);
        }
        
        public static GetPlayerFriendListRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetPlayerFriendListRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetPlayerFriendListRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GetPlayerFriendListRsp.PARSER.parseFrom(data);
        }
        
        public static GetPlayerFriendListRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetPlayerFriendListRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetPlayerFriendListRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GetPlayerFriendListRsp.PARSER.parseFrom(data);
        }
        
        public static GetPlayerFriendListRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetPlayerFriendListRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetPlayerFriendListRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetPlayerFriendListRsp.PARSER, input);
        }
        
        public static GetPlayerFriendListRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetPlayerFriendListRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetPlayerFriendListRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetPlayerFriendListRsp.PARSER, input);
        }
        
        public static GetPlayerFriendListRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetPlayerFriendListRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetPlayerFriendListRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetPlayerFriendListRsp.PARSER, input);
        }
        
        public static GetPlayerFriendListRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetPlayerFriendListRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GetPlayerFriendListRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GetPlayerFriendListRsp prototype) {
            return GetPlayerFriendListRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GetPlayerFriendListRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GetPlayerFriendListRsp getDefaultInstance() {
            return GetPlayerFriendListRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<GetPlayerFriendListRsp> parser() {
            return GetPlayerFriendListRsp.PARSER;
        }
        
        @Override
        public Parser<GetPlayerFriendListRsp> getParserForType() {
            return GetPlayerFriendListRsp.PARSER;
        }
        
        @Override
        public GetPlayerFriendListRsp getDefaultInstanceForType() {
            return GetPlayerFriendListRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GetPlayerFriendListRsp();
            PARSER = new AbstractParser<GetPlayerFriendListRsp>() {
                @Override
                public GetPlayerFriendListRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GetPlayerFriendListRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetPlayerFriendListRspOrBuilder
        {
            private int bitField0_;
            private int retcode_;
            private List<FriendBriefOuterClass.FriendBrief> askFriendList_;
            private RepeatedFieldBuilderV3<FriendBriefOuterClass.FriendBrief, FriendBriefOuterClass.FriendBrief.Builder, FriendBriefOuterClass.FriendBriefOrBuilder> askFriendListBuilder_;
            private List<FriendBriefOuterClass.FriendBrief> friendList_;
            private RepeatedFieldBuilderV3<FriendBriefOuterClass.FriendBrief, FriendBriefOuterClass.FriendBrief.Builder, FriendBriefOuterClass.FriendBriefOrBuilder> friendListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GetPlayerFriendListRspOuterClass.internal_static_GetPlayerFriendListRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GetPlayerFriendListRspOuterClass.internal_static_GetPlayerFriendListRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetPlayerFriendListRsp.class, Builder.class);
            }
            
            private Builder() {
                this.askFriendList_ = Collections.emptyList();
                this.friendList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.askFriendList_ = Collections.emptyList();
                this.friendList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GetPlayerFriendListRsp.alwaysUseFieldBuilders) {
                    this.getAskFriendListFieldBuilder();
                    this.getFriendListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                if (this.askFriendListBuilder_ == null) {
                    this.askFriendList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.askFriendListBuilder_.clear();
                }
                if (this.friendListBuilder_ == null) {
                    this.friendList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                else {
                    this.friendListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GetPlayerFriendListRspOuterClass.internal_static_GetPlayerFriendListRsp_descriptor;
            }
            
            @Override
            public GetPlayerFriendListRsp getDefaultInstanceForType() {
                return GetPlayerFriendListRsp.getDefaultInstance();
            }
            
            @Override
            public GetPlayerFriendListRsp build() {
                final GetPlayerFriendListRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GetPlayerFriendListRsp buildPartial() {
                final GetPlayerFriendListRsp result = new GetPlayerFriendListRsp(this);
                final int from_bitField0_ = this.bitField0_;
                result.retcode_ = this.retcode_;
                if (this.askFriendListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.askFriendList_ = Collections.unmodifiableList((List<? extends FriendBriefOuterClass.FriendBrief>)this.askFriendList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.askFriendList_ = this.askFriendList_;
                }
                else {
                    result.askFriendList_ = this.askFriendListBuilder_.build();
                }
                if (this.friendListBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) != 0x0) {
                        this.friendList_ = Collections.unmodifiableList((List<? extends FriendBriefOuterClass.FriendBrief>)this.friendList_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.friendList_ = this.friendList_;
                }
                else {
                    result.friendList_ = this.friendListBuilder_.build();
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
                if (other instanceof GetPlayerFriendListRsp) {
                    return this.mergeFrom((GetPlayerFriendListRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GetPlayerFriendListRsp other) {
                if (other == GetPlayerFriendListRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (this.askFriendListBuilder_ == null) {
                    if (!other.askFriendList_.isEmpty()) {
                        if (this.askFriendList_.isEmpty()) {
                            this.askFriendList_ = other.askFriendList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureAskFriendListIsMutable();
                            this.askFriendList_.addAll(other.askFriendList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.askFriendList_.isEmpty()) {
                    if (this.askFriendListBuilder_.isEmpty()) {
                        this.askFriendListBuilder_.dispose();
                        this.askFriendListBuilder_ = null;
                        this.askFriendList_ = other.askFriendList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.askFriendListBuilder_ = (GetPlayerFriendListRsp.alwaysUseFieldBuilders ? this.getAskFriendListFieldBuilder() : null);
                    }
                    else {
                        this.askFriendListBuilder_.addAllMessages(other.askFriendList_);
                    }
                }
                if (this.friendListBuilder_ == null) {
                    if (!other.friendList_.isEmpty()) {
                        if (this.friendList_.isEmpty()) {
                            this.friendList_ = other.friendList_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        }
                        else {
                            this.ensureFriendListIsMutable();
                            this.friendList_.addAll(other.friendList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.friendList_.isEmpty()) {
                    if (this.friendListBuilder_.isEmpty()) {
                        this.friendListBuilder_.dispose();
                        this.friendListBuilder_ = null;
                        this.friendList_ = other.friendList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.friendListBuilder_ = (GetPlayerFriendListRsp.alwaysUseFieldBuilders ? this.getFriendListFieldBuilder() : null);
                    }
                    else {
                        this.friendListBuilder_.addAllMessages(other.friendList_);
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
                GetPlayerFriendListRsp parsedMessage = null;
                try {
                    parsedMessage = GetPlayerFriendListRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GetPlayerFriendListRsp)e.getUnfinishedMessage();
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
            
            private void ensureAskFriendListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.askFriendList_ = new ArrayList<FriendBriefOuterClass.FriendBrief>(this.askFriendList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<FriendBriefOuterClass.FriendBrief> getAskFriendListList() {
                if (this.askFriendListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends FriendBriefOuterClass.FriendBrief>)this.askFriendList_);
                }
                return this.askFriendListBuilder_.getMessageList();
            }
            
            @Override
            public int getAskFriendListCount() {
                if (this.askFriendListBuilder_ == null) {
                    return this.askFriendList_.size();
                }
                return this.askFriendListBuilder_.getCount();
            }
            
            @Override
            public FriendBriefOuterClass.FriendBrief getAskFriendList(final int index) {
                if (this.askFriendListBuilder_ == null) {
                    return this.askFriendList_.get(index);
                }
                return this.askFriendListBuilder_.getMessage(index);
            }
            
            public Builder setAskFriendList(final int index, final FriendBriefOuterClass.FriendBrief value) {
                if (this.askFriendListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureAskFriendListIsMutable();
                    this.askFriendList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.askFriendListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setAskFriendList(final int index, final FriendBriefOuterClass.FriendBrief.Builder builderForValue) {
                if (this.askFriendListBuilder_ == null) {
                    this.ensureAskFriendListIsMutable();
                    this.askFriendList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.askFriendListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAskFriendList(final FriendBriefOuterClass.FriendBrief value) {
                if (this.askFriendListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureAskFriendListIsMutable();
                    this.askFriendList_.add(value);
                    this.onChanged();
                }
                else {
                    this.askFriendListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addAskFriendList(final int index, final FriendBriefOuterClass.FriendBrief value) {
                if (this.askFriendListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureAskFriendListIsMutable();
                    this.askFriendList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.askFriendListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addAskFriendList(final FriendBriefOuterClass.FriendBrief.Builder builderForValue) {
                if (this.askFriendListBuilder_ == null) {
                    this.ensureAskFriendListIsMutable();
                    this.askFriendList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.askFriendListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addAskFriendList(final int index, final FriendBriefOuterClass.FriendBrief.Builder builderForValue) {
                if (this.askFriendListBuilder_ == null) {
                    this.ensureAskFriendListIsMutable();
                    this.askFriendList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.askFriendListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllAskFriendList(final Iterable<? extends FriendBriefOuterClass.FriendBrief> values) {
                if (this.askFriendListBuilder_ == null) {
                    this.ensureAskFriendListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.askFriendList_);
                    this.onChanged();
                }
                else {
                    this.askFriendListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearAskFriendList() {
                if (this.askFriendListBuilder_ == null) {
                    this.askFriendList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.askFriendListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeAskFriendList(final int index) {
                if (this.askFriendListBuilder_ == null) {
                    this.ensureAskFriendListIsMutable();
                    this.askFriendList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.askFriendListBuilder_.remove(index);
                }
                return this;
            }
            
            public FriendBriefOuterClass.FriendBrief.Builder getAskFriendListBuilder(final int index) {
                return this.getAskFriendListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public FriendBriefOuterClass.FriendBriefOrBuilder getAskFriendListOrBuilder(final int index) {
                if (this.askFriendListBuilder_ == null) {
                    return this.askFriendList_.get(index);
                }
                return this.askFriendListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends FriendBriefOuterClass.FriendBriefOrBuilder> getAskFriendListOrBuilderList() {
                if (this.askFriendListBuilder_ != null) {
                    return this.askFriendListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends FriendBriefOuterClass.FriendBriefOrBuilder>)this.askFriendList_);
            }
            
            public FriendBriefOuterClass.FriendBrief.Builder addAskFriendListBuilder() {
                return this.getAskFriendListFieldBuilder().addBuilder(FriendBriefOuterClass.FriendBrief.getDefaultInstance());
            }
            
            public FriendBriefOuterClass.FriendBrief.Builder addAskFriendListBuilder(final int index) {
                return this.getAskFriendListFieldBuilder().addBuilder(index, FriendBriefOuterClass.FriendBrief.getDefaultInstance());
            }
            
            public List<FriendBriefOuterClass.FriendBrief.Builder> getAskFriendListBuilderList() {
                return this.getAskFriendListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<FriendBriefOuterClass.FriendBrief, FriendBriefOuterClass.FriendBrief.Builder, FriendBriefOuterClass.FriendBriefOrBuilder> getAskFriendListFieldBuilder() {
                if (this.askFriendListBuilder_ == null) {
                    this.askFriendListBuilder_ = new RepeatedFieldBuilderV3<FriendBriefOuterClass.FriendBrief, FriendBriefOuterClass.FriendBrief.Builder, FriendBriefOuterClass.FriendBriefOrBuilder>(this.askFriendList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.askFriendList_ = null;
                }
                return this.askFriendListBuilder_;
            }
            
            private void ensureFriendListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.friendList_ = new ArrayList<FriendBriefOuterClass.FriendBrief>(this.friendList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<FriendBriefOuterClass.FriendBrief> getFriendListList() {
                if (this.friendListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends FriendBriefOuterClass.FriendBrief>)this.friendList_);
                }
                return this.friendListBuilder_.getMessageList();
            }
            
            @Override
            public int getFriendListCount() {
                if (this.friendListBuilder_ == null) {
                    return this.friendList_.size();
                }
                return this.friendListBuilder_.getCount();
            }
            
            @Override
            public FriendBriefOuterClass.FriendBrief getFriendList(final int index) {
                if (this.friendListBuilder_ == null) {
                    return this.friendList_.get(index);
                }
                return this.friendListBuilder_.getMessage(index);
            }
            
            public Builder setFriendList(final int index, final FriendBriefOuterClass.FriendBrief value) {
                if (this.friendListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFriendListIsMutable();
                    this.friendList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.friendListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setFriendList(final int index, final FriendBriefOuterClass.FriendBrief.Builder builderForValue) {
                if (this.friendListBuilder_ == null) {
                    this.ensureFriendListIsMutable();
                    this.friendList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.friendListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addFriendList(final FriendBriefOuterClass.FriendBrief value) {
                if (this.friendListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFriendListIsMutable();
                    this.friendList_.add(value);
                    this.onChanged();
                }
                else {
                    this.friendListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addFriendList(final int index, final FriendBriefOuterClass.FriendBrief value) {
                if (this.friendListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFriendListIsMutable();
                    this.friendList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.friendListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addFriendList(final FriendBriefOuterClass.FriendBrief.Builder builderForValue) {
                if (this.friendListBuilder_ == null) {
                    this.ensureFriendListIsMutable();
                    this.friendList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.friendListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addFriendList(final int index, final FriendBriefOuterClass.FriendBrief.Builder builderForValue) {
                if (this.friendListBuilder_ == null) {
                    this.ensureFriendListIsMutable();
                    this.friendList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.friendListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllFriendList(final Iterable<? extends FriendBriefOuterClass.FriendBrief> values) {
                if (this.friendListBuilder_ == null) {
                    this.ensureFriendListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.friendList_);
                    this.onChanged();
                }
                else {
                    this.friendListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearFriendList() {
                if (this.friendListBuilder_ == null) {
                    this.friendList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    this.onChanged();
                }
                else {
                    this.friendListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeFriendList(final int index) {
                if (this.friendListBuilder_ == null) {
                    this.ensureFriendListIsMutable();
                    this.friendList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.friendListBuilder_.remove(index);
                }
                return this;
            }
            
            public FriendBriefOuterClass.FriendBrief.Builder getFriendListBuilder(final int index) {
                return this.getFriendListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public FriendBriefOuterClass.FriendBriefOrBuilder getFriendListOrBuilder(final int index) {
                if (this.friendListBuilder_ == null) {
                    return this.friendList_.get(index);
                }
                return this.friendListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends FriendBriefOuterClass.FriendBriefOrBuilder> getFriendListOrBuilderList() {
                if (this.friendListBuilder_ != null) {
                    return this.friendListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends FriendBriefOuterClass.FriendBriefOrBuilder>)this.friendList_);
            }
            
            public FriendBriefOuterClass.FriendBrief.Builder addFriendListBuilder() {
                return this.getFriendListFieldBuilder().addBuilder(FriendBriefOuterClass.FriendBrief.getDefaultInstance());
            }
            
            public FriendBriefOuterClass.FriendBrief.Builder addFriendListBuilder(final int index) {
                return this.getFriendListFieldBuilder().addBuilder(index, FriendBriefOuterClass.FriendBrief.getDefaultInstance());
            }
            
            public List<FriendBriefOuterClass.FriendBrief.Builder> getFriendListBuilderList() {
                return this.getFriendListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<FriendBriefOuterClass.FriendBrief, FriendBriefOuterClass.FriendBrief.Builder, FriendBriefOuterClass.FriendBriefOrBuilder> getFriendListFieldBuilder() {
                if (this.friendListBuilder_ == null) {
                    this.friendListBuilder_ = new RepeatedFieldBuilderV3<FriendBriefOuterClass.FriendBrief, FriendBriefOuterClass.FriendBrief.Builder, FriendBriefOuterClass.FriendBriefOrBuilder>(this.friendList_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
                    this.friendList_ = null;
                }
                return this.friendListBuilder_;
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
    
    public interface GetPlayerFriendListRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        List<FriendBriefOuterClass.FriendBrief> getAskFriendListList();
        
        FriendBriefOuterClass.FriendBrief getAskFriendList(final int p0);
        
        int getAskFriendListCount();
        
        List<? extends FriendBriefOuterClass.FriendBriefOrBuilder> getAskFriendListOrBuilderList();
        
        FriendBriefOuterClass.FriendBriefOrBuilder getAskFriendListOrBuilder(final int p0);
        
        List<FriendBriefOuterClass.FriendBrief> getFriendListList();
        
        FriendBriefOuterClass.FriendBrief getFriendList(final int p0);
        
        int getFriendListCount();
        
        List<? extends FriendBriefOuterClass.FriendBriefOrBuilder> getFriendListOrBuilderList();
        
        FriendBriefOuterClass.FriendBriefOrBuilder getFriendListOrBuilder(final int p0);
    }
}
