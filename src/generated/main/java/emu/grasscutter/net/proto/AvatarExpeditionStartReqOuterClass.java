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

public final class AvatarExpeditionStartReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_AvatarExpeditionStartReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarExpeditionStartReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AvatarExpeditionStartReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AvatarExpeditionStartReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001eAvatarExpeditionStartReq.proto\"R\n\u0018AvatarExpeditionStartReq\u0012\u000e\n\u0006exp_id\u0018\t \u0001(\r\u0012\u0013\n\u000bavatar_guid\u0018\n \u0001(\u0004\u0012\u0011\n\thour_time\u0018\u0002 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AvatarExpeditionStartReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AvatarExpeditionStartReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AvatarExpeditionStartReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarExpeditionStartReqOuterClass.internal_static_AvatarExpeditionStartReq_descriptor, new String[] { "ExpId", "AvatarGuid", "HourTime" });
    }
    
    public static final class AvatarExpeditionStartReq extends GeneratedMessageV3 implements AvatarExpeditionStartReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int EXP_ID_FIELD_NUMBER = 9;
        private int expId_;
        public static final int AVATAR_GUID_FIELD_NUMBER = 10;
        private long avatarGuid_;
        public static final int HOUR_TIME_FIELD_NUMBER = 2;
        private int hourTime_;
        private byte memoizedIsInitialized;
        private static final AvatarExpeditionStartReq DEFAULT_INSTANCE;
        private static final Parser<AvatarExpeditionStartReq> PARSER;
        
        private AvatarExpeditionStartReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AvatarExpeditionStartReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AvatarExpeditionStartReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AvatarExpeditionStartReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 16: {
                            this.hourTime_ = input.readUInt32();
                            continue;
                        }
                        case 72: {
                            this.expId_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
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
            return AvatarExpeditionStartReqOuterClass.internal_static_AvatarExpeditionStartReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AvatarExpeditionStartReqOuterClass.internal_static_AvatarExpeditionStartReq_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarExpeditionStartReq.class, Builder.class);
        }
        
        @Override
        public int getExpId() {
            return this.expId_;
        }
        
        @Override
        public long getAvatarGuid() {
            return this.avatarGuid_;
        }
        
        @Override
        public int getHourTime() {
            return this.hourTime_;
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
            if (this.hourTime_ != 0) {
                output.writeUInt32(2, this.hourTime_);
            }
            if (this.expId_ != 0) {
                output.writeUInt32(9, this.expId_);
            }
            if (this.avatarGuid_ != 0L) {
                output.writeUInt64(10, this.avatarGuid_);
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
            if (this.hourTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.hourTime_);
            }
            if (this.expId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.expId_);
            }
            if (this.avatarGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(10, this.avatarGuid_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarExpeditionStartReq)) {
                return super.equals(obj);
            }
            final AvatarExpeditionStartReq other = (AvatarExpeditionStartReq)obj;
            return this.getExpId() == other.getExpId() && this.getAvatarGuid() == other.getAvatarGuid() && this.getHourTime() == other.getHourTime() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getExpId();
            hash = 37 * hash + 10;
            hash = 53 * hash + Internal.hashLong(this.getAvatarGuid());
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getHourTime();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AvatarExpeditionStartReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AvatarExpeditionStartReq.PARSER.parseFrom(data);
        }
        
        public static AvatarExpeditionStartReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarExpeditionStartReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarExpeditionStartReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AvatarExpeditionStartReq.PARSER.parseFrom(data);
        }
        
        public static AvatarExpeditionStartReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarExpeditionStartReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarExpeditionStartReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AvatarExpeditionStartReq.PARSER.parseFrom(data);
        }
        
        public static AvatarExpeditionStartReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarExpeditionStartReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarExpeditionStartReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExpeditionStartReq.PARSER, input);
        }
        
        public static AvatarExpeditionStartReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExpeditionStartReq.PARSER, input, extensionRegistry);
        }
        
        public static AvatarExpeditionStartReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarExpeditionStartReq.PARSER, input);
        }
        
        public static AvatarExpeditionStartReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarExpeditionStartReq.PARSER, input, extensionRegistry);
        }
        
        public static AvatarExpeditionStartReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExpeditionStartReq.PARSER, input);
        }
        
        public static AvatarExpeditionStartReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExpeditionStartReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AvatarExpeditionStartReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AvatarExpeditionStartReq prototype) {
            return AvatarExpeditionStartReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AvatarExpeditionStartReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AvatarExpeditionStartReq getDefaultInstance() {
            return AvatarExpeditionStartReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<AvatarExpeditionStartReq> parser() {
            return AvatarExpeditionStartReq.PARSER;
        }
        
        @Override
        public Parser<AvatarExpeditionStartReq> getParserForType() {
            return AvatarExpeditionStartReq.PARSER;
        }
        
        @Override
        public AvatarExpeditionStartReq getDefaultInstanceForType() {
            return AvatarExpeditionStartReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AvatarExpeditionStartReq();
            PARSER = new AbstractParser<AvatarExpeditionStartReq>() {
                @Override
                public AvatarExpeditionStartReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AvatarExpeditionStartReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AvatarExpeditionStartReqOrBuilder
        {
            private int expId_;
            private long avatarGuid_;
            private int hourTime_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AvatarExpeditionStartReqOuterClass.internal_static_AvatarExpeditionStartReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AvatarExpeditionStartReqOuterClass.internal_static_AvatarExpeditionStartReq_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarExpeditionStartReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AvatarExpeditionStartReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.expId_ = 0;
                this.avatarGuid_ = 0L;
                this.hourTime_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AvatarExpeditionStartReqOuterClass.internal_static_AvatarExpeditionStartReq_descriptor;
            }
            
            @Override
            public AvatarExpeditionStartReq getDefaultInstanceForType() {
                return AvatarExpeditionStartReq.getDefaultInstance();
            }
            
            @Override
            public AvatarExpeditionStartReq build() {
                final AvatarExpeditionStartReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AvatarExpeditionStartReq buildPartial() {
                final AvatarExpeditionStartReq result = new AvatarExpeditionStartReq(this);
                result.expId_ = this.expId_;
                result.avatarGuid_ = this.avatarGuid_;
                result.hourTime_ = this.hourTime_;
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
                if (other instanceof AvatarExpeditionStartReq) {
                    return this.mergeFrom((AvatarExpeditionStartReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AvatarExpeditionStartReq other) {
                if (other == AvatarExpeditionStartReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getExpId() != 0) {
                    this.setExpId(other.getExpId());
                }
                if (other.getAvatarGuid() != 0L) {
                    this.setAvatarGuid(other.getAvatarGuid());
                }
                if (other.getHourTime() != 0) {
                    this.setHourTime(other.getHourTime());
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
                AvatarExpeditionStartReq parsedMessage = null;
                try {
                    parsedMessage = AvatarExpeditionStartReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AvatarExpeditionStartReq)e.getUnfinishedMessage();
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
            public int getExpId() {
                return this.expId_;
            }
            
            public Builder setExpId(final int value) {
                this.expId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearExpId() {
                this.expId_ = 0;
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
            public int getHourTime() {
                return this.hourTime_;
            }
            
            public Builder setHourTime(final int value) {
                this.hourTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearHourTime() {
                this.hourTime_ = 0;
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
    
    public interface AvatarExpeditionStartReqOrBuilder extends MessageOrBuilder
    {
        int getExpId();
        
        long getAvatarGuid();
        
        int getHourTime();
    }
}
