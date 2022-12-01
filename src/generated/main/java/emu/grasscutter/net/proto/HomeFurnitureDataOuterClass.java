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

public final class HomeFurnitureDataOuterClass
{
    private static final Descriptors.Descriptor internal_static_HomeFurnitureData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_HomeFurnitureData_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private HomeFurnitureDataOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HomeFurnitureDataOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017HomeFurnitureData.proto\u001a\fVector.proto\" \u0001\n\u0011HomeFurnitureData\u0012\u000f\n\u0007version\u0018\u0006 \u0001(\r\u0012\u001e\n\u0016parent_furniture_index\u0018\u0003 \u0001(\u0005\u0012\u0014\n\ffurniture_id\u0018\u0004 \u0001(\r\u0012\f\n\u0004guid\u0018\t \u0001(\r\u0012\u001a\n\tspawn_rot\u0018\n \u0001(\u000b2\u0007.Vector\u0012\u001a\n\tspawn_pos\u0018\b \u0001(\u000b2\u0007.VectorB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HomeFurnitureDataOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { VectorOuterClass.getDescriptor() });
        internal_static_HomeFurnitureData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeFurnitureData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(HomeFurnitureDataOuterClass.internal_static_HomeFurnitureData_descriptor, new String[] { "Version", "ParentFurnitureIndex", "FurnitureId", "Guid", "SpawnRot", "SpawnPos" });
        VectorOuterClass.getDescriptor();
    }
    
    public static final class HomeFurnitureData extends GeneratedMessageV3 implements HomeFurnitureDataOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int VERSION_FIELD_NUMBER = 6;
        private int version_;
        public static final int PARENT_FURNITURE_INDEX_FIELD_NUMBER = 3;
        private int parentFurnitureIndex_;
        public static final int FURNITURE_ID_FIELD_NUMBER = 4;
        private int furnitureId_;
        public static final int GUID_FIELD_NUMBER = 9;
        private int guid_;
        public static final int SPAWN_ROT_FIELD_NUMBER = 10;
        private VectorOuterClass.Vector spawnRot_;
        public static final int SPAWN_POS_FIELD_NUMBER = 8;
        private VectorOuterClass.Vector spawnPos_;
        private byte memoizedIsInitialized;
        private static final HomeFurnitureData DEFAULT_INSTANCE;
        private static final Parser<HomeFurnitureData> PARSER;
        
        private HomeFurnitureData(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private HomeFurnitureData() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new HomeFurnitureData();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private HomeFurnitureData(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.parentFurnitureIndex_ = input.readInt32();
                            continue;
                        }
                        case 32: {
                            this.furnitureId_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.version_ = input.readUInt32();
                            continue;
                        }
                        case 66: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.spawnPos_ != null) {
                                subBuilder = this.spawnPos_.toBuilder();
                            }
                            this.spawnPos_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.spawnPos_);
                                this.spawnPos_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 72: {
                            this.guid_ = input.readUInt32();
                            continue;
                        }
                        case 82: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.spawnRot_ != null) {
                                subBuilder = this.spawnRot_.toBuilder();
                            }
                            this.spawnRot_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.spawnRot_);
                                this.spawnRot_ = subBuilder.buildPartial();
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
            return HomeFurnitureDataOuterClass.internal_static_HomeFurnitureData_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HomeFurnitureDataOuterClass.internal_static_HomeFurnitureData_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeFurnitureData.class, Builder.class);
        }
        
        @Override
        public int getVersion() {
            return this.version_;
        }
        
        @Override
        public int getParentFurnitureIndex() {
            return this.parentFurnitureIndex_;
        }
        
        @Override
        public int getFurnitureId() {
            return this.furnitureId_;
        }
        
        @Override
        public int getGuid() {
            return this.guid_;
        }
        
        @Override
        public boolean hasSpawnRot() {
            return this.spawnRot_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getSpawnRot() {
            return (this.spawnRot_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.spawnRot_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getSpawnRotOrBuilder() {
            return this.getSpawnRot();
        }
        
        @Override
        public boolean hasSpawnPos() {
            return this.spawnPos_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getSpawnPos() {
            return (this.spawnPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.spawnPos_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getSpawnPosOrBuilder() {
            return this.getSpawnPos();
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
            if (this.parentFurnitureIndex_ != 0) {
                output.writeInt32(3, this.parentFurnitureIndex_);
            }
            if (this.furnitureId_ != 0) {
                output.writeUInt32(4, this.furnitureId_);
            }
            if (this.version_ != 0) {
                output.writeUInt32(6, this.version_);
            }
            if (this.spawnPos_ != null) {
                output.writeMessage(8, this.getSpawnPos());
            }
            if (this.guid_ != 0) {
                output.writeUInt32(9, this.guid_);
            }
            if (this.spawnRot_ != null) {
                output.writeMessage(10, this.getSpawnRot());
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
            if (this.parentFurnitureIndex_ != 0) {
                size += CodedOutputStream.computeInt32Size(3, this.parentFurnitureIndex_);
            }
            if (this.furnitureId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.furnitureId_);
            }
            if (this.version_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.version_);
            }
            if (this.spawnPos_ != null) {
                size += CodedOutputStream.computeMessageSize(8, this.getSpawnPos());
            }
            if (this.guid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.guid_);
            }
            if (this.spawnRot_ != null) {
                size += CodedOutputStream.computeMessageSize(10, this.getSpawnRot());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomeFurnitureData)) {
                return super.equals(obj);
            }
            final HomeFurnitureData other = (HomeFurnitureData)obj;
            return this.getVersion() == other.getVersion() && this.getParentFurnitureIndex() == other.getParentFurnitureIndex() && this.getFurnitureId() == other.getFurnitureId() && this.getGuid() == other.getGuid() && this.hasSpawnRot() == other.hasSpawnRot() && (!this.hasSpawnRot() || this.getSpawnRot().equals(other.getSpawnRot())) && this.hasSpawnPos() == other.hasSpawnPos() && (!this.hasSpawnPos() || this.getSpawnPos().equals(other.getSpawnPos())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getVersion();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getParentFurnitureIndex();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getFurnitureId();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getGuid();
            if (this.hasSpawnRot()) {
                hash = 37 * hash + 10;
                hash = 53 * hash + this.getSpawnRot().hashCode();
            }
            if (this.hasSpawnPos()) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getSpawnPos().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static HomeFurnitureData parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return HomeFurnitureData.PARSER.parseFrom(data);
        }
        
        public static HomeFurnitureData parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeFurnitureData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeFurnitureData parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return HomeFurnitureData.PARSER.parseFrom(data);
        }
        
        public static HomeFurnitureData parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeFurnitureData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeFurnitureData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return HomeFurnitureData.PARSER.parseFrom(data);
        }
        
        public static HomeFurnitureData parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeFurnitureData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeFurnitureData parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeFurnitureData.PARSER, input);
        }
        
        public static HomeFurnitureData parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeFurnitureData.PARSER, input, extensionRegistry);
        }
        
        public static HomeFurnitureData parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeFurnitureData.PARSER, input);
        }
        
        public static HomeFurnitureData parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeFurnitureData.PARSER, input, extensionRegistry);
        }
        
        public static HomeFurnitureData parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeFurnitureData.PARSER, input);
        }
        
        public static HomeFurnitureData parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeFurnitureData.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return HomeFurnitureData.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final HomeFurnitureData prototype) {
            return HomeFurnitureData.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == HomeFurnitureData.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static HomeFurnitureData getDefaultInstance() {
            return HomeFurnitureData.DEFAULT_INSTANCE;
        }
        
        public static Parser<HomeFurnitureData> parser() {
            return HomeFurnitureData.PARSER;
        }
        
        @Override
        public Parser<HomeFurnitureData> getParserForType() {
            return HomeFurnitureData.PARSER;
        }
        
        @Override
        public HomeFurnitureData getDefaultInstanceForType() {
            return HomeFurnitureData.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new HomeFurnitureData();
            PARSER = new AbstractParser<HomeFurnitureData>() {
                @Override
                public HomeFurnitureData parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new HomeFurnitureData(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HomeFurnitureDataOrBuilder
        {
            private int version_;
            private int parentFurnitureIndex_;
            private int furnitureId_;
            private int guid_;
            private VectorOuterClass.Vector spawnRot_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> spawnRotBuilder_;
            private VectorOuterClass.Vector spawnPos_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> spawnPosBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return HomeFurnitureDataOuterClass.internal_static_HomeFurnitureData_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HomeFurnitureDataOuterClass.internal_static_HomeFurnitureData_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeFurnitureData.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (HomeFurnitureData.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.version_ = 0;
                this.parentFurnitureIndex_ = 0;
                this.furnitureId_ = 0;
                this.guid_ = 0;
                if (this.spawnRotBuilder_ == null) {
                    this.spawnRot_ = null;
                }
                else {
                    this.spawnRot_ = null;
                    this.spawnRotBuilder_ = null;
                }
                if (this.spawnPosBuilder_ == null) {
                    this.spawnPos_ = null;
                }
                else {
                    this.spawnPos_ = null;
                    this.spawnPosBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return HomeFurnitureDataOuterClass.internal_static_HomeFurnitureData_descriptor;
            }
            
            @Override
            public HomeFurnitureData getDefaultInstanceForType() {
                return HomeFurnitureData.getDefaultInstance();
            }
            
            @Override
            public HomeFurnitureData build() {
                final HomeFurnitureData result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public HomeFurnitureData buildPartial() {
                final HomeFurnitureData result = new HomeFurnitureData(this);
                result.version_ = this.version_;
                result.parentFurnitureIndex_ = this.parentFurnitureIndex_;
                result.furnitureId_ = this.furnitureId_;
                result.guid_ = this.guid_;
                if (this.spawnRotBuilder_ == null) {
                    result.spawnRot_ = this.spawnRot_;
                }
                else {
                    result.spawnRot_ = this.spawnRotBuilder_.build();
                }
                if (this.spawnPosBuilder_ == null) {
                    result.spawnPos_ = this.spawnPos_;
                }
                else {
                    result.spawnPos_ = this.spawnPosBuilder_.build();
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
                if (other instanceof HomeFurnitureData) {
                    return this.mergeFrom((HomeFurnitureData)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final HomeFurnitureData other) {
                if (other == HomeFurnitureData.getDefaultInstance()) {
                    return this;
                }
                if (other.getVersion() != 0) {
                    this.setVersion(other.getVersion());
                }
                if (other.getParentFurnitureIndex() != 0) {
                    this.setParentFurnitureIndex(other.getParentFurnitureIndex());
                }
                if (other.getFurnitureId() != 0) {
                    this.setFurnitureId(other.getFurnitureId());
                }
                if (other.getGuid() != 0) {
                    this.setGuid(other.getGuid());
                }
                if (other.hasSpawnRot()) {
                    this.mergeSpawnRot(other.getSpawnRot());
                }
                if (other.hasSpawnPos()) {
                    this.mergeSpawnPos(other.getSpawnPos());
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
                HomeFurnitureData parsedMessage = null;
                try {
                    parsedMessage = HomeFurnitureData.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (HomeFurnitureData)e.getUnfinishedMessage();
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
            public int getVersion() {
                return this.version_;
            }
            
            public Builder setVersion(final int value) {
                this.version_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearVersion() {
                this.version_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getParentFurnitureIndex() {
                return this.parentFurnitureIndex_;
            }
            
            public Builder setParentFurnitureIndex(final int value) {
                this.parentFurnitureIndex_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearParentFurnitureIndex() {
                this.parentFurnitureIndex_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getFurnitureId() {
                return this.furnitureId_;
            }
            
            public Builder setFurnitureId(final int value) {
                this.furnitureId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFurnitureId() {
                this.furnitureId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getGuid() {
                return this.guid_;
            }
            
            public Builder setGuid(final int value) {
                this.guid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGuid() {
                this.guid_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasSpawnRot() {
                return this.spawnRotBuilder_ != null || this.spawnRot_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getSpawnRot() {
                if (this.spawnRotBuilder_ == null) {
                    return (this.spawnRot_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.spawnRot_;
                }
                return this.spawnRotBuilder_.getMessage();
            }
            
            public Builder setSpawnRot(final VectorOuterClass.Vector value) {
                if (this.spawnRotBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.spawnRot_ = value;
                    this.onChanged();
                }
                else {
                    this.spawnRotBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setSpawnRot(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.spawnRotBuilder_ == null) {
                    this.spawnRot_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.spawnRotBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeSpawnRot(final VectorOuterClass.Vector value) {
                if (this.spawnRotBuilder_ == null) {
                    if (this.spawnRot_ != null) {
                        this.spawnRot_ = VectorOuterClass.Vector.newBuilder(this.spawnRot_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.spawnRot_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.spawnRotBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearSpawnRot() {
                if (this.spawnRotBuilder_ == null) {
                    this.spawnRot_ = null;
                    this.onChanged();
                }
                else {
                    this.spawnRot_ = null;
                    this.spawnRotBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getSpawnRotBuilder() {
                this.onChanged();
                return this.getSpawnRotFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getSpawnRotOrBuilder() {
                if (this.spawnRotBuilder_ != null) {
                    return this.spawnRotBuilder_.getMessageOrBuilder();
                }
                return (this.spawnRot_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.spawnRot_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getSpawnRotFieldBuilder() {
                if (this.spawnRotBuilder_ == null) {
                    this.spawnRotBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getSpawnRot(), this.getParentForChildren(), this.isClean());
                    this.spawnRot_ = null;
                }
                return this.spawnRotBuilder_;
            }
            
            @Override
            public boolean hasSpawnPos() {
                return this.spawnPosBuilder_ != null || this.spawnPos_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getSpawnPos() {
                if (this.spawnPosBuilder_ == null) {
                    return (this.spawnPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.spawnPos_;
                }
                return this.spawnPosBuilder_.getMessage();
            }
            
            public Builder setSpawnPos(final VectorOuterClass.Vector value) {
                if (this.spawnPosBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.spawnPos_ = value;
                    this.onChanged();
                }
                else {
                    this.spawnPosBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setSpawnPos(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.spawnPosBuilder_ == null) {
                    this.spawnPos_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.spawnPosBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeSpawnPos(final VectorOuterClass.Vector value) {
                if (this.spawnPosBuilder_ == null) {
                    if (this.spawnPos_ != null) {
                        this.spawnPos_ = VectorOuterClass.Vector.newBuilder(this.spawnPos_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.spawnPos_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.spawnPosBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearSpawnPos() {
                if (this.spawnPosBuilder_ == null) {
                    this.spawnPos_ = null;
                    this.onChanged();
                }
                else {
                    this.spawnPos_ = null;
                    this.spawnPosBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getSpawnPosBuilder() {
                this.onChanged();
                return this.getSpawnPosFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getSpawnPosOrBuilder() {
                if (this.spawnPosBuilder_ != null) {
                    return this.spawnPosBuilder_.getMessageOrBuilder();
                }
                return (this.spawnPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.spawnPos_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getSpawnPosFieldBuilder() {
                if (this.spawnPosBuilder_ == null) {
                    this.spawnPosBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getSpawnPos(), this.getParentForChildren(), this.isClean());
                    this.spawnPos_ = null;
                }
                return this.spawnPosBuilder_;
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
    
    public interface HomeFurnitureDataOrBuilder extends MessageOrBuilder
    {
        int getVersion();
        
        int getParentFurnitureIndex();
        
        int getFurnitureId();
        
        int getGuid();
        
        boolean hasSpawnRot();
        
        VectorOuterClass.Vector getSpawnRot();
        
        VectorOuterClass.VectorOrBuilder getSpawnRotOrBuilder();
        
        boolean hasSpawnPos();
        
        VectorOuterClass.Vector getSpawnPos();
        
        VectorOuterClass.VectorOrBuilder getSpawnPosOrBuilder();
    }
}
