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

public final class PropPairOuterClass
{
    private static final Descriptors.Descriptor internal_static_PropPair_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PropPair_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PropPairOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PropPairOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u000ePropPair.proto\u001a\u000fPropValue.proto\"8\n\bPropPair\u0012\f\n\u0004type\u0018\u0001 \u0001(\r\u0012\u001e\n\nprop_value\u0018\u0002 \u0001(\u000b2\n.PropValueB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PropPairOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { PropValueOuterClass.getDescriptor() });
        internal_static_PropPair_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PropPair_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PropPairOuterClass.internal_static_PropPair_descriptor, new String[] { "Type", "PropValue" });
        PropValueOuterClass.getDescriptor();
    }
    
    public static final class PropPair extends GeneratedMessageV3 implements PropPairOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int type_;
        public static final int PROP_VALUE_FIELD_NUMBER = 2;
        private PropValueOuterClass.PropValue propValue_;
        private byte memoizedIsInitialized;
        private static final PropPair DEFAULT_INSTANCE;
        private static final Parser<PropPair> PARSER;
        
        private PropPair(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PropPair() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PropPair();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PropPair(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.type_ = input.readUInt32();
                            continue;
                        }
                        case 18: {
                            PropValueOuterClass.PropValue.Builder subBuilder = null;
                            if (this.propValue_ != null) {
                                subBuilder = this.propValue_.toBuilder();
                            }
                            this.propValue_ = input.readMessage(PropValueOuterClass.PropValue.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.propValue_);
                                this.propValue_ = subBuilder.buildPartial();
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
            return PropPairOuterClass.internal_static_PropPair_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PropPairOuterClass.internal_static_PropPair_fieldAccessorTable.ensureFieldAccessorsInitialized(PropPair.class, Builder.class);
        }
        
        @Override
        public int getType() {
            return this.type_;
        }
        
        @Override
        public boolean hasPropValue() {
            return this.propValue_ != null;
        }
        
        @Override
        public PropValueOuterClass.PropValue getPropValue() {
            return (this.propValue_ == null) ? PropValueOuterClass.PropValue.getDefaultInstance() : this.propValue_;
        }
        
        @Override
        public PropValueOuterClass.PropValueOrBuilder getPropValueOrBuilder() {
            return this.getPropValue();
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
            if (this.type_ != 0) {
                output.writeUInt32(1, this.type_);
            }
            if (this.propValue_ != null) {
                output.writeMessage(2, this.getPropValue());
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
            if (this.type_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.type_);
            }
            if (this.propValue_ != null) {
                size += CodedOutputStream.computeMessageSize(2, this.getPropValue());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PropPair)) {
                return super.equals(obj);
            }
            final PropPair other = (PropPair)obj;
            return this.getType() == other.getType() && this.hasPropValue() == other.hasPropValue() && (!this.hasPropValue() || this.getPropValue().equals(other.getPropValue())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getType();
            if (this.hasPropValue()) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getPropValue().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PropPair parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PropPair.PARSER.parseFrom(data);
        }
        
        public static PropPair parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PropPair.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PropPair parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PropPair.PARSER.parseFrom(data);
        }
        
        public static PropPair parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PropPair.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PropPair parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PropPair.PARSER.parseFrom(data);
        }
        
        public static PropPair parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PropPair.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PropPair parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PropPair.PARSER, input);
        }
        
        public static PropPair parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PropPair.PARSER, input, extensionRegistry);
        }
        
        public static PropPair parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PropPair.PARSER, input);
        }
        
        public static PropPair parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PropPair.PARSER, input, extensionRegistry);
        }
        
        public static PropPair parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PropPair.PARSER, input);
        }
        
        public static PropPair parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PropPair.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PropPair.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PropPair prototype) {
            return PropPair.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PropPair.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PropPair getDefaultInstance() {
            return PropPair.DEFAULT_INSTANCE;
        }
        
        public static Parser<PropPair> parser() {
            return PropPair.PARSER;
        }
        
        @Override
        public Parser<PropPair> getParserForType() {
            return PropPair.PARSER;
        }
        
        @Override
        public PropPair getDefaultInstanceForType() {
            return PropPair.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PropPair();
            PARSER = new AbstractParser<PropPair>() {
                @Override
                public PropPair parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PropPair(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PropPairOrBuilder
        {
            private int type_;
            private PropValueOuterClass.PropValue propValue_;
            private SingleFieldBuilderV3<PropValueOuterClass.PropValue, PropValueOuterClass.PropValue.Builder, PropValueOuterClass.PropValueOrBuilder> propValueBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PropPairOuterClass.internal_static_PropPair_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PropPairOuterClass.internal_static_PropPair_fieldAccessorTable.ensureFieldAccessorsInitialized(PropPair.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PropPair.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.type_ = 0;
                if (this.propValueBuilder_ == null) {
                    this.propValue_ = null;
                }
                else {
                    this.propValue_ = null;
                    this.propValueBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PropPairOuterClass.internal_static_PropPair_descriptor;
            }
            
            @Override
            public PropPair getDefaultInstanceForType() {
                return PropPair.getDefaultInstance();
            }
            
            @Override
            public PropPair build() {
                final PropPair result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PropPair buildPartial() {
                final PropPair result = new PropPair(this);
                result.type_ = this.type_;
                if (this.propValueBuilder_ == null) {
                    result.propValue_ = this.propValue_;
                }
                else {
                    result.propValue_ = this.propValueBuilder_.build();
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
                if (other instanceof PropPair) {
                    return this.mergeFrom((PropPair)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PropPair other) {
                if (other == PropPair.getDefaultInstance()) {
                    return this;
                }
                if (other.getType() != 0) {
                    this.setType(other.getType());
                }
                if (other.hasPropValue()) {
                    this.mergePropValue(other.getPropValue());
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
                PropPair parsedMessage = null;
                try {
                    parsedMessage = PropPair.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PropPair)e.getUnfinishedMessage();
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
            public int getType() {
                return this.type_;
            }
            
            public Builder setType(final int value) {
                this.type_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearType() {
                this.type_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasPropValue() {
                return this.propValueBuilder_ != null || this.propValue_ != null;
            }
            
            @Override
            public PropValueOuterClass.PropValue getPropValue() {
                if (this.propValueBuilder_ == null) {
                    return (this.propValue_ == null) ? PropValueOuterClass.PropValue.getDefaultInstance() : this.propValue_;
                }
                return this.propValueBuilder_.getMessage();
            }
            
            public Builder setPropValue(final PropValueOuterClass.PropValue value) {
                if (this.propValueBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.propValue_ = value;
                    this.onChanged();
                }
                else {
                    this.propValueBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setPropValue(final PropValueOuterClass.PropValue.Builder builderForValue) {
                if (this.propValueBuilder_ == null) {
                    this.propValue_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.propValueBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergePropValue(final PropValueOuterClass.PropValue value) {
                if (this.propValueBuilder_ == null) {
                    if (this.propValue_ != null) {
                        this.propValue_ = PropValueOuterClass.PropValue.newBuilder(this.propValue_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.propValue_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.propValueBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearPropValue() {
                if (this.propValueBuilder_ == null) {
                    this.propValue_ = null;
                    this.onChanged();
                }
                else {
                    this.propValue_ = null;
                    this.propValueBuilder_ = null;
                }
                return this;
            }
            
            public PropValueOuterClass.PropValue.Builder getPropValueBuilder() {
                this.onChanged();
                return this.getPropValueFieldBuilder().getBuilder();
            }
            
            @Override
            public PropValueOuterClass.PropValueOrBuilder getPropValueOrBuilder() {
                if (this.propValueBuilder_ != null) {
                    return this.propValueBuilder_.getMessageOrBuilder();
                }
                return (this.propValue_ == null) ? PropValueOuterClass.PropValue.getDefaultInstance() : this.propValue_;
            }
            
            private SingleFieldBuilderV3<PropValueOuterClass.PropValue, PropValueOuterClass.PropValue.Builder, PropValueOuterClass.PropValueOrBuilder> getPropValueFieldBuilder() {
                if (this.propValueBuilder_ == null) {
                    this.propValueBuilder_ = new SingleFieldBuilderV3<PropValueOuterClass.PropValue, PropValueOuterClass.PropValue.Builder, PropValueOuterClass.PropValueOrBuilder>(this.getPropValue(), this.getParentForChildren(), this.isClean());
                    this.propValue_ = null;
                }
                return this.propValueBuilder_;
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
    
    public interface PropPairOrBuilder extends MessageOrBuilder
    {
        int getType();
        
        boolean hasPropValue();
        
        PropValueOuterClass.PropValue getPropValue();
        
        PropValueOuterClass.PropValueOrBuilder getPropValueOrBuilder();
    }
}
