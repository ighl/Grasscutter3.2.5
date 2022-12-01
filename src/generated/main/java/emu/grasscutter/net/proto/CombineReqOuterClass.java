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

public final class CombineReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_CombineReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CombineReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CombineReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CombineReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0010CombineReq.proto\"L\n\nCombineReq\u0012\u0015\n\rcombine_count\u0018\f \u0001(\r\u0012\u0012\n\ncombine_id\u0018\t \u0001(\r\u0012\u0013\n\u000bavatar_guid\u0018\u000e \u0001(\u0004B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CombineReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_CombineReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CombineReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CombineReqOuterClass.internal_static_CombineReq_descriptor, new String[] { "CombineCount", "CombineId", "AvatarGuid" });
    }
    
    public static final class CombineReq extends GeneratedMessageV3 implements CombineReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int COMBINE_COUNT_FIELD_NUMBER = 12;
        private int combineCount_;
        public static final int COMBINE_ID_FIELD_NUMBER = 9;
        private int combineId_;
        public static final int AVATAR_GUID_FIELD_NUMBER = 14;
        private long avatarGuid_;
        private byte memoizedIsInitialized;
        private static final CombineReq DEFAULT_INSTANCE;
        private static final Parser<CombineReq> PARSER;
        
        private CombineReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private CombineReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CombineReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CombineReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 72: {
                            this.combineId_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
                            this.combineCount_ = input.readUInt32();
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
            return CombineReqOuterClass.internal_static_CombineReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CombineReqOuterClass.internal_static_CombineReq_fieldAccessorTable.ensureFieldAccessorsInitialized(CombineReq.class, Builder.class);
        }
        
        @Override
        public int getCombineCount() {
            return this.combineCount_;
        }
        
        @Override
        public int getCombineId() {
            return this.combineId_;
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
            if (this.combineId_ != 0) {
                output.writeUInt32(9, this.combineId_);
            }
            if (this.combineCount_ != 0) {
                output.writeUInt32(12, this.combineCount_);
            }
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
            if (this.combineId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.combineId_);
            }
            if (this.combineCount_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.combineCount_);
            }
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
            if (!(obj instanceof CombineReq)) {
                return super.equals(obj);
            }
            final CombineReq other = (CombineReq)obj;
            return this.getCombineCount() == other.getCombineCount() && this.getCombineId() == other.getCombineId() && this.getAvatarGuid() == other.getAvatarGuid() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getCombineCount();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getCombineId();
            hash = 37 * hash + 14;
            hash = 53 * hash + Internal.hashLong(this.getAvatarGuid());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CombineReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CombineReq.PARSER.parseFrom(data);
        }
        
        public static CombineReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CombineReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CombineReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CombineReq.PARSER.parseFrom(data);
        }
        
        public static CombineReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CombineReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CombineReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CombineReq.PARSER.parseFrom(data);
        }
        
        public static CombineReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CombineReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CombineReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CombineReq.PARSER, input);
        }
        
        public static CombineReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CombineReq.PARSER, input, extensionRegistry);
        }
        
        public static CombineReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CombineReq.PARSER, input);
        }
        
        public static CombineReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CombineReq.PARSER, input, extensionRegistry);
        }
        
        public static CombineReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CombineReq.PARSER, input);
        }
        
        public static CombineReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CombineReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CombineReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CombineReq prototype) {
            return CombineReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CombineReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CombineReq getDefaultInstance() {
            return CombineReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<CombineReq> parser() {
            return CombineReq.PARSER;
        }
        
        @Override
        public Parser<CombineReq> getParserForType() {
            return CombineReq.PARSER;
        }
        
        @Override
        public CombineReq getDefaultInstanceForType() {
            return CombineReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CombineReq();
            PARSER = new AbstractParser<CombineReq>() {
                @Override
                public CombineReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CombineReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CombineReqOrBuilder
        {
            private int combineCount_;
            private int combineId_;
            private long avatarGuid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CombineReqOuterClass.internal_static_CombineReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CombineReqOuterClass.internal_static_CombineReq_fieldAccessorTable.ensureFieldAccessorsInitialized(CombineReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (CombineReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.combineCount_ = 0;
                this.combineId_ = 0;
                this.avatarGuid_ = 0L;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CombineReqOuterClass.internal_static_CombineReq_descriptor;
            }
            
            @Override
            public CombineReq getDefaultInstanceForType() {
                return CombineReq.getDefaultInstance();
            }
            
            @Override
            public CombineReq build() {
                final CombineReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CombineReq buildPartial() {
                final CombineReq result = new CombineReq(this);
                result.combineCount_ = this.combineCount_;
                result.combineId_ = this.combineId_;
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
                if (other instanceof CombineReq) {
                    return this.mergeFrom((CombineReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CombineReq other) {
                if (other == CombineReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getCombineCount() != 0) {
                    this.setCombineCount(other.getCombineCount());
                }
                if (other.getCombineId() != 0) {
                    this.setCombineId(other.getCombineId());
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
                CombineReq parsedMessage = null;
                try {
                    parsedMessage = CombineReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CombineReq)e.getUnfinishedMessage();
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
            public int getCombineCount() {
                return this.combineCount_;
            }
            
            public Builder setCombineCount(final int value) {
                this.combineCount_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCombineCount() {
                this.combineCount_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCombineId() {
                return this.combineId_;
            }
            
            public Builder setCombineId(final int value) {
                this.combineId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCombineId() {
                this.combineId_ = 0;
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
    
    public interface CombineReqOrBuilder extends MessageOrBuilder
    {
        int getCombineCount();
        
        int getCombineId();
        
        long getAvatarGuid();
    }
}
