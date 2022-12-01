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

public final class AbilityControlBlockOuterClass
{
    private static final Descriptors.Descriptor internal_static_AbilityControlBlock_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AbilityControlBlock_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AbilityControlBlockOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AbilityControlBlockOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019AbilityControlBlock.proto\u001a\u0013AbilityEmbryo.proto\"B\n\u0013AbilityControlBlock\u0012+\n\u0013ability_embryo_list\u0018\u0001 \u0003(\u000b2\u000e.AbilityEmbryoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AbilityControlBlockOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AbilityEmbryoOuterClass.getDescriptor() });
        internal_static_AbilityControlBlock_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AbilityControlBlock_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AbilityControlBlockOuterClass.internal_static_AbilityControlBlock_descriptor, new String[] { "AbilityEmbryoList" });
        AbilityEmbryoOuterClass.getDescriptor();
    }
    
    public static final class AbilityControlBlock extends GeneratedMessageV3 implements AbilityControlBlockOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ABILITY_EMBRYO_LIST_FIELD_NUMBER = 1;
        private List<AbilityEmbryoOuterClass.AbilityEmbryo> abilityEmbryoList_;
        private byte memoizedIsInitialized;
        private static final AbilityControlBlock DEFAULT_INSTANCE;
        private static final Parser<AbilityControlBlock> PARSER;
        
        private AbilityControlBlock(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AbilityControlBlock() {
            this.memoizedIsInitialized = -1;
            this.abilityEmbryoList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AbilityControlBlock();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AbilityControlBlock(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 10: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.abilityEmbryoList_ = new ArrayList<AbilityEmbryoOuterClass.AbilityEmbryo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.abilityEmbryoList_.add(input.readMessage(AbilityEmbryoOuterClass.AbilityEmbryo.parser(), extensionRegistry));
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
                    this.abilityEmbryoList_ = Collections.unmodifiableList((List<? extends AbilityEmbryoOuterClass.AbilityEmbryo>)this.abilityEmbryoList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return AbilityControlBlockOuterClass.internal_static_AbilityControlBlock_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AbilityControlBlockOuterClass.internal_static_AbilityControlBlock_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityControlBlock.class, Builder.class);
        }
        
        @Override
        public List<AbilityEmbryoOuterClass.AbilityEmbryo> getAbilityEmbryoListList() {
            return this.abilityEmbryoList_;
        }
        
        @Override
        public List<? extends AbilityEmbryoOuterClass.AbilityEmbryoOrBuilder> getAbilityEmbryoListOrBuilderList() {
            return this.abilityEmbryoList_;
        }
        
        @Override
        public int getAbilityEmbryoListCount() {
            return this.abilityEmbryoList_.size();
        }
        
        @Override
        public AbilityEmbryoOuterClass.AbilityEmbryo getAbilityEmbryoList(final int index) {
            return this.abilityEmbryoList_.get(index);
        }
        
        @Override
        public AbilityEmbryoOuterClass.AbilityEmbryoOrBuilder getAbilityEmbryoListOrBuilder(final int index) {
            return this.abilityEmbryoList_.get(index);
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
            for (int i = 0; i < this.abilityEmbryoList_.size(); ++i) {
                output.writeMessage(1, this.abilityEmbryoList_.get(i));
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
            for (int i = 0; i < this.abilityEmbryoList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(1, this.abilityEmbryoList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbilityControlBlock)) {
                return super.equals(obj);
            }
            final AbilityControlBlock other = (AbilityControlBlock)obj;
            return this.getAbilityEmbryoListList().equals(other.getAbilityEmbryoListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getAbilityEmbryoListCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getAbilityEmbryoListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AbilityControlBlock parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AbilityControlBlock.PARSER.parseFrom(data);
        }
        
        public static AbilityControlBlock parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityControlBlock.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityControlBlock parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AbilityControlBlock.PARSER.parseFrom(data);
        }
        
        public static AbilityControlBlock parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityControlBlock.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityControlBlock parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AbilityControlBlock.PARSER.parseFrom(data);
        }
        
        public static AbilityControlBlock parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityControlBlock.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityControlBlock parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityControlBlock.PARSER, input);
        }
        
        public static AbilityControlBlock parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityControlBlock.PARSER, input, extensionRegistry);
        }
        
        public static AbilityControlBlock parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityControlBlock.PARSER, input);
        }
        
        public static AbilityControlBlock parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityControlBlock.PARSER, input, extensionRegistry);
        }
        
        public static AbilityControlBlock parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityControlBlock.PARSER, input);
        }
        
        public static AbilityControlBlock parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityControlBlock.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AbilityControlBlock.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AbilityControlBlock prototype) {
            return AbilityControlBlock.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AbilityControlBlock.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AbilityControlBlock getDefaultInstance() {
            return AbilityControlBlock.DEFAULT_INSTANCE;
        }
        
        public static Parser<AbilityControlBlock> parser() {
            return AbilityControlBlock.PARSER;
        }
        
        @Override
        public Parser<AbilityControlBlock> getParserForType() {
            return AbilityControlBlock.PARSER;
        }
        
        @Override
        public AbilityControlBlock getDefaultInstanceForType() {
            return AbilityControlBlock.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AbilityControlBlock();
            PARSER = new AbstractParser<AbilityControlBlock>() {
                @Override
                public AbilityControlBlock parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AbilityControlBlock(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AbilityControlBlockOrBuilder
        {
            private int bitField0_;
            private List<AbilityEmbryoOuterClass.AbilityEmbryo> abilityEmbryoList_;
            private RepeatedFieldBuilderV3<AbilityEmbryoOuterClass.AbilityEmbryo, AbilityEmbryoOuterClass.AbilityEmbryo.Builder, AbilityEmbryoOuterClass.AbilityEmbryoOrBuilder> abilityEmbryoListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AbilityControlBlockOuterClass.internal_static_AbilityControlBlock_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AbilityControlBlockOuterClass.internal_static_AbilityControlBlock_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityControlBlock.class, Builder.class);
            }
            
            private Builder() {
                this.abilityEmbryoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.abilityEmbryoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AbilityControlBlock.alwaysUseFieldBuilders) {
                    this.getAbilityEmbryoListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.abilityEmbryoListBuilder_ == null) {
                    this.abilityEmbryoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.abilityEmbryoListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AbilityControlBlockOuterClass.internal_static_AbilityControlBlock_descriptor;
            }
            
            @Override
            public AbilityControlBlock getDefaultInstanceForType() {
                return AbilityControlBlock.getDefaultInstance();
            }
            
            @Override
            public AbilityControlBlock build() {
                final AbilityControlBlock result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AbilityControlBlock buildPartial() {
                final AbilityControlBlock result = new AbilityControlBlock(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.abilityEmbryoListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.abilityEmbryoList_ = Collections.unmodifiableList((List<? extends AbilityEmbryoOuterClass.AbilityEmbryo>)this.abilityEmbryoList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.abilityEmbryoList_ = this.abilityEmbryoList_;
                }
                else {
                    result.abilityEmbryoList_ = this.abilityEmbryoListBuilder_.build();
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
                if (other instanceof AbilityControlBlock) {
                    return this.mergeFrom((AbilityControlBlock)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AbilityControlBlock other) {
                if (other == AbilityControlBlock.getDefaultInstance()) {
                    return this;
                }
                if (this.abilityEmbryoListBuilder_ == null) {
                    if (!other.abilityEmbryoList_.isEmpty()) {
                        if (this.abilityEmbryoList_.isEmpty()) {
                            this.abilityEmbryoList_ = other.abilityEmbryoList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureAbilityEmbryoListIsMutable();
                            this.abilityEmbryoList_.addAll(other.abilityEmbryoList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.abilityEmbryoList_.isEmpty()) {
                    if (this.abilityEmbryoListBuilder_.isEmpty()) {
                        this.abilityEmbryoListBuilder_.dispose();
                        this.abilityEmbryoListBuilder_ = null;
                        this.abilityEmbryoList_ = other.abilityEmbryoList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.abilityEmbryoListBuilder_ = (AbilityControlBlock.alwaysUseFieldBuilders ? this.getAbilityEmbryoListFieldBuilder() : null);
                    }
                    else {
                        this.abilityEmbryoListBuilder_.addAllMessages(other.abilityEmbryoList_);
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
                AbilityControlBlock parsedMessage = null;
                try {
                    parsedMessage = AbilityControlBlock.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AbilityControlBlock)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureAbilityEmbryoListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.abilityEmbryoList_ = new ArrayList<AbilityEmbryoOuterClass.AbilityEmbryo>(this.abilityEmbryoList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<AbilityEmbryoOuterClass.AbilityEmbryo> getAbilityEmbryoListList() {
                if (this.abilityEmbryoListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends AbilityEmbryoOuterClass.AbilityEmbryo>)this.abilityEmbryoList_);
                }
                return this.abilityEmbryoListBuilder_.getMessageList();
            }
            
            @Override
            public int getAbilityEmbryoListCount() {
                if (this.abilityEmbryoListBuilder_ == null) {
                    return this.abilityEmbryoList_.size();
                }
                return this.abilityEmbryoListBuilder_.getCount();
            }
            
            @Override
            public AbilityEmbryoOuterClass.AbilityEmbryo getAbilityEmbryoList(final int index) {
                if (this.abilityEmbryoListBuilder_ == null) {
                    return this.abilityEmbryoList_.get(index);
                }
                return this.abilityEmbryoListBuilder_.getMessage(index);
            }
            
            public Builder setAbilityEmbryoList(final int index, final AbilityEmbryoOuterClass.AbilityEmbryo value) {
                if (this.abilityEmbryoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureAbilityEmbryoListIsMutable();
                    this.abilityEmbryoList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.abilityEmbryoListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setAbilityEmbryoList(final int index, final AbilityEmbryoOuterClass.AbilityEmbryo.Builder builderForValue) {
                if (this.abilityEmbryoListBuilder_ == null) {
                    this.ensureAbilityEmbryoListIsMutable();
                    this.abilityEmbryoList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.abilityEmbryoListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAbilityEmbryoList(final AbilityEmbryoOuterClass.AbilityEmbryo value) {
                if (this.abilityEmbryoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureAbilityEmbryoListIsMutable();
                    this.abilityEmbryoList_.add(value);
                    this.onChanged();
                }
                else {
                    this.abilityEmbryoListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addAbilityEmbryoList(final int index, final AbilityEmbryoOuterClass.AbilityEmbryo value) {
                if (this.abilityEmbryoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureAbilityEmbryoListIsMutable();
                    this.abilityEmbryoList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.abilityEmbryoListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addAbilityEmbryoList(final AbilityEmbryoOuterClass.AbilityEmbryo.Builder builderForValue) {
                if (this.abilityEmbryoListBuilder_ == null) {
                    this.ensureAbilityEmbryoListIsMutable();
                    this.abilityEmbryoList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.abilityEmbryoListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addAbilityEmbryoList(final int index, final AbilityEmbryoOuterClass.AbilityEmbryo.Builder builderForValue) {
                if (this.abilityEmbryoListBuilder_ == null) {
                    this.ensureAbilityEmbryoListIsMutable();
                    this.abilityEmbryoList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.abilityEmbryoListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllAbilityEmbryoList(final Iterable<? extends AbilityEmbryoOuterClass.AbilityEmbryo> values) {
                if (this.abilityEmbryoListBuilder_ == null) {
                    this.ensureAbilityEmbryoListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.abilityEmbryoList_);
                    this.onChanged();
                }
                else {
                    this.abilityEmbryoListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearAbilityEmbryoList() {
                if (this.abilityEmbryoListBuilder_ == null) {
                    this.abilityEmbryoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.abilityEmbryoListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeAbilityEmbryoList(final int index) {
                if (this.abilityEmbryoListBuilder_ == null) {
                    this.ensureAbilityEmbryoListIsMutable();
                    this.abilityEmbryoList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.abilityEmbryoListBuilder_.remove(index);
                }
                return this;
            }
            
            public AbilityEmbryoOuterClass.AbilityEmbryo.Builder getAbilityEmbryoListBuilder(final int index) {
                return this.getAbilityEmbryoListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public AbilityEmbryoOuterClass.AbilityEmbryoOrBuilder getAbilityEmbryoListOrBuilder(final int index) {
                if (this.abilityEmbryoListBuilder_ == null) {
                    return this.abilityEmbryoList_.get(index);
                }
                return this.abilityEmbryoListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends AbilityEmbryoOuterClass.AbilityEmbryoOrBuilder> getAbilityEmbryoListOrBuilderList() {
                if (this.abilityEmbryoListBuilder_ != null) {
                    return this.abilityEmbryoListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends AbilityEmbryoOuterClass.AbilityEmbryoOrBuilder>)this.abilityEmbryoList_);
            }
            
            public AbilityEmbryoOuterClass.AbilityEmbryo.Builder addAbilityEmbryoListBuilder() {
                return this.getAbilityEmbryoListFieldBuilder().addBuilder(AbilityEmbryoOuterClass.AbilityEmbryo.getDefaultInstance());
            }
            
            public AbilityEmbryoOuterClass.AbilityEmbryo.Builder addAbilityEmbryoListBuilder(final int index) {
                return this.getAbilityEmbryoListFieldBuilder().addBuilder(index, AbilityEmbryoOuterClass.AbilityEmbryo.getDefaultInstance());
            }
            
            public List<AbilityEmbryoOuterClass.AbilityEmbryo.Builder> getAbilityEmbryoListBuilderList() {
                return this.getAbilityEmbryoListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<AbilityEmbryoOuterClass.AbilityEmbryo, AbilityEmbryoOuterClass.AbilityEmbryo.Builder, AbilityEmbryoOuterClass.AbilityEmbryoOrBuilder> getAbilityEmbryoListFieldBuilder() {
                if (this.abilityEmbryoListBuilder_ == null) {
                    this.abilityEmbryoListBuilder_ = new RepeatedFieldBuilderV3<AbilityEmbryoOuterClass.AbilityEmbryo, AbilityEmbryoOuterClass.AbilityEmbryo.Builder, AbilityEmbryoOuterClass.AbilityEmbryoOrBuilder>(this.abilityEmbryoList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.abilityEmbryoList_ = null;
                }
                return this.abilityEmbryoListBuilder_;
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
    
    public interface AbilityControlBlockOrBuilder extends MessageOrBuilder
    {
        List<AbilityEmbryoOuterClass.AbilityEmbryo> getAbilityEmbryoListList();
        
        AbilityEmbryoOuterClass.AbilityEmbryo getAbilityEmbryoList(final int p0);
        
        int getAbilityEmbryoListCount();
        
        List<? extends AbilityEmbryoOuterClass.AbilityEmbryoOrBuilder> getAbilityEmbryoListOrBuilderList();
        
        AbilityEmbryoOuterClass.AbilityEmbryoOrBuilder getAbilityEmbryoListOrBuilder(final int p0);
    }
}
