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

public final class WidgetGadgetDataNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_WidgetGadgetDataNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WidgetGadgetDataNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WidgetGadgetDataNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WidgetGadgetDataNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cWidgetGadgetDataNotify.proto\u001a\u0016WidgetGadgetData.proto\"G\n\u0016WidgetGadgetDataNotify\u0012-\n\u0012widget_gadget_data\u0018\f \u0001(\u000b2\u0011.WidgetGadgetDataB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WidgetGadgetDataNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { WidgetGadgetDataOuterClass.getDescriptor() });
        internal_static_WidgetGadgetDataNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WidgetGadgetDataNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WidgetGadgetDataNotifyOuterClass.internal_static_WidgetGadgetDataNotify_descriptor, new String[] { "WidgetGadgetData" });
        WidgetGadgetDataOuterClass.getDescriptor();
    }
    
    public static final class WidgetGadgetDataNotify extends GeneratedMessageV3 implements WidgetGadgetDataNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int WIDGET_GADGET_DATA_FIELD_NUMBER = 12;
        private WidgetGadgetDataOuterClass.WidgetGadgetData widgetGadgetData_;
        private byte memoizedIsInitialized;
        private static final WidgetGadgetDataNotify DEFAULT_INSTANCE;
        private static final Parser<WidgetGadgetDataNotify> PARSER;
        
        private WidgetGadgetDataNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private WidgetGadgetDataNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WidgetGadgetDataNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WidgetGadgetDataNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 98: {
                            WidgetGadgetDataOuterClass.WidgetGadgetData.Builder subBuilder = null;
                            if (this.widgetGadgetData_ != null) {
                                subBuilder = this.widgetGadgetData_.toBuilder();
                            }
                            this.widgetGadgetData_ = input.readMessage(WidgetGadgetDataOuterClass.WidgetGadgetData.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.widgetGadgetData_);
                                this.widgetGadgetData_ = subBuilder.buildPartial();
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
            return WidgetGadgetDataNotifyOuterClass.internal_static_WidgetGadgetDataNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WidgetGadgetDataNotifyOuterClass.internal_static_WidgetGadgetDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetGadgetDataNotify.class, Builder.class);
        }
        
        @Override
        public boolean hasWidgetGadgetData() {
            return this.widgetGadgetData_ != null;
        }
        
        @Override
        public WidgetGadgetDataOuterClass.WidgetGadgetData getWidgetGadgetData() {
            return (this.widgetGadgetData_ == null) ? WidgetGadgetDataOuterClass.WidgetGadgetData.getDefaultInstance() : this.widgetGadgetData_;
        }
        
        @Override
        public WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder getWidgetGadgetDataOrBuilder() {
            return this.getWidgetGadgetData();
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
            if (this.widgetGadgetData_ != null) {
                output.writeMessage(12, this.getWidgetGadgetData());
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
            if (this.widgetGadgetData_ != null) {
                size += CodedOutputStream.computeMessageSize(12, this.getWidgetGadgetData());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WidgetGadgetDataNotify)) {
                return super.equals(obj);
            }
            final WidgetGadgetDataNotify other = (WidgetGadgetDataNotify)obj;
            return this.hasWidgetGadgetData() == other.hasWidgetGadgetData() && (!this.hasWidgetGadgetData() || this.getWidgetGadgetData().equals(other.getWidgetGadgetData())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasWidgetGadgetData()) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getWidgetGadgetData().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WidgetGadgetDataNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WidgetGadgetDataNotify.PARSER.parseFrom(data);
        }
        
        public static WidgetGadgetDataNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetGadgetDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetGadgetDataNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WidgetGadgetDataNotify.PARSER.parseFrom(data);
        }
        
        public static WidgetGadgetDataNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetGadgetDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetGadgetDataNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WidgetGadgetDataNotify.PARSER.parseFrom(data);
        }
        
        public static WidgetGadgetDataNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetGadgetDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetGadgetDataNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetGadgetDataNotify.PARSER, input);
        }
        
        public static WidgetGadgetDataNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetGadgetDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static WidgetGadgetDataNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetGadgetDataNotify.PARSER, input);
        }
        
        public static WidgetGadgetDataNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetGadgetDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static WidgetGadgetDataNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetGadgetDataNotify.PARSER, input);
        }
        
        public static WidgetGadgetDataNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetGadgetDataNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WidgetGadgetDataNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WidgetGadgetDataNotify prototype) {
            return WidgetGadgetDataNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WidgetGadgetDataNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WidgetGadgetDataNotify getDefaultInstance() {
            return WidgetGadgetDataNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<WidgetGadgetDataNotify> parser() {
            return WidgetGadgetDataNotify.PARSER;
        }
        
        @Override
        public Parser<WidgetGadgetDataNotify> getParserForType() {
            return WidgetGadgetDataNotify.PARSER;
        }
        
        @Override
        public WidgetGadgetDataNotify getDefaultInstanceForType() {
            return WidgetGadgetDataNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WidgetGadgetDataNotify();
            PARSER = new AbstractParser<WidgetGadgetDataNotify>() {
                @Override
                public WidgetGadgetDataNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WidgetGadgetDataNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WidgetGadgetDataNotifyOrBuilder
        {
            private WidgetGadgetDataOuterClass.WidgetGadgetData widgetGadgetData_;
            private SingleFieldBuilderV3<WidgetGadgetDataOuterClass.WidgetGadgetData, WidgetGadgetDataOuterClass.WidgetGadgetData.Builder, WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder> widgetGadgetDataBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WidgetGadgetDataNotifyOuterClass.internal_static_WidgetGadgetDataNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WidgetGadgetDataNotifyOuterClass.internal_static_WidgetGadgetDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetGadgetDataNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (WidgetGadgetDataNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.widgetGadgetDataBuilder_ == null) {
                    this.widgetGadgetData_ = null;
                }
                else {
                    this.widgetGadgetData_ = null;
                    this.widgetGadgetDataBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WidgetGadgetDataNotifyOuterClass.internal_static_WidgetGadgetDataNotify_descriptor;
            }
            
            @Override
            public WidgetGadgetDataNotify getDefaultInstanceForType() {
                return WidgetGadgetDataNotify.getDefaultInstance();
            }
            
            @Override
            public WidgetGadgetDataNotify build() {
                final WidgetGadgetDataNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WidgetGadgetDataNotify buildPartial() {
                final WidgetGadgetDataNotify result = new WidgetGadgetDataNotify(this);
                if (this.widgetGadgetDataBuilder_ == null) {
                    result.widgetGadgetData_ = this.widgetGadgetData_;
                }
                else {
                    result.widgetGadgetData_ = this.widgetGadgetDataBuilder_.build();
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
                if (other instanceof WidgetGadgetDataNotify) {
                    return this.mergeFrom((WidgetGadgetDataNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WidgetGadgetDataNotify other) {
                if (other == WidgetGadgetDataNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.hasWidgetGadgetData()) {
                    this.mergeWidgetGadgetData(other.getWidgetGadgetData());
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
                WidgetGadgetDataNotify parsedMessage = null;
                try {
                    parsedMessage = WidgetGadgetDataNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WidgetGadgetDataNotify)e.getUnfinishedMessage();
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
            public boolean hasWidgetGadgetData() {
                return this.widgetGadgetDataBuilder_ != null || this.widgetGadgetData_ != null;
            }
            
            @Override
            public WidgetGadgetDataOuterClass.WidgetGadgetData getWidgetGadgetData() {
                if (this.widgetGadgetDataBuilder_ == null) {
                    return (this.widgetGadgetData_ == null) ? WidgetGadgetDataOuterClass.WidgetGadgetData.getDefaultInstance() : this.widgetGadgetData_;
                }
                return this.widgetGadgetDataBuilder_.getMessage();
            }
            
            public Builder setWidgetGadgetData(final WidgetGadgetDataOuterClass.WidgetGadgetData value) {
                if (this.widgetGadgetDataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.widgetGadgetData_ = value;
                    this.onChanged();
                }
                else {
                    this.widgetGadgetDataBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setWidgetGadgetData(final WidgetGadgetDataOuterClass.WidgetGadgetData.Builder builderForValue) {
                if (this.widgetGadgetDataBuilder_ == null) {
                    this.widgetGadgetData_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.widgetGadgetDataBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeWidgetGadgetData(final WidgetGadgetDataOuterClass.WidgetGadgetData value) {
                if (this.widgetGadgetDataBuilder_ == null) {
                    if (this.widgetGadgetData_ != null) {
                        this.widgetGadgetData_ = WidgetGadgetDataOuterClass.WidgetGadgetData.newBuilder(this.widgetGadgetData_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.widgetGadgetData_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.widgetGadgetDataBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearWidgetGadgetData() {
                if (this.widgetGadgetDataBuilder_ == null) {
                    this.widgetGadgetData_ = null;
                    this.onChanged();
                }
                else {
                    this.widgetGadgetData_ = null;
                    this.widgetGadgetDataBuilder_ = null;
                }
                return this;
            }
            
            public WidgetGadgetDataOuterClass.WidgetGadgetData.Builder getWidgetGadgetDataBuilder() {
                this.onChanged();
                return this.getWidgetGadgetDataFieldBuilder().getBuilder();
            }
            
            @Override
            public WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder getWidgetGadgetDataOrBuilder() {
                if (this.widgetGadgetDataBuilder_ != null) {
                    return this.widgetGadgetDataBuilder_.getMessageOrBuilder();
                }
                return (this.widgetGadgetData_ == null) ? WidgetGadgetDataOuterClass.WidgetGadgetData.getDefaultInstance() : this.widgetGadgetData_;
            }
            
            private SingleFieldBuilderV3<WidgetGadgetDataOuterClass.WidgetGadgetData, WidgetGadgetDataOuterClass.WidgetGadgetData.Builder, WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder> getWidgetGadgetDataFieldBuilder() {
                if (this.widgetGadgetDataBuilder_ == null) {
                    this.widgetGadgetDataBuilder_ = new SingleFieldBuilderV3<WidgetGadgetDataOuterClass.WidgetGadgetData, WidgetGadgetDataOuterClass.WidgetGadgetData.Builder, WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder>(this.getWidgetGadgetData(), this.getParentForChildren(), this.isClean());
                    this.widgetGadgetData_ = null;
                }
                return this.widgetGadgetDataBuilder_;
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
    
    public interface WidgetGadgetDataNotifyOrBuilder extends MessageOrBuilder
    {
        boolean hasWidgetGadgetData();
        
        WidgetGadgetDataOuterClass.WidgetGadgetData getWidgetGadgetData();
        
        WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder getWidgetGadgetDataOrBuilder();
    }
}
