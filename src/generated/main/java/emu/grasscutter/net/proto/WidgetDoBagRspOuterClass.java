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

public final class WidgetDoBagRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_WidgetDoBagRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WidgetDoBagRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WidgetDoBagRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WidgetDoBagRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0014WidgetDoBagRsp.proto\"6\n\u000eWidgetDoBagRsp\u0012\u000f\n\u0007retcode\u0018\n \u0001(\u0005\u0012\u0013\n\u000bmaterial_id\u0018\u0003 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WidgetDoBagRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_WidgetDoBagRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WidgetDoBagRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WidgetDoBagRspOuterClass.internal_static_WidgetDoBagRsp_descriptor, new String[] { "Retcode", "MaterialId" });
    }
    
    public static final class WidgetDoBagRsp extends GeneratedMessageV3 implements WidgetDoBagRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 10;
        private int retcode_;
        public static final int MATERIAL_ID_FIELD_NUMBER = 3;
        private int materialId_;
        private byte memoizedIsInitialized;
        private static final WidgetDoBagRsp DEFAULT_INSTANCE;
        private static final Parser<WidgetDoBagRsp> PARSER;
        
        private WidgetDoBagRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private WidgetDoBagRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WidgetDoBagRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WidgetDoBagRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.materialId_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
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
            return WidgetDoBagRspOuterClass.internal_static_WidgetDoBagRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WidgetDoBagRspOuterClass.internal_static_WidgetDoBagRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetDoBagRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public int getMaterialId() {
            return this.materialId_;
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
            if (this.materialId_ != 0) {
                output.writeUInt32(3, this.materialId_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(10, this.retcode_);
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
            if (this.materialId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.materialId_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(10, this.retcode_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WidgetDoBagRsp)) {
                return super.equals(obj);
            }
            final WidgetDoBagRsp other = (WidgetDoBagRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.getMaterialId() == other.getMaterialId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getMaterialId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WidgetDoBagRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WidgetDoBagRsp.PARSER.parseFrom(data);
        }
        
        public static WidgetDoBagRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetDoBagRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetDoBagRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WidgetDoBagRsp.PARSER.parseFrom(data);
        }
        
        public static WidgetDoBagRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetDoBagRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetDoBagRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WidgetDoBagRsp.PARSER.parseFrom(data);
        }
        
        public static WidgetDoBagRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetDoBagRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetDoBagRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetDoBagRsp.PARSER, input);
        }
        
        public static WidgetDoBagRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetDoBagRsp.PARSER, input, extensionRegistry);
        }
        
        public static WidgetDoBagRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetDoBagRsp.PARSER, input);
        }
        
        public static WidgetDoBagRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetDoBagRsp.PARSER, input, extensionRegistry);
        }
        
        public static WidgetDoBagRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetDoBagRsp.PARSER, input);
        }
        
        public static WidgetDoBagRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetDoBagRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WidgetDoBagRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WidgetDoBagRsp prototype) {
            return WidgetDoBagRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WidgetDoBagRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WidgetDoBagRsp getDefaultInstance() {
            return WidgetDoBagRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<WidgetDoBagRsp> parser() {
            return WidgetDoBagRsp.PARSER;
        }
        
        @Override
        public Parser<WidgetDoBagRsp> getParserForType() {
            return WidgetDoBagRsp.PARSER;
        }
        
        @Override
        public WidgetDoBagRsp getDefaultInstanceForType() {
            return WidgetDoBagRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WidgetDoBagRsp();
            PARSER = new AbstractParser<WidgetDoBagRsp>() {
                @Override
                public WidgetDoBagRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WidgetDoBagRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WidgetDoBagRspOrBuilder
        {
            private int retcode_;
            private int materialId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WidgetDoBagRspOuterClass.internal_static_WidgetDoBagRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WidgetDoBagRspOuterClass.internal_static_WidgetDoBagRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetDoBagRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (WidgetDoBagRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                this.materialId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WidgetDoBagRspOuterClass.internal_static_WidgetDoBagRsp_descriptor;
            }
            
            @Override
            public WidgetDoBagRsp getDefaultInstanceForType() {
                return WidgetDoBagRsp.getDefaultInstance();
            }
            
            @Override
            public WidgetDoBagRsp build() {
                final WidgetDoBagRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WidgetDoBagRsp buildPartial() {
                final WidgetDoBagRsp result = new WidgetDoBagRsp(this);
                result.retcode_ = this.retcode_;
                result.materialId_ = this.materialId_;
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
                if (other instanceof WidgetDoBagRsp) {
                    return this.mergeFrom((WidgetDoBagRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WidgetDoBagRsp other) {
                if (other == WidgetDoBagRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getMaterialId() != 0) {
                    this.setMaterialId(other.getMaterialId());
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
                WidgetDoBagRsp parsedMessage = null;
                try {
                    parsedMessage = WidgetDoBagRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WidgetDoBagRsp)e.getUnfinishedMessage();
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
            public int getMaterialId() {
                return this.materialId_;
            }
            
            public Builder setMaterialId(final int value) {
                this.materialId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMaterialId() {
                this.materialId_ = 0;
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
    
    public interface WidgetDoBagRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        int getMaterialId();
    }
}
