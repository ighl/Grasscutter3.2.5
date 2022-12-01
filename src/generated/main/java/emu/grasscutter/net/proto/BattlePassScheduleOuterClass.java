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

public final class BattlePassScheduleOuterClass
{
    private static final Descriptors.Descriptor internal_static_BattlePassSchedule_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BattlePassSchedule_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private BattlePassScheduleOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return BattlePassScheduleOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018BattlePassSchedule.proto\u001a\u0015BattlePassCycle.proto\u001a\u0017BattlePassProduct.proto\u001a\u0019BattlePassRewardTag.proto\u001a\u001cBattlePassUnlockStatus.proto\"\u008b\u0003\n\u0012BattlePassSchedule\u0012\r\n\u0005level\u0018\u000e \u0001(\r\u0012\u0012\n\nbegin_time\u0018\u0002 \u0001(\r\u0012\u0010\n\bend_time\u0018\u000f \u0001(\r\u0012\r\n\u0005point\u0018\u0001 \u0001(\r\u0012#\n\tcur_cycle\u0018\u0004 \u0001(\u000b2\u0010.BattlePassCycle\u0012.\n\runlock_status\u0018\u0007 \u0001(\u000e2\u0017.BattlePassUnlockStatus\u0012/\n\u0011reward_taken_list\u0018\u000b \u0003(\u000b2\u0014.BattlePassRewardTag\u0012\u0018\n\u0010cur_cycle_points\u0018\n \u0001(\r\u0012\u001b\n\u0013Unk2700_ODHAAHEPFAG\u0018\f \u0001(\r\u0012(\n\fproduct_info\u0018\r \u0001(\u000b2\u0012.BattlePassProduct\u0012\"\n\u001ais_extra_paid_reward_taken\u0018\u0006 \u0001(\b\u0012\u0011\n\tis_viewed\u0018\u0003 \u0001(\b\u0012\u0013\n\u000bschedule_id\u0018\t \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        BattlePassScheduleOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { BattlePassCycleOuterClass.getDescriptor(), BattlePassProductOuterClass.getDescriptor(), BattlePassRewardTagOuterClass.getDescriptor(), BattlePassUnlockStatusOuterClass.getDescriptor() });
        internal_static_BattlePassSchedule_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_BattlePassSchedule_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(BattlePassScheduleOuterClass.internal_static_BattlePassSchedule_descriptor, new String[] { "Level", "BeginTime", "EndTime", "Point", "CurCycle", "UnlockStatus", "RewardTakenList", "CurCyclePoints", "Unk2700ODHAAHEPFAG", "ProductInfo", "IsExtraPaidRewardTaken", "IsViewed", "ScheduleId" });
        BattlePassCycleOuterClass.getDescriptor();
        BattlePassProductOuterClass.getDescriptor();
        BattlePassRewardTagOuterClass.getDescriptor();
        BattlePassUnlockStatusOuterClass.getDescriptor();
    }
    
    public static final class BattlePassSchedule extends GeneratedMessageV3 implements BattlePassScheduleOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int LEVEL_FIELD_NUMBER = 14;
        private int level_;
        public static final int BEGIN_TIME_FIELD_NUMBER = 2;
        private int beginTime_;
        public static final int END_TIME_FIELD_NUMBER = 15;
        private int endTime_;
        public static final int POINT_FIELD_NUMBER = 1;
        private int point_;
        public static final int CUR_CYCLE_FIELD_NUMBER = 4;
        private BattlePassCycleOuterClass.BattlePassCycle curCycle_;
        public static final int UNLOCK_STATUS_FIELD_NUMBER = 7;
        private int unlockStatus_;
        public static final int REWARD_TAKEN_LIST_FIELD_NUMBER = 11;
        private List<BattlePassRewardTagOuterClass.BattlePassRewardTag> rewardTakenList_;
        public static final int CUR_CYCLE_POINTS_FIELD_NUMBER = 10;
        private int curCyclePoints_;
        public static final int UNK2700_ODHAAHEPFAG_FIELD_NUMBER = 12;
        private int unk2700ODHAAHEPFAG_;
        public static final int PRODUCT_INFO_FIELD_NUMBER = 13;
        private BattlePassProductOuterClass.BattlePassProduct productInfo_;
        public static final int IS_EXTRA_PAID_REWARD_TAKEN_FIELD_NUMBER = 6;
        private boolean isExtraPaidRewardTaken_;
        public static final int IS_VIEWED_FIELD_NUMBER = 3;
        private boolean isViewed_;
        public static final int SCHEDULE_ID_FIELD_NUMBER = 9;
        private int scheduleId_;
        private byte memoizedIsInitialized;
        private static final BattlePassSchedule DEFAULT_INSTANCE;
        private static final Parser<BattlePassSchedule> PARSER;
        
        private BattlePassSchedule(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private BattlePassSchedule() {
            this.memoizedIsInitialized = -1;
            this.unlockStatus_ = 0;
            this.rewardTakenList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new BattlePassSchedule();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private BattlePassSchedule(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.point_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.beginTime_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.isViewed_ = input.readBool();
                            continue;
                        }
                        case 34: {
                            BattlePassCycleOuterClass.BattlePassCycle.Builder subBuilder = null;
                            if (this.curCycle_ != null) {
                                subBuilder = this.curCycle_.toBuilder();
                            }
                            this.curCycle_ = input.readMessage(BattlePassCycleOuterClass.BattlePassCycle.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.curCycle_);
                                this.curCycle_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 48: {
                            this.isExtraPaidRewardTaken_ = input.readBool();
                            continue;
                        }
                        case 56: {
                            final int rawValue = input.readEnum();
                            this.unlockStatus_ = rawValue;
                            continue;
                        }
                        case 72: {
                            this.scheduleId_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
                            this.curCyclePoints_ = input.readUInt32();
                            continue;
                        }
                        case 90: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.rewardTakenList_ = new ArrayList<BattlePassRewardTagOuterClass.BattlePassRewardTag>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.rewardTakenList_.add(input.readMessage(BattlePassRewardTagOuterClass.BattlePassRewardTag.parser(), extensionRegistry));
                            continue;
                        }
                        case 96: {
                            this.unk2700ODHAAHEPFAG_ = input.readUInt32();
                            continue;
                        }
                        case 106: {
                            BattlePassProductOuterClass.BattlePassProduct.Builder subBuilder2 = null;
                            if (this.productInfo_ != null) {
                                subBuilder2 = this.productInfo_.toBuilder();
                            }
                            this.productInfo_ = input.readMessage(BattlePassProductOuterClass.BattlePassProduct.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom(this.productInfo_);
                                this.productInfo_ = subBuilder2.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 112: {
                            this.level_ = input.readUInt32();
                            continue;
                        }
                        case 120: {
                            this.endTime_ = input.readUInt32();
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
                    this.rewardTakenList_ = Collections.unmodifiableList((List<? extends BattlePassRewardTagOuterClass.BattlePassRewardTag>)this.rewardTakenList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return BattlePassScheduleOuterClass.internal_static_BattlePassSchedule_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return BattlePassScheduleOuterClass.internal_static_BattlePassSchedule_fieldAccessorTable.ensureFieldAccessorsInitialized(BattlePassSchedule.class, Builder.class);
        }
        
        @Override
        public int getLevel() {
            return this.level_;
        }
        
        @Override
        public int getBeginTime() {
            return this.beginTime_;
        }
        
        @Override
        public int getEndTime() {
            return this.endTime_;
        }
        
        @Override
        public int getPoint() {
            return this.point_;
        }
        
        @Override
        public boolean hasCurCycle() {
            return this.curCycle_ != null;
        }
        
        @Override
        public BattlePassCycleOuterClass.BattlePassCycle getCurCycle() {
            return (this.curCycle_ == null) ? BattlePassCycleOuterClass.BattlePassCycle.getDefaultInstance() : this.curCycle_;
        }
        
        @Override
        public BattlePassCycleOuterClass.BattlePassCycleOrBuilder getCurCycleOrBuilder() {
            return this.getCurCycle();
        }
        
        @Override
        public int getUnlockStatusValue() {
            return this.unlockStatus_;
        }
        
        @Override
        public BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus getUnlockStatus() {
            final BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus result = BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus.valueOf(this.unlockStatus_);
            return (result == null) ? BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus.UNRECOGNIZED : result;
        }
        
        @Override
        public List<BattlePassRewardTagOuterClass.BattlePassRewardTag> getRewardTakenListList() {
            return this.rewardTakenList_;
        }
        
        @Override
        public List<? extends BattlePassRewardTagOuterClass.BattlePassRewardTagOrBuilder> getRewardTakenListOrBuilderList() {
            return this.rewardTakenList_;
        }
        
        @Override
        public int getRewardTakenListCount() {
            return this.rewardTakenList_.size();
        }
        
        @Override
        public BattlePassRewardTagOuterClass.BattlePassRewardTag getRewardTakenList(final int index) {
            return this.rewardTakenList_.get(index);
        }
        
        @Override
        public BattlePassRewardTagOuterClass.BattlePassRewardTagOrBuilder getRewardTakenListOrBuilder(final int index) {
            return this.rewardTakenList_.get(index);
        }
        
        @Override
        public int getCurCyclePoints() {
            return this.curCyclePoints_;
        }
        
        @Override
        public int getUnk2700ODHAAHEPFAG() {
            return this.unk2700ODHAAHEPFAG_;
        }
        
        @Override
        public boolean hasProductInfo() {
            return this.productInfo_ != null;
        }
        
        @Override
        public BattlePassProductOuterClass.BattlePassProduct getProductInfo() {
            return (this.productInfo_ == null) ? BattlePassProductOuterClass.BattlePassProduct.getDefaultInstance() : this.productInfo_;
        }
        
        @Override
        public BattlePassProductOuterClass.BattlePassProductOrBuilder getProductInfoOrBuilder() {
            return this.getProductInfo();
        }
        
        @Override
        public boolean getIsExtraPaidRewardTaken() {
            return this.isExtraPaidRewardTaken_;
        }
        
        @Override
        public boolean getIsViewed() {
            return this.isViewed_;
        }
        
        @Override
        public int getScheduleId() {
            return this.scheduleId_;
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
            if (this.point_ != 0) {
                output.writeUInt32(1, this.point_);
            }
            if (this.beginTime_ != 0) {
                output.writeUInt32(2, this.beginTime_);
            }
            if (this.isViewed_) {
                output.writeBool(3, this.isViewed_);
            }
            if (this.curCycle_ != null) {
                output.writeMessage(4, this.getCurCycle());
            }
            if (this.isExtraPaidRewardTaken_) {
                output.writeBool(6, this.isExtraPaidRewardTaken_);
            }
            if (this.unlockStatus_ != BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus.BATTLE_PASS_UNLOCK_STATUS_INVALID.getNumber()) {
                output.writeEnum(7, this.unlockStatus_);
            }
            if (this.scheduleId_ != 0) {
                output.writeUInt32(9, this.scheduleId_);
            }
            if (this.curCyclePoints_ != 0) {
                output.writeUInt32(10, this.curCyclePoints_);
            }
            for (int i = 0; i < this.rewardTakenList_.size(); ++i) {
                output.writeMessage(11, this.rewardTakenList_.get(i));
            }
            if (this.unk2700ODHAAHEPFAG_ != 0) {
                output.writeUInt32(12, this.unk2700ODHAAHEPFAG_);
            }
            if (this.productInfo_ != null) {
                output.writeMessage(13, this.getProductInfo());
            }
            if (this.level_ != 0) {
                output.writeUInt32(14, this.level_);
            }
            if (this.endTime_ != 0) {
                output.writeUInt32(15, this.endTime_);
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
            if (this.point_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.point_);
            }
            if (this.beginTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.beginTime_);
            }
            if (this.isViewed_) {
                size += CodedOutputStream.computeBoolSize(3, this.isViewed_);
            }
            if (this.curCycle_ != null) {
                size += CodedOutputStream.computeMessageSize(4, this.getCurCycle());
            }
            if (this.isExtraPaidRewardTaken_) {
                size += CodedOutputStream.computeBoolSize(6, this.isExtraPaidRewardTaken_);
            }
            if (this.unlockStatus_ != BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus.BATTLE_PASS_UNLOCK_STATUS_INVALID.getNumber()) {
                size += CodedOutputStream.computeEnumSize(7, this.unlockStatus_);
            }
            if (this.scheduleId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.scheduleId_);
            }
            if (this.curCyclePoints_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.curCyclePoints_);
            }
            for (int i = 0; i < this.rewardTakenList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(11, this.rewardTakenList_.get(i));
            }
            if (this.unk2700ODHAAHEPFAG_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.unk2700ODHAAHEPFAG_);
            }
            if (this.productInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(13, this.getProductInfo());
            }
            if (this.level_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.level_);
            }
            if (this.endTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.endTime_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattlePassSchedule)) {
                return super.equals(obj);
            }
            final BattlePassSchedule other = (BattlePassSchedule)obj;
            return this.getLevel() == other.getLevel() && this.getBeginTime() == other.getBeginTime() && this.getEndTime() == other.getEndTime() && this.getPoint() == other.getPoint() && this.hasCurCycle() == other.hasCurCycle() && (!this.hasCurCycle() || this.getCurCycle().equals(other.getCurCycle())) && this.unlockStatus_ == other.unlockStatus_ && this.getRewardTakenListList().equals(other.getRewardTakenListList()) && this.getCurCyclePoints() == other.getCurCyclePoints() && this.getUnk2700ODHAAHEPFAG() == other.getUnk2700ODHAAHEPFAG() && this.hasProductInfo() == other.hasProductInfo() && (!this.hasProductInfo() || this.getProductInfo().equals(other.getProductInfo())) && this.getIsExtraPaidRewardTaken() == other.getIsExtraPaidRewardTaken() && this.getIsViewed() == other.getIsViewed() && this.getScheduleId() == other.getScheduleId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getLevel();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getBeginTime();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getEndTime();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getPoint();
            if (this.hasCurCycle()) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getCurCycle().hashCode();
            }
            hash = 37 * hash + 7;
            hash = 53 * hash + this.unlockStatus_;
            if (this.getRewardTakenListCount() > 0) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.getRewardTakenListList().hashCode();
            }
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getCurCyclePoints();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getUnk2700ODHAAHEPFAG();
            if (this.hasProductInfo()) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.getProductInfo().hashCode();
            }
            hash = 37 * hash + 6;
            hash = 53 * hash + Internal.hashBoolean(this.getIsExtraPaidRewardTaken());
            hash = 37 * hash + 3;
            hash = 53 * hash + Internal.hashBoolean(this.getIsViewed());
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getScheduleId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static BattlePassSchedule parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return BattlePassSchedule.PARSER.parseFrom(data);
        }
        
        public static BattlePassSchedule parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassSchedule.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassSchedule parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return BattlePassSchedule.PARSER.parseFrom(data);
        }
        
        public static BattlePassSchedule parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassSchedule.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassSchedule parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return BattlePassSchedule.PARSER.parseFrom(data);
        }
        
        public static BattlePassSchedule parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassSchedule.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassSchedule parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassSchedule.PARSER, input);
        }
        
        public static BattlePassSchedule parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassSchedule.PARSER, input, extensionRegistry);
        }
        
        public static BattlePassSchedule parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BattlePassSchedule.PARSER, input);
        }
        
        public static BattlePassSchedule parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BattlePassSchedule.PARSER, input, extensionRegistry);
        }
        
        public static BattlePassSchedule parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassSchedule.PARSER, input);
        }
        
        public static BattlePassSchedule parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassSchedule.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return BattlePassSchedule.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final BattlePassSchedule prototype) {
            return BattlePassSchedule.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == BattlePassSchedule.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static BattlePassSchedule getDefaultInstance() {
            return BattlePassSchedule.DEFAULT_INSTANCE;
        }
        
        public static Parser<BattlePassSchedule> parser() {
            return BattlePassSchedule.PARSER;
        }
        
        @Override
        public Parser<BattlePassSchedule> getParserForType() {
            return BattlePassSchedule.PARSER;
        }
        
        @Override
        public BattlePassSchedule getDefaultInstanceForType() {
            return BattlePassSchedule.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new BattlePassSchedule();
            PARSER = new AbstractParser<BattlePassSchedule>() {
                @Override
                public BattlePassSchedule parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new BattlePassSchedule(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BattlePassScheduleOrBuilder
        {
            private int bitField0_;
            private int level_;
            private int beginTime_;
            private int endTime_;
            private int point_;
            private BattlePassCycleOuterClass.BattlePassCycle curCycle_;
            private SingleFieldBuilderV3<BattlePassCycleOuterClass.BattlePassCycle, BattlePassCycleOuterClass.BattlePassCycle.Builder, BattlePassCycleOuterClass.BattlePassCycleOrBuilder> curCycleBuilder_;
            private int unlockStatus_;
            private List<BattlePassRewardTagOuterClass.BattlePassRewardTag> rewardTakenList_;
            private RepeatedFieldBuilderV3<BattlePassRewardTagOuterClass.BattlePassRewardTag, BattlePassRewardTagOuterClass.BattlePassRewardTag.Builder, BattlePassRewardTagOuterClass.BattlePassRewardTagOrBuilder> rewardTakenListBuilder_;
            private int curCyclePoints_;
            private int unk2700ODHAAHEPFAG_;
            private BattlePassProductOuterClass.BattlePassProduct productInfo_;
            private SingleFieldBuilderV3<BattlePassProductOuterClass.BattlePassProduct, BattlePassProductOuterClass.BattlePassProduct.Builder, BattlePassProductOuterClass.BattlePassProductOrBuilder> productInfoBuilder_;
            private boolean isExtraPaidRewardTaken_;
            private boolean isViewed_;
            private int scheduleId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return BattlePassScheduleOuterClass.internal_static_BattlePassSchedule_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return BattlePassScheduleOuterClass.internal_static_BattlePassSchedule_fieldAccessorTable.ensureFieldAccessorsInitialized(BattlePassSchedule.class, Builder.class);
            }
            
            private Builder() {
                this.unlockStatus_ = 0;
                this.rewardTakenList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.unlockStatus_ = 0;
                this.rewardTakenList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (BattlePassSchedule.alwaysUseFieldBuilders) {
                    this.getRewardTakenListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.level_ = 0;
                this.beginTime_ = 0;
                this.endTime_ = 0;
                this.point_ = 0;
                if (this.curCycleBuilder_ == null) {
                    this.curCycle_ = null;
                }
                else {
                    this.curCycle_ = null;
                    this.curCycleBuilder_ = null;
                }
                this.unlockStatus_ = 0;
                if (this.rewardTakenListBuilder_ == null) {
                    this.rewardTakenList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.rewardTakenListBuilder_.clear();
                }
                this.curCyclePoints_ = 0;
                this.unk2700ODHAAHEPFAG_ = 0;
                if (this.productInfoBuilder_ == null) {
                    this.productInfo_ = null;
                }
                else {
                    this.productInfo_ = null;
                    this.productInfoBuilder_ = null;
                }
                this.isExtraPaidRewardTaken_ = false;
                this.isViewed_ = false;
                this.scheduleId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return BattlePassScheduleOuterClass.internal_static_BattlePassSchedule_descriptor;
            }
            
            @Override
            public BattlePassSchedule getDefaultInstanceForType() {
                return BattlePassSchedule.getDefaultInstance();
            }
            
            @Override
            public BattlePassSchedule build() {
                final BattlePassSchedule result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public BattlePassSchedule buildPartial() {
                final BattlePassSchedule result = new BattlePassSchedule(this);
                final int from_bitField0_ = this.bitField0_;
                result.level_ = this.level_;
                result.beginTime_ = this.beginTime_;
                result.endTime_ = this.endTime_;
                result.point_ = this.point_;
                if (this.curCycleBuilder_ == null) {
                    result.curCycle_ = this.curCycle_;
                }
                else {
                    result.curCycle_ = this.curCycleBuilder_.build();
                }
                result.unlockStatus_ = this.unlockStatus_;
                if (this.rewardTakenListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.rewardTakenList_ = Collections.unmodifiableList((List<? extends BattlePassRewardTagOuterClass.BattlePassRewardTag>)this.rewardTakenList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.rewardTakenList_ = this.rewardTakenList_;
                }
                else {
                    result.rewardTakenList_ = this.rewardTakenListBuilder_.build();
                }
                result.curCyclePoints_ = this.curCyclePoints_;
                result.unk2700ODHAAHEPFAG_ = this.unk2700ODHAAHEPFAG_;
                if (this.productInfoBuilder_ == null) {
                    result.productInfo_ = this.productInfo_;
                }
                else {
                    result.productInfo_ = this.productInfoBuilder_.build();
                }
                result.isExtraPaidRewardTaken_ = this.isExtraPaidRewardTaken_;
                result.isViewed_ = this.isViewed_;
                result.scheduleId_ = this.scheduleId_;
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
                if (other instanceof BattlePassSchedule) {
                    return this.mergeFrom((BattlePassSchedule)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final BattlePassSchedule other) {
                if (other == BattlePassSchedule.getDefaultInstance()) {
                    return this;
                }
                if (other.getLevel() != 0) {
                    this.setLevel(other.getLevel());
                }
                if (other.getBeginTime() != 0) {
                    this.setBeginTime(other.getBeginTime());
                }
                if (other.getEndTime() != 0) {
                    this.setEndTime(other.getEndTime());
                }
                if (other.getPoint() != 0) {
                    this.setPoint(other.getPoint());
                }
                if (other.hasCurCycle()) {
                    this.mergeCurCycle(other.getCurCycle());
                }
                if (other.unlockStatus_ != 0) {
                    this.setUnlockStatusValue(other.getUnlockStatusValue());
                }
                if (this.rewardTakenListBuilder_ == null) {
                    if (!other.rewardTakenList_.isEmpty()) {
                        if (this.rewardTakenList_.isEmpty()) {
                            this.rewardTakenList_ = other.rewardTakenList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureRewardTakenListIsMutable();
                            this.rewardTakenList_.addAll(other.rewardTakenList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.rewardTakenList_.isEmpty()) {
                    if (this.rewardTakenListBuilder_.isEmpty()) {
                        this.rewardTakenListBuilder_.dispose();
                        this.rewardTakenListBuilder_ = null;
                        this.rewardTakenList_ = other.rewardTakenList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.rewardTakenListBuilder_ = (BattlePassSchedule.alwaysUseFieldBuilders ? this.getRewardTakenListFieldBuilder() : null);
                    }
                    else {
                        this.rewardTakenListBuilder_.addAllMessages(other.rewardTakenList_);
                    }
                }
                if (other.getCurCyclePoints() != 0) {
                    this.setCurCyclePoints(other.getCurCyclePoints());
                }
                if (other.getUnk2700ODHAAHEPFAG() != 0) {
                    this.setUnk2700ODHAAHEPFAG(other.getUnk2700ODHAAHEPFAG());
                }
                if (other.hasProductInfo()) {
                    this.mergeProductInfo(other.getProductInfo());
                }
                if (other.getIsExtraPaidRewardTaken()) {
                    this.setIsExtraPaidRewardTaken(other.getIsExtraPaidRewardTaken());
                }
                if (other.getIsViewed()) {
                    this.setIsViewed(other.getIsViewed());
                }
                if (other.getScheduleId() != 0) {
                    this.setScheduleId(other.getScheduleId());
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
                BattlePassSchedule parsedMessage = null;
                try {
                    parsedMessage = BattlePassSchedule.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (BattlePassSchedule)e.getUnfinishedMessage();
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
            public int getLevel() {
                return this.level_;
            }
            
            public Builder setLevel(final int value) {
                this.level_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLevel() {
                this.level_ = 0;
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
            
            @Override
            public int getPoint() {
                return this.point_;
            }
            
            public Builder setPoint(final int value) {
                this.point_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPoint() {
                this.point_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasCurCycle() {
                return this.curCycleBuilder_ != null || this.curCycle_ != null;
            }
            
            @Override
            public BattlePassCycleOuterClass.BattlePassCycle getCurCycle() {
                if (this.curCycleBuilder_ == null) {
                    return (this.curCycle_ == null) ? BattlePassCycleOuterClass.BattlePassCycle.getDefaultInstance() : this.curCycle_;
                }
                return this.curCycleBuilder_.getMessage();
            }
            
            public Builder setCurCycle(final BattlePassCycleOuterClass.BattlePassCycle value) {
                if (this.curCycleBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.curCycle_ = value;
                    this.onChanged();
                }
                else {
                    this.curCycleBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setCurCycle(final BattlePassCycleOuterClass.BattlePassCycle.Builder builderForValue) {
                if (this.curCycleBuilder_ == null) {
                    this.curCycle_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.curCycleBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeCurCycle(final BattlePassCycleOuterClass.BattlePassCycle value) {
                if (this.curCycleBuilder_ == null) {
                    if (this.curCycle_ != null) {
                        this.curCycle_ = BattlePassCycleOuterClass.BattlePassCycle.newBuilder(this.curCycle_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.curCycle_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.curCycleBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearCurCycle() {
                if (this.curCycleBuilder_ == null) {
                    this.curCycle_ = null;
                    this.onChanged();
                }
                else {
                    this.curCycle_ = null;
                    this.curCycleBuilder_ = null;
                }
                return this;
            }
            
            public BattlePassCycleOuterClass.BattlePassCycle.Builder getCurCycleBuilder() {
                this.onChanged();
                return this.getCurCycleFieldBuilder().getBuilder();
            }
            
            @Override
            public BattlePassCycleOuterClass.BattlePassCycleOrBuilder getCurCycleOrBuilder() {
                if (this.curCycleBuilder_ != null) {
                    return this.curCycleBuilder_.getMessageOrBuilder();
                }
                return (this.curCycle_ == null) ? BattlePassCycleOuterClass.BattlePassCycle.getDefaultInstance() : this.curCycle_;
            }
            
            private SingleFieldBuilderV3<BattlePassCycleOuterClass.BattlePassCycle, BattlePassCycleOuterClass.BattlePassCycle.Builder, BattlePassCycleOuterClass.BattlePassCycleOrBuilder> getCurCycleFieldBuilder() {
                if (this.curCycleBuilder_ == null) {
                    this.curCycleBuilder_ = new SingleFieldBuilderV3<BattlePassCycleOuterClass.BattlePassCycle, BattlePassCycleOuterClass.BattlePassCycle.Builder, BattlePassCycleOuterClass.BattlePassCycleOrBuilder>(this.getCurCycle(), this.getParentForChildren(), this.isClean());
                    this.curCycle_ = null;
                }
                return this.curCycleBuilder_;
            }
            
            @Override
            public int getUnlockStatusValue() {
                return this.unlockStatus_;
            }
            
            public Builder setUnlockStatusValue(final int value) {
                this.unlockStatus_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus getUnlockStatus() {
                final BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus result = BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus.valueOf(this.unlockStatus_);
                return (result == null) ? BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus.UNRECOGNIZED : result;
            }
            
            public Builder setUnlockStatus(final BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.unlockStatus_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearUnlockStatus() {
                this.unlockStatus_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureRewardTakenListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.rewardTakenList_ = new ArrayList<BattlePassRewardTagOuterClass.BattlePassRewardTag>(this.rewardTakenList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<BattlePassRewardTagOuterClass.BattlePassRewardTag> getRewardTakenListList() {
                if (this.rewardTakenListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends BattlePassRewardTagOuterClass.BattlePassRewardTag>)this.rewardTakenList_);
                }
                return this.rewardTakenListBuilder_.getMessageList();
            }
            
            @Override
            public int getRewardTakenListCount() {
                if (this.rewardTakenListBuilder_ == null) {
                    return this.rewardTakenList_.size();
                }
                return this.rewardTakenListBuilder_.getCount();
            }
            
            @Override
            public BattlePassRewardTagOuterClass.BattlePassRewardTag getRewardTakenList(final int index) {
                if (this.rewardTakenListBuilder_ == null) {
                    return this.rewardTakenList_.get(index);
                }
                return this.rewardTakenListBuilder_.getMessage(index);
            }
            
            public Builder setRewardTakenList(final int index, final BattlePassRewardTagOuterClass.BattlePassRewardTag value) {
                if (this.rewardTakenListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureRewardTakenListIsMutable();
                    this.rewardTakenList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.rewardTakenListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setRewardTakenList(final int index, final BattlePassRewardTagOuterClass.BattlePassRewardTag.Builder builderForValue) {
                if (this.rewardTakenListBuilder_ == null) {
                    this.ensureRewardTakenListIsMutable();
                    this.rewardTakenList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.rewardTakenListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addRewardTakenList(final BattlePassRewardTagOuterClass.BattlePassRewardTag value) {
                if (this.rewardTakenListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureRewardTakenListIsMutable();
                    this.rewardTakenList_.add(value);
                    this.onChanged();
                }
                else {
                    this.rewardTakenListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addRewardTakenList(final int index, final BattlePassRewardTagOuterClass.BattlePassRewardTag value) {
                if (this.rewardTakenListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureRewardTakenListIsMutable();
                    this.rewardTakenList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.rewardTakenListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addRewardTakenList(final BattlePassRewardTagOuterClass.BattlePassRewardTag.Builder builderForValue) {
                if (this.rewardTakenListBuilder_ == null) {
                    this.ensureRewardTakenListIsMutable();
                    this.rewardTakenList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.rewardTakenListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addRewardTakenList(final int index, final BattlePassRewardTagOuterClass.BattlePassRewardTag.Builder builderForValue) {
                if (this.rewardTakenListBuilder_ == null) {
                    this.ensureRewardTakenListIsMutable();
                    this.rewardTakenList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.rewardTakenListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllRewardTakenList(final Iterable<? extends BattlePassRewardTagOuterClass.BattlePassRewardTag> values) {
                if (this.rewardTakenListBuilder_ == null) {
                    this.ensureRewardTakenListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.rewardTakenList_);
                    this.onChanged();
                }
                else {
                    this.rewardTakenListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearRewardTakenList() {
                if (this.rewardTakenListBuilder_ == null) {
                    this.rewardTakenList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.rewardTakenListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeRewardTakenList(final int index) {
                if (this.rewardTakenListBuilder_ == null) {
                    this.ensureRewardTakenListIsMutable();
                    this.rewardTakenList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.rewardTakenListBuilder_.remove(index);
                }
                return this;
            }
            
            public BattlePassRewardTagOuterClass.BattlePassRewardTag.Builder getRewardTakenListBuilder(final int index) {
                return this.getRewardTakenListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public BattlePassRewardTagOuterClass.BattlePassRewardTagOrBuilder getRewardTakenListOrBuilder(final int index) {
                if (this.rewardTakenListBuilder_ == null) {
                    return this.rewardTakenList_.get(index);
                }
                return this.rewardTakenListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends BattlePassRewardTagOuterClass.BattlePassRewardTagOrBuilder> getRewardTakenListOrBuilderList() {
                if (this.rewardTakenListBuilder_ != null) {
                    return this.rewardTakenListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends BattlePassRewardTagOuterClass.BattlePassRewardTagOrBuilder>)this.rewardTakenList_);
            }
            
            public BattlePassRewardTagOuterClass.BattlePassRewardTag.Builder addRewardTakenListBuilder() {
                return this.getRewardTakenListFieldBuilder().addBuilder(BattlePassRewardTagOuterClass.BattlePassRewardTag.getDefaultInstance());
            }
            
            public BattlePassRewardTagOuterClass.BattlePassRewardTag.Builder addRewardTakenListBuilder(final int index) {
                return this.getRewardTakenListFieldBuilder().addBuilder(index, BattlePassRewardTagOuterClass.BattlePassRewardTag.getDefaultInstance());
            }
            
            public List<BattlePassRewardTagOuterClass.BattlePassRewardTag.Builder> getRewardTakenListBuilderList() {
                return this.getRewardTakenListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<BattlePassRewardTagOuterClass.BattlePassRewardTag, BattlePassRewardTagOuterClass.BattlePassRewardTag.Builder, BattlePassRewardTagOuterClass.BattlePassRewardTagOrBuilder> getRewardTakenListFieldBuilder() {
                if (this.rewardTakenListBuilder_ == null) {
                    this.rewardTakenListBuilder_ = new RepeatedFieldBuilderV3<BattlePassRewardTagOuterClass.BattlePassRewardTag, BattlePassRewardTagOuterClass.BattlePassRewardTag.Builder, BattlePassRewardTagOuterClass.BattlePassRewardTagOrBuilder>(this.rewardTakenList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.rewardTakenList_ = null;
                }
                return this.rewardTakenListBuilder_;
            }
            
            @Override
            public int getCurCyclePoints() {
                return this.curCyclePoints_;
            }
            
            public Builder setCurCyclePoints(final int value) {
                this.curCyclePoints_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurCyclePoints() {
                this.curCyclePoints_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnk2700ODHAAHEPFAG() {
                return this.unk2700ODHAAHEPFAG_;
            }
            
            public Builder setUnk2700ODHAAHEPFAG(final int value) {
                this.unk2700ODHAAHEPFAG_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700ODHAAHEPFAG() {
                this.unk2700ODHAAHEPFAG_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasProductInfo() {
                return this.productInfoBuilder_ != null || this.productInfo_ != null;
            }
            
            @Override
            public BattlePassProductOuterClass.BattlePassProduct getProductInfo() {
                if (this.productInfoBuilder_ == null) {
                    return (this.productInfo_ == null) ? BattlePassProductOuterClass.BattlePassProduct.getDefaultInstance() : this.productInfo_;
                }
                return this.productInfoBuilder_.getMessage();
            }
            
            public Builder setProductInfo(final BattlePassProductOuterClass.BattlePassProduct value) {
                if (this.productInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.productInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.productInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setProductInfo(final BattlePassProductOuterClass.BattlePassProduct.Builder builderForValue) {
                if (this.productInfoBuilder_ == null) {
                    this.productInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.productInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeProductInfo(final BattlePassProductOuterClass.BattlePassProduct value) {
                if (this.productInfoBuilder_ == null) {
                    if (this.productInfo_ != null) {
                        this.productInfo_ = BattlePassProductOuterClass.BattlePassProduct.newBuilder(this.productInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.productInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.productInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearProductInfo() {
                if (this.productInfoBuilder_ == null) {
                    this.productInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.productInfo_ = null;
                    this.productInfoBuilder_ = null;
                }
                return this;
            }
            
            public BattlePassProductOuterClass.BattlePassProduct.Builder getProductInfoBuilder() {
                this.onChanged();
                return this.getProductInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public BattlePassProductOuterClass.BattlePassProductOrBuilder getProductInfoOrBuilder() {
                if (this.productInfoBuilder_ != null) {
                    return this.productInfoBuilder_.getMessageOrBuilder();
                }
                return (this.productInfo_ == null) ? BattlePassProductOuterClass.BattlePassProduct.getDefaultInstance() : this.productInfo_;
            }
            
            private SingleFieldBuilderV3<BattlePassProductOuterClass.BattlePassProduct, BattlePassProductOuterClass.BattlePassProduct.Builder, BattlePassProductOuterClass.BattlePassProductOrBuilder> getProductInfoFieldBuilder() {
                if (this.productInfoBuilder_ == null) {
                    this.productInfoBuilder_ = new SingleFieldBuilderV3<BattlePassProductOuterClass.BattlePassProduct, BattlePassProductOuterClass.BattlePassProduct.Builder, BattlePassProductOuterClass.BattlePassProductOrBuilder>(this.getProductInfo(), this.getParentForChildren(), this.isClean());
                    this.productInfo_ = null;
                }
                return this.productInfoBuilder_;
            }
            
            @Override
            public boolean getIsExtraPaidRewardTaken() {
                return this.isExtraPaidRewardTaken_;
            }
            
            public Builder setIsExtraPaidRewardTaken(final boolean value) {
                this.isExtraPaidRewardTaken_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsExtraPaidRewardTaken() {
                this.isExtraPaidRewardTaken_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsViewed() {
                return this.isViewed_;
            }
            
            public Builder setIsViewed(final boolean value) {
                this.isViewed_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsViewed() {
                this.isViewed_ = false;
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface BattlePassScheduleOrBuilder extends MessageOrBuilder
    {
        int getLevel();
        
        int getBeginTime();
        
        int getEndTime();
        
        int getPoint();
        
        boolean hasCurCycle();
        
        BattlePassCycleOuterClass.BattlePassCycle getCurCycle();
        
        BattlePassCycleOuterClass.BattlePassCycleOrBuilder getCurCycleOrBuilder();
        
        int getUnlockStatusValue();
        
        BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus getUnlockStatus();
        
        List<BattlePassRewardTagOuterClass.BattlePassRewardTag> getRewardTakenListList();
        
        BattlePassRewardTagOuterClass.BattlePassRewardTag getRewardTakenList(final int p0);
        
        int getRewardTakenListCount();
        
        List<? extends BattlePassRewardTagOuterClass.BattlePassRewardTagOrBuilder> getRewardTakenListOrBuilderList();
        
        BattlePassRewardTagOuterClass.BattlePassRewardTagOrBuilder getRewardTakenListOrBuilder(final int p0);
        
        int getCurCyclePoints();
        
        int getUnk2700ODHAAHEPFAG();
        
        boolean hasProductInfo();
        
        BattlePassProductOuterClass.BattlePassProduct getProductInfo();
        
        BattlePassProductOuterClass.BattlePassProductOrBuilder getProductInfoOrBuilder();
        
        boolean getIsExtraPaidRewardTaken();
        
        boolean getIsViewed();
        
        int getScheduleId();
    }
}
