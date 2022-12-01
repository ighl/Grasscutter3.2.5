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

public final class PlatformInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_PlatformInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlatformInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PlatformInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlatformInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0012PlatformInfo.proto\u001a\u0014MathQuaternion.proto\u001a\u0018MovingPlatformType.proto\u001a\u000bRoute.proto\u001a\fVector.proto\"\u0087\u0003\n\fPlatformInfo\u0012\u0010\n\broute_id\u0018\u0001 \u0001(\r\u0012\u0013\n\u000bstart_index\u0018\u0002 \u0001(\u0005\u0012\u0018\n\u0010start_route_time\u0018\u0003 \u0001(\r\u0012\u0018\n\u0010start_scene_time\u0018\u0004 \u0001(\r\u0012\u001a\n\tstart_pos\u0018\u0007 \u0001(\u000b2\u0007.Vector\u0012\u0012\n\nis_started\u0018\b \u0001(\b\u0012\"\n\tstart_rot\u0018\t \u0001(\u000b2\u000f.MathQuaternion\u0012\u0017\n\u000fstop_scene_time\u0018\n \u0001(\r\u0012\u001b\n\npos_offset\u0018\u000b \u0001(\u000b2\u0007.Vector\u0012#\n\nrot_offset\u0018\f \u0001(\u000b2\u000f.MathQuaternion\u00121\n\u0014moving_platform_type\u0018\r \u0001(\u000e2\u0013.MovingPlatformType\u0012\u0011\n\tis_active\u0018\u000e \u0001(\b\u0012\u0015\n\u0005route\u0018\u000f \u0001(\u000b2\u0006.Route\u0012\u0010\n\bpoint_id\u0018\u0010 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlatformInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { MathQuaternionOuterClass.getDescriptor(), MovingPlatformTypeOuterClass.getDescriptor(), RouteOuterClass.getDescriptor(), VectorOuterClass.getDescriptor() });
        internal_static_PlatformInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlatformInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlatformInfoOuterClass.internal_static_PlatformInfo_descriptor, new String[] { "RouteId", "StartIndex", "StartRouteTime", "StartSceneTime", "StartPos", "IsStarted", "StartRot", "StopSceneTime", "PosOffset", "RotOffset", "MovingPlatformType", "IsActive", "Route", "PointId" });
        MathQuaternionOuterClass.getDescriptor();
        MovingPlatformTypeOuterClass.getDescriptor();
        RouteOuterClass.getDescriptor();
        VectorOuterClass.getDescriptor();
    }
    
    public static final class PlatformInfo extends GeneratedMessageV3 implements PlatformInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ROUTE_ID_FIELD_NUMBER = 1;
        private int routeId_;
        public static final int START_INDEX_FIELD_NUMBER = 2;
        private int startIndex_;
        public static final int START_ROUTE_TIME_FIELD_NUMBER = 3;
        private int startRouteTime_;
        public static final int START_SCENE_TIME_FIELD_NUMBER = 4;
        private int startSceneTime_;
        public static final int START_POS_FIELD_NUMBER = 7;
        private VectorOuterClass.Vector startPos_;
        public static final int IS_STARTED_FIELD_NUMBER = 8;
        private boolean isStarted_;
        public static final int START_ROT_FIELD_NUMBER = 9;
        private MathQuaternionOuterClass.MathQuaternion startRot_;
        public static final int STOP_SCENE_TIME_FIELD_NUMBER = 10;
        private int stopSceneTime_;
        public static final int POS_OFFSET_FIELD_NUMBER = 11;
        private VectorOuterClass.Vector posOffset_;
        public static final int ROT_OFFSET_FIELD_NUMBER = 12;
        private MathQuaternionOuterClass.MathQuaternion rotOffset_;
        public static final int MOVING_PLATFORM_TYPE_FIELD_NUMBER = 13;
        private int movingPlatformType_;
        public static final int IS_ACTIVE_FIELD_NUMBER = 14;
        private boolean isActive_;
        public static final int ROUTE_FIELD_NUMBER = 15;
        private RouteOuterClass.Route route_;
        public static final int POINT_ID_FIELD_NUMBER = 16;
        private int pointId_;
        private byte memoizedIsInitialized;
        private static final PlatformInfo DEFAULT_INSTANCE;
        private static final Parser<PlatformInfo> PARSER;
        
        private PlatformInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PlatformInfo() {
            this.memoizedIsInitialized = -1;
            this.movingPlatformType_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PlatformInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PlatformInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.routeId_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.startIndex_ = input.readInt32();
                            continue;
                        }
                        case 24: {
                            this.startRouteTime_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.startSceneTime_ = input.readUInt32();
                            continue;
                        }
                        case 58: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.startPos_ != null) {
                                subBuilder = this.startPos_.toBuilder();
                            }
                            this.startPos_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.startPos_);
                                this.startPos_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 64: {
                            this.isStarted_ = input.readBool();
                            continue;
                        }
                        case 74: {
                            MathQuaternionOuterClass.MathQuaternion.Builder subBuilder2 = null;
                            if (this.startRot_ != null) {
                                subBuilder2 = this.startRot_.toBuilder();
                            }
                            this.startRot_ = input.readMessage(MathQuaternionOuterClass.MathQuaternion.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom(this.startRot_);
                                this.startRot_ = subBuilder2.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 80: {
                            this.stopSceneTime_ = input.readUInt32();
                            continue;
                        }
                        case 90: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.posOffset_ != null) {
                                subBuilder = this.posOffset_.toBuilder();
                            }
                            this.posOffset_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.posOffset_);
                                this.posOffset_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 98: {
                            MathQuaternionOuterClass.MathQuaternion.Builder subBuilder2 = null;
                            if (this.rotOffset_ != null) {
                                subBuilder2 = this.rotOffset_.toBuilder();
                            }
                            this.rotOffset_ = input.readMessage(MathQuaternionOuterClass.MathQuaternion.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom(this.rotOffset_);
                                this.rotOffset_ = subBuilder2.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 104: {
                            final int rawValue = input.readEnum();
                            this.movingPlatformType_ = rawValue;
                            continue;
                        }
                        case 112: {
                            this.isActive_ = input.readBool();
                            continue;
                        }
                        case 122: {
                            RouteOuterClass.Route.Builder subBuilder3 = null;
                            if (this.route_ != null) {
                                subBuilder3 = this.route_.toBuilder();
                            }
                            this.route_ = input.readMessage(RouteOuterClass.Route.parser(), extensionRegistry);
                            if (subBuilder3 != null) {
                                subBuilder3.mergeFrom(this.route_);
                                this.route_ = subBuilder3.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 128: {
                            this.pointId_ = input.readUInt32();
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
            return PlatformInfoOuterClass.internal_static_PlatformInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PlatformInfoOuterClass.internal_static_PlatformInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PlatformInfo.class, Builder.class);
        }
        
        @Override
        public int getRouteId() {
            return this.routeId_;
        }
        
        @Override
        public int getStartIndex() {
            return this.startIndex_;
        }
        
        @Override
        public int getStartRouteTime() {
            return this.startRouteTime_;
        }
        
        @Override
        public int getStartSceneTime() {
            return this.startSceneTime_;
        }
        
        @Override
        public boolean hasStartPos() {
            return this.startPos_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getStartPos() {
            return (this.startPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.startPos_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getStartPosOrBuilder() {
            return this.getStartPos();
        }
        
        @Override
        public boolean getIsStarted() {
            return this.isStarted_;
        }
        
        @Override
        public boolean hasStartRot() {
            return this.startRot_ != null;
        }
        
        @Override
        public MathQuaternionOuterClass.MathQuaternion getStartRot() {
            return (this.startRot_ == null) ? MathQuaternionOuterClass.MathQuaternion.getDefaultInstance() : this.startRot_;
        }
        
        @Override
        public MathQuaternionOuterClass.MathQuaternionOrBuilder getStartRotOrBuilder() {
            return this.getStartRot();
        }
        
        @Override
        public int getStopSceneTime() {
            return this.stopSceneTime_;
        }
        
        @Override
        public boolean hasPosOffset() {
            return this.posOffset_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getPosOffset() {
            return (this.posOffset_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.posOffset_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getPosOffsetOrBuilder() {
            return this.getPosOffset();
        }
        
        @Override
        public boolean hasRotOffset() {
            return this.rotOffset_ != null;
        }
        
        @Override
        public MathQuaternionOuterClass.MathQuaternion getRotOffset() {
            return (this.rotOffset_ == null) ? MathQuaternionOuterClass.MathQuaternion.getDefaultInstance() : this.rotOffset_;
        }
        
        @Override
        public MathQuaternionOuterClass.MathQuaternionOrBuilder getRotOffsetOrBuilder() {
            return this.getRotOffset();
        }
        
        @Override
        public int getMovingPlatformTypeValue() {
            return this.movingPlatformType_;
        }
        
        @Override
        public MovingPlatformTypeOuterClass.MovingPlatformType getMovingPlatformType() {
            final MovingPlatformTypeOuterClass.MovingPlatformType result = MovingPlatformTypeOuterClass.MovingPlatformType.valueOf(this.movingPlatformType_);
            return (result == null) ? MovingPlatformTypeOuterClass.MovingPlatformType.UNRECOGNIZED : result;
        }
        
        @Override
        public boolean getIsActive() {
            return this.isActive_;
        }
        
        @Override
        public boolean hasRoute() {
            return this.route_ != null;
        }
        
        @Override
        public RouteOuterClass.Route getRoute() {
            return (this.route_ == null) ? RouteOuterClass.Route.getDefaultInstance() : this.route_;
        }
        
        @Override
        public RouteOuterClass.RouteOrBuilder getRouteOrBuilder() {
            return this.getRoute();
        }
        
        @Override
        public int getPointId() {
            return this.pointId_;
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
            if (this.routeId_ != 0) {
                output.writeUInt32(1, this.routeId_);
            }
            if (this.startIndex_ != 0) {
                output.writeInt32(2, this.startIndex_);
            }
            if (this.startRouteTime_ != 0) {
                output.writeUInt32(3, this.startRouteTime_);
            }
            if (this.startSceneTime_ != 0) {
                output.writeUInt32(4, this.startSceneTime_);
            }
            if (this.startPos_ != null) {
                output.writeMessage(7, this.getStartPos());
            }
            if (this.isStarted_) {
                output.writeBool(8, this.isStarted_);
            }
            if (this.startRot_ != null) {
                output.writeMessage(9, this.getStartRot());
            }
            if (this.stopSceneTime_ != 0) {
                output.writeUInt32(10, this.stopSceneTime_);
            }
            if (this.posOffset_ != null) {
                output.writeMessage(11, this.getPosOffset());
            }
            if (this.rotOffset_ != null) {
                output.writeMessage(12, this.getRotOffset());
            }
            if (this.movingPlatformType_ != MovingPlatformTypeOuterClass.MovingPlatformType.MOVING_PLATFORM_TYPE_NONE.getNumber()) {
                output.writeEnum(13, this.movingPlatformType_);
            }
            if (this.isActive_) {
                output.writeBool(14, this.isActive_);
            }
            if (this.route_ != null) {
                output.writeMessage(15, this.getRoute());
            }
            if (this.pointId_ != 0) {
                output.writeUInt32(16, this.pointId_);
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
            if (this.routeId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.routeId_);
            }
            if (this.startIndex_ != 0) {
                size += CodedOutputStream.computeInt32Size(2, this.startIndex_);
            }
            if (this.startRouteTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.startRouteTime_);
            }
            if (this.startSceneTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.startSceneTime_);
            }
            if (this.startPos_ != null) {
                size += CodedOutputStream.computeMessageSize(7, this.getStartPos());
            }
            if (this.isStarted_) {
                size += CodedOutputStream.computeBoolSize(8, this.isStarted_);
            }
            if (this.startRot_ != null) {
                size += CodedOutputStream.computeMessageSize(9, this.getStartRot());
            }
            if (this.stopSceneTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.stopSceneTime_);
            }
            if (this.posOffset_ != null) {
                size += CodedOutputStream.computeMessageSize(11, this.getPosOffset());
            }
            if (this.rotOffset_ != null) {
                size += CodedOutputStream.computeMessageSize(12, this.getRotOffset());
            }
            if (this.movingPlatformType_ != MovingPlatformTypeOuterClass.MovingPlatformType.MOVING_PLATFORM_TYPE_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(13, this.movingPlatformType_);
            }
            if (this.isActive_) {
                size += CodedOutputStream.computeBoolSize(14, this.isActive_);
            }
            if (this.route_ != null) {
                size += CodedOutputStream.computeMessageSize(15, this.getRoute());
            }
            if (this.pointId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(16, this.pointId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlatformInfo)) {
                return super.equals(obj);
            }
            final PlatformInfo other = (PlatformInfo)obj;
            return this.getRouteId() == other.getRouteId() && this.getStartIndex() == other.getStartIndex() && this.getStartRouteTime() == other.getStartRouteTime() && this.getStartSceneTime() == other.getStartSceneTime() && this.hasStartPos() == other.hasStartPos() && (!this.hasStartPos() || this.getStartPos().equals(other.getStartPos())) && this.getIsStarted() == other.getIsStarted() && this.hasStartRot() == other.hasStartRot() && (!this.hasStartRot() || this.getStartRot().equals(other.getStartRot())) && this.getStopSceneTime() == other.getStopSceneTime() && this.hasPosOffset() == other.hasPosOffset() && (!this.hasPosOffset() || this.getPosOffset().equals(other.getPosOffset())) && this.hasRotOffset() == other.hasRotOffset() && (!this.hasRotOffset() || this.getRotOffset().equals(other.getRotOffset())) && this.movingPlatformType_ == other.movingPlatformType_ && this.getIsActive() == other.getIsActive() && this.hasRoute() == other.hasRoute() && (!this.hasRoute() || this.getRoute().equals(other.getRoute())) && this.getPointId() == other.getPointId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getRouteId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getStartIndex();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getStartRouteTime();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getStartSceneTime();
            if (this.hasStartPos()) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.getStartPos().hashCode();
            }
            hash = 37 * hash + 8;
            hash = 53 * hash + Internal.hashBoolean(this.getIsStarted());
            if (this.hasStartRot()) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getStartRot().hashCode();
            }
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getStopSceneTime();
            if (this.hasPosOffset()) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.getPosOffset().hashCode();
            }
            if (this.hasRotOffset()) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getRotOffset().hashCode();
            }
            hash = 37 * hash + 13;
            hash = 53 * hash + this.movingPlatformType_;
            hash = 37 * hash + 14;
            hash = 53 * hash + Internal.hashBoolean(this.getIsActive());
            if (this.hasRoute()) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getRoute().hashCode();
            }
            hash = 37 * hash + 16;
            hash = 53 * hash + this.getPointId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PlatformInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PlatformInfo.PARSER.parseFrom(data);
        }
        
        public static PlatformInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlatformInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlatformInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PlatformInfo.PARSER.parseFrom(data);
        }
        
        public static PlatformInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlatformInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlatformInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PlatformInfo.PARSER.parseFrom(data);
        }
        
        public static PlatformInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlatformInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlatformInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlatformInfo.PARSER, input);
        }
        
        public static PlatformInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlatformInfo.PARSER, input, extensionRegistry);
        }
        
        public static PlatformInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlatformInfo.PARSER, input);
        }
        
        public static PlatformInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlatformInfo.PARSER, input, extensionRegistry);
        }
        
        public static PlatformInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlatformInfo.PARSER, input);
        }
        
        public static PlatformInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlatformInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PlatformInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PlatformInfo prototype) {
            return PlatformInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PlatformInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PlatformInfo getDefaultInstance() {
            return PlatformInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<PlatformInfo> parser() {
            return PlatformInfo.PARSER;
        }
        
        @Override
        public Parser<PlatformInfo> getParserForType() {
            return PlatformInfo.PARSER;
        }
        
        @Override
        public PlatformInfo getDefaultInstanceForType() {
            return PlatformInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PlatformInfo();
            PARSER = new AbstractParser<PlatformInfo>() {
                @Override
                public PlatformInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PlatformInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlatformInfoOrBuilder
        {
            private int routeId_;
            private int startIndex_;
            private int startRouteTime_;
            private int startSceneTime_;
            private VectorOuterClass.Vector startPos_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> startPosBuilder_;
            private boolean isStarted_;
            private MathQuaternionOuterClass.MathQuaternion startRot_;
            private SingleFieldBuilderV3<MathQuaternionOuterClass.MathQuaternion, MathQuaternionOuterClass.MathQuaternion.Builder, MathQuaternionOuterClass.MathQuaternionOrBuilder> startRotBuilder_;
            private int stopSceneTime_;
            private VectorOuterClass.Vector posOffset_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> posOffsetBuilder_;
            private MathQuaternionOuterClass.MathQuaternion rotOffset_;
            private SingleFieldBuilderV3<MathQuaternionOuterClass.MathQuaternion, MathQuaternionOuterClass.MathQuaternion.Builder, MathQuaternionOuterClass.MathQuaternionOrBuilder> rotOffsetBuilder_;
            private int movingPlatformType_;
            private boolean isActive_;
            private RouteOuterClass.Route route_;
            private SingleFieldBuilderV3<RouteOuterClass.Route, RouteOuterClass.Route.Builder, RouteOuterClass.RouteOrBuilder> routeBuilder_;
            private int pointId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PlatformInfoOuterClass.internal_static_PlatformInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PlatformInfoOuterClass.internal_static_PlatformInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PlatformInfo.class, Builder.class);
            }
            
            private Builder() {
                this.movingPlatformType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.movingPlatformType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PlatformInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.routeId_ = 0;
                this.startIndex_ = 0;
                this.startRouteTime_ = 0;
                this.startSceneTime_ = 0;
                if (this.startPosBuilder_ == null) {
                    this.startPos_ = null;
                }
                else {
                    this.startPos_ = null;
                    this.startPosBuilder_ = null;
                }
                this.isStarted_ = false;
                if (this.startRotBuilder_ == null) {
                    this.startRot_ = null;
                }
                else {
                    this.startRot_ = null;
                    this.startRotBuilder_ = null;
                }
                this.stopSceneTime_ = 0;
                if (this.posOffsetBuilder_ == null) {
                    this.posOffset_ = null;
                }
                else {
                    this.posOffset_ = null;
                    this.posOffsetBuilder_ = null;
                }
                if (this.rotOffsetBuilder_ == null) {
                    this.rotOffset_ = null;
                }
                else {
                    this.rotOffset_ = null;
                    this.rotOffsetBuilder_ = null;
                }
                this.movingPlatformType_ = 0;
                this.isActive_ = false;
                if (this.routeBuilder_ == null) {
                    this.route_ = null;
                }
                else {
                    this.route_ = null;
                    this.routeBuilder_ = null;
                }
                this.pointId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PlatformInfoOuterClass.internal_static_PlatformInfo_descriptor;
            }
            
            @Override
            public PlatformInfo getDefaultInstanceForType() {
                return PlatformInfo.getDefaultInstance();
            }
            
            @Override
            public PlatformInfo build() {
                final PlatformInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PlatformInfo buildPartial() {
                final PlatformInfo result = new PlatformInfo(this);
                result.routeId_ = this.routeId_;
                result.startIndex_ = this.startIndex_;
                result.startRouteTime_ = this.startRouteTime_;
                result.startSceneTime_ = this.startSceneTime_;
                if (this.startPosBuilder_ == null) {
                    result.startPos_ = this.startPos_;
                }
                else {
                    result.startPos_ = this.startPosBuilder_.build();
                }
                result.isStarted_ = this.isStarted_;
                if (this.startRotBuilder_ == null) {
                    result.startRot_ = this.startRot_;
                }
                else {
                    result.startRot_ = this.startRotBuilder_.build();
                }
                result.stopSceneTime_ = this.stopSceneTime_;
                if (this.posOffsetBuilder_ == null) {
                    result.posOffset_ = this.posOffset_;
                }
                else {
                    result.posOffset_ = this.posOffsetBuilder_.build();
                }
                if (this.rotOffsetBuilder_ == null) {
                    result.rotOffset_ = this.rotOffset_;
                }
                else {
                    result.rotOffset_ = this.rotOffsetBuilder_.build();
                }
                result.movingPlatformType_ = this.movingPlatformType_;
                result.isActive_ = this.isActive_;
                if (this.routeBuilder_ == null) {
                    result.route_ = this.route_;
                }
                else {
                    result.route_ = this.routeBuilder_.build();
                }
                result.pointId_ = this.pointId_;
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
                if (other instanceof PlatformInfo) {
                    return this.mergeFrom((PlatformInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PlatformInfo other) {
                if (other == PlatformInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getRouteId() != 0) {
                    this.setRouteId(other.getRouteId());
                }
                if (other.getStartIndex() != 0) {
                    this.setStartIndex(other.getStartIndex());
                }
                if (other.getStartRouteTime() != 0) {
                    this.setStartRouteTime(other.getStartRouteTime());
                }
                if (other.getStartSceneTime() != 0) {
                    this.setStartSceneTime(other.getStartSceneTime());
                }
                if (other.hasStartPos()) {
                    this.mergeStartPos(other.getStartPos());
                }
                if (other.getIsStarted()) {
                    this.setIsStarted(other.getIsStarted());
                }
                if (other.hasStartRot()) {
                    this.mergeStartRot(other.getStartRot());
                }
                if (other.getStopSceneTime() != 0) {
                    this.setStopSceneTime(other.getStopSceneTime());
                }
                if (other.hasPosOffset()) {
                    this.mergePosOffset(other.getPosOffset());
                }
                if (other.hasRotOffset()) {
                    this.mergeRotOffset(other.getRotOffset());
                }
                if (other.movingPlatformType_ != 0) {
                    this.setMovingPlatformTypeValue(other.getMovingPlatformTypeValue());
                }
                if (other.getIsActive()) {
                    this.setIsActive(other.getIsActive());
                }
                if (other.hasRoute()) {
                    this.mergeRoute(other.getRoute());
                }
                if (other.getPointId() != 0) {
                    this.setPointId(other.getPointId());
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
                PlatformInfo parsedMessage = null;
                try {
                    parsedMessage = PlatformInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PlatformInfo)e.getUnfinishedMessage();
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
            public int getRouteId() {
                return this.routeId_;
            }
            
            public Builder setRouteId(final int value) {
                this.routeId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRouteId() {
                this.routeId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getStartIndex() {
                return this.startIndex_;
            }
            
            public Builder setStartIndex(final int value) {
                this.startIndex_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearStartIndex() {
                this.startIndex_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getStartRouteTime() {
                return this.startRouteTime_;
            }
            
            public Builder setStartRouteTime(final int value) {
                this.startRouteTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearStartRouteTime() {
                this.startRouteTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getStartSceneTime() {
                return this.startSceneTime_;
            }
            
            public Builder setStartSceneTime(final int value) {
                this.startSceneTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearStartSceneTime() {
                this.startSceneTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasStartPos() {
                return this.startPosBuilder_ != null || this.startPos_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getStartPos() {
                if (this.startPosBuilder_ == null) {
                    return (this.startPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.startPos_;
                }
                return this.startPosBuilder_.getMessage();
            }
            
            public Builder setStartPos(final VectorOuterClass.Vector value) {
                if (this.startPosBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.startPos_ = value;
                    this.onChanged();
                }
                else {
                    this.startPosBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setStartPos(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.startPosBuilder_ == null) {
                    this.startPos_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.startPosBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeStartPos(final VectorOuterClass.Vector value) {
                if (this.startPosBuilder_ == null) {
                    if (this.startPos_ != null) {
                        this.startPos_ = VectorOuterClass.Vector.newBuilder(this.startPos_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.startPos_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.startPosBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearStartPos() {
                if (this.startPosBuilder_ == null) {
                    this.startPos_ = null;
                    this.onChanged();
                }
                else {
                    this.startPos_ = null;
                    this.startPosBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getStartPosBuilder() {
                this.onChanged();
                return this.getStartPosFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getStartPosOrBuilder() {
                if (this.startPosBuilder_ != null) {
                    return this.startPosBuilder_.getMessageOrBuilder();
                }
                return (this.startPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.startPos_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getStartPosFieldBuilder() {
                if (this.startPosBuilder_ == null) {
                    this.startPosBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getStartPos(), this.getParentForChildren(), this.isClean());
                    this.startPos_ = null;
                }
                return this.startPosBuilder_;
            }
            
            @Override
            public boolean getIsStarted() {
                return this.isStarted_;
            }
            
            public Builder setIsStarted(final boolean value) {
                this.isStarted_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsStarted() {
                this.isStarted_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasStartRot() {
                return this.startRotBuilder_ != null || this.startRot_ != null;
            }
            
            @Override
            public MathQuaternionOuterClass.MathQuaternion getStartRot() {
                if (this.startRotBuilder_ == null) {
                    return (this.startRot_ == null) ? MathQuaternionOuterClass.MathQuaternion.getDefaultInstance() : this.startRot_;
                }
                return this.startRotBuilder_.getMessage();
            }
            
            public Builder setStartRot(final MathQuaternionOuterClass.MathQuaternion value) {
                if (this.startRotBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.startRot_ = value;
                    this.onChanged();
                }
                else {
                    this.startRotBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setStartRot(final MathQuaternionOuterClass.MathQuaternion.Builder builderForValue) {
                if (this.startRotBuilder_ == null) {
                    this.startRot_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.startRotBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeStartRot(final MathQuaternionOuterClass.MathQuaternion value) {
                if (this.startRotBuilder_ == null) {
                    if (this.startRot_ != null) {
                        this.startRot_ = MathQuaternionOuterClass.MathQuaternion.newBuilder(this.startRot_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.startRot_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.startRotBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearStartRot() {
                if (this.startRotBuilder_ == null) {
                    this.startRot_ = null;
                    this.onChanged();
                }
                else {
                    this.startRot_ = null;
                    this.startRotBuilder_ = null;
                }
                return this;
            }
            
            public MathQuaternionOuterClass.MathQuaternion.Builder getStartRotBuilder() {
                this.onChanged();
                return this.getStartRotFieldBuilder().getBuilder();
            }
            
            @Override
            public MathQuaternionOuterClass.MathQuaternionOrBuilder getStartRotOrBuilder() {
                if (this.startRotBuilder_ != null) {
                    return this.startRotBuilder_.getMessageOrBuilder();
                }
                return (this.startRot_ == null) ? MathQuaternionOuterClass.MathQuaternion.getDefaultInstance() : this.startRot_;
            }
            
            private SingleFieldBuilderV3<MathQuaternionOuterClass.MathQuaternion, MathQuaternionOuterClass.MathQuaternion.Builder, MathQuaternionOuterClass.MathQuaternionOrBuilder> getStartRotFieldBuilder() {
                if (this.startRotBuilder_ == null) {
                    this.startRotBuilder_ = new SingleFieldBuilderV3<MathQuaternionOuterClass.MathQuaternion, MathQuaternionOuterClass.MathQuaternion.Builder, MathQuaternionOuterClass.MathQuaternionOrBuilder>(this.getStartRot(), this.getParentForChildren(), this.isClean());
                    this.startRot_ = null;
                }
                return this.startRotBuilder_;
            }
            
            @Override
            public int getStopSceneTime() {
                return this.stopSceneTime_;
            }
            
            public Builder setStopSceneTime(final int value) {
                this.stopSceneTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearStopSceneTime() {
                this.stopSceneTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasPosOffset() {
                return this.posOffsetBuilder_ != null || this.posOffset_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getPosOffset() {
                if (this.posOffsetBuilder_ == null) {
                    return (this.posOffset_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.posOffset_;
                }
                return this.posOffsetBuilder_.getMessage();
            }
            
            public Builder setPosOffset(final VectorOuterClass.Vector value) {
                if (this.posOffsetBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.posOffset_ = value;
                    this.onChanged();
                }
                else {
                    this.posOffsetBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setPosOffset(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.posOffsetBuilder_ == null) {
                    this.posOffset_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.posOffsetBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergePosOffset(final VectorOuterClass.Vector value) {
                if (this.posOffsetBuilder_ == null) {
                    if (this.posOffset_ != null) {
                        this.posOffset_ = VectorOuterClass.Vector.newBuilder(this.posOffset_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.posOffset_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.posOffsetBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearPosOffset() {
                if (this.posOffsetBuilder_ == null) {
                    this.posOffset_ = null;
                    this.onChanged();
                }
                else {
                    this.posOffset_ = null;
                    this.posOffsetBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getPosOffsetBuilder() {
                this.onChanged();
                return this.getPosOffsetFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getPosOffsetOrBuilder() {
                if (this.posOffsetBuilder_ != null) {
                    return this.posOffsetBuilder_.getMessageOrBuilder();
                }
                return (this.posOffset_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.posOffset_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getPosOffsetFieldBuilder() {
                if (this.posOffsetBuilder_ == null) {
                    this.posOffsetBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getPosOffset(), this.getParentForChildren(), this.isClean());
                    this.posOffset_ = null;
                }
                return this.posOffsetBuilder_;
            }
            
            @Override
            public boolean hasRotOffset() {
                return this.rotOffsetBuilder_ != null || this.rotOffset_ != null;
            }
            
            @Override
            public MathQuaternionOuterClass.MathQuaternion getRotOffset() {
                if (this.rotOffsetBuilder_ == null) {
                    return (this.rotOffset_ == null) ? MathQuaternionOuterClass.MathQuaternion.getDefaultInstance() : this.rotOffset_;
                }
                return this.rotOffsetBuilder_.getMessage();
            }
            
            public Builder setRotOffset(final MathQuaternionOuterClass.MathQuaternion value) {
                if (this.rotOffsetBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.rotOffset_ = value;
                    this.onChanged();
                }
                else {
                    this.rotOffsetBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setRotOffset(final MathQuaternionOuterClass.MathQuaternion.Builder builderForValue) {
                if (this.rotOffsetBuilder_ == null) {
                    this.rotOffset_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.rotOffsetBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeRotOffset(final MathQuaternionOuterClass.MathQuaternion value) {
                if (this.rotOffsetBuilder_ == null) {
                    if (this.rotOffset_ != null) {
                        this.rotOffset_ = MathQuaternionOuterClass.MathQuaternion.newBuilder(this.rotOffset_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.rotOffset_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.rotOffsetBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearRotOffset() {
                if (this.rotOffsetBuilder_ == null) {
                    this.rotOffset_ = null;
                    this.onChanged();
                }
                else {
                    this.rotOffset_ = null;
                    this.rotOffsetBuilder_ = null;
                }
                return this;
            }
            
            public MathQuaternionOuterClass.MathQuaternion.Builder getRotOffsetBuilder() {
                this.onChanged();
                return this.getRotOffsetFieldBuilder().getBuilder();
            }
            
            @Override
            public MathQuaternionOuterClass.MathQuaternionOrBuilder getRotOffsetOrBuilder() {
                if (this.rotOffsetBuilder_ != null) {
                    return this.rotOffsetBuilder_.getMessageOrBuilder();
                }
                return (this.rotOffset_ == null) ? MathQuaternionOuterClass.MathQuaternion.getDefaultInstance() : this.rotOffset_;
            }
            
            private SingleFieldBuilderV3<MathQuaternionOuterClass.MathQuaternion, MathQuaternionOuterClass.MathQuaternion.Builder, MathQuaternionOuterClass.MathQuaternionOrBuilder> getRotOffsetFieldBuilder() {
                if (this.rotOffsetBuilder_ == null) {
                    this.rotOffsetBuilder_ = new SingleFieldBuilderV3<MathQuaternionOuterClass.MathQuaternion, MathQuaternionOuterClass.MathQuaternion.Builder, MathQuaternionOuterClass.MathQuaternionOrBuilder>(this.getRotOffset(), this.getParentForChildren(), this.isClean());
                    this.rotOffset_ = null;
                }
                return this.rotOffsetBuilder_;
            }
            
            @Override
            public int getMovingPlatformTypeValue() {
                return this.movingPlatformType_;
            }
            
            public Builder setMovingPlatformTypeValue(final int value) {
                this.movingPlatformType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public MovingPlatformTypeOuterClass.MovingPlatformType getMovingPlatformType() {
                final MovingPlatformTypeOuterClass.MovingPlatformType result = MovingPlatformTypeOuterClass.MovingPlatformType.valueOf(this.movingPlatformType_);
                return (result == null) ? MovingPlatformTypeOuterClass.MovingPlatformType.UNRECOGNIZED : result;
            }
            
            public Builder setMovingPlatformType(final MovingPlatformTypeOuterClass.MovingPlatformType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.movingPlatformType_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearMovingPlatformType() {
                this.movingPlatformType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsActive() {
                return this.isActive_;
            }
            
            public Builder setIsActive(final boolean value) {
                this.isActive_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsActive() {
                this.isActive_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasRoute() {
                return this.routeBuilder_ != null || this.route_ != null;
            }
            
            @Override
            public RouteOuterClass.Route getRoute() {
                if (this.routeBuilder_ == null) {
                    return (this.route_ == null) ? RouteOuterClass.Route.getDefaultInstance() : this.route_;
                }
                return this.routeBuilder_.getMessage();
            }
            
            public Builder setRoute(final RouteOuterClass.Route value) {
                if (this.routeBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.route_ = value;
                    this.onChanged();
                }
                else {
                    this.routeBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setRoute(final RouteOuterClass.Route.Builder builderForValue) {
                if (this.routeBuilder_ == null) {
                    this.route_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.routeBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeRoute(final RouteOuterClass.Route value) {
                if (this.routeBuilder_ == null) {
                    if (this.route_ != null) {
                        this.route_ = RouteOuterClass.Route.newBuilder(this.route_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.route_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.routeBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearRoute() {
                if (this.routeBuilder_ == null) {
                    this.route_ = null;
                    this.onChanged();
                }
                else {
                    this.route_ = null;
                    this.routeBuilder_ = null;
                }
                return this;
            }
            
            public RouteOuterClass.Route.Builder getRouteBuilder() {
                this.onChanged();
                return this.getRouteFieldBuilder().getBuilder();
            }
            
            @Override
            public RouteOuterClass.RouteOrBuilder getRouteOrBuilder() {
                if (this.routeBuilder_ != null) {
                    return this.routeBuilder_.getMessageOrBuilder();
                }
                return (this.route_ == null) ? RouteOuterClass.Route.getDefaultInstance() : this.route_;
            }
            
            private SingleFieldBuilderV3<RouteOuterClass.Route, RouteOuterClass.Route.Builder, RouteOuterClass.RouteOrBuilder> getRouteFieldBuilder() {
                if (this.routeBuilder_ == null) {
                    this.routeBuilder_ = new SingleFieldBuilderV3<RouteOuterClass.Route, RouteOuterClass.Route.Builder, RouteOuterClass.RouteOrBuilder>(this.getRoute(), this.getParentForChildren(), this.isClean());
                    this.route_ = null;
                }
                return this.routeBuilder_;
            }
            
            @Override
            public int getPointId() {
                return this.pointId_;
            }
            
            public Builder setPointId(final int value) {
                this.pointId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPointId() {
                this.pointId_ = 0;
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
    
    public interface PlatformInfoOrBuilder extends MessageOrBuilder
    {
        int getRouteId();
        
        int getStartIndex();
        
        int getStartRouteTime();
        
        int getStartSceneTime();
        
        boolean hasStartPos();
        
        VectorOuterClass.Vector getStartPos();
        
        VectorOuterClass.VectorOrBuilder getStartPosOrBuilder();
        
        boolean getIsStarted();
        
        boolean hasStartRot();
        
        MathQuaternionOuterClass.MathQuaternion getStartRot();
        
        MathQuaternionOuterClass.MathQuaternionOrBuilder getStartRotOrBuilder();
        
        int getStopSceneTime();
        
        boolean hasPosOffset();
        
        VectorOuterClass.Vector getPosOffset();
        
        VectorOuterClass.VectorOrBuilder getPosOffsetOrBuilder();
        
        boolean hasRotOffset();
        
        MathQuaternionOuterClass.MathQuaternion getRotOffset();
        
        MathQuaternionOuterClass.MathQuaternionOrBuilder getRotOffsetOrBuilder();
        
        int getMovingPlatformTypeValue();
        
        MovingPlatformTypeOuterClass.MovingPlatformType getMovingPlatformType();
        
        boolean getIsActive();
        
        boolean hasRoute();
        
        RouteOuterClass.Route getRoute();
        
        RouteOuterClass.RouteOrBuilder getRouteOrBuilder();
        
        int getPointId();
    }
}
