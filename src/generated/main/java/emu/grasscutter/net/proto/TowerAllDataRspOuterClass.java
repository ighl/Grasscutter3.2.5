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
import com.google.protobuf.Internal;
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
import com.google.protobuf.MapField;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class TowerAllDataRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_TowerAllDataRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TowerAllDataRsp_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_TowerAllDataRsp_SkipFloorGrantedRewardItemMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TowerAllDataRsp_SkipFloorGrantedRewardItemMapEntry_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_TowerAllDataRsp_FloorOpenTimeMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TowerAllDataRsp_FloorOpenTimeMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TowerAllDataRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TowerAllDataRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015TowerAllDataRsp.proto\u001a\u0019TowerCurLevelRecord.proto\u001a\u0016TowerFloorRecord.proto\u001a\u0017TowerMonthlyBrief.proto\"¼\u0006\n\u000fTowerAllDataRsp\u0012\u0019\n\u0011tower_schedule_id\u0018\n \u0001(\r\u0012\u0019\n\u0011daily_level_index\u0018\t \u0001(\r\u0012_\n\"skip_floor_granted_reward_item_map\u0018\f \u0003(\u000b23.TowerAllDataRsp.SkipFloorGrantedRewardItemMapEntry\u0012\u0019\n\u0011is_first_interact\u0018\u0003 \u0001(\b\u0012\"\n\u001ais_finished_entrance_floor\u0018\u0001 \u0001(\b\u00122\n\u0017tower_floor_record_list\u0018\u0005 \u0003(\u000b2\u0011.TowerFloorRecord\u0012\u0016\n\u000edaily_floor_id\u0018\u000b \u0001(\r\u0012\u001f\n\u0017commemorative_reward_id\u0018\r \u0001(\r\u00128\n\u001blast_schedule_monthly_brief\u0018\u00c6\t \u0001(\u000b2\u0012.TowerMonthlyBrief\u0012!\n\u0019next_schedule_change_time\u0018\u0006 \u0001(\r\u0012\u001e\n\u0016valid_tower_record_num\u0018\u0007 \u0001(\r\u0012\u001b\n\u0013skip_to_floor_index\u0018\u0002 \u0001(\r\u0012C\n\u0013floor_open_time_map\u0018\u0004 \u0003(\u000b2&.TowerAllDataRsp.FloorOpenTimeMapEntry\u0012.\n\u0010cur_level_record\u0018\u000f \u0001(\u000b2\u0014.TowerCurLevelRecord\u0012\u000f\n\u0007retcode\u0018\b \u0001(\u0005\u0012\u001c\n\u0013schedule_start_time\u0018\u0092\u0007 \u0001(\r\u0012)\n\rmonthly_brief\u0018\u000e \u0001(\u000b2\u0012.TowerMonthlyBrief\u001aD\n\"SkipFloorGrantedRewardItemMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001\u001a7\n\u0015FloorOpenTimeMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TowerAllDataRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { TowerCurLevelRecordOuterClass.getDescriptor(), TowerFloorRecordOuterClass.getDescriptor(), TowerMonthlyBriefOuterClass.getDescriptor() });
        internal_static_TowerAllDataRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TowerAllDataRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TowerAllDataRspOuterClass.internal_static_TowerAllDataRsp_descriptor, new String[] { "TowerScheduleId", "DailyLevelIndex", "SkipFloorGrantedRewardItemMap", "IsFirstInteract", "IsFinishedEntranceFloor", "TowerFloorRecordList", "DailyFloorId", "CommemorativeRewardId", "LastScheduleMonthlyBrief", "NextScheduleChangeTime", "ValidTowerRecordNum", "SkipToFloorIndex", "FloorOpenTimeMap", "CurLevelRecord", "Retcode", "ScheduleStartTime", "MonthlyBrief" });
        internal_static_TowerAllDataRsp_SkipFloorGrantedRewardItemMapEntry_descriptor = TowerAllDataRspOuterClass.internal_static_TowerAllDataRsp_descriptor.getNestedTypes().get(0);
        internal_static_TowerAllDataRsp_SkipFloorGrantedRewardItemMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TowerAllDataRspOuterClass.internal_static_TowerAllDataRsp_SkipFloorGrantedRewardItemMapEntry_descriptor, new String[] { "Key", "Value" });
        internal_static_TowerAllDataRsp_FloorOpenTimeMapEntry_descriptor = TowerAllDataRspOuterClass.internal_static_TowerAllDataRsp_descriptor.getNestedTypes().get(1);
        internal_static_TowerAllDataRsp_FloorOpenTimeMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TowerAllDataRspOuterClass.internal_static_TowerAllDataRsp_FloorOpenTimeMapEntry_descriptor, new String[] { "Key", "Value" });
        TowerCurLevelRecordOuterClass.getDescriptor();
        TowerFloorRecordOuterClass.getDescriptor();
        TowerMonthlyBriefOuterClass.getDescriptor();
    }
    
    public static final class TowerAllDataRsp extends GeneratedMessageV3 implements TowerAllDataRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int TOWER_SCHEDULE_ID_FIELD_NUMBER = 10;
        private int towerScheduleId_;
        public static final int DAILY_LEVEL_INDEX_FIELD_NUMBER = 9;
        private int dailyLevelIndex_;
        public static final int SKIP_FLOOR_GRANTED_REWARD_ITEM_MAP_FIELD_NUMBER = 12;
        private MapField<Integer, Integer> skipFloorGrantedRewardItemMap_;
        public static final int IS_FIRST_INTERACT_FIELD_NUMBER = 3;
        private boolean isFirstInteract_;
        public static final int IS_FINISHED_ENTRANCE_FLOOR_FIELD_NUMBER = 1;
        private boolean isFinishedEntranceFloor_;
        public static final int TOWER_FLOOR_RECORD_LIST_FIELD_NUMBER = 5;
        private List<TowerFloorRecordOuterClass.TowerFloorRecord> towerFloorRecordList_;
        public static final int DAILY_FLOOR_ID_FIELD_NUMBER = 11;
        private int dailyFloorId_;
        public static final int COMMEMORATIVE_REWARD_ID_FIELD_NUMBER = 13;
        private int commemorativeRewardId_;
        public static final int LAST_SCHEDULE_MONTHLY_BRIEF_FIELD_NUMBER = 1222;
        private TowerMonthlyBriefOuterClass.TowerMonthlyBrief lastScheduleMonthlyBrief_;
        public static final int NEXT_SCHEDULE_CHANGE_TIME_FIELD_NUMBER = 6;
        private int nextScheduleChangeTime_;
        public static final int VALID_TOWER_RECORD_NUM_FIELD_NUMBER = 7;
        private int validTowerRecordNum_;
        public static final int SKIP_TO_FLOOR_INDEX_FIELD_NUMBER = 2;
        private int skipToFloorIndex_;
        public static final int FLOOR_OPEN_TIME_MAP_FIELD_NUMBER = 4;
        private MapField<Integer, Integer> floorOpenTimeMap_;
        public static final int CUR_LEVEL_RECORD_FIELD_NUMBER = 15;
        private TowerCurLevelRecordOuterClass.TowerCurLevelRecord curLevelRecord_;
        public static final int RETCODE_FIELD_NUMBER = 8;
        private int retcode_;
        public static final int SCHEDULE_START_TIME_FIELD_NUMBER = 914;
        private int scheduleStartTime_;
        public static final int MONTHLY_BRIEF_FIELD_NUMBER = 14;
        private TowerMonthlyBriefOuterClass.TowerMonthlyBrief monthlyBrief_;
        private byte memoizedIsInitialized;
        private static final TowerAllDataRsp DEFAULT_INSTANCE;
        private static final Parser<TowerAllDataRsp> PARSER;
        
        private TowerAllDataRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private TowerAllDataRsp() {
            this.memoizedIsInitialized = -1;
            this.towerFloorRecordList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TowerAllDataRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TowerAllDataRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.isFinishedEntranceFloor_ = input.readBool();
                            continue;
                        }
                        case 16: {
                            this.skipToFloorIndex_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.isFirstInteract_ = input.readBool();
                            continue;
                        }
                        case 34: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.floorOpenTimeMap_ = MapField.newMapField(FloorOpenTimeMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x4;
                            }
                            final MapEntry<Integer, Integer> floorOpenTimeMap__ = input.readMessage(FloorOpenTimeMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.floorOpenTimeMap_.getMutableMap().put(floorOpenTimeMap__.getKey(), floorOpenTimeMap__.getValue());
                            continue;
                        }
                        case 42: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.towerFloorRecordList_ = new ArrayList<TowerFloorRecordOuterClass.TowerFloorRecord>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.towerFloorRecordList_.add(input.readMessage(TowerFloorRecordOuterClass.TowerFloorRecord.parser(), extensionRegistry));
                            continue;
                        }
                        case 48: {
                            this.nextScheduleChangeTime_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            this.validTowerRecordNum_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 72: {
                            this.dailyLevelIndex_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
                            this.towerScheduleId_ = input.readUInt32();
                            continue;
                        }
                        case 88: {
                            this.dailyFloorId_ = input.readUInt32();
                            continue;
                        }
                        case 98: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.skipFloorGrantedRewardItemMap_ = MapField.newMapField(SkipFloorGrantedRewardItemMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x1;
                            }
                            final MapEntry<Integer, Integer> skipFloorGrantedRewardItemMap__ = input.readMessage(SkipFloorGrantedRewardItemMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.skipFloorGrantedRewardItemMap_.getMutableMap().put(skipFloorGrantedRewardItemMap__.getKey(), skipFloorGrantedRewardItemMap__.getValue());
                            continue;
                        }
                        case 104: {
                            this.commemorativeRewardId_ = input.readUInt32();
                            continue;
                        }
                        case 114: {
                            TowerMonthlyBriefOuterClass.TowerMonthlyBrief.Builder subBuilder = null;
                            if (this.monthlyBrief_ != null) {
                                subBuilder = this.monthlyBrief_.toBuilder();
                            }
                            this.monthlyBrief_ = input.readMessage(TowerMonthlyBriefOuterClass.TowerMonthlyBrief.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.monthlyBrief_);
                                this.monthlyBrief_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 122: {
                            TowerCurLevelRecordOuterClass.TowerCurLevelRecord.Builder subBuilder2 = null;
                            if (this.curLevelRecord_ != null) {
                                subBuilder2 = this.curLevelRecord_.toBuilder();
                            }
                            this.curLevelRecord_ = input.readMessage(TowerCurLevelRecordOuterClass.TowerCurLevelRecord.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom(this.curLevelRecord_);
                                this.curLevelRecord_ = subBuilder2.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 7312: {
                            this.scheduleStartTime_ = input.readUInt32();
                            continue;
                        }
                        case 9778: {
                            TowerMonthlyBriefOuterClass.TowerMonthlyBrief.Builder subBuilder = null;
                            if (this.lastScheduleMonthlyBrief_ != null) {
                                subBuilder = this.lastScheduleMonthlyBrief_.toBuilder();
                            }
                            this.lastScheduleMonthlyBrief_ = input.readMessage(TowerMonthlyBriefOuterClass.TowerMonthlyBrief.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.lastScheduleMonthlyBrief_);
                                this.lastScheduleMonthlyBrief_ = subBuilder.buildPartial();
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
                    this.towerFloorRecordList_ = Collections.unmodifiableList((List<? extends TowerFloorRecordOuterClass.TowerFloorRecord>)this.towerFloorRecordList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return TowerAllDataRspOuterClass.internal_static_TowerAllDataRsp_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 12: {
                    return this.internalGetSkipFloorGrantedRewardItemMap();
                }
                case 4: {
                    return this.internalGetFloorOpenTimeMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TowerAllDataRspOuterClass.internal_static_TowerAllDataRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerAllDataRsp.class, Builder.class);
        }
        
        @Override
        public int getTowerScheduleId() {
            return this.towerScheduleId_;
        }
        
        @Override
        public int getDailyLevelIndex() {
            return this.dailyLevelIndex_;
        }
        
        private MapField<Integer, Integer> internalGetSkipFloorGrantedRewardItemMap() {
            if (this.skipFloorGrantedRewardItemMap_ == null) {
                return MapField.emptyMapField(SkipFloorGrantedRewardItemMapDefaultEntryHolder.defaultEntry);
            }
            return this.skipFloorGrantedRewardItemMap_;
        }
        
        @Override
        public int getSkipFloorGrantedRewardItemMapCount() {
            return this.internalGetSkipFloorGrantedRewardItemMap().getMap().size();
        }
        
        @Override
        public boolean containsSkipFloorGrantedRewardItemMap(final int key) {
            return this.internalGetSkipFloorGrantedRewardItemMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, Integer> getSkipFloorGrantedRewardItemMap() {
            return this.getSkipFloorGrantedRewardItemMapMap();
        }
        
        @Override
        public Map<Integer, Integer> getSkipFloorGrantedRewardItemMapMap() {
            return this.internalGetSkipFloorGrantedRewardItemMap().getMap();
        }
        
        @Override
        public int getSkipFloorGrantedRewardItemMapOrDefault(final int key, final int defaultValue) {
            final Map<Integer, Integer> map = this.internalGetSkipFloorGrantedRewardItemMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public int getSkipFloorGrantedRewardItemMapOrThrow(final int key) {
            final Map<Integer, Integer> map = this.internalGetSkipFloorGrantedRewardItemMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public boolean getIsFirstInteract() {
            return this.isFirstInteract_;
        }
        
        @Override
        public boolean getIsFinishedEntranceFloor() {
            return this.isFinishedEntranceFloor_;
        }
        
        @Override
        public List<TowerFloorRecordOuterClass.TowerFloorRecord> getTowerFloorRecordListList() {
            return this.towerFloorRecordList_;
        }
        
        @Override
        public List<? extends TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder> getTowerFloorRecordListOrBuilderList() {
            return this.towerFloorRecordList_;
        }
        
        @Override
        public int getTowerFloorRecordListCount() {
            return this.towerFloorRecordList_.size();
        }
        
        @Override
        public TowerFloorRecordOuterClass.TowerFloorRecord getTowerFloorRecordList(final int index) {
            return this.towerFloorRecordList_.get(index);
        }
        
        @Override
        public TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder getTowerFloorRecordListOrBuilder(final int index) {
            return this.towerFloorRecordList_.get(index);
        }
        
        @Override
        public int getDailyFloorId() {
            return this.dailyFloorId_;
        }
        
        @Override
        public int getCommemorativeRewardId() {
            return this.commemorativeRewardId_;
        }
        
        @Override
        public boolean hasLastScheduleMonthlyBrief() {
            return this.lastScheduleMonthlyBrief_ != null;
        }
        
        @Override
        public TowerMonthlyBriefOuterClass.TowerMonthlyBrief getLastScheduleMonthlyBrief() {
            return (this.lastScheduleMonthlyBrief_ == null) ? TowerMonthlyBriefOuterClass.TowerMonthlyBrief.getDefaultInstance() : this.lastScheduleMonthlyBrief_;
        }
        
        @Override
        public TowerMonthlyBriefOuterClass.TowerMonthlyBriefOrBuilder getLastScheduleMonthlyBriefOrBuilder() {
            return this.getLastScheduleMonthlyBrief();
        }
        
        @Override
        public int getNextScheduleChangeTime() {
            return this.nextScheduleChangeTime_;
        }
        
        @Override
        public int getValidTowerRecordNum() {
            return this.validTowerRecordNum_;
        }
        
        @Override
        public int getSkipToFloorIndex() {
            return this.skipToFloorIndex_;
        }
        
        private MapField<Integer, Integer> internalGetFloorOpenTimeMap() {
            if (this.floorOpenTimeMap_ == null) {
                return MapField.emptyMapField(FloorOpenTimeMapDefaultEntryHolder.defaultEntry);
            }
            return this.floorOpenTimeMap_;
        }
        
        @Override
        public int getFloorOpenTimeMapCount() {
            return this.internalGetFloorOpenTimeMap().getMap().size();
        }
        
        @Override
        public boolean containsFloorOpenTimeMap(final int key) {
            return this.internalGetFloorOpenTimeMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, Integer> getFloorOpenTimeMap() {
            return this.getFloorOpenTimeMapMap();
        }
        
        @Override
        public Map<Integer, Integer> getFloorOpenTimeMapMap() {
            return this.internalGetFloorOpenTimeMap().getMap();
        }
        
        @Override
        public int getFloorOpenTimeMapOrDefault(final int key, final int defaultValue) {
            final Map<Integer, Integer> map = this.internalGetFloorOpenTimeMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public int getFloorOpenTimeMapOrThrow(final int key) {
            final Map<Integer, Integer> map = this.internalGetFloorOpenTimeMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public boolean hasCurLevelRecord() {
            return this.curLevelRecord_ != null;
        }
        
        @Override
        public TowerCurLevelRecordOuterClass.TowerCurLevelRecord getCurLevelRecord() {
            return (this.curLevelRecord_ == null) ? TowerCurLevelRecordOuterClass.TowerCurLevelRecord.getDefaultInstance() : this.curLevelRecord_;
        }
        
        @Override
        public TowerCurLevelRecordOuterClass.TowerCurLevelRecordOrBuilder getCurLevelRecordOrBuilder() {
            return this.getCurLevelRecord();
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public int getScheduleStartTime() {
            return this.scheduleStartTime_;
        }
        
        @Override
        public boolean hasMonthlyBrief() {
            return this.monthlyBrief_ != null;
        }
        
        @Override
        public TowerMonthlyBriefOuterClass.TowerMonthlyBrief getMonthlyBrief() {
            return (this.monthlyBrief_ == null) ? TowerMonthlyBriefOuterClass.TowerMonthlyBrief.getDefaultInstance() : this.monthlyBrief_;
        }
        
        @Override
        public TowerMonthlyBriefOuterClass.TowerMonthlyBriefOrBuilder getMonthlyBriefOrBuilder() {
            return this.getMonthlyBrief();
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
            if (this.isFinishedEntranceFloor_) {
                output.writeBool(1, this.isFinishedEntranceFloor_);
            }
            if (this.skipToFloorIndex_ != 0) {
                output.writeUInt32(2, this.skipToFloorIndex_);
            }
            if (this.isFirstInteract_) {
                output.writeBool(3, this.isFirstInteract_);
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetFloorOpenTimeMap(), FloorOpenTimeMapDefaultEntryHolder.defaultEntry, 4);
            for (int i = 0; i < this.towerFloorRecordList_.size(); ++i) {
                output.writeMessage(5, this.towerFloorRecordList_.get(i));
            }
            if (this.nextScheduleChangeTime_ != 0) {
                output.writeUInt32(6, this.nextScheduleChangeTime_);
            }
            if (this.validTowerRecordNum_ != 0) {
                output.writeUInt32(7, this.validTowerRecordNum_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(8, this.retcode_);
            }
            if (this.dailyLevelIndex_ != 0) {
                output.writeUInt32(9, this.dailyLevelIndex_);
            }
            if (this.towerScheduleId_ != 0) {
                output.writeUInt32(10, this.towerScheduleId_);
            }
            if (this.dailyFloorId_ != 0) {
                output.writeUInt32(11, this.dailyFloorId_);
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetSkipFloorGrantedRewardItemMap(), SkipFloorGrantedRewardItemMapDefaultEntryHolder.defaultEntry, 12);
            if (this.commemorativeRewardId_ != 0) {
                output.writeUInt32(13, this.commemorativeRewardId_);
            }
            if (this.monthlyBrief_ != null) {
                output.writeMessage(14, this.getMonthlyBrief());
            }
            if (this.curLevelRecord_ != null) {
                output.writeMessage(15, this.getCurLevelRecord());
            }
            if (this.scheduleStartTime_ != 0) {
                output.writeUInt32(914, this.scheduleStartTime_);
            }
            if (this.lastScheduleMonthlyBrief_ != null) {
                output.writeMessage(1222, this.getLastScheduleMonthlyBrief());
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
            if (this.isFinishedEntranceFloor_) {
                size += CodedOutputStream.computeBoolSize(1, this.isFinishedEntranceFloor_);
            }
            if (this.skipToFloorIndex_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.skipToFloorIndex_);
            }
            if (this.isFirstInteract_) {
                size += CodedOutputStream.computeBoolSize(3, this.isFirstInteract_);
            }
            for (final Map.Entry<Integer, Integer> entry : this.internalGetFloorOpenTimeMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> floorOpenTimeMap__ = FloorOpenTimeMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(4, floorOpenTimeMap__);
            }
            for (int i = 0; i < this.towerFloorRecordList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(5, this.towerFloorRecordList_.get(i));
            }
            if (this.nextScheduleChangeTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.nextScheduleChangeTime_);
            }
            if (this.validTowerRecordNum_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.validTowerRecordNum_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(8, this.retcode_);
            }
            if (this.dailyLevelIndex_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.dailyLevelIndex_);
            }
            if (this.towerScheduleId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.towerScheduleId_);
            }
            if (this.dailyFloorId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.dailyFloorId_);
            }
            for (final Map.Entry<Integer, Integer> entry : this.internalGetSkipFloorGrantedRewardItemMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> skipFloorGrantedRewardItemMap__ = SkipFloorGrantedRewardItemMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(12, skipFloorGrantedRewardItemMap__);
            }
            if (this.commemorativeRewardId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.commemorativeRewardId_);
            }
            if (this.monthlyBrief_ != null) {
                size += CodedOutputStream.computeMessageSize(14, this.getMonthlyBrief());
            }
            if (this.curLevelRecord_ != null) {
                size += CodedOutputStream.computeMessageSize(15, this.getCurLevelRecord());
            }
            if (this.scheduleStartTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(914, this.scheduleStartTime_);
            }
            if (this.lastScheduleMonthlyBrief_ != null) {
                size += CodedOutputStream.computeMessageSize(1222, this.getLastScheduleMonthlyBrief());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TowerAllDataRsp)) {
                return super.equals(obj);
            }
            final TowerAllDataRsp other = (TowerAllDataRsp)obj;
            return this.getTowerScheduleId() == other.getTowerScheduleId() && this.getDailyLevelIndex() == other.getDailyLevelIndex() && this.internalGetSkipFloorGrantedRewardItemMap().equals(other.internalGetSkipFloorGrantedRewardItemMap()) && this.getIsFirstInteract() == other.getIsFirstInteract() && this.getIsFinishedEntranceFloor() == other.getIsFinishedEntranceFloor() && this.getTowerFloorRecordListList().equals(other.getTowerFloorRecordListList()) && this.getDailyFloorId() == other.getDailyFloorId() && this.getCommemorativeRewardId() == other.getCommemorativeRewardId() && this.hasLastScheduleMonthlyBrief() == other.hasLastScheduleMonthlyBrief() && (!this.hasLastScheduleMonthlyBrief() || this.getLastScheduleMonthlyBrief().equals(other.getLastScheduleMonthlyBrief())) && this.getNextScheduleChangeTime() == other.getNextScheduleChangeTime() && this.getValidTowerRecordNum() == other.getValidTowerRecordNum() && this.getSkipToFloorIndex() == other.getSkipToFloorIndex() && this.internalGetFloorOpenTimeMap().equals(other.internalGetFloorOpenTimeMap()) && this.hasCurLevelRecord() == other.hasCurLevelRecord() && (!this.hasCurLevelRecord() || this.getCurLevelRecord().equals(other.getCurLevelRecord())) && this.getRetcode() == other.getRetcode() && this.getScheduleStartTime() == other.getScheduleStartTime() && this.hasMonthlyBrief() == other.hasMonthlyBrief() && (!this.hasMonthlyBrief() || this.getMonthlyBrief().equals(other.getMonthlyBrief())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getTowerScheduleId();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getDailyLevelIndex();
            if (!this.internalGetSkipFloorGrantedRewardItemMap().getMap().isEmpty()) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.internalGetSkipFloorGrantedRewardItemMap().hashCode();
            }
            hash = 37 * hash + 3;
            hash = 53 * hash + Internal.hashBoolean(this.getIsFirstInteract());
            hash = 37 * hash + 1;
            hash = 53 * hash + Internal.hashBoolean(this.getIsFinishedEntranceFloor());
            if (this.getTowerFloorRecordListCount() > 0) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getTowerFloorRecordListList().hashCode();
            }
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getDailyFloorId();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getCommemorativeRewardId();
            if (this.hasLastScheduleMonthlyBrief()) {
                hash = 37 * hash + 1222;
                hash = 53 * hash + this.getLastScheduleMonthlyBrief().hashCode();
            }
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getNextScheduleChangeTime();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getValidTowerRecordNum();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getSkipToFloorIndex();
            if (!this.internalGetFloorOpenTimeMap().getMap().isEmpty()) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.internalGetFloorOpenTimeMap().hashCode();
            }
            if (this.hasCurLevelRecord()) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getCurLevelRecord().hashCode();
            }
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 914;
            hash = 53 * hash + this.getScheduleStartTime();
            if (this.hasMonthlyBrief()) {
                hash = 37 * hash + 14;
                hash = 53 * hash + this.getMonthlyBrief().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TowerAllDataRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TowerAllDataRsp.PARSER.parseFrom(data);
        }
        
        public static TowerAllDataRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerAllDataRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerAllDataRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TowerAllDataRsp.PARSER.parseFrom(data);
        }
        
        public static TowerAllDataRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerAllDataRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerAllDataRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TowerAllDataRsp.PARSER.parseFrom(data);
        }
        
        public static TowerAllDataRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerAllDataRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerAllDataRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerAllDataRsp.PARSER, input);
        }
        
        public static TowerAllDataRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerAllDataRsp.PARSER, input, extensionRegistry);
        }
        
        public static TowerAllDataRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TowerAllDataRsp.PARSER, input);
        }
        
        public static TowerAllDataRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TowerAllDataRsp.PARSER, input, extensionRegistry);
        }
        
        public static TowerAllDataRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerAllDataRsp.PARSER, input);
        }
        
        public static TowerAllDataRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerAllDataRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TowerAllDataRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TowerAllDataRsp prototype) {
            return TowerAllDataRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TowerAllDataRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TowerAllDataRsp getDefaultInstance() {
            return TowerAllDataRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<TowerAllDataRsp> parser() {
            return TowerAllDataRsp.PARSER;
        }
        
        @Override
        public Parser<TowerAllDataRsp> getParserForType() {
            return TowerAllDataRsp.PARSER;
        }
        
        @Override
        public TowerAllDataRsp getDefaultInstanceForType() {
            return TowerAllDataRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TowerAllDataRsp();
            PARSER = new AbstractParser<TowerAllDataRsp>() {
                @Override
                public TowerAllDataRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TowerAllDataRsp(input, extensionRegistry);
                }
            };
        }
        
        private static final class SkipFloorGrantedRewardItemMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(TowerAllDataRspOuterClass.internal_static_TowerAllDataRsp_SkipFloorGrantedRewardItemMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        private static final class FloorOpenTimeMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(TowerAllDataRspOuterClass.internal_static_TowerAllDataRsp_FloorOpenTimeMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TowerAllDataRspOrBuilder
        {
            private int bitField0_;
            private int towerScheduleId_;
            private int dailyLevelIndex_;
            private MapField<Integer, Integer> skipFloorGrantedRewardItemMap_;
            private boolean isFirstInteract_;
            private boolean isFinishedEntranceFloor_;
            private List<TowerFloorRecordOuterClass.TowerFloorRecord> towerFloorRecordList_;
            private RepeatedFieldBuilderV3<TowerFloorRecordOuterClass.TowerFloorRecord, TowerFloorRecordOuterClass.TowerFloorRecord.Builder, TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder> towerFloorRecordListBuilder_;
            private int dailyFloorId_;
            private int commemorativeRewardId_;
            private TowerMonthlyBriefOuterClass.TowerMonthlyBrief lastScheduleMonthlyBrief_;
            private SingleFieldBuilderV3<TowerMonthlyBriefOuterClass.TowerMonthlyBrief, TowerMonthlyBriefOuterClass.TowerMonthlyBrief.Builder, TowerMonthlyBriefOuterClass.TowerMonthlyBriefOrBuilder> lastScheduleMonthlyBriefBuilder_;
            private int nextScheduleChangeTime_;
            private int validTowerRecordNum_;
            private int skipToFloorIndex_;
            private MapField<Integer, Integer> floorOpenTimeMap_;
            private TowerCurLevelRecordOuterClass.TowerCurLevelRecord curLevelRecord_;
            private SingleFieldBuilderV3<TowerCurLevelRecordOuterClass.TowerCurLevelRecord, TowerCurLevelRecordOuterClass.TowerCurLevelRecord.Builder, TowerCurLevelRecordOuterClass.TowerCurLevelRecordOrBuilder> curLevelRecordBuilder_;
            private int retcode_;
            private int scheduleStartTime_;
            private TowerMonthlyBriefOuterClass.TowerMonthlyBrief monthlyBrief_;
            private SingleFieldBuilderV3<TowerMonthlyBriefOuterClass.TowerMonthlyBrief, TowerMonthlyBriefOuterClass.TowerMonthlyBrief.Builder, TowerMonthlyBriefOuterClass.TowerMonthlyBriefOrBuilder> monthlyBriefBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TowerAllDataRspOuterClass.internal_static_TowerAllDataRsp_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 12: {
                        return this.internalGetSkipFloorGrantedRewardItemMap();
                    }
                    case 4: {
                        return this.internalGetFloorOpenTimeMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected MapField internalGetMutableMapField(final int number) {
                switch (number) {
                    case 12: {
                        return this.internalGetMutableSkipFloorGrantedRewardItemMap();
                    }
                    case 4: {
                        return this.internalGetMutableFloorOpenTimeMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TowerAllDataRspOuterClass.internal_static_TowerAllDataRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerAllDataRsp.class, Builder.class);
            }
            
            private Builder() {
                this.towerFloorRecordList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.towerFloorRecordList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TowerAllDataRsp.alwaysUseFieldBuilders) {
                    this.getTowerFloorRecordListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.towerScheduleId_ = 0;
                this.dailyLevelIndex_ = 0;
                this.internalGetMutableSkipFloorGrantedRewardItemMap().clear();
                this.isFirstInteract_ = false;
                this.isFinishedEntranceFloor_ = false;
                if (this.towerFloorRecordListBuilder_ == null) {
                    this.towerFloorRecordList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                else {
                    this.towerFloorRecordListBuilder_.clear();
                }
                this.dailyFloorId_ = 0;
                this.commemorativeRewardId_ = 0;
                if (this.lastScheduleMonthlyBriefBuilder_ == null) {
                    this.lastScheduleMonthlyBrief_ = null;
                }
                else {
                    this.lastScheduleMonthlyBrief_ = null;
                    this.lastScheduleMonthlyBriefBuilder_ = null;
                }
                this.nextScheduleChangeTime_ = 0;
                this.validTowerRecordNum_ = 0;
                this.skipToFloorIndex_ = 0;
                this.internalGetMutableFloorOpenTimeMap().clear();
                if (this.curLevelRecordBuilder_ == null) {
                    this.curLevelRecord_ = null;
                }
                else {
                    this.curLevelRecord_ = null;
                    this.curLevelRecordBuilder_ = null;
                }
                this.retcode_ = 0;
                this.scheduleStartTime_ = 0;
                if (this.monthlyBriefBuilder_ == null) {
                    this.monthlyBrief_ = null;
                }
                else {
                    this.monthlyBrief_ = null;
                    this.monthlyBriefBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TowerAllDataRspOuterClass.internal_static_TowerAllDataRsp_descriptor;
            }
            
            @Override
            public TowerAllDataRsp getDefaultInstanceForType() {
                return TowerAllDataRsp.getDefaultInstance();
            }
            
            @Override
            public TowerAllDataRsp build() {
                final TowerAllDataRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TowerAllDataRsp buildPartial() {
                final TowerAllDataRsp result = new TowerAllDataRsp(this);
                final int from_bitField0_ = this.bitField0_;
                result.towerScheduleId_ = this.towerScheduleId_;
                result.dailyLevelIndex_ = this.dailyLevelIndex_;
                (result.skipFloorGrantedRewardItemMap_ = this.internalGetSkipFloorGrantedRewardItemMap()).makeImmutable();
                result.isFirstInteract_ = this.isFirstInteract_;
                result.isFinishedEntranceFloor_ = this.isFinishedEntranceFloor_;
                if (this.towerFloorRecordListBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) != 0x0) {
                        this.towerFloorRecordList_ = Collections.unmodifiableList((List<? extends TowerFloorRecordOuterClass.TowerFloorRecord>)this.towerFloorRecordList_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.towerFloorRecordList_ = this.towerFloorRecordList_;
                }
                else {
                    result.towerFloorRecordList_ = this.towerFloorRecordListBuilder_.build();
                }
                result.dailyFloorId_ = this.dailyFloorId_;
                result.commemorativeRewardId_ = this.commemorativeRewardId_;
                if (this.lastScheduleMonthlyBriefBuilder_ == null) {
                    result.lastScheduleMonthlyBrief_ = this.lastScheduleMonthlyBrief_;
                }
                else {
                    result.lastScheduleMonthlyBrief_ = this.lastScheduleMonthlyBriefBuilder_.build();
                }
                result.nextScheduleChangeTime_ = this.nextScheduleChangeTime_;
                result.validTowerRecordNum_ = this.validTowerRecordNum_;
                result.skipToFloorIndex_ = this.skipToFloorIndex_;
                (result.floorOpenTimeMap_ = this.internalGetFloorOpenTimeMap()).makeImmutable();
                if (this.curLevelRecordBuilder_ == null) {
                    result.curLevelRecord_ = this.curLevelRecord_;
                }
                else {
                    result.curLevelRecord_ = this.curLevelRecordBuilder_.build();
                }
                result.retcode_ = this.retcode_;
                result.scheduleStartTime_ = this.scheduleStartTime_;
                if (this.monthlyBriefBuilder_ == null) {
                    result.monthlyBrief_ = this.monthlyBrief_;
                }
                else {
                    result.monthlyBrief_ = this.monthlyBriefBuilder_.build();
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
                if (other instanceof TowerAllDataRsp) {
                    return this.mergeFrom((TowerAllDataRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TowerAllDataRsp other) {
                if (other == TowerAllDataRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getTowerScheduleId() != 0) {
                    this.setTowerScheduleId(other.getTowerScheduleId());
                }
                if (other.getDailyLevelIndex() != 0) {
                    this.setDailyLevelIndex(other.getDailyLevelIndex());
                }
                this.internalGetMutableSkipFloorGrantedRewardItemMap().mergeFrom(other.internalGetSkipFloorGrantedRewardItemMap());
                if (other.getIsFirstInteract()) {
                    this.setIsFirstInteract(other.getIsFirstInteract());
                }
                if (other.getIsFinishedEntranceFloor()) {
                    this.setIsFinishedEntranceFloor(other.getIsFinishedEntranceFloor());
                }
                if (this.towerFloorRecordListBuilder_ == null) {
                    if (!other.towerFloorRecordList_.isEmpty()) {
                        if (this.towerFloorRecordList_.isEmpty()) {
                            this.towerFloorRecordList_ = other.towerFloorRecordList_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        }
                        else {
                            this.ensureTowerFloorRecordListIsMutable();
                            this.towerFloorRecordList_.addAll(other.towerFloorRecordList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.towerFloorRecordList_.isEmpty()) {
                    if (this.towerFloorRecordListBuilder_.isEmpty()) {
                        this.towerFloorRecordListBuilder_.dispose();
                        this.towerFloorRecordListBuilder_ = null;
                        this.towerFloorRecordList_ = other.towerFloorRecordList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.towerFloorRecordListBuilder_ = (TowerAllDataRsp.alwaysUseFieldBuilders ? this.getTowerFloorRecordListFieldBuilder() : null);
                    }
                    else {
                        this.towerFloorRecordListBuilder_.addAllMessages(other.towerFloorRecordList_);
                    }
                }
                if (other.getDailyFloorId() != 0) {
                    this.setDailyFloorId(other.getDailyFloorId());
                }
                if (other.getCommemorativeRewardId() != 0) {
                    this.setCommemorativeRewardId(other.getCommemorativeRewardId());
                }
                if (other.hasLastScheduleMonthlyBrief()) {
                    this.mergeLastScheduleMonthlyBrief(other.getLastScheduleMonthlyBrief());
                }
                if (other.getNextScheduleChangeTime() != 0) {
                    this.setNextScheduleChangeTime(other.getNextScheduleChangeTime());
                }
                if (other.getValidTowerRecordNum() != 0) {
                    this.setValidTowerRecordNum(other.getValidTowerRecordNum());
                }
                if (other.getSkipToFloorIndex() != 0) {
                    this.setSkipToFloorIndex(other.getSkipToFloorIndex());
                }
                this.internalGetMutableFloorOpenTimeMap().mergeFrom(other.internalGetFloorOpenTimeMap());
                if (other.hasCurLevelRecord()) {
                    this.mergeCurLevelRecord(other.getCurLevelRecord());
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getScheduleStartTime() != 0) {
                    this.setScheduleStartTime(other.getScheduleStartTime());
                }
                if (other.hasMonthlyBrief()) {
                    this.mergeMonthlyBrief(other.getMonthlyBrief());
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
                TowerAllDataRsp parsedMessage = null;
                try {
                    parsedMessage = TowerAllDataRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TowerAllDataRsp)e.getUnfinishedMessage();
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
            public int getTowerScheduleId() {
                return this.towerScheduleId_;
            }
            
            public Builder setTowerScheduleId(final int value) {
                this.towerScheduleId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTowerScheduleId() {
                this.towerScheduleId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getDailyLevelIndex() {
                return this.dailyLevelIndex_;
            }
            
            public Builder setDailyLevelIndex(final int value) {
                this.dailyLevelIndex_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDailyLevelIndex() {
                this.dailyLevelIndex_ = 0;
                this.onChanged();
                return this;
            }
            
            private MapField<Integer, Integer> internalGetSkipFloorGrantedRewardItemMap() {
                if (this.skipFloorGrantedRewardItemMap_ == null) {
                    return MapField.emptyMapField(SkipFloorGrantedRewardItemMapDefaultEntryHolder.defaultEntry);
                }
                return this.skipFloorGrantedRewardItemMap_;
            }
            
            private MapField<Integer, Integer> internalGetMutableSkipFloorGrantedRewardItemMap() {
                this.onChanged();
                if (this.skipFloorGrantedRewardItemMap_ == null) {
                    this.skipFloorGrantedRewardItemMap_ = MapField.newMapField(SkipFloorGrantedRewardItemMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.skipFloorGrantedRewardItemMap_.isMutable()) {
                    this.skipFloorGrantedRewardItemMap_ = this.skipFloorGrantedRewardItemMap_.copy();
                }
                return this.skipFloorGrantedRewardItemMap_;
            }
            
            @Override
            public int getSkipFloorGrantedRewardItemMapCount() {
                return this.internalGetSkipFloorGrantedRewardItemMap().getMap().size();
            }
            
            @Override
            public boolean containsSkipFloorGrantedRewardItemMap(final int key) {
                return this.internalGetSkipFloorGrantedRewardItemMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Integer> getSkipFloorGrantedRewardItemMap() {
                return this.getSkipFloorGrantedRewardItemMapMap();
            }
            
            @Override
            public Map<Integer, Integer> getSkipFloorGrantedRewardItemMapMap() {
                return this.internalGetSkipFloorGrantedRewardItemMap().getMap();
            }
            
            @Override
            public int getSkipFloorGrantedRewardItemMapOrDefault(final int key, final int defaultValue) {
                final Map<Integer, Integer> map = this.internalGetSkipFloorGrantedRewardItemMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public int getSkipFloorGrantedRewardItemMapOrThrow(final int key) {
                final Map<Integer, Integer> map = this.internalGetSkipFloorGrantedRewardItemMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearSkipFloorGrantedRewardItemMap() {
                this.internalGetMutableSkipFloorGrantedRewardItemMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeSkipFloorGrantedRewardItemMap(final int key) {
                this.internalGetMutableSkipFloorGrantedRewardItemMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, Integer> getMutableSkipFloorGrantedRewardItemMap() {
                return this.internalGetMutableSkipFloorGrantedRewardItemMap().getMutableMap();
            }
            
            public Builder putSkipFloorGrantedRewardItemMap(final int key, final int value) {
                this.internalGetMutableSkipFloorGrantedRewardItemMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllSkipFloorGrantedRewardItemMap(final Map<Integer, Integer> values) {
                this.internalGetMutableSkipFloorGrantedRewardItemMap().getMutableMap().putAll(values);
                return this;
            }
            
            @Override
            public boolean getIsFirstInteract() {
                return this.isFirstInteract_;
            }
            
            public Builder setIsFirstInteract(final boolean value) {
                this.isFirstInteract_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsFirstInteract() {
                this.isFirstInteract_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsFinishedEntranceFloor() {
                return this.isFinishedEntranceFloor_;
            }
            
            public Builder setIsFinishedEntranceFloor(final boolean value) {
                this.isFinishedEntranceFloor_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsFinishedEntranceFloor() {
                this.isFinishedEntranceFloor_ = false;
                this.onChanged();
                return this;
            }
            
            private void ensureTowerFloorRecordListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.towerFloorRecordList_ = new ArrayList<TowerFloorRecordOuterClass.TowerFloorRecord>(this.towerFloorRecordList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<TowerFloorRecordOuterClass.TowerFloorRecord> getTowerFloorRecordListList() {
                if (this.towerFloorRecordListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends TowerFloorRecordOuterClass.TowerFloorRecord>)this.towerFloorRecordList_);
                }
                return this.towerFloorRecordListBuilder_.getMessageList();
            }
            
            @Override
            public int getTowerFloorRecordListCount() {
                if (this.towerFloorRecordListBuilder_ == null) {
                    return this.towerFloorRecordList_.size();
                }
                return this.towerFloorRecordListBuilder_.getCount();
            }
            
            @Override
            public TowerFloorRecordOuterClass.TowerFloorRecord getTowerFloorRecordList(final int index) {
                if (this.towerFloorRecordListBuilder_ == null) {
                    return this.towerFloorRecordList_.get(index);
                }
                return this.towerFloorRecordListBuilder_.getMessage(index);
            }
            
            public Builder setTowerFloorRecordList(final int index, final TowerFloorRecordOuterClass.TowerFloorRecord value) {
                if (this.towerFloorRecordListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTowerFloorRecordListIsMutable();
                    this.towerFloorRecordList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.towerFloorRecordListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setTowerFloorRecordList(final int index, final TowerFloorRecordOuterClass.TowerFloorRecord.Builder builderForValue) {
                if (this.towerFloorRecordListBuilder_ == null) {
                    this.ensureTowerFloorRecordListIsMutable();
                    this.towerFloorRecordList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.towerFloorRecordListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addTowerFloorRecordList(final TowerFloorRecordOuterClass.TowerFloorRecord value) {
                if (this.towerFloorRecordListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTowerFloorRecordListIsMutable();
                    this.towerFloorRecordList_.add(value);
                    this.onChanged();
                }
                else {
                    this.towerFloorRecordListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addTowerFloorRecordList(final int index, final TowerFloorRecordOuterClass.TowerFloorRecord value) {
                if (this.towerFloorRecordListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTowerFloorRecordListIsMutable();
                    this.towerFloorRecordList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.towerFloorRecordListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addTowerFloorRecordList(final TowerFloorRecordOuterClass.TowerFloorRecord.Builder builderForValue) {
                if (this.towerFloorRecordListBuilder_ == null) {
                    this.ensureTowerFloorRecordListIsMutable();
                    this.towerFloorRecordList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.towerFloorRecordListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addTowerFloorRecordList(final int index, final TowerFloorRecordOuterClass.TowerFloorRecord.Builder builderForValue) {
                if (this.towerFloorRecordListBuilder_ == null) {
                    this.ensureTowerFloorRecordListIsMutable();
                    this.towerFloorRecordList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.towerFloorRecordListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllTowerFloorRecordList(final Iterable<? extends TowerFloorRecordOuterClass.TowerFloorRecord> values) {
                if (this.towerFloorRecordListBuilder_ == null) {
                    this.ensureTowerFloorRecordListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.towerFloorRecordList_);
                    this.onChanged();
                }
                else {
                    this.towerFloorRecordListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearTowerFloorRecordList() {
                if (this.towerFloorRecordListBuilder_ == null) {
                    this.towerFloorRecordList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    this.onChanged();
                }
                else {
                    this.towerFloorRecordListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeTowerFloorRecordList(final int index) {
                if (this.towerFloorRecordListBuilder_ == null) {
                    this.ensureTowerFloorRecordListIsMutable();
                    this.towerFloorRecordList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.towerFloorRecordListBuilder_.remove(index);
                }
                return this;
            }
            
            public TowerFloorRecordOuterClass.TowerFloorRecord.Builder getTowerFloorRecordListBuilder(final int index) {
                return this.getTowerFloorRecordListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder getTowerFloorRecordListOrBuilder(final int index) {
                if (this.towerFloorRecordListBuilder_ == null) {
                    return this.towerFloorRecordList_.get(index);
                }
                return this.towerFloorRecordListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder> getTowerFloorRecordListOrBuilderList() {
                if (this.towerFloorRecordListBuilder_ != null) {
                    return this.towerFloorRecordListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder>)this.towerFloorRecordList_);
            }
            
            public TowerFloorRecordOuterClass.TowerFloorRecord.Builder addTowerFloorRecordListBuilder() {
                return this.getTowerFloorRecordListFieldBuilder().addBuilder(TowerFloorRecordOuterClass.TowerFloorRecord.getDefaultInstance());
            }
            
            public TowerFloorRecordOuterClass.TowerFloorRecord.Builder addTowerFloorRecordListBuilder(final int index) {
                return this.getTowerFloorRecordListFieldBuilder().addBuilder(index, TowerFloorRecordOuterClass.TowerFloorRecord.getDefaultInstance());
            }
            
            public List<TowerFloorRecordOuterClass.TowerFloorRecord.Builder> getTowerFloorRecordListBuilderList() {
                return this.getTowerFloorRecordListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<TowerFloorRecordOuterClass.TowerFloorRecord, TowerFloorRecordOuterClass.TowerFloorRecord.Builder, TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder> getTowerFloorRecordListFieldBuilder() {
                if (this.towerFloorRecordListBuilder_ == null) {
                    this.towerFloorRecordListBuilder_ = new RepeatedFieldBuilderV3<TowerFloorRecordOuterClass.TowerFloorRecord, TowerFloorRecordOuterClass.TowerFloorRecord.Builder, TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder>(this.towerFloorRecordList_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
                    this.towerFloorRecordList_ = null;
                }
                return this.towerFloorRecordListBuilder_;
            }
            
            @Override
            public int getDailyFloorId() {
                return this.dailyFloorId_;
            }
            
            public Builder setDailyFloorId(final int value) {
                this.dailyFloorId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDailyFloorId() {
                this.dailyFloorId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCommemorativeRewardId() {
                return this.commemorativeRewardId_;
            }
            
            public Builder setCommemorativeRewardId(final int value) {
                this.commemorativeRewardId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCommemorativeRewardId() {
                this.commemorativeRewardId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasLastScheduleMonthlyBrief() {
                return this.lastScheduleMonthlyBriefBuilder_ != null || this.lastScheduleMonthlyBrief_ != null;
            }
            
            @Override
            public TowerMonthlyBriefOuterClass.TowerMonthlyBrief getLastScheduleMonthlyBrief() {
                if (this.lastScheduleMonthlyBriefBuilder_ == null) {
                    return (this.lastScheduleMonthlyBrief_ == null) ? TowerMonthlyBriefOuterClass.TowerMonthlyBrief.getDefaultInstance() : this.lastScheduleMonthlyBrief_;
                }
                return this.lastScheduleMonthlyBriefBuilder_.getMessage();
            }
            
            public Builder setLastScheduleMonthlyBrief(final TowerMonthlyBriefOuterClass.TowerMonthlyBrief value) {
                if (this.lastScheduleMonthlyBriefBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.lastScheduleMonthlyBrief_ = value;
                    this.onChanged();
                }
                else {
                    this.lastScheduleMonthlyBriefBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setLastScheduleMonthlyBrief(final TowerMonthlyBriefOuterClass.TowerMonthlyBrief.Builder builderForValue) {
                if (this.lastScheduleMonthlyBriefBuilder_ == null) {
                    this.lastScheduleMonthlyBrief_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.lastScheduleMonthlyBriefBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeLastScheduleMonthlyBrief(final TowerMonthlyBriefOuterClass.TowerMonthlyBrief value) {
                if (this.lastScheduleMonthlyBriefBuilder_ == null) {
                    if (this.lastScheduleMonthlyBrief_ != null) {
                        this.lastScheduleMonthlyBrief_ = TowerMonthlyBriefOuterClass.TowerMonthlyBrief.newBuilder(this.lastScheduleMonthlyBrief_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.lastScheduleMonthlyBrief_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.lastScheduleMonthlyBriefBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearLastScheduleMonthlyBrief() {
                if (this.lastScheduleMonthlyBriefBuilder_ == null) {
                    this.lastScheduleMonthlyBrief_ = null;
                    this.onChanged();
                }
                else {
                    this.lastScheduleMonthlyBrief_ = null;
                    this.lastScheduleMonthlyBriefBuilder_ = null;
                }
                return this;
            }
            
            public TowerMonthlyBriefOuterClass.TowerMonthlyBrief.Builder getLastScheduleMonthlyBriefBuilder() {
                this.onChanged();
                return this.getLastScheduleMonthlyBriefFieldBuilder().getBuilder();
            }
            
            @Override
            public TowerMonthlyBriefOuterClass.TowerMonthlyBriefOrBuilder getLastScheduleMonthlyBriefOrBuilder() {
                if (this.lastScheduleMonthlyBriefBuilder_ != null) {
                    return this.lastScheduleMonthlyBriefBuilder_.getMessageOrBuilder();
                }
                return (this.lastScheduleMonthlyBrief_ == null) ? TowerMonthlyBriefOuterClass.TowerMonthlyBrief.getDefaultInstance() : this.lastScheduleMonthlyBrief_;
            }
            
            private SingleFieldBuilderV3<TowerMonthlyBriefOuterClass.TowerMonthlyBrief, TowerMonthlyBriefOuterClass.TowerMonthlyBrief.Builder, TowerMonthlyBriefOuterClass.TowerMonthlyBriefOrBuilder> getLastScheduleMonthlyBriefFieldBuilder() {
                if (this.lastScheduleMonthlyBriefBuilder_ == null) {
                    this.lastScheduleMonthlyBriefBuilder_ = new SingleFieldBuilderV3<TowerMonthlyBriefOuterClass.TowerMonthlyBrief, TowerMonthlyBriefOuterClass.TowerMonthlyBrief.Builder, TowerMonthlyBriefOuterClass.TowerMonthlyBriefOrBuilder>(this.getLastScheduleMonthlyBrief(), this.getParentForChildren(), this.isClean());
                    this.lastScheduleMonthlyBrief_ = null;
                }
                return this.lastScheduleMonthlyBriefBuilder_;
            }
            
            @Override
            public int getNextScheduleChangeTime() {
                return this.nextScheduleChangeTime_;
            }
            
            public Builder setNextScheduleChangeTime(final int value) {
                this.nextScheduleChangeTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearNextScheduleChangeTime() {
                this.nextScheduleChangeTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getValidTowerRecordNum() {
                return this.validTowerRecordNum_;
            }
            
            public Builder setValidTowerRecordNum(final int value) {
                this.validTowerRecordNum_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearValidTowerRecordNum() {
                this.validTowerRecordNum_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getSkipToFloorIndex() {
                return this.skipToFloorIndex_;
            }
            
            public Builder setSkipToFloorIndex(final int value) {
                this.skipToFloorIndex_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSkipToFloorIndex() {
                this.skipToFloorIndex_ = 0;
                this.onChanged();
                return this;
            }
            
            private MapField<Integer, Integer> internalGetFloorOpenTimeMap() {
                if (this.floorOpenTimeMap_ == null) {
                    return MapField.emptyMapField(FloorOpenTimeMapDefaultEntryHolder.defaultEntry);
                }
                return this.floorOpenTimeMap_;
            }
            
            private MapField<Integer, Integer> internalGetMutableFloorOpenTimeMap() {
                this.onChanged();
                if (this.floorOpenTimeMap_ == null) {
                    this.floorOpenTimeMap_ = MapField.newMapField(FloorOpenTimeMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.floorOpenTimeMap_.isMutable()) {
                    this.floorOpenTimeMap_ = this.floorOpenTimeMap_.copy();
                }
                return this.floorOpenTimeMap_;
            }
            
            @Override
            public int getFloorOpenTimeMapCount() {
                return this.internalGetFloorOpenTimeMap().getMap().size();
            }
            
            @Override
            public boolean containsFloorOpenTimeMap(final int key) {
                return this.internalGetFloorOpenTimeMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Integer> getFloorOpenTimeMap() {
                return this.getFloorOpenTimeMapMap();
            }
            
            @Override
            public Map<Integer, Integer> getFloorOpenTimeMapMap() {
                return this.internalGetFloorOpenTimeMap().getMap();
            }
            
            @Override
            public int getFloorOpenTimeMapOrDefault(final int key, final int defaultValue) {
                final Map<Integer, Integer> map = this.internalGetFloorOpenTimeMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public int getFloorOpenTimeMapOrThrow(final int key) {
                final Map<Integer, Integer> map = this.internalGetFloorOpenTimeMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearFloorOpenTimeMap() {
                this.internalGetMutableFloorOpenTimeMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeFloorOpenTimeMap(final int key) {
                this.internalGetMutableFloorOpenTimeMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, Integer> getMutableFloorOpenTimeMap() {
                return this.internalGetMutableFloorOpenTimeMap().getMutableMap();
            }
            
            public Builder putFloorOpenTimeMap(final int key, final int value) {
                this.internalGetMutableFloorOpenTimeMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllFloorOpenTimeMap(final Map<Integer, Integer> values) {
                this.internalGetMutableFloorOpenTimeMap().getMutableMap().putAll(values);
                return this;
            }
            
            @Override
            public boolean hasCurLevelRecord() {
                return this.curLevelRecordBuilder_ != null || this.curLevelRecord_ != null;
            }
            
            @Override
            public TowerCurLevelRecordOuterClass.TowerCurLevelRecord getCurLevelRecord() {
                if (this.curLevelRecordBuilder_ == null) {
                    return (this.curLevelRecord_ == null) ? TowerCurLevelRecordOuterClass.TowerCurLevelRecord.getDefaultInstance() : this.curLevelRecord_;
                }
                return this.curLevelRecordBuilder_.getMessage();
            }
            
            public Builder setCurLevelRecord(final TowerCurLevelRecordOuterClass.TowerCurLevelRecord value) {
                if (this.curLevelRecordBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.curLevelRecord_ = value;
                    this.onChanged();
                }
                else {
                    this.curLevelRecordBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setCurLevelRecord(final TowerCurLevelRecordOuterClass.TowerCurLevelRecord.Builder builderForValue) {
                if (this.curLevelRecordBuilder_ == null) {
                    this.curLevelRecord_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.curLevelRecordBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeCurLevelRecord(final TowerCurLevelRecordOuterClass.TowerCurLevelRecord value) {
                if (this.curLevelRecordBuilder_ == null) {
                    if (this.curLevelRecord_ != null) {
                        this.curLevelRecord_ = TowerCurLevelRecordOuterClass.TowerCurLevelRecord.newBuilder(this.curLevelRecord_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.curLevelRecord_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.curLevelRecordBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearCurLevelRecord() {
                if (this.curLevelRecordBuilder_ == null) {
                    this.curLevelRecord_ = null;
                    this.onChanged();
                }
                else {
                    this.curLevelRecord_ = null;
                    this.curLevelRecordBuilder_ = null;
                }
                return this;
            }
            
            public TowerCurLevelRecordOuterClass.TowerCurLevelRecord.Builder getCurLevelRecordBuilder() {
                this.onChanged();
                return this.getCurLevelRecordFieldBuilder().getBuilder();
            }
            
            @Override
            public TowerCurLevelRecordOuterClass.TowerCurLevelRecordOrBuilder getCurLevelRecordOrBuilder() {
                if (this.curLevelRecordBuilder_ != null) {
                    return this.curLevelRecordBuilder_.getMessageOrBuilder();
                }
                return (this.curLevelRecord_ == null) ? TowerCurLevelRecordOuterClass.TowerCurLevelRecord.getDefaultInstance() : this.curLevelRecord_;
            }
            
            private SingleFieldBuilderV3<TowerCurLevelRecordOuterClass.TowerCurLevelRecord, TowerCurLevelRecordOuterClass.TowerCurLevelRecord.Builder, TowerCurLevelRecordOuterClass.TowerCurLevelRecordOrBuilder> getCurLevelRecordFieldBuilder() {
                if (this.curLevelRecordBuilder_ == null) {
                    this.curLevelRecordBuilder_ = new SingleFieldBuilderV3<TowerCurLevelRecordOuterClass.TowerCurLevelRecord, TowerCurLevelRecordOuterClass.TowerCurLevelRecord.Builder, TowerCurLevelRecordOuterClass.TowerCurLevelRecordOrBuilder>(this.getCurLevelRecord(), this.getParentForChildren(), this.isClean());
                    this.curLevelRecord_ = null;
                }
                return this.curLevelRecordBuilder_;
            }
            
            @Override
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getScheduleStartTime() {
                return this.scheduleStartTime_;
            }
            
            public Builder setScheduleStartTime(final int value) {
                this.scheduleStartTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearScheduleStartTime() {
                this.scheduleStartTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasMonthlyBrief() {
                return this.monthlyBriefBuilder_ != null || this.monthlyBrief_ != null;
            }
            
            @Override
            public TowerMonthlyBriefOuterClass.TowerMonthlyBrief getMonthlyBrief() {
                if (this.monthlyBriefBuilder_ == null) {
                    return (this.monthlyBrief_ == null) ? TowerMonthlyBriefOuterClass.TowerMonthlyBrief.getDefaultInstance() : this.monthlyBrief_;
                }
                return this.monthlyBriefBuilder_.getMessage();
            }
            
            public Builder setMonthlyBrief(final TowerMonthlyBriefOuterClass.TowerMonthlyBrief value) {
                if (this.monthlyBriefBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.monthlyBrief_ = value;
                    this.onChanged();
                }
                else {
                    this.monthlyBriefBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setMonthlyBrief(final TowerMonthlyBriefOuterClass.TowerMonthlyBrief.Builder builderForValue) {
                if (this.monthlyBriefBuilder_ == null) {
                    this.monthlyBrief_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.monthlyBriefBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeMonthlyBrief(final TowerMonthlyBriefOuterClass.TowerMonthlyBrief value) {
                if (this.monthlyBriefBuilder_ == null) {
                    if (this.monthlyBrief_ != null) {
                        this.monthlyBrief_ = TowerMonthlyBriefOuterClass.TowerMonthlyBrief.newBuilder(this.monthlyBrief_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.monthlyBrief_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.monthlyBriefBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearMonthlyBrief() {
                if (this.monthlyBriefBuilder_ == null) {
                    this.monthlyBrief_ = null;
                    this.onChanged();
                }
                else {
                    this.monthlyBrief_ = null;
                    this.monthlyBriefBuilder_ = null;
                }
                return this;
            }
            
            public TowerMonthlyBriefOuterClass.TowerMonthlyBrief.Builder getMonthlyBriefBuilder() {
                this.onChanged();
                return this.getMonthlyBriefFieldBuilder().getBuilder();
            }
            
            @Override
            public TowerMonthlyBriefOuterClass.TowerMonthlyBriefOrBuilder getMonthlyBriefOrBuilder() {
                if (this.monthlyBriefBuilder_ != null) {
                    return this.monthlyBriefBuilder_.getMessageOrBuilder();
                }
                return (this.monthlyBrief_ == null) ? TowerMonthlyBriefOuterClass.TowerMonthlyBrief.getDefaultInstance() : this.monthlyBrief_;
            }
            
            private SingleFieldBuilderV3<TowerMonthlyBriefOuterClass.TowerMonthlyBrief, TowerMonthlyBriefOuterClass.TowerMonthlyBrief.Builder, TowerMonthlyBriefOuterClass.TowerMonthlyBriefOrBuilder> getMonthlyBriefFieldBuilder() {
                if (this.monthlyBriefBuilder_ == null) {
                    this.monthlyBriefBuilder_ = new SingleFieldBuilderV3<TowerMonthlyBriefOuterClass.TowerMonthlyBrief, TowerMonthlyBriefOuterClass.TowerMonthlyBrief.Builder, TowerMonthlyBriefOuterClass.TowerMonthlyBriefOrBuilder>(this.getMonthlyBrief(), this.getParentForChildren(), this.isClean());
                    this.monthlyBrief_ = null;
                }
                return this.monthlyBriefBuilder_;
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
    
    public interface TowerAllDataRspOrBuilder extends MessageOrBuilder
    {
        int getTowerScheduleId();
        
        int getDailyLevelIndex();
        
        int getSkipFloorGrantedRewardItemMapCount();
        
        boolean containsSkipFloorGrantedRewardItemMap(final int p0);
        
        @Deprecated
        Map<Integer, Integer> getSkipFloorGrantedRewardItemMap();
        
        Map<Integer, Integer> getSkipFloorGrantedRewardItemMapMap();
        
        int getSkipFloorGrantedRewardItemMapOrDefault(final int p0, final int p1);
        
        int getSkipFloorGrantedRewardItemMapOrThrow(final int p0);
        
        boolean getIsFirstInteract();
        
        boolean getIsFinishedEntranceFloor();
        
        List<TowerFloorRecordOuterClass.TowerFloorRecord> getTowerFloorRecordListList();
        
        TowerFloorRecordOuterClass.TowerFloorRecord getTowerFloorRecordList(final int p0);
        
        int getTowerFloorRecordListCount();
        
        List<? extends TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder> getTowerFloorRecordListOrBuilderList();
        
        TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder getTowerFloorRecordListOrBuilder(final int p0);
        
        int getDailyFloorId();
        
        int getCommemorativeRewardId();
        
        boolean hasLastScheduleMonthlyBrief();
        
        TowerMonthlyBriefOuterClass.TowerMonthlyBrief getLastScheduleMonthlyBrief();
        
        TowerMonthlyBriefOuterClass.TowerMonthlyBriefOrBuilder getLastScheduleMonthlyBriefOrBuilder();
        
        int getNextScheduleChangeTime();
        
        int getValidTowerRecordNum();
        
        int getSkipToFloorIndex();
        
        int getFloorOpenTimeMapCount();
        
        boolean containsFloorOpenTimeMap(final int p0);
        
        @Deprecated
        Map<Integer, Integer> getFloorOpenTimeMap();
        
        Map<Integer, Integer> getFloorOpenTimeMapMap();
        
        int getFloorOpenTimeMapOrDefault(final int p0, final int p1);
        
        int getFloorOpenTimeMapOrThrow(final int p0);
        
        boolean hasCurLevelRecord();
        
        TowerCurLevelRecordOuterClass.TowerCurLevelRecord getCurLevelRecord();
        
        TowerCurLevelRecordOuterClass.TowerCurLevelRecordOrBuilder getCurLevelRecordOrBuilder();
        
        int getRetcode();
        
        int getScheduleStartTime();
        
        boolean hasMonthlyBrief();
        
        TowerMonthlyBriefOuterClass.TowerMonthlyBrief getMonthlyBrief();
        
        TowerMonthlyBriefOuterClass.TowerMonthlyBriefOrBuilder getMonthlyBriefOrBuilder();
    }
}
