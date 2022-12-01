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

public final class StoreItemDelNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_StoreItemDelNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_StoreItemDelNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private StoreItemDelNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return StoreItemDelNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018StoreItemDelNotify.proto\u001a\u000fStoreType.proto\"G\n\u0012StoreItemDelNotify\u0012\u0011\n\tguid_list\u0018\f \u0003(\u0004\u0012\u001e\n\nstore_type\u0018\u000f \u0001(\u000e2\n.StoreTypeB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        StoreItemDelNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { StoreTypeOuterClass.getDescriptor() });
        internal_static_StoreItemDelNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_StoreItemDelNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(StoreItemDelNotifyOuterClass.internal_static_StoreItemDelNotify_descriptor, new String[] { "GuidList", "StoreType" });
        StoreTypeOuterClass.getDescriptor();
    }
    
    public static final class StoreItemDelNotify extends GeneratedMessageV3 implements StoreItemDelNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int GUID_LIST_FIELD_NUMBER = 12;
        private Internal.LongList guidList_;
        private int guidListMemoizedSerializedSize;
        public static final int STORE_TYPE_FIELD_NUMBER = 15;
        private int storeType_;
        private byte memoizedIsInitialized;
        private static final StoreItemDelNotify DEFAULT_INSTANCE;
        private static final Parser<StoreItemDelNotify> PARSER;
        
        private StoreItemDelNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.guidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private StoreItemDelNotify() {
            this.guidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.guidList_ = GeneratedMessageV3.emptyLongList();
            this.storeType_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new StoreItemDelNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private StoreItemDelNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 96: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.guidList_ = GeneratedMessageV3.newLongList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.guidList_.addLong(input.readUInt64());
                            continue;
                        }
                        case 98: {
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
                        case 120: {
                            final int rawValue = input.readEnum();
                            this.storeType_ = rawValue;
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
            return StoreItemDelNotifyOuterClass.internal_static_StoreItemDelNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return StoreItemDelNotifyOuterClass.internal_static_StoreItemDelNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(StoreItemDelNotify.class, Builder.class);
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
        public int getStoreTypeValue() {
            return this.storeType_;
        }
        
        @Override
        public StoreTypeOuterClass.StoreType getStoreType() {
            final StoreTypeOuterClass.StoreType result = StoreTypeOuterClass.StoreType.valueOf(this.storeType_);
            return (result == null) ? StoreTypeOuterClass.StoreType.UNRECOGNIZED : result;
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
                output.writeUInt32NoTag(98);
                output.writeUInt32NoTag(this.guidListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.guidList_.size(); ++i) {
                output.writeUInt64NoTag(this.guidList_.getLong(i));
            }
            if (this.storeType_ != StoreTypeOuterClass.StoreType.STORE_TYPE_NONE.getNumber()) {
                output.writeEnum(15, this.storeType_);
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
            if (this.storeType_ != StoreTypeOuterClass.StoreType.STORE_TYPE_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(15, this.storeType_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StoreItemDelNotify)) {
                return super.equals(obj);
            }
            final StoreItemDelNotify other = (StoreItemDelNotify)obj;
            return this.getGuidListList().equals(other.getGuidListList()) && this.storeType_ == other.storeType_ && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getGuidListCount() > 0) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getGuidListList().hashCode();
            }
            hash = 37 * hash + 15;
            hash = 53 * hash + this.storeType_;
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static StoreItemDelNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return StoreItemDelNotify.PARSER.parseFrom(data);
        }
        
        public static StoreItemDelNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return StoreItemDelNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static StoreItemDelNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return StoreItemDelNotify.PARSER.parseFrom(data);
        }
        
        public static StoreItemDelNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return StoreItemDelNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static StoreItemDelNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return StoreItemDelNotify.PARSER.parseFrom(data);
        }
        
        public static StoreItemDelNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return StoreItemDelNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static StoreItemDelNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(StoreItemDelNotify.PARSER, input);
        }
        
        public static StoreItemDelNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(StoreItemDelNotify.PARSER, input, extensionRegistry);
        }
        
        public static StoreItemDelNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(StoreItemDelNotify.PARSER, input);
        }
        
        public static StoreItemDelNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(StoreItemDelNotify.PARSER, input, extensionRegistry);
        }
        
        public static StoreItemDelNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(StoreItemDelNotify.PARSER, input);
        }
        
        public static StoreItemDelNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(StoreItemDelNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return StoreItemDelNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final StoreItemDelNotify prototype) {
            return StoreItemDelNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == StoreItemDelNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static StoreItemDelNotify getDefaultInstance() {
            return StoreItemDelNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<StoreItemDelNotify> parser() {
            return StoreItemDelNotify.PARSER;
        }
        
        @Override
        public Parser<StoreItemDelNotify> getParserForType() {
            return StoreItemDelNotify.PARSER;
        }
        
        @Override
        public StoreItemDelNotify getDefaultInstanceForType() {
            return StoreItemDelNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new StoreItemDelNotify();
            PARSER = new AbstractParser<StoreItemDelNotify>() {
                @Override
                public StoreItemDelNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new StoreItemDelNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StoreItemDelNotifyOrBuilder
        {
            private int bitField0_;
            private Internal.LongList guidList_;
            private int storeType_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return StoreItemDelNotifyOuterClass.internal_static_StoreItemDelNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return StoreItemDelNotifyOuterClass.internal_static_StoreItemDelNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(StoreItemDelNotify.class, Builder.class);
            }
            
            private Builder() {
                this.guidList_ = GeneratedMessageV3.emptyLongList();
                this.storeType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.guidList_ = GeneratedMessageV3.emptyLongList();
                this.storeType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (StoreItemDelNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.guidList_ = GeneratedMessageV3.emptyLongList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.storeType_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return StoreItemDelNotifyOuterClass.internal_static_StoreItemDelNotify_descriptor;
            }
            
            @Override
            public StoreItemDelNotify getDefaultInstanceForType() {
                return StoreItemDelNotify.getDefaultInstance();
            }
            
            @Override
            public StoreItemDelNotify build() {
                final StoreItemDelNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public StoreItemDelNotify buildPartial() {
                final StoreItemDelNotify result = new StoreItemDelNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.guidList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.guidList_ = this.guidList_;
                result.storeType_ = this.storeType_;
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
                if (other instanceof StoreItemDelNotify) {
                    return this.mergeFrom((StoreItemDelNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final StoreItemDelNotify other) {
                if (other == StoreItemDelNotify.getDefaultInstance()) {
                    return this;
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
                if (other.storeType_ != 0) {
                    this.setStoreTypeValue(other.getStoreTypeValue());
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
                StoreItemDelNotify parsedMessage = null;
                try {
                    parsedMessage = StoreItemDelNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (StoreItemDelNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
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
            public int getStoreTypeValue() {
                return this.storeType_;
            }
            
            public Builder setStoreTypeValue(final int value) {
                this.storeType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public StoreTypeOuterClass.StoreType getStoreType() {
                final StoreTypeOuterClass.StoreType result = StoreTypeOuterClass.StoreType.valueOf(this.storeType_);
                return (result == null) ? StoreTypeOuterClass.StoreType.UNRECOGNIZED : result;
            }
            
            public Builder setStoreType(final StoreTypeOuterClass.StoreType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.storeType_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearStoreType() {
                this.storeType_ = 0;
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
    
    public interface StoreItemDelNotifyOrBuilder extends MessageOrBuilder
    {
        List<Long> getGuidListList();
        
        int getGuidListCount();
        
        long getGuidList(final int p0);
        
        int getStoreTypeValue();
        
        StoreTypeOuterClass.StoreType getStoreType();
    }
}
