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

public final class WeaponPromoteReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_WeaponPromoteReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WeaponPromoteReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WeaponPromoteReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WeaponPromoteReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016WeaponPromoteReq.proto\".\n\u0010WeaponPromoteReq\u0012\u001a\n\u0012target_weapon_guid\u0018\u0005 \u0001(\u0004B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WeaponPromoteReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_WeaponPromoteReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WeaponPromoteReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WeaponPromoteReqOuterClass.internal_static_WeaponPromoteReq_descriptor, new String[] { "TargetWeaponGuid" });
    }
    
    public static final class WeaponPromoteReq extends GeneratedMessageV3 implements WeaponPromoteReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int TARGET_WEAPON_GUID_FIELD_NUMBER = 5;
        private long targetWeaponGuid_;
        private byte memoizedIsInitialized;
        private static final WeaponPromoteReq DEFAULT_INSTANCE;
        private static final Parser<WeaponPromoteReq> PARSER;
        
        private WeaponPromoteReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private WeaponPromoteReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WeaponPromoteReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WeaponPromoteReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 40: {
                            this.targetWeaponGuid_ = input.readUInt64();
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
            return WeaponPromoteReqOuterClass.internal_static_WeaponPromoteReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WeaponPromoteReqOuterClass.internal_static_WeaponPromoteReq_fieldAccessorTable.ensureFieldAccessorsInitialized(WeaponPromoteReq.class, Builder.class);
        }
        
        @Override
        public long getTargetWeaponGuid() {
            return this.targetWeaponGuid_;
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
            if (this.targetWeaponGuid_ != 0L) {
                output.writeUInt64(5, this.targetWeaponGuid_);
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
            if (this.targetWeaponGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(5, this.targetWeaponGuid_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WeaponPromoteReq)) {
                return super.equals(obj);
            }
            final WeaponPromoteReq other = (WeaponPromoteReq)obj;
            return this.getTargetWeaponGuid() == other.getTargetWeaponGuid() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 5;
            hash = 53 * hash + Internal.hashLong(this.getTargetWeaponGuid());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WeaponPromoteReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WeaponPromoteReq.PARSER.parseFrom(data);
        }
        
        public static WeaponPromoteReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WeaponPromoteReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WeaponPromoteReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WeaponPromoteReq.PARSER.parseFrom(data);
        }
        
        public static WeaponPromoteReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WeaponPromoteReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WeaponPromoteReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WeaponPromoteReq.PARSER.parseFrom(data);
        }
        
        public static WeaponPromoteReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WeaponPromoteReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WeaponPromoteReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeaponPromoteReq.PARSER, input);
        }
        
        public static WeaponPromoteReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeaponPromoteReq.PARSER, input, extensionRegistry);
        }
        
        public static WeaponPromoteReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WeaponPromoteReq.PARSER, input);
        }
        
        public static WeaponPromoteReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WeaponPromoteReq.PARSER, input, extensionRegistry);
        }
        
        public static WeaponPromoteReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeaponPromoteReq.PARSER, input);
        }
        
        public static WeaponPromoteReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeaponPromoteReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WeaponPromoteReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WeaponPromoteReq prototype) {
            return WeaponPromoteReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WeaponPromoteReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WeaponPromoteReq getDefaultInstance() {
            return WeaponPromoteReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<WeaponPromoteReq> parser() {
            return WeaponPromoteReq.PARSER;
        }
        
        @Override
        public Parser<WeaponPromoteReq> getParserForType() {
            return WeaponPromoteReq.PARSER;
        }
        
        @Override
        public WeaponPromoteReq getDefaultInstanceForType() {
            return WeaponPromoteReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WeaponPromoteReq();
            PARSER = new AbstractParser<WeaponPromoteReq>() {
                @Override
                public WeaponPromoteReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WeaponPromoteReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WeaponPromoteReqOrBuilder
        {
            private long targetWeaponGuid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WeaponPromoteReqOuterClass.internal_static_WeaponPromoteReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WeaponPromoteReqOuterClass.internal_static_WeaponPromoteReq_fieldAccessorTable.ensureFieldAccessorsInitialized(WeaponPromoteReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (WeaponPromoteReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.targetWeaponGuid_ = 0L;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WeaponPromoteReqOuterClass.internal_static_WeaponPromoteReq_descriptor;
            }
            
            @Override
            public WeaponPromoteReq getDefaultInstanceForType() {
                return WeaponPromoteReq.getDefaultInstance();
            }
            
            @Override
            public WeaponPromoteReq build() {
                final WeaponPromoteReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WeaponPromoteReq buildPartial() {
                final WeaponPromoteReq result = new WeaponPromoteReq(this);
                result.targetWeaponGuid_ = this.targetWeaponGuid_;
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
                if (other instanceof WeaponPromoteReq) {
                    return this.mergeFrom((WeaponPromoteReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WeaponPromoteReq other) {
                if (other == WeaponPromoteReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getTargetWeaponGuid() != 0L) {
                    this.setTargetWeaponGuid(other.getTargetWeaponGuid());
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
                WeaponPromoteReq parsedMessage = null;
                try {
                    parsedMessage = WeaponPromoteReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WeaponPromoteReq)e.getUnfinishedMessage();
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
            public long getTargetWeaponGuid() {
                return this.targetWeaponGuid_;
            }
            
            public Builder setTargetWeaponGuid(final long value) {
                this.targetWeaponGuid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTargetWeaponGuid() {
                this.targetWeaponGuid_ = 0L;
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
    
    public interface WeaponPromoteReqOrBuilder extends MessageOrBuilder
    {
        long getTargetWeaponGuid();
    }
}
