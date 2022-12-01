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
import java.util.ArrayList;
import com.google.protobuf.MapEntry;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import java.util.List;
import com.google.protobuf.Internal;
import com.google.protobuf.MapField;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class AvatarInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_AvatarInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AvatarInfo_PropMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarInfo_PropMapEntry_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AvatarInfo_FightPropMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarInfo_FightPropMapEntry_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AvatarInfo_SkillMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarInfo_SkillMapEntry_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AvatarInfo_SkillLevelMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarInfo_SkillLevelMapEntry_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AvatarInfo_ProudSkillExtraLevelMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarInfo_ProudSkillExtraLevelMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AvatarInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AvatarInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0010AvatarInfo.proto\u001a\u001aAvatarEquipAffixInfo.proto\u001a\u0015AvatarExcelInfo.proto\u001a\u001bAvatarExpeditionState.proto\u001a\u0016AvatarFetterInfo.proto\u001a\u0015AvatarSkillInfo.proto\u001a\u000fPropValue.proto\u001a\u0015TrialAvatarInfo.proto\"®\t\n\nAvatarInfo\u0012\u0011\n\tavatar_id\u0018\u0001 \u0001(\r\u0012\f\n\u0004guid\u0018\u0002 \u0001(\u0004\u0012*\n\bprop_map\u0018\u0003 \u0003(\u000b2\u0018.AvatarInfo.PropMapEntry\u0012\u0012\n\nlife_state\u0018\u0004 \u0001(\r\u0012\u0017\n\u000fequip_guid_list\u0018\u0005 \u0003(\u0004\u0012\u0016\n\u000etalent_id_list\u0018\u0006 \u0003(\r\u00125\n\u000efight_prop_map\u0018\u0007 \u0003(\u000b2\u001d.AvatarInfo.FightPropMapEntry\u0012+\n\u0011trial_avatar_info\u0018\t \u0001(\u000b2\u0010.TrialAvatarInfo\u0012,\n\tskill_map\u0018\n \u0003(\u000b2\u0019.AvatarInfo.SkillMapEntry\u0012\u0016\n\u000eskill_depot_id\u0018\u000b \u0001(\r\u0012&\n\u000bfetter_info\u0018\f \u0001(\u000b2\u0011.AvatarFetterInfo\u0012\u001e\n\u0016core_proud_skill_level\u0018\r \u0001(\r\u0012!\n\u0019inherent_proud_skill_list\u0018\u000e \u0003(\r\u00127\n\u000fskill_level_map\u0018\u000f \u0003(\u000b2\u001e.AvatarInfo.SkillLevelMapEntry\u00120\n\u0010expedition_state\u0018\u0010 \u0001(\u000e2\u0016.AvatarExpeditionState\u0012M\n\u001bproud_skill_extra_level_map\u0018\u0011 \u0003(\u000b2(.AvatarInfo.ProudSkillExtraLevelMapEntry\u0012\u0010\n\bis_focus\u0018\u0012 \u0001(\b\u0012\u0013\n\u000bavatar_type\u0018\u0013 \u0001(\r\u0012\u001b\n\u0013team_resonance_list\u0018\u0014 \u0003(\r\u0012\u001b\n\u0013wearing_flycloak_id\u0018\u0015 \u0001(\r\u0012/\n\u0010equip_affix_list\u0018\u0016 \u0003(\u000b2\u0015.AvatarEquipAffixInfo\u0012\u0011\n\tborn_time\u0018\u0017 \u0001(\r\u0012#\n\u001bpending_promote_reward_list\u0018\u0018 \u0003(\r\u0012\u0012\n\ncostume_id\u0018\u0019 \u0001(\r\u0012$\n\nexcel_info\u0018\u001a \u0001(\u000b2\u0010.AvatarExcelInfo\u0012\u0011\n\tanim_hash\u0018\u001b \u0001(\r\u001a:\n\fPropMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\u0019\n\u0005value\u0018\u0002 \u0001(\u000b2\n.PropValue:\u00028\u0001\u001a3\n\u0011FightPropMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\u0002:\u00028\u0001\u001aA\n\rSkillMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\u001f\n\u0005value\u0018\u0002 \u0001(\u000b2\u0010.AvatarSkillInfo:\u00028\u0001\u001a4\n\u0012SkillLevelMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001\u001a>\n\u001cProudSkillExtraLevelMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AvatarInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AvatarEquipAffixInfoOuterClass.getDescriptor(), AvatarExcelInfoOuterClass.getDescriptor(), AvatarExpeditionStateOuterClass.getDescriptor(), AvatarFetterInfoOuterClass.getDescriptor(), AvatarSkillInfoOuterClass.getDescriptor(), PropValueOuterClass.getDescriptor(), TrialAvatarInfoOuterClass.getDescriptor() });
        internal_static_AvatarInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AvatarInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarInfoOuterClass.internal_static_AvatarInfo_descriptor, new String[] { "AvatarId", "Guid", "PropMap", "LifeState", "EquipGuidList", "TalentIdList", "FightPropMap", "TrialAvatarInfo", "SkillMap", "SkillDepotId", "FetterInfo", "CoreProudSkillLevel", "InherentProudSkillList", "SkillLevelMap", "ExpeditionState", "ProudSkillExtraLevelMap", "IsFocus", "AvatarType", "TeamResonanceList", "WearingFlycloakId", "EquipAffixList", "BornTime", "PendingPromoteRewardList", "CostumeId", "ExcelInfo", "AnimHash" });
        internal_static_AvatarInfo_PropMapEntry_descriptor = AvatarInfoOuterClass.internal_static_AvatarInfo_descriptor.getNestedTypes().get(0);
        internal_static_AvatarInfo_PropMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarInfoOuterClass.internal_static_AvatarInfo_PropMapEntry_descriptor, new String[] { "Key", "Value" });
        internal_static_AvatarInfo_FightPropMapEntry_descriptor = AvatarInfoOuterClass.internal_static_AvatarInfo_descriptor.getNestedTypes().get(1);
        internal_static_AvatarInfo_FightPropMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarInfoOuterClass.internal_static_AvatarInfo_FightPropMapEntry_descriptor, new String[] { "Key", "Value" });
        internal_static_AvatarInfo_SkillMapEntry_descriptor = AvatarInfoOuterClass.internal_static_AvatarInfo_descriptor.getNestedTypes().get(2);
        internal_static_AvatarInfo_SkillMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarInfoOuterClass.internal_static_AvatarInfo_SkillMapEntry_descriptor, new String[] { "Key", "Value" });
        internal_static_AvatarInfo_SkillLevelMapEntry_descriptor = AvatarInfoOuterClass.internal_static_AvatarInfo_descriptor.getNestedTypes().get(3);
        internal_static_AvatarInfo_SkillLevelMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarInfoOuterClass.internal_static_AvatarInfo_SkillLevelMapEntry_descriptor, new String[] { "Key", "Value" });
        internal_static_AvatarInfo_ProudSkillExtraLevelMapEntry_descriptor = AvatarInfoOuterClass.internal_static_AvatarInfo_descriptor.getNestedTypes().get(4);
        internal_static_AvatarInfo_ProudSkillExtraLevelMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarInfoOuterClass.internal_static_AvatarInfo_ProudSkillExtraLevelMapEntry_descriptor, new String[] { "Key", "Value" });
        AvatarEquipAffixInfoOuterClass.getDescriptor();
        AvatarExcelInfoOuterClass.getDescriptor();
        AvatarExpeditionStateOuterClass.getDescriptor();
        AvatarFetterInfoOuterClass.getDescriptor();
        AvatarSkillInfoOuterClass.getDescriptor();
        PropValueOuterClass.getDescriptor();
        TrialAvatarInfoOuterClass.getDescriptor();
    }
    
    public static final class AvatarInfo extends GeneratedMessageV3 implements AvatarInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int AVATAR_ID_FIELD_NUMBER = 1;
        private int avatarId_;
        public static final int GUID_FIELD_NUMBER = 2;
        private long guid_;
        public static final int PROP_MAP_FIELD_NUMBER = 3;
        private MapField<Integer, PropValueOuterClass.PropValue> propMap_;
        public static final int LIFE_STATE_FIELD_NUMBER = 4;
        private int lifeState_;
        public static final int EQUIP_GUID_LIST_FIELD_NUMBER = 5;
        private Internal.LongList equipGuidList_;
        private int equipGuidListMemoizedSerializedSize;
        public static final int TALENT_ID_LIST_FIELD_NUMBER = 6;
        private Internal.IntList talentIdList_;
        private int talentIdListMemoizedSerializedSize;
        public static final int FIGHT_PROP_MAP_FIELD_NUMBER = 7;
        private MapField<Integer, Float> fightPropMap_;
        public static final int TRIAL_AVATAR_INFO_FIELD_NUMBER = 9;
        private TrialAvatarInfoOuterClass.TrialAvatarInfo trialAvatarInfo_;
        public static final int SKILL_MAP_FIELD_NUMBER = 10;
        private MapField<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> skillMap_;
        public static final int SKILL_DEPOT_ID_FIELD_NUMBER = 11;
        private int skillDepotId_;
        public static final int FETTER_INFO_FIELD_NUMBER = 12;
        private AvatarFetterInfoOuterClass.AvatarFetterInfo fetterInfo_;
        public static final int CORE_PROUD_SKILL_LEVEL_FIELD_NUMBER = 13;
        private int coreProudSkillLevel_;
        public static final int INHERENT_PROUD_SKILL_LIST_FIELD_NUMBER = 14;
        private Internal.IntList inherentProudSkillList_;
        private int inherentProudSkillListMemoizedSerializedSize;
        public static final int SKILL_LEVEL_MAP_FIELD_NUMBER = 15;
        private MapField<Integer, Integer> skillLevelMap_;
        public static final int EXPEDITION_STATE_FIELD_NUMBER = 16;
        private int expeditionState_;
        public static final int PROUD_SKILL_EXTRA_LEVEL_MAP_FIELD_NUMBER = 17;
        private MapField<Integer, Integer> proudSkillExtraLevelMap_;
        public static final int IS_FOCUS_FIELD_NUMBER = 18;
        private boolean isFocus_;
        public static final int AVATAR_TYPE_FIELD_NUMBER = 19;
        private int avatarType_;
        public static final int TEAM_RESONANCE_LIST_FIELD_NUMBER = 20;
        private Internal.IntList teamResonanceList_;
        private int teamResonanceListMemoizedSerializedSize;
        public static final int WEARING_FLYCLOAK_ID_FIELD_NUMBER = 21;
        private int wearingFlycloakId_;
        public static final int EQUIP_AFFIX_LIST_FIELD_NUMBER = 22;
        private List<AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo> equipAffixList_;
        public static final int BORN_TIME_FIELD_NUMBER = 23;
        private int bornTime_;
        public static final int PENDING_PROMOTE_REWARD_LIST_FIELD_NUMBER = 24;
        private Internal.IntList pendingPromoteRewardList_;
        private int pendingPromoteRewardListMemoizedSerializedSize;
        public static final int COSTUME_ID_FIELD_NUMBER = 25;
        private int costumeId_;
        public static final int EXCEL_INFO_FIELD_NUMBER = 26;
        private AvatarExcelInfoOuterClass.AvatarExcelInfo excelInfo_;
        public static final int ANIM_HASH_FIELD_NUMBER = 27;
        private int animHash_;
        private byte memoizedIsInitialized;
        private static final AvatarInfo DEFAULT_INSTANCE;
        private static final Parser<AvatarInfo> PARSER;
        
        private AvatarInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.equipGuidListMemoizedSerializedSize = -1;
            this.talentIdListMemoizedSerializedSize = -1;
            this.inherentProudSkillListMemoizedSerializedSize = -1;
            this.teamResonanceListMemoizedSerializedSize = -1;
            this.pendingPromoteRewardListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private AvatarInfo() {
            this.equipGuidListMemoizedSerializedSize = -1;
            this.talentIdListMemoizedSerializedSize = -1;
            this.inherentProudSkillListMemoizedSerializedSize = -1;
            this.teamResonanceListMemoizedSerializedSize = -1;
            this.pendingPromoteRewardListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.equipGuidList_ = GeneratedMessageV3.emptyLongList();
            this.talentIdList_ = GeneratedMessageV3.emptyIntList();
            this.inherentProudSkillList_ = GeneratedMessageV3.emptyIntList();
            this.expeditionState_ = 0;
            this.teamResonanceList_ = GeneratedMessageV3.emptyIntList();
            this.equipAffixList_ = Collections.emptyList();
            this.pendingPromoteRewardList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AvatarInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AvatarInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.avatarId_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.guid_ = input.readUInt64();
                            continue;
                        }
                        case 26: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.propMap_ = MapField.newMapField(PropMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x1;
                            }
                            final MapEntry<Integer, PropValueOuterClass.PropValue> propMap__ = input.readMessage(PropMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.propMap_.getMutableMap().put(propMap__.getKey(), propMap__.getValue());
                            continue;
                        }
                        case 32: {
                            this.lifeState_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.equipGuidList_ = GeneratedMessageV3.newLongList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.equipGuidList_.addLong(input.readUInt64());
                            continue;
                        }
                        case 42: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.equipGuidList_ = GeneratedMessageV3.newLongList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.equipGuidList_.addLong(input.readUInt64());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 48: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.talentIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.talentIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 50: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x4) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.talentIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x4;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.talentIdList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 58: {
                            if ((mutable_bitField0_ & 0x8) == 0x0) {
                                this.fightPropMap_ = MapField.newMapField(FightPropMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x8;
                            }
                            final MapEntry<Integer, Float> fightPropMap__ = input.readMessage(FightPropMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.fightPropMap_.getMutableMap().put(fightPropMap__.getKey(), fightPropMap__.getValue());
                            continue;
                        }
                        case 74: {
                            TrialAvatarInfoOuterClass.TrialAvatarInfo.Builder subBuilder = null;
                            if (this.trialAvatarInfo_ != null) {
                                subBuilder = this.trialAvatarInfo_.toBuilder();
                            }
                            this.trialAvatarInfo_ = input.readMessage(TrialAvatarInfoOuterClass.TrialAvatarInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.trialAvatarInfo_);
                                this.trialAvatarInfo_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 82: {
                            if ((mutable_bitField0_ & 0x10) == 0x0) {
                                this.skillMap_ = MapField.newMapField(SkillMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x10;
                            }
                            final MapEntry<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> skillMap__ = input.readMessage(SkillMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.skillMap_.getMutableMap().put(skillMap__.getKey(), skillMap__.getValue());
                            continue;
                        }
                        case 88: {
                            this.skillDepotId_ = input.readUInt32();
                            continue;
                        }
                        case 98: {
                            AvatarFetterInfoOuterClass.AvatarFetterInfo.Builder subBuilder2 = null;
                            if (this.fetterInfo_ != null) {
                                subBuilder2 = this.fetterInfo_.toBuilder();
                            }
                            this.fetterInfo_ = input.readMessage(AvatarFetterInfoOuterClass.AvatarFetterInfo.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom(this.fetterInfo_);
                                this.fetterInfo_ = subBuilder2.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 104: {
                            this.coreProudSkillLevel_ = input.readUInt32();
                            continue;
                        }
                        case 112: {
                            if ((mutable_bitField0_ & 0x20) == 0x0) {
                                this.inherentProudSkillList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x20;
                            }
                            this.inherentProudSkillList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 114: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x20) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.inherentProudSkillList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x20;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.inherentProudSkillList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 122: {
                            if ((mutable_bitField0_ & 0x40) == 0x0) {
                                this.skillLevelMap_ = MapField.newMapField(SkillLevelMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x40;
                            }
                            final MapEntry<Integer, Integer> skillLevelMap__ = input.readMessage(SkillLevelMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.skillLevelMap_.getMutableMap().put(skillLevelMap__.getKey(), skillLevelMap__.getValue());
                            continue;
                        }
                        case 128: {
                            final int rawValue = input.readEnum();
                            this.expeditionState_ = rawValue;
                            continue;
                        }
                        case 138: {
                            if ((mutable_bitField0_ & 0x80) == 0x0) {
                                this.proudSkillExtraLevelMap_ = MapField.newMapField(ProudSkillExtraLevelMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x80;
                            }
                            final MapEntry<Integer, Integer> proudSkillExtraLevelMap__ = input.readMessage(ProudSkillExtraLevelMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.proudSkillExtraLevelMap_.getMutableMap().put(proudSkillExtraLevelMap__.getKey(), proudSkillExtraLevelMap__.getValue());
                            continue;
                        }
                        case 144: {
                            this.isFocus_ = input.readBool();
                            continue;
                        }
                        case 152: {
                            this.avatarType_ = input.readUInt32();
                            continue;
                        }
                        case 160: {
                            if ((mutable_bitField0_ & 0x100) == 0x0) {
                                this.teamResonanceList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x100;
                            }
                            this.teamResonanceList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 162: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x100) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.teamResonanceList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x100;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.teamResonanceList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 168: {
                            this.wearingFlycloakId_ = input.readUInt32();
                            continue;
                        }
                        case 178: {
                            if ((mutable_bitField0_ & 0x200) == 0x0) {
                                this.equipAffixList_ = new ArrayList<AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo>();
                                mutable_bitField0_ |= 0x200;
                            }
                            this.equipAffixList_.add(input.readMessage(AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.parser(), extensionRegistry));
                            continue;
                        }
                        case 184: {
                            this.bornTime_ = input.readUInt32();
                            continue;
                        }
                        case 192: {
                            if ((mutable_bitField0_ & 0x400) == 0x0) {
                                this.pendingPromoteRewardList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x400;
                            }
                            this.pendingPromoteRewardList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 194: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x400) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.pendingPromoteRewardList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x400;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.pendingPromoteRewardList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 200: {
                            this.costumeId_ = input.readUInt32();
                            continue;
                        }
                        case 210: {
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
                        case 216: {
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
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.equipGuidList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x4) != 0x0) {
                    this.talentIdList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x20) != 0x0) {
                    this.inherentProudSkillList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x100) != 0x0) {
                    this.teamResonanceList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x200) != 0x0) {
                    this.equipAffixList_ = Collections.unmodifiableList((List<? extends AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo>)this.equipAffixList_);
                }
                if ((mutable_bitField0_ & 0x400) != 0x0) {
                    this.pendingPromoteRewardList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return AvatarInfoOuterClass.internal_static_AvatarInfo_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 3: {
                    return this.internalGetPropMap();
                }
                case 7: {
                    return this.internalGetFightPropMap();
                }
                case 10: {
                    return this.internalGetSkillMap();
                }
                case 15: {
                    return this.internalGetSkillLevelMap();
                }
                case 17: {
                    return this.internalGetProudSkillExtraLevelMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AvatarInfoOuterClass.internal_static_AvatarInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarInfo.class, Builder.class);
        }
        
        @Override
        public int getAvatarId() {
            return this.avatarId_;
        }
        
        @Override
        public long getGuid() {
            return this.guid_;
        }
        
        private MapField<Integer, PropValueOuterClass.PropValue> internalGetPropMap() {
            if (this.propMap_ == null) {
                return MapField.emptyMapField(PropMapDefaultEntryHolder.defaultEntry);
            }
            return this.propMap_;
        }
        
        @Override
        public int getPropMapCount() {
            return this.internalGetPropMap().getMap().size();
        }
        
        @Override
        public boolean containsPropMap(final int key) {
            return this.internalGetPropMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, PropValueOuterClass.PropValue> getPropMap() {
            return this.getPropMapMap();
        }
        
        @Override
        public Map<Integer, PropValueOuterClass.PropValue> getPropMapMap() {
            return this.internalGetPropMap().getMap();
        }
        
        @Override
        public PropValueOuterClass.PropValue getPropMapOrDefault(final int key, final PropValueOuterClass.PropValue defaultValue) {
            final Map<Integer, PropValueOuterClass.PropValue> map = this.internalGetPropMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public PropValueOuterClass.PropValue getPropMapOrThrow(final int key) {
            final Map<Integer, PropValueOuterClass.PropValue> map = this.internalGetPropMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public int getLifeState() {
            return this.lifeState_;
        }
        
        @Override
        public List<Long> getEquipGuidListList() {
            return this.equipGuidList_;
        }
        
        @Override
        public int getEquipGuidListCount() {
            return this.equipGuidList_.size();
        }
        
        @Override
        public long getEquipGuidList(final int index) {
            return this.equipGuidList_.getLong(index);
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
        
        private MapField<Integer, Float> internalGetFightPropMap() {
            if (this.fightPropMap_ == null) {
                return MapField.emptyMapField(FightPropMapDefaultEntryHolder.defaultEntry);
            }
            return this.fightPropMap_;
        }
        
        @Override
        public int getFightPropMapCount() {
            return this.internalGetFightPropMap().getMap().size();
        }
        
        @Override
        public boolean containsFightPropMap(final int key) {
            return this.internalGetFightPropMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, Float> getFightPropMap() {
            return this.getFightPropMapMap();
        }
        
        @Override
        public Map<Integer, Float> getFightPropMapMap() {
            return this.internalGetFightPropMap().getMap();
        }
        
        @Override
        public float getFightPropMapOrDefault(final int key, final float defaultValue) {
            final Map<Integer, Float> map = this.internalGetFightPropMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public float getFightPropMapOrThrow(final int key) {
            final Map<Integer, Float> map = this.internalGetFightPropMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public boolean hasTrialAvatarInfo() {
            return this.trialAvatarInfo_ != null;
        }
        
        @Override
        public TrialAvatarInfoOuterClass.TrialAvatarInfo getTrialAvatarInfo() {
            return (this.trialAvatarInfo_ == null) ? TrialAvatarInfoOuterClass.TrialAvatarInfo.getDefaultInstance() : this.trialAvatarInfo_;
        }
        
        @Override
        public TrialAvatarInfoOuterClass.TrialAvatarInfoOrBuilder getTrialAvatarInfoOrBuilder() {
            return this.getTrialAvatarInfo();
        }
        
        private MapField<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> internalGetSkillMap() {
            if (this.skillMap_ == null) {
                return MapField.emptyMapField(SkillMapDefaultEntryHolder.defaultEntry);
            }
            return this.skillMap_;
        }
        
        @Override
        public int getSkillMapCount() {
            return this.internalGetSkillMap().getMap().size();
        }
        
        @Override
        public boolean containsSkillMap(final int key) {
            return this.internalGetSkillMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> getSkillMap() {
            return this.getSkillMapMap();
        }
        
        @Override
        public Map<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> getSkillMapMap() {
            return this.internalGetSkillMap().getMap();
        }
        
        @Override
        public AvatarSkillInfoOuterClass.AvatarSkillInfo getSkillMapOrDefault(final int key, final AvatarSkillInfoOuterClass.AvatarSkillInfo defaultValue) {
            final Map<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> map = this.internalGetSkillMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public AvatarSkillInfoOuterClass.AvatarSkillInfo getSkillMapOrThrow(final int key) {
            final Map<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> map = this.internalGetSkillMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public int getSkillDepotId() {
            return this.skillDepotId_;
        }
        
        @Override
        public boolean hasFetterInfo() {
            return this.fetterInfo_ != null;
        }
        
        @Override
        public AvatarFetterInfoOuterClass.AvatarFetterInfo getFetterInfo() {
            return (this.fetterInfo_ == null) ? AvatarFetterInfoOuterClass.AvatarFetterInfo.getDefaultInstance() : this.fetterInfo_;
        }
        
        @Override
        public AvatarFetterInfoOuterClass.AvatarFetterInfoOrBuilder getFetterInfoOrBuilder() {
            return this.getFetterInfo();
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
        
        @Override
        public int getExpeditionStateValue() {
            return this.expeditionState_;
        }
        
        @Override
        public AvatarExpeditionStateOuterClass.AvatarExpeditionState getExpeditionState() {
            final AvatarExpeditionStateOuterClass.AvatarExpeditionState result = AvatarExpeditionStateOuterClass.AvatarExpeditionState.valueOf(this.expeditionState_);
            return (result == null) ? AvatarExpeditionStateOuterClass.AvatarExpeditionState.UNRECOGNIZED : result;
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
        public boolean getIsFocus() {
            return this.isFocus_;
        }
        
        @Override
        public int getAvatarType() {
            return this.avatarType_;
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
        public List<AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo> getEquipAffixListList() {
            return this.equipAffixList_;
        }
        
        @Override
        public List<? extends AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfoOrBuilder> getEquipAffixListOrBuilderList() {
            return this.equipAffixList_;
        }
        
        @Override
        public int getEquipAffixListCount() {
            return this.equipAffixList_.size();
        }
        
        @Override
        public AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo getEquipAffixList(final int index) {
            return this.equipAffixList_.get(index);
        }
        
        @Override
        public AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfoOrBuilder getEquipAffixListOrBuilder(final int index) {
            return this.equipAffixList_.get(index);
        }
        
        @Override
        public int getBornTime() {
            return this.bornTime_;
        }
        
        @Override
        public List<Integer> getPendingPromoteRewardListList() {
            return this.pendingPromoteRewardList_;
        }
        
        @Override
        public int getPendingPromoteRewardListCount() {
            return this.pendingPromoteRewardList_.size();
        }
        
        @Override
        public int getPendingPromoteRewardList(final int index) {
            return this.pendingPromoteRewardList_.getInt(index);
        }
        
        @Override
        public int getCostumeId() {
            return this.costumeId_;
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
            if (this.avatarId_ != 0) {
                output.writeUInt32(1, this.avatarId_);
            }
            if (this.guid_ != 0L) {
                output.writeUInt64(2, this.guid_);
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetPropMap(), PropMapDefaultEntryHolder.defaultEntry, 3);
            if (this.lifeState_ != 0) {
                output.writeUInt32(4, this.lifeState_);
            }
            if (this.getEquipGuidListList().size() > 0) {
                output.writeUInt32NoTag(42);
                output.writeUInt32NoTag(this.equipGuidListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.equipGuidList_.size(); ++i) {
                output.writeUInt64NoTag(this.equipGuidList_.getLong(i));
            }
            if (this.getTalentIdListList().size() > 0) {
                output.writeUInt32NoTag(50);
                output.writeUInt32NoTag(this.talentIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.talentIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.talentIdList_.getInt(i));
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetFightPropMap(), FightPropMapDefaultEntryHolder.defaultEntry, 7);
            if (this.trialAvatarInfo_ != null) {
                output.writeMessage(9, this.getTrialAvatarInfo());
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetSkillMap(), SkillMapDefaultEntryHolder.defaultEntry, 10);
            if (this.skillDepotId_ != 0) {
                output.writeUInt32(11, this.skillDepotId_);
            }
            if (this.fetterInfo_ != null) {
                output.writeMessage(12, this.getFetterInfo());
            }
            if (this.coreProudSkillLevel_ != 0) {
                output.writeUInt32(13, this.coreProudSkillLevel_);
            }
            if (this.getInherentProudSkillListList().size() > 0) {
                output.writeUInt32NoTag(114);
                output.writeUInt32NoTag(this.inherentProudSkillListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.inherentProudSkillList_.size(); ++i) {
                output.writeUInt32NoTag(this.inherentProudSkillList_.getInt(i));
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetSkillLevelMap(), SkillLevelMapDefaultEntryHolder.defaultEntry, 15);
            if (this.expeditionState_ != AvatarExpeditionStateOuterClass.AvatarExpeditionState.AVATAR_EXPEDITION_STATE_NONE.getNumber()) {
                output.writeEnum(16, this.expeditionState_);
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetProudSkillExtraLevelMap(), ProudSkillExtraLevelMapDefaultEntryHolder.defaultEntry, 17);
            if (this.isFocus_) {
                output.writeBool(18, this.isFocus_);
            }
            if (this.avatarType_ != 0) {
                output.writeUInt32(19, this.avatarType_);
            }
            if (this.getTeamResonanceListList().size() > 0) {
                output.writeUInt32NoTag(162);
                output.writeUInt32NoTag(this.teamResonanceListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.teamResonanceList_.size(); ++i) {
                output.writeUInt32NoTag(this.teamResonanceList_.getInt(i));
            }
            if (this.wearingFlycloakId_ != 0) {
                output.writeUInt32(21, this.wearingFlycloakId_);
            }
            for (int i = 0; i < this.equipAffixList_.size(); ++i) {
                output.writeMessage(22, this.equipAffixList_.get(i));
            }
            if (this.bornTime_ != 0) {
                output.writeUInt32(23, this.bornTime_);
            }
            if (this.getPendingPromoteRewardListList().size() > 0) {
                output.writeUInt32NoTag(194);
                output.writeUInt32NoTag(this.pendingPromoteRewardListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.pendingPromoteRewardList_.size(); ++i) {
                output.writeUInt32NoTag(this.pendingPromoteRewardList_.getInt(i));
            }
            if (this.costumeId_ != 0) {
                output.writeUInt32(25, this.costumeId_);
            }
            if (this.excelInfo_ != null) {
                output.writeMessage(26, this.getExcelInfo());
            }
            if (this.animHash_ != 0) {
                output.writeUInt32(27, this.animHash_);
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
            if (this.avatarId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.avatarId_);
            }
            if (this.guid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(2, this.guid_);
            }
            for (final Map.Entry<Integer, PropValueOuterClass.PropValue> entry : this.internalGetPropMap().getMap().entrySet()) {
                final MapEntry<Integer, PropValueOuterClass.PropValue> propMap__ = PropMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(3, propMap__);
            }
            if (this.lifeState_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.lifeState_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.equipGuidList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt64SizeNoTag(this.equipGuidList_.getLong(i));
            }
            size += dataSize;
            if (!this.getEquipGuidListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.equipGuidListMemoizedSerializedSize = dataSize;
            dataSize = 0;
            for (int i = 0; i < this.talentIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.talentIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getTalentIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.talentIdListMemoizedSerializedSize = dataSize;
            for (final Map.Entry<Integer, Float> entry2 : this.internalGetFightPropMap().getMap().entrySet()) {
                final MapEntry<Integer, Float> fightPropMap__ = FightPropMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry2.getKey()).setValue(entry2.getValue()).build();
                size += CodedOutputStream.computeMessageSize(7, fightPropMap__);
            }
            if (this.trialAvatarInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(9, this.getTrialAvatarInfo());
            }
            for (final Map.Entry<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> entry3 : this.internalGetSkillMap().getMap().entrySet()) {
                final MapEntry<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> skillMap__ = SkillMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry3.getKey()).setValue(entry3.getValue()).build();
                size += CodedOutputStream.computeMessageSize(10, skillMap__);
            }
            if (this.skillDepotId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.skillDepotId_);
            }
            if (this.fetterInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(12, this.getFetterInfo());
            }
            if (this.coreProudSkillLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.coreProudSkillLevel_);
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
            for (final Map.Entry<Integer, Integer> entry4 : this.internalGetSkillLevelMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> skillLevelMap__ = SkillLevelMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry4.getKey()).setValue(entry4.getValue()).build();
                size += CodedOutputStream.computeMessageSize(15, skillLevelMap__);
            }
            if (this.expeditionState_ != AvatarExpeditionStateOuterClass.AvatarExpeditionState.AVATAR_EXPEDITION_STATE_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(16, this.expeditionState_);
            }
            for (final Map.Entry<Integer, Integer> entry4 : this.internalGetProudSkillExtraLevelMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> proudSkillExtraLevelMap__ = ProudSkillExtraLevelMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry4.getKey()).setValue(entry4.getValue()).build();
                size += CodedOutputStream.computeMessageSize(17, proudSkillExtraLevelMap__);
            }
            if (this.isFocus_) {
                size += CodedOutputStream.computeBoolSize(18, this.isFocus_);
            }
            if (this.avatarType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(19, this.avatarType_);
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
                size += CodedOutputStream.computeUInt32Size(21, this.wearingFlycloakId_);
            }
            for (int j = 0; j < this.equipAffixList_.size(); ++j) {
                size += CodedOutputStream.computeMessageSize(22, this.equipAffixList_.get(j));
            }
            if (this.bornTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(23, this.bornTime_);
            }
            dataSize = 0;
            for (int i = 0; i < this.pendingPromoteRewardList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.pendingPromoteRewardList_.getInt(i));
            }
            size += dataSize;
            if (!this.getPendingPromoteRewardListList().isEmpty()) {
                size += 2;
                size += CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.pendingPromoteRewardListMemoizedSerializedSize = dataSize;
            if (this.costumeId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(25, this.costumeId_);
            }
            if (this.excelInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(26, this.getExcelInfo());
            }
            if (this.animHash_ != 0) {
                size += CodedOutputStream.computeUInt32Size(27, this.animHash_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarInfo)) {
                return super.equals(obj);
            }
            final AvatarInfo other = (AvatarInfo)obj;
            return this.getAvatarId() == other.getAvatarId() && this.getGuid() == other.getGuid() && this.internalGetPropMap().equals(other.internalGetPropMap()) && this.getLifeState() == other.getLifeState() && this.getEquipGuidListList().equals(other.getEquipGuidListList()) && this.getTalentIdListList().equals(other.getTalentIdListList()) && this.internalGetFightPropMap().equals(other.internalGetFightPropMap()) && this.hasTrialAvatarInfo() == other.hasTrialAvatarInfo() && (!this.hasTrialAvatarInfo() || this.getTrialAvatarInfo().equals(other.getTrialAvatarInfo())) && this.internalGetSkillMap().equals(other.internalGetSkillMap()) && this.getSkillDepotId() == other.getSkillDepotId() && this.hasFetterInfo() == other.hasFetterInfo() && (!this.hasFetterInfo() || this.getFetterInfo().equals(other.getFetterInfo())) && this.getCoreProudSkillLevel() == other.getCoreProudSkillLevel() && this.getInherentProudSkillListList().equals(other.getInherentProudSkillListList()) && this.internalGetSkillLevelMap().equals(other.internalGetSkillLevelMap()) && this.expeditionState_ == other.expeditionState_ && this.internalGetProudSkillExtraLevelMap().equals(other.internalGetProudSkillExtraLevelMap()) && this.getIsFocus() == other.getIsFocus() && this.getAvatarType() == other.getAvatarType() && this.getTeamResonanceListList().equals(other.getTeamResonanceListList()) && this.getWearingFlycloakId() == other.getWearingFlycloakId() && this.getEquipAffixListList().equals(other.getEquipAffixListList()) && this.getBornTime() == other.getBornTime() && this.getPendingPromoteRewardListList().equals(other.getPendingPromoteRewardListList()) && this.getCostumeId() == other.getCostumeId() && this.hasExcelInfo() == other.hasExcelInfo() && (!this.hasExcelInfo() || this.getExcelInfo().equals(other.getExcelInfo())) && this.getAnimHash() == other.getAnimHash() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getAvatarId();
            hash = 37 * hash + 2;
            hash = 53 * hash + Internal.hashLong(this.getGuid());
            if (!this.internalGetPropMap().getMap().isEmpty()) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.internalGetPropMap().hashCode();
            }
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getLifeState();
            if (this.getEquipGuidListCount() > 0) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getEquipGuidListList().hashCode();
            }
            if (this.getTalentIdListCount() > 0) {
                hash = 37 * hash + 6;
                hash = 53 * hash + this.getTalentIdListList().hashCode();
            }
            if (!this.internalGetFightPropMap().getMap().isEmpty()) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.internalGetFightPropMap().hashCode();
            }
            if (this.hasTrialAvatarInfo()) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getTrialAvatarInfo().hashCode();
            }
            if (!this.internalGetSkillMap().getMap().isEmpty()) {
                hash = 37 * hash + 10;
                hash = 53 * hash + this.internalGetSkillMap().hashCode();
            }
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getSkillDepotId();
            if (this.hasFetterInfo()) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getFetterInfo().hashCode();
            }
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getCoreProudSkillLevel();
            if (this.getInherentProudSkillListCount() > 0) {
                hash = 37 * hash + 14;
                hash = 53 * hash + this.getInherentProudSkillListList().hashCode();
            }
            if (!this.internalGetSkillLevelMap().getMap().isEmpty()) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.internalGetSkillLevelMap().hashCode();
            }
            hash = 37 * hash + 16;
            hash = 53 * hash + this.expeditionState_;
            if (!this.internalGetProudSkillExtraLevelMap().getMap().isEmpty()) {
                hash = 37 * hash + 17;
                hash = 53 * hash + this.internalGetProudSkillExtraLevelMap().hashCode();
            }
            hash = 37 * hash + 18;
            hash = 53 * hash + Internal.hashBoolean(this.getIsFocus());
            hash = 37 * hash + 19;
            hash = 53 * hash + this.getAvatarType();
            if (this.getTeamResonanceListCount() > 0) {
                hash = 37 * hash + 20;
                hash = 53 * hash + this.getTeamResonanceListList().hashCode();
            }
            hash = 37 * hash + 21;
            hash = 53 * hash + this.getWearingFlycloakId();
            if (this.getEquipAffixListCount() > 0) {
                hash = 37 * hash + 22;
                hash = 53 * hash + this.getEquipAffixListList().hashCode();
            }
            hash = 37 * hash + 23;
            hash = 53 * hash + this.getBornTime();
            if (this.getPendingPromoteRewardListCount() > 0) {
                hash = 37 * hash + 24;
                hash = 53 * hash + this.getPendingPromoteRewardListList().hashCode();
            }
            hash = 37 * hash + 25;
            hash = 53 * hash + this.getCostumeId();
            if (this.hasExcelInfo()) {
                hash = 37 * hash + 26;
                hash = 53 * hash + this.getExcelInfo().hashCode();
            }
            hash = 37 * hash + 27;
            hash = 53 * hash + this.getAnimHash();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AvatarInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AvatarInfo.PARSER.parseFrom(data);
        }
        
        public static AvatarInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AvatarInfo.PARSER.parseFrom(data);
        }
        
        public static AvatarInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AvatarInfo.PARSER.parseFrom(data);
        }
        
        public static AvatarInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarInfo.PARSER, input);
        }
        
        public static AvatarInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarInfo.PARSER, input, extensionRegistry);
        }
        
        public static AvatarInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarInfo.PARSER, input);
        }
        
        public static AvatarInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarInfo.PARSER, input, extensionRegistry);
        }
        
        public static AvatarInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarInfo.PARSER, input);
        }
        
        public static AvatarInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AvatarInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AvatarInfo prototype) {
            return AvatarInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AvatarInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AvatarInfo getDefaultInstance() {
            return AvatarInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<AvatarInfo> parser() {
            return AvatarInfo.PARSER;
        }
        
        @Override
        public Parser<AvatarInfo> getParserForType() {
            return AvatarInfo.PARSER;
        }
        
        @Override
        public AvatarInfo getDefaultInstanceForType() {
            return AvatarInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AvatarInfo();
            PARSER = new AbstractParser<AvatarInfo>() {
                @Override
                public AvatarInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AvatarInfo(input, extensionRegistry);
                }
            };
        }
        
        private static final class PropMapDefaultEntryHolder
        {
            static final MapEntry<Integer, PropValueOuterClass.PropValue> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(AvatarInfoOuterClass.internal_static_AvatarInfo_PropMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.MESSAGE, PropValueOuterClass.PropValue.getDefaultInstance());
            }
        }
        
        private static final class FightPropMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Float> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(AvatarInfoOuterClass.internal_static_AvatarInfo_FightPropMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.FLOAT, 0.0f);
            }
        }
        
        private static final class SkillMapDefaultEntryHolder
        {
            static final MapEntry<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(AvatarInfoOuterClass.internal_static_AvatarInfo_SkillMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.MESSAGE, AvatarSkillInfoOuterClass.AvatarSkillInfo.getDefaultInstance());
            }
        }
        
        private static final class SkillLevelMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(AvatarInfoOuterClass.internal_static_AvatarInfo_SkillLevelMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        private static final class ProudSkillExtraLevelMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(AvatarInfoOuterClass.internal_static_AvatarInfo_ProudSkillExtraLevelMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AvatarInfoOrBuilder
        {
            private int bitField0_;
            private int avatarId_;
            private long guid_;
            private MapField<Integer, PropValueOuterClass.PropValue> propMap_;
            private int lifeState_;
            private Internal.LongList equipGuidList_;
            private Internal.IntList talentIdList_;
            private MapField<Integer, Float> fightPropMap_;
            private TrialAvatarInfoOuterClass.TrialAvatarInfo trialAvatarInfo_;
            private SingleFieldBuilderV3<TrialAvatarInfoOuterClass.TrialAvatarInfo, TrialAvatarInfoOuterClass.TrialAvatarInfo.Builder, TrialAvatarInfoOuterClass.TrialAvatarInfoOrBuilder> trialAvatarInfoBuilder_;
            private MapField<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> skillMap_;
            private int skillDepotId_;
            private AvatarFetterInfoOuterClass.AvatarFetterInfo fetterInfo_;
            private SingleFieldBuilderV3<AvatarFetterInfoOuterClass.AvatarFetterInfo, AvatarFetterInfoOuterClass.AvatarFetterInfo.Builder, AvatarFetterInfoOuterClass.AvatarFetterInfoOrBuilder> fetterInfoBuilder_;
            private int coreProudSkillLevel_;
            private Internal.IntList inherentProudSkillList_;
            private MapField<Integer, Integer> skillLevelMap_;
            private int expeditionState_;
            private MapField<Integer, Integer> proudSkillExtraLevelMap_;
            private boolean isFocus_;
            private int avatarType_;
            private Internal.IntList teamResonanceList_;
            private int wearingFlycloakId_;
            private List<AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo> equipAffixList_;
            private RepeatedFieldBuilderV3<AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo, AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.Builder, AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfoOrBuilder> equipAffixListBuilder_;
            private int bornTime_;
            private Internal.IntList pendingPromoteRewardList_;
            private int costumeId_;
            private AvatarExcelInfoOuterClass.AvatarExcelInfo excelInfo_;
            private SingleFieldBuilderV3<AvatarExcelInfoOuterClass.AvatarExcelInfo, AvatarExcelInfoOuterClass.AvatarExcelInfo.Builder, AvatarExcelInfoOuterClass.AvatarExcelInfoOrBuilder> excelInfoBuilder_;
            private int animHash_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AvatarInfoOuterClass.internal_static_AvatarInfo_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 3: {
                        return this.internalGetPropMap();
                    }
                    case 7: {
                        return this.internalGetFightPropMap();
                    }
                    case 10: {
                        return this.internalGetSkillMap();
                    }
                    case 15: {
                        return this.internalGetSkillLevelMap();
                    }
                    case 17: {
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
                    case 3: {
                        return this.internalGetMutablePropMap();
                    }
                    case 7: {
                        return this.internalGetMutableFightPropMap();
                    }
                    case 10: {
                        return this.internalGetMutableSkillMap();
                    }
                    case 15: {
                        return this.internalGetMutableSkillLevelMap();
                    }
                    case 17: {
                        return this.internalGetMutableProudSkillExtraLevelMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AvatarInfoOuterClass.internal_static_AvatarInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarInfo.class, Builder.class);
            }
            
            private Builder() {
                this.equipGuidList_ = GeneratedMessageV3.emptyLongList();
                this.talentIdList_ = GeneratedMessageV3.emptyIntList();
                this.inherentProudSkillList_ = GeneratedMessageV3.emptyIntList();
                this.expeditionState_ = 0;
                this.teamResonanceList_ = GeneratedMessageV3.emptyIntList();
                this.equipAffixList_ = Collections.emptyList();
                this.pendingPromoteRewardList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.equipGuidList_ = GeneratedMessageV3.emptyLongList();
                this.talentIdList_ = GeneratedMessageV3.emptyIntList();
                this.inherentProudSkillList_ = GeneratedMessageV3.emptyIntList();
                this.expeditionState_ = 0;
                this.teamResonanceList_ = GeneratedMessageV3.emptyIntList();
                this.equipAffixList_ = Collections.emptyList();
                this.pendingPromoteRewardList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AvatarInfo.alwaysUseFieldBuilders) {
                    this.getEquipAffixListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.avatarId_ = 0;
                this.guid_ = 0L;
                this.internalGetMutablePropMap().clear();
                this.lifeState_ = 0;
                this.equipGuidList_ = GeneratedMessageV3.emptyLongList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.talentIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFB;
                this.internalGetMutableFightPropMap().clear();
                if (this.trialAvatarInfoBuilder_ == null) {
                    this.trialAvatarInfo_ = null;
                }
                else {
                    this.trialAvatarInfo_ = null;
                    this.trialAvatarInfoBuilder_ = null;
                }
                this.internalGetMutableSkillMap().clear();
                this.skillDepotId_ = 0;
                if (this.fetterInfoBuilder_ == null) {
                    this.fetterInfo_ = null;
                }
                else {
                    this.fetterInfo_ = null;
                    this.fetterInfoBuilder_ = null;
                }
                this.coreProudSkillLevel_ = 0;
                this.inherentProudSkillList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFDF;
                this.internalGetMutableSkillLevelMap().clear();
                this.expeditionState_ = 0;
                this.internalGetMutableProudSkillExtraLevelMap().clear();
                this.isFocus_ = false;
                this.avatarType_ = 0;
                this.teamResonanceList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFEFF;
                this.wearingFlycloakId_ = 0;
                if (this.equipAffixListBuilder_ == null) {
                    this.equipAffixList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFDFF;
                }
                else {
                    this.equipAffixListBuilder_.clear();
                }
                this.bornTime_ = 0;
                this.pendingPromoteRewardList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFBFF;
                this.costumeId_ = 0;
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
                return AvatarInfoOuterClass.internal_static_AvatarInfo_descriptor;
            }
            
            @Override
            public AvatarInfo getDefaultInstanceForType() {
                return AvatarInfo.getDefaultInstance();
            }
            
            @Override
            public AvatarInfo build() {
                final AvatarInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AvatarInfo buildPartial() {
                final AvatarInfo result = new AvatarInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.avatarId_ = this.avatarId_;
                result.guid_ = this.guid_;
                (result.propMap_ = this.internalGetPropMap()).makeImmutable();
                result.lifeState_ = this.lifeState_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.equipGuidList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.equipGuidList_ = this.equipGuidList_;
                if ((this.bitField0_ & 0x4) != 0x0) {
                    this.talentIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                result.talentIdList_ = this.talentIdList_;
                (result.fightPropMap_ = this.internalGetFightPropMap()).makeImmutable();
                if (this.trialAvatarInfoBuilder_ == null) {
                    result.trialAvatarInfo_ = this.trialAvatarInfo_;
                }
                else {
                    result.trialAvatarInfo_ = this.trialAvatarInfoBuilder_.build();
                }
                (result.skillMap_ = this.internalGetSkillMap()).makeImmutable();
                result.skillDepotId_ = this.skillDepotId_;
                if (this.fetterInfoBuilder_ == null) {
                    result.fetterInfo_ = this.fetterInfo_;
                }
                else {
                    result.fetterInfo_ = this.fetterInfoBuilder_.build();
                }
                result.coreProudSkillLevel_ = this.coreProudSkillLevel_;
                if ((this.bitField0_ & 0x20) != 0x0) {
                    this.inherentProudSkillList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFDF;
                }
                result.inherentProudSkillList_ = this.inherentProudSkillList_;
                (result.skillLevelMap_ = this.internalGetSkillLevelMap()).makeImmutable();
                result.expeditionState_ = this.expeditionState_;
                (result.proudSkillExtraLevelMap_ = this.internalGetProudSkillExtraLevelMap()).makeImmutable();
                result.isFocus_ = this.isFocus_;
                result.avatarType_ = this.avatarType_;
                if ((this.bitField0_ & 0x100) != 0x0) {
                    this.teamResonanceList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFEFF;
                }
                result.teamResonanceList_ = this.teamResonanceList_;
                result.wearingFlycloakId_ = this.wearingFlycloakId_;
                if (this.equipAffixListBuilder_ == null) {
                    if ((this.bitField0_ & 0x200) != 0x0) {
                        this.equipAffixList_ = Collections.unmodifiableList((List<? extends AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo>)this.equipAffixList_);
                        this.bitField0_ &= 0xFFFFFDFF;
                    }
                    result.equipAffixList_ = this.equipAffixList_;
                }
                else {
                    result.equipAffixList_ = this.equipAffixListBuilder_.build();
                }
                result.bornTime_ = this.bornTime_;
                if ((this.bitField0_ & 0x400) != 0x0) {
                    this.pendingPromoteRewardList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFBFF;
                }
                result.pendingPromoteRewardList_ = this.pendingPromoteRewardList_;
                result.costumeId_ = this.costumeId_;
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
                if (other instanceof AvatarInfo) {
                    return this.mergeFrom((AvatarInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AvatarInfo other) {
                if (other == AvatarInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getAvatarId() != 0) {
                    this.setAvatarId(other.getAvatarId());
                }
                if (other.getGuid() != 0L) {
                    this.setGuid(other.getGuid());
                }
                this.internalGetMutablePropMap().mergeFrom(other.internalGetPropMap());
                if (other.getLifeState() != 0) {
                    this.setLifeState(other.getLifeState());
                }
                if (!other.equipGuidList_.isEmpty()) {
                    if (this.equipGuidList_.isEmpty()) {
                        this.equipGuidList_ = other.equipGuidList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureEquipGuidListIsMutable();
                        this.equipGuidList_.addAll(other.equipGuidList_);
                    }
                    this.onChanged();
                }
                if (!other.talentIdList_.isEmpty()) {
                    if (this.talentIdList_.isEmpty()) {
                        this.talentIdList_ = other.talentIdList_;
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    else {
                        this.ensureTalentIdListIsMutable();
                        this.talentIdList_.addAll(other.talentIdList_);
                    }
                    this.onChanged();
                }
                this.internalGetMutableFightPropMap().mergeFrom(other.internalGetFightPropMap());
                if (other.hasTrialAvatarInfo()) {
                    this.mergeTrialAvatarInfo(other.getTrialAvatarInfo());
                }
                this.internalGetMutableSkillMap().mergeFrom(other.internalGetSkillMap());
                if (other.getSkillDepotId() != 0) {
                    this.setSkillDepotId(other.getSkillDepotId());
                }
                if (other.hasFetterInfo()) {
                    this.mergeFetterInfo(other.getFetterInfo());
                }
                if (other.getCoreProudSkillLevel() != 0) {
                    this.setCoreProudSkillLevel(other.getCoreProudSkillLevel());
                }
                if (!other.inherentProudSkillList_.isEmpty()) {
                    if (this.inherentProudSkillList_.isEmpty()) {
                        this.inherentProudSkillList_ = other.inherentProudSkillList_;
                        this.bitField0_ &= 0xFFFFFFDF;
                    }
                    else {
                        this.ensureInherentProudSkillListIsMutable();
                        this.inherentProudSkillList_.addAll(other.inherentProudSkillList_);
                    }
                    this.onChanged();
                }
                this.internalGetMutableSkillLevelMap().mergeFrom(other.internalGetSkillLevelMap());
                if (other.expeditionState_ != 0) {
                    this.setExpeditionStateValue(other.getExpeditionStateValue());
                }
                this.internalGetMutableProudSkillExtraLevelMap().mergeFrom(other.internalGetProudSkillExtraLevelMap());
                if (other.getIsFocus()) {
                    this.setIsFocus(other.getIsFocus());
                }
                if (other.getAvatarType() != 0) {
                    this.setAvatarType(other.getAvatarType());
                }
                if (!other.teamResonanceList_.isEmpty()) {
                    if (this.teamResonanceList_.isEmpty()) {
                        this.teamResonanceList_ = other.teamResonanceList_;
                        this.bitField0_ &= 0xFFFFFEFF;
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
                if (this.equipAffixListBuilder_ == null) {
                    if (!other.equipAffixList_.isEmpty()) {
                        if (this.equipAffixList_.isEmpty()) {
                            this.equipAffixList_ = other.equipAffixList_;
                            this.bitField0_ &= 0xFFFFFDFF;
                        }
                        else {
                            this.ensureEquipAffixListIsMutable();
                            this.equipAffixList_.addAll(other.equipAffixList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.equipAffixList_.isEmpty()) {
                    if (this.equipAffixListBuilder_.isEmpty()) {
                        this.equipAffixListBuilder_.dispose();
                        this.equipAffixListBuilder_ = null;
                        this.equipAffixList_ = other.equipAffixList_;
                        this.bitField0_ &= 0xFFFFFDFF;
                        this.equipAffixListBuilder_ = (AvatarInfo.alwaysUseFieldBuilders ? this.getEquipAffixListFieldBuilder() : null);
                    }
                    else {
                        this.equipAffixListBuilder_.addAllMessages(other.equipAffixList_);
                    }
                }
                if (other.getBornTime() != 0) {
                    this.setBornTime(other.getBornTime());
                }
                if (!other.pendingPromoteRewardList_.isEmpty()) {
                    if (this.pendingPromoteRewardList_.isEmpty()) {
                        this.pendingPromoteRewardList_ = other.pendingPromoteRewardList_;
                        this.bitField0_ &= 0xFFFFFBFF;
                    }
                    else {
                        this.ensurePendingPromoteRewardListIsMutable();
                        this.pendingPromoteRewardList_.addAll(other.pendingPromoteRewardList_);
                    }
                    this.onChanged();
                }
                if (other.getCostumeId() != 0) {
                    this.setCostumeId(other.getCostumeId());
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
                AvatarInfo parsedMessage = null;
                try {
                    parsedMessage = AvatarInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AvatarInfo)e.getUnfinishedMessage();
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
            
            private MapField<Integer, PropValueOuterClass.PropValue> internalGetPropMap() {
                if (this.propMap_ == null) {
                    return MapField.emptyMapField(PropMapDefaultEntryHolder.defaultEntry);
                }
                return this.propMap_;
            }
            
            private MapField<Integer, PropValueOuterClass.PropValue> internalGetMutablePropMap() {
                this.onChanged();
                if (this.propMap_ == null) {
                    this.propMap_ = MapField.newMapField(PropMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.propMap_.isMutable()) {
                    this.propMap_ = this.propMap_.copy();
                }
                return this.propMap_;
            }
            
            @Override
            public int getPropMapCount() {
                return this.internalGetPropMap().getMap().size();
            }
            
            @Override
            public boolean containsPropMap(final int key) {
                return this.internalGetPropMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, PropValueOuterClass.PropValue> getPropMap() {
                return this.getPropMapMap();
            }
            
            @Override
            public Map<Integer, PropValueOuterClass.PropValue> getPropMapMap() {
                return this.internalGetPropMap().getMap();
            }
            
            @Override
            public PropValueOuterClass.PropValue getPropMapOrDefault(final int key, final PropValueOuterClass.PropValue defaultValue) {
                final Map<Integer, PropValueOuterClass.PropValue> map = this.internalGetPropMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public PropValueOuterClass.PropValue getPropMapOrThrow(final int key) {
                final Map<Integer, PropValueOuterClass.PropValue> map = this.internalGetPropMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearPropMap() {
                this.internalGetMutablePropMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removePropMap(final int key) {
                this.internalGetMutablePropMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, PropValueOuterClass.PropValue> getMutablePropMap() {
                return this.internalGetMutablePropMap().getMutableMap();
            }
            
            public Builder putPropMap(final int key, final PropValueOuterClass.PropValue value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.internalGetMutablePropMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllPropMap(final Map<Integer, PropValueOuterClass.PropValue> values) {
                this.internalGetMutablePropMap().getMutableMap().putAll(values);
                return this;
            }
            
            @Override
            public int getLifeState() {
                return this.lifeState_;
            }
            
            public Builder setLifeState(final int value) {
                this.lifeState_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLifeState() {
                this.lifeState_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureEquipGuidListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.equipGuidList_ = GeneratedMessageV3.mutableCopy(this.equipGuidList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Long> getEquipGuidListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Long>)this.equipGuidList_) : this.equipGuidList_;
            }
            
            @Override
            public int getEquipGuidListCount() {
                return this.equipGuidList_.size();
            }
            
            @Override
            public long getEquipGuidList(final int index) {
                return this.equipGuidList_.getLong(index);
            }
            
            public Builder setEquipGuidList(final int index, final long value) {
                this.ensureEquipGuidListIsMutable();
                this.equipGuidList_.setLong(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addEquipGuidList(final long value) {
                this.ensureEquipGuidListIsMutable();
                this.equipGuidList_.addLong(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllEquipGuidList(final Iterable<? extends Long> values) {
                this.ensureEquipGuidListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.equipGuidList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearEquipGuidList() {
                this.equipGuidList_ = GeneratedMessageV3.emptyLongList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
                return this;
            }
            
            private void ensureTalentIdListIsMutable() {
                if ((this.bitField0_ & 0x4) == 0x0) {
                    this.talentIdList_ = GeneratedMessageV3.mutableCopy(this.talentIdList_);
                    this.bitField0_ |= 0x4;
                }
            }
            
            @Override
            public List<Integer> getTalentIdListList() {
                return ((this.bitField0_ & 0x4) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.talentIdList_) : this.talentIdList_;
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
                this.bitField0_ &= 0xFFFFFFFB;
                this.onChanged();
                return this;
            }
            
            private MapField<Integer, Float> internalGetFightPropMap() {
                if (this.fightPropMap_ == null) {
                    return MapField.emptyMapField(FightPropMapDefaultEntryHolder.defaultEntry);
                }
                return this.fightPropMap_;
            }
            
            private MapField<Integer, Float> internalGetMutableFightPropMap() {
                this.onChanged();
                if (this.fightPropMap_ == null) {
                    this.fightPropMap_ = MapField.newMapField(FightPropMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.fightPropMap_.isMutable()) {
                    this.fightPropMap_ = this.fightPropMap_.copy();
                }
                return this.fightPropMap_;
            }
            
            @Override
            public int getFightPropMapCount() {
                return this.internalGetFightPropMap().getMap().size();
            }
            
            @Override
            public boolean containsFightPropMap(final int key) {
                return this.internalGetFightPropMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Float> getFightPropMap() {
                return this.getFightPropMapMap();
            }
            
            @Override
            public Map<Integer, Float> getFightPropMapMap() {
                return this.internalGetFightPropMap().getMap();
            }
            
            @Override
            public float getFightPropMapOrDefault(final int key, final float defaultValue) {
                final Map<Integer, Float> map = this.internalGetFightPropMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public float getFightPropMapOrThrow(final int key) {
                final Map<Integer, Float> map = this.internalGetFightPropMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearFightPropMap() {
                this.internalGetMutableFightPropMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeFightPropMap(final int key) {
                this.internalGetMutableFightPropMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, Float> getMutableFightPropMap() {
                return this.internalGetMutableFightPropMap().getMutableMap();
            }
            
            public Builder putFightPropMap(final int key, final float value) {
                this.internalGetMutableFightPropMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllFightPropMap(final Map<Integer, Float> values) {
                this.internalGetMutableFightPropMap().getMutableMap().putAll(values);
                return this;
            }
            
            @Override
            public boolean hasTrialAvatarInfo() {
                return this.trialAvatarInfoBuilder_ != null || this.trialAvatarInfo_ != null;
            }
            
            @Override
            public TrialAvatarInfoOuterClass.TrialAvatarInfo getTrialAvatarInfo() {
                if (this.trialAvatarInfoBuilder_ == null) {
                    return (this.trialAvatarInfo_ == null) ? TrialAvatarInfoOuterClass.TrialAvatarInfo.getDefaultInstance() : this.trialAvatarInfo_;
                }
                return this.trialAvatarInfoBuilder_.getMessage();
            }
            
            public Builder setTrialAvatarInfo(final TrialAvatarInfoOuterClass.TrialAvatarInfo value) {
                if (this.trialAvatarInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.trialAvatarInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.trialAvatarInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setTrialAvatarInfo(final TrialAvatarInfoOuterClass.TrialAvatarInfo.Builder builderForValue) {
                if (this.trialAvatarInfoBuilder_ == null) {
                    this.trialAvatarInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.trialAvatarInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeTrialAvatarInfo(final TrialAvatarInfoOuterClass.TrialAvatarInfo value) {
                if (this.trialAvatarInfoBuilder_ == null) {
                    if (this.trialAvatarInfo_ != null) {
                        this.trialAvatarInfo_ = TrialAvatarInfoOuterClass.TrialAvatarInfo.newBuilder(this.trialAvatarInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.trialAvatarInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.trialAvatarInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearTrialAvatarInfo() {
                if (this.trialAvatarInfoBuilder_ == null) {
                    this.trialAvatarInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.trialAvatarInfo_ = null;
                    this.trialAvatarInfoBuilder_ = null;
                }
                return this;
            }
            
            public TrialAvatarInfoOuterClass.TrialAvatarInfo.Builder getTrialAvatarInfoBuilder() {
                this.onChanged();
                return this.getTrialAvatarInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public TrialAvatarInfoOuterClass.TrialAvatarInfoOrBuilder getTrialAvatarInfoOrBuilder() {
                if (this.trialAvatarInfoBuilder_ != null) {
                    return this.trialAvatarInfoBuilder_.getMessageOrBuilder();
                }
                return (this.trialAvatarInfo_ == null) ? TrialAvatarInfoOuterClass.TrialAvatarInfo.getDefaultInstance() : this.trialAvatarInfo_;
            }
            
            private SingleFieldBuilderV3<TrialAvatarInfoOuterClass.TrialAvatarInfo, TrialAvatarInfoOuterClass.TrialAvatarInfo.Builder, TrialAvatarInfoOuterClass.TrialAvatarInfoOrBuilder> getTrialAvatarInfoFieldBuilder() {
                if (this.trialAvatarInfoBuilder_ == null) {
                    this.trialAvatarInfoBuilder_ = new SingleFieldBuilderV3<TrialAvatarInfoOuterClass.TrialAvatarInfo, TrialAvatarInfoOuterClass.TrialAvatarInfo.Builder, TrialAvatarInfoOuterClass.TrialAvatarInfoOrBuilder>(this.getTrialAvatarInfo(), this.getParentForChildren(), this.isClean());
                    this.trialAvatarInfo_ = null;
                }
                return this.trialAvatarInfoBuilder_;
            }
            
            private MapField<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> internalGetSkillMap() {
                if (this.skillMap_ == null) {
                    return MapField.emptyMapField(SkillMapDefaultEntryHolder.defaultEntry);
                }
                return this.skillMap_;
            }
            
            private MapField<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> internalGetMutableSkillMap() {
                this.onChanged();
                if (this.skillMap_ == null) {
                    this.skillMap_ = MapField.newMapField(SkillMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.skillMap_.isMutable()) {
                    this.skillMap_ = this.skillMap_.copy();
                }
                return this.skillMap_;
            }
            
            @Override
            public int getSkillMapCount() {
                return this.internalGetSkillMap().getMap().size();
            }
            
            @Override
            public boolean containsSkillMap(final int key) {
                return this.internalGetSkillMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> getSkillMap() {
                return this.getSkillMapMap();
            }
            
            @Override
            public Map<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> getSkillMapMap() {
                return this.internalGetSkillMap().getMap();
            }
            
            @Override
            public AvatarSkillInfoOuterClass.AvatarSkillInfo getSkillMapOrDefault(final int key, final AvatarSkillInfoOuterClass.AvatarSkillInfo defaultValue) {
                final Map<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> map = this.internalGetSkillMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public AvatarSkillInfoOuterClass.AvatarSkillInfo getSkillMapOrThrow(final int key) {
                final Map<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> map = this.internalGetSkillMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearSkillMap() {
                this.internalGetMutableSkillMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeSkillMap(final int key) {
                this.internalGetMutableSkillMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> getMutableSkillMap() {
                return this.internalGetMutableSkillMap().getMutableMap();
            }
            
            public Builder putSkillMap(final int key, final AvatarSkillInfoOuterClass.AvatarSkillInfo value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.internalGetMutableSkillMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllSkillMap(final Map<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> values) {
                this.internalGetMutableSkillMap().getMutableMap().putAll(values);
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
            
            @Override
            public boolean hasFetterInfo() {
                return this.fetterInfoBuilder_ != null || this.fetterInfo_ != null;
            }
            
            @Override
            public AvatarFetterInfoOuterClass.AvatarFetterInfo getFetterInfo() {
                if (this.fetterInfoBuilder_ == null) {
                    return (this.fetterInfo_ == null) ? AvatarFetterInfoOuterClass.AvatarFetterInfo.getDefaultInstance() : this.fetterInfo_;
                }
                return this.fetterInfoBuilder_.getMessage();
            }
            
            public Builder setFetterInfo(final AvatarFetterInfoOuterClass.AvatarFetterInfo value) {
                if (this.fetterInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.fetterInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.fetterInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setFetterInfo(final AvatarFetterInfoOuterClass.AvatarFetterInfo.Builder builderForValue) {
                if (this.fetterInfoBuilder_ == null) {
                    this.fetterInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.fetterInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeFetterInfo(final AvatarFetterInfoOuterClass.AvatarFetterInfo value) {
                if (this.fetterInfoBuilder_ == null) {
                    if (this.fetterInfo_ != null) {
                        this.fetterInfo_ = AvatarFetterInfoOuterClass.AvatarFetterInfo.newBuilder(this.fetterInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.fetterInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.fetterInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearFetterInfo() {
                if (this.fetterInfoBuilder_ == null) {
                    this.fetterInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.fetterInfo_ = null;
                    this.fetterInfoBuilder_ = null;
                }
                return this;
            }
            
            public AvatarFetterInfoOuterClass.AvatarFetterInfo.Builder getFetterInfoBuilder() {
                this.onChanged();
                return this.getFetterInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public AvatarFetterInfoOuterClass.AvatarFetterInfoOrBuilder getFetterInfoOrBuilder() {
                if (this.fetterInfoBuilder_ != null) {
                    return this.fetterInfoBuilder_.getMessageOrBuilder();
                }
                return (this.fetterInfo_ == null) ? AvatarFetterInfoOuterClass.AvatarFetterInfo.getDefaultInstance() : this.fetterInfo_;
            }
            
            private SingleFieldBuilderV3<AvatarFetterInfoOuterClass.AvatarFetterInfo, AvatarFetterInfoOuterClass.AvatarFetterInfo.Builder, AvatarFetterInfoOuterClass.AvatarFetterInfoOrBuilder> getFetterInfoFieldBuilder() {
                if (this.fetterInfoBuilder_ == null) {
                    this.fetterInfoBuilder_ = new SingleFieldBuilderV3<AvatarFetterInfoOuterClass.AvatarFetterInfo, AvatarFetterInfoOuterClass.AvatarFetterInfo.Builder, AvatarFetterInfoOuterClass.AvatarFetterInfoOrBuilder>(this.getFetterInfo(), this.getParentForChildren(), this.isClean());
                    this.fetterInfo_ = null;
                }
                return this.fetterInfoBuilder_;
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
                if ((this.bitField0_ & 0x20) == 0x0) {
                    this.inherentProudSkillList_ = GeneratedMessageV3.mutableCopy(this.inherentProudSkillList_);
                    this.bitField0_ |= 0x20;
                }
            }
            
            @Override
            public List<Integer> getInherentProudSkillListList() {
                return ((this.bitField0_ & 0x20) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.inherentProudSkillList_) : this.inherentProudSkillList_;
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
                this.bitField0_ &= 0xFFFFFFDF;
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
            
            @Override
            public int getExpeditionStateValue() {
                return this.expeditionState_;
            }
            
            public Builder setExpeditionStateValue(final int value) {
                this.expeditionState_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public AvatarExpeditionStateOuterClass.AvatarExpeditionState getExpeditionState() {
                final AvatarExpeditionStateOuterClass.AvatarExpeditionState result = AvatarExpeditionStateOuterClass.AvatarExpeditionState.valueOf(this.expeditionState_);
                return (result == null) ? AvatarExpeditionStateOuterClass.AvatarExpeditionState.UNRECOGNIZED : result;
            }
            
            public Builder setExpeditionState(final AvatarExpeditionStateOuterClass.AvatarExpeditionState value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.expeditionState_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearExpeditionState() {
                this.expeditionState_ = 0;
                this.onChanged();
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
            
            @Override
            public boolean getIsFocus() {
                return this.isFocus_;
            }
            
            public Builder setIsFocus(final boolean value) {
                this.isFocus_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsFocus() {
                this.isFocus_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getAvatarType() {
                return this.avatarType_;
            }
            
            public Builder setAvatarType(final int value) {
                this.avatarType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAvatarType() {
                this.avatarType_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureTeamResonanceListIsMutable() {
                if ((this.bitField0_ & 0x100) == 0x0) {
                    this.teamResonanceList_ = GeneratedMessageV3.mutableCopy(this.teamResonanceList_);
                    this.bitField0_ |= 0x100;
                }
            }
            
            @Override
            public List<Integer> getTeamResonanceListList() {
                return ((this.bitField0_ & 0x100) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.teamResonanceList_) : this.teamResonanceList_;
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
                this.bitField0_ &= 0xFFFFFEFF;
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
            
            private void ensureEquipAffixListIsMutable() {
                if ((this.bitField0_ & 0x200) == 0x0) {
                    this.equipAffixList_ = new ArrayList<AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo>(this.equipAffixList_);
                    this.bitField0_ |= 0x200;
                }
            }
            
            @Override
            public List<AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo> getEquipAffixListList() {
                if (this.equipAffixListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo>)this.equipAffixList_);
                }
                return this.equipAffixListBuilder_.getMessageList();
            }
            
            @Override
            public int getEquipAffixListCount() {
                if (this.equipAffixListBuilder_ == null) {
                    return this.equipAffixList_.size();
                }
                return this.equipAffixListBuilder_.getCount();
            }
            
            @Override
            public AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo getEquipAffixList(final int index) {
                if (this.equipAffixListBuilder_ == null) {
                    return this.equipAffixList_.get(index);
                }
                return this.equipAffixListBuilder_.getMessage(index);
            }
            
            public Builder setEquipAffixList(final int index, final AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo value) {
                if (this.equipAffixListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureEquipAffixListIsMutable();
                    this.equipAffixList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.equipAffixListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setEquipAffixList(final int index, final AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.Builder builderForValue) {
                if (this.equipAffixListBuilder_ == null) {
                    this.ensureEquipAffixListIsMutable();
                    this.equipAffixList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.equipAffixListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addEquipAffixList(final AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo value) {
                if (this.equipAffixListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureEquipAffixListIsMutable();
                    this.equipAffixList_.add(value);
                    this.onChanged();
                }
                else {
                    this.equipAffixListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addEquipAffixList(final int index, final AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo value) {
                if (this.equipAffixListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureEquipAffixListIsMutable();
                    this.equipAffixList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.equipAffixListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addEquipAffixList(final AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.Builder builderForValue) {
                if (this.equipAffixListBuilder_ == null) {
                    this.ensureEquipAffixListIsMutable();
                    this.equipAffixList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.equipAffixListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addEquipAffixList(final int index, final AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.Builder builderForValue) {
                if (this.equipAffixListBuilder_ == null) {
                    this.ensureEquipAffixListIsMutable();
                    this.equipAffixList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.equipAffixListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllEquipAffixList(final Iterable<? extends AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo> values) {
                if (this.equipAffixListBuilder_ == null) {
                    this.ensureEquipAffixListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.equipAffixList_);
                    this.onChanged();
                }
                else {
                    this.equipAffixListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearEquipAffixList() {
                if (this.equipAffixListBuilder_ == null) {
                    this.equipAffixList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFDFF;
                    this.onChanged();
                }
                else {
                    this.equipAffixListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeEquipAffixList(final int index) {
                if (this.equipAffixListBuilder_ == null) {
                    this.ensureEquipAffixListIsMutable();
                    this.equipAffixList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.equipAffixListBuilder_.remove(index);
                }
                return this;
            }
            
            public AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.Builder getEquipAffixListBuilder(final int index) {
                return this.getEquipAffixListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfoOrBuilder getEquipAffixListOrBuilder(final int index) {
                if (this.equipAffixListBuilder_ == null) {
                    return this.equipAffixList_.get(index);
                }
                return this.equipAffixListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfoOrBuilder> getEquipAffixListOrBuilderList() {
                if (this.equipAffixListBuilder_ != null) {
                    return this.equipAffixListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfoOrBuilder>)this.equipAffixList_);
            }
            
            public AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.Builder addEquipAffixListBuilder() {
                return this.getEquipAffixListFieldBuilder().addBuilder(AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.getDefaultInstance());
            }
            
            public AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.Builder addEquipAffixListBuilder(final int index) {
                return this.getEquipAffixListFieldBuilder().addBuilder(index, AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.getDefaultInstance());
            }
            
            public List<AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.Builder> getEquipAffixListBuilderList() {
                return this.getEquipAffixListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo, AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.Builder, AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfoOrBuilder> getEquipAffixListFieldBuilder() {
                if (this.equipAffixListBuilder_ == null) {
                    this.equipAffixListBuilder_ = new RepeatedFieldBuilderV3<AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo, AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.Builder, AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfoOrBuilder>(this.equipAffixList_, (this.bitField0_ & 0x200) != 0x0, this.getParentForChildren(), this.isClean());
                    this.equipAffixList_ = null;
                }
                return this.equipAffixListBuilder_;
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
            
            private void ensurePendingPromoteRewardListIsMutable() {
                if ((this.bitField0_ & 0x400) == 0x0) {
                    this.pendingPromoteRewardList_ = GeneratedMessageV3.mutableCopy(this.pendingPromoteRewardList_);
                    this.bitField0_ |= 0x400;
                }
            }
            
            @Override
            public List<Integer> getPendingPromoteRewardListList() {
                return ((this.bitField0_ & 0x400) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.pendingPromoteRewardList_) : this.pendingPromoteRewardList_;
            }
            
            @Override
            public int getPendingPromoteRewardListCount() {
                return this.pendingPromoteRewardList_.size();
            }
            
            @Override
            public int getPendingPromoteRewardList(final int index) {
                return this.pendingPromoteRewardList_.getInt(index);
            }
            
            public Builder setPendingPromoteRewardList(final int index, final int value) {
                this.ensurePendingPromoteRewardListIsMutable();
                this.pendingPromoteRewardList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addPendingPromoteRewardList(final int value) {
                this.ensurePendingPromoteRewardListIsMutable();
                this.pendingPromoteRewardList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllPendingPromoteRewardList(final Iterable<? extends Integer> values) {
                this.ensurePendingPromoteRewardListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.pendingPromoteRewardList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearPendingPromoteRewardList() {
                this.pendingPromoteRewardList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFBFF;
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
    
    public interface AvatarInfoOrBuilder extends MessageOrBuilder
    {
        int getAvatarId();
        
        long getGuid();
        
        int getPropMapCount();
        
        boolean containsPropMap(final int p0);
        
        @Deprecated
        Map<Integer, PropValueOuterClass.PropValue> getPropMap();
        
        Map<Integer, PropValueOuterClass.PropValue> getPropMapMap();
        
        PropValueOuterClass.PropValue getPropMapOrDefault(final int p0, final PropValueOuterClass.PropValue p1);
        
        PropValueOuterClass.PropValue getPropMapOrThrow(final int p0);
        
        int getLifeState();
        
        List<Long> getEquipGuidListList();
        
        int getEquipGuidListCount();
        
        long getEquipGuidList(final int p0);
        
        List<Integer> getTalentIdListList();
        
        int getTalentIdListCount();
        
        int getTalentIdList(final int p0);
        
        int getFightPropMapCount();
        
        boolean containsFightPropMap(final int p0);
        
        @Deprecated
        Map<Integer, Float> getFightPropMap();
        
        Map<Integer, Float> getFightPropMapMap();
        
        float getFightPropMapOrDefault(final int p0, final float p1);
        
        float getFightPropMapOrThrow(final int p0);
        
        boolean hasTrialAvatarInfo();
        
        TrialAvatarInfoOuterClass.TrialAvatarInfo getTrialAvatarInfo();
        
        TrialAvatarInfoOuterClass.TrialAvatarInfoOrBuilder getTrialAvatarInfoOrBuilder();
        
        int getSkillMapCount();
        
        boolean containsSkillMap(final int p0);
        
        @Deprecated
        Map<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> getSkillMap();
        
        Map<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> getSkillMapMap();
        
        AvatarSkillInfoOuterClass.AvatarSkillInfo getSkillMapOrDefault(final int p0, final AvatarSkillInfoOuterClass.AvatarSkillInfo p1);
        
        AvatarSkillInfoOuterClass.AvatarSkillInfo getSkillMapOrThrow(final int p0);
        
        int getSkillDepotId();
        
        boolean hasFetterInfo();
        
        AvatarFetterInfoOuterClass.AvatarFetterInfo getFetterInfo();
        
        AvatarFetterInfoOuterClass.AvatarFetterInfoOrBuilder getFetterInfoOrBuilder();
        
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
        
        int getExpeditionStateValue();
        
        AvatarExpeditionStateOuterClass.AvatarExpeditionState getExpeditionState();
        
        int getProudSkillExtraLevelMapCount();
        
        boolean containsProudSkillExtraLevelMap(final int p0);
        
        @Deprecated
        Map<Integer, Integer> getProudSkillExtraLevelMap();
        
        Map<Integer, Integer> getProudSkillExtraLevelMapMap();
        
        int getProudSkillExtraLevelMapOrDefault(final int p0, final int p1);
        
        int getProudSkillExtraLevelMapOrThrow(final int p0);
        
        boolean getIsFocus();
        
        int getAvatarType();
        
        List<Integer> getTeamResonanceListList();
        
        int getTeamResonanceListCount();
        
        int getTeamResonanceList(final int p0);
        
        int getWearingFlycloakId();
        
        List<AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo> getEquipAffixListList();
        
        AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo getEquipAffixList(final int p0);
        
        int getEquipAffixListCount();
        
        List<? extends AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfoOrBuilder> getEquipAffixListOrBuilderList();
        
        AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfoOrBuilder getEquipAffixListOrBuilder(final int p0);
        
        int getBornTime();
        
        List<Integer> getPendingPromoteRewardListList();
        
        int getPendingPromoteRewardListCount();
        
        int getPendingPromoteRewardList(final int p0);
        
        int getCostumeId();
        
        boolean hasExcelInfo();
        
        AvatarExcelInfoOuterClass.AvatarExcelInfo getExcelInfo();
        
        AvatarExcelInfoOuterClass.AvatarExcelInfoOrBuilder getExcelInfoOrBuilder();
        
        int getAnimHash();
    }
}
