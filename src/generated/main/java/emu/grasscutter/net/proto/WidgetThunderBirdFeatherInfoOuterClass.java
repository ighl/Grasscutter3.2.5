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

public final class WidgetThunderBirdFeatherInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_WidgetThunderBirdFeatherInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WidgetThunderBirdFeatherInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WidgetThunderBirdFeatherInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WidgetThunderBirdFeatherInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\"WidgetThunderBirdFeatherInfo.proto\"6\n\u001cWidgetThunderBirdFeatherInfo\u0012\u0016\n\u000eentity_id_list\u0018\u0004 \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WidgetThunderBirdFeatherInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_WidgetThunderBirdFeatherInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WidgetThunderBirdFeatherInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WidgetThunderBirdFeatherInfoOuterClass.internal_static_WidgetThunderBirdFeatherInfo_descriptor, new String[] { "EntityIdList" });
    }
    
    public static final class WidgetThunderBirdFeatherInfo extends GeneratedMessageV3 implements WidgetThunderBirdFeatherInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ENTITY_ID_LIST_FIELD_NUMBER = 4;
        private Internal.IntList entityIdList_;
        private int entityIdListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final WidgetThunderBirdFeatherInfo DEFAULT_INSTANCE;
        private static final Parser<WidgetThunderBirdFeatherInfo> PARSER;
        
        private WidgetThunderBirdFeatherInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.entityIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private WidgetThunderBirdFeatherInfo() {
            this.entityIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.entityIdList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WidgetThunderBirdFeatherInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WidgetThunderBirdFeatherInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.entityIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.entityIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 34: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.entityIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.entityIdList_.addInt(input.readUInt32());
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
                    this.entityIdList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return WidgetThunderBirdFeatherInfoOuterClass.internal_static_WidgetThunderBirdFeatherInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WidgetThunderBirdFeatherInfoOuterClass.internal_static_WidgetThunderBirdFeatherInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetThunderBirdFeatherInfo.class, Builder.class);
        }
        
        @Override
        public List<Integer> getEntityIdListList() {
            return this.entityIdList_;
        }
        
        @Override
        public int getEntityIdListCount() {
            return this.entityIdList_.size();
        }
        
        @Override
        public int getEntityIdList(final int index) {
            return this.entityIdList_.getInt(index);
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
            if (this.getEntityIdListList().size() > 0) {
                output.writeUInt32NoTag(34);
                output.writeUInt32NoTag(this.entityIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.entityIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.entityIdList_.getInt(i));
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
            for (int i = 0; i < this.entityIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.entityIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getEntityIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.entityIdListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WidgetThunderBirdFeatherInfo)) {
                return super.equals(obj);
            }
            final WidgetThunderBirdFeatherInfo other = (WidgetThunderBirdFeatherInfo)obj;
            return this.getEntityIdListList().equals(other.getEntityIdListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getEntityIdListCount() > 0) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getEntityIdListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WidgetThunderBirdFeatherInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WidgetThunderBirdFeatherInfo.PARSER.parseFrom(data);
        }
        
        public static WidgetThunderBirdFeatherInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetThunderBirdFeatherInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetThunderBirdFeatherInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WidgetThunderBirdFeatherInfo.PARSER.parseFrom(data);
        }
        
        public static WidgetThunderBirdFeatherInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetThunderBirdFeatherInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetThunderBirdFeatherInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WidgetThunderBirdFeatherInfo.PARSER.parseFrom(data);
        }
        
        public static WidgetThunderBirdFeatherInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetThunderBirdFeatherInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetThunderBirdFeatherInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetThunderBirdFeatherInfo.PARSER, input);
        }
        
        public static WidgetThunderBirdFeatherInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetThunderBirdFeatherInfo.PARSER, input, extensionRegistry);
        }
        
        public static WidgetThunderBirdFeatherInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetThunderBirdFeatherInfo.PARSER, input);
        }
        
        public static WidgetThunderBirdFeatherInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetThunderBirdFeatherInfo.PARSER, input, extensionRegistry);
        }
        
        public static WidgetThunderBirdFeatherInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetThunderBirdFeatherInfo.PARSER, input);
        }
        
        public static WidgetThunderBirdFeatherInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetThunderBirdFeatherInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WidgetThunderBirdFeatherInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WidgetThunderBirdFeatherInfo prototype) {
            return WidgetThunderBirdFeatherInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WidgetThunderBirdFeatherInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WidgetThunderBirdFeatherInfo getDefaultInstance() {
            return WidgetThunderBirdFeatherInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<WidgetThunderBirdFeatherInfo> parser() {
            return WidgetThunderBirdFeatherInfo.PARSER;
        }
        
        @Override
        public Parser<WidgetThunderBirdFeatherInfo> getParserForType() {
            return WidgetThunderBirdFeatherInfo.PARSER;
        }
        
        @Override
        public WidgetThunderBirdFeatherInfo getDefaultInstanceForType() {
            return WidgetThunderBirdFeatherInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WidgetThunderBirdFeatherInfo();
            PARSER = new AbstractParser<WidgetThunderBirdFeatherInfo>() {
                @Override
                public WidgetThunderBirdFeatherInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WidgetThunderBirdFeatherInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WidgetThunderBirdFeatherInfoOrBuilder
        {
            private int bitField0_;
            private Internal.IntList entityIdList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WidgetThunderBirdFeatherInfoOuterClass.internal_static_WidgetThunderBirdFeatherInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WidgetThunderBirdFeatherInfoOuterClass.internal_static_WidgetThunderBirdFeatherInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetThunderBirdFeatherInfo.class, Builder.class);
            }
            
            private Builder() {
                this.entityIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.entityIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (WidgetThunderBirdFeatherInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.entityIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WidgetThunderBirdFeatherInfoOuterClass.internal_static_WidgetThunderBirdFeatherInfo_descriptor;
            }
            
            @Override
            public WidgetThunderBirdFeatherInfo getDefaultInstanceForType() {
                return WidgetThunderBirdFeatherInfo.getDefaultInstance();
            }
            
            @Override
            public WidgetThunderBirdFeatherInfo build() {
                final WidgetThunderBirdFeatherInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WidgetThunderBirdFeatherInfo buildPartial() {
                final WidgetThunderBirdFeatherInfo result = new WidgetThunderBirdFeatherInfo(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.entityIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.entityIdList_ = this.entityIdList_;
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
                if (other instanceof WidgetThunderBirdFeatherInfo) {
                    return this.mergeFrom((WidgetThunderBirdFeatherInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WidgetThunderBirdFeatherInfo other) {
                if (other == WidgetThunderBirdFeatherInfo.getDefaultInstance()) {
                    return this;
                }
                if (!other.entityIdList_.isEmpty()) {
                    if (this.entityIdList_.isEmpty()) {
                        this.entityIdList_ = other.entityIdList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureEntityIdListIsMutable();
                        this.entityIdList_.addAll(other.entityIdList_);
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
                WidgetThunderBirdFeatherInfo parsedMessage = null;
                try {
                    parsedMessage = WidgetThunderBirdFeatherInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WidgetThunderBirdFeatherInfo)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureEntityIdListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.entityIdList_ = GeneratedMessageV3.mutableCopy(this.entityIdList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getEntityIdListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.entityIdList_) : this.entityIdList_;
            }
            
            @Override
            public int getEntityIdListCount() {
                return this.entityIdList_.size();
            }
            
            @Override
            public int getEntityIdList(final int index) {
                return this.entityIdList_.getInt(index);
            }
            
            public Builder setEntityIdList(final int index, final int value) {
                this.ensureEntityIdListIsMutable();
                this.entityIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addEntityIdList(final int value) {
                this.ensureEntityIdListIsMutable();
                this.entityIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllEntityIdList(final Iterable<? extends Integer> values) {
                this.ensureEntityIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.entityIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearEntityIdList() {
                this.entityIdList_ = GeneratedMessageV3.emptyIntList();
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
    
    public interface WidgetThunderBirdFeatherInfoOrBuilder extends MessageOrBuilder
    {
        List<Integer> getEntityIdListList();
        
        int getEntityIdListCount();
        
        int getEntityIdList(final int p0);
    }
}
