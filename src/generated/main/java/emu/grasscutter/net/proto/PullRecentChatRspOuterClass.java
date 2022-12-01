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

public final class PullRecentChatRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_PullRecentChatRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PullRecentChatRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PullRecentChatRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PullRecentChatRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017PullRecentChatRsp.proto\u001a\u000eChatInfo.proto\"B\n\u0011PullRecentChatRsp\u0012\u001c\n\tchat_info\u0018\u000f \u0003(\u000b2\t.ChatInfo\u0012\u000f\n\u0007retcode\u0018\u0003 \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PullRecentChatRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ChatInfoOuterClass.getDescriptor() });
        internal_static_PullRecentChatRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PullRecentChatRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PullRecentChatRspOuterClass.internal_static_PullRecentChatRsp_descriptor, new String[] { "ChatInfo", "Retcode" });
        ChatInfoOuterClass.getDescriptor();
    }
    
    public static final class PullRecentChatRsp extends GeneratedMessageV3 implements PullRecentChatRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CHAT_INFO_FIELD_NUMBER = 15;
        private List<ChatInfoOuterClass.ChatInfo> chatInfo_;
        public static final int RETCODE_FIELD_NUMBER = 3;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final PullRecentChatRsp DEFAULT_INSTANCE;
        private static final Parser<PullRecentChatRsp> PARSER;
        
        private PullRecentChatRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PullRecentChatRsp() {
            this.memoizedIsInitialized = -1;
            this.chatInfo_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PullRecentChatRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PullRecentChatRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 24: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 122: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.chatInfo_ = new ArrayList<ChatInfoOuterClass.ChatInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.chatInfo_.add(input.readMessage(ChatInfoOuterClass.ChatInfo.parser(), extensionRegistry));
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
                    this.chatInfo_ = Collections.unmodifiableList((List<? extends ChatInfoOuterClass.ChatInfo>)this.chatInfo_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return PullRecentChatRspOuterClass.internal_static_PullRecentChatRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PullRecentChatRspOuterClass.internal_static_PullRecentChatRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(PullRecentChatRsp.class, Builder.class);
        }
        
        @Override
        public List<ChatInfoOuterClass.ChatInfo> getChatInfoList() {
            return this.chatInfo_;
        }
        
        @Override
        public List<? extends ChatInfoOuterClass.ChatInfoOrBuilder> getChatInfoOrBuilderList() {
            return this.chatInfo_;
        }
        
        @Override
        public int getChatInfoCount() {
            return this.chatInfo_.size();
        }
        
        @Override
        public ChatInfoOuterClass.ChatInfo getChatInfo(final int index) {
            return this.chatInfo_.get(index);
        }
        
        @Override
        public ChatInfoOuterClass.ChatInfoOrBuilder getChatInfoOrBuilder(final int index) {
            return this.chatInfo_.get(index);
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
                output.writeInt32(3, this.retcode_);
            }
            for (int i = 0; i < this.chatInfo_.size(); ++i) {
                output.writeMessage(15, this.chatInfo_.get(i));
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
                size += CodedOutputStream.computeInt32Size(3, this.retcode_);
            }
            for (int i = 0; i < this.chatInfo_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(15, this.chatInfo_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PullRecentChatRsp)) {
                return super.equals(obj);
            }
            final PullRecentChatRsp other = (PullRecentChatRsp)obj;
            return this.getChatInfoList().equals(other.getChatInfoList()) && this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getChatInfoCount() > 0) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getChatInfoList().hashCode();
            }
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PullRecentChatRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PullRecentChatRsp.PARSER.parseFrom(data);
        }
        
        public static PullRecentChatRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PullRecentChatRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PullRecentChatRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PullRecentChatRsp.PARSER.parseFrom(data);
        }
        
        public static PullRecentChatRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PullRecentChatRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PullRecentChatRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PullRecentChatRsp.PARSER.parseFrom(data);
        }
        
        public static PullRecentChatRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PullRecentChatRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PullRecentChatRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PullRecentChatRsp.PARSER, input);
        }
        
        public static PullRecentChatRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PullRecentChatRsp.PARSER, input, extensionRegistry);
        }
        
        public static PullRecentChatRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PullRecentChatRsp.PARSER, input);
        }
        
        public static PullRecentChatRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PullRecentChatRsp.PARSER, input, extensionRegistry);
        }
        
        public static PullRecentChatRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PullRecentChatRsp.PARSER, input);
        }
        
        public static PullRecentChatRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PullRecentChatRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PullRecentChatRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PullRecentChatRsp prototype) {
            return PullRecentChatRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PullRecentChatRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PullRecentChatRsp getDefaultInstance() {
            return PullRecentChatRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<PullRecentChatRsp> parser() {
            return PullRecentChatRsp.PARSER;
        }
        
        @Override
        public Parser<PullRecentChatRsp> getParserForType() {
            return PullRecentChatRsp.PARSER;
        }
        
        @Override
        public PullRecentChatRsp getDefaultInstanceForType() {
            return PullRecentChatRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PullRecentChatRsp();
            PARSER = new AbstractParser<PullRecentChatRsp>() {
                @Override
                public PullRecentChatRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PullRecentChatRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PullRecentChatRspOrBuilder
        {
            private int bitField0_;
            private List<ChatInfoOuterClass.ChatInfo> chatInfo_;
            private RepeatedFieldBuilderV3<ChatInfoOuterClass.ChatInfo, ChatInfoOuterClass.ChatInfo.Builder, ChatInfoOuterClass.ChatInfoOrBuilder> chatInfoBuilder_;
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PullRecentChatRspOuterClass.internal_static_PullRecentChatRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PullRecentChatRspOuterClass.internal_static_PullRecentChatRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(PullRecentChatRsp.class, Builder.class);
            }
            
            private Builder() {
                this.chatInfo_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.chatInfo_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PullRecentChatRsp.alwaysUseFieldBuilders) {
                    this.getChatInfoFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.chatInfoBuilder_ == null) {
                    this.chatInfo_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.chatInfoBuilder_.clear();
                }
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PullRecentChatRspOuterClass.internal_static_PullRecentChatRsp_descriptor;
            }
            
            @Override
            public PullRecentChatRsp getDefaultInstanceForType() {
                return PullRecentChatRsp.getDefaultInstance();
            }
            
            @Override
            public PullRecentChatRsp build() {
                final PullRecentChatRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PullRecentChatRsp buildPartial() {
                final PullRecentChatRsp result = new PullRecentChatRsp(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.chatInfoBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.chatInfo_ = Collections.unmodifiableList((List<? extends ChatInfoOuterClass.ChatInfo>)this.chatInfo_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.chatInfo_ = this.chatInfo_;
                }
                else {
                    result.chatInfo_ = this.chatInfoBuilder_.build();
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
                if (other instanceof PullRecentChatRsp) {
                    return this.mergeFrom((PullRecentChatRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PullRecentChatRsp other) {
                if (other == PullRecentChatRsp.getDefaultInstance()) {
                    return this;
                }
                if (this.chatInfoBuilder_ == null) {
                    if (!other.chatInfo_.isEmpty()) {
                        if (this.chatInfo_.isEmpty()) {
                            this.chatInfo_ = other.chatInfo_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureChatInfoIsMutable();
                            this.chatInfo_.addAll(other.chatInfo_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.chatInfo_.isEmpty()) {
                    if (this.chatInfoBuilder_.isEmpty()) {
                        this.chatInfoBuilder_.dispose();
                        this.chatInfoBuilder_ = null;
                        this.chatInfo_ = other.chatInfo_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.chatInfoBuilder_ = (PullRecentChatRsp.alwaysUseFieldBuilders ? this.getChatInfoFieldBuilder() : null);
                    }
                    else {
                        this.chatInfoBuilder_.addAllMessages(other.chatInfo_);
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
                PullRecentChatRsp parsedMessage = null;
                try {
                    parsedMessage = PullRecentChatRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PullRecentChatRsp)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureChatInfoIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.chatInfo_ = new ArrayList<ChatInfoOuterClass.ChatInfo>(this.chatInfo_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<ChatInfoOuterClass.ChatInfo> getChatInfoList() {
                if (this.chatInfoBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ChatInfoOuterClass.ChatInfo>)this.chatInfo_);
                }
                return this.chatInfoBuilder_.getMessageList();
            }
            
            @Override
            public int getChatInfoCount() {
                if (this.chatInfoBuilder_ == null) {
                    return this.chatInfo_.size();
                }
                return this.chatInfoBuilder_.getCount();
            }
            
            @Override
            public ChatInfoOuterClass.ChatInfo getChatInfo(final int index) {
                if (this.chatInfoBuilder_ == null) {
                    return this.chatInfo_.get(index);
                }
                return this.chatInfoBuilder_.getMessage(index);
            }
            
            public Builder setChatInfo(final int index, final ChatInfoOuterClass.ChatInfo value) {
                if (this.chatInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureChatInfoIsMutable();
                    this.chatInfo_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.chatInfoBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setChatInfo(final int index, final ChatInfoOuterClass.ChatInfo.Builder builderForValue) {
                if (this.chatInfoBuilder_ == null) {
                    this.ensureChatInfoIsMutable();
                    this.chatInfo_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.chatInfoBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addChatInfo(final ChatInfoOuterClass.ChatInfo value) {
                if (this.chatInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureChatInfoIsMutable();
                    this.chatInfo_.add(value);
                    this.onChanged();
                }
                else {
                    this.chatInfoBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addChatInfo(final int index, final ChatInfoOuterClass.ChatInfo value) {
                if (this.chatInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureChatInfoIsMutable();
                    this.chatInfo_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.chatInfoBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addChatInfo(final ChatInfoOuterClass.ChatInfo.Builder builderForValue) {
                if (this.chatInfoBuilder_ == null) {
                    this.ensureChatInfoIsMutable();
                    this.chatInfo_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.chatInfoBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addChatInfo(final int index, final ChatInfoOuterClass.ChatInfo.Builder builderForValue) {
                if (this.chatInfoBuilder_ == null) {
                    this.ensureChatInfoIsMutable();
                    this.chatInfo_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.chatInfoBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllChatInfo(final Iterable<? extends ChatInfoOuterClass.ChatInfo> values) {
                if (this.chatInfoBuilder_ == null) {
                    this.ensureChatInfoIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.chatInfo_);
                    this.onChanged();
                }
                else {
                    this.chatInfoBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearChatInfo() {
                if (this.chatInfoBuilder_ == null) {
                    this.chatInfo_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.chatInfoBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeChatInfo(final int index) {
                if (this.chatInfoBuilder_ == null) {
                    this.ensureChatInfoIsMutable();
                    this.chatInfo_.remove(index);
                    this.onChanged();
                }
                else {
                    this.chatInfoBuilder_.remove(index);
                }
                return this;
            }
            
            public ChatInfoOuterClass.ChatInfo.Builder getChatInfoBuilder(final int index) {
                return this.getChatInfoFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ChatInfoOuterClass.ChatInfoOrBuilder getChatInfoOrBuilder(final int index) {
                if (this.chatInfoBuilder_ == null) {
                    return this.chatInfo_.get(index);
                }
                return this.chatInfoBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ChatInfoOuterClass.ChatInfoOrBuilder> getChatInfoOrBuilderList() {
                if (this.chatInfoBuilder_ != null) {
                    return this.chatInfoBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ChatInfoOuterClass.ChatInfoOrBuilder>)this.chatInfo_);
            }
            
            public ChatInfoOuterClass.ChatInfo.Builder addChatInfoBuilder() {
                return this.getChatInfoFieldBuilder().addBuilder(ChatInfoOuterClass.ChatInfo.getDefaultInstance());
            }
            
            public ChatInfoOuterClass.ChatInfo.Builder addChatInfoBuilder(final int index) {
                return this.getChatInfoFieldBuilder().addBuilder(index, ChatInfoOuterClass.ChatInfo.getDefaultInstance());
            }
            
            public List<ChatInfoOuterClass.ChatInfo.Builder> getChatInfoBuilderList() {
                return this.getChatInfoFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ChatInfoOuterClass.ChatInfo, ChatInfoOuterClass.ChatInfo.Builder, ChatInfoOuterClass.ChatInfoOrBuilder> getChatInfoFieldBuilder() {
                if (this.chatInfoBuilder_ == null) {
                    this.chatInfoBuilder_ = new RepeatedFieldBuilderV3<ChatInfoOuterClass.ChatInfo, ChatInfoOuterClass.ChatInfo.Builder, ChatInfoOuterClass.ChatInfoOrBuilder>(this.chatInfo_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.chatInfo_ = null;
                }
                return this.chatInfoBuilder_;
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
    
    public interface PullRecentChatRspOrBuilder extends MessageOrBuilder
    {
        List<ChatInfoOuterClass.ChatInfo> getChatInfoList();
        
        ChatInfoOuterClass.ChatInfo getChatInfo(final int p0);
        
        int getChatInfoCount();
        
        List<? extends ChatInfoOuterClass.ChatInfoOrBuilder> getChatInfoOrBuilderList();
        
        ChatInfoOuterClass.ChatInfoOrBuilder getChatInfoOrBuilder(final int p0);
        
        int getRetcode();
    }
}
