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

public final class ServerBuffOuterClass
{
    private static final Descriptors.Descriptor internal_static_ServerBuff_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ServerBuff_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ServerBuffOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ServerBuffOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0010ServerBuff.proto\"\u0091\u0001\n\nServerBuff\u0012\u0017\n\u000fserver_buff_uid\u0018\u0001 \u0001(\r\u0012\u0016\n\u000eserver_buff_id\u0018\u0002 \u0001(\r\u0012\u0018\n\u0010server_buff_type\u0018\u0003 \u0001(\r\u0012\u001d\n\u0015instanced_modifier_id\u0018\u0004 \u0001(\r\u0012\u0019\n\u0011is_modifier_added\u0018\u0005 \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ServerBuffOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ServerBuff_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ServerBuff_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ServerBuffOuterClass.internal_static_ServerBuff_descriptor, new String[] { "ServerBuffUid", "ServerBuffId", "ServerBuffType", "InstancedModifierId", "IsModifierAdded" });
    }
    
    public static final class ServerBuff extends GeneratedMessageV3 implements ServerBuffOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SERVER_BUFF_UID_FIELD_NUMBER = 1;
        private int serverBuffUid_;
        public static final int SERVER_BUFF_ID_FIELD_NUMBER = 2;
        private int serverBuffId_;
        public static final int SERVER_BUFF_TYPE_FIELD_NUMBER = 3;
        private int serverBuffType_;
        public static final int INSTANCED_MODIFIER_ID_FIELD_NUMBER = 4;
        private int instancedModifierId_;
        public static final int IS_MODIFIER_ADDED_FIELD_NUMBER = 5;
        private boolean isModifierAdded_;
        private byte memoizedIsInitialized;
        private static final ServerBuff DEFAULT_INSTANCE;
        private static final Parser<ServerBuff> PARSER;
        
        private ServerBuff(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ServerBuff() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ServerBuff();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ServerBuff(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.serverBuffUid_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.serverBuffId_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.serverBuffType_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.instancedModifierId_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.isModifierAdded_ = input.readBool();
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
            return ServerBuffOuterClass.internal_static_ServerBuff_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ServerBuffOuterClass.internal_static_ServerBuff_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerBuff.class, Builder.class);
        }
        
        @Override
        public int getServerBuffUid() {
            return this.serverBuffUid_;
        }
        
        @Override
        public int getServerBuffId() {
            return this.serverBuffId_;
        }
        
        @Override
        public int getServerBuffType() {
            return this.serverBuffType_;
        }
        
        @Override
        public int getInstancedModifierId() {
            return this.instancedModifierId_;
        }
        
        @Override
        public boolean getIsModifierAdded() {
            return this.isModifierAdded_;
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
            if (this.serverBuffUid_ != 0) {
                output.writeUInt32(1, this.serverBuffUid_);
            }
            if (this.serverBuffId_ != 0) {
                output.writeUInt32(2, this.serverBuffId_);
            }
            if (this.serverBuffType_ != 0) {
                output.writeUInt32(3, this.serverBuffType_);
            }
            if (this.instancedModifierId_ != 0) {
                output.writeUInt32(4, this.instancedModifierId_);
            }
            if (this.isModifierAdded_) {
                output.writeBool(5, this.isModifierAdded_);
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
            if (this.serverBuffUid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.serverBuffUid_);
            }
            if (this.serverBuffId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.serverBuffId_);
            }
            if (this.serverBuffType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.serverBuffType_);
            }
            if (this.instancedModifierId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.instancedModifierId_);
            }
            if (this.isModifierAdded_) {
                size += CodedOutputStream.computeBoolSize(5, this.isModifierAdded_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ServerBuff)) {
                return super.equals(obj);
            }
            final ServerBuff other = (ServerBuff)obj;
            return this.getServerBuffUid() == other.getServerBuffUid() && this.getServerBuffId() == other.getServerBuffId() && this.getServerBuffType() == other.getServerBuffType() && this.getInstancedModifierId() == other.getInstancedModifierId() && this.getIsModifierAdded() == other.getIsModifierAdded() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getServerBuffUid();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getServerBuffId();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getServerBuffType();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getInstancedModifierId();
            hash = 37 * hash + 5;
            hash = 53 * hash + Internal.hashBoolean(this.getIsModifierAdded());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ServerBuff parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ServerBuff.PARSER.parseFrom(data);
        }
        
        public static ServerBuff parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ServerBuff.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ServerBuff parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ServerBuff.PARSER.parseFrom(data);
        }
        
        public static ServerBuff parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ServerBuff.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ServerBuff parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ServerBuff.PARSER.parseFrom(data);
        }
        
        public static ServerBuff parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ServerBuff.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ServerBuff parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ServerBuff.PARSER, input);
        }
        
        public static ServerBuff parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ServerBuff.PARSER, input, extensionRegistry);
        }
        
        public static ServerBuff parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ServerBuff.PARSER, input);
        }
        
        public static ServerBuff parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ServerBuff.PARSER, input, extensionRegistry);
        }
        
        public static ServerBuff parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ServerBuff.PARSER, input);
        }
        
        public static ServerBuff parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ServerBuff.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ServerBuff.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ServerBuff prototype) {
            return ServerBuff.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ServerBuff.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ServerBuff getDefaultInstance() {
            return ServerBuff.DEFAULT_INSTANCE;
        }
        
        public static Parser<ServerBuff> parser() {
            return ServerBuff.PARSER;
        }
        
        @Override
        public Parser<ServerBuff> getParserForType() {
            return ServerBuff.PARSER;
        }
        
        @Override
        public ServerBuff getDefaultInstanceForType() {
            return ServerBuff.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ServerBuff();
            PARSER = new AbstractParser<ServerBuff>() {
                @Override
                public ServerBuff parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ServerBuff(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServerBuffOrBuilder
        {
            private int serverBuffUid_;
            private int serverBuffId_;
            private int serverBuffType_;
            private int instancedModifierId_;
            private boolean isModifierAdded_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ServerBuffOuterClass.internal_static_ServerBuff_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ServerBuffOuterClass.internal_static_ServerBuff_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerBuff.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ServerBuff.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.serverBuffUid_ = 0;
                this.serverBuffId_ = 0;
                this.serverBuffType_ = 0;
                this.instancedModifierId_ = 0;
                this.isModifierAdded_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ServerBuffOuterClass.internal_static_ServerBuff_descriptor;
            }
            
            @Override
            public ServerBuff getDefaultInstanceForType() {
                return ServerBuff.getDefaultInstance();
            }
            
            @Override
            public ServerBuff build() {
                final ServerBuff result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ServerBuff buildPartial() {
                final ServerBuff result = new ServerBuff(this);
                result.serverBuffUid_ = this.serverBuffUid_;
                result.serverBuffId_ = this.serverBuffId_;
                result.serverBuffType_ = this.serverBuffType_;
                result.instancedModifierId_ = this.instancedModifierId_;
                result.isModifierAdded_ = this.isModifierAdded_;
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
                if (other instanceof ServerBuff) {
                    return this.mergeFrom((ServerBuff)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ServerBuff other) {
                if (other == ServerBuff.getDefaultInstance()) {
                    return this;
                }
                if (other.getServerBuffUid() != 0) {
                    this.setServerBuffUid(other.getServerBuffUid());
                }
                if (other.getServerBuffId() != 0) {
                    this.setServerBuffId(other.getServerBuffId());
                }
                if (other.getServerBuffType() != 0) {
                    this.setServerBuffType(other.getServerBuffType());
                }
                if (other.getInstancedModifierId() != 0) {
                    this.setInstancedModifierId(other.getInstancedModifierId());
                }
                if (other.getIsModifierAdded()) {
                    this.setIsModifierAdded(other.getIsModifierAdded());
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
                ServerBuff parsedMessage = null;
                try {
                    parsedMessage = ServerBuff.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ServerBuff)e.getUnfinishedMessage();
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
            public int getServerBuffUid() {
                return this.serverBuffUid_;
            }
            
            public Builder setServerBuffUid(final int value) {
                this.serverBuffUid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearServerBuffUid() {
                this.serverBuffUid_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getServerBuffId() {
                return this.serverBuffId_;
            }
            
            public Builder setServerBuffId(final int value) {
                this.serverBuffId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearServerBuffId() {
                this.serverBuffId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getServerBuffType() {
                return this.serverBuffType_;
            }
            
            public Builder setServerBuffType(final int value) {
                this.serverBuffType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearServerBuffType() {
                this.serverBuffType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getInstancedModifierId() {
                return this.instancedModifierId_;
            }
            
            public Builder setInstancedModifierId(final int value) {
                this.instancedModifierId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearInstancedModifierId() {
                this.instancedModifierId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsModifierAdded() {
                return this.isModifierAdded_;
            }
            
            public Builder setIsModifierAdded(final boolean value) {
                this.isModifierAdded_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsModifierAdded() {
                this.isModifierAdded_ = false;
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
    
    public interface ServerBuffOrBuilder extends MessageOrBuilder
    {
        int getServerBuffUid();
        
        int getServerBuffId();
        
        int getServerBuffType();
        
        int getInstancedModifierId();
        
        boolean getIsModifierAdded();
    }
}
