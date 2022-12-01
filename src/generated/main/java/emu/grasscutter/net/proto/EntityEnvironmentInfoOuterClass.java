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

public final class EntityEnvironmentInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_EntityEnvironmentInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EntityEnvironmentInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private EntityEnvironmentInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return EntityEnvironmentInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bEntityEnvironmentInfo.proto\"K\n\u0015EntityEnvironmentInfo\u0012\u0019\n\u0011json_climate_type\u0018\u0001 \u0001(\r\u0012\u0017\n\u000fclimate_area_id\u0018\u0002 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        EntityEnvironmentInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_EntityEnvironmentInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_EntityEnvironmentInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(EntityEnvironmentInfoOuterClass.internal_static_EntityEnvironmentInfo_descriptor, new String[] { "JsonClimateType", "ClimateAreaId" });
    }
    
    public static final class EntityEnvironmentInfo extends GeneratedMessageV3 implements EntityEnvironmentInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int JSON_CLIMATE_TYPE_FIELD_NUMBER = 1;
        private int jsonClimateType_;
        public static final int CLIMATE_AREA_ID_FIELD_NUMBER = 2;
        private int climateAreaId_;
        private byte memoizedIsInitialized;
        private static final EntityEnvironmentInfo DEFAULT_INSTANCE;
        private static final Parser<EntityEnvironmentInfo> PARSER;
        
        private EntityEnvironmentInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private EntityEnvironmentInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new EntityEnvironmentInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private EntityEnvironmentInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.jsonClimateType_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.climateAreaId_ = input.readUInt32();
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
            return EntityEnvironmentInfoOuterClass.internal_static_EntityEnvironmentInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return EntityEnvironmentInfoOuterClass.internal_static_EntityEnvironmentInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(EntityEnvironmentInfo.class, Builder.class);
        }
        
        @Override
        public int getJsonClimateType() {
            return this.jsonClimateType_;
        }
        
        @Override
        public int getClimateAreaId() {
            return this.climateAreaId_;
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
            if (this.jsonClimateType_ != 0) {
                output.writeUInt32(1, this.jsonClimateType_);
            }
            if (this.climateAreaId_ != 0) {
                output.writeUInt32(2, this.climateAreaId_);
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
            if (this.jsonClimateType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.jsonClimateType_);
            }
            if (this.climateAreaId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.climateAreaId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EntityEnvironmentInfo)) {
                return super.equals(obj);
            }
            final EntityEnvironmentInfo other = (EntityEnvironmentInfo)obj;
            return this.getJsonClimateType() == other.getJsonClimateType() && this.getClimateAreaId() == other.getClimateAreaId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getJsonClimateType();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getClimateAreaId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static EntityEnvironmentInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return EntityEnvironmentInfo.PARSER.parseFrom(data);
        }
        
        public static EntityEnvironmentInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EntityEnvironmentInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EntityEnvironmentInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return EntityEnvironmentInfo.PARSER.parseFrom(data);
        }
        
        public static EntityEnvironmentInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EntityEnvironmentInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EntityEnvironmentInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return EntityEnvironmentInfo.PARSER.parseFrom(data);
        }
        
        public static EntityEnvironmentInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EntityEnvironmentInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EntityEnvironmentInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityEnvironmentInfo.PARSER, input);
        }
        
        public static EntityEnvironmentInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityEnvironmentInfo.PARSER, input, extensionRegistry);
        }
        
        public static EntityEnvironmentInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EntityEnvironmentInfo.PARSER, input);
        }
        
        public static EntityEnvironmentInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EntityEnvironmentInfo.PARSER, input, extensionRegistry);
        }
        
        public static EntityEnvironmentInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityEnvironmentInfo.PARSER, input);
        }
        
        public static EntityEnvironmentInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityEnvironmentInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return EntityEnvironmentInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final EntityEnvironmentInfo prototype) {
            return EntityEnvironmentInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == EntityEnvironmentInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static EntityEnvironmentInfo getDefaultInstance() {
            return EntityEnvironmentInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<EntityEnvironmentInfo> parser() {
            return EntityEnvironmentInfo.PARSER;
        }
        
        @Override
        public Parser<EntityEnvironmentInfo> getParserForType() {
            return EntityEnvironmentInfo.PARSER;
        }
        
        @Override
        public EntityEnvironmentInfo getDefaultInstanceForType() {
            return EntityEnvironmentInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new EntityEnvironmentInfo();
            PARSER = new AbstractParser<EntityEnvironmentInfo>() {
                @Override
                public EntityEnvironmentInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new EntityEnvironmentInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EntityEnvironmentInfoOrBuilder
        {
            private int jsonClimateType_;
            private int climateAreaId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return EntityEnvironmentInfoOuterClass.internal_static_EntityEnvironmentInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return EntityEnvironmentInfoOuterClass.internal_static_EntityEnvironmentInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(EntityEnvironmentInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (EntityEnvironmentInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.jsonClimateType_ = 0;
                this.climateAreaId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return EntityEnvironmentInfoOuterClass.internal_static_EntityEnvironmentInfo_descriptor;
            }
            
            @Override
            public EntityEnvironmentInfo getDefaultInstanceForType() {
                return EntityEnvironmentInfo.getDefaultInstance();
            }
            
            @Override
            public EntityEnvironmentInfo build() {
                final EntityEnvironmentInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public EntityEnvironmentInfo buildPartial() {
                final EntityEnvironmentInfo result = new EntityEnvironmentInfo(this);
                result.jsonClimateType_ = this.jsonClimateType_;
                result.climateAreaId_ = this.climateAreaId_;
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
                if (other instanceof EntityEnvironmentInfo) {
                    return this.mergeFrom((EntityEnvironmentInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final EntityEnvironmentInfo other) {
                if (other == EntityEnvironmentInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getJsonClimateType() != 0) {
                    this.setJsonClimateType(other.getJsonClimateType());
                }
                if (other.getClimateAreaId() != 0) {
                    this.setClimateAreaId(other.getClimateAreaId());
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
                EntityEnvironmentInfo parsedMessage = null;
                try {
                    parsedMessage = EntityEnvironmentInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (EntityEnvironmentInfo)e.getUnfinishedMessage();
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
            public int getJsonClimateType() {
                return this.jsonClimateType_;
            }
            
            public Builder setJsonClimateType(final int value) {
                this.jsonClimateType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearJsonClimateType() {
                this.jsonClimateType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getClimateAreaId() {
                return this.climateAreaId_;
            }
            
            public Builder setClimateAreaId(final int value) {
                this.climateAreaId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearClimateAreaId() {
                this.climateAreaId_ = 0;
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
    
    public interface EntityEnvironmentInfoOrBuilder extends MessageOrBuilder
    {
        int getJsonClimateType();
        
        int getClimateAreaId();
    }
}
