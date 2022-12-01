// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.RepeatedFieldBuilderV3;
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

public final class ShowAvatarInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_ShowAvatarInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ShowAvatarInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ShowAvatarInfo_PropMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ShowAvatarInfo_PropMapEntry_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ShowAvatarInfo_FightPropMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ShowAvatarInfo_FightPropMapEntry_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ShowAvatarInfo_SkillLevelMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ShowAvatarInfo_SkillLevelMapEntry_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ShowAvatarInfo_ProudSkillExtraLevelMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ShowAvatarInfo_ProudSkillExtraLevelMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ShowAvatarInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ShowAvatarInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0014ShowAvatarInfo.proto\u001a\u0015AvatarExcelInfo.proto\u001a\u0016AvatarFetterInfo.proto\u001a\u000fPropValue.proto\u001a\u000fShowEquip.proto\"\u00fa\u0005\n\u000eShowAvatarInfo\u0012\u0011\n\tavatar_id\u0018\u0001 \u0001(\r\u0012.\n\bprop_map\u0018\u0002 \u0003(\u000b2\u001c.ShowAvatarInfo.PropMapEntry\u0012\u0016\n\u000etalent_id_list\u0018\u0003 \u0003(\r\u00129\n\u000efight_prop_map\u0018\u0004 \u0003(\u000b2!.ShowAvatarInfo.FightPropMapEntry\u0012\u0016\n\u000eskill_depot_id\u0018\u0005 \u0001(\r\u0012\u001e\n\u0016core_proud_skill_level\u0018\u0006 \u0001(\r\u0012!\n\u0019inherent_proud_skill_list\u0018\u0007 \u0003(\r\u0012;\n\u000fskill_level_map\u0018\b \u0003(\u000b2\".ShowAvatarInfo.SkillLevelMapEntry\u0012Q\n\u001bproud_skill_extra_level_map\u0018\t \u0003(\u000b2,.ShowAvatarInfo.ProudSkillExtraLevelMapEntry\u0012\u001e\n\nequip_list\u0018\n \u0003(\u000b2\n.ShowEquip\u0012&\n\u000bfetter_info\u0018\u000b \u0001(\u000b2\u0011.AvatarFetterInfo\u0012\u0012\n\ncostume_id\u0018\f \u0001(\r\u0012$\n\nexcel_info\u0018\r \u0001(\u000b2\u0010.AvatarExcelInfo\u001a:\n\fPropMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\u0019\n\u0005value\u0018\u0002 \u0001(\u000b2\n.PropValue:\u00028\u0001\u001a3\n\u0011FightPropMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\u0002:\u00028\u0001\u001a4\n\u0012SkillLevelMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001\u001a>\n\u001cProudSkillExtraLevelMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ShowAvatarInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AvatarExcelInfoOuterClass.getDescriptor(), AvatarFetterInfoOuterClass.getDescriptor(), PropValueOuterClass.getDescriptor(), ShowEquipOuterClass.getDescriptor() });
        internal_static_ShowAvatarInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ShowAvatarInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ShowAvatarInfoOuterClass.internal_static_ShowAvatarInfo_descriptor, new String[] { "AvatarId", "PropMap", "TalentIdList", "FightPropMap", "SkillDepotId", "CoreProudSkillLevel", "InherentProudSkillList", "SkillLevelMap", "ProudSkillExtraLevelMap", "EquipList", "FetterInfo", "CostumeId", "ExcelInfo" });
        internal_static_ShowAvatarInfo_PropMapEntry_descriptor = ShowAvatarInfoOuterClass.internal_static_ShowAvatarInfo_descriptor.getNestedTypes().get(0);
        internal_static_ShowAvatarInfo_PropMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ShowAvatarInfoOuterClass.internal_static_ShowAvatarInfo_PropMapEntry_descriptor, new String[] { "Key", "Value" });
        internal_static_ShowAvatarInfo_FightPropMapEntry_descriptor = ShowAvatarInfoOuterClass.internal_static_ShowAvatarInfo_descriptor.getNestedTypes().get(1);
        internal_static_ShowAvatarInfo_FightPropMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ShowAvatarInfoOuterClass.internal_static_ShowAvatarInfo_FightPropMapEntry_descriptor, new String[] { "Key", "Value" });
        internal_static_ShowAvatarInfo_SkillLevelMapEntry_descriptor = ShowAvatarInfoOuterClass.internal_static_ShowAvatarInfo_descriptor.getNestedTypes().get(2);
        internal_static_ShowAvatarInfo_SkillLevelMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ShowAvatarInfoOuterClass.internal_static_ShowAvatarInfo_SkillLevelMapEntry_descriptor, new String[] { "Key", "Value" });
        internal_static_ShowAvatarInfo_ProudSkillExtraLevelMapEntry_descriptor = ShowAvatarInfoOuterClass.internal_static_ShowAvatarInfo_descriptor.getNestedTypes().get(3);
        internal_static_ShowAvatarInfo_ProudSkillExtraLevelMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ShowAvatarInfoOuterClass.internal_static_ShowAvatarInfo_ProudSkillExtraLevelMapEntry_descriptor, new String[] { "Key", "Value" });
        AvatarExcelInfoOuterClass.getDescriptor();
        AvatarFetterInfoOuterClass.getDescriptor();
        PropValueOuterClass.getDescriptor();
        ShowEquipOuterClass.getDescriptor();
    }
    
    public static final class ShowAvatarInfo extends GeneratedMessageV3 implements ShowAvatarInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int AVATAR_ID_FIELD_NUMBER = 1;
        private int avatarId_;
        public static final int PROP_MAP_FIELD_NUMBER = 2;
        private MapField<Integer, PropValueOuterClass.PropValue> propMap_;
        public static final int TALENT_ID_LIST_FIELD_NUMBER = 3;
        private Internal.IntList talentIdList_;
        private int talentIdListMemoizedSerializedSize;
        public static final int FIGHT_PROP_MAP_FIELD_NUMBER = 4;
        private MapField<Integer, Float> fightPropMap_;
        public static final int SKILL_DEPOT_ID_FIELD_NUMBER = 5;
        private int skillDepotId_;
        public static final int CORE_PROUD_SKILL_LEVEL_FIELD_NUMBER = 6;
        private int coreProudSkillLevel_;
        public static final int INHERENT_PROUD_SKILL_LIST_FIELD_NUMBER = 7;
        private Internal.IntList inherentProudSkillList_;
        private int inherentProudSkillListMemoizedSerializedSize;
        public static final int SKILL_LEVEL_MAP_FIELD_NUMBER = 8;
        private MapField<Integer, Integer> skillLevelMap_;
        public static final int PROUD_SKILL_EXTRA_LEVEL_MAP_FIELD_NUMBER = 9;
        private MapField<Integer, Integer> proudSkillExtraLevelMap_;
        public static final int EQUIP_LIST_FIELD_NUMBER = 10;
        private List<ShowEquipOuterClass.ShowEquip> equipList_;
        public static final int FETTER_INFO_FIELD_NUMBER = 11;
        private AvatarFetterInfoOuterClass.AvatarFetterInfo fetterInfo_;
        public static final int COSTUME_ID_FIELD_NUMBER = 12;
        private int costumeId_;
        public static final int EXCEL_INFO_FIELD_NUMBER = 13;
        private AvatarExcelInfoOuterClass.AvatarExcelInfo excelInfo_;
        private byte memoizedIsInitialized;
        private static final ShowAvatarInfo DEFAULT_INSTANCE;
        private static final Parser<ShowAvatarInfo> PARSER;
        
        private ShowAvatarInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.talentIdListMemoizedSerializedSize = -1;
            this.inherentProudSkillListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private ShowAvatarInfo() {
            this.talentIdListMemoizedSerializedSize = -1;
            this.inherentProudSkillListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.talentIdList_ = GeneratedMessageV3.emptyIntList();
            this.inherentProudSkillList_ = GeneratedMessageV3.emptyIntList();
            this.equipList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ShowAvatarInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ShowAvatarInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 18: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.propMap_ = MapField.newMapField(PropMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x1;
                            }
                            final MapEntry<Integer, PropValueOuterClass.PropValue> propMap__ = input.readMessage(PropMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.propMap_.getMutableMap().put(propMap__.getKey(), propMap__.getValue());
                            continue;
                        }
                        case 24: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.talentIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.talentIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 26: {
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
                        case 34: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.fightPropMap_ = MapField.newMapField(FightPropMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x4;
                            }
                            final MapEntry<Integer, Float> fightPropMap__ = input.readMessage(FightPropMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.fightPropMap_.getMutableMap().put(fightPropMap__.getKey(), fightPropMap__.getValue());
                            continue;
                        }
                        case 40: {
                            this.skillDepotId_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.coreProudSkillLevel_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            if ((mutable_bitField0_ & 0x8) == 0x0) {
                                this.inherentProudSkillList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x8;
                            }
                            this.inherentProudSkillList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 58: {
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
                        case 66: {
                            if ((mutable_bitField0_ & 0x10) == 0x0) {
                                this.skillLevelMap_ = MapField.newMapField(SkillLevelMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x10;
                            }
                            final MapEntry<Integer, Integer> skillLevelMap__ = input.readMessage(SkillLevelMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.skillLevelMap_.getMutableMap().put(skillLevelMap__.getKey(), skillLevelMap__.getValue());
                            continue;
                        }
                        case 74: {
                            if ((mutable_bitField0_ & 0x20) == 0x0) {
                                this.proudSkillExtraLevelMap_ = MapField.newMapField(ProudSkillExtraLevelMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x20;
                            }
                            final MapEntry<Integer, Integer> proudSkillExtraLevelMap__ = input.readMessage(ProudSkillExtraLevelMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.proudSkillExtraLevelMap_.getMutableMap().put(proudSkillExtraLevelMap__.getKey(), proudSkillExtraLevelMap__.getValue());
                            continue;
                        }
                        case 82: {
                            if ((mutable_bitField0_ & 0x40) == 0x0) {
                                this.equipList_ = new ArrayList<ShowEquipOuterClass.ShowEquip>();
                                mutable_bitField0_ |= 0x40;
                            }
                            this.equipList_.add(input.readMessage(ShowEquipOuterClass.ShowEquip.parser(), extensionRegistry));
                            continue;
                        }
                        case 90: {
                            AvatarFetterInfoOuterClass.AvatarFetterInfo.Builder subBuilder = null;
                            if (this.fetterInfo_ != null) {
                                subBuilder = this.fetterInfo_.toBuilder();
                            }
                            this.fetterInfo_ = input.readMessage(AvatarFetterInfoOuterClass.AvatarFetterInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.fetterInfo_);
                                this.fetterInfo_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 96: {
                            this.costumeId_ = input.readUInt32();
                            continue;
                        }
                        case 106: {
                            AvatarExcelInfoOuterClass.AvatarExcelInfo.Builder subBuilder2 = null;
                            if (this.excelInfo_ != null) {
                                subBuilder2 = this.excelInfo_.toBuilder();
                            }
                            this.excelInfo_ = input.readMessage(AvatarExcelInfoOuterClass.AvatarExcelInfo.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom(this.excelInfo_);
                                this.excelInfo_ = subBuilder2.buildPartial();
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
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.talentIdList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x8) != 0x0) {
                    this.inherentProudSkillList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x40) != 0x0) {
                    this.equipList_ = Collections.unmodifiableList((List<? extends ShowEquipOuterClass.ShowEquip>)this.equipList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ShowAvatarInfoOuterClass.internal_static_ShowAvatarInfo_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 2: {
                    return this.internalGetPropMap();
                }
                case 4: {
                    return this.internalGetFightPropMap();
                }
                case 8: {
                    return this.internalGetSkillLevelMap();
                }
                case 9: {
                    return this.internalGetProudSkillExtraLevelMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ShowAvatarInfoOuterClass.internal_static_ShowAvatarInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ShowAvatarInfo.class, Builder.class);
        }
        
        @Override
        public int getAvatarId() {
            return this.avatarId_;
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
        public int getSkillDepotId() {
            return this.skillDepotId_;
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
        public List<ShowEquipOuterClass.ShowEquip> getEquipListList() {
            return this.equipList_;
        }
        
        @Override
        public List<? extends ShowEquipOuterClass.ShowEquipOrBuilder> getEquipListOrBuilderList() {
            return this.equipList_;
        }
        
        @Override
        public int getEquipListCount() {
            return this.equipList_.size();
        }
        
        @Override
        public ShowEquipOuterClass.ShowEquip getEquipList(final int index) {
            return this.equipList_.get(index);
        }
        
        @Override
        public ShowEquipOuterClass.ShowEquipOrBuilder getEquipListOrBuilder(final int index) {
            return this.equipList_.get(index);
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
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetPropMap(), PropMapDefaultEntryHolder.defaultEntry, 2);
            if (this.getTalentIdListList().size() > 0) {
                output.writeUInt32NoTag(26);
                output.writeUInt32NoTag(this.talentIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.talentIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.talentIdList_.getInt(i));
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetFightPropMap(), FightPropMapDefaultEntryHolder.defaultEntry, 4);
            if (this.skillDepotId_ != 0) {
                output.writeUInt32(5, this.skillDepotId_);
            }
            if (this.coreProudSkillLevel_ != 0) {
                output.writeUInt32(6, this.coreProudSkillLevel_);
            }
            if (this.getInherentProudSkillListList().size() > 0) {
                output.writeUInt32NoTag(58);
                output.writeUInt32NoTag(this.inherentProudSkillListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.inherentProudSkillList_.size(); ++i) {
                output.writeUInt32NoTag(this.inherentProudSkillList_.getInt(i));
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetSkillLevelMap(), SkillLevelMapDefaultEntryHolder.defaultEntry, 8);
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetProudSkillExtraLevelMap(), ProudSkillExtraLevelMapDefaultEntryHolder.defaultEntry, 9);
            for (int i = 0; i < this.equipList_.size(); ++i) {
                output.writeMessage(10, this.equipList_.get(i));
            }
            if (this.fetterInfo_ != null) {
                output.writeMessage(11, this.getFetterInfo());
            }
            if (this.costumeId_ != 0) {
                output.writeUInt32(12, this.costumeId_);
            }
            if (this.excelInfo_ != null) {
                output.writeMessage(13, this.getExcelInfo());
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
            for (final Map.Entry<Integer, PropValueOuterClass.PropValue> entry : this.internalGetPropMap().getMap().entrySet()) {
                final MapEntry<Integer, PropValueOuterClass.PropValue> propMap__ = PropMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(2, propMap__);
            }
            int dataSize = 0;
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
                size += CodedOutputStream.computeMessageSize(4, fightPropMap__);
            }
            if (this.skillDepotId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.skillDepotId_);
            }
            if (this.coreProudSkillLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.coreProudSkillLevel_);
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
            for (final Map.Entry<Integer, Integer> entry3 : this.internalGetSkillLevelMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> skillLevelMap__ = SkillLevelMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry3.getKey()).setValue(entry3.getValue()).build();
                size += CodedOutputStream.computeMessageSize(8, skillLevelMap__);
            }
            for (final Map.Entry<Integer, Integer> entry3 : this.internalGetProudSkillExtraLevelMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> proudSkillExtraLevelMap__ = ProudSkillExtraLevelMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry3.getKey()).setValue(entry3.getValue()).build();
                size += CodedOutputStream.computeMessageSize(9, proudSkillExtraLevelMap__);
            }
            for (int j = 0; j < this.equipList_.size(); ++j) {
                size += CodedOutputStream.computeMessageSize(10, this.equipList_.get(j));
            }
            if (this.fetterInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(11, this.getFetterInfo());
            }
            if (this.costumeId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.costumeId_);
            }
            if (this.excelInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(13, this.getExcelInfo());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShowAvatarInfo)) {
                return super.equals(obj);
            }
            final ShowAvatarInfo other = (ShowAvatarInfo)obj;
            return this.getAvatarId() == other.getAvatarId() && this.internalGetPropMap().equals(other.internalGetPropMap()) && this.getTalentIdListList().equals(other.getTalentIdListList()) && this.internalGetFightPropMap().equals(other.internalGetFightPropMap()) && this.getSkillDepotId() == other.getSkillDepotId() && this.getCoreProudSkillLevel() == other.getCoreProudSkillLevel() && this.getInherentProudSkillListList().equals(other.getInherentProudSkillListList()) && this.internalGetSkillLevelMap().equals(other.internalGetSkillLevelMap()) && this.internalGetProudSkillExtraLevelMap().equals(other.internalGetProudSkillExtraLevelMap()) && this.getEquipListList().equals(other.getEquipListList()) && this.hasFetterInfo() == other.hasFetterInfo() && (!this.hasFetterInfo() || this.getFetterInfo().equals(other.getFetterInfo())) && this.getCostumeId() == other.getCostumeId() && this.hasExcelInfo() == other.hasExcelInfo() && (!this.hasExcelInfo() || this.getExcelInfo().equals(other.getExcelInfo())) && this.unknownFields.equals(other.unknownFields);
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
            if (!this.internalGetPropMap().getMap().isEmpty()) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.internalGetPropMap().hashCode();
            }
            if (this.getTalentIdListCount() > 0) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getTalentIdListList().hashCode();
            }
            if (!this.internalGetFightPropMap().getMap().isEmpty()) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.internalGetFightPropMap().hashCode();
            }
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getSkillDepotId();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getCoreProudSkillLevel();
            if (this.getInherentProudSkillListCount() > 0) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.getInherentProudSkillListList().hashCode();
            }
            if (!this.internalGetSkillLevelMap().getMap().isEmpty()) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.internalGetSkillLevelMap().hashCode();
            }
            if (!this.internalGetProudSkillExtraLevelMap().getMap().isEmpty()) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.internalGetProudSkillExtraLevelMap().hashCode();
            }
            if (this.getEquipListCount() > 0) {
                hash = 37 * hash + 10;
                hash = 53 * hash + this.getEquipListList().hashCode();
            }
            if (this.hasFetterInfo()) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.getFetterInfo().hashCode();
            }
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getCostumeId();
            if (this.hasExcelInfo()) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.getExcelInfo().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ShowAvatarInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ShowAvatarInfo.PARSER.parseFrom(data);
        }
        
        public static ShowAvatarInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ShowAvatarInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ShowAvatarInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ShowAvatarInfo.PARSER.parseFrom(data);
        }
        
        public static ShowAvatarInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ShowAvatarInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ShowAvatarInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ShowAvatarInfo.PARSER.parseFrom(data);
        }
        
        public static ShowAvatarInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ShowAvatarInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ShowAvatarInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ShowAvatarInfo.PARSER, input);
        }
        
        public static ShowAvatarInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ShowAvatarInfo.PARSER, input, extensionRegistry);
        }
        
        public static ShowAvatarInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ShowAvatarInfo.PARSER, input);
        }
        
        public static ShowAvatarInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ShowAvatarInfo.PARSER, input, extensionRegistry);
        }
        
        public static ShowAvatarInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ShowAvatarInfo.PARSER, input);
        }
        
        public static ShowAvatarInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ShowAvatarInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ShowAvatarInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ShowAvatarInfo prototype) {
            return ShowAvatarInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ShowAvatarInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ShowAvatarInfo getDefaultInstance() {
            return ShowAvatarInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<ShowAvatarInfo> parser() {
            return ShowAvatarInfo.PARSER;
        }
        
        @Override
        public Parser<ShowAvatarInfo> getParserForType() {
            return ShowAvatarInfo.PARSER;
        }
        
        @Override
        public ShowAvatarInfo getDefaultInstanceForType() {
            return ShowAvatarInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ShowAvatarInfo();
            PARSER = new AbstractParser<ShowAvatarInfo>() {
                @Override
                public ShowAvatarInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ShowAvatarInfo(input, extensionRegistry);
                }
            };
        }
        
        private static final class PropMapDefaultEntryHolder
        {
            static final MapEntry<Integer, PropValueOuterClass.PropValue> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(ShowAvatarInfoOuterClass.internal_static_ShowAvatarInfo_PropMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.MESSAGE, PropValueOuterClass.PropValue.getDefaultInstance());
            }
        }
        
        private static final class FightPropMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Float> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(ShowAvatarInfoOuterClass.internal_static_ShowAvatarInfo_FightPropMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.FLOAT, 0.0f);
            }
        }
        
        private static final class SkillLevelMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(ShowAvatarInfoOuterClass.internal_static_ShowAvatarInfo_SkillLevelMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        private static final class ProudSkillExtraLevelMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(ShowAvatarInfoOuterClass.internal_static_ShowAvatarInfo_ProudSkillExtraLevelMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ShowAvatarInfoOrBuilder
        {
            private int bitField0_;
            private int avatarId_;
            private MapField<Integer, PropValueOuterClass.PropValue> propMap_;
            private Internal.IntList talentIdList_;
            private MapField<Integer, Float> fightPropMap_;
            private int skillDepotId_;
            private int coreProudSkillLevel_;
            private Internal.IntList inherentProudSkillList_;
            private MapField<Integer, Integer> skillLevelMap_;
            private MapField<Integer, Integer> proudSkillExtraLevelMap_;
            private List<ShowEquipOuterClass.ShowEquip> equipList_;
            private RepeatedFieldBuilderV3<ShowEquipOuterClass.ShowEquip, ShowEquipOuterClass.ShowEquip.Builder, ShowEquipOuterClass.ShowEquipOrBuilder> equipListBuilder_;
            private AvatarFetterInfoOuterClass.AvatarFetterInfo fetterInfo_;
            private SingleFieldBuilderV3<AvatarFetterInfoOuterClass.AvatarFetterInfo, AvatarFetterInfoOuterClass.AvatarFetterInfo.Builder, AvatarFetterInfoOuterClass.AvatarFetterInfoOrBuilder> fetterInfoBuilder_;
            private int costumeId_;
            private AvatarExcelInfoOuterClass.AvatarExcelInfo excelInfo_;
            private SingleFieldBuilderV3<AvatarExcelInfoOuterClass.AvatarExcelInfo, AvatarExcelInfoOuterClass.AvatarExcelInfo.Builder, AvatarExcelInfoOuterClass.AvatarExcelInfoOrBuilder> excelInfoBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ShowAvatarInfoOuterClass.internal_static_ShowAvatarInfo_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 2: {
                        return this.internalGetPropMap();
                    }
                    case 4: {
                        return this.internalGetFightPropMap();
                    }
                    case 8: {
                        return this.internalGetSkillLevelMap();
                    }
                    case 9: {
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
                    case 2: {
                        return this.internalGetMutablePropMap();
                    }
                    case 4: {
                        return this.internalGetMutableFightPropMap();
                    }
                    case 8: {
                        return this.internalGetMutableSkillLevelMap();
                    }
                    case 9: {
                        return this.internalGetMutableProudSkillExtraLevelMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ShowAvatarInfoOuterClass.internal_static_ShowAvatarInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ShowAvatarInfo.class, Builder.class);
            }
            
            private Builder() {
                this.talentIdList_ = GeneratedMessageV3.emptyIntList();
                this.inherentProudSkillList_ = GeneratedMessageV3.emptyIntList();
                this.equipList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.talentIdList_ = GeneratedMessageV3.emptyIntList();
                this.inherentProudSkillList_ = GeneratedMessageV3.emptyIntList();
                this.equipList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ShowAvatarInfo.alwaysUseFieldBuilders) {
                    this.getEquipListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.avatarId_ = 0;
                this.internalGetMutablePropMap().clear();
                this.talentIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.internalGetMutableFightPropMap().clear();
                this.skillDepotId_ = 0;
                this.coreProudSkillLevel_ = 0;
                this.inherentProudSkillList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFF7;
                this.internalGetMutableSkillLevelMap().clear();
                this.internalGetMutableProudSkillExtraLevelMap().clear();
                if (this.equipListBuilder_ == null) {
                    this.equipList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFBF;
                }
                else {
                    this.equipListBuilder_.clear();
                }
                if (this.fetterInfoBuilder_ == null) {
                    this.fetterInfo_ = null;
                }
                else {
                    this.fetterInfo_ = null;
                    this.fetterInfoBuilder_ = null;
                }
                this.costumeId_ = 0;
                if (this.excelInfoBuilder_ == null) {
                    this.excelInfo_ = null;
                }
                else {
                    this.excelInfo_ = null;
                    this.excelInfoBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ShowAvatarInfoOuterClass.internal_static_ShowAvatarInfo_descriptor;
            }
            
            @Override
            public ShowAvatarInfo getDefaultInstanceForType() {
                return ShowAvatarInfo.getDefaultInstance();
            }
            
            @Override
            public ShowAvatarInfo build() {
                final ShowAvatarInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ShowAvatarInfo buildPartial() {
                final ShowAvatarInfo result = new ShowAvatarInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.avatarId_ = this.avatarId_;
                (result.propMap_ = this.internalGetPropMap()).makeImmutable();
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.talentIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.talentIdList_ = this.talentIdList_;
                (result.fightPropMap_ = this.internalGetFightPropMap()).makeImmutable();
                result.skillDepotId_ = this.skillDepotId_;
                result.coreProudSkillLevel_ = this.coreProudSkillLevel_;
                if ((this.bitField0_ & 0x8) != 0x0) {
                    this.inherentProudSkillList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFF7;
                }
                result.inherentProudSkillList_ = this.inherentProudSkillList_;
                (result.skillLevelMap_ = this.internalGetSkillLevelMap()).makeImmutable();
                (result.proudSkillExtraLevelMap_ = this.internalGetProudSkillExtraLevelMap()).makeImmutable();
                if (this.equipListBuilder_ == null) {
                    if ((this.bitField0_ & 0x40) != 0x0) {
                        this.equipList_ = Collections.unmodifiableList((List<? extends ShowEquipOuterClass.ShowEquip>)this.equipList_);
                        this.bitField0_ &= 0xFFFFFFBF;
                    }
                    result.equipList_ = this.equipList_;
                }
                else {
                    result.equipList_ = this.equipListBuilder_.build();
                }
                if (this.fetterInfoBuilder_ == null) {
                    result.fetterInfo_ = this.fetterInfo_;
                }
                else {
                    result.fetterInfo_ = this.fetterInfoBuilder_.build();
                }
                result.costumeId_ = this.costumeId_;
                if (this.excelInfoBuilder_ == null) {
                    result.excelInfo_ = this.excelInfo_;
                }
                else {
                    result.excelInfo_ = this.excelInfoBuilder_.build();
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
                if (other instanceof ShowAvatarInfo) {
                    return this.mergeFrom((ShowAvatarInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ShowAvatarInfo other) {
                if (other == ShowAvatarInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getAvatarId() != 0) {
                    this.setAvatarId(other.getAvatarId());
                }
                this.internalGetMutablePropMap().mergeFrom(other.internalGetPropMap());
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
                this.internalGetMutableFightPropMap().mergeFrom(other.internalGetFightPropMap());
                if (other.getSkillDepotId() != 0) {
                    this.setSkillDepotId(other.getSkillDepotId());
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
                if (this.equipListBuilder_ == null) {
                    if (!other.equipList_.isEmpty()) {
                        if (this.equipList_.isEmpty()) {
                            this.equipList_ = other.equipList_;
                            this.bitField0_ &= 0xFFFFFFBF;
                        }
                        else {
                            this.ensureEquipListIsMutable();
                            this.equipList_.addAll(other.equipList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.equipList_.isEmpty()) {
                    if (this.equipListBuilder_.isEmpty()) {
                        this.equipListBuilder_.dispose();
                        this.equipListBuilder_ = null;
                        this.equipList_ = other.equipList_;
                        this.bitField0_ &= 0xFFFFFFBF;
                        this.equipListBuilder_ = (ShowAvatarInfo.alwaysUseFieldBuilders ? this.getEquipListFieldBuilder() : null);
                    }
                    else {
                        this.equipListBuilder_.addAllMessages(other.equipList_);
                    }
                }
                if (other.hasFetterInfo()) {
                    this.mergeFetterInfo(other.getFetterInfo());
                }
                if (other.getCostumeId() != 0) {
                    this.setCostumeId(other.getCostumeId());
                }
                if (other.hasExcelInfo()) {
                    this.mergeExcelInfo(other.getExcelInfo());
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
                ShowAvatarInfo parsedMessage = null;
                try {
                    parsedMessage = ShowAvatarInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ShowAvatarInfo)e.getUnfinishedMessage();
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
            
            private void ensureEquipListIsMutable() {
                if ((this.bitField0_ & 0x40) == 0x0) {
                    this.equipList_ = new ArrayList<ShowEquipOuterClass.ShowEquip>(this.equipList_);
                    this.bitField0_ |= 0x40;
                }
            }
            
            @Override
            public List<ShowEquipOuterClass.ShowEquip> getEquipListList() {
                if (this.equipListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ShowEquipOuterClass.ShowEquip>)this.equipList_);
                }
                return this.equipListBuilder_.getMessageList();
            }
            
            @Override
            public int getEquipListCount() {
                if (this.equipListBuilder_ == null) {
                    return this.equipList_.size();
                }
                return this.equipListBuilder_.getCount();
            }
            
            @Override
            public ShowEquipOuterClass.ShowEquip getEquipList(final int index) {
                if (this.equipListBuilder_ == null) {
                    return this.equipList_.get(index);
                }
                return this.equipListBuilder_.getMessage(index);
            }
            
            public Builder setEquipList(final int index, final ShowEquipOuterClass.ShowEquip value) {
                if (this.equipListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureEquipListIsMutable();
                    this.equipList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.equipListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setEquipList(final int index, final ShowEquipOuterClass.ShowEquip.Builder builderForValue) {
                if (this.equipListBuilder_ == null) {
                    this.ensureEquipListIsMutable();
                    this.equipList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.equipListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addEquipList(final ShowEquipOuterClass.ShowEquip value) {
                if (this.equipListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureEquipListIsMutable();
                    this.equipList_.add(value);
                    this.onChanged();
                }
                else {
                    this.equipListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addEquipList(final int index, final ShowEquipOuterClass.ShowEquip value) {
                if (this.equipListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureEquipListIsMutable();
                    this.equipList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.equipListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addEquipList(final ShowEquipOuterClass.ShowEquip.Builder builderForValue) {
                if (this.equipListBuilder_ == null) {
                    this.ensureEquipListIsMutable();
                    this.equipList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.equipListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addEquipList(final int index, final ShowEquipOuterClass.ShowEquip.Builder builderForValue) {
                if (this.equipListBuilder_ == null) {
                    this.ensureEquipListIsMutable();
                    this.equipList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.equipListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllEquipList(final Iterable<? extends ShowEquipOuterClass.ShowEquip> values) {
                if (this.equipListBuilder_ == null) {
                    this.ensureEquipListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.equipList_);
                    this.onChanged();
                }
                else {
                    this.equipListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearEquipList() {
                if (this.equipListBuilder_ == null) {
                    this.equipList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFBF;
                    this.onChanged();
                }
                else {
                    this.equipListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeEquipList(final int index) {
                if (this.equipListBuilder_ == null) {
                    this.ensureEquipListIsMutable();
                    this.equipList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.equipListBuilder_.remove(index);
                }
                return this;
            }
            
            public ShowEquipOuterClass.ShowEquip.Builder getEquipListBuilder(final int index) {
                return this.getEquipListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ShowEquipOuterClass.ShowEquipOrBuilder getEquipListOrBuilder(final int index) {
                if (this.equipListBuilder_ == null) {
                    return this.equipList_.get(index);
                }
                return this.equipListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ShowEquipOuterClass.ShowEquipOrBuilder> getEquipListOrBuilderList() {
                if (this.equipListBuilder_ != null) {
                    return this.equipListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ShowEquipOuterClass.ShowEquipOrBuilder>)this.equipList_);
            }
            
            public ShowEquipOuterClass.ShowEquip.Builder addEquipListBuilder() {
                return this.getEquipListFieldBuilder().addBuilder(ShowEquipOuterClass.ShowEquip.getDefaultInstance());
            }
            
            public ShowEquipOuterClass.ShowEquip.Builder addEquipListBuilder(final int index) {
                return this.getEquipListFieldBuilder().addBuilder(index, ShowEquipOuterClass.ShowEquip.getDefaultInstance());
            }
            
            public List<ShowEquipOuterClass.ShowEquip.Builder> getEquipListBuilderList() {
                return this.getEquipListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ShowEquipOuterClass.ShowEquip, ShowEquipOuterClass.ShowEquip.Builder, ShowEquipOuterClass.ShowEquipOrBuilder> getEquipListFieldBuilder() {
                if (this.equipListBuilder_ == null) {
                    this.equipListBuilder_ = new RepeatedFieldBuilderV3<ShowEquipOuterClass.ShowEquip, ShowEquipOuterClass.ShowEquip.Builder, ShowEquipOuterClass.ShowEquipOrBuilder>(this.equipList_, (this.bitField0_ & 0x40) != 0x0, this.getParentForChildren(), this.isClean());
                    this.equipList_ = null;
                }
                return this.equipListBuilder_;
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface ShowAvatarInfoOrBuilder extends MessageOrBuilder
    {
        int getAvatarId();
        
        int getPropMapCount();
        
        boolean containsPropMap(final int p0);
        
        @Deprecated
        Map<Integer, PropValueOuterClass.PropValue> getPropMap();
        
        Map<Integer, PropValueOuterClass.PropValue> getPropMapMap();
        
        PropValueOuterClass.PropValue getPropMapOrDefault(final int p0, final PropValueOuterClass.PropValue p1);
        
        PropValueOuterClass.PropValue getPropMapOrThrow(final int p0);
        
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
        
        int getSkillDepotId();
        
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
        
        List<ShowEquipOuterClass.ShowEquip> getEquipListList();
        
        ShowEquipOuterClass.ShowEquip getEquipList(final int p0);
        
        int getEquipListCount();
        
        List<? extends ShowEquipOuterClass.ShowEquipOrBuilder> getEquipListOrBuilderList();
        
        ShowEquipOuterClass.ShowEquipOrBuilder getEquipListOrBuilder(final int p0);
        
        boolean hasFetterInfo();
        
        AvatarFetterInfoOuterClass.AvatarFetterInfo getFetterInfo();
        
        AvatarFetterInfoOuterClass.AvatarFetterInfoOrBuilder getFetterInfoOrBuilder();
        
        int getCostumeId();
        
        boolean hasExcelInfo();
        
        AvatarExcelInfoOuterClass.AvatarExcelInfo getExcelInfo();
        
        AvatarExcelInfoOuterClass.AvatarExcelInfoOrBuilder getExcelInfoOrBuilder();
    }
}
