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

public final class QueryCodexMonsterBeKilledNumRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_QueryCodexMonsterBeKilledNumRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_QueryCodexMonsterBeKilledNumRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private QueryCodexMonsterBeKilledNumRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return QueryCodexMonsterBeKilledNumRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n%QueryCodexMonsterBeKilledNumRsp.proto\"\u0082\u0001\n\u001fQueryCodexMonsterBeKilledNumRsp\u0012\u0015\n\rcodex_id_list\u0018\u0004 \u0003(\r\u0012\u001b\n\u0013Unk2700_MKOBMGGPNMI\u0018\u0006 \u0003(\r\u0012\u001a\n\u0012be_killed_num_list\u0018\f \u0003(\r\u0012\u000f\n\u0007retcode\u0018\u0005 \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        QueryCodexMonsterBeKilledNumRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_QueryCodexMonsterBeKilledNumRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_QueryCodexMonsterBeKilledNumRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(QueryCodexMonsterBeKilledNumRspOuterClass.internal_static_QueryCodexMonsterBeKilledNumRsp_descriptor, new String[] { "CodexIdList", "Unk2700MKOBMGGPNMI", "BeKilledNumList", "Retcode" });
    }
    
    public static final class QueryCodexMonsterBeKilledNumRsp extends GeneratedMessageV3 implements QueryCodexMonsterBeKilledNumRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CODEX_ID_LIST_FIELD_NUMBER = 4;
        private Internal.IntList codexIdList_;
        private int codexIdListMemoizedSerializedSize;
        public static final int UNK2700_MKOBMGGPNMI_FIELD_NUMBER = 6;
        private Internal.IntList unk2700MKOBMGGPNMI_;
        private int unk2700MKOBMGGPNMIMemoizedSerializedSize;
        public static final int BE_KILLED_NUM_LIST_FIELD_NUMBER = 12;
        private Internal.IntList beKilledNumList_;
        private int beKilledNumListMemoizedSerializedSize;
        public static final int RETCODE_FIELD_NUMBER = 5;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final QueryCodexMonsterBeKilledNumRsp DEFAULT_INSTANCE;
        private static final Parser<QueryCodexMonsterBeKilledNumRsp> PARSER;
        
        private QueryCodexMonsterBeKilledNumRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.codexIdListMemoizedSerializedSize = -1;
            this.unk2700MKOBMGGPNMIMemoizedSerializedSize = -1;
            this.beKilledNumListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private QueryCodexMonsterBeKilledNumRsp() {
            this.codexIdListMemoizedSerializedSize = -1;
            this.unk2700MKOBMGGPNMIMemoizedSerializedSize = -1;
            this.beKilledNumListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.codexIdList_ = GeneratedMessageV3.emptyIntList();
            this.unk2700MKOBMGGPNMI_ = GeneratedMessageV3.emptyIntList();
            this.beKilledNumList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new QueryCodexMonsterBeKilledNumRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private QueryCodexMonsterBeKilledNumRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 32: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.codexIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.codexIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 34: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.codexIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.codexIdList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 40: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 48: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.unk2700MKOBMGGPNMI_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.unk2700MKOBMGGPNMI_.addInt(input.readUInt32());
                            continue;
                        }
                        case 50: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.unk2700MKOBMGGPNMI_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.unk2700MKOBMGGPNMI_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 96: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.beKilledNumList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.beKilledNumList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 98: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x4) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.beKilledNumList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x4;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.beKilledNumList_.addInt(input.readUInt32());
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
                    this.codexIdList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.unk2700MKOBMGGPNMI_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x4) != 0x0) {
                    this.beKilledNumList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return QueryCodexMonsterBeKilledNumRspOuterClass.internal_static_QueryCodexMonsterBeKilledNumRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return QueryCodexMonsterBeKilledNumRspOuterClass.internal_static_QueryCodexMonsterBeKilledNumRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(QueryCodexMonsterBeKilledNumRsp.class, Builder.class);
        }
        
        @Override
        public List<Integer> getCodexIdListList() {
            return this.codexIdList_;
        }
        
        @Override
        public int getCodexIdListCount() {
            return this.codexIdList_.size();
        }
        
        @Override
        public int getCodexIdList(final int index) {
            return this.codexIdList_.getInt(index);
        }
        
        @Override
        public List<Integer> getUnk2700MKOBMGGPNMIList() {
            return this.unk2700MKOBMGGPNMI_;
        }
        
        @Override
        public int getUnk2700MKOBMGGPNMICount() {
            return this.unk2700MKOBMGGPNMI_.size();
        }
        
        @Override
        public int getUnk2700MKOBMGGPNMI(final int index) {
            return this.unk2700MKOBMGGPNMI_.getInt(index);
        }
        
        @Override
        public List<Integer> getBeKilledNumListList() {
            return this.beKilledNumList_;
        }
        
        @Override
        public int getBeKilledNumListCount() {
            return this.beKilledNumList_.size();
        }
        
        @Override
        public int getBeKilledNumList(final int index) {
            return this.beKilledNumList_.getInt(index);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
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
            if (this.getCodexIdListList().size() > 0) {
                output.writeUInt32NoTag(34);
                output.writeUInt32NoTag(this.codexIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.codexIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.codexIdList_.getInt(i));
            }
            if (this.retcode_ != 0) {
                output.writeInt32(5, this.retcode_);
            }
            if (this.getUnk2700MKOBMGGPNMIList().size() > 0) {
                output.writeUInt32NoTag(50);
                output.writeUInt32NoTag(this.unk2700MKOBMGGPNMIMemoizedSerializedSize);
            }
            for (int i = 0; i < this.unk2700MKOBMGGPNMI_.size(); ++i) {
                output.writeUInt32NoTag(this.unk2700MKOBMGGPNMI_.getInt(i));
            }
            if (this.getBeKilledNumListList().size() > 0) {
                output.writeUInt32NoTag(98);
                output.writeUInt32NoTag(this.beKilledNumListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.beKilledNumList_.size(); ++i) {
                output.writeUInt32NoTag(this.beKilledNumList_.getInt(i));
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
            for (int i = 0; i < this.codexIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.codexIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getCodexIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.codexIdListMemoizedSerializedSize = dataSize;
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(5, this.retcode_);
            }
            dataSize = 0;
            for (int i = 0; i < this.unk2700MKOBMGGPNMI_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.unk2700MKOBMGGPNMI_.getInt(i));
            }
            size += dataSize;
            if (!this.getUnk2700MKOBMGGPNMIList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.unk2700MKOBMGGPNMIMemoizedSerializedSize = dataSize;
            dataSize = 0;
            for (int i = 0; i < this.beKilledNumList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.beKilledNumList_.getInt(i));
            }
            size += dataSize;
            if (!this.getBeKilledNumListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.beKilledNumListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof QueryCodexMonsterBeKilledNumRsp)) {
                return super.equals(obj);
            }
            final QueryCodexMonsterBeKilledNumRsp other = (QueryCodexMonsterBeKilledNumRsp)obj;
            return this.getCodexIdListList().equals(other.getCodexIdListList()) && this.getUnk2700MKOBMGGPNMIList().equals(other.getUnk2700MKOBMGGPNMIList()) && this.getBeKilledNumListList().equals(other.getBeKilledNumListList()) && this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getCodexIdListCount() > 0) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getCodexIdListList().hashCode();
            }
            if (this.getUnk2700MKOBMGGPNMICount() > 0) {
                hash = 37 * hash + 6;
                hash = 53 * hash + this.getUnk2700MKOBMGGPNMIList().hashCode();
            }
            if (this.getBeKilledNumListCount() > 0) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getBeKilledNumListList().hashCode();
            }
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static QueryCodexMonsterBeKilledNumRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return QueryCodexMonsterBeKilledNumRsp.PARSER.parseFrom(data);
        }
        
        public static QueryCodexMonsterBeKilledNumRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QueryCodexMonsterBeKilledNumRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QueryCodexMonsterBeKilledNumRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return QueryCodexMonsterBeKilledNumRsp.PARSER.parseFrom(data);
        }
        
        public static QueryCodexMonsterBeKilledNumRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QueryCodexMonsterBeKilledNumRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QueryCodexMonsterBeKilledNumRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return QueryCodexMonsterBeKilledNumRsp.PARSER.parseFrom(data);
        }
        
        public static QueryCodexMonsterBeKilledNumRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QueryCodexMonsterBeKilledNumRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QueryCodexMonsterBeKilledNumRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QueryCodexMonsterBeKilledNumRsp.PARSER, input);
        }
        
        public static QueryCodexMonsterBeKilledNumRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QueryCodexMonsterBeKilledNumRsp.PARSER, input, extensionRegistry);
        }
        
        public static QueryCodexMonsterBeKilledNumRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(QueryCodexMonsterBeKilledNumRsp.PARSER, input);
        }
        
        public static QueryCodexMonsterBeKilledNumRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(QueryCodexMonsterBeKilledNumRsp.PARSER, input, extensionRegistry);
        }
        
        public static QueryCodexMonsterBeKilledNumRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QueryCodexMonsterBeKilledNumRsp.PARSER, input);
        }
        
        public static QueryCodexMonsterBeKilledNumRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QueryCodexMonsterBeKilledNumRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return QueryCodexMonsterBeKilledNumRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final QueryCodexMonsterBeKilledNumRsp prototype) {
            return QueryCodexMonsterBeKilledNumRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == QueryCodexMonsterBeKilledNumRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static QueryCodexMonsterBeKilledNumRsp getDefaultInstance() {
            return QueryCodexMonsterBeKilledNumRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<QueryCodexMonsterBeKilledNumRsp> parser() {
            return QueryCodexMonsterBeKilledNumRsp.PARSER;
        }
        
        @Override
        public Parser<QueryCodexMonsterBeKilledNumRsp> getParserForType() {
            return QueryCodexMonsterBeKilledNumRsp.PARSER;
        }
        
        @Override
        public QueryCodexMonsterBeKilledNumRsp getDefaultInstanceForType() {
            return QueryCodexMonsterBeKilledNumRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new QueryCodexMonsterBeKilledNumRsp();
            PARSER = new AbstractParser<QueryCodexMonsterBeKilledNumRsp>() {
                @Override
                public QueryCodexMonsterBeKilledNumRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new QueryCodexMonsterBeKilledNumRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements QueryCodexMonsterBeKilledNumRspOrBuilder
        {
            private int bitField0_;
            private Internal.IntList codexIdList_;
            private Internal.IntList unk2700MKOBMGGPNMI_;
            private Internal.IntList beKilledNumList_;
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return QueryCodexMonsterBeKilledNumRspOuterClass.internal_static_QueryCodexMonsterBeKilledNumRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return QueryCodexMonsterBeKilledNumRspOuterClass.internal_static_QueryCodexMonsterBeKilledNumRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(QueryCodexMonsterBeKilledNumRsp.class, Builder.class);
            }
            
            private Builder() {
                this.codexIdList_ = GeneratedMessageV3.emptyIntList();
                this.unk2700MKOBMGGPNMI_ = GeneratedMessageV3.emptyIntList();
                this.beKilledNumList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.codexIdList_ = GeneratedMessageV3.emptyIntList();
                this.unk2700MKOBMGGPNMI_ = GeneratedMessageV3.emptyIntList();
                this.beKilledNumList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (QueryCodexMonsterBeKilledNumRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.codexIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.unk2700MKOBMGGPNMI_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.beKilledNumList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFB;
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return QueryCodexMonsterBeKilledNumRspOuterClass.internal_static_QueryCodexMonsterBeKilledNumRsp_descriptor;
            }
            
            @Override
            public QueryCodexMonsterBeKilledNumRsp getDefaultInstanceForType() {
                return QueryCodexMonsterBeKilledNumRsp.getDefaultInstance();
            }
            
            @Override
            public QueryCodexMonsterBeKilledNumRsp build() {
                final QueryCodexMonsterBeKilledNumRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public QueryCodexMonsterBeKilledNumRsp buildPartial() {
                final QueryCodexMonsterBeKilledNumRsp result = new QueryCodexMonsterBeKilledNumRsp(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.codexIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.codexIdList_ = this.codexIdList_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.unk2700MKOBMGGPNMI_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.unk2700MKOBMGGPNMI_ = this.unk2700MKOBMGGPNMI_;
                if ((this.bitField0_ & 0x4) != 0x0) {
                    this.beKilledNumList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                result.beKilledNumList_ = this.beKilledNumList_;
                result.retcode_ = this.retcode_;
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
                if (other instanceof QueryCodexMonsterBeKilledNumRsp) {
                    return this.mergeFrom((QueryCodexMonsterBeKilledNumRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final QueryCodexMonsterBeKilledNumRsp other) {
                if (other == QueryCodexMonsterBeKilledNumRsp.getDefaultInstance()) {
                    return this;
                }
                if (!other.codexIdList_.isEmpty()) {
                    if (this.codexIdList_.isEmpty()) {
                        this.codexIdList_ = other.codexIdList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureCodexIdListIsMutable();
                        this.codexIdList_.addAll(other.codexIdList_);
                    }
                    this.onChanged();
                }
                if (!other.unk2700MKOBMGGPNMI_.isEmpty()) {
                    if (this.unk2700MKOBMGGPNMI_.isEmpty()) {
                        this.unk2700MKOBMGGPNMI_ = other.unk2700MKOBMGGPNMI_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureUnk2700MKOBMGGPNMIIsMutable();
                        this.unk2700MKOBMGGPNMI_.addAll(other.unk2700MKOBMGGPNMI_);
                    }
                    this.onChanged();
                }
                if (!other.beKilledNumList_.isEmpty()) {
                    if (this.beKilledNumList_.isEmpty()) {
                        this.beKilledNumList_ = other.beKilledNumList_;
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    else {
                        this.ensureBeKilledNumListIsMutable();
                        this.beKilledNumList_.addAll(other.beKilledNumList_);
                    }
                    this.onChanged();
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
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
                QueryCodexMonsterBeKilledNumRsp parsedMessage = null;
                try {
                    parsedMessage = QueryCodexMonsterBeKilledNumRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (QueryCodexMonsterBeKilledNumRsp)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureCodexIdListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.codexIdList_ = GeneratedMessageV3.mutableCopy(this.codexIdList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getCodexIdListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.codexIdList_) : this.codexIdList_;
            }
            
            @Override
            public int getCodexIdListCount() {
                return this.codexIdList_.size();
            }
            
            @Override
            public int getCodexIdList(final int index) {
                return this.codexIdList_.getInt(index);
            }
            
            public Builder setCodexIdList(final int index, final int value) {
                this.ensureCodexIdListIsMutable();
                this.codexIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addCodexIdList(final int value) {
                this.ensureCodexIdListIsMutable();
                this.codexIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllCodexIdList(final Iterable<? extends Integer> values) {
                this.ensureCodexIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.codexIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearCodexIdList() {
                this.codexIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            private void ensureUnk2700MKOBMGGPNMIIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.unk2700MKOBMGGPNMI_ = GeneratedMessageV3.mutableCopy(this.unk2700MKOBMGGPNMI_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getUnk2700MKOBMGGPNMIList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.unk2700MKOBMGGPNMI_) : this.unk2700MKOBMGGPNMI_;
            }
            
            @Override
            public int getUnk2700MKOBMGGPNMICount() {
                return this.unk2700MKOBMGGPNMI_.size();
            }
            
            @Override
            public int getUnk2700MKOBMGGPNMI(final int index) {
                return this.unk2700MKOBMGGPNMI_.getInt(index);
            }
            
            public Builder setUnk2700MKOBMGGPNMI(final int index, final int value) {
                this.ensureUnk2700MKOBMGGPNMIIsMutable();
                this.unk2700MKOBMGGPNMI_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addUnk2700MKOBMGGPNMI(final int value) {
                this.ensureUnk2700MKOBMGGPNMIIsMutable();
                this.unk2700MKOBMGGPNMI_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllUnk2700MKOBMGGPNMI(final Iterable<? extends Integer> values) {
                this.ensureUnk2700MKOBMGGPNMIIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.unk2700MKOBMGGPNMI_);
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700MKOBMGGPNMI() {
                this.unk2700MKOBMGGPNMI_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
                return this;
            }
            
            private void ensureBeKilledNumListIsMutable() {
                if ((this.bitField0_ & 0x4) == 0x0) {
                    this.beKilledNumList_ = GeneratedMessageV3.mutableCopy(this.beKilledNumList_);
                    this.bitField0_ |= 0x4;
                }
            }
            
            @Override
            public List<Integer> getBeKilledNumListList() {
                return ((this.bitField0_ & 0x4) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.beKilledNumList_) : this.beKilledNumList_;
            }
            
            @Override
            public int getBeKilledNumListCount() {
                return this.beKilledNumList_.size();
            }
            
            @Override
            public int getBeKilledNumList(final int index) {
                return this.beKilledNumList_.getInt(index);
            }
            
            public Builder setBeKilledNumList(final int index, final int value) {
                this.ensureBeKilledNumListIsMutable();
                this.beKilledNumList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addBeKilledNumList(final int value) {
                this.ensureBeKilledNumListIsMutable();
                this.beKilledNumList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllBeKilledNumList(final Iterable<? extends Integer> values) {
                this.ensureBeKilledNumListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.beKilledNumList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearBeKilledNumList() {
                this.beKilledNumList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFB;
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface QueryCodexMonsterBeKilledNumRspOrBuilder extends MessageOrBuilder
    {
        List<Integer> getCodexIdListList();
        
        int getCodexIdListCount();
        
        int getCodexIdList(final int p0);
        
        List<Integer> getUnk2700MKOBMGGPNMIList();
        
        int getUnk2700MKOBMGGPNMICount();
        
        int getUnk2700MKOBMGGPNMI(final int p0);
        
        List<Integer> getBeKilledNumListList();
        
        int getBeKilledNumListCount();
        
        int getBeKilledNumList(final int p0);
        
        int getRetcode();
    }
}
