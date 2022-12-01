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

public final class SceneTimeNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_SceneTimeNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SceneTimeNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SceneTimeNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SceneTimeNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015SceneTimeNotify.proto\"J\n\u000fSceneTimeNotify\u0012\u0012\n\nscene_time\u0018\u0003 \u0001(\u0004\u0012\u0011\n\tis_paused\u0018\b \u0001(\b\u0012\u0010\n\bscene_id\u0018\u0002 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SceneTimeNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_SceneTimeNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SceneTimeNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SceneTimeNotifyOuterClass.internal_static_SceneTimeNotify_descriptor, new String[] { "SceneTime", "IsPaused", "SceneId" });
    }
    
    public static final class SceneTimeNotify extends GeneratedMessageV3 implements SceneTimeNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SCENE_TIME_FIELD_NUMBER = 3;
        private long sceneTime_;
        public static final int IS_PAUSED_FIELD_NUMBER = 8;
        private boolean isPaused_;
        public static final int SCENE_ID_FIELD_NUMBER = 2;
        private int sceneId_;
        private byte memoizedIsInitialized;
        private static final SceneTimeNotify DEFAULT_INSTANCE;
        private static final Parser<SceneTimeNotify> PARSER;
        
        private SceneTimeNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SceneTimeNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SceneTimeNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SceneTimeNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.sceneId_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.sceneTime_ = input.readUInt64();
                            continue;
                        }
                        case 64: {
                            this.isPaused_ = input.readBool();
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
            return SceneTimeNotifyOuterClass.internal_static_SceneTimeNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SceneTimeNotifyOuterClass.internal_static_SceneTimeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneTimeNotify.class, Builder.class);
        }
        
        @Override
        public long getSceneTime() {
            return this.sceneTime_;
        }
        
        @Override
        public boolean getIsPaused() {
            return this.isPaused_;
        }
        
        @Override
        public int getSceneId() {
            return this.sceneId_;
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
            if (this.sceneId_ != 0) {
                output.writeUInt32(2, this.sceneId_);
            }
            if (this.sceneTime_ != 0L) {
                output.writeUInt64(3, this.sceneTime_);
            }
            if (this.isPaused_) {
                output.writeBool(8, this.isPaused_);
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
            if (this.sceneId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.sceneId_);
            }
            if (this.sceneTime_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(3, this.sceneTime_);
            }
            if (this.isPaused_) {
                size += CodedOutputStream.computeBoolSize(8, this.isPaused_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SceneTimeNotify)) {
                return super.equals(obj);
            }
            final SceneTimeNotify other = (SceneTimeNotify)obj;
            return this.getSceneTime() == other.getSceneTime() && this.getIsPaused() == other.getIsPaused() && this.getSceneId() == other.getSceneId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + Internal.hashLong(this.getSceneTime());
            hash = 37 * hash + 8;
            hash = 53 * hash + Internal.hashBoolean(this.getIsPaused());
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getSceneId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SceneTimeNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SceneTimeNotify.PARSER.parseFrom(data);
        }
        
        public static SceneTimeNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneTimeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneTimeNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SceneTimeNotify.PARSER.parseFrom(data);
        }
        
        public static SceneTimeNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneTimeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneTimeNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SceneTimeNotify.PARSER.parseFrom(data);
        }
        
        public static SceneTimeNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneTimeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneTimeNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneTimeNotify.PARSER, input);
        }
        
        public static SceneTimeNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneTimeNotify.PARSER, input, extensionRegistry);
        }
        
        public static SceneTimeNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneTimeNotify.PARSER, input);
        }
        
        public static SceneTimeNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneTimeNotify.PARSER, input, extensionRegistry);
        }
        
        public static SceneTimeNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneTimeNotify.PARSER, input);
        }
        
        public static SceneTimeNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneTimeNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SceneTimeNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SceneTimeNotify prototype) {
            return SceneTimeNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SceneTimeNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SceneTimeNotify getDefaultInstance() {
            return SceneTimeNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<SceneTimeNotify> parser() {
            return SceneTimeNotify.PARSER;
        }
        
        @Override
        public Parser<SceneTimeNotify> getParserForType() {
            return SceneTimeNotify.PARSER;
        }
        
        @Override
        public SceneTimeNotify getDefaultInstanceForType() {
            return SceneTimeNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SceneTimeNotify();
            PARSER = new AbstractParser<SceneTimeNotify>() {
                @Override
                public SceneTimeNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SceneTimeNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SceneTimeNotifyOrBuilder
        {
            private long sceneTime_;
            private boolean isPaused_;
            private int sceneId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SceneTimeNotifyOuterClass.internal_static_SceneTimeNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SceneTimeNotifyOuterClass.internal_static_SceneTimeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneTimeNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SceneTimeNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.sceneTime_ = 0L;
                this.isPaused_ = false;
                this.sceneId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SceneTimeNotifyOuterClass.internal_static_SceneTimeNotify_descriptor;
            }
            
            @Override
            public SceneTimeNotify getDefaultInstanceForType() {
                return SceneTimeNotify.getDefaultInstance();
            }
            
            @Override
            public SceneTimeNotify build() {
                final SceneTimeNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SceneTimeNotify buildPartial() {
                final SceneTimeNotify result = new SceneTimeNotify(this);
                result.sceneTime_ = this.sceneTime_;
                result.isPaused_ = this.isPaused_;
                result.sceneId_ = this.sceneId_;
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
                if (other instanceof SceneTimeNotify) {
                    return this.mergeFrom((SceneTimeNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SceneTimeNotify other) {
                if (other == SceneTimeNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getSceneTime() != 0L) {
                    this.setSceneTime(other.getSceneTime());
                }
                if (other.getIsPaused()) {
                    this.setIsPaused(other.getIsPaused());
                }
                if (other.getSceneId() != 0) {
                    this.setSceneId(other.getSceneId());
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
                SceneTimeNotify parsedMessage = null;
                try {
                    parsedMessage = SceneTimeNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SceneTimeNotify)e.getUnfinishedMessage();
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
            public long getSceneTime() {
                return this.sceneTime_;
            }
            
            public Builder setSceneTime(final long value) {
                this.sceneTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSceneTime() {
                this.sceneTime_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsPaused() {
                return this.isPaused_;
            }
            
            public Builder setIsPaused(final boolean value) {
                this.isPaused_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsPaused() {
                this.isPaused_ = false;
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface SceneTimeNotifyOrBuilder extends MessageOrBuilder
    {
        long getSceneTime();
        
        boolean getIsPaused();
        
        int getSceneId();
    }
}
