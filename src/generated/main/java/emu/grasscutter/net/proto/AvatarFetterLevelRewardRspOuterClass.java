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

public final class AvatarFetterLevelRewardRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_AvatarFetterLevelRewardRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarFetterLevelRewardRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AvatarFetterLevelRewardRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AvatarFetterLevelRewardRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n AvatarFetterLevelRewardRsp.proto\"k\n\u001aAvatarFetterLevelRewardRsp\u0012\u0013\n\u000bavatar_guid\u0018\u0004 \u0001(\u0004\u0012\u0011\n\treward_id\u0018\u0001 \u0001(\r\u0012\u000f\n\u0007retcode\u0018\r \u0001(\u0005\u0012\u0014\n\ffetter_level\u0018\u000e \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AvatarFetterLevelRewardRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AvatarFetterLevelRewardRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AvatarFetterLevelRewardRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarFetterLevelRewardRspOuterClass.internal_static_AvatarFetterLevelRewardRsp_descriptor, new String[] { "AvatarGuid", "RewardId", "Retcode", "FetterLevel" });
    }
    
    public static final class AvatarFetterLevelRewardRsp extends GeneratedMessageV3 implements AvatarFetterLevelRewardRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int AVATAR_GUID_FIELD_NUMBER = 4;
        private long avatarGuid_;
        public static final int REWARD_ID_FIELD_NUMBER = 1;
        private int rewardId_;
        public static final int RETCODE_FIELD_NUMBER = 13;
        private int retcode_;
        public static final int FETTER_LEVEL_FIELD_NUMBER = 14;
        private int fetterLevel_;
        private byte memoizedIsInitialized;
        private static final AvatarFetterLevelRewardRsp DEFAULT_INSTANCE;
        private static final Parser<AvatarFetterLevelRewardRsp> PARSER;
        
        private AvatarFetterLevelRewardRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AvatarFetterLevelRewardRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AvatarFetterLevelRewardRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AvatarFetterLevelRewardRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.rewardId_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.avatarGuid_ = input.readUInt64();
                            continue;
                        }
                        case 104: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 112: {
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
            return AvatarFetterLevelRewardRspOuterClass.internal_static_AvatarFetterLevelRewardRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AvatarFetterLevelRewardRspOuterClass.internal_static_AvatarFetterLevelRewardRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarFetterLevelRewardRsp.class, Builder.class);
        }
        
        @Override
        public long getAvatarGuid() {
            return this.avatarGuid_;
        }
        
        @Override
        public int getRewardId() {
            return this.rewardId_;
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
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
            if (this.rewardId_ != 0) {
                output.writeUInt32(1, this.rewardId_);
            }
            if (this.avatarGuid_ != 0L) {
                output.writeUInt64(4, this.avatarGuid_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(13, this.retcode_);
            }
            if (this.fetterLevel_ != 0) {
                output.writeUInt32(14, this.fetterLevel_);
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
            if (this.rewardId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.rewardId_);
            }
            if (this.avatarGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(4, this.avatarGuid_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(13, this.retcode_);
            }
            if (this.fetterLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.fetterLevel_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarFetterLevelRewardRsp)) {
                return super.equals(obj);
            }
            final AvatarFetterLevelRewardRsp other = (AvatarFetterLevelRewardRsp)obj;
            return this.getAvatarGuid() == other.getAvatarGuid() && this.getRewardId() == other.getRewardId() && this.getRetcode() == other.getRetcode() && this.getFetterLevel() == other.getFetterLevel() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 4;
            hash = 53 * hash + Internal.hashLong(this.getAvatarGuid());
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getRewardId();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getFetterLevel();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AvatarFetterLevelRewardRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AvatarFetterLevelRewardRsp.PARSER.parseFrom(data);
        }
        
        public static AvatarFetterLevelRewardRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarFetterLevelRewardRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarFetterLevelRewardRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AvatarFetterLevelRewardRsp.PARSER.parseFrom(data);
        }
        
        public static AvatarFetterLevelRewardRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarFetterLevelRewardRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarFetterLevelRewardRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AvatarFetterLevelRewardRsp.PARSER.parseFrom(data);
        }
        
        public static AvatarFetterLevelRewardRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarFetterLevelRewardRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarFetterLevelRewardRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarFetterLevelRewardRsp.PARSER, input);
        }
        
        public static AvatarFetterLevelRewardRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarFetterLevelRewardRsp.PARSER, input, extensionRegistry);
        }
        
        public static AvatarFetterLevelRewardRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarFetterLevelRewardRsp.PARSER, input);
        }
        
        public static AvatarFetterLevelRewardRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarFetterLevelRewardRsp.PARSER, input, extensionRegistry);
        }
        
        public static AvatarFetterLevelRewardRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarFetterLevelRewardRsp.PARSER, input);
        }
        
        public static AvatarFetterLevelRewardRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarFetterLevelRewardRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AvatarFetterLevelRewardRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AvatarFetterLevelRewardRsp prototype) {
            return AvatarFetterLevelRewardRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AvatarFetterLevelRewardRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AvatarFetterLevelRewardRsp getDefaultInstance() {
            return AvatarFetterLevelRewardRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<AvatarFetterLevelRewardRsp> parser() {
            return AvatarFetterLevelRewardRsp.PARSER;
        }
        
        @Override
        public Parser<AvatarFetterLevelRewardRsp> getParserForType() {
            return AvatarFetterLevelRewardRsp.PARSER;
        }
        
        @Override
        public AvatarFetterLevelRewardRsp getDefaultInstanceForType() {
            return AvatarFetterLevelRewardRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AvatarFetterLevelRewardRsp();
            PARSER = new AbstractParser<AvatarFetterLevelRewardRsp>() {
                @Override
                public AvatarFetterLevelRewardRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AvatarFetterLevelRewardRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AvatarFetterLevelRewardRspOrBuilder
        {
            private long avatarGuid_;
            private int rewardId_;
            private int retcode_;
            private int fetterLevel_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AvatarFetterLevelRewardRspOuterClass.internal_static_AvatarFetterLevelRewardRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AvatarFetterLevelRewardRspOuterClass.internal_static_AvatarFetterLevelRewardRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarFetterLevelRewardRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AvatarFetterLevelRewardRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.avatarGuid_ = 0L;
                this.rewardId_ = 0;
                this.retcode_ = 0;
                this.fetterLevel_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AvatarFetterLevelRewardRspOuterClass.internal_static_AvatarFetterLevelRewardRsp_descriptor;
            }
            
            @Override
            public AvatarFetterLevelRewardRsp getDefaultInstanceForType() {
                return AvatarFetterLevelRewardRsp.getDefaultInstance();
            }
            
            @Override
            public AvatarFetterLevelRewardRsp build() {
                final AvatarFetterLevelRewardRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AvatarFetterLevelRewardRsp buildPartial() {
                final AvatarFetterLevelRewardRsp result = new AvatarFetterLevelRewardRsp(this);
                result.avatarGuid_ = this.avatarGuid_;
                result.rewardId_ = this.rewardId_;
                result.retcode_ = this.retcode_;
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
                if (other instanceof AvatarFetterLevelRewardRsp) {
                    return this.mergeFrom((AvatarFetterLevelRewardRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AvatarFetterLevelRewardRsp other) {
                if (other == AvatarFetterLevelRewardRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getAvatarGuid() != 0L) {
                    this.setAvatarGuid(other.getAvatarGuid());
                }
                if (other.getRewardId() != 0) {
                    this.setRewardId(other.getRewardId());
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
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
                AvatarFetterLevelRewardRsp parsedMessage = null;
                try {
                    parsedMessage = AvatarFetterLevelRewardRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AvatarFetterLevelRewardRsp)e.getUnfinishedMessage();
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
            public int getRewardId() {
                return this.rewardId_;
            }
            
            public Builder setRewardId(final int value) {
                this.rewardId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRewardId() {
                this.rewardId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
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
    
    public interface AvatarFetterLevelRewardRspOrBuilder extends MessageOrBuilder
    {
        long getAvatarGuid();
        
        int getRewardId();
        
        int getRetcode();
        
        int getFetterLevel();
    }
}
