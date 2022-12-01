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

public final class PlayerApplyEnterMpNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_PlayerApplyEnterMpNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayerApplyEnterMpNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PlayerApplyEnterMpNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlayerApplyEnterMpNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001ePlayerApplyEnterMpNotify.proto\u001a\u0016OnlinePlayerInfo.proto\"t\n\u0018PlayerApplyEnterMpNotify\u0012\u0018\n\u0010src_thread_index\u0018\u0005 \u0001(\r\u0012\u0012\n\nsrc_app_id\u0018\u0006 \u0001(\r\u0012*\n\u000fsrc_player_info\u0018\u0002 \u0001(\u000b2\u0011.OnlinePlayerInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlayerApplyEnterMpNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { OnlinePlayerInfoOuterClass.getDescriptor() });
        internal_static_PlayerApplyEnterMpNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerApplyEnterMpNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlayerApplyEnterMpNotifyOuterClass.internal_static_PlayerApplyEnterMpNotify_descriptor, new String[] { "SrcThreadIndex", "SrcAppId", "SrcPlayerInfo" });
        OnlinePlayerInfoOuterClass.getDescriptor();
    }
    
    public static final class PlayerApplyEnterMpNotify extends GeneratedMessageV3 implements PlayerApplyEnterMpNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SRC_THREAD_INDEX_FIELD_NUMBER = 5;
        private int srcThreadIndex_;
        public static final int SRC_APP_ID_FIELD_NUMBER = 6;
        private int srcAppId_;
        public static final int SRC_PLAYER_INFO_FIELD_NUMBER = 2;
        private OnlinePlayerInfoOuterClass.OnlinePlayerInfo srcPlayerInfo_;
        private byte memoizedIsInitialized;
        private static final PlayerApplyEnterMpNotify DEFAULT_INSTANCE;
        private static final Parser<PlayerApplyEnterMpNotify> PARSER;
        
        private PlayerApplyEnterMpNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PlayerApplyEnterMpNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PlayerApplyEnterMpNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PlayerApplyEnterMpNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 18: {
                            OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder subBuilder = null;
                            if (this.srcPlayerInfo_ != null) {
                                subBuilder = this.srcPlayerInfo_.toBuilder();
                            }
                            this.srcPlayerInfo_ = input.readMessage(OnlinePlayerInfoOuterClass.OnlinePlayerInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.srcPlayerInfo_);
                                this.srcPlayerInfo_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 40: {
                            this.srcThreadIndex_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.srcAppId_ = input.readUInt32();
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
            return PlayerApplyEnterMpNotifyOuterClass.internal_static_PlayerApplyEnterMpNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PlayerApplyEnterMpNotifyOuterClass.internal_static_PlayerApplyEnterMpNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerApplyEnterMpNotify.class, Builder.class);
        }
        
        @Override
        public int getSrcThreadIndex() {
            return this.srcThreadIndex_;
        }
        
        @Override
        public int getSrcAppId() {
            return this.srcAppId_;
        }
        
        @Override
        public boolean hasSrcPlayerInfo() {
            return this.srcPlayerInfo_ != null;
        }
        
        @Override
        public OnlinePlayerInfoOuterClass.OnlinePlayerInfo getSrcPlayerInfo() {
            return (this.srcPlayerInfo_ == null) ? OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : this.srcPlayerInfo_;
        }
        
        @Override
        public OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getSrcPlayerInfoOrBuilder() {
            return this.getSrcPlayerInfo();
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
            if (this.srcPlayerInfo_ != null) {
                output.writeMessage(2, this.getSrcPlayerInfo());
            }
            if (this.srcThreadIndex_ != 0) {
                output.writeUInt32(5, this.srcThreadIndex_);
            }
            if (this.srcAppId_ != 0) {
                output.writeUInt32(6, this.srcAppId_);
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
            if (this.srcPlayerInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(2, this.getSrcPlayerInfo());
            }
            if (this.srcThreadIndex_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.srcThreadIndex_);
            }
            if (this.srcAppId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.srcAppId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerApplyEnterMpNotify)) {
                return super.equals(obj);
            }
            final PlayerApplyEnterMpNotify other = (PlayerApplyEnterMpNotify)obj;
            return this.getSrcThreadIndex() == other.getSrcThreadIndex() && this.getSrcAppId() == other.getSrcAppId() && this.hasSrcPlayerInfo() == other.hasSrcPlayerInfo() && (!this.hasSrcPlayerInfo() || this.getSrcPlayerInfo().equals(other.getSrcPlayerInfo())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getSrcThreadIndex();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getSrcAppId();
            if (this.hasSrcPlayerInfo()) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getSrcPlayerInfo().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PlayerApplyEnterMpNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpNotify.PARSER.parseFrom(data);
        }
        
        public static PlayerApplyEnterMpNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerApplyEnterMpNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpNotify.PARSER.parseFrom(data);
        }
        
        public static PlayerApplyEnterMpNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerApplyEnterMpNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpNotify.PARSER.parseFrom(data);
        }
        
        public static PlayerApplyEnterMpNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerApplyEnterMpNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerApplyEnterMpNotify.PARSER, input);
        }
        
        public static PlayerApplyEnterMpNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerApplyEnterMpNotify.PARSER, input, extensionRegistry);
        }
        
        public static PlayerApplyEnterMpNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerApplyEnterMpNotify.PARSER, input);
        }
        
        public static PlayerApplyEnterMpNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerApplyEnterMpNotify.PARSER, input, extensionRegistry);
        }
        
        public static PlayerApplyEnterMpNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerApplyEnterMpNotify.PARSER, input);
        }
        
        public static PlayerApplyEnterMpNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerApplyEnterMpNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PlayerApplyEnterMpNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PlayerApplyEnterMpNotify prototype) {
            return PlayerApplyEnterMpNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PlayerApplyEnterMpNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PlayerApplyEnterMpNotify getDefaultInstance() {
            return PlayerApplyEnterMpNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<PlayerApplyEnterMpNotify> parser() {
            return PlayerApplyEnterMpNotify.PARSER;
        }
        
        @Override
        public Parser<PlayerApplyEnterMpNotify> getParserForType() {
            return PlayerApplyEnterMpNotify.PARSER;
        }
        
        @Override
        public PlayerApplyEnterMpNotify getDefaultInstanceForType() {
            return PlayerApplyEnterMpNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PlayerApplyEnterMpNotify();
            PARSER = new AbstractParser<PlayerApplyEnterMpNotify>() {
                @Override
                public PlayerApplyEnterMpNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PlayerApplyEnterMpNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerApplyEnterMpNotifyOrBuilder
        {
            private int srcThreadIndex_;
            private int srcAppId_;
            private OnlinePlayerInfoOuterClass.OnlinePlayerInfo srcPlayerInfo_;
            private SingleFieldBuilderV3<OnlinePlayerInfoOuterClass.OnlinePlayerInfo, OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> srcPlayerInfoBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PlayerApplyEnterMpNotifyOuterClass.internal_static_PlayerApplyEnterMpNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PlayerApplyEnterMpNotifyOuterClass.internal_static_PlayerApplyEnterMpNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerApplyEnterMpNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PlayerApplyEnterMpNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.srcThreadIndex_ = 0;
                this.srcAppId_ = 0;
                if (this.srcPlayerInfoBuilder_ == null) {
                    this.srcPlayerInfo_ = null;
                }
                else {
                    this.srcPlayerInfo_ = null;
                    this.srcPlayerInfoBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PlayerApplyEnterMpNotifyOuterClass.internal_static_PlayerApplyEnterMpNotify_descriptor;
            }
            
            @Override
            public PlayerApplyEnterMpNotify getDefaultInstanceForType() {
                return PlayerApplyEnterMpNotify.getDefaultInstance();
            }
            
            @Override
            public PlayerApplyEnterMpNotify build() {
                final PlayerApplyEnterMpNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PlayerApplyEnterMpNotify buildPartial() {
                final PlayerApplyEnterMpNotify result = new PlayerApplyEnterMpNotify(this);
                result.srcThreadIndex_ = this.srcThreadIndex_;
                result.srcAppId_ = this.srcAppId_;
                if (this.srcPlayerInfoBuilder_ == null) {
                    result.srcPlayerInfo_ = this.srcPlayerInfo_;
                }
                else {
                    result.srcPlayerInfo_ = this.srcPlayerInfoBuilder_.build();
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
                if (other instanceof PlayerApplyEnterMpNotify) {
                    return this.mergeFrom((PlayerApplyEnterMpNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PlayerApplyEnterMpNotify other) {
                if (other == PlayerApplyEnterMpNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getSrcThreadIndex() != 0) {
                    this.setSrcThreadIndex(other.getSrcThreadIndex());
                }
                if (other.getSrcAppId() != 0) {
                    this.setSrcAppId(other.getSrcAppId());
                }
                if (other.hasSrcPlayerInfo()) {
                    this.mergeSrcPlayerInfo(other.getSrcPlayerInfo());
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
                PlayerApplyEnterMpNotify parsedMessage = null;
                try {
                    parsedMessage = PlayerApplyEnterMpNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PlayerApplyEnterMpNotify)e.getUnfinishedMessage();
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
            public int getSrcThreadIndex() {
                return this.srcThreadIndex_;
            }
            
            public Builder setSrcThreadIndex(final int value) {
                this.srcThreadIndex_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSrcThreadIndex() {
                this.srcThreadIndex_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getSrcAppId() {
                return this.srcAppId_;
            }
            
            public Builder setSrcAppId(final int value) {
                this.srcAppId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSrcAppId() {
                this.srcAppId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasSrcPlayerInfo() {
                return this.srcPlayerInfoBuilder_ != null || this.srcPlayerInfo_ != null;
            }
            
            @Override
            public OnlinePlayerInfoOuterClass.OnlinePlayerInfo getSrcPlayerInfo() {
                if (this.srcPlayerInfoBuilder_ == null) {
                    return (this.srcPlayerInfo_ == null) ? OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : this.srcPlayerInfo_;
                }
                return this.srcPlayerInfoBuilder_.getMessage();
            }
            
            public Builder setSrcPlayerInfo(final OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
                if (this.srcPlayerInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.srcPlayerInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.srcPlayerInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setSrcPlayerInfo(final OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder builderForValue) {
                if (this.srcPlayerInfoBuilder_ == null) {
                    this.srcPlayerInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.srcPlayerInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeSrcPlayerInfo(final OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
                if (this.srcPlayerInfoBuilder_ == null) {
                    if (this.srcPlayerInfo_ != null) {
                        this.srcPlayerInfo_ = OnlinePlayerInfoOuterClass.OnlinePlayerInfo.newBuilder(this.srcPlayerInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.srcPlayerInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.srcPlayerInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearSrcPlayerInfo() {
                if (this.srcPlayerInfoBuilder_ == null) {
                    this.srcPlayerInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.srcPlayerInfo_ = null;
                    this.srcPlayerInfoBuilder_ = null;
                }
                return this;
            }
            
            public OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder getSrcPlayerInfoBuilder() {
                this.onChanged();
                return this.getSrcPlayerInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getSrcPlayerInfoOrBuilder() {
                if (this.srcPlayerInfoBuilder_ != null) {
                    return this.srcPlayerInfoBuilder_.getMessageOrBuilder();
                }
                return (this.srcPlayerInfo_ == null) ? OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : this.srcPlayerInfo_;
            }
            
            private SingleFieldBuilderV3<OnlinePlayerInfoOuterClass.OnlinePlayerInfo, OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> getSrcPlayerInfoFieldBuilder() {
                if (this.srcPlayerInfoBuilder_ == null) {
                    this.srcPlayerInfoBuilder_ = new SingleFieldBuilderV3<OnlinePlayerInfoOuterClass.OnlinePlayerInfo, OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder>(this.getSrcPlayerInfo(), this.getParentForChildren(), this.isClean());
                    this.srcPlayerInfo_ = null;
                }
                return this.srcPlayerInfoBuilder_;
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
    
    public interface PlayerApplyEnterMpNotifyOrBuilder extends MessageOrBuilder
    {
        int getSrcThreadIndex();
        
        int getSrcAppId();
        
        boolean hasSrcPlayerInfo();
        
        OnlinePlayerInfoOuterClass.OnlinePlayerInfo getSrcPlayerInfo();
        
        OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getSrcPlayerInfoOrBuilder();
    }
}
