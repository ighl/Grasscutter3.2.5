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
import com.google.protobuf.Internal;
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

public final class OneofGatherPointDetectorDataOuterClass
{
    private static final Descriptors.Descriptor internal_static_OneofGatherPointDetectorData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_OneofGatherPointDetectorData_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private OneofGatherPointDetectorDataOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return OneofGatherPointDetectorDataOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\"OneofGatherPointDetectorData.proto\u001a\fVector.proto\"\u00c0\u0001\n\u001cOneofGatherPointDetectorData\u0012 \n\u000fhint_center_pos\u0018\u0007 \u0001(\u000b2\u0007.Vector\u0012\u0013\n\u000bhint_radius\u0018\u000e \u0001(\r\u0012\u0013\n\u000bmaterial_id\u0018\n \u0001(\r\u0012\u0011\n\tconfig_id\u0018\u0006 \u0001(\r\u0012\u0010\n\bgroup_id\u0018\r \u0001(\r\u0012\u0018\n\u0010is_all_collected\u0018\u0004 \u0001(\b\u0012\u0015\n\ris_hint_valid\u0018\u000f \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        OneofGatherPointDetectorDataOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { VectorOuterClass.getDescriptor() });
        internal_static_OneofGatherPointDetectorData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_OneofGatherPointDetectorData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(OneofGatherPointDetectorDataOuterClass.internal_static_OneofGatherPointDetectorData_descriptor, new String[] { "HintCenterPos", "HintRadius", "MaterialId", "ConfigId", "GroupId", "IsAllCollected", "IsHintValid" });
        VectorOuterClass.getDescriptor();
    }
    
    public static final class OneofGatherPointDetectorData extends GeneratedMessageV3 implements OneofGatherPointDetectorDataOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int HINT_CENTER_POS_FIELD_NUMBER = 7;
        private VectorOuterClass.Vector hintCenterPos_;
        public static final int HINT_RADIUS_FIELD_NUMBER = 14;
        private int hintRadius_;
        public static final int MATERIAL_ID_FIELD_NUMBER = 10;
        private int materialId_;
        public static final int CONFIG_ID_FIELD_NUMBER = 6;
        private int configId_;
        public static final int GROUP_ID_FIELD_NUMBER = 13;
        private int groupId_;
        public static final int IS_ALL_COLLECTED_FIELD_NUMBER = 4;
        private boolean isAllCollected_;
        public static final int IS_HINT_VALID_FIELD_NUMBER = 15;
        private boolean isHintValid_;
        private byte memoizedIsInitialized;
        private static final OneofGatherPointDetectorData DEFAULT_INSTANCE;
        private static final Parser<OneofGatherPointDetectorData> PARSER;
        
        private OneofGatherPointDetectorData(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private OneofGatherPointDetectorData() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new OneofGatherPointDetectorData();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private OneofGatherPointDetectorData(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.isAllCollected_ = input.readBool();
                            continue;
                        }
                        case 48: {
                            this.configId_ = input.readUInt32();
                            continue;
                        }
                        case 58: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.hintCenterPos_ != null) {
                                subBuilder = this.hintCenterPos_.toBuilder();
                            }
                            this.hintCenterPos_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.hintCenterPos_);
                                this.hintCenterPos_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 80: {
                            this.materialId_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.groupId_ = input.readUInt32();
                            continue;
                        }
                        case 112: {
                            this.hintRadius_ = input.readUInt32();
                            continue;
                        }
                        case 120: {
                            this.isHintValid_ = input.readBool();
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
            return OneofGatherPointDetectorDataOuterClass.internal_static_OneofGatherPointDetectorData_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return OneofGatherPointDetectorDataOuterClass.internal_static_OneofGatherPointDetectorData_fieldAccessorTable.ensureFieldAccessorsInitialized(OneofGatherPointDetectorData.class, Builder.class);
        }
        
        @Override
        public boolean hasHintCenterPos() {
            return this.hintCenterPos_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getHintCenterPos() {
            return (this.hintCenterPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.hintCenterPos_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getHintCenterPosOrBuilder() {
            return this.getHintCenterPos();
        }
        
        @Override
        public int getHintRadius() {
            return this.hintRadius_;
        }
        
        @Override
        public int getMaterialId() {
            return this.materialId_;
        }
        
        @Override
        public int getConfigId() {
            return this.configId_;
        }
        
        @Override
        public int getGroupId() {
            return this.groupId_;
        }
        
        @Override
        public boolean getIsAllCollected() {
            return this.isAllCollected_;
        }
        
        @Override
        public boolean getIsHintValid() {
            return this.isHintValid_;
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
            if (this.isAllCollected_) {
                output.writeBool(4, this.isAllCollected_);
            }
            if (this.configId_ != 0) {
                output.writeUInt32(6, this.configId_);
            }
            if (this.hintCenterPos_ != null) {
                output.writeMessage(7, this.getHintCenterPos());
            }
            if (this.materialId_ != 0) {
                output.writeUInt32(10, this.materialId_);
            }
            if (this.groupId_ != 0) {
                output.writeUInt32(13, this.groupId_);
            }
            if (this.hintRadius_ != 0) {
                output.writeUInt32(14, this.hintRadius_);
            }
            if (this.isHintValid_) {
                output.writeBool(15, this.isHintValid_);
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
            if (this.isAllCollected_) {
                size += CodedOutputStream.computeBoolSize(4, this.isAllCollected_);
            }
            if (this.configId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.configId_);
            }
            if (this.hintCenterPos_ != null) {
                size += CodedOutputStream.computeMessageSize(7, this.getHintCenterPos());
            }
            if (this.materialId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.materialId_);
            }
            if (this.groupId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.groupId_);
            }
            if (this.hintRadius_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.hintRadius_);
            }
            if (this.isHintValid_) {
                size += CodedOutputStream.computeBoolSize(15, this.isHintValid_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OneofGatherPointDetectorData)) {
                return super.equals(obj);
            }
            final OneofGatherPointDetectorData other = (OneofGatherPointDetectorData)obj;
            return this.hasHintCenterPos() == other.hasHintCenterPos() && (!this.hasHintCenterPos() || this.getHintCenterPos().equals(other.getHintCenterPos())) && this.getHintRadius() == other.getHintRadius() && this.getMaterialId() == other.getMaterialId() && this.getConfigId() == other.getConfigId() && this.getGroupId() == other.getGroupId() && this.getIsAllCollected() == other.getIsAllCollected() && this.getIsHintValid() == other.getIsHintValid() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasHintCenterPos()) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.getHintCenterPos().hashCode();
            }
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getHintRadius();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getMaterialId();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getConfigId();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getGroupId();
            hash = 37 * hash + 4;
            hash = 53 * hash + Internal.hashBoolean(this.getIsAllCollected());
            hash = 37 * hash + 15;
            hash = 53 * hash + Internal.hashBoolean(this.getIsHintValid());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static OneofGatherPointDetectorData parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return OneofGatherPointDetectorData.PARSER.parseFrom(data);
        }
        
        public static OneofGatherPointDetectorData parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return OneofGatherPointDetectorData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static OneofGatherPointDetectorData parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return OneofGatherPointDetectorData.PARSER.parseFrom(data);
        }
        
        public static OneofGatherPointDetectorData parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return OneofGatherPointDetectorData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static OneofGatherPointDetectorData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return OneofGatherPointDetectorData.PARSER.parseFrom(data);
        }
        
        public static OneofGatherPointDetectorData parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return OneofGatherPointDetectorData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static OneofGatherPointDetectorData parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(OneofGatherPointDetectorData.PARSER, input);
        }
        
        public static OneofGatherPointDetectorData parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(OneofGatherPointDetectorData.PARSER, input, extensionRegistry);
        }
        
        public static OneofGatherPointDetectorData parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(OneofGatherPointDetectorData.PARSER, input);
        }
        
        public static OneofGatherPointDetectorData parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(OneofGatherPointDetectorData.PARSER, input, extensionRegistry);
        }
        
        public static OneofGatherPointDetectorData parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(OneofGatherPointDetectorData.PARSER, input);
        }
        
        public static OneofGatherPointDetectorData parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(OneofGatherPointDetectorData.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return OneofGatherPointDetectorData.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final OneofGatherPointDetectorData prototype) {
            return OneofGatherPointDetectorData.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == OneofGatherPointDetectorData.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static OneofGatherPointDetectorData getDefaultInstance() {
            return OneofGatherPointDetectorData.DEFAULT_INSTANCE;
        }
        
        public static Parser<OneofGatherPointDetectorData> parser() {
            return OneofGatherPointDetectorData.PARSER;
        }
        
        @Override
        public Parser<OneofGatherPointDetectorData> getParserForType() {
            return OneofGatherPointDetectorData.PARSER;
        }
        
        @Override
        public OneofGatherPointDetectorData getDefaultInstanceForType() {
            return OneofGatherPointDetectorData.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new OneofGatherPointDetectorData();
            PARSER = new AbstractParser<OneofGatherPointDetectorData>() {
                @Override
                public OneofGatherPointDetectorData parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new OneofGatherPointDetectorData(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OneofGatherPointDetectorDataOrBuilder
        {
            private VectorOuterClass.Vector hintCenterPos_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> hintCenterPosBuilder_;
            private int hintRadius_;
            private int materialId_;
            private int configId_;
            private int groupId_;
            private boolean isAllCollected_;
            private boolean isHintValid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return OneofGatherPointDetectorDataOuterClass.internal_static_OneofGatherPointDetectorData_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return OneofGatherPointDetectorDataOuterClass.internal_static_OneofGatherPointDetectorData_fieldAccessorTable.ensureFieldAccessorsInitialized(OneofGatherPointDetectorData.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (OneofGatherPointDetectorData.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.hintCenterPosBuilder_ == null) {
                    this.hintCenterPos_ = null;
                }
                else {
                    this.hintCenterPos_ = null;
                    this.hintCenterPosBuilder_ = null;
                }
                this.hintRadius_ = 0;
                this.materialId_ = 0;
                this.configId_ = 0;
                this.groupId_ = 0;
                this.isAllCollected_ = false;
                this.isHintValid_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return OneofGatherPointDetectorDataOuterClass.internal_static_OneofGatherPointDetectorData_descriptor;
            }
            
            @Override
            public OneofGatherPointDetectorData getDefaultInstanceForType() {
                return OneofGatherPointDetectorData.getDefaultInstance();
            }
            
            @Override
            public OneofGatherPointDetectorData build() {
                final OneofGatherPointDetectorData result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public OneofGatherPointDetectorData buildPartial() {
                final OneofGatherPointDetectorData result = new OneofGatherPointDetectorData(this);
                if (this.hintCenterPosBuilder_ == null) {
                    result.hintCenterPos_ = this.hintCenterPos_;
                }
                else {
                    result.hintCenterPos_ = this.hintCenterPosBuilder_.build();
                }
                result.hintRadius_ = this.hintRadius_;
                result.materialId_ = this.materialId_;
                result.configId_ = this.configId_;
                result.groupId_ = this.groupId_;
                result.isAllCollected_ = this.isAllCollected_;
                result.isHintValid_ = this.isHintValid_;
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
                if (other instanceof OneofGatherPointDetectorData) {
                    return this.mergeFrom((OneofGatherPointDetectorData)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final OneofGatherPointDetectorData other) {
                if (other == OneofGatherPointDetectorData.getDefaultInstance()) {
                    return this;
                }
                if (other.hasHintCenterPos()) {
                    this.mergeHintCenterPos(other.getHintCenterPos());
                }
                if (other.getHintRadius() != 0) {
                    this.setHintRadius(other.getHintRadius());
                }
                if (other.getMaterialId() != 0) {
                    this.setMaterialId(other.getMaterialId());
                }
                if (other.getConfigId() != 0) {
                    this.setConfigId(other.getConfigId());
                }
                if (other.getGroupId() != 0) {
                    this.setGroupId(other.getGroupId());
                }
                if (other.getIsAllCollected()) {
                    this.setIsAllCollected(other.getIsAllCollected());
                }
                if (other.getIsHintValid()) {
                    this.setIsHintValid(other.getIsHintValid());
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
                OneofGatherPointDetectorData parsedMessage = null;
                try {
                    parsedMessage = OneofGatherPointDetectorData.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (OneofGatherPointDetectorData)e.getUnfinishedMessage();
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
            public boolean hasHintCenterPos() {
                return this.hintCenterPosBuilder_ != null || this.hintCenterPos_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getHintCenterPos() {
                if (this.hintCenterPosBuilder_ == null) {
                    return (this.hintCenterPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.hintCenterPos_;
                }
                return this.hintCenterPosBuilder_.getMessage();
            }
            
            public Builder setHintCenterPos(final VectorOuterClass.Vector value) {
                if (this.hintCenterPosBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.hintCenterPos_ = value;
                    this.onChanged();
                }
                else {
                    this.hintCenterPosBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setHintCenterPos(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.hintCenterPosBuilder_ == null) {
                    this.hintCenterPos_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.hintCenterPosBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeHintCenterPos(final VectorOuterClass.Vector value) {
                if (this.hintCenterPosBuilder_ == null) {
                    if (this.hintCenterPos_ != null) {
                        this.hintCenterPos_ = VectorOuterClass.Vector.newBuilder(this.hintCenterPos_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.hintCenterPos_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.hintCenterPosBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearHintCenterPos() {
                if (this.hintCenterPosBuilder_ == null) {
                    this.hintCenterPos_ = null;
                    this.onChanged();
                }
                else {
                    this.hintCenterPos_ = null;
                    this.hintCenterPosBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getHintCenterPosBuilder() {
                this.onChanged();
                return this.getHintCenterPosFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getHintCenterPosOrBuilder() {
                if (this.hintCenterPosBuilder_ != null) {
                    return this.hintCenterPosBuilder_.getMessageOrBuilder();
                }
                return (this.hintCenterPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.hintCenterPos_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getHintCenterPosFieldBuilder() {
                if (this.hintCenterPosBuilder_ == null) {
                    this.hintCenterPosBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getHintCenterPos(), this.getParentForChildren(), this.isClean());
                    this.hintCenterPos_ = null;
                }
                return this.hintCenterPosBuilder_;
            }
            
            @Override
            public int getHintRadius() {
                return this.hintRadius_;
            }
            
            public Builder setHintRadius(final int value) {
                this.hintRadius_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearHintRadius() {
                this.hintRadius_ = 0;
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
            public int getConfigId() {
                return this.configId_;
            }
            
            public Builder setConfigId(final int value) {
                this.configId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearConfigId() {
                this.configId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getGroupId() {
                return this.groupId_;
            }
            
            public Builder setGroupId(final int value) {
                this.groupId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGroupId() {
                this.groupId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsAllCollected() {
                return this.isAllCollected_;
            }
            
            public Builder setIsAllCollected(final boolean value) {
                this.isAllCollected_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsAllCollected() {
                this.isAllCollected_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsHintValid() {
                return this.isHintValid_;
            }
            
            public Builder setIsHintValid(final boolean value) {
                this.isHintValid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsHintValid() {
                this.isHintValid_ = false;
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
    
    public interface OneofGatherPointDetectorDataOrBuilder extends MessageOrBuilder
    {
        boolean hasHintCenterPos();
        
        VectorOuterClass.Vector getHintCenterPos();
        
        VectorOuterClass.VectorOrBuilder getHintCenterPosOrBuilder();
        
        int getHintRadius();
        
        int getMaterialId();
        
        int getConfigId();
        
        int getGroupId();
        
        boolean getIsAllCollected();
        
        boolean getIsHintValid();
    }
}
