// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
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

public final class VehicleInteractRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_VehicleInteractRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_VehicleInteractRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private VehicleInteractRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return VehicleInteractRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018VehicleInteractRsp.proto\u001a\u0019VehicleInteractType.proto\u001a\u0013VehicleMember.proto\"\u0085\u0001\n\u0012VehicleInteractRsp\u0012+\n\rinteract_type\u0018\u000f \u0001(\u000e2\u0014.VehicleInteractType\u0012\u001e\n\u0006member\u0018\u0003 \u0001(\u000b2\u000e.VehicleMember\u0012\u0011\n\tentity_id\u0018\u0002 \u0001(\r\u0012\u000f\n\u0007retcode\u0018\u0001 \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        VehicleInteractRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { VehicleInteractTypeOuterClass.getDescriptor(), VehicleMemberOuterClass.getDescriptor() });
        internal_static_VehicleInteractRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_VehicleInteractRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(VehicleInteractRspOuterClass.internal_static_VehicleInteractRsp_descriptor, new String[] { "InteractType", "Member", "EntityId", "Retcode" });
        VehicleInteractTypeOuterClass.getDescriptor();
        VehicleMemberOuterClass.getDescriptor();
    }
    
    public static final class VehicleInteractRsp extends GeneratedMessageV3 implements VehicleInteractRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int INTERACT_TYPE_FIELD_NUMBER = 15;
        private int interactType_;
        public static final int MEMBER_FIELD_NUMBER = 3;
        private VehicleMemberOuterClass.VehicleMember member_;
        public static final int ENTITY_ID_FIELD_NUMBER = 2;
        private int entityId_;
        public static final int RETCODE_FIELD_NUMBER = 1;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final VehicleInteractRsp DEFAULT_INSTANCE;
        private static final Parser<VehicleInteractRsp> PARSER;
        
        private VehicleInteractRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private VehicleInteractRsp() {
            this.memoizedIsInitialized = -1;
            this.interactType_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new VehicleInteractRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private VehicleInteractRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 16: {
                            this.entityId_ = input.readUInt32();
                            continue;
                        }
                        case 26: {
                            VehicleMemberOuterClass.VehicleMember.Builder subBuilder = null;
                            if (this.member_ != null) {
                                subBuilder = this.member_.toBuilder();
                            }
                            this.member_ = input.readMessage(VehicleMemberOuterClass.VehicleMember.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.member_);
                                this.member_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 120: {
                            final int rawValue = input.readEnum();
                            this.interactType_ = rawValue;
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
            return VehicleInteractRspOuterClass.internal_static_VehicleInteractRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return VehicleInteractRspOuterClass.internal_static_VehicleInteractRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(VehicleInteractRsp.class, Builder.class);
        }
        
        @Override
        public int getInteractTypeValue() {
            return this.interactType_;
        }
        
        @Override
        public VehicleInteractTypeOuterClass.VehicleInteractType getInteractType() {
            final VehicleInteractTypeOuterClass.VehicleInteractType result = VehicleInteractTypeOuterClass.VehicleInteractType.valueOf(this.interactType_);
            return (result == null) ? VehicleInteractTypeOuterClass.VehicleInteractType.UNRECOGNIZED : result;
        }
        
        @Override
        public boolean hasMember() {
            return this.member_ != null;
        }
        
        @Override
        public VehicleMemberOuterClass.VehicleMember getMember() {
            return (this.member_ == null) ? VehicleMemberOuterClass.VehicleMember.getDefaultInstance() : this.member_;
        }
        
        @Override
        public VehicleMemberOuterClass.VehicleMemberOrBuilder getMemberOrBuilder() {
            return this.getMember();
        }
        
        @Override
        public int getEntityId() {
            return this.entityId_;
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
            if (this.retcode_ != 0) {
                output.writeInt32(1, this.retcode_);
            }
            if (this.entityId_ != 0) {
                output.writeUInt32(2, this.entityId_);
            }
            if (this.member_ != null) {
                output.writeMessage(3, this.getMember());
            }
            if (this.interactType_ != VehicleInteractTypeOuterClass.VehicleInteractType.VEHICLE_INTERACT_TYPE_NONE.getNumber()) {
                output.writeEnum(15, this.interactType_);
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
                size += CodedOutputStream.computeInt32Size(1, this.retcode_);
            }
            if (this.entityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.entityId_);
            }
            if (this.member_ != null) {
                size += CodedOutputStream.computeMessageSize(3, this.getMember());
            }
            if (this.interactType_ != VehicleInteractTypeOuterClass.VehicleInteractType.VEHICLE_INTERACT_TYPE_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(15, this.interactType_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VehicleInteractRsp)) {
                return super.equals(obj);
            }
            final VehicleInteractRsp other = (VehicleInteractRsp)obj;
            return this.interactType_ == other.interactType_ && this.hasMember() == other.hasMember() && (!this.hasMember() || this.getMember().equals(other.getMember())) && this.getEntityId() == other.getEntityId() && this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.interactType_;
            if (this.hasMember()) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getMember().hashCode();
            }
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getEntityId();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static VehicleInteractRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return VehicleInteractRsp.PARSER.parseFrom(data);
        }
        
        public static VehicleInteractRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return VehicleInteractRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static VehicleInteractRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return VehicleInteractRsp.PARSER.parseFrom(data);
        }
        
        public static VehicleInteractRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return VehicleInteractRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static VehicleInteractRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return VehicleInteractRsp.PARSER.parseFrom(data);
        }
        
        public static VehicleInteractRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return VehicleInteractRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static VehicleInteractRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(VehicleInteractRsp.PARSER, input);
        }
        
        public static VehicleInteractRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(VehicleInteractRsp.PARSER, input, extensionRegistry);
        }
        
        public static VehicleInteractRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(VehicleInteractRsp.PARSER, input);
        }
        
        public static VehicleInteractRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(VehicleInteractRsp.PARSER, input, extensionRegistry);
        }
        
        public static VehicleInteractRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(VehicleInteractRsp.PARSER, input);
        }
        
        public static VehicleInteractRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(VehicleInteractRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return VehicleInteractRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final VehicleInteractRsp prototype) {
            return VehicleInteractRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == VehicleInteractRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static VehicleInteractRsp getDefaultInstance() {
            return VehicleInteractRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<VehicleInteractRsp> parser() {
            return VehicleInteractRsp.PARSER;
        }
        
        @Override
        public Parser<VehicleInteractRsp> getParserForType() {
            return VehicleInteractRsp.PARSER;
        }
        
        @Override
        public VehicleInteractRsp getDefaultInstanceForType() {
            return VehicleInteractRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new VehicleInteractRsp();
            PARSER = new AbstractParser<VehicleInteractRsp>() {
                @Override
                public VehicleInteractRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new VehicleInteractRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements VehicleInteractRspOrBuilder
        {
            private int interactType_;
            private VehicleMemberOuterClass.VehicleMember member_;
            private SingleFieldBuilderV3<VehicleMemberOuterClass.VehicleMember, VehicleMemberOuterClass.VehicleMember.Builder, VehicleMemberOuterClass.VehicleMemberOrBuilder> memberBuilder_;
            private int entityId_;
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return VehicleInteractRspOuterClass.internal_static_VehicleInteractRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return VehicleInteractRspOuterClass.internal_static_VehicleInteractRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(VehicleInteractRsp.class, Builder.class);
            }
            
            private Builder() {
                this.interactType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.interactType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (VehicleInteractRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.interactType_ = 0;
                if (this.memberBuilder_ == null) {
                    this.member_ = null;
                }
                else {
                    this.member_ = null;
                    this.memberBuilder_ = null;
                }
                this.entityId_ = 0;
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return VehicleInteractRspOuterClass.internal_static_VehicleInteractRsp_descriptor;
            }
            
            @Override
            public VehicleInteractRsp getDefaultInstanceForType() {
                return VehicleInteractRsp.getDefaultInstance();
            }
            
            @Override
            public VehicleInteractRsp build() {
                final VehicleInteractRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public VehicleInteractRsp buildPartial() {
                final VehicleInteractRsp result = new VehicleInteractRsp(this);
                result.interactType_ = this.interactType_;
                if (this.memberBuilder_ == null) {
                    result.member_ = this.member_;
                }
                else {
                    result.member_ = this.memberBuilder_.build();
                }
                result.entityId_ = this.entityId_;
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
                if (other instanceof VehicleInteractRsp) {
                    return this.mergeFrom((VehicleInteractRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final VehicleInteractRsp other) {
                if (other == VehicleInteractRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.interactType_ != 0) {
                    this.setInteractTypeValue(other.getInteractTypeValue());
                }
                if (other.hasMember()) {
                    this.mergeMember(other.getMember());
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
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
                VehicleInteractRsp parsedMessage = null;
                try {
                    parsedMessage = VehicleInteractRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (VehicleInteractRsp)e.getUnfinishedMessage();
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
            public int getInteractTypeValue() {
                return this.interactType_;
            }
            
            public Builder setInteractTypeValue(final int value) {
                this.interactType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public VehicleInteractTypeOuterClass.VehicleInteractType getInteractType() {
                final VehicleInteractTypeOuterClass.VehicleInteractType result = VehicleInteractTypeOuterClass.VehicleInteractType.valueOf(this.interactType_);
                return (result == null) ? VehicleInteractTypeOuterClass.VehicleInteractType.UNRECOGNIZED : result;
            }
            
            public Builder setInteractType(final VehicleInteractTypeOuterClass.VehicleInteractType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.interactType_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearInteractType() {
                this.interactType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasMember() {
                return this.memberBuilder_ != null || this.member_ != null;
            }
            
            @Override
            public VehicleMemberOuterClass.VehicleMember getMember() {
                if (this.memberBuilder_ == null) {
                    return (this.member_ == null) ? VehicleMemberOuterClass.VehicleMember.getDefaultInstance() : this.member_;
                }
                return this.memberBuilder_.getMessage();
            }
            
            public Builder setMember(final VehicleMemberOuterClass.VehicleMember value) {
                if (this.memberBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.member_ = value;
                    this.onChanged();
                }
                else {
                    this.memberBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setMember(final VehicleMemberOuterClass.VehicleMember.Builder builderForValue) {
                if (this.memberBuilder_ == null) {
                    this.member_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.memberBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeMember(final VehicleMemberOuterClass.VehicleMember value) {
                if (this.memberBuilder_ == null) {
                    if (this.member_ != null) {
                        this.member_ = VehicleMemberOuterClass.VehicleMember.newBuilder(this.member_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.member_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.memberBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearMember() {
                if (this.memberBuilder_ == null) {
                    this.member_ = null;
                    this.onChanged();
                }
                else {
                    this.member_ = null;
                    this.memberBuilder_ = null;
                }
                return this;
            }
            
            public VehicleMemberOuterClass.VehicleMember.Builder getMemberBuilder() {
                this.onChanged();
                return this.getMemberFieldBuilder().getBuilder();
            }
            
            @Override
            public VehicleMemberOuterClass.VehicleMemberOrBuilder getMemberOrBuilder() {
                if (this.memberBuilder_ != null) {
                    return this.memberBuilder_.getMessageOrBuilder();
                }
                return (this.member_ == null) ? VehicleMemberOuterClass.VehicleMember.getDefaultInstance() : this.member_;
            }
            
            private SingleFieldBuilderV3<VehicleMemberOuterClass.VehicleMember, VehicleMemberOuterClass.VehicleMember.Builder, VehicleMemberOuterClass.VehicleMemberOrBuilder> getMemberFieldBuilder() {
                if (this.memberBuilder_ == null) {
                    this.memberBuilder_ = new SingleFieldBuilderV3<VehicleMemberOuterClass.VehicleMember, VehicleMemberOuterClass.VehicleMember.Builder, VehicleMemberOuterClass.VehicleMemberOrBuilder>(this.getMember(), this.getParentForChildren(), this.isClean());
                    this.member_ = null;
                }
                return this.memberBuilder_;
            }
            
            @Override
            public int getEntityId() {
                return this.entityId_;
            }
            
            public Builder setEntityId(final int value) {
                this.entityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEntityId() {
                this.entityId_ = 0;
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
    
    public interface VehicleInteractRspOrBuilder extends MessageOrBuilder
    {
        int getInteractTypeValue();
        
        VehicleInteractTypeOuterClass.VehicleInteractType getInteractType();
        
        boolean hasMember();
        
        VehicleMemberOuterClass.VehicleMember getMember();
        
        VehicleMemberOuterClass.VehicleMemberOrBuilder getMemberOrBuilder();
        
        int getEntityId();
        
        int getRetcode();
    }
}
