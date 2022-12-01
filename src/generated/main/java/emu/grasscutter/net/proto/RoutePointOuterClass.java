// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Internal;
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

public final class RoutePointOuterClass
{
    private static final Descriptors.Descriptor internal_static_RoutePoint_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_RoutePoint_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private RoutePointOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return RoutePointOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0010RoutePoint.proto\u001a\u0014MathQuaternion.proto\u001a\fVector.proto\"\u00f0\u0001\n\nRoutePoint\u0012\u0019\n\bposition\u0018\u0001 \u0001(\u000b2\u0007.Vector\u0012\u0014\n\farrive_range\u0018\u0002 \u0001(\u0002\u0012\u0012\n\bvelocity\u0018\u000b \u0001(\u0002H\u0000\u0012\u000e\n\u0004time\u0018\f \u0001(\u0002H\u0000\u0012\u001b\n\brotation\u0018\u0015 \u0001(\u000b2\u0007.VectorH\u0001\u0012)\n\u000erotation_speed\u0018\u0016 \u0001(\u000b2\u000f.MathQuaternionH\u0001\u0012%\n\naxis_speed\u0018\u0017 \u0001(\u000b2\u000f.MathQuaternionH\u0001B\r\n\u000bmove_paramsB\u000f\n\rrotate_paramsB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        RoutePointOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { MathQuaternionOuterClass.getDescriptor(), VectorOuterClass.getDescriptor() });
        internal_static_RoutePoint_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_RoutePoint_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(RoutePointOuterClass.internal_static_RoutePoint_descriptor, new String[] { "Position", "ArriveRange", "Velocity", "Time", "Rotation", "RotationSpeed", "AxisSpeed", "MoveParams", "RotateParams" });
        MathQuaternionOuterClass.getDescriptor();
        VectorOuterClass.getDescriptor();
    }
    
    public static final class RoutePoint extends GeneratedMessageV3 implements RoutePointOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private int moveParamsCase_;
        private Object moveParams_;
        private int rotateParamsCase_;
        private Object rotateParams_;
        public static final int POSITION_FIELD_NUMBER = 1;
        private VectorOuterClass.Vector position_;
        public static final int ARRIVE_RANGE_FIELD_NUMBER = 2;
        private float arriveRange_;
        public static final int VELOCITY_FIELD_NUMBER = 11;
        public static final int TIME_FIELD_NUMBER = 12;
        public static final int ROTATION_FIELD_NUMBER = 21;
        public static final int ROTATION_SPEED_FIELD_NUMBER = 22;
        public static final int AXIS_SPEED_FIELD_NUMBER = 23;
        private byte memoizedIsInitialized;
        private static final RoutePoint DEFAULT_INSTANCE;
        private static final Parser<RoutePoint> PARSER;
        
        private RoutePoint(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.moveParamsCase_ = 0;
            this.rotateParamsCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        private RoutePoint() {
            this.moveParamsCase_ = 0;
            this.rotateParamsCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new RoutePoint();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private RoutePoint(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 10: {
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
                        case 21: {
                            this.arriveRange_ = input.readFloat();
                            continue;
                        }
                        case 93: {
                            this.moveParamsCase_ = 11;
                            this.moveParams_ = input.readFloat();
                            continue;
                        }
                        case 101: {
                            this.moveParamsCase_ = 12;
                            this.moveParams_ = input.readFloat();
                            continue;
                        }
                        case 170: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.rotateParamsCase_ == 21) {
                                subBuilder = ((VectorOuterClass.Vector)this.rotateParams_).toBuilder();
                            }
                            this.rotateParams_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((VectorOuterClass.Vector)this.rotateParams_);
                                this.rotateParams_ = subBuilder.buildPartial();
                            }
                            this.rotateParamsCase_ = 21;
                            continue;
                        }
                        case 178: {
                            MathQuaternionOuterClass.MathQuaternion.Builder subBuilder2 = null;
                            if (this.rotateParamsCase_ == 22) {
                                subBuilder2 = ((MathQuaternionOuterClass.MathQuaternion)this.rotateParams_).toBuilder();
                            }
                            this.rotateParams_ = input.readMessage(MathQuaternionOuterClass.MathQuaternion.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom((MathQuaternionOuterClass.MathQuaternion)this.rotateParams_);
                                this.rotateParams_ = subBuilder2.buildPartial();
                            }
                            this.rotateParamsCase_ = 22;
                            continue;
                        }
                        case 186: {
                            MathQuaternionOuterClass.MathQuaternion.Builder subBuilder2 = null;
                            if (this.rotateParamsCase_ == 23) {
                                subBuilder2 = ((MathQuaternionOuterClass.MathQuaternion)this.rotateParams_).toBuilder();
                            }
                            this.rotateParams_ = input.readMessage(MathQuaternionOuterClass.MathQuaternion.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom((MathQuaternionOuterClass.MathQuaternion)this.rotateParams_);
                                this.rotateParams_ = subBuilder2.buildPartial();
                            }
                            this.rotateParamsCase_ = 23;
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
            return RoutePointOuterClass.internal_static_RoutePoint_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return RoutePointOuterClass.internal_static_RoutePoint_fieldAccessorTable.ensureFieldAccessorsInitialized(RoutePoint.class, Builder.class);
        }
        
        @Override
        public MoveParamsCase getMoveParamsCase() {
            return MoveParamsCase.forNumber(this.moveParamsCase_);
        }
        
        @Override
        public RotateParamsCase getRotateParamsCase() {
            return RotateParamsCase.forNumber(this.rotateParamsCase_);
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
        public float getArriveRange() {
            return this.arriveRange_;
        }
        
        @Override
        public boolean hasVelocity() {
            return this.moveParamsCase_ == 11;
        }
        
        @Override
        public float getVelocity() {
            if (this.moveParamsCase_ == 11) {
                return (float)this.moveParams_;
            }
            return 0.0f;
        }
        
        @Override
        public boolean hasTime() {
            return this.moveParamsCase_ == 12;
        }
        
        @Override
        public float getTime() {
            if (this.moveParamsCase_ == 12) {
                return (float)this.moveParams_;
            }
            return 0.0f;
        }
        
        @Override
        public boolean hasRotation() {
            return this.rotateParamsCase_ == 21;
        }
        
        @Override
        public VectorOuterClass.Vector getRotation() {
            if (this.rotateParamsCase_ == 21) {
                return (VectorOuterClass.Vector)this.rotateParams_;
            }
            return VectorOuterClass.Vector.getDefaultInstance();
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getRotationOrBuilder() {
            if (this.rotateParamsCase_ == 21) {
                return (VectorOuterClass.Vector)this.rotateParams_;
            }
            return VectorOuterClass.Vector.getDefaultInstance();
        }
        
        @Override
        public boolean hasRotationSpeed() {
            return this.rotateParamsCase_ == 22;
        }
        
        @Override
        public MathQuaternionOuterClass.MathQuaternion getRotationSpeed() {
            if (this.rotateParamsCase_ == 22) {
                return (MathQuaternionOuterClass.MathQuaternion)this.rotateParams_;
            }
            return MathQuaternionOuterClass.MathQuaternion.getDefaultInstance();
        }
        
        @Override
        public MathQuaternionOuterClass.MathQuaternionOrBuilder getRotationSpeedOrBuilder() {
            if (this.rotateParamsCase_ == 22) {
                return (MathQuaternionOuterClass.MathQuaternion)this.rotateParams_;
            }
            return MathQuaternionOuterClass.MathQuaternion.getDefaultInstance();
        }
        
        @Override
        public boolean hasAxisSpeed() {
            return this.rotateParamsCase_ == 23;
        }
        
        @Override
        public MathQuaternionOuterClass.MathQuaternion getAxisSpeed() {
            if (this.rotateParamsCase_ == 23) {
                return (MathQuaternionOuterClass.MathQuaternion)this.rotateParams_;
            }
            return MathQuaternionOuterClass.MathQuaternion.getDefaultInstance();
        }
        
        @Override
        public MathQuaternionOuterClass.MathQuaternionOrBuilder getAxisSpeedOrBuilder() {
            if (this.rotateParamsCase_ == 23) {
                return (MathQuaternionOuterClass.MathQuaternion)this.rotateParams_;
            }
            return MathQuaternionOuterClass.MathQuaternion.getDefaultInstance();
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
            if (this.position_ != null) {
                output.writeMessage(1, this.getPosition());
            }
            if (this.arriveRange_ != 0.0f) {
                output.writeFloat(2, this.arriveRange_);
            }
            if (this.moveParamsCase_ == 11) {
                output.writeFloat(11, (float)this.moveParams_);
            }
            if (this.moveParamsCase_ == 12) {
                output.writeFloat(12, (float)this.moveParams_);
            }
            if (this.rotateParamsCase_ == 21) {
                output.writeMessage(21, (MessageLite)this.rotateParams_);
            }
            if (this.rotateParamsCase_ == 22) {
                output.writeMessage(22, (MessageLite)this.rotateParams_);
            }
            if (this.rotateParamsCase_ == 23) {
                output.writeMessage(23, (MessageLite)this.rotateParams_);
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
            if (this.position_ != null) {
                size += CodedOutputStream.computeMessageSize(1, this.getPosition());
            }
            if (this.arriveRange_ != 0.0f) {
                size += CodedOutputStream.computeFloatSize(2, this.arriveRange_);
            }
            if (this.moveParamsCase_ == 11) {
                size += CodedOutputStream.computeFloatSize(11, (float)this.moveParams_);
            }
            if (this.moveParamsCase_ == 12) {
                size += CodedOutputStream.computeFloatSize(12, (float)this.moveParams_);
            }
            if (this.rotateParamsCase_ == 21) {
                size += CodedOutputStream.computeMessageSize(21, (MessageLite)this.rotateParams_);
            }
            if (this.rotateParamsCase_ == 22) {
                size += CodedOutputStream.computeMessageSize(22, (MessageLite)this.rotateParams_);
            }
            if (this.rotateParamsCase_ == 23) {
                size += CodedOutputStream.computeMessageSize(23, (MessageLite)this.rotateParams_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RoutePoint)) {
                return super.equals(obj);
            }
            final RoutePoint other = (RoutePoint)obj;
            if (this.hasPosition() != other.hasPosition()) {
                return false;
            }
            if (this.hasPosition() && !this.getPosition().equals(other.getPosition())) {
                return false;
            }
            if (Float.floatToIntBits(this.getArriveRange()) != Float.floatToIntBits(other.getArriveRange())) {
                return false;
            }
            if (!this.getMoveParamsCase().equals(other.getMoveParamsCase())) {
                return false;
            }
            switch (this.moveParamsCase_) {
                case 11: {
                    if (Float.floatToIntBits(this.getVelocity()) != Float.floatToIntBits(other.getVelocity())) {
                        return false;
                    }
                    break;
                }
                case 12: {
                    if (Float.floatToIntBits(this.getTime()) != Float.floatToIntBits(other.getTime())) {
                        return false;
                    }
                    break;
                }
            }
            if (!this.getRotateParamsCase().equals(other.getRotateParamsCase())) {
                return false;
            }
            switch (this.rotateParamsCase_) {
                case 21: {
                    if (!this.getRotation().equals(other.getRotation())) {
                        return false;
                    }
                    break;
                }
                case 22: {
                    if (!this.getRotationSpeed().equals(other.getRotationSpeed())) {
                        return false;
                    }
                    break;
                }
                case 23: {
                    if (!this.getAxisSpeed().equals(other.getAxisSpeed())) {
                        return false;
                    }
                    break;
                }
            }
            return this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPosition()) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getPosition().hashCode();
            }
            hash = 37 * hash + 2;
            hash = 53 * hash + Float.floatToIntBits(this.getArriveRange());
            switch (this.moveParamsCase_) {
                case 11: {
                    hash = 37 * hash + 11;
                    hash = 53 * hash + Float.floatToIntBits(this.getVelocity());
                    break;
                }
                case 12: {
                    hash = 37 * hash + 12;
                    hash = 53 * hash + Float.floatToIntBits(this.getTime());
                    break;
                }
            }
            switch (this.rotateParamsCase_) {
                case 21: {
                    hash = 37 * hash + 21;
                    hash = 53 * hash + this.getRotation().hashCode();
                    break;
                }
                case 22: {
                    hash = 37 * hash + 22;
                    hash = 53 * hash + this.getRotationSpeed().hashCode();
                    break;
                }
                case 23: {
                    hash = 37 * hash + 23;
                    hash = 53 * hash + this.getAxisSpeed().hashCode();
                    break;
                }
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static RoutePoint parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return RoutePoint.PARSER.parseFrom(data);
        }
        
        public static RoutePoint parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return RoutePoint.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static RoutePoint parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return RoutePoint.PARSER.parseFrom(data);
        }
        
        public static RoutePoint parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return RoutePoint.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static RoutePoint parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return RoutePoint.PARSER.parseFrom(data);
        }
        
        public static RoutePoint parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return RoutePoint.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static RoutePoint parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(RoutePoint.PARSER, input);
        }
        
        public static RoutePoint parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(RoutePoint.PARSER, input, extensionRegistry);
        }
        
        public static RoutePoint parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(RoutePoint.PARSER, input);
        }
        
        public static RoutePoint parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(RoutePoint.PARSER, input, extensionRegistry);
        }
        
        public static RoutePoint parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(RoutePoint.PARSER, input);
        }
        
        public static RoutePoint parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(RoutePoint.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return RoutePoint.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final RoutePoint prototype) {
            return RoutePoint.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == RoutePoint.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static RoutePoint getDefaultInstance() {
            return RoutePoint.DEFAULT_INSTANCE;
        }
        
        public static Parser<RoutePoint> parser() {
            return RoutePoint.PARSER;
        }
        
        @Override
        public Parser<RoutePoint> getParserForType() {
            return RoutePoint.PARSER;
        }
        
        @Override
        public RoutePoint getDefaultInstanceForType() {
            return RoutePoint.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new RoutePoint();
            PARSER = new AbstractParser<RoutePoint>() {
                @Override
                public RoutePoint parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new RoutePoint(input, extensionRegistry);
                }
            };
        }
        
        public enum MoveParamsCase implements Internal.EnumLite, InternalOneOfEnum
        {
            VELOCITY(11), 
            TIME(12), 
            MOVEPARAMS_NOT_SET(0);
            
            private final int value;
            
            private MoveParamsCase(final int value) {
                this.value = value;
            }
            
            @Deprecated
            public static MoveParamsCase valueOf(final int value) {
                return forNumber(value);
            }
            
            public static MoveParamsCase forNumber(final int value) {
                switch (value) {
                    case 11: {
                        return MoveParamsCase.VELOCITY;
                    }
                    case 12: {
                        return MoveParamsCase.TIME;
                    }
                    case 0: {
                        return MoveParamsCase.MOVEPARAMS_NOT_SET;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            @Override
            public int getNumber() {
                return this.value;
            }
            
            private static /* synthetic */ MoveParamsCase[] value() {
                return new MoveParamsCase[] { MoveParamsCase.VELOCITY, MoveParamsCase.TIME, MoveParamsCase.MOVEPARAMS_NOT_SET };
            }
            
            
        }
        
        public enum RotateParamsCase implements Internal.EnumLite, InternalOneOfEnum
        {
            ROTATION(21), 
            ROTATION_SPEED(22), 
            AXIS_SPEED(23), 
            ROTATEPARAMS_NOT_SET(0);
            
            private final int value;
            
            private RotateParamsCase(final int value) {
                this.value = value;
            }
            
            @Deprecated
            public static RotateParamsCase valueOf(final int value) {
                return forNumber(value);
            }
            
            public static RotateParamsCase forNumber(final int value) {
                switch (value) {
                    case 21: {
                        return RotateParamsCase.ROTATION;
                    }
                    case 22: {
                        return RotateParamsCase.ROTATION_SPEED;
                    }
                    case 23: {
                        return RotateParamsCase.AXIS_SPEED;
                    }
                    case 0: {
                        return RotateParamsCase.ROTATEPARAMS_NOT_SET;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            @Override
            public int getNumber() {
                return this.value;
            }
            
            private static /* synthetic */ RotateParamsCase[] value() {
                return new RotateParamsCase[] { RotateParamsCase.ROTATION, RotateParamsCase.ROTATION_SPEED, RotateParamsCase.AXIS_SPEED, RotateParamsCase.ROTATEPARAMS_NOT_SET };
            }
            
            
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RoutePointOrBuilder
        {
            private int moveParamsCase_;
            private Object moveParams_;
            private int rotateParamsCase_;
            private Object rotateParams_;
            private VectorOuterClass.Vector position_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> positionBuilder_;
            private float arriveRange_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> rotationBuilder_;
            private SingleFieldBuilderV3<MathQuaternionOuterClass.MathQuaternion, MathQuaternionOuterClass.MathQuaternion.Builder, MathQuaternionOuterClass.MathQuaternionOrBuilder> rotationSpeedBuilder_;
            private SingleFieldBuilderV3<MathQuaternionOuterClass.MathQuaternion, MathQuaternionOuterClass.MathQuaternion.Builder, MathQuaternionOuterClass.MathQuaternionOrBuilder> axisSpeedBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return RoutePointOuterClass.internal_static_RoutePoint_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return RoutePointOuterClass.internal_static_RoutePoint_fieldAccessorTable.ensureFieldAccessorsInitialized(RoutePoint.class, Builder.class);
            }
            
            private Builder() {
                this.moveParamsCase_ = 0;
                this.rotateParamsCase_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.moveParamsCase_ = 0;
                this.rotateParamsCase_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (RoutePoint.alwaysUseFieldBuilders) {}
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
                this.arriveRange_ = 0.0f;
                this.moveParamsCase_ = 0;
                this.moveParams_ = null;
                this.rotateParamsCase_ = 0;
                this.rotateParams_ = null;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return RoutePointOuterClass.internal_static_RoutePoint_descriptor;
            }
            
            @Override
            public RoutePoint getDefaultInstanceForType() {
                return RoutePoint.getDefaultInstance();
            }
            
            @Override
            public RoutePoint build() {
                final RoutePoint result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public RoutePoint buildPartial() {
                final RoutePoint result = new RoutePoint(this);
                if (this.positionBuilder_ == null) {
                    result.position_ = this.position_;
                }
                else {
                    result.position_ = this.positionBuilder_.build();
                }
                result.arriveRange_ = this.arriveRange_;
                if (this.moveParamsCase_ == 11) {
                    result.moveParams_ = this.moveParams_;
                }
                if (this.moveParamsCase_ == 12) {
                    result.moveParams_ = this.moveParams_;
                }
                if (this.rotateParamsCase_ == 21) {
                    if (this.rotationBuilder_ == null) {
                        result.rotateParams_ = this.rotateParams_;
                    }
                    else {
                        result.rotateParams_ = this.rotationBuilder_.build();
                    }
                }
                if (this.rotateParamsCase_ == 22) {
                    if (this.rotationSpeedBuilder_ == null) {
                        result.rotateParams_ = this.rotateParams_;
                    }
                    else {
                        result.rotateParams_ = this.rotationSpeedBuilder_.build();
                    }
                }
                if (this.rotateParamsCase_ == 23) {
                    if (this.axisSpeedBuilder_ == null) {
                        result.rotateParams_ = this.rotateParams_;
                    }
                    else {
                        result.rotateParams_ = this.axisSpeedBuilder_.build();
                    }
                }
                result.moveParamsCase_ = this.moveParamsCase_;
                result.rotateParamsCase_ = this.rotateParamsCase_;
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
                if (other instanceof RoutePoint) {
                    return this.mergeFrom((RoutePoint)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final RoutePoint other) {
                if (other == RoutePoint.getDefaultInstance()) {
                    return this;
                }
                if (other.hasPosition()) {
                    this.mergePosition(other.getPosition());
                }
                if (other.getArriveRange() != 0.0f) {
                    this.setArriveRange(other.getArriveRange());
                }
                switch (other.getMoveParamsCase()) {
                    case VELOCITY: {
                        this.setVelocity(other.getVelocity());
                        break;
                    }
                    case TIME: {
                        this.setTime(other.getTime());
                        break;
                    }
                }
                switch (other.getRotateParamsCase()) {
                    case ROTATION: {
                        this.mergeRotation(other.getRotation());
                        break;
                    }
                    case ROTATION_SPEED: {
                        this.mergeRotationSpeed(other.getRotationSpeed());
                        break;
                    }
                    case AXIS_SPEED: {
                        this.mergeAxisSpeed(other.getAxisSpeed());
                        break;
                    }
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
                RoutePoint parsedMessage = null;
                try {
                    parsedMessage = RoutePoint.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (RoutePoint)e.getUnfinishedMessage();
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
            public MoveParamsCase getMoveParamsCase() {
                return MoveParamsCase.forNumber(this.moveParamsCase_);
            }
            
            public Builder clearMoveParams() {
                this.moveParamsCase_ = 0;
                this.moveParams_ = null;
                this.onChanged();
                return this;
            }
            
            @Override
            public RotateParamsCase getRotateParamsCase() {
                return RotateParamsCase.forNumber(this.rotateParamsCase_);
            }
            
            public Builder clearRotateParams() {
                this.rotateParamsCase_ = 0;
                this.rotateParams_ = null;
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
            public float getArriveRange() {
                return this.arriveRange_;
            }
            
            public Builder setArriveRange(final float value) {
                this.arriveRange_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearArriveRange() {
                this.arriveRange_ = 0.0f;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasVelocity() {
                return this.moveParamsCase_ == 11;
            }
            
            @Override
            public float getVelocity() {
                if (this.moveParamsCase_ == 11) {
                    return (float)this.moveParams_;
                }
                return 0.0f;
            }
            
            public Builder setVelocity(final float value) {
                this.moveParamsCase_ = 11;
                this.moveParams_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearVelocity() {
                if (this.moveParamsCase_ == 11) {
                    this.moveParamsCase_ = 0;
                    this.moveParams_ = null;
                    this.onChanged();
                }
                return this;
            }
            
            @Override
            public boolean hasTime() {
                return this.moveParamsCase_ == 12;
            }
            
            @Override
            public float getTime() {
                if (this.moveParamsCase_ == 12) {
                    return (float)this.moveParams_;
                }
                return 0.0f;
            }
            
            public Builder setTime(final float value) {
                this.moveParamsCase_ = 12;
                this.moveParams_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTime() {
                if (this.moveParamsCase_ == 12) {
                    this.moveParamsCase_ = 0;
                    this.moveParams_ = null;
                    this.onChanged();
                }
                return this;
            }
            
            @Override
            public boolean hasRotation() {
                return this.rotateParamsCase_ == 21;
            }
            
            @Override
            public VectorOuterClass.Vector getRotation() {
                if (this.rotationBuilder_ == null) {
                    if (this.rotateParamsCase_ == 21) {
                        return (VectorOuterClass.Vector)this.rotateParams_;
                    }
                    return VectorOuterClass.Vector.getDefaultInstance();
                }
                else {
                    if (this.rotateParamsCase_ == 21) {
                        return this.rotationBuilder_.getMessage();
                    }
                    return VectorOuterClass.Vector.getDefaultInstance();
                }
            }
            
            public Builder setRotation(final VectorOuterClass.Vector value) {
                if (this.rotationBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.rotateParams_ = value;
                    this.onChanged();
                }
                else {
                    this.rotationBuilder_.setMessage(value);
                }
                this.rotateParamsCase_ = 21;
                return this;
            }
            
            public Builder setRotation(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.rotationBuilder_ == null) {
                    this.rotateParams_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.rotationBuilder_.setMessage(builderForValue.build());
                }
                this.rotateParamsCase_ = 21;
                return this;
            }
            
            public Builder mergeRotation(final VectorOuterClass.Vector value) {
                if (this.rotationBuilder_ == null) {
                    if (this.rotateParamsCase_ == 21 && this.rotateParams_ != VectorOuterClass.Vector.getDefaultInstance()) {
                        this.rotateParams_ = VectorOuterClass.Vector.newBuilder((VectorOuterClass.Vector)this.rotateParams_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.rotateParams_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.rotateParamsCase_ == 21) {
                        this.rotationBuilder_.mergeFrom(value);
                    }
                    this.rotationBuilder_.setMessage(value);
                }
                this.rotateParamsCase_ = 21;
                return this;
            }
            
            public Builder clearRotation() {
                if (this.rotationBuilder_ == null) {
                    if (this.rotateParamsCase_ == 21) {
                        this.rotateParamsCase_ = 0;
                        this.rotateParams_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.rotateParamsCase_ == 21) {
                        this.rotateParamsCase_ = 0;
                        this.rotateParams_ = null;
                    }
                    this.rotationBuilder_.clear();
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getRotationBuilder() {
                return this.getRotationFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getRotationOrBuilder() {
                if (this.rotateParamsCase_ == 21 && this.rotationBuilder_ != null) {
                    return this.rotationBuilder_.getMessageOrBuilder();
                }
                if (this.rotateParamsCase_ == 21) {
                    return (VectorOuterClass.Vector)this.rotateParams_;
                }
                return VectorOuterClass.Vector.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getRotationFieldBuilder() {
                if (this.rotationBuilder_ == null) {
                    if (this.rotateParamsCase_ != 21) {
                        this.rotateParams_ = VectorOuterClass.Vector.getDefaultInstance();
                    }
                    this.rotationBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>((VectorOuterClass.Vector)this.rotateParams_, this.getParentForChildren(), this.isClean());
                    this.rotateParams_ = null;
                }
                this.rotateParamsCase_ = 21;
                this.onChanged();
                return this.rotationBuilder_;
            }
            
            @Override
            public boolean hasRotationSpeed() {
                return this.rotateParamsCase_ == 22;
            }
            
            @Override
            public MathQuaternionOuterClass.MathQuaternion getRotationSpeed() {
                if (this.rotationSpeedBuilder_ == null) {
                    if (this.rotateParamsCase_ == 22) {
                        return (MathQuaternionOuterClass.MathQuaternion)this.rotateParams_;
                    }
                    return MathQuaternionOuterClass.MathQuaternion.getDefaultInstance();
                }
                else {
                    if (this.rotateParamsCase_ == 22) {
                        return this.rotationSpeedBuilder_.getMessage();
                    }
                    return MathQuaternionOuterClass.MathQuaternion.getDefaultInstance();
                }
            }
            
            public Builder setRotationSpeed(final MathQuaternionOuterClass.MathQuaternion value) {
                if (this.rotationSpeedBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.rotateParams_ = value;
                    this.onChanged();
                }
                else {
                    this.rotationSpeedBuilder_.setMessage(value);
                }
                this.rotateParamsCase_ = 22;
                return this;
            }
            
            public Builder setRotationSpeed(final MathQuaternionOuterClass.MathQuaternion.Builder builderForValue) {
                if (this.rotationSpeedBuilder_ == null) {
                    this.rotateParams_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.rotationSpeedBuilder_.setMessage(builderForValue.build());
                }
                this.rotateParamsCase_ = 22;
                return this;
            }
            
            public Builder mergeRotationSpeed(final MathQuaternionOuterClass.MathQuaternion value) {
                if (this.rotationSpeedBuilder_ == null) {
                    if (this.rotateParamsCase_ == 22 && this.rotateParams_ != MathQuaternionOuterClass.MathQuaternion.getDefaultInstance()) {
                        this.rotateParams_ = MathQuaternionOuterClass.MathQuaternion.newBuilder((MathQuaternionOuterClass.MathQuaternion)this.rotateParams_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.rotateParams_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.rotateParamsCase_ == 22) {
                        this.rotationSpeedBuilder_.mergeFrom(value);
                    }
                    this.rotationSpeedBuilder_.setMessage(value);
                }
                this.rotateParamsCase_ = 22;
                return this;
            }
            
            public Builder clearRotationSpeed() {
                if (this.rotationSpeedBuilder_ == null) {
                    if (this.rotateParamsCase_ == 22) {
                        this.rotateParamsCase_ = 0;
                        this.rotateParams_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.rotateParamsCase_ == 22) {
                        this.rotateParamsCase_ = 0;
                        this.rotateParams_ = null;
                    }
                    this.rotationSpeedBuilder_.clear();
                }
                return this;
            }
            
            public MathQuaternionOuterClass.MathQuaternion.Builder getRotationSpeedBuilder() {
                return this.getRotationSpeedFieldBuilder().getBuilder();
            }
            
            @Override
            public MathQuaternionOuterClass.MathQuaternionOrBuilder getRotationSpeedOrBuilder() {
                if (this.rotateParamsCase_ == 22 && this.rotationSpeedBuilder_ != null) {
                    return this.rotationSpeedBuilder_.getMessageOrBuilder();
                }
                if (this.rotateParamsCase_ == 22) {
                    return (MathQuaternionOuterClass.MathQuaternion)this.rotateParams_;
                }
                return MathQuaternionOuterClass.MathQuaternion.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<MathQuaternionOuterClass.MathQuaternion, MathQuaternionOuterClass.MathQuaternion.Builder, MathQuaternionOuterClass.MathQuaternionOrBuilder> getRotationSpeedFieldBuilder() {
                if (this.rotationSpeedBuilder_ == null) {
                    if (this.rotateParamsCase_ != 22) {
                        this.rotateParams_ = MathQuaternionOuterClass.MathQuaternion.getDefaultInstance();
                    }
                    this.rotationSpeedBuilder_ = new SingleFieldBuilderV3<MathQuaternionOuterClass.MathQuaternion, MathQuaternionOuterClass.MathQuaternion.Builder, MathQuaternionOuterClass.MathQuaternionOrBuilder>((MathQuaternionOuterClass.MathQuaternion)this.rotateParams_, this.getParentForChildren(), this.isClean());
                    this.rotateParams_ = null;
                }
                this.rotateParamsCase_ = 22;
                this.onChanged();
                return this.rotationSpeedBuilder_;
            }
            
            @Override
            public boolean hasAxisSpeed() {
                return this.rotateParamsCase_ == 23;
            }
            
            @Override
            public MathQuaternionOuterClass.MathQuaternion getAxisSpeed() {
                if (this.axisSpeedBuilder_ == null) {
                    if (this.rotateParamsCase_ == 23) {
                        return (MathQuaternionOuterClass.MathQuaternion)this.rotateParams_;
                    }
                    return MathQuaternionOuterClass.MathQuaternion.getDefaultInstance();
                }
                else {
                    if (this.rotateParamsCase_ == 23) {
                        return this.axisSpeedBuilder_.getMessage();
                    }
                    return MathQuaternionOuterClass.MathQuaternion.getDefaultInstance();
                }
            }
            
            public Builder setAxisSpeed(final MathQuaternionOuterClass.MathQuaternion value) {
                if (this.axisSpeedBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.rotateParams_ = value;
                    this.onChanged();
                }
                else {
                    this.axisSpeedBuilder_.setMessage(value);
                }
                this.rotateParamsCase_ = 23;
                return this;
            }
            
            public Builder setAxisSpeed(final MathQuaternionOuterClass.MathQuaternion.Builder builderForValue) {
                if (this.axisSpeedBuilder_ == null) {
                    this.rotateParams_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.axisSpeedBuilder_.setMessage(builderForValue.build());
                }
                this.rotateParamsCase_ = 23;
                return this;
            }
            
            public Builder mergeAxisSpeed(final MathQuaternionOuterClass.MathQuaternion value) {
                if (this.axisSpeedBuilder_ == null) {
                    if (this.rotateParamsCase_ == 23 && this.rotateParams_ != MathQuaternionOuterClass.MathQuaternion.getDefaultInstance()) {
                        this.rotateParams_ = MathQuaternionOuterClass.MathQuaternion.newBuilder((MathQuaternionOuterClass.MathQuaternion)this.rotateParams_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.rotateParams_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.rotateParamsCase_ == 23) {
                        this.axisSpeedBuilder_.mergeFrom(value);
                    }
                    this.axisSpeedBuilder_.setMessage(value);
                }
                this.rotateParamsCase_ = 23;
                return this;
            }
            
            public Builder clearAxisSpeed() {
                if (this.axisSpeedBuilder_ == null) {
                    if (this.rotateParamsCase_ == 23) {
                        this.rotateParamsCase_ = 0;
                        this.rotateParams_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.rotateParamsCase_ == 23) {
                        this.rotateParamsCase_ = 0;
                        this.rotateParams_ = null;
                    }
                    this.axisSpeedBuilder_.clear();
                }
                return this;
            }
            
            public MathQuaternionOuterClass.MathQuaternion.Builder getAxisSpeedBuilder() {
                return this.getAxisSpeedFieldBuilder().getBuilder();
            }
            
            @Override
            public MathQuaternionOuterClass.MathQuaternionOrBuilder getAxisSpeedOrBuilder() {
                if (this.rotateParamsCase_ == 23 && this.axisSpeedBuilder_ != null) {
                    return this.axisSpeedBuilder_.getMessageOrBuilder();
                }
                if (this.rotateParamsCase_ == 23) {
                    return (MathQuaternionOuterClass.MathQuaternion)this.rotateParams_;
                }
                return MathQuaternionOuterClass.MathQuaternion.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<MathQuaternionOuterClass.MathQuaternion, MathQuaternionOuterClass.MathQuaternion.Builder, MathQuaternionOuterClass.MathQuaternionOrBuilder> getAxisSpeedFieldBuilder() {
                if (this.axisSpeedBuilder_ == null) {
                    if (this.rotateParamsCase_ != 23) {
                        this.rotateParams_ = MathQuaternionOuterClass.MathQuaternion.getDefaultInstance();
                    }
                    this.axisSpeedBuilder_ = new SingleFieldBuilderV3<MathQuaternionOuterClass.MathQuaternion, MathQuaternionOuterClass.MathQuaternion.Builder, MathQuaternionOuterClass.MathQuaternionOrBuilder>((MathQuaternionOuterClass.MathQuaternion)this.rotateParams_, this.getParentForChildren(), this.isClean());
                    this.rotateParams_ = null;
                }
                this.rotateParamsCase_ = 23;
                this.onChanged();
                return this.axisSpeedBuilder_;
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
    
    public interface RoutePointOrBuilder extends MessageOrBuilder
    {
        boolean hasPosition();
        
        VectorOuterClass.Vector getPosition();
        
        VectorOuterClass.VectorOrBuilder getPositionOrBuilder();
        
        float getArriveRange();
        
        boolean hasVelocity();
        
        float getVelocity();
        
        boolean hasTime();
        
        float getTime();
        
        boolean hasRotation();
        
        VectorOuterClass.Vector getRotation();
        
        VectorOuterClass.VectorOrBuilder getRotationOrBuilder();
        
        boolean hasRotationSpeed();
        
        MathQuaternionOuterClass.MathQuaternion getRotationSpeed();
        
        MathQuaternionOuterClass.MathQuaternionOrBuilder getRotationSpeedOrBuilder();
        
        boolean hasAxisSpeed();
        
        MathQuaternionOuterClass.MathQuaternion getAxisSpeed();
        
        MathQuaternionOuterClass.MathQuaternionOrBuilder getAxisSpeedOrBuilder();
        
        RoutePoint.MoveParamsCase getMoveParamsCase();
        
        RoutePoint.RotateParamsCase getRotateParamsCase();
    }
}
