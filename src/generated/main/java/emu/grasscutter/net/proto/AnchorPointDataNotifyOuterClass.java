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

public final class AnchorPointDataNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_AnchorPointDataNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AnchorPointDataNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AnchorPointDataNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AnchorPointDataNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bAnchorPointDataNotify.proto\u001a\u0015AnchorPointData.proto\"^\n\u0015AnchorPointDataNotify\u0012+\n\u0011anchor_point_list\u0018\n \u0003(\u000b2\u0010.AnchorPointData\u0012\u0018\n\u0010next_usable_time\u0018\u000e \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AnchorPointDataNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AnchorPointDataOuterClass.getDescriptor() });
        internal_static_AnchorPointDataNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AnchorPointDataNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AnchorPointDataNotifyOuterClass.internal_static_AnchorPointDataNotify_descriptor, new String[] { "AnchorPointList", "NextUsableTime" });
        AnchorPointDataOuterClass.getDescriptor();
    }
    
    public static final class AnchorPointDataNotify extends GeneratedMessageV3 implements AnchorPointDataNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ANCHOR_POINT_LIST_FIELD_NUMBER = 10;
        private List<AnchorPointDataOuterClass.AnchorPointData> anchorPointList_;
        public static final int NEXT_USABLE_TIME_FIELD_NUMBER = 14;
        private int nextUsableTime_;
        private byte memoizedIsInitialized;
        private static final AnchorPointDataNotify DEFAULT_INSTANCE;
        private static final Parser<AnchorPointDataNotify> PARSER;
        
        private AnchorPointDataNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AnchorPointDataNotify() {
            this.memoizedIsInitialized = -1;
            this.anchorPointList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AnchorPointDataNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AnchorPointDataNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 82: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.anchorPointList_ = new ArrayList<AnchorPointDataOuterClass.AnchorPointData>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.anchorPointList_.add(input.readMessage(AnchorPointDataOuterClass.AnchorPointData.parser(), extensionRegistry));
                            continue;
                        }
                        case 112: {
                            this.nextUsableTime_ = input.readUInt32();
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
                    this.anchorPointList_ = Collections.unmodifiableList((List<? extends AnchorPointDataOuterClass.AnchorPointData>)this.anchorPointList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return AnchorPointDataNotifyOuterClass.internal_static_AnchorPointDataNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AnchorPointDataNotifyOuterClass.internal_static_AnchorPointDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(AnchorPointDataNotify.class, Builder.class);
        }
        
        @Override
        public List<AnchorPointDataOuterClass.AnchorPointData> getAnchorPointListList() {
            return this.anchorPointList_;
        }
        
        @Override
        public List<? extends AnchorPointDataOuterClass.AnchorPointDataOrBuilder> getAnchorPointListOrBuilderList() {
            return this.anchorPointList_;
        }
        
        @Override
        public int getAnchorPointListCount() {
            return this.anchorPointList_.size();
        }
        
        @Override
        public AnchorPointDataOuterClass.AnchorPointData getAnchorPointList(final int index) {
            return this.anchorPointList_.get(index);
        }
        
        @Override
        public AnchorPointDataOuterClass.AnchorPointDataOrBuilder getAnchorPointListOrBuilder(final int index) {
            return this.anchorPointList_.get(index);
        }
        
        @Override
        public int getNextUsableTime() {
            return this.nextUsableTime_;
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
            for (int i = 0; i < this.anchorPointList_.size(); ++i) {
                output.writeMessage(10, this.anchorPointList_.get(i));
            }
            if (this.nextUsableTime_ != 0) {
                output.writeUInt32(14, this.nextUsableTime_);
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
            for (int i = 0; i < this.anchorPointList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(10, this.anchorPointList_.get(i));
            }
            if (this.nextUsableTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.nextUsableTime_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AnchorPointDataNotify)) {
                return super.equals(obj);
            }
            final AnchorPointDataNotify other = (AnchorPointDataNotify)obj;
            return this.getAnchorPointListList().equals(other.getAnchorPointListList()) && this.getNextUsableTime() == other.getNextUsableTime() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getAnchorPointListCount() > 0) {
                hash = 37 * hash + 10;
                hash = 53 * hash + this.getAnchorPointListList().hashCode();
            }
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getNextUsableTime();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AnchorPointDataNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AnchorPointDataNotify.PARSER.parseFrom(data);
        }
        
        public static AnchorPointDataNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AnchorPointDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AnchorPointDataNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AnchorPointDataNotify.PARSER.parseFrom(data);
        }
        
        public static AnchorPointDataNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AnchorPointDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AnchorPointDataNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AnchorPointDataNotify.PARSER.parseFrom(data);
        }
        
        public static AnchorPointDataNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AnchorPointDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AnchorPointDataNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AnchorPointDataNotify.PARSER, input);
        }
        
        public static AnchorPointDataNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AnchorPointDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static AnchorPointDataNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AnchorPointDataNotify.PARSER, input);
        }
        
        public static AnchorPointDataNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AnchorPointDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static AnchorPointDataNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AnchorPointDataNotify.PARSER, input);
        }
        
        public static AnchorPointDataNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AnchorPointDataNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AnchorPointDataNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AnchorPointDataNotify prototype) {
            return AnchorPointDataNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AnchorPointDataNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AnchorPointDataNotify getDefaultInstance() {
            return AnchorPointDataNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<AnchorPointDataNotify> parser() {
            return AnchorPointDataNotify.PARSER;
        }
        
        @Override
        public Parser<AnchorPointDataNotify> getParserForType() {
            return AnchorPointDataNotify.PARSER;
        }
        
        @Override
        public AnchorPointDataNotify getDefaultInstanceForType() {
            return AnchorPointDataNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AnchorPointDataNotify();
            PARSER = new AbstractParser<AnchorPointDataNotify>() {
                @Override
                public AnchorPointDataNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AnchorPointDataNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AnchorPointDataNotifyOrBuilder
        {
            private int bitField0_;
            private List<AnchorPointDataOuterClass.AnchorPointData> anchorPointList_;
            private RepeatedFieldBuilderV3<AnchorPointDataOuterClass.AnchorPointData, AnchorPointDataOuterClass.AnchorPointData.Builder, AnchorPointDataOuterClass.AnchorPointDataOrBuilder> anchorPointListBuilder_;
            private int nextUsableTime_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AnchorPointDataNotifyOuterClass.internal_static_AnchorPointDataNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AnchorPointDataNotifyOuterClass.internal_static_AnchorPointDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(AnchorPointDataNotify.class, Builder.class);
            }
            
            private Builder() {
                this.anchorPointList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.anchorPointList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AnchorPointDataNotify.alwaysUseFieldBuilders) {
                    this.getAnchorPointListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.anchorPointListBuilder_ == null) {
                    this.anchorPointList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.anchorPointListBuilder_.clear();
                }
                this.nextUsableTime_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AnchorPointDataNotifyOuterClass.internal_static_AnchorPointDataNotify_descriptor;
            }
            
            @Override
            public AnchorPointDataNotify getDefaultInstanceForType() {
                return AnchorPointDataNotify.getDefaultInstance();
            }
            
            @Override
            public AnchorPointDataNotify build() {
                final AnchorPointDataNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AnchorPointDataNotify buildPartial() {
                final AnchorPointDataNotify result = new AnchorPointDataNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.anchorPointListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.anchorPointList_ = Collections.unmodifiableList((List<? extends AnchorPointDataOuterClass.AnchorPointData>)this.anchorPointList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.anchorPointList_ = this.anchorPointList_;
                }
                else {
                    result.anchorPointList_ = this.anchorPointListBuilder_.build();
                }
                result.nextUsableTime_ = this.nextUsableTime_;
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
                if (other instanceof AnchorPointDataNotify) {
                    return this.mergeFrom((AnchorPointDataNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AnchorPointDataNotify other) {
                if (other == AnchorPointDataNotify.getDefaultInstance()) {
                    return this;
                }
                if (this.anchorPointListBuilder_ == null) {
                    if (!other.anchorPointList_.isEmpty()) {
                        if (this.anchorPointList_.isEmpty()) {
                            this.anchorPointList_ = other.anchorPointList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureAnchorPointListIsMutable();
                            this.anchorPointList_.addAll(other.anchorPointList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.anchorPointList_.isEmpty()) {
                    if (this.anchorPointListBuilder_.isEmpty()) {
                        this.anchorPointListBuilder_.dispose();
                        this.anchorPointListBuilder_ = null;
                        this.anchorPointList_ = other.anchorPointList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.anchorPointListBuilder_ = (AnchorPointDataNotify.alwaysUseFieldBuilders ? this.getAnchorPointListFieldBuilder() : null);
                    }
                    else {
                        this.anchorPointListBuilder_.addAllMessages(other.anchorPointList_);
                    }
                }
                if (other.getNextUsableTime() != 0) {
                    this.setNextUsableTime(other.getNextUsableTime());
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
                AnchorPointDataNotify parsedMessage = null;
                try {
                    parsedMessage = AnchorPointDataNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AnchorPointDataNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureAnchorPointListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.anchorPointList_ = new ArrayList<AnchorPointDataOuterClass.AnchorPointData>(this.anchorPointList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<AnchorPointDataOuterClass.AnchorPointData> getAnchorPointListList() {
                if (this.anchorPointListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends AnchorPointDataOuterClass.AnchorPointData>)this.anchorPointList_);
                }
                return this.anchorPointListBuilder_.getMessageList();
            }
            
            @Override
            public int getAnchorPointListCount() {
                if (this.anchorPointListBuilder_ == null) {
                    return this.anchorPointList_.size();
                }
                return this.anchorPointListBuilder_.getCount();
            }
            
            @Override
            public AnchorPointDataOuterClass.AnchorPointData getAnchorPointList(final int index) {
                if (this.anchorPointListBuilder_ == null) {
                    return this.anchorPointList_.get(index);
                }
                return this.anchorPointListBuilder_.getMessage(index);
            }
            
            public Builder setAnchorPointList(final int index, final AnchorPointDataOuterClass.AnchorPointData value) {
                if (this.anchorPointListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureAnchorPointListIsMutable();
                    this.anchorPointList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.anchorPointListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setAnchorPointList(final int index, final AnchorPointDataOuterClass.AnchorPointData.Builder builderForValue) {
                if (this.anchorPointListBuilder_ == null) {
                    this.ensureAnchorPointListIsMutable();
                    this.anchorPointList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.anchorPointListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAnchorPointList(final AnchorPointDataOuterClass.AnchorPointData value) {
                if (this.anchorPointListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureAnchorPointListIsMutable();
                    this.anchorPointList_.add(value);
                    this.onChanged();
                }
                else {
                    this.anchorPointListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addAnchorPointList(final int index, final AnchorPointDataOuterClass.AnchorPointData value) {
                if (this.anchorPointListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureAnchorPointListIsMutable();
                    this.anchorPointList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.anchorPointListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addAnchorPointList(final AnchorPointDataOuterClass.AnchorPointData.Builder builderForValue) {
                if (this.anchorPointListBuilder_ == null) {
                    this.ensureAnchorPointListIsMutable();
                    this.anchorPointList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.anchorPointListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addAnchorPointList(final int index, final AnchorPointDataOuterClass.AnchorPointData.Builder builderForValue) {
                if (this.anchorPointListBuilder_ == null) {
                    this.ensureAnchorPointListIsMutable();
                    this.anchorPointList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.anchorPointListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllAnchorPointList(final Iterable<? extends AnchorPointDataOuterClass.AnchorPointData> values) {
                if (this.anchorPointListBuilder_ == null) {
                    this.ensureAnchorPointListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.anchorPointList_);
                    this.onChanged();
                }
                else {
                    this.anchorPointListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearAnchorPointList() {
                if (this.anchorPointListBuilder_ == null) {
                    this.anchorPointList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.anchorPointListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeAnchorPointList(final int index) {
                if (this.anchorPointListBuilder_ == null) {
                    this.ensureAnchorPointListIsMutable();
                    this.anchorPointList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.anchorPointListBuilder_.remove(index);
                }
                return this;
            }
            
            public AnchorPointDataOuterClass.AnchorPointData.Builder getAnchorPointListBuilder(final int index) {
                return this.getAnchorPointListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public AnchorPointDataOuterClass.AnchorPointDataOrBuilder getAnchorPointListOrBuilder(final int index) {
                if (this.anchorPointListBuilder_ == null) {
                    return this.anchorPointList_.get(index);
                }
                return this.anchorPointListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends AnchorPointDataOuterClass.AnchorPointDataOrBuilder> getAnchorPointListOrBuilderList() {
                if (this.anchorPointListBuilder_ != null) {
                    return this.anchorPointListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends AnchorPointDataOuterClass.AnchorPointDataOrBuilder>)this.anchorPointList_);
            }
            
            public AnchorPointDataOuterClass.AnchorPointData.Builder addAnchorPointListBuilder() {
                return this.getAnchorPointListFieldBuilder().addBuilder(AnchorPointDataOuterClass.AnchorPointData.getDefaultInstance());
            }
            
            public AnchorPointDataOuterClass.AnchorPointData.Builder addAnchorPointListBuilder(final int index) {
                return this.getAnchorPointListFieldBuilder().addBuilder(index, AnchorPointDataOuterClass.AnchorPointData.getDefaultInstance());
            }
            
            public List<AnchorPointDataOuterClass.AnchorPointData.Builder> getAnchorPointListBuilderList() {
                return this.getAnchorPointListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<AnchorPointDataOuterClass.AnchorPointData, AnchorPointDataOuterClass.AnchorPointData.Builder, AnchorPointDataOuterClass.AnchorPointDataOrBuilder> getAnchorPointListFieldBuilder() {
                if (this.anchorPointListBuilder_ == null) {
                    this.anchorPointListBuilder_ = new RepeatedFieldBuilderV3<AnchorPointDataOuterClass.AnchorPointData, AnchorPointDataOuterClass.AnchorPointData.Builder, AnchorPointDataOuterClass.AnchorPointDataOrBuilder>(this.anchorPointList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.anchorPointList_ = null;
                }
                return this.anchorPointListBuilder_;
            }
            
            @Override
            public int getNextUsableTime() {
                return this.nextUsableTime_;
            }
            
            public Builder setNextUsableTime(final int value) {
                this.nextUsableTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearNextUsableTime() {
                this.nextUsableTime_ = 0;
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
    
    public interface AnchorPointDataNotifyOrBuilder extends MessageOrBuilder
    {
        List<AnchorPointDataOuterClass.AnchorPointData> getAnchorPointListList();
        
        AnchorPointDataOuterClass.AnchorPointData getAnchorPointList(final int p0);
        
        int getAnchorPointListCount();
        
        List<? extends AnchorPointDataOuterClass.AnchorPointDataOrBuilder> getAnchorPointListOrBuilderList();
        
        AnchorPointDataOuterClass.AnchorPointDataOrBuilder getAnchorPointListOrBuilder(final int p0);
        
        int getNextUsableTime();
    }
}
