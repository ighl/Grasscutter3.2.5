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

public final class ExhibitionDisplayInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_ExhibitionDisplayInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExhibitionDisplayInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ExhibitionDisplayInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ExhibitionDisplayInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bExhibitionDisplayInfo.proto\"H\n\u0015ExhibitionDisplayInfo\u0012\n\n\u0002id\u0018\u0001 \u0001(\r\u0012\r\n\u0005param\u0018\u0002 \u0001(\r\u0012\u0014\n\fdetail_param\u0018\u0003 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ExhibitionDisplayInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ExhibitionDisplayInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ExhibitionDisplayInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ExhibitionDisplayInfoOuterClass.internal_static_ExhibitionDisplayInfo_descriptor, new String[] { "Id", "Param", "DetailParam" });
    }
    
    public static final class ExhibitionDisplayInfo extends GeneratedMessageV3 implements ExhibitionDisplayInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ID_FIELD_NUMBER = 1;
        private int id_;
        public static final int PARAM_FIELD_NUMBER = 2;
        private int param_;
        public static final int DETAIL_PARAM_FIELD_NUMBER = 3;
        private int detailParam_;
        private byte memoizedIsInitialized;
        private static final ExhibitionDisplayInfo DEFAULT_INSTANCE;
        private static final Parser<ExhibitionDisplayInfo> PARSER;
        
        private ExhibitionDisplayInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ExhibitionDisplayInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ExhibitionDisplayInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ExhibitionDisplayInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.id_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.param_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.detailParam_ = input.readUInt32();
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
            return ExhibitionDisplayInfoOuterClass.internal_static_ExhibitionDisplayInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ExhibitionDisplayInfoOuterClass.internal_static_ExhibitionDisplayInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ExhibitionDisplayInfo.class, Builder.class);
        }
        
        @Override
        public int getId() {
            return this.id_;
        }
        
        @Override
        public int getParam() {
            return this.param_;
        }
        
        @Override
        public int getDetailParam() {
            return this.detailParam_;
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
            if (this.id_ != 0) {
                output.writeUInt32(1, this.id_);
            }
            if (this.param_ != 0) {
                output.writeUInt32(2, this.param_);
            }
            if (this.detailParam_ != 0) {
                output.writeUInt32(3, this.detailParam_);
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
            if (this.id_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.id_);
            }
            if (this.param_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.param_);
            }
            if (this.detailParam_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.detailParam_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ExhibitionDisplayInfo)) {
                return super.equals(obj);
            }
            final ExhibitionDisplayInfo other = (ExhibitionDisplayInfo)obj;
            return this.getId() == other.getId() && this.getParam() == other.getParam() && this.getDetailParam() == other.getDetailParam() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getParam();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getDetailParam();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ExhibitionDisplayInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ExhibitionDisplayInfo.PARSER.parseFrom(data);
        }
        
        public static ExhibitionDisplayInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ExhibitionDisplayInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ExhibitionDisplayInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ExhibitionDisplayInfo.PARSER.parseFrom(data);
        }
        
        public static ExhibitionDisplayInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ExhibitionDisplayInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ExhibitionDisplayInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ExhibitionDisplayInfo.PARSER.parseFrom(data);
        }
        
        public static ExhibitionDisplayInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ExhibitionDisplayInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ExhibitionDisplayInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ExhibitionDisplayInfo.PARSER, input);
        }
        
        public static ExhibitionDisplayInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ExhibitionDisplayInfo.PARSER, input, extensionRegistry);
        }
        
        public static ExhibitionDisplayInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ExhibitionDisplayInfo.PARSER, input);
        }
        
        public static ExhibitionDisplayInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ExhibitionDisplayInfo.PARSER, input, extensionRegistry);
        }
        
        public static ExhibitionDisplayInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ExhibitionDisplayInfo.PARSER, input);
        }
        
        public static ExhibitionDisplayInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ExhibitionDisplayInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ExhibitionDisplayInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ExhibitionDisplayInfo prototype) {
            return ExhibitionDisplayInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ExhibitionDisplayInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ExhibitionDisplayInfo getDefaultInstance() {
            return ExhibitionDisplayInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<ExhibitionDisplayInfo> parser() {
            return ExhibitionDisplayInfo.PARSER;
        }
        
        @Override
        public Parser<ExhibitionDisplayInfo> getParserForType() {
            return ExhibitionDisplayInfo.PARSER;
        }
        
        @Override
        public ExhibitionDisplayInfo getDefaultInstanceForType() {
            return ExhibitionDisplayInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ExhibitionDisplayInfo();
            PARSER = new AbstractParser<ExhibitionDisplayInfo>() {
                @Override
                public ExhibitionDisplayInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ExhibitionDisplayInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ExhibitionDisplayInfoOrBuilder
        {
            private int id_;
            private int param_;
            private int detailParam_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ExhibitionDisplayInfoOuterClass.internal_static_ExhibitionDisplayInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ExhibitionDisplayInfoOuterClass.internal_static_ExhibitionDisplayInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ExhibitionDisplayInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ExhibitionDisplayInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.id_ = 0;
                this.param_ = 0;
                this.detailParam_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ExhibitionDisplayInfoOuterClass.internal_static_ExhibitionDisplayInfo_descriptor;
            }
            
            @Override
            public ExhibitionDisplayInfo getDefaultInstanceForType() {
                return ExhibitionDisplayInfo.getDefaultInstance();
            }
            
            @Override
            public ExhibitionDisplayInfo build() {
                final ExhibitionDisplayInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ExhibitionDisplayInfo buildPartial() {
                final ExhibitionDisplayInfo result = new ExhibitionDisplayInfo(this);
                result.id_ = this.id_;
                result.param_ = this.param_;
                result.detailParam_ = this.detailParam_;
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
                if (other instanceof ExhibitionDisplayInfo) {
                    return this.mergeFrom((ExhibitionDisplayInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ExhibitionDisplayInfo other) {
                if (other == ExhibitionDisplayInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getId() != 0) {
                    this.setId(other.getId());
                }
                if (other.getParam() != 0) {
                    this.setParam(other.getParam());
                }
                if (other.getDetailParam() != 0) {
                    this.setDetailParam(other.getDetailParam());
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
                ExhibitionDisplayInfo parsedMessage = null;
                try {
                    parsedMessage = ExhibitionDisplayInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ExhibitionDisplayInfo)e.getUnfinishedMessage();
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
            public int getId() {
                return this.id_;
            }
            
            public Builder setId(final int value) {
                this.id_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearId() {
                this.id_ = 0;
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
            public int getDetailParam() {
                return this.detailParam_;
            }
            
            public Builder setDetailParam(final int value) {
                this.detailParam_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDetailParam() {
                this.detailParam_ = 0;
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
    
    public interface ExhibitionDisplayInfoOrBuilder extends MessageOrBuilder
    {
        int getId();
        
        int getParam();
        
        int getDetailParam();
    }
}
