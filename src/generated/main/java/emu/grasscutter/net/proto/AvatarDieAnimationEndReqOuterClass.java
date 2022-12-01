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

public final class AvatarDieAnimationEndReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_AvatarDieAnimationEndReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarDieAnimationEndReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AvatarDieAnimationEndReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AvatarDieAnimationEndReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001eAvatarDieAnimationEndReq.proto\u001a\fVector.proto\"[\n\u0018AvatarDieAnimationEndReq\u0012\u001b\n\nreborn_pos\u0018\u0003 \u0001(\u000b2\u0007.Vector\u0012\u0010\n\bdie_guid\u0018\u0007 \u0001(\u0004\u0012\u0010\n\bskill_id\u0018\b \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AvatarDieAnimationEndReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { VectorOuterClass.getDescriptor() });
        internal_static_AvatarDieAnimationEndReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AvatarDieAnimationEndReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarDieAnimationEndReqOuterClass.internal_static_AvatarDieAnimationEndReq_descriptor, new String[] { "RebornPos", "DieGuid", "SkillId" });
        VectorOuterClass.getDescriptor();
    }
    
    public static final class AvatarDieAnimationEndReq extends GeneratedMessageV3 implements AvatarDieAnimationEndReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int REBORN_POS_FIELD_NUMBER = 3;
        private VectorOuterClass.Vector rebornPos_;
        public static final int DIE_GUID_FIELD_NUMBER = 7;
        private long dieGuid_;
        public static final int SKILL_ID_FIELD_NUMBER = 8;
        private int skillId_;
        private byte memoizedIsInitialized;
        private static final AvatarDieAnimationEndReq DEFAULT_INSTANCE;
        private static final Parser<AvatarDieAnimationEndReq> PARSER;
        
        private AvatarDieAnimationEndReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AvatarDieAnimationEndReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AvatarDieAnimationEndReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AvatarDieAnimationEndReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 26: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.rebornPos_ != null) {
                                subBuilder = this.rebornPos_.toBuilder();
                            }
                            this.rebornPos_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.rebornPos_);
                                this.rebornPos_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 56: {
                            this.dieGuid_ = input.readUInt64();
                            continue;
                        }
                        case 64: {
                            this.skillId_ = input.readUInt32();
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
            return AvatarDieAnimationEndReqOuterClass.internal_static_AvatarDieAnimationEndReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AvatarDieAnimationEndReqOuterClass.internal_static_AvatarDieAnimationEndReq_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarDieAnimationEndReq.class, Builder.class);
        }
        
        @Override
        public boolean hasRebornPos() {
            return this.rebornPos_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getRebornPos() {
            return (this.rebornPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.rebornPos_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getRebornPosOrBuilder() {
            return this.getRebornPos();
        }
        
        @Override
        public long getDieGuid() {
            return this.dieGuid_;
        }
        
        @Override
        public int getSkillId() {
            return this.skillId_;
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
            if (this.rebornPos_ != null) {
                output.writeMessage(3, this.getRebornPos());
            }
            if (this.dieGuid_ != 0L) {
                output.writeUInt64(7, this.dieGuid_);
            }
            if (this.skillId_ != 0) {
                output.writeUInt32(8, this.skillId_);
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
            if (this.rebornPos_ != null) {
                size += CodedOutputStream.computeMessageSize(3, this.getRebornPos());
            }
            if (this.dieGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(7, this.dieGuid_);
            }
            if (this.skillId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.skillId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarDieAnimationEndReq)) {
                return super.equals(obj);
            }
            final AvatarDieAnimationEndReq other = (AvatarDieAnimationEndReq)obj;
            return this.hasRebornPos() == other.hasRebornPos() && (!this.hasRebornPos() || this.getRebornPos().equals(other.getRebornPos())) && this.getDieGuid() == other.getDieGuid() && this.getSkillId() == other.getSkillId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasRebornPos()) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getRebornPos().hashCode();
            }
            hash = 37 * hash + 7;
            hash = 53 * hash + Internal.hashLong(this.getDieGuid());
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getSkillId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AvatarDieAnimationEndReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AvatarDieAnimationEndReq.PARSER.parseFrom(data);
        }
        
        public static AvatarDieAnimationEndReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarDieAnimationEndReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarDieAnimationEndReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AvatarDieAnimationEndReq.PARSER.parseFrom(data);
        }
        
        public static AvatarDieAnimationEndReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarDieAnimationEndReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarDieAnimationEndReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AvatarDieAnimationEndReq.PARSER.parseFrom(data);
        }
        
        public static AvatarDieAnimationEndReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarDieAnimationEndReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarDieAnimationEndReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarDieAnimationEndReq.PARSER, input);
        }
        
        public static AvatarDieAnimationEndReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarDieAnimationEndReq.PARSER, input, extensionRegistry);
        }
        
        public static AvatarDieAnimationEndReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarDieAnimationEndReq.PARSER, input);
        }
        
        public static AvatarDieAnimationEndReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarDieAnimationEndReq.PARSER, input, extensionRegistry);
        }
        
        public static AvatarDieAnimationEndReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarDieAnimationEndReq.PARSER, input);
        }
        
        public static AvatarDieAnimationEndReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarDieAnimationEndReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AvatarDieAnimationEndReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AvatarDieAnimationEndReq prototype) {
            return AvatarDieAnimationEndReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AvatarDieAnimationEndReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AvatarDieAnimationEndReq getDefaultInstance() {
            return AvatarDieAnimationEndReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<AvatarDieAnimationEndReq> parser() {
            return AvatarDieAnimationEndReq.PARSER;
        }
        
        @Override
        public Parser<AvatarDieAnimationEndReq> getParserForType() {
            return AvatarDieAnimationEndReq.PARSER;
        }
        
        @Override
        public AvatarDieAnimationEndReq getDefaultInstanceForType() {
            return AvatarDieAnimationEndReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AvatarDieAnimationEndReq();
            PARSER = new AbstractParser<AvatarDieAnimationEndReq>() {
                @Override
                public AvatarDieAnimationEndReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AvatarDieAnimationEndReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AvatarDieAnimationEndReqOrBuilder
        {
            private VectorOuterClass.Vector rebornPos_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> rebornPosBuilder_;
            private long dieGuid_;
            private int skillId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AvatarDieAnimationEndReqOuterClass.internal_static_AvatarDieAnimationEndReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AvatarDieAnimationEndReqOuterClass.internal_static_AvatarDieAnimationEndReq_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarDieAnimationEndReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AvatarDieAnimationEndReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.rebornPosBuilder_ == null) {
                    this.rebornPos_ = null;
                }
                else {
                    this.rebornPos_ = null;
                    this.rebornPosBuilder_ = null;
                }
                this.dieGuid_ = 0L;
                this.skillId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AvatarDieAnimationEndReqOuterClass.internal_static_AvatarDieAnimationEndReq_descriptor;
            }
            
            @Override
            public AvatarDieAnimationEndReq getDefaultInstanceForType() {
                return AvatarDieAnimationEndReq.getDefaultInstance();
            }
            
            @Override
            public AvatarDieAnimationEndReq build() {
                final AvatarDieAnimationEndReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AvatarDieAnimationEndReq buildPartial() {
                final AvatarDieAnimationEndReq result = new AvatarDieAnimationEndReq(this);
                if (this.rebornPosBuilder_ == null) {
                    result.rebornPos_ = this.rebornPos_;
                }
                else {
                    result.rebornPos_ = this.rebornPosBuilder_.build();
                }
                result.dieGuid_ = this.dieGuid_;
                result.skillId_ = this.skillId_;
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
                if (other instanceof AvatarDieAnimationEndReq) {
                    return this.mergeFrom((AvatarDieAnimationEndReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AvatarDieAnimationEndReq other) {
                if (other == AvatarDieAnimationEndReq.getDefaultInstance()) {
                    return this;
                }
                if (other.hasRebornPos()) {
                    this.mergeRebornPos(other.getRebornPos());
                }
                if (other.getDieGuid() != 0L) {
                    this.setDieGuid(other.getDieGuid());
                }
                if (other.getSkillId() != 0) {
                    this.setSkillId(other.getSkillId());
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
                AvatarDieAnimationEndReq parsedMessage = null;
                try {
                    parsedMessage = AvatarDieAnimationEndReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AvatarDieAnimationEndReq)e.getUnfinishedMessage();
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
            public boolean hasRebornPos() {
                return this.rebornPosBuilder_ != null || this.rebornPos_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getRebornPos() {
                if (this.rebornPosBuilder_ == null) {
                    return (this.rebornPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.rebornPos_;
                }
                return this.rebornPosBuilder_.getMessage();
            }
            
            public Builder setRebornPos(final VectorOuterClass.Vector value) {
                if (this.rebornPosBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.rebornPos_ = value;
                    this.onChanged();
                }
                else {
                    this.rebornPosBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setRebornPos(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.rebornPosBuilder_ == null) {
                    this.rebornPos_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.rebornPosBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeRebornPos(final VectorOuterClass.Vector value) {
                if (this.rebornPosBuilder_ == null) {
                    if (this.rebornPos_ != null) {
                        this.rebornPos_ = VectorOuterClass.Vector.newBuilder(this.rebornPos_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.rebornPos_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.rebornPosBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearRebornPos() {
                if (this.rebornPosBuilder_ == null) {
                    this.rebornPos_ = null;
                    this.onChanged();
                }
                else {
                    this.rebornPos_ = null;
                    this.rebornPosBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getRebornPosBuilder() {
                this.onChanged();
                return this.getRebornPosFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getRebornPosOrBuilder() {
                if (this.rebornPosBuilder_ != null) {
                    return this.rebornPosBuilder_.getMessageOrBuilder();
                }
                return (this.rebornPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.rebornPos_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getRebornPosFieldBuilder() {
                if (this.rebornPosBuilder_ == null) {
                    this.rebornPosBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getRebornPos(), this.getParentForChildren(), this.isClean());
                    this.rebornPos_ = null;
                }
                return this.rebornPosBuilder_;
            }
            
            @Override
            public long getDieGuid() {
                return this.dieGuid_;
            }
            
            public Builder setDieGuid(final long value) {
                this.dieGuid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDieGuid() {
                this.dieGuid_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getSkillId() {
                return this.skillId_;
            }
            
            public Builder setSkillId(final int value) {
                this.skillId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSkillId() {
                this.skillId_ = 0;
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
    
    public interface AvatarDieAnimationEndReqOrBuilder extends MessageOrBuilder
    {
        boolean hasRebornPos();
        
        VectorOuterClass.Vector getRebornPos();
        
        VectorOuterClass.VectorOrBuilder getRebornPosOrBuilder();
        
        long getDieGuid();
        
        int getSkillId();
    }
}
