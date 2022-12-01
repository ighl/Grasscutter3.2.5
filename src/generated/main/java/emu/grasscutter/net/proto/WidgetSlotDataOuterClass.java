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

public final class WidgetSlotDataOuterClass
{
    private static final Descriptors.Descriptor internal_static_WidgetSlotData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WidgetSlotData_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WidgetSlotDataOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WidgetSlotDataOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0014WidgetSlotData.proto\u001a\u0013WidgetSlotTag.proto\"k\n\u000eWidgetSlotData\u0012\u0014\n\fcd_over_time\u0018\t \u0001(\r\u0012\u001b\n\u0003tag\u0018\u000e \u0001(\u000e2\u000e.WidgetSlotTag\u0012\u0013\n\u000bmaterial_id\u0018\u000b \u0001(\r\u0012\u0011\n\tis_active\u0018\f \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WidgetSlotDataOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { WidgetSlotTagOuterClass.getDescriptor() });
        internal_static_WidgetSlotData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WidgetSlotData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WidgetSlotDataOuterClass.internal_static_WidgetSlotData_descriptor, new String[] { "CdOverTime", "Tag", "MaterialId", "IsActive" });
        WidgetSlotTagOuterClass.getDescriptor();
    }
    
    public static final class WidgetSlotData extends GeneratedMessageV3 implements WidgetSlotDataOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CD_OVER_TIME_FIELD_NUMBER = 9;
        private int cdOverTime_;
        public static final int TAG_FIELD_NUMBER = 14;
        private int tag_;
        public static final int MATERIAL_ID_FIELD_NUMBER = 11;
        private int materialId_;
        public static final int IS_ACTIVE_FIELD_NUMBER = 12;
        private boolean isActive_;
        private byte memoizedIsInitialized;
        private static final WidgetSlotData DEFAULT_INSTANCE;
        private static final Parser<WidgetSlotData> PARSER;
        
        private WidgetSlotData(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private WidgetSlotData() {
            this.memoizedIsInitialized = -1;
            this.tag_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WidgetSlotData();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WidgetSlotData(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.cdOverTime_ = input.readUInt32();
                            continue;
                        }
                        case 88: {
                            this.materialId_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
                            this.isActive_ = input.readBool();
                            continue;
                        }
                        case 112: {
                            final int rawValue = input.readEnum();
                            this.tag_ = rawValue;
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
            return WidgetSlotDataOuterClass.internal_static_WidgetSlotData_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WidgetSlotDataOuterClass.internal_static_WidgetSlotData_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetSlotData.class, Builder.class);
        }
        
        @Override
        public int getCdOverTime() {
            return this.cdOverTime_;
        }
        
        @Override
        public int getTagValue() {
            return this.tag_;
        }
        
        @Override
        public WidgetSlotTagOuterClass.WidgetSlotTag getTag() {
            final WidgetSlotTagOuterClass.WidgetSlotTag result = WidgetSlotTagOuterClass.WidgetSlotTag.valueOf(this.tag_);
            return (result == null) ? WidgetSlotTagOuterClass.WidgetSlotTag.UNRECOGNIZED : result;
        }
        
        @Override
        public int getMaterialId() {
            return this.materialId_;
        }
        
        @Override
        public boolean getIsActive() {
            return this.isActive_;
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
            if (this.cdOverTime_ != 0) {
                output.writeUInt32(9, this.cdOverTime_);
            }
            if (this.materialId_ != 0) {
                output.writeUInt32(11, this.materialId_);
            }
            if (this.isActive_) {
                output.writeBool(12, this.isActive_);
            }
            if (this.tag_ != WidgetSlotTagOuterClass.WidgetSlotTag.WIDGET_SLOT_TAG_QUICK_USE.getNumber()) {
                output.writeEnum(14, this.tag_);
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
            if (this.cdOverTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.cdOverTime_);
            }
            if (this.materialId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.materialId_);
            }
            if (this.isActive_) {
                size += CodedOutputStream.computeBoolSize(12, this.isActive_);
            }
            if (this.tag_ != WidgetSlotTagOuterClass.WidgetSlotTag.WIDGET_SLOT_TAG_QUICK_USE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(14, this.tag_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WidgetSlotData)) {
                return super.equals(obj);
            }
            final WidgetSlotData other = (WidgetSlotData)obj;
            return this.getCdOverTime() == other.getCdOverTime() && this.tag_ == other.tag_ && this.getMaterialId() == other.getMaterialId() && this.getIsActive() == other.getIsActive() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getCdOverTime();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.tag_;
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getMaterialId();
            hash = 37 * hash + 12;
            hash = 53 * hash + Internal.hashBoolean(this.getIsActive());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WidgetSlotData parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WidgetSlotData.PARSER.parseFrom(data);
        }
        
        public static WidgetSlotData parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetSlotData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetSlotData parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WidgetSlotData.PARSER.parseFrom(data);
        }
        
        public static WidgetSlotData parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetSlotData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetSlotData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WidgetSlotData.PARSER.parseFrom(data);
        }
        
        public static WidgetSlotData parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetSlotData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetSlotData parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetSlotData.PARSER, input);
        }
        
        public static WidgetSlotData parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetSlotData.PARSER, input, extensionRegistry);
        }
        
        public static WidgetSlotData parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetSlotData.PARSER, input);
        }
        
        public static WidgetSlotData parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetSlotData.PARSER, input, extensionRegistry);
        }
        
        public static WidgetSlotData parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetSlotData.PARSER, input);
        }
        
        public static WidgetSlotData parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetSlotData.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WidgetSlotData.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WidgetSlotData prototype) {
            return WidgetSlotData.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WidgetSlotData.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WidgetSlotData getDefaultInstance() {
            return WidgetSlotData.DEFAULT_INSTANCE;
        }
        
        public static Parser<WidgetSlotData> parser() {
            return WidgetSlotData.PARSER;
        }
        
        @Override
        public Parser<WidgetSlotData> getParserForType() {
            return WidgetSlotData.PARSER;
        }
        
        @Override
        public WidgetSlotData getDefaultInstanceForType() {
            return WidgetSlotData.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WidgetSlotData();
            PARSER = new AbstractParser<WidgetSlotData>() {
                @Override
                public WidgetSlotData parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WidgetSlotData(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WidgetSlotDataOrBuilder
        {
            private int cdOverTime_;
            private int tag_;
            private int materialId_;
            private boolean isActive_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WidgetSlotDataOuterClass.internal_static_WidgetSlotData_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WidgetSlotDataOuterClass.internal_static_WidgetSlotData_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetSlotData.class, Builder.class);
            }
            
            private Builder() {
                this.tag_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.tag_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (WidgetSlotData.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.cdOverTime_ = 0;
                this.tag_ = 0;
                this.materialId_ = 0;
                this.isActive_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WidgetSlotDataOuterClass.internal_static_WidgetSlotData_descriptor;
            }
            
            @Override
            public WidgetSlotData getDefaultInstanceForType() {
                return WidgetSlotData.getDefaultInstance();
            }
            
            @Override
            public WidgetSlotData build() {
                final WidgetSlotData result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WidgetSlotData buildPartial() {
                final WidgetSlotData result = new WidgetSlotData(this);
                result.cdOverTime_ = this.cdOverTime_;
                result.tag_ = this.tag_;
                result.materialId_ = this.materialId_;
                result.isActive_ = this.isActive_;
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
                if (other instanceof WidgetSlotData) {
                    return this.mergeFrom((WidgetSlotData)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WidgetSlotData other) {
                if (other == WidgetSlotData.getDefaultInstance()) {
                    return this;
                }
                if (other.getCdOverTime() != 0) {
                    this.setCdOverTime(other.getCdOverTime());
                }
                if (other.tag_ != 0) {
                    this.setTagValue(other.getTagValue());
                }
                if (other.getMaterialId() != 0) {
                    this.setMaterialId(other.getMaterialId());
                }
                if (other.getIsActive()) {
                    this.setIsActive(other.getIsActive());
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
                WidgetSlotData parsedMessage = null;
                try {
                    parsedMessage = WidgetSlotData.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WidgetSlotData)e.getUnfinishedMessage();
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
            public int getCdOverTime() {
                return this.cdOverTime_;
            }
            
            public Builder setCdOverTime(final int value) {
                this.cdOverTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCdOverTime() {
                this.cdOverTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getTagValue() {
                return this.tag_;
            }
            
            public Builder setTagValue(final int value) {
                this.tag_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public WidgetSlotTagOuterClass.WidgetSlotTag getTag() {
                final WidgetSlotTagOuterClass.WidgetSlotTag result = WidgetSlotTagOuterClass.WidgetSlotTag.valueOf(this.tag_);
                return (result == null) ? WidgetSlotTagOuterClass.WidgetSlotTag.UNRECOGNIZED : result;
            }
            
            public Builder setTag(final WidgetSlotTagOuterClass.WidgetSlotTag value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.tag_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearTag() {
                this.tag_ = 0;
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface WidgetSlotDataOrBuilder extends MessageOrBuilder
    {
        int getCdOverTime();
        
        int getTagValue();
        
        WidgetSlotTagOuterClass.WidgetSlotTag getTag();
        
        int getMaterialId();
        
        boolean getIsActive();
    }
}
