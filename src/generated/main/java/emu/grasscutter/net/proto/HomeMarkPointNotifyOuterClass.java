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

public final class HomeMarkPointNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_HomeMarkPointNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_HomeMarkPointNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private HomeMarkPointNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HomeMarkPointNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019HomeMarkPointNotify.proto\u001a\u001cHomeMarkPointSceneData.proto\"L\n\u0013HomeMarkPointNotify\u00125\n\u0014mark_point_data_list\u0018\f \u0003(\u000b2\u0017.HomeMarkPointSceneDataB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HomeMarkPointNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { HomeMarkPointSceneDataOuterClass.getDescriptor() });
        internal_static_HomeMarkPointNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeMarkPointNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(HomeMarkPointNotifyOuterClass.internal_static_HomeMarkPointNotify_descriptor, new String[] { "MarkPointDataList" });
        HomeMarkPointSceneDataOuterClass.getDescriptor();
    }
    
    public static final class HomeMarkPointNotify extends GeneratedMessageV3 implements HomeMarkPointNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int MARK_POINT_DATA_LIST_FIELD_NUMBER = 12;
        private List<HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData> markPointDataList_;
        private byte memoizedIsInitialized;
        private static final HomeMarkPointNotify DEFAULT_INSTANCE;
        private static final Parser<HomeMarkPointNotify> PARSER;
        
        private HomeMarkPointNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private HomeMarkPointNotify() {
            this.memoizedIsInitialized = -1;
            this.markPointDataList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new HomeMarkPointNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private HomeMarkPointNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 98: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.markPointDataList_ = new ArrayList<HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.markPointDataList_.add(input.readMessage(HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData.parser(), extensionRegistry));
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
                    this.markPointDataList_ = Collections.unmodifiableList((List<? extends HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData>)this.markPointDataList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return HomeMarkPointNotifyOuterClass.internal_static_HomeMarkPointNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HomeMarkPointNotifyOuterClass.internal_static_HomeMarkPointNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeMarkPointNotify.class, Builder.class);
        }
        
        @Override
        public List<HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData> getMarkPointDataListList() {
            return this.markPointDataList_;
        }
        
        @Override
        public List<? extends HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneDataOrBuilder> getMarkPointDataListOrBuilderList() {
            return this.markPointDataList_;
        }
        
        @Override
        public int getMarkPointDataListCount() {
            return this.markPointDataList_.size();
        }
        
        @Override
        public HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData getMarkPointDataList(final int index) {
            return this.markPointDataList_.get(index);
        }
        
        @Override
        public HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneDataOrBuilder getMarkPointDataListOrBuilder(final int index) {
            return this.markPointDataList_.get(index);
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
            for (int i = 0; i < this.markPointDataList_.size(); ++i) {
                output.writeMessage(12, this.markPointDataList_.get(i));
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
            for (int i = 0; i < this.markPointDataList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(12, this.markPointDataList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomeMarkPointNotify)) {
                return super.equals(obj);
            }
            final HomeMarkPointNotify other = (HomeMarkPointNotify)obj;
            return this.getMarkPointDataListList().equals(other.getMarkPointDataListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getMarkPointDataListCount() > 0) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getMarkPointDataListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static HomeMarkPointNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return HomeMarkPointNotify.PARSER.parseFrom(data);
        }
        
        public static HomeMarkPointNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeMarkPointNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeMarkPointNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return HomeMarkPointNotify.PARSER.parseFrom(data);
        }
        
        public static HomeMarkPointNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeMarkPointNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeMarkPointNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return HomeMarkPointNotify.PARSER.parseFrom(data);
        }
        
        public static HomeMarkPointNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeMarkPointNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeMarkPointNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeMarkPointNotify.PARSER, input);
        }
        
        public static HomeMarkPointNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeMarkPointNotify.PARSER, input, extensionRegistry);
        }
        
        public static HomeMarkPointNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeMarkPointNotify.PARSER, input);
        }
        
        public static HomeMarkPointNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeMarkPointNotify.PARSER, input, extensionRegistry);
        }
        
        public static HomeMarkPointNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeMarkPointNotify.PARSER, input);
        }
        
        public static HomeMarkPointNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeMarkPointNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return HomeMarkPointNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final HomeMarkPointNotify prototype) {
            return HomeMarkPointNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == HomeMarkPointNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static HomeMarkPointNotify getDefaultInstance() {
            return HomeMarkPointNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<HomeMarkPointNotify> parser() {
            return HomeMarkPointNotify.PARSER;
        }
        
        @Override
        public Parser<HomeMarkPointNotify> getParserForType() {
            return HomeMarkPointNotify.PARSER;
        }
        
        @Override
        public HomeMarkPointNotify getDefaultInstanceForType() {
            return HomeMarkPointNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new HomeMarkPointNotify();
            PARSER = new AbstractParser<HomeMarkPointNotify>() {
                @Override
                public HomeMarkPointNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new HomeMarkPointNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HomeMarkPointNotifyOrBuilder
        {
            private int bitField0_;
            private List<HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData> markPointDataList_;
            private RepeatedFieldBuilderV3<HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData, HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData.Builder, HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneDataOrBuilder> markPointDataListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return HomeMarkPointNotifyOuterClass.internal_static_HomeMarkPointNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HomeMarkPointNotifyOuterClass.internal_static_HomeMarkPointNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeMarkPointNotify.class, Builder.class);
            }
            
            private Builder() {
                this.markPointDataList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.markPointDataList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (HomeMarkPointNotify.alwaysUseFieldBuilders) {
                    this.getMarkPointDataListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.markPointDataListBuilder_ == null) {
                    this.markPointDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.markPointDataListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return HomeMarkPointNotifyOuterClass.internal_static_HomeMarkPointNotify_descriptor;
            }
            
            @Override
            public HomeMarkPointNotify getDefaultInstanceForType() {
                return HomeMarkPointNotify.getDefaultInstance();
            }
            
            @Override
            public HomeMarkPointNotify build() {
                final HomeMarkPointNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public HomeMarkPointNotify buildPartial() {
                final HomeMarkPointNotify result = new HomeMarkPointNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.markPointDataListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.markPointDataList_ = Collections.unmodifiableList((List<? extends HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData>)this.markPointDataList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.markPointDataList_ = this.markPointDataList_;
                }
                else {
                    result.markPointDataList_ = this.markPointDataListBuilder_.build();
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
                if (other instanceof HomeMarkPointNotify) {
                    return this.mergeFrom((HomeMarkPointNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final HomeMarkPointNotify other) {
                if (other == HomeMarkPointNotify.getDefaultInstance()) {
                    return this;
                }
                if (this.markPointDataListBuilder_ == null) {
                    if (!other.markPointDataList_.isEmpty()) {
                        if (this.markPointDataList_.isEmpty()) {
                            this.markPointDataList_ = other.markPointDataList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureMarkPointDataListIsMutable();
                            this.markPointDataList_.addAll(other.markPointDataList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.markPointDataList_.isEmpty()) {
                    if (this.markPointDataListBuilder_.isEmpty()) {
                        this.markPointDataListBuilder_.dispose();
                        this.markPointDataListBuilder_ = null;
                        this.markPointDataList_ = other.markPointDataList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.markPointDataListBuilder_ = (HomeMarkPointNotify.alwaysUseFieldBuilders ? this.getMarkPointDataListFieldBuilder() : null);
                    }
                    else {
                        this.markPointDataListBuilder_.addAllMessages(other.markPointDataList_);
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
                HomeMarkPointNotify parsedMessage = null;
                try {
                    parsedMessage = HomeMarkPointNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (HomeMarkPointNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureMarkPointDataListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.markPointDataList_ = new ArrayList<HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData>(this.markPointDataList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData> getMarkPointDataListList() {
                if (this.markPointDataListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData>)this.markPointDataList_);
                }
                return this.markPointDataListBuilder_.getMessageList();
            }
            
            @Override
            public int getMarkPointDataListCount() {
                if (this.markPointDataListBuilder_ == null) {
                    return this.markPointDataList_.size();
                }
                return this.markPointDataListBuilder_.getCount();
            }
            
            @Override
            public HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData getMarkPointDataList(final int index) {
                if (this.markPointDataListBuilder_ == null) {
                    return this.markPointDataList_.get(index);
                }
                return this.markPointDataListBuilder_.getMessage(index);
            }
            
            public Builder setMarkPointDataList(final int index, final HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData value) {
                if (this.markPointDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMarkPointDataListIsMutable();
                    this.markPointDataList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.markPointDataListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setMarkPointDataList(final int index, final HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData.Builder builderForValue) {
                if (this.markPointDataListBuilder_ == null) {
                    this.ensureMarkPointDataListIsMutable();
                    this.markPointDataList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.markPointDataListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addMarkPointDataList(final HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData value) {
                if (this.markPointDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMarkPointDataListIsMutable();
                    this.markPointDataList_.add(value);
                    this.onChanged();
                }
                else {
                    this.markPointDataListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addMarkPointDataList(final int index, final HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData value) {
                if (this.markPointDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMarkPointDataListIsMutable();
                    this.markPointDataList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.markPointDataListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addMarkPointDataList(final HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData.Builder builderForValue) {
                if (this.markPointDataListBuilder_ == null) {
                    this.ensureMarkPointDataListIsMutable();
                    this.markPointDataList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.markPointDataListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addMarkPointDataList(final int index, final HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData.Builder builderForValue) {
                if (this.markPointDataListBuilder_ == null) {
                    this.ensureMarkPointDataListIsMutable();
                    this.markPointDataList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.markPointDataListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllMarkPointDataList(final Iterable<? extends HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData> values) {
                if (this.markPointDataListBuilder_ == null) {
                    this.ensureMarkPointDataListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.markPointDataList_);
                    this.onChanged();
                }
                else {
                    this.markPointDataListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearMarkPointDataList() {
                if (this.markPointDataListBuilder_ == null) {
                    this.markPointDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.markPointDataListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeMarkPointDataList(final int index) {
                if (this.markPointDataListBuilder_ == null) {
                    this.ensureMarkPointDataListIsMutable();
                    this.markPointDataList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.markPointDataListBuilder_.remove(index);
                }
                return this;
            }
            
            public HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData.Builder getMarkPointDataListBuilder(final int index) {
                return this.getMarkPointDataListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneDataOrBuilder getMarkPointDataListOrBuilder(final int index) {
                if (this.markPointDataListBuilder_ == null) {
                    return this.markPointDataList_.get(index);
                }
                return this.markPointDataListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneDataOrBuilder> getMarkPointDataListOrBuilderList() {
                if (this.markPointDataListBuilder_ != null) {
                    return this.markPointDataListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneDataOrBuilder>)this.markPointDataList_);
            }
            
            public HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData.Builder addMarkPointDataListBuilder() {
                return this.getMarkPointDataListFieldBuilder().addBuilder(HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData.getDefaultInstance());
            }
            
            public HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData.Builder addMarkPointDataListBuilder(final int index) {
                return this.getMarkPointDataListFieldBuilder().addBuilder(index, HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData.getDefaultInstance());
            }
            
            public List<HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData.Builder> getMarkPointDataListBuilderList() {
                return this.getMarkPointDataListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData, HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData.Builder, HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneDataOrBuilder> getMarkPointDataListFieldBuilder() {
                if (this.markPointDataListBuilder_ == null) {
                    this.markPointDataListBuilder_ = new RepeatedFieldBuilderV3<HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData, HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData.Builder, HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneDataOrBuilder>(this.markPointDataList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.markPointDataList_ = null;
                }
                return this.markPointDataListBuilder_;
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
    
    public interface HomeMarkPointNotifyOrBuilder extends MessageOrBuilder
    {
        List<HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData> getMarkPointDataListList();
        
        HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneData getMarkPointDataList(final int p0);
        
        int getMarkPointDataListCount();
        
        List<? extends HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneDataOrBuilder> getMarkPointDataListOrBuilderList();
        
        HomeMarkPointSceneDataOuterClass.HomeMarkPointSceneDataOrBuilder getMarkPointDataListOrBuilder(final int p0);
    }
}
