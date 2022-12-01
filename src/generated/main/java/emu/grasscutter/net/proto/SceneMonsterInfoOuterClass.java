// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.WireFormat;
import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.Internal;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class SceneMonsterInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_SceneMonsterInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SceneMonsterInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SceneMonsterInfo_SummonTagMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SceneMonsterInfo_SummonTagMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SceneMonsterInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SceneMonsterInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016SceneMonsterInfo.proto\u001a\u0016FishtankFishInfo.proto\u001a\u0015MonsterBornType.proto\u001a\u0012MonsterRoute.proto\u001a\u0013SceneFishInfo.proto\u001a\u0015SceneWeaponInfo.proto\"\u00f9\u0005\n\u0010SceneMonsterInfo\u0012\u0012\n\nmonster_id\u0018\u0001 \u0001(\r\u0012\u0010\n\bgroup_id\u0018\u0002 \u0001(\r\u0012\u0011\n\tconfig_id\u0018\u0003 \u0001(\r\u0012%\n\u000bweapon_list\u0018\u0004 \u0003(\u000b2\u0010.SceneWeaponInfo\u0012\u0019\n\u0011authority_peer_id\u0018\u0005 \u0001(\r\u0012\u0012\n\naffix_list\u0018\u0006 \u0003(\r\u0012\u0010\n\bis_elite\u0018\u0007 \u0001(\b\u0012\u0017\n\u000fowner_entity_id\u0018\b \u0001(\r\u0012\u0014\n\fsummoned_tag\u0018\t \u0001(\r\u0012;\n\u000esummon_tag_map\u0018\n \u0003(\u000b2#.SceneMonsterInfo.SummonTagMapEntry\u0012\u000f\n\u0007pose_id\u0018\u000b \u0001(\r\u0012#\n\tborn_type\u0018\f \u0001(\u000e2\u0010.MonsterBornType\u0012\u0010\n\bblock_id\u0018\r \u0001(\r\u0012\u0011\n\tmark_flag\u0018\u000e \u0001(\r\u0012\u0010\n\btitle_id\u0018\u000f \u0001(\r\u0012\u0017\n\u000fspecial_name_id\u0018\u0010 \u0001(\r\u0012\u0018\n\u0010attack_target_id\u0018\u0011 \u0001(\r\u0012$\n\rmonster_route\u0018\u0012 \u0001(\u000b2\r.MonsterRoute\u0012\u0014\n\fai_config_id\u0018\u0013 \u0001(\r\u0012\u0016\n\u000elevel_route_id\u0018\u0014 \u0001(\r\u0012\u0014\n\finit_pose_id\u0018\u0015 \u0001(\r\u0012\u001b\n\u0013Unk2800_JEGLENPDPNI\u0018\u0016 \u0001(\b\u0012\u001b\n\u0013Unk3000_CCKJDCBDEKD\u0018\u0017 \u0001(\r\u0012#\n\tfish_info\u00182 \u0001(\u000b2\u000e.SceneFishInfoH\u0000\u0012/\n\u0012fishtank_fish_info\u00183 \u0001(\u000b2\u0011.FishtankFishInfoH\u0000\u001a3\n\u0011SummonTagMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001B\t\n\u0007contentB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SceneMonsterInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { FishtankFishInfoOuterClass.getDescriptor(), MonsterBornTypeOuterClass.getDescriptor(), MonsterRouteOuterClass.getDescriptor(), SceneFishInfoOuterClass.getDescriptor(), SceneWeaponInfoOuterClass.getDescriptor() });
        internal_static_SceneMonsterInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SceneMonsterInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SceneMonsterInfoOuterClass.internal_static_SceneMonsterInfo_descriptor, new String[] { "MonsterId", "GroupId", "ConfigId", "WeaponList", "AuthorityPeerId", "AffixList", "IsElite", "OwnerEntityId", "SummonedTag", "SummonTagMap", "PoseId", "BornType", "BlockId", "MarkFlag", "TitleId", "SpecialNameId", "AttackTargetId", "MonsterRoute", "AiConfigId", "LevelRouteId", "InitPoseId", "Unk2800JEGLENPDPNI", "Unk3000CCKJDCBDEKD", "FishInfo", "FishtankFishInfo", "Content" });
        internal_static_SceneMonsterInfo_SummonTagMapEntry_descriptor = SceneMonsterInfoOuterClass.internal_static_SceneMonsterInfo_descriptor.getNestedTypes().get(0);
        internal_static_SceneMonsterInfo_SummonTagMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SceneMonsterInfoOuterClass.internal_static_SceneMonsterInfo_SummonTagMapEntry_descriptor, new String[] { "Key", "Value" });
        FishtankFishInfoOuterClass.getDescriptor();
        MonsterBornTypeOuterClass.getDescriptor();
        MonsterRouteOuterClass.getDescriptor();
        SceneFishInfoOuterClass.getDescriptor();
        SceneWeaponInfoOuterClass.getDescriptor();
    }
    
    public static final class SceneMonsterInfo extends GeneratedMessageV3 implements SceneMonsterInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private int contentCase_;
        private Object content_;
        public static final int MONSTER_ID_FIELD_NUMBER = 1;
        private int monsterId_;
        public static final int GROUP_ID_FIELD_NUMBER = 2;
        private int groupId_;
        public static final int CONFIG_ID_FIELD_NUMBER = 3;
        private int configId_;
        public static final int WEAPON_LIST_FIELD_NUMBER = 4;
        private List<SceneWeaponInfoOuterClass.SceneWeaponInfo> weaponList_;
        public static final int AUTHORITY_PEER_ID_FIELD_NUMBER = 5;
        private int authorityPeerId_;
        public static final int AFFIX_LIST_FIELD_NUMBER = 6;
        private Internal.IntList affixList_;
        private int affixListMemoizedSerializedSize;
        public static final int IS_ELITE_FIELD_NUMBER = 7;
        private boolean isElite_;
        public static final int OWNER_ENTITY_ID_FIELD_NUMBER = 8;
        private int ownerEntityId_;
        public static final int SUMMONED_TAG_FIELD_NUMBER = 9;
        private int summonedTag_;
        public static final int SUMMON_TAG_MAP_FIELD_NUMBER = 10;
        private MapField<Integer, Integer> summonTagMap_;
        public static final int POSE_ID_FIELD_NUMBER = 11;
        private int poseId_;
        public static final int BORN_TYPE_FIELD_NUMBER = 12;
        private int bornType_;
        public static final int BLOCK_ID_FIELD_NUMBER = 13;
        private int blockId_;
        public static final int MARK_FLAG_FIELD_NUMBER = 14;
        private int markFlag_;
        public static final int TITLE_ID_FIELD_NUMBER = 15;
        private int titleId_;
        public static final int SPECIAL_NAME_ID_FIELD_NUMBER = 16;
        private int specialNameId_;
        public static final int ATTACK_TARGET_ID_FIELD_NUMBER = 17;
        private int attackTargetId_;
        public static final int MONSTER_ROUTE_FIELD_NUMBER = 18;
        private MonsterRouteOuterClass.MonsterRoute monsterRoute_;
        public static final int AI_CONFIG_ID_FIELD_NUMBER = 19;
        private int aiConfigId_;
        public static final int LEVEL_ROUTE_ID_FIELD_NUMBER = 20;
        private int levelRouteId_;
        public static final int INIT_POSE_ID_FIELD_NUMBER = 21;
        private int initPoseId_;
        public static final int UNK2800_JEGLENPDPNI_FIELD_NUMBER = 22;
        private boolean unk2800JEGLENPDPNI_;
        public static final int UNK3000_CCKJDCBDEKD_FIELD_NUMBER = 23;
        private int unk3000CCKJDCBDEKD_;
        public static final int FISH_INFO_FIELD_NUMBER = 50;
        public static final int FISHTANK_FISH_INFO_FIELD_NUMBER = 51;
        private byte memoizedIsInitialized;
        private static final SceneMonsterInfo DEFAULT_INSTANCE;
        private static final Parser<SceneMonsterInfo> PARSER;
        
        private SceneMonsterInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.contentCase_ = 0;
            this.affixListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private SceneMonsterInfo() {
            this.contentCase_ = 0;
            this.affixListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.weaponList_ = Collections.emptyList();
            this.affixList_ = GeneratedMessageV3.emptyIntList();
            this.bornType_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SceneMonsterInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SceneMonsterInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.monsterId_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.groupId_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.configId_ = input.readUInt32();
                            continue;
                        }
                        case 34: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.weaponList_ = new ArrayList<SceneWeaponInfoOuterClass.SceneWeaponInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.weaponList_.add(input.readMessage(SceneWeaponInfoOuterClass.SceneWeaponInfo.parser(), extensionRegistry));
                            continue;
                        }
                        case 40: {
                            this.authorityPeerId_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.affixList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.affixList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 50: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.affixList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.affixList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 56: {
                            this.isElite_ = input.readBool();
                            continue;
                        }
                        case 64: {
                            this.ownerEntityId_ = input.readUInt32();
                            continue;
                        }
                        case 72: {
                            this.summonedTag_ = input.readUInt32();
                            continue;
                        }
                        case 82: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.summonTagMap_ = MapField.newMapField(SummonTagMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x4;
                            }
                            final MapEntry<Integer, Integer> summonTagMap__ = input.readMessage(SummonTagMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.summonTagMap_.getMutableMap().put(summonTagMap__.getKey(), summonTagMap__.getValue());
                            continue;
                        }
                        case 88: {
                            this.poseId_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
                            final int rawValue = input.readEnum();
                            this.bornType_ = rawValue;
                            continue;
                        }
                        case 104: {
                            this.blockId_ = input.readUInt32();
                            continue;
                        }
                        case 112: {
                            this.markFlag_ = input.readUInt32();
                            continue;
                        }
                        case 120: {
                            this.titleId_ = input.readUInt32();
                            continue;
                        }
                        case 128: {
                            this.specialNameId_ = input.readUInt32();
                            continue;
                        }
                        case 136: {
                            this.attackTargetId_ = input.readUInt32();
                            continue;
                        }
                        case 146: {
                            MonsterRouteOuterClass.MonsterRoute.Builder subBuilder = null;
                            if (this.monsterRoute_ != null) {
                                subBuilder = this.monsterRoute_.toBuilder();
                            }
                            this.monsterRoute_ = input.readMessage(MonsterRouteOuterClass.MonsterRoute.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.monsterRoute_);
                                this.monsterRoute_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 152: {
                            this.aiConfigId_ = input.readUInt32();
                            continue;
                        }
                        case 160: {
                            this.levelRouteId_ = input.readUInt32();
                            continue;
                        }
                        case 168: {
                            this.initPoseId_ = input.readUInt32();
                            continue;
                        }
                        case 176: {
                            this.unk2800JEGLENPDPNI_ = input.readBool();
                            continue;
                        }
                        case 184: {
                            this.unk3000CCKJDCBDEKD_ = input.readUInt32();
                            continue;
                        }
                        case 402: {
                            SceneFishInfoOuterClass.SceneFishInfo.Builder subBuilder2 = null;
                            if (this.contentCase_ == 50) {
                                subBuilder2 = ((SceneFishInfoOuterClass.SceneFishInfo)this.content_).toBuilder();
                            }
                            this.content_ = input.readMessage(SceneFishInfoOuterClass.SceneFishInfo.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom((SceneFishInfoOuterClass.SceneFishInfo)this.content_);
                                this.content_ = subBuilder2.buildPartial();
                            }
                            this.contentCase_ = 50;
                            continue;
                        }
                        case 410: {
                            FishtankFishInfoOuterClass.FishtankFishInfo.Builder subBuilder3 = null;
                            if (this.contentCase_ == 51) {
                                subBuilder3 = ((FishtankFishInfoOuterClass.FishtankFishInfo)this.content_).toBuilder();
                            }
                            this.content_ = input.readMessage(FishtankFishInfoOuterClass.FishtankFishInfo.parser(), extensionRegistry);
                            if (subBuilder3 != null) {
                                subBuilder3.mergeFrom((FishtankFishInfoOuterClass.FishtankFishInfo)this.content_);
                                this.content_ = subBuilder3.buildPartial();
                            }
                            this.contentCase_ = 51;
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
                    this.weaponList_ = Collections.unmodifiableList((List<? extends SceneWeaponInfoOuterClass.SceneWeaponInfo>)this.weaponList_);
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.affixList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return SceneMonsterInfoOuterClass.internal_static_SceneMonsterInfo_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 10: {
                    return this.internalGetSummonTagMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SceneMonsterInfoOuterClass.internal_static_SceneMonsterInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneMonsterInfo.class, Builder.class);
        }
        
        @Override
        public ContentCase getContentCase() {
            return ContentCase.forNumber(this.contentCase_);
        }
        
        @Override
        public int getMonsterId() {
            return this.monsterId_;
        }
        
        @Override
        public int getGroupId() {
            return this.groupId_;
        }
        
        @Override
        public int getConfigId() {
            return this.configId_;
        }
        
        @Override
        public List<SceneWeaponInfoOuterClass.SceneWeaponInfo> getWeaponListList() {
            return this.weaponList_;
        }
        
        @Override
        public List<? extends SceneWeaponInfoOuterClass.SceneWeaponInfoOrBuilder> getWeaponListOrBuilderList() {
            return this.weaponList_;
        }
        
        @Override
        public int getWeaponListCount() {
            return this.weaponList_.size();
        }
        
        @Override
        public SceneWeaponInfoOuterClass.SceneWeaponInfo getWeaponList(final int index) {
            return this.weaponList_.get(index);
        }
        
        @Override
        public SceneWeaponInfoOuterClass.SceneWeaponInfoOrBuilder getWeaponListOrBuilder(final int index) {
            return this.weaponList_.get(index);
        }
        
        @Override
        public int getAuthorityPeerId() {
            return this.authorityPeerId_;
        }
        
        @Override
        public List<Integer> getAffixListList() {
            return this.affixList_;
        }
        
        @Override
        public int getAffixListCount() {
            return this.affixList_.size();
        }
        
        @Override
        public int getAffixList(final int index) {
            return this.affixList_.getInt(index);
        }
        
        @Override
        public boolean getIsElite() {
            return this.isElite_;
        }
        
        @Override
        public int getOwnerEntityId() {
            return this.ownerEntityId_;
        }
        
        @Override
        public int getSummonedTag() {
            return this.summonedTag_;
        }
        
        private MapField<Integer, Integer> internalGetSummonTagMap() {
            if (this.summonTagMap_ == null) {
                return MapField.emptyMapField(SummonTagMapDefaultEntryHolder.defaultEntry);
            }
            return this.summonTagMap_;
        }
        
        @Override
        public int getSummonTagMapCount() {
            return this.internalGetSummonTagMap().getMap().size();
        }
        
        @Override
        public boolean containsSummonTagMap(final int key) {
            return this.internalGetSummonTagMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, Integer> getSummonTagMap() {
            return this.getSummonTagMapMap();
        }
        
        @Override
        public Map<Integer, Integer> getSummonTagMapMap() {
            return this.internalGetSummonTagMap().getMap();
        }
        
        @Override
        public int getSummonTagMapOrDefault(final int key, final int defaultValue) {
            final Map<Integer, Integer> map = this.internalGetSummonTagMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public int getSummonTagMapOrThrow(final int key) {
            final Map<Integer, Integer> map = this.internalGetSummonTagMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public int getPoseId() {
            return this.poseId_;
        }
        
        @Override
        public int getBornTypeValue() {
            return this.bornType_;
        }
        
        @Override
        public MonsterBornTypeOuterClass.MonsterBornType getBornType() {
            final MonsterBornTypeOuterClass.MonsterBornType result = MonsterBornTypeOuterClass.MonsterBornType.valueOf(this.bornType_);
            return (result == null) ? MonsterBornTypeOuterClass.MonsterBornType.UNRECOGNIZED : result;
        }
        
        @Override
        public int getBlockId() {
            return this.blockId_;
        }
        
        @Override
        public int getMarkFlag() {
            return this.markFlag_;
        }
        
        @Override
        public int getTitleId() {
            return this.titleId_;
        }
        
        @Override
        public int getSpecialNameId() {
            return this.specialNameId_;
        }
        
        @Override
        public int getAttackTargetId() {
            return this.attackTargetId_;
        }
        
        @Override
        public boolean hasMonsterRoute() {
            return this.monsterRoute_ != null;
        }
        
        @Override
        public MonsterRouteOuterClass.MonsterRoute getMonsterRoute() {
            return (this.monsterRoute_ == null) ? MonsterRouteOuterClass.MonsterRoute.getDefaultInstance() : this.monsterRoute_;
        }
        
        @Override
        public MonsterRouteOuterClass.MonsterRouteOrBuilder getMonsterRouteOrBuilder() {
            return this.getMonsterRoute();
        }
        
        @Override
        public int getAiConfigId() {
            return this.aiConfigId_;
        }
        
        @Override
        public int getLevelRouteId() {
            return this.levelRouteId_;
        }
        
        @Override
        public int getInitPoseId() {
            return this.initPoseId_;
        }
        
        @Override
        public boolean getUnk2800JEGLENPDPNI() {
            return this.unk2800JEGLENPDPNI_;
        }
        
        @Override
        public int getUnk3000CCKJDCBDEKD() {
            return this.unk3000CCKJDCBDEKD_;
        }
        
        @Override
        public boolean hasFishInfo() {
            return this.contentCase_ == 50;
        }
        
        @Override
        public SceneFishInfoOuterClass.SceneFishInfo getFishInfo() {
            if (this.contentCase_ == 50) {
                return (SceneFishInfoOuterClass.SceneFishInfo)this.content_;
            }
            return SceneFishInfoOuterClass.SceneFishInfo.getDefaultInstance();
        }
        
        @Override
        public SceneFishInfoOuterClass.SceneFishInfoOrBuilder getFishInfoOrBuilder() {
            if (this.contentCase_ == 50) {
                return (SceneFishInfoOuterClass.SceneFishInfo)this.content_;
            }
            return SceneFishInfoOuterClass.SceneFishInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasFishtankFishInfo() {
            return this.contentCase_ == 51;
        }
        
        @Override
        public FishtankFishInfoOuterClass.FishtankFishInfo getFishtankFishInfo() {
            if (this.contentCase_ == 51) {
                return (FishtankFishInfoOuterClass.FishtankFishInfo)this.content_;
            }
            return FishtankFishInfoOuterClass.FishtankFishInfo.getDefaultInstance();
        }
        
        @Override
        public FishtankFishInfoOuterClass.FishtankFishInfoOrBuilder getFishtankFishInfoOrBuilder() {
            if (this.contentCase_ == 51) {
                return (FishtankFishInfoOuterClass.FishtankFishInfo)this.content_;
            }
            return FishtankFishInfoOuterClass.FishtankFishInfo.getDefaultInstance();
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
            if (this.monsterId_ != 0) {
                output.writeUInt32(1, this.monsterId_);
            }
            if (this.groupId_ != 0) {
                output.writeUInt32(2, this.groupId_);
            }
            if (this.configId_ != 0) {
                output.writeUInt32(3, this.configId_);
            }
            for (int i = 0; i < this.weaponList_.size(); ++i) {
                output.writeMessage(4, this.weaponList_.get(i));
            }
            if (this.authorityPeerId_ != 0) {
                output.writeUInt32(5, this.authorityPeerId_);
            }
            if (this.getAffixListList().size() > 0) {
                output.writeUInt32NoTag(50);
                output.writeUInt32NoTag(this.affixListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.affixList_.size(); ++i) {
                output.writeUInt32NoTag(this.affixList_.getInt(i));
            }
            if (this.isElite_) {
                output.writeBool(7, this.isElite_);
            }
            if (this.ownerEntityId_ != 0) {
                output.writeUInt32(8, this.ownerEntityId_);
            }
            if (this.summonedTag_ != 0) {
                output.writeUInt32(9, this.summonedTag_);
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetSummonTagMap(), SummonTagMapDefaultEntryHolder.defaultEntry, 10);
            if (this.poseId_ != 0) {
                output.writeUInt32(11, this.poseId_);
            }
            if (this.bornType_ != MonsterBornTypeOuterClass.MonsterBornType.MONSTER_BORN_TYPE_NONE.getNumber()) {
                output.writeEnum(12, this.bornType_);
            }
            if (this.blockId_ != 0) {
                output.writeUInt32(13, this.blockId_);
            }
            if (this.markFlag_ != 0) {
                output.writeUInt32(14, this.markFlag_);
            }
            if (this.titleId_ != 0) {
                output.writeUInt32(15, this.titleId_);
            }
            if (this.specialNameId_ != 0) {
                output.writeUInt32(16, this.specialNameId_);
            }
            if (this.attackTargetId_ != 0) {
                output.writeUInt32(17, this.attackTargetId_);
            }
            if (this.monsterRoute_ != null) {
                output.writeMessage(18, this.getMonsterRoute());
            }
            if (this.aiConfigId_ != 0) {
                output.writeUInt32(19, this.aiConfigId_);
            }
            if (this.levelRouteId_ != 0) {
                output.writeUInt32(20, this.levelRouteId_);
            }
            if (this.initPoseId_ != 0) {
                output.writeUInt32(21, this.initPoseId_);
            }
            if (this.unk2800JEGLENPDPNI_) {
                output.writeBool(22, this.unk2800JEGLENPDPNI_);
            }
            if (this.unk3000CCKJDCBDEKD_ != 0) {
                output.writeUInt32(23, this.unk3000CCKJDCBDEKD_);
            }
            if (this.contentCase_ == 50) {
                output.writeMessage(50, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 51) {
                output.writeMessage(51, (MessageLite)this.content_);
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
            if (this.monsterId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.monsterId_);
            }
            if (this.groupId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.groupId_);
            }
            if (this.configId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.configId_);
            }
            for (int i = 0; i < this.weaponList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(4, this.weaponList_.get(i));
            }
            if (this.authorityPeerId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.authorityPeerId_);
            }
            int dataSize = 0;
            for (int j = 0; j < this.affixList_.size(); ++j) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.affixList_.getInt(j));
            }
            size += dataSize;
            if (!this.getAffixListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.affixListMemoizedSerializedSize = dataSize;
            if (this.isElite_) {
                size += CodedOutputStream.computeBoolSize(7, this.isElite_);
            }
            if (this.ownerEntityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.ownerEntityId_);
            }
            if (this.summonedTag_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.summonedTag_);
            }
            for (final Map.Entry<Integer, Integer> entry : this.internalGetSummonTagMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> summonTagMap__ = SummonTagMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(10, summonTagMap__);
            }
            if (this.poseId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.poseId_);
            }
            if (this.bornType_ != MonsterBornTypeOuterClass.MonsterBornType.MONSTER_BORN_TYPE_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(12, this.bornType_);
            }
            if (this.blockId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.blockId_);
            }
            if (this.markFlag_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.markFlag_);
            }
            if (this.titleId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.titleId_);
            }
            if (this.specialNameId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(16, this.specialNameId_);
            }
            if (this.attackTargetId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(17, this.attackTargetId_);
            }
            if (this.monsterRoute_ != null) {
                size += CodedOutputStream.computeMessageSize(18, this.getMonsterRoute());
            }
            if (this.aiConfigId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(19, this.aiConfigId_);
            }
            if (this.levelRouteId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(20, this.levelRouteId_);
            }
            if (this.initPoseId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(21, this.initPoseId_);
            }
            if (this.unk2800JEGLENPDPNI_) {
                size += CodedOutputStream.computeBoolSize(22, this.unk2800JEGLENPDPNI_);
            }
            if (this.unk3000CCKJDCBDEKD_ != 0) {
                size += CodedOutputStream.computeUInt32Size(23, this.unk3000CCKJDCBDEKD_);
            }
            if (this.contentCase_ == 50) {
                size += CodedOutputStream.computeMessageSize(50, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 51) {
                size += CodedOutputStream.computeMessageSize(51, (MessageLite)this.content_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SceneMonsterInfo)) {
                return super.equals(obj);
            }
            final SceneMonsterInfo other = (SceneMonsterInfo)obj;
            if (this.getMonsterId() != other.getMonsterId()) {
                return false;
            }
            if (this.getGroupId() != other.getGroupId()) {
                return false;
            }
            if (this.getConfigId() != other.getConfigId()) {
                return false;
            }
            if (!this.getWeaponListList().equals(other.getWeaponListList())) {
                return false;
            }
            if (this.getAuthorityPeerId() != other.getAuthorityPeerId()) {
                return false;
            }
            if (!this.getAffixListList().equals(other.getAffixListList())) {
                return false;
            }
            if (this.getIsElite() != other.getIsElite()) {
                return false;
            }
            if (this.getOwnerEntityId() != other.getOwnerEntityId()) {
                return false;
            }
            if (this.getSummonedTag() != other.getSummonedTag()) {
                return false;
            }
            if (!this.internalGetSummonTagMap().equals(other.internalGetSummonTagMap())) {
                return false;
            }
            if (this.getPoseId() != other.getPoseId()) {
                return false;
            }
            if (this.bornType_ != other.bornType_) {
                return false;
            }
            if (this.getBlockId() != other.getBlockId()) {
                return false;
            }
            if (this.getMarkFlag() != other.getMarkFlag()) {
                return false;
            }
            if (this.getTitleId() != other.getTitleId()) {
                return false;
            }
            if (this.getSpecialNameId() != other.getSpecialNameId()) {
                return false;
            }
            if (this.getAttackTargetId() != other.getAttackTargetId()) {
                return false;
            }
            if (this.hasMonsterRoute() != other.hasMonsterRoute()) {
                return false;
            }
            if (this.hasMonsterRoute() && !this.getMonsterRoute().equals(other.getMonsterRoute())) {
                return false;
            }
            if (this.getAiConfigId() != other.getAiConfigId()) {
                return false;
            }
            if (this.getLevelRouteId() != other.getLevelRouteId()) {
                return false;
            }
            if (this.getInitPoseId() != other.getInitPoseId()) {
                return false;
            }
            if (this.getUnk2800JEGLENPDPNI() != other.getUnk2800JEGLENPDPNI()) {
                return false;
            }
            if (this.getUnk3000CCKJDCBDEKD() != other.getUnk3000CCKJDCBDEKD()) {
                return false;
            }
            if (!this.getContentCase().equals(other.getContentCase())) {
                return false;
            }
            switch (this.contentCase_) {
                case 50: {
                    if (!this.getFishInfo().equals(other.getFishInfo())) {
                        return false;
                    }
                    break;
                }
                case 51: {
                    if (!this.getFishtankFishInfo().equals(other.getFishtankFishInfo())) {
                        return false;
                    }
                    break;
                }
            }
            return this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getMonsterId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getGroupId();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getConfigId();
            if (this.getWeaponListCount() > 0) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getWeaponListList().hashCode();
            }
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getAuthorityPeerId();
            if (this.getAffixListCount() > 0) {
                hash = 37 * hash + 6;
                hash = 53 * hash + this.getAffixListList().hashCode();
            }
            hash = 37 * hash + 7;
            hash = 53 * hash + Internal.hashBoolean(this.getIsElite());
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getOwnerEntityId();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getSummonedTag();
            if (!this.internalGetSummonTagMap().getMap().isEmpty()) {
                hash = 37 * hash + 10;
                hash = 53 * hash + this.internalGetSummonTagMap().hashCode();
            }
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getPoseId();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.bornType_;
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getBlockId();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getMarkFlag();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getTitleId();
            hash = 37 * hash + 16;
            hash = 53 * hash + this.getSpecialNameId();
            hash = 37 * hash + 17;
            hash = 53 * hash + this.getAttackTargetId();
            if (this.hasMonsterRoute()) {
                hash = 37 * hash + 18;
                hash = 53 * hash + this.getMonsterRoute().hashCode();
            }
            hash = 37 * hash + 19;
            hash = 53 * hash + this.getAiConfigId();
            hash = 37 * hash + 20;
            hash = 53 * hash + this.getLevelRouteId();
            hash = 37 * hash + 21;
            hash = 53 * hash + this.getInitPoseId();
            hash = 37 * hash + 22;
            hash = 53 * hash + Internal.hashBoolean(this.getUnk2800JEGLENPDPNI());
            hash = 37 * hash + 23;
            hash = 53 * hash + this.getUnk3000CCKJDCBDEKD();
            switch (this.contentCase_) {
                case 50: {
                    hash = 37 * hash + 50;
                    hash = 53 * hash + this.getFishInfo().hashCode();
                    break;
                }
                case 51: {
                    hash = 37 * hash + 51;
                    hash = 53 * hash + this.getFishtankFishInfo().hashCode();
                    break;
                }
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SceneMonsterInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SceneMonsterInfo.PARSER.parseFrom(data);
        }
        
        public static SceneMonsterInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneMonsterInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneMonsterInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SceneMonsterInfo.PARSER.parseFrom(data);
        }
        
        public static SceneMonsterInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneMonsterInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneMonsterInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SceneMonsterInfo.PARSER.parseFrom(data);
        }
        
        public static SceneMonsterInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneMonsterInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneMonsterInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneMonsterInfo.PARSER, input);
        }
        
        public static SceneMonsterInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneMonsterInfo.PARSER, input, extensionRegistry);
        }
        
        public static SceneMonsterInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneMonsterInfo.PARSER, input);
        }
        
        public static SceneMonsterInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneMonsterInfo.PARSER, input, extensionRegistry);
        }
        
        public static SceneMonsterInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneMonsterInfo.PARSER, input);
        }
        
        public static SceneMonsterInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneMonsterInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SceneMonsterInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SceneMonsterInfo prototype) {
            return SceneMonsterInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SceneMonsterInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SceneMonsterInfo getDefaultInstance() {
            return SceneMonsterInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<SceneMonsterInfo> parser() {
            return SceneMonsterInfo.PARSER;
        }
        
        @Override
        public Parser<SceneMonsterInfo> getParserForType() {
            return SceneMonsterInfo.PARSER;
        }
        
        @Override
        public SceneMonsterInfo getDefaultInstanceForType() {
            return SceneMonsterInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SceneMonsterInfo();
            PARSER = new AbstractParser<SceneMonsterInfo>() {
                @Override
                public SceneMonsterInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SceneMonsterInfo(input, extensionRegistry);
                }
            };
        }
        
        public enum ContentCase implements Internal.EnumLite, InternalOneOfEnum
        {
            FISH_INFO(50), 
            FISHTANK_FISH_INFO(51), 
            CONTENT_NOT_SET(0);
            
            private final int value;
            
            private ContentCase(final int value) {
                this.value = value;
            }
            
            @Deprecated
            public static ContentCase valueOf(final int value) {
                return forNumber(value);
            }
            
            public static ContentCase forNumber(final int value) {
                switch (value) {
                    case 50: {
                        return ContentCase.FISH_INFO;
                    }
                    case 51: {
                        return ContentCase.FISHTANK_FISH_INFO;
                    }
                    case 0: {
                        return ContentCase.CONTENT_NOT_SET;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            @Override
            public int getNumber() {
                return this.value;
            }
            
            private static /* synthetic */ ContentCase[] value() {
                return new ContentCase[] { ContentCase.FISH_INFO, ContentCase.FISHTANK_FISH_INFO, ContentCase.CONTENT_NOT_SET };
            }
            
            
        }
        
        private static final class SummonTagMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(SceneMonsterInfoOuterClass.internal_static_SceneMonsterInfo_SummonTagMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SceneMonsterInfoOrBuilder
        {
            private int contentCase_;
            private Object content_;
            private int bitField0_;
            private int monsterId_;
            private int groupId_;
            private int configId_;
            private List<SceneWeaponInfoOuterClass.SceneWeaponInfo> weaponList_;
            private RepeatedFieldBuilderV3<SceneWeaponInfoOuterClass.SceneWeaponInfo, SceneWeaponInfoOuterClass.SceneWeaponInfo.Builder, SceneWeaponInfoOuterClass.SceneWeaponInfoOrBuilder> weaponListBuilder_;
            private int authorityPeerId_;
            private Internal.IntList affixList_;
            private boolean isElite_;
            private int ownerEntityId_;
            private int summonedTag_;
            private MapField<Integer, Integer> summonTagMap_;
            private int poseId_;
            private int bornType_;
            private int blockId_;
            private int markFlag_;
            private int titleId_;
            private int specialNameId_;
            private int attackTargetId_;
            private MonsterRouteOuterClass.MonsterRoute monsterRoute_;
            private SingleFieldBuilderV3<MonsterRouteOuterClass.MonsterRoute, MonsterRouteOuterClass.MonsterRoute.Builder, MonsterRouteOuterClass.MonsterRouteOrBuilder> monsterRouteBuilder_;
            private int aiConfigId_;
            private int levelRouteId_;
            private int initPoseId_;
            private boolean unk2800JEGLENPDPNI_;
            private int unk3000CCKJDCBDEKD_;
            private SingleFieldBuilderV3<SceneFishInfoOuterClass.SceneFishInfo, SceneFishInfoOuterClass.SceneFishInfo.Builder, SceneFishInfoOuterClass.SceneFishInfoOrBuilder> fishInfoBuilder_;
            private SingleFieldBuilderV3<FishtankFishInfoOuterClass.FishtankFishInfo, FishtankFishInfoOuterClass.FishtankFishInfo.Builder, FishtankFishInfoOuterClass.FishtankFishInfoOrBuilder> fishtankFishInfoBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SceneMonsterInfoOuterClass.internal_static_SceneMonsterInfo_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 10: {
                        return this.internalGetSummonTagMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected MapField internalGetMutableMapField(final int number) {
                switch (number) {
                    case 10: {
                        return this.internalGetMutableSummonTagMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SceneMonsterInfoOuterClass.internal_static_SceneMonsterInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneMonsterInfo.class, Builder.class);
            }
            
            private Builder() {
                this.contentCase_ = 0;
                this.weaponList_ = Collections.emptyList();
                this.affixList_ = GeneratedMessageV3.emptyIntList();
                this.bornType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.contentCase_ = 0;
                this.weaponList_ = Collections.emptyList();
                this.affixList_ = GeneratedMessageV3.emptyIntList();
                this.bornType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SceneMonsterInfo.alwaysUseFieldBuilders) {
                    this.getWeaponListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.monsterId_ = 0;
                this.groupId_ = 0;
                this.configId_ = 0;
                if (this.weaponListBuilder_ == null) {
                    this.weaponList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.weaponListBuilder_.clear();
                }
                this.authorityPeerId_ = 0;
                this.affixList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.isElite_ = false;
                this.ownerEntityId_ = 0;
                this.summonedTag_ = 0;
                this.internalGetMutableSummonTagMap().clear();
                this.poseId_ = 0;
                this.bornType_ = 0;
                this.blockId_ = 0;
                this.markFlag_ = 0;
                this.titleId_ = 0;
                this.specialNameId_ = 0;
                this.attackTargetId_ = 0;
                if (this.monsterRouteBuilder_ == null) {
                    this.monsterRoute_ = null;
                }
                else {
                    this.monsterRoute_ = null;
                    this.monsterRouteBuilder_ = null;
                }
                this.aiConfigId_ = 0;
                this.levelRouteId_ = 0;
                this.initPoseId_ = 0;
                this.unk2800JEGLENPDPNI_ = false;
                this.unk3000CCKJDCBDEKD_ = 0;
                this.contentCase_ = 0;
                this.content_ = null;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SceneMonsterInfoOuterClass.internal_static_SceneMonsterInfo_descriptor;
            }
            
            @Override
            public SceneMonsterInfo getDefaultInstanceForType() {
                return SceneMonsterInfo.getDefaultInstance();
            }
            
            @Override
            public SceneMonsterInfo build() {
                final SceneMonsterInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SceneMonsterInfo buildPartial() {
                final SceneMonsterInfo result = new SceneMonsterInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.monsterId_ = this.monsterId_;
                result.groupId_ = this.groupId_;
                result.configId_ = this.configId_;
                if (this.weaponListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.weaponList_ = Collections.unmodifiableList((List<? extends SceneWeaponInfoOuterClass.SceneWeaponInfo>)this.weaponList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.weaponList_ = this.weaponList_;
                }
                else {
                    result.weaponList_ = this.weaponListBuilder_.build();
                }
                result.authorityPeerId_ = this.authorityPeerId_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.affixList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.affixList_ = this.affixList_;
                result.isElite_ = this.isElite_;
                result.ownerEntityId_ = this.ownerEntityId_;
                result.summonedTag_ = this.summonedTag_;
                (result.summonTagMap_ = this.internalGetSummonTagMap()).makeImmutable();
                result.poseId_ = this.poseId_;
                result.bornType_ = this.bornType_;
                result.blockId_ = this.blockId_;
                result.markFlag_ = this.markFlag_;
                result.titleId_ = this.titleId_;
                result.specialNameId_ = this.specialNameId_;
                result.attackTargetId_ = this.attackTargetId_;
                if (this.monsterRouteBuilder_ == null) {
                    result.monsterRoute_ = this.monsterRoute_;
                }
                else {
                    result.monsterRoute_ = this.monsterRouteBuilder_.build();
                }
                result.aiConfigId_ = this.aiConfigId_;
                result.levelRouteId_ = this.levelRouteId_;
                result.initPoseId_ = this.initPoseId_;
                result.unk2800JEGLENPDPNI_ = this.unk2800JEGLENPDPNI_;
                result.unk3000CCKJDCBDEKD_ = this.unk3000CCKJDCBDEKD_;
                if (this.contentCase_ == 50) {
                    if (this.fishInfoBuilder_ == null) {
                        result.content_ = this.content_;
                    }
                    else {
                        result.content_ = this.fishInfoBuilder_.build();
                    }
                }
                if (this.contentCase_ == 51) {
                    if (this.fishtankFishInfoBuilder_ == null) {
                        result.content_ = this.content_;
                    }
                    else {
                        result.content_ = this.fishtankFishInfoBuilder_.build();
                    }
                }
                result.contentCase_ = this.contentCase_;
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
                if (other instanceof SceneMonsterInfo) {
                    return this.mergeFrom((SceneMonsterInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SceneMonsterInfo other) {
                if (other == SceneMonsterInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getMonsterId() != 0) {
                    this.setMonsterId(other.getMonsterId());
                }
                if (other.getGroupId() != 0) {
                    this.setGroupId(other.getGroupId());
                }
                if (other.getConfigId() != 0) {
                    this.setConfigId(other.getConfigId());
                }
                if (this.weaponListBuilder_ == null) {
                    if (!other.weaponList_.isEmpty()) {
                        if (this.weaponList_.isEmpty()) {
                            this.weaponList_ = other.weaponList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureWeaponListIsMutable();
                            this.weaponList_.addAll(other.weaponList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.weaponList_.isEmpty()) {
                    if (this.weaponListBuilder_.isEmpty()) {
                        this.weaponListBuilder_.dispose();
                        this.weaponListBuilder_ = null;
                        this.weaponList_ = other.weaponList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.weaponListBuilder_ = (SceneMonsterInfo.alwaysUseFieldBuilders ? this.getWeaponListFieldBuilder() : null);
                    }
                    else {
                        this.weaponListBuilder_.addAllMessages(other.weaponList_);
                    }
                }
                if (other.getAuthorityPeerId() != 0) {
                    this.setAuthorityPeerId(other.getAuthorityPeerId());
                }
                if (!other.affixList_.isEmpty()) {
                    if (this.affixList_.isEmpty()) {
                        this.affixList_ = other.affixList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureAffixListIsMutable();
                        this.affixList_.addAll(other.affixList_);
                    }
                    this.onChanged();
                }
                if (other.getIsElite()) {
                    this.setIsElite(other.getIsElite());
                }
                if (other.getOwnerEntityId() != 0) {
                    this.setOwnerEntityId(other.getOwnerEntityId());
                }
                if (other.getSummonedTag() != 0) {
                    this.setSummonedTag(other.getSummonedTag());
                }
                this.internalGetMutableSummonTagMap().mergeFrom(other.internalGetSummonTagMap());
                if (other.getPoseId() != 0) {
                    this.setPoseId(other.getPoseId());
                }
                if (other.bornType_ != 0) {
                    this.setBornTypeValue(other.getBornTypeValue());
                }
                if (other.getBlockId() != 0) {
                    this.setBlockId(other.getBlockId());
                }
                if (other.getMarkFlag() != 0) {
                    this.setMarkFlag(other.getMarkFlag());
                }
                if (other.getTitleId() != 0) {
                    this.setTitleId(other.getTitleId());
                }
                if (other.getSpecialNameId() != 0) {
                    this.setSpecialNameId(other.getSpecialNameId());
                }
                if (other.getAttackTargetId() != 0) {
                    this.setAttackTargetId(other.getAttackTargetId());
                }
                if (other.hasMonsterRoute()) {
                    this.mergeMonsterRoute(other.getMonsterRoute());
                }
                if (other.getAiConfigId() != 0) {
                    this.setAiConfigId(other.getAiConfigId());
                }
                if (other.getLevelRouteId() != 0) {
                    this.setLevelRouteId(other.getLevelRouteId());
                }
                if (other.getInitPoseId() != 0) {
                    this.setInitPoseId(other.getInitPoseId());
                }
                if (other.getUnk2800JEGLENPDPNI()) {
                    this.setUnk2800JEGLENPDPNI(other.getUnk2800JEGLENPDPNI());
                }
                if (other.getUnk3000CCKJDCBDEKD() != 0) {
                    this.setUnk3000CCKJDCBDEKD(other.getUnk3000CCKJDCBDEKD());
                }
                switch (other.getContentCase()) {
                    case FISH_INFO: {
                        this.mergeFishInfo(other.getFishInfo());
                        break;
                    }
                    case FISHTANK_FISH_INFO: {
                        this.mergeFishtankFishInfo(other.getFishtankFishInfo());
                        break;
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
                SceneMonsterInfo parsedMessage = null;
                try {
                    parsedMessage = SceneMonsterInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SceneMonsterInfo)e.getUnfinishedMessage();
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
            public ContentCase getContentCase() {
                return ContentCase.forNumber(this.contentCase_);
            }
            
            public Builder clearContent() {
                this.contentCase_ = 0;
                this.content_ = null;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMonsterId() {
                return this.monsterId_;
            }
            
            public Builder setMonsterId(final int value) {
                this.monsterId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMonsterId() {
                this.monsterId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getGroupId() {
                return this.groupId_;
            }
            
            public Builder setGroupId(final int value) {
                this.groupId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGroupId() {
                this.groupId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getConfigId() {
                return this.configId_;
            }
            
            public Builder setConfigId(final int value) {
                this.configId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearConfigId() {
                this.configId_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureWeaponListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.weaponList_ = new ArrayList<SceneWeaponInfoOuterClass.SceneWeaponInfo>(this.weaponList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<SceneWeaponInfoOuterClass.SceneWeaponInfo> getWeaponListList() {
                if (this.weaponListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends SceneWeaponInfoOuterClass.SceneWeaponInfo>)this.weaponList_);
                }
                return this.weaponListBuilder_.getMessageList();
            }
            
            @Override
            public int getWeaponListCount() {
                if (this.weaponListBuilder_ == null) {
                    return this.weaponList_.size();
                }
                return this.weaponListBuilder_.getCount();
            }
            
            @Override
            public SceneWeaponInfoOuterClass.SceneWeaponInfo getWeaponList(final int index) {
                if (this.weaponListBuilder_ == null) {
                    return this.weaponList_.get(index);
                }
                return this.weaponListBuilder_.getMessage(index);
            }
            
            public Builder setWeaponList(final int index, final SceneWeaponInfoOuterClass.SceneWeaponInfo value) {
                if (this.weaponListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureWeaponListIsMutable();
                    this.weaponList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.weaponListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setWeaponList(final int index, final SceneWeaponInfoOuterClass.SceneWeaponInfo.Builder builderForValue) {
                if (this.weaponListBuilder_ == null) {
                    this.ensureWeaponListIsMutable();
                    this.weaponList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.weaponListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addWeaponList(final SceneWeaponInfoOuterClass.SceneWeaponInfo value) {
                if (this.weaponListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureWeaponListIsMutable();
                    this.weaponList_.add(value);
                    this.onChanged();
                }
                else {
                    this.weaponListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addWeaponList(final int index, final SceneWeaponInfoOuterClass.SceneWeaponInfo value) {
                if (this.weaponListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureWeaponListIsMutable();
                    this.weaponList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.weaponListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addWeaponList(final SceneWeaponInfoOuterClass.SceneWeaponInfo.Builder builderForValue) {
                if (this.weaponListBuilder_ == null) {
                    this.ensureWeaponListIsMutable();
                    this.weaponList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.weaponListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addWeaponList(final int index, final SceneWeaponInfoOuterClass.SceneWeaponInfo.Builder builderForValue) {
                if (this.weaponListBuilder_ == null) {
                    this.ensureWeaponListIsMutable();
                    this.weaponList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.weaponListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllWeaponList(final Iterable<? extends SceneWeaponInfoOuterClass.SceneWeaponInfo> values) {
                if (this.weaponListBuilder_ == null) {
                    this.ensureWeaponListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.weaponList_);
                    this.onChanged();
                }
                else {
                    this.weaponListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearWeaponList() {
                if (this.weaponListBuilder_ == null) {
                    this.weaponList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.weaponListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeWeaponList(final int index) {
                if (this.weaponListBuilder_ == null) {
                    this.ensureWeaponListIsMutable();
                    this.weaponList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.weaponListBuilder_.remove(index);
                }
                return this;
            }
            
            public SceneWeaponInfoOuterClass.SceneWeaponInfo.Builder getWeaponListBuilder(final int index) {
                return this.getWeaponListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public SceneWeaponInfoOuterClass.SceneWeaponInfoOrBuilder getWeaponListOrBuilder(final int index) {
                if (this.weaponListBuilder_ == null) {
                    return this.weaponList_.get(index);
                }
                return this.weaponListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends SceneWeaponInfoOuterClass.SceneWeaponInfoOrBuilder> getWeaponListOrBuilderList() {
                if (this.weaponListBuilder_ != null) {
                    return this.weaponListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends SceneWeaponInfoOuterClass.SceneWeaponInfoOrBuilder>)this.weaponList_);
            }
            
            public SceneWeaponInfoOuterClass.SceneWeaponInfo.Builder addWeaponListBuilder() {
                return this.getWeaponListFieldBuilder().addBuilder(SceneWeaponInfoOuterClass.SceneWeaponInfo.getDefaultInstance());
            }
            
            public SceneWeaponInfoOuterClass.SceneWeaponInfo.Builder addWeaponListBuilder(final int index) {
                return this.getWeaponListFieldBuilder().addBuilder(index, SceneWeaponInfoOuterClass.SceneWeaponInfo.getDefaultInstance());
            }
            
            public List<SceneWeaponInfoOuterClass.SceneWeaponInfo.Builder> getWeaponListBuilderList() {
                return this.getWeaponListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<SceneWeaponInfoOuterClass.SceneWeaponInfo, SceneWeaponInfoOuterClass.SceneWeaponInfo.Builder, SceneWeaponInfoOuterClass.SceneWeaponInfoOrBuilder> getWeaponListFieldBuilder() {
                if (this.weaponListBuilder_ == null) {
                    this.weaponListBuilder_ = new RepeatedFieldBuilderV3<SceneWeaponInfoOuterClass.SceneWeaponInfo, SceneWeaponInfoOuterClass.SceneWeaponInfo.Builder, SceneWeaponInfoOuterClass.SceneWeaponInfoOrBuilder>(this.weaponList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.weaponList_ = null;
                }
                return this.weaponListBuilder_;
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
            
            private void ensureAffixListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.affixList_ = GeneratedMessageV3.mutableCopy(this.affixList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getAffixListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.affixList_) : this.affixList_;
            }
            
            @Override
            public int getAffixListCount() {
                return this.affixList_.size();
            }
            
            @Override
            public int getAffixList(final int index) {
                return this.affixList_.getInt(index);
            }
            
            public Builder setAffixList(final int index, final int value) {
                this.ensureAffixListIsMutable();
                this.affixList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addAffixList(final int value) {
                this.ensureAffixListIsMutable();
                this.affixList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllAffixList(final Iterable<? extends Integer> values) {
                this.ensureAffixListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.affixList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearAffixList() {
                this.affixList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsElite() {
                return this.isElite_;
            }
            
            public Builder setIsElite(final boolean value) {
                this.isElite_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsElite() {
                this.isElite_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getOwnerEntityId() {
                return this.ownerEntityId_;
            }
            
            public Builder setOwnerEntityId(final int value) {
                this.ownerEntityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearOwnerEntityId() {
                this.ownerEntityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getSummonedTag() {
                return this.summonedTag_;
            }
            
            public Builder setSummonedTag(final int value) {
                this.summonedTag_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSummonedTag() {
                this.summonedTag_ = 0;
                this.onChanged();
                return this;
            }
            
            private MapField<Integer, Integer> internalGetSummonTagMap() {
                if (this.summonTagMap_ == null) {
                    return MapField.emptyMapField(SummonTagMapDefaultEntryHolder.defaultEntry);
                }
                return this.summonTagMap_;
            }
            
            private MapField<Integer, Integer> internalGetMutableSummonTagMap() {
                this.onChanged();
                if (this.summonTagMap_ == null) {
                    this.summonTagMap_ = MapField.newMapField(SummonTagMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.summonTagMap_.isMutable()) {
                    this.summonTagMap_ = this.summonTagMap_.copy();
                }
                return this.summonTagMap_;
            }
            
            @Override
            public int getSummonTagMapCount() {
                return this.internalGetSummonTagMap().getMap().size();
            }
            
            @Override
            public boolean containsSummonTagMap(final int key) {
                return this.internalGetSummonTagMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Integer> getSummonTagMap() {
                return this.getSummonTagMapMap();
            }
            
            @Override
            public Map<Integer, Integer> getSummonTagMapMap() {
                return this.internalGetSummonTagMap().getMap();
            }
            
            @Override
            public int getSummonTagMapOrDefault(final int key, final int defaultValue) {
                final Map<Integer, Integer> map = this.internalGetSummonTagMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public int getSummonTagMapOrThrow(final int key) {
                final Map<Integer, Integer> map = this.internalGetSummonTagMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearSummonTagMap() {
                this.internalGetMutableSummonTagMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeSummonTagMap(final int key) {
                this.internalGetMutableSummonTagMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, Integer> getMutableSummonTagMap() {
                return this.internalGetMutableSummonTagMap().getMutableMap();
            }
            
            public Builder putSummonTagMap(final int key, final int value) {
                this.internalGetMutableSummonTagMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllSummonTagMap(final Map<Integer, Integer> values) {
                this.internalGetMutableSummonTagMap().getMutableMap().putAll(values);
                return this;
            }
            
            @Override
            public int getPoseId() {
                return this.poseId_;
            }
            
            public Builder setPoseId(final int value) {
                this.poseId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPoseId() {
                this.poseId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getBornTypeValue() {
                return this.bornType_;
            }
            
            public Builder setBornTypeValue(final int value) {
                this.bornType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public MonsterBornTypeOuterClass.MonsterBornType getBornType() {
                final MonsterBornTypeOuterClass.MonsterBornType result = MonsterBornTypeOuterClass.MonsterBornType.valueOf(this.bornType_);
                return (result == null) ? MonsterBornTypeOuterClass.MonsterBornType.UNRECOGNIZED : result;
            }
            
            public Builder setBornType(final MonsterBornTypeOuterClass.MonsterBornType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bornType_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearBornType() {
                this.bornType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getBlockId() {
                return this.blockId_;
            }
            
            public Builder setBlockId(final int value) {
                this.blockId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBlockId() {
                this.blockId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMarkFlag() {
                return this.markFlag_;
            }
            
            public Builder setMarkFlag(final int value) {
                this.markFlag_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMarkFlag() {
                this.markFlag_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getTitleId() {
                return this.titleId_;
            }
            
            public Builder setTitleId(final int value) {
                this.titleId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTitleId() {
                this.titleId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getSpecialNameId() {
                return this.specialNameId_;
            }
            
            public Builder setSpecialNameId(final int value) {
                this.specialNameId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSpecialNameId() {
                this.specialNameId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getAttackTargetId() {
                return this.attackTargetId_;
            }
            
            public Builder setAttackTargetId(final int value) {
                this.attackTargetId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAttackTargetId() {
                this.attackTargetId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasMonsterRoute() {
                return this.monsterRouteBuilder_ != null || this.monsterRoute_ != null;
            }
            
            @Override
            public MonsterRouteOuterClass.MonsterRoute getMonsterRoute() {
                if (this.monsterRouteBuilder_ == null) {
                    return (this.monsterRoute_ == null) ? MonsterRouteOuterClass.MonsterRoute.getDefaultInstance() : this.monsterRoute_;
                }
                return this.monsterRouteBuilder_.getMessage();
            }
            
            public Builder setMonsterRoute(final MonsterRouteOuterClass.MonsterRoute value) {
                if (this.monsterRouteBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.monsterRoute_ = value;
                    this.onChanged();
                }
                else {
                    this.monsterRouteBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setMonsterRoute(final MonsterRouteOuterClass.MonsterRoute.Builder builderForValue) {
                if (this.monsterRouteBuilder_ == null) {
                    this.monsterRoute_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.monsterRouteBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeMonsterRoute(final MonsterRouteOuterClass.MonsterRoute value) {
                if (this.monsterRouteBuilder_ == null) {
                    if (this.monsterRoute_ != null) {
                        this.monsterRoute_ = MonsterRouteOuterClass.MonsterRoute.newBuilder(this.monsterRoute_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.monsterRoute_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.monsterRouteBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearMonsterRoute() {
                if (this.monsterRouteBuilder_ == null) {
                    this.monsterRoute_ = null;
                    this.onChanged();
                }
                else {
                    this.monsterRoute_ = null;
                    this.monsterRouteBuilder_ = null;
                }
                return this;
            }
            
            public MonsterRouteOuterClass.MonsterRoute.Builder getMonsterRouteBuilder() {
                this.onChanged();
                return this.getMonsterRouteFieldBuilder().getBuilder();
            }
            
            @Override
            public MonsterRouteOuterClass.MonsterRouteOrBuilder getMonsterRouteOrBuilder() {
                if (this.monsterRouteBuilder_ != null) {
                    return this.monsterRouteBuilder_.getMessageOrBuilder();
                }
                return (this.monsterRoute_ == null) ? MonsterRouteOuterClass.MonsterRoute.getDefaultInstance() : this.monsterRoute_;
            }
            
            private SingleFieldBuilderV3<MonsterRouteOuterClass.MonsterRoute, MonsterRouteOuterClass.MonsterRoute.Builder, MonsterRouteOuterClass.MonsterRouteOrBuilder> getMonsterRouteFieldBuilder() {
                if (this.monsterRouteBuilder_ == null) {
                    this.monsterRouteBuilder_ = new SingleFieldBuilderV3<MonsterRouteOuterClass.MonsterRoute, MonsterRouteOuterClass.MonsterRoute.Builder, MonsterRouteOuterClass.MonsterRouteOrBuilder>(this.getMonsterRoute(), this.getParentForChildren(), this.isClean());
                    this.monsterRoute_ = null;
                }
                return this.monsterRouteBuilder_;
            }
            
            @Override
            public int getAiConfigId() {
                return this.aiConfigId_;
            }
            
            public Builder setAiConfigId(final int value) {
                this.aiConfigId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAiConfigId() {
                this.aiConfigId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getLevelRouteId() {
                return this.levelRouteId_;
            }
            
            public Builder setLevelRouteId(final int value) {
                this.levelRouteId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLevelRouteId() {
                this.levelRouteId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getInitPoseId() {
                return this.initPoseId_;
            }
            
            public Builder setInitPoseId(final int value) {
                this.initPoseId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearInitPoseId() {
                this.initPoseId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getUnk2800JEGLENPDPNI() {
                return this.unk2800JEGLENPDPNI_;
            }
            
            public Builder setUnk2800JEGLENPDPNI(final boolean value) {
                this.unk2800JEGLENPDPNI_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2800JEGLENPDPNI() {
                this.unk2800JEGLENPDPNI_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnk3000CCKJDCBDEKD() {
                return this.unk3000CCKJDCBDEKD_;
            }
            
            public Builder setUnk3000CCKJDCBDEKD(final int value) {
                this.unk3000CCKJDCBDEKD_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk3000CCKJDCBDEKD() {
                this.unk3000CCKJDCBDEKD_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasFishInfo() {
                return this.contentCase_ == 50;
            }
            
            @Override
            public SceneFishInfoOuterClass.SceneFishInfo getFishInfo() {
                if (this.fishInfoBuilder_ == null) {
                    if (this.contentCase_ == 50) {
                        return (SceneFishInfoOuterClass.SceneFishInfo)this.content_;
                    }
                    return SceneFishInfoOuterClass.SceneFishInfo.getDefaultInstance();
                }
                else {
                    if (this.contentCase_ == 50) {
                        return this.fishInfoBuilder_.getMessage();
                    }
                    return SceneFishInfoOuterClass.SceneFishInfo.getDefaultInstance();
                }
            }
            
            public Builder setFishInfo(final SceneFishInfoOuterClass.SceneFishInfo value) {
                if (this.fishInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.content_ = value;
                    this.onChanged();
                }
                else {
                    this.fishInfoBuilder_.setMessage(value);
                }
                this.contentCase_ = 50;
                return this;
            }
            
            public Builder setFishInfo(final SceneFishInfoOuterClass.SceneFishInfo.Builder builderForValue) {
                if (this.fishInfoBuilder_ == null) {
                    this.content_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.fishInfoBuilder_.setMessage(builderForValue.build());
                }
                this.contentCase_ = 50;
                return this;
            }
            
            public Builder mergeFishInfo(final SceneFishInfoOuterClass.SceneFishInfo value) {
                if (this.fishInfoBuilder_ == null) {
                    if (this.contentCase_ == 50 && this.content_ != SceneFishInfoOuterClass.SceneFishInfo.getDefaultInstance()) {
                        this.content_ = SceneFishInfoOuterClass.SceneFishInfo.newBuilder((SceneFishInfoOuterClass.SceneFishInfo)this.content_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.content_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.contentCase_ == 50) {
                        this.fishInfoBuilder_.mergeFrom(value);
                    }
                    this.fishInfoBuilder_.setMessage(value);
                }
                this.contentCase_ = 50;
                return this;
            }
            
            public Builder clearFishInfo() {
                if (this.fishInfoBuilder_ == null) {
                    if (this.contentCase_ == 50) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.contentCase_ == 50) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                    }
                    this.fishInfoBuilder_.clear();
                }
                return this;
            }
            
            public SceneFishInfoOuterClass.SceneFishInfo.Builder getFishInfoBuilder() {
                return this.getFishInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public SceneFishInfoOuterClass.SceneFishInfoOrBuilder getFishInfoOrBuilder() {
                if (this.contentCase_ == 50 && this.fishInfoBuilder_ != null) {
                    return this.fishInfoBuilder_.getMessageOrBuilder();
                }
                if (this.contentCase_ == 50) {
                    return (SceneFishInfoOuterClass.SceneFishInfo)this.content_;
                }
                return SceneFishInfoOuterClass.SceneFishInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<SceneFishInfoOuterClass.SceneFishInfo, SceneFishInfoOuterClass.SceneFishInfo.Builder, SceneFishInfoOuterClass.SceneFishInfoOrBuilder> getFishInfoFieldBuilder() {
                if (this.fishInfoBuilder_ == null) {
                    if (this.contentCase_ != 50) {
                        this.content_ = SceneFishInfoOuterClass.SceneFishInfo.getDefaultInstance();
                    }
                    this.fishInfoBuilder_ = new SingleFieldBuilderV3<SceneFishInfoOuterClass.SceneFishInfo, SceneFishInfoOuterClass.SceneFishInfo.Builder, SceneFishInfoOuterClass.SceneFishInfoOrBuilder>((SceneFishInfoOuterClass.SceneFishInfo)this.content_, this.getParentForChildren(), this.isClean());
                    this.content_ = null;
                }
                this.contentCase_ = 50;
                this.onChanged();
                return this.fishInfoBuilder_;
            }
            
            @Override
            public boolean hasFishtankFishInfo() {
                return this.contentCase_ == 51;
            }
            
            @Override
            public FishtankFishInfoOuterClass.FishtankFishInfo getFishtankFishInfo() {
                if (this.fishtankFishInfoBuilder_ == null) {
                    if (this.contentCase_ == 51) {
                        return (FishtankFishInfoOuterClass.FishtankFishInfo)this.content_;
                    }
                    return FishtankFishInfoOuterClass.FishtankFishInfo.getDefaultInstance();
                }
                else {
                    if (this.contentCase_ == 51) {
                        return this.fishtankFishInfoBuilder_.getMessage();
                    }
                    return FishtankFishInfoOuterClass.FishtankFishInfo.getDefaultInstance();
                }
            }
            
            public Builder setFishtankFishInfo(final FishtankFishInfoOuterClass.FishtankFishInfo value) {
                if (this.fishtankFishInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.content_ = value;
                    this.onChanged();
                }
                else {
                    this.fishtankFishInfoBuilder_.setMessage(value);
                }
                this.contentCase_ = 51;
                return this;
            }
            
            public Builder setFishtankFishInfo(final FishtankFishInfoOuterClass.FishtankFishInfo.Builder builderForValue) {
                if (this.fishtankFishInfoBuilder_ == null) {
                    this.content_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.fishtankFishInfoBuilder_.setMessage(builderForValue.build());
                }
                this.contentCase_ = 51;
                return this;
            }
            
            public Builder mergeFishtankFishInfo(final FishtankFishInfoOuterClass.FishtankFishInfo value) {
                if (this.fishtankFishInfoBuilder_ == null) {
                    if (this.contentCase_ == 51 && this.content_ != FishtankFishInfoOuterClass.FishtankFishInfo.getDefaultInstance()) {
                        this.content_ = FishtankFishInfoOuterClass.FishtankFishInfo.newBuilder((FishtankFishInfoOuterClass.FishtankFishInfo)this.content_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.content_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.contentCase_ == 51) {
                        this.fishtankFishInfoBuilder_.mergeFrom(value);
                    }
                    this.fishtankFishInfoBuilder_.setMessage(value);
                }
                this.contentCase_ = 51;
                return this;
            }
            
            public Builder clearFishtankFishInfo() {
                if (this.fishtankFishInfoBuilder_ == null) {
                    if (this.contentCase_ == 51) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.contentCase_ == 51) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                    }
                    this.fishtankFishInfoBuilder_.clear();
                }
                return this;
            }
            
            public FishtankFishInfoOuterClass.FishtankFishInfo.Builder getFishtankFishInfoBuilder() {
                return this.getFishtankFishInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public FishtankFishInfoOuterClass.FishtankFishInfoOrBuilder getFishtankFishInfoOrBuilder() {
                if (this.contentCase_ == 51 && this.fishtankFishInfoBuilder_ != null) {
                    return this.fishtankFishInfoBuilder_.getMessageOrBuilder();
                }
                if (this.contentCase_ == 51) {
                    return (FishtankFishInfoOuterClass.FishtankFishInfo)this.content_;
                }
                return FishtankFishInfoOuterClass.FishtankFishInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<FishtankFishInfoOuterClass.FishtankFishInfo, FishtankFishInfoOuterClass.FishtankFishInfo.Builder, FishtankFishInfoOuterClass.FishtankFishInfoOrBuilder> getFishtankFishInfoFieldBuilder() {
                if (this.fishtankFishInfoBuilder_ == null) {
                    if (this.contentCase_ != 51) {
                        this.content_ = FishtankFishInfoOuterClass.FishtankFishInfo.getDefaultInstance();
                    }
                    this.fishtankFishInfoBuilder_ = new SingleFieldBuilderV3<FishtankFishInfoOuterClass.FishtankFishInfo, FishtankFishInfoOuterClass.FishtankFishInfo.Builder, FishtankFishInfoOuterClass.FishtankFishInfoOrBuilder>((FishtankFishInfoOuterClass.FishtankFishInfo)this.content_, this.getParentForChildren(), this.isClean());
                    this.content_ = null;
                }
                this.contentCase_ = 51;
                this.onChanged();
                return this.fishtankFishInfoBuilder_;
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
    
    public interface SceneMonsterInfoOrBuilder extends MessageOrBuilder
    {
        int getMonsterId();
        
        int getGroupId();
        
        int getConfigId();
        
        List<SceneWeaponInfoOuterClass.SceneWeaponInfo> getWeaponListList();
        
        SceneWeaponInfoOuterClass.SceneWeaponInfo getWeaponList(final int p0);
        
        int getWeaponListCount();
        
        List<? extends SceneWeaponInfoOuterClass.SceneWeaponInfoOrBuilder> getWeaponListOrBuilderList();
        
        SceneWeaponInfoOuterClass.SceneWeaponInfoOrBuilder getWeaponListOrBuilder(final int p0);
        
        int getAuthorityPeerId();
        
        List<Integer> getAffixListList();
        
        int getAffixListCount();
        
        int getAffixList(final int p0);
        
        boolean getIsElite();
        
        int getOwnerEntityId();
        
        int getSummonedTag();
        
        int getSummonTagMapCount();
        
        boolean containsSummonTagMap(final int p0);
        
        @Deprecated
        Map<Integer, Integer> getSummonTagMap();
        
        Map<Integer, Integer> getSummonTagMapMap();
        
        int getSummonTagMapOrDefault(final int p0, final int p1);
        
        int getSummonTagMapOrThrow(final int p0);
        
        int getPoseId();
        
        int getBornTypeValue();
        
        MonsterBornTypeOuterClass.MonsterBornType getBornType();
        
        int getBlockId();
        
        int getMarkFlag();
        
        int getTitleId();
        
        int getSpecialNameId();
        
        int getAttackTargetId();
        
        boolean hasMonsterRoute();
        
        MonsterRouteOuterClass.MonsterRoute getMonsterRoute();
        
        MonsterRouteOuterClass.MonsterRouteOrBuilder getMonsterRouteOrBuilder();
        
        int getAiConfigId();
        
        int getLevelRouteId();
        
        int getInitPoseId();
        
        boolean getUnk2800JEGLENPDPNI();
        
        int getUnk3000CCKJDCBDEKD();
        
        boolean hasFishInfo();
        
        SceneFishInfoOuterClass.SceneFishInfo getFishInfo();
        
        SceneFishInfoOuterClass.SceneFishInfoOrBuilder getFishInfoOrBuilder();
        
        boolean hasFishtankFishInfo();
        
        FishtankFishInfoOuterClass.FishtankFishInfo getFishtankFishInfo();
        
        FishtankFishInfoOuterClass.FishtankFishInfoOrBuilder getFishtankFishInfoOrBuilder();
        
        SceneMonsterInfo.ContentCase getContentCase();
    }
}
