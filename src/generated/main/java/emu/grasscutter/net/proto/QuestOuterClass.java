// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.WireFormat;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import java.util.Iterator;
import com.google.protobuf.CodedOutputStream;
import java.util.Map;
import java.util.List;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MapEntry;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.MapField;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class QuestOuterClass
{
    private static final Descriptors.Descriptor internal_static_Quest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Quest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_Quest_LackedNpcMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Quest_LackedNpcMapEntry_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_Quest_LackedPlaceMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Quest_LackedPlaceMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private QuestOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return QuestOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u000bQuest.proto\"\u00f1\u0003\n\u0005Quest\u0012\u0010\n\bquest_id\u0018\u0001 \u0001(\r\u0012\r\n\u0005state\u0018\u0002 \u0001(\r\u0012\u0012\n\nstart_time\u0018\u0004 \u0001(\r\u0012\u0011\n\tis_random\u0018\u0005 \u0001(\b\u0012\u0017\n\u000fparent_quest_id\u0018\u0006 \u0001(\r\u0012\u0017\n\u000fquest_config_id\u0018\u0007 \u0001(\r\u0012\u0017\n\u000fstart_game_time\u0018\b \u0001(\r\u0012\u0013\n\u000baccept_time\u0018\t \u0001(\r\u0012\u0017\n\u000flacked_npc_list\u0018\n \u0003(\r\u0012\u001c\n\u0014finish_progress_list\u0018\u000b \u0003(\r\u0012\u001a\n\u0012fail_progress_list\u0018\f \u0003(\r\u00120\n\u000elacked_npc_map\u0018\r \u0003(\u000b2\u0018.Quest.LackedNpcMapEntry\u0012\u0019\n\u0011lacked_place_list\u0018\u000e \u0003(\r\u00124\n\u0010lacked_place_map\u0018\u000f \u0003(\u000b2\u001a.Quest.LackedPlaceMapEntry\u001a3\n\u0011LackedNpcMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001\u001a5\n\u0013LackedPlaceMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        QuestOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_Quest_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_Quest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(QuestOuterClass.internal_static_Quest_descriptor, new String[] { "QuestId", "State", "StartTime", "IsRandom", "ParentQuestId", "QuestConfigId", "StartGameTime", "AcceptTime", "LackedNpcList", "FinishProgressList", "FailProgressList", "LackedNpcMap", "LackedPlaceList", "LackedPlaceMap" });
        internal_static_Quest_LackedNpcMapEntry_descriptor = QuestOuterClass.internal_static_Quest_descriptor.getNestedTypes().get(0);
        internal_static_Quest_LackedNpcMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(QuestOuterClass.internal_static_Quest_LackedNpcMapEntry_descriptor, new String[] { "Key", "Value" });
        internal_static_Quest_LackedPlaceMapEntry_descriptor = QuestOuterClass.internal_static_Quest_descriptor.getNestedTypes().get(1);
        internal_static_Quest_LackedPlaceMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(QuestOuterClass.internal_static_Quest_LackedPlaceMapEntry_descriptor, new String[] { "Key", "Value" });
    }
    
    public static final class Quest extends GeneratedMessageV3 implements QuestOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int QUEST_ID_FIELD_NUMBER = 1;
        private int questId_;
        public static final int STATE_FIELD_NUMBER = 2;
        private int state_;
        public static final int START_TIME_FIELD_NUMBER = 4;
        private int startTime_;
        public static final int IS_RANDOM_FIELD_NUMBER = 5;
        private boolean isRandom_;
        public static final int PARENT_QUEST_ID_FIELD_NUMBER = 6;
        private int parentQuestId_;
        public static final int QUEST_CONFIG_ID_FIELD_NUMBER = 7;
        private int questConfigId_;
        public static final int START_GAME_TIME_FIELD_NUMBER = 8;
        private int startGameTime_;
        public static final int ACCEPT_TIME_FIELD_NUMBER = 9;
        private int acceptTime_;
        public static final int LACKED_NPC_LIST_FIELD_NUMBER = 10;
        private Internal.IntList lackedNpcList_;
        private int lackedNpcListMemoizedSerializedSize;
        public static final int FINISH_PROGRESS_LIST_FIELD_NUMBER = 11;
        private Internal.IntList finishProgressList_;
        private int finishProgressListMemoizedSerializedSize;
        public static final int FAIL_PROGRESS_LIST_FIELD_NUMBER = 12;
        private Internal.IntList failProgressList_;
        private int failProgressListMemoizedSerializedSize;
        public static final int LACKED_NPC_MAP_FIELD_NUMBER = 13;
        private MapField<Integer, Integer> lackedNpcMap_;
        public static final int LACKED_PLACE_LIST_FIELD_NUMBER = 14;
        private Internal.IntList lackedPlaceList_;
        private int lackedPlaceListMemoizedSerializedSize;
        public static final int LACKED_PLACE_MAP_FIELD_NUMBER = 15;
        private MapField<Integer, Integer> lackedPlaceMap_;
        private byte memoizedIsInitialized;
        private static final Quest DEFAULT_INSTANCE;
        private static final Parser<Quest> PARSER;
        
        private Quest(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.lackedNpcListMemoizedSerializedSize = -1;
            this.finishProgressListMemoizedSerializedSize = -1;
            this.failProgressListMemoizedSerializedSize = -1;
            this.lackedPlaceListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private Quest() {
            this.lackedNpcListMemoizedSerializedSize = -1;
            this.finishProgressListMemoizedSerializedSize = -1;
            this.failProgressListMemoizedSerializedSize = -1;
            this.lackedPlaceListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.lackedNpcList_ = GeneratedMessageV3.emptyIntList();
            this.finishProgressList_ = GeneratedMessageV3.emptyIntList();
            this.failProgressList_ = GeneratedMessageV3.emptyIntList();
            this.lackedPlaceList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new Quest();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private Quest(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.questId_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.state_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.startTime_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.isRandom_ = input.readBool();
                            continue;
                        }
                        case 48: {
                            this.parentQuestId_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            this.questConfigId_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.startGameTime_ = input.readUInt32();
                            continue;
                        }
                        case 72: {
                            this.acceptTime_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.lackedNpcList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.lackedNpcList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 82: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.lackedNpcList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.lackedNpcList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 88: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.finishProgressList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.finishProgressList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 90: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.finishProgressList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.finishProgressList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 96: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.failProgressList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.failProgressList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 98: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x4) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.failProgressList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x4;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.failProgressList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 106: {
                            if ((mutable_bitField0_ & 0x8) == 0x0) {
                                this.lackedNpcMap_ = MapField.newMapField(LackedNpcMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x8;
                            }
                            final MapEntry<Integer, Integer> lackedNpcMap__ = input.readMessage(LackedNpcMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.lackedNpcMap_.getMutableMap().put(lackedNpcMap__.getKey(), lackedNpcMap__.getValue());
                            continue;
                        }
                        case 112: {
                            if ((mutable_bitField0_ & 0x10) == 0x0) {
                                this.lackedPlaceList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x10;
                            }
                            this.lackedPlaceList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 114: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x10) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.lackedPlaceList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x10;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.lackedPlaceList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 122: {
                            if ((mutable_bitField0_ & 0x20) == 0x0) {
                                this.lackedPlaceMap_ = MapField.newMapField(LackedPlaceMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x20;
                            }
                            final MapEntry<Integer, Integer> lackedPlaceMap__ = input.readMessage(LackedPlaceMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.lackedPlaceMap_.getMutableMap().put(lackedPlaceMap__.getKey(), lackedPlaceMap__.getValue());
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
                    this.lackedNpcList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.finishProgressList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x4) != 0x0) {
                    this.failProgressList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x10) != 0x0) {
                    this.lackedPlaceList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return QuestOuterClass.internal_static_Quest_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 13: {
                    return this.internalGetLackedNpcMap();
                }
                case 15: {
                    return this.internalGetLackedPlaceMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return QuestOuterClass.internal_static_Quest_fieldAccessorTable.ensureFieldAccessorsInitialized(Quest.class, Builder.class);
        }
        
        @Override
        public int getQuestId() {
            return this.questId_;
        }
        
        @Override
        public int getState() {
            return this.state_;
        }
        
        @Override
        public int getStartTime() {
            return this.startTime_;
        }
        
        @Override
        public boolean getIsRandom() {
            return this.isRandom_;
        }
        
        @Override
        public int getParentQuestId() {
            return this.parentQuestId_;
        }
        
        @Override
        public int getQuestConfigId() {
            return this.questConfigId_;
        }
        
        @Override
        public int getStartGameTime() {
            return this.startGameTime_;
        }
        
        @Override
        public int getAcceptTime() {
            return this.acceptTime_;
        }
        
        @Override
        public List<Integer> getLackedNpcListList() {
            return this.lackedNpcList_;
        }
        
        @Override
        public int getLackedNpcListCount() {
            return this.lackedNpcList_.size();
        }
        
        @Override
        public int getLackedNpcList(final int index) {
            return this.lackedNpcList_.getInt(index);
        }
        
        @Override
        public List<Integer> getFinishProgressListList() {
            return this.finishProgressList_;
        }
        
        @Override
        public int getFinishProgressListCount() {
            return this.finishProgressList_.size();
        }
        
        @Override
        public int getFinishProgressList(final int index) {
            return this.finishProgressList_.getInt(index);
        }
        
        @Override
        public List<Integer> getFailProgressListList() {
            return this.failProgressList_;
        }
        
        @Override
        public int getFailProgressListCount() {
            return this.failProgressList_.size();
        }
        
        @Override
        public int getFailProgressList(final int index) {
            return this.failProgressList_.getInt(index);
        }
        
        private MapField<Integer, Integer> internalGetLackedNpcMap() {
            if (this.lackedNpcMap_ == null) {
                return MapField.emptyMapField(LackedNpcMapDefaultEntryHolder.defaultEntry);
            }
            return this.lackedNpcMap_;
        }
        
        @Override
        public int getLackedNpcMapCount() {
            return this.internalGetLackedNpcMap().getMap().size();
        }
        
        @Override
        public boolean containsLackedNpcMap(final int key) {
            return this.internalGetLackedNpcMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, Integer> getLackedNpcMap() {
            return this.getLackedNpcMapMap();
        }
        
        @Override
        public Map<Integer, Integer> getLackedNpcMapMap() {
            return this.internalGetLackedNpcMap().getMap();
        }
        
        @Override
        public int getLackedNpcMapOrDefault(final int key, final int defaultValue) {
            final Map<Integer, Integer> map = this.internalGetLackedNpcMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public int getLackedNpcMapOrThrow(final int key) {
            final Map<Integer, Integer> map = this.internalGetLackedNpcMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public List<Integer> getLackedPlaceListList() {
            return this.lackedPlaceList_;
        }
        
        @Override
        public int getLackedPlaceListCount() {
            return this.lackedPlaceList_.size();
        }
        
        @Override
        public int getLackedPlaceList(final int index) {
            return this.lackedPlaceList_.getInt(index);
        }
        
        private MapField<Integer, Integer> internalGetLackedPlaceMap() {
            if (this.lackedPlaceMap_ == null) {
                return MapField.emptyMapField(LackedPlaceMapDefaultEntryHolder.defaultEntry);
            }
            return this.lackedPlaceMap_;
        }
        
        @Override
        public int getLackedPlaceMapCount() {
            return this.internalGetLackedPlaceMap().getMap().size();
        }
        
        @Override
        public boolean containsLackedPlaceMap(final int key) {
            return this.internalGetLackedPlaceMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, Integer> getLackedPlaceMap() {
            return this.getLackedPlaceMapMap();
        }
        
        @Override
        public Map<Integer, Integer> getLackedPlaceMapMap() {
            return this.internalGetLackedPlaceMap().getMap();
        }
        
        @Override
        public int getLackedPlaceMapOrDefault(final int key, final int defaultValue) {
            final Map<Integer, Integer> map = this.internalGetLackedPlaceMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public int getLackedPlaceMapOrThrow(final int key) {
            final Map<Integer, Integer> map = this.internalGetLackedPlaceMap().getMap();
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
            if (this.questId_ != 0) {
                output.writeUInt32(1, this.questId_);
            }
            if (this.state_ != 0) {
                output.writeUInt32(2, this.state_);
            }
            if (this.startTime_ != 0) {
                output.writeUInt32(4, this.startTime_);
            }
            if (this.isRandom_) {
                output.writeBool(5, this.isRandom_);
            }
            if (this.parentQuestId_ != 0) {
                output.writeUInt32(6, this.parentQuestId_);
            }
            if (this.questConfigId_ != 0) {
                output.writeUInt32(7, this.questConfigId_);
            }
            if (this.startGameTime_ != 0) {
                output.writeUInt32(8, this.startGameTime_);
            }
            if (this.acceptTime_ != 0) {
                output.writeUInt32(9, this.acceptTime_);
            }
            if (this.getLackedNpcListList().size() > 0) {
                output.writeUInt32NoTag(82);
                output.writeUInt32NoTag(this.lackedNpcListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.lackedNpcList_.size(); ++i) {
                output.writeUInt32NoTag(this.lackedNpcList_.getInt(i));
            }
            if (this.getFinishProgressListList().size() > 0) {
                output.writeUInt32NoTag(90);
                output.writeUInt32NoTag(this.finishProgressListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.finishProgressList_.size(); ++i) {
                output.writeUInt32NoTag(this.finishProgressList_.getInt(i));
            }
            if (this.getFailProgressListList().size() > 0) {
                output.writeUInt32NoTag(98);
                output.writeUInt32NoTag(this.failProgressListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.failProgressList_.size(); ++i) {
                output.writeUInt32NoTag(this.failProgressList_.getInt(i));
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetLackedNpcMap(), LackedNpcMapDefaultEntryHolder.defaultEntry, 13);
            if (this.getLackedPlaceListList().size() > 0) {
                output.writeUInt32NoTag(114);
                output.writeUInt32NoTag(this.lackedPlaceListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.lackedPlaceList_.size(); ++i) {
                output.writeUInt32NoTag(this.lackedPlaceList_.getInt(i));
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetLackedPlaceMap(), LackedPlaceMapDefaultEntryHolder.defaultEntry, 15);
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.questId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.questId_);
            }
            if (this.state_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.state_);
            }
            if (this.startTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.startTime_);
            }
            if (this.isRandom_) {
                size += CodedOutputStream.computeBoolSize(5, this.isRandom_);
            }
            if (this.parentQuestId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.parentQuestId_);
            }
            if (this.questConfigId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.questConfigId_);
            }
            if (this.startGameTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.startGameTime_);
            }
            if (this.acceptTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.acceptTime_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.lackedNpcList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.lackedNpcList_.getInt(i));
            }
            size += dataSize;
            if (!this.getLackedNpcListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.lackedNpcListMemoizedSerializedSize = dataSize;
            dataSize = 0;
            for (int i = 0; i < this.finishProgressList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.finishProgressList_.getInt(i));
            }
            size += dataSize;
            if (!this.getFinishProgressListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.finishProgressListMemoizedSerializedSize = dataSize;
            dataSize = 0;
            for (int i = 0; i < this.failProgressList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.failProgressList_.getInt(i));
            }
            size += dataSize;
            if (!this.getFailProgressListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.failProgressListMemoizedSerializedSize = dataSize;
            for (final Map.Entry<Integer, Integer> entry : this.internalGetLackedNpcMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> lackedNpcMap__ = LackedNpcMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(13, lackedNpcMap__);
            }
            dataSize = 0;
            for (int i = 0; i < this.lackedPlaceList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.lackedPlaceList_.getInt(i));
            }
            size += dataSize;
            if (!this.getLackedPlaceListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.lackedPlaceListMemoizedSerializedSize = dataSize;
            for (final Map.Entry<Integer, Integer> entry : this.internalGetLackedPlaceMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> lackedPlaceMap__ = LackedPlaceMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(15, lackedPlaceMap__);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Quest)) {
                return super.equals(obj);
            }
            final Quest other = (Quest)obj;
            return this.getQuestId() == other.getQuestId() && this.getState() == other.getState() && this.getStartTime() == other.getStartTime() && this.getIsRandom() == other.getIsRandom() && this.getParentQuestId() == other.getParentQuestId() && this.getQuestConfigId() == other.getQuestConfigId() && this.getStartGameTime() == other.getStartGameTime() && this.getAcceptTime() == other.getAcceptTime() && this.getLackedNpcListList().equals(other.getLackedNpcListList()) && this.getFinishProgressListList().equals(other.getFinishProgressListList()) && this.getFailProgressListList().equals(other.getFailProgressListList()) && this.internalGetLackedNpcMap().equals(other.internalGetLackedNpcMap()) && this.getLackedPlaceListList().equals(other.getLackedPlaceListList()) && this.internalGetLackedPlaceMap().equals(other.internalGetLackedPlaceMap()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getQuestId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getState();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getStartTime();
            hash = 37 * hash + 5;
            hash = 53 * hash + Internal.hashBoolean(this.getIsRandom());
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getParentQuestId();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getQuestConfigId();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getStartGameTime();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getAcceptTime();
            if (this.getLackedNpcListCount() > 0) {
                hash = 37 * hash + 10;
                hash = 53 * hash + this.getLackedNpcListList().hashCode();
            }
            if (this.getFinishProgressListCount() > 0) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.getFinishProgressListList().hashCode();
            }
            if (this.getFailProgressListCount() > 0) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getFailProgressListList().hashCode();
            }
            if (!this.internalGetLackedNpcMap().getMap().isEmpty()) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.internalGetLackedNpcMap().hashCode();
            }
            if (this.getLackedPlaceListCount() > 0) {
                hash = 37 * hash + 14;
                hash = 53 * hash + this.getLackedPlaceListList().hashCode();
            }
            if (!this.internalGetLackedPlaceMap().getMap().isEmpty()) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.internalGetLackedPlaceMap().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static Quest parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return Quest.PARSER.parseFrom(data);
        }
        
        public static Quest parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Quest.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Quest parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return Quest.PARSER.parseFrom(data);
        }
        
        public static Quest parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Quest.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Quest parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return Quest.PARSER.parseFrom(data);
        }
        
        public static Quest parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Quest.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Quest parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Quest.PARSER, input);
        }
        
        public static Quest parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Quest.PARSER, input, extensionRegistry);
        }
        
        public static Quest parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Quest.PARSER, input);
        }
        
        public static Quest parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Quest.PARSER, input, extensionRegistry);
        }
        
        public static Quest parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Quest.PARSER, input);
        }
        
        public static Quest parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Quest.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return Quest.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final Quest prototype) {
            return Quest.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == Quest.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static Quest getDefaultInstance() {
            return Quest.DEFAULT_INSTANCE;
        }
        
        public static Parser<Quest> parser() {
            return Quest.PARSER;
        }
        
        @Override
        public Parser<Quest> getParserForType() {
            return Quest.PARSER;
        }
        
        @Override
        public Quest getDefaultInstanceForType() {
            return Quest.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new Quest();
            PARSER = new AbstractParser<Quest>() {
                @Override
                public Quest parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new Quest(input, extensionRegistry);
                }
            };
        }
        
        private static final class LackedNpcMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(QuestOuterClass.internal_static_Quest_LackedNpcMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        private static final class LackedPlaceMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(QuestOuterClass.internal_static_Quest_LackedPlaceMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements QuestOrBuilder
        {
            private int bitField0_;
            private int questId_;
            private int state_;
            private int startTime_;
            private boolean isRandom_;
            private int parentQuestId_;
            private int questConfigId_;
            private int startGameTime_;
            private int acceptTime_;
            private Internal.IntList lackedNpcList_;
            private Internal.IntList finishProgressList_;
            private Internal.IntList failProgressList_;
            private MapField<Integer, Integer> lackedNpcMap_;
            private Internal.IntList lackedPlaceList_;
            private MapField<Integer, Integer> lackedPlaceMap_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return QuestOuterClass.internal_static_Quest_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 13: {
                        return this.internalGetLackedNpcMap();
                    }
                    case 15: {
                        return this.internalGetLackedPlaceMap();
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
                        return this.internalGetMutableLackedNpcMap();
                    }
                    case 15: {
                        return this.internalGetMutableLackedPlaceMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return QuestOuterClass.internal_static_Quest_fieldAccessorTable.ensureFieldAccessorsInitialized(Quest.class, Builder.class);
            }
            
            private Builder() {
                this.lackedNpcList_ = GeneratedMessageV3.emptyIntList();
                this.finishProgressList_ = GeneratedMessageV3.emptyIntList();
                this.failProgressList_ = GeneratedMessageV3.emptyIntList();
                this.lackedPlaceList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.lackedNpcList_ = GeneratedMessageV3.emptyIntList();
                this.finishProgressList_ = GeneratedMessageV3.emptyIntList();
                this.failProgressList_ = GeneratedMessageV3.emptyIntList();
                this.lackedPlaceList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (Quest.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.questId_ = 0;
                this.state_ = 0;
                this.startTime_ = 0;
                this.isRandom_ = false;
                this.parentQuestId_ = 0;
                this.questConfigId_ = 0;
                this.startGameTime_ = 0;
                this.acceptTime_ = 0;
                this.lackedNpcList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.finishProgressList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.failProgressList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFB;
                this.internalGetMutableLackedNpcMap().clear();
                this.lackedPlaceList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFEF;
                this.internalGetMutableLackedPlaceMap().clear();
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return QuestOuterClass.internal_static_Quest_descriptor;
            }
            
            @Override
            public Quest getDefaultInstanceForType() {
                return Quest.getDefaultInstance();
            }
            
            @Override
            public Quest build() {
                final Quest result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public Quest buildPartial() {
                final Quest result = new Quest(this);
                final int from_bitField0_ = this.bitField0_;
                result.questId_ = this.questId_;
                result.state_ = this.state_;
                result.startTime_ = this.startTime_;
                result.isRandom_ = this.isRandom_;
                result.parentQuestId_ = this.parentQuestId_;
                result.questConfigId_ = this.questConfigId_;
                result.startGameTime_ = this.startGameTime_;
                result.acceptTime_ = this.acceptTime_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.lackedNpcList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.lackedNpcList_ = this.lackedNpcList_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.finishProgressList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.finishProgressList_ = this.finishProgressList_;
                if ((this.bitField0_ & 0x4) != 0x0) {
                    this.failProgressList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                result.failProgressList_ = this.failProgressList_;
                (result.lackedNpcMap_ = this.internalGetLackedNpcMap()).makeImmutable();
                if ((this.bitField0_ & 0x10) != 0x0) {
                    this.lackedPlaceList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFEF;
                }
                result.lackedPlaceList_ = this.lackedPlaceList_;
                (result.lackedPlaceMap_ = this.internalGetLackedPlaceMap()).makeImmutable();
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
                if (other instanceof Quest) {
                    return this.mergeFrom((Quest)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final Quest other) {
                if (other == Quest.getDefaultInstance()) {
                    return this;
                }
                if (other.getQuestId() != 0) {
                    this.setQuestId(other.getQuestId());
                }
                if (other.getState() != 0) {
                    this.setState(other.getState());
                }
                if (other.getStartTime() != 0) {
                    this.setStartTime(other.getStartTime());
                }
                if (other.getIsRandom()) {
                    this.setIsRandom(other.getIsRandom());
                }
                if (other.getParentQuestId() != 0) {
                    this.setParentQuestId(other.getParentQuestId());
                }
                if (other.getQuestConfigId() != 0) {
                    this.setQuestConfigId(other.getQuestConfigId());
                }
                if (other.getStartGameTime() != 0) {
                    this.setStartGameTime(other.getStartGameTime());
                }
                if (other.getAcceptTime() != 0) {
                    this.setAcceptTime(other.getAcceptTime());
                }
                if (!other.lackedNpcList_.isEmpty()) {
                    if (this.lackedNpcList_.isEmpty()) {
                        this.lackedNpcList_ = other.lackedNpcList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureLackedNpcListIsMutable();
                        this.lackedNpcList_.addAll(other.lackedNpcList_);
                    }
                    this.onChanged();
                }
                if (!other.finishProgressList_.isEmpty()) {
                    if (this.finishProgressList_.isEmpty()) {
                        this.finishProgressList_ = other.finishProgressList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureFinishProgressListIsMutable();
                        this.finishProgressList_.addAll(other.finishProgressList_);
                    }
                    this.onChanged();
                }
                if (!other.failProgressList_.isEmpty()) {
                    if (this.failProgressList_.isEmpty()) {
                        this.failProgressList_ = other.failProgressList_;
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    else {
                        this.ensureFailProgressListIsMutable();
                        this.failProgressList_.addAll(other.failProgressList_);
                    }
                    this.onChanged();
                }
                this.internalGetMutableLackedNpcMap().mergeFrom(other.internalGetLackedNpcMap());
                if (!other.lackedPlaceList_.isEmpty()) {
                    if (this.lackedPlaceList_.isEmpty()) {
                        this.lackedPlaceList_ = other.lackedPlaceList_;
                        this.bitField0_ &= 0xFFFFFFEF;
                    }
                    else {
                        this.ensureLackedPlaceListIsMutable();
                        this.lackedPlaceList_.addAll(other.lackedPlaceList_);
                    }
                    this.onChanged();
                }
                this.internalGetMutableLackedPlaceMap().mergeFrom(other.internalGetLackedPlaceMap());
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
                Quest parsedMessage = null;
                try {
                    parsedMessage = Quest.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (Quest)e.getUnfinishedMessage();
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
            public int getQuestId() {
                return this.questId_;
            }
            
            public Builder setQuestId(final int value) {
                this.questId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearQuestId() {
                this.questId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getState() {
                return this.state_;
            }
            
            public Builder setState(final int value) {
                this.state_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearState() {
                this.state_ = 0;
                this.onChanged();
                return this;
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
            public boolean getIsRandom() {
                return this.isRandom_;
            }
            
            public Builder setIsRandom(final boolean value) {
                this.isRandom_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsRandom() {
                this.isRandom_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getParentQuestId() {
                return this.parentQuestId_;
            }
            
            public Builder setParentQuestId(final int value) {
                this.parentQuestId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearParentQuestId() {
                this.parentQuestId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getQuestConfigId() {
                return this.questConfigId_;
            }
            
            public Builder setQuestConfigId(final int value) {
                this.questConfigId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearQuestConfigId() {
                this.questConfigId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getStartGameTime() {
                return this.startGameTime_;
            }
            
            public Builder setStartGameTime(final int value) {
                this.startGameTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearStartGameTime() {
                this.startGameTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getAcceptTime() {
                return this.acceptTime_;
            }
            
            public Builder setAcceptTime(final int value) {
                this.acceptTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAcceptTime() {
                this.acceptTime_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureLackedNpcListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.lackedNpcList_ = GeneratedMessageV3.mutableCopy(this.lackedNpcList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getLackedNpcListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.lackedNpcList_) : this.lackedNpcList_;
            }
            
            @Override
            public int getLackedNpcListCount() {
                return this.lackedNpcList_.size();
            }
            
            @Override
            public int getLackedNpcList(final int index) {
                return this.lackedNpcList_.getInt(index);
            }
            
            public Builder setLackedNpcList(final int index, final int value) {
                this.ensureLackedNpcListIsMutable();
                this.lackedNpcList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addLackedNpcList(final int value) {
                this.ensureLackedNpcListIsMutable();
                this.lackedNpcList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllLackedNpcList(final Iterable<? extends Integer> values) {
                this.ensureLackedNpcListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.lackedNpcList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearLackedNpcList() {
                this.lackedNpcList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            private void ensureFinishProgressListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.finishProgressList_ = GeneratedMessageV3.mutableCopy(this.finishProgressList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getFinishProgressListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.finishProgressList_) : this.finishProgressList_;
            }
            
            @Override
            public int getFinishProgressListCount() {
                return this.finishProgressList_.size();
            }
            
            @Override
            public int getFinishProgressList(final int index) {
                return this.finishProgressList_.getInt(index);
            }
            
            public Builder setFinishProgressList(final int index, final int value) {
                this.ensureFinishProgressListIsMutable();
                this.finishProgressList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addFinishProgressList(final int value) {
                this.ensureFinishProgressListIsMutable();
                this.finishProgressList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllFinishProgressList(final Iterable<? extends Integer> values) {
                this.ensureFinishProgressListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.finishProgressList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearFinishProgressList() {
                this.finishProgressList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
                return this;
            }
            
            private void ensureFailProgressListIsMutable() {
                if ((this.bitField0_ & 0x4) == 0x0) {
                    this.failProgressList_ = GeneratedMessageV3.mutableCopy(this.failProgressList_);
                    this.bitField0_ |= 0x4;
                }
            }
            
            @Override
            public List<Integer> getFailProgressListList() {
                return ((this.bitField0_ & 0x4) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.failProgressList_) : this.failProgressList_;
            }
            
            @Override
            public int getFailProgressListCount() {
                return this.failProgressList_.size();
            }
            
            @Override
            public int getFailProgressList(final int index) {
                return this.failProgressList_.getInt(index);
            }
            
            public Builder setFailProgressList(final int index, final int value) {
                this.ensureFailProgressListIsMutable();
                this.failProgressList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addFailProgressList(final int value) {
                this.ensureFailProgressListIsMutable();
                this.failProgressList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllFailProgressList(final Iterable<? extends Integer> values) {
                this.ensureFailProgressListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.failProgressList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearFailProgressList() {
                this.failProgressList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFB;
                this.onChanged();
                return this;
            }
            
            private MapField<Integer, Integer> internalGetLackedNpcMap() {
                if (this.lackedNpcMap_ == null) {
                    return MapField.emptyMapField(LackedNpcMapDefaultEntryHolder.defaultEntry);
                }
                return this.lackedNpcMap_;
            }
            
            private MapField<Integer, Integer> internalGetMutableLackedNpcMap() {
                this.onChanged();
                if (this.lackedNpcMap_ == null) {
                    this.lackedNpcMap_ = MapField.newMapField(LackedNpcMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.lackedNpcMap_.isMutable()) {
                    this.lackedNpcMap_ = this.lackedNpcMap_.copy();
                }
                return this.lackedNpcMap_;
            }
            
            @Override
            public int getLackedNpcMapCount() {
                return this.internalGetLackedNpcMap().getMap().size();
            }
            
            @Override
            public boolean containsLackedNpcMap(final int key) {
                return this.internalGetLackedNpcMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Integer> getLackedNpcMap() {
                return this.getLackedNpcMapMap();
            }
            
            @Override
            public Map<Integer, Integer> getLackedNpcMapMap() {
                return this.internalGetLackedNpcMap().getMap();
            }
            
            @Override
            public int getLackedNpcMapOrDefault(final int key, final int defaultValue) {
                final Map<Integer, Integer> map = this.internalGetLackedNpcMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public int getLackedNpcMapOrThrow(final int key) {
                final Map<Integer, Integer> map = this.internalGetLackedNpcMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearLackedNpcMap() {
                this.internalGetMutableLackedNpcMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeLackedNpcMap(final int key) {
                this.internalGetMutableLackedNpcMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, Integer> getMutableLackedNpcMap() {
                return this.internalGetMutableLackedNpcMap().getMutableMap();
            }
            
            public Builder putLackedNpcMap(final int key, final int value) {
                this.internalGetMutableLackedNpcMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllLackedNpcMap(final Map<Integer, Integer> values) {
                this.internalGetMutableLackedNpcMap().getMutableMap().putAll(values);
                return this;
            }
            
            private void ensureLackedPlaceListIsMutable() {
                if ((this.bitField0_ & 0x10) == 0x0) {
                    this.lackedPlaceList_ = GeneratedMessageV3.mutableCopy(this.lackedPlaceList_);
                    this.bitField0_ |= 0x10;
                }
            }
            
            @Override
            public List<Integer> getLackedPlaceListList() {
                return ((this.bitField0_ & 0x10) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.lackedPlaceList_) : this.lackedPlaceList_;
            }
            
            @Override
            public int getLackedPlaceListCount() {
                return this.lackedPlaceList_.size();
            }
            
            @Override
            public int getLackedPlaceList(final int index) {
                return this.lackedPlaceList_.getInt(index);
            }
            
            public Builder setLackedPlaceList(final int index, final int value) {
                this.ensureLackedPlaceListIsMutable();
                this.lackedPlaceList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addLackedPlaceList(final int value) {
                this.ensureLackedPlaceListIsMutable();
                this.lackedPlaceList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllLackedPlaceList(final Iterable<? extends Integer> values) {
                this.ensureLackedPlaceListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.lackedPlaceList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearLackedPlaceList() {
                this.lackedPlaceList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFEF;
                this.onChanged();
                return this;
            }
            
            private MapField<Integer, Integer> internalGetLackedPlaceMap() {
                if (this.lackedPlaceMap_ == null) {
                    return MapField.emptyMapField(LackedPlaceMapDefaultEntryHolder.defaultEntry);
                }
                return this.lackedPlaceMap_;
            }
            
            private MapField<Integer, Integer> internalGetMutableLackedPlaceMap() {
                this.onChanged();
                if (this.lackedPlaceMap_ == null) {
                    this.lackedPlaceMap_ = MapField.newMapField(LackedPlaceMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.lackedPlaceMap_.isMutable()) {
                    this.lackedPlaceMap_ = this.lackedPlaceMap_.copy();
                }
                return this.lackedPlaceMap_;
            }
            
            @Override
            public int getLackedPlaceMapCount() {
                return this.internalGetLackedPlaceMap().getMap().size();
            }
            
            @Override
            public boolean containsLackedPlaceMap(final int key) {
                return this.internalGetLackedPlaceMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Integer> getLackedPlaceMap() {
                return this.getLackedPlaceMapMap();
            }
            
            @Override
            public Map<Integer, Integer> getLackedPlaceMapMap() {
                return this.internalGetLackedPlaceMap().getMap();
            }
            
            @Override
            public int getLackedPlaceMapOrDefault(final int key, final int defaultValue) {
                final Map<Integer, Integer> map = this.internalGetLackedPlaceMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public int getLackedPlaceMapOrThrow(final int key) {
                final Map<Integer, Integer> map = this.internalGetLackedPlaceMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearLackedPlaceMap() {
                this.internalGetMutableLackedPlaceMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeLackedPlaceMap(final int key) {
                this.internalGetMutableLackedPlaceMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, Integer> getMutableLackedPlaceMap() {
                return this.internalGetMutableLackedPlaceMap().getMutableMap();
            }
            
            public Builder putLackedPlaceMap(final int key, final int value) {
                this.internalGetMutableLackedPlaceMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllLackedPlaceMap(final Map<Integer, Integer> values) {
                this.internalGetMutableLackedPlaceMap().getMutableMap().putAll(values);
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
    
    public interface QuestOrBuilder extends MessageOrBuilder
    {
        int getQuestId();
        
        int getState();
        
        int getStartTime();
        
        boolean getIsRandom();
        
        int getParentQuestId();
        
        int getQuestConfigId();
        
        int getStartGameTime();
        
        int getAcceptTime();
        
        List<Integer> getLackedNpcListList();
        
        int getLackedNpcListCount();
        
        int getLackedNpcList(final int p0);
        
        List<Integer> getFinishProgressListList();
        
        int getFinishProgressListCount();
        
        int getFinishProgressList(final int p0);
        
        List<Integer> getFailProgressListList();
        
        int getFailProgressListCount();
        
        int getFailProgressList(final int p0);
        
        int getLackedNpcMapCount();
        
        boolean containsLackedNpcMap(final int p0);
        
        @Deprecated
        Map<Integer, Integer> getLackedNpcMap();
        
        Map<Integer, Integer> getLackedNpcMapMap();
        
        int getLackedNpcMapOrDefault(final int p0, final int p1);
        
        int getLackedNpcMapOrThrow(final int p0);
        
        List<Integer> getLackedPlaceListList();
        
        int getLackedPlaceListCount();
        
        int getLackedPlaceList(final int p0);
        
        int getLackedPlaceMapCount();
        
        boolean containsLackedPlaceMap(final int p0);
        
        @Deprecated
        Map<Integer, Integer> getLackedPlaceMap();
        
        Map<Integer, Integer> getLackedPlaceMapMap();
        
        int getLackedPlaceMapOrDefault(final int p0, final int p1);
        
        int getLackedPlaceMapOrThrow(final int p0);
    }
}
