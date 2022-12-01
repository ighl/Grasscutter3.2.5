// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.WireFormat;
import com.google.protobuf.ProtocolMessageEnum;
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

public final class CoopChapterOuterClass
{
    private static final Descriptors.Descriptor internal_static_CoopChapter_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CoopChapter_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CoopChapter_SeenEndingMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CoopChapter_SeenEndingMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CoopChapterOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CoopChapterOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0011CoopChapter.proto\u001a\fCoopCg.proto\u001a\u000fCoopPoint.proto\u001a\u0010CoopReward.proto\"\u00dc\u0003\n\u000bCoopChapter\u0012\u001d\n\fcoop_cg_list\u0018\u0001 \u0003(\u000b2\u0007.CoopCg\u0012\n\n\u0002id\u0018\u0002 \u0001(\r\u0012#\n\u000fcoop_point_list\u0018\u000b \u0003(\u000b2\n.CoopPoint\u0012\u001a\n\u0012finish_dialog_list\u0018\n \u0003(\r\u0012\u001a\n\u0012finished_end_count\u0018\u000e \u0001(\r\u0012\u0017\n\u000ftotal_end_count\u0018\u0007 \u0001(\r\u0012%\n\u0010coop_reward_list\u0018\u0005 \u0003(\u000b2\u000b.CoopReward\u0012\u0018\n\u0010lock_reason_list\u0018\f \u0003(\r\u0012!\n\u0005state\u0018\u0004 \u0001(\u000e2\u0012.CoopChapter.State\u00128\n\u000fseen_ending_map\u0018\t \u0003(\u000b2\u001f.CoopChapter.SeenEndingMapEntry\u001a4\n\u0012SeenEndingMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001\"X\n\u0005State\u0012\u000f\n\u000bSTATE_CLOSE\u0010\u0000\u0012\u0017\n\u0013STATE_COND_NOT_MEET\u0010\u0001\u0012\u0013\n\u000fSTATE_COND_MEET\u0010\u0002\u0012\u0010\n\fSTATE_ACCEPT\u0010\u0003B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CoopChapterOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { CoopCgOuterClass.getDescriptor(), CoopPointOuterClass.getDescriptor(), CoopRewardOuterClass.getDescriptor() });
        internal_static_CoopChapter_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CoopChapter_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CoopChapterOuterClass.internal_static_CoopChapter_descriptor, new String[] { "CoopCgList", "Id", "CoopPointList", "FinishDialogList", "FinishedEndCount", "TotalEndCount", "CoopRewardList", "LockReasonList", "State", "SeenEndingMap" });
        internal_static_CoopChapter_SeenEndingMapEntry_descriptor = CoopChapterOuterClass.internal_static_CoopChapter_descriptor.getNestedTypes().get(0);
        internal_static_CoopChapter_SeenEndingMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CoopChapterOuterClass.internal_static_CoopChapter_SeenEndingMapEntry_descriptor, new String[] { "Key", "Value" });
        CoopCgOuterClass.getDescriptor();
        CoopPointOuterClass.getDescriptor();
        CoopRewardOuterClass.getDescriptor();
    }
    
    public static final class CoopChapter extends GeneratedMessageV3 implements CoopChapterOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int COOP_CG_LIST_FIELD_NUMBER = 1;
        private List<CoopCgOuterClass.CoopCg> coopCgList_;
        public static final int ID_FIELD_NUMBER = 2;
        private int id_;
        public static final int COOP_POINT_LIST_FIELD_NUMBER = 11;
        private List<CoopPointOuterClass.CoopPoint> coopPointList_;
        public static final int FINISH_DIALOG_LIST_FIELD_NUMBER = 10;
        private Internal.IntList finishDialogList_;
        private int finishDialogListMemoizedSerializedSize;
        public static final int FINISHED_END_COUNT_FIELD_NUMBER = 14;
        private int finishedEndCount_;
        public static final int TOTAL_END_COUNT_FIELD_NUMBER = 7;
        private int totalEndCount_;
        public static final int COOP_REWARD_LIST_FIELD_NUMBER = 5;
        private List<CoopRewardOuterClass.CoopReward> coopRewardList_;
        public static final int LOCK_REASON_LIST_FIELD_NUMBER = 12;
        private Internal.IntList lockReasonList_;
        private int lockReasonListMemoizedSerializedSize;
        public static final int STATE_FIELD_NUMBER = 4;
        private int state_;
        public static final int SEEN_ENDING_MAP_FIELD_NUMBER = 9;
        private MapField<Integer, Integer> seenEndingMap_;
        private byte memoizedIsInitialized;
        private static final CoopChapter DEFAULT_INSTANCE;
        private static final Parser<CoopChapter> PARSER;
        
        private CoopChapter(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.finishDialogListMemoizedSerializedSize = -1;
            this.lockReasonListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private CoopChapter() {
            this.finishDialogListMemoizedSerializedSize = -1;
            this.lockReasonListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.coopCgList_ = Collections.emptyList();
            this.coopPointList_ = Collections.emptyList();
            this.finishDialogList_ = GeneratedMessageV3.emptyIntList();
            this.coopRewardList_ = Collections.emptyList();
            this.lockReasonList_ = GeneratedMessageV3.emptyIntList();
            this.state_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CoopChapter();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CoopChapter(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 10: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.coopCgList_ = new ArrayList<CoopCgOuterClass.CoopCg>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.coopCgList_.add(input.readMessage(CoopCgOuterClass.CoopCg.parser(), extensionRegistry));
                            continue;
                        }
                        case 16: {
                            this.id_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            final int rawValue = input.readEnum();
                            this.state_ = rawValue;
                            continue;
                        }
                        case 42: {
                            if ((mutable_bitField0_ & 0x8) == 0x0) {
                                this.coopRewardList_ = new ArrayList<CoopRewardOuterClass.CoopReward>();
                                mutable_bitField0_ |= 0x8;
                            }
                            this.coopRewardList_.add(input.readMessage(CoopRewardOuterClass.CoopReward.parser(), extensionRegistry));
                            continue;
                        }
                        case 56: {
                            this.totalEndCount_ = input.readUInt32();
                            continue;
                        }
                        case 74: {
                            if ((mutable_bitField0_ & 0x20) == 0x0) {
                                this.seenEndingMap_ = MapField.newMapField(SeenEndingMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x20;
                            }
                            final MapEntry<Integer, Integer> seenEndingMap__ = input.readMessage(SeenEndingMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.seenEndingMap_.getMutableMap().put(seenEndingMap__.getKey(), seenEndingMap__.getValue());
                            continue;
                        }
                        case 80: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.finishDialogList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.finishDialogList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 82: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x4) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.finishDialogList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x4;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.finishDialogList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 90: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.coopPointList_ = new ArrayList<CoopPointOuterClass.CoopPoint>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.coopPointList_.add(input.readMessage(CoopPointOuterClass.CoopPoint.parser(), extensionRegistry));
                            continue;
                        }
                        case 96: {
                            if ((mutable_bitField0_ & 0x10) == 0x0) {
                                this.lockReasonList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x10;
                            }
                            this.lockReasonList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 98: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x10) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.lockReasonList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x10;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.lockReasonList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 112: {
                            this.finishedEndCount_ = input.readUInt32();
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
                    this.coopCgList_ = Collections.unmodifiableList((List<? extends CoopCgOuterClass.CoopCg>)this.coopCgList_);
                }
                if ((mutable_bitField0_ & 0x8) != 0x0) {
                    this.coopRewardList_ = Collections.unmodifiableList((List<? extends CoopRewardOuterClass.CoopReward>)this.coopRewardList_);
                }
                if ((mutable_bitField0_ & 0x4) != 0x0) {
                    this.finishDialogList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.coopPointList_ = Collections.unmodifiableList((List<? extends CoopPointOuterClass.CoopPoint>)this.coopPointList_);
                }
                if ((mutable_bitField0_ & 0x10) != 0x0) {
                    this.lockReasonList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return CoopChapterOuterClass.internal_static_CoopChapter_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 9: {
                    return this.internalGetSeenEndingMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CoopChapterOuterClass.internal_static_CoopChapter_fieldAccessorTable.ensureFieldAccessorsInitialized(CoopChapter.class, Builder.class);
        }
        
        @Override
        public List<CoopCgOuterClass.CoopCg> getCoopCgListList() {
            return this.coopCgList_;
        }
        
        @Override
        public List<? extends CoopCgOuterClass.CoopCgOrBuilder> getCoopCgListOrBuilderList() {
            return this.coopCgList_;
        }
        
        @Override
        public int getCoopCgListCount() {
            return this.coopCgList_.size();
        }
        
        @Override
        public CoopCgOuterClass.CoopCg getCoopCgList(final int index) {
            return this.coopCgList_.get(index);
        }
        
        @Override
        public CoopCgOuterClass.CoopCgOrBuilder getCoopCgListOrBuilder(final int index) {
            return this.coopCgList_.get(index);
        }
        
        @Override
        public int getId() {
            return this.id_;
        }
        
        @Override
        public List<CoopPointOuterClass.CoopPoint> getCoopPointListList() {
            return this.coopPointList_;
        }
        
        @Override
        public List<? extends CoopPointOuterClass.CoopPointOrBuilder> getCoopPointListOrBuilderList() {
            return this.coopPointList_;
        }
        
        @Override
        public int getCoopPointListCount() {
            return this.coopPointList_.size();
        }
        
        @Override
        public CoopPointOuterClass.CoopPoint getCoopPointList(final int index) {
            return this.coopPointList_.get(index);
        }
        
        @Override
        public CoopPointOuterClass.CoopPointOrBuilder getCoopPointListOrBuilder(final int index) {
            return this.coopPointList_.get(index);
        }
        
        @Override
        public List<Integer> getFinishDialogListList() {
            return this.finishDialogList_;
        }
        
        @Override
        public int getFinishDialogListCount() {
            return this.finishDialogList_.size();
        }
        
        @Override
        public int getFinishDialogList(final int index) {
            return this.finishDialogList_.getInt(index);
        }
        
        @Override
        public int getFinishedEndCount() {
            return this.finishedEndCount_;
        }
        
        @Override
        public int getTotalEndCount() {
            return this.totalEndCount_;
        }
        
        @Override
        public List<CoopRewardOuterClass.CoopReward> getCoopRewardListList() {
            return this.coopRewardList_;
        }
        
        @Override
        public List<? extends CoopRewardOuterClass.CoopRewardOrBuilder> getCoopRewardListOrBuilderList() {
            return this.coopRewardList_;
        }
        
        @Override
        public int getCoopRewardListCount() {
            return this.coopRewardList_.size();
        }
        
        @Override
        public CoopRewardOuterClass.CoopReward getCoopRewardList(final int index) {
            return this.coopRewardList_.get(index);
        }
        
        @Override
        public CoopRewardOuterClass.CoopRewardOrBuilder getCoopRewardListOrBuilder(final int index) {
            return this.coopRewardList_.get(index);
        }
        
        @Override
        public List<Integer> getLockReasonListList() {
            return this.lockReasonList_;
        }
        
        @Override
        public int getLockReasonListCount() {
            return this.lockReasonList_.size();
        }
        
        @Override
        public int getLockReasonList(final int index) {
            return this.lockReasonList_.getInt(index);
        }
        
        @Override
        public int getStateValue() {
            return this.state_;
        }
        
        @Override
        public State getState() {
            final State result = State.valueOf(this.state_);
            return (result == null) ? State.UNRECOGNIZED : result;
        }
        
        private MapField<Integer, Integer> internalGetSeenEndingMap() {
            if (this.seenEndingMap_ == null) {
                return MapField.emptyMapField(SeenEndingMapDefaultEntryHolder.defaultEntry);
            }
            return this.seenEndingMap_;
        }
        
        @Override
        public int getSeenEndingMapCount() {
            return this.internalGetSeenEndingMap().getMap().size();
        }
        
        @Override
        public boolean containsSeenEndingMap(final int key) {
            return this.internalGetSeenEndingMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, Integer> getSeenEndingMap() {
            return this.getSeenEndingMapMap();
        }
        
        @Override
        public Map<Integer, Integer> getSeenEndingMapMap() {
            return this.internalGetSeenEndingMap().getMap();
        }
        
        @Override
        public int getSeenEndingMapOrDefault(final int key, final int defaultValue) {
            final Map<Integer, Integer> map = this.internalGetSeenEndingMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public int getSeenEndingMapOrThrow(final int key) {
            final Map<Integer, Integer> map = this.internalGetSeenEndingMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
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
            for (int i = 0; i < this.coopCgList_.size(); ++i) {
                output.writeMessage(1, this.coopCgList_.get(i));
            }
            if (this.id_ != 0) {
                output.writeUInt32(2, this.id_);
            }
            if (this.state_ != State.STATE_CLOSE.getNumber()) {
                output.writeEnum(4, this.state_);
            }
            for (int i = 0; i < this.coopRewardList_.size(); ++i) {
                output.writeMessage(5, this.coopRewardList_.get(i));
            }
            if (this.totalEndCount_ != 0) {
                output.writeUInt32(7, this.totalEndCount_);
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetSeenEndingMap(), SeenEndingMapDefaultEntryHolder.defaultEntry, 9);
            if (this.getFinishDialogListList().size() > 0) {
                output.writeUInt32NoTag(82);
                output.writeUInt32NoTag(this.finishDialogListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.finishDialogList_.size(); ++i) {
                output.writeUInt32NoTag(this.finishDialogList_.getInt(i));
            }
            for (int i = 0; i < this.coopPointList_.size(); ++i) {
                output.writeMessage(11, this.coopPointList_.get(i));
            }
            if (this.getLockReasonListList().size() > 0) {
                output.writeUInt32NoTag(98);
                output.writeUInt32NoTag(this.lockReasonListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.lockReasonList_.size(); ++i) {
                output.writeUInt32NoTag(this.lockReasonList_.getInt(i));
            }
            if (this.finishedEndCount_ != 0) {
                output.writeUInt32(14, this.finishedEndCount_);
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
            for (int i = 0; i < this.coopCgList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(1, this.coopCgList_.get(i));
            }
            if (this.id_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.id_);
            }
            if (this.state_ != State.STATE_CLOSE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(4, this.state_);
            }
            for (int i = 0; i < this.coopRewardList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(5, this.coopRewardList_.get(i));
            }
            if (this.totalEndCount_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.totalEndCount_);
            }
            for (final Map.Entry<Integer, Integer> entry : this.internalGetSeenEndingMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> seenEndingMap__ = SeenEndingMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(9, seenEndingMap__);
            }
            int dataSize = 0;
            for (int j = 0; j < this.finishDialogList_.size(); ++j) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.finishDialogList_.getInt(j));
            }
            size += dataSize;
            if (!this.getFinishDialogListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.finishDialogListMemoizedSerializedSize = dataSize;
            for (int i = 0; i < this.coopPointList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(11, this.coopPointList_.get(i));
            }
            dataSize = 0;
            for (int j = 0; j < this.lockReasonList_.size(); ++j) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.lockReasonList_.getInt(j));
            }
            size += dataSize;
            if (!this.getLockReasonListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.lockReasonListMemoizedSerializedSize = dataSize;
            if (this.finishedEndCount_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.finishedEndCount_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CoopChapter)) {
                return super.equals(obj);
            }
            final CoopChapter other = (CoopChapter)obj;
            return this.getCoopCgListList().equals(other.getCoopCgListList()) && this.getId() == other.getId() && this.getCoopPointListList().equals(other.getCoopPointListList()) && this.getFinishDialogListList().equals(other.getFinishDialogListList()) && this.getFinishedEndCount() == other.getFinishedEndCount() && this.getTotalEndCount() == other.getTotalEndCount() && this.getCoopRewardListList().equals(other.getCoopRewardListList()) && this.getLockReasonListList().equals(other.getLockReasonListList()) && this.state_ == other.state_ && this.internalGetSeenEndingMap().equals(other.internalGetSeenEndingMap()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getCoopCgListCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getCoopCgListList().hashCode();
            }
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getId();
            if (this.getCoopPointListCount() > 0) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.getCoopPointListList().hashCode();
            }
            if (this.getFinishDialogListCount() > 0) {
                hash = 37 * hash + 10;
                hash = 53 * hash + this.getFinishDialogListList().hashCode();
            }
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getFinishedEndCount();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getTotalEndCount();
            if (this.getCoopRewardListCount() > 0) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getCoopRewardListList().hashCode();
            }
            if (this.getLockReasonListCount() > 0) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getLockReasonListList().hashCode();
            }
            hash = 37 * hash + 4;
            hash = 53 * hash + this.state_;
            if (!this.internalGetSeenEndingMap().getMap().isEmpty()) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.internalGetSeenEndingMap().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CoopChapter parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CoopChapter.PARSER.parseFrom(data);
        }
        
        public static CoopChapter parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CoopChapter.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CoopChapter parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CoopChapter.PARSER.parseFrom(data);
        }
        
        public static CoopChapter parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CoopChapter.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CoopChapter parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CoopChapter.PARSER.parseFrom(data);
        }
        
        public static CoopChapter parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CoopChapter.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CoopChapter parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CoopChapter.PARSER, input);
        }
        
        public static CoopChapter parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CoopChapter.PARSER, input, extensionRegistry);
        }
        
        public static CoopChapter parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CoopChapter.PARSER, input);
        }
        
        public static CoopChapter parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CoopChapter.PARSER, input, extensionRegistry);
        }
        
        public static CoopChapter parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CoopChapter.PARSER, input);
        }
        
        public static CoopChapter parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CoopChapter.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CoopChapter.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CoopChapter prototype) {
            return CoopChapter.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CoopChapter.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CoopChapter getDefaultInstance() {
            return CoopChapter.DEFAULT_INSTANCE;
        }
        
        public static Parser<CoopChapter> parser() {
            return CoopChapter.PARSER;
        }
        
        @Override
        public Parser<CoopChapter> getParserForType() {
            return CoopChapter.PARSER;
        }
        
        @Override
        public CoopChapter getDefaultInstanceForType() {
            return CoopChapter.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CoopChapter();
            PARSER = new AbstractParser<CoopChapter>() {
                @Override
                public CoopChapter parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CoopChapter(input, extensionRegistry);
                }
            };
        }
        
        public enum State implements ProtocolMessageEnum
        {
            STATE_CLOSE(0), 
            STATE_COND_NOT_MEET(1), 
            STATE_COND_MEET(2), 
            STATE_ACCEPT(3), 
            UNRECOGNIZED(-1);
            
            public static final int STATE_CLOSE_VALUE = 0;
            public static final int STATE_COND_NOT_MEET_VALUE = 1;
            public static final int STATE_COND_MEET_VALUE = 2;
            public static final int STATE_ACCEPT_VALUE = 3;
            private static final Internal.EnumLiteMap<State> internalValueMap;
            private static final State[] VALUES;
            private final int value;
            
            @Override
            public final int getNumber() {
                if (this == State.UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }
            
            @Deprecated
            public static State valueOf(final int value) {
                return forNumber(value);
            }
            
            public static State forNumber(final int value) {
                switch (value) {
                    case 0: {
                        return State.STATE_CLOSE;
                    }
                    case 1: {
                        return State.STATE_COND_NOT_MEET;
                    }
                    case 2: {
                        return State.STATE_COND_MEET;
                    }
                    case 3: {
                        return State.STATE_ACCEPT;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            public static Internal.EnumLiteMap<State> internalGetValueMap() {
                return State.internalValueMap;
            }
            
            @Override
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                if (this == State.UNRECOGNIZED) {
                    throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
                }
                return getDescriptor().getValues().get(this.ordinal());
            }
            
            @Override
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }
            
            public static final Descriptors.EnumDescriptor getDescriptor() {
                return CoopChapter.getDescriptor().getEnumTypes().get(0);
            }
            
            public static State valueOf(final Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return State.UNRECOGNIZED;
                }
                return State.VALUES[desc.getIndex()];
            }
            
            private State(final int value) {
                this.value = value;
            }
            
            private static /* synthetic */ State[] value() {
                return new State[] { State.STATE_CLOSE, State.STATE_COND_NOT_MEET, State.STATE_COND_MEET, State.STATE_ACCEPT, State.UNRECOGNIZED };
            }
            
            static {
                VALUES = values();
                internalValueMap = new Internal.EnumLiteMap<State>() {
                    @Override
                    public State findValueByNumber(final int number) {
                        return State.forNumber(number);
                    }
                };

        }
        }
        
        private static final class SeenEndingMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(CoopChapterOuterClass.internal_static_CoopChapter_SeenEndingMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CoopChapterOrBuilder
        {
            private int bitField0_;
            private List<CoopCgOuterClass.CoopCg> coopCgList_;
            private RepeatedFieldBuilderV3<CoopCgOuterClass.CoopCg, CoopCgOuterClass.CoopCg.Builder, CoopCgOuterClass.CoopCgOrBuilder> coopCgListBuilder_;
            private int id_;
            private List<CoopPointOuterClass.CoopPoint> coopPointList_;
            private RepeatedFieldBuilderV3<CoopPointOuterClass.CoopPoint, CoopPointOuterClass.CoopPoint.Builder, CoopPointOuterClass.CoopPointOrBuilder> coopPointListBuilder_;
            private Internal.IntList finishDialogList_;
            private int finishedEndCount_;
            private int totalEndCount_;
            private List<CoopRewardOuterClass.CoopReward> coopRewardList_;
            private RepeatedFieldBuilderV3<CoopRewardOuterClass.CoopReward, CoopRewardOuterClass.CoopReward.Builder, CoopRewardOuterClass.CoopRewardOrBuilder> coopRewardListBuilder_;
            private Internal.IntList lockReasonList_;
            private int state_;
            private MapField<Integer, Integer> seenEndingMap_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CoopChapterOuterClass.internal_static_CoopChapter_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 9: {
                        return this.internalGetSeenEndingMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected MapField internalGetMutableMapField(final int number) {
                switch (number) {
                    case 9: {
                        return this.internalGetMutableSeenEndingMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CoopChapterOuterClass.internal_static_CoopChapter_fieldAccessorTable.ensureFieldAccessorsInitialized(CoopChapter.class, Builder.class);
            }
            
            private Builder() {
                this.coopCgList_ = Collections.emptyList();
                this.coopPointList_ = Collections.emptyList();
                this.finishDialogList_ = GeneratedMessageV3.emptyIntList();
                this.coopRewardList_ = Collections.emptyList();
                this.lockReasonList_ = GeneratedMessageV3.emptyIntList();
                this.state_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.coopCgList_ = Collections.emptyList();
                this.coopPointList_ = Collections.emptyList();
                this.finishDialogList_ = GeneratedMessageV3.emptyIntList();
                this.coopRewardList_ = Collections.emptyList();
                this.lockReasonList_ = GeneratedMessageV3.emptyIntList();
                this.state_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (CoopChapter.alwaysUseFieldBuilders) {
                    this.getCoopCgListFieldBuilder();
                    this.getCoopPointListFieldBuilder();
                    this.getCoopRewardListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.coopCgListBuilder_ == null) {
                    this.coopCgList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.coopCgListBuilder_.clear();
                }
                this.id_ = 0;
                if (this.coopPointListBuilder_ == null) {
                    this.coopPointList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                else {
                    this.coopPointListBuilder_.clear();
                }
                this.finishDialogList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFB;
                this.finishedEndCount_ = 0;
                this.totalEndCount_ = 0;
                if (this.coopRewardListBuilder_ == null) {
                    this.coopRewardList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFF7;
                }
                else {
                    this.coopRewardListBuilder_.clear();
                }
                this.lockReasonList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFEF;
                this.state_ = 0;
                this.internalGetMutableSeenEndingMap().clear();
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CoopChapterOuterClass.internal_static_CoopChapter_descriptor;
            }
            
            @Override
            public CoopChapter getDefaultInstanceForType() {
                return CoopChapter.getDefaultInstance();
            }
            
            @Override
            public CoopChapter build() {
                final CoopChapter result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CoopChapter buildPartial() {
                final CoopChapter result = new CoopChapter(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.coopCgListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.coopCgList_ = Collections.unmodifiableList((List<? extends CoopCgOuterClass.CoopCg>)this.coopCgList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.coopCgList_ = this.coopCgList_;
                }
                else {
                    result.coopCgList_ = this.coopCgListBuilder_.build();
                }
                result.id_ = this.id_;
                if (this.coopPointListBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) != 0x0) {
                        this.coopPointList_ = Collections.unmodifiableList((List<? extends CoopPointOuterClass.CoopPoint>)this.coopPointList_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.coopPointList_ = this.coopPointList_;
                }
                else {
                    result.coopPointList_ = this.coopPointListBuilder_.build();
                }
                if ((this.bitField0_ & 0x4) != 0x0) {
                    this.finishDialogList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                result.finishDialogList_ = this.finishDialogList_;
                result.finishedEndCount_ = this.finishedEndCount_;
                result.totalEndCount_ = this.totalEndCount_;
                if (this.coopRewardListBuilder_ == null) {
                    if ((this.bitField0_ & 0x8) != 0x0) {
                        this.coopRewardList_ = Collections.unmodifiableList((List<? extends CoopRewardOuterClass.CoopReward>)this.coopRewardList_);
                        this.bitField0_ &= 0xFFFFFFF7;
                    }
                    result.coopRewardList_ = this.coopRewardList_;
                }
                else {
                    result.coopRewardList_ = this.coopRewardListBuilder_.build();
                }
                if ((this.bitField0_ & 0x10) != 0x0) {
                    this.lockReasonList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFEF;
                }
                result.lockReasonList_ = this.lockReasonList_;
                result.state_ = this.state_;
                (result.seenEndingMap_ = this.internalGetSeenEndingMap()).makeImmutable();
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
                if (other instanceof CoopChapter) {
                    return this.mergeFrom((CoopChapter)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CoopChapter other) {
                if (other == CoopChapter.getDefaultInstance()) {
                    return this;
                }
                if (this.coopCgListBuilder_ == null) {
                    if (!other.coopCgList_.isEmpty()) {
                        if (this.coopCgList_.isEmpty()) {
                            this.coopCgList_ = other.coopCgList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureCoopCgListIsMutable();
                            this.coopCgList_.addAll(other.coopCgList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.coopCgList_.isEmpty()) {
                    if (this.coopCgListBuilder_.isEmpty()) {
                        this.coopCgListBuilder_.dispose();
                        this.coopCgListBuilder_ = null;
                        this.coopCgList_ = other.coopCgList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.coopCgListBuilder_ = (CoopChapter.alwaysUseFieldBuilders ? this.getCoopCgListFieldBuilder() : null);
                    }
                    else {
                        this.coopCgListBuilder_.addAllMessages(other.coopCgList_);
                    }
                }
                if (other.getId() != 0) {
                    this.setId(other.getId());
                }
                if (this.coopPointListBuilder_ == null) {
                    if (!other.coopPointList_.isEmpty()) {
                        if (this.coopPointList_.isEmpty()) {
                            this.coopPointList_ = other.coopPointList_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        }
                        else {
                            this.ensureCoopPointListIsMutable();
                            this.coopPointList_.addAll(other.coopPointList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.coopPointList_.isEmpty()) {
                    if (this.coopPointListBuilder_.isEmpty()) {
                        this.coopPointListBuilder_.dispose();
                        this.coopPointListBuilder_ = null;
                        this.coopPointList_ = other.coopPointList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.coopPointListBuilder_ = (CoopChapter.alwaysUseFieldBuilders ? this.getCoopPointListFieldBuilder() : null);
                    }
                    else {
                        this.coopPointListBuilder_.addAllMessages(other.coopPointList_);
                    }
                }
                if (!other.finishDialogList_.isEmpty()) {
                    if (this.finishDialogList_.isEmpty()) {
                        this.finishDialogList_ = other.finishDialogList_;
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    else {
                        this.ensureFinishDialogListIsMutable();
                        this.finishDialogList_.addAll(other.finishDialogList_);
                    }
                    this.onChanged();
                }
                if (other.getFinishedEndCount() != 0) {
                    this.setFinishedEndCount(other.getFinishedEndCount());
                }
                if (other.getTotalEndCount() != 0) {
                    this.setTotalEndCount(other.getTotalEndCount());
                }
                if (this.coopRewardListBuilder_ == null) {
                    if (!other.coopRewardList_.isEmpty()) {
                        if (this.coopRewardList_.isEmpty()) {
                            this.coopRewardList_ = other.coopRewardList_;
                            this.bitField0_ &= 0xFFFFFFF7;
                        }
                        else {
                            this.ensureCoopRewardListIsMutable();
                            this.coopRewardList_.addAll(other.coopRewardList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.coopRewardList_.isEmpty()) {
                    if (this.coopRewardListBuilder_.isEmpty()) {
                        this.coopRewardListBuilder_.dispose();
                        this.coopRewardListBuilder_ = null;
                        this.coopRewardList_ = other.coopRewardList_;
                        this.bitField0_ &= 0xFFFFFFF7;
                        this.coopRewardListBuilder_ = (CoopChapter.alwaysUseFieldBuilders ? this.getCoopRewardListFieldBuilder() : null);
                    }
                    else {
                        this.coopRewardListBuilder_.addAllMessages(other.coopRewardList_);
                    }
                }
                if (!other.lockReasonList_.isEmpty()) {
                    if (this.lockReasonList_.isEmpty()) {
                        this.lockReasonList_ = other.lockReasonList_;
                        this.bitField0_ &= 0xFFFFFFEF;
                    }
                    else {
                        this.ensureLockReasonListIsMutable();
                        this.lockReasonList_.addAll(other.lockReasonList_);
                    }
                    this.onChanged();
                }
                if (other.state_ != 0) {
                    this.setStateValue(other.getStateValue());
                }
                this.internalGetMutableSeenEndingMap().mergeFrom(other.internalGetSeenEndingMap());
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
                CoopChapter parsedMessage = null;
                try {
                    parsedMessage = CoopChapter.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CoopChapter)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureCoopCgListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.coopCgList_ = new ArrayList<CoopCgOuterClass.CoopCg>(this.coopCgList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<CoopCgOuterClass.CoopCg> getCoopCgListList() {
                if (this.coopCgListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends CoopCgOuterClass.CoopCg>)this.coopCgList_);
                }
                return this.coopCgListBuilder_.getMessageList();
            }
            
            @Override
            public int getCoopCgListCount() {
                if (this.coopCgListBuilder_ == null) {
                    return this.coopCgList_.size();
                }
                return this.coopCgListBuilder_.getCount();
            }
            
            @Override
            public CoopCgOuterClass.CoopCg getCoopCgList(final int index) {
                if (this.coopCgListBuilder_ == null) {
                    return this.coopCgList_.get(index);
                }
                return this.coopCgListBuilder_.getMessage(index);
            }
            
            public Builder setCoopCgList(final int index, final CoopCgOuterClass.CoopCg value) {
                if (this.coopCgListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureCoopCgListIsMutable();
                    this.coopCgList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.coopCgListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setCoopCgList(final int index, final CoopCgOuterClass.CoopCg.Builder builderForValue) {
                if (this.coopCgListBuilder_ == null) {
                    this.ensureCoopCgListIsMutable();
                    this.coopCgList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.coopCgListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addCoopCgList(final CoopCgOuterClass.CoopCg value) {
                if (this.coopCgListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureCoopCgListIsMutable();
                    this.coopCgList_.add(value);
                    this.onChanged();
                }
                else {
                    this.coopCgListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addCoopCgList(final int index, final CoopCgOuterClass.CoopCg value) {
                if (this.coopCgListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureCoopCgListIsMutable();
                    this.coopCgList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.coopCgListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addCoopCgList(final CoopCgOuterClass.CoopCg.Builder builderForValue) {
                if (this.coopCgListBuilder_ == null) {
                    this.ensureCoopCgListIsMutable();
                    this.coopCgList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.coopCgListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addCoopCgList(final int index, final CoopCgOuterClass.CoopCg.Builder builderForValue) {
                if (this.coopCgListBuilder_ == null) {
                    this.ensureCoopCgListIsMutable();
                    this.coopCgList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.coopCgListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllCoopCgList(final Iterable<? extends CoopCgOuterClass.CoopCg> values) {
                if (this.coopCgListBuilder_ == null) {
                    this.ensureCoopCgListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.coopCgList_);
                    this.onChanged();
                }
                else {
                    this.coopCgListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearCoopCgList() {
                if (this.coopCgListBuilder_ == null) {
                    this.coopCgList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.coopCgListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeCoopCgList(final int index) {
                if (this.coopCgListBuilder_ == null) {
                    this.ensureCoopCgListIsMutable();
                    this.coopCgList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.coopCgListBuilder_.remove(index);
                }
                return this;
            }
            
            public CoopCgOuterClass.CoopCg.Builder getCoopCgListBuilder(final int index) {
                return this.getCoopCgListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public CoopCgOuterClass.CoopCgOrBuilder getCoopCgListOrBuilder(final int index) {
                if (this.coopCgListBuilder_ == null) {
                    return this.coopCgList_.get(index);
                }
                return this.coopCgListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends CoopCgOuterClass.CoopCgOrBuilder> getCoopCgListOrBuilderList() {
                if (this.coopCgListBuilder_ != null) {
                    return this.coopCgListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends CoopCgOuterClass.CoopCgOrBuilder>)this.coopCgList_);
            }
            
            public CoopCgOuterClass.CoopCg.Builder addCoopCgListBuilder() {
                return this.getCoopCgListFieldBuilder().addBuilder(CoopCgOuterClass.CoopCg.getDefaultInstance());
            }
            
            public CoopCgOuterClass.CoopCg.Builder addCoopCgListBuilder(final int index) {
                return this.getCoopCgListFieldBuilder().addBuilder(index, CoopCgOuterClass.CoopCg.getDefaultInstance());
            }
            
            public List<CoopCgOuterClass.CoopCg.Builder> getCoopCgListBuilderList() {
                return this.getCoopCgListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<CoopCgOuterClass.CoopCg, CoopCgOuterClass.CoopCg.Builder, CoopCgOuterClass.CoopCgOrBuilder> getCoopCgListFieldBuilder() {
                if (this.coopCgListBuilder_ == null) {
                    this.coopCgListBuilder_ = new RepeatedFieldBuilderV3<CoopCgOuterClass.CoopCg, CoopCgOuterClass.CoopCg.Builder, CoopCgOuterClass.CoopCgOrBuilder>(this.coopCgList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.coopCgList_ = null;
                }
                return this.coopCgListBuilder_;
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
            
            private void ensureCoopPointListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.coopPointList_ = new ArrayList<CoopPointOuterClass.CoopPoint>(this.coopPointList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<CoopPointOuterClass.CoopPoint> getCoopPointListList() {
                if (this.coopPointListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends CoopPointOuterClass.CoopPoint>)this.coopPointList_);
                }
                return this.coopPointListBuilder_.getMessageList();
            }
            
            @Override
            public int getCoopPointListCount() {
                if (this.coopPointListBuilder_ == null) {
                    return this.coopPointList_.size();
                }
                return this.coopPointListBuilder_.getCount();
            }
            
            @Override
            public CoopPointOuterClass.CoopPoint getCoopPointList(final int index) {
                if (this.coopPointListBuilder_ == null) {
                    return this.coopPointList_.get(index);
                }
                return this.coopPointListBuilder_.getMessage(index);
            }
            
            public Builder setCoopPointList(final int index, final CoopPointOuterClass.CoopPoint value) {
                if (this.coopPointListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureCoopPointListIsMutable();
                    this.coopPointList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.coopPointListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setCoopPointList(final int index, final CoopPointOuterClass.CoopPoint.Builder builderForValue) {
                if (this.coopPointListBuilder_ == null) {
                    this.ensureCoopPointListIsMutable();
                    this.coopPointList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.coopPointListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addCoopPointList(final CoopPointOuterClass.CoopPoint value) {
                if (this.coopPointListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureCoopPointListIsMutable();
                    this.coopPointList_.add(value);
                    this.onChanged();
                }
                else {
                    this.coopPointListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addCoopPointList(final int index, final CoopPointOuterClass.CoopPoint value) {
                if (this.coopPointListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureCoopPointListIsMutable();
                    this.coopPointList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.coopPointListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addCoopPointList(final CoopPointOuterClass.CoopPoint.Builder builderForValue) {
                if (this.coopPointListBuilder_ == null) {
                    this.ensureCoopPointListIsMutable();
                    this.coopPointList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.coopPointListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addCoopPointList(final int index, final CoopPointOuterClass.CoopPoint.Builder builderForValue) {
                if (this.coopPointListBuilder_ == null) {
                    this.ensureCoopPointListIsMutable();
                    this.coopPointList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.coopPointListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllCoopPointList(final Iterable<? extends CoopPointOuterClass.CoopPoint> values) {
                if (this.coopPointListBuilder_ == null) {
                    this.ensureCoopPointListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.coopPointList_);
                    this.onChanged();
                }
                else {
                    this.coopPointListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearCoopPointList() {
                if (this.coopPointListBuilder_ == null) {
                    this.coopPointList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    this.onChanged();
                }
                else {
                    this.coopPointListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeCoopPointList(final int index) {
                if (this.coopPointListBuilder_ == null) {
                    this.ensureCoopPointListIsMutable();
                    this.coopPointList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.coopPointListBuilder_.remove(index);
                }
                return this;
            }
            
            public CoopPointOuterClass.CoopPoint.Builder getCoopPointListBuilder(final int index) {
                return this.getCoopPointListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public CoopPointOuterClass.CoopPointOrBuilder getCoopPointListOrBuilder(final int index) {
                if (this.coopPointListBuilder_ == null) {
                    return this.coopPointList_.get(index);
                }
                return this.coopPointListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends CoopPointOuterClass.CoopPointOrBuilder> getCoopPointListOrBuilderList() {
                if (this.coopPointListBuilder_ != null) {
                    return this.coopPointListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends CoopPointOuterClass.CoopPointOrBuilder>)this.coopPointList_);
            }
            
            public CoopPointOuterClass.CoopPoint.Builder addCoopPointListBuilder() {
                return this.getCoopPointListFieldBuilder().addBuilder(CoopPointOuterClass.CoopPoint.getDefaultInstance());
            }
            
            public CoopPointOuterClass.CoopPoint.Builder addCoopPointListBuilder(final int index) {
                return this.getCoopPointListFieldBuilder().addBuilder(index, CoopPointOuterClass.CoopPoint.getDefaultInstance());
            }
            
            public List<CoopPointOuterClass.CoopPoint.Builder> getCoopPointListBuilderList() {
                return this.getCoopPointListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<CoopPointOuterClass.CoopPoint, CoopPointOuterClass.CoopPoint.Builder, CoopPointOuterClass.CoopPointOrBuilder> getCoopPointListFieldBuilder() {
                if (this.coopPointListBuilder_ == null) {
                    this.coopPointListBuilder_ = new RepeatedFieldBuilderV3<CoopPointOuterClass.CoopPoint, CoopPointOuterClass.CoopPoint.Builder, CoopPointOuterClass.CoopPointOrBuilder>(this.coopPointList_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
                    this.coopPointList_ = null;
                }
                return this.coopPointListBuilder_;
            }
            
            private void ensureFinishDialogListIsMutable() {
                if ((this.bitField0_ & 0x4) == 0x0) {
                    this.finishDialogList_ = GeneratedMessageV3.mutableCopy(this.finishDialogList_);
                    this.bitField0_ |= 0x4;
                }
            }
            
            @Override
            public List<Integer> getFinishDialogListList() {
                return ((this.bitField0_ & 0x4) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.finishDialogList_) : this.finishDialogList_;
            }
            
            @Override
            public int getFinishDialogListCount() {
                return this.finishDialogList_.size();
            }
            
            @Override
            public int getFinishDialogList(final int index) {
                return this.finishDialogList_.getInt(index);
            }
            
            public Builder setFinishDialogList(final int index, final int value) {
                this.ensureFinishDialogListIsMutable();
                this.finishDialogList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addFinishDialogList(final int value) {
                this.ensureFinishDialogListIsMutable();
                this.finishDialogList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllFinishDialogList(final Iterable<? extends Integer> values) {
                this.ensureFinishDialogListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.finishDialogList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearFinishDialogList() {
                this.finishDialogList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFB;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getFinishedEndCount() {
                return this.finishedEndCount_;
            }
            
            public Builder setFinishedEndCount(final int value) {
                this.finishedEndCount_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFinishedEndCount() {
                this.finishedEndCount_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getTotalEndCount() {
                return this.totalEndCount_;
            }
            
            public Builder setTotalEndCount(final int value) {
                this.totalEndCount_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTotalEndCount() {
                this.totalEndCount_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureCoopRewardListIsMutable() {
                if ((this.bitField0_ & 0x8) == 0x0) {
                    this.coopRewardList_ = new ArrayList<CoopRewardOuterClass.CoopReward>(this.coopRewardList_);
                    this.bitField0_ |= 0x8;
                }
            }
            
            @Override
            public List<CoopRewardOuterClass.CoopReward> getCoopRewardListList() {
                if (this.coopRewardListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends CoopRewardOuterClass.CoopReward>)this.coopRewardList_);
                }
                return this.coopRewardListBuilder_.getMessageList();
            }
            
            @Override
            public int getCoopRewardListCount() {
                if (this.coopRewardListBuilder_ == null) {
                    return this.coopRewardList_.size();
                }
                return this.coopRewardListBuilder_.getCount();
            }
            
            @Override
            public CoopRewardOuterClass.CoopReward getCoopRewardList(final int index) {
                if (this.coopRewardListBuilder_ == null) {
                    return this.coopRewardList_.get(index);
                }
                return this.coopRewardListBuilder_.getMessage(index);
            }
            
            public Builder setCoopRewardList(final int index, final CoopRewardOuterClass.CoopReward value) {
                if (this.coopRewardListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureCoopRewardListIsMutable();
                    this.coopRewardList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.coopRewardListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setCoopRewardList(final int index, final CoopRewardOuterClass.CoopReward.Builder builderForValue) {
                if (this.coopRewardListBuilder_ == null) {
                    this.ensureCoopRewardListIsMutable();
                    this.coopRewardList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.coopRewardListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addCoopRewardList(final CoopRewardOuterClass.CoopReward value) {
                if (this.coopRewardListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureCoopRewardListIsMutable();
                    this.coopRewardList_.add(value);
                    this.onChanged();
                }
                else {
                    this.coopRewardListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addCoopRewardList(final int index, final CoopRewardOuterClass.CoopReward value) {
                if (this.coopRewardListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureCoopRewardListIsMutable();
                    this.coopRewardList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.coopRewardListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addCoopRewardList(final CoopRewardOuterClass.CoopReward.Builder builderForValue) {
                if (this.coopRewardListBuilder_ == null) {
                    this.ensureCoopRewardListIsMutable();
                    this.coopRewardList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.coopRewardListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addCoopRewardList(final int index, final CoopRewardOuterClass.CoopReward.Builder builderForValue) {
                if (this.coopRewardListBuilder_ == null) {
                    this.ensureCoopRewardListIsMutable();
                    this.coopRewardList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.coopRewardListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllCoopRewardList(final Iterable<? extends CoopRewardOuterClass.CoopReward> values) {
                if (this.coopRewardListBuilder_ == null) {
                    this.ensureCoopRewardListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.coopRewardList_);
                    this.onChanged();
                }
                else {
                    this.coopRewardListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearCoopRewardList() {
                if (this.coopRewardListBuilder_ == null) {
                    this.coopRewardList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFF7;
                    this.onChanged();
                }
                else {
                    this.coopRewardListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeCoopRewardList(final int index) {
                if (this.coopRewardListBuilder_ == null) {
                    this.ensureCoopRewardListIsMutable();
                    this.coopRewardList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.coopRewardListBuilder_.remove(index);
                }
                return this;
            }
            
            public CoopRewardOuterClass.CoopReward.Builder getCoopRewardListBuilder(final int index) {
                return this.getCoopRewardListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public CoopRewardOuterClass.CoopRewardOrBuilder getCoopRewardListOrBuilder(final int index) {
                if (this.coopRewardListBuilder_ == null) {
                    return this.coopRewardList_.get(index);
                }
                return this.coopRewardListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends CoopRewardOuterClass.CoopRewardOrBuilder> getCoopRewardListOrBuilderList() {
                if (this.coopRewardListBuilder_ != null) {
                    return this.coopRewardListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends CoopRewardOuterClass.CoopRewardOrBuilder>)this.coopRewardList_);
            }
            
            public CoopRewardOuterClass.CoopReward.Builder addCoopRewardListBuilder() {
                return this.getCoopRewardListFieldBuilder().addBuilder(CoopRewardOuterClass.CoopReward.getDefaultInstance());
            }
            
            public CoopRewardOuterClass.CoopReward.Builder addCoopRewardListBuilder(final int index) {
                return this.getCoopRewardListFieldBuilder().addBuilder(index, CoopRewardOuterClass.CoopReward.getDefaultInstance());
            }
            
            public List<CoopRewardOuterClass.CoopReward.Builder> getCoopRewardListBuilderList() {
                return this.getCoopRewardListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<CoopRewardOuterClass.CoopReward, CoopRewardOuterClass.CoopReward.Builder, CoopRewardOuterClass.CoopRewardOrBuilder> getCoopRewardListFieldBuilder() {
                if (this.coopRewardListBuilder_ == null) {
                    this.coopRewardListBuilder_ = new RepeatedFieldBuilderV3<CoopRewardOuterClass.CoopReward, CoopRewardOuterClass.CoopReward.Builder, CoopRewardOuterClass.CoopRewardOrBuilder>(this.coopRewardList_, (this.bitField0_ & 0x8) != 0x0, this.getParentForChildren(), this.isClean());
                    this.coopRewardList_ = null;
                }
                return this.coopRewardListBuilder_;
            }
            
            private void ensureLockReasonListIsMutable() {
                if ((this.bitField0_ & 0x10) == 0x0) {
                    this.lockReasonList_ = GeneratedMessageV3.mutableCopy(this.lockReasonList_);
                    this.bitField0_ |= 0x10;
                }
            }
            
            @Override
            public List<Integer> getLockReasonListList() {
                return ((this.bitField0_ & 0x10) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.lockReasonList_) : this.lockReasonList_;
            }
            
            @Override
            public int getLockReasonListCount() {
                return this.lockReasonList_.size();
            }
            
            @Override
            public int getLockReasonList(final int index) {
                return this.lockReasonList_.getInt(index);
            }
            
            public Builder setLockReasonList(final int index, final int value) {
                this.ensureLockReasonListIsMutable();
                this.lockReasonList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addLockReasonList(final int value) {
                this.ensureLockReasonListIsMutable();
                this.lockReasonList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllLockReasonList(final Iterable<? extends Integer> values) {
                this.ensureLockReasonListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.lockReasonList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearLockReasonList() {
                this.lockReasonList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFEF;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getStateValue() {
                return this.state_;
            }
            
            public Builder setStateValue(final int value) {
                this.state_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public State getState() {
                final State result = State.valueOf(this.state_);
                return (result == null) ? State.UNRECOGNIZED : result;
            }
            
            public Builder setState(final State value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.state_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearState() {
                this.state_ = 0;
                this.onChanged();
                return this;
            }
            
            private MapField<Integer, Integer> internalGetSeenEndingMap() {
                if (this.seenEndingMap_ == null) {
                    return MapField.emptyMapField(SeenEndingMapDefaultEntryHolder.defaultEntry);
                }
                return this.seenEndingMap_;
            }
            
            private MapField<Integer, Integer> internalGetMutableSeenEndingMap() {
                this.onChanged();
                if (this.seenEndingMap_ == null) {
                    this.seenEndingMap_ = MapField.newMapField(SeenEndingMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.seenEndingMap_.isMutable()) {
                    this.seenEndingMap_ = this.seenEndingMap_.copy();
                }
                return this.seenEndingMap_;
            }
            
            @Override
            public int getSeenEndingMapCount() {
                return this.internalGetSeenEndingMap().getMap().size();
            }
            
            @Override
            public boolean containsSeenEndingMap(final int key) {
                return this.internalGetSeenEndingMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Integer> getSeenEndingMap() {
                return this.getSeenEndingMapMap();
            }
            
            @Override
            public Map<Integer, Integer> getSeenEndingMapMap() {
                return this.internalGetSeenEndingMap().getMap();
            }
            
            @Override
            public int getSeenEndingMapOrDefault(final int key, final int defaultValue) {
                final Map<Integer, Integer> map = this.internalGetSeenEndingMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public int getSeenEndingMapOrThrow(final int key) {
                final Map<Integer, Integer> map = this.internalGetSeenEndingMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearSeenEndingMap() {
                this.internalGetMutableSeenEndingMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeSeenEndingMap(final int key) {
                this.internalGetMutableSeenEndingMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, Integer> getMutableSeenEndingMap() {
                return this.internalGetMutableSeenEndingMap().getMutableMap();
            }
            
            public Builder putSeenEndingMap(final int key, final int value) {
                this.internalGetMutableSeenEndingMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllSeenEndingMap(final Map<Integer, Integer> values) {
                this.internalGetMutableSeenEndingMap().getMutableMap().putAll(values);
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
    
    public interface CoopChapterOrBuilder extends MessageOrBuilder
    {
        List<CoopCgOuterClass.CoopCg> getCoopCgListList();
        
        CoopCgOuterClass.CoopCg getCoopCgList(final int p0);
        
        int getCoopCgListCount();
        
        List<? extends CoopCgOuterClass.CoopCgOrBuilder> getCoopCgListOrBuilderList();
        
        CoopCgOuterClass.CoopCgOrBuilder getCoopCgListOrBuilder(final int p0);
        
        int getId();
        
        List<CoopPointOuterClass.CoopPoint> getCoopPointListList();
        
        CoopPointOuterClass.CoopPoint getCoopPointList(final int p0);
        
        int getCoopPointListCount();
        
        List<? extends CoopPointOuterClass.CoopPointOrBuilder> getCoopPointListOrBuilderList();
        
        CoopPointOuterClass.CoopPointOrBuilder getCoopPointListOrBuilder(final int p0);
        
        List<Integer> getFinishDialogListList();
        
        int getFinishDialogListCount();
        
        int getFinishDialogList(final int p0);
        
        int getFinishedEndCount();
        
        int getTotalEndCount();
        
        List<CoopRewardOuterClass.CoopReward> getCoopRewardListList();
        
        CoopRewardOuterClass.CoopReward getCoopRewardList(final int p0);
        
        int getCoopRewardListCount();
        
        List<? extends CoopRewardOuterClass.CoopRewardOrBuilder> getCoopRewardListOrBuilderList();
        
        CoopRewardOuterClass.CoopRewardOrBuilder getCoopRewardListOrBuilder(final int p0);
        
        List<Integer> getLockReasonListList();
        
        int getLockReasonListCount();
        
        int getLockReasonList(final int p0);
        
        int getStateValue();
        
        CoopChapter.State getState();
        
        int getSeenEndingMapCount();
        
        boolean containsSeenEndingMap(final int p0);
        
        @Deprecated
        Map<Integer, Integer> getSeenEndingMap();
        
        Map<Integer, Integer> getSeenEndingMapMap();
        
        int getSeenEndingMapOrDefault(final int p0, final int p1);
        
        int getSeenEndingMapOrThrow(final int p0);
    }
}
