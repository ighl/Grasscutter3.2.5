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

public final class CookRecipeDataNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_CookRecipeDataNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CookRecipeDataNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CookRecipeDataNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CookRecipeDataNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001aCookRecipeDataNotify.proto\u001a\u0014CookRecipeData.proto\"<\n\u0014CookRecipeDataNotify\u0012$\n\u000brecipe_data\u0018\u0004 \u0001(\u000b2\u000f.CookRecipeDataB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CookRecipeDataNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { CookRecipeDataOuterClass.getDescriptor() });
        internal_static_CookRecipeDataNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CookRecipeDataNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CookRecipeDataNotifyOuterClass.internal_static_CookRecipeDataNotify_descriptor, new String[] { "RecipeData" });
        CookRecipeDataOuterClass.getDescriptor();
    }
    
    public static final class CookRecipeDataNotify extends GeneratedMessageV3 implements CookRecipeDataNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RECIPE_DATA_FIELD_NUMBER = 4;
        private CookRecipeDataOuterClass.CookRecipeData recipeData_;
        private byte memoizedIsInitialized;
        private static final CookRecipeDataNotify DEFAULT_INSTANCE;
        private static final Parser<CookRecipeDataNotify> PARSER;
        
        private CookRecipeDataNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private CookRecipeDataNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CookRecipeDataNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CookRecipeDataNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 34: {
                            CookRecipeDataOuterClass.CookRecipeData.Builder subBuilder = null;
                            if (this.recipeData_ != null) {
                                subBuilder = this.recipeData_.toBuilder();
                            }
                            this.recipeData_ = input.readMessage(CookRecipeDataOuterClass.CookRecipeData.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.recipeData_);
                                this.recipeData_ = subBuilder.buildPartial();
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
            return CookRecipeDataNotifyOuterClass.internal_static_CookRecipeDataNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CookRecipeDataNotifyOuterClass.internal_static_CookRecipeDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CookRecipeDataNotify.class, Builder.class);
        }
        
        @Override
        public boolean hasRecipeData() {
            return this.recipeData_ != null;
        }
        
        @Override
        public CookRecipeDataOuterClass.CookRecipeData getRecipeData() {
            return (this.recipeData_ == null) ? CookRecipeDataOuterClass.CookRecipeData.getDefaultInstance() : this.recipeData_;
        }
        
        @Override
        public CookRecipeDataOuterClass.CookRecipeDataOrBuilder getRecipeDataOrBuilder() {
            return this.getRecipeData();
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
            if (this.recipeData_ != null) {
                output.writeMessage(4, this.getRecipeData());
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
            if (this.recipeData_ != null) {
                size += CodedOutputStream.computeMessageSize(4, this.getRecipeData());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CookRecipeDataNotify)) {
                return super.equals(obj);
            }
            final CookRecipeDataNotify other = (CookRecipeDataNotify)obj;
            return this.hasRecipeData() == other.hasRecipeData() && (!this.hasRecipeData() || this.getRecipeData().equals(other.getRecipeData())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasRecipeData()) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getRecipeData().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CookRecipeDataNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CookRecipeDataNotify.PARSER.parseFrom(data);
        }
        
        public static CookRecipeDataNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CookRecipeDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CookRecipeDataNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CookRecipeDataNotify.PARSER.parseFrom(data);
        }
        
        public static CookRecipeDataNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CookRecipeDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CookRecipeDataNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CookRecipeDataNotify.PARSER.parseFrom(data);
        }
        
        public static CookRecipeDataNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CookRecipeDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CookRecipeDataNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CookRecipeDataNotify.PARSER, input);
        }
        
        public static CookRecipeDataNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CookRecipeDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static CookRecipeDataNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CookRecipeDataNotify.PARSER, input);
        }
        
        public static CookRecipeDataNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CookRecipeDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static CookRecipeDataNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CookRecipeDataNotify.PARSER, input);
        }
        
        public static CookRecipeDataNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CookRecipeDataNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CookRecipeDataNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CookRecipeDataNotify prototype) {
            return CookRecipeDataNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CookRecipeDataNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CookRecipeDataNotify getDefaultInstance() {
            return CookRecipeDataNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<CookRecipeDataNotify> parser() {
            return CookRecipeDataNotify.PARSER;
        }
        
        @Override
        public Parser<CookRecipeDataNotify> getParserForType() {
            return CookRecipeDataNotify.PARSER;
        }
        
        @Override
        public CookRecipeDataNotify getDefaultInstanceForType() {
            return CookRecipeDataNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CookRecipeDataNotify();
            PARSER = new AbstractParser<CookRecipeDataNotify>() {
                @Override
                public CookRecipeDataNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CookRecipeDataNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CookRecipeDataNotifyOrBuilder
        {
            private CookRecipeDataOuterClass.CookRecipeData recipeData_;
            private SingleFieldBuilderV3<CookRecipeDataOuterClass.CookRecipeData, CookRecipeDataOuterClass.CookRecipeData.Builder, CookRecipeDataOuterClass.CookRecipeDataOrBuilder> recipeDataBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CookRecipeDataNotifyOuterClass.internal_static_CookRecipeDataNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CookRecipeDataNotifyOuterClass.internal_static_CookRecipeDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CookRecipeDataNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (CookRecipeDataNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.recipeDataBuilder_ == null) {
                    this.recipeData_ = null;
                }
                else {
                    this.recipeData_ = null;
                    this.recipeDataBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CookRecipeDataNotifyOuterClass.internal_static_CookRecipeDataNotify_descriptor;
            }
            
            @Override
            public CookRecipeDataNotify getDefaultInstanceForType() {
                return CookRecipeDataNotify.getDefaultInstance();
            }
            
            @Override
            public CookRecipeDataNotify build() {
                final CookRecipeDataNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CookRecipeDataNotify buildPartial() {
                final CookRecipeDataNotify result = new CookRecipeDataNotify(this);
                if (this.recipeDataBuilder_ == null) {
                    result.recipeData_ = this.recipeData_;
                }
                else {
                    result.recipeData_ = this.recipeDataBuilder_.build();
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
                if (other instanceof CookRecipeDataNotify) {
                    return this.mergeFrom((CookRecipeDataNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CookRecipeDataNotify other) {
                if (other == CookRecipeDataNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.hasRecipeData()) {
                    this.mergeRecipeData(other.getRecipeData());
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
                CookRecipeDataNotify parsedMessage = null;
                try {
                    parsedMessage = CookRecipeDataNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CookRecipeDataNotify)e.getUnfinishedMessage();
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
            public boolean hasRecipeData() {
                return this.recipeDataBuilder_ != null || this.recipeData_ != null;
            }
            
            @Override
            public CookRecipeDataOuterClass.CookRecipeData getRecipeData() {
                if (this.recipeDataBuilder_ == null) {
                    return (this.recipeData_ == null) ? CookRecipeDataOuterClass.CookRecipeData.getDefaultInstance() : this.recipeData_;
                }
                return this.recipeDataBuilder_.getMessage();
            }
            
            public Builder setRecipeData(final CookRecipeDataOuterClass.CookRecipeData value) {
                if (this.recipeDataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.recipeData_ = value;
                    this.onChanged();
                }
                else {
                    this.recipeDataBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setRecipeData(final CookRecipeDataOuterClass.CookRecipeData.Builder builderForValue) {
                if (this.recipeDataBuilder_ == null) {
                    this.recipeData_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.recipeDataBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeRecipeData(final CookRecipeDataOuterClass.CookRecipeData value) {
                if (this.recipeDataBuilder_ == null) {
                    if (this.recipeData_ != null) {
                        this.recipeData_ = CookRecipeDataOuterClass.CookRecipeData.newBuilder(this.recipeData_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.recipeData_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.recipeDataBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearRecipeData() {
                if (this.recipeDataBuilder_ == null) {
                    this.recipeData_ = null;
                    this.onChanged();
                }
                else {
                    this.recipeData_ = null;
                    this.recipeDataBuilder_ = null;
                }
                return this;
            }
            
            public CookRecipeDataOuterClass.CookRecipeData.Builder getRecipeDataBuilder() {
                this.onChanged();
                return this.getRecipeDataFieldBuilder().getBuilder();
            }
            
            @Override
            public CookRecipeDataOuterClass.CookRecipeDataOrBuilder getRecipeDataOrBuilder() {
                if (this.recipeDataBuilder_ != null) {
                    return this.recipeDataBuilder_.getMessageOrBuilder();
                }
                return (this.recipeData_ == null) ? CookRecipeDataOuterClass.CookRecipeData.getDefaultInstance() : this.recipeData_;
            }
            
            private SingleFieldBuilderV3<CookRecipeDataOuterClass.CookRecipeData, CookRecipeDataOuterClass.CookRecipeData.Builder, CookRecipeDataOuterClass.CookRecipeDataOrBuilder> getRecipeDataFieldBuilder() {
                if (this.recipeDataBuilder_ == null) {
                    this.recipeDataBuilder_ = new SingleFieldBuilderV3<CookRecipeDataOuterClass.CookRecipeData, CookRecipeDataOuterClass.CookRecipeData.Builder, CookRecipeDataOuterClass.CookRecipeDataOrBuilder>(this.getRecipeData(), this.getParentForChildren(), this.isClean());
                    this.recipeData_ = null;
                }
                return this.recipeDataBuilder_;
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
    
    public interface CookRecipeDataNotifyOrBuilder extends MessageOrBuilder
    {
        boolean hasRecipeData();
        
        CookRecipeDataOuterClass.CookRecipeData getRecipeData();
        
        CookRecipeDataOuterClass.CookRecipeDataOrBuilder getRecipeDataOrBuilder();
    }
}
