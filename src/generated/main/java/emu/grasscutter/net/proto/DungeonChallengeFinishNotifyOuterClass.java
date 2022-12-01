// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.WireFormat;
import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.MapEntry;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.MapField;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class DungeonChallengeFinishNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_DungeonChallengeFinishNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_DungeonChallengeFinishNotify_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_DungeonChallengeFinishNotify_StrengthenPointDataMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_DungeonChallengeFinishNotify_StrengthenPointDataMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private DungeonChallengeFinishNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return DungeonChallengeFinishNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\"DungeonChallengeFinishNotify.proto\u001a(ChannelerSlabLoopDungeonResultInfo.proto\u001a\u001dCustomDungeonResultInfo.proto\u001a&EffigyChallengeDungeonResultInfo.proto\u001a\u001dPotionDungeonResultInfo.proto\u001a\u0019StrengthenPointData.proto\u001a\u0019Unk2700_FHOKHHBGPEG.proto\"\u00cb\u0005\n\u001cDungeonChallengeFinishNotify\u0012\\\n\u0019strengthen_point_data_map\u0018\r \u0003(\u000b29.DungeonChallengeFinishNotify.StrengthenPointDataMapEntry\u00121\n\u0013Unk2700_ONCDLPDHFAB\u0018\t \u0001(\u000e2\u0014.Unk2700_FHOKHHBGPEG\u0012\u0015\n\ris_new_record\u0018\n \u0001(\b\u0012\u001d\n\u0015challenge_record_type\u0018\u0007 \u0001(\r\u0012\u0011\n\ttime_cost\u0018\u0004 \u0001(\r\u0012\u0015\n\rcurrent_value\u0018\u000f \u0001(\r\u0012\u0012\n\nis_success\u0018\u0003 \u0001(\b\u0012\u0017\n\u000fchallenge_index\u0018\u0005 \u0001(\r\u0012X\n(channeller_slab_loop_dungeon_result_info\u0018\u00f1\u000b \u0001(\u000b2#.ChannelerSlabLoopDungeonResultInfoH\u0000\u0012R\n$effigy_challenge_dungeon_result_info\u0018\u00db\f \u0001(\u000b2!.EffigyChallengeDungeonResultInfoH\u0000\u0012?\n\u001apotion_dungeon_result_info\u0018 \u000e \u0001(\u000b2\u0018.PotionDungeonResultInfoH\u0000\u0012?\n\u001acustom_dungeon_result_info\u0018\u0080\r \u0001(\u000b2\u0018.CustomDungeonResultInfoH\u0000\u001aS\n\u001bStrengthenPointDataMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012#\n\u0005value\u0018\u0002 \u0001(\u000b2\u0014.StrengthenPointData:\u00028\u0001B\b\n\u0006detailB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        DungeonChallengeFinishNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ChannelerSlabLoopDungeonResultInfoOuterClass.getDescriptor(), CustomDungeonResultInfoOuterClass.getDescriptor(), EffigyChallengeDungeonResultInfoOuterClass.getDescriptor(), PotionDungeonResultInfoOuterClass.getDescriptor(), StrengthenPointDataOuterClass.getDescriptor(), Unk2700FHOKHHBGPEG.getDescriptor() });
        internal_static_DungeonChallengeFinishNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_DungeonChallengeFinishNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(DungeonChallengeFinishNotifyOuterClass.internal_static_DungeonChallengeFinishNotify_descriptor, new String[] { "StrengthenPointDataMap", "Unk2700ONCDLPDHFAB", "IsNewRecord", "ChallengeRecordType", "TimeCost", "CurrentValue", "IsSuccess", "ChallengeIndex", "ChannellerSlabLoopDungeonResultInfo", "EffigyChallengeDungeonResultInfo", "PotionDungeonResultInfo", "CustomDungeonResultInfo", "Detail" });
        internal_static_DungeonChallengeFinishNotify_StrengthenPointDataMapEntry_descriptor = DungeonChallengeFinishNotifyOuterClass.internal_static_DungeonChallengeFinishNotify_descriptor.getNestedTypes().get(0);
        internal_static_DungeonChallengeFinishNotify_StrengthenPointDataMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(DungeonChallengeFinishNotifyOuterClass.internal_static_DungeonChallengeFinishNotify_StrengthenPointDataMapEntry_descriptor, new String[] { "Key", "Value" });
        ChannelerSlabLoopDungeonResultInfoOuterClass.getDescriptor();
        CustomDungeonResultInfoOuterClass.getDescriptor();
        EffigyChallengeDungeonResultInfoOuterClass.getDescriptor();
        PotionDungeonResultInfoOuterClass.getDescriptor();
        StrengthenPointDataOuterClass.getDescriptor();
        Unk2700FHOKHHBGPEG.getDescriptor();
    }
    
    public static final class DungeonChallengeFinishNotify extends GeneratedMessageV3 implements DungeonChallengeFinishNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private int detailCase_;
        private Object detail_;
        public static final int STRENGTHEN_POINT_DATA_MAP_FIELD_NUMBER = 13;
        private MapField<Integer, StrengthenPointDataOuterClass.StrengthenPointData> strengthenPointDataMap_;
        public static final int UNK2700_ONCDLPDHFAB_FIELD_NUMBER = 9;
        private int unk2700ONCDLPDHFAB_;
        public static final int IS_NEW_RECORD_FIELD_NUMBER = 10;
        private boolean isNewRecord_;
        public static final int CHALLENGE_RECORD_TYPE_FIELD_NUMBER = 7;
        private int challengeRecordType_;
        public static final int TIME_COST_FIELD_NUMBER = 4;
        private int timeCost_;
        public static final int CURRENT_VALUE_FIELD_NUMBER = 15;
        private int currentValue_;
        public static final int IS_SUCCESS_FIELD_NUMBER = 3;
        private boolean isSuccess_;
        public static final int CHALLENGE_INDEX_FIELD_NUMBER = 5;
        private int challengeIndex_;
        public static final int CHANNELLER_SLAB_LOOP_DUNGEON_RESULT_INFO_FIELD_NUMBER = 1521;
        public static final int EFFIGY_CHALLENGE_DUNGEON_RESULT_INFO_FIELD_NUMBER = 1627;
        public static final int POTION_DUNGEON_RESULT_INFO_FIELD_NUMBER = 1824;
        public static final int CUSTOM_DUNGEON_RESULT_INFO_FIELD_NUMBER = 1664;
        private byte memoizedIsInitialized;
        private static final DungeonChallengeFinishNotify DEFAULT_INSTANCE;
        private static final Parser<DungeonChallengeFinishNotify> PARSER;
        
        private DungeonChallengeFinishNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.detailCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        private DungeonChallengeFinishNotify() {
            this.detailCase_ = 0;
            this.memoizedIsInitialized = -1;
            this.unk2700ONCDLPDHFAB_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new DungeonChallengeFinishNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private DungeonChallengeFinishNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 24: {
                            this.isSuccess_ = input.readBool();
                            continue;
                        }
                        case 32: {
                            this.timeCost_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.challengeIndex_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            this.challengeRecordType_ = input.readUInt32();
                            continue;
                        }
                        case 72: {
                            final int rawValue = input.readEnum();
                            this.unk2700ONCDLPDHFAB_ = rawValue;
                            continue;
                        }
                        case 80: {
                            this.isNewRecord_ = input.readBool();
                            continue;
                        }
                        case 106: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.strengthenPointDataMap_ = MapField.newMapField(StrengthenPointDataMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x1;
                            }
                            final MapEntry<Integer, StrengthenPointDataOuterClass.StrengthenPointData> strengthenPointDataMap__ = input.readMessage(StrengthenPointDataMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.strengthenPointDataMap_.getMutableMap().put(strengthenPointDataMap__.getKey(), strengthenPointDataMap__.getValue());
                            continue;
                        }
                        case 120: {
                            this.currentValue_ = input.readUInt32();
                            continue;
                        }
                        case 12170: {
                            ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.Builder subBuilder = null;
                            if (this.detailCase_ == 1521) {
                                subBuilder = ((ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo)this.detail_).toBuilder();
                            }
                            this.detail_ = input.readMessage(ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo)this.detail_);
                                this.detail_ = subBuilder.buildPartial();
                            }
                            this.detailCase_ = 1521;
                            continue;
                        }
                        case 13018: {
                            EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.Builder subBuilder2 = null;
                            if (this.detailCase_ == 1627) {
                                subBuilder2 = ((EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo)this.detail_).toBuilder();
                            }
                            this.detail_ = input.readMessage(EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom((EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo)this.detail_);
                                this.detail_ = subBuilder2.buildPartial();
                            }
                            this.detailCase_ = 1627;
                            continue;
                        }
                        case 13314: {
                            CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo.Builder subBuilder3 = null;
                            if (this.detailCase_ == 1664) {
                                subBuilder3 = ((CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo)this.detail_).toBuilder();
                            }
                            this.detail_ = input.readMessage(CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo.parser(), extensionRegistry);
                            if (subBuilder3 != null) {
                                subBuilder3.mergeFrom((CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo)this.detail_);
                                this.detail_ = subBuilder3.buildPartial();
                            }
                            this.detailCase_ = 1664;
                            continue;
                        }
                        case 14594: {
                            PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo.Builder subBuilder4 = null;
                            if (this.detailCase_ == 1824) {
                                subBuilder4 = ((PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo)this.detail_).toBuilder();
                            }
                            this.detail_ = input.readMessage(PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo.parser(), extensionRegistry);
                            if (subBuilder4 != null) {
                                subBuilder4.mergeFrom((PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo)this.detail_);
                                this.detail_ = subBuilder4.buildPartial();
                            }
                            this.detailCase_ = 1824;
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
            return DungeonChallengeFinishNotifyOuterClass.internal_static_DungeonChallengeFinishNotify_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 13: {
                    return this.internalGetStrengthenPointDataMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return DungeonChallengeFinishNotifyOuterClass.internal_static_DungeonChallengeFinishNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(DungeonChallengeFinishNotify.class, Builder.class);
        }
        
        @Override
        public DetailCase getDetailCase() {
            return DetailCase.forNumber(this.detailCase_);
        }
        
        private MapField<Integer, StrengthenPointDataOuterClass.StrengthenPointData> internalGetStrengthenPointDataMap() {
            if (this.strengthenPointDataMap_ == null) {
                return MapField.emptyMapField(StrengthenPointDataMapDefaultEntryHolder.defaultEntry);
            }
            return this.strengthenPointDataMap_;
        }
        
        @Override
        public int getStrengthenPointDataMapCount() {
            return this.internalGetStrengthenPointDataMap().getMap().size();
        }
        
        @Override
        public boolean containsStrengthenPointDataMap(final int key) {
            return this.internalGetStrengthenPointDataMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, StrengthenPointDataOuterClass.StrengthenPointData> getStrengthenPointDataMap() {
            return this.getStrengthenPointDataMapMap();
        }
        
        @Override
        public Map<Integer, StrengthenPointDataOuterClass.StrengthenPointData> getStrengthenPointDataMapMap() {
            return this.internalGetStrengthenPointDataMap().getMap();
        }
        
        @Override
        public StrengthenPointDataOuterClass.StrengthenPointData getStrengthenPointDataMapOrDefault(final int key, final StrengthenPointDataOuterClass.StrengthenPointData defaultValue) {
            final Map<Integer, StrengthenPointDataOuterClass.StrengthenPointData> map = this.internalGetStrengthenPointDataMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public StrengthenPointDataOuterClass.StrengthenPointData getStrengthenPointDataMapOrThrow(final int key) {
            final Map<Integer, StrengthenPointDataOuterClass.StrengthenPointData> map = this.internalGetStrengthenPointDataMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public int getUnk2700ONCDLPDHFABValue() {
            return this.unk2700ONCDLPDHFAB_;
        }
        
        @Override
        public Unk2700FHOKHHBGPEG.Unk2700_FHOKHHBGPEG getUnk2700ONCDLPDHFAB() {
            final Unk2700FHOKHHBGPEG.Unk2700_FHOKHHBGPEG result = Unk2700FHOKHHBGPEG.Unk2700_FHOKHHBGPEG.valueOf(this.unk2700ONCDLPDHFAB_);
            return (result == null) ? Unk2700FHOKHHBGPEG.Unk2700_FHOKHHBGPEG.UNRECOGNIZED : result;
        }
        
        @Override
        public boolean getIsNewRecord() {
            return this.isNewRecord_;
        }
        
        @Override
        public int getChallengeRecordType() {
            return this.challengeRecordType_;
        }
        
        @Override
        public int getTimeCost() {
            return this.timeCost_;
        }
        
        @Override
        public int getCurrentValue() {
            return this.currentValue_;
        }
        
        @Override
        public boolean getIsSuccess() {
            return this.isSuccess_;
        }
        
        @Override
        public int getChallengeIndex() {
            return this.challengeIndex_;
        }
        
        @Override
        public boolean hasChannellerSlabLoopDungeonResultInfo() {
            return this.detailCase_ == 1521;
        }
        
        @Override
        public ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo getChannellerSlabLoopDungeonResultInfo() {
            if (this.detailCase_ == 1521) {
                return (ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo)this.detail_;
            }
            return ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.getDefaultInstance();
        }
        
        @Override
        public ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfoOrBuilder getChannellerSlabLoopDungeonResultInfoOrBuilder() {
            if (this.detailCase_ == 1521) {
                return (ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo)this.detail_;
            }
            return ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasEffigyChallengeDungeonResultInfo() {
            return this.detailCase_ == 1627;
        }
        
        @Override
        public EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo getEffigyChallengeDungeonResultInfo() {
            if (this.detailCase_ == 1627) {
                return (EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo)this.detail_;
            }
            return EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.getDefaultInstance();
        }
        
        @Override
        public EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfoOrBuilder getEffigyChallengeDungeonResultInfoOrBuilder() {
            if (this.detailCase_ == 1627) {
                return (EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo)this.detail_;
            }
            return EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasPotionDungeonResultInfo() {
            return this.detailCase_ == 1824;
        }
        
        @Override
        public PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo getPotionDungeonResultInfo() {
            if (this.detailCase_ == 1824) {
                return (PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo)this.detail_;
            }
            return PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo.getDefaultInstance();
        }
        
        @Override
        public PotionDungeonResultInfoOuterClass.PotionDungeonResultInfoOrBuilder getPotionDungeonResultInfoOrBuilder() {
            if (this.detailCase_ == 1824) {
                return (PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo)this.detail_;
            }
            return PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasCustomDungeonResultInfo() {
            return this.detailCase_ == 1664;
        }
        
        @Override
        public CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo getCustomDungeonResultInfo() {
            if (this.detailCase_ == 1664) {
                return (CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo)this.detail_;
            }
            return CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo.getDefaultInstance();
        }
        
        @Override
        public CustomDungeonResultInfoOuterClass.CustomDungeonResultInfoOrBuilder getCustomDungeonResultInfoOrBuilder() {
            if (this.detailCase_ == 1664) {
                return (CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo)this.detail_;
            }
            return CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo.getDefaultInstance();
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
            if (this.isSuccess_) {
                output.writeBool(3, this.isSuccess_);
            }
            if (this.timeCost_ != 0) {
                output.writeUInt32(4, this.timeCost_);
            }
            if (this.challengeIndex_ != 0) {
                output.writeUInt32(5, this.challengeIndex_);
            }
            if (this.challengeRecordType_ != 0) {
                output.writeUInt32(7, this.challengeRecordType_);
            }
            if (this.unk2700ONCDLPDHFAB_ != Unk2700FHOKHHBGPEG.Unk2700_FHOKHHBGPEG.Unk2700_FHOKHHBGPEG_NONE.getNumber()) {
                output.writeEnum(9, this.unk2700ONCDLPDHFAB_);
            }
            if (this.isNewRecord_) {
                output.writeBool(10, this.isNewRecord_);
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetStrengthenPointDataMap(), StrengthenPointDataMapDefaultEntryHolder.defaultEntry, 13);
            if (this.currentValue_ != 0) {
                output.writeUInt32(15, this.currentValue_);
            }
            if (this.detailCase_ == 1521) {
                output.writeMessage(1521, (MessageLite)this.detail_);
            }
            if (this.detailCase_ == 1627) {
                output.writeMessage(1627, (MessageLite)this.detail_);
            }
            if (this.detailCase_ == 1664) {
                output.writeMessage(1664, (MessageLite)this.detail_);
            }
            if (this.detailCase_ == 1824) {
                output.writeMessage(1824, (MessageLite)this.detail_);
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
            if (this.isSuccess_) {
                size += CodedOutputStream.computeBoolSize(3, this.isSuccess_);
            }
            if (this.timeCost_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.timeCost_);
            }
            if (this.challengeIndex_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.challengeIndex_);
            }
            if (this.challengeRecordType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.challengeRecordType_);
            }
            if (this.unk2700ONCDLPDHFAB_ != Unk2700FHOKHHBGPEG.Unk2700_FHOKHHBGPEG.Unk2700_FHOKHHBGPEG_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(9, this.unk2700ONCDLPDHFAB_);
            }
            if (this.isNewRecord_) {
                size += CodedOutputStream.computeBoolSize(10, this.isNewRecord_);
            }
            for (final Map.Entry<Integer, StrengthenPointDataOuterClass.StrengthenPointData> entry : this.internalGetStrengthenPointDataMap().getMap().entrySet()) {
                final MapEntry<Integer, StrengthenPointDataOuterClass.StrengthenPointData> strengthenPointDataMap__ = StrengthenPointDataMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(13, strengthenPointDataMap__);
            }
            if (this.currentValue_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.currentValue_);
            }
            if (this.detailCase_ == 1521) {
                size += CodedOutputStream.computeMessageSize(1521, (MessageLite)this.detail_);
            }
            if (this.detailCase_ == 1627) {
                size += CodedOutputStream.computeMessageSize(1627, (MessageLite)this.detail_);
            }
            if (this.detailCase_ == 1664) {
                size += CodedOutputStream.computeMessageSize(1664, (MessageLite)this.detail_);
            }
            if (this.detailCase_ == 1824) {
                size += CodedOutputStream.computeMessageSize(1824, (MessageLite)this.detail_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DungeonChallengeFinishNotify)) {
                return super.equals(obj);
            }
            final DungeonChallengeFinishNotify other = (DungeonChallengeFinishNotify)obj;
            if (!this.internalGetStrengthenPointDataMap().equals(other.internalGetStrengthenPointDataMap())) {
                return false;
            }
            if (this.unk2700ONCDLPDHFAB_ != other.unk2700ONCDLPDHFAB_) {
                return false;
            }
            if (this.getIsNewRecord() != other.getIsNewRecord()) {
                return false;
            }
            if (this.getChallengeRecordType() != other.getChallengeRecordType()) {
                return false;
            }
            if (this.getTimeCost() != other.getTimeCost()) {
                return false;
            }
            if (this.getCurrentValue() != other.getCurrentValue()) {
                return false;
            }
            if (this.getIsSuccess() != other.getIsSuccess()) {
                return false;
            }
            if (this.getChallengeIndex() != other.getChallengeIndex()) {
                return false;
            }
            if (!this.getDetailCase().equals(other.getDetailCase())) {
                return false;
            }
            switch (this.detailCase_) {
                case 1521: {
                    if (!this.getChannellerSlabLoopDungeonResultInfo().equals(other.getChannellerSlabLoopDungeonResultInfo())) {
                        return false;
                    }
                    break;
                }
                case 1627: {
                    if (!this.getEffigyChallengeDungeonResultInfo().equals(other.getEffigyChallengeDungeonResultInfo())) {
                        return false;
                    }
                    break;
                }
                case 1824: {
                    if (!this.getPotionDungeonResultInfo().equals(other.getPotionDungeonResultInfo())) {
                        return false;
                    }
                    break;
                }
                case 1664: {
                    if (!this.getCustomDungeonResultInfo().equals(other.getCustomDungeonResultInfo())) {
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
            if (!this.internalGetStrengthenPointDataMap().getMap().isEmpty()) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.internalGetStrengthenPointDataMap().hashCode();
            }
            hash = 37 * hash + 9;
            hash = 53 * hash + this.unk2700ONCDLPDHFAB_;
            hash = 37 * hash + 10;
            hash = 53 * hash + Internal.hashBoolean(this.getIsNewRecord());
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getChallengeRecordType();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getTimeCost();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getCurrentValue();
            hash = 37 * hash + 3;
            hash = 53 * hash + Internal.hashBoolean(this.getIsSuccess());
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getChallengeIndex();
            switch (this.detailCase_) {
                case 1521: {
                    hash = 37 * hash + 1521;
                    hash = 53 * hash + this.getChannellerSlabLoopDungeonResultInfo().hashCode();
                    break;
                }
                case 1627: {
                    hash = 37 * hash + 1627;
                    hash = 53 * hash + this.getEffigyChallengeDungeonResultInfo().hashCode();
                    break;
                }
                case 1824: {
                    hash = 37 * hash + 1824;
                    hash = 53 * hash + this.getPotionDungeonResultInfo().hashCode();
                    break;
                }
                case 1664: {
                    hash = 37 * hash + 1664;
                    hash = 53 * hash + this.getCustomDungeonResultInfo().hashCode();
                    break;
                }
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static DungeonChallengeFinishNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return DungeonChallengeFinishNotify.PARSER.parseFrom(data);
        }
        
        public static DungeonChallengeFinishNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DungeonChallengeFinishNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DungeonChallengeFinishNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return DungeonChallengeFinishNotify.PARSER.parseFrom(data);
        }
        
        public static DungeonChallengeFinishNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DungeonChallengeFinishNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DungeonChallengeFinishNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return DungeonChallengeFinishNotify.PARSER.parseFrom(data);
        }
        
        public static DungeonChallengeFinishNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DungeonChallengeFinishNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DungeonChallengeFinishNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DungeonChallengeFinishNotify.PARSER, input);
        }
        
        public static DungeonChallengeFinishNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DungeonChallengeFinishNotify.PARSER, input, extensionRegistry);
        }
        
        public static DungeonChallengeFinishNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(DungeonChallengeFinishNotify.PARSER, input);
        }
        
        public static DungeonChallengeFinishNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(DungeonChallengeFinishNotify.PARSER, input, extensionRegistry);
        }
        
        public static DungeonChallengeFinishNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DungeonChallengeFinishNotify.PARSER, input);
        }
        
        public static DungeonChallengeFinishNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DungeonChallengeFinishNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return DungeonChallengeFinishNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final DungeonChallengeFinishNotify prototype) {
            return DungeonChallengeFinishNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == DungeonChallengeFinishNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static DungeonChallengeFinishNotify getDefaultInstance() {
            return DungeonChallengeFinishNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<DungeonChallengeFinishNotify> parser() {
            return DungeonChallengeFinishNotify.PARSER;
        }
        
        @Override
        public Parser<DungeonChallengeFinishNotify> getParserForType() {
            return DungeonChallengeFinishNotify.PARSER;
        }
        
        @Override
        public DungeonChallengeFinishNotify getDefaultInstanceForType() {
            return DungeonChallengeFinishNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new DungeonChallengeFinishNotify();
            PARSER = new AbstractParser<DungeonChallengeFinishNotify>() {
                @Override
                public DungeonChallengeFinishNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new DungeonChallengeFinishNotify(input, extensionRegistry);
                }
            };
        }
        
        public enum DetailCase implements Internal.EnumLite, InternalOneOfEnum
        {
            CHANNELLER_SLAB_LOOP_DUNGEON_RESULT_INFO(1521), 
            EFFIGY_CHALLENGE_DUNGEON_RESULT_INFO(1627), 
            POTION_DUNGEON_RESULT_INFO(1824), 
            CUSTOM_DUNGEON_RESULT_INFO(1664), 
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
                    case 1521: {
                        return DetailCase.CHANNELLER_SLAB_LOOP_DUNGEON_RESULT_INFO;
                    }
                    case 1627: {
                        return DetailCase.EFFIGY_CHALLENGE_DUNGEON_RESULT_INFO;
                    }
                    case 1824: {
                        return DetailCase.POTION_DUNGEON_RESULT_INFO;
                    }
                    case 1664: {
                        return DetailCase.CUSTOM_DUNGEON_RESULT_INFO;
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
                return new DetailCase[] { DetailCase.CHANNELLER_SLAB_LOOP_DUNGEON_RESULT_INFO, DetailCase.EFFIGY_CHALLENGE_DUNGEON_RESULT_INFO, DetailCase.POTION_DUNGEON_RESULT_INFO, DetailCase.CUSTOM_DUNGEON_RESULT_INFO, DetailCase.DETAIL_NOT_SET };
            }
            
            
        }
        
        private static final class StrengthenPointDataMapDefaultEntryHolder
        {
            static final MapEntry<Integer, StrengthenPointDataOuterClass.StrengthenPointData> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(DungeonChallengeFinishNotifyOuterClass.internal_static_DungeonChallengeFinishNotify_StrengthenPointDataMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.MESSAGE, StrengthenPointDataOuterClass.StrengthenPointData.getDefaultInstance());
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DungeonChallengeFinishNotifyOrBuilder
        {
            private int detailCase_;
            private Object detail_;
            private int bitField0_;
            private MapField<Integer, StrengthenPointDataOuterClass.StrengthenPointData> strengthenPointDataMap_;
            private int unk2700ONCDLPDHFAB_;
            private boolean isNewRecord_;
            private int challengeRecordType_;
            private int timeCost_;
            private int currentValue_;
            private boolean isSuccess_;
            private int challengeIndex_;
            private SingleFieldBuilderV3<ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo, ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.Builder, ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfoOrBuilder> channellerSlabLoopDungeonResultInfoBuilder_;
            private SingleFieldBuilderV3<EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo, EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.Builder, EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfoOrBuilder> effigyChallengeDungeonResultInfoBuilder_;
            private SingleFieldBuilderV3<PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo, PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo.Builder, PotionDungeonResultInfoOuterClass.PotionDungeonResultInfoOrBuilder> potionDungeonResultInfoBuilder_;
            private SingleFieldBuilderV3<CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo, CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo.Builder, CustomDungeonResultInfoOuterClass.CustomDungeonResultInfoOrBuilder> customDungeonResultInfoBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return DungeonChallengeFinishNotifyOuterClass.internal_static_DungeonChallengeFinishNotify_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 13: {
                        return this.internalGetStrengthenPointDataMap();
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
                        return this.internalGetMutableStrengthenPointDataMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return DungeonChallengeFinishNotifyOuterClass.internal_static_DungeonChallengeFinishNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(DungeonChallengeFinishNotify.class, Builder.class);
            }
            
            private Builder() {
                this.detailCase_ = 0;
                this.unk2700ONCDLPDHFAB_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.detailCase_ = 0;
                this.unk2700ONCDLPDHFAB_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (DungeonChallengeFinishNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.internalGetMutableStrengthenPointDataMap().clear();
                this.unk2700ONCDLPDHFAB_ = 0;
                this.isNewRecord_ = false;
                this.challengeRecordType_ = 0;
                this.timeCost_ = 0;
                this.currentValue_ = 0;
                this.isSuccess_ = false;
                this.challengeIndex_ = 0;
                this.detailCase_ = 0;
                this.detail_ = null;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return DungeonChallengeFinishNotifyOuterClass.internal_static_DungeonChallengeFinishNotify_descriptor;
            }
            
            @Override
            public DungeonChallengeFinishNotify getDefaultInstanceForType() {
                return DungeonChallengeFinishNotify.getDefaultInstance();
            }
            
            @Override
            public DungeonChallengeFinishNotify build() {
                final DungeonChallengeFinishNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public DungeonChallengeFinishNotify buildPartial() {
                final DungeonChallengeFinishNotify result = new DungeonChallengeFinishNotify(this);
                final int from_bitField0_ = this.bitField0_;
                (result.strengthenPointDataMap_ = this.internalGetStrengthenPointDataMap()).makeImmutable();
                result.unk2700ONCDLPDHFAB_ = this.unk2700ONCDLPDHFAB_;
                result.isNewRecord_ = this.isNewRecord_;
                result.challengeRecordType_ = this.challengeRecordType_;
                result.timeCost_ = this.timeCost_;
                result.currentValue_ = this.currentValue_;
                result.isSuccess_ = this.isSuccess_;
                result.challengeIndex_ = this.challengeIndex_;
                if (this.detailCase_ == 1521) {
                    if (this.channellerSlabLoopDungeonResultInfoBuilder_ == null) {
                        result.detail_ = this.detail_;
                    }
                    else {
                        result.detail_ = this.channellerSlabLoopDungeonResultInfoBuilder_.build();
                    }
                }
                if (this.detailCase_ == 1627) {
                    if (this.effigyChallengeDungeonResultInfoBuilder_ == null) {
                        result.detail_ = this.detail_;
                    }
                    else {
                        result.detail_ = this.effigyChallengeDungeonResultInfoBuilder_.build();
                    }
                }
                if (this.detailCase_ == 1824) {
                    if (this.potionDungeonResultInfoBuilder_ == null) {
                        result.detail_ = this.detail_;
                    }
                    else {
                        result.detail_ = this.potionDungeonResultInfoBuilder_.build();
                    }
                }
                if (this.detailCase_ == 1664) {
                    if (this.customDungeonResultInfoBuilder_ == null) {
                        result.detail_ = this.detail_;
                    }
                    else {
                        result.detail_ = this.customDungeonResultInfoBuilder_.build();
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
                if (other instanceof DungeonChallengeFinishNotify) {
                    return this.mergeFrom((DungeonChallengeFinishNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final DungeonChallengeFinishNotify other) {
                if (other == DungeonChallengeFinishNotify.getDefaultInstance()) {
                    return this;
                }
                this.internalGetMutableStrengthenPointDataMap().mergeFrom(other.internalGetStrengthenPointDataMap());
                if (other.unk2700ONCDLPDHFAB_ != 0) {
                    this.setUnk2700ONCDLPDHFABValue(other.getUnk2700ONCDLPDHFABValue());
                }
                if (other.getIsNewRecord()) {
                    this.setIsNewRecord(other.getIsNewRecord());
                }
                if (other.getChallengeRecordType() != 0) {
                    this.setChallengeRecordType(other.getChallengeRecordType());
                }
                if (other.getTimeCost() != 0) {
                    this.setTimeCost(other.getTimeCost());
                }
                if (other.getCurrentValue() != 0) {
                    this.setCurrentValue(other.getCurrentValue());
                }
                if (other.getIsSuccess()) {
                    this.setIsSuccess(other.getIsSuccess());
                }
                if (other.getChallengeIndex() != 0) {
                    this.setChallengeIndex(other.getChallengeIndex());
                }
                switch (other.getDetailCase()) {
                    case CHANNELLER_SLAB_LOOP_DUNGEON_RESULT_INFO: {
                        this.mergeChannellerSlabLoopDungeonResultInfo(other.getChannellerSlabLoopDungeonResultInfo());
                        break;
                    }
                    case EFFIGY_CHALLENGE_DUNGEON_RESULT_INFO: {
                        this.mergeEffigyChallengeDungeonResultInfo(other.getEffigyChallengeDungeonResultInfo());
                        break;
                    }
                    case POTION_DUNGEON_RESULT_INFO: {
                        this.mergePotionDungeonResultInfo(other.getPotionDungeonResultInfo());
                        break;
                    }
                    case CUSTOM_DUNGEON_RESULT_INFO: {
                        this.mergeCustomDungeonResultInfo(other.getCustomDungeonResultInfo());
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
                DungeonChallengeFinishNotify parsedMessage = null;
                try {
                    parsedMessage = DungeonChallengeFinishNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (DungeonChallengeFinishNotify)e.getUnfinishedMessage();
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
            
            private MapField<Integer, StrengthenPointDataOuterClass.StrengthenPointData> internalGetStrengthenPointDataMap() {
                if (this.strengthenPointDataMap_ == null) {
                    return MapField.emptyMapField(StrengthenPointDataMapDefaultEntryHolder.defaultEntry);
                }
                return this.strengthenPointDataMap_;
            }
            
            private MapField<Integer, StrengthenPointDataOuterClass.StrengthenPointData> internalGetMutableStrengthenPointDataMap() {
                this.onChanged();
                if (this.strengthenPointDataMap_ == null) {
                    this.strengthenPointDataMap_ = MapField.newMapField(StrengthenPointDataMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.strengthenPointDataMap_.isMutable()) {
                    this.strengthenPointDataMap_ = this.strengthenPointDataMap_.copy();
                }
                return this.strengthenPointDataMap_;
            }
            
            @Override
            public int getStrengthenPointDataMapCount() {
                return this.internalGetStrengthenPointDataMap().getMap().size();
            }
            
            @Override
            public boolean containsStrengthenPointDataMap(final int key) {
                return this.internalGetStrengthenPointDataMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, StrengthenPointDataOuterClass.StrengthenPointData> getStrengthenPointDataMap() {
                return this.getStrengthenPointDataMapMap();
            }
            
            @Override
            public Map<Integer, StrengthenPointDataOuterClass.StrengthenPointData> getStrengthenPointDataMapMap() {
                return this.internalGetStrengthenPointDataMap().getMap();
            }
            
            @Override
            public StrengthenPointDataOuterClass.StrengthenPointData getStrengthenPointDataMapOrDefault(final int key, final StrengthenPointDataOuterClass.StrengthenPointData defaultValue) {
                final Map<Integer, StrengthenPointDataOuterClass.StrengthenPointData> map = this.internalGetStrengthenPointDataMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public StrengthenPointDataOuterClass.StrengthenPointData getStrengthenPointDataMapOrThrow(final int key) {
                final Map<Integer, StrengthenPointDataOuterClass.StrengthenPointData> map = this.internalGetStrengthenPointDataMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearStrengthenPointDataMap() {
                this.internalGetMutableStrengthenPointDataMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeStrengthenPointDataMap(final int key) {
                this.internalGetMutableStrengthenPointDataMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, StrengthenPointDataOuterClass.StrengthenPointData> getMutableStrengthenPointDataMap() {
                return this.internalGetMutableStrengthenPointDataMap().getMutableMap();
            }
            
            public Builder putStrengthenPointDataMap(final int key, final StrengthenPointDataOuterClass.StrengthenPointData value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.internalGetMutableStrengthenPointDataMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllStrengthenPointDataMap(final Map<Integer, StrengthenPointDataOuterClass.StrengthenPointData> values) {
                this.internalGetMutableStrengthenPointDataMap().getMutableMap().putAll(values);
                return this;
            }
            
            @Override
            public int getUnk2700ONCDLPDHFABValue() {
                return this.unk2700ONCDLPDHFAB_;
            }
            
            public Builder setUnk2700ONCDLPDHFABValue(final int value) {
                this.unk2700ONCDLPDHFAB_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public Unk2700FHOKHHBGPEG.Unk2700_FHOKHHBGPEG getUnk2700ONCDLPDHFAB() {
                final Unk2700FHOKHHBGPEG.Unk2700_FHOKHHBGPEG result = Unk2700FHOKHHBGPEG.Unk2700_FHOKHHBGPEG.valueOf(this.unk2700ONCDLPDHFAB_);
                return (result == null) ? Unk2700FHOKHHBGPEG.Unk2700_FHOKHHBGPEG.UNRECOGNIZED : result;
            }
            
            public Builder setUnk2700ONCDLPDHFAB(final Unk2700FHOKHHBGPEG.Unk2700_FHOKHHBGPEG value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.unk2700ONCDLPDHFAB_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700ONCDLPDHFAB() {
                this.unk2700ONCDLPDHFAB_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsNewRecord() {
                return this.isNewRecord_;
            }
            
            public Builder setIsNewRecord(final boolean value) {
                this.isNewRecord_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsNewRecord() {
                this.isNewRecord_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getChallengeRecordType() {
                return this.challengeRecordType_;
            }
            
            public Builder setChallengeRecordType(final int value) {
                this.challengeRecordType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearChallengeRecordType() {
                this.challengeRecordType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getTimeCost() {
                return this.timeCost_;
            }
            
            public Builder setTimeCost(final int value) {
                this.timeCost_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTimeCost() {
                this.timeCost_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCurrentValue() {
                return this.currentValue_;
            }
            
            public Builder setCurrentValue(final int value) {
                this.currentValue_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurrentValue() {
                this.currentValue_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsSuccess() {
                return this.isSuccess_;
            }
            
            public Builder setIsSuccess(final boolean value) {
                this.isSuccess_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsSuccess() {
                this.isSuccess_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getChallengeIndex() {
                return this.challengeIndex_;
            }
            
            public Builder setChallengeIndex(final int value) {
                this.challengeIndex_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearChallengeIndex() {
                this.challengeIndex_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasChannellerSlabLoopDungeonResultInfo() {
                return this.detailCase_ == 1521;
            }
            
            @Override
            public ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo getChannellerSlabLoopDungeonResultInfo() {
                if (this.channellerSlabLoopDungeonResultInfoBuilder_ == null) {
                    if (this.detailCase_ == 1521) {
                        return (ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo)this.detail_;
                    }
                    return ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.getDefaultInstance();
                }
                else {
                    if (this.detailCase_ == 1521) {
                        return this.channellerSlabLoopDungeonResultInfoBuilder_.getMessage();
                    }
                    return ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.getDefaultInstance();
                }
            }
            
            public Builder setChannellerSlabLoopDungeonResultInfo(final ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo value) {
                if (this.channellerSlabLoopDungeonResultInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.detail_ = value;
                    this.onChanged();
                }
                else {
                    this.channellerSlabLoopDungeonResultInfoBuilder_.setMessage(value);
                }
                this.detailCase_ = 1521;
                return this;
            }
            
            public Builder setChannellerSlabLoopDungeonResultInfo(final ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.Builder builderForValue) {
                if (this.channellerSlabLoopDungeonResultInfoBuilder_ == null) {
                    this.detail_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.channellerSlabLoopDungeonResultInfoBuilder_.setMessage(builderForValue.build());
                }
                this.detailCase_ = 1521;
                return this;
            }
            
            public Builder mergeChannellerSlabLoopDungeonResultInfo(final ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo value) {
                if (this.channellerSlabLoopDungeonResultInfoBuilder_ == null) {
                    if (this.detailCase_ == 1521 && this.detail_ != ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.getDefaultInstance()) {
                        this.detail_ = ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.newBuilder((ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo)this.detail_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.detail_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.detailCase_ == 1521) {
                        this.channellerSlabLoopDungeonResultInfoBuilder_.mergeFrom(value);
                    }
                    this.channellerSlabLoopDungeonResultInfoBuilder_.setMessage(value);
                }
                this.detailCase_ = 1521;
                return this;
            }
            
            public Builder clearChannellerSlabLoopDungeonResultInfo() {
                if (this.channellerSlabLoopDungeonResultInfoBuilder_ == null) {
                    if (this.detailCase_ == 1521) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.detailCase_ == 1521) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                    }
                    this.channellerSlabLoopDungeonResultInfoBuilder_.clear();
                }
                return this;
            }
            
            public ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.Builder getChannellerSlabLoopDungeonResultInfoBuilder() {
                return this.getChannellerSlabLoopDungeonResultInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfoOrBuilder getChannellerSlabLoopDungeonResultInfoOrBuilder() {
                if (this.detailCase_ == 1521 && this.channellerSlabLoopDungeonResultInfoBuilder_ != null) {
                    return this.channellerSlabLoopDungeonResultInfoBuilder_.getMessageOrBuilder();
                }
                if (this.detailCase_ == 1521) {
                    return (ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo)this.detail_;
                }
                return ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo, ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.Builder, ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfoOrBuilder> getChannellerSlabLoopDungeonResultInfoFieldBuilder() {
                if (this.channellerSlabLoopDungeonResultInfoBuilder_ == null) {
                    if (this.detailCase_ != 1521) {
                        this.detail_ = ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.getDefaultInstance();
                    }
                    this.channellerSlabLoopDungeonResultInfoBuilder_ = new SingleFieldBuilderV3<ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo, ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.Builder, ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfoOrBuilder>((ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo)this.detail_, this.getParentForChildren(), this.isClean());
                    this.detail_ = null;
                }
                this.detailCase_ = 1521;
                this.onChanged();
                return this.channellerSlabLoopDungeonResultInfoBuilder_;
            }
            
            @Override
            public boolean hasEffigyChallengeDungeonResultInfo() {
                return this.detailCase_ == 1627;
            }
            
            @Override
            public EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo getEffigyChallengeDungeonResultInfo() {
                if (this.effigyChallengeDungeonResultInfoBuilder_ == null) {
                    if (this.detailCase_ == 1627) {
                        return (EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo)this.detail_;
                    }
                    return EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.getDefaultInstance();
                }
                else {
                    if (this.detailCase_ == 1627) {
                        return this.effigyChallengeDungeonResultInfoBuilder_.getMessage();
                    }
                    return EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.getDefaultInstance();
                }
            }
            
            public Builder setEffigyChallengeDungeonResultInfo(final EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo value) {
                if (this.effigyChallengeDungeonResultInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.detail_ = value;
                    this.onChanged();
                }
                else {
                    this.effigyChallengeDungeonResultInfoBuilder_.setMessage(value);
                }
                this.detailCase_ = 1627;
                return this;
            }
            
            public Builder setEffigyChallengeDungeonResultInfo(final EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.Builder builderForValue) {
                if (this.effigyChallengeDungeonResultInfoBuilder_ == null) {
                    this.detail_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.effigyChallengeDungeonResultInfoBuilder_.setMessage(builderForValue.build());
                }
                this.detailCase_ = 1627;
                return this;
            }
            
            public Builder mergeEffigyChallengeDungeonResultInfo(final EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo value) {
                if (this.effigyChallengeDungeonResultInfoBuilder_ == null) {
                    if (this.detailCase_ == 1627 && this.detail_ != EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.getDefaultInstance()) {
                        this.detail_ = EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.newBuilder((EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo)this.detail_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.detail_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.detailCase_ == 1627) {
                        this.effigyChallengeDungeonResultInfoBuilder_.mergeFrom(value);
                    }
                    this.effigyChallengeDungeonResultInfoBuilder_.setMessage(value);
                }
                this.detailCase_ = 1627;
                return this;
            }
            
            public Builder clearEffigyChallengeDungeonResultInfo() {
                if (this.effigyChallengeDungeonResultInfoBuilder_ == null) {
                    if (this.detailCase_ == 1627) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.detailCase_ == 1627) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                    }
                    this.effigyChallengeDungeonResultInfoBuilder_.clear();
                }
                return this;
            }
            
            public EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.Builder getEffigyChallengeDungeonResultInfoBuilder() {
                return this.getEffigyChallengeDungeonResultInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfoOrBuilder getEffigyChallengeDungeonResultInfoOrBuilder() {
                if (this.detailCase_ == 1627 && this.effigyChallengeDungeonResultInfoBuilder_ != null) {
                    return this.effigyChallengeDungeonResultInfoBuilder_.getMessageOrBuilder();
                }
                if (this.detailCase_ == 1627) {
                    return (EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo)this.detail_;
                }
                return EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo, EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.Builder, EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfoOrBuilder> getEffigyChallengeDungeonResultInfoFieldBuilder() {
                if (this.effigyChallengeDungeonResultInfoBuilder_ == null) {
                    if (this.detailCase_ != 1627) {
                        this.detail_ = EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.getDefaultInstance();
                    }
                    this.effigyChallengeDungeonResultInfoBuilder_ = new SingleFieldBuilderV3<EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo, EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.Builder, EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfoOrBuilder>((EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo)this.detail_, this.getParentForChildren(), this.isClean());
                    this.detail_ = null;
                }
                this.detailCase_ = 1627;
                this.onChanged();
                return this.effigyChallengeDungeonResultInfoBuilder_;
            }
            
            @Override
            public boolean hasPotionDungeonResultInfo() {
                return this.detailCase_ == 1824;
            }
            
            @Override
            public PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo getPotionDungeonResultInfo() {
                if (this.potionDungeonResultInfoBuilder_ == null) {
                    if (this.detailCase_ == 1824) {
                        return (PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo)this.detail_;
                    }
                    return PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo.getDefaultInstance();
                }
                else {
                    if (this.detailCase_ == 1824) {
                        return this.potionDungeonResultInfoBuilder_.getMessage();
                    }
                    return PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo.getDefaultInstance();
                }
            }
            
            public Builder setPotionDungeonResultInfo(final PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo value) {
                if (this.potionDungeonResultInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.detail_ = value;
                    this.onChanged();
                }
                else {
                    this.potionDungeonResultInfoBuilder_.setMessage(value);
                }
                this.detailCase_ = 1824;
                return this;
            }
            
            public Builder setPotionDungeonResultInfo(final PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo.Builder builderForValue) {
                if (this.potionDungeonResultInfoBuilder_ == null) {
                    this.detail_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.potionDungeonResultInfoBuilder_.setMessage(builderForValue.build());
                }
                this.detailCase_ = 1824;
                return this;
            }
            
            public Builder mergePotionDungeonResultInfo(final PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo value) {
                if (this.potionDungeonResultInfoBuilder_ == null) {
                    if (this.detailCase_ == 1824 && this.detail_ != PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo.getDefaultInstance()) {
                        this.detail_ = PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo.newBuilder((PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo)this.detail_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.detail_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.detailCase_ == 1824) {
                        this.potionDungeonResultInfoBuilder_.mergeFrom(value);
                    }
                    this.potionDungeonResultInfoBuilder_.setMessage(value);
                }
                this.detailCase_ = 1824;
                return this;
            }
            
            public Builder clearPotionDungeonResultInfo() {
                if (this.potionDungeonResultInfoBuilder_ == null) {
                    if (this.detailCase_ == 1824) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.detailCase_ == 1824) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                    }
                    this.potionDungeonResultInfoBuilder_.clear();
                }
                return this;
            }
            
            public PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo.Builder getPotionDungeonResultInfoBuilder() {
                return this.getPotionDungeonResultInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public PotionDungeonResultInfoOuterClass.PotionDungeonResultInfoOrBuilder getPotionDungeonResultInfoOrBuilder() {
                if (this.detailCase_ == 1824 && this.potionDungeonResultInfoBuilder_ != null) {
                    return this.potionDungeonResultInfoBuilder_.getMessageOrBuilder();
                }
                if (this.detailCase_ == 1824) {
                    return (PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo)this.detail_;
                }
                return PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo, PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo.Builder, PotionDungeonResultInfoOuterClass.PotionDungeonResultInfoOrBuilder> getPotionDungeonResultInfoFieldBuilder() {
                if (this.potionDungeonResultInfoBuilder_ == null) {
                    if (this.detailCase_ != 1824) {
                        this.detail_ = PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo.getDefaultInstance();
                    }
                    this.potionDungeonResultInfoBuilder_ = new SingleFieldBuilderV3<PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo, PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo.Builder, PotionDungeonResultInfoOuterClass.PotionDungeonResultInfoOrBuilder>((PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo)this.detail_, this.getParentForChildren(), this.isClean());
                    this.detail_ = null;
                }
                this.detailCase_ = 1824;
                this.onChanged();
                return this.potionDungeonResultInfoBuilder_;
            }
            
            @Override
            public boolean hasCustomDungeonResultInfo() {
                return this.detailCase_ == 1664;
            }
            
            @Override
            public CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo getCustomDungeonResultInfo() {
                if (this.customDungeonResultInfoBuilder_ == null) {
                    if (this.detailCase_ == 1664) {
                        return (CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo)this.detail_;
                    }
                    return CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo.getDefaultInstance();
                }
                else {
                    if (this.detailCase_ == 1664) {
                        return this.customDungeonResultInfoBuilder_.getMessage();
                    }
                    return CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo.getDefaultInstance();
                }
            }
            
            public Builder setCustomDungeonResultInfo(final CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo value) {
                if (this.customDungeonResultInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.detail_ = value;
                    this.onChanged();
                }
                else {
                    this.customDungeonResultInfoBuilder_.setMessage(value);
                }
                this.detailCase_ = 1664;
                return this;
            }
            
            public Builder setCustomDungeonResultInfo(final CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo.Builder builderForValue) {
                if (this.customDungeonResultInfoBuilder_ == null) {
                    this.detail_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.customDungeonResultInfoBuilder_.setMessage(builderForValue.build());
                }
                this.detailCase_ = 1664;
                return this;
            }
            
            public Builder mergeCustomDungeonResultInfo(final CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo value) {
                if (this.customDungeonResultInfoBuilder_ == null) {
                    if (this.detailCase_ == 1664 && this.detail_ != CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo.getDefaultInstance()) {
                        this.detail_ = CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo.newBuilder((CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo)this.detail_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.detail_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.detailCase_ == 1664) {
                        this.customDungeonResultInfoBuilder_.mergeFrom(value);
                    }
                    this.customDungeonResultInfoBuilder_.setMessage(value);
                }
                this.detailCase_ = 1664;
                return this;
            }
            
            public Builder clearCustomDungeonResultInfo() {
                if (this.customDungeonResultInfoBuilder_ == null) {
                    if (this.detailCase_ == 1664) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.detailCase_ == 1664) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                    }
                    this.customDungeonResultInfoBuilder_.clear();
                }
                return this;
            }
            
            public CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo.Builder getCustomDungeonResultInfoBuilder() {
                return this.getCustomDungeonResultInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public CustomDungeonResultInfoOuterClass.CustomDungeonResultInfoOrBuilder getCustomDungeonResultInfoOrBuilder() {
                if (this.detailCase_ == 1664 && this.customDungeonResultInfoBuilder_ != null) {
                    return this.customDungeonResultInfoBuilder_.getMessageOrBuilder();
                }
                if (this.detailCase_ == 1664) {
                    return (CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo)this.detail_;
                }
                return CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo, CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo.Builder, CustomDungeonResultInfoOuterClass.CustomDungeonResultInfoOrBuilder> getCustomDungeonResultInfoFieldBuilder() {
                if (this.customDungeonResultInfoBuilder_ == null) {
                    if (this.detailCase_ != 1664) {
                        this.detail_ = CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo.getDefaultInstance();
                    }
                    this.customDungeonResultInfoBuilder_ = new SingleFieldBuilderV3<CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo, CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo.Builder, CustomDungeonResultInfoOuterClass.CustomDungeonResultInfoOrBuilder>((CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo)this.detail_, this.getParentForChildren(), this.isClean());
                    this.detail_ = null;
                }
                this.detailCase_ = 1664;
                this.onChanged();
                return this.customDungeonResultInfoBuilder_;
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
    
    public interface DungeonChallengeFinishNotifyOrBuilder extends MessageOrBuilder
    {
        int getStrengthenPointDataMapCount();
        
        boolean containsStrengthenPointDataMap(final int p0);
        
        @Deprecated
        Map<Integer, StrengthenPointDataOuterClass.StrengthenPointData> getStrengthenPointDataMap();
        
        Map<Integer, StrengthenPointDataOuterClass.StrengthenPointData> getStrengthenPointDataMapMap();
        
        StrengthenPointDataOuterClass.StrengthenPointData getStrengthenPointDataMapOrDefault(final int p0, final StrengthenPointDataOuterClass.StrengthenPointData p1);
        
        StrengthenPointDataOuterClass.StrengthenPointData getStrengthenPointDataMapOrThrow(final int p0);
        
        int getUnk2700ONCDLPDHFABValue();
        
        Unk2700FHOKHHBGPEG.Unk2700_FHOKHHBGPEG getUnk2700ONCDLPDHFAB();
        
        boolean getIsNewRecord();
        
        int getChallengeRecordType();
        
        int getTimeCost();
        
        int getCurrentValue();
        
        boolean getIsSuccess();
        
        int getChallengeIndex();
        
        boolean hasChannellerSlabLoopDungeonResultInfo();
        
        ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo getChannellerSlabLoopDungeonResultInfo();
        
        ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfoOrBuilder getChannellerSlabLoopDungeonResultInfoOrBuilder();
        
        boolean hasEffigyChallengeDungeonResultInfo();
        
        EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo getEffigyChallengeDungeonResultInfo();
        
        EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfoOrBuilder getEffigyChallengeDungeonResultInfoOrBuilder();
        
        boolean hasPotionDungeonResultInfo();
        
        PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo getPotionDungeonResultInfo();
        
        PotionDungeonResultInfoOuterClass.PotionDungeonResultInfoOrBuilder getPotionDungeonResultInfoOrBuilder();
        
        boolean hasCustomDungeonResultInfo();
        
        CustomDungeonResultInfoOuterClass.CustomDungeonResultInfo getCustomDungeonResultInfo();
        
        CustomDungeonResultInfoOuterClass.CustomDungeonResultInfoOrBuilder getCustomDungeonResultInfoOrBuilder();
        
        DungeonChallengeFinishNotify.DetailCase getDetailCase();
    }
}
