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

public final class PersonalSceneJumpRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_PersonalSceneJumpRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PersonalSceneJumpRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PersonalSceneJumpRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PersonalSceneJumpRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001aPersonalSceneJumpRsp.proto\u001a\fVector.proto\"Y\n\u0014PersonalSceneJumpRsp\u0012\u0015\n\rdest_scene_id\u0018\u0005 \u0001(\r\u0012\u000f\n\u0007retcode\u0018\b \u0001(\u0005\u0012\u0019\n\bdest_pos\u0018\u000b \u0001(\u000b2\u0007.VectorB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PersonalSceneJumpRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { VectorOuterClass.getDescriptor() });
        internal_static_PersonalSceneJumpRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PersonalSceneJumpRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PersonalSceneJumpRspOuterClass.internal_static_PersonalSceneJumpRsp_descriptor, new String[] { "DestSceneId", "Retcode", "DestPos" });
        VectorOuterClass.getDescriptor();
    }
    
    public static final class PersonalSceneJumpRsp extends GeneratedMessageV3 implements PersonalSceneJumpRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int DEST_SCENE_ID_FIELD_NUMBER = 5;
        private int destSceneId_;
        public static final int RETCODE_FIELD_NUMBER = 8;
        private int retcode_;
        public static final int DEST_POS_FIELD_NUMBER = 11;
        private VectorOuterClass.Vector destPos_;
        private byte memoizedIsInitialized;
        private static final PersonalSceneJumpRsp DEFAULT_INSTANCE;
        private static final Parser<PersonalSceneJumpRsp> PARSER;
        
        private PersonalSceneJumpRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PersonalSceneJumpRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PersonalSceneJumpRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PersonalSceneJumpRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.destSceneId_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 90: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.destPos_ != null) {
                                subBuilder = this.destPos_.toBuilder();
                            }
                            this.destPos_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.destPos_);
                                this.destPos_ = subBuilder.buildPartial();
                                continue;
                            }
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
            return PersonalSceneJumpRspOuterClass.internal_static_PersonalSceneJumpRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PersonalSceneJumpRspOuterClass.internal_static_PersonalSceneJumpRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(PersonalSceneJumpRsp.class, Builder.class);
        }
        
        @Override
        public int getDestSceneId() {
            return this.destSceneId_;
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public boolean hasDestPos() {
            return this.destPos_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getDestPos() {
            return (this.destPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.destPos_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getDestPosOrBuilder() {
            return this.getDestPos();
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
            if (this.destSceneId_ != 0) {
                output.writeUInt32(5, this.destSceneId_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(8, this.retcode_);
            }
            if (this.destPos_ != null) {
                output.writeMessage(11, this.getDestPos());
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
            if (this.destSceneId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.destSceneId_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(8, this.retcode_);
            }
            if (this.destPos_ != null) {
                size += CodedOutputStream.computeMessageSize(11, this.getDestPos());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PersonalSceneJumpRsp)) {
                return super.equals(obj);
            }
            final PersonalSceneJumpRsp other = (PersonalSceneJumpRsp)obj;
            return this.getDestSceneId() == other.getDestSceneId() && this.getRetcode() == other.getRetcode() && this.hasDestPos() == other.hasDestPos() && (!this.hasDestPos() || this.getDestPos().equals(other.getDestPos())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getDestSceneId();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getRetcode();
            if (this.hasDestPos()) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.getDestPos().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PersonalSceneJumpRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PersonalSceneJumpRsp.PARSER.parseFrom(data);
        }
        
        public static PersonalSceneJumpRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PersonalSceneJumpRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PersonalSceneJumpRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PersonalSceneJumpRsp.PARSER.parseFrom(data);
        }
        
        public static PersonalSceneJumpRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PersonalSceneJumpRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PersonalSceneJumpRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PersonalSceneJumpRsp.PARSER.parseFrom(data);
        }
        
        public static PersonalSceneJumpRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PersonalSceneJumpRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PersonalSceneJumpRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PersonalSceneJumpRsp.PARSER, input);
        }
        
        public static PersonalSceneJumpRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PersonalSceneJumpRsp.PARSER, input, extensionRegistry);
        }
        
        public static PersonalSceneJumpRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PersonalSceneJumpRsp.PARSER, input);
        }
        
        public static PersonalSceneJumpRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PersonalSceneJumpRsp.PARSER, input, extensionRegistry);
        }
        
        public static PersonalSceneJumpRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PersonalSceneJumpRsp.PARSER, input);
        }
        
        public static PersonalSceneJumpRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PersonalSceneJumpRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PersonalSceneJumpRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PersonalSceneJumpRsp prototype) {
            return PersonalSceneJumpRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PersonalSceneJumpRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PersonalSceneJumpRsp getDefaultInstance() {
            return PersonalSceneJumpRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<PersonalSceneJumpRsp> parser() {
            return PersonalSceneJumpRsp.PARSER;
        }
        
        @Override
        public Parser<PersonalSceneJumpRsp> getParserForType() {
            return PersonalSceneJumpRsp.PARSER;
        }
        
        @Override
        public PersonalSceneJumpRsp getDefaultInstanceForType() {
            return PersonalSceneJumpRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PersonalSceneJumpRsp();
            PARSER = new AbstractParser<PersonalSceneJumpRsp>() {
                @Override
                public PersonalSceneJumpRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PersonalSceneJumpRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PersonalSceneJumpRspOrBuilder
        {
            private int destSceneId_;
            private int retcode_;
            private VectorOuterClass.Vector destPos_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> destPosBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PersonalSceneJumpRspOuterClass.internal_static_PersonalSceneJumpRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PersonalSceneJumpRspOuterClass.internal_static_PersonalSceneJumpRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(PersonalSceneJumpRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PersonalSceneJumpRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.destSceneId_ = 0;
                this.retcode_ = 0;
                if (this.destPosBuilder_ == null) {
                    this.destPos_ = null;
                }
                else {
                    this.destPos_ = null;
                    this.destPosBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PersonalSceneJumpRspOuterClass.internal_static_PersonalSceneJumpRsp_descriptor;
            }
            
            @Override
            public PersonalSceneJumpRsp getDefaultInstanceForType() {
                return PersonalSceneJumpRsp.getDefaultInstance();
            }
            
            @Override
            public PersonalSceneJumpRsp build() {
                final PersonalSceneJumpRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PersonalSceneJumpRsp buildPartial() {
                final PersonalSceneJumpRsp result = new PersonalSceneJumpRsp(this);
                result.destSceneId_ = this.destSceneId_;
                result.retcode_ = this.retcode_;
                if (this.destPosBuilder_ == null) {
                    result.destPos_ = this.destPos_;
                }
                else {
                    result.destPos_ = this.destPosBuilder_.build();
                }
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
                if (other instanceof PersonalSceneJumpRsp) {
                    return this.mergeFrom((PersonalSceneJumpRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PersonalSceneJumpRsp other) {
                if (other == PersonalSceneJumpRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getDestSceneId() != 0) {
                    this.setDestSceneId(other.getDestSceneId());
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.hasDestPos()) {
                    this.mergeDestPos(other.getDestPos());
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
                PersonalSceneJumpRsp parsedMessage = null;
                try {
                    parsedMessage = PersonalSceneJumpRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PersonalSceneJumpRsp)e.getUnfinishedMessage();
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
            public int getDestSceneId() {
                return this.destSceneId_;
            }
            
            public Builder setDestSceneId(final int value) {
                this.destSceneId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDestSceneId() {
                this.destSceneId_ = 0;
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
            public boolean hasDestPos() {
                return this.destPosBuilder_ != null || this.destPos_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getDestPos() {
                if (this.destPosBuilder_ == null) {
                    return (this.destPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.destPos_;
                }
                return this.destPosBuilder_.getMessage();
            }
            
            public Builder setDestPos(final VectorOuterClass.Vector value) {
                if (this.destPosBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.destPos_ = value;
                    this.onChanged();
                }
                else {
                    this.destPosBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setDestPos(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.destPosBuilder_ == null) {
                    this.destPos_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.destPosBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeDestPos(final VectorOuterClass.Vector value) {
                if (this.destPosBuilder_ == null) {
                    if (this.destPos_ != null) {
                        this.destPos_ = VectorOuterClass.Vector.newBuilder(this.destPos_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.destPos_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.destPosBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearDestPos() {
                if (this.destPosBuilder_ == null) {
                    this.destPos_ = null;
                    this.onChanged();
                }
                else {
                    this.destPos_ = null;
                    this.destPosBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getDestPosBuilder() {
                this.onChanged();
                return this.getDestPosFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getDestPosOrBuilder() {
                if (this.destPosBuilder_ != null) {
                    return this.destPosBuilder_.getMessageOrBuilder();
                }
                return (this.destPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.destPos_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getDestPosFieldBuilder() {
                if (this.destPosBuilder_ == null) {
                    this.destPosBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getDestPos(), this.getParentForChildren(), this.isClean());
                    this.destPos_ = null;
                }
                return this.destPosBuilder_;
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
    
    public interface PersonalSceneJumpRspOrBuilder extends MessageOrBuilder
    {
        int getDestSceneId();
        
        int getRetcode();
        
        boolean hasDestPos();
        
        VectorOuterClass.Vector getDestPos();
        
        VectorOuterClass.VectorOrBuilder getDestPosOrBuilder();
    }
}
