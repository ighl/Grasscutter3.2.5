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

public final class WidgetCreatorInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_WidgetCreatorInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WidgetCreatorInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WidgetCreatorInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WidgetCreatorInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017WidgetCreatorInfo.proto\u001a\u001eWidgetCreateLocationInfo.proto\u001a\u0019WidgetCreatorOpType.proto\"\u007f\n\u0011WidgetCreatorInfo\u0012%\n\u0007op_type\u0018\n \u0001(\u000e2\u0014.WidgetCreatorOpType\u0012\u0011\n\tentity_id\u0018\u0001 \u0001(\r\u00120\n\rlocation_info\u0018\f \u0001(\u000b2\u0019.WidgetCreateLocationInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WidgetCreatorInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { WidgetCreateLocationInfoOuterClass.getDescriptor(), WidgetCreatorOpTypeOuterClass.getDescriptor() });
        internal_static_WidgetCreatorInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WidgetCreatorInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WidgetCreatorInfoOuterClass.internal_static_WidgetCreatorInfo_descriptor, new String[] { "OpType", "EntityId", "LocationInfo" });
        WidgetCreateLocationInfoOuterClass.getDescriptor();
        WidgetCreatorOpTypeOuterClass.getDescriptor();
    }
    
    public static final class WidgetCreatorInfo extends GeneratedMessageV3 implements WidgetCreatorInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int OP_TYPE_FIELD_NUMBER = 10;
        private int opType_;
        public static final int ENTITY_ID_FIELD_NUMBER = 1;
        private int entityId_;
        public static final int LOCATION_INFO_FIELD_NUMBER = 12;
        private WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo locationInfo_;
        private byte memoizedIsInitialized;
        private static final WidgetCreatorInfo DEFAULT_INSTANCE;
        private static final Parser<WidgetCreatorInfo> PARSER;
        
        private WidgetCreatorInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private WidgetCreatorInfo() {
            this.memoizedIsInitialized = -1;
            this.opType_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WidgetCreatorInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WidgetCreatorInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.entityId_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
                            final int rawValue = input.readEnum();
                            this.opType_ = rawValue;
                            continue;
                        }
                        case 98: {
                            WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.Builder subBuilder = null;
                            if (this.locationInfo_ != null) {
                                subBuilder = this.locationInfo_.toBuilder();
                            }
                            this.locationInfo_ = input.readMessage(WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.locationInfo_);
                                this.locationInfo_ = subBuilder.buildPartial();
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
            return WidgetCreatorInfoOuterClass.internal_static_WidgetCreatorInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WidgetCreatorInfoOuterClass.internal_static_WidgetCreatorInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetCreatorInfo.class, Builder.class);
        }
        
        @Override
        public int getOpTypeValue() {
            return this.opType_;
        }
        
        @Override
        public WidgetCreatorOpTypeOuterClass.WidgetCreatorOpType getOpType() {
            final WidgetCreatorOpTypeOuterClass.WidgetCreatorOpType result = WidgetCreatorOpTypeOuterClass.WidgetCreatorOpType.valueOf(this.opType_);
            return (result == null) ? WidgetCreatorOpTypeOuterClass.WidgetCreatorOpType.UNRECOGNIZED : result;
        }
        
        @Override
        public int getEntityId() {
            return this.entityId_;
        }
        
        @Override
        public boolean hasLocationInfo() {
            return this.locationInfo_ != null;
        }
        
        @Override
        public WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo getLocationInfo() {
            return (this.locationInfo_ == null) ? WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.getDefaultInstance() : this.locationInfo_;
        }
        
        @Override
        public WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfoOrBuilder getLocationInfoOrBuilder() {
            return this.getLocationInfo();
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
                output.writeUInt32(1, this.entityId_);
            }
            if (this.opType_ != WidgetCreatorOpTypeOuterClass.WidgetCreatorOpType.WIDGET_CREATOR_OP_TYPE_NONE.getNumber()) {
                output.writeEnum(10, this.opType_);
            }
            if (this.locationInfo_ != null) {
                output.writeMessage(12, this.getLocationInfo());
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
                size += CodedOutputStream.computeUInt32Size(1, this.entityId_);
            }
            if (this.opType_ != WidgetCreatorOpTypeOuterClass.WidgetCreatorOpType.WIDGET_CREATOR_OP_TYPE_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(10, this.opType_);
            }
            if (this.locationInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(12, this.getLocationInfo());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WidgetCreatorInfo)) {
                return super.equals(obj);
            }
            final WidgetCreatorInfo other = (WidgetCreatorInfo)obj;
            return this.opType_ == other.opType_ && this.getEntityId() == other.getEntityId() && this.hasLocationInfo() == other.hasLocationInfo() && (!this.hasLocationInfo() || this.getLocationInfo().equals(other.getLocationInfo())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.opType_;
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getEntityId();
            if (this.hasLocationInfo()) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getLocationInfo().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WidgetCreatorInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WidgetCreatorInfo.PARSER.parseFrom(data);
        }
        
        public static WidgetCreatorInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetCreatorInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetCreatorInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WidgetCreatorInfo.PARSER.parseFrom(data);
        }
        
        public static WidgetCreatorInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetCreatorInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetCreatorInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WidgetCreatorInfo.PARSER.parseFrom(data);
        }
        
        public static WidgetCreatorInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetCreatorInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetCreatorInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetCreatorInfo.PARSER, input);
        }
        
        public static WidgetCreatorInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetCreatorInfo.PARSER, input, extensionRegistry);
        }
        
        public static WidgetCreatorInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetCreatorInfo.PARSER, input);
        }
        
        public static WidgetCreatorInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetCreatorInfo.PARSER, input, extensionRegistry);
        }
        
        public static WidgetCreatorInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetCreatorInfo.PARSER, input);
        }
        
        public static WidgetCreatorInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetCreatorInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WidgetCreatorInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WidgetCreatorInfo prototype) {
            return WidgetCreatorInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WidgetCreatorInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WidgetCreatorInfo getDefaultInstance() {
            return WidgetCreatorInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<WidgetCreatorInfo> parser() {
            return WidgetCreatorInfo.PARSER;
        }
        
        @Override
        public Parser<WidgetCreatorInfo> getParserForType() {
            return WidgetCreatorInfo.PARSER;
        }
        
        @Override
        public WidgetCreatorInfo getDefaultInstanceForType() {
            return WidgetCreatorInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WidgetCreatorInfo();
            PARSER = new AbstractParser<WidgetCreatorInfo>() {
                @Override
                public WidgetCreatorInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WidgetCreatorInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WidgetCreatorInfoOrBuilder
        {
            private int opType_;
            private int entityId_;
            private WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo locationInfo_;
            private SingleFieldBuilderV3<WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo, WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.Builder, WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfoOrBuilder> locationInfoBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WidgetCreatorInfoOuterClass.internal_static_WidgetCreatorInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WidgetCreatorInfoOuterClass.internal_static_WidgetCreatorInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetCreatorInfo.class, Builder.class);
            }
            
            private Builder() {
                this.opType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.opType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (WidgetCreatorInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.opType_ = 0;
                this.entityId_ = 0;
                if (this.locationInfoBuilder_ == null) {
                    this.locationInfo_ = null;
                }
                else {
                    this.locationInfo_ = null;
                    this.locationInfoBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WidgetCreatorInfoOuterClass.internal_static_WidgetCreatorInfo_descriptor;
            }
            
            @Override
            public WidgetCreatorInfo getDefaultInstanceForType() {
                return WidgetCreatorInfo.getDefaultInstance();
            }
            
            @Override
            public WidgetCreatorInfo build() {
                final WidgetCreatorInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WidgetCreatorInfo buildPartial() {
                final WidgetCreatorInfo result = new WidgetCreatorInfo(this);
                result.opType_ = this.opType_;
                result.entityId_ = this.entityId_;
                if (this.locationInfoBuilder_ == null) {
                    result.locationInfo_ = this.locationInfo_;
                }
                else {
                    result.locationInfo_ = this.locationInfoBuilder_.build();
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
                if (other instanceof WidgetCreatorInfo) {
                    return this.mergeFrom((WidgetCreatorInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WidgetCreatorInfo other) {
                if (other == WidgetCreatorInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.opType_ != 0) {
                    this.setOpTypeValue(other.getOpTypeValue());
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
                }
                if (other.hasLocationInfo()) {
                    this.mergeLocationInfo(other.getLocationInfo());
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
                WidgetCreatorInfo parsedMessage = null;
                try {
                    parsedMessage = WidgetCreatorInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WidgetCreatorInfo)e.getUnfinishedMessage();
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
            public int getOpTypeValue() {
                return this.opType_;
            }
            
            public Builder setOpTypeValue(final int value) {
                this.opType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public WidgetCreatorOpTypeOuterClass.WidgetCreatorOpType getOpType() {
                final WidgetCreatorOpTypeOuterClass.WidgetCreatorOpType result = WidgetCreatorOpTypeOuterClass.WidgetCreatorOpType.valueOf(this.opType_);
                return (result == null) ? WidgetCreatorOpTypeOuterClass.WidgetCreatorOpType.UNRECOGNIZED : result;
            }
            
            public Builder setOpType(final WidgetCreatorOpTypeOuterClass.WidgetCreatorOpType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.opType_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearOpType() {
                this.opType_ = 0;
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
            public boolean hasLocationInfo() {
                return this.locationInfoBuilder_ != null || this.locationInfo_ != null;
            }
            
            @Override
            public WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo getLocationInfo() {
                if (this.locationInfoBuilder_ == null) {
                    return (this.locationInfo_ == null) ? WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.getDefaultInstance() : this.locationInfo_;
                }
                return this.locationInfoBuilder_.getMessage();
            }
            
            public Builder setLocationInfo(final WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo value) {
                if (this.locationInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.locationInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.locationInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setLocationInfo(final WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.Builder builderForValue) {
                if (this.locationInfoBuilder_ == null) {
                    this.locationInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.locationInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeLocationInfo(final WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo value) {
                if (this.locationInfoBuilder_ == null) {
                    if (this.locationInfo_ != null) {
                        this.locationInfo_ = WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.newBuilder(this.locationInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.locationInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.locationInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearLocationInfo() {
                if (this.locationInfoBuilder_ == null) {
                    this.locationInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.locationInfo_ = null;
                    this.locationInfoBuilder_ = null;
                }
                return this;
            }
            
            public WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.Builder getLocationInfoBuilder() {
                this.onChanged();
                return this.getLocationInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfoOrBuilder getLocationInfoOrBuilder() {
                if (this.locationInfoBuilder_ != null) {
                    return this.locationInfoBuilder_.getMessageOrBuilder();
                }
                return (this.locationInfo_ == null) ? WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.getDefaultInstance() : this.locationInfo_;
            }
            
            private SingleFieldBuilderV3<WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo, WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.Builder, WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfoOrBuilder> getLocationInfoFieldBuilder() {
                if (this.locationInfoBuilder_ == null) {
                    this.locationInfoBuilder_ = new SingleFieldBuilderV3<WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo, WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.Builder, WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfoOrBuilder>(this.getLocationInfo(), this.getParentForChildren(), this.isClean());
                    this.locationInfo_ = null;
                }
                return this.locationInfoBuilder_;
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
    
    public interface WidgetCreatorInfoOrBuilder extends MessageOrBuilder
    {
        int getOpTypeValue();
        
        WidgetCreatorOpTypeOuterClass.WidgetCreatorOpType getOpType();
        
        int getEntityId();
        
        boolean hasLocationInfo();
        
        WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo getLocationInfo();
        
        WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfoOrBuilder getLocationInfoOrBuilder();
    }
}
