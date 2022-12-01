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

public final class HomeBasicInfoNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_HomeBasicInfoNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_HomeBasicInfoNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private HomeBasicInfoNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HomeBasicInfoNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019HomeBasicInfoNotify.proto\u001a\u0013HomeBasicInfo.proto\"9\n\u0013HomeBasicInfoNotify\u0012\"\n\nbasic_info\u0018\u000f \u0001(\u000b2\u000e.HomeBasicInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HomeBasicInfoNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { HomeBasicInfoOuterClass.getDescriptor() });
        internal_static_HomeBasicInfoNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeBasicInfoNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(HomeBasicInfoNotifyOuterClass.internal_static_HomeBasicInfoNotify_descriptor, new String[] { "BasicInfo" });
        HomeBasicInfoOuterClass.getDescriptor();
    }
    
    public static final class HomeBasicInfoNotify extends GeneratedMessageV3 implements HomeBasicInfoNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int BASIC_INFO_FIELD_NUMBER = 15;
        private HomeBasicInfoOuterClass.HomeBasicInfo basicInfo_;
        private byte memoizedIsInitialized;
        private static final HomeBasicInfoNotify DEFAULT_INSTANCE;
        private static final Parser<HomeBasicInfoNotify> PARSER;
        
        private HomeBasicInfoNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private HomeBasicInfoNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new HomeBasicInfoNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private HomeBasicInfoNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 122: {
                            HomeBasicInfoOuterClass.HomeBasicInfo.Builder subBuilder = null;
                            if (this.basicInfo_ != null) {
                                subBuilder = this.basicInfo_.toBuilder();
                            }
                            this.basicInfo_ = input.readMessage(HomeBasicInfoOuterClass.HomeBasicInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.basicInfo_);
                                this.basicInfo_ = subBuilder.buildPartial();
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
            return HomeBasicInfoNotifyOuterClass.internal_static_HomeBasicInfoNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HomeBasicInfoNotifyOuterClass.internal_static_HomeBasicInfoNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeBasicInfoNotify.class, Builder.class);
        }
        
        @Override
        public boolean hasBasicInfo() {
            return this.basicInfo_ != null;
        }
        
        @Override
        public HomeBasicInfoOuterClass.HomeBasicInfo getBasicInfo() {
            return (this.basicInfo_ == null) ? HomeBasicInfoOuterClass.HomeBasicInfo.getDefaultInstance() : this.basicInfo_;
        }
        
        @Override
        public HomeBasicInfoOuterClass.HomeBasicInfoOrBuilder getBasicInfoOrBuilder() {
            return this.getBasicInfo();
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
            if (this.basicInfo_ != null) {
                output.writeMessage(15, this.getBasicInfo());
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
            if (this.basicInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(15, this.getBasicInfo());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomeBasicInfoNotify)) {
                return super.equals(obj);
            }
            final HomeBasicInfoNotify other = (HomeBasicInfoNotify)obj;
            return this.hasBasicInfo() == other.hasBasicInfo() && (!this.hasBasicInfo() || this.getBasicInfo().equals(other.getBasicInfo())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasBasicInfo()) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getBasicInfo().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static HomeBasicInfoNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return HomeBasicInfoNotify.PARSER.parseFrom(data);
        }
        
        public static HomeBasicInfoNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeBasicInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeBasicInfoNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return HomeBasicInfoNotify.PARSER.parseFrom(data);
        }
        
        public static HomeBasicInfoNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeBasicInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeBasicInfoNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return HomeBasicInfoNotify.PARSER.parseFrom(data);
        }
        
        public static HomeBasicInfoNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeBasicInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeBasicInfoNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeBasicInfoNotify.PARSER, input);
        }
        
        public static HomeBasicInfoNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeBasicInfoNotify.PARSER, input, extensionRegistry);
        }
        
        public static HomeBasicInfoNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeBasicInfoNotify.PARSER, input);
        }
        
        public static HomeBasicInfoNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeBasicInfoNotify.PARSER, input, extensionRegistry);
        }
        
        public static HomeBasicInfoNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeBasicInfoNotify.PARSER, input);
        }
        
        public static HomeBasicInfoNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeBasicInfoNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return HomeBasicInfoNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final HomeBasicInfoNotify prototype) {
            return HomeBasicInfoNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == HomeBasicInfoNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static HomeBasicInfoNotify getDefaultInstance() {
            return HomeBasicInfoNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<HomeBasicInfoNotify> parser() {
            return HomeBasicInfoNotify.PARSER;
        }
        
        @Override
        public Parser<HomeBasicInfoNotify> getParserForType() {
            return HomeBasicInfoNotify.PARSER;
        }
        
        @Override
        public HomeBasicInfoNotify getDefaultInstanceForType() {
            return HomeBasicInfoNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new HomeBasicInfoNotify();
            PARSER = new AbstractParser<HomeBasicInfoNotify>() {
                @Override
                public HomeBasicInfoNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new HomeBasicInfoNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HomeBasicInfoNotifyOrBuilder
        {
            private HomeBasicInfoOuterClass.HomeBasicInfo basicInfo_;
            private SingleFieldBuilderV3<HomeBasicInfoOuterClass.HomeBasicInfo, HomeBasicInfoOuterClass.HomeBasicInfo.Builder, HomeBasicInfoOuterClass.HomeBasicInfoOrBuilder> basicInfoBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return HomeBasicInfoNotifyOuterClass.internal_static_HomeBasicInfoNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HomeBasicInfoNotifyOuterClass.internal_static_HomeBasicInfoNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeBasicInfoNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (HomeBasicInfoNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.basicInfoBuilder_ == null) {
                    this.basicInfo_ = null;
                }
                else {
                    this.basicInfo_ = null;
                    this.basicInfoBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return HomeBasicInfoNotifyOuterClass.internal_static_HomeBasicInfoNotify_descriptor;
            }
            
            @Override
            public HomeBasicInfoNotify getDefaultInstanceForType() {
                return HomeBasicInfoNotify.getDefaultInstance();
            }
            
            @Override
            public HomeBasicInfoNotify build() {
                final HomeBasicInfoNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public HomeBasicInfoNotify buildPartial() {
                final HomeBasicInfoNotify result = new HomeBasicInfoNotify(this);
                if (this.basicInfoBuilder_ == null) {
                    result.basicInfo_ = this.basicInfo_;
                }
                else {
                    result.basicInfo_ = this.basicInfoBuilder_.build();
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
                if (other instanceof HomeBasicInfoNotify) {
                    return this.mergeFrom((HomeBasicInfoNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final HomeBasicInfoNotify other) {
                if (other == HomeBasicInfoNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.hasBasicInfo()) {
                    this.mergeBasicInfo(other.getBasicInfo());
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
                HomeBasicInfoNotify parsedMessage = null;
                try {
                    parsedMessage = HomeBasicInfoNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (HomeBasicInfoNotify)e.getUnfinishedMessage();
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
            public boolean hasBasicInfo() {
                return this.basicInfoBuilder_ != null || this.basicInfo_ != null;
            }
            
            @Override
            public HomeBasicInfoOuterClass.HomeBasicInfo getBasicInfo() {
                if (this.basicInfoBuilder_ == null) {
                    return (this.basicInfo_ == null) ? HomeBasicInfoOuterClass.HomeBasicInfo.getDefaultInstance() : this.basicInfo_;
                }
                return this.basicInfoBuilder_.getMessage();
            }
            
            public Builder setBasicInfo(final HomeBasicInfoOuterClass.HomeBasicInfo value) {
                if (this.basicInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.basicInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.basicInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setBasicInfo(final HomeBasicInfoOuterClass.HomeBasicInfo.Builder builderForValue) {
                if (this.basicInfoBuilder_ == null) {
                    this.basicInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.basicInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeBasicInfo(final HomeBasicInfoOuterClass.HomeBasicInfo value) {
                if (this.basicInfoBuilder_ == null) {
                    if (this.basicInfo_ != null) {
                        this.basicInfo_ = HomeBasicInfoOuterClass.HomeBasicInfo.newBuilder(this.basicInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.basicInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.basicInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearBasicInfo() {
                if (this.basicInfoBuilder_ == null) {
                    this.basicInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.basicInfo_ = null;
                    this.basicInfoBuilder_ = null;
                }
                return this;
            }
            
            public HomeBasicInfoOuterClass.HomeBasicInfo.Builder getBasicInfoBuilder() {
                this.onChanged();
                return this.getBasicInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public HomeBasicInfoOuterClass.HomeBasicInfoOrBuilder getBasicInfoOrBuilder() {
                if (this.basicInfoBuilder_ != null) {
                    return this.basicInfoBuilder_.getMessageOrBuilder();
                }
                return (this.basicInfo_ == null) ? HomeBasicInfoOuterClass.HomeBasicInfo.getDefaultInstance() : this.basicInfo_;
            }
            
            private SingleFieldBuilderV3<HomeBasicInfoOuterClass.HomeBasicInfo, HomeBasicInfoOuterClass.HomeBasicInfo.Builder, HomeBasicInfoOuterClass.HomeBasicInfoOrBuilder> getBasicInfoFieldBuilder() {
                if (this.basicInfoBuilder_ == null) {
                    this.basicInfoBuilder_ = new SingleFieldBuilderV3<HomeBasicInfoOuterClass.HomeBasicInfo, HomeBasicInfoOuterClass.HomeBasicInfo.Builder, HomeBasicInfoOuterClass.HomeBasicInfoOrBuilder>(this.getBasicInfo(), this.getParentForChildren(), this.isClean());
                    this.basicInfo_ = null;
                }
                return this.basicInfoBuilder_;
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
    
    public interface HomeBasicInfoNotifyOrBuilder extends MessageOrBuilder
    {
        boolean hasBasicInfo();
        
        HomeBasicInfoOuterClass.HomeBasicInfo getBasicInfo();
        
        HomeBasicInfoOuterClass.HomeBasicInfoOrBuilder getBasicInfoOrBuilder();
    }
}
