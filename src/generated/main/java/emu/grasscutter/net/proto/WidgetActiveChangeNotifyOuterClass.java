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

public final class WidgetActiveChangeNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_WidgetActiveChangeNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WidgetActiveChangeNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WidgetActiveChangeNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WidgetActiveChangeNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001eWidgetActiveChangeNotify.proto\u001a\u0014WidgetSlotData.proto\"E\n\u0018WidgetActiveChangeNotify\u0012)\n\u0010widget_data_list\u0018\u0005 \u0003(\u000b2\u000f.WidgetSlotDataB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WidgetActiveChangeNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { WidgetSlotDataOuterClass.getDescriptor() });
        internal_static_WidgetActiveChangeNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WidgetActiveChangeNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WidgetActiveChangeNotifyOuterClass.internal_static_WidgetActiveChangeNotify_descriptor, new String[] { "WidgetDataList" });
        WidgetSlotDataOuterClass.getDescriptor();
    }
    
    public static final class WidgetActiveChangeNotify extends GeneratedMessageV3 implements WidgetActiveChangeNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int WIDGET_DATA_LIST_FIELD_NUMBER = 5;
        private List<WidgetSlotDataOuterClass.WidgetSlotData> widgetDataList_;
        private byte memoizedIsInitialized;
        private static final WidgetActiveChangeNotify DEFAULT_INSTANCE;
        private static final Parser<WidgetActiveChangeNotify> PARSER;
        
        private WidgetActiveChangeNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private WidgetActiveChangeNotify() {
            this.memoizedIsInitialized = -1;
            this.widgetDataList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WidgetActiveChangeNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WidgetActiveChangeNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 42: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.widgetDataList_ = new ArrayList<WidgetSlotDataOuterClass.WidgetSlotData>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.widgetDataList_.add(input.readMessage(WidgetSlotDataOuterClass.WidgetSlotData.parser(), extensionRegistry));
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
                    this.widgetDataList_ = Collections.unmodifiableList((List<? extends WidgetSlotDataOuterClass.WidgetSlotData>)this.widgetDataList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return WidgetActiveChangeNotifyOuterClass.internal_static_WidgetActiveChangeNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WidgetActiveChangeNotifyOuterClass.internal_static_WidgetActiveChangeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetActiveChangeNotify.class, Builder.class);
        }
        
        @Override
        public List<WidgetSlotDataOuterClass.WidgetSlotData> getWidgetDataListList() {
            return this.widgetDataList_;
        }
        
        @Override
        public List<? extends WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> getWidgetDataListOrBuilderList() {
            return this.widgetDataList_;
        }
        
        @Override
        public int getWidgetDataListCount() {
            return this.widgetDataList_.size();
        }
        
        @Override
        public WidgetSlotDataOuterClass.WidgetSlotData getWidgetDataList(final int index) {
            return this.widgetDataList_.get(index);
        }
        
        @Override
        public WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getWidgetDataListOrBuilder(final int index) {
            return this.widgetDataList_.get(index);
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
            for (int i = 0; i < this.widgetDataList_.size(); ++i) {
                output.writeMessage(5, this.widgetDataList_.get(i));
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
            for (int i = 0; i < this.widgetDataList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(5, this.widgetDataList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WidgetActiveChangeNotify)) {
                return super.equals(obj);
            }
            final WidgetActiveChangeNotify other = (WidgetActiveChangeNotify)obj;
            return this.getWidgetDataListList().equals(other.getWidgetDataListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getWidgetDataListCount() > 0) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getWidgetDataListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WidgetActiveChangeNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WidgetActiveChangeNotify.PARSER.parseFrom(data);
        }
        
        public static WidgetActiveChangeNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetActiveChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetActiveChangeNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WidgetActiveChangeNotify.PARSER.parseFrom(data);
        }
        
        public static WidgetActiveChangeNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetActiveChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetActiveChangeNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WidgetActiveChangeNotify.PARSER.parseFrom(data);
        }
        
        public static WidgetActiveChangeNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetActiveChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetActiveChangeNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetActiveChangeNotify.PARSER, input);
        }
        
        public static WidgetActiveChangeNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetActiveChangeNotify.PARSER, input, extensionRegistry);
        }
        
        public static WidgetActiveChangeNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetActiveChangeNotify.PARSER, input);
        }
        
        public static WidgetActiveChangeNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetActiveChangeNotify.PARSER, input, extensionRegistry);
        }
        
        public static WidgetActiveChangeNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetActiveChangeNotify.PARSER, input);
        }
        
        public static WidgetActiveChangeNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetActiveChangeNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WidgetActiveChangeNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WidgetActiveChangeNotify prototype) {
            return WidgetActiveChangeNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WidgetActiveChangeNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WidgetActiveChangeNotify getDefaultInstance() {
            return WidgetActiveChangeNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<WidgetActiveChangeNotify> parser() {
            return WidgetActiveChangeNotify.PARSER;
        }
        
        @Override
        public Parser<WidgetActiveChangeNotify> getParserForType() {
            return WidgetActiveChangeNotify.PARSER;
        }
        
        @Override
        public WidgetActiveChangeNotify getDefaultInstanceForType() {
            return WidgetActiveChangeNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WidgetActiveChangeNotify();
            PARSER = new AbstractParser<WidgetActiveChangeNotify>() {
                @Override
                public WidgetActiveChangeNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WidgetActiveChangeNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WidgetActiveChangeNotifyOrBuilder
        {
            private int bitField0_;
            private List<WidgetSlotDataOuterClass.WidgetSlotData> widgetDataList_;
            private RepeatedFieldBuilderV3<WidgetSlotDataOuterClass.WidgetSlotData, WidgetSlotDataOuterClass.WidgetSlotData.Builder, WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> widgetDataListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WidgetActiveChangeNotifyOuterClass.internal_static_WidgetActiveChangeNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WidgetActiveChangeNotifyOuterClass.internal_static_WidgetActiveChangeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetActiveChangeNotify.class, Builder.class);
            }
            
            private Builder() {
                this.widgetDataList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.widgetDataList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (WidgetActiveChangeNotify.alwaysUseFieldBuilders) {
                    this.getWidgetDataListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.widgetDataListBuilder_ == null) {
                    this.widgetDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.widgetDataListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WidgetActiveChangeNotifyOuterClass.internal_static_WidgetActiveChangeNotify_descriptor;
            }
            
            @Override
            public WidgetActiveChangeNotify getDefaultInstanceForType() {
                return WidgetActiveChangeNotify.getDefaultInstance();
            }
            
            @Override
            public WidgetActiveChangeNotify build() {
                final WidgetActiveChangeNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WidgetActiveChangeNotify buildPartial() {
                final WidgetActiveChangeNotify result = new WidgetActiveChangeNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.widgetDataListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.widgetDataList_ = Collections.unmodifiableList((List<? extends WidgetSlotDataOuterClass.WidgetSlotData>)this.widgetDataList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.widgetDataList_ = this.widgetDataList_;
                }
                else {
                    result.widgetDataList_ = this.widgetDataListBuilder_.build();
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
                if (other instanceof WidgetActiveChangeNotify) {
                    return this.mergeFrom((WidgetActiveChangeNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WidgetActiveChangeNotify other) {
                if (other == WidgetActiveChangeNotify.getDefaultInstance()) {
                    return this;
                }
                if (this.widgetDataListBuilder_ == null) {
                    if (!other.widgetDataList_.isEmpty()) {
                        if (this.widgetDataList_.isEmpty()) {
                            this.widgetDataList_ = other.widgetDataList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureWidgetDataListIsMutable();
                            this.widgetDataList_.addAll(other.widgetDataList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.widgetDataList_.isEmpty()) {
                    if (this.widgetDataListBuilder_.isEmpty()) {
                        this.widgetDataListBuilder_.dispose();
                        this.widgetDataListBuilder_ = null;
                        this.widgetDataList_ = other.widgetDataList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.widgetDataListBuilder_ = (WidgetActiveChangeNotify.alwaysUseFieldBuilders ? this.getWidgetDataListFieldBuilder() : null);
                    }
                    else {
                        this.widgetDataListBuilder_.addAllMessages(other.widgetDataList_);
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
                WidgetActiveChangeNotify parsedMessage = null;
                try {
                    parsedMessage = WidgetActiveChangeNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WidgetActiveChangeNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureWidgetDataListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.widgetDataList_ = new ArrayList<WidgetSlotDataOuterClass.WidgetSlotData>(this.widgetDataList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<WidgetSlotDataOuterClass.WidgetSlotData> getWidgetDataListList() {
                if (this.widgetDataListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends WidgetSlotDataOuterClass.WidgetSlotData>)this.widgetDataList_);
                }
                return this.widgetDataListBuilder_.getMessageList();
            }
            
            @Override
            public int getWidgetDataListCount() {
                if (this.widgetDataListBuilder_ == null) {
                    return this.widgetDataList_.size();
                }
                return this.widgetDataListBuilder_.getCount();
            }
            
            @Override
            public WidgetSlotDataOuterClass.WidgetSlotData getWidgetDataList(final int index) {
                if (this.widgetDataListBuilder_ == null) {
                    return this.widgetDataList_.get(index);
                }
                return this.widgetDataListBuilder_.getMessage(index);
            }
            
            public Builder setWidgetDataList(final int index, final WidgetSlotDataOuterClass.WidgetSlotData value) {
                if (this.widgetDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureWidgetDataListIsMutable();
                    this.widgetDataList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.widgetDataListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setWidgetDataList(final int index, final WidgetSlotDataOuterClass.WidgetSlotData.Builder builderForValue) {
                if (this.widgetDataListBuilder_ == null) {
                    this.ensureWidgetDataListIsMutable();
                    this.widgetDataList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.widgetDataListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addWidgetDataList(final WidgetSlotDataOuterClass.WidgetSlotData value) {
                if (this.widgetDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureWidgetDataListIsMutable();
                    this.widgetDataList_.add(value);
                    this.onChanged();
                }
                else {
                    this.widgetDataListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addWidgetDataList(final int index, final WidgetSlotDataOuterClass.WidgetSlotData value) {
                if (this.widgetDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureWidgetDataListIsMutable();
                    this.widgetDataList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.widgetDataListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addWidgetDataList(final WidgetSlotDataOuterClass.WidgetSlotData.Builder builderForValue) {
                if (this.widgetDataListBuilder_ == null) {
                    this.ensureWidgetDataListIsMutable();
                    this.widgetDataList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.widgetDataListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addWidgetDataList(final int index, final WidgetSlotDataOuterClass.WidgetSlotData.Builder builderForValue) {
                if (this.widgetDataListBuilder_ == null) {
                    this.ensureWidgetDataListIsMutable();
                    this.widgetDataList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.widgetDataListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllWidgetDataList(final Iterable<? extends WidgetSlotDataOuterClass.WidgetSlotData> values) {
                if (this.widgetDataListBuilder_ == null) {
                    this.ensureWidgetDataListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.widgetDataList_);
                    this.onChanged();
                }
                else {
                    this.widgetDataListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearWidgetDataList() {
                if (this.widgetDataListBuilder_ == null) {
                    this.widgetDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.widgetDataListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeWidgetDataList(final int index) {
                if (this.widgetDataListBuilder_ == null) {
                    this.ensureWidgetDataListIsMutable();
                    this.widgetDataList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.widgetDataListBuilder_.remove(index);
                }
                return this;
            }
            
            public WidgetSlotDataOuterClass.WidgetSlotData.Builder getWidgetDataListBuilder(final int index) {
                return this.getWidgetDataListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getWidgetDataListOrBuilder(final int index) {
                if (this.widgetDataListBuilder_ == null) {
                    return this.widgetDataList_.get(index);
                }
                return this.widgetDataListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> getWidgetDataListOrBuilderList() {
                if (this.widgetDataListBuilder_ != null) {
                    return this.widgetDataListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder>)this.widgetDataList_);
            }
            
            public WidgetSlotDataOuterClass.WidgetSlotData.Builder addWidgetDataListBuilder() {
                return this.getWidgetDataListFieldBuilder().addBuilder(WidgetSlotDataOuterClass.WidgetSlotData.getDefaultInstance());
            }
            
            public WidgetSlotDataOuterClass.WidgetSlotData.Builder addWidgetDataListBuilder(final int index) {
                return this.getWidgetDataListFieldBuilder().addBuilder(index, WidgetSlotDataOuterClass.WidgetSlotData.getDefaultInstance());
            }
            
            public List<WidgetSlotDataOuterClass.WidgetSlotData.Builder> getWidgetDataListBuilderList() {
                return this.getWidgetDataListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<WidgetSlotDataOuterClass.WidgetSlotData, WidgetSlotDataOuterClass.WidgetSlotData.Builder, WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> getWidgetDataListFieldBuilder() {
                if (this.widgetDataListBuilder_ == null) {
                    this.widgetDataListBuilder_ = new RepeatedFieldBuilderV3<WidgetSlotDataOuterClass.WidgetSlotData, WidgetSlotDataOuterClass.WidgetSlotData.Builder, WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder>(this.widgetDataList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.widgetDataList_ = null;
                }
                return this.widgetDataListBuilder_;
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
    
    public interface WidgetActiveChangeNotifyOrBuilder extends MessageOrBuilder
    {
        List<WidgetSlotDataOuterClass.WidgetSlotData> getWidgetDataListList();
        
        WidgetSlotDataOuterClass.WidgetSlotData getWidgetDataList(final int p0);
        
        int getWidgetDataListCount();
        
        List<? extends WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> getWidgetDataListOrBuilderList();
        
        WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getWidgetDataListOrBuilder(final int p0);
    }
}
