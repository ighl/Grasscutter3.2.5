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

public final class SceneTransToPointRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_SceneTransToPointRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SceneTransToPointRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SceneTransToPointRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SceneTransToPointRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001aSceneTransToPointRsp.proto\"K\n\u0014SceneTransToPointRsp\u0012\u0010\n\bpoint_id\u0018\u0003 \u0001(\r\u0012\u0010\n\bscene_id\u0018\u0004 \u0001(\r\u0012\u000f\n\u0007retcode\u0018\u0002 \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SceneTransToPointRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_SceneTransToPointRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SceneTransToPointRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SceneTransToPointRspOuterClass.internal_static_SceneTransToPointRsp_descriptor, new String[] { "PointId", "SceneId", "Retcode" });
    }
    
    public static final class SceneTransToPointRsp extends GeneratedMessageV3 implements SceneTransToPointRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int POINT_ID_FIELD_NUMBER = 3;
        private int pointId_;
        public static final int SCENE_ID_FIELD_NUMBER = 4;
        private int sceneId_;
        public static final int RETCODE_FIELD_NUMBER = 2;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final SceneTransToPointRsp DEFAULT_INSTANCE;
        private static final Parser<SceneTransToPointRsp> PARSER;
        
        private SceneTransToPointRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SceneTransToPointRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SceneTransToPointRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SceneTransToPointRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 24: {
                            this.pointId_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
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
            return SceneTransToPointRspOuterClass.internal_static_SceneTransToPointRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SceneTransToPointRspOuterClass.internal_static_SceneTransToPointRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneTransToPointRsp.class, Builder.class);
        }
        
        @Override
        public int getPointId() {
            return this.pointId_;
        }
        
        @Override
        public int getSceneId() {
            return this.sceneId_;
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
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
            if (this.retcode_ != 0) {
                output.writeInt32(2, this.retcode_);
            }
            if (this.pointId_ != 0) {
                output.writeUInt32(3, this.pointId_);
            }
            if (this.sceneId_ != 0) {
                output.writeUInt32(4, this.sceneId_);
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
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(2, this.retcode_);
            }
            if (this.pointId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.pointId_);
            }
            if (this.sceneId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.sceneId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SceneTransToPointRsp)) {
                return super.equals(obj);
            }
            final SceneTransToPointRsp other = (SceneTransToPointRsp)obj;
            return this.getPointId() == other.getPointId() && this.getSceneId() == other.getSceneId() && this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getPointId();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getSceneId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SceneTransToPointRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SceneTransToPointRsp.PARSER.parseFrom(data);
        }
        
        public static SceneTransToPointRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneTransToPointRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneTransToPointRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SceneTransToPointRsp.PARSER.parseFrom(data);
        }
        
        public static SceneTransToPointRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneTransToPointRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneTransToPointRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SceneTransToPointRsp.PARSER.parseFrom(data);
        }
        
        public static SceneTransToPointRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneTransToPointRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneTransToPointRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneTransToPointRsp.PARSER, input);
        }
        
        public static SceneTransToPointRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneTransToPointRsp.PARSER, input, extensionRegistry);
        }
        
        public static SceneTransToPointRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneTransToPointRsp.PARSER, input);
        }
        
        public static SceneTransToPointRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneTransToPointRsp.PARSER, input, extensionRegistry);
        }
        
        public static SceneTransToPointRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneTransToPointRsp.PARSER, input);
        }
        
        public static SceneTransToPointRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneTransToPointRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SceneTransToPointRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SceneTransToPointRsp prototype) {
            return SceneTransToPointRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SceneTransToPointRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SceneTransToPointRsp getDefaultInstance() {
            return SceneTransToPointRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<SceneTransToPointRsp> parser() {
            return SceneTransToPointRsp.PARSER;
        }
        
        @Override
        public Parser<SceneTransToPointRsp> getParserForType() {
            return SceneTransToPointRsp.PARSER;
        }
        
        @Override
        public SceneTransToPointRsp getDefaultInstanceForType() {
            return SceneTransToPointRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SceneTransToPointRsp();
            PARSER = new AbstractParser<SceneTransToPointRsp>() {
                @Override
                public SceneTransToPointRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SceneTransToPointRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SceneTransToPointRspOrBuilder
        {
            private int pointId_;
            private int sceneId_;
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SceneTransToPointRspOuterClass.internal_static_SceneTransToPointRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SceneTransToPointRspOuterClass.internal_static_SceneTransToPointRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneTransToPointRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SceneTransToPointRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.pointId_ = 0;
                this.sceneId_ = 0;
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SceneTransToPointRspOuterClass.internal_static_SceneTransToPointRsp_descriptor;
            }
            
            @Override
            public SceneTransToPointRsp getDefaultInstanceForType() {
                return SceneTransToPointRsp.getDefaultInstance();
            }
            
            @Override
            public SceneTransToPointRsp build() {
                final SceneTransToPointRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SceneTransToPointRsp buildPartial() {
                final SceneTransToPointRsp result = new SceneTransToPointRsp(this);
                result.pointId_ = this.pointId_;
                result.sceneId_ = this.sceneId_;
                result.retcode_ = this.retcode_;
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
                if (other instanceof SceneTransToPointRsp) {
                    return this.mergeFrom((SceneTransToPointRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SceneTransToPointRsp other) {
                if (other == SceneTransToPointRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getPointId() != 0) {
                    this.setPointId(other.getPointId());
                }
                if (other.getSceneId() != 0) {
                    this.setSceneId(other.getSceneId());
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
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
                SceneTransToPointRsp parsedMessage = null;
                try {
                    parsedMessage = SceneTransToPointRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SceneTransToPointRsp)e.getUnfinishedMessage();
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface SceneTransToPointRspOrBuilder extends MessageOrBuilder
    {
        int getPointId();
        
        int getSceneId();
        
        int getRetcode();
    }
}
