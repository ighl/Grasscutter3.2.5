// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class PlayerChatReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_PlayerChatReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayerChatReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PlayerChatReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlayerChatReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0013PlayerChatReq.proto\u001a\u000eChatInfo.proto\"A\n\rPlayerChatReq\u0012\u0012\n\nchannel_id\u0018\r \u0001(\r\u0012\u001c\n\tchat_info\u0018\u000f \u0001(\u000b2\t.ChatInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlayerChatReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ChatInfoOuterClass.getDescriptor() });
        internal_static_PlayerChatReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerChatReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlayerChatReqOuterClass.internal_static_PlayerChatReq_descriptor, new String[] { "ChannelId", "ChatInfo" });
        ChatInfoOuterClass.getDescriptor();
    }
    
    public static final class PlayerChatReq extends GeneratedMessageV3 implements PlayerChatReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CHANNEL_ID_FIELD_NUMBER = 13;
        private int channelId_;
        public static final int CHAT_INFO_FIELD_NUMBER = 15;
        private ChatInfoOuterClass.ChatInfo chatInfo_;
        private byte memoizedIsInitialized;
        private static final PlayerChatReq DEFAULT_INSTANCE;
        private static final Parser<PlayerChatReq> PARSER;
        
        private PlayerChatReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PlayerChatReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PlayerChatReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PlayerChatReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
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
                        case 104: {
                            this.channelId_ = input.readUInt32();
                            continue;
                        }
                        case 122: {
                            ChatInfoOuterClass.ChatInfo.Builder subBuilder = null;
                            if (this.chatInfo_ != null) {
                                subBuilder = this.chatInfo_.toBuilder();
                            }
                            this.chatInfo_ = input.readMessage(ChatInfoOuterClass.ChatInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.chatInfo_);
                                this.chatInfo_ = subBuilder.buildPartial();
                                continue;
                            }
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
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return PlayerChatReqOuterClass.internal_static_PlayerChatReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PlayerChatReqOuterClass.internal_static_PlayerChatReq_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerChatReq.class, Builder.class);
        }
        
        @Override
        public int getChannelId() {
            return this.channelId_;
        }
        
        @Override
        public boolean hasChatInfo() {
            return this.chatInfo_ != null;
        }
        
        @Override
        public ChatInfoOuterClass.ChatInfo getChatInfo() {
            return (this.chatInfo_ == null) ? ChatInfoOuterClass.ChatInfo.getDefaultInstance() : this.chatInfo_;
        }
        
        @Override
        public ChatInfoOuterClass.ChatInfoOrBuilder getChatInfoOrBuilder() {
            return this.getChatInfo();
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
            if (this.channelId_ != 0) {
                output.writeUInt32(13, this.channelId_);
            }
            if (this.chatInfo_ != null) {
                output.writeMessage(15, this.getChatInfo());
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
            if (this.channelId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.channelId_);
            }
            if (this.chatInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(15, this.getChatInfo());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerChatReq)) {
                return super.equals(obj);
            }
            final PlayerChatReq other = (PlayerChatReq)obj;
            return this.getChannelId() == other.getChannelId() && this.hasChatInfo() == other.hasChatInfo() && (!this.hasChatInfo() || this.getChatInfo().equals(other.getChatInfo())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getChannelId();
            if (this.hasChatInfo()) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getChatInfo().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PlayerChatReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PlayerChatReq.PARSER.parseFrom(data);
        }
        
        public static PlayerChatReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerChatReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerChatReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PlayerChatReq.PARSER.parseFrom(data);
        }
        
        public static PlayerChatReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerChatReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerChatReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PlayerChatReq.PARSER.parseFrom(data);
        }
        
        public static PlayerChatReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerChatReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerChatReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerChatReq.PARSER, input);
        }
        
        public static PlayerChatReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerChatReq.PARSER, input, extensionRegistry);
        }
        
        public static PlayerChatReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerChatReq.PARSER, input);
        }
        
        public static PlayerChatReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerChatReq.PARSER, input, extensionRegistry);
        }
        
        public static PlayerChatReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerChatReq.PARSER, input);
        }
        
        public static PlayerChatReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerChatReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PlayerChatReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PlayerChatReq prototype) {
            return PlayerChatReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PlayerChatReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PlayerChatReq getDefaultInstance() {
            return PlayerChatReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<PlayerChatReq> parser() {
            return PlayerChatReq.PARSER;
        }
        
        @Override
        public Parser<PlayerChatReq> getParserForType() {
            return PlayerChatReq.PARSER;
        }
        
        @Override
        public PlayerChatReq getDefaultInstanceForType() {
            return PlayerChatReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PlayerChatReq();
            PARSER = new AbstractParser<PlayerChatReq>() {
                @Override
                public PlayerChatReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PlayerChatReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerChatReqOrBuilder
        {
            private int channelId_;
            private ChatInfoOuterClass.ChatInfo chatInfo_;
            private SingleFieldBuilderV3<ChatInfoOuterClass.ChatInfo, ChatInfoOuterClass.ChatInfo.Builder, ChatInfoOuterClass.ChatInfoOrBuilder> chatInfoBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PlayerChatReqOuterClass.internal_static_PlayerChatReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PlayerChatReqOuterClass.internal_static_PlayerChatReq_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerChatReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PlayerChatReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.channelId_ = 0;
                if (this.chatInfoBuilder_ == null) {
                    this.chatInfo_ = null;
                }
                else {
                    this.chatInfo_ = null;
                    this.chatInfoBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PlayerChatReqOuterClass.internal_static_PlayerChatReq_descriptor;
            }
            
            @Override
            public PlayerChatReq getDefaultInstanceForType() {
                return PlayerChatReq.getDefaultInstance();
            }
            
            @Override
            public PlayerChatReq build() {
                final PlayerChatReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PlayerChatReq buildPartial() {
                final PlayerChatReq result = new PlayerChatReq(this);
                result.channelId_ = this.channelId_;
                if (this.chatInfoBuilder_ == null) {
                    result.chatInfo_ = this.chatInfo_;
                }
                else {
                    result.chatInfo_ = this.chatInfoBuilder_.build();
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
                if (other instanceof PlayerChatReq) {
                    return this.mergeFrom((PlayerChatReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PlayerChatReq other) {
                if (other == PlayerChatReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getChannelId() != 0) {
                    this.setChannelId(other.getChannelId());
                }
                if (other.hasChatInfo()) {
                    this.mergeChatInfo(other.getChatInfo());
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
                PlayerChatReq parsedMessage = null;
                try {
                    parsedMessage = PlayerChatReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PlayerChatReq)e.getUnfinishedMessage();
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
            public int getChannelId() {
                return this.channelId_;
            }
            
            public Builder setChannelId(final int value) {
                this.channelId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearChannelId() {
                this.channelId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasChatInfo() {
                return this.chatInfoBuilder_ != null || this.chatInfo_ != null;
            }
            
            @Override
            public ChatInfoOuterClass.ChatInfo getChatInfo() {
                if (this.chatInfoBuilder_ == null) {
                    return (this.chatInfo_ == null) ? ChatInfoOuterClass.ChatInfo.getDefaultInstance() : this.chatInfo_;
                }
                return this.chatInfoBuilder_.getMessage();
            }
            
            public Builder setChatInfo(final ChatInfoOuterClass.ChatInfo value) {
                if (this.chatInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.chatInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.chatInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setChatInfo(final ChatInfoOuterClass.ChatInfo.Builder builderForValue) {
                if (this.chatInfoBuilder_ == null) {
                    this.chatInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.chatInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeChatInfo(final ChatInfoOuterClass.ChatInfo value) {
                if (this.chatInfoBuilder_ == null) {
                    if (this.chatInfo_ != null) {
                        this.chatInfo_ = ChatInfoOuterClass.ChatInfo.newBuilder(this.chatInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.chatInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.chatInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearChatInfo() {
                if (this.chatInfoBuilder_ == null) {
                    this.chatInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.chatInfo_ = null;
                    this.chatInfoBuilder_ = null;
                }
                return this;
            }
            
            public ChatInfoOuterClass.ChatInfo.Builder getChatInfoBuilder() {
                this.onChanged();
                return this.getChatInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public ChatInfoOuterClass.ChatInfoOrBuilder getChatInfoOrBuilder() {
                if (this.chatInfoBuilder_ != null) {
                    return this.chatInfoBuilder_.getMessageOrBuilder();
                }
                return (this.chatInfo_ == null) ? ChatInfoOuterClass.ChatInfo.getDefaultInstance() : this.chatInfo_;
            }
            
            private SingleFieldBuilderV3<ChatInfoOuterClass.ChatInfo, ChatInfoOuterClass.ChatInfo.Builder, ChatInfoOuterClass.ChatInfoOrBuilder> getChatInfoFieldBuilder() {
                if (this.chatInfoBuilder_ == null) {
                    this.chatInfoBuilder_ = new SingleFieldBuilderV3<ChatInfoOuterClass.ChatInfo, ChatInfoOuterClass.ChatInfo.Builder, ChatInfoOuterClass.ChatInfoOrBuilder>(this.getChatInfo(), this.getParentForChildren(), this.isClean());
                    this.chatInfo_ = null;
                }
                return this.chatInfoBuilder_;
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
    
    public interface PlayerChatReqOrBuilder extends MessageOrBuilder
    {
        int getChannelId();
        
        boolean hasChatInfo();
        
        ChatInfoOuterClass.ChatInfo getChatInfo();
        
        ChatInfoOuterClass.ChatInfoOrBuilder getChatInfoOrBuilder();
    }
}
