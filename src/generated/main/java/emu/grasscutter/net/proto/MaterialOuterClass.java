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

public final class MaterialOuterClass
{
    private static final Descriptors.Descriptor internal_static_Material_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Material_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MaterialOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MaterialOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u000eMaterial.proto\u001a\u0018MaterialDeleteInfo.proto\"C\n\bMaterial\u0012\r\n\u0005count\u0018\u0001 \u0001(\r\u0012(\n\u000bdelete_info\u0018\u0002 \u0001(\u000b2\u0013.MaterialDeleteInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MaterialOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { MaterialDeleteInfoOuterClass.getDescriptor() });
        internal_static_Material_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_Material_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MaterialOuterClass.internal_static_Material_descriptor, new String[] { "Count", "DeleteInfo" });
        MaterialDeleteInfoOuterClass.getDescriptor();
    }
    
    public static final class Material extends GeneratedMessageV3 implements MaterialOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int COUNT_FIELD_NUMBER = 1;
        private int count_;
        public static final int DELETE_INFO_FIELD_NUMBER = 2;
        private MaterialDeleteInfoOuterClass.MaterialDeleteInfo deleteInfo_;
        private byte memoizedIsInitialized;
        private static final Material DEFAULT_INSTANCE;
        private static final Parser<Material> PARSER;
        
        private Material(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private Material() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new Material();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private Material(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.count_ = input.readUInt32();
                            continue;
                        }
                        case 18: {
                            MaterialDeleteInfoOuterClass.MaterialDeleteInfo.Builder subBuilder = null;
                            if (this.deleteInfo_ != null) {
                                subBuilder = this.deleteInfo_.toBuilder();
                            }
                            this.deleteInfo_ = input.readMessage(MaterialDeleteInfoOuterClass.MaterialDeleteInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.deleteInfo_);
                                this.deleteInfo_ = subBuilder.buildPartial();
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
            return MaterialOuterClass.internal_static_Material_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MaterialOuterClass.internal_static_Material_fieldAccessorTable.ensureFieldAccessorsInitialized(Material.class, Builder.class);
        }
        
        @Override
        public int getCount() {
            return this.count_;
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
            if (this.count_ != 0) {
                output.writeUInt32(1, this.count_);
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
            if (this.count_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.count_);
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
            if (!(obj instanceof Material)) {
                return super.equals(obj);
            }
            final Material other = (Material)obj;
            return this.getCount() == other.getCount() && this.hasDeleteInfo() == other.hasDeleteInfo() && (!this.hasDeleteInfo() || this.getDeleteInfo().equals(other.getDeleteInfo())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getCount();
            if (this.hasDeleteInfo()) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getDeleteInfo().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static Material parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return Material.PARSER.parseFrom(data);
        }
        
        public static Material parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Material.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Material parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return Material.PARSER.parseFrom(data);
        }
        
        public static Material parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Material.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Material parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return Material.PARSER.parseFrom(data);
        }
        
        public static Material parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Material.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Material parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Material.PARSER, input);
        }
        
        public static Material parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Material.PARSER, input, extensionRegistry);
        }
        
        public static Material parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Material.PARSER, input);
        }
        
        public static Material parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Material.PARSER, input, extensionRegistry);
        }
        
        public static Material parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Material.PARSER, input);
        }
        
        public static Material parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Material.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return Material.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final Material prototype) {
            return Material.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == Material.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static Material getDefaultInstance() {
            return Material.DEFAULT_INSTANCE;
        }
        
        public static Parser<Material> parser() {
            return Material.PARSER;
        }
        
        @Override
        public Parser<Material> getParserForType() {
            return Material.PARSER;
        }
        
        @Override
        public Material getDefaultInstanceForType() {
            return Material.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new Material();
            PARSER = new AbstractParser<Material>() {
                @Override
                public Material parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new Material(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MaterialOrBuilder
        {
            private int count_;
            private MaterialDeleteInfoOuterClass.MaterialDeleteInfo deleteInfo_;
            private SingleFieldBuilderV3<MaterialDeleteInfoOuterClass.MaterialDeleteInfo, MaterialDeleteInfoOuterClass.MaterialDeleteInfo.Builder, MaterialDeleteInfoOuterClass.MaterialDeleteInfoOrBuilder> deleteInfoBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MaterialOuterClass.internal_static_Material_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MaterialOuterClass.internal_static_Material_fieldAccessorTable.ensureFieldAccessorsInitialized(Material.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (Material.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.count_ = 0;
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
                return MaterialOuterClass.internal_static_Material_descriptor;
            }
            
            @Override
            public Material getDefaultInstanceForType() {
                return Material.getDefaultInstance();
            }
            
            @Override
            public Material build() {
                final Material result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public Material buildPartial() {
                final Material result = new Material(this);
                result.count_ = this.count_;
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
                if (other instanceof Material) {
                    return this.mergeFrom((Material)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final Material other) {
                if (other == Material.getDefaultInstance()) {
                    return this;
                }
                if (other.getCount() != 0) {
                    this.setCount(other.getCount());
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
                Material parsedMessage = null;
                try {
                    parsedMessage = Material.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (Material)e.getUnfinishedMessage();
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
            public int getCount() {
                return this.count_;
            }
            
            public Builder setCount(final int value) {
                this.count_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCount() {
                this.count_ = 0;
                this.onChanged();
                return this;
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
    
    public interface MaterialOrBuilder extends MessageOrBuilder
    {
        int getCount();
        
        boolean hasDeleteInfo();
        
        MaterialDeleteInfoOuterClass.MaterialDeleteInfo getDeleteInfo();
        
        MaterialDeleteInfoOuterClass.MaterialDeleteInfoOrBuilder getDeleteInfoOrBuilder();
    }
}
