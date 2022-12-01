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

public final class HomeGetArrangementInfoRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_HomeGetArrangementInfoRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_HomeGetArrangementInfoRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private HomeGetArrangementInfoRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HomeGetArrangementInfoRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001fHomeGetArrangementInfoRsp.proto\u001a\u001eHomeSceneArrangementInfo.proto\"l\n\u0019HomeGetArrangementInfoRsp\u0012\u000f\n\u0007retcode\u0018\u0006 \u0001(\u0005\u0012>\n\u001bscene_arrangement_info_list\u0018\u000e \u0003(\u000b2\u0019.HomeSceneArrangementInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HomeGetArrangementInfoRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { HomeSceneArrangementInfoOuterClass.getDescriptor() });
        internal_static_HomeGetArrangementInfoRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeGetArrangementInfoRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(HomeGetArrangementInfoRspOuterClass.internal_static_HomeGetArrangementInfoRsp_descriptor, new String[] { "Retcode", "SceneArrangementInfoList" });
        HomeSceneArrangementInfoOuterClass.getDescriptor();
    }
    
    public static final class HomeGetArrangementInfoRsp extends GeneratedMessageV3 implements HomeGetArrangementInfoRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 6;
        private int retcode_;
        public static final int SCENE_ARRANGEMENT_INFO_LIST_FIELD_NUMBER = 14;
        private List<HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo> sceneArrangementInfoList_;
        private byte memoizedIsInitialized;
        private static final HomeGetArrangementInfoRsp DEFAULT_INSTANCE;
        private static final Parser<HomeGetArrangementInfoRsp> PARSER;
        
        private HomeGetArrangementInfoRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private HomeGetArrangementInfoRsp() {
            this.memoizedIsInitialized = -1;
            this.sceneArrangementInfoList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new HomeGetArrangementInfoRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private HomeGetArrangementInfoRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 48: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 114: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.sceneArrangementInfoList_ = new ArrayList<HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.sceneArrangementInfoList_.add(input.readMessage(HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.parser(), extensionRegistry));
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
                    this.sceneArrangementInfoList_ = Collections.unmodifiableList((List<? extends HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo>)this.sceneArrangementInfoList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return HomeGetArrangementInfoRspOuterClass.internal_static_HomeGetArrangementInfoRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HomeGetArrangementInfoRspOuterClass.internal_static_HomeGetArrangementInfoRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeGetArrangementInfoRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public List<HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo> getSceneArrangementInfoListList() {
            return this.sceneArrangementInfoList_;
        }
        
        @Override
        public List<? extends HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder> getSceneArrangementInfoListOrBuilderList() {
            return this.sceneArrangementInfoList_;
        }
        
        @Override
        public int getSceneArrangementInfoListCount() {
            return this.sceneArrangementInfoList_.size();
        }
        
        @Override
        public HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo getSceneArrangementInfoList(final int index) {
            return this.sceneArrangementInfoList_.get(index);
        }
        
        @Override
        public HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder getSceneArrangementInfoListOrBuilder(final int index) {
            return this.sceneArrangementInfoList_.get(index);
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
            if (this.retcode_ != 0) {
                output.writeInt32(6, this.retcode_);
            }
            for (int i = 0; i < this.sceneArrangementInfoList_.size(); ++i) {
                output.writeMessage(14, this.sceneArrangementInfoList_.get(i));
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
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(6, this.retcode_);
            }
            for (int i = 0; i < this.sceneArrangementInfoList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(14, this.sceneArrangementInfoList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomeGetArrangementInfoRsp)) {
                return super.equals(obj);
            }
            final HomeGetArrangementInfoRsp other = (HomeGetArrangementInfoRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.getSceneArrangementInfoListList().equals(other.getSceneArrangementInfoListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getRetcode();
            if (this.getSceneArrangementInfoListCount() > 0) {
                hash = 37 * hash + 14;
                hash = 53 * hash + this.getSceneArrangementInfoListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static HomeGetArrangementInfoRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return HomeGetArrangementInfoRsp.PARSER.parseFrom(data);
        }
        
        public static HomeGetArrangementInfoRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeGetArrangementInfoRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeGetArrangementInfoRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return HomeGetArrangementInfoRsp.PARSER.parseFrom(data);
        }
        
        public static HomeGetArrangementInfoRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeGetArrangementInfoRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeGetArrangementInfoRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return HomeGetArrangementInfoRsp.PARSER.parseFrom(data);
        }
        
        public static HomeGetArrangementInfoRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeGetArrangementInfoRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeGetArrangementInfoRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeGetArrangementInfoRsp.PARSER, input);
        }
        
        public static HomeGetArrangementInfoRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeGetArrangementInfoRsp.PARSER, input, extensionRegistry);
        }
        
        public static HomeGetArrangementInfoRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeGetArrangementInfoRsp.PARSER, input);
        }
        
        public static HomeGetArrangementInfoRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeGetArrangementInfoRsp.PARSER, input, extensionRegistry);
        }
        
        public static HomeGetArrangementInfoRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeGetArrangementInfoRsp.PARSER, input);
        }
        
        public static HomeGetArrangementInfoRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeGetArrangementInfoRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return HomeGetArrangementInfoRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final HomeGetArrangementInfoRsp prototype) {
            return HomeGetArrangementInfoRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == HomeGetArrangementInfoRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static HomeGetArrangementInfoRsp getDefaultInstance() {
            return HomeGetArrangementInfoRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<HomeGetArrangementInfoRsp> parser() {
            return HomeGetArrangementInfoRsp.PARSER;
        }
        
        @Override
        public Parser<HomeGetArrangementInfoRsp> getParserForType() {
            return HomeGetArrangementInfoRsp.PARSER;
        }
        
        @Override
        public HomeGetArrangementInfoRsp getDefaultInstanceForType() {
            return HomeGetArrangementInfoRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new HomeGetArrangementInfoRsp();
            PARSER = new AbstractParser<HomeGetArrangementInfoRsp>() {
                @Override
                public HomeGetArrangementInfoRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new HomeGetArrangementInfoRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HomeGetArrangementInfoRspOrBuilder
        {
            private int bitField0_;
            private int retcode_;
            private List<HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo> sceneArrangementInfoList_;
            private RepeatedFieldBuilderV3<HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo, HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder, HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder> sceneArrangementInfoListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return HomeGetArrangementInfoRspOuterClass.internal_static_HomeGetArrangementInfoRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HomeGetArrangementInfoRspOuterClass.internal_static_HomeGetArrangementInfoRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeGetArrangementInfoRsp.class, Builder.class);
            }
            
            private Builder() {
                this.sceneArrangementInfoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.sceneArrangementInfoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (HomeGetArrangementInfoRsp.alwaysUseFieldBuilders) {
                    this.getSceneArrangementInfoListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                if (this.sceneArrangementInfoListBuilder_ == null) {
                    this.sceneArrangementInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.sceneArrangementInfoListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return HomeGetArrangementInfoRspOuterClass.internal_static_HomeGetArrangementInfoRsp_descriptor;
            }
            
            @Override
            public HomeGetArrangementInfoRsp getDefaultInstanceForType() {
                return HomeGetArrangementInfoRsp.getDefaultInstance();
            }
            
            @Override
            public HomeGetArrangementInfoRsp build() {
                final HomeGetArrangementInfoRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public HomeGetArrangementInfoRsp buildPartial() {
                final HomeGetArrangementInfoRsp result = new HomeGetArrangementInfoRsp(this);
                final int from_bitField0_ = this.bitField0_;
                result.retcode_ = this.retcode_;
                if (this.sceneArrangementInfoListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.sceneArrangementInfoList_ = Collections.unmodifiableList((List<? extends HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo>)this.sceneArrangementInfoList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.sceneArrangementInfoList_ = this.sceneArrangementInfoList_;
                }
                else {
                    result.sceneArrangementInfoList_ = this.sceneArrangementInfoListBuilder_.build();
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
                if (other instanceof HomeGetArrangementInfoRsp) {
                    return this.mergeFrom((HomeGetArrangementInfoRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final HomeGetArrangementInfoRsp other) {
                if (other == HomeGetArrangementInfoRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (this.sceneArrangementInfoListBuilder_ == null) {
                    if (!other.sceneArrangementInfoList_.isEmpty()) {
                        if (this.sceneArrangementInfoList_.isEmpty()) {
                            this.sceneArrangementInfoList_ = other.sceneArrangementInfoList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureSceneArrangementInfoListIsMutable();
                            this.sceneArrangementInfoList_.addAll(other.sceneArrangementInfoList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.sceneArrangementInfoList_.isEmpty()) {
                    if (this.sceneArrangementInfoListBuilder_.isEmpty()) {
                        this.sceneArrangementInfoListBuilder_.dispose();
                        this.sceneArrangementInfoListBuilder_ = null;
                        this.sceneArrangementInfoList_ = other.sceneArrangementInfoList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.sceneArrangementInfoListBuilder_ = (HomeGetArrangementInfoRsp.alwaysUseFieldBuilders ? this.getSceneArrangementInfoListFieldBuilder() : null);
                    }
                    else {
                        this.sceneArrangementInfoListBuilder_.addAllMessages(other.sceneArrangementInfoList_);
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
                HomeGetArrangementInfoRsp parsedMessage = null;
                try {
                    parsedMessage = HomeGetArrangementInfoRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (HomeGetArrangementInfoRsp)e.getUnfinishedMessage();
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
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureSceneArrangementInfoListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.sceneArrangementInfoList_ = new ArrayList<HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo>(this.sceneArrangementInfoList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo> getSceneArrangementInfoListList() {
                if (this.sceneArrangementInfoListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo>)this.sceneArrangementInfoList_);
                }
                return this.sceneArrangementInfoListBuilder_.getMessageList();
            }
            
            @Override
            public int getSceneArrangementInfoListCount() {
                if (this.sceneArrangementInfoListBuilder_ == null) {
                    return this.sceneArrangementInfoList_.size();
                }
                return this.sceneArrangementInfoListBuilder_.getCount();
            }
            
            @Override
            public HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo getSceneArrangementInfoList(final int index) {
                if (this.sceneArrangementInfoListBuilder_ == null) {
                    return this.sceneArrangementInfoList_.get(index);
                }
                return this.sceneArrangementInfoListBuilder_.getMessage(index);
            }
            
            public Builder setSceneArrangementInfoList(final int index, final HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo value) {
                if (this.sceneArrangementInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureSceneArrangementInfoListIsMutable();
                    this.sceneArrangementInfoList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.sceneArrangementInfoListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setSceneArrangementInfoList(final int index, final HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder builderForValue) {
                if (this.sceneArrangementInfoListBuilder_ == null) {
                    this.ensureSceneArrangementInfoListIsMutable();
                    this.sceneArrangementInfoList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.sceneArrangementInfoListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addSceneArrangementInfoList(final HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo value) {
                if (this.sceneArrangementInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureSceneArrangementInfoListIsMutable();
                    this.sceneArrangementInfoList_.add(value);
                    this.onChanged();
                }
                else {
                    this.sceneArrangementInfoListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addSceneArrangementInfoList(final int index, final HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo value) {
                if (this.sceneArrangementInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureSceneArrangementInfoListIsMutable();
                    this.sceneArrangementInfoList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.sceneArrangementInfoListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addSceneArrangementInfoList(final HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder builderForValue) {
                if (this.sceneArrangementInfoListBuilder_ == null) {
                    this.ensureSceneArrangementInfoListIsMutable();
                    this.sceneArrangementInfoList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.sceneArrangementInfoListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addSceneArrangementInfoList(final int index, final HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder builderForValue) {
                if (this.sceneArrangementInfoListBuilder_ == null) {
                    this.ensureSceneArrangementInfoListIsMutable();
                    this.sceneArrangementInfoList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.sceneArrangementInfoListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllSceneArrangementInfoList(final Iterable<? extends HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo> values) {
                if (this.sceneArrangementInfoListBuilder_ == null) {
                    this.ensureSceneArrangementInfoListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.sceneArrangementInfoList_);
                    this.onChanged();
                }
                else {
                    this.sceneArrangementInfoListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearSceneArrangementInfoList() {
                if (this.sceneArrangementInfoListBuilder_ == null) {
                    this.sceneArrangementInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.sceneArrangementInfoListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeSceneArrangementInfoList(final int index) {
                if (this.sceneArrangementInfoListBuilder_ == null) {
                    this.ensureSceneArrangementInfoListIsMutable();
                    this.sceneArrangementInfoList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.sceneArrangementInfoListBuilder_.remove(index);
                }
                return this;
            }
            
            public HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder getSceneArrangementInfoListBuilder(final int index) {
                return this.getSceneArrangementInfoListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder getSceneArrangementInfoListOrBuilder(final int index) {
                if (this.sceneArrangementInfoListBuilder_ == null) {
                    return this.sceneArrangementInfoList_.get(index);
                }
                return this.sceneArrangementInfoListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder> getSceneArrangementInfoListOrBuilderList() {
                if (this.sceneArrangementInfoListBuilder_ != null) {
                    return this.sceneArrangementInfoListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder>)this.sceneArrangementInfoList_);
            }
            
            public HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder addSceneArrangementInfoListBuilder() {
                return this.getSceneArrangementInfoListFieldBuilder().addBuilder(HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.getDefaultInstance());
            }
            
            public HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder addSceneArrangementInfoListBuilder(final int index) {
                return this.getSceneArrangementInfoListFieldBuilder().addBuilder(index, HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.getDefaultInstance());
            }
            
            public List<HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder> getSceneArrangementInfoListBuilderList() {
                return this.getSceneArrangementInfoListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo, HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder, HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder> getSceneArrangementInfoListFieldBuilder() {
                if (this.sceneArrangementInfoListBuilder_ == null) {
                    this.sceneArrangementInfoListBuilder_ = new RepeatedFieldBuilderV3<HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo, HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder, HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder>(this.sceneArrangementInfoList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.sceneArrangementInfoList_ = null;
                }
                return this.sceneArrangementInfoListBuilder_;
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
    
    public interface HomeGetArrangementInfoRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        List<HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo> getSceneArrangementInfoListList();
        
        HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo getSceneArrangementInfoList(final int p0);
        
        int getSceneArrangementInfoListCount();
        
        List<? extends HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder> getSceneArrangementInfoListOrBuilderList();
        
        HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder getSceneArrangementInfoListOrBuilder(final int p0);
    }
}
