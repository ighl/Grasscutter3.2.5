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
import com.google.protobuf.Internal;
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

public final class CombineRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_CombineRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CombineRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CombineRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CombineRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0010CombineRsp.proto\u001a\u000fItemParam.proto\"ª\u0002\n\nCombineRsp\u0012\"\n\u000ecost_item_list\u0018\u0003 \u0003(\u000b2\n.ItemParam\u0012\u000f\n\u0007retcode\u0018\u0007 \u0001(\u0005\u0012)\n\u0015total_extra_item_list\u0018\u0006 \u0003(\u000b2\n.ItemParam\u0012\u0012\n\ncombine_id\u0018\u000b \u0001(\r\u0012*\n\u0016total_random_item_list\u0018\t \u0003(\u000b2\n.ItemParam\u0012$\n\u0010result_item_list\u0018\u0002 \u0003(\u000b2\n.ItemParam\u0012\u0015\n\rcombine_count\u0018\r \u0001(\r\u0012*\n\u0016total_return_item_list\u0018\f \u0003(\u000b2\n.ItemParam\u0012\u0013\n\u000bavatar_guid\u0018\n \u0001(\u0004B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CombineRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ItemParamOuterClass.getDescriptor() });
        internal_static_CombineRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CombineRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CombineRspOuterClass.internal_static_CombineRsp_descriptor, new String[] { "CostItemList", "Retcode", "TotalExtraItemList", "CombineId", "TotalRandomItemList", "ResultItemList", "CombineCount", "TotalReturnItemList", "AvatarGuid" });
        ItemParamOuterClass.getDescriptor();
    }
    
    public static final class CombineRsp extends GeneratedMessageV3 implements CombineRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int COST_ITEM_LIST_FIELD_NUMBER = 3;
        private List<ItemParamOuterClass.ItemParam> costItemList_;
        public static final int RETCODE_FIELD_NUMBER = 7;
        private int retcode_;
        public static final int TOTAL_EXTRA_ITEM_LIST_FIELD_NUMBER = 6;
        private List<ItemParamOuterClass.ItemParam> totalExtraItemList_;
        public static final int COMBINE_ID_FIELD_NUMBER = 11;
        private int combineId_;
        public static final int TOTAL_RANDOM_ITEM_LIST_FIELD_NUMBER = 9;
        private List<ItemParamOuterClass.ItemParam> totalRandomItemList_;
        public static final int RESULT_ITEM_LIST_FIELD_NUMBER = 2;
        private List<ItemParamOuterClass.ItemParam> resultItemList_;
        public static final int COMBINE_COUNT_FIELD_NUMBER = 13;
        private int combineCount_;
        public static final int TOTAL_RETURN_ITEM_LIST_FIELD_NUMBER = 12;
        private List<ItemParamOuterClass.ItemParam> totalReturnItemList_;
        public static final int AVATAR_GUID_FIELD_NUMBER = 10;
        private long avatarGuid_;
        private byte memoizedIsInitialized;
        private static final CombineRsp DEFAULT_INSTANCE;
        private static final Parser<CombineRsp> PARSER;
        
        private CombineRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private CombineRsp() {
            this.memoizedIsInitialized = -1;
            this.costItemList_ = Collections.emptyList();
            this.totalExtraItemList_ = Collections.emptyList();
            this.totalRandomItemList_ = Collections.emptyList();
            this.resultItemList_ = Collections.emptyList();
            this.totalReturnItemList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CombineRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CombineRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 18: {
                            if ((mutable_bitField0_ & 0x8) == 0x0) {
                                this.resultItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>();
                                mutable_bitField0_ |= 0x8;
                            }
                            this.resultItemList_.add(input.readMessage(ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
                            continue;
                        }
                        case 26: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.costItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.costItemList_.add(input.readMessage(ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
                            continue;
                        }
                        case 50: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.totalExtraItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.totalExtraItemList_.add(input.readMessage(ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
                            continue;
                        }
                        case 56: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 74: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.totalRandomItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.totalRandomItemList_.add(input.readMessage(ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
                            continue;
                        }
                        case 80: {
                            this.avatarGuid_ = input.readUInt64();
                            continue;
                        }
                        case 88: {
                            this.combineId_ = input.readUInt32();
                            continue;
                        }
                        case 98: {
                            if ((mutable_bitField0_ & 0x10) == 0x0) {
                                this.totalReturnItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>();
                                mutable_bitField0_ |= 0x10;
                            }
                            this.totalReturnItemList_.add(input.readMessage(ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
                            continue;
                        }
                        case 104: {
                            this.combineCount_ = input.readUInt32();
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
                if ((mutable_bitField0_ & 0x8) != 0x0) {
                    this.resultItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.resultItemList_);
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.costItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.costItemList_);
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.totalExtraItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.totalExtraItemList_);
                }
                if ((mutable_bitField0_ & 0x4) != 0x0) {
                    this.totalRandomItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.totalRandomItemList_);
                }
                if ((mutable_bitField0_ & 0x10) != 0x0) {
                    this.totalReturnItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.totalReturnItemList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return CombineRspOuterClass.internal_static_CombineRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CombineRspOuterClass.internal_static_CombineRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(CombineRsp.class, Builder.class);
        }
        
        @Override
        public List<ItemParamOuterClass.ItemParam> getCostItemListList() {
            return this.costItemList_;
        }
        
        @Override
        public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getCostItemListOrBuilderList() {
            return this.costItemList_;
        }
        
        @Override
        public int getCostItemListCount() {
            return this.costItemList_.size();
        }
        
        @Override
        public ItemParamOuterClass.ItemParam getCostItemList(final int index) {
            return this.costItemList_.get(index);
        }
        
        @Override
        public ItemParamOuterClass.ItemParamOrBuilder getCostItemListOrBuilder(final int index) {
            return this.costItemList_.get(index);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public List<ItemParamOuterClass.ItemParam> getTotalExtraItemListList() {
            return this.totalExtraItemList_;
        }
        
        @Override
        public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getTotalExtraItemListOrBuilderList() {
            return this.totalExtraItemList_;
        }
        
        @Override
        public int getTotalExtraItemListCount() {
            return this.totalExtraItemList_.size();
        }
        
        @Override
        public ItemParamOuterClass.ItemParam getTotalExtraItemList(final int index) {
            return this.totalExtraItemList_.get(index);
        }
        
        @Override
        public ItemParamOuterClass.ItemParamOrBuilder getTotalExtraItemListOrBuilder(final int index) {
            return this.totalExtraItemList_.get(index);
        }
        
        @Override
        public int getCombineId() {
            return this.combineId_;
        }
        
        @Override
        public List<ItemParamOuterClass.ItemParam> getTotalRandomItemListList() {
            return this.totalRandomItemList_;
        }
        
        @Override
        public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getTotalRandomItemListOrBuilderList() {
            return this.totalRandomItemList_;
        }
        
        @Override
        public int getTotalRandomItemListCount() {
            return this.totalRandomItemList_.size();
        }
        
        @Override
        public ItemParamOuterClass.ItemParam getTotalRandomItemList(final int index) {
            return this.totalRandomItemList_.get(index);
        }
        
        @Override
        public ItemParamOuterClass.ItemParamOrBuilder getTotalRandomItemListOrBuilder(final int index) {
            return this.totalRandomItemList_.get(index);
        }
        
        @Override
        public List<ItemParamOuterClass.ItemParam> getResultItemListList() {
            return this.resultItemList_;
        }
        
        @Override
        public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getResultItemListOrBuilderList() {
            return this.resultItemList_;
        }
        
        @Override
        public int getResultItemListCount() {
            return this.resultItemList_.size();
        }
        
        @Override
        public ItemParamOuterClass.ItemParam getResultItemList(final int index) {
            return this.resultItemList_.get(index);
        }
        
        @Override
        public ItemParamOuterClass.ItemParamOrBuilder getResultItemListOrBuilder(final int index) {
            return this.resultItemList_.get(index);
        }
        
        @Override
        public int getCombineCount() {
            return this.combineCount_;
        }
        
        @Override
        public List<ItemParamOuterClass.ItemParam> getTotalReturnItemListList() {
            return this.totalReturnItemList_;
        }
        
        @Override
        public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getTotalReturnItemListOrBuilderList() {
            return this.totalReturnItemList_;
        }
        
        @Override
        public int getTotalReturnItemListCount() {
            return this.totalReturnItemList_.size();
        }
        
        @Override
        public ItemParamOuterClass.ItemParam getTotalReturnItemList(final int index) {
            return this.totalReturnItemList_.get(index);
        }
        
        @Override
        public ItemParamOuterClass.ItemParamOrBuilder getTotalReturnItemListOrBuilder(final int index) {
            return this.totalReturnItemList_.get(index);
        }
        
        @Override
        public long getAvatarGuid() {
            return this.avatarGuid_;
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
            for (int i = 0; i < this.resultItemList_.size(); ++i) {
                output.writeMessage(2, this.resultItemList_.get(i));
            }
            for (int i = 0; i < this.costItemList_.size(); ++i) {
                output.writeMessage(3, this.costItemList_.get(i));
            }
            for (int i = 0; i < this.totalExtraItemList_.size(); ++i) {
                output.writeMessage(6, this.totalExtraItemList_.get(i));
            }
            if (this.retcode_ != 0) {
                output.writeInt32(7, this.retcode_);
            }
            for (int i = 0; i < this.totalRandomItemList_.size(); ++i) {
                output.writeMessage(9, this.totalRandomItemList_.get(i));
            }
            if (this.avatarGuid_ != 0L) {
                output.writeUInt64(10, this.avatarGuid_);
            }
            if (this.combineId_ != 0) {
                output.writeUInt32(11, this.combineId_);
            }
            for (int i = 0; i < this.totalReturnItemList_.size(); ++i) {
                output.writeMessage(12, this.totalReturnItemList_.get(i));
            }
            if (this.combineCount_ != 0) {
                output.writeUInt32(13, this.combineCount_);
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
            for (int i = 0; i < this.resultItemList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(2, this.resultItemList_.get(i));
            }
            for (int i = 0; i < this.costItemList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(3, this.costItemList_.get(i));
            }
            for (int i = 0; i < this.totalExtraItemList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(6, this.totalExtraItemList_.get(i));
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(7, this.retcode_);
            }
            for (int i = 0; i < this.totalRandomItemList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(9, this.totalRandomItemList_.get(i));
            }
            if (this.avatarGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(10, this.avatarGuid_);
            }
            if (this.combineId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.combineId_);
            }
            for (int i = 0; i < this.totalReturnItemList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(12, this.totalReturnItemList_.get(i));
            }
            if (this.combineCount_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.combineCount_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CombineRsp)) {
                return super.equals(obj);
            }
            final CombineRsp other = (CombineRsp)obj;
            return this.getCostItemListList().equals(other.getCostItemListList()) && this.getRetcode() == other.getRetcode() && this.getTotalExtraItemListList().equals(other.getTotalExtraItemListList()) && this.getCombineId() == other.getCombineId() && this.getTotalRandomItemListList().equals(other.getTotalRandomItemListList()) && this.getResultItemListList().equals(other.getResultItemListList()) && this.getCombineCount() == other.getCombineCount() && this.getTotalReturnItemListList().equals(other.getTotalReturnItemListList()) && this.getAvatarGuid() == other.getAvatarGuid() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getCostItemListCount() > 0) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getCostItemListList().hashCode();
            }
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getRetcode();
            if (this.getTotalExtraItemListCount() > 0) {
                hash = 37 * hash + 6;
                hash = 53 * hash + this.getTotalExtraItemListList().hashCode();
            }
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getCombineId();
            if (this.getTotalRandomItemListCount() > 0) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getTotalRandomItemListList().hashCode();
            }
            if (this.getResultItemListCount() > 0) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getResultItemListList().hashCode();
            }
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getCombineCount();
            if (this.getTotalReturnItemListCount() > 0) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getTotalReturnItemListList().hashCode();
            }
            hash = 37 * hash + 10;
            hash = 53 * hash + Internal.hashLong(this.getAvatarGuid());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CombineRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CombineRsp.PARSER.parseFrom(data);
        }
        
        public static CombineRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CombineRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CombineRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CombineRsp.PARSER.parseFrom(data);
        }
        
        public static CombineRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CombineRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CombineRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CombineRsp.PARSER.parseFrom(data);
        }
        
        public static CombineRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CombineRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CombineRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CombineRsp.PARSER, input);
        }
        
        public static CombineRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CombineRsp.PARSER, input, extensionRegistry);
        }
        
        public static CombineRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CombineRsp.PARSER, input);
        }
        
        public static CombineRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CombineRsp.PARSER, input, extensionRegistry);
        }
        
        public static CombineRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CombineRsp.PARSER, input);
        }
        
        public static CombineRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CombineRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CombineRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CombineRsp prototype) {
            return CombineRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CombineRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CombineRsp getDefaultInstance() {
            return CombineRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<CombineRsp> parser() {
            return CombineRsp.PARSER;
        }
        
        @Override
        public Parser<CombineRsp> getParserForType() {
            return CombineRsp.PARSER;
        }
        
        @Override
        public CombineRsp getDefaultInstanceForType() {
            return CombineRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CombineRsp();
            PARSER = new AbstractParser<CombineRsp>() {
                @Override
                public CombineRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CombineRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CombineRspOrBuilder
        {
            private int bitField0_;
            private List<ItemParamOuterClass.ItemParam> costItemList_;
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> costItemListBuilder_;
            private int retcode_;
            private List<ItemParamOuterClass.ItemParam> totalExtraItemList_;
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> totalExtraItemListBuilder_;
            private int combineId_;
            private List<ItemParamOuterClass.ItemParam> totalRandomItemList_;
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> totalRandomItemListBuilder_;
            private List<ItemParamOuterClass.ItemParam> resultItemList_;
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> resultItemListBuilder_;
            private int combineCount_;
            private List<ItemParamOuterClass.ItemParam> totalReturnItemList_;
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> totalReturnItemListBuilder_;
            private long avatarGuid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CombineRspOuterClass.internal_static_CombineRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CombineRspOuterClass.internal_static_CombineRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(CombineRsp.class, Builder.class);
            }
            
            private Builder() {
                this.costItemList_ = Collections.emptyList();
                this.totalExtraItemList_ = Collections.emptyList();
                this.totalRandomItemList_ = Collections.emptyList();
                this.resultItemList_ = Collections.emptyList();
                this.totalReturnItemList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.costItemList_ = Collections.emptyList();
                this.totalExtraItemList_ = Collections.emptyList();
                this.totalRandomItemList_ = Collections.emptyList();
                this.resultItemList_ = Collections.emptyList();
                this.totalReturnItemList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (CombineRsp.alwaysUseFieldBuilders) {
                    this.getCostItemListFieldBuilder();
                    this.getTotalExtraItemListFieldBuilder();
                    this.getTotalRandomItemListFieldBuilder();
                    this.getResultItemListFieldBuilder();
                    this.getTotalReturnItemListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.costItemListBuilder_ == null) {
                    this.costItemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.costItemListBuilder_.clear();
                }
                this.retcode_ = 0;
                if (this.totalExtraItemListBuilder_ == null) {
                    this.totalExtraItemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                else {
                    this.totalExtraItemListBuilder_.clear();
                }
                this.combineId_ = 0;
                if (this.totalRandomItemListBuilder_ == null) {
                    this.totalRandomItemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                else {
                    this.totalRandomItemListBuilder_.clear();
                }
                if (this.resultItemListBuilder_ == null) {
                    this.resultItemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFF7;
                }
                else {
                    this.resultItemListBuilder_.clear();
                }
                this.combineCount_ = 0;
                if (this.totalReturnItemListBuilder_ == null) {
                    this.totalReturnItemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFEF;
                }
                else {
                    this.totalReturnItemListBuilder_.clear();
                }
                this.avatarGuid_ = 0L;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CombineRspOuterClass.internal_static_CombineRsp_descriptor;
            }
            
            @Override
            public CombineRsp getDefaultInstanceForType() {
                return CombineRsp.getDefaultInstance();
            }
            
            @Override
            public CombineRsp build() {
                final CombineRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CombineRsp buildPartial() {
                final CombineRsp result = new CombineRsp(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.costItemListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.costItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.costItemList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.costItemList_ = this.costItemList_;
                }
                else {
                    result.costItemList_ = this.costItemListBuilder_.build();
                }
                result.retcode_ = this.retcode_;
                if (this.totalExtraItemListBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) != 0x0) {
                        this.totalExtraItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.totalExtraItemList_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.totalExtraItemList_ = this.totalExtraItemList_;
                }
                else {
                    result.totalExtraItemList_ = this.totalExtraItemListBuilder_.build();
                }
                result.combineId_ = this.combineId_;
                if (this.totalRandomItemListBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) != 0x0) {
                        this.totalRandomItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.totalRandomItemList_);
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    result.totalRandomItemList_ = this.totalRandomItemList_;
                }
                else {
                    result.totalRandomItemList_ = this.totalRandomItemListBuilder_.build();
                }
                if (this.resultItemListBuilder_ == null) {
                    if ((this.bitField0_ & 0x8) != 0x0) {
                        this.resultItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.resultItemList_);
                        this.bitField0_ &= 0xFFFFFFF7;
                    }
                    result.resultItemList_ = this.resultItemList_;
                }
                else {
                    result.resultItemList_ = this.resultItemListBuilder_.build();
                }
                result.combineCount_ = this.combineCount_;
                if (this.totalReturnItemListBuilder_ == null) {
                    if ((this.bitField0_ & 0x10) != 0x0) {
                        this.totalReturnItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.totalReturnItemList_);
                        this.bitField0_ &= 0xFFFFFFEF;
                    }
                    result.totalReturnItemList_ = this.totalReturnItemList_;
                }
                else {
                    result.totalReturnItemList_ = this.totalReturnItemListBuilder_.build();
                }
                result.avatarGuid_ = this.avatarGuid_;
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
                if (other instanceof CombineRsp) {
                    return this.mergeFrom((CombineRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CombineRsp other) {
                if (other == CombineRsp.getDefaultInstance()) {
                    return this;
                }
                if (this.costItemListBuilder_ == null) {
                    if (!other.costItemList_.isEmpty()) {
                        if (this.costItemList_.isEmpty()) {
                            this.costItemList_ = other.costItemList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureCostItemListIsMutable();
                            this.costItemList_.addAll(other.costItemList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.costItemList_.isEmpty()) {
                    if (this.costItemListBuilder_.isEmpty()) {
                        this.costItemListBuilder_.dispose();
                        this.costItemListBuilder_ = null;
                        this.costItemList_ = other.costItemList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.costItemListBuilder_ = (CombineRsp.alwaysUseFieldBuilders ? this.getCostItemListFieldBuilder() : null);
                    }
                    else {
                        this.costItemListBuilder_.addAllMessages(other.costItemList_);
                    }
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (this.totalExtraItemListBuilder_ == null) {
                    if (!other.totalExtraItemList_.isEmpty()) {
                        if (this.totalExtraItemList_.isEmpty()) {
                            this.totalExtraItemList_ = other.totalExtraItemList_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        }
                        else {
                            this.ensureTotalExtraItemListIsMutable();
                            this.totalExtraItemList_.addAll(other.totalExtraItemList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.totalExtraItemList_.isEmpty()) {
                    if (this.totalExtraItemListBuilder_.isEmpty()) {
                        this.totalExtraItemListBuilder_.dispose();
                        this.totalExtraItemListBuilder_ = null;
                        this.totalExtraItemList_ = other.totalExtraItemList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.totalExtraItemListBuilder_ = (CombineRsp.alwaysUseFieldBuilders ? this.getTotalExtraItemListFieldBuilder() : null);
                    }
                    else {
                        this.totalExtraItemListBuilder_.addAllMessages(other.totalExtraItemList_);
                    }
                }
                if (other.getCombineId() != 0) {
                    this.setCombineId(other.getCombineId());
                }
                if (this.totalRandomItemListBuilder_ == null) {
                    if (!other.totalRandomItemList_.isEmpty()) {
                        if (this.totalRandomItemList_.isEmpty()) {
                            this.totalRandomItemList_ = other.totalRandomItemList_;
                            this.bitField0_ &= 0xFFFFFFFB;
                        }
                        else {
                            this.ensureTotalRandomItemListIsMutable();
                            this.totalRandomItemList_.addAll(other.totalRandomItemList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.totalRandomItemList_.isEmpty()) {
                    if (this.totalRandomItemListBuilder_.isEmpty()) {
                        this.totalRandomItemListBuilder_.dispose();
                        this.totalRandomItemListBuilder_ = null;
                        this.totalRandomItemList_ = other.totalRandomItemList_;
                        this.bitField0_ &= 0xFFFFFFFB;
                        this.totalRandomItemListBuilder_ = (CombineRsp.alwaysUseFieldBuilders ? this.getTotalRandomItemListFieldBuilder() : null);
                    }
                    else {
                        this.totalRandomItemListBuilder_.addAllMessages(other.totalRandomItemList_);
                    }
                }
                if (this.resultItemListBuilder_ == null) {
                    if (!other.resultItemList_.isEmpty()) {
                        if (this.resultItemList_.isEmpty()) {
                            this.resultItemList_ = other.resultItemList_;
                            this.bitField0_ &= 0xFFFFFFF7;
                        }
                        else {
                            this.ensureResultItemListIsMutable();
                            this.resultItemList_.addAll(other.resultItemList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.resultItemList_.isEmpty()) {
                    if (this.resultItemListBuilder_.isEmpty()) {
                        this.resultItemListBuilder_.dispose();
                        this.resultItemListBuilder_ = null;
                        this.resultItemList_ = other.resultItemList_;
                        this.bitField0_ &= 0xFFFFFFF7;
                        this.resultItemListBuilder_ = (CombineRsp.alwaysUseFieldBuilders ? this.getResultItemListFieldBuilder() : null);
                    }
                    else {
                        this.resultItemListBuilder_.addAllMessages(other.resultItemList_);
                    }
                }
                if (other.getCombineCount() != 0) {
                    this.setCombineCount(other.getCombineCount());
                }
                if (this.totalReturnItemListBuilder_ == null) {
                    if (!other.totalReturnItemList_.isEmpty()) {
                        if (this.totalReturnItemList_.isEmpty()) {
                            this.totalReturnItemList_ = other.totalReturnItemList_;
                            this.bitField0_ &= 0xFFFFFFEF;
                        }
                        else {
                            this.ensureTotalReturnItemListIsMutable();
                            this.totalReturnItemList_.addAll(other.totalReturnItemList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.totalReturnItemList_.isEmpty()) {
                    if (this.totalReturnItemListBuilder_.isEmpty()) {
                        this.totalReturnItemListBuilder_.dispose();
                        this.totalReturnItemListBuilder_ = null;
                        this.totalReturnItemList_ = other.totalReturnItemList_;
                        this.bitField0_ &= 0xFFFFFFEF;
                        this.totalReturnItemListBuilder_ = (CombineRsp.alwaysUseFieldBuilders ? this.getTotalReturnItemListFieldBuilder() : null);
                    }
                    else {
                        this.totalReturnItemListBuilder_.addAllMessages(other.totalReturnItemList_);
                    }
                }
                if (other.getAvatarGuid() != 0L) {
                    this.setAvatarGuid(other.getAvatarGuid());
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
                CombineRsp parsedMessage = null;
                try {
                    parsedMessage = CombineRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CombineRsp)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureCostItemListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.costItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>(this.costItemList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<ItemParamOuterClass.ItemParam> getCostItemListList() {
                if (this.costItemListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.costItemList_);
                }
                return this.costItemListBuilder_.getMessageList();
            }
            
            @Override
            public int getCostItemListCount() {
                if (this.costItemListBuilder_ == null) {
                    return this.costItemList_.size();
                }
                return this.costItemListBuilder_.getCount();
            }
            
            @Override
            public ItemParamOuterClass.ItemParam getCostItemList(final int index) {
                if (this.costItemListBuilder_ == null) {
                    return this.costItemList_.get(index);
                }
                return this.costItemListBuilder_.getMessage(index);
            }
            
            public Builder setCostItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.costItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureCostItemListIsMutable();
                    this.costItemList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.costItemListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setCostItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.costItemListBuilder_ == null) {
                    this.ensureCostItemListIsMutable();
                    this.costItemList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.costItemListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addCostItemList(final ItemParamOuterClass.ItemParam value) {
                if (this.costItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureCostItemListIsMutable();
                    this.costItemList_.add(value);
                    this.onChanged();
                }
                else {
                    this.costItemListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addCostItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.costItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureCostItemListIsMutable();
                    this.costItemList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.costItemListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addCostItemList(final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.costItemListBuilder_ == null) {
                    this.ensureCostItemListIsMutable();
                    this.costItemList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.costItemListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addCostItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.costItemListBuilder_ == null) {
                    this.ensureCostItemListIsMutable();
                    this.costItemList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.costItemListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllCostItemList(final Iterable<? extends ItemParamOuterClass.ItemParam> values) {
                if (this.costItemListBuilder_ == null) {
                    this.ensureCostItemListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.costItemList_);
                    this.onChanged();
                }
                else {
                    this.costItemListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearCostItemList() {
                if (this.costItemListBuilder_ == null) {
                    this.costItemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.costItemListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeCostItemList(final int index) {
                if (this.costItemListBuilder_ == null) {
                    this.ensureCostItemListIsMutable();
                    this.costItemList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.costItemListBuilder_.remove(index);
                }
                return this;
            }
            
            public ItemParamOuterClass.ItemParam.Builder getCostItemListBuilder(final int index) {
                return this.getCostItemListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ItemParamOuterClass.ItemParamOrBuilder getCostItemListOrBuilder(final int index) {
                if (this.costItemListBuilder_ == null) {
                    return this.costItemList_.get(index);
                }
                return this.costItemListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getCostItemListOrBuilderList() {
                if (this.costItemListBuilder_ != null) {
                    return this.costItemListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParamOrBuilder>)this.costItemList_);
            }
            
            public ItemParamOuterClass.ItemParam.Builder addCostItemListBuilder() {
                return this.getCostItemListFieldBuilder().addBuilder(ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public ItemParamOuterClass.ItemParam.Builder addCostItemListBuilder(final int index) {
                return this.getCostItemListFieldBuilder().addBuilder(index, ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public List<ItemParamOuterClass.ItemParam.Builder> getCostItemListBuilderList() {
                return this.getCostItemListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> getCostItemListFieldBuilder() {
                if (this.costItemListBuilder_ == null) {
                    this.costItemListBuilder_ = new RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder>(this.costItemList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.costItemList_ = null;
                }
                return this.costItemListBuilder_;
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
            
            private void ensureTotalExtraItemListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.totalExtraItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>(this.totalExtraItemList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<ItemParamOuterClass.ItemParam> getTotalExtraItemListList() {
                if (this.totalExtraItemListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.totalExtraItemList_);
                }
                return this.totalExtraItemListBuilder_.getMessageList();
            }
            
            @Override
            public int getTotalExtraItemListCount() {
                if (this.totalExtraItemListBuilder_ == null) {
                    return this.totalExtraItemList_.size();
                }
                return this.totalExtraItemListBuilder_.getCount();
            }
            
            @Override
            public ItemParamOuterClass.ItemParam getTotalExtraItemList(final int index) {
                if (this.totalExtraItemListBuilder_ == null) {
                    return this.totalExtraItemList_.get(index);
                }
                return this.totalExtraItemListBuilder_.getMessage(index);
            }
            
            public Builder setTotalExtraItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.totalExtraItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTotalExtraItemListIsMutable();
                    this.totalExtraItemList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.totalExtraItemListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setTotalExtraItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.totalExtraItemListBuilder_ == null) {
                    this.ensureTotalExtraItemListIsMutable();
                    this.totalExtraItemList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.totalExtraItemListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addTotalExtraItemList(final ItemParamOuterClass.ItemParam value) {
                if (this.totalExtraItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTotalExtraItemListIsMutable();
                    this.totalExtraItemList_.add(value);
                    this.onChanged();
                }
                else {
                    this.totalExtraItemListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addTotalExtraItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.totalExtraItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTotalExtraItemListIsMutable();
                    this.totalExtraItemList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.totalExtraItemListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addTotalExtraItemList(final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.totalExtraItemListBuilder_ == null) {
                    this.ensureTotalExtraItemListIsMutable();
                    this.totalExtraItemList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.totalExtraItemListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addTotalExtraItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.totalExtraItemListBuilder_ == null) {
                    this.ensureTotalExtraItemListIsMutable();
                    this.totalExtraItemList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.totalExtraItemListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllTotalExtraItemList(final Iterable<? extends ItemParamOuterClass.ItemParam> values) {
                if (this.totalExtraItemListBuilder_ == null) {
                    this.ensureTotalExtraItemListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.totalExtraItemList_);
                    this.onChanged();
                }
                else {
                    this.totalExtraItemListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearTotalExtraItemList() {
                if (this.totalExtraItemListBuilder_ == null) {
                    this.totalExtraItemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    this.onChanged();
                }
                else {
                    this.totalExtraItemListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeTotalExtraItemList(final int index) {
                if (this.totalExtraItemListBuilder_ == null) {
                    this.ensureTotalExtraItemListIsMutable();
                    this.totalExtraItemList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.totalExtraItemListBuilder_.remove(index);
                }
                return this;
            }
            
            public ItemParamOuterClass.ItemParam.Builder getTotalExtraItemListBuilder(final int index) {
                return this.getTotalExtraItemListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ItemParamOuterClass.ItemParamOrBuilder getTotalExtraItemListOrBuilder(final int index) {
                if (this.totalExtraItemListBuilder_ == null) {
                    return this.totalExtraItemList_.get(index);
                }
                return this.totalExtraItemListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getTotalExtraItemListOrBuilderList() {
                if (this.totalExtraItemListBuilder_ != null) {
                    return this.totalExtraItemListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParamOrBuilder>)this.totalExtraItemList_);
            }
            
            public ItemParamOuterClass.ItemParam.Builder addTotalExtraItemListBuilder() {
                return this.getTotalExtraItemListFieldBuilder().addBuilder(ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public ItemParamOuterClass.ItemParam.Builder addTotalExtraItemListBuilder(final int index) {
                return this.getTotalExtraItemListFieldBuilder().addBuilder(index, ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public List<ItemParamOuterClass.ItemParam.Builder> getTotalExtraItemListBuilderList() {
                return this.getTotalExtraItemListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> getTotalExtraItemListFieldBuilder() {
                if (this.totalExtraItemListBuilder_ == null) {
                    this.totalExtraItemListBuilder_ = new RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder>(this.totalExtraItemList_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
                    this.totalExtraItemList_ = null;
                }
                return this.totalExtraItemListBuilder_;
            }
            
            @Override
            public int getCombineId() {
                return this.combineId_;
            }
            
            public Builder setCombineId(final int value) {
                this.combineId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCombineId() {
                this.combineId_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureTotalRandomItemListIsMutable() {
                if ((this.bitField0_ & 0x4) == 0x0) {
                    this.totalRandomItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>(this.totalRandomItemList_);
                    this.bitField0_ |= 0x4;
                }
            }
            
            @Override
            public List<ItemParamOuterClass.ItemParam> getTotalRandomItemListList() {
                if (this.totalRandomItemListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.totalRandomItemList_);
                }
                return this.totalRandomItemListBuilder_.getMessageList();
            }
            
            @Override
            public int getTotalRandomItemListCount() {
                if (this.totalRandomItemListBuilder_ == null) {
                    return this.totalRandomItemList_.size();
                }
                return this.totalRandomItemListBuilder_.getCount();
            }
            
            @Override
            public ItemParamOuterClass.ItemParam getTotalRandomItemList(final int index) {
                if (this.totalRandomItemListBuilder_ == null) {
                    return this.totalRandomItemList_.get(index);
                }
                return this.totalRandomItemListBuilder_.getMessage(index);
            }
            
            public Builder setTotalRandomItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.totalRandomItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTotalRandomItemListIsMutable();
                    this.totalRandomItemList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.totalRandomItemListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setTotalRandomItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.totalRandomItemListBuilder_ == null) {
                    this.ensureTotalRandomItemListIsMutable();
                    this.totalRandomItemList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.totalRandomItemListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addTotalRandomItemList(final ItemParamOuterClass.ItemParam value) {
                if (this.totalRandomItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTotalRandomItemListIsMutable();
                    this.totalRandomItemList_.add(value);
                    this.onChanged();
                }
                else {
                    this.totalRandomItemListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addTotalRandomItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.totalRandomItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTotalRandomItemListIsMutable();
                    this.totalRandomItemList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.totalRandomItemListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addTotalRandomItemList(final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.totalRandomItemListBuilder_ == null) {
                    this.ensureTotalRandomItemListIsMutable();
                    this.totalRandomItemList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.totalRandomItemListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addTotalRandomItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.totalRandomItemListBuilder_ == null) {
                    this.ensureTotalRandomItemListIsMutable();
                    this.totalRandomItemList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.totalRandomItemListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllTotalRandomItemList(final Iterable<? extends ItemParamOuterClass.ItemParam> values) {
                if (this.totalRandomItemListBuilder_ == null) {
                    this.ensureTotalRandomItemListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.totalRandomItemList_);
                    this.onChanged();
                }
                else {
                    this.totalRandomItemListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearTotalRandomItemList() {
                if (this.totalRandomItemListBuilder_ == null) {
                    this.totalRandomItemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                    this.onChanged();
                }
                else {
                    this.totalRandomItemListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeTotalRandomItemList(final int index) {
                if (this.totalRandomItemListBuilder_ == null) {
                    this.ensureTotalRandomItemListIsMutable();
                    this.totalRandomItemList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.totalRandomItemListBuilder_.remove(index);
                }
                return this;
            }
            
            public ItemParamOuterClass.ItemParam.Builder getTotalRandomItemListBuilder(final int index) {
                return this.getTotalRandomItemListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ItemParamOuterClass.ItemParamOrBuilder getTotalRandomItemListOrBuilder(final int index) {
                if (this.totalRandomItemListBuilder_ == null) {
                    return this.totalRandomItemList_.get(index);
                }
                return this.totalRandomItemListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getTotalRandomItemListOrBuilderList() {
                if (this.totalRandomItemListBuilder_ != null) {
                    return this.totalRandomItemListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParamOrBuilder>)this.totalRandomItemList_);
            }
            
            public ItemParamOuterClass.ItemParam.Builder addTotalRandomItemListBuilder() {
                return this.getTotalRandomItemListFieldBuilder().addBuilder(ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public ItemParamOuterClass.ItemParam.Builder addTotalRandomItemListBuilder(final int index) {
                return this.getTotalRandomItemListFieldBuilder().addBuilder(index, ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public List<ItemParamOuterClass.ItemParam.Builder> getTotalRandomItemListBuilderList() {
                return this.getTotalRandomItemListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> getTotalRandomItemListFieldBuilder() {
                if (this.totalRandomItemListBuilder_ == null) {
                    this.totalRandomItemListBuilder_ = new RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder>(this.totalRandomItemList_, (this.bitField0_ & 0x4) != 0x0, this.getParentForChildren(), this.isClean());
                    this.totalRandomItemList_ = null;
                }
                return this.totalRandomItemListBuilder_;
            }
            
            private void ensureResultItemListIsMutable() {
                if ((this.bitField0_ & 0x8) == 0x0) {
                    this.resultItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>(this.resultItemList_);
                    this.bitField0_ |= 0x8;
                }
            }
            
            @Override
            public List<ItemParamOuterClass.ItemParam> getResultItemListList() {
                if (this.resultItemListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.resultItemList_);
                }
                return this.resultItemListBuilder_.getMessageList();
            }
            
            @Override
            public int getResultItemListCount() {
                if (this.resultItemListBuilder_ == null) {
                    return this.resultItemList_.size();
                }
                return this.resultItemListBuilder_.getCount();
            }
            
            @Override
            public ItemParamOuterClass.ItemParam getResultItemList(final int index) {
                if (this.resultItemListBuilder_ == null) {
                    return this.resultItemList_.get(index);
                }
                return this.resultItemListBuilder_.getMessage(index);
            }
            
            public Builder setResultItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.resultItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureResultItemListIsMutable();
                    this.resultItemList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.resultItemListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setResultItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.resultItemListBuilder_ == null) {
                    this.ensureResultItemListIsMutable();
                    this.resultItemList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.resultItemListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addResultItemList(final ItemParamOuterClass.ItemParam value) {
                if (this.resultItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureResultItemListIsMutable();
                    this.resultItemList_.add(value);
                    this.onChanged();
                }
                else {
                    this.resultItemListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addResultItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.resultItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureResultItemListIsMutable();
                    this.resultItemList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.resultItemListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addResultItemList(final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.resultItemListBuilder_ == null) {
                    this.ensureResultItemListIsMutable();
                    this.resultItemList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.resultItemListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addResultItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.resultItemListBuilder_ == null) {
                    this.ensureResultItemListIsMutable();
                    this.resultItemList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.resultItemListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllResultItemList(final Iterable<? extends ItemParamOuterClass.ItemParam> values) {
                if (this.resultItemListBuilder_ == null) {
                    this.ensureResultItemListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.resultItemList_);
                    this.onChanged();
                }
                else {
                    this.resultItemListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearResultItemList() {
                if (this.resultItemListBuilder_ == null) {
                    this.resultItemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFF7;
                    this.onChanged();
                }
                else {
                    this.resultItemListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeResultItemList(final int index) {
                if (this.resultItemListBuilder_ == null) {
                    this.ensureResultItemListIsMutable();
                    this.resultItemList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.resultItemListBuilder_.remove(index);
                }
                return this;
            }
            
            public ItemParamOuterClass.ItemParam.Builder getResultItemListBuilder(final int index) {
                return this.getResultItemListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ItemParamOuterClass.ItemParamOrBuilder getResultItemListOrBuilder(final int index) {
                if (this.resultItemListBuilder_ == null) {
                    return this.resultItemList_.get(index);
                }
                return this.resultItemListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getResultItemListOrBuilderList() {
                if (this.resultItemListBuilder_ != null) {
                    return this.resultItemListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParamOrBuilder>)this.resultItemList_);
            }
            
            public ItemParamOuterClass.ItemParam.Builder addResultItemListBuilder() {
                return this.getResultItemListFieldBuilder().addBuilder(ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public ItemParamOuterClass.ItemParam.Builder addResultItemListBuilder(final int index) {
                return this.getResultItemListFieldBuilder().addBuilder(index, ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public List<ItemParamOuterClass.ItemParam.Builder> getResultItemListBuilderList() {
                return this.getResultItemListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> getResultItemListFieldBuilder() {
                if (this.resultItemListBuilder_ == null) {
                    this.resultItemListBuilder_ = new RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder>(this.resultItemList_, (this.bitField0_ & 0x8) != 0x0, this.getParentForChildren(), this.isClean());
                    this.resultItemList_ = null;
                }
                return this.resultItemListBuilder_;
            }
            
            @Override
            public int getCombineCount() {
                return this.combineCount_;
            }
            
            public Builder setCombineCount(final int value) {
                this.combineCount_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCombineCount() {
                this.combineCount_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureTotalReturnItemListIsMutable() {
                if ((this.bitField0_ & 0x10) == 0x0) {
                    this.totalReturnItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>(this.totalReturnItemList_);
                    this.bitField0_ |= 0x10;
                }
            }
            
            @Override
            public List<ItemParamOuterClass.ItemParam> getTotalReturnItemListList() {
                if (this.totalReturnItemListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.totalReturnItemList_);
                }
                return this.totalReturnItemListBuilder_.getMessageList();
            }
            
            @Override
            public int getTotalReturnItemListCount() {
                if (this.totalReturnItemListBuilder_ == null) {
                    return this.totalReturnItemList_.size();
                }
                return this.totalReturnItemListBuilder_.getCount();
            }
            
            @Override
            public ItemParamOuterClass.ItemParam getTotalReturnItemList(final int index) {
                if (this.totalReturnItemListBuilder_ == null) {
                    return this.totalReturnItemList_.get(index);
                }
                return this.totalReturnItemListBuilder_.getMessage(index);
            }
            
            public Builder setTotalReturnItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.totalReturnItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTotalReturnItemListIsMutable();
                    this.totalReturnItemList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.totalReturnItemListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setTotalReturnItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.totalReturnItemListBuilder_ == null) {
                    this.ensureTotalReturnItemListIsMutable();
                    this.totalReturnItemList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.totalReturnItemListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addTotalReturnItemList(final ItemParamOuterClass.ItemParam value) {
                if (this.totalReturnItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTotalReturnItemListIsMutable();
                    this.totalReturnItemList_.add(value);
                    this.onChanged();
                }
                else {
                    this.totalReturnItemListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addTotalReturnItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.totalReturnItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTotalReturnItemListIsMutable();
                    this.totalReturnItemList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.totalReturnItemListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addTotalReturnItemList(final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.totalReturnItemListBuilder_ == null) {
                    this.ensureTotalReturnItemListIsMutable();
                    this.totalReturnItemList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.totalReturnItemListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addTotalReturnItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.totalReturnItemListBuilder_ == null) {
                    this.ensureTotalReturnItemListIsMutable();
                    this.totalReturnItemList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.totalReturnItemListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllTotalReturnItemList(final Iterable<? extends ItemParamOuterClass.ItemParam> values) {
                if (this.totalReturnItemListBuilder_ == null) {
                    this.ensureTotalReturnItemListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.totalReturnItemList_);
                    this.onChanged();
                }
                else {
                    this.totalReturnItemListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearTotalReturnItemList() {
                if (this.totalReturnItemListBuilder_ == null) {
                    this.totalReturnItemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFEF;
                    this.onChanged();
                }
                else {
                    this.totalReturnItemListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeTotalReturnItemList(final int index) {
                if (this.totalReturnItemListBuilder_ == null) {
                    this.ensureTotalReturnItemListIsMutable();
                    this.totalReturnItemList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.totalReturnItemListBuilder_.remove(index);
                }
                return this;
            }
            
            public ItemParamOuterClass.ItemParam.Builder getTotalReturnItemListBuilder(final int index) {
                return this.getTotalReturnItemListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ItemParamOuterClass.ItemParamOrBuilder getTotalReturnItemListOrBuilder(final int index) {
                if (this.totalReturnItemListBuilder_ == null) {
                    return this.totalReturnItemList_.get(index);
                }
                return this.totalReturnItemListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getTotalReturnItemListOrBuilderList() {
                if (this.totalReturnItemListBuilder_ != null) {
                    return this.totalReturnItemListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParamOrBuilder>)this.totalReturnItemList_);
            }
            
            public ItemParamOuterClass.ItemParam.Builder addTotalReturnItemListBuilder() {
                return this.getTotalReturnItemListFieldBuilder().addBuilder(ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public ItemParamOuterClass.ItemParam.Builder addTotalReturnItemListBuilder(final int index) {
                return this.getTotalReturnItemListFieldBuilder().addBuilder(index, ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public List<ItemParamOuterClass.ItemParam.Builder> getTotalReturnItemListBuilderList() {
                return this.getTotalReturnItemListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> getTotalReturnItemListFieldBuilder() {
                if (this.totalReturnItemListBuilder_ == null) {
                    this.totalReturnItemListBuilder_ = new RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder>(this.totalReturnItemList_, (this.bitField0_ & 0x10) != 0x0, this.getParentForChildren(), this.isClean());
                    this.totalReturnItemList_ = null;
                }
                return this.totalReturnItemListBuilder_;
            }
            
            @Override
            public long getAvatarGuid() {
                return this.avatarGuid_;
            }
            
            public Builder setAvatarGuid(final long value) {
                this.avatarGuid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAvatarGuid() {
                this.avatarGuid_ = 0L;
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
    
    public interface CombineRspOrBuilder extends MessageOrBuilder
    {
        List<ItemParamOuterClass.ItemParam> getCostItemListList();
        
        ItemParamOuterClass.ItemParam getCostItemList(final int p0);
        
        int getCostItemListCount();
        
        List<? extends ItemParamOuterClass.ItemParamOrBuilder> getCostItemListOrBuilderList();
        
        ItemParamOuterClass.ItemParamOrBuilder getCostItemListOrBuilder(final int p0);
        
        int getRetcode();
        
        List<ItemParamOuterClass.ItemParam> getTotalExtraItemListList();
        
        ItemParamOuterClass.ItemParam getTotalExtraItemList(final int p0);
        
        int getTotalExtraItemListCount();
        
        List<? extends ItemParamOuterClass.ItemParamOrBuilder> getTotalExtraItemListOrBuilderList();
        
        ItemParamOuterClass.ItemParamOrBuilder getTotalExtraItemListOrBuilder(final int p0);
        
        int getCombineId();
        
        List<ItemParamOuterClass.ItemParam> getTotalRandomItemListList();
        
        ItemParamOuterClass.ItemParam getTotalRandomItemList(final int p0);
        
        int getTotalRandomItemListCount();
        
        List<? extends ItemParamOuterClass.ItemParamOrBuilder> getTotalRandomItemListOrBuilderList();
        
        ItemParamOuterClass.ItemParamOrBuilder getTotalRandomItemListOrBuilder(final int p0);
        
        List<ItemParamOuterClass.ItemParam> getResultItemListList();
        
        ItemParamOuterClass.ItemParam getResultItemList(final int p0);
        
        int getResultItemListCount();
        
        List<? extends ItemParamOuterClass.ItemParamOrBuilder> getResultItemListOrBuilderList();
        
        ItemParamOuterClass.ItemParamOrBuilder getResultItemListOrBuilder(final int p0);
        
        int getCombineCount();
        
        List<ItemParamOuterClass.ItemParam> getTotalReturnItemListList();
        
        ItemParamOuterClass.ItemParam getTotalReturnItemList(final int p0);
        
        int getTotalReturnItemListCount();
        
        List<? extends ItemParamOuterClass.ItemParamOrBuilder> getTotalReturnItemListOrBuilderList();
        
        ItemParamOuterClass.ItemParamOrBuilder getTotalReturnItemListOrBuilder(final int p0);
        
        long getAvatarGuid();
    }
}
