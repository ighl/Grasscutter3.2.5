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

public final class FurnitureCurModuleArrangeCountNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_FurnitureCurModuleArrangeCountNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_FurnitureCurModuleArrangeCountNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private FurnitureCurModuleArrangeCountNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return FurnitureCurModuleArrangeCountNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n*FurnitureCurModuleArrangeCountNotify.proto\u001a\u0010Uint32Pair.proto\"Y\n$FurnitureCurModuleArrangeCountNotify\u00121\n\u001cfurniture_arrange_count_list\u0018\r \u0003(\u000b2\u000b.Uint32PairB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        FurnitureCurModuleArrangeCountNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { Uint32PairOuterClass.getDescriptor() });
        internal_static_FurnitureCurModuleArrangeCountNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_FurnitureCurModuleArrangeCountNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(FurnitureCurModuleArrangeCountNotifyOuterClass.internal_static_FurnitureCurModuleArrangeCountNotify_descriptor, new String[] { "FurnitureArrangeCountList" });
        Uint32PairOuterClass.getDescriptor();
    }
    
    public static final class FurnitureCurModuleArrangeCountNotify extends GeneratedMessageV3 implements FurnitureCurModuleArrangeCountNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int FURNITURE_ARRANGE_COUNT_LIST_FIELD_NUMBER = 13;
        private List<Uint32PairOuterClass.Uint32Pair> furnitureArrangeCountList_;
        private byte memoizedIsInitialized;
        private static final FurnitureCurModuleArrangeCountNotify DEFAULT_INSTANCE;
        private static final Parser<FurnitureCurModuleArrangeCountNotify> PARSER;
        
        private FurnitureCurModuleArrangeCountNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private FurnitureCurModuleArrangeCountNotify() {
            this.memoizedIsInitialized = -1;
            this.furnitureArrangeCountList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new FurnitureCurModuleArrangeCountNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private FurnitureCurModuleArrangeCountNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.furnitureArrangeCountList_ = new ArrayList<Uint32PairOuterClass.Uint32Pair>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.furnitureArrangeCountList_.add(input.readMessage(Uint32PairOuterClass.Uint32Pair.parser(), extensionRegistry));
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
                    this.furnitureArrangeCountList_ = Collections.unmodifiableList((List<? extends Uint32PairOuterClass.Uint32Pair>)this.furnitureArrangeCountList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return FurnitureCurModuleArrangeCountNotifyOuterClass.internal_static_FurnitureCurModuleArrangeCountNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return FurnitureCurModuleArrangeCountNotifyOuterClass.internal_static_FurnitureCurModuleArrangeCountNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(FurnitureCurModuleArrangeCountNotify.class, Builder.class);
        }
        
        @Override
        public List<Uint32PairOuterClass.Uint32Pair> getFurnitureArrangeCountListList() {
            return this.furnitureArrangeCountList_;
        }
        
        @Override
        public List<? extends Uint32PairOuterClass.Uint32PairOrBuilder> getFurnitureArrangeCountListOrBuilderList() {
            return this.furnitureArrangeCountList_;
        }
        
        @Override
        public int getFurnitureArrangeCountListCount() {
            return this.furnitureArrangeCountList_.size();
        }
        
        @Override
        public Uint32PairOuterClass.Uint32Pair getFurnitureArrangeCountList(final int index) {
            return this.furnitureArrangeCountList_.get(index);
        }
        
        @Override
        public Uint32PairOuterClass.Uint32PairOrBuilder getFurnitureArrangeCountListOrBuilder(final int index) {
            return this.furnitureArrangeCountList_.get(index);
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
            for (int i = 0; i < this.furnitureArrangeCountList_.size(); ++i) {
                output.writeMessage(13, this.furnitureArrangeCountList_.get(i));
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
            for (int i = 0; i < this.furnitureArrangeCountList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(13, this.furnitureArrangeCountList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FurnitureCurModuleArrangeCountNotify)) {
                return super.equals(obj);
            }
            final FurnitureCurModuleArrangeCountNotify other = (FurnitureCurModuleArrangeCountNotify)obj;
            return this.getFurnitureArrangeCountListList().equals(other.getFurnitureArrangeCountListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getFurnitureArrangeCountListCount() > 0) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.getFurnitureArrangeCountListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static FurnitureCurModuleArrangeCountNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return FurnitureCurModuleArrangeCountNotify.PARSER.parseFrom(data);
        }
        
        public static FurnitureCurModuleArrangeCountNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FurnitureCurModuleArrangeCountNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FurnitureCurModuleArrangeCountNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return FurnitureCurModuleArrangeCountNotify.PARSER.parseFrom(data);
        }
        
        public static FurnitureCurModuleArrangeCountNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FurnitureCurModuleArrangeCountNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FurnitureCurModuleArrangeCountNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return FurnitureCurModuleArrangeCountNotify.PARSER.parseFrom(data);
        }
        
        public static FurnitureCurModuleArrangeCountNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FurnitureCurModuleArrangeCountNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FurnitureCurModuleArrangeCountNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureCurModuleArrangeCountNotify.PARSER, input);
        }
        
        public static FurnitureCurModuleArrangeCountNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureCurModuleArrangeCountNotify.PARSER, input, extensionRegistry);
        }
        
        public static FurnitureCurModuleArrangeCountNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FurnitureCurModuleArrangeCountNotify.PARSER, input);
        }
        
        public static FurnitureCurModuleArrangeCountNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FurnitureCurModuleArrangeCountNotify.PARSER, input, extensionRegistry);
        }
        
        public static FurnitureCurModuleArrangeCountNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureCurModuleArrangeCountNotify.PARSER, input);
        }
        
        public static FurnitureCurModuleArrangeCountNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureCurModuleArrangeCountNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return FurnitureCurModuleArrangeCountNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final FurnitureCurModuleArrangeCountNotify prototype) {
            return FurnitureCurModuleArrangeCountNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == FurnitureCurModuleArrangeCountNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static FurnitureCurModuleArrangeCountNotify getDefaultInstance() {
            return FurnitureCurModuleArrangeCountNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<FurnitureCurModuleArrangeCountNotify> parser() {
            return FurnitureCurModuleArrangeCountNotify.PARSER;
        }
        
        @Override
        public Parser<FurnitureCurModuleArrangeCountNotify> getParserForType() {
            return FurnitureCurModuleArrangeCountNotify.PARSER;
        }
        
        @Override
        public FurnitureCurModuleArrangeCountNotify getDefaultInstanceForType() {
            return FurnitureCurModuleArrangeCountNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new FurnitureCurModuleArrangeCountNotify();
            PARSER = new AbstractParser<FurnitureCurModuleArrangeCountNotify>() {
                @Override
                public FurnitureCurModuleArrangeCountNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new FurnitureCurModuleArrangeCountNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FurnitureCurModuleArrangeCountNotifyOrBuilder
        {
            private int bitField0_;
            private List<Uint32PairOuterClass.Uint32Pair> furnitureArrangeCountList_;
            private RepeatedFieldBuilderV3<Uint32PairOuterClass.Uint32Pair, Uint32PairOuterClass.Uint32Pair.Builder, Uint32PairOuterClass.Uint32PairOrBuilder> furnitureArrangeCountListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return FurnitureCurModuleArrangeCountNotifyOuterClass.internal_static_FurnitureCurModuleArrangeCountNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return FurnitureCurModuleArrangeCountNotifyOuterClass.internal_static_FurnitureCurModuleArrangeCountNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(FurnitureCurModuleArrangeCountNotify.class, Builder.class);
            }
            
            private Builder() {
                this.furnitureArrangeCountList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.furnitureArrangeCountList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (FurnitureCurModuleArrangeCountNotify.alwaysUseFieldBuilders) {
                    this.getFurnitureArrangeCountListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.furnitureArrangeCountListBuilder_ == null) {
                    this.furnitureArrangeCountList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.furnitureArrangeCountListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return FurnitureCurModuleArrangeCountNotifyOuterClass.internal_static_FurnitureCurModuleArrangeCountNotify_descriptor;
            }
            
            @Override
            public FurnitureCurModuleArrangeCountNotify getDefaultInstanceForType() {
                return FurnitureCurModuleArrangeCountNotify.getDefaultInstance();
            }
            
            @Override
            public FurnitureCurModuleArrangeCountNotify build() {
                final FurnitureCurModuleArrangeCountNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public FurnitureCurModuleArrangeCountNotify buildPartial() {
                final FurnitureCurModuleArrangeCountNotify result = new FurnitureCurModuleArrangeCountNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.furnitureArrangeCountListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.furnitureArrangeCountList_ = Collections.unmodifiableList((List<? extends Uint32PairOuterClass.Uint32Pair>)this.furnitureArrangeCountList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.furnitureArrangeCountList_ = this.furnitureArrangeCountList_;
                }
                else {
                    result.furnitureArrangeCountList_ = this.furnitureArrangeCountListBuilder_.build();
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
                if (other instanceof FurnitureCurModuleArrangeCountNotify) {
                    return this.mergeFrom((FurnitureCurModuleArrangeCountNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final FurnitureCurModuleArrangeCountNotify other) {
                if (other == FurnitureCurModuleArrangeCountNotify.getDefaultInstance()) {
                    return this;
                }
                if (this.furnitureArrangeCountListBuilder_ == null) {
                    if (!other.furnitureArrangeCountList_.isEmpty()) {
                        if (this.furnitureArrangeCountList_.isEmpty()) {
                            this.furnitureArrangeCountList_ = other.furnitureArrangeCountList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureFurnitureArrangeCountListIsMutable();
                            this.furnitureArrangeCountList_.addAll(other.furnitureArrangeCountList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.furnitureArrangeCountList_.isEmpty()) {
                    if (this.furnitureArrangeCountListBuilder_.isEmpty()) {
                        this.furnitureArrangeCountListBuilder_.dispose();
                        this.furnitureArrangeCountListBuilder_ = null;
                        this.furnitureArrangeCountList_ = other.furnitureArrangeCountList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.furnitureArrangeCountListBuilder_ = (FurnitureCurModuleArrangeCountNotify.alwaysUseFieldBuilders ? this.getFurnitureArrangeCountListFieldBuilder() : null);
                    }
                    else {
                        this.furnitureArrangeCountListBuilder_.addAllMessages(other.furnitureArrangeCountList_);
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
                FurnitureCurModuleArrangeCountNotify parsedMessage = null;
                try {
                    parsedMessage = FurnitureCurModuleArrangeCountNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (FurnitureCurModuleArrangeCountNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureFurnitureArrangeCountListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.furnitureArrangeCountList_ = new ArrayList<Uint32PairOuterClass.Uint32Pair>(this.furnitureArrangeCountList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Uint32PairOuterClass.Uint32Pair> getFurnitureArrangeCountListList() {
                if (this.furnitureArrangeCountListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends Uint32PairOuterClass.Uint32Pair>)this.furnitureArrangeCountList_);
                }
                return this.furnitureArrangeCountListBuilder_.getMessageList();
            }
            
            @Override
            public int getFurnitureArrangeCountListCount() {
                if (this.furnitureArrangeCountListBuilder_ == null) {
                    return this.furnitureArrangeCountList_.size();
                }
                return this.furnitureArrangeCountListBuilder_.getCount();
            }
            
            @Override
            public Uint32PairOuterClass.Uint32Pair getFurnitureArrangeCountList(final int index) {
                if (this.furnitureArrangeCountListBuilder_ == null) {
                    return this.furnitureArrangeCountList_.get(index);
                }
                return this.furnitureArrangeCountListBuilder_.getMessage(index);
            }
            
            public Builder setFurnitureArrangeCountList(final int index, final Uint32PairOuterClass.Uint32Pair value) {
                if (this.furnitureArrangeCountListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFurnitureArrangeCountListIsMutable();
                    this.furnitureArrangeCountList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.furnitureArrangeCountListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setFurnitureArrangeCountList(final int index, final Uint32PairOuterClass.Uint32Pair.Builder builderForValue) {
                if (this.furnitureArrangeCountListBuilder_ == null) {
                    this.ensureFurnitureArrangeCountListIsMutable();
                    this.furnitureArrangeCountList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.furnitureArrangeCountListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addFurnitureArrangeCountList(final Uint32PairOuterClass.Uint32Pair value) {
                if (this.furnitureArrangeCountListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFurnitureArrangeCountListIsMutable();
                    this.furnitureArrangeCountList_.add(value);
                    this.onChanged();
                }
                else {
                    this.furnitureArrangeCountListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addFurnitureArrangeCountList(final int index, final Uint32PairOuterClass.Uint32Pair value) {
                if (this.furnitureArrangeCountListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFurnitureArrangeCountListIsMutable();
                    this.furnitureArrangeCountList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.furnitureArrangeCountListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addFurnitureArrangeCountList(final Uint32PairOuterClass.Uint32Pair.Builder builderForValue) {
                if (this.furnitureArrangeCountListBuilder_ == null) {
                    this.ensureFurnitureArrangeCountListIsMutable();
                    this.furnitureArrangeCountList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.furnitureArrangeCountListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addFurnitureArrangeCountList(final int index, final Uint32PairOuterClass.Uint32Pair.Builder builderForValue) {
                if (this.furnitureArrangeCountListBuilder_ == null) {
                    this.ensureFurnitureArrangeCountListIsMutable();
                    this.furnitureArrangeCountList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.furnitureArrangeCountListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllFurnitureArrangeCountList(final Iterable<? extends Uint32PairOuterClass.Uint32Pair> values) {
                if (this.furnitureArrangeCountListBuilder_ == null) {
                    this.ensureFurnitureArrangeCountListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.furnitureArrangeCountList_);
                    this.onChanged();
                }
                else {
                    this.furnitureArrangeCountListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearFurnitureArrangeCountList() {
                if (this.furnitureArrangeCountListBuilder_ == null) {
                    this.furnitureArrangeCountList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.furnitureArrangeCountListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeFurnitureArrangeCountList(final int index) {
                if (this.furnitureArrangeCountListBuilder_ == null) {
                    this.ensureFurnitureArrangeCountListIsMutable();
                    this.furnitureArrangeCountList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.furnitureArrangeCountListBuilder_.remove(index);
                }
                return this;
            }
            
            public Uint32PairOuterClass.Uint32Pair.Builder getFurnitureArrangeCountListBuilder(final int index) {
                return this.getFurnitureArrangeCountListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public Uint32PairOuterClass.Uint32PairOrBuilder getFurnitureArrangeCountListOrBuilder(final int index) {
                if (this.furnitureArrangeCountListBuilder_ == null) {
                    return this.furnitureArrangeCountList_.get(index);
                }
                return this.furnitureArrangeCountListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends Uint32PairOuterClass.Uint32PairOrBuilder> getFurnitureArrangeCountListOrBuilderList() {
                if (this.furnitureArrangeCountListBuilder_ != null) {
                    return this.furnitureArrangeCountListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends Uint32PairOuterClass.Uint32PairOrBuilder>)this.furnitureArrangeCountList_);
            }
            
            public Uint32PairOuterClass.Uint32Pair.Builder addFurnitureArrangeCountListBuilder() {
                return this.getFurnitureArrangeCountListFieldBuilder().addBuilder(Uint32PairOuterClass.Uint32Pair.getDefaultInstance());
            }
            
            public Uint32PairOuterClass.Uint32Pair.Builder addFurnitureArrangeCountListBuilder(final int index) {
                return this.getFurnitureArrangeCountListFieldBuilder().addBuilder(index, Uint32PairOuterClass.Uint32Pair.getDefaultInstance());
            }
            
            public List<Uint32PairOuterClass.Uint32Pair.Builder> getFurnitureArrangeCountListBuilderList() {
                return this.getFurnitureArrangeCountListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<Uint32PairOuterClass.Uint32Pair, Uint32PairOuterClass.Uint32Pair.Builder, Uint32PairOuterClass.Uint32PairOrBuilder> getFurnitureArrangeCountListFieldBuilder() {
                if (this.furnitureArrangeCountListBuilder_ == null) {
                    this.furnitureArrangeCountListBuilder_ = new RepeatedFieldBuilderV3<Uint32PairOuterClass.Uint32Pair, Uint32PairOuterClass.Uint32Pair.Builder, Uint32PairOuterClass.Uint32PairOrBuilder>(this.furnitureArrangeCountList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.furnitureArrangeCountList_ = null;
                }
                return this.furnitureArrangeCountListBuilder_;
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
    
    public interface FurnitureCurModuleArrangeCountNotifyOrBuilder extends MessageOrBuilder
    {
        List<Uint32PairOuterClass.Uint32Pair> getFurnitureArrangeCountListList();
        
        Uint32PairOuterClass.Uint32Pair getFurnitureArrangeCountList(final int p0);
        
        int getFurnitureArrangeCountListCount();
        
        List<? extends Uint32PairOuterClass.Uint32PairOrBuilder> getFurnitureArrangeCountListOrBuilderList();
        
        Uint32PairOuterClass.Uint32PairOrBuilder getFurnitureArrangeCountListOrBuilder(final int p0);
    }
}
