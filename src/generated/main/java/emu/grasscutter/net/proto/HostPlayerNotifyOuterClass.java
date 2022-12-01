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

public final class HostPlayerNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_HostPlayerNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_HostPlayerNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private HostPlayerNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HostPlayerNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016HostPlayerNotify.proto\":\n\u0010HostPlayerNotify\u0012\u0014\n\fhost_peer_id\u0018\r \u0001(\r\u0012\u0010\n\bhost_uid\u0018\n \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HostPlayerNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_HostPlayerNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HostPlayerNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(HostPlayerNotifyOuterClass.internal_static_HostPlayerNotify_descriptor, new String[] { "HostPeerId", "HostUid" });
    }
    
    public static final class HostPlayerNotify extends GeneratedMessageV3 implements HostPlayerNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int HOST_PEER_ID_FIELD_NUMBER = 13;
        private int hostPeerId_;
        public static final int HOST_UID_FIELD_NUMBER = 10;
        private int hostUid_;
        private byte memoizedIsInitialized;
        private static final HostPlayerNotify DEFAULT_INSTANCE;
        private static final Parser<HostPlayerNotify> PARSER;
        
        private HostPlayerNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private HostPlayerNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new HostPlayerNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private HostPlayerNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 80: {
                            this.hostUid_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.hostPeerId_ = input.readUInt32();
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
            return HostPlayerNotifyOuterClass.internal_static_HostPlayerNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HostPlayerNotifyOuterClass.internal_static_HostPlayerNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(HostPlayerNotify.class, Builder.class);
        }
        
        @Override
        public int getHostPeerId() {
            return this.hostPeerId_;
        }
        
        @Override
        public int getHostUid() {
            return this.hostUid_;
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
            if (this.hostUid_ != 0) {
                output.writeUInt32(10, this.hostUid_);
            }
            if (this.hostPeerId_ != 0) {
                output.writeUInt32(13, this.hostPeerId_);
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
            if (this.hostUid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.hostUid_);
            }
            if (this.hostPeerId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.hostPeerId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HostPlayerNotify)) {
                return super.equals(obj);
            }
            final HostPlayerNotify other = (HostPlayerNotify)obj;
            return this.getHostPeerId() == other.getHostPeerId() && this.getHostUid() == other.getHostUid() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getHostPeerId();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getHostUid();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static HostPlayerNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return HostPlayerNotify.PARSER.parseFrom(data);
        }
        
        public static HostPlayerNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HostPlayerNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HostPlayerNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return HostPlayerNotify.PARSER.parseFrom(data);
        }
        
        public static HostPlayerNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HostPlayerNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HostPlayerNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return HostPlayerNotify.PARSER.parseFrom(data);
        }
        
        public static HostPlayerNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HostPlayerNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HostPlayerNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HostPlayerNotify.PARSER, input);
        }
        
        public static HostPlayerNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HostPlayerNotify.PARSER, input, extensionRegistry);
        }
        
        public static HostPlayerNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HostPlayerNotify.PARSER, input);
        }
        
        public static HostPlayerNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HostPlayerNotify.PARSER, input, extensionRegistry);
        }
        
        public static HostPlayerNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HostPlayerNotify.PARSER, input);
        }
        
        public static HostPlayerNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HostPlayerNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return HostPlayerNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final HostPlayerNotify prototype) {
            return HostPlayerNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == HostPlayerNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static HostPlayerNotify getDefaultInstance() {
            return HostPlayerNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<HostPlayerNotify> parser() {
            return HostPlayerNotify.PARSER;
        }
        
        @Override
        public Parser<HostPlayerNotify> getParserForType() {
            return HostPlayerNotify.PARSER;
        }
        
        @Override
        public HostPlayerNotify getDefaultInstanceForType() {
            return HostPlayerNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new HostPlayerNotify();
            PARSER = new AbstractParser<HostPlayerNotify>() {
                @Override
                public HostPlayerNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new HostPlayerNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HostPlayerNotifyOrBuilder
        {
            private int hostPeerId_;
            private int hostUid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return HostPlayerNotifyOuterClass.internal_static_HostPlayerNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HostPlayerNotifyOuterClass.internal_static_HostPlayerNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(HostPlayerNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (HostPlayerNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.hostPeerId_ = 0;
                this.hostUid_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return HostPlayerNotifyOuterClass.internal_static_HostPlayerNotify_descriptor;
            }
            
            @Override
            public HostPlayerNotify getDefaultInstanceForType() {
                return HostPlayerNotify.getDefaultInstance();
            }
            
            @Override
            public HostPlayerNotify build() {
                final HostPlayerNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public HostPlayerNotify buildPartial() {
                final HostPlayerNotify result = new HostPlayerNotify(this);
                result.hostPeerId_ = this.hostPeerId_;
                result.hostUid_ = this.hostUid_;
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
                if (other instanceof HostPlayerNotify) {
                    return this.mergeFrom((HostPlayerNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final HostPlayerNotify other) {
                if (other == HostPlayerNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getHostPeerId() != 0) {
                    this.setHostPeerId(other.getHostPeerId());
                }
                if (other.getHostUid() != 0) {
                    this.setHostUid(other.getHostUid());
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
                HostPlayerNotify parsedMessage = null;
                try {
                    parsedMessage = HostPlayerNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (HostPlayerNotify)e.getUnfinishedMessage();
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
            public int getHostPeerId() {
                return this.hostPeerId_;
            }
            
            public Builder setHostPeerId(final int value) {
                this.hostPeerId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearHostPeerId() {
                this.hostPeerId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getHostUid() {
                return this.hostUid_;
            }
            
            public Builder setHostUid(final int value) {
                this.hostUid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearHostUid() {
                this.hostUid_ = 0;
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
    
    public interface HostPlayerNotifyOrBuilder extends MessageOrBuilder
    {
        int getHostPeerId();
        
        int getHostUid();
    }
}
