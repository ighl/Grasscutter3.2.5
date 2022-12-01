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

public final class GetChatEmojiCollectionRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_GetChatEmojiCollectionRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GetChatEmojiCollectionRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GetChatEmojiCollectionRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GetChatEmojiCollectionRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001fGetChatEmojiCollectionRsp.proto\u001a\u001dChatEmojiCollectionData.proto\"j\n\u0019GetChatEmojiCollectionRsp\u0012\u000f\n\u0007retcode\u0018\u000f \u0001(\u0005\u0012<\n\u001achat_emoji_collection_data\u0018\b \u0001(\u000b2\u0018.ChatEmojiCollectionDataB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GetChatEmojiCollectionRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ChatEmojiCollectionDataOuterClass.getDescriptor() });
        internal_static_GetChatEmojiCollectionRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetChatEmojiCollectionRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GetChatEmojiCollectionRspOuterClass.internal_static_GetChatEmojiCollectionRsp_descriptor, new String[] { "Retcode", "ChatEmojiCollectionData" });
        ChatEmojiCollectionDataOuterClass.getDescriptor();
    }
    
    public static final class GetChatEmojiCollectionRsp extends GeneratedMessageV3 implements GetChatEmojiCollectionRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 15;
        private int retcode_;
        public static final int CHAT_EMOJI_COLLECTION_DATA_FIELD_NUMBER = 8;
        private ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData chatEmojiCollectionData_;
        private byte memoizedIsInitialized;
        private static final GetChatEmojiCollectionRsp DEFAULT_INSTANCE;
        private static final Parser<GetChatEmojiCollectionRsp> PARSER;
        
        private GetChatEmojiCollectionRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private GetChatEmojiCollectionRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GetChatEmojiCollectionRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GetChatEmojiCollectionRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 66: {
                            ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.Builder subBuilder = null;
                            if (this.chatEmojiCollectionData_ != null) {
                                subBuilder = this.chatEmojiCollectionData_.toBuilder();
                            }
                            this.chatEmojiCollectionData_ = input.readMessage(ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.chatEmojiCollectionData_);
                                this.chatEmojiCollectionData_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 120: {
                            this.retcode_ = input.readInt32();
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
            return GetChatEmojiCollectionRspOuterClass.internal_static_GetChatEmojiCollectionRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GetChatEmojiCollectionRspOuterClass.internal_static_GetChatEmojiCollectionRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetChatEmojiCollectionRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public boolean hasChatEmojiCollectionData() {
            return this.chatEmojiCollectionData_ != null;
        }
        
        @Override
        public ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData getChatEmojiCollectionData() {
            return (this.chatEmojiCollectionData_ == null) ? ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.getDefaultInstance() : this.chatEmojiCollectionData_;
        }
        
        @Override
        public ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionDataOrBuilder getChatEmojiCollectionDataOrBuilder() {
            return this.getChatEmojiCollectionData();
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
            if (this.chatEmojiCollectionData_ != null) {
                output.writeMessage(8, this.getChatEmojiCollectionData());
            }
            if (this.retcode_ != 0) {
                output.writeInt32(15, this.retcode_);
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
            if (this.chatEmojiCollectionData_ != null) {
                size += CodedOutputStream.computeMessageSize(8, this.getChatEmojiCollectionData());
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(15, this.retcode_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetChatEmojiCollectionRsp)) {
                return super.equals(obj);
            }
            final GetChatEmojiCollectionRsp other = (GetChatEmojiCollectionRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.hasChatEmojiCollectionData() == other.hasChatEmojiCollectionData() && (!this.hasChatEmojiCollectionData() || this.getChatEmojiCollectionData().equals(other.getChatEmojiCollectionData())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getRetcode();
            if (this.hasChatEmojiCollectionData()) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getChatEmojiCollectionData().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GetChatEmojiCollectionRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GetChatEmojiCollectionRsp.PARSER.parseFrom(data);
        }
        
        public static GetChatEmojiCollectionRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetChatEmojiCollectionRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetChatEmojiCollectionRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GetChatEmojiCollectionRsp.PARSER.parseFrom(data);
        }
        
        public static GetChatEmojiCollectionRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetChatEmojiCollectionRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetChatEmojiCollectionRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GetChatEmojiCollectionRsp.PARSER.parseFrom(data);
        }
        
        public static GetChatEmojiCollectionRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetChatEmojiCollectionRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetChatEmojiCollectionRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetChatEmojiCollectionRsp.PARSER, input);
        }
        
        public static GetChatEmojiCollectionRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetChatEmojiCollectionRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetChatEmojiCollectionRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetChatEmojiCollectionRsp.PARSER, input);
        }
        
        public static GetChatEmojiCollectionRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetChatEmojiCollectionRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetChatEmojiCollectionRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetChatEmojiCollectionRsp.PARSER, input);
        }
        
        public static GetChatEmojiCollectionRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetChatEmojiCollectionRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GetChatEmojiCollectionRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GetChatEmojiCollectionRsp prototype) {
            return GetChatEmojiCollectionRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GetChatEmojiCollectionRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GetChatEmojiCollectionRsp getDefaultInstance() {
            return GetChatEmojiCollectionRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<GetChatEmojiCollectionRsp> parser() {
            return GetChatEmojiCollectionRsp.PARSER;
        }
        
        @Override
        public Parser<GetChatEmojiCollectionRsp> getParserForType() {
            return GetChatEmojiCollectionRsp.PARSER;
        }
        
        @Override
        public GetChatEmojiCollectionRsp getDefaultInstanceForType() {
            return GetChatEmojiCollectionRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GetChatEmojiCollectionRsp();
            PARSER = new AbstractParser<GetChatEmojiCollectionRsp>() {
                @Override
                public GetChatEmojiCollectionRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GetChatEmojiCollectionRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetChatEmojiCollectionRspOrBuilder
        {
            private int retcode_;
            private ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData chatEmojiCollectionData_;
            private SingleFieldBuilderV3<ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData, ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.Builder, ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionDataOrBuilder> chatEmojiCollectionDataBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GetChatEmojiCollectionRspOuterClass.internal_static_GetChatEmojiCollectionRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GetChatEmojiCollectionRspOuterClass.internal_static_GetChatEmojiCollectionRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetChatEmojiCollectionRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GetChatEmojiCollectionRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                if (this.chatEmojiCollectionDataBuilder_ == null) {
                    this.chatEmojiCollectionData_ = null;
                }
                else {
                    this.chatEmojiCollectionData_ = null;
                    this.chatEmojiCollectionDataBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GetChatEmojiCollectionRspOuterClass.internal_static_GetChatEmojiCollectionRsp_descriptor;
            }
            
            @Override
            public GetChatEmojiCollectionRsp getDefaultInstanceForType() {
                return GetChatEmojiCollectionRsp.getDefaultInstance();
            }
            
            @Override
            public GetChatEmojiCollectionRsp build() {
                final GetChatEmojiCollectionRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GetChatEmojiCollectionRsp buildPartial() {
                final GetChatEmojiCollectionRsp result = new GetChatEmojiCollectionRsp(this);
                result.retcode_ = this.retcode_;
                if (this.chatEmojiCollectionDataBuilder_ == null) {
                    result.chatEmojiCollectionData_ = this.chatEmojiCollectionData_;
                }
                else {
                    result.chatEmojiCollectionData_ = this.chatEmojiCollectionDataBuilder_.build();
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
                if (other instanceof GetChatEmojiCollectionRsp) {
                    return this.mergeFrom((GetChatEmojiCollectionRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GetChatEmojiCollectionRsp other) {
                if (other == GetChatEmojiCollectionRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.hasChatEmojiCollectionData()) {
                    this.mergeChatEmojiCollectionData(other.getChatEmojiCollectionData());
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
                GetChatEmojiCollectionRsp parsedMessage = null;
                try {
                    parsedMessage = GetChatEmojiCollectionRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GetChatEmojiCollectionRsp)e.getUnfinishedMessage();
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
            public boolean hasChatEmojiCollectionData() {
                return this.chatEmojiCollectionDataBuilder_ != null || this.chatEmojiCollectionData_ != null;
            }
            
            @Override
            public ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData getChatEmojiCollectionData() {
                if (this.chatEmojiCollectionDataBuilder_ == null) {
                    return (this.chatEmojiCollectionData_ == null) ? ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.getDefaultInstance() : this.chatEmojiCollectionData_;
                }
                return this.chatEmojiCollectionDataBuilder_.getMessage();
            }
            
            public Builder setChatEmojiCollectionData(final ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData value) {
                if (this.chatEmojiCollectionDataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.chatEmojiCollectionData_ = value;
                    this.onChanged();
                }
                else {
                    this.chatEmojiCollectionDataBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setChatEmojiCollectionData(final ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.Builder builderForValue) {
                if (this.chatEmojiCollectionDataBuilder_ == null) {
                    this.chatEmojiCollectionData_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.chatEmojiCollectionDataBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeChatEmojiCollectionData(final ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData value) {
                if (this.chatEmojiCollectionDataBuilder_ == null) {
                    if (this.chatEmojiCollectionData_ != null) {
                        this.chatEmojiCollectionData_ = ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.newBuilder(this.chatEmojiCollectionData_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.chatEmojiCollectionData_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.chatEmojiCollectionDataBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearChatEmojiCollectionData() {
                if (this.chatEmojiCollectionDataBuilder_ == null) {
                    this.chatEmojiCollectionData_ = null;
                    this.onChanged();
                }
                else {
                    this.chatEmojiCollectionData_ = null;
                    this.chatEmojiCollectionDataBuilder_ = null;
                }
                return this;
            }
            
            public ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.Builder getChatEmojiCollectionDataBuilder() {
                this.onChanged();
                return this.getChatEmojiCollectionDataFieldBuilder().getBuilder();
            }
            
            @Override
            public ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionDataOrBuilder getChatEmojiCollectionDataOrBuilder() {
                if (this.chatEmojiCollectionDataBuilder_ != null) {
                    return this.chatEmojiCollectionDataBuilder_.getMessageOrBuilder();
                }
                return (this.chatEmojiCollectionData_ == null) ? ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.getDefaultInstance() : this.chatEmojiCollectionData_;
            }
            
            private SingleFieldBuilderV3<ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData, ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.Builder, ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionDataOrBuilder> getChatEmojiCollectionDataFieldBuilder() {
                if (this.chatEmojiCollectionDataBuilder_ == null) {
                    this.chatEmojiCollectionDataBuilder_ = new SingleFieldBuilderV3<ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData, ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.Builder, ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionDataOrBuilder>(this.getChatEmojiCollectionData(), this.getParentForChildren(), this.isClean());
                    this.chatEmojiCollectionData_ = null;
                }
                return this.chatEmojiCollectionDataBuilder_;
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
    
    public interface GetChatEmojiCollectionRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        boolean hasChatEmojiCollectionData();
        
        ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData getChatEmojiCollectionData();
        
        ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionDataOrBuilder getChatEmojiCollectionDataOrBuilder();
    }
}
