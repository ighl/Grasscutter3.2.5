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

public final class EntityClientDataOuterClass
{
    private static final Descriptors.Descriptor internal_static_EntityClientData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EntityClientData_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private EntityClientDataOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return EntityClientDataOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016EntityClientData.proto\"q\n\u0010EntityClientData\u0012\u001e\n\u0016wind_change_scene_time\u0018\u0001 \u0001(\r\u0012\u001b\n\u0013windmill_sync_angle\u0018\u0002 \u0001(\u0002\u0012 \n\u0018wind_change_target_level\u0018\u0003 \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        EntityClientDataOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_EntityClientData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_EntityClientData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(EntityClientDataOuterClass.internal_static_EntityClientData_descriptor, new String[] { "WindChangeSceneTime", "WindmillSyncAngle", "WindChangeTargetLevel" });
    }
    
    public static final class EntityClientData extends GeneratedMessageV3 implements EntityClientDataOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int WIND_CHANGE_SCENE_TIME_FIELD_NUMBER = 1;
        private int windChangeSceneTime_;
        public static final int WINDMILL_SYNC_ANGLE_FIELD_NUMBER = 2;
        private float windmillSyncAngle_;
        public static final int WIND_CHANGE_TARGET_LEVEL_FIELD_NUMBER = 3;
        private int windChangeTargetLevel_;
        private byte memoizedIsInitialized;
        private static final EntityClientData DEFAULT_INSTANCE;
        private static final Parser<EntityClientData> PARSER;
        
        private EntityClientData(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private EntityClientData() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new EntityClientData();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private EntityClientData(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.windChangeSceneTime_ = input.readUInt32();
                            continue;
                        }
                        case 21: {
                            this.windmillSyncAngle_ = input.readFloat();
                            continue;
                        }
                        case 24: {
                            this.windChangeTargetLevel_ = input.readInt32();
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
            return EntityClientDataOuterClass.internal_static_EntityClientData_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return EntityClientDataOuterClass.internal_static_EntityClientData_fieldAccessorTable.ensureFieldAccessorsInitialized(EntityClientData.class, Builder.class);
        }
        
        @Override
        public int getWindChangeSceneTime() {
            return this.windChangeSceneTime_;
        }
        
        @Override
        public float getWindmillSyncAngle() {
            return this.windmillSyncAngle_;
        }
        
        @Override
        public int getWindChangeTargetLevel() {
            return this.windChangeTargetLevel_;
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
            if (this.windChangeSceneTime_ != 0) {
                output.writeUInt32(1, this.windChangeSceneTime_);
            }
            if (this.windmillSyncAngle_ != 0.0f) {
                output.writeFloat(2, this.windmillSyncAngle_);
            }
            if (this.windChangeTargetLevel_ != 0) {
                output.writeInt32(3, this.windChangeTargetLevel_);
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
            if (this.windChangeSceneTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.windChangeSceneTime_);
            }
            if (this.windmillSyncAngle_ != 0.0f) {
                size += CodedOutputStream.computeFloatSize(2, this.windmillSyncAngle_);
            }
            if (this.windChangeTargetLevel_ != 0) {
                size += CodedOutputStream.computeInt32Size(3, this.windChangeTargetLevel_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EntityClientData)) {
                return super.equals(obj);
            }
            final EntityClientData other = (EntityClientData)obj;
            return this.getWindChangeSceneTime() == other.getWindChangeSceneTime() && Float.floatToIntBits(this.getWindmillSyncAngle()) == Float.floatToIntBits(other.getWindmillSyncAngle()) && this.getWindChangeTargetLevel() == other.getWindChangeTargetLevel() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getWindChangeSceneTime();
            hash = 37 * hash + 2;
            hash = 53 * hash + Float.floatToIntBits(this.getWindmillSyncAngle());
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getWindChangeTargetLevel();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static EntityClientData parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return EntityClientData.PARSER.parseFrom(data);
        }
        
        public static EntityClientData parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EntityClientData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EntityClientData parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return EntityClientData.PARSER.parseFrom(data);
        }
        
        public static EntityClientData parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EntityClientData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EntityClientData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return EntityClientData.PARSER.parseFrom(data);
        }
        
        public static EntityClientData parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EntityClientData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EntityClientData parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityClientData.PARSER, input);
        }
        
        public static EntityClientData parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityClientData.PARSER, input, extensionRegistry);
        }
        
        public static EntityClientData parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EntityClientData.PARSER, input);
        }
        
        public static EntityClientData parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EntityClientData.PARSER, input, extensionRegistry);
        }
        
        public static EntityClientData parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityClientData.PARSER, input);
        }
        
        public static EntityClientData parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityClientData.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return EntityClientData.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final EntityClientData prototype) {
            return EntityClientData.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == EntityClientData.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static EntityClientData getDefaultInstance() {
            return EntityClientData.DEFAULT_INSTANCE;
        }
        
        public static Parser<EntityClientData> parser() {
            return EntityClientData.PARSER;
        }
        
        @Override
        public Parser<EntityClientData> getParserForType() {
            return EntityClientData.PARSER;
        }
        
        @Override
        public EntityClientData getDefaultInstanceForType() {
            return EntityClientData.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new EntityClientData();
            PARSER = new AbstractParser<EntityClientData>() {
                @Override
                public EntityClientData parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new EntityClientData(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EntityClientDataOrBuilder
        {
            private int windChangeSceneTime_;
            private float windmillSyncAngle_;
            private int windChangeTargetLevel_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return EntityClientDataOuterClass.internal_static_EntityClientData_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return EntityClientDataOuterClass.internal_static_EntityClientData_fieldAccessorTable.ensureFieldAccessorsInitialized(EntityClientData.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (EntityClientData.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.windChangeSceneTime_ = 0;
                this.windmillSyncAngle_ = 0.0f;
                this.windChangeTargetLevel_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return EntityClientDataOuterClass.internal_static_EntityClientData_descriptor;
            }
            
            @Override
            public EntityClientData getDefaultInstanceForType() {
                return EntityClientData.getDefaultInstance();
            }
            
            @Override
            public EntityClientData build() {
                final EntityClientData result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public EntityClientData buildPartial() {
                final EntityClientData result = new EntityClientData(this);
                result.windChangeSceneTime_ = this.windChangeSceneTime_;
                result.windmillSyncAngle_ = this.windmillSyncAngle_;
                result.windChangeTargetLevel_ = this.windChangeTargetLevel_;
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
                if (other instanceof EntityClientData) {
                    return this.mergeFrom((EntityClientData)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final EntityClientData other) {
                if (other == EntityClientData.getDefaultInstance()) {
                    return this;
                }
                if (other.getWindChangeSceneTime() != 0) {
                    this.setWindChangeSceneTime(other.getWindChangeSceneTime());
                }
                if (other.getWindmillSyncAngle() != 0.0f) {
                    this.setWindmillSyncAngle(other.getWindmillSyncAngle());
                }
                if (other.getWindChangeTargetLevel() != 0) {
                    this.setWindChangeTargetLevel(other.getWindChangeTargetLevel());
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
                EntityClientData parsedMessage = null;
                try {
                    parsedMessage = EntityClientData.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (EntityClientData)e.getUnfinishedMessage();
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
            public int getWindChangeSceneTime() {
                return this.windChangeSceneTime_;
            }
            
            public Builder setWindChangeSceneTime(final int value) {
                this.windChangeSceneTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearWindChangeSceneTime() {
                this.windChangeSceneTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public float getWindmillSyncAngle() {
                return this.windmillSyncAngle_;
            }
            
            public Builder setWindmillSyncAngle(final float value) {
                this.windmillSyncAngle_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearWindmillSyncAngle() {
                this.windmillSyncAngle_ = 0.0f;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getWindChangeTargetLevel() {
                return this.windChangeTargetLevel_;
            }
            
            public Builder setWindChangeTargetLevel(final int value) {
                this.windChangeTargetLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearWindChangeTargetLevel() {
                this.windChangeTargetLevel_ = 0;
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
    
    public interface EntityClientDataOrBuilder extends MessageOrBuilder
    {
        int getWindChangeSceneTime();
        
        float getWindmillSyncAngle();
        
        int getWindChangeTargetLevel();
    }
}
