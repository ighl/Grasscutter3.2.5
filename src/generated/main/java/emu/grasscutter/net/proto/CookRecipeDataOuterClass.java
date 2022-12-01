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

public final class CookRecipeDataOuterClass
{
    private static final Descriptors.Descriptor internal_static_CookRecipeData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CookRecipeData_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CookRecipeDataOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CookRecipeDataOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0014CookRecipeData.proto\"8\n\u000eCookRecipeData\u0012\u0013\n\u000bproficiency\u0018\r \u0001(\r\u0012\u0011\n\trecipe_id\u0018\t \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CookRecipeDataOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_CookRecipeData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CookRecipeData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CookRecipeDataOuterClass.internal_static_CookRecipeData_descriptor, new String[] { "Proficiency", "RecipeId" });
    }
    
    public static final class CookRecipeData extends GeneratedMessageV3 implements CookRecipeDataOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int PROFICIENCY_FIELD_NUMBER = 13;
        private int proficiency_;
        public static final int RECIPE_ID_FIELD_NUMBER = 9;
        private int recipeId_;
        private byte memoizedIsInitialized;
        private static final CookRecipeData DEFAULT_INSTANCE;
        private static final Parser<CookRecipeData> PARSER;
        
        private CookRecipeData(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private CookRecipeData() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CookRecipeData();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CookRecipeData(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.recipeId_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.proficiency_ = input.readUInt32();
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
            return CookRecipeDataOuterClass.internal_static_CookRecipeData_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CookRecipeDataOuterClass.internal_static_CookRecipeData_fieldAccessorTable.ensureFieldAccessorsInitialized(CookRecipeData.class, Builder.class);
        }
        
        @Override
        public int getProficiency() {
            return this.proficiency_;
        }
        
        @Override
        public int getRecipeId() {
            return this.recipeId_;
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
            if (this.recipeId_ != 0) {
                output.writeUInt32(9, this.recipeId_);
            }
            if (this.proficiency_ != 0) {
                output.writeUInt32(13, this.proficiency_);
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
            if (this.recipeId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.recipeId_);
            }
            if (this.proficiency_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.proficiency_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CookRecipeData)) {
                return super.equals(obj);
            }
            final CookRecipeData other = (CookRecipeData)obj;
            return this.getProficiency() == other.getProficiency() && this.getRecipeId() == other.getRecipeId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getProficiency();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getRecipeId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CookRecipeData parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CookRecipeData.PARSER.parseFrom(data);
        }
        
        public static CookRecipeData parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CookRecipeData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CookRecipeData parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CookRecipeData.PARSER.parseFrom(data);
        }
        
        public static CookRecipeData parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CookRecipeData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CookRecipeData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CookRecipeData.PARSER.parseFrom(data);
        }
        
        public static CookRecipeData parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CookRecipeData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CookRecipeData parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CookRecipeData.PARSER, input);
        }
        
        public static CookRecipeData parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CookRecipeData.PARSER, input, extensionRegistry);
        }
        
        public static CookRecipeData parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CookRecipeData.PARSER, input);
        }
        
        public static CookRecipeData parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CookRecipeData.PARSER, input, extensionRegistry);
        }
        
        public static CookRecipeData parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CookRecipeData.PARSER, input);
        }
        
        public static CookRecipeData parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CookRecipeData.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CookRecipeData.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CookRecipeData prototype) {
            return CookRecipeData.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CookRecipeData.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CookRecipeData getDefaultInstance() {
            return CookRecipeData.DEFAULT_INSTANCE;
        }
        
        public static Parser<CookRecipeData> parser() {
            return CookRecipeData.PARSER;
        }
        
        @Override
        public Parser<CookRecipeData> getParserForType() {
            return CookRecipeData.PARSER;
        }
        
        @Override
        public CookRecipeData getDefaultInstanceForType() {
            return CookRecipeData.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CookRecipeData();
            PARSER = new AbstractParser<CookRecipeData>() {
                @Override
                public CookRecipeData parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CookRecipeData(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CookRecipeDataOrBuilder
        {
            private int proficiency_;
            private int recipeId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CookRecipeDataOuterClass.internal_static_CookRecipeData_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CookRecipeDataOuterClass.internal_static_CookRecipeData_fieldAccessorTable.ensureFieldAccessorsInitialized(CookRecipeData.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (CookRecipeData.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.proficiency_ = 0;
                this.recipeId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CookRecipeDataOuterClass.internal_static_CookRecipeData_descriptor;
            }
            
            @Override
            public CookRecipeData getDefaultInstanceForType() {
                return CookRecipeData.getDefaultInstance();
            }
            
            @Override
            public CookRecipeData build() {
                final CookRecipeData result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CookRecipeData buildPartial() {
                final CookRecipeData result = new CookRecipeData(this);
                result.proficiency_ = this.proficiency_;
                result.recipeId_ = this.recipeId_;
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
                if (other instanceof CookRecipeData) {
                    return this.mergeFrom((CookRecipeData)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CookRecipeData other) {
                if (other == CookRecipeData.getDefaultInstance()) {
                    return this;
                }
                if (other.getProficiency() != 0) {
                    this.setProficiency(other.getProficiency());
                }
                if (other.getRecipeId() != 0) {
                    this.setRecipeId(other.getRecipeId());
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
                CookRecipeData parsedMessage = null;
                try {
                    parsedMessage = CookRecipeData.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CookRecipeData)e.getUnfinishedMessage();
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
            public int getProficiency() {
                return this.proficiency_;
            }
            
            public Builder setProficiency(final int value) {
                this.proficiency_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearProficiency() {
                this.proficiency_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getRecipeId() {
                return this.recipeId_;
            }
            
            public Builder setRecipeId(final int value) {
                this.recipeId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRecipeId() {
                this.recipeId_ = 0;
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
    
    public interface CookRecipeDataOrBuilder extends MessageOrBuilder
    {
        int getProficiency();
        
        int getRecipeId();
    }
}
