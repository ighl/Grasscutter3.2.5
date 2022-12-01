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

public final class QuickUseWidgetReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_QuickUseWidgetReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_QuickUseWidgetReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private QuickUseWidgetReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return QuickUseWidgetReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017QuickUseWidgetReq.proto\u001a\u0016WidgetCameraInfo.proto\u001a\u001eWidgetCreateLocationInfo.proto\u001a\u0017WidgetCreatorInfo.proto\u001a\"WidgetThunderBirdFeatherInfo.proto\"\u00ee\u0001\n\u0011QuickUseWidgetReq\u00123\n\rlocation_info\u0018¤\u0005 \u0001(\u000b2\u0019.WidgetCreateLocationInfoH\u0000\u0012)\n\u000bcamera_info\u0018\u00de\u0003 \u0001(\u000b2\u0011.WidgetCameraInfoH\u0000\u0012+\n\fcreator_info\u0018¬\u0006 \u0001(\u000b2\u0012.WidgetCreatorInfoH\u0000\u0012C\n\u0019thunder_bird_feather_info\u0018\u00c3\u000e \u0001(\u000b2\u001d.WidgetThunderBirdFeatherInfoH\u0000B\u0007\n\u0005paramB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        QuickUseWidgetReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { WidgetCameraInfoOuterClass.getDescriptor(), WidgetCreateLocationInfoOuterClass.getDescriptor(), WidgetCreatorInfoOuterClass.getDescriptor(), WidgetThunderBirdFeatherInfoOuterClass.getDescriptor() });
        internal_static_QuickUseWidgetReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_QuickUseWidgetReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(QuickUseWidgetReqOuterClass.internal_static_QuickUseWidgetReq_descriptor, new String[] { "LocationInfo", "CameraInfo", "CreatorInfo", "ThunderBirdFeatherInfo", "Param" });
        WidgetCameraInfoOuterClass.getDescriptor();
        WidgetCreateLocationInfoOuterClass.getDescriptor();
        WidgetCreatorInfoOuterClass.getDescriptor();
        WidgetThunderBirdFeatherInfoOuterClass.getDescriptor();
    }
    
    public static final class QuickUseWidgetReq extends GeneratedMessageV3 implements QuickUseWidgetReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private int paramCase_;
        private Object param_;
        public static final int LOCATION_INFO_FIELD_NUMBER = 676;
        public static final int CAMERA_INFO_FIELD_NUMBER = 478;
        public static final int CREATOR_INFO_FIELD_NUMBER = 812;
        public static final int THUNDER_BIRD_FEATHER_INFO_FIELD_NUMBER = 1859;
        private byte memoizedIsInitialized;
        private static final QuickUseWidgetReq DEFAULT_INSTANCE;
        private static final Parser<QuickUseWidgetReq> PARSER;
        
        private QuickUseWidgetReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.paramCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        private QuickUseWidgetReq() {
            this.paramCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new QuickUseWidgetReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private QuickUseWidgetReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 3826: {
                            WidgetCameraInfoOuterClass.WidgetCameraInfo.Builder subBuilder = null;
                            if (this.paramCase_ == 478) {
                                subBuilder = ((WidgetCameraInfoOuterClass.WidgetCameraInfo)this.param_).toBuilder();
                            }
                            this.param_ = input.readMessage(WidgetCameraInfoOuterClass.WidgetCameraInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((WidgetCameraInfoOuterClass.WidgetCameraInfo)this.param_);
                                this.param_ = subBuilder.buildPartial();
                            }
                            this.paramCase_ = 478;
                            continue;
                        }
                        case 5410: {
                            WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.Builder subBuilder2 = null;
                            if (this.paramCase_ == 676) {
                                subBuilder2 = ((WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo)this.param_).toBuilder();
                            }
                            this.param_ = input.readMessage(WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom((WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo)this.param_);
                                this.param_ = subBuilder2.buildPartial();
                            }
                            this.paramCase_ = 676;
                            continue;
                        }
                        case 6498: {
                            WidgetCreatorInfoOuterClass.WidgetCreatorInfo.Builder subBuilder3 = null;
                            if (this.paramCase_ == 812) {
                                subBuilder3 = ((WidgetCreatorInfoOuterClass.WidgetCreatorInfo)this.param_).toBuilder();
                            }
                            this.param_ = input.readMessage(WidgetCreatorInfoOuterClass.WidgetCreatorInfo.parser(), extensionRegistry);
                            if (subBuilder3 != null) {
                                subBuilder3.mergeFrom((WidgetCreatorInfoOuterClass.WidgetCreatorInfo)this.param_);
                                this.param_ = subBuilder3.buildPartial();
                            }
                            this.paramCase_ = 812;
                            continue;
                        }
                        case 14874: {
                            WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo.Builder subBuilder4 = null;
                            if (this.paramCase_ == 1859) {
                                subBuilder4 = ((WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo)this.param_).toBuilder();
                            }
                            this.param_ = input.readMessage(WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo.parser(), extensionRegistry);
                            if (subBuilder4 != null) {
                                subBuilder4.mergeFrom((WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo)this.param_);
                                this.param_ = subBuilder4.buildPartial();
                            }
                            this.paramCase_ = 1859;
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
            return QuickUseWidgetReqOuterClass.internal_static_QuickUseWidgetReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return QuickUseWidgetReqOuterClass.internal_static_QuickUseWidgetReq_fieldAccessorTable.ensureFieldAccessorsInitialized(QuickUseWidgetReq.class, Builder.class);
        }
        
        @Override
        public ParamCase getParamCase() {
            return ParamCase.forNumber(this.paramCase_);
        }
        
        @Override
        public boolean hasLocationInfo() {
            return this.paramCase_ == 676;
        }
        
        @Override
        public WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo getLocationInfo() {
            if (this.paramCase_ == 676) {
                return (WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo)this.param_;
            }
            return WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.getDefaultInstance();
        }
        
        @Override
        public WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfoOrBuilder getLocationInfoOrBuilder() {
            if (this.paramCase_ == 676) {
                return (WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo)this.param_;
            }
            return WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasCameraInfo() {
            return this.paramCase_ == 478;
        }
        
        @Override
        public WidgetCameraInfoOuterClass.WidgetCameraInfo getCameraInfo() {
            if (this.paramCase_ == 478) {
                return (WidgetCameraInfoOuterClass.WidgetCameraInfo)this.param_;
            }
            return WidgetCameraInfoOuterClass.WidgetCameraInfo.getDefaultInstance();
        }
        
        @Override
        public WidgetCameraInfoOuterClass.WidgetCameraInfoOrBuilder getCameraInfoOrBuilder() {
            if (this.paramCase_ == 478) {
                return (WidgetCameraInfoOuterClass.WidgetCameraInfo)this.param_;
            }
            return WidgetCameraInfoOuterClass.WidgetCameraInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasCreatorInfo() {
            return this.paramCase_ == 812;
        }
        
        @Override
        public WidgetCreatorInfoOuterClass.WidgetCreatorInfo getCreatorInfo() {
            if (this.paramCase_ == 812) {
                return (WidgetCreatorInfoOuterClass.WidgetCreatorInfo)this.param_;
            }
            return WidgetCreatorInfoOuterClass.WidgetCreatorInfo.getDefaultInstance();
        }
        
        @Override
        public WidgetCreatorInfoOuterClass.WidgetCreatorInfoOrBuilder getCreatorInfoOrBuilder() {
            if (this.paramCase_ == 812) {
                return (WidgetCreatorInfoOuterClass.WidgetCreatorInfo)this.param_;
            }
            return WidgetCreatorInfoOuterClass.WidgetCreatorInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasThunderBirdFeatherInfo() {
            return this.paramCase_ == 1859;
        }
        
        @Override
        public WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo getThunderBirdFeatherInfo() {
            if (this.paramCase_ == 1859) {
                return (WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo)this.param_;
            }
            return WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo.getDefaultInstance();
        }
        
        @Override
        public WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfoOrBuilder getThunderBirdFeatherInfoOrBuilder() {
            if (this.paramCase_ == 1859) {
                return (WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo)this.param_;
            }
            return WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo.getDefaultInstance();
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
            if (this.paramCase_ == 478) {
                output.writeMessage(478, (MessageLite)this.param_);
            }
            if (this.paramCase_ == 676) {
                output.writeMessage(676, (MessageLite)this.param_);
            }
            if (this.paramCase_ == 812) {
                output.writeMessage(812, (MessageLite)this.param_);
            }
            if (this.paramCase_ == 1859) {
                output.writeMessage(1859, (MessageLite)this.param_);
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
            if (this.paramCase_ == 478) {
                size += CodedOutputStream.computeMessageSize(478, (MessageLite)this.param_);
            }
            if (this.paramCase_ == 676) {
                size += CodedOutputStream.computeMessageSize(676, (MessageLite)this.param_);
            }
            if (this.paramCase_ == 812) {
                size += CodedOutputStream.computeMessageSize(812, (MessageLite)this.param_);
            }
            if (this.paramCase_ == 1859) {
                size += CodedOutputStream.computeMessageSize(1859, (MessageLite)this.param_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof QuickUseWidgetReq)) {
                return super.equals(obj);
            }
            final QuickUseWidgetReq other = (QuickUseWidgetReq)obj;
            if (!this.getParamCase().equals(other.getParamCase())) {
                return false;
            }
            switch (this.paramCase_) {
                case 676: {
                    if (!this.getLocationInfo().equals(other.getLocationInfo())) {
                        return false;
                    }
                    break;
                }
                case 478: {
                    if (!this.getCameraInfo().equals(other.getCameraInfo())) {
                        return false;
                    }
                    break;
                }
                case 812: {
                    if (!this.getCreatorInfo().equals(other.getCreatorInfo())) {
                        return false;
                    }
                    break;
                }
                case 1859: {
                    if (!this.getThunderBirdFeatherInfo().equals(other.getThunderBirdFeatherInfo())) {
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
            switch (this.paramCase_) {
                case 676: {
                    hash = 37 * hash + 676;
                    hash = 53 * hash + this.getLocationInfo().hashCode();
                    break;
                }
                case 478: {
                    hash = 37 * hash + 478;
                    hash = 53 * hash + this.getCameraInfo().hashCode();
                    break;
                }
                case 812: {
                    hash = 37 * hash + 812;
                    hash = 53 * hash + this.getCreatorInfo().hashCode();
                    break;
                }
                case 1859: {
                    hash = 37 * hash + 1859;
                    hash = 53 * hash + this.getThunderBirdFeatherInfo().hashCode();
                    break;
                }
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static QuickUseWidgetReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return QuickUseWidgetReq.PARSER.parseFrom(data);
        }
        
        public static QuickUseWidgetReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QuickUseWidgetReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QuickUseWidgetReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return QuickUseWidgetReq.PARSER.parseFrom(data);
        }
        
        public static QuickUseWidgetReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QuickUseWidgetReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QuickUseWidgetReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return QuickUseWidgetReq.PARSER.parseFrom(data);
        }
        
        public static QuickUseWidgetReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QuickUseWidgetReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QuickUseWidgetReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QuickUseWidgetReq.PARSER, input);
        }
        
        public static QuickUseWidgetReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QuickUseWidgetReq.PARSER, input, extensionRegistry);
        }
        
        public static QuickUseWidgetReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(QuickUseWidgetReq.PARSER, input);
        }
        
        public static QuickUseWidgetReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(QuickUseWidgetReq.PARSER, input, extensionRegistry);
        }
        
        public static QuickUseWidgetReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QuickUseWidgetReq.PARSER, input);
        }
        
        public static QuickUseWidgetReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QuickUseWidgetReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return QuickUseWidgetReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final QuickUseWidgetReq prototype) {
            return QuickUseWidgetReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == QuickUseWidgetReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static QuickUseWidgetReq getDefaultInstance() {
            return QuickUseWidgetReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<QuickUseWidgetReq> parser() {
            return QuickUseWidgetReq.PARSER;
        }
        
        @Override
        public Parser<QuickUseWidgetReq> getParserForType() {
            return QuickUseWidgetReq.PARSER;
        }
        
        @Override
        public QuickUseWidgetReq getDefaultInstanceForType() {
            return QuickUseWidgetReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new QuickUseWidgetReq();
            PARSER = new AbstractParser<QuickUseWidgetReq>() {
                @Override
                public QuickUseWidgetReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new QuickUseWidgetReq(input, extensionRegistry);
                }
            };
        }
        
        public enum ParamCase implements Internal.EnumLite, InternalOneOfEnum
        {
            LOCATION_INFO(676), 
            CAMERA_INFO(478), 
            CREATOR_INFO(812), 
            THUNDER_BIRD_FEATHER_INFO(1859), 
            PARAM_NOT_SET(0);
            
            private final int value;
            
            private ParamCase(final int value) {
                this.value = value;
            }
            
            @Deprecated
            public static ParamCase valueOf(final int value) {
                return forNumber(value);
            }
            
            public static ParamCase forNumber(final int value) {
                switch (value) {
                    case 676: {
                        return ParamCase.LOCATION_INFO;
                    }
                    case 478: {
                        return ParamCase.CAMERA_INFO;
                    }
                    case 812: {
                        return ParamCase.CREATOR_INFO;
                    }
                    case 1859: {
                        return ParamCase.THUNDER_BIRD_FEATHER_INFO;
                    }
                    case 0: {
                        return ParamCase.PARAM_NOT_SET;
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
            
            private static /* synthetic */ ParamCase[] value() {
                return new ParamCase[] { ParamCase.LOCATION_INFO, ParamCase.CAMERA_INFO, ParamCase.CREATOR_INFO, ParamCase.THUNDER_BIRD_FEATHER_INFO, ParamCase.PARAM_NOT_SET };
            }
            
            
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements QuickUseWidgetReqOrBuilder
        {
            private int paramCase_;
            private Object param_;
            private SingleFieldBuilderV3<WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo, WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.Builder, WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfoOrBuilder> locationInfoBuilder_;
            private SingleFieldBuilderV3<WidgetCameraInfoOuterClass.WidgetCameraInfo, WidgetCameraInfoOuterClass.WidgetCameraInfo.Builder, WidgetCameraInfoOuterClass.WidgetCameraInfoOrBuilder> cameraInfoBuilder_;
            private SingleFieldBuilderV3<WidgetCreatorInfoOuterClass.WidgetCreatorInfo, WidgetCreatorInfoOuterClass.WidgetCreatorInfo.Builder, WidgetCreatorInfoOuterClass.WidgetCreatorInfoOrBuilder> creatorInfoBuilder_;
            private SingleFieldBuilderV3<WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo, WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo.Builder, WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfoOrBuilder> thunderBirdFeatherInfoBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return QuickUseWidgetReqOuterClass.internal_static_QuickUseWidgetReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return QuickUseWidgetReqOuterClass.internal_static_QuickUseWidgetReq_fieldAccessorTable.ensureFieldAccessorsInitialized(QuickUseWidgetReq.class, Builder.class);
            }
            
            private Builder() {
                this.paramCase_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.paramCase_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (QuickUseWidgetReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.paramCase_ = 0;
                this.param_ = null;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return QuickUseWidgetReqOuterClass.internal_static_QuickUseWidgetReq_descriptor;
            }
            
            @Override
            public QuickUseWidgetReq getDefaultInstanceForType() {
                return QuickUseWidgetReq.getDefaultInstance();
            }
            
            @Override
            public QuickUseWidgetReq build() {
                final QuickUseWidgetReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public QuickUseWidgetReq buildPartial() {
                final QuickUseWidgetReq result = new QuickUseWidgetReq(this);
                if (this.paramCase_ == 676) {
                    if (this.locationInfoBuilder_ == null) {
                        result.param_ = this.param_;
                    }
                    else {
                        result.param_ = this.locationInfoBuilder_.build();
                    }
                }
                if (this.paramCase_ == 478) {
                    if (this.cameraInfoBuilder_ == null) {
                        result.param_ = this.param_;
                    }
                    else {
                        result.param_ = this.cameraInfoBuilder_.build();
                    }
                }
                if (this.paramCase_ == 812) {
                    if (this.creatorInfoBuilder_ == null) {
                        result.param_ = this.param_;
                    }
                    else {
                        result.param_ = this.creatorInfoBuilder_.build();
                    }
                }
                if (this.paramCase_ == 1859) {
                    if (this.thunderBirdFeatherInfoBuilder_ == null) {
                        result.param_ = this.param_;
                    }
                    else {
                        result.param_ = this.thunderBirdFeatherInfoBuilder_.build();
                    }
                }
                result.paramCase_ = this.paramCase_;
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
                if (other instanceof QuickUseWidgetReq) {
                    return this.mergeFrom((QuickUseWidgetReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final QuickUseWidgetReq other) {
                if (other == QuickUseWidgetReq.getDefaultInstance()) {
                    return this;
                }
                switch (other.getParamCase()) {
                    case LOCATION_INFO: {
                        this.mergeLocationInfo(other.getLocationInfo());
                        break;
                    }
                    case CAMERA_INFO: {
                        this.mergeCameraInfo(other.getCameraInfo());
                        break;
                    }
                    case CREATOR_INFO: {
                        this.mergeCreatorInfo(other.getCreatorInfo());
                        break;
                    }
                    case THUNDER_BIRD_FEATHER_INFO: {
                        this.mergeThunderBirdFeatherInfo(other.getThunderBirdFeatherInfo());
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
                QuickUseWidgetReq parsedMessage = null;
                try {
                    parsedMessage = QuickUseWidgetReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (QuickUseWidgetReq)e.getUnfinishedMessage();
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
            public ParamCase getParamCase() {
                return ParamCase.forNumber(this.paramCase_);
            }
            
            public Builder clearParam() {
                this.paramCase_ = 0;
                this.param_ = null;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasLocationInfo() {
                return this.paramCase_ == 676;
            }
            
            @Override
            public WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo getLocationInfo() {
                if (this.locationInfoBuilder_ == null) {
                    if (this.paramCase_ == 676) {
                        return (WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo)this.param_;
                    }
                    return WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.getDefaultInstance();
                }
                else {
                    if (this.paramCase_ == 676) {
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
                    this.param_ = value;
                    this.onChanged();
                }
                else {
                    this.locationInfoBuilder_.setMessage(value);
                }
                this.paramCase_ = 676;
                return this;
            }
            
            public Builder setLocationInfo(final WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.Builder builderForValue) {
                if (this.locationInfoBuilder_ == null) {
                    this.param_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.locationInfoBuilder_.setMessage(builderForValue.build());
                }
                this.paramCase_ = 676;
                return this;
            }
            
            public Builder mergeLocationInfo(final WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo value) {
                if (this.locationInfoBuilder_ == null) {
                    if (this.paramCase_ == 676 && this.param_ != WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.getDefaultInstance()) {
                        this.param_ = WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.newBuilder((WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo)this.param_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.param_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.paramCase_ == 676) {
                        this.locationInfoBuilder_.mergeFrom(value);
                    }
                    this.locationInfoBuilder_.setMessage(value);
                }
                this.paramCase_ = 676;
                return this;
            }
            
            public Builder clearLocationInfo() {
                if (this.locationInfoBuilder_ == null) {
                    if (this.paramCase_ == 676) {
                        this.paramCase_ = 0;
                        this.param_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.paramCase_ == 676) {
                        this.paramCase_ = 0;
                        this.param_ = null;
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
                if (this.paramCase_ == 676 && this.locationInfoBuilder_ != null) {
                    return this.locationInfoBuilder_.getMessageOrBuilder();
                }
                if (this.paramCase_ == 676) {
                    return (WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo)this.param_;
                }
                return WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo, WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.Builder, WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfoOrBuilder> getLocationInfoFieldBuilder() {
                if (this.locationInfoBuilder_ == null) {
                    if (this.paramCase_ != 676) {
                        this.param_ = WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.getDefaultInstance();
                    }
                    this.locationInfoBuilder_ = new SingleFieldBuilderV3<WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo, WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.Builder, WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfoOrBuilder>((WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo)this.param_, this.getParentForChildren(), this.isClean());
                    this.param_ = null;
                }
                this.paramCase_ = 676;
                this.onChanged();
                return this.locationInfoBuilder_;
            }
            
            @Override
            public boolean hasCameraInfo() {
                return this.paramCase_ == 478;
            }
            
            @Override
            public WidgetCameraInfoOuterClass.WidgetCameraInfo getCameraInfo() {
                if (this.cameraInfoBuilder_ == null) {
                    if (this.paramCase_ == 478) {
                        return (WidgetCameraInfoOuterClass.WidgetCameraInfo)this.param_;
                    }
                    return WidgetCameraInfoOuterClass.WidgetCameraInfo.getDefaultInstance();
                }
                else {
                    if (this.paramCase_ == 478) {
                        return this.cameraInfoBuilder_.getMessage();
                    }
                    return WidgetCameraInfoOuterClass.WidgetCameraInfo.getDefaultInstance();
                }
            }
            
            public Builder setCameraInfo(final WidgetCameraInfoOuterClass.WidgetCameraInfo value) {
                if (this.cameraInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.param_ = value;
                    this.onChanged();
                }
                else {
                    this.cameraInfoBuilder_.setMessage(value);
                }
                this.paramCase_ = 478;
                return this;
            }
            
            public Builder setCameraInfo(final WidgetCameraInfoOuterClass.WidgetCameraInfo.Builder builderForValue) {
                if (this.cameraInfoBuilder_ == null) {
                    this.param_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.cameraInfoBuilder_.setMessage(builderForValue.build());
                }
                this.paramCase_ = 478;
                return this;
            }
            
            public Builder mergeCameraInfo(final WidgetCameraInfoOuterClass.WidgetCameraInfo value) {
                if (this.cameraInfoBuilder_ == null) {
                    if (this.paramCase_ == 478 && this.param_ != WidgetCameraInfoOuterClass.WidgetCameraInfo.getDefaultInstance()) {
                        this.param_ = WidgetCameraInfoOuterClass.WidgetCameraInfo.newBuilder((WidgetCameraInfoOuterClass.WidgetCameraInfo)this.param_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.param_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.paramCase_ == 478) {
                        this.cameraInfoBuilder_.mergeFrom(value);
                    }
                    this.cameraInfoBuilder_.setMessage(value);
                }
                this.paramCase_ = 478;
                return this;
            }
            
            public Builder clearCameraInfo() {
                if (this.cameraInfoBuilder_ == null) {
                    if (this.paramCase_ == 478) {
                        this.paramCase_ = 0;
                        this.param_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.paramCase_ == 478) {
                        this.paramCase_ = 0;
                        this.param_ = null;
                    }
                    this.cameraInfoBuilder_.clear();
                }
                return this;
            }
            
            public WidgetCameraInfoOuterClass.WidgetCameraInfo.Builder getCameraInfoBuilder() {
                return this.getCameraInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public WidgetCameraInfoOuterClass.WidgetCameraInfoOrBuilder getCameraInfoOrBuilder() {
                if (this.paramCase_ == 478 && this.cameraInfoBuilder_ != null) {
                    return this.cameraInfoBuilder_.getMessageOrBuilder();
                }
                if (this.paramCase_ == 478) {
                    return (WidgetCameraInfoOuterClass.WidgetCameraInfo)this.param_;
                }
                return WidgetCameraInfoOuterClass.WidgetCameraInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<WidgetCameraInfoOuterClass.WidgetCameraInfo, WidgetCameraInfoOuterClass.WidgetCameraInfo.Builder, WidgetCameraInfoOuterClass.WidgetCameraInfoOrBuilder> getCameraInfoFieldBuilder() {
                if (this.cameraInfoBuilder_ == null) {
                    if (this.paramCase_ != 478) {
                        this.param_ = WidgetCameraInfoOuterClass.WidgetCameraInfo.getDefaultInstance();
                    }
                    this.cameraInfoBuilder_ = new SingleFieldBuilderV3<WidgetCameraInfoOuterClass.WidgetCameraInfo, WidgetCameraInfoOuterClass.WidgetCameraInfo.Builder, WidgetCameraInfoOuterClass.WidgetCameraInfoOrBuilder>((WidgetCameraInfoOuterClass.WidgetCameraInfo)this.param_, this.getParentForChildren(), this.isClean());
                    this.param_ = null;
                }
                this.paramCase_ = 478;
                this.onChanged();
                return this.cameraInfoBuilder_;
            }
            
            @Override
            public boolean hasCreatorInfo() {
                return this.paramCase_ == 812;
            }
            
            @Override
            public WidgetCreatorInfoOuterClass.WidgetCreatorInfo getCreatorInfo() {
                if (this.creatorInfoBuilder_ == null) {
                    if (this.paramCase_ == 812) {
                        return (WidgetCreatorInfoOuterClass.WidgetCreatorInfo)this.param_;
                    }
                    return WidgetCreatorInfoOuterClass.WidgetCreatorInfo.getDefaultInstance();
                }
                else {
                    if (this.paramCase_ == 812) {
                        return this.creatorInfoBuilder_.getMessage();
                    }
                    return WidgetCreatorInfoOuterClass.WidgetCreatorInfo.getDefaultInstance();
                }
            }
            
            public Builder setCreatorInfo(final WidgetCreatorInfoOuterClass.WidgetCreatorInfo value) {
                if (this.creatorInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.param_ = value;
                    this.onChanged();
                }
                else {
                    this.creatorInfoBuilder_.setMessage(value);
                }
                this.paramCase_ = 812;
                return this;
            }
            
            public Builder setCreatorInfo(final WidgetCreatorInfoOuterClass.WidgetCreatorInfo.Builder builderForValue) {
                if (this.creatorInfoBuilder_ == null) {
                    this.param_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.creatorInfoBuilder_.setMessage(builderForValue.build());
                }
                this.paramCase_ = 812;
                return this;
            }
            
            public Builder mergeCreatorInfo(final WidgetCreatorInfoOuterClass.WidgetCreatorInfo value) {
                if (this.creatorInfoBuilder_ == null) {
                    if (this.paramCase_ == 812 && this.param_ != WidgetCreatorInfoOuterClass.WidgetCreatorInfo.getDefaultInstance()) {
                        this.param_ = WidgetCreatorInfoOuterClass.WidgetCreatorInfo.newBuilder((WidgetCreatorInfoOuterClass.WidgetCreatorInfo)this.param_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.param_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.paramCase_ == 812) {
                        this.creatorInfoBuilder_.mergeFrom(value);
                    }
                    this.creatorInfoBuilder_.setMessage(value);
                }
                this.paramCase_ = 812;
                return this;
            }
            
            public Builder clearCreatorInfo() {
                if (this.creatorInfoBuilder_ == null) {
                    if (this.paramCase_ == 812) {
                        this.paramCase_ = 0;
                        this.param_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.paramCase_ == 812) {
                        this.paramCase_ = 0;
                        this.param_ = null;
                    }
                    this.creatorInfoBuilder_.clear();
                }
                return this;
            }
            
            public WidgetCreatorInfoOuterClass.WidgetCreatorInfo.Builder getCreatorInfoBuilder() {
                return this.getCreatorInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public WidgetCreatorInfoOuterClass.WidgetCreatorInfoOrBuilder getCreatorInfoOrBuilder() {
                if (this.paramCase_ == 812 && this.creatorInfoBuilder_ != null) {
                    return this.creatorInfoBuilder_.getMessageOrBuilder();
                }
                if (this.paramCase_ == 812) {
                    return (WidgetCreatorInfoOuterClass.WidgetCreatorInfo)this.param_;
                }
                return WidgetCreatorInfoOuterClass.WidgetCreatorInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<WidgetCreatorInfoOuterClass.WidgetCreatorInfo, WidgetCreatorInfoOuterClass.WidgetCreatorInfo.Builder, WidgetCreatorInfoOuterClass.WidgetCreatorInfoOrBuilder> getCreatorInfoFieldBuilder() {
                if (this.creatorInfoBuilder_ == null) {
                    if (this.paramCase_ != 812) {
                        this.param_ = WidgetCreatorInfoOuterClass.WidgetCreatorInfo.getDefaultInstance();
                    }
                    this.creatorInfoBuilder_ = new SingleFieldBuilderV3<WidgetCreatorInfoOuterClass.WidgetCreatorInfo, WidgetCreatorInfoOuterClass.WidgetCreatorInfo.Builder, WidgetCreatorInfoOuterClass.WidgetCreatorInfoOrBuilder>((WidgetCreatorInfoOuterClass.WidgetCreatorInfo)this.param_, this.getParentForChildren(), this.isClean());
                    this.param_ = null;
                }
                this.paramCase_ = 812;
                this.onChanged();
                return this.creatorInfoBuilder_;
            }
            
            @Override
            public boolean hasThunderBirdFeatherInfo() {
                return this.paramCase_ == 1859;
            }
            
            @Override
            public WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo getThunderBirdFeatherInfo() {
                if (this.thunderBirdFeatherInfoBuilder_ == null) {
                    if (this.paramCase_ == 1859) {
                        return (WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo)this.param_;
                    }
                    return WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo.getDefaultInstance();
                }
                else {
                    if (this.paramCase_ == 1859) {
                        return this.thunderBirdFeatherInfoBuilder_.getMessage();
                    }
                    return WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo.getDefaultInstance();
                }
            }
            
            public Builder setThunderBirdFeatherInfo(final WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo value) {
                if (this.thunderBirdFeatherInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.param_ = value;
                    this.onChanged();
                }
                else {
                    this.thunderBirdFeatherInfoBuilder_.setMessage(value);
                }
                this.paramCase_ = 1859;
                return this;
            }
            
            public Builder setThunderBirdFeatherInfo(final WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo.Builder builderForValue) {
                if (this.thunderBirdFeatherInfoBuilder_ == null) {
                    this.param_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.thunderBirdFeatherInfoBuilder_.setMessage(builderForValue.build());
                }
                this.paramCase_ = 1859;
                return this;
            }
            
            public Builder mergeThunderBirdFeatherInfo(final WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo value) {
                if (this.thunderBirdFeatherInfoBuilder_ == null) {
                    if (this.paramCase_ == 1859 && this.param_ != WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo.getDefaultInstance()) {
                        this.param_ = WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo.newBuilder((WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo)this.param_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.param_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.paramCase_ == 1859) {
                        this.thunderBirdFeatherInfoBuilder_.mergeFrom(value);
                    }
                    this.thunderBirdFeatherInfoBuilder_.setMessage(value);
                }
                this.paramCase_ = 1859;
                return this;
            }
            
            public Builder clearThunderBirdFeatherInfo() {
                if (this.thunderBirdFeatherInfoBuilder_ == null) {
                    if (this.paramCase_ == 1859) {
                        this.paramCase_ = 0;
                        this.param_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.paramCase_ == 1859) {
                        this.paramCase_ = 0;
                        this.param_ = null;
                    }
                    this.thunderBirdFeatherInfoBuilder_.clear();
                }
                return this;
            }
            
            public WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo.Builder getThunderBirdFeatherInfoBuilder() {
                return this.getThunderBirdFeatherInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfoOrBuilder getThunderBirdFeatherInfoOrBuilder() {
                if (this.paramCase_ == 1859 && this.thunderBirdFeatherInfoBuilder_ != null) {
                    return this.thunderBirdFeatherInfoBuilder_.getMessageOrBuilder();
                }
                if (this.paramCase_ == 1859) {
                    return (WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo)this.param_;
                }
                return WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo, WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo.Builder, WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfoOrBuilder> getThunderBirdFeatherInfoFieldBuilder() {
                if (this.thunderBirdFeatherInfoBuilder_ == null) {
                    if (this.paramCase_ != 1859) {
                        this.param_ = WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo.getDefaultInstance();
                    }
                    this.thunderBirdFeatherInfoBuilder_ = new SingleFieldBuilderV3<WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo, WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo.Builder, WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfoOrBuilder>((WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo)this.param_, this.getParentForChildren(), this.isClean());
                    this.param_ = null;
                }
                this.paramCase_ = 1859;
                this.onChanged();
                return this.thunderBirdFeatherInfoBuilder_;
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
    
    public interface QuickUseWidgetReqOrBuilder extends MessageOrBuilder
    {
        boolean hasLocationInfo();
        
        WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo getLocationInfo();
        
        WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfoOrBuilder getLocationInfoOrBuilder();
        
        boolean hasCameraInfo();
        
        WidgetCameraInfoOuterClass.WidgetCameraInfo getCameraInfo();
        
        WidgetCameraInfoOuterClass.WidgetCameraInfoOrBuilder getCameraInfoOrBuilder();
        
        boolean hasCreatorInfo();
        
        WidgetCreatorInfoOuterClass.WidgetCreatorInfo getCreatorInfo();
        
        WidgetCreatorInfoOuterClass.WidgetCreatorInfoOrBuilder getCreatorInfoOrBuilder();
        
        boolean hasThunderBirdFeatherInfo();
        
        WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo getThunderBirdFeatherInfo();
        
        WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfoOrBuilder getThunderBirdFeatherInfoOrBuilder();
        
        QuickUseWidgetReq.ParamCase getParamCase();
    }
}
