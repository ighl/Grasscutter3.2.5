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
import java.util.List;
import com.google.protobuf.MapField;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class ActivityInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_ActivityInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActivityInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ActivityInfo_ActivityCoinMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActivityInfo_ActivityCoinMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ActivityInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ActivityInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0012ActivityInfo.proto\u001a\u0019ActivityWatcherInfo.proto\u001a!MusicGameActivityDetailInfo.proto\u001a\u0019Unk2800_PHPHMILPOLC.proto\"ª\u0005\n\fActivityInfo\u0012\u0019\n\u0011is_play_open_anim\u0018\r \u0001(\b\u0012\u0013\n\u000bschedule_id\u0018\u000f \u0001(\r\u0012\u0012\n\tcur_score\u0018\u00f2\u000e \u0001(\r\u0012\u0013\n\u000bis_starting\u0018\t \u0001(\b\u0012\u001a\n\u0011taken_reward_list\u0018\u00c9\u0002 \u0003(\r\u0012\"\n\u0019selected_avatar_reward_id\u0018\u008a\n \u0001(\r\u0012\u001d\n\u0014first_day_start_time\u0018\u00d0\u0004 \u0001(\r\u0012\u0014\n\u000bscore_limit\u0018¦\u000f \u0001(\r\u0012\u0013\n\u000bis_finished\u0018\u0006 \u0001(\b\u0012\u0012\n\tis_hidden\u0018\u0097\u0007 \u0001(\b\u0012\u0012\n\nbegin_time\u0018\b \u0001(\r\u0012\u0010\n\bend_time\u0018\u0005 \u0001(\r\u0012>\n\u0011activity_coin_map\u0018ª\u0005 \u0003(\u000b2\".ActivityInfo.ActivityCoinMapEntry\u0012\u0015\n\ractivity_type\u0018\u0004 \u0001(\r\u00122\n\u0013Unk2800_KOMIPKKKOBE\u0018\u00e0\u0006 \u0003(\u000b2\u0014.Unk2800_PHPHMILPOLC\u0012\u0016\n\u000emeet_cond_list\u0018\n \u0003(\r\u0012\u0018\n\u0010expire_cond_list\u0018\u0003 \u0003(\r\u0012/\n\u0011watcher_info_list\u0018\u0002 \u0003(\u000b2\u0014.ActivityWatcherInfo\u0012\u0013\n\u000bactivity_id\u0018\f \u0001(\r\u00128\n\u000fmusic_game_info\u0018\u00cc\u0003 \u0001(\u000b2\u001c.MusicGameActivityDetailInfoH\u0000\u001a6\n\u0014ActivityCoinMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001B\b\n\u0006detailB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ActivityInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ActivityWatcherInfoOuterClass.getDescriptor(), MusicGameActivityDetailInfoOuterClass.getDescriptor(), Unk2800PHPHMILPOLC.getDescriptor() });
        internal_static_ActivityInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ActivityInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ActivityInfoOuterClass.internal_static_ActivityInfo_descriptor, new String[] { "IsPlayOpenAnim", "ScheduleId", "CurScore", "IsStarting", "TakenRewardList", "SelectedAvatarRewardId", "FirstDayStartTime", "ScoreLimit", "IsFinished", "IsHidden", "BeginTime", "EndTime", "ActivityCoinMap", "ActivityType", "Unk2800KOMIPKKKOBE", "MeetCondList", "ExpireCondList", "WatcherInfoList", "ActivityId", "MusicGameInfo", "Detail" });
        internal_static_ActivityInfo_ActivityCoinMapEntry_descriptor = ActivityInfoOuterClass.internal_static_ActivityInfo_descriptor.getNestedTypes().get(0);
        internal_static_ActivityInfo_ActivityCoinMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ActivityInfoOuterClass.internal_static_ActivityInfo_ActivityCoinMapEntry_descriptor, new String[] { "Key", "Value" });
        ActivityWatcherInfoOuterClass.getDescriptor();
        MusicGameActivityDetailInfoOuterClass.getDescriptor();
        Unk2800PHPHMILPOLC.getDescriptor();
    }
    
    public static final class ActivityInfo extends GeneratedMessageV3 implements ActivityInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private int detailCase_;
        private Object detail_;
        public static final int IS_PLAY_OPEN_ANIM_FIELD_NUMBER = 13;
        private boolean isPlayOpenAnim_;
        public static final int SCHEDULE_ID_FIELD_NUMBER = 15;
        private int scheduleId_;
        public static final int CUR_SCORE_FIELD_NUMBER = 1906;
        private int curScore_;
        public static final int IS_STARTING_FIELD_NUMBER = 9;
        private boolean isStarting_;
        public static final int TAKEN_REWARD_LIST_FIELD_NUMBER = 329;
        private Internal.IntList takenRewardList_;
        private int takenRewardListMemoizedSerializedSize;
        public static final int SELECTED_AVATAR_REWARD_ID_FIELD_NUMBER = 1290;
        private int selectedAvatarRewardId_;
        public static final int FIRST_DAY_START_TIME_FIELD_NUMBER = 592;
        private int firstDayStartTime_;
        public static final int SCORE_LIMIT_FIELD_NUMBER = 1958;
        private int scoreLimit_;
        public static final int IS_FINISHED_FIELD_NUMBER = 6;
        private boolean isFinished_;
        public static final int IS_HIDDEN_FIELD_NUMBER = 919;
        private boolean isHidden_;
        public static final int BEGIN_TIME_FIELD_NUMBER = 8;
        private int beginTime_;
        public static final int END_TIME_FIELD_NUMBER = 5;
        private int endTime_;
        public static final int ACTIVITY_COIN_MAP_FIELD_NUMBER = 682;
        private MapField<Integer, Integer> activityCoinMap_;
        public static final int ACTIVITY_TYPE_FIELD_NUMBER = 4;
        private int activityType_;
        public static final int UNK2800_KOMIPKKKOBE_FIELD_NUMBER = 864;
        private List<Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC> unk2800KOMIPKKKOBE_;
        public static final int MEET_COND_LIST_FIELD_NUMBER = 10;
        private Internal.IntList meetCondList_;
        private int meetCondListMemoizedSerializedSize;
        public static final int EXPIRE_COND_LIST_FIELD_NUMBER = 3;
        private Internal.IntList expireCondList_;
        private int expireCondListMemoizedSerializedSize;
        public static final int WATCHER_INFO_LIST_FIELD_NUMBER = 2;
        private List<ActivityWatcherInfoOuterClass.ActivityWatcherInfo> watcherInfoList_;
        public static final int ACTIVITY_ID_FIELD_NUMBER = 12;
        private int activityId_;
        public static final int MUSIC_GAME_INFO_FIELD_NUMBER = 460;
        private byte memoizedIsInitialized;
        private static final ActivityInfo DEFAULT_INSTANCE;
        private static final Parser<ActivityInfo> PARSER;
        
        private ActivityInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.detailCase_ = 0;
            this.takenRewardListMemoizedSerializedSize = -1;
            this.meetCondListMemoizedSerializedSize = -1;
            this.expireCondListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private ActivityInfo() {
            this.detailCase_ = 0;
            this.takenRewardListMemoizedSerializedSize = -1;
            this.meetCondListMemoizedSerializedSize = -1;
            this.expireCondListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.takenRewardList_ = GeneratedMessageV3.emptyIntList();
            this.unk2800KOMIPKKKOBE_ = Collections.emptyList();
            this.meetCondList_ = GeneratedMessageV3.emptyIntList();
            this.expireCondList_ = GeneratedMessageV3.emptyIntList();
            this.watcherInfoList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ActivityInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ActivityInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 18: {
                            if ((mutable_bitField0_ & 0x20) == 0x0) {
                                this.watcherInfoList_ = new ArrayList<ActivityWatcherInfoOuterClass.ActivityWatcherInfo>();
                                mutable_bitField0_ |= 0x20;
                            }
                            this.watcherInfoList_.add(input.readMessage(ActivityWatcherInfoOuterClass.ActivityWatcherInfo.parser(), extensionRegistry));
                            continue;
                        }
                        case 24: {
                            if ((mutable_bitField0_ & 0x10) == 0x0) {
                                this.expireCondList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x10;
                            }
                            this.expireCondList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 26: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x10) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.expireCondList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x10;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.expireCondList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 32: {
                            this.activityType_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.endTime_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.isFinished_ = input.readBool();
                            continue;
                        }
                        case 64: {
                            this.beginTime_ = input.readUInt32();
                            continue;
                        }
                        case 72: {
                            this.isStarting_ = input.readBool();
                            continue;
                        }
                        case 80: {
                            if ((mutable_bitField0_ & 0x8) == 0x0) {
                                this.meetCondList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x8;
                            }
                            this.meetCondList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 82: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x8) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.meetCondList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x8;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.meetCondList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 96: {
                            this.activityId_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.isPlayOpenAnim_ = input.readBool();
                            continue;
                        }
                        case 120: {
                            this.scheduleId_ = input.readUInt32();
                            continue;
                        }
                        case 2632: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.takenRewardList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.takenRewardList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 2634: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.takenRewardList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.takenRewardList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 3682: {
                            MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo.Builder subBuilder = null;
                            if (this.detailCase_ == 460) {
                                subBuilder = ((MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo)this.detail_).toBuilder();
                            }
                            this.detail_ = input.readMessage(MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo)this.detail_);
                                this.detail_ = subBuilder.buildPartial();
                            }
                            this.detailCase_ = 460;
                            continue;
                        }
                        case 4736: {
                            this.firstDayStartTime_ = input.readUInt32();
                            continue;
                        }
                        case 5458: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.activityCoinMap_ = MapField.newMapField(ActivityCoinMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x2;
                            }
                            final MapEntry<Integer, Integer> activityCoinMap__ = input.readMessage(ActivityCoinMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.activityCoinMap_.getMutableMap().put(activityCoinMap__.getKey(), activityCoinMap__.getValue());
                            continue;
                        }
                        case 6914: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.unk2800KOMIPKKKOBE_ = new ArrayList<Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC>();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.unk2800KOMIPKKKOBE_.add(input.readMessage(Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC.parser(), extensionRegistry));
                            continue;
                        }
                        case 7352: {
                            this.isHidden_ = input.readBool();
                            continue;
                        }
                        case 10320: {
                            this.selectedAvatarRewardId_ = input.readUInt32();
                            continue;
                        }
                        case 15248: {
                            this.curScore_ = input.readUInt32();
                            continue;
                        }
                        case 15664: {
                            this.scoreLimit_ = input.readUInt32();
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
                if ((mutable_bitField0_ & 0x20) != 0x0) {
                    this.watcherInfoList_ = Collections.unmodifiableList((List<? extends ActivityWatcherInfoOuterClass.ActivityWatcherInfo>)this.watcherInfoList_);
                }
                if ((mutable_bitField0_ & 0x10) != 0x0) {
                    this.expireCondList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x8) != 0x0) {
                    this.meetCondList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.takenRewardList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x4) != 0x0) {
                    this.unk2800KOMIPKKKOBE_ = Collections.unmodifiableList((List<? extends Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC>)this.unk2800KOMIPKKKOBE_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ActivityInfoOuterClass.internal_static_ActivityInfo_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 682: {
                    return this.internalGetActivityCoinMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityInfoOuterClass.internal_static_ActivityInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ActivityInfo.class, Builder.class);
        }
        
        @Override
        public DetailCase getDetailCase() {
            return DetailCase.forNumber(this.detailCase_);
        }
        
        @Override
        public boolean getIsPlayOpenAnim() {
            return this.isPlayOpenAnim_;
        }
        
        @Override
        public int getScheduleId() {
            return this.scheduleId_;
        }
        
        @Override
        public int getCurScore() {
            return this.curScore_;
        }
        
        @Override
        public boolean getIsStarting() {
            return this.isStarting_;
        }
        
        @Override
        public List<Integer> getTakenRewardListList() {
            return this.takenRewardList_;
        }
        
        @Override
        public int getTakenRewardListCount() {
            return this.takenRewardList_.size();
        }
        
        @Override
        public int getTakenRewardList(final int index) {
            return this.takenRewardList_.getInt(index);
        }
        
        @Override
        public int getSelectedAvatarRewardId() {
            return this.selectedAvatarRewardId_;
        }
        
        @Override
        public int getFirstDayStartTime() {
            return this.firstDayStartTime_;
        }
        
        @Override
        public int getScoreLimit() {
            return this.scoreLimit_;
        }
        
        @Override
        public boolean getIsFinished() {
            return this.isFinished_;
        }
        
        @Override
        public boolean getIsHidden() {
            return this.isHidden_;
        }
        
        @Override
        public int getBeginTime() {
            return this.beginTime_;
        }
        
        @Override
        public int getEndTime() {
            return this.endTime_;
        }
        
        private MapField<Integer, Integer> internalGetActivityCoinMap() {
            if (this.activityCoinMap_ == null) {
                return MapField.emptyMapField(ActivityCoinMapDefaultEntryHolder.defaultEntry);
            }
            return this.activityCoinMap_;
        }
        
        @Override
        public int getActivityCoinMapCount() {
            return this.internalGetActivityCoinMap().getMap().size();
        }
        
        @Override
        public boolean containsActivityCoinMap(final int key) {
            return this.internalGetActivityCoinMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, Integer> getActivityCoinMap() {
            return this.getActivityCoinMapMap();
        }
        
        @Override
        public Map<Integer, Integer> getActivityCoinMapMap() {
            return this.internalGetActivityCoinMap().getMap();
        }
        
        @Override
        public int getActivityCoinMapOrDefault(final int key, final int defaultValue) {
            final Map<Integer, Integer> map = this.internalGetActivityCoinMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public int getActivityCoinMapOrThrow(final int key) {
            final Map<Integer, Integer> map = this.internalGetActivityCoinMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public int getActivityType() {
            return this.activityType_;
        }
        
        @Override
        public List<Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC> getUnk2800KOMIPKKKOBEList() {
            return this.unk2800KOMIPKKKOBE_;
        }
        
        @Override
        public List<? extends Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLCOrBuilder> getUnk2800KOMIPKKKOBEOrBuilderList() {
            return this.unk2800KOMIPKKKOBE_;
        }
        
        @Override
        public int getUnk2800KOMIPKKKOBECount() {
            return this.unk2800KOMIPKKKOBE_.size();
        }
        
        @Override
        public Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC getUnk2800KOMIPKKKOBE(final int index) {
            return this.unk2800KOMIPKKKOBE_.get(index);
        }
        
        @Override
        public Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLCOrBuilder getUnk2800KOMIPKKKOBEOrBuilder(final int index) {
            return this.unk2800KOMIPKKKOBE_.get(index);
        }
        
        @Override
        public List<Integer> getMeetCondListList() {
            return this.meetCondList_;
        }
        
        @Override
        public int getMeetCondListCount() {
            return this.meetCondList_.size();
        }
        
        @Override
        public int getMeetCondList(final int index) {
            return this.meetCondList_.getInt(index);
        }
        
        @Override
        public List<Integer> getExpireCondListList() {
            return this.expireCondList_;
        }
        
        @Override
        public int getExpireCondListCount() {
            return this.expireCondList_.size();
        }
        
        @Override
        public int getExpireCondList(final int index) {
            return this.expireCondList_.getInt(index);
        }
        
        @Override
        public List<ActivityWatcherInfoOuterClass.ActivityWatcherInfo> getWatcherInfoListList() {
            return this.watcherInfoList_;
        }
        
        @Override
        public List<? extends ActivityWatcherInfoOuterClass.ActivityWatcherInfoOrBuilder> getWatcherInfoListOrBuilderList() {
            return this.watcherInfoList_;
        }
        
        @Override
        public int getWatcherInfoListCount() {
            return this.watcherInfoList_.size();
        }
        
        @Override
        public ActivityWatcherInfoOuterClass.ActivityWatcherInfo getWatcherInfoList(final int index) {
            return this.watcherInfoList_.get(index);
        }
        
        @Override
        public ActivityWatcherInfoOuterClass.ActivityWatcherInfoOrBuilder getWatcherInfoListOrBuilder(final int index) {
            return this.watcherInfoList_.get(index);
        }
        
        @Override
        public int getActivityId() {
            return this.activityId_;
        }
        
        @Override
        public boolean hasMusicGameInfo() {
            return this.detailCase_ == 460;
        }
        
        @Override
        public MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo getMusicGameInfo() {
            if (this.detailCase_ == 460) {
                return (MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo)this.detail_;
            }
            return MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo.getDefaultInstance();
        }
        
        @Override
        public MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfoOrBuilder getMusicGameInfoOrBuilder() {
            if (this.detailCase_ == 460) {
                return (MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo)this.detail_;
            }
            return MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo.getDefaultInstance();
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
            for (int i = 0; i < this.watcherInfoList_.size(); ++i) {
                output.writeMessage(2, this.watcherInfoList_.get(i));
            }
            if (this.getExpireCondListList().size() > 0) {
                output.writeUInt32NoTag(26);
                output.writeUInt32NoTag(this.expireCondListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.expireCondList_.size(); ++i) {
                output.writeUInt32NoTag(this.expireCondList_.getInt(i));
            }
            if (this.activityType_ != 0) {
                output.writeUInt32(4, this.activityType_);
            }
            if (this.endTime_ != 0) {
                output.writeUInt32(5, this.endTime_);
            }
            if (this.isFinished_) {
                output.writeBool(6, this.isFinished_);
            }
            if (this.beginTime_ != 0) {
                output.writeUInt32(8, this.beginTime_);
            }
            if (this.isStarting_) {
                output.writeBool(9, this.isStarting_);
            }
            if (this.getMeetCondListList().size() > 0) {
                output.writeUInt32NoTag(82);
                output.writeUInt32NoTag(this.meetCondListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.meetCondList_.size(); ++i) {
                output.writeUInt32NoTag(this.meetCondList_.getInt(i));
            }
            if (this.activityId_ != 0) {
                output.writeUInt32(12, this.activityId_);
            }
            if (this.isPlayOpenAnim_) {
                output.writeBool(13, this.isPlayOpenAnim_);
            }
            if (this.scheduleId_ != 0) {
                output.writeUInt32(15, this.scheduleId_);
            }
            if (this.getTakenRewardListList().size() > 0) {
                output.writeUInt32NoTag(2634);
                output.writeUInt32NoTag(this.takenRewardListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.takenRewardList_.size(); ++i) {
                output.writeUInt32NoTag(this.takenRewardList_.getInt(i));
            }
            if (this.detailCase_ == 460) {
                output.writeMessage(460, (MessageLite)this.detail_);
            }
            if (this.firstDayStartTime_ != 0) {
                output.writeUInt32(592, this.firstDayStartTime_);
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetActivityCoinMap(), ActivityCoinMapDefaultEntryHolder.defaultEntry, 682);
            for (int i = 0; i < this.unk2800KOMIPKKKOBE_.size(); ++i) {
                output.writeMessage(864, this.unk2800KOMIPKKKOBE_.get(i));
            }
            if (this.isHidden_) {
                output.writeBool(919, this.isHidden_);
            }
            if (this.selectedAvatarRewardId_ != 0) {
                output.writeUInt32(1290, this.selectedAvatarRewardId_);
            }
            if (this.curScore_ != 0) {
                output.writeUInt32(1906, this.curScore_);
            }
            if (this.scoreLimit_ != 0) {
                output.writeUInt32(1958, this.scoreLimit_);
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
            for (int i = 0; i < this.watcherInfoList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(2, this.watcherInfoList_.get(i));
            }
            int dataSize = 0;
            for (int j = 0; j < this.expireCondList_.size(); ++j) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.expireCondList_.getInt(j));
            }
            size += dataSize;
            if (!this.getExpireCondListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.expireCondListMemoizedSerializedSize = dataSize;
            if (this.activityType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.activityType_);
            }
            if (this.endTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.endTime_);
            }
            if (this.isFinished_) {
                size += CodedOutputStream.computeBoolSize(6, this.isFinished_);
            }
            if (this.beginTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.beginTime_);
            }
            if (this.isStarting_) {
                size += CodedOutputStream.computeBoolSize(9, this.isStarting_);
            }
            dataSize = 0;
            for (int j = 0; j < this.meetCondList_.size(); ++j) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.meetCondList_.getInt(j));
            }
            size += dataSize;
            if (!this.getMeetCondListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.meetCondListMemoizedSerializedSize = dataSize;
            if (this.activityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.activityId_);
            }
            if (this.isPlayOpenAnim_) {
                size += CodedOutputStream.computeBoolSize(13, this.isPlayOpenAnim_);
            }
            if (this.scheduleId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.scheduleId_);
            }
            dataSize = 0;
            for (int j = 0; j < this.takenRewardList_.size(); ++j) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.takenRewardList_.getInt(j));
            }
            size += dataSize;
            if (!this.getTakenRewardListList().isEmpty()) {
                size += 2;
                size += CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.takenRewardListMemoizedSerializedSize = dataSize;
            if (this.detailCase_ == 460) {
                size += CodedOutputStream.computeMessageSize(460, (MessageLite)this.detail_);
            }
            if (this.firstDayStartTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(592, this.firstDayStartTime_);
            }
            for (final Map.Entry<Integer, Integer> entry : this.internalGetActivityCoinMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> activityCoinMap__ = ActivityCoinMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(682, activityCoinMap__);
            }
            for (int i = 0; i < this.unk2800KOMIPKKKOBE_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(864, this.unk2800KOMIPKKKOBE_.get(i));
            }
            if (this.isHidden_) {
                size += CodedOutputStream.computeBoolSize(919, this.isHidden_);
            }
            if (this.selectedAvatarRewardId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1290, this.selectedAvatarRewardId_);
            }
            if (this.curScore_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1906, this.curScore_);
            }
            if (this.scoreLimit_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1958, this.scoreLimit_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActivityInfo)) {
                return super.equals(obj);
            }
            final ActivityInfo other = (ActivityInfo)obj;
            if (this.getIsPlayOpenAnim() != other.getIsPlayOpenAnim()) {
                return false;
            }
            if (this.getScheduleId() != other.getScheduleId()) {
                return false;
            }
            if (this.getCurScore() != other.getCurScore()) {
                return false;
            }
            if (this.getIsStarting() != other.getIsStarting()) {
                return false;
            }
            if (!this.getTakenRewardListList().equals(other.getTakenRewardListList())) {
                return false;
            }
            if (this.getSelectedAvatarRewardId() != other.getSelectedAvatarRewardId()) {
                return false;
            }
            if (this.getFirstDayStartTime() != other.getFirstDayStartTime()) {
                return false;
            }
            if (this.getScoreLimit() != other.getScoreLimit()) {
                return false;
            }
            if (this.getIsFinished() != other.getIsFinished()) {
                return false;
            }
            if (this.getIsHidden() != other.getIsHidden()) {
                return false;
            }
            if (this.getBeginTime() != other.getBeginTime()) {
                return false;
            }
            if (this.getEndTime() != other.getEndTime()) {
                return false;
            }
            if (!this.internalGetActivityCoinMap().equals(other.internalGetActivityCoinMap())) {
                return false;
            }
            if (this.getActivityType() != other.getActivityType()) {
                return false;
            }
            if (!this.getUnk2800KOMIPKKKOBEList().equals(other.getUnk2800KOMIPKKKOBEList())) {
                return false;
            }
            if (!this.getMeetCondListList().equals(other.getMeetCondListList())) {
                return false;
            }
            if (!this.getExpireCondListList().equals(other.getExpireCondListList())) {
                return false;
            }
            if (!this.getWatcherInfoListList().equals(other.getWatcherInfoListList())) {
                return false;
            }
            if (this.getActivityId() != other.getActivityId()) {
                return false;
            }
            if (!this.getDetailCase().equals(other.getDetailCase())) {
                return false;
            }
            switch (this.detailCase_) {
                case 460: {
                    if (!this.getMusicGameInfo().equals(other.getMusicGameInfo())) {
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
            hash = 37 * hash + 13;
            hash = 53 * hash + Internal.hashBoolean(this.getIsPlayOpenAnim());
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getScheduleId();
            hash = 37 * hash + 1906;
            hash = 53 * hash + this.getCurScore();
            hash = 37 * hash + 9;
            hash = 53 * hash + Internal.hashBoolean(this.getIsStarting());
            if (this.getTakenRewardListCount() > 0) {
                hash = 37 * hash + 329;
                hash = 53 * hash + this.getTakenRewardListList().hashCode();
            }
            hash = 37 * hash + 1290;
            hash = 53 * hash + this.getSelectedAvatarRewardId();
            hash = 37 * hash + 592;
            hash = 53 * hash + this.getFirstDayStartTime();
            hash = 37 * hash + 1958;
            hash = 53 * hash + this.getScoreLimit();
            hash = 37 * hash + 6;
            hash = 53 * hash + Internal.hashBoolean(this.getIsFinished());
            hash = 37 * hash + 919;
            hash = 53 * hash + Internal.hashBoolean(this.getIsHidden());
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getBeginTime();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getEndTime();
            if (!this.internalGetActivityCoinMap().getMap().isEmpty()) {
                hash = 37 * hash + 682;
                hash = 53 * hash + this.internalGetActivityCoinMap().hashCode();
            }
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getActivityType();
            if (this.getUnk2800KOMIPKKKOBECount() > 0) {
                hash = 37 * hash + 864;
                hash = 53 * hash + this.getUnk2800KOMIPKKKOBEList().hashCode();
            }
            if (this.getMeetCondListCount() > 0) {
                hash = 37 * hash + 10;
                hash = 53 * hash + this.getMeetCondListList().hashCode();
            }
            if (this.getExpireCondListCount() > 0) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getExpireCondListList().hashCode();
            }
            if (this.getWatcherInfoListCount() > 0) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getWatcherInfoListList().hashCode();
            }
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getActivityId();
            switch (this.detailCase_) {
                case 460: {
                    hash = 37 * hash + 460;
                    hash = 53 * hash + this.getMusicGameInfo().hashCode();
                    break;
                }
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ActivityInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ActivityInfo.PARSER.parseFrom(data);
        }
        
        public static ActivityInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ActivityInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ActivityInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ActivityInfo.PARSER.parseFrom(data);
        }
        
        public static ActivityInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ActivityInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ActivityInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ActivityInfo.PARSER.parseFrom(data);
        }
        
        public static ActivityInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ActivityInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ActivityInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ActivityInfo.PARSER, input);
        }
        
        public static ActivityInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ActivityInfo.PARSER, input, extensionRegistry);
        }
        
        public static ActivityInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ActivityInfo.PARSER, input);
        }
        
        public static ActivityInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ActivityInfo.PARSER, input, extensionRegistry);
        }
        
        public static ActivityInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ActivityInfo.PARSER, input);
        }
        
        public static ActivityInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ActivityInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ActivityInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ActivityInfo prototype) {
            return ActivityInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ActivityInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ActivityInfo getDefaultInstance() {
            return ActivityInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<ActivityInfo> parser() {
            return ActivityInfo.PARSER;
        }
        
        @Override
        public Parser<ActivityInfo> getParserForType() {
            return ActivityInfo.PARSER;
        }
        
        @Override
        public ActivityInfo getDefaultInstanceForType() {
            return ActivityInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ActivityInfo();
            PARSER = new AbstractParser<ActivityInfo>() {
                @Override
                public ActivityInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ActivityInfo(input, extensionRegistry);
                }
            };
        }
        
        public enum DetailCase implements Internal.EnumLite, InternalOneOfEnum
        {
            MUSIC_GAME_INFO(460), 
            DETAIL_NOT_SET(0);
            
            private final int value;
            
            private DetailCase(final int value) {
                this.value = value;
            }
            
            @Deprecated
            public static DetailCase valueOf(final int value) {
                return forNumber(value);
            }
            
            public static DetailCase forNumber(final int value) {
                switch (value) {
                    case 460: {
                        return DetailCase.MUSIC_GAME_INFO;
                    }
                    case 0: {
                        return DetailCase.DETAIL_NOT_SET;
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
            
            private static /* synthetic */ DetailCase[] value() {
                return new DetailCase[] { DetailCase.MUSIC_GAME_INFO, DetailCase.DETAIL_NOT_SET };
            }
            
            
        }
        
        private static final class ActivityCoinMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(ActivityInfoOuterClass.internal_static_ActivityInfo_ActivityCoinMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActivityInfoOrBuilder
        {
            private int detailCase_;
            private Object detail_;
            private int bitField0_;
            private boolean isPlayOpenAnim_;
            private int scheduleId_;
            private int curScore_;
            private boolean isStarting_;
            private Internal.IntList takenRewardList_;
            private int selectedAvatarRewardId_;
            private int firstDayStartTime_;
            private int scoreLimit_;
            private boolean isFinished_;
            private boolean isHidden_;
            private int beginTime_;
            private int endTime_;
            private MapField<Integer, Integer> activityCoinMap_;
            private int activityType_;
            private List<Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC> unk2800KOMIPKKKOBE_;
            private RepeatedFieldBuilderV3<Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC, Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC.Builder, Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLCOrBuilder> unk2800KOMIPKKKOBEBuilder_;
            private Internal.IntList meetCondList_;
            private Internal.IntList expireCondList_;
            private List<ActivityWatcherInfoOuterClass.ActivityWatcherInfo> watcherInfoList_;
            private RepeatedFieldBuilderV3<ActivityWatcherInfoOuterClass.ActivityWatcherInfo, ActivityWatcherInfoOuterClass.ActivityWatcherInfo.Builder, ActivityWatcherInfoOuterClass.ActivityWatcherInfoOrBuilder> watcherInfoListBuilder_;
            private int activityId_;
            private SingleFieldBuilderV3<MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo, MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo.Builder, MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfoOrBuilder> musicGameInfoBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ActivityInfoOuterClass.internal_static_ActivityInfo_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 682: {
                        return this.internalGetActivityCoinMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected MapField internalGetMutableMapField(final int number) {
                switch (number) {
                    case 682: {
                        return this.internalGetMutableActivityCoinMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ActivityInfoOuterClass.internal_static_ActivityInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ActivityInfo.class, Builder.class);
            }
            
            private Builder() {
                this.detailCase_ = 0;
                this.takenRewardList_ = GeneratedMessageV3.emptyIntList();
                this.unk2800KOMIPKKKOBE_ = Collections.emptyList();
                this.meetCondList_ = GeneratedMessageV3.emptyIntList();
                this.expireCondList_ = GeneratedMessageV3.emptyIntList();
                this.watcherInfoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.detailCase_ = 0;
                this.takenRewardList_ = GeneratedMessageV3.emptyIntList();
                this.unk2800KOMIPKKKOBE_ = Collections.emptyList();
                this.meetCondList_ = GeneratedMessageV3.emptyIntList();
                this.expireCondList_ = GeneratedMessageV3.emptyIntList();
                this.watcherInfoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ActivityInfo.alwaysUseFieldBuilders) {
                    this.getUnk2800KOMIPKKKOBEFieldBuilder();
                    this.getWatcherInfoListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.isPlayOpenAnim_ = false;
                this.scheduleId_ = 0;
                this.curScore_ = 0;
                this.isStarting_ = false;
                this.takenRewardList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.selectedAvatarRewardId_ = 0;
                this.firstDayStartTime_ = 0;
                this.scoreLimit_ = 0;
                this.isFinished_ = false;
                this.isHidden_ = false;
                this.beginTime_ = 0;
                this.endTime_ = 0;
                this.internalGetMutableActivityCoinMap().clear();
                this.activityType_ = 0;
                if (this.unk2800KOMIPKKKOBEBuilder_ == null) {
                    this.unk2800KOMIPKKKOBE_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                else {
                    this.unk2800KOMIPKKKOBEBuilder_.clear();
                }
                this.meetCondList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFF7;
                this.expireCondList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFEF;
                if (this.watcherInfoListBuilder_ == null) {
                    this.watcherInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFDF;
                }
                else {
                    this.watcherInfoListBuilder_.clear();
                }
                this.activityId_ = 0;
                this.detailCase_ = 0;
                this.detail_ = null;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ActivityInfoOuterClass.internal_static_ActivityInfo_descriptor;
            }
            
            @Override
            public ActivityInfo getDefaultInstanceForType() {
                return ActivityInfo.getDefaultInstance();
            }
            
            @Override
            public ActivityInfo build() {
                final ActivityInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ActivityInfo buildPartial() {
                final ActivityInfo result = new ActivityInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.isPlayOpenAnim_ = this.isPlayOpenAnim_;
                result.scheduleId_ = this.scheduleId_;
                result.curScore_ = this.curScore_;
                result.isStarting_ = this.isStarting_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.takenRewardList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.takenRewardList_ = this.takenRewardList_;
                result.selectedAvatarRewardId_ = this.selectedAvatarRewardId_;
                result.firstDayStartTime_ = this.firstDayStartTime_;
                result.scoreLimit_ = this.scoreLimit_;
                result.isFinished_ = this.isFinished_;
                result.isHidden_ = this.isHidden_;
                result.beginTime_ = this.beginTime_;
                result.endTime_ = this.endTime_;
                (result.activityCoinMap_ = this.internalGetActivityCoinMap()).makeImmutable();
                result.activityType_ = this.activityType_;
                if (this.unk2800KOMIPKKKOBEBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) != 0x0) {
                        this.unk2800KOMIPKKKOBE_ = Collections.unmodifiableList((List<? extends Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC>)this.unk2800KOMIPKKKOBE_);
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    result.unk2800KOMIPKKKOBE_ = this.unk2800KOMIPKKKOBE_;
                }
                else {
                    result.unk2800KOMIPKKKOBE_ = this.unk2800KOMIPKKKOBEBuilder_.build();
                }
                if ((this.bitField0_ & 0x8) != 0x0) {
                    this.meetCondList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFF7;
                }
                result.meetCondList_ = this.meetCondList_;
                if ((this.bitField0_ & 0x10) != 0x0) {
                    this.expireCondList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFEF;
                }
                result.expireCondList_ = this.expireCondList_;
                if (this.watcherInfoListBuilder_ == null) {
                    if ((this.bitField0_ & 0x20) != 0x0) {
                        this.watcherInfoList_ = Collections.unmodifiableList((List<? extends ActivityWatcherInfoOuterClass.ActivityWatcherInfo>)this.watcherInfoList_);
                        this.bitField0_ &= 0xFFFFFFDF;
                    }
                    result.watcherInfoList_ = this.watcherInfoList_;
                }
                else {
                    result.watcherInfoList_ = this.watcherInfoListBuilder_.build();
                }
                result.activityId_ = this.activityId_;
                if (this.detailCase_ == 460) {
                    if (this.musicGameInfoBuilder_ == null) {
                        result.detail_ = this.detail_;
                    }
                    else {
                        result.detail_ = this.musicGameInfoBuilder_.build();
                    }
                }
                result.detailCase_ = this.detailCase_;
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
                if (other instanceof ActivityInfo) {
                    return this.mergeFrom((ActivityInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ActivityInfo other) {
                if (other == ActivityInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getIsPlayOpenAnim()) {
                    this.setIsPlayOpenAnim(other.getIsPlayOpenAnim());
                }
                if (other.getScheduleId() != 0) {
                    this.setScheduleId(other.getScheduleId());
                }
                if (other.getCurScore() != 0) {
                    this.setCurScore(other.getCurScore());
                }
                if (other.getIsStarting()) {
                    this.setIsStarting(other.getIsStarting());
                }
                if (!other.takenRewardList_.isEmpty()) {
                    if (this.takenRewardList_.isEmpty()) {
                        this.takenRewardList_ = other.takenRewardList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureTakenRewardListIsMutable();
                        this.takenRewardList_.addAll(other.takenRewardList_);
                    }
                    this.onChanged();
                }
                if (other.getSelectedAvatarRewardId() != 0) {
                    this.setSelectedAvatarRewardId(other.getSelectedAvatarRewardId());
                }
                if (other.getFirstDayStartTime() != 0) {
                    this.setFirstDayStartTime(other.getFirstDayStartTime());
                }
                if (other.getScoreLimit() != 0) {
                    this.setScoreLimit(other.getScoreLimit());
                }
                if (other.getIsFinished()) {
                    this.setIsFinished(other.getIsFinished());
                }
                if (other.getIsHidden()) {
                    this.setIsHidden(other.getIsHidden());
                }
                if (other.getBeginTime() != 0) {
                    this.setBeginTime(other.getBeginTime());
                }
                if (other.getEndTime() != 0) {
                    this.setEndTime(other.getEndTime());
                }
                this.internalGetMutableActivityCoinMap().mergeFrom(other.internalGetActivityCoinMap());
                if (other.getActivityType() != 0) {
                    this.setActivityType(other.getActivityType());
                }
                if (this.unk2800KOMIPKKKOBEBuilder_ == null) {
                    if (!other.unk2800KOMIPKKKOBE_.isEmpty()) {
                        if (this.unk2800KOMIPKKKOBE_.isEmpty()) {
                            this.unk2800KOMIPKKKOBE_ = other.unk2800KOMIPKKKOBE_;
                            this.bitField0_ &= 0xFFFFFFFB;
                        }
                        else {
                            this.ensureUnk2800KOMIPKKKOBEIsMutable();
                            this.unk2800KOMIPKKKOBE_.addAll(other.unk2800KOMIPKKKOBE_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.unk2800KOMIPKKKOBE_.isEmpty()) {
                    if (this.unk2800KOMIPKKKOBEBuilder_.isEmpty()) {
                        this.unk2800KOMIPKKKOBEBuilder_.dispose();
                        this.unk2800KOMIPKKKOBEBuilder_ = null;
                        this.unk2800KOMIPKKKOBE_ = other.unk2800KOMIPKKKOBE_;
                        this.bitField0_ &= 0xFFFFFFFB;
                        this.unk2800KOMIPKKKOBEBuilder_ = (ActivityInfo.alwaysUseFieldBuilders ? this.getUnk2800KOMIPKKKOBEFieldBuilder() : null);
                    }
                    else {
                        this.unk2800KOMIPKKKOBEBuilder_.addAllMessages(other.unk2800KOMIPKKKOBE_);
                    }
                }
                if (!other.meetCondList_.isEmpty()) {
                    if (this.meetCondList_.isEmpty()) {
                        this.meetCondList_ = other.meetCondList_;
                        this.bitField0_ &= 0xFFFFFFF7;
                    }
                    else {
                        this.ensureMeetCondListIsMutable();
                        this.meetCondList_.addAll(other.meetCondList_);
                    }
                    this.onChanged();
                }
                if (!other.expireCondList_.isEmpty()) {
                    if (this.expireCondList_.isEmpty()) {
                        this.expireCondList_ = other.expireCondList_;
                        this.bitField0_ &= 0xFFFFFFEF;
                    }
                    else {
                        this.ensureExpireCondListIsMutable();
                        this.expireCondList_.addAll(other.expireCondList_);
                    }
                    this.onChanged();
                }
                if (this.watcherInfoListBuilder_ == null) {
                    if (!other.watcherInfoList_.isEmpty()) {
                        if (this.watcherInfoList_.isEmpty()) {
                            this.watcherInfoList_ = other.watcherInfoList_;
                            this.bitField0_ &= 0xFFFFFFDF;
                        }
                        else {
                            this.ensureWatcherInfoListIsMutable();
                            this.watcherInfoList_.addAll(other.watcherInfoList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.watcherInfoList_.isEmpty()) {
                    if (this.watcherInfoListBuilder_.isEmpty()) {
                        this.watcherInfoListBuilder_.dispose();
                        this.watcherInfoListBuilder_ = null;
                        this.watcherInfoList_ = other.watcherInfoList_;
                        this.bitField0_ &= 0xFFFFFFDF;
                        this.watcherInfoListBuilder_ = (ActivityInfo.alwaysUseFieldBuilders ? this.getWatcherInfoListFieldBuilder() : null);
                    }
                    else {
                        this.watcherInfoListBuilder_.addAllMessages(other.watcherInfoList_);
                    }
                }
                if (other.getActivityId() != 0) {
                    this.setActivityId(other.getActivityId());
                }
                switch (other.getDetailCase()) {
                    case MUSIC_GAME_INFO: {
                        this.mergeMusicGameInfo(other.getMusicGameInfo());
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
                ActivityInfo parsedMessage = null;
                try {
                    parsedMessage = ActivityInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ActivityInfo)e.getUnfinishedMessage();
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
            public DetailCase getDetailCase() {
                return DetailCase.forNumber(this.detailCase_);
            }
            
            public Builder clearDetail() {
                this.detailCase_ = 0;
                this.detail_ = null;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsPlayOpenAnim() {
                return this.isPlayOpenAnim_;
            }
            
            public Builder setIsPlayOpenAnim(final boolean value) {
                this.isPlayOpenAnim_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsPlayOpenAnim() {
                this.isPlayOpenAnim_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getScheduleId() {
                return this.scheduleId_;
            }
            
            public Builder setScheduleId(final int value) {
                this.scheduleId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearScheduleId() {
                this.scheduleId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCurScore() {
                return this.curScore_;
            }
            
            public Builder setCurScore(final int value) {
                this.curScore_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurScore() {
                this.curScore_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsStarting() {
                return this.isStarting_;
            }
            
            public Builder setIsStarting(final boolean value) {
                this.isStarting_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsStarting() {
                this.isStarting_ = false;
                this.onChanged();
                return this;
            }
            
            private void ensureTakenRewardListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.takenRewardList_ = GeneratedMessageV3.mutableCopy(this.takenRewardList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getTakenRewardListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.takenRewardList_) : this.takenRewardList_;
            }
            
            @Override
            public int getTakenRewardListCount() {
                return this.takenRewardList_.size();
            }
            
            @Override
            public int getTakenRewardList(final int index) {
                return this.takenRewardList_.getInt(index);
            }
            
            public Builder setTakenRewardList(final int index, final int value) {
                this.ensureTakenRewardListIsMutable();
                this.takenRewardList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addTakenRewardList(final int value) {
                this.ensureTakenRewardListIsMutable();
                this.takenRewardList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllTakenRewardList(final Iterable<? extends Integer> values) {
                this.ensureTakenRewardListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.takenRewardList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearTakenRewardList() {
                this.takenRewardList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getSelectedAvatarRewardId() {
                return this.selectedAvatarRewardId_;
            }
            
            public Builder setSelectedAvatarRewardId(final int value) {
                this.selectedAvatarRewardId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSelectedAvatarRewardId() {
                this.selectedAvatarRewardId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getFirstDayStartTime() {
                return this.firstDayStartTime_;
            }
            
            public Builder setFirstDayStartTime(final int value) {
                this.firstDayStartTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFirstDayStartTime() {
                this.firstDayStartTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getScoreLimit() {
                return this.scoreLimit_;
            }
            
            public Builder setScoreLimit(final int value) {
                this.scoreLimit_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearScoreLimit() {
                this.scoreLimit_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsFinished() {
                return this.isFinished_;
            }
            
            public Builder setIsFinished(final boolean value) {
                this.isFinished_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsFinished() {
                this.isFinished_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsHidden() {
                return this.isHidden_;
            }
            
            public Builder setIsHidden(final boolean value) {
                this.isHidden_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsHidden() {
                this.isHidden_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getBeginTime() {
                return this.beginTime_;
            }
            
            public Builder setBeginTime(final int value) {
                this.beginTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBeginTime() {
                this.beginTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getEndTime() {
                return this.endTime_;
            }
            
            public Builder setEndTime(final int value) {
                this.endTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEndTime() {
                this.endTime_ = 0;
                this.onChanged();
                return this;
            }
            
            private MapField<Integer, Integer> internalGetActivityCoinMap() {
                if (this.activityCoinMap_ == null) {
                    return MapField.emptyMapField(ActivityCoinMapDefaultEntryHolder.defaultEntry);
                }
                return this.activityCoinMap_;
            }
            
            private MapField<Integer, Integer> internalGetMutableActivityCoinMap() {
                this.onChanged();
                if (this.activityCoinMap_ == null) {
                    this.activityCoinMap_ = MapField.newMapField(ActivityCoinMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.activityCoinMap_.isMutable()) {
                    this.activityCoinMap_ = this.activityCoinMap_.copy();
                }
                return this.activityCoinMap_;
            }
            
            @Override
            public int getActivityCoinMapCount() {
                return this.internalGetActivityCoinMap().getMap().size();
            }
            
            @Override
            public boolean containsActivityCoinMap(final int key) {
                return this.internalGetActivityCoinMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Integer> getActivityCoinMap() {
                return this.getActivityCoinMapMap();
            }
            
            @Override
            public Map<Integer, Integer> getActivityCoinMapMap() {
                return this.internalGetActivityCoinMap().getMap();
            }
            
            @Override
            public int getActivityCoinMapOrDefault(final int key, final int defaultValue) {
                final Map<Integer, Integer> map = this.internalGetActivityCoinMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public int getActivityCoinMapOrThrow(final int key) {
                final Map<Integer, Integer> map = this.internalGetActivityCoinMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearActivityCoinMap() {
                this.internalGetMutableActivityCoinMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeActivityCoinMap(final int key) {
                this.internalGetMutableActivityCoinMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, Integer> getMutableActivityCoinMap() {
                return this.internalGetMutableActivityCoinMap().getMutableMap();
            }
            
            public Builder putActivityCoinMap(final int key, final int value) {
                this.internalGetMutableActivityCoinMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllActivityCoinMap(final Map<Integer, Integer> values) {
                this.internalGetMutableActivityCoinMap().getMutableMap().putAll(values);
                return this;
            }
            
            @Override
            public int getActivityType() {
                return this.activityType_;
            }
            
            public Builder setActivityType(final int value) {
                this.activityType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearActivityType() {
                this.activityType_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureUnk2800KOMIPKKKOBEIsMutable() {
                if ((this.bitField0_ & 0x4) == 0x0) {
                    this.unk2800KOMIPKKKOBE_ = new ArrayList<Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC>(this.unk2800KOMIPKKKOBE_);
                    this.bitField0_ |= 0x4;
                }
            }
            
            @Override
            public List<Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC> getUnk2800KOMIPKKKOBEList() {
                if (this.unk2800KOMIPKKKOBEBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC>)this.unk2800KOMIPKKKOBE_);
                }
                return this.unk2800KOMIPKKKOBEBuilder_.getMessageList();
            }
            
            @Override
            public int getUnk2800KOMIPKKKOBECount() {
                if (this.unk2800KOMIPKKKOBEBuilder_ == null) {
                    return this.unk2800KOMIPKKKOBE_.size();
                }
                return this.unk2800KOMIPKKKOBEBuilder_.getCount();
            }
            
            @Override
            public Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC getUnk2800KOMIPKKKOBE(final int index) {
                if (this.unk2800KOMIPKKKOBEBuilder_ == null) {
                    return this.unk2800KOMIPKKKOBE_.get(index);
                }
                return this.unk2800KOMIPKKKOBEBuilder_.getMessage(index);
            }
            
            public Builder setUnk2800KOMIPKKKOBE(final int index, final Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC value) {
                if (this.unk2800KOMIPKKKOBEBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureUnk2800KOMIPKKKOBEIsMutable();
                    this.unk2800KOMIPKKKOBE_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.unk2800KOMIPKKKOBEBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setUnk2800KOMIPKKKOBE(final int index, final Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC.Builder builderForValue) {
                if (this.unk2800KOMIPKKKOBEBuilder_ == null) {
                    this.ensureUnk2800KOMIPKKKOBEIsMutable();
                    this.unk2800KOMIPKKKOBE_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.unk2800KOMIPKKKOBEBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addUnk2800KOMIPKKKOBE(final Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC value) {
                if (this.unk2800KOMIPKKKOBEBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureUnk2800KOMIPKKKOBEIsMutable();
                    this.unk2800KOMIPKKKOBE_.add(value);
                    this.onChanged();
                }
                else {
                    this.unk2800KOMIPKKKOBEBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addUnk2800KOMIPKKKOBE(final int index, final Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC value) {
                if (this.unk2800KOMIPKKKOBEBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureUnk2800KOMIPKKKOBEIsMutable();
                    this.unk2800KOMIPKKKOBE_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.unk2800KOMIPKKKOBEBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addUnk2800KOMIPKKKOBE(final Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC.Builder builderForValue) {
                if (this.unk2800KOMIPKKKOBEBuilder_ == null) {
                    this.ensureUnk2800KOMIPKKKOBEIsMutable();
                    this.unk2800KOMIPKKKOBE_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.unk2800KOMIPKKKOBEBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addUnk2800KOMIPKKKOBE(final int index, final Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC.Builder builderForValue) {
                if (this.unk2800KOMIPKKKOBEBuilder_ == null) {
                    this.ensureUnk2800KOMIPKKKOBEIsMutable();
                    this.unk2800KOMIPKKKOBE_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.unk2800KOMIPKKKOBEBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllUnk2800KOMIPKKKOBE(final Iterable<? extends Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC> values) {
                if (this.unk2800KOMIPKKKOBEBuilder_ == null) {
                    this.ensureUnk2800KOMIPKKKOBEIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.unk2800KOMIPKKKOBE_);
                    this.onChanged();
                }
                else {
                    this.unk2800KOMIPKKKOBEBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearUnk2800KOMIPKKKOBE() {
                if (this.unk2800KOMIPKKKOBEBuilder_ == null) {
                    this.unk2800KOMIPKKKOBE_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                    this.onChanged();
                }
                else {
                    this.unk2800KOMIPKKKOBEBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeUnk2800KOMIPKKKOBE(final int index) {
                if (this.unk2800KOMIPKKKOBEBuilder_ == null) {
                    this.ensureUnk2800KOMIPKKKOBEIsMutable();
                    this.unk2800KOMIPKKKOBE_.remove(index);
                    this.onChanged();
                }
                else {
                    this.unk2800KOMIPKKKOBEBuilder_.remove(index);
                }
                return this;
            }
            
            public Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC.Builder getUnk2800KOMIPKKKOBEBuilder(final int index) {
                return this.getUnk2800KOMIPKKKOBEFieldBuilder().getBuilder(index);
            }
            
            @Override
            public Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLCOrBuilder getUnk2800KOMIPKKKOBEOrBuilder(final int index) {
                if (this.unk2800KOMIPKKKOBEBuilder_ == null) {
                    return this.unk2800KOMIPKKKOBE_.get(index);
                }
                return this.unk2800KOMIPKKKOBEBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLCOrBuilder> getUnk2800KOMIPKKKOBEOrBuilderList() {
                if (this.unk2800KOMIPKKKOBEBuilder_ != null) {
                    return this.unk2800KOMIPKKKOBEBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLCOrBuilder>)this.unk2800KOMIPKKKOBE_);
            }
            
            public Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC.Builder addUnk2800KOMIPKKKOBEBuilder() {
                return this.getUnk2800KOMIPKKKOBEFieldBuilder().addBuilder(Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC.getDefaultInstance());
            }
            
            public Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC.Builder addUnk2800KOMIPKKKOBEBuilder(final int index) {
                return this.getUnk2800KOMIPKKKOBEFieldBuilder().addBuilder(index, Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC.getDefaultInstance());
            }
            
            public List<Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC.Builder> getUnk2800KOMIPKKKOBEBuilderList() {
                return this.getUnk2800KOMIPKKKOBEFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC, Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC.Builder, Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLCOrBuilder> getUnk2800KOMIPKKKOBEFieldBuilder() {
                if (this.unk2800KOMIPKKKOBEBuilder_ == null) {
                    this.unk2800KOMIPKKKOBEBuilder_ = new RepeatedFieldBuilderV3<Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC, Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC.Builder, Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLCOrBuilder>(this.unk2800KOMIPKKKOBE_, (this.bitField0_ & 0x4) != 0x0, this.getParentForChildren(), this.isClean());
                    this.unk2800KOMIPKKKOBE_ = null;
                }
                return this.unk2800KOMIPKKKOBEBuilder_;
            }
            
            private void ensureMeetCondListIsMutable() {
                if ((this.bitField0_ & 0x8) == 0x0) {
                    this.meetCondList_ = GeneratedMessageV3.mutableCopy(this.meetCondList_);
                    this.bitField0_ |= 0x8;
                }
            }
            
            @Override
            public List<Integer> getMeetCondListList() {
                return ((this.bitField0_ & 0x8) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.meetCondList_) : this.meetCondList_;
            }
            
            @Override
            public int getMeetCondListCount() {
                return this.meetCondList_.size();
            }
            
            @Override
            public int getMeetCondList(final int index) {
                return this.meetCondList_.getInt(index);
            }
            
            public Builder setMeetCondList(final int index, final int value) {
                this.ensureMeetCondListIsMutable();
                this.meetCondList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addMeetCondList(final int value) {
                this.ensureMeetCondListIsMutable();
                this.meetCondList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllMeetCondList(final Iterable<? extends Integer> values) {
                this.ensureMeetCondListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.meetCondList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearMeetCondList() {
                this.meetCondList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFF7;
                this.onChanged();
                return this;
            }
            
            private void ensureExpireCondListIsMutable() {
                if ((this.bitField0_ & 0x10) == 0x0) {
                    this.expireCondList_ = GeneratedMessageV3.mutableCopy(this.expireCondList_);
                    this.bitField0_ |= 0x10;
                }
            }
            
            @Override
            public List<Integer> getExpireCondListList() {
                return ((this.bitField0_ & 0x10) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.expireCondList_) : this.expireCondList_;
            }
            
            @Override
            public int getExpireCondListCount() {
                return this.expireCondList_.size();
            }
            
            @Override
            public int getExpireCondList(final int index) {
                return this.expireCondList_.getInt(index);
            }
            
            public Builder setExpireCondList(final int index, final int value) {
                this.ensureExpireCondListIsMutable();
                this.expireCondList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addExpireCondList(final int value) {
                this.ensureExpireCondListIsMutable();
                this.expireCondList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllExpireCondList(final Iterable<? extends Integer> values) {
                this.ensureExpireCondListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.expireCondList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearExpireCondList() {
                this.expireCondList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFEF;
                this.onChanged();
                return this;
            }
            
            private void ensureWatcherInfoListIsMutable() {
                if ((this.bitField0_ & 0x20) == 0x0) {
                    this.watcherInfoList_ = new ArrayList<ActivityWatcherInfoOuterClass.ActivityWatcherInfo>(this.watcherInfoList_);
                    this.bitField0_ |= 0x20;
                }
            }
            
            @Override
            public List<ActivityWatcherInfoOuterClass.ActivityWatcherInfo> getWatcherInfoListList() {
                if (this.watcherInfoListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ActivityWatcherInfoOuterClass.ActivityWatcherInfo>)this.watcherInfoList_);
                }
                return this.watcherInfoListBuilder_.getMessageList();
            }
            
            @Override
            public int getWatcherInfoListCount() {
                if (this.watcherInfoListBuilder_ == null) {
                    return this.watcherInfoList_.size();
                }
                return this.watcherInfoListBuilder_.getCount();
            }
            
            @Override
            public ActivityWatcherInfoOuterClass.ActivityWatcherInfo getWatcherInfoList(final int index) {
                if (this.watcherInfoListBuilder_ == null) {
                    return this.watcherInfoList_.get(index);
                }
                return this.watcherInfoListBuilder_.getMessage(index);
            }
            
            public Builder setWatcherInfoList(final int index, final ActivityWatcherInfoOuterClass.ActivityWatcherInfo value) {
                if (this.watcherInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureWatcherInfoListIsMutable();
                    this.watcherInfoList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.watcherInfoListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setWatcherInfoList(final int index, final ActivityWatcherInfoOuterClass.ActivityWatcherInfo.Builder builderForValue) {
                if (this.watcherInfoListBuilder_ == null) {
                    this.ensureWatcherInfoListIsMutable();
                    this.watcherInfoList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.watcherInfoListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addWatcherInfoList(final ActivityWatcherInfoOuterClass.ActivityWatcherInfo value) {
                if (this.watcherInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureWatcherInfoListIsMutable();
                    this.watcherInfoList_.add(value);
                    this.onChanged();
                }
                else {
                    this.watcherInfoListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addWatcherInfoList(final int index, final ActivityWatcherInfoOuterClass.ActivityWatcherInfo value) {
                if (this.watcherInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureWatcherInfoListIsMutable();
                    this.watcherInfoList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.watcherInfoListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addWatcherInfoList(final ActivityWatcherInfoOuterClass.ActivityWatcherInfo.Builder builderForValue) {
                if (this.watcherInfoListBuilder_ == null) {
                    this.ensureWatcherInfoListIsMutable();
                    this.watcherInfoList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.watcherInfoListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addWatcherInfoList(final int index, final ActivityWatcherInfoOuterClass.ActivityWatcherInfo.Builder builderForValue) {
                if (this.watcherInfoListBuilder_ == null) {
                    this.ensureWatcherInfoListIsMutable();
                    this.watcherInfoList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.watcherInfoListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllWatcherInfoList(final Iterable<? extends ActivityWatcherInfoOuterClass.ActivityWatcherInfo> values) {
                if (this.watcherInfoListBuilder_ == null) {
                    this.ensureWatcherInfoListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.watcherInfoList_);
                    this.onChanged();
                }
                else {
                    this.watcherInfoListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearWatcherInfoList() {
                if (this.watcherInfoListBuilder_ == null) {
                    this.watcherInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFDF;
                    this.onChanged();
                }
                else {
                    this.watcherInfoListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeWatcherInfoList(final int index) {
                if (this.watcherInfoListBuilder_ == null) {
                    this.ensureWatcherInfoListIsMutable();
                    this.watcherInfoList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.watcherInfoListBuilder_.remove(index);
                }
                return this;
            }
            
            public ActivityWatcherInfoOuterClass.ActivityWatcherInfo.Builder getWatcherInfoListBuilder(final int index) {
                return this.getWatcherInfoListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ActivityWatcherInfoOuterClass.ActivityWatcherInfoOrBuilder getWatcherInfoListOrBuilder(final int index) {
                if (this.watcherInfoListBuilder_ == null) {
                    return this.watcherInfoList_.get(index);
                }
                return this.watcherInfoListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ActivityWatcherInfoOuterClass.ActivityWatcherInfoOrBuilder> getWatcherInfoListOrBuilderList() {
                if (this.watcherInfoListBuilder_ != null) {
                    return this.watcherInfoListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ActivityWatcherInfoOuterClass.ActivityWatcherInfoOrBuilder>)this.watcherInfoList_);
            }
            
            public ActivityWatcherInfoOuterClass.ActivityWatcherInfo.Builder addWatcherInfoListBuilder() {
                return this.getWatcherInfoListFieldBuilder().addBuilder(ActivityWatcherInfoOuterClass.ActivityWatcherInfo.getDefaultInstance());
            }
            
            public ActivityWatcherInfoOuterClass.ActivityWatcherInfo.Builder addWatcherInfoListBuilder(final int index) {
                return this.getWatcherInfoListFieldBuilder().addBuilder(index, ActivityWatcherInfoOuterClass.ActivityWatcherInfo.getDefaultInstance());
            }
            
            public List<ActivityWatcherInfoOuterClass.ActivityWatcherInfo.Builder> getWatcherInfoListBuilderList() {
                return this.getWatcherInfoListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ActivityWatcherInfoOuterClass.ActivityWatcherInfo, ActivityWatcherInfoOuterClass.ActivityWatcherInfo.Builder, ActivityWatcherInfoOuterClass.ActivityWatcherInfoOrBuilder> getWatcherInfoListFieldBuilder() {
                if (this.watcherInfoListBuilder_ == null) {
                    this.watcherInfoListBuilder_ = new RepeatedFieldBuilderV3<ActivityWatcherInfoOuterClass.ActivityWatcherInfo, ActivityWatcherInfoOuterClass.ActivityWatcherInfo.Builder, ActivityWatcherInfoOuterClass.ActivityWatcherInfoOrBuilder>(this.watcherInfoList_, (this.bitField0_ & 0x20) != 0x0, this.getParentForChildren(), this.isClean());
                    this.watcherInfoList_ = null;
                }
                return this.watcherInfoListBuilder_;
            }
            
            @Override
            public int getActivityId() {
                return this.activityId_;
            }
            
            public Builder setActivityId(final int value) {
                this.activityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearActivityId() {
                this.activityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasMusicGameInfo() {
                return this.detailCase_ == 460;
            }
            
            @Override
            public MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo getMusicGameInfo() {
                if (this.musicGameInfoBuilder_ == null) {
                    if (this.detailCase_ == 460) {
                        return (MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo)this.detail_;
                    }
                    return MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo.getDefaultInstance();
                }
                else {
                    if (this.detailCase_ == 460) {
                        return this.musicGameInfoBuilder_.getMessage();
                    }
                    return MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo.getDefaultInstance();
                }
            }
            
            public Builder setMusicGameInfo(final MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo value) {
                if (this.musicGameInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.detail_ = value;
                    this.onChanged();
                }
                else {
                    this.musicGameInfoBuilder_.setMessage(value);
                }
                this.detailCase_ = 460;
                return this;
            }
            
            public Builder setMusicGameInfo(final MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo.Builder builderForValue) {
                if (this.musicGameInfoBuilder_ == null) {
                    this.detail_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.musicGameInfoBuilder_.setMessage(builderForValue.build());
                }
                this.detailCase_ = 460;
                return this;
            }
            
            public Builder mergeMusicGameInfo(final MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo value) {
                if (this.musicGameInfoBuilder_ == null) {
                    if (this.detailCase_ == 460 && this.detail_ != MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo.getDefaultInstance()) {
                        this.detail_ = MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo.newBuilder((MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo)this.detail_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.detail_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.detailCase_ == 460) {
                        this.musicGameInfoBuilder_.mergeFrom(value);
                    }
                    this.musicGameInfoBuilder_.setMessage(value);
                }
                this.detailCase_ = 460;
                return this;
            }
            
            public Builder clearMusicGameInfo() {
                if (this.musicGameInfoBuilder_ == null) {
                    if (this.detailCase_ == 460) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.detailCase_ == 460) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                    }
                    this.musicGameInfoBuilder_.clear();
                }
                return this;
            }
            
            public MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo.Builder getMusicGameInfoBuilder() {
                return this.getMusicGameInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfoOrBuilder getMusicGameInfoOrBuilder() {
                if (this.detailCase_ == 460 && this.musicGameInfoBuilder_ != null) {
                    return this.musicGameInfoBuilder_.getMessageOrBuilder();
                }
                if (this.detailCase_ == 460) {
                    return (MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo)this.detail_;
                }
                return MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo, MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo.Builder, MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfoOrBuilder> getMusicGameInfoFieldBuilder() {
                if (this.musicGameInfoBuilder_ == null) {
                    if (this.detailCase_ != 460) {
                        this.detail_ = MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo.getDefaultInstance();
                    }
                    this.musicGameInfoBuilder_ = new SingleFieldBuilderV3<MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo, MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo.Builder, MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfoOrBuilder>((MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo)this.detail_, this.getParentForChildren(), this.isClean());
                    this.detail_ = null;
                }
                this.detailCase_ = 460;
                this.onChanged();
                return this.musicGameInfoBuilder_;
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
    
    public interface ActivityInfoOrBuilder extends MessageOrBuilder
    {
        boolean getIsPlayOpenAnim();
        
        int getScheduleId();
        
        int getCurScore();
        
        boolean getIsStarting();
        
        List<Integer> getTakenRewardListList();
        
        int getTakenRewardListCount();
        
        int getTakenRewardList(final int p0);
        
        int getSelectedAvatarRewardId();
        
        int getFirstDayStartTime();
        
        int getScoreLimit();
        
        boolean getIsFinished();
        
        boolean getIsHidden();
        
        int getBeginTime();
        
        int getEndTime();
        
        int getActivityCoinMapCount();
        
        boolean containsActivityCoinMap(final int p0);
        
        @Deprecated
        Map<Integer, Integer> getActivityCoinMap();
        
        Map<Integer, Integer> getActivityCoinMapMap();
        
        int getActivityCoinMapOrDefault(final int p0, final int p1);
        
        int getActivityCoinMapOrThrow(final int p0);
        
        int getActivityType();
        
        List<Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC> getUnk2800KOMIPKKKOBEList();
        
        Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC getUnk2800KOMIPKKKOBE(final int p0);
        
        int getUnk2800KOMIPKKKOBECount();
        
        List<? extends Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLCOrBuilder> getUnk2800KOMIPKKKOBEOrBuilderList();
        
        Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLCOrBuilder getUnk2800KOMIPKKKOBEOrBuilder(final int p0);
        
        List<Integer> getMeetCondListList();
        
        int getMeetCondListCount();
        
        int getMeetCondList(final int p0);
        
        List<Integer> getExpireCondListList();
        
        int getExpireCondListCount();
        
        int getExpireCondList(final int p0);
        
        List<ActivityWatcherInfoOuterClass.ActivityWatcherInfo> getWatcherInfoListList();
        
        ActivityWatcherInfoOuterClass.ActivityWatcherInfo getWatcherInfoList(final int p0);
        
        int getWatcherInfoListCount();
        
        List<? extends ActivityWatcherInfoOuterClass.ActivityWatcherInfoOrBuilder> getWatcherInfoListOrBuilderList();
        
        ActivityWatcherInfoOuterClass.ActivityWatcherInfoOrBuilder getWatcherInfoListOrBuilder(final int p0);
        
        int getActivityId();
        
        boolean hasMusicGameInfo();
        
        MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfo getMusicGameInfo();
        
        MusicGameActivityDetailInfoOuterClass.MusicGameActivityDetailInfoOrBuilder getMusicGameInfoOrBuilder();
        
        ActivityInfo.DetailCase getDetailCase();
    }
}
