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
import com.google.protobuf.Internal;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class GetSceneAreaRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_GetSceneAreaRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GetSceneAreaRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GetSceneAreaRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GetSceneAreaRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015GetSceneAreaRsp.proto\u001a\u000eCityInfo.proto\"m\n\u000fGetSceneAreaRsp\u0012\u000f\n\u0007retcode\u0018\u0002 \u0001(\u0005\u0012!\n\u000ecity_info_list\u0018\u000f \u0003(\u000b2\t.CityInfo\u0012\u0010\n\bscene_id\u0018\u0004 \u0001(\r\u0012\u0014\n\farea_id_list\u0018\r \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GetSceneAreaRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { CityInfoOuterClass.getDescriptor() });
        internal_static_GetSceneAreaRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetSceneAreaRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GetSceneAreaRspOuterClass.internal_static_GetSceneAreaRsp_descriptor, new String[] { "Retcode", "CityInfoList", "SceneId", "AreaIdList" });
        CityInfoOuterClass.getDescriptor();
    }
    
    public static final class GetSceneAreaRsp extends GeneratedMessageV3 implements GetSceneAreaRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 2;
        private int retcode_;
        public static final int CITY_INFO_LIST_FIELD_NUMBER = 15;
        private List<CityInfoOuterClass.CityInfo> cityInfoList_;
        public static final int SCENE_ID_FIELD_NUMBER = 4;
        private int sceneId_;
        public static final int AREA_ID_LIST_FIELD_NUMBER = 13;
        private Internal.IntList areaIdList_;
        private int areaIdListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final GetSceneAreaRsp DEFAULT_INSTANCE;
        private static final Parser<GetSceneAreaRsp> PARSER;
        
        private GetSceneAreaRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.areaIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private GetSceneAreaRsp() {
            this.areaIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.cityInfoList_ = Collections.emptyList();
            this.areaIdList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GetSceneAreaRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GetSceneAreaRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 32: {
                            this.sceneId_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.areaIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.areaIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 106: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.areaIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.areaIdList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 122: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.cityInfoList_ = new ArrayList<CityInfoOuterClass.CityInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.cityInfoList_.add(input.readMessage(CityInfoOuterClass.CityInfo.parser(), extensionRegistry));
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
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.areaIdList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.cityInfoList_ = Collections.unmodifiableList((List<? extends CityInfoOuterClass.CityInfo>)this.cityInfoList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return GetSceneAreaRspOuterClass.internal_static_GetSceneAreaRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GetSceneAreaRspOuterClass.internal_static_GetSceneAreaRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetSceneAreaRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public List<CityInfoOuterClass.CityInfo> getCityInfoListList() {
            return this.cityInfoList_;
        }
        
        @Override
        public List<? extends CityInfoOuterClass.CityInfoOrBuilder> getCityInfoListOrBuilderList() {
            return this.cityInfoList_;
        }
        
        @Override
        public int getCityInfoListCount() {
            return this.cityInfoList_.size();
        }
        
        @Override
        public CityInfoOuterClass.CityInfo getCityInfoList(final int index) {
            return this.cityInfoList_.get(index);
        }
        
        @Override
        public CityInfoOuterClass.CityInfoOrBuilder getCityInfoListOrBuilder(final int index) {
            return this.cityInfoList_.get(index);
        }
        
        @Override
        public int getSceneId() {
            return this.sceneId_;
        }
        
        @Override
        public List<Integer> getAreaIdListList() {
            return this.areaIdList_;
        }
        
        @Override
        public int getAreaIdListCount() {
            return this.areaIdList_.size();
        }
        
        @Override
        public int getAreaIdList(final int index) {
            return this.areaIdList_.getInt(index);
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
            this.getSerializedSize();
            if (this.retcode_ != 0) {
                output.writeInt32(2, this.retcode_);
            }
            if (this.sceneId_ != 0) {
                output.writeUInt32(4, this.sceneId_);
            }
            if (this.getAreaIdListList().size() > 0) {
                output.writeUInt32NoTag(106);
                output.writeUInt32NoTag(this.areaIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.areaIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.areaIdList_.getInt(i));
            }
            for (int i = 0; i < this.cityInfoList_.size(); ++i) {
                output.writeMessage(15, this.cityInfoList_.get(i));
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
                size += CodedOutputStream.computeInt32Size(2, this.retcode_);
            }
            if (this.sceneId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.sceneId_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.areaIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.areaIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getAreaIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.areaIdListMemoizedSerializedSize = dataSize;
            for (int j = 0; j < this.cityInfoList_.size(); ++j) {
                size += CodedOutputStream.computeMessageSize(15, this.cityInfoList_.get(j));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetSceneAreaRsp)) {
                return super.equals(obj);
            }
            final GetSceneAreaRsp other = (GetSceneAreaRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.getCityInfoListList().equals(other.getCityInfoListList()) && this.getSceneId() == other.getSceneId() && this.getAreaIdListList().equals(other.getAreaIdListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getRetcode();
            if (this.getCityInfoListCount() > 0) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getCityInfoListList().hashCode();
            }
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getSceneId();
            if (this.getAreaIdListCount() > 0) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.getAreaIdListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GetSceneAreaRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GetSceneAreaRsp.PARSER.parseFrom(data);
        }
        
        public static GetSceneAreaRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetSceneAreaRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetSceneAreaRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GetSceneAreaRsp.PARSER.parseFrom(data);
        }
        
        public static GetSceneAreaRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetSceneAreaRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetSceneAreaRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GetSceneAreaRsp.PARSER.parseFrom(data);
        }
        
        public static GetSceneAreaRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetSceneAreaRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetSceneAreaRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetSceneAreaRsp.PARSER, input);
        }
        
        public static GetSceneAreaRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetSceneAreaRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetSceneAreaRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetSceneAreaRsp.PARSER, input);
        }
        
        public static GetSceneAreaRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetSceneAreaRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetSceneAreaRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetSceneAreaRsp.PARSER, input);
        }
        
        public static GetSceneAreaRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetSceneAreaRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GetSceneAreaRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GetSceneAreaRsp prototype) {
            return GetSceneAreaRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GetSceneAreaRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GetSceneAreaRsp getDefaultInstance() {
            return GetSceneAreaRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<GetSceneAreaRsp> parser() {
            return GetSceneAreaRsp.PARSER;
        }
        
        @Override
        public Parser<GetSceneAreaRsp> getParserForType() {
            return GetSceneAreaRsp.PARSER;
        }
        
        @Override
        public GetSceneAreaRsp getDefaultInstanceForType() {
            return GetSceneAreaRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GetSceneAreaRsp();
            PARSER = new AbstractParser<GetSceneAreaRsp>() {
                @Override
                public GetSceneAreaRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GetSceneAreaRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetSceneAreaRspOrBuilder
        {
            private int bitField0_;
            private int retcode_;
            private List<CityInfoOuterClass.CityInfo> cityInfoList_;
            private RepeatedFieldBuilderV3<CityInfoOuterClass.CityInfo, CityInfoOuterClass.CityInfo.Builder, CityInfoOuterClass.CityInfoOrBuilder> cityInfoListBuilder_;
            private int sceneId_;
            private Internal.IntList areaIdList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GetSceneAreaRspOuterClass.internal_static_GetSceneAreaRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GetSceneAreaRspOuterClass.internal_static_GetSceneAreaRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetSceneAreaRsp.class, Builder.class);
            }
            
            private Builder() {
                this.cityInfoList_ = Collections.emptyList();
                this.areaIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.cityInfoList_ = Collections.emptyList();
                this.areaIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GetSceneAreaRsp.alwaysUseFieldBuilders) {
                    this.getCityInfoListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                if (this.cityInfoListBuilder_ == null) {
                    this.cityInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.cityInfoListBuilder_.clear();
                }
                this.sceneId_ = 0;
                this.areaIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GetSceneAreaRspOuterClass.internal_static_GetSceneAreaRsp_descriptor;
            }
            
            @Override
            public GetSceneAreaRsp getDefaultInstanceForType() {
                return GetSceneAreaRsp.getDefaultInstance();
            }
            
            @Override
            public GetSceneAreaRsp build() {
                final GetSceneAreaRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GetSceneAreaRsp buildPartial() {
                final GetSceneAreaRsp result = new GetSceneAreaRsp(this);
                final int from_bitField0_ = this.bitField0_;
                result.retcode_ = this.retcode_;
                if (this.cityInfoListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.cityInfoList_ = Collections.unmodifiableList((List<? extends CityInfoOuterClass.CityInfo>)this.cityInfoList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.cityInfoList_ = this.cityInfoList_;
                }
                else {
                    result.cityInfoList_ = this.cityInfoListBuilder_.build();
                }
                result.sceneId_ = this.sceneId_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.areaIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.areaIdList_ = this.areaIdList_;
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
                if (other instanceof GetSceneAreaRsp) {
                    return this.mergeFrom((GetSceneAreaRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GetSceneAreaRsp other) {
                if (other == GetSceneAreaRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (this.cityInfoListBuilder_ == null) {
                    if (!other.cityInfoList_.isEmpty()) {
                        if (this.cityInfoList_.isEmpty()) {
                            this.cityInfoList_ = other.cityInfoList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureCityInfoListIsMutable();
                            this.cityInfoList_.addAll(other.cityInfoList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.cityInfoList_.isEmpty()) {
                    if (this.cityInfoListBuilder_.isEmpty()) {
                        this.cityInfoListBuilder_.dispose();
                        this.cityInfoListBuilder_ = null;
                        this.cityInfoList_ = other.cityInfoList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.cityInfoListBuilder_ = (GetSceneAreaRsp.alwaysUseFieldBuilders ? this.getCityInfoListFieldBuilder() : null);
                    }
                    else {
                        this.cityInfoListBuilder_.addAllMessages(other.cityInfoList_);
                    }
                }
                if (other.getSceneId() != 0) {
                    this.setSceneId(other.getSceneId());
                }
                if (!other.areaIdList_.isEmpty()) {
                    if (this.areaIdList_.isEmpty()) {
                        this.areaIdList_ = other.areaIdList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureAreaIdListIsMutable();
                        this.areaIdList_.addAll(other.areaIdList_);
                    }
                    this.onChanged();
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
                GetSceneAreaRsp parsedMessage = null;
                try {
                    parsedMessage = GetSceneAreaRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GetSceneAreaRsp)e.getUnfinishedMessage();
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
            
            private void ensureCityInfoListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.cityInfoList_ = new ArrayList<CityInfoOuterClass.CityInfo>(this.cityInfoList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<CityInfoOuterClass.CityInfo> getCityInfoListList() {
                if (this.cityInfoListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends CityInfoOuterClass.CityInfo>)this.cityInfoList_);
                }
                return this.cityInfoListBuilder_.getMessageList();
            }
            
            @Override
            public int getCityInfoListCount() {
                if (this.cityInfoListBuilder_ == null) {
                    return this.cityInfoList_.size();
                }
                return this.cityInfoListBuilder_.getCount();
            }
            
            @Override
            public CityInfoOuterClass.CityInfo getCityInfoList(final int index) {
                if (this.cityInfoListBuilder_ == null) {
                    return this.cityInfoList_.get(index);
                }
                return this.cityInfoListBuilder_.getMessage(index);
            }
            
            public Builder setCityInfoList(final int index, final CityInfoOuterClass.CityInfo value) {
                if (this.cityInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureCityInfoListIsMutable();
                    this.cityInfoList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.cityInfoListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setCityInfoList(final int index, final CityInfoOuterClass.CityInfo.Builder builderForValue) {
                if (this.cityInfoListBuilder_ == null) {
                    this.ensureCityInfoListIsMutable();
                    this.cityInfoList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.cityInfoListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addCityInfoList(final CityInfoOuterClass.CityInfo value) {
                if (this.cityInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureCityInfoListIsMutable();
                    this.cityInfoList_.add(value);
                    this.onChanged();
                }
                else {
                    this.cityInfoListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addCityInfoList(final int index, final CityInfoOuterClass.CityInfo value) {
                if (this.cityInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureCityInfoListIsMutable();
                    this.cityInfoList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.cityInfoListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addCityInfoList(final CityInfoOuterClass.CityInfo.Builder builderForValue) {
                if (this.cityInfoListBuilder_ == null) {
                    this.ensureCityInfoListIsMutable();
                    this.cityInfoList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.cityInfoListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addCityInfoList(final int index, final CityInfoOuterClass.CityInfo.Builder builderForValue) {
                if (this.cityInfoListBuilder_ == null) {
                    this.ensureCityInfoListIsMutable();
                    this.cityInfoList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.cityInfoListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllCityInfoList(final Iterable<? extends CityInfoOuterClass.CityInfo> values) {
                if (this.cityInfoListBuilder_ == null) {
                    this.ensureCityInfoListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.cityInfoList_);
                    this.onChanged();
                }
                else {
                    this.cityInfoListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearCityInfoList() {
                if (this.cityInfoListBuilder_ == null) {
                    this.cityInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.cityInfoListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeCityInfoList(final int index) {
                if (this.cityInfoListBuilder_ == null) {
                    this.ensureCityInfoListIsMutable();
                    this.cityInfoList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.cityInfoListBuilder_.remove(index);
                }
                return this;
            }
            
            public CityInfoOuterClass.CityInfo.Builder getCityInfoListBuilder(final int index) {
                return this.getCityInfoListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public CityInfoOuterClass.CityInfoOrBuilder getCityInfoListOrBuilder(final int index) {
                if (this.cityInfoListBuilder_ == null) {
                    return this.cityInfoList_.get(index);
                }
                return this.cityInfoListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends CityInfoOuterClass.CityInfoOrBuilder> getCityInfoListOrBuilderList() {
                if (this.cityInfoListBuilder_ != null) {
                    return this.cityInfoListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends CityInfoOuterClass.CityInfoOrBuilder>)this.cityInfoList_);
            }
            
            public CityInfoOuterClass.CityInfo.Builder addCityInfoListBuilder() {
                return this.getCityInfoListFieldBuilder().addBuilder(CityInfoOuterClass.CityInfo.getDefaultInstance());
            }
            
            public CityInfoOuterClass.CityInfo.Builder addCityInfoListBuilder(final int index) {
                return this.getCityInfoListFieldBuilder().addBuilder(index, CityInfoOuterClass.CityInfo.getDefaultInstance());
            }
            
            public List<CityInfoOuterClass.CityInfo.Builder> getCityInfoListBuilderList() {
                return this.getCityInfoListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<CityInfoOuterClass.CityInfo, CityInfoOuterClass.CityInfo.Builder, CityInfoOuterClass.CityInfoOrBuilder> getCityInfoListFieldBuilder() {
                if (this.cityInfoListBuilder_ == null) {
                    this.cityInfoListBuilder_ = new RepeatedFieldBuilderV3<CityInfoOuterClass.CityInfo, CityInfoOuterClass.CityInfo.Builder, CityInfoOuterClass.CityInfoOrBuilder>(this.cityInfoList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.cityInfoList_ = null;
                }
                return this.cityInfoListBuilder_;
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
            
            private void ensureAreaIdListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.areaIdList_ = GeneratedMessageV3.mutableCopy(this.areaIdList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getAreaIdListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.areaIdList_) : this.areaIdList_;
            }
            
            @Override
            public int getAreaIdListCount() {
                return this.areaIdList_.size();
            }
            
            @Override
            public int getAreaIdList(final int index) {
                return this.areaIdList_.getInt(index);
            }
            
            public Builder setAreaIdList(final int index, final int value) {
                this.ensureAreaIdListIsMutable();
                this.areaIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addAreaIdList(final int value) {
                this.ensureAreaIdListIsMutable();
                this.areaIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllAreaIdList(final Iterable<? extends Integer> values) {
                this.ensureAreaIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.areaIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearAreaIdList() {
                this.areaIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
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
    
    public interface GetSceneAreaRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        List<CityInfoOuterClass.CityInfo> getCityInfoListList();
        
        CityInfoOuterClass.CityInfo getCityInfoList(final int p0);
        
        int getCityInfoListCount();
        
        List<? extends CityInfoOuterClass.CityInfoOrBuilder> getCityInfoListOrBuilderList();
        
        CityInfoOuterClass.CityInfoOrBuilder getCityInfoListOrBuilder(final int p0);
        
        int getSceneId();
        
        List<Integer> getAreaIdListList();
        
        int getAreaIdListCount();
        
        int getAreaIdList(final int p0);
    }
}
