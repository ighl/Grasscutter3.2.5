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

public final class BossChestInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_BossChestInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BossChestInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_BossChestInfo_UidDiscountMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BossChestInfo_UidDiscountMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private BossChestInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return BossChestInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0013BossChestInfo.proto\u001a!WeeklyBossResinDiscountInfo.proto\"\u00ff\u0001\n\rBossChestInfo\u0012\u0019\n\u0011monster_config_id\u0018\u0001 \u0001(\r\u0012\r\n\u0005resin\u0018\u0002 \u0001(\r\u0012\u0017\n\u000fremain_uid_list\u0018\u0003 \u0003(\r\u0012\u0018\n\u0010qualify_uid_list\u0018\u0004 \u0003(\r\u0012<\n\u0010uid_discount_map\u0018\u0005 \u0003(\u000b2\".BossChestInfo.UidDiscountMapEntry\u001aS\n\u0013UidDiscountMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012+\n\u0005value\u0018\u0002 \u0001(\u000b2\u001c.WeeklyBossResinDiscountInfo:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        BossChestInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { WeeklyBossResinDiscountInfoOuterClass.getDescriptor() });
        internal_static_BossChestInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_BossChestInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(BossChestInfoOuterClass.internal_static_BossChestInfo_descriptor, new String[] { "MonsterConfigId", "Resin", "RemainUidList", "QualifyUidList", "UidDiscountMap" });
        internal_static_BossChestInfo_UidDiscountMapEntry_descriptor = BossChestInfoOuterClass.internal_static_BossChestInfo_descriptor.getNestedTypes().get(0);
        internal_static_BossChestInfo_UidDiscountMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(BossChestInfoOuterClass.internal_static_BossChestInfo_UidDiscountMapEntry_descriptor, new String[] { "Key", "Value" });
        WeeklyBossResinDiscountInfoOuterClass.getDescriptor();
    }
    
    public static final class BossChestInfo extends GeneratedMessageV3 implements BossChestInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int MONSTER_CONFIG_ID_FIELD_NUMBER = 1;
        private int monsterConfigId_;
        public static final int RESIN_FIELD_NUMBER = 2;
        private int resin_;
        public static final int REMAIN_UID_LIST_FIELD_NUMBER = 3;
        private Internal.IntList remainUidList_;
        private int remainUidListMemoizedSerializedSize;
        public static final int QUALIFY_UID_LIST_FIELD_NUMBER = 4;
        private Internal.IntList qualifyUidList_;
        private int qualifyUidListMemoizedSerializedSize;
        public static final int UID_DISCOUNT_MAP_FIELD_NUMBER = 5;
        private MapField<Integer, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo> uidDiscountMap_;
        private byte memoizedIsInitialized;
        private static final BossChestInfo DEFAULT_INSTANCE;
        private static final Parser<BossChestInfo> PARSER;
        
        private BossChestInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.remainUidListMemoizedSerializedSize = -1;
            this.qualifyUidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private BossChestInfo() {
            this.remainUidListMemoizedSerializedSize = -1;
            this.qualifyUidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.remainUidList_ = GeneratedMessageV3.emptyIntList();
            this.qualifyUidList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new BossChestInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private BossChestInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.monsterConfigId_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.resin_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.remainUidList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.remainUidList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 26: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.remainUidList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.remainUidList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 32: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.qualifyUidList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.qualifyUidList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 34: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.qualifyUidList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.qualifyUidList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 42: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.uidDiscountMap_ = MapField.newMapField(UidDiscountMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x4;
                            }
                            final MapEntry<Integer, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo> uidDiscountMap__ = input.readMessage(UidDiscountMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.uidDiscountMap_.getMutableMap().put(uidDiscountMap__.getKey(), uidDiscountMap__.getValue());
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
                    this.remainUidList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.qualifyUidList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return BossChestInfoOuterClass.internal_static_BossChestInfo_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 5: {
                    return this.internalGetUidDiscountMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return BossChestInfoOuterClass.internal_static_BossChestInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(BossChestInfo.class, Builder.class);
        }
        
        @Override
        public int getMonsterConfigId() {
            return this.monsterConfigId_;
        }
        
        @Override
        public int getResin() {
            return this.resin_;
        }
        
        @Override
        public List<Integer> getRemainUidListList() {
            return this.remainUidList_;
        }
        
        @Override
        public int getRemainUidListCount() {
            return this.remainUidList_.size();
        }
        
        @Override
        public int getRemainUidList(final int index) {
            return this.remainUidList_.getInt(index);
        }
        
        @Override
        public List<Integer> getQualifyUidListList() {
            return this.qualifyUidList_;
        }
        
        @Override
        public int getQualifyUidListCount() {
            return this.qualifyUidList_.size();
        }
        
        @Override
        public int getQualifyUidList(final int index) {
            return this.qualifyUidList_.getInt(index);
        }
        
        private MapField<Integer, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo> internalGetUidDiscountMap() {
            if (this.uidDiscountMap_ == null) {
                return MapField.emptyMapField(UidDiscountMapDefaultEntryHolder.defaultEntry);
            }
            return this.uidDiscountMap_;
        }
        
        @Override
        public int getUidDiscountMapCount() {
            return this.internalGetUidDiscountMap().getMap().size();
        }
        
        @Override
        public boolean containsUidDiscountMap(final int key) {
            return this.internalGetUidDiscountMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo> getUidDiscountMap() {
            return this.getUidDiscountMapMap();
        }
        
        @Override
        public Map<Integer, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo> getUidDiscountMapMap() {
            return this.internalGetUidDiscountMap().getMap();
        }
        
        @Override
        public WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo getUidDiscountMapOrDefault(final int key, final WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo defaultValue) {
            final Map<Integer, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo> map = this.internalGetUidDiscountMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo getUidDiscountMapOrThrow(final int key) {
            final Map<Integer, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo> map = this.internalGetUidDiscountMap().getMap();
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
            if (this.monsterConfigId_ != 0) {
                output.writeUInt32(1, this.monsterConfigId_);
            }
            if (this.resin_ != 0) {
                output.writeUInt32(2, this.resin_);
            }
            if (this.getRemainUidListList().size() > 0) {
                output.writeUInt32NoTag(26);
                output.writeUInt32NoTag(this.remainUidListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.remainUidList_.size(); ++i) {
                output.writeUInt32NoTag(this.remainUidList_.getInt(i));
            }
            if (this.getQualifyUidListList().size() > 0) {
                output.writeUInt32NoTag(34);
                output.writeUInt32NoTag(this.qualifyUidListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.qualifyUidList_.size(); ++i) {
                output.writeUInt32NoTag(this.qualifyUidList_.getInt(i));
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetUidDiscountMap(), UidDiscountMapDefaultEntryHolder.defaultEntry, 5);
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.monsterConfigId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.monsterConfigId_);
            }
            if (this.resin_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.resin_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.remainUidList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.remainUidList_.getInt(i));
            }
            size += dataSize;
            if (!this.getRemainUidListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.remainUidListMemoizedSerializedSize = dataSize;
            dataSize = 0;
            for (int i = 0; i < this.qualifyUidList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.qualifyUidList_.getInt(i));
            }
            size += dataSize;
            if (!this.getQualifyUidListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.qualifyUidListMemoizedSerializedSize = dataSize;
            for (final Map.Entry<Integer, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo> entry : this.internalGetUidDiscountMap().getMap().entrySet()) {
                final MapEntry<Integer, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo> uidDiscountMap__ = UidDiscountMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(5, uidDiscountMap__);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BossChestInfo)) {
                return super.equals(obj);
            }
            final BossChestInfo other = (BossChestInfo)obj;
            return this.getMonsterConfigId() == other.getMonsterConfigId() && this.getResin() == other.getResin() && this.getRemainUidListList().equals(other.getRemainUidListList()) && this.getQualifyUidListList().equals(other.getQualifyUidListList()) && this.internalGetUidDiscountMap().equals(other.internalGetUidDiscountMap()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getMonsterConfigId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getResin();
            if (this.getRemainUidListCount() > 0) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getRemainUidListList().hashCode();
            }
            if (this.getQualifyUidListCount() > 0) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getQualifyUidListList().hashCode();
            }
            if (!this.internalGetUidDiscountMap().getMap().isEmpty()) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.internalGetUidDiscountMap().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static BossChestInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return BossChestInfo.PARSER.parseFrom(data);
        }
        
        public static BossChestInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BossChestInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BossChestInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return BossChestInfo.PARSER.parseFrom(data);
        }
        
        public static BossChestInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BossChestInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BossChestInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return BossChestInfo.PARSER.parseFrom(data);
        }
        
        public static BossChestInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BossChestInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BossChestInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BossChestInfo.PARSER, input);
        }
        
        public static BossChestInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BossChestInfo.PARSER, input, extensionRegistry);
        }
        
        public static BossChestInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BossChestInfo.PARSER, input);
        }
        
        public static BossChestInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BossChestInfo.PARSER, input, extensionRegistry);
        }
        
        public static BossChestInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BossChestInfo.PARSER, input);
        }
        
        public static BossChestInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BossChestInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return BossChestInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final BossChestInfo prototype) {
            return BossChestInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == BossChestInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static BossChestInfo getDefaultInstance() {
            return BossChestInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<BossChestInfo> parser() {
            return BossChestInfo.PARSER;
        }
        
        @Override
        public Parser<BossChestInfo> getParserForType() {
            return BossChestInfo.PARSER;
        }
        
        @Override
        public BossChestInfo getDefaultInstanceForType() {
            return BossChestInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new BossChestInfo();
            PARSER = new AbstractParser<BossChestInfo>() {
                @Override
                public BossChestInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new BossChestInfo(input, extensionRegistry);
                }
            };
        }
        
        private static final class UidDiscountMapDefaultEntryHolder
        {
            static final MapEntry<Integer, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(BossChestInfoOuterClass.internal_static_BossChestInfo_UidDiscountMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.MESSAGE, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo.getDefaultInstance());
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BossChestInfoOrBuilder
        {
            private int bitField0_;
            private int monsterConfigId_;
            private int resin_;
            private Internal.IntList remainUidList_;
            private Internal.IntList qualifyUidList_;
            private MapField<Integer, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo> uidDiscountMap_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return BossChestInfoOuterClass.internal_static_BossChestInfo_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 5: {
                        return this.internalGetUidDiscountMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected MapField internalGetMutableMapField(final int number) {
                switch (number) {
                    case 5: {
                        return this.internalGetMutableUidDiscountMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return BossChestInfoOuterClass.internal_static_BossChestInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(BossChestInfo.class, Builder.class);
            }
            
            private Builder() {
                this.remainUidList_ = GeneratedMessageV3.emptyIntList();
                this.qualifyUidList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.remainUidList_ = GeneratedMessageV3.emptyIntList();
                this.qualifyUidList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (BossChestInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.monsterConfigId_ = 0;
                this.resin_ = 0;
                this.remainUidList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.qualifyUidList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.internalGetMutableUidDiscountMap().clear();
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return BossChestInfoOuterClass.internal_static_BossChestInfo_descriptor;
            }
            
            @Override
            public BossChestInfo getDefaultInstanceForType() {
                return BossChestInfo.getDefaultInstance();
            }
            
            @Override
            public BossChestInfo build() {
                final BossChestInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public BossChestInfo buildPartial() {
                final BossChestInfo result = new BossChestInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.monsterConfigId_ = this.monsterConfigId_;
                result.resin_ = this.resin_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.remainUidList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.remainUidList_ = this.remainUidList_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.qualifyUidList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.qualifyUidList_ = this.qualifyUidList_;
                (result.uidDiscountMap_ = this.internalGetUidDiscountMap()).makeImmutable();
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
                if (other instanceof BossChestInfo) {
                    return this.mergeFrom((BossChestInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final BossChestInfo other) {
                if (other == BossChestInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getMonsterConfigId() != 0) {
                    this.setMonsterConfigId(other.getMonsterConfigId());
                }
                if (other.getResin() != 0) {
                    this.setResin(other.getResin());
                }
                if (!other.remainUidList_.isEmpty()) {
                    if (this.remainUidList_.isEmpty()) {
                        this.remainUidList_ = other.remainUidList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureRemainUidListIsMutable();
                        this.remainUidList_.addAll(other.remainUidList_);
                    }
                    this.onChanged();
                }
                if (!other.qualifyUidList_.isEmpty()) {
                    if (this.qualifyUidList_.isEmpty()) {
                        this.qualifyUidList_ = other.qualifyUidList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureQualifyUidListIsMutable();
                        this.qualifyUidList_.addAll(other.qualifyUidList_);
                    }
                    this.onChanged();
                }
                this.internalGetMutableUidDiscountMap().mergeFrom(other.internalGetUidDiscountMap());
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
                BossChestInfo parsedMessage = null;
                try {
                    parsedMessage = BossChestInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (BossChestInfo)e.getUnfinishedMessage();
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
            public int getMonsterConfigId() {
                return this.monsterConfigId_;
            }
            
            public Builder setMonsterConfigId(final int value) {
                this.monsterConfigId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMonsterConfigId() {
                this.monsterConfigId_ = 0;
                this.onChanged();
                return this;
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
            
            private void ensureRemainUidListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.remainUidList_ = GeneratedMessageV3.mutableCopy(this.remainUidList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getRemainUidListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.remainUidList_) : this.remainUidList_;
            }
            
            @Override
            public int getRemainUidListCount() {
                return this.remainUidList_.size();
            }
            
            @Override
            public int getRemainUidList(final int index) {
                return this.remainUidList_.getInt(index);
            }
            
            public Builder setRemainUidList(final int index, final int value) {
                this.ensureRemainUidListIsMutable();
                this.remainUidList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addRemainUidList(final int value) {
                this.ensureRemainUidListIsMutable();
                this.remainUidList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllRemainUidList(final Iterable<? extends Integer> values) {
                this.ensureRemainUidListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.remainUidList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearRemainUidList() {
                this.remainUidList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            private void ensureQualifyUidListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.qualifyUidList_ = GeneratedMessageV3.mutableCopy(this.qualifyUidList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getQualifyUidListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.qualifyUidList_) : this.qualifyUidList_;
            }
            
            @Override
            public int getQualifyUidListCount() {
                return this.qualifyUidList_.size();
            }
            
            @Override
            public int getQualifyUidList(final int index) {
                return this.qualifyUidList_.getInt(index);
            }
            
            public Builder setQualifyUidList(final int index, final int value) {
                this.ensureQualifyUidListIsMutable();
                this.qualifyUidList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addQualifyUidList(final int value) {
                this.ensureQualifyUidListIsMutable();
                this.qualifyUidList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllQualifyUidList(final Iterable<? extends Integer> values) {
                this.ensureQualifyUidListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.qualifyUidList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearQualifyUidList() {
                this.qualifyUidList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
                return this;
            }
            
            private MapField<Integer, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo> internalGetUidDiscountMap() {
                if (this.uidDiscountMap_ == null) {
                    return MapField.emptyMapField(UidDiscountMapDefaultEntryHolder.defaultEntry);
                }
                return this.uidDiscountMap_;
            }
            
            private MapField<Integer, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo> internalGetMutableUidDiscountMap() {
                this.onChanged();
                if (this.uidDiscountMap_ == null) {
                    this.uidDiscountMap_ = MapField.newMapField(UidDiscountMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.uidDiscountMap_.isMutable()) {
                    this.uidDiscountMap_ = this.uidDiscountMap_.copy();
                }
                return this.uidDiscountMap_;
            }
            
            @Override
            public int getUidDiscountMapCount() {
                return this.internalGetUidDiscountMap().getMap().size();
            }
            
            @Override
            public boolean containsUidDiscountMap(final int key) {
                return this.internalGetUidDiscountMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo> getUidDiscountMap() {
                return this.getUidDiscountMapMap();
            }
            
            @Override
            public Map<Integer, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo> getUidDiscountMapMap() {
                return this.internalGetUidDiscountMap().getMap();
            }
            
            @Override
            public WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo getUidDiscountMapOrDefault(final int key, final WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo defaultValue) {
                final Map<Integer, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo> map = this.internalGetUidDiscountMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo getUidDiscountMapOrThrow(final int key) {
                final Map<Integer, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo> map = this.internalGetUidDiscountMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearUidDiscountMap() {
                this.internalGetMutableUidDiscountMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeUidDiscountMap(final int key) {
                this.internalGetMutableUidDiscountMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo> getMutableUidDiscountMap() {
                return this.internalGetMutableUidDiscountMap().getMutableMap();
            }
            
            public Builder putUidDiscountMap(final int key, final WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.internalGetMutableUidDiscountMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllUidDiscountMap(final Map<Integer, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo> values) {
                this.internalGetMutableUidDiscountMap().getMutableMap().putAll(values);
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
    
    public interface BossChestInfoOrBuilder extends MessageOrBuilder
    {
        int getMonsterConfigId();
        
        int getResin();
        
        List<Integer> getRemainUidListList();
        
        int getRemainUidListCount();
        
        int getRemainUidList(final int p0);
        
        List<Integer> getQualifyUidListList();
        
        int getQualifyUidListCount();
        
        int getQualifyUidList(final int p0);
        
        int getUidDiscountMapCount();
        
        boolean containsUidDiscountMap(final int p0);
        
        @Deprecated
        Map<Integer, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo> getUidDiscountMap();
        
        Map<Integer, WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo> getUidDiscountMapMap();
        
        WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo getUidDiscountMapOrDefault(final int p0, final WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo p1);
        
        WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo getUidDiscountMapOrThrow(final int p0);
    }
}
