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

public final class PlatformStopRouteNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_PlatformStopRouteNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlatformStopRouteNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PlatformStopRouteNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlatformStopRouteNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001dPlatformStopRouteNotify.proto\u001a\u0012PlatformInfo.proto\"a\n\u0017PlatformStopRouteNotify\u0012\u0012\n\nscene_time\u0018\t \u0001(\r\u0012\u0011\n\tentity_id\u0018\f \u0001(\r\u0012\u001f\n\bplatform\u0018\b \u0001(\u000b2\r.PlatformInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlatformStopRouteNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { PlatformInfoOuterClass.getDescriptor() });
        internal_static_PlatformStopRouteNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlatformStopRouteNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlatformStopRouteNotifyOuterClass.internal_static_PlatformStopRouteNotify_descriptor, new String[] { "SceneTime", "EntityId", "Platform" });
        PlatformInfoOuterClass.getDescriptor();
    }
    
    public static final class PlatformStopRouteNotify extends GeneratedMessageV3 implements PlatformStopRouteNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SCENE_TIME_FIELD_NUMBER = 9;
        private int sceneTime_;
        public static final int ENTITY_ID_FIELD_NUMBER = 12;
        private int entityId_;
        public static final int PLATFORM_FIELD_NUMBER = 8;
        private PlatformInfoOuterClass.PlatformInfo platform_;
        private byte memoizedIsInitialized;
        private static final PlatformStopRouteNotify DEFAULT_INSTANCE;
        private static final Parser<PlatformStopRouteNotify> PARSER;
        
        private PlatformStopRouteNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PlatformStopRouteNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PlatformStopRouteNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PlatformStopRouteNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 66: {
                            PlatformInfoOuterClass.PlatformInfo.Builder subBuilder = null;
                            if (this.platform_ != null) {
                                subBuilder = this.platform_.toBuilder();
                            }
                            this.platform_ = input.readMessage(PlatformInfoOuterClass.PlatformInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.platform_);
                                this.platform_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 72: {
                            this.sceneTime_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
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
            return PlatformStopRouteNotifyOuterClass.internal_static_PlatformStopRouteNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PlatformStopRouteNotifyOuterClass.internal_static_PlatformStopRouteNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(PlatformStopRouteNotify.class, Builder.class);
        }
        
        @Override
        public int getSceneTime() {
            return this.sceneTime_;
        }
        
        @Override
        public int getEntityId() {
            return this.entityId_;
        }
        
        @Override
        public boolean hasPlatform() {
            return this.platform_ != null;
        }
        
        @Override
        public PlatformInfoOuterClass.PlatformInfo getPlatform() {
            return (this.platform_ == null) ? PlatformInfoOuterClass.PlatformInfo.getDefaultInstance() : this.platform_;
        }
        
        @Override
        public PlatformInfoOuterClass.PlatformInfoOrBuilder getPlatformOrBuilder() {
            return this.getPlatform();
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
            if (this.platform_ != null) {
                output.writeMessage(8, this.getPlatform());
            }
            if (this.sceneTime_ != 0) {
                output.writeUInt32(9, this.sceneTime_);
            }
            if (this.entityId_ != 0) {
                output.writeUInt32(12, this.entityId_);
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
            if (this.platform_ != null) {
                size += CodedOutputStream.computeMessageSize(8, this.getPlatform());
            }
            if (this.sceneTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.sceneTime_);
            }
            if (this.entityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.entityId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlatformStopRouteNotify)) {
                return super.equals(obj);
            }
            final PlatformStopRouteNotify other = (PlatformStopRouteNotify)obj;
            return this.getSceneTime() == other.getSceneTime() && this.getEntityId() == other.getEntityId() && this.hasPlatform() == other.hasPlatform() && (!this.hasPlatform() || this.getPlatform().equals(other.getPlatform())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getSceneTime();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getEntityId();
            if (this.hasPlatform()) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getPlatform().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PlatformStopRouteNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PlatformStopRouteNotify.PARSER.parseFrom(data);
        }
        
        public static PlatformStopRouteNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlatformStopRouteNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlatformStopRouteNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PlatformStopRouteNotify.PARSER.parseFrom(data);
        }
        
        public static PlatformStopRouteNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlatformStopRouteNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlatformStopRouteNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PlatformStopRouteNotify.PARSER.parseFrom(data);
        }
        
        public static PlatformStopRouteNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlatformStopRouteNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlatformStopRouteNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlatformStopRouteNotify.PARSER, input);
        }
        
        public static PlatformStopRouteNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlatformStopRouteNotify.PARSER, input, extensionRegistry);
        }
        
        public static PlatformStopRouteNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlatformStopRouteNotify.PARSER, input);
        }
        
        public static PlatformStopRouteNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlatformStopRouteNotify.PARSER, input, extensionRegistry);
        }
        
        public static PlatformStopRouteNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlatformStopRouteNotify.PARSER, input);
        }
        
        public static PlatformStopRouteNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlatformStopRouteNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PlatformStopRouteNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PlatformStopRouteNotify prototype) {
            return PlatformStopRouteNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PlatformStopRouteNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PlatformStopRouteNotify getDefaultInstance() {
            return PlatformStopRouteNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<PlatformStopRouteNotify> parser() {
            return PlatformStopRouteNotify.PARSER;
        }
        
        @Override
        public Parser<PlatformStopRouteNotify> getParserForType() {
            return PlatformStopRouteNotify.PARSER;
        }
        
        @Override
        public PlatformStopRouteNotify getDefaultInstanceForType() {
            return PlatformStopRouteNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PlatformStopRouteNotify();
            PARSER = new AbstractParser<PlatformStopRouteNotify>() {
                @Override
                public PlatformStopRouteNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PlatformStopRouteNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlatformStopRouteNotifyOrBuilder
        {
            private int sceneTime_;
            private int entityId_;
            private PlatformInfoOuterClass.PlatformInfo platform_;
            private SingleFieldBuilderV3<PlatformInfoOuterClass.PlatformInfo, PlatformInfoOuterClass.PlatformInfo.Builder, PlatformInfoOuterClass.PlatformInfoOrBuilder> platformBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PlatformStopRouteNotifyOuterClass.internal_static_PlatformStopRouteNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PlatformStopRouteNotifyOuterClass.internal_static_PlatformStopRouteNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(PlatformStopRouteNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PlatformStopRouteNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.sceneTime_ = 0;
                this.entityId_ = 0;
                if (this.platformBuilder_ == null) {
                    this.platform_ = null;
                }
                else {
                    this.platform_ = null;
                    this.platformBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PlatformStopRouteNotifyOuterClass.internal_static_PlatformStopRouteNotify_descriptor;
            }
            
            @Override
            public PlatformStopRouteNotify getDefaultInstanceForType() {
                return PlatformStopRouteNotify.getDefaultInstance();
            }
            
            @Override
            public PlatformStopRouteNotify build() {
                final PlatformStopRouteNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PlatformStopRouteNotify buildPartial() {
                final PlatformStopRouteNotify result = new PlatformStopRouteNotify(this);
                result.sceneTime_ = this.sceneTime_;
                result.entityId_ = this.entityId_;
                if (this.platformBuilder_ == null) {
                    result.platform_ = this.platform_;
                }
                else {
                    result.platform_ = this.platformBuilder_.build();
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
                if (other instanceof PlatformStopRouteNotify) {
                    return this.mergeFrom((PlatformStopRouteNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PlatformStopRouteNotify other) {
                if (other == PlatformStopRouteNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getSceneTime() != 0) {
                    this.setSceneTime(other.getSceneTime());
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
                }
                if (other.hasPlatform()) {
                    this.mergePlatform(other.getPlatform());
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
                PlatformStopRouteNotify parsedMessage = null;
                try {
                    parsedMessage = PlatformStopRouteNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PlatformStopRouteNotify)e.getUnfinishedMessage();
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
            public int getSceneTime() {
                return this.sceneTime_;
            }
            
            public Builder setSceneTime(final int value) {
                this.sceneTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSceneTime() {
                this.sceneTime_ = 0;
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
            public boolean hasPlatform() {
                return this.platformBuilder_ != null || this.platform_ != null;
            }
            
            @Override
            public PlatformInfoOuterClass.PlatformInfo getPlatform() {
                if (this.platformBuilder_ == null) {
                    return (this.platform_ == null) ? PlatformInfoOuterClass.PlatformInfo.getDefaultInstance() : this.platform_;
                }
                return this.platformBuilder_.getMessage();
            }
            
            public Builder setPlatform(final PlatformInfoOuterClass.PlatformInfo value) {
                if (this.platformBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.platform_ = value;
                    this.onChanged();
                }
                else {
                    this.platformBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setPlatform(final PlatformInfoOuterClass.PlatformInfo.Builder builderForValue) {
                if (this.platformBuilder_ == null) {
                    this.platform_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.platformBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergePlatform(final PlatformInfoOuterClass.PlatformInfo value) {
                if (this.platformBuilder_ == null) {
                    if (this.platform_ != null) {
                        this.platform_ = PlatformInfoOuterClass.PlatformInfo.newBuilder(this.platform_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.platform_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.platformBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearPlatform() {
                if (this.platformBuilder_ == null) {
                    this.platform_ = null;
                    this.onChanged();
                }
                else {
                    this.platform_ = null;
                    this.platformBuilder_ = null;
                }
                return this;
            }
            
            public PlatformInfoOuterClass.PlatformInfo.Builder getPlatformBuilder() {
                this.onChanged();
                return this.getPlatformFieldBuilder().getBuilder();
            }
            
            @Override
            public PlatformInfoOuterClass.PlatformInfoOrBuilder getPlatformOrBuilder() {
                if (this.platformBuilder_ != null) {
                    return this.platformBuilder_.getMessageOrBuilder();
                }
                return (this.platform_ == null) ? PlatformInfoOuterClass.PlatformInfo.getDefaultInstance() : this.platform_;
            }
            
            private SingleFieldBuilderV3<PlatformInfoOuterClass.PlatformInfo, PlatformInfoOuterClass.PlatformInfo.Builder, PlatformInfoOuterClass.PlatformInfoOrBuilder> getPlatformFieldBuilder() {
                if (this.platformBuilder_ == null) {
                    this.platformBuilder_ = new SingleFieldBuilderV3<PlatformInfoOuterClass.PlatformInfo, PlatformInfoOuterClass.PlatformInfo.Builder, PlatformInfoOuterClass.PlatformInfoOrBuilder>(this.getPlatform(), this.getParentForChildren(), this.isClean());
                    this.platform_ = null;
                }
                return this.platformBuilder_;
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
    
    public interface PlatformStopRouteNotifyOrBuilder extends MessageOrBuilder
    {
        int getSceneTime();
        
        int getEntityId();
        
        boolean hasPlatform();
        
        PlatformInfoOuterClass.PlatformInfo getPlatform();
        
        PlatformInfoOuterClass.PlatformInfoOrBuilder getPlatformOrBuilder();
    }
}
