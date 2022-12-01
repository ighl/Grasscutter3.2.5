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

public final class AvatarPromoteGetRewardReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_AvatarPromoteGetRewardReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarPromoteGetRewardReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AvatarPromoteGetRewardReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AvatarPromoteGetRewardReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001fAvatarPromoteGetRewardReq.proto\"G\n\u0019AvatarPromoteGetRewardReq\u0012\u0013\n\u000bavatar_guid\u0018\u0007 \u0001(\u0004\u0012\u0015\n\rpromote_level\u0018\f \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AvatarPromoteGetRewardReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AvatarPromoteGetRewardReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AvatarPromoteGetRewardReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarPromoteGetRewardReqOuterClass.internal_static_AvatarPromoteGetRewardReq_descriptor, new String[] { "AvatarGuid", "PromoteLevel" });
    }
    
    public static final class AvatarPromoteGetRewardReq extends GeneratedMessageV3 implements AvatarPromoteGetRewardReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int AVATAR_GUID_FIELD_NUMBER = 7;
        private long avatarGuid_;
        public static final int PROMOTE_LEVEL_FIELD_NUMBER = 12;
        private int promoteLevel_;
        private byte memoizedIsInitialized;
        private static final AvatarPromoteGetRewardReq DEFAULT_INSTANCE;
        private static final Parser<AvatarPromoteGetRewardReq> PARSER;
        
        private AvatarPromoteGetRewardReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AvatarPromoteGetRewardReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AvatarPromoteGetRewardReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AvatarPromoteGetRewardReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 56: {
                            this.avatarGuid_ = input.readUInt64();
                            continue;
                        }
                        case 96: {
                            this.promoteLevel_ = input.readUInt32();
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
            return AvatarPromoteGetRewardReqOuterClass.internal_static_AvatarPromoteGetRewardReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AvatarPromoteGetRewardReqOuterClass.internal_static_AvatarPromoteGetRewardReq_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarPromoteGetRewardReq.class, Builder.class);
        }
        
        @Override
        public long getAvatarGuid() {
            return this.avatarGuid_;
        }
        
        @Override
        public int getPromoteLevel() {
            return this.promoteLevel_;
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
                output.writeUInt64(7, this.avatarGuid_);
            }
            if (this.promoteLevel_ != 0) {
                output.writeUInt32(12, this.promoteLevel_);
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
                size += CodedOutputStream.computeUInt64Size(7, this.avatarGuid_);
            }
            if (this.promoteLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.promoteLevel_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarPromoteGetRewardReq)) {
                return super.equals(obj);
            }
            final AvatarPromoteGetRewardReq other = (AvatarPromoteGetRewardReq)obj;
            return this.getAvatarGuid() == other.getAvatarGuid() && this.getPromoteLevel() == other.getPromoteLevel() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 7;
            hash = 53 * hash + Internal.hashLong(this.getAvatarGuid());
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getPromoteLevel();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AvatarPromoteGetRewardReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AvatarPromoteGetRewardReq.PARSER.parseFrom(data);
        }
        
        public static AvatarPromoteGetRewardReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarPromoteGetRewardReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarPromoteGetRewardReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AvatarPromoteGetRewardReq.PARSER.parseFrom(data);
        }
        
        public static AvatarPromoteGetRewardReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarPromoteGetRewardReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarPromoteGetRewardReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AvatarPromoteGetRewardReq.PARSER.parseFrom(data);
        }
        
        public static AvatarPromoteGetRewardReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarPromoteGetRewardReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarPromoteGetRewardReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarPromoteGetRewardReq.PARSER, input);
        }
        
        public static AvatarPromoteGetRewardReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarPromoteGetRewardReq.PARSER, input, extensionRegistry);
        }
        
        public static AvatarPromoteGetRewardReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarPromoteGetRewardReq.PARSER, input);
        }
        
        public static AvatarPromoteGetRewardReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarPromoteGetRewardReq.PARSER, input, extensionRegistry);
        }
        
        public static AvatarPromoteGetRewardReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarPromoteGetRewardReq.PARSER, input);
        }
        
        public static AvatarPromoteGetRewardReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarPromoteGetRewardReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AvatarPromoteGetRewardReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AvatarPromoteGetRewardReq prototype) {
            return AvatarPromoteGetRewardReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AvatarPromoteGetRewardReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AvatarPromoteGetRewardReq getDefaultInstance() {
            return AvatarPromoteGetRewardReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<AvatarPromoteGetRewardReq> parser() {
            return AvatarPromoteGetRewardReq.PARSER;
        }
        
        @Override
        public Parser<AvatarPromoteGetRewardReq> getParserForType() {
            return AvatarPromoteGetRewardReq.PARSER;
        }
        
        @Override
        public AvatarPromoteGetRewardReq getDefaultInstanceForType() {
            return AvatarPromoteGetRewardReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AvatarPromoteGetRewardReq();
            PARSER = new AbstractParser<AvatarPromoteGetRewardReq>() {
                @Override
                public AvatarPromoteGetRewardReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AvatarPromoteGetRewardReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AvatarPromoteGetRewardReqOrBuilder
        {
            private long avatarGuid_;
            private int promoteLevel_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AvatarPromoteGetRewardReqOuterClass.internal_static_AvatarPromoteGetRewardReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AvatarPromoteGetRewardReqOuterClass.internal_static_AvatarPromoteGetRewardReq_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarPromoteGetRewardReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AvatarPromoteGetRewardReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.avatarGuid_ = 0L;
                this.promoteLevel_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AvatarPromoteGetRewardReqOuterClass.internal_static_AvatarPromoteGetRewardReq_descriptor;
            }
            
            @Override
            public AvatarPromoteGetRewardReq getDefaultInstanceForType() {
                return AvatarPromoteGetRewardReq.getDefaultInstance();
            }
            
            @Override
            public AvatarPromoteGetRewardReq build() {
                final AvatarPromoteGetRewardReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AvatarPromoteGetRewardReq buildPartial() {
                final AvatarPromoteGetRewardReq result = new AvatarPromoteGetRewardReq(this);
                result.avatarGuid_ = this.avatarGuid_;
                result.promoteLevel_ = this.promoteLevel_;
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
                if (other instanceof AvatarPromoteGetRewardReq) {
                    return this.mergeFrom((AvatarPromoteGetRewardReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AvatarPromoteGetRewardReq other) {
                if (other == AvatarPromoteGetRewardReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getAvatarGuid() != 0L) {
                    this.setAvatarGuid(other.getAvatarGuid());
                }
                if (other.getPromoteLevel() != 0) {
                    this.setPromoteLevel(other.getPromoteLevel());
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
                AvatarPromoteGetRewardReq parsedMessage = null;
                try {
                    parsedMessage = AvatarPromoteGetRewardReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AvatarPromoteGetRewardReq)e.getUnfinishedMessage();
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
            public int getPromoteLevel() {
                return this.promoteLevel_;
            }
            
            public Builder setPromoteLevel(final int value) {
                this.promoteLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPromoteLevel() {
                this.promoteLevel_ = 0;
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
    
    public interface AvatarPromoteGetRewardReqOrBuilder extends MessageOrBuilder
    {
        long getAvatarGuid();
        
        int getPromoteLevel();
    }
}
