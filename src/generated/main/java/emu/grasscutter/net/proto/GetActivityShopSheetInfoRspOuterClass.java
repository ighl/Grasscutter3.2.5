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

public final class GetActivityShopSheetInfoRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_GetActivityShopSheetInfoRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GetActivityShopSheetInfoRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GetActivityShopSheetInfoRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GetActivityShopSheetInfoRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n!GetActivityShopSheetInfoRsp.proto\u001a\u001bActivityShopSheetInfo.proto\"r\n\u001bGetActivityShopSheetInfoRsp\u0012/\n\u000fsheet_info_list\u0018\u0006 \u0003(\u000b2\u0016.ActivityShopSheetInfo\u0012\u0011\n\tshop_type\u0018\b \u0001(\r\u0012\u000f\n\u0007retcode\u0018\r \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GetActivityShopSheetInfoRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ActivityShopSheetInfoOuterClass.getDescriptor() });
        internal_static_GetActivityShopSheetInfoRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetActivityShopSheetInfoRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GetActivityShopSheetInfoRspOuterClass.internal_static_GetActivityShopSheetInfoRsp_descriptor, new String[] { "SheetInfoList", "ShopType", "Retcode" });
        ActivityShopSheetInfoOuterClass.getDescriptor();
    }
    
    public static final class GetActivityShopSheetInfoRsp extends GeneratedMessageV3 implements GetActivityShopSheetInfoRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SHEET_INFO_LIST_FIELD_NUMBER = 6;
        private List<ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo> sheetInfoList_;
        public static final int SHOP_TYPE_FIELD_NUMBER = 8;
        private int shopType_;
        public static final int RETCODE_FIELD_NUMBER = 13;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final GetActivityShopSheetInfoRsp DEFAULT_INSTANCE;
        private static final Parser<GetActivityShopSheetInfoRsp> PARSER;
        
        private GetActivityShopSheetInfoRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private GetActivityShopSheetInfoRsp() {
            this.memoizedIsInitialized = -1;
            this.sheetInfoList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GetActivityShopSheetInfoRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GetActivityShopSheetInfoRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.sheetInfoList_ = new ArrayList<ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.sheetInfoList_.add(input.readMessage(ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.parser(), extensionRegistry));
                            continue;
                        }
                        case 64: {
                            this.shopType_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.retcode_ = input.readInt32();
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
                    this.sheetInfoList_ = Collections.unmodifiableList((List<? extends ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo>)this.sheetInfoList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return GetActivityShopSheetInfoRspOuterClass.internal_static_GetActivityShopSheetInfoRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GetActivityShopSheetInfoRspOuterClass.internal_static_GetActivityShopSheetInfoRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetActivityShopSheetInfoRsp.class, Builder.class);
        }
        
        @Override
        public List<ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo> getSheetInfoListList() {
            return this.sheetInfoList_;
        }
        
        @Override
        public List<? extends ActivityShopSheetInfoOuterClass.ActivityShopSheetInfoOrBuilder> getSheetInfoListOrBuilderList() {
            return this.sheetInfoList_;
        }
        
        @Override
        public int getSheetInfoListCount() {
            return this.sheetInfoList_.size();
        }
        
        @Override
        public ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo getSheetInfoList(final int index) {
            return this.sheetInfoList_.get(index);
        }
        
        @Override
        public ActivityShopSheetInfoOuterClass.ActivityShopSheetInfoOrBuilder getSheetInfoListOrBuilder(final int index) {
            return this.sheetInfoList_.get(index);
        }
        
        @Override
        public int getShopType() {
            return this.shopType_;
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
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
            for (int i = 0; i < this.sheetInfoList_.size(); ++i) {
                output.writeMessage(6, this.sheetInfoList_.get(i));
            }
            if (this.shopType_ != 0) {
                output.writeUInt32(8, this.shopType_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(13, this.retcode_);
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
            for (int i = 0; i < this.sheetInfoList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(6, this.sheetInfoList_.get(i));
            }
            if (this.shopType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.shopType_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(13, this.retcode_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetActivityShopSheetInfoRsp)) {
                return super.equals(obj);
            }
            final GetActivityShopSheetInfoRsp other = (GetActivityShopSheetInfoRsp)obj;
            return this.getSheetInfoListList().equals(other.getSheetInfoListList()) && this.getShopType() == other.getShopType() && this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getSheetInfoListCount() > 0) {
                hash = 37 * hash + 6;
                hash = 53 * hash + this.getSheetInfoListList().hashCode();
            }
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getShopType();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GetActivityShopSheetInfoRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GetActivityShopSheetInfoRsp.PARSER.parseFrom(data);
        }
        
        public static GetActivityShopSheetInfoRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetActivityShopSheetInfoRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetActivityShopSheetInfoRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GetActivityShopSheetInfoRsp.PARSER.parseFrom(data);
        }
        
        public static GetActivityShopSheetInfoRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetActivityShopSheetInfoRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetActivityShopSheetInfoRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GetActivityShopSheetInfoRsp.PARSER.parseFrom(data);
        }
        
        public static GetActivityShopSheetInfoRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetActivityShopSheetInfoRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetActivityShopSheetInfoRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetActivityShopSheetInfoRsp.PARSER, input);
        }
        
        public static GetActivityShopSheetInfoRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetActivityShopSheetInfoRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetActivityShopSheetInfoRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetActivityShopSheetInfoRsp.PARSER, input);
        }
        
        public static GetActivityShopSheetInfoRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetActivityShopSheetInfoRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetActivityShopSheetInfoRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetActivityShopSheetInfoRsp.PARSER, input);
        }
        
        public static GetActivityShopSheetInfoRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetActivityShopSheetInfoRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GetActivityShopSheetInfoRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GetActivityShopSheetInfoRsp prototype) {
            return GetActivityShopSheetInfoRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GetActivityShopSheetInfoRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GetActivityShopSheetInfoRsp getDefaultInstance() {
            return GetActivityShopSheetInfoRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<GetActivityShopSheetInfoRsp> parser() {
            return GetActivityShopSheetInfoRsp.PARSER;
        }
        
        @Override
        public Parser<GetActivityShopSheetInfoRsp> getParserForType() {
            return GetActivityShopSheetInfoRsp.PARSER;
        }
        
        @Override
        public GetActivityShopSheetInfoRsp getDefaultInstanceForType() {
            return GetActivityShopSheetInfoRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GetActivityShopSheetInfoRsp();
            PARSER = new AbstractParser<GetActivityShopSheetInfoRsp>() {
                @Override
                public GetActivityShopSheetInfoRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GetActivityShopSheetInfoRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetActivityShopSheetInfoRspOrBuilder
        {
            private int bitField0_;
            private List<ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo> sheetInfoList_;
            private RepeatedFieldBuilderV3<ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo, ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.Builder, ActivityShopSheetInfoOuterClass.ActivityShopSheetInfoOrBuilder> sheetInfoListBuilder_;
            private int shopType_;
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GetActivityShopSheetInfoRspOuterClass.internal_static_GetActivityShopSheetInfoRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GetActivityShopSheetInfoRspOuterClass.internal_static_GetActivityShopSheetInfoRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetActivityShopSheetInfoRsp.class, Builder.class);
            }
            
            private Builder() {
                this.sheetInfoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.sheetInfoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GetActivityShopSheetInfoRsp.alwaysUseFieldBuilders) {
                    this.getSheetInfoListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.sheetInfoListBuilder_ == null) {
                    this.sheetInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.sheetInfoListBuilder_.clear();
                }
                this.shopType_ = 0;
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GetActivityShopSheetInfoRspOuterClass.internal_static_GetActivityShopSheetInfoRsp_descriptor;
            }
            
            @Override
            public GetActivityShopSheetInfoRsp getDefaultInstanceForType() {
                return GetActivityShopSheetInfoRsp.getDefaultInstance();
            }
            
            @Override
            public GetActivityShopSheetInfoRsp build() {
                final GetActivityShopSheetInfoRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GetActivityShopSheetInfoRsp buildPartial() {
                final GetActivityShopSheetInfoRsp result = new GetActivityShopSheetInfoRsp(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.sheetInfoListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.sheetInfoList_ = Collections.unmodifiableList((List<? extends ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo>)this.sheetInfoList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.sheetInfoList_ = this.sheetInfoList_;
                }
                else {
                    result.sheetInfoList_ = this.sheetInfoListBuilder_.build();
                }
                result.shopType_ = this.shopType_;
                result.retcode_ = this.retcode_;
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
                if (other instanceof GetActivityShopSheetInfoRsp) {
                    return this.mergeFrom((GetActivityShopSheetInfoRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GetActivityShopSheetInfoRsp other) {
                if (other == GetActivityShopSheetInfoRsp.getDefaultInstance()) {
                    return this;
                }
                if (this.sheetInfoListBuilder_ == null) {
                    if (!other.sheetInfoList_.isEmpty()) {
                        if (this.sheetInfoList_.isEmpty()) {
                            this.sheetInfoList_ = other.sheetInfoList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureSheetInfoListIsMutable();
                            this.sheetInfoList_.addAll(other.sheetInfoList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.sheetInfoList_.isEmpty()) {
                    if (this.sheetInfoListBuilder_.isEmpty()) {
                        this.sheetInfoListBuilder_.dispose();
                        this.sheetInfoListBuilder_ = null;
                        this.sheetInfoList_ = other.sheetInfoList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.sheetInfoListBuilder_ = (GetActivityShopSheetInfoRsp.alwaysUseFieldBuilders ? this.getSheetInfoListFieldBuilder() : null);
                    }
                    else {
                        this.sheetInfoListBuilder_.addAllMessages(other.sheetInfoList_);
                    }
                }
                if (other.getShopType() != 0) {
                    this.setShopType(other.getShopType());
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
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
                GetActivityShopSheetInfoRsp parsedMessage = null;
                try {
                    parsedMessage = GetActivityShopSheetInfoRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GetActivityShopSheetInfoRsp)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureSheetInfoListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.sheetInfoList_ = new ArrayList<ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo>(this.sheetInfoList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo> getSheetInfoListList() {
                if (this.sheetInfoListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo>)this.sheetInfoList_);
                }
                return this.sheetInfoListBuilder_.getMessageList();
            }
            
            @Override
            public int getSheetInfoListCount() {
                if (this.sheetInfoListBuilder_ == null) {
                    return this.sheetInfoList_.size();
                }
                return this.sheetInfoListBuilder_.getCount();
            }
            
            @Override
            public ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo getSheetInfoList(final int index) {
                if (this.sheetInfoListBuilder_ == null) {
                    return this.sheetInfoList_.get(index);
                }
                return this.sheetInfoListBuilder_.getMessage(index);
            }
            
            public Builder setSheetInfoList(final int index, final ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo value) {
                if (this.sheetInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureSheetInfoListIsMutable();
                    this.sheetInfoList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.sheetInfoListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setSheetInfoList(final int index, final ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.Builder builderForValue) {
                if (this.sheetInfoListBuilder_ == null) {
                    this.ensureSheetInfoListIsMutable();
                    this.sheetInfoList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.sheetInfoListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addSheetInfoList(final ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo value) {
                if (this.sheetInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureSheetInfoListIsMutable();
                    this.sheetInfoList_.add(value);
                    this.onChanged();
                }
                else {
                    this.sheetInfoListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addSheetInfoList(final int index, final ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo value) {
                if (this.sheetInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureSheetInfoListIsMutable();
                    this.sheetInfoList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.sheetInfoListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addSheetInfoList(final ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.Builder builderForValue) {
                if (this.sheetInfoListBuilder_ == null) {
                    this.ensureSheetInfoListIsMutable();
                    this.sheetInfoList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.sheetInfoListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addSheetInfoList(final int index, final ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.Builder builderForValue) {
                if (this.sheetInfoListBuilder_ == null) {
                    this.ensureSheetInfoListIsMutable();
                    this.sheetInfoList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.sheetInfoListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllSheetInfoList(final Iterable<? extends ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo> values) {
                if (this.sheetInfoListBuilder_ == null) {
                    this.ensureSheetInfoListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.sheetInfoList_);
                    this.onChanged();
                }
                else {
                    this.sheetInfoListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearSheetInfoList() {
                if (this.sheetInfoListBuilder_ == null) {
                    this.sheetInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.sheetInfoListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeSheetInfoList(final int index) {
                if (this.sheetInfoListBuilder_ == null) {
                    this.ensureSheetInfoListIsMutable();
                    this.sheetInfoList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.sheetInfoListBuilder_.remove(index);
                }
                return this;
            }
            
            public ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.Builder getSheetInfoListBuilder(final int index) {
                return this.getSheetInfoListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ActivityShopSheetInfoOuterClass.ActivityShopSheetInfoOrBuilder getSheetInfoListOrBuilder(final int index) {
                if (this.sheetInfoListBuilder_ == null) {
                    return this.sheetInfoList_.get(index);
                }
                return this.sheetInfoListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ActivityShopSheetInfoOuterClass.ActivityShopSheetInfoOrBuilder> getSheetInfoListOrBuilderList() {
                if (this.sheetInfoListBuilder_ != null) {
                    return this.sheetInfoListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ActivityShopSheetInfoOuterClass.ActivityShopSheetInfoOrBuilder>)this.sheetInfoList_);
            }
            
            public ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.Builder addSheetInfoListBuilder() {
                return this.getSheetInfoListFieldBuilder().addBuilder(ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.getDefaultInstance());
            }
            
            public ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.Builder addSheetInfoListBuilder(final int index) {
                return this.getSheetInfoListFieldBuilder().addBuilder(index, ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.getDefaultInstance());
            }
            
            public List<ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.Builder> getSheetInfoListBuilderList() {
                return this.getSheetInfoListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo, ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.Builder, ActivityShopSheetInfoOuterClass.ActivityShopSheetInfoOrBuilder> getSheetInfoListFieldBuilder() {
                if (this.sheetInfoListBuilder_ == null) {
                    this.sheetInfoListBuilder_ = new RepeatedFieldBuilderV3<ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo, ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.Builder, ActivityShopSheetInfoOuterClass.ActivityShopSheetInfoOrBuilder>(this.sheetInfoList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.sheetInfoList_ = null;
                }
                return this.sheetInfoListBuilder_;
            }
            
            @Override
            public int getShopType() {
                return this.shopType_;
            }
            
            public Builder setShopType(final int value) {
                this.shopType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearShopType() {
                this.shopType_ = 0;
                this.onChanged();
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
    
    public interface GetActivityShopSheetInfoRspOrBuilder extends MessageOrBuilder
    {
        List<ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo> getSheetInfoListList();
        
        ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo getSheetInfoList(final int p0);
        
        int getSheetInfoListCount();
        
        List<? extends ActivityShopSheetInfoOuterClass.ActivityShopSheetInfoOrBuilder> getSheetInfoListOrBuilderList();
        
        ActivityShopSheetInfoOuterClass.ActivityShopSheetInfoOrBuilder getSheetInfoListOrBuilder(final int p0);
        
        int getShopType();
        
        int getRetcode();
    }
}
