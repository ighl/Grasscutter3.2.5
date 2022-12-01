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
import com.google.protobuf.Internal;
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

public final class SceneTeamAvatarOuterClass
{
    private static final Descriptors.Descriptor internal_static_SceneTeamAvatar_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SceneTeamAvatar_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SceneTeamAvatarOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SceneTeamAvatarOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015SceneTeamAvatar.proto\u001a\u0019AbilityControlBlock.proto\u001a\u001aAbilitySyncStateInfo.proto\u001a\u0010AvatarInfo.proto\u001a\u0015SceneAvatarInfo.proto\u001a\u0015SceneEntityInfo.proto\u001a\u0010ServerBuff.proto\"\u0098\u0004\n\u000fSceneTeamAvatar\u00122\n\u0013avatar_ability_info\u0018\u0005 \u0001(\u000b2\u0015.AbilitySyncStateInfo\u0012 \n\u000bavatar_info\u0018\u0002 \u0001(\u000b2\u000b.AvatarInfo\u0012\u0013\n\u000bis_on_scene\u0018\u000e \u0001(\b\u0012\u0011\n\tentity_id\u0018\u0007 \u0001(\r\u0012\u0013\n\u000bavatar_guid\u0018\u0004 \u0001(\u0004\u0012\u0010\n\bscene_id\u0018\r \u0001(\r\u0012\u0018\n\u0010weapon_entity_id\u0018\u0001 \u0001(\r\u0012+\n\u0011scene_avatar_info\u0018\u000f \u0001(\u000b2\u0010.SceneAvatarInfo\u0012\u0013\n\u000bweapon_guid\u0018\u0006 \u0001(\u0004\u00122\n\u0013weapon_ability_info\u0018\f \u0001(\u000b2\u0015.AbilitySyncStateInfo\u0012+\n\u0011scene_entity_info\u0018\u0003 \u0001(\u000b2\u0010.SceneEntityInfo\u0012\u0012\n\nplayer_uid\u0018\t \u0001(\r\u0012\u0015\n\fis_reconnect\u0018¢\u0005 \u0001(\b\u00123\n\u0015ability_control_block\u0018\u000b \u0001(\u000b2\u0014.AbilityControlBlock\u0012\u001c\n\u0014is_player_cur_avatar\u0018\n \u0001(\b\u0012%\n\u0010server_buff_list\u0018\b \u0003(\u000b2\u000b.ServerBuffB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SceneTeamAvatarOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AbilityControlBlockOuterClass.getDescriptor(), AbilitySyncStateInfoOuterClass.getDescriptor(), AvatarInfoOuterClass.getDescriptor(), SceneAvatarInfoOuterClass.getDescriptor(), SceneEntityInfoOuterClass.getDescriptor(), ServerBuffOuterClass.getDescriptor() });
        internal_static_SceneTeamAvatar_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SceneTeamAvatar_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SceneTeamAvatarOuterClass.internal_static_SceneTeamAvatar_descriptor, new String[] { "AvatarAbilityInfo", "AvatarInfo", "IsOnScene", "EntityId", "AvatarGuid", "SceneId", "WeaponEntityId", "SceneAvatarInfo", "WeaponGuid", "WeaponAbilityInfo", "SceneEntityInfo", "PlayerUid", "IsReconnect", "AbilityControlBlock", "IsPlayerCurAvatar", "ServerBuffList" });
        AbilityControlBlockOuterClass.getDescriptor();
        AbilitySyncStateInfoOuterClass.getDescriptor();
        AvatarInfoOuterClass.getDescriptor();
        SceneAvatarInfoOuterClass.getDescriptor();
        SceneEntityInfoOuterClass.getDescriptor();
        ServerBuffOuterClass.getDescriptor();
    }
    
    public static final class SceneTeamAvatar extends GeneratedMessageV3 implements SceneTeamAvatarOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int AVATAR_ABILITY_INFO_FIELD_NUMBER = 5;
        private AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo avatarAbilityInfo_;
        public static final int AVATAR_INFO_FIELD_NUMBER = 2;
        private AvatarInfoOuterClass.AvatarInfo avatarInfo_;
        public static final int IS_ON_SCENE_FIELD_NUMBER = 14;
        private boolean isOnScene_;
        public static final int ENTITY_ID_FIELD_NUMBER = 7;
        private int entityId_;
        public static final int AVATAR_GUID_FIELD_NUMBER = 4;
        private long avatarGuid_;
        public static final int SCENE_ID_FIELD_NUMBER = 13;
        private int sceneId_;
        public static final int WEAPON_ENTITY_ID_FIELD_NUMBER = 1;
        private int weaponEntityId_;
        public static final int SCENE_AVATAR_INFO_FIELD_NUMBER = 15;
        private SceneAvatarInfoOuterClass.SceneAvatarInfo sceneAvatarInfo_;
        public static final int WEAPON_GUID_FIELD_NUMBER = 6;
        private long weaponGuid_;
        public static final int WEAPON_ABILITY_INFO_FIELD_NUMBER = 12;
        private AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo weaponAbilityInfo_;
        public static final int SCENE_ENTITY_INFO_FIELD_NUMBER = 3;
        private SceneEntityInfoOuterClass.SceneEntityInfo sceneEntityInfo_;
        public static final int PLAYER_UID_FIELD_NUMBER = 9;
        private int playerUid_;
        public static final int IS_RECONNECT_FIELD_NUMBER = 674;
        private boolean isReconnect_;
        public static final int ABILITY_CONTROL_BLOCK_FIELD_NUMBER = 11;
        private AbilityControlBlockOuterClass.AbilityControlBlock abilityControlBlock_;
        public static final int IS_PLAYER_CUR_AVATAR_FIELD_NUMBER = 10;
        private boolean isPlayerCurAvatar_;
        public static final int SERVER_BUFF_LIST_FIELD_NUMBER = 8;
        private List<ServerBuffOuterClass.ServerBuff> serverBuffList_;
        private byte memoizedIsInitialized;
        private static final SceneTeamAvatar DEFAULT_INSTANCE;
        private static final Parser<SceneTeamAvatar> PARSER;
        
        private SceneTeamAvatar(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SceneTeamAvatar() {
            this.memoizedIsInitialized = -1;
            this.serverBuffList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SceneTeamAvatar();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SceneTeamAvatar(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 8: {
                            this.weaponEntityId_ = input.readUInt32();
                            continue;
                        }
                        case 18: {
                            AvatarInfoOuterClass.AvatarInfo.Builder subBuilder = null;
                            if (this.avatarInfo_ != null) {
                                subBuilder = this.avatarInfo_.toBuilder();
                            }
                            this.avatarInfo_ = input.readMessage(AvatarInfoOuterClass.AvatarInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.avatarInfo_);
                                this.avatarInfo_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 26: {
                            SceneEntityInfoOuterClass.SceneEntityInfo.Builder subBuilder2 = null;
                            if (this.sceneEntityInfo_ != null) {
                                subBuilder2 = this.sceneEntityInfo_.toBuilder();
                            }
                            this.sceneEntityInfo_ = input.readMessage(SceneEntityInfoOuterClass.SceneEntityInfo.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom(this.sceneEntityInfo_);
                                this.sceneEntityInfo_ = subBuilder2.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 32: {
                            this.avatarGuid_ = input.readUInt64();
                            continue;
                        }
                        case 42: {
                            AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder subBuilder3 = null;
                            if (this.avatarAbilityInfo_ != null) {
                                subBuilder3 = this.avatarAbilityInfo_.toBuilder();
                            }
                            this.avatarAbilityInfo_ = input.readMessage(AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.parser(), extensionRegistry);
                            if (subBuilder3 != null) {
                                subBuilder3.mergeFrom(this.avatarAbilityInfo_);
                                this.avatarAbilityInfo_ = subBuilder3.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 48: {
                            this.weaponGuid_ = input.readUInt64();
                            continue;
                        }
                        case 56: {
                            this.entityId_ = input.readUInt32();
                            continue;
                        }
                        case 66: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.serverBuffList_ = new ArrayList<ServerBuffOuterClass.ServerBuff>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.serverBuffList_.add(input.readMessage(ServerBuffOuterClass.ServerBuff.parser(), extensionRegistry));
                            continue;
                        }
                        case 72: {
                            this.playerUid_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
                            this.isPlayerCurAvatar_ = input.readBool();
                            continue;
                        }
                        case 90: {
                            AbilityControlBlockOuterClass.AbilityControlBlock.Builder subBuilder4 = null;
                            if (this.abilityControlBlock_ != null) {
                                subBuilder4 = this.abilityControlBlock_.toBuilder();
                            }
                            this.abilityControlBlock_ = input.readMessage(AbilityControlBlockOuterClass.AbilityControlBlock.parser(), extensionRegistry);
                            if (subBuilder4 != null) {
                                subBuilder4.mergeFrom(this.abilityControlBlock_);
                                this.abilityControlBlock_ = subBuilder4.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 98: {
                            AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder subBuilder3 = null;
                            if (this.weaponAbilityInfo_ != null) {
                                subBuilder3 = this.weaponAbilityInfo_.toBuilder();
                            }
                            this.weaponAbilityInfo_ = input.readMessage(AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.parser(), extensionRegistry);
                            if (subBuilder3 != null) {
                                subBuilder3.mergeFrom(this.weaponAbilityInfo_);
                                this.weaponAbilityInfo_ = subBuilder3.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 104: {
                            this.sceneId_ = input.readUInt32();
                            continue;
                        }
                        case 112: {
                            this.isOnScene_ = input.readBool();
                            continue;
                        }
                        case 122: {
                            SceneAvatarInfoOuterClass.SceneAvatarInfo.Builder subBuilder5 = null;
                            if (this.sceneAvatarInfo_ != null) {
                                subBuilder5 = this.sceneAvatarInfo_.toBuilder();
                            }
                            this.sceneAvatarInfo_ = input.readMessage(SceneAvatarInfoOuterClass.SceneAvatarInfo.parser(), extensionRegistry);
                            if (subBuilder5 != null) {
                                subBuilder5.mergeFrom(this.sceneAvatarInfo_);
                                this.sceneAvatarInfo_ = subBuilder5.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 5392: {
                            this.isReconnect_ = input.readBool();
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
                    this.serverBuffList_ = Collections.unmodifiableList((List<? extends ServerBuffOuterClass.ServerBuff>)this.serverBuffList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return SceneTeamAvatarOuterClass.internal_static_SceneTeamAvatar_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SceneTeamAvatarOuterClass.internal_static_SceneTeamAvatar_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneTeamAvatar.class, Builder.class);
        }
        
        @Override
        public boolean hasAvatarAbilityInfo() {
            return this.avatarAbilityInfo_ != null;
        }
        
        @Override
        public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getAvatarAbilityInfo() {
            return (this.avatarAbilityInfo_ == null) ? AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : this.avatarAbilityInfo_;
        }
        
        @Override
        public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getAvatarAbilityInfoOrBuilder() {
            return this.getAvatarAbilityInfo();
        }
        
        @Override
        public boolean hasAvatarInfo() {
            return this.avatarInfo_ != null;
        }
        
        @Override
        public AvatarInfoOuterClass.AvatarInfo getAvatarInfo() {
            return (this.avatarInfo_ == null) ? AvatarInfoOuterClass.AvatarInfo.getDefaultInstance() : this.avatarInfo_;
        }
        
        @Override
        public AvatarInfoOuterClass.AvatarInfoOrBuilder getAvatarInfoOrBuilder() {
            return this.getAvatarInfo();
        }
        
        @Override
        public boolean getIsOnScene() {
            return this.isOnScene_;
        }
        
        @Override
        public int getEntityId() {
            return this.entityId_;
        }
        
        @Override
        public long getAvatarGuid() {
            return this.avatarGuid_;
        }
        
        @Override
        public int getSceneId() {
            return this.sceneId_;
        }
        
        @Override
        public int getWeaponEntityId() {
            return this.weaponEntityId_;
        }
        
        @Override
        public boolean hasSceneAvatarInfo() {
            return this.sceneAvatarInfo_ != null;
        }
        
        @Override
        public SceneAvatarInfoOuterClass.SceneAvatarInfo getSceneAvatarInfo() {
            return (this.sceneAvatarInfo_ == null) ? SceneAvatarInfoOuterClass.SceneAvatarInfo.getDefaultInstance() : this.sceneAvatarInfo_;
        }
        
        @Override
        public SceneAvatarInfoOuterClass.SceneAvatarInfoOrBuilder getSceneAvatarInfoOrBuilder() {
            return this.getSceneAvatarInfo();
        }
        
        @Override
        public long getWeaponGuid() {
            return this.weaponGuid_;
        }
        
        @Override
        public boolean hasWeaponAbilityInfo() {
            return this.weaponAbilityInfo_ != null;
        }
        
        @Override
        public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getWeaponAbilityInfo() {
            return (this.weaponAbilityInfo_ == null) ? AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : this.weaponAbilityInfo_;
        }
        
        @Override
        public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getWeaponAbilityInfoOrBuilder() {
            return this.getWeaponAbilityInfo();
        }
        
        @Override
        public boolean hasSceneEntityInfo() {
            return this.sceneEntityInfo_ != null;
        }
        
        @Override
        public SceneEntityInfoOuterClass.SceneEntityInfo getSceneEntityInfo() {
            return (this.sceneEntityInfo_ == null) ? SceneEntityInfoOuterClass.SceneEntityInfo.getDefaultInstance() : this.sceneEntityInfo_;
        }
        
        @Override
        public SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder getSceneEntityInfoOrBuilder() {
            return this.getSceneEntityInfo();
        }
        
        @Override
        public int getPlayerUid() {
            return this.playerUid_;
        }
        
        @Override
        public boolean getIsReconnect() {
            return this.isReconnect_;
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
        public boolean getIsPlayerCurAvatar() {
            return this.isPlayerCurAvatar_;
        }
        
        @Override
        public List<ServerBuffOuterClass.ServerBuff> getServerBuffListList() {
            return this.serverBuffList_;
        }
        
        @Override
        public List<? extends ServerBuffOuterClass.ServerBuffOrBuilder> getServerBuffListOrBuilderList() {
            return this.serverBuffList_;
        }
        
        @Override
        public int getServerBuffListCount() {
            return this.serverBuffList_.size();
        }
        
        @Override
        public ServerBuffOuterClass.ServerBuff getServerBuffList(final int index) {
            return this.serverBuffList_.get(index);
        }
        
        @Override
        public ServerBuffOuterClass.ServerBuffOrBuilder getServerBuffListOrBuilder(final int index) {
            return this.serverBuffList_.get(index);
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
            if (this.weaponEntityId_ != 0) {
                output.writeUInt32(1, this.weaponEntityId_);
            }
            if (this.avatarInfo_ != null) {
                output.writeMessage(2, this.getAvatarInfo());
            }
            if (this.sceneEntityInfo_ != null) {
                output.writeMessage(3, this.getSceneEntityInfo());
            }
            if (this.avatarGuid_ != 0L) {
                output.writeUInt64(4, this.avatarGuid_);
            }
            if (this.avatarAbilityInfo_ != null) {
                output.writeMessage(5, this.getAvatarAbilityInfo());
            }
            if (this.weaponGuid_ != 0L) {
                output.writeUInt64(6, this.weaponGuid_);
            }
            if (this.entityId_ != 0) {
                output.writeUInt32(7, this.entityId_);
            }
            for (int i = 0; i < this.serverBuffList_.size(); ++i) {
                output.writeMessage(8, this.serverBuffList_.get(i));
            }
            if (this.playerUid_ != 0) {
                output.writeUInt32(9, this.playerUid_);
            }
            if (this.isPlayerCurAvatar_) {
                output.writeBool(10, this.isPlayerCurAvatar_);
            }
            if (this.abilityControlBlock_ != null) {
                output.writeMessage(11, this.getAbilityControlBlock());
            }
            if (this.weaponAbilityInfo_ != null) {
                output.writeMessage(12, this.getWeaponAbilityInfo());
            }
            if (this.sceneId_ != 0) {
                output.writeUInt32(13, this.sceneId_);
            }
            if (this.isOnScene_) {
                output.writeBool(14, this.isOnScene_);
            }
            if (this.sceneAvatarInfo_ != null) {
                output.writeMessage(15, this.getSceneAvatarInfo());
            }
            if (this.isReconnect_) {
                output.writeBool(674, this.isReconnect_);
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
            if (this.weaponEntityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.weaponEntityId_);
            }
            if (this.avatarInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(2, this.getAvatarInfo());
            }
            if (this.sceneEntityInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(3, this.getSceneEntityInfo());
            }
            if (this.avatarGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(4, this.avatarGuid_);
            }
            if (this.avatarAbilityInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(5, this.getAvatarAbilityInfo());
            }
            if (this.weaponGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(6, this.weaponGuid_);
            }
            if (this.entityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.entityId_);
            }
            for (int i = 0; i < this.serverBuffList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(8, this.serverBuffList_.get(i));
            }
            if (this.playerUid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.playerUid_);
            }
            if (this.isPlayerCurAvatar_) {
                size += CodedOutputStream.computeBoolSize(10, this.isPlayerCurAvatar_);
            }
            if (this.abilityControlBlock_ != null) {
                size += CodedOutputStream.computeMessageSize(11, this.getAbilityControlBlock());
            }
            if (this.weaponAbilityInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(12, this.getWeaponAbilityInfo());
            }
            if (this.sceneId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.sceneId_);
            }
            if (this.isOnScene_) {
                size += CodedOutputStream.computeBoolSize(14, this.isOnScene_);
            }
            if (this.sceneAvatarInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(15, this.getSceneAvatarInfo());
            }
            if (this.isReconnect_) {
                size += CodedOutputStream.computeBoolSize(674, this.isReconnect_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SceneTeamAvatar)) {
                return super.equals(obj);
            }
            final SceneTeamAvatar other = (SceneTeamAvatar)obj;
            return this.hasAvatarAbilityInfo() == other.hasAvatarAbilityInfo() && (!this.hasAvatarAbilityInfo() || this.getAvatarAbilityInfo().equals(other.getAvatarAbilityInfo())) && this.hasAvatarInfo() == other.hasAvatarInfo() && (!this.hasAvatarInfo() || this.getAvatarInfo().equals(other.getAvatarInfo())) && this.getIsOnScene() == other.getIsOnScene() && this.getEntityId() == other.getEntityId() && this.getAvatarGuid() == other.getAvatarGuid() && this.getSceneId() == other.getSceneId() && this.getWeaponEntityId() == other.getWeaponEntityId() && this.hasSceneAvatarInfo() == other.hasSceneAvatarInfo() && (!this.hasSceneAvatarInfo() || this.getSceneAvatarInfo().equals(other.getSceneAvatarInfo())) && this.getWeaponGuid() == other.getWeaponGuid() && this.hasWeaponAbilityInfo() == other.hasWeaponAbilityInfo() && (!this.hasWeaponAbilityInfo() || this.getWeaponAbilityInfo().equals(other.getWeaponAbilityInfo())) && this.hasSceneEntityInfo() == other.hasSceneEntityInfo() && (!this.hasSceneEntityInfo() || this.getSceneEntityInfo().equals(other.getSceneEntityInfo())) && this.getPlayerUid() == other.getPlayerUid() && this.getIsReconnect() == other.getIsReconnect() && this.hasAbilityControlBlock() == other.hasAbilityControlBlock() && (!this.hasAbilityControlBlock() || this.getAbilityControlBlock().equals(other.getAbilityControlBlock())) && this.getIsPlayerCurAvatar() == other.getIsPlayerCurAvatar() && this.getServerBuffListList().equals(other.getServerBuffListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasAvatarAbilityInfo()) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getAvatarAbilityInfo().hashCode();
            }
            if (this.hasAvatarInfo()) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getAvatarInfo().hashCode();
            }
            hash = 37 * hash + 14;
            hash = 53 * hash + Internal.hashBoolean(this.getIsOnScene());
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getEntityId();
            hash = 37 * hash + 4;
            hash = 53 * hash + Internal.hashLong(this.getAvatarGuid());
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getSceneId();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getWeaponEntityId();
            if (this.hasSceneAvatarInfo()) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getSceneAvatarInfo().hashCode();
            }
            hash = 37 * hash + 6;
            hash = 53 * hash + Internal.hashLong(this.getWeaponGuid());
            if (this.hasWeaponAbilityInfo()) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getWeaponAbilityInfo().hashCode();
            }
            if (this.hasSceneEntityInfo()) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getSceneEntityInfo().hashCode();
            }
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getPlayerUid();
            hash = 37 * hash + 674;
            hash = 53 * hash + Internal.hashBoolean(this.getIsReconnect());
            if (this.hasAbilityControlBlock()) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.getAbilityControlBlock().hashCode();
            }
            hash = 37 * hash + 10;
            hash = 53 * hash + Internal.hashBoolean(this.getIsPlayerCurAvatar());
            if (this.getServerBuffListCount() > 0) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getServerBuffListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SceneTeamAvatar parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SceneTeamAvatar.PARSER.parseFrom(data);
        }
        
        public static SceneTeamAvatar parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneTeamAvatar.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneTeamAvatar parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SceneTeamAvatar.PARSER.parseFrom(data);
        }
        
        public static SceneTeamAvatar parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneTeamAvatar.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneTeamAvatar parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SceneTeamAvatar.PARSER.parseFrom(data);
        }
        
        public static SceneTeamAvatar parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneTeamAvatar.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneTeamAvatar parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneTeamAvatar.PARSER, input);
        }
        
        public static SceneTeamAvatar parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneTeamAvatar.PARSER, input, extensionRegistry);
        }
        
        public static SceneTeamAvatar parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneTeamAvatar.PARSER, input);
        }
        
        public static SceneTeamAvatar parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneTeamAvatar.PARSER, input, extensionRegistry);
        }
        
        public static SceneTeamAvatar parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneTeamAvatar.PARSER, input);
        }
        
        public static SceneTeamAvatar parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneTeamAvatar.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SceneTeamAvatar.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SceneTeamAvatar prototype) {
            return SceneTeamAvatar.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SceneTeamAvatar.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SceneTeamAvatar getDefaultInstance() {
            return SceneTeamAvatar.DEFAULT_INSTANCE;
        }
        
        public static Parser<SceneTeamAvatar> parser() {
            return SceneTeamAvatar.PARSER;
        }
        
        @Override
        public Parser<SceneTeamAvatar> getParserForType() {
            return SceneTeamAvatar.PARSER;
        }
        
        @Override
        public SceneTeamAvatar getDefaultInstanceForType() {
            return SceneTeamAvatar.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SceneTeamAvatar();
            PARSER = new AbstractParser<SceneTeamAvatar>() {
                @Override
                public SceneTeamAvatar parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SceneTeamAvatar(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SceneTeamAvatarOrBuilder
        {
            private int bitField0_;
            private AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo avatarAbilityInfo_;
            private SingleFieldBuilderV3<AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> avatarAbilityInfoBuilder_;
            private AvatarInfoOuterClass.AvatarInfo avatarInfo_;
            private SingleFieldBuilderV3<AvatarInfoOuterClass.AvatarInfo, AvatarInfoOuterClass.AvatarInfo.Builder, AvatarInfoOuterClass.AvatarInfoOrBuilder> avatarInfoBuilder_;
            private boolean isOnScene_;
            private int entityId_;
            private long avatarGuid_;
            private int sceneId_;
            private int weaponEntityId_;
            private SceneAvatarInfoOuterClass.SceneAvatarInfo sceneAvatarInfo_;
            private SingleFieldBuilderV3<SceneAvatarInfoOuterClass.SceneAvatarInfo, SceneAvatarInfoOuterClass.SceneAvatarInfo.Builder, SceneAvatarInfoOuterClass.SceneAvatarInfoOrBuilder> sceneAvatarInfoBuilder_;
            private long weaponGuid_;
            private AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo weaponAbilityInfo_;
            private SingleFieldBuilderV3<AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> weaponAbilityInfoBuilder_;
            private SceneEntityInfoOuterClass.SceneEntityInfo sceneEntityInfo_;
            private SingleFieldBuilderV3<SceneEntityInfoOuterClass.SceneEntityInfo, SceneEntityInfoOuterClass.SceneEntityInfo.Builder, SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder> sceneEntityInfoBuilder_;
            private int playerUid_;
            private boolean isReconnect_;
            private AbilityControlBlockOuterClass.AbilityControlBlock abilityControlBlock_;
            private SingleFieldBuilderV3<AbilityControlBlockOuterClass.AbilityControlBlock, AbilityControlBlockOuterClass.AbilityControlBlock.Builder, AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder> abilityControlBlockBuilder_;
            private boolean isPlayerCurAvatar_;
            private List<ServerBuffOuterClass.ServerBuff> serverBuffList_;
            private RepeatedFieldBuilderV3<ServerBuffOuterClass.ServerBuff, ServerBuffOuterClass.ServerBuff.Builder, ServerBuffOuterClass.ServerBuffOrBuilder> serverBuffListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SceneTeamAvatarOuterClass.internal_static_SceneTeamAvatar_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SceneTeamAvatarOuterClass.internal_static_SceneTeamAvatar_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneTeamAvatar.class, Builder.class);
            }
            
            private Builder() {
                this.serverBuffList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.serverBuffList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SceneTeamAvatar.alwaysUseFieldBuilders) {
                    this.getServerBuffListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.avatarAbilityInfoBuilder_ == null) {
                    this.avatarAbilityInfo_ = null;
                }
                else {
                    this.avatarAbilityInfo_ = null;
                    this.avatarAbilityInfoBuilder_ = null;
                }
                if (this.avatarInfoBuilder_ == null) {
                    this.avatarInfo_ = null;
                }
                else {
                    this.avatarInfo_ = null;
                    this.avatarInfoBuilder_ = null;
                }
                this.isOnScene_ = false;
                this.entityId_ = 0;
                this.avatarGuid_ = 0L;
                this.sceneId_ = 0;
                this.weaponEntityId_ = 0;
                if (this.sceneAvatarInfoBuilder_ == null) {
                    this.sceneAvatarInfo_ = null;
                }
                else {
                    this.sceneAvatarInfo_ = null;
                    this.sceneAvatarInfoBuilder_ = null;
                }
                this.weaponGuid_ = 0L;
                if (this.weaponAbilityInfoBuilder_ == null) {
                    this.weaponAbilityInfo_ = null;
                }
                else {
                    this.weaponAbilityInfo_ = null;
                    this.weaponAbilityInfoBuilder_ = null;
                }
                if (this.sceneEntityInfoBuilder_ == null) {
                    this.sceneEntityInfo_ = null;
                }
                else {
                    this.sceneEntityInfo_ = null;
                    this.sceneEntityInfoBuilder_ = null;
                }
                this.playerUid_ = 0;
                this.isReconnect_ = false;
                if (this.abilityControlBlockBuilder_ == null) {
                    this.abilityControlBlock_ = null;
                }
                else {
                    this.abilityControlBlock_ = null;
                    this.abilityControlBlockBuilder_ = null;
                }
                this.isPlayerCurAvatar_ = false;
                if (this.serverBuffListBuilder_ == null) {
                    this.serverBuffList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.serverBuffListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SceneTeamAvatarOuterClass.internal_static_SceneTeamAvatar_descriptor;
            }
            
            @Override
            public SceneTeamAvatar getDefaultInstanceForType() {
                return SceneTeamAvatar.getDefaultInstance();
            }
            
            @Override
            public SceneTeamAvatar build() {
                final SceneTeamAvatar result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SceneTeamAvatar buildPartial() {
                final SceneTeamAvatar result = new SceneTeamAvatar(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.avatarAbilityInfoBuilder_ == null) {
                    result.avatarAbilityInfo_ = this.avatarAbilityInfo_;
                }
                else {
                    result.avatarAbilityInfo_ = this.avatarAbilityInfoBuilder_.build();
                }
                if (this.avatarInfoBuilder_ == null) {
                    result.avatarInfo_ = this.avatarInfo_;
                }
                else {
                    result.avatarInfo_ = this.avatarInfoBuilder_.build();
                }
                result.isOnScene_ = this.isOnScene_;
                result.entityId_ = this.entityId_;
                result.avatarGuid_ = this.avatarGuid_;
                result.sceneId_ = this.sceneId_;
                result.weaponEntityId_ = this.weaponEntityId_;
                if (this.sceneAvatarInfoBuilder_ == null) {
                    result.sceneAvatarInfo_ = this.sceneAvatarInfo_;
                }
                else {
                    result.sceneAvatarInfo_ = this.sceneAvatarInfoBuilder_.build();
                }
                result.weaponGuid_ = this.weaponGuid_;
                if (this.weaponAbilityInfoBuilder_ == null) {
                    result.weaponAbilityInfo_ = this.weaponAbilityInfo_;
                }
                else {
                    result.weaponAbilityInfo_ = this.weaponAbilityInfoBuilder_.build();
                }
                if (this.sceneEntityInfoBuilder_ == null) {
                    result.sceneEntityInfo_ = this.sceneEntityInfo_;
                }
                else {
                    result.sceneEntityInfo_ = this.sceneEntityInfoBuilder_.build();
                }
                result.playerUid_ = this.playerUid_;
                result.isReconnect_ = this.isReconnect_;
                if (this.abilityControlBlockBuilder_ == null) {
                    result.abilityControlBlock_ = this.abilityControlBlock_;
                }
                else {
                    result.abilityControlBlock_ = this.abilityControlBlockBuilder_.build();
                }
                result.isPlayerCurAvatar_ = this.isPlayerCurAvatar_;
                if (this.serverBuffListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.serverBuffList_ = Collections.unmodifiableList((List<? extends ServerBuffOuterClass.ServerBuff>)this.serverBuffList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.serverBuffList_ = this.serverBuffList_;
                }
                else {
                    result.serverBuffList_ = this.serverBuffListBuilder_.build();
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
                if (other instanceof SceneTeamAvatar) {
                    return this.mergeFrom((SceneTeamAvatar)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SceneTeamAvatar other) {
                if (other == SceneTeamAvatar.getDefaultInstance()) {
                    return this;
                }
                if (other.hasAvatarAbilityInfo()) {
                    this.mergeAvatarAbilityInfo(other.getAvatarAbilityInfo());
                }
                if (other.hasAvatarInfo()) {
                    this.mergeAvatarInfo(other.getAvatarInfo());
                }
                if (other.getIsOnScene()) {
                    this.setIsOnScene(other.getIsOnScene());
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
                }
                if (other.getAvatarGuid() != 0L) {
                    this.setAvatarGuid(other.getAvatarGuid());
                }
                if (other.getSceneId() != 0) {
                    this.setSceneId(other.getSceneId());
                }
                if (other.getWeaponEntityId() != 0) {
                    this.setWeaponEntityId(other.getWeaponEntityId());
                }
                if (other.hasSceneAvatarInfo()) {
                    this.mergeSceneAvatarInfo(other.getSceneAvatarInfo());
                }
                if (other.getWeaponGuid() != 0L) {
                    this.setWeaponGuid(other.getWeaponGuid());
                }
                if (other.hasWeaponAbilityInfo()) {
                    this.mergeWeaponAbilityInfo(other.getWeaponAbilityInfo());
                }
                if (other.hasSceneEntityInfo()) {
                    this.mergeSceneEntityInfo(other.getSceneEntityInfo());
                }
                if (other.getPlayerUid() != 0) {
                    this.setPlayerUid(other.getPlayerUid());
                }
                if (other.getIsReconnect()) {
                    this.setIsReconnect(other.getIsReconnect());
                }
                if (other.hasAbilityControlBlock()) {
                    this.mergeAbilityControlBlock(other.getAbilityControlBlock());
                }
                if (other.getIsPlayerCurAvatar()) {
                    this.setIsPlayerCurAvatar(other.getIsPlayerCurAvatar());
                }
                if (this.serverBuffListBuilder_ == null) {
                    if (!other.serverBuffList_.isEmpty()) {
                        if (this.serverBuffList_.isEmpty()) {
                            this.serverBuffList_ = other.serverBuffList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureServerBuffListIsMutable();
                            this.serverBuffList_.addAll(other.serverBuffList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.serverBuffList_.isEmpty()) {
                    if (this.serverBuffListBuilder_.isEmpty()) {
                        this.serverBuffListBuilder_.dispose();
                        this.serverBuffListBuilder_ = null;
                        this.serverBuffList_ = other.serverBuffList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.serverBuffListBuilder_ = (SceneTeamAvatar.alwaysUseFieldBuilders ? this.getServerBuffListFieldBuilder() : null);
                    }
                    else {
                        this.serverBuffListBuilder_.addAllMessages(other.serverBuffList_);
                    }
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
                SceneTeamAvatar parsedMessage = null;
                try {
                    parsedMessage = SceneTeamAvatar.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SceneTeamAvatar)e.getUnfinishedMessage();
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
            public boolean hasAvatarAbilityInfo() {
                return this.avatarAbilityInfoBuilder_ != null || this.avatarAbilityInfo_ != null;
            }
            
            @Override
            public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getAvatarAbilityInfo() {
                if (this.avatarAbilityInfoBuilder_ == null) {
                    return (this.avatarAbilityInfo_ == null) ? AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : this.avatarAbilityInfo_;
                }
                return this.avatarAbilityInfoBuilder_.getMessage();
            }
            
            public Builder setAvatarAbilityInfo(final AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
                if (this.avatarAbilityInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.avatarAbilityInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.avatarAbilityInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setAvatarAbilityInfo(final AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder builderForValue) {
                if (this.avatarAbilityInfoBuilder_ == null) {
                    this.avatarAbilityInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.avatarAbilityInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeAvatarAbilityInfo(final AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
                if (this.avatarAbilityInfoBuilder_ == null) {
                    if (this.avatarAbilityInfo_ != null) {
                        this.avatarAbilityInfo_ = AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.newBuilder(this.avatarAbilityInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.avatarAbilityInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.avatarAbilityInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearAvatarAbilityInfo() {
                if (this.avatarAbilityInfoBuilder_ == null) {
                    this.avatarAbilityInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.avatarAbilityInfo_ = null;
                    this.avatarAbilityInfoBuilder_ = null;
                }
                return this;
            }
            
            public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder getAvatarAbilityInfoBuilder() {
                this.onChanged();
                return this.getAvatarAbilityInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getAvatarAbilityInfoOrBuilder() {
                if (this.avatarAbilityInfoBuilder_ != null) {
                    return this.avatarAbilityInfoBuilder_.getMessageOrBuilder();
                }
                return (this.avatarAbilityInfo_ == null) ? AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : this.avatarAbilityInfo_;
            }
            
            private SingleFieldBuilderV3<AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> getAvatarAbilityInfoFieldBuilder() {
                if (this.avatarAbilityInfoBuilder_ == null) {
                    this.avatarAbilityInfoBuilder_ = new SingleFieldBuilderV3<AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder>(this.getAvatarAbilityInfo(), this.getParentForChildren(), this.isClean());
                    this.avatarAbilityInfo_ = null;
                }
                return this.avatarAbilityInfoBuilder_;
            }
            
            @Override
            public boolean hasAvatarInfo() {
                return this.avatarInfoBuilder_ != null || this.avatarInfo_ != null;
            }
            
            @Override
            public AvatarInfoOuterClass.AvatarInfo getAvatarInfo() {
                if (this.avatarInfoBuilder_ == null) {
                    return (this.avatarInfo_ == null) ? AvatarInfoOuterClass.AvatarInfo.getDefaultInstance() : this.avatarInfo_;
                }
                return this.avatarInfoBuilder_.getMessage();
            }
            
            public Builder setAvatarInfo(final AvatarInfoOuterClass.AvatarInfo value) {
                if (this.avatarInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.avatarInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.avatarInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setAvatarInfo(final AvatarInfoOuterClass.AvatarInfo.Builder builderForValue) {
                if (this.avatarInfoBuilder_ == null) {
                    this.avatarInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.avatarInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeAvatarInfo(final AvatarInfoOuterClass.AvatarInfo value) {
                if (this.avatarInfoBuilder_ == null) {
                    if (this.avatarInfo_ != null) {
                        this.avatarInfo_ = AvatarInfoOuterClass.AvatarInfo.newBuilder(this.avatarInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.avatarInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.avatarInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearAvatarInfo() {
                if (this.avatarInfoBuilder_ == null) {
                    this.avatarInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.avatarInfo_ = null;
                    this.avatarInfoBuilder_ = null;
                }
                return this;
            }
            
            public AvatarInfoOuterClass.AvatarInfo.Builder getAvatarInfoBuilder() {
                this.onChanged();
                return this.getAvatarInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public AvatarInfoOuterClass.AvatarInfoOrBuilder getAvatarInfoOrBuilder() {
                if (this.avatarInfoBuilder_ != null) {
                    return this.avatarInfoBuilder_.getMessageOrBuilder();
                }
                return (this.avatarInfo_ == null) ? AvatarInfoOuterClass.AvatarInfo.getDefaultInstance() : this.avatarInfo_;
            }
            
            private SingleFieldBuilderV3<AvatarInfoOuterClass.AvatarInfo, AvatarInfoOuterClass.AvatarInfo.Builder, AvatarInfoOuterClass.AvatarInfoOrBuilder> getAvatarInfoFieldBuilder() {
                if (this.avatarInfoBuilder_ == null) {
                    this.avatarInfoBuilder_ = new SingleFieldBuilderV3<AvatarInfoOuterClass.AvatarInfo, AvatarInfoOuterClass.AvatarInfo.Builder, AvatarInfoOuterClass.AvatarInfoOrBuilder>(this.getAvatarInfo(), this.getParentForChildren(), this.isClean());
                    this.avatarInfo_ = null;
                }
                return this.avatarInfoBuilder_;
            }
            
            @Override
            public boolean getIsOnScene() {
                return this.isOnScene_;
            }
            
            public Builder setIsOnScene(final boolean value) {
                this.isOnScene_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsOnScene() {
                this.isOnScene_ = false;
                this.onChanged();
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
            public long getAvatarGuid() {
                return this.avatarGuid_;
            }
            
            public Builder setAvatarGuid(final long value) {
                this.avatarGuid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAvatarGuid() {
                this.avatarGuid_ = 0L;
                this.onChanged();
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
            public int getWeaponEntityId() {
                return this.weaponEntityId_;
            }
            
            public Builder setWeaponEntityId(final int value) {
                this.weaponEntityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearWeaponEntityId() {
                this.weaponEntityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasSceneAvatarInfo() {
                return this.sceneAvatarInfoBuilder_ != null || this.sceneAvatarInfo_ != null;
            }
            
            @Override
            public SceneAvatarInfoOuterClass.SceneAvatarInfo getSceneAvatarInfo() {
                if (this.sceneAvatarInfoBuilder_ == null) {
                    return (this.sceneAvatarInfo_ == null) ? SceneAvatarInfoOuterClass.SceneAvatarInfo.getDefaultInstance() : this.sceneAvatarInfo_;
                }
                return this.sceneAvatarInfoBuilder_.getMessage();
            }
            
            public Builder setSceneAvatarInfo(final SceneAvatarInfoOuterClass.SceneAvatarInfo value) {
                if (this.sceneAvatarInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.sceneAvatarInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.sceneAvatarInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setSceneAvatarInfo(final SceneAvatarInfoOuterClass.SceneAvatarInfo.Builder builderForValue) {
                if (this.sceneAvatarInfoBuilder_ == null) {
                    this.sceneAvatarInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.sceneAvatarInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeSceneAvatarInfo(final SceneAvatarInfoOuterClass.SceneAvatarInfo value) {
                if (this.sceneAvatarInfoBuilder_ == null) {
                    if (this.sceneAvatarInfo_ != null) {
                        this.sceneAvatarInfo_ = SceneAvatarInfoOuterClass.SceneAvatarInfo.newBuilder(this.sceneAvatarInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.sceneAvatarInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.sceneAvatarInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearSceneAvatarInfo() {
                if (this.sceneAvatarInfoBuilder_ == null) {
                    this.sceneAvatarInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.sceneAvatarInfo_ = null;
                    this.sceneAvatarInfoBuilder_ = null;
                }
                return this;
            }
            
            public SceneAvatarInfoOuterClass.SceneAvatarInfo.Builder getSceneAvatarInfoBuilder() {
                this.onChanged();
                return this.getSceneAvatarInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public SceneAvatarInfoOuterClass.SceneAvatarInfoOrBuilder getSceneAvatarInfoOrBuilder() {
                if (this.sceneAvatarInfoBuilder_ != null) {
                    return this.sceneAvatarInfoBuilder_.getMessageOrBuilder();
                }
                return (this.sceneAvatarInfo_ == null) ? SceneAvatarInfoOuterClass.SceneAvatarInfo.getDefaultInstance() : this.sceneAvatarInfo_;
            }
            
            private SingleFieldBuilderV3<SceneAvatarInfoOuterClass.SceneAvatarInfo, SceneAvatarInfoOuterClass.SceneAvatarInfo.Builder, SceneAvatarInfoOuterClass.SceneAvatarInfoOrBuilder> getSceneAvatarInfoFieldBuilder() {
                if (this.sceneAvatarInfoBuilder_ == null) {
                    this.sceneAvatarInfoBuilder_ = new SingleFieldBuilderV3<SceneAvatarInfoOuterClass.SceneAvatarInfo, SceneAvatarInfoOuterClass.SceneAvatarInfo.Builder, SceneAvatarInfoOuterClass.SceneAvatarInfoOrBuilder>(this.getSceneAvatarInfo(), this.getParentForChildren(), this.isClean());
                    this.sceneAvatarInfo_ = null;
                }
                return this.sceneAvatarInfoBuilder_;
            }
            
            @Override
            public long getWeaponGuid() {
                return this.weaponGuid_;
            }
            
            public Builder setWeaponGuid(final long value) {
                this.weaponGuid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearWeaponGuid() {
                this.weaponGuid_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasWeaponAbilityInfo() {
                return this.weaponAbilityInfoBuilder_ != null || this.weaponAbilityInfo_ != null;
            }
            
            @Override
            public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getWeaponAbilityInfo() {
                if (this.weaponAbilityInfoBuilder_ == null) {
                    return (this.weaponAbilityInfo_ == null) ? AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : this.weaponAbilityInfo_;
                }
                return this.weaponAbilityInfoBuilder_.getMessage();
            }
            
            public Builder setWeaponAbilityInfo(final AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
                if (this.weaponAbilityInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.weaponAbilityInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.weaponAbilityInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setWeaponAbilityInfo(final AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder builderForValue) {
                if (this.weaponAbilityInfoBuilder_ == null) {
                    this.weaponAbilityInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.weaponAbilityInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeWeaponAbilityInfo(final AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
                if (this.weaponAbilityInfoBuilder_ == null) {
                    if (this.weaponAbilityInfo_ != null) {
                        this.weaponAbilityInfo_ = AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.newBuilder(this.weaponAbilityInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.weaponAbilityInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.weaponAbilityInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearWeaponAbilityInfo() {
                if (this.weaponAbilityInfoBuilder_ == null) {
                    this.weaponAbilityInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.weaponAbilityInfo_ = null;
                    this.weaponAbilityInfoBuilder_ = null;
                }
                return this;
            }
            
            public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder getWeaponAbilityInfoBuilder() {
                this.onChanged();
                return this.getWeaponAbilityInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getWeaponAbilityInfoOrBuilder() {
                if (this.weaponAbilityInfoBuilder_ != null) {
                    return this.weaponAbilityInfoBuilder_.getMessageOrBuilder();
                }
                return (this.weaponAbilityInfo_ == null) ? AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : this.weaponAbilityInfo_;
            }
            
            private SingleFieldBuilderV3<AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> getWeaponAbilityInfoFieldBuilder() {
                if (this.weaponAbilityInfoBuilder_ == null) {
                    this.weaponAbilityInfoBuilder_ = new SingleFieldBuilderV3<AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder>(this.getWeaponAbilityInfo(), this.getParentForChildren(), this.isClean());
                    this.weaponAbilityInfo_ = null;
                }
                return this.weaponAbilityInfoBuilder_;
            }
            
            @Override
            public boolean hasSceneEntityInfo() {
                return this.sceneEntityInfoBuilder_ != null || this.sceneEntityInfo_ != null;
            }
            
            @Override
            public SceneEntityInfoOuterClass.SceneEntityInfo getSceneEntityInfo() {
                if (this.sceneEntityInfoBuilder_ == null) {
                    return (this.sceneEntityInfo_ == null) ? SceneEntityInfoOuterClass.SceneEntityInfo.getDefaultInstance() : this.sceneEntityInfo_;
                }
                return this.sceneEntityInfoBuilder_.getMessage();
            }
            
            public Builder setSceneEntityInfo(final SceneEntityInfoOuterClass.SceneEntityInfo value) {
                if (this.sceneEntityInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.sceneEntityInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.sceneEntityInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setSceneEntityInfo(final SceneEntityInfoOuterClass.SceneEntityInfo.Builder builderForValue) {
                if (this.sceneEntityInfoBuilder_ == null) {
                    this.sceneEntityInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.sceneEntityInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeSceneEntityInfo(final SceneEntityInfoOuterClass.SceneEntityInfo value) {
                if (this.sceneEntityInfoBuilder_ == null) {
                    if (this.sceneEntityInfo_ != null) {
                        this.sceneEntityInfo_ = SceneEntityInfoOuterClass.SceneEntityInfo.newBuilder(this.sceneEntityInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.sceneEntityInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.sceneEntityInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearSceneEntityInfo() {
                if (this.sceneEntityInfoBuilder_ == null) {
                    this.sceneEntityInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.sceneEntityInfo_ = null;
                    this.sceneEntityInfoBuilder_ = null;
                }
                return this;
            }
            
            public SceneEntityInfoOuterClass.SceneEntityInfo.Builder getSceneEntityInfoBuilder() {
                this.onChanged();
                return this.getSceneEntityInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder getSceneEntityInfoOrBuilder() {
                if (this.sceneEntityInfoBuilder_ != null) {
                    return this.sceneEntityInfoBuilder_.getMessageOrBuilder();
                }
                return (this.sceneEntityInfo_ == null) ? SceneEntityInfoOuterClass.SceneEntityInfo.getDefaultInstance() : this.sceneEntityInfo_;
            }
            
            private SingleFieldBuilderV3<SceneEntityInfoOuterClass.SceneEntityInfo, SceneEntityInfoOuterClass.SceneEntityInfo.Builder, SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder> getSceneEntityInfoFieldBuilder() {
                if (this.sceneEntityInfoBuilder_ == null) {
                    this.sceneEntityInfoBuilder_ = new SingleFieldBuilderV3<SceneEntityInfoOuterClass.SceneEntityInfo, SceneEntityInfoOuterClass.SceneEntityInfo.Builder, SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder>(this.getSceneEntityInfo(), this.getParentForChildren(), this.isClean());
                    this.sceneEntityInfo_ = null;
                }
                return this.sceneEntityInfoBuilder_;
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
            public boolean getIsReconnect() {
                return this.isReconnect_;
            }
            
            public Builder setIsReconnect(final boolean value) {
                this.isReconnect_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsReconnect() {
                this.isReconnect_ = false;
                this.onChanged();
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
            public boolean getIsPlayerCurAvatar() {
                return this.isPlayerCurAvatar_;
            }
            
            public Builder setIsPlayerCurAvatar(final boolean value) {
                this.isPlayerCurAvatar_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsPlayerCurAvatar() {
                this.isPlayerCurAvatar_ = false;
                this.onChanged();
                return this;
            }
            
            private void ensureServerBuffListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.serverBuffList_ = new ArrayList<ServerBuffOuterClass.ServerBuff>(this.serverBuffList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<ServerBuffOuterClass.ServerBuff> getServerBuffListList() {
                if (this.serverBuffListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ServerBuffOuterClass.ServerBuff>)this.serverBuffList_);
                }
                return this.serverBuffListBuilder_.getMessageList();
            }
            
            @Override
            public int getServerBuffListCount() {
                if (this.serverBuffListBuilder_ == null) {
                    return this.serverBuffList_.size();
                }
                return this.serverBuffListBuilder_.getCount();
            }
            
            @Override
            public ServerBuffOuterClass.ServerBuff getServerBuffList(final int index) {
                if (this.serverBuffListBuilder_ == null) {
                    return this.serverBuffList_.get(index);
                }
                return this.serverBuffListBuilder_.getMessage(index);
            }
            
            public Builder setServerBuffList(final int index, final ServerBuffOuterClass.ServerBuff value) {
                if (this.serverBuffListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureServerBuffListIsMutable();
                    this.serverBuffList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setServerBuffList(final int index, final ServerBuffOuterClass.ServerBuff.Builder builderForValue) {
                if (this.serverBuffListBuilder_ == null) {
                    this.ensureServerBuffListIsMutable();
                    this.serverBuffList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addServerBuffList(final ServerBuffOuterClass.ServerBuff value) {
                if (this.serverBuffListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureServerBuffListIsMutable();
                    this.serverBuffList_.add(value);
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addServerBuffList(final int index, final ServerBuffOuterClass.ServerBuff value) {
                if (this.serverBuffListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureServerBuffListIsMutable();
                    this.serverBuffList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addServerBuffList(final ServerBuffOuterClass.ServerBuff.Builder builderForValue) {
                if (this.serverBuffListBuilder_ == null) {
                    this.ensureServerBuffListIsMutable();
                    this.serverBuffList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addServerBuffList(final int index, final ServerBuffOuterClass.ServerBuff.Builder builderForValue) {
                if (this.serverBuffListBuilder_ == null) {
                    this.ensureServerBuffListIsMutable();
                    this.serverBuffList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllServerBuffList(final Iterable<? extends ServerBuffOuterClass.ServerBuff> values) {
                if (this.serverBuffListBuilder_ == null) {
                    this.ensureServerBuffListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.serverBuffList_);
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearServerBuffList() {
                if (this.serverBuffListBuilder_ == null) {
                    this.serverBuffList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeServerBuffList(final int index) {
                if (this.serverBuffListBuilder_ == null) {
                    this.ensureServerBuffListIsMutable();
                    this.serverBuffList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.remove(index);
                }
                return this;
            }
            
            public ServerBuffOuterClass.ServerBuff.Builder getServerBuffListBuilder(final int index) {
                return this.getServerBuffListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ServerBuffOuterClass.ServerBuffOrBuilder getServerBuffListOrBuilder(final int index) {
                if (this.serverBuffListBuilder_ == null) {
                    return this.serverBuffList_.get(index);
                }
                return this.serverBuffListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ServerBuffOuterClass.ServerBuffOrBuilder> getServerBuffListOrBuilderList() {
                if (this.serverBuffListBuilder_ != null) {
                    return this.serverBuffListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ServerBuffOuterClass.ServerBuffOrBuilder>)this.serverBuffList_);
            }
            
            public ServerBuffOuterClass.ServerBuff.Builder addServerBuffListBuilder() {
                return this.getServerBuffListFieldBuilder().addBuilder(ServerBuffOuterClass.ServerBuff.getDefaultInstance());
            }
            
            public ServerBuffOuterClass.ServerBuff.Builder addServerBuffListBuilder(final int index) {
                return this.getServerBuffListFieldBuilder().addBuilder(index, ServerBuffOuterClass.ServerBuff.getDefaultInstance());
            }
            
            public List<ServerBuffOuterClass.ServerBuff.Builder> getServerBuffListBuilderList() {
                return this.getServerBuffListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ServerBuffOuterClass.ServerBuff, ServerBuffOuterClass.ServerBuff.Builder, ServerBuffOuterClass.ServerBuffOrBuilder> getServerBuffListFieldBuilder() {
                if (this.serverBuffListBuilder_ == null) {
                    this.serverBuffListBuilder_ = new RepeatedFieldBuilderV3<ServerBuffOuterClass.ServerBuff, ServerBuffOuterClass.ServerBuff.Builder, ServerBuffOuterClass.ServerBuffOrBuilder>(this.serverBuffList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.serverBuffList_ = null;
                }
                return this.serverBuffListBuilder_;
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
    
    public interface SceneTeamAvatarOrBuilder extends MessageOrBuilder
    {
        boolean hasAvatarAbilityInfo();
        
        AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getAvatarAbilityInfo();
        
        AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getAvatarAbilityInfoOrBuilder();
        
        boolean hasAvatarInfo();
        
        AvatarInfoOuterClass.AvatarInfo getAvatarInfo();
        
        AvatarInfoOuterClass.AvatarInfoOrBuilder getAvatarInfoOrBuilder();
        
        boolean getIsOnScene();
        
        int getEntityId();
        
        long getAvatarGuid();
        
        int getSceneId();
        
        int getWeaponEntityId();
        
        boolean hasSceneAvatarInfo();
        
        SceneAvatarInfoOuterClass.SceneAvatarInfo getSceneAvatarInfo();
        
        SceneAvatarInfoOuterClass.SceneAvatarInfoOrBuilder getSceneAvatarInfoOrBuilder();
        
        long getWeaponGuid();
        
        boolean hasWeaponAbilityInfo();
        
        AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getWeaponAbilityInfo();
        
        AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getWeaponAbilityInfoOrBuilder();
        
        boolean hasSceneEntityInfo();
        
        SceneEntityInfoOuterClass.SceneEntityInfo getSceneEntityInfo();
        
        SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder getSceneEntityInfoOrBuilder();
        
        int getPlayerUid();
        
        boolean getIsReconnect();
        
        boolean hasAbilityControlBlock();
        
        AbilityControlBlockOuterClass.AbilityControlBlock getAbilityControlBlock();
        
        AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder getAbilityControlBlockOrBuilder();
        
        boolean getIsPlayerCurAvatar();
        
        List<ServerBuffOuterClass.ServerBuff> getServerBuffListList();
        
        ServerBuffOuterClass.ServerBuff getServerBuffList(final int p0);
        
        int getServerBuffListCount();
        
        List<? extends ServerBuffOuterClass.ServerBuffOrBuilder> getServerBuffListOrBuilderList();
        
        ServerBuffOuterClass.ServerBuffOrBuilder getServerBuffListOrBuilder(final int p0);
    }
}
