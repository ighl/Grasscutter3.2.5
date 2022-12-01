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

public final class ClientCollectorDataOuterClass
{
    private static final Descriptors.Descriptor internal_static_ClientCollectorData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ClientCollectorData_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ClientCollectorDataOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ClientCollectorDataOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019ClientCollectorData.proto\"S\n\u0013ClientCollectorData\u0012\u0013\n\u000bmaterial_id\u0018\n \u0001(\r\u0012\u0012\n\nmax_points\u0018\b \u0001(\r\u0012\u0013\n\u000bcurr_points\u0018\r \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ClientCollectorDataOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ClientCollectorData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ClientCollectorData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ClientCollectorDataOuterClass.internal_static_ClientCollectorData_descriptor, new String[] { "MaterialId", "MaxPoints", "CurrPoints" });
    }
    
    public static final class ClientCollectorData extends GeneratedMessageV3 implements ClientCollectorDataOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int MATERIAL_ID_FIELD_NUMBER = 10;
        private int materialId_;
        public static final int MAX_POINTS_FIELD_NUMBER = 8;
        private int maxPoints_;
        public static final int CURR_POINTS_FIELD_NUMBER = 13;
        private int currPoints_;
        private byte memoizedIsInitialized;
        private static final ClientCollectorData DEFAULT_INSTANCE;
        private static final Parser<ClientCollectorData> PARSER;
        
        private ClientCollectorData(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ClientCollectorData() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ClientCollectorData();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ClientCollectorData(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 64: {
                            this.maxPoints_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
                            this.materialId_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.currPoints_ = input.readUInt32();
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
            return ClientCollectorDataOuterClass.internal_static_ClientCollectorData_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ClientCollectorDataOuterClass.internal_static_ClientCollectorData_fieldAccessorTable.ensureFieldAccessorsInitialized(ClientCollectorData.class, Builder.class);
        }
        
        @Override
        public int getMaterialId() {
            return this.materialId_;
        }
        
        @Override
        public int getMaxPoints() {
            return this.maxPoints_;
        }
        
        @Override
        public int getCurrPoints() {
            return this.currPoints_;
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
            if (this.maxPoints_ != 0) {
                output.writeUInt32(8, this.maxPoints_);
            }
            if (this.materialId_ != 0) {
                output.writeUInt32(10, this.materialId_);
            }
            if (this.currPoints_ != 0) {
                output.writeUInt32(13, this.currPoints_);
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
            if (this.maxPoints_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.maxPoints_);
            }
            if (this.materialId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.materialId_);
            }
            if (this.currPoints_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.currPoints_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ClientCollectorData)) {
                return super.equals(obj);
            }
            final ClientCollectorData other = (ClientCollectorData)obj;
            return this.getMaterialId() == other.getMaterialId() && this.getMaxPoints() == other.getMaxPoints() && this.getCurrPoints() == other.getCurrPoints() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getMaterialId();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getMaxPoints();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getCurrPoints();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ClientCollectorData parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ClientCollectorData.PARSER.parseFrom(data);
        }
        
        public static ClientCollectorData parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ClientCollectorData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ClientCollectorData parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ClientCollectorData.PARSER.parseFrom(data);
        }
        
        public static ClientCollectorData parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ClientCollectorData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ClientCollectorData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ClientCollectorData.PARSER.parseFrom(data);
        }
        
        public static ClientCollectorData parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ClientCollectorData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ClientCollectorData parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ClientCollectorData.PARSER, input);
        }
        
        public static ClientCollectorData parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ClientCollectorData.PARSER, input, extensionRegistry);
        }
        
        public static ClientCollectorData parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ClientCollectorData.PARSER, input);
        }
        
        public static ClientCollectorData parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ClientCollectorData.PARSER, input, extensionRegistry);
        }
        
        public static ClientCollectorData parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ClientCollectorData.PARSER, input);
        }
        
        public static ClientCollectorData parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ClientCollectorData.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ClientCollectorData.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ClientCollectorData prototype) {
            return ClientCollectorData.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ClientCollectorData.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ClientCollectorData getDefaultInstance() {
            return ClientCollectorData.DEFAULT_INSTANCE;
        }
        
        public static Parser<ClientCollectorData> parser() {
            return ClientCollectorData.PARSER;
        }
        
        @Override
        public Parser<ClientCollectorData> getParserForType() {
            return ClientCollectorData.PARSER;
        }
        
        @Override
        public ClientCollectorData getDefaultInstanceForType() {
            return ClientCollectorData.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ClientCollectorData();
            PARSER = new AbstractParser<ClientCollectorData>() {
                @Override
                public ClientCollectorData parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ClientCollectorData(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ClientCollectorDataOrBuilder
        {
            private int materialId_;
            private int maxPoints_;
            private int currPoints_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ClientCollectorDataOuterClass.internal_static_ClientCollectorData_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ClientCollectorDataOuterClass.internal_static_ClientCollectorData_fieldAccessorTable.ensureFieldAccessorsInitialized(ClientCollectorData.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ClientCollectorData.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.materialId_ = 0;
                this.maxPoints_ = 0;
                this.currPoints_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ClientCollectorDataOuterClass.internal_static_ClientCollectorData_descriptor;
            }
            
            @Override
            public ClientCollectorData getDefaultInstanceForType() {
                return ClientCollectorData.getDefaultInstance();
            }
            
            @Override
            public ClientCollectorData build() {
                final ClientCollectorData result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ClientCollectorData buildPartial() {
                final ClientCollectorData result = new ClientCollectorData(this);
                result.materialId_ = this.materialId_;
                result.maxPoints_ = this.maxPoints_;
                result.currPoints_ = this.currPoints_;
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
                if (other instanceof ClientCollectorData) {
                    return this.mergeFrom((ClientCollectorData)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ClientCollectorData other) {
                if (other == ClientCollectorData.getDefaultInstance()) {
                    return this;
                }
                if (other.getMaterialId() != 0) {
                    this.setMaterialId(other.getMaterialId());
                }
                if (other.getMaxPoints() != 0) {
                    this.setMaxPoints(other.getMaxPoints());
                }
                if (other.getCurrPoints() != 0) {
                    this.setCurrPoints(other.getCurrPoints());
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
                ClientCollectorData parsedMessage = null;
                try {
                    parsedMessage = ClientCollectorData.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ClientCollectorData)e.getUnfinishedMessage();
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
            public int getMaxPoints() {
                return this.maxPoints_;
            }
            
            public Builder setMaxPoints(final int value) {
                this.maxPoints_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMaxPoints() {
                this.maxPoints_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCurrPoints() {
                return this.currPoints_;
            }
            
            public Builder setCurrPoints(final int value) {
                this.currPoints_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurrPoints() {
                this.currPoints_ = 0;
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
    
    public interface ClientCollectorDataOrBuilder extends MessageOrBuilder
    {
        int getMaterialId();
        
        int getMaxPoints();
        
        int getCurrPoints();
    }
}
