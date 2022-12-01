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

public final class CombineDataNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_CombineDataNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CombineDataNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CombineDataNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CombineDataNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017CombineDataNotify.proto\",\n\u0011CombineDataNotify\u0012\u0017\n\u000fcombine_id_list\u0018\u0005 \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CombineDataNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_CombineDataNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CombineDataNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CombineDataNotifyOuterClass.internal_static_CombineDataNotify_descriptor, new String[] { "CombineIdList" });
    }
    
    public static final class CombineDataNotify extends GeneratedMessageV3 implements CombineDataNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int COMBINE_ID_LIST_FIELD_NUMBER = 5;
        private Internal.IntList combineIdList_;
        private int combineIdListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final CombineDataNotify DEFAULT_INSTANCE;
        private static final Parser<CombineDataNotify> PARSER;
        
        private CombineDataNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.combineIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private CombineDataNotify() {
            this.combineIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.combineIdList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CombineDataNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CombineDataNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 40: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.combineIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.combineIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 42: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.combineIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.combineIdList_.addInt(input.readUInt32());
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
                    this.combineIdList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return CombineDataNotifyOuterClass.internal_static_CombineDataNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CombineDataNotifyOuterClass.internal_static_CombineDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CombineDataNotify.class, Builder.class);
        }
        
        @Override
        public List<Integer> getCombineIdListList() {
            return this.combineIdList_;
        }
        
        @Override
        public int getCombineIdListCount() {
            return this.combineIdList_.size();
        }
        
        @Override
        public int getCombineIdList(final int index) {
            return this.combineIdList_.getInt(index);
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
            if (this.getCombineIdListList().size() > 0) {
                output.writeUInt32NoTag(42);
                output.writeUInt32NoTag(this.combineIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.combineIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.combineIdList_.getInt(i));
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
            for (int i = 0; i < this.combineIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.combineIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getCombineIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.combineIdListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CombineDataNotify)) {
                return super.equals(obj);
            }
            final CombineDataNotify other = (CombineDataNotify)obj;
            return this.getCombineIdListList().equals(other.getCombineIdListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getCombineIdListCount() > 0) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getCombineIdListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CombineDataNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CombineDataNotify.PARSER.parseFrom(data);
        }
        
        public static CombineDataNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CombineDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CombineDataNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CombineDataNotify.PARSER.parseFrom(data);
        }
        
        public static CombineDataNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CombineDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CombineDataNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CombineDataNotify.PARSER.parseFrom(data);
        }
        
        public static CombineDataNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CombineDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CombineDataNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CombineDataNotify.PARSER, input);
        }
        
        public static CombineDataNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CombineDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static CombineDataNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CombineDataNotify.PARSER, input);
        }
        
        public static CombineDataNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CombineDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static CombineDataNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CombineDataNotify.PARSER, input);
        }
        
        public static CombineDataNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CombineDataNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CombineDataNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CombineDataNotify prototype) {
            return CombineDataNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CombineDataNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CombineDataNotify getDefaultInstance() {
            return CombineDataNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<CombineDataNotify> parser() {
            return CombineDataNotify.PARSER;
        }
        
        @Override
        public Parser<CombineDataNotify> getParserForType() {
            return CombineDataNotify.PARSER;
        }
        
        @Override
        public CombineDataNotify getDefaultInstanceForType() {
            return CombineDataNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CombineDataNotify();
            PARSER = new AbstractParser<CombineDataNotify>() {
                @Override
                public CombineDataNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CombineDataNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CombineDataNotifyOrBuilder
        {
            private int bitField0_;
            private Internal.IntList combineIdList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CombineDataNotifyOuterClass.internal_static_CombineDataNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CombineDataNotifyOuterClass.internal_static_CombineDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CombineDataNotify.class, Builder.class);
            }
            
            private Builder() {
                this.combineIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.combineIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (CombineDataNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.combineIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CombineDataNotifyOuterClass.internal_static_CombineDataNotify_descriptor;
            }
            
            @Override
            public CombineDataNotify getDefaultInstanceForType() {
                return CombineDataNotify.getDefaultInstance();
            }
            
            @Override
            public CombineDataNotify build() {
                final CombineDataNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CombineDataNotify buildPartial() {
                final CombineDataNotify result = new CombineDataNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.combineIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.combineIdList_ = this.combineIdList_;
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
                if (other instanceof CombineDataNotify) {
                    return this.mergeFrom((CombineDataNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CombineDataNotify other) {
                if (other == CombineDataNotify.getDefaultInstance()) {
                    return this;
                }
                if (!other.combineIdList_.isEmpty()) {
                    if (this.combineIdList_.isEmpty()) {
                        this.combineIdList_ = other.combineIdList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureCombineIdListIsMutable();
                        this.combineIdList_.addAll(other.combineIdList_);
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
                CombineDataNotify parsedMessage = null;
                try {
                    parsedMessage = CombineDataNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CombineDataNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureCombineIdListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.combineIdList_ = GeneratedMessageV3.mutableCopy(this.combineIdList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getCombineIdListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.combineIdList_) : this.combineIdList_;
            }
            
            @Override
            public int getCombineIdListCount() {
                return this.combineIdList_.size();
            }
            
            @Override
            public int getCombineIdList(final int index) {
                return this.combineIdList_.getInt(index);
            }
            
            public Builder setCombineIdList(final int index, final int value) {
                this.ensureCombineIdListIsMutable();
                this.combineIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addCombineIdList(final int value) {
                this.ensureCombineIdListIsMutable();
                this.combineIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllCombineIdList(final Iterable<? extends Integer> values) {
                this.ensureCombineIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.combineIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearCombineIdList() {
                this.combineIdList_ = GeneratedMessageV3.emptyIntList();
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
    
    public interface CombineDataNotifyOrBuilder extends MessageOrBuilder
    {
        List<Integer> getCombineIdListList();
        
        int getCombineIdListCount();
        
        int getCombineIdList(final int p0);
    }
}
