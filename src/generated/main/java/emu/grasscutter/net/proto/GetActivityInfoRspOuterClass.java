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

public final class GetActivityInfoRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_GetActivityInfoRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GetActivityInfoRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GetActivityInfoRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GetActivityInfoRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018GetActivityInfoRsp.proto\u001a\u0012ActivityInfo.proto\u001a\u0010Uint32Pair.proto\"®\u0001\n\u0012GetActivityInfoRsp\u0012\u000f\n\u0007retcode\u0018\r \u0001(\u0005\u0012)\n\u0012activity_info_list\u0018\u0005 \u0003(\u000b2\r.ActivityInfo\u0012\u001e\n\u0016activated_sale_id_list\u0018\u000b \u0003(\r\u0012<\n'disable_transfer_point_interaction_list\u0018\n \u0003(\u000b2\u000b.Uint32PairB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GetActivityInfoRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ActivityInfoOuterClass.getDescriptor(), Uint32PairOuterClass.getDescriptor() });
        internal_static_GetActivityInfoRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetActivityInfoRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GetActivityInfoRspOuterClass.internal_static_GetActivityInfoRsp_descriptor, new String[] { "Retcode", "ActivityInfoList", "ActivatedSaleIdList", "DisableTransferPointInteractionList" });
        ActivityInfoOuterClass.getDescriptor();
        Uint32PairOuterClass.getDescriptor();
    }
    
    public static final class GetActivityInfoRsp extends GeneratedMessageV3 implements GetActivityInfoRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 13;
        private int retcode_;
        public static final int ACTIVITY_INFO_LIST_FIELD_NUMBER = 5;
        private List<ActivityInfoOuterClass.ActivityInfo> activityInfoList_;
        public static final int ACTIVATED_SALE_ID_LIST_FIELD_NUMBER = 11;
        private Internal.IntList activatedSaleIdList_;
        private int activatedSaleIdListMemoizedSerializedSize;
        public static final int DISABLE_TRANSFER_POINT_INTERACTION_LIST_FIELD_NUMBER = 10;
        private List<Uint32PairOuterClass.Uint32Pair> disableTransferPointInteractionList_;
        private byte memoizedIsInitialized;
        private static final GetActivityInfoRsp DEFAULT_INSTANCE;
        private static final Parser<GetActivityInfoRsp> PARSER;
        
        private GetActivityInfoRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.activatedSaleIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private GetActivityInfoRsp() {
            this.activatedSaleIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.activityInfoList_ = Collections.emptyList();
            this.activatedSaleIdList_ = GeneratedMessageV3.emptyIntList();
            this.disableTransferPointInteractionList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GetActivityInfoRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GetActivityInfoRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 42: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.activityInfoList_ = new ArrayList<ActivityInfoOuterClass.ActivityInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.activityInfoList_.add(input.readMessage(ActivityInfoOuterClass.ActivityInfo.parser(), extensionRegistry));
                            continue;
                        }
                        case 82: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.disableTransferPointInteractionList_ = new ArrayList<Uint32PairOuterClass.Uint32Pair>();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.disableTransferPointInteractionList_.add(input.readMessage(Uint32PairOuterClass.Uint32Pair.parser(), extensionRegistry));
                            continue;
                        }
                        case 88: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.activatedSaleIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.activatedSaleIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 90: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.activatedSaleIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.activatedSaleIdList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
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
                    this.activityInfoList_ = Collections.unmodifiableList((List<? extends ActivityInfoOuterClass.ActivityInfo>)this.activityInfoList_);
                }
                if ((mutable_bitField0_ & 0x4) != 0x0) {
                    this.disableTransferPointInteractionList_ = Collections.unmodifiableList((List<? extends Uint32PairOuterClass.Uint32Pair>)this.disableTransferPointInteractionList_);
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.activatedSaleIdList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return GetActivityInfoRspOuterClass.internal_static_GetActivityInfoRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GetActivityInfoRspOuterClass.internal_static_GetActivityInfoRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetActivityInfoRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public List<ActivityInfoOuterClass.ActivityInfo> getActivityInfoListList() {
            return this.activityInfoList_;
        }
        
        @Override
        public List<? extends ActivityInfoOuterClass.ActivityInfoOrBuilder> getActivityInfoListOrBuilderList() {
            return this.activityInfoList_;
        }
        
        @Override
        public int getActivityInfoListCount() {
            return this.activityInfoList_.size();
        }
        
        @Override
        public ActivityInfoOuterClass.ActivityInfo getActivityInfoList(final int index) {
            return this.activityInfoList_.get(index);
        }
        
        @Override
        public ActivityInfoOuterClass.ActivityInfoOrBuilder getActivityInfoListOrBuilder(final int index) {
            return this.activityInfoList_.get(index);
        }
        
        @Override
        public List<Integer> getActivatedSaleIdListList() {
            return this.activatedSaleIdList_;
        }
        
        @Override
        public int getActivatedSaleIdListCount() {
            return this.activatedSaleIdList_.size();
        }
        
        @Override
        public int getActivatedSaleIdList(final int index) {
            return this.activatedSaleIdList_.getInt(index);
        }
        
        @Override
        public List<Uint32PairOuterClass.Uint32Pair> getDisableTransferPointInteractionListList() {
            return this.disableTransferPointInteractionList_;
        }
        
        @Override
        public List<? extends Uint32PairOuterClass.Uint32PairOrBuilder> getDisableTransferPointInteractionListOrBuilderList() {
            return this.disableTransferPointInteractionList_;
        }
        
        @Override
        public int getDisableTransferPointInteractionListCount() {
            return this.disableTransferPointInteractionList_.size();
        }
        
        @Override
        public Uint32PairOuterClass.Uint32Pair getDisableTransferPointInteractionList(final int index) {
            return this.disableTransferPointInteractionList_.get(index);
        }
        
        @Override
        public Uint32PairOuterClass.Uint32PairOrBuilder getDisableTransferPointInteractionListOrBuilder(final int index) {
            return this.disableTransferPointInteractionList_.get(index);
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
            for (int i = 0; i < this.activityInfoList_.size(); ++i) {
                output.writeMessage(5, this.activityInfoList_.get(i));
            }
            for (int i = 0; i < this.disableTransferPointInteractionList_.size(); ++i) {
                output.writeMessage(10, this.disableTransferPointInteractionList_.get(i));
            }
            if (this.getActivatedSaleIdListList().size() > 0) {
                output.writeUInt32NoTag(90);
                output.writeUInt32NoTag(this.activatedSaleIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.activatedSaleIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.activatedSaleIdList_.getInt(i));
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
            for (int i = 0; i < this.activityInfoList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(5, this.activityInfoList_.get(i));
            }
            for (int i = 0; i < this.disableTransferPointInteractionList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(10, this.disableTransferPointInteractionList_.get(i));
            }
            int dataSize = 0;
            for (int j = 0; j < this.activatedSaleIdList_.size(); ++j) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.activatedSaleIdList_.getInt(j));
            }
            size += dataSize;
            if (!this.getActivatedSaleIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.activatedSaleIdListMemoizedSerializedSize = dataSize;
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
            if (!(obj instanceof GetActivityInfoRsp)) {
                return super.equals(obj);
            }
            final GetActivityInfoRsp other = (GetActivityInfoRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.getActivityInfoListList().equals(other.getActivityInfoListList()) && this.getActivatedSaleIdListList().equals(other.getActivatedSaleIdListList()) && this.getDisableTransferPointInteractionListList().equals(other.getDisableTransferPointInteractionListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getRetcode();
            if (this.getActivityInfoListCount() > 0) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getActivityInfoListList().hashCode();
            }
            if (this.getActivatedSaleIdListCount() > 0) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.getActivatedSaleIdListList().hashCode();
            }
            if (this.getDisableTransferPointInteractionListCount() > 0) {
                hash = 37 * hash + 10;
                hash = 53 * hash + this.getDisableTransferPointInteractionListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GetActivityInfoRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GetActivityInfoRsp.PARSER.parseFrom(data);
        }
        
        public static GetActivityInfoRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetActivityInfoRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetActivityInfoRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GetActivityInfoRsp.PARSER.parseFrom(data);
        }
        
        public static GetActivityInfoRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetActivityInfoRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetActivityInfoRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GetActivityInfoRsp.PARSER.parseFrom(data);
        }
        
        public static GetActivityInfoRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetActivityInfoRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetActivityInfoRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetActivityInfoRsp.PARSER, input);
        }
        
        public static GetActivityInfoRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetActivityInfoRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetActivityInfoRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetActivityInfoRsp.PARSER, input);
        }
        
        public static GetActivityInfoRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetActivityInfoRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetActivityInfoRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetActivityInfoRsp.PARSER, input);
        }
        
        public static GetActivityInfoRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetActivityInfoRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GetActivityInfoRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GetActivityInfoRsp prototype) {
            return GetActivityInfoRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GetActivityInfoRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GetActivityInfoRsp getDefaultInstance() {
            return GetActivityInfoRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<GetActivityInfoRsp> parser() {
            return GetActivityInfoRsp.PARSER;
        }
        
        @Override
        public Parser<GetActivityInfoRsp> getParserForType() {
            return GetActivityInfoRsp.PARSER;
        }
        
        @Override
        public GetActivityInfoRsp getDefaultInstanceForType() {
            return GetActivityInfoRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GetActivityInfoRsp();
            PARSER = new AbstractParser<GetActivityInfoRsp>() {
                @Override
                public GetActivityInfoRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GetActivityInfoRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetActivityInfoRspOrBuilder
        {
            private int bitField0_;
            private int retcode_;
            private List<ActivityInfoOuterClass.ActivityInfo> activityInfoList_;
            private RepeatedFieldBuilderV3<ActivityInfoOuterClass.ActivityInfo, ActivityInfoOuterClass.ActivityInfo.Builder, ActivityInfoOuterClass.ActivityInfoOrBuilder> activityInfoListBuilder_;
            private Internal.IntList activatedSaleIdList_;
            private List<Uint32PairOuterClass.Uint32Pair> disableTransferPointInteractionList_;
            private RepeatedFieldBuilderV3<Uint32PairOuterClass.Uint32Pair, Uint32PairOuterClass.Uint32Pair.Builder, Uint32PairOuterClass.Uint32PairOrBuilder> disableTransferPointInteractionListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GetActivityInfoRspOuterClass.internal_static_GetActivityInfoRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GetActivityInfoRspOuterClass.internal_static_GetActivityInfoRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetActivityInfoRsp.class, Builder.class);
            }
            
            private Builder() {
                this.activityInfoList_ = Collections.emptyList();
                this.activatedSaleIdList_ = GeneratedMessageV3.emptyIntList();
                this.disableTransferPointInteractionList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.activityInfoList_ = Collections.emptyList();
                this.activatedSaleIdList_ = GeneratedMessageV3.emptyIntList();
                this.disableTransferPointInteractionList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GetActivityInfoRsp.alwaysUseFieldBuilders) {
                    this.getActivityInfoListFieldBuilder();
                    this.getDisableTransferPointInteractionListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                if (this.activityInfoListBuilder_ == null) {
                    this.activityInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.activityInfoListBuilder_.clear();
                }
                this.activatedSaleIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                if (this.disableTransferPointInteractionListBuilder_ == null) {
                    this.disableTransferPointInteractionList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                else {
                    this.disableTransferPointInteractionListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GetActivityInfoRspOuterClass.internal_static_GetActivityInfoRsp_descriptor;
            }
            
            @Override
            public GetActivityInfoRsp getDefaultInstanceForType() {
                return GetActivityInfoRsp.getDefaultInstance();
            }
            
            @Override
            public GetActivityInfoRsp build() {
                final GetActivityInfoRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GetActivityInfoRsp buildPartial() {
                final GetActivityInfoRsp result = new GetActivityInfoRsp(this);
                final int from_bitField0_ = this.bitField0_;
                result.retcode_ = this.retcode_;
                if (this.activityInfoListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.activityInfoList_ = Collections.unmodifiableList((List<? extends ActivityInfoOuterClass.ActivityInfo>)this.activityInfoList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.activityInfoList_ = this.activityInfoList_;
                }
                else {
                    result.activityInfoList_ = this.activityInfoListBuilder_.build();
                }
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.activatedSaleIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.activatedSaleIdList_ = this.activatedSaleIdList_;
                if (this.disableTransferPointInteractionListBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) != 0x0) {
                        this.disableTransferPointInteractionList_ = Collections.unmodifiableList((List<? extends Uint32PairOuterClass.Uint32Pair>)this.disableTransferPointInteractionList_);
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    result.disableTransferPointInteractionList_ = this.disableTransferPointInteractionList_;
                }
                else {
                    result.disableTransferPointInteractionList_ = this.disableTransferPointInteractionListBuilder_.build();
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
                if (other instanceof GetActivityInfoRsp) {
                    return this.mergeFrom((GetActivityInfoRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GetActivityInfoRsp other) {
                if (other == GetActivityInfoRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (this.activityInfoListBuilder_ == null) {
                    if (!other.activityInfoList_.isEmpty()) {
                        if (this.activityInfoList_.isEmpty()) {
                            this.activityInfoList_ = other.activityInfoList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureActivityInfoListIsMutable();
                            this.activityInfoList_.addAll(other.activityInfoList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.activityInfoList_.isEmpty()) {
                    if (this.activityInfoListBuilder_.isEmpty()) {
                        this.activityInfoListBuilder_.dispose();
                        this.activityInfoListBuilder_ = null;
                        this.activityInfoList_ = other.activityInfoList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.activityInfoListBuilder_ = (GetActivityInfoRsp.alwaysUseFieldBuilders ? this.getActivityInfoListFieldBuilder() : null);
                    }
                    else {
                        this.activityInfoListBuilder_.addAllMessages(other.activityInfoList_);
                    }
                }
                if (!other.activatedSaleIdList_.isEmpty()) {
                    if (this.activatedSaleIdList_.isEmpty()) {
                        this.activatedSaleIdList_ = other.activatedSaleIdList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureActivatedSaleIdListIsMutable();
                        this.activatedSaleIdList_.addAll(other.activatedSaleIdList_);
                    }
                    this.onChanged();
                }
                if (this.disableTransferPointInteractionListBuilder_ == null) {
                    if (!other.disableTransferPointInteractionList_.isEmpty()) {
                        if (this.disableTransferPointInteractionList_.isEmpty()) {
                            this.disableTransferPointInteractionList_ = other.disableTransferPointInteractionList_;
                            this.bitField0_ &= 0xFFFFFFFB;
                        }
                        else {
                            this.ensureDisableTransferPointInteractionListIsMutable();
                            this.disableTransferPointInteractionList_.addAll(other.disableTransferPointInteractionList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.disableTransferPointInteractionList_.isEmpty()) {
                    if (this.disableTransferPointInteractionListBuilder_.isEmpty()) {
                        this.disableTransferPointInteractionListBuilder_.dispose();
                        this.disableTransferPointInteractionListBuilder_ = null;
                        this.disableTransferPointInteractionList_ = other.disableTransferPointInteractionList_;
                        this.bitField0_ &= 0xFFFFFFFB;
                        this.disableTransferPointInteractionListBuilder_ = (GetActivityInfoRsp.alwaysUseFieldBuilders ? this.getDisableTransferPointInteractionListFieldBuilder() : null);
                    }
                    else {
                        this.disableTransferPointInteractionListBuilder_.addAllMessages(other.disableTransferPointInteractionList_);
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
                GetActivityInfoRsp parsedMessage = null;
                try {
                    parsedMessage = GetActivityInfoRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GetActivityInfoRsp)e.getUnfinishedMessage();
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
            
            private void ensureActivityInfoListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.activityInfoList_ = new ArrayList<ActivityInfoOuterClass.ActivityInfo>(this.activityInfoList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<ActivityInfoOuterClass.ActivityInfo> getActivityInfoListList() {
                if (this.activityInfoListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ActivityInfoOuterClass.ActivityInfo>)this.activityInfoList_);
                }
                return this.activityInfoListBuilder_.getMessageList();
            }
            
            @Override
            public int getActivityInfoListCount() {
                if (this.activityInfoListBuilder_ == null) {
                    return this.activityInfoList_.size();
                }
                return this.activityInfoListBuilder_.getCount();
            }
            
            @Override
            public ActivityInfoOuterClass.ActivityInfo getActivityInfoList(final int index) {
                if (this.activityInfoListBuilder_ == null) {
                    return this.activityInfoList_.get(index);
                }
                return this.activityInfoListBuilder_.getMessage(index);
            }
            
            public Builder setActivityInfoList(final int index, final ActivityInfoOuterClass.ActivityInfo value) {
                if (this.activityInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureActivityInfoListIsMutable();
                    this.activityInfoList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.activityInfoListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setActivityInfoList(final int index, final ActivityInfoOuterClass.ActivityInfo.Builder builderForValue) {
                if (this.activityInfoListBuilder_ == null) {
                    this.ensureActivityInfoListIsMutable();
                    this.activityInfoList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.activityInfoListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addActivityInfoList(final ActivityInfoOuterClass.ActivityInfo value) {
                if (this.activityInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureActivityInfoListIsMutable();
                    this.activityInfoList_.add(value);
                    this.onChanged();
                }
                else {
                    this.activityInfoListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addActivityInfoList(final int index, final ActivityInfoOuterClass.ActivityInfo value) {
                if (this.activityInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureActivityInfoListIsMutable();
                    this.activityInfoList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.activityInfoListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addActivityInfoList(final ActivityInfoOuterClass.ActivityInfo.Builder builderForValue) {
                if (this.activityInfoListBuilder_ == null) {
                    this.ensureActivityInfoListIsMutable();
                    this.activityInfoList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.activityInfoListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addActivityInfoList(final int index, final ActivityInfoOuterClass.ActivityInfo.Builder builderForValue) {
                if (this.activityInfoListBuilder_ == null) {
                    this.ensureActivityInfoListIsMutable();
                    this.activityInfoList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.activityInfoListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllActivityInfoList(final Iterable<? extends ActivityInfoOuterClass.ActivityInfo> values) {
                if (this.activityInfoListBuilder_ == null) {
                    this.ensureActivityInfoListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.activityInfoList_);
                    this.onChanged();
                }
                else {
                    this.activityInfoListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearActivityInfoList() {
                if (this.activityInfoListBuilder_ == null) {
                    this.activityInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.activityInfoListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeActivityInfoList(final int index) {
                if (this.activityInfoListBuilder_ == null) {
                    this.ensureActivityInfoListIsMutable();
                    this.activityInfoList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.activityInfoListBuilder_.remove(index);
                }
                return this;
            }
            
            public ActivityInfoOuterClass.ActivityInfo.Builder getActivityInfoListBuilder(final int index) {
                return this.getActivityInfoListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ActivityInfoOuterClass.ActivityInfoOrBuilder getActivityInfoListOrBuilder(final int index) {
                if (this.activityInfoListBuilder_ == null) {
                    return this.activityInfoList_.get(index);
                }
                return this.activityInfoListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ActivityInfoOuterClass.ActivityInfoOrBuilder> getActivityInfoListOrBuilderList() {
                if (this.activityInfoListBuilder_ != null) {
                    return this.activityInfoListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ActivityInfoOuterClass.ActivityInfoOrBuilder>)this.activityInfoList_);
            }
            
            public ActivityInfoOuterClass.ActivityInfo.Builder addActivityInfoListBuilder() {
                return this.getActivityInfoListFieldBuilder().addBuilder(ActivityInfoOuterClass.ActivityInfo.getDefaultInstance());
            }
            
            public ActivityInfoOuterClass.ActivityInfo.Builder addActivityInfoListBuilder(final int index) {
                return this.getActivityInfoListFieldBuilder().addBuilder(index, ActivityInfoOuterClass.ActivityInfo.getDefaultInstance());
            }
            
            public List<ActivityInfoOuterClass.ActivityInfo.Builder> getActivityInfoListBuilderList() {
                return this.getActivityInfoListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ActivityInfoOuterClass.ActivityInfo, ActivityInfoOuterClass.ActivityInfo.Builder, ActivityInfoOuterClass.ActivityInfoOrBuilder> getActivityInfoListFieldBuilder() {
                if (this.activityInfoListBuilder_ == null) {
                    this.activityInfoListBuilder_ = new RepeatedFieldBuilderV3<ActivityInfoOuterClass.ActivityInfo, ActivityInfoOuterClass.ActivityInfo.Builder, ActivityInfoOuterClass.ActivityInfoOrBuilder>(this.activityInfoList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.activityInfoList_ = null;
                }
                return this.activityInfoListBuilder_;
            }
            
            private void ensureActivatedSaleIdListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.activatedSaleIdList_ = GeneratedMessageV3.mutableCopy(this.activatedSaleIdList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getActivatedSaleIdListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.activatedSaleIdList_) : this.activatedSaleIdList_;
            }
            
            @Override
            public int getActivatedSaleIdListCount() {
                return this.activatedSaleIdList_.size();
            }
            
            @Override
            public int getActivatedSaleIdList(final int index) {
                return this.activatedSaleIdList_.getInt(index);
            }
            
            public Builder setActivatedSaleIdList(final int index, final int value) {
                this.ensureActivatedSaleIdListIsMutable();
                this.activatedSaleIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addActivatedSaleIdList(final int value) {
                this.ensureActivatedSaleIdListIsMutable();
                this.activatedSaleIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllActivatedSaleIdList(final Iterable<? extends Integer> values) {
                this.ensureActivatedSaleIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.activatedSaleIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearActivatedSaleIdList() {
                this.activatedSaleIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
                return this;
            }
            
            private void ensureDisableTransferPointInteractionListIsMutable() {
                if ((this.bitField0_ & 0x4) == 0x0) {
                    this.disableTransferPointInteractionList_ = new ArrayList<Uint32PairOuterClass.Uint32Pair>(this.disableTransferPointInteractionList_);
                    this.bitField0_ |= 0x4;
                }
            }
            
            @Override
            public List<Uint32PairOuterClass.Uint32Pair> getDisableTransferPointInteractionListList() {
                if (this.disableTransferPointInteractionListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends Uint32PairOuterClass.Uint32Pair>)this.disableTransferPointInteractionList_);
                }
                return this.disableTransferPointInteractionListBuilder_.getMessageList();
            }
            
            @Override
            public int getDisableTransferPointInteractionListCount() {
                if (this.disableTransferPointInteractionListBuilder_ == null) {
                    return this.disableTransferPointInteractionList_.size();
                }
                return this.disableTransferPointInteractionListBuilder_.getCount();
            }
            
            @Override
            public Uint32PairOuterClass.Uint32Pair getDisableTransferPointInteractionList(final int index) {
                if (this.disableTransferPointInteractionListBuilder_ == null) {
                    return this.disableTransferPointInteractionList_.get(index);
                }
                return this.disableTransferPointInteractionListBuilder_.getMessage(index);
            }
            
            public Builder setDisableTransferPointInteractionList(final int index, final Uint32PairOuterClass.Uint32Pair value) {
                if (this.disableTransferPointInteractionListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDisableTransferPointInteractionListIsMutable();
                    this.disableTransferPointInteractionList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.disableTransferPointInteractionListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setDisableTransferPointInteractionList(final int index, final Uint32PairOuterClass.Uint32Pair.Builder builderForValue) {
                if (this.disableTransferPointInteractionListBuilder_ == null) {
                    this.ensureDisableTransferPointInteractionListIsMutable();
                    this.disableTransferPointInteractionList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.disableTransferPointInteractionListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addDisableTransferPointInteractionList(final Uint32PairOuterClass.Uint32Pair value) {
                if (this.disableTransferPointInteractionListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDisableTransferPointInteractionListIsMutable();
                    this.disableTransferPointInteractionList_.add(value);
                    this.onChanged();
                }
                else {
                    this.disableTransferPointInteractionListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addDisableTransferPointInteractionList(final int index, final Uint32PairOuterClass.Uint32Pair value) {
                if (this.disableTransferPointInteractionListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDisableTransferPointInteractionListIsMutable();
                    this.disableTransferPointInteractionList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.disableTransferPointInteractionListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addDisableTransferPointInteractionList(final Uint32PairOuterClass.Uint32Pair.Builder builderForValue) {
                if (this.disableTransferPointInteractionListBuilder_ == null) {
                    this.ensureDisableTransferPointInteractionListIsMutable();
                    this.disableTransferPointInteractionList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.disableTransferPointInteractionListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addDisableTransferPointInteractionList(final int index, final Uint32PairOuterClass.Uint32Pair.Builder builderForValue) {
                if (this.disableTransferPointInteractionListBuilder_ == null) {
                    this.ensureDisableTransferPointInteractionListIsMutable();
                    this.disableTransferPointInteractionList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.disableTransferPointInteractionListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllDisableTransferPointInteractionList(final Iterable<? extends Uint32PairOuterClass.Uint32Pair> values) {
                if (this.disableTransferPointInteractionListBuilder_ == null) {
                    this.ensureDisableTransferPointInteractionListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.disableTransferPointInteractionList_);
                    this.onChanged();
                }
                else {
                    this.disableTransferPointInteractionListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearDisableTransferPointInteractionList() {
                if (this.disableTransferPointInteractionListBuilder_ == null) {
                    this.disableTransferPointInteractionList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                    this.onChanged();
                }
                else {
                    this.disableTransferPointInteractionListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeDisableTransferPointInteractionList(final int index) {
                if (this.disableTransferPointInteractionListBuilder_ == null) {
                    this.ensureDisableTransferPointInteractionListIsMutable();
                    this.disableTransferPointInteractionList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.disableTransferPointInteractionListBuilder_.remove(index);
                }
                return this;
            }
            
            public Uint32PairOuterClass.Uint32Pair.Builder getDisableTransferPointInteractionListBuilder(final int index) {
                return this.getDisableTransferPointInteractionListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public Uint32PairOuterClass.Uint32PairOrBuilder getDisableTransferPointInteractionListOrBuilder(final int index) {
                if (this.disableTransferPointInteractionListBuilder_ == null) {
                    return this.disableTransferPointInteractionList_.get(index);
                }
                return this.disableTransferPointInteractionListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends Uint32PairOuterClass.Uint32PairOrBuilder> getDisableTransferPointInteractionListOrBuilderList() {
                if (this.disableTransferPointInteractionListBuilder_ != null) {
                    return this.disableTransferPointInteractionListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends Uint32PairOuterClass.Uint32PairOrBuilder>)this.disableTransferPointInteractionList_);
            }
            
            public Uint32PairOuterClass.Uint32Pair.Builder addDisableTransferPointInteractionListBuilder() {
                return this.getDisableTransferPointInteractionListFieldBuilder().addBuilder(Uint32PairOuterClass.Uint32Pair.getDefaultInstance());
            }
            
            public Uint32PairOuterClass.Uint32Pair.Builder addDisableTransferPointInteractionListBuilder(final int index) {
                return this.getDisableTransferPointInteractionListFieldBuilder().addBuilder(index, Uint32PairOuterClass.Uint32Pair.getDefaultInstance());
            }
            
            public List<Uint32PairOuterClass.Uint32Pair.Builder> getDisableTransferPointInteractionListBuilderList() {
                return this.getDisableTransferPointInteractionListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<Uint32PairOuterClass.Uint32Pair, Uint32PairOuterClass.Uint32Pair.Builder, Uint32PairOuterClass.Uint32PairOrBuilder> getDisableTransferPointInteractionListFieldBuilder() {
                if (this.disableTransferPointInteractionListBuilder_ == null) {
                    this.disableTransferPointInteractionListBuilder_ = new RepeatedFieldBuilderV3<Uint32PairOuterClass.Uint32Pair, Uint32PairOuterClass.Uint32Pair.Builder, Uint32PairOuterClass.Uint32PairOrBuilder>(this.disableTransferPointInteractionList_, (this.bitField0_ & 0x4) != 0x0, this.getParentForChildren(), this.isClean());
                    this.disableTransferPointInteractionList_ = null;
                }
                return this.disableTransferPointInteractionListBuilder_;
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
    
    public interface GetActivityInfoRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        List<ActivityInfoOuterClass.ActivityInfo> getActivityInfoListList();
        
        ActivityInfoOuterClass.ActivityInfo getActivityInfoList(final int p0);
        
        int getActivityInfoListCount();
        
        List<? extends ActivityInfoOuterClass.ActivityInfoOrBuilder> getActivityInfoListOrBuilderList();
        
        ActivityInfoOuterClass.ActivityInfoOrBuilder getActivityInfoListOrBuilder(final int p0);
        
        List<Integer> getActivatedSaleIdListList();
        
        int getActivatedSaleIdListCount();
        
        int getActivatedSaleIdList(final int p0);
        
        List<Uint32PairOuterClass.Uint32Pair> getDisableTransferPointInteractionListList();
        
        Uint32PairOuterClass.Uint32Pair getDisableTransferPointInteractionList(final int p0);
        
        int getDisableTransferPointInteractionListCount();
        
        List<? extends Uint32PairOuterClass.Uint32PairOrBuilder> getDisableTransferPointInteractionListOrBuilderList();
        
        Uint32PairOuterClass.Uint32PairOrBuilder getDisableTransferPointInteractionListOrBuilder(final int p0);
    }
}
