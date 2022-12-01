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

public final class TowerLevelRecordOuterClass
{
    private static final Descriptors.Descriptor internal_static_TowerLevelRecord_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TowerLevelRecord_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TowerLevelRecordOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TowerLevelRecordOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016TowerLevelRecord.proto\"A\n\u0010TowerLevelRecord\u0012\u001b\n\u0013satisfied_cond_list\u0018\r \u0003(\r\u0012\u0010\n\blevel_id\u0018\n \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TowerLevelRecordOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_TowerLevelRecord_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TowerLevelRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TowerLevelRecordOuterClass.internal_static_TowerLevelRecord_descriptor, new String[] { "SatisfiedCondList", "LevelId" });
    }
    
    public static final class TowerLevelRecord extends GeneratedMessageV3 implements TowerLevelRecordOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SATISFIED_COND_LIST_FIELD_NUMBER = 13;
        private Internal.IntList satisfiedCondList_;
        private int satisfiedCondListMemoizedSerializedSize;
        public static final int LEVEL_ID_FIELD_NUMBER = 10;
        private int levelId_;
        private byte memoizedIsInitialized;
        private static final TowerLevelRecord DEFAULT_INSTANCE;
        private static final Parser<TowerLevelRecord> PARSER;
        
        private TowerLevelRecord(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.satisfiedCondListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private TowerLevelRecord() {
            this.satisfiedCondListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.satisfiedCondList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TowerLevelRecord();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TowerLevelRecord(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 80: {
                            this.levelId_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.satisfiedCondList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.satisfiedCondList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 106: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.satisfiedCondList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.satisfiedCondList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
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
                    this.satisfiedCondList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return TowerLevelRecordOuterClass.internal_static_TowerLevelRecord_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TowerLevelRecordOuterClass.internal_static_TowerLevelRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerLevelRecord.class, Builder.class);
        }
        
        @Override
        public List<Integer> getSatisfiedCondListList() {
            return this.satisfiedCondList_;
        }
        
        @Override
        public int getSatisfiedCondListCount() {
            return this.satisfiedCondList_.size();
        }
        
        @Override
        public int getSatisfiedCondList(final int index) {
            return this.satisfiedCondList_.getInt(index);
        }
        
        @Override
        public int getLevelId() {
            return this.levelId_;
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
            if (this.levelId_ != 0) {
                output.writeUInt32(10, this.levelId_);
            }
            if (this.getSatisfiedCondListList().size() > 0) {
                output.writeUInt32NoTag(106);
                output.writeUInt32NoTag(this.satisfiedCondListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.satisfiedCondList_.size(); ++i) {
                output.writeUInt32NoTag(this.satisfiedCondList_.getInt(i));
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
            if (this.levelId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.levelId_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.satisfiedCondList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.satisfiedCondList_.getInt(i));
            }
            size += dataSize;
            if (!this.getSatisfiedCondListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.satisfiedCondListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TowerLevelRecord)) {
                return super.equals(obj);
            }
            final TowerLevelRecord other = (TowerLevelRecord)obj;
            return this.getSatisfiedCondListList().equals(other.getSatisfiedCondListList()) && this.getLevelId() == other.getLevelId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getSatisfiedCondListCount() > 0) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.getSatisfiedCondListList().hashCode();
            }
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getLevelId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TowerLevelRecord parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TowerLevelRecord.PARSER.parseFrom(data);
        }
        
        public static TowerLevelRecord parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerLevelRecord.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerLevelRecord parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TowerLevelRecord.PARSER.parseFrom(data);
        }
        
        public static TowerLevelRecord parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerLevelRecord.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerLevelRecord parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TowerLevelRecord.PARSER.parseFrom(data);
        }
        
        public static TowerLevelRecord parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerLevelRecord.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerLevelRecord parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerLevelRecord.PARSER, input);
        }
        
        public static TowerLevelRecord parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerLevelRecord.PARSER, input, extensionRegistry);
        }
        
        public static TowerLevelRecord parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TowerLevelRecord.PARSER, input);
        }
        
        public static TowerLevelRecord parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TowerLevelRecord.PARSER, input, extensionRegistry);
        }
        
        public static TowerLevelRecord parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerLevelRecord.PARSER, input);
        }
        
        public static TowerLevelRecord parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerLevelRecord.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TowerLevelRecord.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TowerLevelRecord prototype) {
            return TowerLevelRecord.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TowerLevelRecord.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TowerLevelRecord getDefaultInstance() {
            return TowerLevelRecord.DEFAULT_INSTANCE;
        }
        
        public static Parser<TowerLevelRecord> parser() {
            return TowerLevelRecord.PARSER;
        }
        
        @Override
        public Parser<TowerLevelRecord> getParserForType() {
            return TowerLevelRecord.PARSER;
        }
        
        @Override
        public TowerLevelRecord getDefaultInstanceForType() {
            return TowerLevelRecord.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TowerLevelRecord();
            PARSER = new AbstractParser<TowerLevelRecord>() {
                @Override
                public TowerLevelRecord parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TowerLevelRecord(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TowerLevelRecordOrBuilder
        {
            private int bitField0_;
            private Internal.IntList satisfiedCondList_;
            private int levelId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TowerLevelRecordOuterClass.internal_static_TowerLevelRecord_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TowerLevelRecordOuterClass.internal_static_TowerLevelRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerLevelRecord.class, Builder.class);
            }
            
            private Builder() {
                this.satisfiedCondList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.satisfiedCondList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TowerLevelRecord.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.satisfiedCondList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.levelId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TowerLevelRecordOuterClass.internal_static_TowerLevelRecord_descriptor;
            }
            
            @Override
            public TowerLevelRecord getDefaultInstanceForType() {
                return TowerLevelRecord.getDefaultInstance();
            }
            
            @Override
            public TowerLevelRecord build() {
                final TowerLevelRecord result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TowerLevelRecord buildPartial() {
                final TowerLevelRecord result = new TowerLevelRecord(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.satisfiedCondList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.satisfiedCondList_ = this.satisfiedCondList_;
                result.levelId_ = this.levelId_;
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
                if (other instanceof TowerLevelRecord) {
                    return this.mergeFrom((TowerLevelRecord)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TowerLevelRecord other) {
                if (other == TowerLevelRecord.getDefaultInstance()) {
                    return this;
                }
                if (!other.satisfiedCondList_.isEmpty()) {
                    if (this.satisfiedCondList_.isEmpty()) {
                        this.satisfiedCondList_ = other.satisfiedCondList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureSatisfiedCondListIsMutable();
                        this.satisfiedCondList_.addAll(other.satisfiedCondList_);
                    }
                    this.onChanged();
                }
                if (other.getLevelId() != 0) {
                    this.setLevelId(other.getLevelId());
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
                TowerLevelRecord parsedMessage = null;
                try {
                    parsedMessage = TowerLevelRecord.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TowerLevelRecord)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureSatisfiedCondListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.satisfiedCondList_ = GeneratedMessageV3.mutableCopy(this.satisfiedCondList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getSatisfiedCondListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.satisfiedCondList_) : this.satisfiedCondList_;
            }
            
            @Override
            public int getSatisfiedCondListCount() {
                return this.satisfiedCondList_.size();
            }
            
            @Override
            public int getSatisfiedCondList(final int index) {
                return this.satisfiedCondList_.getInt(index);
            }
            
            public Builder setSatisfiedCondList(final int index, final int value) {
                this.ensureSatisfiedCondListIsMutable();
                this.satisfiedCondList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addSatisfiedCondList(final int value) {
                this.ensureSatisfiedCondListIsMutable();
                this.satisfiedCondList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllSatisfiedCondList(final Iterable<? extends Integer> values) {
                this.ensureSatisfiedCondListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.satisfiedCondList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearSatisfiedCondList() {
                this.satisfiedCondList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getLevelId() {
                return this.levelId_;
            }
            
            public Builder setLevelId(final int value) {
                this.levelId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLevelId() {
                this.levelId_ = 0;
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
    
    public interface TowerLevelRecordOrBuilder extends MessageOrBuilder
    {
        List<Integer> getSatisfiedCondListList();
        
        int getSatisfiedCondListCount();
        
        int getSatisfiedCondList(final int p0);
        
        int getLevelId();
    }
}
