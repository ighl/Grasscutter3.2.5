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

public final class AvatarChangeElementTypeReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_AvatarChangeElementTypeReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarChangeElementTypeReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AvatarChangeElementTypeReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AvatarChangeElementTypeReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n AvatarChangeElementTypeReq.proto\"?\n\u001aAvatarChangeElementTypeReq\u0012\u0010\n\bscene_id\u0018\u0007 \u0001(\r\u0012\u000f\n\u0007area_id\u0018\u0003 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AvatarChangeElementTypeReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AvatarChangeElementTypeReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AvatarChangeElementTypeReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarChangeElementTypeReqOuterClass.internal_static_AvatarChangeElementTypeReq_descriptor, new String[] { "SceneId", "AreaId" });
    }
    
    public static final class AvatarChangeElementTypeReq extends GeneratedMessageV3 implements AvatarChangeElementTypeReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SCENE_ID_FIELD_NUMBER = 7;
        private int sceneId_;
        public static final int AREA_ID_FIELD_NUMBER = 3;
        private int areaId_;
        private byte memoizedIsInitialized;
        private static final AvatarChangeElementTypeReq DEFAULT_INSTANCE;
        private static final Parser<AvatarChangeElementTypeReq> PARSER;
        
        private AvatarChangeElementTypeReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AvatarChangeElementTypeReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AvatarChangeElementTypeReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AvatarChangeElementTypeReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.areaId_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            this.sceneId_ = input.readUInt32();
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
            return AvatarChangeElementTypeReqOuterClass.internal_static_AvatarChangeElementTypeReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AvatarChangeElementTypeReqOuterClass.internal_static_AvatarChangeElementTypeReq_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarChangeElementTypeReq.class, Builder.class);
        }
        
        @Override
        public int getSceneId() {
            return this.sceneId_;
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
                output.writeUInt32(3, this.areaId_);
            }
            if (this.sceneId_ != 0) {
                output.writeUInt32(7, this.sceneId_);
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
                size += CodedOutputStream.computeUInt32Size(3, this.areaId_);
            }
            if (this.sceneId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.sceneId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarChangeElementTypeReq)) {
                return super.equals(obj);
            }
            final AvatarChangeElementTypeReq other = (AvatarChangeElementTypeReq)obj;
            return this.getSceneId() == other.getSceneId() && this.getAreaId() == other.getAreaId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getSceneId();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getAreaId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AvatarChangeElementTypeReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AvatarChangeElementTypeReq.PARSER.parseFrom(data);
        }
        
        public static AvatarChangeElementTypeReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarChangeElementTypeReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarChangeElementTypeReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AvatarChangeElementTypeReq.PARSER.parseFrom(data);
        }
        
        public static AvatarChangeElementTypeReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarChangeElementTypeReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarChangeElementTypeReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AvatarChangeElementTypeReq.PARSER.parseFrom(data);
        }
        
        public static AvatarChangeElementTypeReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarChangeElementTypeReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarChangeElementTypeReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarChangeElementTypeReq.PARSER, input);
        }
        
        public static AvatarChangeElementTypeReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarChangeElementTypeReq.PARSER, input, extensionRegistry);
        }
        
        public static AvatarChangeElementTypeReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarChangeElementTypeReq.PARSER, input);
        }
        
        public static AvatarChangeElementTypeReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarChangeElementTypeReq.PARSER, input, extensionRegistry);
        }
        
        public static AvatarChangeElementTypeReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarChangeElementTypeReq.PARSER, input);
        }
        
        public static AvatarChangeElementTypeReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarChangeElementTypeReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AvatarChangeElementTypeReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AvatarChangeElementTypeReq prototype) {
            return AvatarChangeElementTypeReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AvatarChangeElementTypeReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AvatarChangeElementTypeReq getDefaultInstance() {
            return AvatarChangeElementTypeReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<AvatarChangeElementTypeReq> parser() {
            return AvatarChangeElementTypeReq.PARSER;
        }
        
        @Override
        public Parser<AvatarChangeElementTypeReq> getParserForType() {
            return AvatarChangeElementTypeReq.PARSER;
        }
        
        @Override
        public AvatarChangeElementTypeReq getDefaultInstanceForType() {
            return AvatarChangeElementTypeReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AvatarChangeElementTypeReq();
            PARSER = new AbstractParser<AvatarChangeElementTypeReq>() {
                @Override
                public AvatarChangeElementTypeReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AvatarChangeElementTypeReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AvatarChangeElementTypeReqOrBuilder
        {
            private int sceneId_;
            private int areaId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AvatarChangeElementTypeReqOuterClass.internal_static_AvatarChangeElementTypeReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AvatarChangeElementTypeReqOuterClass.internal_static_AvatarChangeElementTypeReq_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarChangeElementTypeReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AvatarChangeElementTypeReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.sceneId_ = 0;
                this.areaId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AvatarChangeElementTypeReqOuterClass.internal_static_AvatarChangeElementTypeReq_descriptor;
            }
            
            @Override
            public AvatarChangeElementTypeReq getDefaultInstanceForType() {
                return AvatarChangeElementTypeReq.getDefaultInstance();
            }
            
            @Override
            public AvatarChangeElementTypeReq build() {
                final AvatarChangeElementTypeReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AvatarChangeElementTypeReq buildPartial() {
                final AvatarChangeElementTypeReq result = new AvatarChangeElementTypeReq(this);
                result.sceneId_ = this.sceneId_;
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
                if (other instanceof AvatarChangeElementTypeReq) {
                    return this.mergeFrom((AvatarChangeElementTypeReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AvatarChangeElementTypeReq other) {
                if (other == AvatarChangeElementTypeReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getSceneId() != 0) {
                    this.setSceneId(other.getSceneId());
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
                AvatarChangeElementTypeReq parsedMessage = null;
                try {
                    parsedMessage = AvatarChangeElementTypeReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AvatarChangeElementTypeReq)e.getUnfinishedMessage();
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
            public int getSceneId() {
                return this.sceneId_;
            }
            
            public Builder setSceneId(final int value) {
                this.sceneId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSceneId() {
                this.sceneId_ = 0;
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
    
    public interface AvatarChangeElementTypeReqOrBuilder extends MessageOrBuilder
    {
        int getSceneId();
        
        int getAreaId();
    }
}
