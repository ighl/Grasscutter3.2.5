// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
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
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class DungeonEntryInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_DungeonEntryInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_DungeonEntryInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private DungeonEntryInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return DungeonEntryInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016DungeonEntryInfo.proto\u001a!WeeklyBossResinDiscountInfo.proto\"\u0089\u0002\n\u0010DungeonEntryInfo\u0012\u0010\n\bend_time\u0018\u0006 \u0001(\r\u0012\u0012\n\ndungeon_id\u0018\u0005 \u0001(\r\u0012\u0016\n\u000eboss_chest_num\u0018\f \u0001(\r\u0012\u001a\n\u0012max_boss_chest_num\u0018\r \u0001(\r\u0012\u0019\n\u0011next_refresh_time\u0018\u000b \u0001(\r\u0012E\n\u001fweekly_boss_resin_discount_info\u0018\t \u0001(\u000b2\u001c.WeeklyBossResinDiscountInfo\u0012\u0012\n\nstart_time\u0018\u000f \u0001(\r\u0012\u0011\n\tis_passed\u0018\u0004 \u0001(\b\u0012\u0012\n\nleft_times\u0018\u0007 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        DungeonEntryInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { WeeklyBossResinDiscountInfoOuterClass.getDescriptor() });
        internal_static_DungeonEntryInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_DungeonEntryInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(DungeonEntryInfoOuterClass.internal_static_DungeonEntryInfo_descriptor, new String[] { "EndTime", "DungeonId", "BossChestNum", "MaxBossChestNum", "NextRefreshTime", "WeeklyBossResinDiscountInfo", "StartTime", "IsPassed", "LeftTimes" });
        WeeklyBossResinDiscountInfoOuterClass.getDescriptor();
    }
    
    public static final class DungeonEntryInfo extends GeneratedMessageV3 implements DungeonEntryInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int END_TIME_FIELD_NUMBER = 6;
        private int endTime_;
        public static final int DUNGEON_ID_FIELD_NUMBER = 5;
        private int dungeonId_;
        public static final int BOSS_CHEST_NUM_FIELD_NUMBER = 12;
        private int bossChestNum_;
        public static final int MAX_BOSS_CHEST_NUM_FIELD_NUMBER = 13;
        private int maxBossChestNum_;
        public static final int NEXT_REFRESH_TIME_FIELD_NUMBER = 11;
        private int nextRefreshTime_;
        public static final int WEEKLY_BOSS_RESIN_DISCOUNT_INFO_FIELD_NUMBER = 9;
        private WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo weeklyBossResinDiscountInfo_;
        public static final int START_TIME_FIELD_NUMBER = 15;
        private int startTime_;
        public static final int IS_PASSED_FIELD_NUMBER = 4;
        private boolean isPassed_;
        public static final int LEFT_TIMES_FIELD_NUMBER = 7;
        private int leftTimes_;
        private byte memoizedIsInitialized;
        private static final DungeonEntryInfo DEFAULT_INSTANCE;
        private static final Parser<DungeonEntryInfo> PARSER;
        
        private DungeonEntryInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private DungeonEntryInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new DungeonEntryInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private DungeonEntryInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 32: {
                            this.isPassed_ = input.readBool();
                            continue;
                        }
                        case 40: {
                            this.dungeonId_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.endTime_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            this.leftTimes_ = input.readUInt32();
                            continue;
                        }
                        case 74: {
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
                        case 88: {
                            this.nextRefreshTime_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
                            this.bossChestNum_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.maxBossChestNum_ = input.readUInt32();
                            continue;
                        }
                        case 120: {
                            this.startTime_ = input.readUInt32();
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
            return DungeonEntryInfoOuterClass.internal_static_DungeonEntryInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return DungeonEntryInfoOuterClass.internal_static_DungeonEntryInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(DungeonEntryInfo.class, Builder.class);
        }
        
        @Override
        public int getEndTime() {
            return this.endTime_;
        }
        
        @Override
        public int getDungeonId() {
            return this.dungeonId_;
        }
        
        @Override
        public int getBossChestNum() {
            return this.bossChestNum_;
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
        public int getStartTime() {
            return this.startTime_;
        }
        
        @Override
        public boolean getIsPassed() {
            return this.isPassed_;
        }
        
        @Override
        public int getLeftTimes() {
            return this.leftTimes_;
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
            if (this.isPassed_) {
                output.writeBool(4, this.isPassed_);
            }
            if (this.dungeonId_ != 0) {
                output.writeUInt32(5, this.dungeonId_);
            }
            if (this.endTime_ != 0) {
                output.writeUInt32(6, this.endTime_);
            }
            if (this.leftTimes_ != 0) {
                output.writeUInt32(7, this.leftTimes_);
            }
            if (this.weeklyBossResinDiscountInfo_ != null) {
                output.writeMessage(9, this.getWeeklyBossResinDiscountInfo());
            }
            if (this.nextRefreshTime_ != 0) {
                output.writeUInt32(11, this.nextRefreshTime_);
            }
            if (this.bossChestNum_ != 0) {
                output.writeUInt32(12, this.bossChestNum_);
            }
            if (this.maxBossChestNum_ != 0) {
                output.writeUInt32(13, this.maxBossChestNum_);
            }
            if (this.startTime_ != 0) {
                output.writeUInt32(15, this.startTime_);
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
            if (this.isPassed_) {
                size += CodedOutputStream.computeBoolSize(4, this.isPassed_);
            }
            if (this.dungeonId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.dungeonId_);
            }
            if (this.endTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.endTime_);
            }
            if (this.leftTimes_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.leftTimes_);
            }
            if (this.weeklyBossResinDiscountInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(9, this.getWeeklyBossResinDiscountInfo());
            }
            if (this.nextRefreshTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.nextRefreshTime_);
            }
            if (this.bossChestNum_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.bossChestNum_);
            }
            if (this.maxBossChestNum_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.maxBossChestNum_);
            }
            if (this.startTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.startTime_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DungeonEntryInfo)) {
                return super.equals(obj);
            }
            final DungeonEntryInfo other = (DungeonEntryInfo)obj;
            return this.getEndTime() == other.getEndTime() && this.getDungeonId() == other.getDungeonId() && this.getBossChestNum() == other.getBossChestNum() && this.getMaxBossChestNum() == other.getMaxBossChestNum() && this.getNextRefreshTime() == other.getNextRefreshTime() && this.hasWeeklyBossResinDiscountInfo() == other.hasWeeklyBossResinDiscountInfo() && (!this.hasWeeklyBossResinDiscountInfo() || this.getWeeklyBossResinDiscountInfo().equals(other.getWeeklyBossResinDiscountInfo())) && this.getStartTime() == other.getStartTime() && this.getIsPassed() == other.getIsPassed() && this.getLeftTimes() == other.getLeftTimes() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getEndTime();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getDungeonId();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getBossChestNum();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getMaxBossChestNum();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getNextRefreshTime();
            if (this.hasWeeklyBossResinDiscountInfo()) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getWeeklyBossResinDiscountInfo().hashCode();
            }
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getStartTime();
            hash = 37 * hash + 4;
            hash = 53 * hash + Internal.hashBoolean(this.getIsPassed());
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getLeftTimes();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static DungeonEntryInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return DungeonEntryInfo.PARSER.parseFrom(data);
        }
        
        public static DungeonEntryInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DungeonEntryInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DungeonEntryInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return DungeonEntryInfo.PARSER.parseFrom(data);
        }
        
        public static DungeonEntryInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DungeonEntryInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DungeonEntryInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return DungeonEntryInfo.PARSER.parseFrom(data);
        }
        
        public static DungeonEntryInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DungeonEntryInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DungeonEntryInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DungeonEntryInfo.PARSER, input);
        }
        
        public static DungeonEntryInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DungeonEntryInfo.PARSER, input, extensionRegistry);
        }
        
        public static DungeonEntryInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(DungeonEntryInfo.PARSER, input);
        }
        
        public static DungeonEntryInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(DungeonEntryInfo.PARSER, input, extensionRegistry);
        }
        
        public static DungeonEntryInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DungeonEntryInfo.PARSER, input);
        }
        
        public static DungeonEntryInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DungeonEntryInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return DungeonEntryInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final DungeonEntryInfo prototype) {
            return DungeonEntryInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == DungeonEntryInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static DungeonEntryInfo getDefaultInstance() {
            return DungeonEntryInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<DungeonEntryInfo> parser() {
            return DungeonEntryInfo.PARSER;
        }
        
        @Override
        public Parser<DungeonEntryInfo> getParserForType() {
            return DungeonEntryInfo.PARSER;
        }
        
        @Override
        public DungeonEntryInfo getDefaultInstanceForType() {
            return DungeonEntryInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new DungeonEntryInfo();
            PARSER = new AbstractParser<DungeonEntryInfo>() {
                @Override
                public DungeonEntryInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new DungeonEntryInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DungeonEntryInfoOrBuilder
        {
            private int endTime_;
            private int dungeonId_;
            private int bossChestNum_;
            private int maxBossChestNum_;
            private int nextRefreshTime_;
            private WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo weeklyBossResinDiscountInfo_;
            private SingleFieldBuilderV3<WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo.Builder, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfoOrBuilder> weeklyBossResinDiscountInfoBuilder_;
            private int startTime_;
            private boolean isPassed_;
            private int leftTimes_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return DungeonEntryInfoOuterClass.internal_static_DungeonEntryInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return DungeonEntryInfoOuterClass.internal_static_DungeonEntryInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(DungeonEntryInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (DungeonEntryInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.endTime_ = 0;
                this.dungeonId_ = 0;
                this.bossChestNum_ = 0;
                this.maxBossChestNum_ = 0;
                this.nextRefreshTime_ = 0;
                if (this.weeklyBossResinDiscountInfoBuilder_ == null) {
                    this.weeklyBossResinDiscountInfo_ = null;
                }
                else {
                    this.weeklyBossResinDiscountInfo_ = null;
                    this.weeklyBossResinDiscountInfoBuilder_ = null;
                }
                this.startTime_ = 0;
                this.isPassed_ = false;
                this.leftTimes_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return DungeonEntryInfoOuterClass.internal_static_DungeonEntryInfo_descriptor;
            }
            
            @Override
            public DungeonEntryInfo getDefaultInstanceForType() {
                return DungeonEntryInfo.getDefaultInstance();
            }
            
            @Override
            public DungeonEntryInfo build() {
                final DungeonEntryInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public DungeonEntryInfo buildPartial() {
                final DungeonEntryInfo result = new DungeonEntryInfo(this);
                result.endTime_ = this.endTime_;
                result.dungeonId_ = this.dungeonId_;
                result.bossChestNum_ = this.bossChestNum_;
                result.maxBossChestNum_ = this.maxBossChestNum_;
                result.nextRefreshTime_ = this.nextRefreshTime_;
                if (this.weeklyBossResinDiscountInfoBuilder_ == null) {
                    result.weeklyBossResinDiscountInfo_ = this.weeklyBossResinDiscountInfo_;
                }
                else {
                    result.weeklyBossResinDiscountInfo_ = this.weeklyBossResinDiscountInfoBuilder_.build();
                }
                result.startTime_ = this.startTime_;
                result.isPassed_ = this.isPassed_;
                result.leftTimes_ = this.leftTimes_;
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
                if (other instanceof DungeonEntryInfo) {
                    return this.mergeFrom((DungeonEntryInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final DungeonEntryInfo other) {
                if (other == DungeonEntryInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getEndTime() != 0) {
                    this.setEndTime(other.getEndTime());
                }
                if (other.getDungeonId() != 0) {
                    this.setDungeonId(other.getDungeonId());
                }
                if (other.getBossChestNum() != 0) {
                    this.setBossChestNum(other.getBossChestNum());
                }
                if (other.getMaxBossChestNum() != 0) {
                    this.setMaxBossChestNum(other.getMaxBossChestNum());
                }
                if (other.getNextRefreshTime() != 0) {
                    this.setNextRefreshTime(other.getNextRefreshTime());
                }
                if (other.hasWeeklyBossResinDiscountInfo()) {
                    this.mergeWeeklyBossResinDiscountInfo(other.getWeeklyBossResinDiscountInfo());
                }
                if (other.getStartTime() != 0) {
                    this.setStartTime(other.getStartTime());
                }
                if (other.getIsPassed()) {
                    this.setIsPassed(other.getIsPassed());
                }
                if (other.getLeftTimes() != 0) {
                    this.setLeftTimes(other.getLeftTimes());
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
                DungeonEntryInfo parsedMessage = null;
                try {
                    parsedMessage = DungeonEntryInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (DungeonEntryInfo)e.getUnfinishedMessage();
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
            public int getDungeonId() {
                return this.dungeonId_;
            }
            
            public Builder setDungeonId(final int value) {
                this.dungeonId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDungeonId() {
                this.dungeonId_ = 0;
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
            public int getStartTime() {
                return this.startTime_;
            }
            
            public Builder setStartTime(final int value) {
                this.startTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearStartTime() {
                this.startTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsPassed() {
                return this.isPassed_;
            }
            
            public Builder setIsPassed(final boolean value) {
                this.isPassed_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsPassed() {
                this.isPassed_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getLeftTimes() {
                return this.leftTimes_;
            }
            
            public Builder setLeftTimes(final int value) {
                this.leftTimes_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLeftTimes() {
                this.leftTimes_ = 0;
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
    
    public interface DungeonEntryInfoOrBuilder extends MessageOrBuilder
    {
        int getEndTime();
        
        int getDungeonId();
        
        int getBossChestNum();
        
        int getMaxBossChestNum();
        
        int getNextRefreshTime();
        
        boolean hasWeeklyBossResinDiscountInfo();
        
        WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo getWeeklyBossResinDiscountInfo();
        
        WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfoOrBuilder getWeeklyBossResinDiscountInfoOrBuilder();
        
        int getStartTime();
        
        boolean getIsPassed();
        
        int getLeftTimes();
    }
}
