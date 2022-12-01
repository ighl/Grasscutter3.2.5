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

public final class HomeComfortInfoNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_HomeComfortInfoNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_HomeComfortInfoNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private HomeComfortInfoNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HomeComfortInfoNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bHomeComfortInfoNotify.proto\u001a\u001bHomeModuleComfortInfo.proto\"I\n\u0015HomeComfortInfoNotify\u00120\n\u0010module_info_list\u0018\u0006 \u0003(\u000b2\u0016.HomeModuleComfortInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HomeComfortInfoNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { HomeModuleComfortInfoOuterClass.getDescriptor() });
        internal_static_HomeComfortInfoNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeComfortInfoNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(HomeComfortInfoNotifyOuterClass.internal_static_HomeComfortInfoNotify_descriptor, new String[] { "ModuleInfoList" });
        HomeModuleComfortInfoOuterClass.getDescriptor();
    }
    
    public static final class HomeComfortInfoNotify extends GeneratedMessageV3 implements HomeComfortInfoNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int MODULE_INFO_LIST_FIELD_NUMBER = 6;
        private List<HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo> moduleInfoList_;
        private byte memoizedIsInitialized;
        private static final HomeComfortInfoNotify DEFAULT_INSTANCE;
        private static final Parser<HomeComfortInfoNotify> PARSER;
        
        private HomeComfortInfoNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private HomeComfortInfoNotify() {
            this.memoizedIsInitialized = -1;
            this.moduleInfoList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new HomeComfortInfoNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private HomeComfortInfoNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 50: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.moduleInfoList_ = new ArrayList<HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.moduleInfoList_.add(input.readMessage(HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo.parser(), extensionRegistry));
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
                    this.moduleInfoList_ = Collections.unmodifiableList((List<? extends HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo>)this.moduleInfoList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return HomeComfortInfoNotifyOuterClass.internal_static_HomeComfortInfoNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HomeComfortInfoNotifyOuterClass.internal_static_HomeComfortInfoNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeComfortInfoNotify.class, Builder.class);
        }
        
        @Override
        public List<HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo> getModuleInfoListList() {
            return this.moduleInfoList_;
        }
        
        @Override
        public List<? extends HomeModuleComfortInfoOuterClass.HomeModuleComfortInfoOrBuilder> getModuleInfoListOrBuilderList() {
            return this.moduleInfoList_;
        }
        
        @Override
        public int getModuleInfoListCount() {
            return this.moduleInfoList_.size();
        }
        
        @Override
        public HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo getModuleInfoList(final int index) {
            return this.moduleInfoList_.get(index);
        }
        
        @Override
        public HomeModuleComfortInfoOuterClass.HomeModuleComfortInfoOrBuilder getModuleInfoListOrBuilder(final int index) {
            return this.moduleInfoList_.get(index);
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
            for (int i = 0; i < this.moduleInfoList_.size(); ++i) {
                output.writeMessage(6, this.moduleInfoList_.get(i));
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
            for (int i = 0; i < this.moduleInfoList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(6, this.moduleInfoList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomeComfortInfoNotify)) {
                return super.equals(obj);
            }
            final HomeComfortInfoNotify other = (HomeComfortInfoNotify)obj;
            return this.getModuleInfoListList().equals(other.getModuleInfoListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getModuleInfoListCount() > 0) {
                hash = 37 * hash + 6;
                hash = 53 * hash + this.getModuleInfoListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static HomeComfortInfoNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return HomeComfortInfoNotify.PARSER.parseFrom(data);
        }
        
        public static HomeComfortInfoNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeComfortInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeComfortInfoNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return HomeComfortInfoNotify.PARSER.parseFrom(data);
        }
        
        public static HomeComfortInfoNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeComfortInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeComfortInfoNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return HomeComfortInfoNotify.PARSER.parseFrom(data);
        }
        
        public static HomeComfortInfoNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeComfortInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeComfortInfoNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeComfortInfoNotify.PARSER, input);
        }
        
        public static HomeComfortInfoNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeComfortInfoNotify.PARSER, input, extensionRegistry);
        }
        
        public static HomeComfortInfoNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeComfortInfoNotify.PARSER, input);
        }
        
        public static HomeComfortInfoNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeComfortInfoNotify.PARSER, input, extensionRegistry);
        }
        
        public static HomeComfortInfoNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeComfortInfoNotify.PARSER, input);
        }
        
        public static HomeComfortInfoNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeComfortInfoNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return HomeComfortInfoNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final HomeComfortInfoNotify prototype) {
            return HomeComfortInfoNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == HomeComfortInfoNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static HomeComfortInfoNotify getDefaultInstance() {
            return HomeComfortInfoNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<HomeComfortInfoNotify> parser() {
            return HomeComfortInfoNotify.PARSER;
        }
        
        @Override
        public Parser<HomeComfortInfoNotify> getParserForType() {
            return HomeComfortInfoNotify.PARSER;
        }
        
        @Override
        public HomeComfortInfoNotify getDefaultInstanceForType() {
            return HomeComfortInfoNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new HomeComfortInfoNotify();
            PARSER = new AbstractParser<HomeComfortInfoNotify>() {
                @Override
                public HomeComfortInfoNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new HomeComfortInfoNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HomeComfortInfoNotifyOrBuilder
        {
            private int bitField0_;
            private List<HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo> moduleInfoList_;
            private RepeatedFieldBuilderV3<HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo, HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo.Builder, HomeModuleComfortInfoOuterClass.HomeModuleComfortInfoOrBuilder> moduleInfoListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return HomeComfortInfoNotifyOuterClass.internal_static_HomeComfortInfoNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HomeComfortInfoNotifyOuterClass.internal_static_HomeComfortInfoNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeComfortInfoNotify.class, Builder.class);
            }
            
            private Builder() {
                this.moduleInfoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.moduleInfoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (HomeComfortInfoNotify.alwaysUseFieldBuilders) {
                    this.getModuleInfoListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.moduleInfoListBuilder_ == null) {
                    this.moduleInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.moduleInfoListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return HomeComfortInfoNotifyOuterClass.internal_static_HomeComfortInfoNotify_descriptor;
            }
            
            @Override
            public HomeComfortInfoNotify getDefaultInstanceForType() {
                return HomeComfortInfoNotify.getDefaultInstance();
            }
            
            @Override
            public HomeComfortInfoNotify build() {
                final HomeComfortInfoNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public HomeComfortInfoNotify buildPartial() {
                final HomeComfortInfoNotify result = new HomeComfortInfoNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.moduleInfoListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.moduleInfoList_ = Collections.unmodifiableList((List<? extends HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo>)this.moduleInfoList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.moduleInfoList_ = this.moduleInfoList_;
                }
                else {
                    result.moduleInfoList_ = this.moduleInfoListBuilder_.build();
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
                if (other instanceof HomeComfortInfoNotify) {
                    return this.mergeFrom((HomeComfortInfoNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final HomeComfortInfoNotify other) {
                if (other == HomeComfortInfoNotify.getDefaultInstance()) {
                    return this;
                }
                if (this.moduleInfoListBuilder_ == null) {
                    if (!other.moduleInfoList_.isEmpty()) {
                        if (this.moduleInfoList_.isEmpty()) {
                            this.moduleInfoList_ = other.moduleInfoList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureModuleInfoListIsMutable();
                            this.moduleInfoList_.addAll(other.moduleInfoList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.moduleInfoList_.isEmpty()) {
                    if (this.moduleInfoListBuilder_.isEmpty()) {
                        this.moduleInfoListBuilder_.dispose();
                        this.moduleInfoListBuilder_ = null;
                        this.moduleInfoList_ = other.moduleInfoList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.moduleInfoListBuilder_ = (HomeComfortInfoNotify.alwaysUseFieldBuilders ? this.getModuleInfoListFieldBuilder() : null);
                    }
                    else {
                        this.moduleInfoListBuilder_.addAllMessages(other.moduleInfoList_);
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
                HomeComfortInfoNotify parsedMessage = null;
                try {
                    parsedMessage = HomeComfortInfoNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (HomeComfortInfoNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureModuleInfoListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.moduleInfoList_ = new ArrayList<HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo>(this.moduleInfoList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo> getModuleInfoListList() {
                if (this.moduleInfoListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo>)this.moduleInfoList_);
                }
                return this.moduleInfoListBuilder_.getMessageList();
            }
            
            @Override
            public int getModuleInfoListCount() {
                if (this.moduleInfoListBuilder_ == null) {
                    return this.moduleInfoList_.size();
                }
                return this.moduleInfoListBuilder_.getCount();
            }
            
            @Override
            public HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo getModuleInfoList(final int index) {
                if (this.moduleInfoListBuilder_ == null) {
                    return this.moduleInfoList_.get(index);
                }
                return this.moduleInfoListBuilder_.getMessage(index);
            }
            
            public Builder setModuleInfoList(final int index, final HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo value) {
                if (this.moduleInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureModuleInfoListIsMutable();
                    this.moduleInfoList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.moduleInfoListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setModuleInfoList(final int index, final HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo.Builder builderForValue) {
                if (this.moduleInfoListBuilder_ == null) {
                    this.ensureModuleInfoListIsMutable();
                    this.moduleInfoList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.moduleInfoListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addModuleInfoList(final HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo value) {
                if (this.moduleInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureModuleInfoListIsMutable();
                    this.moduleInfoList_.add(value);
                    this.onChanged();
                }
                else {
                    this.moduleInfoListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addModuleInfoList(final int index, final HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo value) {
                if (this.moduleInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureModuleInfoListIsMutable();
                    this.moduleInfoList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.moduleInfoListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addModuleInfoList(final HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo.Builder builderForValue) {
                if (this.moduleInfoListBuilder_ == null) {
                    this.ensureModuleInfoListIsMutable();
                    this.moduleInfoList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.moduleInfoListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addModuleInfoList(final int index, final HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo.Builder builderForValue) {
                if (this.moduleInfoListBuilder_ == null) {
                    this.ensureModuleInfoListIsMutable();
                    this.moduleInfoList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.moduleInfoListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllModuleInfoList(final Iterable<? extends HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo> values) {
                if (this.moduleInfoListBuilder_ == null) {
                    this.ensureModuleInfoListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.moduleInfoList_);
                    this.onChanged();
                }
                else {
                    this.moduleInfoListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearModuleInfoList() {
                if (this.moduleInfoListBuilder_ == null) {
                    this.moduleInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.moduleInfoListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeModuleInfoList(final int index) {
                if (this.moduleInfoListBuilder_ == null) {
                    this.ensureModuleInfoListIsMutable();
                    this.moduleInfoList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.moduleInfoListBuilder_.remove(index);
                }
                return this;
            }
            
            public HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo.Builder getModuleInfoListBuilder(final int index) {
                return this.getModuleInfoListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public HomeModuleComfortInfoOuterClass.HomeModuleComfortInfoOrBuilder getModuleInfoListOrBuilder(final int index) {
                if (this.moduleInfoListBuilder_ == null) {
                    return this.moduleInfoList_.get(index);
                }
                return this.moduleInfoListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends HomeModuleComfortInfoOuterClass.HomeModuleComfortInfoOrBuilder> getModuleInfoListOrBuilderList() {
                if (this.moduleInfoListBuilder_ != null) {
                    return this.moduleInfoListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends HomeModuleComfortInfoOuterClass.HomeModuleComfortInfoOrBuilder>)this.moduleInfoList_);
            }
            
            public HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo.Builder addModuleInfoListBuilder() {
                return this.getModuleInfoListFieldBuilder().addBuilder(HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo.getDefaultInstance());
            }
            
            public HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo.Builder addModuleInfoListBuilder(final int index) {
                return this.getModuleInfoListFieldBuilder().addBuilder(index, HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo.getDefaultInstance());
            }
            
            public List<HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo.Builder> getModuleInfoListBuilderList() {
                return this.getModuleInfoListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo, HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo.Builder, HomeModuleComfortInfoOuterClass.HomeModuleComfortInfoOrBuilder> getModuleInfoListFieldBuilder() {
                if (this.moduleInfoListBuilder_ == null) {
                    this.moduleInfoListBuilder_ = new RepeatedFieldBuilderV3<HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo, HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo.Builder, HomeModuleComfortInfoOuterClass.HomeModuleComfortInfoOrBuilder>(this.moduleInfoList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.moduleInfoList_ = null;
                }
                return this.moduleInfoListBuilder_;
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
    
    public interface HomeComfortInfoNotifyOrBuilder extends MessageOrBuilder
    {
        List<HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo> getModuleInfoListList();
        
        HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo getModuleInfoList(final int p0);
        
        int getModuleInfoListCount();
        
        List<? extends HomeModuleComfortInfoOuterClass.HomeModuleComfortInfoOrBuilder> getModuleInfoListOrBuilderList();
        
        HomeModuleComfortInfoOuterClass.HomeModuleComfortInfoOrBuilder getModuleInfoListOrBuilder(final int p0);
    }
}
