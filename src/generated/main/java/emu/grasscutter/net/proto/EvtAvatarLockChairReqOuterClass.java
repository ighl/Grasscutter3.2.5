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

public final class EvtAvatarLockChairReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_EvtAvatarLockChairReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EvtAvatarLockChairReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private EvtAvatarLockChairReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return EvtAvatarLockChairReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bEvtAvatarLockChairReq.proto\u001a\fVector.proto\"D\n\u0015EvtAvatarLockChairReq\u0012\u0010\n\bchair_id\u0018\u0005 \u0001(\u0004\u0012\u0019\n\bposition\u0018\b \u0001(\u000b2\u0007.VectorB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        EvtAvatarLockChairReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { VectorOuterClass.getDescriptor() });
        internal_static_EvtAvatarLockChairReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_EvtAvatarLockChairReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(EvtAvatarLockChairReqOuterClass.internal_static_EvtAvatarLockChairReq_descriptor, new String[] { "ChairId", "Position" });
        VectorOuterClass.getDescriptor();
    }
    
    public static final class EvtAvatarLockChairReq extends GeneratedMessageV3 implements EvtAvatarLockChairReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CHAIR_ID_FIELD_NUMBER = 5;
        private long chairId_;
        public static final int POSITION_FIELD_NUMBER = 8;
        private VectorOuterClass.Vector position_;
        private byte memoizedIsInitialized;
        private static final EvtAvatarLockChairReq DEFAULT_INSTANCE;
        private static final Parser<EvtAvatarLockChairReq> PARSER;
        
        private EvtAvatarLockChairReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private EvtAvatarLockChairReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new EvtAvatarLockChairReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private EvtAvatarLockChairReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.chairId_ = input.readUInt64();
                            continue;
                        }
                        case 66: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.position_ != null) {
                                subBuilder = this.position_.toBuilder();
                            }
                            this.position_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.position_);
                                this.position_ = subBuilder.buildPartial();
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
            return EvtAvatarLockChairReqOuterClass.internal_static_EvtAvatarLockChairReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return EvtAvatarLockChairReqOuterClass.internal_static_EvtAvatarLockChairReq_fieldAccessorTable.ensureFieldAccessorsInitialized(EvtAvatarLockChairReq.class, Builder.class);
        }
        
        @Override
        public long getChairId() {
            return this.chairId_;
        }
        
        @Override
        public boolean hasPosition() {
            return this.position_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getPosition() {
            return (this.position_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.position_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getPositionOrBuilder() {
            return this.getPosition();
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
            if (this.chairId_ != 0L) {
                output.writeUInt64(5, this.chairId_);
            }
            if (this.position_ != null) {
                output.writeMessage(8, this.getPosition());
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
            if (this.chairId_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(5, this.chairId_);
            }
            if (this.position_ != null) {
                size += CodedOutputStream.computeMessageSize(8, this.getPosition());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EvtAvatarLockChairReq)) {
                return super.equals(obj);
            }
            final EvtAvatarLockChairReq other = (EvtAvatarLockChairReq)obj;
            return this.getChairId() == other.getChairId() && this.hasPosition() == other.hasPosition() && (!this.hasPosition() || this.getPosition().equals(other.getPosition())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 5;
            hash = 53 * hash + Internal.hashLong(this.getChairId());
            if (this.hasPosition()) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getPosition().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static EvtAvatarLockChairReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return EvtAvatarLockChairReq.PARSER.parseFrom(data);
        }
        
        public static EvtAvatarLockChairReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EvtAvatarLockChairReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EvtAvatarLockChairReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return EvtAvatarLockChairReq.PARSER.parseFrom(data);
        }
        
        public static EvtAvatarLockChairReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EvtAvatarLockChairReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EvtAvatarLockChairReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return EvtAvatarLockChairReq.PARSER.parseFrom(data);
        }
        
        public static EvtAvatarLockChairReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EvtAvatarLockChairReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EvtAvatarLockChairReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EvtAvatarLockChairReq.PARSER, input);
        }
        
        public static EvtAvatarLockChairReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EvtAvatarLockChairReq.PARSER, input, extensionRegistry);
        }
        
        public static EvtAvatarLockChairReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EvtAvatarLockChairReq.PARSER, input);
        }
        
        public static EvtAvatarLockChairReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EvtAvatarLockChairReq.PARSER, input, extensionRegistry);
        }
        
        public static EvtAvatarLockChairReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EvtAvatarLockChairReq.PARSER, input);
        }
        
        public static EvtAvatarLockChairReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EvtAvatarLockChairReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return EvtAvatarLockChairReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final EvtAvatarLockChairReq prototype) {
            return EvtAvatarLockChairReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == EvtAvatarLockChairReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static EvtAvatarLockChairReq getDefaultInstance() {
            return EvtAvatarLockChairReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<EvtAvatarLockChairReq> parser() {
            return EvtAvatarLockChairReq.PARSER;
        }
        
        @Override
        public Parser<EvtAvatarLockChairReq> getParserForType() {
            return EvtAvatarLockChairReq.PARSER;
        }
        
        @Override
        public EvtAvatarLockChairReq getDefaultInstanceForType() {
            return EvtAvatarLockChairReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new EvtAvatarLockChairReq();
            PARSER = new AbstractParser<EvtAvatarLockChairReq>() {
                @Override
                public EvtAvatarLockChairReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new EvtAvatarLockChairReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EvtAvatarLockChairReqOrBuilder
        {
            private long chairId_;
            private VectorOuterClass.Vector position_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> positionBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return EvtAvatarLockChairReqOuterClass.internal_static_EvtAvatarLockChairReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return EvtAvatarLockChairReqOuterClass.internal_static_EvtAvatarLockChairReq_fieldAccessorTable.ensureFieldAccessorsInitialized(EvtAvatarLockChairReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (EvtAvatarLockChairReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.chairId_ = 0L;
                if (this.positionBuilder_ == null) {
                    this.position_ = null;
                }
                else {
                    this.position_ = null;
                    this.positionBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return EvtAvatarLockChairReqOuterClass.internal_static_EvtAvatarLockChairReq_descriptor;
            }
            
            @Override
            public EvtAvatarLockChairReq getDefaultInstanceForType() {
                return EvtAvatarLockChairReq.getDefaultInstance();
            }
            
            @Override
            public EvtAvatarLockChairReq build() {
                final EvtAvatarLockChairReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public EvtAvatarLockChairReq buildPartial() {
                final EvtAvatarLockChairReq result = new EvtAvatarLockChairReq(this);
                result.chairId_ = this.chairId_;
                if (this.positionBuilder_ == null) {
                    result.position_ = this.position_;
                }
                else {
                    result.position_ = this.positionBuilder_.build();
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
                if (other instanceof EvtAvatarLockChairReq) {
                    return this.mergeFrom((EvtAvatarLockChairReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final EvtAvatarLockChairReq other) {
                if (other == EvtAvatarLockChairReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getChairId() != 0L) {
                    this.setChairId(other.getChairId());
                }
                if (other.hasPosition()) {
                    this.mergePosition(other.getPosition());
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
                EvtAvatarLockChairReq parsedMessage = null;
                try {
                    parsedMessage = EvtAvatarLockChairReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (EvtAvatarLockChairReq)e.getUnfinishedMessage();
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
            public long getChairId() {
                return this.chairId_;
            }
            
            public Builder setChairId(final long value) {
                this.chairId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearChairId() {
                this.chairId_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasPosition() {
                return this.positionBuilder_ != null || this.position_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getPosition() {
                if (this.positionBuilder_ == null) {
                    return (this.position_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.position_;
                }
                return this.positionBuilder_.getMessage();
            }
            
            public Builder setPosition(final VectorOuterClass.Vector value) {
                if (this.positionBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.position_ = value;
                    this.onChanged();
                }
                else {
                    this.positionBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setPosition(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.positionBuilder_ == null) {
                    this.position_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.positionBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergePosition(final VectorOuterClass.Vector value) {
                if (this.positionBuilder_ == null) {
                    if (this.position_ != null) {
                        this.position_ = VectorOuterClass.Vector.newBuilder(this.position_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.position_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.positionBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearPosition() {
                if (this.positionBuilder_ == null) {
                    this.position_ = null;
                    this.onChanged();
                }
                else {
                    this.position_ = null;
                    this.positionBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getPositionBuilder() {
                this.onChanged();
                return this.getPositionFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getPositionOrBuilder() {
                if (this.positionBuilder_ != null) {
                    return this.positionBuilder_.getMessageOrBuilder();
                }
                return (this.position_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.position_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getPositionFieldBuilder() {
                if (this.positionBuilder_ == null) {
                    this.positionBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getPosition(), this.getParentForChildren(), this.isClean());
                    this.position_ = null;
                }
                return this.positionBuilder_;
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
    
    public interface EvtAvatarLockChairReqOrBuilder extends MessageOrBuilder
    {
        long getChairId();
        
        boolean hasPosition();
        
        VectorOuterClass.Vector getPosition();
        
        VectorOuterClass.VectorOrBuilder getPositionOrBuilder();
    }
}
