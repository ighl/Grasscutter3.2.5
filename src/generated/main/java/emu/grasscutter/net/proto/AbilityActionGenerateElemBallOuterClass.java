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

public final class AbilityActionGenerateElemBallOuterClass
{
    private static final Descriptors.Descriptor internal_static_AbilityActionGenerateElemBall_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AbilityActionGenerateElemBall_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AbilityActionGenerateElemBallOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AbilityActionGenerateElemBallOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n#AbilityActionGenerateElemBall.proto\u001a\fVector.proto\"\\\n\u001dAbilityActionGenerateElemBall\u0012\u000f\n\u0007room_id\u0018\u0002 \u0001(\r\u0012\u0014\n\u0003pos\u0018\u0007 \u0001(\u000b2\u0007.Vector\u0012\u0014\n\u0003rot\u0018\r \u0001(\u000b2\u0007.VectorB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AbilityActionGenerateElemBallOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { VectorOuterClass.getDescriptor() });
        internal_static_AbilityActionGenerateElemBall_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AbilityActionGenerateElemBall_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AbilityActionGenerateElemBallOuterClass.internal_static_AbilityActionGenerateElemBall_descriptor, new String[] { "RoomId", "Pos", "Rot" });
        VectorOuterClass.getDescriptor();
    }
    
    public static final class AbilityActionGenerateElemBall extends GeneratedMessageV3 implements AbilityActionGenerateElemBallOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ROOM_ID_FIELD_NUMBER = 2;
        private int roomId_;
        public static final int POS_FIELD_NUMBER = 7;
        private VectorOuterClass.Vector pos_;
        public static final int ROT_FIELD_NUMBER = 13;
        private VectorOuterClass.Vector rot_;
        private byte memoizedIsInitialized;
        private static final AbilityActionGenerateElemBall DEFAULT_INSTANCE;
        private static final Parser<AbilityActionGenerateElemBall> PARSER;
        
        private AbilityActionGenerateElemBall(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AbilityActionGenerateElemBall() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AbilityActionGenerateElemBall();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AbilityActionGenerateElemBall(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 16: {
                            this.roomId_ = input.readUInt32();
                            continue;
                        }
                        case 58: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.pos_ != null) {
                                subBuilder = this.pos_.toBuilder();
                            }
                            this.pos_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.pos_);
                                this.pos_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 106: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.rot_ != null) {
                                subBuilder = this.rot_.toBuilder();
                            }
                            this.rot_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.rot_);
                                this.rot_ = subBuilder.buildPartial();
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
            return AbilityActionGenerateElemBallOuterClass.internal_static_AbilityActionGenerateElemBall_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AbilityActionGenerateElemBallOuterClass.internal_static_AbilityActionGenerateElemBall_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityActionGenerateElemBall.class, Builder.class);
        }
        
        @Override
        public int getRoomId() {
            return this.roomId_;
        }
        
        @Override
        public boolean hasPos() {
            return this.pos_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getPos() {
            return (this.pos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.pos_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
            return this.getPos();
        }
        
        @Override
        public boolean hasRot() {
            return this.rot_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getRot() {
            return (this.rot_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.rot_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
            return this.getRot();
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
            if (this.roomId_ != 0) {
                output.writeUInt32(2, this.roomId_);
            }
            if (this.pos_ != null) {
                output.writeMessage(7, this.getPos());
            }
            if (this.rot_ != null) {
                output.writeMessage(13, this.getRot());
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
            if (this.roomId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.roomId_);
            }
            if (this.pos_ != null) {
                size += CodedOutputStream.computeMessageSize(7, this.getPos());
            }
            if (this.rot_ != null) {
                size += CodedOutputStream.computeMessageSize(13, this.getRot());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbilityActionGenerateElemBall)) {
                return super.equals(obj);
            }
            final AbilityActionGenerateElemBall other = (AbilityActionGenerateElemBall)obj;
            return this.getRoomId() == other.getRoomId() && this.hasPos() == other.hasPos() && (!this.hasPos() || this.getPos().equals(other.getPos())) && this.hasRot() == other.hasRot() && (!this.hasRot() || this.getRot().equals(other.getRot())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getRoomId();
            if (this.hasPos()) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.getPos().hashCode();
            }
            if (this.hasRot()) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.getRot().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AbilityActionGenerateElemBall parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AbilityActionGenerateElemBall.PARSER.parseFrom(data);
        }
        
        public static AbilityActionGenerateElemBall parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityActionGenerateElemBall.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityActionGenerateElemBall parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AbilityActionGenerateElemBall.PARSER.parseFrom(data);
        }
        
        public static AbilityActionGenerateElemBall parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityActionGenerateElemBall.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityActionGenerateElemBall parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AbilityActionGenerateElemBall.PARSER.parseFrom(data);
        }
        
        public static AbilityActionGenerateElemBall parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityActionGenerateElemBall.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityActionGenerateElemBall parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityActionGenerateElemBall.PARSER, input);
        }
        
        public static AbilityActionGenerateElemBall parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityActionGenerateElemBall.PARSER, input, extensionRegistry);
        }
        
        public static AbilityActionGenerateElemBall parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityActionGenerateElemBall.PARSER, input);
        }
        
        public static AbilityActionGenerateElemBall parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityActionGenerateElemBall.PARSER, input, extensionRegistry);
        }
        
        public static AbilityActionGenerateElemBall parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityActionGenerateElemBall.PARSER, input);
        }
        
        public static AbilityActionGenerateElemBall parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityActionGenerateElemBall.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AbilityActionGenerateElemBall.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AbilityActionGenerateElemBall prototype) {
            return AbilityActionGenerateElemBall.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AbilityActionGenerateElemBall.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AbilityActionGenerateElemBall getDefaultInstance() {
            return AbilityActionGenerateElemBall.DEFAULT_INSTANCE;
        }
        
        public static Parser<AbilityActionGenerateElemBall> parser() {
            return AbilityActionGenerateElemBall.PARSER;
        }
        
        @Override
        public Parser<AbilityActionGenerateElemBall> getParserForType() {
            return AbilityActionGenerateElemBall.PARSER;
        }
        
        @Override
        public AbilityActionGenerateElemBall getDefaultInstanceForType() {
            return AbilityActionGenerateElemBall.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AbilityActionGenerateElemBall();
            PARSER = new AbstractParser<AbilityActionGenerateElemBall>() {
                @Override
                public AbilityActionGenerateElemBall parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AbilityActionGenerateElemBall(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AbilityActionGenerateElemBallOrBuilder
        {
            private int roomId_;
            private VectorOuterClass.Vector pos_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> posBuilder_;
            private VectorOuterClass.Vector rot_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> rotBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AbilityActionGenerateElemBallOuterClass.internal_static_AbilityActionGenerateElemBall_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AbilityActionGenerateElemBallOuterClass.internal_static_AbilityActionGenerateElemBall_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityActionGenerateElemBall.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AbilityActionGenerateElemBall.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.roomId_ = 0;
                if (this.posBuilder_ == null) {
                    this.pos_ = null;
                }
                else {
                    this.pos_ = null;
                    this.posBuilder_ = null;
                }
                if (this.rotBuilder_ == null) {
                    this.rot_ = null;
                }
                else {
                    this.rot_ = null;
                    this.rotBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AbilityActionGenerateElemBallOuterClass.internal_static_AbilityActionGenerateElemBall_descriptor;
            }
            
            @Override
            public AbilityActionGenerateElemBall getDefaultInstanceForType() {
                return AbilityActionGenerateElemBall.getDefaultInstance();
            }
            
            @Override
            public AbilityActionGenerateElemBall build() {
                final AbilityActionGenerateElemBall result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AbilityActionGenerateElemBall buildPartial() {
                final AbilityActionGenerateElemBall result = new AbilityActionGenerateElemBall(this);
                result.roomId_ = this.roomId_;
                if (this.posBuilder_ == null) {
                    result.pos_ = this.pos_;
                }
                else {
                    result.pos_ = this.posBuilder_.build();
                }
                if (this.rotBuilder_ == null) {
                    result.rot_ = this.rot_;
                }
                else {
                    result.rot_ = this.rotBuilder_.build();
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
                if (other instanceof AbilityActionGenerateElemBall) {
                    return this.mergeFrom((AbilityActionGenerateElemBall)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AbilityActionGenerateElemBall other) {
                if (other == AbilityActionGenerateElemBall.getDefaultInstance()) {
                    return this;
                }
                if (other.getRoomId() != 0) {
                    this.setRoomId(other.getRoomId());
                }
                if (other.hasPos()) {
                    this.mergePos(other.getPos());
                }
                if (other.hasRot()) {
                    this.mergeRot(other.getRot());
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
                AbilityActionGenerateElemBall parsedMessage = null;
                try {
                    parsedMessage = AbilityActionGenerateElemBall.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AbilityActionGenerateElemBall)e.getUnfinishedMessage();
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
            public int getRoomId() {
                return this.roomId_;
            }
            
            public Builder setRoomId(final int value) {
                this.roomId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRoomId() {
                this.roomId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasPos() {
                return this.posBuilder_ != null || this.pos_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getPos() {
                if (this.posBuilder_ == null) {
                    return (this.pos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.pos_;
                }
                return this.posBuilder_.getMessage();
            }
            
            public Builder setPos(final VectorOuterClass.Vector value) {
                if (this.posBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.pos_ = value;
                    this.onChanged();
                }
                else {
                    this.posBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setPos(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.posBuilder_ == null) {
                    this.pos_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.posBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergePos(final VectorOuterClass.Vector value) {
                if (this.posBuilder_ == null) {
                    if (this.pos_ != null) {
                        this.pos_ = VectorOuterClass.Vector.newBuilder(this.pos_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.pos_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.posBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearPos() {
                if (this.posBuilder_ == null) {
                    this.pos_ = null;
                    this.onChanged();
                }
                else {
                    this.pos_ = null;
                    this.posBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getPosBuilder() {
                this.onChanged();
                return this.getPosFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
                if (this.posBuilder_ != null) {
                    return this.posBuilder_.getMessageOrBuilder();
                }
                return (this.pos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.pos_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getPosFieldBuilder() {
                if (this.posBuilder_ == null) {
                    this.posBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getPos(), this.getParentForChildren(), this.isClean());
                    this.pos_ = null;
                }
                return this.posBuilder_;
            }
            
            @Override
            public boolean hasRot() {
                return this.rotBuilder_ != null || this.rot_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getRot() {
                if (this.rotBuilder_ == null) {
                    return (this.rot_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.rot_;
                }
                return this.rotBuilder_.getMessage();
            }
            
            public Builder setRot(final VectorOuterClass.Vector value) {
                if (this.rotBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.rot_ = value;
                    this.onChanged();
                }
                else {
                    this.rotBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setRot(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.rotBuilder_ == null) {
                    this.rot_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.rotBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeRot(final VectorOuterClass.Vector value) {
                if (this.rotBuilder_ == null) {
                    if (this.rot_ != null) {
                        this.rot_ = VectorOuterClass.Vector.newBuilder(this.rot_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.rot_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.rotBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearRot() {
                if (this.rotBuilder_ == null) {
                    this.rot_ = null;
                    this.onChanged();
                }
                else {
                    this.rot_ = null;
                    this.rotBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getRotBuilder() {
                this.onChanged();
                return this.getRotFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
                if (this.rotBuilder_ != null) {
                    return this.rotBuilder_.getMessageOrBuilder();
                }
                return (this.rot_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.rot_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getRotFieldBuilder() {
                if (this.rotBuilder_ == null) {
                    this.rotBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getRot(), this.getParentForChildren(), this.isClean());
                    this.rot_ = null;
                }
                return this.rotBuilder_;
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
    
    public interface AbilityActionGenerateElemBallOrBuilder extends MessageOrBuilder
    {
        int getRoomId();
        
        boolean hasPos();
        
        VectorOuterClass.Vector getPos();
        
        VectorOuterClass.VectorOrBuilder getPosOrBuilder();
        
        boolean hasRot();
        
        VectorOuterClass.Vector getRot();
        
        VectorOuterClass.VectorOrBuilder getRotOrBuilder();
    }
}
