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

public final class PlayerWorldLocationInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_PlayerWorldLocationInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayerWorldLocationInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PlayerWorldLocationInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlayerWorldLocationInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001dPlayerWorldLocationInfo.proto\u001a\u0018PlayerLocationInfo.proto\"T\n\u0017PlayerWorldLocationInfo\u0012\u0010\n\bscene_id\u0018\u0001 \u0001(\r\u0012'\n\nplayer_loc\u0018\f \u0001(\u000b2\u0013.PlayerLocationInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlayerWorldLocationInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { PlayerLocationInfoOuterClass.getDescriptor() });
        internal_static_PlayerWorldLocationInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerWorldLocationInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlayerWorldLocationInfoOuterClass.internal_static_PlayerWorldLocationInfo_descriptor, new String[] { "SceneId", "PlayerLoc" });
        PlayerLocationInfoOuterClass.getDescriptor();
    }
    
    public static final class PlayerWorldLocationInfo extends GeneratedMessageV3 implements PlayerWorldLocationInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SCENE_ID_FIELD_NUMBER = 1;
        private int sceneId_;
        public static final int PLAYER_LOC_FIELD_NUMBER = 12;
        private PlayerLocationInfoOuterClass.PlayerLocationInfo playerLoc_;
        private byte memoizedIsInitialized;
        private static final PlayerWorldLocationInfo DEFAULT_INSTANCE;
        private static final Parser<PlayerWorldLocationInfo> PARSER;
        
        private PlayerWorldLocationInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PlayerWorldLocationInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PlayerWorldLocationInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PlayerWorldLocationInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 8: {
                            this.sceneId_ = input.readUInt32();
                            continue;
                        }
                        case 98: {
                            PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder subBuilder = null;
                            if (this.playerLoc_ != null) {
                                subBuilder = this.playerLoc_.toBuilder();
                            }
                            this.playerLoc_ = input.readMessage(PlayerLocationInfoOuterClass.PlayerLocationInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.playerLoc_);
                                this.playerLoc_ = subBuilder.buildPartial();
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
            return PlayerWorldLocationInfoOuterClass.internal_static_PlayerWorldLocationInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PlayerWorldLocationInfoOuterClass.internal_static_PlayerWorldLocationInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerWorldLocationInfo.class, Builder.class);
        }
        
        @Override
        public int getSceneId() {
            return this.sceneId_;
        }
        
        @Override
        public boolean hasPlayerLoc() {
            return this.playerLoc_ != null;
        }
        
        @Override
        public PlayerLocationInfoOuterClass.PlayerLocationInfo getPlayerLoc() {
            return (this.playerLoc_ == null) ? PlayerLocationInfoOuterClass.PlayerLocationInfo.getDefaultInstance() : this.playerLoc_;
        }
        
        @Override
        public PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder getPlayerLocOrBuilder() {
            return this.getPlayerLoc();
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
            if (this.sceneId_ != 0) {
                output.writeUInt32(1, this.sceneId_);
            }
            if (this.playerLoc_ != null) {
                output.writeMessage(12, this.getPlayerLoc());
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
            if (this.sceneId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.sceneId_);
            }
            if (this.playerLoc_ != null) {
                size += CodedOutputStream.computeMessageSize(12, this.getPlayerLoc());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerWorldLocationInfo)) {
                return super.equals(obj);
            }
            final PlayerWorldLocationInfo other = (PlayerWorldLocationInfo)obj;
            return this.getSceneId() == other.getSceneId() && this.hasPlayerLoc() == other.hasPlayerLoc() && (!this.hasPlayerLoc() || this.getPlayerLoc().equals(other.getPlayerLoc())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getSceneId();
            if (this.hasPlayerLoc()) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getPlayerLoc().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PlayerWorldLocationInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PlayerWorldLocationInfo.PARSER.parseFrom(data);
        }
        
        public static PlayerWorldLocationInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerWorldLocationInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerWorldLocationInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PlayerWorldLocationInfo.PARSER.parseFrom(data);
        }
        
        public static PlayerWorldLocationInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerWorldLocationInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerWorldLocationInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PlayerWorldLocationInfo.PARSER.parseFrom(data);
        }
        
        public static PlayerWorldLocationInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerWorldLocationInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerWorldLocationInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerWorldLocationInfo.PARSER, input);
        }
        
        public static PlayerWorldLocationInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerWorldLocationInfo.PARSER, input, extensionRegistry);
        }
        
        public static PlayerWorldLocationInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerWorldLocationInfo.PARSER, input);
        }
        
        public static PlayerWorldLocationInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerWorldLocationInfo.PARSER, input, extensionRegistry);
        }
        
        public static PlayerWorldLocationInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerWorldLocationInfo.PARSER, input);
        }
        
        public static PlayerWorldLocationInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerWorldLocationInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PlayerWorldLocationInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PlayerWorldLocationInfo prototype) {
            return PlayerWorldLocationInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PlayerWorldLocationInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PlayerWorldLocationInfo getDefaultInstance() {
            return PlayerWorldLocationInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<PlayerWorldLocationInfo> parser() {
            return PlayerWorldLocationInfo.PARSER;
        }
        
        @Override
        public Parser<PlayerWorldLocationInfo> getParserForType() {
            return PlayerWorldLocationInfo.PARSER;
        }
        
        @Override
        public PlayerWorldLocationInfo getDefaultInstanceForType() {
            return PlayerWorldLocationInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PlayerWorldLocationInfo();
            PARSER = new AbstractParser<PlayerWorldLocationInfo>() {
                @Override
                public PlayerWorldLocationInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PlayerWorldLocationInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerWorldLocationInfoOrBuilder
        {
            private int sceneId_;
            private PlayerLocationInfoOuterClass.PlayerLocationInfo playerLoc_;
            private SingleFieldBuilderV3<PlayerLocationInfoOuterClass.PlayerLocationInfo, PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder, PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder> playerLocBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PlayerWorldLocationInfoOuterClass.internal_static_PlayerWorldLocationInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PlayerWorldLocationInfoOuterClass.internal_static_PlayerWorldLocationInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerWorldLocationInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PlayerWorldLocationInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.sceneId_ = 0;
                if (this.playerLocBuilder_ == null) {
                    this.playerLoc_ = null;
                }
                else {
                    this.playerLoc_ = null;
                    this.playerLocBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PlayerWorldLocationInfoOuterClass.internal_static_PlayerWorldLocationInfo_descriptor;
            }
            
            @Override
            public PlayerWorldLocationInfo getDefaultInstanceForType() {
                return PlayerWorldLocationInfo.getDefaultInstance();
            }
            
            @Override
            public PlayerWorldLocationInfo build() {
                final PlayerWorldLocationInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PlayerWorldLocationInfo buildPartial() {
                final PlayerWorldLocationInfo result = new PlayerWorldLocationInfo(this);
                result.sceneId_ = this.sceneId_;
                if (this.playerLocBuilder_ == null) {
                    result.playerLoc_ = this.playerLoc_;
                }
                else {
                    result.playerLoc_ = this.playerLocBuilder_.build();
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
                if (other instanceof PlayerWorldLocationInfo) {
                    return this.mergeFrom((PlayerWorldLocationInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PlayerWorldLocationInfo other) {
                if (other == PlayerWorldLocationInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getSceneId() != 0) {
                    this.setSceneId(other.getSceneId());
                }
                if (other.hasPlayerLoc()) {
                    this.mergePlayerLoc(other.getPlayerLoc());
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
                PlayerWorldLocationInfo parsedMessage = null;
                try {
                    parsedMessage = PlayerWorldLocationInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PlayerWorldLocationInfo)e.getUnfinishedMessage();
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
            public boolean hasPlayerLoc() {
                return this.playerLocBuilder_ != null || this.playerLoc_ != null;
            }
            
            @Override
            public PlayerLocationInfoOuterClass.PlayerLocationInfo getPlayerLoc() {
                if (this.playerLocBuilder_ == null) {
                    return (this.playerLoc_ == null) ? PlayerLocationInfoOuterClass.PlayerLocationInfo.getDefaultInstance() : this.playerLoc_;
                }
                return this.playerLocBuilder_.getMessage();
            }
            
            public Builder setPlayerLoc(final PlayerLocationInfoOuterClass.PlayerLocationInfo value) {
                if (this.playerLocBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.playerLoc_ = value;
                    this.onChanged();
                }
                else {
                    this.playerLocBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setPlayerLoc(final PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder builderForValue) {
                if (this.playerLocBuilder_ == null) {
                    this.playerLoc_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.playerLocBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergePlayerLoc(final PlayerLocationInfoOuterClass.PlayerLocationInfo value) {
                if (this.playerLocBuilder_ == null) {
                    if (this.playerLoc_ != null) {
                        this.playerLoc_ = PlayerLocationInfoOuterClass.PlayerLocationInfo.newBuilder(this.playerLoc_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.playerLoc_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.playerLocBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearPlayerLoc() {
                if (this.playerLocBuilder_ == null) {
                    this.playerLoc_ = null;
                    this.onChanged();
                }
                else {
                    this.playerLoc_ = null;
                    this.playerLocBuilder_ = null;
                }
                return this;
            }
            
            public PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder getPlayerLocBuilder() {
                this.onChanged();
                return this.getPlayerLocFieldBuilder().getBuilder();
            }
            
            @Override
            public PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder getPlayerLocOrBuilder() {
                if (this.playerLocBuilder_ != null) {
                    return this.playerLocBuilder_.getMessageOrBuilder();
                }
                return (this.playerLoc_ == null) ? PlayerLocationInfoOuterClass.PlayerLocationInfo.getDefaultInstance() : this.playerLoc_;
            }
            
            private SingleFieldBuilderV3<PlayerLocationInfoOuterClass.PlayerLocationInfo, PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder, PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder> getPlayerLocFieldBuilder() {
                if (this.playerLocBuilder_ == null) {
                    this.playerLocBuilder_ = new SingleFieldBuilderV3<PlayerLocationInfoOuterClass.PlayerLocationInfo, PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder, PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder>(this.getPlayerLoc(), this.getParentForChildren(), this.isClean());
                    this.playerLoc_ = null;
                }
                return this.playerLocBuilder_;
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
    
    public interface PlayerWorldLocationInfoOrBuilder extends MessageOrBuilder
    {
        int getSceneId();
        
        boolean hasPlayerLoc();
        
        PlayerLocationInfoOuterClass.PlayerLocationInfo getPlayerLoc();
        
        PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder getPlayerLocOrBuilder();
    }
}
