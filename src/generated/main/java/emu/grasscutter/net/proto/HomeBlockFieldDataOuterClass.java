// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
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

public final class HomeBlockFieldDataOuterClass
{
    private static final Descriptors.Descriptor internal_static_HomeBlockFieldData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_HomeBlockFieldData_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private HomeBlockFieldDataOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HomeBlockFieldDataOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018HomeBlockFieldData.proto\u001a\u001bHomeBlockSubFieldData.proto\u001a\fVector.proto\"\u0094\u0001\n\u0012HomeBlockFieldData\u0012\u0014\n\u0003rot\u0018\u000f \u0001(\u000b2\u0007.Vector\u0012\u0014\n\u0003pos\u0018\u0004 \u0001(\u000b2\u0007.Vector\u0012\f\n\u0004guid\u0018\t \u0001(\r\u0012\u0014\n\ffurniture_id\u0018\u0001 \u0001(\r\u0012.\n\u000esub_field_list\u0018\u0007 \u0003(\u000b2\u0016.HomeBlockSubFieldDataB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HomeBlockFieldDataOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { HomeBlockSubFieldDataOuterClass.getDescriptor(), VectorOuterClass.getDescriptor() });
        internal_static_HomeBlockFieldData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeBlockFieldData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(HomeBlockFieldDataOuterClass.internal_static_HomeBlockFieldData_descriptor, new String[] { "Rot", "Pos", "Guid", "FurnitureId", "SubFieldList" });
        HomeBlockSubFieldDataOuterClass.getDescriptor();
        VectorOuterClass.getDescriptor();
    }
    
    public static final class HomeBlockFieldData extends GeneratedMessageV3 implements HomeBlockFieldDataOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ROT_FIELD_NUMBER = 15;
        private VectorOuterClass.Vector rot_;
        public static final int POS_FIELD_NUMBER = 4;
        private VectorOuterClass.Vector pos_;
        public static final int GUID_FIELD_NUMBER = 9;
        private int guid_;
        public static final int FURNITURE_ID_FIELD_NUMBER = 1;
        private int furnitureId_;
        public static final int SUB_FIELD_LIST_FIELD_NUMBER = 7;
        private List<HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData> subFieldList_;
        private byte memoizedIsInitialized;
        private static final HomeBlockFieldData DEFAULT_INSTANCE;
        private static final Parser<HomeBlockFieldData> PARSER;
        
        private HomeBlockFieldData(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private HomeBlockFieldData() {
            this.memoizedIsInitialized = -1;
            this.subFieldList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new HomeBlockFieldData();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private HomeBlockFieldData(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 8: {
                            this.furnitureId_ = input.readUInt32();
                            continue;
                        }
                        case 34: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.pos_ != null) {
                                subBuilder = this.pos_.toBuilder();
                            }
                            this.pos_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.pos_);
                                this.pos_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 58: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.subFieldList_ = new ArrayList<HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.subFieldList_.add(input.readMessage(HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData.parser(), extensionRegistry));
                            continue;
                        }
                        case 72: {
                            this.guid_ = input.readUInt32();
                            continue;
                        }
                        case 122: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.rot_ != null) {
                                subBuilder = this.rot_.toBuilder();
                            }
                            this.rot_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.rot_);
                                this.rot_ = subBuilder.buildPartial();
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
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.subFieldList_ = Collections.unmodifiableList((List<? extends HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData>)this.subFieldList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return HomeBlockFieldDataOuterClass.internal_static_HomeBlockFieldData_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HomeBlockFieldDataOuterClass.internal_static_HomeBlockFieldData_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeBlockFieldData.class, Builder.class);
        }
        
        @Override
        public boolean hasRot() {
            return this.rot_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getRot() {
            return (this.rot_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.rot_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
            return this.getRot();
        }
        
        @Override
        public boolean hasPos() {
            return this.pos_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getPos() {
            return (this.pos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.pos_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
            return this.getPos();
        }
        
        @Override
        public int getGuid() {
            return this.guid_;
        }
        
        @Override
        public int getFurnitureId() {
            return this.furnitureId_;
        }
        
        @Override
        public List<HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData> getSubFieldListList() {
            return this.subFieldList_;
        }
        
        @Override
        public List<? extends HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldDataOrBuilder> getSubFieldListOrBuilderList() {
            return this.subFieldList_;
        }
        
        @Override
        public int getSubFieldListCount() {
            return this.subFieldList_.size();
        }
        
        @Override
        public HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData getSubFieldList(final int index) {
            return this.subFieldList_.get(index);
        }
        
        @Override
        public HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldDataOrBuilder getSubFieldListOrBuilder(final int index) {
            return this.subFieldList_.get(index);
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
            if (this.furnitureId_ != 0) {
                output.writeUInt32(1, this.furnitureId_);
            }
            if (this.pos_ != null) {
                output.writeMessage(4, this.getPos());
            }
            for (int i = 0; i < this.subFieldList_.size(); ++i) {
                output.writeMessage(7, this.subFieldList_.get(i));
            }
            if (this.guid_ != 0) {
                output.writeUInt32(9, this.guid_);
            }
            if (this.rot_ != null) {
                output.writeMessage(15, this.getRot());
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
            if (this.furnitureId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.furnitureId_);
            }
            if (this.pos_ != null) {
                size += CodedOutputStream.computeMessageSize(4, this.getPos());
            }
            for (int i = 0; i < this.subFieldList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(7, this.subFieldList_.get(i));
            }
            if (this.guid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.guid_);
            }
            if (this.rot_ != null) {
                size += CodedOutputStream.computeMessageSize(15, this.getRot());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomeBlockFieldData)) {
                return super.equals(obj);
            }
            final HomeBlockFieldData other = (HomeBlockFieldData)obj;
            return this.hasRot() == other.hasRot() && (!this.hasRot() || this.getRot().equals(other.getRot())) && this.hasPos() == other.hasPos() && (!this.hasPos() || this.getPos().equals(other.getPos())) && this.getGuid() == other.getGuid() && this.getFurnitureId() == other.getFurnitureId() && this.getSubFieldListList().equals(other.getSubFieldListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasRot()) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getRot().hashCode();
            }
            if (this.hasPos()) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getPos().hashCode();
            }
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getGuid();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getFurnitureId();
            if (this.getSubFieldListCount() > 0) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.getSubFieldListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static HomeBlockFieldData parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return HomeBlockFieldData.PARSER.parseFrom(data);
        }
        
        public static HomeBlockFieldData parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeBlockFieldData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeBlockFieldData parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return HomeBlockFieldData.PARSER.parseFrom(data);
        }
        
        public static HomeBlockFieldData parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeBlockFieldData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeBlockFieldData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return HomeBlockFieldData.PARSER.parseFrom(data);
        }
        
        public static HomeBlockFieldData parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeBlockFieldData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeBlockFieldData parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeBlockFieldData.PARSER, input);
        }
        
        public static HomeBlockFieldData parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeBlockFieldData.PARSER, input, extensionRegistry);
        }
        
        public static HomeBlockFieldData parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeBlockFieldData.PARSER, input);
        }
        
        public static HomeBlockFieldData parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeBlockFieldData.PARSER, input, extensionRegistry);
        }
        
        public static HomeBlockFieldData parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeBlockFieldData.PARSER, input);
        }
        
        public static HomeBlockFieldData parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeBlockFieldData.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return HomeBlockFieldData.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final HomeBlockFieldData prototype) {
            return HomeBlockFieldData.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == HomeBlockFieldData.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static HomeBlockFieldData getDefaultInstance() {
            return HomeBlockFieldData.DEFAULT_INSTANCE;
        }
        
        public static Parser<HomeBlockFieldData> parser() {
            return HomeBlockFieldData.PARSER;
        }
        
        @Override
        public Parser<HomeBlockFieldData> getParserForType() {
            return HomeBlockFieldData.PARSER;
        }
        
        @Override
        public HomeBlockFieldData getDefaultInstanceForType() {
            return HomeBlockFieldData.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new HomeBlockFieldData();
            PARSER = new AbstractParser<HomeBlockFieldData>() {
                @Override
                public HomeBlockFieldData parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new HomeBlockFieldData(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HomeBlockFieldDataOrBuilder
        {
            private int bitField0_;
            private VectorOuterClass.Vector rot_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> rotBuilder_;
            private VectorOuterClass.Vector pos_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> posBuilder_;
            private int guid_;
            private int furnitureId_;
            private List<HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData> subFieldList_;
            private RepeatedFieldBuilderV3<HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData, HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData.Builder, HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldDataOrBuilder> subFieldListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return HomeBlockFieldDataOuterClass.internal_static_HomeBlockFieldData_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HomeBlockFieldDataOuterClass.internal_static_HomeBlockFieldData_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeBlockFieldData.class, Builder.class);
            }
            
            private Builder() {
                this.subFieldList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.subFieldList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (HomeBlockFieldData.alwaysUseFieldBuilders) {
                    this.getSubFieldListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.rotBuilder_ == null) {
                    this.rot_ = null;
                }
                else {
                    this.rot_ = null;
                    this.rotBuilder_ = null;
                }
                if (this.posBuilder_ == null) {
                    this.pos_ = null;
                }
                else {
                    this.pos_ = null;
                    this.posBuilder_ = null;
                }
                this.guid_ = 0;
                this.furnitureId_ = 0;
                if (this.subFieldListBuilder_ == null) {
                    this.subFieldList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.subFieldListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return HomeBlockFieldDataOuterClass.internal_static_HomeBlockFieldData_descriptor;
            }
            
            @Override
            public HomeBlockFieldData getDefaultInstanceForType() {
                return HomeBlockFieldData.getDefaultInstance();
            }
            
            @Override
            public HomeBlockFieldData build() {
                final HomeBlockFieldData result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public HomeBlockFieldData buildPartial() {
                final HomeBlockFieldData result = new HomeBlockFieldData(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.rotBuilder_ == null) {
                    result.rot_ = this.rot_;
                }
                else {
                    result.rot_ = this.rotBuilder_.build();
                }
                if (this.posBuilder_ == null) {
                    result.pos_ = this.pos_;
                }
                else {
                    result.pos_ = this.posBuilder_.build();
                }
                result.guid_ = this.guid_;
                result.furnitureId_ = this.furnitureId_;
                if (this.subFieldListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.subFieldList_ = Collections.unmodifiableList((List<? extends HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData>)this.subFieldList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.subFieldList_ = this.subFieldList_;
                }
                else {
                    result.subFieldList_ = this.subFieldListBuilder_.build();
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
                if (other instanceof HomeBlockFieldData) {
                    return this.mergeFrom((HomeBlockFieldData)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final HomeBlockFieldData other) {
                if (other == HomeBlockFieldData.getDefaultInstance()) {
                    return this;
                }
                if (other.hasRot()) {
                    this.mergeRot(other.getRot());
                }
                if (other.hasPos()) {
                    this.mergePos(other.getPos());
                }
                if (other.getGuid() != 0) {
                    this.setGuid(other.getGuid());
                }
                if (other.getFurnitureId() != 0) {
                    this.setFurnitureId(other.getFurnitureId());
                }
                if (this.subFieldListBuilder_ == null) {
                    if (!other.subFieldList_.isEmpty()) {
                        if (this.subFieldList_.isEmpty()) {
                            this.subFieldList_ = other.subFieldList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureSubFieldListIsMutable();
                            this.subFieldList_.addAll(other.subFieldList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.subFieldList_.isEmpty()) {
                    if (this.subFieldListBuilder_.isEmpty()) {
                        this.subFieldListBuilder_.dispose();
                        this.subFieldListBuilder_ = null;
                        this.subFieldList_ = other.subFieldList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.subFieldListBuilder_ = (HomeBlockFieldData.alwaysUseFieldBuilders ? this.getSubFieldListFieldBuilder() : null);
                    }
                    else {
                        this.subFieldListBuilder_.addAllMessages(other.subFieldList_);
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
                HomeBlockFieldData parsedMessage = null;
                try {
                    parsedMessage = HomeBlockFieldData.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (HomeBlockFieldData)e.getUnfinishedMessage();
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
            public boolean hasRot() {
                return this.rotBuilder_ != null || this.rot_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getRot() {
                if (this.rotBuilder_ == null) {
                    return (this.rot_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.rot_;
                }
                return this.rotBuilder_.getMessage();
            }
            
            public Builder setRot(final VectorOuterClass.Vector value) {
                if (this.rotBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.rot_ = value;
                    this.onChanged();
                }
                else {
                    this.rotBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setRot(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.rotBuilder_ == null) {
                    this.rot_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.rotBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeRot(final VectorOuterClass.Vector value) {
                if (this.rotBuilder_ == null) {
                    if (this.rot_ != null) {
                        this.rot_ = VectorOuterClass.Vector.newBuilder(this.rot_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.rot_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.rotBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearRot() {
                if (this.rotBuilder_ == null) {
                    this.rot_ = null;
                    this.onChanged();
                }
                else {
                    this.rot_ = null;
                    this.rotBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getRotBuilder() {
                this.onChanged();
                return this.getRotFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
                if (this.rotBuilder_ != null) {
                    return this.rotBuilder_.getMessageOrBuilder();
                }
                return (this.rot_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.rot_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getRotFieldBuilder() {
                if (this.rotBuilder_ == null) {
                    this.rotBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getRot(), this.getParentForChildren(), this.isClean());
                    this.rot_ = null;
                }
                return this.rotBuilder_;
            }
            
            @Override
            public boolean hasPos() {
                return this.posBuilder_ != null || this.pos_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getPos() {
                if (this.posBuilder_ == null) {
                    return (this.pos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.pos_;
                }
                return this.posBuilder_.getMessage();
            }
            
            public Builder setPos(final VectorOuterClass.Vector value) {
                if (this.posBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.pos_ = value;
                    this.onChanged();
                }
                else {
                    this.posBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setPos(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.posBuilder_ == null) {
                    this.pos_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.posBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergePos(final VectorOuterClass.Vector value) {
                if (this.posBuilder_ == null) {
                    if (this.pos_ != null) {
                        this.pos_ = VectorOuterClass.Vector.newBuilder(this.pos_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.pos_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.posBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearPos() {
                if (this.posBuilder_ == null) {
                    this.pos_ = null;
                    this.onChanged();
                }
                else {
                    this.pos_ = null;
                    this.posBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getPosBuilder() {
                this.onChanged();
                return this.getPosFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
                if (this.posBuilder_ != null) {
                    return this.posBuilder_.getMessageOrBuilder();
                }
                return (this.pos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.pos_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getPosFieldBuilder() {
                if (this.posBuilder_ == null) {
                    this.posBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getPos(), this.getParentForChildren(), this.isClean());
                    this.pos_ = null;
                }
                return this.posBuilder_;
            }
            
            @Override
            public int getGuid() {
                return this.guid_;
            }
            
            public Builder setGuid(final int value) {
                this.guid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGuid() {
                this.guid_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getFurnitureId() {
                return this.furnitureId_;
            }
            
            public Builder setFurnitureId(final int value) {
                this.furnitureId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFurnitureId() {
                this.furnitureId_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureSubFieldListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.subFieldList_ = new ArrayList<HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData>(this.subFieldList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData> getSubFieldListList() {
                if (this.subFieldListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData>)this.subFieldList_);
                }
                return this.subFieldListBuilder_.getMessageList();
            }
            
            @Override
            public int getSubFieldListCount() {
                if (this.subFieldListBuilder_ == null) {
                    return this.subFieldList_.size();
                }
                return this.subFieldListBuilder_.getCount();
            }
            
            @Override
            public HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData getSubFieldList(final int index) {
                if (this.subFieldListBuilder_ == null) {
                    return this.subFieldList_.get(index);
                }
                return this.subFieldListBuilder_.getMessage(index);
            }
            
            public Builder setSubFieldList(final int index, final HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData value) {
                if (this.subFieldListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureSubFieldListIsMutable();
                    this.subFieldList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.subFieldListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setSubFieldList(final int index, final HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData.Builder builderForValue) {
                if (this.subFieldListBuilder_ == null) {
                    this.ensureSubFieldListIsMutable();
                    this.subFieldList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.subFieldListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addSubFieldList(final HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData value) {
                if (this.subFieldListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureSubFieldListIsMutable();
                    this.subFieldList_.add(value);
                    this.onChanged();
                }
                else {
                    this.subFieldListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addSubFieldList(final int index, final HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData value) {
                if (this.subFieldListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureSubFieldListIsMutable();
                    this.subFieldList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.subFieldListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addSubFieldList(final HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData.Builder builderForValue) {
                if (this.subFieldListBuilder_ == null) {
                    this.ensureSubFieldListIsMutable();
                    this.subFieldList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.subFieldListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addSubFieldList(final int index, final HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData.Builder builderForValue) {
                if (this.subFieldListBuilder_ == null) {
                    this.ensureSubFieldListIsMutable();
                    this.subFieldList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.subFieldListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllSubFieldList(final Iterable<? extends HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData> values) {
                if (this.subFieldListBuilder_ == null) {
                    this.ensureSubFieldListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.subFieldList_);
                    this.onChanged();
                }
                else {
                    this.subFieldListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearSubFieldList() {
                if (this.subFieldListBuilder_ == null) {
                    this.subFieldList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.subFieldListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeSubFieldList(final int index) {
                if (this.subFieldListBuilder_ == null) {
                    this.ensureSubFieldListIsMutable();
                    this.subFieldList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.subFieldListBuilder_.remove(index);
                }
                return this;
            }
            
            public HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData.Builder getSubFieldListBuilder(final int index) {
                return this.getSubFieldListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldDataOrBuilder getSubFieldListOrBuilder(final int index) {
                if (this.subFieldListBuilder_ == null) {
                    return this.subFieldList_.get(index);
                }
                return this.subFieldListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldDataOrBuilder> getSubFieldListOrBuilderList() {
                if (this.subFieldListBuilder_ != null) {
                    return this.subFieldListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldDataOrBuilder>)this.subFieldList_);
            }
            
            public HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData.Builder addSubFieldListBuilder() {
                return this.getSubFieldListFieldBuilder().addBuilder(HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData.getDefaultInstance());
            }
            
            public HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData.Builder addSubFieldListBuilder(final int index) {
                return this.getSubFieldListFieldBuilder().addBuilder(index, HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData.getDefaultInstance());
            }
            
            public List<HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData.Builder> getSubFieldListBuilderList() {
                return this.getSubFieldListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData, HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData.Builder, HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldDataOrBuilder> getSubFieldListFieldBuilder() {
                if (this.subFieldListBuilder_ == null) {
                    this.subFieldListBuilder_ = new RepeatedFieldBuilderV3<HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData, HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData.Builder, HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldDataOrBuilder>(this.subFieldList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.subFieldList_ = null;
                }
                return this.subFieldListBuilder_;
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
    
    public interface HomeBlockFieldDataOrBuilder extends MessageOrBuilder
    {
        boolean hasRot();
        
        VectorOuterClass.Vector getRot();
        
        VectorOuterClass.VectorOrBuilder getRotOrBuilder();
        
        boolean hasPos();
        
        VectorOuterClass.Vector getPos();
        
        VectorOuterClass.VectorOrBuilder getPosOrBuilder();
        
        int getGuid();
        
        int getFurnitureId();
        
        List<HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData> getSubFieldListList();
        
        HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData getSubFieldList(final int p0);
        
        int getSubFieldListCount();
        
        List<? extends HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldDataOrBuilder> getSubFieldListOrBuilderList();
        
        HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldDataOrBuilder getSubFieldListOrBuilder(final int p0);
    }
}
