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

public final class WidgetReportReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_WidgetReportReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WidgetReportReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WidgetReportReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WidgetReportReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015WidgetReportReq.proto\"u\n\u000fWidgetReportReq\u0012\u001b\n\u0013Unk2700_MFEHMLBNNAG\u0018\u0005 \u0001(\b\u0012\u0019\n\u0011is_client_collect\u0018\u000e \u0001(\b\u0012\u0015\n\ris_clear_hint\u0018\r \u0001(\b\u0012\u0013\n\u000bmaterial_id\u0018\u000f \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WidgetReportReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_WidgetReportReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WidgetReportReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WidgetReportReqOuterClass.internal_static_WidgetReportReq_descriptor, new String[] { "Unk2700MFEHMLBNNAG", "IsClientCollect", "IsClearHint", "MaterialId" });
    }
    
    public static final class WidgetReportReq extends GeneratedMessageV3 implements WidgetReportReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int UNK2700_MFEHMLBNNAG_FIELD_NUMBER = 5;
        private boolean unk2700MFEHMLBNNAG_;
        public static final int IS_CLIENT_COLLECT_FIELD_NUMBER = 14;
        private boolean isClientCollect_;
        public static final int IS_CLEAR_HINT_FIELD_NUMBER = 13;
        private boolean isClearHint_;
        public static final int MATERIAL_ID_FIELD_NUMBER = 15;
        private int materialId_;
        private byte memoizedIsInitialized;
        private static final WidgetReportReq DEFAULT_INSTANCE;
        private static final Parser<WidgetReportReq> PARSER;
        
        private WidgetReportReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private WidgetReportReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WidgetReportReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WidgetReportReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 40: {
                            this.unk2700MFEHMLBNNAG_ = input.readBool();
                            continue;
                        }
                        case 104: {
                            this.isClearHint_ = input.readBool();
                            continue;
                        }
                        case 112: {
                            this.isClientCollect_ = input.readBool();
                            continue;
                        }
                        case 120: {
                            this.materialId_ = input.readUInt32();
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
            return WidgetReportReqOuterClass.internal_static_WidgetReportReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WidgetReportReqOuterClass.internal_static_WidgetReportReq_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetReportReq.class, Builder.class);
        }
        
        @Override
        public boolean getUnk2700MFEHMLBNNAG() {
            return this.unk2700MFEHMLBNNAG_;
        }
        
        @Override
        public boolean getIsClientCollect() {
            return this.isClientCollect_;
        }
        
        @Override
        public boolean getIsClearHint() {
            return this.isClearHint_;
        }
        
        @Override
        public int getMaterialId() {
            return this.materialId_;
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
            if (this.unk2700MFEHMLBNNAG_) {
                output.writeBool(5, this.unk2700MFEHMLBNNAG_);
            }
            if (this.isClearHint_) {
                output.writeBool(13, this.isClearHint_);
            }
            if (this.isClientCollect_) {
                output.writeBool(14, this.isClientCollect_);
            }
            if (this.materialId_ != 0) {
                output.writeUInt32(15, this.materialId_);
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
            if (this.unk2700MFEHMLBNNAG_) {
                size += CodedOutputStream.computeBoolSize(5, this.unk2700MFEHMLBNNAG_);
            }
            if (this.isClearHint_) {
                size += CodedOutputStream.computeBoolSize(13, this.isClearHint_);
            }
            if (this.isClientCollect_) {
                size += CodedOutputStream.computeBoolSize(14, this.isClientCollect_);
            }
            if (this.materialId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.materialId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WidgetReportReq)) {
                return super.equals(obj);
            }
            final WidgetReportReq other = (WidgetReportReq)obj;
            return this.getUnk2700MFEHMLBNNAG() == other.getUnk2700MFEHMLBNNAG() && this.getIsClientCollect() == other.getIsClientCollect() && this.getIsClearHint() == other.getIsClearHint() && this.getMaterialId() == other.getMaterialId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 5;
            hash = 53 * hash + Internal.hashBoolean(this.getUnk2700MFEHMLBNNAG());
            hash = 37 * hash + 14;
            hash = 53 * hash + Internal.hashBoolean(this.getIsClientCollect());
            hash = 37 * hash + 13;
            hash = 53 * hash + Internal.hashBoolean(this.getIsClearHint());
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getMaterialId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WidgetReportReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WidgetReportReq.PARSER.parseFrom(data);
        }
        
        public static WidgetReportReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetReportReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetReportReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WidgetReportReq.PARSER.parseFrom(data);
        }
        
        public static WidgetReportReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetReportReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetReportReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WidgetReportReq.PARSER.parseFrom(data);
        }
        
        public static WidgetReportReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetReportReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetReportReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetReportReq.PARSER, input);
        }
        
        public static WidgetReportReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetReportReq.PARSER, input, extensionRegistry);
        }
        
        public static WidgetReportReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetReportReq.PARSER, input);
        }
        
        public static WidgetReportReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetReportReq.PARSER, input, extensionRegistry);
        }
        
        public static WidgetReportReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetReportReq.PARSER, input);
        }
        
        public static WidgetReportReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetReportReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WidgetReportReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WidgetReportReq prototype) {
            return WidgetReportReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WidgetReportReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WidgetReportReq getDefaultInstance() {
            return WidgetReportReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<WidgetReportReq> parser() {
            return WidgetReportReq.PARSER;
        }
        
        @Override
        public Parser<WidgetReportReq> getParserForType() {
            return WidgetReportReq.PARSER;
        }
        
        @Override
        public WidgetReportReq getDefaultInstanceForType() {
            return WidgetReportReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WidgetReportReq();
            PARSER = new AbstractParser<WidgetReportReq>() {
                @Override
                public WidgetReportReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WidgetReportReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WidgetReportReqOrBuilder
        {
            private boolean unk2700MFEHMLBNNAG_;
            private boolean isClientCollect_;
            private boolean isClearHint_;
            private int materialId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WidgetReportReqOuterClass.internal_static_WidgetReportReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WidgetReportReqOuterClass.internal_static_WidgetReportReq_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetReportReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (WidgetReportReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.unk2700MFEHMLBNNAG_ = false;
                this.isClientCollect_ = false;
                this.isClearHint_ = false;
                this.materialId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WidgetReportReqOuterClass.internal_static_WidgetReportReq_descriptor;
            }
            
            @Override
            public WidgetReportReq getDefaultInstanceForType() {
                return WidgetReportReq.getDefaultInstance();
            }
            
            @Override
            public WidgetReportReq build() {
                final WidgetReportReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WidgetReportReq buildPartial() {
                final WidgetReportReq result = new WidgetReportReq(this);
                result.unk2700MFEHMLBNNAG_ = this.unk2700MFEHMLBNNAG_;
                result.isClientCollect_ = this.isClientCollect_;
                result.isClearHint_ = this.isClearHint_;
                result.materialId_ = this.materialId_;
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
                if (other instanceof WidgetReportReq) {
                    return this.mergeFrom((WidgetReportReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WidgetReportReq other) {
                if (other == WidgetReportReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getUnk2700MFEHMLBNNAG()) {
                    this.setUnk2700MFEHMLBNNAG(other.getUnk2700MFEHMLBNNAG());
                }
                if (other.getIsClientCollect()) {
                    this.setIsClientCollect(other.getIsClientCollect());
                }
                if (other.getIsClearHint()) {
                    this.setIsClearHint(other.getIsClearHint());
                }
                if (other.getMaterialId() != 0) {
                    this.setMaterialId(other.getMaterialId());
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
                WidgetReportReq parsedMessage = null;
                try {
                    parsedMessage = WidgetReportReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WidgetReportReq)e.getUnfinishedMessage();
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
            public boolean getUnk2700MFEHMLBNNAG() {
                return this.unk2700MFEHMLBNNAG_;
            }
            
            public Builder setUnk2700MFEHMLBNNAG(final boolean value) {
                this.unk2700MFEHMLBNNAG_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700MFEHMLBNNAG() {
                this.unk2700MFEHMLBNNAG_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsClientCollect() {
                return this.isClientCollect_;
            }
            
            public Builder setIsClientCollect(final boolean value) {
                this.isClientCollect_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsClientCollect() {
                this.isClientCollect_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsClearHint() {
                return this.isClearHint_;
            }
            
            public Builder setIsClearHint(final boolean value) {
                this.isClearHint_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsClearHint() {
                this.isClearHint_ = false;
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface WidgetReportReqOrBuilder extends MessageOrBuilder
    {
        boolean getUnk2700MFEHMLBNNAG();
        
        boolean getIsClientCollect();
        
        boolean getIsClearHint();
        
        int getMaterialId();
    }
}
