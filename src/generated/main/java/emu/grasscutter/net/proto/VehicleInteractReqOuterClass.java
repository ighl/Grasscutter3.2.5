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

public final class VehicleInteractReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_VehicleInteractReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_VehicleInteractReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private VehicleInteractReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return VehicleInteractReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018VehicleInteractReq.proto\u001a\u0019VehicleInteractType.proto\"a\n\u0012VehicleInteractReq\u0012+\n\rinteract_type\u0018\b \u0001(\u000e2\u0014.VehicleInteractType\u0012\u000b\n\u0003pos\u0018\f \u0001(\r\u0012\u0011\n\tentity_id\u0018\u000f \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        VehicleInteractReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { VehicleInteractTypeOuterClass.getDescriptor() });
        internal_static_VehicleInteractReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_VehicleInteractReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(VehicleInteractReqOuterClass.internal_static_VehicleInteractReq_descriptor, new String[] { "InteractType", "Pos", "EntityId" });
        VehicleInteractTypeOuterClass.getDescriptor();
    }
    
    public static final class VehicleInteractReq extends GeneratedMessageV3 implements VehicleInteractReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int INTERACT_TYPE_FIELD_NUMBER = 8;
        private int interactType_;
        public static final int POS_FIELD_NUMBER = 12;
        private int pos_;
        public static final int ENTITY_ID_FIELD_NUMBER = 15;
        private int entityId_;
        private byte memoizedIsInitialized;
        private static final VehicleInteractReq DEFAULT_INSTANCE;
        private static final Parser<VehicleInteractReq> PARSER;
        
        private VehicleInteractReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private VehicleInteractReq() {
            this.memoizedIsInitialized = -1;
            this.interactType_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new VehicleInteractReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private VehicleInteractReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            final int rawValue = input.readEnum();
                            this.interactType_ = rawValue;
                            continue;
                        }
                        case 96: {
                            this.pos_ = input.readUInt32();
                            continue;
                        }
                        case 120: {
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
            return VehicleInteractReqOuterClass.internal_static_VehicleInteractReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return VehicleInteractReqOuterClass.internal_static_VehicleInteractReq_fieldAccessorTable.ensureFieldAccessorsInitialized(VehicleInteractReq.class, Builder.class);
        }
        
        @Override
        public int getInteractTypeValue() {
            return this.interactType_;
        }
        
        @Override
        public VehicleInteractTypeOuterClass.VehicleInteractType getInteractType() {
            final VehicleInteractTypeOuterClass.VehicleInteractType result = VehicleInteractTypeOuterClass.VehicleInteractType.valueOf(this.interactType_);
            return (result == null) ? VehicleInteractTypeOuterClass.VehicleInteractType.UNRECOGNIZED : result;
        }
        
        @Override
        public int getPos() {
            return this.pos_;
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
            if (this.interactType_ != VehicleInteractTypeOuterClass.VehicleInteractType.VEHICLE_INTERACT_TYPE_NONE.getNumber()) {
                output.writeEnum(8, this.interactType_);
            }
            if (this.pos_ != 0) {
                output.writeUInt32(12, this.pos_);
            }
            if (this.entityId_ != 0) {
                output.writeUInt32(15, this.entityId_);
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
            if (this.interactType_ != VehicleInteractTypeOuterClass.VehicleInteractType.VEHICLE_INTERACT_TYPE_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(8, this.interactType_);
            }
            if (this.pos_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.pos_);
            }
            if (this.entityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.entityId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VehicleInteractReq)) {
                return super.equals(obj);
            }
            final VehicleInteractReq other = (VehicleInteractReq)obj;
            return this.interactType_ == other.interactType_ && this.getPos() == other.getPos() && this.getEntityId() == other.getEntityId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.interactType_;
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getPos();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getEntityId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static VehicleInteractReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return VehicleInteractReq.PARSER.parseFrom(data);
        }
        
        public static VehicleInteractReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return VehicleInteractReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static VehicleInteractReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return VehicleInteractReq.PARSER.parseFrom(data);
        }
        
        public static VehicleInteractReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return VehicleInteractReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static VehicleInteractReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return VehicleInteractReq.PARSER.parseFrom(data);
        }
        
        public static VehicleInteractReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return VehicleInteractReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static VehicleInteractReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(VehicleInteractReq.PARSER, input);
        }
        
        public static VehicleInteractReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(VehicleInteractReq.PARSER, input, extensionRegistry);
        }
        
        public static VehicleInteractReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(VehicleInteractReq.PARSER, input);
        }
        
        public static VehicleInteractReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(VehicleInteractReq.PARSER, input, extensionRegistry);
        }
        
        public static VehicleInteractReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(VehicleInteractReq.PARSER, input);
        }
        
        public static VehicleInteractReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(VehicleInteractReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return VehicleInteractReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final VehicleInteractReq prototype) {
            return VehicleInteractReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == VehicleInteractReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static VehicleInteractReq getDefaultInstance() {
            return VehicleInteractReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<VehicleInteractReq> parser() {
            return VehicleInteractReq.PARSER;
        }
        
        @Override
        public Parser<VehicleInteractReq> getParserForType() {
            return VehicleInteractReq.PARSER;
        }
        
        @Override
        public VehicleInteractReq getDefaultInstanceForType() {
            return VehicleInteractReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new VehicleInteractReq();
            PARSER = new AbstractParser<VehicleInteractReq>() {
                @Override
                public VehicleInteractReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new VehicleInteractReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements VehicleInteractReqOrBuilder
        {
            private int interactType_;
            private int pos_;
            private int entityId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return VehicleInteractReqOuterClass.internal_static_VehicleInteractReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return VehicleInteractReqOuterClass.internal_static_VehicleInteractReq_fieldAccessorTable.ensureFieldAccessorsInitialized(VehicleInteractReq.class, Builder.class);
            }
            
            private Builder() {
                this.interactType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.interactType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (VehicleInteractReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.interactType_ = 0;
                this.pos_ = 0;
                this.entityId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return VehicleInteractReqOuterClass.internal_static_VehicleInteractReq_descriptor;
            }
            
            @Override
            public VehicleInteractReq getDefaultInstanceForType() {
                return VehicleInteractReq.getDefaultInstance();
            }
            
            @Override
            public VehicleInteractReq build() {
                final VehicleInteractReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public VehicleInteractReq buildPartial() {
                final VehicleInteractReq result = new VehicleInteractReq(this);
                result.interactType_ = this.interactType_;
                result.pos_ = this.pos_;
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
                if (other instanceof VehicleInteractReq) {
                    return this.mergeFrom((VehicleInteractReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final VehicleInteractReq other) {
                if (other == VehicleInteractReq.getDefaultInstance()) {
                    return this;
                }
                if (other.interactType_ != 0) {
                    this.setInteractTypeValue(other.getInteractTypeValue());
                }
                if (other.getPos() != 0) {
                    this.setPos(other.getPos());
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
                VehicleInteractReq parsedMessage = null;
                try {
                    parsedMessage = VehicleInteractReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (VehicleInteractReq)e.getUnfinishedMessage();
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
            public int getInteractTypeValue() {
                return this.interactType_;
            }
            
            public Builder setInteractTypeValue(final int value) {
                this.interactType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public VehicleInteractTypeOuterClass.VehicleInteractType getInteractType() {
                final VehicleInteractTypeOuterClass.VehicleInteractType result = VehicleInteractTypeOuterClass.VehicleInteractType.valueOf(this.interactType_);
                return (result == null) ? VehicleInteractTypeOuterClass.VehicleInteractType.UNRECOGNIZED : result;
            }
            
            public Builder setInteractType(final VehicleInteractTypeOuterClass.VehicleInteractType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.interactType_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearInteractType() {
                this.interactType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getPos() {
                return this.pos_;
            }
            
            public Builder setPos(final int value) {
                this.pos_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPos() {
                this.pos_ = 0;
                this.onChanged();
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
    
    public interface VehicleInteractReqOrBuilder extends MessageOrBuilder
    {
        int getInteractTypeValue();
        
        VehicleInteractTypeOuterClass.VehicleInteractType getInteractType();
        
        int getPos();
        
        int getEntityId();
    }
}
