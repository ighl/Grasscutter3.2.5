// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
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

public final class HomeMarkPointSceneDataOuterClass
{
    private static final Descriptors.Descriptor internal_static_HomeMarkPointSceneData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_HomeMarkPointSceneData_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private HomeMarkPointSceneDataOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HomeMarkPointSceneDataOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cHomeMarkPointSceneData.proto\u001a HomeMarkPointFurnitureData.proto\u001a\fVector.proto\"\u0096\u0001\n\u0016HomeMarkPointSceneData\u00123\n\u000efurniture_list\u0018\u0006 \u0003(\u000b2\u001b.HomeMarkPointFurnitureData\u0012\u0011\n\tmodule_id\u0018\u0005 \u0001(\r\u0012\u0010\n\bscene_id\u0018\u0002 \u0001(\r\u0012\"\n\u0011teapot_spirit_pos\u0018\u0004 \u0001(\u000b2\u0007.VectorB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HomeMarkPointSceneDataOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { HomeMarkPointFurnitureDataOuterClass.getDescriptor(), VectorOuterClass.getDescriptor() });
        internal_static_HomeMarkPointSceneData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeMarkPointSceneData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(HomeMarkPointSceneDataOuterClass.internal_static_HomeMarkPointSceneData_descriptor, new String[] { "FurnitureList", "ModuleId", "SceneId", "TeapotSpiritPos" });
        HomeMarkPointFurnitureDataOuterClass.getDescriptor();
        VectorOuterClass.getDescriptor();
    }
    
    public static final class HomeMarkPointSceneData extends GeneratedMessageV3 implements HomeMarkPointSceneDataOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int FURNITURE_LIST_FIELD_NUMBER = 6;
        private List<HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData> furnitureList_;
        public static final int MODULE_ID_FIELD_NUMBER = 5;
        private int moduleId_;
        public static final int SCENE_ID_FIELD_NUMBER = 2;
        private int sceneId_;
        public static final int TEAPOT_SPIRIT_POS_FIELD_NUMBER = 4;
        private VectorOuterClass.Vector teapotSpiritPos_;
        private byte memoizedIsInitialized;
        private static final HomeMarkPointSceneData DEFAULT_INSTANCE;
        private static final Parser<HomeMarkPointSceneData> PARSER;
        
        private HomeMarkPointSceneData(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private HomeMarkPointSceneData() {
            this.memoizedIsInitialized = -1;
            this.furnitureList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new HomeMarkPointSceneData();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private HomeMarkPointSceneData(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 16: {
                            this.sceneId_ = input.readUInt32();
                            continue;
                        }
                        case 34: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.teapotSpiritPos_ != null) {
                                subBuilder = this.teapotSpiritPos_.toBuilder();
                            }
                            this.teapotSpiritPos_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.teapotSpiritPos_);
                                this.teapotSpiritPos_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 40: {
                            this.moduleId_ = input.readUInt32();
                            continue;
                        }
                        case 50: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.furnitureList_ = new ArrayList<HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.furnitureList_.add(input.readMessage(HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData.parser(), extensionRegistry));
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
                    this.furnitureList_ = Collections.unmodifiableList((List<? extends HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData>)this.furnitureList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return HomeMarkPointSceneDataOuterClass.internal_static_HomeMarkPointSceneData_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HomeMarkPointSceneDataOuterClass.internal_static_HomeMarkPointSceneData_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeMarkPointSceneData.class, Builder.class);
        }
        
        @Override
        public List<HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData> getFurnitureListList() {
            return this.furnitureList_;
        }
        
        @Override
        public List<? extends HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureDataOrBuilder> getFurnitureListOrBuilderList() {
            return this.furnitureList_;
        }
        
        @Override
        public int getFurnitureListCount() {
            return this.furnitureList_.size();
        }
        
        @Override
        public HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData getFurnitureList(final int index) {
            return this.furnitureList_.get(index);
        }
        
        @Override
        public HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureDataOrBuilder getFurnitureListOrBuilder(final int index) {
            return this.furnitureList_.get(index);
        }
        
        @Override
        public int getModuleId() {
            return this.moduleId_;
        }
        
        @Override
        public int getSceneId() {
            return this.sceneId_;
        }
        
        @Override
        public boolean hasTeapotSpiritPos() {
            return this.teapotSpiritPos_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getTeapotSpiritPos() {
            return (this.teapotSpiritPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.teapotSpiritPos_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getTeapotSpiritPosOrBuilder() {
            return this.getTeapotSpiritPos();
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
            if (this.sceneId_ != 0) {
                output.writeUInt32(2, this.sceneId_);
            }
            if (this.teapotSpiritPos_ != null) {
                output.writeMessage(4, this.getTeapotSpiritPos());
            }
            if (this.moduleId_ != 0) {
                output.writeUInt32(5, this.moduleId_);
            }
            for (int i = 0; i < this.furnitureList_.size(); ++i) {
                output.writeMessage(6, this.furnitureList_.get(i));
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
            if (this.sceneId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.sceneId_);
            }
            if (this.teapotSpiritPos_ != null) {
                size += CodedOutputStream.computeMessageSize(4, this.getTeapotSpiritPos());
            }
            if (this.moduleId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.moduleId_);
            }
            for (int i = 0; i < this.furnitureList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(6, this.furnitureList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomeMarkPointSceneData)) {
                return super.equals(obj);
            }
            final HomeMarkPointSceneData other = (HomeMarkPointSceneData)obj;
            return this.getFurnitureListList().equals(other.getFurnitureListList()) && this.getModuleId() == other.getModuleId() && this.getSceneId() == other.getSceneId() && this.hasTeapotSpiritPos() == other.hasTeapotSpiritPos() && (!this.hasTeapotSpiritPos() || this.getTeapotSpiritPos().equals(other.getTeapotSpiritPos())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getFurnitureListCount() > 0) {
                hash = 37 * hash + 6;
                hash = 53 * hash + this.getFurnitureListList().hashCode();
            }
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getModuleId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getSceneId();
            if (this.hasTeapotSpiritPos()) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getTeapotSpiritPos().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static HomeMarkPointSceneData parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return HomeMarkPointSceneData.PARSER.parseFrom(data);
        }
        
        public static HomeMarkPointSceneData parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeMarkPointSceneData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeMarkPointSceneData parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return HomeMarkPointSceneData.PARSER.parseFrom(data);
        }
        
        public static HomeMarkPointSceneData parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeMarkPointSceneData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeMarkPointSceneData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return HomeMarkPointSceneData.PARSER.parseFrom(data);
        }
        
        public static HomeMarkPointSceneData parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeMarkPointSceneData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeMarkPointSceneData parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeMarkPointSceneData.PARSER, input);
        }
        
        public static HomeMarkPointSceneData parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeMarkPointSceneData.PARSER, input, extensionRegistry);
        }
        
        public static HomeMarkPointSceneData parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeMarkPointSceneData.PARSER, input);
        }
        
        public static HomeMarkPointSceneData parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeMarkPointSceneData.PARSER, input, extensionRegistry);
        }
        
        public static HomeMarkPointSceneData parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeMarkPointSceneData.PARSER, input);
        }
        
        public static HomeMarkPointSceneData parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeMarkPointSceneData.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return HomeMarkPointSceneData.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final HomeMarkPointSceneData prototype) {
            return HomeMarkPointSceneData.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == HomeMarkPointSceneData.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static HomeMarkPointSceneData getDefaultInstance() {
            return HomeMarkPointSceneData.DEFAULT_INSTANCE;
        }
        
        public static Parser<HomeMarkPointSceneData> parser() {
            return HomeMarkPointSceneData.PARSER;
        }
        
        @Override
        public Parser<HomeMarkPointSceneData> getParserForType() {
            return HomeMarkPointSceneData.PARSER;
        }
        
        @Override
        public HomeMarkPointSceneData getDefaultInstanceForType() {
            return HomeMarkPointSceneData.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new HomeMarkPointSceneData();
            PARSER = new AbstractParser<HomeMarkPointSceneData>() {
                @Override
                public HomeMarkPointSceneData parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new HomeMarkPointSceneData(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HomeMarkPointSceneDataOrBuilder
        {
            private int bitField0_;
            private List<HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData> furnitureList_;
            private RepeatedFieldBuilderV3<HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData, HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData.Builder, HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureDataOrBuilder> furnitureListBuilder_;
            private int moduleId_;
            private int sceneId_;
            private VectorOuterClass.Vector teapotSpiritPos_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> teapotSpiritPosBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return HomeMarkPointSceneDataOuterClass.internal_static_HomeMarkPointSceneData_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HomeMarkPointSceneDataOuterClass.internal_static_HomeMarkPointSceneData_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeMarkPointSceneData.class, Builder.class);
            }
            
            private Builder() {
                this.furnitureList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.furnitureList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (HomeMarkPointSceneData.alwaysUseFieldBuilders) {
                    this.getFurnitureListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.furnitureListBuilder_ == null) {
                    this.furnitureList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.furnitureListBuilder_.clear();
                }
                this.moduleId_ = 0;
                this.sceneId_ = 0;
                if (this.teapotSpiritPosBuilder_ == null) {
                    this.teapotSpiritPos_ = null;
                }
                else {
                    this.teapotSpiritPos_ = null;
                    this.teapotSpiritPosBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return HomeMarkPointSceneDataOuterClass.internal_static_HomeMarkPointSceneData_descriptor;
            }
            
            @Override
            public HomeMarkPointSceneData getDefaultInstanceForType() {
                return HomeMarkPointSceneData.getDefaultInstance();
            }
            
            @Override
            public HomeMarkPointSceneData build() {
                final HomeMarkPointSceneData result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public HomeMarkPointSceneData buildPartial() {
                final HomeMarkPointSceneData result = new HomeMarkPointSceneData(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.furnitureListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.furnitureList_ = Collections.unmodifiableList((List<? extends HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData>)this.furnitureList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.furnitureList_ = this.furnitureList_;
                }
                else {
                    result.furnitureList_ = this.furnitureListBuilder_.build();
                }
                result.moduleId_ = this.moduleId_;
                result.sceneId_ = this.sceneId_;
                if (this.teapotSpiritPosBuilder_ == null) {
                    result.teapotSpiritPos_ = this.teapotSpiritPos_;
                }
                else {
                    result.teapotSpiritPos_ = this.teapotSpiritPosBuilder_.build();
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
                if (other instanceof HomeMarkPointSceneData) {
                    return this.mergeFrom((HomeMarkPointSceneData)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final HomeMarkPointSceneData other) {
                if (other == HomeMarkPointSceneData.getDefaultInstance()) {
                    return this;
                }
                if (this.furnitureListBuilder_ == null) {
                    if (!other.furnitureList_.isEmpty()) {
                        if (this.furnitureList_.isEmpty()) {
                            this.furnitureList_ = other.furnitureList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureFurnitureListIsMutable();
                            this.furnitureList_.addAll(other.furnitureList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.furnitureList_.isEmpty()) {
                    if (this.furnitureListBuilder_.isEmpty()) {
                        this.furnitureListBuilder_.dispose();
                        this.furnitureListBuilder_ = null;
                        this.furnitureList_ = other.furnitureList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.furnitureListBuilder_ = (HomeMarkPointSceneData.alwaysUseFieldBuilders ? this.getFurnitureListFieldBuilder() : null);
                    }
                    else {
                        this.furnitureListBuilder_.addAllMessages(other.furnitureList_);
                    }
                }
                if (other.getModuleId() != 0) {
                    this.setModuleId(other.getModuleId());
                }
                if (other.getSceneId() != 0) {
                    this.setSceneId(other.getSceneId());
                }
                if (other.hasTeapotSpiritPos()) {
                    this.mergeTeapotSpiritPos(other.getTeapotSpiritPos());
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
                HomeMarkPointSceneData parsedMessage = null;
                try {
                    parsedMessage = HomeMarkPointSceneData.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (HomeMarkPointSceneData)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureFurnitureListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.furnitureList_ = new ArrayList<HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData>(this.furnitureList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData> getFurnitureListList() {
                if (this.furnitureListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData>)this.furnitureList_);
                }
                return this.furnitureListBuilder_.getMessageList();
            }
            
            @Override
            public int getFurnitureListCount() {
                if (this.furnitureListBuilder_ == null) {
                    return this.furnitureList_.size();
                }
                return this.furnitureListBuilder_.getCount();
            }
            
            @Override
            public HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData getFurnitureList(final int index) {
                if (this.furnitureListBuilder_ == null) {
                    return this.furnitureList_.get(index);
                }
                return this.furnitureListBuilder_.getMessage(index);
            }
            
            public Builder setFurnitureList(final int index, final HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData value) {
                if (this.furnitureListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFurnitureListIsMutable();
                    this.furnitureList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.furnitureListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setFurnitureList(final int index, final HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData.Builder builderForValue) {
                if (this.furnitureListBuilder_ == null) {
                    this.ensureFurnitureListIsMutable();
                    this.furnitureList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.furnitureListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addFurnitureList(final HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData value) {
                if (this.furnitureListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFurnitureListIsMutable();
                    this.furnitureList_.add(value);
                    this.onChanged();
                }
                else {
                    this.furnitureListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addFurnitureList(final int index, final HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData value) {
                if (this.furnitureListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFurnitureListIsMutable();
                    this.furnitureList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.furnitureListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addFurnitureList(final HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData.Builder builderForValue) {
                if (this.furnitureListBuilder_ == null) {
                    this.ensureFurnitureListIsMutable();
                    this.furnitureList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.furnitureListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addFurnitureList(final int index, final HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData.Builder builderForValue) {
                if (this.furnitureListBuilder_ == null) {
                    this.ensureFurnitureListIsMutable();
                    this.furnitureList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.furnitureListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllFurnitureList(final Iterable<? extends HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData> values) {
                if (this.furnitureListBuilder_ == null) {
                    this.ensureFurnitureListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.furnitureList_);
                    this.onChanged();
                }
                else {
                    this.furnitureListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearFurnitureList() {
                if (this.furnitureListBuilder_ == null) {
                    this.furnitureList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.furnitureListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeFurnitureList(final int index) {
                if (this.furnitureListBuilder_ == null) {
                    this.ensureFurnitureListIsMutable();
                    this.furnitureList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.furnitureListBuilder_.remove(index);
                }
                return this;
            }
            
            public HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData.Builder getFurnitureListBuilder(final int index) {
                return this.getFurnitureListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureDataOrBuilder getFurnitureListOrBuilder(final int index) {
                if (this.furnitureListBuilder_ == null) {
                    return this.furnitureList_.get(index);
                }
                return this.furnitureListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureDataOrBuilder> getFurnitureListOrBuilderList() {
                if (this.furnitureListBuilder_ != null) {
                    return this.furnitureListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureDataOrBuilder>)this.furnitureList_);
            }
            
            public HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData.Builder addFurnitureListBuilder() {
                return this.getFurnitureListFieldBuilder().addBuilder(HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData.getDefaultInstance());
            }
            
            public HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData.Builder addFurnitureListBuilder(final int index) {
                return this.getFurnitureListFieldBuilder().addBuilder(index, HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData.getDefaultInstance());
            }
            
            public List<HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData.Builder> getFurnitureListBuilderList() {
                return this.getFurnitureListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData, HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData.Builder, HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureDataOrBuilder> getFurnitureListFieldBuilder() {
                if (this.furnitureListBuilder_ == null) {
                    this.furnitureListBuilder_ = new RepeatedFieldBuilderV3<HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData, HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData.Builder, HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureDataOrBuilder>(this.furnitureList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.furnitureList_ = null;
                }
                return this.furnitureListBuilder_;
            }
            
            @Override
            public int getModuleId() {
                return this.moduleId_;
            }
            
            public Builder setModuleId(final int value) {
                this.moduleId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearModuleId() {
                this.moduleId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getSceneId() {
                return this.sceneId_;
            }
            
            public Builder setSceneId(final int value) {
                this.sceneId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSceneId() {
                this.sceneId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasTeapotSpiritPos() {
                return this.teapotSpiritPosBuilder_ != null || this.teapotSpiritPos_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getTeapotSpiritPos() {
                if (this.teapotSpiritPosBuilder_ == null) {
                    return (this.teapotSpiritPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.teapotSpiritPos_;
                }
                return this.teapotSpiritPosBuilder_.getMessage();
            }
            
            public Builder setTeapotSpiritPos(final VectorOuterClass.Vector value) {
                if (this.teapotSpiritPosBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.teapotSpiritPos_ = value;
                    this.onChanged();
                }
                else {
                    this.teapotSpiritPosBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setTeapotSpiritPos(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.teapotSpiritPosBuilder_ == null) {
                    this.teapotSpiritPos_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.teapotSpiritPosBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeTeapotSpiritPos(final VectorOuterClass.Vector value) {
                if (this.teapotSpiritPosBuilder_ == null) {
                    if (this.teapotSpiritPos_ != null) {
                        this.teapotSpiritPos_ = VectorOuterClass.Vector.newBuilder(this.teapotSpiritPos_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.teapotSpiritPos_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.teapotSpiritPosBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearTeapotSpiritPos() {
                if (this.teapotSpiritPosBuilder_ == null) {
                    this.teapotSpiritPos_ = null;
                    this.onChanged();
                }
                else {
                    this.teapotSpiritPos_ = null;
                    this.teapotSpiritPosBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getTeapotSpiritPosBuilder() {
                this.onChanged();
                return this.getTeapotSpiritPosFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getTeapotSpiritPosOrBuilder() {
                if (this.teapotSpiritPosBuilder_ != null) {
                    return this.teapotSpiritPosBuilder_.getMessageOrBuilder();
                }
                return (this.teapotSpiritPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.teapotSpiritPos_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getTeapotSpiritPosFieldBuilder() {
                if (this.teapotSpiritPosBuilder_ == null) {
                    this.teapotSpiritPosBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getTeapotSpiritPos(), this.getParentForChildren(), this.isClean());
                    this.teapotSpiritPos_ = null;
                }
                return this.teapotSpiritPosBuilder_;
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
    
    public interface HomeMarkPointSceneDataOrBuilder extends MessageOrBuilder
    {
        List<HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData> getFurnitureListList();
        
        HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureData getFurnitureList(final int p0);
        
        int getFurnitureListCount();
        
        List<? extends HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureDataOrBuilder> getFurnitureListOrBuilderList();
        
        HomeMarkPointFurnitureDataOuterClass.HomeMarkPointFurnitureDataOrBuilder getFurnitureListOrBuilder(final int p0);
        
        int getModuleId();
        
        int getSceneId();
        
        boolean hasTeapotSpiritPos();
        
        VectorOuterClass.Vector getTeapotSpiritPos();
        
        VectorOuterClass.VectorOrBuilder getTeapotSpiritPosOrBuilder();
    }
}
