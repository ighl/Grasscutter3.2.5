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

public final class VehicleMemberOuterClass
{
    private static final Descriptors.Descriptor internal_static_VehicleMember_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_VehicleMember_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private VehicleMemberOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return VehicleMemberOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0013VehicleMember.proto\">\n\rVehicleMember\u0012\u000b\n\u0003uid\u0018\u0001 \u0001(\r\u0012\u0013\n\u000bavatar_guid\u0018\u0002 \u0001(\u0004\u0012\u000b\n\u0003pos\u0018\u0003 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        VehicleMemberOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_VehicleMember_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_VehicleMember_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(VehicleMemberOuterClass.internal_static_VehicleMember_descriptor, new String[] { "Uid", "AvatarGuid", "Pos" });
    }
    
    public static final class VehicleMember extends GeneratedMessageV3 implements VehicleMemberOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int UID_FIELD_NUMBER = 1;
        private int uid_;
        public static final int AVATAR_GUID_FIELD_NUMBER = 2;
        private long avatarGuid_;
        public static final int POS_FIELD_NUMBER = 3;
        private int pos_;
        private byte memoizedIsInitialized;
        private static final VehicleMember DEFAULT_INSTANCE;
        private static final Parser<VehicleMember> PARSER;
        
        private VehicleMember(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private VehicleMember() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new VehicleMember();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private VehicleMember(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.uid_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.avatarGuid_ = input.readUInt64();
                            continue;
                        }
                        case 24: {
                            this.pos_ = input.readUInt32();
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
            return VehicleMemberOuterClass.internal_static_VehicleMember_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return VehicleMemberOuterClass.internal_static_VehicleMember_fieldAccessorTable.ensureFieldAccessorsInitialized(VehicleMember.class, Builder.class);
        }
        
        @Override
        public int getUid() {
            return this.uid_;
        }
        
        @Override
        public long getAvatarGuid() {
            return this.avatarGuid_;
        }
        
        @Override
        public int getPos() {
            return this.pos_;
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
            if (this.uid_ != 0) {
                output.writeUInt32(1, this.uid_);
            }
            if (this.avatarGuid_ != 0L) {
                output.writeUInt64(2, this.avatarGuid_);
            }
            if (this.pos_ != 0) {
                output.writeUInt32(3, this.pos_);
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
            if (this.uid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.uid_);
            }
            if (this.avatarGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(2, this.avatarGuid_);
            }
            if (this.pos_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.pos_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VehicleMember)) {
                return super.equals(obj);
            }
            final VehicleMember other = (VehicleMember)obj;
            return this.getUid() == other.getUid() && this.getAvatarGuid() == other.getAvatarGuid() && this.getPos() == other.getPos() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getUid();
            hash = 37 * hash + 2;
            hash = 53 * hash + Internal.hashLong(this.getAvatarGuid());
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getPos();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static VehicleMember parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return VehicleMember.PARSER.parseFrom(data);
        }
        
        public static VehicleMember parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return VehicleMember.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static VehicleMember parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return VehicleMember.PARSER.parseFrom(data);
        }
        
        public static VehicleMember parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return VehicleMember.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static VehicleMember parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return VehicleMember.PARSER.parseFrom(data);
        }
        
        public static VehicleMember parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return VehicleMember.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static VehicleMember parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(VehicleMember.PARSER, input);
        }
        
        public static VehicleMember parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(VehicleMember.PARSER, input, extensionRegistry);
        }
        
        public static VehicleMember parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(VehicleMember.PARSER, input);
        }
        
        public static VehicleMember parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(VehicleMember.PARSER, input, extensionRegistry);
        }
        
        public static VehicleMember parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(VehicleMember.PARSER, input);
        }
        
        public static VehicleMember parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(VehicleMember.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return VehicleMember.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final VehicleMember prototype) {
            return VehicleMember.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == VehicleMember.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static VehicleMember getDefaultInstance() {
            return VehicleMember.DEFAULT_INSTANCE;
        }
        
        public static Parser<VehicleMember> parser() {
            return VehicleMember.PARSER;
        }
        
        @Override
        public Parser<VehicleMember> getParserForType() {
            return VehicleMember.PARSER;
        }
        
        @Override
        public VehicleMember getDefaultInstanceForType() {
            return VehicleMember.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new VehicleMember();
            PARSER = new AbstractParser<VehicleMember>() {
                @Override
                public VehicleMember parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new VehicleMember(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements VehicleMemberOrBuilder
        {
            private int uid_;
            private long avatarGuid_;
            private int pos_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return VehicleMemberOuterClass.internal_static_VehicleMember_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return VehicleMemberOuterClass.internal_static_VehicleMember_fieldAccessorTable.ensureFieldAccessorsInitialized(VehicleMember.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (VehicleMember.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.uid_ = 0;
                this.avatarGuid_ = 0L;
                this.pos_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return VehicleMemberOuterClass.internal_static_VehicleMember_descriptor;
            }
            
            @Override
            public VehicleMember getDefaultInstanceForType() {
                return VehicleMember.getDefaultInstance();
            }
            
            @Override
            public VehicleMember build() {
                final VehicleMember result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public VehicleMember buildPartial() {
                final VehicleMember result = new VehicleMember(this);
                result.uid_ = this.uid_;
                result.avatarGuid_ = this.avatarGuid_;
                result.pos_ = this.pos_;
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
                if (other instanceof VehicleMember) {
                    return this.mergeFrom((VehicleMember)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final VehicleMember other) {
                if (other == VehicleMember.getDefaultInstance()) {
                    return this;
                }
                if (other.getUid() != 0) {
                    this.setUid(other.getUid());
                }
                if (other.getAvatarGuid() != 0L) {
                    this.setAvatarGuid(other.getAvatarGuid());
                }
                if (other.getPos() != 0) {
                    this.setPos(other.getPos());
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
                VehicleMember parsedMessage = null;
                try {
                    parsedMessage = VehicleMember.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (VehicleMember)e.getUnfinishedMessage();
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
            public int getUid() {
                return this.uid_;
            }
            
            public Builder setUid(final int value) {
                this.uid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUid() {
                this.uid_ = 0;
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
            public int getPos() {
                return this.pos_;
            }
            
            public Builder setPos(final int value) {
                this.pos_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPos() {
                this.pos_ = 0;
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
    
    public interface VehicleMemberOrBuilder extends MessageOrBuilder
    {
        int getUid();
        
        long getAvatarGuid();
        
        int getPos();
    }
}
