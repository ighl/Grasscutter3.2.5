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

public final class QueryCodexMonsterBeKilledNumReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_QueryCodexMonsterBeKilledNumReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_QueryCodexMonsterBeKilledNumReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private QueryCodexMonsterBeKilledNumReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return QueryCodexMonsterBeKilledNumReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n%QueryCodexMonsterBeKilledNumReq.proto\"8\n\u001fQueryCodexMonsterBeKilledNumReq\u0012\u0015\n\rcodex_id_list\u0018\u000e \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        QueryCodexMonsterBeKilledNumReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_QueryCodexMonsterBeKilledNumReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_QueryCodexMonsterBeKilledNumReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(QueryCodexMonsterBeKilledNumReqOuterClass.internal_static_QueryCodexMonsterBeKilledNumReq_descriptor, new String[] { "CodexIdList" });
    }
    
    public static final class QueryCodexMonsterBeKilledNumReq extends GeneratedMessageV3 implements QueryCodexMonsterBeKilledNumReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CODEX_ID_LIST_FIELD_NUMBER = 14;
        private Internal.IntList codexIdList_;
        private int codexIdListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final QueryCodexMonsterBeKilledNumReq DEFAULT_INSTANCE;
        private static final Parser<QueryCodexMonsterBeKilledNumReq> PARSER;
        
        private QueryCodexMonsterBeKilledNumReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.codexIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private QueryCodexMonsterBeKilledNumReq() {
            this.codexIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.codexIdList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new QueryCodexMonsterBeKilledNumReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private QueryCodexMonsterBeKilledNumReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 112: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.codexIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.codexIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 114: {
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
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return QueryCodexMonsterBeKilledNumReqOuterClass.internal_static_QueryCodexMonsterBeKilledNumReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return QueryCodexMonsterBeKilledNumReqOuterClass.internal_static_QueryCodexMonsterBeKilledNumReq_fieldAccessorTable.ensureFieldAccessorsInitialized(QueryCodexMonsterBeKilledNumReq.class, Builder.class);
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
                output.writeUInt32NoTag(114);
                output.writeUInt32NoTag(this.codexIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.codexIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.codexIdList_.getInt(i));
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
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof QueryCodexMonsterBeKilledNumReq)) {
                return super.equals(obj);
            }
            final QueryCodexMonsterBeKilledNumReq other = (QueryCodexMonsterBeKilledNumReq)obj;
            return this.getCodexIdListList().equals(other.getCodexIdListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getCodexIdListCount() > 0) {
                hash = 37 * hash + 14;
                hash = 53 * hash + this.getCodexIdListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static QueryCodexMonsterBeKilledNumReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return QueryCodexMonsterBeKilledNumReq.PARSER.parseFrom(data);
        }
        
        public static QueryCodexMonsterBeKilledNumReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QueryCodexMonsterBeKilledNumReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QueryCodexMonsterBeKilledNumReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return QueryCodexMonsterBeKilledNumReq.PARSER.parseFrom(data);
        }
        
        public static QueryCodexMonsterBeKilledNumReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QueryCodexMonsterBeKilledNumReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QueryCodexMonsterBeKilledNumReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return QueryCodexMonsterBeKilledNumReq.PARSER.parseFrom(data);
        }
        
        public static QueryCodexMonsterBeKilledNumReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QueryCodexMonsterBeKilledNumReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QueryCodexMonsterBeKilledNumReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QueryCodexMonsterBeKilledNumReq.PARSER, input);
        }
        
        public static QueryCodexMonsterBeKilledNumReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QueryCodexMonsterBeKilledNumReq.PARSER, input, extensionRegistry);
        }
        
        public static QueryCodexMonsterBeKilledNumReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(QueryCodexMonsterBeKilledNumReq.PARSER, input);
        }
        
        public static QueryCodexMonsterBeKilledNumReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(QueryCodexMonsterBeKilledNumReq.PARSER, input, extensionRegistry);
        }
        
        public static QueryCodexMonsterBeKilledNumReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QueryCodexMonsterBeKilledNumReq.PARSER, input);
        }
        
        public static QueryCodexMonsterBeKilledNumReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QueryCodexMonsterBeKilledNumReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return QueryCodexMonsterBeKilledNumReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final QueryCodexMonsterBeKilledNumReq prototype) {
            return QueryCodexMonsterBeKilledNumReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == QueryCodexMonsterBeKilledNumReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static QueryCodexMonsterBeKilledNumReq getDefaultInstance() {
            return QueryCodexMonsterBeKilledNumReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<QueryCodexMonsterBeKilledNumReq> parser() {
            return QueryCodexMonsterBeKilledNumReq.PARSER;
        }
        
        @Override
        public Parser<QueryCodexMonsterBeKilledNumReq> getParserForType() {
            return QueryCodexMonsterBeKilledNumReq.PARSER;
        }
        
        @Override
        public QueryCodexMonsterBeKilledNumReq getDefaultInstanceForType() {
            return QueryCodexMonsterBeKilledNumReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new QueryCodexMonsterBeKilledNumReq();
            PARSER = new AbstractParser<QueryCodexMonsterBeKilledNumReq>() {
                @Override
                public QueryCodexMonsterBeKilledNumReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new QueryCodexMonsterBeKilledNumReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements QueryCodexMonsterBeKilledNumReqOrBuilder
        {
            private int bitField0_;
            private Internal.IntList codexIdList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return QueryCodexMonsterBeKilledNumReqOuterClass.internal_static_QueryCodexMonsterBeKilledNumReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return QueryCodexMonsterBeKilledNumReqOuterClass.internal_static_QueryCodexMonsterBeKilledNumReq_fieldAccessorTable.ensureFieldAccessorsInitialized(QueryCodexMonsterBeKilledNumReq.class, Builder.class);
            }
            
            private Builder() {
                this.codexIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.codexIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (QueryCodexMonsterBeKilledNumReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.codexIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return QueryCodexMonsterBeKilledNumReqOuterClass.internal_static_QueryCodexMonsterBeKilledNumReq_descriptor;
            }
            
            @Override
            public QueryCodexMonsterBeKilledNumReq getDefaultInstanceForType() {
                return QueryCodexMonsterBeKilledNumReq.getDefaultInstance();
            }
            
            @Override
            public QueryCodexMonsterBeKilledNumReq build() {
                final QueryCodexMonsterBeKilledNumReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public QueryCodexMonsterBeKilledNumReq buildPartial() {
                final QueryCodexMonsterBeKilledNumReq result = new QueryCodexMonsterBeKilledNumReq(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.codexIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.codexIdList_ = this.codexIdList_;
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
                if (other instanceof QueryCodexMonsterBeKilledNumReq) {
                    return this.mergeFrom((QueryCodexMonsterBeKilledNumReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final QueryCodexMonsterBeKilledNumReq other) {
                if (other == QueryCodexMonsterBeKilledNumReq.getDefaultInstance()) {
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
                QueryCodexMonsterBeKilledNumReq parsedMessage = null;
                try {
                    parsedMessage = QueryCodexMonsterBeKilledNumReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (QueryCodexMonsterBeKilledNumReq)e.getUnfinishedMessage();
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
    
    public interface QueryCodexMonsterBeKilledNumReqOrBuilder extends MessageOrBuilder
    {
        List<Integer> getCodexIdListList();
        
        int getCodexIdListCount();
        
        int getCodexIdList(final int p0);
    }
}
