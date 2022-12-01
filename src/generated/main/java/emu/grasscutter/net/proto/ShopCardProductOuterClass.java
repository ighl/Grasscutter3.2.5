// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Internal;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Message;
import java.io.InputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ByteString;
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

public final class ShopCardProductOuterClass
{
    private static final Descriptors.Descriptor internal_static_ShopCardProduct_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ShopCardProduct_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ShopCardProduct_ResinCard_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ShopCardProduct_ResinCard_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ShopCardProductOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ShopCardProductOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015ShopCardProduct.proto\u001a\u000fItemParam.proto\"\u00c6\u0002\n\u000fShopCardProduct\u0012\u0012\n\nproduct_id\u0018\u0001 \u0001(\t\u0012\u0012\n\nprice_tier\u0018\u0002 \u0001(\t\u0012\u0012\n\nmcoin_base\u0018\u0003 \u0001(\r\u0012\u0015\n\rhcoin_per_day\u0018\u0004 \u0001(\r\u0012\f\n\u0004days\u0018\u0005 \u0001(\r\u0012\u001a\n\u0012remain_reward_days\u0018\u0006 \u0001(\r\u0012\u0019\n\u0011card_product_type\u0018\u0007 \u0001(\r\u00120\n\nresin_card\u0018e \u0001(\u000b2\u001a.ShopCardProduct.ResinCardH\u0000\u001aV\n\tResinCard\u0012\"\n\u000ebase_item_list\u0018\u0001 \u0003(\u000b2\n.ItemParam\u0012%\n\u0011per_day_item_list\u0018\u0002 \u0003(\u000b2\n.ItemParamB\u0011\n\u000fextra_card_dataB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ShopCardProductOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ItemParamOuterClass.getDescriptor() });
        internal_static_ShopCardProduct_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ShopCardProduct_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ShopCardProductOuterClass.internal_static_ShopCardProduct_descriptor, new String[] { "ProductId", "PriceTier", "McoinBase", "HcoinPerDay", "Days", "RemainRewardDays", "CardProductType", "ResinCard", "ExtraCardData" });
        internal_static_ShopCardProduct_ResinCard_descriptor = ShopCardProductOuterClass.internal_static_ShopCardProduct_descriptor.getNestedTypes().get(0);
        internal_static_ShopCardProduct_ResinCard_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ShopCardProductOuterClass.internal_static_ShopCardProduct_ResinCard_descriptor, new String[] { "BaseItemList", "PerDayItemList" });
        ItemParamOuterClass.getDescriptor();
    }
    
    public static final class ShopCardProduct extends GeneratedMessageV3 implements ShopCardProductOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private int extraCardDataCase_;
        private Object extraCardData_;
        public static final int PRODUCT_ID_FIELD_NUMBER = 1;
        private volatile Object productId_;
        public static final int PRICE_TIER_FIELD_NUMBER = 2;
        private volatile Object priceTier_;
        public static final int MCOIN_BASE_FIELD_NUMBER = 3;
        private int mcoinBase_;
        public static final int HCOIN_PER_DAY_FIELD_NUMBER = 4;
        private int hcoinPerDay_;
        public static final int DAYS_FIELD_NUMBER = 5;
        private int days_;
        public static final int REMAIN_REWARD_DAYS_FIELD_NUMBER = 6;
        private int remainRewardDays_;
        public static final int CARD_PRODUCT_TYPE_FIELD_NUMBER = 7;
        private int cardProductType_;
        public static final int RESIN_CARD_FIELD_NUMBER = 101;
        private byte memoizedIsInitialized;
        private static final ShopCardProduct DEFAULT_INSTANCE;
        private static final Parser<ShopCardProduct> PARSER;
        
        private ShopCardProduct(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.extraCardDataCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        private ShopCardProduct() {
            this.extraCardDataCase_ = 0;
            this.memoizedIsInitialized = -1;
            this.productId_ = "";
            this.priceTier_ = "";
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ShopCardProduct();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ShopCardProduct(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 10: {
                            final String s = input.readStringRequireUtf8();
                            this.productId_ = s;
                            continue;
                        }
                        case 18: {
                            final String s = input.readStringRequireUtf8();
                            this.priceTier_ = s;
                            continue;
                        }
                        case 24: {
                            this.mcoinBase_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.hcoinPerDay_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.days_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.remainRewardDays_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            this.cardProductType_ = input.readUInt32();
                            continue;
                        }
                        case 810: {
                            ResinCard.Builder subBuilder = null;
                            if (this.extraCardDataCase_ == 101) {
                                subBuilder = ((ResinCard)this.extraCardData_).toBuilder();
                            }
                            this.extraCardData_ = input.readMessage(ResinCard.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((ResinCard)this.extraCardData_);
                                this.extraCardData_ = subBuilder.buildPartial();
                            }
                            this.extraCardDataCase_ = 101;
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
            return ShopCardProductOuterClass.internal_static_ShopCardProduct_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ShopCardProductOuterClass.internal_static_ShopCardProduct_fieldAccessorTable.ensureFieldAccessorsInitialized(ShopCardProduct.class, Builder.class);
        }
        
        @Override
        public ExtraCardDataCase getExtraCardDataCase() {
            return ExtraCardDataCase.forNumber(this.extraCardDataCase_);
        }
        
        @Override
        public String getProductId() {
            final Object ref = this.productId_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.productId_ = s);
        }
        
        @Override
        public ByteString getProductIdBytes() {
            final Object ref = this.productId_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.productId_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getPriceTier() {
            final Object ref = this.priceTier_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.priceTier_ = s);
        }
        
        @Override
        public ByteString getPriceTierBytes() {
            final Object ref = this.priceTier_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.priceTier_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public int getMcoinBase() {
            return this.mcoinBase_;
        }
        
        @Override
        public int getHcoinPerDay() {
            return this.hcoinPerDay_;
        }
        
        @Override
        public int getDays() {
            return this.days_;
        }
        
        @Override
        public int getRemainRewardDays() {
            return this.remainRewardDays_;
        }
        
        @Override
        public int getCardProductType() {
            return this.cardProductType_;
        }
        
        @Override
        public boolean hasResinCard() {
            return this.extraCardDataCase_ == 101;
        }
        
        @Override
        public ResinCard getResinCard() {
            if (this.extraCardDataCase_ == 101) {
                return (ResinCard)this.extraCardData_;
            }
            return ResinCard.getDefaultInstance();
        }
        
        @Override
        public ResinCardOrBuilder getResinCardOrBuilder() {
            if (this.extraCardDataCase_ == 101) {
                return (ResinCard)this.extraCardData_;
            }
            return ResinCard.getDefaultInstance();
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
            if (!GeneratedMessageV3.isStringEmpty(this.productId_)) {
                GeneratedMessageV3.writeString(output, 1, this.productId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.priceTier_)) {
                GeneratedMessageV3.writeString(output, 2, this.priceTier_);
            }
            if (this.mcoinBase_ != 0) {
                output.writeUInt32(3, this.mcoinBase_);
            }
            if (this.hcoinPerDay_ != 0) {
                output.writeUInt32(4, this.hcoinPerDay_);
            }
            if (this.days_ != 0) {
                output.writeUInt32(5, this.days_);
            }
            if (this.remainRewardDays_ != 0) {
                output.writeUInt32(6, this.remainRewardDays_);
            }
            if (this.cardProductType_ != 0) {
                output.writeUInt32(7, this.cardProductType_);
            }
            if (this.extraCardDataCase_ == 101) {
                output.writeMessage(101, (MessageLite)this.extraCardData_);
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
            if (!GeneratedMessageV3.isStringEmpty(this.productId_)) {
                size += GeneratedMessageV3.computeStringSize(1, this.productId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.priceTier_)) {
                size += GeneratedMessageV3.computeStringSize(2, this.priceTier_);
            }
            if (this.mcoinBase_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.mcoinBase_);
            }
            if (this.hcoinPerDay_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.hcoinPerDay_);
            }
            if (this.days_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.days_);
            }
            if (this.remainRewardDays_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.remainRewardDays_);
            }
            if (this.cardProductType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.cardProductType_);
            }
            if (this.extraCardDataCase_ == 101) {
                size += CodedOutputStream.computeMessageSize(101, (MessageLite)this.extraCardData_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShopCardProduct)) {
                return super.equals(obj);
            }
            final ShopCardProduct other = (ShopCardProduct)obj;
            if (!this.getProductId().equals(other.getProductId())) {
                return false;
            }
            if (!this.getPriceTier().equals(other.getPriceTier())) {
                return false;
            }
            if (this.getMcoinBase() != other.getMcoinBase()) {
                return false;
            }
            if (this.getHcoinPerDay() != other.getHcoinPerDay()) {
                return false;
            }
            if (this.getDays() != other.getDays()) {
                return false;
            }
            if (this.getRemainRewardDays() != other.getRemainRewardDays()) {
                return false;
            }
            if (this.getCardProductType() != other.getCardProductType()) {
                return false;
            }
            if (!this.getExtraCardDataCase().equals(other.getExtraCardDataCase())) {
                return false;
            }
            switch (this.extraCardDataCase_) {
                case 101: {
                    if (!this.getResinCard().equals(other.getResinCard())) {
                        return false;
                    }
                    break;
                }
            }
            return this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getProductId().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getPriceTier().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getMcoinBase();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getHcoinPerDay();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getDays();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getRemainRewardDays();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getCardProductType();
            switch (this.extraCardDataCase_) {
                case 101: {
                    hash = 37 * hash + 101;
                    hash = 53 * hash + this.getResinCard().hashCode();
                    break;
                }
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ShopCardProduct parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ShopCardProduct.PARSER.parseFrom(data);
        }
        
        public static ShopCardProduct parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ShopCardProduct.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ShopCardProduct parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ShopCardProduct.PARSER.parseFrom(data);
        }
        
        public static ShopCardProduct parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ShopCardProduct.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ShopCardProduct parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ShopCardProduct.PARSER.parseFrom(data);
        }
        
        public static ShopCardProduct parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ShopCardProduct.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ShopCardProduct parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ShopCardProduct.PARSER, input);
        }
        
        public static ShopCardProduct parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ShopCardProduct.PARSER, input, extensionRegistry);
        }
        
        public static ShopCardProduct parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ShopCardProduct.PARSER, input);
        }
        
        public static ShopCardProduct parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ShopCardProduct.PARSER, input, extensionRegistry);
        }
        
        public static ShopCardProduct parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ShopCardProduct.PARSER, input);
        }
        
        public static ShopCardProduct parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ShopCardProduct.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ShopCardProduct.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ShopCardProduct prototype) {
            return ShopCardProduct.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ShopCardProduct.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ShopCardProduct getDefaultInstance() {
            return ShopCardProduct.DEFAULT_INSTANCE;
        }
        
        public static Parser<ShopCardProduct> parser() {
            return ShopCardProduct.PARSER;
        }
        
        @Override
        public Parser<ShopCardProduct> getParserForType() {
            return ShopCardProduct.PARSER;
        }
        
        @Override
        public ShopCardProduct getDefaultInstanceForType() {
            return ShopCardProduct.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ShopCardProduct();
            PARSER = new AbstractParser<ShopCardProduct>() {
                @Override
                public ShopCardProduct parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ShopCardProduct(input, extensionRegistry);
                }
            };
        }
        
        public static final class ResinCard extends GeneratedMessageV3 implements ResinCardOrBuilder
        {
            private static final long serialVersionUID = 0L;
            public static final int BASE_ITEM_LIST_FIELD_NUMBER = 1;
            private List<ItemParamOuterClass.ItemParam> baseItemList_;
            public static final int PER_DAY_ITEM_LIST_FIELD_NUMBER = 2;
            private List<ItemParamOuterClass.ItemParam> perDayItemList_;
            private byte memoizedIsInitialized;
            private static final ResinCard DEFAULT_INSTANCE;
            private static final Parser<ResinCard> PARSER;
            
            private ResinCard(final GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
            }
            
            private ResinCard() {
                this.memoizedIsInitialized = -1;
                this.baseItemList_ = Collections.emptyList();
                this.perDayItemList_ = Collections.emptyList();
            }
            
            @Override
            protected Object newInstance(final UnusedPrivateParameter unused) {
                return new ResinCard();
            }
            
            @Override
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }
            
            private ResinCard(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            case 10: {
                                if ((mutable_bitField0_ & 0x1) == 0x0) {
                                    this.baseItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>();
                                    mutable_bitField0_ |= 0x1;
                                }
                                this.baseItemList_.add(input.readMessage(ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
                                continue;
                            }
                            case 18: {
                                if ((mutable_bitField0_ & 0x2) == 0x0) {
                                    this.perDayItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>();
                                    mutable_bitField0_ |= 0x2;
                                }
                                this.perDayItemList_.add(input.readMessage(ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
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
                        this.baseItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.baseItemList_);
                    }
                    if ((mutable_bitField0_ & 0x2) != 0x0) {
                        this.perDayItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.perDayItemList_);
                    }
                    this.unknownFields = unknownFields.build();
                    this.makeExtensionsImmutable();
                }
            }
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ShopCardProductOuterClass.internal_static_ShopCardProduct_ResinCard_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ShopCardProductOuterClass.internal_static_ShopCardProduct_ResinCard_fieldAccessorTable.ensureFieldAccessorsInitialized(ResinCard.class, Builder.class);
            }
            
            @Override
            public List<ItemParamOuterClass.ItemParam> getBaseItemListList() {
                return this.baseItemList_;
            }
            
            @Override
            public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getBaseItemListOrBuilderList() {
                return this.baseItemList_;
            }
            
            @Override
            public int getBaseItemListCount() {
                return this.baseItemList_.size();
            }
            
            @Override
            public ItemParamOuterClass.ItemParam getBaseItemList(final int index) {
                return this.baseItemList_.get(index);
            }
            
            @Override
            public ItemParamOuterClass.ItemParamOrBuilder getBaseItemListOrBuilder(final int index) {
                return this.baseItemList_.get(index);
            }
            
            @Override
            public List<ItemParamOuterClass.ItemParam> getPerDayItemListList() {
                return this.perDayItemList_;
            }
            
            @Override
            public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getPerDayItemListOrBuilderList() {
                return this.perDayItemList_;
            }
            
            @Override
            public int getPerDayItemListCount() {
                return this.perDayItemList_.size();
            }
            
            @Override
            public ItemParamOuterClass.ItemParam getPerDayItemList(final int index) {
                return this.perDayItemList_.get(index);
            }
            
            @Override
            public ItemParamOuterClass.ItemParamOrBuilder getPerDayItemListOrBuilder(final int index) {
                return this.perDayItemList_.get(index);
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
                for (int i = 0; i < this.baseItemList_.size(); ++i) {
                    output.writeMessage(1, this.baseItemList_.get(i));
                }
                for (int i = 0; i < this.perDayItemList_.size(); ++i) {
                    output.writeMessage(2, this.perDayItemList_.get(i));
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
                for (int i = 0; i < this.baseItemList_.size(); ++i) {
                    size += CodedOutputStream.computeMessageSize(1, this.baseItemList_.get(i));
                }
                for (int i = 0; i < this.perDayItemList_.size(); ++i) {
                    size += CodedOutputStream.computeMessageSize(2, this.perDayItemList_.get(i));
                }
                size += this.unknownFields.getSerializedSize();
                return this.memoizedSize = size;
            }
            
            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ResinCard)) {
                    return super.equals(obj);
                }
                final ResinCard other = (ResinCard)obj;
                return this.getBaseItemListList().equals(other.getBaseItemListList()) && this.getPerDayItemListList().equals(other.getPerDayItemListList()) && this.unknownFields.equals(other.unknownFields);
            }
            
            @Override
            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int hash = 41;
                hash = 19 * hash + getDescriptor().hashCode();
                if (this.getBaseItemListCount() > 0) {
                    hash = 37 * hash + 1;
                    hash = 53 * hash + this.getBaseItemListList().hashCode();
                }
                if (this.getPerDayItemListCount() > 0) {
                    hash = 37 * hash + 2;
                    hash = 53 * hash + this.getPerDayItemListList().hashCode();
                }
                hash = 29 * hash + this.unknownFields.hashCode();
                return this.memoizedHashCode = hash;
            }
            
            public static ResinCard parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
                return ResinCard.PARSER.parseFrom(data);
            }
            
            public static ResinCard parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return ResinCard.PARSER.parseFrom(data, extensionRegistry);
            }
            
            public static ResinCard parseFrom(final ByteString data) throws InvalidProtocolBufferException {
                return ResinCard.PARSER.parseFrom(data);
            }
            
            public static ResinCard parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return ResinCard.PARSER.parseFrom(data, extensionRegistry);
            }
            
            public static ResinCard parseFrom(final byte[] data) throws InvalidProtocolBufferException {
                return ResinCard.PARSER.parseFrom(data);
            }
            
            public static ResinCard parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return ResinCard.PARSER.parseFrom(data, extensionRegistry);
            }
            
            public static ResinCard parseFrom(final InputStream input) throws IOException {
                return GeneratedMessageV3.parseWithIOException(ResinCard.PARSER, input);
            }
            
            public static ResinCard parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageV3.parseWithIOException(ResinCard.PARSER, input, extensionRegistry);
            }
            
            public static ResinCard parseDelimitedFrom(final InputStream input) throws IOException {
                return GeneratedMessageV3.parseDelimitedWithIOException(ResinCard.PARSER, input);
            }
            
            public static ResinCard parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageV3.parseDelimitedWithIOException(ResinCard.PARSER, input, extensionRegistry);
            }
            
            public static ResinCard parseFrom(final CodedInputStream input) throws IOException {
                return GeneratedMessageV3.parseWithIOException(ResinCard.PARSER, input);
            }
            
            public static ResinCard parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageV3.parseWithIOException(ResinCard.PARSER, input, extensionRegistry);
            }
            
            @Override
            public Builder newBuilderForType() {
                return newBuilder();
            }
            
            public static Builder newBuilder() {
                return ResinCard.DEFAULT_INSTANCE.toBuilder();
            }
            
            public static Builder newBuilder(final ResinCard prototype) {
                return ResinCard.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            
            @Override
            public Builder toBuilder() {
                return (this == ResinCard.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
            }
            
            @Override
            protected Builder newBuilderForType(final BuilderParent parent) {
                final Builder builder = new Builder(parent);
                return builder;
            }
            
            public static ResinCard getDefaultInstance() {
                return ResinCard.DEFAULT_INSTANCE;
            }
            
            public static Parser<ResinCard> parser() {
                return ResinCard.PARSER;
            }
            
            @Override
            public Parser<ResinCard> getParserForType() {
                return ResinCard.PARSER;
            }
            
            @Override
            public ResinCard getDefaultInstanceForType() {
                return ResinCard.DEFAULT_INSTANCE;
            }
            
            static {
                DEFAULT_INSTANCE = new ResinCard();
                PARSER = new AbstractParser<ResinCard>() {
                    @Override
                    public ResinCard parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                        return new ResinCard(input, extensionRegistry);
                    }
                };
            }
            
            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ResinCardOrBuilder
            {
                private int bitField0_;
                private List<ItemParamOuterClass.ItemParam> baseItemList_;
                private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> baseItemListBuilder_;
                private List<ItemParamOuterClass.ItemParam> perDayItemList_;
                private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> perDayItemListBuilder_;
                
                public static final Descriptors.Descriptor getDescriptor() {
                    return ShopCardProductOuterClass.internal_static_ShopCardProduct_ResinCard_descriptor;
                }
                
                @Override
                protected FieldAccessorTable internalGetFieldAccessorTable() {
                    return ShopCardProductOuterClass.internal_static_ShopCardProduct_ResinCard_fieldAccessorTable.ensureFieldAccessorsInitialized(ResinCard.class, Builder.class);
                }
                
                private Builder() {
                    this.baseItemList_ = Collections.emptyList();
                    this.perDayItemList_ = Collections.emptyList();
                    this.maybeForceBuilderInitialization();
                }
                
                private Builder(final GeneratedMessageV3.BuilderParent parent) {
                    super(parent);
                    this.baseItemList_ = Collections.emptyList();
                    this.perDayItemList_ = Collections.emptyList();
                    this.maybeForceBuilderInitialization();
                }
                
                private void maybeForceBuilderInitialization() {
                    if (ResinCard.alwaysUseFieldBuilders) {
                        this.getBaseItemListFieldBuilder();
                        this.getPerDayItemListFieldBuilder();
                    }
                }
                
                @Override
                public Builder clear() {
                    super.clear();
                    if (this.baseItemListBuilder_ == null) {
                        this.baseItemList_ = Collections.emptyList();
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.baseItemListBuilder_.clear();
                    }
                    if (this.perDayItemListBuilder_ == null) {
                        this.perDayItemList_ = Collections.emptyList();
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.perDayItemListBuilder_.clear();
                    }
                    return this;
                }
                
                @Override
                public Descriptors.Descriptor getDescriptorForType() {
                    return ShopCardProductOuterClass.internal_static_ShopCardProduct_ResinCard_descriptor;
                }
                
                @Override
                public ResinCard getDefaultInstanceForType() {
                    return ResinCard.getDefaultInstance();
                }
                
                @Override
                public ResinCard build() {
                    final ResinCard result = this.buildPartial();
                    if (!result.isInitialized()) {
                        throw AbstractMessage.Builder.newUninitializedMessageException(result);
                    }
                    return result;
                }
                
                @Override
                public ResinCard buildPartial() {
                    final ResinCard result = new ResinCard(this);
                    final int from_bitField0_ = this.bitField0_;
                    if (this.baseItemListBuilder_ == null) {
                        if ((this.bitField0_ & 0x1) != 0x0) {
                            this.baseItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.baseItemList_);
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        result.baseItemList_ = this.baseItemList_;
                    }
                    else {
                        result.baseItemList_ = this.baseItemListBuilder_.build();
                    }
                    if (this.perDayItemListBuilder_ == null) {
                        if ((this.bitField0_ & 0x2) != 0x0) {
                            this.perDayItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.perDayItemList_);
                            this.bitField0_ &= 0xFFFFFFFD;
                        }
                        result.perDayItemList_ = this.perDayItemList_;
                    }
                    else {
                        result.perDayItemList_ = this.perDayItemListBuilder_.build();
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
                    if (other instanceof ResinCard) {
                        return this.mergeFrom((ResinCard)other);
                    }
                    super.mergeFrom(other);
                    return this;
                }
                
                public Builder mergeFrom(final ResinCard other) {
                    if (other == ResinCard.getDefaultInstance()) {
                        return this;
                    }
                    if (this.baseItemListBuilder_ == null) {
                        if (!other.baseItemList_.isEmpty()) {
                            if (this.baseItemList_.isEmpty()) {
                                this.baseItemList_ = other.baseItemList_;
                                this.bitField0_ &= 0xFFFFFFFE;
                            }
                            else {
                                this.ensureBaseItemListIsMutable();
                                this.baseItemList_.addAll(other.baseItemList_);
                            }
                            this.onChanged();
                        }
                    }
                    else if (!other.baseItemList_.isEmpty()) {
                        if (this.baseItemListBuilder_.isEmpty()) {
                            this.baseItemListBuilder_.dispose();
                            this.baseItemListBuilder_ = null;
                            this.baseItemList_ = other.baseItemList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                            this.baseItemListBuilder_ = (ResinCard.alwaysUseFieldBuilders ? this.getBaseItemListFieldBuilder() : null);
                        }
                        else {
                            this.baseItemListBuilder_.addAllMessages(other.baseItemList_);
                        }
                    }
                    if (this.perDayItemListBuilder_ == null) {
                        if (!other.perDayItemList_.isEmpty()) {
                            if (this.perDayItemList_.isEmpty()) {
                                this.perDayItemList_ = other.perDayItemList_;
                                this.bitField0_ &= 0xFFFFFFFD;
                            }
                            else {
                                this.ensurePerDayItemListIsMutable();
                                this.perDayItemList_.addAll(other.perDayItemList_);
                            }
                            this.onChanged();
                        }
                    }
                    else if (!other.perDayItemList_.isEmpty()) {
                        if (this.perDayItemListBuilder_.isEmpty()) {
                            this.perDayItemListBuilder_.dispose();
                            this.perDayItemListBuilder_ = null;
                            this.perDayItemList_ = other.perDayItemList_;
                            this.bitField0_ &= 0xFFFFFFFD;
                            this.perDayItemListBuilder_ = (ResinCard.alwaysUseFieldBuilders ? this.getPerDayItemListFieldBuilder() : null);
                        }
                        else {
                            this.perDayItemListBuilder_.addAllMessages(other.perDayItemList_);
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
                    ResinCard parsedMessage = null;
                    try {
                        parsedMessage = ResinCard.PARSER.parsePartialFrom(input, extensionRegistry);
                    }
                    catch (InvalidProtocolBufferException e) {
                        parsedMessage = (ResinCard)e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    }
                    finally {
                        if (parsedMessage != null) {
                            this.mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                
                private void ensureBaseItemListIsMutable() {
                    if ((this.bitField0_ & 0x1) == 0x0) {
                        this.baseItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>(this.baseItemList_);
                        this.bitField0_ |= 0x1;
                    }
                }
                
                @Override
                public List<ItemParamOuterClass.ItemParam> getBaseItemListList() {
                    if (this.baseItemListBuilder_ == null) {
                        return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.baseItemList_);
                    }
                    return this.baseItemListBuilder_.getMessageList();
                }
                
                @Override
                public int getBaseItemListCount() {
                    if (this.baseItemListBuilder_ == null) {
                        return this.baseItemList_.size();
                    }
                    return this.baseItemListBuilder_.getCount();
                }
                
                @Override
                public ItemParamOuterClass.ItemParam getBaseItemList(final int index) {
                    if (this.baseItemListBuilder_ == null) {
                        return this.baseItemList_.get(index);
                    }
                    return this.baseItemListBuilder_.getMessage(index);
                }
                
                public Builder setBaseItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                    if (this.baseItemListBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        this.ensureBaseItemListIsMutable();
                        this.baseItemList_.set(index, value);
                        this.onChanged();
                    }
                    else {
                        this.baseItemListBuilder_.setMessage(index, value);
                    }
                    return this;
                }
                
                public Builder setBaseItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                    if (this.baseItemListBuilder_ == null) {
                        this.ensureBaseItemListIsMutable();
                        this.baseItemList_.set(index, builderForValue.build());
                        this.onChanged();
                    }
                    else {
                        this.baseItemListBuilder_.setMessage(index, builderForValue.build());
                    }
                    return this;
                }
                
                public Builder addBaseItemList(final ItemParamOuterClass.ItemParam value) {
                    if (this.baseItemListBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        this.ensureBaseItemListIsMutable();
                        this.baseItemList_.add(value);
                        this.onChanged();
                    }
                    else {
                        this.baseItemListBuilder_.addMessage(value);
                    }
                    return this;
                }
                
                public Builder addBaseItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                    if (this.baseItemListBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        this.ensureBaseItemListIsMutable();
                        this.baseItemList_.add(index, value);
                        this.onChanged();
                    }
                    else {
                        this.baseItemListBuilder_.addMessage(index, value);
                    }
                    return this;
                }
                
                public Builder addBaseItemList(final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                    if (this.baseItemListBuilder_ == null) {
                        this.ensureBaseItemListIsMutable();
                        this.baseItemList_.add(builderForValue.build());
                        this.onChanged();
                    }
                    else {
                        this.baseItemListBuilder_.addMessage(builderForValue.build());
                    }
                    return this;
                }
                
                public Builder addBaseItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                    if (this.baseItemListBuilder_ == null) {
                        this.ensureBaseItemListIsMutable();
                        this.baseItemList_.add(index, builderForValue.build());
                        this.onChanged();
                    }
                    else {
                        this.baseItemListBuilder_.addMessage(index, builderForValue.build());
                    }
                    return this;
                }
                
                public Builder addAllBaseItemList(final Iterable<? extends ItemParamOuterClass.ItemParam> values) {
                    if (this.baseItemListBuilder_ == null) {
                        this.ensureBaseItemListIsMutable();
                        AbstractMessageLite.Builder.addAll(values, this.baseItemList_);
                        this.onChanged();
                    }
                    else {
                        this.baseItemListBuilder_.addAllMessages(values);
                    }
                    return this;
                }
                
                public Builder clearBaseItemList() {
                    if (this.baseItemListBuilder_ == null) {
                        this.baseItemList_ = Collections.emptyList();
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.onChanged();
                    }
                    else {
                        this.baseItemListBuilder_.clear();
                    }
                    return this;
                }
                
                public Builder removeBaseItemList(final int index) {
                    if (this.baseItemListBuilder_ == null) {
                        this.ensureBaseItemListIsMutable();
                        this.baseItemList_.remove(index);
                        this.onChanged();
                    }
                    else {
                        this.baseItemListBuilder_.remove(index);
                    }
                    return this;
                }
                
                public ItemParamOuterClass.ItemParam.Builder getBaseItemListBuilder(final int index) {
                    return this.getBaseItemListFieldBuilder().getBuilder(index);
                }
                
                @Override
                public ItemParamOuterClass.ItemParamOrBuilder getBaseItemListOrBuilder(final int index) {
                    if (this.baseItemListBuilder_ == null) {
                        return this.baseItemList_.get(index);
                    }
                    return this.baseItemListBuilder_.getMessageOrBuilder(index);
                }
                
                @Override
                public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getBaseItemListOrBuilderList() {
                    if (this.baseItemListBuilder_ != null) {
                        return this.baseItemListBuilder_.getMessageOrBuilderList();
                    }
                    return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParamOrBuilder>)this.baseItemList_);
                }
                
                public ItemParamOuterClass.ItemParam.Builder addBaseItemListBuilder() {
                    return this.getBaseItemListFieldBuilder().addBuilder(ItemParamOuterClass.ItemParam.getDefaultInstance());
                }
                
                public ItemParamOuterClass.ItemParam.Builder addBaseItemListBuilder(final int index) {
                    return this.getBaseItemListFieldBuilder().addBuilder(index, ItemParamOuterClass.ItemParam.getDefaultInstance());
                }
                
                public List<ItemParamOuterClass.ItemParam.Builder> getBaseItemListBuilderList() {
                    return this.getBaseItemListFieldBuilder().getBuilderList();
                }
                
                private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> getBaseItemListFieldBuilder() {
                    if (this.baseItemListBuilder_ == null) {
                        this.baseItemListBuilder_ = new RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder>(this.baseItemList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                        this.baseItemList_ = null;
                    }
                    return this.baseItemListBuilder_;
                }
                
                private void ensurePerDayItemListIsMutable() {
                    if ((this.bitField0_ & 0x2) == 0x0) {
                        this.perDayItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>(this.perDayItemList_);
                        this.bitField0_ |= 0x2;
                    }
                }
                
                @Override
                public List<ItemParamOuterClass.ItemParam> getPerDayItemListList() {
                    if (this.perDayItemListBuilder_ == null) {
                        return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.perDayItemList_);
                    }
                    return this.perDayItemListBuilder_.getMessageList();
                }
                
                @Override
                public int getPerDayItemListCount() {
                    if (this.perDayItemListBuilder_ == null) {
                        return this.perDayItemList_.size();
                    }
                    return this.perDayItemListBuilder_.getCount();
                }
                
                @Override
                public ItemParamOuterClass.ItemParam getPerDayItemList(final int index) {
                    if (this.perDayItemListBuilder_ == null) {
                        return this.perDayItemList_.get(index);
                    }
                    return this.perDayItemListBuilder_.getMessage(index);
                }
                
                public Builder setPerDayItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                    if (this.perDayItemListBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        this.ensurePerDayItemListIsMutable();
                        this.perDayItemList_.set(index, value);
                        this.onChanged();
                    }
                    else {
                        this.perDayItemListBuilder_.setMessage(index, value);
                    }
                    return this;
                }
                
                public Builder setPerDayItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                    if (this.perDayItemListBuilder_ == null) {
                        this.ensurePerDayItemListIsMutable();
                        this.perDayItemList_.set(index, builderForValue.build());
                        this.onChanged();
                    }
                    else {
                        this.perDayItemListBuilder_.setMessage(index, builderForValue.build());
                    }
                    return this;
                }
                
                public Builder addPerDayItemList(final ItemParamOuterClass.ItemParam value) {
                    if (this.perDayItemListBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        this.ensurePerDayItemListIsMutable();
                        this.perDayItemList_.add(value);
                        this.onChanged();
                    }
                    else {
                        this.perDayItemListBuilder_.addMessage(value);
                    }
                    return this;
                }
                
                public Builder addPerDayItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                    if (this.perDayItemListBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        this.ensurePerDayItemListIsMutable();
                        this.perDayItemList_.add(index, value);
                        this.onChanged();
                    }
                    else {
                        this.perDayItemListBuilder_.addMessage(index, value);
                    }
                    return this;
                }
                
                public Builder addPerDayItemList(final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                    if (this.perDayItemListBuilder_ == null) {
                        this.ensurePerDayItemListIsMutable();
                        this.perDayItemList_.add(builderForValue.build());
                        this.onChanged();
                    }
                    else {
                        this.perDayItemListBuilder_.addMessage(builderForValue.build());
                    }
                    return this;
                }
                
                public Builder addPerDayItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                    if (this.perDayItemListBuilder_ == null) {
                        this.ensurePerDayItemListIsMutable();
                        this.perDayItemList_.add(index, builderForValue.build());
                        this.onChanged();
                    }
                    else {
                        this.perDayItemListBuilder_.addMessage(index, builderForValue.build());
                    }
                    return this;
                }
                
                public Builder addAllPerDayItemList(final Iterable<? extends ItemParamOuterClass.ItemParam> values) {
                    if (this.perDayItemListBuilder_ == null) {
                        this.ensurePerDayItemListIsMutable();
                        AbstractMessageLite.Builder.addAll(values, this.perDayItemList_);
                        this.onChanged();
                    }
                    else {
                        this.perDayItemListBuilder_.addAllMessages(values);
                    }
                    return this;
                }
                
                public Builder clearPerDayItemList() {
                    if (this.perDayItemListBuilder_ == null) {
                        this.perDayItemList_ = Collections.emptyList();
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.onChanged();
                    }
                    else {
                        this.perDayItemListBuilder_.clear();
                    }
                    return this;
                }
                
                public Builder removePerDayItemList(final int index) {
                    if (this.perDayItemListBuilder_ == null) {
                        this.ensurePerDayItemListIsMutable();
                        this.perDayItemList_.remove(index);
                        this.onChanged();
                    }
                    else {
                        this.perDayItemListBuilder_.remove(index);
                    }
                    return this;
                }
                
                public ItemParamOuterClass.ItemParam.Builder getPerDayItemListBuilder(final int index) {
                    return this.getPerDayItemListFieldBuilder().getBuilder(index);
                }
                
                @Override
                public ItemParamOuterClass.ItemParamOrBuilder getPerDayItemListOrBuilder(final int index) {
                    if (this.perDayItemListBuilder_ == null) {
                        return this.perDayItemList_.get(index);
                    }
                    return this.perDayItemListBuilder_.getMessageOrBuilder(index);
                }
                
                @Override
                public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getPerDayItemListOrBuilderList() {
                    if (this.perDayItemListBuilder_ != null) {
                        return this.perDayItemListBuilder_.getMessageOrBuilderList();
                    }
                    return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParamOrBuilder>)this.perDayItemList_);
                }
                
                public ItemParamOuterClass.ItemParam.Builder addPerDayItemListBuilder() {
                    return this.getPerDayItemListFieldBuilder().addBuilder(ItemParamOuterClass.ItemParam.getDefaultInstance());
                }
                
                public ItemParamOuterClass.ItemParam.Builder addPerDayItemListBuilder(final int index) {
                    return this.getPerDayItemListFieldBuilder().addBuilder(index, ItemParamOuterClass.ItemParam.getDefaultInstance());
                }
                
                public List<ItemParamOuterClass.ItemParam.Builder> getPerDayItemListBuilderList() {
                    return this.getPerDayItemListFieldBuilder().getBuilderList();
                }
                
                private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> getPerDayItemListFieldBuilder() {
                    if (this.perDayItemListBuilder_ == null) {
                        this.perDayItemListBuilder_ = new RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder>(this.perDayItemList_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
                        this.perDayItemList_ = null;
                    }
                    return this.perDayItemListBuilder_;
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
        
        public enum ExtraCardDataCase implements Internal.EnumLite, InternalOneOfEnum
        {
            RESIN_CARD(101), 
            EXTRACARDDATA_NOT_SET(0);
            
            private final int value;
            
            private ExtraCardDataCase(final int value) {
                this.value = value;
            }
            
            @Deprecated
            public static ExtraCardDataCase valueOf(final int value) {
                return forNumber(value);
            }
            
            public static ExtraCardDataCase forNumber(final int value) {
                switch (value) {
                    case 101: {
                        return ExtraCardDataCase.RESIN_CARD;
                    }
                    case 0: {
                        return ExtraCardDataCase.EXTRACARDDATA_NOT_SET;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            @Override
            public int getNumber() {
                return this.value;
            }
            
            private static /* synthetic */ ExtraCardDataCase[] value() {
                return new ExtraCardDataCase[] { ExtraCardDataCase.RESIN_CARD, ExtraCardDataCase.EXTRACARDDATA_NOT_SET };
            }
            
            
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ShopCardProductOrBuilder
        {
            private int extraCardDataCase_;
            private Object extraCardData_;
            private Object productId_;
            private Object priceTier_;
            private int mcoinBase_;
            private int hcoinPerDay_;
            private int days_;
            private int remainRewardDays_;
            private int cardProductType_;
            private SingleFieldBuilderV3<ResinCard, ResinCard.Builder, ResinCardOrBuilder> resinCardBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ShopCardProductOuterClass.internal_static_ShopCardProduct_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ShopCardProductOuterClass.internal_static_ShopCardProduct_fieldAccessorTable.ensureFieldAccessorsInitialized(ShopCardProduct.class, Builder.class);
            }
            
            private Builder() {
                this.extraCardDataCase_ = 0;
                this.productId_ = "";
                this.priceTier_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.extraCardDataCase_ = 0;
                this.productId_ = "";
                this.priceTier_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ShopCardProduct.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.productId_ = "";
                this.priceTier_ = "";
                this.mcoinBase_ = 0;
                this.hcoinPerDay_ = 0;
                this.days_ = 0;
                this.remainRewardDays_ = 0;
                this.cardProductType_ = 0;
                this.extraCardDataCase_ = 0;
                this.extraCardData_ = null;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ShopCardProductOuterClass.internal_static_ShopCardProduct_descriptor;
            }
            
            @Override
            public ShopCardProduct getDefaultInstanceForType() {
                return ShopCardProduct.getDefaultInstance();
            }
            
            @Override
            public ShopCardProduct build() {
                final ShopCardProduct result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ShopCardProduct buildPartial() {
                final ShopCardProduct result = new ShopCardProduct(this);
                result.productId_ = this.productId_;
                result.priceTier_ = this.priceTier_;
                result.mcoinBase_ = this.mcoinBase_;
                result.hcoinPerDay_ = this.hcoinPerDay_;
                result.days_ = this.days_;
                result.remainRewardDays_ = this.remainRewardDays_;
                result.cardProductType_ = this.cardProductType_;
                if (this.extraCardDataCase_ == 101) {
                    if (this.resinCardBuilder_ == null) {
                        result.extraCardData_ = this.extraCardData_;
                    }
                    else {
                        result.extraCardData_ = this.resinCardBuilder_.build();
                    }
                }
                result.extraCardDataCase_ = this.extraCardDataCase_;
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
                if (other instanceof ShopCardProduct) {
                    return this.mergeFrom((ShopCardProduct)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ShopCardProduct other) {
                if (other == ShopCardProduct.getDefaultInstance()) {
                    return this;
                }
                if (!other.getProductId().isEmpty()) {
                    this.productId_ = other.productId_;
                    this.onChanged();
                }
                if (!other.getPriceTier().isEmpty()) {
                    this.priceTier_ = other.priceTier_;
                    this.onChanged();
                }
                if (other.getMcoinBase() != 0) {
                    this.setMcoinBase(other.getMcoinBase());
                }
                if (other.getHcoinPerDay() != 0) {
                    this.setHcoinPerDay(other.getHcoinPerDay());
                }
                if (other.getDays() != 0) {
                    this.setDays(other.getDays());
                }
                if (other.getRemainRewardDays() != 0) {
                    this.setRemainRewardDays(other.getRemainRewardDays());
                }
                if (other.getCardProductType() != 0) {
                    this.setCardProductType(other.getCardProductType());
                }
                switch (other.getExtraCardDataCase()) {
                    case RESIN_CARD: {
                        this.mergeResinCard(other.getResinCard());
                        break;
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
                ShopCardProduct parsedMessage = null;
                try {
                    parsedMessage = ShopCardProduct.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ShopCardProduct)e.getUnfinishedMessage();
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
            public ExtraCardDataCase getExtraCardDataCase() {
                return ExtraCardDataCase.forNumber(this.extraCardDataCase_);
            }
            
            public Builder clearExtraCardData() {
                this.extraCardDataCase_ = 0;
                this.extraCardData_ = null;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getProductId() {
                final Object ref = this.productId_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.productId_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getProductIdBytes() {
                final Object ref = this.productId_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.productId_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setProductId(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.productId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearProductId() {
                this.productId_ = ShopCardProduct.getDefaultInstance().getProductId();
                this.onChanged();
                return this;
            }
            
            public Builder setProductIdBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.productId_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getPriceTier() {
                final Object ref = this.priceTier_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.priceTier_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getPriceTierBytes() {
                final Object ref = this.priceTier_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.priceTier_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setPriceTier(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.priceTier_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPriceTier() {
                this.priceTier_ = ShopCardProduct.getDefaultInstance().getPriceTier();
                this.onChanged();
                return this;
            }
            
            public Builder setPriceTierBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.priceTier_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMcoinBase() {
                return this.mcoinBase_;
            }
            
            public Builder setMcoinBase(final int value) {
                this.mcoinBase_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMcoinBase() {
                this.mcoinBase_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getHcoinPerDay() {
                return this.hcoinPerDay_;
            }
            
            public Builder setHcoinPerDay(final int value) {
                this.hcoinPerDay_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearHcoinPerDay() {
                this.hcoinPerDay_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getDays() {
                return this.days_;
            }
            
            public Builder setDays(final int value) {
                this.days_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDays() {
                this.days_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getRemainRewardDays() {
                return this.remainRewardDays_;
            }
            
            public Builder setRemainRewardDays(final int value) {
                this.remainRewardDays_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRemainRewardDays() {
                this.remainRewardDays_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCardProductType() {
                return this.cardProductType_;
            }
            
            public Builder setCardProductType(final int value) {
                this.cardProductType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCardProductType() {
                this.cardProductType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasResinCard() {
                return this.extraCardDataCase_ == 101;
            }
            
            @Override
            public ResinCard getResinCard() {
                if (this.resinCardBuilder_ == null) {
                    if (this.extraCardDataCase_ == 101) {
                        return (ResinCard)this.extraCardData_;
                    }
                    return ResinCard.getDefaultInstance();
                }
                else {
                    if (this.extraCardDataCase_ == 101) {
                        return this.resinCardBuilder_.getMessage();
                    }
                    return ResinCard.getDefaultInstance();
                }
            }
            
            public Builder setResinCard(final ResinCard value) {
                if (this.resinCardBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.extraCardData_ = value;
                    this.onChanged();
                }
                else {
                    this.resinCardBuilder_.setMessage(value);
                }
                this.extraCardDataCase_ = 101;
                return this;
            }
            
            public Builder setResinCard(final ResinCard.Builder builderForValue) {
                if (this.resinCardBuilder_ == null) {
                    this.extraCardData_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.resinCardBuilder_.setMessage(builderForValue.build());
                }
                this.extraCardDataCase_ = 101;
                return this;
            }
            
            public Builder mergeResinCard(final ResinCard value) {
                if (this.resinCardBuilder_ == null) {
                    if (this.extraCardDataCase_ == 101 && this.extraCardData_ != ResinCard.getDefaultInstance()) {
                        this.extraCardData_ = ResinCard.newBuilder((ResinCard)this.extraCardData_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.extraCardData_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.extraCardDataCase_ == 101) {
                        this.resinCardBuilder_.mergeFrom(value);
                    }
                    this.resinCardBuilder_.setMessage(value);
                }
                this.extraCardDataCase_ = 101;
                return this;
            }
            
            public Builder clearResinCard() {
                if (this.resinCardBuilder_ == null) {
                    if (this.extraCardDataCase_ == 101) {
                        this.extraCardDataCase_ = 0;
                        this.extraCardData_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.extraCardDataCase_ == 101) {
                        this.extraCardDataCase_ = 0;
                        this.extraCardData_ = null;
                    }
                    this.resinCardBuilder_.clear();
                }
                return this;
            }
            
            public ResinCard.Builder getResinCardBuilder() {
                return this.getResinCardFieldBuilder().getBuilder();
            }
            
            @Override
            public ResinCardOrBuilder getResinCardOrBuilder() {
                if (this.extraCardDataCase_ == 101 && this.resinCardBuilder_ != null) {
                    return this.resinCardBuilder_.getMessageOrBuilder();
                }
                if (this.extraCardDataCase_ == 101) {
                    return (ResinCard)this.extraCardData_;
                }
                return ResinCard.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<ResinCard, ResinCard.Builder, ResinCardOrBuilder> getResinCardFieldBuilder() {
                if (this.resinCardBuilder_ == null) {
                    if (this.extraCardDataCase_ != 101) {
                        this.extraCardData_ = ResinCard.getDefaultInstance();
                    }
                    this.resinCardBuilder_ = new SingleFieldBuilderV3<ResinCard, ResinCard.Builder, ResinCardOrBuilder>((ResinCard)this.extraCardData_, this.getParentForChildren(), this.isClean());
                    this.extraCardData_ = null;
                }
                this.extraCardDataCase_ = 101;
                this.onChanged();
                return this.resinCardBuilder_;
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
        
        public interface ResinCardOrBuilder extends MessageOrBuilder
        {
            List<ItemParamOuterClass.ItemParam> getBaseItemListList();
            
            ItemParamOuterClass.ItemParam getBaseItemList(final int p0);
            
            int getBaseItemListCount();
            
            List<? extends ItemParamOuterClass.ItemParamOrBuilder> getBaseItemListOrBuilderList();
            
            ItemParamOuterClass.ItemParamOrBuilder getBaseItemListOrBuilder(final int p0);
            
            List<ItemParamOuterClass.ItemParam> getPerDayItemListList();
            
            ItemParamOuterClass.ItemParam getPerDayItemList(final int p0);
            
            int getPerDayItemListCount();
            
            List<? extends ItemParamOuterClass.ItemParamOrBuilder> getPerDayItemListOrBuilderList();
            
            ItemParamOuterClass.ItemParamOrBuilder getPerDayItemListOrBuilder(final int p0);
        }
    }
    
    public interface ShopCardProductOrBuilder extends MessageOrBuilder
    {
        String getProductId();
        
        ByteString getProductIdBytes();
        
        String getPriceTier();
        
        ByteString getPriceTierBytes();
        
        int getMcoinBase();
        
        int getHcoinPerDay();
        
        int getDays();
        
        int getRemainRewardDays();
        
        int getCardProductType();
        
        boolean hasResinCard();
        
        ShopCardProduct.ResinCard getResinCard();
        
        ShopCardProduct.ResinCardOrBuilder getResinCardOrBuilder();
        
        ShopCardProduct.ExtraCardDataCase getExtraCardDataCase();
    }
}
