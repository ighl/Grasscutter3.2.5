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

public final class TeamEnterSceneInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_TeamEnterSceneInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TeamEnterSceneInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TeamEnterSceneInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TeamEnterSceneInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018TeamEnterSceneInfo.proto\u001a\u0019AbilityControlBlock.proto\u001a\u001aAbilitySyncStateInfo.proto\"\u0093\u0001\n\u0012TeamEnterSceneInfo\u00123\n\u0015ability_control_block\u0018\t \u0001(\u000b2\u0014.AbilityControlBlock\u00120\n\u0011team_ability_info\u0018\r \u0001(\u000b2\u0015.AbilitySyncStateInfo\u0012\u0016\n\u000eteam_entity_id\u0018\u000b \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TeamEnterSceneInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AbilityControlBlockOuterClass.getDescriptor(), AbilitySyncStateInfoOuterClass.getDescriptor() });
        internal_static_TeamEnterSceneInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TeamEnterSceneInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TeamEnterSceneInfoOuterClass.internal_static_TeamEnterSceneInfo_descriptor, new String[] { "AbilityControlBlock", "TeamAbilityInfo", "TeamEntityId" });
        AbilityControlBlockOuterClass.getDescriptor();
        AbilitySyncStateInfoOuterClass.getDescriptor();
    }
    
    public static final class TeamEnterSceneInfo extends GeneratedMessageV3 implements TeamEnterSceneInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ABILITY_CONTROL_BLOCK_FIELD_NUMBER = 9;
        private AbilityControlBlockOuterClass.AbilityControlBlock abilityControlBlock_;
        public static final int TEAM_ABILITY_INFO_FIELD_NUMBER = 13;
        private AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo teamAbilityInfo_;
        public static final int TEAM_ENTITY_ID_FIELD_NUMBER = 11;
        private int teamEntityId_;
        private byte memoizedIsInitialized;
        private static final TeamEnterSceneInfo DEFAULT_INSTANCE;
        private static final Parser<TeamEnterSceneInfo> PARSER;
        
        private TeamEnterSceneInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private TeamEnterSceneInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TeamEnterSceneInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TeamEnterSceneInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 74: {
                            AbilityControlBlockOuterClass.AbilityControlBlock.Builder subBuilder = null;
                            if (this.abilityControlBlock_ != null) {
                                subBuilder = this.abilityControlBlock_.toBuilder();
                            }
                            this.abilityControlBlock_ = input.readMessage(AbilityControlBlockOuterClass.AbilityControlBlock.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.abilityControlBlock_);
                                this.abilityControlBlock_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 88: {
                            this.teamEntityId_ = input.readUInt32();
                            continue;
                        }
                        case 106: {
                            AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder subBuilder2 = null;
                            if (this.teamAbilityInfo_ != null) {
                                subBuilder2 = this.teamAbilityInfo_.toBuilder();
                            }
                            this.teamAbilityInfo_ = input.readMessage(AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom(this.teamAbilityInfo_);
                                this.teamAbilityInfo_ = subBuilder2.buildPartial();
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
            return TeamEnterSceneInfoOuterClass.internal_static_TeamEnterSceneInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TeamEnterSceneInfoOuterClass.internal_static_TeamEnterSceneInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(TeamEnterSceneInfo.class, Builder.class);
        }
        
        @Override
        public boolean hasAbilityControlBlock() {
            return this.abilityControlBlock_ != null;
        }
        
        @Override
        public AbilityControlBlockOuterClass.AbilityControlBlock getAbilityControlBlock() {
            return (this.abilityControlBlock_ == null) ? AbilityControlBlockOuterClass.AbilityControlBlock.getDefaultInstance() : this.abilityControlBlock_;
        }
        
        @Override
        public AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder getAbilityControlBlockOrBuilder() {
            return this.getAbilityControlBlock();
        }
        
        @Override
        public boolean hasTeamAbilityInfo() {
            return this.teamAbilityInfo_ != null;
        }
        
        @Override
        public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getTeamAbilityInfo() {
            return (this.teamAbilityInfo_ == null) ? AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : this.teamAbilityInfo_;
        }
        
        @Override
        public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getTeamAbilityInfoOrBuilder() {
            return this.getTeamAbilityInfo();
        }
        
        @Override
        public int getTeamEntityId() {
            return this.teamEntityId_;
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
            if (this.abilityControlBlock_ != null) {
                output.writeMessage(9, this.getAbilityControlBlock());
            }
            if (this.teamEntityId_ != 0) {
                output.writeUInt32(11, this.teamEntityId_);
            }
            if (this.teamAbilityInfo_ != null) {
                output.writeMessage(13, this.getTeamAbilityInfo());
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
            if (this.abilityControlBlock_ != null) {
                size += CodedOutputStream.computeMessageSize(9, this.getAbilityControlBlock());
            }
            if (this.teamEntityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.teamEntityId_);
            }
            if (this.teamAbilityInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(13, this.getTeamAbilityInfo());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TeamEnterSceneInfo)) {
                return super.equals(obj);
            }
            final TeamEnterSceneInfo other = (TeamEnterSceneInfo)obj;
            return this.hasAbilityControlBlock() == other.hasAbilityControlBlock() && (!this.hasAbilityControlBlock() || this.getAbilityControlBlock().equals(other.getAbilityControlBlock())) && this.hasTeamAbilityInfo() == other.hasTeamAbilityInfo() && (!this.hasTeamAbilityInfo() || this.getTeamAbilityInfo().equals(other.getTeamAbilityInfo())) && this.getTeamEntityId() == other.getTeamEntityId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasAbilityControlBlock()) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getAbilityControlBlock().hashCode();
            }
            if (this.hasTeamAbilityInfo()) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.getTeamAbilityInfo().hashCode();
            }
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getTeamEntityId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TeamEnterSceneInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TeamEnterSceneInfo.PARSER.parseFrom(data);
        }
        
        public static TeamEnterSceneInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TeamEnterSceneInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TeamEnterSceneInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TeamEnterSceneInfo.PARSER.parseFrom(data);
        }
        
        public static TeamEnterSceneInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TeamEnterSceneInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TeamEnterSceneInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TeamEnterSceneInfo.PARSER.parseFrom(data);
        }
        
        public static TeamEnterSceneInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TeamEnterSceneInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TeamEnterSceneInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TeamEnterSceneInfo.PARSER, input);
        }
        
        public static TeamEnterSceneInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TeamEnterSceneInfo.PARSER, input, extensionRegistry);
        }
        
        public static TeamEnterSceneInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TeamEnterSceneInfo.PARSER, input);
        }
        
        public static TeamEnterSceneInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TeamEnterSceneInfo.PARSER, input, extensionRegistry);
        }
        
        public static TeamEnterSceneInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TeamEnterSceneInfo.PARSER, input);
        }
        
        public static TeamEnterSceneInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TeamEnterSceneInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TeamEnterSceneInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TeamEnterSceneInfo prototype) {
            return TeamEnterSceneInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TeamEnterSceneInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TeamEnterSceneInfo getDefaultInstance() {
            return TeamEnterSceneInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<TeamEnterSceneInfo> parser() {
            return TeamEnterSceneInfo.PARSER;
        }
        
        @Override
        public Parser<TeamEnterSceneInfo> getParserForType() {
            return TeamEnterSceneInfo.PARSER;
        }
        
        @Override
        public TeamEnterSceneInfo getDefaultInstanceForType() {
            return TeamEnterSceneInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TeamEnterSceneInfo();
            PARSER = new AbstractParser<TeamEnterSceneInfo>() {
                @Override
                public TeamEnterSceneInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TeamEnterSceneInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TeamEnterSceneInfoOrBuilder
        {
            private AbilityControlBlockOuterClass.AbilityControlBlock abilityControlBlock_;
            private SingleFieldBuilderV3<AbilityControlBlockOuterClass.AbilityControlBlock, AbilityControlBlockOuterClass.AbilityControlBlock.Builder, AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder> abilityControlBlockBuilder_;
            private AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo teamAbilityInfo_;
            private SingleFieldBuilderV3<AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> teamAbilityInfoBuilder_;
            private int teamEntityId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TeamEnterSceneInfoOuterClass.internal_static_TeamEnterSceneInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TeamEnterSceneInfoOuterClass.internal_static_TeamEnterSceneInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(TeamEnterSceneInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TeamEnterSceneInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.abilityControlBlockBuilder_ == null) {
                    this.abilityControlBlock_ = null;
                }
                else {
                    this.abilityControlBlock_ = null;
                    this.abilityControlBlockBuilder_ = null;
                }
                if (this.teamAbilityInfoBuilder_ == null) {
                    this.teamAbilityInfo_ = null;
                }
                else {
                    this.teamAbilityInfo_ = null;
                    this.teamAbilityInfoBuilder_ = null;
                }
                this.teamEntityId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TeamEnterSceneInfoOuterClass.internal_static_TeamEnterSceneInfo_descriptor;
            }
            
            @Override
            public TeamEnterSceneInfo getDefaultInstanceForType() {
                return TeamEnterSceneInfo.getDefaultInstance();
            }
            
            @Override
            public TeamEnterSceneInfo build() {
                final TeamEnterSceneInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TeamEnterSceneInfo buildPartial() {
                final TeamEnterSceneInfo result = new TeamEnterSceneInfo(this);
                if (this.abilityControlBlockBuilder_ == null) {
                    result.abilityControlBlock_ = this.abilityControlBlock_;
                }
                else {
                    result.abilityControlBlock_ = this.abilityControlBlockBuilder_.build();
                }
                if (this.teamAbilityInfoBuilder_ == null) {
                    result.teamAbilityInfo_ = this.teamAbilityInfo_;
                }
                else {
                    result.teamAbilityInfo_ = this.teamAbilityInfoBuilder_.build();
                }
                result.teamEntityId_ = this.teamEntityId_;
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
                if (other instanceof TeamEnterSceneInfo) {
                    return this.mergeFrom((TeamEnterSceneInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TeamEnterSceneInfo other) {
                if (other == TeamEnterSceneInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.hasAbilityControlBlock()) {
                    this.mergeAbilityControlBlock(other.getAbilityControlBlock());
                }
                if (other.hasTeamAbilityInfo()) {
                    this.mergeTeamAbilityInfo(other.getTeamAbilityInfo());
                }
                if (other.getTeamEntityId() != 0) {
                    this.setTeamEntityId(other.getTeamEntityId());
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
                TeamEnterSceneInfo parsedMessage = null;
                try {
                    parsedMessage = TeamEnterSceneInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TeamEnterSceneInfo)e.getUnfinishedMessage();
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
            public boolean hasAbilityControlBlock() {
                return this.abilityControlBlockBuilder_ != null || this.abilityControlBlock_ != null;
            }
            
            @Override
            public AbilityControlBlockOuterClass.AbilityControlBlock getAbilityControlBlock() {
                if (this.abilityControlBlockBuilder_ == null) {
                    return (this.abilityControlBlock_ == null) ? AbilityControlBlockOuterClass.AbilityControlBlock.getDefaultInstance() : this.abilityControlBlock_;
                }
                return this.abilityControlBlockBuilder_.getMessage();
            }
            
            public Builder setAbilityControlBlock(final AbilityControlBlockOuterClass.AbilityControlBlock value) {
                if (this.abilityControlBlockBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.abilityControlBlock_ = value;
                    this.onChanged();
                }
                else {
                    this.abilityControlBlockBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setAbilityControlBlock(final AbilityControlBlockOuterClass.AbilityControlBlock.Builder builderForValue) {
                if (this.abilityControlBlockBuilder_ == null) {
                    this.abilityControlBlock_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.abilityControlBlockBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeAbilityControlBlock(final AbilityControlBlockOuterClass.AbilityControlBlock value) {
                if (this.abilityControlBlockBuilder_ == null) {
                    if (this.abilityControlBlock_ != null) {
                        this.abilityControlBlock_ = AbilityControlBlockOuterClass.AbilityControlBlock.newBuilder(this.abilityControlBlock_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.abilityControlBlock_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.abilityControlBlockBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearAbilityControlBlock() {
                if (this.abilityControlBlockBuilder_ == null) {
                    this.abilityControlBlock_ = null;
                    this.onChanged();
                }
                else {
                    this.abilityControlBlock_ = null;
                    this.abilityControlBlockBuilder_ = null;
                }
                return this;
            }
            
            public AbilityControlBlockOuterClass.AbilityControlBlock.Builder getAbilityControlBlockBuilder() {
                this.onChanged();
                return this.getAbilityControlBlockFieldBuilder().getBuilder();
            }
            
            @Override
            public AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder getAbilityControlBlockOrBuilder() {
                if (this.abilityControlBlockBuilder_ != null) {
                    return this.abilityControlBlockBuilder_.getMessageOrBuilder();
                }
                return (this.abilityControlBlock_ == null) ? AbilityControlBlockOuterClass.AbilityControlBlock.getDefaultInstance() : this.abilityControlBlock_;
            }
            
            private SingleFieldBuilderV3<AbilityControlBlockOuterClass.AbilityControlBlock, AbilityControlBlockOuterClass.AbilityControlBlock.Builder, AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder> getAbilityControlBlockFieldBuilder() {
                if (this.abilityControlBlockBuilder_ == null) {
                    this.abilityControlBlockBuilder_ = new SingleFieldBuilderV3<AbilityControlBlockOuterClass.AbilityControlBlock, AbilityControlBlockOuterClass.AbilityControlBlock.Builder, AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder>(this.getAbilityControlBlock(), this.getParentForChildren(), this.isClean());
                    this.abilityControlBlock_ = null;
                }
                return this.abilityControlBlockBuilder_;
            }
            
            @Override
            public boolean hasTeamAbilityInfo() {
                return this.teamAbilityInfoBuilder_ != null || this.teamAbilityInfo_ != null;
            }
            
            @Override
            public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getTeamAbilityInfo() {
                if (this.teamAbilityInfoBuilder_ == null) {
                    return (this.teamAbilityInfo_ == null) ? AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : this.teamAbilityInfo_;
                }
                return this.teamAbilityInfoBuilder_.getMessage();
            }
            
            public Builder setTeamAbilityInfo(final AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
                if (this.teamAbilityInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.teamAbilityInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.teamAbilityInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setTeamAbilityInfo(final AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder builderForValue) {
                if (this.teamAbilityInfoBuilder_ == null) {
                    this.teamAbilityInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.teamAbilityInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeTeamAbilityInfo(final AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
                if (this.teamAbilityInfoBuilder_ == null) {
                    if (this.teamAbilityInfo_ != null) {
                        this.teamAbilityInfo_ = AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.newBuilder(this.teamAbilityInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.teamAbilityInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.teamAbilityInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearTeamAbilityInfo() {
                if (this.teamAbilityInfoBuilder_ == null) {
                    this.teamAbilityInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.teamAbilityInfo_ = null;
                    this.teamAbilityInfoBuilder_ = null;
                }
                return this;
            }
            
            public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder getTeamAbilityInfoBuilder() {
                this.onChanged();
                return this.getTeamAbilityInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getTeamAbilityInfoOrBuilder() {
                if (this.teamAbilityInfoBuilder_ != null) {
                    return this.teamAbilityInfoBuilder_.getMessageOrBuilder();
                }
                return (this.teamAbilityInfo_ == null) ? AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : this.teamAbilityInfo_;
            }
            
            private SingleFieldBuilderV3<AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> getTeamAbilityInfoFieldBuilder() {
                if (this.teamAbilityInfoBuilder_ == null) {
                    this.teamAbilityInfoBuilder_ = new SingleFieldBuilderV3<AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder>(this.getTeamAbilityInfo(), this.getParentForChildren(), this.isClean());
                    this.teamAbilityInfo_ = null;
                }
                return this.teamAbilityInfoBuilder_;
            }
            
            @Override
            public int getTeamEntityId() {
                return this.teamEntityId_;
            }
            
            public Builder setTeamEntityId(final int value) {
                this.teamEntityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTeamEntityId() {
                this.teamEntityId_ = 0;
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
    
    public interface TeamEnterSceneInfoOrBuilder extends MessageOrBuilder
    {
        boolean hasAbilityControlBlock();
        
        AbilityControlBlockOuterClass.AbilityControlBlock getAbilityControlBlock();
        
        AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder getAbilityControlBlockOrBuilder();
        
        boolean hasTeamAbilityInfo();
        
        AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getTeamAbilityInfo();
        
        AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getTeamAbilityInfoOrBuilder();
        
        int getTeamEntityId();
    }
}
