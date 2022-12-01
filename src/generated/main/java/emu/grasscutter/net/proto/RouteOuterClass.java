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

public final class RouteOuterClass
{
    private static final Descriptors.Descriptor internal_static_Route_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Route_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private RouteOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return RouteOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u000bRoute.proto\u001a\u0010RoutePoint.proto\">\n\u0005Route\u0012!\n\froute_points\u0018\u0001 \u0003(\u000b2\u000b.RoutePoint\u0012\u0012\n\nroute_type\u0018\u0002 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        RouteOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { RoutePointOuterClass.getDescriptor() });
        internal_static_Route_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_Route_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(RouteOuterClass.internal_static_Route_descriptor, new String[] { "RoutePoints", "RouteType" });
        RoutePointOuterClass.getDescriptor();
    }
    
    public static final class Route extends GeneratedMessageV3 implements RouteOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ROUTE_POINTS_FIELD_NUMBER = 1;
        private List<RoutePointOuterClass.RoutePoint> routePoints_;
        public static final int ROUTE_TYPE_FIELD_NUMBER = 2;
        private int routeType_;
        private byte memoizedIsInitialized;
        private static final Route DEFAULT_INSTANCE;
        private static final Parser<Route> PARSER;
        
        private Route(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private Route() {
            this.memoizedIsInitialized = -1;
            this.routePoints_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new Route();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private Route(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.routeType_ = input.readUInt32();
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
            return RouteOuterClass.internal_static_Route_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return RouteOuterClass.internal_static_Route_fieldAccessorTable.ensureFieldAccessorsInitialized(Route.class, Builder.class);
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
        public int getRouteType() {
            return this.routeType_;
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
            if (this.routeType_ != 0) {
                output.writeUInt32(2, this.routeType_);
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
            if (this.routeType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.routeType_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Route)) {
                return super.equals(obj);
            }
            final Route other = (Route)obj;
            return this.getRoutePointsList().equals(other.getRoutePointsList()) && this.getRouteType() == other.getRouteType() && this.unknownFields.equals(other.unknownFields);
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
            hash = 53 * hash + this.getRouteType();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static Route parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return Route.PARSER.parseFrom(data);
        }
        
        public static Route parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Route.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Route parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return Route.PARSER.parseFrom(data);
        }
        
        public static Route parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Route.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Route parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return Route.PARSER.parseFrom(data);
        }
        
        public static Route parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Route.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Route parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Route.PARSER, input);
        }
        
        public static Route parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Route.PARSER, input, extensionRegistry);
        }
        
        public static Route parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Route.PARSER, input);
        }
        
        public static Route parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Route.PARSER, input, extensionRegistry);
        }
        
        public static Route parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Route.PARSER, input);
        }
        
        public static Route parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Route.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return Route.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final Route prototype) {
            return Route.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == Route.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static Route getDefaultInstance() {
            return Route.DEFAULT_INSTANCE;
        }
        
        public static Parser<Route> parser() {
            return Route.PARSER;
        }
        
        @Override
        public Parser<Route> getParserForType() {
            return Route.PARSER;
        }
        
        @Override
        public Route getDefaultInstanceForType() {
            return Route.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new Route();
            PARSER = new AbstractParser<Route>() {
                @Override
                public Route parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new Route(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RouteOrBuilder
        {
            private int bitField0_;
            private List<RoutePointOuterClass.RoutePoint> routePoints_;
            private RepeatedFieldBuilderV3<RoutePointOuterClass.RoutePoint, RoutePointOuterClass.RoutePoint.Builder, RoutePointOuterClass.RoutePointOrBuilder> routePointsBuilder_;
            private int routeType_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return RouteOuterClass.internal_static_Route_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return RouteOuterClass.internal_static_Route_fieldAccessorTable.ensureFieldAccessorsInitialized(Route.class, Builder.class);
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
                if (Route.alwaysUseFieldBuilders) {
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
                this.routeType_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return RouteOuterClass.internal_static_Route_descriptor;
            }
            
            @Override
            public Route getDefaultInstanceForType() {
                return Route.getDefaultInstance();
            }
            
            @Override
            public Route build() {
                final Route result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public Route buildPartial() {
                final Route result = new Route(this);
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
                result.routeType_ = this.routeType_;
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
                if (other instanceof Route) {
                    return this.mergeFrom((Route)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final Route other) {
                if (other == Route.getDefaultInstance()) {
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
                        this.routePointsBuilder_ = (Route.alwaysUseFieldBuilders ? this.getRoutePointsFieldBuilder() : null);
                    }
                    else {
                        this.routePointsBuilder_.addAllMessages(other.routePoints_);
                    }
                }
                if (other.getRouteType() != 0) {
                    this.setRouteType(other.getRouteType());
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
                Route parsedMessage = null;
                try {
                    parsedMessage = Route.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (Route)e.getUnfinishedMessage();
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface RouteOrBuilder extends MessageOrBuilder
    {
        List<RoutePointOuterClass.RoutePoint> getRoutePointsList();
        
        RoutePointOuterClass.RoutePoint getRoutePoints(final int p0);
        
        int getRoutePointsCount();
        
        List<? extends RoutePointOuterClass.RoutePointOrBuilder> getRoutePointsOrBuilderList();
        
        RoutePointOuterClass.RoutePointOrBuilder getRoutePointsOrBuilder(final int p0);
        
        int getRouteType();
    }
}
