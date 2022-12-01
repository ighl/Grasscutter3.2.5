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

public final class CompoundDataNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_CompoundDataNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CompoundDataNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CompoundDataNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CompoundDataNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018CompoundDataNotify.proto\u001a\u0017CompoundQueueData.proto\"f\n\u0012CompoundDataNotify\u0012\u001c\n\u0014unlock_compound_list\u0018\u0001 \u0003(\r\u00122\n\u0016compound_que_data_list\u0018\t \u0003(\u000b2\u0012.CompoundQueueDataB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CompoundDataNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { CompoundQueueDataOuterClass.getDescriptor() });
        internal_static_CompoundDataNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CompoundDataNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CompoundDataNotifyOuterClass.internal_static_CompoundDataNotify_descriptor, new String[] { "UnlockCompoundList", "CompoundQueDataList" });
        CompoundQueueDataOuterClass.getDescriptor();
    }
    
    public static final class CompoundDataNotify extends GeneratedMessageV3 implements CompoundDataNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int UNLOCK_COMPOUND_LIST_FIELD_NUMBER = 1;
        private Internal.IntList unlockCompoundList_;
        private int unlockCompoundListMemoizedSerializedSize;
        public static final int COMPOUND_QUE_DATA_LIST_FIELD_NUMBER = 9;
        private List<CompoundQueueDataOuterClass.CompoundQueueData> compoundQueDataList_;
        private byte memoizedIsInitialized;
        private static final CompoundDataNotify DEFAULT_INSTANCE;
        private static final Parser<CompoundDataNotify> PARSER;
        
        private CompoundDataNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.unlockCompoundListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private CompoundDataNotify() {
            this.unlockCompoundListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.unlockCompoundList_ = GeneratedMessageV3.emptyIntList();
            this.compoundQueDataList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CompoundDataNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CompoundDataNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.unlockCompoundList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.unlockCompoundList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 10: {
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
                        case 74: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.compoundQueDataList_ = new ArrayList<CompoundQueueDataOuterClass.CompoundQueueData>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.compoundQueDataList_.add(input.readMessage(CompoundQueueDataOuterClass.CompoundQueueData.parser(), extensionRegistry));
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
                    this.unlockCompoundList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.compoundQueDataList_ = Collections.unmodifiableList((List<? extends CompoundQueueDataOuterClass.CompoundQueueData>)this.compoundQueDataList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return CompoundDataNotifyOuterClass.internal_static_CompoundDataNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CompoundDataNotifyOuterClass.internal_static_CompoundDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CompoundDataNotify.class, Builder.class);
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
            if (this.getUnlockCompoundListList().size() > 0) {
                output.writeUInt32NoTag(10);
                output.writeUInt32NoTag(this.unlockCompoundListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.unlockCompoundList_.size(); ++i) {
                output.writeUInt32NoTag(this.unlockCompoundList_.getInt(i));
            }
            for (int i = 0; i < this.compoundQueDataList_.size(); ++i) {
                output.writeMessage(9, this.compoundQueDataList_.get(i));
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
            for (int i = 0; i < this.unlockCompoundList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.unlockCompoundList_.getInt(i));
            }
            size += dataSize;
            if (!this.getUnlockCompoundListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.unlockCompoundListMemoizedSerializedSize = dataSize;
            for (int j = 0; j < this.compoundQueDataList_.size(); ++j) {
                size += CodedOutputStream.computeMessageSize(9, this.compoundQueDataList_.get(j));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CompoundDataNotify)) {
                return super.equals(obj);
            }
            final CompoundDataNotify other = (CompoundDataNotify)obj;
            return this.getUnlockCompoundListList().equals(other.getUnlockCompoundListList()) && this.getCompoundQueDataListList().equals(other.getCompoundQueDataListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getUnlockCompoundListCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getUnlockCompoundListList().hashCode();
            }
            if (this.getCompoundQueDataListCount() > 0) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getCompoundQueDataListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CompoundDataNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CompoundDataNotify.PARSER.parseFrom(data);
        }
        
        public static CompoundDataNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CompoundDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CompoundDataNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CompoundDataNotify.PARSER.parseFrom(data);
        }
        
        public static CompoundDataNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CompoundDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CompoundDataNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CompoundDataNotify.PARSER.parseFrom(data);
        }
        
        public static CompoundDataNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CompoundDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CompoundDataNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CompoundDataNotify.PARSER, input);
        }
        
        public static CompoundDataNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CompoundDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static CompoundDataNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CompoundDataNotify.PARSER, input);
        }
        
        public static CompoundDataNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CompoundDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static CompoundDataNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CompoundDataNotify.PARSER, input);
        }
        
        public static CompoundDataNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CompoundDataNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CompoundDataNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CompoundDataNotify prototype) {
            return CompoundDataNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CompoundDataNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CompoundDataNotify getDefaultInstance() {
            return CompoundDataNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<CompoundDataNotify> parser() {
            return CompoundDataNotify.PARSER;
        }
        
        @Override
        public Parser<CompoundDataNotify> getParserForType() {
            return CompoundDataNotify.PARSER;
        }
        
        @Override
        public CompoundDataNotify getDefaultInstanceForType() {
            return CompoundDataNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CompoundDataNotify();
            PARSER = new AbstractParser<CompoundDataNotify>() {
                @Override
                public CompoundDataNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CompoundDataNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CompoundDataNotifyOrBuilder
        {
            private int bitField0_;
            private Internal.IntList unlockCompoundList_;
            private List<CompoundQueueDataOuterClass.CompoundQueueData> compoundQueDataList_;
            private RepeatedFieldBuilderV3<CompoundQueueDataOuterClass.CompoundQueueData, CompoundQueueDataOuterClass.CompoundQueueData.Builder, CompoundQueueDataOuterClass.CompoundQueueDataOrBuilder> compoundQueDataListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CompoundDataNotifyOuterClass.internal_static_CompoundDataNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CompoundDataNotifyOuterClass.internal_static_CompoundDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CompoundDataNotify.class, Builder.class);
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
                if (CompoundDataNotify.alwaysUseFieldBuilders) {
                    this.getCompoundQueDataListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
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
                return CompoundDataNotifyOuterClass.internal_static_CompoundDataNotify_descriptor;
            }
            
            @Override
            public CompoundDataNotify getDefaultInstanceForType() {
                return CompoundDataNotify.getDefaultInstance();
            }
            
            @Override
            public CompoundDataNotify build() {
                final CompoundDataNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CompoundDataNotify buildPartial() {
                final CompoundDataNotify result = new CompoundDataNotify(this);
                final int from_bitField0_ = this.bitField0_;
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
                if (other instanceof CompoundDataNotify) {
                    return this.mergeFrom((CompoundDataNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CompoundDataNotify other) {
                if (other == CompoundDataNotify.getDefaultInstance()) {
                    return this;
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
                        this.compoundQueDataListBuilder_ = (CompoundDataNotify.alwaysUseFieldBuilders ? this.getCompoundQueDataListFieldBuilder() : null);
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
                CompoundDataNotify parsedMessage = null;
                try {
                    parsedMessage = CompoundDataNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CompoundDataNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
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
    
    public interface CompoundDataNotifyOrBuilder extends MessageOrBuilder
    {
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
