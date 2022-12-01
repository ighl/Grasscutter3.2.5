// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
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
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class MotionInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_MotionInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MotionInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MotionInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MotionInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0010MotionInfo.proto\u001a\u0011MotionState.proto\u001a\fVector.proto\"\u00df\u0001\n\nMotionInfo\u0012\u0014\n\u0003pos\u0018\u0001 \u0001(\u000b2\u0007.Vector\u0012\u0014\n\u0003rot\u0018\u0002 \u0001(\u000b2\u0007.Vector\u0012\u0016\n\u0005speed\u0018\u0003 \u0001(\u000b2\u0007.Vector\u0012\u001b\n\u0005state\u0018\u0004 \u0001(\u000e2\f.MotionState\u0012\u0017\n\u0006params\u0018\u0005 \u0003(\u000b2\u0007.Vector\u0012\u0018\n\u0007ref_pos\u0018\u0006 \u0001(\u000b2\u0007.Vector\u0012\u000e\n\u0006ref_id\u0018\u0007 \u0001(\r\u0012\u0012\n\nscene_time\u0018\b \u0001(\r\u0012\u0019\n\u0011interval_velocity\u0018\t \u0001(\u0004B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MotionInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { MotionStateOuterClass.getDescriptor(), VectorOuterClass.getDescriptor() });
        internal_static_MotionInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MotionInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MotionInfoOuterClass.internal_static_MotionInfo_descriptor, new String[] { "Pos", "Rot", "Speed", "State", "Params", "RefPos", "RefId", "SceneTime", "IntervalVelocity" });
        MotionStateOuterClass.getDescriptor();
        VectorOuterClass.getDescriptor();
    }
    
    public static final class MotionInfo extends GeneratedMessageV3 implements MotionInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int POS_FIELD_NUMBER = 1;
        private VectorOuterClass.Vector pos_;
        public static final int ROT_FIELD_NUMBER = 2;
        private VectorOuterClass.Vector rot_;
        public static final int SPEED_FIELD_NUMBER = 3;
        private VectorOuterClass.Vector speed_;
        public static final int STATE_FIELD_NUMBER = 4;
        private int state_;
        public static final int PARAMS_FIELD_NUMBER = 5;
        private List<VectorOuterClass.Vector> params_;
        public static final int REF_POS_FIELD_NUMBER = 6;
        private VectorOuterClass.Vector refPos_;
        public static final int REF_ID_FIELD_NUMBER = 7;
        private int refId_;
        public static final int SCENE_TIME_FIELD_NUMBER = 8;
        private int sceneTime_;
        public static final int INTERVAL_VELOCITY_FIELD_NUMBER = 9;
        private long intervalVelocity_;
        private byte memoizedIsInitialized;
        private static final MotionInfo DEFAULT_INSTANCE;
        private static final Parser<MotionInfo> PARSER;
        
        private MotionInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private MotionInfo() {
            this.memoizedIsInitialized = -1;
            this.state_ = 0;
            this.params_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MotionInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MotionInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
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
                        case 10: {
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
                        case 18: {
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
                        case 26: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.speed_ != null) {
                                subBuilder = this.speed_.toBuilder();
                            }
                            this.speed_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.speed_);
                                this.speed_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 32: {
                            final int rawValue = input.readEnum();
                            this.state_ = rawValue;
                            continue;
                        }
                        case 42: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.params_ = new ArrayList<VectorOuterClass.Vector>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.params_.add(input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry));
                            continue;
                        }
                        case 50: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.refPos_ != null) {
                                subBuilder = this.refPos_.toBuilder();
                            }
                            this.refPos_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.refPos_);
                                this.refPos_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 56: {
                            this.refId_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.sceneTime_ = input.readUInt32();
                            continue;
                        }
                        case 72: {
                            this.intervalVelocity_ = input.readUInt64();
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
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.params_ = Collections.unmodifiableList((List<? extends VectorOuterClass.Vector>)this.params_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return MotionInfoOuterClass.internal_static_MotionInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MotionInfoOuterClass.internal_static_MotionInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(MotionInfo.class, Builder.class);
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
        public boolean hasSpeed() {
            return this.speed_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getSpeed() {
            return (this.speed_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.speed_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getSpeedOrBuilder() {
            return this.getSpeed();
        }
        
        @Override
        public int getStateValue() {
            return this.state_;
        }
        
        @Override
        public MotionStateOuterClass.MotionState getState() {
            final MotionStateOuterClass.MotionState result = MotionStateOuterClass.MotionState.valueOf(this.state_);
            return (result == null) ? MotionStateOuterClass.MotionState.UNRECOGNIZED : result;
        }
        
        @Override
        public List<VectorOuterClass.Vector> getParamsList() {
            return this.params_;
        }
        
        @Override
        public List<? extends VectorOuterClass.VectorOrBuilder> getParamsOrBuilderList() {
            return this.params_;
        }
        
        @Override
        public int getParamsCount() {
            return this.params_.size();
        }
        
        @Override
        public VectorOuterClass.Vector getParams(final int index) {
            return this.params_.get(index);
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getParamsOrBuilder(final int index) {
            return this.params_.get(index);
        }
        
        @Override
        public boolean hasRefPos() {
            return this.refPos_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getRefPos() {
            return (this.refPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.refPos_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getRefPosOrBuilder() {
            return this.getRefPos();
        }
        
        @Override
        public int getRefId() {
            return this.refId_;
        }
        
        @Override
        public int getSceneTime() {
            return this.sceneTime_;
        }
        
        @Override
        public long getIntervalVelocity() {
            return this.intervalVelocity_;
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
            if (this.pos_ != null) {
                output.writeMessage(1, this.getPos());
            }
            if (this.rot_ != null) {
                output.writeMessage(2, this.getRot());
            }
            if (this.speed_ != null) {
                output.writeMessage(3, this.getSpeed());
            }
            if (this.state_ != MotionStateOuterClass.MotionState.MOTION_STATE_NONE.getNumber()) {
                output.writeEnum(4, this.state_);
            }
            for (int i = 0; i < this.params_.size(); ++i) {
                output.writeMessage(5, this.params_.get(i));
            }
            if (this.refPos_ != null) {
                output.writeMessage(6, this.getRefPos());
            }
            if (this.refId_ != 0) {
                output.writeUInt32(7, this.refId_);
            }
            if (this.sceneTime_ != 0) {
                output.writeUInt32(8, this.sceneTime_);
            }
            if (this.intervalVelocity_ != 0L) {
                output.writeUInt64(9, this.intervalVelocity_);
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
            if (this.pos_ != null) {
                size += CodedOutputStream.computeMessageSize(1, this.getPos());
            }
            if (this.rot_ != null) {
                size += CodedOutputStream.computeMessageSize(2, this.getRot());
            }
            if (this.speed_ != null) {
                size += CodedOutputStream.computeMessageSize(3, this.getSpeed());
            }
            if (this.state_ != MotionStateOuterClass.MotionState.MOTION_STATE_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(4, this.state_);
            }
            for (int i = 0; i < this.params_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(5, this.params_.get(i));
            }
            if (this.refPos_ != null) {
                size += CodedOutputStream.computeMessageSize(6, this.getRefPos());
            }
            if (this.refId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.refId_);
            }
            if (this.sceneTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.sceneTime_);
            }
            if (this.intervalVelocity_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(9, this.intervalVelocity_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MotionInfo)) {
                return super.equals(obj);
            }
            final MotionInfo other = (MotionInfo)obj;
            return this.hasPos() == other.hasPos() && (!this.hasPos() || this.getPos().equals(other.getPos())) && this.hasRot() == other.hasRot() && (!this.hasRot() || this.getRot().equals(other.getRot())) && this.hasSpeed() == other.hasSpeed() && (!this.hasSpeed() || this.getSpeed().equals(other.getSpeed())) && this.state_ == other.state_ && this.getParamsList().equals(other.getParamsList()) && this.hasRefPos() == other.hasRefPos() && (!this.hasRefPos() || this.getRefPos().equals(other.getRefPos())) && this.getRefId() == other.getRefId() && this.getSceneTime() == other.getSceneTime() && this.getIntervalVelocity() == other.getIntervalVelocity() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPos()) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getPos().hashCode();
            }
            if (this.hasRot()) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getRot().hashCode();
            }
            if (this.hasSpeed()) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getSpeed().hashCode();
            }
            hash = 37 * hash + 4;
            hash = 53 * hash + this.state_;
            if (this.getParamsCount() > 0) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getParamsList().hashCode();
            }
            if (this.hasRefPos()) {
                hash = 37 * hash + 6;
                hash = 53 * hash + this.getRefPos().hashCode();
            }
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getRefId();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getSceneTime();
            hash = 37 * hash + 9;
            hash = 53 * hash + Internal.hashLong(this.getIntervalVelocity());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MotionInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MotionInfo.PARSER.parseFrom(data);
        }
        
        public static MotionInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MotionInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MotionInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MotionInfo.PARSER.parseFrom(data);
        }
        
        public static MotionInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MotionInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MotionInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MotionInfo.PARSER.parseFrom(data);
        }
        
        public static MotionInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MotionInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MotionInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MotionInfo.PARSER, input);
        }
        
        public static MotionInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MotionInfo.PARSER, input, extensionRegistry);
        }
        
        public static MotionInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MotionInfo.PARSER, input);
        }
        
        public static MotionInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MotionInfo.PARSER, input, extensionRegistry);
        }
        
        public static MotionInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MotionInfo.PARSER, input);
        }
        
        public static MotionInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MotionInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MotionInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MotionInfo prototype) {
            return MotionInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MotionInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MotionInfo getDefaultInstance() {
            return MotionInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<MotionInfo> parser() {
            return MotionInfo.PARSER;
        }
        
        @Override
        public Parser<MotionInfo> getParserForType() {
            return MotionInfo.PARSER;
        }
        
        @Override
        public MotionInfo getDefaultInstanceForType() {
            return MotionInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MotionInfo();
            PARSER = new AbstractParser<MotionInfo>() {
                @Override
                public MotionInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MotionInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MotionInfoOrBuilder
        {
            private int bitField0_;
            private VectorOuterClass.Vector pos_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> posBuilder_;
            private VectorOuterClass.Vector rot_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> rotBuilder_;
            private VectorOuterClass.Vector speed_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> speedBuilder_;
            private int state_;
            private List<VectorOuterClass.Vector> params_;
            private RepeatedFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> paramsBuilder_;
            private VectorOuterClass.Vector refPos_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> refPosBuilder_;
            private int refId_;
            private int sceneTime_;
            private long intervalVelocity_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MotionInfoOuterClass.internal_static_MotionInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MotionInfoOuterClass.internal_static_MotionInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(MotionInfo.class, Builder.class);
            }
            
            private Builder() {
                this.state_ = 0;
                this.params_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.state_ = 0;
                this.params_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MotionInfo.alwaysUseFieldBuilders) {
                    this.getParamsFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
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
                if (this.speedBuilder_ == null) {
                    this.speed_ = null;
                }
                else {
                    this.speed_ = null;
                    this.speedBuilder_ = null;
                }
                this.state_ = 0;
                if (this.paramsBuilder_ == null) {
                    this.params_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.paramsBuilder_.clear();
                }
                if (this.refPosBuilder_ == null) {
                    this.refPos_ = null;
                }
                else {
                    this.refPos_ = null;
                    this.refPosBuilder_ = null;
                }
                this.refId_ = 0;
                this.sceneTime_ = 0;
                this.intervalVelocity_ = 0L;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MotionInfoOuterClass.internal_static_MotionInfo_descriptor;
            }
            
            @Override
            public MotionInfo getDefaultInstanceForType() {
                return MotionInfo.getDefaultInstance();
            }
            
            @Override
            public MotionInfo build() {
                final MotionInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MotionInfo buildPartial() {
                final MotionInfo result = new MotionInfo(this);
                final int from_bitField0_ = this.bitField0_;
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
                if (this.speedBuilder_ == null) {
                    result.speed_ = this.speed_;
                }
                else {
                    result.speed_ = this.speedBuilder_.build();
                }
                result.state_ = this.state_;
                if (this.paramsBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.params_ = Collections.unmodifiableList((List<? extends VectorOuterClass.Vector>)this.params_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.params_ = this.params_;
                }
                else {
                    result.params_ = this.paramsBuilder_.build();
                }
                if (this.refPosBuilder_ == null) {
                    result.refPos_ = this.refPos_;
                }
                else {
                    result.refPos_ = this.refPosBuilder_.build();
                }
                result.refId_ = this.refId_;
                result.sceneTime_ = this.sceneTime_;
                result.intervalVelocity_ = this.intervalVelocity_;
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
                if (other instanceof MotionInfo) {
                    return this.mergeFrom((MotionInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MotionInfo other) {
                if (other == MotionInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.hasPos()) {
                    this.mergePos(other.getPos());
                }
                if (other.hasRot()) {
                    this.mergeRot(other.getRot());
                }
                if (other.hasSpeed()) {
                    this.mergeSpeed(other.getSpeed());
                }
                if (other.state_ != 0) {
                    this.setStateValue(other.getStateValue());
                }
                if (this.paramsBuilder_ == null) {
                    if (!other.params_.isEmpty()) {
                        if (this.params_.isEmpty()) {
                            this.params_ = other.params_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureParamsIsMutable();
                            this.params_.addAll(other.params_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.params_.isEmpty()) {
                    if (this.paramsBuilder_.isEmpty()) {
                        this.paramsBuilder_.dispose();
                        this.paramsBuilder_ = null;
                        this.params_ = other.params_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.paramsBuilder_ = (MotionInfo.alwaysUseFieldBuilders ? this.getParamsFieldBuilder() : null);
                    }
                    else {
                        this.paramsBuilder_.addAllMessages(other.params_);
                    }
                }
                if (other.hasRefPos()) {
                    this.mergeRefPos(other.getRefPos());
                }
                if (other.getRefId() != 0) {
                    this.setRefId(other.getRefId());
                }
                if (other.getSceneTime() != 0) {
                    this.setSceneTime(other.getSceneTime());
                }
                if (other.getIntervalVelocity() != 0L) {
                    this.setIntervalVelocity(other.getIntervalVelocity());
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
                MotionInfo parsedMessage = null;
                try {
                    parsedMessage = MotionInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MotionInfo)e.getUnfinishedMessage();
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
            public boolean hasSpeed() {
                return this.speedBuilder_ != null || this.speed_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getSpeed() {
                if (this.speedBuilder_ == null) {
                    return (this.speed_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.speed_;
                }
                return this.speedBuilder_.getMessage();
            }
            
            public Builder setSpeed(final VectorOuterClass.Vector value) {
                if (this.speedBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.speed_ = value;
                    this.onChanged();
                }
                else {
                    this.speedBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setSpeed(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.speedBuilder_ == null) {
                    this.speed_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.speedBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeSpeed(final VectorOuterClass.Vector value) {
                if (this.speedBuilder_ == null) {
                    if (this.speed_ != null) {
                        this.speed_ = VectorOuterClass.Vector.newBuilder(this.speed_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.speed_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.speedBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearSpeed() {
                if (this.speedBuilder_ == null) {
                    this.speed_ = null;
                    this.onChanged();
                }
                else {
                    this.speed_ = null;
                    this.speedBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getSpeedBuilder() {
                this.onChanged();
                return this.getSpeedFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getSpeedOrBuilder() {
                if (this.speedBuilder_ != null) {
                    return this.speedBuilder_.getMessageOrBuilder();
                }
                return (this.speed_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.speed_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getSpeedFieldBuilder() {
                if (this.speedBuilder_ == null) {
                    this.speedBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getSpeed(), this.getParentForChildren(), this.isClean());
                    this.speed_ = null;
                }
                return this.speedBuilder_;
            }
            
            @Override
            public int getStateValue() {
                return this.state_;
            }
            
            public Builder setStateValue(final int value) {
                this.state_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public MotionStateOuterClass.MotionState getState() {
                final MotionStateOuterClass.MotionState result = MotionStateOuterClass.MotionState.valueOf(this.state_);
                return (result == null) ? MotionStateOuterClass.MotionState.UNRECOGNIZED : result;
            }
            
            public Builder setState(final MotionStateOuterClass.MotionState value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.state_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearState() {
                this.state_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureParamsIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.params_ = new ArrayList<VectorOuterClass.Vector>(this.params_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<VectorOuterClass.Vector> getParamsList() {
                if (this.paramsBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends VectorOuterClass.Vector>)this.params_);
                }
                return this.paramsBuilder_.getMessageList();
            }
            
            @Override
            public int getParamsCount() {
                if (this.paramsBuilder_ == null) {
                    return this.params_.size();
                }
                return this.paramsBuilder_.getCount();
            }
            
            @Override
            public VectorOuterClass.Vector getParams(final int index) {
                if (this.paramsBuilder_ == null) {
                    return this.params_.get(index);
                }
                return this.paramsBuilder_.getMessage(index);
            }
            
            public Builder setParams(final int index, final VectorOuterClass.Vector value) {
                if (this.paramsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureParamsIsMutable();
                    this.params_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.paramsBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setParams(final int index, final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.paramsBuilder_ == null) {
                    this.ensureParamsIsMutable();
                    this.params_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.paramsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addParams(final VectorOuterClass.Vector value) {
                if (this.paramsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureParamsIsMutable();
                    this.params_.add(value);
                    this.onChanged();
                }
                else {
                    this.paramsBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addParams(final int index, final VectorOuterClass.Vector value) {
                if (this.paramsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureParamsIsMutable();
                    this.params_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.paramsBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addParams(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.paramsBuilder_ == null) {
                    this.ensureParamsIsMutable();
                    this.params_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.paramsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addParams(final int index, final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.paramsBuilder_ == null) {
                    this.ensureParamsIsMutable();
                    this.params_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.paramsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllParams(final Iterable<? extends VectorOuterClass.Vector> values) {
                if (this.paramsBuilder_ == null) {
                    this.ensureParamsIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.params_);
                    this.onChanged();
                }
                else {
                    this.paramsBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearParams() {
                if (this.paramsBuilder_ == null) {
                    this.params_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.paramsBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeParams(final int index) {
                if (this.paramsBuilder_ == null) {
                    this.ensureParamsIsMutable();
                    this.params_.remove(index);
                    this.onChanged();
                }
                else {
                    this.paramsBuilder_.remove(index);
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getParamsBuilder(final int index) {
                return this.getParamsFieldBuilder().getBuilder(index);
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getParamsOrBuilder(final int index) {
                if (this.paramsBuilder_ == null) {
                    return this.params_.get(index);
                }
                return this.paramsBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends VectorOuterClass.VectorOrBuilder> getParamsOrBuilderList() {
                if (this.paramsBuilder_ != null) {
                    return this.paramsBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends VectorOuterClass.VectorOrBuilder>)this.params_);
            }
            
            public VectorOuterClass.Vector.Builder addParamsBuilder() {
                return this.getParamsFieldBuilder().addBuilder(VectorOuterClass.Vector.getDefaultInstance());
            }
            
            public VectorOuterClass.Vector.Builder addParamsBuilder(final int index) {
                return this.getParamsFieldBuilder().addBuilder(index, VectorOuterClass.Vector.getDefaultInstance());
            }
            
            public List<VectorOuterClass.Vector.Builder> getParamsBuilderList() {
                return this.getParamsFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getParamsFieldBuilder() {
                if (this.paramsBuilder_ == null) {
                    this.paramsBuilder_ = new RepeatedFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.params_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.params_ = null;
                }
                return this.paramsBuilder_;
            }
            
            @Override
            public boolean hasRefPos() {
                return this.refPosBuilder_ != null || this.refPos_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getRefPos() {
                if (this.refPosBuilder_ == null) {
                    return (this.refPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.refPos_;
                }
                return this.refPosBuilder_.getMessage();
            }
            
            public Builder setRefPos(final VectorOuterClass.Vector value) {
                if (this.refPosBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.refPos_ = value;
                    this.onChanged();
                }
                else {
                    this.refPosBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setRefPos(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.refPosBuilder_ == null) {
                    this.refPos_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.refPosBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeRefPos(final VectorOuterClass.Vector value) {
                if (this.refPosBuilder_ == null) {
                    if (this.refPos_ != null) {
                        this.refPos_ = VectorOuterClass.Vector.newBuilder(this.refPos_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.refPos_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.refPosBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearRefPos() {
                if (this.refPosBuilder_ == null) {
                    this.refPos_ = null;
                    this.onChanged();
                }
                else {
                    this.refPos_ = null;
                    this.refPosBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getRefPosBuilder() {
                this.onChanged();
                return this.getRefPosFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getRefPosOrBuilder() {
                if (this.refPosBuilder_ != null) {
                    return this.refPosBuilder_.getMessageOrBuilder();
                }
                return (this.refPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.refPos_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getRefPosFieldBuilder() {
                if (this.refPosBuilder_ == null) {
                    this.refPosBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getRefPos(), this.getParentForChildren(), this.isClean());
                    this.refPos_ = null;
                }
                return this.refPosBuilder_;
            }
            
            @Override
            public int getRefId() {
                return this.refId_;
            }
            
            public Builder setRefId(final int value) {
                this.refId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRefId() {
                this.refId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getSceneTime() {
                return this.sceneTime_;
            }
            
            public Builder setSceneTime(final int value) {
                this.sceneTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSceneTime() {
                this.sceneTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public long getIntervalVelocity() {
                return this.intervalVelocity_;
            }
            
            public Builder setIntervalVelocity(final long value) {
                this.intervalVelocity_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIntervalVelocity() {
                this.intervalVelocity_ = 0L;
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
    
    public interface MotionInfoOrBuilder extends MessageOrBuilder
    {
        boolean hasPos();
        
        VectorOuterClass.Vector getPos();
        
        VectorOuterClass.VectorOrBuilder getPosOrBuilder();
        
        boolean hasRot();
        
        VectorOuterClass.Vector getRot();
        
        VectorOuterClass.VectorOrBuilder getRotOrBuilder();
        
        boolean hasSpeed();
        
        VectorOuterClass.Vector getSpeed();
        
        VectorOuterClass.VectorOrBuilder getSpeedOrBuilder();
        
        int getStateValue();
        
        MotionStateOuterClass.MotionState getState();
        
        List<VectorOuterClass.Vector> getParamsList();
        
        VectorOuterClass.Vector getParams(final int p0);
        
        int getParamsCount();
        
        List<? extends VectorOuterClass.VectorOrBuilder> getParamsOrBuilderList();
        
        VectorOuterClass.VectorOrBuilder getParamsOrBuilder(final int p0);
        
        boolean hasRefPos();
        
        VectorOuterClass.Vector getRefPos();
        
        VectorOuterClass.VectorOrBuilder getRefPosOrBuilder();
        
        int getRefId();
        
        int getSceneTime();
        
        long getIntervalVelocity();
    }
}
