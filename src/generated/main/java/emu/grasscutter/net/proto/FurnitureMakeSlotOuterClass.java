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

public final class FurnitureMakeSlotOuterClass
{
    private static final Descriptors.Descriptor internal_static_FurnitureMakeSlot_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_FurnitureMakeSlot_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private FurnitureMakeSlotOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return FurnitureMakeSlotOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017FurnitureMakeSlot.proto\u001a\u0017FurnitureMakeData.proto\"I\n\u0011FurnitureMakeSlot\u00124\n\u0018furniture_make_data_list\u0018\u000e \u0003(\u000b2\u0012.FurnitureMakeDataB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        FurnitureMakeSlotOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { FurnitureMakeDataOuterClass.getDescriptor() });
        internal_static_FurnitureMakeSlot_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_FurnitureMakeSlot_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(FurnitureMakeSlotOuterClass.internal_static_FurnitureMakeSlot_descriptor, new String[] { "FurnitureMakeDataList" });
        FurnitureMakeDataOuterClass.getDescriptor();
    }
    
    public static final class FurnitureMakeSlot extends GeneratedMessageV3 implements FurnitureMakeSlotOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int FURNITURE_MAKE_DATA_LIST_FIELD_NUMBER = 14;
        private List<FurnitureMakeDataOuterClass.FurnitureMakeData> furnitureMakeDataList_;
        private byte memoizedIsInitialized;
        private static final FurnitureMakeSlot DEFAULT_INSTANCE;
        private static final Parser<FurnitureMakeSlot> PARSER;
        
        private FurnitureMakeSlot(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private FurnitureMakeSlot() {
            this.memoizedIsInitialized = -1;
            this.furnitureMakeDataList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new FurnitureMakeSlot();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private FurnitureMakeSlot(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 114: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.furnitureMakeDataList_ = new ArrayList<FurnitureMakeDataOuterClass.FurnitureMakeData>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.furnitureMakeDataList_.add(input.readMessage(FurnitureMakeDataOuterClass.FurnitureMakeData.parser(), extensionRegistry));
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
                    this.furnitureMakeDataList_ = Collections.unmodifiableList((List<? extends FurnitureMakeDataOuterClass.FurnitureMakeData>)this.furnitureMakeDataList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return FurnitureMakeSlotOuterClass.internal_static_FurnitureMakeSlot_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return FurnitureMakeSlotOuterClass.internal_static_FurnitureMakeSlot_fieldAccessorTable.ensureFieldAccessorsInitialized(FurnitureMakeSlot.class, Builder.class);
        }
        
        @Override
        public List<FurnitureMakeDataOuterClass.FurnitureMakeData> getFurnitureMakeDataListList() {
            return this.furnitureMakeDataList_;
        }
        
        @Override
        public List<? extends FurnitureMakeDataOuterClass.FurnitureMakeDataOrBuilder> getFurnitureMakeDataListOrBuilderList() {
            return this.furnitureMakeDataList_;
        }
        
        @Override
        public int getFurnitureMakeDataListCount() {
            return this.furnitureMakeDataList_.size();
        }
        
        @Override
        public FurnitureMakeDataOuterClass.FurnitureMakeData getFurnitureMakeDataList(final int index) {
            return this.furnitureMakeDataList_.get(index);
        }
        
        @Override
        public FurnitureMakeDataOuterClass.FurnitureMakeDataOrBuilder getFurnitureMakeDataListOrBuilder(final int index) {
            return this.furnitureMakeDataList_.get(index);
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
            for (int i = 0; i < this.furnitureMakeDataList_.size(); ++i) {
                output.writeMessage(14, this.furnitureMakeDataList_.get(i));
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
            for (int i = 0; i < this.furnitureMakeDataList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(14, this.furnitureMakeDataList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FurnitureMakeSlot)) {
                return super.equals(obj);
            }
            final FurnitureMakeSlot other = (FurnitureMakeSlot)obj;
            return this.getFurnitureMakeDataListList().equals(other.getFurnitureMakeDataListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getFurnitureMakeDataListCount() > 0) {
                hash = 37 * hash + 14;
                hash = 53 * hash + this.getFurnitureMakeDataListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static FurnitureMakeSlot parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return FurnitureMakeSlot.PARSER.parseFrom(data);
        }
        
        public static FurnitureMakeSlot parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FurnitureMakeSlot.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FurnitureMakeSlot parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return FurnitureMakeSlot.PARSER.parseFrom(data);
        }
        
        public static FurnitureMakeSlot parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FurnitureMakeSlot.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FurnitureMakeSlot parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return FurnitureMakeSlot.PARSER.parseFrom(data);
        }
        
        public static FurnitureMakeSlot parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FurnitureMakeSlot.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FurnitureMakeSlot parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureMakeSlot.PARSER, input);
        }
        
        public static FurnitureMakeSlot parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureMakeSlot.PARSER, input, extensionRegistry);
        }
        
        public static FurnitureMakeSlot parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FurnitureMakeSlot.PARSER, input);
        }
        
        public static FurnitureMakeSlot parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FurnitureMakeSlot.PARSER, input, extensionRegistry);
        }
        
        public static FurnitureMakeSlot parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureMakeSlot.PARSER, input);
        }
        
        public static FurnitureMakeSlot parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureMakeSlot.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return FurnitureMakeSlot.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final FurnitureMakeSlot prototype) {
            return FurnitureMakeSlot.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == FurnitureMakeSlot.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static FurnitureMakeSlot getDefaultInstance() {
            return FurnitureMakeSlot.DEFAULT_INSTANCE;
        }
        
        public static Parser<FurnitureMakeSlot> parser() {
            return FurnitureMakeSlot.PARSER;
        }
        
        @Override
        public Parser<FurnitureMakeSlot> getParserForType() {
            return FurnitureMakeSlot.PARSER;
        }
        
        @Override
        public FurnitureMakeSlot getDefaultInstanceForType() {
            return FurnitureMakeSlot.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new FurnitureMakeSlot();
            PARSER = new AbstractParser<FurnitureMakeSlot>() {
                @Override
                public FurnitureMakeSlot parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new FurnitureMakeSlot(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FurnitureMakeSlotOrBuilder
        {
            private int bitField0_;
            private List<FurnitureMakeDataOuterClass.FurnitureMakeData> furnitureMakeDataList_;
            private RepeatedFieldBuilderV3<FurnitureMakeDataOuterClass.FurnitureMakeData, FurnitureMakeDataOuterClass.FurnitureMakeData.Builder, FurnitureMakeDataOuterClass.FurnitureMakeDataOrBuilder> furnitureMakeDataListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return FurnitureMakeSlotOuterClass.internal_static_FurnitureMakeSlot_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return FurnitureMakeSlotOuterClass.internal_static_FurnitureMakeSlot_fieldAccessorTable.ensureFieldAccessorsInitialized(FurnitureMakeSlot.class, Builder.class);
            }
            
            private Builder() {
                this.furnitureMakeDataList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.furnitureMakeDataList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (FurnitureMakeSlot.alwaysUseFieldBuilders) {
                    this.getFurnitureMakeDataListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.furnitureMakeDataListBuilder_ == null) {
                    this.furnitureMakeDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.furnitureMakeDataListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return FurnitureMakeSlotOuterClass.internal_static_FurnitureMakeSlot_descriptor;
            }
            
            @Override
            public FurnitureMakeSlot getDefaultInstanceForType() {
                return FurnitureMakeSlot.getDefaultInstance();
            }
            
            @Override
            public FurnitureMakeSlot build() {
                final FurnitureMakeSlot result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public FurnitureMakeSlot buildPartial() {
                final FurnitureMakeSlot result = new FurnitureMakeSlot(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.furnitureMakeDataListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.furnitureMakeDataList_ = Collections.unmodifiableList((List<? extends FurnitureMakeDataOuterClass.FurnitureMakeData>)this.furnitureMakeDataList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.furnitureMakeDataList_ = this.furnitureMakeDataList_;
                }
                else {
                    result.furnitureMakeDataList_ = this.furnitureMakeDataListBuilder_.build();
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
                if (other instanceof FurnitureMakeSlot) {
                    return this.mergeFrom((FurnitureMakeSlot)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final FurnitureMakeSlot other) {
                if (other == FurnitureMakeSlot.getDefaultInstance()) {
                    return this;
                }
                if (this.furnitureMakeDataListBuilder_ == null) {
                    if (!other.furnitureMakeDataList_.isEmpty()) {
                        if (this.furnitureMakeDataList_.isEmpty()) {
                            this.furnitureMakeDataList_ = other.furnitureMakeDataList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureFurnitureMakeDataListIsMutable();
                            this.furnitureMakeDataList_.addAll(other.furnitureMakeDataList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.furnitureMakeDataList_.isEmpty()) {
                    if (this.furnitureMakeDataListBuilder_.isEmpty()) {
                        this.furnitureMakeDataListBuilder_.dispose();
                        this.furnitureMakeDataListBuilder_ = null;
                        this.furnitureMakeDataList_ = other.furnitureMakeDataList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.furnitureMakeDataListBuilder_ = (FurnitureMakeSlot.alwaysUseFieldBuilders ? this.getFurnitureMakeDataListFieldBuilder() : null);
                    }
                    else {
                        this.furnitureMakeDataListBuilder_.addAllMessages(other.furnitureMakeDataList_);
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
                FurnitureMakeSlot parsedMessage = null;
                try {
                    parsedMessage = FurnitureMakeSlot.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (FurnitureMakeSlot)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureFurnitureMakeDataListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.furnitureMakeDataList_ = new ArrayList<FurnitureMakeDataOuterClass.FurnitureMakeData>(this.furnitureMakeDataList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<FurnitureMakeDataOuterClass.FurnitureMakeData> getFurnitureMakeDataListList() {
                if (this.furnitureMakeDataListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends FurnitureMakeDataOuterClass.FurnitureMakeData>)this.furnitureMakeDataList_);
                }
                return this.furnitureMakeDataListBuilder_.getMessageList();
            }
            
            @Override
            public int getFurnitureMakeDataListCount() {
                if (this.furnitureMakeDataListBuilder_ == null) {
                    return this.furnitureMakeDataList_.size();
                }
                return this.furnitureMakeDataListBuilder_.getCount();
            }
            
            @Override
            public FurnitureMakeDataOuterClass.FurnitureMakeData getFurnitureMakeDataList(final int index) {
                if (this.furnitureMakeDataListBuilder_ == null) {
                    return this.furnitureMakeDataList_.get(index);
                }
                return this.furnitureMakeDataListBuilder_.getMessage(index);
            }
            
            public Builder setFurnitureMakeDataList(final int index, final FurnitureMakeDataOuterClass.FurnitureMakeData value) {
                if (this.furnitureMakeDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFurnitureMakeDataListIsMutable();
                    this.furnitureMakeDataList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.furnitureMakeDataListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setFurnitureMakeDataList(final int index, final FurnitureMakeDataOuterClass.FurnitureMakeData.Builder builderForValue) {
                if (this.furnitureMakeDataListBuilder_ == null) {
                    this.ensureFurnitureMakeDataListIsMutable();
                    this.furnitureMakeDataList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.furnitureMakeDataListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addFurnitureMakeDataList(final FurnitureMakeDataOuterClass.FurnitureMakeData value) {
                if (this.furnitureMakeDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFurnitureMakeDataListIsMutable();
                    this.furnitureMakeDataList_.add(value);
                    this.onChanged();
                }
                else {
                    this.furnitureMakeDataListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addFurnitureMakeDataList(final int index, final FurnitureMakeDataOuterClass.FurnitureMakeData value) {
                if (this.furnitureMakeDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFurnitureMakeDataListIsMutable();
                    this.furnitureMakeDataList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.furnitureMakeDataListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addFurnitureMakeDataList(final FurnitureMakeDataOuterClass.FurnitureMakeData.Builder builderForValue) {
                if (this.furnitureMakeDataListBuilder_ == null) {
                    this.ensureFurnitureMakeDataListIsMutable();
                    this.furnitureMakeDataList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.furnitureMakeDataListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addFurnitureMakeDataList(final int index, final FurnitureMakeDataOuterClass.FurnitureMakeData.Builder builderForValue) {
                if (this.furnitureMakeDataListBuilder_ == null) {
                    this.ensureFurnitureMakeDataListIsMutable();
                    this.furnitureMakeDataList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.furnitureMakeDataListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllFurnitureMakeDataList(final Iterable<? extends FurnitureMakeDataOuterClass.FurnitureMakeData> values) {
                if (this.furnitureMakeDataListBuilder_ == null) {
                    this.ensureFurnitureMakeDataListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.furnitureMakeDataList_);
                    this.onChanged();
                }
                else {
                    this.furnitureMakeDataListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearFurnitureMakeDataList() {
                if (this.furnitureMakeDataListBuilder_ == null) {
                    this.furnitureMakeDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.furnitureMakeDataListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeFurnitureMakeDataList(final int index) {
                if (this.furnitureMakeDataListBuilder_ == null) {
                    this.ensureFurnitureMakeDataListIsMutable();
                    this.furnitureMakeDataList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.furnitureMakeDataListBuilder_.remove(index);
                }
                return this;
            }
            
            public FurnitureMakeDataOuterClass.FurnitureMakeData.Builder getFurnitureMakeDataListBuilder(final int index) {
                return this.getFurnitureMakeDataListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public FurnitureMakeDataOuterClass.FurnitureMakeDataOrBuilder getFurnitureMakeDataListOrBuilder(final int index) {
                if (this.furnitureMakeDataListBuilder_ == null) {
                    return this.furnitureMakeDataList_.get(index);
                }
                return this.furnitureMakeDataListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends FurnitureMakeDataOuterClass.FurnitureMakeDataOrBuilder> getFurnitureMakeDataListOrBuilderList() {
                if (this.furnitureMakeDataListBuilder_ != null) {
                    return this.furnitureMakeDataListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends FurnitureMakeDataOuterClass.FurnitureMakeDataOrBuilder>)this.furnitureMakeDataList_);
            }
            
            public FurnitureMakeDataOuterClass.FurnitureMakeData.Builder addFurnitureMakeDataListBuilder() {
                return this.getFurnitureMakeDataListFieldBuilder().addBuilder(FurnitureMakeDataOuterClass.FurnitureMakeData.getDefaultInstance());
            }
            
            public FurnitureMakeDataOuterClass.FurnitureMakeData.Builder addFurnitureMakeDataListBuilder(final int index) {
                return this.getFurnitureMakeDataListFieldBuilder().addBuilder(index, FurnitureMakeDataOuterClass.FurnitureMakeData.getDefaultInstance());
            }
            
            public List<FurnitureMakeDataOuterClass.FurnitureMakeData.Builder> getFurnitureMakeDataListBuilderList() {
                return this.getFurnitureMakeDataListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<FurnitureMakeDataOuterClass.FurnitureMakeData, FurnitureMakeDataOuterClass.FurnitureMakeData.Builder, FurnitureMakeDataOuterClass.FurnitureMakeDataOrBuilder> getFurnitureMakeDataListFieldBuilder() {
                if (this.furnitureMakeDataListBuilder_ == null) {
                    this.furnitureMakeDataListBuilder_ = new RepeatedFieldBuilderV3<FurnitureMakeDataOuterClass.FurnitureMakeData, FurnitureMakeDataOuterClass.FurnitureMakeData.Builder, FurnitureMakeDataOuterClass.FurnitureMakeDataOrBuilder>(this.furnitureMakeDataList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.furnitureMakeDataList_ = null;
                }
                return this.furnitureMakeDataListBuilder_;
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
    
    public interface FurnitureMakeSlotOrBuilder extends MessageOrBuilder
    {
        List<FurnitureMakeDataOuterClass.FurnitureMakeData> getFurnitureMakeDataListList();
        
        FurnitureMakeDataOuterClass.FurnitureMakeData getFurnitureMakeDataList(final int p0);
        
        int getFurnitureMakeDataListCount();
        
        List<? extends FurnitureMakeDataOuterClass.FurnitureMakeDataOrBuilder> getFurnitureMakeDataListOrBuilderList();
        
        FurnitureMakeDataOuterClass.FurnitureMakeDataOrBuilder getFurnitureMakeDataListOrBuilder(final int p0);
    }
}
