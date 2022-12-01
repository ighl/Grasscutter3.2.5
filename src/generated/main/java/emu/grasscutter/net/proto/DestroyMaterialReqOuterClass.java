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

public final class DestroyMaterialReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_DestroyMaterialReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_DestroyMaterialReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private DestroyMaterialReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return DestroyMaterialReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018DestroyMaterialReq.proto\u001a\u0012MaterialInfo.proto\":\n\u0012DestroyMaterialReq\u0012$\n\rmaterial_list\u0018\u0005 \u0003(\u000b2\r.MaterialInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        DestroyMaterialReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { MaterialInfoOuterClass.getDescriptor() });
        internal_static_DestroyMaterialReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_DestroyMaterialReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(DestroyMaterialReqOuterClass.internal_static_DestroyMaterialReq_descriptor, new String[] { "MaterialList" });
        MaterialInfoOuterClass.getDescriptor();
    }
    
    public static final class DestroyMaterialReq extends GeneratedMessageV3 implements DestroyMaterialReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int MATERIAL_LIST_FIELD_NUMBER = 5;
        private List<MaterialInfoOuterClass.MaterialInfo> materialList_;
        private byte memoizedIsInitialized;
        private static final DestroyMaterialReq DEFAULT_INSTANCE;
        private static final Parser<DestroyMaterialReq> PARSER;
        
        private DestroyMaterialReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private DestroyMaterialReq() {
            this.memoizedIsInitialized = -1;
            this.materialList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new DestroyMaterialReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private DestroyMaterialReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 42: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.materialList_ = new ArrayList<MaterialInfoOuterClass.MaterialInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.materialList_.add(input.readMessage(MaterialInfoOuterClass.MaterialInfo.parser(), extensionRegistry));
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
                    this.materialList_ = Collections.unmodifiableList((List<? extends MaterialInfoOuterClass.MaterialInfo>)this.materialList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return DestroyMaterialReqOuterClass.internal_static_DestroyMaterialReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return DestroyMaterialReqOuterClass.internal_static_DestroyMaterialReq_fieldAccessorTable.ensureFieldAccessorsInitialized(DestroyMaterialReq.class, Builder.class);
        }
        
        @Override
        public List<MaterialInfoOuterClass.MaterialInfo> getMaterialListList() {
            return this.materialList_;
        }
        
        @Override
        public List<? extends MaterialInfoOuterClass.MaterialInfoOrBuilder> getMaterialListOrBuilderList() {
            return this.materialList_;
        }
        
        @Override
        public int getMaterialListCount() {
            return this.materialList_.size();
        }
        
        @Override
        public MaterialInfoOuterClass.MaterialInfo getMaterialList(final int index) {
            return this.materialList_.get(index);
        }
        
        @Override
        public MaterialInfoOuterClass.MaterialInfoOrBuilder getMaterialListOrBuilder(final int index) {
            return this.materialList_.get(index);
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
            for (int i = 0; i < this.materialList_.size(); ++i) {
                output.writeMessage(5, this.materialList_.get(i));
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
            for (int i = 0; i < this.materialList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(5, this.materialList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DestroyMaterialReq)) {
                return super.equals(obj);
            }
            final DestroyMaterialReq other = (DestroyMaterialReq)obj;
            return this.getMaterialListList().equals(other.getMaterialListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getMaterialListCount() > 0) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getMaterialListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static DestroyMaterialReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return DestroyMaterialReq.PARSER.parseFrom(data);
        }
        
        public static DestroyMaterialReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DestroyMaterialReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DestroyMaterialReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return DestroyMaterialReq.PARSER.parseFrom(data);
        }
        
        public static DestroyMaterialReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DestroyMaterialReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DestroyMaterialReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return DestroyMaterialReq.PARSER.parseFrom(data);
        }
        
        public static DestroyMaterialReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DestroyMaterialReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DestroyMaterialReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DestroyMaterialReq.PARSER, input);
        }
        
        public static DestroyMaterialReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DestroyMaterialReq.PARSER, input, extensionRegistry);
        }
        
        public static DestroyMaterialReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(DestroyMaterialReq.PARSER, input);
        }
        
        public static DestroyMaterialReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(DestroyMaterialReq.PARSER, input, extensionRegistry);
        }
        
        public static DestroyMaterialReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DestroyMaterialReq.PARSER, input);
        }
        
        public static DestroyMaterialReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DestroyMaterialReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return DestroyMaterialReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final DestroyMaterialReq prototype) {
            return DestroyMaterialReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == DestroyMaterialReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static DestroyMaterialReq getDefaultInstance() {
            return DestroyMaterialReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<DestroyMaterialReq> parser() {
            return DestroyMaterialReq.PARSER;
        }
        
        @Override
        public Parser<DestroyMaterialReq> getParserForType() {
            return DestroyMaterialReq.PARSER;
        }
        
        @Override
        public DestroyMaterialReq getDefaultInstanceForType() {
            return DestroyMaterialReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new DestroyMaterialReq();
            PARSER = new AbstractParser<DestroyMaterialReq>() {
                @Override
                public DestroyMaterialReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new DestroyMaterialReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DestroyMaterialReqOrBuilder
        {
            private int bitField0_;
            private List<MaterialInfoOuterClass.MaterialInfo> materialList_;
            private RepeatedFieldBuilderV3<MaterialInfoOuterClass.MaterialInfo, MaterialInfoOuterClass.MaterialInfo.Builder, MaterialInfoOuterClass.MaterialInfoOrBuilder> materialListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return DestroyMaterialReqOuterClass.internal_static_DestroyMaterialReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return DestroyMaterialReqOuterClass.internal_static_DestroyMaterialReq_fieldAccessorTable.ensureFieldAccessorsInitialized(DestroyMaterialReq.class, Builder.class);
            }
            
            private Builder() {
                this.materialList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.materialList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (DestroyMaterialReq.alwaysUseFieldBuilders) {
                    this.getMaterialListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.materialListBuilder_ == null) {
                    this.materialList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.materialListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return DestroyMaterialReqOuterClass.internal_static_DestroyMaterialReq_descriptor;
            }
            
            @Override
            public DestroyMaterialReq getDefaultInstanceForType() {
                return DestroyMaterialReq.getDefaultInstance();
            }
            
            @Override
            public DestroyMaterialReq build() {
                final DestroyMaterialReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public DestroyMaterialReq buildPartial() {
                final DestroyMaterialReq result = new DestroyMaterialReq(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.materialListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.materialList_ = Collections.unmodifiableList((List<? extends MaterialInfoOuterClass.MaterialInfo>)this.materialList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.materialList_ = this.materialList_;
                }
                else {
                    result.materialList_ = this.materialListBuilder_.build();
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
                if (other instanceof DestroyMaterialReq) {
                    return this.mergeFrom((DestroyMaterialReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final DestroyMaterialReq other) {
                if (other == DestroyMaterialReq.getDefaultInstance()) {
                    return this;
                }
                if (this.materialListBuilder_ == null) {
                    if (!other.materialList_.isEmpty()) {
                        if (this.materialList_.isEmpty()) {
                            this.materialList_ = other.materialList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureMaterialListIsMutable();
                            this.materialList_.addAll(other.materialList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.materialList_.isEmpty()) {
                    if (this.materialListBuilder_.isEmpty()) {
                        this.materialListBuilder_.dispose();
                        this.materialListBuilder_ = null;
                        this.materialList_ = other.materialList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.materialListBuilder_ = (DestroyMaterialReq.alwaysUseFieldBuilders ? this.getMaterialListFieldBuilder() : null);
                    }
                    else {
                        this.materialListBuilder_.addAllMessages(other.materialList_);
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
                DestroyMaterialReq parsedMessage = null;
                try {
                    parsedMessage = DestroyMaterialReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (DestroyMaterialReq)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureMaterialListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.materialList_ = new ArrayList<MaterialInfoOuterClass.MaterialInfo>(this.materialList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<MaterialInfoOuterClass.MaterialInfo> getMaterialListList() {
                if (this.materialListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends MaterialInfoOuterClass.MaterialInfo>)this.materialList_);
                }
                return this.materialListBuilder_.getMessageList();
            }
            
            @Override
            public int getMaterialListCount() {
                if (this.materialListBuilder_ == null) {
                    return this.materialList_.size();
                }
                return this.materialListBuilder_.getCount();
            }
            
            @Override
            public MaterialInfoOuterClass.MaterialInfo getMaterialList(final int index) {
                if (this.materialListBuilder_ == null) {
                    return this.materialList_.get(index);
                }
                return this.materialListBuilder_.getMessage(index);
            }
            
            public Builder setMaterialList(final int index, final MaterialInfoOuterClass.MaterialInfo value) {
                if (this.materialListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMaterialListIsMutable();
                    this.materialList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.materialListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setMaterialList(final int index, final MaterialInfoOuterClass.MaterialInfo.Builder builderForValue) {
                if (this.materialListBuilder_ == null) {
                    this.ensureMaterialListIsMutable();
                    this.materialList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.materialListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addMaterialList(final MaterialInfoOuterClass.MaterialInfo value) {
                if (this.materialListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMaterialListIsMutable();
                    this.materialList_.add(value);
                    this.onChanged();
                }
                else {
                    this.materialListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addMaterialList(final int index, final MaterialInfoOuterClass.MaterialInfo value) {
                if (this.materialListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMaterialListIsMutable();
                    this.materialList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.materialListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addMaterialList(final MaterialInfoOuterClass.MaterialInfo.Builder builderForValue) {
                if (this.materialListBuilder_ == null) {
                    this.ensureMaterialListIsMutable();
                    this.materialList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.materialListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addMaterialList(final int index, final MaterialInfoOuterClass.MaterialInfo.Builder builderForValue) {
                if (this.materialListBuilder_ == null) {
                    this.ensureMaterialListIsMutable();
                    this.materialList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.materialListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllMaterialList(final Iterable<? extends MaterialInfoOuterClass.MaterialInfo> values) {
                if (this.materialListBuilder_ == null) {
                    this.ensureMaterialListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.materialList_);
                    this.onChanged();
                }
                else {
                    this.materialListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearMaterialList() {
                if (this.materialListBuilder_ == null) {
                    this.materialList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.materialListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeMaterialList(final int index) {
                if (this.materialListBuilder_ == null) {
                    this.ensureMaterialListIsMutable();
                    this.materialList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.materialListBuilder_.remove(index);
                }
                return this;
            }
            
            public MaterialInfoOuterClass.MaterialInfo.Builder getMaterialListBuilder(final int index) {
                return this.getMaterialListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public MaterialInfoOuterClass.MaterialInfoOrBuilder getMaterialListOrBuilder(final int index) {
                if (this.materialListBuilder_ == null) {
                    return this.materialList_.get(index);
                }
                return this.materialListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends MaterialInfoOuterClass.MaterialInfoOrBuilder> getMaterialListOrBuilderList() {
                if (this.materialListBuilder_ != null) {
                    return this.materialListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends MaterialInfoOuterClass.MaterialInfoOrBuilder>)this.materialList_);
            }
            
            public MaterialInfoOuterClass.MaterialInfo.Builder addMaterialListBuilder() {
                return this.getMaterialListFieldBuilder().addBuilder(MaterialInfoOuterClass.MaterialInfo.getDefaultInstance());
            }
            
            public MaterialInfoOuterClass.MaterialInfo.Builder addMaterialListBuilder(final int index) {
                return this.getMaterialListFieldBuilder().addBuilder(index, MaterialInfoOuterClass.MaterialInfo.getDefaultInstance());
            }
            
            public List<MaterialInfoOuterClass.MaterialInfo.Builder> getMaterialListBuilderList() {
                return this.getMaterialListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<MaterialInfoOuterClass.MaterialInfo, MaterialInfoOuterClass.MaterialInfo.Builder, MaterialInfoOuterClass.MaterialInfoOrBuilder> getMaterialListFieldBuilder() {
                if (this.materialListBuilder_ == null) {
                    this.materialListBuilder_ = new RepeatedFieldBuilderV3<MaterialInfoOuterClass.MaterialInfo, MaterialInfoOuterClass.MaterialInfo.Builder, MaterialInfoOuterClass.MaterialInfoOrBuilder>(this.materialList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.materialList_ = null;
                }
                return this.materialListBuilder_;
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
    
    public interface DestroyMaterialReqOrBuilder extends MessageOrBuilder
    {
        List<MaterialInfoOuterClass.MaterialInfo> getMaterialListList();
        
        MaterialInfoOuterClass.MaterialInfo getMaterialList(final int p0);
        
        int getMaterialListCount();
        
        List<? extends MaterialInfoOuterClass.MaterialInfoOrBuilder> getMaterialListOrBuilderList();
        
        MaterialInfoOuterClass.MaterialInfoOrBuilder getMaterialListOrBuilder(final int p0);
    }
}
