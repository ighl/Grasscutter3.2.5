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
import com.google.protobuf.Internal;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class ShopGoodsOuterClass
{
    private static final Descriptors.Descriptor internal_static_ShopGoods_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ShopGoods_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ShopGoodsOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ShopGoodsOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u000fShopGoods.proto\u001a\u000fItemParam.proto\"\u00d1\u0003\n\tShopGoods\u0012\u001a\n\u0011discount_end_time\u0018\u0082\u0002 \u0001(\r\u0012\u0011\n\tmin_level\u0018\b \u0001(\r\u0012\u0010\n\bend_time\u0018\u000b \u0001(\r\u0012\"\n\u000ecost_item_list\u0018\u0003 \u0003(\u000b2\n.ItemParam\u0012\u001b\n\u0012secondary_sheet_id\u0018¾\u0002 \u0001(\r\u0012\r\n\u0005hcoin\u0018\u0001 \u0001(\r\u0012\r\n\u0005mcoin\u0018\u000e \u0001(\r\u0012\u0014\n\u000bdiscount_id\u0018\u00ce\u000f \u0001(\r\u0012\u0015\n\fsingle_limit\u0018\u00f7\u0001 \u0001(\r\u0012\u0010\n\bgoods_id\u0018\r \u0001(\r\u0012\u0019\n\u0011next_refresh_time\u0018\u0007 \u0001(\r\u0012\u0011\n\tmax_level\u0018\u0004 \u0001(\r\u0012\u0014\n\fdisable_type\u0018\u0006 \u0001(\r\u0012\u001c\n\u0013discount_begin_time\u0018¾\u0004 \u0001(\r\u0012\u0019\n\u0011pre_goods_id_list\u0018\u0002 \u0003(\r\u0012\u0012\n\nbegin_time\u0018\u0005 \u0001(\r\u0012\r\n\u0005scoin\u0018\u000f \u0001(\r\u0012\u0012\n\nbought_num\u0018\n \u0001(\r\u0012\u0011\n\tbuy_limit\u0018\f \u0001(\r\u0012\u001e\n\ngoods_item\u0018\t \u0001(\u000b2\n.ItemParamB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ShopGoodsOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ItemParamOuterClass.getDescriptor() });
        internal_static_ShopGoods_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ShopGoods_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ShopGoodsOuterClass.internal_static_ShopGoods_descriptor, new String[] { "DiscountEndTime", "MinLevel", "EndTime", "CostItemList", "SecondarySheetId", "Hcoin", "Mcoin", "DiscountId", "SingleLimit", "GoodsId", "NextRefreshTime", "MaxLevel", "DisableType", "DiscountBeginTime", "PreGoodsIdList", "BeginTime", "Scoin", "BoughtNum", "BuyLimit", "GoodsItem" });
        ItemParamOuterClass.getDescriptor();
    }
    
    public static final class ShopGoods extends GeneratedMessageV3 implements ShopGoodsOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int DISCOUNT_END_TIME_FIELD_NUMBER = 258;
        private int discountEndTime_;
        public static final int MIN_LEVEL_FIELD_NUMBER = 8;
        private int minLevel_;
        public static final int END_TIME_FIELD_NUMBER = 11;
        private int endTime_;
        public static final int COST_ITEM_LIST_FIELD_NUMBER = 3;
        private List<ItemParamOuterClass.ItemParam> costItemList_;
        public static final int SECONDARY_SHEET_ID_FIELD_NUMBER = 318;
        private int secondarySheetId_;
        public static final int HCOIN_FIELD_NUMBER = 1;
        private int hcoin_;
        public static final int MCOIN_FIELD_NUMBER = 14;
        private int mcoin_;
        public static final int DISCOUNT_ID_FIELD_NUMBER = 1998;
        private int discountId_;
        public static final int SINGLE_LIMIT_FIELD_NUMBER = 247;
        private int singleLimit_;
        public static final int GOODS_ID_FIELD_NUMBER = 13;
        private int goodsId_;
        public static final int NEXT_REFRESH_TIME_FIELD_NUMBER = 7;
        private int nextRefreshTime_;
        public static final int MAX_LEVEL_FIELD_NUMBER = 4;
        private int maxLevel_;
        public static final int DISABLE_TYPE_FIELD_NUMBER = 6;
        private int disableType_;
        public static final int DISCOUNT_BEGIN_TIME_FIELD_NUMBER = 574;
        private int discountBeginTime_;
        public static final int PRE_GOODS_ID_LIST_FIELD_NUMBER = 2;
        private Internal.IntList preGoodsIdList_;
        private int preGoodsIdListMemoizedSerializedSize;
        public static final int BEGIN_TIME_FIELD_NUMBER = 5;
        private int beginTime_;
        public static final int SCOIN_FIELD_NUMBER = 15;
        private int scoin_;
        public static final int BOUGHT_NUM_FIELD_NUMBER = 10;
        private int boughtNum_;
        public static final int BUY_LIMIT_FIELD_NUMBER = 12;
        private int buyLimit_;
        public static final int GOODS_ITEM_FIELD_NUMBER = 9;
        private ItemParamOuterClass.ItemParam goodsItem_;
        private byte memoizedIsInitialized;
        private static final ShopGoods DEFAULT_INSTANCE;
        private static final Parser<ShopGoods> PARSER;
        
        private ShopGoods(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.preGoodsIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private ShopGoods() {
            this.preGoodsIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.costItemList_ = Collections.emptyList();
            this.preGoodsIdList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ShopGoods();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ShopGoods(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.hcoin_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.preGoodsIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.preGoodsIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 18: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.preGoodsIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.preGoodsIdList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
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
                        case 32: {
                            this.maxLevel_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.beginTime_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.disableType_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            this.nextRefreshTime_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.minLevel_ = input.readUInt32();
                            continue;
                        }
                        case 74: {
                            ItemParamOuterClass.ItemParam.Builder subBuilder = null;
                            if (this.goodsItem_ != null) {
                                subBuilder = this.goodsItem_.toBuilder();
                            }
                            this.goodsItem_ = input.readMessage(ItemParamOuterClass.ItemParam.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.goodsItem_);
                                this.goodsItem_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 80: {
                            this.boughtNum_ = input.readUInt32();
                            continue;
                        }
                        case 88: {
                            this.endTime_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
                            this.buyLimit_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.goodsId_ = input.readUInt32();
                            continue;
                        }
                        case 112: {
                            this.mcoin_ = input.readUInt32();
                            continue;
                        }
                        case 120: {
                            this.scoin_ = input.readUInt32();
                            continue;
                        }
                        case 1976: {
                            this.singleLimit_ = input.readUInt32();
                            continue;
                        }
                        case 2064: {
                            this.discountEndTime_ = input.readUInt32();
                            continue;
                        }
                        case 2544: {
                            this.secondarySheetId_ = input.readUInt32();
                            continue;
                        }
                        case 4592: {
                            this.discountBeginTime_ = input.readUInt32();
                            continue;
                        }
                        case 15984: {
                            this.discountId_ = input.readUInt32();
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
                    this.preGoodsIdList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.costItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.costItemList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ShopGoodsOuterClass.internal_static_ShopGoods_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ShopGoodsOuterClass.internal_static_ShopGoods_fieldAccessorTable.ensureFieldAccessorsInitialized(ShopGoods.class, Builder.class);
        }
        
        @Override
        public int getDiscountEndTime() {
            return this.discountEndTime_;
        }
        
        @Override
        public int getMinLevel() {
            return this.minLevel_;
        }
        
        @Override
        public int getEndTime() {
            return this.endTime_;
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
        public int getSecondarySheetId() {
            return this.secondarySheetId_;
        }
        
        @Override
        public int getHcoin() {
            return this.hcoin_;
        }
        
        @Override
        public int getMcoin() {
            return this.mcoin_;
        }
        
        @Override
        public int getDiscountId() {
            return this.discountId_;
        }
        
        @Override
        public int getSingleLimit() {
            return this.singleLimit_;
        }
        
        @Override
        public int getGoodsId() {
            return this.goodsId_;
        }
        
        @Override
        public int getNextRefreshTime() {
            return this.nextRefreshTime_;
        }
        
        @Override
        public int getMaxLevel() {
            return this.maxLevel_;
        }
        
        @Override
        public int getDisableType() {
            return this.disableType_;
        }
        
        @Override
        public int getDiscountBeginTime() {
            return this.discountBeginTime_;
        }
        
        @Override
        public List<Integer> getPreGoodsIdListList() {
            return this.preGoodsIdList_;
        }
        
        @Override
        public int getPreGoodsIdListCount() {
            return this.preGoodsIdList_.size();
        }
        
        @Override
        public int getPreGoodsIdList(final int index) {
            return this.preGoodsIdList_.getInt(index);
        }
        
        @Override
        public int getBeginTime() {
            return this.beginTime_;
        }
        
        @Override
        public int getScoin() {
            return this.scoin_;
        }
        
        @Override
        public int getBoughtNum() {
            return this.boughtNum_;
        }
        
        @Override
        public int getBuyLimit() {
            return this.buyLimit_;
        }
        
        @Override
        public boolean hasGoodsItem() {
            return this.goodsItem_ != null;
        }
        
        @Override
        public ItemParamOuterClass.ItemParam getGoodsItem() {
            return (this.goodsItem_ == null) ? ItemParamOuterClass.ItemParam.getDefaultInstance() : this.goodsItem_;
        }
        
        @Override
        public ItemParamOuterClass.ItemParamOrBuilder getGoodsItemOrBuilder() {
            return this.getGoodsItem();
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
            if (this.hcoin_ != 0) {
                output.writeUInt32(1, this.hcoin_);
            }
            if (this.getPreGoodsIdListList().size() > 0) {
                output.writeUInt32NoTag(18);
                output.writeUInt32NoTag(this.preGoodsIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.preGoodsIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.preGoodsIdList_.getInt(i));
            }
            for (int i = 0; i < this.costItemList_.size(); ++i) {
                output.writeMessage(3, this.costItemList_.get(i));
            }
            if (this.maxLevel_ != 0) {
                output.writeUInt32(4, this.maxLevel_);
            }
            if (this.beginTime_ != 0) {
                output.writeUInt32(5, this.beginTime_);
            }
            if (this.disableType_ != 0) {
                output.writeUInt32(6, this.disableType_);
            }
            if (this.nextRefreshTime_ != 0) {
                output.writeUInt32(7, this.nextRefreshTime_);
            }
            if (this.minLevel_ != 0) {
                output.writeUInt32(8, this.minLevel_);
            }
            if (this.goodsItem_ != null) {
                output.writeMessage(9, this.getGoodsItem());
            }
            if (this.boughtNum_ != 0) {
                output.writeUInt32(10, this.boughtNum_);
            }
            if (this.endTime_ != 0) {
                output.writeUInt32(11, this.endTime_);
            }
            if (this.buyLimit_ != 0) {
                output.writeUInt32(12, this.buyLimit_);
            }
            if (this.goodsId_ != 0) {
                output.writeUInt32(13, this.goodsId_);
            }
            if (this.mcoin_ != 0) {
                output.writeUInt32(14, this.mcoin_);
            }
            if (this.scoin_ != 0) {
                output.writeUInt32(15, this.scoin_);
            }
            if (this.singleLimit_ != 0) {
                output.writeUInt32(247, this.singleLimit_);
            }
            if (this.discountEndTime_ != 0) {
                output.writeUInt32(258, this.discountEndTime_);
            }
            if (this.secondarySheetId_ != 0) {
                output.writeUInt32(318, this.secondarySheetId_);
            }
            if (this.discountBeginTime_ != 0) {
                output.writeUInt32(574, this.discountBeginTime_);
            }
            if (this.discountId_ != 0) {
                output.writeUInt32(1998, this.discountId_);
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
            if (this.hcoin_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.hcoin_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.preGoodsIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.preGoodsIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getPreGoodsIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.preGoodsIdListMemoizedSerializedSize = dataSize;
            for (int j = 0; j < this.costItemList_.size(); ++j) {
                size += CodedOutputStream.computeMessageSize(3, this.costItemList_.get(j));
            }
            if (this.maxLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.maxLevel_);
            }
            if (this.beginTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.beginTime_);
            }
            if (this.disableType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.disableType_);
            }
            if (this.nextRefreshTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.nextRefreshTime_);
            }
            if (this.minLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.minLevel_);
            }
            if (this.goodsItem_ != null) {
                size += CodedOutputStream.computeMessageSize(9, this.getGoodsItem());
            }
            if (this.boughtNum_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.boughtNum_);
            }
            if (this.endTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.endTime_);
            }
            if (this.buyLimit_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.buyLimit_);
            }
            if (this.goodsId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.goodsId_);
            }
            if (this.mcoin_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.mcoin_);
            }
            if (this.scoin_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.scoin_);
            }
            if (this.singleLimit_ != 0) {
                size += CodedOutputStream.computeUInt32Size(247, this.singleLimit_);
            }
            if (this.discountEndTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(258, this.discountEndTime_);
            }
            if (this.secondarySheetId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(318, this.secondarySheetId_);
            }
            if (this.discountBeginTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(574, this.discountBeginTime_);
            }
            if (this.discountId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1998, this.discountId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShopGoods)) {
                return super.equals(obj);
            }
            final ShopGoods other = (ShopGoods)obj;
            return this.getDiscountEndTime() == other.getDiscountEndTime() && this.getMinLevel() == other.getMinLevel() && this.getEndTime() == other.getEndTime() && this.getCostItemListList().equals(other.getCostItemListList()) && this.getSecondarySheetId() == other.getSecondarySheetId() && this.getHcoin() == other.getHcoin() && this.getMcoin() == other.getMcoin() && this.getDiscountId() == other.getDiscountId() && this.getSingleLimit() == other.getSingleLimit() && this.getGoodsId() == other.getGoodsId() && this.getNextRefreshTime() == other.getNextRefreshTime() && this.getMaxLevel() == other.getMaxLevel() && this.getDisableType() == other.getDisableType() && this.getDiscountBeginTime() == other.getDiscountBeginTime() && this.getPreGoodsIdListList().equals(other.getPreGoodsIdListList()) && this.getBeginTime() == other.getBeginTime() && this.getScoin() == other.getScoin() && this.getBoughtNum() == other.getBoughtNum() && this.getBuyLimit() == other.getBuyLimit() && this.hasGoodsItem() == other.hasGoodsItem() && (!this.hasGoodsItem() || this.getGoodsItem().equals(other.getGoodsItem())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 258;
            hash = 53 * hash + this.getDiscountEndTime();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getMinLevel();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getEndTime();
            if (this.getCostItemListCount() > 0) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getCostItemListList().hashCode();
            }
            hash = 37 * hash + 318;
            hash = 53 * hash + this.getSecondarySheetId();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getHcoin();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getMcoin();
            hash = 37 * hash + 1998;
            hash = 53 * hash + this.getDiscountId();
            hash = 37 * hash + 247;
            hash = 53 * hash + this.getSingleLimit();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getGoodsId();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getNextRefreshTime();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getMaxLevel();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getDisableType();
            hash = 37 * hash + 574;
            hash = 53 * hash + this.getDiscountBeginTime();
            if (this.getPreGoodsIdListCount() > 0) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getPreGoodsIdListList().hashCode();
            }
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getBeginTime();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getScoin();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getBoughtNum();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getBuyLimit();
            if (this.hasGoodsItem()) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getGoodsItem().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ShopGoods parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ShopGoods.PARSER.parseFrom(data);
        }
        
        public static ShopGoods parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ShopGoods.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ShopGoods parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ShopGoods.PARSER.parseFrom(data);
        }
        
        public static ShopGoods parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ShopGoods.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ShopGoods parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ShopGoods.PARSER.parseFrom(data);
        }
        
        public static ShopGoods parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ShopGoods.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ShopGoods parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ShopGoods.PARSER, input);
        }
        
        public static ShopGoods parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ShopGoods.PARSER, input, extensionRegistry);
        }
        
        public static ShopGoods parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ShopGoods.PARSER, input);
        }
        
        public static ShopGoods parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ShopGoods.PARSER, input, extensionRegistry);
        }
        
        public static ShopGoods parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ShopGoods.PARSER, input);
        }
        
        public static ShopGoods parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ShopGoods.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ShopGoods.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ShopGoods prototype) {
            return ShopGoods.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ShopGoods.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ShopGoods getDefaultInstance() {
            return ShopGoods.DEFAULT_INSTANCE;
        }
        
        public static Parser<ShopGoods> parser() {
            return ShopGoods.PARSER;
        }
        
        @Override
        public Parser<ShopGoods> getParserForType() {
            return ShopGoods.PARSER;
        }
        
        @Override
        public ShopGoods getDefaultInstanceForType() {
            return ShopGoods.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ShopGoods();
            PARSER = new AbstractParser<ShopGoods>() {
                @Override
                public ShopGoods parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ShopGoods(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ShopGoodsOrBuilder
        {
            private int bitField0_;
            private int discountEndTime_;
            private int minLevel_;
            private int endTime_;
            private List<ItemParamOuterClass.ItemParam> costItemList_;
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> costItemListBuilder_;
            private int secondarySheetId_;
            private int hcoin_;
            private int mcoin_;
            private int discountId_;
            private int singleLimit_;
            private int goodsId_;
            private int nextRefreshTime_;
            private int maxLevel_;
            private int disableType_;
            private int discountBeginTime_;
            private Internal.IntList preGoodsIdList_;
            private int beginTime_;
            private int scoin_;
            private int boughtNum_;
            private int buyLimit_;
            private ItemParamOuterClass.ItemParam goodsItem_;
            private SingleFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> goodsItemBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ShopGoodsOuterClass.internal_static_ShopGoods_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ShopGoodsOuterClass.internal_static_ShopGoods_fieldAccessorTable.ensureFieldAccessorsInitialized(ShopGoods.class, Builder.class);
            }
            
            private Builder() {
                this.costItemList_ = Collections.emptyList();
                this.preGoodsIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.costItemList_ = Collections.emptyList();
                this.preGoodsIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ShopGoods.alwaysUseFieldBuilders) {
                    this.getCostItemListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.discountEndTime_ = 0;
                this.minLevel_ = 0;
                this.endTime_ = 0;
                if (this.costItemListBuilder_ == null) {
                    this.costItemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.costItemListBuilder_.clear();
                }
                this.secondarySheetId_ = 0;
                this.hcoin_ = 0;
                this.mcoin_ = 0;
                this.discountId_ = 0;
                this.singleLimit_ = 0;
                this.goodsId_ = 0;
                this.nextRefreshTime_ = 0;
                this.maxLevel_ = 0;
                this.disableType_ = 0;
                this.discountBeginTime_ = 0;
                this.preGoodsIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.beginTime_ = 0;
                this.scoin_ = 0;
                this.boughtNum_ = 0;
                this.buyLimit_ = 0;
                if (this.goodsItemBuilder_ == null) {
                    this.goodsItem_ = null;
                }
                else {
                    this.goodsItem_ = null;
                    this.goodsItemBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ShopGoodsOuterClass.internal_static_ShopGoods_descriptor;
            }
            
            @Override
            public ShopGoods getDefaultInstanceForType() {
                return ShopGoods.getDefaultInstance();
            }
            
            @Override
            public ShopGoods build() {
                final ShopGoods result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ShopGoods buildPartial() {
                final ShopGoods result = new ShopGoods(this);
                final int from_bitField0_ = this.bitField0_;
                result.discountEndTime_ = this.discountEndTime_;
                result.minLevel_ = this.minLevel_;
                result.endTime_ = this.endTime_;
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
                result.secondarySheetId_ = this.secondarySheetId_;
                result.hcoin_ = this.hcoin_;
                result.mcoin_ = this.mcoin_;
                result.discountId_ = this.discountId_;
                result.singleLimit_ = this.singleLimit_;
                result.goodsId_ = this.goodsId_;
                result.nextRefreshTime_ = this.nextRefreshTime_;
                result.maxLevel_ = this.maxLevel_;
                result.disableType_ = this.disableType_;
                result.discountBeginTime_ = this.discountBeginTime_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.preGoodsIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.preGoodsIdList_ = this.preGoodsIdList_;
                result.beginTime_ = this.beginTime_;
                result.scoin_ = this.scoin_;
                result.boughtNum_ = this.boughtNum_;
                result.buyLimit_ = this.buyLimit_;
                if (this.goodsItemBuilder_ == null) {
                    result.goodsItem_ = this.goodsItem_;
                }
                else {
                    result.goodsItem_ = this.goodsItemBuilder_.build();
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
                if (other instanceof ShopGoods) {
                    return this.mergeFrom((ShopGoods)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ShopGoods other) {
                if (other == ShopGoods.getDefaultInstance()) {
                    return this;
                }
                if (other.getDiscountEndTime() != 0) {
                    this.setDiscountEndTime(other.getDiscountEndTime());
                }
                if (other.getMinLevel() != 0) {
                    this.setMinLevel(other.getMinLevel());
                }
                if (other.getEndTime() != 0) {
                    this.setEndTime(other.getEndTime());
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
                        this.costItemListBuilder_ = (ShopGoods.alwaysUseFieldBuilders ? this.getCostItemListFieldBuilder() : null);
                    }
                    else {
                        this.costItemListBuilder_.addAllMessages(other.costItemList_);
                    }
                }
                if (other.getSecondarySheetId() != 0) {
                    this.setSecondarySheetId(other.getSecondarySheetId());
                }
                if (other.getHcoin() != 0) {
                    this.setHcoin(other.getHcoin());
                }
                if (other.getMcoin() != 0) {
                    this.setMcoin(other.getMcoin());
                }
                if (other.getDiscountId() != 0) {
                    this.setDiscountId(other.getDiscountId());
                }
                if (other.getSingleLimit() != 0) {
                    this.setSingleLimit(other.getSingleLimit());
                }
                if (other.getGoodsId() != 0) {
                    this.setGoodsId(other.getGoodsId());
                }
                if (other.getNextRefreshTime() != 0) {
                    this.setNextRefreshTime(other.getNextRefreshTime());
                }
                if (other.getMaxLevel() != 0) {
                    this.setMaxLevel(other.getMaxLevel());
                }
                if (other.getDisableType() != 0) {
                    this.setDisableType(other.getDisableType());
                }
                if (other.getDiscountBeginTime() != 0) {
                    this.setDiscountBeginTime(other.getDiscountBeginTime());
                }
                if (!other.preGoodsIdList_.isEmpty()) {
                    if (this.preGoodsIdList_.isEmpty()) {
                        this.preGoodsIdList_ = other.preGoodsIdList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensurePreGoodsIdListIsMutable();
                        this.preGoodsIdList_.addAll(other.preGoodsIdList_);
                    }
                    this.onChanged();
                }
                if (other.getBeginTime() != 0) {
                    this.setBeginTime(other.getBeginTime());
                }
                if (other.getScoin() != 0) {
                    this.setScoin(other.getScoin());
                }
                if (other.getBoughtNum() != 0) {
                    this.setBoughtNum(other.getBoughtNum());
                }
                if (other.getBuyLimit() != 0) {
                    this.setBuyLimit(other.getBuyLimit());
                }
                if (other.hasGoodsItem()) {
                    this.mergeGoodsItem(other.getGoodsItem());
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
                ShopGoods parsedMessage = null;
                try {
                    parsedMessage = ShopGoods.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ShopGoods)e.getUnfinishedMessage();
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
            public int getDiscountEndTime() {
                return this.discountEndTime_;
            }
            
            public Builder setDiscountEndTime(final int value) {
                this.discountEndTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDiscountEndTime() {
                this.discountEndTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMinLevel() {
                return this.minLevel_;
            }
            
            public Builder setMinLevel(final int value) {
                this.minLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMinLevel() {
                this.minLevel_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getEndTime() {
                return this.endTime_;
            }
            
            public Builder setEndTime(final int value) {
                this.endTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEndTime() {
                this.endTime_ = 0;
                this.onChanged();
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
            public int getSecondarySheetId() {
                return this.secondarySheetId_;
            }
            
            public Builder setSecondarySheetId(final int value) {
                this.secondarySheetId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSecondarySheetId() {
                this.secondarySheetId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getHcoin() {
                return this.hcoin_;
            }
            
            public Builder setHcoin(final int value) {
                this.hcoin_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearHcoin() {
                this.hcoin_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMcoin() {
                return this.mcoin_;
            }
            
            public Builder setMcoin(final int value) {
                this.mcoin_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMcoin() {
                this.mcoin_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getDiscountId() {
                return this.discountId_;
            }
            
            public Builder setDiscountId(final int value) {
                this.discountId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDiscountId() {
                this.discountId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getSingleLimit() {
                return this.singleLimit_;
            }
            
            public Builder setSingleLimit(final int value) {
                this.singleLimit_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSingleLimit() {
                this.singleLimit_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getGoodsId() {
                return this.goodsId_;
            }
            
            public Builder setGoodsId(final int value) {
                this.goodsId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGoodsId() {
                this.goodsId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getNextRefreshTime() {
                return this.nextRefreshTime_;
            }
            
            public Builder setNextRefreshTime(final int value) {
                this.nextRefreshTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearNextRefreshTime() {
                this.nextRefreshTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMaxLevel() {
                return this.maxLevel_;
            }
            
            public Builder setMaxLevel(final int value) {
                this.maxLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMaxLevel() {
                this.maxLevel_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getDisableType() {
                return this.disableType_;
            }
            
            public Builder setDisableType(final int value) {
                this.disableType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDisableType() {
                this.disableType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getDiscountBeginTime() {
                return this.discountBeginTime_;
            }
            
            public Builder setDiscountBeginTime(final int value) {
                this.discountBeginTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDiscountBeginTime() {
                this.discountBeginTime_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensurePreGoodsIdListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.preGoodsIdList_ = GeneratedMessageV3.mutableCopy(this.preGoodsIdList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getPreGoodsIdListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.preGoodsIdList_) : this.preGoodsIdList_;
            }
            
            @Override
            public int getPreGoodsIdListCount() {
                return this.preGoodsIdList_.size();
            }
            
            @Override
            public int getPreGoodsIdList(final int index) {
                return this.preGoodsIdList_.getInt(index);
            }
            
            public Builder setPreGoodsIdList(final int index, final int value) {
                this.ensurePreGoodsIdListIsMutable();
                this.preGoodsIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addPreGoodsIdList(final int value) {
                this.ensurePreGoodsIdListIsMutable();
                this.preGoodsIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllPreGoodsIdList(final Iterable<? extends Integer> values) {
                this.ensurePreGoodsIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.preGoodsIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearPreGoodsIdList() {
                this.preGoodsIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getBeginTime() {
                return this.beginTime_;
            }
            
            public Builder setBeginTime(final int value) {
                this.beginTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBeginTime() {
                this.beginTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getScoin() {
                return this.scoin_;
            }
            
            public Builder setScoin(final int value) {
                this.scoin_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearScoin() {
                this.scoin_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getBoughtNum() {
                return this.boughtNum_;
            }
            
            public Builder setBoughtNum(final int value) {
                this.boughtNum_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBoughtNum() {
                this.boughtNum_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getBuyLimit() {
                return this.buyLimit_;
            }
            
            public Builder setBuyLimit(final int value) {
                this.buyLimit_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBuyLimit() {
                this.buyLimit_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasGoodsItem() {
                return this.goodsItemBuilder_ != null || this.goodsItem_ != null;
            }
            
            @Override
            public ItemParamOuterClass.ItemParam getGoodsItem() {
                if (this.goodsItemBuilder_ == null) {
                    return (this.goodsItem_ == null) ? ItemParamOuterClass.ItemParam.getDefaultInstance() : this.goodsItem_;
                }
                return this.goodsItemBuilder_.getMessage();
            }
            
            public Builder setGoodsItem(final ItemParamOuterClass.ItemParam value) {
                if (this.goodsItemBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.goodsItem_ = value;
                    this.onChanged();
                }
                else {
                    this.goodsItemBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setGoodsItem(final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.goodsItemBuilder_ == null) {
                    this.goodsItem_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.goodsItemBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeGoodsItem(final ItemParamOuterClass.ItemParam value) {
                if (this.goodsItemBuilder_ == null) {
                    if (this.goodsItem_ != null) {
                        this.goodsItem_ = ItemParamOuterClass.ItemParam.newBuilder(this.goodsItem_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.goodsItem_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.goodsItemBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearGoodsItem() {
                if (this.goodsItemBuilder_ == null) {
                    this.goodsItem_ = null;
                    this.onChanged();
                }
                else {
                    this.goodsItem_ = null;
                    this.goodsItemBuilder_ = null;
                }
                return this;
            }
            
            public ItemParamOuterClass.ItemParam.Builder getGoodsItemBuilder() {
                this.onChanged();
                return this.getGoodsItemFieldBuilder().getBuilder();
            }
            
            @Override
            public ItemParamOuterClass.ItemParamOrBuilder getGoodsItemOrBuilder() {
                if (this.goodsItemBuilder_ != null) {
                    return this.goodsItemBuilder_.getMessageOrBuilder();
                }
                return (this.goodsItem_ == null) ? ItemParamOuterClass.ItemParam.getDefaultInstance() : this.goodsItem_;
            }
            
            private SingleFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> getGoodsItemFieldBuilder() {
                if (this.goodsItemBuilder_ == null) {
                    this.goodsItemBuilder_ = new SingleFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder>(this.getGoodsItem(), this.getParentForChildren(), this.isClean());
                    this.goodsItem_ = null;
                }
                return this.goodsItemBuilder_;
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
    
    public interface ShopGoodsOrBuilder extends MessageOrBuilder
    {
        int getDiscountEndTime();
        
        int getMinLevel();
        
        int getEndTime();
        
        List<ItemParamOuterClass.ItemParam> getCostItemListList();
        
        ItemParamOuterClass.ItemParam getCostItemList(final int p0);
        
        int getCostItemListCount();
        
        List<? extends ItemParamOuterClass.ItemParamOrBuilder> getCostItemListOrBuilderList();
        
        ItemParamOuterClass.ItemParamOrBuilder getCostItemListOrBuilder(final int p0);
        
        int getSecondarySheetId();
        
        int getHcoin();
        
        int getMcoin();
        
        int getDiscountId();
        
        int getSingleLimit();
        
        int getGoodsId();
        
        int getNextRefreshTime();
        
        int getMaxLevel();
        
        int getDisableType();
        
        int getDiscountBeginTime();
        
        List<Integer> getPreGoodsIdListList();
        
        int getPreGoodsIdListCount();
        
        int getPreGoodsIdList(final int p0);
        
        int getBeginTime();
        
        int getScoin();
        
        int getBoughtNum();
        
        int getBuyLimit();
        
        boolean hasGoodsItem();
        
        ItemParamOuterClass.ItemParam getGoodsItem();
        
        ItemParamOuterClass.ItemParamOrBuilder getGoodsItemOrBuilder();
    }
}
