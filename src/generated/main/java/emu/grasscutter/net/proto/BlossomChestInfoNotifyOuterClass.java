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

public final class BlossomChestInfoNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_BlossomChestInfoNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BlossomChestInfoNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private BlossomChestInfoNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return BlossomChestInfoNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cBlossomChestInfoNotify.proto\u001a\u0016BlossomChestInfo.proto\"Z\n\u0016BlossomChestInfoNotify\u0012\u0011\n\tentity_id\u0018\t \u0001(\r\u0012-\n\u0012blossom_chest_info\u0018\u0003 \u0001(\u000b2\u0011.BlossomChestInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        BlossomChestInfoNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { BlossomChestInfoOuterClass.getDescriptor() });
        internal_static_BlossomChestInfoNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_BlossomChestInfoNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(BlossomChestInfoNotifyOuterClass.internal_static_BlossomChestInfoNotify_descriptor, new String[] { "EntityId", "BlossomChestInfo" });
        BlossomChestInfoOuterClass.getDescriptor();
    }
    
    public static final class BlossomChestInfoNotify extends GeneratedMessageV3 implements BlossomChestInfoNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ENTITY_ID_FIELD_NUMBER = 9;
        private int entityId_;
        public static final int BLOSSOM_CHEST_INFO_FIELD_NUMBER = 3;
        private BlossomChestInfoOuterClass.BlossomChestInfo blossomChestInfo_;
        private byte memoizedIsInitialized;
        private static final BlossomChestInfoNotify DEFAULT_INSTANCE;
        private static final Parser<BlossomChestInfoNotify> PARSER;
        
        private BlossomChestInfoNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private BlossomChestInfoNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new BlossomChestInfoNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private BlossomChestInfoNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 26: {
                            BlossomChestInfoOuterClass.BlossomChestInfo.Builder subBuilder = null;
                            if (this.blossomChestInfo_ != null) {
                                subBuilder = this.blossomChestInfo_.toBuilder();
                            }
                            this.blossomChestInfo_ = input.readMessage(BlossomChestInfoOuterClass.BlossomChestInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.blossomChestInfo_);
                                this.blossomChestInfo_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 72: {
                            this.entityId_ = input.readUInt32();
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
            return BlossomChestInfoNotifyOuterClass.internal_static_BlossomChestInfoNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return BlossomChestInfoNotifyOuterClass.internal_static_BlossomChestInfoNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(BlossomChestInfoNotify.class, Builder.class);
        }
        
        @Override
        public int getEntityId() {
            return this.entityId_;
        }
        
        @Override
        public boolean hasBlossomChestInfo() {
            return this.blossomChestInfo_ != null;
        }
        
        @Override
        public BlossomChestInfoOuterClass.BlossomChestInfo getBlossomChestInfo() {
            return (this.blossomChestInfo_ == null) ? BlossomChestInfoOuterClass.BlossomChestInfo.getDefaultInstance() : this.blossomChestInfo_;
        }
        
        @Override
        public BlossomChestInfoOuterClass.BlossomChestInfoOrBuilder getBlossomChestInfoOrBuilder() {
            return this.getBlossomChestInfo();
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
            if (this.blossomChestInfo_ != null) {
                output.writeMessage(3, this.getBlossomChestInfo());
            }
            if (this.entityId_ != 0) {
                output.writeUInt32(9, this.entityId_);
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
            if (this.blossomChestInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(3, this.getBlossomChestInfo());
            }
            if (this.entityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.entityId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BlossomChestInfoNotify)) {
                return super.equals(obj);
            }
            final BlossomChestInfoNotify other = (BlossomChestInfoNotify)obj;
            return this.getEntityId() == other.getEntityId() && this.hasBlossomChestInfo() == other.hasBlossomChestInfo() && (!this.hasBlossomChestInfo() || this.getBlossomChestInfo().equals(other.getBlossomChestInfo())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getEntityId();
            if (this.hasBlossomChestInfo()) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getBlossomChestInfo().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static BlossomChestInfoNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return BlossomChestInfoNotify.PARSER.parseFrom(data);
        }
        
        public static BlossomChestInfoNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BlossomChestInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BlossomChestInfoNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return BlossomChestInfoNotify.PARSER.parseFrom(data);
        }
        
        public static BlossomChestInfoNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BlossomChestInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BlossomChestInfoNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return BlossomChestInfoNotify.PARSER.parseFrom(data);
        }
        
        public static BlossomChestInfoNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BlossomChestInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BlossomChestInfoNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BlossomChestInfoNotify.PARSER, input);
        }
        
        public static BlossomChestInfoNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BlossomChestInfoNotify.PARSER, input, extensionRegistry);
        }
        
        public static BlossomChestInfoNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BlossomChestInfoNotify.PARSER, input);
        }
        
        public static BlossomChestInfoNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BlossomChestInfoNotify.PARSER, input, extensionRegistry);
        }
        
        public static BlossomChestInfoNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BlossomChestInfoNotify.PARSER, input);
        }
        
        public static BlossomChestInfoNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BlossomChestInfoNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return BlossomChestInfoNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final BlossomChestInfoNotify prototype) {
            return BlossomChestInfoNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == BlossomChestInfoNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static BlossomChestInfoNotify getDefaultInstance() {
            return BlossomChestInfoNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<BlossomChestInfoNotify> parser() {
            return BlossomChestInfoNotify.PARSER;
        }
        
        @Override
        public Parser<BlossomChestInfoNotify> getParserForType() {
            return BlossomChestInfoNotify.PARSER;
        }
        
        @Override
        public BlossomChestInfoNotify getDefaultInstanceForType() {
            return BlossomChestInfoNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new BlossomChestInfoNotify();
            PARSER = new AbstractParser<BlossomChestInfoNotify>() {
                @Override
                public BlossomChestInfoNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new BlossomChestInfoNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BlossomChestInfoNotifyOrBuilder
        {
            private int entityId_;
            private BlossomChestInfoOuterClass.BlossomChestInfo blossomChestInfo_;
            private SingleFieldBuilderV3<BlossomChestInfoOuterClass.BlossomChestInfo, BlossomChestInfoOuterClass.BlossomChestInfo.Builder, BlossomChestInfoOuterClass.BlossomChestInfoOrBuilder> blossomChestInfoBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return BlossomChestInfoNotifyOuterClass.internal_static_BlossomChestInfoNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return BlossomChestInfoNotifyOuterClass.internal_static_BlossomChestInfoNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(BlossomChestInfoNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (BlossomChestInfoNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.entityId_ = 0;
                if (this.blossomChestInfoBuilder_ == null) {
                    this.blossomChestInfo_ = null;
                }
                else {
                    this.blossomChestInfo_ = null;
                    this.blossomChestInfoBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return BlossomChestInfoNotifyOuterClass.internal_static_BlossomChestInfoNotify_descriptor;
            }
            
            @Override
            public BlossomChestInfoNotify getDefaultInstanceForType() {
                return BlossomChestInfoNotify.getDefaultInstance();
            }
            
            @Override
            public BlossomChestInfoNotify build() {
                final BlossomChestInfoNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public BlossomChestInfoNotify buildPartial() {
                final BlossomChestInfoNotify result = new BlossomChestInfoNotify(this);
                result.entityId_ = this.entityId_;
                if (this.blossomChestInfoBuilder_ == null) {
                    result.blossomChestInfo_ = this.blossomChestInfo_;
                }
                else {
                    result.blossomChestInfo_ = this.blossomChestInfoBuilder_.build();
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
                if (other instanceof BlossomChestInfoNotify) {
                    return this.mergeFrom((BlossomChestInfoNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final BlossomChestInfoNotify other) {
                if (other == BlossomChestInfoNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
                }
                if (other.hasBlossomChestInfo()) {
                    this.mergeBlossomChestInfo(other.getBlossomChestInfo());
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
                BlossomChestInfoNotify parsedMessage = null;
                try {
                    parsedMessage = BlossomChestInfoNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (BlossomChestInfoNotify)e.getUnfinishedMessage();
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
            public boolean hasBlossomChestInfo() {
                return this.blossomChestInfoBuilder_ != null || this.blossomChestInfo_ != null;
            }
            
            @Override
            public BlossomChestInfoOuterClass.BlossomChestInfo getBlossomChestInfo() {
                if (this.blossomChestInfoBuilder_ == null) {
                    return (this.blossomChestInfo_ == null) ? BlossomChestInfoOuterClass.BlossomChestInfo.getDefaultInstance() : this.blossomChestInfo_;
                }
                return this.blossomChestInfoBuilder_.getMessage();
            }
            
            public Builder setBlossomChestInfo(final BlossomChestInfoOuterClass.BlossomChestInfo value) {
                if (this.blossomChestInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.blossomChestInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.blossomChestInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setBlossomChestInfo(final BlossomChestInfoOuterClass.BlossomChestInfo.Builder builderForValue) {
                if (this.blossomChestInfoBuilder_ == null) {
                    this.blossomChestInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.blossomChestInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeBlossomChestInfo(final BlossomChestInfoOuterClass.BlossomChestInfo value) {
                if (this.blossomChestInfoBuilder_ == null) {
                    if (this.blossomChestInfo_ != null) {
                        this.blossomChestInfo_ = BlossomChestInfoOuterClass.BlossomChestInfo.newBuilder(this.blossomChestInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.blossomChestInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.blossomChestInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearBlossomChestInfo() {
                if (this.blossomChestInfoBuilder_ == null) {
                    this.blossomChestInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.blossomChestInfo_ = null;
                    this.blossomChestInfoBuilder_ = null;
                }
                return this;
            }
            
            public BlossomChestInfoOuterClass.BlossomChestInfo.Builder getBlossomChestInfoBuilder() {
                this.onChanged();
                return this.getBlossomChestInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public BlossomChestInfoOuterClass.BlossomChestInfoOrBuilder getBlossomChestInfoOrBuilder() {
                if (this.blossomChestInfoBuilder_ != null) {
                    return this.blossomChestInfoBuilder_.getMessageOrBuilder();
                }
                return (this.blossomChestInfo_ == null) ? BlossomChestInfoOuterClass.BlossomChestInfo.getDefaultInstance() : this.blossomChestInfo_;
            }
            
            private SingleFieldBuilderV3<BlossomChestInfoOuterClass.BlossomChestInfo, BlossomChestInfoOuterClass.BlossomChestInfo.Builder, BlossomChestInfoOuterClass.BlossomChestInfoOrBuilder> getBlossomChestInfoFieldBuilder() {
                if (this.blossomChestInfoBuilder_ == null) {
                    this.blossomChestInfoBuilder_ = new SingleFieldBuilderV3<BlossomChestInfoOuterClass.BlossomChestInfo, BlossomChestInfoOuterClass.BlossomChestInfo.Builder, BlossomChestInfoOuterClass.BlossomChestInfoOrBuilder>(this.getBlossomChestInfo(), this.getParentForChildren(), this.isClean());
                    this.blossomChestInfo_ = null;
                }
                return this.blossomChestInfoBuilder_;
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
    
    public interface BlossomChestInfoNotifyOrBuilder extends MessageOrBuilder
    {
        int getEntityId();
        
        boolean hasBlossomChestInfo();
        
        BlossomChestInfoOuterClass.BlossomChestInfo getBlossomChestInfo();
        
        BlossomChestInfoOuterClass.BlossomChestInfoOrBuilder getBlossomChestInfoOrBuilder();
    }
}
