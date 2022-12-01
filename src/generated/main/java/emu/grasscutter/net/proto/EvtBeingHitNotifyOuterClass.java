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

public final class EvtBeingHitNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_EvtBeingHitNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EvtBeingHitNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private EvtBeingHitNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return EvtBeingHitNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017EvtBeingHitNotify.proto\u001a\u0015EvtBeingHitInfo.proto\u001a\u0011ForwardType.proto\"a\n\u0011EvtBeingHitNotify\u0012\"\n\fforward_type\u0018\u0006 \u0001(\u000e2\f.ForwardType\u0012(\n\u000ebeing_hit_info\u0018\u0003 \u0001(\u000b2\u0010.EvtBeingHitInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        EvtBeingHitNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { EvtBeingHitInfoOuterClass.getDescriptor(), ForwardTypeOuterClass.getDescriptor() });
        internal_static_EvtBeingHitNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_EvtBeingHitNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(EvtBeingHitNotifyOuterClass.internal_static_EvtBeingHitNotify_descriptor, new String[] { "ForwardType", "BeingHitInfo" });
        EvtBeingHitInfoOuterClass.getDescriptor();
        ForwardTypeOuterClass.getDescriptor();
    }
    
    public static final class EvtBeingHitNotify extends GeneratedMessageV3 implements EvtBeingHitNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int FORWARD_TYPE_FIELD_NUMBER = 6;
        private int forwardType_;
        public static final int BEING_HIT_INFO_FIELD_NUMBER = 3;
        private EvtBeingHitInfoOuterClass.EvtBeingHitInfo beingHitInfo_;
        private byte memoizedIsInitialized;
        private static final EvtBeingHitNotify DEFAULT_INSTANCE;
        private static final Parser<EvtBeingHitNotify> PARSER;
        
        private EvtBeingHitNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private EvtBeingHitNotify() {
            this.memoizedIsInitialized = -1;
            this.forwardType_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new EvtBeingHitNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private EvtBeingHitNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            EvtBeingHitInfoOuterClass.EvtBeingHitInfo.Builder subBuilder = null;
                            if (this.beingHitInfo_ != null) {
                                subBuilder = this.beingHitInfo_.toBuilder();
                            }
                            this.beingHitInfo_ = input.readMessage(EvtBeingHitInfoOuterClass.EvtBeingHitInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.beingHitInfo_);
                                this.beingHitInfo_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 48: {
                            final int rawValue = input.readEnum();
                            this.forwardType_ = rawValue;
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
            return EvtBeingHitNotifyOuterClass.internal_static_EvtBeingHitNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return EvtBeingHitNotifyOuterClass.internal_static_EvtBeingHitNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(EvtBeingHitNotify.class, Builder.class);
        }
        
        @Override
        public int getForwardTypeValue() {
            return this.forwardType_;
        }
        
        @Override
        public ForwardTypeOuterClass.ForwardType getForwardType() {
            final ForwardTypeOuterClass.ForwardType result = ForwardTypeOuterClass.ForwardType.valueOf(this.forwardType_);
            return (result == null) ? ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
        }
        
        @Override
        public boolean hasBeingHitInfo() {
            return this.beingHitInfo_ != null;
        }
        
        @Override
        public EvtBeingHitInfoOuterClass.EvtBeingHitInfo getBeingHitInfo() {
            return (this.beingHitInfo_ == null) ? EvtBeingHitInfoOuterClass.EvtBeingHitInfo.getDefaultInstance() : this.beingHitInfo_;
        }
        
        @Override
        public EvtBeingHitInfoOuterClass.EvtBeingHitInfoOrBuilder getBeingHitInfoOrBuilder() {
            return this.getBeingHitInfo();
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
            if (this.beingHitInfo_ != null) {
                output.writeMessage(3, this.getBeingHitInfo());
            }
            if (this.forwardType_ != ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
                output.writeEnum(6, this.forwardType_);
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
            if (this.beingHitInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(3, this.getBeingHitInfo());
            }
            if (this.forwardType_ != ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
                size += CodedOutputStream.computeEnumSize(6, this.forwardType_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EvtBeingHitNotify)) {
                return super.equals(obj);
            }
            final EvtBeingHitNotify other = (EvtBeingHitNotify)obj;
            return this.forwardType_ == other.forwardType_ && this.hasBeingHitInfo() == other.hasBeingHitInfo() && (!this.hasBeingHitInfo() || this.getBeingHitInfo().equals(other.getBeingHitInfo())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.forwardType_;
            if (this.hasBeingHitInfo()) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getBeingHitInfo().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static EvtBeingHitNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return EvtBeingHitNotify.PARSER.parseFrom(data);
        }
        
        public static EvtBeingHitNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EvtBeingHitNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EvtBeingHitNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return EvtBeingHitNotify.PARSER.parseFrom(data);
        }
        
        public static EvtBeingHitNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EvtBeingHitNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EvtBeingHitNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return EvtBeingHitNotify.PARSER.parseFrom(data);
        }
        
        public static EvtBeingHitNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EvtBeingHitNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EvtBeingHitNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EvtBeingHitNotify.PARSER, input);
        }
        
        public static EvtBeingHitNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EvtBeingHitNotify.PARSER, input, extensionRegistry);
        }
        
        public static EvtBeingHitNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EvtBeingHitNotify.PARSER, input);
        }
        
        public static EvtBeingHitNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EvtBeingHitNotify.PARSER, input, extensionRegistry);
        }
        
        public static EvtBeingHitNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EvtBeingHitNotify.PARSER, input);
        }
        
        public static EvtBeingHitNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EvtBeingHitNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return EvtBeingHitNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final EvtBeingHitNotify prototype) {
            return EvtBeingHitNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == EvtBeingHitNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static EvtBeingHitNotify getDefaultInstance() {
            return EvtBeingHitNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<EvtBeingHitNotify> parser() {
            return EvtBeingHitNotify.PARSER;
        }
        
        @Override
        public Parser<EvtBeingHitNotify> getParserForType() {
            return EvtBeingHitNotify.PARSER;
        }
        
        @Override
        public EvtBeingHitNotify getDefaultInstanceForType() {
            return EvtBeingHitNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new EvtBeingHitNotify();
            PARSER = new AbstractParser<EvtBeingHitNotify>() {
                @Override
                public EvtBeingHitNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new EvtBeingHitNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EvtBeingHitNotifyOrBuilder
        {
            private int forwardType_;
            private EvtBeingHitInfoOuterClass.EvtBeingHitInfo beingHitInfo_;
            private SingleFieldBuilderV3<EvtBeingHitInfoOuterClass.EvtBeingHitInfo, EvtBeingHitInfoOuterClass.EvtBeingHitInfo.Builder, EvtBeingHitInfoOuterClass.EvtBeingHitInfoOrBuilder> beingHitInfoBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return EvtBeingHitNotifyOuterClass.internal_static_EvtBeingHitNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return EvtBeingHitNotifyOuterClass.internal_static_EvtBeingHitNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(EvtBeingHitNotify.class, Builder.class);
            }
            
            private Builder() {
                this.forwardType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.forwardType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (EvtBeingHitNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.forwardType_ = 0;
                if (this.beingHitInfoBuilder_ == null) {
                    this.beingHitInfo_ = null;
                }
                else {
                    this.beingHitInfo_ = null;
                    this.beingHitInfoBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return EvtBeingHitNotifyOuterClass.internal_static_EvtBeingHitNotify_descriptor;
            }
            
            @Override
            public EvtBeingHitNotify getDefaultInstanceForType() {
                return EvtBeingHitNotify.getDefaultInstance();
            }
            
            @Override
            public EvtBeingHitNotify build() {
                final EvtBeingHitNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public EvtBeingHitNotify buildPartial() {
                final EvtBeingHitNotify result = new EvtBeingHitNotify(this);
                result.forwardType_ = this.forwardType_;
                if (this.beingHitInfoBuilder_ == null) {
                    result.beingHitInfo_ = this.beingHitInfo_;
                }
                else {
                    result.beingHitInfo_ = this.beingHitInfoBuilder_.build();
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
                if (other instanceof EvtBeingHitNotify) {
                    return this.mergeFrom((EvtBeingHitNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final EvtBeingHitNotify other) {
                if (other == EvtBeingHitNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.forwardType_ != 0) {
                    this.setForwardTypeValue(other.getForwardTypeValue());
                }
                if (other.hasBeingHitInfo()) {
                    this.mergeBeingHitInfo(other.getBeingHitInfo());
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
                EvtBeingHitNotify parsedMessage = null;
                try {
                    parsedMessage = EvtBeingHitNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (EvtBeingHitNotify)e.getUnfinishedMessage();
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
            public int getForwardTypeValue() {
                return this.forwardType_;
            }
            
            public Builder setForwardTypeValue(final int value) {
                this.forwardType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public ForwardTypeOuterClass.ForwardType getForwardType() {
                final ForwardTypeOuterClass.ForwardType result = ForwardTypeOuterClass.ForwardType.valueOf(this.forwardType_);
                return (result == null) ? ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
            }
            
            public Builder setForwardType(final ForwardTypeOuterClass.ForwardType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.forwardType_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearForwardType() {
                this.forwardType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasBeingHitInfo() {
                return this.beingHitInfoBuilder_ != null || this.beingHitInfo_ != null;
            }
            
            @Override
            public EvtBeingHitInfoOuterClass.EvtBeingHitInfo getBeingHitInfo() {
                if (this.beingHitInfoBuilder_ == null) {
                    return (this.beingHitInfo_ == null) ? EvtBeingHitInfoOuterClass.EvtBeingHitInfo.getDefaultInstance() : this.beingHitInfo_;
                }
                return this.beingHitInfoBuilder_.getMessage();
            }
            
            public Builder setBeingHitInfo(final EvtBeingHitInfoOuterClass.EvtBeingHitInfo value) {
                if (this.beingHitInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.beingHitInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.beingHitInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setBeingHitInfo(final EvtBeingHitInfoOuterClass.EvtBeingHitInfo.Builder builderForValue) {
                if (this.beingHitInfoBuilder_ == null) {
                    this.beingHitInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.beingHitInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeBeingHitInfo(final EvtBeingHitInfoOuterClass.EvtBeingHitInfo value) {
                if (this.beingHitInfoBuilder_ == null) {
                    if (this.beingHitInfo_ != null) {
                        this.beingHitInfo_ = EvtBeingHitInfoOuterClass.EvtBeingHitInfo.newBuilder(this.beingHitInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.beingHitInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.beingHitInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearBeingHitInfo() {
                if (this.beingHitInfoBuilder_ == null) {
                    this.beingHitInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.beingHitInfo_ = null;
                    this.beingHitInfoBuilder_ = null;
                }
                return this;
            }
            
            public EvtBeingHitInfoOuterClass.EvtBeingHitInfo.Builder getBeingHitInfoBuilder() {
                this.onChanged();
                return this.getBeingHitInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public EvtBeingHitInfoOuterClass.EvtBeingHitInfoOrBuilder getBeingHitInfoOrBuilder() {
                if (this.beingHitInfoBuilder_ != null) {
                    return this.beingHitInfoBuilder_.getMessageOrBuilder();
                }
                return (this.beingHitInfo_ == null) ? EvtBeingHitInfoOuterClass.EvtBeingHitInfo.getDefaultInstance() : this.beingHitInfo_;
            }
            
            private SingleFieldBuilderV3<EvtBeingHitInfoOuterClass.EvtBeingHitInfo, EvtBeingHitInfoOuterClass.EvtBeingHitInfo.Builder, EvtBeingHitInfoOuterClass.EvtBeingHitInfoOrBuilder> getBeingHitInfoFieldBuilder() {
                if (this.beingHitInfoBuilder_ == null) {
                    this.beingHitInfoBuilder_ = new SingleFieldBuilderV3<EvtBeingHitInfoOuterClass.EvtBeingHitInfo, EvtBeingHitInfoOuterClass.EvtBeingHitInfo.Builder, EvtBeingHitInfoOuterClass.EvtBeingHitInfoOrBuilder>(this.getBeingHitInfo(), this.getParentForChildren(), this.isClean());
                    this.beingHitInfo_ = null;
                }
                return this.beingHitInfoBuilder_;
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
    
    public interface EvtBeingHitNotifyOrBuilder extends MessageOrBuilder
    {
        int getForwardTypeValue();
        
        ForwardTypeOuterClass.ForwardType getForwardType();
        
        boolean hasBeingHitInfo();
        
        EvtBeingHitInfoOuterClass.EvtBeingHitInfo getBeingHitInfo();
        
        EvtBeingHitInfoOuterClass.EvtBeingHitInfoOrBuilder getBeingHitInfoOrBuilder();
    }
}
