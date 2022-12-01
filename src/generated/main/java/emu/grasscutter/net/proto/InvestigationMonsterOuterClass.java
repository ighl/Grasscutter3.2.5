// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.ProtocolMessageEnum;
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
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class InvestigationMonsterOuterClass
{
    private static final Descriptors.Descriptor internal_static_InvestigationMonster_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_InvestigationMonster_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private InvestigationMonsterOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return InvestigationMonsterOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001aInvestigationMonster.proto\u001a\fVector.proto\u001a!WeeklyBossResinDiscountInfo.proto\"\u008e\u0004\n\u0014InvestigationMonster\u0012\u0010\n\bis_alive\u0018\t \u0001(\b\u0012\u0018\n\u0010refresh_interval\u0018\u0003 \u0001(\r\u0012\n\n\u0002id\u0018\r \u0001(\r\u0012\r\n\u0005level\u0018\u0005 \u0001(\r\u0012\u0016\n\u000eboss_chest_num\u0018\u0001 \u0001(\r\u0012E\n\u001fweekly_boss_resin_discount_info\u0018\f \u0001(\u000b2\u001c.WeeklyBossResinDiscountInfo\u0012\u0013\n\nmonster_id\u0018\u00ad\u0002 \u0001(\r\u0012\u0014\n\u0003pos\u0018\u000e \u0001(\u000b2\u0007.Vector\u0012\r\n\u0005resin\u0018\b \u0001(\r\u0012\u001a\n\u0012max_boss_chest_num\u0018\u0004 \u0001(\r\u0012\u0019\n\u0011next_refresh_time\u0018\u000b \u0001(\r\u0012\u0011\n\bgroup_id\u0018\u009d\u0002 \u0001(\r\u0012\u0010\n\bscene_id\u0018\n \u0001(\r\u0012\u0016\n\u000eis_area_locked\u0018\u000f \u0001(\b\u00123\n\nlock_state\u0018\u0002 \u0001(\u000e2\u001f.InvestigationMonster.LockState\u0012$\n\u001cnext_boss_chest_refresh_time\u0018\u0007 \u0001(\r\u0012\u000f\n\u0007city_id\u0018\u0006 \u0001(\r\"6\n\tLockState\u0012\u0013\n\u000fLOCK_STATE_NONE\u0010\u0000\u0012\u0014\n\u0010LOCK_STATE_QUEST\u0010\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        InvestigationMonsterOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { VectorOuterClass.getDescriptor(), WeeklyBossResinDiscountInfoOuterClass.getDescriptor() });
        internal_static_InvestigationMonster_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_InvestigationMonster_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(InvestigationMonsterOuterClass.internal_static_InvestigationMonster_descriptor, new String[] { "IsAlive", "RefreshInterval", "Id", "Level", "BossChestNum", "WeeklyBossResinDiscountInfo", "MonsterId", "Pos", "Resin", "MaxBossChestNum", "NextRefreshTime", "GroupId", "SceneId", "IsAreaLocked", "LockState", "NextBossChestRefreshTime", "CityId" });
        VectorOuterClass.getDescriptor();
        WeeklyBossResinDiscountInfoOuterClass.getDescriptor();
    }
    
    public static final class InvestigationMonster extends GeneratedMessageV3 implements InvestigationMonsterOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int IS_ALIVE_FIELD_NUMBER = 9;
        private boolean isAlive_;
        public static final int REFRESH_INTERVAL_FIELD_NUMBER = 3;
        private int refreshInterval_;
        public static final int ID_FIELD_NUMBER = 13;
        private int id_;
        public static final int LEVEL_FIELD_NUMBER = 5;
        private int level_;
        public static final int BOSS_CHEST_NUM_FIELD_NUMBER = 1;
        private int bossChestNum_;
        public static final int WEEKLY_BOSS_RESIN_DISCOUNT_INFO_FIELD_NUMBER = 12;
        private WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo weeklyBossResinDiscountInfo_;
        public static final int MONSTER_ID_FIELD_NUMBER = 301;
        private int monsterId_;
        public static final int POS_FIELD_NUMBER = 14;
        private VectorOuterClass.Vector pos_;
        public static final int RESIN_FIELD_NUMBER = 8;
        private int resin_;
        public static final int MAX_BOSS_CHEST_NUM_FIELD_NUMBER = 4;
        private int maxBossChestNum_;
        public static final int NEXT_REFRESH_TIME_FIELD_NUMBER = 11;
        private int nextRefreshTime_;
        public static final int GROUP_ID_FIELD_NUMBER = 285;
        private int groupId_;
        public static final int SCENE_ID_FIELD_NUMBER = 10;
        private int sceneId_;
        public static final int IS_AREA_LOCKED_FIELD_NUMBER = 15;
        private boolean isAreaLocked_;
        public static final int LOCK_STATE_FIELD_NUMBER = 2;
        private int lockState_;
        public static final int NEXT_BOSS_CHEST_REFRESH_TIME_FIELD_NUMBER = 7;
        private int nextBossChestRefreshTime_;
        public static final int CITY_ID_FIELD_NUMBER = 6;
        private int cityId_;
        private byte memoizedIsInitialized;
        private static final InvestigationMonster DEFAULT_INSTANCE;
        private static final Parser<InvestigationMonster> PARSER;
        
        private InvestigationMonster(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private InvestigationMonster() {
            this.memoizedIsInitialized = -1;
            this.lockState_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new InvestigationMonster();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private InvestigationMonster(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 8: {
                            this.bossChestNum_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            final int rawValue = input.readEnum();
                            this.lockState_ = rawValue;
                            continue;
                        }
                        case 24: {
                            this.refreshInterval_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.maxBossChestNum_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.level_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.cityId_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            this.nextBossChestRefreshTime_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.resin_ = input.readUInt32();
                            continue;
                        }
                        case 72: {
                            this.isAlive_ = input.readBool();
                            continue;
                        }
                        case 80: {
                            this.sceneId_ = input.readUInt32();
                            continue;
                        }
                        case 88: {
                            this.nextRefreshTime_ = input.readUInt32();
                            continue;
                        }
                        case 98: {
                            WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo.Builder subBuilder = null;
                            if (this.weeklyBossResinDiscountInfo_ != null) {
                                subBuilder = this.weeklyBossResinDiscountInfo_.toBuilder();
                            }
                            this.weeklyBossResinDiscountInfo_ = input.readMessage(WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.weeklyBossResinDiscountInfo_);
                                this.weeklyBossResinDiscountInfo_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 104: {
                            this.id_ = input.readUInt32();
                            continue;
                        }
                        case 114: {
                            VectorOuterClass.Vector.Builder subBuilder2 = null;
                            if (this.pos_ != null) {
                                subBuilder2 = this.pos_.toBuilder();
                            }
                            this.pos_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom(this.pos_);
                                this.pos_ = subBuilder2.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 120: {
                            this.isAreaLocked_ = input.readBool();
                            continue;
                        }
                        case 2280: {
                            this.groupId_ = input.readUInt32();
                            continue;
                        }
                        case 2408: {
                            this.monsterId_ = input.readUInt32();
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
            return InvestigationMonsterOuterClass.internal_static_InvestigationMonster_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return InvestigationMonsterOuterClass.internal_static_InvestigationMonster_fieldAccessorTable.ensureFieldAccessorsInitialized(InvestigationMonster.class, Builder.class);
        }
        
        @Override
        public boolean getIsAlive() {
            return this.isAlive_;
        }
        
        @Override
        public int getRefreshInterval() {
            return this.refreshInterval_;
        }
        
        @Override
        public int getId() {
            return this.id_;
        }
        
        @Override
        public int getLevel() {
            return this.level_;
        }
        
        @Override
        public int getBossChestNum() {
            return this.bossChestNum_;
        }
        
        @Override
        public boolean hasWeeklyBossResinDiscountInfo() {
            return this.weeklyBossResinDiscountInfo_ != null;
        }
        
        @Override
        public WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo getWeeklyBossResinDiscountInfo() {
            return (this.weeklyBossResinDiscountInfo_ == null) ? WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo.getDefaultInstance() : this.weeklyBossResinDiscountInfo_;
        }
        
        @Override
        public WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfoOrBuilder getWeeklyBossResinDiscountInfoOrBuilder() {
            return this.getWeeklyBossResinDiscountInfo();
        }
        
        @Override
        public int getMonsterId() {
            return this.monsterId_;
        }
        
        @Override
        public boolean hasPos() {
            return this.pos_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getPos() {
            return (this.pos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.pos_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
            return this.getPos();
        }
        
        @Override
        public int getResin() {
            return this.resin_;
        }
        
        @Override
        public int getMaxBossChestNum() {
            return this.maxBossChestNum_;
        }
        
        @Override
        public int getNextRefreshTime() {
            return this.nextRefreshTime_;
        }
        
        @Override
        public int getGroupId() {
            return this.groupId_;
        }
        
        @Override
        public int getSceneId() {
            return this.sceneId_;
        }
        
        @Override
        public boolean getIsAreaLocked() {
            return this.isAreaLocked_;
        }
        
        @Override
        public int getLockStateValue() {
            return this.lockState_;
        }
        
        @Override
        public LockState getLockState() {
            final LockState result = LockState.valueOf(this.lockState_);
            return (result == null) ? LockState.UNRECOGNIZED : result;
        }
        
        @Override
        public int getNextBossChestRefreshTime() {
            return this.nextBossChestRefreshTime_;
        }
        
        @Override
        public int getCityId() {
            return this.cityId_;
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
            if (this.bossChestNum_ != 0) {
                output.writeUInt32(1, this.bossChestNum_);
            }
            if (this.lockState_ != LockState.LOCK_STATE_NONE.getNumber()) {
                output.writeEnum(2, this.lockState_);
            }
            if (this.refreshInterval_ != 0) {
                output.writeUInt32(3, this.refreshInterval_);
            }
            if (this.maxBossChestNum_ != 0) {
                output.writeUInt32(4, this.maxBossChestNum_);
            }
            if (this.level_ != 0) {
                output.writeUInt32(5, this.level_);
            }
            if (this.cityId_ != 0) {
                output.writeUInt32(6, this.cityId_);
            }
            if (this.nextBossChestRefreshTime_ != 0) {
                output.writeUInt32(7, this.nextBossChestRefreshTime_);
            }
            if (this.resin_ != 0) {
                output.writeUInt32(8, this.resin_);
            }
            if (this.isAlive_) {
                output.writeBool(9, this.isAlive_);
            }
            if (this.sceneId_ != 0) {
                output.writeUInt32(10, this.sceneId_);
            }
            if (this.nextRefreshTime_ != 0) {
                output.writeUInt32(11, this.nextRefreshTime_);
            }
            if (this.weeklyBossResinDiscountInfo_ != null) {
                output.writeMessage(12, this.getWeeklyBossResinDiscountInfo());
            }
            if (this.id_ != 0) {
                output.writeUInt32(13, this.id_);
            }
            if (this.pos_ != null) {
                output.writeMessage(14, this.getPos());
            }
            if (this.isAreaLocked_) {
                output.writeBool(15, this.isAreaLocked_);
            }
            if (this.groupId_ != 0) {
                output.writeUInt32(285, this.groupId_);
            }
            if (this.monsterId_ != 0) {
                output.writeUInt32(301, this.monsterId_);
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
            if (this.bossChestNum_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.bossChestNum_);
            }
            if (this.lockState_ != LockState.LOCK_STATE_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(2, this.lockState_);
            }
            if (this.refreshInterval_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.refreshInterval_);
            }
            if (this.maxBossChestNum_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.maxBossChestNum_);
            }
            if (this.level_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.level_);
            }
            if (this.cityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.cityId_);
            }
            if (this.nextBossChestRefreshTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.nextBossChestRefreshTime_);
            }
            if (this.resin_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.resin_);
            }
            if (this.isAlive_) {
                size += CodedOutputStream.computeBoolSize(9, this.isAlive_);
            }
            if (this.sceneId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.sceneId_);
            }
            if (this.nextRefreshTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.nextRefreshTime_);
            }
            if (this.weeklyBossResinDiscountInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(12, this.getWeeklyBossResinDiscountInfo());
            }
            if (this.id_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.id_);
            }
            if (this.pos_ != null) {
                size += CodedOutputStream.computeMessageSize(14, this.getPos());
            }
            if (this.isAreaLocked_) {
                size += CodedOutputStream.computeBoolSize(15, this.isAreaLocked_);
            }
            if (this.groupId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(285, this.groupId_);
            }
            if (this.monsterId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(301, this.monsterId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InvestigationMonster)) {
                return super.equals(obj);
            }
            final InvestigationMonster other = (InvestigationMonster)obj;
            return this.getIsAlive() == other.getIsAlive() && this.getRefreshInterval() == other.getRefreshInterval() && this.getId() == other.getId() && this.getLevel() == other.getLevel() && this.getBossChestNum() == other.getBossChestNum() && this.hasWeeklyBossResinDiscountInfo() == other.hasWeeklyBossResinDiscountInfo() && (!this.hasWeeklyBossResinDiscountInfo() || this.getWeeklyBossResinDiscountInfo().equals(other.getWeeklyBossResinDiscountInfo())) && this.getMonsterId() == other.getMonsterId() && this.hasPos() == other.hasPos() && (!this.hasPos() || this.getPos().equals(other.getPos())) && this.getResin() == other.getResin() && this.getMaxBossChestNum() == other.getMaxBossChestNum() && this.getNextRefreshTime() == other.getNextRefreshTime() && this.getGroupId() == other.getGroupId() && this.getSceneId() == other.getSceneId() && this.getIsAreaLocked() == other.getIsAreaLocked() && this.lockState_ == other.lockState_ && this.getNextBossChestRefreshTime() == other.getNextBossChestRefreshTime() && this.getCityId() == other.getCityId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + Internal.hashBoolean(this.getIsAlive());
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getRefreshInterval();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getId();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getLevel();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getBossChestNum();
            if (this.hasWeeklyBossResinDiscountInfo()) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getWeeklyBossResinDiscountInfo().hashCode();
            }
            hash = 37 * hash + 301;
            hash = 53 * hash + this.getMonsterId();
            if (this.hasPos()) {
                hash = 37 * hash + 14;
                hash = 53 * hash + this.getPos().hashCode();
            }
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getResin();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getMaxBossChestNum();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getNextRefreshTime();
            hash = 37 * hash + 285;
            hash = 53 * hash + this.getGroupId();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getSceneId();
            hash = 37 * hash + 15;
            hash = 53 * hash + Internal.hashBoolean(this.getIsAreaLocked());
            hash = 37 * hash + 2;
            hash = 53 * hash + this.lockState_;
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getNextBossChestRefreshTime();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getCityId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static InvestigationMonster parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return InvestigationMonster.PARSER.parseFrom(data);
        }
        
        public static InvestigationMonster parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return InvestigationMonster.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static InvestigationMonster parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return InvestigationMonster.PARSER.parseFrom(data);
        }
        
        public static InvestigationMonster parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return InvestigationMonster.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static InvestigationMonster parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return InvestigationMonster.PARSER.parseFrom(data);
        }
        
        public static InvestigationMonster parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return InvestigationMonster.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static InvestigationMonster parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(InvestigationMonster.PARSER, input);
        }
        
        public static InvestigationMonster parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(InvestigationMonster.PARSER, input, extensionRegistry);
        }
        
        public static InvestigationMonster parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(InvestigationMonster.PARSER, input);
        }
        
        public static InvestigationMonster parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(InvestigationMonster.PARSER, input, extensionRegistry);
        }
        
        public static InvestigationMonster parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(InvestigationMonster.PARSER, input);
        }
        
        public static InvestigationMonster parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(InvestigationMonster.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return InvestigationMonster.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final InvestigationMonster prototype) {
            return InvestigationMonster.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == InvestigationMonster.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static InvestigationMonster getDefaultInstance() {
            return InvestigationMonster.DEFAULT_INSTANCE;
        }
        
        public static Parser<InvestigationMonster> parser() {
            return InvestigationMonster.PARSER;
        }
        
        @Override
        public Parser<InvestigationMonster> getParserForType() {
            return InvestigationMonster.PARSER;
        }
        
        @Override
        public InvestigationMonster getDefaultInstanceForType() {
            return InvestigationMonster.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new InvestigationMonster();
            PARSER = new AbstractParser<InvestigationMonster>() {
                @Override
                public InvestigationMonster parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new InvestigationMonster(input, extensionRegistry);
                }
            };
        }
        
        public enum LockState implements ProtocolMessageEnum
        {
            LOCK_STATE_NONE(0), 
            LOCK_STATE_QUEST(1), 
            UNRECOGNIZED(-1);
            
            public static final int LOCK_STATE_NONE_VALUE = 0;
            public static final int LOCK_STATE_QUEST_VALUE = 1;
            private static final Internal.EnumLiteMap<LockState> internalValueMap;
            private static final LockState[] VALUES;
            private final int value;
            
            @Override
            public final int getNumber() {
                if (this == LockState.UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }
            
            @Deprecated
            public static LockState valueOf(final int value) {
                return forNumber(value);
            }
            
            public static LockState forNumber(final int value) {
                switch (value) {
                    case 0: {
                        return LockState.LOCK_STATE_NONE;
                    }
                    case 1: {
                        return LockState.LOCK_STATE_QUEST;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            public static Internal.EnumLiteMap<LockState> internalGetValueMap() {
                return LockState.internalValueMap;
            }
            
            @Override
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                if (this == LockState.UNRECOGNIZED) {
                    throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
                }
                return getDescriptor().getValues().get(this.ordinal());
            }
            
            @Override
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }
            
            public static final Descriptors.EnumDescriptor getDescriptor() {
                return InvestigationMonster.getDescriptor().getEnumTypes().get(0);
            }
            
            public static LockState valueOf(final Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return LockState.UNRECOGNIZED;
                }
                return LockState.VALUES[desc.getIndex()];
            }
            
            private LockState(final int value) {
                this.value = value;
            }
            
            private static /* synthetic */ LockState[] value() {
                return new LockState[] { LockState.LOCK_STATE_NONE, LockState.LOCK_STATE_QUEST, LockState.UNRECOGNIZED };
            }
            
            static {
                VALUES = values();
                internalValueMap = new Internal.EnumLiteMap<LockState>() {
                    @Override
                    public LockState findValueByNumber(final int number) {
                        return LockState.forNumber(number);
                    }
                };

        }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InvestigationMonsterOrBuilder
        {
            private boolean isAlive_;
            private int refreshInterval_;
            private int id_;
            private int level_;
            private int bossChestNum_;
            private WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo weeklyBossResinDiscountInfo_;
            private SingleFieldBuilderV3<WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo.Builder, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfoOrBuilder> weeklyBossResinDiscountInfoBuilder_;
            private int monsterId_;
            private VectorOuterClass.Vector pos_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> posBuilder_;
            private int resin_;
            private int maxBossChestNum_;
            private int nextRefreshTime_;
            private int groupId_;
            private int sceneId_;
            private boolean isAreaLocked_;
            private int lockState_;
            private int nextBossChestRefreshTime_;
            private int cityId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return InvestigationMonsterOuterClass.internal_static_InvestigationMonster_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return InvestigationMonsterOuterClass.internal_static_InvestigationMonster_fieldAccessorTable.ensureFieldAccessorsInitialized(InvestigationMonster.class, Builder.class);
            }
            
            private Builder() {
                this.lockState_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.lockState_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (InvestigationMonster.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.isAlive_ = false;
                this.refreshInterval_ = 0;
                this.id_ = 0;
                this.level_ = 0;
                this.bossChestNum_ = 0;
                if (this.weeklyBossResinDiscountInfoBuilder_ == null) {
                    this.weeklyBossResinDiscountInfo_ = null;
                }
                else {
                    this.weeklyBossResinDiscountInfo_ = null;
                    this.weeklyBossResinDiscountInfoBuilder_ = null;
                }
                this.monsterId_ = 0;
                if (this.posBuilder_ == null) {
                    this.pos_ = null;
                }
                else {
                    this.pos_ = null;
                    this.posBuilder_ = null;
                }
                this.resin_ = 0;
                this.maxBossChestNum_ = 0;
                this.nextRefreshTime_ = 0;
                this.groupId_ = 0;
                this.sceneId_ = 0;
                this.isAreaLocked_ = false;
                this.lockState_ = 0;
                this.nextBossChestRefreshTime_ = 0;
                this.cityId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return InvestigationMonsterOuterClass.internal_static_InvestigationMonster_descriptor;
            }
            
            @Override
            public InvestigationMonster getDefaultInstanceForType() {
                return InvestigationMonster.getDefaultInstance();
            }
            
            @Override
            public InvestigationMonster build() {
                final InvestigationMonster result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public InvestigationMonster buildPartial() {
                final InvestigationMonster result = new InvestigationMonster(this);
                result.isAlive_ = this.isAlive_;
                result.refreshInterval_ = this.refreshInterval_;
                result.id_ = this.id_;
                result.level_ = this.level_;
                result.bossChestNum_ = this.bossChestNum_;
                if (this.weeklyBossResinDiscountInfoBuilder_ == null) {
                    result.weeklyBossResinDiscountInfo_ = this.weeklyBossResinDiscountInfo_;
                }
                else {
                    result.weeklyBossResinDiscountInfo_ = this.weeklyBossResinDiscountInfoBuilder_.build();
                }
                result.monsterId_ = this.monsterId_;
                if (this.posBuilder_ == null) {
                    result.pos_ = this.pos_;
                }
                else {
                    result.pos_ = this.posBuilder_.build();
                }
                result.resin_ = this.resin_;
                result.maxBossChestNum_ = this.maxBossChestNum_;
                result.nextRefreshTime_ = this.nextRefreshTime_;
                result.groupId_ = this.groupId_;
                result.sceneId_ = this.sceneId_;
                result.isAreaLocked_ = this.isAreaLocked_;
                result.lockState_ = this.lockState_;
                result.nextBossChestRefreshTime_ = this.nextBossChestRefreshTime_;
                result.cityId_ = this.cityId_;
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
                if (other instanceof InvestigationMonster) {
                    return this.mergeFrom((InvestigationMonster)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final InvestigationMonster other) {
                if (other == InvestigationMonster.getDefaultInstance()) {
                    return this;
                }
                if (other.getIsAlive()) {
                    this.setIsAlive(other.getIsAlive());
                }
                if (other.getRefreshInterval() != 0) {
                    this.setRefreshInterval(other.getRefreshInterval());
                }
                if (other.getId() != 0) {
                    this.setId(other.getId());
                }
                if (other.getLevel() != 0) {
                    this.setLevel(other.getLevel());
                }
                if (other.getBossChestNum() != 0) {
                    this.setBossChestNum(other.getBossChestNum());
                }
                if (other.hasWeeklyBossResinDiscountInfo()) {
                    this.mergeWeeklyBossResinDiscountInfo(other.getWeeklyBossResinDiscountInfo());
                }
                if (other.getMonsterId() != 0) {
                    this.setMonsterId(other.getMonsterId());
                }
                if (other.hasPos()) {
                    this.mergePos(other.getPos());
                }
                if (other.getResin() != 0) {
                    this.setResin(other.getResin());
                }
                if (other.getMaxBossChestNum() != 0) {
                    this.setMaxBossChestNum(other.getMaxBossChestNum());
                }
                if (other.getNextRefreshTime() != 0) {
                    this.setNextRefreshTime(other.getNextRefreshTime());
                }
                if (other.getGroupId() != 0) {
                    this.setGroupId(other.getGroupId());
                }
                if (other.getSceneId() != 0) {
                    this.setSceneId(other.getSceneId());
                }
                if (other.getIsAreaLocked()) {
                    this.setIsAreaLocked(other.getIsAreaLocked());
                }
                if (other.lockState_ != 0) {
                    this.setLockStateValue(other.getLockStateValue());
                }
                if (other.getNextBossChestRefreshTime() != 0) {
                    this.setNextBossChestRefreshTime(other.getNextBossChestRefreshTime());
                }
                if (other.getCityId() != 0) {
                    this.setCityId(other.getCityId());
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
                InvestigationMonster parsedMessage = null;
                try {
                    parsedMessage = InvestigationMonster.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (InvestigationMonster)e.getUnfinishedMessage();
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
            public boolean getIsAlive() {
                return this.isAlive_;
            }
            
            public Builder setIsAlive(final boolean value) {
                this.isAlive_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsAlive() {
                this.isAlive_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getRefreshInterval() {
                return this.refreshInterval_;
            }
            
            public Builder setRefreshInterval(final int value) {
                this.refreshInterval_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRefreshInterval() {
                this.refreshInterval_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getId() {
                return this.id_;
            }
            
            public Builder setId(final int value) {
                this.id_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearId() {
                this.id_ = 0;
                this.onChanged();
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
            public int getBossChestNum() {
                return this.bossChestNum_;
            }
            
            public Builder setBossChestNum(final int value) {
                this.bossChestNum_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBossChestNum() {
                this.bossChestNum_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasWeeklyBossResinDiscountInfo() {
                return this.weeklyBossResinDiscountInfoBuilder_ != null || this.weeklyBossResinDiscountInfo_ != null;
            }
            
            @Override
            public WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo getWeeklyBossResinDiscountInfo() {
                if (this.weeklyBossResinDiscountInfoBuilder_ == null) {
                    return (this.weeklyBossResinDiscountInfo_ == null) ? WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo.getDefaultInstance() : this.weeklyBossResinDiscountInfo_;
                }
                return this.weeklyBossResinDiscountInfoBuilder_.getMessage();
            }
            
            public Builder setWeeklyBossResinDiscountInfo(final WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo value) {
                if (this.weeklyBossResinDiscountInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.weeklyBossResinDiscountInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.weeklyBossResinDiscountInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setWeeklyBossResinDiscountInfo(final WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo.Builder builderForValue) {
                if (this.weeklyBossResinDiscountInfoBuilder_ == null) {
                    this.weeklyBossResinDiscountInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.weeklyBossResinDiscountInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeWeeklyBossResinDiscountInfo(final WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo value) {
                if (this.weeklyBossResinDiscountInfoBuilder_ == null) {
                    if (this.weeklyBossResinDiscountInfo_ != null) {
                        this.weeklyBossResinDiscountInfo_ = WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo.newBuilder(this.weeklyBossResinDiscountInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.weeklyBossResinDiscountInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.weeklyBossResinDiscountInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearWeeklyBossResinDiscountInfo() {
                if (this.weeklyBossResinDiscountInfoBuilder_ == null) {
                    this.weeklyBossResinDiscountInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.weeklyBossResinDiscountInfo_ = null;
                    this.weeklyBossResinDiscountInfoBuilder_ = null;
                }
                return this;
            }
            
            public WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo.Builder getWeeklyBossResinDiscountInfoBuilder() {
                this.onChanged();
                return this.getWeeklyBossResinDiscountInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfoOrBuilder getWeeklyBossResinDiscountInfoOrBuilder() {
                if (this.weeklyBossResinDiscountInfoBuilder_ != null) {
                    return this.weeklyBossResinDiscountInfoBuilder_.getMessageOrBuilder();
                }
                return (this.weeklyBossResinDiscountInfo_ == null) ? WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo.getDefaultInstance() : this.weeklyBossResinDiscountInfo_;
            }
            
            private SingleFieldBuilderV3<WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo.Builder, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfoOrBuilder> getWeeklyBossResinDiscountInfoFieldBuilder() {
                if (this.weeklyBossResinDiscountInfoBuilder_ == null) {
                    this.weeklyBossResinDiscountInfoBuilder_ = new SingleFieldBuilderV3<WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo.Builder, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfoOrBuilder>(this.getWeeklyBossResinDiscountInfo(), this.getParentForChildren(), this.isClean());
                    this.weeklyBossResinDiscountInfo_ = null;
                }
                return this.weeklyBossResinDiscountInfoBuilder_;
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
            public boolean hasPos() {
                return this.posBuilder_ != null || this.pos_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getPos() {
                if (this.posBuilder_ == null) {
                    return (this.pos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.pos_;
                }
                return this.posBuilder_.getMessage();
            }
            
            public Builder setPos(final VectorOuterClass.Vector value) {
                if (this.posBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.pos_ = value;
                    this.onChanged();
                }
                else {
                    this.posBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setPos(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.posBuilder_ == null) {
                    this.pos_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.posBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergePos(final VectorOuterClass.Vector value) {
                if (this.posBuilder_ == null) {
                    if (this.pos_ != null) {
                        this.pos_ = VectorOuterClass.Vector.newBuilder(this.pos_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.pos_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.posBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearPos() {
                if (this.posBuilder_ == null) {
                    this.pos_ = null;
                    this.onChanged();
                }
                else {
                    this.pos_ = null;
                    this.posBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getPosBuilder() {
                this.onChanged();
                return this.getPosFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
                if (this.posBuilder_ != null) {
                    return this.posBuilder_.getMessageOrBuilder();
                }
                return (this.pos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.pos_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getPosFieldBuilder() {
                if (this.posBuilder_ == null) {
                    this.posBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getPos(), this.getParentForChildren(), this.isClean());
                    this.pos_ = null;
                }
                return this.posBuilder_;
            }
            
            @Override
            public int getResin() {
                return this.resin_;
            }
            
            public Builder setResin(final int value) {
                this.resin_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearResin() {
                this.resin_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMaxBossChestNum() {
                return this.maxBossChestNum_;
            }
            
            public Builder setMaxBossChestNum(final int value) {
                this.maxBossChestNum_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMaxBossChestNum() {
                this.maxBossChestNum_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getNextRefreshTime() {
                return this.nextRefreshTime_;
            }
            
            public Builder setNextRefreshTime(final int value) {
                this.nextRefreshTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearNextRefreshTime() {
                this.nextRefreshTime_ = 0;
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
            public boolean getIsAreaLocked() {
                return this.isAreaLocked_;
            }
            
            public Builder setIsAreaLocked(final boolean value) {
                this.isAreaLocked_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsAreaLocked() {
                this.isAreaLocked_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getLockStateValue() {
                return this.lockState_;
            }
            
            public Builder setLockStateValue(final int value) {
                this.lockState_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public LockState getLockState() {
                final LockState result = LockState.valueOf(this.lockState_);
                return (result == null) ? LockState.UNRECOGNIZED : result;
            }
            
            public Builder setLockState(final LockState value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.lockState_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearLockState() {
                this.lockState_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getNextBossChestRefreshTime() {
                return this.nextBossChestRefreshTime_;
            }
            
            public Builder setNextBossChestRefreshTime(final int value) {
                this.nextBossChestRefreshTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearNextBossChestRefreshTime() {
                this.nextBossChestRefreshTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCityId() {
                return this.cityId_;
            }
            
            public Builder setCityId(final int value) {
                this.cityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCityId() {
                this.cityId_ = 0;
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
    
    public interface InvestigationMonsterOrBuilder extends MessageOrBuilder
    {
        boolean getIsAlive();
        
        int getRefreshInterval();
        
        int getId();
        
        int getLevel();
        
        int getBossChestNum();
        
        boolean hasWeeklyBossResinDiscountInfo();
        
        WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo getWeeklyBossResinDiscountInfo();
        
        WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfoOrBuilder getWeeklyBossResinDiscountInfoOrBuilder();
        
        int getMonsterId();
        
        boolean hasPos();
        
        VectorOuterClass.Vector getPos();
        
        VectorOuterClass.VectorOrBuilder getPosOrBuilder();
        
        int getResin();
        
        int getMaxBossChestNum();
        
        int getNextRefreshTime();
        
        int getGroupId();
        
        int getSceneId();
        
        boolean getIsAreaLocked();
        
        int getLockStateValue();
        
        InvestigationMonster.LockState getLockState();
        
        int getNextBossChestRefreshTime();
        
        int getCityId();
    }
}
