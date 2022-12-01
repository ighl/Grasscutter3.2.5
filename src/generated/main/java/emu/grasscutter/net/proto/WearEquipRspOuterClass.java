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

public final class WearEquipRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_WearEquipRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WearEquipRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WearEquipRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WearEquipRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0012WearEquipRsp.proto\"H\n\fWearEquipRsp\u0012\u0012\n\nequip_guid\u0018\u0001 \u0001(\u0004\u0012\u0013\n\u000bavatar_guid\u0018\u0007 \u0001(\u0004\u0012\u000f\n\u0007retcode\u0018\u0005 \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WearEquipRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_WearEquipRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WearEquipRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WearEquipRspOuterClass.internal_static_WearEquipRsp_descriptor, new String[] { "EquipGuid", "AvatarGuid", "Retcode" });
    }
    
    public static final class WearEquipRsp extends GeneratedMessageV3 implements WearEquipRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int EQUIP_GUID_FIELD_NUMBER = 1;
        private long equipGuid_;
        public static final int AVATAR_GUID_FIELD_NUMBER = 7;
        private long avatarGuid_;
        public static final int RETCODE_FIELD_NUMBER = 5;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final WearEquipRsp DEFAULT_INSTANCE;
        private static final Parser<WearEquipRsp> PARSER;
        
        private WearEquipRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private WearEquipRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WearEquipRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WearEquipRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.equipGuid_ = input.readUInt64();
                            continue;
                        }
                        case 40: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 56: {
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
            return WearEquipRspOuterClass.internal_static_WearEquipRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WearEquipRspOuterClass.internal_static_WearEquipRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(WearEquipRsp.class, Builder.class);
        }
        
        @Override
        public long getEquipGuid() {
            return this.equipGuid_;
        }
        
        @Override
        public long getAvatarGuid() {
            return this.avatarGuid_;
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
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
            if (this.equipGuid_ != 0L) {
                output.writeUInt64(1, this.equipGuid_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(5, this.retcode_);
            }
            if (this.avatarGuid_ != 0L) {
                output.writeUInt64(7, this.avatarGuid_);
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
            if (this.equipGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(1, this.equipGuid_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(5, this.retcode_);
            }
            if (this.avatarGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(7, this.avatarGuid_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WearEquipRsp)) {
                return super.equals(obj);
            }
            final WearEquipRsp other = (WearEquipRsp)obj;
            return this.getEquipGuid() == other.getEquipGuid() && this.getAvatarGuid() == other.getAvatarGuid() && this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + Internal.hashLong(this.getEquipGuid());
            hash = 37 * hash + 7;
            hash = 53 * hash + Internal.hashLong(this.getAvatarGuid());
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WearEquipRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WearEquipRsp.PARSER.parseFrom(data);
        }
        
        public static WearEquipRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WearEquipRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WearEquipRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WearEquipRsp.PARSER.parseFrom(data);
        }
        
        public static WearEquipRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WearEquipRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WearEquipRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WearEquipRsp.PARSER.parseFrom(data);
        }
        
        public static WearEquipRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WearEquipRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WearEquipRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WearEquipRsp.PARSER, input);
        }
        
        public static WearEquipRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WearEquipRsp.PARSER, input, extensionRegistry);
        }
        
        public static WearEquipRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WearEquipRsp.PARSER, input);
        }
        
        public static WearEquipRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WearEquipRsp.PARSER, input, extensionRegistry);
        }
        
        public static WearEquipRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WearEquipRsp.PARSER, input);
        }
        
        public static WearEquipRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WearEquipRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WearEquipRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WearEquipRsp prototype) {
            return WearEquipRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WearEquipRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WearEquipRsp getDefaultInstance() {
            return WearEquipRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<WearEquipRsp> parser() {
            return WearEquipRsp.PARSER;
        }
        
        @Override
        public Parser<WearEquipRsp> getParserForType() {
            return WearEquipRsp.PARSER;
        }
        
        @Override
        public WearEquipRsp getDefaultInstanceForType() {
            return WearEquipRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WearEquipRsp();
            PARSER = new AbstractParser<WearEquipRsp>() {
                @Override
                public WearEquipRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WearEquipRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WearEquipRspOrBuilder
        {
            private long equipGuid_;
            private long avatarGuid_;
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WearEquipRspOuterClass.internal_static_WearEquipRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WearEquipRspOuterClass.internal_static_WearEquipRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(WearEquipRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (WearEquipRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.equipGuid_ = 0L;
                this.avatarGuid_ = 0L;
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WearEquipRspOuterClass.internal_static_WearEquipRsp_descriptor;
            }
            
            @Override
            public WearEquipRsp getDefaultInstanceForType() {
                return WearEquipRsp.getDefaultInstance();
            }
            
            @Override
            public WearEquipRsp build() {
                final WearEquipRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WearEquipRsp buildPartial() {
                final WearEquipRsp result = new WearEquipRsp(this);
                result.equipGuid_ = this.equipGuid_;
                result.avatarGuid_ = this.avatarGuid_;
                result.retcode_ = this.retcode_;
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
                if (other instanceof WearEquipRsp) {
                    return this.mergeFrom((WearEquipRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WearEquipRsp other) {
                if (other == WearEquipRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getEquipGuid() != 0L) {
                    this.setEquipGuid(other.getEquipGuid());
                }
                if (other.getAvatarGuid() != 0L) {
                    this.setAvatarGuid(other.getAvatarGuid());
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
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
                WearEquipRsp parsedMessage = null;
                try {
                    parsedMessage = WearEquipRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WearEquipRsp)e.getUnfinishedMessage();
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
            public long getEquipGuid() {
                return this.equipGuid_;
            }
            
            public Builder setEquipGuid(final long value) {
                this.equipGuid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEquipGuid() {
                this.equipGuid_ = 0L;
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface WearEquipRspOrBuilder extends MessageOrBuilder
    {
        long getEquipGuid();
        
        long getAvatarGuid();
        
        int getRetcode();
    }
}
