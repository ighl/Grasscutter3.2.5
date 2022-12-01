// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
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

public final class RoutePointChangeInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_RoutePointChangeInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_RoutePointChangeInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private RoutePointChangeInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return RoutePointChangeInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001aRoutePointChangeInfo.proto\"W\n\u0014RoutePointChangeInfo\u0012\u0011\n\twait_time\u0018\u0006 \u0001(\u0002\u0012\u0017\n\u000ftarget_velocity\u0018\u000e \u0001(\u0002\u0012\u0013\n\u000bpoint_index\u0018\u000b \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        RoutePointChangeInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_RoutePointChangeInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_RoutePointChangeInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(RoutePointChangeInfoOuterClass.internal_static_RoutePointChangeInfo_descriptor, new String[] { "WaitTime", "TargetVelocity", "PointIndex" });
    }
    
    public static final class RoutePointChangeInfo extends GeneratedMessageV3 implements RoutePointChangeInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int WAIT_TIME_FIELD_NUMBER = 6;
        private float waitTime_;
        public static final int TARGET_VELOCITY_FIELD_NUMBER = 14;
        private float targetVelocity_;
        public static final int POINT_INDEX_FIELD_NUMBER = 11;
        private int pointIndex_;
        private byte memoizedIsInitialized;
        private static final RoutePointChangeInfo DEFAULT_INSTANCE;
        private static final Parser<RoutePointChangeInfo> PARSER;
        
        private RoutePointChangeInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private RoutePointChangeInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new RoutePointChangeInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private RoutePointChangeInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 53: {
                            this.waitTime_ = input.readFloat();
                            continue;
                        }
                        case 88: {
                            this.pointIndex_ = input.readUInt32();
                            continue;
                        }
                        case 117: {
                            this.targetVelocity_ = input.readFloat();
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
            return RoutePointChangeInfoOuterClass.internal_static_RoutePointChangeInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return RoutePointChangeInfoOuterClass.internal_static_RoutePointChangeInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RoutePointChangeInfo.class, Builder.class);
        }
        
        @Override
        public float getWaitTime() {
            return this.waitTime_;
        }
        
        @Override
        public float getTargetVelocity() {
            return this.targetVelocity_;
        }
        
        @Override
        public int getPointIndex() {
            return this.pointIndex_;
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
            if (this.waitTime_ != 0.0f) {
                output.writeFloat(6, this.waitTime_);
            }
            if (this.pointIndex_ != 0) {
                output.writeUInt32(11, this.pointIndex_);
            }
            if (this.targetVelocity_ != 0.0f) {
                output.writeFloat(14, this.targetVelocity_);
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
            if (this.waitTime_ != 0.0f) {
                size += CodedOutputStream.computeFloatSize(6, this.waitTime_);
            }
            if (this.pointIndex_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.pointIndex_);
            }
            if (this.targetVelocity_ != 0.0f) {
                size += CodedOutputStream.computeFloatSize(14, this.targetVelocity_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RoutePointChangeInfo)) {
                return super.equals(obj);
            }
            final RoutePointChangeInfo other = (RoutePointChangeInfo)obj;
            return Float.floatToIntBits(this.getWaitTime()) == Float.floatToIntBits(other.getWaitTime()) && Float.floatToIntBits(this.getTargetVelocity()) == Float.floatToIntBits(other.getTargetVelocity()) && this.getPointIndex() == other.getPointIndex() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 6;
            hash = 53 * hash + Float.floatToIntBits(this.getWaitTime());
            hash = 37 * hash + 14;
            hash = 53 * hash + Float.floatToIntBits(this.getTargetVelocity());
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getPointIndex();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static RoutePointChangeInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return RoutePointChangeInfo.PARSER.parseFrom(data);
        }
        
        public static RoutePointChangeInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return RoutePointChangeInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static RoutePointChangeInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return RoutePointChangeInfo.PARSER.parseFrom(data);
        }
        
        public static RoutePointChangeInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return RoutePointChangeInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static RoutePointChangeInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return RoutePointChangeInfo.PARSER.parseFrom(data);
        }
        
        public static RoutePointChangeInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return RoutePointChangeInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static RoutePointChangeInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(RoutePointChangeInfo.PARSER, input);
        }
        
        public static RoutePointChangeInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(RoutePointChangeInfo.PARSER, input, extensionRegistry);
        }
        
        public static RoutePointChangeInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(RoutePointChangeInfo.PARSER, input);
        }
        
        public static RoutePointChangeInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(RoutePointChangeInfo.PARSER, input, extensionRegistry);
        }
        
        public static RoutePointChangeInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(RoutePointChangeInfo.PARSER, input);
        }
        
        public static RoutePointChangeInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(RoutePointChangeInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return RoutePointChangeInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final RoutePointChangeInfo prototype) {
            return RoutePointChangeInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == RoutePointChangeInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static RoutePointChangeInfo getDefaultInstance() {
            return RoutePointChangeInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<RoutePointChangeInfo> parser() {
            return RoutePointChangeInfo.PARSER;
        }
        
        @Override
        public Parser<RoutePointChangeInfo> getParserForType() {
            return RoutePointChangeInfo.PARSER;
        }
        
        @Override
        public RoutePointChangeInfo getDefaultInstanceForType() {
            return RoutePointChangeInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new RoutePointChangeInfo();
            PARSER = new AbstractParser<RoutePointChangeInfo>() {
                @Override
                public RoutePointChangeInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new RoutePointChangeInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RoutePointChangeInfoOrBuilder
        {
            private float waitTime_;
            private float targetVelocity_;
            private int pointIndex_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return RoutePointChangeInfoOuterClass.internal_static_RoutePointChangeInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return RoutePointChangeInfoOuterClass.internal_static_RoutePointChangeInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RoutePointChangeInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (RoutePointChangeInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.waitTime_ = 0.0f;
                this.targetVelocity_ = 0.0f;
                this.pointIndex_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return RoutePointChangeInfoOuterClass.internal_static_RoutePointChangeInfo_descriptor;
            }
            
            @Override
            public RoutePointChangeInfo getDefaultInstanceForType() {
                return RoutePointChangeInfo.getDefaultInstance();
            }
            
            @Override
            public RoutePointChangeInfo build() {
                final RoutePointChangeInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public RoutePointChangeInfo buildPartial() {
                final RoutePointChangeInfo result = new RoutePointChangeInfo(this);
                result.waitTime_ = this.waitTime_;
                result.targetVelocity_ = this.targetVelocity_;
                result.pointIndex_ = this.pointIndex_;
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
                if (other instanceof RoutePointChangeInfo) {
                    return this.mergeFrom((RoutePointChangeInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final RoutePointChangeInfo other) {
                if (other == RoutePointChangeInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getWaitTime() != 0.0f) {
                    this.setWaitTime(other.getWaitTime());
                }
                if (other.getTargetVelocity() != 0.0f) {
                    this.setTargetVelocity(other.getTargetVelocity());
                }
                if (other.getPointIndex() != 0) {
                    this.setPointIndex(other.getPointIndex());
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
                RoutePointChangeInfo parsedMessage = null;
                try {
                    parsedMessage = RoutePointChangeInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (RoutePointChangeInfo)e.getUnfinishedMessage();
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
            public float getWaitTime() {
                return this.waitTime_;
            }
            
            public Builder setWaitTime(final float value) {
                this.waitTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearWaitTime() {
                this.waitTime_ = 0.0f;
                this.onChanged();
                return this;
            }
            
            @Override
            public float getTargetVelocity() {
                return this.targetVelocity_;
            }
            
            public Builder setTargetVelocity(final float value) {
                this.targetVelocity_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTargetVelocity() {
                this.targetVelocity_ = 0.0f;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getPointIndex() {
                return this.pointIndex_;
            }
            
            public Builder setPointIndex(final int value) {
                this.pointIndex_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPointIndex() {
                this.pointIndex_ = 0;
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
    
    public interface RoutePointChangeInfoOrBuilder extends MessageOrBuilder
    {
        float getWaitTime();
        
        float getTargetVelocity();
        
        int getPointIndex();
    }
}
