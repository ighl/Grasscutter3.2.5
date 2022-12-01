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

public final class AvatarDieAnimationEndRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_AvatarDieAnimationEndRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarDieAnimationEndRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AvatarDieAnimationEndRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AvatarDieAnimationEndRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001eAvatarDieAnimationEndRsp.proto\"O\n\u0018AvatarDieAnimationEndRsp\u0012\u0010\n\bskill_id\u0018\r \u0001(\r\u0012\u000f\n\u0007retcode\u0018\u000e \u0001(\u0005\u0012\u0010\n\bdie_guid\u0018\u000f \u0001(\u0004B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AvatarDieAnimationEndRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AvatarDieAnimationEndRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AvatarDieAnimationEndRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarDieAnimationEndRspOuterClass.internal_static_AvatarDieAnimationEndRsp_descriptor, new String[] { "SkillId", "Retcode", "DieGuid" });
    }
    
    public static final class AvatarDieAnimationEndRsp extends GeneratedMessageV3 implements AvatarDieAnimationEndRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SKILL_ID_FIELD_NUMBER = 13;
        private int skillId_;
        public static final int RETCODE_FIELD_NUMBER = 14;
        private int retcode_;
        public static final int DIE_GUID_FIELD_NUMBER = 15;
        private long dieGuid_;
        private byte memoizedIsInitialized;
        private static final AvatarDieAnimationEndRsp DEFAULT_INSTANCE;
        private static final Parser<AvatarDieAnimationEndRsp> PARSER;
        
        private AvatarDieAnimationEndRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AvatarDieAnimationEndRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AvatarDieAnimationEndRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AvatarDieAnimationEndRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.skillId_ = input.readUInt32();
                            continue;
                        }
                        case 112: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 120: {
                            this.dieGuid_ = input.readUInt64();
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
            return AvatarDieAnimationEndRspOuterClass.internal_static_AvatarDieAnimationEndRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AvatarDieAnimationEndRspOuterClass.internal_static_AvatarDieAnimationEndRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarDieAnimationEndRsp.class, Builder.class);
        }
        
        @Override
        public int getSkillId() {
            return this.skillId_;
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public long getDieGuid() {
            return this.dieGuid_;
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
                output.writeUInt32(13, this.skillId_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(14, this.retcode_);
            }
            if (this.dieGuid_ != 0L) {
                output.writeUInt64(15, this.dieGuid_);
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
                size += CodedOutputStream.computeUInt32Size(13, this.skillId_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(14, this.retcode_);
            }
            if (this.dieGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(15, this.dieGuid_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarDieAnimationEndRsp)) {
                return super.equals(obj);
            }
            final AvatarDieAnimationEndRsp other = (AvatarDieAnimationEndRsp)obj;
            return this.getSkillId() == other.getSkillId() && this.getRetcode() == other.getRetcode() && this.getDieGuid() == other.getDieGuid() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getSkillId();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 15;
            hash = 53 * hash + Internal.hashLong(this.getDieGuid());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AvatarDieAnimationEndRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AvatarDieAnimationEndRsp.PARSER.parseFrom(data);
        }
        
        public static AvatarDieAnimationEndRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarDieAnimationEndRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarDieAnimationEndRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AvatarDieAnimationEndRsp.PARSER.parseFrom(data);
        }
        
        public static AvatarDieAnimationEndRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarDieAnimationEndRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarDieAnimationEndRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AvatarDieAnimationEndRsp.PARSER.parseFrom(data);
        }
        
        public static AvatarDieAnimationEndRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarDieAnimationEndRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarDieAnimationEndRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarDieAnimationEndRsp.PARSER, input);
        }
        
        public static AvatarDieAnimationEndRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarDieAnimationEndRsp.PARSER, input, extensionRegistry);
        }
        
        public static AvatarDieAnimationEndRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarDieAnimationEndRsp.PARSER, input);
        }
        
        public static AvatarDieAnimationEndRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarDieAnimationEndRsp.PARSER, input, extensionRegistry);
        }
        
        public static AvatarDieAnimationEndRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarDieAnimationEndRsp.PARSER, input);
        }
        
        public static AvatarDieAnimationEndRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarDieAnimationEndRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AvatarDieAnimationEndRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AvatarDieAnimationEndRsp prototype) {
            return AvatarDieAnimationEndRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AvatarDieAnimationEndRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AvatarDieAnimationEndRsp getDefaultInstance() {
            return AvatarDieAnimationEndRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<AvatarDieAnimationEndRsp> parser() {
            return AvatarDieAnimationEndRsp.PARSER;
        }
        
        @Override
        public Parser<AvatarDieAnimationEndRsp> getParserForType() {
            return AvatarDieAnimationEndRsp.PARSER;
        }
        
        @Override
        public AvatarDieAnimationEndRsp getDefaultInstanceForType() {
            return AvatarDieAnimationEndRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AvatarDieAnimationEndRsp();
            PARSER = new AbstractParser<AvatarDieAnimationEndRsp>() {
                @Override
                public AvatarDieAnimationEndRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AvatarDieAnimationEndRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AvatarDieAnimationEndRspOrBuilder
        {
            private int skillId_;
            private int retcode_;
            private long dieGuid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AvatarDieAnimationEndRspOuterClass.internal_static_AvatarDieAnimationEndRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AvatarDieAnimationEndRspOuterClass.internal_static_AvatarDieAnimationEndRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarDieAnimationEndRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AvatarDieAnimationEndRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.skillId_ = 0;
                this.retcode_ = 0;
                this.dieGuid_ = 0L;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AvatarDieAnimationEndRspOuterClass.internal_static_AvatarDieAnimationEndRsp_descriptor;
            }
            
            @Override
            public AvatarDieAnimationEndRsp getDefaultInstanceForType() {
                return AvatarDieAnimationEndRsp.getDefaultInstance();
            }
            
            @Override
            public AvatarDieAnimationEndRsp build() {
                final AvatarDieAnimationEndRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AvatarDieAnimationEndRsp buildPartial() {
                final AvatarDieAnimationEndRsp result = new AvatarDieAnimationEndRsp(this);
                result.skillId_ = this.skillId_;
                result.retcode_ = this.retcode_;
                result.dieGuid_ = this.dieGuid_;
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
                if (other instanceof AvatarDieAnimationEndRsp) {
                    return this.mergeFrom((AvatarDieAnimationEndRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AvatarDieAnimationEndRsp other) {
                if (other == AvatarDieAnimationEndRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getSkillId() != 0) {
                    this.setSkillId(other.getSkillId());
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getDieGuid() != 0L) {
                    this.setDieGuid(other.getDieGuid());
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
                AvatarDieAnimationEndRsp parsedMessage = null;
                try {
                    parsedMessage = AvatarDieAnimationEndRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AvatarDieAnimationEndRsp)e.getUnfinishedMessage();
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
            public long getDieGuid() {
                return this.dieGuid_;
            }
            
            public Builder setDieGuid(final long value) {
                this.dieGuid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDieGuid() {
                this.dieGuid_ = 0L;
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
    
    public interface AvatarDieAnimationEndRspOrBuilder extends MessageOrBuilder
    {
        int getSkillId();
        
        int getRetcode();
        
        long getDieGuid();
    }
}
