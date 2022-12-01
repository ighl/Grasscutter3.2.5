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

public final class AbilityChangeNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_AbilityChangeNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AbilityChangeNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AbilityChangeNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AbilityChangeNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019AbilityChangeNotify.proto\u001a\u0019AbilityControlBlock.proto\"]\n\u0013AbilityChangeNotify\u0012\u0011\n\tentity_id\u0018\u0001 \u0001(\r\u00123\n\u0015ability_control_block\u0018\u000f \u0001(\u000b2\u0014.AbilityControlBlockB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AbilityChangeNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AbilityControlBlockOuterClass.getDescriptor() });
        internal_static_AbilityChangeNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AbilityChangeNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AbilityChangeNotifyOuterClass.internal_static_AbilityChangeNotify_descriptor, new String[] { "EntityId", "AbilityControlBlock" });
        AbilityControlBlockOuterClass.getDescriptor();
    }
    
    public static final class AbilityChangeNotify extends GeneratedMessageV3 implements AbilityChangeNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ENTITY_ID_FIELD_NUMBER = 1;
        private int entityId_;
        public static final int ABILITY_CONTROL_BLOCK_FIELD_NUMBER = 15;
        private AbilityControlBlockOuterClass.AbilityControlBlock abilityControlBlock_;
        private byte memoizedIsInitialized;
        private static final AbilityChangeNotify DEFAULT_INSTANCE;
        private static final Parser<AbilityChangeNotify> PARSER;
        
        private AbilityChangeNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AbilityChangeNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AbilityChangeNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AbilityChangeNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.entityId_ = input.readUInt32();
                            continue;
                        }
                        case 122: {
                            AbilityControlBlockOuterClass.AbilityControlBlock.Builder subBuilder = null;
                            if (this.abilityControlBlock_ != null) {
                                subBuilder = this.abilityControlBlock_.toBuilder();
                            }
                            this.abilityControlBlock_ = input.readMessage(AbilityControlBlockOuterClass.AbilityControlBlock.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.abilityControlBlock_);
                                this.abilityControlBlock_ = subBuilder.buildPartial();
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
            return AbilityChangeNotifyOuterClass.internal_static_AbilityChangeNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AbilityChangeNotifyOuterClass.internal_static_AbilityChangeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityChangeNotify.class, Builder.class);
        }
        
        @Override
        public int getEntityId() {
            return this.entityId_;
        }
        
        @Override
        public boolean hasAbilityControlBlock() {
            return this.abilityControlBlock_ != null;
        }
        
        @Override
        public AbilityControlBlockOuterClass.AbilityControlBlock getAbilityControlBlock() {
            return (this.abilityControlBlock_ == null) ? AbilityControlBlockOuterClass.AbilityControlBlock.getDefaultInstance() : this.abilityControlBlock_;
        }
        
        @Override
        public AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder getAbilityControlBlockOrBuilder() {
            return this.getAbilityControlBlock();
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
            if (this.entityId_ != 0) {
                output.writeUInt32(1, this.entityId_);
            }
            if (this.abilityControlBlock_ != null) {
                output.writeMessage(15, this.getAbilityControlBlock());
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
            if (this.entityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.entityId_);
            }
            if (this.abilityControlBlock_ != null) {
                size += CodedOutputStream.computeMessageSize(15, this.getAbilityControlBlock());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbilityChangeNotify)) {
                return super.equals(obj);
            }
            final AbilityChangeNotify other = (AbilityChangeNotify)obj;
            return this.getEntityId() == other.getEntityId() && this.hasAbilityControlBlock() == other.hasAbilityControlBlock() && (!this.hasAbilityControlBlock() || this.getAbilityControlBlock().equals(other.getAbilityControlBlock())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getEntityId();
            if (this.hasAbilityControlBlock()) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getAbilityControlBlock().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AbilityChangeNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AbilityChangeNotify.PARSER.parseFrom(data);
        }
        
        public static AbilityChangeNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityChangeNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AbilityChangeNotify.PARSER.parseFrom(data);
        }
        
        public static AbilityChangeNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityChangeNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AbilityChangeNotify.PARSER.parseFrom(data);
        }
        
        public static AbilityChangeNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityChangeNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityChangeNotify.PARSER, input);
        }
        
        public static AbilityChangeNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityChangeNotify.PARSER, input, extensionRegistry);
        }
        
        public static AbilityChangeNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityChangeNotify.PARSER, input);
        }
        
        public static AbilityChangeNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityChangeNotify.PARSER, input, extensionRegistry);
        }
        
        public static AbilityChangeNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityChangeNotify.PARSER, input);
        }
        
        public static AbilityChangeNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityChangeNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AbilityChangeNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AbilityChangeNotify prototype) {
            return AbilityChangeNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AbilityChangeNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AbilityChangeNotify getDefaultInstance() {
            return AbilityChangeNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<AbilityChangeNotify> parser() {
            return AbilityChangeNotify.PARSER;
        }
        
        @Override
        public Parser<AbilityChangeNotify> getParserForType() {
            return AbilityChangeNotify.PARSER;
        }
        
        @Override
        public AbilityChangeNotify getDefaultInstanceForType() {
            return AbilityChangeNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AbilityChangeNotify();
            PARSER = new AbstractParser<AbilityChangeNotify>() {
                @Override
                public AbilityChangeNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AbilityChangeNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AbilityChangeNotifyOrBuilder
        {
            private int entityId_;
            private AbilityControlBlockOuterClass.AbilityControlBlock abilityControlBlock_;
            private SingleFieldBuilderV3<AbilityControlBlockOuterClass.AbilityControlBlock, AbilityControlBlockOuterClass.AbilityControlBlock.Builder, AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder> abilityControlBlockBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AbilityChangeNotifyOuterClass.internal_static_AbilityChangeNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AbilityChangeNotifyOuterClass.internal_static_AbilityChangeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityChangeNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AbilityChangeNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.entityId_ = 0;
                if (this.abilityControlBlockBuilder_ == null) {
                    this.abilityControlBlock_ = null;
                }
                else {
                    this.abilityControlBlock_ = null;
                    this.abilityControlBlockBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AbilityChangeNotifyOuterClass.internal_static_AbilityChangeNotify_descriptor;
            }
            
            @Override
            public AbilityChangeNotify getDefaultInstanceForType() {
                return AbilityChangeNotify.getDefaultInstance();
            }
            
            @Override
            public AbilityChangeNotify build() {
                final AbilityChangeNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AbilityChangeNotify buildPartial() {
                final AbilityChangeNotify result = new AbilityChangeNotify(this);
                result.entityId_ = this.entityId_;
                if (this.abilityControlBlockBuilder_ == null) {
                    result.abilityControlBlock_ = this.abilityControlBlock_;
                }
                else {
                    result.abilityControlBlock_ = this.abilityControlBlockBuilder_.build();
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
                if (other instanceof AbilityChangeNotify) {
                    return this.mergeFrom((AbilityChangeNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AbilityChangeNotify other) {
                if (other == AbilityChangeNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
                }
                if (other.hasAbilityControlBlock()) {
                    this.mergeAbilityControlBlock(other.getAbilityControlBlock());
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
                AbilityChangeNotify parsedMessage = null;
                try {
                    parsedMessage = AbilityChangeNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AbilityChangeNotify)e.getUnfinishedMessage();
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
            public int getEntityId() {
                return this.entityId_;
            }
            
            public Builder setEntityId(final int value) {
                this.entityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEntityId() {
                this.entityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasAbilityControlBlock() {
                return this.abilityControlBlockBuilder_ != null || this.abilityControlBlock_ != null;
            }
            
            @Override
            public AbilityControlBlockOuterClass.AbilityControlBlock getAbilityControlBlock() {
                if (this.abilityControlBlockBuilder_ == null) {
                    return (this.abilityControlBlock_ == null) ? AbilityControlBlockOuterClass.AbilityControlBlock.getDefaultInstance() : this.abilityControlBlock_;
                }
                return this.abilityControlBlockBuilder_.getMessage();
            }
            
            public Builder setAbilityControlBlock(final AbilityControlBlockOuterClass.AbilityControlBlock value) {
                if (this.abilityControlBlockBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.abilityControlBlock_ = value;
                    this.onChanged();
                }
                else {
                    this.abilityControlBlockBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setAbilityControlBlock(final AbilityControlBlockOuterClass.AbilityControlBlock.Builder builderForValue) {
                if (this.abilityControlBlockBuilder_ == null) {
                    this.abilityControlBlock_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.abilityControlBlockBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeAbilityControlBlock(final AbilityControlBlockOuterClass.AbilityControlBlock value) {
                if (this.abilityControlBlockBuilder_ == null) {
                    if (this.abilityControlBlock_ != null) {
                        this.abilityControlBlock_ = AbilityControlBlockOuterClass.AbilityControlBlock.newBuilder(this.abilityControlBlock_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.abilityControlBlock_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.abilityControlBlockBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearAbilityControlBlock() {
                if (this.abilityControlBlockBuilder_ == null) {
                    this.abilityControlBlock_ = null;
                    this.onChanged();
                }
                else {
                    this.abilityControlBlock_ = null;
                    this.abilityControlBlockBuilder_ = null;
                }
                return this;
            }
            
            public AbilityControlBlockOuterClass.AbilityControlBlock.Builder getAbilityControlBlockBuilder() {
                this.onChanged();
                return this.getAbilityControlBlockFieldBuilder().getBuilder();
            }
            
            @Override
            public AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder getAbilityControlBlockOrBuilder() {
                if (this.abilityControlBlockBuilder_ != null) {
                    return this.abilityControlBlockBuilder_.getMessageOrBuilder();
                }
                return (this.abilityControlBlock_ == null) ? AbilityControlBlockOuterClass.AbilityControlBlock.getDefaultInstance() : this.abilityControlBlock_;
            }
            
            private SingleFieldBuilderV3<AbilityControlBlockOuterClass.AbilityControlBlock, AbilityControlBlockOuterClass.AbilityControlBlock.Builder, AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder> getAbilityControlBlockFieldBuilder() {
                if (this.abilityControlBlockBuilder_ == null) {
                    this.abilityControlBlockBuilder_ = new SingleFieldBuilderV3<AbilityControlBlockOuterClass.AbilityControlBlock, AbilityControlBlockOuterClass.AbilityControlBlock.Builder, AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder>(this.getAbilityControlBlock(), this.getParentForChildren(), this.isClean());
                    this.abilityControlBlock_ = null;
                }
                return this.abilityControlBlockBuilder_;
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
    
    public interface AbilityChangeNotifyOrBuilder extends MessageOrBuilder
    {
        int getEntityId();
        
        boolean hasAbilityControlBlock();
        
        AbilityControlBlockOuterClass.AbilityControlBlock getAbilityControlBlock();
        
        AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder getAbilityControlBlockOrBuilder();
    }
}
