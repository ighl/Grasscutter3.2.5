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

public final class WidgetDoBagReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_WidgetDoBagReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WidgetDoBagReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WidgetDoBagReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WidgetDoBagReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0014WidgetDoBagReq.proto\u001a\u001eWidgetCreateLocationInfo.proto\u001a\u0017WidgetCreatorInfo.proto\"\u0099\u0001\n\u000eWidgetDoBagReq\u0012\u0013\n\u000bmaterial_id\u0018\t \u0001(\r\u00123\n\rlocation_info\u0018\u00c0\u0006 \u0001(\u000b2\u0019.WidgetCreateLocationInfoH\u0000\u00122\n\u0013widget_creator_info\u0018\u00d9\u000b \u0001(\u000b2\u0012.WidgetCreatorInfoH\u0000B\t\n\u0007op_infoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WidgetDoBagReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { WidgetCreateLocationInfoOuterClass.getDescriptor(), WidgetCreatorInfoOuterClass.getDescriptor() });
        internal_static_WidgetDoBagReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WidgetDoBagReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WidgetDoBagReqOuterClass.internal_static_WidgetDoBagReq_descriptor, new String[] { "MaterialId", "LocationInfo", "WidgetCreatorInfo", "OpInfo" });
        WidgetCreateLocationInfoOuterClass.getDescriptor();
        WidgetCreatorInfoOuterClass.getDescriptor();
    }
    
    public static final class WidgetDoBagReq extends GeneratedMessageV3 implements WidgetDoBagReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private int opInfoCase_;
        private Object opInfo_;
        public static final int MATERIAL_ID_FIELD_NUMBER = 9;
        private int materialId_;
        public static final int LOCATION_INFO_FIELD_NUMBER = 832;
        public static final int WIDGET_CREATOR_INFO_FIELD_NUMBER = 1497;
        private byte memoizedIsInitialized;
        private static final WidgetDoBagReq DEFAULT_INSTANCE;
        private static final Parser<WidgetDoBagReq> PARSER;
        
        private WidgetDoBagReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.opInfoCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        private WidgetDoBagReq() {
            this.opInfoCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WidgetDoBagReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WidgetDoBagReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 72: {
                            this.materialId_ = input.readUInt32();
                            continue;
                        }
                        case 6658: {
                            WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.Builder subBuilder = null;
                            if (this.opInfoCase_ == 832) {
                                subBuilder = ((WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo)this.opInfo_).toBuilder();
                            }
                            this.opInfo_ = input.readMessage(WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo)this.opInfo_);
                                this.opInfo_ = subBuilder.buildPartial();
                            }
                            this.opInfoCase_ = 832;
                            continue;
                        }
                        case 11978: {
                            WidgetCreatorInfoOuterClass.WidgetCreatorInfo.Builder subBuilder2 = null;
                            if (this.opInfoCase_ == 1497) {
                                subBuilder2 = ((WidgetCreatorInfoOuterClass.WidgetCreatorInfo)this.opInfo_).toBuilder();
                            }
                            this.opInfo_ = input.readMessage(WidgetCreatorInfoOuterClass.WidgetCreatorInfo.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom((WidgetCreatorInfoOuterClass.WidgetCreatorInfo)this.opInfo_);
                                this.opInfo_ = subBuilder2.buildPartial();
                            }
                            this.opInfoCase_ = 1497;
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
            return WidgetDoBagReqOuterClass.internal_static_WidgetDoBagReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WidgetDoBagReqOuterClass.internal_static_WidgetDoBagReq_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetDoBagReq.class, Builder.class);
        }
        
        @Override
        public OpInfoCase getOpInfoCase() {
            return OpInfoCase.forNumber(this.opInfoCase_);
        }
        
        @Override
        public int getMaterialId() {
            return this.materialId_;
        }
        
        @Override
        public boolean hasLocationInfo() {
            return this.opInfoCase_ == 832;
        }
        
        @Override
        public WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo getLocationInfo() {
            if (this.opInfoCase_ == 832) {
                return (WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo)this.opInfo_;
            }
            return WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.getDefaultInstance();
        }
        
        @Override
        public WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfoOrBuilder getLocationInfoOrBuilder() {
            if (this.opInfoCase_ == 832) {
                return (WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo)this.opInfo_;
            }
            return WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasWidgetCreatorInfo() {
            return this.opInfoCase_ == 1497;
        }
        
        @Override
        public WidgetCreatorInfoOuterClass.WidgetCreatorInfo getWidgetCreatorInfo() {
            if (this.opInfoCase_ == 1497) {
                return (WidgetCreatorInfoOuterClass.WidgetCreatorInfo)this.opInfo_;
            }
            return WidgetCreatorInfoOuterClass.WidgetCreatorInfo.getDefaultInstance();
        }
        
        @Override
        public WidgetCreatorInfoOuterClass.WidgetCreatorInfoOrBuilder getWidgetCreatorInfoOrBuilder() {
            if (this.opInfoCase_ == 1497) {
                return (WidgetCreatorInfoOuterClass.WidgetCreatorInfo)this.opInfo_;
            }
            return WidgetCreatorInfoOuterClass.WidgetCreatorInfo.getDefaultInstance();
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
            if (this.materialId_ != 0) {
                output.writeUInt32(9, this.materialId_);
            }
            if (this.opInfoCase_ == 832) {
                output.writeMessage(832, (MessageLite)this.opInfo_);
            }
            if (this.opInfoCase_ == 1497) {
                output.writeMessage(1497, (MessageLite)this.opInfo_);
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
            if (this.materialId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.materialId_);
            }
            if (this.opInfoCase_ == 832) {
                size += CodedOutputStream.computeMessageSize(832, (MessageLite)this.opInfo_);
            }
            if (this.opInfoCase_ == 1497) {
                size += CodedOutputStream.computeMessageSize(1497, (MessageLite)this.opInfo_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WidgetDoBagReq)) {
                return super.equals(obj);
            }
            final WidgetDoBagReq other = (WidgetDoBagReq)obj;
            if (this.getMaterialId() != other.getMaterialId()) {
                return false;
            }
            if (!this.getOpInfoCase().equals(other.getOpInfoCase())) {
                return false;
            }
            switch (this.opInfoCase_) {
                case 832: {
                    if (!this.getLocationInfo().equals(other.getLocationInfo())) {
                        return false;
                    }
                    break;
                }
                case 1497: {
                    if (!this.getWidgetCreatorInfo().equals(other.getWidgetCreatorInfo())) {
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
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getMaterialId();
            switch (this.opInfoCase_) {
                case 832: {
                    hash = 37 * hash + 832;
                    hash = 53 * hash + this.getLocationInfo().hashCode();
                    break;
                }
                case 1497: {
                    hash = 37 * hash + 1497;
                    hash = 53 * hash + this.getWidgetCreatorInfo().hashCode();
                    break;
                }
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WidgetDoBagReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WidgetDoBagReq.PARSER.parseFrom(data);
        }
        
        public static WidgetDoBagReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetDoBagReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetDoBagReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WidgetDoBagReq.PARSER.parseFrom(data);
        }
        
        public static WidgetDoBagReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetDoBagReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetDoBagReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WidgetDoBagReq.PARSER.parseFrom(data);
        }
        
        public static WidgetDoBagReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetDoBagReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetDoBagReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetDoBagReq.PARSER, input);
        }
        
        public static WidgetDoBagReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetDoBagReq.PARSER, input, extensionRegistry);
        }
        
        public static WidgetDoBagReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetDoBagReq.PARSER, input);
        }
        
        public static WidgetDoBagReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetDoBagReq.PARSER, input, extensionRegistry);
        }
        
        public static WidgetDoBagReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetDoBagReq.PARSER, input);
        }
        
        public static WidgetDoBagReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetDoBagReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WidgetDoBagReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WidgetDoBagReq prototype) {
            return WidgetDoBagReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WidgetDoBagReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WidgetDoBagReq getDefaultInstance() {
            return WidgetDoBagReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<WidgetDoBagReq> parser() {
            return WidgetDoBagReq.PARSER;
        }
        
        @Override
        public Parser<WidgetDoBagReq> getParserForType() {
            return WidgetDoBagReq.PARSER;
        }
        
        @Override
        public WidgetDoBagReq getDefaultInstanceForType() {
            return WidgetDoBagReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WidgetDoBagReq();
            PARSER = new AbstractParser<WidgetDoBagReq>() {
                @Override
                public WidgetDoBagReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WidgetDoBagReq(input, extensionRegistry);
                }
            };
        }
        
        public enum OpInfoCase implements Internal.EnumLite, InternalOneOfEnum
        {
            LOCATION_INFO(832), 
            WIDGET_CREATOR_INFO(1497), 
            OPINFO_NOT_SET(0);
            
            private final int value;
            
            private OpInfoCase(final int value) {
                this.value = value;
            }
            
            @Deprecated
            public static OpInfoCase valueOf(final int value) {
                return forNumber(value);
            }
            
            public static OpInfoCase forNumber(final int value) {
                switch (value) {
                    case 832: {
                        return OpInfoCase.LOCATION_INFO;
                    }
                    case 1497: {
                        return OpInfoCase.WIDGET_CREATOR_INFO;
                    }
                    case 0: {
                        return OpInfoCase.OPINFO_NOT_SET;
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
            
            private static /* synthetic */ OpInfoCase[] value() {
                return new OpInfoCase[] { OpInfoCase.LOCATION_INFO, OpInfoCase.WIDGET_CREATOR_INFO, OpInfoCase.OPINFO_NOT_SET };
            }
            
            
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WidgetDoBagReqOrBuilder
        {
            private int opInfoCase_;
            private Object opInfo_;
            private int materialId_;
            private SingleFieldBuilderV3<WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo, WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.Builder, WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfoOrBuilder> locationInfoBuilder_;
            private SingleFieldBuilderV3<WidgetCreatorInfoOuterClass.WidgetCreatorInfo, WidgetCreatorInfoOuterClass.WidgetCreatorInfo.Builder, WidgetCreatorInfoOuterClass.WidgetCreatorInfoOrBuilder> widgetCreatorInfoBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WidgetDoBagReqOuterClass.internal_static_WidgetDoBagReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WidgetDoBagReqOuterClass.internal_static_WidgetDoBagReq_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetDoBagReq.class, Builder.class);
            }
            
            private Builder() {
                this.opInfoCase_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.opInfoCase_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (WidgetDoBagReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.materialId_ = 0;
                this.opInfoCase_ = 0;
                this.opInfo_ = null;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WidgetDoBagReqOuterClass.internal_static_WidgetDoBagReq_descriptor;
            }
            
            @Override
            public WidgetDoBagReq getDefaultInstanceForType() {
                return WidgetDoBagReq.getDefaultInstance();
            }
            
            @Override
            public WidgetDoBagReq build() {
                final WidgetDoBagReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WidgetDoBagReq buildPartial() {
                final WidgetDoBagReq result = new WidgetDoBagReq(this);
                result.materialId_ = this.materialId_;
                if (this.opInfoCase_ == 832) {
                    if (this.locationInfoBuilder_ == null) {
                        result.opInfo_ = this.opInfo_;
                    }
                    else {
                        result.opInfo_ = this.locationInfoBuilder_.build();
                    }
                }
                if (this.opInfoCase_ == 1497) {
                    if (this.widgetCreatorInfoBuilder_ == null) {
                        result.opInfo_ = this.opInfo_;
                    }
                    else {
                        result.opInfo_ = this.widgetCreatorInfoBuilder_.build();
                    }
                }
                result.opInfoCase_ = this.opInfoCase_;
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
                if (other instanceof WidgetDoBagReq) {
                    return this.mergeFrom((WidgetDoBagReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WidgetDoBagReq other) {
                if (other == WidgetDoBagReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getMaterialId() != 0) {
                    this.setMaterialId(other.getMaterialId());
                }
                switch (other.getOpInfoCase()) {
                    case LOCATION_INFO: {
                        this.mergeLocationInfo(other.getLocationInfo());
                        break;
                    }
                    case WIDGET_CREATOR_INFO: {
                        this.mergeWidgetCreatorInfo(other.getWidgetCreatorInfo());
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
                WidgetDoBagReq parsedMessage = null;
                try {
                    parsedMessage = WidgetDoBagReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WidgetDoBagReq)e.getUnfinishedMessage();
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
            public OpInfoCase getOpInfoCase() {
                return OpInfoCase.forNumber(this.opInfoCase_);
            }
            
            public Builder clearOpInfo() {
                this.opInfoCase_ = 0;
                this.opInfo_ = null;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMaterialId() {
                return this.materialId_;
            }
            
            public Builder setMaterialId(final int value) {
                this.materialId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMaterialId() {
                this.materialId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasLocationInfo() {
                return this.opInfoCase_ == 832;
            }
            
            @Override
            public WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo getLocationInfo() {
                if (this.locationInfoBuilder_ == null) {
                    if (this.opInfoCase_ == 832) {
                        return (WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo)this.opInfo_;
                    }
                    return WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.getDefaultInstance();
                }
                else {
                    if (this.opInfoCase_ == 832) {
                        return this.locationInfoBuilder_.getMessage();
                    }
                    return WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.getDefaultInstance();
                }
            }
            
            public Builder setLocationInfo(final WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo value) {
                if (this.locationInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.opInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.locationInfoBuilder_.setMessage(value);
                }
                this.opInfoCase_ = 832;
                return this;
            }
            
            public Builder setLocationInfo(final WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.Builder builderForValue) {
                if (this.locationInfoBuilder_ == null) {
                    this.opInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.locationInfoBuilder_.setMessage(builderForValue.build());
                }
                this.opInfoCase_ = 832;
                return this;
            }
            
            public Builder mergeLocationInfo(final WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo value) {
                if (this.locationInfoBuilder_ == null) {
                    if (this.opInfoCase_ == 832 && this.opInfo_ != WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.getDefaultInstance()) {
                        this.opInfo_ = WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.newBuilder((WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo)this.opInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.opInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.opInfoCase_ == 832) {
                        this.locationInfoBuilder_.mergeFrom(value);
                    }
                    this.locationInfoBuilder_.setMessage(value);
                }
                this.opInfoCase_ = 832;
                return this;
            }
            
            public Builder clearLocationInfo() {
                if (this.locationInfoBuilder_ == null) {
                    if (this.opInfoCase_ == 832) {
                        this.opInfoCase_ = 0;
                        this.opInfo_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.opInfoCase_ == 832) {
                        this.opInfoCase_ = 0;
                        this.opInfo_ = null;
                    }
                    this.locationInfoBuilder_.clear();
                }
                return this;
            }
            
            public WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.Builder getLocationInfoBuilder() {
                return this.getLocationInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfoOrBuilder getLocationInfoOrBuilder() {
                if (this.opInfoCase_ == 832 && this.locationInfoBuilder_ != null) {
                    return this.locationInfoBuilder_.getMessageOrBuilder();
                }
                if (this.opInfoCase_ == 832) {
                    return (WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo)this.opInfo_;
                }
                return WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo, WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.Builder, WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfoOrBuilder> getLocationInfoFieldBuilder() {
                if (this.locationInfoBuilder_ == null) {
                    if (this.opInfoCase_ != 832) {
                        this.opInfo_ = WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.getDefaultInstance();
                    }
                    this.locationInfoBuilder_ = new SingleFieldBuilderV3<WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo, WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.Builder, WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfoOrBuilder>((WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo)this.opInfo_, this.getParentForChildren(), this.isClean());
                    this.opInfo_ = null;
                }
                this.opInfoCase_ = 832;
                this.onChanged();
                return this.locationInfoBuilder_;
            }
            
            @Override
            public boolean hasWidgetCreatorInfo() {
                return this.opInfoCase_ == 1497;
            }
            
            @Override
            public WidgetCreatorInfoOuterClass.WidgetCreatorInfo getWidgetCreatorInfo() {
                if (this.widgetCreatorInfoBuilder_ == null) {
                    if (this.opInfoCase_ == 1497) {
                        return (WidgetCreatorInfoOuterClass.WidgetCreatorInfo)this.opInfo_;
                    }
                    return WidgetCreatorInfoOuterClass.WidgetCreatorInfo.getDefaultInstance();
                }
                else {
                    if (this.opInfoCase_ == 1497) {
                        return this.widgetCreatorInfoBuilder_.getMessage();
                    }
                    return WidgetCreatorInfoOuterClass.WidgetCreatorInfo.getDefaultInstance();
                }
            }
            
            public Builder setWidgetCreatorInfo(final WidgetCreatorInfoOuterClass.WidgetCreatorInfo value) {
                if (this.widgetCreatorInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.opInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.widgetCreatorInfoBuilder_.setMessage(value);
                }
                this.opInfoCase_ = 1497;
                return this;
            }
            
            public Builder setWidgetCreatorInfo(final WidgetCreatorInfoOuterClass.WidgetCreatorInfo.Builder builderForValue) {
                if (this.widgetCreatorInfoBuilder_ == null) {
                    this.opInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.widgetCreatorInfoBuilder_.setMessage(builderForValue.build());
                }
                this.opInfoCase_ = 1497;
                return this;
            }
            
            public Builder mergeWidgetCreatorInfo(final WidgetCreatorInfoOuterClass.WidgetCreatorInfo value) {
                if (this.widgetCreatorInfoBuilder_ == null) {
                    if (this.opInfoCase_ == 1497 && this.opInfo_ != WidgetCreatorInfoOuterClass.WidgetCreatorInfo.getDefaultInstance()) {
                        this.opInfo_ = WidgetCreatorInfoOuterClass.WidgetCreatorInfo.newBuilder((WidgetCreatorInfoOuterClass.WidgetCreatorInfo)this.opInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.opInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.opInfoCase_ == 1497) {
                        this.widgetCreatorInfoBuilder_.mergeFrom(value);
                    }
                    this.widgetCreatorInfoBuilder_.setMessage(value);
                }
                this.opInfoCase_ = 1497;
                return this;
            }
            
            public Builder clearWidgetCreatorInfo() {
                if (this.widgetCreatorInfoBuilder_ == null) {
                    if (this.opInfoCase_ == 1497) {
                        this.opInfoCase_ = 0;
                        this.opInfo_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.opInfoCase_ == 1497) {
                        this.opInfoCase_ = 0;
                        this.opInfo_ = null;
                    }
                    this.widgetCreatorInfoBuilder_.clear();
                }
                return this;
            }
            
            public WidgetCreatorInfoOuterClass.WidgetCreatorInfo.Builder getWidgetCreatorInfoBuilder() {
                return this.getWidgetCreatorInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public WidgetCreatorInfoOuterClass.WidgetCreatorInfoOrBuilder getWidgetCreatorInfoOrBuilder() {
                if (this.opInfoCase_ == 1497 && this.widgetCreatorInfoBuilder_ != null) {
                    return this.widgetCreatorInfoBuilder_.getMessageOrBuilder();
                }
                if (this.opInfoCase_ == 1497) {
                    return (WidgetCreatorInfoOuterClass.WidgetCreatorInfo)this.opInfo_;
                }
                return WidgetCreatorInfoOuterClass.WidgetCreatorInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<WidgetCreatorInfoOuterClass.WidgetCreatorInfo, WidgetCreatorInfoOuterClass.WidgetCreatorInfo.Builder, WidgetCreatorInfoOuterClass.WidgetCreatorInfoOrBuilder> getWidgetCreatorInfoFieldBuilder() {
                if (this.widgetCreatorInfoBuilder_ == null) {
                    if (this.opInfoCase_ != 1497) {
                        this.opInfo_ = WidgetCreatorInfoOuterClass.WidgetCreatorInfo.getDefaultInstance();
                    }
                    this.widgetCreatorInfoBuilder_ = new SingleFieldBuilderV3<WidgetCreatorInfoOuterClass.WidgetCreatorInfo, WidgetCreatorInfoOuterClass.WidgetCreatorInfo.Builder, WidgetCreatorInfoOuterClass.WidgetCreatorInfoOrBuilder>((WidgetCreatorInfoOuterClass.WidgetCreatorInfo)this.opInfo_, this.getParentForChildren(), this.isClean());
                    this.opInfo_ = null;
                }
                this.opInfoCase_ = 1497;
                this.onChanged();
                return this.widgetCreatorInfoBuilder_;
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
    
    public interface WidgetDoBagReqOrBuilder extends MessageOrBuilder
    {
        int getMaterialId();
        
        boolean hasLocationInfo();
        
        WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo getLocationInfo();
        
        WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfoOrBuilder getLocationInfoOrBuilder();
        
        boolean hasWidgetCreatorInfo();
        
        WidgetCreatorInfoOuterClass.WidgetCreatorInfo getWidgetCreatorInfo();
        
        WidgetCreatorInfoOuterClass.WidgetCreatorInfoOrBuilder getWidgetCreatorInfoOrBuilder();
        
        WidgetDoBagReq.OpInfoCase getOpInfoCase();
    }
}
