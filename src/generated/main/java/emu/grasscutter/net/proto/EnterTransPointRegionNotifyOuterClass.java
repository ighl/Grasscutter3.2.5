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

public final class EnterTransPointRegionNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_EnterTransPointRegionNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EnterTransPointRegionNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private EnterTransPointRegionNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return EnterTransPointRegionNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n!EnterTransPointRegionNotify.proto\"A\n\u001bEnterTransPointRegionNotify\u0012\u0010\n\bscene_id\u0018\b \u0001(\r\u0012\u0010\n\bpoint_id\u0018\u0006 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        EnterTransPointRegionNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_EnterTransPointRegionNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_EnterTransPointRegionNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(EnterTransPointRegionNotifyOuterClass.internal_static_EnterTransPointRegionNotify_descriptor, new String[] { "SceneId", "PointId" });
    }
    
    public static final class EnterTransPointRegionNotify extends GeneratedMessageV3 implements EnterTransPointRegionNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SCENE_ID_FIELD_NUMBER = 8;
        private int sceneId_;
        public static final int POINT_ID_FIELD_NUMBER = 6;
        private int pointId_;
        private byte memoizedIsInitialized;
        private static final EnterTransPointRegionNotify DEFAULT_INSTANCE;
        private static final Parser<EnterTransPointRegionNotify> PARSER;
        
        private EnterTransPointRegionNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private EnterTransPointRegionNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new EnterTransPointRegionNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private EnterTransPointRegionNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 48: {
                            this.pointId_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
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
            return EnterTransPointRegionNotifyOuterClass.internal_static_EnterTransPointRegionNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return EnterTransPointRegionNotifyOuterClass.internal_static_EnterTransPointRegionNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(EnterTransPointRegionNotify.class, Builder.class);
        }
        
        @Override
        public int getSceneId() {
            return this.sceneId_;
        }
        
        @Override
        public int getPointId() {
            return this.pointId_;
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
            if (this.pointId_ != 0) {
                output.writeUInt32(6, this.pointId_);
            }
            if (this.sceneId_ != 0) {
                output.writeUInt32(8, this.sceneId_);
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
            if (this.pointId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.pointId_);
            }
            if (this.sceneId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.sceneId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EnterTransPointRegionNotify)) {
                return super.equals(obj);
            }
            final EnterTransPointRegionNotify other = (EnterTransPointRegionNotify)obj;
            return this.getSceneId() == other.getSceneId() && this.getPointId() == other.getPointId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getSceneId();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getPointId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static EnterTransPointRegionNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return EnterTransPointRegionNotify.PARSER.parseFrom(data);
        }
        
        public static EnterTransPointRegionNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EnterTransPointRegionNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EnterTransPointRegionNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return EnterTransPointRegionNotify.PARSER.parseFrom(data);
        }
        
        public static EnterTransPointRegionNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EnterTransPointRegionNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EnterTransPointRegionNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return EnterTransPointRegionNotify.PARSER.parseFrom(data);
        }
        
        public static EnterTransPointRegionNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EnterTransPointRegionNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EnterTransPointRegionNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EnterTransPointRegionNotify.PARSER, input);
        }
        
        public static EnterTransPointRegionNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EnterTransPointRegionNotify.PARSER, input, extensionRegistry);
        }
        
        public static EnterTransPointRegionNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EnterTransPointRegionNotify.PARSER, input);
        }
        
        public static EnterTransPointRegionNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EnterTransPointRegionNotify.PARSER, input, extensionRegistry);
        }
        
        public static EnterTransPointRegionNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EnterTransPointRegionNotify.PARSER, input);
        }
        
        public static EnterTransPointRegionNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EnterTransPointRegionNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return EnterTransPointRegionNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final EnterTransPointRegionNotify prototype) {
            return EnterTransPointRegionNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == EnterTransPointRegionNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static EnterTransPointRegionNotify getDefaultInstance() {
            return EnterTransPointRegionNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<EnterTransPointRegionNotify> parser() {
            return EnterTransPointRegionNotify.PARSER;
        }
        
        @Override
        public Parser<EnterTransPointRegionNotify> getParserForType() {
            return EnterTransPointRegionNotify.PARSER;
        }
        
        @Override
        public EnterTransPointRegionNotify getDefaultInstanceForType() {
            return EnterTransPointRegionNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new EnterTransPointRegionNotify();
            PARSER = new AbstractParser<EnterTransPointRegionNotify>() {
                @Override
                public EnterTransPointRegionNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new EnterTransPointRegionNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EnterTransPointRegionNotifyOrBuilder
        {
            private int sceneId_;
            private int pointId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return EnterTransPointRegionNotifyOuterClass.internal_static_EnterTransPointRegionNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return EnterTransPointRegionNotifyOuterClass.internal_static_EnterTransPointRegionNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(EnterTransPointRegionNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (EnterTransPointRegionNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.sceneId_ = 0;
                this.pointId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return EnterTransPointRegionNotifyOuterClass.internal_static_EnterTransPointRegionNotify_descriptor;
            }
            
            @Override
            public EnterTransPointRegionNotify getDefaultInstanceForType() {
                return EnterTransPointRegionNotify.getDefaultInstance();
            }
            
            @Override
            public EnterTransPointRegionNotify build() {
                final EnterTransPointRegionNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public EnterTransPointRegionNotify buildPartial() {
                final EnterTransPointRegionNotify result = new EnterTransPointRegionNotify(this);
                result.sceneId_ = this.sceneId_;
                result.pointId_ = this.pointId_;
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
                if (other instanceof EnterTransPointRegionNotify) {
                    return this.mergeFrom((EnterTransPointRegionNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final EnterTransPointRegionNotify other) {
                if (other == EnterTransPointRegionNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getSceneId() != 0) {
                    this.setSceneId(other.getSceneId());
                }
                if (other.getPointId() != 0) {
                    this.setPointId(other.getPointId());
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
                EnterTransPointRegionNotify parsedMessage = null;
                try {
                    parsedMessage = EnterTransPointRegionNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (EnterTransPointRegionNotify)e.getUnfinishedMessage();
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
            public int getPointId() {
                return this.pointId_;
            }
            
            public Builder setPointId(final int value) {
                this.pointId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPointId() {
                this.pointId_ = 0;
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
    
    public interface EnterTransPointRegionNotifyOrBuilder extends MessageOrBuilder
    {
        int getSceneId();
        
        int getPointId();
    }
}
