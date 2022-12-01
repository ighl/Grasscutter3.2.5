// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class TowerCurLevelRecordOuterClass
{
    private static final Descriptors.Descriptor internal_static_TowerCurLevelRecord_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TowerCurLevelRecord_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TowerCurLevelRecordOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TowerCurLevelRecordOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019TowerCurLevelRecord.proto\u001a\u000fTowerTeam.proto\"®\u0001\n\u0013TowerCurLevelRecord\u0012#\n\u000ftower_team_list\u0018\b \u0003(\u000b2\n.TowerTeam\u0012\u0010\n\bis_empty\u0018\u0006 \u0001(\b\u0012\u0014\n\fbuff_id_list\u0018\u0004 \u0003(\r\u0012\u001b\n\u0013Unk2700_CBPNPEBMPOH\u0018\u0002 \u0001(\b\u0012\u0017\n\u000fcur_level_index\u0018\u0001 \u0001(\r\u0012\u0014\n\fcur_floor_id\u0018\u000f \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TowerCurLevelRecordOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { TowerTeamOuterClass.getDescriptor() });
        internal_static_TowerCurLevelRecord_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TowerCurLevelRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TowerCurLevelRecordOuterClass.internal_static_TowerCurLevelRecord_descriptor, new String[] { "TowerTeamList", "IsEmpty", "BuffIdList", "Unk2700CBPNPEBMPOH", "CurLevelIndex", "CurFloorId" });
        TowerTeamOuterClass.getDescriptor();
    }
    
    public static final class TowerCurLevelRecord extends GeneratedMessageV3 implements TowerCurLevelRecordOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int TOWER_TEAM_LIST_FIELD_NUMBER = 8;
        private List<TowerTeamOuterClass.TowerTeam> towerTeamList_;
        public static final int IS_EMPTY_FIELD_NUMBER = 6;
        private boolean isEmpty_;
        public static final int BUFF_ID_LIST_FIELD_NUMBER = 4;
        private Internal.IntList buffIdList_;
        private int buffIdListMemoizedSerializedSize;
        public static final int UNK2700_CBPNPEBMPOH_FIELD_NUMBER = 2;
        private boolean unk2700CBPNPEBMPOH_;
        public static final int CUR_LEVEL_INDEX_FIELD_NUMBER = 1;
        private int curLevelIndex_;
        public static final int CUR_FLOOR_ID_FIELD_NUMBER = 15;
        private int curFloorId_;
        private byte memoizedIsInitialized;
        private static final TowerCurLevelRecord DEFAULT_INSTANCE;
        private static final Parser<TowerCurLevelRecord> PARSER;
        
        private TowerCurLevelRecord(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.buffIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private TowerCurLevelRecord() {
            this.buffIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.towerTeamList_ = Collections.emptyList();
            this.buffIdList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TowerCurLevelRecord();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TowerCurLevelRecord(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.curLevelIndex_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.unk2700CBPNPEBMPOH_ = input.readBool();
                            continue;
                        }
                        case 32: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.buffIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.buffIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 34: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.buffIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.buffIdList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 48: {
                            this.isEmpty_ = input.readBool();
                            continue;
                        }
                        case 66: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.towerTeamList_ = new ArrayList<TowerTeamOuterClass.TowerTeam>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.towerTeamList_.add(input.readMessage(TowerTeamOuterClass.TowerTeam.parser(), extensionRegistry));
                            continue;
                        }
                        case 120: {
                            this.curFloorId_ = input.readUInt32();
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
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.buffIdList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.towerTeamList_ = Collections.unmodifiableList((List<? extends TowerTeamOuterClass.TowerTeam>)this.towerTeamList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return TowerCurLevelRecordOuterClass.internal_static_TowerCurLevelRecord_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TowerCurLevelRecordOuterClass.internal_static_TowerCurLevelRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerCurLevelRecord.class, Builder.class);
        }
        
        @Override
        public List<TowerTeamOuterClass.TowerTeam> getTowerTeamListList() {
            return this.towerTeamList_;
        }
        
        @Override
        public List<? extends TowerTeamOuterClass.TowerTeamOrBuilder> getTowerTeamListOrBuilderList() {
            return this.towerTeamList_;
        }
        
        @Override
        public int getTowerTeamListCount() {
            return this.towerTeamList_.size();
        }
        
        @Override
        public TowerTeamOuterClass.TowerTeam getTowerTeamList(final int index) {
            return this.towerTeamList_.get(index);
        }
        
        @Override
        public TowerTeamOuterClass.TowerTeamOrBuilder getTowerTeamListOrBuilder(final int index) {
            return this.towerTeamList_.get(index);
        }
        
        @Override
        public boolean getIsEmpty() {
            return this.isEmpty_;
        }
        
        @Override
        public List<Integer> getBuffIdListList() {
            return this.buffIdList_;
        }
        
        @Override
        public int getBuffIdListCount() {
            return this.buffIdList_.size();
        }
        
        @Override
        public int getBuffIdList(final int index) {
            return this.buffIdList_.getInt(index);
        }
        
        @Override
        public boolean getUnk2700CBPNPEBMPOH() {
            return this.unk2700CBPNPEBMPOH_;
        }
        
        @Override
        public int getCurLevelIndex() {
            return this.curLevelIndex_;
        }
        
        @Override
        public int getCurFloorId() {
            return this.curFloorId_;
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
            if (this.curLevelIndex_ != 0) {
                output.writeUInt32(1, this.curLevelIndex_);
            }
            if (this.unk2700CBPNPEBMPOH_) {
                output.writeBool(2, this.unk2700CBPNPEBMPOH_);
            }
            if (this.getBuffIdListList().size() > 0) {
                output.writeUInt32NoTag(34);
                output.writeUInt32NoTag(this.buffIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.buffIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.buffIdList_.getInt(i));
            }
            if (this.isEmpty_) {
                output.writeBool(6, this.isEmpty_);
            }
            for (int i = 0; i < this.towerTeamList_.size(); ++i) {
                output.writeMessage(8, this.towerTeamList_.get(i));
            }
            if (this.curFloorId_ != 0) {
                output.writeUInt32(15, this.curFloorId_);
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
            if (this.curLevelIndex_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.curLevelIndex_);
            }
            if (this.unk2700CBPNPEBMPOH_) {
                size += CodedOutputStream.computeBoolSize(2, this.unk2700CBPNPEBMPOH_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.buffIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.buffIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getBuffIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.buffIdListMemoizedSerializedSize = dataSize;
            if (this.isEmpty_) {
                size += CodedOutputStream.computeBoolSize(6, this.isEmpty_);
            }
            for (int j = 0; j < this.towerTeamList_.size(); ++j) {
                size += CodedOutputStream.computeMessageSize(8, this.towerTeamList_.get(j));
            }
            if (this.curFloorId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.curFloorId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TowerCurLevelRecord)) {
                return super.equals(obj);
            }
            final TowerCurLevelRecord other = (TowerCurLevelRecord)obj;
            return this.getTowerTeamListList().equals(other.getTowerTeamListList()) && this.getIsEmpty() == other.getIsEmpty() && this.getBuffIdListList().equals(other.getBuffIdListList()) && this.getUnk2700CBPNPEBMPOH() == other.getUnk2700CBPNPEBMPOH() && this.getCurLevelIndex() == other.getCurLevelIndex() && this.getCurFloorId() == other.getCurFloorId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getTowerTeamListCount() > 0) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getTowerTeamListList().hashCode();
            }
            hash = 37 * hash + 6;
            hash = 53 * hash + Internal.hashBoolean(this.getIsEmpty());
            if (this.getBuffIdListCount() > 0) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getBuffIdListList().hashCode();
            }
            hash = 37 * hash + 2;
            hash = 53 * hash + Internal.hashBoolean(this.getUnk2700CBPNPEBMPOH());
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getCurLevelIndex();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getCurFloorId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TowerCurLevelRecord parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TowerCurLevelRecord.PARSER.parseFrom(data);
        }
        
        public static TowerCurLevelRecord parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerCurLevelRecord.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerCurLevelRecord parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TowerCurLevelRecord.PARSER.parseFrom(data);
        }
        
        public static TowerCurLevelRecord parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerCurLevelRecord.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerCurLevelRecord parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TowerCurLevelRecord.PARSER.parseFrom(data);
        }
        
        public static TowerCurLevelRecord parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerCurLevelRecord.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerCurLevelRecord parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerCurLevelRecord.PARSER, input);
        }
        
        public static TowerCurLevelRecord parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerCurLevelRecord.PARSER, input, extensionRegistry);
        }
        
        public static TowerCurLevelRecord parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TowerCurLevelRecord.PARSER, input);
        }
        
        public static TowerCurLevelRecord parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TowerCurLevelRecord.PARSER, input, extensionRegistry);
        }
        
        public static TowerCurLevelRecord parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerCurLevelRecord.PARSER, input);
        }
        
        public static TowerCurLevelRecord parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerCurLevelRecord.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TowerCurLevelRecord.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TowerCurLevelRecord prototype) {
            return TowerCurLevelRecord.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TowerCurLevelRecord.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TowerCurLevelRecord getDefaultInstance() {
            return TowerCurLevelRecord.DEFAULT_INSTANCE;
        }
        
        public static Parser<TowerCurLevelRecord> parser() {
            return TowerCurLevelRecord.PARSER;
        }
        
        @Override
        public Parser<TowerCurLevelRecord> getParserForType() {
            return TowerCurLevelRecord.PARSER;
        }
        
        @Override
        public TowerCurLevelRecord getDefaultInstanceForType() {
            return TowerCurLevelRecord.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TowerCurLevelRecord();
            PARSER = new AbstractParser<TowerCurLevelRecord>() {
                @Override
                public TowerCurLevelRecord parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TowerCurLevelRecord(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TowerCurLevelRecordOrBuilder
        {
            private int bitField0_;
            private List<TowerTeamOuterClass.TowerTeam> towerTeamList_;
            private RepeatedFieldBuilderV3<TowerTeamOuterClass.TowerTeam, TowerTeamOuterClass.TowerTeam.Builder, TowerTeamOuterClass.TowerTeamOrBuilder> towerTeamListBuilder_;
            private boolean isEmpty_;
            private Internal.IntList buffIdList_;
            private boolean unk2700CBPNPEBMPOH_;
            private int curLevelIndex_;
            private int curFloorId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TowerCurLevelRecordOuterClass.internal_static_TowerCurLevelRecord_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TowerCurLevelRecordOuterClass.internal_static_TowerCurLevelRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerCurLevelRecord.class, Builder.class);
            }
            
            private Builder() {
                this.towerTeamList_ = Collections.emptyList();
                this.buffIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.towerTeamList_ = Collections.emptyList();
                this.buffIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TowerCurLevelRecord.alwaysUseFieldBuilders) {
                    this.getTowerTeamListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.towerTeamListBuilder_ == null) {
                    this.towerTeamList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.towerTeamListBuilder_.clear();
                }
                this.isEmpty_ = false;
                this.buffIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.unk2700CBPNPEBMPOH_ = false;
                this.curLevelIndex_ = 0;
                this.curFloorId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TowerCurLevelRecordOuterClass.internal_static_TowerCurLevelRecord_descriptor;
            }
            
            @Override
            public TowerCurLevelRecord getDefaultInstanceForType() {
                return TowerCurLevelRecord.getDefaultInstance();
            }
            
            @Override
            public TowerCurLevelRecord build() {
                final TowerCurLevelRecord result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TowerCurLevelRecord buildPartial() {
                final TowerCurLevelRecord result = new TowerCurLevelRecord(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.towerTeamListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.towerTeamList_ = Collections.unmodifiableList((List<? extends TowerTeamOuterClass.TowerTeam>)this.towerTeamList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.towerTeamList_ = this.towerTeamList_;
                }
                else {
                    result.towerTeamList_ = this.towerTeamListBuilder_.build();
                }
                result.isEmpty_ = this.isEmpty_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.buffIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.buffIdList_ = this.buffIdList_;
                result.unk2700CBPNPEBMPOH_ = this.unk2700CBPNPEBMPOH_;
                result.curLevelIndex_ = this.curLevelIndex_;
                result.curFloorId_ = this.curFloorId_;
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
                if (other instanceof TowerCurLevelRecord) {
                    return this.mergeFrom((TowerCurLevelRecord)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TowerCurLevelRecord other) {
                if (other == TowerCurLevelRecord.getDefaultInstance()) {
                    return this;
                }
                if (this.towerTeamListBuilder_ == null) {
                    if (!other.towerTeamList_.isEmpty()) {
                        if (this.towerTeamList_.isEmpty()) {
                            this.towerTeamList_ = other.towerTeamList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureTowerTeamListIsMutable();
                            this.towerTeamList_.addAll(other.towerTeamList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.towerTeamList_.isEmpty()) {
                    if (this.towerTeamListBuilder_.isEmpty()) {
                        this.towerTeamListBuilder_.dispose();
                        this.towerTeamListBuilder_ = null;
                        this.towerTeamList_ = other.towerTeamList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.towerTeamListBuilder_ = (TowerCurLevelRecord.alwaysUseFieldBuilders ? this.getTowerTeamListFieldBuilder() : null);
                    }
                    else {
                        this.towerTeamListBuilder_.addAllMessages(other.towerTeamList_);
                    }
                }
                if (other.getIsEmpty()) {
                    this.setIsEmpty(other.getIsEmpty());
                }
                if (!other.buffIdList_.isEmpty()) {
                    if (this.buffIdList_.isEmpty()) {
                        this.buffIdList_ = other.buffIdList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureBuffIdListIsMutable();
                        this.buffIdList_.addAll(other.buffIdList_);
                    }
                    this.onChanged();
                }
                if (other.getUnk2700CBPNPEBMPOH()) {
                    this.setUnk2700CBPNPEBMPOH(other.getUnk2700CBPNPEBMPOH());
                }
                if (other.getCurLevelIndex() != 0) {
                    this.setCurLevelIndex(other.getCurLevelIndex());
                }
                if (other.getCurFloorId() != 0) {
                    this.setCurFloorId(other.getCurFloorId());
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
                TowerCurLevelRecord parsedMessage = null;
                try {
                    parsedMessage = TowerCurLevelRecord.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TowerCurLevelRecord)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureTowerTeamListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.towerTeamList_ = new ArrayList<TowerTeamOuterClass.TowerTeam>(this.towerTeamList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<TowerTeamOuterClass.TowerTeam> getTowerTeamListList() {
                if (this.towerTeamListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends TowerTeamOuterClass.TowerTeam>)this.towerTeamList_);
                }
                return this.towerTeamListBuilder_.getMessageList();
            }
            
            @Override
            public int getTowerTeamListCount() {
                if (this.towerTeamListBuilder_ == null) {
                    return this.towerTeamList_.size();
                }
                return this.towerTeamListBuilder_.getCount();
            }
            
            @Override
            public TowerTeamOuterClass.TowerTeam getTowerTeamList(final int index) {
                if (this.towerTeamListBuilder_ == null) {
                    return this.towerTeamList_.get(index);
                }
                return this.towerTeamListBuilder_.getMessage(index);
            }
            
            public Builder setTowerTeamList(final int index, final TowerTeamOuterClass.TowerTeam value) {
                if (this.towerTeamListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTowerTeamListIsMutable();
                    this.towerTeamList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.towerTeamListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setTowerTeamList(final int index, final TowerTeamOuterClass.TowerTeam.Builder builderForValue) {
                if (this.towerTeamListBuilder_ == null) {
                    this.ensureTowerTeamListIsMutable();
                    this.towerTeamList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.towerTeamListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addTowerTeamList(final TowerTeamOuterClass.TowerTeam value) {
                if (this.towerTeamListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTowerTeamListIsMutable();
                    this.towerTeamList_.add(value);
                    this.onChanged();
                }
                else {
                    this.towerTeamListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addTowerTeamList(final int index, final TowerTeamOuterClass.TowerTeam value) {
                if (this.towerTeamListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTowerTeamListIsMutable();
                    this.towerTeamList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.towerTeamListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addTowerTeamList(final TowerTeamOuterClass.TowerTeam.Builder builderForValue) {
                if (this.towerTeamListBuilder_ == null) {
                    this.ensureTowerTeamListIsMutable();
                    this.towerTeamList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.towerTeamListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addTowerTeamList(final int index, final TowerTeamOuterClass.TowerTeam.Builder builderForValue) {
                if (this.towerTeamListBuilder_ == null) {
                    this.ensureTowerTeamListIsMutable();
                    this.towerTeamList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.towerTeamListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllTowerTeamList(final Iterable<? extends TowerTeamOuterClass.TowerTeam> values) {
                if (this.towerTeamListBuilder_ == null) {
                    this.ensureTowerTeamListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.towerTeamList_);
                    this.onChanged();
                }
                else {
                    this.towerTeamListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearTowerTeamList() {
                if (this.towerTeamListBuilder_ == null) {
                    this.towerTeamList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.towerTeamListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeTowerTeamList(final int index) {
                if (this.towerTeamListBuilder_ == null) {
                    this.ensureTowerTeamListIsMutable();
                    this.towerTeamList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.towerTeamListBuilder_.remove(index);
                }
                return this;
            }
            
            public TowerTeamOuterClass.TowerTeam.Builder getTowerTeamListBuilder(final int index) {
                return this.getTowerTeamListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public TowerTeamOuterClass.TowerTeamOrBuilder getTowerTeamListOrBuilder(final int index) {
                if (this.towerTeamListBuilder_ == null) {
                    return this.towerTeamList_.get(index);
                }
                return this.towerTeamListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends TowerTeamOuterClass.TowerTeamOrBuilder> getTowerTeamListOrBuilderList() {
                if (this.towerTeamListBuilder_ != null) {
                    return this.towerTeamListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends TowerTeamOuterClass.TowerTeamOrBuilder>)this.towerTeamList_);
            }
            
            public TowerTeamOuterClass.TowerTeam.Builder addTowerTeamListBuilder() {
                return this.getTowerTeamListFieldBuilder().addBuilder(TowerTeamOuterClass.TowerTeam.getDefaultInstance());
            }
            
            public TowerTeamOuterClass.TowerTeam.Builder addTowerTeamListBuilder(final int index) {
                return this.getTowerTeamListFieldBuilder().addBuilder(index, TowerTeamOuterClass.TowerTeam.getDefaultInstance());
            }
            
            public List<TowerTeamOuterClass.TowerTeam.Builder> getTowerTeamListBuilderList() {
                return this.getTowerTeamListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<TowerTeamOuterClass.TowerTeam, TowerTeamOuterClass.TowerTeam.Builder, TowerTeamOuterClass.TowerTeamOrBuilder> getTowerTeamListFieldBuilder() {
                if (this.towerTeamListBuilder_ == null) {
                    this.towerTeamListBuilder_ = new RepeatedFieldBuilderV3<TowerTeamOuterClass.TowerTeam, TowerTeamOuterClass.TowerTeam.Builder, TowerTeamOuterClass.TowerTeamOrBuilder>(this.towerTeamList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.towerTeamList_ = null;
                }
                return this.towerTeamListBuilder_;
            }
            
            @Override
            public boolean getIsEmpty() {
                return this.isEmpty_;
            }
            
            public Builder setIsEmpty(final boolean value) {
                this.isEmpty_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsEmpty() {
                this.isEmpty_ = false;
                this.onChanged();
                return this;
            }
            
            private void ensureBuffIdListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.buffIdList_ = GeneratedMessageV3.mutableCopy(this.buffIdList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getBuffIdListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.buffIdList_) : this.buffIdList_;
            }
            
            @Override
            public int getBuffIdListCount() {
                return this.buffIdList_.size();
            }
            
            @Override
            public int getBuffIdList(final int index) {
                return this.buffIdList_.getInt(index);
            }
            
            public Builder setBuffIdList(final int index, final int value) {
                this.ensureBuffIdListIsMutable();
                this.buffIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addBuffIdList(final int value) {
                this.ensureBuffIdListIsMutable();
                this.buffIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllBuffIdList(final Iterable<? extends Integer> values) {
                this.ensureBuffIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.buffIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearBuffIdList() {
                this.buffIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getUnk2700CBPNPEBMPOH() {
                return this.unk2700CBPNPEBMPOH_;
            }
            
            public Builder setUnk2700CBPNPEBMPOH(final boolean value) {
                this.unk2700CBPNPEBMPOH_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700CBPNPEBMPOH() {
                this.unk2700CBPNPEBMPOH_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCurLevelIndex() {
                return this.curLevelIndex_;
            }
            
            public Builder setCurLevelIndex(final int value) {
                this.curLevelIndex_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurLevelIndex() {
                this.curLevelIndex_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCurFloorId() {
                return this.curFloorId_;
            }
            
            public Builder setCurFloorId(final int value) {
                this.curFloorId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurFloorId() {
                this.curFloorId_ = 0;
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
    
    public interface TowerCurLevelRecordOrBuilder extends MessageOrBuilder
    {
        List<TowerTeamOuterClass.TowerTeam> getTowerTeamListList();
        
        TowerTeamOuterClass.TowerTeam getTowerTeamList(final int p0);
        
        int getTowerTeamListCount();
        
        List<? extends TowerTeamOuterClass.TowerTeamOrBuilder> getTowerTeamListOrBuilderList();
        
        TowerTeamOuterClass.TowerTeamOrBuilder getTowerTeamListOrBuilder(final int p0);
        
        boolean getIsEmpty();
        
        List<Integer> getBuffIdListList();
        
        int getBuffIdListCount();
        
        int getBuffIdList(final int p0);
        
        boolean getUnk2700CBPNPEBMPOH();
        
        int getCurLevelIndex();
        
        int getCurFloorId();
    }
}
