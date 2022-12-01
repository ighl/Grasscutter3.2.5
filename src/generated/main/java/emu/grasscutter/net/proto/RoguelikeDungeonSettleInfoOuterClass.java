// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
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
import com.google.protobuf.MapEntry;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.MapField;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class RoguelikeDungeonSettleInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_RoguelikeDungeonSettleInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_RoguelikeDungeonSettleInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_RoguelikeDungeonSettleInfo_FinishedChallengeCellNumMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_RoguelikeDungeonSettleInfo_FinishedChallengeCellNumMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private RoguelikeDungeonSettleInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return RoguelikeDungeonSettleInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n RoguelikeDungeonSettleInfo.proto\u001a\u001dRoguelikeSettleCoinInfo.proto\"\u00f1\u0002\n\u001aRoguelikeDungeonSettleInfo\u0012\u0010\n\bstage_id\u0018\u0005 \u0001(\r\u0012\u0016\n\u000eis_final_level\u0018\u000f \u0001(\b\u0012e\n\u001ffinished_challenge_cell_num_map\u0018\u0003 \u0003(\u000b2<.RoguelikeDungeonSettleInfo.FinishedChallengeCellNumMapEntry\u0012\u001d\n\u0015is_coin_c_reach_limit\u0018\r \u0001(\b\u0012\u0011\n\tcur_level\u0018\t \u0001(\r\u0012\u0018\n\u0010total_coin_b_num\u0018\u0006 \u0001(\r\u0012\u0018\n\u0010total_coin_c_num\u0018\n \u0001(\r\u001a\\\n FinishedChallengeCellNumMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012'\n\u0005value\u0018\u0002 \u0001(\u000b2\u0018.RoguelikeSettleCoinInfo:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        RoguelikeDungeonSettleInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { RoguelikeSettleCoinInfoOuterClass.getDescriptor() });
        internal_static_RoguelikeDungeonSettleInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_RoguelikeDungeonSettleInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(RoguelikeDungeonSettleInfoOuterClass.internal_static_RoguelikeDungeonSettleInfo_descriptor, new String[] { "StageId", "IsFinalLevel", "FinishedChallengeCellNumMap", "IsCoinCReachLimit", "CurLevel", "TotalCoinBNum", "TotalCoinCNum" });
        internal_static_RoguelikeDungeonSettleInfo_FinishedChallengeCellNumMapEntry_descriptor = RoguelikeDungeonSettleInfoOuterClass.internal_static_RoguelikeDungeonSettleInfo_descriptor.getNestedTypes().get(0);
        internal_static_RoguelikeDungeonSettleInfo_FinishedChallengeCellNumMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(RoguelikeDungeonSettleInfoOuterClass.internal_static_RoguelikeDungeonSettleInfo_FinishedChallengeCellNumMapEntry_descriptor, new String[] { "Key", "Value" });
        RoguelikeSettleCoinInfoOuterClass.getDescriptor();
    }
    
    public static final class RoguelikeDungeonSettleInfo extends GeneratedMessageV3 implements RoguelikeDungeonSettleInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int STAGE_ID_FIELD_NUMBER = 5;
        private int stageId_;
        public static final int IS_FINAL_LEVEL_FIELD_NUMBER = 15;
        private boolean isFinalLevel_;
        public static final int FINISHED_CHALLENGE_CELL_NUM_MAP_FIELD_NUMBER = 3;
        private MapField<Integer, RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo> finishedChallengeCellNumMap_;
        public static final int IS_COIN_C_REACH_LIMIT_FIELD_NUMBER = 13;
        private boolean isCoinCReachLimit_;
        public static final int CUR_LEVEL_FIELD_NUMBER = 9;
        private int curLevel_;
        public static final int TOTAL_COIN_B_NUM_FIELD_NUMBER = 6;
        private int totalCoinBNum_;
        public static final int TOTAL_COIN_C_NUM_FIELD_NUMBER = 10;
        private int totalCoinCNum_;
        private byte memoizedIsInitialized;
        private static final RoguelikeDungeonSettleInfo DEFAULT_INSTANCE;
        private static final Parser<RoguelikeDungeonSettleInfo> PARSER;
        
        private RoguelikeDungeonSettleInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private RoguelikeDungeonSettleInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new RoguelikeDungeonSettleInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private RoguelikeDungeonSettleInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 26: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.finishedChallengeCellNumMap_ = MapField.newMapField(FinishedChallengeCellNumMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x1;
                            }
                            final MapEntry<Integer, RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo> finishedChallengeCellNumMap__ = input.readMessage(FinishedChallengeCellNumMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.finishedChallengeCellNumMap_.getMutableMap().put(finishedChallengeCellNumMap__.getKey(), finishedChallengeCellNumMap__.getValue());
                            continue;
                        }
                        case 40: {
                            this.stageId_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.totalCoinBNum_ = input.readUInt32();
                            continue;
                        }
                        case 72: {
                            this.curLevel_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
                            this.totalCoinCNum_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.isCoinCReachLimit_ = input.readBool();
                            continue;
                        }
                        case 120: {
                            this.isFinalLevel_ = input.readBool();
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
            return RoguelikeDungeonSettleInfoOuterClass.internal_static_RoguelikeDungeonSettleInfo_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 3: {
                    return this.internalGetFinishedChallengeCellNumMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return RoguelikeDungeonSettleInfoOuterClass.internal_static_RoguelikeDungeonSettleInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RoguelikeDungeonSettleInfo.class, Builder.class);
        }
        
        @Override
        public int getStageId() {
            return this.stageId_;
        }
        
        @Override
        public boolean getIsFinalLevel() {
            return this.isFinalLevel_;
        }
        
        private MapField<Integer, RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo> internalGetFinishedChallengeCellNumMap() {
            if (this.finishedChallengeCellNumMap_ == null) {
                return MapField.emptyMapField(FinishedChallengeCellNumMapDefaultEntryHolder.defaultEntry);
            }
            return this.finishedChallengeCellNumMap_;
        }
        
        @Override
        public int getFinishedChallengeCellNumMapCount() {
            return this.internalGetFinishedChallengeCellNumMap().getMap().size();
        }
        
        @Override
        public boolean containsFinishedChallengeCellNumMap(final int key) {
            return this.internalGetFinishedChallengeCellNumMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo> getFinishedChallengeCellNumMap() {
            return this.getFinishedChallengeCellNumMapMap();
        }
        
        @Override
        public Map<Integer, RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo> getFinishedChallengeCellNumMapMap() {
            return this.internalGetFinishedChallengeCellNumMap().getMap();
        }
        
        @Override
        public RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo getFinishedChallengeCellNumMapOrDefault(final int key, final RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo defaultValue) {
            final Map<Integer, RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo> map = this.internalGetFinishedChallengeCellNumMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo getFinishedChallengeCellNumMapOrThrow(final int key) {
            final Map<Integer, RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo> map = this.internalGetFinishedChallengeCellNumMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public boolean getIsCoinCReachLimit() {
            return this.isCoinCReachLimit_;
        }
        
        @Override
        public int getCurLevel() {
            return this.curLevel_;
        }
        
        @Override
        public int getTotalCoinBNum() {
            return this.totalCoinBNum_;
        }
        
        @Override
        public int getTotalCoinCNum() {
            return this.totalCoinCNum_;
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
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetFinishedChallengeCellNumMap(), FinishedChallengeCellNumMapDefaultEntryHolder.defaultEntry, 3);
            if (this.stageId_ != 0) {
                output.writeUInt32(5, this.stageId_);
            }
            if (this.totalCoinBNum_ != 0) {
                output.writeUInt32(6, this.totalCoinBNum_);
            }
            if (this.curLevel_ != 0) {
                output.writeUInt32(9, this.curLevel_);
            }
            if (this.totalCoinCNum_ != 0) {
                output.writeUInt32(10, this.totalCoinCNum_);
            }
            if (this.isCoinCReachLimit_) {
                output.writeBool(13, this.isCoinCReachLimit_);
            }
            if (this.isFinalLevel_) {
                output.writeBool(15, this.isFinalLevel_);
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
            for (final Map.Entry<Integer, RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo> entry : this.internalGetFinishedChallengeCellNumMap().getMap().entrySet()) {
                final MapEntry<Integer, RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo> finishedChallengeCellNumMap__ = FinishedChallengeCellNumMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(3, finishedChallengeCellNumMap__);
            }
            if (this.stageId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.stageId_);
            }
            if (this.totalCoinBNum_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.totalCoinBNum_);
            }
            if (this.curLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.curLevel_);
            }
            if (this.totalCoinCNum_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.totalCoinCNum_);
            }
            if (this.isCoinCReachLimit_) {
                size += CodedOutputStream.computeBoolSize(13, this.isCoinCReachLimit_);
            }
            if (this.isFinalLevel_) {
                size += CodedOutputStream.computeBoolSize(15, this.isFinalLevel_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RoguelikeDungeonSettleInfo)) {
                return super.equals(obj);
            }
            final RoguelikeDungeonSettleInfo other = (RoguelikeDungeonSettleInfo)obj;
            return this.getStageId() == other.getStageId() && this.getIsFinalLevel() == other.getIsFinalLevel() && this.internalGetFinishedChallengeCellNumMap().equals(other.internalGetFinishedChallengeCellNumMap()) && this.getIsCoinCReachLimit() == other.getIsCoinCReachLimit() && this.getCurLevel() == other.getCurLevel() && this.getTotalCoinBNum() == other.getTotalCoinBNum() && this.getTotalCoinCNum() == other.getTotalCoinCNum() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getStageId();
            hash = 37 * hash + 15;
            hash = 53 * hash + Internal.hashBoolean(this.getIsFinalLevel());
            if (!this.internalGetFinishedChallengeCellNumMap().getMap().isEmpty()) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.internalGetFinishedChallengeCellNumMap().hashCode();
            }
            hash = 37 * hash + 13;
            hash = 53 * hash + Internal.hashBoolean(this.getIsCoinCReachLimit());
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getCurLevel();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getTotalCoinBNum();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getTotalCoinCNum();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static RoguelikeDungeonSettleInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return RoguelikeDungeonSettleInfo.PARSER.parseFrom(data);
        }
        
        public static RoguelikeDungeonSettleInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return RoguelikeDungeonSettleInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static RoguelikeDungeonSettleInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return RoguelikeDungeonSettleInfo.PARSER.parseFrom(data);
        }
        
        public static RoguelikeDungeonSettleInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return RoguelikeDungeonSettleInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static RoguelikeDungeonSettleInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return RoguelikeDungeonSettleInfo.PARSER.parseFrom(data);
        }
        
        public static RoguelikeDungeonSettleInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return RoguelikeDungeonSettleInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static RoguelikeDungeonSettleInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(RoguelikeDungeonSettleInfo.PARSER, input);
        }
        
        public static RoguelikeDungeonSettleInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(RoguelikeDungeonSettleInfo.PARSER, input, extensionRegistry);
        }
        
        public static RoguelikeDungeonSettleInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(RoguelikeDungeonSettleInfo.PARSER, input);
        }
        
        public static RoguelikeDungeonSettleInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(RoguelikeDungeonSettleInfo.PARSER, input, extensionRegistry);
        }
        
        public static RoguelikeDungeonSettleInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(RoguelikeDungeonSettleInfo.PARSER, input);
        }
        
        public static RoguelikeDungeonSettleInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(RoguelikeDungeonSettleInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return RoguelikeDungeonSettleInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final RoguelikeDungeonSettleInfo prototype) {
            return RoguelikeDungeonSettleInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == RoguelikeDungeonSettleInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static RoguelikeDungeonSettleInfo getDefaultInstance() {
            return RoguelikeDungeonSettleInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<RoguelikeDungeonSettleInfo> parser() {
            return RoguelikeDungeonSettleInfo.PARSER;
        }
        
        @Override
        public Parser<RoguelikeDungeonSettleInfo> getParserForType() {
            return RoguelikeDungeonSettleInfo.PARSER;
        }
        
        @Override
        public RoguelikeDungeonSettleInfo getDefaultInstanceForType() {
            return RoguelikeDungeonSettleInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new RoguelikeDungeonSettleInfo();
            PARSER = new AbstractParser<RoguelikeDungeonSettleInfo>() {
                @Override
                public RoguelikeDungeonSettleInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new RoguelikeDungeonSettleInfo(input, extensionRegistry);
                }
            };
        }
        
        private static final class FinishedChallengeCellNumMapDefaultEntryHolder
        {
            static final MapEntry<Integer, RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(RoguelikeDungeonSettleInfoOuterClass.internal_static_RoguelikeDungeonSettleInfo_FinishedChallengeCellNumMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.MESSAGE, RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo.getDefaultInstance());
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RoguelikeDungeonSettleInfoOrBuilder
        {
            private int bitField0_;
            private int stageId_;
            private boolean isFinalLevel_;
            private MapField<Integer, RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo> finishedChallengeCellNumMap_;
            private boolean isCoinCReachLimit_;
            private int curLevel_;
            private int totalCoinBNum_;
            private int totalCoinCNum_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return RoguelikeDungeonSettleInfoOuterClass.internal_static_RoguelikeDungeonSettleInfo_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 3: {
                        return this.internalGetFinishedChallengeCellNumMap();
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
                        return this.internalGetMutableFinishedChallengeCellNumMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return RoguelikeDungeonSettleInfoOuterClass.internal_static_RoguelikeDungeonSettleInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RoguelikeDungeonSettleInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (RoguelikeDungeonSettleInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.stageId_ = 0;
                this.isFinalLevel_ = false;
                this.internalGetMutableFinishedChallengeCellNumMap().clear();
                this.isCoinCReachLimit_ = false;
                this.curLevel_ = 0;
                this.totalCoinBNum_ = 0;
                this.totalCoinCNum_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return RoguelikeDungeonSettleInfoOuterClass.internal_static_RoguelikeDungeonSettleInfo_descriptor;
            }
            
            @Override
            public RoguelikeDungeonSettleInfo getDefaultInstanceForType() {
                return RoguelikeDungeonSettleInfo.getDefaultInstance();
            }
            
            @Override
            public RoguelikeDungeonSettleInfo build() {
                final RoguelikeDungeonSettleInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public RoguelikeDungeonSettleInfo buildPartial() {
                final RoguelikeDungeonSettleInfo result = new RoguelikeDungeonSettleInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.stageId_ = this.stageId_;
                result.isFinalLevel_ = this.isFinalLevel_;
                (result.finishedChallengeCellNumMap_ = this.internalGetFinishedChallengeCellNumMap()).makeImmutable();
                result.isCoinCReachLimit_ = this.isCoinCReachLimit_;
                result.curLevel_ = this.curLevel_;
                result.totalCoinBNum_ = this.totalCoinBNum_;
                result.totalCoinCNum_ = this.totalCoinCNum_;
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
                if (other instanceof RoguelikeDungeonSettleInfo) {
                    return this.mergeFrom((RoguelikeDungeonSettleInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final RoguelikeDungeonSettleInfo other) {
                if (other == RoguelikeDungeonSettleInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getStageId() != 0) {
                    this.setStageId(other.getStageId());
                }
                if (other.getIsFinalLevel()) {
                    this.setIsFinalLevel(other.getIsFinalLevel());
                }
                this.internalGetMutableFinishedChallengeCellNumMap().mergeFrom(other.internalGetFinishedChallengeCellNumMap());
                if (other.getIsCoinCReachLimit()) {
                    this.setIsCoinCReachLimit(other.getIsCoinCReachLimit());
                }
                if (other.getCurLevel() != 0) {
                    this.setCurLevel(other.getCurLevel());
                }
                if (other.getTotalCoinBNum() != 0) {
                    this.setTotalCoinBNum(other.getTotalCoinBNum());
                }
                if (other.getTotalCoinCNum() != 0) {
                    this.setTotalCoinCNum(other.getTotalCoinCNum());
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
                RoguelikeDungeonSettleInfo parsedMessage = null;
                try {
                    parsedMessage = RoguelikeDungeonSettleInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (RoguelikeDungeonSettleInfo)e.getUnfinishedMessage();
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
            public int getStageId() {
                return this.stageId_;
            }
            
            public Builder setStageId(final int value) {
                this.stageId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearStageId() {
                this.stageId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsFinalLevel() {
                return this.isFinalLevel_;
            }
            
            public Builder setIsFinalLevel(final boolean value) {
                this.isFinalLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsFinalLevel() {
                this.isFinalLevel_ = false;
                this.onChanged();
                return this;
            }
            
            private MapField<Integer, RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo> internalGetFinishedChallengeCellNumMap() {
                if (this.finishedChallengeCellNumMap_ == null) {
                    return MapField.emptyMapField(FinishedChallengeCellNumMapDefaultEntryHolder.defaultEntry);
                }
                return this.finishedChallengeCellNumMap_;
            }
            
            private MapField<Integer, RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo> internalGetMutableFinishedChallengeCellNumMap() {
                this.onChanged();
                if (this.finishedChallengeCellNumMap_ == null) {
                    this.finishedChallengeCellNumMap_ = MapField.newMapField(FinishedChallengeCellNumMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.finishedChallengeCellNumMap_.isMutable()) {
                    this.finishedChallengeCellNumMap_ = this.finishedChallengeCellNumMap_.copy();
                }
                return this.finishedChallengeCellNumMap_;
            }
            
            @Override
            public int getFinishedChallengeCellNumMapCount() {
                return this.internalGetFinishedChallengeCellNumMap().getMap().size();
            }
            
            @Override
            public boolean containsFinishedChallengeCellNumMap(final int key) {
                return this.internalGetFinishedChallengeCellNumMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo> getFinishedChallengeCellNumMap() {
                return this.getFinishedChallengeCellNumMapMap();
            }
            
            @Override
            public Map<Integer, RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo> getFinishedChallengeCellNumMapMap() {
                return this.internalGetFinishedChallengeCellNumMap().getMap();
            }
            
            @Override
            public RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo getFinishedChallengeCellNumMapOrDefault(final int key, final RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo defaultValue) {
                final Map<Integer, RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo> map = this.internalGetFinishedChallengeCellNumMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo getFinishedChallengeCellNumMapOrThrow(final int key) {
                final Map<Integer, RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo> map = this.internalGetFinishedChallengeCellNumMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearFinishedChallengeCellNumMap() {
                this.internalGetMutableFinishedChallengeCellNumMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeFinishedChallengeCellNumMap(final int key) {
                this.internalGetMutableFinishedChallengeCellNumMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo> getMutableFinishedChallengeCellNumMap() {
                return this.internalGetMutableFinishedChallengeCellNumMap().getMutableMap();
            }
            
            public Builder putFinishedChallengeCellNumMap(final int key, final RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.internalGetMutableFinishedChallengeCellNumMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllFinishedChallengeCellNumMap(final Map<Integer, RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo> values) {
                this.internalGetMutableFinishedChallengeCellNumMap().getMutableMap().putAll(values);
                return this;
            }
            
            @Override
            public boolean getIsCoinCReachLimit() {
                return this.isCoinCReachLimit_;
            }
            
            public Builder setIsCoinCReachLimit(final boolean value) {
                this.isCoinCReachLimit_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsCoinCReachLimit() {
                this.isCoinCReachLimit_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCurLevel() {
                return this.curLevel_;
            }
            
            public Builder setCurLevel(final int value) {
                this.curLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurLevel() {
                this.curLevel_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getTotalCoinBNum() {
                return this.totalCoinBNum_;
            }
            
            public Builder setTotalCoinBNum(final int value) {
                this.totalCoinBNum_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTotalCoinBNum() {
                this.totalCoinBNum_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getTotalCoinCNum() {
                return this.totalCoinCNum_;
            }
            
            public Builder setTotalCoinCNum(final int value) {
                this.totalCoinCNum_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTotalCoinCNum() {
                this.totalCoinCNum_ = 0;
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
    
    public interface RoguelikeDungeonSettleInfoOrBuilder extends MessageOrBuilder
    {
        int getStageId();
        
        boolean getIsFinalLevel();
        
        int getFinishedChallengeCellNumMapCount();
        
        boolean containsFinishedChallengeCellNumMap(final int p0);
        
        @Deprecated
        Map<Integer, RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo> getFinishedChallengeCellNumMap();
        
        Map<Integer, RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo> getFinishedChallengeCellNumMapMap();
        
        RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo getFinishedChallengeCellNumMapOrDefault(final int p0, final RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo p1);
        
        RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo getFinishedChallengeCellNumMapOrThrow(final int p0);
        
        boolean getIsCoinCReachLimit();
        
        int getCurLevel();
        
        int getTotalCoinBNum();
        
        int getTotalCoinCNum();
    }
}
