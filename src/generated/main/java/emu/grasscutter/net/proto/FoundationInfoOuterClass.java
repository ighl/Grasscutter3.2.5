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

public final class FoundationInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_FoundationInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_FoundationInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private FoundationInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return FoundationInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0014FoundationInfo.proto\u001a\u0016FoundationStatus.proto\"\u007f\n\u000eFoundationInfo\u0012!\n\u0006status\u0018\u0001 \u0001(\u000e2\u0011.FoundationStatus\u0012\u0010\n\buid_list\u0018\u0002 \u0003(\r\u0012\u001b\n\u0013current_building_id\u0018\u0003 \u0001(\r\u0012\u001b\n\u0013begin_build_time_ms\u0018\u0004 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        FoundationInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { FoundationStatusOuterClass.getDescriptor() });
        internal_static_FoundationInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_FoundationInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(FoundationInfoOuterClass.internal_static_FoundationInfo_descriptor, new String[] { "Status", "UidList", "CurrentBuildingId", "BeginBuildTimeMs" });
        FoundationStatusOuterClass.getDescriptor();
    }
    
    public static final class FoundationInfo extends GeneratedMessageV3 implements FoundationInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int STATUS_FIELD_NUMBER = 1;
        private int status_;
        public static final int UID_LIST_FIELD_NUMBER = 2;
        private Internal.IntList uidList_;
        private int uidListMemoizedSerializedSize;
        public static final int CURRENT_BUILDING_ID_FIELD_NUMBER = 3;
        private int currentBuildingId_;
        public static final int BEGIN_BUILD_TIME_MS_FIELD_NUMBER = 4;
        private int beginBuildTimeMs_;
        private byte memoizedIsInitialized;
        private static final FoundationInfo DEFAULT_INSTANCE;
        private static final Parser<FoundationInfo> PARSER;
        
        private FoundationInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.uidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private FoundationInfo() {
            this.uidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.status_ = 0;
            this.uidList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new FoundationInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private FoundationInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            final int rawValue = input.readEnum();
                            this.status_ = rawValue;
                            continue;
                        }
                        case 16: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.uidList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.uidList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 18: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.uidList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.uidList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 24: {
                            this.currentBuildingId_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.beginBuildTimeMs_ = input.readUInt32();
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
                    this.uidList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return FoundationInfoOuterClass.internal_static_FoundationInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return FoundationInfoOuterClass.internal_static_FoundationInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(FoundationInfo.class, Builder.class);
        }
        
        @Override
        public int getStatusValue() {
            return this.status_;
        }
        
        @Override
        public FoundationStatusOuterClass.FoundationStatus getStatus() {
            final FoundationStatusOuterClass.FoundationStatus result = FoundationStatusOuterClass.FoundationStatus.valueOf(this.status_);
            return (result == null) ? FoundationStatusOuterClass.FoundationStatus.UNRECOGNIZED : result;
        }
        
        @Override
        public List<Integer> getUidListList() {
            return this.uidList_;
        }
        
        @Override
        public int getUidListCount() {
            return this.uidList_.size();
        }
        
        @Override
        public int getUidList(final int index) {
            return this.uidList_.getInt(index);
        }
        
        @Override
        public int getCurrentBuildingId() {
            return this.currentBuildingId_;
        }
        
        @Override
        public int getBeginBuildTimeMs() {
            return this.beginBuildTimeMs_;
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
            if (this.status_ != FoundationStatusOuterClass.FoundationStatus.FOUNDATION_STATUS_NONE.getNumber()) {
                output.writeEnum(1, this.status_);
            }
            if (this.getUidListList().size() > 0) {
                output.writeUInt32NoTag(18);
                output.writeUInt32NoTag(this.uidListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.uidList_.size(); ++i) {
                output.writeUInt32NoTag(this.uidList_.getInt(i));
            }
            if (this.currentBuildingId_ != 0) {
                output.writeUInt32(3, this.currentBuildingId_);
            }
            if (this.beginBuildTimeMs_ != 0) {
                output.writeUInt32(4, this.beginBuildTimeMs_);
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
            if (this.status_ != FoundationStatusOuterClass.FoundationStatus.FOUNDATION_STATUS_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(1, this.status_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.uidList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.uidList_.getInt(i));
            }
            size += dataSize;
            if (!this.getUidListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.uidListMemoizedSerializedSize = dataSize;
            if (this.currentBuildingId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.currentBuildingId_);
            }
            if (this.beginBuildTimeMs_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.beginBuildTimeMs_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FoundationInfo)) {
                return super.equals(obj);
            }
            final FoundationInfo other = (FoundationInfo)obj;
            return this.status_ == other.status_ && this.getUidListList().equals(other.getUidListList()) && this.getCurrentBuildingId() == other.getCurrentBuildingId() && this.getBeginBuildTimeMs() == other.getBeginBuildTimeMs() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.status_;
            if (this.getUidListCount() > 0) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getUidListList().hashCode();
            }
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getCurrentBuildingId();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getBeginBuildTimeMs();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static FoundationInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return FoundationInfo.PARSER.parseFrom(data);
        }
        
        public static FoundationInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FoundationInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FoundationInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return FoundationInfo.PARSER.parseFrom(data);
        }
        
        public static FoundationInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FoundationInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FoundationInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return FoundationInfo.PARSER.parseFrom(data);
        }
        
        public static FoundationInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FoundationInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FoundationInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FoundationInfo.PARSER, input);
        }
        
        public static FoundationInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FoundationInfo.PARSER, input, extensionRegistry);
        }
        
        public static FoundationInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FoundationInfo.PARSER, input);
        }
        
        public static FoundationInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FoundationInfo.PARSER, input, extensionRegistry);
        }
        
        public static FoundationInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FoundationInfo.PARSER, input);
        }
        
        public static FoundationInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FoundationInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return FoundationInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final FoundationInfo prototype) {
            return FoundationInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == FoundationInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static FoundationInfo getDefaultInstance() {
            return FoundationInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<FoundationInfo> parser() {
            return FoundationInfo.PARSER;
        }
        
        @Override
        public Parser<FoundationInfo> getParserForType() {
            return FoundationInfo.PARSER;
        }
        
        @Override
        public FoundationInfo getDefaultInstanceForType() {
            return FoundationInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new FoundationInfo();
            PARSER = new AbstractParser<FoundationInfo>() {
                @Override
                public FoundationInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new FoundationInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FoundationInfoOrBuilder
        {
            private int bitField0_;
            private int status_;
            private Internal.IntList uidList_;
            private int currentBuildingId_;
            private int beginBuildTimeMs_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return FoundationInfoOuterClass.internal_static_FoundationInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return FoundationInfoOuterClass.internal_static_FoundationInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(FoundationInfo.class, Builder.class);
            }
            
            private Builder() {
                this.status_ = 0;
                this.uidList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.status_ = 0;
                this.uidList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (FoundationInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.status_ = 0;
                this.uidList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.currentBuildingId_ = 0;
                this.beginBuildTimeMs_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return FoundationInfoOuterClass.internal_static_FoundationInfo_descriptor;
            }
            
            @Override
            public FoundationInfo getDefaultInstanceForType() {
                return FoundationInfo.getDefaultInstance();
            }
            
            @Override
            public FoundationInfo build() {
                final FoundationInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public FoundationInfo buildPartial() {
                final FoundationInfo result = new FoundationInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.status_ = this.status_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.uidList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.uidList_ = this.uidList_;
                result.currentBuildingId_ = this.currentBuildingId_;
                result.beginBuildTimeMs_ = this.beginBuildTimeMs_;
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
                if (other instanceof FoundationInfo) {
                    return this.mergeFrom((FoundationInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final FoundationInfo other) {
                if (other == FoundationInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.status_ != 0) {
                    this.setStatusValue(other.getStatusValue());
                }
                if (!other.uidList_.isEmpty()) {
                    if (this.uidList_.isEmpty()) {
                        this.uidList_ = other.uidList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureUidListIsMutable();
                        this.uidList_.addAll(other.uidList_);
                    }
                    this.onChanged();
                }
                if (other.getCurrentBuildingId() != 0) {
                    this.setCurrentBuildingId(other.getCurrentBuildingId());
                }
                if (other.getBeginBuildTimeMs() != 0) {
                    this.setBeginBuildTimeMs(other.getBeginBuildTimeMs());
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
                FoundationInfo parsedMessage = null;
                try {
                    parsedMessage = FoundationInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (FoundationInfo)e.getUnfinishedMessage();
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
            public int getStatusValue() {
                return this.status_;
            }
            
            public Builder setStatusValue(final int value) {
                this.status_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public FoundationStatusOuterClass.FoundationStatus getStatus() {
                final FoundationStatusOuterClass.FoundationStatus result = FoundationStatusOuterClass.FoundationStatus.valueOf(this.status_);
                return (result == null) ? FoundationStatusOuterClass.FoundationStatus.UNRECOGNIZED : result;
            }
            
            public Builder setStatus(final FoundationStatusOuterClass.FoundationStatus value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.status_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearStatus() {
                this.status_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureUidListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.uidList_ = GeneratedMessageV3.mutableCopy(this.uidList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getUidListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.uidList_) : this.uidList_;
            }
            
            @Override
            public int getUidListCount() {
                return this.uidList_.size();
            }
            
            @Override
            public int getUidList(final int index) {
                return this.uidList_.getInt(index);
            }
            
            public Builder setUidList(final int index, final int value) {
                this.ensureUidListIsMutable();
                this.uidList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addUidList(final int value) {
                this.ensureUidListIsMutable();
                this.uidList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllUidList(final Iterable<? extends Integer> values) {
                this.ensureUidListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.uidList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearUidList() {
                this.uidList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCurrentBuildingId() {
                return this.currentBuildingId_;
            }
            
            public Builder setCurrentBuildingId(final int value) {
                this.currentBuildingId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurrentBuildingId() {
                this.currentBuildingId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getBeginBuildTimeMs() {
                return this.beginBuildTimeMs_;
            }
            
            public Builder setBeginBuildTimeMs(final int value) {
                this.beginBuildTimeMs_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBeginBuildTimeMs() {
                this.beginBuildTimeMs_ = 0;
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
    
    public interface FoundationInfoOrBuilder extends MessageOrBuilder
    {
        int getStatusValue();
        
        FoundationStatusOuterClass.FoundationStatus getStatus();
        
        List<Integer> getUidListList();
        
        int getUidListCount();
        
        int getUidList(final int p0);
        
        int getCurrentBuildingId();
        
        int getBeginBuildTimeMs();
    }
}
