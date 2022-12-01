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

public final class AddQuestContentProgressRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_AddQuestContentProgressRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AddQuestContentProgressRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AddQuestContentProgressRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AddQuestContentProgressRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n AddQuestContentProgressRsp.proto\"C\n\u001aAddQuestContentProgressRsp\u0012\u000f\n\u0007retcode\u0018\r \u0001(\u0005\u0012\u0014\n\fcontent_type\u0018\u0004 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AddQuestContentProgressRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AddQuestContentProgressRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AddQuestContentProgressRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AddQuestContentProgressRspOuterClass.internal_static_AddQuestContentProgressRsp_descriptor, new String[] { "Retcode", "ContentType" });
    }
    
    public static final class AddQuestContentProgressRsp extends GeneratedMessageV3 implements AddQuestContentProgressRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 13;
        private int retcode_;
        public static final int CONTENT_TYPE_FIELD_NUMBER = 4;
        private int contentType_;
        private byte memoizedIsInitialized;
        private static final AddQuestContentProgressRsp DEFAULT_INSTANCE;
        private static final Parser<AddQuestContentProgressRsp> PARSER;
        
        private AddQuestContentProgressRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AddQuestContentProgressRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AddQuestContentProgressRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AddQuestContentProgressRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 32: {
                            this.contentType_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.retcode_ = input.readInt32();
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
            return AddQuestContentProgressRspOuterClass.internal_static_AddQuestContentProgressRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AddQuestContentProgressRspOuterClass.internal_static_AddQuestContentProgressRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(AddQuestContentProgressRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public int getContentType() {
            return this.contentType_;
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
                output.writeUInt32(4, this.contentType_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(13, this.retcode_);
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
                size += CodedOutputStream.computeUInt32Size(4, this.contentType_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(13, this.retcode_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AddQuestContentProgressRsp)) {
                return super.equals(obj);
            }
            final AddQuestContentProgressRsp other = (AddQuestContentProgressRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.getContentType() == other.getContentType() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getContentType();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AddQuestContentProgressRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AddQuestContentProgressRsp.PARSER.parseFrom(data);
        }
        
        public static AddQuestContentProgressRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AddQuestContentProgressRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AddQuestContentProgressRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AddQuestContentProgressRsp.PARSER.parseFrom(data);
        }
        
        public static AddQuestContentProgressRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AddQuestContentProgressRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AddQuestContentProgressRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AddQuestContentProgressRsp.PARSER.parseFrom(data);
        }
        
        public static AddQuestContentProgressRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AddQuestContentProgressRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AddQuestContentProgressRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AddQuestContentProgressRsp.PARSER, input);
        }
        
        public static AddQuestContentProgressRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AddQuestContentProgressRsp.PARSER, input, extensionRegistry);
        }
        
        public static AddQuestContentProgressRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AddQuestContentProgressRsp.PARSER, input);
        }
        
        public static AddQuestContentProgressRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AddQuestContentProgressRsp.PARSER, input, extensionRegistry);
        }
        
        public static AddQuestContentProgressRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AddQuestContentProgressRsp.PARSER, input);
        }
        
        public static AddQuestContentProgressRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AddQuestContentProgressRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AddQuestContentProgressRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AddQuestContentProgressRsp prototype) {
            return AddQuestContentProgressRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AddQuestContentProgressRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AddQuestContentProgressRsp getDefaultInstance() {
            return AddQuestContentProgressRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<AddQuestContentProgressRsp> parser() {
            return AddQuestContentProgressRsp.PARSER;
        }
        
        @Override
        public Parser<AddQuestContentProgressRsp> getParserForType() {
            return AddQuestContentProgressRsp.PARSER;
        }
        
        @Override
        public AddQuestContentProgressRsp getDefaultInstanceForType() {
            return AddQuestContentProgressRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AddQuestContentProgressRsp();
            PARSER = new AbstractParser<AddQuestContentProgressRsp>() {
                @Override
                public AddQuestContentProgressRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AddQuestContentProgressRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AddQuestContentProgressRspOrBuilder
        {
            private int retcode_;
            private int contentType_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AddQuestContentProgressRspOuterClass.internal_static_AddQuestContentProgressRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AddQuestContentProgressRspOuterClass.internal_static_AddQuestContentProgressRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(AddQuestContentProgressRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AddQuestContentProgressRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                this.contentType_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AddQuestContentProgressRspOuterClass.internal_static_AddQuestContentProgressRsp_descriptor;
            }
            
            @Override
            public AddQuestContentProgressRsp getDefaultInstanceForType() {
                return AddQuestContentProgressRsp.getDefaultInstance();
            }
            
            @Override
            public AddQuestContentProgressRsp build() {
                final AddQuestContentProgressRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AddQuestContentProgressRsp buildPartial() {
                final AddQuestContentProgressRsp result = new AddQuestContentProgressRsp(this);
                result.retcode_ = this.retcode_;
                result.contentType_ = this.contentType_;
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
                if (other instanceof AddQuestContentProgressRsp) {
                    return this.mergeFrom((AddQuestContentProgressRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AddQuestContentProgressRsp other) {
                if (other == AddQuestContentProgressRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getContentType() != 0) {
                    this.setContentType(other.getContentType());
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
                AddQuestContentProgressRsp parsedMessage = null;
                try {
                    parsedMessage = AddQuestContentProgressRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AddQuestContentProgressRsp)e.getUnfinishedMessage();
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
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
                this.onChanged();
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface AddQuestContentProgressRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        int getContentType();
    }
}
