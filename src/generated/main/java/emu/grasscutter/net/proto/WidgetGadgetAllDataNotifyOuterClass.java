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

public final class WidgetGadgetAllDataNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_WidgetGadgetAllDataNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WidgetGadgetAllDataNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WidgetGadgetAllDataNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WidgetGadgetAllDataNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001fWidgetGadgetAllDataNotify.proto\u001a\u0016WidgetGadgetData.proto\"J\n\u0019WidgetGadgetAllDataNotify\u0012-\n\u0012widget_gadget_data\u0018\r \u0003(\u000b2\u0011.WidgetGadgetDataB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WidgetGadgetAllDataNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { WidgetGadgetDataOuterClass.getDescriptor() });
        internal_static_WidgetGadgetAllDataNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WidgetGadgetAllDataNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WidgetGadgetAllDataNotifyOuterClass.internal_static_WidgetGadgetAllDataNotify_descriptor, new String[] { "WidgetGadgetData" });
        WidgetGadgetDataOuterClass.getDescriptor();
    }
    
    public static final class WidgetGadgetAllDataNotify extends GeneratedMessageV3 implements WidgetGadgetAllDataNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int WIDGET_GADGET_DATA_FIELD_NUMBER = 13;
        private List<WidgetGadgetDataOuterClass.WidgetGadgetData> widgetGadgetData_;
        private byte memoizedIsInitialized;
        private static final WidgetGadgetAllDataNotify DEFAULT_INSTANCE;
        private static final Parser<WidgetGadgetAllDataNotify> PARSER;
        
        private WidgetGadgetAllDataNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private WidgetGadgetAllDataNotify() {
            this.memoizedIsInitialized = -1;
            this.widgetGadgetData_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WidgetGadgetAllDataNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WidgetGadgetAllDataNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 106: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.widgetGadgetData_ = new ArrayList<WidgetGadgetDataOuterClass.WidgetGadgetData>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.widgetGadgetData_.add(input.readMessage(WidgetGadgetDataOuterClass.WidgetGadgetData.parser(), extensionRegistry));
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
                    this.widgetGadgetData_ = Collections.unmodifiableList((List<? extends WidgetGadgetDataOuterClass.WidgetGadgetData>)this.widgetGadgetData_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return WidgetGadgetAllDataNotifyOuterClass.internal_static_WidgetGadgetAllDataNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WidgetGadgetAllDataNotifyOuterClass.internal_static_WidgetGadgetAllDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetGadgetAllDataNotify.class, Builder.class);
        }
        
        @Override
        public List<WidgetGadgetDataOuterClass.WidgetGadgetData> getWidgetGadgetDataList() {
            return this.widgetGadgetData_;
        }
        
        @Override
        public List<? extends WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder> getWidgetGadgetDataOrBuilderList() {
            return this.widgetGadgetData_;
        }
        
        @Override
        public int getWidgetGadgetDataCount() {
            return this.widgetGadgetData_.size();
        }
        
        @Override
        public WidgetGadgetDataOuterClass.WidgetGadgetData getWidgetGadgetData(final int index) {
            return this.widgetGadgetData_.get(index);
        }
        
        @Override
        public WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder getWidgetGadgetDataOrBuilder(final int index) {
            return this.widgetGadgetData_.get(index);
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
            for (int i = 0; i < this.widgetGadgetData_.size(); ++i) {
                output.writeMessage(13, this.widgetGadgetData_.get(i));
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
            for (int i = 0; i < this.widgetGadgetData_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(13, this.widgetGadgetData_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WidgetGadgetAllDataNotify)) {
                return super.equals(obj);
            }
            final WidgetGadgetAllDataNotify other = (WidgetGadgetAllDataNotify)obj;
            return this.getWidgetGadgetDataList().equals(other.getWidgetGadgetDataList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getWidgetGadgetDataCount() > 0) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.getWidgetGadgetDataList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WidgetGadgetAllDataNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WidgetGadgetAllDataNotify.PARSER.parseFrom(data);
        }
        
        public static WidgetGadgetAllDataNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetGadgetAllDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetGadgetAllDataNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WidgetGadgetAllDataNotify.PARSER.parseFrom(data);
        }
        
        public static WidgetGadgetAllDataNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetGadgetAllDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetGadgetAllDataNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WidgetGadgetAllDataNotify.PARSER.parseFrom(data);
        }
        
        public static WidgetGadgetAllDataNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetGadgetAllDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetGadgetAllDataNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetGadgetAllDataNotify.PARSER, input);
        }
        
        public static WidgetGadgetAllDataNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetGadgetAllDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static WidgetGadgetAllDataNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetGadgetAllDataNotify.PARSER, input);
        }
        
        public static WidgetGadgetAllDataNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetGadgetAllDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static WidgetGadgetAllDataNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetGadgetAllDataNotify.PARSER, input);
        }
        
        public static WidgetGadgetAllDataNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetGadgetAllDataNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WidgetGadgetAllDataNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WidgetGadgetAllDataNotify prototype) {
            return WidgetGadgetAllDataNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WidgetGadgetAllDataNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WidgetGadgetAllDataNotify getDefaultInstance() {
            return WidgetGadgetAllDataNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<WidgetGadgetAllDataNotify> parser() {
            return WidgetGadgetAllDataNotify.PARSER;
        }
        
        @Override
        public Parser<WidgetGadgetAllDataNotify> getParserForType() {
            return WidgetGadgetAllDataNotify.PARSER;
        }
        
        @Override
        public WidgetGadgetAllDataNotify getDefaultInstanceForType() {
            return WidgetGadgetAllDataNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WidgetGadgetAllDataNotify();
            PARSER = new AbstractParser<WidgetGadgetAllDataNotify>() {
                @Override
                public WidgetGadgetAllDataNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WidgetGadgetAllDataNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WidgetGadgetAllDataNotifyOrBuilder
        {
            private int bitField0_;
            private List<WidgetGadgetDataOuterClass.WidgetGadgetData> widgetGadgetData_;
            private RepeatedFieldBuilderV3<WidgetGadgetDataOuterClass.WidgetGadgetData, WidgetGadgetDataOuterClass.WidgetGadgetData.Builder, WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder> widgetGadgetDataBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WidgetGadgetAllDataNotifyOuterClass.internal_static_WidgetGadgetAllDataNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WidgetGadgetAllDataNotifyOuterClass.internal_static_WidgetGadgetAllDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetGadgetAllDataNotify.class, Builder.class);
            }
            
            private Builder() {
                this.widgetGadgetData_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.widgetGadgetData_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (WidgetGadgetAllDataNotify.alwaysUseFieldBuilders) {
                    this.getWidgetGadgetDataFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.widgetGadgetDataBuilder_ == null) {
                    this.widgetGadgetData_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.widgetGadgetDataBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WidgetGadgetAllDataNotifyOuterClass.internal_static_WidgetGadgetAllDataNotify_descriptor;
            }
            
            @Override
            public WidgetGadgetAllDataNotify getDefaultInstanceForType() {
                return WidgetGadgetAllDataNotify.getDefaultInstance();
            }
            
            @Override
            public WidgetGadgetAllDataNotify build() {
                final WidgetGadgetAllDataNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WidgetGadgetAllDataNotify buildPartial() {
                final WidgetGadgetAllDataNotify result = new WidgetGadgetAllDataNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.widgetGadgetDataBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.widgetGadgetData_ = Collections.unmodifiableList((List<? extends WidgetGadgetDataOuterClass.WidgetGadgetData>)this.widgetGadgetData_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
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
                if (other instanceof WidgetGadgetAllDataNotify) {
                    return this.mergeFrom((WidgetGadgetAllDataNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WidgetGadgetAllDataNotify other) {
                if (other == WidgetGadgetAllDataNotify.getDefaultInstance()) {
                    return this;
                }
                if (this.widgetGadgetDataBuilder_ == null) {
                    if (!other.widgetGadgetData_.isEmpty()) {
                        if (this.widgetGadgetData_.isEmpty()) {
                            this.widgetGadgetData_ = other.widgetGadgetData_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureWidgetGadgetDataIsMutable();
                            this.widgetGadgetData_.addAll(other.widgetGadgetData_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.widgetGadgetData_.isEmpty()) {
                    if (this.widgetGadgetDataBuilder_.isEmpty()) {
                        this.widgetGadgetDataBuilder_.dispose();
                        this.widgetGadgetDataBuilder_ = null;
                        this.widgetGadgetData_ = other.widgetGadgetData_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.widgetGadgetDataBuilder_ = (WidgetGadgetAllDataNotify.alwaysUseFieldBuilders ? this.getWidgetGadgetDataFieldBuilder() : null);
                    }
                    else {
                        this.widgetGadgetDataBuilder_.addAllMessages(other.widgetGadgetData_);
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
                WidgetGadgetAllDataNotify parsedMessage = null;
                try {
                    parsedMessage = WidgetGadgetAllDataNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WidgetGadgetAllDataNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureWidgetGadgetDataIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.widgetGadgetData_ = new ArrayList<WidgetGadgetDataOuterClass.WidgetGadgetData>(this.widgetGadgetData_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<WidgetGadgetDataOuterClass.WidgetGadgetData> getWidgetGadgetDataList() {
                if (this.widgetGadgetDataBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends WidgetGadgetDataOuterClass.WidgetGadgetData>)this.widgetGadgetData_);
                }
                return this.widgetGadgetDataBuilder_.getMessageList();
            }
            
            @Override
            public int getWidgetGadgetDataCount() {
                if (this.widgetGadgetDataBuilder_ == null) {
                    return this.widgetGadgetData_.size();
                }
                return this.widgetGadgetDataBuilder_.getCount();
            }
            
            @Override
            public WidgetGadgetDataOuterClass.WidgetGadgetData getWidgetGadgetData(final int index) {
                if (this.widgetGadgetDataBuilder_ == null) {
                    return this.widgetGadgetData_.get(index);
                }
                return this.widgetGadgetDataBuilder_.getMessage(index);
            }
            
            public Builder setWidgetGadgetData(final int index, final WidgetGadgetDataOuterClass.WidgetGadgetData value) {
                if (this.widgetGadgetDataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureWidgetGadgetDataIsMutable();
                    this.widgetGadgetData_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.widgetGadgetDataBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setWidgetGadgetData(final int index, final WidgetGadgetDataOuterClass.WidgetGadgetData.Builder builderForValue) {
                if (this.widgetGadgetDataBuilder_ == null) {
                    this.ensureWidgetGadgetDataIsMutable();
                    this.widgetGadgetData_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.widgetGadgetDataBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addWidgetGadgetData(final WidgetGadgetDataOuterClass.WidgetGadgetData value) {
                if (this.widgetGadgetDataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureWidgetGadgetDataIsMutable();
                    this.widgetGadgetData_.add(value);
                    this.onChanged();
                }
                else {
                    this.widgetGadgetDataBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addWidgetGadgetData(final int index, final WidgetGadgetDataOuterClass.WidgetGadgetData value) {
                if (this.widgetGadgetDataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureWidgetGadgetDataIsMutable();
                    this.widgetGadgetData_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.widgetGadgetDataBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addWidgetGadgetData(final WidgetGadgetDataOuterClass.WidgetGadgetData.Builder builderForValue) {
                if (this.widgetGadgetDataBuilder_ == null) {
                    this.ensureWidgetGadgetDataIsMutable();
                    this.widgetGadgetData_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.widgetGadgetDataBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addWidgetGadgetData(final int index, final WidgetGadgetDataOuterClass.WidgetGadgetData.Builder builderForValue) {
                if (this.widgetGadgetDataBuilder_ == null) {
                    this.ensureWidgetGadgetDataIsMutable();
                    this.widgetGadgetData_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.widgetGadgetDataBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllWidgetGadgetData(final Iterable<? extends WidgetGadgetDataOuterClass.WidgetGadgetData> values) {
                if (this.widgetGadgetDataBuilder_ == null) {
                    this.ensureWidgetGadgetDataIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.widgetGadgetData_);
                    this.onChanged();
                }
                else {
                    this.widgetGadgetDataBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearWidgetGadgetData() {
                if (this.widgetGadgetDataBuilder_ == null) {
                    this.widgetGadgetData_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.widgetGadgetDataBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeWidgetGadgetData(final int index) {
                if (this.widgetGadgetDataBuilder_ == null) {
                    this.ensureWidgetGadgetDataIsMutable();
                    this.widgetGadgetData_.remove(index);
                    this.onChanged();
                }
                else {
                    this.widgetGadgetDataBuilder_.remove(index);
                }
                return this;
            }
            
            public WidgetGadgetDataOuterClass.WidgetGadgetData.Builder getWidgetGadgetDataBuilder(final int index) {
                return this.getWidgetGadgetDataFieldBuilder().getBuilder(index);
            }
            
            @Override
            public WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder getWidgetGadgetDataOrBuilder(final int index) {
                if (this.widgetGadgetDataBuilder_ == null) {
                    return this.widgetGadgetData_.get(index);
                }
                return this.widgetGadgetDataBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder> getWidgetGadgetDataOrBuilderList() {
                if (this.widgetGadgetDataBuilder_ != null) {
                    return this.widgetGadgetDataBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder>)this.widgetGadgetData_);
            }
            
            public WidgetGadgetDataOuterClass.WidgetGadgetData.Builder addWidgetGadgetDataBuilder() {
                return this.getWidgetGadgetDataFieldBuilder().addBuilder(WidgetGadgetDataOuterClass.WidgetGadgetData.getDefaultInstance());
            }
            
            public WidgetGadgetDataOuterClass.WidgetGadgetData.Builder addWidgetGadgetDataBuilder(final int index) {
                return this.getWidgetGadgetDataFieldBuilder().addBuilder(index, WidgetGadgetDataOuterClass.WidgetGadgetData.getDefaultInstance());
            }
            
            public List<WidgetGadgetDataOuterClass.WidgetGadgetData.Builder> getWidgetGadgetDataBuilderList() {
                return this.getWidgetGadgetDataFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<WidgetGadgetDataOuterClass.WidgetGadgetData, WidgetGadgetDataOuterClass.WidgetGadgetData.Builder, WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder> getWidgetGadgetDataFieldBuilder() {
                if (this.widgetGadgetDataBuilder_ == null) {
                    this.widgetGadgetDataBuilder_ = new RepeatedFieldBuilderV3<WidgetGadgetDataOuterClass.WidgetGadgetData, WidgetGadgetDataOuterClass.WidgetGadgetData.Builder, WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder>(this.widgetGadgetData_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
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
    
    public interface WidgetGadgetAllDataNotifyOrBuilder extends MessageOrBuilder
    {
        List<WidgetGadgetDataOuterClass.WidgetGadgetData> getWidgetGadgetDataList();
        
        WidgetGadgetDataOuterClass.WidgetGadgetData getWidgetGadgetData(final int p0);
        
        int getWidgetGadgetDataCount();
        
        List<? extends WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder> getWidgetGadgetDataOrBuilderList();
        
        WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder getWidgetGadgetDataOrBuilder(final int p0);
    }
}
