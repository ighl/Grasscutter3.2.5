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

public final class SetEquipLockStateReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_SetEquipLockStateReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SetEquipLockStateReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SetEquipLockStateReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SetEquipLockStateReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001aSetEquipLockStateReq.proto\"D\n\u0014SetEquipLockStateReq\u0012\u0011\n\tis_locked\u0018\u000f \u0001(\b\u0012\u0019\n\u0011target_equip_guid\u0018\t \u0001(\u0004B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SetEquipLockStateReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_SetEquipLockStateReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SetEquipLockStateReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SetEquipLockStateReqOuterClass.internal_static_SetEquipLockStateReq_descriptor, new String[] { "IsLocked", "TargetEquipGuid" });
    }
    
    public static final class SetEquipLockStateReq extends GeneratedMessageV3 implements SetEquipLockStateReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int IS_LOCKED_FIELD_NUMBER = 15;
        private boolean isLocked_;
        public static final int TARGET_EQUIP_GUID_FIELD_NUMBER = 9;
        private long targetEquipGuid_;
        private byte memoizedIsInitialized;
        private static final SetEquipLockStateReq DEFAULT_INSTANCE;
        private static final Parser<SetEquipLockStateReq> PARSER;
        
        private SetEquipLockStateReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SetEquipLockStateReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SetEquipLockStateReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SetEquipLockStateReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.targetEquipGuid_ = input.readUInt64();
                            continue;
                        }
                        case 120: {
                            this.isLocked_ = input.readBool();
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
            return SetEquipLockStateReqOuterClass.internal_static_SetEquipLockStateReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SetEquipLockStateReqOuterClass.internal_static_SetEquipLockStateReq_fieldAccessorTable.ensureFieldAccessorsInitialized(SetEquipLockStateReq.class, Builder.class);
        }
        
        @Override
        public boolean getIsLocked() {
            return this.isLocked_;
        }
        
        @Override
        public long getTargetEquipGuid() {
            return this.targetEquipGuid_;
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
            if (this.targetEquipGuid_ != 0L) {
                output.writeUInt64(9, this.targetEquipGuid_);
            }
            if (this.isLocked_) {
                output.writeBool(15, this.isLocked_);
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
            if (this.targetEquipGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(9, this.targetEquipGuid_);
            }
            if (this.isLocked_) {
                size += CodedOutputStream.computeBoolSize(15, this.isLocked_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SetEquipLockStateReq)) {
                return super.equals(obj);
            }
            final SetEquipLockStateReq other = (SetEquipLockStateReq)obj;
            return this.getIsLocked() == other.getIsLocked() && this.getTargetEquipGuid() == other.getTargetEquipGuid() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 15;
            hash = 53 * hash + Internal.hashBoolean(this.getIsLocked());
            hash = 37 * hash + 9;
            hash = 53 * hash + Internal.hashLong(this.getTargetEquipGuid());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SetEquipLockStateReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SetEquipLockStateReq.PARSER.parseFrom(data);
        }
        
        public static SetEquipLockStateReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetEquipLockStateReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetEquipLockStateReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SetEquipLockStateReq.PARSER.parseFrom(data);
        }
        
        public static SetEquipLockStateReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetEquipLockStateReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetEquipLockStateReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SetEquipLockStateReq.PARSER.parseFrom(data);
        }
        
        public static SetEquipLockStateReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetEquipLockStateReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetEquipLockStateReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetEquipLockStateReq.PARSER, input);
        }
        
        public static SetEquipLockStateReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetEquipLockStateReq.PARSER, input, extensionRegistry);
        }
        
        public static SetEquipLockStateReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SetEquipLockStateReq.PARSER, input);
        }
        
        public static SetEquipLockStateReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SetEquipLockStateReq.PARSER, input, extensionRegistry);
        }
        
        public static SetEquipLockStateReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetEquipLockStateReq.PARSER, input);
        }
        
        public static SetEquipLockStateReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetEquipLockStateReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SetEquipLockStateReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SetEquipLockStateReq prototype) {
            return SetEquipLockStateReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SetEquipLockStateReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SetEquipLockStateReq getDefaultInstance() {
            return SetEquipLockStateReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<SetEquipLockStateReq> parser() {
            return SetEquipLockStateReq.PARSER;
        }
        
        @Override
        public Parser<SetEquipLockStateReq> getParserForType() {
            return SetEquipLockStateReq.PARSER;
        }
        
        @Override
        public SetEquipLockStateReq getDefaultInstanceForType() {
            return SetEquipLockStateReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SetEquipLockStateReq();
            PARSER = new AbstractParser<SetEquipLockStateReq>() {
                @Override
                public SetEquipLockStateReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SetEquipLockStateReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SetEquipLockStateReqOrBuilder
        {
            private boolean isLocked_;
            private long targetEquipGuid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SetEquipLockStateReqOuterClass.internal_static_SetEquipLockStateReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SetEquipLockStateReqOuterClass.internal_static_SetEquipLockStateReq_fieldAccessorTable.ensureFieldAccessorsInitialized(SetEquipLockStateReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SetEquipLockStateReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.isLocked_ = false;
                this.targetEquipGuid_ = 0L;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SetEquipLockStateReqOuterClass.internal_static_SetEquipLockStateReq_descriptor;
            }
            
            @Override
            public SetEquipLockStateReq getDefaultInstanceForType() {
                return SetEquipLockStateReq.getDefaultInstance();
            }
            
            @Override
            public SetEquipLockStateReq build() {
                final SetEquipLockStateReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SetEquipLockStateReq buildPartial() {
                final SetEquipLockStateReq result = new SetEquipLockStateReq(this);
                result.isLocked_ = this.isLocked_;
                result.targetEquipGuid_ = this.targetEquipGuid_;
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
                if (other instanceof SetEquipLockStateReq) {
                    return this.mergeFrom((SetEquipLockStateReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SetEquipLockStateReq other) {
                if (other == SetEquipLockStateReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getIsLocked()) {
                    this.setIsLocked(other.getIsLocked());
                }
                if (other.getTargetEquipGuid() != 0L) {
                    this.setTargetEquipGuid(other.getTargetEquipGuid());
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
                SetEquipLockStateReq parsedMessage = null;
                try {
                    parsedMessage = SetEquipLockStateReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SetEquipLockStateReq)e.getUnfinishedMessage();
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
            public boolean getIsLocked() {
                return this.isLocked_;
            }
            
            public Builder setIsLocked(final boolean value) {
                this.isLocked_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsLocked() {
                this.isLocked_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public long getTargetEquipGuid() {
                return this.targetEquipGuid_;
            }
            
            public Builder setTargetEquipGuid(final long value) {
                this.targetEquipGuid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTargetEquipGuid() {
                this.targetEquipGuid_ = 0L;
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
    
    public interface SetEquipLockStateReqOrBuilder extends MessageOrBuilder
    {
        boolean getIsLocked();
        
        long getTargetEquipGuid();
    }
}
