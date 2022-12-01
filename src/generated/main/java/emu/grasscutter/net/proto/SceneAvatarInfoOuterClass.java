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
import com.google.protobuf.WireFormat;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import java.util.Iterator;
import com.google.protobuf.CodedOutputStream;
import java.util.Map;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MapEntry;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import com.google.protobuf.MapField;
import java.util.List;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class SceneAvatarInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_SceneAvatarInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SceneAvatarInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SceneAvatarInfo_SkillLevelMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SceneAvatarInfo_SkillLevelMapEntry_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SceneAvatarInfo_ProudSkillExtraLevelMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SceneAvatarInfo_ProudSkillExtraLevelMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SceneAvatarInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SceneAvatarInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015SceneAvatarInfo.proto\u001a\u0015AvatarExcelInfo.proto\u001a\u0014CurVehicleInfo.proto\u001a\u0018SceneReliquaryInfo.proto\u001a\u0015SceneWeaponInfo.proto\u001a\u0010ServerBuff.proto\"\u009d\u0006\n\u000fSceneAvatarInfo\u0012\u000b\n\u0003uid\u0018\u0001 \u0001(\r\u0012\u0011\n\tavatar_id\u0018\u0002 \u0001(\r\u0012\f\n\u0004guid\u0018\u0003 \u0001(\u0004\u0012\u000f\n\u0007peer_id\u0018\u0004 \u0001(\r\u0012\u0015\n\requip_id_list\u0018\u0005 \u0003(\r\u0012\u0016\n\u000eskill_depot_id\u0018\u0006 \u0001(\r\u0012\u0016\n\u000etalent_id_list\u0018\u0007 \u0003(\r\u0012 \n\u0006weapon\u0018\b \u0001(\u000b2\u0010.SceneWeaponInfo\u0012+\n\u000ereliquary_list\u0018\t \u0003(\u000b2\u0013.SceneReliquaryInfo\u0012\u001e\n\u0016core_proud_skill_level\u0018\u000b \u0001(\r\u0012!\n\u0019inherent_proud_skill_list\u0018\f \u0003(\r\u0012<\n\u000fskill_level_map\u0018\r \u0003(\u000b2#.SceneAvatarInfo.SkillLevelMapEntry\u0012R\n\u001bproud_skill_extra_level_map\u0018\u000e \u0003(\u000b2-.SceneAvatarInfo.ProudSkillExtraLevelMapEntry\u0012%\n\u0010server_buff_list\u0018\u000f \u0003(\u000b2\u000b.ServerBuff\u0012\u001b\n\u0013team_resonance_list\u0018\u0010 \u0003(\r\u0012\u001b\n\u0013wearing_flycloak_id\u0018\u0011 \u0001(\r\u0012\u0011\n\tborn_time\u0018\u0012 \u0001(\r\u0012\u0012\n\ncostume_id\u0018\u0013 \u0001(\r\u0012)\n\u0010cur_vehicle_info\u0018\u0014 \u0001(\u000b2\u000f.CurVehicleInfo\u0012$\n\nexcel_info\u0018\u0015 \u0001(\u000b2\u0010.AvatarExcelInfo\u0012\u0011\n\tanim_hash\u0018\u0016 \u0001(\r\u001a4\n\u0012SkillLevelMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001\u001a>\n\u001cProudSkillExtraLevelMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SceneAvatarInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AvatarExcelInfoOuterClass.getDescriptor(), CurVehicleInfoOuterClass.getDescriptor(), SceneReliquaryInfoOuterClass.getDescriptor(), SceneWeaponInfoOuterClass.getDescriptor(), ServerBuffOuterClass.getDescriptor() });
        internal_static_SceneAvatarInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SceneAvatarInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SceneAvatarInfoOuterClass.internal_static_SceneAvatarInfo_descriptor, new String[] { "Uid", "AvatarId", "Guid", "PeerId", "EquipIdList", "SkillDepotId", "TalentIdList", "Weapon", "ReliquaryList", "CoreProudSkillLevel", "InherentProudSkillList", "SkillLevelMap", "ProudSkillExtraLevelMap", "ServerBuffList", "TeamResonanceList", "WearingFlycloakId", "BornTime", "CostumeId", "CurVehicleInfo", "ExcelInfo", "AnimHash" });
        internal_static_SceneAvatarInfo_SkillLevelMapEntry_descriptor = SceneAvatarInfoOuterClass.internal_static_SceneAvatarInfo_descriptor.getNestedTypes().get(0);
        internal_static_SceneAvatarInfo_SkillLevelMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SceneAvatarInfoOuterClass.internal_static_SceneAvatarInfo_SkillLevelMapEntry_descriptor, new String[] { "Key", "Value" });
        internal_static_SceneAvatarInfo_ProudSkillExtraLevelMapEntry_descriptor = SceneAvatarInfoOuterClass.internal_static_SceneAvatarInfo_descriptor.getNestedTypes().get(1);
        internal_static_SceneAvatarInfo_ProudSkillExtraLevelMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SceneAvatarInfoOuterClass.internal_static_SceneAvatarInfo_ProudSkillExtraLevelMapEntry_descriptor, new String[] { "Key", "Value" });
        AvatarExcelInfoOuterClass.getDescriptor();
        CurVehicleInfoOuterClass.getDescriptor();
        SceneReliquaryInfoOuterClass.getDescriptor();
        SceneWeaponInfoOuterClass.getDescriptor();
        ServerBuffOuterClass.getDescriptor();
    }
    
    public static final class SceneAvatarInfo extends GeneratedMessageV3 implements SceneAvatarInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int UID_FIELD_NUMBER = 1;
        private int uid_;
        public static final int AVATAR_ID_FIELD_NUMBER = 2;
        private int avatarId_;
        public static final int GUID_FIELD_NUMBER = 3;
        private long guid_;
        public static final int PEER_ID_FIELD_NUMBER = 4;
        private int peerId_;
        public static final int EQUIP_ID_LIST_FIELD_NUMBER = 5;
        private Internal.IntList equipIdList_;
        private int equipIdListMemoizedSerializedSize;
        public static final int SKILL_DEPOT_ID_FIELD_NUMBER = 6;
        private int skillDepotId_;
        public static final int TALENT_ID_LIST_FIELD_NUMBER = 7;
        private Internal.IntList talentIdList_;
        private int talentIdListMemoizedSerializedSize;
        public static final int WEAPON_FIELD_NUMBER = 8;
        private SceneWeaponInfoOuterClass.SceneWeaponInfo weapon_;
        public static final int RELIQUARY_LIST_FIELD_NUMBER = 9;
        private List<SceneReliquaryInfoOuterClass.SceneReliquaryInfo> reliquaryList_;
        public static final int CORE_PROUD_SKILL_LEVEL_FIELD_NUMBER = 11;
        private int coreProudSkillLevel_;
        public static final int INHERENT_PROUD_SKILL_LIST_FIELD_NUMBER = 12;
        private Internal.IntList inherentProudSkillList_;
        private int inherentProudSkillListMemoizedSerializedSize;
        public static final int SKILL_LEVEL_MAP_FIELD_NUMBER = 13;
        private MapField<Integer, Integer> skillLevelMap_;
        public static final int PROUD_SKILL_EXTRA_LEVEL_MAP_FIELD_NUMBER = 14;
        private MapField<Integer, Integer> proudSkillExtraLevelMap_;
        public static final int SERVER_BUFF_LIST_FIELD_NUMBER = 15;
        private List<ServerBuffOuterClass.ServerBuff> serverBuffList_;
        public static final int TEAM_RESONANCE_LIST_FIELD_NUMBER = 16;
        private Internal.IntList teamResonanceList_;
        private int teamResonanceListMemoizedSerializedSize;
        public static final int WEARING_FLYCLOAK_ID_FIELD_NUMBER = 17;
        private int wearingFlycloakId_;
        public static final int BORN_TIME_FIELD_NUMBER = 18;
        private int bornTime_;
        public static final int COSTUME_ID_FIELD_NUMBER = 19;
        private int costumeId_;
        public static final int CUR_VEHICLE_INFO_FIELD_NUMBER = 20;
        private CurVehicleInfoOuterClass.CurVehicleInfo curVehicleInfo_;
        public static final int EXCEL_INFO_FIELD_NUMBER = 21;
        private AvatarExcelInfoOuterClass.AvatarExcelInfo excelInfo_;
        public static final int ANIM_HASH_FIELD_NUMBER = 22;
        private int animHash_;
        private byte memoizedIsInitialized;
        private static final SceneAvatarInfo DEFAULT_INSTANCE;
        private static final Parser<SceneAvatarInfo> PARSER;
        
        private SceneAvatarInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.equipIdListMemoizedSerializedSize = -1;
            this.talentIdListMemoizedSerializedSize = -1;
            this.inherentProudSkillListMemoizedSerializedSize = -1;
            this.teamResonanceListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private SceneAvatarInfo() {
            this.equipIdListMemoizedSerializedSize = -1;
            this.talentIdListMemoizedSerializedSize = -1;
            this.inherentProudSkillListMemoizedSerializedSize = -1;
            this.teamResonanceListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.equipIdList_ = GeneratedMessageV3.emptyIntList();
            this.talentIdList_ = GeneratedMessageV3.emptyIntList();
            this.reliquaryList_ = Collections.emptyList();
            this.inherentProudSkillList_ = GeneratedMessageV3.emptyIntList();
            this.serverBuffList_ = Collections.emptyList();
            this.teamResonanceList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SceneAvatarInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SceneAvatarInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.uid_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.avatarId_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.guid_ = input.readUInt64();
                            continue;
                        }
                        case 32: {
                            this.peerId_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.equipIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.equipIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 42: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.equipIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.equipIdList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 48: {
                            this.skillDepotId_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.talentIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.talentIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 58: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.talentIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.talentIdList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 66: {
                            SceneWeaponInfoOuterClass.SceneWeaponInfo.Builder subBuilder = null;
                            if (this.weapon_ != null) {
                                subBuilder = this.weapon_.toBuilder();
                            }
                            this.weapon_ = input.readMessage(SceneWeaponInfoOuterClass.SceneWeaponInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.weapon_);
                                this.weapon_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 74: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.reliquaryList_ = new ArrayList<SceneReliquaryInfoOuterClass.SceneReliquaryInfo>();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.reliquaryList_.add(input.readMessage(SceneReliquaryInfoOuterClass.SceneReliquaryInfo.parser(), extensionRegistry));
                            continue;
                        }
                        case 88: {
                            this.coreProudSkillLevel_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
                            if ((mutable_bitField0_ & 0x8) == 0x0) {
                                this.inherentProudSkillList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x8;
                            }
                            this.inherentProudSkillList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 98: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x8) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.inherentProudSkillList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x8;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.inherentProudSkillList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 106: {
                            if ((mutable_bitField0_ & 0x10) == 0x0) {
                                this.skillLevelMap_ = MapField.newMapField(SkillLevelMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x10;
                            }
                            final MapEntry<Integer, Integer> skillLevelMap__ = input.readMessage(SkillLevelMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.skillLevelMap_.getMutableMap().put(skillLevelMap__.getKey(), skillLevelMap__.getValue());
                            continue;
                        }
                        case 114: {
                            if ((mutable_bitField0_ & 0x20) == 0x0) {
                                this.proudSkillExtraLevelMap_ = MapField.newMapField(ProudSkillExtraLevelMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x20;
                            }
                            final MapEntry<Integer, Integer> proudSkillExtraLevelMap__ = input.readMessage(ProudSkillExtraLevelMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.proudSkillExtraLevelMap_.getMutableMap().put(proudSkillExtraLevelMap__.getKey(), proudSkillExtraLevelMap__.getValue());
                            continue;
                        }
                        case 122: {
                            if ((mutable_bitField0_ & 0x40) == 0x0) {
                                this.serverBuffList_ = new ArrayList<ServerBuffOuterClass.ServerBuff>();
                                mutable_bitField0_ |= 0x40;
                            }
                            this.serverBuffList_.add(input.readMessage(ServerBuffOuterClass.ServerBuff.parser(), extensionRegistry));
                            continue;
                        }
                        case 128: {
                            if ((mutable_bitField0_ & 0x80) == 0x0) {
                                this.teamResonanceList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x80;
                            }
                            this.teamResonanceList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 130: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x80) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.teamResonanceList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x80;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.teamResonanceList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 136: {
                            this.wearingFlycloakId_ = input.readUInt32();
                            continue;
                        }
                        case 144: {
                            this.bornTime_ = input.readUInt32();
                            continue;
                        }
                        case 152: {
                            this.costumeId_ = input.readUInt32();
                            continue;
                        }
                        case 162: {
                            CurVehicleInfoOuterClass.CurVehicleInfo.Builder subBuilder2 = null;
                            if (this.curVehicleInfo_ != null) {
                                subBuilder2 = this.curVehicleInfo_.toBuilder();
                            }
                            this.curVehicleInfo_ = input.readMessage(CurVehicleInfoOuterClass.CurVehicleInfo.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom(this.curVehicleInfo_);
                                this.curVehicleInfo_ = subBuilder2.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 170: {
                            AvatarExcelInfoOuterClass.AvatarExcelInfo.Builder subBuilder3 = null;
                            if (this.excelInfo_ != null) {
                                subBuilder3 = this.excelInfo_.toBuilder();
                            }
                            this.excelInfo_ = input.readMessage(AvatarExcelInfoOuterClass.AvatarExcelInfo.parser(), extensionRegistry);
                            if (subBuilder3 != null) {
                                subBuilder3.mergeFrom(this.excelInfo_);
                                this.excelInfo_ = subBuilder3.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 176: {
                            this.animHash_ = input.readUInt32();
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
                    this.equipIdList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.talentIdList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x4) != 0x0) {
                    this.reliquaryList_ = Collections.unmodifiableList((List<? extends SceneReliquaryInfoOuterClass.SceneReliquaryInfo>)this.reliquaryList_);
                }
                if ((mutable_bitField0_ & 0x8) != 0x0) {
                    this.inherentProudSkillList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x40) != 0x0) {
                    this.serverBuffList_ = Collections.unmodifiableList((List<? extends ServerBuffOuterClass.ServerBuff>)this.serverBuffList_);
                }
                if ((mutable_bitField0_ & 0x80) != 0x0) {
                    this.teamResonanceList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return SceneAvatarInfoOuterClass.internal_static_SceneAvatarInfo_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 13: {
                    return this.internalGetSkillLevelMap();
                }
                case 14: {
                    return this.internalGetProudSkillExtraLevelMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SceneAvatarInfoOuterClass.internal_static_SceneAvatarInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneAvatarInfo.class, Builder.class);
        }
        
        @Override
        public int getUid() {
            return this.uid_;
        }
        
        @Override
        public int getAvatarId() {
            return this.avatarId_;
        }
        
        @Override
        public long getGuid() {
            return this.guid_;
        }
        
        @Override
        public int getPeerId() {
            return this.peerId_;
        }
        
        @Override
        public List<Integer> getEquipIdListList() {
            return this.equipIdList_;
        }
        
        @Override
        public int getEquipIdListCount() {
            return this.equipIdList_.size();
        }
        
        @Override
        public int getEquipIdList(final int index) {
            return this.equipIdList_.getInt(index);
        }
        
        @Override
        public int getSkillDepotId() {
            return this.skillDepotId_;
        }
        
        @Override
        public List<Integer> getTalentIdListList() {
            return this.talentIdList_;
        }
        
        @Override
        public int getTalentIdListCount() {
            return this.talentIdList_.size();
        }
        
        @Override
        public int getTalentIdList(final int index) {
            return this.talentIdList_.getInt(index);
        }
        
        @Override
        public boolean hasWeapon() {
            return this.weapon_ != null;
        }
        
        @Override
        public SceneWeaponInfoOuterClass.SceneWeaponInfo getWeapon() {
            return (this.weapon_ == null) ? SceneWeaponInfoOuterClass.SceneWeaponInfo.getDefaultInstance() : this.weapon_;
        }
        
        @Override
        public SceneWeaponInfoOuterClass.SceneWeaponInfoOrBuilder getWeaponOrBuilder() {
            return this.getWeapon();
        }
        
        @Override
        public List<SceneReliquaryInfoOuterClass.SceneReliquaryInfo> getReliquaryListList() {
            return this.reliquaryList_;
        }
        
        @Override
        public List<? extends SceneReliquaryInfoOuterClass.SceneReliquaryInfoOrBuilder> getReliquaryListOrBuilderList() {
            return this.reliquaryList_;
        }
        
        @Override
        public int getReliquaryListCount() {
            return this.reliquaryList_.size();
        }
        
        @Override
        public SceneReliquaryInfoOuterClass.SceneReliquaryInfo getReliquaryList(final int index) {
            return this.reliquaryList_.get(index);
        }
        
        @Override
        public SceneReliquaryInfoOuterClass.SceneReliquaryInfoOrBuilder getReliquaryListOrBuilder(final int index) {
            return this.reliquaryList_.get(index);
        }
        
        @Override
        public int getCoreProudSkillLevel() {
            return this.coreProudSkillLevel_;
        }
        
        @Override
        public List<Integer> getInherentProudSkillListList() {
            return this.inherentProudSkillList_;
        }
        
        @Override
        public int getInherentProudSkillListCount() {
            return this.inherentProudSkillList_.size();
        }
        
        @Override
        public int getInherentProudSkillList(final int index) {
            return this.inherentProudSkillList_.getInt(index);
        }
        
        private MapField<Integer, Integer> internalGetSkillLevelMap() {
            if (this.skillLevelMap_ == null) {
                return MapField.emptyMapField(SkillLevelMapDefaultEntryHolder.defaultEntry);
            }
            return this.skillLevelMap_;
        }
        
        @Override
        public int getSkillLevelMapCount() {
            return this.internalGetSkillLevelMap().getMap().size();
        }
        
        @Override
        public boolean containsSkillLevelMap(final int key) {
            return this.internalGetSkillLevelMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, Integer> getSkillLevelMap() {
            return this.getSkillLevelMapMap();
        }
        
        @Override
        public Map<Integer, Integer> getSkillLevelMapMap() {
            return this.internalGetSkillLevelMap().getMap();
        }
        
        @Override
        public int getSkillLevelMapOrDefault(final int key, final int defaultValue) {
            final Map<Integer, Integer> map = this.internalGetSkillLevelMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public int getSkillLevelMapOrThrow(final int key) {
            final Map<Integer, Integer> map = this.internalGetSkillLevelMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        private MapField<Integer, Integer> internalGetProudSkillExtraLevelMap() {
            if (this.proudSkillExtraLevelMap_ == null) {
                return MapField.emptyMapField(ProudSkillExtraLevelMapDefaultEntryHolder.defaultEntry);
            }
            return this.proudSkillExtraLevelMap_;
        }
        
        @Override
        public int getProudSkillExtraLevelMapCount() {
            return this.internalGetProudSkillExtraLevelMap().getMap().size();
        }
        
        @Override
        public boolean containsProudSkillExtraLevelMap(final int key) {
            return this.internalGetProudSkillExtraLevelMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, Integer> getProudSkillExtraLevelMap() {
            return this.getProudSkillExtraLevelMapMap();
        }
        
        @Override
        public Map<Integer, Integer> getProudSkillExtraLevelMapMap() {
            return this.internalGetProudSkillExtraLevelMap().getMap();
        }
        
        @Override
        public int getProudSkillExtraLevelMapOrDefault(final int key, final int defaultValue) {
            final Map<Integer, Integer> map = this.internalGetProudSkillExtraLevelMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public int getProudSkillExtraLevelMapOrThrow(final int key) {
            final Map<Integer, Integer> map = this.internalGetProudSkillExtraLevelMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
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
        public List<Integer> getTeamResonanceListList() {
            return this.teamResonanceList_;
        }
        
        @Override
        public int getTeamResonanceListCount() {
            return this.teamResonanceList_.size();
        }
        
        @Override
        public int getTeamResonanceList(final int index) {
            return this.teamResonanceList_.getInt(index);
        }
        
        @Override
        public int getWearingFlycloakId() {
            return this.wearingFlycloakId_;
        }
        
        @Override
        public int getBornTime() {
            return this.bornTime_;
        }
        
        @Override
        public int getCostumeId() {
            return this.costumeId_;
        }
        
        @Override
        public boolean hasCurVehicleInfo() {
            return this.curVehicleInfo_ != null;
        }
        
        @Override
        public CurVehicleInfoOuterClass.CurVehicleInfo getCurVehicleInfo() {
            return (this.curVehicleInfo_ == null) ? CurVehicleInfoOuterClass.CurVehicleInfo.getDefaultInstance() : this.curVehicleInfo_;
        }
        
        @Override
        public CurVehicleInfoOuterClass.CurVehicleInfoOrBuilder getCurVehicleInfoOrBuilder() {
            return this.getCurVehicleInfo();
        }
        
        @Override
        public boolean hasExcelInfo() {
            return this.excelInfo_ != null;
        }
        
        @Override
        public AvatarExcelInfoOuterClass.AvatarExcelInfo getExcelInfo() {
            return (this.excelInfo_ == null) ? AvatarExcelInfoOuterClass.AvatarExcelInfo.getDefaultInstance() : this.excelInfo_;
        }
        
        @Override
        public AvatarExcelInfoOuterClass.AvatarExcelInfoOrBuilder getExcelInfoOrBuilder() {
            return this.getExcelInfo();
        }
        
        @Override
        public int getAnimHash() {
            return this.animHash_;
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
            this.getSerializedSize();
            if (this.uid_ != 0) {
                output.writeUInt32(1, this.uid_);
            }
            if (this.avatarId_ != 0) {
                output.writeUInt32(2, this.avatarId_);
            }
            if (this.guid_ != 0L) {
                output.writeUInt64(3, this.guid_);
            }
            if (this.peerId_ != 0) {
                output.writeUInt32(4, this.peerId_);
            }
            if (this.getEquipIdListList().size() > 0) {
                output.writeUInt32NoTag(42);
                output.writeUInt32NoTag(this.equipIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.equipIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.equipIdList_.getInt(i));
            }
            if (this.skillDepotId_ != 0) {
                output.writeUInt32(6, this.skillDepotId_);
            }
            if (this.getTalentIdListList().size() > 0) {
                output.writeUInt32NoTag(58);
                output.writeUInt32NoTag(this.talentIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.talentIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.talentIdList_.getInt(i));
            }
            if (this.weapon_ != null) {
                output.writeMessage(8, this.getWeapon());
            }
            for (int i = 0; i < this.reliquaryList_.size(); ++i) {
                output.writeMessage(9, this.reliquaryList_.get(i));
            }
            if (this.coreProudSkillLevel_ != 0) {
                output.writeUInt32(11, this.coreProudSkillLevel_);
            }
            if (this.getInherentProudSkillListList().size() > 0) {
                output.writeUInt32NoTag(98);
                output.writeUInt32NoTag(this.inherentProudSkillListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.inherentProudSkillList_.size(); ++i) {
                output.writeUInt32NoTag(this.inherentProudSkillList_.getInt(i));
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetSkillLevelMap(), SkillLevelMapDefaultEntryHolder.defaultEntry, 13);
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetProudSkillExtraLevelMap(), ProudSkillExtraLevelMapDefaultEntryHolder.defaultEntry, 14);
            for (int i = 0; i < this.serverBuffList_.size(); ++i) {
                output.writeMessage(15, this.serverBuffList_.get(i));
            }
            if (this.getTeamResonanceListList().size() > 0) {
                output.writeUInt32NoTag(130);
                output.writeUInt32NoTag(this.teamResonanceListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.teamResonanceList_.size(); ++i) {
                output.writeUInt32NoTag(this.teamResonanceList_.getInt(i));
            }
            if (this.wearingFlycloakId_ != 0) {
                output.writeUInt32(17, this.wearingFlycloakId_);
            }
            if (this.bornTime_ != 0) {
                output.writeUInt32(18, this.bornTime_);
            }
            if (this.costumeId_ != 0) {
                output.writeUInt32(19, this.costumeId_);
            }
            if (this.curVehicleInfo_ != null) {
                output.writeMessage(20, this.getCurVehicleInfo());
            }
            if (this.excelInfo_ != null) {
                output.writeMessage(21, this.getExcelInfo());
            }
            if (this.animHash_ != 0) {
                output.writeUInt32(22, this.animHash_);
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
            if (this.uid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.uid_);
            }
            if (this.avatarId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.avatarId_);
            }
            if (this.guid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(3, this.guid_);
            }
            if (this.peerId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.peerId_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.equipIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.equipIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getEquipIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.equipIdListMemoizedSerializedSize = dataSize;
            if (this.skillDepotId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.skillDepotId_);
            }
            dataSize = 0;
            for (int i = 0; i < this.talentIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.talentIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getTalentIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.talentIdListMemoizedSerializedSize = dataSize;
            if (this.weapon_ != null) {
                size += CodedOutputStream.computeMessageSize(8, this.getWeapon());
            }
            for (int j = 0; j < this.reliquaryList_.size(); ++j) {
                size += CodedOutputStream.computeMessageSize(9, this.reliquaryList_.get(j));
            }
            if (this.coreProudSkillLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.coreProudSkillLevel_);
            }
            dataSize = 0;
            for (int i = 0; i < this.inherentProudSkillList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.inherentProudSkillList_.getInt(i));
            }
            size += dataSize;
            if (!this.getInherentProudSkillListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.inherentProudSkillListMemoizedSerializedSize = dataSize;
            for (final Map.Entry<Integer, Integer> entry : this.internalGetSkillLevelMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> skillLevelMap__ = SkillLevelMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(13, skillLevelMap__);
            }
            for (final Map.Entry<Integer, Integer> entry : this.internalGetProudSkillExtraLevelMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> proudSkillExtraLevelMap__ = ProudSkillExtraLevelMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(14, proudSkillExtraLevelMap__);
            }
            for (int j = 0; j < this.serverBuffList_.size(); ++j) {
                size += CodedOutputStream.computeMessageSize(15, this.serverBuffList_.get(j));
            }
            dataSize = 0;
            for (int i = 0; i < this.teamResonanceList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.teamResonanceList_.getInt(i));
            }
            size += dataSize;
            if (!this.getTeamResonanceListList().isEmpty()) {
                size += 2;
                size += CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.teamResonanceListMemoizedSerializedSize = dataSize;
            if (this.wearingFlycloakId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(17, this.wearingFlycloakId_);
            }
            if (this.bornTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(18, this.bornTime_);
            }
            if (this.costumeId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(19, this.costumeId_);
            }
            if (this.curVehicleInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(20, this.getCurVehicleInfo());
            }
            if (this.excelInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(21, this.getExcelInfo());
            }
            if (this.animHash_ != 0) {
                size += CodedOutputStream.computeUInt32Size(22, this.animHash_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SceneAvatarInfo)) {
                return super.equals(obj);
            }
            final SceneAvatarInfo other = (SceneAvatarInfo)obj;
            return this.getUid() == other.getUid() && this.getAvatarId() == other.getAvatarId() && this.getGuid() == other.getGuid() && this.getPeerId() == other.getPeerId() && this.getEquipIdListList().equals(other.getEquipIdListList()) && this.getSkillDepotId() == other.getSkillDepotId() && this.getTalentIdListList().equals(other.getTalentIdListList()) && this.hasWeapon() == other.hasWeapon() && (!this.hasWeapon() || this.getWeapon().equals(other.getWeapon())) && this.getReliquaryListList().equals(other.getReliquaryListList()) && this.getCoreProudSkillLevel() == other.getCoreProudSkillLevel() && this.getInherentProudSkillListList().equals(other.getInherentProudSkillListList()) && this.internalGetSkillLevelMap().equals(other.internalGetSkillLevelMap()) && this.internalGetProudSkillExtraLevelMap().equals(other.internalGetProudSkillExtraLevelMap()) && this.getServerBuffListList().equals(other.getServerBuffListList()) && this.getTeamResonanceListList().equals(other.getTeamResonanceListList()) && this.getWearingFlycloakId() == other.getWearingFlycloakId() && this.getBornTime() == other.getBornTime() && this.getCostumeId() == other.getCostumeId() && this.hasCurVehicleInfo() == other.hasCurVehicleInfo() && (!this.hasCurVehicleInfo() || this.getCurVehicleInfo().equals(other.getCurVehicleInfo())) && this.hasExcelInfo() == other.hasExcelInfo() && (!this.hasExcelInfo() || this.getExcelInfo().equals(other.getExcelInfo())) && this.getAnimHash() == other.getAnimHash() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getUid();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getAvatarId();
            hash = 37 * hash + 3;
            hash = 53 * hash + Internal.hashLong(this.getGuid());
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getPeerId();
            if (this.getEquipIdListCount() > 0) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getEquipIdListList().hashCode();
            }
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getSkillDepotId();
            if (this.getTalentIdListCount() > 0) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.getTalentIdListList().hashCode();
            }
            if (this.hasWeapon()) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getWeapon().hashCode();
            }
            if (this.getReliquaryListCount() > 0) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getReliquaryListList().hashCode();
            }
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getCoreProudSkillLevel();
            if (this.getInherentProudSkillListCount() > 0) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getInherentProudSkillListList().hashCode();
            }
            if (!this.internalGetSkillLevelMap().getMap().isEmpty()) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.internalGetSkillLevelMap().hashCode();
            }
            if (!this.internalGetProudSkillExtraLevelMap().getMap().isEmpty()) {
                hash = 37 * hash + 14;
                hash = 53 * hash + this.internalGetProudSkillExtraLevelMap().hashCode();
            }
            if (this.getServerBuffListCount() > 0) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getServerBuffListList().hashCode();
            }
            if (this.getTeamResonanceListCount() > 0) {
                hash = 37 * hash + 16;
                hash = 53 * hash + this.getTeamResonanceListList().hashCode();
            }
            hash = 37 * hash + 17;
            hash = 53 * hash + this.getWearingFlycloakId();
            hash = 37 * hash + 18;
            hash = 53 * hash + this.getBornTime();
            hash = 37 * hash + 19;
            hash = 53 * hash + this.getCostumeId();
            if (this.hasCurVehicleInfo()) {
                hash = 37 * hash + 20;
                hash = 53 * hash + this.getCurVehicleInfo().hashCode();
            }
            if (this.hasExcelInfo()) {
                hash = 37 * hash + 21;
                hash = 53 * hash + this.getExcelInfo().hashCode();
            }
            hash = 37 * hash + 22;
            hash = 53 * hash + this.getAnimHash();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SceneAvatarInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SceneAvatarInfo.PARSER.parseFrom(data);
        }
        
        public static SceneAvatarInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneAvatarInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneAvatarInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SceneAvatarInfo.PARSER.parseFrom(data);
        }
        
        public static SceneAvatarInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneAvatarInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneAvatarInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SceneAvatarInfo.PARSER.parseFrom(data);
        }
        
        public static SceneAvatarInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneAvatarInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneAvatarInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneAvatarInfo.PARSER, input);
        }
        
        public static SceneAvatarInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneAvatarInfo.PARSER, input, extensionRegistry);
        }
        
        public static SceneAvatarInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneAvatarInfo.PARSER, input);
        }
        
        public static SceneAvatarInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneAvatarInfo.PARSER, input, extensionRegistry);
        }
        
        public static SceneAvatarInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneAvatarInfo.PARSER, input);
        }
        
        public static SceneAvatarInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneAvatarInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SceneAvatarInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SceneAvatarInfo prototype) {
            return SceneAvatarInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SceneAvatarInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SceneAvatarInfo getDefaultInstance() {
            return SceneAvatarInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<SceneAvatarInfo> parser() {
            return SceneAvatarInfo.PARSER;
        }
        
        @Override
        public Parser<SceneAvatarInfo> getParserForType() {
            return SceneAvatarInfo.PARSER;
        }
        
        @Override
        public SceneAvatarInfo getDefaultInstanceForType() {
            return SceneAvatarInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SceneAvatarInfo();
            PARSER = new AbstractParser<SceneAvatarInfo>() {
                @Override
                public SceneAvatarInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SceneAvatarInfo(input, extensionRegistry);
                }
            };
        }
        
        private static final class SkillLevelMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(SceneAvatarInfoOuterClass.internal_static_SceneAvatarInfo_SkillLevelMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        private static final class ProudSkillExtraLevelMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(SceneAvatarInfoOuterClass.internal_static_SceneAvatarInfo_ProudSkillExtraLevelMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SceneAvatarInfoOrBuilder
        {
            private int bitField0_;
            private int uid_;
            private int avatarId_;
            private long guid_;
            private int peerId_;
            private Internal.IntList equipIdList_;
            private int skillDepotId_;
            private Internal.IntList talentIdList_;
            private SceneWeaponInfoOuterClass.SceneWeaponInfo weapon_;
            private SingleFieldBuilderV3<SceneWeaponInfoOuterClass.SceneWeaponInfo, SceneWeaponInfoOuterClass.SceneWeaponInfo.Builder, SceneWeaponInfoOuterClass.SceneWeaponInfoOrBuilder> weaponBuilder_;
            private List<SceneReliquaryInfoOuterClass.SceneReliquaryInfo> reliquaryList_;
            private RepeatedFieldBuilderV3<SceneReliquaryInfoOuterClass.SceneReliquaryInfo, SceneReliquaryInfoOuterClass.SceneReliquaryInfo.Builder, SceneReliquaryInfoOuterClass.SceneReliquaryInfoOrBuilder> reliquaryListBuilder_;
            private int coreProudSkillLevel_;
            private Internal.IntList inherentProudSkillList_;
            private MapField<Integer, Integer> skillLevelMap_;
            private MapField<Integer, Integer> proudSkillExtraLevelMap_;
            private List<ServerBuffOuterClass.ServerBuff> serverBuffList_;
            private RepeatedFieldBuilderV3<ServerBuffOuterClass.ServerBuff, ServerBuffOuterClass.ServerBuff.Builder, ServerBuffOuterClass.ServerBuffOrBuilder> serverBuffListBuilder_;
            private Internal.IntList teamResonanceList_;
            private int wearingFlycloakId_;
            private int bornTime_;
            private int costumeId_;
            private CurVehicleInfoOuterClass.CurVehicleInfo curVehicleInfo_;
            private SingleFieldBuilderV3<CurVehicleInfoOuterClass.CurVehicleInfo, CurVehicleInfoOuterClass.CurVehicleInfo.Builder, CurVehicleInfoOuterClass.CurVehicleInfoOrBuilder> curVehicleInfoBuilder_;
            private AvatarExcelInfoOuterClass.AvatarExcelInfo excelInfo_;
            private SingleFieldBuilderV3<AvatarExcelInfoOuterClass.AvatarExcelInfo, AvatarExcelInfoOuterClass.AvatarExcelInfo.Builder, AvatarExcelInfoOuterClass.AvatarExcelInfoOrBuilder> excelInfoBuilder_;
            private int animHash_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SceneAvatarInfoOuterClass.internal_static_SceneAvatarInfo_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 13: {
                        return this.internalGetSkillLevelMap();
                    }
                    case 14: {
                        return this.internalGetProudSkillExtraLevelMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected MapField internalGetMutableMapField(final int number) {
                switch (number) {
                    case 13: {
                        return this.internalGetMutableSkillLevelMap();
                    }
                    case 14: {
                        return this.internalGetMutableProudSkillExtraLevelMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SceneAvatarInfoOuterClass.internal_static_SceneAvatarInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneAvatarInfo.class, Builder.class);
            }
            
            private Builder() {
                this.equipIdList_ = GeneratedMessageV3.emptyIntList();
                this.talentIdList_ = GeneratedMessageV3.emptyIntList();
                this.reliquaryList_ = Collections.emptyList();
                this.inherentProudSkillList_ = GeneratedMessageV3.emptyIntList();
                this.serverBuffList_ = Collections.emptyList();
                this.teamResonanceList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.equipIdList_ = GeneratedMessageV3.emptyIntList();
                this.talentIdList_ = GeneratedMessageV3.emptyIntList();
                this.reliquaryList_ = Collections.emptyList();
                this.inherentProudSkillList_ = GeneratedMessageV3.emptyIntList();
                this.serverBuffList_ = Collections.emptyList();
                this.teamResonanceList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SceneAvatarInfo.alwaysUseFieldBuilders) {
                    this.getReliquaryListFieldBuilder();
                    this.getServerBuffListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.uid_ = 0;
                this.avatarId_ = 0;
                this.guid_ = 0L;
                this.peerId_ = 0;
                this.equipIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.skillDepotId_ = 0;
                this.talentIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                if (this.weaponBuilder_ == null) {
                    this.weapon_ = null;
                }
                else {
                    this.weapon_ = null;
                    this.weaponBuilder_ = null;
                }
                if (this.reliquaryListBuilder_ == null) {
                    this.reliquaryList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                else {
                    this.reliquaryListBuilder_.clear();
                }
                this.coreProudSkillLevel_ = 0;
                this.inherentProudSkillList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFF7;
                this.internalGetMutableSkillLevelMap().clear();
                this.internalGetMutableProudSkillExtraLevelMap().clear();
                if (this.serverBuffListBuilder_ == null) {
                    this.serverBuffList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFBF;
                }
                else {
                    this.serverBuffListBuilder_.clear();
                }
                this.teamResonanceList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFF7F;
                this.wearingFlycloakId_ = 0;
                this.bornTime_ = 0;
                this.costumeId_ = 0;
                if (this.curVehicleInfoBuilder_ == null) {
                    this.curVehicleInfo_ = null;
                }
                else {
                    this.curVehicleInfo_ = null;
                    this.curVehicleInfoBuilder_ = null;
                }
                if (this.excelInfoBuilder_ == null) {
                    this.excelInfo_ = null;
                }
                else {
                    this.excelInfo_ = null;
                    this.excelInfoBuilder_ = null;
                }
                this.animHash_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SceneAvatarInfoOuterClass.internal_static_SceneAvatarInfo_descriptor;
            }
            
            @Override
            public SceneAvatarInfo getDefaultInstanceForType() {
                return SceneAvatarInfo.getDefaultInstance();
            }
            
            @Override
            public SceneAvatarInfo build() {
                final SceneAvatarInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SceneAvatarInfo buildPartial() {
                final SceneAvatarInfo result = new SceneAvatarInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.uid_ = this.uid_;
                result.avatarId_ = this.avatarId_;
                result.guid_ = this.guid_;
                result.peerId_ = this.peerId_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.equipIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.equipIdList_ = this.equipIdList_;
                result.skillDepotId_ = this.skillDepotId_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.talentIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.talentIdList_ = this.talentIdList_;
                if (this.weaponBuilder_ == null) {
                    result.weapon_ = this.weapon_;
                }
                else {
                    result.weapon_ = this.weaponBuilder_.build();
                }
                if (this.reliquaryListBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) != 0x0) {
                        this.reliquaryList_ = Collections.unmodifiableList((List<? extends SceneReliquaryInfoOuterClass.SceneReliquaryInfo>)this.reliquaryList_);
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    result.reliquaryList_ = this.reliquaryList_;
                }
                else {
                    result.reliquaryList_ = this.reliquaryListBuilder_.build();
                }
                result.coreProudSkillLevel_ = this.coreProudSkillLevel_;
                if ((this.bitField0_ & 0x8) != 0x0) {
                    this.inherentProudSkillList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFF7;
                }
                result.inherentProudSkillList_ = this.inherentProudSkillList_;
                (result.skillLevelMap_ = this.internalGetSkillLevelMap()).makeImmutable();
                (result.proudSkillExtraLevelMap_ = this.internalGetProudSkillExtraLevelMap()).makeImmutable();
                if (this.serverBuffListBuilder_ == null) {
                    if ((this.bitField0_ & 0x40) != 0x0) {
                        this.serverBuffList_ = Collections.unmodifiableList((List<? extends ServerBuffOuterClass.ServerBuff>)this.serverBuffList_);
                        this.bitField0_ &= 0xFFFFFFBF;
                    }
                    result.serverBuffList_ = this.serverBuffList_;
                }
                else {
                    result.serverBuffList_ = this.serverBuffListBuilder_.build();
                }
                if ((this.bitField0_ & 0x80) != 0x0) {
                    this.teamResonanceList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFF7F;
                }
                result.teamResonanceList_ = this.teamResonanceList_;
                result.wearingFlycloakId_ = this.wearingFlycloakId_;
                result.bornTime_ = this.bornTime_;
                result.costumeId_ = this.costumeId_;
                if (this.curVehicleInfoBuilder_ == null) {
                    result.curVehicleInfo_ = this.curVehicleInfo_;
                }
                else {
                    result.curVehicleInfo_ = this.curVehicleInfoBuilder_.build();
                }
                if (this.excelInfoBuilder_ == null) {
                    result.excelInfo_ = this.excelInfo_;
                }
                else {
                    result.excelInfo_ = this.excelInfoBuilder_.build();
                }
                result.animHash_ = this.animHash_;
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
                if (other instanceof SceneAvatarInfo) {
                    return this.mergeFrom((SceneAvatarInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SceneAvatarInfo other) {
                if (other == SceneAvatarInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getUid() != 0) {
                    this.setUid(other.getUid());
                }
                if (other.getAvatarId() != 0) {
                    this.setAvatarId(other.getAvatarId());
                }
                if (other.getGuid() != 0L) {
                    this.setGuid(other.getGuid());
                }
                if (other.getPeerId() != 0) {
                    this.setPeerId(other.getPeerId());
                }
                if (!other.equipIdList_.isEmpty()) {
                    if (this.equipIdList_.isEmpty()) {
                        this.equipIdList_ = other.equipIdList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureEquipIdListIsMutable();
                        this.equipIdList_.addAll(other.equipIdList_);
                    }
                    this.onChanged();
                }
                if (other.getSkillDepotId() != 0) {
                    this.setSkillDepotId(other.getSkillDepotId());
                }
                if (!other.talentIdList_.isEmpty()) {
                    if (this.talentIdList_.isEmpty()) {
                        this.talentIdList_ = other.talentIdList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureTalentIdListIsMutable();
                        this.talentIdList_.addAll(other.talentIdList_);
                    }
                    this.onChanged();
                }
                if (other.hasWeapon()) {
                    this.mergeWeapon(other.getWeapon());
                }
                if (this.reliquaryListBuilder_ == null) {
                    if (!other.reliquaryList_.isEmpty()) {
                        if (this.reliquaryList_.isEmpty()) {
                            this.reliquaryList_ = other.reliquaryList_;
                            this.bitField0_ &= 0xFFFFFFFB;
                        }
                        else {
                            this.ensureReliquaryListIsMutable();
                            this.reliquaryList_.addAll(other.reliquaryList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.reliquaryList_.isEmpty()) {
                    if (this.reliquaryListBuilder_.isEmpty()) {
                        this.reliquaryListBuilder_.dispose();
                        this.reliquaryListBuilder_ = null;
                        this.reliquaryList_ = other.reliquaryList_;
                        this.bitField0_ &= 0xFFFFFFFB;
                        this.reliquaryListBuilder_ = (SceneAvatarInfo.alwaysUseFieldBuilders ? this.getReliquaryListFieldBuilder() : null);
                    }
                    else {
                        this.reliquaryListBuilder_.addAllMessages(other.reliquaryList_);
                    }
                }
                if (other.getCoreProudSkillLevel() != 0) {
                    this.setCoreProudSkillLevel(other.getCoreProudSkillLevel());
                }
                if (!other.inherentProudSkillList_.isEmpty()) {
                    if (this.inherentProudSkillList_.isEmpty()) {
                        this.inherentProudSkillList_ = other.inherentProudSkillList_;
                        this.bitField0_ &= 0xFFFFFFF7;
                    }
                    else {
                        this.ensureInherentProudSkillListIsMutable();
                        this.inherentProudSkillList_.addAll(other.inherentProudSkillList_);
                    }
                    this.onChanged();
                }
                this.internalGetMutableSkillLevelMap().mergeFrom(other.internalGetSkillLevelMap());
                this.internalGetMutableProudSkillExtraLevelMap().mergeFrom(other.internalGetProudSkillExtraLevelMap());
                if (this.serverBuffListBuilder_ == null) {
                    if (!other.serverBuffList_.isEmpty()) {
                        if (this.serverBuffList_.isEmpty()) {
                            this.serverBuffList_ = other.serverBuffList_;
                            this.bitField0_ &= 0xFFFFFFBF;
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
                        this.bitField0_ &= 0xFFFFFFBF;
                        this.serverBuffListBuilder_ = (SceneAvatarInfo.alwaysUseFieldBuilders ? this.getServerBuffListFieldBuilder() : null);
                    }
                    else {
                        this.serverBuffListBuilder_.addAllMessages(other.serverBuffList_);
                    }
                }
                if (!other.teamResonanceList_.isEmpty()) {
                    if (this.teamResonanceList_.isEmpty()) {
                        this.teamResonanceList_ = other.teamResonanceList_;
                        this.bitField0_ &= 0xFFFFFF7F;
                    }
                    else {
                        this.ensureTeamResonanceListIsMutable();
                        this.teamResonanceList_.addAll(other.teamResonanceList_);
                    }
                    this.onChanged();
                }
                if (other.getWearingFlycloakId() != 0) {
                    this.setWearingFlycloakId(other.getWearingFlycloakId());
                }
                if (other.getBornTime() != 0) {
                    this.setBornTime(other.getBornTime());
                }
                if (other.getCostumeId() != 0) {
                    this.setCostumeId(other.getCostumeId());
                }
                if (other.hasCurVehicleInfo()) {
                    this.mergeCurVehicleInfo(other.getCurVehicleInfo());
                }
                if (other.hasExcelInfo()) {
                    this.mergeExcelInfo(other.getExcelInfo());
                }
                if (other.getAnimHash() != 0) {
                    this.setAnimHash(other.getAnimHash());
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
                SceneAvatarInfo parsedMessage = null;
                try {
                    parsedMessage = SceneAvatarInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SceneAvatarInfo)e.getUnfinishedMessage();
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
            public int getAvatarId() {
                return this.avatarId_;
            }
            
            public Builder setAvatarId(final int value) {
                this.avatarId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAvatarId() {
                this.avatarId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public long getGuid() {
                return this.guid_;
            }
            
            public Builder setGuid(final long value) {
                this.guid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGuid() {
                this.guid_ = 0L;
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
            
            private void ensureEquipIdListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.equipIdList_ = GeneratedMessageV3.mutableCopy(this.equipIdList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getEquipIdListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.equipIdList_) : this.equipIdList_;
            }
            
            @Override
            public int getEquipIdListCount() {
                return this.equipIdList_.size();
            }
            
            @Override
            public int getEquipIdList(final int index) {
                return this.equipIdList_.getInt(index);
            }
            
            public Builder setEquipIdList(final int index, final int value) {
                this.ensureEquipIdListIsMutable();
                this.equipIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addEquipIdList(final int value) {
                this.ensureEquipIdListIsMutable();
                this.equipIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllEquipIdList(final Iterable<? extends Integer> values) {
                this.ensureEquipIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.equipIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearEquipIdList() {
                this.equipIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getSkillDepotId() {
                return this.skillDepotId_;
            }
            
            public Builder setSkillDepotId(final int value) {
                this.skillDepotId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSkillDepotId() {
                this.skillDepotId_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureTalentIdListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.talentIdList_ = GeneratedMessageV3.mutableCopy(this.talentIdList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getTalentIdListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.talentIdList_) : this.talentIdList_;
            }
            
            @Override
            public int getTalentIdListCount() {
                return this.talentIdList_.size();
            }
            
            @Override
            public int getTalentIdList(final int index) {
                return this.talentIdList_.getInt(index);
            }
            
            public Builder setTalentIdList(final int index, final int value) {
                this.ensureTalentIdListIsMutable();
                this.talentIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addTalentIdList(final int value) {
                this.ensureTalentIdListIsMutable();
                this.talentIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllTalentIdList(final Iterable<? extends Integer> values) {
                this.ensureTalentIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.talentIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearTalentIdList() {
                this.talentIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasWeapon() {
                return this.weaponBuilder_ != null || this.weapon_ != null;
            }
            
            @Override
            public SceneWeaponInfoOuterClass.SceneWeaponInfo getWeapon() {
                if (this.weaponBuilder_ == null) {
                    return (this.weapon_ == null) ? SceneWeaponInfoOuterClass.SceneWeaponInfo.getDefaultInstance() : this.weapon_;
                }
                return this.weaponBuilder_.getMessage();
            }
            
            public Builder setWeapon(final SceneWeaponInfoOuterClass.SceneWeaponInfo value) {
                if (this.weaponBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.weapon_ = value;
                    this.onChanged();
                }
                else {
                    this.weaponBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setWeapon(final SceneWeaponInfoOuterClass.SceneWeaponInfo.Builder builderForValue) {
                if (this.weaponBuilder_ == null) {
                    this.weapon_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.weaponBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeWeapon(final SceneWeaponInfoOuterClass.SceneWeaponInfo value) {
                if (this.weaponBuilder_ == null) {
                    if (this.weapon_ != null) {
                        this.weapon_ = SceneWeaponInfoOuterClass.SceneWeaponInfo.newBuilder(this.weapon_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.weapon_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.weaponBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearWeapon() {
                if (this.weaponBuilder_ == null) {
                    this.weapon_ = null;
                    this.onChanged();
                }
                else {
                    this.weapon_ = null;
                    this.weaponBuilder_ = null;
                }
                return this;
            }
            
            public SceneWeaponInfoOuterClass.SceneWeaponInfo.Builder getWeaponBuilder() {
                this.onChanged();
                return this.getWeaponFieldBuilder().getBuilder();
            }
            
            @Override
            public SceneWeaponInfoOuterClass.SceneWeaponInfoOrBuilder getWeaponOrBuilder() {
                if (this.weaponBuilder_ != null) {
                    return this.weaponBuilder_.getMessageOrBuilder();
                }
                return (this.weapon_ == null) ? SceneWeaponInfoOuterClass.SceneWeaponInfo.getDefaultInstance() : this.weapon_;
            }
            
            private SingleFieldBuilderV3<SceneWeaponInfoOuterClass.SceneWeaponInfo, SceneWeaponInfoOuterClass.SceneWeaponInfo.Builder, SceneWeaponInfoOuterClass.SceneWeaponInfoOrBuilder> getWeaponFieldBuilder() {
                if (this.weaponBuilder_ == null) {
                    this.weaponBuilder_ = new SingleFieldBuilderV3<SceneWeaponInfoOuterClass.SceneWeaponInfo, SceneWeaponInfoOuterClass.SceneWeaponInfo.Builder, SceneWeaponInfoOuterClass.SceneWeaponInfoOrBuilder>(this.getWeapon(), this.getParentForChildren(), this.isClean());
                    this.weapon_ = null;
                }
                return this.weaponBuilder_;
            }
            
            private void ensureReliquaryListIsMutable() {
                if ((this.bitField0_ & 0x4) == 0x0) {
                    this.reliquaryList_ = new ArrayList<SceneReliquaryInfoOuterClass.SceneReliquaryInfo>(this.reliquaryList_);
                    this.bitField0_ |= 0x4;
                }
            }
            
            @Override
            public List<SceneReliquaryInfoOuterClass.SceneReliquaryInfo> getReliquaryListList() {
                if (this.reliquaryListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends SceneReliquaryInfoOuterClass.SceneReliquaryInfo>)this.reliquaryList_);
                }
                return this.reliquaryListBuilder_.getMessageList();
            }
            
            @Override
            public int getReliquaryListCount() {
                if (this.reliquaryListBuilder_ == null) {
                    return this.reliquaryList_.size();
                }
                return this.reliquaryListBuilder_.getCount();
            }
            
            @Override
            public SceneReliquaryInfoOuterClass.SceneReliquaryInfo getReliquaryList(final int index) {
                if (this.reliquaryListBuilder_ == null) {
                    return this.reliquaryList_.get(index);
                }
                return this.reliquaryListBuilder_.getMessage(index);
            }
            
            public Builder setReliquaryList(final int index, final SceneReliquaryInfoOuterClass.SceneReliquaryInfo value) {
                if (this.reliquaryListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureReliquaryListIsMutable();
                    this.reliquaryList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.reliquaryListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setReliquaryList(final int index, final SceneReliquaryInfoOuterClass.SceneReliquaryInfo.Builder builderForValue) {
                if (this.reliquaryListBuilder_ == null) {
                    this.ensureReliquaryListIsMutable();
                    this.reliquaryList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.reliquaryListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addReliquaryList(final SceneReliquaryInfoOuterClass.SceneReliquaryInfo value) {
                if (this.reliquaryListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureReliquaryListIsMutable();
                    this.reliquaryList_.add(value);
                    this.onChanged();
                }
                else {
                    this.reliquaryListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addReliquaryList(final int index, final SceneReliquaryInfoOuterClass.SceneReliquaryInfo value) {
                if (this.reliquaryListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureReliquaryListIsMutable();
                    this.reliquaryList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.reliquaryListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addReliquaryList(final SceneReliquaryInfoOuterClass.SceneReliquaryInfo.Builder builderForValue) {
                if (this.reliquaryListBuilder_ == null) {
                    this.ensureReliquaryListIsMutable();
                    this.reliquaryList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.reliquaryListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addReliquaryList(final int index, final SceneReliquaryInfoOuterClass.SceneReliquaryInfo.Builder builderForValue) {
                if (this.reliquaryListBuilder_ == null) {
                    this.ensureReliquaryListIsMutable();
                    this.reliquaryList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.reliquaryListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllReliquaryList(final Iterable<? extends SceneReliquaryInfoOuterClass.SceneReliquaryInfo> values) {
                if (this.reliquaryListBuilder_ == null) {
                    this.ensureReliquaryListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.reliquaryList_);
                    this.onChanged();
                }
                else {
                    this.reliquaryListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearReliquaryList() {
                if (this.reliquaryListBuilder_ == null) {
                    this.reliquaryList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                    this.onChanged();
                }
                else {
                    this.reliquaryListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeReliquaryList(final int index) {
                if (this.reliquaryListBuilder_ == null) {
                    this.ensureReliquaryListIsMutable();
                    this.reliquaryList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.reliquaryListBuilder_.remove(index);
                }
                return this;
            }
            
            public SceneReliquaryInfoOuterClass.SceneReliquaryInfo.Builder getReliquaryListBuilder(final int index) {
                return this.getReliquaryListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public SceneReliquaryInfoOuterClass.SceneReliquaryInfoOrBuilder getReliquaryListOrBuilder(final int index) {
                if (this.reliquaryListBuilder_ == null) {
                    return this.reliquaryList_.get(index);
                }
                return this.reliquaryListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends SceneReliquaryInfoOuterClass.SceneReliquaryInfoOrBuilder> getReliquaryListOrBuilderList() {
                if (this.reliquaryListBuilder_ != null) {
                    return this.reliquaryListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends SceneReliquaryInfoOuterClass.SceneReliquaryInfoOrBuilder>)this.reliquaryList_);
            }
            
            public SceneReliquaryInfoOuterClass.SceneReliquaryInfo.Builder addReliquaryListBuilder() {
                return this.getReliquaryListFieldBuilder().addBuilder(SceneReliquaryInfoOuterClass.SceneReliquaryInfo.getDefaultInstance());
            }
            
            public SceneReliquaryInfoOuterClass.SceneReliquaryInfo.Builder addReliquaryListBuilder(final int index) {
                return this.getReliquaryListFieldBuilder().addBuilder(index, SceneReliquaryInfoOuterClass.SceneReliquaryInfo.getDefaultInstance());
            }
            
            public List<SceneReliquaryInfoOuterClass.SceneReliquaryInfo.Builder> getReliquaryListBuilderList() {
                return this.getReliquaryListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<SceneReliquaryInfoOuterClass.SceneReliquaryInfo, SceneReliquaryInfoOuterClass.SceneReliquaryInfo.Builder, SceneReliquaryInfoOuterClass.SceneReliquaryInfoOrBuilder> getReliquaryListFieldBuilder() {
                if (this.reliquaryListBuilder_ == null) {
                    this.reliquaryListBuilder_ = new RepeatedFieldBuilderV3<SceneReliquaryInfoOuterClass.SceneReliquaryInfo, SceneReliquaryInfoOuterClass.SceneReliquaryInfo.Builder, SceneReliquaryInfoOuterClass.SceneReliquaryInfoOrBuilder>(this.reliquaryList_, (this.bitField0_ & 0x4) != 0x0, this.getParentForChildren(), this.isClean());
                    this.reliquaryList_ = null;
                }
                return this.reliquaryListBuilder_;
            }
            
            @Override
            public int getCoreProudSkillLevel() {
                return this.coreProudSkillLevel_;
            }
            
            public Builder setCoreProudSkillLevel(final int value) {
                this.coreProudSkillLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCoreProudSkillLevel() {
                this.coreProudSkillLevel_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureInherentProudSkillListIsMutable() {
                if ((this.bitField0_ & 0x8) == 0x0) {
                    this.inherentProudSkillList_ = GeneratedMessageV3.mutableCopy(this.inherentProudSkillList_);
                    this.bitField0_ |= 0x8;
                }
            }
            
            @Override
            public List<Integer> getInherentProudSkillListList() {
                return ((this.bitField0_ & 0x8) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.inherentProudSkillList_) : this.inherentProudSkillList_;
            }
            
            @Override
            public int getInherentProudSkillListCount() {
                return this.inherentProudSkillList_.size();
            }
            
            @Override
            public int getInherentProudSkillList(final int index) {
                return this.inherentProudSkillList_.getInt(index);
            }
            
            public Builder setInherentProudSkillList(final int index, final int value) {
                this.ensureInherentProudSkillListIsMutable();
                this.inherentProudSkillList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addInherentProudSkillList(final int value) {
                this.ensureInherentProudSkillListIsMutable();
                this.inherentProudSkillList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllInherentProudSkillList(final Iterable<? extends Integer> values) {
                this.ensureInherentProudSkillListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.inherentProudSkillList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearInherentProudSkillList() {
                this.inherentProudSkillList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFF7;
                this.onChanged();
                return this;
            }
            
            private MapField<Integer, Integer> internalGetSkillLevelMap() {
                if (this.skillLevelMap_ == null) {
                    return MapField.emptyMapField(SkillLevelMapDefaultEntryHolder.defaultEntry);
                }
                return this.skillLevelMap_;
            }
            
            private MapField<Integer, Integer> internalGetMutableSkillLevelMap() {
                this.onChanged();
                if (this.skillLevelMap_ == null) {
                    this.skillLevelMap_ = MapField.newMapField(SkillLevelMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.skillLevelMap_.isMutable()) {
                    this.skillLevelMap_ = this.skillLevelMap_.copy();
                }
                return this.skillLevelMap_;
            }
            
            @Override
            public int getSkillLevelMapCount() {
                return this.internalGetSkillLevelMap().getMap().size();
            }
            
            @Override
            public boolean containsSkillLevelMap(final int key) {
                return this.internalGetSkillLevelMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Integer> getSkillLevelMap() {
                return this.getSkillLevelMapMap();
            }
            
            @Override
            public Map<Integer, Integer> getSkillLevelMapMap() {
                return this.internalGetSkillLevelMap().getMap();
            }
            
            @Override
            public int getSkillLevelMapOrDefault(final int key, final int defaultValue) {
                final Map<Integer, Integer> map = this.internalGetSkillLevelMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public int getSkillLevelMapOrThrow(final int key) {
                final Map<Integer, Integer> map = this.internalGetSkillLevelMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearSkillLevelMap() {
                this.internalGetMutableSkillLevelMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeSkillLevelMap(final int key) {
                this.internalGetMutableSkillLevelMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, Integer> getMutableSkillLevelMap() {
                return this.internalGetMutableSkillLevelMap().getMutableMap();
            }
            
            public Builder putSkillLevelMap(final int key, final int value) {
                this.internalGetMutableSkillLevelMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllSkillLevelMap(final Map<Integer, Integer> values) {
                this.internalGetMutableSkillLevelMap().getMutableMap().putAll(values);
                return this;
            }
            
            private MapField<Integer, Integer> internalGetProudSkillExtraLevelMap() {
                if (this.proudSkillExtraLevelMap_ == null) {
                    return MapField.emptyMapField(ProudSkillExtraLevelMapDefaultEntryHolder.defaultEntry);
                }
                return this.proudSkillExtraLevelMap_;
            }
            
            private MapField<Integer, Integer> internalGetMutableProudSkillExtraLevelMap() {
                this.onChanged();
                if (this.proudSkillExtraLevelMap_ == null) {
                    this.proudSkillExtraLevelMap_ = MapField.newMapField(ProudSkillExtraLevelMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.proudSkillExtraLevelMap_.isMutable()) {
                    this.proudSkillExtraLevelMap_ = this.proudSkillExtraLevelMap_.copy();
                }
                return this.proudSkillExtraLevelMap_;
            }
            
            @Override
            public int getProudSkillExtraLevelMapCount() {
                return this.internalGetProudSkillExtraLevelMap().getMap().size();
            }
            
            @Override
            public boolean containsProudSkillExtraLevelMap(final int key) {
                return this.internalGetProudSkillExtraLevelMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Integer> getProudSkillExtraLevelMap() {
                return this.getProudSkillExtraLevelMapMap();
            }
            
            @Override
            public Map<Integer, Integer> getProudSkillExtraLevelMapMap() {
                return this.internalGetProudSkillExtraLevelMap().getMap();
            }
            
            @Override
            public int getProudSkillExtraLevelMapOrDefault(final int key, final int defaultValue) {
                final Map<Integer, Integer> map = this.internalGetProudSkillExtraLevelMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public int getProudSkillExtraLevelMapOrThrow(final int key) {
                final Map<Integer, Integer> map = this.internalGetProudSkillExtraLevelMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearProudSkillExtraLevelMap() {
                this.internalGetMutableProudSkillExtraLevelMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeProudSkillExtraLevelMap(final int key) {
                this.internalGetMutableProudSkillExtraLevelMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, Integer> getMutableProudSkillExtraLevelMap() {
                return this.internalGetMutableProudSkillExtraLevelMap().getMutableMap();
            }
            
            public Builder putProudSkillExtraLevelMap(final int key, final int value) {
                this.internalGetMutableProudSkillExtraLevelMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllProudSkillExtraLevelMap(final Map<Integer, Integer> values) {
                this.internalGetMutableProudSkillExtraLevelMap().getMutableMap().putAll(values);
                return this;
            }
            
            private void ensureServerBuffListIsMutable() {
                if ((this.bitField0_ & 0x40) == 0x0) {
                    this.serverBuffList_ = new ArrayList<ServerBuffOuterClass.ServerBuff>(this.serverBuffList_);
                    this.bitField0_ |= 0x40;
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
                    this.bitField0_ &= 0xFFFFFFBF;
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
                    this.serverBuffListBuilder_ = new RepeatedFieldBuilderV3<ServerBuffOuterClass.ServerBuff, ServerBuffOuterClass.ServerBuff.Builder, ServerBuffOuterClass.ServerBuffOrBuilder>(this.serverBuffList_, (this.bitField0_ & 0x40) != 0x0, this.getParentForChildren(), this.isClean());
                    this.serverBuffList_ = null;
                }
                return this.serverBuffListBuilder_;
            }
            
            private void ensureTeamResonanceListIsMutable() {
                if ((this.bitField0_ & 0x80) == 0x0) {
                    this.teamResonanceList_ = GeneratedMessageV3.mutableCopy(this.teamResonanceList_);
                    this.bitField0_ |= 0x80;
                }
            }
            
            @Override
            public List<Integer> getTeamResonanceListList() {
                return ((this.bitField0_ & 0x80) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.teamResonanceList_) : this.teamResonanceList_;
            }
            
            @Override
            public int getTeamResonanceListCount() {
                return this.teamResonanceList_.size();
            }
            
            @Override
            public int getTeamResonanceList(final int index) {
                return this.teamResonanceList_.getInt(index);
            }
            
            public Builder setTeamResonanceList(final int index, final int value) {
                this.ensureTeamResonanceListIsMutable();
                this.teamResonanceList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addTeamResonanceList(final int value) {
                this.ensureTeamResonanceListIsMutable();
                this.teamResonanceList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllTeamResonanceList(final Iterable<? extends Integer> values) {
                this.ensureTeamResonanceListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.teamResonanceList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearTeamResonanceList() {
                this.teamResonanceList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFF7F;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getWearingFlycloakId() {
                return this.wearingFlycloakId_;
            }
            
            public Builder setWearingFlycloakId(final int value) {
                this.wearingFlycloakId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearWearingFlycloakId() {
                this.wearingFlycloakId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getBornTime() {
                return this.bornTime_;
            }
            
            public Builder setBornTime(final int value) {
                this.bornTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBornTime() {
                this.bornTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCostumeId() {
                return this.costumeId_;
            }
            
            public Builder setCostumeId(final int value) {
                this.costumeId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCostumeId() {
                this.costumeId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasCurVehicleInfo() {
                return this.curVehicleInfoBuilder_ != null || this.curVehicleInfo_ != null;
            }
            
            @Override
            public CurVehicleInfoOuterClass.CurVehicleInfo getCurVehicleInfo() {
                if (this.curVehicleInfoBuilder_ == null) {
                    return (this.curVehicleInfo_ == null) ? CurVehicleInfoOuterClass.CurVehicleInfo.getDefaultInstance() : this.curVehicleInfo_;
                }
                return this.curVehicleInfoBuilder_.getMessage();
            }
            
            public Builder setCurVehicleInfo(final CurVehicleInfoOuterClass.CurVehicleInfo value) {
                if (this.curVehicleInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.curVehicleInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.curVehicleInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setCurVehicleInfo(final CurVehicleInfoOuterClass.CurVehicleInfo.Builder builderForValue) {
                if (this.curVehicleInfoBuilder_ == null) {
                    this.curVehicleInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.curVehicleInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeCurVehicleInfo(final CurVehicleInfoOuterClass.CurVehicleInfo value) {
                if (this.curVehicleInfoBuilder_ == null) {
                    if (this.curVehicleInfo_ != null) {
                        this.curVehicleInfo_ = CurVehicleInfoOuterClass.CurVehicleInfo.newBuilder(this.curVehicleInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.curVehicleInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.curVehicleInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearCurVehicleInfo() {
                if (this.curVehicleInfoBuilder_ == null) {
                    this.curVehicleInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.curVehicleInfo_ = null;
                    this.curVehicleInfoBuilder_ = null;
                }
                return this;
            }
            
            public CurVehicleInfoOuterClass.CurVehicleInfo.Builder getCurVehicleInfoBuilder() {
                this.onChanged();
                return this.getCurVehicleInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public CurVehicleInfoOuterClass.CurVehicleInfoOrBuilder getCurVehicleInfoOrBuilder() {
                if (this.curVehicleInfoBuilder_ != null) {
                    return this.curVehicleInfoBuilder_.getMessageOrBuilder();
                }
                return (this.curVehicleInfo_ == null) ? CurVehicleInfoOuterClass.CurVehicleInfo.getDefaultInstance() : this.curVehicleInfo_;
            }
            
            private SingleFieldBuilderV3<CurVehicleInfoOuterClass.CurVehicleInfo, CurVehicleInfoOuterClass.CurVehicleInfo.Builder, CurVehicleInfoOuterClass.CurVehicleInfoOrBuilder> getCurVehicleInfoFieldBuilder() {
                if (this.curVehicleInfoBuilder_ == null) {
                    this.curVehicleInfoBuilder_ = new SingleFieldBuilderV3<CurVehicleInfoOuterClass.CurVehicleInfo, CurVehicleInfoOuterClass.CurVehicleInfo.Builder, CurVehicleInfoOuterClass.CurVehicleInfoOrBuilder>(this.getCurVehicleInfo(), this.getParentForChildren(), this.isClean());
                    this.curVehicleInfo_ = null;
                }
                return this.curVehicleInfoBuilder_;
            }
            
            @Override
            public boolean hasExcelInfo() {
                return this.excelInfoBuilder_ != null || this.excelInfo_ != null;
            }
            
            @Override
            public AvatarExcelInfoOuterClass.AvatarExcelInfo getExcelInfo() {
                if (this.excelInfoBuilder_ == null) {
                    return (this.excelInfo_ == null) ? AvatarExcelInfoOuterClass.AvatarExcelInfo.getDefaultInstance() : this.excelInfo_;
                }
                return this.excelInfoBuilder_.getMessage();
            }
            
            public Builder setExcelInfo(final AvatarExcelInfoOuterClass.AvatarExcelInfo value) {
                if (this.excelInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.excelInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.excelInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setExcelInfo(final AvatarExcelInfoOuterClass.AvatarExcelInfo.Builder builderForValue) {
                if (this.excelInfoBuilder_ == null) {
                    this.excelInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.excelInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeExcelInfo(final AvatarExcelInfoOuterClass.AvatarExcelInfo value) {
                if (this.excelInfoBuilder_ == null) {
                    if (this.excelInfo_ != null) {
                        this.excelInfo_ = AvatarExcelInfoOuterClass.AvatarExcelInfo.newBuilder(this.excelInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.excelInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.excelInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearExcelInfo() {
                if (this.excelInfoBuilder_ == null) {
                    this.excelInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.excelInfo_ = null;
                    this.excelInfoBuilder_ = null;
                }
                return this;
            }
            
            public AvatarExcelInfoOuterClass.AvatarExcelInfo.Builder getExcelInfoBuilder() {
                this.onChanged();
                return this.getExcelInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public AvatarExcelInfoOuterClass.AvatarExcelInfoOrBuilder getExcelInfoOrBuilder() {
                if (this.excelInfoBuilder_ != null) {
                    return this.excelInfoBuilder_.getMessageOrBuilder();
                }
                return (this.excelInfo_ == null) ? AvatarExcelInfoOuterClass.AvatarExcelInfo.getDefaultInstance() : this.excelInfo_;
            }
            
            private SingleFieldBuilderV3<AvatarExcelInfoOuterClass.AvatarExcelInfo, AvatarExcelInfoOuterClass.AvatarExcelInfo.Builder, AvatarExcelInfoOuterClass.AvatarExcelInfoOrBuilder> getExcelInfoFieldBuilder() {
                if (this.excelInfoBuilder_ == null) {
                    this.excelInfoBuilder_ = new SingleFieldBuilderV3<AvatarExcelInfoOuterClass.AvatarExcelInfo, AvatarExcelInfoOuterClass.AvatarExcelInfo.Builder, AvatarExcelInfoOuterClass.AvatarExcelInfoOrBuilder>(this.getExcelInfo(), this.getParentForChildren(), this.isClean());
                    this.excelInfo_ = null;
                }
                return this.excelInfoBuilder_;
            }
            
            @Override
            public int getAnimHash() {
                return this.animHash_;
            }
            
            public Builder setAnimHash(final int value) {
                this.animHash_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAnimHash() {
                this.animHash_ = 0;
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
    
    public interface SceneAvatarInfoOrBuilder extends MessageOrBuilder
    {
        int getUid();
        
        int getAvatarId();
        
        long getGuid();
        
        int getPeerId();
        
        List<Integer> getEquipIdListList();
        
        int getEquipIdListCount();
        
        int getEquipIdList(final int p0);
        
        int getSkillDepotId();
        
        List<Integer> getTalentIdListList();
        
        int getTalentIdListCount();
        
        int getTalentIdList(final int p0);
        
        boolean hasWeapon();
        
        SceneWeaponInfoOuterClass.SceneWeaponInfo getWeapon();
        
        SceneWeaponInfoOuterClass.SceneWeaponInfoOrBuilder getWeaponOrBuilder();
        
        List<SceneReliquaryInfoOuterClass.SceneReliquaryInfo> getReliquaryListList();
        
        SceneReliquaryInfoOuterClass.SceneReliquaryInfo getReliquaryList(final int p0);
        
        int getReliquaryListCount();
        
        List<? extends SceneReliquaryInfoOuterClass.SceneReliquaryInfoOrBuilder> getReliquaryListOrBuilderList();
        
        SceneReliquaryInfoOuterClass.SceneReliquaryInfoOrBuilder getReliquaryListOrBuilder(final int p0);
        
        int getCoreProudSkillLevel();
        
        List<Integer> getInherentProudSkillListList();
        
        int getInherentProudSkillListCount();
        
        int getInherentProudSkillList(final int p0);
        
        int getSkillLevelMapCount();
        
        boolean containsSkillLevelMap(final int p0);
        
        @Deprecated
        Map<Integer, Integer> getSkillLevelMap();
        
        Map<Integer, Integer> getSkillLevelMapMap();
        
        int getSkillLevelMapOrDefault(final int p0, final int p1);
        
        int getSkillLevelMapOrThrow(final int p0);
        
        int getProudSkillExtraLevelMapCount();
        
        boolean containsProudSkillExtraLevelMap(final int p0);
        
        @Deprecated
        Map<Integer, Integer> getProudSkillExtraLevelMap();
        
        Map<Integer, Integer> getProudSkillExtraLevelMapMap();
        
        int getProudSkillExtraLevelMapOrDefault(final int p0, final int p1);
        
        int getProudSkillExtraLevelMapOrThrow(final int p0);
        
        List<ServerBuffOuterClass.ServerBuff> getServerBuffListList();
        
        ServerBuffOuterClass.ServerBuff getServerBuffList(final int p0);
        
        int getServerBuffListCount();
        
        List<? extends ServerBuffOuterClass.ServerBuffOrBuilder> getServerBuffListOrBuilderList();
        
        ServerBuffOuterClass.ServerBuffOrBuilder getServerBuffListOrBuilder(final int p0);
        
        List<Integer> getTeamResonanceListList();
        
        int getTeamResonanceListCount();
        
        int getTeamResonanceList(final int p0);
        
        int getWearingFlycloakId();
        
        int getBornTime();
        
        int getCostumeId();
        
        boolean hasCurVehicleInfo();
        
        CurVehicleInfoOuterClass.CurVehicleInfo getCurVehicleInfo();
        
        CurVehicleInfoOuterClass.CurVehicleInfoOrBuilder getCurVehicleInfoOrBuilder();
        
        boolean hasExcelInfo();
        
        AvatarExcelInfoOuterClass.AvatarExcelInfo getExcelInfo();
        
        AvatarExcelInfoOuterClass.AvatarExcelInfoOrBuilder getExcelInfoOrBuilder();
        
        int getAnimHash();
    }
}
