// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
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

public final class PlayerEnterSceneInfoNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_PlayerEnterSceneInfoNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayerEnterSceneInfoNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PlayerEnterSceneInfoNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlayerEnterSceneInfoNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n PlayerEnterSceneInfoNotify.proto\u001a\u001aAvatarEnterSceneInfo.proto\u001a\u0017MPLevelEntityInfo.proto\u001a\u0018TeamEnterSceneInfo.proto\"\u00e7\u0001\n\u001aPlayerEnterSceneInfoNotify\u0012,\n\u000fteam_enter_info\u0018\u000f \u0001(\u000b2\u0013.TeamEnterSceneInfo\u0012\u0019\n\u0011enter_scene_token\u0018\f \u0001(\r\u00120\n\u0011avatar_enter_info\u0018\r \u0003(\u000b2\u0015.AvatarEnterSceneInfo\u0012\u001c\n\u0014cur_avatar_entity_id\u0018\u0003 \u0001(\r\u00120\n\u0014mp_level_entity_info\u0018\u0006 \u0001(\u000b2\u0012.MPLevelEntityInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlayerEnterSceneInfoNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AvatarEnterSceneInfoOuterClass.getDescriptor(), MPLevelEntityInfoOuterClass.getDescriptor(), TeamEnterSceneInfoOuterClass.getDescriptor() });
        internal_static_PlayerEnterSceneInfoNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerEnterSceneInfoNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlayerEnterSceneInfoNotifyOuterClass.internal_static_PlayerEnterSceneInfoNotify_descriptor, new String[] { "TeamEnterInfo", "EnterSceneToken", "AvatarEnterInfo", "CurAvatarEntityId", "MpLevelEntityInfo" });
        AvatarEnterSceneInfoOuterClass.getDescriptor();
        MPLevelEntityInfoOuterClass.getDescriptor();
        TeamEnterSceneInfoOuterClass.getDescriptor();
    }
    
    public static final class PlayerEnterSceneInfoNotify extends GeneratedMessageV3 implements PlayerEnterSceneInfoNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int TEAM_ENTER_INFO_FIELD_NUMBER = 15;
        private TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo teamEnterInfo_;
        public static final int ENTER_SCENE_TOKEN_FIELD_NUMBER = 12;
        private int enterSceneToken_;
        public static final int AVATAR_ENTER_INFO_FIELD_NUMBER = 13;
        private List<AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo> avatarEnterInfo_;
        public static final int CUR_AVATAR_ENTITY_ID_FIELD_NUMBER = 3;
        private int curAvatarEntityId_;
        public static final int MP_LEVEL_ENTITY_INFO_FIELD_NUMBER = 6;
        private MPLevelEntityInfoOuterClass.MPLevelEntityInfo mpLevelEntityInfo_;
        private byte memoizedIsInitialized;
        private static final PlayerEnterSceneInfoNotify DEFAULT_INSTANCE;
        private static final Parser<PlayerEnterSceneInfoNotify> PARSER;
        
        private PlayerEnterSceneInfoNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PlayerEnterSceneInfoNotify() {
            this.memoizedIsInitialized = -1;
            this.avatarEnterInfo_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PlayerEnterSceneInfoNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PlayerEnterSceneInfoNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.curAvatarEntityId_ = input.readUInt32();
                            continue;
                        }
                        case 50: {
                            MPLevelEntityInfoOuterClass.MPLevelEntityInfo.Builder subBuilder = null;
                            if (this.mpLevelEntityInfo_ != null) {
                                subBuilder = this.mpLevelEntityInfo_.toBuilder();
                            }
                            this.mpLevelEntityInfo_ = input.readMessage(MPLevelEntityInfoOuterClass.MPLevelEntityInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.mpLevelEntityInfo_);
                                this.mpLevelEntityInfo_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 96: {
                            this.enterSceneToken_ = input.readUInt32();
                            continue;
                        }
                        case 106: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.avatarEnterInfo_ = new ArrayList<AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.avatarEnterInfo_.add(input.readMessage(AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo.parser(), extensionRegistry));
                            continue;
                        }
                        case 122: {
                            TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo.Builder subBuilder2 = null;
                            if (this.teamEnterInfo_ != null) {
                                subBuilder2 = this.teamEnterInfo_.toBuilder();
                            }
                            this.teamEnterInfo_ = input.readMessage(TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom(this.teamEnterInfo_);
                                this.teamEnterInfo_ = subBuilder2.buildPartial();
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
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.avatarEnterInfo_ = Collections.unmodifiableList((List<? extends AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo>)this.avatarEnterInfo_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return PlayerEnterSceneInfoNotifyOuterClass.internal_static_PlayerEnterSceneInfoNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PlayerEnterSceneInfoNotifyOuterClass.internal_static_PlayerEnterSceneInfoNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerEnterSceneInfoNotify.class, Builder.class);
        }
        
        @Override
        public boolean hasTeamEnterInfo() {
            return this.teamEnterInfo_ != null;
        }
        
        @Override
        public TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo getTeamEnterInfo() {
            return (this.teamEnterInfo_ == null) ? TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo.getDefaultInstance() : this.teamEnterInfo_;
        }
        
        @Override
        public TeamEnterSceneInfoOuterClass.TeamEnterSceneInfoOrBuilder getTeamEnterInfoOrBuilder() {
            return this.getTeamEnterInfo();
        }
        
        @Override
        public int getEnterSceneToken() {
            return this.enterSceneToken_;
        }
        
        @Override
        public List<AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo> getAvatarEnterInfoList() {
            return this.avatarEnterInfo_;
        }
        
        @Override
        public List<? extends AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfoOrBuilder> getAvatarEnterInfoOrBuilderList() {
            return this.avatarEnterInfo_;
        }
        
        @Override
        public int getAvatarEnterInfoCount() {
            return this.avatarEnterInfo_.size();
        }
        
        @Override
        public AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo getAvatarEnterInfo(final int index) {
            return this.avatarEnterInfo_.get(index);
        }
        
        @Override
        public AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfoOrBuilder getAvatarEnterInfoOrBuilder(final int index) {
            return this.avatarEnterInfo_.get(index);
        }
        
        @Override
        public int getCurAvatarEntityId() {
            return this.curAvatarEntityId_;
        }
        
        @Override
        public boolean hasMpLevelEntityInfo() {
            return this.mpLevelEntityInfo_ != null;
        }
        
        @Override
        public MPLevelEntityInfoOuterClass.MPLevelEntityInfo getMpLevelEntityInfo() {
            return (this.mpLevelEntityInfo_ == null) ? MPLevelEntityInfoOuterClass.MPLevelEntityInfo.getDefaultInstance() : this.mpLevelEntityInfo_;
        }
        
        @Override
        public MPLevelEntityInfoOuterClass.MPLevelEntityInfoOrBuilder getMpLevelEntityInfoOrBuilder() {
            return this.getMpLevelEntityInfo();
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
            if (this.curAvatarEntityId_ != 0) {
                output.writeUInt32(3, this.curAvatarEntityId_);
            }
            if (this.mpLevelEntityInfo_ != null) {
                output.writeMessage(6, this.getMpLevelEntityInfo());
            }
            if (this.enterSceneToken_ != 0) {
                output.writeUInt32(12, this.enterSceneToken_);
            }
            for (int i = 0; i < this.avatarEnterInfo_.size(); ++i) {
                output.writeMessage(13, this.avatarEnterInfo_.get(i));
            }
            if (this.teamEnterInfo_ != null) {
                output.writeMessage(15, this.getTeamEnterInfo());
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
            if (this.curAvatarEntityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.curAvatarEntityId_);
            }
            if (this.mpLevelEntityInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(6, this.getMpLevelEntityInfo());
            }
            if (this.enterSceneToken_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.enterSceneToken_);
            }
            for (int i = 0; i < this.avatarEnterInfo_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(13, this.avatarEnterInfo_.get(i));
            }
            if (this.teamEnterInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(15, this.getTeamEnterInfo());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerEnterSceneInfoNotify)) {
                return super.equals(obj);
            }
            final PlayerEnterSceneInfoNotify other = (PlayerEnterSceneInfoNotify)obj;
            return this.hasTeamEnterInfo() == other.hasTeamEnterInfo() && (!this.hasTeamEnterInfo() || this.getTeamEnterInfo().equals(other.getTeamEnterInfo())) && this.getEnterSceneToken() == other.getEnterSceneToken() && this.getAvatarEnterInfoList().equals(other.getAvatarEnterInfoList()) && this.getCurAvatarEntityId() == other.getCurAvatarEntityId() && this.hasMpLevelEntityInfo() == other.hasMpLevelEntityInfo() && (!this.hasMpLevelEntityInfo() || this.getMpLevelEntityInfo().equals(other.getMpLevelEntityInfo())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasTeamEnterInfo()) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getTeamEnterInfo().hashCode();
            }
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getEnterSceneToken();
            if (this.getAvatarEnterInfoCount() > 0) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.getAvatarEnterInfoList().hashCode();
            }
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getCurAvatarEntityId();
            if (this.hasMpLevelEntityInfo()) {
                hash = 37 * hash + 6;
                hash = 53 * hash + this.getMpLevelEntityInfo().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PlayerEnterSceneInfoNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PlayerEnterSceneInfoNotify.PARSER.parseFrom(data);
        }
        
        public static PlayerEnterSceneInfoNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerEnterSceneInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerEnterSceneInfoNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PlayerEnterSceneInfoNotify.PARSER.parseFrom(data);
        }
        
        public static PlayerEnterSceneInfoNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerEnterSceneInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerEnterSceneInfoNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PlayerEnterSceneInfoNotify.PARSER.parseFrom(data);
        }
        
        public static PlayerEnterSceneInfoNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerEnterSceneInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerEnterSceneInfoNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerEnterSceneInfoNotify.PARSER, input);
        }
        
        public static PlayerEnterSceneInfoNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerEnterSceneInfoNotify.PARSER, input, extensionRegistry);
        }
        
        public static PlayerEnterSceneInfoNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerEnterSceneInfoNotify.PARSER, input);
        }
        
        public static PlayerEnterSceneInfoNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerEnterSceneInfoNotify.PARSER, input, extensionRegistry);
        }
        
        public static PlayerEnterSceneInfoNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerEnterSceneInfoNotify.PARSER, input);
        }
        
        public static PlayerEnterSceneInfoNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerEnterSceneInfoNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PlayerEnterSceneInfoNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PlayerEnterSceneInfoNotify prototype) {
            return PlayerEnterSceneInfoNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PlayerEnterSceneInfoNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PlayerEnterSceneInfoNotify getDefaultInstance() {
            return PlayerEnterSceneInfoNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<PlayerEnterSceneInfoNotify> parser() {
            return PlayerEnterSceneInfoNotify.PARSER;
        }
        
        @Override
        public Parser<PlayerEnterSceneInfoNotify> getParserForType() {
            return PlayerEnterSceneInfoNotify.PARSER;
        }
        
        @Override
        public PlayerEnterSceneInfoNotify getDefaultInstanceForType() {
            return PlayerEnterSceneInfoNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PlayerEnterSceneInfoNotify();
            PARSER = new AbstractParser<PlayerEnterSceneInfoNotify>() {
                @Override
                public PlayerEnterSceneInfoNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PlayerEnterSceneInfoNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerEnterSceneInfoNotifyOrBuilder
        {
            private int bitField0_;
            private TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo teamEnterInfo_;
            private SingleFieldBuilderV3<TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo, TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo.Builder, TeamEnterSceneInfoOuterClass.TeamEnterSceneInfoOrBuilder> teamEnterInfoBuilder_;
            private int enterSceneToken_;
            private List<AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo> avatarEnterInfo_;
            private RepeatedFieldBuilderV3<AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo, AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo.Builder, AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfoOrBuilder> avatarEnterInfoBuilder_;
            private int curAvatarEntityId_;
            private MPLevelEntityInfoOuterClass.MPLevelEntityInfo mpLevelEntityInfo_;
            private SingleFieldBuilderV3<MPLevelEntityInfoOuterClass.MPLevelEntityInfo, MPLevelEntityInfoOuterClass.MPLevelEntityInfo.Builder, MPLevelEntityInfoOuterClass.MPLevelEntityInfoOrBuilder> mpLevelEntityInfoBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PlayerEnterSceneInfoNotifyOuterClass.internal_static_PlayerEnterSceneInfoNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PlayerEnterSceneInfoNotifyOuterClass.internal_static_PlayerEnterSceneInfoNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerEnterSceneInfoNotify.class, Builder.class);
            }
            
            private Builder() {
                this.avatarEnterInfo_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.avatarEnterInfo_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PlayerEnterSceneInfoNotify.alwaysUseFieldBuilders) {
                    this.getAvatarEnterInfoFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.teamEnterInfoBuilder_ == null) {
                    this.teamEnterInfo_ = null;
                }
                else {
                    this.teamEnterInfo_ = null;
                    this.teamEnterInfoBuilder_ = null;
                }
                this.enterSceneToken_ = 0;
                if (this.avatarEnterInfoBuilder_ == null) {
                    this.avatarEnterInfo_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.avatarEnterInfoBuilder_.clear();
                }
                this.curAvatarEntityId_ = 0;
                if (this.mpLevelEntityInfoBuilder_ == null) {
                    this.mpLevelEntityInfo_ = null;
                }
                else {
                    this.mpLevelEntityInfo_ = null;
                    this.mpLevelEntityInfoBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PlayerEnterSceneInfoNotifyOuterClass.internal_static_PlayerEnterSceneInfoNotify_descriptor;
            }
            
            @Override
            public PlayerEnterSceneInfoNotify getDefaultInstanceForType() {
                return PlayerEnterSceneInfoNotify.getDefaultInstance();
            }
            
            @Override
            public PlayerEnterSceneInfoNotify build() {
                final PlayerEnterSceneInfoNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PlayerEnterSceneInfoNotify buildPartial() {
                final PlayerEnterSceneInfoNotify result = new PlayerEnterSceneInfoNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.teamEnterInfoBuilder_ == null) {
                    result.teamEnterInfo_ = this.teamEnterInfo_;
                }
                else {
                    result.teamEnterInfo_ = this.teamEnterInfoBuilder_.build();
                }
                result.enterSceneToken_ = this.enterSceneToken_;
                if (this.avatarEnterInfoBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.avatarEnterInfo_ = Collections.unmodifiableList((List<? extends AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo>)this.avatarEnterInfo_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.avatarEnterInfo_ = this.avatarEnterInfo_;
                }
                else {
                    result.avatarEnterInfo_ = this.avatarEnterInfoBuilder_.build();
                }
                result.curAvatarEntityId_ = this.curAvatarEntityId_;
                if (this.mpLevelEntityInfoBuilder_ == null) {
                    result.mpLevelEntityInfo_ = this.mpLevelEntityInfo_;
                }
                else {
                    result.mpLevelEntityInfo_ = this.mpLevelEntityInfoBuilder_.build();
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
                if (other instanceof PlayerEnterSceneInfoNotify) {
                    return this.mergeFrom((PlayerEnterSceneInfoNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PlayerEnterSceneInfoNotify other) {
                if (other == PlayerEnterSceneInfoNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.hasTeamEnterInfo()) {
                    this.mergeTeamEnterInfo(other.getTeamEnterInfo());
                }
                if (other.getEnterSceneToken() != 0) {
                    this.setEnterSceneToken(other.getEnterSceneToken());
                }
                if (this.avatarEnterInfoBuilder_ == null) {
                    if (!other.avatarEnterInfo_.isEmpty()) {
                        if (this.avatarEnterInfo_.isEmpty()) {
                            this.avatarEnterInfo_ = other.avatarEnterInfo_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureAvatarEnterInfoIsMutable();
                            this.avatarEnterInfo_.addAll(other.avatarEnterInfo_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.avatarEnterInfo_.isEmpty()) {
                    if (this.avatarEnterInfoBuilder_.isEmpty()) {
                        this.avatarEnterInfoBuilder_.dispose();
                        this.avatarEnterInfoBuilder_ = null;
                        this.avatarEnterInfo_ = other.avatarEnterInfo_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.avatarEnterInfoBuilder_ = (PlayerEnterSceneInfoNotify.alwaysUseFieldBuilders ? this.getAvatarEnterInfoFieldBuilder() : null);
                    }
                    else {
                        this.avatarEnterInfoBuilder_.addAllMessages(other.avatarEnterInfo_);
                    }
                }
                if (other.getCurAvatarEntityId() != 0) {
                    this.setCurAvatarEntityId(other.getCurAvatarEntityId());
                }
                if (other.hasMpLevelEntityInfo()) {
                    this.mergeMpLevelEntityInfo(other.getMpLevelEntityInfo());
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
                PlayerEnterSceneInfoNotify parsedMessage = null;
                try {
                    parsedMessage = PlayerEnterSceneInfoNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PlayerEnterSceneInfoNotify)e.getUnfinishedMessage();
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
            public boolean hasTeamEnterInfo() {
                return this.teamEnterInfoBuilder_ != null || this.teamEnterInfo_ != null;
            }
            
            @Override
            public TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo getTeamEnterInfo() {
                if (this.teamEnterInfoBuilder_ == null) {
                    return (this.teamEnterInfo_ == null) ? TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo.getDefaultInstance() : this.teamEnterInfo_;
                }
                return this.teamEnterInfoBuilder_.getMessage();
            }
            
            public Builder setTeamEnterInfo(final TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo value) {
                if (this.teamEnterInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.teamEnterInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.teamEnterInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setTeamEnterInfo(final TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo.Builder builderForValue) {
                if (this.teamEnterInfoBuilder_ == null) {
                    this.teamEnterInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.teamEnterInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeTeamEnterInfo(final TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo value) {
                if (this.teamEnterInfoBuilder_ == null) {
                    if (this.teamEnterInfo_ != null) {
                        this.teamEnterInfo_ = TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo.newBuilder(this.teamEnterInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.teamEnterInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.teamEnterInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearTeamEnterInfo() {
                if (this.teamEnterInfoBuilder_ == null) {
                    this.teamEnterInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.teamEnterInfo_ = null;
                    this.teamEnterInfoBuilder_ = null;
                }
                return this;
            }
            
            public TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo.Builder getTeamEnterInfoBuilder() {
                this.onChanged();
                return this.getTeamEnterInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public TeamEnterSceneInfoOuterClass.TeamEnterSceneInfoOrBuilder getTeamEnterInfoOrBuilder() {
                if (this.teamEnterInfoBuilder_ != null) {
                    return this.teamEnterInfoBuilder_.getMessageOrBuilder();
                }
                return (this.teamEnterInfo_ == null) ? TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo.getDefaultInstance() : this.teamEnterInfo_;
            }
            
            private SingleFieldBuilderV3<TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo, TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo.Builder, TeamEnterSceneInfoOuterClass.TeamEnterSceneInfoOrBuilder> getTeamEnterInfoFieldBuilder() {
                if (this.teamEnterInfoBuilder_ == null) {
                    this.teamEnterInfoBuilder_ = new SingleFieldBuilderV3<TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo, TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo.Builder, TeamEnterSceneInfoOuterClass.TeamEnterSceneInfoOrBuilder>(this.getTeamEnterInfo(), this.getParentForChildren(), this.isClean());
                    this.teamEnterInfo_ = null;
                }
                return this.teamEnterInfoBuilder_;
            }
            
            @Override
            public int getEnterSceneToken() {
                return this.enterSceneToken_;
            }
            
            public Builder setEnterSceneToken(final int value) {
                this.enterSceneToken_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEnterSceneToken() {
                this.enterSceneToken_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureAvatarEnterInfoIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.avatarEnterInfo_ = new ArrayList<AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo>(this.avatarEnterInfo_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo> getAvatarEnterInfoList() {
                if (this.avatarEnterInfoBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo>)this.avatarEnterInfo_);
                }
                return this.avatarEnterInfoBuilder_.getMessageList();
            }
            
            @Override
            public int getAvatarEnterInfoCount() {
                if (this.avatarEnterInfoBuilder_ == null) {
                    return this.avatarEnterInfo_.size();
                }
                return this.avatarEnterInfoBuilder_.getCount();
            }
            
            @Override
            public AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo getAvatarEnterInfo(final int index) {
                if (this.avatarEnterInfoBuilder_ == null) {
                    return this.avatarEnterInfo_.get(index);
                }
                return this.avatarEnterInfoBuilder_.getMessage(index);
            }
            
            public Builder setAvatarEnterInfo(final int index, final AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo value) {
                if (this.avatarEnterInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureAvatarEnterInfoIsMutable();
                    this.avatarEnterInfo_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.avatarEnterInfoBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setAvatarEnterInfo(final int index, final AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo.Builder builderForValue) {
                if (this.avatarEnterInfoBuilder_ == null) {
                    this.ensureAvatarEnterInfoIsMutable();
                    this.avatarEnterInfo_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.avatarEnterInfoBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAvatarEnterInfo(final AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo value) {
                if (this.avatarEnterInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureAvatarEnterInfoIsMutable();
                    this.avatarEnterInfo_.add(value);
                    this.onChanged();
                }
                else {
                    this.avatarEnterInfoBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addAvatarEnterInfo(final int index, final AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo value) {
                if (this.avatarEnterInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureAvatarEnterInfoIsMutable();
                    this.avatarEnterInfo_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.avatarEnterInfoBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addAvatarEnterInfo(final AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo.Builder builderForValue) {
                if (this.avatarEnterInfoBuilder_ == null) {
                    this.ensureAvatarEnterInfoIsMutable();
                    this.avatarEnterInfo_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.avatarEnterInfoBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addAvatarEnterInfo(final int index, final AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo.Builder builderForValue) {
                if (this.avatarEnterInfoBuilder_ == null) {
                    this.ensureAvatarEnterInfoIsMutable();
                    this.avatarEnterInfo_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.avatarEnterInfoBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllAvatarEnterInfo(final Iterable<? extends AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo> values) {
                if (this.avatarEnterInfoBuilder_ == null) {
                    this.ensureAvatarEnterInfoIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.avatarEnterInfo_);
                    this.onChanged();
                }
                else {
                    this.avatarEnterInfoBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearAvatarEnterInfo() {
                if (this.avatarEnterInfoBuilder_ == null) {
                    this.avatarEnterInfo_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.avatarEnterInfoBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeAvatarEnterInfo(final int index) {
                if (this.avatarEnterInfoBuilder_ == null) {
                    this.ensureAvatarEnterInfoIsMutable();
                    this.avatarEnterInfo_.remove(index);
                    this.onChanged();
                }
                else {
                    this.avatarEnterInfoBuilder_.remove(index);
                }
                return this;
            }
            
            public AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo.Builder getAvatarEnterInfoBuilder(final int index) {
                return this.getAvatarEnterInfoFieldBuilder().getBuilder(index);
            }
            
            @Override
            public AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfoOrBuilder getAvatarEnterInfoOrBuilder(final int index) {
                if (this.avatarEnterInfoBuilder_ == null) {
                    return this.avatarEnterInfo_.get(index);
                }
                return this.avatarEnterInfoBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfoOrBuilder> getAvatarEnterInfoOrBuilderList() {
                if (this.avatarEnterInfoBuilder_ != null) {
                    return this.avatarEnterInfoBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfoOrBuilder>)this.avatarEnterInfo_);
            }
            
            public AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo.Builder addAvatarEnterInfoBuilder() {
                return this.getAvatarEnterInfoFieldBuilder().addBuilder(AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo.getDefaultInstance());
            }
            
            public AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo.Builder addAvatarEnterInfoBuilder(final int index) {
                return this.getAvatarEnterInfoFieldBuilder().addBuilder(index, AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo.getDefaultInstance());
            }
            
            public List<AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo.Builder> getAvatarEnterInfoBuilderList() {
                return this.getAvatarEnterInfoFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo, AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo.Builder, AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfoOrBuilder> getAvatarEnterInfoFieldBuilder() {
                if (this.avatarEnterInfoBuilder_ == null) {
                    this.avatarEnterInfoBuilder_ = new RepeatedFieldBuilderV3<AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo, AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo.Builder, AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfoOrBuilder>(this.avatarEnterInfo_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.avatarEnterInfo_ = null;
                }
                return this.avatarEnterInfoBuilder_;
            }
            
            @Override
            public int getCurAvatarEntityId() {
                return this.curAvatarEntityId_;
            }
            
            public Builder setCurAvatarEntityId(final int value) {
                this.curAvatarEntityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurAvatarEntityId() {
                this.curAvatarEntityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasMpLevelEntityInfo() {
                return this.mpLevelEntityInfoBuilder_ != null || this.mpLevelEntityInfo_ != null;
            }
            
            @Override
            public MPLevelEntityInfoOuterClass.MPLevelEntityInfo getMpLevelEntityInfo() {
                if (this.mpLevelEntityInfoBuilder_ == null) {
                    return (this.mpLevelEntityInfo_ == null) ? MPLevelEntityInfoOuterClass.MPLevelEntityInfo.getDefaultInstance() : this.mpLevelEntityInfo_;
                }
                return this.mpLevelEntityInfoBuilder_.getMessage();
            }
            
            public Builder setMpLevelEntityInfo(final MPLevelEntityInfoOuterClass.MPLevelEntityInfo value) {
                if (this.mpLevelEntityInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.mpLevelEntityInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.mpLevelEntityInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setMpLevelEntityInfo(final MPLevelEntityInfoOuterClass.MPLevelEntityInfo.Builder builderForValue) {
                if (this.mpLevelEntityInfoBuilder_ == null) {
                    this.mpLevelEntityInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.mpLevelEntityInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeMpLevelEntityInfo(final MPLevelEntityInfoOuterClass.MPLevelEntityInfo value) {
                if (this.mpLevelEntityInfoBuilder_ == null) {
                    if (this.mpLevelEntityInfo_ != null) {
                        this.mpLevelEntityInfo_ = MPLevelEntityInfoOuterClass.MPLevelEntityInfo.newBuilder(this.mpLevelEntityInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.mpLevelEntityInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.mpLevelEntityInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearMpLevelEntityInfo() {
                if (this.mpLevelEntityInfoBuilder_ == null) {
                    this.mpLevelEntityInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.mpLevelEntityInfo_ = null;
                    this.mpLevelEntityInfoBuilder_ = null;
                }
                return this;
            }
            
            public MPLevelEntityInfoOuterClass.MPLevelEntityInfo.Builder getMpLevelEntityInfoBuilder() {
                this.onChanged();
                return this.getMpLevelEntityInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public MPLevelEntityInfoOuterClass.MPLevelEntityInfoOrBuilder getMpLevelEntityInfoOrBuilder() {
                if (this.mpLevelEntityInfoBuilder_ != null) {
                    return this.mpLevelEntityInfoBuilder_.getMessageOrBuilder();
                }
                return (this.mpLevelEntityInfo_ == null) ? MPLevelEntityInfoOuterClass.MPLevelEntityInfo.getDefaultInstance() : this.mpLevelEntityInfo_;
            }
            
            private SingleFieldBuilderV3<MPLevelEntityInfoOuterClass.MPLevelEntityInfo, MPLevelEntityInfoOuterClass.MPLevelEntityInfo.Builder, MPLevelEntityInfoOuterClass.MPLevelEntityInfoOrBuilder> getMpLevelEntityInfoFieldBuilder() {
                if (this.mpLevelEntityInfoBuilder_ == null) {
                    this.mpLevelEntityInfoBuilder_ = new SingleFieldBuilderV3<MPLevelEntityInfoOuterClass.MPLevelEntityInfo, MPLevelEntityInfoOuterClass.MPLevelEntityInfo.Builder, MPLevelEntityInfoOuterClass.MPLevelEntityInfoOrBuilder>(this.getMpLevelEntityInfo(), this.getParentForChildren(), this.isClean());
                    this.mpLevelEntityInfo_ = null;
                }
                return this.mpLevelEntityInfoBuilder_;
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
    
    public interface PlayerEnterSceneInfoNotifyOrBuilder extends MessageOrBuilder
    {
        boolean hasTeamEnterInfo();
        
        TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo getTeamEnterInfo();
        
        TeamEnterSceneInfoOuterClass.TeamEnterSceneInfoOrBuilder getTeamEnterInfoOrBuilder();
        
        int getEnterSceneToken();
        
        List<AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo> getAvatarEnterInfoList();
        
        AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo getAvatarEnterInfo(final int p0);
        
        int getAvatarEnterInfoCount();
        
        List<? extends AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfoOrBuilder> getAvatarEnterInfoOrBuilderList();
        
        AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfoOrBuilder getAvatarEnterInfoOrBuilder(final int p0);
        
        int getCurAvatarEntityId();
        
        boolean hasMpLevelEntityInfo();
        
        MPLevelEntityInfoOuterClass.MPLevelEntityInfo getMpLevelEntityInfo();
        
        MPLevelEntityInfoOuterClass.MPLevelEntityInfoOrBuilder getMpLevelEntityInfoOrBuilder();
    }
}
