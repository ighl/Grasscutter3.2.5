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

public final class PlayTeamEntityInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_PlayTeamEntityInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayTeamEntityInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PlayTeamEntityInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlayTeamEntityInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018PlayTeamEntityInfo.proto\u001a\u001aAbilitySyncStateInfo.proto\"\u009d\u0001\n\u0012PlayTeamEntityInfo\u0012\u0011\n\tentity_id\u0018\u0001 \u0001(\r\u0012\u0012\n\nplayer_uid\u0018\u0002 \u0001(\r\u0012\u0019\n\u0011authority_peer_id\u0018\u0003 \u0001(\r\u0012\u0018\n\u0010gadget_config_id\u0018\u0005 \u0001(\r\u0012+\n\fability_info\u0018\u0006 \u0001(\u000b2\u0015.AbilitySyncStateInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlayTeamEntityInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AbilitySyncStateInfoOuterClass.getDescriptor() });
        internal_static_PlayTeamEntityInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayTeamEntityInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlayTeamEntityInfoOuterClass.internal_static_PlayTeamEntityInfo_descriptor, new String[] { "EntityId", "PlayerUid", "AuthorityPeerId", "GadgetConfigId", "AbilityInfo" });
        AbilitySyncStateInfoOuterClass.getDescriptor();
    }
    
    public static final class PlayTeamEntityInfo extends GeneratedMessageV3 implements PlayTeamEntityInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ENTITY_ID_FIELD_NUMBER = 1;
        private int entityId_;
        public static final int PLAYER_UID_FIELD_NUMBER = 2;
        private int playerUid_;
        public static final int AUTHORITY_PEER_ID_FIELD_NUMBER = 3;
        private int authorityPeerId_;
        public static final int GADGET_CONFIG_ID_FIELD_NUMBER = 5;
        private int gadgetConfigId_;
        public static final int ABILITY_INFO_FIELD_NUMBER = 6;
        private AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo abilityInfo_;
        private byte memoizedIsInitialized;
        private static final PlayTeamEntityInfo DEFAULT_INSTANCE;
        private static final Parser<PlayTeamEntityInfo> PARSER;
        
        private PlayTeamEntityInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PlayTeamEntityInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PlayTeamEntityInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PlayTeamEntityInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.entityId_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.playerUid_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.authorityPeerId_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.gadgetConfigId_ = input.readUInt32();
                            continue;
                        }
                        case 50: {
                            AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder subBuilder = null;
                            if (this.abilityInfo_ != null) {
                                subBuilder = this.abilityInfo_.toBuilder();
                            }
                            this.abilityInfo_ = input.readMessage(AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.abilityInfo_);
                                this.abilityInfo_ = subBuilder.buildPartial();
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
            return PlayTeamEntityInfoOuterClass.internal_static_PlayTeamEntityInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PlayTeamEntityInfoOuterClass.internal_static_PlayTeamEntityInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayTeamEntityInfo.class, Builder.class);
        }
        
        @Override
        public int getEntityId() {
            return this.entityId_;
        }
        
        @Override
        public int getPlayerUid() {
            return this.playerUid_;
        }
        
        @Override
        public int getAuthorityPeerId() {
            return this.authorityPeerId_;
        }
        
        @Override
        public int getGadgetConfigId() {
            return this.gadgetConfigId_;
        }
        
        @Override
        public boolean hasAbilityInfo() {
            return this.abilityInfo_ != null;
        }
        
        @Override
        public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getAbilityInfo() {
            return (this.abilityInfo_ == null) ? AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : this.abilityInfo_;
        }
        
        @Override
        public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getAbilityInfoOrBuilder() {
            return this.getAbilityInfo();
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
            if (this.entityId_ != 0) {
                output.writeUInt32(1, this.entityId_);
            }
            if (this.playerUid_ != 0) {
                output.writeUInt32(2, this.playerUid_);
            }
            if (this.authorityPeerId_ != 0) {
                output.writeUInt32(3, this.authorityPeerId_);
            }
            if (this.gadgetConfigId_ != 0) {
                output.writeUInt32(5, this.gadgetConfigId_);
            }
            if (this.abilityInfo_ != null) {
                output.writeMessage(6, this.getAbilityInfo());
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
            if (this.entityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.entityId_);
            }
            if (this.playerUid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.playerUid_);
            }
            if (this.authorityPeerId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.authorityPeerId_);
            }
            if (this.gadgetConfigId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.gadgetConfigId_);
            }
            if (this.abilityInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(6, this.getAbilityInfo());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayTeamEntityInfo)) {
                return super.equals(obj);
            }
            final PlayTeamEntityInfo other = (PlayTeamEntityInfo)obj;
            return this.getEntityId() == other.getEntityId() && this.getPlayerUid() == other.getPlayerUid() && this.getAuthorityPeerId() == other.getAuthorityPeerId() && this.getGadgetConfigId() == other.getGadgetConfigId() && this.hasAbilityInfo() == other.hasAbilityInfo() && (!this.hasAbilityInfo() || this.getAbilityInfo().equals(other.getAbilityInfo())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getEntityId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getPlayerUid();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getAuthorityPeerId();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getGadgetConfigId();
            if (this.hasAbilityInfo()) {
                hash = 37 * hash + 6;
                hash = 53 * hash + this.getAbilityInfo().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PlayTeamEntityInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PlayTeamEntityInfo.PARSER.parseFrom(data);
        }
        
        public static PlayTeamEntityInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayTeamEntityInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayTeamEntityInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PlayTeamEntityInfo.PARSER.parseFrom(data);
        }
        
        public static PlayTeamEntityInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayTeamEntityInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayTeamEntityInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PlayTeamEntityInfo.PARSER.parseFrom(data);
        }
        
        public static PlayTeamEntityInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayTeamEntityInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayTeamEntityInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayTeamEntityInfo.PARSER, input);
        }
        
        public static PlayTeamEntityInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayTeamEntityInfo.PARSER, input, extensionRegistry);
        }
        
        public static PlayTeamEntityInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayTeamEntityInfo.PARSER, input);
        }
        
        public static PlayTeamEntityInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayTeamEntityInfo.PARSER, input, extensionRegistry);
        }
        
        public static PlayTeamEntityInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayTeamEntityInfo.PARSER, input);
        }
        
        public static PlayTeamEntityInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayTeamEntityInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PlayTeamEntityInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PlayTeamEntityInfo prototype) {
            return PlayTeamEntityInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PlayTeamEntityInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PlayTeamEntityInfo getDefaultInstance() {
            return PlayTeamEntityInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<PlayTeamEntityInfo> parser() {
            return PlayTeamEntityInfo.PARSER;
        }
        
        @Override
        public Parser<PlayTeamEntityInfo> getParserForType() {
            return PlayTeamEntityInfo.PARSER;
        }
        
        @Override
        public PlayTeamEntityInfo getDefaultInstanceForType() {
            return PlayTeamEntityInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PlayTeamEntityInfo();
            PARSER = new AbstractParser<PlayTeamEntityInfo>() {
                @Override
                public PlayTeamEntityInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PlayTeamEntityInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayTeamEntityInfoOrBuilder
        {
            private int entityId_;
            private int playerUid_;
            private int authorityPeerId_;
            private int gadgetConfigId_;
            private AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo abilityInfo_;
            private SingleFieldBuilderV3<AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> abilityInfoBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PlayTeamEntityInfoOuterClass.internal_static_PlayTeamEntityInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PlayTeamEntityInfoOuterClass.internal_static_PlayTeamEntityInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayTeamEntityInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PlayTeamEntityInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.entityId_ = 0;
                this.playerUid_ = 0;
                this.authorityPeerId_ = 0;
                this.gadgetConfigId_ = 0;
                if (this.abilityInfoBuilder_ == null) {
                    this.abilityInfo_ = null;
                }
                else {
                    this.abilityInfo_ = null;
                    this.abilityInfoBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PlayTeamEntityInfoOuterClass.internal_static_PlayTeamEntityInfo_descriptor;
            }
            
            @Override
            public PlayTeamEntityInfo getDefaultInstanceForType() {
                return PlayTeamEntityInfo.getDefaultInstance();
            }
            
            @Override
            public PlayTeamEntityInfo build() {
                final PlayTeamEntityInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PlayTeamEntityInfo buildPartial() {
                final PlayTeamEntityInfo result = new PlayTeamEntityInfo(this);
                result.entityId_ = this.entityId_;
                result.playerUid_ = this.playerUid_;
                result.authorityPeerId_ = this.authorityPeerId_;
                result.gadgetConfigId_ = this.gadgetConfigId_;
                if (this.abilityInfoBuilder_ == null) {
                    result.abilityInfo_ = this.abilityInfo_;
                }
                else {
                    result.abilityInfo_ = this.abilityInfoBuilder_.build();
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
                if (other instanceof PlayTeamEntityInfo) {
                    return this.mergeFrom((PlayTeamEntityInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PlayTeamEntityInfo other) {
                if (other == PlayTeamEntityInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
                }
                if (other.getPlayerUid() != 0) {
                    this.setPlayerUid(other.getPlayerUid());
                }
                if (other.getAuthorityPeerId() != 0) {
                    this.setAuthorityPeerId(other.getAuthorityPeerId());
                }
                if (other.getGadgetConfigId() != 0) {
                    this.setGadgetConfigId(other.getGadgetConfigId());
                }
                if (other.hasAbilityInfo()) {
                    this.mergeAbilityInfo(other.getAbilityInfo());
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
                PlayTeamEntityInfo parsedMessage = null;
                try {
                    parsedMessage = PlayTeamEntityInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PlayTeamEntityInfo)e.getUnfinishedMessage();
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
            public int getEntityId() {
                return this.entityId_;
            }
            
            public Builder setEntityId(final int value) {
                this.entityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEntityId() {
                this.entityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getPlayerUid() {
                return this.playerUid_;
            }
            
            public Builder setPlayerUid(final int value) {
                this.playerUid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPlayerUid() {
                this.playerUid_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getAuthorityPeerId() {
                return this.authorityPeerId_;
            }
            
            public Builder setAuthorityPeerId(final int value) {
                this.authorityPeerId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAuthorityPeerId() {
                this.authorityPeerId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getGadgetConfigId() {
                return this.gadgetConfigId_;
            }
            
            public Builder setGadgetConfigId(final int value) {
                this.gadgetConfigId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGadgetConfigId() {
                this.gadgetConfigId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasAbilityInfo() {
                return this.abilityInfoBuilder_ != null || this.abilityInfo_ != null;
            }
            
            @Override
            public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getAbilityInfo() {
                if (this.abilityInfoBuilder_ == null) {
                    return (this.abilityInfo_ == null) ? AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : this.abilityInfo_;
                }
                return this.abilityInfoBuilder_.getMessage();
            }
            
            public Builder setAbilityInfo(final AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
                if (this.abilityInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.abilityInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.abilityInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setAbilityInfo(final AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder builderForValue) {
                if (this.abilityInfoBuilder_ == null) {
                    this.abilityInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.abilityInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeAbilityInfo(final AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
                if (this.abilityInfoBuilder_ == null) {
                    if (this.abilityInfo_ != null) {
                        this.abilityInfo_ = AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.newBuilder(this.abilityInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.abilityInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.abilityInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearAbilityInfo() {
                if (this.abilityInfoBuilder_ == null) {
                    this.abilityInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.abilityInfo_ = null;
                    this.abilityInfoBuilder_ = null;
                }
                return this;
            }
            
            public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder getAbilityInfoBuilder() {
                this.onChanged();
                return this.getAbilityInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getAbilityInfoOrBuilder() {
                if (this.abilityInfoBuilder_ != null) {
                    return this.abilityInfoBuilder_.getMessageOrBuilder();
                }
                return (this.abilityInfo_ == null) ? AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : this.abilityInfo_;
            }
            
            private SingleFieldBuilderV3<AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> getAbilityInfoFieldBuilder() {
                if (this.abilityInfoBuilder_ == null) {
                    this.abilityInfoBuilder_ = new SingleFieldBuilderV3<AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder>(this.getAbilityInfo(), this.getParentForChildren(), this.isClean());
                    this.abilityInfo_ = null;
                }
                return this.abilityInfoBuilder_;
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
    
    public interface PlayTeamEntityInfoOrBuilder extends MessageOrBuilder
    {
        int getEntityId();
        
        int getPlayerUid();
        
        int getAuthorityPeerId();
        
        int getGadgetConfigId();
        
        boolean hasAbilityInfo();
        
        AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getAbilityInfo();
        
        AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getAbilityInfoOrBuilder();
    }
}
