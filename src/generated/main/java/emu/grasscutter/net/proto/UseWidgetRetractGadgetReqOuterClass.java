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

public final class UseWidgetRetractGadgetReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_UseWidgetRetractGadgetReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_UseWidgetRetractGadgetReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private UseWidgetRetractGadgetReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return UseWidgetRetractGadgetReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001fUseWidgetRetractGadgetReq.proto\".\n\u0019UseWidgetRetractGadgetReq\u0012\u0011\n\tentity_id\u0018\u0003 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        UseWidgetRetractGadgetReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_UseWidgetRetractGadgetReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_UseWidgetRetractGadgetReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(UseWidgetRetractGadgetReqOuterClass.internal_static_UseWidgetRetractGadgetReq_descriptor, new String[] { "EntityId" });
    }
    
    public static final class UseWidgetRetractGadgetReq extends GeneratedMessageV3 implements UseWidgetRetractGadgetReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ENTITY_ID_FIELD_NUMBER = 3;
        private int entityId_;
        private byte memoizedIsInitialized;
        private static final UseWidgetRetractGadgetReq DEFAULT_INSTANCE;
        private static final Parser<UseWidgetRetractGadgetReq> PARSER;
        
        private UseWidgetRetractGadgetReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private UseWidgetRetractGadgetReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new UseWidgetRetractGadgetReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private UseWidgetRetractGadgetReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 24: {
                            this.entityId_ = input.readUInt32();
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
            return UseWidgetRetractGadgetReqOuterClass.internal_static_UseWidgetRetractGadgetReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return UseWidgetRetractGadgetReqOuterClass.internal_static_UseWidgetRetractGadgetReq_fieldAccessorTable.ensureFieldAccessorsInitialized(UseWidgetRetractGadgetReq.class, Builder.class);
        }
        
        @Override
        public int getEntityId() {
            return this.entityId_;
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
            if (this.entityId_ != 0) {
                output.writeUInt32(3, this.entityId_);
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
            if (this.entityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.entityId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UseWidgetRetractGadgetReq)) {
                return super.equals(obj);
            }
            final UseWidgetRetractGadgetReq other = (UseWidgetRetractGadgetReq)obj;
            return this.getEntityId() == other.getEntityId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getEntityId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static UseWidgetRetractGadgetReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return UseWidgetRetractGadgetReq.PARSER.parseFrom(data);
        }
        
        public static UseWidgetRetractGadgetReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return UseWidgetRetractGadgetReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static UseWidgetRetractGadgetReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return UseWidgetRetractGadgetReq.PARSER.parseFrom(data);
        }
        
        public static UseWidgetRetractGadgetReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return UseWidgetRetractGadgetReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static UseWidgetRetractGadgetReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return UseWidgetRetractGadgetReq.PARSER.parseFrom(data);
        }
        
        public static UseWidgetRetractGadgetReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return UseWidgetRetractGadgetReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static UseWidgetRetractGadgetReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(UseWidgetRetractGadgetReq.PARSER, input);
        }
        
        public static UseWidgetRetractGadgetReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(UseWidgetRetractGadgetReq.PARSER, input, extensionRegistry);
        }
        
        public static UseWidgetRetractGadgetReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(UseWidgetRetractGadgetReq.PARSER, input);
        }
        
        public static UseWidgetRetractGadgetReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(UseWidgetRetractGadgetReq.PARSER, input, extensionRegistry);
        }
        
        public static UseWidgetRetractGadgetReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(UseWidgetRetractGadgetReq.PARSER, input);
        }
        
        public static UseWidgetRetractGadgetReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(UseWidgetRetractGadgetReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return UseWidgetRetractGadgetReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final UseWidgetRetractGadgetReq prototype) {
            return UseWidgetRetractGadgetReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == UseWidgetRetractGadgetReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static UseWidgetRetractGadgetReq getDefaultInstance() {
            return UseWidgetRetractGadgetReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<UseWidgetRetractGadgetReq> parser() {
            return UseWidgetRetractGadgetReq.PARSER;
        }
        
        @Override
        public Parser<UseWidgetRetractGadgetReq> getParserForType() {
            return UseWidgetRetractGadgetReq.PARSER;
        }
        
        @Override
        public UseWidgetRetractGadgetReq getDefaultInstanceForType() {
            return UseWidgetRetractGadgetReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new UseWidgetRetractGadgetReq();
            PARSER = new AbstractParser<UseWidgetRetractGadgetReq>() {
                @Override
                public UseWidgetRetractGadgetReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new UseWidgetRetractGadgetReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UseWidgetRetractGadgetReqOrBuilder
        {
            private int entityId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return UseWidgetRetractGadgetReqOuterClass.internal_static_UseWidgetRetractGadgetReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return UseWidgetRetractGadgetReqOuterClass.internal_static_UseWidgetRetractGadgetReq_fieldAccessorTable.ensureFieldAccessorsInitialized(UseWidgetRetractGadgetReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (UseWidgetRetractGadgetReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.entityId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return UseWidgetRetractGadgetReqOuterClass.internal_static_UseWidgetRetractGadgetReq_descriptor;
            }
            
            @Override
            public UseWidgetRetractGadgetReq getDefaultInstanceForType() {
                return UseWidgetRetractGadgetReq.getDefaultInstance();
            }
            
            @Override
            public UseWidgetRetractGadgetReq build() {
                final UseWidgetRetractGadgetReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public UseWidgetRetractGadgetReq buildPartial() {
                final UseWidgetRetractGadgetReq result = new UseWidgetRetractGadgetReq(this);
                result.entityId_ = this.entityId_;
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
                if (other instanceof UseWidgetRetractGadgetReq) {
                    return this.mergeFrom((UseWidgetRetractGadgetReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final UseWidgetRetractGadgetReq other) {
                if (other == UseWidgetRetractGadgetReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
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
                UseWidgetRetractGadgetReq parsedMessage = null;
                try {
                    parsedMessage = UseWidgetRetractGadgetReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (UseWidgetRetractGadgetReq)e.getUnfinishedMessage();
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
            public int getEntityId() {
                return this.entityId_;
            }
            
            public Builder setEntityId(final int value) {
                this.entityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEntityId() {
                this.entityId_ = 0;
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
    
    public interface UseWidgetRetractGadgetReqOrBuilder extends MessageOrBuilder
    {
        int getEntityId();
    }
}
