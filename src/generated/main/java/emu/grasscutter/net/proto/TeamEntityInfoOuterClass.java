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

public final class TeamEntityInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_TeamEntityInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TeamEntityInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TeamEntityInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TeamEntityInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0014TeamEntityInfo.proto\u001a\u001aAbilitySyncStateInfo.proto\"u\n\u000eTeamEntityInfo\u0012\u0019\n\u0011authority_peer_id\u0018\u000f \u0001(\r\u00120\n\u0011team_ability_info\u0018\u0005 \u0001(\u000b2\u0015.AbilitySyncStateInfo\u0012\u0016\n\u000eteam_entity_id\u0018\u000e \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TeamEntityInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AbilitySyncStateInfoOuterClass.getDescriptor() });
        internal_static_TeamEntityInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TeamEntityInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TeamEntityInfoOuterClass.internal_static_TeamEntityInfo_descriptor, new String[] { "AuthorityPeerId", "TeamAbilityInfo", "TeamEntityId" });
        AbilitySyncStateInfoOuterClass.getDescriptor();
    }
    
    public static final class TeamEntityInfo extends GeneratedMessageV3 implements TeamEntityInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int AUTHORITY_PEER_ID_FIELD_NUMBER = 15;
        private int authorityPeerId_;
        public static final int TEAM_ABILITY_INFO_FIELD_NUMBER = 5;
        private AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo teamAbilityInfo_;
        public static final int TEAM_ENTITY_ID_FIELD_NUMBER = 14;
        private int teamEntityId_;
        private byte memoizedIsInitialized;
        private static final TeamEntityInfo DEFAULT_INSTANCE;
        private static final Parser<TeamEntityInfo> PARSER;
        
        private TeamEntityInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private TeamEntityInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TeamEntityInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TeamEntityInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 42: {
                            AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder subBuilder = null;
                            if (this.teamAbilityInfo_ != null) {
                                subBuilder = this.teamAbilityInfo_.toBuilder();
                            }
                            this.teamAbilityInfo_ = input.readMessage(AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.teamAbilityInfo_);
                                this.teamAbilityInfo_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 112: {
                            this.teamEntityId_ = input.readUInt32();
                            continue;
                        }
                        case 120: {
                            this.authorityPeerId_ = input.readUInt32();
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
            return TeamEntityInfoOuterClass.internal_static_TeamEntityInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TeamEntityInfoOuterClass.internal_static_TeamEntityInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(TeamEntityInfo.class, Builder.class);
        }
        
        @Override
        public int getAuthorityPeerId() {
            return this.authorityPeerId_;
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
            if (this.teamAbilityInfo_ != null) {
                output.writeMessage(5, this.getTeamAbilityInfo());
            }
            if (this.teamEntityId_ != 0) {
                output.writeUInt32(14, this.teamEntityId_);
            }
            if (this.authorityPeerId_ != 0) {
                output.writeUInt32(15, this.authorityPeerId_);
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
            if (this.teamAbilityInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(5, this.getTeamAbilityInfo());
            }
            if (this.teamEntityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.teamEntityId_);
            }
            if (this.authorityPeerId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.authorityPeerId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TeamEntityInfo)) {
                return super.equals(obj);
            }
            final TeamEntityInfo other = (TeamEntityInfo)obj;
            return this.getAuthorityPeerId() == other.getAuthorityPeerId() && this.hasTeamAbilityInfo() == other.hasTeamAbilityInfo() && (!this.hasTeamAbilityInfo() || this.getTeamAbilityInfo().equals(other.getTeamAbilityInfo())) && this.getTeamEntityId() == other.getTeamEntityId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getAuthorityPeerId();
            if (this.hasTeamAbilityInfo()) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getTeamAbilityInfo().hashCode();
            }
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getTeamEntityId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TeamEntityInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TeamEntityInfo.PARSER.parseFrom(data);
        }
        
        public static TeamEntityInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TeamEntityInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TeamEntityInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TeamEntityInfo.PARSER.parseFrom(data);
        }
        
        public static TeamEntityInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TeamEntityInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TeamEntityInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TeamEntityInfo.PARSER.parseFrom(data);
        }
        
        public static TeamEntityInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TeamEntityInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TeamEntityInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TeamEntityInfo.PARSER, input);
        }
        
        public static TeamEntityInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TeamEntityInfo.PARSER, input, extensionRegistry);
        }
        
        public static TeamEntityInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TeamEntityInfo.PARSER, input);
        }
        
        public static TeamEntityInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TeamEntityInfo.PARSER, input, extensionRegistry);
        }
        
        public static TeamEntityInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TeamEntityInfo.PARSER, input);
        }
        
        public static TeamEntityInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TeamEntityInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TeamEntityInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TeamEntityInfo prototype) {
            return TeamEntityInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TeamEntityInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TeamEntityInfo getDefaultInstance() {
            return TeamEntityInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<TeamEntityInfo> parser() {
            return TeamEntityInfo.PARSER;
        }
        
        @Override
        public Parser<TeamEntityInfo> getParserForType() {
            return TeamEntityInfo.PARSER;
        }
        
        @Override
        public TeamEntityInfo getDefaultInstanceForType() {
            return TeamEntityInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TeamEntityInfo();
            PARSER = new AbstractParser<TeamEntityInfo>() {
                @Override
                public TeamEntityInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TeamEntityInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TeamEntityInfoOrBuilder
        {
            private int authorityPeerId_;
            private AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo teamAbilityInfo_;
            private SingleFieldBuilderV3<AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> teamAbilityInfoBuilder_;
            private int teamEntityId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TeamEntityInfoOuterClass.internal_static_TeamEntityInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TeamEntityInfoOuterClass.internal_static_TeamEntityInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(TeamEntityInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TeamEntityInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.authorityPeerId_ = 0;
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
                return TeamEntityInfoOuterClass.internal_static_TeamEntityInfo_descriptor;
            }
            
            @Override
            public TeamEntityInfo getDefaultInstanceForType() {
                return TeamEntityInfo.getDefaultInstance();
            }
            
            @Override
            public TeamEntityInfo build() {
                final TeamEntityInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TeamEntityInfo buildPartial() {
                final TeamEntityInfo result = new TeamEntityInfo(this);
                result.authorityPeerId_ = this.authorityPeerId_;
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
                if (other instanceof TeamEntityInfo) {
                    return this.mergeFrom((TeamEntityInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TeamEntityInfo other) {
                if (other == TeamEntityInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getAuthorityPeerId() != 0) {
                    this.setAuthorityPeerId(other.getAuthorityPeerId());
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
                TeamEntityInfo parsedMessage = null;
                try {
                    parsedMessage = TeamEntityInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TeamEntityInfo)e.getUnfinishedMessage();
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
    
    public interface TeamEntityInfoOrBuilder extends MessageOrBuilder
    {
        int getAuthorityPeerId();
        
        boolean hasTeamAbilityInfo();
        
        AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getTeamAbilityInfo();
        
        AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getTeamAbilityInfoOrBuilder();
        
        int getTeamEntityId();
    }
}
