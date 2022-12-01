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

public final class HomeUpdateArrangementInfoReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_HomeUpdateArrangementInfoReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_HomeUpdateArrangementInfoReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private HomeUpdateArrangementInfoReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HomeUpdateArrangementInfoReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\"HomeUpdateArrangementInfoReq.proto\u001a\u001eHomeSceneArrangementInfo.proto\"Y\n\u001cHomeUpdateArrangementInfoReq\u00129\n\u0016scene_arrangement_info\u0018\u0006 \u0001(\u000b2\u0019.HomeSceneArrangementInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HomeUpdateArrangementInfoReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { HomeSceneArrangementInfoOuterClass.getDescriptor() });
        internal_static_HomeUpdateArrangementInfoReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeUpdateArrangementInfoReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(HomeUpdateArrangementInfoReqOuterClass.internal_static_HomeUpdateArrangementInfoReq_descriptor, new String[] { "SceneArrangementInfo" });
        HomeSceneArrangementInfoOuterClass.getDescriptor();
    }
    
    public static final class HomeUpdateArrangementInfoReq extends GeneratedMessageV3 implements HomeUpdateArrangementInfoReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SCENE_ARRANGEMENT_INFO_FIELD_NUMBER = 6;
        private HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo sceneArrangementInfo_;
        private byte memoizedIsInitialized;
        private static final HomeUpdateArrangementInfoReq DEFAULT_INSTANCE;
        private static final Parser<HomeUpdateArrangementInfoReq> PARSER;
        
        private HomeUpdateArrangementInfoReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private HomeUpdateArrangementInfoReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new HomeUpdateArrangementInfoReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private HomeUpdateArrangementInfoReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 50: {
                            HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder subBuilder = null;
                            if (this.sceneArrangementInfo_ != null) {
                                subBuilder = this.sceneArrangementInfo_.toBuilder();
                            }
                            this.sceneArrangementInfo_ = input.readMessage(HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.sceneArrangementInfo_);
                                this.sceneArrangementInfo_ = subBuilder.buildPartial();
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
            return HomeUpdateArrangementInfoReqOuterClass.internal_static_HomeUpdateArrangementInfoReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HomeUpdateArrangementInfoReqOuterClass.internal_static_HomeUpdateArrangementInfoReq_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeUpdateArrangementInfoReq.class, Builder.class);
        }
        
        @Override
        public boolean hasSceneArrangementInfo() {
            return this.sceneArrangementInfo_ != null;
        }
        
        @Override
        public HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo getSceneArrangementInfo() {
            return (this.sceneArrangementInfo_ == null) ? HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.getDefaultInstance() : this.sceneArrangementInfo_;
        }
        
        @Override
        public HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder getSceneArrangementInfoOrBuilder() {
            return this.getSceneArrangementInfo();
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
            if (this.sceneArrangementInfo_ != null) {
                output.writeMessage(6, this.getSceneArrangementInfo());
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
            if (this.sceneArrangementInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(6, this.getSceneArrangementInfo());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomeUpdateArrangementInfoReq)) {
                return super.equals(obj);
            }
            final HomeUpdateArrangementInfoReq other = (HomeUpdateArrangementInfoReq)obj;
            return this.hasSceneArrangementInfo() == other.hasSceneArrangementInfo() && (!this.hasSceneArrangementInfo() || this.getSceneArrangementInfo().equals(other.getSceneArrangementInfo())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasSceneArrangementInfo()) {
                hash = 37 * hash + 6;
                hash = 53 * hash + this.getSceneArrangementInfo().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static HomeUpdateArrangementInfoReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return HomeUpdateArrangementInfoReq.PARSER.parseFrom(data);
        }
        
        public static HomeUpdateArrangementInfoReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeUpdateArrangementInfoReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeUpdateArrangementInfoReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return HomeUpdateArrangementInfoReq.PARSER.parseFrom(data);
        }
        
        public static HomeUpdateArrangementInfoReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeUpdateArrangementInfoReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeUpdateArrangementInfoReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return HomeUpdateArrangementInfoReq.PARSER.parseFrom(data);
        }
        
        public static HomeUpdateArrangementInfoReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeUpdateArrangementInfoReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeUpdateArrangementInfoReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeUpdateArrangementInfoReq.PARSER, input);
        }
        
        public static HomeUpdateArrangementInfoReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeUpdateArrangementInfoReq.PARSER, input, extensionRegistry);
        }
        
        public static HomeUpdateArrangementInfoReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeUpdateArrangementInfoReq.PARSER, input);
        }
        
        public static HomeUpdateArrangementInfoReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeUpdateArrangementInfoReq.PARSER, input, extensionRegistry);
        }
        
        public static HomeUpdateArrangementInfoReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeUpdateArrangementInfoReq.PARSER, input);
        }
        
        public static HomeUpdateArrangementInfoReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeUpdateArrangementInfoReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return HomeUpdateArrangementInfoReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final HomeUpdateArrangementInfoReq prototype) {
            return HomeUpdateArrangementInfoReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == HomeUpdateArrangementInfoReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static HomeUpdateArrangementInfoReq getDefaultInstance() {
            return HomeUpdateArrangementInfoReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<HomeUpdateArrangementInfoReq> parser() {
            return HomeUpdateArrangementInfoReq.PARSER;
        }
        
        @Override
        public Parser<HomeUpdateArrangementInfoReq> getParserForType() {
            return HomeUpdateArrangementInfoReq.PARSER;
        }
        
        @Override
        public HomeUpdateArrangementInfoReq getDefaultInstanceForType() {
            return HomeUpdateArrangementInfoReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new HomeUpdateArrangementInfoReq();
            PARSER = new AbstractParser<HomeUpdateArrangementInfoReq>() {
                @Override
                public HomeUpdateArrangementInfoReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new HomeUpdateArrangementInfoReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HomeUpdateArrangementInfoReqOrBuilder
        {
            private HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo sceneArrangementInfo_;
            private SingleFieldBuilderV3<HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo, HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder, HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder> sceneArrangementInfoBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return HomeUpdateArrangementInfoReqOuterClass.internal_static_HomeUpdateArrangementInfoReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HomeUpdateArrangementInfoReqOuterClass.internal_static_HomeUpdateArrangementInfoReq_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeUpdateArrangementInfoReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (HomeUpdateArrangementInfoReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.sceneArrangementInfoBuilder_ == null) {
                    this.sceneArrangementInfo_ = null;
                }
                else {
                    this.sceneArrangementInfo_ = null;
                    this.sceneArrangementInfoBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return HomeUpdateArrangementInfoReqOuterClass.internal_static_HomeUpdateArrangementInfoReq_descriptor;
            }
            
            @Override
            public HomeUpdateArrangementInfoReq getDefaultInstanceForType() {
                return HomeUpdateArrangementInfoReq.getDefaultInstance();
            }
            
            @Override
            public HomeUpdateArrangementInfoReq build() {
                final HomeUpdateArrangementInfoReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public HomeUpdateArrangementInfoReq buildPartial() {
                final HomeUpdateArrangementInfoReq result = new HomeUpdateArrangementInfoReq(this);
                if (this.sceneArrangementInfoBuilder_ == null) {
                    result.sceneArrangementInfo_ = this.sceneArrangementInfo_;
                }
                else {
                    result.sceneArrangementInfo_ = this.sceneArrangementInfoBuilder_.build();
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
                if (other instanceof HomeUpdateArrangementInfoReq) {
                    return this.mergeFrom((HomeUpdateArrangementInfoReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final HomeUpdateArrangementInfoReq other) {
                if (other == HomeUpdateArrangementInfoReq.getDefaultInstance()) {
                    return this;
                }
                if (other.hasSceneArrangementInfo()) {
                    this.mergeSceneArrangementInfo(other.getSceneArrangementInfo());
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
                HomeUpdateArrangementInfoReq parsedMessage = null;
                try {
                    parsedMessage = HomeUpdateArrangementInfoReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (HomeUpdateArrangementInfoReq)e.getUnfinishedMessage();
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
            public boolean hasSceneArrangementInfo() {
                return this.sceneArrangementInfoBuilder_ != null || this.sceneArrangementInfo_ != null;
            }
            
            @Override
            public HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo getSceneArrangementInfo() {
                if (this.sceneArrangementInfoBuilder_ == null) {
                    return (this.sceneArrangementInfo_ == null) ? HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.getDefaultInstance() : this.sceneArrangementInfo_;
                }
                return this.sceneArrangementInfoBuilder_.getMessage();
            }
            
            public Builder setSceneArrangementInfo(final HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo value) {
                if (this.sceneArrangementInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.sceneArrangementInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.sceneArrangementInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setSceneArrangementInfo(final HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder builderForValue) {
                if (this.sceneArrangementInfoBuilder_ == null) {
                    this.sceneArrangementInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.sceneArrangementInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeSceneArrangementInfo(final HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo value) {
                if (this.sceneArrangementInfoBuilder_ == null) {
                    if (this.sceneArrangementInfo_ != null) {
                        this.sceneArrangementInfo_ = HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.newBuilder(this.sceneArrangementInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.sceneArrangementInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.sceneArrangementInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearSceneArrangementInfo() {
                if (this.sceneArrangementInfoBuilder_ == null) {
                    this.sceneArrangementInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.sceneArrangementInfo_ = null;
                    this.sceneArrangementInfoBuilder_ = null;
                }
                return this;
            }
            
            public HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder getSceneArrangementInfoBuilder() {
                this.onChanged();
                return this.getSceneArrangementInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder getSceneArrangementInfoOrBuilder() {
                if (this.sceneArrangementInfoBuilder_ != null) {
                    return this.sceneArrangementInfoBuilder_.getMessageOrBuilder();
                }
                return (this.sceneArrangementInfo_ == null) ? HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.getDefaultInstance() : this.sceneArrangementInfo_;
            }
            
            private SingleFieldBuilderV3<HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo, HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder, HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder> getSceneArrangementInfoFieldBuilder() {
                if (this.sceneArrangementInfoBuilder_ == null) {
                    this.sceneArrangementInfoBuilder_ = new SingleFieldBuilderV3<HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo, HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder, HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder>(this.getSceneArrangementInfo(), this.getParentForChildren(), this.isClean());
                    this.sceneArrangementInfo_ = null;
                }
                return this.sceneArrangementInfoBuilder_;
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
    
    public interface HomeUpdateArrangementInfoReqOrBuilder extends MessageOrBuilder
    {
        boolean hasSceneArrangementInfo();
        
        HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo getSceneArrangementInfo();
        
        HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder getSceneArrangementInfoOrBuilder();
    }
}
