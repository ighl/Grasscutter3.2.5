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

public final class ClientAbilityInitBeginNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_ClientAbilityInitBeginNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ClientAbilityInitBeginNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ClientAbilityInitBeginNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ClientAbilityInitBeginNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\"ClientAbilityInitBeginNotify.proto\"1\n\u001cClientAbilityInitBeginNotify\u0012\u0011\n\tentity_id\u0018\u0001 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ClientAbilityInitBeginNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ClientAbilityInitBeginNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ClientAbilityInitBeginNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ClientAbilityInitBeginNotifyOuterClass.internal_static_ClientAbilityInitBeginNotify_descriptor, new String[] { "EntityId" });
    }
    
    public static final class ClientAbilityInitBeginNotify extends GeneratedMessageV3 implements ClientAbilityInitBeginNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ENTITY_ID_FIELD_NUMBER = 1;
        private int entityId_;
        private byte memoizedIsInitialized;
        private static final ClientAbilityInitBeginNotify DEFAULT_INSTANCE;
        private static final Parser<ClientAbilityInitBeginNotify> PARSER;
        
        private ClientAbilityInitBeginNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ClientAbilityInitBeginNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ClientAbilityInitBeginNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ClientAbilityInitBeginNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
            return ClientAbilityInitBeginNotifyOuterClass.internal_static_ClientAbilityInitBeginNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ClientAbilityInitBeginNotifyOuterClass.internal_static_ClientAbilityInitBeginNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ClientAbilityInitBeginNotify.class, Builder.class);
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
            if (this.entityId_ != 0) {
                output.writeUInt32(1, this.entityId_);
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
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ClientAbilityInitBeginNotify)) {
                return super.equals(obj);
            }
            final ClientAbilityInitBeginNotify other = (ClientAbilityInitBeginNotify)obj;
            return this.getEntityId() == other.getEntityId() && this.unknownFields.equals(other.unknownFields);
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
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ClientAbilityInitBeginNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ClientAbilityInitBeginNotify.PARSER.parseFrom(data);
        }
        
        public static ClientAbilityInitBeginNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ClientAbilityInitBeginNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ClientAbilityInitBeginNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ClientAbilityInitBeginNotify.PARSER.parseFrom(data);
        }
        
        public static ClientAbilityInitBeginNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ClientAbilityInitBeginNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ClientAbilityInitBeginNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ClientAbilityInitBeginNotify.PARSER.parseFrom(data);
        }
        
        public static ClientAbilityInitBeginNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ClientAbilityInitBeginNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ClientAbilityInitBeginNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ClientAbilityInitBeginNotify.PARSER, input);
        }
        
        public static ClientAbilityInitBeginNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ClientAbilityInitBeginNotify.PARSER, input, extensionRegistry);
        }
        
        public static ClientAbilityInitBeginNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ClientAbilityInitBeginNotify.PARSER, input);
        }
        
        public static ClientAbilityInitBeginNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ClientAbilityInitBeginNotify.PARSER, input, extensionRegistry);
        }
        
        public static ClientAbilityInitBeginNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ClientAbilityInitBeginNotify.PARSER, input);
        }
        
        public static ClientAbilityInitBeginNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ClientAbilityInitBeginNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ClientAbilityInitBeginNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ClientAbilityInitBeginNotify prototype) {
            return ClientAbilityInitBeginNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ClientAbilityInitBeginNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ClientAbilityInitBeginNotify getDefaultInstance() {
            return ClientAbilityInitBeginNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<ClientAbilityInitBeginNotify> parser() {
            return ClientAbilityInitBeginNotify.PARSER;
        }
        
        @Override
        public Parser<ClientAbilityInitBeginNotify> getParserForType() {
            return ClientAbilityInitBeginNotify.PARSER;
        }
        
        @Override
        public ClientAbilityInitBeginNotify getDefaultInstanceForType() {
            return ClientAbilityInitBeginNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ClientAbilityInitBeginNotify();
            PARSER = new AbstractParser<ClientAbilityInitBeginNotify>() {
                @Override
                public ClientAbilityInitBeginNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ClientAbilityInitBeginNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ClientAbilityInitBeginNotifyOrBuilder
        {
            private int entityId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ClientAbilityInitBeginNotifyOuterClass.internal_static_ClientAbilityInitBeginNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ClientAbilityInitBeginNotifyOuterClass.internal_static_ClientAbilityInitBeginNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ClientAbilityInitBeginNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ClientAbilityInitBeginNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.entityId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ClientAbilityInitBeginNotifyOuterClass.internal_static_ClientAbilityInitBeginNotify_descriptor;
            }
            
            @Override
            public ClientAbilityInitBeginNotify getDefaultInstanceForType() {
                return ClientAbilityInitBeginNotify.getDefaultInstance();
            }
            
            @Override
            public ClientAbilityInitBeginNotify build() {
                final ClientAbilityInitBeginNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ClientAbilityInitBeginNotify buildPartial() {
                final ClientAbilityInitBeginNotify result = new ClientAbilityInitBeginNotify(this);
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
                if (other instanceof ClientAbilityInitBeginNotify) {
                    return this.mergeFrom((ClientAbilityInitBeginNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ClientAbilityInitBeginNotify other) {
                if (other == ClientAbilityInitBeginNotify.getDefaultInstance()) {
                    return this;
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
                ClientAbilityInitBeginNotify parsedMessage = null;
                try {
                    parsedMessage = ClientAbilityInitBeginNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ClientAbilityInitBeginNotify)e.getUnfinishedMessage();
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface ClientAbilityInitBeginNotifyOrBuilder extends MessageOrBuilder
    {
        int getEntityId();
    }
}
