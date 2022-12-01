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

public final class AvatarSkillMaxChargeCountNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_AvatarSkillMaxChargeCountNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarSkillMaxChargeCountNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AvatarSkillMaxChargeCountNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AvatarSkillMaxChargeCountNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n%AvatarSkillMaxChargeCountNotify.proto\"b\n\u001fAvatarSkillMaxChargeCountNotify\u0012\u0010\n\bskill_id\u0018\u0006 \u0001(\r\u0012\u0018\n\u0010max_charge_count\u0018\u000b \u0001(\r\u0012\u0013\n\u000bavatar_guid\u0018\u0007 \u0001(\u0004B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AvatarSkillMaxChargeCountNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AvatarSkillMaxChargeCountNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AvatarSkillMaxChargeCountNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarSkillMaxChargeCountNotifyOuterClass.internal_static_AvatarSkillMaxChargeCountNotify_descriptor, new String[] { "SkillId", "MaxChargeCount", "AvatarGuid" });
    }
    
    public static final class AvatarSkillMaxChargeCountNotify extends GeneratedMessageV3 implements AvatarSkillMaxChargeCountNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SKILL_ID_FIELD_NUMBER = 6;
        private int skillId_;
        public static final int MAX_CHARGE_COUNT_FIELD_NUMBER = 11;
        private int maxChargeCount_;
        public static final int AVATAR_GUID_FIELD_NUMBER = 7;
        private long avatarGuid_;
        private byte memoizedIsInitialized;
        private static final AvatarSkillMaxChargeCountNotify DEFAULT_INSTANCE;
        private static final Parser<AvatarSkillMaxChargeCountNotify> PARSER;
        
        private AvatarSkillMaxChargeCountNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AvatarSkillMaxChargeCountNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AvatarSkillMaxChargeCountNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AvatarSkillMaxChargeCountNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 48: {
                            this.skillId_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            this.avatarGuid_ = input.readUInt64();
                            continue;
                        }
                        case 88: {
                            this.maxChargeCount_ = input.readUInt32();
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
            return AvatarSkillMaxChargeCountNotifyOuterClass.internal_static_AvatarSkillMaxChargeCountNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AvatarSkillMaxChargeCountNotifyOuterClass.internal_static_AvatarSkillMaxChargeCountNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarSkillMaxChargeCountNotify.class, Builder.class);
        }
        
        @Override
        public int getSkillId() {
            return this.skillId_;
        }
        
        @Override
        public int getMaxChargeCount() {
            return this.maxChargeCount_;
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
            if (this.skillId_ != 0) {
                output.writeUInt32(6, this.skillId_);
            }
            if (this.avatarGuid_ != 0L) {
                output.writeUInt64(7, this.avatarGuid_);
            }
            if (this.maxChargeCount_ != 0) {
                output.writeUInt32(11, this.maxChargeCount_);
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
            if (this.skillId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.skillId_);
            }
            if (this.avatarGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(7, this.avatarGuid_);
            }
            if (this.maxChargeCount_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.maxChargeCount_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarSkillMaxChargeCountNotify)) {
                return super.equals(obj);
            }
            final AvatarSkillMaxChargeCountNotify other = (AvatarSkillMaxChargeCountNotify)obj;
            return this.getSkillId() == other.getSkillId() && this.getMaxChargeCount() == other.getMaxChargeCount() && this.getAvatarGuid() == other.getAvatarGuid() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getSkillId();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getMaxChargeCount();
            hash = 37 * hash + 7;
            hash = 53 * hash + Internal.hashLong(this.getAvatarGuid());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AvatarSkillMaxChargeCountNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AvatarSkillMaxChargeCountNotify.PARSER.parseFrom(data);
        }
        
        public static AvatarSkillMaxChargeCountNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarSkillMaxChargeCountNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarSkillMaxChargeCountNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AvatarSkillMaxChargeCountNotify.PARSER.parseFrom(data);
        }
        
        public static AvatarSkillMaxChargeCountNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarSkillMaxChargeCountNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarSkillMaxChargeCountNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AvatarSkillMaxChargeCountNotify.PARSER.parseFrom(data);
        }
        
        public static AvatarSkillMaxChargeCountNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarSkillMaxChargeCountNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarSkillMaxChargeCountNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarSkillMaxChargeCountNotify.PARSER, input);
        }
        
        public static AvatarSkillMaxChargeCountNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarSkillMaxChargeCountNotify.PARSER, input, extensionRegistry);
        }
        
        public static AvatarSkillMaxChargeCountNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarSkillMaxChargeCountNotify.PARSER, input);
        }
        
        public static AvatarSkillMaxChargeCountNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarSkillMaxChargeCountNotify.PARSER, input, extensionRegistry);
        }
        
        public static AvatarSkillMaxChargeCountNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarSkillMaxChargeCountNotify.PARSER, input);
        }
        
        public static AvatarSkillMaxChargeCountNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarSkillMaxChargeCountNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AvatarSkillMaxChargeCountNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AvatarSkillMaxChargeCountNotify prototype) {
            return AvatarSkillMaxChargeCountNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AvatarSkillMaxChargeCountNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AvatarSkillMaxChargeCountNotify getDefaultInstance() {
            return AvatarSkillMaxChargeCountNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<AvatarSkillMaxChargeCountNotify> parser() {
            return AvatarSkillMaxChargeCountNotify.PARSER;
        }
        
        @Override
        public Parser<AvatarSkillMaxChargeCountNotify> getParserForType() {
            return AvatarSkillMaxChargeCountNotify.PARSER;
        }
        
        @Override
        public AvatarSkillMaxChargeCountNotify getDefaultInstanceForType() {
            return AvatarSkillMaxChargeCountNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AvatarSkillMaxChargeCountNotify();
            PARSER = new AbstractParser<AvatarSkillMaxChargeCountNotify>() {
                @Override
                public AvatarSkillMaxChargeCountNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AvatarSkillMaxChargeCountNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AvatarSkillMaxChargeCountNotifyOrBuilder
        {
            private int skillId_;
            private int maxChargeCount_;
            private long avatarGuid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AvatarSkillMaxChargeCountNotifyOuterClass.internal_static_AvatarSkillMaxChargeCountNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AvatarSkillMaxChargeCountNotifyOuterClass.internal_static_AvatarSkillMaxChargeCountNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarSkillMaxChargeCountNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AvatarSkillMaxChargeCountNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.skillId_ = 0;
                this.maxChargeCount_ = 0;
                this.avatarGuid_ = 0L;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AvatarSkillMaxChargeCountNotifyOuterClass.internal_static_AvatarSkillMaxChargeCountNotify_descriptor;
            }
            
            @Override
            public AvatarSkillMaxChargeCountNotify getDefaultInstanceForType() {
                return AvatarSkillMaxChargeCountNotify.getDefaultInstance();
            }
            
            @Override
            public AvatarSkillMaxChargeCountNotify build() {
                final AvatarSkillMaxChargeCountNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AvatarSkillMaxChargeCountNotify buildPartial() {
                final AvatarSkillMaxChargeCountNotify result = new AvatarSkillMaxChargeCountNotify(this);
                result.skillId_ = this.skillId_;
                result.maxChargeCount_ = this.maxChargeCount_;
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
                if (other instanceof AvatarSkillMaxChargeCountNotify) {
                    return this.mergeFrom((AvatarSkillMaxChargeCountNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AvatarSkillMaxChargeCountNotify other) {
                if (other == AvatarSkillMaxChargeCountNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getSkillId() != 0) {
                    this.setSkillId(other.getSkillId());
                }
                if (other.getMaxChargeCount() != 0) {
                    this.setMaxChargeCount(other.getMaxChargeCount());
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
                AvatarSkillMaxChargeCountNotify parsedMessage = null;
                try {
                    parsedMessage = AvatarSkillMaxChargeCountNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AvatarSkillMaxChargeCountNotify)e.getUnfinishedMessage();
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
            public int getSkillId() {
                return this.skillId_;
            }
            
            public Builder setSkillId(final int value) {
                this.skillId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSkillId() {
                this.skillId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMaxChargeCount() {
                return this.maxChargeCount_;
            }
            
            public Builder setMaxChargeCount(final int value) {
                this.maxChargeCount_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMaxChargeCount() {
                this.maxChargeCount_ = 0;
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface AvatarSkillMaxChargeCountNotifyOrBuilder extends MessageOrBuilder
    {
        int getSkillId();
        
        int getMaxChargeCount();
        
        long getAvatarGuid();
    }
}
