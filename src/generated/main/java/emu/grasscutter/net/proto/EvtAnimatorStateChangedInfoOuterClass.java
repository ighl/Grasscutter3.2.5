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

public final class EvtAnimatorStateChangedInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_EvtAnimatorStateChangedInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EvtAnimatorStateChangedInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private EvtAnimatorStateChangedInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return EvtAnimatorStateChangedInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n!EvtAnimatorStateChangedInfo.proto\u001a\fVector.proto\"\u0088\u0002\n\u001bEvtAnimatorStateChangedInfo\u0012\u001a\n\u0012face_angle_compact\u0018\u000e \u0001(\u0005\u0012\u0015\n\rto_state_hash\u0018\u0005 \u0001(\r\u0012\u001f\n\u0017normalized_time_compact\u0018\t \u0001(\r\u0012\u001b\n\u0013Unk2700_HEMGNDKMAFO\u0018\u0002 \u0001(\r\u0012\u0014\n\u0003pos\u0018\r \u0001(\u000b2\u0007.Vector\u0012\u0015\n\rfade_duration\u0018\u0003 \u0001(\u0002\u0012\u001b\n\u0013Unk2700_CJCJLGHIBPK\u0018\u0001 \u0001(\b\u0012\u0011\n\tentity_id\u0018\u000f \u0001(\r\u0012\u001b\n\u0013Unk2700_JECBLPNLJMJ\u0018\u0007 \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        EvtAnimatorStateChangedInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { VectorOuterClass.getDescriptor() });
        internal_static_EvtAnimatorStateChangedInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_EvtAnimatorStateChangedInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(EvtAnimatorStateChangedInfoOuterClass.internal_static_EvtAnimatorStateChangedInfo_descriptor, new String[] { "FaceAngleCompact", "ToStateHash", "NormalizedTimeCompact", "Unk2700HEMGNDKMAFO", "Pos", "FadeDuration", "Unk2700CJCJLGHIBPK", "EntityId", "Unk2700JECBLPNLJMJ" });
        VectorOuterClass.getDescriptor();
    }
    
    public static final class EvtAnimatorStateChangedInfo extends GeneratedMessageV3 implements EvtAnimatorStateChangedInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int FACE_ANGLE_COMPACT_FIELD_NUMBER = 14;
        private int faceAngleCompact_;
        public static final int TO_STATE_HASH_FIELD_NUMBER = 5;
        private int toStateHash_;
        public static final int NORMALIZED_TIME_COMPACT_FIELD_NUMBER = 9;
        private int normalizedTimeCompact_;
        public static final int UNK2700_HEMGNDKMAFO_FIELD_NUMBER = 2;
        private int unk2700HEMGNDKMAFO_;
        public static final int POS_FIELD_NUMBER = 13;
        private VectorOuterClass.Vector pos_;
        public static final int FADE_DURATION_FIELD_NUMBER = 3;
        private float fadeDuration_;
        public static final int UNK2700_CJCJLGHIBPK_FIELD_NUMBER = 1;
        private boolean unk2700CJCJLGHIBPK_;
        public static final int ENTITY_ID_FIELD_NUMBER = 15;
        private int entityId_;
        public static final int UNK2700_JECBLPNLJMJ_FIELD_NUMBER = 7;
        private boolean unk2700JECBLPNLJMJ_;
        private byte memoizedIsInitialized;
        private static final EvtAnimatorStateChangedInfo DEFAULT_INSTANCE;
        private static final Parser<EvtAnimatorStateChangedInfo> PARSER;
        
        private EvtAnimatorStateChangedInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private EvtAnimatorStateChangedInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new EvtAnimatorStateChangedInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private EvtAnimatorStateChangedInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.unk2700CJCJLGHIBPK_ = input.readBool();
                            continue;
                        }
                        case 16: {
                            this.unk2700HEMGNDKMAFO_ = input.readUInt32();
                            continue;
                        }
                        case 29: {
                            this.fadeDuration_ = input.readFloat();
                            continue;
                        }
                        case 40: {
                            this.toStateHash_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            this.unk2700JECBLPNLJMJ_ = input.readBool();
                            continue;
                        }
                        case 72: {
                            this.normalizedTimeCompact_ = input.readUInt32();
                            continue;
                        }
                        case 106: {
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
                        case 112: {
                            this.faceAngleCompact_ = input.readInt32();
                            continue;
                        }
                        case 120: {
                            this.entityId_ = input.readUInt32();
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
            return EvtAnimatorStateChangedInfoOuterClass.internal_static_EvtAnimatorStateChangedInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return EvtAnimatorStateChangedInfoOuterClass.internal_static_EvtAnimatorStateChangedInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(EvtAnimatorStateChangedInfo.class, Builder.class);
        }
        
        @Override
        public int getFaceAngleCompact() {
            return this.faceAngleCompact_;
        }
        
        @Override
        public int getToStateHash() {
            return this.toStateHash_;
        }
        
        @Override
        public int getNormalizedTimeCompact() {
            return this.normalizedTimeCompact_;
        }
        
        @Override
        public int getUnk2700HEMGNDKMAFO() {
            return this.unk2700HEMGNDKMAFO_;
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
        public float getFadeDuration() {
            return this.fadeDuration_;
        }
        
        @Override
        public boolean getUnk2700CJCJLGHIBPK() {
            return this.unk2700CJCJLGHIBPK_;
        }
        
        @Override
        public int getEntityId() {
            return this.entityId_;
        }
        
        @Override
        public boolean getUnk2700JECBLPNLJMJ() {
            return this.unk2700JECBLPNLJMJ_;
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
            if (this.unk2700CJCJLGHIBPK_) {
                output.writeBool(1, this.unk2700CJCJLGHIBPK_);
            }
            if (this.unk2700HEMGNDKMAFO_ != 0) {
                output.writeUInt32(2, this.unk2700HEMGNDKMAFO_);
            }
            if (this.fadeDuration_ != 0.0f) {
                output.writeFloat(3, this.fadeDuration_);
            }
            if (this.toStateHash_ != 0) {
                output.writeUInt32(5, this.toStateHash_);
            }
            if (this.unk2700JECBLPNLJMJ_) {
                output.writeBool(7, this.unk2700JECBLPNLJMJ_);
            }
            if (this.normalizedTimeCompact_ != 0) {
                output.writeUInt32(9, this.normalizedTimeCompact_);
            }
            if (this.pos_ != null) {
                output.writeMessage(13, this.getPos());
            }
            if (this.faceAngleCompact_ != 0) {
                output.writeInt32(14, this.faceAngleCompact_);
            }
            if (this.entityId_ != 0) {
                output.writeUInt32(15, this.entityId_);
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
            if (this.unk2700CJCJLGHIBPK_) {
                size += CodedOutputStream.computeBoolSize(1, this.unk2700CJCJLGHIBPK_);
            }
            if (this.unk2700HEMGNDKMAFO_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.unk2700HEMGNDKMAFO_);
            }
            if (this.fadeDuration_ != 0.0f) {
                size += CodedOutputStream.computeFloatSize(3, this.fadeDuration_);
            }
            if (this.toStateHash_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.toStateHash_);
            }
            if (this.unk2700JECBLPNLJMJ_) {
                size += CodedOutputStream.computeBoolSize(7, this.unk2700JECBLPNLJMJ_);
            }
            if (this.normalizedTimeCompact_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.normalizedTimeCompact_);
            }
            if (this.pos_ != null) {
                size += CodedOutputStream.computeMessageSize(13, this.getPos());
            }
            if (this.faceAngleCompact_ != 0) {
                size += CodedOutputStream.computeInt32Size(14, this.faceAngleCompact_);
            }
            if (this.entityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.entityId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EvtAnimatorStateChangedInfo)) {
                return super.equals(obj);
            }
            final EvtAnimatorStateChangedInfo other = (EvtAnimatorStateChangedInfo)obj;
            return this.getFaceAngleCompact() == other.getFaceAngleCompact() && this.getToStateHash() == other.getToStateHash() && this.getNormalizedTimeCompact() == other.getNormalizedTimeCompact() && this.getUnk2700HEMGNDKMAFO() == other.getUnk2700HEMGNDKMAFO() && this.hasPos() == other.hasPos() && (!this.hasPos() || this.getPos().equals(other.getPos())) && Float.floatToIntBits(this.getFadeDuration()) == Float.floatToIntBits(other.getFadeDuration()) && this.getUnk2700CJCJLGHIBPK() == other.getUnk2700CJCJLGHIBPK() && this.getEntityId() == other.getEntityId() && this.getUnk2700JECBLPNLJMJ() == other.getUnk2700JECBLPNLJMJ() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getFaceAngleCompact();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getToStateHash();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getNormalizedTimeCompact();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getUnk2700HEMGNDKMAFO();
            if (this.hasPos()) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.getPos().hashCode();
            }
            hash = 37 * hash + 3;
            hash = 53 * hash + Float.floatToIntBits(this.getFadeDuration());
            hash = 37 * hash + 1;
            hash = 53 * hash + Internal.hashBoolean(this.getUnk2700CJCJLGHIBPK());
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getEntityId();
            hash = 37 * hash + 7;
            hash = 53 * hash + Internal.hashBoolean(this.getUnk2700JECBLPNLJMJ());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static EvtAnimatorStateChangedInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return EvtAnimatorStateChangedInfo.PARSER.parseFrom(data);
        }
        
        public static EvtAnimatorStateChangedInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EvtAnimatorStateChangedInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EvtAnimatorStateChangedInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return EvtAnimatorStateChangedInfo.PARSER.parseFrom(data);
        }
        
        public static EvtAnimatorStateChangedInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EvtAnimatorStateChangedInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EvtAnimatorStateChangedInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return EvtAnimatorStateChangedInfo.PARSER.parseFrom(data);
        }
        
        public static EvtAnimatorStateChangedInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EvtAnimatorStateChangedInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EvtAnimatorStateChangedInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EvtAnimatorStateChangedInfo.PARSER, input);
        }
        
        public static EvtAnimatorStateChangedInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EvtAnimatorStateChangedInfo.PARSER, input, extensionRegistry);
        }
        
        public static EvtAnimatorStateChangedInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EvtAnimatorStateChangedInfo.PARSER, input);
        }
        
        public static EvtAnimatorStateChangedInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EvtAnimatorStateChangedInfo.PARSER, input, extensionRegistry);
        }
        
        public static EvtAnimatorStateChangedInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EvtAnimatorStateChangedInfo.PARSER, input);
        }
        
        public static EvtAnimatorStateChangedInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EvtAnimatorStateChangedInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return EvtAnimatorStateChangedInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final EvtAnimatorStateChangedInfo prototype) {
            return EvtAnimatorStateChangedInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == EvtAnimatorStateChangedInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static EvtAnimatorStateChangedInfo getDefaultInstance() {
            return EvtAnimatorStateChangedInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<EvtAnimatorStateChangedInfo> parser() {
            return EvtAnimatorStateChangedInfo.PARSER;
        }
        
        @Override
        public Parser<EvtAnimatorStateChangedInfo> getParserForType() {
            return EvtAnimatorStateChangedInfo.PARSER;
        }
        
        @Override
        public EvtAnimatorStateChangedInfo getDefaultInstanceForType() {
            return EvtAnimatorStateChangedInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new EvtAnimatorStateChangedInfo();
            PARSER = new AbstractParser<EvtAnimatorStateChangedInfo>() {
                @Override
                public EvtAnimatorStateChangedInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new EvtAnimatorStateChangedInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EvtAnimatorStateChangedInfoOrBuilder
        {
            private int faceAngleCompact_;
            private int toStateHash_;
            private int normalizedTimeCompact_;
            private int unk2700HEMGNDKMAFO_;
            private VectorOuterClass.Vector pos_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> posBuilder_;
            private float fadeDuration_;
            private boolean unk2700CJCJLGHIBPK_;
            private int entityId_;
            private boolean unk2700JECBLPNLJMJ_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return EvtAnimatorStateChangedInfoOuterClass.internal_static_EvtAnimatorStateChangedInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return EvtAnimatorStateChangedInfoOuterClass.internal_static_EvtAnimatorStateChangedInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(EvtAnimatorStateChangedInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (EvtAnimatorStateChangedInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.faceAngleCompact_ = 0;
                this.toStateHash_ = 0;
                this.normalizedTimeCompact_ = 0;
                this.unk2700HEMGNDKMAFO_ = 0;
                if (this.posBuilder_ == null) {
                    this.pos_ = null;
                }
                else {
                    this.pos_ = null;
                    this.posBuilder_ = null;
                }
                this.fadeDuration_ = 0.0f;
                this.unk2700CJCJLGHIBPK_ = false;
                this.entityId_ = 0;
                this.unk2700JECBLPNLJMJ_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return EvtAnimatorStateChangedInfoOuterClass.internal_static_EvtAnimatorStateChangedInfo_descriptor;
            }
            
            @Override
            public EvtAnimatorStateChangedInfo getDefaultInstanceForType() {
                return EvtAnimatorStateChangedInfo.getDefaultInstance();
            }
            
            @Override
            public EvtAnimatorStateChangedInfo build() {
                final EvtAnimatorStateChangedInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public EvtAnimatorStateChangedInfo buildPartial() {
                final EvtAnimatorStateChangedInfo result = new EvtAnimatorStateChangedInfo(this);
                result.faceAngleCompact_ = this.faceAngleCompact_;
                result.toStateHash_ = this.toStateHash_;
                result.normalizedTimeCompact_ = this.normalizedTimeCompact_;
                result.unk2700HEMGNDKMAFO_ = this.unk2700HEMGNDKMAFO_;
                if (this.posBuilder_ == null) {
                    result.pos_ = this.pos_;
                }
                else {
                    result.pos_ = this.posBuilder_.build();
                }
                result.fadeDuration_ = this.fadeDuration_;
                result.unk2700CJCJLGHIBPK_ = this.unk2700CJCJLGHIBPK_;
                result.entityId_ = this.entityId_;
                result.unk2700JECBLPNLJMJ_ = this.unk2700JECBLPNLJMJ_;
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
                if (other instanceof EvtAnimatorStateChangedInfo) {
                    return this.mergeFrom((EvtAnimatorStateChangedInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final EvtAnimatorStateChangedInfo other) {
                if (other == EvtAnimatorStateChangedInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getFaceAngleCompact() != 0) {
                    this.setFaceAngleCompact(other.getFaceAngleCompact());
                }
                if (other.getToStateHash() != 0) {
                    this.setToStateHash(other.getToStateHash());
                }
                if (other.getNormalizedTimeCompact() != 0) {
                    this.setNormalizedTimeCompact(other.getNormalizedTimeCompact());
                }
                if (other.getUnk2700HEMGNDKMAFO() != 0) {
                    this.setUnk2700HEMGNDKMAFO(other.getUnk2700HEMGNDKMAFO());
                }
                if (other.hasPos()) {
                    this.mergePos(other.getPos());
                }
                if (other.getFadeDuration() != 0.0f) {
                    this.setFadeDuration(other.getFadeDuration());
                }
                if (other.getUnk2700CJCJLGHIBPK()) {
                    this.setUnk2700CJCJLGHIBPK(other.getUnk2700CJCJLGHIBPK());
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
                }
                if (other.getUnk2700JECBLPNLJMJ()) {
                    this.setUnk2700JECBLPNLJMJ(other.getUnk2700JECBLPNLJMJ());
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
                EvtAnimatorStateChangedInfo parsedMessage = null;
                try {
                    parsedMessage = EvtAnimatorStateChangedInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (EvtAnimatorStateChangedInfo)e.getUnfinishedMessage();
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
            public int getFaceAngleCompact() {
                return this.faceAngleCompact_;
            }
            
            public Builder setFaceAngleCompact(final int value) {
                this.faceAngleCompact_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFaceAngleCompact() {
                this.faceAngleCompact_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getToStateHash() {
                return this.toStateHash_;
            }
            
            public Builder setToStateHash(final int value) {
                this.toStateHash_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearToStateHash() {
                this.toStateHash_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getNormalizedTimeCompact() {
                return this.normalizedTimeCompact_;
            }
            
            public Builder setNormalizedTimeCompact(final int value) {
                this.normalizedTimeCompact_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearNormalizedTimeCompact() {
                this.normalizedTimeCompact_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnk2700HEMGNDKMAFO() {
                return this.unk2700HEMGNDKMAFO_;
            }
            
            public Builder setUnk2700HEMGNDKMAFO(final int value) {
                this.unk2700HEMGNDKMAFO_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700HEMGNDKMAFO() {
                this.unk2700HEMGNDKMAFO_ = 0;
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
            public float getFadeDuration() {
                return this.fadeDuration_;
            }
            
            public Builder setFadeDuration(final float value) {
                this.fadeDuration_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFadeDuration() {
                this.fadeDuration_ = 0.0f;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getUnk2700CJCJLGHIBPK() {
                return this.unk2700CJCJLGHIBPK_;
            }
            
            public Builder setUnk2700CJCJLGHIBPK(final boolean value) {
                this.unk2700CJCJLGHIBPK_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700CJCJLGHIBPK() {
                this.unk2700CJCJLGHIBPK_ = false;
                this.onChanged();
                return this;
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
            public boolean getUnk2700JECBLPNLJMJ() {
                return this.unk2700JECBLPNLJMJ_;
            }
            
            public Builder setUnk2700JECBLPNLJMJ(final boolean value) {
                this.unk2700JECBLPNLJMJ_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700JECBLPNLJMJ() {
                this.unk2700JECBLPNLJMJ_ = false;
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
    
    public interface EvtAnimatorStateChangedInfoOrBuilder extends MessageOrBuilder
    {
        int getFaceAngleCompact();
        
        int getToStateHash();
        
        int getNormalizedTimeCompact();
        
        int getUnk2700HEMGNDKMAFO();
        
        boolean hasPos();
        
        VectorOuterClass.Vector getPos();
        
        VectorOuterClass.VectorOrBuilder getPosOrBuilder();
        
        float getFadeDuration();
        
        boolean getUnk2700CJCJLGHIBPK();
        
        int getEntityId();
        
        boolean getUnk2700JECBLPNLJMJ();
    }
}
