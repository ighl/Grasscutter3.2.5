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

public final class EnterWorldAreaReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_EnterWorldAreaReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EnterWorldAreaReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private EnterWorldAreaReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return EnterWorldAreaReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017EnterWorldAreaReq.proto\"7\n\u0011EnterWorldAreaReq\u0012\u0011\n\tarea_type\u0018\b \u0001(\r\u0012\u000f\n\u0007area_id\u0018\u0001 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        EnterWorldAreaReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_EnterWorldAreaReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_EnterWorldAreaReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(EnterWorldAreaReqOuterClass.internal_static_EnterWorldAreaReq_descriptor, new String[] { "AreaType", "AreaId" });
    }
    
    public static final class EnterWorldAreaReq extends GeneratedMessageV3 implements EnterWorldAreaReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int AREA_TYPE_FIELD_NUMBER = 8;
        private int areaType_;
        public static final int AREA_ID_FIELD_NUMBER = 1;
        private int areaId_;
        private byte memoizedIsInitialized;
        private static final EnterWorldAreaReq DEFAULT_INSTANCE;
        private static final Parser<EnterWorldAreaReq> PARSER;
        
        private EnterWorldAreaReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private EnterWorldAreaReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new EnterWorldAreaReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private EnterWorldAreaReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 8: {
                            this.areaId_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.areaType_ = input.readUInt32();
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
            return EnterWorldAreaReqOuterClass.internal_static_EnterWorldAreaReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return EnterWorldAreaReqOuterClass.internal_static_EnterWorldAreaReq_fieldAccessorTable.ensureFieldAccessorsInitialized(EnterWorldAreaReq.class, Builder.class);
        }
        
        @Override
        public int getAreaType() {
            return this.areaType_;
        }
        
        @Override
        public int getAreaId() {
            return this.areaId_;
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
            if (this.areaId_ != 0) {
                output.writeUInt32(1, this.areaId_);
            }
            if (this.areaType_ != 0) {
                output.writeUInt32(8, this.areaType_);
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
            if (this.areaId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.areaId_);
            }
            if (this.areaType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.areaType_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EnterWorldAreaReq)) {
                return super.equals(obj);
            }
            final EnterWorldAreaReq other = (EnterWorldAreaReq)obj;
            return this.getAreaType() == other.getAreaType() && this.getAreaId() == other.getAreaId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getAreaType();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getAreaId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static EnterWorldAreaReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return EnterWorldAreaReq.PARSER.parseFrom(data);
        }
        
        public static EnterWorldAreaReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EnterWorldAreaReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EnterWorldAreaReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return EnterWorldAreaReq.PARSER.parseFrom(data);
        }
        
        public static EnterWorldAreaReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EnterWorldAreaReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EnterWorldAreaReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return EnterWorldAreaReq.PARSER.parseFrom(data);
        }
        
        public static EnterWorldAreaReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EnterWorldAreaReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EnterWorldAreaReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EnterWorldAreaReq.PARSER, input);
        }
        
        public static EnterWorldAreaReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EnterWorldAreaReq.PARSER, input, extensionRegistry);
        }
        
        public static EnterWorldAreaReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EnterWorldAreaReq.PARSER, input);
        }
        
        public static EnterWorldAreaReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EnterWorldAreaReq.PARSER, input, extensionRegistry);
        }
        
        public static EnterWorldAreaReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EnterWorldAreaReq.PARSER, input);
        }
        
        public static EnterWorldAreaReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EnterWorldAreaReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return EnterWorldAreaReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final EnterWorldAreaReq prototype) {
            return EnterWorldAreaReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == EnterWorldAreaReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static EnterWorldAreaReq getDefaultInstance() {
            return EnterWorldAreaReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<EnterWorldAreaReq> parser() {
            return EnterWorldAreaReq.PARSER;
        }
        
        @Override
        public Parser<EnterWorldAreaReq> getParserForType() {
            return EnterWorldAreaReq.PARSER;
        }
        
        @Override
        public EnterWorldAreaReq getDefaultInstanceForType() {
            return EnterWorldAreaReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new EnterWorldAreaReq();
            PARSER = new AbstractParser<EnterWorldAreaReq>() {
                @Override
                public EnterWorldAreaReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new EnterWorldAreaReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EnterWorldAreaReqOrBuilder
        {
            private int areaType_;
            private int areaId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return EnterWorldAreaReqOuterClass.internal_static_EnterWorldAreaReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return EnterWorldAreaReqOuterClass.internal_static_EnterWorldAreaReq_fieldAccessorTable.ensureFieldAccessorsInitialized(EnterWorldAreaReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (EnterWorldAreaReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.areaType_ = 0;
                this.areaId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return EnterWorldAreaReqOuterClass.internal_static_EnterWorldAreaReq_descriptor;
            }
            
            @Override
            public EnterWorldAreaReq getDefaultInstanceForType() {
                return EnterWorldAreaReq.getDefaultInstance();
            }
            
            @Override
            public EnterWorldAreaReq build() {
                final EnterWorldAreaReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public EnterWorldAreaReq buildPartial() {
                final EnterWorldAreaReq result = new EnterWorldAreaReq(this);
                result.areaType_ = this.areaType_;
                result.areaId_ = this.areaId_;
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
                if (other instanceof EnterWorldAreaReq) {
                    return this.mergeFrom((EnterWorldAreaReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final EnterWorldAreaReq other) {
                if (other == EnterWorldAreaReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getAreaType() != 0) {
                    this.setAreaType(other.getAreaType());
                }
                if (other.getAreaId() != 0) {
                    this.setAreaId(other.getAreaId());
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
                EnterWorldAreaReq parsedMessage = null;
                try {
                    parsedMessage = EnterWorldAreaReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (EnterWorldAreaReq)e.getUnfinishedMessage();
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
            public int getAreaType() {
                return this.areaType_;
            }
            
            public Builder setAreaType(final int value) {
                this.areaType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAreaType() {
                this.areaType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getAreaId() {
                return this.areaId_;
            }
            
            public Builder setAreaId(final int value) {
                this.areaId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAreaId() {
                this.areaId_ = 0;
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
    
    public interface EnterWorldAreaReqOrBuilder extends MessageOrBuilder
    {
        int getAreaType();
        
        int getAreaId();
    }
}
