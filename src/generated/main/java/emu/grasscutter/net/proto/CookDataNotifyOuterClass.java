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

public final class CookDataNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_CookDataNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CookDataNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CookDataNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CookDataNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0014CookDataNotify.proto\u001a\u0014CookRecipeData.proto\"J\n\u000eCookDataNotify\u0012)\n\u0010recipe_data_list\u0018\u0002 \u0003(\u000b2\u000f.CookRecipeData\u0012\r\n\u0005grade\u0018\u000b \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CookDataNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { CookRecipeDataOuterClass.getDescriptor() });
        internal_static_CookDataNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CookDataNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CookDataNotifyOuterClass.internal_static_CookDataNotify_descriptor, new String[] { "RecipeDataList", "Grade" });
        CookRecipeDataOuterClass.getDescriptor();
    }
    
    public static final class CookDataNotify extends GeneratedMessageV3 implements CookDataNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RECIPE_DATA_LIST_FIELD_NUMBER = 2;
        private List<CookRecipeDataOuterClass.CookRecipeData> recipeDataList_;
        public static final int GRADE_FIELD_NUMBER = 11;
        private int grade_;
        private byte memoizedIsInitialized;
        private static final CookDataNotify DEFAULT_INSTANCE;
        private static final Parser<CookDataNotify> PARSER;
        
        private CookDataNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private CookDataNotify() {
            this.memoizedIsInitialized = -1;
            this.recipeDataList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CookDataNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CookDataNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 18: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.recipeDataList_ = new ArrayList<CookRecipeDataOuterClass.CookRecipeData>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.recipeDataList_.add(input.readMessage(CookRecipeDataOuterClass.CookRecipeData.parser(), extensionRegistry));
                            continue;
                        }
                        case 88: {
                            this.grade_ = input.readUInt32();
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
                    this.recipeDataList_ = Collections.unmodifiableList((List<? extends CookRecipeDataOuterClass.CookRecipeData>)this.recipeDataList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return CookDataNotifyOuterClass.internal_static_CookDataNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CookDataNotifyOuterClass.internal_static_CookDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CookDataNotify.class, Builder.class);
        }
        
        @Override
        public List<CookRecipeDataOuterClass.CookRecipeData> getRecipeDataListList() {
            return this.recipeDataList_;
        }
        
        @Override
        public List<? extends CookRecipeDataOuterClass.CookRecipeDataOrBuilder> getRecipeDataListOrBuilderList() {
            return this.recipeDataList_;
        }
        
        @Override
        public int getRecipeDataListCount() {
            return this.recipeDataList_.size();
        }
        
        @Override
        public CookRecipeDataOuterClass.CookRecipeData getRecipeDataList(final int index) {
            return this.recipeDataList_.get(index);
        }
        
        @Override
        public CookRecipeDataOuterClass.CookRecipeDataOrBuilder getRecipeDataListOrBuilder(final int index) {
            return this.recipeDataList_.get(index);
        }
        
        @Override
        public int getGrade() {
            return this.grade_;
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
            for (int i = 0; i < this.recipeDataList_.size(); ++i) {
                output.writeMessage(2, this.recipeDataList_.get(i));
            }
            if (this.grade_ != 0) {
                output.writeUInt32(11, this.grade_);
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
            for (int i = 0; i < this.recipeDataList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(2, this.recipeDataList_.get(i));
            }
            if (this.grade_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.grade_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CookDataNotify)) {
                return super.equals(obj);
            }
            final CookDataNotify other = (CookDataNotify)obj;
            return this.getRecipeDataListList().equals(other.getRecipeDataListList()) && this.getGrade() == other.getGrade() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getRecipeDataListCount() > 0) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getRecipeDataListList().hashCode();
            }
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getGrade();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CookDataNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CookDataNotify.PARSER.parseFrom(data);
        }
        
        public static CookDataNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CookDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CookDataNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CookDataNotify.PARSER.parseFrom(data);
        }
        
        public static CookDataNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CookDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CookDataNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CookDataNotify.PARSER.parseFrom(data);
        }
        
        public static CookDataNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CookDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CookDataNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CookDataNotify.PARSER, input);
        }
        
        public static CookDataNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CookDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static CookDataNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CookDataNotify.PARSER, input);
        }
        
        public static CookDataNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CookDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static CookDataNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CookDataNotify.PARSER, input);
        }
        
        public static CookDataNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CookDataNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CookDataNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CookDataNotify prototype) {
            return CookDataNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CookDataNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CookDataNotify getDefaultInstance() {
            return CookDataNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<CookDataNotify> parser() {
            return CookDataNotify.PARSER;
        }
        
        @Override
        public Parser<CookDataNotify> getParserForType() {
            return CookDataNotify.PARSER;
        }
        
        @Override
        public CookDataNotify getDefaultInstanceForType() {
            return CookDataNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CookDataNotify();
            PARSER = new AbstractParser<CookDataNotify>() {
                @Override
                public CookDataNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CookDataNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CookDataNotifyOrBuilder
        {
            private int bitField0_;
            private List<CookRecipeDataOuterClass.CookRecipeData> recipeDataList_;
            private RepeatedFieldBuilderV3<CookRecipeDataOuterClass.CookRecipeData, CookRecipeDataOuterClass.CookRecipeData.Builder, CookRecipeDataOuterClass.CookRecipeDataOrBuilder> recipeDataListBuilder_;
            private int grade_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CookDataNotifyOuterClass.internal_static_CookDataNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CookDataNotifyOuterClass.internal_static_CookDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CookDataNotify.class, Builder.class);
            }
            
            private Builder() {
                this.recipeDataList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.recipeDataList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (CookDataNotify.alwaysUseFieldBuilders) {
                    this.getRecipeDataListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.recipeDataListBuilder_ == null) {
                    this.recipeDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.recipeDataListBuilder_.clear();
                }
                this.grade_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CookDataNotifyOuterClass.internal_static_CookDataNotify_descriptor;
            }
            
            @Override
            public CookDataNotify getDefaultInstanceForType() {
                return CookDataNotify.getDefaultInstance();
            }
            
            @Override
            public CookDataNotify build() {
                final CookDataNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CookDataNotify buildPartial() {
                final CookDataNotify result = new CookDataNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.recipeDataListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.recipeDataList_ = Collections.unmodifiableList((List<? extends CookRecipeDataOuterClass.CookRecipeData>)this.recipeDataList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.recipeDataList_ = this.recipeDataList_;
                }
                else {
                    result.recipeDataList_ = this.recipeDataListBuilder_.build();
                }
                result.grade_ = this.grade_;
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
                if (other instanceof CookDataNotify) {
                    return this.mergeFrom((CookDataNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CookDataNotify other) {
                if (other == CookDataNotify.getDefaultInstance()) {
                    return this;
                }
                if (this.recipeDataListBuilder_ == null) {
                    if (!other.recipeDataList_.isEmpty()) {
                        if (this.recipeDataList_.isEmpty()) {
                            this.recipeDataList_ = other.recipeDataList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureRecipeDataListIsMutable();
                            this.recipeDataList_.addAll(other.recipeDataList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.recipeDataList_.isEmpty()) {
                    if (this.recipeDataListBuilder_.isEmpty()) {
                        this.recipeDataListBuilder_.dispose();
                        this.recipeDataListBuilder_ = null;
                        this.recipeDataList_ = other.recipeDataList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.recipeDataListBuilder_ = (CookDataNotify.alwaysUseFieldBuilders ? this.getRecipeDataListFieldBuilder() : null);
                    }
                    else {
                        this.recipeDataListBuilder_.addAllMessages(other.recipeDataList_);
                    }
                }
                if (other.getGrade() != 0) {
                    this.setGrade(other.getGrade());
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
                CookDataNotify parsedMessage = null;
                try {
                    parsedMessage = CookDataNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CookDataNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureRecipeDataListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.recipeDataList_ = new ArrayList<CookRecipeDataOuterClass.CookRecipeData>(this.recipeDataList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<CookRecipeDataOuterClass.CookRecipeData> getRecipeDataListList() {
                if (this.recipeDataListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends CookRecipeDataOuterClass.CookRecipeData>)this.recipeDataList_);
                }
                return this.recipeDataListBuilder_.getMessageList();
            }
            
            @Override
            public int getRecipeDataListCount() {
                if (this.recipeDataListBuilder_ == null) {
                    return this.recipeDataList_.size();
                }
                return this.recipeDataListBuilder_.getCount();
            }
            
            @Override
            public CookRecipeDataOuterClass.CookRecipeData getRecipeDataList(final int index) {
                if (this.recipeDataListBuilder_ == null) {
                    return this.recipeDataList_.get(index);
                }
                return this.recipeDataListBuilder_.getMessage(index);
            }
            
            public Builder setRecipeDataList(final int index, final CookRecipeDataOuterClass.CookRecipeData value) {
                if (this.recipeDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureRecipeDataListIsMutable();
                    this.recipeDataList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.recipeDataListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setRecipeDataList(final int index, final CookRecipeDataOuterClass.CookRecipeData.Builder builderForValue) {
                if (this.recipeDataListBuilder_ == null) {
                    this.ensureRecipeDataListIsMutable();
                    this.recipeDataList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.recipeDataListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addRecipeDataList(final CookRecipeDataOuterClass.CookRecipeData value) {
                if (this.recipeDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureRecipeDataListIsMutable();
                    this.recipeDataList_.add(value);
                    this.onChanged();
                }
                else {
                    this.recipeDataListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addRecipeDataList(final int index, final CookRecipeDataOuterClass.CookRecipeData value) {
                if (this.recipeDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureRecipeDataListIsMutable();
                    this.recipeDataList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.recipeDataListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addRecipeDataList(final CookRecipeDataOuterClass.CookRecipeData.Builder builderForValue) {
                if (this.recipeDataListBuilder_ == null) {
                    this.ensureRecipeDataListIsMutable();
                    this.recipeDataList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.recipeDataListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addRecipeDataList(final int index, final CookRecipeDataOuterClass.CookRecipeData.Builder builderForValue) {
                if (this.recipeDataListBuilder_ == null) {
                    this.ensureRecipeDataListIsMutable();
                    this.recipeDataList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.recipeDataListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllRecipeDataList(final Iterable<? extends CookRecipeDataOuterClass.CookRecipeData> values) {
                if (this.recipeDataListBuilder_ == null) {
                    this.ensureRecipeDataListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.recipeDataList_);
                    this.onChanged();
                }
                else {
                    this.recipeDataListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearRecipeDataList() {
                if (this.recipeDataListBuilder_ == null) {
                    this.recipeDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.recipeDataListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeRecipeDataList(final int index) {
                if (this.recipeDataListBuilder_ == null) {
                    this.ensureRecipeDataListIsMutable();
                    this.recipeDataList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.recipeDataListBuilder_.remove(index);
                }
                return this;
            }
            
            public CookRecipeDataOuterClass.CookRecipeData.Builder getRecipeDataListBuilder(final int index) {
                return this.getRecipeDataListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public CookRecipeDataOuterClass.CookRecipeDataOrBuilder getRecipeDataListOrBuilder(final int index) {
                if (this.recipeDataListBuilder_ == null) {
                    return this.recipeDataList_.get(index);
                }
                return this.recipeDataListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends CookRecipeDataOuterClass.CookRecipeDataOrBuilder> getRecipeDataListOrBuilderList() {
                if (this.recipeDataListBuilder_ != null) {
                    return this.recipeDataListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends CookRecipeDataOuterClass.CookRecipeDataOrBuilder>)this.recipeDataList_);
            }
            
            public CookRecipeDataOuterClass.CookRecipeData.Builder addRecipeDataListBuilder() {
                return this.getRecipeDataListFieldBuilder().addBuilder(CookRecipeDataOuterClass.CookRecipeData.getDefaultInstance());
            }
            
            public CookRecipeDataOuterClass.CookRecipeData.Builder addRecipeDataListBuilder(final int index) {
                return this.getRecipeDataListFieldBuilder().addBuilder(index, CookRecipeDataOuterClass.CookRecipeData.getDefaultInstance());
            }
            
            public List<CookRecipeDataOuterClass.CookRecipeData.Builder> getRecipeDataListBuilderList() {
                return this.getRecipeDataListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<CookRecipeDataOuterClass.CookRecipeData, CookRecipeDataOuterClass.CookRecipeData.Builder, CookRecipeDataOuterClass.CookRecipeDataOrBuilder> getRecipeDataListFieldBuilder() {
                if (this.recipeDataListBuilder_ == null) {
                    this.recipeDataListBuilder_ = new RepeatedFieldBuilderV3<CookRecipeDataOuterClass.CookRecipeData, CookRecipeDataOuterClass.CookRecipeData.Builder, CookRecipeDataOuterClass.CookRecipeDataOrBuilder>(this.recipeDataList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.recipeDataList_ = null;
                }
                return this.recipeDataListBuilder_;
            }
            
            @Override
            public int getGrade() {
                return this.grade_;
            }
            
            public Builder setGrade(final int value) {
                this.grade_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGrade() {
                this.grade_ = 0;
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
    
    public interface CookDataNotifyOrBuilder extends MessageOrBuilder
    {
        List<CookRecipeDataOuterClass.CookRecipeData> getRecipeDataListList();
        
        CookRecipeDataOuterClass.CookRecipeData getRecipeDataList(final int p0);
        
        int getRecipeDataListCount();
        
        List<? extends CookRecipeDataOuterClass.CookRecipeDataOrBuilder> getRecipeDataListOrBuilderList();
        
        CookRecipeDataOuterClass.CookRecipeDataOrBuilder getRecipeDataListOrBuilder(final int p0);
        
        int getGrade();
    }
}
