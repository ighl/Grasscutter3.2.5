// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
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

public final class CreateVehicleReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_CreateVehicleReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CreateVehicleReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CreateVehicleReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CreateVehicleReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016CreateVehicleReq.proto\u001a\fVector.proto\"j\n\u0010CreateVehicleReq\u0012\u0014\n\u0003pos\u0018\u000b \u0001(\u000b2\u0007.Vector\u0012\u0012\n\nvehicle_id\u0018\u0002 \u0001(\r\u0012\u0016\n\u000escene_point_id\u0018\u0007 \u0001(\r\u0012\u0014\n\u0003rot\u0018\u0005 \u0001(\u000b2\u0007.VectorB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CreateVehicleReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { VectorOuterClass.getDescriptor() });
        internal_static_CreateVehicleReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CreateVehicleReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CreateVehicleReqOuterClass.internal_static_CreateVehicleReq_descriptor, new String[] { "Pos", "VehicleId", "ScenePointId", "Rot" });
        VectorOuterClass.getDescriptor();
    }
    
    public static final class CreateVehicleReq extends GeneratedMessageV3 implements CreateVehicleReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int POS_FIELD_NUMBER = 11;
        private VectorOuterClass.Vector pos_;
        public static final int VEHICLE_ID_FIELD_NUMBER = 2;
        private int vehicleId_;
        public static final int SCENE_POINT_ID_FIELD_NUMBER = 7;
        private int scenePointId_;
        public static final int ROT_FIELD_NUMBER = 5;
        private VectorOuterClass.Vector rot_;
        private byte memoizedIsInitialized;
        private static final CreateVehicleReq DEFAULT_INSTANCE;
        private static final Parser<CreateVehicleReq> PARSER;
        
        private CreateVehicleReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private CreateVehicleReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CreateVehicleReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CreateVehicleReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 16: {
                            this.vehicleId_ = input.readUInt32();
                            continue;
                        }
                        case 42: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.rot_ != null) {
                                subBuilder = this.rot_.toBuilder();
                            }
                            this.rot_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.rot_);
                                this.rot_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 56: {
                            this.scenePointId_ = input.readUInt32();
                            continue;
                        }
                        case 90: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.pos_ != null) {
                                subBuilder = this.pos_.toBuilder();
                            }
                            this.pos_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.pos_);
                                this.pos_ = subBuilder.buildPartial();
                                continue;
                            }
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
            return CreateVehicleReqOuterClass.internal_static_CreateVehicleReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CreateVehicleReqOuterClass.internal_static_CreateVehicleReq_fieldAccessorTable.ensureFieldAccessorsInitialized(CreateVehicleReq.class, Builder.class);
        }
        
        @Override
        public boolean hasPos() {
            return this.pos_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getPos() {
            return (this.pos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.pos_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
            return this.getPos();
        }
        
        @Override
        public int getVehicleId() {
            return this.vehicleId_;
        }
        
        @Override
        public int getScenePointId() {
            return this.scenePointId_;
        }
        
        @Override
        public boolean hasRot() {
            return this.rot_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getRot() {
            return (this.rot_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.rot_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
            return this.getRot();
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
            if (this.vehicleId_ != 0) {
                output.writeUInt32(2, this.vehicleId_);
            }
            if (this.rot_ != null) {
                output.writeMessage(5, this.getRot());
            }
            if (this.scenePointId_ != 0) {
                output.writeUInt32(7, this.scenePointId_);
            }
            if (this.pos_ != null) {
                output.writeMessage(11, this.getPos());
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
            if (this.vehicleId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.vehicleId_);
            }
            if (this.rot_ != null) {
                size += CodedOutputStream.computeMessageSize(5, this.getRot());
            }
            if (this.scenePointId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.scenePointId_);
            }
            if (this.pos_ != null) {
                size += CodedOutputStream.computeMessageSize(11, this.getPos());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CreateVehicleReq)) {
                return super.equals(obj);
            }
            final CreateVehicleReq other = (CreateVehicleReq)obj;
            return this.hasPos() == other.hasPos() && (!this.hasPos() || this.getPos().equals(other.getPos())) && this.getVehicleId() == other.getVehicleId() && this.getScenePointId() == other.getScenePointId() && this.hasRot() == other.hasRot() && (!this.hasRot() || this.getRot().equals(other.getRot())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPos()) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.getPos().hashCode();
            }
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getVehicleId();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getScenePointId();
            if (this.hasRot()) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getRot().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CreateVehicleReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CreateVehicleReq.PARSER.parseFrom(data);
        }
        
        public static CreateVehicleReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CreateVehicleReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CreateVehicleReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CreateVehicleReq.PARSER.parseFrom(data);
        }
        
        public static CreateVehicleReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CreateVehicleReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CreateVehicleReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CreateVehicleReq.PARSER.parseFrom(data);
        }
        
        public static CreateVehicleReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CreateVehicleReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CreateVehicleReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CreateVehicleReq.PARSER, input);
        }
        
        public static CreateVehicleReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CreateVehicleReq.PARSER, input, extensionRegistry);
        }
        
        public static CreateVehicleReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CreateVehicleReq.PARSER, input);
        }
        
        public static CreateVehicleReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CreateVehicleReq.PARSER, input, extensionRegistry);
        }
        
        public static CreateVehicleReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CreateVehicleReq.PARSER, input);
        }
        
        public static CreateVehicleReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CreateVehicleReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CreateVehicleReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CreateVehicleReq prototype) {
            return CreateVehicleReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CreateVehicleReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CreateVehicleReq getDefaultInstance() {
            return CreateVehicleReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<CreateVehicleReq> parser() {
            return CreateVehicleReq.PARSER;
        }
        
        @Override
        public Parser<CreateVehicleReq> getParserForType() {
            return CreateVehicleReq.PARSER;
        }
        
        @Override
        public CreateVehicleReq getDefaultInstanceForType() {
            return CreateVehicleReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CreateVehicleReq();
            PARSER = new AbstractParser<CreateVehicleReq>() {
                @Override
                public CreateVehicleReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CreateVehicleReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CreateVehicleReqOrBuilder
        {
            private VectorOuterClass.Vector pos_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> posBuilder_;
            private int vehicleId_;
            private int scenePointId_;
            private VectorOuterClass.Vector rot_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> rotBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CreateVehicleReqOuterClass.internal_static_CreateVehicleReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CreateVehicleReqOuterClass.internal_static_CreateVehicleReq_fieldAccessorTable.ensureFieldAccessorsInitialized(CreateVehicleReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (CreateVehicleReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.posBuilder_ == null) {
                    this.pos_ = null;
                }
                else {
                    this.pos_ = null;
                    this.posBuilder_ = null;
                }
                this.vehicleId_ = 0;
                this.scenePointId_ = 0;
                if (this.rotBuilder_ == null) {
                    this.rot_ = null;
                }
                else {
                    this.rot_ = null;
                    this.rotBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CreateVehicleReqOuterClass.internal_static_CreateVehicleReq_descriptor;
            }
            
            @Override
            public CreateVehicleReq getDefaultInstanceForType() {
                return CreateVehicleReq.getDefaultInstance();
            }
            
            @Override
            public CreateVehicleReq build() {
                final CreateVehicleReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CreateVehicleReq buildPartial() {
                final CreateVehicleReq result = new CreateVehicleReq(this);
                if (this.posBuilder_ == null) {
                    result.pos_ = this.pos_;
                }
                else {
                    result.pos_ = this.posBuilder_.build();
                }
                result.vehicleId_ = this.vehicleId_;
                result.scenePointId_ = this.scenePointId_;
                if (this.rotBuilder_ == null) {
                    result.rot_ = this.rot_;
                }
                else {
                    result.rot_ = this.rotBuilder_.build();
                }
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
                if (other instanceof CreateVehicleReq) {
                    return this.mergeFrom((CreateVehicleReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CreateVehicleReq other) {
                if (other == CreateVehicleReq.getDefaultInstance()) {
                    return this;
                }
                if (other.hasPos()) {
                    this.mergePos(other.getPos());
                }
                if (other.getVehicleId() != 0) {
                    this.setVehicleId(other.getVehicleId());
                }
                if (other.getScenePointId() != 0) {
                    this.setScenePointId(other.getScenePointId());
                }
                if (other.hasRot()) {
                    this.mergeRot(other.getRot());
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
                CreateVehicleReq parsedMessage = null;
                try {
                    parsedMessage = CreateVehicleReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CreateVehicleReq)e.getUnfinishedMessage();
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
            public boolean hasPos() {
                return this.posBuilder_ != null || this.pos_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getPos() {
                if (this.posBuilder_ == null) {
                    return (this.pos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.pos_;
                }
                return this.posBuilder_.getMessage();
            }
            
            public Builder setPos(final VectorOuterClass.Vector value) {
                if (this.posBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.pos_ = value;
                    this.onChanged();
                }
                else {
                    this.posBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setPos(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.posBuilder_ == null) {
                    this.pos_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.posBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergePos(final VectorOuterClass.Vector value) {
                if (this.posBuilder_ == null) {
                    if (this.pos_ != null) {
                        this.pos_ = VectorOuterClass.Vector.newBuilder(this.pos_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.pos_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.posBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearPos() {
                if (this.posBuilder_ == null) {
                    this.pos_ = null;
                    this.onChanged();
                }
                else {
                    this.pos_ = null;
                    this.posBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getPosBuilder() {
                this.onChanged();
                return this.getPosFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
                if (this.posBuilder_ != null) {
                    return this.posBuilder_.getMessageOrBuilder();
                }
                return (this.pos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.pos_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getPosFieldBuilder() {
                if (this.posBuilder_ == null) {
                    this.posBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getPos(), this.getParentForChildren(), this.isClean());
                    this.pos_ = null;
                }
                return this.posBuilder_;
            }
            
            @Override
            public int getVehicleId() {
                return this.vehicleId_;
            }
            
            public Builder setVehicleId(final int value) {
                this.vehicleId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearVehicleId() {
                this.vehicleId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getScenePointId() {
                return this.scenePointId_;
            }
            
            public Builder setScenePointId(final int value) {
                this.scenePointId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearScenePointId() {
                this.scenePointId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasRot() {
                return this.rotBuilder_ != null || this.rot_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getRot() {
                if (this.rotBuilder_ == null) {
                    return (this.rot_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.rot_;
                }
                return this.rotBuilder_.getMessage();
            }
            
            public Builder setRot(final VectorOuterClass.Vector value) {
                if (this.rotBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.rot_ = value;
                    this.onChanged();
                }
                else {
                    this.rotBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setRot(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.rotBuilder_ == null) {
                    this.rot_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.rotBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeRot(final VectorOuterClass.Vector value) {
                if (this.rotBuilder_ == null) {
                    if (this.rot_ != null) {
                        this.rot_ = VectorOuterClass.Vector.newBuilder(this.rot_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.rot_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.rotBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearRot() {
                if (this.rotBuilder_ == null) {
                    this.rot_ = null;
                    this.onChanged();
                }
                else {
                    this.rot_ = null;
                    this.rotBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getRotBuilder() {
                this.onChanged();
                return this.getRotFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
                if (this.rotBuilder_ != null) {
                    return this.rotBuilder_.getMessageOrBuilder();
                }
                return (this.rot_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.rot_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getRotFieldBuilder() {
                if (this.rotBuilder_ == null) {
                    this.rotBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getRot(), this.getParentForChildren(), this.isClean());
                    this.rot_ = null;
                }
                return this.rotBuilder_;
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
    
    public interface CreateVehicleReqOrBuilder extends MessageOrBuilder
    {
        boolean hasPos();
        
        VectorOuterClass.Vector getPos();
        
        VectorOuterClass.VectorOrBuilder getPosOrBuilder();
        
        int getVehicleId();
        
        int getScenePointId();
        
        boolean hasRot();
        
        VectorOuterClass.Vector getRot();
        
        VectorOuterClass.VectorOrBuilder getRotOrBuilder();
    }
}
