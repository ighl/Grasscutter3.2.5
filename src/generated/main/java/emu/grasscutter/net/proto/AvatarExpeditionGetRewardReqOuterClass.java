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

public final class AvatarExpeditionGetRewardReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_AvatarExpeditionGetRewardReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarExpeditionGetRewardReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AvatarExpeditionGetRewardReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AvatarExpeditionGetRewardReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\"AvatarExpeditionGetRewardReq.proto\"3\n\u001cAvatarExpeditionGetRewardReq\u0012\u0013\n\u000bavatar_guid\u0018\u000e \u0001(\u0004B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AvatarExpeditionGetRewardReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AvatarExpeditionGetRewardReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AvatarExpeditionGetRewardReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarExpeditionGetRewardReqOuterClass.internal_static_AvatarExpeditionGetRewardReq_descriptor, new String[] { "AvatarGuid" });
    }
    
    public static final class AvatarExpeditionGetRewardReq extends GeneratedMessageV3 implements AvatarExpeditionGetRewardReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int AVATAR_GUID_FIELD_NUMBER = 14;
        private long avatarGuid_;
        private byte memoizedIsInitialized;
        private static final AvatarExpeditionGetRewardReq DEFAULT_INSTANCE;
        private static final Parser<AvatarExpeditionGetRewardReq> PARSER;
        
        private AvatarExpeditionGetRewardReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AvatarExpeditionGetRewardReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AvatarExpeditionGetRewardReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AvatarExpeditionGetRewardReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 112: {
                            this.avatarGuid_ = input.readUInt64();
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
            return AvatarExpeditionGetRewardReqOuterClass.internal_static_AvatarExpeditionGetRewardReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AvatarExpeditionGetRewardReqOuterClass.internal_static_AvatarExpeditionGetRewardReq_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarExpeditionGetRewardReq.class, Builder.class);
        }
        
        @Override
        public long getAvatarGuid() {
            return this.avatarGuid_;
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
            if (this.avatarGuid_ != 0L) {
                output.writeUInt64(14, this.avatarGuid_);
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
            if (this.avatarGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(14, this.avatarGuid_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarExpeditionGetRewardReq)) {
                return super.equals(obj);
            }
            final AvatarExpeditionGetRewardReq other = (AvatarExpeditionGetRewardReq)obj;
            return this.getAvatarGuid() == other.getAvatarGuid() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 14;
            hash = 53 * hash + Internal.hashLong(this.getAvatarGuid());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AvatarExpeditionGetRewardReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AvatarExpeditionGetRewardReq.PARSER.parseFrom(data);
        }
        
        public static AvatarExpeditionGetRewardReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarExpeditionGetRewardReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarExpeditionGetRewardReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AvatarExpeditionGetRewardReq.PARSER.parseFrom(data);
        }
        
        public static AvatarExpeditionGetRewardReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarExpeditionGetRewardReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarExpeditionGetRewardReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AvatarExpeditionGetRewardReq.PARSER.parseFrom(data);
        }
        
        public static AvatarExpeditionGetRewardReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarExpeditionGetRewardReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarExpeditionGetRewardReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExpeditionGetRewardReq.PARSER, input);
        }
        
        public static AvatarExpeditionGetRewardReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExpeditionGetRewardReq.PARSER, input, extensionRegistry);
        }
        
        public static AvatarExpeditionGetRewardReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarExpeditionGetRewardReq.PARSER, input);
        }
        
        public static AvatarExpeditionGetRewardReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarExpeditionGetRewardReq.PARSER, input, extensionRegistry);
        }
        
        public static AvatarExpeditionGetRewardReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExpeditionGetRewardReq.PARSER, input);
        }
        
        public static AvatarExpeditionGetRewardReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExpeditionGetRewardReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AvatarExpeditionGetRewardReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AvatarExpeditionGetRewardReq prototype) {
            return AvatarExpeditionGetRewardReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AvatarExpeditionGetRewardReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AvatarExpeditionGetRewardReq getDefaultInstance() {
            return AvatarExpeditionGetRewardReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<AvatarExpeditionGetRewardReq> parser() {
            return AvatarExpeditionGetRewardReq.PARSER;
        }
        
        @Override
        public Parser<AvatarExpeditionGetRewardReq> getParserForType() {
            return AvatarExpeditionGetRewardReq.PARSER;
        }
        
        @Override
        public AvatarExpeditionGetRewardReq getDefaultInstanceForType() {
            return AvatarExpeditionGetRewardReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AvatarExpeditionGetRewardReq();
            PARSER = new AbstractParser<AvatarExpeditionGetRewardReq>() {
                @Override
                public AvatarExpeditionGetRewardReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AvatarExpeditionGetRewardReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AvatarExpeditionGetRewardReqOrBuilder
        {
            private long avatarGuid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AvatarExpeditionGetRewardReqOuterClass.internal_static_AvatarExpeditionGetRewardReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AvatarExpeditionGetRewardReqOuterClass.internal_static_AvatarExpeditionGetRewardReq_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarExpeditionGetRewardReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AvatarExpeditionGetRewardReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.avatarGuid_ = 0L;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AvatarExpeditionGetRewardReqOuterClass.internal_static_AvatarExpeditionGetRewardReq_descriptor;
            }
            
            @Override
            public AvatarExpeditionGetRewardReq getDefaultInstanceForType() {
                return AvatarExpeditionGetRewardReq.getDefaultInstance();
            }
            
            @Override
            public AvatarExpeditionGetRewardReq build() {
                final AvatarExpeditionGetRewardReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AvatarExpeditionGetRewardReq buildPartial() {
                final AvatarExpeditionGetRewardReq result = new AvatarExpeditionGetRewardReq(this);
                result.avatarGuid_ = this.avatarGuid_;
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
                if (other instanceof AvatarExpeditionGetRewardReq) {
                    return this.mergeFrom((AvatarExpeditionGetRewardReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AvatarExpeditionGetRewardReq other) {
                if (other == AvatarExpeditionGetRewardReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getAvatarGuid() != 0L) {
                    this.setAvatarGuid(other.getAvatarGuid());
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
                AvatarExpeditionGetRewardReq parsedMessage = null;
                try {
                    parsedMessage = AvatarExpeditionGetRewardReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AvatarExpeditionGetRewardReq)e.getUnfinishedMessage();
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
            public long getAvatarGuid() {
                return this.avatarGuid_;
            }
            
            public Builder setAvatarGuid(final long value) {
                this.avatarGuid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAvatarGuid() {
                this.avatarGuid_ = 0L;
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
    
    public interface AvatarExpeditionGetRewardReqOrBuilder extends MessageOrBuilder
    {
        long getAvatarGuid();
    }
}
