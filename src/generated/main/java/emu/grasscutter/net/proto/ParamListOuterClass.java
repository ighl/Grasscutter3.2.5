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

public final class ParamListOuterClass
{
    private static final Descriptors.Descriptor internal_static_ParamList_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ParamList_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ParamListOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ParamListOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u000fParamList.proto\" \n\tParamList\u0012\u0013\n\u000bparam_list_\u0018\u0001 \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ParamListOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ParamList_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ParamList_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ParamListOuterClass.internal_static_ParamList_descriptor, new String[] { "ParamList" });
    }
    
    public static final class ParamList extends GeneratedMessageV3 implements ParamListOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int PARAM_LIST__FIELD_NUMBER = 1;
        private Internal.IntList paramList_;
        private int paramListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final ParamList DEFAULT_INSTANCE;
        private static final Parser<ParamList> PARSER;
        
        private ParamList(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.paramListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private ParamList() {
            this.paramListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.paramList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ParamList();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ParamList(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.paramList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.paramList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 10: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.paramList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.paramList_.addInt(input.readUInt32());
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
                    this.paramList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ParamListOuterClass.internal_static_ParamList_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ParamListOuterClass.internal_static_ParamList_fieldAccessorTable.ensureFieldAccessorsInitialized(ParamList.class, Builder.class);
        }
        
        @Override
        public List<Integer> getParamListList() {
            return this.paramList_;
        }
        
        @Override
        public int getParamListCount() {
            return this.paramList_.size();
        }
        
        @Override
        public int getParamList(final int index) {
            return this.paramList_.getInt(index);
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
            if (this.getParamListList().size() > 0) {
                output.writeUInt32NoTag(10);
                output.writeUInt32NoTag(this.paramListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.paramList_.size(); ++i) {
                output.writeUInt32NoTag(this.paramList_.getInt(i));
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
            for (int i = 0; i < this.paramList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.paramList_.getInt(i));
            }
            size += dataSize;
            if (!this.getParamListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.paramListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ParamList)) {
                return super.equals(obj);
            }
            final ParamList other = (ParamList)obj;
            return this.getParamListList().equals(other.getParamListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getParamListCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getParamListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ParamList parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ParamList.PARSER.parseFrom(data);
        }
        
        public static ParamList parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ParamList.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ParamList parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ParamList.PARSER.parseFrom(data);
        }
        
        public static ParamList parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ParamList.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ParamList parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ParamList.PARSER.parseFrom(data);
        }
        
        public static ParamList parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ParamList.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ParamList parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ParamList.PARSER, input);
        }
        
        public static ParamList parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ParamList.PARSER, input, extensionRegistry);
        }
        
        public static ParamList parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ParamList.PARSER, input);
        }
        
        public static ParamList parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ParamList.PARSER, input, extensionRegistry);
        }
        
        public static ParamList parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ParamList.PARSER, input);
        }
        
        public static ParamList parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ParamList.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ParamList.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ParamList prototype) {
            return ParamList.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ParamList.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ParamList getDefaultInstance() {
            return ParamList.DEFAULT_INSTANCE;
        }
        
        public static Parser<ParamList> parser() {
            return ParamList.PARSER;
        }
        
        @Override
        public Parser<ParamList> getParserForType() {
            return ParamList.PARSER;
        }
        
        @Override
        public ParamList getDefaultInstanceForType() {
            return ParamList.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ParamList();
            PARSER = new AbstractParser<ParamList>() {
                @Override
                public ParamList parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ParamList(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ParamListOrBuilder
        {
            private int bitField0_;
            private Internal.IntList paramList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ParamListOuterClass.internal_static_ParamList_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ParamListOuterClass.internal_static_ParamList_fieldAccessorTable.ensureFieldAccessorsInitialized(ParamList.class, Builder.class);
            }
            
            private Builder() {
                this.paramList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.paramList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ParamList.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.paramList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ParamListOuterClass.internal_static_ParamList_descriptor;
            }
            
            @Override
            public ParamList getDefaultInstanceForType() {
                return ParamList.getDefaultInstance();
            }
            
            @Override
            public ParamList build() {
                final ParamList result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ParamList buildPartial() {
                final ParamList result = new ParamList(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.paramList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.paramList_ = this.paramList_;
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
                if (other instanceof ParamList) {
                    return this.mergeFrom((ParamList)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ParamList other) {
                if (other == ParamList.getDefaultInstance()) {
                    return this;
                }
                if (!other.paramList_.isEmpty()) {
                    if (this.paramList_.isEmpty()) {
                        this.paramList_ = other.paramList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureParamListIsMutable();
                        this.paramList_.addAll(other.paramList_);
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
                ParamList parsedMessage = null;
                try {
                    parsedMessage = ParamList.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ParamList)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureParamListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.paramList_ = GeneratedMessageV3.mutableCopy(this.paramList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getParamListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.paramList_) : this.paramList_;
            }
            
            @Override
            public int getParamListCount() {
                return this.paramList_.size();
            }
            
            @Override
            public int getParamList(final int index) {
                return this.paramList_.getInt(index);
            }
            
            public Builder setParamList(final int index, final int value) {
                this.ensureParamListIsMutable();
                this.paramList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addParamList(final int value) {
                this.ensureParamListIsMutable();
                this.paramList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllParamList(final Iterable<? extends Integer> values) {
                this.ensureParamListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.paramList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearParamList() {
                this.paramList_ = GeneratedMessageV3.emptyIntList();
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
    
    public interface ParamListOrBuilder extends MessageOrBuilder
    {
        List<Integer> getParamListList();
        
        int getParamListCount();
        
        int getParamList(final int p0);
    }
}
