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

public final class AvatarExcelInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_AvatarExcelInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarExcelInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AvatarExcelInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AvatarExcelInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015AvatarExcelInfo.proto\"«\u0001\n\u000fAvatarExcelInfo\u0012\u0018\n\u0010prefab_path_hash\u0018\u0001 \u0001(\u0004\u0012\u001f\n\u0017prefab_path_remote_hash\u0018\u0002 \u0001(\u0004\u0012\u001c\n\u0014controller_path_hash\u0018\u0003 \u0001(\u0004\u0012#\n\u001bcontroller_path_remote_hash\u0018\u0004 \u0001(\u0004\u0012\u001a\n\u0012combat_config_hash\u0018\u0005 \u0001(\u0004B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AvatarExcelInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AvatarExcelInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AvatarExcelInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarExcelInfoOuterClass.internal_static_AvatarExcelInfo_descriptor, new String[] { "PrefabPathHash", "PrefabPathRemoteHash", "ControllerPathHash", "ControllerPathRemoteHash", "CombatConfigHash" });
    }
    
    public static final class AvatarExcelInfo extends GeneratedMessageV3 implements AvatarExcelInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int PREFAB_PATH_HASH_FIELD_NUMBER = 1;
        private long prefabPathHash_;
        public static final int PREFAB_PATH_REMOTE_HASH_FIELD_NUMBER = 2;
        private long prefabPathRemoteHash_;
        public static final int CONTROLLER_PATH_HASH_FIELD_NUMBER = 3;
        private long controllerPathHash_;
        public static final int CONTROLLER_PATH_REMOTE_HASH_FIELD_NUMBER = 4;
        private long controllerPathRemoteHash_;
        public static final int COMBAT_CONFIG_HASH_FIELD_NUMBER = 5;
        private long combatConfigHash_;
        private byte memoizedIsInitialized;
        private static final AvatarExcelInfo DEFAULT_INSTANCE;
        private static final Parser<AvatarExcelInfo> PARSER;
        
        private AvatarExcelInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AvatarExcelInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AvatarExcelInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AvatarExcelInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.prefabPathHash_ = input.readUInt64();
                            continue;
                        }
                        case 16: {
                            this.prefabPathRemoteHash_ = input.readUInt64();
                            continue;
                        }
                        case 24: {
                            this.controllerPathHash_ = input.readUInt64();
                            continue;
                        }
                        case 32: {
                            this.controllerPathRemoteHash_ = input.readUInt64();
                            continue;
                        }
                        case 40: {
                            this.combatConfigHash_ = input.readUInt64();
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
            return AvatarExcelInfoOuterClass.internal_static_AvatarExcelInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AvatarExcelInfoOuterClass.internal_static_AvatarExcelInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarExcelInfo.class, Builder.class);
        }
        
        @Override
        public long getPrefabPathHash() {
            return this.prefabPathHash_;
        }
        
        @Override
        public long getPrefabPathRemoteHash() {
            return this.prefabPathRemoteHash_;
        }
        
        @Override
        public long getControllerPathHash() {
            return this.controllerPathHash_;
        }
        
        @Override
        public long getControllerPathRemoteHash() {
            return this.controllerPathRemoteHash_;
        }
        
        @Override
        public long getCombatConfigHash() {
            return this.combatConfigHash_;
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
            if (this.prefabPathHash_ != 0L) {
                output.writeUInt64(1, this.prefabPathHash_);
            }
            if (this.prefabPathRemoteHash_ != 0L) {
                output.writeUInt64(2, this.prefabPathRemoteHash_);
            }
            if (this.controllerPathHash_ != 0L) {
                output.writeUInt64(3, this.controllerPathHash_);
            }
            if (this.controllerPathRemoteHash_ != 0L) {
                output.writeUInt64(4, this.controllerPathRemoteHash_);
            }
            if (this.combatConfigHash_ != 0L) {
                output.writeUInt64(5, this.combatConfigHash_);
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
            if (this.prefabPathHash_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(1, this.prefabPathHash_);
            }
            if (this.prefabPathRemoteHash_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(2, this.prefabPathRemoteHash_);
            }
            if (this.controllerPathHash_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(3, this.controllerPathHash_);
            }
            if (this.controllerPathRemoteHash_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(4, this.controllerPathRemoteHash_);
            }
            if (this.combatConfigHash_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(5, this.combatConfigHash_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarExcelInfo)) {
                return super.equals(obj);
            }
            final AvatarExcelInfo other = (AvatarExcelInfo)obj;
            return this.getPrefabPathHash() == other.getPrefabPathHash() && this.getPrefabPathRemoteHash() == other.getPrefabPathRemoteHash() && this.getControllerPathHash() == other.getControllerPathHash() && this.getControllerPathRemoteHash() == other.getControllerPathRemoteHash() && this.getCombatConfigHash() == other.getCombatConfigHash() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + Internal.hashLong(this.getPrefabPathHash());
            hash = 37 * hash + 2;
            hash = 53 * hash + Internal.hashLong(this.getPrefabPathRemoteHash());
            hash = 37 * hash + 3;
            hash = 53 * hash + Internal.hashLong(this.getControllerPathHash());
            hash = 37 * hash + 4;
            hash = 53 * hash + Internal.hashLong(this.getControllerPathRemoteHash());
            hash = 37 * hash + 5;
            hash = 53 * hash + Internal.hashLong(this.getCombatConfigHash());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AvatarExcelInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AvatarExcelInfo.PARSER.parseFrom(data);
        }
        
        public static AvatarExcelInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarExcelInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarExcelInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AvatarExcelInfo.PARSER.parseFrom(data);
        }
        
        public static AvatarExcelInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarExcelInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarExcelInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AvatarExcelInfo.PARSER.parseFrom(data);
        }
        
        public static AvatarExcelInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarExcelInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarExcelInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExcelInfo.PARSER, input);
        }
        
        public static AvatarExcelInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExcelInfo.PARSER, input, extensionRegistry);
        }
        
        public static AvatarExcelInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarExcelInfo.PARSER, input);
        }
        
        public static AvatarExcelInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarExcelInfo.PARSER, input, extensionRegistry);
        }
        
        public static AvatarExcelInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExcelInfo.PARSER, input);
        }
        
        public static AvatarExcelInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExcelInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AvatarExcelInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AvatarExcelInfo prototype) {
            return AvatarExcelInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AvatarExcelInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AvatarExcelInfo getDefaultInstance() {
            return AvatarExcelInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<AvatarExcelInfo> parser() {
            return AvatarExcelInfo.PARSER;
        }
        
        @Override
        public Parser<AvatarExcelInfo> getParserForType() {
            return AvatarExcelInfo.PARSER;
        }
        
        @Override
        public AvatarExcelInfo getDefaultInstanceForType() {
            return AvatarExcelInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AvatarExcelInfo();
            PARSER = new AbstractParser<AvatarExcelInfo>() {
                @Override
                public AvatarExcelInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AvatarExcelInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AvatarExcelInfoOrBuilder
        {
            private long prefabPathHash_;
            private long prefabPathRemoteHash_;
            private long controllerPathHash_;
            private long controllerPathRemoteHash_;
            private long combatConfigHash_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AvatarExcelInfoOuterClass.internal_static_AvatarExcelInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AvatarExcelInfoOuterClass.internal_static_AvatarExcelInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarExcelInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AvatarExcelInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.prefabPathHash_ = 0L;
                this.prefabPathRemoteHash_ = 0L;
                this.controllerPathHash_ = 0L;
                this.controllerPathRemoteHash_ = 0L;
                this.combatConfigHash_ = 0L;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AvatarExcelInfoOuterClass.internal_static_AvatarExcelInfo_descriptor;
            }
            
            @Override
            public AvatarExcelInfo getDefaultInstanceForType() {
                return AvatarExcelInfo.getDefaultInstance();
            }
            
            @Override
            public AvatarExcelInfo build() {
                final AvatarExcelInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AvatarExcelInfo buildPartial() {
                final AvatarExcelInfo result = new AvatarExcelInfo(this);
                result.prefabPathHash_ = this.prefabPathHash_;
                result.prefabPathRemoteHash_ = this.prefabPathRemoteHash_;
                result.controllerPathHash_ = this.controllerPathHash_;
                result.controllerPathRemoteHash_ = this.controllerPathRemoteHash_;
                result.combatConfigHash_ = this.combatConfigHash_;
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
                if (other instanceof AvatarExcelInfo) {
                    return this.mergeFrom((AvatarExcelInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AvatarExcelInfo other) {
                if (other == AvatarExcelInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getPrefabPathHash() != 0L) {
                    this.setPrefabPathHash(other.getPrefabPathHash());
                }
                if (other.getPrefabPathRemoteHash() != 0L) {
                    this.setPrefabPathRemoteHash(other.getPrefabPathRemoteHash());
                }
                if (other.getControllerPathHash() != 0L) {
                    this.setControllerPathHash(other.getControllerPathHash());
                }
                if (other.getControllerPathRemoteHash() != 0L) {
                    this.setControllerPathRemoteHash(other.getControllerPathRemoteHash());
                }
                if (other.getCombatConfigHash() != 0L) {
                    this.setCombatConfigHash(other.getCombatConfigHash());
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
                AvatarExcelInfo parsedMessage = null;
                try {
                    parsedMessage = AvatarExcelInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AvatarExcelInfo)e.getUnfinishedMessage();
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
            public long getPrefabPathHash() {
                return this.prefabPathHash_;
            }
            
            public Builder setPrefabPathHash(final long value) {
                this.prefabPathHash_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPrefabPathHash() {
                this.prefabPathHash_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public long getPrefabPathRemoteHash() {
                return this.prefabPathRemoteHash_;
            }
            
            public Builder setPrefabPathRemoteHash(final long value) {
                this.prefabPathRemoteHash_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPrefabPathRemoteHash() {
                this.prefabPathRemoteHash_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public long getControllerPathHash() {
                return this.controllerPathHash_;
            }
            
            public Builder setControllerPathHash(final long value) {
                this.controllerPathHash_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearControllerPathHash() {
                this.controllerPathHash_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public long getControllerPathRemoteHash() {
                return this.controllerPathRemoteHash_;
            }
            
            public Builder setControllerPathRemoteHash(final long value) {
                this.controllerPathRemoteHash_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearControllerPathRemoteHash() {
                this.controllerPathRemoteHash_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public long getCombatConfigHash() {
                return this.combatConfigHash_;
            }
            
            public Builder setCombatConfigHash(final long value) {
                this.combatConfigHash_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCombatConfigHash() {
                this.combatConfigHash_ = 0L;
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
    
    public interface AvatarExcelInfoOrBuilder extends MessageOrBuilder
    {
        long getPrefabPathHash();
        
        long getPrefabPathRemoteHash();
        
        long getControllerPathHash();
        
        long getControllerPathRemoteHash();
        
        long getCombatConfigHash();
    }
}
