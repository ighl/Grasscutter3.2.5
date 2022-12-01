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

public final class OneofGatherPointDetectorDataNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_OneofGatherPointDetectorDataNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_OneofGatherPointDetectorDataNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private OneofGatherPointDetectorDataNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return OneofGatherPointDetectorDataNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n(OneofGatherPointDetectorDataNotify.proto\u001a\"OneofGatherPointDetectorData.proto\"r\n\"OneofGatherPointDetectorDataNotify\u0012L\n%oneof_gather_point_detector_data_list\u0018\u0003 \u0003(\u000b2\u001d.OneofGatherPointDetectorDataB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        OneofGatherPointDetectorDataNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { OneofGatherPointDetectorDataOuterClass.getDescriptor() });
        internal_static_OneofGatherPointDetectorDataNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_OneofGatherPointDetectorDataNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(OneofGatherPointDetectorDataNotifyOuterClass.internal_static_OneofGatherPointDetectorDataNotify_descriptor, new String[] { "OneofGatherPointDetectorDataList" });
        OneofGatherPointDetectorDataOuterClass.getDescriptor();
    }
    
    public static final class OneofGatherPointDetectorDataNotify extends GeneratedMessageV3 implements OneofGatherPointDetectorDataNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ONEOF_GATHER_POINT_DETECTOR_DATA_LIST_FIELD_NUMBER = 3;
        private List<OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData> oneofGatherPointDetectorDataList_;
        private byte memoizedIsInitialized;
        private static final OneofGatherPointDetectorDataNotify DEFAULT_INSTANCE;
        private static final Parser<OneofGatherPointDetectorDataNotify> PARSER;
        
        private OneofGatherPointDetectorDataNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private OneofGatherPointDetectorDataNotify() {
            this.memoizedIsInitialized = -1;
            this.oneofGatherPointDetectorDataList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new OneofGatherPointDetectorDataNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private OneofGatherPointDetectorDataNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 26: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.oneofGatherPointDetectorDataList_ = new ArrayList<OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.oneofGatherPointDetectorDataList_.add(input.readMessage(OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.parser(), extensionRegistry));
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
                    this.oneofGatherPointDetectorDataList_ = Collections.unmodifiableList((List<? extends OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData>)this.oneofGatherPointDetectorDataList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return OneofGatherPointDetectorDataNotifyOuterClass.internal_static_OneofGatherPointDetectorDataNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return OneofGatherPointDetectorDataNotifyOuterClass.internal_static_OneofGatherPointDetectorDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(OneofGatherPointDetectorDataNotify.class, Builder.class);
        }
        
        @Override
        public List<OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData> getOneofGatherPointDetectorDataListList() {
            return this.oneofGatherPointDetectorDataList_;
        }
        
        @Override
        public List<? extends OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorDataOrBuilder> getOneofGatherPointDetectorDataListOrBuilderList() {
            return this.oneofGatherPointDetectorDataList_;
        }
        
        @Override
        public int getOneofGatherPointDetectorDataListCount() {
            return this.oneofGatherPointDetectorDataList_.size();
        }
        
        @Override
        public OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData getOneofGatherPointDetectorDataList(final int index) {
            return this.oneofGatherPointDetectorDataList_.get(index);
        }
        
        @Override
        public OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorDataOrBuilder getOneofGatherPointDetectorDataListOrBuilder(final int index) {
            return this.oneofGatherPointDetectorDataList_.get(index);
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
            for (int i = 0; i < this.oneofGatherPointDetectorDataList_.size(); ++i) {
                output.writeMessage(3, this.oneofGatherPointDetectorDataList_.get(i));
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
            for (int i = 0; i < this.oneofGatherPointDetectorDataList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(3, this.oneofGatherPointDetectorDataList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OneofGatherPointDetectorDataNotify)) {
                return super.equals(obj);
            }
            final OneofGatherPointDetectorDataNotify other = (OneofGatherPointDetectorDataNotify)obj;
            return this.getOneofGatherPointDetectorDataListList().equals(other.getOneofGatherPointDetectorDataListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getOneofGatherPointDetectorDataListCount() > 0) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getOneofGatherPointDetectorDataListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static OneofGatherPointDetectorDataNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return OneofGatherPointDetectorDataNotify.PARSER.parseFrom(data);
        }
        
        public static OneofGatherPointDetectorDataNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return OneofGatherPointDetectorDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static OneofGatherPointDetectorDataNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return OneofGatherPointDetectorDataNotify.PARSER.parseFrom(data);
        }
        
        public static OneofGatherPointDetectorDataNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return OneofGatherPointDetectorDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static OneofGatherPointDetectorDataNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return OneofGatherPointDetectorDataNotify.PARSER.parseFrom(data);
        }
        
        public static OneofGatherPointDetectorDataNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return OneofGatherPointDetectorDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static OneofGatherPointDetectorDataNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(OneofGatherPointDetectorDataNotify.PARSER, input);
        }
        
        public static OneofGatherPointDetectorDataNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(OneofGatherPointDetectorDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static OneofGatherPointDetectorDataNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(OneofGatherPointDetectorDataNotify.PARSER, input);
        }
        
        public static OneofGatherPointDetectorDataNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(OneofGatherPointDetectorDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static OneofGatherPointDetectorDataNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(OneofGatherPointDetectorDataNotify.PARSER, input);
        }
        
        public static OneofGatherPointDetectorDataNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(OneofGatherPointDetectorDataNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return OneofGatherPointDetectorDataNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final OneofGatherPointDetectorDataNotify prototype) {
            return OneofGatherPointDetectorDataNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == OneofGatherPointDetectorDataNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static OneofGatherPointDetectorDataNotify getDefaultInstance() {
            return OneofGatherPointDetectorDataNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<OneofGatherPointDetectorDataNotify> parser() {
            return OneofGatherPointDetectorDataNotify.PARSER;
        }
        
        @Override
        public Parser<OneofGatherPointDetectorDataNotify> getParserForType() {
            return OneofGatherPointDetectorDataNotify.PARSER;
        }
        
        @Override
        public OneofGatherPointDetectorDataNotify getDefaultInstanceForType() {
            return OneofGatherPointDetectorDataNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new OneofGatherPointDetectorDataNotify();
            PARSER = new AbstractParser<OneofGatherPointDetectorDataNotify>() {
                @Override
                public OneofGatherPointDetectorDataNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new OneofGatherPointDetectorDataNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OneofGatherPointDetectorDataNotifyOrBuilder
        {
            private int bitField0_;
            private List<OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData> oneofGatherPointDetectorDataList_;
            private RepeatedFieldBuilderV3<OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData, OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder, OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorDataOrBuilder> oneofGatherPointDetectorDataListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return OneofGatherPointDetectorDataNotifyOuterClass.internal_static_OneofGatherPointDetectorDataNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return OneofGatherPointDetectorDataNotifyOuterClass.internal_static_OneofGatherPointDetectorDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(OneofGatherPointDetectorDataNotify.class, Builder.class);
            }
            
            private Builder() {
                this.oneofGatherPointDetectorDataList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.oneofGatherPointDetectorDataList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (OneofGatherPointDetectorDataNotify.alwaysUseFieldBuilders) {
                    this.getOneofGatherPointDetectorDataListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    this.oneofGatherPointDetectorDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.oneofGatherPointDetectorDataListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return OneofGatherPointDetectorDataNotifyOuterClass.internal_static_OneofGatherPointDetectorDataNotify_descriptor;
            }
            
            @Override
            public OneofGatherPointDetectorDataNotify getDefaultInstanceForType() {
                return OneofGatherPointDetectorDataNotify.getDefaultInstance();
            }
            
            @Override
            public OneofGatherPointDetectorDataNotify build() {
                final OneofGatherPointDetectorDataNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public OneofGatherPointDetectorDataNotify buildPartial() {
                final OneofGatherPointDetectorDataNotify result = new OneofGatherPointDetectorDataNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.oneofGatherPointDetectorDataList_ = Collections.unmodifiableList((List<? extends OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData>)this.oneofGatherPointDetectorDataList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.oneofGatherPointDetectorDataList_ = this.oneofGatherPointDetectorDataList_;
                }
                else {
                    result.oneofGatherPointDetectorDataList_ = this.oneofGatherPointDetectorDataListBuilder_.build();
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
                if (other instanceof OneofGatherPointDetectorDataNotify) {
                    return this.mergeFrom((OneofGatherPointDetectorDataNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final OneofGatherPointDetectorDataNotify other) {
                if (other == OneofGatherPointDetectorDataNotify.getDefaultInstance()) {
                    return this;
                }
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    if (!other.oneofGatherPointDetectorDataList_.isEmpty()) {
                        if (this.oneofGatherPointDetectorDataList_.isEmpty()) {
                            this.oneofGatherPointDetectorDataList_ = other.oneofGatherPointDetectorDataList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureOneofGatherPointDetectorDataListIsMutable();
                            this.oneofGatherPointDetectorDataList_.addAll(other.oneofGatherPointDetectorDataList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.oneofGatherPointDetectorDataList_.isEmpty()) {
                    if (this.oneofGatherPointDetectorDataListBuilder_.isEmpty()) {
                        this.oneofGatherPointDetectorDataListBuilder_.dispose();
                        this.oneofGatherPointDetectorDataListBuilder_ = null;
                        this.oneofGatherPointDetectorDataList_ = other.oneofGatherPointDetectorDataList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.oneofGatherPointDetectorDataListBuilder_ = (OneofGatherPointDetectorDataNotify.alwaysUseFieldBuilders ? this.getOneofGatherPointDetectorDataListFieldBuilder() : null);
                    }
                    else {
                        this.oneofGatherPointDetectorDataListBuilder_.addAllMessages(other.oneofGatherPointDetectorDataList_);
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
                OneofGatherPointDetectorDataNotify parsedMessage = null;
                try {
                    parsedMessage = OneofGatherPointDetectorDataNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (OneofGatherPointDetectorDataNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureOneofGatherPointDetectorDataListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.oneofGatherPointDetectorDataList_ = new ArrayList<OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData>(this.oneofGatherPointDetectorDataList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData> getOneofGatherPointDetectorDataListList() {
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData>)this.oneofGatherPointDetectorDataList_);
                }
                return this.oneofGatherPointDetectorDataListBuilder_.getMessageList();
            }
            
            @Override
            public int getOneofGatherPointDetectorDataListCount() {
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    return this.oneofGatherPointDetectorDataList_.size();
                }
                return this.oneofGatherPointDetectorDataListBuilder_.getCount();
            }
            
            @Override
            public OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData getOneofGatherPointDetectorDataList(final int index) {
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    return this.oneofGatherPointDetectorDataList_.get(index);
                }
                return this.oneofGatherPointDetectorDataListBuilder_.getMessage(index);
            }
            
            public Builder setOneofGatherPointDetectorDataList(final int index, final OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData value) {
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureOneofGatherPointDetectorDataListIsMutable();
                    this.oneofGatherPointDetectorDataList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.oneofGatherPointDetectorDataListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setOneofGatherPointDetectorDataList(final int index, final OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder builderForValue) {
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    this.ensureOneofGatherPointDetectorDataListIsMutable();
                    this.oneofGatherPointDetectorDataList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.oneofGatherPointDetectorDataListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addOneofGatherPointDetectorDataList(final OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData value) {
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureOneofGatherPointDetectorDataListIsMutable();
                    this.oneofGatherPointDetectorDataList_.add(value);
                    this.onChanged();
                }
                else {
                    this.oneofGatherPointDetectorDataListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addOneofGatherPointDetectorDataList(final int index, final OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData value) {
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureOneofGatherPointDetectorDataListIsMutable();
                    this.oneofGatherPointDetectorDataList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.oneofGatherPointDetectorDataListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addOneofGatherPointDetectorDataList(final OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder builderForValue) {
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    this.ensureOneofGatherPointDetectorDataListIsMutable();
                    this.oneofGatherPointDetectorDataList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.oneofGatherPointDetectorDataListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addOneofGatherPointDetectorDataList(final int index, final OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder builderForValue) {
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    this.ensureOneofGatherPointDetectorDataListIsMutable();
                    this.oneofGatherPointDetectorDataList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.oneofGatherPointDetectorDataListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllOneofGatherPointDetectorDataList(final Iterable<? extends OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData> values) {
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    this.ensureOneofGatherPointDetectorDataListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.oneofGatherPointDetectorDataList_);
                    this.onChanged();
                }
                else {
                    this.oneofGatherPointDetectorDataListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearOneofGatherPointDetectorDataList() {
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    this.oneofGatherPointDetectorDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.oneofGatherPointDetectorDataListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeOneofGatherPointDetectorDataList(final int index) {
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    this.ensureOneofGatherPointDetectorDataListIsMutable();
                    this.oneofGatherPointDetectorDataList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.oneofGatherPointDetectorDataListBuilder_.remove(index);
                }
                return this;
            }
            
            public OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder getOneofGatherPointDetectorDataListBuilder(final int index) {
                return this.getOneofGatherPointDetectorDataListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorDataOrBuilder getOneofGatherPointDetectorDataListOrBuilder(final int index) {
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    return this.oneofGatherPointDetectorDataList_.get(index);
                }
                return this.oneofGatherPointDetectorDataListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorDataOrBuilder> getOneofGatherPointDetectorDataListOrBuilderList() {
                if (this.oneofGatherPointDetectorDataListBuilder_ != null) {
                    return this.oneofGatherPointDetectorDataListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorDataOrBuilder>)this.oneofGatherPointDetectorDataList_);
            }
            
            public OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder addOneofGatherPointDetectorDataListBuilder() {
                return this.getOneofGatherPointDetectorDataListFieldBuilder().addBuilder(OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.getDefaultInstance());
            }
            
            public OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder addOneofGatherPointDetectorDataListBuilder(final int index) {
                return this.getOneofGatherPointDetectorDataListFieldBuilder().addBuilder(index, OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.getDefaultInstance());
            }
            
            public List<OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder> getOneofGatherPointDetectorDataListBuilderList() {
                return this.getOneofGatherPointDetectorDataListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData, OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder, OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorDataOrBuilder> getOneofGatherPointDetectorDataListFieldBuilder() {
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    this.oneofGatherPointDetectorDataListBuilder_ = new RepeatedFieldBuilderV3<OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData, OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder, OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorDataOrBuilder>(this.oneofGatherPointDetectorDataList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.oneofGatherPointDetectorDataList_ = null;
                }
                return this.oneofGatherPointDetectorDataListBuilder_;
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
    
    public interface OneofGatherPointDetectorDataNotifyOrBuilder extends MessageOrBuilder
    {
        List<OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData> getOneofGatherPointDetectorDataListList();
        
        OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData getOneofGatherPointDetectorDataList(final int p0);
        
        int getOneofGatherPointDetectorDataListCount();
        
        List<? extends OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorDataOrBuilder> getOneofGatherPointDetectorDataListOrBuilderList();
        
        OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorDataOrBuilder getOneofGatherPointDetectorDataListOrBuilder(final int p0);
    }
}
