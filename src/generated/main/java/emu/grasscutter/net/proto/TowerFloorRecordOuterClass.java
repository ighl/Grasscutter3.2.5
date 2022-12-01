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
import java.util.List;
import com.google.protobuf.MapField;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class TowerFloorRecordOuterClass
{
    private static final Descriptors.Descriptor internal_static_TowerFloorRecord_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TowerFloorRecord_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_TowerFloorRecord_PassedLevelMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TowerFloorRecord_PassedLevelMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TowerFloorRecordOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TowerFloorRecordOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016TowerFloorRecord.proto\u001a\u0016TowerLevelRecord.proto\"\u00f5\u0001\n\u0010TowerFloorRecord\u0012\"\n\u001afloor_star_reward_progress\u0018\u000f \u0001(\r\u0012?\n\u0010passed_level_map\u0018\b \u0003(\u000b2%.TowerFloorRecord.PassedLevelMapEntry\u0012\u0010\n\bfloor_id\u0018\f \u0001(\r\u00123\n\u0018passed_level_record_list\u0018\u0002 \u0003(\u000b2\u0011.TowerLevelRecord\u001a5\n\u0013PassedLevelMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TowerFloorRecordOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { TowerLevelRecordOuterClass.getDescriptor() });
        internal_static_TowerFloorRecord_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TowerFloorRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TowerFloorRecordOuterClass.internal_static_TowerFloorRecord_descriptor, new String[] { "FloorStarRewardProgress", "PassedLevelMap", "FloorId", "PassedLevelRecordList" });
        internal_static_TowerFloorRecord_PassedLevelMapEntry_descriptor = TowerFloorRecordOuterClass.internal_static_TowerFloorRecord_descriptor.getNestedTypes().get(0);
        internal_static_TowerFloorRecord_PassedLevelMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TowerFloorRecordOuterClass.internal_static_TowerFloorRecord_PassedLevelMapEntry_descriptor, new String[] { "Key", "Value" });
        TowerLevelRecordOuterClass.getDescriptor();
    }
    
    public static final class TowerFloorRecord extends GeneratedMessageV3 implements TowerFloorRecordOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int FLOOR_STAR_REWARD_PROGRESS_FIELD_NUMBER = 15;
        private int floorStarRewardProgress_;
        public static final int PASSED_LEVEL_MAP_FIELD_NUMBER = 8;
        private MapField<Integer, Integer> passedLevelMap_;
        public static final int FLOOR_ID_FIELD_NUMBER = 12;
        private int floorId_;
        public static final int PASSED_LEVEL_RECORD_LIST_FIELD_NUMBER = 2;
        private List<TowerLevelRecordOuterClass.TowerLevelRecord> passedLevelRecordList_;
        private byte memoizedIsInitialized;
        private static final TowerFloorRecord DEFAULT_INSTANCE;
        private static final Parser<TowerFloorRecord> PARSER;
        
        private TowerFloorRecord(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private TowerFloorRecord() {
            this.memoizedIsInitialized = -1;
            this.passedLevelRecordList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TowerFloorRecord();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TowerFloorRecord(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 18: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.passedLevelRecordList_ = new ArrayList<TowerLevelRecordOuterClass.TowerLevelRecord>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.passedLevelRecordList_.add(input.readMessage(TowerLevelRecordOuterClass.TowerLevelRecord.parser(), extensionRegistry));
                            continue;
                        }
                        case 66: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.passedLevelMap_ = MapField.newMapField(PassedLevelMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x1;
                            }
                            final MapEntry<Integer, Integer> passedLevelMap__ = input.readMessage(PassedLevelMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.passedLevelMap_.getMutableMap().put(passedLevelMap__.getKey(), passedLevelMap__.getValue());
                            continue;
                        }
                        case 96: {
                            this.floorId_ = input.readUInt32();
                            continue;
                        }
                        case 120: {
                            this.floorStarRewardProgress_ = input.readUInt32();
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
                    this.passedLevelRecordList_ = Collections.unmodifiableList((List<? extends TowerLevelRecordOuterClass.TowerLevelRecord>)this.passedLevelRecordList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return TowerFloorRecordOuterClass.internal_static_TowerFloorRecord_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 8: {
                    return this.internalGetPassedLevelMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TowerFloorRecordOuterClass.internal_static_TowerFloorRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerFloorRecord.class, Builder.class);
        }
        
        @Override
        public int getFloorStarRewardProgress() {
            return this.floorStarRewardProgress_;
        }
        
        private MapField<Integer, Integer> internalGetPassedLevelMap() {
            if (this.passedLevelMap_ == null) {
                return MapField.emptyMapField(PassedLevelMapDefaultEntryHolder.defaultEntry);
            }
            return this.passedLevelMap_;
        }
        
        @Override
        public int getPassedLevelMapCount() {
            return this.internalGetPassedLevelMap().getMap().size();
        }
        
        @Override
        public boolean containsPassedLevelMap(final int key) {
            return this.internalGetPassedLevelMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, Integer> getPassedLevelMap() {
            return this.getPassedLevelMapMap();
        }
        
        @Override
        public Map<Integer, Integer> getPassedLevelMapMap() {
            return this.internalGetPassedLevelMap().getMap();
        }
        
        @Override
        public int getPassedLevelMapOrDefault(final int key, final int defaultValue) {
            final Map<Integer, Integer> map = this.internalGetPassedLevelMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public int getPassedLevelMapOrThrow(final int key) {
            final Map<Integer, Integer> map = this.internalGetPassedLevelMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public int getFloorId() {
            return this.floorId_;
        }
        
        @Override
        public List<TowerLevelRecordOuterClass.TowerLevelRecord> getPassedLevelRecordListList() {
            return this.passedLevelRecordList_;
        }
        
        @Override
        public List<? extends TowerLevelRecordOuterClass.TowerLevelRecordOrBuilder> getPassedLevelRecordListOrBuilderList() {
            return this.passedLevelRecordList_;
        }
        
        @Override
        public int getPassedLevelRecordListCount() {
            return this.passedLevelRecordList_.size();
        }
        
        @Override
        public TowerLevelRecordOuterClass.TowerLevelRecord getPassedLevelRecordList(final int index) {
            return this.passedLevelRecordList_.get(index);
        }
        
        @Override
        public TowerLevelRecordOuterClass.TowerLevelRecordOrBuilder getPassedLevelRecordListOrBuilder(final int index) {
            return this.passedLevelRecordList_.get(index);
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
            for (int i = 0; i < this.passedLevelRecordList_.size(); ++i) {
                output.writeMessage(2, this.passedLevelRecordList_.get(i));
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetPassedLevelMap(), PassedLevelMapDefaultEntryHolder.defaultEntry, 8);
            if (this.floorId_ != 0) {
                output.writeUInt32(12, this.floorId_);
            }
            if (this.floorStarRewardProgress_ != 0) {
                output.writeUInt32(15, this.floorStarRewardProgress_);
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
            for (int i = 0; i < this.passedLevelRecordList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(2, this.passedLevelRecordList_.get(i));
            }
            for (final Map.Entry<Integer, Integer> entry : this.internalGetPassedLevelMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> passedLevelMap__ = PassedLevelMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(8, passedLevelMap__);
            }
            if (this.floorId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.floorId_);
            }
            if (this.floorStarRewardProgress_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.floorStarRewardProgress_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TowerFloorRecord)) {
                return super.equals(obj);
            }
            final TowerFloorRecord other = (TowerFloorRecord)obj;
            return this.getFloorStarRewardProgress() == other.getFloorStarRewardProgress() && this.internalGetPassedLevelMap().equals(other.internalGetPassedLevelMap()) && this.getFloorId() == other.getFloorId() && this.getPassedLevelRecordListList().equals(other.getPassedLevelRecordListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getFloorStarRewardProgress();
            if (!this.internalGetPassedLevelMap().getMap().isEmpty()) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.internalGetPassedLevelMap().hashCode();
            }
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getFloorId();
            if (this.getPassedLevelRecordListCount() > 0) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getPassedLevelRecordListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TowerFloorRecord parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TowerFloorRecord.PARSER.parseFrom(data);
        }
        
        public static TowerFloorRecord parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerFloorRecord.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerFloorRecord parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TowerFloorRecord.PARSER.parseFrom(data);
        }
        
        public static TowerFloorRecord parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerFloorRecord.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerFloorRecord parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TowerFloorRecord.PARSER.parseFrom(data);
        }
        
        public static TowerFloorRecord parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerFloorRecord.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerFloorRecord parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerFloorRecord.PARSER, input);
        }
        
        public static TowerFloorRecord parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerFloorRecord.PARSER, input, extensionRegistry);
        }
        
        public static TowerFloorRecord parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TowerFloorRecord.PARSER, input);
        }
        
        public static TowerFloorRecord parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TowerFloorRecord.PARSER, input, extensionRegistry);
        }
        
        public static TowerFloorRecord parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerFloorRecord.PARSER, input);
        }
        
        public static TowerFloorRecord parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerFloorRecord.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TowerFloorRecord.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TowerFloorRecord prototype) {
            return TowerFloorRecord.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TowerFloorRecord.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TowerFloorRecord getDefaultInstance() {
            return TowerFloorRecord.DEFAULT_INSTANCE;
        }
        
        public static Parser<TowerFloorRecord> parser() {
            return TowerFloorRecord.PARSER;
        }
        
        @Override
        public Parser<TowerFloorRecord> getParserForType() {
            return TowerFloorRecord.PARSER;
        }
        
        @Override
        public TowerFloorRecord getDefaultInstanceForType() {
            return TowerFloorRecord.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TowerFloorRecord();
            PARSER = new AbstractParser<TowerFloorRecord>() {
                @Override
                public TowerFloorRecord parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TowerFloorRecord(input, extensionRegistry);
                }
            };
        }
        
        private static final class PassedLevelMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(TowerFloorRecordOuterClass.internal_static_TowerFloorRecord_PassedLevelMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TowerFloorRecordOrBuilder
        {
            private int bitField0_;
            private int floorStarRewardProgress_;
            private MapField<Integer, Integer> passedLevelMap_;
            private int floorId_;
            private List<TowerLevelRecordOuterClass.TowerLevelRecord> passedLevelRecordList_;
            private RepeatedFieldBuilderV3<TowerLevelRecordOuterClass.TowerLevelRecord, TowerLevelRecordOuterClass.TowerLevelRecord.Builder, TowerLevelRecordOuterClass.TowerLevelRecordOrBuilder> passedLevelRecordListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TowerFloorRecordOuterClass.internal_static_TowerFloorRecord_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 8: {
                        return this.internalGetPassedLevelMap();
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
                        return this.internalGetMutablePassedLevelMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TowerFloorRecordOuterClass.internal_static_TowerFloorRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerFloorRecord.class, Builder.class);
            }
            
            private Builder() {
                this.passedLevelRecordList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.passedLevelRecordList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TowerFloorRecord.alwaysUseFieldBuilders) {
                    this.getPassedLevelRecordListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.floorStarRewardProgress_ = 0;
                this.internalGetMutablePassedLevelMap().clear();
                this.floorId_ = 0;
                if (this.passedLevelRecordListBuilder_ == null) {
                    this.passedLevelRecordList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                else {
                    this.passedLevelRecordListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TowerFloorRecordOuterClass.internal_static_TowerFloorRecord_descriptor;
            }
            
            @Override
            public TowerFloorRecord getDefaultInstanceForType() {
                return TowerFloorRecord.getDefaultInstance();
            }
            
            @Override
            public TowerFloorRecord build() {
                final TowerFloorRecord result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TowerFloorRecord buildPartial() {
                final TowerFloorRecord result = new TowerFloorRecord(this);
                final int from_bitField0_ = this.bitField0_;
                result.floorStarRewardProgress_ = this.floorStarRewardProgress_;
                (result.passedLevelMap_ = this.internalGetPassedLevelMap()).makeImmutable();
                result.floorId_ = this.floorId_;
                if (this.passedLevelRecordListBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) != 0x0) {
                        this.passedLevelRecordList_ = Collections.unmodifiableList((List<? extends TowerLevelRecordOuterClass.TowerLevelRecord>)this.passedLevelRecordList_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.passedLevelRecordList_ = this.passedLevelRecordList_;
                }
                else {
                    result.passedLevelRecordList_ = this.passedLevelRecordListBuilder_.build();
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
                if (other instanceof TowerFloorRecord) {
                    return this.mergeFrom((TowerFloorRecord)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TowerFloorRecord other) {
                if (other == TowerFloorRecord.getDefaultInstance()) {
                    return this;
                }
                if (other.getFloorStarRewardProgress() != 0) {
                    this.setFloorStarRewardProgress(other.getFloorStarRewardProgress());
                }
                this.internalGetMutablePassedLevelMap().mergeFrom(other.internalGetPassedLevelMap());
                if (other.getFloorId() != 0) {
                    this.setFloorId(other.getFloorId());
                }
                if (this.passedLevelRecordListBuilder_ == null) {
                    if (!other.passedLevelRecordList_.isEmpty()) {
                        if (this.passedLevelRecordList_.isEmpty()) {
                            this.passedLevelRecordList_ = other.passedLevelRecordList_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        }
                        else {
                            this.ensurePassedLevelRecordListIsMutable();
                            this.passedLevelRecordList_.addAll(other.passedLevelRecordList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.passedLevelRecordList_.isEmpty()) {
                    if (this.passedLevelRecordListBuilder_.isEmpty()) {
                        this.passedLevelRecordListBuilder_.dispose();
                        this.passedLevelRecordListBuilder_ = null;
                        this.passedLevelRecordList_ = other.passedLevelRecordList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.passedLevelRecordListBuilder_ = (TowerFloorRecord.alwaysUseFieldBuilders ? this.getPassedLevelRecordListFieldBuilder() : null);
                    }
                    else {
                        this.passedLevelRecordListBuilder_.addAllMessages(other.passedLevelRecordList_);
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
                TowerFloorRecord parsedMessage = null;
                try {
                    parsedMessage = TowerFloorRecord.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TowerFloorRecord)e.getUnfinishedMessage();
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
            public int getFloorStarRewardProgress() {
                return this.floorStarRewardProgress_;
            }
            
            public Builder setFloorStarRewardProgress(final int value) {
                this.floorStarRewardProgress_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFloorStarRewardProgress() {
                this.floorStarRewardProgress_ = 0;
                this.onChanged();
                return this;
            }
            
            private MapField<Integer, Integer> internalGetPassedLevelMap() {
                if (this.passedLevelMap_ == null) {
                    return MapField.emptyMapField(PassedLevelMapDefaultEntryHolder.defaultEntry);
                }
                return this.passedLevelMap_;
            }
            
            private MapField<Integer, Integer> internalGetMutablePassedLevelMap() {
                this.onChanged();
                if (this.passedLevelMap_ == null) {
                    this.passedLevelMap_ = MapField.newMapField(PassedLevelMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.passedLevelMap_.isMutable()) {
                    this.passedLevelMap_ = this.passedLevelMap_.copy();
                }
                return this.passedLevelMap_;
            }
            
            @Override
            public int getPassedLevelMapCount() {
                return this.internalGetPassedLevelMap().getMap().size();
            }
            
            @Override
            public boolean containsPassedLevelMap(final int key) {
                return this.internalGetPassedLevelMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Integer> getPassedLevelMap() {
                return this.getPassedLevelMapMap();
            }
            
            @Override
            public Map<Integer, Integer> getPassedLevelMapMap() {
                return this.internalGetPassedLevelMap().getMap();
            }
            
            @Override
            public int getPassedLevelMapOrDefault(final int key, final int defaultValue) {
                final Map<Integer, Integer> map = this.internalGetPassedLevelMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public int getPassedLevelMapOrThrow(final int key) {
                final Map<Integer, Integer> map = this.internalGetPassedLevelMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearPassedLevelMap() {
                this.internalGetMutablePassedLevelMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removePassedLevelMap(final int key) {
                this.internalGetMutablePassedLevelMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, Integer> getMutablePassedLevelMap() {
                return this.internalGetMutablePassedLevelMap().getMutableMap();
            }
            
            public Builder putPassedLevelMap(final int key, final int value) {
                this.internalGetMutablePassedLevelMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllPassedLevelMap(final Map<Integer, Integer> values) {
                this.internalGetMutablePassedLevelMap().getMutableMap().putAll(values);
                return this;
            }
            
            @Override
            public int getFloorId() {
                return this.floorId_;
            }
            
            public Builder setFloorId(final int value) {
                this.floorId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFloorId() {
                this.floorId_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensurePassedLevelRecordListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.passedLevelRecordList_ = new ArrayList<TowerLevelRecordOuterClass.TowerLevelRecord>(this.passedLevelRecordList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<TowerLevelRecordOuterClass.TowerLevelRecord> getPassedLevelRecordListList() {
                if (this.passedLevelRecordListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends TowerLevelRecordOuterClass.TowerLevelRecord>)this.passedLevelRecordList_);
                }
                return this.passedLevelRecordListBuilder_.getMessageList();
            }
            
            @Override
            public int getPassedLevelRecordListCount() {
                if (this.passedLevelRecordListBuilder_ == null) {
                    return this.passedLevelRecordList_.size();
                }
                return this.passedLevelRecordListBuilder_.getCount();
            }
            
            @Override
            public TowerLevelRecordOuterClass.TowerLevelRecord getPassedLevelRecordList(final int index) {
                if (this.passedLevelRecordListBuilder_ == null) {
                    return this.passedLevelRecordList_.get(index);
                }
                return this.passedLevelRecordListBuilder_.getMessage(index);
            }
            
            public Builder setPassedLevelRecordList(final int index, final TowerLevelRecordOuterClass.TowerLevelRecord value) {
                if (this.passedLevelRecordListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePassedLevelRecordListIsMutable();
                    this.passedLevelRecordList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.passedLevelRecordListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setPassedLevelRecordList(final int index, final TowerLevelRecordOuterClass.TowerLevelRecord.Builder builderForValue) {
                if (this.passedLevelRecordListBuilder_ == null) {
                    this.ensurePassedLevelRecordListIsMutable();
                    this.passedLevelRecordList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.passedLevelRecordListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addPassedLevelRecordList(final TowerLevelRecordOuterClass.TowerLevelRecord value) {
                if (this.passedLevelRecordListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePassedLevelRecordListIsMutable();
                    this.passedLevelRecordList_.add(value);
                    this.onChanged();
                }
                else {
                    this.passedLevelRecordListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addPassedLevelRecordList(final int index, final TowerLevelRecordOuterClass.TowerLevelRecord value) {
                if (this.passedLevelRecordListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePassedLevelRecordListIsMutable();
                    this.passedLevelRecordList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.passedLevelRecordListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addPassedLevelRecordList(final TowerLevelRecordOuterClass.TowerLevelRecord.Builder builderForValue) {
                if (this.passedLevelRecordListBuilder_ == null) {
                    this.ensurePassedLevelRecordListIsMutable();
                    this.passedLevelRecordList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.passedLevelRecordListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addPassedLevelRecordList(final int index, final TowerLevelRecordOuterClass.TowerLevelRecord.Builder builderForValue) {
                if (this.passedLevelRecordListBuilder_ == null) {
                    this.ensurePassedLevelRecordListIsMutable();
                    this.passedLevelRecordList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.passedLevelRecordListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllPassedLevelRecordList(final Iterable<? extends TowerLevelRecordOuterClass.TowerLevelRecord> values) {
                if (this.passedLevelRecordListBuilder_ == null) {
                    this.ensurePassedLevelRecordListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.passedLevelRecordList_);
                    this.onChanged();
                }
                else {
                    this.passedLevelRecordListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearPassedLevelRecordList() {
                if (this.passedLevelRecordListBuilder_ == null) {
                    this.passedLevelRecordList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    this.onChanged();
                }
                else {
                    this.passedLevelRecordListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removePassedLevelRecordList(final int index) {
                if (this.passedLevelRecordListBuilder_ == null) {
                    this.ensurePassedLevelRecordListIsMutable();
                    this.passedLevelRecordList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.passedLevelRecordListBuilder_.remove(index);
                }
                return this;
            }
            
            public TowerLevelRecordOuterClass.TowerLevelRecord.Builder getPassedLevelRecordListBuilder(final int index) {
                return this.getPassedLevelRecordListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public TowerLevelRecordOuterClass.TowerLevelRecordOrBuilder getPassedLevelRecordListOrBuilder(final int index) {
                if (this.passedLevelRecordListBuilder_ == null) {
                    return this.passedLevelRecordList_.get(index);
                }
                return this.passedLevelRecordListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends TowerLevelRecordOuterClass.TowerLevelRecordOrBuilder> getPassedLevelRecordListOrBuilderList() {
                if (this.passedLevelRecordListBuilder_ != null) {
                    return this.passedLevelRecordListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends TowerLevelRecordOuterClass.TowerLevelRecordOrBuilder>)this.passedLevelRecordList_);
            }
            
            public TowerLevelRecordOuterClass.TowerLevelRecord.Builder addPassedLevelRecordListBuilder() {
                return this.getPassedLevelRecordListFieldBuilder().addBuilder(TowerLevelRecordOuterClass.TowerLevelRecord.getDefaultInstance());
            }
            
            public TowerLevelRecordOuterClass.TowerLevelRecord.Builder addPassedLevelRecordListBuilder(final int index) {
                return this.getPassedLevelRecordListFieldBuilder().addBuilder(index, TowerLevelRecordOuterClass.TowerLevelRecord.getDefaultInstance());
            }
            
            public List<TowerLevelRecordOuterClass.TowerLevelRecord.Builder> getPassedLevelRecordListBuilderList() {
                return this.getPassedLevelRecordListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<TowerLevelRecordOuterClass.TowerLevelRecord, TowerLevelRecordOuterClass.TowerLevelRecord.Builder, TowerLevelRecordOuterClass.TowerLevelRecordOrBuilder> getPassedLevelRecordListFieldBuilder() {
                if (this.passedLevelRecordListBuilder_ == null) {
                    this.passedLevelRecordListBuilder_ = new RepeatedFieldBuilderV3<TowerLevelRecordOuterClass.TowerLevelRecord, TowerLevelRecordOuterClass.TowerLevelRecord.Builder, TowerLevelRecordOuterClass.TowerLevelRecordOrBuilder>(this.passedLevelRecordList_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
                    this.passedLevelRecordList_ = null;
                }
                return this.passedLevelRecordListBuilder_;
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
    
    public interface TowerFloorRecordOrBuilder extends MessageOrBuilder
    {
        int getFloorStarRewardProgress();
        
        int getPassedLevelMapCount();
        
        boolean containsPassedLevelMap(final int p0);
        
        @Deprecated
        Map<Integer, Integer> getPassedLevelMap();
        
        Map<Integer, Integer> getPassedLevelMapMap();
        
        int getPassedLevelMapOrDefault(final int p0, final int p1);
        
        int getPassedLevelMapOrThrow(final int p0);
        
        int getFloorId();
        
        List<TowerLevelRecordOuterClass.TowerLevelRecord> getPassedLevelRecordListList();
        
        TowerLevelRecordOuterClass.TowerLevelRecord getPassedLevelRecordList(final int p0);
        
        int getPassedLevelRecordListCount();
        
        List<? extends TowerLevelRecordOuterClass.TowerLevelRecordOrBuilder> getPassedLevelRecordListOrBuilderList();
        
        TowerLevelRecordOuterClass.TowerLevelRecordOrBuilder getPassedLevelRecordListOrBuilder(final int p0);
    }
}
