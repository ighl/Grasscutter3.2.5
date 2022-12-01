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

public final class QuickUseWidgetRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_QuickUseWidgetRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_QuickUseWidgetRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private QuickUseWidgetRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return QuickUseWidgetRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017QuickUseWidgetRsp.proto\u001a\u0019ClientCollectorData.proto\u001a\"OneofGatherPointDetectorData.proto\u001a&SkyCrystalDetectorQuickUseResult.proto\"\u0087\u0002\n\u0011QuickUseWidgetRsp\u0012\u0013\n\u000bmaterial_id\u0018\u0006 \u0001(\r\u0012\u000f\n\u0007retcode\u0018\u0005 \u0001(\u0005\u00126\n\rdetector_data\u0018\u0003 \u0001(\u000b2\u001d.OneofGatherPointDetectorDataH\u0000\u00125\n\u0015client_collector_data\u0018\u000f \u0001(\u000b2\u0014.ClientCollectorDataH\u0000\u0012T\n%sky_crystal_detector_quick_use_result\u0018\u00da§\n \u0001(\u000b2!.SkyCrystalDetectorQuickUseResultH\u0000B\u0007\n\u0005paramB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        QuickUseWidgetRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ClientCollectorDataOuterClass.getDescriptor(), OneofGatherPointDetectorDataOuterClass.getDescriptor(), SkyCrystalDetectorQuickUseResultOuterClass.getDescriptor() });
        internal_static_QuickUseWidgetRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_QuickUseWidgetRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(QuickUseWidgetRspOuterClass.internal_static_QuickUseWidgetRsp_descriptor, new String[] { "MaterialId", "Retcode", "DetectorData", "ClientCollectorData", "SkyCrystalDetectorQuickUseResult", "Param" });
        ClientCollectorDataOuterClass.getDescriptor();
        OneofGatherPointDetectorDataOuterClass.getDescriptor();
        SkyCrystalDetectorQuickUseResultOuterClass.getDescriptor();
    }
    
    public static final class QuickUseWidgetRsp extends GeneratedMessageV3 implements QuickUseWidgetRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private int paramCase_;
        private Object param_;
        public static final int MATERIAL_ID_FIELD_NUMBER = 6;
        private int materialId_;
        public static final int RETCODE_FIELD_NUMBER = 5;
        private int retcode_;
        public static final int DETECTOR_DATA_FIELD_NUMBER = 3;
        public static final int CLIENT_COLLECTOR_DATA_FIELD_NUMBER = 15;
        public static final int SKY_CRYSTAL_DETECTOR_QUICK_USE_RESULT_FIELD_NUMBER = 168922;
        private byte memoizedIsInitialized;
        private static final QuickUseWidgetRsp DEFAULT_INSTANCE;
        private static final Parser<QuickUseWidgetRsp> PARSER;
        
        private QuickUseWidgetRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.paramCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        private QuickUseWidgetRsp() {
            this.paramCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new QuickUseWidgetRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private QuickUseWidgetRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 26: {
                            OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder subBuilder = null;
                            if (this.paramCase_ == 3) {
                                subBuilder = ((OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData)this.param_).toBuilder();
                            }
                            this.param_ = input.readMessage(OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData)this.param_);
                                this.param_ = subBuilder.buildPartial();
                            }
                            this.paramCase_ = 3;
                            continue;
                        }
                        case 40: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 48: {
                            this.materialId_ = input.readUInt32();
                            continue;
                        }
                        case 122: {
                            ClientCollectorDataOuterClass.ClientCollectorData.Builder subBuilder2 = null;
                            if (this.paramCase_ == 15) {
                                subBuilder2 = ((ClientCollectorDataOuterClass.ClientCollectorData)this.param_).toBuilder();
                            }
                            this.param_ = input.readMessage(ClientCollectorDataOuterClass.ClientCollectorData.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom((ClientCollectorDataOuterClass.ClientCollectorData)this.param_);
                                this.param_ = subBuilder2.buildPartial();
                            }
                            this.paramCase_ = 15;
                            continue;
                        }
                        case 1351378: {
                            SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult.Builder subBuilder3 = null;
                            if (this.paramCase_ == 168922) {
                                subBuilder3 = ((SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult)this.param_).toBuilder();
                            }
                            this.param_ = input.readMessage(SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult.parser(), extensionRegistry);
                            if (subBuilder3 != null) {
                                subBuilder3.mergeFrom((SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult)this.param_);
                                this.param_ = subBuilder3.buildPartial();
                            }
                            this.paramCase_ = 168922;
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
            return QuickUseWidgetRspOuterClass.internal_static_QuickUseWidgetRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return QuickUseWidgetRspOuterClass.internal_static_QuickUseWidgetRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(QuickUseWidgetRsp.class, Builder.class);
        }
        
        @Override
        public ParamCase getParamCase() {
            return ParamCase.forNumber(this.paramCase_);
        }
        
        @Override
        public int getMaterialId() {
            return this.materialId_;
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public boolean hasDetectorData() {
            return this.paramCase_ == 3;
        }
        
        @Override
        public OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData getDetectorData() {
            if (this.paramCase_ == 3) {
                return (OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData)this.param_;
            }
            return OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.getDefaultInstance();
        }
        
        @Override
        public OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorDataOrBuilder getDetectorDataOrBuilder() {
            if (this.paramCase_ == 3) {
                return (OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData)this.param_;
            }
            return OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.getDefaultInstance();
        }
        
        @Override
        public boolean hasClientCollectorData() {
            return this.paramCase_ == 15;
        }
        
        @Override
        public ClientCollectorDataOuterClass.ClientCollectorData getClientCollectorData() {
            if (this.paramCase_ == 15) {
                return (ClientCollectorDataOuterClass.ClientCollectorData)this.param_;
            }
            return ClientCollectorDataOuterClass.ClientCollectorData.getDefaultInstance();
        }
        
        @Override
        public ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder getClientCollectorDataOrBuilder() {
            if (this.paramCase_ == 15) {
                return (ClientCollectorDataOuterClass.ClientCollectorData)this.param_;
            }
            return ClientCollectorDataOuterClass.ClientCollectorData.getDefaultInstance();
        }
        
        @Override
        public boolean hasSkyCrystalDetectorQuickUseResult() {
            return this.paramCase_ == 168922;
        }
        
        @Override
        public SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult getSkyCrystalDetectorQuickUseResult() {
            if (this.paramCase_ == 168922) {
                return (SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult)this.param_;
            }
            return SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult.getDefaultInstance();
        }
        
        @Override
        public SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResultOrBuilder getSkyCrystalDetectorQuickUseResultOrBuilder() {
            if (this.paramCase_ == 168922) {
                return (SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult)this.param_;
            }
            return SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult.getDefaultInstance();
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
            if (this.paramCase_ == 3) {
                output.writeMessage(3, (MessageLite)this.param_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(5, this.retcode_);
            }
            if (this.materialId_ != 0) {
                output.writeUInt32(6, this.materialId_);
            }
            if (this.paramCase_ == 15) {
                output.writeMessage(15, (MessageLite)this.param_);
            }
            if (this.paramCase_ == 168922) {
                output.writeMessage(168922, (MessageLite)this.param_);
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
            if (this.paramCase_ == 3) {
                size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.param_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(5, this.retcode_);
            }
            if (this.materialId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.materialId_);
            }
            if (this.paramCase_ == 15) {
                size += CodedOutputStream.computeMessageSize(15, (MessageLite)this.param_);
            }
            if (this.paramCase_ == 168922) {
                size += CodedOutputStream.computeMessageSize(168922, (MessageLite)this.param_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof QuickUseWidgetRsp)) {
                return super.equals(obj);
            }
            final QuickUseWidgetRsp other = (QuickUseWidgetRsp)obj;
            if (this.getMaterialId() != other.getMaterialId()) {
                return false;
            }
            if (this.getRetcode() != other.getRetcode()) {
                return false;
            }
            if (!this.getParamCase().equals(other.getParamCase())) {
                return false;
            }
            switch (this.paramCase_) {
                case 3: {
                    if (!this.getDetectorData().equals(other.getDetectorData())) {
                        return false;
                    }
                    break;
                }
                case 15: {
                    if (!this.getClientCollectorData().equals(other.getClientCollectorData())) {
                        return false;
                    }
                    break;
                }
                case 168922: {
                    if (!this.getSkyCrystalDetectorQuickUseResult().equals(other.getSkyCrystalDetectorQuickUseResult())) {
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
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getMaterialId();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getRetcode();
            switch (this.paramCase_) {
                case 3: {
                    hash = 37 * hash + 3;
                    hash = 53 * hash + this.getDetectorData().hashCode();
                    break;
                }
                case 15: {
                    hash = 37 * hash + 15;
                    hash = 53 * hash + this.getClientCollectorData().hashCode();
                    break;
                }
                case 168922: {
                    hash = 37 * hash + 168922;
                    hash = 53 * hash + this.getSkyCrystalDetectorQuickUseResult().hashCode();
                    break;
                }
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static QuickUseWidgetRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return QuickUseWidgetRsp.PARSER.parseFrom(data);
        }
        
        public static QuickUseWidgetRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QuickUseWidgetRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QuickUseWidgetRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return QuickUseWidgetRsp.PARSER.parseFrom(data);
        }
        
        public static QuickUseWidgetRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QuickUseWidgetRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QuickUseWidgetRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return QuickUseWidgetRsp.PARSER.parseFrom(data);
        }
        
        public static QuickUseWidgetRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QuickUseWidgetRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QuickUseWidgetRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QuickUseWidgetRsp.PARSER, input);
        }
        
        public static QuickUseWidgetRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QuickUseWidgetRsp.PARSER, input, extensionRegistry);
        }
        
        public static QuickUseWidgetRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(QuickUseWidgetRsp.PARSER, input);
        }
        
        public static QuickUseWidgetRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(QuickUseWidgetRsp.PARSER, input, extensionRegistry);
        }
        
        public static QuickUseWidgetRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QuickUseWidgetRsp.PARSER, input);
        }
        
        public static QuickUseWidgetRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QuickUseWidgetRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return QuickUseWidgetRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final QuickUseWidgetRsp prototype) {
            return QuickUseWidgetRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == QuickUseWidgetRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static QuickUseWidgetRsp getDefaultInstance() {
            return QuickUseWidgetRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<QuickUseWidgetRsp> parser() {
            return QuickUseWidgetRsp.PARSER;
        }
        
        @Override
        public Parser<QuickUseWidgetRsp> getParserForType() {
            return QuickUseWidgetRsp.PARSER;
        }
        
        @Override
        public QuickUseWidgetRsp getDefaultInstanceForType() {
            return QuickUseWidgetRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new QuickUseWidgetRsp();
            PARSER = new AbstractParser<QuickUseWidgetRsp>() {
                @Override
                public QuickUseWidgetRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new QuickUseWidgetRsp(input, extensionRegistry);
                }
            };
        }
        
        public enum ParamCase implements Internal.EnumLite, InternalOneOfEnum
        {
            DETECTOR_DATA(3), 
            CLIENT_COLLECTOR_DATA(15), 
            SKY_CRYSTAL_DETECTOR_QUICK_USE_RESULT(168922), 
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
                    case 3: {
                        return ParamCase.DETECTOR_DATA;
                    }
                    case 15: {
                        return ParamCase.CLIENT_COLLECTOR_DATA;
                    }
                    case 168922: {
                        return ParamCase.SKY_CRYSTAL_DETECTOR_QUICK_USE_RESULT;
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
                return new ParamCase[] { ParamCase.DETECTOR_DATA, ParamCase.CLIENT_COLLECTOR_DATA, ParamCase.SKY_CRYSTAL_DETECTOR_QUICK_USE_RESULT, ParamCase.PARAM_NOT_SET };
            }
            
            
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements QuickUseWidgetRspOrBuilder
        {
            private int paramCase_;
            private Object param_;
            private int materialId_;
            private int retcode_;
            private SingleFieldBuilderV3<OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData, OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder, OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorDataOrBuilder> detectorDataBuilder_;
            private SingleFieldBuilderV3<ClientCollectorDataOuterClass.ClientCollectorData, ClientCollectorDataOuterClass.ClientCollectorData.Builder, ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder> clientCollectorDataBuilder_;
            private SingleFieldBuilderV3<SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult, SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult.Builder, SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResultOrBuilder> skyCrystalDetectorQuickUseResultBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return QuickUseWidgetRspOuterClass.internal_static_QuickUseWidgetRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return QuickUseWidgetRspOuterClass.internal_static_QuickUseWidgetRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(QuickUseWidgetRsp.class, Builder.class);
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
                if (QuickUseWidgetRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.materialId_ = 0;
                this.retcode_ = 0;
                this.paramCase_ = 0;
                this.param_ = null;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return QuickUseWidgetRspOuterClass.internal_static_QuickUseWidgetRsp_descriptor;
            }
            
            @Override
            public QuickUseWidgetRsp getDefaultInstanceForType() {
                return QuickUseWidgetRsp.getDefaultInstance();
            }
            
            @Override
            public QuickUseWidgetRsp build() {
                final QuickUseWidgetRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public QuickUseWidgetRsp buildPartial() {
                final QuickUseWidgetRsp result = new QuickUseWidgetRsp(this);
                result.materialId_ = this.materialId_;
                result.retcode_ = this.retcode_;
                if (this.paramCase_ == 3) {
                    if (this.detectorDataBuilder_ == null) {
                        result.param_ = this.param_;
                    }
                    else {
                        result.param_ = this.detectorDataBuilder_.build();
                    }
                }
                if (this.paramCase_ == 15) {
                    if (this.clientCollectorDataBuilder_ == null) {
                        result.param_ = this.param_;
                    }
                    else {
                        result.param_ = this.clientCollectorDataBuilder_.build();
                    }
                }
                if (this.paramCase_ == 168922) {
                    if (this.skyCrystalDetectorQuickUseResultBuilder_ == null) {
                        result.param_ = this.param_;
                    }
                    else {
                        result.param_ = this.skyCrystalDetectorQuickUseResultBuilder_.build();
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
                if (other instanceof QuickUseWidgetRsp) {
                    return this.mergeFrom((QuickUseWidgetRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final QuickUseWidgetRsp other) {
                if (other == QuickUseWidgetRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getMaterialId() != 0) {
                    this.setMaterialId(other.getMaterialId());
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                switch (other.getParamCase()) {
                    case DETECTOR_DATA: {
                        this.mergeDetectorData(other.getDetectorData());
                        break;
                    }
                    case CLIENT_COLLECTOR_DATA: {
                        this.mergeClientCollectorData(other.getClientCollectorData());
                        break;
                    }
                    case SKY_CRYSTAL_DETECTOR_QUICK_USE_RESULT: {
                        this.mergeSkyCrystalDetectorQuickUseResult(other.getSkyCrystalDetectorQuickUseResult());
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
                QuickUseWidgetRsp parsedMessage = null;
                try {
                    parsedMessage = QuickUseWidgetRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (QuickUseWidgetRsp)e.getUnfinishedMessage();
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
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasDetectorData() {
                return this.paramCase_ == 3;
            }
            
            @Override
            public OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData getDetectorData() {
                if (this.detectorDataBuilder_ == null) {
                    if (this.paramCase_ == 3) {
                        return (OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData)this.param_;
                    }
                    return OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.getDefaultInstance();
                }
                else {
                    if (this.paramCase_ == 3) {
                        return this.detectorDataBuilder_.getMessage();
                    }
                    return OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.getDefaultInstance();
                }
            }
            
            public Builder setDetectorData(final OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData value) {
                if (this.detectorDataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.param_ = value;
                    this.onChanged();
                }
                else {
                    this.detectorDataBuilder_.setMessage(value);
                }
                this.paramCase_ = 3;
                return this;
            }
            
            public Builder setDetectorData(final OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder builderForValue) {
                if (this.detectorDataBuilder_ == null) {
                    this.param_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.detectorDataBuilder_.setMessage(builderForValue.build());
                }
                this.paramCase_ = 3;
                return this;
            }
            
            public Builder mergeDetectorData(final OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData value) {
                if (this.detectorDataBuilder_ == null) {
                    if (this.paramCase_ == 3 && this.param_ != OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.getDefaultInstance()) {
                        this.param_ = OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.newBuilder((OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData)this.param_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.param_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.paramCase_ == 3) {
                        this.detectorDataBuilder_.mergeFrom(value);
                    }
                    this.detectorDataBuilder_.setMessage(value);
                }
                this.paramCase_ = 3;
                return this;
            }
            
            public Builder clearDetectorData() {
                if (this.detectorDataBuilder_ == null) {
                    if (this.paramCase_ == 3) {
                        this.paramCase_ = 0;
                        this.param_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.paramCase_ == 3) {
                        this.paramCase_ = 0;
                        this.param_ = null;
                    }
                    this.detectorDataBuilder_.clear();
                }
                return this;
            }
            
            public OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder getDetectorDataBuilder() {
                return this.getDetectorDataFieldBuilder().getBuilder();
            }
            
            @Override
            public OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorDataOrBuilder getDetectorDataOrBuilder() {
                if (this.paramCase_ == 3 && this.detectorDataBuilder_ != null) {
                    return this.detectorDataBuilder_.getMessageOrBuilder();
                }
                if (this.paramCase_ == 3) {
                    return (OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData)this.param_;
                }
                return OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData, OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder, OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorDataOrBuilder> getDetectorDataFieldBuilder() {
                if (this.detectorDataBuilder_ == null) {
                    if (this.paramCase_ != 3) {
                        this.param_ = OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.getDefaultInstance();
                    }
                    this.detectorDataBuilder_ = new SingleFieldBuilderV3<OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData, OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder, OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorDataOrBuilder>((OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData)this.param_, this.getParentForChildren(), this.isClean());
                    this.param_ = null;
                }
                this.paramCase_ = 3;
                this.onChanged();
                return this.detectorDataBuilder_;
            }
            
            @Override
            public boolean hasClientCollectorData() {
                return this.paramCase_ == 15;
            }
            
            @Override
            public ClientCollectorDataOuterClass.ClientCollectorData getClientCollectorData() {
                if (this.clientCollectorDataBuilder_ == null) {
                    if (this.paramCase_ == 15) {
                        return (ClientCollectorDataOuterClass.ClientCollectorData)this.param_;
                    }
                    return ClientCollectorDataOuterClass.ClientCollectorData.getDefaultInstance();
                }
                else {
                    if (this.paramCase_ == 15) {
                        return this.clientCollectorDataBuilder_.getMessage();
                    }
                    return ClientCollectorDataOuterClass.ClientCollectorData.getDefaultInstance();
                }
            }
            
            public Builder setClientCollectorData(final ClientCollectorDataOuterClass.ClientCollectorData value) {
                if (this.clientCollectorDataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.param_ = value;
                    this.onChanged();
                }
                else {
                    this.clientCollectorDataBuilder_.setMessage(value);
                }
                this.paramCase_ = 15;
                return this;
            }
            
            public Builder setClientCollectorData(final ClientCollectorDataOuterClass.ClientCollectorData.Builder builderForValue) {
                if (this.clientCollectorDataBuilder_ == null) {
                    this.param_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.clientCollectorDataBuilder_.setMessage(builderForValue.build());
                }
                this.paramCase_ = 15;
                return this;
            }
            
            public Builder mergeClientCollectorData(final ClientCollectorDataOuterClass.ClientCollectorData value) {
                if (this.clientCollectorDataBuilder_ == null) {
                    if (this.paramCase_ == 15 && this.param_ != ClientCollectorDataOuterClass.ClientCollectorData.getDefaultInstance()) {
                        this.param_ = ClientCollectorDataOuterClass.ClientCollectorData.newBuilder((ClientCollectorDataOuterClass.ClientCollectorData)this.param_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.param_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.paramCase_ == 15) {
                        this.clientCollectorDataBuilder_.mergeFrom(value);
                    }
                    this.clientCollectorDataBuilder_.setMessage(value);
                }
                this.paramCase_ = 15;
                return this;
            }
            
            public Builder clearClientCollectorData() {
                if (this.clientCollectorDataBuilder_ == null) {
                    if (this.paramCase_ == 15) {
                        this.paramCase_ = 0;
                        this.param_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.paramCase_ == 15) {
                        this.paramCase_ = 0;
                        this.param_ = null;
                    }
                    this.clientCollectorDataBuilder_.clear();
                }
                return this;
            }
            
            public ClientCollectorDataOuterClass.ClientCollectorData.Builder getClientCollectorDataBuilder() {
                return this.getClientCollectorDataFieldBuilder().getBuilder();
            }
            
            @Override
            public ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder getClientCollectorDataOrBuilder() {
                if (this.paramCase_ == 15 && this.clientCollectorDataBuilder_ != null) {
                    return this.clientCollectorDataBuilder_.getMessageOrBuilder();
                }
                if (this.paramCase_ == 15) {
                    return (ClientCollectorDataOuterClass.ClientCollectorData)this.param_;
                }
                return ClientCollectorDataOuterClass.ClientCollectorData.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<ClientCollectorDataOuterClass.ClientCollectorData, ClientCollectorDataOuterClass.ClientCollectorData.Builder, ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder> getClientCollectorDataFieldBuilder() {
                if (this.clientCollectorDataBuilder_ == null) {
                    if (this.paramCase_ != 15) {
                        this.param_ = ClientCollectorDataOuterClass.ClientCollectorData.getDefaultInstance();
                    }
                    this.clientCollectorDataBuilder_ = new SingleFieldBuilderV3<ClientCollectorDataOuterClass.ClientCollectorData, ClientCollectorDataOuterClass.ClientCollectorData.Builder, ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder>((ClientCollectorDataOuterClass.ClientCollectorData)this.param_, this.getParentForChildren(), this.isClean());
                    this.param_ = null;
                }
                this.paramCase_ = 15;
                this.onChanged();
                return this.clientCollectorDataBuilder_;
            }
            
            @Override
            public boolean hasSkyCrystalDetectorQuickUseResult() {
                return this.paramCase_ == 168922;
            }
            
            @Override
            public SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult getSkyCrystalDetectorQuickUseResult() {
                if (this.skyCrystalDetectorQuickUseResultBuilder_ == null) {
                    if (this.paramCase_ == 168922) {
                        return (SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult)this.param_;
                    }
                    return SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult.getDefaultInstance();
                }
                else {
                    if (this.paramCase_ == 168922) {
                        return this.skyCrystalDetectorQuickUseResultBuilder_.getMessage();
                    }
                    return SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult.getDefaultInstance();
                }
            }
            
            public Builder setSkyCrystalDetectorQuickUseResult(final SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult value) {
                if (this.skyCrystalDetectorQuickUseResultBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.param_ = value;
                    this.onChanged();
                }
                else {
                    this.skyCrystalDetectorQuickUseResultBuilder_.setMessage(value);
                }
                this.paramCase_ = 168922;
                return this;
            }
            
            public Builder setSkyCrystalDetectorQuickUseResult(final SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult.Builder builderForValue) {
                if (this.skyCrystalDetectorQuickUseResultBuilder_ == null) {
                    this.param_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.skyCrystalDetectorQuickUseResultBuilder_.setMessage(builderForValue.build());
                }
                this.paramCase_ = 168922;
                return this;
            }
            
            public Builder mergeSkyCrystalDetectorQuickUseResult(final SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult value) {
                if (this.skyCrystalDetectorQuickUseResultBuilder_ == null) {
                    if (this.paramCase_ == 168922 && this.param_ != SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult.getDefaultInstance()) {
                        this.param_ = SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult.newBuilder((SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult)this.param_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.param_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.paramCase_ == 168922) {
                        this.skyCrystalDetectorQuickUseResultBuilder_.mergeFrom(value);
                    }
                    this.skyCrystalDetectorQuickUseResultBuilder_.setMessage(value);
                }
                this.paramCase_ = 168922;
                return this;
            }
            
            public Builder clearSkyCrystalDetectorQuickUseResult() {
                if (this.skyCrystalDetectorQuickUseResultBuilder_ == null) {
                    if (this.paramCase_ == 168922) {
                        this.paramCase_ = 0;
                        this.param_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.paramCase_ == 168922) {
                        this.paramCase_ = 0;
                        this.param_ = null;
                    }
                    this.skyCrystalDetectorQuickUseResultBuilder_.clear();
                }
                return this;
            }
            
            public SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult.Builder getSkyCrystalDetectorQuickUseResultBuilder() {
                return this.getSkyCrystalDetectorQuickUseResultFieldBuilder().getBuilder();
            }
            
            @Override
            public SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResultOrBuilder getSkyCrystalDetectorQuickUseResultOrBuilder() {
                if (this.paramCase_ == 168922 && this.skyCrystalDetectorQuickUseResultBuilder_ != null) {
                    return this.skyCrystalDetectorQuickUseResultBuilder_.getMessageOrBuilder();
                }
                if (this.paramCase_ == 168922) {
                    return (SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult)this.param_;
                }
                return SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult, SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult.Builder, SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResultOrBuilder> getSkyCrystalDetectorQuickUseResultFieldBuilder() {
                if (this.skyCrystalDetectorQuickUseResultBuilder_ == null) {
                    if (this.paramCase_ != 168922) {
                        this.param_ = SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult.getDefaultInstance();
                    }
                    this.skyCrystalDetectorQuickUseResultBuilder_ = new SingleFieldBuilderV3<SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult, SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult.Builder, SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResultOrBuilder>((SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult)this.param_, this.getParentForChildren(), this.isClean());
                    this.param_ = null;
                }
                this.paramCase_ = 168922;
                this.onChanged();
                return this.skyCrystalDetectorQuickUseResultBuilder_;
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
    
    public interface QuickUseWidgetRspOrBuilder extends MessageOrBuilder
    {
        int getMaterialId();
        
        int getRetcode();
        
        boolean hasDetectorData();
        
        OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData getDetectorData();
        
        OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorDataOrBuilder getDetectorDataOrBuilder();
        
        boolean hasClientCollectorData();
        
        ClientCollectorDataOuterClass.ClientCollectorData getClientCollectorData();
        
        ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder getClientCollectorDataOrBuilder();
        
        boolean hasSkyCrystalDetectorQuickUseResult();
        
        SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResult getSkyCrystalDetectorQuickUseResult();
        
        SkyCrystalDetectorQuickUseResultOuterClass.SkyCrystalDetectorQuickUseResultOrBuilder getSkyCrystalDetectorQuickUseResultOrBuilder();
        
        QuickUseWidgetRsp.ParamCase getParamCase();
    }
}
