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

public final class MailItemOuterClass
{
    private static final Descriptors.Descriptor internal_static_MailItem_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MailItem_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MailItemOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MailItemOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u000eMailItem.proto\u001a\u0010EquipParam.proto\u001a\u0018MaterialDeleteInfo.proto\"V\n\bMailItem\u0012 \n\u000bequip_param\u0018\u0001 \u0001(\u000b2\u000b.EquipParam\u0012(\n\u000bdelete_info\u0018\u0002 \u0001(\u000b2\u0013.MaterialDeleteInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MailItemOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { EquipParamOuterClass.getDescriptor(), MaterialDeleteInfoOuterClass.getDescriptor() });
        internal_static_MailItem_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MailItem_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MailItemOuterClass.internal_static_MailItem_descriptor, new String[] { "EquipParam", "DeleteInfo" });
        EquipParamOuterClass.getDescriptor();
        MaterialDeleteInfoOuterClass.getDescriptor();
    }
    
    public static final class MailItem extends GeneratedMessageV3 implements MailItemOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int EQUIP_PARAM_FIELD_NUMBER = 1;
        private EquipParamOuterClass.EquipParam equipParam_;
        public static final int DELETE_INFO_FIELD_NUMBER = 2;
        private MaterialDeleteInfoOuterClass.MaterialDeleteInfo deleteInfo_;
        private byte memoizedIsInitialized;
        private static final MailItem DEFAULT_INSTANCE;
        private static final Parser<MailItem> PARSER;
        
        private MailItem(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private MailItem() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MailItem();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MailItem(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 10: {
                            EquipParamOuterClass.EquipParam.Builder subBuilder = null;
                            if (this.equipParam_ != null) {
                                subBuilder = this.equipParam_.toBuilder();
                            }
                            this.equipParam_ = input.readMessage(EquipParamOuterClass.EquipParam.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.equipParam_);
                                this.equipParam_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 18: {
                            MaterialDeleteInfoOuterClass.MaterialDeleteInfo.Builder subBuilder2 = null;
                            if (this.deleteInfo_ != null) {
                                subBuilder2 = this.deleteInfo_.toBuilder();
                            }
                            this.deleteInfo_ = input.readMessage(MaterialDeleteInfoOuterClass.MaterialDeleteInfo.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom(this.deleteInfo_);
                                this.deleteInfo_ = subBuilder2.buildPartial();
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
            return MailItemOuterClass.internal_static_MailItem_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MailItemOuterClass.internal_static_MailItem_fieldAccessorTable.ensureFieldAccessorsInitialized(MailItem.class, Builder.class);
        }
        
        @Override
        public boolean hasEquipParam() {
            return this.equipParam_ != null;
        }
        
        @Override
        public EquipParamOuterClass.EquipParam getEquipParam() {
            return (this.equipParam_ == null) ? EquipParamOuterClass.EquipParam.getDefaultInstance() : this.equipParam_;
        }
        
        @Override
        public EquipParamOuterClass.EquipParamOrBuilder getEquipParamOrBuilder() {
            return this.getEquipParam();
        }
        
        @Override
        public boolean hasDeleteInfo() {
            return this.deleteInfo_ != null;
        }
        
        @Override
        public MaterialDeleteInfoOuterClass.MaterialDeleteInfo getDeleteInfo() {
            return (this.deleteInfo_ == null) ? MaterialDeleteInfoOuterClass.MaterialDeleteInfo.getDefaultInstance() : this.deleteInfo_;
        }
        
        @Override
        public MaterialDeleteInfoOuterClass.MaterialDeleteInfoOrBuilder getDeleteInfoOrBuilder() {
            return this.getDeleteInfo();
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
            if (this.equipParam_ != null) {
                output.writeMessage(1, this.getEquipParam());
            }
            if (this.deleteInfo_ != null) {
                output.writeMessage(2, this.getDeleteInfo());
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
            if (this.equipParam_ != null) {
                size += CodedOutputStream.computeMessageSize(1, this.getEquipParam());
            }
            if (this.deleteInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(2, this.getDeleteInfo());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MailItem)) {
                return super.equals(obj);
            }
            final MailItem other = (MailItem)obj;
            return this.hasEquipParam() == other.hasEquipParam() && (!this.hasEquipParam() || this.getEquipParam().equals(other.getEquipParam())) && this.hasDeleteInfo() == other.hasDeleteInfo() && (!this.hasDeleteInfo() || this.getDeleteInfo().equals(other.getDeleteInfo())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasEquipParam()) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getEquipParam().hashCode();
            }
            if (this.hasDeleteInfo()) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getDeleteInfo().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MailItem parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MailItem.PARSER.parseFrom(data);
        }
        
        public static MailItem parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MailItem.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MailItem parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MailItem.PARSER.parseFrom(data);
        }
        
        public static MailItem parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MailItem.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MailItem parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MailItem.PARSER.parseFrom(data);
        }
        
        public static MailItem parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MailItem.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MailItem parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MailItem.PARSER, input);
        }
        
        public static MailItem parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MailItem.PARSER, input, extensionRegistry);
        }
        
        public static MailItem parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MailItem.PARSER, input);
        }
        
        public static MailItem parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MailItem.PARSER, input, extensionRegistry);
        }
        
        public static MailItem parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MailItem.PARSER, input);
        }
        
        public static MailItem parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MailItem.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MailItem.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MailItem prototype) {
            return MailItem.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MailItem.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MailItem getDefaultInstance() {
            return MailItem.DEFAULT_INSTANCE;
        }
        
        public static Parser<MailItem> parser() {
            return MailItem.PARSER;
        }
        
        @Override
        public Parser<MailItem> getParserForType() {
            return MailItem.PARSER;
        }
        
        @Override
        public MailItem getDefaultInstanceForType() {
            return MailItem.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MailItem();
            PARSER = new AbstractParser<MailItem>() {
                @Override
                public MailItem parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MailItem(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MailItemOrBuilder
        {
            private EquipParamOuterClass.EquipParam equipParam_;
            private SingleFieldBuilderV3<EquipParamOuterClass.EquipParam, EquipParamOuterClass.EquipParam.Builder, EquipParamOuterClass.EquipParamOrBuilder> equipParamBuilder_;
            private MaterialDeleteInfoOuterClass.MaterialDeleteInfo deleteInfo_;
            private SingleFieldBuilderV3<MaterialDeleteInfoOuterClass.MaterialDeleteInfo, MaterialDeleteInfoOuterClass.MaterialDeleteInfo.Builder, MaterialDeleteInfoOuterClass.MaterialDeleteInfoOrBuilder> deleteInfoBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MailItemOuterClass.internal_static_MailItem_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MailItemOuterClass.internal_static_MailItem_fieldAccessorTable.ensureFieldAccessorsInitialized(MailItem.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MailItem.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.equipParamBuilder_ == null) {
                    this.equipParam_ = null;
                }
                else {
                    this.equipParam_ = null;
                    this.equipParamBuilder_ = null;
                }
                if (this.deleteInfoBuilder_ == null) {
                    this.deleteInfo_ = null;
                }
                else {
                    this.deleteInfo_ = null;
                    this.deleteInfoBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MailItemOuterClass.internal_static_MailItem_descriptor;
            }
            
            @Override
            public MailItem getDefaultInstanceForType() {
                return MailItem.getDefaultInstance();
            }
            
            @Override
            public MailItem build() {
                final MailItem result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MailItem buildPartial() {
                final MailItem result = new MailItem(this);
                if (this.equipParamBuilder_ == null) {
                    result.equipParam_ = this.equipParam_;
                }
                else {
                    result.equipParam_ = this.equipParamBuilder_.build();
                }
                if (this.deleteInfoBuilder_ == null) {
                    result.deleteInfo_ = this.deleteInfo_;
                }
                else {
                    result.deleteInfo_ = this.deleteInfoBuilder_.build();
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
                if (other instanceof MailItem) {
                    return this.mergeFrom((MailItem)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MailItem other) {
                if (other == MailItem.getDefaultInstance()) {
                    return this;
                }
                if (other.hasEquipParam()) {
                    this.mergeEquipParam(other.getEquipParam());
                }
                if (other.hasDeleteInfo()) {
                    this.mergeDeleteInfo(other.getDeleteInfo());
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
                MailItem parsedMessage = null;
                try {
                    parsedMessage = MailItem.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MailItem)e.getUnfinishedMessage();
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
            public boolean hasEquipParam() {
                return this.equipParamBuilder_ != null || this.equipParam_ != null;
            }
            
            @Override
            public EquipParamOuterClass.EquipParam getEquipParam() {
                if (this.equipParamBuilder_ == null) {
                    return (this.equipParam_ == null) ? EquipParamOuterClass.EquipParam.getDefaultInstance() : this.equipParam_;
                }
                return this.equipParamBuilder_.getMessage();
            }
            
            public Builder setEquipParam(final EquipParamOuterClass.EquipParam value) {
                if (this.equipParamBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.equipParam_ = value;
                    this.onChanged();
                }
                else {
                    this.equipParamBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setEquipParam(final EquipParamOuterClass.EquipParam.Builder builderForValue) {
                if (this.equipParamBuilder_ == null) {
                    this.equipParam_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.equipParamBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeEquipParam(final EquipParamOuterClass.EquipParam value) {
                if (this.equipParamBuilder_ == null) {
                    if (this.equipParam_ != null) {
                        this.equipParam_ = EquipParamOuterClass.EquipParam.newBuilder(this.equipParam_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.equipParam_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.equipParamBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearEquipParam() {
                if (this.equipParamBuilder_ == null) {
                    this.equipParam_ = null;
                    this.onChanged();
                }
                else {
                    this.equipParam_ = null;
                    this.equipParamBuilder_ = null;
                }
                return this;
            }
            
            public EquipParamOuterClass.EquipParam.Builder getEquipParamBuilder() {
                this.onChanged();
                return this.getEquipParamFieldBuilder().getBuilder();
            }
            
            @Override
            public EquipParamOuterClass.EquipParamOrBuilder getEquipParamOrBuilder() {
                if (this.equipParamBuilder_ != null) {
                    return this.equipParamBuilder_.getMessageOrBuilder();
                }
                return (this.equipParam_ == null) ? EquipParamOuterClass.EquipParam.getDefaultInstance() : this.equipParam_;
            }
            
            private SingleFieldBuilderV3<EquipParamOuterClass.EquipParam, EquipParamOuterClass.EquipParam.Builder, EquipParamOuterClass.EquipParamOrBuilder> getEquipParamFieldBuilder() {
                if (this.equipParamBuilder_ == null) {
                    this.equipParamBuilder_ = new SingleFieldBuilderV3<EquipParamOuterClass.EquipParam, EquipParamOuterClass.EquipParam.Builder, EquipParamOuterClass.EquipParamOrBuilder>(this.getEquipParam(), this.getParentForChildren(), this.isClean());
                    this.equipParam_ = null;
                }
                return this.equipParamBuilder_;
            }
            
            @Override
            public boolean hasDeleteInfo() {
                return this.deleteInfoBuilder_ != null || this.deleteInfo_ != null;
            }
            
            @Override
            public MaterialDeleteInfoOuterClass.MaterialDeleteInfo getDeleteInfo() {
                if (this.deleteInfoBuilder_ == null) {
                    return (this.deleteInfo_ == null) ? MaterialDeleteInfoOuterClass.MaterialDeleteInfo.getDefaultInstance() : this.deleteInfo_;
                }
                return this.deleteInfoBuilder_.getMessage();
            }
            
            public Builder setDeleteInfo(final MaterialDeleteInfoOuterClass.MaterialDeleteInfo value) {
                if (this.deleteInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.deleteInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.deleteInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setDeleteInfo(final MaterialDeleteInfoOuterClass.MaterialDeleteInfo.Builder builderForValue) {
                if (this.deleteInfoBuilder_ == null) {
                    this.deleteInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.deleteInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeDeleteInfo(final MaterialDeleteInfoOuterClass.MaterialDeleteInfo value) {
                if (this.deleteInfoBuilder_ == null) {
                    if (this.deleteInfo_ != null) {
                        this.deleteInfo_ = MaterialDeleteInfoOuterClass.MaterialDeleteInfo.newBuilder(this.deleteInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.deleteInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.deleteInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearDeleteInfo() {
                if (this.deleteInfoBuilder_ == null) {
                    this.deleteInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.deleteInfo_ = null;
                    this.deleteInfoBuilder_ = null;
                }
                return this;
            }
            
            public MaterialDeleteInfoOuterClass.MaterialDeleteInfo.Builder getDeleteInfoBuilder() {
                this.onChanged();
                return this.getDeleteInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public MaterialDeleteInfoOuterClass.MaterialDeleteInfoOrBuilder getDeleteInfoOrBuilder() {
                if (this.deleteInfoBuilder_ != null) {
                    return this.deleteInfoBuilder_.getMessageOrBuilder();
                }
                return (this.deleteInfo_ == null) ? MaterialDeleteInfoOuterClass.MaterialDeleteInfo.getDefaultInstance() : this.deleteInfo_;
            }
            
            private SingleFieldBuilderV3<MaterialDeleteInfoOuterClass.MaterialDeleteInfo, MaterialDeleteInfoOuterClass.MaterialDeleteInfo.Builder, MaterialDeleteInfoOuterClass.MaterialDeleteInfoOrBuilder> getDeleteInfoFieldBuilder() {
                if (this.deleteInfoBuilder_ == null) {
                    this.deleteInfoBuilder_ = new SingleFieldBuilderV3<MaterialDeleteInfoOuterClass.MaterialDeleteInfo, MaterialDeleteInfoOuterClass.MaterialDeleteInfo.Builder, MaterialDeleteInfoOuterClass.MaterialDeleteInfoOrBuilder>(this.getDeleteInfo(), this.getParentForChildren(), this.isClean());
                    this.deleteInfo_ = null;
                }
                return this.deleteInfoBuilder_;
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
    
    public interface MailItemOrBuilder extends MessageOrBuilder
    {
        boolean hasEquipParam();
        
        EquipParamOuterClass.EquipParam getEquipParam();
        
        EquipParamOuterClass.EquipParamOrBuilder getEquipParamOrBuilder();
        
        boolean hasDeleteInfo();
        
        MaterialDeleteInfoOuterClass.MaterialDeleteInfo getDeleteInfo();
        
        MaterialDeleteInfoOuterClass.MaterialDeleteInfoOrBuilder getDeleteInfoOrBuilder();
    }
}
