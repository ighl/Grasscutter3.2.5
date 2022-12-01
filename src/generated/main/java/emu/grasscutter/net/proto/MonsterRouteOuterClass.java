// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
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

public final class MonsterRouteOuterClass
{
    private static final Descriptors.Descriptor internal_static_MonsterRoute_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MonsterRoute_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MonsterRouteOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MonsterRouteOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0012MonsterRoute.proto\u001a\u0010RoutePoint.proto\"p\n\fMonsterRoute\u0012!\n\froute_points\u0018\u0001 \u0003(\u000b2\u000b.RoutePoint\u0012\u0013\n\u000bspeed_level\u0018\u0002 \u0001(\r\u0012\u0012\n\nroute_type\u0018\u0003 \u0001(\r\u0012\u0014\n\farrive_range\u0018\u0004 \u0001(\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MonsterRouteOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { RoutePointOuterClass.getDescriptor() });
        internal_static_MonsterRoute_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MonsterRoute_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MonsterRouteOuterClass.internal_static_MonsterRoute_descriptor, new String[] { "RoutePoints", "SpeedLevel", "RouteType", "ArriveRange" });
        RoutePointOuterClass.getDescriptor();
    }
    
    public static final class MonsterRoute extends GeneratedMessageV3 implements MonsterRouteOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ROUTE_POINTS_FIELD_NUMBER = 1;
        private List<RoutePointOuterClass.RoutePoint> routePoints_;
        public static final int SPEED_LEVEL_FIELD_NUMBER = 2;
        private int speedLevel_;
        public static final int ROUTE_TYPE_FIELD_NUMBER = 3;
        private int routeType_;
        public static final int ARRIVE_RANGE_FIELD_NUMBER = 4;
        private float arriveRange_;
        private byte memoizedIsInitialized;
        private static final MonsterRoute DEFAULT_INSTANCE;
        private static final Parser<MonsterRoute> PARSER;
        
        private MonsterRoute(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private MonsterRoute() {
            this.memoizedIsInitialized = -1;
            this.routePoints_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MonsterRoute();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MonsterRoute(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.routePoints_ = new ArrayList<RoutePointOuterClass.RoutePoint>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.routePoints_.add(input.readMessage(RoutePointOuterClass.RoutePoint.parser(), extensionRegistry));
                            continue;
                        }
                        case 16: {
                            this.speedLevel_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.routeType_ = input.readUInt32();
                            continue;
                        }
                        case 37: {
                            this.arriveRange_ = input.readFloat();
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
                    this.routePoints_ = Collections.unmodifiableList((List<? extends RoutePointOuterClass.RoutePoint>)this.routePoints_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return MonsterRouteOuterClass.internal_static_MonsterRoute_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MonsterRouteOuterClass.internal_static_MonsterRoute_fieldAccessorTable.ensureFieldAccessorsInitialized(MonsterRoute.class, Builder.class);
        }
        
        @Override
        public List<RoutePointOuterClass.RoutePoint> getRoutePointsList() {
            return this.routePoints_;
        }
        
        @Override
        public List<? extends RoutePointOuterClass.RoutePointOrBuilder> getRoutePointsOrBuilderList() {
            return this.routePoints_;
        }
        
        @Override
        public int getRoutePointsCount() {
            return this.routePoints_.size();
        }
        
        @Override
        public RoutePointOuterClass.RoutePoint getRoutePoints(final int index) {
            return this.routePoints_.get(index);
        }
        
        @Override
        public RoutePointOuterClass.RoutePointOrBuilder getRoutePointsOrBuilder(final int index) {
            return this.routePoints_.get(index);
        }
        
        @Override
        public int getSpeedLevel() {
            return this.speedLevel_;
        }
        
        @Override
        public int getRouteType() {
            return this.routeType_;
        }
        
        @Override
        public float getArriveRange() {
            return this.arriveRange_;
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
            for (int i = 0; i < this.routePoints_.size(); ++i) {
                output.writeMessage(1, this.routePoints_.get(i));
            }
            if (this.speedLevel_ != 0) {
                output.writeUInt32(2, this.speedLevel_);
            }
            if (this.routeType_ != 0) {
                output.writeUInt32(3, this.routeType_);
            }
            if (this.arriveRange_ != 0.0f) {
                output.writeFloat(4, this.arriveRange_);
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
            for (int i = 0; i < this.routePoints_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(1, this.routePoints_.get(i));
            }
            if (this.speedLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.speedLevel_);
            }
            if (this.routeType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.routeType_);
            }
            if (this.arriveRange_ != 0.0f) {
                size += CodedOutputStream.computeFloatSize(4, this.arriveRange_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MonsterRoute)) {
                return super.equals(obj);
            }
            final MonsterRoute other = (MonsterRoute)obj;
            return this.getRoutePointsList().equals(other.getRoutePointsList()) && this.getSpeedLevel() == other.getSpeedLevel() && this.getRouteType() == other.getRouteType() && Float.floatToIntBits(this.getArriveRange()) == Float.floatToIntBits(other.getArriveRange()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getRoutePointsCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getRoutePointsList().hashCode();
            }
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getSpeedLevel();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getRouteType();
            hash = 37 * hash + 4;
            hash = 53 * hash + Float.floatToIntBits(this.getArriveRange());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MonsterRoute parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MonsterRoute.PARSER.parseFrom(data);
        }
        
        public static MonsterRoute parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MonsterRoute.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MonsterRoute parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MonsterRoute.PARSER.parseFrom(data);
        }
        
        public static MonsterRoute parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MonsterRoute.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MonsterRoute parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MonsterRoute.PARSER.parseFrom(data);
        }
        
        public static MonsterRoute parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MonsterRoute.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MonsterRoute parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MonsterRoute.PARSER, input);
        }
        
        public static MonsterRoute parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MonsterRoute.PARSER, input, extensionRegistry);
        }
        
        public static MonsterRoute parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MonsterRoute.PARSER, input);
        }
        
        public static MonsterRoute parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MonsterRoute.PARSER, input, extensionRegistry);
        }
        
        public static MonsterRoute parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MonsterRoute.PARSER, input);
        }
        
        public static MonsterRoute parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MonsterRoute.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MonsterRoute.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MonsterRoute prototype) {
            return MonsterRoute.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MonsterRoute.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MonsterRoute getDefaultInstance() {
            return MonsterRoute.DEFAULT_INSTANCE;
        }
        
        public static Parser<MonsterRoute> parser() {
            return MonsterRoute.PARSER;
        }
        
        @Override
        public Parser<MonsterRoute> getParserForType() {
            return MonsterRoute.PARSER;
        }
        
        @Override
        public MonsterRoute getDefaultInstanceForType() {
            return MonsterRoute.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MonsterRoute();
            PARSER = new AbstractParser<MonsterRoute>() {
                @Override
                public MonsterRoute parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MonsterRoute(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MonsterRouteOrBuilder
        {
            private int bitField0_;
            private List<RoutePointOuterClass.RoutePoint> routePoints_;
            private RepeatedFieldBuilderV3<RoutePointOuterClass.RoutePoint, RoutePointOuterClass.RoutePoint.Builder, RoutePointOuterClass.RoutePointOrBuilder> routePointsBuilder_;
            private int speedLevel_;
            private int routeType_;
            private float arriveRange_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MonsterRouteOuterClass.internal_static_MonsterRoute_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MonsterRouteOuterClass.internal_static_MonsterRoute_fieldAccessorTable.ensureFieldAccessorsInitialized(MonsterRoute.class, Builder.class);
            }
            
            private Builder() {
                this.routePoints_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.routePoints_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MonsterRoute.alwaysUseFieldBuilders) {
                    this.getRoutePointsFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.routePointsBuilder_ == null) {
                    this.routePoints_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.routePointsBuilder_.clear();
                }
                this.speedLevel_ = 0;
                this.routeType_ = 0;
                this.arriveRange_ = 0.0f;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MonsterRouteOuterClass.internal_static_MonsterRoute_descriptor;
            }
            
            @Override
            public MonsterRoute getDefaultInstanceForType() {
                return MonsterRoute.getDefaultInstance();
            }
            
            @Override
            public MonsterRoute build() {
                final MonsterRoute result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MonsterRoute buildPartial() {
                final MonsterRoute result = new MonsterRoute(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.routePointsBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.routePoints_ = Collections.unmodifiableList((List<? extends RoutePointOuterClass.RoutePoint>)this.routePoints_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.routePoints_ = this.routePoints_;
                }
                else {
                    result.routePoints_ = this.routePointsBuilder_.build();
                }
                result.speedLevel_ = this.speedLevel_;
                result.routeType_ = this.routeType_;
                result.arriveRange_ = this.arriveRange_;
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
                if (other instanceof MonsterRoute) {
                    return this.mergeFrom((MonsterRoute)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MonsterRoute other) {
                if (other == MonsterRoute.getDefaultInstance()) {
                    return this;
                }
                if (this.routePointsBuilder_ == null) {
                    if (!other.routePoints_.isEmpty()) {
                        if (this.routePoints_.isEmpty()) {
                            this.routePoints_ = other.routePoints_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureRoutePointsIsMutable();
                            this.routePoints_.addAll(other.routePoints_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.routePoints_.isEmpty()) {
                    if (this.routePointsBuilder_.isEmpty()) {
                        this.routePointsBuilder_.dispose();
                        this.routePointsBuilder_ = null;
                        this.routePoints_ = other.routePoints_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.routePointsBuilder_ = (MonsterRoute.alwaysUseFieldBuilders ? this.getRoutePointsFieldBuilder() : null);
                    }
                    else {
                        this.routePointsBuilder_.addAllMessages(other.routePoints_);
                    }
                }
                if (other.getSpeedLevel() != 0) {
                    this.setSpeedLevel(other.getSpeedLevel());
                }
                if (other.getRouteType() != 0) {
                    this.setRouteType(other.getRouteType());
                }
                if (other.getArriveRange() != 0.0f) {
                    this.setArriveRange(other.getArriveRange());
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
                MonsterRoute parsedMessage = null;
                try {
                    parsedMessage = MonsterRoute.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MonsterRoute)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureRoutePointsIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.routePoints_ = new ArrayList<RoutePointOuterClass.RoutePoint>(this.routePoints_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<RoutePointOuterClass.RoutePoint> getRoutePointsList() {
                if (this.routePointsBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends RoutePointOuterClass.RoutePoint>)this.routePoints_);
                }
                return this.routePointsBuilder_.getMessageList();
            }
            
            @Override
            public int getRoutePointsCount() {
                if (this.routePointsBuilder_ == null) {
                    return this.routePoints_.size();
                }
                return this.routePointsBuilder_.getCount();
            }
            
            @Override
            public RoutePointOuterClass.RoutePoint getRoutePoints(final int index) {
                if (this.routePointsBuilder_ == null) {
                    return this.routePoints_.get(index);
                }
                return this.routePointsBuilder_.getMessage(index);
            }
            
            public Builder setRoutePoints(final int index, final RoutePointOuterClass.RoutePoint value) {
                if (this.routePointsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureRoutePointsIsMutable();
                    this.routePoints_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.routePointsBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setRoutePoints(final int index, final RoutePointOuterClass.RoutePoint.Builder builderForValue) {
                if (this.routePointsBuilder_ == null) {
                    this.ensureRoutePointsIsMutable();
                    this.routePoints_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.routePointsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addRoutePoints(final RoutePointOuterClass.RoutePoint value) {
                if (this.routePointsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureRoutePointsIsMutable();
                    this.routePoints_.add(value);
                    this.onChanged();
                }
                else {
                    this.routePointsBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addRoutePoints(final int index, final RoutePointOuterClass.RoutePoint value) {
                if (this.routePointsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureRoutePointsIsMutable();
                    this.routePoints_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.routePointsBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addRoutePoints(final RoutePointOuterClass.RoutePoint.Builder builderForValue) {
                if (this.routePointsBuilder_ == null) {
                    this.ensureRoutePointsIsMutable();
                    this.routePoints_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.routePointsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addRoutePoints(final int index, final RoutePointOuterClass.RoutePoint.Builder builderForValue) {
                if (this.routePointsBuilder_ == null) {
                    this.ensureRoutePointsIsMutable();
                    this.routePoints_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.routePointsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllRoutePoints(final Iterable<? extends RoutePointOuterClass.RoutePoint> values) {
                if (this.routePointsBuilder_ == null) {
                    this.ensureRoutePointsIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.routePoints_);
                    this.onChanged();
                }
                else {
                    this.routePointsBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearRoutePoints() {
                if (this.routePointsBuilder_ == null) {
                    this.routePoints_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.routePointsBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeRoutePoints(final int index) {
                if (this.routePointsBuilder_ == null) {
                    this.ensureRoutePointsIsMutable();
                    this.routePoints_.remove(index);
                    this.onChanged();
                }
                else {
                    this.routePointsBuilder_.remove(index);
                }
                return this;
            }
            
            public RoutePointOuterClass.RoutePoint.Builder getRoutePointsBuilder(final int index) {
                return this.getRoutePointsFieldBuilder().getBuilder(index);
            }
            
            @Override
            public RoutePointOuterClass.RoutePointOrBuilder getRoutePointsOrBuilder(final int index) {
                if (this.routePointsBuilder_ == null) {
                    return this.routePoints_.get(index);
                }
                return this.routePointsBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends RoutePointOuterClass.RoutePointOrBuilder> getRoutePointsOrBuilderList() {
                if (this.routePointsBuilder_ != null) {
                    return this.routePointsBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends RoutePointOuterClass.RoutePointOrBuilder>)this.routePoints_);
            }
            
            public RoutePointOuterClass.RoutePoint.Builder addRoutePointsBuilder() {
                return this.getRoutePointsFieldBuilder().addBuilder(RoutePointOuterClass.RoutePoint.getDefaultInstance());
            }
            
            public RoutePointOuterClass.RoutePoint.Builder addRoutePointsBuilder(final int index) {
                return this.getRoutePointsFieldBuilder().addBuilder(index, RoutePointOuterClass.RoutePoint.getDefaultInstance());
            }
            
            public List<RoutePointOuterClass.RoutePoint.Builder> getRoutePointsBuilderList() {
                return this.getRoutePointsFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<RoutePointOuterClass.RoutePoint, RoutePointOuterClass.RoutePoint.Builder, RoutePointOuterClass.RoutePointOrBuilder> getRoutePointsFieldBuilder() {
                if (this.routePointsBuilder_ == null) {
                    this.routePointsBuilder_ = new RepeatedFieldBuilderV3<RoutePointOuterClass.RoutePoint, RoutePointOuterClass.RoutePoint.Builder, RoutePointOuterClass.RoutePointOrBuilder>(this.routePoints_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.routePoints_ = null;
                }
                return this.routePointsBuilder_;
            }
            
            @Override
            public int getSpeedLevel() {
                return this.speedLevel_;
            }
            
            public Builder setSpeedLevel(final int value) {
                this.speedLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSpeedLevel() {
                this.speedLevel_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getRouteType() {
                return this.routeType_;
            }
            
            public Builder setRouteType(final int value) {
                this.routeType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRouteType() {
                this.routeType_ = 0;
                this.onChanged();
                return this;
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface MonsterRouteOrBuilder extends MessageOrBuilder
    {
        List<RoutePointOuterClass.RoutePoint> getRoutePointsList();
        
        RoutePointOuterClass.RoutePoint getRoutePoints(final int p0);
        
        int getRoutePointsCount();
        
        List<? extends RoutePointOuterClass.RoutePointOrBuilder> getRoutePointsOrBuilderList();
        
        RoutePointOuterClass.RoutePointOrBuilder getRoutePointsOrBuilder(final int p0);
        
        int getSpeedLevel();
        
        int getRouteType();
        
        float getArriveRange();
    }
}
