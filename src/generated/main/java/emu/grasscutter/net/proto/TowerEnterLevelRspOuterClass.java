// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
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

public final class TowerEnterLevelRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_TowerEnterLevelRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TowerEnterLevelRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TowerEnterLevelRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TowerEnterLevelRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018TowerEnterLevelRsp.proto\"h\n\u0012TowerEnterLevelRsp\u0012\u001a\n\u0012tower_buff_id_list\u0018\n \u0003(\r\u0012\u000f\n\u0007retcode\u0018\u0001 \u0001(\u0005\u0012\u0013\n\u000blevel_index\u0018\u000e \u0001(\r\u0012\u0010\n\bfloor_id\u0018\u0005 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TowerEnterLevelRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_TowerEnterLevelRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TowerEnterLevelRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TowerEnterLevelRspOuterClass.internal_static_TowerEnterLevelRsp_descriptor, new String[] { "TowerBuffIdList", "Retcode", "LevelIndex", "FloorId" });
    }
    
    public static final class TowerEnterLevelRsp extends GeneratedMessageV3 implements TowerEnterLevelRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int TOWER_BUFF_ID_LIST_FIELD_NUMBER = 10;
        private Internal.IntList towerBuffIdList_;
        private int towerBuffIdListMemoizedSerializedSize;
        public static final int RETCODE_FIELD_NUMBER = 1;
        private int retcode_;
        public static final int LEVEL_INDEX_FIELD_NUMBER = 14;
        private int levelIndex_;
        public static final int FLOOR_ID_FIELD_NUMBER = 5;
        private int floorId_;
        private byte memoizedIsInitialized;
        private static final TowerEnterLevelRsp DEFAULT_INSTANCE;
        private static final Parser<TowerEnterLevelRsp> PARSER;
        
        private TowerEnterLevelRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.towerBuffIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private TowerEnterLevelRsp() {
            this.towerBuffIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.towerBuffIdList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TowerEnterLevelRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TowerEnterLevelRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 40: {
                            this.floorId_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.towerBuffIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.towerBuffIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 82: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.towerBuffIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.towerBuffIdList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 112: {
                            this.levelIndex_ = input.readUInt32();
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
                    this.towerBuffIdList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return TowerEnterLevelRspOuterClass.internal_static_TowerEnterLevelRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TowerEnterLevelRspOuterClass.internal_static_TowerEnterLevelRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerEnterLevelRsp.class, Builder.class);
        }
        
        @Override
        public List<Integer> getTowerBuffIdListList() {
            return this.towerBuffIdList_;
        }
        
        @Override
        public int getTowerBuffIdListCount() {
            return this.towerBuffIdList_.size();
        }
        
        @Override
        public int getTowerBuffIdList(final int index) {
            return this.towerBuffIdList_.getInt(index);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public int getLevelIndex() {
            return this.levelIndex_;
        }
        
        @Override
        public int getFloorId() {
            return this.floorId_;
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
            if (this.retcode_ != 0) {
                output.writeInt32(1, this.retcode_);
            }
            if (this.floorId_ != 0) {
                output.writeUInt32(5, this.floorId_);
            }
            if (this.getTowerBuffIdListList().size() > 0) {
                output.writeUInt32NoTag(82);
                output.writeUInt32NoTag(this.towerBuffIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.towerBuffIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.towerBuffIdList_.getInt(i));
            }
            if (this.levelIndex_ != 0) {
                output.writeUInt32(14, this.levelIndex_);
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
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(1, this.retcode_);
            }
            if (this.floorId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.floorId_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.towerBuffIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.towerBuffIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getTowerBuffIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.towerBuffIdListMemoizedSerializedSize = dataSize;
            if (this.levelIndex_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.levelIndex_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TowerEnterLevelRsp)) {
                return super.equals(obj);
            }
            final TowerEnterLevelRsp other = (TowerEnterLevelRsp)obj;
            return this.getTowerBuffIdListList().equals(other.getTowerBuffIdListList()) && this.getRetcode() == other.getRetcode() && this.getLevelIndex() == other.getLevelIndex() && this.getFloorId() == other.getFloorId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getTowerBuffIdListCount() > 0) {
                hash = 37 * hash + 10;
                hash = 53 * hash + this.getTowerBuffIdListList().hashCode();
            }
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getLevelIndex();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getFloorId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TowerEnterLevelRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TowerEnterLevelRsp.PARSER.parseFrom(data);
        }
        
        public static TowerEnterLevelRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerEnterLevelRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerEnterLevelRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TowerEnterLevelRsp.PARSER.parseFrom(data);
        }
        
        public static TowerEnterLevelRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerEnterLevelRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerEnterLevelRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TowerEnterLevelRsp.PARSER.parseFrom(data);
        }
        
        public static TowerEnterLevelRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerEnterLevelRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerEnterLevelRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerEnterLevelRsp.PARSER, input);
        }
        
        public static TowerEnterLevelRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerEnterLevelRsp.PARSER, input, extensionRegistry);
        }
        
        public static TowerEnterLevelRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TowerEnterLevelRsp.PARSER, input);
        }
        
        public static TowerEnterLevelRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TowerEnterLevelRsp.PARSER, input, extensionRegistry);
        }
        
        public static TowerEnterLevelRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerEnterLevelRsp.PARSER, input);
        }
        
        public static TowerEnterLevelRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerEnterLevelRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TowerEnterLevelRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TowerEnterLevelRsp prototype) {
            return TowerEnterLevelRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TowerEnterLevelRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TowerEnterLevelRsp getDefaultInstance() {
            return TowerEnterLevelRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<TowerEnterLevelRsp> parser() {
            return TowerEnterLevelRsp.PARSER;
        }
        
        @Override
        public Parser<TowerEnterLevelRsp> getParserForType() {
            return TowerEnterLevelRsp.PARSER;
        }
        
        @Override
        public TowerEnterLevelRsp getDefaultInstanceForType() {
            return TowerEnterLevelRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TowerEnterLevelRsp();
            PARSER = new AbstractParser<TowerEnterLevelRsp>() {
                @Override
                public TowerEnterLevelRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TowerEnterLevelRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TowerEnterLevelRspOrBuilder
        {
            private int bitField0_;
            private Internal.IntList towerBuffIdList_;
            private int retcode_;
            private int levelIndex_;
            private int floorId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TowerEnterLevelRspOuterClass.internal_static_TowerEnterLevelRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TowerEnterLevelRspOuterClass.internal_static_TowerEnterLevelRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerEnterLevelRsp.class, Builder.class);
            }
            
            private Builder() {
                this.towerBuffIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.towerBuffIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TowerEnterLevelRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.towerBuffIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.retcode_ = 0;
                this.levelIndex_ = 0;
                this.floorId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TowerEnterLevelRspOuterClass.internal_static_TowerEnterLevelRsp_descriptor;
            }
            
            @Override
            public TowerEnterLevelRsp getDefaultInstanceForType() {
                return TowerEnterLevelRsp.getDefaultInstance();
            }
            
            @Override
            public TowerEnterLevelRsp build() {
                final TowerEnterLevelRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TowerEnterLevelRsp buildPartial() {
                final TowerEnterLevelRsp result = new TowerEnterLevelRsp(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.towerBuffIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.towerBuffIdList_ = this.towerBuffIdList_;
                result.retcode_ = this.retcode_;
                result.levelIndex_ = this.levelIndex_;
                result.floorId_ = this.floorId_;
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
                if (other instanceof TowerEnterLevelRsp) {
                    return this.mergeFrom((TowerEnterLevelRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TowerEnterLevelRsp other) {
                if (other == TowerEnterLevelRsp.getDefaultInstance()) {
                    return this;
                }
                if (!other.towerBuffIdList_.isEmpty()) {
                    if (this.towerBuffIdList_.isEmpty()) {
                        this.towerBuffIdList_ = other.towerBuffIdList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureTowerBuffIdListIsMutable();
                        this.towerBuffIdList_.addAll(other.towerBuffIdList_);
                    }
                    this.onChanged();
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getLevelIndex() != 0) {
                    this.setLevelIndex(other.getLevelIndex());
                }
                if (other.getFloorId() != 0) {
                    this.setFloorId(other.getFloorId());
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
                TowerEnterLevelRsp parsedMessage = null;
                try {
                    parsedMessage = TowerEnterLevelRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TowerEnterLevelRsp)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureTowerBuffIdListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.towerBuffIdList_ = GeneratedMessageV3.mutableCopy(this.towerBuffIdList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getTowerBuffIdListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.towerBuffIdList_) : this.towerBuffIdList_;
            }
            
            @Override
            public int getTowerBuffIdListCount() {
                return this.towerBuffIdList_.size();
            }
            
            @Override
            public int getTowerBuffIdList(final int index) {
                return this.towerBuffIdList_.getInt(index);
            }
            
            public Builder setTowerBuffIdList(final int index, final int value) {
                this.ensureTowerBuffIdListIsMutable();
                this.towerBuffIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addTowerBuffIdList(final int value) {
                this.ensureTowerBuffIdListIsMutable();
                this.towerBuffIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllTowerBuffIdList(final Iterable<? extends Integer> values) {
                this.ensureTowerBuffIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.towerBuffIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearTowerBuffIdList() {
                this.towerBuffIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getLevelIndex() {
                return this.levelIndex_;
            }
            
            public Builder setLevelIndex(final int value) {
                this.levelIndex_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLevelIndex() {
                this.levelIndex_ = 0;
                this.onChanged();
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
    
    public interface TowerEnterLevelRspOrBuilder extends MessageOrBuilder
    {
        List<Integer> getTowerBuffIdListList();
        
        int getTowerBuffIdListCount();
        
        int getTowerBuffIdList(final int p0);
        
        int getRetcode();
        
        int getLevelIndex();
        
        int getFloorId();
    }
}
