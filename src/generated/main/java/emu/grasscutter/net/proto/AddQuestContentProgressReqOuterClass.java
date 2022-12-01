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

public final class AddQuestContentProgressReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_AddQuestContentProgressReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AddQuestContentProgressReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AddQuestContentProgressReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AddQuestContentProgressReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n AddQuestContentProgressReq.proto\"W\n\u001aAddQuestContentProgressReq\u0012\u0014\n\fcontent_type\u0018\u0006 \u0001(\r\u0012\r\n\u0005param\u0018\f \u0001(\r\u0012\u0014\n\fadd_progress\u0018\u000f \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AddQuestContentProgressReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AddQuestContentProgressReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AddQuestContentProgressReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AddQuestContentProgressReqOuterClass.internal_static_AddQuestContentProgressReq_descriptor, new String[] { "ContentType", "Param", "AddProgress" });
    }
    
    public static final class AddQuestContentProgressReq extends GeneratedMessageV3 implements AddQuestContentProgressReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CONTENT_TYPE_FIELD_NUMBER = 6;
        private int contentType_;
        public static final int PARAM_FIELD_NUMBER = 12;
        private int param_;
        public static final int ADD_PROGRESS_FIELD_NUMBER = 15;
        private int addProgress_;
        private byte memoizedIsInitialized;
        private static final AddQuestContentProgressReq DEFAULT_INSTANCE;
        private static final Parser<AddQuestContentProgressReq> PARSER;
        
        private AddQuestContentProgressReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AddQuestContentProgressReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AddQuestContentProgressReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AddQuestContentProgressReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 48: {
                            this.contentType_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
                            this.param_ = input.readUInt32();
                            continue;
                        }
                        case 120: {
                            this.addProgress_ = input.readUInt32();
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
            return AddQuestContentProgressReqOuterClass.internal_static_AddQuestContentProgressReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AddQuestContentProgressReqOuterClass.internal_static_AddQuestContentProgressReq_fieldAccessorTable.ensureFieldAccessorsInitialized(AddQuestContentProgressReq.class, Builder.class);
        }
        
        @Override
        public int getContentType() {
            return this.contentType_;
        }
        
        @Override
        public int getParam() {
            return this.param_;
        }
        
        @Override
        public int getAddProgress() {
            return this.addProgress_;
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
            if (this.contentType_ != 0) {
                output.writeUInt32(6, this.contentType_);
            }
            if (this.param_ != 0) {
                output.writeUInt32(12, this.param_);
            }
            if (this.addProgress_ != 0) {
                output.writeUInt32(15, this.addProgress_);
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
            if (this.contentType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.contentType_);
            }
            if (this.param_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.param_);
            }
            if (this.addProgress_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.addProgress_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AddQuestContentProgressReq)) {
                return super.equals(obj);
            }
            final AddQuestContentProgressReq other = (AddQuestContentProgressReq)obj;
            return this.getContentType() == other.getContentType() && this.getParam() == other.getParam() && this.getAddProgress() == other.getAddProgress() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getContentType();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getParam();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getAddProgress();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AddQuestContentProgressReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AddQuestContentProgressReq.PARSER.parseFrom(data);
        }
        
        public static AddQuestContentProgressReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AddQuestContentProgressReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AddQuestContentProgressReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AddQuestContentProgressReq.PARSER.parseFrom(data);
        }
        
        public static AddQuestContentProgressReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AddQuestContentProgressReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AddQuestContentProgressReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AddQuestContentProgressReq.PARSER.parseFrom(data);
        }
        
        public static AddQuestContentProgressReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AddQuestContentProgressReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AddQuestContentProgressReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AddQuestContentProgressReq.PARSER, input);
        }
        
        public static AddQuestContentProgressReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AddQuestContentProgressReq.PARSER, input, extensionRegistry);
        }
        
        public static AddQuestContentProgressReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AddQuestContentProgressReq.PARSER, input);
        }
        
        public static AddQuestContentProgressReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AddQuestContentProgressReq.PARSER, input, extensionRegistry);
        }
        
        public static AddQuestContentProgressReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AddQuestContentProgressReq.PARSER, input);
        }
        
        public static AddQuestContentProgressReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AddQuestContentProgressReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AddQuestContentProgressReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AddQuestContentProgressReq prototype) {
            return AddQuestContentProgressReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AddQuestContentProgressReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AddQuestContentProgressReq getDefaultInstance() {
            return AddQuestContentProgressReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<AddQuestContentProgressReq> parser() {
            return AddQuestContentProgressReq.PARSER;
        }
        
        @Override
        public Parser<AddQuestContentProgressReq> getParserForType() {
            return AddQuestContentProgressReq.PARSER;
        }
        
        @Override
        public AddQuestContentProgressReq getDefaultInstanceForType() {
            return AddQuestContentProgressReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AddQuestContentProgressReq();
            PARSER = new AbstractParser<AddQuestContentProgressReq>() {
                @Override
                public AddQuestContentProgressReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AddQuestContentProgressReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AddQuestContentProgressReqOrBuilder
        {
            private int contentType_;
            private int param_;
            private int addProgress_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AddQuestContentProgressReqOuterClass.internal_static_AddQuestContentProgressReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AddQuestContentProgressReqOuterClass.internal_static_AddQuestContentProgressReq_fieldAccessorTable.ensureFieldAccessorsInitialized(AddQuestContentProgressReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AddQuestContentProgressReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.contentType_ = 0;
                this.param_ = 0;
                this.addProgress_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AddQuestContentProgressReqOuterClass.internal_static_AddQuestContentProgressReq_descriptor;
            }
            
            @Override
            public AddQuestContentProgressReq getDefaultInstanceForType() {
                return AddQuestContentProgressReq.getDefaultInstance();
            }
            
            @Override
            public AddQuestContentProgressReq build() {
                final AddQuestContentProgressReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AddQuestContentProgressReq buildPartial() {
                final AddQuestContentProgressReq result = new AddQuestContentProgressReq(this);
                result.contentType_ = this.contentType_;
                result.param_ = this.param_;
                result.addProgress_ = this.addProgress_;
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
                if (other instanceof AddQuestContentProgressReq) {
                    return this.mergeFrom((AddQuestContentProgressReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AddQuestContentProgressReq other) {
                if (other == AddQuestContentProgressReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getContentType() != 0) {
                    this.setContentType(other.getContentType());
                }
                if (other.getParam() != 0) {
                    this.setParam(other.getParam());
                }
                if (other.getAddProgress() != 0) {
                    this.setAddProgress(other.getAddProgress());
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
                AddQuestContentProgressReq parsedMessage = null;
                try {
                    parsedMessage = AddQuestContentProgressReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AddQuestContentProgressReq)e.getUnfinishedMessage();
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
            public int getContentType() {
                return this.contentType_;
            }
            
            public Builder setContentType(final int value) {
                this.contentType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearContentType() {
                this.contentType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getParam() {
                return this.param_;
            }
            
            public Builder setParam(final int value) {
                this.param_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearParam() {
                this.param_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getAddProgress() {
                return this.addProgress_;
            }
            
            public Builder setAddProgress(final int value) {
                this.addProgress_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAddProgress() {
                this.addProgress_ = 0;
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
    
    public interface AddQuestContentProgressReqOrBuilder extends MessageOrBuilder
    {
        int getContentType();
        
        int getParam();
        
        int getAddProgress();
    }
}
