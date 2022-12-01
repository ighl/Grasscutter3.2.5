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
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class ParentQuestOuterClass
{
    private static final Descriptors.Descriptor internal_static_ParentQuest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ParentQuest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ParentQuest_TimeVarMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ParentQuest_TimeVarMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ParentQuestOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ParentQuestOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0011ParentQuest.proto\u001a\u0010ChildQuest.proto\u001a\u001bParentQuestRandomInfo.proto\u001a\u0019Unk3000_ENLDIHLGNCK.proto\"£\u0003\n\u000bParentQuest\u0012\u0011\n\tquest_var\u0018\u000e \u0003(\u0005\u00122\n\ftime_var_map\u0018\b \u0003(\u000b2\u001c.ParentQuest.TimeVarMapEntry\u0012\u001a\n\u0012parent_quest_state\u0018\u0001 \u0001(\r\u0012\u0013\n\u000bis_finished\u0018\u0007 \u0001(\b\u00121\n\u0013Unk3000_HLPGILIGGCB\u0018\u000f \u0003(\u000b2\u0014.Unk3000_ENLDIHLGNCK\u0012+\n\u000brandom_info\u0018\f \u0001(\u000b2\u0016.ParentQuestRandomInfo\u0012\u0017\n\u000fparent_quest_id\u0018\u0003 \u0001(\r\u0012\u0011\n\tis_random\u0018\r \u0001(\b\u0012\u001f\n\u0017cutscene_encryption_key\u0018\u0006 \u0001(\u0004\u0012\u0015\n\rquest_var_seq\u0018\u000b \u0001(\r\u0012%\n\u0010child_quest_list\u0018\t \u0003(\u000b2\u000b.ChildQuest\u001a1\n\u000fTimeVarMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ParentQuestOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ChildQuestOuterClass.getDescriptor(), ParentQuestRandomInfoOuterClass.getDescriptor(), Unk3000ENLDIHLGNCK.getDescriptor() });
        internal_static_ParentQuest_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ParentQuest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ParentQuestOuterClass.internal_static_ParentQuest_descriptor, new String[] { "QuestVar", "TimeVarMap", "ParentQuestState", "IsFinished", "Unk3000HLPGILIGGCB", "RandomInfo", "ParentQuestId", "IsRandom", "CutsceneEncryptionKey", "QuestVarSeq", "ChildQuestList" });
        internal_static_ParentQuest_TimeVarMapEntry_descriptor = ParentQuestOuterClass.internal_static_ParentQuest_descriptor.getNestedTypes().get(0);
        internal_static_ParentQuest_TimeVarMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ParentQuestOuterClass.internal_static_ParentQuest_TimeVarMapEntry_descriptor, new String[] { "Key", "Value" });
        ChildQuestOuterClass.getDescriptor();
        ParentQuestRandomInfoOuterClass.getDescriptor();
        Unk3000ENLDIHLGNCK.getDescriptor();
    }
    
    public static final class ParentQuest extends GeneratedMessageV3 implements ParentQuestOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int QUEST_VAR_FIELD_NUMBER = 14;
        private Internal.IntList questVar_;
        private int questVarMemoizedSerializedSize;
        public static final int TIME_VAR_MAP_FIELD_NUMBER = 8;
        private MapField<Integer, Integer> timeVarMap_;
        public static final int PARENT_QUEST_STATE_FIELD_NUMBER = 1;
        private int parentQuestState_;
        public static final int IS_FINISHED_FIELD_NUMBER = 7;
        private boolean isFinished_;
        public static final int UNK3000_HLPGILIGGCB_FIELD_NUMBER = 15;
        private List<Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK> unk3000HLPGILIGGCB_;
        public static final int RANDOM_INFO_FIELD_NUMBER = 12;
        private ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo randomInfo_;
        public static final int PARENT_QUEST_ID_FIELD_NUMBER = 3;
        private int parentQuestId_;
        public static final int IS_RANDOM_FIELD_NUMBER = 13;
        private boolean isRandom_;
        public static final int CUTSCENE_ENCRYPTION_KEY_FIELD_NUMBER = 6;
        private long cutsceneEncryptionKey_;
        public static final int QUEST_VAR_SEQ_FIELD_NUMBER = 11;
        private int questVarSeq_;
        public static final int CHILD_QUEST_LIST_FIELD_NUMBER = 9;
        private List<ChildQuestOuterClass.ChildQuest> childQuestList_;
        private byte memoizedIsInitialized;
        private static final ParentQuest DEFAULT_INSTANCE;
        private static final Parser<ParentQuest> PARSER;
        
        private ParentQuest(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.questVarMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private ParentQuest() {
            this.questVarMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.questVar_ = GeneratedMessageV3.emptyIntList();
            this.unk3000HLPGILIGGCB_ = Collections.emptyList();
            this.childQuestList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ParentQuest();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ParentQuest(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.parentQuestState_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.parentQuestId_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.cutsceneEncryptionKey_ = input.readUInt64();
                            continue;
                        }
                        case 56: {
                            this.isFinished_ = input.readBool();
                            continue;
                        }
                        case 66: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.timeVarMap_ = MapField.newMapField(TimeVarMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x2;
                            }
                            final MapEntry<Integer, Integer> timeVarMap__ = input.readMessage(TimeVarMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.timeVarMap_.getMutableMap().put(timeVarMap__.getKey(), timeVarMap__.getValue());
                            continue;
                        }
                        case 74: {
                            if ((mutable_bitField0_ & 0x8) == 0x0) {
                                this.childQuestList_ = new ArrayList<ChildQuestOuterClass.ChildQuest>();
                                mutable_bitField0_ |= 0x8;
                            }
                            this.childQuestList_.add(input.readMessage(ChildQuestOuterClass.ChildQuest.parser(), extensionRegistry));
                            continue;
                        }
                        case 88: {
                            this.questVarSeq_ = input.readUInt32();
                            continue;
                        }
                        case 98: {
                            ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo.Builder subBuilder = null;
                            if (this.randomInfo_ != null) {
                                subBuilder = this.randomInfo_.toBuilder();
                            }
                            this.randomInfo_ = input.readMessage(ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.randomInfo_);
                                this.randomInfo_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 104: {
                            this.isRandom_ = input.readBool();
                            continue;
                        }
                        case 112: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.questVar_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.questVar_.addInt(input.readInt32());
                            continue;
                        }
                        case 114: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.questVar_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.questVar_.addInt(input.readInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 122: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.unk3000HLPGILIGGCB_ = new ArrayList<Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK>();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.unk3000HLPGILIGGCB_.add(input.readMessage(Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK.parser(), extensionRegistry));
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
                if ((mutable_bitField0_ & 0x8) != 0x0) {
                    this.childQuestList_ = Collections.unmodifiableList((List<? extends ChildQuestOuterClass.ChildQuest>)this.childQuestList_);
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.questVar_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x4) != 0x0) {
                    this.unk3000HLPGILIGGCB_ = Collections.unmodifiableList((List<? extends Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK>)this.unk3000HLPGILIGGCB_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ParentQuestOuterClass.internal_static_ParentQuest_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 8: {
                    return this.internalGetTimeVarMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ParentQuestOuterClass.internal_static_ParentQuest_fieldAccessorTable.ensureFieldAccessorsInitialized(ParentQuest.class, Builder.class);
        }
        
        @Override
        public List<Integer> getQuestVarList() {
            return this.questVar_;
        }
        
        @Override
        public int getQuestVarCount() {
            return this.questVar_.size();
        }
        
        @Override
        public int getQuestVar(final int index) {
            return this.questVar_.getInt(index);
        }
        
        private MapField<Integer, Integer> internalGetTimeVarMap() {
            if (this.timeVarMap_ == null) {
                return MapField.emptyMapField(TimeVarMapDefaultEntryHolder.defaultEntry);
            }
            return this.timeVarMap_;
        }
        
        @Override
        public int getTimeVarMapCount() {
            return this.internalGetTimeVarMap().getMap().size();
        }
        
        @Override
        public boolean containsTimeVarMap(final int key) {
            return this.internalGetTimeVarMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, Integer> getTimeVarMap() {
            return this.getTimeVarMapMap();
        }
        
        @Override
        public Map<Integer, Integer> getTimeVarMapMap() {
            return this.internalGetTimeVarMap().getMap();
        }
        
        @Override
        public int getTimeVarMapOrDefault(final int key, final int defaultValue) {
            final Map<Integer, Integer> map = this.internalGetTimeVarMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public int getTimeVarMapOrThrow(final int key) {
            final Map<Integer, Integer> map = this.internalGetTimeVarMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public int getParentQuestState() {
            return this.parentQuestState_;
        }
        
        @Override
        public boolean getIsFinished() {
            return this.isFinished_;
        }
        
        @Override
        public List<Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK> getUnk3000HLPGILIGGCBList() {
            return this.unk3000HLPGILIGGCB_;
        }
        
        @Override
        public List<? extends Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCKOrBuilder> getUnk3000HLPGILIGGCBOrBuilderList() {
            return this.unk3000HLPGILIGGCB_;
        }
        
        @Override
        public int getUnk3000HLPGILIGGCBCount() {
            return this.unk3000HLPGILIGGCB_.size();
        }
        
        @Override
        public Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK getUnk3000HLPGILIGGCB(final int index) {
            return this.unk3000HLPGILIGGCB_.get(index);
        }
        
        @Override
        public Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCKOrBuilder getUnk3000HLPGILIGGCBOrBuilder(final int index) {
            return this.unk3000HLPGILIGGCB_.get(index);
        }
        
        @Override
        public boolean hasRandomInfo() {
            return this.randomInfo_ != null;
        }
        
        @Override
        public ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo getRandomInfo() {
            return (this.randomInfo_ == null) ? ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo.getDefaultInstance() : this.randomInfo_;
        }
        
        @Override
        public ParentQuestRandomInfoOuterClass.ParentQuestRandomInfoOrBuilder getRandomInfoOrBuilder() {
            return this.getRandomInfo();
        }
        
        @Override
        public int getParentQuestId() {
            return this.parentQuestId_;
        }
        
        @Override
        public boolean getIsRandom() {
            return this.isRandom_;
        }
        
        @Override
        public long getCutsceneEncryptionKey() {
            return this.cutsceneEncryptionKey_;
        }
        
        @Override
        public int getQuestVarSeq() {
            return this.questVarSeq_;
        }
        
        @Override
        public List<ChildQuestOuterClass.ChildQuest> getChildQuestListList() {
            return this.childQuestList_;
        }
        
        @Override
        public List<? extends ChildQuestOuterClass.ChildQuestOrBuilder> getChildQuestListOrBuilderList() {
            return this.childQuestList_;
        }
        
        @Override
        public int getChildQuestListCount() {
            return this.childQuestList_.size();
        }
        
        @Override
        public ChildQuestOuterClass.ChildQuest getChildQuestList(final int index) {
            return this.childQuestList_.get(index);
        }
        
        @Override
        public ChildQuestOuterClass.ChildQuestOrBuilder getChildQuestListOrBuilder(final int index) {
            return this.childQuestList_.get(index);
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
            if (this.parentQuestState_ != 0) {
                output.writeUInt32(1, this.parentQuestState_);
            }
            if (this.parentQuestId_ != 0) {
                output.writeUInt32(3, this.parentQuestId_);
            }
            if (this.cutsceneEncryptionKey_ != 0L) {
                output.writeUInt64(6, this.cutsceneEncryptionKey_);
            }
            if (this.isFinished_) {
                output.writeBool(7, this.isFinished_);
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetTimeVarMap(), TimeVarMapDefaultEntryHolder.defaultEntry, 8);
            for (int i = 0; i < this.childQuestList_.size(); ++i) {
                output.writeMessage(9, this.childQuestList_.get(i));
            }
            if (this.questVarSeq_ != 0) {
                output.writeUInt32(11, this.questVarSeq_);
            }
            if (this.randomInfo_ != null) {
                output.writeMessage(12, this.getRandomInfo());
            }
            if (this.isRandom_) {
                output.writeBool(13, this.isRandom_);
            }
            if (this.getQuestVarList().size() > 0) {
                output.writeUInt32NoTag(114);
                output.writeUInt32NoTag(this.questVarMemoizedSerializedSize);
            }
            for (int i = 0; i < this.questVar_.size(); ++i) {
                output.writeInt32NoTag(this.questVar_.getInt(i));
            }
            for (int i = 0; i < this.unk3000HLPGILIGGCB_.size(); ++i) {
                output.writeMessage(15, this.unk3000HLPGILIGGCB_.get(i));
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
            if (this.parentQuestState_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.parentQuestState_);
            }
            if (this.parentQuestId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.parentQuestId_);
            }
            if (this.cutsceneEncryptionKey_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(6, this.cutsceneEncryptionKey_);
            }
            if (this.isFinished_) {
                size += CodedOutputStream.computeBoolSize(7, this.isFinished_);
            }
            for (final Map.Entry<Integer, Integer> entry : this.internalGetTimeVarMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> timeVarMap__ = TimeVarMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(8, timeVarMap__);
            }
            for (int i = 0; i < this.childQuestList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(9, this.childQuestList_.get(i));
            }
            if (this.questVarSeq_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.questVarSeq_);
            }
            if (this.randomInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(12, this.getRandomInfo());
            }
            if (this.isRandom_) {
                size += CodedOutputStream.computeBoolSize(13, this.isRandom_);
            }
            int dataSize = 0;
            for (int j = 0; j < this.questVar_.size(); ++j) {
                dataSize += CodedOutputStream.computeInt32SizeNoTag(this.questVar_.getInt(j));
            }
            size += dataSize;
            if (!this.getQuestVarList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.questVarMemoizedSerializedSize = dataSize;
            for (int i = 0; i < this.unk3000HLPGILIGGCB_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(15, this.unk3000HLPGILIGGCB_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ParentQuest)) {
                return super.equals(obj);
            }
            final ParentQuest other = (ParentQuest)obj;
            return this.getQuestVarList().equals(other.getQuestVarList()) && this.internalGetTimeVarMap().equals(other.internalGetTimeVarMap()) && this.getParentQuestState() == other.getParentQuestState() && this.getIsFinished() == other.getIsFinished() && this.getUnk3000HLPGILIGGCBList().equals(other.getUnk3000HLPGILIGGCBList()) && this.hasRandomInfo() == other.hasRandomInfo() && (!this.hasRandomInfo() || this.getRandomInfo().equals(other.getRandomInfo())) && this.getParentQuestId() == other.getParentQuestId() && this.getIsRandom() == other.getIsRandom() && this.getCutsceneEncryptionKey() == other.getCutsceneEncryptionKey() && this.getQuestVarSeq() == other.getQuestVarSeq() && this.getChildQuestListList().equals(other.getChildQuestListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getQuestVarCount() > 0) {
                hash = 37 * hash + 14;
                hash = 53 * hash + this.getQuestVarList().hashCode();
            }
            if (!this.internalGetTimeVarMap().getMap().isEmpty()) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.internalGetTimeVarMap().hashCode();
            }
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getParentQuestState();
            hash = 37 * hash + 7;
            hash = 53 * hash + Internal.hashBoolean(this.getIsFinished());
            if (this.getUnk3000HLPGILIGGCBCount() > 0) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getUnk3000HLPGILIGGCBList().hashCode();
            }
            if (this.hasRandomInfo()) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getRandomInfo().hashCode();
            }
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getParentQuestId();
            hash = 37 * hash + 13;
            hash = 53 * hash + Internal.hashBoolean(this.getIsRandom());
            hash = 37 * hash + 6;
            hash = 53 * hash + Internal.hashLong(this.getCutsceneEncryptionKey());
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getQuestVarSeq();
            if (this.getChildQuestListCount() > 0) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getChildQuestListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ParentQuest parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ParentQuest.PARSER.parseFrom(data);
        }
        
        public static ParentQuest parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ParentQuest.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ParentQuest parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ParentQuest.PARSER.parseFrom(data);
        }
        
        public static ParentQuest parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ParentQuest.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ParentQuest parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ParentQuest.PARSER.parseFrom(data);
        }
        
        public static ParentQuest parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ParentQuest.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ParentQuest parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ParentQuest.PARSER, input);
        }
        
        public static ParentQuest parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ParentQuest.PARSER, input, extensionRegistry);
        }
        
        public static ParentQuest parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ParentQuest.PARSER, input);
        }
        
        public static ParentQuest parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ParentQuest.PARSER, input, extensionRegistry);
        }
        
        public static ParentQuest parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ParentQuest.PARSER, input);
        }
        
        public static ParentQuest parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ParentQuest.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ParentQuest.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ParentQuest prototype) {
            return ParentQuest.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ParentQuest.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ParentQuest getDefaultInstance() {
            return ParentQuest.DEFAULT_INSTANCE;
        }
        
        public static Parser<ParentQuest> parser() {
            return ParentQuest.PARSER;
        }
        
        @Override
        public Parser<ParentQuest> getParserForType() {
            return ParentQuest.PARSER;
        }
        
        @Override
        public ParentQuest getDefaultInstanceForType() {
            return ParentQuest.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ParentQuest();
            PARSER = new AbstractParser<ParentQuest>() {
                @Override
                public ParentQuest parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ParentQuest(input, extensionRegistry);
                }
            };
        }
        
        private static final class TimeVarMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(ParentQuestOuterClass.internal_static_ParentQuest_TimeVarMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ParentQuestOrBuilder
        {
            private int bitField0_;
            private Internal.IntList questVar_;
            private MapField<Integer, Integer> timeVarMap_;
            private int parentQuestState_;
            private boolean isFinished_;
            private List<Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK> unk3000HLPGILIGGCB_;
            private RepeatedFieldBuilderV3<Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK, Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK.Builder, Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCKOrBuilder> unk3000HLPGILIGGCBBuilder_;
            private ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo randomInfo_;
            private SingleFieldBuilderV3<ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo, ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo.Builder, ParentQuestRandomInfoOuterClass.ParentQuestRandomInfoOrBuilder> randomInfoBuilder_;
            private int parentQuestId_;
            private boolean isRandom_;
            private long cutsceneEncryptionKey_;
            private int questVarSeq_;
            private List<ChildQuestOuterClass.ChildQuest> childQuestList_;
            private RepeatedFieldBuilderV3<ChildQuestOuterClass.ChildQuest, ChildQuestOuterClass.ChildQuest.Builder, ChildQuestOuterClass.ChildQuestOrBuilder> childQuestListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ParentQuestOuterClass.internal_static_ParentQuest_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 8: {
                        return this.internalGetTimeVarMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected MapField internalGetMutableMapField(final int number) {
                switch (number) {
                    case 8: {
                        return this.internalGetMutableTimeVarMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ParentQuestOuterClass.internal_static_ParentQuest_fieldAccessorTable.ensureFieldAccessorsInitialized(ParentQuest.class, Builder.class);
            }
            
            private Builder() {
                this.questVar_ = GeneratedMessageV3.emptyIntList();
                this.unk3000HLPGILIGGCB_ = Collections.emptyList();
                this.childQuestList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.questVar_ = GeneratedMessageV3.emptyIntList();
                this.unk3000HLPGILIGGCB_ = Collections.emptyList();
                this.childQuestList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ParentQuest.alwaysUseFieldBuilders) {
                    this.getUnk3000HLPGILIGGCBFieldBuilder();
                    this.getChildQuestListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.questVar_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.internalGetMutableTimeVarMap().clear();
                this.parentQuestState_ = 0;
                this.isFinished_ = false;
                if (this.unk3000HLPGILIGGCBBuilder_ == null) {
                    this.unk3000HLPGILIGGCB_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                else {
                    this.unk3000HLPGILIGGCBBuilder_.clear();
                }
                if (this.randomInfoBuilder_ == null) {
                    this.randomInfo_ = null;
                }
                else {
                    this.randomInfo_ = null;
                    this.randomInfoBuilder_ = null;
                }
                this.parentQuestId_ = 0;
                this.isRandom_ = false;
                this.cutsceneEncryptionKey_ = 0L;
                this.questVarSeq_ = 0;
                if (this.childQuestListBuilder_ == null) {
                    this.childQuestList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFF7;
                }
                else {
                    this.childQuestListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ParentQuestOuterClass.internal_static_ParentQuest_descriptor;
            }
            
            @Override
            public ParentQuest getDefaultInstanceForType() {
                return ParentQuest.getDefaultInstance();
            }
            
            @Override
            public ParentQuest build() {
                final ParentQuest result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ParentQuest buildPartial() {
                final ParentQuest result = new ParentQuest(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.questVar_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.questVar_ = this.questVar_;
                (result.timeVarMap_ = this.internalGetTimeVarMap()).makeImmutable();
                result.parentQuestState_ = this.parentQuestState_;
                result.isFinished_ = this.isFinished_;
                if (this.unk3000HLPGILIGGCBBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) != 0x0) {
                        this.unk3000HLPGILIGGCB_ = Collections.unmodifiableList((List<? extends Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK>)this.unk3000HLPGILIGGCB_);
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    result.unk3000HLPGILIGGCB_ = this.unk3000HLPGILIGGCB_;
                }
                else {
                    result.unk3000HLPGILIGGCB_ = this.unk3000HLPGILIGGCBBuilder_.build();
                }
                if (this.randomInfoBuilder_ == null) {
                    result.randomInfo_ = this.randomInfo_;
                }
                else {
                    result.randomInfo_ = this.randomInfoBuilder_.build();
                }
                result.parentQuestId_ = this.parentQuestId_;
                result.isRandom_ = this.isRandom_;
                result.cutsceneEncryptionKey_ = this.cutsceneEncryptionKey_;
                result.questVarSeq_ = this.questVarSeq_;
                if (this.childQuestListBuilder_ == null) {
                    if ((this.bitField0_ & 0x8) != 0x0) {
                        this.childQuestList_ = Collections.unmodifiableList((List<? extends ChildQuestOuterClass.ChildQuest>)this.childQuestList_);
                        this.bitField0_ &= 0xFFFFFFF7;
                    }
                    result.childQuestList_ = this.childQuestList_;
                }
                else {
                    result.childQuestList_ = this.childQuestListBuilder_.build();
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
                if (other instanceof ParentQuest) {
                    return this.mergeFrom((ParentQuest)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ParentQuest other) {
                if (other == ParentQuest.getDefaultInstance()) {
                    return this;
                }
                if (!other.questVar_.isEmpty()) {
                    if (this.questVar_.isEmpty()) {
                        this.questVar_ = other.questVar_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureQuestVarIsMutable();
                        this.questVar_.addAll(other.questVar_);
                    }
                    this.onChanged();
                }
                this.internalGetMutableTimeVarMap().mergeFrom(other.internalGetTimeVarMap());
                if (other.getParentQuestState() != 0) {
                    this.setParentQuestState(other.getParentQuestState());
                }
                if (other.getIsFinished()) {
                    this.setIsFinished(other.getIsFinished());
                }
                if (this.unk3000HLPGILIGGCBBuilder_ == null) {
                    if (!other.unk3000HLPGILIGGCB_.isEmpty()) {
                        if (this.unk3000HLPGILIGGCB_.isEmpty()) {
                            this.unk3000HLPGILIGGCB_ = other.unk3000HLPGILIGGCB_;
                            this.bitField0_ &= 0xFFFFFFFB;
                        }
                        else {
                            this.ensureUnk3000HLPGILIGGCBIsMutable();
                            this.unk3000HLPGILIGGCB_.addAll(other.unk3000HLPGILIGGCB_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.unk3000HLPGILIGGCB_.isEmpty()) {
                    if (this.unk3000HLPGILIGGCBBuilder_.isEmpty()) {
                        this.unk3000HLPGILIGGCBBuilder_.dispose();
                        this.unk3000HLPGILIGGCBBuilder_ = null;
                        this.unk3000HLPGILIGGCB_ = other.unk3000HLPGILIGGCB_;
                        this.bitField0_ &= 0xFFFFFFFB;
                        this.unk3000HLPGILIGGCBBuilder_ = (ParentQuest.alwaysUseFieldBuilders ? this.getUnk3000HLPGILIGGCBFieldBuilder() : null);
                    }
                    else {
                        this.unk3000HLPGILIGGCBBuilder_.addAllMessages(other.unk3000HLPGILIGGCB_);
                    }
                }
                if (other.hasRandomInfo()) {
                    this.mergeRandomInfo(other.getRandomInfo());
                }
                if (other.getParentQuestId() != 0) {
                    this.setParentQuestId(other.getParentQuestId());
                }
                if (other.getIsRandom()) {
                    this.setIsRandom(other.getIsRandom());
                }
                if (other.getCutsceneEncryptionKey() != 0L) {
                    this.setCutsceneEncryptionKey(other.getCutsceneEncryptionKey());
                }
                if (other.getQuestVarSeq() != 0) {
                    this.setQuestVarSeq(other.getQuestVarSeq());
                }
                if (this.childQuestListBuilder_ == null) {
                    if (!other.childQuestList_.isEmpty()) {
                        if (this.childQuestList_.isEmpty()) {
                            this.childQuestList_ = other.childQuestList_;
                            this.bitField0_ &= 0xFFFFFFF7;
                        }
                        else {
                            this.ensureChildQuestListIsMutable();
                            this.childQuestList_.addAll(other.childQuestList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.childQuestList_.isEmpty()) {
                    if (this.childQuestListBuilder_.isEmpty()) {
                        this.childQuestListBuilder_.dispose();
                        this.childQuestListBuilder_ = null;
                        this.childQuestList_ = other.childQuestList_;
                        this.bitField0_ &= 0xFFFFFFF7;
                        this.childQuestListBuilder_ = (ParentQuest.alwaysUseFieldBuilders ? this.getChildQuestListFieldBuilder() : null);
                    }
                    else {
                        this.childQuestListBuilder_.addAllMessages(other.childQuestList_);
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
                ParentQuest parsedMessage = null;
                try {
                    parsedMessage = ParentQuest.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ParentQuest)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureQuestVarIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.questVar_ = GeneratedMessageV3.mutableCopy(this.questVar_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getQuestVarList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.questVar_) : this.questVar_;
            }
            
            @Override
            public int getQuestVarCount() {
                return this.questVar_.size();
            }
            
            @Override
            public int getQuestVar(final int index) {
                return this.questVar_.getInt(index);
            }
            
            public Builder setQuestVar(final int index, final int value) {
                this.ensureQuestVarIsMutable();
                this.questVar_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addQuestVar(final int value) {
                this.ensureQuestVarIsMutable();
                this.questVar_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllQuestVar(final Iterable<? extends Integer> values) {
                this.ensureQuestVarIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.questVar_);
                this.onChanged();
                return this;
            }
            
            public Builder clearQuestVar() {
                this.questVar_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            private MapField<Integer, Integer> internalGetTimeVarMap() {
                if (this.timeVarMap_ == null) {
                    return MapField.emptyMapField(TimeVarMapDefaultEntryHolder.defaultEntry);
                }
                return this.timeVarMap_;
            }
            
            private MapField<Integer, Integer> internalGetMutableTimeVarMap() {
                this.onChanged();
                if (this.timeVarMap_ == null) {
                    this.timeVarMap_ = MapField.newMapField(TimeVarMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.timeVarMap_.isMutable()) {
                    this.timeVarMap_ = this.timeVarMap_.copy();
                }
                return this.timeVarMap_;
            }
            
            @Override
            public int getTimeVarMapCount() {
                return this.internalGetTimeVarMap().getMap().size();
            }
            
            @Override
            public boolean containsTimeVarMap(final int key) {
                return this.internalGetTimeVarMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Integer> getTimeVarMap() {
                return this.getTimeVarMapMap();
            }
            
            @Override
            public Map<Integer, Integer> getTimeVarMapMap() {
                return this.internalGetTimeVarMap().getMap();
            }
            
            @Override
            public int getTimeVarMapOrDefault(final int key, final int defaultValue) {
                final Map<Integer, Integer> map = this.internalGetTimeVarMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public int getTimeVarMapOrThrow(final int key) {
                final Map<Integer, Integer> map = this.internalGetTimeVarMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearTimeVarMap() {
                this.internalGetMutableTimeVarMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeTimeVarMap(final int key) {
                this.internalGetMutableTimeVarMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, Integer> getMutableTimeVarMap() {
                return this.internalGetMutableTimeVarMap().getMutableMap();
            }
            
            public Builder putTimeVarMap(final int key, final int value) {
                this.internalGetMutableTimeVarMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllTimeVarMap(final Map<Integer, Integer> values) {
                this.internalGetMutableTimeVarMap().getMutableMap().putAll(values);
                return this;
            }
            
            @Override
            public int getParentQuestState() {
                return this.parentQuestState_;
            }
            
            public Builder setParentQuestState(final int value) {
                this.parentQuestState_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearParentQuestState() {
                this.parentQuestState_ = 0;
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
            
            private void ensureUnk3000HLPGILIGGCBIsMutable() {
                if ((this.bitField0_ & 0x4) == 0x0) {
                    this.unk3000HLPGILIGGCB_ = new ArrayList<Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK>(this.unk3000HLPGILIGGCB_);
                    this.bitField0_ |= 0x4;
                }
            }
            
            @Override
            public List<Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK> getUnk3000HLPGILIGGCBList() {
                if (this.unk3000HLPGILIGGCBBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK>)this.unk3000HLPGILIGGCB_);
                }
                return this.unk3000HLPGILIGGCBBuilder_.getMessageList();
            }
            
            @Override
            public int getUnk3000HLPGILIGGCBCount() {
                if (this.unk3000HLPGILIGGCBBuilder_ == null) {
                    return this.unk3000HLPGILIGGCB_.size();
                }
                return this.unk3000HLPGILIGGCBBuilder_.getCount();
            }
            
            @Override
            public Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK getUnk3000HLPGILIGGCB(final int index) {
                if (this.unk3000HLPGILIGGCBBuilder_ == null) {
                    return this.unk3000HLPGILIGGCB_.get(index);
                }
                return this.unk3000HLPGILIGGCBBuilder_.getMessage(index);
            }
            
            public Builder setUnk3000HLPGILIGGCB(final int index, final Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK value) {
                if (this.unk3000HLPGILIGGCBBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureUnk3000HLPGILIGGCBIsMutable();
                    this.unk3000HLPGILIGGCB_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.unk3000HLPGILIGGCBBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setUnk3000HLPGILIGGCB(final int index, final Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK.Builder builderForValue) {
                if (this.unk3000HLPGILIGGCBBuilder_ == null) {
                    this.ensureUnk3000HLPGILIGGCBIsMutable();
                    this.unk3000HLPGILIGGCB_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.unk3000HLPGILIGGCBBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addUnk3000HLPGILIGGCB(final Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK value) {
                if (this.unk3000HLPGILIGGCBBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureUnk3000HLPGILIGGCBIsMutable();
                    this.unk3000HLPGILIGGCB_.add(value);
                    this.onChanged();
                }
                else {
                    this.unk3000HLPGILIGGCBBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addUnk3000HLPGILIGGCB(final int index, final Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK value) {
                if (this.unk3000HLPGILIGGCBBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureUnk3000HLPGILIGGCBIsMutable();
                    this.unk3000HLPGILIGGCB_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.unk3000HLPGILIGGCBBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addUnk3000HLPGILIGGCB(final Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK.Builder builderForValue) {
                if (this.unk3000HLPGILIGGCBBuilder_ == null) {
                    this.ensureUnk3000HLPGILIGGCBIsMutable();
                    this.unk3000HLPGILIGGCB_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.unk3000HLPGILIGGCBBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addUnk3000HLPGILIGGCB(final int index, final Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK.Builder builderForValue) {
                if (this.unk3000HLPGILIGGCBBuilder_ == null) {
                    this.ensureUnk3000HLPGILIGGCBIsMutable();
                    this.unk3000HLPGILIGGCB_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.unk3000HLPGILIGGCBBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllUnk3000HLPGILIGGCB(final Iterable<? extends Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK> values) {
                if (this.unk3000HLPGILIGGCBBuilder_ == null) {
                    this.ensureUnk3000HLPGILIGGCBIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.unk3000HLPGILIGGCB_);
                    this.onChanged();
                }
                else {
                    this.unk3000HLPGILIGGCBBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearUnk3000HLPGILIGGCB() {
                if (this.unk3000HLPGILIGGCBBuilder_ == null) {
                    this.unk3000HLPGILIGGCB_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                    this.onChanged();
                }
                else {
                    this.unk3000HLPGILIGGCBBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeUnk3000HLPGILIGGCB(final int index) {
                if (this.unk3000HLPGILIGGCBBuilder_ == null) {
                    this.ensureUnk3000HLPGILIGGCBIsMutable();
                    this.unk3000HLPGILIGGCB_.remove(index);
                    this.onChanged();
                }
                else {
                    this.unk3000HLPGILIGGCBBuilder_.remove(index);
                }
                return this;
            }
            
            public Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK.Builder getUnk3000HLPGILIGGCBBuilder(final int index) {
                return this.getUnk3000HLPGILIGGCBFieldBuilder().getBuilder(index);
            }
            
            @Override
            public Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCKOrBuilder getUnk3000HLPGILIGGCBOrBuilder(final int index) {
                if (this.unk3000HLPGILIGGCBBuilder_ == null) {
                    return this.unk3000HLPGILIGGCB_.get(index);
                }
                return this.unk3000HLPGILIGGCBBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCKOrBuilder> getUnk3000HLPGILIGGCBOrBuilderList() {
                if (this.unk3000HLPGILIGGCBBuilder_ != null) {
                    return this.unk3000HLPGILIGGCBBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCKOrBuilder>)this.unk3000HLPGILIGGCB_);
            }
            
            public Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK.Builder addUnk3000HLPGILIGGCBBuilder() {
                return this.getUnk3000HLPGILIGGCBFieldBuilder().addBuilder(Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK.getDefaultInstance());
            }
            
            public Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK.Builder addUnk3000HLPGILIGGCBBuilder(final int index) {
                return this.getUnk3000HLPGILIGGCBFieldBuilder().addBuilder(index, Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK.getDefaultInstance());
            }
            
            public List<Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK.Builder> getUnk3000HLPGILIGGCBBuilderList() {
                return this.getUnk3000HLPGILIGGCBFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK, Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK.Builder, Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCKOrBuilder> getUnk3000HLPGILIGGCBFieldBuilder() {
                if (this.unk3000HLPGILIGGCBBuilder_ == null) {
                    this.unk3000HLPGILIGGCBBuilder_ = new RepeatedFieldBuilderV3<Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK, Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK.Builder, Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCKOrBuilder>(this.unk3000HLPGILIGGCB_, (this.bitField0_ & 0x4) != 0x0, this.getParentForChildren(), this.isClean());
                    this.unk3000HLPGILIGGCB_ = null;
                }
                return this.unk3000HLPGILIGGCBBuilder_;
            }
            
            @Override
            public boolean hasRandomInfo() {
                return this.randomInfoBuilder_ != null || this.randomInfo_ != null;
            }
            
            @Override
            public ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo getRandomInfo() {
                if (this.randomInfoBuilder_ == null) {
                    return (this.randomInfo_ == null) ? ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo.getDefaultInstance() : this.randomInfo_;
                }
                return this.randomInfoBuilder_.getMessage();
            }
            
            public Builder setRandomInfo(final ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo value) {
                if (this.randomInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.randomInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.randomInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setRandomInfo(final ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo.Builder builderForValue) {
                if (this.randomInfoBuilder_ == null) {
                    this.randomInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.randomInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeRandomInfo(final ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo value) {
                if (this.randomInfoBuilder_ == null) {
                    if (this.randomInfo_ != null) {
                        this.randomInfo_ = ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo.newBuilder(this.randomInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.randomInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.randomInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearRandomInfo() {
                if (this.randomInfoBuilder_ == null) {
                    this.randomInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.randomInfo_ = null;
                    this.randomInfoBuilder_ = null;
                }
                return this;
            }
            
            public ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo.Builder getRandomInfoBuilder() {
                this.onChanged();
                return this.getRandomInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public ParentQuestRandomInfoOuterClass.ParentQuestRandomInfoOrBuilder getRandomInfoOrBuilder() {
                if (this.randomInfoBuilder_ != null) {
                    return this.randomInfoBuilder_.getMessageOrBuilder();
                }
                return (this.randomInfo_ == null) ? ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo.getDefaultInstance() : this.randomInfo_;
            }
            
            private SingleFieldBuilderV3<ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo, ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo.Builder, ParentQuestRandomInfoOuterClass.ParentQuestRandomInfoOrBuilder> getRandomInfoFieldBuilder() {
                if (this.randomInfoBuilder_ == null) {
                    this.randomInfoBuilder_ = new SingleFieldBuilderV3<ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo, ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo.Builder, ParentQuestRandomInfoOuterClass.ParentQuestRandomInfoOrBuilder>(this.getRandomInfo(), this.getParentForChildren(), this.isClean());
                    this.randomInfo_ = null;
                }
                return this.randomInfoBuilder_;
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
            public long getCutsceneEncryptionKey() {
                return this.cutsceneEncryptionKey_;
            }
            
            public Builder setCutsceneEncryptionKey(final long value) {
                this.cutsceneEncryptionKey_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCutsceneEncryptionKey() {
                this.cutsceneEncryptionKey_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getQuestVarSeq() {
                return this.questVarSeq_;
            }
            
            public Builder setQuestVarSeq(final int value) {
                this.questVarSeq_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearQuestVarSeq() {
                this.questVarSeq_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureChildQuestListIsMutable() {
                if ((this.bitField0_ & 0x8) == 0x0) {
                    this.childQuestList_ = new ArrayList<ChildQuestOuterClass.ChildQuest>(this.childQuestList_);
                    this.bitField0_ |= 0x8;
                }
            }
            
            @Override
            public List<ChildQuestOuterClass.ChildQuest> getChildQuestListList() {
                if (this.childQuestListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ChildQuestOuterClass.ChildQuest>)this.childQuestList_);
                }
                return this.childQuestListBuilder_.getMessageList();
            }
            
            @Override
            public int getChildQuestListCount() {
                if (this.childQuestListBuilder_ == null) {
                    return this.childQuestList_.size();
                }
                return this.childQuestListBuilder_.getCount();
            }
            
            @Override
            public ChildQuestOuterClass.ChildQuest getChildQuestList(final int index) {
                if (this.childQuestListBuilder_ == null) {
                    return this.childQuestList_.get(index);
                }
                return this.childQuestListBuilder_.getMessage(index);
            }
            
            public Builder setChildQuestList(final int index, final ChildQuestOuterClass.ChildQuest value) {
                if (this.childQuestListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureChildQuestListIsMutable();
                    this.childQuestList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.childQuestListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setChildQuestList(final int index, final ChildQuestOuterClass.ChildQuest.Builder builderForValue) {
                if (this.childQuestListBuilder_ == null) {
                    this.ensureChildQuestListIsMutable();
                    this.childQuestList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.childQuestListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addChildQuestList(final ChildQuestOuterClass.ChildQuest value) {
                if (this.childQuestListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureChildQuestListIsMutable();
                    this.childQuestList_.add(value);
                    this.onChanged();
                }
                else {
                    this.childQuestListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addChildQuestList(final int index, final ChildQuestOuterClass.ChildQuest value) {
                if (this.childQuestListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureChildQuestListIsMutable();
                    this.childQuestList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.childQuestListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addChildQuestList(final ChildQuestOuterClass.ChildQuest.Builder builderForValue) {
                if (this.childQuestListBuilder_ == null) {
                    this.ensureChildQuestListIsMutable();
                    this.childQuestList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.childQuestListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addChildQuestList(final int index, final ChildQuestOuterClass.ChildQuest.Builder builderForValue) {
                if (this.childQuestListBuilder_ == null) {
                    this.ensureChildQuestListIsMutable();
                    this.childQuestList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.childQuestListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllChildQuestList(final Iterable<? extends ChildQuestOuterClass.ChildQuest> values) {
                if (this.childQuestListBuilder_ == null) {
                    this.ensureChildQuestListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.childQuestList_);
                    this.onChanged();
                }
                else {
                    this.childQuestListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearChildQuestList() {
                if (this.childQuestListBuilder_ == null) {
                    this.childQuestList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFF7;
                    this.onChanged();
                }
                else {
                    this.childQuestListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeChildQuestList(final int index) {
                if (this.childQuestListBuilder_ == null) {
                    this.ensureChildQuestListIsMutable();
                    this.childQuestList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.childQuestListBuilder_.remove(index);
                }
                return this;
            }
            
            public ChildQuestOuterClass.ChildQuest.Builder getChildQuestListBuilder(final int index) {
                return this.getChildQuestListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ChildQuestOuterClass.ChildQuestOrBuilder getChildQuestListOrBuilder(final int index) {
                if (this.childQuestListBuilder_ == null) {
                    return this.childQuestList_.get(index);
                }
                return this.childQuestListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ChildQuestOuterClass.ChildQuestOrBuilder> getChildQuestListOrBuilderList() {
                if (this.childQuestListBuilder_ != null) {
                    return this.childQuestListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ChildQuestOuterClass.ChildQuestOrBuilder>)this.childQuestList_);
            }
            
            public ChildQuestOuterClass.ChildQuest.Builder addChildQuestListBuilder() {
                return this.getChildQuestListFieldBuilder().addBuilder(ChildQuestOuterClass.ChildQuest.getDefaultInstance());
            }
            
            public ChildQuestOuterClass.ChildQuest.Builder addChildQuestListBuilder(final int index) {
                return this.getChildQuestListFieldBuilder().addBuilder(index, ChildQuestOuterClass.ChildQuest.getDefaultInstance());
            }
            
            public List<ChildQuestOuterClass.ChildQuest.Builder> getChildQuestListBuilderList() {
                return this.getChildQuestListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ChildQuestOuterClass.ChildQuest, ChildQuestOuterClass.ChildQuest.Builder, ChildQuestOuterClass.ChildQuestOrBuilder> getChildQuestListFieldBuilder() {
                if (this.childQuestListBuilder_ == null) {
                    this.childQuestListBuilder_ = new RepeatedFieldBuilderV3<ChildQuestOuterClass.ChildQuest, ChildQuestOuterClass.ChildQuest.Builder, ChildQuestOuterClass.ChildQuestOrBuilder>(this.childQuestList_, (this.bitField0_ & 0x8) != 0x0, this.getParentForChildren(), this.isClean());
                    this.childQuestList_ = null;
                }
                return this.childQuestListBuilder_;
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
    
    public interface ParentQuestOrBuilder extends MessageOrBuilder
    {
        List<Integer> getQuestVarList();
        
        int getQuestVarCount();
        
        int getQuestVar(final int p0);
        
        int getTimeVarMapCount();
        
        boolean containsTimeVarMap(final int p0);
        
        @Deprecated
        Map<Integer, Integer> getTimeVarMap();
        
        Map<Integer, Integer> getTimeVarMapMap();
        
        int getTimeVarMapOrDefault(final int p0, final int p1);
        
        int getTimeVarMapOrThrow(final int p0);
        
        int getParentQuestState();
        
        boolean getIsFinished();
        
        List<Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK> getUnk3000HLPGILIGGCBList();
        
        Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCK getUnk3000HLPGILIGGCB(final int p0);
        
        int getUnk3000HLPGILIGGCBCount();
        
        List<? extends Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCKOrBuilder> getUnk3000HLPGILIGGCBOrBuilderList();
        
        Unk3000ENLDIHLGNCK.Unk3000_ENLDIHLGNCKOrBuilder getUnk3000HLPGILIGGCBOrBuilder(final int p0);
        
        boolean hasRandomInfo();
        
        ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo getRandomInfo();
        
        ParentQuestRandomInfoOuterClass.ParentQuestRandomInfoOrBuilder getRandomInfoOrBuilder();
        
        int getParentQuestId();
        
        boolean getIsRandom();
        
        long getCutsceneEncryptionKey();
        
        int getQuestVarSeq();
        
        List<ChildQuestOuterClass.ChildQuest> getChildQuestListList();
        
        ChildQuestOuterClass.ChildQuest getChildQuestList(final int p0);
        
        int getChildQuestListCount();
        
        List<? extends ChildQuestOuterClass.ChildQuestOrBuilder> getChildQuestListOrBuilderList();
        
        ChildQuestOuterClass.ChildQuestOrBuilder getChildQuestListOrBuilder(final int p0);
    }
}
