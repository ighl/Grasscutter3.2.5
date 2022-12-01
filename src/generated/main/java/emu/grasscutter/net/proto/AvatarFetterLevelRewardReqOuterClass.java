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

public final class AvatarFetterLevelRewardReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_AvatarFetterLevelRewardReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarFetterLevelRewardReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AvatarFetterLevelRewardReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AvatarFetterLevelRewardReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n AvatarFetterLevelRewardReq.proto\"G\n\u001aAvatarFetterLevelRewardReq\u0012\u0013\n\u000bavatar_guid\u0018\u0001 \u0001(\u0004\u0012\u0014\n\ffetter_level\u0018\u0006 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AvatarFetterLevelRewardReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AvatarFetterLevelRewardReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AvatarFetterLevelRewardReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarFetterLevelRewardReqOuterClass.internal_static_AvatarFetterLevelRewardReq_descriptor, new String[] { "AvatarGuid", "FetterLevel" });
    }
    
    public static final class AvatarFetterLevelRewardReq extends GeneratedMessageV3 implements AvatarFetterLevelRewardReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int AVATAR_GUID_FIELD_NUMBER = 1;
        private long avatarGuid_;
        public static final int FETTER_LEVEL_FIELD_NUMBER = 6;
        private int fetterLevel_;
        private byte memoizedIsInitialized;
        private static final AvatarFetterLevelRewardReq DEFAULT_INSTANCE;
        private static final Parser<AvatarFetterLevelRewardReq> PARSER;
        
        private AvatarFetterLevelRewardReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AvatarFetterLevelRewardReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AvatarFetterLevelRewardReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AvatarFetterLevelRewardReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.avatarGuid_ = input.readUInt64();
                            continue;
                        }
                        case 48: {
                            this.fetterLevel_ = input.readUInt32();
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
            return AvatarFetterLevelRewardReqOuterClass.internal_static_AvatarFetterLevelRewardReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AvatarFetterLevelRewardReqOuterClass.internal_static_AvatarFetterLevelRewardReq_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarFetterLevelRewardReq.class, Builder.class);
        }
        
        @Override
        public long getAvatarGuid() {
            return this.avatarGuid_;
        }
        
        @Override
        public int getFetterLevel() {
            return this.fetterLevel_;
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
                output.writeUInt64(1, this.avatarGuid_);
            }
            if (this.fetterLevel_ != 0) {
                output.writeUInt32(6, this.fetterLevel_);
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
                size += CodedOutputStream.computeUInt64Size(1, this.avatarGuid_);
            }
            if (this.fetterLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.fetterLevel_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarFetterLevelRewardReq)) {
                return super.equals(obj);
            }
            final AvatarFetterLevelRewardReq other = (AvatarFetterLevelRewardReq)obj;
            return this.getAvatarGuid() == other.getAvatarGuid() && this.getFetterLevel() == other.getFetterLevel() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + Internal.hashLong(this.getAvatarGuid());
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getFetterLevel();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AvatarFetterLevelRewardReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AvatarFetterLevelRewardReq.PARSER.parseFrom(data);
        }
        
        public static AvatarFetterLevelRewardReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarFetterLevelRewardReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarFetterLevelRewardReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AvatarFetterLevelRewardReq.PARSER.parseFrom(data);
        }
        
        public static AvatarFetterLevelRewardReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarFetterLevelRewardReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarFetterLevelRewardReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AvatarFetterLevelRewardReq.PARSER.parseFrom(data);
        }
        
        public static AvatarFetterLevelRewardReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarFetterLevelRewardReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarFetterLevelRewardReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarFetterLevelRewardReq.PARSER, input);
        }
        
        public static AvatarFetterLevelRewardReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarFetterLevelRewardReq.PARSER, input, extensionRegistry);
        }
        
        public static AvatarFetterLevelRewardReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarFetterLevelRewardReq.PARSER, input);
        }
        
        public static AvatarFetterLevelRewardReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarFetterLevelRewardReq.PARSER, input, extensionRegistry);
        }
        
        public static AvatarFetterLevelRewardReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarFetterLevelRewardReq.PARSER, input);
        }
        
        public static AvatarFetterLevelRewardReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarFetterLevelRewardReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AvatarFetterLevelRewardReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AvatarFetterLevelRewardReq prototype) {
            return AvatarFetterLevelRewardReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AvatarFetterLevelRewardReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AvatarFetterLevelRewardReq getDefaultInstance() {
            return AvatarFetterLevelRewardReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<AvatarFetterLevelRewardReq> parser() {
            return AvatarFetterLevelRewardReq.PARSER;
        }
        
        @Override
        public Parser<AvatarFetterLevelRewardReq> getParserForType() {
            return AvatarFetterLevelRewardReq.PARSER;
        }
        
        @Override
        public AvatarFetterLevelRewardReq getDefaultInstanceForType() {
            return AvatarFetterLevelRewardReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AvatarFetterLevelRewardReq();
            PARSER = new AbstractParser<AvatarFetterLevelRewardReq>() {
                @Override
                public AvatarFetterLevelRewardReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AvatarFetterLevelRewardReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AvatarFetterLevelRewardReqOrBuilder
        {
            private long avatarGuid_;
            private int fetterLevel_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AvatarFetterLevelRewardReqOuterClass.internal_static_AvatarFetterLevelRewardReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AvatarFetterLevelRewardReqOuterClass.internal_static_AvatarFetterLevelRewardReq_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarFetterLevelRewardReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AvatarFetterLevelRewardReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.avatarGuid_ = 0L;
                this.fetterLevel_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AvatarFetterLevelRewardReqOuterClass.internal_static_AvatarFetterLevelRewardReq_descriptor;
            }
            
            @Override
            public AvatarFetterLevelRewardReq getDefaultInstanceForType() {
                return AvatarFetterLevelRewardReq.getDefaultInstance();
            }
            
            @Override
            public AvatarFetterLevelRewardReq build() {
                final AvatarFetterLevelRewardReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AvatarFetterLevelRewardReq buildPartial() {
                final AvatarFetterLevelRewardReq result = new AvatarFetterLevelRewardReq(this);
                result.avatarGuid_ = this.avatarGuid_;
                result.fetterLevel_ = this.fetterLevel_;
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
                if (other instanceof AvatarFetterLevelRewardReq) {
                    return this.mergeFrom((AvatarFetterLevelRewardReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AvatarFetterLevelRewardReq other) {
                if (other == AvatarFetterLevelRewardReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getAvatarGuid() != 0L) {
                    this.setAvatarGuid(other.getAvatarGuid());
                }
                if (other.getFetterLevel() != 0) {
                    this.setFetterLevel(other.getFetterLevel());
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
                AvatarFetterLevelRewardReq parsedMessage = null;
                try {
                    parsedMessage = AvatarFetterLevelRewardReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AvatarFetterLevelRewardReq)e.getUnfinishedMessage();
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
            public int getFetterLevel() {
                return this.fetterLevel_;
            }
            
            public Builder setFetterLevel(final int value) {
                this.fetterLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFetterLevel() {
                this.fetterLevel_ = 0;
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
    
    public interface AvatarFetterLevelRewardReqOrBuilder extends MessageOrBuilder
    {
        long getAvatarGuid();
        
        int getFetterLevel();
    }
}
