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

public final class ForgeQueueManipulateReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_ForgeQueueManipulateReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ForgeQueueManipulateReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ForgeQueueManipulateReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ForgeQueueManipulateReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001dForgeQueueManipulateReq.proto\u001a\u001eForgeQueueManipulateType.proto\"e\n\u0017ForgeQueueManipulateReq\u0012\u0016\n\u000eforge_queue_id\u0018\u0005 \u0001(\r\u00122\n\u000fmanipulate_type\u0018\r \u0001(\u000e2\u0019.ForgeQueueManipulateTypeB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ForgeQueueManipulateReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ForgeQueueManipulateTypeOuterClass.getDescriptor() });
        internal_static_ForgeQueueManipulateReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ForgeQueueManipulateReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ForgeQueueManipulateReqOuterClass.internal_static_ForgeQueueManipulateReq_descriptor, new String[] { "ForgeQueueId", "ManipulateType" });
        ForgeQueueManipulateTypeOuterClass.getDescriptor();
    }
    
    public static final class ForgeQueueManipulateReq extends GeneratedMessageV3 implements ForgeQueueManipulateReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int FORGE_QUEUE_ID_FIELD_NUMBER = 5;
        private int forgeQueueId_;
        public static final int MANIPULATE_TYPE_FIELD_NUMBER = 13;
        private int manipulateType_;
        private byte memoizedIsInitialized;
        private static final ForgeQueueManipulateReq DEFAULT_INSTANCE;
        private static final Parser<ForgeQueueManipulateReq> PARSER;
        
        private ForgeQueueManipulateReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ForgeQueueManipulateReq() {
            this.memoizedIsInitialized = -1;
            this.manipulateType_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ForgeQueueManipulateReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ForgeQueueManipulateReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 40: {
                            this.forgeQueueId_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            final int rawValue = input.readEnum();
                            this.manipulateType_ = rawValue;
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
            return ForgeQueueManipulateReqOuterClass.internal_static_ForgeQueueManipulateReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ForgeQueueManipulateReqOuterClass.internal_static_ForgeQueueManipulateReq_fieldAccessorTable.ensureFieldAccessorsInitialized(ForgeQueueManipulateReq.class, Builder.class);
        }
        
        @Override
        public int getForgeQueueId() {
            return this.forgeQueueId_;
        }
        
        @Override
        public int getManipulateTypeValue() {
            return this.manipulateType_;
        }
        
        @Override
        public ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType getManipulateType() {
            final ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType result = ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType.valueOf(this.manipulateType_);
            return (result == null) ? ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType.UNRECOGNIZED : result;
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
            if (this.forgeQueueId_ != 0) {
                output.writeUInt32(5, this.forgeQueueId_);
            }
            if (this.manipulateType_ != ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType.FORGE_QUEUE_MANIPULATE_TYPE_RECEIVE_OUTPUT.getNumber()) {
                output.writeEnum(13, this.manipulateType_);
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
            if (this.forgeQueueId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.forgeQueueId_);
            }
            if (this.manipulateType_ != ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType.FORGE_QUEUE_MANIPULATE_TYPE_RECEIVE_OUTPUT.getNumber()) {
                size += CodedOutputStream.computeEnumSize(13, this.manipulateType_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ForgeQueueManipulateReq)) {
                return super.equals(obj);
            }
            final ForgeQueueManipulateReq other = (ForgeQueueManipulateReq)obj;
            return this.getForgeQueueId() == other.getForgeQueueId() && this.manipulateType_ == other.manipulateType_ && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getForgeQueueId();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.manipulateType_;
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ForgeQueueManipulateReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ForgeQueueManipulateReq.PARSER.parseFrom(data);
        }
        
        public static ForgeQueueManipulateReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ForgeQueueManipulateReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ForgeQueueManipulateReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ForgeQueueManipulateReq.PARSER.parseFrom(data);
        }
        
        public static ForgeQueueManipulateReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ForgeQueueManipulateReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ForgeQueueManipulateReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ForgeQueueManipulateReq.PARSER.parseFrom(data);
        }
        
        public static ForgeQueueManipulateReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ForgeQueueManipulateReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ForgeQueueManipulateReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ForgeQueueManipulateReq.PARSER, input);
        }
        
        public static ForgeQueueManipulateReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ForgeQueueManipulateReq.PARSER, input, extensionRegistry);
        }
        
        public static ForgeQueueManipulateReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ForgeQueueManipulateReq.PARSER, input);
        }
        
        public static ForgeQueueManipulateReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ForgeQueueManipulateReq.PARSER, input, extensionRegistry);
        }
        
        public static ForgeQueueManipulateReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ForgeQueueManipulateReq.PARSER, input);
        }
        
        public static ForgeQueueManipulateReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ForgeQueueManipulateReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ForgeQueueManipulateReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ForgeQueueManipulateReq prototype) {
            return ForgeQueueManipulateReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ForgeQueueManipulateReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ForgeQueueManipulateReq getDefaultInstance() {
            return ForgeQueueManipulateReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<ForgeQueueManipulateReq> parser() {
            return ForgeQueueManipulateReq.PARSER;
        }
        
        @Override
        public Parser<ForgeQueueManipulateReq> getParserForType() {
            return ForgeQueueManipulateReq.PARSER;
        }
        
        @Override
        public ForgeQueueManipulateReq getDefaultInstanceForType() {
            return ForgeQueueManipulateReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ForgeQueueManipulateReq();
            PARSER = new AbstractParser<ForgeQueueManipulateReq>() {
                @Override
                public ForgeQueueManipulateReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ForgeQueueManipulateReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ForgeQueueManipulateReqOrBuilder
        {
            private int forgeQueueId_;
            private int manipulateType_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ForgeQueueManipulateReqOuterClass.internal_static_ForgeQueueManipulateReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ForgeQueueManipulateReqOuterClass.internal_static_ForgeQueueManipulateReq_fieldAccessorTable.ensureFieldAccessorsInitialized(ForgeQueueManipulateReq.class, Builder.class);
            }
            
            private Builder() {
                this.manipulateType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.manipulateType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ForgeQueueManipulateReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.forgeQueueId_ = 0;
                this.manipulateType_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ForgeQueueManipulateReqOuterClass.internal_static_ForgeQueueManipulateReq_descriptor;
            }
            
            @Override
            public ForgeQueueManipulateReq getDefaultInstanceForType() {
                return ForgeQueueManipulateReq.getDefaultInstance();
            }
            
            @Override
            public ForgeQueueManipulateReq build() {
                final ForgeQueueManipulateReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ForgeQueueManipulateReq buildPartial() {
                final ForgeQueueManipulateReq result = new ForgeQueueManipulateReq(this);
                result.forgeQueueId_ = this.forgeQueueId_;
                result.manipulateType_ = this.manipulateType_;
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
                if (other instanceof ForgeQueueManipulateReq) {
                    return this.mergeFrom((ForgeQueueManipulateReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ForgeQueueManipulateReq other) {
                if (other == ForgeQueueManipulateReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getForgeQueueId() != 0) {
                    this.setForgeQueueId(other.getForgeQueueId());
                }
                if (other.manipulateType_ != 0) {
                    this.setManipulateTypeValue(other.getManipulateTypeValue());
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
                ForgeQueueManipulateReq parsedMessage = null;
                try {
                    parsedMessage = ForgeQueueManipulateReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ForgeQueueManipulateReq)e.getUnfinishedMessage();
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
            public int getForgeQueueId() {
                return this.forgeQueueId_;
            }
            
            public Builder setForgeQueueId(final int value) {
                this.forgeQueueId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearForgeQueueId() {
                this.forgeQueueId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getManipulateTypeValue() {
                return this.manipulateType_;
            }
            
            public Builder setManipulateTypeValue(final int value) {
                this.manipulateType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType getManipulateType() {
                final ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType result = ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType.valueOf(this.manipulateType_);
                return (result == null) ? ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType.UNRECOGNIZED : result;
            }
            
            public Builder setManipulateType(final ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.manipulateType_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearManipulateType() {
                this.manipulateType_ = 0;
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
    
    public interface ForgeQueueManipulateReqOrBuilder extends MessageOrBuilder
    {
        int getForgeQueueId();
        
        int getManipulateTypeValue();
        
        ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType getManipulateType();
    }
}
