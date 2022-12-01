// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import java.util.List;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class GetCompoundDataRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_GetCompoundDataRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GetCompoundDataRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GetCompoundDataRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GetCompoundDataRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018GetCompoundDataRsp.proto\u001a\u0017CompoundQueueData.proto\"w\n\u0012GetCompoundDataRsp\u0012\u000f\n\u0007retcode\u0018\u0003 \u0001(\u0005\u0012\u001c\n\u0014unlock_compound_list\u0018\u000b \u0003(\r\u00122\n\u0016compound_que_data_list\u0018\u0007 \u0003(\u000b2\u0012.CompoundQueueDataB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GetCompoundDataRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { CompoundQueueDataOuterClass.getDescriptor() });
        internal_static_GetCompoundDataRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetCompoundDataRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GetCompoundDataRspOuterClass.internal_static_GetCompoundDataRsp_descriptor, new String[] { "Retcode", "UnlockCompoundList", "CompoundQueDataList" });
        CompoundQueueDataOuterClass.getDescriptor();
    }
    
    public static final class GetCompoundDataRsp extends GeneratedMessageV3 implements GetCompoundDataRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 3;
        private int retcode_;
        public static final int UNLOCK_COMPOUND_LIST_FIELD_NUMBER = 11;
        private Internal.IntList unlockCompoundList_;
        private int unlockCompoundListMemoizedSerializedSize;
        public static final int COMPOUND_QUE_DATA_LIST_FIELD_NUMBER = 7;
        private List<CompoundQueueDataOuterClass.CompoundQueueData> compoundQueDataList_;
        private byte memoizedIsInitialized;
        private static final GetCompoundDataRsp DEFAULT_INSTANCE;
        private static final Parser<GetCompoundDataRsp> PARSER;
        
        private GetCompoundDataRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.unlockCompoundListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private GetCompoundDataRsp() {
            this.unlockCompoundListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.unlockCompoundList_ = GeneratedMessageV3.emptyIntList();
            this.compoundQueDataList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GetCompoundDataRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GetCompoundDataRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 24: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 58: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.compoundQueDataList_ = new ArrayList<CompoundQueueDataOuterClass.CompoundQueueData>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.compoundQueDataList_.add(input.readMessage(CompoundQueueDataOuterClass.CompoundQueueData.parser(), extensionRegistry));
                            continue;
                        }
                        case 88: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.unlockCompoundList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.unlockCompoundList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 90: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.unlockCompoundList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.unlockCompoundList_.addInt(input.readUInt32());
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
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.compoundQueDataList_ = Collections.unmodifiableList((List<? extends CompoundQueueDataOuterClass.CompoundQueueData>)this.compoundQueDataList_);
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.unlockCompoundList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return GetCompoundDataRspOuterClass.internal_static_GetCompoundDataRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GetCompoundDataRspOuterClass.internal_static_GetCompoundDataRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetCompoundDataRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public List<Integer> getUnlockCompoundListList() {
            return this.unlockCompoundList_;
        }
        
        @Override
        public int getUnlockCompoundListCount() {
            return this.unlockCompoundList_.size();
        }
        
        @Override
        public int getUnlockCompoundList(final int index) {
            return this.unlockCompoundList_.getInt(index);
        }
        
        @Override
        public List<CompoundQueueDataOuterClass.CompoundQueueData> getCompoundQueDataListList() {
            return this.compoundQueDataList_;
        }
        
        @Override
        public List<? extends CompoundQueueDataOuterClass.CompoundQueueDataOrBuilder> getCompoundQueDataListOrBuilderList() {
            return this.compoundQueDataList_;
        }
        
        @Override
        public int getCompoundQueDataListCount() {
            return this.compoundQueDataList_.size();
        }
        
        @Override
        public CompoundQueueDataOuterClass.CompoundQueueData getCompoundQueDataList(final int index) {
            return this.compoundQueDataList_.get(index);
        }
        
        @Override
        public CompoundQueueDataOuterClass.CompoundQueueDataOrBuilder getCompoundQueDataListOrBuilder(final int index) {
            return this.compoundQueDataList_.get(index);
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
                output.writeInt32(3, this.retcode_);
            }
            for (int i = 0; i < this.compoundQueDataList_.size(); ++i) {
                output.writeMessage(7, this.compoundQueDataList_.get(i));
            }
            if (this.getUnlockCompoundListList().size() > 0) {
                output.writeUInt32NoTag(90);
                output.writeUInt32NoTag(this.unlockCompoundListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.unlockCompoundList_.size(); ++i) {
                output.writeUInt32NoTag(this.unlockCompoundList_.getInt(i));
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
                size += CodedOutputStream.computeInt32Size(3, this.retcode_);
            }
            for (int i = 0; i < this.compoundQueDataList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(7, this.compoundQueDataList_.get(i));
            }
            int dataSize = 0;
            for (int j = 0; j < this.unlockCompoundList_.size(); ++j) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.unlockCompoundList_.getInt(j));
            }
            size += dataSize;
            if (!this.getUnlockCompoundListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.unlockCompoundListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetCompoundDataRsp)) {
                return super.equals(obj);
            }
            final GetCompoundDataRsp other = (GetCompoundDataRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.getUnlockCompoundListList().equals(other.getUnlockCompoundListList()) && this.getCompoundQueDataListList().equals(other.getCompoundQueDataListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getRetcode();
            if (this.getUnlockCompoundListCount() > 0) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.getUnlockCompoundListList().hashCode();
            }
            if (this.getCompoundQueDataListCount() > 0) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.getCompoundQueDataListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GetCompoundDataRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GetCompoundDataRsp.PARSER.parseFrom(data);
        }
        
        public static GetCompoundDataRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetCompoundDataRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetCompoundDataRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GetCompoundDataRsp.PARSER.parseFrom(data);
        }
        
        public static GetCompoundDataRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetCompoundDataRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetCompoundDataRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GetCompoundDataRsp.PARSER.parseFrom(data);
        }
        
        public static GetCompoundDataRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetCompoundDataRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetCompoundDataRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetCompoundDataRsp.PARSER, input);
        }
        
        public static GetCompoundDataRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetCompoundDataRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetCompoundDataRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetCompoundDataRsp.PARSER, input);
        }
        
        public static GetCompoundDataRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetCompoundDataRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetCompoundDataRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetCompoundDataRsp.PARSER, input);
        }
        
        public static GetCompoundDataRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetCompoundDataRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GetCompoundDataRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GetCompoundDataRsp prototype) {
            return GetCompoundDataRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GetCompoundDataRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GetCompoundDataRsp getDefaultInstance() {
            return GetCompoundDataRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<GetCompoundDataRsp> parser() {
            return GetCompoundDataRsp.PARSER;
        }
        
        @Override
        public Parser<GetCompoundDataRsp> getParserForType() {
            return GetCompoundDataRsp.PARSER;
        }
        
        @Override
        public GetCompoundDataRsp getDefaultInstanceForType() {
            return GetCompoundDataRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GetCompoundDataRsp();
            PARSER = new AbstractParser<GetCompoundDataRsp>() {
                @Override
                public GetCompoundDataRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GetCompoundDataRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetCompoundDataRspOrBuilder
        {
            private int bitField0_;
            private int retcode_;
            private Internal.IntList unlockCompoundList_;
            private List<CompoundQueueDataOuterClass.CompoundQueueData> compoundQueDataList_;
            private RepeatedFieldBuilderV3<CompoundQueueDataOuterClass.CompoundQueueData, CompoundQueueDataOuterClass.CompoundQueueData.Builder, CompoundQueueDataOuterClass.CompoundQueueDataOrBuilder> compoundQueDataListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GetCompoundDataRspOuterClass.internal_static_GetCompoundDataRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GetCompoundDataRspOuterClass.internal_static_GetCompoundDataRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetCompoundDataRsp.class, Builder.class);
            }
            
            private Builder() {
                this.unlockCompoundList_ = GeneratedMessageV3.emptyIntList();
                this.compoundQueDataList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.unlockCompoundList_ = GeneratedMessageV3.emptyIntList();
                this.compoundQueDataList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GetCompoundDataRsp.alwaysUseFieldBuilders) {
                    this.getCompoundQueDataListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                this.unlockCompoundList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                if (this.compoundQueDataListBuilder_ == null) {
                    this.compoundQueDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                else {
                    this.compoundQueDataListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GetCompoundDataRspOuterClass.internal_static_GetCompoundDataRsp_descriptor;
            }
            
            @Override
            public GetCompoundDataRsp getDefaultInstanceForType() {
                return GetCompoundDataRsp.getDefaultInstance();
            }
            
            @Override
            public GetCompoundDataRsp build() {
                final GetCompoundDataRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GetCompoundDataRsp buildPartial() {
                final GetCompoundDataRsp result = new GetCompoundDataRsp(this);
                final int from_bitField0_ = this.bitField0_;
                result.retcode_ = this.retcode_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.unlockCompoundList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.unlockCompoundList_ = this.unlockCompoundList_;
                if (this.compoundQueDataListBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) != 0x0) {
                        this.compoundQueDataList_ = Collections.unmodifiableList((List<? extends CompoundQueueDataOuterClass.CompoundQueueData>)this.compoundQueDataList_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.compoundQueDataList_ = this.compoundQueDataList_;
                }
                else {
                    result.compoundQueDataList_ = this.compoundQueDataListBuilder_.build();
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
                if (other instanceof GetCompoundDataRsp) {
                    return this.mergeFrom((GetCompoundDataRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GetCompoundDataRsp other) {
                if (other == GetCompoundDataRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (!other.unlockCompoundList_.isEmpty()) {
                    if (this.unlockCompoundList_.isEmpty()) {
                        this.unlockCompoundList_ = other.unlockCompoundList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureUnlockCompoundListIsMutable();
                        this.unlockCompoundList_.addAll(other.unlockCompoundList_);
                    }
                    this.onChanged();
                }
                if (this.compoundQueDataListBuilder_ == null) {
                    if (!other.compoundQueDataList_.isEmpty()) {
                        if (this.compoundQueDataList_.isEmpty()) {
                            this.compoundQueDataList_ = other.compoundQueDataList_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        }
                        else {
                            this.ensureCompoundQueDataListIsMutable();
                            this.compoundQueDataList_.addAll(other.compoundQueDataList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.compoundQueDataList_.isEmpty()) {
                    if (this.compoundQueDataListBuilder_.isEmpty()) {
                        this.compoundQueDataListBuilder_.dispose();
                        this.compoundQueDataListBuilder_ = null;
                        this.compoundQueDataList_ = other.compoundQueDataList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.compoundQueDataListBuilder_ = (GetCompoundDataRsp.alwaysUseFieldBuilders ? this.getCompoundQueDataListFieldBuilder() : null);
                    }
                    else {
                        this.compoundQueDataListBuilder_.addAllMessages(other.compoundQueDataList_);
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
                GetCompoundDataRsp parsedMessage = null;
                try {
                    parsedMessage = GetCompoundDataRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GetCompoundDataRsp)e.getUnfinishedMessage();
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
            
            private void ensureUnlockCompoundListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.unlockCompoundList_ = GeneratedMessageV3.mutableCopy(this.unlockCompoundList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getUnlockCompoundListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.unlockCompoundList_) : this.unlockCompoundList_;
            }
            
            @Override
            public int getUnlockCompoundListCount() {
                return this.unlockCompoundList_.size();
            }
            
            @Override
            public int getUnlockCompoundList(final int index) {
                return this.unlockCompoundList_.getInt(index);
            }
            
            public Builder setUnlockCompoundList(final int index, final int value) {
                this.ensureUnlockCompoundListIsMutable();
                this.unlockCompoundList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addUnlockCompoundList(final int value) {
                this.ensureUnlockCompoundListIsMutable();
                this.unlockCompoundList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllUnlockCompoundList(final Iterable<? extends Integer> values) {
                this.ensureUnlockCompoundListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.unlockCompoundList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearUnlockCompoundList() {
                this.unlockCompoundList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            private void ensureCompoundQueDataListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.compoundQueDataList_ = new ArrayList<CompoundQueueDataOuterClass.CompoundQueueData>(this.compoundQueDataList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<CompoundQueueDataOuterClass.CompoundQueueData> getCompoundQueDataListList() {
                if (this.compoundQueDataListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends CompoundQueueDataOuterClass.CompoundQueueData>)this.compoundQueDataList_);
                }
                return this.compoundQueDataListBuilder_.getMessageList();
            }
            
            @Override
            public int getCompoundQueDataListCount() {
                if (this.compoundQueDataListBuilder_ == null) {
                    return this.compoundQueDataList_.size();
                }
                return this.compoundQueDataListBuilder_.getCount();
            }
            
            @Override
            public CompoundQueueDataOuterClass.CompoundQueueData getCompoundQueDataList(final int index) {
                if (this.compoundQueDataListBuilder_ == null) {
                    return this.compoundQueDataList_.get(index);
                }
                return this.compoundQueDataListBuilder_.getMessage(index);
            }
            
            public Builder setCompoundQueDataList(final int index, final CompoundQueueDataOuterClass.CompoundQueueData value) {
                if (this.compoundQueDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureCompoundQueDataListIsMutable();
                    this.compoundQueDataList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.compoundQueDataListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setCompoundQueDataList(final int index, final CompoundQueueDataOuterClass.CompoundQueueData.Builder builderForValue) {
                if (this.compoundQueDataListBuilder_ == null) {
                    this.ensureCompoundQueDataListIsMutable();
                    this.compoundQueDataList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.compoundQueDataListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addCompoundQueDataList(final CompoundQueueDataOuterClass.CompoundQueueData value) {
                if (this.compoundQueDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureCompoundQueDataListIsMutable();
                    this.compoundQueDataList_.add(value);
                    this.onChanged();
                }
                else {
                    this.compoundQueDataListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addCompoundQueDataList(final int index, final CompoundQueueDataOuterClass.CompoundQueueData value) {
                if (this.compoundQueDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureCompoundQueDataListIsMutable();
                    this.compoundQueDataList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.compoundQueDataListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addCompoundQueDataList(final CompoundQueueDataOuterClass.CompoundQueueData.Builder builderForValue) {
                if (this.compoundQueDataListBuilder_ == null) {
                    this.ensureCompoundQueDataListIsMutable();
                    this.compoundQueDataList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.compoundQueDataListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addCompoundQueDataList(final int index, final CompoundQueueDataOuterClass.CompoundQueueData.Builder builderForValue) {
                if (this.compoundQueDataListBuilder_ == null) {
                    this.ensureCompoundQueDataListIsMutable();
                    this.compoundQueDataList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.compoundQueDataListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllCompoundQueDataList(final Iterable<? extends CompoundQueueDataOuterClass.CompoundQueueData> values) {
                if (this.compoundQueDataListBuilder_ == null) {
                    this.ensureCompoundQueDataListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.compoundQueDataList_);
                    this.onChanged();
                }
                else {
                    this.compoundQueDataListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearCompoundQueDataList() {
                if (this.compoundQueDataListBuilder_ == null) {
                    this.compoundQueDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    this.onChanged();
                }
                else {
                    this.compoundQueDataListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeCompoundQueDataList(final int index) {
                if (this.compoundQueDataListBuilder_ == null) {
                    this.ensureCompoundQueDataListIsMutable();
                    this.compoundQueDataList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.compoundQueDataListBuilder_.remove(index);
                }
                return this;
            }
            
            public CompoundQueueDataOuterClass.CompoundQueueData.Builder getCompoundQueDataListBuilder(final int index) {
                return this.getCompoundQueDataListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public CompoundQueueDataOuterClass.CompoundQueueDataOrBuilder getCompoundQueDataListOrBuilder(final int index) {
                if (this.compoundQueDataListBuilder_ == null) {
                    return this.compoundQueDataList_.get(index);
                }
                return this.compoundQueDataListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends CompoundQueueDataOuterClass.CompoundQueueDataOrBuilder> getCompoundQueDataListOrBuilderList() {
                if (this.compoundQueDataListBuilder_ != null) {
                    return this.compoundQueDataListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends CompoundQueueDataOuterClass.CompoundQueueDataOrBuilder>)this.compoundQueDataList_);
            }
            
            public CompoundQueueDataOuterClass.CompoundQueueData.Builder addCompoundQueDataListBuilder() {
                return this.getCompoundQueDataListFieldBuilder().addBuilder(CompoundQueueDataOuterClass.CompoundQueueData.getDefaultInstance());
            }
            
            public CompoundQueueDataOuterClass.CompoundQueueData.Builder addCompoundQueDataListBuilder(final int index) {
                return this.getCompoundQueDataListFieldBuilder().addBuilder(index, CompoundQueueDataOuterClass.CompoundQueueData.getDefaultInstance());
            }
            
            public List<CompoundQueueDataOuterClass.CompoundQueueData.Builder> getCompoundQueDataListBuilderList() {
                return this.getCompoundQueDataListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<CompoundQueueDataOuterClass.CompoundQueueData, CompoundQueueDataOuterClass.CompoundQueueData.Builder, CompoundQueueDataOuterClass.CompoundQueueDataOrBuilder> getCompoundQueDataListFieldBuilder() {
                if (this.compoundQueDataListBuilder_ == null) {
                    this.compoundQueDataListBuilder_ = new RepeatedFieldBuilderV3<CompoundQueueDataOuterClass.CompoundQueueData, CompoundQueueDataOuterClass.CompoundQueueData.Builder, CompoundQueueDataOuterClass.CompoundQueueDataOrBuilder>(this.compoundQueDataList_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
                    this.compoundQueDataList_ = null;
                }
                return this.compoundQueDataListBuilder_;
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
    
    public interface GetCompoundDataRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        List<Integer> getUnlockCompoundListList();
        
        int getUnlockCompoundListCount();
        
        int getUnlockCompoundList(final int p0);
        
        List<CompoundQueueDataOuterClass.CompoundQueueData> getCompoundQueDataListList();
        
        CompoundQueueDataOuterClass.CompoundQueueData getCompoundQueDataList(final int p0);
        
        int getCompoundQueDataListCount();
        
        List<? extends CompoundQueueDataOuterClass.CompoundQueueDataOrBuilder> getCompoundQueDataListOrBuilderList();
        
        CompoundQueueDataOuterClass.CompoundQueueDataOrBuilder getCompoundQueDataListOrBuilder(final int p0);
    }
}
