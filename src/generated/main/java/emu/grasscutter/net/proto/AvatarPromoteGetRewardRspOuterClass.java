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

public final class AvatarPromoteGetRewardRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_AvatarPromoteGetRewardRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarPromoteGetRewardRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AvatarPromoteGetRewardRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AvatarPromoteGetRewardRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001fAvatarPromoteGetRewardRsp.proto\"k\n\u0019AvatarPromoteGetRewardRsp\u0012\u000f\n\u0007retcode\u0018\n \u0001(\u0005\u0012\u0011\n\treward_id\u0018\u000f \u0001(\r\u0012\u0013\n\u000bavatar_guid\u0018\u000b \u0001(\u0004\u0012\u0015\n\rpromote_level\u0018\f \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AvatarPromoteGetRewardRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AvatarPromoteGetRewardRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AvatarPromoteGetRewardRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarPromoteGetRewardRspOuterClass.internal_static_AvatarPromoteGetRewardRsp_descriptor, new String[] { "Retcode", "RewardId", "AvatarGuid", "PromoteLevel" });
    }
    
    public static final class AvatarPromoteGetRewardRsp extends GeneratedMessageV3 implements AvatarPromoteGetRewardRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 10;
        private int retcode_;
        public static final int REWARD_ID_FIELD_NUMBER = 15;
        private int rewardId_;
        public static final int AVATAR_GUID_FIELD_NUMBER = 11;
        private long avatarGuid_;
        public static final int PROMOTE_LEVEL_FIELD_NUMBER = 12;
        private int promoteLevel_;
        private byte memoizedIsInitialized;
        private static final AvatarPromoteGetRewardRsp DEFAULT_INSTANCE;
        private static final Parser<AvatarPromoteGetRewardRsp> PARSER;
        
        private AvatarPromoteGetRewardRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AvatarPromoteGetRewardRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AvatarPromoteGetRewardRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AvatarPromoteGetRewardRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 88: {
                            this.avatarGuid_ = input.readUInt64();
                            continue;
                        }
                        case 96: {
                            this.promoteLevel_ = input.readUInt32();
                            continue;
                        }
                        case 120: {
                            this.rewardId_ = input.readUInt32();
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
            return AvatarPromoteGetRewardRspOuterClass.internal_static_AvatarPromoteGetRewardRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AvatarPromoteGetRewardRspOuterClass.internal_static_AvatarPromoteGetRewardRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarPromoteGetRewardRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public int getRewardId() {
            return this.rewardId_;
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
            if (this.retcode_ != 0) {
                output.writeInt32(10, this.retcode_);
            }
            if (this.avatarGuid_ != 0L) {
                output.writeUInt64(11, this.avatarGuid_);
            }
            if (this.promoteLevel_ != 0) {
                output.writeUInt32(12, this.promoteLevel_);
            }
            if (this.rewardId_ != 0) {
                output.writeUInt32(15, this.rewardId_);
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
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(10, this.retcode_);
            }
            if (this.avatarGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(11, this.avatarGuid_);
            }
            if (this.promoteLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.promoteLevel_);
            }
            if (this.rewardId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.rewardId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarPromoteGetRewardRsp)) {
                return super.equals(obj);
            }
            final AvatarPromoteGetRewardRsp other = (AvatarPromoteGetRewardRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.getRewardId() == other.getRewardId() && this.getAvatarGuid() == other.getAvatarGuid() && this.getPromoteLevel() == other.getPromoteLevel() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getRewardId();
            hash = 37 * hash + 11;
            hash = 53 * hash + Internal.hashLong(this.getAvatarGuid());
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getPromoteLevel();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AvatarPromoteGetRewardRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AvatarPromoteGetRewardRsp.PARSER.parseFrom(data);
        }
        
        public static AvatarPromoteGetRewardRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarPromoteGetRewardRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarPromoteGetRewardRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AvatarPromoteGetRewardRsp.PARSER.parseFrom(data);
        }
        
        public static AvatarPromoteGetRewardRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarPromoteGetRewardRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarPromoteGetRewardRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AvatarPromoteGetRewardRsp.PARSER.parseFrom(data);
        }
        
        public static AvatarPromoteGetRewardRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarPromoteGetRewardRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarPromoteGetRewardRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarPromoteGetRewardRsp.PARSER, input);
        }
        
        public static AvatarPromoteGetRewardRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarPromoteGetRewardRsp.PARSER, input, extensionRegistry);
        }
        
        public static AvatarPromoteGetRewardRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarPromoteGetRewardRsp.PARSER, input);
        }
        
        public static AvatarPromoteGetRewardRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarPromoteGetRewardRsp.PARSER, input, extensionRegistry);
        }
        
        public static AvatarPromoteGetRewardRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarPromoteGetRewardRsp.PARSER, input);
        }
        
        public static AvatarPromoteGetRewardRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarPromoteGetRewardRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AvatarPromoteGetRewardRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AvatarPromoteGetRewardRsp prototype) {
            return AvatarPromoteGetRewardRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AvatarPromoteGetRewardRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AvatarPromoteGetRewardRsp getDefaultInstance() {
            return AvatarPromoteGetRewardRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<AvatarPromoteGetRewardRsp> parser() {
            return AvatarPromoteGetRewardRsp.PARSER;
        }
        
        @Override
        public Parser<AvatarPromoteGetRewardRsp> getParserForType() {
            return AvatarPromoteGetRewardRsp.PARSER;
        }
        
        @Override
        public AvatarPromoteGetRewardRsp getDefaultInstanceForType() {
            return AvatarPromoteGetRewardRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AvatarPromoteGetRewardRsp();
            PARSER = new AbstractParser<AvatarPromoteGetRewardRsp>() {
                @Override
                public AvatarPromoteGetRewardRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AvatarPromoteGetRewardRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AvatarPromoteGetRewardRspOrBuilder
        {
            private int retcode_;
            private int rewardId_;
            private long avatarGuid_;
            private int promoteLevel_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AvatarPromoteGetRewardRspOuterClass.internal_static_AvatarPromoteGetRewardRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AvatarPromoteGetRewardRspOuterClass.internal_static_AvatarPromoteGetRewardRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarPromoteGetRewardRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AvatarPromoteGetRewardRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                this.rewardId_ = 0;
                this.avatarGuid_ = 0L;
                this.promoteLevel_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AvatarPromoteGetRewardRspOuterClass.internal_static_AvatarPromoteGetRewardRsp_descriptor;
            }
            
            @Override
            public AvatarPromoteGetRewardRsp getDefaultInstanceForType() {
                return AvatarPromoteGetRewardRsp.getDefaultInstance();
            }
            
            @Override
            public AvatarPromoteGetRewardRsp build() {
                final AvatarPromoteGetRewardRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AvatarPromoteGetRewardRsp buildPartial() {
                final AvatarPromoteGetRewardRsp result = new AvatarPromoteGetRewardRsp(this);
                result.retcode_ = this.retcode_;
                result.rewardId_ = this.rewardId_;
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
                if (other instanceof AvatarPromoteGetRewardRsp) {
                    return this.mergeFrom((AvatarPromoteGetRewardRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AvatarPromoteGetRewardRsp other) {
                if (other == AvatarPromoteGetRewardRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getRewardId() != 0) {
                    this.setRewardId(other.getRewardId());
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
                AvatarPromoteGetRewardRsp parsedMessage = null;
                try {
                    parsedMessage = AvatarPromoteGetRewardRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AvatarPromoteGetRewardRsp)e.getUnfinishedMessage();
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
    
    public interface AvatarPromoteGetRewardRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        int getRewardId();
        
        long getAvatarGuid();
        
        int getPromoteLevel();
    }
}
