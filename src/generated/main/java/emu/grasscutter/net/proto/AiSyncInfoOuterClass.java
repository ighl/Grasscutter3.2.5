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

public final class AiSyncInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_AiSyncInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AiSyncInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AiSyncInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AiSyncInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0010AiSyncInfo.proto\"T\n\nAiSyncInfo\u0012\u0017\n\u000fis_self_killing\u0018\u0004 \u0001(\b\u0012\u001a\n\u0012has_path_to_target\u0018\b \u0001(\b\u0012\u0011\n\tentity_id\u0018\t \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AiSyncInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AiSyncInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AiSyncInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AiSyncInfoOuterClass.internal_static_AiSyncInfo_descriptor, new String[] { "IsSelfKilling", "HasPathToTarget", "EntityId" });
    }
    
    public static final class AiSyncInfo extends GeneratedMessageV3 implements AiSyncInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int IS_SELF_KILLING_FIELD_NUMBER = 4;
        private boolean isSelfKilling_;
        public static final int HAS_PATH_TO_TARGET_FIELD_NUMBER = 8;
        private boolean hasPathToTarget_;
        public static final int ENTITY_ID_FIELD_NUMBER = 9;
        private int entityId_;
        private byte memoizedIsInitialized;
        private static final AiSyncInfo DEFAULT_INSTANCE;
        private static final Parser<AiSyncInfo> PARSER;
        
        private AiSyncInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AiSyncInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AiSyncInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AiSyncInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.isSelfKilling_ = input.readBool();
                            continue;
                        }
                        case 64: {
                            this.hasPathToTarget_ = input.readBool();
                            continue;
                        }
                        case 72: {
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
            return AiSyncInfoOuterClass.internal_static_AiSyncInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AiSyncInfoOuterClass.internal_static_AiSyncInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AiSyncInfo.class, Builder.class);
        }
        
        @Override
        public boolean getIsSelfKilling() {
            return this.isSelfKilling_;
        }
        
        @Override
        public boolean getHasPathToTarget() {
            return this.hasPathToTarget_;
        }
        
        @Override
        public int getEntityId() {
            return this.entityId_;
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
            if (this.isSelfKilling_) {
                output.writeBool(4, this.isSelfKilling_);
            }
            if (this.hasPathToTarget_) {
                output.writeBool(8, this.hasPathToTarget_);
            }
            if (this.entityId_ != 0) {
                output.writeUInt32(9, this.entityId_);
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
            if (this.isSelfKilling_) {
                size += CodedOutputStream.computeBoolSize(4, this.isSelfKilling_);
            }
            if (this.hasPathToTarget_) {
                size += CodedOutputStream.computeBoolSize(8, this.hasPathToTarget_);
            }
            if (this.entityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.entityId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AiSyncInfo)) {
                return super.equals(obj);
            }
            final AiSyncInfo other = (AiSyncInfo)obj;
            return this.getIsSelfKilling() == other.getIsSelfKilling() && this.getHasPathToTarget() == other.getHasPathToTarget() && this.getEntityId() == other.getEntityId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 4;
            hash = 53 * hash + Internal.hashBoolean(this.getIsSelfKilling());
            hash = 37 * hash + 8;
            hash = 53 * hash + Internal.hashBoolean(this.getHasPathToTarget());
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getEntityId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AiSyncInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AiSyncInfo.PARSER.parseFrom(data);
        }
        
        public static AiSyncInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AiSyncInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AiSyncInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AiSyncInfo.PARSER.parseFrom(data);
        }
        
        public static AiSyncInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AiSyncInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AiSyncInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AiSyncInfo.PARSER.parseFrom(data);
        }
        
        public static AiSyncInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AiSyncInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AiSyncInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AiSyncInfo.PARSER, input);
        }
        
        public static AiSyncInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AiSyncInfo.PARSER, input, extensionRegistry);
        }
        
        public static AiSyncInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AiSyncInfo.PARSER, input);
        }
        
        public static AiSyncInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AiSyncInfo.PARSER, input, extensionRegistry);
        }
        
        public static AiSyncInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AiSyncInfo.PARSER, input);
        }
        
        public static AiSyncInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AiSyncInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AiSyncInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AiSyncInfo prototype) {
            return AiSyncInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AiSyncInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AiSyncInfo getDefaultInstance() {
            return AiSyncInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<AiSyncInfo> parser() {
            return AiSyncInfo.PARSER;
        }
        
        @Override
        public Parser<AiSyncInfo> getParserForType() {
            return AiSyncInfo.PARSER;
        }
        
        @Override
        public AiSyncInfo getDefaultInstanceForType() {
            return AiSyncInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AiSyncInfo();
            PARSER = new AbstractParser<AiSyncInfo>() {
                @Override
                public AiSyncInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AiSyncInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AiSyncInfoOrBuilder
        {
            private boolean isSelfKilling_;
            private boolean hasPathToTarget_;
            private int entityId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AiSyncInfoOuterClass.internal_static_AiSyncInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AiSyncInfoOuterClass.internal_static_AiSyncInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AiSyncInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AiSyncInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.isSelfKilling_ = false;
                this.hasPathToTarget_ = false;
                this.entityId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AiSyncInfoOuterClass.internal_static_AiSyncInfo_descriptor;
            }
            
            @Override
            public AiSyncInfo getDefaultInstanceForType() {
                return AiSyncInfo.getDefaultInstance();
            }
            
            @Override
            public AiSyncInfo build() {
                final AiSyncInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AiSyncInfo buildPartial() {
                final AiSyncInfo result = new AiSyncInfo(this);
                result.isSelfKilling_ = this.isSelfKilling_;
                result.hasPathToTarget_ = this.hasPathToTarget_;
                result.entityId_ = this.entityId_;
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
                if (other instanceof AiSyncInfo) {
                    return this.mergeFrom((AiSyncInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AiSyncInfo other) {
                if (other == AiSyncInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getIsSelfKilling()) {
                    this.setIsSelfKilling(other.getIsSelfKilling());
                }
                if (other.getHasPathToTarget()) {
                    this.setHasPathToTarget(other.getHasPathToTarget());
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
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
                AiSyncInfo parsedMessage = null;
                try {
                    parsedMessage = AiSyncInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AiSyncInfo)e.getUnfinishedMessage();
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
            public boolean getIsSelfKilling() {
                return this.isSelfKilling_;
            }
            
            public Builder setIsSelfKilling(final boolean value) {
                this.isSelfKilling_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsSelfKilling() {
                this.isSelfKilling_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getHasPathToTarget() {
                return this.hasPathToTarget_;
            }
            
            public Builder setHasPathToTarget(final boolean value) {
                this.hasPathToTarget_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearHasPathToTarget() {
                this.hasPathToTarget_ = false;
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface AiSyncInfoOrBuilder extends MessageOrBuilder
    {
        boolean getIsSelfKilling();
        
        boolean getHasPathToTarget();
        
        int getEntityId();
    }
}
