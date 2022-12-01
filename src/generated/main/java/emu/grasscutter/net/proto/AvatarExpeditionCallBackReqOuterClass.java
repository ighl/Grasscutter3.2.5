// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.util.List;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class AvatarExpeditionCallBackReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_AvatarExpeditionCallBackReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarExpeditionCallBackReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AvatarExpeditionCallBackReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AvatarExpeditionCallBackReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n!AvatarExpeditionCallBackReq.proto\"2\n\u001bAvatarExpeditionCallBackReq\u0012\u0013\n\u000bavatar_guid\u0018\r \u0003(\u0004B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AvatarExpeditionCallBackReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AvatarExpeditionCallBackReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AvatarExpeditionCallBackReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarExpeditionCallBackReqOuterClass.internal_static_AvatarExpeditionCallBackReq_descriptor, new String[] { "AvatarGuid" });
    }
    
    public static final class AvatarExpeditionCallBackReq extends GeneratedMessageV3 implements AvatarExpeditionCallBackReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int AVATAR_GUID_FIELD_NUMBER = 13;
        private Internal.LongList avatarGuid_;
        private int avatarGuidMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final AvatarExpeditionCallBackReq DEFAULT_INSTANCE;
        private static final Parser<AvatarExpeditionCallBackReq> PARSER;
        
        private AvatarExpeditionCallBackReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.avatarGuidMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private AvatarExpeditionCallBackReq() {
            this.avatarGuidMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.avatarGuid_ = GeneratedMessageV3.emptyLongList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AvatarExpeditionCallBackReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AvatarExpeditionCallBackReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
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
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.avatarGuid_ = GeneratedMessageV3.newLongList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.avatarGuid_.addLong(input.readUInt64());
                            continue;
                        }
                        case 106: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.avatarGuid_ = GeneratedMessageV3.newLongList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.avatarGuid_.addLong(input.readUInt64());
                            }
                            input.popLimit(limit);
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
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.avatarGuid_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return AvatarExpeditionCallBackReqOuterClass.internal_static_AvatarExpeditionCallBackReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AvatarExpeditionCallBackReqOuterClass.internal_static_AvatarExpeditionCallBackReq_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarExpeditionCallBackReq.class, Builder.class);
        }
        
        @Override
        public List<Long> getAvatarGuidList() {
            return this.avatarGuid_;
        }
        
        @Override
        public int getAvatarGuidCount() {
            return this.avatarGuid_.size();
        }
        
        @Override
        public long getAvatarGuid(final int index) {
            return this.avatarGuid_.getLong(index);
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
            this.getSerializedSize();
            if (this.getAvatarGuidList().size() > 0) {
                output.writeUInt32NoTag(106);
                output.writeUInt32NoTag(this.avatarGuidMemoizedSerializedSize);
            }
            for (int i = 0; i < this.avatarGuid_.size(); ++i) {
                output.writeUInt64NoTag(this.avatarGuid_.getLong(i));
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
            int dataSize = 0;
            for (int i = 0; i < this.avatarGuid_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt64SizeNoTag(this.avatarGuid_.getLong(i));
            }
            size += dataSize;
            if (!this.getAvatarGuidList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.avatarGuidMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarExpeditionCallBackReq)) {
                return super.equals(obj);
            }
            final AvatarExpeditionCallBackReq other = (AvatarExpeditionCallBackReq)obj;
            return this.getAvatarGuidList().equals(other.getAvatarGuidList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getAvatarGuidCount() > 0) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.getAvatarGuidList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AvatarExpeditionCallBackReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AvatarExpeditionCallBackReq.PARSER.parseFrom(data);
        }
        
        public static AvatarExpeditionCallBackReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarExpeditionCallBackReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarExpeditionCallBackReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AvatarExpeditionCallBackReq.PARSER.parseFrom(data);
        }
        
        public static AvatarExpeditionCallBackReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarExpeditionCallBackReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarExpeditionCallBackReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AvatarExpeditionCallBackReq.PARSER.parseFrom(data);
        }
        
        public static AvatarExpeditionCallBackReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarExpeditionCallBackReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarExpeditionCallBackReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExpeditionCallBackReq.PARSER, input);
        }
        
        public static AvatarExpeditionCallBackReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExpeditionCallBackReq.PARSER, input, extensionRegistry);
        }
        
        public static AvatarExpeditionCallBackReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarExpeditionCallBackReq.PARSER, input);
        }
        
        public static AvatarExpeditionCallBackReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarExpeditionCallBackReq.PARSER, input, extensionRegistry);
        }
        
        public static AvatarExpeditionCallBackReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExpeditionCallBackReq.PARSER, input);
        }
        
        public static AvatarExpeditionCallBackReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExpeditionCallBackReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AvatarExpeditionCallBackReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AvatarExpeditionCallBackReq prototype) {
            return AvatarExpeditionCallBackReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AvatarExpeditionCallBackReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AvatarExpeditionCallBackReq getDefaultInstance() {
            return AvatarExpeditionCallBackReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<AvatarExpeditionCallBackReq> parser() {
            return AvatarExpeditionCallBackReq.PARSER;
        }
        
        @Override
        public Parser<AvatarExpeditionCallBackReq> getParserForType() {
            return AvatarExpeditionCallBackReq.PARSER;
        }
        
        @Override
        public AvatarExpeditionCallBackReq getDefaultInstanceForType() {
            return AvatarExpeditionCallBackReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AvatarExpeditionCallBackReq();
            PARSER = new AbstractParser<AvatarExpeditionCallBackReq>() {
                @Override
                public AvatarExpeditionCallBackReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AvatarExpeditionCallBackReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AvatarExpeditionCallBackReqOrBuilder
        {
            private int bitField0_;
            private Internal.LongList avatarGuid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AvatarExpeditionCallBackReqOuterClass.internal_static_AvatarExpeditionCallBackReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AvatarExpeditionCallBackReqOuterClass.internal_static_AvatarExpeditionCallBackReq_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarExpeditionCallBackReq.class, Builder.class);
            }
            
            private Builder() {
                this.avatarGuid_ = GeneratedMessageV3.emptyLongList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.avatarGuid_ = GeneratedMessageV3.emptyLongList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AvatarExpeditionCallBackReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.avatarGuid_ = GeneratedMessageV3.emptyLongList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AvatarExpeditionCallBackReqOuterClass.internal_static_AvatarExpeditionCallBackReq_descriptor;
            }
            
            @Override
            public AvatarExpeditionCallBackReq getDefaultInstanceForType() {
                return AvatarExpeditionCallBackReq.getDefaultInstance();
            }
            
            @Override
            public AvatarExpeditionCallBackReq build() {
                final AvatarExpeditionCallBackReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AvatarExpeditionCallBackReq buildPartial() {
                final AvatarExpeditionCallBackReq result = new AvatarExpeditionCallBackReq(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.avatarGuid_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
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
                if (other instanceof AvatarExpeditionCallBackReq) {
                    return this.mergeFrom((AvatarExpeditionCallBackReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AvatarExpeditionCallBackReq other) {
                if (other == AvatarExpeditionCallBackReq.getDefaultInstance()) {
                    return this;
                }
                if (!other.avatarGuid_.isEmpty()) {
                    if (this.avatarGuid_.isEmpty()) {
                        this.avatarGuid_ = other.avatarGuid_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureAvatarGuidIsMutable();
                        this.avatarGuid_.addAll(other.avatarGuid_);
                    }
                    this.onChanged();
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
                AvatarExpeditionCallBackReq parsedMessage = null;
                try {
                    parsedMessage = AvatarExpeditionCallBackReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AvatarExpeditionCallBackReq)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureAvatarGuidIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.avatarGuid_ = GeneratedMessageV3.mutableCopy(this.avatarGuid_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Long> getAvatarGuidList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Long>)this.avatarGuid_) : this.avatarGuid_;
            }
            
            @Override
            public int getAvatarGuidCount() {
                return this.avatarGuid_.size();
            }
            
            @Override
            public long getAvatarGuid(final int index) {
                return this.avatarGuid_.getLong(index);
            }
            
            public Builder setAvatarGuid(final int index, final long value) {
                this.ensureAvatarGuidIsMutable();
                this.avatarGuid_.setLong(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addAvatarGuid(final long value) {
                this.ensureAvatarGuidIsMutable();
                this.avatarGuid_.addLong(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllAvatarGuid(final Iterable<? extends Long> values) {
                this.ensureAvatarGuidIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.avatarGuid_);
                this.onChanged();
                return this;
            }
            
            public Builder clearAvatarGuid() {
                this.avatarGuid_ = GeneratedMessageV3.emptyLongList();
                this.bitField0_ &= 0xFFFFFFFE;
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
    
    public interface AvatarExpeditionCallBackReqOrBuilder extends MessageOrBuilder
    {
        List<Long> getAvatarGuidList();
        
        int getAvatarGuidCount();
        
        long getAvatarGuid(final int p0);
    }
}
