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

public final class EvtAnimatorParameterInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_EvtAnimatorParameterInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EvtAnimatorParameterInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private EvtAnimatorParameterInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return EvtAnimatorParameterInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001eEvtAnimatorParameterInfo.proto\u001a AnimatorParameterValueInfo.proto\"\u0083\u0001\n\u0018EvtAnimatorParameterInfo\u0012\u0011\n\tentity_id\u0018\u0004 \u0001(\r\u0012\u0017\n\u000fis_server_cache\u0018\u0005 \u0001(\b\u0012*\n\u0005value\u0018\u0007 \u0001(\u000b2\u001b.AnimatorParameterValueInfo\u0012\u000f\n\u0007name_id\u0018\u000f \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        EvtAnimatorParameterInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AnimatorParameterValueInfoOuterClass.getDescriptor() });
        internal_static_EvtAnimatorParameterInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_EvtAnimatorParameterInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(EvtAnimatorParameterInfoOuterClass.internal_static_EvtAnimatorParameterInfo_descriptor, new String[] { "EntityId", "IsServerCache", "Value", "NameId" });
        AnimatorParameterValueInfoOuterClass.getDescriptor();
    }
    
    public static final class EvtAnimatorParameterInfo extends GeneratedMessageV3 implements EvtAnimatorParameterInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ENTITY_ID_FIELD_NUMBER = 4;
        private int entityId_;
        public static final int IS_SERVER_CACHE_FIELD_NUMBER = 5;
        private boolean isServerCache_;
        public static final int VALUE_FIELD_NUMBER = 7;
        private AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo value_;
        public static final int NAME_ID_FIELD_NUMBER = 15;
        private int nameId_;
        private byte memoizedIsInitialized;
        private static final EvtAnimatorParameterInfo DEFAULT_INSTANCE;
        private static final Parser<EvtAnimatorParameterInfo> PARSER;
        
        private EvtAnimatorParameterInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private EvtAnimatorParameterInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new EvtAnimatorParameterInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private EvtAnimatorParameterInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 32: {
                            this.entityId_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.isServerCache_ = input.readBool();
                            continue;
                        }
                        case 58: {
                            AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.Builder subBuilder = null;
                            if (this.value_ != null) {
                                subBuilder = this.value_.toBuilder();
                            }
                            this.value_ = input.readMessage(AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.value_);
                                this.value_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 120: {
                            this.nameId_ = input.readInt32();
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
            return EvtAnimatorParameterInfoOuterClass.internal_static_EvtAnimatorParameterInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return EvtAnimatorParameterInfoOuterClass.internal_static_EvtAnimatorParameterInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(EvtAnimatorParameterInfo.class, Builder.class);
        }
        
        @Override
        public int getEntityId() {
            return this.entityId_;
        }
        
        @Override
        public boolean getIsServerCache() {
            return this.isServerCache_;
        }
        
        @Override
        public boolean hasValue() {
            return this.value_ != null;
        }
        
        @Override
        public AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo getValue() {
            return (this.value_ == null) ? AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.getDefaultInstance() : this.value_;
        }
        
        @Override
        public AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfoOrBuilder getValueOrBuilder() {
            return this.getValue();
        }
        
        @Override
        public int getNameId() {
            return this.nameId_;
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
                output.writeUInt32(4, this.entityId_);
            }
            if (this.isServerCache_) {
                output.writeBool(5, this.isServerCache_);
            }
            if (this.value_ != null) {
                output.writeMessage(7, this.getValue());
            }
            if (this.nameId_ != 0) {
                output.writeInt32(15, this.nameId_);
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
                size += CodedOutputStream.computeUInt32Size(4, this.entityId_);
            }
            if (this.isServerCache_) {
                size += CodedOutputStream.computeBoolSize(5, this.isServerCache_);
            }
            if (this.value_ != null) {
                size += CodedOutputStream.computeMessageSize(7, this.getValue());
            }
            if (this.nameId_ != 0) {
                size += CodedOutputStream.computeInt32Size(15, this.nameId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EvtAnimatorParameterInfo)) {
                return super.equals(obj);
            }
            final EvtAnimatorParameterInfo other = (EvtAnimatorParameterInfo)obj;
            return this.getEntityId() == other.getEntityId() && this.getIsServerCache() == other.getIsServerCache() && this.hasValue() == other.hasValue() && (!this.hasValue() || this.getValue().equals(other.getValue())) && this.getNameId() == other.getNameId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getEntityId();
            hash = 37 * hash + 5;
            hash = 53 * hash + Internal.hashBoolean(this.getIsServerCache());
            if (this.hasValue()) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.getValue().hashCode();
            }
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getNameId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static EvtAnimatorParameterInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return EvtAnimatorParameterInfo.PARSER.parseFrom(data);
        }
        
        public static EvtAnimatorParameterInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EvtAnimatorParameterInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EvtAnimatorParameterInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return EvtAnimatorParameterInfo.PARSER.parseFrom(data);
        }
        
        public static EvtAnimatorParameterInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EvtAnimatorParameterInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EvtAnimatorParameterInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return EvtAnimatorParameterInfo.PARSER.parseFrom(data);
        }
        
        public static EvtAnimatorParameterInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EvtAnimatorParameterInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EvtAnimatorParameterInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EvtAnimatorParameterInfo.PARSER, input);
        }
        
        public static EvtAnimatorParameterInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EvtAnimatorParameterInfo.PARSER, input, extensionRegistry);
        }
        
        public static EvtAnimatorParameterInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EvtAnimatorParameterInfo.PARSER, input);
        }
        
        public static EvtAnimatorParameterInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EvtAnimatorParameterInfo.PARSER, input, extensionRegistry);
        }
        
        public static EvtAnimatorParameterInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EvtAnimatorParameterInfo.PARSER, input);
        }
        
        public static EvtAnimatorParameterInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EvtAnimatorParameterInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return EvtAnimatorParameterInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final EvtAnimatorParameterInfo prototype) {
            return EvtAnimatorParameterInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == EvtAnimatorParameterInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static EvtAnimatorParameterInfo getDefaultInstance() {
            return EvtAnimatorParameterInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<EvtAnimatorParameterInfo> parser() {
            return EvtAnimatorParameterInfo.PARSER;
        }
        
        @Override
        public Parser<EvtAnimatorParameterInfo> getParserForType() {
            return EvtAnimatorParameterInfo.PARSER;
        }
        
        @Override
        public EvtAnimatorParameterInfo getDefaultInstanceForType() {
            return EvtAnimatorParameterInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new EvtAnimatorParameterInfo();
            PARSER = new AbstractParser<EvtAnimatorParameterInfo>() {
                @Override
                public EvtAnimatorParameterInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new EvtAnimatorParameterInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EvtAnimatorParameterInfoOrBuilder
        {
            private int entityId_;
            private boolean isServerCache_;
            private AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo value_;
            private SingleFieldBuilderV3<AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo, AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.Builder, AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfoOrBuilder> valueBuilder_;
            private int nameId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return EvtAnimatorParameterInfoOuterClass.internal_static_EvtAnimatorParameterInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return EvtAnimatorParameterInfoOuterClass.internal_static_EvtAnimatorParameterInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(EvtAnimatorParameterInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (EvtAnimatorParameterInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.entityId_ = 0;
                this.isServerCache_ = false;
                if (this.valueBuilder_ == null) {
                    this.value_ = null;
                }
                else {
                    this.value_ = null;
                    this.valueBuilder_ = null;
                }
                this.nameId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return EvtAnimatorParameterInfoOuterClass.internal_static_EvtAnimatorParameterInfo_descriptor;
            }
            
            @Override
            public EvtAnimatorParameterInfo getDefaultInstanceForType() {
                return EvtAnimatorParameterInfo.getDefaultInstance();
            }
            
            @Override
            public EvtAnimatorParameterInfo build() {
                final EvtAnimatorParameterInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public EvtAnimatorParameterInfo buildPartial() {
                final EvtAnimatorParameterInfo result = new EvtAnimatorParameterInfo(this);
                result.entityId_ = this.entityId_;
                result.isServerCache_ = this.isServerCache_;
                if (this.valueBuilder_ == null) {
                    result.value_ = this.value_;
                }
                else {
                    result.value_ = this.valueBuilder_.build();
                }
                result.nameId_ = this.nameId_;
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
                if (other instanceof EvtAnimatorParameterInfo) {
                    return this.mergeFrom((EvtAnimatorParameterInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final EvtAnimatorParameterInfo other) {
                if (other == EvtAnimatorParameterInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
                }
                if (other.getIsServerCache()) {
                    this.setIsServerCache(other.getIsServerCache());
                }
                if (other.hasValue()) {
                    this.mergeValue(other.getValue());
                }
                if (other.getNameId() != 0) {
                    this.setNameId(other.getNameId());
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
                EvtAnimatorParameterInfo parsedMessage = null;
                try {
                    parsedMessage = EvtAnimatorParameterInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (EvtAnimatorParameterInfo)e.getUnfinishedMessage();
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
            public boolean getIsServerCache() {
                return this.isServerCache_;
            }
            
            public Builder setIsServerCache(final boolean value) {
                this.isServerCache_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsServerCache() {
                this.isServerCache_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasValue() {
                return this.valueBuilder_ != null || this.value_ != null;
            }
            
            @Override
            public AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo getValue() {
                if (this.valueBuilder_ == null) {
                    return (this.value_ == null) ? AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.getDefaultInstance() : this.value_;
                }
                return this.valueBuilder_.getMessage();
            }
            
            public Builder setValue(final AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo value) {
                if (this.valueBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.value_ = value;
                    this.onChanged();
                }
                else {
                    this.valueBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setValue(final AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.Builder builderForValue) {
                if (this.valueBuilder_ == null) {
                    this.value_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.valueBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeValue(final AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo value) {
                if (this.valueBuilder_ == null) {
                    if (this.value_ != null) {
                        this.value_ = AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.newBuilder(this.value_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.value_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.valueBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearValue() {
                if (this.valueBuilder_ == null) {
                    this.value_ = null;
                    this.onChanged();
                }
                else {
                    this.value_ = null;
                    this.valueBuilder_ = null;
                }
                return this;
            }
            
            public AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.Builder getValueBuilder() {
                this.onChanged();
                return this.getValueFieldBuilder().getBuilder();
            }
            
            @Override
            public AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfoOrBuilder getValueOrBuilder() {
                if (this.valueBuilder_ != null) {
                    return this.valueBuilder_.getMessageOrBuilder();
                }
                return (this.value_ == null) ? AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.getDefaultInstance() : this.value_;
            }
            
            private SingleFieldBuilderV3<AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo, AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.Builder, AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfoOrBuilder> getValueFieldBuilder() {
                if (this.valueBuilder_ == null) {
                    this.valueBuilder_ = new SingleFieldBuilderV3<AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo, AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.Builder, AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfoOrBuilder>(this.getValue(), this.getParentForChildren(), this.isClean());
                    this.value_ = null;
                }
                return this.valueBuilder_;
            }
            
            @Override
            public int getNameId() {
                return this.nameId_;
            }
            
            public Builder setNameId(final int value) {
                this.nameId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearNameId() {
                this.nameId_ = 0;
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
    
    public interface EvtAnimatorParameterInfoOrBuilder extends MessageOrBuilder
    {
        int getEntityId();
        
        boolean getIsServerCache();
        
        boolean hasValue();
        
        AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo getValue();
        
        AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfoOrBuilder getValueOrBuilder();
        
        int getNameId();
    }
}
