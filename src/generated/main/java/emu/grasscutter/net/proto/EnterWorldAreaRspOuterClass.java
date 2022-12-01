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

public final class EnterWorldAreaRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_EnterWorldAreaRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EnterWorldAreaRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private EnterWorldAreaRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return EnterWorldAreaRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017EnterWorldAreaRsp.proto\"H\n\u0011EnterWorldAreaRsp\u0012\u0011\n\tarea_type\u0018\u0001 \u0001(\r\u0012\u000f\n\u0007area_id\u0018\u0007 \u0001(\r\u0012\u000f\n\u0007retcode\u0018\t \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        EnterWorldAreaRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_EnterWorldAreaRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_EnterWorldAreaRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(EnterWorldAreaRspOuterClass.internal_static_EnterWorldAreaRsp_descriptor, new String[] { "AreaType", "AreaId", "Retcode" });
    }
    
    public static final class EnterWorldAreaRsp extends GeneratedMessageV3 implements EnterWorldAreaRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int AREA_TYPE_FIELD_NUMBER = 1;
        private int areaType_;
        public static final int AREA_ID_FIELD_NUMBER = 7;
        private int areaId_;
        public static final int RETCODE_FIELD_NUMBER = 9;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final EnterWorldAreaRsp DEFAULT_INSTANCE;
        private static final Parser<EnterWorldAreaRsp> PARSER;
        
        private EnterWorldAreaRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private EnterWorldAreaRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new EnterWorldAreaRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private EnterWorldAreaRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.areaType_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            this.areaId_ = input.readUInt32();
                            continue;
                        }
                        case 72: {
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
            return EnterWorldAreaRspOuterClass.internal_static_EnterWorldAreaRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return EnterWorldAreaRspOuterClass.internal_static_EnterWorldAreaRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(EnterWorldAreaRsp.class, Builder.class);
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
        public int getRetcode() {
            return this.retcode_;
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
            if (this.areaType_ != 0) {
                output.writeUInt32(1, this.areaType_);
            }
            if (this.areaId_ != 0) {
                output.writeUInt32(7, this.areaId_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(9, this.retcode_);
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
            if (this.areaType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.areaType_);
            }
            if (this.areaId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.areaId_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(9, this.retcode_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EnterWorldAreaRsp)) {
                return super.equals(obj);
            }
            final EnterWorldAreaRsp other = (EnterWorldAreaRsp)obj;
            return this.getAreaType() == other.getAreaType() && this.getAreaId() == other.getAreaId() && this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getAreaType();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getAreaId();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static EnterWorldAreaRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return EnterWorldAreaRsp.PARSER.parseFrom(data);
        }
        
        public static EnterWorldAreaRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EnterWorldAreaRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EnterWorldAreaRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return EnterWorldAreaRsp.PARSER.parseFrom(data);
        }
        
        public static EnterWorldAreaRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EnterWorldAreaRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EnterWorldAreaRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return EnterWorldAreaRsp.PARSER.parseFrom(data);
        }
        
        public static EnterWorldAreaRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EnterWorldAreaRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EnterWorldAreaRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EnterWorldAreaRsp.PARSER, input);
        }
        
        public static EnterWorldAreaRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EnterWorldAreaRsp.PARSER, input, extensionRegistry);
        }
        
        public static EnterWorldAreaRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EnterWorldAreaRsp.PARSER, input);
        }
        
        public static EnterWorldAreaRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EnterWorldAreaRsp.PARSER, input, extensionRegistry);
        }
        
        public static EnterWorldAreaRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EnterWorldAreaRsp.PARSER, input);
        }
        
        public static EnterWorldAreaRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EnterWorldAreaRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return EnterWorldAreaRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final EnterWorldAreaRsp prototype) {
            return EnterWorldAreaRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == EnterWorldAreaRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static EnterWorldAreaRsp getDefaultInstance() {
            return EnterWorldAreaRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<EnterWorldAreaRsp> parser() {
            return EnterWorldAreaRsp.PARSER;
        }
        
        @Override
        public Parser<EnterWorldAreaRsp> getParserForType() {
            return EnterWorldAreaRsp.PARSER;
        }
        
        @Override
        public EnterWorldAreaRsp getDefaultInstanceForType() {
            return EnterWorldAreaRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new EnterWorldAreaRsp();
            PARSER = new AbstractParser<EnterWorldAreaRsp>() {
                @Override
                public EnterWorldAreaRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new EnterWorldAreaRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EnterWorldAreaRspOrBuilder
        {
            private int areaType_;
            private int areaId_;
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return EnterWorldAreaRspOuterClass.internal_static_EnterWorldAreaRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return EnterWorldAreaRspOuterClass.internal_static_EnterWorldAreaRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(EnterWorldAreaRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (EnterWorldAreaRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.areaType_ = 0;
                this.areaId_ = 0;
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return EnterWorldAreaRspOuterClass.internal_static_EnterWorldAreaRsp_descriptor;
            }
            
            @Override
            public EnterWorldAreaRsp getDefaultInstanceForType() {
                return EnterWorldAreaRsp.getDefaultInstance();
            }
            
            @Override
            public EnterWorldAreaRsp build() {
                final EnterWorldAreaRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public EnterWorldAreaRsp buildPartial() {
                final EnterWorldAreaRsp result = new EnterWorldAreaRsp(this);
                result.areaType_ = this.areaType_;
                result.areaId_ = this.areaId_;
                result.retcode_ = this.retcode_;
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
                if (other instanceof EnterWorldAreaRsp) {
                    return this.mergeFrom((EnterWorldAreaRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final EnterWorldAreaRsp other) {
                if (other == EnterWorldAreaRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getAreaType() != 0) {
                    this.setAreaType(other.getAreaType());
                }
                if (other.getAreaId() != 0) {
                    this.setAreaId(other.getAreaId());
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
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
                EnterWorldAreaRsp parsedMessage = null;
                try {
                    parsedMessage = EnterWorldAreaRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (EnterWorldAreaRsp)e.getUnfinishedMessage();
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface EnterWorldAreaRspOrBuilder extends MessageOrBuilder
    {
        int getAreaType();
        
        int getAreaId();
        
        int getRetcode();
    }
}
