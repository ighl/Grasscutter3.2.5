// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class ReliquaryPromoteReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_ReliquaryPromoteReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ReliquaryPromoteReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ReliquaryPromoteReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ReliquaryPromoteReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019ReliquaryPromoteReq.proto\"=\n\u0013ReliquaryPromoteReq\u0012\u0011\n\titem_guid\u0018\n \u0001(\u0004\u0012\u0013\n\u000btarget_guid\u0018\r \u0001(\u0004B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ReliquaryPromoteReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ReliquaryPromoteReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ReliquaryPromoteReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ReliquaryPromoteReqOuterClass.internal_static_ReliquaryPromoteReq_descriptor, new String[] { "ItemGuid", "TargetGuid" });
    }
    
    public static final class ReliquaryPromoteReq extends GeneratedMessageV3 implements ReliquaryPromoteReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ITEM_GUID_FIELD_NUMBER = 10;
        private long itemGuid_;
        public static final int TARGET_GUID_FIELD_NUMBER = 13;
        private long targetGuid_;
        private byte memoizedIsInitialized;
        private static final ReliquaryPromoteReq DEFAULT_INSTANCE;
        private static final Parser<ReliquaryPromoteReq> PARSER;
        
        private ReliquaryPromoteReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ReliquaryPromoteReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ReliquaryPromoteReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ReliquaryPromoteReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
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
                        case 80: {
                            this.itemGuid_ = input.readUInt64();
                            continue;
                        }
                        case 104: {
                            this.targetGuid_ = input.readUInt64();
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
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ReliquaryPromoteReqOuterClass.internal_static_ReliquaryPromoteReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ReliquaryPromoteReqOuterClass.internal_static_ReliquaryPromoteReq_fieldAccessorTable.ensureFieldAccessorsInitialized(ReliquaryPromoteReq.class, Builder.class);
        }
        
        @Override
        public long getItemGuid() {
            return this.itemGuid_;
        }
        
        @Override
        public long getTargetGuid() {
            return this.targetGuid_;
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
            if (this.itemGuid_ != 0L) {
                output.writeUInt64(10, this.itemGuid_);
            }
            if (this.targetGuid_ != 0L) {
                output.writeUInt64(13, this.targetGuid_);
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
            if (this.itemGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(10, this.itemGuid_);
            }
            if (this.targetGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(13, this.targetGuid_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ReliquaryPromoteReq)) {
                return super.equals(obj);
            }
            final ReliquaryPromoteReq other = (ReliquaryPromoteReq)obj;
            return this.getItemGuid() == other.getItemGuid() && this.getTargetGuid() == other.getTargetGuid() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 10;
            hash = 53 * hash + Internal.hashLong(this.getItemGuid());
            hash = 37 * hash + 13;
            hash = 53 * hash + Internal.hashLong(this.getTargetGuid());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ReliquaryPromoteReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ReliquaryPromoteReq.PARSER.parseFrom(data);
        }
        
        public static ReliquaryPromoteReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ReliquaryPromoteReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ReliquaryPromoteReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ReliquaryPromoteReq.PARSER.parseFrom(data);
        }
        
        public static ReliquaryPromoteReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ReliquaryPromoteReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ReliquaryPromoteReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ReliquaryPromoteReq.PARSER.parseFrom(data);
        }
        
        public static ReliquaryPromoteReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ReliquaryPromoteReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ReliquaryPromoteReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ReliquaryPromoteReq.PARSER, input);
        }
        
        public static ReliquaryPromoteReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ReliquaryPromoteReq.PARSER, input, extensionRegistry);
        }
        
        public static ReliquaryPromoteReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ReliquaryPromoteReq.PARSER, input);
        }
        
        public static ReliquaryPromoteReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ReliquaryPromoteReq.PARSER, input, extensionRegistry);
        }
        
        public static ReliquaryPromoteReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ReliquaryPromoteReq.PARSER, input);
        }
        
        public static ReliquaryPromoteReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ReliquaryPromoteReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ReliquaryPromoteReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ReliquaryPromoteReq prototype) {
            return ReliquaryPromoteReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ReliquaryPromoteReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ReliquaryPromoteReq getDefaultInstance() {
            return ReliquaryPromoteReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<ReliquaryPromoteReq> parser() {
            return ReliquaryPromoteReq.PARSER;
        }
        
        @Override
        public Parser<ReliquaryPromoteReq> getParserForType() {
            return ReliquaryPromoteReq.PARSER;
        }
        
        @Override
        public ReliquaryPromoteReq getDefaultInstanceForType() {
            return ReliquaryPromoteReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ReliquaryPromoteReq();
            PARSER = new AbstractParser<ReliquaryPromoteReq>() {
                @Override
                public ReliquaryPromoteReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ReliquaryPromoteReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ReliquaryPromoteReqOrBuilder
        {
            private long itemGuid_;
            private long targetGuid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ReliquaryPromoteReqOuterClass.internal_static_ReliquaryPromoteReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ReliquaryPromoteReqOuterClass.internal_static_ReliquaryPromoteReq_fieldAccessorTable.ensureFieldAccessorsInitialized(ReliquaryPromoteReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ReliquaryPromoteReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.itemGuid_ = 0L;
                this.targetGuid_ = 0L;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ReliquaryPromoteReqOuterClass.internal_static_ReliquaryPromoteReq_descriptor;
            }
            
            @Override
            public ReliquaryPromoteReq getDefaultInstanceForType() {
                return ReliquaryPromoteReq.getDefaultInstance();
            }
            
            @Override
            public ReliquaryPromoteReq build() {
                final ReliquaryPromoteReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ReliquaryPromoteReq buildPartial() {
                final ReliquaryPromoteReq result = new ReliquaryPromoteReq(this);
                result.itemGuid_ = this.itemGuid_;
                result.targetGuid_ = this.targetGuid_;
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
                if (other instanceof ReliquaryPromoteReq) {
                    return this.mergeFrom((ReliquaryPromoteReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ReliquaryPromoteReq other) {
                if (other == ReliquaryPromoteReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getItemGuid() != 0L) {
                    this.setItemGuid(other.getItemGuid());
                }
                if (other.getTargetGuid() != 0L) {
                    this.setTargetGuid(other.getTargetGuid());
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
                ReliquaryPromoteReq parsedMessage = null;
                try {
                    parsedMessage = ReliquaryPromoteReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ReliquaryPromoteReq)e.getUnfinishedMessage();
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
            public long getItemGuid() {
                return this.itemGuid_;
            }
            
            public Builder setItemGuid(final long value) {
                this.itemGuid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearItemGuid() {
                this.itemGuid_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public long getTargetGuid() {
                return this.targetGuid_;
            }
            
            public Builder setTargetGuid(final long value) {
                this.targetGuid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTargetGuid() {
                this.targetGuid_ = 0L;
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
    
    public interface ReliquaryPromoteReqOrBuilder extends MessageOrBuilder
    {
        long getItemGuid();
        
        long getTargetGuid();
    }
}
