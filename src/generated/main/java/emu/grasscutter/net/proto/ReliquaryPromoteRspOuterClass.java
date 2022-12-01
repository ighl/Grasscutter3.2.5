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

public final class ReliquaryPromoteRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_ReliquaryPromoteRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ReliquaryPromoteRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ReliquaryPromoteRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ReliquaryPromoteRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019ReliquaryPromoteRsp.proto\"·\u0001\n\u0013ReliquaryPromoteRsp\u0012\u0019\n\u0011old_promote_level\u0018\n \u0001(\r\u0012\u001d\n\u0015target_reliquary_guid\u0018\u0006 \u0001(\u0004\u0012\u001c\n\u0014cur_append_prop_list\u0018\t \u0003(\r\u0012\u000f\n\u0007retcode\u0018\f \u0001(\u0005\u0012\u0019\n\u0011cur_promote_level\u0018\u0002 \u0001(\r\u0012\u001c\n\u0014old_append_prop_list\u0018\b \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ReliquaryPromoteRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ReliquaryPromoteRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ReliquaryPromoteRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ReliquaryPromoteRspOuterClass.internal_static_ReliquaryPromoteRsp_descriptor, new String[] { "OldPromoteLevel", "TargetReliquaryGuid", "CurAppendPropList", "Retcode", "CurPromoteLevel", "OldAppendPropList" });
    }
    
    public static final class ReliquaryPromoteRsp extends GeneratedMessageV3 implements ReliquaryPromoteRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int OLD_PROMOTE_LEVEL_FIELD_NUMBER = 10;
        private int oldPromoteLevel_;
        public static final int TARGET_RELIQUARY_GUID_FIELD_NUMBER = 6;
        private long targetReliquaryGuid_;
        public static final int CUR_APPEND_PROP_LIST_FIELD_NUMBER = 9;
        private Internal.IntList curAppendPropList_;
        private int curAppendPropListMemoizedSerializedSize;
        public static final int RETCODE_FIELD_NUMBER = 12;
        private int retcode_;
        public static final int CUR_PROMOTE_LEVEL_FIELD_NUMBER = 2;
        private int curPromoteLevel_;
        public static final int OLD_APPEND_PROP_LIST_FIELD_NUMBER = 8;
        private Internal.IntList oldAppendPropList_;
        private int oldAppendPropListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final ReliquaryPromoteRsp DEFAULT_INSTANCE;
        private static final Parser<ReliquaryPromoteRsp> PARSER;
        
        private ReliquaryPromoteRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.curAppendPropListMemoizedSerializedSize = -1;
            this.oldAppendPropListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private ReliquaryPromoteRsp() {
            this.curAppendPropListMemoizedSerializedSize = -1;
            this.oldAppendPropListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.curAppendPropList_ = GeneratedMessageV3.emptyIntList();
            this.oldAppendPropList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ReliquaryPromoteRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ReliquaryPromoteRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 16: {
                            this.curPromoteLevel_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.targetReliquaryGuid_ = input.readUInt64();
                            continue;
                        }
                        case 64: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.oldAppendPropList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.oldAppendPropList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 66: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.oldAppendPropList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.oldAppendPropList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 72: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.curAppendPropList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.curAppendPropList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 74: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.curAppendPropList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.curAppendPropList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 80: {
                            this.oldPromoteLevel_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
                            this.retcode_ = input.readInt32();
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
                    this.oldAppendPropList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.curAppendPropList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ReliquaryPromoteRspOuterClass.internal_static_ReliquaryPromoteRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ReliquaryPromoteRspOuterClass.internal_static_ReliquaryPromoteRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(ReliquaryPromoteRsp.class, Builder.class);
        }
        
        @Override
        public int getOldPromoteLevel() {
            return this.oldPromoteLevel_;
        }
        
        @Override
        public long getTargetReliquaryGuid() {
            return this.targetReliquaryGuid_;
        }
        
        @Override
        public List<Integer> getCurAppendPropListList() {
            return this.curAppendPropList_;
        }
        
        @Override
        public int getCurAppendPropListCount() {
            return this.curAppendPropList_.size();
        }
        
        @Override
        public int getCurAppendPropList(final int index) {
            return this.curAppendPropList_.getInt(index);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public int getCurPromoteLevel() {
            return this.curPromoteLevel_;
        }
        
        @Override
        public List<Integer> getOldAppendPropListList() {
            return this.oldAppendPropList_;
        }
        
        @Override
        public int getOldAppendPropListCount() {
            return this.oldAppendPropList_.size();
        }
        
        @Override
        public int getOldAppendPropList(final int index) {
            return this.oldAppendPropList_.getInt(index);
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
            if (this.curPromoteLevel_ != 0) {
                output.writeUInt32(2, this.curPromoteLevel_);
            }
            if (this.targetReliquaryGuid_ != 0L) {
                output.writeUInt64(6, this.targetReliquaryGuid_);
            }
            if (this.getOldAppendPropListList().size() > 0) {
                output.writeUInt32NoTag(66);
                output.writeUInt32NoTag(this.oldAppendPropListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.oldAppendPropList_.size(); ++i) {
                output.writeUInt32NoTag(this.oldAppendPropList_.getInt(i));
            }
            if (this.getCurAppendPropListList().size() > 0) {
                output.writeUInt32NoTag(74);
                output.writeUInt32NoTag(this.curAppendPropListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.curAppendPropList_.size(); ++i) {
                output.writeUInt32NoTag(this.curAppendPropList_.getInt(i));
            }
            if (this.oldPromoteLevel_ != 0) {
                output.writeUInt32(10, this.oldPromoteLevel_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(12, this.retcode_);
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
            if (this.curPromoteLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.curPromoteLevel_);
            }
            if (this.targetReliquaryGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(6, this.targetReliquaryGuid_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.oldAppendPropList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.oldAppendPropList_.getInt(i));
            }
            size += dataSize;
            if (!this.getOldAppendPropListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.oldAppendPropListMemoizedSerializedSize = dataSize;
            dataSize = 0;
            for (int i = 0; i < this.curAppendPropList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.curAppendPropList_.getInt(i));
            }
            size += dataSize;
            if (!this.getCurAppendPropListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.curAppendPropListMemoizedSerializedSize = dataSize;
            if (this.oldPromoteLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.oldPromoteLevel_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(12, this.retcode_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ReliquaryPromoteRsp)) {
                return super.equals(obj);
            }
            final ReliquaryPromoteRsp other = (ReliquaryPromoteRsp)obj;
            return this.getOldPromoteLevel() == other.getOldPromoteLevel() && this.getTargetReliquaryGuid() == other.getTargetReliquaryGuid() && this.getCurAppendPropListList().equals(other.getCurAppendPropListList()) && this.getRetcode() == other.getRetcode() && this.getCurPromoteLevel() == other.getCurPromoteLevel() && this.getOldAppendPropListList().equals(other.getOldAppendPropListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getOldPromoteLevel();
            hash = 37 * hash + 6;
            hash = 53 * hash + Internal.hashLong(this.getTargetReliquaryGuid());
            if (this.getCurAppendPropListCount() > 0) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getCurAppendPropListList().hashCode();
            }
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getCurPromoteLevel();
            if (this.getOldAppendPropListCount() > 0) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getOldAppendPropListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ReliquaryPromoteRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ReliquaryPromoteRsp.PARSER.parseFrom(data);
        }
        
        public static ReliquaryPromoteRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ReliquaryPromoteRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ReliquaryPromoteRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ReliquaryPromoteRsp.PARSER.parseFrom(data);
        }
        
        public static ReliquaryPromoteRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ReliquaryPromoteRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ReliquaryPromoteRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ReliquaryPromoteRsp.PARSER.parseFrom(data);
        }
        
        public static ReliquaryPromoteRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ReliquaryPromoteRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ReliquaryPromoteRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ReliquaryPromoteRsp.PARSER, input);
        }
        
        public static ReliquaryPromoteRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ReliquaryPromoteRsp.PARSER, input, extensionRegistry);
        }
        
        public static ReliquaryPromoteRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ReliquaryPromoteRsp.PARSER, input);
        }
        
        public static ReliquaryPromoteRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ReliquaryPromoteRsp.PARSER, input, extensionRegistry);
        }
        
        public static ReliquaryPromoteRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ReliquaryPromoteRsp.PARSER, input);
        }
        
        public static ReliquaryPromoteRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ReliquaryPromoteRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ReliquaryPromoteRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ReliquaryPromoteRsp prototype) {
            return ReliquaryPromoteRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ReliquaryPromoteRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ReliquaryPromoteRsp getDefaultInstance() {
            return ReliquaryPromoteRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<ReliquaryPromoteRsp> parser() {
            return ReliquaryPromoteRsp.PARSER;
        }
        
        @Override
        public Parser<ReliquaryPromoteRsp> getParserForType() {
            return ReliquaryPromoteRsp.PARSER;
        }
        
        @Override
        public ReliquaryPromoteRsp getDefaultInstanceForType() {
            return ReliquaryPromoteRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ReliquaryPromoteRsp();
            PARSER = new AbstractParser<ReliquaryPromoteRsp>() {
                @Override
                public ReliquaryPromoteRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ReliquaryPromoteRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ReliquaryPromoteRspOrBuilder
        {
            private int bitField0_;
            private int oldPromoteLevel_;
            private long targetReliquaryGuid_;
            private Internal.IntList curAppendPropList_;
            private int retcode_;
            private int curPromoteLevel_;
            private Internal.IntList oldAppendPropList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ReliquaryPromoteRspOuterClass.internal_static_ReliquaryPromoteRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ReliquaryPromoteRspOuterClass.internal_static_ReliquaryPromoteRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(ReliquaryPromoteRsp.class, Builder.class);
            }
            
            private Builder() {
                this.curAppendPropList_ = GeneratedMessageV3.emptyIntList();
                this.oldAppendPropList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.curAppendPropList_ = GeneratedMessageV3.emptyIntList();
                this.oldAppendPropList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ReliquaryPromoteRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.oldPromoteLevel_ = 0;
                this.targetReliquaryGuid_ = 0L;
                this.curAppendPropList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.retcode_ = 0;
                this.curPromoteLevel_ = 0;
                this.oldAppendPropList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ReliquaryPromoteRspOuterClass.internal_static_ReliquaryPromoteRsp_descriptor;
            }
            
            @Override
            public ReliquaryPromoteRsp getDefaultInstanceForType() {
                return ReliquaryPromoteRsp.getDefaultInstance();
            }
            
            @Override
            public ReliquaryPromoteRsp build() {
                final ReliquaryPromoteRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ReliquaryPromoteRsp buildPartial() {
                final ReliquaryPromoteRsp result = new ReliquaryPromoteRsp(this);
                final int from_bitField0_ = this.bitField0_;
                result.oldPromoteLevel_ = this.oldPromoteLevel_;
                result.targetReliquaryGuid_ = this.targetReliquaryGuid_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.curAppendPropList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.curAppendPropList_ = this.curAppendPropList_;
                result.retcode_ = this.retcode_;
                result.curPromoteLevel_ = this.curPromoteLevel_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.oldAppendPropList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.oldAppendPropList_ = this.oldAppendPropList_;
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
                if (other instanceof ReliquaryPromoteRsp) {
                    return this.mergeFrom((ReliquaryPromoteRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ReliquaryPromoteRsp other) {
                if (other == ReliquaryPromoteRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getOldPromoteLevel() != 0) {
                    this.setOldPromoteLevel(other.getOldPromoteLevel());
                }
                if (other.getTargetReliquaryGuid() != 0L) {
                    this.setTargetReliquaryGuid(other.getTargetReliquaryGuid());
                }
                if (!other.curAppendPropList_.isEmpty()) {
                    if (this.curAppendPropList_.isEmpty()) {
                        this.curAppendPropList_ = other.curAppendPropList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureCurAppendPropListIsMutable();
                        this.curAppendPropList_.addAll(other.curAppendPropList_);
                    }
                    this.onChanged();
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getCurPromoteLevel() != 0) {
                    this.setCurPromoteLevel(other.getCurPromoteLevel());
                }
                if (!other.oldAppendPropList_.isEmpty()) {
                    if (this.oldAppendPropList_.isEmpty()) {
                        this.oldAppendPropList_ = other.oldAppendPropList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureOldAppendPropListIsMutable();
                        this.oldAppendPropList_.addAll(other.oldAppendPropList_);
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
                ReliquaryPromoteRsp parsedMessage = null;
                try {
                    parsedMessage = ReliquaryPromoteRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ReliquaryPromoteRsp)e.getUnfinishedMessage();
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
            public int getOldPromoteLevel() {
                return this.oldPromoteLevel_;
            }
            
            public Builder setOldPromoteLevel(final int value) {
                this.oldPromoteLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearOldPromoteLevel() {
                this.oldPromoteLevel_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public long getTargetReliquaryGuid() {
                return this.targetReliquaryGuid_;
            }
            
            public Builder setTargetReliquaryGuid(final long value) {
                this.targetReliquaryGuid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTargetReliquaryGuid() {
                this.targetReliquaryGuid_ = 0L;
                this.onChanged();
                return this;
            }
            
            private void ensureCurAppendPropListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.curAppendPropList_ = GeneratedMessageV3.mutableCopy(this.curAppendPropList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getCurAppendPropListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.curAppendPropList_) : this.curAppendPropList_;
            }
            
            @Override
            public int getCurAppendPropListCount() {
                return this.curAppendPropList_.size();
            }
            
            @Override
            public int getCurAppendPropList(final int index) {
                return this.curAppendPropList_.getInt(index);
            }
            
            public Builder setCurAppendPropList(final int index, final int value) {
                this.ensureCurAppendPropListIsMutable();
                this.curAppendPropList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addCurAppendPropList(final int value) {
                this.ensureCurAppendPropListIsMutable();
                this.curAppendPropList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllCurAppendPropList(final Iterable<? extends Integer> values) {
                this.ensureCurAppendPropListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.curAppendPropList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearCurAppendPropList() {
                this.curAppendPropList_ = GeneratedMessageV3.emptyIntList();
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
            public int getCurPromoteLevel() {
                return this.curPromoteLevel_;
            }
            
            public Builder setCurPromoteLevel(final int value) {
                this.curPromoteLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurPromoteLevel() {
                this.curPromoteLevel_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureOldAppendPropListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.oldAppendPropList_ = GeneratedMessageV3.mutableCopy(this.oldAppendPropList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getOldAppendPropListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.oldAppendPropList_) : this.oldAppendPropList_;
            }
            
            @Override
            public int getOldAppendPropListCount() {
                return this.oldAppendPropList_.size();
            }
            
            @Override
            public int getOldAppendPropList(final int index) {
                return this.oldAppendPropList_.getInt(index);
            }
            
            public Builder setOldAppendPropList(final int index, final int value) {
                this.ensureOldAppendPropListIsMutable();
                this.oldAppendPropList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addOldAppendPropList(final int value) {
                this.ensureOldAppendPropListIsMutable();
                this.oldAppendPropList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllOldAppendPropList(final Iterable<? extends Integer> values) {
                this.ensureOldAppendPropListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.oldAppendPropList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearOldAppendPropList() {
                this.oldAppendPropList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
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
    
    public interface ReliquaryPromoteRspOrBuilder extends MessageOrBuilder
    {
        int getOldPromoteLevel();
        
        long getTargetReliquaryGuid();
        
        List<Integer> getCurAppendPropListList();
        
        int getCurAppendPropListCount();
        
        int getCurAppendPropList(final int p0);
        
        int getRetcode();
        
        int getCurPromoteLevel();
        
        List<Integer> getOldAppendPropListList();
        
        int getOldAppendPropListCount();
        
        int getOldAppendPropList(final int p0);
    }
}
