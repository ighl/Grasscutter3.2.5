// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
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

public final class BattlePassMissionOuterClass
{
    private static final Descriptors.Descriptor internal_static_BattlePassMission_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BattlePassMission_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private BattlePassMissionOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return BattlePassMissionOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017BattlePassMission.proto\"\u00d1\u0002\n\u0011BattlePassMission\u0012\u0014\n\fcur_progress\u0018\r \u0001(\r\u00128\n\u000emission_status\u0018\u000f \u0001(\u000e2 .BattlePassMission.MissionStatus\u0012\u0012\n\nmission_id\u0018\u000b \u0001(\r\u0012 \n\u0018reward_battle_pass_point\u0018\u0003 \u0001(\r\u0012\u0014\n\fmission_type\u0018\f \u0001(\r\u0012\u0016\n\u000etotal_progress\u0018\u0006 \u0001(\r\"\u0087\u0001\n\rMissionStatus\u0012\u001a\n\u0016MISSION_STATUS_INVALID\u0010\u0000\u0012\u001d\n\u0019MISSION_STATUS_UNFINISHED\u0010\u0001\u0012\u001b\n\u0017MISSION_STATUS_FINISHED\u0010\u0002\u0012\u001e\n\u001aMISSION_STATUS_POINT_TAKEN\u0010\u0003B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        BattlePassMissionOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_BattlePassMission_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_BattlePassMission_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(BattlePassMissionOuterClass.internal_static_BattlePassMission_descriptor, new String[] { "CurProgress", "MissionStatus", "MissionId", "RewardBattlePassPoint", "MissionType", "TotalProgress" });
    }
    
    public static final class BattlePassMission extends GeneratedMessageV3 implements BattlePassMissionOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CUR_PROGRESS_FIELD_NUMBER = 13;
        private int curProgress_;
        public static final int MISSION_STATUS_FIELD_NUMBER = 15;
        private int missionStatus_;
        public static final int MISSION_ID_FIELD_NUMBER = 11;
        private int missionId_;
        public static final int REWARD_BATTLE_PASS_POINT_FIELD_NUMBER = 3;
        private int rewardBattlePassPoint_;
        public static final int MISSION_TYPE_FIELD_NUMBER = 12;
        private int missionType_;
        public static final int TOTAL_PROGRESS_FIELD_NUMBER = 6;
        private int totalProgress_;
        private byte memoizedIsInitialized;
        private static final BattlePassMission DEFAULT_INSTANCE;
        private static final Parser<BattlePassMission> PARSER;
        
        private BattlePassMission(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private BattlePassMission() {
            this.memoizedIsInitialized = -1;
            this.missionStatus_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new BattlePassMission();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private BattlePassMission(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 24: {
                            this.rewardBattlePassPoint_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.totalProgress_ = input.readUInt32();
                            continue;
                        }
                        case 88: {
                            this.missionId_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
                            this.missionType_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.curProgress_ = input.readUInt32();
                            continue;
                        }
                        case 120: {
                            final int rawValue = input.readEnum();
                            this.missionStatus_ = rawValue;
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
            return BattlePassMissionOuterClass.internal_static_BattlePassMission_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return BattlePassMissionOuterClass.internal_static_BattlePassMission_fieldAccessorTable.ensureFieldAccessorsInitialized(BattlePassMission.class, Builder.class);
        }
        
        @Override
        public int getCurProgress() {
            return this.curProgress_;
        }
        
        @Override
        public int getMissionStatusValue() {
            return this.missionStatus_;
        }
        
        @Override
        public MissionStatus getMissionStatus() {
            final MissionStatus result = MissionStatus.valueOf(this.missionStatus_);
            return (result == null) ? MissionStatus.UNRECOGNIZED : result;
        }
        
        @Override
        public int getMissionId() {
            return this.missionId_;
        }
        
        @Override
        public int getRewardBattlePassPoint() {
            return this.rewardBattlePassPoint_;
        }
        
        @Override
        public int getMissionType() {
            return this.missionType_;
        }
        
        @Override
        public int getTotalProgress() {
            return this.totalProgress_;
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
            if (this.rewardBattlePassPoint_ != 0) {
                output.writeUInt32(3, this.rewardBattlePassPoint_);
            }
            if (this.totalProgress_ != 0) {
                output.writeUInt32(6, this.totalProgress_);
            }
            if (this.missionId_ != 0) {
                output.writeUInt32(11, this.missionId_);
            }
            if (this.missionType_ != 0) {
                output.writeUInt32(12, this.missionType_);
            }
            if (this.curProgress_ != 0) {
                output.writeUInt32(13, this.curProgress_);
            }
            if (this.missionStatus_ != MissionStatus.MISSION_STATUS_INVALID.getNumber()) {
                output.writeEnum(15, this.missionStatus_);
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
            if (this.rewardBattlePassPoint_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.rewardBattlePassPoint_);
            }
            if (this.totalProgress_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.totalProgress_);
            }
            if (this.missionId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.missionId_);
            }
            if (this.missionType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.missionType_);
            }
            if (this.curProgress_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.curProgress_);
            }
            if (this.missionStatus_ != MissionStatus.MISSION_STATUS_INVALID.getNumber()) {
                size += CodedOutputStream.computeEnumSize(15, this.missionStatus_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattlePassMission)) {
                return super.equals(obj);
            }
            final BattlePassMission other = (BattlePassMission)obj;
            return this.getCurProgress() == other.getCurProgress() && this.missionStatus_ == other.missionStatus_ && this.getMissionId() == other.getMissionId() && this.getRewardBattlePassPoint() == other.getRewardBattlePassPoint() && this.getMissionType() == other.getMissionType() && this.getTotalProgress() == other.getTotalProgress() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getCurProgress();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.missionStatus_;
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getMissionId();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getRewardBattlePassPoint();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getMissionType();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getTotalProgress();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static BattlePassMission parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return BattlePassMission.PARSER.parseFrom(data);
        }
        
        public static BattlePassMission parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassMission.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassMission parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return BattlePassMission.PARSER.parseFrom(data);
        }
        
        public static BattlePassMission parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassMission.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassMission parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return BattlePassMission.PARSER.parseFrom(data);
        }
        
        public static BattlePassMission parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassMission.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassMission parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassMission.PARSER, input);
        }
        
        public static BattlePassMission parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassMission.PARSER, input, extensionRegistry);
        }
        
        public static BattlePassMission parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BattlePassMission.PARSER, input);
        }
        
        public static BattlePassMission parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BattlePassMission.PARSER, input, extensionRegistry);
        }
        
        public static BattlePassMission parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassMission.PARSER, input);
        }
        
        public static BattlePassMission parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassMission.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return BattlePassMission.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final BattlePassMission prototype) {
            return BattlePassMission.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == BattlePassMission.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static BattlePassMission getDefaultInstance() {
            return BattlePassMission.DEFAULT_INSTANCE;
        }
        
        public static Parser<BattlePassMission> parser() {
            return BattlePassMission.PARSER;
        }
        
        @Override
        public Parser<BattlePassMission> getParserForType() {
            return BattlePassMission.PARSER;
        }
        
        @Override
        public BattlePassMission getDefaultInstanceForType() {
            return BattlePassMission.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new BattlePassMission();
            PARSER = new AbstractParser<BattlePassMission>() {
                @Override
                public BattlePassMission parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new BattlePassMission(input, extensionRegistry);
                }
            };
        }
        
        public enum MissionStatus implements ProtocolMessageEnum
        {
            MISSION_STATUS_INVALID(0), 
            MISSION_STATUS_UNFINISHED(1), 
            MISSION_STATUS_FINISHED(2), 
            MISSION_STATUS_POINT_TAKEN(3), 
            UNRECOGNIZED(-1);
            
            public static final int MISSION_STATUS_INVALID_VALUE = 0;
            public static final int MISSION_STATUS_UNFINISHED_VALUE = 1;
            public static final int MISSION_STATUS_FINISHED_VALUE = 2;
            public static final int MISSION_STATUS_POINT_TAKEN_VALUE = 3;
            private static final Internal.EnumLiteMap<MissionStatus> internalValueMap;
            private static final MissionStatus[] VALUES;
            private final int value;
            
            @Override
            public final int getNumber() {
                if (this == MissionStatus.UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }
            
            @Deprecated
            public static MissionStatus valueOf(final int value) {
                return forNumber(value);
            }
            
            public static MissionStatus forNumber(final int value) {
                switch (value) {
                    case 0: {
                        return MissionStatus.MISSION_STATUS_INVALID;
                    }
                    case 1: {
                        return MissionStatus.MISSION_STATUS_UNFINISHED;
                    }
                    case 2: {
                        return MissionStatus.MISSION_STATUS_FINISHED;
                    }
                    case 3: {
                        return MissionStatus.MISSION_STATUS_POINT_TAKEN;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            public static Internal.EnumLiteMap<MissionStatus> internalGetValueMap() {
                return MissionStatus.internalValueMap;
            }
            
            @Override
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                if (this == MissionStatus.UNRECOGNIZED) {
                    throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
                }
                return getDescriptor().getValues().get(this.ordinal());
            }
            
            @Override
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }
            
            public static final Descriptors.EnumDescriptor getDescriptor() {
                return BattlePassMission.getDescriptor().getEnumTypes().get(0);
            }
            
            public static MissionStatus valueOf(final Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return MissionStatus.UNRECOGNIZED;
                }
                return MissionStatus.VALUES[desc.getIndex()];
            }
            
            private MissionStatus(final int value) {
                this.value = value;
            }
            
            private static /* synthetic */ MissionStatus[] value() {
                return new MissionStatus[] { MissionStatus.MISSION_STATUS_INVALID, MissionStatus.MISSION_STATUS_UNFINISHED, MissionStatus.MISSION_STATUS_FINISHED, MissionStatus.MISSION_STATUS_POINT_TAKEN, MissionStatus.UNRECOGNIZED };
            }
            
            static {
                VALUES = values();
                internalValueMap = new Internal.EnumLiteMap<MissionStatus>() {
                    @Override
                    public MissionStatus findValueByNumber(final int number) {
                        return MissionStatus.forNumber(number);
                    }
                };

        }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BattlePassMissionOrBuilder
        {
            private int curProgress_;
            private int missionStatus_;
            private int missionId_;
            private int rewardBattlePassPoint_;
            private int missionType_;
            private int totalProgress_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return BattlePassMissionOuterClass.internal_static_BattlePassMission_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return BattlePassMissionOuterClass.internal_static_BattlePassMission_fieldAccessorTable.ensureFieldAccessorsInitialized(BattlePassMission.class, Builder.class);
            }
            
            private Builder() {
                this.missionStatus_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.missionStatus_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (BattlePassMission.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.curProgress_ = 0;
                this.missionStatus_ = 0;
                this.missionId_ = 0;
                this.rewardBattlePassPoint_ = 0;
                this.missionType_ = 0;
                this.totalProgress_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return BattlePassMissionOuterClass.internal_static_BattlePassMission_descriptor;
            }
            
            @Override
            public BattlePassMission getDefaultInstanceForType() {
                return BattlePassMission.getDefaultInstance();
            }
            
            @Override
            public BattlePassMission build() {
                final BattlePassMission result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public BattlePassMission buildPartial() {
                final BattlePassMission result = new BattlePassMission(this);
                result.curProgress_ = this.curProgress_;
                result.missionStatus_ = this.missionStatus_;
                result.missionId_ = this.missionId_;
                result.rewardBattlePassPoint_ = this.rewardBattlePassPoint_;
                result.missionType_ = this.missionType_;
                result.totalProgress_ = this.totalProgress_;
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
                if (other instanceof BattlePassMission) {
                    return this.mergeFrom((BattlePassMission)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final BattlePassMission other) {
                if (other == BattlePassMission.getDefaultInstance()) {
                    return this;
                }
                if (other.getCurProgress() != 0) {
                    this.setCurProgress(other.getCurProgress());
                }
                if (other.missionStatus_ != 0) {
                    this.setMissionStatusValue(other.getMissionStatusValue());
                }
                if (other.getMissionId() != 0) {
                    this.setMissionId(other.getMissionId());
                }
                if (other.getRewardBattlePassPoint() != 0) {
                    this.setRewardBattlePassPoint(other.getRewardBattlePassPoint());
                }
                if (other.getMissionType() != 0) {
                    this.setMissionType(other.getMissionType());
                }
                if (other.getTotalProgress() != 0) {
                    this.setTotalProgress(other.getTotalProgress());
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
                BattlePassMission parsedMessage = null;
                try {
                    parsedMessage = BattlePassMission.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (BattlePassMission)e.getUnfinishedMessage();
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
            public int getCurProgress() {
                return this.curProgress_;
            }
            
            public Builder setCurProgress(final int value) {
                this.curProgress_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurProgress() {
                this.curProgress_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMissionStatusValue() {
                return this.missionStatus_;
            }
            
            public Builder setMissionStatusValue(final int value) {
                this.missionStatus_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public MissionStatus getMissionStatus() {
                final MissionStatus result = MissionStatus.valueOf(this.missionStatus_);
                return (result == null) ? MissionStatus.UNRECOGNIZED : result;
            }
            
            public Builder setMissionStatus(final MissionStatus value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.missionStatus_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearMissionStatus() {
                this.missionStatus_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMissionId() {
                return this.missionId_;
            }
            
            public Builder setMissionId(final int value) {
                this.missionId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMissionId() {
                this.missionId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getRewardBattlePassPoint() {
                return this.rewardBattlePassPoint_;
            }
            
            public Builder setRewardBattlePassPoint(final int value) {
                this.rewardBattlePassPoint_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRewardBattlePassPoint() {
                this.rewardBattlePassPoint_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMissionType() {
                return this.missionType_;
            }
            
            public Builder setMissionType(final int value) {
                this.missionType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMissionType() {
                this.missionType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getTotalProgress() {
                return this.totalProgress_;
            }
            
            public Builder setTotalProgress(final int value) {
                this.totalProgress_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTotalProgress() {
                this.totalProgress_ = 0;
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
    
    public interface BattlePassMissionOrBuilder extends MessageOrBuilder
    {
        int getCurProgress();
        
        int getMissionStatusValue();
        
        BattlePassMission.MissionStatus getMissionStatus();
        
        int getMissionId();
        
        int getRewardBattlePassPoint();
        
        int getMissionType();
        
        int getTotalProgress();
    }
}
