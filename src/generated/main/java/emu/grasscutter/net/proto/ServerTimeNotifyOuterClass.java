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

public final class ServerTimeNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_ServerTimeNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ServerTimeNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ServerTimeNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ServerTimeNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016ServerTimeNotify.proto\"'\n\u0010ServerTimeNotify\u0012\u0013\n\u000bserver_time\u0018\r \u0001(\u0004B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ServerTimeNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ServerTimeNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ServerTimeNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ServerTimeNotifyOuterClass.internal_static_ServerTimeNotify_descriptor, new String[] { "ServerTime" });
    }
    
    public static final class ServerTimeNotify extends GeneratedMessageV3 implements ServerTimeNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SERVER_TIME_FIELD_NUMBER = 13;
        private long serverTime_;
        private byte memoizedIsInitialized;
        private static final ServerTimeNotify DEFAULT_INSTANCE;
        private static final Parser<ServerTimeNotify> PARSER;
        
        private ServerTimeNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ServerTimeNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ServerTimeNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ServerTimeNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 104: {
                            this.serverTime_ = input.readUInt64();
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
            return ServerTimeNotifyOuterClass.internal_static_ServerTimeNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ServerTimeNotifyOuterClass.internal_static_ServerTimeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerTimeNotify.class, Builder.class);
        }
        
        @Override
        public long getServerTime() {
            return this.serverTime_;
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
            if (this.serverTime_ != 0L) {
                output.writeUInt64(13, this.serverTime_);
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
            if (this.serverTime_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(13, this.serverTime_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ServerTimeNotify)) {
                return super.equals(obj);
            }
            final ServerTimeNotify other = (ServerTimeNotify)obj;
            return this.getServerTime() == other.getServerTime() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 13;
            hash = 53 * hash + Internal.hashLong(this.getServerTime());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ServerTimeNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ServerTimeNotify.PARSER.parseFrom(data);
        }
        
        public static ServerTimeNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ServerTimeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ServerTimeNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ServerTimeNotify.PARSER.parseFrom(data);
        }
        
        public static ServerTimeNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ServerTimeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ServerTimeNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ServerTimeNotify.PARSER.parseFrom(data);
        }
        
        public static ServerTimeNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ServerTimeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ServerTimeNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ServerTimeNotify.PARSER, input);
        }
        
        public static ServerTimeNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ServerTimeNotify.PARSER, input, extensionRegistry);
        }
        
        public static ServerTimeNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ServerTimeNotify.PARSER, input);
        }
        
        public static ServerTimeNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ServerTimeNotify.PARSER, input, extensionRegistry);
        }
        
        public static ServerTimeNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ServerTimeNotify.PARSER, input);
        }
        
        public static ServerTimeNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ServerTimeNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ServerTimeNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ServerTimeNotify prototype) {
            return ServerTimeNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ServerTimeNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ServerTimeNotify getDefaultInstance() {
            return ServerTimeNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<ServerTimeNotify> parser() {
            return ServerTimeNotify.PARSER;
        }
        
        @Override
        public Parser<ServerTimeNotify> getParserForType() {
            return ServerTimeNotify.PARSER;
        }
        
        @Override
        public ServerTimeNotify getDefaultInstanceForType() {
            return ServerTimeNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ServerTimeNotify();
            PARSER = new AbstractParser<ServerTimeNotify>() {
                @Override
                public ServerTimeNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ServerTimeNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServerTimeNotifyOrBuilder
        {
            private long serverTime_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ServerTimeNotifyOuterClass.internal_static_ServerTimeNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ServerTimeNotifyOuterClass.internal_static_ServerTimeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerTimeNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ServerTimeNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.serverTime_ = 0L;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ServerTimeNotifyOuterClass.internal_static_ServerTimeNotify_descriptor;
            }
            
            @Override
            public ServerTimeNotify getDefaultInstanceForType() {
                return ServerTimeNotify.getDefaultInstance();
            }
            
            @Override
            public ServerTimeNotify build() {
                final ServerTimeNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ServerTimeNotify buildPartial() {
                final ServerTimeNotify result = new ServerTimeNotify(this);
                result.serverTime_ = this.serverTime_;
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
                if (other instanceof ServerTimeNotify) {
                    return this.mergeFrom((ServerTimeNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ServerTimeNotify other) {
                if (other == ServerTimeNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getServerTime() != 0L) {
                    this.setServerTime(other.getServerTime());
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
                ServerTimeNotify parsedMessage = null;
                try {
                    parsedMessage = ServerTimeNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ServerTimeNotify)e.getUnfinishedMessage();
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
            public long getServerTime() {
                return this.serverTime_;
            }
            
            public Builder setServerTime(final long value) {
                this.serverTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearServerTime() {
                this.serverTime_ = 0L;
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
    
    public interface ServerTimeNotifyOrBuilder extends MessageOrBuilder
    {
        long getServerTime();
    }
}
