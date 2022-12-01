// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.util.List;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class HomeFurnitureSuiteDataOuterClass
{
    private static final Descriptors.Descriptor internal_static_HomeFurnitureSuiteData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_HomeFurnitureSuiteData_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private HomeFurnitureSuiteDataOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HomeFurnitureSuiteDataOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cHomeFurnitureSuiteData.proto\u001a\fVector.proto\"\u0094\u0001\n\u0016HomeFurnitureSuiteData\u0012\u0017\n\u000fis_allow_summon\u0018\n \u0001(\b\u0012\u0010\n\bsuite_id\u0018\u0006 \u0001(\r\u0012\u001a\n\tspawn_pos\u0018\b \u0001(\u000b2\u0007.Vector\u0012\f\n\u0004guid\u0018\r \u0001(\r\u0012%\n\u001dincluded_furniture_index_list\u0018\u0001 \u0003(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HomeFurnitureSuiteDataOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { VectorOuterClass.getDescriptor() });
        internal_static_HomeFurnitureSuiteData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeFurnitureSuiteData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(HomeFurnitureSuiteDataOuterClass.internal_static_HomeFurnitureSuiteData_descriptor, new String[] { "IsAllowSummon", "SuiteId", "SpawnPos", "Guid", "IncludedFurnitureIndexList" });
        VectorOuterClass.getDescriptor();
    }
    
    public static final class HomeFurnitureSuiteData extends GeneratedMessageV3 implements HomeFurnitureSuiteDataOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int IS_ALLOW_SUMMON_FIELD_NUMBER = 10;
        private boolean isAllowSummon_;
        public static final int SUITE_ID_FIELD_NUMBER = 6;
        private int suiteId_;
        public static final int SPAWN_POS_FIELD_NUMBER = 8;
        private VectorOuterClass.Vector spawnPos_;
        public static final int GUID_FIELD_NUMBER = 13;
        private int guid_;
        public static final int INCLUDED_FURNITURE_INDEX_LIST_FIELD_NUMBER = 1;
        private Internal.IntList includedFurnitureIndexList_;
        private int includedFurnitureIndexListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final HomeFurnitureSuiteData DEFAULT_INSTANCE;
        private static final Parser<HomeFurnitureSuiteData> PARSER;
        
        private HomeFurnitureSuiteData(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.includedFurnitureIndexListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private HomeFurnitureSuiteData() {
            this.includedFurnitureIndexListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.includedFurnitureIndexList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new HomeFurnitureSuiteData();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private HomeFurnitureSuiteData(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.includedFurnitureIndexList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.includedFurnitureIndexList_.addInt(input.readInt32());
                            continue;
                        }
                        case 10: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.includedFurnitureIndexList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.includedFurnitureIndexList_.addInt(input.readInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 48: {
                            this.suiteId_ = input.readUInt32();
                            continue;
                        }
                        case 66: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.spawnPos_ != null) {
                                subBuilder = this.spawnPos_.toBuilder();
                            }
                            this.spawnPos_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.spawnPos_);
                                this.spawnPos_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 80: {
                            this.isAllowSummon_ = input.readBool();
                            continue;
                        }
                        case 104: {
                            this.guid_ = input.readUInt32();
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
                    this.includedFurnitureIndexList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return HomeFurnitureSuiteDataOuterClass.internal_static_HomeFurnitureSuiteData_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HomeFurnitureSuiteDataOuterClass.internal_static_HomeFurnitureSuiteData_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeFurnitureSuiteData.class, Builder.class);
        }
        
        @Override
        public boolean getIsAllowSummon() {
            return this.isAllowSummon_;
        }
        
        @Override
        public int getSuiteId() {
            return this.suiteId_;
        }
        
        @Override
        public boolean hasSpawnPos() {
            return this.spawnPos_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getSpawnPos() {
            return (this.spawnPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.spawnPos_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getSpawnPosOrBuilder() {
            return this.getSpawnPos();
        }
        
        @Override
        public int getGuid() {
            return this.guid_;
        }
        
        @Override
        public List<Integer> getIncludedFurnitureIndexListList() {
            return this.includedFurnitureIndexList_;
        }
        
        @Override
        public int getIncludedFurnitureIndexListCount() {
            return this.includedFurnitureIndexList_.size();
        }
        
        @Override
        public int getIncludedFurnitureIndexList(final int index) {
            return this.includedFurnitureIndexList_.getInt(index);
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
            if (this.getIncludedFurnitureIndexListList().size() > 0) {
                output.writeUInt32NoTag(10);
                output.writeUInt32NoTag(this.includedFurnitureIndexListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.includedFurnitureIndexList_.size(); ++i) {
                output.writeInt32NoTag(this.includedFurnitureIndexList_.getInt(i));
            }
            if (this.suiteId_ != 0) {
                output.writeUInt32(6, this.suiteId_);
            }
            if (this.spawnPos_ != null) {
                output.writeMessage(8, this.getSpawnPos());
            }
            if (this.isAllowSummon_) {
                output.writeBool(10, this.isAllowSummon_);
            }
            if (this.guid_ != 0) {
                output.writeUInt32(13, this.guid_);
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
            int dataSize = 0;
            for (int i = 0; i < this.includedFurnitureIndexList_.size(); ++i) {
                dataSize += CodedOutputStream.computeInt32SizeNoTag(this.includedFurnitureIndexList_.getInt(i));
            }
            size += dataSize;
            if (!this.getIncludedFurnitureIndexListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.includedFurnitureIndexListMemoizedSerializedSize = dataSize;
            if (this.suiteId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.suiteId_);
            }
            if (this.spawnPos_ != null) {
                size += CodedOutputStream.computeMessageSize(8, this.getSpawnPos());
            }
            if (this.isAllowSummon_) {
                size += CodedOutputStream.computeBoolSize(10, this.isAllowSummon_);
            }
            if (this.guid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.guid_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomeFurnitureSuiteData)) {
                return super.equals(obj);
            }
            final HomeFurnitureSuiteData other = (HomeFurnitureSuiteData)obj;
            return this.getIsAllowSummon() == other.getIsAllowSummon() && this.getSuiteId() == other.getSuiteId() && this.hasSpawnPos() == other.hasSpawnPos() && (!this.hasSpawnPos() || this.getSpawnPos().equals(other.getSpawnPos())) && this.getGuid() == other.getGuid() && this.getIncludedFurnitureIndexListList().equals(other.getIncludedFurnitureIndexListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 10;
            hash = 53 * hash + Internal.hashBoolean(this.getIsAllowSummon());
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getSuiteId();
            if (this.hasSpawnPos()) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getSpawnPos().hashCode();
            }
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getGuid();
            if (this.getIncludedFurnitureIndexListCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getIncludedFurnitureIndexListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static HomeFurnitureSuiteData parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return HomeFurnitureSuiteData.PARSER.parseFrom(data);
        }
        
        public static HomeFurnitureSuiteData parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeFurnitureSuiteData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeFurnitureSuiteData parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return HomeFurnitureSuiteData.PARSER.parseFrom(data);
        }
        
        public static HomeFurnitureSuiteData parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeFurnitureSuiteData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeFurnitureSuiteData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return HomeFurnitureSuiteData.PARSER.parseFrom(data);
        }
        
        public static HomeFurnitureSuiteData parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeFurnitureSuiteData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeFurnitureSuiteData parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeFurnitureSuiteData.PARSER, input);
        }
        
        public static HomeFurnitureSuiteData parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeFurnitureSuiteData.PARSER, input, extensionRegistry);
        }
        
        public static HomeFurnitureSuiteData parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeFurnitureSuiteData.PARSER, input);
        }
        
        public static HomeFurnitureSuiteData parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeFurnitureSuiteData.PARSER, input, extensionRegistry);
        }
        
        public static HomeFurnitureSuiteData parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeFurnitureSuiteData.PARSER, input);
        }
        
        public static HomeFurnitureSuiteData parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeFurnitureSuiteData.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return HomeFurnitureSuiteData.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final HomeFurnitureSuiteData prototype) {
            return HomeFurnitureSuiteData.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == HomeFurnitureSuiteData.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static HomeFurnitureSuiteData getDefaultInstance() {
            return HomeFurnitureSuiteData.DEFAULT_INSTANCE;
        }
        
        public static Parser<HomeFurnitureSuiteData> parser() {
            return HomeFurnitureSuiteData.PARSER;
        }
        
        @Override
        public Parser<HomeFurnitureSuiteData> getParserForType() {
            return HomeFurnitureSuiteData.PARSER;
        }
        
        @Override
        public HomeFurnitureSuiteData getDefaultInstanceForType() {
            return HomeFurnitureSuiteData.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new HomeFurnitureSuiteData();
            PARSER = new AbstractParser<HomeFurnitureSuiteData>() {
                @Override
                public HomeFurnitureSuiteData parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new HomeFurnitureSuiteData(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HomeFurnitureSuiteDataOrBuilder
        {
            private int bitField0_;
            private boolean isAllowSummon_;
            private int suiteId_;
            private VectorOuterClass.Vector spawnPos_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> spawnPosBuilder_;
            private int guid_;
            private Internal.IntList includedFurnitureIndexList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return HomeFurnitureSuiteDataOuterClass.internal_static_HomeFurnitureSuiteData_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HomeFurnitureSuiteDataOuterClass.internal_static_HomeFurnitureSuiteData_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeFurnitureSuiteData.class, Builder.class);
            }
            
            private Builder() {
                this.includedFurnitureIndexList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.includedFurnitureIndexList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (HomeFurnitureSuiteData.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.isAllowSummon_ = false;
                this.suiteId_ = 0;
                if (this.spawnPosBuilder_ == null) {
                    this.spawnPos_ = null;
                }
                else {
                    this.spawnPos_ = null;
                    this.spawnPosBuilder_ = null;
                }
                this.guid_ = 0;
                this.includedFurnitureIndexList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return HomeFurnitureSuiteDataOuterClass.internal_static_HomeFurnitureSuiteData_descriptor;
            }
            
            @Override
            public HomeFurnitureSuiteData getDefaultInstanceForType() {
                return HomeFurnitureSuiteData.getDefaultInstance();
            }
            
            @Override
            public HomeFurnitureSuiteData build() {
                final HomeFurnitureSuiteData result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public HomeFurnitureSuiteData buildPartial() {
                final HomeFurnitureSuiteData result = new HomeFurnitureSuiteData(this);
                final int from_bitField0_ = this.bitField0_;
                result.isAllowSummon_ = this.isAllowSummon_;
                result.suiteId_ = this.suiteId_;
                if (this.spawnPosBuilder_ == null) {
                    result.spawnPos_ = this.spawnPos_;
                }
                else {
                    result.spawnPos_ = this.spawnPosBuilder_.build();
                }
                result.guid_ = this.guid_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.includedFurnitureIndexList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.includedFurnitureIndexList_ = this.includedFurnitureIndexList_;
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
                if (other instanceof HomeFurnitureSuiteData) {
                    return this.mergeFrom((HomeFurnitureSuiteData)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final HomeFurnitureSuiteData other) {
                if (other == HomeFurnitureSuiteData.getDefaultInstance()) {
                    return this;
                }
                if (other.getIsAllowSummon()) {
                    this.setIsAllowSummon(other.getIsAllowSummon());
                }
                if (other.getSuiteId() != 0) {
                    this.setSuiteId(other.getSuiteId());
                }
                if (other.hasSpawnPos()) {
                    this.mergeSpawnPos(other.getSpawnPos());
                }
                if (other.getGuid() != 0) {
                    this.setGuid(other.getGuid());
                }
                if (!other.includedFurnitureIndexList_.isEmpty()) {
                    if (this.includedFurnitureIndexList_.isEmpty()) {
                        this.includedFurnitureIndexList_ = other.includedFurnitureIndexList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureIncludedFurnitureIndexListIsMutable();
                        this.includedFurnitureIndexList_.addAll(other.includedFurnitureIndexList_);
                    }
                    this.onChanged();
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
                HomeFurnitureSuiteData parsedMessage = null;
                try {
                    parsedMessage = HomeFurnitureSuiteData.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (HomeFurnitureSuiteData)e.getUnfinishedMessage();
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
            public boolean getIsAllowSummon() {
                return this.isAllowSummon_;
            }
            
            public Builder setIsAllowSummon(final boolean value) {
                this.isAllowSummon_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsAllowSummon() {
                this.isAllowSummon_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getSuiteId() {
                return this.suiteId_;
            }
            
            public Builder setSuiteId(final int value) {
                this.suiteId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSuiteId() {
                this.suiteId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasSpawnPos() {
                return this.spawnPosBuilder_ != null || this.spawnPos_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getSpawnPos() {
                if (this.spawnPosBuilder_ == null) {
                    return (this.spawnPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.spawnPos_;
                }
                return this.spawnPosBuilder_.getMessage();
            }
            
            public Builder setSpawnPos(final VectorOuterClass.Vector value) {
                if (this.spawnPosBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.spawnPos_ = value;
                    this.onChanged();
                }
                else {
                    this.spawnPosBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setSpawnPos(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.spawnPosBuilder_ == null) {
                    this.spawnPos_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.spawnPosBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeSpawnPos(final VectorOuterClass.Vector value) {
                if (this.spawnPosBuilder_ == null) {
                    if (this.spawnPos_ != null) {
                        this.spawnPos_ = VectorOuterClass.Vector.newBuilder(this.spawnPos_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.spawnPos_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.spawnPosBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearSpawnPos() {
                if (this.spawnPosBuilder_ == null) {
                    this.spawnPos_ = null;
                    this.onChanged();
                }
                else {
                    this.spawnPos_ = null;
                    this.spawnPosBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getSpawnPosBuilder() {
                this.onChanged();
                return this.getSpawnPosFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getSpawnPosOrBuilder() {
                if (this.spawnPosBuilder_ != null) {
                    return this.spawnPosBuilder_.getMessageOrBuilder();
                }
                return (this.spawnPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.spawnPos_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getSpawnPosFieldBuilder() {
                if (this.spawnPosBuilder_ == null) {
                    this.spawnPosBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getSpawnPos(), this.getParentForChildren(), this.isClean());
                    this.spawnPos_ = null;
                }
                return this.spawnPosBuilder_;
            }
            
            @Override
            public int getGuid() {
                return this.guid_;
            }
            
            public Builder setGuid(final int value) {
                this.guid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGuid() {
                this.guid_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureIncludedFurnitureIndexListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.includedFurnitureIndexList_ = GeneratedMessageV3.mutableCopy(this.includedFurnitureIndexList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getIncludedFurnitureIndexListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.includedFurnitureIndexList_) : this.includedFurnitureIndexList_;
            }
            
            @Override
            public int getIncludedFurnitureIndexListCount() {
                return this.includedFurnitureIndexList_.size();
            }
            
            @Override
            public int getIncludedFurnitureIndexList(final int index) {
                return this.includedFurnitureIndexList_.getInt(index);
            }
            
            public Builder setIncludedFurnitureIndexList(final int index, final int value) {
                this.ensureIncludedFurnitureIndexListIsMutable();
                this.includedFurnitureIndexList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addIncludedFurnitureIndexList(final int value) {
                this.ensureIncludedFurnitureIndexListIsMutable();
                this.includedFurnitureIndexList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllIncludedFurnitureIndexList(final Iterable<? extends Integer> values) {
                this.ensureIncludedFurnitureIndexListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.includedFurnitureIndexList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearIncludedFurnitureIndexList() {
                this.includedFurnitureIndexList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
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
    
    public interface HomeFurnitureSuiteDataOrBuilder extends MessageOrBuilder
    {
        boolean getIsAllowSummon();
        
        int getSuiteId();
        
        boolean hasSpawnPos();
        
        VectorOuterClass.Vector getSpawnPos();
        
        VectorOuterClass.VectorOrBuilder getSpawnPosOrBuilder();
        
        int getGuid();
        
        List<Integer> getIncludedFurnitureIndexListList();
        
        int getIncludedFurnitureIndexListCount();
        
        int getIncludedFurnitureIndexList(final int p0);
    }
}
