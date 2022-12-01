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

public final class EntityMoveInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_EntityMoveInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EntityMoveInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private EntityMoveInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return EntityMoveInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0014EntityMoveInfo.proto\u001a\u0010MotionInfo.proto\"\u0084\u0001\n\u000eEntityMoveInfo\u0012\u0011\n\tentity_id\u0018\u0001 \u0001(\r\u0012 \n\u000bmotion_info\u0018\u0002 \u0001(\u000b2\u000b.MotionInfo\u0012\u0012\n\nscene_time\u0018\u0003 \u0001(\r\u0012\u0014\n\freliable_seq\u0018\u0004 \u0001(\r\u0012\u0013\n\u000bis_reliable\u0018\u0005 \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        EntityMoveInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { MotionInfoOuterClass.getDescriptor() });
        internal_static_EntityMoveInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_EntityMoveInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(EntityMoveInfoOuterClass.internal_static_EntityMoveInfo_descriptor, new String[] { "EntityId", "MotionInfo", "SceneTime", "ReliableSeq", "IsReliable" });
        MotionInfoOuterClass.getDescriptor();
    }
    
    public static final class EntityMoveInfo extends GeneratedMessageV3 implements EntityMoveInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ENTITY_ID_FIELD_NUMBER = 1;
        private int entityId_;
        public static final int MOTION_INFO_FIELD_NUMBER = 2;
        private MotionInfoOuterClass.MotionInfo motionInfo_;
        public static final int SCENE_TIME_FIELD_NUMBER = 3;
        private int sceneTime_;
        public static final int RELIABLE_SEQ_FIELD_NUMBER = 4;
        private int reliableSeq_;
        public static final int IS_RELIABLE_FIELD_NUMBER = 5;
        private boolean isReliable_;
        private byte memoizedIsInitialized;
        private static final EntityMoveInfo DEFAULT_INSTANCE;
        private static final Parser<EntityMoveInfo> PARSER;
        
        private EntityMoveInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private EntityMoveInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new EntityMoveInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private EntityMoveInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.entityId_ = input.readUInt32();
                            continue;
                        }
                        case 18: {
                            MotionInfoOuterClass.MotionInfo.Builder subBuilder = null;
                            if (this.motionInfo_ != null) {
                                subBuilder = this.motionInfo_.toBuilder();
                            }
                            this.motionInfo_ = input.readMessage(MotionInfoOuterClass.MotionInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.motionInfo_);
                                this.motionInfo_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 24: {
                            this.sceneTime_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.reliableSeq_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.isReliable_ = input.readBool();
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
            return EntityMoveInfoOuterClass.internal_static_EntityMoveInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return EntityMoveInfoOuterClass.internal_static_EntityMoveInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(EntityMoveInfo.class, Builder.class);
        }
        
        @Override
        public int getEntityId() {
            return this.entityId_;
        }
        
        @Override
        public boolean hasMotionInfo() {
            return this.motionInfo_ != null;
        }
        
        @Override
        public MotionInfoOuterClass.MotionInfo getMotionInfo() {
            return (this.motionInfo_ == null) ? MotionInfoOuterClass.MotionInfo.getDefaultInstance() : this.motionInfo_;
        }
        
        @Override
        public MotionInfoOuterClass.MotionInfoOrBuilder getMotionInfoOrBuilder() {
            return this.getMotionInfo();
        }
        
        @Override
        public int getSceneTime() {
            return this.sceneTime_;
        }
        
        @Override
        public int getReliableSeq() {
            return this.reliableSeq_;
        }
        
        @Override
        public boolean getIsReliable() {
            return this.isReliable_;
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
            if (this.entityId_ != 0) {
                output.writeUInt32(1, this.entityId_);
            }
            if (this.motionInfo_ != null) {
                output.writeMessage(2, this.getMotionInfo());
            }
            if (this.sceneTime_ != 0) {
                output.writeUInt32(3, this.sceneTime_);
            }
            if (this.reliableSeq_ != 0) {
                output.writeUInt32(4, this.reliableSeq_);
            }
            if (this.isReliable_) {
                output.writeBool(5, this.isReliable_);
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
            if (this.entityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.entityId_);
            }
            if (this.motionInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(2, this.getMotionInfo());
            }
            if (this.sceneTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.sceneTime_);
            }
            if (this.reliableSeq_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.reliableSeq_);
            }
            if (this.isReliable_) {
                size += CodedOutputStream.computeBoolSize(5, this.isReliable_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EntityMoveInfo)) {
                return super.equals(obj);
            }
            final EntityMoveInfo other = (EntityMoveInfo)obj;
            return this.getEntityId() == other.getEntityId() && this.hasMotionInfo() == other.hasMotionInfo() && (!this.hasMotionInfo() || this.getMotionInfo().equals(other.getMotionInfo())) && this.getSceneTime() == other.getSceneTime() && this.getReliableSeq() == other.getReliableSeq() && this.getIsReliable() == other.getIsReliable() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getEntityId();
            if (this.hasMotionInfo()) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getMotionInfo().hashCode();
            }
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getSceneTime();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getReliableSeq();
            hash = 37 * hash + 5;
            hash = 53 * hash + Internal.hashBoolean(this.getIsReliable());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static EntityMoveInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return EntityMoveInfo.PARSER.parseFrom(data);
        }
        
        public static EntityMoveInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EntityMoveInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EntityMoveInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return EntityMoveInfo.PARSER.parseFrom(data);
        }
        
        public static EntityMoveInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EntityMoveInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EntityMoveInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return EntityMoveInfo.PARSER.parseFrom(data);
        }
        
        public static EntityMoveInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EntityMoveInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EntityMoveInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityMoveInfo.PARSER, input);
        }
        
        public static EntityMoveInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityMoveInfo.PARSER, input, extensionRegistry);
        }
        
        public static EntityMoveInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EntityMoveInfo.PARSER, input);
        }
        
        public static EntityMoveInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EntityMoveInfo.PARSER, input, extensionRegistry);
        }
        
        public static EntityMoveInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityMoveInfo.PARSER, input);
        }
        
        public static EntityMoveInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityMoveInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return EntityMoveInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final EntityMoveInfo prototype) {
            return EntityMoveInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == EntityMoveInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static EntityMoveInfo getDefaultInstance() {
            return EntityMoveInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<EntityMoveInfo> parser() {
            return EntityMoveInfo.PARSER;
        }
        
        @Override
        public Parser<EntityMoveInfo> getParserForType() {
            return EntityMoveInfo.PARSER;
        }
        
        @Override
        public EntityMoveInfo getDefaultInstanceForType() {
            return EntityMoveInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new EntityMoveInfo();
            PARSER = new AbstractParser<EntityMoveInfo>() {
                @Override
                public EntityMoveInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new EntityMoveInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EntityMoveInfoOrBuilder
        {
            private int entityId_;
            private MotionInfoOuterClass.MotionInfo motionInfo_;
            private SingleFieldBuilderV3<MotionInfoOuterClass.MotionInfo, MotionInfoOuterClass.MotionInfo.Builder, MotionInfoOuterClass.MotionInfoOrBuilder> motionInfoBuilder_;
            private int sceneTime_;
            private int reliableSeq_;
            private boolean isReliable_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return EntityMoveInfoOuterClass.internal_static_EntityMoveInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return EntityMoveInfoOuterClass.internal_static_EntityMoveInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(EntityMoveInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (EntityMoveInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.entityId_ = 0;
                if (this.motionInfoBuilder_ == null) {
                    this.motionInfo_ = null;
                }
                else {
                    this.motionInfo_ = null;
                    this.motionInfoBuilder_ = null;
                }
                this.sceneTime_ = 0;
                this.reliableSeq_ = 0;
                this.isReliable_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return EntityMoveInfoOuterClass.internal_static_EntityMoveInfo_descriptor;
            }
            
            @Override
            public EntityMoveInfo getDefaultInstanceForType() {
                return EntityMoveInfo.getDefaultInstance();
            }
            
            @Override
            public EntityMoveInfo build() {
                final EntityMoveInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public EntityMoveInfo buildPartial() {
                final EntityMoveInfo result = new EntityMoveInfo(this);
                result.entityId_ = this.entityId_;
                if (this.motionInfoBuilder_ == null) {
                    result.motionInfo_ = this.motionInfo_;
                }
                else {
                    result.motionInfo_ = this.motionInfoBuilder_.build();
                }
                result.sceneTime_ = this.sceneTime_;
                result.reliableSeq_ = this.reliableSeq_;
                result.isReliable_ = this.isReliable_;
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
                if (other instanceof EntityMoveInfo) {
                    return this.mergeFrom((EntityMoveInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final EntityMoveInfo other) {
                if (other == EntityMoveInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
                }
                if (other.hasMotionInfo()) {
                    this.mergeMotionInfo(other.getMotionInfo());
                }
                if (other.getSceneTime() != 0) {
                    this.setSceneTime(other.getSceneTime());
                }
                if (other.getReliableSeq() != 0) {
                    this.setReliableSeq(other.getReliableSeq());
                }
                if (other.getIsReliable()) {
                    this.setIsReliable(other.getIsReliable());
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
                EntityMoveInfo parsedMessage = null;
                try {
                    parsedMessage = EntityMoveInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (EntityMoveInfo)e.getUnfinishedMessage();
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
            public boolean hasMotionInfo() {
                return this.motionInfoBuilder_ != null || this.motionInfo_ != null;
            }
            
            @Override
            public MotionInfoOuterClass.MotionInfo getMotionInfo() {
                if (this.motionInfoBuilder_ == null) {
                    return (this.motionInfo_ == null) ? MotionInfoOuterClass.MotionInfo.getDefaultInstance() : this.motionInfo_;
                }
                return this.motionInfoBuilder_.getMessage();
            }
            
            public Builder setMotionInfo(final MotionInfoOuterClass.MotionInfo value) {
                if (this.motionInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.motionInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.motionInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setMotionInfo(final MotionInfoOuterClass.MotionInfo.Builder builderForValue) {
                if (this.motionInfoBuilder_ == null) {
                    this.motionInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.motionInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeMotionInfo(final MotionInfoOuterClass.MotionInfo value) {
                if (this.motionInfoBuilder_ == null) {
                    if (this.motionInfo_ != null) {
                        this.motionInfo_ = MotionInfoOuterClass.MotionInfo.newBuilder(this.motionInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.motionInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.motionInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearMotionInfo() {
                if (this.motionInfoBuilder_ == null) {
                    this.motionInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.motionInfo_ = null;
                    this.motionInfoBuilder_ = null;
                }
                return this;
            }
            
            public MotionInfoOuterClass.MotionInfo.Builder getMotionInfoBuilder() {
                this.onChanged();
                return this.getMotionInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public MotionInfoOuterClass.MotionInfoOrBuilder getMotionInfoOrBuilder() {
                if (this.motionInfoBuilder_ != null) {
                    return this.motionInfoBuilder_.getMessageOrBuilder();
                }
                return (this.motionInfo_ == null) ? MotionInfoOuterClass.MotionInfo.getDefaultInstance() : this.motionInfo_;
            }
            
            private SingleFieldBuilderV3<MotionInfoOuterClass.MotionInfo, MotionInfoOuterClass.MotionInfo.Builder, MotionInfoOuterClass.MotionInfoOrBuilder> getMotionInfoFieldBuilder() {
                if (this.motionInfoBuilder_ == null) {
                    this.motionInfoBuilder_ = new SingleFieldBuilderV3<MotionInfoOuterClass.MotionInfo, MotionInfoOuterClass.MotionInfo.Builder, MotionInfoOuterClass.MotionInfoOrBuilder>(this.getMotionInfo(), this.getParentForChildren(), this.isClean());
                    this.motionInfo_ = null;
                }
                return this.motionInfoBuilder_;
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
            public int getReliableSeq() {
                return this.reliableSeq_;
            }
            
            public Builder setReliableSeq(final int value) {
                this.reliableSeq_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearReliableSeq() {
                this.reliableSeq_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsReliable() {
                return this.isReliable_;
            }
            
            public Builder setIsReliable(final boolean value) {
                this.isReliable_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsReliable() {
                this.isReliable_ = false;
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
    
    public interface EntityMoveInfoOrBuilder extends MessageOrBuilder
    {
        int getEntityId();
        
        boolean hasMotionInfo();
        
        MotionInfoOuterClass.MotionInfo getMotionInfo();
        
        MotionInfoOuterClass.MotionInfoOrBuilder getMotionInfoOrBuilder();
        
        int getSceneTime();
        
        int getReliableSeq();
        
        boolean getIsReliable();
    }
}
