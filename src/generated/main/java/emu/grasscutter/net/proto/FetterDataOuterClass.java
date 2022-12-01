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

public final class FetterDataOuterClass
{
    private static final Descriptors.Descriptor internal_static_FetterData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_FetterData_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private FetterDataOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return FetterDataOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0010FetterData.proto\"N\n\nFetterData\u0012\u0011\n\tfetter_id\u0018\u0001 \u0001(\r\u0012\u0014\n\ffetter_state\u0018\u0002 \u0001(\r\u0012\u0017\n\u000fcond_index_list\u0018\u0003 \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        FetterDataOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_FetterData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_FetterData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(FetterDataOuterClass.internal_static_FetterData_descriptor, new String[] { "FetterId", "FetterState", "CondIndexList" });
    }
    
    public static final class FetterData extends GeneratedMessageV3 implements FetterDataOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int FETTER_ID_FIELD_NUMBER = 1;
        private int fetterId_;
        public static final int FETTER_STATE_FIELD_NUMBER = 2;
        private int fetterState_;
        public static final int COND_INDEX_LIST_FIELD_NUMBER = 3;
        private Internal.IntList condIndexList_;
        private int condIndexListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final FetterData DEFAULT_INSTANCE;
        private static final Parser<FetterData> PARSER;
        
        private FetterData(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.condIndexListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private FetterData() {
            this.condIndexListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.condIndexList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new FetterData();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private FetterData(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.fetterId_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.fetterState_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.condIndexList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.condIndexList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 26: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.condIndexList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.condIndexList_.addInt(input.readUInt32());
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
                    this.condIndexList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return FetterDataOuterClass.internal_static_FetterData_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return FetterDataOuterClass.internal_static_FetterData_fieldAccessorTable.ensureFieldAccessorsInitialized(FetterData.class, Builder.class);
        }
        
        @Override
        public int getFetterId() {
            return this.fetterId_;
        }
        
        @Override
        public int getFetterState() {
            return this.fetterState_;
        }
        
        @Override
        public List<Integer> getCondIndexListList() {
            return this.condIndexList_;
        }
        
        @Override
        public int getCondIndexListCount() {
            return this.condIndexList_.size();
        }
        
        @Override
        public int getCondIndexList(final int index) {
            return this.condIndexList_.getInt(index);
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
            if (this.fetterId_ != 0) {
                output.writeUInt32(1, this.fetterId_);
            }
            if (this.fetterState_ != 0) {
                output.writeUInt32(2, this.fetterState_);
            }
            if (this.getCondIndexListList().size() > 0) {
                output.writeUInt32NoTag(26);
                output.writeUInt32NoTag(this.condIndexListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.condIndexList_.size(); ++i) {
                output.writeUInt32NoTag(this.condIndexList_.getInt(i));
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
            if (this.fetterId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.fetterId_);
            }
            if (this.fetterState_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.fetterState_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.condIndexList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.condIndexList_.getInt(i));
            }
            size += dataSize;
            if (!this.getCondIndexListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.condIndexListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FetterData)) {
                return super.equals(obj);
            }
            final FetterData other = (FetterData)obj;
            return this.getFetterId() == other.getFetterId() && this.getFetterState() == other.getFetterState() && this.getCondIndexListList().equals(other.getCondIndexListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getFetterId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getFetterState();
            if (this.getCondIndexListCount() > 0) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getCondIndexListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static FetterData parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return FetterData.PARSER.parseFrom(data);
        }
        
        public static FetterData parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FetterData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FetterData parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return FetterData.PARSER.parseFrom(data);
        }
        
        public static FetterData parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FetterData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FetterData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return FetterData.PARSER.parseFrom(data);
        }
        
        public static FetterData parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FetterData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FetterData parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FetterData.PARSER, input);
        }
        
        public static FetterData parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FetterData.PARSER, input, extensionRegistry);
        }
        
        public static FetterData parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FetterData.PARSER, input);
        }
        
        public static FetterData parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FetterData.PARSER, input, extensionRegistry);
        }
        
        public static FetterData parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FetterData.PARSER, input);
        }
        
        public static FetterData parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FetterData.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return FetterData.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final FetterData prototype) {
            return FetterData.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == FetterData.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static FetterData getDefaultInstance() {
            return FetterData.DEFAULT_INSTANCE;
        }
        
        public static Parser<FetterData> parser() {
            return FetterData.PARSER;
        }
        
        @Override
        public Parser<FetterData> getParserForType() {
            return FetterData.PARSER;
        }
        
        @Override
        public FetterData getDefaultInstanceForType() {
            return FetterData.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new FetterData();
            PARSER = new AbstractParser<FetterData>() {
                @Override
                public FetterData parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new FetterData(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FetterDataOrBuilder
        {
            private int bitField0_;
            private int fetterId_;
            private int fetterState_;
            private Internal.IntList condIndexList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return FetterDataOuterClass.internal_static_FetterData_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return FetterDataOuterClass.internal_static_FetterData_fieldAccessorTable.ensureFieldAccessorsInitialized(FetterData.class, Builder.class);
            }
            
            private Builder() {
                this.condIndexList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.condIndexList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (FetterData.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.fetterId_ = 0;
                this.fetterState_ = 0;
                this.condIndexList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return FetterDataOuterClass.internal_static_FetterData_descriptor;
            }
            
            @Override
            public FetterData getDefaultInstanceForType() {
                return FetterData.getDefaultInstance();
            }
            
            @Override
            public FetterData build() {
                final FetterData result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public FetterData buildPartial() {
                final FetterData result = new FetterData(this);
                final int from_bitField0_ = this.bitField0_;
                result.fetterId_ = this.fetterId_;
                result.fetterState_ = this.fetterState_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.condIndexList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.condIndexList_ = this.condIndexList_;
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
                if (other instanceof FetterData) {
                    return this.mergeFrom((FetterData)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final FetterData other) {
                if (other == FetterData.getDefaultInstance()) {
                    return this;
                }
                if (other.getFetterId() != 0) {
                    this.setFetterId(other.getFetterId());
                }
                if (other.getFetterState() != 0) {
                    this.setFetterState(other.getFetterState());
                }
                if (!other.condIndexList_.isEmpty()) {
                    if (this.condIndexList_.isEmpty()) {
                        this.condIndexList_ = other.condIndexList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureCondIndexListIsMutable();
                        this.condIndexList_.addAll(other.condIndexList_);
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
                FetterData parsedMessage = null;
                try {
                    parsedMessage = FetterData.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (FetterData)e.getUnfinishedMessage();
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
            public int getFetterId() {
                return this.fetterId_;
            }
            
            public Builder setFetterId(final int value) {
                this.fetterId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFetterId() {
                this.fetterId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getFetterState() {
                return this.fetterState_;
            }
            
            public Builder setFetterState(final int value) {
                this.fetterState_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFetterState() {
                this.fetterState_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureCondIndexListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.condIndexList_ = GeneratedMessageV3.mutableCopy(this.condIndexList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getCondIndexListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.condIndexList_) : this.condIndexList_;
            }
            
            @Override
            public int getCondIndexListCount() {
                return this.condIndexList_.size();
            }
            
            @Override
            public int getCondIndexList(final int index) {
                return this.condIndexList_.getInt(index);
            }
            
            public Builder setCondIndexList(final int index, final int value) {
                this.ensureCondIndexListIsMutable();
                this.condIndexList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addCondIndexList(final int value) {
                this.ensureCondIndexListIsMutable();
                this.condIndexList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllCondIndexList(final Iterable<? extends Integer> values) {
                this.ensureCondIndexListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.condIndexList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearCondIndexList() {
                this.condIndexList_ = GeneratedMessageV3.emptyIntList();
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
    
    public interface FetterDataOrBuilder extends MessageOrBuilder
    {
        int getFetterId();
        
        int getFetterState();
        
        List<Integer> getCondIndexListList();
        
        int getCondIndexListCount();
        
        int getCondIndexList(final int p0);
    }
}
