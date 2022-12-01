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

public final class ReliquaryDecomposeReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_ReliquaryDecomposeReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ReliquaryDecomposeReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ReliquaryDecomposeReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ReliquaryDecomposeReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bReliquaryDecomposeReq.proto\"S\n\u0015ReliquaryDecomposeReq\u0012\u0011\n\tconfig_id\u0018\r \u0001(\r\u0012\u0014\n\ftarget_count\u0018\t \u0001(\r\u0012\u0011\n\tguid_list\u0018\b \u0003(\u0004B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ReliquaryDecomposeReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ReliquaryDecomposeReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ReliquaryDecomposeReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ReliquaryDecomposeReqOuterClass.internal_static_ReliquaryDecomposeReq_descriptor, new String[] { "ConfigId", "TargetCount", "GuidList" });
    }
    
    public static final class ReliquaryDecomposeReq extends GeneratedMessageV3 implements ReliquaryDecomposeReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CONFIG_ID_FIELD_NUMBER = 13;
        private int configId_;
        public static final int TARGET_COUNT_FIELD_NUMBER = 9;
        private int targetCount_;
        public static final int GUID_LIST_FIELD_NUMBER = 8;
        private Internal.LongList guidList_;
        private int guidListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final ReliquaryDecomposeReq DEFAULT_INSTANCE;
        private static final Parser<ReliquaryDecomposeReq> PARSER;
        
        private ReliquaryDecomposeReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.guidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private ReliquaryDecomposeReq() {
            this.guidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.guidList_ = GeneratedMessageV3.emptyLongList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ReliquaryDecomposeReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ReliquaryDecomposeReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 64: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.guidList_ = GeneratedMessageV3.newLongList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.guidList_.addLong(input.readUInt64());
                            continue;
                        }
                        case 66: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.guidList_ = GeneratedMessageV3.newLongList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.guidList_.addLong(input.readUInt64());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 72: {
                            this.targetCount_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.configId_ = input.readUInt32();
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
                    this.guidList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ReliquaryDecomposeReqOuterClass.internal_static_ReliquaryDecomposeReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ReliquaryDecomposeReqOuterClass.internal_static_ReliquaryDecomposeReq_fieldAccessorTable.ensureFieldAccessorsInitialized(ReliquaryDecomposeReq.class, Builder.class);
        }
        
        @Override
        public int getConfigId() {
            return this.configId_;
        }
        
        @Override
        public int getTargetCount() {
            return this.targetCount_;
        }
        
        @Override
        public List<Long> getGuidListList() {
            return this.guidList_;
        }
        
        @Override
        public int getGuidListCount() {
            return this.guidList_.size();
        }
        
        @Override
        public long getGuidList(final int index) {
            return this.guidList_.getLong(index);
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
            if (this.getGuidListList().size() > 0) {
                output.writeUInt32NoTag(66);
                output.writeUInt32NoTag(this.guidListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.guidList_.size(); ++i) {
                output.writeUInt64NoTag(this.guidList_.getLong(i));
            }
            if (this.targetCount_ != 0) {
                output.writeUInt32(9, this.targetCount_);
            }
            if (this.configId_ != 0) {
                output.writeUInt32(13, this.configId_);
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
            for (int i = 0; i < this.guidList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt64SizeNoTag(this.guidList_.getLong(i));
            }
            size += dataSize;
            if (!this.getGuidListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.guidListMemoizedSerializedSize = dataSize;
            if (this.targetCount_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.targetCount_);
            }
            if (this.configId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.configId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ReliquaryDecomposeReq)) {
                return super.equals(obj);
            }
            final ReliquaryDecomposeReq other = (ReliquaryDecomposeReq)obj;
            return this.getConfigId() == other.getConfigId() && this.getTargetCount() == other.getTargetCount() && this.getGuidListList().equals(other.getGuidListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getConfigId();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getTargetCount();
            if (this.getGuidListCount() > 0) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getGuidListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ReliquaryDecomposeReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ReliquaryDecomposeReq.PARSER.parseFrom(data);
        }
        
        public static ReliquaryDecomposeReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ReliquaryDecomposeReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ReliquaryDecomposeReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ReliquaryDecomposeReq.PARSER.parseFrom(data);
        }
        
        public static ReliquaryDecomposeReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ReliquaryDecomposeReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ReliquaryDecomposeReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ReliquaryDecomposeReq.PARSER.parseFrom(data);
        }
        
        public static ReliquaryDecomposeReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ReliquaryDecomposeReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ReliquaryDecomposeReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ReliquaryDecomposeReq.PARSER, input);
        }
        
        public static ReliquaryDecomposeReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ReliquaryDecomposeReq.PARSER, input, extensionRegistry);
        }
        
        public static ReliquaryDecomposeReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ReliquaryDecomposeReq.PARSER, input);
        }
        
        public static ReliquaryDecomposeReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ReliquaryDecomposeReq.PARSER, input, extensionRegistry);
        }
        
        public static ReliquaryDecomposeReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ReliquaryDecomposeReq.PARSER, input);
        }
        
        public static ReliquaryDecomposeReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ReliquaryDecomposeReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ReliquaryDecomposeReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ReliquaryDecomposeReq prototype) {
            return ReliquaryDecomposeReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ReliquaryDecomposeReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ReliquaryDecomposeReq getDefaultInstance() {
            return ReliquaryDecomposeReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<ReliquaryDecomposeReq> parser() {
            return ReliquaryDecomposeReq.PARSER;
        }
        
        @Override
        public Parser<ReliquaryDecomposeReq> getParserForType() {
            return ReliquaryDecomposeReq.PARSER;
        }
        
        @Override
        public ReliquaryDecomposeReq getDefaultInstanceForType() {
            return ReliquaryDecomposeReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ReliquaryDecomposeReq();
            PARSER = new AbstractParser<ReliquaryDecomposeReq>() {
                @Override
                public ReliquaryDecomposeReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ReliquaryDecomposeReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ReliquaryDecomposeReqOrBuilder
        {
            private int bitField0_;
            private int configId_;
            private int targetCount_;
            private Internal.LongList guidList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ReliquaryDecomposeReqOuterClass.internal_static_ReliquaryDecomposeReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ReliquaryDecomposeReqOuterClass.internal_static_ReliquaryDecomposeReq_fieldAccessorTable.ensureFieldAccessorsInitialized(ReliquaryDecomposeReq.class, Builder.class);
            }
            
            private Builder() {
                this.guidList_ = GeneratedMessageV3.emptyLongList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.guidList_ = GeneratedMessageV3.emptyLongList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ReliquaryDecomposeReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.configId_ = 0;
                this.targetCount_ = 0;
                this.guidList_ = GeneratedMessageV3.emptyLongList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ReliquaryDecomposeReqOuterClass.internal_static_ReliquaryDecomposeReq_descriptor;
            }
            
            @Override
            public ReliquaryDecomposeReq getDefaultInstanceForType() {
                return ReliquaryDecomposeReq.getDefaultInstance();
            }
            
            @Override
            public ReliquaryDecomposeReq build() {
                final ReliquaryDecomposeReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ReliquaryDecomposeReq buildPartial() {
                final ReliquaryDecomposeReq result = new ReliquaryDecomposeReq(this);
                final int from_bitField0_ = this.bitField0_;
                result.configId_ = this.configId_;
                result.targetCount_ = this.targetCount_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.guidList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.guidList_ = this.guidList_;
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
                if (other instanceof ReliquaryDecomposeReq) {
                    return this.mergeFrom((ReliquaryDecomposeReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ReliquaryDecomposeReq other) {
                if (other == ReliquaryDecomposeReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getConfigId() != 0) {
                    this.setConfigId(other.getConfigId());
                }
                if (other.getTargetCount() != 0) {
                    this.setTargetCount(other.getTargetCount());
                }
                if (!other.guidList_.isEmpty()) {
                    if (this.guidList_.isEmpty()) {
                        this.guidList_ = other.guidList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureGuidListIsMutable();
                        this.guidList_.addAll(other.guidList_);
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
                ReliquaryDecomposeReq parsedMessage = null;
                try {
                    parsedMessage = ReliquaryDecomposeReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ReliquaryDecomposeReq)e.getUnfinishedMessage();
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
            public int getConfigId() {
                return this.configId_;
            }
            
            public Builder setConfigId(final int value) {
                this.configId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearConfigId() {
                this.configId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getTargetCount() {
                return this.targetCount_;
            }
            
            public Builder setTargetCount(final int value) {
                this.targetCount_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTargetCount() {
                this.targetCount_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureGuidListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.guidList_ = GeneratedMessageV3.mutableCopy(this.guidList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Long> getGuidListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Long>)this.guidList_) : this.guidList_;
            }
            
            @Override
            public int getGuidListCount() {
                return this.guidList_.size();
            }
            
            @Override
            public long getGuidList(final int index) {
                return this.guidList_.getLong(index);
            }
            
            public Builder setGuidList(final int index, final long value) {
                this.ensureGuidListIsMutable();
                this.guidList_.setLong(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addGuidList(final long value) {
                this.ensureGuidListIsMutable();
                this.guidList_.addLong(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllGuidList(final Iterable<? extends Long> values) {
                this.ensureGuidListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.guidList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearGuidList() {
                this.guidList_ = GeneratedMessageV3.emptyLongList();
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
    
    public interface ReliquaryDecomposeReqOrBuilder extends MessageOrBuilder
    {
        int getConfigId();
        
        int getTargetCount();
        
        List<Long> getGuidListList();
        
        int getGuidListCount();
        
        long getGuidList(final int p0);
    }
}
