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

public final class EvtAvatarSitDownNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_EvtAvatarSitDownNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EvtAvatarSitDownNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private EvtAvatarSitDownNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return EvtAvatarSitDownNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cEvtAvatarSitDownNotify.proto\u001a\fVector.proto\"X\n\u0016EvtAvatarSitDownNotify\u0012\u0019\n\bposition\u0018\t \u0001(\u000b2\u0007.Vector\u0012\u0011\n\tentity_id\u0018\u0004 \u0001(\r\u0012\u0010\n\bchair_id\u0018\u0006 \u0001(\u0004B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        EvtAvatarSitDownNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { VectorOuterClass.getDescriptor() });
        internal_static_EvtAvatarSitDownNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_EvtAvatarSitDownNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(EvtAvatarSitDownNotifyOuterClass.internal_static_EvtAvatarSitDownNotify_descriptor, new String[] { "Position", "EntityId", "ChairId" });
        VectorOuterClass.getDescriptor();
    }
    
    public static final class EvtAvatarSitDownNotify extends GeneratedMessageV3 implements EvtAvatarSitDownNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int POSITION_FIELD_NUMBER = 9;
        private VectorOuterClass.Vector position_;
        public static final int ENTITY_ID_FIELD_NUMBER = 4;
        private int entityId_;
        public static final int CHAIR_ID_FIELD_NUMBER = 6;
        private long chairId_;
        private byte memoizedIsInitialized;
        private static final EvtAvatarSitDownNotify DEFAULT_INSTANCE;
        private static final Parser<EvtAvatarSitDownNotify> PARSER;
        
        private EvtAvatarSitDownNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private EvtAvatarSitDownNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new EvtAvatarSitDownNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private EvtAvatarSitDownNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 32: {
                            this.entityId_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.chairId_ = input.readUInt64();
                            continue;
                        }
                        case 74: {
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
            return EvtAvatarSitDownNotifyOuterClass.internal_static_EvtAvatarSitDownNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return EvtAvatarSitDownNotifyOuterClass.internal_static_EvtAvatarSitDownNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(EvtAvatarSitDownNotify.class, Builder.class);
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
        public int getEntityId() {
            return this.entityId_;
        }
        
        @Override
        public long getChairId() {
            return this.chairId_;
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
            if (this.entityId_ != 0) {
                output.writeUInt32(4, this.entityId_);
            }
            if (this.chairId_ != 0L) {
                output.writeUInt64(6, this.chairId_);
            }
            if (this.position_ != null) {
                output.writeMessage(9, this.getPosition());
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
            if (this.entityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.entityId_);
            }
            if (this.chairId_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(6, this.chairId_);
            }
            if (this.position_ != null) {
                size += CodedOutputStream.computeMessageSize(9, this.getPosition());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EvtAvatarSitDownNotify)) {
                return super.equals(obj);
            }
            final EvtAvatarSitDownNotify other = (EvtAvatarSitDownNotify)obj;
            return this.hasPosition() == other.hasPosition() && (!this.hasPosition() || this.getPosition().equals(other.getPosition())) && this.getEntityId() == other.getEntityId() && this.getChairId() == other.getChairId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPosition()) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getPosition().hashCode();
            }
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getEntityId();
            hash = 37 * hash + 6;
            hash = 53 * hash + Internal.hashLong(this.getChairId());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static EvtAvatarSitDownNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return EvtAvatarSitDownNotify.PARSER.parseFrom(data);
        }
        
        public static EvtAvatarSitDownNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EvtAvatarSitDownNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EvtAvatarSitDownNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return EvtAvatarSitDownNotify.PARSER.parseFrom(data);
        }
        
        public static EvtAvatarSitDownNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EvtAvatarSitDownNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EvtAvatarSitDownNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return EvtAvatarSitDownNotify.PARSER.parseFrom(data);
        }
        
        public static EvtAvatarSitDownNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EvtAvatarSitDownNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EvtAvatarSitDownNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EvtAvatarSitDownNotify.PARSER, input);
        }
        
        public static EvtAvatarSitDownNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EvtAvatarSitDownNotify.PARSER, input, extensionRegistry);
        }
        
        public static EvtAvatarSitDownNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EvtAvatarSitDownNotify.PARSER, input);
        }
        
        public static EvtAvatarSitDownNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EvtAvatarSitDownNotify.PARSER, input, extensionRegistry);
        }
        
        public static EvtAvatarSitDownNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EvtAvatarSitDownNotify.PARSER, input);
        }
        
        public static EvtAvatarSitDownNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EvtAvatarSitDownNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return EvtAvatarSitDownNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final EvtAvatarSitDownNotify prototype) {
            return EvtAvatarSitDownNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == EvtAvatarSitDownNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static EvtAvatarSitDownNotify getDefaultInstance() {
            return EvtAvatarSitDownNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<EvtAvatarSitDownNotify> parser() {
            return EvtAvatarSitDownNotify.PARSER;
        }
        
        @Override
        public Parser<EvtAvatarSitDownNotify> getParserForType() {
            return EvtAvatarSitDownNotify.PARSER;
        }
        
        @Override
        public EvtAvatarSitDownNotify getDefaultInstanceForType() {
            return EvtAvatarSitDownNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new EvtAvatarSitDownNotify();
            PARSER = new AbstractParser<EvtAvatarSitDownNotify>() {
                @Override
                public EvtAvatarSitDownNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new EvtAvatarSitDownNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EvtAvatarSitDownNotifyOrBuilder
        {
            private VectorOuterClass.Vector position_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> positionBuilder_;
            private int entityId_;
            private long chairId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return EvtAvatarSitDownNotifyOuterClass.internal_static_EvtAvatarSitDownNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return EvtAvatarSitDownNotifyOuterClass.internal_static_EvtAvatarSitDownNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(EvtAvatarSitDownNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (EvtAvatarSitDownNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.positionBuilder_ == null) {
                    this.position_ = null;
                }
                else {
                    this.position_ = null;
                    this.positionBuilder_ = null;
                }
                this.entityId_ = 0;
                this.chairId_ = 0L;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return EvtAvatarSitDownNotifyOuterClass.internal_static_EvtAvatarSitDownNotify_descriptor;
            }
            
            @Override
            public EvtAvatarSitDownNotify getDefaultInstanceForType() {
                return EvtAvatarSitDownNotify.getDefaultInstance();
            }
            
            @Override
            public EvtAvatarSitDownNotify build() {
                final EvtAvatarSitDownNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public EvtAvatarSitDownNotify buildPartial() {
                final EvtAvatarSitDownNotify result = new EvtAvatarSitDownNotify(this);
                if (this.positionBuilder_ == null) {
                    result.position_ = this.position_;
                }
                else {
                    result.position_ = this.positionBuilder_.build();
                }
                result.entityId_ = this.entityId_;
                result.chairId_ = this.chairId_;
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
                if (other instanceof EvtAvatarSitDownNotify) {
                    return this.mergeFrom((EvtAvatarSitDownNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final EvtAvatarSitDownNotify other) {
                if (other == EvtAvatarSitDownNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.hasPosition()) {
                    this.mergePosition(other.getPosition());
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
                }
                if (other.getChairId() != 0L) {
                    this.setChairId(other.getChairId());
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
                EvtAvatarSitDownNotify parsedMessage = null;
                try {
                    parsedMessage = EvtAvatarSitDownNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (EvtAvatarSitDownNotify)e.getUnfinishedMessage();
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface EvtAvatarSitDownNotifyOrBuilder extends MessageOrBuilder
    {
        boolean hasPosition();
        
        VectorOuterClass.Vector getPosition();
        
        VectorOuterClass.VectorOrBuilder getPositionOrBuilder();
        
        int getEntityId();
        
        long getChairId();
    }
}
