// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Message;
import java.io.InputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ByteString;
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

public final class ScenePlayerInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_ScenePlayerInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ScenePlayerInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ScenePlayerInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ScenePlayerInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015ScenePlayerInfo.proto\u001a\u0016OnlinePlayerInfo.proto\"\u0094\u0001\n\u000fScenePlayerInfo\u0012\u0010\n\bscene_id\u0018\n \u0001(\r\u0012\u000f\n\u0007peer_id\u0018\u0006 \u0001(\r\u0012-\n\u0012online_player_info\u0018\r \u0001(\u000b2\u0011.OnlinePlayerInfo\u0012\u0014\n\fis_connected\u0018\u0002 \u0001(\b\u0012\f\n\u0004name\u0018\u000f \u0001(\t\u0012\u000b\n\u0003uid\u0018\b \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ScenePlayerInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { OnlinePlayerInfoOuterClass.getDescriptor() });
        internal_static_ScenePlayerInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ScenePlayerInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ScenePlayerInfoOuterClass.internal_static_ScenePlayerInfo_descriptor, new String[] { "SceneId", "PeerId", "OnlinePlayerInfo", "IsConnected", "Name", "Uid" });
        OnlinePlayerInfoOuterClass.getDescriptor();
    }
    
    public static final class ScenePlayerInfo extends GeneratedMessageV3 implements ScenePlayerInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SCENE_ID_FIELD_NUMBER = 10;
        private int sceneId_;
        public static final int PEER_ID_FIELD_NUMBER = 6;
        private int peerId_;
        public static final int ONLINE_PLAYER_INFO_FIELD_NUMBER = 13;
        private OnlinePlayerInfoOuterClass.OnlinePlayerInfo onlinePlayerInfo_;
        public static final int IS_CONNECTED_FIELD_NUMBER = 2;
        private boolean isConnected_;
        public static final int NAME_FIELD_NUMBER = 15;
        private volatile Object name_;
        public static final int UID_FIELD_NUMBER = 8;
        private int uid_;
        private byte memoizedIsInitialized;
        private static final ScenePlayerInfo DEFAULT_INSTANCE;
        private static final Parser<ScenePlayerInfo> PARSER;
        
        private ScenePlayerInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ScenePlayerInfo() {
            this.memoizedIsInitialized = -1;
            this.name_ = "";
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ScenePlayerInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ScenePlayerInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 16: {
                            this.isConnected_ = input.readBool();
                            continue;
                        }
                        case 48: {
                            this.peerId_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.uid_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
                            this.sceneId_ = input.readUInt32();
                            continue;
                        }
                        case 106: {
                            OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder subBuilder = null;
                            if (this.onlinePlayerInfo_ != null) {
                                subBuilder = this.onlinePlayerInfo_.toBuilder();
                            }
                            this.onlinePlayerInfo_ = input.readMessage(OnlinePlayerInfoOuterClass.OnlinePlayerInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.onlinePlayerInfo_);
                                this.onlinePlayerInfo_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 122: {
                            final String s = input.readStringRequireUtf8();
                            this.name_ = s;
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
            return ScenePlayerInfoOuterClass.internal_static_ScenePlayerInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ScenePlayerInfoOuterClass.internal_static_ScenePlayerInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ScenePlayerInfo.class, Builder.class);
        }
        
        @Override
        public int getSceneId() {
            return this.sceneId_;
        }
        
        @Override
        public int getPeerId() {
            return this.peerId_;
        }
        
        @Override
        public boolean hasOnlinePlayerInfo() {
            return this.onlinePlayerInfo_ != null;
        }
        
        @Override
        public OnlinePlayerInfoOuterClass.OnlinePlayerInfo getOnlinePlayerInfo() {
            return (this.onlinePlayerInfo_ == null) ? OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : this.onlinePlayerInfo_;
        }
        
        @Override
        public OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getOnlinePlayerInfoOrBuilder() {
            return this.getOnlinePlayerInfo();
        }
        
        @Override
        public boolean getIsConnected() {
            return this.isConnected_;
        }
        
        @Override
        public String getName() {
            final Object ref = this.name_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.name_ = s);
        }
        
        @Override
        public ByteString getNameBytes() {
            final Object ref = this.name_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.name_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public int getUid() {
            return this.uid_;
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
            if (this.isConnected_) {
                output.writeBool(2, this.isConnected_);
            }
            if (this.peerId_ != 0) {
                output.writeUInt32(6, this.peerId_);
            }
            if (this.uid_ != 0) {
                output.writeUInt32(8, this.uid_);
            }
            if (this.sceneId_ != 0) {
                output.writeUInt32(10, this.sceneId_);
            }
            if (this.onlinePlayerInfo_ != null) {
                output.writeMessage(13, this.getOnlinePlayerInfo());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
                GeneratedMessageV3.writeString(output, 15, this.name_);
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
            if (this.isConnected_) {
                size += CodedOutputStream.computeBoolSize(2, this.isConnected_);
            }
            if (this.peerId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.peerId_);
            }
            if (this.uid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.uid_);
            }
            if (this.sceneId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.sceneId_);
            }
            if (this.onlinePlayerInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(13, this.getOnlinePlayerInfo());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
                size += GeneratedMessageV3.computeStringSize(15, this.name_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ScenePlayerInfo)) {
                return super.equals(obj);
            }
            final ScenePlayerInfo other = (ScenePlayerInfo)obj;
            return this.getSceneId() == other.getSceneId() && this.getPeerId() == other.getPeerId() && this.hasOnlinePlayerInfo() == other.hasOnlinePlayerInfo() && (!this.hasOnlinePlayerInfo() || this.getOnlinePlayerInfo().equals(other.getOnlinePlayerInfo())) && this.getIsConnected() == other.getIsConnected() && this.getName().equals(other.getName()) && this.getUid() == other.getUid() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getSceneId();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getPeerId();
            if (this.hasOnlinePlayerInfo()) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.getOnlinePlayerInfo().hashCode();
            }
            hash = 37 * hash + 2;
            hash = 53 * hash + Internal.hashBoolean(this.getIsConnected());
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getName().hashCode();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getUid();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ScenePlayerInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ScenePlayerInfo.PARSER.parseFrom(data);
        }
        
        public static ScenePlayerInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ScenePlayerInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ScenePlayerInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ScenePlayerInfo.PARSER.parseFrom(data);
        }
        
        public static ScenePlayerInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ScenePlayerInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ScenePlayerInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ScenePlayerInfo.PARSER.parseFrom(data);
        }
        
        public static ScenePlayerInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ScenePlayerInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ScenePlayerInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ScenePlayerInfo.PARSER, input);
        }
        
        public static ScenePlayerInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ScenePlayerInfo.PARSER, input, extensionRegistry);
        }
        
        public static ScenePlayerInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ScenePlayerInfo.PARSER, input);
        }
        
        public static ScenePlayerInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ScenePlayerInfo.PARSER, input, extensionRegistry);
        }
        
        public static ScenePlayerInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ScenePlayerInfo.PARSER, input);
        }
        
        public static ScenePlayerInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ScenePlayerInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ScenePlayerInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ScenePlayerInfo prototype) {
            return ScenePlayerInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ScenePlayerInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ScenePlayerInfo getDefaultInstance() {
            return ScenePlayerInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<ScenePlayerInfo> parser() {
            return ScenePlayerInfo.PARSER;
        }
        
        @Override
        public Parser<ScenePlayerInfo> getParserForType() {
            return ScenePlayerInfo.PARSER;
        }
        
        @Override
        public ScenePlayerInfo getDefaultInstanceForType() {
            return ScenePlayerInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ScenePlayerInfo();
            PARSER = new AbstractParser<ScenePlayerInfo>() {
                @Override
                public ScenePlayerInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ScenePlayerInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ScenePlayerInfoOrBuilder
        {
            private int sceneId_;
            private int peerId_;
            private OnlinePlayerInfoOuterClass.OnlinePlayerInfo onlinePlayerInfo_;
            private SingleFieldBuilderV3<OnlinePlayerInfoOuterClass.OnlinePlayerInfo, OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> onlinePlayerInfoBuilder_;
            private boolean isConnected_;
            private Object name_;
            private int uid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ScenePlayerInfoOuterClass.internal_static_ScenePlayerInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ScenePlayerInfoOuterClass.internal_static_ScenePlayerInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ScenePlayerInfo.class, Builder.class);
            }
            
            private Builder() {
                this.name_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.name_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ScenePlayerInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.sceneId_ = 0;
                this.peerId_ = 0;
                if (this.onlinePlayerInfoBuilder_ == null) {
                    this.onlinePlayerInfo_ = null;
                }
                else {
                    this.onlinePlayerInfo_ = null;
                    this.onlinePlayerInfoBuilder_ = null;
                }
                this.isConnected_ = false;
                this.name_ = "";
                this.uid_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ScenePlayerInfoOuterClass.internal_static_ScenePlayerInfo_descriptor;
            }
            
            @Override
            public ScenePlayerInfo getDefaultInstanceForType() {
                return ScenePlayerInfo.getDefaultInstance();
            }
            
            @Override
            public ScenePlayerInfo build() {
                final ScenePlayerInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ScenePlayerInfo buildPartial() {
                final ScenePlayerInfo result = new ScenePlayerInfo(this);
                result.sceneId_ = this.sceneId_;
                result.peerId_ = this.peerId_;
                if (this.onlinePlayerInfoBuilder_ == null) {
                    result.onlinePlayerInfo_ = this.onlinePlayerInfo_;
                }
                else {
                    result.onlinePlayerInfo_ = this.onlinePlayerInfoBuilder_.build();
                }
                result.isConnected_ = this.isConnected_;
                result.name_ = this.name_;
                result.uid_ = this.uid_;
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
                if (other instanceof ScenePlayerInfo) {
                    return this.mergeFrom((ScenePlayerInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ScenePlayerInfo other) {
                if (other == ScenePlayerInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getSceneId() != 0) {
                    this.setSceneId(other.getSceneId());
                }
                if (other.getPeerId() != 0) {
                    this.setPeerId(other.getPeerId());
                }
                if (other.hasOnlinePlayerInfo()) {
                    this.mergeOnlinePlayerInfo(other.getOnlinePlayerInfo());
                }
                if (other.getIsConnected()) {
                    this.setIsConnected(other.getIsConnected());
                }
                if (!other.getName().isEmpty()) {
                    this.name_ = other.name_;
                    this.onChanged();
                }
                if (other.getUid() != 0) {
                    this.setUid(other.getUid());
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
                ScenePlayerInfo parsedMessage = null;
                try {
                    parsedMessage = ScenePlayerInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ScenePlayerInfo)e.getUnfinishedMessage();
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
            public int getSceneId() {
                return this.sceneId_;
            }
            
            public Builder setSceneId(final int value) {
                this.sceneId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSceneId() {
                this.sceneId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getPeerId() {
                return this.peerId_;
            }
            
            public Builder setPeerId(final int value) {
                this.peerId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPeerId() {
                this.peerId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasOnlinePlayerInfo() {
                return this.onlinePlayerInfoBuilder_ != null || this.onlinePlayerInfo_ != null;
            }
            
            @Override
            public OnlinePlayerInfoOuterClass.OnlinePlayerInfo getOnlinePlayerInfo() {
                if (this.onlinePlayerInfoBuilder_ == null) {
                    return (this.onlinePlayerInfo_ == null) ? OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : this.onlinePlayerInfo_;
                }
                return this.onlinePlayerInfoBuilder_.getMessage();
            }
            
            public Builder setOnlinePlayerInfo(final OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
                if (this.onlinePlayerInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.onlinePlayerInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.onlinePlayerInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setOnlinePlayerInfo(final OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder builderForValue) {
                if (this.onlinePlayerInfoBuilder_ == null) {
                    this.onlinePlayerInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.onlinePlayerInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeOnlinePlayerInfo(final OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
                if (this.onlinePlayerInfoBuilder_ == null) {
                    if (this.onlinePlayerInfo_ != null) {
                        this.onlinePlayerInfo_ = OnlinePlayerInfoOuterClass.OnlinePlayerInfo.newBuilder(this.onlinePlayerInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.onlinePlayerInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.onlinePlayerInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearOnlinePlayerInfo() {
                if (this.onlinePlayerInfoBuilder_ == null) {
                    this.onlinePlayerInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.onlinePlayerInfo_ = null;
                    this.onlinePlayerInfoBuilder_ = null;
                }
                return this;
            }
            
            public OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder getOnlinePlayerInfoBuilder() {
                this.onChanged();
                return this.getOnlinePlayerInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getOnlinePlayerInfoOrBuilder() {
                if (this.onlinePlayerInfoBuilder_ != null) {
                    return this.onlinePlayerInfoBuilder_.getMessageOrBuilder();
                }
                return (this.onlinePlayerInfo_ == null) ? OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : this.onlinePlayerInfo_;
            }
            
            private SingleFieldBuilderV3<OnlinePlayerInfoOuterClass.OnlinePlayerInfo, OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> getOnlinePlayerInfoFieldBuilder() {
                if (this.onlinePlayerInfoBuilder_ == null) {
                    this.onlinePlayerInfoBuilder_ = new SingleFieldBuilderV3<OnlinePlayerInfoOuterClass.OnlinePlayerInfo, OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder>(this.getOnlinePlayerInfo(), this.getParentForChildren(), this.isClean());
                    this.onlinePlayerInfo_ = null;
                }
                return this.onlinePlayerInfoBuilder_;
            }
            
            @Override
            public boolean getIsConnected() {
                return this.isConnected_;
            }
            
            public Builder setIsConnected(final boolean value) {
                this.isConnected_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsConnected() {
                this.isConnected_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getName() {
                final Object ref = this.name_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.name_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getNameBytes() {
                final Object ref = this.name_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.name_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setName(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.name_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearName() {
                this.name_ = ScenePlayerInfo.getDefaultInstance().getName();
                this.onChanged();
                return this;
            }
            
            public Builder setNameBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.name_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUid() {
                return this.uid_;
            }
            
            public Builder setUid(final int value) {
                this.uid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUid() {
                this.uid_ = 0;
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
    
    public interface ScenePlayerInfoOrBuilder extends MessageOrBuilder
    {
        int getSceneId();
        
        int getPeerId();
        
        boolean hasOnlinePlayerInfo();
        
        OnlinePlayerInfoOuterClass.OnlinePlayerInfo getOnlinePlayerInfo();
        
        OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getOnlinePlayerInfoOrBuilder();
        
        boolean getIsConnected();
        
        String getName();
        
        ByteString getNameBytes();
        
        int getUid();
    }
}
